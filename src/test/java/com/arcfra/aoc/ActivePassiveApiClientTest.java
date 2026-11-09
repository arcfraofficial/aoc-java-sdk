package com.arcfra.aoc;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import okhttp3.Call;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ActivePassiveApiClientTest {
    private final ThreadLocal<List<HttpServer>> servers =
            new ThreadLocal<List<HttpServer>>() {
                @Override
                protected List<HttpServer> initialValue() {
                    return new ArrayList<HttpServer>();
                }
            };

    @AfterMethod
    public void stopServers() {
        List<HttpServer> currentServers = servers.get();
        for (HttpServer server : currentServers) {
            server.stop(0);
        }
        currentServers.clear();
        servers.remove();
    }

    @Test
    public void defaultStrategyDiscoversAndCachesActiveEndpoint() throws Exception {
        CountingHandler passiveHandler = new CountingHandler(307, 500, "passive");
        String passive = startServer(passiveHandler);
        CountingHandler activeHandler = new CountingHandler(200, 200, "active");
        String active = startServer(activeHandler);
        ActivePassiveApiClient client = new ActivePassiveApiClient(passive, active);

        ApiResponse<String> first = client.execute(testCall(client), String.class);
        ApiResponse<String> second = client.execute(testCall(client), String.class);

        assertThat(first.getData()).isEqualTo("active");
        assertThat(second.getData()).isEqualTo("active");
        assertThat(client.getCurrentActiveRootUrl()).isEqualTo(active);
        assertThat(passiveHandler.probeCount.get()).isEqualTo(1);
        assertThat(activeHandler.probeCount.get()).isEqualTo(1);
        assertThat(passiveHandler.requestCount.get()).isZero();
        assertThat(activeHandler.requestCount.get()).isEqualTo(2);
    }

    @Test
    public void defaultStrategyReprobesAndRetriesOnceOn307() throws Exception {
        AtomicBoolean switched = new AtomicBoolean(false);
        String stale =
                startServer(
                        new HttpHandler() {
                            @Override
                            public void handle(HttpExchange exchange) throws IOException {
                                if ("/api/healthz".equals(exchange.getRequestURI().getPath())) {
                                    write(exchange, switched.get() ? 307 : 200, "");
                                    return;
                                }
                                if ("/v2/api/test".equals(exchange.getRequestURI().getPath())) {
                                    switched.set(true);
                                    exchange.getResponseHeaders().set("Location", "/ignored");
                                    write(exchange, 307, "");
                                    return;
                                }
                                write(exchange, 404, "");
                            }
                        });
        CountingHandler activeHandler =
                new CountingHandler(307, 200, "active") {
                    @Override
                    int healthzStatus() {
                        return switched.get() ? 200 : 307;
                    }
                };
        String active = startServer(activeHandler);
        ActivePassiveApiClient client = new ActivePassiveApiClient(stale, active);

        ApiResponse<String> response = client.execute(testCall(client), String.class);

        assertThat(response.getData()).isEqualTo("active");
        assertThat(client.getCurrentActiveRootUrl()).isEqualTo(active);
        assertThat(activeHandler.requestCount.get()).isEqualTo(1);
    }

    @Test
    public void activePassiveInterceptorRunsBeforeUserInterceptorsOnRetry() throws Exception {
        AtomicBoolean switched = new AtomicBoolean(false);
        String stale =
                startServer(
                        new HttpHandler() {
                            @Override
                            public void handle(HttpExchange exchange) throws IOException {
                                if ("/api/healthz".equals(exchange.getRequestURI().getPath())) {
                                    write(exchange, switched.get() ? 307 : 200, "");
                                    return;
                                }
                                if ("/v2/api/test".equals(exchange.getRequestURI().getPath())) {
                                    switched.set(true);
                                    write(exchange, 307, "");
                                    return;
                                }
                                write(exchange, 404, "");
                            }
                        });
        CountingHandler activeHandler =
                new CountingHandler(307, 200, "active") {
                    @Override
                    int healthzStatus() {
                        return switched.get() ? 200 : 307;
                    }
                };
        String active = startServer(activeHandler);
        final List<String> seenRequestEndpoints = new ArrayList<String>();
        OkHttpClient httpClient =
                new OkHttpClient.Builder()
                        .addInterceptor(
                                new Interceptor() {
                                    @Override
                                    public Response intercept(Chain chain) throws IOException {
                                        if ("/v2/api/test"
                                                .equals(chain.request().url().encodedPath())) {
                                            seenRequestEndpoints.add(
                                                    endpointOf(chain.request().url()));
                                        }
                                        return chain.proceed(chain.request());
                                    }
                                })
                        .build();
        ActivePassiveApiClient client = new ActivePassiveApiClient(stale, active);
        client.setHttpClient(httpClient);

        ApiResponse<String> response = client.execute(testCall(client), String.class);

        assertThat(response.getData()).isEqualTo("active");
        assertThat(seenRequestEndpoints).containsExactly(endpointOf(stale), endpointOf(active));
    }

    @Test
    public void manualFailoverStrategyReturnsSignalWithoutRediscoveryOn307() throws Exception {
        CountingHandler staleHandler = new CountingHandler(200, 307, "");
        String stale = startServer(staleHandler);
        CountingHandler activeHandler = new CountingHandler(307, 200, "active");
        String active = startServer(activeHandler);
        ActivePassiveApiClient client =
                new ActivePassiveApiClient(
                        ActivePassiveFailoverStrategy.MANUAL_FAILOVER, stale, active);

        assertThatExceptionOfType(ActivePassiveApiException.class)
                .isThrownBy(() -> client.execute(testCall(client), String.class))
                .satisfies(
                        e -> {
                            assertThat(e.getActivePassiveCode())
                                    .isEqualTo(ActivePassiveApiException.CODE_FAILOVER_REQUIRED);
                        });
        assertThat(client.getCurrentActiveRootUrl()).isNull();
        assertThat(staleHandler.probeCount.get()).isEqualTo(1);
        assertThat(staleHandler.requestCount.get()).isEqualTo(1);
        assertThat(activeHandler.probeCount.get()).isEqualTo(1);
        assertThat(activeHandler.requestCount.get()).isZero();
    }

    @Test
    public void alwaysProbeStrategyProbesBeforeEveryRequest() throws Exception {
        CountingHandler activeHandler = new CountingHandler(200, 200, "active");
        String active = startServer(activeHandler);
        ActivePassiveApiClient client =
                new ActivePassiveApiClient(ActivePassiveFailoverStrategy.ALWAYS_PROBE, active);

        client.execute(testCall(client), String.class);
        client.execute(testCall(client), String.class);

        assertThat(activeHandler.probeCount.get()).isEqualTo(2);
        assertThat(activeHandler.requestCount.get()).isEqualTo(2);
    }

    @Test
    public void probeActivePassiveUsesRootHealthzAndDoesNotFollowRedirects() throws Exception {
        CountingHandler passiveHandler = new CountingHandler(307, 200, "unexpected");
        String passive = startServer(passiveHandler);
        ActivePassiveApiClient client = new ActivePassiveApiClient(passive);

        boolean active = client.probeActivePassive();

        assertThat(active).isFalse();
        assertThat(passiveHandler.probeCount.get()).isEqualTo(1);
        assertThat(passiveHandler.requestCount.get()).isZero();
    }

    @Test
    public void activePassiveClientPreservesRootPathPrefixForProbeAndRequests() throws Exception {
        CountingHandler activeHandler = new CountingHandler(200, 200, "active", "/tower-a");
        String active = startServer(activeHandler) + "/tower-a";
        ActivePassiveApiClient client = new ActivePassiveApiClient(active);

        ApiResponse<String> response = client.execute(testCall(client), String.class);

        assertThat(response.getData()).isEqualTo("active");
        assertThat(client.getCurrentActiveRootUrl()).isEqualTo(active);
        assertThat(activeHandler.probeCount.get()).isEqualTo(1);
        assertThat(activeHandler.requestCount.get()).isEqualTo(1);
    }

    @Test
    public void singleEndpointApiClientCanProbeWhetherItsBasePathIsActive() throws Exception {
        CountingHandler activeHandler = new CountingHandler(200, 200, "active");
        String active = startServer(activeHandler);
        CountingHandler passiveHandler = new CountingHandler(307, 200, "passive");
        String passive = startServer(passiveHandler);

        assertThat(new ApiClient().setRootPath(active).probeActivePassive()).isTrue();
        assertThat(new ApiClient().setRootPath(passive).probeActivePassive()).isFalse();
        assertThat(activeHandler.probeCount.get()).isEqualTo(1);
        assertThat(passiveHandler.probeCount.get()).isEqualTo(1);
        assertThat(activeHandler.requestCount.get()).isZero();
        assertThat(passiveHandler.requestCount.get()).isZero();
    }

    @Test
    public void apiClientUsesRootPathApiBasePathAndProbePath() throws Exception {
        CountingHandler activeHandler =
                new CountingHandler(200, 200, "active", "/gateway/custom-api");
        String rootPath = startServer(activeHandler) + "/gateway/custom-api";
        ApiClient client = new ApiClient().setRootPath(rootPath);

        assertThat(client.getRootPath()).isEqualTo(rootPath);
        assertThat(client.getApiBasePath()).isEqualTo("/v2/api");
        assertThat(client.getProbePath()).isEqualTo("/api/healthz");
        assertThat(client.execute(testCall(client), String.class).getData()).isEqualTo("active");
        assertThat(client.probeActivePassive()).isTrue();
        assertThat(activeHandler.requestCount.get()).isEqualTo(1);
        assertThat(activeHandler.probeCount.get()).isEqualTo(1);
    }

    @Test
    @SuppressWarnings("deprecation")
    public void deprecatedBasePathSplitsOriginAndPath() throws Exception {
        CountingHandler activeHandler = new CountingHandler(200, 200, "active");
        String rootPath = startServer(activeHandler);
        ApiClient client = new ApiClient().setBasePath(rootPath + "/legacy/v2/api");

        assertThat(client.getRootPath()).isEqualTo(rootPath);
        assertThat(client.getApiBasePath()).isEqualTo("/legacy/v2/api");
        assertThat(client.getBasePath()).isEqualTo(rootPath + "/legacy/v2/api");
    }

    @Test
    public void setBasePathIsNotSupportedAfterConstruction() throws Exception {
        CountingHandler activeHandler = new CountingHandler(200, 200, "active");
        String active = startServer(activeHandler);
        ActivePassiveApiClient client = new ActivePassiveApiClient(active);

        assertThatExceptionOfType(UnsupportedOperationException.class)
                .isThrownBy(() -> client.setBasePath(active));
    }

    @Test
    public void perRequestBaseUrlOverrideIsNotSupported() throws Exception {
        CountingHandler activeHandler = new CountingHandler(200, 200, "active");
        String active = startServer(activeHandler);
        ActivePassiveApiClient client = new ActivePassiveApiClient(active);

        assertThatExceptionOfType(ApiException.class)
                .isThrownBy(
                        () ->
                                client.buildCall(
                                        "http://override.example.com/v2/api",
                                        "/test",
                                        "GET",
                                        Collections.<Pair>emptyList(),
                                        Collections.<Pair>emptyList(),
                                        null,
                                        new HashMap<String, String>(),
                                        new HashMap<String, String>(),
                                        new HashMap<String, Object>(),
                                        new String[] {},
                                        null))
                .satisfies(
                        e -> {
                            assertThat(e)
                                    .isInstanceOf(ActivePassiveApiException.class)
                                    .hasMessageContaining("per-request domain overrides");
                            ActivePassiveApiException activePassiveError =
                                    (ActivePassiveApiException) e;
                            assertThat(activePassiveError.getActivePassiveCode())
                                    .isEqualTo(
                                            ActivePassiveApiException
                                                    .CODE_UNSUPPORTED_DOMAIN_OVERRIDE);
                        });
    }

    @Test
    public void setRootUrlsReplacesEndpointsAndClearsCurrentActiveEndpoint() throws Exception {
        CountingHandler oldActiveHandler = new CountingHandler(200, 200, "old");
        String oldActive = startServer(oldActiveHandler);
        CountingHandler newActiveHandler = new CountingHandler(200, 200, "new");
        String newActive = startServer(newActiveHandler);
        ActivePassiveApiClient client = new ActivePassiveApiClient(oldActive);

        assertThat(client.execute(testCall(client), String.class).getData()).isEqualTo("old");
        assertThat(client.getCurrentActiveRootUrl()).isEqualTo(oldActive);

        client.setRootUrls(newActive);

        assertThat(client.getRootUrls()).containsExactly(newActive);
        assertThat(client.getCurrentActiveRootUrl()).isNull();
        assertThat(client.execute(testCall(client), String.class).getData()).isEqualTo("new");
        assertThat(client.getCurrentActiveRootUrl()).isEqualTo(newActive);
    }

    @Test
    public void activePassivePropertiesHaveJavaBeanAccessors() throws Exception {
        CountingHandler activeHandler = new CountingHandler(200, 200, "active");
        String active = startServer(activeHandler);
        ActivePassiveApiClient client =
                new ActivePassiveApiClient(ActivePassiveFailoverStrategy.ALWAYS_PROBE, active)
                        .setProbeTimeoutMillis(2345);

        assertThat(client.getRootUrls()).containsExactly(active);
        assertThat(client.getProbeTimeoutMillis()).isEqualTo(2345);
        assertThat(client.getFailoverStrategy())
                .isEqualTo(ActivePassiveFailoverStrategy.ALWAYS_PROBE);
        assertThat(client.getCurrentActiveRootUrl()).isNull();
    }

    @Test
    public void setHttpClientRejectsNullLikeBaseApiClient() throws Exception {
        CountingHandler activeHandler = new CountingHandler(200, 200, "active");
        String active = startServer(activeHandler);
        ActivePassiveApiClient client = new ActivePassiveApiClient(active);

        assertThatExceptionOfType(NullPointerException.class)
                .isThrownBy(() -> client.setHttpClient((OkHttpClient) null))
                .withMessage("HttpClient must not be null!");
    }

    @Test
    public void activePassiveExceptionPropsAreSealed() {
        List<String> failures = new ArrayList<String>();
        failures.add("first");

        ActivePassiveApiException exception = ActivePassiveApiException.noActiveEndpoint(failures);

        assertThat(exception.getProps()).containsEntry("failures", "first");
        assertThatExceptionOfType(UnsupportedOperationException.class)
                .isThrownBy(() -> exception.getProps().put("new", "value"));
    }

    @Test
    public void activePassiveExceptionPropsAreSealedWhenEmpty() {
        ActivePassiveApiException exception = new ActivePassiveApiException("TEST", "test message");

        assertThat(exception.getProps()).isEmpty();
        assertThatExceptionOfType(UnsupportedOperationException.class)
                .isThrownBy(() -> exception.getProps().put("new", "value"));
    }

    @Test
    public void activePassiveExceptionSealIsIdempotentAndRejectsLaterProps() throws Exception {
        ActivePassiveApiException exception = new ActivePassiveApiException("TEST", "test message");
        Method seal = ActivePassiveApiException.class.getDeclaredMethod("seal");
        Method prop =
                ActivePassiveApiException.class.getDeclaredMethod(
                        "prop", String.class, String.class);
        seal.setAccessible(true);
        prop.setAccessible(true);

        seal.invoke(exception);

        assertThatExceptionOfType(InvocationTargetException.class)
                .isThrownBy(() -> prop.invoke(exception, "key", "value"))
                .satisfies(
                        e ->
                                assertThat(e.getCause())
                                        .isInstanceOf(IllegalStateException.class)
                                        .hasMessage("props have already been sealed"));
    }

    private Call testCall(ApiClient client) throws ApiException {
        HashMap<String, String> headers = new HashMap<String, String>();
        headers.put("Accept", "text/plain");
        return client.buildCall(
                null,
                "/test",
                "GET",
                Collections.<Pair>emptyList(),
                Collections.<Pair>emptyList(),
                null,
                headers,
                new HashMap<String, String>(),
                new HashMap<String, Object>(),
                new String[] {},
                null);
    }

    private String startServer(HttpHandler handler) throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress("127.0.0.1", 0), 0);
        server.createContext("/", handler);
        server.start();
        servers.get().add(server);
        return "http://127.0.0.1:" + server.getAddress().getPort();
    }

    private static String endpointOf(String baseUrl) {
        return endpointOf(okhttp3.HttpUrl.parse(baseUrl));
    }

    private static String endpointOf(okhttp3.HttpUrl url) {
        return url.host() + ":" + url.port();
    }

    private static void write(HttpExchange exchange, int status, String body) throws IOException {
        byte[] bytes = body.getBytes(StandardCharsets.UTF_8);
        if (!body.isEmpty()) {
            exchange.getResponseHeaders().set("Content-Type", "text/plain");
        }
        exchange.sendResponseHeaders(status, bytes.length);
        OutputStream output = exchange.getResponseBody();
        try {
            output.write(bytes);
        } finally {
            output.close();
        }
    }

    private static class CountingHandler implements HttpHandler {
        private final int healthzStatus;
        private final int requestStatus;
        private final String responseBody;
        private final String prefixPath;
        private final AtomicInteger probeCount = new AtomicInteger();
        private final AtomicInteger requestCount = new AtomicInteger();

        private CountingHandler(int healthzStatus, int requestStatus, String responseBody) {
            this(healthzStatus, requestStatus, responseBody, "");
        }

        private CountingHandler(
                int healthzStatus, int requestStatus, String responseBody, String prefixPath) {
            this.healthzStatus = healthzStatus;
            this.requestStatus = requestStatus;
            this.responseBody = responseBody;
            this.prefixPath = prefixPath;
        }

        @Override
        public void handle(HttpExchange exchange) throws IOException {
            String path = exchange.getRequestURI().getPath();
            if ((prefixPath + "/api/healthz").equals(path)) {
                probeCount.incrementAndGet();
                write(exchange, healthzStatus(), "");
                return;
            }
            if ((prefixPath + "/v2/api/test").equals(path)) {
                requestCount.incrementAndGet();
                write(exchange, requestStatus, responseBody);
                return;
            }
            write(exchange, 404, "");
        }

        int healthzStatus() {
            return healthzStatus;
        }
    }
}

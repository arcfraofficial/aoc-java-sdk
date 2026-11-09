package com.arcfra.aoc;


import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.net.ssl.KeyManager;
import okhttp3.Call;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.threeten.bp.format.DateTimeFormatter;

/**
 * ApiClient variant that routes CloudTower requests to the active endpoint in active/passive HA.
 */
public class ActivePassiveApiClient extends ApiClient {
    public static final int DEFAULT_PROBE_TIMEOUT_MILLIS = 10_000;

    private static final int HTTP_TEMPORARY_REDIRECT = 307;

    private final Object activeEndpointLock = new Object();
    private final List<String> endpointRootUrls = new ArrayList<String>();
    private final ActivePassiveFailoverStrategy failoverStrategy;
    private volatile int probeTimeoutMillis = DEFAULT_PROBE_TIMEOUT_MILLIS;

    private String currentActiveRootUrl;

    public ActivePassiveApiClient(String... rootUrls) throws ApiException {
        this(ActivePassiveFailoverStrategy.AUTO_FAILOVER, rootUrls);
    }

    public ActivePassiveApiClient(
            ActivePassiveFailoverStrategy failoverStrategy, String... rootUrls)
            throws ApiException {
        super();
        this.failoverStrategy =
                failoverStrategy == null
                        ? ActivePassiveFailoverStrategy.AUTO_FAILOVER
                        : failoverStrategy;
        setHttpClient(super.getHttpClient());
        setRootUrls(rootUrls);
    }

    public ActivePassiveApiClient(List<String> rootUrls) throws ApiException {
        this(ActivePassiveFailoverStrategy.AUTO_FAILOVER, rootUrls);
    }

    public ActivePassiveApiClient(
            ActivePassiveFailoverStrategy failoverStrategy, List<String> rootUrls)
            throws ApiException {
        super();
        this.failoverStrategy =
                failoverStrategy == null
                        ? ActivePassiveFailoverStrategy.AUTO_FAILOVER
                        : failoverStrategy;
        setHttpClient(super.getHttpClient());
        setRootUrls(rootUrls);
    }

    public List<String> getRootUrls() {
        synchronized (activeEndpointLock) {
            return Collections.unmodifiableList(new ArrayList<String>(endpointRootUrls));
        }
    }

    public ActivePassiveApiClient setRootUrls(String... rootUrls) throws ApiException {
        return setRootUrls(rootUrls == null ? null : Arrays.asList(rootUrls));
    }

    public ActivePassiveApiClient setRootUrls(List<String> rootUrls) throws ApiException {
        List<String> parsedRootUrls = parseEndpointRootUrls(rootUrls);
        synchronized (activeEndpointLock) {
            endpointRootUrls.clear();
            endpointRootUrls.addAll(parsedRootUrls);
            currentActiveRootUrl = null;
            super.setRootPath(endpointRootUrls.get(0));
        }
        return this;
    }

    public int getProbeTimeoutMillis() {
        return probeTimeoutMillis;
    }

    public ActivePassiveApiClient setProbeTimeoutMillis(int probeTimeoutMillis) {
        this.probeTimeoutMillis =
                probeTimeoutMillis > 0 ? probeTimeoutMillis : DEFAULT_PROBE_TIMEOUT_MILLIS;
        return this;
    }

    public ActivePassiveFailoverStrategy getFailoverStrategy() {
        return failoverStrategy;
    }

    @Override
    public ActivePassiveApiClient setHttpClient(OkHttpClient newHttpClient) {
        super.setHttpClient(withActivePassiveInterceptor(newHttpClient));
        return this;
    }

    @Override
    public ApiClient setBasePath(String basePath) {
        throw new UnsupportedOperationException(
                "Use setRootUrls to configure ActivePassiveApiClient endpoints");
    }

    @Override
    public ApiClient setRootPath(String rootPath) {
        throw new UnsupportedOperationException(
                "Use setRootUrls to configure ActivePassiveApiClient endpoints");
    }

    @Override
    public ActivePassiveApiClient setApiBasePath(String apiBasePath) {
        super.setApiBasePath(apiBasePath);
        clearCurrentActiveRootUrl();
        return this;
    }

    @Override
    public ActivePassiveApiClient setProbePath(String probePath) {
        super.setProbePath(probePath);
        clearCurrentActiveRootUrl();
        return this;
    }

    @Override
    public ActivePassiveApiClient setVerifyingSsl(boolean verifyingSsl) {
        super.setVerifyingSsl(verifyingSsl);
        return this;
    }

    @Override
    public ActivePassiveApiClient setJSON(JSON json) {
        super.setJSON(json);
        return this;
    }

    @Override
    public ActivePassiveApiClient setSslCaCert(InputStream sslCaCert) {
        super.setSslCaCert(sslCaCert);
        return this;
    }

    @Override
    public ActivePassiveApiClient setKeyManagers(KeyManager[] managers) {
        super.setKeyManagers(managers);
        return this;
    }

    @Override
    public ActivePassiveApiClient setDateFormat(DateFormat dateFormat) {
        super.setDateFormat(dateFormat);
        return this;
    }

    @Override
    public ActivePassiveApiClient setSqlDateFormat(DateFormat dateFormat) {
        super.setSqlDateFormat(dateFormat);
        return this;
    }

    @Override
    public ActivePassiveApiClient setOffsetDateTimeFormat(DateTimeFormatter dateFormat) {
        super.setOffsetDateTimeFormat(dateFormat);
        return this;
    }

    @Override
    public ActivePassiveApiClient setLocalDateFormat(DateTimeFormatter dateFormat) {
        super.setLocalDateFormat(dateFormat);
        return this;
    }

    @Override
    public ActivePassiveApiClient setLenientOnJson(boolean lenientOnJson) {
        super.setLenientOnJson(lenientOnJson);
        return this;
    }

    @Override
    public ActivePassiveApiClient setUserAgent(String userAgent) {
        super.setUserAgent(userAgent);
        return this;
    }

    @Override
    public ActivePassiveApiClient addDefaultHeader(String key, String value) {
        super.addDefaultHeader(key, value);
        return this;
    }

    @Override
    public ActivePassiveApiClient removeDefaultHeader(String key, String value) {
        super.removeDefaultHeader(key, value);
        return this;
    }

    @Override
    public ActivePassiveApiClient addDefaultCookie(String key, String value) {
        super.addDefaultCookie(key, value);
        return this;
    }

    @Override
    public ActivePassiveApiClient setDebugging(boolean debugging) {
        super.setDebugging(debugging);
        return this;
    }

    @Override
    public ActivePassiveApiClient setTempFolderPath(String tempFolderPath) {
        super.setTempFolderPath(tempFolderPath);
        return this;
    }

    @Override
    public ActivePassiveApiClient setConnectTimeout(int connectionTimeout) {
        super.setConnectTimeout(connectionTimeout);
        return this;
    }

    @Override
    public ActivePassiveApiClient setReadTimeout(int readTimeout) {
        super.setReadTimeout(readTimeout);
        return this;
    }

    @Override
    public ActivePassiveApiClient setWriteTimeout(int writeTimeout) {
        super.setWriteTimeout(writeTimeout);
        return this;
    }

    @Override
    public <T> ApiResponse<T> execute(Call call, Type returnType) throws ApiException {
        try {
            return super.execute(call, returnType);
        } catch (ApiException e) {
            ApiException unwrapped = unwrapActivePassiveException(e);
            if (unwrapped != null) {
                throw unwrapped;
            }
            throw e;
        }
    }

    @Override
    public <T> void executeAsync(Call call, final Type returnType, final ApiCallback<T> callback) {
        super.executeAsync(
                call,
                returnType,
                new ApiCallback<T>() {
                    @Override
                    public void onFailure(
                            ApiException e,
                            int statusCode,
                            Map<String, List<String>> responseHeaders) {
                        ApiException unwrapped = unwrapActivePassiveException(e);
                        if (unwrapped != null) {
                            callback.onFailure(
                                    unwrapped, unwrapped.getCode(), unwrapped.getResponseHeaders());
                            return;
                        }
                        callback.onFailure(e, statusCode, responseHeaders);
                    }

                    @Override
                    public void onSuccess(
                            T result, int statusCode, Map<String, List<String>> responseHeaders) {
                        callback.onSuccess(result, statusCode, responseHeaders);
                    }

                    @Override
                    public void onUploadProgress(
                            long bytesWritten, long contentLength, boolean done) {
                        callback.onUploadProgress(bytesWritten, contentLength, done);
                    }

                    @Override
                    public void onDownloadProgress(
                            long bytesRead, long contentLength, boolean done) {
                        callback.onDownloadProgress(bytesRead, contentLength, done);
                    }
                });
    }

    @Override
    public Request buildRequest(
            String baseUrl,
            String path,
            String method,
            List<Pair> queryParams,
            List<Pair> collectionQueryParams,
            Object body,
            Map<String, String> headerParams,
            Map<String, String> cookieParams,
            Map<String, Object> formParams,
            String[] authNames,
            ApiCallback callback)
            throws ApiException {
        if (baseUrl != null) {
            throw ActivePassiveApiException.unsupportedDomainOverride();
        }
        Request request =
                super.buildRequest(
                        null,
                        path,
                        method,
                        queryParams,
                        collectionQueryParams,
                        body,
                        headerParams,
                        cookieParams,
                        formParams,
                        authNames,
                        callback);
        return request;
    }

    /** Probe the first configured endpoint and return whether it is currently active. */
    public boolean probeActivePassive() throws ApiException {
        return probeActivePassive(firstEndpointRootUrl(), getProbePath(), probeTimeoutMillis);
    }

    /** Returns the last discovered active endpoint root URL. */
    public String getCurrentActiveRootUrl() {
        synchronized (activeEndpointLock) {
            return currentActiveRootUrl;
        }
    }

    private Response interceptActivePassive(Interceptor.Chain chain) throws IOException {
        Request request = chain.request();
        if (request.tag(ActivePassiveRequestTags.Bypass.class) != null) {
            return chain.proceed(request);
        }

        ActivePassiveFailoverStrategy strategy = failoverStrategy;
        String rootUrl = activeRootUrlForRequest(strategy);
        Response response;
        try {
            response = chain.proceed(routeRequestForTransport(request, rootUrl));
        } catch (IOException e) {
            clearCurrentActiveRootUrlIf(rootUrl);
            throw e;
        }

        if (response.code() != HTTP_TEMPORARY_REDIRECT) {
            return response;
        }

        ActivePassiveApiException switchSignal = ActivePassiveApiException.switchSignal(response);
        if (response.body() != null) {
            response.body().close();
        }
        clearCurrentActiveRootUrlIf(rootUrl);
        if (strategy == ActivePassiveFailoverStrategy.MANUAL_FAILOVER
                || strategy == ActivePassiveFailoverStrategy.ALWAYS_PROBE) {
            throw new ActivePassiveTransportException(
                    ActivePassiveApiException.failoverRequired(switchSignal));
        }

        String retryRootUrl = activeRootUrlForRequest(strategy);
        Response retry;
        try {
            retry = chain.proceed(routeRequestForTransport(request, retryRootUrl));
        } catch (IOException e) {
            clearCurrentActiveRootUrlIf(retryRootUrl);
            throw e;
        }

        if (retry.code() != HTTP_TEMPORARY_REDIRECT) {
            return retry;
        }

        ActivePassiveApiException retrySignal = ActivePassiveApiException.switchSignal(retry);
        if (retry.body() != null) {
            retry.body().close();
        }
        clearCurrentActiveRootUrlIf(retryRootUrl);
        throw new ActivePassiveTransportException(
                ActivePassiveApiException.retryExhausted(retrySignal));
    }

    private String activeRootUrlForRequest(ActivePassiveFailoverStrategy strategy)
            throws IOException {
        try {
            if (strategy == ActivePassiveFailoverStrategy.ALWAYS_PROBE) {
                clearCurrentActiveRootUrl();
            }
            return ensureActiveRootUrl();
        } catch (ApiException e) {
            throw new ActivePassiveTransportException(e);
        }
    }

    private String firstEndpointRootUrl() {
        synchronized (activeEndpointLock) {
            return endpointRootUrls.get(0);
        }
    }

    private String ensureActiveRootUrl() throws ApiException {
        while (true) {
            List<String> endpoints;
            synchronized (activeEndpointLock) {
                if (currentActiveRootUrl != null) {
                    return currentActiveRootUrl;
                }
                endpoints = new ArrayList<String>(endpointRootUrls);
            }

            String activeRootUrl = discoverActiveRootUrl(endpoints);
            synchronized (activeEndpointLock) {
                if (currentActiveRootUrl != null) {
                    return currentActiveRootUrl;
                }
                if (endpointRootUrls.equals(endpoints)) {
                    currentActiveRootUrl = activeRootUrl;
                    return activeRootUrl;
                }
            }
        }
    }

    private String discoverActiveRootUrl(List<String> endpoints) throws ApiException {
        List<String> activeRootUrls = new ArrayList<String>();
        List<String> failures = new ArrayList<String>();

        for (int i = 0; i < endpoints.size(); i++) {
            String endpointRootUrl = endpoints.get(i);
            try {
                if (probeActivePassive(endpointRootUrl, getProbePath(), probeTimeoutMillis)) {
                    activeRootUrls.add(endpointRootUrl);
                }
            } catch (ApiException e) {
                failures.add(endpointRootUrl + ": " + e.getMessage());
            }
        }

        if (activeRootUrls.size() == 1) {
            return activeRootUrls.get(0);
        }
        if (activeRootUrls.isEmpty()) {
            throw ActivePassiveApiException.noActiveEndpoint(failures);
        }
        throw ActivePassiveApiException.multipleActiveEndpoints(activeRootUrls);
    }

    private Request routeRequest(Request request, String rootUrl) throws ApiException {
        HttpUrl targetBaseUrl = parseEndpointRootUrl(buildApiBaseUrl(rootUrl));
        HttpUrl firstBaseUrl = parseEndpointRootUrl(buildApiBaseUrl(firstEndpointRootUrl()));
        String suffix = pathSuffix(request.url().encodedPath(), firstBaseUrl.encodedPath());
        HttpUrl routedUrl =
                request.url()
                        .newBuilder()
                        .scheme(targetBaseUrl.scheme())
                        .host(targetBaseUrl.host())
                        .port(targetBaseUrl.port())
                        .encodedPath(joinEncodedPath(targetBaseUrl.encodedPath(), suffix))
                        .build();
        return request.newBuilder().url(routedUrl).build();
    }

    private Request routeRequestForTransport(Request request, String rootUrl) throws IOException {
        try {
            return routeRequest(request, rootUrl);
        } catch (ApiException e) {
            throw new ActivePassiveTransportException(e);
        }
    }

    private void clearCurrentActiveRootUrl() {
        synchronized (activeEndpointLock) {
            currentActiveRootUrl = null;
        }
    }

    private void clearCurrentActiveRootUrlIf(String rootUrl) {
        synchronized (activeEndpointLock) {
            if (rootUrl != null && rootUrl.equals(currentActiveRootUrl)) {
                currentActiveRootUrl = null;
            }
        }
    }

    private List<String> parseEndpointRootUrls(List<String> rootUrls) throws ApiException {
        if (rootUrls == null || rootUrls.isEmpty()) {
            throw ActivePassiveApiException.noEndpoints();
        }

        List<String> parsedRootUrls = new ArrayList<String>();
        HashSet<String> seen = new HashSet<String>();
        for (String endpoint : rootUrls) {
            HttpUrl url = parseEndpointRootUrl(endpoint);
            String rootUrl = trimTrailingSlash(url.toString());
            if (!seen.add(rootUrl)) {
                throw ActivePassiveApiException.duplicateEndpoint(rootUrl);
            }
            parsedRootUrls.add(rootUrl);
        }
        return parsedRootUrls;
    }

    private HttpUrl parseEndpointRootUrl(String endpoint) throws ApiException {
        if (endpoint == null || endpoint.trim().isEmpty()) {
            throw ActivePassiveApiException.noEndpoints();
        }

        String raw = endpoint.trim();
        HttpUrl parsed = HttpUrl.parse(raw);
        if (parsed == null) {
            throw ActivePassiveApiException.invalidEndpoint(endpoint);
        }
        return parsed;
    }

    private String buildApiBaseUrl(String rootUrl) {
        return joinUrlPath(rootUrl, getApiBasePath());
    }

    private OkHttpClient withActivePassiveInterceptor(OkHttpClient client) {
        OkHttpClient safeClient = Objects.requireNonNull(client, "HttpClient must not be null!");
        OkHttpClient.Builder builder =
                safeClient.newBuilder().followRedirects(false).followSslRedirects(false);
        List<Interceptor> interceptors = builder.interceptors();
        for (int i = interceptors.size() - 1; i >= 0; i--) {
            if (interceptors.get(i) instanceof ActivePassiveInterceptor) {
                interceptors.remove(i);
            }
        }
        interceptors.add(0, new ActivePassiveInterceptor());
        return builder.build();
    }

    private static ApiException unwrapActivePassiveException(ApiException e) {
        Throwable cause = e.getCause();
        if (cause instanceof ActivePassiveTransportException) {
            return ((ActivePassiveTransportException) cause).getApiException();
        }
        return null;
    }

    private static String pathSuffix(String path, String basePath) {
        if ("/".equals(basePath)) {
            return path;
        }
        if (path.equals(basePath)) {
            return "";
        }
        String basePathWithSlash = basePath.endsWith("/") ? basePath : basePath + "/";
        if (path.startsWith(basePathWithSlash)) {
            return path.substring(basePath.length());
        }
        return path;
    }

    private static class ActivePassiveTransportException extends IOException {
        private final ApiException apiException;

        private ActivePassiveTransportException(ApiException apiException) {
            super(apiException);
            this.apiException = apiException;
        }

        private ApiException getApiException() {
            return apiException;
        }
    }

    private class ActivePassiveInterceptor implements Interceptor {
        @Override
        public Response intercept(Chain chain) throws IOException {
            return interceptActivePassive(chain);
        }
    }
}

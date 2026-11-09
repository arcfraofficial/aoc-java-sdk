package com.arcfra.aoc;


import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import okhttp3.Response;

/** Exception raised by active/passive discovery and routing logic. */
@SuppressWarnings("serial")
public class ActivePassiveApiException extends ApiException {
    public static final String CODE_NO_ENDPOINTS = "NO_ENDPOINTS";
    public static final String CODE_DUPLICATE_ENDPOINT = "DUPLICATE_ENDPOINT";
    public static final String CODE_NO_ACTIVE_ENDPOINT = "NO_ACTIVE_ENDPOINT";
    public static final String CODE_MULTIPLE_ACTIVE_ENDPOINTS = "MULTIPLE_ACTIVE_ENDPOINTS";
    public static final String CODE_INVALID_ENDPOINT = "INVALID_ENDPOINT";
    public static final String CODE_FAILOVER_REQUIRED = "FAILOVER_REQUIRED";
    public static final String CODE_RETRY_EXHAUSTED = "RETRY_EXHAUSTED";
    public static final String CODE_UNEXPECTED_PROBE_STATUS = "UNEXPECTED_PROBE_STATUS";
    public static final String CODE_UNSUPPORTED_DOMAIN_OVERRIDE = "UNSUPPORTED_DOMAIN_OVERRIDE";

    private final String activePassiveCode;
    private Map<String, String> props;
    private boolean sealed;

    public ActivePassiveApiException(String activePassiveCode, String message) {
        super(message);
        this.activePassiveCode = activePassiveCode;
        seal();
    }

    private ActivePassiveApiException(
            String activePassiveCode,
            String message,
            int code,
            Map<String, List<String>> responseHeaders,
            String responseBody) {
        super(message, code, responseHeaders, responseBody);
        this.activePassiveCode = activePassiveCode;
    }

    public String getActivePassiveCode() {
        return activePassiveCode;
    }

    public Map<String, String> getProps() {
        return props;
    }

    static ActivePassiveApiException unsupportedDomainOverride() {
        return new ActivePassiveApiException(
                CODE_UNSUPPORTED_DOMAIN_OVERRIDE,
                "ActivePassiveApiClient does not support per-request domain overrides");
    }

    static ActivePassiveApiException noEndpoints() {
        return new ActivePassiveApiException(
                CODE_NO_ENDPOINTS, "active-passive client requires at least one endpoint");
    }

    static ActivePassiveApiException duplicateEndpoint(String baseUrl) {
        return new ActivePassiveApiException(
                        CODE_DUPLICATE_ENDPOINT,
                        "active-passive client endpoints must be unique: " + baseUrl,
                        0,
                        null,
                        null)
                .prop("baseUrl", baseUrl)
                .seal();
    }

    static ActivePassiveApiException invalidEndpoint(String endpoint) {
        return new ActivePassiveApiException(
                        CODE_INVALID_ENDPOINT,
                        "Invalid active-passive endpoint: " + endpoint,
                        0,
                        null,
                        null)
                .prop("endpoint", endpoint)
                .seal();
    }

    static ActivePassiveApiException noActiveEndpoint(List<String> failures) {
        String message = "active-passive discover found no active endpoint";
        String joinedFailures = null;
        if (failures != null && !failures.isEmpty()) {
            joinedFailures = String.join("; ", failures);
            message = message + ": " + joinedFailures;
        }
        return new ActivePassiveApiException(CODE_NO_ACTIVE_ENDPOINT, message, 0, null, null)
                .prop("failures", joinedFailures)
                .seal();
    }

    static ActivePassiveApiException multipleActiveEndpoints(List<String> activeBaseUrls) {
        String joinedActiveBaseUrls = String.join(", ", activeBaseUrls);
        return new ActivePassiveApiException(
                        CODE_MULTIPLE_ACTIVE_ENDPOINTS,
                        "active-passive discover found multiple active endpoints: "
                                + joinedActiveBaseUrls,
                        0,
                        null,
                        null)
                .prop("activeBaseUrls", joinedActiveBaseUrls)
                .seal();
    }

    static ActivePassiveApiException unexpectedProbeStatus(Response response) {
        return fromResponse(
                CODE_UNEXPECTED_PROBE_STATUS,
                "probe active-passive returned unexpected status",
                response);
    }

    static ActivePassiveApiException switchSignal(Response response) {
        return fromResponse(CODE_FAILOVER_REQUIRED, "active-passive switch signal", response);
    }

    static ActivePassiveApiException failoverRequired(ApiException cause) {
        return new ActivePassiveApiException(
                        CODE_FAILOVER_REQUIRED,
                        "active-passive failover required: " + cause.getMessage(),
                        cause.getCode(),
                        cause.getResponseHeaders(),
                        cause.getResponseBody())
                .seal();
    }

    static ActivePassiveApiException retryExhausted(ApiException cause) {
        return new ActivePassiveApiException(
                        CODE_RETRY_EXHAUSTED,
                        "active-passive request retry exhausted after discover",
                        cause.getCode(),
                        cause.getResponseHeaders(),
                        cause.getResponseBody())
                .seal();
    }

    private static ActivePassiveApiException fromResponse(
            String activePassiveCode, String message, Response response) {
        ResponseSnapshot snapshot = snapshot(response);
        return new ActivePassiveApiException(
                        activePassiveCode,
                        message,
                        snapshot.statusCode,
                        snapshot.headers,
                        snapshot.body)
                .seal();
    }

    private static ResponseSnapshot snapshot(Response response) {
        String body = null;
        if (response.body() != null) {
            try {
                body = response.body().string();
            } catch (IOException ignored) {
                body = null;
            }
        }
        return new ResponseSnapshot(response.code(), response.headers().toMultimap(), body);
    }

    private ActivePassiveApiException prop(String key, String value) {
        if (sealed) {
            throw new IllegalStateException("props have already been sealed");
        }
        if (value != null) {
            if (props == null) {
                props = new HashMap<String, String>();
            }
            props.put(key, value);
        }
        return this;
    }

    private ActivePassiveApiException seal() {
        if (sealed) {
            return this;
        }
        if (props == null) {
            props = Collections.emptyMap();
        }
        props = Collections.unmodifiableMap(props);
        sealed = true;
        return this;
    }

    private static class ResponseSnapshot {
        private final int statusCode;
        private final Map<String, List<String>> headers;
        private final String body;

        private ResponseSnapshot(int statusCode, Map<String, List<String>> headers, String body) {
            this.statusCode = statusCode;
            this.headers = headers;
            this.body = body;
        }
    }
}

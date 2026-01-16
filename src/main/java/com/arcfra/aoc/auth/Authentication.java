package com.arcfra.aoc.auth;


import com.arcfra.aoc.ApiException;
import com.arcfra.aoc.Pair;
import java.net.URI;
import java.util.List;
import java.util.Map;

public interface Authentication {
    /**
     * Apply authentication settings to header and query params.
     *
     * @param queryParams List of query parameters
     * @param headerParams Map of header parameters
     * @param cookieParams Map of cookie parameters
     * @param payload HTTP request body
     * @param method HTTP method
     * @param uri URI
     * @throws ApiException if failed to update the parameters
     */
    void applyToParams(
            List<Pair> queryParams,
            Map<String, String> headerParams,
            Map<String, String> cookieParams,
            String payload,
            String method,
            URI uri)
            throws ApiException;
}

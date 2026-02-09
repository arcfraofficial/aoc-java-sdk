package com.arcfra.aoc.api;


import com.arcfra.aoc.ApiCallback;
import com.arcfra.aoc.ApiClient;
import com.arcfra.aoc.ApiException;
import com.arcfra.aoc.ApiResponse;
import com.arcfra.aoc.Configuration;
import com.arcfra.aoc.Pair;
import com.arcfra.aoc.model.ResourceChangeResponse;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ResourceChangeApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ResourceChangeApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ResourceChangeApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for getResourceChanges
     *
     * @param action (optional)
     * @param resourceType (optional)
     * @param resourceId (optional)
     * @param startRevision (optional)
     * @param limit (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
     * <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Server error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call getResourceChangesCall(
            String action,
            String resourceType,
            String resourceId,
            String startRevision,
            Integer limit,
            final ApiCallback _callback)
            throws ApiException {
        String basePath = null;

        // Operation Servers
        String[] localBasePaths = new String[] {};

        // Determine Base Path to Use
        if (localCustomBaseUrl != null) {
            basePath = localCustomBaseUrl;
        } else if (localBasePaths.length > 0) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/resource-changes";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (action != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("action", action));
        }

        if (resourceType != null) {
            localVarQueryParams.addAll(
                    localVarApiClient.parameterToPair("resource_type", resourceType));
        }

        if (resourceId != null) {
            localVarQueryParams.addAll(
                    localVarApiClient.parameterToPair("resource_id", resourceId));
        }

        if (startRevision != null) {
            localVarQueryParams.addAll(
                    localVarApiClient.parameterToPair("start_revision", startRevision));
        }

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

        final String[] localVarAccepts = {"application/json"};
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {};

        final String localVarContentType =
                localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {"Basic"};
        return localVarApiClient.buildCall(
                basePath,
                localVarPath,
                "GET",
                localVarQueryParams,
                localVarCollectionQueryParams,
                localVarPostBody,
                localVarHeaderParams,
                localVarCookieParams,
                localVarFormParams,
                localVarAuthNames,
                _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getResourceChangesValidateBeforeCall(
            String action,
            String resourceType,
            String resourceId,
            String startRevision,
            Integer limit,
            final ApiCallback _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                getResourceChangesCall(
                        action, resourceType, resourceId, startRevision, limit, _callback);
        return localVarCall;
    }

    /**
     * @param action (optional)
     * @param resourceType (optional)
     * @param resourceId (optional)
     * @param startRevision (optional)
     * @param limit (optional)
     * @return ResourceChangeResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
     * <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Server error </td><td>  -  </td></tr>
     * </table>
     */
    public ResourceChangeResponse getResourceChanges(
            String action,
            String resourceType,
            String resourceId,
            String startRevision,
            Integer limit)
            throws ApiException {
        ApiResponse<ResourceChangeResponse> localVarResp =
                getResourceChangesWithHttpInfo(
                        action, resourceType, resourceId, startRevision, limit);
        return localVarResp.getData();
    }

    /**
     * @param action (optional)
     * @param resourceType (optional)
     * @param resourceId (optional)
     * @param startRevision (optional)
     * @param limit (optional)
     * @return ApiResponse&lt;ResourceChangeResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
     * <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Server error </td><td>  -  </td></tr>
     * </table>
     */
    public ApiResponse<ResourceChangeResponse> getResourceChangesWithHttpInfo(
            String action,
            String resourceType,
            String resourceId,
            String startRevision,
            Integer limit)
            throws ApiException {
        okhttp3.Call localVarCall =
                getResourceChangesValidateBeforeCall(
                        action, resourceType, resourceId, startRevision, limit, null);
        Type localVarReturnType = new TypeToken<ResourceChangeResponse>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param action (optional)
     * @param resourceType (optional)
     * @param resourceId (optional)
     * @param startRevision (optional)
     * @param limit (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Bad request </td><td>  -  </td></tr>
     * <tr><td> 404 </td><td> Not found </td><td>  -  </td></tr>
     * <tr><td> 500 </td><td> Server error </td><td>  -  </td></tr>
     * </table>
     */
    public okhttp3.Call getResourceChangesAsync(
            String action,
            String resourceType,
            String resourceId,
            String startRevision,
            Integer limit,
            final ApiCallback<ResourceChangeResponse> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                getResourceChangesValidateBeforeCall(
                        action, resourceType, resourceId, startRevision, limit, _callback);
        Type localVarReturnType = new TypeToken<ResourceChangeResponse>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}

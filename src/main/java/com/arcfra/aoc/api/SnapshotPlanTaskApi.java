package com.arcfra.aoc.api;


import com.arcfra.aoc.ApiCallback;
import com.arcfra.aoc.ApiClient;
import com.arcfra.aoc.ApiException;
import com.arcfra.aoc.ApiResponse;
import com.arcfra.aoc.Configuration;
import com.arcfra.aoc.Pair;
import com.arcfra.aoc.model.GetSnapshotPlanTasksConnectionRequestBody;
import com.arcfra.aoc.model.GetSnapshotPlanTasksRequestBody;
import com.arcfra.aoc.model.SnapshotPlanTask;
import com.arcfra.aoc.model.SnapshotPlanTaskConnection;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SnapshotPlanTaskApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public SnapshotPlanTaskApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SnapshotPlanTaskApi(ApiClient apiClient) {
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
     * Build call for getSnapshotPlanTasks
     *
     * @param getSnapshotPlanTasksRequestBody (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td>  </td><td>  * x-tower-request-id -  <br>  </td></tr>
     * <tr><td> 400 </td><td> Bad request </td><td>  * CommonHeader -  <br>  </td></tr>
     * <tr><td> 404 </td><td> Not found </td><td>  * CommonHeader -  <br>  </td></tr>
     * <tr><td> 500 </td><td> Server error </td><td>  * CommonHeader -  <br>  </td></tr>
     * </table>
     */
    public okhttp3.Call getSnapshotPlanTasksCall(
            GetSnapshotPlanTasksRequestBody getSnapshotPlanTasksRequestBody,
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

        Object localVarPostBody = getSnapshotPlanTasksRequestBody;

        // create path and map variables
        String localVarPath = "/get-snapshot-plan-tasks";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {"application/json"};
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {"application/json"};
        final String localVarContentType =
                localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {"Authorization"};
        return localVarApiClient.buildCall(
                basePath,
                localVarPath,
                "POST",
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
    private okhttp3.Call getSnapshotPlanTasksValidateBeforeCall(
            GetSnapshotPlanTasksRequestBody getSnapshotPlanTasksRequestBody,
            final ApiCallback _callback)
            throws ApiException {

        // verify the required parameter 'getSnapshotPlanTasksRequestBody' is set
        if (getSnapshotPlanTasksRequestBody == null) {
            throw new ApiException(
                    "Missing the required parameter 'getSnapshotPlanTasksRequestBody' when calling"
                            + " getSnapshotPlanTasks(Async)");
        }

        okhttp3.Call localVarCall =
                getSnapshotPlanTasksCall(getSnapshotPlanTasksRequestBody, _callback);
        return localVarCall;
    }

    /**
     * @param getSnapshotPlanTasksRequestBody (required)
     * @return List&lt;SnapshotPlanTask&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td>  </td><td>  * x-tower-request-id -  <br>  </td></tr>
     * <tr><td> 400 </td><td> Bad request </td><td>  * CommonHeader -  <br>  </td></tr>
     * <tr><td> 404 </td><td> Not found </td><td>  * CommonHeader -  <br>  </td></tr>
     * <tr><td> 500 </td><td> Server error </td><td>  * CommonHeader -  <br>  </td></tr>
     * </table>
     */
    public List<SnapshotPlanTask> getSnapshotPlanTasks(
            GetSnapshotPlanTasksRequestBody getSnapshotPlanTasksRequestBody) throws ApiException {
        ApiResponse<List<SnapshotPlanTask>> localVarResp =
                getSnapshotPlanTasksWithHttpInfo(getSnapshotPlanTasksRequestBody);
        return localVarResp.getData();
    }

    /**
     * @param getSnapshotPlanTasksRequestBody (required)
     * @return ApiResponse&lt;List&lt;SnapshotPlanTask&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td>  </td><td>  * x-tower-request-id -  <br>  </td></tr>
     * <tr><td> 400 </td><td> Bad request </td><td>  * CommonHeader -  <br>  </td></tr>
     * <tr><td> 404 </td><td> Not found </td><td>  * CommonHeader -  <br>  </td></tr>
     * <tr><td> 500 </td><td> Server error </td><td>  * CommonHeader -  <br>  </td></tr>
     * </table>
     */
    public ApiResponse<List<SnapshotPlanTask>> getSnapshotPlanTasksWithHttpInfo(
            GetSnapshotPlanTasksRequestBody getSnapshotPlanTasksRequestBody) throws ApiException {
        okhttp3.Call localVarCall =
                getSnapshotPlanTasksValidateBeforeCall(getSnapshotPlanTasksRequestBody, null);
        Type localVarReturnType = new TypeToken<List<SnapshotPlanTask>>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param getSnapshotPlanTasksRequestBody (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td>  </td><td>  * x-tower-request-id -  <br>  </td></tr>
     * <tr><td> 400 </td><td> Bad request </td><td>  * CommonHeader -  <br>  </td></tr>
     * <tr><td> 404 </td><td> Not found </td><td>  * CommonHeader -  <br>  </td></tr>
     * <tr><td> 500 </td><td> Server error </td><td>  * CommonHeader -  <br>  </td></tr>
     * </table>
     */
    public okhttp3.Call getSnapshotPlanTasksAsync(
            GetSnapshotPlanTasksRequestBody getSnapshotPlanTasksRequestBody,
            final ApiCallback<List<SnapshotPlanTask>> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                getSnapshotPlanTasksValidateBeforeCall(getSnapshotPlanTasksRequestBody, _callback);
        Type localVarReturnType = new TypeToken<List<SnapshotPlanTask>>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getSnapshotPlanTasksConnection
     *
     * @param getSnapshotPlanTasksConnectionRequestBody (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td>  </td><td>  * x-tower-request-id -  <br>  </td></tr>
     * <tr><td> 400 </td><td> Bad request </td><td>  * CommonHeader -  <br>  </td></tr>
     * <tr><td> 404 </td><td> Not found </td><td>  * CommonHeader -  <br>  </td></tr>
     * <tr><td> 500 </td><td> Server error </td><td>  * CommonHeader -  <br>  </td></tr>
     * </table>
     */
    public okhttp3.Call getSnapshotPlanTasksConnectionCall(
            GetSnapshotPlanTasksConnectionRequestBody getSnapshotPlanTasksConnectionRequestBody,
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

        Object localVarPostBody = getSnapshotPlanTasksConnectionRequestBody;

        // create path and map variables
        String localVarPath = "/get-snapshot-plan-tasks-connection";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {"application/json"};
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {"application/json"};
        final String localVarContentType =
                localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {"Authorization"};
        return localVarApiClient.buildCall(
                basePath,
                localVarPath,
                "POST",
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
    private okhttp3.Call getSnapshotPlanTasksConnectionValidateBeforeCall(
            GetSnapshotPlanTasksConnectionRequestBody getSnapshotPlanTasksConnectionRequestBody,
            final ApiCallback _callback)
            throws ApiException {

        // verify the required parameter 'getSnapshotPlanTasksConnectionRequestBody' is set
        if (getSnapshotPlanTasksConnectionRequestBody == null) {
            throw new ApiException(
                    "Missing the required parameter 'getSnapshotPlanTasksConnectionRequestBody'"
                            + " when calling getSnapshotPlanTasksConnection(Async)");
        }

        okhttp3.Call localVarCall =
                getSnapshotPlanTasksConnectionCall(
                        getSnapshotPlanTasksConnectionRequestBody, _callback);
        return localVarCall;
    }

    /**
     * @param getSnapshotPlanTasksConnectionRequestBody (required)
     * @return SnapshotPlanTaskConnection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td>  </td><td>  * x-tower-request-id -  <br>  </td></tr>
     * <tr><td> 400 </td><td> Bad request </td><td>  * CommonHeader -  <br>  </td></tr>
     * <tr><td> 404 </td><td> Not found </td><td>  * CommonHeader -  <br>  </td></tr>
     * <tr><td> 500 </td><td> Server error </td><td>  * CommonHeader -  <br>  </td></tr>
     * </table>
     */
    public SnapshotPlanTaskConnection getSnapshotPlanTasksConnection(
            GetSnapshotPlanTasksConnectionRequestBody getSnapshotPlanTasksConnectionRequestBody)
            throws ApiException {
        ApiResponse<SnapshotPlanTaskConnection> localVarResp =
                getSnapshotPlanTasksConnectionWithHttpInfo(
                        getSnapshotPlanTasksConnectionRequestBody);
        return localVarResp.getData();
    }

    /**
     * @param getSnapshotPlanTasksConnectionRequestBody (required)
     * @return ApiResponse&lt;SnapshotPlanTaskConnection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td>  </td><td>  * x-tower-request-id -  <br>  </td></tr>
     * <tr><td> 400 </td><td> Bad request </td><td>  * CommonHeader -  <br>  </td></tr>
     * <tr><td> 404 </td><td> Not found </td><td>  * CommonHeader -  <br>  </td></tr>
     * <tr><td> 500 </td><td> Server error </td><td>  * CommonHeader -  <br>  </td></tr>
     * </table>
     */
    public ApiResponse<SnapshotPlanTaskConnection> getSnapshotPlanTasksConnectionWithHttpInfo(
            GetSnapshotPlanTasksConnectionRequestBody getSnapshotPlanTasksConnectionRequestBody)
            throws ApiException {
        okhttp3.Call localVarCall =
                getSnapshotPlanTasksConnectionValidateBeforeCall(
                        getSnapshotPlanTasksConnectionRequestBody, null);
        Type localVarReturnType = new TypeToken<SnapshotPlanTaskConnection>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param getSnapshotPlanTasksConnectionRequestBody (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td>  </td><td>  * x-tower-request-id -  <br>  </td></tr>
     * <tr><td> 400 </td><td> Bad request </td><td>  * CommonHeader -  <br>  </td></tr>
     * <tr><td> 404 </td><td> Not found </td><td>  * CommonHeader -  <br>  </td></tr>
     * <tr><td> 500 </td><td> Server error </td><td>  * CommonHeader -  <br>  </td></tr>
     * </table>
     */
    public okhttp3.Call getSnapshotPlanTasksConnectionAsync(
            GetSnapshotPlanTasksConnectionRequestBody getSnapshotPlanTasksConnectionRequestBody,
            final ApiCallback<SnapshotPlanTaskConnection> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                getSnapshotPlanTasksConnectionValidateBeforeCall(
                        getSnapshotPlanTasksConnectionRequestBody, _callback);
        Type localVarReturnType = new TypeToken<SnapshotPlanTaskConnection>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}

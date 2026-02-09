package com.arcfra.aoc.api;


import com.arcfra.aoc.ApiCallback;
import com.arcfra.aoc.ApiClient;
import com.arcfra.aoc.ApiException;
import com.arcfra.aoc.ApiResponse;
import com.arcfra.aoc.Configuration;
import com.arcfra.aoc.Pair;
import com.arcfra.aoc.model.ClusterUpgradeHistory;
import com.arcfra.aoc.model.ClusterUpgradeHistoryConnection;
import com.arcfra.aoc.model.GetClusterUpgradeHistoriesConnectionRequestBody;
import com.arcfra.aoc.model.GetClusterUpgradeHistoriesRequestBody;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClusterUpgradeHistoryApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ClusterUpgradeHistoryApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ClusterUpgradeHistoryApi(ApiClient apiClient) {
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
     * Build call for getClusterUpgradeHistories
     *
     * @param getClusterUpgradeHistoriesRequestBody (required)
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
    public okhttp3.Call getClusterUpgradeHistoriesCall(
            GetClusterUpgradeHistoriesRequestBody getClusterUpgradeHistoriesRequestBody,
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

        Object localVarPostBody = getClusterUpgradeHistoriesRequestBody;

        // create path and map variables
        String localVarPath = "/get-cluster-upgrade-histories";

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
    private okhttp3.Call getClusterUpgradeHistoriesValidateBeforeCall(
            GetClusterUpgradeHistoriesRequestBody getClusterUpgradeHistoriesRequestBody,
            final ApiCallback _callback)
            throws ApiException {

        // verify the required parameter 'getClusterUpgradeHistoriesRequestBody' is set
        if (getClusterUpgradeHistoriesRequestBody == null) {
            throw new ApiException(
                    "Missing the required parameter 'getClusterUpgradeHistoriesRequestBody' when"
                            + " calling getClusterUpgradeHistories(Async)");
        }

        okhttp3.Call localVarCall =
                getClusterUpgradeHistoriesCall(getClusterUpgradeHistoriesRequestBody, _callback);
        return localVarCall;
    }

    /**
     * @param getClusterUpgradeHistoriesRequestBody (required)
     * @return List&lt;ClusterUpgradeHistory&gt;
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
    public List<ClusterUpgradeHistory> getClusterUpgradeHistories(
            GetClusterUpgradeHistoriesRequestBody getClusterUpgradeHistoriesRequestBody)
            throws ApiException {
        ApiResponse<List<ClusterUpgradeHistory>> localVarResp =
                getClusterUpgradeHistoriesWithHttpInfo(getClusterUpgradeHistoriesRequestBody);
        return localVarResp.getData();
    }

    /**
     * @param getClusterUpgradeHistoriesRequestBody (required)
     * @return ApiResponse&lt;List&lt;ClusterUpgradeHistory&gt;&gt;
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
    public ApiResponse<List<ClusterUpgradeHistory>> getClusterUpgradeHistoriesWithHttpInfo(
            GetClusterUpgradeHistoriesRequestBody getClusterUpgradeHistoriesRequestBody)
            throws ApiException {
        okhttp3.Call localVarCall =
                getClusterUpgradeHistoriesValidateBeforeCall(
                        getClusterUpgradeHistoriesRequestBody, null);
        Type localVarReturnType = new TypeToken<List<ClusterUpgradeHistory>>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param getClusterUpgradeHistoriesRequestBody (required)
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
    public okhttp3.Call getClusterUpgradeHistoriesAsync(
            GetClusterUpgradeHistoriesRequestBody getClusterUpgradeHistoriesRequestBody,
            final ApiCallback<List<ClusterUpgradeHistory>> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                getClusterUpgradeHistoriesValidateBeforeCall(
                        getClusterUpgradeHistoriesRequestBody, _callback);
        Type localVarReturnType = new TypeToken<List<ClusterUpgradeHistory>>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getClusterUpgradeHistoriesConnection
     *
     * @param getClusterUpgradeHistoriesConnectionRequestBody (required)
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
    public okhttp3.Call getClusterUpgradeHistoriesConnectionCall(
            GetClusterUpgradeHistoriesConnectionRequestBody
                    getClusterUpgradeHistoriesConnectionRequestBody,
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

        Object localVarPostBody = getClusterUpgradeHistoriesConnectionRequestBody;

        // create path and map variables
        String localVarPath = "/get-cluster-upgrade-histories-connection";

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
    private okhttp3.Call getClusterUpgradeHistoriesConnectionValidateBeforeCall(
            GetClusterUpgradeHistoriesConnectionRequestBody
                    getClusterUpgradeHistoriesConnectionRequestBody,
            final ApiCallback _callback)
            throws ApiException {

        // verify the required parameter 'getClusterUpgradeHistoriesConnectionRequestBody' is set
        if (getClusterUpgradeHistoriesConnectionRequestBody == null) {
            throw new ApiException(
                    "Missing the required parameter"
                            + " 'getClusterUpgradeHistoriesConnectionRequestBody' when calling"
                            + " getClusterUpgradeHistoriesConnection(Async)");
        }

        okhttp3.Call localVarCall =
                getClusterUpgradeHistoriesConnectionCall(
                        getClusterUpgradeHistoriesConnectionRequestBody, _callback);
        return localVarCall;
    }

    /**
     * @param getClusterUpgradeHistoriesConnectionRequestBody (required)
     * @return ClusterUpgradeHistoryConnection
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
    public ClusterUpgradeHistoryConnection getClusterUpgradeHistoriesConnection(
            GetClusterUpgradeHistoriesConnectionRequestBody
                    getClusterUpgradeHistoriesConnectionRequestBody)
            throws ApiException {
        ApiResponse<ClusterUpgradeHistoryConnection> localVarResp =
                getClusterUpgradeHistoriesConnectionWithHttpInfo(
                        getClusterUpgradeHistoriesConnectionRequestBody);
        return localVarResp.getData();
    }

    /**
     * @param getClusterUpgradeHistoriesConnectionRequestBody (required)
     * @return ApiResponse&lt;ClusterUpgradeHistoryConnection&gt;
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
    public ApiResponse<ClusterUpgradeHistoryConnection>
            getClusterUpgradeHistoriesConnectionWithHttpInfo(
                    GetClusterUpgradeHistoriesConnectionRequestBody
                            getClusterUpgradeHistoriesConnectionRequestBody)
                    throws ApiException {
        okhttp3.Call localVarCall =
                getClusterUpgradeHistoriesConnectionValidateBeforeCall(
                        getClusterUpgradeHistoriesConnectionRequestBody, null);
        Type localVarReturnType = new TypeToken<ClusterUpgradeHistoryConnection>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param getClusterUpgradeHistoriesConnectionRequestBody (required)
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
    public okhttp3.Call getClusterUpgradeHistoriesConnectionAsync(
            GetClusterUpgradeHistoriesConnectionRequestBody
                    getClusterUpgradeHistoriesConnectionRequestBody,
            final ApiCallback<ClusterUpgradeHistoryConnection> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                getClusterUpgradeHistoriesConnectionValidateBeforeCall(
                        getClusterUpgradeHistoriesConnectionRequestBody, _callback);
        Type localVarReturnType = new TypeToken<ClusterUpgradeHistoryConnection>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}

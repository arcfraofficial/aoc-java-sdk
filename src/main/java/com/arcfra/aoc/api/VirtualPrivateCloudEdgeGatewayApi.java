package com.arcfra.aoc.api;


import com.arcfra.aoc.ApiCallback;
import com.arcfra.aoc.ApiClient;
import com.arcfra.aoc.ApiException;
import com.arcfra.aoc.ApiResponse;
import com.arcfra.aoc.Configuration;
import com.arcfra.aoc.Pair;
import com.arcfra.aoc.model.GetVirtualPrivateCloudEdgeGatewaysConnectionRequestBody;
import com.arcfra.aoc.model.GetVirtualPrivateCloudEdgeGatewaysRequestBody;
import com.arcfra.aoc.model.VirtualPrivateCloudEdgeGateway;
import com.arcfra.aoc.model.VirtualPrivateCloudEdgeGatewayConnection;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VirtualPrivateCloudEdgeGatewayApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public VirtualPrivateCloudEdgeGatewayApi() {
        this(Configuration.getDefaultApiClient());
    }

    public VirtualPrivateCloudEdgeGatewayApi(ApiClient apiClient) {
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
     * Build call for getVirtualPrivateCloudEdgeGateways
     *
     * @param getVirtualPrivateCloudEdgeGatewaysRequestBody (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td>  </td><td>  * CommonHeader -  <br>  </td></tr>
     * <tr><td> 400 </td><td> Bad request </td><td>  * CommonHeader -  <br>  </td></tr>
     * <tr><td> 404 </td><td> Not found </td><td>  * CommonHeader -  <br>  </td></tr>
     * <tr><td> 500 </td><td> Server error </td><td>  * CommonHeader -  <br>  </td></tr>
     * </table>
     */
    public okhttp3.Call getVirtualPrivateCloudEdgeGatewaysCall(
            GetVirtualPrivateCloudEdgeGatewaysRequestBody
                    getVirtualPrivateCloudEdgeGatewaysRequestBody,
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

        Object localVarPostBody = getVirtualPrivateCloudEdgeGatewaysRequestBody;

        // create path and map variables
        String localVarPath = "/get-virtual-private-cloud-edge-gateways";

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
    private okhttp3.Call getVirtualPrivateCloudEdgeGatewaysValidateBeforeCall(
            GetVirtualPrivateCloudEdgeGatewaysRequestBody
                    getVirtualPrivateCloudEdgeGatewaysRequestBody,
            final ApiCallback _callback)
            throws ApiException {

        // verify the required parameter 'getVirtualPrivateCloudEdgeGatewaysRequestBody' is set
        if (getVirtualPrivateCloudEdgeGatewaysRequestBody == null) {
            throw new ApiException(
                    "Missing the required parameter"
                            + " 'getVirtualPrivateCloudEdgeGatewaysRequestBody' when calling"
                            + " getVirtualPrivateCloudEdgeGateways(Async)");
        }

        okhttp3.Call localVarCall =
                getVirtualPrivateCloudEdgeGatewaysCall(
                        getVirtualPrivateCloudEdgeGatewaysRequestBody, _callback);
        return localVarCall;
    }

    /**
     * @param getVirtualPrivateCloudEdgeGatewaysRequestBody (required)
     * @return List&lt;VirtualPrivateCloudEdgeGateway&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td>  </td><td>  * CommonHeader -  <br>  </td></tr>
     * <tr><td> 400 </td><td> Bad request </td><td>  * CommonHeader -  <br>  </td></tr>
     * <tr><td> 404 </td><td> Not found </td><td>  * CommonHeader -  <br>  </td></tr>
     * <tr><td> 500 </td><td> Server error </td><td>  * CommonHeader -  <br>  </td></tr>
     * </table>
     */
    public List<VirtualPrivateCloudEdgeGateway> getVirtualPrivateCloudEdgeGateways(
            GetVirtualPrivateCloudEdgeGatewaysRequestBody
                    getVirtualPrivateCloudEdgeGatewaysRequestBody)
            throws ApiException {
        ApiResponse<List<VirtualPrivateCloudEdgeGateway>> localVarResp =
                getVirtualPrivateCloudEdgeGatewaysWithHttpInfo(
                        getVirtualPrivateCloudEdgeGatewaysRequestBody);
        return localVarResp.getData();
    }

    /**
     * @param getVirtualPrivateCloudEdgeGatewaysRequestBody (required)
     * @return ApiResponse&lt;List&lt;VirtualPrivateCloudEdgeGateway&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td>  </td><td>  * CommonHeader -  <br>  </td></tr>
     * <tr><td> 400 </td><td> Bad request </td><td>  * CommonHeader -  <br>  </td></tr>
     * <tr><td> 404 </td><td> Not found </td><td>  * CommonHeader -  <br>  </td></tr>
     * <tr><td> 500 </td><td> Server error </td><td>  * CommonHeader -  <br>  </td></tr>
     * </table>
     */
    public ApiResponse<List<VirtualPrivateCloudEdgeGateway>>
            getVirtualPrivateCloudEdgeGatewaysWithHttpInfo(
                    GetVirtualPrivateCloudEdgeGatewaysRequestBody
                            getVirtualPrivateCloudEdgeGatewaysRequestBody)
                    throws ApiException {
        okhttp3.Call localVarCall =
                getVirtualPrivateCloudEdgeGatewaysValidateBeforeCall(
                        getVirtualPrivateCloudEdgeGatewaysRequestBody, null);
        Type localVarReturnType =
                new TypeToken<List<VirtualPrivateCloudEdgeGateway>>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param getVirtualPrivateCloudEdgeGatewaysRequestBody (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td>  </td><td>  * CommonHeader -  <br>  </td></tr>
     * <tr><td> 400 </td><td> Bad request </td><td>  * CommonHeader -  <br>  </td></tr>
     * <tr><td> 404 </td><td> Not found </td><td>  * CommonHeader -  <br>  </td></tr>
     * <tr><td> 500 </td><td> Server error </td><td>  * CommonHeader -  <br>  </td></tr>
     * </table>
     */
    public okhttp3.Call getVirtualPrivateCloudEdgeGatewaysAsync(
            GetVirtualPrivateCloudEdgeGatewaysRequestBody
                    getVirtualPrivateCloudEdgeGatewaysRequestBody,
            final ApiCallback<List<VirtualPrivateCloudEdgeGateway>> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                getVirtualPrivateCloudEdgeGatewaysValidateBeforeCall(
                        getVirtualPrivateCloudEdgeGatewaysRequestBody, _callback);
        Type localVarReturnType =
                new TypeToken<List<VirtualPrivateCloudEdgeGateway>>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getVirtualPrivateCloudEdgeGatewaysConnection
     *
     * @param getVirtualPrivateCloudEdgeGatewaysConnectionRequestBody (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td>  </td><td>  * CommonHeader -  <br>  </td></tr>
     * <tr><td> 400 </td><td> Bad request </td><td>  * CommonHeader -  <br>  </td></tr>
     * <tr><td> 404 </td><td> Not found </td><td>  * CommonHeader -  <br>  </td></tr>
     * <tr><td> 500 </td><td> Server error </td><td>  * CommonHeader -  <br>  </td></tr>
     * </table>
     */
    public okhttp3.Call getVirtualPrivateCloudEdgeGatewaysConnectionCall(
            GetVirtualPrivateCloudEdgeGatewaysConnectionRequestBody
                    getVirtualPrivateCloudEdgeGatewaysConnectionRequestBody,
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

        Object localVarPostBody = getVirtualPrivateCloudEdgeGatewaysConnectionRequestBody;

        // create path and map variables
        String localVarPath = "/get-virtual-private-cloud-edge-gateways-connection";

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
    private okhttp3.Call getVirtualPrivateCloudEdgeGatewaysConnectionValidateBeforeCall(
            GetVirtualPrivateCloudEdgeGatewaysConnectionRequestBody
                    getVirtualPrivateCloudEdgeGatewaysConnectionRequestBody,
            final ApiCallback _callback)
            throws ApiException {

        // verify the required parameter 'getVirtualPrivateCloudEdgeGatewaysConnectionRequestBody'
        // is set
        if (getVirtualPrivateCloudEdgeGatewaysConnectionRequestBody == null) {
            throw new ApiException(
                    "Missing the required parameter"
                        + " 'getVirtualPrivateCloudEdgeGatewaysConnectionRequestBody' when calling"
                        + " getVirtualPrivateCloudEdgeGatewaysConnection(Async)");
        }

        okhttp3.Call localVarCall =
                getVirtualPrivateCloudEdgeGatewaysConnectionCall(
                        getVirtualPrivateCloudEdgeGatewaysConnectionRequestBody, _callback);
        return localVarCall;
    }

    /**
     * @param getVirtualPrivateCloudEdgeGatewaysConnectionRequestBody (required)
     * @return VirtualPrivateCloudEdgeGatewayConnection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td>  </td><td>  * CommonHeader -  <br>  </td></tr>
     * <tr><td> 400 </td><td> Bad request </td><td>  * CommonHeader -  <br>  </td></tr>
     * <tr><td> 404 </td><td> Not found </td><td>  * CommonHeader -  <br>  </td></tr>
     * <tr><td> 500 </td><td> Server error </td><td>  * CommonHeader -  <br>  </td></tr>
     * </table>
     */
    public VirtualPrivateCloudEdgeGatewayConnection getVirtualPrivateCloudEdgeGatewaysConnection(
            GetVirtualPrivateCloudEdgeGatewaysConnectionRequestBody
                    getVirtualPrivateCloudEdgeGatewaysConnectionRequestBody)
            throws ApiException {
        ApiResponse<VirtualPrivateCloudEdgeGatewayConnection> localVarResp =
                getVirtualPrivateCloudEdgeGatewaysConnectionWithHttpInfo(
                        getVirtualPrivateCloudEdgeGatewaysConnectionRequestBody);
        return localVarResp.getData();
    }

    /**
     * @param getVirtualPrivateCloudEdgeGatewaysConnectionRequestBody (required)
     * @return ApiResponse&lt;VirtualPrivateCloudEdgeGatewayConnection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td>  </td><td>  * CommonHeader -  <br>  </td></tr>
     * <tr><td> 400 </td><td> Bad request </td><td>  * CommonHeader -  <br>  </td></tr>
     * <tr><td> 404 </td><td> Not found </td><td>  * CommonHeader -  <br>  </td></tr>
     * <tr><td> 500 </td><td> Server error </td><td>  * CommonHeader -  <br>  </td></tr>
     * </table>
     */
    public ApiResponse<VirtualPrivateCloudEdgeGatewayConnection>
            getVirtualPrivateCloudEdgeGatewaysConnectionWithHttpInfo(
                    GetVirtualPrivateCloudEdgeGatewaysConnectionRequestBody
                            getVirtualPrivateCloudEdgeGatewaysConnectionRequestBody)
                    throws ApiException {
        okhttp3.Call localVarCall =
                getVirtualPrivateCloudEdgeGatewaysConnectionValidateBeforeCall(
                        getVirtualPrivateCloudEdgeGatewaysConnectionRequestBody, null);
        Type localVarReturnType =
                new TypeToken<VirtualPrivateCloudEdgeGatewayConnection>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param getVirtualPrivateCloudEdgeGatewaysConnectionRequestBody (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td>  </td><td>  * CommonHeader -  <br>  </td></tr>
     * <tr><td> 400 </td><td> Bad request </td><td>  * CommonHeader -  <br>  </td></tr>
     * <tr><td> 404 </td><td> Not found </td><td>  * CommonHeader -  <br>  </td></tr>
     * <tr><td> 500 </td><td> Server error </td><td>  * CommonHeader -  <br>  </td></tr>
     * </table>
     */
    public okhttp3.Call getVirtualPrivateCloudEdgeGatewaysConnectionAsync(
            GetVirtualPrivateCloudEdgeGatewaysConnectionRequestBody
                    getVirtualPrivateCloudEdgeGatewaysConnectionRequestBody,
            final ApiCallback<VirtualPrivateCloudEdgeGatewayConnection> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                getVirtualPrivateCloudEdgeGatewaysConnectionValidateBeforeCall(
                        getVirtualPrivateCloudEdgeGatewaysConnectionRequestBody, _callback);
        Type localVarReturnType =
                new TypeToken<VirtualPrivateCloudEdgeGatewayConnection>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}

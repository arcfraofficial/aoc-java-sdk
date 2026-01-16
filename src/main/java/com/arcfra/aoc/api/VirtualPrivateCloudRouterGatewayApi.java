package com.arcfra.aoc.api;


import com.arcfra.aoc.ApiCallback;
import com.arcfra.aoc.ApiClient;
import com.arcfra.aoc.ApiException;
import com.arcfra.aoc.ApiResponse;
import com.arcfra.aoc.Configuration;
import com.arcfra.aoc.Pair;
import com.arcfra.aoc.model.GetVirtualPrivateCloudRouterGatewaysConnectionRequestBody;
import com.arcfra.aoc.model.GetVirtualPrivateCloudRouterGatewaysRequestBody;
import com.arcfra.aoc.model.VirtualPrivateCloudRouterGateway;
import com.arcfra.aoc.model.VirtualPrivateCloudRouterGatewayConnection;
import com.arcfra.aoc.model.VirtualPrivateCloudRouterGatewayCreationParams;
import com.arcfra.aoc.model.VirtualPrivateCloudRouterGatewayDeletionParams;
import com.arcfra.aoc.model.VirtualPrivateCloudRouterGatewayUpdationParams;
import com.arcfra.aoc.model.WithTaskDeleteVirtualPrivateCloudRouterGateway;
import com.arcfra.aoc.model.WithTaskVirtualPrivateCloudRouterGateway;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VirtualPrivateCloudRouterGatewayApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public VirtualPrivateCloudRouterGatewayApi() {
        this(Configuration.getDefaultApiClient());
    }

    public VirtualPrivateCloudRouterGatewayApi(ApiClient apiClient) {
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
     * Build call for createVirtualPrivateCloudRouterGateway
     *
     * @param virtualPrivateCloudRouterGatewayCreationParams (required)
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
    public okhttp3.Call createVirtualPrivateCloudRouterGatewayCall(
            List<VirtualPrivateCloudRouterGatewayCreationParams>
                    virtualPrivateCloudRouterGatewayCreationParams,
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

        Object localVarPostBody = virtualPrivateCloudRouterGatewayCreationParams;

        // create path and map variables
        String localVarPath = "/create-virtual-private-cloud-router-gateway";

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
    private okhttp3.Call createVirtualPrivateCloudRouterGatewayValidateBeforeCall(
            List<VirtualPrivateCloudRouterGatewayCreationParams>
                    virtualPrivateCloudRouterGatewayCreationParams,
            final ApiCallback _callback)
            throws ApiException {

        // verify the required parameter 'virtualPrivateCloudRouterGatewayCreationParams' is set
        if (virtualPrivateCloudRouterGatewayCreationParams == null) {
            throw new ApiException(
                    "Missing the required parameter"
                            + " 'virtualPrivateCloudRouterGatewayCreationParams' when calling"
                            + " createVirtualPrivateCloudRouterGateway(Async)");
        }

        okhttp3.Call localVarCall =
                createVirtualPrivateCloudRouterGatewayCall(
                        virtualPrivateCloudRouterGatewayCreationParams, _callback);
        return localVarCall;
    }

    /**
     * @param virtualPrivateCloudRouterGatewayCreationParams (required)
     * @return List&lt;WithTaskVirtualPrivateCloudRouterGateway&gt;
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
    public List<WithTaskVirtualPrivateCloudRouterGateway> createVirtualPrivateCloudRouterGateway(
            List<VirtualPrivateCloudRouterGatewayCreationParams>
                    virtualPrivateCloudRouterGatewayCreationParams)
            throws ApiException {
        ApiResponse<List<WithTaskVirtualPrivateCloudRouterGateway>> localVarResp =
                createVirtualPrivateCloudRouterGatewayWithHttpInfo(
                        virtualPrivateCloudRouterGatewayCreationParams);
        return localVarResp.getData();
    }

    /**
     * @param virtualPrivateCloudRouterGatewayCreationParams (required)
     * @return ApiResponse&lt;List&lt;WithTaskVirtualPrivateCloudRouterGateway&gt;&gt;
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
    public ApiResponse<List<WithTaskVirtualPrivateCloudRouterGateway>>
            createVirtualPrivateCloudRouterGatewayWithHttpInfo(
                    List<VirtualPrivateCloudRouterGatewayCreationParams>
                            virtualPrivateCloudRouterGatewayCreationParams)
                    throws ApiException {
        okhttp3.Call localVarCall =
                createVirtualPrivateCloudRouterGatewayValidateBeforeCall(
                        virtualPrivateCloudRouterGatewayCreationParams, null);
        Type localVarReturnType =
                new TypeToken<List<WithTaskVirtualPrivateCloudRouterGateway>>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param virtualPrivateCloudRouterGatewayCreationParams (required)
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
    public okhttp3.Call createVirtualPrivateCloudRouterGatewayAsync(
            List<VirtualPrivateCloudRouterGatewayCreationParams>
                    virtualPrivateCloudRouterGatewayCreationParams,
            final ApiCallback<List<WithTaskVirtualPrivateCloudRouterGateway>> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                createVirtualPrivateCloudRouterGatewayValidateBeforeCall(
                        virtualPrivateCloudRouterGatewayCreationParams, _callback);
        Type localVarReturnType =
                new TypeToken<List<WithTaskVirtualPrivateCloudRouterGateway>>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteVirtualPrivateCloudRouterGateway
     *
     * @param virtualPrivateCloudRouterGatewayDeletionParams (required)
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
    public okhttp3.Call deleteVirtualPrivateCloudRouterGatewayCall(
            VirtualPrivateCloudRouterGatewayDeletionParams
                    virtualPrivateCloudRouterGatewayDeletionParams,
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

        Object localVarPostBody = virtualPrivateCloudRouterGatewayDeletionParams;

        // create path and map variables
        String localVarPath = "/delete-virtual-private-cloud-router-gateway";

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
    private okhttp3.Call deleteVirtualPrivateCloudRouterGatewayValidateBeforeCall(
            VirtualPrivateCloudRouterGatewayDeletionParams
                    virtualPrivateCloudRouterGatewayDeletionParams,
            final ApiCallback _callback)
            throws ApiException {

        // verify the required parameter 'virtualPrivateCloudRouterGatewayDeletionParams' is set
        if (virtualPrivateCloudRouterGatewayDeletionParams == null) {
            throw new ApiException(
                    "Missing the required parameter"
                            + " 'virtualPrivateCloudRouterGatewayDeletionParams' when calling"
                            + " deleteVirtualPrivateCloudRouterGateway(Async)");
        }

        okhttp3.Call localVarCall =
                deleteVirtualPrivateCloudRouterGatewayCall(
                        virtualPrivateCloudRouterGatewayDeletionParams, _callback);
        return localVarCall;
    }

    /**
     * @param virtualPrivateCloudRouterGatewayDeletionParams (required)
     * @return List&lt;WithTaskDeleteVirtualPrivateCloudRouterGateway&gt;
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
    public List<WithTaskDeleteVirtualPrivateCloudRouterGateway>
            deleteVirtualPrivateCloudRouterGateway(
                    VirtualPrivateCloudRouterGatewayDeletionParams
                            virtualPrivateCloudRouterGatewayDeletionParams)
                    throws ApiException {
        ApiResponse<List<WithTaskDeleteVirtualPrivateCloudRouterGateway>> localVarResp =
                deleteVirtualPrivateCloudRouterGatewayWithHttpInfo(
                        virtualPrivateCloudRouterGatewayDeletionParams);
        return localVarResp.getData();
    }

    /**
     * @param virtualPrivateCloudRouterGatewayDeletionParams (required)
     * @return ApiResponse&lt;List&lt;WithTaskDeleteVirtualPrivateCloudRouterGateway&gt;&gt;
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
    public ApiResponse<List<WithTaskDeleteVirtualPrivateCloudRouterGateway>>
            deleteVirtualPrivateCloudRouterGatewayWithHttpInfo(
                    VirtualPrivateCloudRouterGatewayDeletionParams
                            virtualPrivateCloudRouterGatewayDeletionParams)
                    throws ApiException {
        okhttp3.Call localVarCall =
                deleteVirtualPrivateCloudRouterGatewayValidateBeforeCall(
                        virtualPrivateCloudRouterGatewayDeletionParams, null);
        Type localVarReturnType =
                new TypeToken<List<WithTaskDeleteVirtualPrivateCloudRouterGateway>>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param virtualPrivateCloudRouterGatewayDeletionParams (required)
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
    public okhttp3.Call deleteVirtualPrivateCloudRouterGatewayAsync(
            VirtualPrivateCloudRouterGatewayDeletionParams
                    virtualPrivateCloudRouterGatewayDeletionParams,
            final ApiCallback<List<WithTaskDeleteVirtualPrivateCloudRouterGateway>> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                deleteVirtualPrivateCloudRouterGatewayValidateBeforeCall(
                        virtualPrivateCloudRouterGatewayDeletionParams, _callback);
        Type localVarReturnType =
                new TypeToken<List<WithTaskDeleteVirtualPrivateCloudRouterGateway>>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getVirtualPrivateCloudRouterGateways
     *
     * @param getVirtualPrivateCloudRouterGatewaysRequestBody (required)
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
    public okhttp3.Call getVirtualPrivateCloudRouterGatewaysCall(
            GetVirtualPrivateCloudRouterGatewaysRequestBody
                    getVirtualPrivateCloudRouterGatewaysRequestBody,
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

        Object localVarPostBody = getVirtualPrivateCloudRouterGatewaysRequestBody;

        // create path and map variables
        String localVarPath = "/get-virtual-private-cloud-router-gateways";

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
    private okhttp3.Call getVirtualPrivateCloudRouterGatewaysValidateBeforeCall(
            GetVirtualPrivateCloudRouterGatewaysRequestBody
                    getVirtualPrivateCloudRouterGatewaysRequestBody,
            final ApiCallback _callback)
            throws ApiException {

        // verify the required parameter 'getVirtualPrivateCloudRouterGatewaysRequestBody' is set
        if (getVirtualPrivateCloudRouterGatewaysRequestBody == null) {
            throw new ApiException(
                    "Missing the required parameter"
                            + " 'getVirtualPrivateCloudRouterGatewaysRequestBody' when calling"
                            + " getVirtualPrivateCloudRouterGateways(Async)");
        }

        okhttp3.Call localVarCall =
                getVirtualPrivateCloudRouterGatewaysCall(
                        getVirtualPrivateCloudRouterGatewaysRequestBody, _callback);
        return localVarCall;
    }

    /**
     * @param getVirtualPrivateCloudRouterGatewaysRequestBody (required)
     * @return List&lt;VirtualPrivateCloudRouterGateway&gt;
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
    public List<VirtualPrivateCloudRouterGateway> getVirtualPrivateCloudRouterGateways(
            GetVirtualPrivateCloudRouterGatewaysRequestBody
                    getVirtualPrivateCloudRouterGatewaysRequestBody)
            throws ApiException {
        ApiResponse<List<VirtualPrivateCloudRouterGateway>> localVarResp =
                getVirtualPrivateCloudRouterGatewaysWithHttpInfo(
                        getVirtualPrivateCloudRouterGatewaysRequestBody);
        return localVarResp.getData();
    }

    /**
     * @param getVirtualPrivateCloudRouterGatewaysRequestBody (required)
     * @return ApiResponse&lt;List&lt;VirtualPrivateCloudRouterGateway&gt;&gt;
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
    public ApiResponse<List<VirtualPrivateCloudRouterGateway>>
            getVirtualPrivateCloudRouterGatewaysWithHttpInfo(
                    GetVirtualPrivateCloudRouterGatewaysRequestBody
                            getVirtualPrivateCloudRouterGatewaysRequestBody)
                    throws ApiException {
        okhttp3.Call localVarCall =
                getVirtualPrivateCloudRouterGatewaysValidateBeforeCall(
                        getVirtualPrivateCloudRouterGatewaysRequestBody, null);
        Type localVarReturnType =
                new TypeToken<List<VirtualPrivateCloudRouterGateway>>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param getVirtualPrivateCloudRouterGatewaysRequestBody (required)
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
    public okhttp3.Call getVirtualPrivateCloudRouterGatewaysAsync(
            GetVirtualPrivateCloudRouterGatewaysRequestBody
                    getVirtualPrivateCloudRouterGatewaysRequestBody,
            final ApiCallback<List<VirtualPrivateCloudRouterGateway>> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                getVirtualPrivateCloudRouterGatewaysValidateBeforeCall(
                        getVirtualPrivateCloudRouterGatewaysRequestBody, _callback);
        Type localVarReturnType =
                new TypeToken<List<VirtualPrivateCloudRouterGateway>>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getVirtualPrivateCloudRouterGatewaysConnection
     *
     * @param getVirtualPrivateCloudRouterGatewaysConnectionRequestBody (required)
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
    public okhttp3.Call getVirtualPrivateCloudRouterGatewaysConnectionCall(
            GetVirtualPrivateCloudRouterGatewaysConnectionRequestBody
                    getVirtualPrivateCloudRouterGatewaysConnectionRequestBody,
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

        Object localVarPostBody = getVirtualPrivateCloudRouterGatewaysConnectionRequestBody;

        // create path and map variables
        String localVarPath = "/get-virtual-private-cloud-router-gateways-connection";

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
    private okhttp3.Call getVirtualPrivateCloudRouterGatewaysConnectionValidateBeforeCall(
            GetVirtualPrivateCloudRouterGatewaysConnectionRequestBody
                    getVirtualPrivateCloudRouterGatewaysConnectionRequestBody,
            final ApiCallback _callback)
            throws ApiException {

        // verify the required parameter 'getVirtualPrivateCloudRouterGatewaysConnectionRequestBody'
        // is set
        if (getVirtualPrivateCloudRouterGatewaysConnectionRequestBody == null) {
            throw new ApiException(
                    "Missing the required parameter"
                            + " 'getVirtualPrivateCloudRouterGatewaysConnectionRequestBody' when"
                            + " calling getVirtualPrivateCloudRouterGatewaysConnection(Async)");
        }

        okhttp3.Call localVarCall =
                getVirtualPrivateCloudRouterGatewaysConnectionCall(
                        getVirtualPrivateCloudRouterGatewaysConnectionRequestBody, _callback);
        return localVarCall;
    }

    /**
     * @param getVirtualPrivateCloudRouterGatewaysConnectionRequestBody (required)
     * @return VirtualPrivateCloudRouterGatewayConnection
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
    public VirtualPrivateCloudRouterGatewayConnection
            getVirtualPrivateCloudRouterGatewaysConnection(
                    GetVirtualPrivateCloudRouterGatewaysConnectionRequestBody
                            getVirtualPrivateCloudRouterGatewaysConnectionRequestBody)
                    throws ApiException {
        ApiResponse<VirtualPrivateCloudRouterGatewayConnection> localVarResp =
                getVirtualPrivateCloudRouterGatewaysConnectionWithHttpInfo(
                        getVirtualPrivateCloudRouterGatewaysConnectionRequestBody);
        return localVarResp.getData();
    }

    /**
     * @param getVirtualPrivateCloudRouterGatewaysConnectionRequestBody (required)
     * @return ApiResponse&lt;VirtualPrivateCloudRouterGatewayConnection&gt;
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
    public ApiResponse<VirtualPrivateCloudRouterGatewayConnection>
            getVirtualPrivateCloudRouterGatewaysConnectionWithHttpInfo(
                    GetVirtualPrivateCloudRouterGatewaysConnectionRequestBody
                            getVirtualPrivateCloudRouterGatewaysConnectionRequestBody)
                    throws ApiException {
        okhttp3.Call localVarCall =
                getVirtualPrivateCloudRouterGatewaysConnectionValidateBeforeCall(
                        getVirtualPrivateCloudRouterGatewaysConnectionRequestBody, null);
        Type localVarReturnType =
                new TypeToken<VirtualPrivateCloudRouterGatewayConnection>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param getVirtualPrivateCloudRouterGatewaysConnectionRequestBody (required)
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
    public okhttp3.Call getVirtualPrivateCloudRouterGatewaysConnectionAsync(
            GetVirtualPrivateCloudRouterGatewaysConnectionRequestBody
                    getVirtualPrivateCloudRouterGatewaysConnectionRequestBody,
            final ApiCallback<VirtualPrivateCloudRouterGatewayConnection> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                getVirtualPrivateCloudRouterGatewaysConnectionValidateBeforeCall(
                        getVirtualPrivateCloudRouterGatewaysConnectionRequestBody, _callback);
        Type localVarReturnType =
                new TypeToken<VirtualPrivateCloudRouterGatewayConnection>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateVirtualPrivateCloudRouterGateway
     *
     * @param virtualPrivateCloudRouterGatewayUpdationParams (required)
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
    public okhttp3.Call updateVirtualPrivateCloudRouterGatewayCall(
            VirtualPrivateCloudRouterGatewayUpdationParams
                    virtualPrivateCloudRouterGatewayUpdationParams,
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

        Object localVarPostBody = virtualPrivateCloudRouterGatewayUpdationParams;

        // create path and map variables
        String localVarPath = "/update-virtual-private-cloud-router-gateway";

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
    private okhttp3.Call updateVirtualPrivateCloudRouterGatewayValidateBeforeCall(
            VirtualPrivateCloudRouterGatewayUpdationParams
                    virtualPrivateCloudRouterGatewayUpdationParams,
            final ApiCallback _callback)
            throws ApiException {

        // verify the required parameter 'virtualPrivateCloudRouterGatewayUpdationParams' is set
        if (virtualPrivateCloudRouterGatewayUpdationParams == null) {
            throw new ApiException(
                    "Missing the required parameter"
                            + " 'virtualPrivateCloudRouterGatewayUpdationParams' when calling"
                            + " updateVirtualPrivateCloudRouterGateway(Async)");
        }

        okhttp3.Call localVarCall =
                updateVirtualPrivateCloudRouterGatewayCall(
                        virtualPrivateCloudRouterGatewayUpdationParams, _callback);
        return localVarCall;
    }

    /**
     * @param virtualPrivateCloudRouterGatewayUpdationParams (required)
     * @return List&lt;WithTaskVirtualPrivateCloudRouterGateway&gt;
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
    public List<WithTaskVirtualPrivateCloudRouterGateway> updateVirtualPrivateCloudRouterGateway(
            VirtualPrivateCloudRouterGatewayUpdationParams
                    virtualPrivateCloudRouterGatewayUpdationParams)
            throws ApiException {
        ApiResponse<List<WithTaskVirtualPrivateCloudRouterGateway>> localVarResp =
                updateVirtualPrivateCloudRouterGatewayWithHttpInfo(
                        virtualPrivateCloudRouterGatewayUpdationParams);
        return localVarResp.getData();
    }

    /**
     * @param virtualPrivateCloudRouterGatewayUpdationParams (required)
     * @return ApiResponse&lt;List&lt;WithTaskVirtualPrivateCloudRouterGateway&gt;&gt;
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
    public ApiResponse<List<WithTaskVirtualPrivateCloudRouterGateway>>
            updateVirtualPrivateCloudRouterGatewayWithHttpInfo(
                    VirtualPrivateCloudRouterGatewayUpdationParams
                            virtualPrivateCloudRouterGatewayUpdationParams)
                    throws ApiException {
        okhttp3.Call localVarCall =
                updateVirtualPrivateCloudRouterGatewayValidateBeforeCall(
                        virtualPrivateCloudRouterGatewayUpdationParams, null);
        Type localVarReturnType =
                new TypeToken<List<WithTaskVirtualPrivateCloudRouterGateway>>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param virtualPrivateCloudRouterGatewayUpdationParams (required)
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
    public okhttp3.Call updateVirtualPrivateCloudRouterGatewayAsync(
            VirtualPrivateCloudRouterGatewayUpdationParams
                    virtualPrivateCloudRouterGatewayUpdationParams,
            final ApiCallback<List<WithTaskVirtualPrivateCloudRouterGateway>> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                updateVirtualPrivateCloudRouterGatewayValidateBeforeCall(
                        virtualPrivateCloudRouterGatewayUpdationParams, _callback);
        Type localVarReturnType =
                new TypeToken<List<WithTaskVirtualPrivateCloudRouterGateway>>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}

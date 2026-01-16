package com.arcfra.aoc.api;


import com.arcfra.aoc.ApiCallback;
import com.arcfra.aoc.ApiClient;
import com.arcfra.aoc.ApiException;
import com.arcfra.aoc.ApiResponse;
import com.arcfra.aoc.Configuration;
import com.arcfra.aoc.Pair;
import com.arcfra.aoc.model.GetVirtualPrivateCloudsConnectionRequestBody;
import com.arcfra.aoc.model.GetVirtualPrivateCloudsRequestBody;
import com.arcfra.aoc.model.VirtualPrivateCloud;
import com.arcfra.aoc.model.VirtualPrivateCloudConnection;
import com.arcfra.aoc.model.VirtualPrivateCloudCreationParams;
import com.arcfra.aoc.model.VirtualPrivateCloudDeletionParams;
import com.arcfra.aoc.model.VirtualPrivateCloudUpdationParams;
import com.arcfra.aoc.model.WithTaskDeleteVirtualPrivateCloud;
import com.arcfra.aoc.model.WithTaskVirtualPrivateCloud;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VirtualPrivateCloudApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public VirtualPrivateCloudApi() {
        this(Configuration.getDefaultApiClient());
    }

    public VirtualPrivateCloudApi(ApiClient apiClient) {
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
     * Build call for createVirtualPrivateCloud
     *
     * @param virtualPrivateCloudCreationParams (required)
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
    public okhttp3.Call createVirtualPrivateCloudCall(
            List<VirtualPrivateCloudCreationParams> virtualPrivateCloudCreationParams,
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

        Object localVarPostBody = virtualPrivateCloudCreationParams;

        // create path and map variables
        String localVarPath = "/create-virtual-private-cloud";

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
    private okhttp3.Call createVirtualPrivateCloudValidateBeforeCall(
            List<VirtualPrivateCloudCreationParams> virtualPrivateCloudCreationParams,
            final ApiCallback _callback)
            throws ApiException {

        // verify the required parameter 'virtualPrivateCloudCreationParams' is set
        if (virtualPrivateCloudCreationParams == null) {
            throw new ApiException(
                    "Missing the required parameter 'virtualPrivateCloudCreationParams' when"
                            + " calling createVirtualPrivateCloud(Async)");
        }

        okhttp3.Call localVarCall =
                createVirtualPrivateCloudCall(virtualPrivateCloudCreationParams, _callback);
        return localVarCall;
    }

    /**
     * @param virtualPrivateCloudCreationParams (required)
     * @return List&lt;WithTaskVirtualPrivateCloud&gt;
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
    public List<WithTaskVirtualPrivateCloud> createVirtualPrivateCloud(
            List<VirtualPrivateCloudCreationParams> virtualPrivateCloudCreationParams)
            throws ApiException {
        ApiResponse<List<WithTaskVirtualPrivateCloud>> localVarResp =
                createVirtualPrivateCloudWithHttpInfo(virtualPrivateCloudCreationParams);
        return localVarResp.getData();
    }

    /**
     * @param virtualPrivateCloudCreationParams (required)
     * @return ApiResponse&lt;List&lt;WithTaskVirtualPrivateCloud&gt;&gt;
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
    public ApiResponse<List<WithTaskVirtualPrivateCloud>> createVirtualPrivateCloudWithHttpInfo(
            List<VirtualPrivateCloudCreationParams> virtualPrivateCloudCreationParams)
            throws ApiException {
        okhttp3.Call localVarCall =
                createVirtualPrivateCloudValidateBeforeCall(
                        virtualPrivateCloudCreationParams, null);
        Type localVarReturnType = new TypeToken<List<WithTaskVirtualPrivateCloud>>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param virtualPrivateCloudCreationParams (required)
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
    public okhttp3.Call createVirtualPrivateCloudAsync(
            List<VirtualPrivateCloudCreationParams> virtualPrivateCloudCreationParams,
            final ApiCallback<List<WithTaskVirtualPrivateCloud>> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                createVirtualPrivateCloudValidateBeforeCall(
                        virtualPrivateCloudCreationParams, _callback);
        Type localVarReturnType = new TypeToken<List<WithTaskVirtualPrivateCloud>>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteVirtualPrivateCloud
     *
     * @param virtualPrivateCloudDeletionParams (required)
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
    public okhttp3.Call deleteVirtualPrivateCloudCall(
            VirtualPrivateCloudDeletionParams virtualPrivateCloudDeletionParams,
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

        Object localVarPostBody = virtualPrivateCloudDeletionParams;

        // create path and map variables
        String localVarPath = "/delete-virtual-private-cloud";

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
    private okhttp3.Call deleteVirtualPrivateCloudValidateBeforeCall(
            VirtualPrivateCloudDeletionParams virtualPrivateCloudDeletionParams,
            final ApiCallback _callback)
            throws ApiException {

        // verify the required parameter 'virtualPrivateCloudDeletionParams' is set
        if (virtualPrivateCloudDeletionParams == null) {
            throw new ApiException(
                    "Missing the required parameter 'virtualPrivateCloudDeletionParams' when"
                            + " calling deleteVirtualPrivateCloud(Async)");
        }

        okhttp3.Call localVarCall =
                deleteVirtualPrivateCloudCall(virtualPrivateCloudDeletionParams, _callback);
        return localVarCall;
    }

    /**
     * @param virtualPrivateCloudDeletionParams (required)
     * @return List&lt;WithTaskDeleteVirtualPrivateCloud&gt;
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
    public List<WithTaskDeleteVirtualPrivateCloud> deleteVirtualPrivateCloud(
            VirtualPrivateCloudDeletionParams virtualPrivateCloudDeletionParams)
            throws ApiException {
        ApiResponse<List<WithTaskDeleteVirtualPrivateCloud>> localVarResp =
                deleteVirtualPrivateCloudWithHttpInfo(virtualPrivateCloudDeletionParams);
        return localVarResp.getData();
    }

    /**
     * @param virtualPrivateCloudDeletionParams (required)
     * @return ApiResponse&lt;List&lt;WithTaskDeleteVirtualPrivateCloud&gt;&gt;
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
    public ApiResponse<List<WithTaskDeleteVirtualPrivateCloud>>
            deleteVirtualPrivateCloudWithHttpInfo(
                    VirtualPrivateCloudDeletionParams virtualPrivateCloudDeletionParams)
                    throws ApiException {
        okhttp3.Call localVarCall =
                deleteVirtualPrivateCloudValidateBeforeCall(
                        virtualPrivateCloudDeletionParams, null);
        Type localVarReturnType =
                new TypeToken<List<WithTaskDeleteVirtualPrivateCloud>>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param virtualPrivateCloudDeletionParams (required)
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
    public okhttp3.Call deleteVirtualPrivateCloudAsync(
            VirtualPrivateCloudDeletionParams virtualPrivateCloudDeletionParams,
            final ApiCallback<List<WithTaskDeleteVirtualPrivateCloud>> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                deleteVirtualPrivateCloudValidateBeforeCall(
                        virtualPrivateCloudDeletionParams, _callback);
        Type localVarReturnType =
                new TypeToken<List<WithTaskDeleteVirtualPrivateCloud>>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getVirtualPrivateClouds
     *
     * @param getVirtualPrivateCloudsRequestBody (required)
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
    public okhttp3.Call getVirtualPrivateCloudsCall(
            GetVirtualPrivateCloudsRequestBody getVirtualPrivateCloudsRequestBody,
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

        Object localVarPostBody = getVirtualPrivateCloudsRequestBody;

        // create path and map variables
        String localVarPath = "/get-virtual-private-clouds";

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
    private okhttp3.Call getVirtualPrivateCloudsValidateBeforeCall(
            GetVirtualPrivateCloudsRequestBody getVirtualPrivateCloudsRequestBody,
            final ApiCallback _callback)
            throws ApiException {

        // verify the required parameter 'getVirtualPrivateCloudsRequestBody' is set
        if (getVirtualPrivateCloudsRequestBody == null) {
            throw new ApiException(
                    "Missing the required parameter 'getVirtualPrivateCloudsRequestBody' when"
                            + " calling getVirtualPrivateClouds(Async)");
        }

        okhttp3.Call localVarCall =
                getVirtualPrivateCloudsCall(getVirtualPrivateCloudsRequestBody, _callback);
        return localVarCall;
    }

    /**
     * @param getVirtualPrivateCloudsRequestBody (required)
     * @return List&lt;VirtualPrivateCloud&gt;
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
    public List<VirtualPrivateCloud> getVirtualPrivateClouds(
            GetVirtualPrivateCloudsRequestBody getVirtualPrivateCloudsRequestBody)
            throws ApiException {
        ApiResponse<List<VirtualPrivateCloud>> localVarResp =
                getVirtualPrivateCloudsWithHttpInfo(getVirtualPrivateCloudsRequestBody);
        return localVarResp.getData();
    }

    /**
     * @param getVirtualPrivateCloudsRequestBody (required)
     * @return ApiResponse&lt;List&lt;VirtualPrivateCloud&gt;&gt;
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
    public ApiResponse<List<VirtualPrivateCloud>> getVirtualPrivateCloudsWithHttpInfo(
            GetVirtualPrivateCloudsRequestBody getVirtualPrivateCloudsRequestBody)
            throws ApiException {
        okhttp3.Call localVarCall =
                getVirtualPrivateCloudsValidateBeforeCall(getVirtualPrivateCloudsRequestBody, null);
        Type localVarReturnType = new TypeToken<List<VirtualPrivateCloud>>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param getVirtualPrivateCloudsRequestBody (required)
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
    public okhttp3.Call getVirtualPrivateCloudsAsync(
            GetVirtualPrivateCloudsRequestBody getVirtualPrivateCloudsRequestBody,
            final ApiCallback<List<VirtualPrivateCloud>> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                getVirtualPrivateCloudsValidateBeforeCall(
                        getVirtualPrivateCloudsRequestBody, _callback);
        Type localVarReturnType = new TypeToken<List<VirtualPrivateCloud>>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getVirtualPrivateCloudsConnection
     *
     * @param getVirtualPrivateCloudsConnectionRequestBody (required)
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
    public okhttp3.Call getVirtualPrivateCloudsConnectionCall(
            GetVirtualPrivateCloudsConnectionRequestBody
                    getVirtualPrivateCloudsConnectionRequestBody,
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

        Object localVarPostBody = getVirtualPrivateCloudsConnectionRequestBody;

        // create path and map variables
        String localVarPath = "/get-virtual-private-clouds-connection";

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
    private okhttp3.Call getVirtualPrivateCloudsConnectionValidateBeforeCall(
            GetVirtualPrivateCloudsConnectionRequestBody
                    getVirtualPrivateCloudsConnectionRequestBody,
            final ApiCallback _callback)
            throws ApiException {

        // verify the required parameter 'getVirtualPrivateCloudsConnectionRequestBody' is set
        if (getVirtualPrivateCloudsConnectionRequestBody == null) {
            throw new ApiException(
                    "Missing the required parameter 'getVirtualPrivateCloudsConnectionRequestBody'"
                            + " when calling getVirtualPrivateCloudsConnection(Async)");
        }

        okhttp3.Call localVarCall =
                getVirtualPrivateCloudsConnectionCall(
                        getVirtualPrivateCloudsConnectionRequestBody, _callback);
        return localVarCall;
    }

    /**
     * @param getVirtualPrivateCloudsConnectionRequestBody (required)
     * @return VirtualPrivateCloudConnection
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
    public VirtualPrivateCloudConnection getVirtualPrivateCloudsConnection(
            GetVirtualPrivateCloudsConnectionRequestBody
                    getVirtualPrivateCloudsConnectionRequestBody)
            throws ApiException {
        ApiResponse<VirtualPrivateCloudConnection> localVarResp =
                getVirtualPrivateCloudsConnectionWithHttpInfo(
                        getVirtualPrivateCloudsConnectionRequestBody);
        return localVarResp.getData();
    }

    /**
     * @param getVirtualPrivateCloudsConnectionRequestBody (required)
     * @return ApiResponse&lt;VirtualPrivateCloudConnection&gt;
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
    public ApiResponse<VirtualPrivateCloudConnection> getVirtualPrivateCloudsConnectionWithHttpInfo(
            GetVirtualPrivateCloudsConnectionRequestBody
                    getVirtualPrivateCloudsConnectionRequestBody)
            throws ApiException {
        okhttp3.Call localVarCall =
                getVirtualPrivateCloudsConnectionValidateBeforeCall(
                        getVirtualPrivateCloudsConnectionRequestBody, null);
        Type localVarReturnType = new TypeToken<VirtualPrivateCloudConnection>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param getVirtualPrivateCloudsConnectionRequestBody (required)
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
    public okhttp3.Call getVirtualPrivateCloudsConnectionAsync(
            GetVirtualPrivateCloudsConnectionRequestBody
                    getVirtualPrivateCloudsConnectionRequestBody,
            final ApiCallback<VirtualPrivateCloudConnection> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                getVirtualPrivateCloudsConnectionValidateBeforeCall(
                        getVirtualPrivateCloudsConnectionRequestBody, _callback);
        Type localVarReturnType = new TypeToken<VirtualPrivateCloudConnection>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateVirtualPrivateCloud
     *
     * @param virtualPrivateCloudUpdationParams (required)
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
    public okhttp3.Call updateVirtualPrivateCloudCall(
            VirtualPrivateCloudUpdationParams virtualPrivateCloudUpdationParams,
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

        Object localVarPostBody = virtualPrivateCloudUpdationParams;

        // create path and map variables
        String localVarPath = "/update-virtual-private-cloud";

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
    private okhttp3.Call updateVirtualPrivateCloudValidateBeforeCall(
            VirtualPrivateCloudUpdationParams virtualPrivateCloudUpdationParams,
            final ApiCallback _callback)
            throws ApiException {

        // verify the required parameter 'virtualPrivateCloudUpdationParams' is set
        if (virtualPrivateCloudUpdationParams == null) {
            throw new ApiException(
                    "Missing the required parameter 'virtualPrivateCloudUpdationParams' when"
                            + " calling updateVirtualPrivateCloud(Async)");
        }

        okhttp3.Call localVarCall =
                updateVirtualPrivateCloudCall(virtualPrivateCloudUpdationParams, _callback);
        return localVarCall;
    }

    /**
     * @param virtualPrivateCloudUpdationParams (required)
     * @return List&lt;WithTaskVirtualPrivateCloud&gt;
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
    public List<WithTaskVirtualPrivateCloud> updateVirtualPrivateCloud(
            VirtualPrivateCloudUpdationParams virtualPrivateCloudUpdationParams)
            throws ApiException {
        ApiResponse<List<WithTaskVirtualPrivateCloud>> localVarResp =
                updateVirtualPrivateCloudWithHttpInfo(virtualPrivateCloudUpdationParams);
        return localVarResp.getData();
    }

    /**
     * @param virtualPrivateCloudUpdationParams (required)
     * @return ApiResponse&lt;List&lt;WithTaskVirtualPrivateCloud&gt;&gt;
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
    public ApiResponse<List<WithTaskVirtualPrivateCloud>> updateVirtualPrivateCloudWithHttpInfo(
            VirtualPrivateCloudUpdationParams virtualPrivateCloudUpdationParams)
            throws ApiException {
        okhttp3.Call localVarCall =
                updateVirtualPrivateCloudValidateBeforeCall(
                        virtualPrivateCloudUpdationParams, null);
        Type localVarReturnType = new TypeToken<List<WithTaskVirtualPrivateCloud>>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param virtualPrivateCloudUpdationParams (required)
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
    public okhttp3.Call updateVirtualPrivateCloudAsync(
            VirtualPrivateCloudUpdationParams virtualPrivateCloudUpdationParams,
            final ApiCallback<List<WithTaskVirtualPrivateCloud>> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                updateVirtualPrivateCloudValidateBeforeCall(
                        virtualPrivateCloudUpdationParams, _callback);
        Type localVarReturnType = new TypeToken<List<WithTaskVirtualPrivateCloud>>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}

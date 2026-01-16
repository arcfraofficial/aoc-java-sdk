package com.arcfra.aoc.api;


import com.arcfra.aoc.ApiCallback;
import com.arcfra.aoc.ApiClient;
import com.arcfra.aoc.ApiException;
import com.arcfra.aoc.ApiResponse;
import com.arcfra.aoc.Configuration;
import com.arcfra.aoc.Pair;
import com.arcfra.aoc.model.GetVirtualPrivateCloudSubnetsConnectionRequestBody;
import com.arcfra.aoc.model.GetVirtualPrivateCloudSubnetsRequestBody;
import com.arcfra.aoc.model.VirtualPrivateCloudSubnet;
import com.arcfra.aoc.model.VirtualPrivateCloudSubnetConnection;
import com.arcfra.aoc.model.VirtualPrivateCloudSubnetCreationParams;
import com.arcfra.aoc.model.VirtualPrivateCloudSubnetDeletionParams;
import com.arcfra.aoc.model.VirtualPrivateCloudSubnetUpdationParams;
import com.arcfra.aoc.model.WithTaskDeleteVirtualPrivateCloudSubnet;
import com.arcfra.aoc.model.WithTaskVirtualPrivateCloudSubnet;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VirtualPrivateCloudSubnetApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public VirtualPrivateCloudSubnetApi() {
        this(Configuration.getDefaultApiClient());
    }

    public VirtualPrivateCloudSubnetApi(ApiClient apiClient) {
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
     * Build call for createVirtualPrivateCloudSubnet
     *
     * @param virtualPrivateCloudSubnetCreationParams (required)
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
    public okhttp3.Call createVirtualPrivateCloudSubnetCall(
            List<VirtualPrivateCloudSubnetCreationParams> virtualPrivateCloudSubnetCreationParams,
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

        Object localVarPostBody = virtualPrivateCloudSubnetCreationParams;

        // create path and map variables
        String localVarPath = "/create-virtual-private-cloud-subnet";

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
    private okhttp3.Call createVirtualPrivateCloudSubnetValidateBeforeCall(
            List<VirtualPrivateCloudSubnetCreationParams> virtualPrivateCloudSubnetCreationParams,
            final ApiCallback _callback)
            throws ApiException {

        // verify the required parameter 'virtualPrivateCloudSubnetCreationParams' is set
        if (virtualPrivateCloudSubnetCreationParams == null) {
            throw new ApiException(
                    "Missing the required parameter 'virtualPrivateCloudSubnetCreationParams' when"
                            + " calling createVirtualPrivateCloudSubnet(Async)");
        }

        okhttp3.Call localVarCall =
                createVirtualPrivateCloudSubnetCall(
                        virtualPrivateCloudSubnetCreationParams, _callback);
        return localVarCall;
    }

    /**
     * @param virtualPrivateCloudSubnetCreationParams (required)
     * @return List&lt;WithTaskVirtualPrivateCloudSubnet&gt;
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
    public List<WithTaskVirtualPrivateCloudSubnet> createVirtualPrivateCloudSubnet(
            List<VirtualPrivateCloudSubnetCreationParams> virtualPrivateCloudSubnetCreationParams)
            throws ApiException {
        ApiResponse<List<WithTaskVirtualPrivateCloudSubnet>> localVarResp =
                createVirtualPrivateCloudSubnetWithHttpInfo(
                        virtualPrivateCloudSubnetCreationParams);
        return localVarResp.getData();
    }

    /**
     * @param virtualPrivateCloudSubnetCreationParams (required)
     * @return ApiResponse&lt;List&lt;WithTaskVirtualPrivateCloudSubnet&gt;&gt;
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
    public ApiResponse<List<WithTaskVirtualPrivateCloudSubnet>>
            createVirtualPrivateCloudSubnetWithHttpInfo(
                    List<VirtualPrivateCloudSubnetCreationParams>
                            virtualPrivateCloudSubnetCreationParams)
                    throws ApiException {
        okhttp3.Call localVarCall =
                createVirtualPrivateCloudSubnetValidateBeforeCall(
                        virtualPrivateCloudSubnetCreationParams, null);
        Type localVarReturnType =
                new TypeToken<List<WithTaskVirtualPrivateCloudSubnet>>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param virtualPrivateCloudSubnetCreationParams (required)
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
    public okhttp3.Call createVirtualPrivateCloudSubnetAsync(
            List<VirtualPrivateCloudSubnetCreationParams> virtualPrivateCloudSubnetCreationParams,
            final ApiCallback<List<WithTaskVirtualPrivateCloudSubnet>> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                createVirtualPrivateCloudSubnetValidateBeforeCall(
                        virtualPrivateCloudSubnetCreationParams, _callback);
        Type localVarReturnType =
                new TypeToken<List<WithTaskVirtualPrivateCloudSubnet>>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteVirtualPrivateCloudSubnet
     *
     * @param virtualPrivateCloudSubnetDeletionParams (required)
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
    public okhttp3.Call deleteVirtualPrivateCloudSubnetCall(
            VirtualPrivateCloudSubnetDeletionParams virtualPrivateCloudSubnetDeletionParams,
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

        Object localVarPostBody = virtualPrivateCloudSubnetDeletionParams;

        // create path and map variables
        String localVarPath = "/delete-virtual-private-cloud-subnet";

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
    private okhttp3.Call deleteVirtualPrivateCloudSubnetValidateBeforeCall(
            VirtualPrivateCloudSubnetDeletionParams virtualPrivateCloudSubnetDeletionParams,
            final ApiCallback _callback)
            throws ApiException {

        // verify the required parameter 'virtualPrivateCloudSubnetDeletionParams' is set
        if (virtualPrivateCloudSubnetDeletionParams == null) {
            throw new ApiException(
                    "Missing the required parameter 'virtualPrivateCloudSubnetDeletionParams' when"
                            + " calling deleteVirtualPrivateCloudSubnet(Async)");
        }

        okhttp3.Call localVarCall =
                deleteVirtualPrivateCloudSubnetCall(
                        virtualPrivateCloudSubnetDeletionParams, _callback);
        return localVarCall;
    }

    /**
     * @param virtualPrivateCloudSubnetDeletionParams (required)
     * @return List&lt;WithTaskDeleteVirtualPrivateCloudSubnet&gt;
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
    public List<WithTaskDeleteVirtualPrivateCloudSubnet> deleteVirtualPrivateCloudSubnet(
            VirtualPrivateCloudSubnetDeletionParams virtualPrivateCloudSubnetDeletionParams)
            throws ApiException {
        ApiResponse<List<WithTaskDeleteVirtualPrivateCloudSubnet>> localVarResp =
                deleteVirtualPrivateCloudSubnetWithHttpInfo(
                        virtualPrivateCloudSubnetDeletionParams);
        return localVarResp.getData();
    }

    /**
     * @param virtualPrivateCloudSubnetDeletionParams (required)
     * @return ApiResponse&lt;List&lt;WithTaskDeleteVirtualPrivateCloudSubnet&gt;&gt;
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
    public ApiResponse<List<WithTaskDeleteVirtualPrivateCloudSubnet>>
            deleteVirtualPrivateCloudSubnetWithHttpInfo(
                    VirtualPrivateCloudSubnetDeletionParams virtualPrivateCloudSubnetDeletionParams)
                    throws ApiException {
        okhttp3.Call localVarCall =
                deleteVirtualPrivateCloudSubnetValidateBeforeCall(
                        virtualPrivateCloudSubnetDeletionParams, null);
        Type localVarReturnType =
                new TypeToken<List<WithTaskDeleteVirtualPrivateCloudSubnet>>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param virtualPrivateCloudSubnetDeletionParams (required)
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
    public okhttp3.Call deleteVirtualPrivateCloudSubnetAsync(
            VirtualPrivateCloudSubnetDeletionParams virtualPrivateCloudSubnetDeletionParams,
            final ApiCallback<List<WithTaskDeleteVirtualPrivateCloudSubnet>> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                deleteVirtualPrivateCloudSubnetValidateBeforeCall(
                        virtualPrivateCloudSubnetDeletionParams, _callback);
        Type localVarReturnType =
                new TypeToken<List<WithTaskDeleteVirtualPrivateCloudSubnet>>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getVirtualPrivateCloudSubnets
     *
     * @param getVirtualPrivateCloudSubnetsRequestBody (required)
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
    public okhttp3.Call getVirtualPrivateCloudSubnetsCall(
            GetVirtualPrivateCloudSubnetsRequestBody getVirtualPrivateCloudSubnetsRequestBody,
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

        Object localVarPostBody = getVirtualPrivateCloudSubnetsRequestBody;

        // create path and map variables
        String localVarPath = "/get-virtual-private-cloud-subnets";

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
    private okhttp3.Call getVirtualPrivateCloudSubnetsValidateBeforeCall(
            GetVirtualPrivateCloudSubnetsRequestBody getVirtualPrivateCloudSubnetsRequestBody,
            final ApiCallback _callback)
            throws ApiException {

        // verify the required parameter 'getVirtualPrivateCloudSubnetsRequestBody' is set
        if (getVirtualPrivateCloudSubnetsRequestBody == null) {
            throw new ApiException(
                    "Missing the required parameter 'getVirtualPrivateCloudSubnetsRequestBody'"
                            + " when calling getVirtualPrivateCloudSubnets(Async)");
        }

        okhttp3.Call localVarCall =
                getVirtualPrivateCloudSubnetsCall(
                        getVirtualPrivateCloudSubnetsRequestBody, _callback);
        return localVarCall;
    }

    /**
     * @param getVirtualPrivateCloudSubnetsRequestBody (required)
     * @return List&lt;VirtualPrivateCloudSubnet&gt;
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
    public List<VirtualPrivateCloudSubnet> getVirtualPrivateCloudSubnets(
            GetVirtualPrivateCloudSubnetsRequestBody getVirtualPrivateCloudSubnetsRequestBody)
            throws ApiException {
        ApiResponse<List<VirtualPrivateCloudSubnet>> localVarResp =
                getVirtualPrivateCloudSubnetsWithHttpInfo(getVirtualPrivateCloudSubnetsRequestBody);
        return localVarResp.getData();
    }

    /**
     * @param getVirtualPrivateCloudSubnetsRequestBody (required)
     * @return ApiResponse&lt;List&lt;VirtualPrivateCloudSubnet&gt;&gt;
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
    public ApiResponse<List<VirtualPrivateCloudSubnet>> getVirtualPrivateCloudSubnetsWithHttpInfo(
            GetVirtualPrivateCloudSubnetsRequestBody getVirtualPrivateCloudSubnetsRequestBody)
            throws ApiException {
        okhttp3.Call localVarCall =
                getVirtualPrivateCloudSubnetsValidateBeforeCall(
                        getVirtualPrivateCloudSubnetsRequestBody, null);
        Type localVarReturnType = new TypeToken<List<VirtualPrivateCloudSubnet>>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param getVirtualPrivateCloudSubnetsRequestBody (required)
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
    public okhttp3.Call getVirtualPrivateCloudSubnetsAsync(
            GetVirtualPrivateCloudSubnetsRequestBody getVirtualPrivateCloudSubnetsRequestBody,
            final ApiCallback<List<VirtualPrivateCloudSubnet>> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                getVirtualPrivateCloudSubnetsValidateBeforeCall(
                        getVirtualPrivateCloudSubnetsRequestBody, _callback);
        Type localVarReturnType = new TypeToken<List<VirtualPrivateCloudSubnet>>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getVirtualPrivateCloudSubnetsConnection
     *
     * @param getVirtualPrivateCloudSubnetsConnectionRequestBody (required)
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
    public okhttp3.Call getVirtualPrivateCloudSubnetsConnectionCall(
            GetVirtualPrivateCloudSubnetsConnectionRequestBody
                    getVirtualPrivateCloudSubnetsConnectionRequestBody,
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

        Object localVarPostBody = getVirtualPrivateCloudSubnetsConnectionRequestBody;

        // create path and map variables
        String localVarPath = "/get-virtual-private-cloud-subnets-connection";

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
    private okhttp3.Call getVirtualPrivateCloudSubnetsConnectionValidateBeforeCall(
            GetVirtualPrivateCloudSubnetsConnectionRequestBody
                    getVirtualPrivateCloudSubnetsConnectionRequestBody,
            final ApiCallback _callback)
            throws ApiException {

        // verify the required parameter 'getVirtualPrivateCloudSubnetsConnectionRequestBody' is set
        if (getVirtualPrivateCloudSubnetsConnectionRequestBody == null) {
            throw new ApiException(
                    "Missing the required parameter"
                            + " 'getVirtualPrivateCloudSubnetsConnectionRequestBody' when calling"
                            + " getVirtualPrivateCloudSubnetsConnection(Async)");
        }

        okhttp3.Call localVarCall =
                getVirtualPrivateCloudSubnetsConnectionCall(
                        getVirtualPrivateCloudSubnetsConnectionRequestBody, _callback);
        return localVarCall;
    }

    /**
     * @param getVirtualPrivateCloudSubnetsConnectionRequestBody (required)
     * @return VirtualPrivateCloudSubnetConnection
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
    public VirtualPrivateCloudSubnetConnection getVirtualPrivateCloudSubnetsConnection(
            GetVirtualPrivateCloudSubnetsConnectionRequestBody
                    getVirtualPrivateCloudSubnetsConnectionRequestBody)
            throws ApiException {
        ApiResponse<VirtualPrivateCloudSubnetConnection> localVarResp =
                getVirtualPrivateCloudSubnetsConnectionWithHttpInfo(
                        getVirtualPrivateCloudSubnetsConnectionRequestBody);
        return localVarResp.getData();
    }

    /**
     * @param getVirtualPrivateCloudSubnetsConnectionRequestBody (required)
     * @return ApiResponse&lt;VirtualPrivateCloudSubnetConnection&gt;
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
    public ApiResponse<VirtualPrivateCloudSubnetConnection>
            getVirtualPrivateCloudSubnetsConnectionWithHttpInfo(
                    GetVirtualPrivateCloudSubnetsConnectionRequestBody
                            getVirtualPrivateCloudSubnetsConnectionRequestBody)
                    throws ApiException {
        okhttp3.Call localVarCall =
                getVirtualPrivateCloudSubnetsConnectionValidateBeforeCall(
                        getVirtualPrivateCloudSubnetsConnectionRequestBody, null);
        Type localVarReturnType = new TypeToken<VirtualPrivateCloudSubnetConnection>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param getVirtualPrivateCloudSubnetsConnectionRequestBody (required)
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
    public okhttp3.Call getVirtualPrivateCloudSubnetsConnectionAsync(
            GetVirtualPrivateCloudSubnetsConnectionRequestBody
                    getVirtualPrivateCloudSubnetsConnectionRequestBody,
            final ApiCallback<VirtualPrivateCloudSubnetConnection> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                getVirtualPrivateCloudSubnetsConnectionValidateBeforeCall(
                        getVirtualPrivateCloudSubnetsConnectionRequestBody, _callback);
        Type localVarReturnType = new TypeToken<VirtualPrivateCloudSubnetConnection>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateVirtualPrivateCloudSubnet
     *
     * @param virtualPrivateCloudSubnetUpdationParams (required)
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
    public okhttp3.Call updateVirtualPrivateCloudSubnetCall(
            VirtualPrivateCloudSubnetUpdationParams virtualPrivateCloudSubnetUpdationParams,
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

        Object localVarPostBody = virtualPrivateCloudSubnetUpdationParams;

        // create path and map variables
        String localVarPath = "/update-virtual-private-cloud-subnet";

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
    private okhttp3.Call updateVirtualPrivateCloudSubnetValidateBeforeCall(
            VirtualPrivateCloudSubnetUpdationParams virtualPrivateCloudSubnetUpdationParams,
            final ApiCallback _callback)
            throws ApiException {

        // verify the required parameter 'virtualPrivateCloudSubnetUpdationParams' is set
        if (virtualPrivateCloudSubnetUpdationParams == null) {
            throw new ApiException(
                    "Missing the required parameter 'virtualPrivateCloudSubnetUpdationParams' when"
                            + " calling updateVirtualPrivateCloudSubnet(Async)");
        }

        okhttp3.Call localVarCall =
                updateVirtualPrivateCloudSubnetCall(
                        virtualPrivateCloudSubnetUpdationParams, _callback);
        return localVarCall;
    }

    /**
     * @param virtualPrivateCloudSubnetUpdationParams (required)
     * @return List&lt;WithTaskVirtualPrivateCloudSubnet&gt;
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
    public List<WithTaskVirtualPrivateCloudSubnet> updateVirtualPrivateCloudSubnet(
            VirtualPrivateCloudSubnetUpdationParams virtualPrivateCloudSubnetUpdationParams)
            throws ApiException {
        ApiResponse<List<WithTaskVirtualPrivateCloudSubnet>> localVarResp =
                updateVirtualPrivateCloudSubnetWithHttpInfo(
                        virtualPrivateCloudSubnetUpdationParams);
        return localVarResp.getData();
    }

    /**
     * @param virtualPrivateCloudSubnetUpdationParams (required)
     * @return ApiResponse&lt;List&lt;WithTaskVirtualPrivateCloudSubnet&gt;&gt;
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
    public ApiResponse<List<WithTaskVirtualPrivateCloudSubnet>>
            updateVirtualPrivateCloudSubnetWithHttpInfo(
                    VirtualPrivateCloudSubnetUpdationParams virtualPrivateCloudSubnetUpdationParams)
                    throws ApiException {
        okhttp3.Call localVarCall =
                updateVirtualPrivateCloudSubnetValidateBeforeCall(
                        virtualPrivateCloudSubnetUpdationParams, null);
        Type localVarReturnType =
                new TypeToken<List<WithTaskVirtualPrivateCloudSubnet>>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param virtualPrivateCloudSubnetUpdationParams (required)
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
    public okhttp3.Call updateVirtualPrivateCloudSubnetAsync(
            VirtualPrivateCloudSubnetUpdationParams virtualPrivateCloudSubnetUpdationParams,
            final ApiCallback<List<WithTaskVirtualPrivateCloudSubnet>> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                updateVirtualPrivateCloudSubnetValidateBeforeCall(
                        virtualPrivateCloudSubnetUpdationParams, _callback);
        Type localVarReturnType =
                new TypeToken<List<WithTaskVirtualPrivateCloudSubnet>>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}

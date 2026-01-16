package com.arcfra.aoc.api;


import com.arcfra.aoc.ApiCallback;
import com.arcfra.aoc.ApiClient;
import com.arcfra.aoc.ApiException;
import com.arcfra.aoc.ApiResponse;
import com.arcfra.aoc.Configuration;
import com.arcfra.aoc.Pair;
import com.arcfra.aoc.model.GetVirtualPrivateCloudRouteTablesConnectionRequestBody;
import com.arcfra.aoc.model.GetVirtualPrivateCloudRouteTablesRequestBody;
import com.arcfra.aoc.model.VirtualPrivateCloudRouteTable;
import com.arcfra.aoc.model.VirtualPrivateCloudRouteTableConnection;
import com.arcfra.aoc.model.VirtualPrivateCloudRouteTableCreationParams;
import com.arcfra.aoc.model.VirtualPrivateCloudRouteTableDeletionParams;
import com.arcfra.aoc.model.VirtualPrivateCloudRouteTableUpdationParams;
import com.arcfra.aoc.model.WithTaskDeleteVirtualPrivateCloudRouteTable;
import com.arcfra.aoc.model.WithTaskVirtualPrivateCloudRouteTable;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VirtualPrivateCloudRouteTableApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public VirtualPrivateCloudRouteTableApi() {
        this(Configuration.getDefaultApiClient());
    }

    public VirtualPrivateCloudRouteTableApi(ApiClient apiClient) {
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
     * Build call for createVirtualPrivateCloudRouteTable
     *
     * @param virtualPrivateCloudRouteTableCreationParams (required)
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
    public okhttp3.Call createVirtualPrivateCloudRouteTableCall(
            List<VirtualPrivateCloudRouteTableCreationParams>
                    virtualPrivateCloudRouteTableCreationParams,
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

        Object localVarPostBody = virtualPrivateCloudRouteTableCreationParams;

        // create path and map variables
        String localVarPath = "/create-virtual-private-cloud-route-table";

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
    private okhttp3.Call createVirtualPrivateCloudRouteTableValidateBeforeCall(
            List<VirtualPrivateCloudRouteTableCreationParams>
                    virtualPrivateCloudRouteTableCreationParams,
            final ApiCallback _callback)
            throws ApiException {

        // verify the required parameter 'virtualPrivateCloudRouteTableCreationParams' is set
        if (virtualPrivateCloudRouteTableCreationParams == null) {
            throw new ApiException(
                    "Missing the required parameter 'virtualPrivateCloudRouteTableCreationParams'"
                            + " when calling createVirtualPrivateCloudRouteTable(Async)");
        }

        okhttp3.Call localVarCall =
                createVirtualPrivateCloudRouteTableCall(
                        virtualPrivateCloudRouteTableCreationParams, _callback);
        return localVarCall;
    }

    /**
     * @param virtualPrivateCloudRouteTableCreationParams (required)
     * @return List&lt;WithTaskVirtualPrivateCloudRouteTable&gt;
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
    public List<WithTaskVirtualPrivateCloudRouteTable> createVirtualPrivateCloudRouteTable(
            List<VirtualPrivateCloudRouteTableCreationParams>
                    virtualPrivateCloudRouteTableCreationParams)
            throws ApiException {
        ApiResponse<List<WithTaskVirtualPrivateCloudRouteTable>> localVarResp =
                createVirtualPrivateCloudRouteTableWithHttpInfo(
                        virtualPrivateCloudRouteTableCreationParams);
        return localVarResp.getData();
    }

    /**
     * @param virtualPrivateCloudRouteTableCreationParams (required)
     * @return ApiResponse&lt;List&lt;WithTaskVirtualPrivateCloudRouteTable&gt;&gt;
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
    public ApiResponse<List<WithTaskVirtualPrivateCloudRouteTable>>
            createVirtualPrivateCloudRouteTableWithHttpInfo(
                    List<VirtualPrivateCloudRouteTableCreationParams>
                            virtualPrivateCloudRouteTableCreationParams)
                    throws ApiException {
        okhttp3.Call localVarCall =
                createVirtualPrivateCloudRouteTableValidateBeforeCall(
                        virtualPrivateCloudRouteTableCreationParams, null);
        Type localVarReturnType =
                new TypeToken<List<WithTaskVirtualPrivateCloudRouteTable>>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param virtualPrivateCloudRouteTableCreationParams (required)
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
    public okhttp3.Call createVirtualPrivateCloudRouteTableAsync(
            List<VirtualPrivateCloudRouteTableCreationParams>
                    virtualPrivateCloudRouteTableCreationParams,
            final ApiCallback<List<WithTaskVirtualPrivateCloudRouteTable>> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                createVirtualPrivateCloudRouteTableValidateBeforeCall(
                        virtualPrivateCloudRouteTableCreationParams, _callback);
        Type localVarReturnType =
                new TypeToken<List<WithTaskVirtualPrivateCloudRouteTable>>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteVirtualPrivateCloudRouteTable
     *
     * @param virtualPrivateCloudRouteTableDeletionParams (required)
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
    public okhttp3.Call deleteVirtualPrivateCloudRouteTableCall(
            VirtualPrivateCloudRouteTableDeletionParams virtualPrivateCloudRouteTableDeletionParams,
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

        Object localVarPostBody = virtualPrivateCloudRouteTableDeletionParams;

        // create path and map variables
        String localVarPath = "/delete-virtual-private-cloud-route-table";

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
    private okhttp3.Call deleteVirtualPrivateCloudRouteTableValidateBeforeCall(
            VirtualPrivateCloudRouteTableDeletionParams virtualPrivateCloudRouteTableDeletionParams,
            final ApiCallback _callback)
            throws ApiException {

        // verify the required parameter 'virtualPrivateCloudRouteTableDeletionParams' is set
        if (virtualPrivateCloudRouteTableDeletionParams == null) {
            throw new ApiException(
                    "Missing the required parameter 'virtualPrivateCloudRouteTableDeletionParams'"
                            + " when calling deleteVirtualPrivateCloudRouteTable(Async)");
        }

        okhttp3.Call localVarCall =
                deleteVirtualPrivateCloudRouteTableCall(
                        virtualPrivateCloudRouteTableDeletionParams, _callback);
        return localVarCall;
    }

    /**
     * @param virtualPrivateCloudRouteTableDeletionParams (required)
     * @return List&lt;WithTaskDeleteVirtualPrivateCloudRouteTable&gt;
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
    public List<WithTaskDeleteVirtualPrivateCloudRouteTable> deleteVirtualPrivateCloudRouteTable(
            VirtualPrivateCloudRouteTableDeletionParams virtualPrivateCloudRouteTableDeletionParams)
            throws ApiException {
        ApiResponse<List<WithTaskDeleteVirtualPrivateCloudRouteTable>> localVarResp =
                deleteVirtualPrivateCloudRouteTableWithHttpInfo(
                        virtualPrivateCloudRouteTableDeletionParams);
        return localVarResp.getData();
    }

    /**
     * @param virtualPrivateCloudRouteTableDeletionParams (required)
     * @return ApiResponse&lt;List&lt;WithTaskDeleteVirtualPrivateCloudRouteTable&gt;&gt;
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
    public ApiResponse<List<WithTaskDeleteVirtualPrivateCloudRouteTable>>
            deleteVirtualPrivateCloudRouteTableWithHttpInfo(
                    VirtualPrivateCloudRouteTableDeletionParams
                            virtualPrivateCloudRouteTableDeletionParams)
                    throws ApiException {
        okhttp3.Call localVarCall =
                deleteVirtualPrivateCloudRouteTableValidateBeforeCall(
                        virtualPrivateCloudRouteTableDeletionParams, null);
        Type localVarReturnType =
                new TypeToken<List<WithTaskDeleteVirtualPrivateCloudRouteTable>>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param virtualPrivateCloudRouteTableDeletionParams (required)
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
    public okhttp3.Call deleteVirtualPrivateCloudRouteTableAsync(
            VirtualPrivateCloudRouteTableDeletionParams virtualPrivateCloudRouteTableDeletionParams,
            final ApiCallback<List<WithTaskDeleteVirtualPrivateCloudRouteTable>> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                deleteVirtualPrivateCloudRouteTableValidateBeforeCall(
                        virtualPrivateCloudRouteTableDeletionParams, _callback);
        Type localVarReturnType =
                new TypeToken<List<WithTaskDeleteVirtualPrivateCloudRouteTable>>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getVirtualPrivateCloudRouteTables
     *
     * @param getVirtualPrivateCloudRouteTablesRequestBody (required)
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
    public okhttp3.Call getVirtualPrivateCloudRouteTablesCall(
            GetVirtualPrivateCloudRouteTablesRequestBody
                    getVirtualPrivateCloudRouteTablesRequestBody,
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

        Object localVarPostBody = getVirtualPrivateCloudRouteTablesRequestBody;

        // create path and map variables
        String localVarPath = "/get-virtual-private-cloud-route-tables";

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
    private okhttp3.Call getVirtualPrivateCloudRouteTablesValidateBeforeCall(
            GetVirtualPrivateCloudRouteTablesRequestBody
                    getVirtualPrivateCloudRouteTablesRequestBody,
            final ApiCallback _callback)
            throws ApiException {

        // verify the required parameter 'getVirtualPrivateCloudRouteTablesRequestBody' is set
        if (getVirtualPrivateCloudRouteTablesRequestBody == null) {
            throw new ApiException(
                    "Missing the required parameter 'getVirtualPrivateCloudRouteTablesRequestBody'"
                            + " when calling getVirtualPrivateCloudRouteTables(Async)");
        }

        okhttp3.Call localVarCall =
                getVirtualPrivateCloudRouteTablesCall(
                        getVirtualPrivateCloudRouteTablesRequestBody, _callback);
        return localVarCall;
    }

    /**
     * @param getVirtualPrivateCloudRouteTablesRequestBody (required)
     * @return List&lt;VirtualPrivateCloudRouteTable&gt;
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
    public List<VirtualPrivateCloudRouteTable> getVirtualPrivateCloudRouteTables(
            GetVirtualPrivateCloudRouteTablesRequestBody
                    getVirtualPrivateCloudRouteTablesRequestBody)
            throws ApiException {
        ApiResponse<List<VirtualPrivateCloudRouteTable>> localVarResp =
                getVirtualPrivateCloudRouteTablesWithHttpInfo(
                        getVirtualPrivateCloudRouteTablesRequestBody);
        return localVarResp.getData();
    }

    /**
     * @param getVirtualPrivateCloudRouteTablesRequestBody (required)
     * @return ApiResponse&lt;List&lt;VirtualPrivateCloudRouteTable&gt;&gt;
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
    public ApiResponse<List<VirtualPrivateCloudRouteTable>>
            getVirtualPrivateCloudRouteTablesWithHttpInfo(
                    GetVirtualPrivateCloudRouteTablesRequestBody
                            getVirtualPrivateCloudRouteTablesRequestBody)
                    throws ApiException {
        okhttp3.Call localVarCall =
                getVirtualPrivateCloudRouteTablesValidateBeforeCall(
                        getVirtualPrivateCloudRouteTablesRequestBody, null);
        Type localVarReturnType = new TypeToken<List<VirtualPrivateCloudRouteTable>>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param getVirtualPrivateCloudRouteTablesRequestBody (required)
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
    public okhttp3.Call getVirtualPrivateCloudRouteTablesAsync(
            GetVirtualPrivateCloudRouteTablesRequestBody
                    getVirtualPrivateCloudRouteTablesRequestBody,
            final ApiCallback<List<VirtualPrivateCloudRouteTable>> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                getVirtualPrivateCloudRouteTablesValidateBeforeCall(
                        getVirtualPrivateCloudRouteTablesRequestBody, _callback);
        Type localVarReturnType = new TypeToken<List<VirtualPrivateCloudRouteTable>>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getVirtualPrivateCloudRouteTablesConnection
     *
     * @param getVirtualPrivateCloudRouteTablesConnectionRequestBody (required)
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
    public okhttp3.Call getVirtualPrivateCloudRouteTablesConnectionCall(
            GetVirtualPrivateCloudRouteTablesConnectionRequestBody
                    getVirtualPrivateCloudRouteTablesConnectionRequestBody,
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

        Object localVarPostBody = getVirtualPrivateCloudRouteTablesConnectionRequestBody;

        // create path and map variables
        String localVarPath = "/get-virtual-private-cloud-route-tables-connection";

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
    private okhttp3.Call getVirtualPrivateCloudRouteTablesConnectionValidateBeforeCall(
            GetVirtualPrivateCloudRouteTablesConnectionRequestBody
                    getVirtualPrivateCloudRouteTablesConnectionRequestBody,
            final ApiCallback _callback)
            throws ApiException {

        // verify the required parameter 'getVirtualPrivateCloudRouteTablesConnectionRequestBody' is
        // set
        if (getVirtualPrivateCloudRouteTablesConnectionRequestBody == null) {
            throw new ApiException(
                    "Missing the required parameter"
                        + " 'getVirtualPrivateCloudRouteTablesConnectionRequestBody' when calling"
                        + " getVirtualPrivateCloudRouteTablesConnection(Async)");
        }

        okhttp3.Call localVarCall =
                getVirtualPrivateCloudRouteTablesConnectionCall(
                        getVirtualPrivateCloudRouteTablesConnectionRequestBody, _callback);
        return localVarCall;
    }

    /**
     * @param getVirtualPrivateCloudRouteTablesConnectionRequestBody (required)
     * @return VirtualPrivateCloudRouteTableConnection
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
    public VirtualPrivateCloudRouteTableConnection getVirtualPrivateCloudRouteTablesConnection(
            GetVirtualPrivateCloudRouteTablesConnectionRequestBody
                    getVirtualPrivateCloudRouteTablesConnectionRequestBody)
            throws ApiException {
        ApiResponse<VirtualPrivateCloudRouteTableConnection> localVarResp =
                getVirtualPrivateCloudRouteTablesConnectionWithHttpInfo(
                        getVirtualPrivateCloudRouteTablesConnectionRequestBody);
        return localVarResp.getData();
    }

    /**
     * @param getVirtualPrivateCloudRouteTablesConnectionRequestBody (required)
     * @return ApiResponse&lt;VirtualPrivateCloudRouteTableConnection&gt;
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
    public ApiResponse<VirtualPrivateCloudRouteTableConnection>
            getVirtualPrivateCloudRouteTablesConnectionWithHttpInfo(
                    GetVirtualPrivateCloudRouteTablesConnectionRequestBody
                            getVirtualPrivateCloudRouteTablesConnectionRequestBody)
                    throws ApiException {
        okhttp3.Call localVarCall =
                getVirtualPrivateCloudRouteTablesConnectionValidateBeforeCall(
                        getVirtualPrivateCloudRouteTablesConnectionRequestBody, null);
        Type localVarReturnType =
                new TypeToken<VirtualPrivateCloudRouteTableConnection>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param getVirtualPrivateCloudRouteTablesConnectionRequestBody (required)
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
    public okhttp3.Call getVirtualPrivateCloudRouteTablesConnectionAsync(
            GetVirtualPrivateCloudRouteTablesConnectionRequestBody
                    getVirtualPrivateCloudRouteTablesConnectionRequestBody,
            final ApiCallback<VirtualPrivateCloudRouteTableConnection> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                getVirtualPrivateCloudRouteTablesConnectionValidateBeforeCall(
                        getVirtualPrivateCloudRouteTablesConnectionRequestBody, _callback);
        Type localVarReturnType =
                new TypeToken<VirtualPrivateCloudRouteTableConnection>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateVirtualPrivateCloudRouteTable
     *
     * @param virtualPrivateCloudRouteTableUpdationParams (required)
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
    public okhttp3.Call updateVirtualPrivateCloudRouteTableCall(
            VirtualPrivateCloudRouteTableUpdationParams virtualPrivateCloudRouteTableUpdationParams,
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

        Object localVarPostBody = virtualPrivateCloudRouteTableUpdationParams;

        // create path and map variables
        String localVarPath = "/update-virtual-private-cloud-route-table";

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
    private okhttp3.Call updateVirtualPrivateCloudRouteTableValidateBeforeCall(
            VirtualPrivateCloudRouteTableUpdationParams virtualPrivateCloudRouteTableUpdationParams,
            final ApiCallback _callback)
            throws ApiException {

        // verify the required parameter 'virtualPrivateCloudRouteTableUpdationParams' is set
        if (virtualPrivateCloudRouteTableUpdationParams == null) {
            throw new ApiException(
                    "Missing the required parameter 'virtualPrivateCloudRouteTableUpdationParams'"
                            + " when calling updateVirtualPrivateCloudRouteTable(Async)");
        }

        okhttp3.Call localVarCall =
                updateVirtualPrivateCloudRouteTableCall(
                        virtualPrivateCloudRouteTableUpdationParams, _callback);
        return localVarCall;
    }

    /**
     * @param virtualPrivateCloudRouteTableUpdationParams (required)
     * @return List&lt;WithTaskVirtualPrivateCloudRouteTable&gt;
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
    public List<WithTaskVirtualPrivateCloudRouteTable> updateVirtualPrivateCloudRouteTable(
            VirtualPrivateCloudRouteTableUpdationParams virtualPrivateCloudRouteTableUpdationParams)
            throws ApiException {
        ApiResponse<List<WithTaskVirtualPrivateCloudRouteTable>> localVarResp =
                updateVirtualPrivateCloudRouteTableWithHttpInfo(
                        virtualPrivateCloudRouteTableUpdationParams);
        return localVarResp.getData();
    }

    /**
     * @param virtualPrivateCloudRouteTableUpdationParams (required)
     * @return ApiResponse&lt;List&lt;WithTaskVirtualPrivateCloudRouteTable&gt;&gt;
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
    public ApiResponse<List<WithTaskVirtualPrivateCloudRouteTable>>
            updateVirtualPrivateCloudRouteTableWithHttpInfo(
                    VirtualPrivateCloudRouteTableUpdationParams
                            virtualPrivateCloudRouteTableUpdationParams)
                    throws ApiException {
        okhttp3.Call localVarCall =
                updateVirtualPrivateCloudRouteTableValidateBeforeCall(
                        virtualPrivateCloudRouteTableUpdationParams, null);
        Type localVarReturnType =
                new TypeToken<List<WithTaskVirtualPrivateCloudRouteTable>>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param virtualPrivateCloudRouteTableUpdationParams (required)
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
    public okhttp3.Call updateVirtualPrivateCloudRouteTableAsync(
            VirtualPrivateCloudRouteTableUpdationParams virtualPrivateCloudRouteTableUpdationParams,
            final ApiCallback<List<WithTaskVirtualPrivateCloudRouteTable>> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                updateVirtualPrivateCloudRouteTableValidateBeforeCall(
                        virtualPrivateCloudRouteTableUpdationParams, _callback);
        Type localVarReturnType =
                new TypeToken<List<WithTaskVirtualPrivateCloudRouteTable>>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}

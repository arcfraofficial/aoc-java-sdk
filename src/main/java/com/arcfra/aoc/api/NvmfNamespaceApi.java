package com.arcfra.aoc.api;


import com.arcfra.aoc.ApiCallback;
import com.arcfra.aoc.ApiClient;
import com.arcfra.aoc.ApiException;
import com.arcfra.aoc.ApiResponse;
import com.arcfra.aoc.Configuration;
import com.arcfra.aoc.Pair;
import com.arcfra.aoc.model.GetNvmfNamespacesConnectionRequestBody;
import com.arcfra.aoc.model.GetNvmfNamespacesRequestBody;
import com.arcfra.aoc.model.NvmfNamespace;
import com.arcfra.aoc.model.NvmfNamespaceCloneParams;
import com.arcfra.aoc.model.NvmfNamespaceConnection;
import com.arcfra.aoc.model.NvmfNamespaceCreationParams;
import com.arcfra.aoc.model.NvmfNamespaceDeletionParams;
import com.arcfra.aoc.model.NvmfNamespaceRollbackParams;
import com.arcfra.aoc.model.NvmfNamespaceUpdationParams;
import com.arcfra.aoc.model.WithTaskDeleteNvmfNamespace;
import com.arcfra.aoc.model.WithTaskNvmfNamespace;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NvmfNamespaceApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public NvmfNamespaceApi() {
        this(Configuration.getDefaultApiClient());
    }

    public NvmfNamespaceApi(ApiClient apiClient) {
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
     * Build call for cloneNvmfNamespaceFromSnapshot
     *
     * @param nvmfNamespaceCloneParams (required)
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
    public okhttp3.Call cloneNvmfNamespaceFromSnapshotCall(
            List<NvmfNamespaceCloneParams> nvmfNamespaceCloneParams, final ApiCallback _callback)
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

        Object localVarPostBody = nvmfNamespaceCloneParams;

        // create path and map variables
        String localVarPath = "/clone-nvmf-namespace-from-snapshot";

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
    private okhttp3.Call cloneNvmfNamespaceFromSnapshotValidateBeforeCall(
            List<NvmfNamespaceCloneParams> nvmfNamespaceCloneParams, final ApiCallback _callback)
            throws ApiException {

        // verify the required parameter 'nvmfNamespaceCloneParams' is set
        if (nvmfNamespaceCloneParams == null) {
            throw new ApiException(
                    "Missing the required parameter 'nvmfNamespaceCloneParams' when calling"
                            + " cloneNvmfNamespaceFromSnapshot(Async)");
        }

        okhttp3.Call localVarCall =
                cloneNvmfNamespaceFromSnapshotCall(nvmfNamespaceCloneParams, _callback);
        return localVarCall;
    }

    /**
     * @param nvmfNamespaceCloneParams (required)
     * @return List&lt;WithTaskNvmfNamespace&gt;
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
    public List<WithTaskNvmfNamespace> cloneNvmfNamespaceFromSnapshot(
            List<NvmfNamespaceCloneParams> nvmfNamespaceCloneParams) throws ApiException {
        ApiResponse<List<WithTaskNvmfNamespace>> localVarResp =
                cloneNvmfNamespaceFromSnapshotWithHttpInfo(nvmfNamespaceCloneParams);
        return localVarResp.getData();
    }

    /**
     * @param nvmfNamespaceCloneParams (required)
     * @return ApiResponse&lt;List&lt;WithTaskNvmfNamespace&gt;&gt;
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
    public ApiResponse<List<WithTaskNvmfNamespace>> cloneNvmfNamespaceFromSnapshotWithHttpInfo(
            List<NvmfNamespaceCloneParams> nvmfNamespaceCloneParams) throws ApiException {
        okhttp3.Call localVarCall =
                cloneNvmfNamespaceFromSnapshotValidateBeforeCall(nvmfNamespaceCloneParams, null);
        Type localVarReturnType = new TypeToken<List<WithTaskNvmfNamespace>>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param nvmfNamespaceCloneParams (required)
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
    public okhttp3.Call cloneNvmfNamespaceFromSnapshotAsync(
            List<NvmfNamespaceCloneParams> nvmfNamespaceCloneParams,
            final ApiCallback<List<WithTaskNvmfNamespace>> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                cloneNvmfNamespaceFromSnapshotValidateBeforeCall(
                        nvmfNamespaceCloneParams, _callback);
        Type localVarReturnType = new TypeToken<List<WithTaskNvmfNamespace>>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for createNvmfNamespace
     *
     * @param nvmfNamespaceCreationParams (required)
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
    public okhttp3.Call createNvmfNamespaceCall(
            List<NvmfNamespaceCreationParams> nvmfNamespaceCreationParams,
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

        Object localVarPostBody = nvmfNamespaceCreationParams;

        // create path and map variables
        String localVarPath = "/create-nvmf-namespace";

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
    private okhttp3.Call createNvmfNamespaceValidateBeforeCall(
            List<NvmfNamespaceCreationParams> nvmfNamespaceCreationParams,
            final ApiCallback _callback)
            throws ApiException {

        // verify the required parameter 'nvmfNamespaceCreationParams' is set
        if (nvmfNamespaceCreationParams == null) {
            throw new ApiException(
                    "Missing the required parameter 'nvmfNamespaceCreationParams' when calling"
                            + " createNvmfNamespace(Async)");
        }

        okhttp3.Call localVarCall = createNvmfNamespaceCall(nvmfNamespaceCreationParams, _callback);
        return localVarCall;
    }

    /**
     * @param nvmfNamespaceCreationParams (required)
     * @return List&lt;WithTaskNvmfNamespace&gt;
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
    public List<WithTaskNvmfNamespace> createNvmfNamespace(
            List<NvmfNamespaceCreationParams> nvmfNamespaceCreationParams) throws ApiException {
        ApiResponse<List<WithTaskNvmfNamespace>> localVarResp =
                createNvmfNamespaceWithHttpInfo(nvmfNamespaceCreationParams);
        return localVarResp.getData();
    }

    /**
     * @param nvmfNamespaceCreationParams (required)
     * @return ApiResponse&lt;List&lt;WithTaskNvmfNamespace&gt;&gt;
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
    public ApiResponse<List<WithTaskNvmfNamespace>> createNvmfNamespaceWithHttpInfo(
            List<NvmfNamespaceCreationParams> nvmfNamespaceCreationParams) throws ApiException {
        okhttp3.Call localVarCall =
                createNvmfNamespaceValidateBeforeCall(nvmfNamespaceCreationParams, null);
        Type localVarReturnType = new TypeToken<List<WithTaskNvmfNamespace>>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param nvmfNamespaceCreationParams (required)
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
    public okhttp3.Call createNvmfNamespaceAsync(
            List<NvmfNamespaceCreationParams> nvmfNamespaceCreationParams,
            final ApiCallback<List<WithTaskNvmfNamespace>> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                createNvmfNamespaceValidateBeforeCall(nvmfNamespaceCreationParams, _callback);
        Type localVarReturnType = new TypeToken<List<WithTaskNvmfNamespace>>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteNvmfNamespace
     *
     * @param nvmfNamespaceDeletionParams (required)
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
    public okhttp3.Call deleteNvmfNamespaceCall(
            NvmfNamespaceDeletionParams nvmfNamespaceDeletionParams, final ApiCallback _callback)
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

        Object localVarPostBody = nvmfNamespaceDeletionParams;

        // create path and map variables
        String localVarPath = "/delete-nvmf-namespace";

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
    private okhttp3.Call deleteNvmfNamespaceValidateBeforeCall(
            NvmfNamespaceDeletionParams nvmfNamespaceDeletionParams, final ApiCallback _callback)
            throws ApiException {

        // verify the required parameter 'nvmfNamespaceDeletionParams' is set
        if (nvmfNamespaceDeletionParams == null) {
            throw new ApiException(
                    "Missing the required parameter 'nvmfNamespaceDeletionParams' when calling"
                            + " deleteNvmfNamespace(Async)");
        }

        okhttp3.Call localVarCall = deleteNvmfNamespaceCall(nvmfNamespaceDeletionParams, _callback);
        return localVarCall;
    }

    /**
     * @param nvmfNamespaceDeletionParams (required)
     * @return List&lt;WithTaskDeleteNvmfNamespace&gt;
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
    public List<WithTaskDeleteNvmfNamespace> deleteNvmfNamespace(
            NvmfNamespaceDeletionParams nvmfNamespaceDeletionParams) throws ApiException {
        ApiResponse<List<WithTaskDeleteNvmfNamespace>> localVarResp =
                deleteNvmfNamespaceWithHttpInfo(nvmfNamespaceDeletionParams);
        return localVarResp.getData();
    }

    /**
     * @param nvmfNamespaceDeletionParams (required)
     * @return ApiResponse&lt;List&lt;WithTaskDeleteNvmfNamespace&gt;&gt;
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
    public ApiResponse<List<WithTaskDeleteNvmfNamespace>> deleteNvmfNamespaceWithHttpInfo(
            NvmfNamespaceDeletionParams nvmfNamespaceDeletionParams) throws ApiException {
        okhttp3.Call localVarCall =
                deleteNvmfNamespaceValidateBeforeCall(nvmfNamespaceDeletionParams, null);
        Type localVarReturnType = new TypeToken<List<WithTaskDeleteNvmfNamespace>>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param nvmfNamespaceDeletionParams (required)
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
    public okhttp3.Call deleteNvmfNamespaceAsync(
            NvmfNamespaceDeletionParams nvmfNamespaceDeletionParams,
            final ApiCallback<List<WithTaskDeleteNvmfNamespace>> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                deleteNvmfNamespaceValidateBeforeCall(nvmfNamespaceDeletionParams, _callback);
        Type localVarReturnType = new TypeToken<List<WithTaskDeleteNvmfNamespace>>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getNvmfNamespaces
     *
     * @param getNvmfNamespacesRequestBody (required)
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
    public okhttp3.Call getNvmfNamespacesCall(
            GetNvmfNamespacesRequestBody getNvmfNamespacesRequestBody, final ApiCallback _callback)
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

        Object localVarPostBody = getNvmfNamespacesRequestBody;

        // create path and map variables
        String localVarPath = "/get-nvmf-namespaces";

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
    private okhttp3.Call getNvmfNamespacesValidateBeforeCall(
            GetNvmfNamespacesRequestBody getNvmfNamespacesRequestBody, final ApiCallback _callback)
            throws ApiException {

        // verify the required parameter 'getNvmfNamespacesRequestBody' is set
        if (getNvmfNamespacesRequestBody == null) {
            throw new ApiException(
                    "Missing the required parameter 'getNvmfNamespacesRequestBody' when calling"
                            + " getNvmfNamespaces(Async)");
        }

        okhttp3.Call localVarCall = getNvmfNamespacesCall(getNvmfNamespacesRequestBody, _callback);
        return localVarCall;
    }

    /**
     * @param getNvmfNamespacesRequestBody (required)
     * @return List&lt;NvmfNamespace&gt;
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
    public List<NvmfNamespace> getNvmfNamespaces(
            GetNvmfNamespacesRequestBody getNvmfNamespacesRequestBody) throws ApiException {
        ApiResponse<List<NvmfNamespace>> localVarResp =
                getNvmfNamespacesWithHttpInfo(getNvmfNamespacesRequestBody);
        return localVarResp.getData();
    }

    /**
     * @param getNvmfNamespacesRequestBody (required)
     * @return ApiResponse&lt;List&lt;NvmfNamespace&gt;&gt;
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
    public ApiResponse<List<NvmfNamespace>> getNvmfNamespacesWithHttpInfo(
            GetNvmfNamespacesRequestBody getNvmfNamespacesRequestBody) throws ApiException {
        okhttp3.Call localVarCall =
                getNvmfNamespacesValidateBeforeCall(getNvmfNamespacesRequestBody, null);
        Type localVarReturnType = new TypeToken<List<NvmfNamespace>>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param getNvmfNamespacesRequestBody (required)
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
    public okhttp3.Call getNvmfNamespacesAsync(
            GetNvmfNamespacesRequestBody getNvmfNamespacesRequestBody,
            final ApiCallback<List<NvmfNamespace>> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                getNvmfNamespacesValidateBeforeCall(getNvmfNamespacesRequestBody, _callback);
        Type localVarReturnType = new TypeToken<List<NvmfNamespace>>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getNvmfNamespacesConnection
     *
     * @param getNvmfNamespacesConnectionRequestBody (required)
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
    public okhttp3.Call getNvmfNamespacesConnectionCall(
            GetNvmfNamespacesConnectionRequestBody getNvmfNamespacesConnectionRequestBody,
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

        Object localVarPostBody = getNvmfNamespacesConnectionRequestBody;

        // create path and map variables
        String localVarPath = "/get-nvmf-namespaces-connection";

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
    private okhttp3.Call getNvmfNamespacesConnectionValidateBeforeCall(
            GetNvmfNamespacesConnectionRequestBody getNvmfNamespacesConnectionRequestBody,
            final ApiCallback _callback)
            throws ApiException {

        // verify the required parameter 'getNvmfNamespacesConnectionRequestBody' is set
        if (getNvmfNamespacesConnectionRequestBody == null) {
            throw new ApiException(
                    "Missing the required parameter 'getNvmfNamespacesConnectionRequestBody' when"
                            + " calling getNvmfNamespacesConnection(Async)");
        }

        okhttp3.Call localVarCall =
                getNvmfNamespacesConnectionCall(getNvmfNamespacesConnectionRequestBody, _callback);
        return localVarCall;
    }

    /**
     * @param getNvmfNamespacesConnectionRequestBody (required)
     * @return NvmfNamespaceConnection
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
    public NvmfNamespaceConnection getNvmfNamespacesConnection(
            GetNvmfNamespacesConnectionRequestBody getNvmfNamespacesConnectionRequestBody)
            throws ApiException {
        ApiResponse<NvmfNamespaceConnection> localVarResp =
                getNvmfNamespacesConnectionWithHttpInfo(getNvmfNamespacesConnectionRequestBody);
        return localVarResp.getData();
    }

    /**
     * @param getNvmfNamespacesConnectionRequestBody (required)
     * @return ApiResponse&lt;NvmfNamespaceConnection&gt;
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
    public ApiResponse<NvmfNamespaceConnection> getNvmfNamespacesConnectionWithHttpInfo(
            GetNvmfNamespacesConnectionRequestBody getNvmfNamespacesConnectionRequestBody)
            throws ApiException {
        okhttp3.Call localVarCall =
                getNvmfNamespacesConnectionValidateBeforeCall(
                        getNvmfNamespacesConnectionRequestBody, null);
        Type localVarReturnType = new TypeToken<NvmfNamespaceConnection>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param getNvmfNamespacesConnectionRequestBody (required)
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
    public okhttp3.Call getNvmfNamespacesConnectionAsync(
            GetNvmfNamespacesConnectionRequestBody getNvmfNamespacesConnectionRequestBody,
            final ApiCallback<NvmfNamespaceConnection> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                getNvmfNamespacesConnectionValidateBeforeCall(
                        getNvmfNamespacesConnectionRequestBody, _callback);
        Type localVarReturnType = new TypeToken<NvmfNamespaceConnection>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for rollbackNvmfNamespaceFromSnapshot
     *
     * @param nvmfNamespaceRollbackParams (required)
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
    public okhttp3.Call rollbackNvmfNamespaceFromSnapshotCall(
            List<NvmfNamespaceRollbackParams> nvmfNamespaceRollbackParams,
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

        Object localVarPostBody = nvmfNamespaceRollbackParams;

        // create path and map variables
        String localVarPath = "/rollback-nvmf-namespace-from-snapshot";

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
    private okhttp3.Call rollbackNvmfNamespaceFromSnapshotValidateBeforeCall(
            List<NvmfNamespaceRollbackParams> nvmfNamespaceRollbackParams,
            final ApiCallback _callback)
            throws ApiException {

        // verify the required parameter 'nvmfNamespaceRollbackParams' is set
        if (nvmfNamespaceRollbackParams == null) {
            throw new ApiException(
                    "Missing the required parameter 'nvmfNamespaceRollbackParams' when calling"
                            + " rollbackNvmfNamespaceFromSnapshot(Async)");
        }

        okhttp3.Call localVarCall =
                rollbackNvmfNamespaceFromSnapshotCall(nvmfNamespaceRollbackParams, _callback);
        return localVarCall;
    }

    /**
     * @param nvmfNamespaceRollbackParams (required)
     * @return List&lt;WithTaskNvmfNamespace&gt;
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
    public List<WithTaskNvmfNamespace> rollbackNvmfNamespaceFromSnapshot(
            List<NvmfNamespaceRollbackParams> nvmfNamespaceRollbackParams) throws ApiException {
        ApiResponse<List<WithTaskNvmfNamespace>> localVarResp =
                rollbackNvmfNamespaceFromSnapshotWithHttpInfo(nvmfNamespaceRollbackParams);
        return localVarResp.getData();
    }

    /**
     * @param nvmfNamespaceRollbackParams (required)
     * @return ApiResponse&lt;List&lt;WithTaskNvmfNamespace&gt;&gt;
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
    public ApiResponse<List<WithTaskNvmfNamespace>> rollbackNvmfNamespaceFromSnapshotWithHttpInfo(
            List<NvmfNamespaceRollbackParams> nvmfNamespaceRollbackParams) throws ApiException {
        okhttp3.Call localVarCall =
                rollbackNvmfNamespaceFromSnapshotValidateBeforeCall(
                        nvmfNamespaceRollbackParams, null);
        Type localVarReturnType = new TypeToken<List<WithTaskNvmfNamespace>>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param nvmfNamespaceRollbackParams (required)
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
    public okhttp3.Call rollbackNvmfNamespaceFromSnapshotAsync(
            List<NvmfNamespaceRollbackParams> nvmfNamespaceRollbackParams,
            final ApiCallback<List<WithTaskNvmfNamespace>> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                rollbackNvmfNamespaceFromSnapshotValidateBeforeCall(
                        nvmfNamespaceRollbackParams, _callback);
        Type localVarReturnType = new TypeToken<List<WithTaskNvmfNamespace>>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateNvmfNamespace
     *
     * @param nvmfNamespaceUpdationParams (required)
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
    public okhttp3.Call updateNvmfNamespaceCall(
            NvmfNamespaceUpdationParams nvmfNamespaceUpdationParams, final ApiCallback _callback)
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

        Object localVarPostBody = nvmfNamespaceUpdationParams;

        // create path and map variables
        String localVarPath = "/update-nvmf-namespace";

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
    private okhttp3.Call updateNvmfNamespaceValidateBeforeCall(
            NvmfNamespaceUpdationParams nvmfNamespaceUpdationParams, final ApiCallback _callback)
            throws ApiException {

        // verify the required parameter 'nvmfNamespaceUpdationParams' is set
        if (nvmfNamespaceUpdationParams == null) {
            throw new ApiException(
                    "Missing the required parameter 'nvmfNamespaceUpdationParams' when calling"
                            + " updateNvmfNamespace(Async)");
        }

        okhttp3.Call localVarCall = updateNvmfNamespaceCall(nvmfNamespaceUpdationParams, _callback);
        return localVarCall;
    }

    /**
     * @param nvmfNamespaceUpdationParams (required)
     * @return List&lt;WithTaskNvmfNamespace&gt;
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
    public List<WithTaskNvmfNamespace> updateNvmfNamespace(
            NvmfNamespaceUpdationParams nvmfNamespaceUpdationParams) throws ApiException {
        ApiResponse<List<WithTaskNvmfNamespace>> localVarResp =
                updateNvmfNamespaceWithHttpInfo(nvmfNamespaceUpdationParams);
        return localVarResp.getData();
    }

    /**
     * @param nvmfNamespaceUpdationParams (required)
     * @return ApiResponse&lt;List&lt;WithTaskNvmfNamespace&gt;&gt;
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
    public ApiResponse<List<WithTaskNvmfNamespace>> updateNvmfNamespaceWithHttpInfo(
            NvmfNamespaceUpdationParams nvmfNamespaceUpdationParams) throws ApiException {
        okhttp3.Call localVarCall =
                updateNvmfNamespaceValidateBeforeCall(nvmfNamespaceUpdationParams, null);
        Type localVarReturnType = new TypeToken<List<WithTaskNvmfNamespace>>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param nvmfNamespaceUpdationParams (required)
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
    public okhttp3.Call updateNvmfNamespaceAsync(
            NvmfNamespaceUpdationParams nvmfNamespaceUpdationParams,
            final ApiCallback<List<WithTaskNvmfNamespace>> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                updateNvmfNamespaceValidateBeforeCall(nvmfNamespaceUpdationParams, _callback);
        Type localVarReturnType = new TypeToken<List<WithTaskNvmfNamespace>>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}

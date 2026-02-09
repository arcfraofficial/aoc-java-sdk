package com.arcfra.aoc.api;


import com.arcfra.aoc.ApiCallback;
import com.arcfra.aoc.ApiClient;
import com.arcfra.aoc.ApiException;
import com.arcfra.aoc.ApiResponse;
import com.arcfra.aoc.Configuration;
import com.arcfra.aoc.Pair;
import com.arcfra.aoc.model.GetNvmfNamespaceSnapshotsConnectionRequestBody;
import com.arcfra.aoc.model.GetNvmfNamespaceSnapshotsRequestBody;
import com.arcfra.aoc.model.NvmfNamespaceSnapshot;
import com.arcfra.aoc.model.NvmfNamespaceSnapshotConnection;
import com.arcfra.aoc.model.NvmfNamespaceSnapshotCreationParams;
import com.arcfra.aoc.model.NvmfNamespaceSnapshotDeletionParams;
import com.arcfra.aoc.model.WithTaskDeleteNvmfNamespaceSnapshot;
import com.arcfra.aoc.model.WithTaskNvmfNamespaceSnapshot;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NvmfNamespaceSnapshotApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public NvmfNamespaceSnapshotApi() {
        this(Configuration.getDefaultApiClient());
    }

    public NvmfNamespaceSnapshotApi(ApiClient apiClient) {
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
     * Build call for createNvmfNamespaceSnapshot
     *
     * @param nvmfNamespaceSnapshotCreationParams (required)
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
    public okhttp3.Call createNvmfNamespaceSnapshotCall(
            List<NvmfNamespaceSnapshotCreationParams> nvmfNamespaceSnapshotCreationParams,
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

        Object localVarPostBody = nvmfNamespaceSnapshotCreationParams;

        // create path and map variables
        String localVarPath = "/create-nvmf-namespace-snapshot";

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
    private okhttp3.Call createNvmfNamespaceSnapshotValidateBeforeCall(
            List<NvmfNamespaceSnapshotCreationParams> nvmfNamespaceSnapshotCreationParams,
            final ApiCallback _callback)
            throws ApiException {

        // verify the required parameter 'nvmfNamespaceSnapshotCreationParams' is set
        if (nvmfNamespaceSnapshotCreationParams == null) {
            throw new ApiException(
                    "Missing the required parameter 'nvmfNamespaceSnapshotCreationParams' when"
                            + " calling createNvmfNamespaceSnapshot(Async)");
        }

        okhttp3.Call localVarCall =
                createNvmfNamespaceSnapshotCall(nvmfNamespaceSnapshotCreationParams, _callback);
        return localVarCall;
    }

    /**
     * @param nvmfNamespaceSnapshotCreationParams (required)
     * @return List&lt;WithTaskNvmfNamespaceSnapshot&gt;
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
    public List<WithTaskNvmfNamespaceSnapshot> createNvmfNamespaceSnapshot(
            List<NvmfNamespaceSnapshotCreationParams> nvmfNamespaceSnapshotCreationParams)
            throws ApiException {
        ApiResponse<List<WithTaskNvmfNamespaceSnapshot>> localVarResp =
                createNvmfNamespaceSnapshotWithHttpInfo(nvmfNamespaceSnapshotCreationParams);
        return localVarResp.getData();
    }

    /**
     * @param nvmfNamespaceSnapshotCreationParams (required)
     * @return ApiResponse&lt;List&lt;WithTaskNvmfNamespaceSnapshot&gt;&gt;
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
    public ApiResponse<List<WithTaskNvmfNamespaceSnapshot>> createNvmfNamespaceSnapshotWithHttpInfo(
            List<NvmfNamespaceSnapshotCreationParams> nvmfNamespaceSnapshotCreationParams)
            throws ApiException {
        okhttp3.Call localVarCall =
                createNvmfNamespaceSnapshotValidateBeforeCall(
                        nvmfNamespaceSnapshotCreationParams, null);
        Type localVarReturnType = new TypeToken<List<WithTaskNvmfNamespaceSnapshot>>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param nvmfNamespaceSnapshotCreationParams (required)
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
    public okhttp3.Call createNvmfNamespaceSnapshotAsync(
            List<NvmfNamespaceSnapshotCreationParams> nvmfNamespaceSnapshotCreationParams,
            final ApiCallback<List<WithTaskNvmfNamespaceSnapshot>> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                createNvmfNamespaceSnapshotValidateBeforeCall(
                        nvmfNamespaceSnapshotCreationParams, _callback);
        Type localVarReturnType = new TypeToken<List<WithTaskNvmfNamespaceSnapshot>>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteNvmfNamespaceSnapshot
     *
     * @param nvmfNamespaceSnapshotDeletionParams (required)
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
    public okhttp3.Call deleteNvmfNamespaceSnapshotCall(
            NvmfNamespaceSnapshotDeletionParams nvmfNamespaceSnapshotDeletionParams,
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

        Object localVarPostBody = nvmfNamespaceSnapshotDeletionParams;

        // create path and map variables
        String localVarPath = "/delete-nvmf-namespace-snapshot";

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
    private okhttp3.Call deleteNvmfNamespaceSnapshotValidateBeforeCall(
            NvmfNamespaceSnapshotDeletionParams nvmfNamespaceSnapshotDeletionParams,
            final ApiCallback _callback)
            throws ApiException {

        // verify the required parameter 'nvmfNamespaceSnapshotDeletionParams' is set
        if (nvmfNamespaceSnapshotDeletionParams == null) {
            throw new ApiException(
                    "Missing the required parameter 'nvmfNamespaceSnapshotDeletionParams' when"
                            + " calling deleteNvmfNamespaceSnapshot(Async)");
        }

        okhttp3.Call localVarCall =
                deleteNvmfNamespaceSnapshotCall(nvmfNamespaceSnapshotDeletionParams, _callback);
        return localVarCall;
    }

    /**
     * @param nvmfNamespaceSnapshotDeletionParams (required)
     * @return List&lt;WithTaskDeleteNvmfNamespaceSnapshot&gt;
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
    public List<WithTaskDeleteNvmfNamespaceSnapshot> deleteNvmfNamespaceSnapshot(
            NvmfNamespaceSnapshotDeletionParams nvmfNamespaceSnapshotDeletionParams)
            throws ApiException {
        ApiResponse<List<WithTaskDeleteNvmfNamespaceSnapshot>> localVarResp =
                deleteNvmfNamespaceSnapshotWithHttpInfo(nvmfNamespaceSnapshotDeletionParams);
        return localVarResp.getData();
    }

    /**
     * @param nvmfNamespaceSnapshotDeletionParams (required)
     * @return ApiResponse&lt;List&lt;WithTaskDeleteNvmfNamespaceSnapshot&gt;&gt;
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
    public ApiResponse<List<WithTaskDeleteNvmfNamespaceSnapshot>>
            deleteNvmfNamespaceSnapshotWithHttpInfo(
                    NvmfNamespaceSnapshotDeletionParams nvmfNamespaceSnapshotDeletionParams)
                    throws ApiException {
        okhttp3.Call localVarCall =
                deleteNvmfNamespaceSnapshotValidateBeforeCall(
                        nvmfNamespaceSnapshotDeletionParams, null);
        Type localVarReturnType =
                new TypeToken<List<WithTaskDeleteNvmfNamespaceSnapshot>>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param nvmfNamespaceSnapshotDeletionParams (required)
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
    public okhttp3.Call deleteNvmfNamespaceSnapshotAsync(
            NvmfNamespaceSnapshotDeletionParams nvmfNamespaceSnapshotDeletionParams,
            final ApiCallback<List<WithTaskDeleteNvmfNamespaceSnapshot>> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                deleteNvmfNamespaceSnapshotValidateBeforeCall(
                        nvmfNamespaceSnapshotDeletionParams, _callback);
        Type localVarReturnType =
                new TypeToken<List<WithTaskDeleteNvmfNamespaceSnapshot>>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getNvmfNamespaceSnapshots
     *
     * @param getNvmfNamespaceSnapshotsRequestBody (required)
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
    public okhttp3.Call getNvmfNamespaceSnapshotsCall(
            GetNvmfNamespaceSnapshotsRequestBody getNvmfNamespaceSnapshotsRequestBody,
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

        Object localVarPostBody = getNvmfNamespaceSnapshotsRequestBody;

        // create path and map variables
        String localVarPath = "/get-nvmf-namespace-snapshots";

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
    private okhttp3.Call getNvmfNamespaceSnapshotsValidateBeforeCall(
            GetNvmfNamespaceSnapshotsRequestBody getNvmfNamespaceSnapshotsRequestBody,
            final ApiCallback _callback)
            throws ApiException {

        // verify the required parameter 'getNvmfNamespaceSnapshotsRequestBody' is set
        if (getNvmfNamespaceSnapshotsRequestBody == null) {
            throw new ApiException(
                    "Missing the required parameter 'getNvmfNamespaceSnapshotsRequestBody' when"
                            + " calling getNvmfNamespaceSnapshots(Async)");
        }

        okhttp3.Call localVarCall =
                getNvmfNamespaceSnapshotsCall(getNvmfNamespaceSnapshotsRequestBody, _callback);
        return localVarCall;
    }

    /**
     * @param getNvmfNamespaceSnapshotsRequestBody (required)
     * @return List&lt;NvmfNamespaceSnapshot&gt;
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
    public List<NvmfNamespaceSnapshot> getNvmfNamespaceSnapshots(
            GetNvmfNamespaceSnapshotsRequestBody getNvmfNamespaceSnapshotsRequestBody)
            throws ApiException {
        ApiResponse<List<NvmfNamespaceSnapshot>> localVarResp =
                getNvmfNamespaceSnapshotsWithHttpInfo(getNvmfNamespaceSnapshotsRequestBody);
        return localVarResp.getData();
    }

    /**
     * @param getNvmfNamespaceSnapshotsRequestBody (required)
     * @return ApiResponse&lt;List&lt;NvmfNamespaceSnapshot&gt;&gt;
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
    public ApiResponse<List<NvmfNamespaceSnapshot>> getNvmfNamespaceSnapshotsWithHttpInfo(
            GetNvmfNamespaceSnapshotsRequestBody getNvmfNamespaceSnapshotsRequestBody)
            throws ApiException {
        okhttp3.Call localVarCall =
                getNvmfNamespaceSnapshotsValidateBeforeCall(
                        getNvmfNamespaceSnapshotsRequestBody, null);
        Type localVarReturnType = new TypeToken<List<NvmfNamespaceSnapshot>>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param getNvmfNamespaceSnapshotsRequestBody (required)
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
    public okhttp3.Call getNvmfNamespaceSnapshotsAsync(
            GetNvmfNamespaceSnapshotsRequestBody getNvmfNamespaceSnapshotsRequestBody,
            final ApiCallback<List<NvmfNamespaceSnapshot>> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                getNvmfNamespaceSnapshotsValidateBeforeCall(
                        getNvmfNamespaceSnapshotsRequestBody, _callback);
        Type localVarReturnType = new TypeToken<List<NvmfNamespaceSnapshot>>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getNvmfNamespaceSnapshotsConnection
     *
     * @param getNvmfNamespaceSnapshotsConnectionRequestBody (required)
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
    public okhttp3.Call getNvmfNamespaceSnapshotsConnectionCall(
            GetNvmfNamespaceSnapshotsConnectionRequestBody
                    getNvmfNamespaceSnapshotsConnectionRequestBody,
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

        Object localVarPostBody = getNvmfNamespaceSnapshotsConnectionRequestBody;

        // create path and map variables
        String localVarPath = "/get-nvmf-namespace-snapshots-connection";

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
    private okhttp3.Call getNvmfNamespaceSnapshotsConnectionValidateBeforeCall(
            GetNvmfNamespaceSnapshotsConnectionRequestBody
                    getNvmfNamespaceSnapshotsConnectionRequestBody,
            final ApiCallback _callback)
            throws ApiException {

        // verify the required parameter 'getNvmfNamespaceSnapshotsConnectionRequestBody' is set
        if (getNvmfNamespaceSnapshotsConnectionRequestBody == null) {
            throw new ApiException(
                    "Missing the required parameter"
                            + " 'getNvmfNamespaceSnapshotsConnectionRequestBody' when calling"
                            + " getNvmfNamespaceSnapshotsConnection(Async)");
        }

        okhttp3.Call localVarCall =
                getNvmfNamespaceSnapshotsConnectionCall(
                        getNvmfNamespaceSnapshotsConnectionRequestBody, _callback);
        return localVarCall;
    }

    /**
     * @param getNvmfNamespaceSnapshotsConnectionRequestBody (required)
     * @return NvmfNamespaceSnapshotConnection
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
    public NvmfNamespaceSnapshotConnection getNvmfNamespaceSnapshotsConnection(
            GetNvmfNamespaceSnapshotsConnectionRequestBody
                    getNvmfNamespaceSnapshotsConnectionRequestBody)
            throws ApiException {
        ApiResponse<NvmfNamespaceSnapshotConnection> localVarResp =
                getNvmfNamespaceSnapshotsConnectionWithHttpInfo(
                        getNvmfNamespaceSnapshotsConnectionRequestBody);
        return localVarResp.getData();
    }

    /**
     * @param getNvmfNamespaceSnapshotsConnectionRequestBody (required)
     * @return ApiResponse&lt;NvmfNamespaceSnapshotConnection&gt;
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
    public ApiResponse<NvmfNamespaceSnapshotConnection>
            getNvmfNamespaceSnapshotsConnectionWithHttpInfo(
                    GetNvmfNamespaceSnapshotsConnectionRequestBody
                            getNvmfNamespaceSnapshotsConnectionRequestBody)
                    throws ApiException {
        okhttp3.Call localVarCall =
                getNvmfNamespaceSnapshotsConnectionValidateBeforeCall(
                        getNvmfNamespaceSnapshotsConnectionRequestBody, null);
        Type localVarReturnType = new TypeToken<NvmfNamespaceSnapshotConnection>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param getNvmfNamespaceSnapshotsConnectionRequestBody (required)
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
    public okhttp3.Call getNvmfNamespaceSnapshotsConnectionAsync(
            GetNvmfNamespaceSnapshotsConnectionRequestBody
                    getNvmfNamespaceSnapshotsConnectionRequestBody,
            final ApiCallback<NvmfNamespaceSnapshotConnection> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                getNvmfNamespaceSnapshotsConnectionValidateBeforeCall(
                        getNvmfNamespaceSnapshotsConnectionRequestBody, _callback);
        Type localVarReturnType = new TypeToken<NvmfNamespaceSnapshotConnection>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}

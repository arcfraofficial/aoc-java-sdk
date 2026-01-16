package com.arcfra.aoc.api;


import com.arcfra.aoc.ApiCallback;
import com.arcfra.aoc.ApiClient;
import com.arcfra.aoc.ApiException;
import com.arcfra.aoc.ApiResponse;
import com.arcfra.aoc.Configuration;
import com.arcfra.aoc.Pair;
import com.arcfra.aoc.model.GetVmVolumeSnapshotsConnectionRequestBody;
import com.arcfra.aoc.model.GetVmVolumeSnapshotsRequestBody;
import com.arcfra.aoc.model.VmVolumeSnapshot;
import com.arcfra.aoc.model.VmVolumeSnapshotConnection;
import com.arcfra.aoc.model.VmVolumeSnapshotCreationParams;
import com.arcfra.aoc.model.VmVolumeSnapshotDeletionParams;
import com.arcfra.aoc.model.WithTaskDeleteVmVolumeSnapshot;
import com.arcfra.aoc.model.WithTaskVmVolumeSnapshot;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VmVolumeSnapshotApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public VmVolumeSnapshotApi() {
        this(Configuration.getDefaultApiClient());
    }

    public VmVolumeSnapshotApi(ApiClient apiClient) {
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
     * Build call for createVmVolumeSnapshot
     *
     * @param vmVolumeSnapshotCreationParams (required)
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
    public okhttp3.Call createVmVolumeSnapshotCall(
            List<VmVolumeSnapshotCreationParams> vmVolumeSnapshotCreationParams,
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

        Object localVarPostBody = vmVolumeSnapshotCreationParams;

        // create path and map variables
        String localVarPath = "/create-vm-volume-snapshot";

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
    private okhttp3.Call createVmVolumeSnapshotValidateBeforeCall(
            List<VmVolumeSnapshotCreationParams> vmVolumeSnapshotCreationParams,
            final ApiCallback _callback)
            throws ApiException {

        // verify the required parameter 'vmVolumeSnapshotCreationParams' is set
        if (vmVolumeSnapshotCreationParams == null) {
            throw new ApiException(
                    "Missing the required parameter 'vmVolumeSnapshotCreationParams' when calling"
                            + " createVmVolumeSnapshot(Async)");
        }

        okhttp3.Call localVarCall =
                createVmVolumeSnapshotCall(vmVolumeSnapshotCreationParams, _callback);
        return localVarCall;
    }

    /**
     * @param vmVolumeSnapshotCreationParams (required)
     * @return List&lt;WithTaskVmVolumeSnapshot&gt;
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
    public List<WithTaskVmVolumeSnapshot> createVmVolumeSnapshot(
            List<VmVolumeSnapshotCreationParams> vmVolumeSnapshotCreationParams)
            throws ApiException {
        ApiResponse<List<WithTaskVmVolumeSnapshot>> localVarResp =
                createVmVolumeSnapshotWithHttpInfo(vmVolumeSnapshotCreationParams);
        return localVarResp.getData();
    }

    /**
     * @param vmVolumeSnapshotCreationParams (required)
     * @return ApiResponse&lt;List&lt;WithTaskVmVolumeSnapshot&gt;&gt;
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
    public ApiResponse<List<WithTaskVmVolumeSnapshot>> createVmVolumeSnapshotWithHttpInfo(
            List<VmVolumeSnapshotCreationParams> vmVolumeSnapshotCreationParams)
            throws ApiException {
        okhttp3.Call localVarCall =
                createVmVolumeSnapshotValidateBeforeCall(vmVolumeSnapshotCreationParams, null);
        Type localVarReturnType = new TypeToken<List<WithTaskVmVolumeSnapshot>>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param vmVolumeSnapshotCreationParams (required)
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
    public okhttp3.Call createVmVolumeSnapshotAsync(
            List<VmVolumeSnapshotCreationParams> vmVolumeSnapshotCreationParams,
            final ApiCallback<List<WithTaskVmVolumeSnapshot>> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                createVmVolumeSnapshotValidateBeforeCall(vmVolumeSnapshotCreationParams, _callback);
        Type localVarReturnType = new TypeToken<List<WithTaskVmVolumeSnapshot>>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteVmVolumeSnapshot
     *
     * @param vmVolumeSnapshotDeletionParams (required)
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
    public okhttp3.Call deleteVmVolumeSnapshotCall(
            VmVolumeSnapshotDeletionParams vmVolumeSnapshotDeletionParams,
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

        Object localVarPostBody = vmVolumeSnapshotDeletionParams;

        // create path and map variables
        String localVarPath = "/delete-vm-volume-snapshot";

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
    private okhttp3.Call deleteVmVolumeSnapshotValidateBeforeCall(
            VmVolumeSnapshotDeletionParams vmVolumeSnapshotDeletionParams,
            final ApiCallback _callback)
            throws ApiException {

        // verify the required parameter 'vmVolumeSnapshotDeletionParams' is set
        if (vmVolumeSnapshotDeletionParams == null) {
            throw new ApiException(
                    "Missing the required parameter 'vmVolumeSnapshotDeletionParams' when calling"
                            + " deleteVmVolumeSnapshot(Async)");
        }

        okhttp3.Call localVarCall =
                deleteVmVolumeSnapshotCall(vmVolumeSnapshotDeletionParams, _callback);
        return localVarCall;
    }

    /**
     * @param vmVolumeSnapshotDeletionParams (required)
     * @return List&lt;WithTaskDeleteVmVolumeSnapshot&gt;
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
    public List<WithTaskDeleteVmVolumeSnapshot> deleteVmVolumeSnapshot(
            VmVolumeSnapshotDeletionParams vmVolumeSnapshotDeletionParams) throws ApiException {
        ApiResponse<List<WithTaskDeleteVmVolumeSnapshot>> localVarResp =
                deleteVmVolumeSnapshotWithHttpInfo(vmVolumeSnapshotDeletionParams);
        return localVarResp.getData();
    }

    /**
     * @param vmVolumeSnapshotDeletionParams (required)
     * @return ApiResponse&lt;List&lt;WithTaskDeleteVmVolumeSnapshot&gt;&gt;
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
    public ApiResponse<List<WithTaskDeleteVmVolumeSnapshot>> deleteVmVolumeSnapshotWithHttpInfo(
            VmVolumeSnapshotDeletionParams vmVolumeSnapshotDeletionParams) throws ApiException {
        okhttp3.Call localVarCall =
                deleteVmVolumeSnapshotValidateBeforeCall(vmVolumeSnapshotDeletionParams, null);
        Type localVarReturnType =
                new TypeToken<List<WithTaskDeleteVmVolumeSnapshot>>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param vmVolumeSnapshotDeletionParams (required)
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
    public okhttp3.Call deleteVmVolumeSnapshotAsync(
            VmVolumeSnapshotDeletionParams vmVolumeSnapshotDeletionParams,
            final ApiCallback<List<WithTaskDeleteVmVolumeSnapshot>> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                deleteVmVolumeSnapshotValidateBeforeCall(vmVolumeSnapshotDeletionParams, _callback);
        Type localVarReturnType =
                new TypeToken<List<WithTaskDeleteVmVolumeSnapshot>>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getVmVolumeSnapshots
     *
     * @param getVmVolumeSnapshotsRequestBody (required)
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
    public okhttp3.Call getVmVolumeSnapshotsCall(
            GetVmVolumeSnapshotsRequestBody getVmVolumeSnapshotsRequestBody,
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

        Object localVarPostBody = getVmVolumeSnapshotsRequestBody;

        // create path and map variables
        String localVarPath = "/get-vm-volume-snapshots";

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
    private okhttp3.Call getVmVolumeSnapshotsValidateBeforeCall(
            GetVmVolumeSnapshotsRequestBody getVmVolumeSnapshotsRequestBody,
            final ApiCallback _callback)
            throws ApiException {

        // verify the required parameter 'getVmVolumeSnapshotsRequestBody' is set
        if (getVmVolumeSnapshotsRequestBody == null) {
            throw new ApiException(
                    "Missing the required parameter 'getVmVolumeSnapshotsRequestBody' when calling"
                            + " getVmVolumeSnapshots(Async)");
        }

        okhttp3.Call localVarCall =
                getVmVolumeSnapshotsCall(getVmVolumeSnapshotsRequestBody, _callback);
        return localVarCall;
    }

    /**
     * @param getVmVolumeSnapshotsRequestBody (required)
     * @return List&lt;VmVolumeSnapshot&gt;
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
    public List<VmVolumeSnapshot> getVmVolumeSnapshots(
            GetVmVolumeSnapshotsRequestBody getVmVolumeSnapshotsRequestBody) throws ApiException {
        ApiResponse<List<VmVolumeSnapshot>> localVarResp =
                getVmVolumeSnapshotsWithHttpInfo(getVmVolumeSnapshotsRequestBody);
        return localVarResp.getData();
    }

    /**
     * @param getVmVolumeSnapshotsRequestBody (required)
     * @return ApiResponse&lt;List&lt;VmVolumeSnapshot&gt;&gt;
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
    public ApiResponse<List<VmVolumeSnapshot>> getVmVolumeSnapshotsWithHttpInfo(
            GetVmVolumeSnapshotsRequestBody getVmVolumeSnapshotsRequestBody) throws ApiException {
        okhttp3.Call localVarCall =
                getVmVolumeSnapshotsValidateBeforeCall(getVmVolumeSnapshotsRequestBody, null);
        Type localVarReturnType = new TypeToken<List<VmVolumeSnapshot>>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param getVmVolumeSnapshotsRequestBody (required)
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
    public okhttp3.Call getVmVolumeSnapshotsAsync(
            GetVmVolumeSnapshotsRequestBody getVmVolumeSnapshotsRequestBody,
            final ApiCallback<List<VmVolumeSnapshot>> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                getVmVolumeSnapshotsValidateBeforeCall(getVmVolumeSnapshotsRequestBody, _callback);
        Type localVarReturnType = new TypeToken<List<VmVolumeSnapshot>>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getVmVolumeSnapshotsConnection
     *
     * @param getVmVolumeSnapshotsConnectionRequestBody (required)
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
    public okhttp3.Call getVmVolumeSnapshotsConnectionCall(
            GetVmVolumeSnapshotsConnectionRequestBody getVmVolumeSnapshotsConnectionRequestBody,
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

        Object localVarPostBody = getVmVolumeSnapshotsConnectionRequestBody;

        // create path and map variables
        String localVarPath = "/get-vm-volume-snapshots-connection";

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
    private okhttp3.Call getVmVolumeSnapshotsConnectionValidateBeforeCall(
            GetVmVolumeSnapshotsConnectionRequestBody getVmVolumeSnapshotsConnectionRequestBody,
            final ApiCallback _callback)
            throws ApiException {

        // verify the required parameter 'getVmVolumeSnapshotsConnectionRequestBody' is set
        if (getVmVolumeSnapshotsConnectionRequestBody == null) {
            throw new ApiException(
                    "Missing the required parameter 'getVmVolumeSnapshotsConnectionRequestBody'"
                            + " when calling getVmVolumeSnapshotsConnection(Async)");
        }

        okhttp3.Call localVarCall =
                getVmVolumeSnapshotsConnectionCall(
                        getVmVolumeSnapshotsConnectionRequestBody, _callback);
        return localVarCall;
    }

    /**
     * @param getVmVolumeSnapshotsConnectionRequestBody (required)
     * @return VmVolumeSnapshotConnection
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
    public VmVolumeSnapshotConnection getVmVolumeSnapshotsConnection(
            GetVmVolumeSnapshotsConnectionRequestBody getVmVolumeSnapshotsConnectionRequestBody)
            throws ApiException {
        ApiResponse<VmVolumeSnapshotConnection> localVarResp =
                getVmVolumeSnapshotsConnectionWithHttpInfo(
                        getVmVolumeSnapshotsConnectionRequestBody);
        return localVarResp.getData();
    }

    /**
     * @param getVmVolumeSnapshotsConnectionRequestBody (required)
     * @return ApiResponse&lt;VmVolumeSnapshotConnection&gt;
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
    public ApiResponse<VmVolumeSnapshotConnection> getVmVolumeSnapshotsConnectionWithHttpInfo(
            GetVmVolumeSnapshotsConnectionRequestBody getVmVolumeSnapshotsConnectionRequestBody)
            throws ApiException {
        okhttp3.Call localVarCall =
                getVmVolumeSnapshotsConnectionValidateBeforeCall(
                        getVmVolumeSnapshotsConnectionRequestBody, null);
        Type localVarReturnType = new TypeToken<VmVolumeSnapshotConnection>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param getVmVolumeSnapshotsConnectionRequestBody (required)
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
    public okhttp3.Call getVmVolumeSnapshotsConnectionAsync(
            GetVmVolumeSnapshotsConnectionRequestBody getVmVolumeSnapshotsConnectionRequestBody,
            final ApiCallback<VmVolumeSnapshotConnection> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                getVmVolumeSnapshotsConnectionValidateBeforeCall(
                        getVmVolumeSnapshotsConnectionRequestBody, _callback);
        Type localVarReturnType = new TypeToken<VmVolumeSnapshotConnection>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}

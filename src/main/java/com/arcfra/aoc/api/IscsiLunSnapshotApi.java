package com.arcfra.aoc.api;


import com.arcfra.aoc.ApiCallback;
import com.arcfra.aoc.ApiClient;
import com.arcfra.aoc.ApiException;
import com.arcfra.aoc.ApiResponse;
import com.arcfra.aoc.Configuration;
import com.arcfra.aoc.Pair;
import com.arcfra.aoc.model.GetIscsiLunSnapshotsConnectionRequestBody;
import com.arcfra.aoc.model.GetIscsiLunSnapshotsRequestBody;
import com.arcfra.aoc.model.IscsiLunSnapshot;
import com.arcfra.aoc.model.IscsiLunSnapshotConnection;
import com.arcfra.aoc.model.IscsiLunSnapshotCreationParams;
import com.arcfra.aoc.model.IscsiLunSnapshotDeletionParams;
import com.arcfra.aoc.model.WithTaskDeleteIscsiLunSnapshot;
import com.arcfra.aoc.model.WithTaskIscsiLunSnapshot;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IscsiLunSnapshotApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public IscsiLunSnapshotApi() {
        this(Configuration.getDefaultApiClient());
    }

    public IscsiLunSnapshotApi(ApiClient apiClient) {
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
     * Build call for createIscsiLunSnapshot
     *
     * @param iscsiLunSnapshotCreationParams (required)
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
    public okhttp3.Call createIscsiLunSnapshotCall(
            List<IscsiLunSnapshotCreationParams> iscsiLunSnapshotCreationParams,
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

        Object localVarPostBody = iscsiLunSnapshotCreationParams;

        // create path and map variables
        String localVarPath = "/create-iscsi-lun-snapshot";

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
    private okhttp3.Call createIscsiLunSnapshotValidateBeforeCall(
            List<IscsiLunSnapshotCreationParams> iscsiLunSnapshotCreationParams,
            final ApiCallback _callback)
            throws ApiException {

        // verify the required parameter 'iscsiLunSnapshotCreationParams' is set
        if (iscsiLunSnapshotCreationParams == null) {
            throw new ApiException(
                    "Missing the required parameter 'iscsiLunSnapshotCreationParams' when calling"
                            + " createIscsiLunSnapshot(Async)");
        }

        okhttp3.Call localVarCall =
                createIscsiLunSnapshotCall(iscsiLunSnapshotCreationParams, _callback);
        return localVarCall;
    }

    /**
     * @param iscsiLunSnapshotCreationParams (required)
     * @return List&lt;WithTaskIscsiLunSnapshot&gt;
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
    public List<WithTaskIscsiLunSnapshot> createIscsiLunSnapshot(
            List<IscsiLunSnapshotCreationParams> iscsiLunSnapshotCreationParams)
            throws ApiException {
        ApiResponse<List<WithTaskIscsiLunSnapshot>> localVarResp =
                createIscsiLunSnapshotWithHttpInfo(iscsiLunSnapshotCreationParams);
        return localVarResp.getData();
    }

    /**
     * @param iscsiLunSnapshotCreationParams (required)
     * @return ApiResponse&lt;List&lt;WithTaskIscsiLunSnapshot&gt;&gt;
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
    public ApiResponse<List<WithTaskIscsiLunSnapshot>> createIscsiLunSnapshotWithHttpInfo(
            List<IscsiLunSnapshotCreationParams> iscsiLunSnapshotCreationParams)
            throws ApiException {
        okhttp3.Call localVarCall =
                createIscsiLunSnapshotValidateBeforeCall(iscsiLunSnapshotCreationParams, null);
        Type localVarReturnType = new TypeToken<List<WithTaskIscsiLunSnapshot>>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param iscsiLunSnapshotCreationParams (required)
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
    public okhttp3.Call createIscsiLunSnapshotAsync(
            List<IscsiLunSnapshotCreationParams> iscsiLunSnapshotCreationParams,
            final ApiCallback<List<WithTaskIscsiLunSnapshot>> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                createIscsiLunSnapshotValidateBeforeCall(iscsiLunSnapshotCreationParams, _callback);
        Type localVarReturnType = new TypeToken<List<WithTaskIscsiLunSnapshot>>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteIscsiLunSnapshot
     *
     * @param iscsiLunSnapshotDeletionParams (required)
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
    public okhttp3.Call deleteIscsiLunSnapshotCall(
            IscsiLunSnapshotDeletionParams iscsiLunSnapshotDeletionParams,
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

        Object localVarPostBody = iscsiLunSnapshotDeletionParams;

        // create path and map variables
        String localVarPath = "/delete-iscsi-lun-snapshot";

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
    private okhttp3.Call deleteIscsiLunSnapshotValidateBeforeCall(
            IscsiLunSnapshotDeletionParams iscsiLunSnapshotDeletionParams,
            final ApiCallback _callback)
            throws ApiException {

        // verify the required parameter 'iscsiLunSnapshotDeletionParams' is set
        if (iscsiLunSnapshotDeletionParams == null) {
            throw new ApiException(
                    "Missing the required parameter 'iscsiLunSnapshotDeletionParams' when calling"
                            + " deleteIscsiLunSnapshot(Async)");
        }

        okhttp3.Call localVarCall =
                deleteIscsiLunSnapshotCall(iscsiLunSnapshotDeletionParams, _callback);
        return localVarCall;
    }

    /**
     * @param iscsiLunSnapshotDeletionParams (required)
     * @return List&lt;WithTaskDeleteIscsiLunSnapshot&gt;
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
    public List<WithTaskDeleteIscsiLunSnapshot> deleteIscsiLunSnapshot(
            IscsiLunSnapshotDeletionParams iscsiLunSnapshotDeletionParams) throws ApiException {
        ApiResponse<List<WithTaskDeleteIscsiLunSnapshot>> localVarResp =
                deleteIscsiLunSnapshotWithHttpInfo(iscsiLunSnapshotDeletionParams);
        return localVarResp.getData();
    }

    /**
     * @param iscsiLunSnapshotDeletionParams (required)
     * @return ApiResponse&lt;List&lt;WithTaskDeleteIscsiLunSnapshot&gt;&gt;
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
    public ApiResponse<List<WithTaskDeleteIscsiLunSnapshot>> deleteIscsiLunSnapshotWithHttpInfo(
            IscsiLunSnapshotDeletionParams iscsiLunSnapshotDeletionParams) throws ApiException {
        okhttp3.Call localVarCall =
                deleteIscsiLunSnapshotValidateBeforeCall(iscsiLunSnapshotDeletionParams, null);
        Type localVarReturnType =
                new TypeToken<List<WithTaskDeleteIscsiLunSnapshot>>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param iscsiLunSnapshotDeletionParams (required)
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
    public okhttp3.Call deleteIscsiLunSnapshotAsync(
            IscsiLunSnapshotDeletionParams iscsiLunSnapshotDeletionParams,
            final ApiCallback<List<WithTaskDeleteIscsiLunSnapshot>> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                deleteIscsiLunSnapshotValidateBeforeCall(iscsiLunSnapshotDeletionParams, _callback);
        Type localVarReturnType =
                new TypeToken<List<WithTaskDeleteIscsiLunSnapshot>>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getIscsiLunSnapshots
     *
     * @param getIscsiLunSnapshotsRequestBody (required)
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
    public okhttp3.Call getIscsiLunSnapshotsCall(
            GetIscsiLunSnapshotsRequestBody getIscsiLunSnapshotsRequestBody,
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

        Object localVarPostBody = getIscsiLunSnapshotsRequestBody;

        // create path and map variables
        String localVarPath = "/get-iscsi-lun-snapshots";

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
    private okhttp3.Call getIscsiLunSnapshotsValidateBeforeCall(
            GetIscsiLunSnapshotsRequestBody getIscsiLunSnapshotsRequestBody,
            final ApiCallback _callback)
            throws ApiException {

        // verify the required parameter 'getIscsiLunSnapshotsRequestBody' is set
        if (getIscsiLunSnapshotsRequestBody == null) {
            throw new ApiException(
                    "Missing the required parameter 'getIscsiLunSnapshotsRequestBody' when calling"
                            + " getIscsiLunSnapshots(Async)");
        }

        okhttp3.Call localVarCall =
                getIscsiLunSnapshotsCall(getIscsiLunSnapshotsRequestBody, _callback);
        return localVarCall;
    }

    /**
     * @param getIscsiLunSnapshotsRequestBody (required)
     * @return List&lt;IscsiLunSnapshot&gt;
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
    public List<IscsiLunSnapshot> getIscsiLunSnapshots(
            GetIscsiLunSnapshotsRequestBody getIscsiLunSnapshotsRequestBody) throws ApiException {
        ApiResponse<List<IscsiLunSnapshot>> localVarResp =
                getIscsiLunSnapshotsWithHttpInfo(getIscsiLunSnapshotsRequestBody);
        return localVarResp.getData();
    }

    /**
     * @param getIscsiLunSnapshotsRequestBody (required)
     * @return ApiResponse&lt;List&lt;IscsiLunSnapshot&gt;&gt;
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
    public ApiResponse<List<IscsiLunSnapshot>> getIscsiLunSnapshotsWithHttpInfo(
            GetIscsiLunSnapshotsRequestBody getIscsiLunSnapshotsRequestBody) throws ApiException {
        okhttp3.Call localVarCall =
                getIscsiLunSnapshotsValidateBeforeCall(getIscsiLunSnapshotsRequestBody, null);
        Type localVarReturnType = new TypeToken<List<IscsiLunSnapshot>>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param getIscsiLunSnapshotsRequestBody (required)
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
    public okhttp3.Call getIscsiLunSnapshotsAsync(
            GetIscsiLunSnapshotsRequestBody getIscsiLunSnapshotsRequestBody,
            final ApiCallback<List<IscsiLunSnapshot>> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                getIscsiLunSnapshotsValidateBeforeCall(getIscsiLunSnapshotsRequestBody, _callback);
        Type localVarReturnType = new TypeToken<List<IscsiLunSnapshot>>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getIscsiLunSnapshotsConnection
     *
     * @param getIscsiLunSnapshotsConnectionRequestBody (required)
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
    public okhttp3.Call getIscsiLunSnapshotsConnectionCall(
            GetIscsiLunSnapshotsConnectionRequestBody getIscsiLunSnapshotsConnectionRequestBody,
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

        Object localVarPostBody = getIscsiLunSnapshotsConnectionRequestBody;

        // create path and map variables
        String localVarPath = "/get-iscsi-lun-snapshots-connection";

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
    private okhttp3.Call getIscsiLunSnapshotsConnectionValidateBeforeCall(
            GetIscsiLunSnapshotsConnectionRequestBody getIscsiLunSnapshotsConnectionRequestBody,
            final ApiCallback _callback)
            throws ApiException {

        // verify the required parameter 'getIscsiLunSnapshotsConnectionRequestBody' is set
        if (getIscsiLunSnapshotsConnectionRequestBody == null) {
            throw new ApiException(
                    "Missing the required parameter 'getIscsiLunSnapshotsConnectionRequestBody'"
                            + " when calling getIscsiLunSnapshotsConnection(Async)");
        }

        okhttp3.Call localVarCall =
                getIscsiLunSnapshotsConnectionCall(
                        getIscsiLunSnapshotsConnectionRequestBody, _callback);
        return localVarCall;
    }

    /**
     * @param getIscsiLunSnapshotsConnectionRequestBody (required)
     * @return IscsiLunSnapshotConnection
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
    public IscsiLunSnapshotConnection getIscsiLunSnapshotsConnection(
            GetIscsiLunSnapshotsConnectionRequestBody getIscsiLunSnapshotsConnectionRequestBody)
            throws ApiException {
        ApiResponse<IscsiLunSnapshotConnection> localVarResp =
                getIscsiLunSnapshotsConnectionWithHttpInfo(
                        getIscsiLunSnapshotsConnectionRequestBody);
        return localVarResp.getData();
    }

    /**
     * @param getIscsiLunSnapshotsConnectionRequestBody (required)
     * @return ApiResponse&lt;IscsiLunSnapshotConnection&gt;
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
    public ApiResponse<IscsiLunSnapshotConnection> getIscsiLunSnapshotsConnectionWithHttpInfo(
            GetIscsiLunSnapshotsConnectionRequestBody getIscsiLunSnapshotsConnectionRequestBody)
            throws ApiException {
        okhttp3.Call localVarCall =
                getIscsiLunSnapshotsConnectionValidateBeforeCall(
                        getIscsiLunSnapshotsConnectionRequestBody, null);
        Type localVarReturnType = new TypeToken<IscsiLunSnapshotConnection>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param getIscsiLunSnapshotsConnectionRequestBody (required)
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
    public okhttp3.Call getIscsiLunSnapshotsConnectionAsync(
            GetIscsiLunSnapshotsConnectionRequestBody getIscsiLunSnapshotsConnectionRequestBody,
            final ApiCallback<IscsiLunSnapshotConnection> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                getIscsiLunSnapshotsConnectionValidateBeforeCall(
                        getIscsiLunSnapshotsConnectionRequestBody, _callback);
        Type localVarReturnType = new TypeToken<IscsiLunSnapshotConnection>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}

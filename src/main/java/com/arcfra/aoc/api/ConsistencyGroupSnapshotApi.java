package com.arcfra.aoc.api;


import com.arcfra.aoc.ApiCallback;
import com.arcfra.aoc.ApiClient;
import com.arcfra.aoc.ApiException;
import com.arcfra.aoc.ApiResponse;
import com.arcfra.aoc.Configuration;
import com.arcfra.aoc.Pair;
import com.arcfra.aoc.model.ConsistencyGroupSnapshot;
import com.arcfra.aoc.model.ConsistencyGroupSnapshotConnection;
import com.arcfra.aoc.model.ConsistencyGroupSnapshotCreationParams;
import com.arcfra.aoc.model.ConsistencyGroupSnapshotDeletionParams;
import com.arcfra.aoc.model.ConsistencyGroupSnapshotUpdationParams;
import com.arcfra.aoc.model.GetConsistencyGroupSnapshotsConnectionRequestBody;
import com.arcfra.aoc.model.GetConsistencyGroupSnapshotsRequestBody;
import com.arcfra.aoc.model.WithTaskConsistencyGroupSnapshot;
import com.arcfra.aoc.model.WithTaskDeleteConsistencyGroupSnapshot;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConsistencyGroupSnapshotApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ConsistencyGroupSnapshotApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ConsistencyGroupSnapshotApi(ApiClient apiClient) {
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
     * Build call for createConsistencyGroupSnapshot
     *
     * @param consistencyGroupSnapshotCreationParams (required)
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
    public okhttp3.Call createConsistencyGroupSnapshotCall(
            List<ConsistencyGroupSnapshotCreationParams> consistencyGroupSnapshotCreationParams,
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

        Object localVarPostBody = consistencyGroupSnapshotCreationParams;

        // create path and map variables
        String localVarPath = "/create-consistency-snapshot-group";

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
    private okhttp3.Call createConsistencyGroupSnapshotValidateBeforeCall(
            List<ConsistencyGroupSnapshotCreationParams> consistencyGroupSnapshotCreationParams,
            final ApiCallback _callback)
            throws ApiException {

        // verify the required parameter 'consistencyGroupSnapshotCreationParams' is set
        if (consistencyGroupSnapshotCreationParams == null) {
            throw new ApiException(
                    "Missing the required parameter 'consistencyGroupSnapshotCreationParams' when"
                            + " calling createConsistencyGroupSnapshot(Async)");
        }

        okhttp3.Call localVarCall =
                createConsistencyGroupSnapshotCall(
                        consistencyGroupSnapshotCreationParams, _callback);
        return localVarCall;
    }

    /**
     * @param consistencyGroupSnapshotCreationParams (required)
     * @return List&lt;WithTaskConsistencyGroupSnapshot&gt;
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
    public List<WithTaskConsistencyGroupSnapshot> createConsistencyGroupSnapshot(
            List<ConsistencyGroupSnapshotCreationParams> consistencyGroupSnapshotCreationParams)
            throws ApiException {
        ApiResponse<List<WithTaskConsistencyGroupSnapshot>> localVarResp =
                createConsistencyGroupSnapshotWithHttpInfo(consistencyGroupSnapshotCreationParams);
        return localVarResp.getData();
    }

    /**
     * @param consistencyGroupSnapshotCreationParams (required)
     * @return ApiResponse&lt;List&lt;WithTaskConsistencyGroupSnapshot&gt;&gt;
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
    public ApiResponse<List<WithTaskConsistencyGroupSnapshot>>
            createConsistencyGroupSnapshotWithHttpInfo(
                    List<ConsistencyGroupSnapshotCreationParams>
                            consistencyGroupSnapshotCreationParams)
                    throws ApiException {
        okhttp3.Call localVarCall =
                createConsistencyGroupSnapshotValidateBeforeCall(
                        consistencyGroupSnapshotCreationParams, null);
        Type localVarReturnType =
                new TypeToken<List<WithTaskConsistencyGroupSnapshot>>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param consistencyGroupSnapshotCreationParams (required)
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
    public okhttp3.Call createConsistencyGroupSnapshotAsync(
            List<ConsistencyGroupSnapshotCreationParams> consistencyGroupSnapshotCreationParams,
            final ApiCallback<List<WithTaskConsistencyGroupSnapshot>> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                createConsistencyGroupSnapshotValidateBeforeCall(
                        consistencyGroupSnapshotCreationParams, _callback);
        Type localVarReturnType =
                new TypeToken<List<WithTaskConsistencyGroupSnapshot>>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteConsistencyGroupSnapshot
     *
     * @param consistencyGroupSnapshotDeletionParams (required)
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
    public okhttp3.Call deleteConsistencyGroupSnapshotCall(
            ConsistencyGroupSnapshotDeletionParams consistencyGroupSnapshotDeletionParams,
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

        Object localVarPostBody = consistencyGroupSnapshotDeletionParams;

        // create path and map variables
        String localVarPath = "/delete-consistency-snapshot-group";

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
    private okhttp3.Call deleteConsistencyGroupSnapshotValidateBeforeCall(
            ConsistencyGroupSnapshotDeletionParams consistencyGroupSnapshotDeletionParams,
            final ApiCallback _callback)
            throws ApiException {

        // verify the required parameter 'consistencyGroupSnapshotDeletionParams' is set
        if (consistencyGroupSnapshotDeletionParams == null) {
            throw new ApiException(
                    "Missing the required parameter 'consistencyGroupSnapshotDeletionParams' when"
                            + " calling deleteConsistencyGroupSnapshot(Async)");
        }

        okhttp3.Call localVarCall =
                deleteConsistencyGroupSnapshotCall(
                        consistencyGroupSnapshotDeletionParams, _callback);
        return localVarCall;
    }

    /**
     * @param consistencyGroupSnapshotDeletionParams (required)
     * @return List&lt;WithTaskDeleteConsistencyGroupSnapshot&gt;
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
    public List<WithTaskDeleteConsistencyGroupSnapshot> deleteConsistencyGroupSnapshot(
            ConsistencyGroupSnapshotDeletionParams consistencyGroupSnapshotDeletionParams)
            throws ApiException {
        ApiResponse<List<WithTaskDeleteConsistencyGroupSnapshot>> localVarResp =
                deleteConsistencyGroupSnapshotWithHttpInfo(consistencyGroupSnapshotDeletionParams);
        return localVarResp.getData();
    }

    /**
     * @param consistencyGroupSnapshotDeletionParams (required)
     * @return ApiResponse&lt;List&lt;WithTaskDeleteConsistencyGroupSnapshot&gt;&gt;
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
    public ApiResponse<List<WithTaskDeleteConsistencyGroupSnapshot>>
            deleteConsistencyGroupSnapshotWithHttpInfo(
                    ConsistencyGroupSnapshotDeletionParams consistencyGroupSnapshotDeletionParams)
                    throws ApiException {
        okhttp3.Call localVarCall =
                deleteConsistencyGroupSnapshotValidateBeforeCall(
                        consistencyGroupSnapshotDeletionParams, null);
        Type localVarReturnType =
                new TypeToken<List<WithTaskDeleteConsistencyGroupSnapshot>>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param consistencyGroupSnapshotDeletionParams (required)
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
    public okhttp3.Call deleteConsistencyGroupSnapshotAsync(
            ConsistencyGroupSnapshotDeletionParams consistencyGroupSnapshotDeletionParams,
            final ApiCallback<List<WithTaskDeleteConsistencyGroupSnapshot>> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                deleteConsistencyGroupSnapshotValidateBeforeCall(
                        consistencyGroupSnapshotDeletionParams, _callback);
        Type localVarReturnType =
                new TypeToken<List<WithTaskDeleteConsistencyGroupSnapshot>>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getConsistencyGroupSnapshots
     *
     * @param getConsistencyGroupSnapshotsRequestBody (required)
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
    public okhttp3.Call getConsistencyGroupSnapshotsCall(
            GetConsistencyGroupSnapshotsRequestBody getConsistencyGroupSnapshotsRequestBody,
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

        Object localVarPostBody = getConsistencyGroupSnapshotsRequestBody;

        // create path and map variables
        String localVarPath = "/get-consistency-group-snapshots";

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
    private okhttp3.Call getConsistencyGroupSnapshotsValidateBeforeCall(
            GetConsistencyGroupSnapshotsRequestBody getConsistencyGroupSnapshotsRequestBody,
            final ApiCallback _callback)
            throws ApiException {

        // verify the required parameter 'getConsistencyGroupSnapshotsRequestBody' is set
        if (getConsistencyGroupSnapshotsRequestBody == null) {
            throw new ApiException(
                    "Missing the required parameter 'getConsistencyGroupSnapshotsRequestBody' when"
                            + " calling getConsistencyGroupSnapshots(Async)");
        }

        okhttp3.Call localVarCall =
                getConsistencyGroupSnapshotsCall(
                        getConsistencyGroupSnapshotsRequestBody, _callback);
        return localVarCall;
    }

    /**
     * @param getConsistencyGroupSnapshotsRequestBody (required)
     * @return List&lt;ConsistencyGroupSnapshot&gt;
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
    public List<ConsistencyGroupSnapshot> getConsistencyGroupSnapshots(
            GetConsistencyGroupSnapshotsRequestBody getConsistencyGroupSnapshotsRequestBody)
            throws ApiException {
        ApiResponse<List<ConsistencyGroupSnapshot>> localVarResp =
                getConsistencyGroupSnapshotsWithHttpInfo(getConsistencyGroupSnapshotsRequestBody);
        return localVarResp.getData();
    }

    /**
     * @param getConsistencyGroupSnapshotsRequestBody (required)
     * @return ApiResponse&lt;List&lt;ConsistencyGroupSnapshot&gt;&gt;
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
    public ApiResponse<List<ConsistencyGroupSnapshot>> getConsistencyGroupSnapshotsWithHttpInfo(
            GetConsistencyGroupSnapshotsRequestBody getConsistencyGroupSnapshotsRequestBody)
            throws ApiException {
        okhttp3.Call localVarCall =
                getConsistencyGroupSnapshotsValidateBeforeCall(
                        getConsistencyGroupSnapshotsRequestBody, null);
        Type localVarReturnType = new TypeToken<List<ConsistencyGroupSnapshot>>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param getConsistencyGroupSnapshotsRequestBody (required)
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
    public okhttp3.Call getConsistencyGroupSnapshotsAsync(
            GetConsistencyGroupSnapshotsRequestBody getConsistencyGroupSnapshotsRequestBody,
            final ApiCallback<List<ConsistencyGroupSnapshot>> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                getConsistencyGroupSnapshotsValidateBeforeCall(
                        getConsistencyGroupSnapshotsRequestBody, _callback);
        Type localVarReturnType = new TypeToken<List<ConsistencyGroupSnapshot>>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getConsistencyGroupSnapshotsConnection
     *
     * @param getConsistencyGroupSnapshotsConnectionRequestBody (required)
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
    public okhttp3.Call getConsistencyGroupSnapshotsConnectionCall(
            GetConsistencyGroupSnapshotsConnectionRequestBody
                    getConsistencyGroupSnapshotsConnectionRequestBody,
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

        Object localVarPostBody = getConsistencyGroupSnapshotsConnectionRequestBody;

        // create path and map variables
        String localVarPath = "/get-consistency-group-snapshots-connection";

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
    private okhttp3.Call getConsistencyGroupSnapshotsConnectionValidateBeforeCall(
            GetConsistencyGroupSnapshotsConnectionRequestBody
                    getConsistencyGroupSnapshotsConnectionRequestBody,
            final ApiCallback _callback)
            throws ApiException {

        // verify the required parameter 'getConsistencyGroupSnapshotsConnectionRequestBody' is set
        if (getConsistencyGroupSnapshotsConnectionRequestBody == null) {
            throw new ApiException(
                    "Missing the required parameter"
                            + " 'getConsistencyGroupSnapshotsConnectionRequestBody' when calling"
                            + " getConsistencyGroupSnapshotsConnection(Async)");
        }

        okhttp3.Call localVarCall =
                getConsistencyGroupSnapshotsConnectionCall(
                        getConsistencyGroupSnapshotsConnectionRequestBody, _callback);
        return localVarCall;
    }

    /**
     * @param getConsistencyGroupSnapshotsConnectionRequestBody (required)
     * @return ConsistencyGroupSnapshotConnection
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
    public ConsistencyGroupSnapshotConnection getConsistencyGroupSnapshotsConnection(
            GetConsistencyGroupSnapshotsConnectionRequestBody
                    getConsistencyGroupSnapshotsConnectionRequestBody)
            throws ApiException {
        ApiResponse<ConsistencyGroupSnapshotConnection> localVarResp =
                getConsistencyGroupSnapshotsConnectionWithHttpInfo(
                        getConsistencyGroupSnapshotsConnectionRequestBody);
        return localVarResp.getData();
    }

    /**
     * @param getConsistencyGroupSnapshotsConnectionRequestBody (required)
     * @return ApiResponse&lt;ConsistencyGroupSnapshotConnection&gt;
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
    public ApiResponse<ConsistencyGroupSnapshotConnection>
            getConsistencyGroupSnapshotsConnectionWithHttpInfo(
                    GetConsistencyGroupSnapshotsConnectionRequestBody
                            getConsistencyGroupSnapshotsConnectionRequestBody)
                    throws ApiException {
        okhttp3.Call localVarCall =
                getConsistencyGroupSnapshotsConnectionValidateBeforeCall(
                        getConsistencyGroupSnapshotsConnectionRequestBody, null);
        Type localVarReturnType = new TypeToken<ConsistencyGroupSnapshotConnection>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param getConsistencyGroupSnapshotsConnectionRequestBody (required)
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
    public okhttp3.Call getConsistencyGroupSnapshotsConnectionAsync(
            GetConsistencyGroupSnapshotsConnectionRequestBody
                    getConsistencyGroupSnapshotsConnectionRequestBody,
            final ApiCallback<ConsistencyGroupSnapshotConnection> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                getConsistencyGroupSnapshotsConnectionValidateBeforeCall(
                        getConsistencyGroupSnapshotsConnectionRequestBody, _callback);
        Type localVarReturnType = new TypeToken<ConsistencyGroupSnapshotConnection>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateConsistencyGroupSnapshot
     *
     * @param consistencyGroupSnapshotUpdationParams (required)
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
    public okhttp3.Call updateConsistencyGroupSnapshotCall(
            ConsistencyGroupSnapshotUpdationParams consistencyGroupSnapshotUpdationParams,
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

        Object localVarPostBody = consistencyGroupSnapshotUpdationParams;

        // create path and map variables
        String localVarPath = "/rollback-consistency-snapshot-group";

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
    private okhttp3.Call updateConsistencyGroupSnapshotValidateBeforeCall(
            ConsistencyGroupSnapshotUpdationParams consistencyGroupSnapshotUpdationParams,
            final ApiCallback _callback)
            throws ApiException {

        // verify the required parameter 'consistencyGroupSnapshotUpdationParams' is set
        if (consistencyGroupSnapshotUpdationParams == null) {
            throw new ApiException(
                    "Missing the required parameter 'consistencyGroupSnapshotUpdationParams' when"
                            + " calling updateConsistencyGroupSnapshot(Async)");
        }

        okhttp3.Call localVarCall =
                updateConsistencyGroupSnapshotCall(
                        consistencyGroupSnapshotUpdationParams, _callback);
        return localVarCall;
    }

    /**
     * @param consistencyGroupSnapshotUpdationParams (required)
     * @return List&lt;WithTaskConsistencyGroupSnapshot&gt;
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
    public List<WithTaskConsistencyGroupSnapshot> updateConsistencyGroupSnapshot(
            ConsistencyGroupSnapshotUpdationParams consistencyGroupSnapshotUpdationParams)
            throws ApiException {
        ApiResponse<List<WithTaskConsistencyGroupSnapshot>> localVarResp =
                updateConsistencyGroupSnapshotWithHttpInfo(consistencyGroupSnapshotUpdationParams);
        return localVarResp.getData();
    }

    /**
     * @param consistencyGroupSnapshotUpdationParams (required)
     * @return ApiResponse&lt;List&lt;WithTaskConsistencyGroupSnapshot&gt;&gt;
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
    public ApiResponse<List<WithTaskConsistencyGroupSnapshot>>
            updateConsistencyGroupSnapshotWithHttpInfo(
                    ConsistencyGroupSnapshotUpdationParams consistencyGroupSnapshotUpdationParams)
                    throws ApiException {
        okhttp3.Call localVarCall =
                updateConsistencyGroupSnapshotValidateBeforeCall(
                        consistencyGroupSnapshotUpdationParams, null);
        Type localVarReturnType =
                new TypeToken<List<WithTaskConsistencyGroupSnapshot>>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param consistencyGroupSnapshotUpdationParams (required)
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
    public okhttp3.Call updateConsistencyGroupSnapshotAsync(
            ConsistencyGroupSnapshotUpdationParams consistencyGroupSnapshotUpdationParams,
            final ApiCallback<List<WithTaskConsistencyGroupSnapshot>> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                updateConsistencyGroupSnapshotValidateBeforeCall(
                        consistencyGroupSnapshotUpdationParams, _callback);
        Type localVarReturnType =
                new TypeToken<List<WithTaskConsistencyGroupSnapshot>>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}

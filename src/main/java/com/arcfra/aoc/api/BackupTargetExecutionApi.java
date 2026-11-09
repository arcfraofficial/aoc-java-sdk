package com.arcfra.aoc.api;


import com.arcfra.aoc.ApiCallback;
import com.arcfra.aoc.ApiClient;
import com.arcfra.aoc.ApiException;
import com.arcfra.aoc.ApiResponse;
import com.arcfra.aoc.Configuration;
import com.arcfra.aoc.Pair;
import com.arcfra.aoc.model.BackupTargetExecution;
import com.arcfra.aoc.model.BackupTargetExecutionConnection;
import com.arcfra.aoc.model.GetBackupTargetExecutionsConnectionRequestBody;
import com.arcfra.aoc.model.GetBackupTargetExecutionsRequestBody;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BackupTargetExecutionApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public BackupTargetExecutionApi() {
        this(Configuration.getDefaultApiClient());
    }

    public BackupTargetExecutionApi(ApiClient apiClient) {
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
     * Build call for getBackupTargetExecutions
     *
     * @param getBackupTargetExecutionsRequestBody (required)
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
    public okhttp3.Call getBackupTargetExecutionsCall(
            GetBackupTargetExecutionsRequestBody getBackupTargetExecutionsRequestBody,
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

        Object localVarPostBody = getBackupTargetExecutionsRequestBody;

        // create path and map variables
        String localVarPath = "/get-backup-target-executions";

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
    private okhttp3.Call getBackupTargetExecutionsValidateBeforeCall(
            GetBackupTargetExecutionsRequestBody getBackupTargetExecutionsRequestBody,
            final ApiCallback _callback)
            throws ApiException {

        // verify the required parameter 'getBackupTargetExecutionsRequestBody' is set
        if (getBackupTargetExecutionsRequestBody == null) {
            throw new ApiException(
                    "Missing the required parameter 'getBackupTargetExecutionsRequestBody' when"
                            + " calling getBackupTargetExecutions(Async)");
        }

        okhttp3.Call localVarCall =
                getBackupTargetExecutionsCall(getBackupTargetExecutionsRequestBody, _callback);
        return localVarCall;
    }

    /**
     * @param getBackupTargetExecutionsRequestBody (required)
     * @return List&lt;BackupTargetExecution&gt;
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
    public List<BackupTargetExecution> getBackupTargetExecutions(
            GetBackupTargetExecutionsRequestBody getBackupTargetExecutionsRequestBody)
            throws ApiException {
        ApiResponse<List<BackupTargetExecution>> localVarResp =
                getBackupTargetExecutionsWithHttpInfo(getBackupTargetExecutionsRequestBody);
        return localVarResp.getData();
    }

    /**
     * @param getBackupTargetExecutionsRequestBody (required)
     * @return ApiResponse&lt;List&lt;BackupTargetExecution&gt;&gt;
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
    public ApiResponse<List<BackupTargetExecution>> getBackupTargetExecutionsWithHttpInfo(
            GetBackupTargetExecutionsRequestBody getBackupTargetExecutionsRequestBody)
            throws ApiException {
        okhttp3.Call localVarCall =
                getBackupTargetExecutionsValidateBeforeCall(
                        getBackupTargetExecutionsRequestBody, null);
        Type localVarReturnType = new TypeToken<List<BackupTargetExecution>>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param getBackupTargetExecutionsRequestBody (required)
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
    public okhttp3.Call getBackupTargetExecutionsAsync(
            GetBackupTargetExecutionsRequestBody getBackupTargetExecutionsRequestBody,
            final ApiCallback<List<BackupTargetExecution>> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                getBackupTargetExecutionsValidateBeforeCall(
                        getBackupTargetExecutionsRequestBody, _callback);
        Type localVarReturnType = new TypeToken<List<BackupTargetExecution>>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getBackupTargetExecutionsConnection
     *
     * @param getBackupTargetExecutionsConnectionRequestBody (required)
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
    public okhttp3.Call getBackupTargetExecutionsConnectionCall(
            GetBackupTargetExecutionsConnectionRequestBody
                    getBackupTargetExecutionsConnectionRequestBody,
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

        Object localVarPostBody = getBackupTargetExecutionsConnectionRequestBody;

        // create path and map variables
        String localVarPath = "/get-backup-target-executions-connection";

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
    private okhttp3.Call getBackupTargetExecutionsConnectionValidateBeforeCall(
            GetBackupTargetExecutionsConnectionRequestBody
                    getBackupTargetExecutionsConnectionRequestBody,
            final ApiCallback _callback)
            throws ApiException {

        // verify the required parameter 'getBackupTargetExecutionsConnectionRequestBody' is set
        if (getBackupTargetExecutionsConnectionRequestBody == null) {
            throw new ApiException(
                    "Missing the required parameter"
                            + " 'getBackupTargetExecutionsConnectionRequestBody' when calling"
                            + " getBackupTargetExecutionsConnection(Async)");
        }

        okhttp3.Call localVarCall =
                getBackupTargetExecutionsConnectionCall(
                        getBackupTargetExecutionsConnectionRequestBody, _callback);
        return localVarCall;
    }

    /**
     * @param getBackupTargetExecutionsConnectionRequestBody (required)
     * @return BackupTargetExecutionConnection
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
    public BackupTargetExecutionConnection getBackupTargetExecutionsConnection(
            GetBackupTargetExecutionsConnectionRequestBody
                    getBackupTargetExecutionsConnectionRequestBody)
            throws ApiException {
        ApiResponse<BackupTargetExecutionConnection> localVarResp =
                getBackupTargetExecutionsConnectionWithHttpInfo(
                        getBackupTargetExecutionsConnectionRequestBody);
        return localVarResp.getData();
    }

    /**
     * @param getBackupTargetExecutionsConnectionRequestBody (required)
     * @return ApiResponse&lt;BackupTargetExecutionConnection&gt;
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
    public ApiResponse<BackupTargetExecutionConnection>
            getBackupTargetExecutionsConnectionWithHttpInfo(
                    GetBackupTargetExecutionsConnectionRequestBody
                            getBackupTargetExecutionsConnectionRequestBody)
                    throws ApiException {
        okhttp3.Call localVarCall =
                getBackupTargetExecutionsConnectionValidateBeforeCall(
                        getBackupTargetExecutionsConnectionRequestBody, null);
        Type localVarReturnType = new TypeToken<BackupTargetExecutionConnection>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param getBackupTargetExecutionsConnectionRequestBody (required)
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
    public okhttp3.Call getBackupTargetExecutionsConnectionAsync(
            GetBackupTargetExecutionsConnectionRequestBody
                    getBackupTargetExecutionsConnectionRequestBody,
            final ApiCallback<BackupTargetExecutionConnection> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                getBackupTargetExecutionsConnectionValidateBeforeCall(
                        getBackupTargetExecutionsConnectionRequestBody, _callback);
        Type localVarReturnType = new TypeToken<BackupTargetExecutionConnection>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}

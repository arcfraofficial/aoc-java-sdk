package com.arcfra.aoc.api;


import com.arcfra.aoc.ApiCallback;
import com.arcfra.aoc.ApiClient;
import com.arcfra.aoc.ApiException;
import com.arcfra.aoc.ApiResponse;
import com.arcfra.aoc.Configuration;
import com.arcfra.aoc.Pair;
import com.arcfra.aoc.model.GetSnmpTrapReceiversConnectionRequestBody;
import com.arcfra.aoc.model.GetSnmpTrapReceiversRequestBody;
import com.arcfra.aoc.model.SnmpTrapReceiver;
import com.arcfra.aoc.model.SnmpTrapReceiverConnection;
import com.arcfra.aoc.model.SnmpTrapReceiverCreationParams;
import com.arcfra.aoc.model.SnmpTrapReceiverDeletionParams;
import com.arcfra.aoc.model.SnmpTrapReceiverUpdationParams;
import com.arcfra.aoc.model.WithTaskDeleteSnmpTrapReceiver;
import com.arcfra.aoc.model.WithTaskSnmpTrapReceiver;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SnmpTrapReceiverApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public SnmpTrapReceiverApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SnmpTrapReceiverApi(ApiClient apiClient) {
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
     * Build call for createSnmpTrapReceiver
     *
     * @param snmpTrapReceiverCreationParams (required)
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
    public okhttp3.Call createSnmpTrapReceiverCall(
            List<SnmpTrapReceiverCreationParams> snmpTrapReceiverCreationParams,
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

        Object localVarPostBody = snmpTrapReceiverCreationParams;

        // create path and map variables
        String localVarPath = "/create-snmp-trap-receiver";

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
    private okhttp3.Call createSnmpTrapReceiverValidateBeforeCall(
            List<SnmpTrapReceiverCreationParams> snmpTrapReceiverCreationParams,
            final ApiCallback _callback)
            throws ApiException {

        // verify the required parameter 'snmpTrapReceiverCreationParams' is set
        if (snmpTrapReceiverCreationParams == null) {
            throw new ApiException(
                    "Missing the required parameter 'snmpTrapReceiverCreationParams' when calling"
                            + " createSnmpTrapReceiver(Async)");
        }

        okhttp3.Call localVarCall =
                createSnmpTrapReceiverCall(snmpTrapReceiverCreationParams, _callback);
        return localVarCall;
    }

    /**
     * @param snmpTrapReceiverCreationParams (required)
     * @return List&lt;WithTaskSnmpTrapReceiver&gt;
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
    public List<WithTaskSnmpTrapReceiver> createSnmpTrapReceiver(
            List<SnmpTrapReceiverCreationParams> snmpTrapReceiverCreationParams)
            throws ApiException {
        ApiResponse<List<WithTaskSnmpTrapReceiver>> localVarResp =
                createSnmpTrapReceiverWithHttpInfo(snmpTrapReceiverCreationParams);
        return localVarResp.getData();
    }

    /**
     * @param snmpTrapReceiverCreationParams (required)
     * @return ApiResponse&lt;List&lt;WithTaskSnmpTrapReceiver&gt;&gt;
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
    public ApiResponse<List<WithTaskSnmpTrapReceiver>> createSnmpTrapReceiverWithHttpInfo(
            List<SnmpTrapReceiverCreationParams> snmpTrapReceiverCreationParams)
            throws ApiException {
        okhttp3.Call localVarCall =
                createSnmpTrapReceiverValidateBeforeCall(snmpTrapReceiverCreationParams, null);
        Type localVarReturnType = new TypeToken<List<WithTaskSnmpTrapReceiver>>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param snmpTrapReceiverCreationParams (required)
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
    public okhttp3.Call createSnmpTrapReceiverAsync(
            List<SnmpTrapReceiverCreationParams> snmpTrapReceiverCreationParams,
            final ApiCallback<List<WithTaskSnmpTrapReceiver>> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                createSnmpTrapReceiverValidateBeforeCall(snmpTrapReceiverCreationParams, _callback);
        Type localVarReturnType = new TypeToken<List<WithTaskSnmpTrapReceiver>>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteSnmpTrapReceiver
     *
     * @param snmpTrapReceiverDeletionParams (required)
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
    public okhttp3.Call deleteSnmpTrapReceiverCall(
            SnmpTrapReceiverDeletionParams snmpTrapReceiverDeletionParams,
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

        Object localVarPostBody = snmpTrapReceiverDeletionParams;

        // create path and map variables
        String localVarPath = "/delete-snmp-trap-receiver";

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
    private okhttp3.Call deleteSnmpTrapReceiverValidateBeforeCall(
            SnmpTrapReceiverDeletionParams snmpTrapReceiverDeletionParams,
            final ApiCallback _callback)
            throws ApiException {

        // verify the required parameter 'snmpTrapReceiverDeletionParams' is set
        if (snmpTrapReceiverDeletionParams == null) {
            throw new ApiException(
                    "Missing the required parameter 'snmpTrapReceiverDeletionParams' when calling"
                            + " deleteSnmpTrapReceiver(Async)");
        }

        okhttp3.Call localVarCall =
                deleteSnmpTrapReceiverCall(snmpTrapReceiverDeletionParams, _callback);
        return localVarCall;
    }

    /**
     * @param snmpTrapReceiverDeletionParams (required)
     * @return List&lt;WithTaskDeleteSnmpTrapReceiver&gt;
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
    public List<WithTaskDeleteSnmpTrapReceiver> deleteSnmpTrapReceiver(
            SnmpTrapReceiverDeletionParams snmpTrapReceiverDeletionParams) throws ApiException {
        ApiResponse<List<WithTaskDeleteSnmpTrapReceiver>> localVarResp =
                deleteSnmpTrapReceiverWithHttpInfo(snmpTrapReceiverDeletionParams);
        return localVarResp.getData();
    }

    /**
     * @param snmpTrapReceiverDeletionParams (required)
     * @return ApiResponse&lt;List&lt;WithTaskDeleteSnmpTrapReceiver&gt;&gt;
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
    public ApiResponse<List<WithTaskDeleteSnmpTrapReceiver>> deleteSnmpTrapReceiverWithHttpInfo(
            SnmpTrapReceiverDeletionParams snmpTrapReceiverDeletionParams) throws ApiException {
        okhttp3.Call localVarCall =
                deleteSnmpTrapReceiverValidateBeforeCall(snmpTrapReceiverDeletionParams, null);
        Type localVarReturnType =
                new TypeToken<List<WithTaskDeleteSnmpTrapReceiver>>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param snmpTrapReceiverDeletionParams (required)
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
    public okhttp3.Call deleteSnmpTrapReceiverAsync(
            SnmpTrapReceiverDeletionParams snmpTrapReceiverDeletionParams,
            final ApiCallback<List<WithTaskDeleteSnmpTrapReceiver>> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                deleteSnmpTrapReceiverValidateBeforeCall(snmpTrapReceiverDeletionParams, _callback);
        Type localVarReturnType =
                new TypeToken<List<WithTaskDeleteSnmpTrapReceiver>>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getSnmpTrapReceivers
     *
     * @param getSnmpTrapReceiversRequestBody (required)
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
    public okhttp3.Call getSnmpTrapReceiversCall(
            GetSnmpTrapReceiversRequestBody getSnmpTrapReceiversRequestBody,
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

        Object localVarPostBody = getSnmpTrapReceiversRequestBody;

        // create path and map variables
        String localVarPath = "/get-snmp-trap-receivers";

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
    private okhttp3.Call getSnmpTrapReceiversValidateBeforeCall(
            GetSnmpTrapReceiversRequestBody getSnmpTrapReceiversRequestBody,
            final ApiCallback _callback)
            throws ApiException {

        // verify the required parameter 'getSnmpTrapReceiversRequestBody' is set
        if (getSnmpTrapReceiversRequestBody == null) {
            throw new ApiException(
                    "Missing the required parameter 'getSnmpTrapReceiversRequestBody' when calling"
                            + " getSnmpTrapReceivers(Async)");
        }

        okhttp3.Call localVarCall =
                getSnmpTrapReceiversCall(getSnmpTrapReceiversRequestBody, _callback);
        return localVarCall;
    }

    /**
     * @param getSnmpTrapReceiversRequestBody (required)
     * @return List&lt;SnmpTrapReceiver&gt;
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
    public List<SnmpTrapReceiver> getSnmpTrapReceivers(
            GetSnmpTrapReceiversRequestBody getSnmpTrapReceiversRequestBody) throws ApiException {
        ApiResponse<List<SnmpTrapReceiver>> localVarResp =
                getSnmpTrapReceiversWithHttpInfo(getSnmpTrapReceiversRequestBody);
        return localVarResp.getData();
    }

    /**
     * @param getSnmpTrapReceiversRequestBody (required)
     * @return ApiResponse&lt;List&lt;SnmpTrapReceiver&gt;&gt;
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
    public ApiResponse<List<SnmpTrapReceiver>> getSnmpTrapReceiversWithHttpInfo(
            GetSnmpTrapReceiversRequestBody getSnmpTrapReceiversRequestBody) throws ApiException {
        okhttp3.Call localVarCall =
                getSnmpTrapReceiversValidateBeforeCall(getSnmpTrapReceiversRequestBody, null);
        Type localVarReturnType = new TypeToken<List<SnmpTrapReceiver>>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param getSnmpTrapReceiversRequestBody (required)
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
    public okhttp3.Call getSnmpTrapReceiversAsync(
            GetSnmpTrapReceiversRequestBody getSnmpTrapReceiversRequestBody,
            final ApiCallback<List<SnmpTrapReceiver>> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                getSnmpTrapReceiversValidateBeforeCall(getSnmpTrapReceiversRequestBody, _callback);
        Type localVarReturnType = new TypeToken<List<SnmpTrapReceiver>>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getSnmpTrapReceiversConnection
     *
     * @param getSnmpTrapReceiversConnectionRequestBody (required)
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
    public okhttp3.Call getSnmpTrapReceiversConnectionCall(
            GetSnmpTrapReceiversConnectionRequestBody getSnmpTrapReceiversConnectionRequestBody,
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

        Object localVarPostBody = getSnmpTrapReceiversConnectionRequestBody;

        // create path and map variables
        String localVarPath = "/get-snmp-trap-receivers-connection";

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
    private okhttp3.Call getSnmpTrapReceiversConnectionValidateBeforeCall(
            GetSnmpTrapReceiversConnectionRequestBody getSnmpTrapReceiversConnectionRequestBody,
            final ApiCallback _callback)
            throws ApiException {

        // verify the required parameter 'getSnmpTrapReceiversConnectionRequestBody' is set
        if (getSnmpTrapReceiversConnectionRequestBody == null) {
            throw new ApiException(
                    "Missing the required parameter 'getSnmpTrapReceiversConnectionRequestBody'"
                            + " when calling getSnmpTrapReceiversConnection(Async)");
        }

        okhttp3.Call localVarCall =
                getSnmpTrapReceiversConnectionCall(
                        getSnmpTrapReceiversConnectionRequestBody, _callback);
        return localVarCall;
    }

    /**
     * @param getSnmpTrapReceiversConnectionRequestBody (required)
     * @return SnmpTrapReceiverConnection
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
    public SnmpTrapReceiverConnection getSnmpTrapReceiversConnection(
            GetSnmpTrapReceiversConnectionRequestBody getSnmpTrapReceiversConnectionRequestBody)
            throws ApiException {
        ApiResponse<SnmpTrapReceiverConnection> localVarResp =
                getSnmpTrapReceiversConnectionWithHttpInfo(
                        getSnmpTrapReceiversConnectionRequestBody);
        return localVarResp.getData();
    }

    /**
     * @param getSnmpTrapReceiversConnectionRequestBody (required)
     * @return ApiResponse&lt;SnmpTrapReceiverConnection&gt;
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
    public ApiResponse<SnmpTrapReceiverConnection> getSnmpTrapReceiversConnectionWithHttpInfo(
            GetSnmpTrapReceiversConnectionRequestBody getSnmpTrapReceiversConnectionRequestBody)
            throws ApiException {
        okhttp3.Call localVarCall =
                getSnmpTrapReceiversConnectionValidateBeforeCall(
                        getSnmpTrapReceiversConnectionRequestBody, null);
        Type localVarReturnType = new TypeToken<SnmpTrapReceiverConnection>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param getSnmpTrapReceiversConnectionRequestBody (required)
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
    public okhttp3.Call getSnmpTrapReceiversConnectionAsync(
            GetSnmpTrapReceiversConnectionRequestBody getSnmpTrapReceiversConnectionRequestBody,
            final ApiCallback<SnmpTrapReceiverConnection> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                getSnmpTrapReceiversConnectionValidateBeforeCall(
                        getSnmpTrapReceiversConnectionRequestBody, _callback);
        Type localVarReturnType = new TypeToken<SnmpTrapReceiverConnection>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateSnmpTrapReceiver
     *
     * @param snmpTrapReceiverUpdationParams (required)
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
    public okhttp3.Call updateSnmpTrapReceiverCall(
            SnmpTrapReceiverUpdationParams snmpTrapReceiverUpdationParams,
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

        Object localVarPostBody = snmpTrapReceiverUpdationParams;

        // create path and map variables
        String localVarPath = "/update-snmp-trap-receiver";

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
    private okhttp3.Call updateSnmpTrapReceiverValidateBeforeCall(
            SnmpTrapReceiverUpdationParams snmpTrapReceiverUpdationParams,
            final ApiCallback _callback)
            throws ApiException {

        // verify the required parameter 'snmpTrapReceiverUpdationParams' is set
        if (snmpTrapReceiverUpdationParams == null) {
            throw new ApiException(
                    "Missing the required parameter 'snmpTrapReceiverUpdationParams' when calling"
                            + " updateSnmpTrapReceiver(Async)");
        }

        okhttp3.Call localVarCall =
                updateSnmpTrapReceiverCall(snmpTrapReceiverUpdationParams, _callback);
        return localVarCall;
    }

    /**
     * @param snmpTrapReceiverUpdationParams (required)
     * @return List&lt;WithTaskSnmpTrapReceiver&gt;
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
    public List<WithTaskSnmpTrapReceiver> updateSnmpTrapReceiver(
            SnmpTrapReceiverUpdationParams snmpTrapReceiverUpdationParams) throws ApiException {
        ApiResponse<List<WithTaskSnmpTrapReceiver>> localVarResp =
                updateSnmpTrapReceiverWithHttpInfo(snmpTrapReceiverUpdationParams);
        return localVarResp.getData();
    }

    /**
     * @param snmpTrapReceiverUpdationParams (required)
     * @return ApiResponse&lt;List&lt;WithTaskSnmpTrapReceiver&gt;&gt;
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
    public ApiResponse<List<WithTaskSnmpTrapReceiver>> updateSnmpTrapReceiverWithHttpInfo(
            SnmpTrapReceiverUpdationParams snmpTrapReceiverUpdationParams) throws ApiException {
        okhttp3.Call localVarCall =
                updateSnmpTrapReceiverValidateBeforeCall(snmpTrapReceiverUpdationParams, null);
        Type localVarReturnType = new TypeToken<List<WithTaskSnmpTrapReceiver>>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param snmpTrapReceiverUpdationParams (required)
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
    public okhttp3.Call updateSnmpTrapReceiverAsync(
            SnmpTrapReceiverUpdationParams snmpTrapReceiverUpdationParams,
            final ApiCallback<List<WithTaskSnmpTrapReceiver>> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                updateSnmpTrapReceiverValidateBeforeCall(snmpTrapReceiverUpdationParams, _callback);
        Type localVarReturnType = new TypeToken<List<WithTaskSnmpTrapReceiver>>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}

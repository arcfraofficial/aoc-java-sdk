package com.arcfra.aoc.api;


import com.arcfra.aoc.ApiCallback;
import com.arcfra.aoc.ApiClient;
import com.arcfra.aoc.ApiException;
import com.arcfra.aoc.ApiResponse;
import com.arcfra.aoc.Configuration;
import com.arcfra.aoc.Pair;
import com.arcfra.aoc.model.GetNvmfSubsystemsConnectionRequestBody;
import com.arcfra.aoc.model.GetNvmfSubsystemsRequestBody;
import com.arcfra.aoc.model.NvmfSubsystem;
import com.arcfra.aoc.model.NvmfSubsystemConnection;
import com.arcfra.aoc.model.NvmfSubsystemCreationParams;
import com.arcfra.aoc.model.NvmfSubsystemDeletionParams;
import com.arcfra.aoc.model.NvmfSubsystemUpdationParams;
import com.arcfra.aoc.model.WithTaskDeleteNvmfSubsystem;
import com.arcfra.aoc.model.WithTaskNvmfSubsystem;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NvmfSubsystemApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public NvmfSubsystemApi() {
        this(Configuration.getDefaultApiClient());
    }

    public NvmfSubsystemApi(ApiClient apiClient) {
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
     * Build call for createNvmfSubsystem
     *
     * @param nvmfSubsystemCreationParams (required)
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
    public okhttp3.Call createNvmfSubsystemCall(
            List<NvmfSubsystemCreationParams> nvmfSubsystemCreationParams,
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

        Object localVarPostBody = nvmfSubsystemCreationParams;

        // create path and map variables
        String localVarPath = "/create-nvmf-subsystem";

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
    private okhttp3.Call createNvmfSubsystemValidateBeforeCall(
            List<NvmfSubsystemCreationParams> nvmfSubsystemCreationParams,
            final ApiCallback _callback)
            throws ApiException {

        // verify the required parameter 'nvmfSubsystemCreationParams' is set
        if (nvmfSubsystemCreationParams == null) {
            throw new ApiException(
                    "Missing the required parameter 'nvmfSubsystemCreationParams' when calling"
                            + " createNvmfSubsystem(Async)");
        }

        okhttp3.Call localVarCall = createNvmfSubsystemCall(nvmfSubsystemCreationParams, _callback);
        return localVarCall;
    }

    /**
     * @param nvmfSubsystemCreationParams (required)
     * @return List&lt;WithTaskNvmfSubsystem&gt;
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
    public List<WithTaskNvmfSubsystem> createNvmfSubsystem(
            List<NvmfSubsystemCreationParams> nvmfSubsystemCreationParams) throws ApiException {
        ApiResponse<List<WithTaskNvmfSubsystem>> localVarResp =
                createNvmfSubsystemWithHttpInfo(nvmfSubsystemCreationParams);
        return localVarResp.getData();
    }

    /**
     * @param nvmfSubsystemCreationParams (required)
     * @return ApiResponse&lt;List&lt;WithTaskNvmfSubsystem&gt;&gt;
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
    public ApiResponse<List<WithTaskNvmfSubsystem>> createNvmfSubsystemWithHttpInfo(
            List<NvmfSubsystemCreationParams> nvmfSubsystemCreationParams) throws ApiException {
        okhttp3.Call localVarCall =
                createNvmfSubsystemValidateBeforeCall(nvmfSubsystemCreationParams, null);
        Type localVarReturnType = new TypeToken<List<WithTaskNvmfSubsystem>>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param nvmfSubsystemCreationParams (required)
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
    public okhttp3.Call createNvmfSubsystemAsync(
            List<NvmfSubsystemCreationParams> nvmfSubsystemCreationParams,
            final ApiCallback<List<WithTaskNvmfSubsystem>> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                createNvmfSubsystemValidateBeforeCall(nvmfSubsystemCreationParams, _callback);
        Type localVarReturnType = new TypeToken<List<WithTaskNvmfSubsystem>>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteNvmfSubsystem
     *
     * @param nvmfSubsystemDeletionParams (required)
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
    public okhttp3.Call deleteNvmfSubsystemCall(
            NvmfSubsystemDeletionParams nvmfSubsystemDeletionParams, final ApiCallback _callback)
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

        Object localVarPostBody = nvmfSubsystemDeletionParams;

        // create path and map variables
        String localVarPath = "/delete-nvmf-subsystem";

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
    private okhttp3.Call deleteNvmfSubsystemValidateBeforeCall(
            NvmfSubsystemDeletionParams nvmfSubsystemDeletionParams, final ApiCallback _callback)
            throws ApiException {

        // verify the required parameter 'nvmfSubsystemDeletionParams' is set
        if (nvmfSubsystemDeletionParams == null) {
            throw new ApiException(
                    "Missing the required parameter 'nvmfSubsystemDeletionParams' when calling"
                            + " deleteNvmfSubsystem(Async)");
        }

        okhttp3.Call localVarCall = deleteNvmfSubsystemCall(nvmfSubsystemDeletionParams, _callback);
        return localVarCall;
    }

    /**
     * @param nvmfSubsystemDeletionParams (required)
     * @return List&lt;WithTaskDeleteNvmfSubsystem&gt;
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
    public List<WithTaskDeleteNvmfSubsystem> deleteNvmfSubsystem(
            NvmfSubsystemDeletionParams nvmfSubsystemDeletionParams) throws ApiException {
        ApiResponse<List<WithTaskDeleteNvmfSubsystem>> localVarResp =
                deleteNvmfSubsystemWithHttpInfo(nvmfSubsystemDeletionParams);
        return localVarResp.getData();
    }

    /**
     * @param nvmfSubsystemDeletionParams (required)
     * @return ApiResponse&lt;List&lt;WithTaskDeleteNvmfSubsystem&gt;&gt;
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
    public ApiResponse<List<WithTaskDeleteNvmfSubsystem>> deleteNvmfSubsystemWithHttpInfo(
            NvmfSubsystemDeletionParams nvmfSubsystemDeletionParams) throws ApiException {
        okhttp3.Call localVarCall =
                deleteNvmfSubsystemValidateBeforeCall(nvmfSubsystemDeletionParams, null);
        Type localVarReturnType = new TypeToken<List<WithTaskDeleteNvmfSubsystem>>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param nvmfSubsystemDeletionParams (required)
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
    public okhttp3.Call deleteNvmfSubsystemAsync(
            NvmfSubsystemDeletionParams nvmfSubsystemDeletionParams,
            final ApiCallback<List<WithTaskDeleteNvmfSubsystem>> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                deleteNvmfSubsystemValidateBeforeCall(nvmfSubsystemDeletionParams, _callback);
        Type localVarReturnType = new TypeToken<List<WithTaskDeleteNvmfSubsystem>>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getNvmfSubsystems
     *
     * @param getNvmfSubsystemsRequestBody (required)
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
    public okhttp3.Call getNvmfSubsystemsCall(
            GetNvmfSubsystemsRequestBody getNvmfSubsystemsRequestBody, final ApiCallback _callback)
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

        Object localVarPostBody = getNvmfSubsystemsRequestBody;

        // create path and map variables
        String localVarPath = "/get-nvmf-subsystems";

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
    private okhttp3.Call getNvmfSubsystemsValidateBeforeCall(
            GetNvmfSubsystemsRequestBody getNvmfSubsystemsRequestBody, final ApiCallback _callback)
            throws ApiException {

        // verify the required parameter 'getNvmfSubsystemsRequestBody' is set
        if (getNvmfSubsystemsRequestBody == null) {
            throw new ApiException(
                    "Missing the required parameter 'getNvmfSubsystemsRequestBody' when calling"
                            + " getNvmfSubsystems(Async)");
        }

        okhttp3.Call localVarCall = getNvmfSubsystemsCall(getNvmfSubsystemsRequestBody, _callback);
        return localVarCall;
    }

    /**
     * @param getNvmfSubsystemsRequestBody (required)
     * @return List&lt;NvmfSubsystem&gt;
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
    public List<NvmfSubsystem> getNvmfSubsystems(
            GetNvmfSubsystemsRequestBody getNvmfSubsystemsRequestBody) throws ApiException {
        ApiResponse<List<NvmfSubsystem>> localVarResp =
                getNvmfSubsystemsWithHttpInfo(getNvmfSubsystemsRequestBody);
        return localVarResp.getData();
    }

    /**
     * @param getNvmfSubsystemsRequestBody (required)
     * @return ApiResponse&lt;List&lt;NvmfSubsystem&gt;&gt;
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
    public ApiResponse<List<NvmfSubsystem>> getNvmfSubsystemsWithHttpInfo(
            GetNvmfSubsystemsRequestBody getNvmfSubsystemsRequestBody) throws ApiException {
        okhttp3.Call localVarCall =
                getNvmfSubsystemsValidateBeforeCall(getNvmfSubsystemsRequestBody, null);
        Type localVarReturnType = new TypeToken<List<NvmfSubsystem>>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param getNvmfSubsystemsRequestBody (required)
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
    public okhttp3.Call getNvmfSubsystemsAsync(
            GetNvmfSubsystemsRequestBody getNvmfSubsystemsRequestBody,
            final ApiCallback<List<NvmfSubsystem>> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                getNvmfSubsystemsValidateBeforeCall(getNvmfSubsystemsRequestBody, _callback);
        Type localVarReturnType = new TypeToken<List<NvmfSubsystem>>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getNvmfSubsystemsConnection
     *
     * @param getNvmfSubsystemsConnectionRequestBody (required)
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
    public okhttp3.Call getNvmfSubsystemsConnectionCall(
            GetNvmfSubsystemsConnectionRequestBody getNvmfSubsystemsConnectionRequestBody,
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

        Object localVarPostBody = getNvmfSubsystemsConnectionRequestBody;

        // create path and map variables
        String localVarPath = "/get-nvmf-subsystems-connection";

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
    private okhttp3.Call getNvmfSubsystemsConnectionValidateBeforeCall(
            GetNvmfSubsystemsConnectionRequestBody getNvmfSubsystemsConnectionRequestBody,
            final ApiCallback _callback)
            throws ApiException {

        // verify the required parameter 'getNvmfSubsystemsConnectionRequestBody' is set
        if (getNvmfSubsystemsConnectionRequestBody == null) {
            throw new ApiException(
                    "Missing the required parameter 'getNvmfSubsystemsConnectionRequestBody' when"
                            + " calling getNvmfSubsystemsConnection(Async)");
        }

        okhttp3.Call localVarCall =
                getNvmfSubsystemsConnectionCall(getNvmfSubsystemsConnectionRequestBody, _callback);
        return localVarCall;
    }

    /**
     * @param getNvmfSubsystemsConnectionRequestBody (required)
     * @return NvmfSubsystemConnection
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
    public NvmfSubsystemConnection getNvmfSubsystemsConnection(
            GetNvmfSubsystemsConnectionRequestBody getNvmfSubsystemsConnectionRequestBody)
            throws ApiException {
        ApiResponse<NvmfSubsystemConnection> localVarResp =
                getNvmfSubsystemsConnectionWithHttpInfo(getNvmfSubsystemsConnectionRequestBody);
        return localVarResp.getData();
    }

    /**
     * @param getNvmfSubsystemsConnectionRequestBody (required)
     * @return ApiResponse&lt;NvmfSubsystemConnection&gt;
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
    public ApiResponse<NvmfSubsystemConnection> getNvmfSubsystemsConnectionWithHttpInfo(
            GetNvmfSubsystemsConnectionRequestBody getNvmfSubsystemsConnectionRequestBody)
            throws ApiException {
        okhttp3.Call localVarCall =
                getNvmfSubsystemsConnectionValidateBeforeCall(
                        getNvmfSubsystemsConnectionRequestBody, null);
        Type localVarReturnType = new TypeToken<NvmfSubsystemConnection>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param getNvmfSubsystemsConnectionRequestBody (required)
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
    public okhttp3.Call getNvmfSubsystemsConnectionAsync(
            GetNvmfSubsystemsConnectionRequestBody getNvmfSubsystemsConnectionRequestBody,
            final ApiCallback<NvmfSubsystemConnection> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                getNvmfSubsystemsConnectionValidateBeforeCall(
                        getNvmfSubsystemsConnectionRequestBody, _callback);
        Type localVarReturnType = new TypeToken<NvmfSubsystemConnection>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateNvmfSubsystem
     *
     * @param nvmfSubsystemUpdationParams (required)
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
    public okhttp3.Call updateNvmfSubsystemCall(
            NvmfSubsystemUpdationParams nvmfSubsystemUpdationParams, final ApiCallback _callback)
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

        Object localVarPostBody = nvmfSubsystemUpdationParams;

        // create path and map variables
        String localVarPath = "/update-nvmf-subsystem";

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
    private okhttp3.Call updateNvmfSubsystemValidateBeforeCall(
            NvmfSubsystemUpdationParams nvmfSubsystemUpdationParams, final ApiCallback _callback)
            throws ApiException {

        // verify the required parameter 'nvmfSubsystemUpdationParams' is set
        if (nvmfSubsystemUpdationParams == null) {
            throw new ApiException(
                    "Missing the required parameter 'nvmfSubsystemUpdationParams' when calling"
                            + " updateNvmfSubsystem(Async)");
        }

        okhttp3.Call localVarCall = updateNvmfSubsystemCall(nvmfSubsystemUpdationParams, _callback);
        return localVarCall;
    }

    /**
     * @param nvmfSubsystemUpdationParams (required)
     * @return List&lt;WithTaskNvmfSubsystem&gt;
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
    public List<WithTaskNvmfSubsystem> updateNvmfSubsystem(
            NvmfSubsystemUpdationParams nvmfSubsystemUpdationParams) throws ApiException {
        ApiResponse<List<WithTaskNvmfSubsystem>> localVarResp =
                updateNvmfSubsystemWithHttpInfo(nvmfSubsystemUpdationParams);
        return localVarResp.getData();
    }

    /**
     * @param nvmfSubsystemUpdationParams (required)
     * @return ApiResponse&lt;List&lt;WithTaskNvmfSubsystem&gt;&gt;
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
    public ApiResponse<List<WithTaskNvmfSubsystem>> updateNvmfSubsystemWithHttpInfo(
            NvmfSubsystemUpdationParams nvmfSubsystemUpdationParams) throws ApiException {
        okhttp3.Call localVarCall =
                updateNvmfSubsystemValidateBeforeCall(nvmfSubsystemUpdationParams, null);
        Type localVarReturnType = new TypeToken<List<WithTaskNvmfSubsystem>>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param nvmfSubsystemUpdationParams (required)
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
    public okhttp3.Call updateNvmfSubsystemAsync(
            NvmfSubsystemUpdationParams nvmfSubsystemUpdationParams,
            final ApiCallback<List<WithTaskNvmfSubsystem>> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                updateNvmfSubsystemValidateBeforeCall(nvmfSubsystemUpdationParams, _callback);
        Type localVarReturnType = new TypeToken<List<WithTaskNvmfSubsystem>>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}

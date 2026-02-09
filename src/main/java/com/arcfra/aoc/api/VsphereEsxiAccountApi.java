package com.arcfra.aoc.api;


import com.arcfra.aoc.ApiCallback;
import com.arcfra.aoc.ApiClient;
import com.arcfra.aoc.ApiException;
import com.arcfra.aoc.ApiResponse;
import com.arcfra.aoc.Configuration;
import com.arcfra.aoc.Pair;
import com.arcfra.aoc.model.GetVsphereEsxiAccountsConnectionRequestBody;
import com.arcfra.aoc.model.GetVsphereEsxiAccountsRequestBody;
import com.arcfra.aoc.model.UpdateVsphereEsxiAccountParams;
import com.arcfra.aoc.model.VsphereEsxiAccount;
import com.arcfra.aoc.model.VsphereEsxiAccountConnection;
import com.arcfra.aoc.model.WithTaskVsphereEsxiAccountArray;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VsphereEsxiAccountApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public VsphereEsxiAccountApi() {
        this(Configuration.getDefaultApiClient());
    }

    public VsphereEsxiAccountApi(ApiClient apiClient) {
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
     * Build call for getVsphereEsxiAccounts
     *
     * @param getVsphereEsxiAccountsRequestBody (required)
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
    public okhttp3.Call getVsphereEsxiAccountsCall(
            GetVsphereEsxiAccountsRequestBody getVsphereEsxiAccountsRequestBody,
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

        Object localVarPostBody = getVsphereEsxiAccountsRequestBody;

        // create path and map variables
        String localVarPath = "/get-vsphere-esxi-accounts";

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
    private okhttp3.Call getVsphereEsxiAccountsValidateBeforeCall(
            GetVsphereEsxiAccountsRequestBody getVsphereEsxiAccountsRequestBody,
            final ApiCallback _callback)
            throws ApiException {

        // verify the required parameter 'getVsphereEsxiAccountsRequestBody' is set
        if (getVsphereEsxiAccountsRequestBody == null) {
            throw new ApiException(
                    "Missing the required parameter 'getVsphereEsxiAccountsRequestBody' when"
                            + " calling getVsphereEsxiAccounts(Async)");
        }

        okhttp3.Call localVarCall =
                getVsphereEsxiAccountsCall(getVsphereEsxiAccountsRequestBody, _callback);
        return localVarCall;
    }

    /**
     * @param getVsphereEsxiAccountsRequestBody (required)
     * @return List&lt;VsphereEsxiAccount&gt;
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
    public List<VsphereEsxiAccount> getVsphereEsxiAccounts(
            GetVsphereEsxiAccountsRequestBody getVsphereEsxiAccountsRequestBody)
            throws ApiException {
        ApiResponse<List<VsphereEsxiAccount>> localVarResp =
                getVsphereEsxiAccountsWithHttpInfo(getVsphereEsxiAccountsRequestBody);
        return localVarResp.getData();
    }

    /**
     * @param getVsphereEsxiAccountsRequestBody (required)
     * @return ApiResponse&lt;List&lt;VsphereEsxiAccount&gt;&gt;
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
    public ApiResponse<List<VsphereEsxiAccount>> getVsphereEsxiAccountsWithHttpInfo(
            GetVsphereEsxiAccountsRequestBody getVsphereEsxiAccountsRequestBody)
            throws ApiException {
        okhttp3.Call localVarCall =
                getVsphereEsxiAccountsValidateBeforeCall(getVsphereEsxiAccountsRequestBody, null);
        Type localVarReturnType = new TypeToken<List<VsphereEsxiAccount>>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param getVsphereEsxiAccountsRequestBody (required)
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
    public okhttp3.Call getVsphereEsxiAccountsAsync(
            GetVsphereEsxiAccountsRequestBody getVsphereEsxiAccountsRequestBody,
            final ApiCallback<List<VsphereEsxiAccount>> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                getVsphereEsxiAccountsValidateBeforeCall(
                        getVsphereEsxiAccountsRequestBody, _callback);
        Type localVarReturnType = new TypeToken<List<VsphereEsxiAccount>>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getVsphereEsxiAccountsConnection
     *
     * @param getVsphereEsxiAccountsConnectionRequestBody (required)
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
    public okhttp3.Call getVsphereEsxiAccountsConnectionCall(
            GetVsphereEsxiAccountsConnectionRequestBody getVsphereEsxiAccountsConnectionRequestBody,
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

        Object localVarPostBody = getVsphereEsxiAccountsConnectionRequestBody;

        // create path and map variables
        String localVarPath = "/get-vsphere-esxi-accounts-connection";

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
    private okhttp3.Call getVsphereEsxiAccountsConnectionValidateBeforeCall(
            GetVsphereEsxiAccountsConnectionRequestBody getVsphereEsxiAccountsConnectionRequestBody,
            final ApiCallback _callback)
            throws ApiException {

        // verify the required parameter 'getVsphereEsxiAccountsConnectionRequestBody' is set
        if (getVsphereEsxiAccountsConnectionRequestBody == null) {
            throw new ApiException(
                    "Missing the required parameter 'getVsphereEsxiAccountsConnectionRequestBody'"
                            + " when calling getVsphereEsxiAccountsConnection(Async)");
        }

        okhttp3.Call localVarCall =
                getVsphereEsxiAccountsConnectionCall(
                        getVsphereEsxiAccountsConnectionRequestBody, _callback);
        return localVarCall;
    }

    /**
     * @param getVsphereEsxiAccountsConnectionRequestBody (required)
     * @return VsphereEsxiAccountConnection
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
    public VsphereEsxiAccountConnection getVsphereEsxiAccountsConnection(
            GetVsphereEsxiAccountsConnectionRequestBody getVsphereEsxiAccountsConnectionRequestBody)
            throws ApiException {
        ApiResponse<VsphereEsxiAccountConnection> localVarResp =
                getVsphereEsxiAccountsConnectionWithHttpInfo(
                        getVsphereEsxiAccountsConnectionRequestBody);
        return localVarResp.getData();
    }

    /**
     * @param getVsphereEsxiAccountsConnectionRequestBody (required)
     * @return ApiResponse&lt;VsphereEsxiAccountConnection&gt;
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
    public ApiResponse<VsphereEsxiAccountConnection> getVsphereEsxiAccountsConnectionWithHttpInfo(
            GetVsphereEsxiAccountsConnectionRequestBody getVsphereEsxiAccountsConnectionRequestBody)
            throws ApiException {
        okhttp3.Call localVarCall =
                getVsphereEsxiAccountsConnectionValidateBeforeCall(
                        getVsphereEsxiAccountsConnectionRequestBody, null);
        Type localVarReturnType = new TypeToken<VsphereEsxiAccountConnection>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param getVsphereEsxiAccountsConnectionRequestBody (required)
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
    public okhttp3.Call getVsphereEsxiAccountsConnectionAsync(
            GetVsphereEsxiAccountsConnectionRequestBody getVsphereEsxiAccountsConnectionRequestBody,
            final ApiCallback<VsphereEsxiAccountConnection> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                getVsphereEsxiAccountsConnectionValidateBeforeCall(
                        getVsphereEsxiAccountsConnectionRequestBody, _callback);
        Type localVarReturnType = new TypeToken<VsphereEsxiAccountConnection>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateVsphereEsxiAccount
     *
     * @param updateVsphereEsxiAccountParams (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td>  </td><td>  * CommonHeader -  <br>  </td></tr>
     * <tr><td> 304 </td><td> Not modified </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Bad request </td><td>  * CommonHeader -  <br>  </td></tr>
     * <tr><td> 404 </td><td> Not found </td><td>  * CommonHeader -  <br>  </td></tr>
     * <tr><td> 500 </td><td> Server error </td><td>  * CommonHeader -  <br>  </td></tr>
     * </table>
     */
    public okhttp3.Call updateVsphereEsxiAccountCall(
            UpdateVsphereEsxiAccountParams updateVsphereEsxiAccountParams,
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

        Object localVarPostBody = updateVsphereEsxiAccountParams;

        // create path and map variables
        String localVarPath = "/update-vsphere-esxi-account";

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
    private okhttp3.Call updateVsphereEsxiAccountValidateBeforeCall(
            UpdateVsphereEsxiAccountParams updateVsphereEsxiAccountParams,
            final ApiCallback _callback)
            throws ApiException {

        // verify the required parameter 'updateVsphereEsxiAccountParams' is set
        if (updateVsphereEsxiAccountParams == null) {
            throw new ApiException(
                    "Missing the required parameter 'updateVsphereEsxiAccountParams' when calling"
                            + " updateVsphereEsxiAccount(Async)");
        }

        okhttp3.Call localVarCall =
                updateVsphereEsxiAccountCall(updateVsphereEsxiAccountParams, _callback);
        return localVarCall;
    }

    /**
     * @param updateVsphereEsxiAccountParams (required)
     * @return List&lt;WithTaskVsphereEsxiAccountArray&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td>  </td><td>  * CommonHeader -  <br>  </td></tr>
     * <tr><td> 304 </td><td> Not modified </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Bad request </td><td>  * CommonHeader -  <br>  </td></tr>
     * <tr><td> 404 </td><td> Not found </td><td>  * CommonHeader -  <br>  </td></tr>
     * <tr><td> 500 </td><td> Server error </td><td>  * CommonHeader -  <br>  </td></tr>
     * </table>
     */
    public List<WithTaskVsphereEsxiAccountArray> updateVsphereEsxiAccount(
            UpdateVsphereEsxiAccountParams updateVsphereEsxiAccountParams) throws ApiException {
        ApiResponse<List<WithTaskVsphereEsxiAccountArray>> localVarResp =
                updateVsphereEsxiAccountWithHttpInfo(updateVsphereEsxiAccountParams);
        return localVarResp.getData();
    }

    /**
     * @param updateVsphereEsxiAccountParams (required)
     * @return ApiResponse&lt;List&lt;WithTaskVsphereEsxiAccountArray&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td>  </td><td>  * CommonHeader -  <br>  </td></tr>
     * <tr><td> 304 </td><td> Not modified </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Bad request </td><td>  * CommonHeader -  <br>  </td></tr>
     * <tr><td> 404 </td><td> Not found </td><td>  * CommonHeader -  <br>  </td></tr>
     * <tr><td> 500 </td><td> Server error </td><td>  * CommonHeader -  <br>  </td></tr>
     * </table>
     */
    public ApiResponse<List<WithTaskVsphereEsxiAccountArray>> updateVsphereEsxiAccountWithHttpInfo(
            UpdateVsphereEsxiAccountParams updateVsphereEsxiAccountParams) throws ApiException {
        okhttp3.Call localVarCall =
                updateVsphereEsxiAccountValidateBeforeCall(updateVsphereEsxiAccountParams, null);
        Type localVarReturnType =
                new TypeToken<List<WithTaskVsphereEsxiAccountArray>>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param updateVsphereEsxiAccountParams (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td>  </td><td>  * CommonHeader -  <br>  </td></tr>
     * <tr><td> 304 </td><td> Not modified </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Bad request </td><td>  * CommonHeader -  <br>  </td></tr>
     * <tr><td> 404 </td><td> Not found </td><td>  * CommonHeader -  <br>  </td></tr>
     * <tr><td> 500 </td><td> Server error </td><td>  * CommonHeader -  <br>  </td></tr>
     * </table>
     */
    public okhttp3.Call updateVsphereEsxiAccountAsync(
            UpdateVsphereEsxiAccountParams updateVsphereEsxiAccountParams,
            final ApiCallback<List<WithTaskVsphereEsxiAccountArray>> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                updateVsphereEsxiAccountValidateBeforeCall(
                        updateVsphereEsxiAccountParams, _callback);
        Type localVarReturnType =
                new TypeToken<List<WithTaskVsphereEsxiAccountArray>>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}

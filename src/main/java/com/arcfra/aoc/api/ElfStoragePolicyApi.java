package com.arcfra.aoc.api;


import com.arcfra.aoc.ApiCallback;
import com.arcfra.aoc.ApiClient;
import com.arcfra.aoc.ApiException;
import com.arcfra.aoc.ApiResponse;
import com.arcfra.aoc.Configuration;
import com.arcfra.aoc.Pair;
import com.arcfra.aoc.model.ElfStoragePolicy;
import com.arcfra.aoc.model.ElfStoragePolicyConnection;
import com.arcfra.aoc.model.GetElfStoragePoliciesConnectionRequestBody;
import com.arcfra.aoc.model.GetElfStoragePoliciesRequestBody;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ElfStoragePolicyApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ElfStoragePolicyApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ElfStoragePolicyApi(ApiClient apiClient) {
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
     * Build call for getElfStoragePolicies
     *
     * @param getElfStoragePoliciesRequestBody (required)
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
    public okhttp3.Call getElfStoragePoliciesCall(
            GetElfStoragePoliciesRequestBody getElfStoragePoliciesRequestBody,
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

        Object localVarPostBody = getElfStoragePoliciesRequestBody;

        // create path and map variables
        String localVarPath = "/get-elf-storage-policies";

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
    private okhttp3.Call getElfStoragePoliciesValidateBeforeCall(
            GetElfStoragePoliciesRequestBody getElfStoragePoliciesRequestBody,
            final ApiCallback _callback)
            throws ApiException {

        // verify the required parameter 'getElfStoragePoliciesRequestBody' is set
        if (getElfStoragePoliciesRequestBody == null) {
            throw new ApiException(
                    "Missing the required parameter 'getElfStoragePoliciesRequestBody' when"
                            + " calling getElfStoragePolicies(Async)");
        }

        okhttp3.Call localVarCall =
                getElfStoragePoliciesCall(getElfStoragePoliciesRequestBody, _callback);
        return localVarCall;
    }

    /**
     * @param getElfStoragePoliciesRequestBody (required)
     * @return List&lt;ElfStoragePolicy&gt;
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
    public List<ElfStoragePolicy> getElfStoragePolicies(
            GetElfStoragePoliciesRequestBody getElfStoragePoliciesRequestBody) throws ApiException {
        ApiResponse<List<ElfStoragePolicy>> localVarResp =
                getElfStoragePoliciesWithHttpInfo(getElfStoragePoliciesRequestBody);
        return localVarResp.getData();
    }

    /**
     * @param getElfStoragePoliciesRequestBody (required)
     * @return ApiResponse&lt;List&lt;ElfStoragePolicy&gt;&gt;
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
    public ApiResponse<List<ElfStoragePolicy>> getElfStoragePoliciesWithHttpInfo(
            GetElfStoragePoliciesRequestBody getElfStoragePoliciesRequestBody) throws ApiException {
        okhttp3.Call localVarCall =
                getElfStoragePoliciesValidateBeforeCall(getElfStoragePoliciesRequestBody, null);
        Type localVarReturnType = new TypeToken<List<ElfStoragePolicy>>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param getElfStoragePoliciesRequestBody (required)
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
    public okhttp3.Call getElfStoragePoliciesAsync(
            GetElfStoragePoliciesRequestBody getElfStoragePoliciesRequestBody,
            final ApiCallback<List<ElfStoragePolicy>> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                getElfStoragePoliciesValidateBeforeCall(
                        getElfStoragePoliciesRequestBody, _callback);
        Type localVarReturnType = new TypeToken<List<ElfStoragePolicy>>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getElfStoragePoliciesConnection
     *
     * @param getElfStoragePoliciesConnectionRequestBody (required)
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
    public okhttp3.Call getElfStoragePoliciesConnectionCall(
            GetElfStoragePoliciesConnectionRequestBody getElfStoragePoliciesConnectionRequestBody,
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

        Object localVarPostBody = getElfStoragePoliciesConnectionRequestBody;

        // create path and map variables
        String localVarPath = "/get-elf-storage-policies-connection";

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
    private okhttp3.Call getElfStoragePoliciesConnectionValidateBeforeCall(
            GetElfStoragePoliciesConnectionRequestBody getElfStoragePoliciesConnectionRequestBody,
            final ApiCallback _callback)
            throws ApiException {

        // verify the required parameter 'getElfStoragePoliciesConnectionRequestBody' is set
        if (getElfStoragePoliciesConnectionRequestBody == null) {
            throw new ApiException(
                    "Missing the required parameter 'getElfStoragePoliciesConnectionRequestBody'"
                            + " when calling getElfStoragePoliciesConnection(Async)");
        }

        okhttp3.Call localVarCall =
                getElfStoragePoliciesConnectionCall(
                        getElfStoragePoliciesConnectionRequestBody, _callback);
        return localVarCall;
    }

    /**
     * @param getElfStoragePoliciesConnectionRequestBody (required)
     * @return ElfStoragePolicyConnection
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
    public ElfStoragePolicyConnection getElfStoragePoliciesConnection(
            GetElfStoragePoliciesConnectionRequestBody getElfStoragePoliciesConnectionRequestBody)
            throws ApiException {
        ApiResponse<ElfStoragePolicyConnection> localVarResp =
                getElfStoragePoliciesConnectionWithHttpInfo(
                        getElfStoragePoliciesConnectionRequestBody);
        return localVarResp.getData();
    }

    /**
     * @param getElfStoragePoliciesConnectionRequestBody (required)
     * @return ApiResponse&lt;ElfStoragePolicyConnection&gt;
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
    public ApiResponse<ElfStoragePolicyConnection> getElfStoragePoliciesConnectionWithHttpInfo(
            GetElfStoragePoliciesConnectionRequestBody getElfStoragePoliciesConnectionRequestBody)
            throws ApiException {
        okhttp3.Call localVarCall =
                getElfStoragePoliciesConnectionValidateBeforeCall(
                        getElfStoragePoliciesConnectionRequestBody, null);
        Type localVarReturnType = new TypeToken<ElfStoragePolicyConnection>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param getElfStoragePoliciesConnectionRequestBody (required)
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
    public okhttp3.Call getElfStoragePoliciesConnectionAsync(
            GetElfStoragePoliciesConnectionRequestBody getElfStoragePoliciesConnectionRequestBody,
            final ApiCallback<ElfStoragePolicyConnection> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                getElfStoragePoliciesConnectionValidateBeforeCall(
                        getElfStoragePoliciesConnectionRequestBody, _callback);
        Type localVarReturnType = new TypeToken<ElfStoragePolicyConnection>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}

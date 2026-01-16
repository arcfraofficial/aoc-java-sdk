package com.arcfra.aoc.api;


import com.arcfra.aoc.ApiCallback;
import com.arcfra.aoc.ApiClient;
import com.arcfra.aoc.ApiException;
import com.arcfra.aoc.ApiResponse;
import com.arcfra.aoc.Configuration;
import com.arcfra.aoc.Pair;
import com.arcfra.aoc.model.GetNetworkPolicyRuleServicesConnectionRequestBody;
import com.arcfra.aoc.model.GetNetworkPolicyRuleServicesRequestBody;
import com.arcfra.aoc.model.NetworkPolicyRuleService;
import com.arcfra.aoc.model.NetworkPolicyRuleServiceConnection;
import com.arcfra.aoc.model.NetworkPolicyRuleServiceCreationParams;
import com.arcfra.aoc.model.NetworkPolicyRuleServiceDeletionParams;
import com.arcfra.aoc.model.NetworkPolicyRuleServiceUpdationParams;
import com.arcfra.aoc.model.WithTaskDeleteNetworkPolicyRuleService;
import com.arcfra.aoc.model.WithTaskNetworkPolicyRuleService;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NetworkPolicyRuleServiceApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public NetworkPolicyRuleServiceApi() {
        this(Configuration.getDefaultApiClient());
    }

    public NetworkPolicyRuleServiceApi(ApiClient apiClient) {
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
     * Build call for createNetworkPolicyRuleService
     *
     * @param networkPolicyRuleServiceCreationParams (required)
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
    public okhttp3.Call createNetworkPolicyRuleServiceCall(
            List<NetworkPolicyRuleServiceCreationParams> networkPolicyRuleServiceCreationParams,
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

        Object localVarPostBody = networkPolicyRuleServiceCreationParams;

        // create path and map variables
        String localVarPath = "/create-network-policy-rule-service";

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
    private okhttp3.Call createNetworkPolicyRuleServiceValidateBeforeCall(
            List<NetworkPolicyRuleServiceCreationParams> networkPolicyRuleServiceCreationParams,
            final ApiCallback _callback)
            throws ApiException {

        // verify the required parameter 'networkPolicyRuleServiceCreationParams' is set
        if (networkPolicyRuleServiceCreationParams == null) {
            throw new ApiException(
                    "Missing the required parameter 'networkPolicyRuleServiceCreationParams' when"
                            + " calling createNetworkPolicyRuleService(Async)");
        }

        okhttp3.Call localVarCall =
                createNetworkPolicyRuleServiceCall(
                        networkPolicyRuleServiceCreationParams, _callback);
        return localVarCall;
    }

    /**
     * @param networkPolicyRuleServiceCreationParams (required)
     * @return List&lt;WithTaskNetworkPolicyRuleService&gt;
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
    public List<WithTaskNetworkPolicyRuleService> createNetworkPolicyRuleService(
            List<NetworkPolicyRuleServiceCreationParams> networkPolicyRuleServiceCreationParams)
            throws ApiException {
        ApiResponse<List<WithTaskNetworkPolicyRuleService>> localVarResp =
                createNetworkPolicyRuleServiceWithHttpInfo(networkPolicyRuleServiceCreationParams);
        return localVarResp.getData();
    }

    /**
     * @param networkPolicyRuleServiceCreationParams (required)
     * @return ApiResponse&lt;List&lt;WithTaskNetworkPolicyRuleService&gt;&gt;
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
    public ApiResponse<List<WithTaskNetworkPolicyRuleService>>
            createNetworkPolicyRuleServiceWithHttpInfo(
                    List<NetworkPolicyRuleServiceCreationParams>
                            networkPolicyRuleServiceCreationParams)
                    throws ApiException {
        okhttp3.Call localVarCall =
                createNetworkPolicyRuleServiceValidateBeforeCall(
                        networkPolicyRuleServiceCreationParams, null);
        Type localVarReturnType =
                new TypeToken<List<WithTaskNetworkPolicyRuleService>>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param networkPolicyRuleServiceCreationParams (required)
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
    public okhttp3.Call createNetworkPolicyRuleServiceAsync(
            List<NetworkPolicyRuleServiceCreationParams> networkPolicyRuleServiceCreationParams,
            final ApiCallback<List<WithTaskNetworkPolicyRuleService>> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                createNetworkPolicyRuleServiceValidateBeforeCall(
                        networkPolicyRuleServiceCreationParams, _callback);
        Type localVarReturnType =
                new TypeToken<List<WithTaskNetworkPolicyRuleService>>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteNetworkPolicyRuleService
     *
     * @param networkPolicyRuleServiceDeletionParams (required)
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
    public okhttp3.Call deleteNetworkPolicyRuleServiceCall(
            NetworkPolicyRuleServiceDeletionParams networkPolicyRuleServiceDeletionParams,
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

        Object localVarPostBody = networkPolicyRuleServiceDeletionParams;

        // create path and map variables
        String localVarPath = "/delete-network-policy-rule-service";

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
    private okhttp3.Call deleteNetworkPolicyRuleServiceValidateBeforeCall(
            NetworkPolicyRuleServiceDeletionParams networkPolicyRuleServiceDeletionParams,
            final ApiCallback _callback)
            throws ApiException {

        // verify the required parameter 'networkPolicyRuleServiceDeletionParams' is set
        if (networkPolicyRuleServiceDeletionParams == null) {
            throw new ApiException(
                    "Missing the required parameter 'networkPolicyRuleServiceDeletionParams' when"
                            + " calling deleteNetworkPolicyRuleService(Async)");
        }

        okhttp3.Call localVarCall =
                deleteNetworkPolicyRuleServiceCall(
                        networkPolicyRuleServiceDeletionParams, _callback);
        return localVarCall;
    }

    /**
     * @param networkPolicyRuleServiceDeletionParams (required)
     * @return List&lt;WithTaskDeleteNetworkPolicyRuleService&gt;
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
    public List<WithTaskDeleteNetworkPolicyRuleService> deleteNetworkPolicyRuleService(
            NetworkPolicyRuleServiceDeletionParams networkPolicyRuleServiceDeletionParams)
            throws ApiException {
        ApiResponse<List<WithTaskDeleteNetworkPolicyRuleService>> localVarResp =
                deleteNetworkPolicyRuleServiceWithHttpInfo(networkPolicyRuleServiceDeletionParams);
        return localVarResp.getData();
    }

    /**
     * @param networkPolicyRuleServiceDeletionParams (required)
     * @return ApiResponse&lt;List&lt;WithTaskDeleteNetworkPolicyRuleService&gt;&gt;
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
    public ApiResponse<List<WithTaskDeleteNetworkPolicyRuleService>>
            deleteNetworkPolicyRuleServiceWithHttpInfo(
                    NetworkPolicyRuleServiceDeletionParams networkPolicyRuleServiceDeletionParams)
                    throws ApiException {
        okhttp3.Call localVarCall =
                deleteNetworkPolicyRuleServiceValidateBeforeCall(
                        networkPolicyRuleServiceDeletionParams, null);
        Type localVarReturnType =
                new TypeToken<List<WithTaskDeleteNetworkPolicyRuleService>>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param networkPolicyRuleServiceDeletionParams (required)
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
    public okhttp3.Call deleteNetworkPolicyRuleServiceAsync(
            NetworkPolicyRuleServiceDeletionParams networkPolicyRuleServiceDeletionParams,
            final ApiCallback<List<WithTaskDeleteNetworkPolicyRuleService>> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                deleteNetworkPolicyRuleServiceValidateBeforeCall(
                        networkPolicyRuleServiceDeletionParams, _callback);
        Type localVarReturnType =
                new TypeToken<List<WithTaskDeleteNetworkPolicyRuleService>>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getNetworkPolicyRuleServices
     *
     * @param getNetworkPolicyRuleServicesRequestBody (required)
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
    public okhttp3.Call getNetworkPolicyRuleServicesCall(
            GetNetworkPolicyRuleServicesRequestBody getNetworkPolicyRuleServicesRequestBody,
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

        Object localVarPostBody = getNetworkPolicyRuleServicesRequestBody;

        // create path and map variables
        String localVarPath = "/get-network-policy-rule-services";

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
    private okhttp3.Call getNetworkPolicyRuleServicesValidateBeforeCall(
            GetNetworkPolicyRuleServicesRequestBody getNetworkPolicyRuleServicesRequestBody,
            final ApiCallback _callback)
            throws ApiException {

        // verify the required parameter 'getNetworkPolicyRuleServicesRequestBody' is set
        if (getNetworkPolicyRuleServicesRequestBody == null) {
            throw new ApiException(
                    "Missing the required parameter 'getNetworkPolicyRuleServicesRequestBody' when"
                            + " calling getNetworkPolicyRuleServices(Async)");
        }

        okhttp3.Call localVarCall =
                getNetworkPolicyRuleServicesCall(
                        getNetworkPolicyRuleServicesRequestBody, _callback);
        return localVarCall;
    }

    /**
     * @param getNetworkPolicyRuleServicesRequestBody (required)
     * @return List&lt;NetworkPolicyRuleService&gt;
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
    public List<NetworkPolicyRuleService> getNetworkPolicyRuleServices(
            GetNetworkPolicyRuleServicesRequestBody getNetworkPolicyRuleServicesRequestBody)
            throws ApiException {
        ApiResponse<List<NetworkPolicyRuleService>> localVarResp =
                getNetworkPolicyRuleServicesWithHttpInfo(getNetworkPolicyRuleServicesRequestBody);
        return localVarResp.getData();
    }

    /**
     * @param getNetworkPolicyRuleServicesRequestBody (required)
     * @return ApiResponse&lt;List&lt;NetworkPolicyRuleService&gt;&gt;
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
    public ApiResponse<List<NetworkPolicyRuleService>> getNetworkPolicyRuleServicesWithHttpInfo(
            GetNetworkPolicyRuleServicesRequestBody getNetworkPolicyRuleServicesRequestBody)
            throws ApiException {
        okhttp3.Call localVarCall =
                getNetworkPolicyRuleServicesValidateBeforeCall(
                        getNetworkPolicyRuleServicesRequestBody, null);
        Type localVarReturnType = new TypeToken<List<NetworkPolicyRuleService>>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param getNetworkPolicyRuleServicesRequestBody (required)
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
    public okhttp3.Call getNetworkPolicyRuleServicesAsync(
            GetNetworkPolicyRuleServicesRequestBody getNetworkPolicyRuleServicesRequestBody,
            final ApiCallback<List<NetworkPolicyRuleService>> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                getNetworkPolicyRuleServicesValidateBeforeCall(
                        getNetworkPolicyRuleServicesRequestBody, _callback);
        Type localVarReturnType = new TypeToken<List<NetworkPolicyRuleService>>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getNetworkPolicyRuleServicesConnection
     *
     * @param getNetworkPolicyRuleServicesConnectionRequestBody (required)
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
    public okhttp3.Call getNetworkPolicyRuleServicesConnectionCall(
            GetNetworkPolicyRuleServicesConnectionRequestBody
                    getNetworkPolicyRuleServicesConnectionRequestBody,
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

        Object localVarPostBody = getNetworkPolicyRuleServicesConnectionRequestBody;

        // create path and map variables
        String localVarPath = "/get-network-policy-rule-services-connection";

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
    private okhttp3.Call getNetworkPolicyRuleServicesConnectionValidateBeforeCall(
            GetNetworkPolicyRuleServicesConnectionRequestBody
                    getNetworkPolicyRuleServicesConnectionRequestBody,
            final ApiCallback _callback)
            throws ApiException {

        // verify the required parameter 'getNetworkPolicyRuleServicesConnectionRequestBody' is set
        if (getNetworkPolicyRuleServicesConnectionRequestBody == null) {
            throw new ApiException(
                    "Missing the required parameter"
                            + " 'getNetworkPolicyRuleServicesConnectionRequestBody' when calling"
                            + " getNetworkPolicyRuleServicesConnection(Async)");
        }

        okhttp3.Call localVarCall =
                getNetworkPolicyRuleServicesConnectionCall(
                        getNetworkPolicyRuleServicesConnectionRequestBody, _callback);
        return localVarCall;
    }

    /**
     * @param getNetworkPolicyRuleServicesConnectionRequestBody (required)
     * @return NetworkPolicyRuleServiceConnection
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
    public NetworkPolicyRuleServiceConnection getNetworkPolicyRuleServicesConnection(
            GetNetworkPolicyRuleServicesConnectionRequestBody
                    getNetworkPolicyRuleServicesConnectionRequestBody)
            throws ApiException {
        ApiResponse<NetworkPolicyRuleServiceConnection> localVarResp =
                getNetworkPolicyRuleServicesConnectionWithHttpInfo(
                        getNetworkPolicyRuleServicesConnectionRequestBody);
        return localVarResp.getData();
    }

    /**
     * @param getNetworkPolicyRuleServicesConnectionRequestBody (required)
     * @return ApiResponse&lt;NetworkPolicyRuleServiceConnection&gt;
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
    public ApiResponse<NetworkPolicyRuleServiceConnection>
            getNetworkPolicyRuleServicesConnectionWithHttpInfo(
                    GetNetworkPolicyRuleServicesConnectionRequestBody
                            getNetworkPolicyRuleServicesConnectionRequestBody)
                    throws ApiException {
        okhttp3.Call localVarCall =
                getNetworkPolicyRuleServicesConnectionValidateBeforeCall(
                        getNetworkPolicyRuleServicesConnectionRequestBody, null);
        Type localVarReturnType = new TypeToken<NetworkPolicyRuleServiceConnection>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param getNetworkPolicyRuleServicesConnectionRequestBody (required)
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
    public okhttp3.Call getNetworkPolicyRuleServicesConnectionAsync(
            GetNetworkPolicyRuleServicesConnectionRequestBody
                    getNetworkPolicyRuleServicesConnectionRequestBody,
            final ApiCallback<NetworkPolicyRuleServiceConnection> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                getNetworkPolicyRuleServicesConnectionValidateBeforeCall(
                        getNetworkPolicyRuleServicesConnectionRequestBody, _callback);
        Type localVarReturnType = new TypeToken<NetworkPolicyRuleServiceConnection>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateNetworkPolicyRuleService
     *
     * @param networkPolicyRuleServiceUpdationParams (required)
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
    public okhttp3.Call updateNetworkPolicyRuleServiceCall(
            NetworkPolicyRuleServiceUpdationParams networkPolicyRuleServiceUpdationParams,
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

        Object localVarPostBody = networkPolicyRuleServiceUpdationParams;

        // create path and map variables
        String localVarPath = "/update-network-policy-rule-service";

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
    private okhttp3.Call updateNetworkPolicyRuleServiceValidateBeforeCall(
            NetworkPolicyRuleServiceUpdationParams networkPolicyRuleServiceUpdationParams,
            final ApiCallback _callback)
            throws ApiException {

        // verify the required parameter 'networkPolicyRuleServiceUpdationParams' is set
        if (networkPolicyRuleServiceUpdationParams == null) {
            throw new ApiException(
                    "Missing the required parameter 'networkPolicyRuleServiceUpdationParams' when"
                            + " calling updateNetworkPolicyRuleService(Async)");
        }

        okhttp3.Call localVarCall =
                updateNetworkPolicyRuleServiceCall(
                        networkPolicyRuleServiceUpdationParams, _callback);
        return localVarCall;
    }

    /**
     * @param networkPolicyRuleServiceUpdationParams (required)
     * @return List&lt;WithTaskNetworkPolicyRuleService&gt;
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
    public List<WithTaskNetworkPolicyRuleService> updateNetworkPolicyRuleService(
            NetworkPolicyRuleServiceUpdationParams networkPolicyRuleServiceUpdationParams)
            throws ApiException {
        ApiResponse<List<WithTaskNetworkPolicyRuleService>> localVarResp =
                updateNetworkPolicyRuleServiceWithHttpInfo(networkPolicyRuleServiceUpdationParams);
        return localVarResp.getData();
    }

    /**
     * @param networkPolicyRuleServiceUpdationParams (required)
     * @return ApiResponse&lt;List&lt;WithTaskNetworkPolicyRuleService&gt;&gt;
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
    public ApiResponse<List<WithTaskNetworkPolicyRuleService>>
            updateNetworkPolicyRuleServiceWithHttpInfo(
                    NetworkPolicyRuleServiceUpdationParams networkPolicyRuleServiceUpdationParams)
                    throws ApiException {
        okhttp3.Call localVarCall =
                updateNetworkPolicyRuleServiceValidateBeforeCall(
                        networkPolicyRuleServiceUpdationParams, null);
        Type localVarReturnType =
                new TypeToken<List<WithTaskNetworkPolicyRuleService>>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param networkPolicyRuleServiceUpdationParams (required)
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
    public okhttp3.Call updateNetworkPolicyRuleServiceAsync(
            NetworkPolicyRuleServiceUpdationParams networkPolicyRuleServiceUpdationParams,
            final ApiCallback<List<WithTaskNetworkPolicyRuleService>> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                updateNetworkPolicyRuleServiceValidateBeforeCall(
                        networkPolicyRuleServiceUpdationParams, _callback);
        Type localVarReturnType =
                new TypeToken<List<WithTaskNetworkPolicyRuleService>>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}

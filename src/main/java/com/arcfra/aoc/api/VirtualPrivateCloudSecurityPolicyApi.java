package com.arcfra.aoc.api;


import com.arcfra.aoc.ApiCallback;
import com.arcfra.aoc.ApiClient;
import com.arcfra.aoc.ApiException;
import com.arcfra.aoc.ApiResponse;
import com.arcfra.aoc.Configuration;
import com.arcfra.aoc.Pair;
import com.arcfra.aoc.model.GetVirtualPrivateCloudSecurityPoliciesConnectionRequestBody;
import com.arcfra.aoc.model.GetVirtualPrivateCloudSecurityPoliciesRequestBody;
import com.arcfra.aoc.model.VirtualPrivateCloudSecurityPolicy;
import com.arcfra.aoc.model.VirtualPrivateCloudSecurityPolicyConnection;
import com.arcfra.aoc.model.VirtualPrivateCloudSecurityPolicyCreateParams;
import com.arcfra.aoc.model.VirtualPrivateCloudSecurityPolicyDeleteParams;
import com.arcfra.aoc.model.VirtualPrivateCloudSecurityPolicyUpdateBody;
import com.arcfra.aoc.model.WithTaskDeleteVirtualPrivateCloudSecurityPolicy;
import com.arcfra.aoc.model.WithTaskVirtualPrivateCloudSecurityPolicy;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VirtualPrivateCloudSecurityPolicyApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public VirtualPrivateCloudSecurityPolicyApi() {
        this(Configuration.getDefaultApiClient());
    }

    public VirtualPrivateCloudSecurityPolicyApi(ApiClient apiClient) {
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
     * Build call for createVirtualPrivateCloudSecurityPolicy
     *
     * @param virtualPrivateCloudSecurityPolicyCreateParams (required)
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
    public okhttp3.Call createVirtualPrivateCloudSecurityPolicyCall(
            List<VirtualPrivateCloudSecurityPolicyCreateParams>
                    virtualPrivateCloudSecurityPolicyCreateParams,
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

        Object localVarPostBody = virtualPrivateCloudSecurityPolicyCreateParams;

        // create path and map variables
        String localVarPath = "/create-virtual-private-cloud-security-policy";

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
    private okhttp3.Call createVirtualPrivateCloudSecurityPolicyValidateBeforeCall(
            List<VirtualPrivateCloudSecurityPolicyCreateParams>
                    virtualPrivateCloudSecurityPolicyCreateParams,
            final ApiCallback _callback)
            throws ApiException {

        // verify the required parameter 'virtualPrivateCloudSecurityPolicyCreateParams' is set
        if (virtualPrivateCloudSecurityPolicyCreateParams == null) {
            throw new ApiException(
                    "Missing the required parameter"
                            + " 'virtualPrivateCloudSecurityPolicyCreateParams' when calling"
                            + " createVirtualPrivateCloudSecurityPolicy(Async)");
        }

        okhttp3.Call localVarCall =
                createVirtualPrivateCloudSecurityPolicyCall(
                        virtualPrivateCloudSecurityPolicyCreateParams, _callback);
        return localVarCall;
    }

    /**
     * @param virtualPrivateCloudSecurityPolicyCreateParams (required)
     * @return List&lt;WithTaskVirtualPrivateCloudSecurityPolicy&gt;
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
    public List<WithTaskVirtualPrivateCloudSecurityPolicy> createVirtualPrivateCloudSecurityPolicy(
            List<VirtualPrivateCloudSecurityPolicyCreateParams>
                    virtualPrivateCloudSecurityPolicyCreateParams)
            throws ApiException {
        ApiResponse<List<WithTaskVirtualPrivateCloudSecurityPolicy>> localVarResp =
                createVirtualPrivateCloudSecurityPolicyWithHttpInfo(
                        virtualPrivateCloudSecurityPolicyCreateParams);
        return localVarResp.getData();
    }

    /**
     * @param virtualPrivateCloudSecurityPolicyCreateParams (required)
     * @return ApiResponse&lt;List&lt;WithTaskVirtualPrivateCloudSecurityPolicy&gt;&gt;
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
    public ApiResponse<List<WithTaskVirtualPrivateCloudSecurityPolicy>>
            createVirtualPrivateCloudSecurityPolicyWithHttpInfo(
                    List<VirtualPrivateCloudSecurityPolicyCreateParams>
                            virtualPrivateCloudSecurityPolicyCreateParams)
                    throws ApiException {
        okhttp3.Call localVarCall =
                createVirtualPrivateCloudSecurityPolicyValidateBeforeCall(
                        virtualPrivateCloudSecurityPolicyCreateParams, null);
        Type localVarReturnType =
                new TypeToken<List<WithTaskVirtualPrivateCloudSecurityPolicy>>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param virtualPrivateCloudSecurityPolicyCreateParams (required)
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
    public okhttp3.Call createVirtualPrivateCloudSecurityPolicyAsync(
            List<VirtualPrivateCloudSecurityPolicyCreateParams>
                    virtualPrivateCloudSecurityPolicyCreateParams,
            final ApiCallback<List<WithTaskVirtualPrivateCloudSecurityPolicy>> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                createVirtualPrivateCloudSecurityPolicyValidateBeforeCall(
                        virtualPrivateCloudSecurityPolicyCreateParams, _callback);
        Type localVarReturnType =
                new TypeToken<List<WithTaskVirtualPrivateCloudSecurityPolicy>>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteVirtualPrivateCloudSecurityPolicy
     *
     * @param virtualPrivateCloudSecurityPolicyDeleteParams (required)
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
    public okhttp3.Call deleteVirtualPrivateCloudSecurityPolicyCall(
            VirtualPrivateCloudSecurityPolicyDeleteParams
                    virtualPrivateCloudSecurityPolicyDeleteParams,
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

        Object localVarPostBody = virtualPrivateCloudSecurityPolicyDeleteParams;

        // create path and map variables
        String localVarPath = "/delete-virtual-private-cloud-security-policy";

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
    private okhttp3.Call deleteVirtualPrivateCloudSecurityPolicyValidateBeforeCall(
            VirtualPrivateCloudSecurityPolicyDeleteParams
                    virtualPrivateCloudSecurityPolicyDeleteParams,
            final ApiCallback _callback)
            throws ApiException {

        // verify the required parameter 'virtualPrivateCloudSecurityPolicyDeleteParams' is set
        if (virtualPrivateCloudSecurityPolicyDeleteParams == null) {
            throw new ApiException(
                    "Missing the required parameter"
                            + " 'virtualPrivateCloudSecurityPolicyDeleteParams' when calling"
                            + " deleteVirtualPrivateCloudSecurityPolicy(Async)");
        }

        okhttp3.Call localVarCall =
                deleteVirtualPrivateCloudSecurityPolicyCall(
                        virtualPrivateCloudSecurityPolicyDeleteParams, _callback);
        return localVarCall;
    }

    /**
     * @param virtualPrivateCloudSecurityPolicyDeleteParams (required)
     * @return List&lt;WithTaskDeleteVirtualPrivateCloudSecurityPolicy&gt;
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
    public List<WithTaskDeleteVirtualPrivateCloudSecurityPolicy>
            deleteVirtualPrivateCloudSecurityPolicy(
                    VirtualPrivateCloudSecurityPolicyDeleteParams
                            virtualPrivateCloudSecurityPolicyDeleteParams)
                    throws ApiException {
        ApiResponse<List<WithTaskDeleteVirtualPrivateCloudSecurityPolicy>> localVarResp =
                deleteVirtualPrivateCloudSecurityPolicyWithHttpInfo(
                        virtualPrivateCloudSecurityPolicyDeleteParams);
        return localVarResp.getData();
    }

    /**
     * @param virtualPrivateCloudSecurityPolicyDeleteParams (required)
     * @return ApiResponse&lt;List&lt;WithTaskDeleteVirtualPrivateCloudSecurityPolicy&gt;&gt;
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
    public ApiResponse<List<WithTaskDeleteVirtualPrivateCloudSecurityPolicy>>
            deleteVirtualPrivateCloudSecurityPolicyWithHttpInfo(
                    VirtualPrivateCloudSecurityPolicyDeleteParams
                            virtualPrivateCloudSecurityPolicyDeleteParams)
                    throws ApiException {
        okhttp3.Call localVarCall =
                deleteVirtualPrivateCloudSecurityPolicyValidateBeforeCall(
                        virtualPrivateCloudSecurityPolicyDeleteParams, null);
        Type localVarReturnType =
                new TypeToken<List<WithTaskDeleteVirtualPrivateCloudSecurityPolicy>>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param virtualPrivateCloudSecurityPolicyDeleteParams (required)
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
    public okhttp3.Call deleteVirtualPrivateCloudSecurityPolicyAsync(
            VirtualPrivateCloudSecurityPolicyDeleteParams
                    virtualPrivateCloudSecurityPolicyDeleteParams,
            final ApiCallback<List<WithTaskDeleteVirtualPrivateCloudSecurityPolicy>> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                deleteVirtualPrivateCloudSecurityPolicyValidateBeforeCall(
                        virtualPrivateCloudSecurityPolicyDeleteParams, _callback);
        Type localVarReturnType =
                new TypeToken<List<WithTaskDeleteVirtualPrivateCloudSecurityPolicy>>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getVirtualPrivateCloudSecurityPolicies
     *
     * @param getVirtualPrivateCloudSecurityPoliciesRequestBody (required)
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
    public okhttp3.Call getVirtualPrivateCloudSecurityPoliciesCall(
            GetVirtualPrivateCloudSecurityPoliciesRequestBody
                    getVirtualPrivateCloudSecurityPoliciesRequestBody,
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

        Object localVarPostBody = getVirtualPrivateCloudSecurityPoliciesRequestBody;

        // create path and map variables
        String localVarPath = "/get-virtual-private-cloud-security-policies";

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
    private okhttp3.Call getVirtualPrivateCloudSecurityPoliciesValidateBeforeCall(
            GetVirtualPrivateCloudSecurityPoliciesRequestBody
                    getVirtualPrivateCloudSecurityPoliciesRequestBody,
            final ApiCallback _callback)
            throws ApiException {

        // verify the required parameter 'getVirtualPrivateCloudSecurityPoliciesRequestBody' is set
        if (getVirtualPrivateCloudSecurityPoliciesRequestBody == null) {
            throw new ApiException(
                    "Missing the required parameter"
                            + " 'getVirtualPrivateCloudSecurityPoliciesRequestBody' when calling"
                            + " getVirtualPrivateCloudSecurityPolicies(Async)");
        }

        okhttp3.Call localVarCall =
                getVirtualPrivateCloudSecurityPoliciesCall(
                        getVirtualPrivateCloudSecurityPoliciesRequestBody, _callback);
        return localVarCall;
    }

    /**
     * @param getVirtualPrivateCloudSecurityPoliciesRequestBody (required)
     * @return List&lt;VirtualPrivateCloudSecurityPolicy&gt;
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
    public List<VirtualPrivateCloudSecurityPolicy> getVirtualPrivateCloudSecurityPolicies(
            GetVirtualPrivateCloudSecurityPoliciesRequestBody
                    getVirtualPrivateCloudSecurityPoliciesRequestBody)
            throws ApiException {
        ApiResponse<List<VirtualPrivateCloudSecurityPolicy>> localVarResp =
                getVirtualPrivateCloudSecurityPoliciesWithHttpInfo(
                        getVirtualPrivateCloudSecurityPoliciesRequestBody);
        return localVarResp.getData();
    }

    /**
     * @param getVirtualPrivateCloudSecurityPoliciesRequestBody (required)
     * @return ApiResponse&lt;List&lt;VirtualPrivateCloudSecurityPolicy&gt;&gt;
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
    public ApiResponse<List<VirtualPrivateCloudSecurityPolicy>>
            getVirtualPrivateCloudSecurityPoliciesWithHttpInfo(
                    GetVirtualPrivateCloudSecurityPoliciesRequestBody
                            getVirtualPrivateCloudSecurityPoliciesRequestBody)
                    throws ApiException {
        okhttp3.Call localVarCall =
                getVirtualPrivateCloudSecurityPoliciesValidateBeforeCall(
                        getVirtualPrivateCloudSecurityPoliciesRequestBody, null);
        Type localVarReturnType =
                new TypeToken<List<VirtualPrivateCloudSecurityPolicy>>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param getVirtualPrivateCloudSecurityPoliciesRequestBody (required)
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
    public okhttp3.Call getVirtualPrivateCloudSecurityPoliciesAsync(
            GetVirtualPrivateCloudSecurityPoliciesRequestBody
                    getVirtualPrivateCloudSecurityPoliciesRequestBody,
            final ApiCallback<List<VirtualPrivateCloudSecurityPolicy>> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                getVirtualPrivateCloudSecurityPoliciesValidateBeforeCall(
                        getVirtualPrivateCloudSecurityPoliciesRequestBody, _callback);
        Type localVarReturnType =
                new TypeToken<List<VirtualPrivateCloudSecurityPolicy>>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getVirtualPrivateCloudSecurityPoliciesConnection
     *
     * @param getVirtualPrivateCloudSecurityPoliciesConnectionRequestBody (required)
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
    public okhttp3.Call getVirtualPrivateCloudSecurityPoliciesConnectionCall(
            GetVirtualPrivateCloudSecurityPoliciesConnectionRequestBody
                    getVirtualPrivateCloudSecurityPoliciesConnectionRequestBody,
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

        Object localVarPostBody = getVirtualPrivateCloudSecurityPoliciesConnectionRequestBody;

        // create path and map variables
        String localVarPath = "/get-virtual-private-cloud-security-policies-connection";

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
    private okhttp3.Call getVirtualPrivateCloudSecurityPoliciesConnectionValidateBeforeCall(
            GetVirtualPrivateCloudSecurityPoliciesConnectionRequestBody
                    getVirtualPrivateCloudSecurityPoliciesConnectionRequestBody,
            final ApiCallback _callback)
            throws ApiException {

        // verify the required parameter
        // 'getVirtualPrivateCloudSecurityPoliciesConnectionRequestBody' is set
        if (getVirtualPrivateCloudSecurityPoliciesConnectionRequestBody == null) {
            throw new ApiException(
                    "Missing the required parameter"
                            + " 'getVirtualPrivateCloudSecurityPoliciesConnectionRequestBody' when"
                            + " calling getVirtualPrivateCloudSecurityPoliciesConnection(Async)");
        }

        okhttp3.Call localVarCall =
                getVirtualPrivateCloudSecurityPoliciesConnectionCall(
                        getVirtualPrivateCloudSecurityPoliciesConnectionRequestBody, _callback);
        return localVarCall;
    }

    /**
     * @param getVirtualPrivateCloudSecurityPoliciesConnectionRequestBody (required)
     * @return VirtualPrivateCloudSecurityPolicyConnection
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
    public VirtualPrivateCloudSecurityPolicyConnection
            getVirtualPrivateCloudSecurityPoliciesConnection(
                    GetVirtualPrivateCloudSecurityPoliciesConnectionRequestBody
                            getVirtualPrivateCloudSecurityPoliciesConnectionRequestBody)
                    throws ApiException {
        ApiResponse<VirtualPrivateCloudSecurityPolicyConnection> localVarResp =
                getVirtualPrivateCloudSecurityPoliciesConnectionWithHttpInfo(
                        getVirtualPrivateCloudSecurityPoliciesConnectionRequestBody);
        return localVarResp.getData();
    }

    /**
     * @param getVirtualPrivateCloudSecurityPoliciesConnectionRequestBody (required)
     * @return ApiResponse&lt;VirtualPrivateCloudSecurityPolicyConnection&gt;
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
    public ApiResponse<VirtualPrivateCloudSecurityPolicyConnection>
            getVirtualPrivateCloudSecurityPoliciesConnectionWithHttpInfo(
                    GetVirtualPrivateCloudSecurityPoliciesConnectionRequestBody
                            getVirtualPrivateCloudSecurityPoliciesConnectionRequestBody)
                    throws ApiException {
        okhttp3.Call localVarCall =
                getVirtualPrivateCloudSecurityPoliciesConnectionValidateBeforeCall(
                        getVirtualPrivateCloudSecurityPoliciesConnectionRequestBody, null);
        Type localVarReturnType =
                new TypeToken<VirtualPrivateCloudSecurityPolicyConnection>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param getVirtualPrivateCloudSecurityPoliciesConnectionRequestBody (required)
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
    public okhttp3.Call getVirtualPrivateCloudSecurityPoliciesConnectionAsync(
            GetVirtualPrivateCloudSecurityPoliciesConnectionRequestBody
                    getVirtualPrivateCloudSecurityPoliciesConnectionRequestBody,
            final ApiCallback<VirtualPrivateCloudSecurityPolicyConnection> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                getVirtualPrivateCloudSecurityPoliciesConnectionValidateBeforeCall(
                        getVirtualPrivateCloudSecurityPoliciesConnectionRequestBody, _callback);
        Type localVarReturnType =
                new TypeToken<VirtualPrivateCloudSecurityPolicyConnection>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateVirtualPrivateCloudSecurityPolicy
     *
     * @param virtualPrivateCloudSecurityPolicyUpdateBody (required)
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
    public okhttp3.Call updateVirtualPrivateCloudSecurityPolicyCall(
            VirtualPrivateCloudSecurityPolicyUpdateBody virtualPrivateCloudSecurityPolicyUpdateBody,
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

        Object localVarPostBody = virtualPrivateCloudSecurityPolicyUpdateBody;

        // create path and map variables
        String localVarPath = "/update-virtual-private-cloud-security-policy";

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
    private okhttp3.Call updateVirtualPrivateCloudSecurityPolicyValidateBeforeCall(
            VirtualPrivateCloudSecurityPolicyUpdateBody virtualPrivateCloudSecurityPolicyUpdateBody,
            final ApiCallback _callback)
            throws ApiException {

        // verify the required parameter 'virtualPrivateCloudSecurityPolicyUpdateBody' is set
        if (virtualPrivateCloudSecurityPolicyUpdateBody == null) {
            throw new ApiException(
                    "Missing the required parameter 'virtualPrivateCloudSecurityPolicyUpdateBody'"
                            + " when calling updateVirtualPrivateCloudSecurityPolicy(Async)");
        }

        okhttp3.Call localVarCall =
                updateVirtualPrivateCloudSecurityPolicyCall(
                        virtualPrivateCloudSecurityPolicyUpdateBody, _callback);
        return localVarCall;
    }

    /**
     * @param virtualPrivateCloudSecurityPolicyUpdateBody (required)
     * @return List&lt;WithTaskVirtualPrivateCloudSecurityPolicy&gt;
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
    public List<WithTaskVirtualPrivateCloudSecurityPolicy> updateVirtualPrivateCloudSecurityPolicy(
            VirtualPrivateCloudSecurityPolicyUpdateBody virtualPrivateCloudSecurityPolicyUpdateBody)
            throws ApiException {
        ApiResponse<List<WithTaskVirtualPrivateCloudSecurityPolicy>> localVarResp =
                updateVirtualPrivateCloudSecurityPolicyWithHttpInfo(
                        virtualPrivateCloudSecurityPolicyUpdateBody);
        return localVarResp.getData();
    }

    /**
     * @param virtualPrivateCloudSecurityPolicyUpdateBody (required)
     * @return ApiResponse&lt;List&lt;WithTaskVirtualPrivateCloudSecurityPolicy&gt;&gt;
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
    public ApiResponse<List<WithTaskVirtualPrivateCloudSecurityPolicy>>
            updateVirtualPrivateCloudSecurityPolicyWithHttpInfo(
                    VirtualPrivateCloudSecurityPolicyUpdateBody
                            virtualPrivateCloudSecurityPolicyUpdateBody)
                    throws ApiException {
        okhttp3.Call localVarCall =
                updateVirtualPrivateCloudSecurityPolicyValidateBeforeCall(
                        virtualPrivateCloudSecurityPolicyUpdateBody, null);
        Type localVarReturnType =
                new TypeToken<List<WithTaskVirtualPrivateCloudSecurityPolicy>>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param virtualPrivateCloudSecurityPolicyUpdateBody (required)
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
    public okhttp3.Call updateVirtualPrivateCloudSecurityPolicyAsync(
            VirtualPrivateCloudSecurityPolicyUpdateBody virtualPrivateCloudSecurityPolicyUpdateBody,
            final ApiCallback<List<WithTaskVirtualPrivateCloudSecurityPolicy>> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                updateVirtualPrivateCloudSecurityPolicyValidateBeforeCall(
                        virtualPrivateCloudSecurityPolicyUpdateBody, _callback);
        Type localVarReturnType =
                new TypeToken<List<WithTaskVirtualPrivateCloudSecurityPolicy>>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}

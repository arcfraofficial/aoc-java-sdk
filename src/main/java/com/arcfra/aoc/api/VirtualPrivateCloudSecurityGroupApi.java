package com.arcfra.aoc.api;


import com.arcfra.aoc.ApiCallback;
import com.arcfra.aoc.ApiClient;
import com.arcfra.aoc.ApiException;
import com.arcfra.aoc.ApiResponse;
import com.arcfra.aoc.Configuration;
import com.arcfra.aoc.Pair;
import com.arcfra.aoc.model.GetVirtualPrivateCloudSecurityGroupsConnectionRequestBody;
import com.arcfra.aoc.model.GetVirtualPrivateCloudSecurityGroupsRequestBody;
import com.arcfra.aoc.model.VirtualPrivateCloudSecurityGroup;
import com.arcfra.aoc.model.VirtualPrivateCloudSecurityGroupConnection;
import com.arcfra.aoc.model.VirtualPrivateCloudSecurityGroupCreationParams;
import com.arcfra.aoc.model.VirtualPrivateCloudSecurityGroupDeletionParams;
import com.arcfra.aoc.model.VirtualPrivateCloudSecurityGroupUpdationParams;
import com.arcfra.aoc.model.WithTaskDeleteVirtualPrivateCloudSecurityGroup;
import com.arcfra.aoc.model.WithTaskVirtualPrivateCloudSecurityGroup;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VirtualPrivateCloudSecurityGroupApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public VirtualPrivateCloudSecurityGroupApi() {
        this(Configuration.getDefaultApiClient());
    }

    public VirtualPrivateCloudSecurityGroupApi(ApiClient apiClient) {
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
     * Build call for createVirtualPrivateCloudSecurityGroup
     *
     * @param virtualPrivateCloudSecurityGroupCreationParams (required)
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
    public okhttp3.Call createVirtualPrivateCloudSecurityGroupCall(
            List<VirtualPrivateCloudSecurityGroupCreationParams>
                    virtualPrivateCloudSecurityGroupCreationParams,
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

        Object localVarPostBody = virtualPrivateCloudSecurityGroupCreationParams;

        // create path and map variables
        String localVarPath = "/create-virtual-private-cloud-security-group";

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
    private okhttp3.Call createVirtualPrivateCloudSecurityGroupValidateBeforeCall(
            List<VirtualPrivateCloudSecurityGroupCreationParams>
                    virtualPrivateCloudSecurityGroupCreationParams,
            final ApiCallback _callback)
            throws ApiException {

        // verify the required parameter 'virtualPrivateCloudSecurityGroupCreationParams' is set
        if (virtualPrivateCloudSecurityGroupCreationParams == null) {
            throw new ApiException(
                    "Missing the required parameter"
                            + " 'virtualPrivateCloudSecurityGroupCreationParams' when calling"
                            + " createVirtualPrivateCloudSecurityGroup(Async)");
        }

        okhttp3.Call localVarCall =
                createVirtualPrivateCloudSecurityGroupCall(
                        virtualPrivateCloudSecurityGroupCreationParams, _callback);
        return localVarCall;
    }

    /**
     * @param virtualPrivateCloudSecurityGroupCreationParams (required)
     * @return List&lt;WithTaskVirtualPrivateCloudSecurityGroup&gt;
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
    public List<WithTaskVirtualPrivateCloudSecurityGroup> createVirtualPrivateCloudSecurityGroup(
            List<VirtualPrivateCloudSecurityGroupCreationParams>
                    virtualPrivateCloudSecurityGroupCreationParams)
            throws ApiException {
        ApiResponse<List<WithTaskVirtualPrivateCloudSecurityGroup>> localVarResp =
                createVirtualPrivateCloudSecurityGroupWithHttpInfo(
                        virtualPrivateCloudSecurityGroupCreationParams);
        return localVarResp.getData();
    }

    /**
     * @param virtualPrivateCloudSecurityGroupCreationParams (required)
     * @return ApiResponse&lt;List&lt;WithTaskVirtualPrivateCloudSecurityGroup&gt;&gt;
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
    public ApiResponse<List<WithTaskVirtualPrivateCloudSecurityGroup>>
            createVirtualPrivateCloudSecurityGroupWithHttpInfo(
                    List<VirtualPrivateCloudSecurityGroupCreationParams>
                            virtualPrivateCloudSecurityGroupCreationParams)
                    throws ApiException {
        okhttp3.Call localVarCall =
                createVirtualPrivateCloudSecurityGroupValidateBeforeCall(
                        virtualPrivateCloudSecurityGroupCreationParams, null);
        Type localVarReturnType =
                new TypeToken<List<WithTaskVirtualPrivateCloudSecurityGroup>>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param virtualPrivateCloudSecurityGroupCreationParams (required)
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
    public okhttp3.Call createVirtualPrivateCloudSecurityGroupAsync(
            List<VirtualPrivateCloudSecurityGroupCreationParams>
                    virtualPrivateCloudSecurityGroupCreationParams,
            final ApiCallback<List<WithTaskVirtualPrivateCloudSecurityGroup>> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                createVirtualPrivateCloudSecurityGroupValidateBeforeCall(
                        virtualPrivateCloudSecurityGroupCreationParams, _callback);
        Type localVarReturnType =
                new TypeToken<List<WithTaskVirtualPrivateCloudSecurityGroup>>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteVirtualPrivateCloudSecurityGroup
     *
     * @param virtualPrivateCloudSecurityGroupDeletionParams (required)
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
    public okhttp3.Call deleteVirtualPrivateCloudSecurityGroupCall(
            VirtualPrivateCloudSecurityGroupDeletionParams
                    virtualPrivateCloudSecurityGroupDeletionParams,
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

        Object localVarPostBody = virtualPrivateCloudSecurityGroupDeletionParams;

        // create path and map variables
        String localVarPath = "/delete-virtual-private-cloud-security-group";

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
    private okhttp3.Call deleteVirtualPrivateCloudSecurityGroupValidateBeforeCall(
            VirtualPrivateCloudSecurityGroupDeletionParams
                    virtualPrivateCloudSecurityGroupDeletionParams,
            final ApiCallback _callback)
            throws ApiException {

        // verify the required parameter 'virtualPrivateCloudSecurityGroupDeletionParams' is set
        if (virtualPrivateCloudSecurityGroupDeletionParams == null) {
            throw new ApiException(
                    "Missing the required parameter"
                            + " 'virtualPrivateCloudSecurityGroupDeletionParams' when calling"
                            + " deleteVirtualPrivateCloudSecurityGroup(Async)");
        }

        okhttp3.Call localVarCall =
                deleteVirtualPrivateCloudSecurityGroupCall(
                        virtualPrivateCloudSecurityGroupDeletionParams, _callback);
        return localVarCall;
    }

    /**
     * @param virtualPrivateCloudSecurityGroupDeletionParams (required)
     * @return List&lt;WithTaskDeleteVirtualPrivateCloudSecurityGroup&gt;
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
    public List<WithTaskDeleteVirtualPrivateCloudSecurityGroup>
            deleteVirtualPrivateCloudSecurityGroup(
                    VirtualPrivateCloudSecurityGroupDeletionParams
                            virtualPrivateCloudSecurityGroupDeletionParams)
                    throws ApiException {
        ApiResponse<List<WithTaskDeleteVirtualPrivateCloudSecurityGroup>> localVarResp =
                deleteVirtualPrivateCloudSecurityGroupWithHttpInfo(
                        virtualPrivateCloudSecurityGroupDeletionParams);
        return localVarResp.getData();
    }

    /**
     * @param virtualPrivateCloudSecurityGroupDeletionParams (required)
     * @return ApiResponse&lt;List&lt;WithTaskDeleteVirtualPrivateCloudSecurityGroup&gt;&gt;
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
    public ApiResponse<List<WithTaskDeleteVirtualPrivateCloudSecurityGroup>>
            deleteVirtualPrivateCloudSecurityGroupWithHttpInfo(
                    VirtualPrivateCloudSecurityGroupDeletionParams
                            virtualPrivateCloudSecurityGroupDeletionParams)
                    throws ApiException {
        okhttp3.Call localVarCall =
                deleteVirtualPrivateCloudSecurityGroupValidateBeforeCall(
                        virtualPrivateCloudSecurityGroupDeletionParams, null);
        Type localVarReturnType =
                new TypeToken<List<WithTaskDeleteVirtualPrivateCloudSecurityGroup>>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param virtualPrivateCloudSecurityGroupDeletionParams (required)
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
    public okhttp3.Call deleteVirtualPrivateCloudSecurityGroupAsync(
            VirtualPrivateCloudSecurityGroupDeletionParams
                    virtualPrivateCloudSecurityGroupDeletionParams,
            final ApiCallback<List<WithTaskDeleteVirtualPrivateCloudSecurityGroup>> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                deleteVirtualPrivateCloudSecurityGroupValidateBeforeCall(
                        virtualPrivateCloudSecurityGroupDeletionParams, _callback);
        Type localVarReturnType =
                new TypeToken<List<WithTaskDeleteVirtualPrivateCloudSecurityGroup>>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getVirtualPrivateCloudSecurityGroups
     *
     * @param getVirtualPrivateCloudSecurityGroupsRequestBody (required)
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
    public okhttp3.Call getVirtualPrivateCloudSecurityGroupsCall(
            GetVirtualPrivateCloudSecurityGroupsRequestBody
                    getVirtualPrivateCloudSecurityGroupsRequestBody,
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

        Object localVarPostBody = getVirtualPrivateCloudSecurityGroupsRequestBody;

        // create path and map variables
        String localVarPath = "/get-virtual-private-cloud-security-groups";

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
    private okhttp3.Call getVirtualPrivateCloudSecurityGroupsValidateBeforeCall(
            GetVirtualPrivateCloudSecurityGroupsRequestBody
                    getVirtualPrivateCloudSecurityGroupsRequestBody,
            final ApiCallback _callback)
            throws ApiException {

        // verify the required parameter 'getVirtualPrivateCloudSecurityGroupsRequestBody' is set
        if (getVirtualPrivateCloudSecurityGroupsRequestBody == null) {
            throw new ApiException(
                    "Missing the required parameter"
                            + " 'getVirtualPrivateCloudSecurityGroupsRequestBody' when calling"
                            + " getVirtualPrivateCloudSecurityGroups(Async)");
        }

        okhttp3.Call localVarCall =
                getVirtualPrivateCloudSecurityGroupsCall(
                        getVirtualPrivateCloudSecurityGroupsRequestBody, _callback);
        return localVarCall;
    }

    /**
     * @param getVirtualPrivateCloudSecurityGroupsRequestBody (required)
     * @return List&lt;VirtualPrivateCloudSecurityGroup&gt;
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
    public List<VirtualPrivateCloudSecurityGroup> getVirtualPrivateCloudSecurityGroups(
            GetVirtualPrivateCloudSecurityGroupsRequestBody
                    getVirtualPrivateCloudSecurityGroupsRequestBody)
            throws ApiException {
        ApiResponse<List<VirtualPrivateCloudSecurityGroup>> localVarResp =
                getVirtualPrivateCloudSecurityGroupsWithHttpInfo(
                        getVirtualPrivateCloudSecurityGroupsRequestBody);
        return localVarResp.getData();
    }

    /**
     * @param getVirtualPrivateCloudSecurityGroupsRequestBody (required)
     * @return ApiResponse&lt;List&lt;VirtualPrivateCloudSecurityGroup&gt;&gt;
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
    public ApiResponse<List<VirtualPrivateCloudSecurityGroup>>
            getVirtualPrivateCloudSecurityGroupsWithHttpInfo(
                    GetVirtualPrivateCloudSecurityGroupsRequestBody
                            getVirtualPrivateCloudSecurityGroupsRequestBody)
                    throws ApiException {
        okhttp3.Call localVarCall =
                getVirtualPrivateCloudSecurityGroupsValidateBeforeCall(
                        getVirtualPrivateCloudSecurityGroupsRequestBody, null);
        Type localVarReturnType =
                new TypeToken<List<VirtualPrivateCloudSecurityGroup>>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param getVirtualPrivateCloudSecurityGroupsRequestBody (required)
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
    public okhttp3.Call getVirtualPrivateCloudSecurityGroupsAsync(
            GetVirtualPrivateCloudSecurityGroupsRequestBody
                    getVirtualPrivateCloudSecurityGroupsRequestBody,
            final ApiCallback<List<VirtualPrivateCloudSecurityGroup>> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                getVirtualPrivateCloudSecurityGroupsValidateBeforeCall(
                        getVirtualPrivateCloudSecurityGroupsRequestBody, _callback);
        Type localVarReturnType =
                new TypeToken<List<VirtualPrivateCloudSecurityGroup>>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getVirtualPrivateCloudSecurityGroupsConnection
     *
     * @param getVirtualPrivateCloudSecurityGroupsConnectionRequestBody (required)
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
    public okhttp3.Call getVirtualPrivateCloudSecurityGroupsConnectionCall(
            GetVirtualPrivateCloudSecurityGroupsConnectionRequestBody
                    getVirtualPrivateCloudSecurityGroupsConnectionRequestBody,
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

        Object localVarPostBody = getVirtualPrivateCloudSecurityGroupsConnectionRequestBody;

        // create path and map variables
        String localVarPath = "/get-virtual-private-cloud-security-groups-connection";

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
    private okhttp3.Call getVirtualPrivateCloudSecurityGroupsConnectionValidateBeforeCall(
            GetVirtualPrivateCloudSecurityGroupsConnectionRequestBody
                    getVirtualPrivateCloudSecurityGroupsConnectionRequestBody,
            final ApiCallback _callback)
            throws ApiException {

        // verify the required parameter 'getVirtualPrivateCloudSecurityGroupsConnectionRequestBody'
        // is set
        if (getVirtualPrivateCloudSecurityGroupsConnectionRequestBody == null) {
            throw new ApiException(
                    "Missing the required parameter"
                            + " 'getVirtualPrivateCloudSecurityGroupsConnectionRequestBody' when"
                            + " calling getVirtualPrivateCloudSecurityGroupsConnection(Async)");
        }

        okhttp3.Call localVarCall =
                getVirtualPrivateCloudSecurityGroupsConnectionCall(
                        getVirtualPrivateCloudSecurityGroupsConnectionRequestBody, _callback);
        return localVarCall;
    }

    /**
     * @param getVirtualPrivateCloudSecurityGroupsConnectionRequestBody (required)
     * @return VirtualPrivateCloudSecurityGroupConnection
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
    public VirtualPrivateCloudSecurityGroupConnection
            getVirtualPrivateCloudSecurityGroupsConnection(
                    GetVirtualPrivateCloudSecurityGroupsConnectionRequestBody
                            getVirtualPrivateCloudSecurityGroupsConnectionRequestBody)
                    throws ApiException {
        ApiResponse<VirtualPrivateCloudSecurityGroupConnection> localVarResp =
                getVirtualPrivateCloudSecurityGroupsConnectionWithHttpInfo(
                        getVirtualPrivateCloudSecurityGroupsConnectionRequestBody);
        return localVarResp.getData();
    }

    /**
     * @param getVirtualPrivateCloudSecurityGroupsConnectionRequestBody (required)
     * @return ApiResponse&lt;VirtualPrivateCloudSecurityGroupConnection&gt;
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
    public ApiResponse<VirtualPrivateCloudSecurityGroupConnection>
            getVirtualPrivateCloudSecurityGroupsConnectionWithHttpInfo(
                    GetVirtualPrivateCloudSecurityGroupsConnectionRequestBody
                            getVirtualPrivateCloudSecurityGroupsConnectionRequestBody)
                    throws ApiException {
        okhttp3.Call localVarCall =
                getVirtualPrivateCloudSecurityGroupsConnectionValidateBeforeCall(
                        getVirtualPrivateCloudSecurityGroupsConnectionRequestBody, null);
        Type localVarReturnType =
                new TypeToken<VirtualPrivateCloudSecurityGroupConnection>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param getVirtualPrivateCloudSecurityGroupsConnectionRequestBody (required)
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
    public okhttp3.Call getVirtualPrivateCloudSecurityGroupsConnectionAsync(
            GetVirtualPrivateCloudSecurityGroupsConnectionRequestBody
                    getVirtualPrivateCloudSecurityGroupsConnectionRequestBody,
            final ApiCallback<VirtualPrivateCloudSecurityGroupConnection> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                getVirtualPrivateCloudSecurityGroupsConnectionValidateBeforeCall(
                        getVirtualPrivateCloudSecurityGroupsConnectionRequestBody, _callback);
        Type localVarReturnType =
                new TypeToken<VirtualPrivateCloudSecurityGroupConnection>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateVirtualPrivateCloudSecurityGroup
     *
     * @param virtualPrivateCloudSecurityGroupUpdationParams (required)
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
    public okhttp3.Call updateVirtualPrivateCloudSecurityGroupCall(
            VirtualPrivateCloudSecurityGroupUpdationParams
                    virtualPrivateCloudSecurityGroupUpdationParams,
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

        Object localVarPostBody = virtualPrivateCloudSecurityGroupUpdationParams;

        // create path and map variables
        String localVarPath = "/update-virtual-private-cloud-security-group";

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
    private okhttp3.Call updateVirtualPrivateCloudSecurityGroupValidateBeforeCall(
            VirtualPrivateCloudSecurityGroupUpdationParams
                    virtualPrivateCloudSecurityGroupUpdationParams,
            final ApiCallback _callback)
            throws ApiException {

        // verify the required parameter 'virtualPrivateCloudSecurityGroupUpdationParams' is set
        if (virtualPrivateCloudSecurityGroupUpdationParams == null) {
            throw new ApiException(
                    "Missing the required parameter"
                            + " 'virtualPrivateCloudSecurityGroupUpdationParams' when calling"
                            + " updateVirtualPrivateCloudSecurityGroup(Async)");
        }

        okhttp3.Call localVarCall =
                updateVirtualPrivateCloudSecurityGroupCall(
                        virtualPrivateCloudSecurityGroupUpdationParams, _callback);
        return localVarCall;
    }

    /**
     * @param virtualPrivateCloudSecurityGroupUpdationParams (required)
     * @return List&lt;WithTaskVirtualPrivateCloudSecurityGroup&gt;
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
    public List<WithTaskVirtualPrivateCloudSecurityGroup> updateVirtualPrivateCloudSecurityGroup(
            VirtualPrivateCloudSecurityGroupUpdationParams
                    virtualPrivateCloudSecurityGroupUpdationParams)
            throws ApiException {
        ApiResponse<List<WithTaskVirtualPrivateCloudSecurityGroup>> localVarResp =
                updateVirtualPrivateCloudSecurityGroupWithHttpInfo(
                        virtualPrivateCloudSecurityGroupUpdationParams);
        return localVarResp.getData();
    }

    /**
     * @param virtualPrivateCloudSecurityGroupUpdationParams (required)
     * @return ApiResponse&lt;List&lt;WithTaskVirtualPrivateCloudSecurityGroup&gt;&gt;
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
    public ApiResponse<List<WithTaskVirtualPrivateCloudSecurityGroup>>
            updateVirtualPrivateCloudSecurityGroupWithHttpInfo(
                    VirtualPrivateCloudSecurityGroupUpdationParams
                            virtualPrivateCloudSecurityGroupUpdationParams)
                    throws ApiException {
        okhttp3.Call localVarCall =
                updateVirtualPrivateCloudSecurityGroupValidateBeforeCall(
                        virtualPrivateCloudSecurityGroupUpdationParams, null);
        Type localVarReturnType =
                new TypeToken<List<WithTaskVirtualPrivateCloudSecurityGroup>>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param virtualPrivateCloudSecurityGroupUpdationParams (required)
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
    public okhttp3.Call updateVirtualPrivateCloudSecurityGroupAsync(
            VirtualPrivateCloudSecurityGroupUpdationParams
                    virtualPrivateCloudSecurityGroupUpdationParams,
            final ApiCallback<List<WithTaskVirtualPrivateCloudSecurityGroup>> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                updateVirtualPrivateCloudSecurityGroupValidateBeforeCall(
                        virtualPrivateCloudSecurityGroupUpdationParams, _callback);
        Type localVarReturnType =
                new TypeToken<List<WithTaskVirtualPrivateCloudSecurityGroup>>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}

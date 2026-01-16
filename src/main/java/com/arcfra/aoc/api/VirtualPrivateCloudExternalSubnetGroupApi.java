package com.arcfra.aoc.api;


import com.arcfra.aoc.ApiCallback;
import com.arcfra.aoc.ApiClient;
import com.arcfra.aoc.ApiException;
import com.arcfra.aoc.ApiResponse;
import com.arcfra.aoc.Configuration;
import com.arcfra.aoc.Pair;
import com.arcfra.aoc.model.GetVirtualPrivateCloudExternalSubnetGroupsConnectionRequestBody;
import com.arcfra.aoc.model.GetVirtualPrivateCloudExternalSubnetGroupsRequestBody;
import com.arcfra.aoc.model.VirtualPrivateCloudExternalSubnetGroup;
import com.arcfra.aoc.model.VirtualPrivateCloudExternalSubnetGroupConnection;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VirtualPrivateCloudExternalSubnetGroupApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public VirtualPrivateCloudExternalSubnetGroupApi() {
        this(Configuration.getDefaultApiClient());
    }

    public VirtualPrivateCloudExternalSubnetGroupApi(ApiClient apiClient) {
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
     * Build call for getVirtualPrivateCloudExternalSubnetGroups
     *
     * @param getVirtualPrivateCloudExternalSubnetGroupsRequestBody (required)
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
    public okhttp3.Call getVirtualPrivateCloudExternalSubnetGroupsCall(
            GetVirtualPrivateCloudExternalSubnetGroupsRequestBody
                    getVirtualPrivateCloudExternalSubnetGroupsRequestBody,
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

        Object localVarPostBody = getVirtualPrivateCloudExternalSubnetGroupsRequestBody;

        // create path and map variables
        String localVarPath = "/get-virtual-private-cloud-external-subnet-groups";

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
    private okhttp3.Call getVirtualPrivateCloudExternalSubnetGroupsValidateBeforeCall(
            GetVirtualPrivateCloudExternalSubnetGroupsRequestBody
                    getVirtualPrivateCloudExternalSubnetGroupsRequestBody,
            final ApiCallback _callback)
            throws ApiException {

        // verify the required parameter 'getVirtualPrivateCloudExternalSubnetGroupsRequestBody' is
        // set
        if (getVirtualPrivateCloudExternalSubnetGroupsRequestBody == null) {
            throw new ApiException(
                    "Missing the required parameter"
                        + " 'getVirtualPrivateCloudExternalSubnetGroupsRequestBody' when calling"
                        + " getVirtualPrivateCloudExternalSubnetGroups(Async)");
        }

        okhttp3.Call localVarCall =
                getVirtualPrivateCloudExternalSubnetGroupsCall(
                        getVirtualPrivateCloudExternalSubnetGroupsRequestBody, _callback);
        return localVarCall;
    }

    /**
     * @param getVirtualPrivateCloudExternalSubnetGroupsRequestBody (required)
     * @return List&lt;VirtualPrivateCloudExternalSubnetGroup&gt;
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
    public List<VirtualPrivateCloudExternalSubnetGroup> getVirtualPrivateCloudExternalSubnetGroups(
            GetVirtualPrivateCloudExternalSubnetGroupsRequestBody
                    getVirtualPrivateCloudExternalSubnetGroupsRequestBody)
            throws ApiException {
        ApiResponse<List<VirtualPrivateCloudExternalSubnetGroup>> localVarResp =
                getVirtualPrivateCloudExternalSubnetGroupsWithHttpInfo(
                        getVirtualPrivateCloudExternalSubnetGroupsRequestBody);
        return localVarResp.getData();
    }

    /**
     * @param getVirtualPrivateCloudExternalSubnetGroupsRequestBody (required)
     * @return ApiResponse&lt;List&lt;VirtualPrivateCloudExternalSubnetGroup&gt;&gt;
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
    public ApiResponse<List<VirtualPrivateCloudExternalSubnetGroup>>
            getVirtualPrivateCloudExternalSubnetGroupsWithHttpInfo(
                    GetVirtualPrivateCloudExternalSubnetGroupsRequestBody
                            getVirtualPrivateCloudExternalSubnetGroupsRequestBody)
                    throws ApiException {
        okhttp3.Call localVarCall =
                getVirtualPrivateCloudExternalSubnetGroupsValidateBeforeCall(
                        getVirtualPrivateCloudExternalSubnetGroupsRequestBody, null);
        Type localVarReturnType =
                new TypeToken<List<VirtualPrivateCloudExternalSubnetGroup>>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param getVirtualPrivateCloudExternalSubnetGroupsRequestBody (required)
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
    public okhttp3.Call getVirtualPrivateCloudExternalSubnetGroupsAsync(
            GetVirtualPrivateCloudExternalSubnetGroupsRequestBody
                    getVirtualPrivateCloudExternalSubnetGroupsRequestBody,
            final ApiCallback<List<VirtualPrivateCloudExternalSubnetGroup>> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                getVirtualPrivateCloudExternalSubnetGroupsValidateBeforeCall(
                        getVirtualPrivateCloudExternalSubnetGroupsRequestBody, _callback);
        Type localVarReturnType =
                new TypeToken<List<VirtualPrivateCloudExternalSubnetGroup>>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getVirtualPrivateCloudExternalSubnetGroupsConnection
     *
     * @param getVirtualPrivateCloudExternalSubnetGroupsConnectionRequestBody (required)
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
    public okhttp3.Call getVirtualPrivateCloudExternalSubnetGroupsConnectionCall(
            GetVirtualPrivateCloudExternalSubnetGroupsConnectionRequestBody
                    getVirtualPrivateCloudExternalSubnetGroupsConnectionRequestBody,
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

        Object localVarPostBody = getVirtualPrivateCloudExternalSubnetGroupsConnectionRequestBody;

        // create path and map variables
        String localVarPath = "/get-virtual-private-cloud-external-subnet-groups-connection";

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
    private okhttp3.Call getVirtualPrivateCloudExternalSubnetGroupsConnectionValidateBeforeCall(
            GetVirtualPrivateCloudExternalSubnetGroupsConnectionRequestBody
                    getVirtualPrivateCloudExternalSubnetGroupsConnectionRequestBody,
            final ApiCallback _callback)
            throws ApiException {

        // verify the required parameter
        // 'getVirtualPrivateCloudExternalSubnetGroupsConnectionRequestBody' is set
        if (getVirtualPrivateCloudExternalSubnetGroupsConnectionRequestBody == null) {
            throw new ApiException(
                    "Missing the required parameter"
                        + " 'getVirtualPrivateCloudExternalSubnetGroupsConnectionRequestBody' when"
                        + " calling getVirtualPrivateCloudExternalSubnetGroupsConnection(Async)");
        }

        okhttp3.Call localVarCall =
                getVirtualPrivateCloudExternalSubnetGroupsConnectionCall(
                        getVirtualPrivateCloudExternalSubnetGroupsConnectionRequestBody, _callback);
        return localVarCall;
    }

    /**
     * @param getVirtualPrivateCloudExternalSubnetGroupsConnectionRequestBody (required)
     * @return VirtualPrivateCloudExternalSubnetGroupConnection
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
    public VirtualPrivateCloudExternalSubnetGroupConnection
            getVirtualPrivateCloudExternalSubnetGroupsConnection(
                    GetVirtualPrivateCloudExternalSubnetGroupsConnectionRequestBody
                            getVirtualPrivateCloudExternalSubnetGroupsConnectionRequestBody)
                    throws ApiException {
        ApiResponse<VirtualPrivateCloudExternalSubnetGroupConnection> localVarResp =
                getVirtualPrivateCloudExternalSubnetGroupsConnectionWithHttpInfo(
                        getVirtualPrivateCloudExternalSubnetGroupsConnectionRequestBody);
        return localVarResp.getData();
    }

    /**
     * @param getVirtualPrivateCloudExternalSubnetGroupsConnectionRequestBody (required)
     * @return ApiResponse&lt;VirtualPrivateCloudExternalSubnetGroupConnection&gt;
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
    public ApiResponse<VirtualPrivateCloudExternalSubnetGroupConnection>
            getVirtualPrivateCloudExternalSubnetGroupsConnectionWithHttpInfo(
                    GetVirtualPrivateCloudExternalSubnetGroupsConnectionRequestBody
                            getVirtualPrivateCloudExternalSubnetGroupsConnectionRequestBody)
                    throws ApiException {
        okhttp3.Call localVarCall =
                getVirtualPrivateCloudExternalSubnetGroupsConnectionValidateBeforeCall(
                        getVirtualPrivateCloudExternalSubnetGroupsConnectionRequestBody, null);
        Type localVarReturnType =
                new TypeToken<VirtualPrivateCloudExternalSubnetGroupConnection>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param getVirtualPrivateCloudExternalSubnetGroupsConnectionRequestBody (required)
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
    public okhttp3.Call getVirtualPrivateCloudExternalSubnetGroupsConnectionAsync(
            GetVirtualPrivateCloudExternalSubnetGroupsConnectionRequestBody
                    getVirtualPrivateCloudExternalSubnetGroupsConnectionRequestBody,
            final ApiCallback<VirtualPrivateCloudExternalSubnetGroupConnection> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                getVirtualPrivateCloudExternalSubnetGroupsConnectionValidateBeforeCall(
                        getVirtualPrivateCloudExternalSubnetGroupsConnectionRequestBody, _callback);
        Type localVarReturnType =
                new TypeToken<VirtualPrivateCloudExternalSubnetGroupConnection>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}

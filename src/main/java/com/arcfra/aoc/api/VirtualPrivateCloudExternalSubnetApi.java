package com.arcfra.aoc.api;


import com.arcfra.aoc.ApiCallback;
import com.arcfra.aoc.ApiClient;
import com.arcfra.aoc.ApiException;
import com.arcfra.aoc.ApiResponse;
import com.arcfra.aoc.Configuration;
import com.arcfra.aoc.Pair;
import com.arcfra.aoc.model.GetVirtualPrivateCloudExternalSubnetsConnectionRequestBody;
import com.arcfra.aoc.model.GetVirtualPrivateCloudExternalSubnetsRequestBody;
import com.arcfra.aoc.model.VirtualPrivateCloudExternalSubnet;
import com.arcfra.aoc.model.VirtualPrivateCloudExternalSubnetConnection;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VirtualPrivateCloudExternalSubnetApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public VirtualPrivateCloudExternalSubnetApi() {
        this(Configuration.getDefaultApiClient());
    }

    public VirtualPrivateCloudExternalSubnetApi(ApiClient apiClient) {
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
     * Build call for getVirtualPrivateCloudExternalSubnets
     *
     * @param getVirtualPrivateCloudExternalSubnetsRequestBody (required)
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
    public okhttp3.Call getVirtualPrivateCloudExternalSubnetsCall(
            GetVirtualPrivateCloudExternalSubnetsRequestBody
                    getVirtualPrivateCloudExternalSubnetsRequestBody,
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

        Object localVarPostBody = getVirtualPrivateCloudExternalSubnetsRequestBody;

        // create path and map variables
        String localVarPath = "/get-virtual-private-cloud-external-subnets";

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
    private okhttp3.Call getVirtualPrivateCloudExternalSubnetsValidateBeforeCall(
            GetVirtualPrivateCloudExternalSubnetsRequestBody
                    getVirtualPrivateCloudExternalSubnetsRequestBody,
            final ApiCallback _callback)
            throws ApiException {

        // verify the required parameter 'getVirtualPrivateCloudExternalSubnetsRequestBody' is set
        if (getVirtualPrivateCloudExternalSubnetsRequestBody == null) {
            throw new ApiException(
                    "Missing the required parameter"
                            + " 'getVirtualPrivateCloudExternalSubnetsRequestBody' when calling"
                            + " getVirtualPrivateCloudExternalSubnets(Async)");
        }

        okhttp3.Call localVarCall =
                getVirtualPrivateCloudExternalSubnetsCall(
                        getVirtualPrivateCloudExternalSubnetsRequestBody, _callback);
        return localVarCall;
    }

    /**
     * @param getVirtualPrivateCloudExternalSubnetsRequestBody (required)
     * @return List&lt;VirtualPrivateCloudExternalSubnet&gt;
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
    public List<VirtualPrivateCloudExternalSubnet> getVirtualPrivateCloudExternalSubnets(
            GetVirtualPrivateCloudExternalSubnetsRequestBody
                    getVirtualPrivateCloudExternalSubnetsRequestBody)
            throws ApiException {
        ApiResponse<List<VirtualPrivateCloudExternalSubnet>> localVarResp =
                getVirtualPrivateCloudExternalSubnetsWithHttpInfo(
                        getVirtualPrivateCloudExternalSubnetsRequestBody);
        return localVarResp.getData();
    }

    /**
     * @param getVirtualPrivateCloudExternalSubnetsRequestBody (required)
     * @return ApiResponse&lt;List&lt;VirtualPrivateCloudExternalSubnet&gt;&gt;
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
    public ApiResponse<List<VirtualPrivateCloudExternalSubnet>>
            getVirtualPrivateCloudExternalSubnetsWithHttpInfo(
                    GetVirtualPrivateCloudExternalSubnetsRequestBody
                            getVirtualPrivateCloudExternalSubnetsRequestBody)
                    throws ApiException {
        okhttp3.Call localVarCall =
                getVirtualPrivateCloudExternalSubnetsValidateBeforeCall(
                        getVirtualPrivateCloudExternalSubnetsRequestBody, null);
        Type localVarReturnType =
                new TypeToken<List<VirtualPrivateCloudExternalSubnet>>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param getVirtualPrivateCloudExternalSubnetsRequestBody (required)
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
    public okhttp3.Call getVirtualPrivateCloudExternalSubnetsAsync(
            GetVirtualPrivateCloudExternalSubnetsRequestBody
                    getVirtualPrivateCloudExternalSubnetsRequestBody,
            final ApiCallback<List<VirtualPrivateCloudExternalSubnet>> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                getVirtualPrivateCloudExternalSubnetsValidateBeforeCall(
                        getVirtualPrivateCloudExternalSubnetsRequestBody, _callback);
        Type localVarReturnType =
                new TypeToken<List<VirtualPrivateCloudExternalSubnet>>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getVirtualPrivateCloudExternalSubnetsConnection
     *
     * @param getVirtualPrivateCloudExternalSubnetsConnectionRequestBody (required)
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
    public okhttp3.Call getVirtualPrivateCloudExternalSubnetsConnectionCall(
            GetVirtualPrivateCloudExternalSubnetsConnectionRequestBody
                    getVirtualPrivateCloudExternalSubnetsConnectionRequestBody,
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

        Object localVarPostBody = getVirtualPrivateCloudExternalSubnetsConnectionRequestBody;

        // create path and map variables
        String localVarPath = "/get-virtual-private-cloud-external-subnets-connection";

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
    private okhttp3.Call getVirtualPrivateCloudExternalSubnetsConnectionValidateBeforeCall(
            GetVirtualPrivateCloudExternalSubnetsConnectionRequestBody
                    getVirtualPrivateCloudExternalSubnetsConnectionRequestBody,
            final ApiCallback _callback)
            throws ApiException {

        // verify the required parameter
        // 'getVirtualPrivateCloudExternalSubnetsConnectionRequestBody' is set
        if (getVirtualPrivateCloudExternalSubnetsConnectionRequestBody == null) {
            throw new ApiException(
                    "Missing the required parameter"
                            + " 'getVirtualPrivateCloudExternalSubnetsConnectionRequestBody' when"
                            + " calling getVirtualPrivateCloudExternalSubnetsConnection(Async)");
        }

        okhttp3.Call localVarCall =
                getVirtualPrivateCloudExternalSubnetsConnectionCall(
                        getVirtualPrivateCloudExternalSubnetsConnectionRequestBody, _callback);
        return localVarCall;
    }

    /**
     * @param getVirtualPrivateCloudExternalSubnetsConnectionRequestBody (required)
     * @return VirtualPrivateCloudExternalSubnetConnection
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
    public VirtualPrivateCloudExternalSubnetConnection
            getVirtualPrivateCloudExternalSubnetsConnection(
                    GetVirtualPrivateCloudExternalSubnetsConnectionRequestBody
                            getVirtualPrivateCloudExternalSubnetsConnectionRequestBody)
                    throws ApiException {
        ApiResponse<VirtualPrivateCloudExternalSubnetConnection> localVarResp =
                getVirtualPrivateCloudExternalSubnetsConnectionWithHttpInfo(
                        getVirtualPrivateCloudExternalSubnetsConnectionRequestBody);
        return localVarResp.getData();
    }

    /**
     * @param getVirtualPrivateCloudExternalSubnetsConnectionRequestBody (required)
     * @return ApiResponse&lt;VirtualPrivateCloudExternalSubnetConnection&gt;
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
    public ApiResponse<VirtualPrivateCloudExternalSubnetConnection>
            getVirtualPrivateCloudExternalSubnetsConnectionWithHttpInfo(
                    GetVirtualPrivateCloudExternalSubnetsConnectionRequestBody
                            getVirtualPrivateCloudExternalSubnetsConnectionRequestBody)
                    throws ApiException {
        okhttp3.Call localVarCall =
                getVirtualPrivateCloudExternalSubnetsConnectionValidateBeforeCall(
                        getVirtualPrivateCloudExternalSubnetsConnectionRequestBody, null);
        Type localVarReturnType =
                new TypeToken<VirtualPrivateCloudExternalSubnetConnection>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param getVirtualPrivateCloudExternalSubnetsConnectionRequestBody (required)
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
    public okhttp3.Call getVirtualPrivateCloudExternalSubnetsConnectionAsync(
            GetVirtualPrivateCloudExternalSubnetsConnectionRequestBody
                    getVirtualPrivateCloudExternalSubnetsConnectionRequestBody,
            final ApiCallback<VirtualPrivateCloudExternalSubnetConnection> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                getVirtualPrivateCloudExternalSubnetsConnectionValidateBeforeCall(
                        getVirtualPrivateCloudExternalSubnetsConnectionRequestBody, _callback);
        Type localVarReturnType =
                new TypeToken<VirtualPrivateCloudExternalSubnetConnection>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}

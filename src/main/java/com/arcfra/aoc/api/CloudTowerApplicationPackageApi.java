package com.arcfra.aoc.api;


import com.arcfra.aoc.ApiCallback;
import com.arcfra.aoc.ApiClient;
import com.arcfra.aoc.ApiException;
import com.arcfra.aoc.ApiResponse;
import com.arcfra.aoc.Configuration;
import com.arcfra.aoc.Pair;
import com.arcfra.aoc.model.CloudTowerApplicationPackage;
import com.arcfra.aoc.model.CloudTowerApplicationPackageConnection;
import com.arcfra.aoc.model.GetCloudTowerApplicationPackagesConnectionRequestBody;
import com.arcfra.aoc.model.GetCloudTowerApplicationPackagesRequestBody;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CloudTowerApplicationPackageApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public CloudTowerApplicationPackageApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CloudTowerApplicationPackageApi(ApiClient apiClient) {
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
     * Build call for getCloudTowerApplicationPackages
     *
     * @param getCloudTowerApplicationPackagesRequestBody (required)
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
    public okhttp3.Call getCloudTowerApplicationPackagesCall(
            GetCloudTowerApplicationPackagesRequestBody getCloudTowerApplicationPackagesRequestBody,
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

        Object localVarPostBody = getCloudTowerApplicationPackagesRequestBody;

        // create path and map variables
        String localVarPath = "/get-cloudtower-application-packages";

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
    private okhttp3.Call getCloudTowerApplicationPackagesValidateBeforeCall(
            GetCloudTowerApplicationPackagesRequestBody getCloudTowerApplicationPackagesRequestBody,
            final ApiCallback _callback)
            throws ApiException {

        // verify the required parameter 'getCloudTowerApplicationPackagesRequestBody' is set
        if (getCloudTowerApplicationPackagesRequestBody == null) {
            throw new ApiException(
                    "Missing the required parameter 'getCloudTowerApplicationPackagesRequestBody'"
                            + " when calling getCloudTowerApplicationPackages(Async)");
        }

        okhttp3.Call localVarCall =
                getCloudTowerApplicationPackagesCall(
                        getCloudTowerApplicationPackagesRequestBody, _callback);
        return localVarCall;
    }

    /**
     * @param getCloudTowerApplicationPackagesRequestBody (required)
     * @return List&lt;CloudTowerApplicationPackage&gt;
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
    public List<CloudTowerApplicationPackage> getCloudTowerApplicationPackages(
            GetCloudTowerApplicationPackagesRequestBody getCloudTowerApplicationPackagesRequestBody)
            throws ApiException {
        ApiResponse<List<CloudTowerApplicationPackage>> localVarResp =
                getCloudTowerApplicationPackagesWithHttpInfo(
                        getCloudTowerApplicationPackagesRequestBody);
        return localVarResp.getData();
    }

    /**
     * @param getCloudTowerApplicationPackagesRequestBody (required)
     * @return ApiResponse&lt;List&lt;CloudTowerApplicationPackage&gt;&gt;
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
    public ApiResponse<List<CloudTowerApplicationPackage>>
            getCloudTowerApplicationPackagesWithHttpInfo(
                    GetCloudTowerApplicationPackagesRequestBody
                            getCloudTowerApplicationPackagesRequestBody)
                    throws ApiException {
        okhttp3.Call localVarCall =
                getCloudTowerApplicationPackagesValidateBeforeCall(
                        getCloudTowerApplicationPackagesRequestBody, null);
        Type localVarReturnType = new TypeToken<List<CloudTowerApplicationPackage>>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param getCloudTowerApplicationPackagesRequestBody (required)
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
    public okhttp3.Call getCloudTowerApplicationPackagesAsync(
            GetCloudTowerApplicationPackagesRequestBody getCloudTowerApplicationPackagesRequestBody,
            final ApiCallback<List<CloudTowerApplicationPackage>> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                getCloudTowerApplicationPackagesValidateBeforeCall(
                        getCloudTowerApplicationPackagesRequestBody, _callback);
        Type localVarReturnType = new TypeToken<List<CloudTowerApplicationPackage>>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getCloudTowerApplicationPackagesConnection
     *
     * @param getCloudTowerApplicationPackagesConnectionRequestBody (required)
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
    public okhttp3.Call getCloudTowerApplicationPackagesConnectionCall(
            GetCloudTowerApplicationPackagesConnectionRequestBody
                    getCloudTowerApplicationPackagesConnectionRequestBody,
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

        Object localVarPostBody = getCloudTowerApplicationPackagesConnectionRequestBody;

        // create path and map variables
        String localVarPath = "/get-cloud-tower-application-packages-connection";

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
    private okhttp3.Call getCloudTowerApplicationPackagesConnectionValidateBeforeCall(
            GetCloudTowerApplicationPackagesConnectionRequestBody
                    getCloudTowerApplicationPackagesConnectionRequestBody,
            final ApiCallback _callback)
            throws ApiException {

        // verify the required parameter 'getCloudTowerApplicationPackagesConnectionRequestBody' is
        // set
        if (getCloudTowerApplicationPackagesConnectionRequestBody == null) {
            throw new ApiException(
                    "Missing the required parameter"
                        + " 'getCloudTowerApplicationPackagesConnectionRequestBody' when calling"
                        + " getCloudTowerApplicationPackagesConnection(Async)");
        }

        okhttp3.Call localVarCall =
                getCloudTowerApplicationPackagesConnectionCall(
                        getCloudTowerApplicationPackagesConnectionRequestBody, _callback);
        return localVarCall;
    }

    /**
     * @param getCloudTowerApplicationPackagesConnectionRequestBody (required)
     * @return CloudTowerApplicationPackageConnection
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
    public CloudTowerApplicationPackageConnection getCloudTowerApplicationPackagesConnection(
            GetCloudTowerApplicationPackagesConnectionRequestBody
                    getCloudTowerApplicationPackagesConnectionRequestBody)
            throws ApiException {
        ApiResponse<CloudTowerApplicationPackageConnection> localVarResp =
                getCloudTowerApplicationPackagesConnectionWithHttpInfo(
                        getCloudTowerApplicationPackagesConnectionRequestBody);
        return localVarResp.getData();
    }

    /**
     * @param getCloudTowerApplicationPackagesConnectionRequestBody (required)
     * @return ApiResponse&lt;CloudTowerApplicationPackageConnection&gt;
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
    public ApiResponse<CloudTowerApplicationPackageConnection>
            getCloudTowerApplicationPackagesConnectionWithHttpInfo(
                    GetCloudTowerApplicationPackagesConnectionRequestBody
                            getCloudTowerApplicationPackagesConnectionRequestBody)
                    throws ApiException {
        okhttp3.Call localVarCall =
                getCloudTowerApplicationPackagesConnectionValidateBeforeCall(
                        getCloudTowerApplicationPackagesConnectionRequestBody, null);
        Type localVarReturnType =
                new TypeToken<CloudTowerApplicationPackageConnection>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param getCloudTowerApplicationPackagesConnectionRequestBody (required)
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
    public okhttp3.Call getCloudTowerApplicationPackagesConnectionAsync(
            GetCloudTowerApplicationPackagesConnectionRequestBody
                    getCloudTowerApplicationPackagesConnectionRequestBody,
            final ApiCallback<CloudTowerApplicationPackageConnection> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                getCloudTowerApplicationPackagesConnectionValidateBeforeCall(
                        getCloudTowerApplicationPackagesConnectionRequestBody, _callback);
        Type localVarReturnType =
                new TypeToken<CloudTowerApplicationPackageConnection>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}

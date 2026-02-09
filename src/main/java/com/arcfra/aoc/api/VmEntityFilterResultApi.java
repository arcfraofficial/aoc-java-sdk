package com.arcfra.aoc.api;


import com.arcfra.aoc.ApiCallback;
import com.arcfra.aoc.ApiClient;
import com.arcfra.aoc.ApiException;
import com.arcfra.aoc.ApiResponse;
import com.arcfra.aoc.Configuration;
import com.arcfra.aoc.Pair;
import com.arcfra.aoc.model.GetVmEntityFilterResultsConnectionRequestBody;
import com.arcfra.aoc.model.GetVmEntityFilterResultsRequestBody;
import com.arcfra.aoc.model.VmEntityFilterResult;
import com.arcfra.aoc.model.VmEntityFilterResultConnection;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VmEntityFilterResultApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public VmEntityFilterResultApi() {
        this(Configuration.getDefaultApiClient());
    }

    public VmEntityFilterResultApi(ApiClient apiClient) {
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
     * Build call for getVmEntityFilterResults
     *
     * @param getVmEntityFilterResultsRequestBody (required)
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
    public okhttp3.Call getVmEntityFilterResultsCall(
            GetVmEntityFilterResultsRequestBody getVmEntityFilterResultsRequestBody,
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

        Object localVarPostBody = getVmEntityFilterResultsRequestBody;

        // create path and map variables
        String localVarPath = "/get-vm-entity-filter-results";

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
    private okhttp3.Call getVmEntityFilterResultsValidateBeforeCall(
            GetVmEntityFilterResultsRequestBody getVmEntityFilterResultsRequestBody,
            final ApiCallback _callback)
            throws ApiException {

        // verify the required parameter 'getVmEntityFilterResultsRequestBody' is set
        if (getVmEntityFilterResultsRequestBody == null) {
            throw new ApiException(
                    "Missing the required parameter 'getVmEntityFilterResultsRequestBody' when"
                            + " calling getVmEntityFilterResults(Async)");
        }

        okhttp3.Call localVarCall =
                getVmEntityFilterResultsCall(getVmEntityFilterResultsRequestBody, _callback);
        return localVarCall;
    }

    /**
     * @param getVmEntityFilterResultsRequestBody (required)
     * @return List&lt;VmEntityFilterResult&gt;
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
    public List<VmEntityFilterResult> getVmEntityFilterResults(
            GetVmEntityFilterResultsRequestBody getVmEntityFilterResultsRequestBody)
            throws ApiException {
        ApiResponse<List<VmEntityFilterResult>> localVarResp =
                getVmEntityFilterResultsWithHttpInfo(getVmEntityFilterResultsRequestBody);
        return localVarResp.getData();
    }

    /**
     * @param getVmEntityFilterResultsRequestBody (required)
     * @return ApiResponse&lt;List&lt;VmEntityFilterResult&gt;&gt;
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
    public ApiResponse<List<VmEntityFilterResult>> getVmEntityFilterResultsWithHttpInfo(
            GetVmEntityFilterResultsRequestBody getVmEntityFilterResultsRequestBody)
            throws ApiException {
        okhttp3.Call localVarCall =
                getVmEntityFilterResultsValidateBeforeCall(
                        getVmEntityFilterResultsRequestBody, null);
        Type localVarReturnType = new TypeToken<List<VmEntityFilterResult>>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param getVmEntityFilterResultsRequestBody (required)
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
    public okhttp3.Call getVmEntityFilterResultsAsync(
            GetVmEntityFilterResultsRequestBody getVmEntityFilterResultsRequestBody,
            final ApiCallback<List<VmEntityFilterResult>> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                getVmEntityFilterResultsValidateBeforeCall(
                        getVmEntityFilterResultsRequestBody, _callback);
        Type localVarReturnType = new TypeToken<List<VmEntityFilterResult>>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getVmEntityFilterResultsConnection
     *
     * @param getVmEntityFilterResultsConnectionRequestBody (required)
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
    public okhttp3.Call getVmEntityFilterResultsConnectionCall(
            GetVmEntityFilterResultsConnectionRequestBody
                    getVmEntityFilterResultsConnectionRequestBody,
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

        Object localVarPostBody = getVmEntityFilterResultsConnectionRequestBody;

        // create path and map variables
        String localVarPath = "/get-vm-entity-filter-results-connection";

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
    private okhttp3.Call getVmEntityFilterResultsConnectionValidateBeforeCall(
            GetVmEntityFilterResultsConnectionRequestBody
                    getVmEntityFilterResultsConnectionRequestBody,
            final ApiCallback _callback)
            throws ApiException {

        // verify the required parameter 'getVmEntityFilterResultsConnectionRequestBody' is set
        if (getVmEntityFilterResultsConnectionRequestBody == null) {
            throw new ApiException(
                    "Missing the required parameter"
                            + " 'getVmEntityFilterResultsConnectionRequestBody' when calling"
                            + " getVmEntityFilterResultsConnection(Async)");
        }

        okhttp3.Call localVarCall =
                getVmEntityFilterResultsConnectionCall(
                        getVmEntityFilterResultsConnectionRequestBody, _callback);
        return localVarCall;
    }

    /**
     * @param getVmEntityFilterResultsConnectionRequestBody (required)
     * @return VmEntityFilterResultConnection
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
    public VmEntityFilterResultConnection getVmEntityFilterResultsConnection(
            GetVmEntityFilterResultsConnectionRequestBody
                    getVmEntityFilterResultsConnectionRequestBody)
            throws ApiException {
        ApiResponse<VmEntityFilterResultConnection> localVarResp =
                getVmEntityFilterResultsConnectionWithHttpInfo(
                        getVmEntityFilterResultsConnectionRequestBody);
        return localVarResp.getData();
    }

    /**
     * @param getVmEntityFilterResultsConnectionRequestBody (required)
     * @return ApiResponse&lt;VmEntityFilterResultConnection&gt;
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
    public ApiResponse<VmEntityFilterResultConnection>
            getVmEntityFilterResultsConnectionWithHttpInfo(
                    GetVmEntityFilterResultsConnectionRequestBody
                            getVmEntityFilterResultsConnectionRequestBody)
                    throws ApiException {
        okhttp3.Call localVarCall =
                getVmEntityFilterResultsConnectionValidateBeforeCall(
                        getVmEntityFilterResultsConnectionRequestBody, null);
        Type localVarReturnType = new TypeToken<VmEntityFilterResultConnection>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param getVmEntityFilterResultsConnectionRequestBody (required)
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
    public okhttp3.Call getVmEntityFilterResultsConnectionAsync(
            GetVmEntityFilterResultsConnectionRequestBody
                    getVmEntityFilterResultsConnectionRequestBody,
            final ApiCallback<VmEntityFilterResultConnection> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                getVmEntityFilterResultsConnectionValidateBeforeCall(
                        getVmEntityFilterResultsConnectionRequestBody, _callback);
        Type localVarReturnType = new TypeToken<VmEntityFilterResultConnection>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}

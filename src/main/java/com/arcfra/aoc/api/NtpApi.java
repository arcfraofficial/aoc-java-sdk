package com.arcfra.aoc.api;


import com.arcfra.aoc.ApiCallback;
import com.arcfra.aoc.ApiClient;
import com.arcfra.aoc.ApiException;
import com.arcfra.aoc.ApiResponse;
import com.arcfra.aoc.Configuration;
import com.arcfra.aoc.Pair;
import com.arcfra.aoc.model.NtpServiceUrl;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NtpApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public NtpApi() {
        this(Configuration.getDefaultApiClient());
    }

    public NtpApi(ApiClient apiClient) {
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
     * Build call for getNtpServiceUrl
     *
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
    public okhttp3.Call getNtpServiceUrlCall(final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/get-ntp-service-url";

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

        final String[] localVarContentTypes = {};

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
    private okhttp3.Call getNtpServiceUrlValidateBeforeCall(final ApiCallback _callback)
            throws ApiException {

        okhttp3.Call localVarCall = getNtpServiceUrlCall(_callback);
        return localVarCall;
    }

    /**
     * @return NtpServiceUrl
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
    public NtpServiceUrl getNtpServiceUrl() throws ApiException {
        ApiResponse<NtpServiceUrl> localVarResp = getNtpServiceUrlWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * @return ApiResponse&lt;NtpServiceUrl&gt;
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
    public ApiResponse<NtpServiceUrl> getNtpServiceUrlWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = getNtpServiceUrlValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<NtpServiceUrl>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
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
    public okhttp3.Call getNtpServiceUrlAsync(final ApiCallback<NtpServiceUrl> _callback)
            throws ApiException {

        okhttp3.Call localVarCall = getNtpServiceUrlValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<NtpServiceUrl>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}

package com.arcfra.aoc.api;


import com.arcfra.aoc.ApiCallback;
import com.arcfra.aoc.ApiClient;
import com.arcfra.aoc.ApiException;
import com.arcfra.aoc.ApiResponse;
import com.arcfra.aoc.Configuration;
import com.arcfra.aoc.Pair;
import com.arcfra.aoc.model.GetSvtImagesConnectionRequestBody;
import com.arcfra.aoc.model.GetSvtImagesRequestBody;
import com.arcfra.aoc.model.SvtImage;
import com.arcfra.aoc.model.SvtImageConnection;
import com.arcfra.aoc.model.UploadTask;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SvtImageApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public SvtImageApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SvtImageApi(ApiClient apiClient) {
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
     * Build call for getSvtImages
     *
     * @param getSvtImagesRequestBody (required)
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
    public okhttp3.Call getSvtImagesCall(
            GetSvtImagesRequestBody getSvtImagesRequestBody, final ApiCallback _callback)
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

        Object localVarPostBody = getSvtImagesRequestBody;

        // create path and map variables
        String localVarPath = "/get-svt-images";

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
    private okhttp3.Call getSvtImagesValidateBeforeCall(
            GetSvtImagesRequestBody getSvtImagesRequestBody, final ApiCallback _callback)
            throws ApiException {

        // verify the required parameter 'getSvtImagesRequestBody' is set
        if (getSvtImagesRequestBody == null) {
            throw new ApiException(
                    "Missing the required parameter 'getSvtImagesRequestBody' when calling"
                            + " getSvtImages(Async)");
        }

        okhttp3.Call localVarCall = getSvtImagesCall(getSvtImagesRequestBody, _callback);
        return localVarCall;
    }

    /**
     * @param getSvtImagesRequestBody (required)
     * @return List&lt;SvtImage&gt;
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
    public List<SvtImage> getSvtImages(GetSvtImagesRequestBody getSvtImagesRequestBody)
            throws ApiException {
        ApiResponse<List<SvtImage>> localVarResp =
                getSvtImagesWithHttpInfo(getSvtImagesRequestBody);
        return localVarResp.getData();
    }

    /**
     * @param getSvtImagesRequestBody (required)
     * @return ApiResponse&lt;List&lt;SvtImage&gt;&gt;
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
    public ApiResponse<List<SvtImage>> getSvtImagesWithHttpInfo(
            GetSvtImagesRequestBody getSvtImagesRequestBody) throws ApiException {
        okhttp3.Call localVarCall = getSvtImagesValidateBeforeCall(getSvtImagesRequestBody, null);
        Type localVarReturnType = new TypeToken<List<SvtImage>>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param getSvtImagesRequestBody (required)
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
    public okhttp3.Call getSvtImagesAsync(
            GetSvtImagesRequestBody getSvtImagesRequestBody,
            final ApiCallback<List<SvtImage>> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                getSvtImagesValidateBeforeCall(getSvtImagesRequestBody, _callback);
        Type localVarReturnType = new TypeToken<List<SvtImage>>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getSvtImagesConnection
     *
     * @param getSvtImagesConnectionRequestBody (required)
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
    public okhttp3.Call getSvtImagesConnectionCall(
            GetSvtImagesConnectionRequestBody getSvtImagesConnectionRequestBody,
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

        Object localVarPostBody = getSvtImagesConnectionRequestBody;

        // create path and map variables
        String localVarPath = "/get-svt-images-connection";

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
    private okhttp3.Call getSvtImagesConnectionValidateBeforeCall(
            GetSvtImagesConnectionRequestBody getSvtImagesConnectionRequestBody,
            final ApiCallback _callback)
            throws ApiException {

        // verify the required parameter 'getSvtImagesConnectionRequestBody' is set
        if (getSvtImagesConnectionRequestBody == null) {
            throw new ApiException(
                    "Missing the required parameter 'getSvtImagesConnectionRequestBody' when"
                            + " calling getSvtImagesConnection(Async)");
        }

        okhttp3.Call localVarCall =
                getSvtImagesConnectionCall(getSvtImagesConnectionRequestBody, _callback);
        return localVarCall;
    }

    /**
     * @param getSvtImagesConnectionRequestBody (required)
     * @return SvtImageConnection
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
    public SvtImageConnection getSvtImagesConnection(
            GetSvtImagesConnectionRequestBody getSvtImagesConnectionRequestBody)
            throws ApiException {
        ApiResponse<SvtImageConnection> localVarResp =
                getSvtImagesConnectionWithHttpInfo(getSvtImagesConnectionRequestBody);
        return localVarResp.getData();
    }

    /**
     * @param getSvtImagesConnectionRequestBody (required)
     * @return ApiResponse&lt;SvtImageConnection&gt;
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
    public ApiResponse<SvtImageConnection> getSvtImagesConnectionWithHttpInfo(
            GetSvtImagesConnectionRequestBody getSvtImagesConnectionRequestBody)
            throws ApiException {
        okhttp3.Call localVarCall =
                getSvtImagesConnectionValidateBeforeCall(getSvtImagesConnectionRequestBody, null);
        Type localVarReturnType = new TypeToken<SvtImageConnection>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param getSvtImagesConnectionRequestBody (required)
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
    public okhttp3.Call getSvtImagesConnectionAsync(
            GetSvtImagesConnectionRequestBody getSvtImagesConnectionRequestBody,
            final ApiCallback<SvtImageConnection> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                getSvtImagesConnectionValidateBeforeCall(
                        getSvtImagesConnectionRequestBody, _callback);
        Type localVarReturnType = new TypeToken<SvtImageConnection>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for uploadSvtImage
     *
     * @param _file (required)
     * @param clusterId (optional)
     * @param name (optional)
     * @param size (optional)
     * @param sizeUnit (optional)
     * @param version (optional)
     * @param uploadTaskId (optional)
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
    public okhttp3.Call uploadSvtImageCall(
            byte[] _file,
            String clusterId,
            String name,
            String size,
            String sizeUnit,
            String version,
            String uploadTaskId,
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

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/upload-svt-image";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (_file != null) {
            localVarFormParams.put("file", _file);
        }

        if (clusterId != null) {
            localVarFormParams.put("cluster_id", clusterId);
        }

        if (name != null) {
            localVarFormParams.put("name", name);
        }

        if (size != null) {
            localVarFormParams.put("size", size);
        }

        if (sizeUnit != null) {
            localVarFormParams.put("size_unit", sizeUnit);
        }

        if (version != null) {
            localVarFormParams.put("version", version);
        }

        if (uploadTaskId != null) {
            localVarFormParams.put("upload_task_id", uploadTaskId);
        }

        final String[] localVarAccepts = {"application/json"};
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {"multipart/form-data"};
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
    private okhttp3.Call uploadSvtImageValidateBeforeCall(
            byte[] _file,
            String clusterId,
            String name,
            String size,
            String sizeUnit,
            String version,
            String uploadTaskId,
            final ApiCallback _callback)
            throws ApiException {

        // verify the required parameter '_file' is set
        if (_file == null) {
            throw new ApiException(
                    "Missing the required parameter '_file' when calling uploadSvtImage(Async)");
        }

        okhttp3.Call localVarCall =
                uploadSvtImageCall(
                        _file, clusterId, name, size, sizeUnit, version, uploadTaskId, _callback);
        return localVarCall;
    }

    /**
     * @param _file (required)
     * @param clusterId (optional)
     * @param name (optional)
     * @param size (optional)
     * @param sizeUnit (optional)
     * @param version (optional)
     * @param uploadTaskId (optional)
     * @return List&lt;UploadTask&gt;
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
    public List<UploadTask> uploadSvtImage(
            byte[] _file,
            String clusterId,
            String name,
            String size,
            String sizeUnit,
            String version,
            String uploadTaskId)
            throws ApiException {
        ApiResponse<List<UploadTask>> localVarResp =
                uploadSvtImageWithHttpInfo(
                        _file, clusterId, name, size, sizeUnit, version, uploadTaskId);
        return localVarResp.getData();
    }

    /**
     * @param _file (required)
     * @param clusterId (optional)
     * @param name (optional)
     * @param size (optional)
     * @param sizeUnit (optional)
     * @param version (optional)
     * @param uploadTaskId (optional)
     * @return ApiResponse&lt;List&lt;UploadTask&gt;&gt;
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
    public ApiResponse<List<UploadTask>> uploadSvtImageWithHttpInfo(
            byte[] _file,
            String clusterId,
            String name,
            String size,
            String sizeUnit,
            String version,
            String uploadTaskId)
            throws ApiException {
        okhttp3.Call localVarCall =
                uploadSvtImageValidateBeforeCall(
                        _file, clusterId, name, size, sizeUnit, version, uploadTaskId, null);
        Type localVarReturnType = new TypeToken<List<UploadTask>>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param _file (required)
     * @param clusterId (optional)
     * @param name (optional)
     * @param size (optional)
     * @param sizeUnit (optional)
     * @param version (optional)
     * @param uploadTaskId (optional)
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
    public okhttp3.Call uploadSvtImageAsync(
            byte[] _file,
            String clusterId,
            String name,
            String size,
            String sizeUnit,
            String version,
            String uploadTaskId,
            final ApiCallback<List<UploadTask>> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                uploadSvtImageValidateBeforeCall(
                        _file, clusterId, name, size, sizeUnit, version, uploadTaskId, _callback);
        Type localVarReturnType = new TypeToken<List<UploadTask>>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}

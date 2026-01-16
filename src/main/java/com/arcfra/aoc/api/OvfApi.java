package com.arcfra.aoc.api;


import com.arcfra.aoc.ApiCallback;
import com.arcfra.aoc.ApiClient;
import com.arcfra.aoc.ApiException;
import com.arcfra.aoc.ApiResponse;
import com.arcfra.aoc.Configuration;
import com.arcfra.aoc.Pair;
import com.arcfra.aoc.model.ExportFileDownloadLinks;
import com.arcfra.aoc.model.GetExportFileDownloadLinksParams;
import com.arcfra.aoc.model.ParsedOVF;
import com.arcfra.aoc.model.UploadTask;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OvfApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public OvfApi() {
        this(Configuration.getDefaultApiClient());
    }

    public OvfApi(ApiClient apiClient) {
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
     * Build call for getExportFileDownloadLinks
     *
     * @param getExportFileDownloadLinksParams (required)
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
    public okhttp3.Call getExportFileDownloadLinksCall(
            GetExportFileDownloadLinksParams getExportFileDownloadLinksParams,
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

        Object localVarPostBody = getExportFileDownloadLinksParams;

        // create path and map variables
        String localVarPath = "/get-export-file-download-links";

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
    private okhttp3.Call getExportFileDownloadLinksValidateBeforeCall(
            GetExportFileDownloadLinksParams getExportFileDownloadLinksParams,
            final ApiCallback _callback)
            throws ApiException {

        // verify the required parameter 'getExportFileDownloadLinksParams' is set
        if (getExportFileDownloadLinksParams == null) {
            throw new ApiException(
                    "Missing the required parameter 'getExportFileDownloadLinksParams' when"
                            + " calling getExportFileDownloadLinks(Async)");
        }

        okhttp3.Call localVarCall =
                getExportFileDownloadLinksCall(getExportFileDownloadLinksParams, _callback);
        return localVarCall;
    }

    /**
     * @param getExportFileDownloadLinksParams (required)
     * @return List&lt;ExportFileDownloadLinks&gt;
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
    public List<ExportFileDownloadLinks> getExportFileDownloadLinks(
            GetExportFileDownloadLinksParams getExportFileDownloadLinksParams) throws ApiException {
        ApiResponse<List<ExportFileDownloadLinks>> localVarResp =
                getExportFileDownloadLinksWithHttpInfo(getExportFileDownloadLinksParams);
        return localVarResp.getData();
    }

    /**
     * @param getExportFileDownloadLinksParams (required)
     * @return ApiResponse&lt;List&lt;ExportFileDownloadLinks&gt;&gt;
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
    public ApiResponse<List<ExportFileDownloadLinks>> getExportFileDownloadLinksWithHttpInfo(
            GetExportFileDownloadLinksParams getExportFileDownloadLinksParams) throws ApiException {
        okhttp3.Call localVarCall =
                getExportFileDownloadLinksValidateBeforeCall(
                        getExportFileDownloadLinksParams, null);
        Type localVarReturnType = new TypeToken<List<ExportFileDownloadLinks>>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param getExportFileDownloadLinksParams (required)
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
    public okhttp3.Call getExportFileDownloadLinksAsync(
            GetExportFileDownloadLinksParams getExportFileDownloadLinksParams,
            final ApiCallback<List<ExportFileDownloadLinks>> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                getExportFileDownloadLinksValidateBeforeCall(
                        getExportFileDownloadLinksParams, _callback);
        Type localVarReturnType = new TypeToken<List<ExportFileDownloadLinks>>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for parseOvf
     *
     * @param _file (required)
     * @param clusterId (required)
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
    public okhttp3.Call parseOvfCall(byte[] _file, String clusterId, final ApiCallback _callback)
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
        String localVarPath = "/parse-ovf";

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
    private okhttp3.Call parseOvfValidateBeforeCall(
            byte[] _file, String clusterId, final ApiCallback _callback) throws ApiException {

        // verify the required parameter '_file' is set
        if (_file == null) {
            throw new ApiException(
                    "Missing the required parameter '_file' when calling parseOvf(Async)");
        }

        // verify the required parameter 'clusterId' is set
        if (clusterId == null) {
            throw new ApiException(
                    "Missing the required parameter 'clusterId' when calling parseOvf(Async)");
        }

        okhttp3.Call localVarCall = parseOvfCall(_file, clusterId, _callback);
        return localVarCall;
    }

    /**
     * @param _file (required)
     * @param clusterId (required)
     * @return ParsedOVF
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
    public ParsedOVF parseOvf(byte[] _file, String clusterId) throws ApiException {
        ApiResponse<ParsedOVF> localVarResp = parseOvfWithHttpInfo(_file, clusterId);
        return localVarResp.getData();
    }

    /**
     * @param _file (required)
     * @param clusterId (required)
     * @return ApiResponse&lt;ParsedOVF&gt;
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
    public ApiResponse<ParsedOVF> parseOvfWithHttpInfo(byte[] _file, String clusterId)
            throws ApiException {
        okhttp3.Call localVarCall = parseOvfValidateBeforeCall(_file, clusterId, null);
        Type localVarReturnType = new TypeToken<ParsedOVF>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param _file (required)
     * @param clusterId (required)
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
    public okhttp3.Call parseOvfAsync(
            byte[] _file, String clusterId, final ApiCallback<ParsedOVF> _callback)
            throws ApiException {

        okhttp3.Call localVarCall = parseOvfValidateBeforeCall(_file, clusterId, _callback);
        Type localVarReturnType = new TypeToken<ParsedOVF>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for uploadElfFile
     *
     * @param _file (required)
     * @param clusterId (optional)
     * @param name (optional)
     * @param size (optional)
     * @param sizeUnit (optional)
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
    public okhttp3.Call uploadElfFileCall(
            byte[] _file,
            String clusterId,
            String name,
            String size,
            String sizeUnit,
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
        String localVarPath = "/upload-elf-file";

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
    private okhttp3.Call uploadElfFileValidateBeforeCall(
            byte[] _file,
            String clusterId,
            String name,
            String size,
            String sizeUnit,
            String uploadTaskId,
            final ApiCallback _callback)
            throws ApiException {

        // verify the required parameter '_file' is set
        if (_file == null) {
            throw new ApiException(
                    "Missing the required parameter '_file' when calling uploadElfFile(Async)");
        }

        okhttp3.Call localVarCall =
                uploadElfFileCall(_file, clusterId, name, size, sizeUnit, uploadTaskId, _callback);
        return localVarCall;
    }

    /**
     * @param _file (required)
     * @param clusterId (optional)
     * @param name (optional)
     * @param size (optional)
     * @param sizeUnit (optional)
     * @param uploadTaskId (optional)
     * @return UploadTask
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
    public UploadTask uploadElfFile(
            byte[] _file,
            String clusterId,
            String name,
            String size,
            String sizeUnit,
            String uploadTaskId)
            throws ApiException {
        ApiResponse<UploadTask> localVarResp =
                uploadElfFileWithHttpInfo(_file, clusterId, name, size, sizeUnit, uploadTaskId);
        return localVarResp.getData();
    }

    /**
     * @param _file (required)
     * @param clusterId (optional)
     * @param name (optional)
     * @param size (optional)
     * @param sizeUnit (optional)
     * @param uploadTaskId (optional)
     * @return ApiResponse&lt;UploadTask&gt;
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
    public ApiResponse<UploadTask> uploadElfFileWithHttpInfo(
            byte[] _file,
            String clusterId,
            String name,
            String size,
            String sizeUnit,
            String uploadTaskId)
            throws ApiException {
        okhttp3.Call localVarCall =
                uploadElfFileValidateBeforeCall(
                        _file, clusterId, name, size, sizeUnit, uploadTaskId, null);
        Type localVarReturnType = new TypeToken<UploadTask>() {}.getType();
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
    public okhttp3.Call uploadElfFileAsync(
            byte[] _file,
            String clusterId,
            String name,
            String size,
            String sizeUnit,
            String uploadTaskId,
            final ApiCallback<UploadTask> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                uploadElfFileValidateBeforeCall(
                        _file, clusterId, name, size, sizeUnit, uploadTaskId, _callback);
        Type localVarReturnType = new TypeToken<UploadTask>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}

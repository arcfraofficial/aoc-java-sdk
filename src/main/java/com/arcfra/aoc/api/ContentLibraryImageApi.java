package com.arcfra.aoc.api;


import com.arcfra.aoc.ApiCallback;
import com.arcfra.aoc.ApiClient;
import com.arcfra.aoc.ApiException;
import com.arcfra.aoc.ApiResponse;
import com.arcfra.aoc.Configuration;
import com.arcfra.aoc.Pair;
import com.arcfra.aoc.model.ContentLibraryImage;
import com.arcfra.aoc.model.ContentLibraryImageConnection;
import com.arcfra.aoc.model.ContentLibraryImageDeletionParams;
import com.arcfra.aoc.model.ContentLibraryImageImportParams;
import com.arcfra.aoc.model.ContentLibraryImageUpdationClusterParams;
import com.arcfra.aoc.model.ContentLibraryImageUpdationParams;
import com.arcfra.aoc.model.GetContentLibraryImagesConnectionRequestBody;
import com.arcfra.aoc.model.GetContentLibraryImagesRequestBody;
import com.arcfra.aoc.model.UploadTask;
import com.arcfra.aoc.model.WithTaskContentLibraryImage;
import com.arcfra.aoc.model.WithTaskDeleteContentLibraryImage;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ContentLibraryImageApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ContentLibraryImageApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ContentLibraryImageApi(ApiClient apiClient) {
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
     * Build call for createContentLibraryImage
     *
     * @param _file (required)
     * @param clusters (required)
     * @param name (optional)
     * @param size (optional)
     * @param sizeUnit (optional)
     * @param description (optional)
     * @param uploadTaskId (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td>  </td><td>  * CommonHeader -  <br>  </td></tr>
     * <tr><td> 304 </td><td> Not modified </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Bad request </td><td>  * CommonHeader -  <br>  </td></tr>
     * <tr><td> 404 </td><td> Not found </td><td>  * CommonHeader -  <br>  </td></tr>
     * <tr><td> 500 </td><td> Server error </td><td>  * CommonHeader -  <br>  </td></tr>
     * </table>
     */
    public okhttp3.Call createContentLibraryImageCall(
            byte[] _file,
            String clusters,
            String name,
            String size,
            String sizeUnit,
            String description,
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
        String localVarPath = "/upload-content-library-image";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (_file != null) {
            localVarFormParams.put("file", _file);
        }

        if (clusters != null) {
            localVarFormParams.put("clusters", clusters);
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

        if (description != null) {
            localVarFormParams.put("description", description);
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
    private okhttp3.Call createContentLibraryImageValidateBeforeCall(
            byte[] _file,
            String clusters,
            String name,
            String size,
            String sizeUnit,
            String description,
            String uploadTaskId,
            final ApiCallback _callback)
            throws ApiException {

        // verify the required parameter '_file' is set
        if (_file == null) {
            throw new ApiException(
                    "Missing the required parameter '_file' when calling"
                            + " createContentLibraryImage(Async)");
        }

        // verify the required parameter 'clusters' is set
        if (clusters == null) {
            throw new ApiException(
                    "Missing the required parameter 'clusters' when calling"
                            + " createContentLibraryImage(Async)");
        }

        okhttp3.Call localVarCall =
                createContentLibraryImageCall(
                        _file,
                        clusters,
                        name,
                        size,
                        sizeUnit,
                        description,
                        uploadTaskId,
                        _callback);
        return localVarCall;
    }

    /**
     * @param _file (required)
     * @param clusters (required)
     * @param name (optional)
     * @param size (optional)
     * @param sizeUnit (optional)
     * @param description (optional)
     * @param uploadTaskId (optional)
     * @return List&lt;UploadTask&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td>  </td><td>  * CommonHeader -  <br>  </td></tr>
     * <tr><td> 304 </td><td> Not modified </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Bad request </td><td>  * CommonHeader -  <br>  </td></tr>
     * <tr><td> 404 </td><td> Not found </td><td>  * CommonHeader -  <br>  </td></tr>
     * <tr><td> 500 </td><td> Server error </td><td>  * CommonHeader -  <br>  </td></tr>
     * </table>
     */
    public List<UploadTask> createContentLibraryImage(
            byte[] _file,
            String clusters,
            String name,
            String size,
            String sizeUnit,
            String description,
            String uploadTaskId)
            throws ApiException {
        ApiResponse<List<UploadTask>> localVarResp =
                createContentLibraryImageWithHttpInfo(
                        _file, clusters, name, size, sizeUnit, description, uploadTaskId);
        return localVarResp.getData();
    }

    /**
     * @param _file (required)
     * @param clusters (required)
     * @param name (optional)
     * @param size (optional)
     * @param sizeUnit (optional)
     * @param description (optional)
     * @param uploadTaskId (optional)
     * @return ApiResponse&lt;List&lt;UploadTask&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td>  </td><td>  * CommonHeader -  <br>  </td></tr>
     * <tr><td> 304 </td><td> Not modified </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Bad request </td><td>  * CommonHeader -  <br>  </td></tr>
     * <tr><td> 404 </td><td> Not found </td><td>  * CommonHeader -  <br>  </td></tr>
     * <tr><td> 500 </td><td> Server error </td><td>  * CommonHeader -  <br>  </td></tr>
     * </table>
     */
    public ApiResponse<List<UploadTask>> createContentLibraryImageWithHttpInfo(
            byte[] _file,
            String clusters,
            String name,
            String size,
            String sizeUnit,
            String description,
            String uploadTaskId)
            throws ApiException {
        okhttp3.Call localVarCall =
                createContentLibraryImageValidateBeforeCall(
                        _file, clusters, name, size, sizeUnit, description, uploadTaskId, null);
        Type localVarReturnType = new TypeToken<List<UploadTask>>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param _file (required)
     * @param clusters (required)
     * @param name (optional)
     * @param size (optional)
     * @param sizeUnit (optional)
     * @param description (optional)
     * @param uploadTaskId (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body
     *     object
     * @http.response.details
     *     <table summary="Response Details" border="1">
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td>  </td><td>  * CommonHeader -  <br>  </td></tr>
     * <tr><td> 304 </td><td> Not modified </td><td>  -  </td></tr>
     * <tr><td> 400 </td><td> Bad request </td><td>  * CommonHeader -  <br>  </td></tr>
     * <tr><td> 404 </td><td> Not found </td><td>  * CommonHeader -  <br>  </td></tr>
     * <tr><td> 500 </td><td> Server error </td><td>  * CommonHeader -  <br>  </td></tr>
     * </table>
     */
    public okhttp3.Call createContentLibraryImageAsync(
            byte[] _file,
            String clusters,
            String name,
            String size,
            String sizeUnit,
            String description,
            String uploadTaskId,
            final ApiCallback<List<UploadTask>> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                createContentLibraryImageValidateBeforeCall(
                        _file,
                        clusters,
                        name,
                        size,
                        sizeUnit,
                        description,
                        uploadTaskId,
                        _callback);
        Type localVarReturnType = new TypeToken<List<UploadTask>>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteContentLibraryImage
     *
     * @param contentLibraryImageDeletionParams (required)
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
    public okhttp3.Call deleteContentLibraryImageCall(
            ContentLibraryImageDeletionParams contentLibraryImageDeletionParams,
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

        Object localVarPostBody = contentLibraryImageDeletionParams;

        // create path and map variables
        String localVarPath = "/delete-content-library-image";

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
    private okhttp3.Call deleteContentLibraryImageValidateBeforeCall(
            ContentLibraryImageDeletionParams contentLibraryImageDeletionParams,
            final ApiCallback _callback)
            throws ApiException {

        // verify the required parameter 'contentLibraryImageDeletionParams' is set
        if (contentLibraryImageDeletionParams == null) {
            throw new ApiException(
                    "Missing the required parameter 'contentLibraryImageDeletionParams' when"
                            + " calling deleteContentLibraryImage(Async)");
        }

        okhttp3.Call localVarCall =
                deleteContentLibraryImageCall(contentLibraryImageDeletionParams, _callback);
        return localVarCall;
    }

    /**
     * @param contentLibraryImageDeletionParams (required)
     * @return List&lt;WithTaskDeleteContentLibraryImage&gt;
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
    public List<WithTaskDeleteContentLibraryImage> deleteContentLibraryImage(
            ContentLibraryImageDeletionParams contentLibraryImageDeletionParams)
            throws ApiException {
        ApiResponse<List<WithTaskDeleteContentLibraryImage>> localVarResp =
                deleteContentLibraryImageWithHttpInfo(contentLibraryImageDeletionParams);
        return localVarResp.getData();
    }

    /**
     * @param contentLibraryImageDeletionParams (required)
     * @return ApiResponse&lt;List&lt;WithTaskDeleteContentLibraryImage&gt;&gt;
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
    public ApiResponse<List<WithTaskDeleteContentLibraryImage>>
            deleteContentLibraryImageWithHttpInfo(
                    ContentLibraryImageDeletionParams contentLibraryImageDeletionParams)
                    throws ApiException {
        okhttp3.Call localVarCall =
                deleteContentLibraryImageValidateBeforeCall(
                        contentLibraryImageDeletionParams, null);
        Type localVarReturnType =
                new TypeToken<List<WithTaskDeleteContentLibraryImage>>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param contentLibraryImageDeletionParams (required)
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
    public okhttp3.Call deleteContentLibraryImageAsync(
            ContentLibraryImageDeletionParams contentLibraryImageDeletionParams,
            final ApiCallback<List<WithTaskDeleteContentLibraryImage>> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                deleteContentLibraryImageValidateBeforeCall(
                        contentLibraryImageDeletionParams, _callback);
        Type localVarReturnType =
                new TypeToken<List<WithTaskDeleteContentLibraryImage>>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for distributeContentLibraryImageClusters
     *
     * @param contentLibraryImageUpdationClusterParams (required)
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
    public okhttp3.Call distributeContentLibraryImageClustersCall(
            ContentLibraryImageUpdationClusterParams contentLibraryImageUpdationClusterParams,
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

        Object localVarPostBody = contentLibraryImageUpdationClusterParams;

        // create path and map variables
        String localVarPath = "/distribute-content-library-image-clusters";

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
    private okhttp3.Call distributeContentLibraryImageClustersValidateBeforeCall(
            ContentLibraryImageUpdationClusterParams contentLibraryImageUpdationClusterParams,
            final ApiCallback _callback)
            throws ApiException {

        // verify the required parameter 'contentLibraryImageUpdationClusterParams' is set
        if (contentLibraryImageUpdationClusterParams == null) {
            throw new ApiException(
                    "Missing the required parameter 'contentLibraryImageUpdationClusterParams'"
                            + " when calling distributeContentLibraryImageClusters(Async)");
        }

        okhttp3.Call localVarCall =
                distributeContentLibraryImageClustersCall(
                        contentLibraryImageUpdationClusterParams, _callback);
        return localVarCall;
    }

    /**
     * @param contentLibraryImageUpdationClusterParams (required)
     * @return List&lt;WithTaskContentLibraryImage&gt;
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
    public List<WithTaskContentLibraryImage> distributeContentLibraryImageClusters(
            ContentLibraryImageUpdationClusterParams contentLibraryImageUpdationClusterParams)
            throws ApiException {
        ApiResponse<List<WithTaskContentLibraryImage>> localVarResp =
                distributeContentLibraryImageClustersWithHttpInfo(
                        contentLibraryImageUpdationClusterParams);
        return localVarResp.getData();
    }

    /**
     * @param contentLibraryImageUpdationClusterParams (required)
     * @return ApiResponse&lt;List&lt;WithTaskContentLibraryImage&gt;&gt;
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
    public ApiResponse<List<WithTaskContentLibraryImage>>
            distributeContentLibraryImageClustersWithHttpInfo(
                    ContentLibraryImageUpdationClusterParams
                            contentLibraryImageUpdationClusterParams)
                    throws ApiException {
        okhttp3.Call localVarCall =
                distributeContentLibraryImageClustersValidateBeforeCall(
                        contentLibraryImageUpdationClusterParams, null);
        Type localVarReturnType = new TypeToken<List<WithTaskContentLibraryImage>>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param contentLibraryImageUpdationClusterParams (required)
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
    public okhttp3.Call distributeContentLibraryImageClustersAsync(
            ContentLibraryImageUpdationClusterParams contentLibraryImageUpdationClusterParams,
            final ApiCallback<List<WithTaskContentLibraryImage>> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                distributeContentLibraryImageClustersValidateBeforeCall(
                        contentLibraryImageUpdationClusterParams, _callback);
        Type localVarReturnType = new TypeToken<List<WithTaskContentLibraryImage>>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getContentLibraryImages
     *
     * @param getContentLibraryImagesRequestBody (required)
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
    public okhttp3.Call getContentLibraryImagesCall(
            GetContentLibraryImagesRequestBody getContentLibraryImagesRequestBody,
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

        Object localVarPostBody = getContentLibraryImagesRequestBody;

        // create path and map variables
        String localVarPath = "/get-content-library-images";

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
    private okhttp3.Call getContentLibraryImagesValidateBeforeCall(
            GetContentLibraryImagesRequestBody getContentLibraryImagesRequestBody,
            final ApiCallback _callback)
            throws ApiException {

        // verify the required parameter 'getContentLibraryImagesRequestBody' is set
        if (getContentLibraryImagesRequestBody == null) {
            throw new ApiException(
                    "Missing the required parameter 'getContentLibraryImagesRequestBody' when"
                            + " calling getContentLibraryImages(Async)");
        }

        okhttp3.Call localVarCall =
                getContentLibraryImagesCall(getContentLibraryImagesRequestBody, _callback);
        return localVarCall;
    }

    /**
     * @param getContentLibraryImagesRequestBody (required)
     * @return List&lt;ContentLibraryImage&gt;
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
    public List<ContentLibraryImage> getContentLibraryImages(
            GetContentLibraryImagesRequestBody getContentLibraryImagesRequestBody)
            throws ApiException {
        ApiResponse<List<ContentLibraryImage>> localVarResp =
                getContentLibraryImagesWithHttpInfo(getContentLibraryImagesRequestBody);
        return localVarResp.getData();
    }

    /**
     * @param getContentLibraryImagesRequestBody (required)
     * @return ApiResponse&lt;List&lt;ContentLibraryImage&gt;&gt;
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
    public ApiResponse<List<ContentLibraryImage>> getContentLibraryImagesWithHttpInfo(
            GetContentLibraryImagesRequestBody getContentLibraryImagesRequestBody)
            throws ApiException {
        okhttp3.Call localVarCall =
                getContentLibraryImagesValidateBeforeCall(getContentLibraryImagesRequestBody, null);
        Type localVarReturnType = new TypeToken<List<ContentLibraryImage>>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param getContentLibraryImagesRequestBody (required)
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
    public okhttp3.Call getContentLibraryImagesAsync(
            GetContentLibraryImagesRequestBody getContentLibraryImagesRequestBody,
            final ApiCallback<List<ContentLibraryImage>> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                getContentLibraryImagesValidateBeforeCall(
                        getContentLibraryImagesRequestBody, _callback);
        Type localVarReturnType = new TypeToken<List<ContentLibraryImage>>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getContentLibraryImagesConnection
     *
     * @param getContentLibraryImagesConnectionRequestBody (required)
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
    public okhttp3.Call getContentLibraryImagesConnectionCall(
            GetContentLibraryImagesConnectionRequestBody
                    getContentLibraryImagesConnectionRequestBody,
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

        Object localVarPostBody = getContentLibraryImagesConnectionRequestBody;

        // create path and map variables
        String localVarPath = "/get-content-library-images-connection";

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
    private okhttp3.Call getContentLibraryImagesConnectionValidateBeforeCall(
            GetContentLibraryImagesConnectionRequestBody
                    getContentLibraryImagesConnectionRequestBody,
            final ApiCallback _callback)
            throws ApiException {

        // verify the required parameter 'getContentLibraryImagesConnectionRequestBody' is set
        if (getContentLibraryImagesConnectionRequestBody == null) {
            throw new ApiException(
                    "Missing the required parameter 'getContentLibraryImagesConnectionRequestBody'"
                            + " when calling getContentLibraryImagesConnection(Async)");
        }

        okhttp3.Call localVarCall =
                getContentLibraryImagesConnectionCall(
                        getContentLibraryImagesConnectionRequestBody, _callback);
        return localVarCall;
    }

    /**
     * @param getContentLibraryImagesConnectionRequestBody (required)
     * @return ContentLibraryImageConnection
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
    public ContentLibraryImageConnection getContentLibraryImagesConnection(
            GetContentLibraryImagesConnectionRequestBody
                    getContentLibraryImagesConnectionRequestBody)
            throws ApiException {
        ApiResponse<ContentLibraryImageConnection> localVarResp =
                getContentLibraryImagesConnectionWithHttpInfo(
                        getContentLibraryImagesConnectionRequestBody);
        return localVarResp.getData();
    }

    /**
     * @param getContentLibraryImagesConnectionRequestBody (required)
     * @return ApiResponse&lt;ContentLibraryImageConnection&gt;
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
    public ApiResponse<ContentLibraryImageConnection> getContentLibraryImagesConnectionWithHttpInfo(
            GetContentLibraryImagesConnectionRequestBody
                    getContentLibraryImagesConnectionRequestBody)
            throws ApiException {
        okhttp3.Call localVarCall =
                getContentLibraryImagesConnectionValidateBeforeCall(
                        getContentLibraryImagesConnectionRequestBody, null);
        Type localVarReturnType = new TypeToken<ContentLibraryImageConnection>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param getContentLibraryImagesConnectionRequestBody (required)
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
    public okhttp3.Call getContentLibraryImagesConnectionAsync(
            GetContentLibraryImagesConnectionRequestBody
                    getContentLibraryImagesConnectionRequestBody,
            final ApiCallback<ContentLibraryImageConnection> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                getContentLibraryImagesConnectionValidateBeforeCall(
                        getContentLibraryImagesConnectionRequestBody, _callback);
        Type localVarReturnType = new TypeToken<ContentLibraryImageConnection>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for importContentLibraryImage
     *
     * @param contentLibraryImageImportParams (required)
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
    public okhttp3.Call importContentLibraryImageCall(
            ContentLibraryImageImportParams contentLibraryImageImportParams,
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

        Object localVarPostBody = contentLibraryImageImportParams;

        // create path and map variables
        String localVarPath = "/import-content-library-image";

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
    private okhttp3.Call importContentLibraryImageValidateBeforeCall(
            ContentLibraryImageImportParams contentLibraryImageImportParams,
            final ApiCallback _callback)
            throws ApiException {

        // verify the required parameter 'contentLibraryImageImportParams' is set
        if (contentLibraryImageImportParams == null) {
            throw new ApiException(
                    "Missing the required parameter 'contentLibraryImageImportParams' when calling"
                            + " importContentLibraryImage(Async)");
        }

        okhttp3.Call localVarCall =
                importContentLibraryImageCall(contentLibraryImageImportParams, _callback);
        return localVarCall;
    }

    /**
     * @param contentLibraryImageImportParams (required)
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
    public UploadTask importContentLibraryImage(
            ContentLibraryImageImportParams contentLibraryImageImportParams) throws ApiException {
        ApiResponse<UploadTask> localVarResp =
                importContentLibraryImageWithHttpInfo(contentLibraryImageImportParams);
        return localVarResp.getData();
    }

    /**
     * @param contentLibraryImageImportParams (required)
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
    public ApiResponse<UploadTask> importContentLibraryImageWithHttpInfo(
            ContentLibraryImageImportParams contentLibraryImageImportParams) throws ApiException {
        okhttp3.Call localVarCall =
                importContentLibraryImageValidateBeforeCall(contentLibraryImageImportParams, null);
        Type localVarReturnType = new TypeToken<UploadTask>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param contentLibraryImageImportParams (required)
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
    public okhttp3.Call importContentLibraryImageAsync(
            ContentLibraryImageImportParams contentLibraryImageImportParams,
            final ApiCallback<UploadTask> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                importContentLibraryImageValidateBeforeCall(
                        contentLibraryImageImportParams, _callback);
        Type localVarReturnType = new TypeToken<UploadTask>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for removeContentLibraryImageClusters
     *
     * @param contentLibraryImageUpdationClusterParams (required)
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
    public okhttp3.Call removeContentLibraryImageClustersCall(
            ContentLibraryImageUpdationClusterParams contentLibraryImageUpdationClusterParams,
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

        Object localVarPostBody = contentLibraryImageUpdationClusterParams;

        // create path and map variables
        String localVarPath = "/remove-content-library-image-clusters";

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
    private okhttp3.Call removeContentLibraryImageClustersValidateBeforeCall(
            ContentLibraryImageUpdationClusterParams contentLibraryImageUpdationClusterParams,
            final ApiCallback _callback)
            throws ApiException {

        // verify the required parameter 'contentLibraryImageUpdationClusterParams' is set
        if (contentLibraryImageUpdationClusterParams == null) {
            throw new ApiException(
                    "Missing the required parameter 'contentLibraryImageUpdationClusterParams'"
                            + " when calling removeContentLibraryImageClusters(Async)");
        }

        okhttp3.Call localVarCall =
                removeContentLibraryImageClustersCall(
                        contentLibraryImageUpdationClusterParams, _callback);
        return localVarCall;
    }

    /**
     * @param contentLibraryImageUpdationClusterParams (required)
     * @return List&lt;WithTaskContentLibraryImage&gt;
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
    public List<WithTaskContentLibraryImage> removeContentLibraryImageClusters(
            ContentLibraryImageUpdationClusterParams contentLibraryImageUpdationClusterParams)
            throws ApiException {
        ApiResponse<List<WithTaskContentLibraryImage>> localVarResp =
                removeContentLibraryImageClustersWithHttpInfo(
                        contentLibraryImageUpdationClusterParams);
        return localVarResp.getData();
    }

    /**
     * @param contentLibraryImageUpdationClusterParams (required)
     * @return ApiResponse&lt;List&lt;WithTaskContentLibraryImage&gt;&gt;
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
    public ApiResponse<List<WithTaskContentLibraryImage>>
            removeContentLibraryImageClustersWithHttpInfo(
                    ContentLibraryImageUpdationClusterParams
                            contentLibraryImageUpdationClusterParams)
                    throws ApiException {
        okhttp3.Call localVarCall =
                removeContentLibraryImageClustersValidateBeforeCall(
                        contentLibraryImageUpdationClusterParams, null);
        Type localVarReturnType = new TypeToken<List<WithTaskContentLibraryImage>>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param contentLibraryImageUpdationClusterParams (required)
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
    public okhttp3.Call removeContentLibraryImageClustersAsync(
            ContentLibraryImageUpdationClusterParams contentLibraryImageUpdationClusterParams,
            final ApiCallback<List<WithTaskContentLibraryImage>> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                removeContentLibraryImageClustersValidateBeforeCall(
                        contentLibraryImageUpdationClusterParams, _callback);
        Type localVarReturnType = new TypeToken<List<WithTaskContentLibraryImage>>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateContentLibraryImage
     *
     * @param contentLibraryImageUpdationParams (required)
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
    public okhttp3.Call updateContentLibraryImageCall(
            ContentLibraryImageUpdationParams contentLibraryImageUpdationParams,
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

        Object localVarPostBody = contentLibraryImageUpdationParams;

        // create path and map variables
        String localVarPath = "/update-content-library-image";

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
    private okhttp3.Call updateContentLibraryImageValidateBeforeCall(
            ContentLibraryImageUpdationParams contentLibraryImageUpdationParams,
            final ApiCallback _callback)
            throws ApiException {

        // verify the required parameter 'contentLibraryImageUpdationParams' is set
        if (contentLibraryImageUpdationParams == null) {
            throw new ApiException(
                    "Missing the required parameter 'contentLibraryImageUpdationParams' when"
                            + " calling updateContentLibraryImage(Async)");
        }

        okhttp3.Call localVarCall =
                updateContentLibraryImageCall(contentLibraryImageUpdationParams, _callback);
        return localVarCall;
    }

    /**
     * @param contentLibraryImageUpdationParams (required)
     * @return List&lt;WithTaskContentLibraryImage&gt;
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
    public List<WithTaskContentLibraryImage> updateContentLibraryImage(
            ContentLibraryImageUpdationParams contentLibraryImageUpdationParams)
            throws ApiException {
        ApiResponse<List<WithTaskContentLibraryImage>> localVarResp =
                updateContentLibraryImageWithHttpInfo(contentLibraryImageUpdationParams);
        return localVarResp.getData();
    }

    /**
     * @param contentLibraryImageUpdationParams (required)
     * @return ApiResponse&lt;List&lt;WithTaskContentLibraryImage&gt;&gt;
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
    public ApiResponse<List<WithTaskContentLibraryImage>> updateContentLibraryImageWithHttpInfo(
            ContentLibraryImageUpdationParams contentLibraryImageUpdationParams)
            throws ApiException {
        okhttp3.Call localVarCall =
                updateContentLibraryImageValidateBeforeCall(
                        contentLibraryImageUpdationParams, null);
        Type localVarReturnType = new TypeToken<List<WithTaskContentLibraryImage>>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param contentLibraryImageUpdationParams (required)
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
    public okhttp3.Call updateContentLibraryImageAsync(
            ContentLibraryImageUpdationParams contentLibraryImageUpdationParams,
            final ApiCallback<List<WithTaskContentLibraryImage>> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                updateContentLibraryImageValidateBeforeCall(
                        contentLibraryImageUpdationParams, _callback);
        Type localVarReturnType = new TypeToken<List<WithTaskContentLibraryImage>>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}

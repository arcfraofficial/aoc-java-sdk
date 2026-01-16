package com.arcfra.aoc.api;


import com.arcfra.aoc.ApiCallback;
import com.arcfra.aoc.ApiClient;
import com.arcfra.aoc.ApiException;
import com.arcfra.aoc.ApiResponse;
import com.arcfra.aoc.Configuration;
import com.arcfra.aoc.Pair;
import com.arcfra.aoc.model.ContentLibraryVmTemplate;
import com.arcfra.aoc.model.ContentLibraryVmTemplateConnection;
import com.arcfra.aoc.model.ContentLibraryVmTemplateCreationParams;
import com.arcfra.aoc.model.ContentLibraryVmTemplateDeletionParams;
import com.arcfra.aoc.model.ContentLibraryVmTemplateExportParams;
import com.arcfra.aoc.model.ContentLibraryVmTemplateImportParams;
import com.arcfra.aoc.model.ContentLibraryVmTemplateUpdationClusterParams;
import com.arcfra.aoc.model.ContentLibraryVmTemplateUpdationParams;
import com.arcfra.aoc.model.GetContentLibraryVmTemplatesConnectionRequestBody;
import com.arcfra.aoc.model.GetContentLibraryVmTemplatesRequestBody;
import com.arcfra.aoc.model.WithTaskContentLibraryVmTemplate;
import com.arcfra.aoc.model.WithTaskDeleteContentLibraryVmTemplate;
import com.arcfra.aoc.model.WithTaskVmExportFile;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ContentLibraryVmTemplateApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ContentLibraryVmTemplateApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ContentLibraryVmTemplateApi(ApiClient apiClient) {
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
     * Build call for cloneContentLibraryVmTemplateFromVm
     *
     * @param contentLibraryVmTemplateCreationParams (required)
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
    public okhttp3.Call cloneContentLibraryVmTemplateFromVmCall(
            List<ContentLibraryVmTemplateCreationParams> contentLibraryVmTemplateCreationParams,
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

        Object localVarPostBody = contentLibraryVmTemplateCreationParams;

        // create path and map variables
        String localVarPath = "/clone-content-library-vm-template-from-vm";

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
    private okhttp3.Call cloneContentLibraryVmTemplateFromVmValidateBeforeCall(
            List<ContentLibraryVmTemplateCreationParams> contentLibraryVmTemplateCreationParams,
            final ApiCallback _callback)
            throws ApiException {

        // verify the required parameter 'contentLibraryVmTemplateCreationParams' is set
        if (contentLibraryVmTemplateCreationParams == null) {
            throw new ApiException(
                    "Missing the required parameter 'contentLibraryVmTemplateCreationParams' when"
                            + " calling cloneContentLibraryVmTemplateFromVm(Async)");
        }

        okhttp3.Call localVarCall =
                cloneContentLibraryVmTemplateFromVmCall(
                        contentLibraryVmTemplateCreationParams, _callback);
        return localVarCall;
    }

    /**
     * @param contentLibraryVmTemplateCreationParams (required)
     * @return List&lt;WithTaskContentLibraryVmTemplate&gt;
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
    public List<WithTaskContentLibraryVmTemplate> cloneContentLibraryVmTemplateFromVm(
            List<ContentLibraryVmTemplateCreationParams> contentLibraryVmTemplateCreationParams)
            throws ApiException {
        ApiResponse<List<WithTaskContentLibraryVmTemplate>> localVarResp =
                cloneContentLibraryVmTemplateFromVmWithHttpInfo(
                        contentLibraryVmTemplateCreationParams);
        return localVarResp.getData();
    }

    /**
     * @param contentLibraryVmTemplateCreationParams (required)
     * @return ApiResponse&lt;List&lt;WithTaskContentLibraryVmTemplate&gt;&gt;
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
    public ApiResponse<List<WithTaskContentLibraryVmTemplate>>
            cloneContentLibraryVmTemplateFromVmWithHttpInfo(
                    List<ContentLibraryVmTemplateCreationParams>
                            contentLibraryVmTemplateCreationParams)
                    throws ApiException {
        okhttp3.Call localVarCall =
                cloneContentLibraryVmTemplateFromVmValidateBeforeCall(
                        contentLibraryVmTemplateCreationParams, null);
        Type localVarReturnType =
                new TypeToken<List<WithTaskContentLibraryVmTemplate>>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param contentLibraryVmTemplateCreationParams (required)
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
    public okhttp3.Call cloneContentLibraryVmTemplateFromVmAsync(
            List<ContentLibraryVmTemplateCreationParams> contentLibraryVmTemplateCreationParams,
            final ApiCallback<List<WithTaskContentLibraryVmTemplate>> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                cloneContentLibraryVmTemplateFromVmValidateBeforeCall(
                        contentLibraryVmTemplateCreationParams, _callback);
        Type localVarReturnType =
                new TypeToken<List<WithTaskContentLibraryVmTemplate>>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for convertContentLibraryVmTemplateFromVm
     *
     * @param contentLibraryVmTemplateCreationParams (required)
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
    public okhttp3.Call convertContentLibraryVmTemplateFromVmCall(
            List<ContentLibraryVmTemplateCreationParams> contentLibraryVmTemplateCreationParams,
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

        Object localVarPostBody = contentLibraryVmTemplateCreationParams;

        // create path and map variables
        String localVarPath = "/convert-content-library-vm-template-from-vm";

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
    private okhttp3.Call convertContentLibraryVmTemplateFromVmValidateBeforeCall(
            List<ContentLibraryVmTemplateCreationParams> contentLibraryVmTemplateCreationParams,
            final ApiCallback _callback)
            throws ApiException {

        // verify the required parameter 'contentLibraryVmTemplateCreationParams' is set
        if (contentLibraryVmTemplateCreationParams == null) {
            throw new ApiException(
                    "Missing the required parameter 'contentLibraryVmTemplateCreationParams' when"
                            + " calling convertContentLibraryVmTemplateFromVm(Async)");
        }

        okhttp3.Call localVarCall =
                convertContentLibraryVmTemplateFromVmCall(
                        contentLibraryVmTemplateCreationParams, _callback);
        return localVarCall;
    }

    /**
     * @param contentLibraryVmTemplateCreationParams (required)
     * @return List&lt;WithTaskContentLibraryVmTemplate&gt;
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
    public List<WithTaskContentLibraryVmTemplate> convertContentLibraryVmTemplateFromVm(
            List<ContentLibraryVmTemplateCreationParams> contentLibraryVmTemplateCreationParams)
            throws ApiException {
        ApiResponse<List<WithTaskContentLibraryVmTemplate>> localVarResp =
                convertContentLibraryVmTemplateFromVmWithHttpInfo(
                        contentLibraryVmTemplateCreationParams);
        return localVarResp.getData();
    }

    /**
     * @param contentLibraryVmTemplateCreationParams (required)
     * @return ApiResponse&lt;List&lt;WithTaskContentLibraryVmTemplate&gt;&gt;
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
    public ApiResponse<List<WithTaskContentLibraryVmTemplate>>
            convertContentLibraryVmTemplateFromVmWithHttpInfo(
                    List<ContentLibraryVmTemplateCreationParams>
                            contentLibraryVmTemplateCreationParams)
                    throws ApiException {
        okhttp3.Call localVarCall =
                convertContentLibraryVmTemplateFromVmValidateBeforeCall(
                        contentLibraryVmTemplateCreationParams, null);
        Type localVarReturnType =
                new TypeToken<List<WithTaskContentLibraryVmTemplate>>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param contentLibraryVmTemplateCreationParams (required)
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
    public okhttp3.Call convertContentLibraryVmTemplateFromVmAsync(
            List<ContentLibraryVmTemplateCreationParams> contentLibraryVmTemplateCreationParams,
            final ApiCallback<List<WithTaskContentLibraryVmTemplate>> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                convertContentLibraryVmTemplateFromVmValidateBeforeCall(
                        contentLibraryVmTemplateCreationParams, _callback);
        Type localVarReturnType =
                new TypeToken<List<WithTaskContentLibraryVmTemplate>>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteContentLibraryVmTemplate
     *
     * @param contentLibraryVmTemplateDeletionParams (required)
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
    public okhttp3.Call deleteContentLibraryVmTemplateCall(
            ContentLibraryVmTemplateDeletionParams contentLibraryVmTemplateDeletionParams,
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

        Object localVarPostBody = contentLibraryVmTemplateDeletionParams;

        // create path and map variables
        String localVarPath = "/delete-content-library-vm-template";

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
    private okhttp3.Call deleteContentLibraryVmTemplateValidateBeforeCall(
            ContentLibraryVmTemplateDeletionParams contentLibraryVmTemplateDeletionParams,
            final ApiCallback _callback)
            throws ApiException {

        // verify the required parameter 'contentLibraryVmTemplateDeletionParams' is set
        if (contentLibraryVmTemplateDeletionParams == null) {
            throw new ApiException(
                    "Missing the required parameter 'contentLibraryVmTemplateDeletionParams' when"
                            + " calling deleteContentLibraryVmTemplate(Async)");
        }

        okhttp3.Call localVarCall =
                deleteContentLibraryVmTemplateCall(
                        contentLibraryVmTemplateDeletionParams, _callback);
        return localVarCall;
    }

    /**
     * @param contentLibraryVmTemplateDeletionParams (required)
     * @return List&lt;WithTaskDeleteContentLibraryVmTemplate&gt;
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
    public List<WithTaskDeleteContentLibraryVmTemplate> deleteContentLibraryVmTemplate(
            ContentLibraryVmTemplateDeletionParams contentLibraryVmTemplateDeletionParams)
            throws ApiException {
        ApiResponse<List<WithTaskDeleteContentLibraryVmTemplate>> localVarResp =
                deleteContentLibraryVmTemplateWithHttpInfo(contentLibraryVmTemplateDeletionParams);
        return localVarResp.getData();
    }

    /**
     * @param contentLibraryVmTemplateDeletionParams (required)
     * @return ApiResponse&lt;List&lt;WithTaskDeleteContentLibraryVmTemplate&gt;&gt;
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
    public ApiResponse<List<WithTaskDeleteContentLibraryVmTemplate>>
            deleteContentLibraryVmTemplateWithHttpInfo(
                    ContentLibraryVmTemplateDeletionParams contentLibraryVmTemplateDeletionParams)
                    throws ApiException {
        okhttp3.Call localVarCall =
                deleteContentLibraryVmTemplateValidateBeforeCall(
                        contentLibraryVmTemplateDeletionParams, null);
        Type localVarReturnType =
                new TypeToken<List<WithTaskDeleteContentLibraryVmTemplate>>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param contentLibraryVmTemplateDeletionParams (required)
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
    public okhttp3.Call deleteContentLibraryVmTemplateAsync(
            ContentLibraryVmTemplateDeletionParams contentLibraryVmTemplateDeletionParams,
            final ApiCallback<List<WithTaskDeleteContentLibraryVmTemplate>> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                deleteContentLibraryVmTemplateValidateBeforeCall(
                        contentLibraryVmTemplateDeletionParams, _callback);
        Type localVarReturnType =
                new TypeToken<List<WithTaskDeleteContentLibraryVmTemplate>>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for distributeContentLibraryVmtemplateClusters
     *
     * @param contentLibraryVmTemplateUpdationClusterParams (required)
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
    public okhttp3.Call distributeContentLibraryVmtemplateClustersCall(
            ContentLibraryVmTemplateUpdationClusterParams
                    contentLibraryVmTemplateUpdationClusterParams,
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

        Object localVarPostBody = contentLibraryVmTemplateUpdationClusterParams;

        // create path and map variables
        String localVarPath = "/distribute-content-library-vm-template-clusters";

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
    private okhttp3.Call distributeContentLibraryVmtemplateClustersValidateBeforeCall(
            ContentLibraryVmTemplateUpdationClusterParams
                    contentLibraryVmTemplateUpdationClusterParams,
            final ApiCallback _callback)
            throws ApiException {

        // verify the required parameter 'contentLibraryVmTemplateUpdationClusterParams' is set
        if (contentLibraryVmTemplateUpdationClusterParams == null) {
            throw new ApiException(
                    "Missing the required parameter"
                            + " 'contentLibraryVmTemplateUpdationClusterParams' when calling"
                            + " distributeContentLibraryVmtemplateClusters(Async)");
        }

        okhttp3.Call localVarCall =
                distributeContentLibraryVmtemplateClustersCall(
                        contentLibraryVmTemplateUpdationClusterParams, _callback);
        return localVarCall;
    }

    /**
     * @param contentLibraryVmTemplateUpdationClusterParams (required)
     * @return List&lt;WithTaskContentLibraryVmTemplate&gt;
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
    public List<WithTaskContentLibraryVmTemplate> distributeContentLibraryVmtemplateClusters(
            ContentLibraryVmTemplateUpdationClusterParams
                    contentLibraryVmTemplateUpdationClusterParams)
            throws ApiException {
        ApiResponse<List<WithTaskContentLibraryVmTemplate>> localVarResp =
                distributeContentLibraryVmtemplateClustersWithHttpInfo(
                        contentLibraryVmTemplateUpdationClusterParams);
        return localVarResp.getData();
    }

    /**
     * @param contentLibraryVmTemplateUpdationClusterParams (required)
     * @return ApiResponse&lt;List&lt;WithTaskContentLibraryVmTemplate&gt;&gt;
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
    public ApiResponse<List<WithTaskContentLibraryVmTemplate>>
            distributeContentLibraryVmtemplateClustersWithHttpInfo(
                    ContentLibraryVmTemplateUpdationClusterParams
                            contentLibraryVmTemplateUpdationClusterParams)
                    throws ApiException {
        okhttp3.Call localVarCall =
                distributeContentLibraryVmtemplateClustersValidateBeforeCall(
                        contentLibraryVmTemplateUpdationClusterParams, null);
        Type localVarReturnType =
                new TypeToken<List<WithTaskContentLibraryVmTemplate>>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param contentLibraryVmTemplateUpdationClusterParams (required)
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
    public okhttp3.Call distributeContentLibraryVmtemplateClustersAsync(
            ContentLibraryVmTemplateUpdationClusterParams
                    contentLibraryVmTemplateUpdationClusterParams,
            final ApiCallback<List<WithTaskContentLibraryVmTemplate>> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                distributeContentLibraryVmtemplateClustersValidateBeforeCall(
                        contentLibraryVmTemplateUpdationClusterParams, _callback);
        Type localVarReturnType =
                new TypeToken<List<WithTaskContentLibraryVmTemplate>>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for exportContentLibraryVmTemplate
     *
     * @param contentLibraryVmTemplateExportParams (required)
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
    public okhttp3.Call exportContentLibraryVmTemplateCall(
            ContentLibraryVmTemplateExportParams contentLibraryVmTemplateExportParams,
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

        Object localVarPostBody = contentLibraryVmTemplateExportParams;

        // create path and map variables
        String localVarPath = "/export-content-library-vm-template";

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
    private okhttp3.Call exportContentLibraryVmTemplateValidateBeforeCall(
            ContentLibraryVmTemplateExportParams contentLibraryVmTemplateExportParams,
            final ApiCallback _callback)
            throws ApiException {

        // verify the required parameter 'contentLibraryVmTemplateExportParams' is set
        if (contentLibraryVmTemplateExportParams == null) {
            throw new ApiException(
                    "Missing the required parameter 'contentLibraryVmTemplateExportParams' when"
                            + " calling exportContentLibraryVmTemplate(Async)");
        }

        okhttp3.Call localVarCall =
                exportContentLibraryVmTemplateCall(contentLibraryVmTemplateExportParams, _callback);
        return localVarCall;
    }

    /**
     * @param contentLibraryVmTemplateExportParams (required)
     * @return List&lt;WithTaskVmExportFile&gt;
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
    public List<WithTaskVmExportFile> exportContentLibraryVmTemplate(
            ContentLibraryVmTemplateExportParams contentLibraryVmTemplateExportParams)
            throws ApiException {
        ApiResponse<List<WithTaskVmExportFile>> localVarResp =
                exportContentLibraryVmTemplateWithHttpInfo(contentLibraryVmTemplateExportParams);
        return localVarResp.getData();
    }

    /**
     * @param contentLibraryVmTemplateExportParams (required)
     * @return ApiResponse&lt;List&lt;WithTaskVmExportFile&gt;&gt;
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
    public ApiResponse<List<WithTaskVmExportFile>> exportContentLibraryVmTemplateWithHttpInfo(
            ContentLibraryVmTemplateExportParams contentLibraryVmTemplateExportParams)
            throws ApiException {
        okhttp3.Call localVarCall =
                exportContentLibraryVmTemplateValidateBeforeCall(
                        contentLibraryVmTemplateExportParams, null);
        Type localVarReturnType = new TypeToken<List<WithTaskVmExportFile>>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param contentLibraryVmTemplateExportParams (required)
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
    public okhttp3.Call exportContentLibraryVmTemplateAsync(
            ContentLibraryVmTemplateExportParams contentLibraryVmTemplateExportParams,
            final ApiCallback<List<WithTaskVmExportFile>> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                exportContentLibraryVmTemplateValidateBeforeCall(
                        contentLibraryVmTemplateExportParams, _callback);
        Type localVarReturnType = new TypeToken<List<WithTaskVmExportFile>>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getContentLibraryVmTemplates
     *
     * @param getContentLibraryVmTemplatesRequestBody (required)
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
    public okhttp3.Call getContentLibraryVmTemplatesCall(
            GetContentLibraryVmTemplatesRequestBody getContentLibraryVmTemplatesRequestBody,
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

        Object localVarPostBody = getContentLibraryVmTemplatesRequestBody;

        // create path and map variables
        String localVarPath = "/get-content-library-vm-templates";

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
    private okhttp3.Call getContentLibraryVmTemplatesValidateBeforeCall(
            GetContentLibraryVmTemplatesRequestBody getContentLibraryVmTemplatesRequestBody,
            final ApiCallback _callback)
            throws ApiException {

        // verify the required parameter 'getContentLibraryVmTemplatesRequestBody' is set
        if (getContentLibraryVmTemplatesRequestBody == null) {
            throw new ApiException(
                    "Missing the required parameter 'getContentLibraryVmTemplatesRequestBody' when"
                            + " calling getContentLibraryVmTemplates(Async)");
        }

        okhttp3.Call localVarCall =
                getContentLibraryVmTemplatesCall(
                        getContentLibraryVmTemplatesRequestBody, _callback);
        return localVarCall;
    }

    /**
     * @param getContentLibraryVmTemplatesRequestBody (required)
     * @return List&lt;ContentLibraryVmTemplate&gt;
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
    public List<ContentLibraryVmTemplate> getContentLibraryVmTemplates(
            GetContentLibraryVmTemplatesRequestBody getContentLibraryVmTemplatesRequestBody)
            throws ApiException {
        ApiResponse<List<ContentLibraryVmTemplate>> localVarResp =
                getContentLibraryVmTemplatesWithHttpInfo(getContentLibraryVmTemplatesRequestBody);
        return localVarResp.getData();
    }

    /**
     * @param getContentLibraryVmTemplatesRequestBody (required)
     * @return ApiResponse&lt;List&lt;ContentLibraryVmTemplate&gt;&gt;
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
    public ApiResponse<List<ContentLibraryVmTemplate>> getContentLibraryVmTemplatesWithHttpInfo(
            GetContentLibraryVmTemplatesRequestBody getContentLibraryVmTemplatesRequestBody)
            throws ApiException {
        okhttp3.Call localVarCall =
                getContentLibraryVmTemplatesValidateBeforeCall(
                        getContentLibraryVmTemplatesRequestBody, null);
        Type localVarReturnType = new TypeToken<List<ContentLibraryVmTemplate>>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param getContentLibraryVmTemplatesRequestBody (required)
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
    public okhttp3.Call getContentLibraryVmTemplatesAsync(
            GetContentLibraryVmTemplatesRequestBody getContentLibraryVmTemplatesRequestBody,
            final ApiCallback<List<ContentLibraryVmTemplate>> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                getContentLibraryVmTemplatesValidateBeforeCall(
                        getContentLibraryVmTemplatesRequestBody, _callback);
        Type localVarReturnType = new TypeToken<List<ContentLibraryVmTemplate>>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getContentLibraryVmTemplatesConnection
     *
     * @param getContentLibraryVmTemplatesConnectionRequestBody (required)
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
    public okhttp3.Call getContentLibraryVmTemplatesConnectionCall(
            GetContentLibraryVmTemplatesConnectionRequestBody
                    getContentLibraryVmTemplatesConnectionRequestBody,
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

        Object localVarPostBody = getContentLibraryVmTemplatesConnectionRequestBody;

        // create path and map variables
        String localVarPath = "/get-content-library-vm-templates-connection";

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
    private okhttp3.Call getContentLibraryVmTemplatesConnectionValidateBeforeCall(
            GetContentLibraryVmTemplatesConnectionRequestBody
                    getContentLibraryVmTemplatesConnectionRequestBody,
            final ApiCallback _callback)
            throws ApiException {

        // verify the required parameter 'getContentLibraryVmTemplatesConnectionRequestBody' is set
        if (getContentLibraryVmTemplatesConnectionRequestBody == null) {
            throw new ApiException(
                    "Missing the required parameter"
                            + " 'getContentLibraryVmTemplatesConnectionRequestBody' when calling"
                            + " getContentLibraryVmTemplatesConnection(Async)");
        }

        okhttp3.Call localVarCall =
                getContentLibraryVmTemplatesConnectionCall(
                        getContentLibraryVmTemplatesConnectionRequestBody, _callback);
        return localVarCall;
    }

    /**
     * @param getContentLibraryVmTemplatesConnectionRequestBody (required)
     * @return ContentLibraryVmTemplateConnection
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
    public ContentLibraryVmTemplateConnection getContentLibraryVmTemplatesConnection(
            GetContentLibraryVmTemplatesConnectionRequestBody
                    getContentLibraryVmTemplatesConnectionRequestBody)
            throws ApiException {
        ApiResponse<ContentLibraryVmTemplateConnection> localVarResp =
                getContentLibraryVmTemplatesConnectionWithHttpInfo(
                        getContentLibraryVmTemplatesConnectionRequestBody);
        return localVarResp.getData();
    }

    /**
     * @param getContentLibraryVmTemplatesConnectionRequestBody (required)
     * @return ApiResponse&lt;ContentLibraryVmTemplateConnection&gt;
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
    public ApiResponse<ContentLibraryVmTemplateConnection>
            getContentLibraryVmTemplatesConnectionWithHttpInfo(
                    GetContentLibraryVmTemplatesConnectionRequestBody
                            getContentLibraryVmTemplatesConnectionRequestBody)
                    throws ApiException {
        okhttp3.Call localVarCall =
                getContentLibraryVmTemplatesConnectionValidateBeforeCall(
                        getContentLibraryVmTemplatesConnectionRequestBody, null);
        Type localVarReturnType = new TypeToken<ContentLibraryVmTemplateConnection>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param getContentLibraryVmTemplatesConnectionRequestBody (required)
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
    public okhttp3.Call getContentLibraryVmTemplatesConnectionAsync(
            GetContentLibraryVmTemplatesConnectionRequestBody
                    getContentLibraryVmTemplatesConnectionRequestBody,
            final ApiCallback<ContentLibraryVmTemplateConnection> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                getContentLibraryVmTemplatesConnectionValidateBeforeCall(
                        getContentLibraryVmTemplatesConnectionRequestBody, _callback);
        Type localVarReturnType = new TypeToken<ContentLibraryVmTemplateConnection>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for importContentLibraryVmTemplate
     *
     * @param contentLibraryVmTemplateImportParams (required)
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
    public okhttp3.Call importContentLibraryVmTemplateCall(
            List<ContentLibraryVmTemplateImportParams> contentLibraryVmTemplateImportParams,
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

        Object localVarPostBody = contentLibraryVmTemplateImportParams;

        // create path and map variables
        String localVarPath = "/import-content-library-vm-template";

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
    private okhttp3.Call importContentLibraryVmTemplateValidateBeforeCall(
            List<ContentLibraryVmTemplateImportParams> contentLibraryVmTemplateImportParams,
            final ApiCallback _callback)
            throws ApiException {

        // verify the required parameter 'contentLibraryVmTemplateImportParams' is set
        if (contentLibraryVmTemplateImportParams == null) {
            throw new ApiException(
                    "Missing the required parameter 'contentLibraryVmTemplateImportParams' when"
                            + " calling importContentLibraryVmTemplate(Async)");
        }

        okhttp3.Call localVarCall =
                importContentLibraryVmTemplateCall(contentLibraryVmTemplateImportParams, _callback);
        return localVarCall;
    }

    /**
     * @param contentLibraryVmTemplateImportParams (required)
     * @return List&lt;WithTaskContentLibraryVmTemplate&gt;
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
    public List<WithTaskContentLibraryVmTemplate> importContentLibraryVmTemplate(
            List<ContentLibraryVmTemplateImportParams> contentLibraryVmTemplateImportParams)
            throws ApiException {
        ApiResponse<List<WithTaskContentLibraryVmTemplate>> localVarResp =
                importContentLibraryVmTemplateWithHttpInfo(contentLibraryVmTemplateImportParams);
        return localVarResp.getData();
    }

    /**
     * @param contentLibraryVmTemplateImportParams (required)
     * @return ApiResponse&lt;List&lt;WithTaskContentLibraryVmTemplate&gt;&gt;
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
    public ApiResponse<List<WithTaskContentLibraryVmTemplate>>
            importContentLibraryVmTemplateWithHttpInfo(
                    List<ContentLibraryVmTemplateImportParams> contentLibraryVmTemplateImportParams)
                    throws ApiException {
        okhttp3.Call localVarCall =
                importContentLibraryVmTemplateValidateBeforeCall(
                        contentLibraryVmTemplateImportParams, null);
        Type localVarReturnType =
                new TypeToken<List<WithTaskContentLibraryVmTemplate>>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param contentLibraryVmTemplateImportParams (required)
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
    public okhttp3.Call importContentLibraryVmTemplateAsync(
            List<ContentLibraryVmTemplateImportParams> contentLibraryVmTemplateImportParams,
            final ApiCallback<List<WithTaskContentLibraryVmTemplate>> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                importContentLibraryVmTemplateValidateBeforeCall(
                        contentLibraryVmTemplateImportParams, _callback);
        Type localVarReturnType =
                new TypeToken<List<WithTaskContentLibraryVmTemplate>>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for removeContentLibraryVmTemplateClusters
     *
     * @param contentLibraryVmTemplateUpdationClusterParams (required)
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
    public okhttp3.Call removeContentLibraryVmTemplateClustersCall(
            ContentLibraryVmTemplateUpdationClusterParams
                    contentLibraryVmTemplateUpdationClusterParams,
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

        Object localVarPostBody = contentLibraryVmTemplateUpdationClusterParams;

        // create path and map variables
        String localVarPath = "/remove-content-library-vm-template-clusters";

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
    private okhttp3.Call removeContentLibraryVmTemplateClustersValidateBeforeCall(
            ContentLibraryVmTemplateUpdationClusterParams
                    contentLibraryVmTemplateUpdationClusterParams,
            final ApiCallback _callback)
            throws ApiException {

        // verify the required parameter 'contentLibraryVmTemplateUpdationClusterParams' is set
        if (contentLibraryVmTemplateUpdationClusterParams == null) {
            throw new ApiException(
                    "Missing the required parameter"
                            + " 'contentLibraryVmTemplateUpdationClusterParams' when calling"
                            + " removeContentLibraryVmTemplateClusters(Async)");
        }

        okhttp3.Call localVarCall =
                removeContentLibraryVmTemplateClustersCall(
                        contentLibraryVmTemplateUpdationClusterParams, _callback);
        return localVarCall;
    }

    /**
     * @param contentLibraryVmTemplateUpdationClusterParams (required)
     * @return List&lt;WithTaskContentLibraryVmTemplate&gt;
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
    public List<WithTaskContentLibraryVmTemplate> removeContentLibraryVmTemplateClusters(
            ContentLibraryVmTemplateUpdationClusterParams
                    contentLibraryVmTemplateUpdationClusterParams)
            throws ApiException {
        ApiResponse<List<WithTaskContentLibraryVmTemplate>> localVarResp =
                removeContentLibraryVmTemplateClustersWithHttpInfo(
                        contentLibraryVmTemplateUpdationClusterParams);
        return localVarResp.getData();
    }

    /**
     * @param contentLibraryVmTemplateUpdationClusterParams (required)
     * @return ApiResponse&lt;List&lt;WithTaskContentLibraryVmTemplate&gt;&gt;
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
    public ApiResponse<List<WithTaskContentLibraryVmTemplate>>
            removeContentLibraryVmTemplateClustersWithHttpInfo(
                    ContentLibraryVmTemplateUpdationClusterParams
                            contentLibraryVmTemplateUpdationClusterParams)
                    throws ApiException {
        okhttp3.Call localVarCall =
                removeContentLibraryVmTemplateClustersValidateBeforeCall(
                        contentLibraryVmTemplateUpdationClusterParams, null);
        Type localVarReturnType =
                new TypeToken<List<WithTaskContentLibraryVmTemplate>>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param contentLibraryVmTemplateUpdationClusterParams (required)
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
    public okhttp3.Call removeContentLibraryVmTemplateClustersAsync(
            ContentLibraryVmTemplateUpdationClusterParams
                    contentLibraryVmTemplateUpdationClusterParams,
            final ApiCallback<List<WithTaskContentLibraryVmTemplate>> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                removeContentLibraryVmTemplateClustersValidateBeforeCall(
                        contentLibraryVmTemplateUpdationClusterParams, _callback);
        Type localVarReturnType =
                new TypeToken<List<WithTaskContentLibraryVmTemplate>>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateContentLibraryVmTemplate
     *
     * @param contentLibraryVmTemplateUpdationParams (required)
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
    public okhttp3.Call updateContentLibraryVmTemplateCall(
            ContentLibraryVmTemplateUpdationParams contentLibraryVmTemplateUpdationParams,
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

        Object localVarPostBody = contentLibraryVmTemplateUpdationParams;

        // create path and map variables
        String localVarPath = "/update-content-library-vm-template";

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
    private okhttp3.Call updateContentLibraryVmTemplateValidateBeforeCall(
            ContentLibraryVmTemplateUpdationParams contentLibraryVmTemplateUpdationParams,
            final ApiCallback _callback)
            throws ApiException {

        // verify the required parameter 'contentLibraryVmTemplateUpdationParams' is set
        if (contentLibraryVmTemplateUpdationParams == null) {
            throw new ApiException(
                    "Missing the required parameter 'contentLibraryVmTemplateUpdationParams' when"
                            + " calling updateContentLibraryVmTemplate(Async)");
        }

        okhttp3.Call localVarCall =
                updateContentLibraryVmTemplateCall(
                        contentLibraryVmTemplateUpdationParams, _callback);
        return localVarCall;
    }

    /**
     * @param contentLibraryVmTemplateUpdationParams (required)
     * @return List&lt;WithTaskContentLibraryVmTemplate&gt;
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
    public List<WithTaskContentLibraryVmTemplate> updateContentLibraryVmTemplate(
            ContentLibraryVmTemplateUpdationParams contentLibraryVmTemplateUpdationParams)
            throws ApiException {
        ApiResponse<List<WithTaskContentLibraryVmTemplate>> localVarResp =
                updateContentLibraryVmTemplateWithHttpInfo(contentLibraryVmTemplateUpdationParams);
        return localVarResp.getData();
    }

    /**
     * @param contentLibraryVmTemplateUpdationParams (required)
     * @return ApiResponse&lt;List&lt;WithTaskContentLibraryVmTemplate&gt;&gt;
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
    public ApiResponse<List<WithTaskContentLibraryVmTemplate>>
            updateContentLibraryVmTemplateWithHttpInfo(
                    ContentLibraryVmTemplateUpdationParams contentLibraryVmTemplateUpdationParams)
                    throws ApiException {
        okhttp3.Call localVarCall =
                updateContentLibraryVmTemplateValidateBeforeCall(
                        contentLibraryVmTemplateUpdationParams, null);
        Type localVarReturnType =
                new TypeToken<List<WithTaskContentLibraryVmTemplate>>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * (asynchronously)
     *
     * @param contentLibraryVmTemplateUpdationParams (required)
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
    public okhttp3.Call updateContentLibraryVmTemplateAsync(
            ContentLibraryVmTemplateUpdationParams contentLibraryVmTemplateUpdationParams,
            final ApiCallback<List<WithTaskContentLibraryVmTemplate>> _callback)
            throws ApiException {

        okhttp3.Call localVarCall =
                updateContentLibraryVmTemplateValidateBeforeCall(
                        contentLibraryVmTemplateUpdationParams, _callback);
        Type localVarReturnType =
                new TypeToken<List<WithTaskContentLibraryVmTemplate>>() {}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}

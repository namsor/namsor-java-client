/*
 * Namsor
 * <h2>NamSor SDK infers Gender and Origin from international names</h2>  <p>NamSor specialized data mining software recognizes the <strong>gender</strong>, the <strong>linguistic or cultural origin of personal names</strong> in any alphabet / language, with fine grain and high accuracy.</p>  <p>Visit <a href=\"http://namsor.com\">NamSor.com</a> to learn more.</p> 
 *
 * OpenAPI spec version: 1.1.0
 * Contact: contact@namsor.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.namsor.api;

import com.namsor.ApiCallback;
import com.namsor.ApiClient;
import com.namsor.ApiException;
import com.namsor.ApiResponse;
import com.namsor.Configuration;
import com.namsor.Pair;
import com.namsor.ProgressRequestBody;
import com.namsor.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.namsor.model.OutputNameForOrigin;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OriginApi {
    private ApiClient apiClient;

    public OriginApi() {
        this(Configuration.getDefaultApiClient());
    }

    public OriginApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for extractOrigin
     * @param firstName First Name (required)
     * @param lastName Last Name (required)
     * @param xChannelSecret Your API Key (Secret) (required)
     * @param xChannelUser Your API Channel (User) (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call extractOriginCall(String firstName, String lastName, String xChannelSecret, String xChannelUser, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/origin/{firstName}/{lastName}"
            .replaceAll("\\{" + "firstName" + "\\}", apiClient.escapeString(firstName.toString()))
            .replaceAll("\\{" + "lastName" + "\\}", apiClient.escapeString(lastName.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xChannelSecret != null)
        localVarHeaderParams.put("X-Channel-Secret", apiClient.parameterToString(xChannelSecret));
        if (xChannelUser != null)
        localVarHeaderParams.put("X-Channel-User", apiClient.parameterToString(xChannelUser));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call extractOriginValidateBeforeCall(String firstName, String lastName, String xChannelSecret, String xChannelUser, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'firstName' is set
        if (firstName == null) {
            throw new ApiException("Missing the required parameter 'firstName' when calling extractOrigin(Async)");
        }
        
        // verify the required parameter 'lastName' is set
        if (lastName == null) {
            throw new ApiException("Missing the required parameter 'lastName' when calling extractOrigin(Async)");
        }
        
        // verify the required parameter 'xChannelSecret' is set
        if (xChannelSecret == null) {
            throw new ApiException("Missing the required parameter 'xChannelSecret' when calling extractOrigin(Async)");
        }
        
        // verify the required parameter 'xChannelUser' is set
        if (xChannelUser == null) {
            throw new ApiException("Missing the required parameter 'xChannelUser' when calling extractOrigin(Async)");
        }
        

        com.squareup.okhttp.Call call = extractOriginCall(firstName, lastName, xChannelSecret, xChannelUser, progressListener, progressRequestListener);
        return call;

    }

    /**
     * To determin the origin of a name
     * To extract the likely linguistic/cultural origin of a personal name, at the country-level. 
     * @param firstName First Name (required)
     * @param lastName Last Name (required)
     * @param xChannelSecret Your API Key (Secret) (required)
     * @param xChannelUser Your API Channel (User) (required)
     * @return OutputNameForOrigin
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public OutputNameForOrigin extractOrigin(String firstName, String lastName, String xChannelSecret, String xChannelUser) throws ApiException {
        ApiResponse<OutputNameForOrigin> resp = extractOriginWithHttpInfo(firstName, lastName, xChannelSecret, xChannelUser);
        return resp.getData();
    }

    /**
     * To determin the origin of a name
     * To extract the likely linguistic/cultural origin of a personal name, at the country-level. 
     * @param firstName First Name (required)
     * @param lastName Last Name (required)
     * @param xChannelSecret Your API Key (Secret) (required)
     * @param xChannelUser Your API Channel (User) (required)
     * @return ApiResponse&lt;OutputNameForOrigin&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<OutputNameForOrigin> extractOriginWithHttpInfo(String firstName, String lastName, String xChannelSecret, String xChannelUser) throws ApiException {
        com.squareup.okhttp.Call call = extractOriginValidateBeforeCall(firstName, lastName, xChannelSecret, xChannelUser, null, null);
        Type localVarReturnType = new TypeToken<OutputNameForOrigin>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * To determin the origin of a name (asynchronously)
     * To extract the likely linguistic/cultural origin of a personal name, at the country-level. 
     * @param firstName First Name (required)
     * @param lastName Last Name (required)
     * @param xChannelSecret Your API Key (Secret) (required)
     * @param xChannelUser Your API Channel (User) (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call extractOriginAsync(String firstName, String lastName, String xChannelSecret, String xChannelUser, final ApiCallback<OutputNameForOrigin> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = extractOriginValidateBeforeCall(firstName, lastName, xChannelSecret, xChannelUser, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<OutputNameForOrigin>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}

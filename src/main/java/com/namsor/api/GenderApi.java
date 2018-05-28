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


import com.namsor.model.OutputNameForGender;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GenderApi {
    private ApiClient apiClient;

    public GenderApi() {
        this(Configuration.getDefaultApiClient());
    }

    public GenderApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for extractGender
     * @param firstName Firstname (required)
     * @param lastName Lastname (required)
     * @param xChannelSecret Your API Key (Secret) (required)
     * @param xChannelUser Your API Channel (User) (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call extractGenderCall(String firstName, String lastName, String xChannelSecret, String xChannelUser, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/gender/{firstName}/{lastName}"
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
    private com.squareup.okhttp.Call extractGenderValidateBeforeCall(String firstName, String lastName, String xChannelSecret, String xChannelUser, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'firstName' is set
        if (firstName == null) {
            throw new ApiException("Missing the required parameter 'firstName' when calling extractGender(Async)");
        }
        
        // verify the required parameter 'lastName' is set
        if (lastName == null) {
            throw new ApiException("Missing the required parameter 'lastName' when calling extractGender(Async)");
        }
        
        // verify the required parameter 'xChannelSecret' is set
        if (xChannelSecret == null) {
            throw new ApiException("Missing the required parameter 'xChannelSecret' when calling extractGender(Async)");
        }
        
        // verify the required parameter 'xChannelUser' is set
        if (xChannelUser == null) {
            throw new ApiException("Missing the required parameter 'xChannelUser' when calling extractGender(Async)");
        }
        

        com.squareup.okhttp.Call call = extractGenderCall(firstName, lastName, xChannelSecret, xChannelUser, progressListener, progressRequestListener);
        return call;

    }

    /**
     * To genderize one name
     * To genderize one name, for example John Smith. Passing a country ISO2 code for local context is optional but helps improve precision.
     * @param firstName Firstname (required)
     * @param lastName Lastname (required)
     * @param xChannelSecret Your API Key (Secret) (required)
     * @param xChannelUser Your API Channel (User) (required)
     * @return OutputNameForGender
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public OutputNameForGender extractGender(String firstName, String lastName, String xChannelSecret, String xChannelUser) throws ApiException {
        ApiResponse<OutputNameForGender> resp = extractGenderWithHttpInfo(firstName, lastName, xChannelSecret, xChannelUser);
        return resp.getData();
    }

    /**
     * To genderize one name
     * To genderize one name, for example John Smith. Passing a country ISO2 code for local context is optional but helps improve precision.
     * @param firstName Firstname (required)
     * @param lastName Lastname (required)
     * @param xChannelSecret Your API Key (Secret) (required)
     * @param xChannelUser Your API Channel (User) (required)
     * @return ApiResponse&lt;OutputNameForGender&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<OutputNameForGender> extractGenderWithHttpInfo(String firstName, String lastName, String xChannelSecret, String xChannelUser) throws ApiException {
        com.squareup.okhttp.Call call = extractGenderValidateBeforeCall(firstName, lastName, xChannelSecret, xChannelUser, null, null);
        Type localVarReturnType = new TypeToken<OutputNameForGender>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * To genderize one name (asynchronously)
     * To genderize one name, for example John Smith. Passing a country ISO2 code for local context is optional but helps improve precision.
     * @param firstName Firstname (required)
     * @param lastName Lastname (required)
     * @param xChannelSecret Your API Key (Secret) (required)
     * @param xChannelUser Your API Channel (User) (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call extractGenderAsync(String firstName, String lastName, String xChannelSecret, String xChannelUser, final ApiCallback<OutputNameForGender> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = extractGenderValidateBeforeCall(firstName, lastName, xChannelSecret, xChannelUser, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<OutputNameForGender>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for extractGenderLocal
     * @param firstName Firstname (required)
     * @param lastName Lastname (required)
     * @param countryIso2 Countryiso2 (required)
     * @param xChannelSecret Your API Key (Secret) (required)
     * @param xChannelUser Your API Channel (User) (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call extractGenderLocalCall(String firstName, String lastName, String countryIso2, String xChannelSecret, String xChannelUser, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/gender/{firstName}/{lastName}/{countryIso2}"
            .replaceAll("\\{" + "firstName" + "\\}", apiClient.escapeString(firstName.toString()))
            .replaceAll("\\{" + "lastName" + "\\}", apiClient.escapeString(lastName.toString()))
            .replaceAll("\\{" + "countryIso2" + "\\}", apiClient.escapeString(countryIso2.toString()));

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
    private com.squareup.okhttp.Call extractGenderLocalValidateBeforeCall(String firstName, String lastName, String countryIso2, String xChannelSecret, String xChannelUser, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'firstName' is set
        if (firstName == null) {
            throw new ApiException("Missing the required parameter 'firstName' when calling extractGenderLocal(Async)");
        }
        
        // verify the required parameter 'lastName' is set
        if (lastName == null) {
            throw new ApiException("Missing the required parameter 'lastName' when calling extractGenderLocal(Async)");
        }
        
        // verify the required parameter 'countryIso2' is set
        if (countryIso2 == null) {
            throw new ApiException("Missing the required parameter 'countryIso2' when calling extractGenderLocal(Async)");
        }
        
        // verify the required parameter 'xChannelSecret' is set
        if (xChannelSecret == null) {
            throw new ApiException("Missing the required parameter 'xChannelSecret' when calling extractGenderLocal(Async)");
        }
        
        // verify the required parameter 'xChannelUser' is set
        if (xChannelUser == null) {
            throw new ApiException("Missing the required parameter 'xChannelUser' when calling extractGenderLocal(Async)");
        }
        

        com.squareup.okhttp.Call call = extractGenderLocalCall(firstName, lastName, countryIso2, xChannelSecret, xChannelUser, progressListener, progressRequestListener);
        return call;

    }

    /**
     * To genderize one name, with the context of a given country ISO2
     * To genderize one name, for example John Smith, passing a country ISO2 code for local context to improve precision.
     * @param firstName Firstname (required)
     * @param lastName Lastname (required)
     * @param countryIso2 Countryiso2 (required)
     * @param xChannelSecret Your API Key (Secret) (required)
     * @param xChannelUser Your API Channel (User) (required)
     * @return OutputNameForGender
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public OutputNameForGender extractGenderLocal(String firstName, String lastName, String countryIso2, String xChannelSecret, String xChannelUser) throws ApiException {
        ApiResponse<OutputNameForGender> resp = extractGenderLocalWithHttpInfo(firstName, lastName, countryIso2, xChannelSecret, xChannelUser);
        return resp.getData();
    }

    /**
     * To genderize one name, with the context of a given country ISO2
     * To genderize one name, for example John Smith, passing a country ISO2 code for local context to improve precision.
     * @param firstName Firstname (required)
     * @param lastName Lastname (required)
     * @param countryIso2 Countryiso2 (required)
     * @param xChannelSecret Your API Key (Secret) (required)
     * @param xChannelUser Your API Channel (User) (required)
     * @return ApiResponse&lt;OutputNameForGender&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<OutputNameForGender> extractGenderLocalWithHttpInfo(String firstName, String lastName, String countryIso2, String xChannelSecret, String xChannelUser) throws ApiException {
        com.squareup.okhttp.Call call = extractGenderLocalValidateBeforeCall(firstName, lastName, countryIso2, xChannelSecret, xChannelUser, null, null);
        Type localVarReturnType = new TypeToken<OutputNameForGender>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * To genderize one name, with the context of a given country ISO2 (asynchronously)
     * To genderize one name, for example John Smith, passing a country ISO2 code for local context to improve precision.
     * @param firstName Firstname (required)
     * @param lastName Lastname (required)
     * @param countryIso2 Countryiso2 (required)
     * @param xChannelSecret Your API Key (Secret) (required)
     * @param xChannelUser Your API Channel (User) (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call extractGenderLocalAsync(String firstName, String lastName, String countryIso2, String xChannelSecret, String xChannelUser, final ApiCallback<OutputNameForGender> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = extractGenderLocalValidateBeforeCall(firstName, lastName, countryIso2, xChannelSecret, xChannelUser, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<OutputNameForGender>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
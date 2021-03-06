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


import com.namsor.model.FullNameListInput;
import com.namsor.model.ParsedNameListOutput;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParseListApi {
    private ApiClient apiClient;

    public ParseListApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ParseListApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for parseList
     * @param xChannelSecret Your API Key (Secret) (required)
     * @param xChannelUser Your API Channel (User) (required)
     * @param fullNameListInput A list of full names (up to 1000 at a time) (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call parseListCall(String xChannelSecret, String xChannelUser, FullNameListInput fullNameListInput, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = fullNameListInput;

        // create path and map variables
        String localVarPath = "/parseList";

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
            "application/json"
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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call parseListValidateBeforeCall(String xChannelSecret, String xChannelUser, FullNameListInput fullNameListInput, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'xChannelSecret' is set
        if (xChannelSecret == null) {
            throw new ApiException("Missing the required parameter 'xChannelSecret' when calling parseList(Async)");
        }
        
        // verify the required parameter 'xChannelUser' is set
        if (xChannelUser == null) {
            throw new ApiException("Missing the required parameter 'xChannelUser' when calling parseList(Async)");
        }
        
        // verify the required parameter 'fullNameListInput' is set
        if (fullNameListInput == null) {
            throw new ApiException("Missing the required parameter 'fullNameListInput' when calling parseList(Async)");
        }
        

        com.squareup.okhttp.Call call = parseListCall(xChannelSecret, xChannelUser, fullNameListInput, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Parse many names (up to 1000)
     * Parse a list of names into firstName, lastName components, specifying how they should be parsed.    nameFormatTip:ORDER_FNLN means that the order has to be firstName, lastName (the API will only choose where to split the name). Possible values:  ORDER_FNLN, // firstName first  ORDER_LNFN, // lastName first  ORDER_FNLN_OR_LNFN, // make best guess, individually name by name  ORDER_FNLN_OR_LNFN_ALLSAME // make best guess and apply to ALL the names (if most names are FNLN, then ALL names will be considered FNLN)
     * @param xChannelSecret Your API Key (Secret) (required)
     * @param xChannelUser Your API Channel (User) (required)
     * @param fullNameListInput A list of full names (up to 1000 at a time) (required)
     * @return ParsedNameListOutput
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ParsedNameListOutput parseList(String xChannelSecret, String xChannelUser, FullNameListInput fullNameListInput) throws ApiException {
        ApiResponse<ParsedNameListOutput> resp = parseListWithHttpInfo(xChannelSecret, xChannelUser, fullNameListInput);
        return resp.getData();
    }

    /**
     * Parse many names (up to 1000)
     * Parse a list of names into firstName, lastName components, specifying how they should be parsed.    nameFormatTip:ORDER_FNLN means that the order has to be firstName, lastName (the API will only choose where to split the name). Possible values:  ORDER_FNLN, // firstName first  ORDER_LNFN, // lastName first  ORDER_FNLN_OR_LNFN, // make best guess, individually name by name  ORDER_FNLN_OR_LNFN_ALLSAME // make best guess and apply to ALL the names (if most names are FNLN, then ALL names will be considered FNLN)
     * @param xChannelSecret Your API Key (Secret) (required)
     * @param xChannelUser Your API Channel (User) (required)
     * @param fullNameListInput A list of full names (up to 1000 at a time) (required)
     * @return ApiResponse&lt;ParsedNameListOutput&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ParsedNameListOutput> parseListWithHttpInfo(String xChannelSecret, String xChannelUser, FullNameListInput fullNameListInput) throws ApiException {
        com.squareup.okhttp.Call call = parseListValidateBeforeCall(xChannelSecret, xChannelUser, fullNameListInput, null, null);
        Type localVarReturnType = new TypeToken<ParsedNameListOutput>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Parse many names (up to 1000) (asynchronously)
     * Parse a list of names into firstName, lastName components, specifying how they should be parsed.    nameFormatTip:ORDER_FNLN means that the order has to be firstName, lastName (the API will only choose where to split the name). Possible values:  ORDER_FNLN, // firstName first  ORDER_LNFN, // lastName first  ORDER_FNLN_OR_LNFN, // make best guess, individually name by name  ORDER_FNLN_OR_LNFN_ALLSAME // make best guess and apply to ALL the names (if most names are FNLN, then ALL names will be considered FNLN)
     * @param xChannelSecret Your API Key (Secret) (required)
     * @param xChannelUser Your API Channel (User) (required)
     * @param fullNameListInput A list of full names (up to 1000 at a time) (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call parseListAsync(String xChannelSecret, String xChannelUser, FullNameListInput fullNameListInput, final ApiCallback<ParsedNameListOutput> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = parseListValidateBeforeCall(xChannelSecret, xChannelUser, fullNameListInput, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ParsedNameListOutput>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}

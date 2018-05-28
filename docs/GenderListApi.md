# GenderListApi

All URIs are relative to *https://api.namsor.com/onomastics/api/json*

Method | HTTP request | Description
------------- | ------------- | -------------
[**extractGenderList**](GenderListApi.md#extractGenderList) | **POST** /genderList | To genderize many names (up to 1000).


<a name="extractGenderList"></a>
# **extractGenderList**
> ExtractGenderListOutput extractGenderList(xChannelSecret, xChannelUser, genderizerList)

To genderize many names (up to 1000).

To genderize a list of names (up to 1000 at a time). For each name, passing a country ISO2 code for local context is optional but helps improve precision.

### Example
```java
// Import classes:
//import com.namsor.ApiException;
//import com.namsor.api.GenderListApi;


GenderListApi apiInstance = new GenderListApi();
String xChannelSecret = "\"\""; // String | Your API Key (Secret)
String xChannelUser = "\"\""; // String | Your API Channel (User)
NamesListInput genderizerList = new NamesListInput(); // NamesListInput | A list of names to genderize (up to 1000 at a time) 
try {
    ExtractGenderListOutput result = apiInstance.extractGenderList(xChannelSecret, xChannelUser, genderizerList);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GenderListApi#extractGenderList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xChannelSecret** | **String**| Your API Key (Secret) |
 **xChannelUser** | **String**| Your API Channel (User) |
 **genderizerList** | [**NamesListInput**](NamesListInput.md)| A list of names to genderize (up to 1000 at a time)  |

### Return type

[**ExtractGenderListOutput**](ExtractGenderListOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


# ParseApi

All URIs are relative to *https://api.namsor.com/onomastics/api/json*

Method | HTTP request | Description
------------- | ------------- | -------------
[**parseName**](ParseApi.md#parseName) | **GET** /parse/{fullName} | Parse a fullName into firstName, lastName components.


<a name="parseName"></a>
# **parseName**
> OutputParsedName parseName(fullName, xChannelSecret, xChannelUser)

Parse a fullName into firstName, lastName components.

Parse a fullName into firstName, lastName components. 

### Example
```java
// Import classes:
//import com.namsor.ApiException;
//import com.namsor.api.ParseApi;


ParseApi apiInstance = new ParseApi();
String fullName = "\"John Smith\""; // String | Full name
String xChannelSecret = "\"\""; // String | Your API Key (Secret)
String xChannelUser = "\"\""; // String | Your API Channel (User)
try {
    OutputParsedName result = apiInstance.parseName(fullName, xChannelSecret, xChannelUser);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ParseApi#parseName");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fullName** | **String**| Full name |
 **xChannelSecret** | **String**| Your API Key (Secret) |
 **xChannelUser** | **String**| Your API Channel (User) |

### Return type

[**OutputParsedName**](OutputParsedName.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


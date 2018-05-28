# OriginApi

All URIs are relative to *https://api.namsor.com/onomastics/api/json*

Method | HTTP request | Description
------------- | ------------- | -------------
[**extractOrigin**](OriginApi.md#extractOrigin) | **GET** /origin/{firstName}/{lastName} | To determin the origin of a name


<a name="extractOrigin"></a>
# **extractOrigin**
> OutputNameForOrigin extractOrigin(firstName, lastName, xChannelSecret, xChannelUser)

To determin the origin of a name

To extract the likely linguistic/cultural origin of a personal name, at the country-level. 

### Example
```java
// Import classes:
//import com.namsor.ApiException;
//import com.namsor.api.OriginApi;


OriginApi apiInstance = new OriginApi();
String firstName = "\"John\""; // String | First Name
String lastName = "\"Smith\""; // String | Last Name
String xChannelSecret = "\"\""; // String | Your API Key (Secret)
String xChannelUser = "\"\""; // String | Your API Channel (User)
try {
    OutputNameForOrigin result = apiInstance.extractOrigin(firstName, lastName, xChannelSecret, xChannelUser);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OriginApi#extractOrigin");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **firstName** | **String**| First Name |
 **lastName** | **String**| Last Name |
 **xChannelSecret** | **String**| Your API Key (Secret) |
 **xChannelUser** | **String**| Your API Channel (User) |

### Return type

[**OutputNameForOrigin**](OutputNameForOrigin.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


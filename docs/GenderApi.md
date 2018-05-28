# GenderApi

All URIs are relative to *https://api.namsor.com/onomastics/api/json*

Method | HTTP request | Description
------------- | ------------- | -------------
[**extractGender**](GenderApi.md#extractGender) | **GET** /gender/{firstName}/{lastName} | To genderize one name
[**extractGenderLocal**](GenderApi.md#extractGenderLocal) | **GET** /gender/{firstName}/{lastName}/{countryIso2} | To genderize one name, with the context of a given country ISO2


<a name="extractGender"></a>
# **extractGender**
> OutputNameForGender extractGender(firstName, lastName, xChannelSecret, xChannelUser)

To genderize one name

To genderize one name, for example John Smith. Passing a country ISO2 code for local context is optional but helps improve precision.

### Example
```java
// Import classes:
//import com.namsor.ApiException;
//import com.namsor.api.GenderApi;


GenderApi apiInstance = new GenderApi();
String firstName = "\"John\""; // String | Firstname
String lastName = "\"Smith\""; // String | Lastname
String xChannelSecret = "\"\""; // String | Your API Key (Secret)
String xChannelUser = "\"\""; // String | Your API Channel (User)
try {
    OutputNameForGender result = apiInstance.extractGender(firstName, lastName, xChannelSecret, xChannelUser);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GenderApi#extractGender");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **firstName** | **String**| Firstname |
 **lastName** | **String**| Lastname |
 **xChannelSecret** | **String**| Your API Key (Secret) |
 **xChannelUser** | **String**| Your API Channel (User) |

### Return type

[**OutputNameForGender**](OutputNameForGender.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="extractGenderLocal"></a>
# **extractGenderLocal**
> OutputNameForGender extractGenderLocal(firstName, lastName, countryIso2, xChannelSecret, xChannelUser)

To genderize one name, with the context of a given country ISO2

To genderize one name, for example John Smith, passing a country ISO2 code for local context to improve precision.

### Example
```java
// Import classes:
//import com.namsor.ApiException;
//import com.namsor.api.GenderApi;


GenderApi apiInstance = new GenderApi();
String firstName = "\"John\""; // String | Firstname
String lastName = "\"Smith\""; // String | Lastname
String countryIso2 = "\"us\""; // String | Countryiso2
String xChannelSecret = "\"\""; // String | Your API Key (Secret)
String xChannelUser = "\"\""; // String | Your API Channel (User)
try {
    OutputNameForGender result = apiInstance.extractGenderLocal(firstName, lastName, countryIso2, xChannelSecret, xChannelUser);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GenderApi#extractGenderLocal");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **firstName** | **String**| Firstname |
 **lastName** | **String**| Lastname |
 **countryIso2** | **String**| Countryiso2 |
 **xChannelSecret** | **String**| Your API Key (Secret) |
 **xChannelUser** | **String**| Your API Channel (User) |

### Return type

[**OutputNameForGender**](OutputNameForGender.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


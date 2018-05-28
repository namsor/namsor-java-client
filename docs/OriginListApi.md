# OriginListApi

All URIs are relative to *https://api.namsor.com/onomastics/api/json*

Method | HTTP request | Description
------------- | ------------- | -------------
[**extractOriginList**](OriginListApi.md#extractOriginList) | **POST** /originList | To determin the origin of many names (up to 1000)


<a name="extractOriginList"></a>
# **extractOriginList**
> ExtractOriginListOutput extractOriginList(xChannelSecret, xChannelUser, namesListInput)

To determin the origin of many names (up to 1000)

To extract the likely linguistic/cultural origins of each name in a list (up to 1000 names) at country-level. 

### Example
```java
// Import classes:
//import com.namsor.ApiException;
//import com.namsor.api.OriginListApi;


OriginListApi apiInstance = new OriginListApi();
String xChannelSecret = "\"\""; // String | Your API Key (Secret)
String xChannelUser = "\"\""; // String | Your API Channel (User)
List<NamesListInput> namesListInput = Arrays.asList(new NamesListInput()); // List<NamesListInput> | A list of names to extract origin (up to 1000 at a time)
try {
    ExtractOriginListOutput result = apiInstance.extractOriginList(xChannelSecret, xChannelUser, namesListInput);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OriginListApi#extractOriginList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xChannelSecret** | **String**| Your API Key (Secret) |
 **xChannelUser** | **String**| Your API Channel (User) |
 **namesListInput** | [**List&lt;NamesListInput&gt;**](NamesListInput.md)| A list of names to extract origin (up to 1000 at a time) |

### Return type

[**ExtractOriginListOutput**](ExtractOriginListOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


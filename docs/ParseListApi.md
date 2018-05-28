# ParseListApi

All URIs are relative to *https://api.namsor.com/onomastics/api/json*

Method | HTTP request | Description
------------- | ------------- | -------------
[**parseList**](ParseListApi.md#parseList) | **POST** /parseList | Parse many names (up to 1000)


<a name="parseList"></a>
# **parseList**
> ParsedNameListOutput parseList(xChannelSecret, xChannelUser, fullNameListInput)

Parse many names (up to 1000)

Parse a list of names into firstName, lastName components, specifying how they should be parsed.    nameFormatTip:ORDER_FNLN means that the order has to be firstName, lastName (the API will only choose where to split the name). Possible values:  ORDER_FNLN, // firstName first  ORDER_LNFN, // lastName first  ORDER_FNLN_OR_LNFN, // make best guess, individually name by name  ORDER_FNLN_OR_LNFN_ALLSAME // make best guess and apply to ALL the names (if most names are FNLN, then ALL names will be considered FNLN)

### Example
```java
// Import classes:
//import com.namsor.ApiException;
//import com.namsor.api.ParseListApi;


ParseListApi apiInstance = new ParseListApi();
String xChannelSecret = "\"\""; // String | Your API Key (Secret)
String xChannelUser = "\"\""; // String | Your API Channel (User)
FullNameListInput fullNameListInput = new FullNameListInput(); // FullNameListInput | A list of full names (up to 1000 at a time)
try {
    ParsedNameListOutput result = apiInstance.parseList(xChannelSecret, xChannelUser, fullNameListInput);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ParseListApi#parseList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xChannelSecret** | **String**| Your API Key (Secret) |
 **xChannelUser** | **String**| Your API Channel (User) |
 **fullNameListInput** | [**FullNameListInput**](FullNameListInput.md)| A list of full names (up to 1000 at a time) |

### Return type

[**ParsedNameListOutput**](ParsedNameListOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


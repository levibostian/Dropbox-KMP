# AccountApi

All URIs are relative to *https://api.dropbox.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**call2accountSetProfilePhotoPost**](AccountApi.md#call2accountSetProfilePhotoPost) | **POST** /2/account/set_profile_photo | set_profile_photo


<a name="call2accountSetProfilePhotoPost"></a>
# **call2accountSetProfilePhotoPost**
> kotlin.String call2accountSetProfilePhotoPost(body)

set_profile_photo

[set_profile_photo](https://www.dropbox.com/developers/documentation/http/documentation#account-set_profile_photo)  scope: &#x60;account_info.write&#x60;  Sets a user&#39;s profile photo.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = AccountApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.call2accountSetProfilePhotoPost(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountApi#call2accountSetProfilePhotoPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountApi#call2accountSetProfilePhotoPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **kotlin.String**|  | [optional]

### Return type

**kotlin.String**

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


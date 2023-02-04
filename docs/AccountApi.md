# AccountApi

All URIs are relative to *https://api.dropbox.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**setProfilePhoto**](AccountApi.md#setProfilePhoto) | **POST** /2/account/set_profile_photo | set_profile_photo


<a name="setProfilePhoto"></a>
# **setProfilePhoto**
> kotlin.String setProfilePhoto(body)

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
    val result : kotlin.String = apiInstance.setProfilePhoto(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountApi#setProfilePhoto")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountApi#setProfilePhoto")
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


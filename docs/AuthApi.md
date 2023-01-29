# AuthApi

All URIs are relative to *https://api.dropbox.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**call2authTokenFromOauth1Post**](AuthApi.md#call2authTokenFromOauth1Post) | **POST** /2/auth/token/from_oauth1 | token/from_oauth1
[**call2authTokenRevokePost**](AuthApi.md#call2authTokenRevokePost) | **POST** /2/auth/token/revoke | token/revoke


<a name="call2authTokenFromOauth1Post"></a>
# **call2authTokenFromOauth1Post**
> kotlin.String call2authTokenFromOauth1Post(body)

token/from_oauth1

[token/from_oauth1](https://www.dropbox.com/developers/documentation/http/documentation#auth-token-from_oauth1)  scope: &#x60;None&#x60;  Creates an OAuth 2.0 access token from the supplied OAuth 1.0 access token.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = AuthApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.call2authTokenFromOauth1Post(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AuthApi#call2authTokenFromOauth1Post")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AuthApi#call2authTokenFromOauth1Post")
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

<a name="call2authTokenRevokePost"></a>
# **call2authTokenRevokePost**
> call2authTokenRevokePost()

token/revoke

[token/revoke](https://www.dropbox.com/developers/documentation/http/documentation#auth-token-revoke)  scope: &#x60;None&#x60;  Disables the access token used to authenticate the call.      

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = AuthApi()
try {
    apiInstance.call2authTokenRevokePost()
} catch (e: ClientException) {
    println("4xx response calling AuthApi#call2authTokenRevokePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AuthApi#call2authTokenRevokePost")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


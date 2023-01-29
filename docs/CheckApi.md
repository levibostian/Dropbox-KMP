# CheckApi

All URIs are relative to *https://api.dropbox.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**call2checkAppPost**](CheckApi.md#call2checkAppPost) | **POST** /2/check/app | app
[**call2checkUserPost**](CheckApi.md#call2checkUserPost) | **POST** /2/check/user | user


<a name="call2checkAppPost"></a>
# **call2checkAppPost**
> kotlin.String call2checkAppPost(contentType, body)

app

[app](https://www.dropbox.com/developers/documentation/http/documentation#check-app)  scope: &#x60;None&#x60;  This endpoint performs App Authentication, validating the supplied app key and secret, and returns the supplied string, to allow you to test your code and connection to the Dropbox API. It has no other effect. If you receive an HTTP 200 response with the supplied query, it indicates at least part of the Dropbox API infrastructure is working and that the app key and secret valid.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = CheckApi()
val contentType : kotlin.String = application/json // kotlin.String | 
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.call2checkAppPost(contentType, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CheckApi#call2checkAppPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CheckApi#call2checkAppPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**|  | [optional]
 **body** | **kotlin.String**|  | [optional]

### Return type

**kotlin.String**

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="call2checkUserPost"></a>
# **call2checkUserPost**
> kotlin.String call2checkUserPost(contentType, body)

user

[user](https://www.dropbox.com/developers/documentation/http/documentation#check-user)  scope: &#x60;None&#x60;  This endpoint performs User Authentication, validating the supplied access token, and returns the supplied string, to allow you to test your code and connection to the Dropbox API. It has no other effect. If you receive an HTTP 200 response with the supplied query, it indicates at least part of the Dropbox API infrastructure is working and that the access token is valid.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = CheckApi()
val contentType : kotlin.String = application/json // kotlin.String | 
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.call2checkUserPost(contentType, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CheckApi#call2checkUserPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CheckApi#call2checkUserPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**|  | [optional]
 **body** | **kotlin.String**|  | [optional]

### Return type

**kotlin.String**

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


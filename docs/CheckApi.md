# CheckApi

All URIs are relative to *https://api.dropbox.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**app**](CheckApi.md#app) | **POST** /2/check/app | app
[**user**](CheckApi.md#user) | **POST** /2/check/user | user


<a name="app"></a>
# **app**
> kotlin.String app(body)

app

[app](https://www.dropbox.com/developers/documentation/http/documentation#check-app)  scope: &#x60;None&#x60;  This endpoint performs App Authentication, validating the supplied app key and secret, and returns the supplied string, to allow you to test your code and connection to the Dropbox API. It has no other effect. If you receive an HTTP 200 response with the supplied query, it indicates at least part of the Dropbox API infrastructure is working and that the app key and secret valid.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = CheckApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.app(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CheckApi#app")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CheckApi#app")
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

<a name="user"></a>
# **user**
> kotlin.String user(body)

user

[user](https://www.dropbox.com/developers/documentation/http/documentation#check-user)  scope: &#x60;None&#x60;  This endpoint performs User Authentication, validating the supplied access token, and returns the supplied string, to allow you to test your code and connection to the Dropbox API. It has no other effect. If you receive an HTTP 200 response with the supplied query, it indicates at least part of the Dropbox API infrastructure is working and that the access token is valid.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = CheckApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.user(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CheckApi#user")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CheckApi#user")
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


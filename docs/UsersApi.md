# UsersApi

All URIs are relative to *https://api.dropbox.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**call2usersFeaturesGetValuesPost**](UsersApi.md#call2usersFeaturesGetValuesPost) | **POST** /2/users/features/get_values | features/get_values
[**call2usersGetAccountBatchPost**](UsersApi.md#call2usersGetAccountBatchPost) | **POST** /2/users/get_account_batch | get_account_batch
[**call2usersGetAccountPost**](UsersApi.md#call2usersGetAccountPost) | **POST** /2/users/get_account | get_account
[**call2usersGetCurrentAccountPost**](UsersApi.md#call2usersGetCurrentAccountPost) | **POST** /2/users/get_current_account | get_current_account
[**call2usersGetSpaceUsagePost**](UsersApi.md#call2usersGetSpaceUsagePost) | **POST** /2/users/get_space_usage | get_space_usage


<a name="call2usersFeaturesGetValuesPost"></a>
# **call2usersFeaturesGetValuesPost**
> kotlin.String call2usersFeaturesGetValuesPost(body)

features/get_values

[features/get_values](https://www.dropbox.com/developers/documentation/http/documentation#users-features-get_values)  scope: &#x60;account_info.read&#x60;  Get a list of feature values that may be configured for the current account.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = UsersApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.call2usersFeaturesGetValuesPost(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#call2usersFeaturesGetValuesPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#call2usersFeaturesGetValuesPost")
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

<a name="call2usersGetAccountBatchPost"></a>
# **call2usersGetAccountBatchPost**
> kotlin.String call2usersGetAccountBatchPost(body)

get_account_batch

[get_account_batch](https://www.dropbox.com/developers/documentation/http/documentation#users-get_account_batch)  scope: &#x60;sharing.read&#x60;  Get information about multiple user accounts.  At most 300 accounts may be queried per request.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = UsersApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.call2usersGetAccountBatchPost(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#call2usersGetAccountBatchPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#call2usersGetAccountBatchPost")
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

<a name="call2usersGetAccountPost"></a>
# **call2usersGetAccountPost**
> kotlin.String call2usersGetAccountPost(body)

get_account

[get_account](https://www.dropbox.com/developers/documentation/http/documentation#users-get_account)  scope: &#x60;sharing.read&#x60;  Get information about a user&#39;s account.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = UsersApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.call2usersGetAccountPost(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#call2usersGetAccountPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#call2usersGetAccountPost")
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

<a name="call2usersGetCurrentAccountPost"></a>
# **call2usersGetCurrentAccountPost**
> kotlin.String call2usersGetCurrentAccountPost()

get_current_account

[get_current_account](https://www.dropbox.com/developers/documentation/http/documentation#users-get_current_account)  scope: &#x60;account_info.read&#x60;  Get information about the current user&#39;s account.      

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = UsersApi()
try {
    val result : kotlin.String = apiInstance.call2usersGetCurrentAccountPost()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#call2usersGetCurrentAccountPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#call2usersGetCurrentAccountPost")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**kotlin.String**

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="call2usersGetSpaceUsagePost"></a>
# **call2usersGetSpaceUsagePost**
> kotlin.String call2usersGetSpaceUsagePost()

get_space_usage

[get_space_usage](https://www.dropbox.com/developers/documentation/http/documentation#users-get_space_usage)  scope: &#x60;account_info.read&#x60;  Get the space usage information for the current user&#39;s account.      

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = UsersApi()
try {
    val result : kotlin.String = apiInstance.call2usersGetSpaceUsagePost()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#call2usersGetSpaceUsagePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#call2usersGetSpaceUsagePost")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**kotlin.String**

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


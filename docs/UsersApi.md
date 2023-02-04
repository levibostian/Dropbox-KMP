# UsersApi

All URIs are relative to *https://api.dropbox.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**featuresGetValues**](UsersApi.md#featuresGetValues) | **POST** /2/users/features/get_values | features/get_values
[**getAccount**](UsersApi.md#getAccount) | **POST** /2/users/get_account | get_account
[**getAccountBatch**](UsersApi.md#getAccountBatch) | **POST** /2/users/get_account_batch | get_account_batch
[**getCurrentAccount**](UsersApi.md#getCurrentAccount) | **POST** /2/users/get_current_account | get_current_account
[**getSpaceUsage**](UsersApi.md#getSpaceUsage) | **POST** /2/users/get_space_usage | get_space_usage


<a name="featuresGetValues"></a>
# **featuresGetValues**
> kotlin.String featuresGetValues(body)

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
    val result : kotlin.String = apiInstance.featuresGetValues(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#featuresGetValues")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#featuresGetValues")
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

<a name="getAccount"></a>
# **getAccount**
> kotlin.String getAccount(body)

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
    val result : kotlin.String = apiInstance.getAccount(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#getAccount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#getAccount")
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

<a name="getAccountBatch"></a>
# **getAccountBatch**
> kotlin.String getAccountBatch(body)

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
    val result : kotlin.String = apiInstance.getAccountBatch(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#getAccountBatch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#getAccountBatch")
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

<a name="getCurrentAccount"></a>
# **getCurrentAccount**
> kotlin.String getCurrentAccount()

get_current_account

[get_current_account](https://www.dropbox.com/developers/documentation/http/documentation#users-get_current_account)  scope: &#x60;account_info.read&#x60;  Get information about the current user&#39;s account.      

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = UsersApi()
try {
    val result : kotlin.String = apiInstance.getCurrentAccount()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#getCurrentAccount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#getCurrentAccount")
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

<a name="getSpaceUsage"></a>
# **getSpaceUsage**
> kotlin.String getSpaceUsage()

get_space_usage

[get_space_usage](https://www.dropbox.com/developers/documentation/http/documentation#users-get_space_usage)  scope: &#x60;account_info.read&#x60;  Get the space usage information for the current user&#39;s account.      

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = UsersApi()
try {
    val result : kotlin.String = apiInstance.getSpaceUsage()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#getSpaceUsage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#getSpaceUsage")
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


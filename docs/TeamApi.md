# TeamApi

All URIs are relative to *https://api.dropbox.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**call2teamFeaturesGetValuesPost**](TeamApi.md#call2teamFeaturesGetValuesPost) | **POST** /2/team/features/get_values | features/get_values
[**call2teamGetInfoPost**](TeamApi.md#call2teamGetInfoPost) | **POST** /2/team/get_info | get_info
[**call2teamTokenGetAuthenticatedAdminPost**](TeamApi.md#call2teamTokenGetAuthenticatedAdminPost) | **POST** /2/team/token/get_authenticated_admin | token/get_authenticated_admin


<a name="call2teamFeaturesGetValuesPost"></a>
# **call2teamFeaturesGetValuesPost**
> kotlin.String call2teamFeaturesGetValuesPost(contentType, body)

features/get_values

[features/get_values](https://www.dropbox.com/developers/documentation/http/teams#team-features-get_values)  scope: &#x60;team_info.read&#x60;  Get the values for one or more featues. This route allows you to check your account&#39;s capability for what feature you can access or what value you have for certain features. Permission : Team information.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = TeamApi()
val contentType : kotlin.String = application/json // kotlin.String | 
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.call2teamFeaturesGetValuesPost(contentType, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamApi#call2teamFeaturesGetValuesPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamApi#call2teamFeaturesGetValuesPost")
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

<a name="call2teamGetInfoPost"></a>
# **call2teamGetInfoPost**
> kotlin.String call2teamGetInfoPost()

get_info

[get_info](https://www.dropbox.com/developers/documentation/http/teams#team-get_info)  scope: &#x60;team_info.read&#x60;  Retrieves information about a team.      

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = TeamApi()
try {
    val result : kotlin.String = apiInstance.call2teamGetInfoPost()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamApi#call2teamGetInfoPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamApi#call2teamGetInfoPost")
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

<a name="call2teamTokenGetAuthenticatedAdminPost"></a>
# **call2teamTokenGetAuthenticatedAdminPost**
> kotlin.String call2teamTokenGetAuthenticatedAdminPost()

token/get_authenticated_admin

[token/get_authenticated_admin](https://www.dropbox.com/developers/documentation/http/teams#team-token-get_authenticated_admin)  scope: &#x60;team_info.read&#x60;  Returns the member profile of the admin who generated the team access token used to make the call.      

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = TeamApi()
try {
    val result : kotlin.String = apiInstance.call2teamTokenGetAuthenticatedAdminPost()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamApi#call2teamTokenGetAuthenticatedAdminPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamApi#call2teamTokenGetAuthenticatedAdminPost")
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


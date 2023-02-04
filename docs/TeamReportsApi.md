# TeamReportsApi

All URIs are relative to *https://api.dropbox.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**call2teamReportsGetActivityPost**](TeamReportsApi.md#call2teamReportsGetActivityPost) | **POST** /2/team/reports/get_activity | reports/get_activity
[**call2teamReportsGetDevicesPost**](TeamReportsApi.md#call2teamReportsGetDevicesPost) | **POST** /2/team/reports/get_devices | reports/get_devices
[**call2teamReportsGetMembershipPost**](TeamReportsApi.md#call2teamReportsGetMembershipPost) | **POST** /2/team/reports/get_membership | reports/get_membership
[**call2teamReportsGetStoragePost**](TeamReportsApi.md#call2teamReportsGetStoragePost) | **POST** /2/team/reports/get_storage | reports/get_storage


<a name="call2teamReportsGetActivityPost"></a>
# **call2teamReportsGetActivityPost**
> call2teamReportsGetActivityPost(body)

reports/get_activity

[reports/get_activity](https://www.dropbox.com/developers/documentation/http/teams#team-reports-get_activity)  scope: &#x60;team_info.read&#x60;  Retrieves reporting data about a team&#39;s user activity.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = TeamReportsApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    apiInstance.call2teamReportsGetActivityPost(body)
} catch (e: ClientException) {
    println("4xx response calling TeamReportsApi#call2teamReportsGetActivityPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamReportsApi#call2teamReportsGetActivityPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **kotlin.String**|  | [optional]

### Return type

null (empty response body)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="call2teamReportsGetDevicesPost"></a>
# **call2teamReportsGetDevicesPost**
> call2teamReportsGetDevicesPost(body)

reports/get_devices

[reports/get_devices](https://www.dropbox.com/developers/documentation/http/teams#team-reports-get_devices)  scope: &#x60;team_info.read&#x60;  Retrieves reporting data about a team&#39;s linked devices.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = TeamReportsApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    apiInstance.call2teamReportsGetDevicesPost(body)
} catch (e: ClientException) {
    println("4xx response calling TeamReportsApi#call2teamReportsGetDevicesPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamReportsApi#call2teamReportsGetDevicesPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **kotlin.String**|  | [optional]

### Return type

null (empty response body)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="call2teamReportsGetMembershipPost"></a>
# **call2teamReportsGetMembershipPost**
> call2teamReportsGetMembershipPost(body)

reports/get_membership

[reports/get_membership](https://www.dropbox.com/developers/documentation/http/teams#team-reports-get_membership)  scope: &#x60;team_info.read&#x60;  Retrieves reporting data about a team&#39;s membership.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = TeamReportsApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    apiInstance.call2teamReportsGetMembershipPost(body)
} catch (e: ClientException) {
    println("4xx response calling TeamReportsApi#call2teamReportsGetMembershipPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamReportsApi#call2teamReportsGetMembershipPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **kotlin.String**|  | [optional]

### Return type

null (empty response body)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="call2teamReportsGetStoragePost"></a>
# **call2teamReportsGetStoragePost**
> call2teamReportsGetStoragePost(body)

reports/get_storage

[reports/get_storage](https://www.dropbox.com/developers/documentation/http/teams#team-reports-get_storage)  scope: &#x60;team_info.read&#x60;  Retrieves reporting data about a team&#39;s storage usage.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = TeamReportsApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    apiInstance.call2teamReportsGetStoragePost(body)
} catch (e: ClientException) {
    println("4xx response calling TeamReportsApi#call2teamReportsGetStoragePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamReportsApi#call2teamReportsGetStoragePost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **kotlin.String**|  | [optional]

### Return type

null (empty response body)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


# TeamLinkedAppsApi

All URIs are relative to *https://api.dropbox.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**call2teamLinkedAppsListMemberLinkedAppsPost**](TeamLinkedAppsApi.md#call2teamLinkedAppsListMemberLinkedAppsPost) | **POST** /2/team/linked_apps/list_member_linked_apps | linked_apps/list_member_linked_apps
[**call2teamLinkedAppsListMembersLinkedAppsPost**](TeamLinkedAppsApi.md#call2teamLinkedAppsListMembersLinkedAppsPost) | **POST** /2/team/linked_apps/list_members_linked_apps | linked_apps/list_members_linked_apps
[**call2teamLinkedAppsRevokeLinkedAppBatchPost**](TeamLinkedAppsApi.md#call2teamLinkedAppsRevokeLinkedAppBatchPost) | **POST** /2/team/linked_apps/revoke_linked_app_batch | linked_apps/revoke_linked_app_batch
[**call2teamLinkedAppsRevokeLinkedAppPost**](TeamLinkedAppsApi.md#call2teamLinkedAppsRevokeLinkedAppPost) | **POST** /2/team/linked_apps/revoke_linked_app | linked_apps/revoke_linked_app


<a name="call2teamLinkedAppsListMemberLinkedAppsPost"></a>
# **call2teamLinkedAppsListMemberLinkedAppsPost**
> call2teamLinkedAppsListMemberLinkedAppsPost(contentType, body)

linked_apps/list_member_linked_apps

[linked_apps/list_member_linked_apps](https://www.dropbox.com/developers/documentation/http/teams#team-linked_apps-list_member_linked_apps)  scope: &#x60;sessions.list&#x60;  List all linked applications of the team member. Note, this endpoint does not list any team-linked applications.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = TeamLinkedAppsApi()
val contentType : kotlin.String = application/json // kotlin.String | 
val body : kotlin.String = body_example // kotlin.String | 
try {
    apiInstance.call2teamLinkedAppsListMemberLinkedAppsPost(contentType, body)
} catch (e: ClientException) {
    println("4xx response calling TeamLinkedAppsApi#call2teamLinkedAppsListMemberLinkedAppsPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamLinkedAppsApi#call2teamLinkedAppsListMemberLinkedAppsPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**|  | [optional]
 **body** | **kotlin.String**|  | [optional]

### Return type

null (empty response body)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="call2teamLinkedAppsListMembersLinkedAppsPost"></a>
# **call2teamLinkedAppsListMembersLinkedAppsPost**
> call2teamLinkedAppsListMembersLinkedAppsPost(contentType, body)

linked_apps/list_members_linked_apps

[linked_apps/list_members_linked_apps](https://www.dropbox.com/developers/documentation/http/teams#team-linked_apps-list_members_linked_apps)  scope: &#x60;sessions.list&#x60;  List all applications linked to the team members&#39; accounts. Note, this endpoint does not list any team-linked applications.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = TeamLinkedAppsApi()
val contentType : kotlin.String = application/json // kotlin.String | 
val body : kotlin.String = body_example // kotlin.String | 
try {
    apiInstance.call2teamLinkedAppsListMembersLinkedAppsPost(contentType, body)
} catch (e: ClientException) {
    println("4xx response calling TeamLinkedAppsApi#call2teamLinkedAppsListMembersLinkedAppsPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamLinkedAppsApi#call2teamLinkedAppsListMembersLinkedAppsPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**|  | [optional]
 **body** | **kotlin.String**|  | [optional]

### Return type

null (empty response body)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="call2teamLinkedAppsRevokeLinkedAppBatchPost"></a>
# **call2teamLinkedAppsRevokeLinkedAppBatchPost**
> call2teamLinkedAppsRevokeLinkedAppBatchPost(contentType, body)

linked_apps/revoke_linked_app_batch

[linked_apps/revoke_linked_app_batch](https://www.dropbox.com/developers/documentation/http/teams#team-linked_apps-revoke_linked_app_batch)  scope: &#x60;sessions.modify&#x60;  Revoke a list of linked applications of the team members.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = TeamLinkedAppsApi()
val contentType : kotlin.String = application/json // kotlin.String | 
val body : kotlin.String = body_example // kotlin.String | 
try {
    apiInstance.call2teamLinkedAppsRevokeLinkedAppBatchPost(contentType, body)
} catch (e: ClientException) {
    println("4xx response calling TeamLinkedAppsApi#call2teamLinkedAppsRevokeLinkedAppBatchPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamLinkedAppsApi#call2teamLinkedAppsRevokeLinkedAppBatchPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**|  | [optional]
 **body** | **kotlin.String**|  | [optional]

### Return type

null (empty response body)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="call2teamLinkedAppsRevokeLinkedAppPost"></a>
# **call2teamLinkedAppsRevokeLinkedAppPost**
> call2teamLinkedAppsRevokeLinkedAppPost(contentType, body)

linked_apps/revoke_linked_app

[linked_apps/revoke_linked_app](https://www.dropbox.com/developers/documentation/http/teams#team-linked_apps-revoke_linked_app)  scope: &#x60;sessions.modify&#x60;  Revoke a linked application of the team member.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = TeamLinkedAppsApi()
val contentType : kotlin.String = application/json // kotlin.String | 
val body : kotlin.String = body_example // kotlin.String | 
try {
    apiInstance.call2teamLinkedAppsRevokeLinkedAppPost(contentType, body)
} catch (e: ClientException) {
    println("4xx response calling TeamLinkedAppsApi#call2teamLinkedAppsRevokeLinkedAppPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamLinkedAppsApi#call2teamLinkedAppsRevokeLinkedAppPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**|  | [optional]
 **body** | **kotlin.String**|  | [optional]

### Return type

null (empty response body)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


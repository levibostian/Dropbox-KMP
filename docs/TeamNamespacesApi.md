# TeamNamespacesApi

All URIs are relative to *https://api.dropbox.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**call2teamNamespacesListContinuePost**](TeamNamespacesApi.md#call2teamNamespacesListContinuePost) | **POST** /2/team/namespaces/list/continue | namespaces/list/continue
[**call2teamNamespacesListPost**](TeamNamespacesApi.md#call2teamNamespacesListPost) | **POST** /2/team/namespaces/list | namespaces/list


<a name="call2teamNamespacesListContinuePost"></a>
# **call2teamNamespacesListContinuePost**
> kotlin.String call2teamNamespacesListContinuePost(contentType, body)

namespaces/list/continue

[namespaces/list/continue](https://www.dropbox.com/developers/documentation/http/teams#team-namespaces-list-continue)  scope: &#x60;team_data.member&#x60;  Once a cursor has been retrieved from &#x60;namespaces/list&#x60;, use this to paginate through all team-accessible namespaces. Duplicates may occur in the list.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = TeamNamespacesApi()
val contentType : kotlin.String = application/json // kotlin.String | 
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.call2teamNamespacesListContinuePost(contentType, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamNamespacesApi#call2teamNamespacesListContinuePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamNamespacesApi#call2teamNamespacesListContinuePost")
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

<a name="call2teamNamespacesListPost"></a>
# **call2teamNamespacesListPost**
> kotlin.String call2teamNamespacesListPost(contentType, body)

namespaces/list

[namespaces/list](https://www.dropbox.com/developers/documentation/http/teams#team-namespaces-list)  scope: &#x60;team_data.member&#x60;  Returns a list of all team-accessible namespaces. This list includes team folders, shared folders containing team members, team members&#39; home namespaces, and team members&#39; app folders. Home namespaces and app folders are always owned by this team or members of the team, but shared folders may be owned by other users or other teams. Duplicates may occur in the list.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = TeamNamespacesApi()
val contentType : kotlin.String = application/json // kotlin.String | 
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.call2teamNamespacesListPost(contentType, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamNamespacesApi#call2teamNamespacesListPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamNamespacesApi#call2teamNamespacesListPost")
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


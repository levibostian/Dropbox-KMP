# TeamTeamFolderApi

All URIs are relative to *https://api.dropbox.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**call2teamTeamFolderActivatePost**](TeamTeamFolderApi.md#call2teamTeamFolderActivatePost) | **POST** /2/team/team_folder/activate | team_folder/activate
[**call2teamTeamFolderArchiveCheckPost**](TeamTeamFolderApi.md#call2teamTeamFolderArchiveCheckPost) | **POST** /2/team/team_folder/archive/check | team_folder/archive/check
[**call2teamTeamFolderArchivePost**](TeamTeamFolderApi.md#call2teamTeamFolderArchivePost) | **POST** /2/team/team_folder/archive | team_folder/archive
[**call2teamTeamFolderCreatePost**](TeamTeamFolderApi.md#call2teamTeamFolderCreatePost) | **POST** /2/team/team_folder/create | team_folder/create
[**call2teamTeamFolderGetInfoPost**](TeamTeamFolderApi.md#call2teamTeamFolderGetInfoPost) | **POST** /2/team/team_folder/get_info | team_folder/get_info
[**call2teamTeamFolderListContinuePost**](TeamTeamFolderApi.md#call2teamTeamFolderListContinuePost) | **POST** /2/team/team_folder/list/continue | team_folder/list/continue
[**call2teamTeamFolderListPost**](TeamTeamFolderApi.md#call2teamTeamFolderListPost) | **POST** /2/team/team_folder/list | team_folder/list
[**call2teamTeamFolderPermanentlyDeletePost**](TeamTeamFolderApi.md#call2teamTeamFolderPermanentlyDeletePost) | **POST** /2/team/team_folder/permanently_delete | team_folder/permanently_delete
[**call2teamTeamFolderRenamePost**](TeamTeamFolderApi.md#call2teamTeamFolderRenamePost) | **POST** /2/team/team_folder/rename | team_folder/rename
[**call2teamTeamFolderUpdateSyncSettingsPost**](TeamTeamFolderApi.md#call2teamTeamFolderUpdateSyncSettingsPost) | **POST** /2/team/team_folder/update_sync_settings | team_folder/update_sync_settings


<a name="call2teamTeamFolderActivatePost"></a>
# **call2teamTeamFolderActivatePost**
> kotlin.String call2teamTeamFolderActivatePost(body)

team_folder/activate

[team_folder/activate](https://www.dropbox.com/developers/documentation/http/teams#team-team_folder-activate)  scope: &#x60;team_data.team_space&#x60;  Sets an archived team folder&#39;s status to active. Permission : Team member file access.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = TeamTeamFolderApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.call2teamTeamFolderActivatePost(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamTeamFolderApi#call2teamTeamFolderActivatePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamTeamFolderApi#call2teamTeamFolderActivatePost")
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

<a name="call2teamTeamFolderArchiveCheckPost"></a>
# **call2teamTeamFolderArchiveCheckPost**
> kotlin.String call2teamTeamFolderArchiveCheckPost(body)

team_folder/archive/check

[team_folder/archive/check](https://www.dropbox.com/developers/documentation/http/teams#team-team_folder-archive-check)  scope: &#x60;team_data.team_space&#x60;  Returns the status of an asynchronous job for archiving a team folder. Permission : Team member file access.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = TeamTeamFolderApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.call2teamTeamFolderArchiveCheckPost(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamTeamFolderApi#call2teamTeamFolderArchiveCheckPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamTeamFolderApi#call2teamTeamFolderArchiveCheckPost")
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

<a name="call2teamTeamFolderArchivePost"></a>
# **call2teamTeamFolderArchivePost**
> kotlin.String call2teamTeamFolderArchivePost(body)

team_folder/archive

[team_folder/archive](https://www.dropbox.com/developers/documentation/http/teams#team-team_folder-archive)  scope: &#x60;team_data.team_space&#x60;  Sets an active team folder&#39;s status to archived and removes all folder and file members. Permission : Team member file access.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = TeamTeamFolderApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.call2teamTeamFolderArchivePost(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamTeamFolderApi#call2teamTeamFolderArchivePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamTeamFolderApi#call2teamTeamFolderArchivePost")
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

<a name="call2teamTeamFolderCreatePost"></a>
# **call2teamTeamFolderCreatePost**
> kotlin.String call2teamTeamFolderCreatePost(body)

team_folder/create

[team_folder/create](https://www.dropbox.com/developers/documentation/http/teams#team-team_folder-create)  scope: &#x60;team_data.team_space&#x60;  Creates a new, active, team folder with no members. Permission : Team member file access.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = TeamTeamFolderApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.call2teamTeamFolderCreatePost(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamTeamFolderApi#call2teamTeamFolderCreatePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamTeamFolderApi#call2teamTeamFolderCreatePost")
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

<a name="call2teamTeamFolderGetInfoPost"></a>
# **call2teamTeamFolderGetInfoPost**
> call2teamTeamFolderGetInfoPost(body)

team_folder/get_info

[team_folder/get_info](https://www.dropbox.com/developers/documentation/http/teams#team-team_folder-get_info)  scope: &#x60;team_data.team_space&#x60;  Retrieves metadata for team folders. Permission : Team member file access.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = TeamTeamFolderApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    apiInstance.call2teamTeamFolderGetInfoPost(body)
} catch (e: ClientException) {
    println("4xx response calling TeamTeamFolderApi#call2teamTeamFolderGetInfoPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamTeamFolderApi#call2teamTeamFolderGetInfoPost")
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

<a name="call2teamTeamFolderListContinuePost"></a>
# **call2teamTeamFolderListContinuePost**
> kotlin.String call2teamTeamFolderListContinuePost(body)

team_folder/list/continue

[team_folder/list/continue](https://www.dropbox.com/developers/documentation/http/teams#team-team_folder-list-continue)  scope: &#x60;team_data.team_space&#x60;  Once a cursor has been retrieved from &#x60;team_folder/list&#x60;, use this to paginate through all team folders. Permission : Team member file access.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = TeamTeamFolderApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.call2teamTeamFolderListContinuePost(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamTeamFolderApi#call2teamTeamFolderListContinuePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamTeamFolderApi#call2teamTeamFolderListContinuePost")
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

<a name="call2teamTeamFolderListPost"></a>
# **call2teamTeamFolderListPost**
> kotlin.String call2teamTeamFolderListPost(body)

team_folder/list

[team_folder/list](https://www.dropbox.com/developers/documentation/http/teams#team-team_folder-list)  scope: &#x60;team_data.team_space&#x60;  Lists all team folders. Permission : Team member file access.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = TeamTeamFolderApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.call2teamTeamFolderListPost(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamTeamFolderApi#call2teamTeamFolderListPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamTeamFolderApi#call2teamTeamFolderListPost")
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

<a name="call2teamTeamFolderPermanentlyDeletePost"></a>
# **call2teamTeamFolderPermanentlyDeletePost**
> call2teamTeamFolderPermanentlyDeletePost(body)

team_folder/permanently_delete

[team_folder/permanently_delete](https://www.dropbox.com/developers/documentation/http/teams#team-team_folder-permanently_delete)  scope: &#x60;team_data.team_space&#x60;  Permanently deletes an archived team folder. Permission : Team member file access.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = TeamTeamFolderApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    apiInstance.call2teamTeamFolderPermanentlyDeletePost(body)
} catch (e: ClientException) {
    println("4xx response calling TeamTeamFolderApi#call2teamTeamFolderPermanentlyDeletePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamTeamFolderApi#call2teamTeamFolderPermanentlyDeletePost")
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

<a name="call2teamTeamFolderRenamePost"></a>
# **call2teamTeamFolderRenamePost**
> kotlin.String call2teamTeamFolderRenamePost(body)

team_folder/rename

[team_folder/rename](https://www.dropbox.com/developers/documentation/http/teams#team-team_folder-rename)  scope: &#x60;team_data.team_space&#x60;  Changes an active team folder&#39;s name. Permission : Team member file access.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = TeamTeamFolderApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.call2teamTeamFolderRenamePost(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamTeamFolderApi#call2teamTeamFolderRenamePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamTeamFolderApi#call2teamTeamFolderRenamePost")
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

<a name="call2teamTeamFolderUpdateSyncSettingsPost"></a>
# **call2teamTeamFolderUpdateSyncSettingsPost**
> kotlin.String call2teamTeamFolderUpdateSyncSettingsPost(body)

team_folder/update_sync_settings

[team_folder/update_sync_settings](https://www.dropbox.com/developers/documentation/http/teams#team-team_folder-update_sync_settings)  scope: &#x60;team_data.team_space&#x60;  Updates the sync settings on a team folder or its contents.  Use of this endpoint requires that the team has team selective sync enabled.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = TeamTeamFolderApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.call2teamTeamFolderUpdateSyncSettingsPost(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamTeamFolderApi#call2teamTeamFolderUpdateSyncSettingsPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamTeamFolderApi#call2teamTeamFolderUpdateSyncSettingsPost")
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


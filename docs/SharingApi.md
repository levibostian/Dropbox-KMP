# SharingApi

All URIs are relative to *https://api.dropbox.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addFileMember**](SharingApi.md#addFileMember) | **POST** /2/sharing/add_file_member | add_file_member
[**addFolderMember**](SharingApi.md#addFolderMember) | **POST** /2/sharing/add_folder_member | add_folder_member
[**checkJobStatus**](SharingApi.md#checkJobStatus) | **POST** /2/sharing/check_job_status | check_job_status
[**checkRemoveMemberJobStatus**](SharingApi.md#checkRemoveMemberJobStatus) | **POST** /2/sharing/check_remove_member_job_status | check_remove_member_job_status
[**checkShareJobStatus**](SharingApi.md#checkShareJobStatus) | **POST** /2/sharing/check_share_job_status | check_share_job_status
[**getFileMetadata**](SharingApi.md#getFileMetadata) | **POST** /2/sharing/get_file_metadata | get_file_metadata
[**getFileMetadataBatch**](SharingApi.md#getFileMetadataBatch) | **POST** /2/sharing/get_file_metadata/batch | get_file_metadata/batch
[**getFolderMetadata**](SharingApi.md#getFolderMetadata) | **POST** /2/sharing/get_folder_metadata | get_folder_metadata
[**getSharedLinkFile**](SharingApi.md#getSharedLinkFile) | **POST** /2/sharing/get_shared_link_file | get_shared_link_file
[**getSharedLinkMetadata**](SharingApi.md#getSharedLinkMetadata) | **POST** /2/sharing/get_shared_link_metadata | get_shared_link_metadata
[**listFileMembers**](SharingApi.md#listFileMembers) | **POST** /2/sharing/list_file_members | list_file_members
[**listFileMembersBatch**](SharingApi.md#listFileMembersBatch) | **POST** /2/sharing/list_file_members/batch | list_file_members/batch
[**listFileMembersContinue**](SharingApi.md#listFileMembersContinue) | **POST** /2/sharing/list_file_members/continue | list_file_members/continue
[**listFolderMembersContinue**](SharingApi.md#listFolderMembersContinue) | **POST** /2/sharing/list_folder_members/continue | list_folder_members/continue
[**listFolders**](SharingApi.md#listFolders) | **POST** /2/sharing/list_folders | list_folders
[**listFoldersContinue**](SharingApi.md#listFoldersContinue) | **POST** /2/sharing/list_folders/continue | list_folders/continue
[**listMountableFolders**](SharingApi.md#listMountableFolders) | **POST** /2/sharing/list_mountable_folders | list_mountable_folders
[**listMountableFoldersContinue**](SharingApi.md#listMountableFoldersContinue) | **POST** /2/sharing/list_mountable_folders/continue | list_mountable_folders/continue
[**listReceivedFiles**](SharingApi.md#listReceivedFiles) | **POST** /2/sharing/list_received_files | list_received_files
[**listReceivedFilesContinue**](SharingApi.md#listReceivedFilesContinue) | **POST** /2/sharing/list_received_files/continue | list_received_files/continue
[**listSharedLinks**](SharingApi.md#listSharedLinks) | **POST** /2/sharing/list_shared_links | list_shared_links
[**modifySharedLinkSettings**](SharingApi.md#modifySharedLinkSettings) | **POST** /2/sharing/modify_shared_link_settings | modify_shared_link_settings
[**mountFolder**](SharingApi.md#mountFolder) | **POST** /2/sharing/mount_folder | mount_folder
[**relinquishFileMembership**](SharingApi.md#relinquishFileMembership) | **POST** /2/sharing/relinquish_file_membership | relinquish_file_membership
[**relinquishFolderMembership**](SharingApi.md#relinquishFolderMembership) | **POST** /2/sharing/relinquish_folder_membership | relinquish_folder_membership
[**removeFileMember2**](SharingApi.md#removeFileMember2) | **POST** /2/sharing/remove_file_member_2 | remove_file_member_2
[**removeFolderMember**](SharingApi.md#removeFolderMember) | **POST** /2/sharing/remove_folder_member | remove_folder_member
[**revokeSharedLink**](SharingApi.md#revokeSharedLink) | **POST** /2/sharing/revoke_shared_link | revoke_shared_link
[**setAccessInheritance**](SharingApi.md#setAccessInheritance) | **POST** /2/sharing/set_access_inheritance | set_access_inheritance
[**shareFolder**](SharingApi.md#shareFolder) | **POST** /2/sharing/share_folder | share_folder
[**transferFolder**](SharingApi.md#transferFolder) | **POST** /2/sharing/transfer_folder | transfer_folder
[**unmountFolder**](SharingApi.md#unmountFolder) | **POST** /2/sharing/unmount_folder | unmount_folder
[**unshareFile**](SharingApi.md#unshareFile) | **POST** /2/sharing/unshare_file | unshare_file
[**unshareFolder**](SharingApi.md#unshareFolder) | **POST** /2/sharing/unshare_folder | unshare_folder
[**updateFileMember**](SharingApi.md#updateFileMember) | **POST** /2/sharing/update_file_member | update_file_member
[**updateFolderMember**](SharingApi.md#updateFolderMember) | **POST** /2/sharing/update_folder_member | update_folder_member
[**updateFolderPolicy**](SharingApi.md#updateFolderPolicy) | **POST** /2/sharing/update_folder_policy | update_folder_policy


<a name="addFileMember"></a>
# **addFileMember**
> kotlin.String addFileMember(body)

add_file_member

[add_file_member](https://www.dropbox.com/developers/documentation/http/documentation#sharing-add_file_member)  scope: &#x60;sharing.write&#x60;  Adds specified members to a file.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = SharingApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.addFileMember(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SharingApi#addFileMember")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SharingApi#addFileMember")
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

<a name="addFolderMember"></a>
# **addFolderMember**
> addFolderMember(body)

add_folder_member

[add_folder_member](https://www.dropbox.com/developers/documentation/http/documentation#sharing-add_folder_member)  scope: &#x60;sharing.write&#x60;  Allows an owner or editor (if the ACL update policy allows) of a shared folder to add another member. For the new member to get access to all the functionality for this folder, you will need to call &#x60;mount_folder&#x60; on their behalf.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = SharingApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    apiInstance.addFolderMember(body)
} catch (e: ClientException) {
    println("4xx response calling SharingApi#addFolderMember")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SharingApi#addFolderMember")
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

<a name="checkJobStatus"></a>
# **checkJobStatus**
> kotlin.String checkJobStatus(body)

check_job_status

[check_job_status](https://www.dropbox.com/developers/documentation/http/documentation#sharing-check_job_status)  scope: &#x60;sharing.write&#x60;  Returns the status of an asynchronous job.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = SharingApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.checkJobStatus(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SharingApi#checkJobStatus")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SharingApi#checkJobStatus")
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

<a name="checkRemoveMemberJobStatus"></a>
# **checkRemoveMemberJobStatus**
> kotlin.String checkRemoveMemberJobStatus(body)

check_remove_member_job_status

[check_remove_member_job_status](https://www.dropbox.com/developers/documentation/http/documentation#sharing-check_remove_member_job_status)  scope: &#x60;sharing.write&#x60;  Returns the status of an asynchronous job for sharing a folder.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = SharingApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.checkRemoveMemberJobStatus(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SharingApi#checkRemoveMemberJobStatus")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SharingApi#checkRemoveMemberJobStatus")
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

<a name="checkShareJobStatus"></a>
# **checkShareJobStatus**
> kotlin.String checkShareJobStatus(body)

check_share_job_status

[check_share_job_status](https://www.dropbox.com/developers/documentation/http/documentation#sharing-check_share_job_status)  scope: &#x60;sharing.write&#x60;  Returns the status of an asynchronous job for sharing a folder.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = SharingApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.checkShareJobStatus(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SharingApi#checkShareJobStatus")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SharingApi#checkShareJobStatus")
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

<a name="getFileMetadata"></a>
# **getFileMetadata**
> kotlin.String getFileMetadata(body)

get_file_metadata

[get_file_metadata](https://www.dropbox.com/developers/documentation/http/documentation#sharing-get_file_metadata)  scope: &#x60;sharing.read&#x60;  Returns shared file metadata.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = SharingApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.getFileMetadata(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SharingApi#getFileMetadata")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SharingApi#getFileMetadata")
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

<a name="getFileMetadataBatch"></a>
# **getFileMetadataBatch**
> kotlin.String getFileMetadataBatch(body)

get_file_metadata/batch

[get_file_metadata/batch](https://www.dropbox.com/developers/documentation/http/documentation#sharing-get_file_metadata-batch)  scope: &#x60;sharing.read&#x60;  Returns shared file metadata.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = SharingApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.getFileMetadataBatch(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SharingApi#getFileMetadataBatch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SharingApi#getFileMetadataBatch")
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

<a name="getFolderMetadata"></a>
# **getFolderMetadata**
> kotlin.String getFolderMetadata(body)

get_folder_metadata

[get_folder_metadata](https://www.dropbox.com/developers/documentation/http/documentation#sharing-get_folder_metadata)  scope: &#x60;sharing.read&#x60;  Returns shared folder metadata by its folder ID.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = SharingApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.getFolderMetadata(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SharingApi#getFolderMetadata")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SharingApi#getFolderMetadata")
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

<a name="getSharedLinkFile"></a>
# **getSharedLinkFile**
> kotlin.String getSharedLinkFile(dropboxAPIArg)

get_shared_link_file

[get_shared_link_file](https://www.dropbox.com/developers/documentation/http/documentation#sharing-get_shared_link_file)  scope: &#x60;sharing.read&#x60;  Download the shared link&#39;s file from a user&#39;s Dropbox.      

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = SharingApi()
val dropboxAPIArg : kotlin.String = {
    "url": "https://www.dropbox.com/s/2sn712vy1ovegw8/Prime_Numbers.txt?dl=0", 
    "path": "/Prime_Numbers.txt"
} // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.getSharedLinkFile(dropboxAPIArg)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SharingApi#getSharedLinkFile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SharingApi#getSharedLinkFile")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dropboxAPIArg** | **kotlin.String**|  | [optional]

### Return type

**kotlin.String**

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSharedLinkMetadata"></a>
# **getSharedLinkMetadata**
> kotlin.String getSharedLinkMetadata(body)

get_shared_link_metadata

[get_shared_link_metadata](https://www.dropbox.com/developers/documentation/http/documentation#sharing-get_shared_link_metadata)  scope: &#x60;sharing.read&#x60;  Get the shared link&#39;s metadata.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = SharingApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.getSharedLinkMetadata(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SharingApi#getSharedLinkMetadata")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SharingApi#getSharedLinkMetadata")
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

<a name="listFileMembers"></a>
# **listFileMembers**
> kotlin.String listFileMembers(body)

list_file_members

[list_file_members](https://www.dropbox.com/developers/documentation/http/documentation#sharing-list_file_members)  scope: &#x60;sharing.read&#x60;  Use to obtain the members who have been invited to a file, both inherited and uninherited members.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = SharingApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.listFileMembers(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SharingApi#listFileMembers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SharingApi#listFileMembers")
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

<a name="listFileMembersBatch"></a>
# **listFileMembersBatch**
> kotlin.String listFileMembersBatch(body)

list_file_members/batch

[list_file_members/batch](https://www.dropbox.com/developers/documentation/http/documentation#sharing-list_file_members-batch)  scope: &#x60;sharing.read&#x60;  Get members of multiple files at once. The arguments to this route are more limited, and the limit on query result size per file is more strict. To customize the results more, use the individual file endpoint. Inherited users and groups are not included in the result, and permissions are not returned for this endpoint.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = SharingApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.listFileMembersBatch(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SharingApi#listFileMembersBatch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SharingApi#listFileMembersBatch")
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

<a name="listFileMembersContinue"></a>
# **listFileMembersContinue**
> kotlin.String listFileMembersContinue(body)

list_file_members/continue

[list_file_members/continue](https://www.dropbox.com/developers/documentation/http/documentation#sharing-list_file_members-continue)  scope: &#x60;sharing.read&#x60;  Once a cursor has been retrieved from &#x60;list_file_members&#x60; or &#x60;list_file_members/batch&#x60;, use this to paginate through all shared file members.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = SharingApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.listFileMembersContinue(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SharingApi#listFileMembersContinue")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SharingApi#listFileMembersContinue")
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

<a name="listFolderMembersContinue"></a>
# **listFolderMembersContinue**
> kotlin.String listFolderMembersContinue(body)

list_folder_members/continue

[list_folder_members/continue](https://www.dropbox.com/developers/documentation/http/documentation#sharing-list_folder_members-continue)  scope: &#x60;sharing.read&#x60;  Once a cursor has been retrieved from &#x60;list_folder_members&#x60;, use this to paginate through all shared folder members.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = SharingApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.listFolderMembersContinue(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SharingApi#listFolderMembersContinue")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SharingApi#listFolderMembersContinue")
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

<a name="listFolders"></a>
# **listFolders**
> kotlin.String listFolders(body)

list_folders

[list_folders](https://www.dropbox.com/developers/documentation/http/documentation#sharing-list_folders)  scope: &#x60;sharing.read&#x60;  Return the list of all shared folders the current user has access to.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = SharingApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.listFolders(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SharingApi#listFolders")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SharingApi#listFolders")
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

<a name="listFoldersContinue"></a>
# **listFoldersContinue**
> kotlin.String listFoldersContinue(body)

list_folders/continue

[list_folders/continue](https://www.dropbox.com/developers/documentation/http/documentation#sharing-list_folders-continue)  scope: &#x60;sharing.read&#x60;  Once a cursor has been retrieved from &#x60;list_folders&#x60;, use this to paginate through all shared folders. The cursor must come from a previous call to &#x60;list_folders&#x60; or &#x60;list_folders/continue&#x60;.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = SharingApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.listFoldersContinue(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SharingApi#listFoldersContinue")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SharingApi#listFoldersContinue")
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

<a name="listMountableFolders"></a>
# **listMountableFolders**
> kotlin.String listMountableFolders(body)

list_mountable_folders

[list_mountable_folders](https://www.dropbox.com/developers/documentation/http/documentation#sharing-list_mountable_folders)  scope: &#x60;sharing.read&#x60;  Return the list of all shared folders the current user can mount or unmount.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = SharingApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.listMountableFolders(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SharingApi#listMountableFolders")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SharingApi#listMountableFolders")
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

<a name="listMountableFoldersContinue"></a>
# **listMountableFoldersContinue**
> kotlin.String listMountableFoldersContinue(body)

list_mountable_folders/continue

[list_mountable_folders/continue](https://www.dropbox.com/developers/documentation/http/documentation#sharing-list_mountable_folders-continue)  scope: &#x60;sharing.read&#x60;  Once a cursor has been retrieved from &#x60;list_mountable_folders&#x60;, use this to paginate through all mountable shared folders. The cursor must come from a previous call to &#x60;list_mountable_folders&#x60; or &#x60;list_mountable_folders/continue&#x60;.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = SharingApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.listMountableFoldersContinue(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SharingApi#listMountableFoldersContinue")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SharingApi#listMountableFoldersContinue")
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

<a name="listReceivedFiles"></a>
# **listReceivedFiles**
> kotlin.String listReceivedFiles(body)

list_received_files

[list_received_files](https://www.dropbox.com/developers/documentation/http/documentation#sharing-list_received_files)  scope: &#x60;sharing.read&#x60;  Returns a list of all files shared with current user.  Does not include files the user has received via shared folders, and does  not include unclaimed invitations.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = SharingApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.listReceivedFiles(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SharingApi#listReceivedFiles")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SharingApi#listReceivedFiles")
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

<a name="listReceivedFilesContinue"></a>
# **listReceivedFilesContinue**
> kotlin.String listReceivedFilesContinue(body)

list_received_files/continue

[list_received_files/continue](https://www.dropbox.com/developers/documentation/http/documentation#sharing-list_received_files-continue)  scope: &#x60;sharing.read&#x60;  Get more results with a cursor from &#x60;list_received_files&#x60;.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = SharingApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.listReceivedFilesContinue(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SharingApi#listReceivedFilesContinue")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SharingApi#listReceivedFilesContinue")
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

<a name="listSharedLinks"></a>
# **listSharedLinks**
> kotlin.String listSharedLinks(body)

list_shared_links

[list_shared_links](https://www.dropbox.com/developers/documentation/http/documentation#sharing-list_shared_links)  scope: &#x60;sharing.read&#x60;  List shared links of this user. If no path is given, returns a list of all shared links for the current user. If a non-empty path is given, returns a list of all shared links that allow access to the given path - direct links to the given path and links to parent folders of the given path. Links to parent folders can be suppressed by setting direct_only to true.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = SharingApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.listSharedLinks(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SharingApi#listSharedLinks")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SharingApi#listSharedLinks")
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

<a name="modifySharedLinkSettings"></a>
# **modifySharedLinkSettings**
> kotlin.String modifySharedLinkSettings(body)

modify_shared_link_settings

[modify_shared_link_settings](https://www.dropbox.com/developers/documentation/http/documentation#sharing-modify_shared_link_settings)  scope: &#x60;sharing.write&#x60;  Modify the shared link&#39;s settings. If the requested visibility conflict with the shared links policy of the team or the shared folder (in case the linked file is part of a shared folder) then the &#x60;LinkPermissions.resolved_visibility&#x60; of the returned &#x60;SharedLinkMetadata&#x60; will reflect the actual visibility of the shared link and the &#x60;LinkPermissions.requested_visibility&#x60; will reflect the requested visibility.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = SharingApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.modifySharedLinkSettings(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SharingApi#modifySharedLinkSettings")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SharingApi#modifySharedLinkSettings")
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

<a name="mountFolder"></a>
# **mountFolder**
> kotlin.String mountFolder(body)

mount_folder

[mount_folder](https://www.dropbox.com/developers/documentation/http/documentation#sharing-mount_folder)  scope: &#x60;sharing.write&#x60;  The current user mounts the designated folder. Mount a shared folder for a user after they have been added as a member. Once mounted, the shared folder will appear in their Dropbox.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = SharingApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.mountFolder(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SharingApi#mountFolder")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SharingApi#mountFolder")
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

<a name="relinquishFileMembership"></a>
# **relinquishFileMembership**
> relinquishFileMembership(body)

relinquish_file_membership

[relinquish_file_membership](https://www.dropbox.com/developers/documentation/http/documentation#sharing-relinquish_file_membership)  scope: &#x60;sharing.write&#x60;  The current user relinquishes their membership in the designated file. Note that the current user may still have inherited access to this file through the parent folder.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = SharingApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    apiInstance.relinquishFileMembership(body)
} catch (e: ClientException) {
    println("4xx response calling SharingApi#relinquishFileMembership")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SharingApi#relinquishFileMembership")
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

<a name="relinquishFolderMembership"></a>
# **relinquishFolderMembership**
> kotlin.String relinquishFolderMembership(body)

relinquish_folder_membership

[relinquish_folder_membership](https://www.dropbox.com/developers/documentation/http/documentation#sharing-relinquish_folder_membership)  scope: &#x60;sharing.write&#x60;  The current user relinquishes their membership in the designated shared folder and will no longer have access to the folder.  A folder owner cannot relinquish membership in their own folder. This will run synchronously if leave_a_copy is false, and asynchronously if leave_a_copy is true.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = SharingApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.relinquishFolderMembership(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SharingApi#relinquishFolderMembership")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SharingApi#relinquishFolderMembership")
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

<a name="removeFileMember2"></a>
# **removeFileMember2**
> kotlin.String removeFileMember2(body)

remove_file_member_2

[remove_file_member_2](https://www.dropbox.com/developers/documentation/http/documentation#sharing-remove_file_member_2)  scope: &#x60;sharing.write&#x60;  Removes a specified member from the file.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = SharingApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.removeFileMember2(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SharingApi#removeFileMember2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SharingApi#removeFileMember2")
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

<a name="removeFolderMember"></a>
# **removeFolderMember**
> kotlin.String removeFolderMember(body)

remove_folder_member

[remove_folder_member](https://www.dropbox.com/developers/documentation/http/documentation#sharing-remove_folder_member)  scope: &#x60;sharing.write&#x60;  Allows an owner or editor (if the ACL update policy allows) of a shared folder to remove another member.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = SharingApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.removeFolderMember(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SharingApi#removeFolderMember")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SharingApi#removeFolderMember")
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

<a name="revokeSharedLink"></a>
# **revokeSharedLink**
> revokeSharedLink(body)

revoke_shared_link

[revoke_shared_link](https://www.dropbox.com/developers/documentation/http/documentation#sharing-revoke_shared_link)  scope: &#x60;sharing.write&#x60;  Revoke a shared link. Note that even after revoking a shared link to a file, the file may be accessible if there are shared links leading to any of the file parent folders. To list all shared links that enable access to a specific file, you can use the &#x60;list_shared_links&#x60; with the file as the &#x60;ListSharedLinksArg.path&#x60; argument.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = SharingApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    apiInstance.revokeSharedLink(body)
} catch (e: ClientException) {
    println("4xx response calling SharingApi#revokeSharedLink")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SharingApi#revokeSharedLink")
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

<a name="setAccessInheritance"></a>
# **setAccessInheritance**
> kotlin.String setAccessInheritance(body)

set_access_inheritance

[set_access_inheritance](https://www.dropbox.com/developers/documentation/http/documentation#sharing-set_access_inheritance)  scope: &#x60;sharing.write&#x60;  Change the inheritance policy of an existing Shared Folder. Only permitted for shared folders in a shared team root. If a &#x60;ShareFolderLaunch.async_job_id&#x60; is returned, you&#39;ll need to call &#x60;check_share_job_status&#x60; until the action completes to get the metadata for the folder.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = SharingApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.setAccessInheritance(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SharingApi#setAccessInheritance")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SharingApi#setAccessInheritance")
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

<a name="shareFolder"></a>
# **shareFolder**
> kotlin.String shareFolder(body)

share_folder

[share_folder](https://www.dropbox.com/developers/documentation/http/documentation#sharing-share_folder)  scope: &#x60;sharing.write&#x60;  Share a folder with collaborators. Most sharing will be completed synchronously. Large folders will be completed asynchronously. To make testing the async case repeatable, set &#x60;ShareFolderArg.force_async&#x60;. If a &#x60;ShareFolderLaunch.async_job_id&#x60; is returned, you&#39;ll need to call &#x60;check_share_job_status&#x60; until the action completes to get the metadata for the folder.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = SharingApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.shareFolder(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SharingApi#shareFolder")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SharingApi#shareFolder")
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

<a name="transferFolder"></a>
# **transferFolder**
> transferFolder(body)

transfer_folder

[transfer_folder](https://www.dropbox.com/developers/documentation/http/documentation#sharing-transfer_folder)  scope: &#x60;sharing.write&#x60;  Transfer ownership of a shared folder to a member of the shared folder. User must have &#x60;AccessLevel.owner&#x60; access to the shared folder to perform a transfer.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = SharingApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    apiInstance.transferFolder(body)
} catch (e: ClientException) {
    println("4xx response calling SharingApi#transferFolder")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SharingApi#transferFolder")
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

<a name="unmountFolder"></a>
# **unmountFolder**
> unmountFolder(body)

unmount_folder

[unmount_folder](https://www.dropbox.com/developers/documentation/http/documentation#sharing-unmount_folder)  scope: &#x60;sharing.write&#x60;  The current user unmounts the designated folder. They can re-mount the folder at a later time using &#x60;mount_folder&#x60;.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = SharingApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    apiInstance.unmountFolder(body)
} catch (e: ClientException) {
    println("4xx response calling SharingApi#unmountFolder")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SharingApi#unmountFolder")
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

<a name="unshareFile"></a>
# **unshareFile**
> unshareFile(body)

unshare_file

[unshare_file](https://www.dropbox.com/developers/documentation/http/documentation#sharing-unshare_file)  scope: &#x60;sharing.write&#x60;  Remove all members from this file. Does not remove inherited members.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = SharingApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    apiInstance.unshareFile(body)
} catch (e: ClientException) {
    println("4xx response calling SharingApi#unshareFile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SharingApi#unshareFile")
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

<a name="unshareFolder"></a>
# **unshareFolder**
> kotlin.String unshareFolder(body)

unshare_folder

[unshare_folder](https://www.dropbox.com/developers/documentation/http/documentation#sharing-unshare_folder)  scope: &#x60;sharing.write&#x60;  Allows a shared folder owner to unshare the folder. You&#39;ll need to call &#x60;check_job_status&#x60; to determine if the action has completed successfully.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = SharingApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.unshareFolder(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SharingApi#unshareFolder")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SharingApi#unshareFolder")
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

<a name="updateFileMember"></a>
# **updateFileMember**
> kotlin.String updateFileMember(body)

update_file_member

[update_file_member](https://www.dropbox.com/developers/documentation/http/documentation#sharing-update_file_member)  scope: &#x60;sharing.write&#x60;  Changes a member&#39;s access on a shared file.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = SharingApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.updateFileMember(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SharingApi#updateFileMember")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SharingApi#updateFileMember")
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

<a name="updateFolderMember"></a>
# **updateFolderMember**
> kotlin.String updateFolderMember(body)

update_folder_member

[update_folder_member](https://www.dropbox.com/developers/documentation/http/documentation#sharing-update_folder_member)  scope: &#x60;sharing.write&#x60;  Allows an owner or editor of a shared folder to update another member&#39;s permissions.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = SharingApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.updateFolderMember(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SharingApi#updateFolderMember")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SharingApi#updateFolderMember")
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

<a name="updateFolderPolicy"></a>
# **updateFolderPolicy**
> kotlin.String updateFolderPolicy(body)

update_folder_policy

[update_folder_policy](https://www.dropbox.com/developers/documentation/http/documentation#sharing-update_folder_policy)  scope: &#x60;sharing.write&#x60;  Update the sharing policies for a shared folder. User must have &#x60;AccessLevel.owner&#x60; access to the shared folder to update its policies.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = SharingApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.updateFolderPolicy(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SharingApi#updateFolderPolicy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SharingApi#updateFolderPolicy")
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


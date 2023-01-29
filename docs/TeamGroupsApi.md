# TeamGroupsApi

All URIs are relative to *https://api.dropbox.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**call2teamGroupsCreatePost**](TeamGroupsApi.md#call2teamGroupsCreatePost) | **POST** /2/team/groups/create | groups/create
[**call2teamGroupsDeletePost**](TeamGroupsApi.md#call2teamGroupsDeletePost) | **POST** /2/team/groups/delete | groups/delete
[**call2teamGroupsGetInfoPost**](TeamGroupsApi.md#call2teamGroupsGetInfoPost) | **POST** /2/team/groups/get_info | groups/get_info
[**call2teamGroupsJobStatusGetPost**](TeamGroupsApi.md#call2teamGroupsJobStatusGetPost) | **POST** /2/team/groups/job_status/get | groups/job_status/get
[**call2teamGroupsListContinuePost**](TeamGroupsApi.md#call2teamGroupsListContinuePost) | **POST** /2/team/groups/list/continue | groups/list/continue
[**call2teamGroupsListPost**](TeamGroupsApi.md#call2teamGroupsListPost) | **POST** /2/team/groups/list | groups/list
[**call2teamGroupsMembersAddPost**](TeamGroupsApi.md#call2teamGroupsMembersAddPost) | **POST** /2/team/groups/members/add | groups/members/add
[**call2teamGroupsMembersListContinuePost**](TeamGroupsApi.md#call2teamGroupsMembersListContinuePost) | **POST** /2/team/groups/members/list/continue | groups/members/list/continue
[**call2teamGroupsMembersListPost**](TeamGroupsApi.md#call2teamGroupsMembersListPost) | **POST** /2/team/groups/members/list | groups/members/list
[**call2teamGroupsMembersRemovePost**](TeamGroupsApi.md#call2teamGroupsMembersRemovePost) | **POST** /2/team/groups/members/remove | groups/members/remove
[**call2teamGroupsMembersSetAccessTypePost**](TeamGroupsApi.md#call2teamGroupsMembersSetAccessTypePost) | **POST** /2/team/groups/members/set_access_type | groups/members/set_access_type
[**call2teamGroupsUpdatePost**](TeamGroupsApi.md#call2teamGroupsUpdatePost) | **POST** /2/team/groups/update | groups/update


<a name="call2teamGroupsCreatePost"></a>
# **call2teamGroupsCreatePost**
> kotlin.String call2teamGroupsCreatePost(contentType, body)

groups/create

[groups/create](https://www.dropbox.com/developers/documentation/http/teams#team-groups-create)  scope: &#x60;groups.write&#x60;  Creates a new, empty group, with a requested name. Permission : Team member management.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = TeamGroupsApi()
val contentType : kotlin.String = application/json // kotlin.String | 
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.call2teamGroupsCreatePost(contentType, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamGroupsApi#call2teamGroupsCreatePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamGroupsApi#call2teamGroupsCreatePost")
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

<a name="call2teamGroupsDeletePost"></a>
# **call2teamGroupsDeletePost**
> kotlin.String call2teamGroupsDeletePost(contentType, body)

groups/delete

[groups/delete](https://www.dropbox.com/developers/documentation/http/teams#team-groups-delete)  scope: &#x60;groups.write&#x60;  Deletes a group. The group is deleted immediately. However the revoking of group-owned resources may take additional time. Use the &#x60;groups/job_status/get&#x60; to determine whether this process has completed. Permission : Team member management.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = TeamGroupsApi()
val contentType : kotlin.String = application/json // kotlin.String | 
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.call2teamGroupsDeletePost(contentType, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamGroupsApi#call2teamGroupsDeletePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamGroupsApi#call2teamGroupsDeletePost")
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

<a name="call2teamGroupsGetInfoPost"></a>
# **call2teamGroupsGetInfoPost**
> kotlin.String call2teamGroupsGetInfoPost(contentType, body)

groups/get_info

[groups/get_info](https://www.dropbox.com/developers/documentation/http/teams#team-groups-get_info)  scope: &#x60;groups.read&#x60;  Retrieves information about one or more groups. Note that the optional field  &#x60;GroupFullInfo.members&#x60; is not returned for system-managed groups. Permission : Team Information.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = TeamGroupsApi()
val contentType : kotlin.String = application/json // kotlin.String | 
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.call2teamGroupsGetInfoPost(contentType, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamGroupsApi#call2teamGroupsGetInfoPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamGroupsApi#call2teamGroupsGetInfoPost")
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

<a name="call2teamGroupsJobStatusGetPost"></a>
# **call2teamGroupsJobStatusGetPost**
> kotlin.String call2teamGroupsJobStatusGetPost(contentType, body)

groups/job_status/get

[groups/job_status/get](https://www.dropbox.com/developers/documentation/http/teams#team-groups-job_status-get)  scope: &#x60;groups.write&#x60;  Once an async_job_id is returned from &#x60;groups/delete&#x60;, &#x60;groups/members/add&#x60; , or &#x60;groups/members/remove&#x60; use this method to poll the status of granting/revoking group members&#39; access to group-owned resources. Permission : Team member management.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = TeamGroupsApi()
val contentType : kotlin.String = application/json // kotlin.String | 
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.call2teamGroupsJobStatusGetPost(contentType, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamGroupsApi#call2teamGroupsJobStatusGetPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamGroupsApi#call2teamGroupsJobStatusGetPost")
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

<a name="call2teamGroupsListContinuePost"></a>
# **call2teamGroupsListContinuePost**
> kotlin.String call2teamGroupsListContinuePost(contentType, body)

groups/list/continue

[groups/list/continue](https://www.dropbox.com/developers/documentation/http/teams#team-groups-list-continue)  scope: &#x60;groups.read&#x60;  Once a cursor has been retrieved from &#x60;groups/list&#x60;, use this to paginate through all groups. Permission : Team Information.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = TeamGroupsApi()
val contentType : kotlin.String = application/json // kotlin.String | 
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.call2teamGroupsListContinuePost(contentType, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamGroupsApi#call2teamGroupsListContinuePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamGroupsApi#call2teamGroupsListContinuePost")
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

<a name="call2teamGroupsListPost"></a>
# **call2teamGroupsListPost**
> kotlin.String call2teamGroupsListPost(contentType, body)

groups/list

[groups/list](https://www.dropbox.com/developers/documentation/http/teams#team-groups-list)  scope: &#x60;groups.read&#x60;  Lists groups on a team. Permission : Team Information.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = TeamGroupsApi()
val contentType : kotlin.String = application/json // kotlin.String | 
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.call2teamGroupsListPost(contentType, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamGroupsApi#call2teamGroupsListPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamGroupsApi#call2teamGroupsListPost")
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

<a name="call2teamGroupsMembersAddPost"></a>
# **call2teamGroupsMembersAddPost**
> kotlin.String call2teamGroupsMembersAddPost(contentType, body)

groups/members/add

[groups/members/add](https://www.dropbox.com/developers/documentation/http/teams#team-groups-members-add)  scope: &#x60;groups.write&#x60;  Adds members to a group. The members are added immediately. However the granting of group-owned resources may take additional time. Use the &#x60;groups/job_status/get&#x60; to determine whether this process has completed. Permission : Team member management.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = TeamGroupsApi()
val contentType : kotlin.String = application/json // kotlin.String | 
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.call2teamGroupsMembersAddPost(contentType, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamGroupsApi#call2teamGroupsMembersAddPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamGroupsApi#call2teamGroupsMembersAddPost")
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

<a name="call2teamGroupsMembersListContinuePost"></a>
# **call2teamGroupsMembersListContinuePost**
> kotlin.String call2teamGroupsMembersListContinuePost(contentType, body)

groups/members/list/continue

[groups/members/list/continue](https://www.dropbox.com/developers/documentation/http/teams#team-groups-members-list-continue)  scope: &#x60;groups.read&#x60;  Once a cursor has been retrieved from &#x60;groups/members/list&#x60;, use this to paginate through all members of the group. Permission : Team information.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = TeamGroupsApi()
val contentType : kotlin.String = application/json // kotlin.String | 
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.call2teamGroupsMembersListContinuePost(contentType, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamGroupsApi#call2teamGroupsMembersListContinuePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamGroupsApi#call2teamGroupsMembersListContinuePost")
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

<a name="call2teamGroupsMembersListPost"></a>
# **call2teamGroupsMembersListPost**
> kotlin.String call2teamGroupsMembersListPost(contentType, body)

groups/members/list

[groups/members/list](https://www.dropbox.com/developers/documentation/http/teams#team-groups-members-list)  scope: &#x60;groups.read&#x60;  Lists members of a group. Permission : Team Information.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = TeamGroupsApi()
val contentType : kotlin.String = application/json // kotlin.String | 
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.call2teamGroupsMembersListPost(contentType, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamGroupsApi#call2teamGroupsMembersListPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamGroupsApi#call2teamGroupsMembersListPost")
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

<a name="call2teamGroupsMembersRemovePost"></a>
# **call2teamGroupsMembersRemovePost**
> kotlin.String call2teamGroupsMembersRemovePost(contentType, body)

groups/members/remove

[groups/members/remove](https://www.dropbox.com/developers/documentation/http/teams#team-groups-members-remove)  scope: &#x60;groups.write&#x60;  Removes members from a group. The members are removed immediately. However the revoking of group-owned resources may take additional time. Use the &#x60;groups/job_status/get&#x60; to determine whether this process has completed. This method permits removing the only owner of a group, even in cases where this is not possible via the web client. Permission : Team member management.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = TeamGroupsApi()
val contentType : kotlin.String = application/json // kotlin.String | 
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.call2teamGroupsMembersRemovePost(contentType, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamGroupsApi#call2teamGroupsMembersRemovePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamGroupsApi#call2teamGroupsMembersRemovePost")
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

<a name="call2teamGroupsMembersSetAccessTypePost"></a>
# **call2teamGroupsMembersSetAccessTypePost**
> kotlin.String call2teamGroupsMembersSetAccessTypePost(contentType, body)

groups/members/set_access_type

[groups/members/set_access_type](https://www.dropbox.com/developers/documentation/http/teams#team-groups-members-set_access_type)  scope: &#x60;groups.write&#x60;  Sets a member&#39;s access type in a group. Permission : Team member management.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = TeamGroupsApi()
val contentType : kotlin.String = application/json // kotlin.String | 
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.call2teamGroupsMembersSetAccessTypePost(contentType, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamGroupsApi#call2teamGroupsMembersSetAccessTypePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamGroupsApi#call2teamGroupsMembersSetAccessTypePost")
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

<a name="call2teamGroupsUpdatePost"></a>
# **call2teamGroupsUpdatePost**
> kotlin.String call2teamGroupsUpdatePost(contentType, body)

groups/update

[groups/update](https://www.dropbox.com/developers/documentation/http/teams#team-groups-update)  scope: &#x60;groups.write&#x60;  Updates a group&#39;s name and/or external ID. Permission : Team member management.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = TeamGroupsApi()
val contentType : kotlin.String = application/json // kotlin.String | 
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.call2teamGroupsUpdatePost(contentType, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamGroupsApi#call2teamGroupsUpdatePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamGroupsApi#call2teamGroupsUpdatePost")
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


# TeamMemberSpaceLimitsApi

All URIs are relative to *https://api.dropbox.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**call2teamMemberSpaceLimitsExcludedUsersAddPost**](TeamMemberSpaceLimitsApi.md#call2teamMemberSpaceLimitsExcludedUsersAddPost) | **POST** /2/team/member_space_limits/excluded_users/add | member_space_limits/excluded_users/add
[**call2teamMemberSpaceLimitsExcludedUsersListContinuePost**](TeamMemberSpaceLimitsApi.md#call2teamMemberSpaceLimitsExcludedUsersListContinuePost) | **POST** /2/team/member_space_limits/excluded_users/list/continue | member_space_limits/excluded_users/list/continue
[**call2teamMemberSpaceLimitsExcludedUsersListPost**](TeamMemberSpaceLimitsApi.md#call2teamMemberSpaceLimitsExcludedUsersListPost) | **POST** /2/team/member_space_limits/excluded_users/list | member_space_limits/excluded_users/list
[**call2teamMemberSpaceLimitsExcludedUsersRemovePost**](TeamMemberSpaceLimitsApi.md#call2teamMemberSpaceLimitsExcludedUsersRemovePost) | **POST** /2/team/member_space_limits/excluded_users/remove | member_space_limits/excluded_users/remove
[**call2teamMemberSpaceLimitsGetCustomQuotaPost**](TeamMemberSpaceLimitsApi.md#call2teamMemberSpaceLimitsGetCustomQuotaPost) | **POST** /2/team/member_space_limits/get_custom_quota | member_space_limits/get_custom_quota
[**call2teamMemberSpaceLimitsRemoveCustomQuotaPost**](TeamMemberSpaceLimitsApi.md#call2teamMemberSpaceLimitsRemoveCustomQuotaPost) | **POST** /2/team/member_space_limits/remove_custom_quota | member_space_limits/remove_custom_quota
[**call2teamMemberSpaceLimitsSetCustomQuotaPost**](TeamMemberSpaceLimitsApi.md#call2teamMemberSpaceLimitsSetCustomQuotaPost) | **POST** /2/team/member_space_limits/set_custom_quota | member_space_limits/set_custom_quota


<a name="call2teamMemberSpaceLimitsExcludedUsersAddPost"></a>
# **call2teamMemberSpaceLimitsExcludedUsersAddPost**
> kotlin.String call2teamMemberSpaceLimitsExcludedUsersAddPost(body)

member_space_limits/excluded_users/add

[member_space_limits/excluded_users/add](https://www.dropbox.com/developers/documentation/http/teams#team-member_space_limits-excluded_users-add)  scope: &#x60;members.write&#x60;  Add users to member space limits excluded users list.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = TeamMemberSpaceLimitsApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.call2teamMemberSpaceLimitsExcludedUsersAddPost(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamMemberSpaceLimitsApi#call2teamMemberSpaceLimitsExcludedUsersAddPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamMemberSpaceLimitsApi#call2teamMemberSpaceLimitsExcludedUsersAddPost")
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

<a name="call2teamMemberSpaceLimitsExcludedUsersListContinuePost"></a>
# **call2teamMemberSpaceLimitsExcludedUsersListContinuePost**
> kotlin.String call2teamMemberSpaceLimitsExcludedUsersListContinuePost(body)

member_space_limits/excluded_users/list/continue

[member_space_limits/excluded_users/list/continue](https://www.dropbox.com/developers/documentation/http/teams#team-member_space_limits-excluded_users-list-continue)  scope: &#x60;members.read&#x60;  Continue listing member space limits excluded users.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = TeamMemberSpaceLimitsApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.call2teamMemberSpaceLimitsExcludedUsersListContinuePost(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamMemberSpaceLimitsApi#call2teamMemberSpaceLimitsExcludedUsersListContinuePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamMemberSpaceLimitsApi#call2teamMemberSpaceLimitsExcludedUsersListContinuePost")
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

<a name="call2teamMemberSpaceLimitsExcludedUsersListPost"></a>
# **call2teamMemberSpaceLimitsExcludedUsersListPost**
> kotlin.String call2teamMemberSpaceLimitsExcludedUsersListPost(body)

member_space_limits/excluded_users/list

[member_space_limits/excluded_users/list](https://www.dropbox.com/developers/documentation/http/teams#team-member_space_limits-excluded_users-list)  scope: &#x60;members.read&#x60;  List member space limits excluded users.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = TeamMemberSpaceLimitsApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.call2teamMemberSpaceLimitsExcludedUsersListPost(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamMemberSpaceLimitsApi#call2teamMemberSpaceLimitsExcludedUsersListPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamMemberSpaceLimitsApi#call2teamMemberSpaceLimitsExcludedUsersListPost")
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

<a name="call2teamMemberSpaceLimitsExcludedUsersRemovePost"></a>
# **call2teamMemberSpaceLimitsExcludedUsersRemovePost**
> kotlin.String call2teamMemberSpaceLimitsExcludedUsersRemovePost(body)

member_space_limits/excluded_users/remove

[member_space_limits/excluded_users/remove](https://www.dropbox.com/developers/documentation/http/teams#team-member_space_limits-excluded_users-remove)  scope: &#x60;members.write&#x60;  Remove users from member space limits excluded users list.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = TeamMemberSpaceLimitsApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.call2teamMemberSpaceLimitsExcludedUsersRemovePost(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamMemberSpaceLimitsApi#call2teamMemberSpaceLimitsExcludedUsersRemovePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamMemberSpaceLimitsApi#call2teamMemberSpaceLimitsExcludedUsersRemovePost")
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

<a name="call2teamMemberSpaceLimitsGetCustomQuotaPost"></a>
# **call2teamMemberSpaceLimitsGetCustomQuotaPost**
> kotlin.String call2teamMemberSpaceLimitsGetCustomQuotaPost(body)

member_space_limits/get_custom_quota

[member_space_limits/get_custom_quota](https://www.dropbox.com/developers/documentation/http/teams#team-member_space_limits-get_custom_quota)  scope: &#x60;members.read&#x60;  Get users custom quota. Returns none as the custom quota if none was set. A maximum of 1000 members can be specified in a single call.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = TeamMemberSpaceLimitsApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.call2teamMemberSpaceLimitsGetCustomQuotaPost(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamMemberSpaceLimitsApi#call2teamMemberSpaceLimitsGetCustomQuotaPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamMemberSpaceLimitsApi#call2teamMemberSpaceLimitsGetCustomQuotaPost")
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

<a name="call2teamMemberSpaceLimitsRemoveCustomQuotaPost"></a>
# **call2teamMemberSpaceLimitsRemoveCustomQuotaPost**
> kotlin.String call2teamMemberSpaceLimitsRemoveCustomQuotaPost(body)

member_space_limits/remove_custom_quota

[member_space_limits/remove_custom_quota](https://www.dropbox.com/developers/documentation/http/teams#team-member_space_limits-remove_custom_quota)  scope: &#x60;members.write&#x60;  Remove users custom quota. A maximum of 1000 members can be specified in a single call.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = TeamMemberSpaceLimitsApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.call2teamMemberSpaceLimitsRemoveCustomQuotaPost(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamMemberSpaceLimitsApi#call2teamMemberSpaceLimitsRemoveCustomQuotaPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamMemberSpaceLimitsApi#call2teamMemberSpaceLimitsRemoveCustomQuotaPost")
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

<a name="call2teamMemberSpaceLimitsSetCustomQuotaPost"></a>
# **call2teamMemberSpaceLimitsSetCustomQuotaPost**
> kotlin.String call2teamMemberSpaceLimitsSetCustomQuotaPost(body)

member_space_limits/set_custom_quota

[member_space_limits/set_custom_quota](https://www.dropbox.com/developers/documentation/http/teams#team-member_space_limits-set_custom_quota)  scope: &#x60;members.read&#x60;  Set users custom quota. Custom quota has to be at least 15GB. A maximum of 1000 members can be specified in a single call.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = TeamMemberSpaceLimitsApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.call2teamMemberSpaceLimitsSetCustomQuotaPost(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamMemberSpaceLimitsApi#call2teamMemberSpaceLimitsSetCustomQuotaPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamMemberSpaceLimitsApi#call2teamMemberSpaceLimitsSetCustomQuotaPost")
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


# TeamDevicesApi

All URIs are relative to *https://api.dropbox.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**call2teamDevicesListMemberDevicesPost**](TeamDevicesApi.md#call2teamDevicesListMemberDevicesPost) | **POST** /2/team/devices/list_member_devices | devices/list_member_devices
[**call2teamDevicesListMembersDevicesPost**](TeamDevicesApi.md#call2teamDevicesListMembersDevicesPost) | **POST** /2/team/devices/list_members_devices | devices/list_members_devices
[**call2teamDevicesRevokeDeviceSessionBatchPost**](TeamDevicesApi.md#call2teamDevicesRevokeDeviceSessionBatchPost) | **POST** /2/team/devices/revoke_device_session_batch | devices/revoke_device_session_batch
[**call2teamDevicesRevokeDeviceSessionPost**](TeamDevicesApi.md#call2teamDevicesRevokeDeviceSessionPost) | **POST** /2/team/devices/revoke_device_session | devices/revoke_device_session


<a name="call2teamDevicesListMemberDevicesPost"></a>
# **call2teamDevicesListMemberDevicesPost**
> call2teamDevicesListMemberDevicesPost(body)

devices/list_member_devices

[devices/list_member_devices](https://www.dropbox.com/developers/documentation/http/teams#team-devices-list_member_devices)  scope: &#x60;sessions.list&#x60;  List all device sessions of a team&#39;s member.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = TeamDevicesApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    apiInstance.call2teamDevicesListMemberDevicesPost(body)
} catch (e: ClientException) {
    println("4xx response calling TeamDevicesApi#call2teamDevicesListMemberDevicesPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamDevicesApi#call2teamDevicesListMemberDevicesPost")
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

<a name="call2teamDevicesListMembersDevicesPost"></a>
# **call2teamDevicesListMembersDevicesPost**
> call2teamDevicesListMembersDevicesPost(body)

devices/list_members_devices

[devices/list_members_devices](https://www.dropbox.com/developers/documentation/http/teams#team-devices-list_members_devices)  scope: &#x60;sessions.list&#x60;  List all device sessions of a team. Permission : Team member file access.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = TeamDevicesApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    apiInstance.call2teamDevicesListMembersDevicesPost(body)
} catch (e: ClientException) {
    println("4xx response calling TeamDevicesApi#call2teamDevicesListMembersDevicesPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamDevicesApi#call2teamDevicesListMembersDevicesPost")
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

<a name="call2teamDevicesRevokeDeviceSessionBatchPost"></a>
# **call2teamDevicesRevokeDeviceSessionBatchPost**
> call2teamDevicesRevokeDeviceSessionBatchPost(body)

devices/revoke_device_session_batch

[devices/revoke_device_session_batch](https://www.dropbox.com/developers/documentation/http/teams#team-devices-revoke_device_session_batch)  scope: &#x60;sessions.modify&#x60;  Revoke a list of device sessions of team members.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = TeamDevicesApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    apiInstance.call2teamDevicesRevokeDeviceSessionBatchPost(body)
} catch (e: ClientException) {
    println("4xx response calling TeamDevicesApi#call2teamDevicesRevokeDeviceSessionBatchPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamDevicesApi#call2teamDevicesRevokeDeviceSessionBatchPost")
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

<a name="call2teamDevicesRevokeDeviceSessionPost"></a>
# **call2teamDevicesRevokeDeviceSessionPost**
> call2teamDevicesRevokeDeviceSessionPost(body)

devices/revoke_device_session

[devices/revoke_device_session](https://www.dropbox.com/developers/documentation/http/teams#team-devices-revoke_device_session)  scope: &#x60;sessions.modify&#x60;  Revoke a device session of a team&#39;s member.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = TeamDevicesApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    apiInstance.call2teamDevicesRevokeDeviceSessionPost(body)
} catch (e: ClientException) {
    println("4xx response calling TeamDevicesApi#call2teamDevicesRevokeDeviceSessionPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamDevicesApi#call2teamDevicesRevokeDeviceSessionPost")
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


# TeamMembersApi

All URIs are relative to *https://api.dropbox.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**call2teamMembersAddJobStatusGetPost**](TeamMembersApi.md#call2teamMembersAddJobStatusGetPost) | **POST** /2/team/members/add/job_status/get | members/add/job_status/get
[**call2teamMembersAddPost**](TeamMembersApi.md#call2teamMembersAddPost) | **POST** /2/team/members/add | members/add
[**call2teamMembersDeleteProfilePhotoPost**](TeamMembersApi.md#call2teamMembersDeleteProfilePhotoPost) | **POST** /2/team/members/delete_profile_photo | members/delete_profile_photo
[**call2teamMembersGetInfoPost**](TeamMembersApi.md#call2teamMembersGetInfoPost) | **POST** /2/team/members/get_info | members/get_info
[**call2teamMembersListContinuePost**](TeamMembersApi.md#call2teamMembersListContinuePost) | **POST** /2/team/members/list/continue | members/list/continue
[**call2teamMembersListPost**](TeamMembersApi.md#call2teamMembersListPost) | **POST** /2/team/members/list | members/list
[**call2teamMembersMoveFormerMemberFilesJobStatusCheckPost**](TeamMembersApi.md#call2teamMembersMoveFormerMemberFilesJobStatusCheckPost) | **POST** /2/team/members/move_former_member_files/job_status/check | members/move_former_member_files/job_status/check
[**call2teamMembersMoveFormerMemberFilesPost**](TeamMembersApi.md#call2teamMembersMoveFormerMemberFilesPost) | **POST** /2/team/members/move_former_member_files | members/move_former_member_files
[**call2teamMembersRecoverPost**](TeamMembersApi.md#call2teamMembersRecoverPost) | **POST** /2/team/members/recover | members/recover
[**call2teamMembersRemoveJobStatusGetPost**](TeamMembersApi.md#call2teamMembersRemoveJobStatusGetPost) | **POST** /2/team/members/remove/job_status/get | members/remove/job_status/get
[**call2teamMembersRemovePost**](TeamMembersApi.md#call2teamMembersRemovePost) | **POST** /2/team/members/remove | members/remove
[**call2teamMembersSecondaryEmailsAddPost**](TeamMembersApi.md#call2teamMembersSecondaryEmailsAddPost) | **POST** /2/team/members/secondary_emails/add | members/secondary_emails/add
[**call2teamMembersSecondaryEmailsDeletePost**](TeamMembersApi.md#call2teamMembersSecondaryEmailsDeletePost) | **POST** /2/team/members/secondary_emails/delete | members/secondary_emails/delete
[**call2teamMembersSecondaryEmailsResendVerificationEmailsPost**](TeamMembersApi.md#call2teamMembersSecondaryEmailsResendVerificationEmailsPost) | **POST** /2/team/members/secondary_emails/resend_verification_emails | members/secondary_emails/resend_verification_emails
[**call2teamMembersSendWelcomeEmailPost**](TeamMembersApi.md#call2teamMembersSendWelcomeEmailPost) | **POST** /2/team/members/send_welcome_email | members/send_welcome_email
[**call2teamMembersSetAdminPermissionsPost**](TeamMembersApi.md#call2teamMembersSetAdminPermissionsPost) | **POST** /2/team/members/set_admin_permissions | members/set_admin_permissions
[**call2teamMembersSetProfilePhotoPost**](TeamMembersApi.md#call2teamMembersSetProfilePhotoPost) | **POST** /2/team/members/set_profile_photo | members/set_profile_photo
[**call2teamMembersSetProfilePost**](TeamMembersApi.md#call2teamMembersSetProfilePost) | **POST** /2/team/members/set_profile | members/set_profile
[**call2teamMembersSuspendPost**](TeamMembersApi.md#call2teamMembersSuspendPost) | **POST** /2/team/members/suspend | members/suspend
[**call2teamMembersUnsuspendPost**](TeamMembersApi.md#call2teamMembersUnsuspendPost) | **POST** /2/team/members/unsuspend | members/unsuspend


<a name="call2teamMembersAddJobStatusGetPost"></a>
# **call2teamMembersAddJobStatusGetPost**
> kotlin.String call2teamMembersAddJobStatusGetPost(body)

members/add/job_status/get

[members/add/job_status/get](https://www.dropbox.com/developers/documentation/http/teams#team-members-add-job_status-get)  scope: &#x60;members.write&#x60;  Once an async_job_id is returned from &#x60;members/add&#x60; , use this to poll the status of the asynchronous request. Permission : Team member management.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = TeamMembersApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.call2teamMembersAddJobStatusGetPost(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamMembersApi#call2teamMembersAddJobStatusGetPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamMembersApi#call2teamMembersAddJobStatusGetPost")
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

<a name="call2teamMembersAddPost"></a>
# **call2teamMembersAddPost**
> kotlin.String call2teamMembersAddPost(body)

members/add

[members/add](https://www.dropbox.com/developers/documentation/http/teams#team-members-add)  scope: &#x60;members.write&#x60;  Adds members to a team. Permission : Team member management A maximum of 20 members can be specified in a single call. If no Dropbox account exists with the email address specified, a new Dropbox account will be created with the given email address, and that account will be invited to the team. If a personal Dropbox account exists with the email address specified in the call, this call will create a placeholder Dropbox account for the user on the team and send an email inviting the user to migrate their existing personal account onto the team. Team member management apps are required to set an initial given_name and surname for a user to use in the team invitation and for &#39;Perform as team member&#39; actions taken on the user before they become &#39;active&#39;.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = TeamMembersApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.call2teamMembersAddPost(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamMembersApi#call2teamMembersAddPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamMembersApi#call2teamMembersAddPost")
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

<a name="call2teamMembersDeleteProfilePhotoPost"></a>
# **call2teamMembersDeleteProfilePhotoPost**
> kotlin.String call2teamMembersDeleteProfilePhotoPost(body)

members/delete_profile_photo

[members/delete_profile_photo](https://www.dropbox.com/developers/documentation/http/teams#team-members-delete_profile_photo)  scope: &#x60;members.write&#x60;  Deletes a team member&#39;s profile photo. Permission : Team member management.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = TeamMembersApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.call2teamMembersDeleteProfilePhotoPost(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamMembersApi#call2teamMembersDeleteProfilePhotoPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamMembersApi#call2teamMembersDeleteProfilePhotoPost")
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

<a name="call2teamMembersGetInfoPost"></a>
# **call2teamMembersGetInfoPost**
> kotlin.String call2teamMembersGetInfoPost(body)

members/get_info

[members/get_info](https://www.dropbox.com/developers/documentation/http/teams#team-members-get_info)  scope: &#x60;members.read&#x60;  Returns information about multiple team members. Permission : Team information This endpoint will return &#x60;MembersGetInfoItem.id_not_found&#x60;, for IDs (or emails) that cannot be matched to a valid team member.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = TeamMembersApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.call2teamMembersGetInfoPost(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamMembersApi#call2teamMembersGetInfoPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamMembersApi#call2teamMembersGetInfoPost")
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

<a name="call2teamMembersListContinuePost"></a>
# **call2teamMembersListContinuePost**
> kotlin.String call2teamMembersListContinuePost(body)

members/list/continue

[members/list/continue](https://www.dropbox.com/developers/documentation/http/teams#team-members-list-continue)  scope: &#x60;members.read&#x60;  Once a cursor has been retrieved from &#x60;members/list&#x60;, use this to paginate through all team members. Permission : Team information.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = TeamMembersApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.call2teamMembersListContinuePost(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamMembersApi#call2teamMembersListContinuePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamMembersApi#call2teamMembersListContinuePost")
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

<a name="call2teamMembersListPost"></a>
# **call2teamMembersListPost**
> kotlin.String call2teamMembersListPost(body)

members/list

[members/list](https://www.dropbox.com/developers/documentation/http/teams#team-members-list)  scope: &#x60;members.read&#x60;  Lists members of a team. Permission : Team information.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = TeamMembersApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.call2teamMembersListPost(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamMembersApi#call2teamMembersListPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamMembersApi#call2teamMembersListPost")
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

<a name="call2teamMembersMoveFormerMemberFilesJobStatusCheckPost"></a>
# **call2teamMembersMoveFormerMemberFilesJobStatusCheckPost**
> kotlin.String call2teamMembersMoveFormerMemberFilesJobStatusCheckPost(body)

members/move_former_member_files/job_status/check

[members/move_former_member_files/job_status/check](https://www.dropbox.com/developers/documentation/http/teams#team-members-move_former_member_files-job_status-check)  scope: &#x60;members.write&#x60;  Once an async_job_id is returned from &#x60;members/move_former_member_files&#x60; , use this to poll the status of the asynchronous request. Permission : Team member management.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = TeamMembersApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.call2teamMembersMoveFormerMemberFilesJobStatusCheckPost(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamMembersApi#call2teamMembersMoveFormerMemberFilesJobStatusCheckPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamMembersApi#call2teamMembersMoveFormerMemberFilesJobStatusCheckPost")
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

<a name="call2teamMembersMoveFormerMemberFilesPost"></a>
# **call2teamMembersMoveFormerMemberFilesPost**
> kotlin.String call2teamMembersMoveFormerMemberFilesPost(body)

members/move_former_member_files

[members/move_former_member_files](https://www.dropbox.com/developers/documentation/http/teams#team-members-move_former_member_files)  scope: &#x60;members.write&#x60;  Moves removed member&#39;s files to a different member. This endpoint initiates an asynchronous job. To obtain the final result of the job, the client should periodically poll &#x60;members/move_former_member_files/job_status/check&#x60;. Permission : Team member management.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = TeamMembersApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.call2teamMembersMoveFormerMemberFilesPost(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamMembersApi#call2teamMembersMoveFormerMemberFilesPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamMembersApi#call2teamMembersMoveFormerMemberFilesPost")
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

<a name="call2teamMembersRecoverPost"></a>
# **call2teamMembersRecoverPost**
> call2teamMembersRecoverPost(body)

members/recover

[members/recover](https://www.dropbox.com/developers/documentation/http/teams#team-members-recover)  scope: &#x60;members.delete&#x60;  Recover a deleted member. Permission : Team member management Exactly one of team_member_id, email, or external_id must be provided to identify the user account.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = TeamMembersApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    apiInstance.call2teamMembersRecoverPost(body)
} catch (e: ClientException) {
    println("4xx response calling TeamMembersApi#call2teamMembersRecoverPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamMembersApi#call2teamMembersRecoverPost")
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

<a name="call2teamMembersRemoveJobStatusGetPost"></a>
# **call2teamMembersRemoveJobStatusGetPost**
> kotlin.String call2teamMembersRemoveJobStatusGetPost(body)

members/remove/job_status/get

[members/remove/job_status/get](https://www.dropbox.com/developers/documentation/http/teams#team-members-remove-job_status-get)  scope: &#x60;members.delete&#x60;  Once an async_job_id is returned from &#x60;members/remove&#x60; , use this to poll the status of the asynchronous request. Permission : Team member management.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = TeamMembersApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.call2teamMembersRemoveJobStatusGetPost(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamMembersApi#call2teamMembersRemoveJobStatusGetPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamMembersApi#call2teamMembersRemoveJobStatusGetPost")
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

<a name="call2teamMembersRemovePost"></a>
# **call2teamMembersRemovePost**
> kotlin.String call2teamMembersRemovePost(body)

members/remove

[members/remove](https://www.dropbox.com/developers/documentation/http/teams#team-members-remove)  scope: &#x60;members.delete&#x60;  Removes a member from a team. Permission : Team member management Exactly one of team_member_id, email, or external_id must be provided to identify the user account. Accounts can be recovered via &#x60;members/recover&#x60; for a 7 day period or until the account has been permanently deleted or transferred to another account (whichever comes first). Calling &#x60;members/add&#x60; while a user is still recoverable on your team will return with &#x60;MemberAddResult.user_already_on_team&#x60;. Accounts can have their files transferred via the admin console for a limited time, based on the version history length associated with the team (180 days for most teams). This endpoint may initiate an asynchronous job. To obtain the final result of the job, the client should periodically poll &#x60;members/remove/job_status/get&#x60;.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = TeamMembersApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.call2teamMembersRemovePost(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamMembersApi#call2teamMembersRemovePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamMembersApi#call2teamMembersRemovePost")
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

<a name="call2teamMembersSecondaryEmailsAddPost"></a>
# **call2teamMembersSecondaryEmailsAddPost**
> kotlin.String call2teamMembersSecondaryEmailsAddPost(body)

members/secondary_emails/add

[members/secondary_emails/add](https://www.dropbox.com/developers/documentation/http/teams#team-members-secondary_emails-add)  scope: &#x60;members.write&#x60;  Add secondary emails to users. Permission : Team member management. Emails that are on verified domains will be verified automatically. For each email address not on a verified domain a verification email will be sent.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = TeamMembersApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.call2teamMembersSecondaryEmailsAddPost(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamMembersApi#call2teamMembersSecondaryEmailsAddPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamMembersApi#call2teamMembersSecondaryEmailsAddPost")
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

<a name="call2teamMembersSecondaryEmailsDeletePost"></a>
# **call2teamMembersSecondaryEmailsDeletePost**
> kotlin.String call2teamMembersSecondaryEmailsDeletePost(body)

members/secondary_emails/delete

[members/secondary_emails/delete](https://www.dropbox.com/developers/documentation/http/teams#team-members-secondary_emails-delete)  scope: &#x60;members.write&#x60;  Delete secondary emails from users Permission : Team member management. Users will be notified of deletions of verified secondary emails at both the secondary email and their primary email.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = TeamMembersApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.call2teamMembersSecondaryEmailsDeletePost(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamMembersApi#call2teamMembersSecondaryEmailsDeletePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamMembersApi#call2teamMembersSecondaryEmailsDeletePost")
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

<a name="call2teamMembersSecondaryEmailsResendVerificationEmailsPost"></a>
# **call2teamMembersSecondaryEmailsResendVerificationEmailsPost**
> kotlin.String call2teamMembersSecondaryEmailsResendVerificationEmailsPost(body)

members/secondary_emails/resend_verification_emails

[members/secondary_emails/resend_verification_emails](https://www.dropbox.com/developers/documentation/http/teams#team-members-secondary_emails-resend_verification_emails)  scope: &#x60;members.write&#x60;  Resend secondary email verification emails. Permission : Team member management.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = TeamMembersApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.call2teamMembersSecondaryEmailsResendVerificationEmailsPost(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamMembersApi#call2teamMembersSecondaryEmailsResendVerificationEmailsPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamMembersApi#call2teamMembersSecondaryEmailsResendVerificationEmailsPost")
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

<a name="call2teamMembersSendWelcomeEmailPost"></a>
# **call2teamMembersSendWelcomeEmailPost**
> call2teamMembersSendWelcomeEmailPost(body)

members/send_welcome_email

[members/send_welcome_email](https://www.dropbox.com/developers/documentation/http/teams#team-members-send_welcome_email)  scope: &#x60;members.write&#x60;  Sends welcome email to pending team member. Permission : Team member management Exactly one of team_member_id, email, or external_id must be provided to identify the user account. No-op if team member is not pending.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = TeamMembersApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    apiInstance.call2teamMembersSendWelcomeEmailPost(body)
} catch (e: ClientException) {
    println("4xx response calling TeamMembersApi#call2teamMembersSendWelcomeEmailPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamMembersApi#call2teamMembersSendWelcomeEmailPost")
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

<a name="call2teamMembersSetAdminPermissionsPost"></a>
# **call2teamMembersSetAdminPermissionsPost**
> kotlin.String call2teamMembersSetAdminPermissionsPost(body)

members/set_admin_permissions

[members/set_admin_permissions](https://www.dropbox.com/developers/documentation/http/teams#team-members-set_admin_permissions)  scope: &#x60;members.write&#x60;  Updates a team member&#39;s permissions. Permission : Team member management.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = TeamMembersApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.call2teamMembersSetAdminPermissionsPost(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamMembersApi#call2teamMembersSetAdminPermissionsPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamMembersApi#call2teamMembersSetAdminPermissionsPost")
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

<a name="call2teamMembersSetProfilePhotoPost"></a>
# **call2teamMembersSetProfilePhotoPost**
> kotlin.String call2teamMembersSetProfilePhotoPost(body)

members/set_profile_photo

[members/set_profile_photo](https://www.dropbox.com/developers/documentation/http/teams#team-members-set_profile_photo)  scope: &#x60;members.write&#x60;  Updates a team member&#39;s profile photo. Permission : Team member management.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = TeamMembersApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.call2teamMembersSetProfilePhotoPost(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamMembersApi#call2teamMembersSetProfilePhotoPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamMembersApi#call2teamMembersSetProfilePhotoPost")
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

<a name="call2teamMembersSetProfilePost"></a>
# **call2teamMembersSetProfilePost**
> kotlin.String call2teamMembersSetProfilePost(body)

members/set_profile

[members/set_profile](https://www.dropbox.com/developers/documentation/http/teams#team-members-set_profile)  scope: &#x60;members.write&#x60;  Updates a team member&#39;s profile. Permission : Team member management.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = TeamMembersApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.call2teamMembersSetProfilePost(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamMembersApi#call2teamMembersSetProfilePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamMembersApi#call2teamMembersSetProfilePost")
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

<a name="call2teamMembersSuspendPost"></a>
# **call2teamMembersSuspendPost**
> call2teamMembersSuspendPost(body)

members/suspend

[members/suspend](https://www.dropbox.com/developers/documentation/http/teams#team-members-suspend)  scope: &#x60;members.write&#x60;  Suspend a member from a team. Permission : Team member management Exactly one of team_member_id, email, or external_id must be provided to identify the user account.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = TeamMembersApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    apiInstance.call2teamMembersSuspendPost(body)
} catch (e: ClientException) {
    println("4xx response calling TeamMembersApi#call2teamMembersSuspendPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamMembersApi#call2teamMembersSuspendPost")
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

<a name="call2teamMembersUnsuspendPost"></a>
# **call2teamMembersUnsuspendPost**
> call2teamMembersUnsuspendPost(body)

members/unsuspend

[members/unsuspend](https://www.dropbox.com/developers/documentation/http/teams#team-members-unsuspend)  scope: &#x60;members.write&#x60;  Unsuspend a member from a team. Permission : Team member management Exactly one of team_member_id, email, or external_id must be provided to identify the user account.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = TeamMembersApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    apiInstance.call2teamMembersUnsuspendPost(body)
} catch (e: ClientException) {
    println("4xx response calling TeamMembersApi#call2teamMembersUnsuspendPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamMembersApi#call2teamMembersUnsuspendPost")
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


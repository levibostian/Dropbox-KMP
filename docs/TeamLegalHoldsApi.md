# TeamLegalHoldsApi

All URIs are relative to *https://api.dropbox.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**call2teamLegalHoldsCreatePolicyPost**](TeamLegalHoldsApi.md#call2teamLegalHoldsCreatePolicyPost) | **POST** /2/team/legal_holds/create_policy | legal_holds/create_policy
[**call2teamLegalHoldsGetPolicyPost**](TeamLegalHoldsApi.md#call2teamLegalHoldsGetPolicyPost) | **POST** /2/team/legal_holds/get_policy | legal_holds/get_policy
[**call2teamLegalHoldsListHeldRevisionsContinuePost**](TeamLegalHoldsApi.md#call2teamLegalHoldsListHeldRevisionsContinuePost) | **POST** /2/team/legal_holds/list_held_revisions_continue | legal_holds/list_held_revisions_continue
[**call2teamLegalHoldsListHeldRevisionsPost**](TeamLegalHoldsApi.md#call2teamLegalHoldsListHeldRevisionsPost) | **POST** /2/team/legal_holds/list_held_revisions | legal_holds/list_held_revisions
[**call2teamLegalHoldsListPoliciesPost**](TeamLegalHoldsApi.md#call2teamLegalHoldsListPoliciesPost) | **POST** /2/team/legal_holds/list_policies | legal_holds/list_policies
[**call2teamLegalHoldsReleasePolicyPost**](TeamLegalHoldsApi.md#call2teamLegalHoldsReleasePolicyPost) | **POST** /2/team/legal_holds/release_policy | legal_holds/release_policy
[**call2teamLegalHoldsUpdatePolicyPost**](TeamLegalHoldsApi.md#call2teamLegalHoldsUpdatePolicyPost) | **POST** /2/team/legal_holds/update_policy | legal_holds/update_policy


<a name="call2teamLegalHoldsCreatePolicyPost"></a>
# **call2teamLegalHoldsCreatePolicyPost**
> kotlin.String call2teamLegalHoldsCreatePolicyPost(body)

legal_holds/create_policy

[legal_holds/create_policy](https://www.dropbox.com/developers/documentation/http/teams#team-legal_holds-create_policy)  scope: &#x60;team_data.member&#x60;  Creates new legal hold policy. Note: Legal Holds is a paid add-on. Not all teams have the feature. Permission : Team member file access.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = TeamLegalHoldsApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.call2teamLegalHoldsCreatePolicyPost(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamLegalHoldsApi#call2teamLegalHoldsCreatePolicyPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamLegalHoldsApi#call2teamLegalHoldsCreatePolicyPost")
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

<a name="call2teamLegalHoldsGetPolicyPost"></a>
# **call2teamLegalHoldsGetPolicyPost**
> kotlin.String call2teamLegalHoldsGetPolicyPost(body)

legal_holds/get_policy

[legal_holds/get_policy](https://www.dropbox.com/developers/documentation/http/teams#team-legal_holds-get_policy)  scope: &#x60;team_data.member&#x60;  Gets a legal hold by Id. Note: Legal Holds is a paid add-on. Not all teams have the feature. Permission : Team member file access.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = TeamLegalHoldsApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.call2teamLegalHoldsGetPolicyPost(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamLegalHoldsApi#call2teamLegalHoldsGetPolicyPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamLegalHoldsApi#call2teamLegalHoldsGetPolicyPost")
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

<a name="call2teamLegalHoldsListHeldRevisionsContinuePost"></a>
# **call2teamLegalHoldsListHeldRevisionsContinuePost**
> kotlin.String call2teamLegalHoldsListHeldRevisionsContinuePost(body)

legal_holds/list_held_revisions_continue

[legal_holds/list_held_revisions_continue](https://www.dropbox.com/developers/documentation/http/teams#team-legal_holds-list_held_revisions_continue)  scope: &#x60;team_data.member&#x60;  Continue listing the file metadata that&#39;s under the hold. Note: Legal Holds is a paid add-on. Not all teams have the feature. Permission : Team member file access.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = TeamLegalHoldsApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.call2teamLegalHoldsListHeldRevisionsContinuePost(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamLegalHoldsApi#call2teamLegalHoldsListHeldRevisionsContinuePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamLegalHoldsApi#call2teamLegalHoldsListHeldRevisionsContinuePost")
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

<a name="call2teamLegalHoldsListHeldRevisionsPost"></a>
# **call2teamLegalHoldsListHeldRevisionsPost**
> kotlin.String call2teamLegalHoldsListHeldRevisionsPost(body)

legal_holds/list_held_revisions

[legal_holds/list_held_revisions](https://www.dropbox.com/developers/documentation/http/teams#team-legal_holds-list_held_revisions)  scope: &#x60;team_data.member&#x60;  List the file metadata that&#39;s under the hold. Note: Legal Holds is a paid add-on. Not all teams have the feature. Permission : Team member file access.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = TeamLegalHoldsApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.call2teamLegalHoldsListHeldRevisionsPost(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamLegalHoldsApi#call2teamLegalHoldsListHeldRevisionsPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamLegalHoldsApi#call2teamLegalHoldsListHeldRevisionsPost")
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

<a name="call2teamLegalHoldsListPoliciesPost"></a>
# **call2teamLegalHoldsListPoliciesPost**
> kotlin.String call2teamLegalHoldsListPoliciesPost(body)

legal_holds/list_policies

[legal_holds/list_policies](https://www.dropbox.com/developers/documentation/http/teams#team-legal_holds-list_policies)  scope: &#x60;team_data.member&#x60;  Lists legal holds on a team. Note: Legal Holds is a paid add-on. Not all teams have the feature. Permission : Team member file access.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = TeamLegalHoldsApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.call2teamLegalHoldsListPoliciesPost(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamLegalHoldsApi#call2teamLegalHoldsListPoliciesPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamLegalHoldsApi#call2teamLegalHoldsListPoliciesPost")
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

<a name="call2teamLegalHoldsReleasePolicyPost"></a>
# **call2teamLegalHoldsReleasePolicyPost**
> call2teamLegalHoldsReleasePolicyPost(body)

legal_holds/release_policy

[legal_holds/release_policy](https://www.dropbox.com/developers/documentation/http/teams#team-legal_holds-release_policy)  scope: &#x60;team_data.member&#x60;  Releases a legal hold by Id. Note: Legal Holds is a paid add-on. Not all teams have the feature. Permission : Team member file access.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = TeamLegalHoldsApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    apiInstance.call2teamLegalHoldsReleasePolicyPost(body)
} catch (e: ClientException) {
    println("4xx response calling TeamLegalHoldsApi#call2teamLegalHoldsReleasePolicyPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamLegalHoldsApi#call2teamLegalHoldsReleasePolicyPost")
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

<a name="call2teamLegalHoldsUpdatePolicyPost"></a>
# **call2teamLegalHoldsUpdatePolicyPost**
> kotlin.String call2teamLegalHoldsUpdatePolicyPost(body)

legal_holds/update_policy

[legal_holds/update_policy](https://www.dropbox.com/developers/documentation/http/teams#team-legal_holds-update_policy)  scope: &#x60;team_data.member&#x60;  Updates a legal hold. Note: Legal Holds is a paid add-on. Not all teams have the feature. Permission : Team member file access.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = TeamLegalHoldsApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.call2teamLegalHoldsUpdatePolicyPost(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamLegalHoldsApi#call2teamLegalHoldsUpdatePolicyPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamLegalHoldsApi#call2teamLegalHoldsUpdatePolicyPost")
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


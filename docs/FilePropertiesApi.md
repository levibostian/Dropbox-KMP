# FilePropertiesApi

All URIs are relative to *https://api.dropbox.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**call2filePropertiesPropertiesAddPost**](FilePropertiesApi.md#call2filePropertiesPropertiesAddPost) | **POST** /2/file_properties/properties/add | properties/add
[**call2filePropertiesPropertiesOverwritePost**](FilePropertiesApi.md#call2filePropertiesPropertiesOverwritePost) | **POST** /2/file_properties/properties/overwrite | properties/overwrite
[**call2filePropertiesPropertiesRemovePost**](FilePropertiesApi.md#call2filePropertiesPropertiesRemovePost) | **POST** /2/file_properties/properties/remove | properties/remove
[**call2filePropertiesPropertiesSearchContinuePost**](FilePropertiesApi.md#call2filePropertiesPropertiesSearchContinuePost) | **POST** /2/file_properties/properties/search/continue | properties/search/continue
[**call2filePropertiesPropertiesSearchPost**](FilePropertiesApi.md#call2filePropertiesPropertiesSearchPost) | **POST** /2/file_properties/properties/search | properties/search
[**call2filePropertiesPropertiesUpdatePost**](FilePropertiesApi.md#call2filePropertiesPropertiesUpdatePost) | **POST** /2/file_properties/properties/update | properties/update
[**call2filePropertiesTemplatesAddForTeamPost**](FilePropertiesApi.md#call2filePropertiesTemplatesAddForTeamPost) | **POST** /2/file_properties/templates/add_for_team | templates/add_for_team
[**call2filePropertiesTemplatesAddForUserPost**](FilePropertiesApi.md#call2filePropertiesTemplatesAddForUserPost) | **POST** /2/file_properties/templates/add_for_user | templates/add_for_user
[**call2filePropertiesTemplatesGetForTeamPost**](FilePropertiesApi.md#call2filePropertiesTemplatesGetForTeamPost) | **POST** /2/file_properties/templates/get_for_team | templates/get_for_team
[**call2filePropertiesTemplatesGetForUserPost**](FilePropertiesApi.md#call2filePropertiesTemplatesGetForUserPost) | **POST** /2/file_properties/templates/get_for_user | templates/get_for_user
[**call2filePropertiesTemplatesListForTeamPost**](FilePropertiesApi.md#call2filePropertiesTemplatesListForTeamPost) | **POST** /2/file_properties/templates/list_for_team | templates/list_for_team
[**call2filePropertiesTemplatesListForUserPost**](FilePropertiesApi.md#call2filePropertiesTemplatesListForUserPost) | **POST** /2/file_properties/templates/list_for_user | templates/list_for_user
[**call2filePropertiesTemplatesRemoveForTeamPost**](FilePropertiesApi.md#call2filePropertiesTemplatesRemoveForTeamPost) | **POST** /2/file_properties/templates/remove_for_team | templates/remove_for_team
[**call2filePropertiesTemplatesRemoveForUserPost**](FilePropertiesApi.md#call2filePropertiesTemplatesRemoveForUserPost) | **POST** /2/file_properties/templates/remove_for_user | templates/remove_for_user
[**call2filePropertiesTemplatesUpdateForTeamPost**](FilePropertiesApi.md#call2filePropertiesTemplatesUpdateForTeamPost) | **POST** /2/file_properties/templates/update_for_team | templates/update_for_team
[**call2filePropertiesTemplatesUpdateForUserPost**](FilePropertiesApi.md#call2filePropertiesTemplatesUpdateForUserPost) | **POST** /2/file_properties/templates/update_for_user | templates/update_for_user


<a name="call2filePropertiesPropertiesAddPost"></a>
# **call2filePropertiesPropertiesAddPost**
> call2filePropertiesPropertiesAddPost(body)

properties/add

[properties/add](https://www.dropbox.com/developers/documentation/http/documentation#file_properties-properties-add)  scope: &#x60;files.metadata.write&#x60;  Add property groups to a Dropbox file. See &#x60;templates/add_for_user&#x60; or &#x60;templates/add_for_team&#x60; to create new templates.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = FilePropertiesApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    apiInstance.call2filePropertiesPropertiesAddPost(body)
} catch (e: ClientException) {
    println("4xx response calling FilePropertiesApi#call2filePropertiesPropertiesAddPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilePropertiesApi#call2filePropertiesPropertiesAddPost")
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

<a name="call2filePropertiesPropertiesOverwritePost"></a>
# **call2filePropertiesPropertiesOverwritePost**
> call2filePropertiesPropertiesOverwritePost(body)

properties/overwrite

[properties/overwrite](https://www.dropbox.com/developers/documentation/http/documentation#file_properties-properties-overwrite)  scope: &#x60;files.metadata.write&#x60;  Overwrite property groups associated with a file. This endpoint should be used instead of &#x60;properties/update&#x60; when property groups are being updated via a \&quot;snapshot\&quot; instead of via a \&quot;delta\&quot;. In other words, this endpoint will delete all omitted fields from a property group, whereas &#x60;properties/update&#x60; will only delete fields that are explicitly marked for deletion.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = FilePropertiesApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    apiInstance.call2filePropertiesPropertiesOverwritePost(body)
} catch (e: ClientException) {
    println("4xx response calling FilePropertiesApi#call2filePropertiesPropertiesOverwritePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilePropertiesApi#call2filePropertiesPropertiesOverwritePost")
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

<a name="call2filePropertiesPropertiesRemovePost"></a>
# **call2filePropertiesPropertiesRemovePost**
> call2filePropertiesPropertiesRemovePost(body)

properties/remove

[properties/remove](https://www.dropbox.com/developers/documentation/http/documentation#file_properties-properties-remove)  scope: &#x60;files.metadata.write&#x60;  Permanently removes the specified property group from the file. To remove specific property field key value pairs, see &#x60;properties/update&#x60;. To update a template, see &#x60;templates/update_for_user&#x60; or &#x60;templates/update_for_team&#x60;. To remove a template, see &#x60;templates/remove_for_user&#x60; or &#x60;templates/remove_for_team&#x60;.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = FilePropertiesApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    apiInstance.call2filePropertiesPropertiesRemovePost(body)
} catch (e: ClientException) {
    println("4xx response calling FilePropertiesApi#call2filePropertiesPropertiesRemovePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilePropertiesApi#call2filePropertiesPropertiesRemovePost")
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

<a name="call2filePropertiesPropertiesSearchContinuePost"></a>
# **call2filePropertiesPropertiesSearchContinuePost**
> kotlin.String call2filePropertiesPropertiesSearchContinuePost(body)

properties/search/continue

[properties/search/continue](https://www.dropbox.com/developers/documentation/http/documentation#file_properties-properties-search-continue)  scope: &#x60;files.metadata.read&#x60;  Once a cursor has been retrieved from &#x60;properties/search&#x60;, use this to paginate through all search results.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = FilePropertiesApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.call2filePropertiesPropertiesSearchContinuePost(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FilePropertiesApi#call2filePropertiesPropertiesSearchContinuePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilePropertiesApi#call2filePropertiesPropertiesSearchContinuePost")
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

<a name="call2filePropertiesPropertiesSearchPost"></a>
# **call2filePropertiesPropertiesSearchPost**
> kotlin.String call2filePropertiesPropertiesSearchPost(authorization, body)

properties/search

[properties/search](https://www.dropbox.com/developers/documentation/http/documentation#file_properties-properties-search)  scope: &#x60;files.metadata.read&#x60;  Search across property templates for particular property field values.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = FilePropertiesApi()
val authorization : kotlin.String =  Bearer IU571Pc9cGAAAAAAAAAAAQh57r-VTd7qBjZBUsVHLR6NRVTcd0FOThotVQmF9q9F // kotlin.String | 
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.call2filePropertiesPropertiesSearchPost(authorization, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FilePropertiesApi#call2filePropertiesPropertiesSearchPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilePropertiesApi#call2filePropertiesPropertiesSearchPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **kotlin.String**|  | [optional]
 **body** | **kotlin.String**|  | [optional]

### Return type

**kotlin.String**

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="call2filePropertiesPropertiesUpdatePost"></a>
# **call2filePropertiesPropertiesUpdatePost**
> call2filePropertiesPropertiesUpdatePost(body)

properties/update

[properties/update](https://www.dropbox.com/developers/documentation/http/documentation#file_properties-properties-update)  scope: &#x60;files.metadata.write&#x60;  Add, update or remove properties associated with the supplied file and templates. This endpoint should be used instead of &#x60;properties/overwrite&#x60; when property groups are being updated via a \&quot;delta\&quot; instead of via a \&quot;snapshot\&quot; . In other words, this endpoint will not delete any omitted fields from a property group, whereas &#x60;properties/overwrite&#x60; will delete any fields that are omitted from a property group.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = FilePropertiesApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    apiInstance.call2filePropertiesPropertiesUpdatePost(body)
} catch (e: ClientException) {
    println("4xx response calling FilePropertiesApi#call2filePropertiesPropertiesUpdatePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilePropertiesApi#call2filePropertiesPropertiesUpdatePost")
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

<a name="call2filePropertiesTemplatesAddForTeamPost"></a>
# **call2filePropertiesTemplatesAddForTeamPost**
> kotlin.String call2filePropertiesTemplatesAddForTeamPost(body)

templates/add_for_team

[templates/add_for_team](https://www.dropbox.com/developers/documentation/http/teams#file_properties-templates-add_for_team)  scope: &#x60;files.team_metadata.write&#x60;  Add a template associated with a team. See &#x60;properties/add&#x60; to add properties to a file or folder. Note: this endpoint will create team-owned templates.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = FilePropertiesApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.call2filePropertiesTemplatesAddForTeamPost(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FilePropertiesApi#call2filePropertiesTemplatesAddForTeamPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilePropertiesApi#call2filePropertiesTemplatesAddForTeamPost")
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

<a name="call2filePropertiesTemplatesAddForUserPost"></a>
# **call2filePropertiesTemplatesAddForUserPost**
> kotlin.String call2filePropertiesTemplatesAddForUserPost(body)

templates/add_for_user

[templates/add_for_user](https://www.dropbox.com/developers/documentation/http/documentation#file_properties-templates-add_for_user)  scope: &#x60;files.metadata.write&#x60;  Add a template associated with a user. See &#x60;properties/add&#x60; to add properties to a file. This endpoint can&#39;t be called on a team member or admin&#39;s behalf.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = FilePropertiesApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.call2filePropertiesTemplatesAddForUserPost(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FilePropertiesApi#call2filePropertiesTemplatesAddForUserPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilePropertiesApi#call2filePropertiesTemplatesAddForUserPost")
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

<a name="call2filePropertiesTemplatesGetForTeamPost"></a>
# **call2filePropertiesTemplatesGetForTeamPost**
> kotlin.String call2filePropertiesTemplatesGetForTeamPost(body)

templates/get_for_team

[templates/get_for_team](https://www.dropbox.com/developers/documentation/http/teams#file_properties-templates-get_for_team)  scope: &#x60;files.team_metadata.write&#x60;  Get the schema for a specified template.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = FilePropertiesApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.call2filePropertiesTemplatesGetForTeamPost(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FilePropertiesApi#call2filePropertiesTemplatesGetForTeamPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilePropertiesApi#call2filePropertiesTemplatesGetForTeamPost")
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

<a name="call2filePropertiesTemplatesGetForUserPost"></a>
# **call2filePropertiesTemplatesGetForUserPost**
> kotlin.String call2filePropertiesTemplatesGetForUserPost(body)

templates/get_for_user

[templates/get_for_user](https://www.dropbox.com/developers/documentation/http/documentation#file_properties-templates-get_for_user)  scope: &#x60;files.metadata.read&#x60;  Get the schema for a specified template. This endpoint can&#39;t be called on a team member or admin&#39;s behalf.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = FilePropertiesApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.call2filePropertiesTemplatesGetForUserPost(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FilePropertiesApi#call2filePropertiesTemplatesGetForUserPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilePropertiesApi#call2filePropertiesTemplatesGetForUserPost")
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

<a name="call2filePropertiesTemplatesListForTeamPost"></a>
# **call2filePropertiesTemplatesListForTeamPost**
> kotlin.String call2filePropertiesTemplatesListForTeamPost()

templates/list_for_team

[templates/list_for_team](https://www.dropbox.com/developers/documentation/http/teams#file_properties-templates-list_for_team)  scope: &#x60;files.team_metadata.write&#x60;  Get the template identifiers for a team. To get the schema of each template use &#x60;templates/get_for_team&#x60;.      

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = FilePropertiesApi()
try {
    val result : kotlin.String = apiInstance.call2filePropertiesTemplatesListForTeamPost()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FilePropertiesApi#call2filePropertiesTemplatesListForTeamPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilePropertiesApi#call2filePropertiesTemplatesListForTeamPost")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**kotlin.String**

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="call2filePropertiesTemplatesListForUserPost"></a>
# **call2filePropertiesTemplatesListForUserPost**
> kotlin.String call2filePropertiesTemplatesListForUserPost()

templates/list_for_user

[templates/list_for_user](https://www.dropbox.com/developers/documentation/http/documentation#file_properties-templates-list_for_user)  scope: &#x60;files.metadata.read&#x60;  Get the template identifiers for a team. To get the schema of each template use &#x60;templates/get_for_user&#x60;. This endpoint can&#39;t be called on a team member or admin&#39;s behalf.      

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = FilePropertiesApi()
try {
    val result : kotlin.String = apiInstance.call2filePropertiesTemplatesListForUserPost()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FilePropertiesApi#call2filePropertiesTemplatesListForUserPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilePropertiesApi#call2filePropertiesTemplatesListForUserPost")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**kotlin.String**

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="call2filePropertiesTemplatesRemoveForTeamPost"></a>
# **call2filePropertiesTemplatesRemoveForTeamPost**
> call2filePropertiesTemplatesRemoveForTeamPost(body)

templates/remove_for_team

[templates/remove_for_team](https://www.dropbox.com/developers/documentation/http/teams#file_properties-templates-remove_for_team)  scope: &#x60;files.team_metadata.write&#x60;  Permanently removes the specified template created from &#x60;templates/add_for_user&#x60;. All properties associated with the template will also be removed. This action cannot be undone.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = FilePropertiesApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    apiInstance.call2filePropertiesTemplatesRemoveForTeamPost(body)
} catch (e: ClientException) {
    println("4xx response calling FilePropertiesApi#call2filePropertiesTemplatesRemoveForTeamPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilePropertiesApi#call2filePropertiesTemplatesRemoveForTeamPost")
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

<a name="call2filePropertiesTemplatesRemoveForUserPost"></a>
# **call2filePropertiesTemplatesRemoveForUserPost**
> call2filePropertiesTemplatesRemoveForUserPost(body)

templates/remove_for_user

[templates/remove_for_user](https://www.dropbox.com/developers/documentation/http/documentation#file_properties-templates-remove_for_user)  scope: &#x60;files.metadata.write&#x60;  Permanently removes the specified template created from &#x60;templates/add_for_user&#x60;. All properties associated with the template will also be removed. This action cannot be undone.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = FilePropertiesApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    apiInstance.call2filePropertiesTemplatesRemoveForUserPost(body)
} catch (e: ClientException) {
    println("4xx response calling FilePropertiesApi#call2filePropertiesTemplatesRemoveForUserPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilePropertiesApi#call2filePropertiesTemplatesRemoveForUserPost")
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

<a name="call2filePropertiesTemplatesUpdateForTeamPost"></a>
# **call2filePropertiesTemplatesUpdateForTeamPost**
> kotlin.String call2filePropertiesTemplatesUpdateForTeamPost(body)

templates/update_for_team

[templates/update_for_team](https://www.dropbox.com/developers/documentation/http/teams#file_properties-templates-update_for_team)  scope: &#x60;files.team_metadata.write&#x60;  Update a template associated with a team. This route can update the template name, the template description and add optional properties to templates.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = FilePropertiesApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.call2filePropertiesTemplatesUpdateForTeamPost(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FilePropertiesApi#call2filePropertiesTemplatesUpdateForTeamPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilePropertiesApi#call2filePropertiesTemplatesUpdateForTeamPost")
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

<a name="call2filePropertiesTemplatesUpdateForUserPost"></a>
# **call2filePropertiesTemplatesUpdateForUserPost**
> kotlin.String call2filePropertiesTemplatesUpdateForUserPost(body)

templates/update_for_user

[templates/update_for_user](https://www.dropbox.com/developers/documentation/http/documentation#file_properties-templates-update_for_user)  scope: &#x60;files.metadata.write&#x60;  Update a template associated with a user. This route can update the template name, the template description and add optional properties to templates. This endpoint can&#39;t be called on a team member or admin&#39;s behalf.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = FilePropertiesApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.call2filePropertiesTemplatesUpdateForUserPost(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FilePropertiesApi#call2filePropertiesTemplatesUpdateForUserPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilePropertiesApi#call2filePropertiesTemplatesUpdateForUserPost")
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


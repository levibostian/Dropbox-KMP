# FilePropertiesApi

All URIs are relative to *https://api.dropbox.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add**](FilePropertiesApi.md#add) | **POST** /2/file_properties/properties/add | properties/add
[**overwrite**](FilePropertiesApi.md#overwrite) | **POST** /2/file_properties/properties/overwrite | properties/overwrite
[**propertiesRemove**](FilePropertiesApi.md#propertiesRemove) | **POST** /2/file_properties/properties/remove | properties/remove
[**propertiesSearch**](FilePropertiesApi.md#propertiesSearch) | **POST** /2/file_properties/properties/search | properties/search
[**propertiesSearchContinue**](FilePropertiesApi.md#propertiesSearchContinue) | **POST** /2/file_properties/properties/search/continue | properties/search/continue
[**propertiesUpdate**](FilePropertiesApi.md#propertiesUpdate) | **POST** /2/file_properties/properties/update | properties/update
[**templatesAddForTeam**](FilePropertiesApi.md#templatesAddForTeam) | **POST** /2/file_properties/templates/add_for_team | templates/add_for_team
[**templatesAddForUser**](FilePropertiesApi.md#templatesAddForUser) | **POST** /2/file_properties/templates/add_for_user | templates/add_for_user
[**templatesGetForTeam**](FilePropertiesApi.md#templatesGetForTeam) | **POST** /2/file_properties/templates/get_for_team | templates/get_for_team
[**templatesGetForUser**](FilePropertiesApi.md#templatesGetForUser) | **POST** /2/file_properties/templates/get_for_user | templates/get_for_user
[**templatesListForTeam**](FilePropertiesApi.md#templatesListForTeam) | **POST** /2/file_properties/templates/list_for_team | templates/list_for_team
[**templatesListForUser**](FilePropertiesApi.md#templatesListForUser) | **POST** /2/file_properties/templates/list_for_user | templates/list_for_user
[**templatesRemoveForTeam**](FilePropertiesApi.md#templatesRemoveForTeam) | **POST** /2/file_properties/templates/remove_for_team | templates/remove_for_team
[**templatesRemoveForUser**](FilePropertiesApi.md#templatesRemoveForUser) | **POST** /2/file_properties/templates/remove_for_user | templates/remove_for_user
[**templatesUpdateForTeam**](FilePropertiesApi.md#templatesUpdateForTeam) | **POST** /2/file_properties/templates/update_for_team | templates/update_for_team
[**templatesUpdateForUser**](FilePropertiesApi.md#templatesUpdateForUser) | **POST** /2/file_properties/templates/update_for_user | templates/update_for_user


<a name="add"></a>
# **add**
> add(body)

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
    apiInstance.add(body)
} catch (e: ClientException) {
    println("4xx response calling FilePropertiesApi#add")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilePropertiesApi#add")
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

<a name="overwrite"></a>
# **overwrite**
> overwrite(body)

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
    apiInstance.overwrite(body)
} catch (e: ClientException) {
    println("4xx response calling FilePropertiesApi#overwrite")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilePropertiesApi#overwrite")
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

<a name="propertiesRemove"></a>
# **propertiesRemove**
> propertiesRemove(body)

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
    apiInstance.propertiesRemove(body)
} catch (e: ClientException) {
    println("4xx response calling FilePropertiesApi#propertiesRemove")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilePropertiesApi#propertiesRemove")
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

<a name="propertiesSearch"></a>
# **propertiesSearch**
> kotlin.String propertiesSearch(authorization, body)

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
    val result : kotlin.String = apiInstance.propertiesSearch(authorization, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FilePropertiesApi#propertiesSearch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilePropertiesApi#propertiesSearch")
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

<a name="propertiesSearchContinue"></a>
# **propertiesSearchContinue**
> kotlin.String propertiesSearchContinue(body)

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
    val result : kotlin.String = apiInstance.propertiesSearchContinue(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FilePropertiesApi#propertiesSearchContinue")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilePropertiesApi#propertiesSearchContinue")
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

<a name="propertiesUpdate"></a>
# **propertiesUpdate**
> propertiesUpdate(body)

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
    apiInstance.propertiesUpdate(body)
} catch (e: ClientException) {
    println("4xx response calling FilePropertiesApi#propertiesUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilePropertiesApi#propertiesUpdate")
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

<a name="templatesAddForTeam"></a>
# **templatesAddForTeam**
> kotlin.String templatesAddForTeam(body)

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
    val result : kotlin.String = apiInstance.templatesAddForTeam(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FilePropertiesApi#templatesAddForTeam")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilePropertiesApi#templatesAddForTeam")
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

<a name="templatesAddForUser"></a>
# **templatesAddForUser**
> kotlin.String templatesAddForUser(body)

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
    val result : kotlin.String = apiInstance.templatesAddForUser(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FilePropertiesApi#templatesAddForUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilePropertiesApi#templatesAddForUser")
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

<a name="templatesGetForTeam"></a>
# **templatesGetForTeam**
> kotlin.String templatesGetForTeam(body)

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
    val result : kotlin.String = apiInstance.templatesGetForTeam(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FilePropertiesApi#templatesGetForTeam")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilePropertiesApi#templatesGetForTeam")
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

<a name="templatesGetForUser"></a>
# **templatesGetForUser**
> kotlin.String templatesGetForUser(body)

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
    val result : kotlin.String = apiInstance.templatesGetForUser(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FilePropertiesApi#templatesGetForUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilePropertiesApi#templatesGetForUser")
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

<a name="templatesListForTeam"></a>
# **templatesListForTeam**
> kotlin.String templatesListForTeam()

templates/list_for_team

[templates/list_for_team](https://www.dropbox.com/developers/documentation/http/teams#file_properties-templates-list_for_team)  scope: &#x60;files.team_metadata.write&#x60;  Get the template identifiers for a team. To get the schema of each template use &#x60;templates/get_for_team&#x60;.      

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = FilePropertiesApi()
try {
    val result : kotlin.String = apiInstance.templatesListForTeam()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FilePropertiesApi#templatesListForTeam")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilePropertiesApi#templatesListForTeam")
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

<a name="templatesListForUser"></a>
# **templatesListForUser**
> kotlin.String templatesListForUser()

templates/list_for_user

[templates/list_for_user](https://www.dropbox.com/developers/documentation/http/documentation#file_properties-templates-list_for_user)  scope: &#x60;files.metadata.read&#x60;  Get the template identifiers for a team. To get the schema of each template use &#x60;templates/get_for_user&#x60;. This endpoint can&#39;t be called on a team member or admin&#39;s behalf.      

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = FilePropertiesApi()
try {
    val result : kotlin.String = apiInstance.templatesListForUser()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FilePropertiesApi#templatesListForUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilePropertiesApi#templatesListForUser")
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

<a name="templatesRemoveForTeam"></a>
# **templatesRemoveForTeam**
> templatesRemoveForTeam(body)

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
    apiInstance.templatesRemoveForTeam(body)
} catch (e: ClientException) {
    println("4xx response calling FilePropertiesApi#templatesRemoveForTeam")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilePropertiesApi#templatesRemoveForTeam")
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

<a name="templatesRemoveForUser"></a>
# **templatesRemoveForUser**
> templatesRemoveForUser(body)

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
    apiInstance.templatesRemoveForUser(body)
} catch (e: ClientException) {
    println("4xx response calling FilePropertiesApi#templatesRemoveForUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilePropertiesApi#templatesRemoveForUser")
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

<a name="templatesUpdateForTeam"></a>
# **templatesUpdateForTeam**
> kotlin.String templatesUpdateForTeam(body)

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
    val result : kotlin.String = apiInstance.templatesUpdateForTeam(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FilePropertiesApi#templatesUpdateForTeam")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilePropertiesApi#templatesUpdateForTeam")
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

<a name="templatesUpdateForUser"></a>
# **templatesUpdateForUser**
> kotlin.String templatesUpdateForUser(body)

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
    val result : kotlin.String = apiInstance.templatesUpdateForUser(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FilePropertiesApi#templatesUpdateForUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilePropertiesApi#templatesUpdateForUser")
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


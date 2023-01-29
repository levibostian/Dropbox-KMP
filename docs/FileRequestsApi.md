# FileRequestsApi

All URIs are relative to *https://api.dropbox.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**count**](FileRequestsApi.md#count) | **POST** /2/file_requests/count | count
[**create**](FileRequestsApi.md#create) | **POST** /2/file_requests/create | create
[**deleteAllClosed**](FileRequestsApi.md#deleteAllClosed) | **POST** /2/file_requests/delete_all_closed | delete_all_closed
[**fileRequestsDelete**](FileRequestsApi.md#fileRequestsDelete) | **POST** /2/file_requests/delete | delete
[**get**](FileRequestsApi.md#get) | **POST** /2/file_requests/get | get
[**list**](FileRequestsApi.md#list) | **POST** /2/file_requests/list_v2 | list
[**listContinue**](FileRequestsApi.md#listContinue) | **POST** /2/file_requests/list/continue | list/continue
[**update**](FileRequestsApi.md#update) | **POST** /2/file_requests/update | update


<a name="count"></a>
# **count**
> kotlin.String count()

count

[count](https://www.dropbox.com/developers/documentation/http/documentation#file_requests-count)  scope: &#x60;file_requests.read&#x60;  Returns the total number of file requests owned by this user. Includes both open and closed file requests.      

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = FileRequestsApi()
try {
    val result : kotlin.String = apiInstance.count()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FileRequestsApi#count")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FileRequestsApi#count")
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

<a name="create"></a>
# **create**
> kotlin.String create(body)

create

[create](https://www.dropbox.com/developers/documentation/http/documentation#file_requests-create)  scope: &#x60;file_requests.write&#x60;  Creates a file request for this user.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = FileRequestsApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.create(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FileRequestsApi#create")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FileRequestsApi#create")
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

<a name="deleteAllClosed"></a>
# **deleteAllClosed**
> kotlin.String deleteAllClosed()

delete_all_closed

[delete_all_closed](https://www.dropbox.com/developers/documentation/http/documentation#file_requests-delete_all_closed)  scope: &#x60;file_requests.write&#x60;  Delete all closed file requests owned by this user.      

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = FileRequestsApi()
try {
    val result : kotlin.String = apiInstance.deleteAllClosed()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FileRequestsApi#deleteAllClosed")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FileRequestsApi#deleteAllClosed")
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

<a name="fileRequestsDelete"></a>
# **fileRequestsDelete**
> kotlin.String fileRequestsDelete(body)

delete

[delete](https://www.dropbox.com/developers/documentation/http/documentation#file_requests-delete)  scope: &#x60;file_requests.write&#x60;  Delete a batch of closed file requests.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = FileRequestsApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.fileRequestsDelete(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FileRequestsApi#fileRequestsDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FileRequestsApi#fileRequestsDelete")
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

<a name="get"></a>
# **get**
> kotlin.String get(body)

get

[get](https://www.dropbox.com/developers/documentation/http/documentation#file_requests-get)  scope: &#x60;file_requests.read&#x60;  Returns the specified file request.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = FileRequestsApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.get(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FileRequestsApi#get")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FileRequestsApi#get")
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

<a name="list"></a>
# **list**
> kotlin.String list(body)

list

[list](https://www.dropbox.com/developers/documentation/http/documentation#file_requests-list)  scope: &#x60;file_requests.read&#x60;  Returns a list of file requests owned by this user. For apps with the app folder permission, this will only return file requests with destinations in the app folder.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = FileRequestsApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.list(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FileRequestsApi#list")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FileRequestsApi#list")
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

<a name="listContinue"></a>
# **listContinue**
> kotlin.String listContinue(body)

list/continue

[list/continue](https://www.dropbox.com/developers/documentation/http/documentation#file_requests-list-continue)  scope: &#x60;file_requests.read&#x60;  Once a cursor has been retrieved from &#x60;list:2&#x60;, use this to paginate through all file requests. The cursor must come from a previous call to &#x60;list:2&#x60; or &#x60;list/continue&#x60;.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = FileRequestsApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.listContinue(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FileRequestsApi#listContinue")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FileRequestsApi#listContinue")
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

<a name="update"></a>
# **update**
> kotlin.String update(body)

update

[update](https://www.dropbox.com/developers/documentation/http/documentation#file_requests-update)  scope: &#x60;file_requests.write&#x60;  Update a file request.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = FileRequestsApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.update(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FileRequestsApi#update")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FileRequestsApi#update")
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


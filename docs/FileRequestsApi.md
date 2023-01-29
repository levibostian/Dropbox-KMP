# FileRequestsApi

All URIs are relative to *https://api.dropbox.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**call2fileRequestsCountPost**](FileRequestsApi.md#call2fileRequestsCountPost) | **POST** /2/file_requests/count | count
[**call2fileRequestsCreatePost**](FileRequestsApi.md#call2fileRequestsCreatePost) | **POST** /2/file_requests/create | create
[**call2fileRequestsDeleteAllClosedPost**](FileRequestsApi.md#call2fileRequestsDeleteAllClosedPost) | **POST** /2/file_requests/delete_all_closed | delete_all_closed
[**call2fileRequestsDeletePost**](FileRequestsApi.md#call2fileRequestsDeletePost) | **POST** /2/file_requests/delete | delete
[**call2fileRequestsGetPost**](FileRequestsApi.md#call2fileRequestsGetPost) | **POST** /2/file_requests/get | get
[**call2fileRequestsListContinuePost**](FileRequestsApi.md#call2fileRequestsListContinuePost) | **POST** /2/file_requests/list/continue | list/continue
[**call2fileRequestsListV2Post**](FileRequestsApi.md#call2fileRequestsListV2Post) | **POST** /2/file_requests/list_v2 | list
[**call2fileRequestsUpdatePost**](FileRequestsApi.md#call2fileRequestsUpdatePost) | **POST** /2/file_requests/update | update


<a name="call2fileRequestsCountPost"></a>
# **call2fileRequestsCountPost**
> kotlin.String call2fileRequestsCountPost()

count

[count](https://www.dropbox.com/developers/documentation/http/documentation#file_requests-count)  scope: &#x60;file_requests.read&#x60;  Returns the total number of file requests owned by this user. Includes both open and closed file requests.      

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = FileRequestsApi()
try {
    val result : kotlin.String = apiInstance.call2fileRequestsCountPost()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FileRequestsApi#call2fileRequestsCountPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FileRequestsApi#call2fileRequestsCountPost")
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

<a name="call2fileRequestsCreatePost"></a>
# **call2fileRequestsCreatePost**
> kotlin.String call2fileRequestsCreatePost(contentType, body)

create

[create](https://www.dropbox.com/developers/documentation/http/documentation#file_requests-create)  scope: &#x60;file_requests.write&#x60;  Creates a file request for this user.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = FileRequestsApi()
val contentType : kotlin.String = application/json // kotlin.String | 
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.call2fileRequestsCreatePost(contentType, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FileRequestsApi#call2fileRequestsCreatePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FileRequestsApi#call2fileRequestsCreatePost")
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

<a name="call2fileRequestsDeleteAllClosedPost"></a>
# **call2fileRequestsDeleteAllClosedPost**
> kotlin.String call2fileRequestsDeleteAllClosedPost()

delete_all_closed

[delete_all_closed](https://www.dropbox.com/developers/documentation/http/documentation#file_requests-delete_all_closed)  scope: &#x60;file_requests.write&#x60;  Delete all closed file requests owned by this user.      

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = FileRequestsApi()
try {
    val result : kotlin.String = apiInstance.call2fileRequestsDeleteAllClosedPost()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FileRequestsApi#call2fileRequestsDeleteAllClosedPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FileRequestsApi#call2fileRequestsDeleteAllClosedPost")
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

<a name="call2fileRequestsDeletePost"></a>
# **call2fileRequestsDeletePost**
> kotlin.String call2fileRequestsDeletePost(contentType, body)

delete

[delete](https://www.dropbox.com/developers/documentation/http/documentation#file_requests-delete)  scope: &#x60;file_requests.write&#x60;  Delete a batch of closed file requests.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = FileRequestsApi()
val contentType : kotlin.String = application/json // kotlin.String | 
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.call2fileRequestsDeletePost(contentType, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FileRequestsApi#call2fileRequestsDeletePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FileRequestsApi#call2fileRequestsDeletePost")
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

<a name="call2fileRequestsGetPost"></a>
# **call2fileRequestsGetPost**
> kotlin.String call2fileRequestsGetPost(contentType, body)

get

[get](https://www.dropbox.com/developers/documentation/http/documentation#file_requests-get)  scope: &#x60;file_requests.read&#x60;  Returns the specified file request.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = FileRequestsApi()
val contentType : kotlin.String = application/json // kotlin.String | 
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.call2fileRequestsGetPost(contentType, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FileRequestsApi#call2fileRequestsGetPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FileRequestsApi#call2fileRequestsGetPost")
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

<a name="call2fileRequestsListContinuePost"></a>
# **call2fileRequestsListContinuePost**
> kotlin.String call2fileRequestsListContinuePost(contentType, body)

list/continue

[list/continue](https://www.dropbox.com/developers/documentation/http/documentation#file_requests-list-continue)  scope: &#x60;file_requests.read&#x60;  Once a cursor has been retrieved from &#x60;list:2&#x60;, use this to paginate through all file requests. The cursor must come from a previous call to &#x60;list:2&#x60; or &#x60;list/continue&#x60;.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = FileRequestsApi()
val contentType : kotlin.String = application/json // kotlin.String | 
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.call2fileRequestsListContinuePost(contentType, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FileRequestsApi#call2fileRequestsListContinuePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FileRequestsApi#call2fileRequestsListContinuePost")
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

<a name="call2fileRequestsListV2Post"></a>
# **call2fileRequestsListV2Post**
> kotlin.String call2fileRequestsListV2Post(contentType, body)

list

[list](https://www.dropbox.com/developers/documentation/http/documentation#file_requests-list)  scope: &#x60;file_requests.read&#x60;  Returns a list of file requests owned by this user. For apps with the app folder permission, this will only return file requests with destinations in the app folder.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = FileRequestsApi()
val contentType : kotlin.String = application/json // kotlin.String | 
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.call2fileRequestsListV2Post(contentType, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FileRequestsApi#call2fileRequestsListV2Post")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FileRequestsApi#call2fileRequestsListV2Post")
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

<a name="call2fileRequestsUpdatePost"></a>
# **call2fileRequestsUpdatePost**
> kotlin.String call2fileRequestsUpdatePost(contentType, body)

update

[update](https://www.dropbox.com/developers/documentation/http/documentation#file_requests-update)  scope: &#x60;file_requests.write&#x60;  Update a file request.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = FileRequestsApi()
val contentType : kotlin.String = application/json // kotlin.String | 
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.call2fileRequestsUpdatePost(contentType, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FileRequestsApi#call2fileRequestsUpdatePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FileRequestsApi#call2fileRequestsUpdatePost")
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


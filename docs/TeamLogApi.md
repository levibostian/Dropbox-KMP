# TeamLogApi

All URIs are relative to *https://api.dropbox.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**call2teamLogGetEventsContinuePost**](TeamLogApi.md#call2teamLogGetEventsContinuePost) | **POST** /2/team_log/get_events/continue | get_events/continue
[**call2teamLogGetEventsPost**](TeamLogApi.md#call2teamLogGetEventsPost) | **POST** /2/team_log/get_events | get_events


<a name="call2teamLogGetEventsContinuePost"></a>
# **call2teamLogGetEventsContinuePost**
> kotlin.String call2teamLogGetEventsContinuePost(contentType, body)

get_events/continue

[get_events/continue](https://www.dropbox.com/developers/documentation/http/teams#team_log-get_events-continue)  scope: &#x60;events.read&#x60;  Once a cursor has been retrieved from &#x60;get_events&#x60;, use this to paginate through all events. Permission : Team Auditing.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = TeamLogApi()
val contentType : kotlin.String = application/json // kotlin.String | 
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.call2teamLogGetEventsContinuePost(contentType, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamLogApi#call2teamLogGetEventsContinuePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamLogApi#call2teamLogGetEventsContinuePost")
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

<a name="call2teamLogGetEventsPost"></a>
# **call2teamLogGetEventsPost**
> kotlin.String call2teamLogGetEventsPost(contentType, body)

get_events

[get_events](https://www.dropbox.com/developers/documentation/http/teams#team_log-get_events)  scope: &#x60;events.read&#x60;  Retrieves team events. If the result&#39;s &#x60;GetTeamEventsResult.has_more&#x60; field is &#x60;true&#x60;, call &#x60;get_events/continue&#x60; with the returned cursor to retrieve more entries. If end_time is not specified in your request, you may use the returned cursor to poll &#x60;get_events/continue&#x60; for new events. Many attributes note &#39;may be missing due to historical data gap&#39;. Note that the file_operations category and &amp; analogous paper events are not available on all Dropbox Business [plans](http://www.dropbox.com/business/plans-comparison). Use [features/get_values](http://www.dropbox.com/developers/documentation/http/teams#team-features-get_values) to check for this feature. Permission : Team Auditing.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = TeamLogApi()
val contentType : kotlin.String = application/json // kotlin.String | 
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.call2teamLogGetEventsPost(contentType, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamLogApi#call2teamLogGetEventsPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamLogApi#call2teamLogGetEventsPost")
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


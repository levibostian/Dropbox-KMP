# ContactsApi

All URIs are relative to *https://api.dropbox.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**call2contactsDeleteManualContactsBatchPost**](ContactsApi.md#call2contactsDeleteManualContactsBatchPost) | **POST** /2/contacts/delete_manual_contacts_batch | delete_manual_contacts_batch
[**call2contactsDeleteManualContactsPost**](ContactsApi.md#call2contactsDeleteManualContactsPost) | **POST** /2/contacts/delete_manual_contacts | delete_manual_contacts


<a name="call2contactsDeleteManualContactsBatchPost"></a>
# **call2contactsDeleteManualContactsBatchPost**
> call2contactsDeleteManualContactsBatchPost(contentType, body)

delete_manual_contacts_batch

[delete_manual_contacts_batch](https://www.dropbox.com/developers/documentation/http/documentation#contacts-delete_manual_contacts_batch)  scope: &#x60;contacts.write&#x60;  Removes manually added contacts from the given list.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = ContactsApi()
val contentType : kotlin.String = application/json // kotlin.String | 
val body : kotlin.String = body_example // kotlin.String | 
try {
    apiInstance.call2contactsDeleteManualContactsBatchPost(contentType, body)
} catch (e: ClientException) {
    println("4xx response calling ContactsApi#call2contactsDeleteManualContactsBatchPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactsApi#call2contactsDeleteManualContactsBatchPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentType** | **kotlin.String**|  | [optional]
 **body** | **kotlin.String**|  | [optional]

### Return type

null (empty response body)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="call2contactsDeleteManualContactsPost"></a>
# **call2contactsDeleteManualContactsPost**
> call2contactsDeleteManualContactsPost()

delete_manual_contacts

[delete_manual_contacts](https://www.dropbox.com/developers/documentation/http/documentation#contacts-delete_manual_contacts)  scope: &#x60;contacts.write&#x60;  Removes all manually added contacts. You&#39;ll still keep contacts who are on your team or who you imported. New contacts will be added when you share.      

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = ContactsApi()
try {
    apiInstance.call2contactsDeleteManualContactsPost()
} catch (e: ClientException) {
    println("4xx response calling ContactsApi#call2contactsDeleteManualContactsPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactsApi#call2contactsDeleteManualContactsPost")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


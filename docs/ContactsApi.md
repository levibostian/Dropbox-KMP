# ContactsApi

All URIs are relative to *https://api.dropbox.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteManualContacts**](ContactsApi.md#deleteManualContacts) | **POST** /2/contacts/delete_manual_contacts | delete_manual_contacts
[**deleteManualContactsBatch**](ContactsApi.md#deleteManualContactsBatch) | **POST** /2/contacts/delete_manual_contacts_batch | delete_manual_contacts_batch


<a name="deleteManualContacts"></a>
# **deleteManualContacts**
> deleteManualContacts()

delete_manual_contacts

[delete_manual_contacts](https://www.dropbox.com/developers/documentation/http/documentation#contacts-delete_manual_contacts)  scope: &#x60;contacts.write&#x60;  Removes all manually added contacts. You&#39;ll still keep contacts who are on your team or who you imported. New contacts will be added when you share.      

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = ContactsApi()
try {
    apiInstance.deleteManualContacts()
} catch (e: ClientException) {
    println("4xx response calling ContactsApi#deleteManualContacts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactsApi#deleteManualContacts")
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

<a name="deleteManualContactsBatch"></a>
# **deleteManualContactsBatch**
> deleteManualContactsBatch(body)

delete_manual_contacts_batch

[delete_manual_contacts_batch](https://www.dropbox.com/developers/documentation/http/documentation#contacts-delete_manual_contacts_batch)  scope: &#x60;contacts.write&#x60;  Removes manually added contacts from the given list.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = ContactsApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    apiInstance.deleteManualContactsBatch(body)
} catch (e: ClientException) {
    println("4xx response calling ContactsApi#deleteManualContactsBatch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactsApi#deleteManualContactsBatch")
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


# FilesApi

All URIs are relative to *https://api.dropbox.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**copy**](FilesApi.md#copy) | **POST** /2/files/copy_v2 | copy
[**copyBatch**](FilesApi.md#copyBatch) | **POST** /2/files/copy_batch_v2 | copy_batch
[**copyBatchCheck**](FilesApi.md#copyBatchCheck) | **POST** /2/files/copy_batch/check_v2 | copy_batch/check
[**copyReferenceGet**](FilesApi.md#copyReferenceGet) | **POST** /2/files/copy_reference/get | copy_reference/get
[**copyReferenceSave**](FilesApi.md#copyReferenceSave) | **POST** /2/files/copy_reference/save | copy_reference/save
[**createFolder**](FilesApi.md#createFolder) | **POST** /2/files/create_folder_v2 | create_folder
[**createFolderBatch**](FilesApi.md#createFolderBatch) | **POST** /2/files/create_folder_batch | create_folder_batch
[**createFolderBatchCheck**](FilesApi.md#createFolderBatchCheck) | **POST** /2/files/create_folder_batch/check | create_folder_batch/check
[**delete**](FilesApi.md#delete) | **POST** /2/files/delete_v2 | delete
[**deleteBatch**](FilesApi.md#deleteBatch) | **POST** /2/files/delete_batch | delete_batch
[**deleteBatchCheck**](FilesApi.md#deleteBatchCheck) | **POST** /2/files/delete_batch/check | delete_batch/check
[**download**](FilesApi.md#download) | **POST** /2/files/download | download
[**downloadZip**](FilesApi.md#downloadZip) | **POST** /2/files/download_zip | download_zip
[**export**](FilesApi.md#export) | **POST** /2/files/export | export
[**getFileLockBatch**](FilesApi.md#getFileLockBatch) | **POST** /2/files/get_file_lock_batch | get_file_lock_batch
[**getMetadata**](FilesApi.md#getMetadata) | **POST** /2/files/get_metadata | get_metadata
[**getPreview**](FilesApi.md#getPreview) | **POST** /2/files/get_preview | get_preview
[**getTemporaryLink**](FilesApi.md#getTemporaryLink) | **POST** /2/files/get_temporary_link | get_temporary_link
[**getTemporaryUploadLink**](FilesApi.md#getTemporaryUploadLink) | **POST** /2/files/get_temporary_upload_link | get_temporary_upload_link
[**getThumbnail**](FilesApi.md#getThumbnail) | **POST** /2/files/get_thumbnail_v2 | get_thumbnail
[**getThumbnailBatch**](FilesApi.md#getThumbnailBatch) | **POST** /2/files/get_thumbnail_batch | get_thumbnail_batch
[**listFolder**](FilesApi.md#listFolder) | **POST** /2/files/list_folder | list_folder
[**listFolderContinue**](FilesApi.md#listFolderContinue) | **POST** /2/files/list_folder/continue | list_folder/continue
[**listFolderGetLatestCursor**](FilesApi.md#listFolderGetLatestCursor) | **POST** /2/files/list_folder/get_latest_cursor | list_folder/get_latest_cursor
[**listFolderLongpoll**](FilesApi.md#listFolderLongpoll) | **POST** /2/files/list_folder/longpoll | list_folder/longpoll
[**listRevisions**](FilesApi.md#listRevisions) | **POST** /2/files/list_revisions | list_revisions
[**lockFileBatch**](FilesApi.md#lockFileBatch) | **POST** /2/files/lock_file_batch | lock_file_batch
[**move**](FilesApi.md#move) | **POST** /2/files/move_v2 | move
[**moveBatch**](FilesApi.md#moveBatch) | **POST** /2/files/move_batch_v2 | move_batch
[**moveBatchCheck**](FilesApi.md#moveBatchCheck) | **POST** /2/files/move_batch/check_v2 | move_batch/check
[**permanentlyDelete**](FilesApi.md#permanentlyDelete) | **POST** /2/files/permanently_delete | permanently_delete
[**restore**](FilesApi.md#restore) | **POST** /2/files/restore | restore
[**saveUrl**](FilesApi.md#saveUrl) | **POST** /2/files/save_url | save_url
[**saveUrlCheckJobStatus**](FilesApi.md#saveUrlCheckJobStatus) | **POST** /2/files/save_url/check_job_status | save_url/check_job_status
[**search**](FilesApi.md#search) | **POST** /2/files/search_v2 | search
[**searchContinue**](FilesApi.md#searchContinue) | **POST** /2/files/search/continue_v2 | search/continue
[**unlockFileBatch**](FilesApi.md#unlockFileBatch) | **POST** /2/files/unlock_file_batch | unlock_file_batch
[**upload**](FilesApi.md#upload) | **POST** /2/files/upload | upload
[**uploadSessionAppend**](FilesApi.md#uploadSessionAppend) | **POST** /2/files/upload_session/append_v2 | upload_session/append
[**uploadSessionFinish**](FilesApi.md#uploadSessionFinish) | **POST** /2/files/upload_session/finish | upload_session/finish
[**uploadSessionFinishBatch**](FilesApi.md#uploadSessionFinishBatch) | **POST** /2/files/upload_session/finish_batch | upload_session/finish_batch
[**uploadSessionFinishBatchCheck**](FilesApi.md#uploadSessionFinishBatchCheck) | **POST** /2/files/upload_session/finish_batch/check | upload_session/finish_batch/check
[**uploadSessionStart**](FilesApi.md#uploadSessionStart) | **POST** /2/files/upload_session/start | upload_session/start


<a name="copy"></a>
# **copy**
> kotlin.String copy(body)

copy

[copy](https://www.dropbox.com/developers/documentation/http/documentation#files-copy)  scope: &#x60;files.content.write&#x60;  Copy a file or folder to a different location in the user&#39;s Dropbox. If the source path is a folder all its contents will be copied.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = FilesApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.copy(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FilesApi#copy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilesApi#copy")
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

<a name="copyBatch"></a>
# **copyBatch**
> kotlin.String copyBatch(body)

copy_batch

[copy_batch](https://www.dropbox.com/developers/documentation/http/documentation#files-copy_batch)  scope: &#x60;files.content.write&#x60;  Copy multiple files or folders to different locations at once in the user&#39;s Dropbox. This route will replace &#x60;copy_batch:1&#x60;. The main difference is this route will return status for each entry, while &#x60;copy_batch:1&#x60; raises failure if any entry fails. This route will either finish synchronously, or return a job ID and do the async copy job in background. Please use &#x60;copy_batch/check:2&#x60; to check the job status.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = FilesApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.copyBatch(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FilesApi#copyBatch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilesApi#copyBatch")
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

<a name="copyBatchCheck"></a>
# **copyBatchCheck**
> kotlin.String copyBatchCheck(body)

copy_batch/check

[copy_batch/check](https://www.dropbox.com/developers/documentation/http/documentation#files-copy_batch-check)  scope: &#x60;files.content.write&#x60;  Returns the status of an asynchronous job for &#x60;copy_batch:2&#x60;. It returns list of results for each entry.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = FilesApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.copyBatchCheck(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FilesApi#copyBatchCheck")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilesApi#copyBatchCheck")
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

<a name="copyReferenceGet"></a>
# **copyReferenceGet**
> kotlin.String copyReferenceGet(body)

copy_reference/get

[copy_reference/get](https://www.dropbox.com/developers/documentation/http/documentation#files-copy_reference-get)  scope: &#x60;files.content.write&#x60;  Get a copy reference to a file or folder. This reference string can be used to save that file or folder to another user&#39;s Dropbox by passing it to &#x60;copy_reference/save&#x60;.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = FilesApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.copyReferenceGet(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FilesApi#copyReferenceGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilesApi#copyReferenceGet")
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

<a name="copyReferenceSave"></a>
# **copyReferenceSave**
> kotlin.String copyReferenceSave(body)

copy_reference/save

[copy_reference/save](https://www.dropbox.com/developers/documentation/http/documentation#files-copy_reference-save)  scope: &#x60;files.content.write&#x60;  Save a copy reference returned by &#x60;copy_reference/get&#x60; to the user&#39;s Dropbox.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = FilesApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.copyReferenceSave(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FilesApi#copyReferenceSave")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilesApi#copyReferenceSave")
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

<a name="createFolder"></a>
# **createFolder**
> kotlin.String createFolder(body)

create_folder

[create_folder](https://www.dropbox.com/developers/documentation/http/documentation#files-create_folder)  scope: &#x60;files.content.write&#x60;  Create a folder at a given path.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = FilesApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.createFolder(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FilesApi#createFolder")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilesApi#createFolder")
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

<a name="createFolderBatch"></a>
# **createFolderBatch**
> kotlin.String createFolderBatch(body)

create_folder_batch

[create_folder_batch](https://www.dropbox.com/developers/documentation/http/documentation#files-create_folder_batch)  scope: &#x60;files.content.write&#x60;  Create multiple folders at once. This route is asynchronous for large batches, which returns a job ID immediately and runs the create folder batch asynchronously. Otherwise, creates the folders and returns the result synchronously for smaller inputs. You can force asynchronous behaviour by using the &#x60;CreateFolderBatchArg.force_async&#x60; flag.  Use &#x60;create_folder_batch/check&#x60; to check the job status.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = FilesApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.createFolderBatch(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FilesApi#createFolderBatch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilesApi#createFolderBatch")
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

<a name="createFolderBatchCheck"></a>
# **createFolderBatchCheck**
> kotlin.String createFolderBatchCheck(body)

create_folder_batch/check

[create_folder_batch/check](https://www.dropbox.com/developers/documentation/http/documentation#files-create_folder_batch-check)  scope: &#x60;files.content.write&#x60;  Returns the status of an asynchronous job for &#x60;create_folder_batch&#x60;. If success, it returns list of result for each entry.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = FilesApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.createFolderBatchCheck(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FilesApi#createFolderBatchCheck")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilesApi#createFolderBatchCheck")
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

<a name="delete"></a>
# **delete**
> kotlin.String delete(body)

delete

[delete](https://www.dropbox.com/developers/documentation/http/documentation#files-delete)  scope: &#x60;files.content.write&#x60;  Delete the file or folder at a given path. If the path is a folder, all its contents will be deleted too. A successful response indicates that the file or folder was deleted. The returned metadata will be the corresponding &#x60;FileMetadata&#x60; or &#x60;FolderMetadata&#x60; for the item at time of deletion, and not a &#x60;DeletedMetadata&#x60; object.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = FilesApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.delete(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FilesApi#delete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilesApi#delete")
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

<a name="deleteBatch"></a>
# **deleteBatch**
> kotlin.String deleteBatch(body)

delete_batch

[delete_batch](https://www.dropbox.com/developers/documentation/http/documentation#files-delete_batch)  scope: &#x60;files.content.write&#x60;  Delete multiple files/folders at once. This route is asynchronous, which returns a job ID immediately and runs the delete batch asynchronously. Use &#x60;delete_batch/check&#x60; to check the job status.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = FilesApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.deleteBatch(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FilesApi#deleteBatch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilesApi#deleteBatch")
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

<a name="deleteBatchCheck"></a>
# **deleteBatchCheck**
> kotlin.String deleteBatchCheck(body)

delete_batch/check

[delete_batch/check](https://www.dropbox.com/developers/documentation/http/documentation#files-delete_batch-check)  scope: &#x60;files.content.write&#x60;  Returns the status of an asynchronous job for &#x60;delete_batch&#x60;. If success, it returns list of result for each entry.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = FilesApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.deleteBatchCheck(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FilesApi#deleteBatchCheck")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilesApi#deleteBatchCheck")
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

<a name="download"></a>
# **download**
> kotlin.String download(dropboxAPIArg)

download

[download](https://www.dropbox.com/developers/documentation/http/documentation#files-download)  scope: &#x60;files.content.read&#x60;  Download a file from a user&#39;s Dropbox.      

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = FilesApi()
val dropboxAPIArg : kotlin.String = {
    "path": "/Homework/math/Prime_Numbers.txt"
} // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.download(dropboxAPIArg)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FilesApi#download")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilesApi#download")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dropboxAPIArg** | **kotlin.String**|  | [optional]

### Return type

**kotlin.String**

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="downloadZip"></a>
# **downloadZip**
> kotlin.String downloadZip(dropboxAPIArg)

download_zip

[download_zip](https://www.dropbox.com/developers/documentation/http/documentation#files-download_zip)  scope: &#x60;files.content.read&#x60;  Download a folder from the user&#39;s Dropbox, as a zip file. The folder must be less than 20 GB in size and have fewer than 10,000 total files. The input cannot be a single file. Any single file must be less than 4GB in size.      

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = FilesApi()
val dropboxAPIArg : kotlin.String = {
    "path": "/Homework/math"
} // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.downloadZip(dropboxAPIArg)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FilesApi#downloadZip")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilesApi#downloadZip")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dropboxAPIArg** | **kotlin.String**|  | [optional]

### Return type

**kotlin.String**

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="export"></a>
# **export**
> kotlin.String export(dropboxAPIArg)

export

[export](https://www.dropbox.com/developers/documentation/http/documentation#files-export)  scope: &#x60;files.content.read&#x60;  Export a file from a user&#39;s Dropbox. This route only supports exporting files that cannot be downloaded directly  and whose &#x60;ExportResult.file_metadata&#x60; has &#x60;ExportInfo.export_as&#x60; populated.      

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = FilesApi()
val dropboxAPIArg : kotlin.String = {
    "path": "/Homework/math/Prime_Numbers.gsheet"
} // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.export(dropboxAPIArg)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FilesApi#export")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilesApi#export")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dropboxAPIArg** | **kotlin.String**|  | [optional]

### Return type

**kotlin.String**

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFileLockBatch"></a>
# **getFileLockBatch**
> kotlin.String getFileLockBatch(body)

get_file_lock_batch

[get_file_lock_batch](https://www.dropbox.com/developers/documentation/http/documentation#files-get_file_lock_batch)  scope: &#x60;files.content.read&#x60;  Return the lock metadata for the given list of paths.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = FilesApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.getFileLockBatch(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FilesApi#getFileLockBatch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilesApi#getFileLockBatch")
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

<a name="getMetadata"></a>
# **getMetadata**
> kotlin.String getMetadata(body)

get_metadata

[get_metadata](https://www.dropbox.com/developers/documentation/http/documentation#files-get_metadata)  scope: &#x60;files.metadata.read&#x60;  Returns the metadata for a file or folder. Note: Metadata for the root folder is unsupported.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = FilesApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.getMetadata(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FilesApi#getMetadata")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilesApi#getMetadata")
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

<a name="getPreview"></a>
# **getPreview**
> kotlin.String getPreview(dropboxAPIArg)

get_preview

[get_preview](https://www.dropbox.com/developers/documentation/http/documentation#files-get_preview)  scope: &#x60;files.content.read&#x60;  Get a preview for a file. Currently, PDF previews are generated for files with the following extensions: .ai, .doc, .docm, .docx, .eps, .gdoc, .gslides, .odp, .odt, .pps, .ppsm, .ppsx, .ppt, .pptm, .pptx, .rtf. HTML previews are generated for files with the following extensions: .csv, .ods, .xls, .xlsm, .gsheet, .xlsx. Other formats will return an unsupported extension error.      

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = FilesApi()
val dropboxAPIArg : kotlin.String = {
    "path": "/word.docx"
} // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.getPreview(dropboxAPIArg)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FilesApi#getPreview")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilesApi#getPreview")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dropboxAPIArg** | **kotlin.String**|  | [optional]

### Return type

**kotlin.String**

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTemporaryLink"></a>
# **getTemporaryLink**
> kotlin.String getTemporaryLink(body)

get_temporary_link

[get_temporary_link](https://www.dropbox.com/developers/documentation/http/documentation#files-get_temporary_link)  scope: &#x60;files.content.read&#x60;  Get a temporary link to stream content of a file. This link will expire in four hours and afterwards you will get 410 Gone. This URL should not be used to display content directly in the browser. The Content-Type of the link is determined automatically by the file&#39;s mime type.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = FilesApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.getTemporaryLink(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FilesApi#getTemporaryLink")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilesApi#getTemporaryLink")
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

<a name="getTemporaryUploadLink"></a>
# **getTemporaryUploadLink**
> kotlin.String getTemporaryUploadLink(body)

get_temporary_upload_link

[get_temporary_upload_link](https://www.dropbox.com/developers/documentation/http/documentation#files-get_temporary_upload_link)  scope: &#x60;files.content.write&#x60;  Get a one-time use temporary upload link to upload a file to a Dropbox location.  This endpoint acts as a delayed &#x60;upload&#x60;. The returned temporary upload link may be used to make a POST request with the data to be uploaded. The upload will then be perfomed with the &#x60;CommitInfo&#x60; previously provided to &#x60;get_temporary_upload_link&#x60; but evaluated only upon consumption. Hence, errors stemming from invalid &#x60;CommitInfo&#x60; with respect to the state of the user&#39;s Dropbox will only be communicated at consumption time. Additionally, these errors are surfaced as generic HTTP 409 Conflict responses, potentially hiding issue details. The maximum temporary upload link duration is 4 hours. Upon consumption or expiration, a new link will have to be generated. Multiple links may exist for a specific upload path at any given time.  The POST request on the temporary upload link must have its Content-Type set to \&quot;application/octet-stream\&quot;.  Example temporary upload link consumption request:  curl -X POST https://content.dropboxapi.com/apitul/1/bNi2uIYF51cVBND --header \&quot;Content-Type: application/octet-stream\&quot; --data-binary @local_file.txt  A successful temporary upload link consumption request returns the content hash of the uploaded data in JSON format.  Example succesful temporary upload link consumption response: {\&quot;content-hash\&quot;: \&quot;599d71033d700ac892a0e48fa61b125d2f5994\&quot;}  An unsuccessful temporary upload link consumption request returns any of the following status codes:  HTTP 400 Bad Request: Content-Type is not one of application/octet-stream and text/plain or request is invalid. HTTP 409 Conflict: The temporary upload link does not exist or is currently unavailable, the upload failed, or another error happened. HTTP 410 Gone: The temporary upload link is expired or consumed.  Example unsuccessful temporary upload link consumption response: Temporary upload link has been recently consumed.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = FilesApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.getTemporaryUploadLink(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FilesApi#getTemporaryUploadLink")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilesApi#getTemporaryUploadLink")
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

<a name="getThumbnail"></a>
# **getThumbnail**
> kotlin.String getThumbnail(dropboxAPIArg)

get_thumbnail

[get_thumbnail](https://www.dropbox.com/developers/documentation/http/documentation#files-get_thumbnail)  scope: &#x60;files.content.read&#x60;  Get a thumbnail for a file.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = FilesApi()
val dropboxAPIArg : kotlin.String = {
    "resource": {
        ".tag": "path", 
        "path": "/a.docx"
    }, 
    "format": "jpeg", 
    "size": "w64h64", 
    "mode": "strict"
} // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.getThumbnail(dropboxAPIArg)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FilesApi#getThumbnail")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilesApi#getThumbnail")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dropboxAPIArg** | **kotlin.String**|  | [optional]

### Return type

**kotlin.String**

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getThumbnailBatch"></a>
# **getThumbnailBatch**
> kotlin.String getThumbnailBatch(body)

get_thumbnail_batch

[get_thumbnail_batch](https://www.dropbox.com/developers/documentation/http/documentation#files-get_thumbnail_batch)  scope: &#x60;files.content.read&#x60;  Get thumbnails for a list of images. We allow up to 25 thumbnails in a single batch. This method currently supports files with the following file extensions: jpg, jpeg, png, tiff, tif, gif and bmp. Photos that are larger than 20MB in size won&#39;t be converted to a thumbnail.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = FilesApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.getThumbnailBatch(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FilesApi#getThumbnailBatch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilesApi#getThumbnailBatch")
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

<a name="listFolder"></a>
# **listFolder**
> kotlin.String listFolder(listFolderRequestModel)

list_folder

[list_folder](https://www.dropbox.com/developers/documentation/http/documentation#files-list_folder)  scope: &#x60;files.metadata.read&#x60;  Starts returning the contents of a folder. If the result&#39;s &#x60;ListFolderResult.has_more&#x60; field is &#x60;true&#x60;, call &#x60;list_folder/continue&#x60; with the returned &#x60;ListFolderResult.cursor&#x60; to retrieve more entries. If you&#39;re using &#x60;ListFolderArg.recursive&#x60; set to &#x60;true&#x60; to keep a local cache of the contents of a Dropbox account, iterate through each entry in order and process them as follows to keep your local state in sync: For each &#x60;FileMetadata&#x60;, store the new entry at the given path in your local state. If the required parent folders don&#39;t exist yet, create them. If there&#39;s already something else at the given path, replace it and remove all its children. For each &#x60;FolderMetadata&#x60;, store the new entry at the given path in your local state. If the required parent folders don&#39;t exist yet, create them. If there&#39;s already something else at the given path, replace it but leave the children as they are. Check the new entry&#39;s &#x60;FolderSharingInfo.read_only&#x60; and set all its children&#39;s read-only statuses to match. For each &#x60;DeletedMetadata&#x60;, if your local state has something at the given path, remove it and all its children. If there&#39;s nothing at the given path, ignore this entry. Note: &#x60;auth.RateLimitError&#x60; may be returned if multiple &#x60;list_folder&#x60; or &#x60;list_folder/continue&#x60; calls with same parameters are made simultaneously by same API app for same user. If your app implements retry logic, please hold off the retry until the previous request finishes.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = FilesApi()
val listFolderRequestModel : ListFolderRequestModel =  // ListFolderRequestModel | 
try {
    val result : kotlin.String = apiInstance.listFolder(listFolderRequestModel)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FilesApi#listFolder")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilesApi#listFolder")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **listFolderRequestModel** | [**ListFolderRequestModel**](ListFolderRequestModel.md)|  | [optional]

### Return type

**kotlin.String**

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listFolderContinue"></a>
# **listFolderContinue**
> kotlin.String listFolderContinue(body)

list_folder/continue

[list_folder/continue](https://www.dropbox.com/developers/documentation/http/documentation#files-list_folder-continue)  scope: &#x60;files.metadata.read&#x60;  Once a cursor has been retrieved from &#x60;list_folder&#x60;, use this to paginate through all files and retrieve updates to the folder, following the same rules as documented for &#x60;list_folder&#x60;.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = FilesApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.listFolderContinue(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FilesApi#listFolderContinue")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilesApi#listFolderContinue")
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

<a name="listFolderGetLatestCursor"></a>
# **listFolderGetLatestCursor**
> kotlin.String listFolderGetLatestCursor(body)

list_folder/get_latest_cursor

[list_folder/get_latest_cursor](https://www.dropbox.com/developers/documentation/http/documentation#files-list_folder-get_latest_cursor)  scope: &#x60;files.metadata.read&#x60;  A way to quickly get a cursor for the folder&#39;s state. Unlike &#x60;list_folder&#x60;, &#x60;list_folder/get_latest_cursor&#x60; doesn&#39;t return any entries. This endpoint is for app which only needs to know about new files and modifications and doesn&#39;t need to know about files that already exist in Dropbox.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = FilesApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.listFolderGetLatestCursor(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FilesApi#listFolderGetLatestCursor")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilesApi#listFolderGetLatestCursor")
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

<a name="listFolderLongpoll"></a>
# **listFolderLongpoll**
> kotlin.String listFolderLongpoll(body)

list_folder/longpoll

[list_folder/longpoll](https://www.dropbox.com/developers/documentation/http/documentation#files-list_folder-longpoll)  scope: &#x60;files.metadata.read&#x60;  A longpoll endpoint to wait for changes on an account. In conjunction with &#x60;list_folder/continue&#x60;, this call gives you a low-latency way to monitor an account for file changes. The connection will block until there are changes available or a timeout occurs. This endpoint is useful mostly for client-side apps. If you&#39;re looking for server-side notifications, check out our [webhooks documentation](https://www.dropbox.com/developers/reference/webhooks).

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = FilesApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.listFolderLongpoll(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FilesApi#listFolderLongpoll")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilesApi#listFolderLongpoll")
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

<a name="listRevisions"></a>
# **listRevisions**
> kotlin.String listRevisions(body)

list_revisions

[list_revisions](https://www.dropbox.com/developers/documentation/http/documentation#files-list_revisions)  scope: &#x60;files.metadata.read&#x60;  Returns revisions for files based on a file path or a file id. The file path or file id is identified from the latest file entry at the given file path or id. This end point allows your app to query either by file path or file id by setting the mode parameter appropriately. In the &#x60;ListRevisionsMode.path&#x60; (default) mode, all revisions at the same file path as the latest file entry are returned. If revisions with the same file id are desired, then mode must be set to &#x60;ListRevisionsMode.id&#x60;. The &#x60;ListRevisionsMode.id&#x60; mode is useful to retrieve revisions for a given file across moves or renames.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = FilesApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.listRevisions(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FilesApi#listRevisions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilesApi#listRevisions")
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

<a name="lockFileBatch"></a>
# **lockFileBatch**
> kotlin.String lockFileBatch(body)

lock_file_batch

[lock_file_batch](https://www.dropbox.com/developers/documentation/http/documentation#files-lock_file_batch)  scope: &#x60;files.content.write&#x60;  Lock the files at the given paths. A locked file will be writable only by the lock holder. A successful response indicates that the file has been locked. Returns a list of the locked file paths and their metadata after this operation.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = FilesApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.lockFileBatch(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FilesApi#lockFileBatch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilesApi#lockFileBatch")
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

<a name="move"></a>
# **move**
> kotlin.String move(body)

move

[move](https://www.dropbox.com/developers/documentation/http/documentation#files-move)  scope: &#x60;files.content.write&#x60;  Move a file or folder to a different location in the user&#39;s Dropbox. If the source path is a folder all its contents will be moved. Note that we do not currently support case-only renaming.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = FilesApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.move(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FilesApi#move")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilesApi#move")
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

<a name="moveBatch"></a>
# **moveBatch**
> kotlin.String moveBatch(body)

move_batch

[move_batch](https://www.dropbox.com/developers/documentation/http/documentation#files-move_batch)  scope: &#x60;files.content.write&#x60;  Move multiple files or folders to different locations at once in the user&#39;s Dropbox. Note that we do not currently support case-only renaming. This route will replace &#x60;move_batch:1&#x60;. The main difference is this route will return status for each entry, while &#x60;move_batch:1&#x60; raises failure if any entry fails. This route will either finish synchronously, or return a job ID and do the async move job in background. Please use &#x60;move_batch/check:2&#x60; to check the job status.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = FilesApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.moveBatch(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FilesApi#moveBatch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilesApi#moveBatch")
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

<a name="moveBatchCheck"></a>
# **moveBatchCheck**
> kotlin.String moveBatchCheck(body)

move_batch/check

[move_batch/check](https://www.dropbox.com/developers/documentation/http/documentation#files-move_batch-check)  scope: &#x60;files.content.write&#x60;  Returns the status of an asynchronous job for &#x60;move_batch:2&#x60;. It returns list of results for each entry.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = FilesApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.moveBatchCheck(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FilesApi#moveBatchCheck")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilesApi#moveBatchCheck")
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

<a name="permanentlyDelete"></a>
# **permanentlyDelete**
> permanentlyDelete(body)

permanently_delete

[permanently_delete](https://www.dropbox.com/developers/documentation/http/documentation#files-permanently_delete)  scope: &#x60;files.permanent_delete&#x60;  Permanently delete the file or folder at a given path (see https://www.dropbox.com/en/help/40). Note: This endpoint is only available for Dropbox Business apps.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = FilesApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    apiInstance.permanentlyDelete(body)
} catch (e: ClientException) {
    println("4xx response calling FilesApi#permanentlyDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilesApi#permanentlyDelete")
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

<a name="restore"></a>
# **restore**
> kotlin.String restore(body)

restore

[restore](https://www.dropbox.com/developers/documentation/http/documentation#files-restore)  scope: &#x60;files.content.write&#x60;  Restore a specific revision of a file to the given path.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = FilesApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.restore(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FilesApi#restore")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilesApi#restore")
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

<a name="saveUrl"></a>
# **saveUrl**
> kotlin.String saveUrl(body)

save_url

[save_url](https://www.dropbox.com/developers/documentation/http/documentation#files-save_url)  scope: &#x60;files.content.write&#x60;  Save the data from a specified URL into a file in user&#39;s Dropbox. Note that the transfer from the URL must complete within 5 minutes, or the operation will time out and the job will fail. If the given path already exists, the file will be renamed to avoid the conflict (e.g. myfile (1).txt).

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = FilesApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.saveUrl(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FilesApi#saveUrl")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilesApi#saveUrl")
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

<a name="saveUrlCheckJobStatus"></a>
# **saveUrlCheckJobStatus**
> kotlin.String saveUrlCheckJobStatus(body)

save_url/check_job_status

[save_url/check_job_status](https://www.dropbox.com/developers/documentation/http/documentation#files-save_url-check_job_status)  scope: &#x60;files.content.write&#x60;  Check the status of a &#x60;save_url&#x60; job.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = FilesApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.saveUrlCheckJobStatus(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FilesApi#saveUrlCheckJobStatus")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilesApi#saveUrlCheckJobStatus")
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

<a name="search"></a>
# **search**
> kotlin.String search(body)

search

[search](https://www.dropbox.com/developers/documentation/http/documentation#files-search)  scope: &#x60;files.metadata.read&#x60;  Searches for files and folders. Note: &#x60;search:2&#x60; along with &#x60;search/continue:2&#x60; can only be used to retrieve a maximum of 10,000 matches. Recent changes may not immediately be reflected in search results due to a short delay in indexing. Duplicate results may be returned across pages. Some results may not be returned.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = FilesApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.search(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FilesApi#search")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilesApi#search")
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

<a name="searchContinue"></a>
# **searchContinue**
> kotlin.String searchContinue(body)

search/continue

[search/continue](https://www.dropbox.com/developers/documentation/http/documentation#files-search-continue)  scope: &#x60;files.metadata.read&#x60;  Fetches the next page of search results returned from &#x60;search:2&#x60;. Note: &#x60;search:2&#x60; along with &#x60;search/continue:2&#x60; can only be used to retrieve a maximum of 10,000 matches. Recent changes may not immediately be reflected in search results due to a short delay in indexing. Duplicate results may be returned across pages. Some results may not be returned.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = FilesApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.searchContinue(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FilesApi#searchContinue")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilesApi#searchContinue")
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

<a name="unlockFileBatch"></a>
# **unlockFileBatch**
> kotlin.String unlockFileBatch(body)

unlock_file_batch

[unlock_file_batch](https://www.dropbox.com/developers/documentation/http/documentation#files-unlock_file_batch)  scope: &#x60;files.content.write&#x60;  Unlock the files at the given paths. A locked file can only be unlocked by the lock holder or, if a business account, a team admin. A successful response indicates that the file has been unlocked. Returns a list of the unlocked file paths and their metadata after this operation.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = FilesApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.unlockFileBatch(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FilesApi#unlockFileBatch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilesApi#unlockFileBatch")
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

<a name="upload"></a>
# **upload**
> kotlin.String upload(dropboxAPIArg)

upload

[upload](https://www.dropbox.com/developers/documentation/http/documentation#files-upload)  scope: &#x60;files.content.write&#x60;  Create a new file with the contents provided in the request. Do not use this to upload a file larger than 150 MB. Instead, create an upload session with &#x60;upload_session/start&#x60;. Calls to this endpoint will count as data transport calls for any Dropbox Business teams with a limit on the number of data transport calls allowed per month. For more information, see the [Data transport limit page](https://www.dropbox.com/developers/reference/data-transport-limit).      

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = FilesApi()
val dropboxAPIArg : kotlin.String = {
    "path": "/Homework/math/Matrices.txt", 
    "mode": "add", 
    "autorename": true, 
    "mute": false, 
    "strict_conflict": false
} // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.upload(dropboxAPIArg)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FilesApi#upload")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilesApi#upload")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dropboxAPIArg** | **kotlin.String**|  | [optional]

### Return type

**kotlin.String**

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="uploadSessionAppend"></a>
# **uploadSessionAppend**
> uploadSessionAppend(dropboxAPIArg)

upload_session/append

[upload_session/append](https://www.dropbox.com/developers/documentation/http/documentation#files-upload_session-append)  scope: &#x60;files.content.write&#x60;  Append more data to an upload session. When the parameter close is set, this call will close the session. A single request should not upload more than 150 MB. The maximum size of a file one can upload to an upload session is 350 GB. Calls to this endpoint will count as data transport calls for any Dropbox Business teams with a limit on the number of data transport calls allowed per month. For more information, see the [Data transport limit page](https://www.dropbox.com/developers/reference/data-transport-limit).      

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = FilesApi()
val dropboxAPIArg : kotlin.String = {
    "cursor": {
        "session_id": "1234faaf0678bcde", 
        "offset": 0
    }, 
    "close": false
} // kotlin.String | 
try {
    apiInstance.uploadSessionAppend(dropboxAPIArg)
} catch (e: ClientException) {
    println("4xx response calling FilesApi#uploadSessionAppend")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilesApi#uploadSessionAppend")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dropboxAPIArg** | **kotlin.String**|  | [optional]

### Return type

null (empty response body)

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="uploadSessionFinish"></a>
# **uploadSessionFinish**
> kotlin.String uploadSessionFinish(dropboxAPIArg)

upload_session/finish

[upload_session/finish](https://www.dropbox.com/developers/documentation/http/documentation#files-upload_session-finish)  scope: &#x60;files.content.write&#x60;  Finish an upload session and save the uploaded data to the given file path. A single request should not upload more than 150 MB. The maximum size of a file one can upload to an upload session is 350 GB. Calls to this endpoint will count as data transport calls for any Dropbox Business teams with a limit on the number of data transport calls allowed per month. For more information, see the [Data transport limit page](https://www.dropbox.com/developers/reference/data-transport-limit).      

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = FilesApi()
val dropboxAPIArg : kotlin.String = {
    "cursor": {
        "session_id": "1234faaf0678bcde", 
        "offset": 0
    }, 
    "commit": {
        "path": "/Homework/math/Matrices.txt", 
        "mode": "add", 
        "autorename": true, 
        "mute": false, 
        "strict_conflict": false
    }
} // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.uploadSessionFinish(dropboxAPIArg)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FilesApi#uploadSessionFinish")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilesApi#uploadSessionFinish")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dropboxAPIArg** | **kotlin.String**|  | [optional]

### Return type

**kotlin.String**

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="uploadSessionFinishBatch"></a>
# **uploadSessionFinishBatch**
> kotlin.String uploadSessionFinishBatch(body)

upload_session/finish_batch

[upload_session/finish_batch](https://www.dropbox.com/developers/documentation/http/documentation#files-upload_session-finish_batch)  scope: &#x60;files.content.write&#x60;  This route helps you commit many files at once into a user&#39;s Dropbox. Use &#x60;upload_session/start&#x60; and &#x60;upload_session/append:2&#x60; to upload file contents. We recommend uploading many files in parallel to increase throughput. Once the file contents have been uploaded, rather than calling &#x60;upload_session/finish&#x60;, use this route to finish all your upload sessions in a single request. &#x60;UploadSessionStartArg.close&#x60; or &#x60;UploadSessionAppendArg.close&#x60; needs to be true for the last &#x60;upload_session/start&#x60; or &#x60;upload_session/append:2&#x60; call. The maximum size of a file one can upload to an upload session is 350 GB. This route will return a job_id immediately and do the async commit job in background. Use &#x60;upload_session/finish_batch/check&#x60; to check the job status. For the same account, this route should be executed serially. That means you should not start the next job before current job finishes. We allow up to 1000 entries in a single request. Calls to this endpoint will count as data transport calls for any Dropbox Business teams with a limit on the number of data transport calls allowed per month. For more information, see the [Data transport limit page](https://www.dropbox.com/developers/reference/data-transport-limit).

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = FilesApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.uploadSessionFinishBatch(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FilesApi#uploadSessionFinishBatch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilesApi#uploadSessionFinishBatch")
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

<a name="uploadSessionFinishBatchCheck"></a>
# **uploadSessionFinishBatchCheck**
> kotlin.String uploadSessionFinishBatchCheck(body)

upload_session/finish_batch/check

[upload_session/finish_batch/check](https://www.dropbox.com/developers/documentation/http/documentation#files-upload_session-finish_batch-check)  scope: &#x60;files.content.write&#x60;  Returns the status of an asynchronous job for &#x60;upload_session/finish_batch&#x60;. If success, it returns list of result for each entry.

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = FilesApi()
val body : kotlin.String = body_example // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.uploadSessionFinishBatchCheck(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FilesApi#uploadSessionFinishBatchCheck")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilesApi#uploadSessionFinishBatchCheck")
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

<a name="uploadSessionStart"></a>
# **uploadSessionStart**
> kotlin.String uploadSessionStart(dropboxAPIArg)

upload_session/start

[upload_session/start](https://www.dropbox.com/developers/documentation/http/documentation#files-upload_session-start)  scope: &#x60;files.content.write&#x60;  Upload sessions allow you to upload a single file in one or more requests, for example where the size of the file is greater than 150 MB.  This call starts a new upload session with the given data. You can then use &#x60;upload_session/append:2&#x60; to add more data and &#x60;upload_session/finish&#x60; to save all the data to a file in Dropbox. A single request should not upload more than 150 MB. The maximum size of a file one can upload to an upload session is 350 GB. An upload session can be used for a maximum of 48 hours. Attempting to use an &#x60;UploadSessionStartResult.session_id&#x60; with &#x60;upload_session/append:2&#x60; or &#x60;upload_session/finish&#x60; more than 48 hours after its creation will return a &#x60;UploadSessionLookupError.not_found&#x60;. Calls to this endpoint will count as data transport calls for any Dropbox Business teams with a limit on the number of data transport calls allowed per month. For more information, see the [Data transport limit page](https://www.dropbox.com/developers/reference/data-transport-limit)      

### Example
```kotlin
// Import classes:
//import earth.levi.dropbox.infrastructure.*
//import earth.levi.dropbox.models.*

val apiInstance = FilesApi()
val dropboxAPIArg : kotlin.String = {
    "close": false
} // kotlin.String | 
try {
    val result : kotlin.String = apiInstance.uploadSessionStart(dropboxAPIArg)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FilesApi#uploadSessionStart")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilesApi#uploadSessionStart")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dropboxAPIArg** | **kotlin.String**|  | [optional]

### Return type

**kotlin.String**

### Authorization


Configure bearerAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


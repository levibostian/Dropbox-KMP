/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package earth.levi.dropbox.apis


import earth.levi.dropbox.infrastructure.*
import io.ktor.client.HttpClientConfig
import io.ktor.client.request.forms.formData
import io.ktor.client.engine.HttpClientEngine
import kotlinx.serialization.json.Json
import io.ktor.http.ParametersBuilder
import kotlinx.serialization.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*

open class FileRequestsApi(
    baseUrl: String = ApiClient.BASE_URL,
    httpClientEngine: HttpClientEngine? = null,
    httpClientConfig: ((HttpClientConfig<*>) -> Unit)? = null,
    jsonSerializer: Json = ApiClient.JSON_DEFAULT
) : ApiClient(baseUrl, httpClientEngine, httpClientConfig, jsonSerializer) {

    /**
     * count
     * [count](https://www.dropbox.com/developers/documentation/http/documentation#file_requests-count)  scope: &#x60;file_requests.read&#x60;  Returns the total number of file requests owned by this user. Includes both open and closed file requests.      
     * @return kotlin.String
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun count(): HttpResponse<kotlin.String> {

        val localVariableAuthNames = listOf<String>("bearerAuth")

        val localVariableBody = 
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.POST,
            "/2/file_requests/count",
            query = localVariableQuery,
            headers = localVariableHeaders
        )

        return request(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap()
    }


    /**
     * create
     * [create](https://www.dropbox.com/developers/documentation/http/documentation#file_requests-create)  scope: &#x60;file_requests.write&#x60;  Creates a file request for this user.
     * @param body  (optional)
     * @return kotlin.String
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun create(body: kotlin.String? = null): HttpResponse<kotlin.String> {

        val localVariableAuthNames = listOf<String>("bearerAuth")

        val localVariableBody = body

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.POST,
            "/2/file_requests/create",
            query = localVariableQuery,
            headers = localVariableHeaders
        )

        return jsonRequest(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap()
    }



    /**
     * delete_all_closed
     * [delete_all_closed](https://www.dropbox.com/developers/documentation/http/documentation#file_requests-delete_all_closed)  scope: &#x60;file_requests.write&#x60;  Delete all closed file requests owned by this user.      
     * @return kotlin.String
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun deleteAllClosed(): HttpResponse<kotlin.String> {

        val localVariableAuthNames = listOf<String>("bearerAuth")

        val localVariableBody = 
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.POST,
            "/2/file_requests/delete_all_closed",
            query = localVariableQuery,
            headers = localVariableHeaders
        )

        return request(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap()
    }


    /**
     * delete
     * [delete](https://www.dropbox.com/developers/documentation/http/documentation#file_requests-delete)  scope: &#x60;file_requests.write&#x60;  Delete a batch of closed file requests.
     * @param body  (optional)
     * @return kotlin.String
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun fileRequestsDelete(body: kotlin.String? = null): HttpResponse<kotlin.String> {

        val localVariableAuthNames = listOf<String>("bearerAuth")

        val localVariableBody = body

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.POST,
            "/2/file_requests/delete",
            query = localVariableQuery,
            headers = localVariableHeaders
        )

        return jsonRequest(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap()
    }



    /**
     * get
     * [get](https://www.dropbox.com/developers/documentation/http/documentation#file_requests-get)  scope: &#x60;file_requests.read&#x60;  Returns the specified file request.
     * @param body  (optional)
     * @return kotlin.String
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun get(body: kotlin.String? = null): HttpResponse<kotlin.String> {

        val localVariableAuthNames = listOf<String>("bearerAuth")

        val localVariableBody = body

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.POST,
            "/2/file_requests/get",
            query = localVariableQuery,
            headers = localVariableHeaders
        )

        return jsonRequest(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap()
    }



    /**
     * list
     * [list](https://www.dropbox.com/developers/documentation/http/documentation#file_requests-list)  scope: &#x60;file_requests.read&#x60;  Returns a list of file requests owned by this user. For apps with the app folder permission, this will only return file requests with destinations in the app folder.
     * @param body  (optional)
     * @return kotlin.String
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun list(body: kotlin.String? = null): HttpResponse<kotlin.String> {

        val localVariableAuthNames = listOf<String>("bearerAuth")

        val localVariableBody = body

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.POST,
            "/2/file_requests/list_v2",
            query = localVariableQuery,
            headers = localVariableHeaders
        )

        return jsonRequest(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap()
    }



    /**
     * list/continue
     * [list/continue](https://www.dropbox.com/developers/documentation/http/documentation#file_requests-list-continue)  scope: &#x60;file_requests.read&#x60;  Once a cursor has been retrieved from &#x60;list:2&#x60;, use this to paginate through all file requests. The cursor must come from a previous call to &#x60;list:2&#x60; or &#x60;list/continue&#x60;.
     * @param body  (optional)
     * @return kotlin.String
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun listContinue(body: kotlin.String? = null): HttpResponse<kotlin.String> {

        val localVariableAuthNames = listOf<String>("bearerAuth")

        val localVariableBody = body

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.POST,
            "/2/file_requests/list/continue",
            query = localVariableQuery,
            headers = localVariableHeaders
        )

        return jsonRequest(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap()
    }



    /**
     * update
     * [update](https://www.dropbox.com/developers/documentation/http/documentation#file_requests-update)  scope: &#x60;file_requests.write&#x60;  Update a file request.
     * @param body  (optional)
     * @return kotlin.String
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun update(body: kotlin.String? = null): HttpResponse<kotlin.String> {

        val localVariableAuthNames = listOf<String>("bearerAuth")

        val localVariableBody = body

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.POST,
            "/2/file_requests/update",
            query = localVariableQuery,
            headers = localVariableHeaders
        )

        return jsonRequest(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap()
    }



}

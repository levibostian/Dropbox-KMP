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

open class UsersApi(
    baseUrl: String = ApiClient.BASE_URL,
    httpClientEngine: HttpClientEngine? = null,
    httpClientConfig: ((HttpClientConfig<*>) -> Unit)? = null,
    jsonSerializer: Json = ApiClient.JSON_DEFAULT
) : ApiClient(baseUrl, httpClientEngine, httpClientConfig, jsonSerializer) {

    /**
     * features/get_values
     * [features/get_values](https://www.dropbox.com/developers/documentation/http/documentation#users-features-get_values)  scope: &#x60;account_info.read&#x60;  Get a list of feature values that may be configured for the current account.
     * @param contentType  (optional)
     * @param body  (optional)
     * @return kotlin.String
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun call2usersFeaturesGetValuesPost(contentType: kotlin.String? = null, body: kotlin.String? = null): HttpResponse<kotlin.String> {

        val localVariableAuthNames = listOf<String>("bearerAuth")

        val localVariableBody = body

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()
        contentType?.apply { localVariableHeaders["Content-Type"] = this.toString() }

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.POST,
            "/2/users/features/get_values",
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
     * get_account_batch
     * [get_account_batch](https://www.dropbox.com/developers/documentation/http/documentation#users-get_account_batch)  scope: &#x60;sharing.read&#x60;  Get information about multiple user accounts.  At most 300 accounts may be queried per request.
     * @param contentType  (optional)
     * @param body  (optional)
     * @return kotlin.String
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun call2usersGetAccountBatchPost(contentType: kotlin.String? = null, body: kotlin.String? = null): HttpResponse<kotlin.String> {

        val localVariableAuthNames = listOf<String>("bearerAuth")

        val localVariableBody = body

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()
        contentType?.apply { localVariableHeaders["Content-Type"] = this.toString() }

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.POST,
            "/2/users/get_account_batch",
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
     * get_account
     * [get_account](https://www.dropbox.com/developers/documentation/http/documentation#users-get_account)  scope: &#x60;sharing.read&#x60;  Get information about a user&#39;s account.
     * @param contentType  (optional)
     * @param body  (optional)
     * @return kotlin.String
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun call2usersGetAccountPost(contentType: kotlin.String? = null, body: kotlin.String? = null): HttpResponse<kotlin.String> {

        val localVariableAuthNames = listOf<String>("bearerAuth")

        val localVariableBody = body

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()
        contentType?.apply { localVariableHeaders["Content-Type"] = this.toString() }

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.POST,
            "/2/users/get_account",
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
     * get_current_account
     * [get_current_account](https://www.dropbox.com/developers/documentation/http/documentation#users-get_current_account)  scope: &#x60;account_info.read&#x60;  Get information about the current user&#39;s account.      
     * @return kotlin.String
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun call2usersGetCurrentAccountPost(): HttpResponse<kotlin.String> {

        val localVariableAuthNames = listOf<String>("bearerAuth")

        val localVariableBody = 
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.POST,
            "/2/users/get_current_account",
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
     * get_space_usage
     * [get_space_usage](https://www.dropbox.com/developers/documentation/http/documentation#users-get_space_usage)  scope: &#x60;account_info.read&#x60;  Get the space usage information for the current user&#39;s account.      
     * @return kotlin.String
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun call2usersGetSpaceUsagePost(): HttpResponse<kotlin.String> {

        val localVariableAuthNames = listOf<String>("bearerAuth")

        val localVariableBody = 
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.POST,
            "/2/users/get_space_usage",
            query = localVariableQuery,
            headers = localVariableHeaders
        )

        return request(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap()
    }


}
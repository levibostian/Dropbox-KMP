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

open class FilePropertiesApi(
    baseUrl: String = ApiClient.BASE_URL,
    httpClientEngine: HttpClientEngine? = null,
    httpClientConfig: ((HttpClientConfig<*>) -> Unit)? = null,
    jsonSerializer: Json = ApiClient.JSON_DEFAULT
) : ApiClient(baseUrl, httpClientEngine, httpClientConfig, jsonSerializer) {

    /**
     * properties/add
     * [properties/add](https://www.dropbox.com/developers/documentation/http/documentation#file_properties-properties-add)  scope: &#x60;files.metadata.write&#x60;  Add property groups to a Dropbox file. See &#x60;templates/add_for_user&#x60; or &#x60;templates/add_for_team&#x60; to create new templates.
     * @param contentType  (optional)
     * @param body  (optional)
     * @return void
     */
    open suspend fun call2filePropertiesPropertiesAddPost(contentType: kotlin.String? = null, body: kotlin.String? = null): HttpResponse<Unit> {

        val localVariableAuthNames = listOf<String>("bearerAuth")

        val localVariableBody = body

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()
        contentType?.apply { localVariableHeaders["Content-Type"] = this.toString() }

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.POST,
            "/2/file_properties/properties/add",
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
     * properties/overwrite
     * [properties/overwrite](https://www.dropbox.com/developers/documentation/http/documentation#file_properties-properties-overwrite)  scope: &#x60;files.metadata.write&#x60;  Overwrite property groups associated with a file. This endpoint should be used instead of &#x60;properties/update&#x60; when property groups are being updated via a \&quot;snapshot\&quot; instead of via a \&quot;delta\&quot;. In other words, this endpoint will delete all omitted fields from a property group, whereas &#x60;properties/update&#x60; will only delete fields that are explicitly marked for deletion.
     * @param contentType  (optional)
     * @param body  (optional)
     * @return void
     */
    open suspend fun call2filePropertiesPropertiesOverwritePost(contentType: kotlin.String? = null, body: kotlin.String? = null): HttpResponse<Unit> {

        val localVariableAuthNames = listOf<String>("bearerAuth")

        val localVariableBody = body

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()
        contentType?.apply { localVariableHeaders["Content-Type"] = this.toString() }

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.POST,
            "/2/file_properties/properties/overwrite",
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
     * properties/remove
     * [properties/remove](https://www.dropbox.com/developers/documentation/http/documentation#file_properties-properties-remove)  scope: &#x60;files.metadata.write&#x60;  Permanently removes the specified property group from the file. To remove specific property field key value pairs, see &#x60;properties/update&#x60;. To update a template, see &#x60;templates/update_for_user&#x60; or &#x60;templates/update_for_team&#x60;. To remove a template, see &#x60;templates/remove_for_user&#x60; or &#x60;templates/remove_for_team&#x60;.
     * @param contentType  (optional)
     * @param body  (optional)
     * @return void
     */
    open suspend fun call2filePropertiesPropertiesRemovePost(contentType: kotlin.String? = null, body: kotlin.String? = null): HttpResponse<Unit> {

        val localVariableAuthNames = listOf<String>("bearerAuth")

        val localVariableBody = body

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()
        contentType?.apply { localVariableHeaders["Content-Type"] = this.toString() }

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.POST,
            "/2/file_properties/properties/remove",
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
     * properties/search/continue
     * [properties/search/continue](https://www.dropbox.com/developers/documentation/http/documentation#file_properties-properties-search-continue)  scope: &#x60;files.metadata.read&#x60;  Once a cursor has been retrieved from &#x60;properties/search&#x60;, use this to paginate through all search results.
     * @param contentType  (optional)
     * @param body  (optional)
     * @return kotlin.String
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun call2filePropertiesPropertiesSearchContinuePost(contentType: kotlin.String? = null, body: kotlin.String? = null): HttpResponse<kotlin.String> {

        val localVariableAuthNames = listOf<String>("bearerAuth")

        val localVariableBody = body

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()
        contentType?.apply { localVariableHeaders["Content-Type"] = this.toString() }

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.POST,
            "/2/file_properties/properties/search/continue",
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
     * properties/search
     * [properties/search](https://www.dropbox.com/developers/documentation/http/documentation#file_properties-properties-search)  scope: &#x60;files.metadata.read&#x60;  Search across property templates for particular property field values.
     * @param contentType  (optional)
     * @param authorization  (optional)
     * @param body  (optional)
     * @return kotlin.String
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun call2filePropertiesPropertiesSearchPost(contentType: kotlin.String? = null, authorization: kotlin.String? = null, body: kotlin.String? = null): HttpResponse<kotlin.String> {

        val localVariableAuthNames = listOf<String>("bearerAuth")

        val localVariableBody = body

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()
        contentType?.apply { localVariableHeaders["Content-Type"] = this.toString() }
        authorization?.apply { localVariableHeaders["Authorization"] = this.toString() }

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.POST,
            "/2/file_properties/properties/search",
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
     * properties/update
     * [properties/update](https://www.dropbox.com/developers/documentation/http/documentation#file_properties-properties-update)  scope: &#x60;files.metadata.write&#x60;  Add, update or remove properties associated with the supplied file and templates. This endpoint should be used instead of &#x60;properties/overwrite&#x60; when property groups are being updated via a \&quot;delta\&quot; instead of via a \&quot;snapshot\&quot; . In other words, this endpoint will not delete any omitted fields from a property group, whereas &#x60;properties/overwrite&#x60; will delete any fields that are omitted from a property group.
     * @param contentType  (optional)
     * @param body  (optional)
     * @return void
     */
    open suspend fun call2filePropertiesPropertiesUpdatePost(contentType: kotlin.String? = null, body: kotlin.String? = null): HttpResponse<Unit> {

        val localVariableAuthNames = listOf<String>("bearerAuth")

        val localVariableBody = body

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()
        contentType?.apply { localVariableHeaders["Content-Type"] = this.toString() }

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.POST,
            "/2/file_properties/properties/update",
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
     * templates/add_for_team
     * [templates/add_for_team](https://www.dropbox.com/developers/documentation/http/teams#file_properties-templates-add_for_team)  scope: &#x60;files.team_metadata.write&#x60;  Add a template associated with a team. See &#x60;properties/add&#x60; to add properties to a file or folder. Note: this endpoint will create team-owned templates.
     * @param contentType  (optional)
     * @param body  (optional)
     * @return kotlin.String
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun call2filePropertiesTemplatesAddForTeamPost(contentType: kotlin.String? = null, body: kotlin.String? = null): HttpResponse<kotlin.String> {

        val localVariableAuthNames = listOf<String>("bearerAuth")

        val localVariableBody = body

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()
        contentType?.apply { localVariableHeaders["Content-Type"] = this.toString() }

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.POST,
            "/2/file_properties/templates/add_for_team",
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
     * templates/add_for_user
     * [templates/add_for_user](https://www.dropbox.com/developers/documentation/http/documentation#file_properties-templates-add_for_user)  scope: &#x60;files.metadata.write&#x60;  Add a template associated with a user. See &#x60;properties/add&#x60; to add properties to a file. This endpoint can&#39;t be called on a team member or admin&#39;s behalf.
     * @param contentType  (optional)
     * @param body  (optional)
     * @return kotlin.String
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun call2filePropertiesTemplatesAddForUserPost(contentType: kotlin.String? = null, body: kotlin.String? = null): HttpResponse<kotlin.String> {

        val localVariableAuthNames = listOf<String>("bearerAuth")

        val localVariableBody = body

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()
        contentType?.apply { localVariableHeaders["Content-Type"] = this.toString() }

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.POST,
            "/2/file_properties/templates/add_for_user",
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
     * templates/get_for_team
     * [templates/get_for_team](https://www.dropbox.com/developers/documentation/http/teams#file_properties-templates-get_for_team)  scope: &#x60;files.team_metadata.write&#x60;  Get the schema for a specified template.
     * @param contentType  (optional)
     * @param body  (optional)
     * @return kotlin.String
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun call2filePropertiesTemplatesGetForTeamPost(contentType: kotlin.String? = null, body: kotlin.String? = null): HttpResponse<kotlin.String> {

        val localVariableAuthNames = listOf<String>("bearerAuth")

        val localVariableBody = body

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()
        contentType?.apply { localVariableHeaders["Content-Type"] = this.toString() }

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.POST,
            "/2/file_properties/templates/get_for_team",
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
     * templates/get_for_user
     * [templates/get_for_user](https://www.dropbox.com/developers/documentation/http/documentation#file_properties-templates-get_for_user)  scope: &#x60;files.metadata.read&#x60;  Get the schema for a specified template. This endpoint can&#39;t be called on a team member or admin&#39;s behalf.
     * @param contentType  (optional)
     * @param body  (optional)
     * @return kotlin.String
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun call2filePropertiesTemplatesGetForUserPost(contentType: kotlin.String? = null, body: kotlin.String? = null): HttpResponse<kotlin.String> {

        val localVariableAuthNames = listOf<String>("bearerAuth")

        val localVariableBody = body

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()
        contentType?.apply { localVariableHeaders["Content-Type"] = this.toString() }

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.POST,
            "/2/file_properties/templates/get_for_user",
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
     * templates/list_for_team
     * [templates/list_for_team](https://www.dropbox.com/developers/documentation/http/teams#file_properties-templates-list_for_team)  scope: &#x60;files.team_metadata.write&#x60;  Get the template identifiers for a team. To get the schema of each template use &#x60;templates/get_for_team&#x60;.      
     * @return kotlin.String
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun call2filePropertiesTemplatesListForTeamPost(): HttpResponse<kotlin.String> {

        val localVariableAuthNames = listOf<String>("bearerAuth")

        val localVariableBody = 
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.POST,
            "/2/file_properties/templates/list_for_team",
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
     * templates/list_for_user
     * [templates/list_for_user](https://www.dropbox.com/developers/documentation/http/documentation#file_properties-templates-list_for_user)  scope: &#x60;files.metadata.read&#x60;  Get the template identifiers for a team. To get the schema of each template use &#x60;templates/get_for_user&#x60;. This endpoint can&#39;t be called on a team member or admin&#39;s behalf.      
     * @return kotlin.String
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun call2filePropertiesTemplatesListForUserPost(): HttpResponse<kotlin.String> {

        val localVariableAuthNames = listOf<String>("bearerAuth")

        val localVariableBody = 
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.POST,
            "/2/file_properties/templates/list_for_user",
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
     * templates/remove_for_team
     * [templates/remove_for_team](https://www.dropbox.com/developers/documentation/http/teams#file_properties-templates-remove_for_team)  scope: &#x60;files.team_metadata.write&#x60;  Permanently removes the specified template created from &#x60;templates/add_for_user&#x60;. All properties associated with the template will also be removed. This action cannot be undone.
     * @param contentType  (optional)
     * @param body  (optional)
     * @return void
     */
    open suspend fun call2filePropertiesTemplatesRemoveForTeamPost(contentType: kotlin.String? = null, body: kotlin.String? = null): HttpResponse<Unit> {

        val localVariableAuthNames = listOf<String>("bearerAuth")

        val localVariableBody = body

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()
        contentType?.apply { localVariableHeaders["Content-Type"] = this.toString() }

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.POST,
            "/2/file_properties/templates/remove_for_team",
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
     * templates/remove_for_user
     * [templates/remove_for_user](https://www.dropbox.com/developers/documentation/http/documentation#file_properties-templates-remove_for_user)  scope: &#x60;files.metadata.write&#x60;  Permanently removes the specified template created from &#x60;templates/add_for_user&#x60;. All properties associated with the template will also be removed. This action cannot be undone.
     * @param contentType  (optional)
     * @param body  (optional)
     * @return void
     */
    open suspend fun call2filePropertiesTemplatesRemoveForUserPost(contentType: kotlin.String? = null, body: kotlin.String? = null): HttpResponse<Unit> {

        val localVariableAuthNames = listOf<String>("bearerAuth")

        val localVariableBody = body

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()
        contentType?.apply { localVariableHeaders["Content-Type"] = this.toString() }

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.POST,
            "/2/file_properties/templates/remove_for_user",
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
     * templates/update_for_team
     * [templates/update_for_team](https://www.dropbox.com/developers/documentation/http/teams#file_properties-templates-update_for_team)  scope: &#x60;files.team_metadata.write&#x60;  Update a template associated with a team. This route can update the template name, the template description and add optional properties to templates.
     * @param contentType  (optional)
     * @param body  (optional)
     * @return kotlin.String
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun call2filePropertiesTemplatesUpdateForTeamPost(contentType: kotlin.String? = null, body: kotlin.String? = null): HttpResponse<kotlin.String> {

        val localVariableAuthNames = listOf<String>("bearerAuth")

        val localVariableBody = body

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()
        contentType?.apply { localVariableHeaders["Content-Type"] = this.toString() }

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.POST,
            "/2/file_properties/templates/update_for_team",
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
     * templates/update_for_user
     * [templates/update_for_user](https://www.dropbox.com/developers/documentation/http/documentation#file_properties-templates-update_for_user)  scope: &#x60;files.metadata.write&#x60;  Update a template associated with a user. This route can update the template name, the template description and add optional properties to templates. This endpoint can&#39;t be called on a team member or admin&#39;s behalf.
     * @param contentType  (optional)
     * @param body  (optional)
     * @return kotlin.String
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun call2filePropertiesTemplatesUpdateForUserPost(contentType: kotlin.String? = null, body: kotlin.String? = null): HttpResponse<kotlin.String> {

        val localVariableAuthNames = listOf<String>("bearerAuth")

        val localVariableBody = body

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()
        contentType?.apply { localVariableHeaders["Content-Type"] = this.toString() }

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.POST,
            "/2/file_properties/templates/update_for_user",
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

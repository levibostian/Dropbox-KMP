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

open class TeamTeamFolderApi(
    baseUrl: String = ApiClient.BASE_URL,
    httpClientEngine: HttpClientEngine? = null,
    httpClientConfig: ((HttpClientConfig<*>) -> Unit)? = null,
    jsonSerializer: Json = ApiClient.JSON_DEFAULT
) : ApiClient(baseUrl, httpClientEngine, httpClientConfig, jsonSerializer) {

    /**
     * team_folder/activate
     * [team_folder/activate](https://www.dropbox.com/developers/documentation/http/teams#team-team_folder-activate)  scope: &#x60;team_data.team_space&#x60;  Sets an archived team folder&#39;s status to active. Permission : Team member file access.
     * @param body  (optional)
     * @return kotlin.String
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun call2teamTeamFolderActivatePost(body: kotlin.String? = null): HttpResponse<kotlin.String> {

        val localVariableAuthNames = listOf<String>("bearerAuth")

        val localVariableBody = body

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.POST,
            "/2/team/team_folder/activate",
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
     * team_folder/archive/check
     * [team_folder/archive/check](https://www.dropbox.com/developers/documentation/http/teams#team-team_folder-archive-check)  scope: &#x60;team_data.team_space&#x60;  Returns the status of an asynchronous job for archiving a team folder. Permission : Team member file access.
     * @param body  (optional)
     * @return kotlin.String
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun call2teamTeamFolderArchiveCheckPost(body: kotlin.String? = null): HttpResponse<kotlin.String> {

        val localVariableAuthNames = listOf<String>("bearerAuth")

        val localVariableBody = body

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.POST,
            "/2/team/team_folder/archive/check",
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
     * team_folder/archive
     * [team_folder/archive](https://www.dropbox.com/developers/documentation/http/teams#team-team_folder-archive)  scope: &#x60;team_data.team_space&#x60;  Sets an active team folder&#39;s status to archived and removes all folder and file members. Permission : Team member file access.
     * @param body  (optional)
     * @return kotlin.String
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun call2teamTeamFolderArchivePost(body: kotlin.String? = null): HttpResponse<kotlin.String> {

        val localVariableAuthNames = listOf<String>("bearerAuth")

        val localVariableBody = body

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.POST,
            "/2/team/team_folder/archive",
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
     * team_folder/create
     * [team_folder/create](https://www.dropbox.com/developers/documentation/http/teams#team-team_folder-create)  scope: &#x60;team_data.team_space&#x60;  Creates a new, active, team folder with no members. Permission : Team member file access.
     * @param body  (optional)
     * @return kotlin.String
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun call2teamTeamFolderCreatePost(body: kotlin.String? = null): HttpResponse<kotlin.String> {

        val localVariableAuthNames = listOf<String>("bearerAuth")

        val localVariableBody = body

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.POST,
            "/2/team/team_folder/create",
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
     * team_folder/get_info
     * [team_folder/get_info](https://www.dropbox.com/developers/documentation/http/teams#team-team_folder-get_info)  scope: &#x60;team_data.team_space&#x60;  Retrieves metadata for team folders. Permission : Team member file access.
     * @param body  (optional)
     * @return void
     */
    open suspend fun call2teamTeamFolderGetInfoPost(body: kotlin.String? = null): HttpResponse<Unit> {

        val localVariableAuthNames = listOf<String>("bearerAuth")

        val localVariableBody = body

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.POST,
            "/2/team/team_folder/get_info",
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
     * team_folder/list/continue
     * [team_folder/list/continue](https://www.dropbox.com/developers/documentation/http/teams#team-team_folder-list-continue)  scope: &#x60;team_data.team_space&#x60;  Once a cursor has been retrieved from &#x60;team_folder/list&#x60;, use this to paginate through all team folders. Permission : Team member file access.
     * @param body  (optional)
     * @return kotlin.String
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun call2teamTeamFolderListContinuePost(body: kotlin.String? = null): HttpResponse<kotlin.String> {

        val localVariableAuthNames = listOf<String>("bearerAuth")

        val localVariableBody = body

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.POST,
            "/2/team/team_folder/list/continue",
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
     * team_folder/list
     * [team_folder/list](https://www.dropbox.com/developers/documentation/http/teams#team-team_folder-list)  scope: &#x60;team_data.team_space&#x60;  Lists all team folders. Permission : Team member file access.
     * @param body  (optional)
     * @return kotlin.String
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun call2teamTeamFolderListPost(body: kotlin.String? = null): HttpResponse<kotlin.String> {

        val localVariableAuthNames = listOf<String>("bearerAuth")

        val localVariableBody = body

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.POST,
            "/2/team/team_folder/list",
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
     * team_folder/permanently_delete
     * [team_folder/permanently_delete](https://www.dropbox.com/developers/documentation/http/teams#team-team_folder-permanently_delete)  scope: &#x60;team_data.team_space&#x60;  Permanently deletes an archived team folder. Permission : Team member file access.
     * @param body  (optional)
     * @return void
     */
    open suspend fun call2teamTeamFolderPermanentlyDeletePost(body: kotlin.String? = null): HttpResponse<Unit> {

        val localVariableAuthNames = listOf<String>("bearerAuth")

        val localVariableBody = body

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.POST,
            "/2/team/team_folder/permanently_delete",
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
     * team_folder/rename
     * [team_folder/rename](https://www.dropbox.com/developers/documentation/http/teams#team-team_folder-rename)  scope: &#x60;team_data.team_space&#x60;  Changes an active team folder&#39;s name. Permission : Team member file access.
     * @param body  (optional)
     * @return kotlin.String
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun call2teamTeamFolderRenamePost(body: kotlin.String? = null): HttpResponse<kotlin.String> {

        val localVariableAuthNames = listOf<String>("bearerAuth")

        val localVariableBody = body

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.POST,
            "/2/team/team_folder/rename",
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
     * team_folder/update_sync_settings
     * [team_folder/update_sync_settings](https://www.dropbox.com/developers/documentation/http/teams#team-team_folder-update_sync_settings)  scope: &#x60;team_data.team_space&#x60;  Updates the sync settings on a team folder or its contents.  Use of this endpoint requires that the team has team selective sync enabled.
     * @param body  (optional)
     * @return kotlin.String
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun call2teamTeamFolderUpdateSyncSettingsPost(body: kotlin.String? = null): HttpResponse<kotlin.String> {

        val localVariableAuthNames = listOf<String>("bearerAuth")

        val localVariableBody = body

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.POST,
            "/2/team/team_folder/update_sync_settings",
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

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

open class TeamLegalHoldsApi(
    baseUrl: String = ApiClient.BASE_URL,
    httpClientEngine: HttpClientEngine? = null,
    httpClientConfig: ((HttpClientConfig<*>) -> Unit)? = null,
    jsonSerializer: Json = ApiClient.JSON_DEFAULT
) : ApiClient(baseUrl, httpClientEngine, httpClientConfig, jsonSerializer) {

    /**
     * legal_holds/create_policy
     * [legal_holds/create_policy](https://www.dropbox.com/developers/documentation/http/teams#team-legal_holds-create_policy)  scope: &#x60;team_data.member&#x60;  Creates new legal hold policy. Note: Legal Holds is a paid add-on. Not all teams have the feature. Permission : Team member file access.
     * @param body  (optional)
     * @return kotlin.String
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun call2teamLegalHoldsCreatePolicyPost(body: kotlin.String? = null): HttpResponse<kotlin.String> {

        val localVariableAuthNames = listOf<String>("bearerAuth")

        val localVariableBody = body

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.POST,
            "/2/team/legal_holds/create_policy",
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
     * legal_holds/get_policy
     * [legal_holds/get_policy](https://www.dropbox.com/developers/documentation/http/teams#team-legal_holds-get_policy)  scope: &#x60;team_data.member&#x60;  Gets a legal hold by Id. Note: Legal Holds is a paid add-on. Not all teams have the feature. Permission : Team member file access.
     * @param body  (optional)
     * @return kotlin.String
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun call2teamLegalHoldsGetPolicyPost(body: kotlin.String? = null): HttpResponse<kotlin.String> {

        val localVariableAuthNames = listOf<String>("bearerAuth")

        val localVariableBody = body

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.POST,
            "/2/team/legal_holds/get_policy",
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
     * legal_holds/list_held_revisions_continue
     * [legal_holds/list_held_revisions_continue](https://www.dropbox.com/developers/documentation/http/teams#team-legal_holds-list_held_revisions_continue)  scope: &#x60;team_data.member&#x60;  Continue listing the file metadata that&#39;s under the hold. Note: Legal Holds is a paid add-on. Not all teams have the feature. Permission : Team member file access.
     * @param body  (optional)
     * @return kotlin.String
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun call2teamLegalHoldsListHeldRevisionsContinuePost(body: kotlin.String? = null): HttpResponse<kotlin.String> {

        val localVariableAuthNames = listOf<String>("bearerAuth")

        val localVariableBody = body

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.POST,
            "/2/team/legal_holds/list_held_revisions_continue",
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
     * legal_holds/list_held_revisions
     * [legal_holds/list_held_revisions](https://www.dropbox.com/developers/documentation/http/teams#team-legal_holds-list_held_revisions)  scope: &#x60;team_data.member&#x60;  List the file metadata that&#39;s under the hold. Note: Legal Holds is a paid add-on. Not all teams have the feature. Permission : Team member file access.
     * @param body  (optional)
     * @return kotlin.String
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun call2teamLegalHoldsListHeldRevisionsPost(body: kotlin.String? = null): HttpResponse<kotlin.String> {

        val localVariableAuthNames = listOf<String>("bearerAuth")

        val localVariableBody = body

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.POST,
            "/2/team/legal_holds/list_held_revisions",
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
     * legal_holds/list_policies
     * [legal_holds/list_policies](https://www.dropbox.com/developers/documentation/http/teams#team-legal_holds-list_policies)  scope: &#x60;team_data.member&#x60;  Lists legal holds on a team. Note: Legal Holds is a paid add-on. Not all teams have the feature. Permission : Team member file access.
     * @param body  (optional)
     * @return kotlin.String
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun call2teamLegalHoldsListPoliciesPost(body: kotlin.String? = null): HttpResponse<kotlin.String> {

        val localVariableAuthNames = listOf<String>("bearerAuth")

        val localVariableBody = body

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.POST,
            "/2/team/legal_holds/list_policies",
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
     * legal_holds/release_policy
     * [legal_holds/release_policy](https://www.dropbox.com/developers/documentation/http/teams#team-legal_holds-release_policy)  scope: &#x60;team_data.member&#x60;  Releases a legal hold by Id. Note: Legal Holds is a paid add-on. Not all teams have the feature. Permission : Team member file access.
     * @param body  (optional)
     * @return void
     */
    open suspend fun call2teamLegalHoldsReleasePolicyPost(body: kotlin.String? = null): HttpResponse<Unit> {

        val localVariableAuthNames = listOf<String>("bearerAuth")

        val localVariableBody = body

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.POST,
            "/2/team/legal_holds/release_policy",
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
     * legal_holds/update_policy
     * [legal_holds/update_policy](https://www.dropbox.com/developers/documentation/http/teams#team-legal_holds-update_policy)  scope: &#x60;team_data.member&#x60;  Updates a legal hold. Note: Legal Holds is a paid add-on. Not all teams have the feature. Permission : Team member file access.
     * @param body  (optional)
     * @return kotlin.String
     */
    @Suppress("UNCHECKED_CAST")
    open suspend fun call2teamLegalHoldsUpdatePolicyPost(body: kotlin.String? = null): HttpResponse<kotlin.String> {

        val localVariableAuthNames = listOf<String>("bearerAuth")

        val localVariableBody = body

        val localVariableQuery = mutableMapOf<String, List<String>>()
        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig<kotlin.Any?>(
            RequestMethod.POST,
            "/2/team/legal_holds/update_policy",
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

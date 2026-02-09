package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** SnmpTrapReceiverWhereInput */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class SnmpTrapReceiverWhereInput
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_A_N_D = "AND";

    @SerializedName(SERIALIZED_NAME_A_N_D)
    private List<SnmpTrapReceiverWhereInput> AND = null;

    public static final String SERIALIZED_NAME_N_O_T = "NOT";

    @SerializedName(SERIALIZED_NAME_N_O_T)
    private List<SnmpTrapReceiverWhereInput> NOT = null;

    public static final String SERIALIZED_NAME_O_R = "OR";

    @SerializedName(SERIALIZED_NAME_O_R)
    private List<SnmpTrapReceiverWhereInput> OR = null;

    public static final String SERIALIZED_NAME_AUTH_PASS_PHRASE = "auth_pass_phrase";

    @SerializedName(SERIALIZED_NAME_AUTH_PASS_PHRASE)
    private String authPassPhrase;

    public static final String SERIALIZED_NAME_AUTH_PASS_PHRASE_CONTAINS =
            "auth_pass_phrase_contains";

    @SerializedName(SERIALIZED_NAME_AUTH_PASS_PHRASE_CONTAINS)
    private String authPassPhraseContains;

    public static final String SERIALIZED_NAME_AUTH_PASS_PHRASE_ENDS_WITH =
            "auth_pass_phrase_ends_with";

    @SerializedName(SERIALIZED_NAME_AUTH_PASS_PHRASE_ENDS_WITH)
    private String authPassPhraseEndsWith;

    public static final String SERIALIZED_NAME_AUTH_PASS_PHRASE_GT = "auth_pass_phrase_gt";

    @SerializedName(SERIALIZED_NAME_AUTH_PASS_PHRASE_GT)
    private String authPassPhraseGt;

    public static final String SERIALIZED_NAME_AUTH_PASS_PHRASE_GTE = "auth_pass_phrase_gte";

    @SerializedName(SERIALIZED_NAME_AUTH_PASS_PHRASE_GTE)
    private String authPassPhraseGte;

    public static final String SERIALIZED_NAME_AUTH_PASS_PHRASE_IN = "auth_pass_phrase_in";

    @SerializedName(SERIALIZED_NAME_AUTH_PASS_PHRASE_IN)
    private List<String> authPassPhraseIn = null;

    public static final String SERIALIZED_NAME_AUTH_PASS_PHRASE_LT = "auth_pass_phrase_lt";

    @SerializedName(SERIALIZED_NAME_AUTH_PASS_PHRASE_LT)
    private String authPassPhraseLt;

    public static final String SERIALIZED_NAME_AUTH_PASS_PHRASE_LTE = "auth_pass_phrase_lte";

    @SerializedName(SERIALIZED_NAME_AUTH_PASS_PHRASE_LTE)
    private String authPassPhraseLte;

    public static final String SERIALIZED_NAME_AUTH_PASS_PHRASE_NOT = "auth_pass_phrase_not";

    @SerializedName(SERIALIZED_NAME_AUTH_PASS_PHRASE_NOT)
    private String authPassPhraseNot;

    public static final String SERIALIZED_NAME_AUTH_PASS_PHRASE_NOT_CONTAINS =
            "auth_pass_phrase_not_contains";

    @SerializedName(SERIALIZED_NAME_AUTH_PASS_PHRASE_NOT_CONTAINS)
    private String authPassPhraseNotContains;

    public static final String SERIALIZED_NAME_AUTH_PASS_PHRASE_NOT_ENDS_WITH =
            "auth_pass_phrase_not_ends_with";

    @SerializedName(SERIALIZED_NAME_AUTH_PASS_PHRASE_NOT_ENDS_WITH)
    private String authPassPhraseNotEndsWith;

    public static final String SERIALIZED_NAME_AUTH_PASS_PHRASE_NOT_IN = "auth_pass_phrase_not_in";

    @SerializedName(SERIALIZED_NAME_AUTH_PASS_PHRASE_NOT_IN)
    private List<String> authPassPhraseNotIn = null;

    public static final String SERIALIZED_NAME_AUTH_PASS_PHRASE_NOT_STARTS_WITH =
            "auth_pass_phrase_not_starts_with";

    @SerializedName(SERIALIZED_NAME_AUTH_PASS_PHRASE_NOT_STARTS_WITH)
    private String authPassPhraseNotStartsWith;

    public static final String SERIALIZED_NAME_AUTH_PASS_PHRASE_STARTS_WITH =
            "auth_pass_phrase_starts_with";

    @SerializedName(SERIALIZED_NAME_AUTH_PASS_PHRASE_STARTS_WITH)
    private String authPassPhraseStartsWith;

    public static final String SERIALIZED_NAME_AUTH_PROTOCOL = "auth_protocol";

    @SerializedName(SERIALIZED_NAME_AUTH_PROTOCOL)
    private SnmpAuthProtocol authProtocol;

    public static final String SERIALIZED_NAME_AUTH_PROTOCOL_IN = "auth_protocol_in";

    @SerializedName(SERIALIZED_NAME_AUTH_PROTOCOL_IN)
    private List<SnmpAuthProtocol> authProtocolIn = null;

    public static final String SERIALIZED_NAME_AUTH_PROTOCOL_NOT = "auth_protocol_not";

    @SerializedName(SERIALIZED_NAME_AUTH_PROTOCOL_NOT)
    private SnmpAuthProtocol authProtocolNot;

    public static final String SERIALIZED_NAME_AUTH_PROTOCOL_NOT_IN = "auth_protocol_not_in";

    @SerializedName(SERIALIZED_NAME_AUTH_PROTOCOL_NOT_IN)
    private List<SnmpAuthProtocol> authProtocolNotIn = null;

    public static final String SERIALIZED_NAME_CLUSTER = "cluster";

    @SerializedName(SERIALIZED_NAME_CLUSTER)
    private ClusterWhereInput cluster;

    public static final String SERIALIZED_NAME_COMMUNITY = "community";

    @SerializedName(SERIALIZED_NAME_COMMUNITY)
    private String community;

    public static final String SERIALIZED_NAME_COMMUNITY_CONTAINS = "community_contains";

    @SerializedName(SERIALIZED_NAME_COMMUNITY_CONTAINS)
    private String communityContains;

    public static final String SERIALIZED_NAME_COMMUNITY_ENDS_WITH = "community_ends_with";

    @SerializedName(SERIALIZED_NAME_COMMUNITY_ENDS_WITH)
    private String communityEndsWith;

    public static final String SERIALIZED_NAME_COMMUNITY_GT = "community_gt";

    @SerializedName(SERIALIZED_NAME_COMMUNITY_GT)
    private String communityGt;

    public static final String SERIALIZED_NAME_COMMUNITY_GTE = "community_gte";

    @SerializedName(SERIALIZED_NAME_COMMUNITY_GTE)
    private String communityGte;

    public static final String SERIALIZED_NAME_COMMUNITY_IN = "community_in";

    @SerializedName(SERIALIZED_NAME_COMMUNITY_IN)
    private List<String> communityIn = null;

    public static final String SERIALIZED_NAME_COMMUNITY_LT = "community_lt";

    @SerializedName(SERIALIZED_NAME_COMMUNITY_LT)
    private String communityLt;

    public static final String SERIALIZED_NAME_COMMUNITY_LTE = "community_lte";

    @SerializedName(SERIALIZED_NAME_COMMUNITY_LTE)
    private String communityLte;

    public static final String SERIALIZED_NAME_COMMUNITY_NOT = "community_not";

    @SerializedName(SERIALIZED_NAME_COMMUNITY_NOT)
    private String communityNot;

    public static final String SERIALIZED_NAME_COMMUNITY_NOT_CONTAINS = "community_not_contains";

    @SerializedName(SERIALIZED_NAME_COMMUNITY_NOT_CONTAINS)
    private String communityNotContains;

    public static final String SERIALIZED_NAME_COMMUNITY_NOT_ENDS_WITH = "community_not_ends_with";

    @SerializedName(SERIALIZED_NAME_COMMUNITY_NOT_ENDS_WITH)
    private String communityNotEndsWith;

    public static final String SERIALIZED_NAME_COMMUNITY_NOT_IN = "community_not_in";

    @SerializedName(SERIALIZED_NAME_COMMUNITY_NOT_IN)
    private List<String> communityNotIn = null;

    public static final String SERIALIZED_NAME_COMMUNITY_NOT_STARTS_WITH =
            "community_not_starts_with";

    @SerializedName(SERIALIZED_NAME_COMMUNITY_NOT_STARTS_WITH)
    private String communityNotStartsWith;

    public static final String SERIALIZED_NAME_COMMUNITY_STARTS_WITH = "community_starts_with";

    @SerializedName(SERIALIZED_NAME_COMMUNITY_STARTS_WITH)
    private String communityStartsWith;

    public static final String SERIALIZED_NAME_DISABLED = "disabled";

    @SerializedName(SERIALIZED_NAME_DISABLED)
    private Boolean disabled;

    public static final String SERIALIZED_NAME_DISABLED_NOT = "disabled_not";

    @SerializedName(SERIALIZED_NAME_DISABLED_NOT)
    private Boolean disabledNot;

    public static final String SERIALIZED_NAME_ENGINE_ID = "engine_id";

    @SerializedName(SERIALIZED_NAME_ENGINE_ID)
    private String engineId;

    public static final String SERIALIZED_NAME_ENGINE_ID_CONTAINS = "engine_id_contains";

    @SerializedName(SERIALIZED_NAME_ENGINE_ID_CONTAINS)
    private String engineIdContains;

    public static final String SERIALIZED_NAME_ENGINE_ID_ENDS_WITH = "engine_id_ends_with";

    @SerializedName(SERIALIZED_NAME_ENGINE_ID_ENDS_WITH)
    private String engineIdEndsWith;

    public static final String SERIALIZED_NAME_ENGINE_ID_GT = "engine_id_gt";

    @SerializedName(SERIALIZED_NAME_ENGINE_ID_GT)
    private String engineIdGt;

    public static final String SERIALIZED_NAME_ENGINE_ID_GTE = "engine_id_gte";

    @SerializedName(SERIALIZED_NAME_ENGINE_ID_GTE)
    private String engineIdGte;

    public static final String SERIALIZED_NAME_ENGINE_ID_IN = "engine_id_in";

    @SerializedName(SERIALIZED_NAME_ENGINE_ID_IN)
    private List<String> engineIdIn = null;

    public static final String SERIALIZED_NAME_ENGINE_ID_LT = "engine_id_lt";

    @SerializedName(SERIALIZED_NAME_ENGINE_ID_LT)
    private String engineIdLt;

    public static final String SERIALIZED_NAME_ENGINE_ID_LTE = "engine_id_lte";

    @SerializedName(SERIALIZED_NAME_ENGINE_ID_LTE)
    private String engineIdLte;

    public static final String SERIALIZED_NAME_ENGINE_ID_NOT = "engine_id_not";

    @SerializedName(SERIALIZED_NAME_ENGINE_ID_NOT)
    private String engineIdNot;

    public static final String SERIALIZED_NAME_ENGINE_ID_NOT_CONTAINS = "engine_id_not_contains";

    @SerializedName(SERIALIZED_NAME_ENGINE_ID_NOT_CONTAINS)
    private String engineIdNotContains;

    public static final String SERIALIZED_NAME_ENGINE_ID_NOT_ENDS_WITH = "engine_id_not_ends_with";

    @SerializedName(SERIALIZED_NAME_ENGINE_ID_NOT_ENDS_WITH)
    private String engineIdNotEndsWith;

    public static final String SERIALIZED_NAME_ENGINE_ID_NOT_IN = "engine_id_not_in";

    @SerializedName(SERIALIZED_NAME_ENGINE_ID_NOT_IN)
    private List<String> engineIdNotIn = null;

    public static final String SERIALIZED_NAME_ENGINE_ID_NOT_STARTS_WITH =
            "engine_id_not_starts_with";

    @SerializedName(SERIALIZED_NAME_ENGINE_ID_NOT_STARTS_WITH)
    private String engineIdNotStartsWith;

    public static final String SERIALIZED_NAME_ENGINE_ID_STARTS_WITH = "engine_id_starts_with";

    @SerializedName(SERIALIZED_NAME_ENGINE_ID_STARTS_WITH)
    private String engineIdStartsWith;

    public static final String SERIALIZED_NAME_ENTITY_ASYNC_STATUS = "entityAsyncStatus";

    @SerializedName(SERIALIZED_NAME_ENTITY_ASYNC_STATUS)
    private EntityAsyncStatus entityAsyncStatus;

    public static final String SERIALIZED_NAME_ENTITY_ASYNC_STATUS_IN = "entityAsyncStatus_in";

    @SerializedName(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_IN)
    private List<EntityAsyncStatus> entityAsyncStatusIn = null;

    public static final String SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT = "entityAsyncStatus_not";

    @SerializedName(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT)
    private EntityAsyncStatus entityAsyncStatusNot;

    public static final String SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT_IN =
            "entityAsyncStatus_not_in";

    @SerializedName(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT_IN)
    private List<EntityAsyncStatus> entityAsyncStatusNotIn = null;

    public static final String SERIALIZED_NAME_HOST = "host";

    @SerializedName(SERIALIZED_NAME_HOST)
    private String host;

    public static final String SERIALIZED_NAME_HOST_CONTAINS = "host_contains";

    @SerializedName(SERIALIZED_NAME_HOST_CONTAINS)
    private String hostContains;

    public static final String SERIALIZED_NAME_HOST_ENDS_WITH = "host_ends_with";

    @SerializedName(SERIALIZED_NAME_HOST_ENDS_WITH)
    private String hostEndsWith;

    public static final String SERIALIZED_NAME_HOST_GT = "host_gt";

    @SerializedName(SERIALIZED_NAME_HOST_GT)
    private String hostGt;

    public static final String SERIALIZED_NAME_HOST_GTE = "host_gte";

    @SerializedName(SERIALIZED_NAME_HOST_GTE)
    private String hostGte;

    public static final String SERIALIZED_NAME_HOST_IN = "host_in";

    @SerializedName(SERIALIZED_NAME_HOST_IN)
    private List<String> hostIn = null;

    public static final String SERIALIZED_NAME_HOST_LT = "host_lt";

    @SerializedName(SERIALIZED_NAME_HOST_LT)
    private String hostLt;

    public static final String SERIALIZED_NAME_HOST_LTE = "host_lte";

    @SerializedName(SERIALIZED_NAME_HOST_LTE)
    private String hostLte;

    public static final String SERIALIZED_NAME_HOST_NOT = "host_not";

    @SerializedName(SERIALIZED_NAME_HOST_NOT)
    private String hostNot;

    public static final String SERIALIZED_NAME_HOST_NOT_CONTAINS = "host_not_contains";

    @SerializedName(SERIALIZED_NAME_HOST_NOT_CONTAINS)
    private String hostNotContains;

    public static final String SERIALIZED_NAME_HOST_NOT_ENDS_WITH = "host_not_ends_with";

    @SerializedName(SERIALIZED_NAME_HOST_NOT_ENDS_WITH)
    private String hostNotEndsWith;

    public static final String SERIALIZED_NAME_HOST_NOT_IN = "host_not_in";

    @SerializedName(SERIALIZED_NAME_HOST_NOT_IN)
    private List<String> hostNotIn = null;

    public static final String SERIALIZED_NAME_HOST_NOT_STARTS_WITH = "host_not_starts_with";

    @SerializedName(SERIALIZED_NAME_HOST_NOT_STARTS_WITH)
    private String hostNotStartsWith;

    public static final String SERIALIZED_NAME_HOST_STARTS_WITH = "host_starts_with";

    @SerializedName(SERIALIZED_NAME_HOST_STARTS_WITH)
    private String hostStartsWith;

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

    public static final String SERIALIZED_NAME_ID_CONTAINS = "id_contains";

    @SerializedName(SERIALIZED_NAME_ID_CONTAINS)
    private String idContains;

    public static final String SERIALIZED_NAME_ID_ENDS_WITH = "id_ends_with";

    @SerializedName(SERIALIZED_NAME_ID_ENDS_WITH)
    private String idEndsWith;

    public static final String SERIALIZED_NAME_ID_GT = "id_gt";

    @SerializedName(SERIALIZED_NAME_ID_GT)
    private String idGt;

    public static final String SERIALIZED_NAME_ID_GTE = "id_gte";

    @SerializedName(SERIALIZED_NAME_ID_GTE)
    private String idGte;

    public static final String SERIALIZED_NAME_ID_IN = "id_in";

    @SerializedName(SERIALIZED_NAME_ID_IN)
    private List<String> idIn = null;

    public static final String SERIALIZED_NAME_ID_LT = "id_lt";

    @SerializedName(SERIALIZED_NAME_ID_LT)
    private String idLt;

    public static final String SERIALIZED_NAME_ID_LTE = "id_lte";

    @SerializedName(SERIALIZED_NAME_ID_LTE)
    private String idLte;

    public static final String SERIALIZED_NAME_ID_NOT = "id_not";

    @SerializedName(SERIALIZED_NAME_ID_NOT)
    private String idNot;

    public static final String SERIALIZED_NAME_ID_NOT_CONTAINS = "id_not_contains";

    @SerializedName(SERIALIZED_NAME_ID_NOT_CONTAINS)
    private String idNotContains;

    public static final String SERIALIZED_NAME_ID_NOT_ENDS_WITH = "id_not_ends_with";

    @SerializedName(SERIALIZED_NAME_ID_NOT_ENDS_WITH)
    private String idNotEndsWith;

    public static final String SERIALIZED_NAME_ID_NOT_IN = "id_not_in";

    @SerializedName(SERIALIZED_NAME_ID_NOT_IN)
    private List<String> idNotIn = null;

    public static final String SERIALIZED_NAME_ID_NOT_STARTS_WITH = "id_not_starts_with";

    @SerializedName(SERIALIZED_NAME_ID_NOT_STARTS_WITH)
    private String idNotStartsWith;

    public static final String SERIALIZED_NAME_ID_STARTS_WITH = "id_starts_with";

    @SerializedName(SERIALIZED_NAME_ID_STARTS_WITH)
    private String idStartsWith;

    public static final String SERIALIZED_NAME_INFORM = "inform";

    @SerializedName(SERIALIZED_NAME_INFORM)
    private Boolean inform;

    public static final String SERIALIZED_NAME_INFORM_NOT = "inform_not";

    @SerializedName(SERIALIZED_NAME_INFORM_NOT)
    private Boolean informNot;

    public static final String SERIALIZED_NAME_LANGUAGE_CODE = "language_code";

    @SerializedName(SERIALIZED_NAME_LANGUAGE_CODE)
    private SnmpLanguageCode languageCode;

    public static final String SERIALIZED_NAME_LANGUAGE_CODE_IN = "language_code_in";

    @SerializedName(SERIALIZED_NAME_LANGUAGE_CODE_IN)
    private List<SnmpLanguageCode> languageCodeIn = null;

    public static final String SERIALIZED_NAME_LANGUAGE_CODE_NOT = "language_code_not";

    @SerializedName(SERIALIZED_NAME_LANGUAGE_CODE_NOT)
    private SnmpLanguageCode languageCodeNot;

    public static final String SERIALIZED_NAME_LANGUAGE_CODE_NOT_IN = "language_code_not_in";

    @SerializedName(SERIALIZED_NAME_LANGUAGE_CODE_NOT_IN)
    private List<SnmpLanguageCode> languageCodeNotIn = null;

    public static final String SERIALIZED_NAME_LOCAL_ID = "local_id";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID)
    private String localId;

    public static final String SERIALIZED_NAME_LOCAL_ID_CONTAINS = "local_id_contains";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID_CONTAINS)
    private String localIdContains;

    public static final String SERIALIZED_NAME_LOCAL_ID_ENDS_WITH = "local_id_ends_with";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID_ENDS_WITH)
    private String localIdEndsWith;

    public static final String SERIALIZED_NAME_LOCAL_ID_GT = "local_id_gt";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID_GT)
    private String localIdGt;

    public static final String SERIALIZED_NAME_LOCAL_ID_GTE = "local_id_gte";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID_GTE)
    private String localIdGte;

    public static final String SERIALIZED_NAME_LOCAL_ID_IN = "local_id_in";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID_IN)
    private List<String> localIdIn = null;

    public static final String SERIALIZED_NAME_LOCAL_ID_LT = "local_id_lt";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID_LT)
    private String localIdLt;

    public static final String SERIALIZED_NAME_LOCAL_ID_LTE = "local_id_lte";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID_LTE)
    private String localIdLte;

    public static final String SERIALIZED_NAME_LOCAL_ID_NOT = "local_id_not";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID_NOT)
    private String localIdNot;

    public static final String SERIALIZED_NAME_LOCAL_ID_NOT_CONTAINS = "local_id_not_contains";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID_NOT_CONTAINS)
    private String localIdNotContains;

    public static final String SERIALIZED_NAME_LOCAL_ID_NOT_ENDS_WITH = "local_id_not_ends_with";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID_NOT_ENDS_WITH)
    private String localIdNotEndsWith;

    public static final String SERIALIZED_NAME_LOCAL_ID_NOT_IN = "local_id_not_in";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID_NOT_IN)
    private List<String> localIdNotIn = null;

    public static final String SERIALIZED_NAME_LOCAL_ID_NOT_STARTS_WITH =
            "local_id_not_starts_with";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID_NOT_STARTS_WITH)
    private String localIdNotStartsWith;

    public static final String SERIALIZED_NAME_LOCAL_ID_STARTS_WITH = "local_id_starts_with";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID_STARTS_WITH)
    private String localIdStartsWith;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_NAME_CONTAINS = "name_contains";

    @SerializedName(SERIALIZED_NAME_NAME_CONTAINS)
    private String nameContains;

    public static final String SERIALIZED_NAME_NAME_ENDS_WITH = "name_ends_with";

    @SerializedName(SERIALIZED_NAME_NAME_ENDS_WITH)
    private String nameEndsWith;

    public static final String SERIALIZED_NAME_NAME_GT = "name_gt";

    @SerializedName(SERIALIZED_NAME_NAME_GT)
    private String nameGt;

    public static final String SERIALIZED_NAME_NAME_GTE = "name_gte";

    @SerializedName(SERIALIZED_NAME_NAME_GTE)
    private String nameGte;

    public static final String SERIALIZED_NAME_NAME_IN = "name_in";

    @SerializedName(SERIALIZED_NAME_NAME_IN)
    private List<String> nameIn = null;

    public static final String SERIALIZED_NAME_NAME_LT = "name_lt";

    @SerializedName(SERIALIZED_NAME_NAME_LT)
    private String nameLt;

    public static final String SERIALIZED_NAME_NAME_LTE = "name_lte";

    @SerializedName(SERIALIZED_NAME_NAME_LTE)
    private String nameLte;

    public static final String SERIALIZED_NAME_NAME_NOT = "name_not";

    @SerializedName(SERIALIZED_NAME_NAME_NOT)
    private String nameNot;

    public static final String SERIALIZED_NAME_NAME_NOT_CONTAINS = "name_not_contains";

    @SerializedName(SERIALIZED_NAME_NAME_NOT_CONTAINS)
    private String nameNotContains;

    public static final String SERIALIZED_NAME_NAME_NOT_ENDS_WITH = "name_not_ends_with";

    @SerializedName(SERIALIZED_NAME_NAME_NOT_ENDS_WITH)
    private String nameNotEndsWith;

    public static final String SERIALIZED_NAME_NAME_NOT_IN = "name_not_in";

    @SerializedName(SERIALIZED_NAME_NAME_NOT_IN)
    private List<String> nameNotIn = null;

    public static final String SERIALIZED_NAME_NAME_NOT_STARTS_WITH = "name_not_starts_with";

    @SerializedName(SERIALIZED_NAME_NAME_NOT_STARTS_WITH)
    private String nameNotStartsWith;

    public static final String SERIALIZED_NAME_NAME_STARTS_WITH = "name_starts_with";

    @SerializedName(SERIALIZED_NAME_NAME_STARTS_WITH)
    private String nameStartsWith;

    public static final String SERIALIZED_NAME_PORT = "port";

    @SerializedName(SERIALIZED_NAME_PORT)
    private Integer port;

    public static final String SERIALIZED_NAME_PORT_GT = "port_gt";

    @SerializedName(SERIALIZED_NAME_PORT_GT)
    private Integer portGt;

    public static final String SERIALIZED_NAME_PORT_GTE = "port_gte";

    @SerializedName(SERIALIZED_NAME_PORT_GTE)
    private Integer portGte;

    public static final String SERIALIZED_NAME_PORT_IN = "port_in";

    @SerializedName(SERIALIZED_NAME_PORT_IN)
    private List<Integer> portIn = null;

    public static final String SERIALIZED_NAME_PORT_LT = "port_lt";

    @SerializedName(SERIALIZED_NAME_PORT_LT)
    private Integer portLt;

    public static final String SERIALIZED_NAME_PORT_LTE = "port_lte";

    @SerializedName(SERIALIZED_NAME_PORT_LTE)
    private Integer portLte;

    public static final String SERIALIZED_NAME_PORT_NOT = "port_not";

    @SerializedName(SERIALIZED_NAME_PORT_NOT)
    private Integer portNot;

    public static final String SERIALIZED_NAME_PORT_NOT_IN = "port_not_in";

    @SerializedName(SERIALIZED_NAME_PORT_NOT_IN)
    private List<Integer> portNotIn = null;

    public static final String SERIALIZED_NAME_PRIVACY_PASS_PHRASE = "privacy_pass_phrase";

    @SerializedName(SERIALIZED_NAME_PRIVACY_PASS_PHRASE)
    private String privacyPassPhrase;

    public static final String SERIALIZED_NAME_PRIVACY_PASS_PHRASE_CONTAINS =
            "privacy_pass_phrase_contains";

    @SerializedName(SERIALIZED_NAME_PRIVACY_PASS_PHRASE_CONTAINS)
    private String privacyPassPhraseContains;

    public static final String SERIALIZED_NAME_PRIVACY_PASS_PHRASE_ENDS_WITH =
            "privacy_pass_phrase_ends_with";

    @SerializedName(SERIALIZED_NAME_PRIVACY_PASS_PHRASE_ENDS_WITH)
    private String privacyPassPhraseEndsWith;

    public static final String SERIALIZED_NAME_PRIVACY_PASS_PHRASE_GT = "privacy_pass_phrase_gt";

    @SerializedName(SERIALIZED_NAME_PRIVACY_PASS_PHRASE_GT)
    private String privacyPassPhraseGt;

    public static final String SERIALIZED_NAME_PRIVACY_PASS_PHRASE_GTE = "privacy_pass_phrase_gte";

    @SerializedName(SERIALIZED_NAME_PRIVACY_PASS_PHRASE_GTE)
    private String privacyPassPhraseGte;

    public static final String SERIALIZED_NAME_PRIVACY_PASS_PHRASE_IN = "privacy_pass_phrase_in";

    @SerializedName(SERIALIZED_NAME_PRIVACY_PASS_PHRASE_IN)
    private List<String> privacyPassPhraseIn = null;

    public static final String SERIALIZED_NAME_PRIVACY_PASS_PHRASE_LT = "privacy_pass_phrase_lt";

    @SerializedName(SERIALIZED_NAME_PRIVACY_PASS_PHRASE_LT)
    private String privacyPassPhraseLt;

    public static final String SERIALIZED_NAME_PRIVACY_PASS_PHRASE_LTE = "privacy_pass_phrase_lte";

    @SerializedName(SERIALIZED_NAME_PRIVACY_PASS_PHRASE_LTE)
    private String privacyPassPhraseLte;

    public static final String SERIALIZED_NAME_PRIVACY_PASS_PHRASE_NOT = "privacy_pass_phrase_not";

    @SerializedName(SERIALIZED_NAME_PRIVACY_PASS_PHRASE_NOT)
    private String privacyPassPhraseNot;

    public static final String SERIALIZED_NAME_PRIVACY_PASS_PHRASE_NOT_CONTAINS =
            "privacy_pass_phrase_not_contains";

    @SerializedName(SERIALIZED_NAME_PRIVACY_PASS_PHRASE_NOT_CONTAINS)
    private String privacyPassPhraseNotContains;

    public static final String SERIALIZED_NAME_PRIVACY_PASS_PHRASE_NOT_ENDS_WITH =
            "privacy_pass_phrase_not_ends_with";

    @SerializedName(SERIALIZED_NAME_PRIVACY_PASS_PHRASE_NOT_ENDS_WITH)
    private String privacyPassPhraseNotEndsWith;

    public static final String SERIALIZED_NAME_PRIVACY_PASS_PHRASE_NOT_IN =
            "privacy_pass_phrase_not_in";

    @SerializedName(SERIALIZED_NAME_PRIVACY_PASS_PHRASE_NOT_IN)
    private List<String> privacyPassPhraseNotIn = null;

    public static final String SERIALIZED_NAME_PRIVACY_PASS_PHRASE_NOT_STARTS_WITH =
            "privacy_pass_phrase_not_starts_with";

    @SerializedName(SERIALIZED_NAME_PRIVACY_PASS_PHRASE_NOT_STARTS_WITH)
    private String privacyPassPhraseNotStartsWith;

    public static final String SERIALIZED_NAME_PRIVACY_PASS_PHRASE_STARTS_WITH =
            "privacy_pass_phrase_starts_with";

    @SerializedName(SERIALIZED_NAME_PRIVACY_PASS_PHRASE_STARTS_WITH)
    private String privacyPassPhraseStartsWith;

    public static final String SERIALIZED_NAME_PRIVACY_PROTOCOL = "privacy_protocol";

    @SerializedName(SERIALIZED_NAME_PRIVACY_PROTOCOL)
    private SnmpPrivacyProtocol privacyProtocol;

    public static final String SERIALIZED_NAME_PRIVACY_PROTOCOL_IN = "privacy_protocol_in";

    @SerializedName(SERIALIZED_NAME_PRIVACY_PROTOCOL_IN)
    private List<SnmpPrivacyProtocol> privacyProtocolIn = null;

    public static final String SERIALIZED_NAME_PRIVACY_PROTOCOL_NOT = "privacy_protocol_not";

    @SerializedName(SERIALIZED_NAME_PRIVACY_PROTOCOL_NOT)
    private SnmpPrivacyProtocol privacyProtocolNot;

    public static final String SERIALIZED_NAME_PRIVACY_PROTOCOL_NOT_IN = "privacy_protocol_not_in";

    @SerializedName(SERIALIZED_NAME_PRIVACY_PROTOCOL_NOT_IN)
    private List<SnmpPrivacyProtocol> privacyProtocolNotIn = null;

    public static final String SERIALIZED_NAME_PROTOCOL = "protocol";

    @SerializedName(SERIALIZED_NAME_PROTOCOL)
    private SnmpProtocol protocol;

    public static final String SERIALIZED_NAME_PROTOCOL_IN = "protocol_in";

    @SerializedName(SERIALIZED_NAME_PROTOCOL_IN)
    private List<SnmpProtocol> protocolIn = null;

    public static final String SERIALIZED_NAME_PROTOCOL_NOT = "protocol_not";

    @SerializedName(SERIALIZED_NAME_PROTOCOL_NOT)
    private SnmpProtocol protocolNot;

    public static final String SERIALIZED_NAME_PROTOCOL_NOT_IN = "protocol_not_in";

    @SerializedName(SERIALIZED_NAME_PROTOCOL_NOT_IN)
    private List<SnmpProtocol> protocolNotIn = null;

    public static final String SERIALIZED_NAME_USERNAME = "username";

    @SerializedName(SERIALIZED_NAME_USERNAME)
    private String username;

    public static final String SERIALIZED_NAME_USERNAME_CONTAINS = "username_contains";

    @SerializedName(SERIALIZED_NAME_USERNAME_CONTAINS)
    private String usernameContains;

    public static final String SERIALIZED_NAME_USERNAME_ENDS_WITH = "username_ends_with";

    @SerializedName(SERIALIZED_NAME_USERNAME_ENDS_WITH)
    private String usernameEndsWith;

    public static final String SERIALIZED_NAME_USERNAME_GT = "username_gt";

    @SerializedName(SERIALIZED_NAME_USERNAME_GT)
    private String usernameGt;

    public static final String SERIALIZED_NAME_USERNAME_GTE = "username_gte";

    @SerializedName(SERIALIZED_NAME_USERNAME_GTE)
    private String usernameGte;

    public static final String SERIALIZED_NAME_USERNAME_IN = "username_in";

    @SerializedName(SERIALIZED_NAME_USERNAME_IN)
    private List<String> usernameIn = null;

    public static final String SERIALIZED_NAME_USERNAME_LT = "username_lt";

    @SerializedName(SERIALIZED_NAME_USERNAME_LT)
    private String usernameLt;

    public static final String SERIALIZED_NAME_USERNAME_LTE = "username_lte";

    @SerializedName(SERIALIZED_NAME_USERNAME_LTE)
    private String usernameLte;

    public static final String SERIALIZED_NAME_USERNAME_NOT = "username_not";

    @SerializedName(SERIALIZED_NAME_USERNAME_NOT)
    private String usernameNot;

    public static final String SERIALIZED_NAME_USERNAME_NOT_CONTAINS = "username_not_contains";

    @SerializedName(SERIALIZED_NAME_USERNAME_NOT_CONTAINS)
    private String usernameNotContains;

    public static final String SERIALIZED_NAME_USERNAME_NOT_ENDS_WITH = "username_not_ends_with";

    @SerializedName(SERIALIZED_NAME_USERNAME_NOT_ENDS_WITH)
    private String usernameNotEndsWith;

    public static final String SERIALIZED_NAME_USERNAME_NOT_IN = "username_not_in";

    @SerializedName(SERIALIZED_NAME_USERNAME_NOT_IN)
    private List<String> usernameNotIn = null;

    public static final String SERIALIZED_NAME_USERNAME_NOT_STARTS_WITH =
            "username_not_starts_with";

    @SerializedName(SERIALIZED_NAME_USERNAME_NOT_STARTS_WITH)
    private String usernameNotStartsWith;

    public static final String SERIALIZED_NAME_USERNAME_STARTS_WITH = "username_starts_with";

    @SerializedName(SERIALIZED_NAME_USERNAME_STARTS_WITH)
    private String usernameStartsWith;

    public static final String SERIALIZED_NAME_VERSION = "version";

    @SerializedName(SERIALIZED_NAME_VERSION)
    private SnmpVersion version;

    public static final String SERIALIZED_NAME_VERSION_IN = "version_in";

    @SerializedName(SERIALIZED_NAME_VERSION_IN)
    private List<SnmpVersion> versionIn = null;

    public static final String SERIALIZED_NAME_VERSION_NOT = "version_not";

    @SerializedName(SERIALIZED_NAME_VERSION_NOT)
    private SnmpVersion versionNot;

    public static final String SERIALIZED_NAME_VERSION_NOT_IN = "version_not_in";

    @SerializedName(SERIALIZED_NAME_VERSION_NOT_IN)
    private List<SnmpVersion> versionNotIn = null;

    public SnmpTrapReceiverWhereInput() {}

    public SnmpTrapReceiverWhereInput AND(List<SnmpTrapReceiverWhereInput> AND) {

        this.AND = AND;
        return this;
    }

    public SnmpTrapReceiverWhereInput addANDItem(SnmpTrapReceiverWhereInput ANDItem) {
        if (this.AND == null) {
            this.AND = new ArrayList<SnmpTrapReceiverWhereInput>();
        }
        this.AND.add(ANDItem);
        return this;
    }

    /**
     * Get AND
     *
     * @return AND
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<SnmpTrapReceiverWhereInput> getAND() {
        return AND;
    }

    public void setAND(List<SnmpTrapReceiverWhereInput> AND) {
        this.AND = AND;
    }

    public SnmpTrapReceiverWhereInput AND_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_A_N_D);
        return this;
    }

    public SnmpTrapReceiverWhereInput AND_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_A_N_D);
        return this;
    }

    public void setAND_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_A_N_D);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_A_N_D);
        }
    }

    public boolean getAND_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_A_N_D);
    }

    public SnmpTrapReceiverWhereInput NOT(List<SnmpTrapReceiverWhereInput> NOT) {

        this.NOT = NOT;
        return this;
    }

    public SnmpTrapReceiverWhereInput addNOTItem(SnmpTrapReceiverWhereInput NOTItem) {
        if (this.NOT == null) {
            this.NOT = new ArrayList<SnmpTrapReceiverWhereInput>();
        }
        this.NOT.add(NOTItem);
        return this;
    }

    /**
     * Get NOT
     *
     * @return NOT
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<SnmpTrapReceiverWhereInput> getNOT() {
        return NOT;
    }

    public void setNOT(List<SnmpTrapReceiverWhereInput> NOT) {
        this.NOT = NOT;
    }

    public SnmpTrapReceiverWhereInput NOT_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_N_O_T);
        return this;
    }

    public SnmpTrapReceiverWhereInput NOT_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_N_O_T);
        return this;
    }

    public void setNOT_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_N_O_T);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_N_O_T);
        }
    }

    public boolean getNOT_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_N_O_T);
    }

    public SnmpTrapReceiverWhereInput OR(List<SnmpTrapReceiverWhereInput> OR) {

        this.OR = OR;
        return this;
    }

    public SnmpTrapReceiverWhereInput addORItem(SnmpTrapReceiverWhereInput ORItem) {
        if (this.OR == null) {
            this.OR = new ArrayList<SnmpTrapReceiverWhereInput>();
        }
        this.OR.add(ORItem);
        return this;
    }

    /**
     * Get OR
     *
     * @return OR
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<SnmpTrapReceiverWhereInput> getOR() {
        return OR;
    }

    public void setOR(List<SnmpTrapReceiverWhereInput> OR) {
        this.OR = OR;
    }

    public SnmpTrapReceiverWhereInput OR_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_O_R);
        return this;
    }

    public SnmpTrapReceiverWhereInput OR_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_O_R);
        return this;
    }

    public void setOR_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_O_R);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_O_R);
        }
    }

    public boolean getOR_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_O_R);
    }

    public SnmpTrapReceiverWhereInput authPassPhrase(String authPassPhrase) {

        this.authPassPhrase = authPassPhrase;
        return this;
    }

    /**
     * Get authPassPhrase
     *
     * @return authPassPhrase
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getAuthPassPhrase() {
        return authPassPhrase;
    }

    public void setAuthPassPhrase(String authPassPhrase) {
        this.authPassPhrase = authPassPhrase;
    }

    public SnmpTrapReceiverWhereInput authPassPhrase_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_AUTH_PASS_PHRASE);
        return this;
    }

    public SnmpTrapReceiverWhereInput authPassPhrase_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_AUTH_PASS_PHRASE);
        return this;
    }

    public void setAuthPassPhrase_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_AUTH_PASS_PHRASE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_AUTH_PASS_PHRASE);
        }
    }

    public boolean getAuthPassPhrase_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_AUTH_PASS_PHRASE);
    }

    public SnmpTrapReceiverWhereInput authPassPhraseContains(String authPassPhraseContains) {

        this.authPassPhraseContains = authPassPhraseContains;
        return this;
    }

    /**
     * Get authPassPhraseContains
     *
     * @return authPassPhraseContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getAuthPassPhraseContains() {
        return authPassPhraseContains;
    }

    public void setAuthPassPhraseContains(String authPassPhraseContains) {
        this.authPassPhraseContains = authPassPhraseContains;
    }

    public SnmpTrapReceiverWhereInput authPassPhraseContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_AUTH_PASS_PHRASE_CONTAINS);
        return this;
    }

    public SnmpTrapReceiverWhereInput authPassPhraseContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_AUTH_PASS_PHRASE_CONTAINS);
        return this;
    }

    public void setAuthPassPhraseContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_AUTH_PASS_PHRASE_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_AUTH_PASS_PHRASE_CONTAINS);
        }
    }

    public boolean getAuthPassPhraseContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_AUTH_PASS_PHRASE_CONTAINS);
    }

    public SnmpTrapReceiverWhereInput authPassPhraseEndsWith(String authPassPhraseEndsWith) {

        this.authPassPhraseEndsWith = authPassPhraseEndsWith;
        return this;
    }

    /**
     * Get authPassPhraseEndsWith
     *
     * @return authPassPhraseEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getAuthPassPhraseEndsWith() {
        return authPassPhraseEndsWith;
    }

    public void setAuthPassPhraseEndsWith(String authPassPhraseEndsWith) {
        this.authPassPhraseEndsWith = authPassPhraseEndsWith;
    }

    public SnmpTrapReceiverWhereInput authPassPhraseEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_AUTH_PASS_PHRASE_ENDS_WITH);
        return this;
    }

    public SnmpTrapReceiverWhereInput authPassPhraseEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_AUTH_PASS_PHRASE_ENDS_WITH);
        return this;
    }

    public void setAuthPassPhraseEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_AUTH_PASS_PHRASE_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_AUTH_PASS_PHRASE_ENDS_WITH);
        }
    }

    public boolean getAuthPassPhraseEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_AUTH_PASS_PHRASE_ENDS_WITH);
    }

    public SnmpTrapReceiverWhereInput authPassPhraseGt(String authPassPhraseGt) {

        this.authPassPhraseGt = authPassPhraseGt;
        return this;
    }

    /**
     * Get authPassPhraseGt
     *
     * @return authPassPhraseGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getAuthPassPhraseGt() {
        return authPassPhraseGt;
    }

    public void setAuthPassPhraseGt(String authPassPhraseGt) {
        this.authPassPhraseGt = authPassPhraseGt;
    }

    public SnmpTrapReceiverWhereInput authPassPhraseGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_AUTH_PASS_PHRASE_GT);
        return this;
    }

    public SnmpTrapReceiverWhereInput authPassPhraseGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_AUTH_PASS_PHRASE_GT);
        return this;
    }

    public void setAuthPassPhraseGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_AUTH_PASS_PHRASE_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_AUTH_PASS_PHRASE_GT);
        }
    }

    public boolean getAuthPassPhraseGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_AUTH_PASS_PHRASE_GT);
    }

    public SnmpTrapReceiverWhereInput authPassPhraseGte(String authPassPhraseGte) {

        this.authPassPhraseGte = authPassPhraseGte;
        return this;
    }

    /**
     * Get authPassPhraseGte
     *
     * @return authPassPhraseGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getAuthPassPhraseGte() {
        return authPassPhraseGte;
    }

    public void setAuthPassPhraseGte(String authPassPhraseGte) {
        this.authPassPhraseGte = authPassPhraseGte;
    }

    public SnmpTrapReceiverWhereInput authPassPhraseGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_AUTH_PASS_PHRASE_GTE);
        return this;
    }

    public SnmpTrapReceiverWhereInput authPassPhraseGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_AUTH_PASS_PHRASE_GTE);
        return this;
    }

    public void setAuthPassPhraseGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_AUTH_PASS_PHRASE_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_AUTH_PASS_PHRASE_GTE);
        }
    }

    public boolean getAuthPassPhraseGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_AUTH_PASS_PHRASE_GTE);
    }

    public SnmpTrapReceiverWhereInput authPassPhraseIn(List<String> authPassPhraseIn) {

        this.authPassPhraseIn = authPassPhraseIn;
        return this;
    }

    public SnmpTrapReceiverWhereInput addAuthPassPhraseInItem(String authPassPhraseInItem) {
        if (this.authPassPhraseIn == null) {
            this.authPassPhraseIn = new ArrayList<String>();
        }
        this.authPassPhraseIn.add(authPassPhraseInItem);
        return this;
    }

    /**
     * Get authPassPhraseIn
     *
     * @return authPassPhraseIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getAuthPassPhraseIn() {
        return authPassPhraseIn;
    }

    public void setAuthPassPhraseIn(List<String> authPassPhraseIn) {
        this.authPassPhraseIn = authPassPhraseIn;
    }

    public SnmpTrapReceiverWhereInput authPassPhraseIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_AUTH_PASS_PHRASE_IN);
        return this;
    }

    public SnmpTrapReceiverWhereInput authPassPhraseIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_AUTH_PASS_PHRASE_IN);
        return this;
    }

    public void setAuthPassPhraseIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_AUTH_PASS_PHRASE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_AUTH_PASS_PHRASE_IN);
        }
    }

    public boolean getAuthPassPhraseIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_AUTH_PASS_PHRASE_IN);
    }

    public SnmpTrapReceiverWhereInput authPassPhraseLt(String authPassPhraseLt) {

        this.authPassPhraseLt = authPassPhraseLt;
        return this;
    }

    /**
     * Get authPassPhraseLt
     *
     * @return authPassPhraseLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getAuthPassPhraseLt() {
        return authPassPhraseLt;
    }

    public void setAuthPassPhraseLt(String authPassPhraseLt) {
        this.authPassPhraseLt = authPassPhraseLt;
    }

    public SnmpTrapReceiverWhereInput authPassPhraseLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_AUTH_PASS_PHRASE_LT);
        return this;
    }

    public SnmpTrapReceiverWhereInput authPassPhraseLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_AUTH_PASS_PHRASE_LT);
        return this;
    }

    public void setAuthPassPhraseLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_AUTH_PASS_PHRASE_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_AUTH_PASS_PHRASE_LT);
        }
    }

    public boolean getAuthPassPhraseLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_AUTH_PASS_PHRASE_LT);
    }

    public SnmpTrapReceiverWhereInput authPassPhraseLte(String authPassPhraseLte) {

        this.authPassPhraseLte = authPassPhraseLte;
        return this;
    }

    /**
     * Get authPassPhraseLte
     *
     * @return authPassPhraseLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getAuthPassPhraseLte() {
        return authPassPhraseLte;
    }

    public void setAuthPassPhraseLte(String authPassPhraseLte) {
        this.authPassPhraseLte = authPassPhraseLte;
    }

    public SnmpTrapReceiverWhereInput authPassPhraseLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_AUTH_PASS_PHRASE_LTE);
        return this;
    }

    public SnmpTrapReceiverWhereInput authPassPhraseLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_AUTH_PASS_PHRASE_LTE);
        return this;
    }

    public void setAuthPassPhraseLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_AUTH_PASS_PHRASE_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_AUTH_PASS_PHRASE_LTE);
        }
    }

    public boolean getAuthPassPhraseLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_AUTH_PASS_PHRASE_LTE);
    }

    public SnmpTrapReceiverWhereInput authPassPhraseNot(String authPassPhraseNot) {

        this.authPassPhraseNot = authPassPhraseNot;
        return this;
    }

    /**
     * Get authPassPhraseNot
     *
     * @return authPassPhraseNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getAuthPassPhraseNot() {
        return authPassPhraseNot;
    }

    public void setAuthPassPhraseNot(String authPassPhraseNot) {
        this.authPassPhraseNot = authPassPhraseNot;
    }

    public SnmpTrapReceiverWhereInput authPassPhraseNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_AUTH_PASS_PHRASE_NOT);
        return this;
    }

    public SnmpTrapReceiverWhereInput authPassPhraseNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_AUTH_PASS_PHRASE_NOT);
        return this;
    }

    public void setAuthPassPhraseNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_AUTH_PASS_PHRASE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_AUTH_PASS_PHRASE_NOT);
        }
    }

    public boolean getAuthPassPhraseNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_AUTH_PASS_PHRASE_NOT);
    }

    public SnmpTrapReceiverWhereInput authPassPhraseNotContains(String authPassPhraseNotContains) {

        this.authPassPhraseNotContains = authPassPhraseNotContains;
        return this;
    }

    /**
     * Get authPassPhraseNotContains
     *
     * @return authPassPhraseNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getAuthPassPhraseNotContains() {
        return authPassPhraseNotContains;
    }

    public void setAuthPassPhraseNotContains(String authPassPhraseNotContains) {
        this.authPassPhraseNotContains = authPassPhraseNotContains;
    }

    public SnmpTrapReceiverWhereInput authPassPhraseNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_AUTH_PASS_PHRASE_NOT_CONTAINS);
        return this;
    }

    public SnmpTrapReceiverWhereInput authPassPhraseNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_AUTH_PASS_PHRASE_NOT_CONTAINS);
        return this;
    }

    public void setAuthPassPhraseNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_AUTH_PASS_PHRASE_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_AUTH_PASS_PHRASE_NOT_CONTAINS);
        }
    }

    public boolean getAuthPassPhraseNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_AUTH_PASS_PHRASE_NOT_CONTAINS);
    }

    public SnmpTrapReceiverWhereInput authPassPhraseNotEndsWith(String authPassPhraseNotEndsWith) {

        this.authPassPhraseNotEndsWith = authPassPhraseNotEndsWith;
        return this;
    }

    /**
     * Get authPassPhraseNotEndsWith
     *
     * @return authPassPhraseNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getAuthPassPhraseNotEndsWith() {
        return authPassPhraseNotEndsWith;
    }

    public void setAuthPassPhraseNotEndsWith(String authPassPhraseNotEndsWith) {
        this.authPassPhraseNotEndsWith = authPassPhraseNotEndsWith;
    }

    public SnmpTrapReceiverWhereInput authPassPhraseNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_AUTH_PASS_PHRASE_NOT_ENDS_WITH);
        return this;
    }

    public SnmpTrapReceiverWhereInput authPassPhraseNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_AUTH_PASS_PHRASE_NOT_ENDS_WITH);
        return this;
    }

    public void setAuthPassPhraseNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_AUTH_PASS_PHRASE_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_AUTH_PASS_PHRASE_NOT_ENDS_WITH);
        }
    }

    public boolean getAuthPassPhraseNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_AUTH_PASS_PHRASE_NOT_ENDS_WITH);
    }

    public SnmpTrapReceiverWhereInput authPassPhraseNotIn(List<String> authPassPhraseNotIn) {

        this.authPassPhraseNotIn = authPassPhraseNotIn;
        return this;
    }

    public SnmpTrapReceiverWhereInput addAuthPassPhraseNotInItem(String authPassPhraseNotInItem) {
        if (this.authPassPhraseNotIn == null) {
            this.authPassPhraseNotIn = new ArrayList<String>();
        }
        this.authPassPhraseNotIn.add(authPassPhraseNotInItem);
        return this;
    }

    /**
     * Get authPassPhraseNotIn
     *
     * @return authPassPhraseNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getAuthPassPhraseNotIn() {
        return authPassPhraseNotIn;
    }

    public void setAuthPassPhraseNotIn(List<String> authPassPhraseNotIn) {
        this.authPassPhraseNotIn = authPassPhraseNotIn;
    }

    public SnmpTrapReceiverWhereInput authPassPhraseNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_AUTH_PASS_PHRASE_NOT_IN);
        return this;
    }

    public SnmpTrapReceiverWhereInput authPassPhraseNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_AUTH_PASS_PHRASE_NOT_IN);
        return this;
    }

    public void setAuthPassPhraseNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_AUTH_PASS_PHRASE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_AUTH_PASS_PHRASE_NOT_IN);
        }
    }

    public boolean getAuthPassPhraseNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_AUTH_PASS_PHRASE_NOT_IN);
    }

    public SnmpTrapReceiverWhereInput authPassPhraseNotStartsWith(
            String authPassPhraseNotStartsWith) {

        this.authPassPhraseNotStartsWith = authPassPhraseNotStartsWith;
        return this;
    }

    /**
     * Get authPassPhraseNotStartsWith
     *
     * @return authPassPhraseNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getAuthPassPhraseNotStartsWith() {
        return authPassPhraseNotStartsWith;
    }

    public void setAuthPassPhraseNotStartsWith(String authPassPhraseNotStartsWith) {
        this.authPassPhraseNotStartsWith = authPassPhraseNotStartsWith;
    }

    public SnmpTrapReceiverWhereInput authPassPhraseNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_AUTH_PASS_PHRASE_NOT_STARTS_WITH);
        return this;
    }

    public SnmpTrapReceiverWhereInput authPassPhraseNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_AUTH_PASS_PHRASE_NOT_STARTS_WITH);
        return this;
    }

    public void setAuthPassPhraseNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_AUTH_PASS_PHRASE_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_AUTH_PASS_PHRASE_NOT_STARTS_WITH);
        }
    }

    public boolean getAuthPassPhraseNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_AUTH_PASS_PHRASE_NOT_STARTS_WITH);
    }

    public SnmpTrapReceiverWhereInput authPassPhraseStartsWith(String authPassPhraseStartsWith) {

        this.authPassPhraseStartsWith = authPassPhraseStartsWith;
        return this;
    }

    /**
     * Get authPassPhraseStartsWith
     *
     * @return authPassPhraseStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getAuthPassPhraseStartsWith() {
        return authPassPhraseStartsWith;
    }

    public void setAuthPassPhraseStartsWith(String authPassPhraseStartsWith) {
        this.authPassPhraseStartsWith = authPassPhraseStartsWith;
    }

    public SnmpTrapReceiverWhereInput authPassPhraseStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_AUTH_PASS_PHRASE_STARTS_WITH);
        return this;
    }

    public SnmpTrapReceiverWhereInput authPassPhraseStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_AUTH_PASS_PHRASE_STARTS_WITH);
        return this;
    }

    public void setAuthPassPhraseStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_AUTH_PASS_PHRASE_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_AUTH_PASS_PHRASE_STARTS_WITH);
        }
    }

    public boolean getAuthPassPhraseStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_AUTH_PASS_PHRASE_STARTS_WITH);
    }

    public SnmpTrapReceiverWhereInput authProtocol(SnmpAuthProtocol authProtocol) {

        this.authProtocol = authProtocol;
        return this;
    }

    /**
     * Get authProtocol
     *
     * @return authProtocol
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public SnmpAuthProtocol getAuthProtocol() {
        return authProtocol;
    }

    public void setAuthProtocol(SnmpAuthProtocol authProtocol) {
        this.authProtocol = authProtocol;
    }

    public SnmpTrapReceiverWhereInput authProtocol_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_AUTH_PROTOCOL);
        return this;
    }

    public SnmpTrapReceiverWhereInput authProtocol_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_AUTH_PROTOCOL);
        return this;
    }

    public void setAuthProtocol_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_AUTH_PROTOCOL);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_AUTH_PROTOCOL);
        }
    }

    public boolean getAuthProtocol_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_AUTH_PROTOCOL);
    }

    public SnmpTrapReceiverWhereInput authProtocolIn(List<SnmpAuthProtocol> authProtocolIn) {

        this.authProtocolIn = authProtocolIn;
        return this;
    }

    public SnmpTrapReceiverWhereInput addAuthProtocolInItem(SnmpAuthProtocol authProtocolInItem) {
        if (this.authProtocolIn == null) {
            this.authProtocolIn = new ArrayList<SnmpAuthProtocol>();
        }
        this.authProtocolIn.add(authProtocolInItem);
        return this;
    }

    /**
     * Get authProtocolIn
     *
     * @return authProtocolIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<SnmpAuthProtocol> getAuthProtocolIn() {
        return authProtocolIn;
    }

    public void setAuthProtocolIn(List<SnmpAuthProtocol> authProtocolIn) {
        this.authProtocolIn = authProtocolIn;
    }

    public SnmpTrapReceiverWhereInput authProtocolIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_AUTH_PROTOCOL_IN);
        return this;
    }

    public SnmpTrapReceiverWhereInput authProtocolIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_AUTH_PROTOCOL_IN);
        return this;
    }

    public void setAuthProtocolIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_AUTH_PROTOCOL_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_AUTH_PROTOCOL_IN);
        }
    }

    public boolean getAuthProtocolIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_AUTH_PROTOCOL_IN);
    }

    public SnmpTrapReceiverWhereInput authProtocolNot(SnmpAuthProtocol authProtocolNot) {

        this.authProtocolNot = authProtocolNot;
        return this;
    }

    /**
     * Get authProtocolNot
     *
     * @return authProtocolNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public SnmpAuthProtocol getAuthProtocolNot() {
        return authProtocolNot;
    }

    public void setAuthProtocolNot(SnmpAuthProtocol authProtocolNot) {
        this.authProtocolNot = authProtocolNot;
    }

    public SnmpTrapReceiverWhereInput authProtocolNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_AUTH_PROTOCOL_NOT);
        return this;
    }

    public SnmpTrapReceiverWhereInput authProtocolNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_AUTH_PROTOCOL_NOT);
        return this;
    }

    public void setAuthProtocolNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_AUTH_PROTOCOL_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_AUTH_PROTOCOL_NOT);
        }
    }

    public boolean getAuthProtocolNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_AUTH_PROTOCOL_NOT);
    }

    public SnmpTrapReceiverWhereInput authProtocolNotIn(List<SnmpAuthProtocol> authProtocolNotIn) {

        this.authProtocolNotIn = authProtocolNotIn;
        return this;
    }

    public SnmpTrapReceiverWhereInput addAuthProtocolNotInItem(
            SnmpAuthProtocol authProtocolNotInItem) {
        if (this.authProtocolNotIn == null) {
            this.authProtocolNotIn = new ArrayList<SnmpAuthProtocol>();
        }
        this.authProtocolNotIn.add(authProtocolNotInItem);
        return this;
    }

    /**
     * Get authProtocolNotIn
     *
     * @return authProtocolNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<SnmpAuthProtocol> getAuthProtocolNotIn() {
        return authProtocolNotIn;
    }

    public void setAuthProtocolNotIn(List<SnmpAuthProtocol> authProtocolNotIn) {
        this.authProtocolNotIn = authProtocolNotIn;
    }

    public SnmpTrapReceiverWhereInput authProtocolNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_AUTH_PROTOCOL_NOT_IN);
        return this;
    }

    public SnmpTrapReceiverWhereInput authProtocolNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_AUTH_PROTOCOL_NOT_IN);
        return this;
    }

    public void setAuthProtocolNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_AUTH_PROTOCOL_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_AUTH_PROTOCOL_NOT_IN);
        }
    }

    public boolean getAuthProtocolNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_AUTH_PROTOCOL_NOT_IN);
    }

    public SnmpTrapReceiverWhereInput cluster(ClusterWhereInput cluster) {

        this.cluster = cluster;
        return this;
    }

    /**
     * Get cluster
     *
     * @return cluster
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ClusterWhereInput getCluster() {
        return cluster;
    }

    public void setCluster(ClusterWhereInput cluster) {
        this.cluster = cluster;
    }

    public SnmpTrapReceiverWhereInput cluster_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER);
        return this;
    }

    public SnmpTrapReceiverWhereInput cluster_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLUSTER);
        return this;
    }

    public void setCluster_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLUSTER);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLUSTER);
        }
    }

    public boolean getCluster_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLUSTER);
    }

    public SnmpTrapReceiverWhereInput community(String community) {

        this.community = community;
        return this;
    }

    /**
     * Get community
     *
     * @return community
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community;
    }

    public SnmpTrapReceiverWhereInput community_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_COMMUNITY);
        return this;
    }

    public SnmpTrapReceiverWhereInput community_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_COMMUNITY);
        return this;
    }

    public void setCommunity_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_COMMUNITY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_COMMUNITY);
        }
    }

    public boolean getCommunity_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_COMMUNITY);
    }

    public SnmpTrapReceiverWhereInput communityContains(String communityContains) {

        this.communityContains = communityContains;
        return this;
    }

    /**
     * Get communityContains
     *
     * @return communityContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCommunityContains() {
        return communityContains;
    }

    public void setCommunityContains(String communityContains) {
        this.communityContains = communityContains;
    }

    public SnmpTrapReceiverWhereInput communityContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_COMMUNITY_CONTAINS);
        return this;
    }

    public SnmpTrapReceiverWhereInput communityContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_COMMUNITY_CONTAINS);
        return this;
    }

    public void setCommunityContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_COMMUNITY_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_COMMUNITY_CONTAINS);
        }
    }

    public boolean getCommunityContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_COMMUNITY_CONTAINS);
    }

    public SnmpTrapReceiverWhereInput communityEndsWith(String communityEndsWith) {

        this.communityEndsWith = communityEndsWith;
        return this;
    }

    /**
     * Get communityEndsWith
     *
     * @return communityEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCommunityEndsWith() {
        return communityEndsWith;
    }

    public void setCommunityEndsWith(String communityEndsWith) {
        this.communityEndsWith = communityEndsWith;
    }

    public SnmpTrapReceiverWhereInput communityEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_COMMUNITY_ENDS_WITH);
        return this;
    }

    public SnmpTrapReceiverWhereInput communityEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_COMMUNITY_ENDS_WITH);
        return this;
    }

    public void setCommunityEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_COMMUNITY_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_COMMUNITY_ENDS_WITH);
        }
    }

    public boolean getCommunityEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_COMMUNITY_ENDS_WITH);
    }

    public SnmpTrapReceiverWhereInput communityGt(String communityGt) {

        this.communityGt = communityGt;
        return this;
    }

    /**
     * Get communityGt
     *
     * @return communityGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCommunityGt() {
        return communityGt;
    }

    public void setCommunityGt(String communityGt) {
        this.communityGt = communityGt;
    }

    public SnmpTrapReceiverWhereInput communityGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_COMMUNITY_GT);
        return this;
    }

    public SnmpTrapReceiverWhereInput communityGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_COMMUNITY_GT);
        return this;
    }

    public void setCommunityGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_COMMUNITY_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_COMMUNITY_GT);
        }
    }

    public boolean getCommunityGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_COMMUNITY_GT);
    }

    public SnmpTrapReceiverWhereInput communityGte(String communityGte) {

        this.communityGte = communityGte;
        return this;
    }

    /**
     * Get communityGte
     *
     * @return communityGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCommunityGte() {
        return communityGte;
    }

    public void setCommunityGte(String communityGte) {
        this.communityGte = communityGte;
    }

    public SnmpTrapReceiverWhereInput communityGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_COMMUNITY_GTE);
        return this;
    }

    public SnmpTrapReceiverWhereInput communityGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_COMMUNITY_GTE);
        return this;
    }

    public void setCommunityGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_COMMUNITY_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_COMMUNITY_GTE);
        }
    }

    public boolean getCommunityGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_COMMUNITY_GTE);
    }

    public SnmpTrapReceiverWhereInput communityIn(List<String> communityIn) {

        this.communityIn = communityIn;
        return this;
    }

    public SnmpTrapReceiverWhereInput addCommunityInItem(String communityInItem) {
        if (this.communityIn == null) {
            this.communityIn = new ArrayList<String>();
        }
        this.communityIn.add(communityInItem);
        return this;
    }

    /**
     * Get communityIn
     *
     * @return communityIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getCommunityIn() {
        return communityIn;
    }

    public void setCommunityIn(List<String> communityIn) {
        this.communityIn = communityIn;
    }

    public SnmpTrapReceiverWhereInput communityIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_COMMUNITY_IN);
        return this;
    }

    public SnmpTrapReceiverWhereInput communityIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_COMMUNITY_IN);
        return this;
    }

    public void setCommunityIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_COMMUNITY_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_COMMUNITY_IN);
        }
    }

    public boolean getCommunityIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_COMMUNITY_IN);
    }

    public SnmpTrapReceiverWhereInput communityLt(String communityLt) {

        this.communityLt = communityLt;
        return this;
    }

    /**
     * Get communityLt
     *
     * @return communityLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCommunityLt() {
        return communityLt;
    }

    public void setCommunityLt(String communityLt) {
        this.communityLt = communityLt;
    }

    public SnmpTrapReceiverWhereInput communityLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_COMMUNITY_LT);
        return this;
    }

    public SnmpTrapReceiverWhereInput communityLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_COMMUNITY_LT);
        return this;
    }

    public void setCommunityLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_COMMUNITY_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_COMMUNITY_LT);
        }
    }

    public boolean getCommunityLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_COMMUNITY_LT);
    }

    public SnmpTrapReceiverWhereInput communityLte(String communityLte) {

        this.communityLte = communityLte;
        return this;
    }

    /**
     * Get communityLte
     *
     * @return communityLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCommunityLte() {
        return communityLte;
    }

    public void setCommunityLte(String communityLte) {
        this.communityLte = communityLte;
    }

    public SnmpTrapReceiverWhereInput communityLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_COMMUNITY_LTE);
        return this;
    }

    public SnmpTrapReceiverWhereInput communityLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_COMMUNITY_LTE);
        return this;
    }

    public void setCommunityLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_COMMUNITY_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_COMMUNITY_LTE);
        }
    }

    public boolean getCommunityLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_COMMUNITY_LTE);
    }

    public SnmpTrapReceiverWhereInput communityNot(String communityNot) {

        this.communityNot = communityNot;
        return this;
    }

    /**
     * Get communityNot
     *
     * @return communityNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCommunityNot() {
        return communityNot;
    }

    public void setCommunityNot(String communityNot) {
        this.communityNot = communityNot;
    }

    public SnmpTrapReceiverWhereInput communityNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_COMMUNITY_NOT);
        return this;
    }

    public SnmpTrapReceiverWhereInput communityNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_COMMUNITY_NOT);
        return this;
    }

    public void setCommunityNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_COMMUNITY_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_COMMUNITY_NOT);
        }
    }

    public boolean getCommunityNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_COMMUNITY_NOT);
    }

    public SnmpTrapReceiverWhereInput communityNotContains(String communityNotContains) {

        this.communityNotContains = communityNotContains;
        return this;
    }

    /**
     * Get communityNotContains
     *
     * @return communityNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCommunityNotContains() {
        return communityNotContains;
    }

    public void setCommunityNotContains(String communityNotContains) {
        this.communityNotContains = communityNotContains;
    }

    public SnmpTrapReceiverWhereInput communityNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_COMMUNITY_NOT_CONTAINS);
        return this;
    }

    public SnmpTrapReceiverWhereInput communityNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_COMMUNITY_NOT_CONTAINS);
        return this;
    }

    public void setCommunityNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_COMMUNITY_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_COMMUNITY_NOT_CONTAINS);
        }
    }

    public boolean getCommunityNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_COMMUNITY_NOT_CONTAINS);
    }

    public SnmpTrapReceiverWhereInput communityNotEndsWith(String communityNotEndsWith) {

        this.communityNotEndsWith = communityNotEndsWith;
        return this;
    }

    /**
     * Get communityNotEndsWith
     *
     * @return communityNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCommunityNotEndsWith() {
        return communityNotEndsWith;
    }

    public void setCommunityNotEndsWith(String communityNotEndsWith) {
        this.communityNotEndsWith = communityNotEndsWith;
    }

    public SnmpTrapReceiverWhereInput communityNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_COMMUNITY_NOT_ENDS_WITH);
        return this;
    }

    public SnmpTrapReceiverWhereInput communityNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_COMMUNITY_NOT_ENDS_WITH);
        return this;
    }

    public void setCommunityNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_COMMUNITY_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_COMMUNITY_NOT_ENDS_WITH);
        }
    }

    public boolean getCommunityNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_COMMUNITY_NOT_ENDS_WITH);
    }

    public SnmpTrapReceiverWhereInput communityNotIn(List<String> communityNotIn) {

        this.communityNotIn = communityNotIn;
        return this;
    }

    public SnmpTrapReceiverWhereInput addCommunityNotInItem(String communityNotInItem) {
        if (this.communityNotIn == null) {
            this.communityNotIn = new ArrayList<String>();
        }
        this.communityNotIn.add(communityNotInItem);
        return this;
    }

    /**
     * Get communityNotIn
     *
     * @return communityNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getCommunityNotIn() {
        return communityNotIn;
    }

    public void setCommunityNotIn(List<String> communityNotIn) {
        this.communityNotIn = communityNotIn;
    }

    public SnmpTrapReceiverWhereInput communityNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_COMMUNITY_NOT_IN);
        return this;
    }

    public SnmpTrapReceiverWhereInput communityNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_COMMUNITY_NOT_IN);
        return this;
    }

    public void setCommunityNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_COMMUNITY_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_COMMUNITY_NOT_IN);
        }
    }

    public boolean getCommunityNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_COMMUNITY_NOT_IN);
    }

    public SnmpTrapReceiverWhereInput communityNotStartsWith(String communityNotStartsWith) {

        this.communityNotStartsWith = communityNotStartsWith;
        return this;
    }

    /**
     * Get communityNotStartsWith
     *
     * @return communityNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCommunityNotStartsWith() {
        return communityNotStartsWith;
    }

    public void setCommunityNotStartsWith(String communityNotStartsWith) {
        this.communityNotStartsWith = communityNotStartsWith;
    }

    public SnmpTrapReceiverWhereInput communityNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_COMMUNITY_NOT_STARTS_WITH);
        return this;
    }

    public SnmpTrapReceiverWhereInput communityNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_COMMUNITY_NOT_STARTS_WITH);
        return this;
    }

    public void setCommunityNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_COMMUNITY_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_COMMUNITY_NOT_STARTS_WITH);
        }
    }

    public boolean getCommunityNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_COMMUNITY_NOT_STARTS_WITH);
    }

    public SnmpTrapReceiverWhereInput communityStartsWith(String communityStartsWith) {

        this.communityStartsWith = communityStartsWith;
        return this;
    }

    /**
     * Get communityStartsWith
     *
     * @return communityStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCommunityStartsWith() {
        return communityStartsWith;
    }

    public void setCommunityStartsWith(String communityStartsWith) {
        this.communityStartsWith = communityStartsWith;
    }

    public SnmpTrapReceiverWhereInput communityStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_COMMUNITY_STARTS_WITH);
        return this;
    }

    public SnmpTrapReceiverWhereInput communityStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_COMMUNITY_STARTS_WITH);
        return this;
    }

    public void setCommunityStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_COMMUNITY_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_COMMUNITY_STARTS_WITH);
        }
    }

    public boolean getCommunityStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_COMMUNITY_STARTS_WITH);
    }

    public SnmpTrapReceiverWhereInput disabled(Boolean disabled) {

        this.disabled = disabled;
        return this;
    }

    /**
     * Get disabled
     *
     * @return disabled
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getDisabled() {
        return disabled;
    }

    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    public SnmpTrapReceiverWhereInput disabled_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISABLED);
        return this;
    }

    public SnmpTrapReceiverWhereInput disabled_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DISABLED);
        return this;
    }

    public void setDisabled_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DISABLED);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DISABLED);
        }
    }

    public boolean getDisabled_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DISABLED);
    }

    public SnmpTrapReceiverWhereInput disabledNot(Boolean disabledNot) {

        this.disabledNot = disabledNot;
        return this;
    }

    /**
     * Get disabledNot
     *
     * @return disabledNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getDisabledNot() {
        return disabledNot;
    }

    public void setDisabledNot(Boolean disabledNot) {
        this.disabledNot = disabledNot;
    }

    public SnmpTrapReceiverWhereInput disabledNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISABLED_NOT);
        return this;
    }

    public SnmpTrapReceiverWhereInput disabledNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DISABLED_NOT);
        return this;
    }

    public void setDisabledNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DISABLED_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DISABLED_NOT);
        }
    }

    public boolean getDisabledNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DISABLED_NOT);
    }

    public SnmpTrapReceiverWhereInput engineId(String engineId) {

        this.engineId = engineId;
        return this;
    }

    /**
     * Get engineId
     *
     * @return engineId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getEngineId() {
        return engineId;
    }

    public void setEngineId(String engineId) {
        this.engineId = engineId;
    }

    public SnmpTrapReceiverWhereInput engineId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENGINE_ID);
        return this;
    }

    public SnmpTrapReceiverWhereInput engineId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ENGINE_ID);
        return this;
    }

    public void setEngineId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ENGINE_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ENGINE_ID);
        }
    }

    public boolean getEngineId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ENGINE_ID);
    }

    public SnmpTrapReceiverWhereInput engineIdContains(String engineIdContains) {

        this.engineIdContains = engineIdContains;
        return this;
    }

    /**
     * Get engineIdContains
     *
     * @return engineIdContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getEngineIdContains() {
        return engineIdContains;
    }

    public void setEngineIdContains(String engineIdContains) {
        this.engineIdContains = engineIdContains;
    }

    public SnmpTrapReceiverWhereInput engineIdContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENGINE_ID_CONTAINS);
        return this;
    }

    public SnmpTrapReceiverWhereInput engineIdContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ENGINE_ID_CONTAINS);
        return this;
    }

    public void setEngineIdContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ENGINE_ID_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ENGINE_ID_CONTAINS);
        }
    }

    public boolean getEngineIdContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ENGINE_ID_CONTAINS);
    }

    public SnmpTrapReceiverWhereInput engineIdEndsWith(String engineIdEndsWith) {

        this.engineIdEndsWith = engineIdEndsWith;
        return this;
    }

    /**
     * Get engineIdEndsWith
     *
     * @return engineIdEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getEngineIdEndsWith() {
        return engineIdEndsWith;
    }

    public void setEngineIdEndsWith(String engineIdEndsWith) {
        this.engineIdEndsWith = engineIdEndsWith;
    }

    public SnmpTrapReceiverWhereInput engineIdEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENGINE_ID_ENDS_WITH);
        return this;
    }

    public SnmpTrapReceiverWhereInput engineIdEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ENGINE_ID_ENDS_WITH);
        return this;
    }

    public void setEngineIdEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ENGINE_ID_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ENGINE_ID_ENDS_WITH);
        }
    }

    public boolean getEngineIdEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ENGINE_ID_ENDS_WITH);
    }

    public SnmpTrapReceiverWhereInput engineIdGt(String engineIdGt) {

        this.engineIdGt = engineIdGt;
        return this;
    }

    /**
     * Get engineIdGt
     *
     * @return engineIdGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getEngineIdGt() {
        return engineIdGt;
    }

    public void setEngineIdGt(String engineIdGt) {
        this.engineIdGt = engineIdGt;
    }

    public SnmpTrapReceiverWhereInput engineIdGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENGINE_ID_GT);
        return this;
    }

    public SnmpTrapReceiverWhereInput engineIdGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ENGINE_ID_GT);
        return this;
    }

    public void setEngineIdGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ENGINE_ID_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ENGINE_ID_GT);
        }
    }

    public boolean getEngineIdGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ENGINE_ID_GT);
    }

    public SnmpTrapReceiverWhereInput engineIdGte(String engineIdGte) {

        this.engineIdGte = engineIdGte;
        return this;
    }

    /**
     * Get engineIdGte
     *
     * @return engineIdGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getEngineIdGte() {
        return engineIdGte;
    }

    public void setEngineIdGte(String engineIdGte) {
        this.engineIdGte = engineIdGte;
    }

    public SnmpTrapReceiverWhereInput engineIdGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENGINE_ID_GTE);
        return this;
    }

    public SnmpTrapReceiverWhereInput engineIdGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ENGINE_ID_GTE);
        return this;
    }

    public void setEngineIdGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ENGINE_ID_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ENGINE_ID_GTE);
        }
    }

    public boolean getEngineIdGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ENGINE_ID_GTE);
    }

    public SnmpTrapReceiverWhereInput engineIdIn(List<String> engineIdIn) {

        this.engineIdIn = engineIdIn;
        return this;
    }

    public SnmpTrapReceiverWhereInput addEngineIdInItem(String engineIdInItem) {
        if (this.engineIdIn == null) {
            this.engineIdIn = new ArrayList<String>();
        }
        this.engineIdIn.add(engineIdInItem);
        return this;
    }

    /**
     * Get engineIdIn
     *
     * @return engineIdIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getEngineIdIn() {
        return engineIdIn;
    }

    public void setEngineIdIn(List<String> engineIdIn) {
        this.engineIdIn = engineIdIn;
    }

    public SnmpTrapReceiverWhereInput engineIdIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENGINE_ID_IN);
        return this;
    }

    public SnmpTrapReceiverWhereInput engineIdIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ENGINE_ID_IN);
        return this;
    }

    public void setEngineIdIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ENGINE_ID_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ENGINE_ID_IN);
        }
    }

    public boolean getEngineIdIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ENGINE_ID_IN);
    }

    public SnmpTrapReceiverWhereInput engineIdLt(String engineIdLt) {

        this.engineIdLt = engineIdLt;
        return this;
    }

    /**
     * Get engineIdLt
     *
     * @return engineIdLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getEngineIdLt() {
        return engineIdLt;
    }

    public void setEngineIdLt(String engineIdLt) {
        this.engineIdLt = engineIdLt;
    }

    public SnmpTrapReceiverWhereInput engineIdLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENGINE_ID_LT);
        return this;
    }

    public SnmpTrapReceiverWhereInput engineIdLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ENGINE_ID_LT);
        return this;
    }

    public void setEngineIdLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ENGINE_ID_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ENGINE_ID_LT);
        }
    }

    public boolean getEngineIdLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ENGINE_ID_LT);
    }

    public SnmpTrapReceiverWhereInput engineIdLte(String engineIdLte) {

        this.engineIdLte = engineIdLte;
        return this;
    }

    /**
     * Get engineIdLte
     *
     * @return engineIdLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getEngineIdLte() {
        return engineIdLte;
    }

    public void setEngineIdLte(String engineIdLte) {
        this.engineIdLte = engineIdLte;
    }

    public SnmpTrapReceiverWhereInput engineIdLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENGINE_ID_LTE);
        return this;
    }

    public SnmpTrapReceiverWhereInput engineIdLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ENGINE_ID_LTE);
        return this;
    }

    public void setEngineIdLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ENGINE_ID_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ENGINE_ID_LTE);
        }
    }

    public boolean getEngineIdLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ENGINE_ID_LTE);
    }

    public SnmpTrapReceiverWhereInput engineIdNot(String engineIdNot) {

        this.engineIdNot = engineIdNot;
        return this;
    }

    /**
     * Get engineIdNot
     *
     * @return engineIdNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getEngineIdNot() {
        return engineIdNot;
    }

    public void setEngineIdNot(String engineIdNot) {
        this.engineIdNot = engineIdNot;
    }

    public SnmpTrapReceiverWhereInput engineIdNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENGINE_ID_NOT);
        return this;
    }

    public SnmpTrapReceiverWhereInput engineIdNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ENGINE_ID_NOT);
        return this;
    }

    public void setEngineIdNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ENGINE_ID_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ENGINE_ID_NOT);
        }
    }

    public boolean getEngineIdNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ENGINE_ID_NOT);
    }

    public SnmpTrapReceiverWhereInput engineIdNotContains(String engineIdNotContains) {

        this.engineIdNotContains = engineIdNotContains;
        return this;
    }

    /**
     * Get engineIdNotContains
     *
     * @return engineIdNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getEngineIdNotContains() {
        return engineIdNotContains;
    }

    public void setEngineIdNotContains(String engineIdNotContains) {
        this.engineIdNotContains = engineIdNotContains;
    }

    public SnmpTrapReceiverWhereInput engineIdNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENGINE_ID_NOT_CONTAINS);
        return this;
    }

    public SnmpTrapReceiverWhereInput engineIdNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ENGINE_ID_NOT_CONTAINS);
        return this;
    }

    public void setEngineIdNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ENGINE_ID_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ENGINE_ID_NOT_CONTAINS);
        }
    }

    public boolean getEngineIdNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ENGINE_ID_NOT_CONTAINS);
    }

    public SnmpTrapReceiverWhereInput engineIdNotEndsWith(String engineIdNotEndsWith) {

        this.engineIdNotEndsWith = engineIdNotEndsWith;
        return this;
    }

    /**
     * Get engineIdNotEndsWith
     *
     * @return engineIdNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getEngineIdNotEndsWith() {
        return engineIdNotEndsWith;
    }

    public void setEngineIdNotEndsWith(String engineIdNotEndsWith) {
        this.engineIdNotEndsWith = engineIdNotEndsWith;
    }

    public SnmpTrapReceiverWhereInput engineIdNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENGINE_ID_NOT_ENDS_WITH);
        return this;
    }

    public SnmpTrapReceiverWhereInput engineIdNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ENGINE_ID_NOT_ENDS_WITH);
        return this;
    }

    public void setEngineIdNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ENGINE_ID_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ENGINE_ID_NOT_ENDS_WITH);
        }
    }

    public boolean getEngineIdNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ENGINE_ID_NOT_ENDS_WITH);
    }

    public SnmpTrapReceiverWhereInput engineIdNotIn(List<String> engineIdNotIn) {

        this.engineIdNotIn = engineIdNotIn;
        return this;
    }

    public SnmpTrapReceiverWhereInput addEngineIdNotInItem(String engineIdNotInItem) {
        if (this.engineIdNotIn == null) {
            this.engineIdNotIn = new ArrayList<String>();
        }
        this.engineIdNotIn.add(engineIdNotInItem);
        return this;
    }

    /**
     * Get engineIdNotIn
     *
     * @return engineIdNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getEngineIdNotIn() {
        return engineIdNotIn;
    }

    public void setEngineIdNotIn(List<String> engineIdNotIn) {
        this.engineIdNotIn = engineIdNotIn;
    }

    public SnmpTrapReceiverWhereInput engineIdNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENGINE_ID_NOT_IN);
        return this;
    }

    public SnmpTrapReceiverWhereInput engineIdNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ENGINE_ID_NOT_IN);
        return this;
    }

    public void setEngineIdNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ENGINE_ID_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ENGINE_ID_NOT_IN);
        }
    }

    public boolean getEngineIdNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ENGINE_ID_NOT_IN);
    }

    public SnmpTrapReceiverWhereInput engineIdNotStartsWith(String engineIdNotStartsWith) {

        this.engineIdNotStartsWith = engineIdNotStartsWith;
        return this;
    }

    /**
     * Get engineIdNotStartsWith
     *
     * @return engineIdNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getEngineIdNotStartsWith() {
        return engineIdNotStartsWith;
    }

    public void setEngineIdNotStartsWith(String engineIdNotStartsWith) {
        this.engineIdNotStartsWith = engineIdNotStartsWith;
    }

    public SnmpTrapReceiverWhereInput engineIdNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENGINE_ID_NOT_STARTS_WITH);
        return this;
    }

    public SnmpTrapReceiverWhereInput engineIdNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ENGINE_ID_NOT_STARTS_WITH);
        return this;
    }

    public void setEngineIdNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ENGINE_ID_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ENGINE_ID_NOT_STARTS_WITH);
        }
    }

    public boolean getEngineIdNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ENGINE_ID_NOT_STARTS_WITH);
    }

    public SnmpTrapReceiverWhereInput engineIdStartsWith(String engineIdStartsWith) {

        this.engineIdStartsWith = engineIdStartsWith;
        return this;
    }

    /**
     * Get engineIdStartsWith
     *
     * @return engineIdStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getEngineIdStartsWith() {
        return engineIdStartsWith;
    }

    public void setEngineIdStartsWith(String engineIdStartsWith) {
        this.engineIdStartsWith = engineIdStartsWith;
    }

    public SnmpTrapReceiverWhereInput engineIdStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENGINE_ID_STARTS_WITH);
        return this;
    }

    public SnmpTrapReceiverWhereInput engineIdStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ENGINE_ID_STARTS_WITH);
        return this;
    }

    public void setEngineIdStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ENGINE_ID_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ENGINE_ID_STARTS_WITH);
        }
    }

    public boolean getEngineIdStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ENGINE_ID_STARTS_WITH);
    }

    public SnmpTrapReceiverWhereInput entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {

        this.entityAsyncStatus = entityAsyncStatus;
        return this;
    }

    /**
     * Get entityAsyncStatus
     *
     * @return entityAsyncStatus
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public EntityAsyncStatus getEntityAsyncStatus() {
        return entityAsyncStatus;
    }

    public void setEntityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {
        this.entityAsyncStatus = entityAsyncStatus;
    }

    public SnmpTrapReceiverWhereInput entityAsyncStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        return this;
    }

    public SnmpTrapReceiverWhereInput entityAsyncStatus_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        return this;
    }

    public void setEntityAsyncStatus_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        }
    }

    public boolean getEntityAsyncStatus_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
    }

    public SnmpTrapReceiverWhereInput entityAsyncStatusIn(
            List<EntityAsyncStatus> entityAsyncStatusIn) {

        this.entityAsyncStatusIn = entityAsyncStatusIn;
        return this;
    }

    public SnmpTrapReceiverWhereInput addEntityAsyncStatusInItem(
            EntityAsyncStatus entityAsyncStatusInItem) {
        if (this.entityAsyncStatusIn == null) {
            this.entityAsyncStatusIn = new ArrayList<EntityAsyncStatus>();
        }
        this.entityAsyncStatusIn.add(entityAsyncStatusInItem);
        return this;
    }

    /**
     * Get entityAsyncStatusIn
     *
     * @return entityAsyncStatusIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<EntityAsyncStatus> getEntityAsyncStatusIn() {
        return entityAsyncStatusIn;
    }

    public void setEntityAsyncStatusIn(List<EntityAsyncStatus> entityAsyncStatusIn) {
        this.entityAsyncStatusIn = entityAsyncStatusIn;
    }

    public SnmpTrapReceiverWhereInput entityAsyncStatusIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_IN);
        return this;
    }

    public SnmpTrapReceiverWhereInput entityAsyncStatusIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_IN);
        return this;
    }

    public void setEntityAsyncStatusIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_IN);
        }
    }

    public boolean getEntityAsyncStatusIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_IN);
    }

    public SnmpTrapReceiverWhereInput entityAsyncStatusNot(EntityAsyncStatus entityAsyncStatusNot) {

        this.entityAsyncStatusNot = entityAsyncStatusNot;
        return this;
    }

    /**
     * Get entityAsyncStatusNot
     *
     * @return entityAsyncStatusNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public EntityAsyncStatus getEntityAsyncStatusNot() {
        return entityAsyncStatusNot;
    }

    public void setEntityAsyncStatusNot(EntityAsyncStatus entityAsyncStatusNot) {
        this.entityAsyncStatusNot = entityAsyncStatusNot;
    }

    public SnmpTrapReceiverWhereInput entityAsyncStatusNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT);
        return this;
    }

    public SnmpTrapReceiverWhereInput entityAsyncStatusNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT);
        return this;
    }

    public void setEntityAsyncStatusNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT);
        }
    }

    public boolean getEntityAsyncStatusNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT);
    }

    public SnmpTrapReceiverWhereInput entityAsyncStatusNotIn(
            List<EntityAsyncStatus> entityAsyncStatusNotIn) {

        this.entityAsyncStatusNotIn = entityAsyncStatusNotIn;
        return this;
    }

    public SnmpTrapReceiverWhereInput addEntityAsyncStatusNotInItem(
            EntityAsyncStatus entityAsyncStatusNotInItem) {
        if (this.entityAsyncStatusNotIn == null) {
            this.entityAsyncStatusNotIn = new ArrayList<EntityAsyncStatus>();
        }
        this.entityAsyncStatusNotIn.add(entityAsyncStatusNotInItem);
        return this;
    }

    /**
     * Get entityAsyncStatusNotIn
     *
     * @return entityAsyncStatusNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<EntityAsyncStatus> getEntityAsyncStatusNotIn() {
        return entityAsyncStatusNotIn;
    }

    public void setEntityAsyncStatusNotIn(List<EntityAsyncStatus> entityAsyncStatusNotIn) {
        this.entityAsyncStatusNotIn = entityAsyncStatusNotIn;
    }

    public SnmpTrapReceiverWhereInput entityAsyncStatusNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT_IN);
        return this;
    }

    public SnmpTrapReceiverWhereInput entityAsyncStatusNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT_IN);
        return this;
    }

    public void setEntityAsyncStatusNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT_IN);
        }
    }

    public boolean getEntityAsyncStatusNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT_IN);
    }

    public SnmpTrapReceiverWhereInput host(String host) {

        this.host = host;
        return this;
    }

    /**
     * Get host
     *
     * @return host
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public SnmpTrapReceiverWhereInput host_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOST);
        return this;
    }

    public SnmpTrapReceiverWhereInput host_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HOST);
        return this;
    }

    public void setHost_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HOST);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HOST);
        }
    }

    public boolean getHost_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HOST);
    }

    public SnmpTrapReceiverWhereInput hostContains(String hostContains) {

        this.hostContains = hostContains;
        return this;
    }

    /**
     * Get hostContains
     *
     * @return hostContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getHostContains() {
        return hostContains;
    }

    public void setHostContains(String hostContains) {
        this.hostContains = hostContains;
    }

    public SnmpTrapReceiverWhereInput hostContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOST_CONTAINS);
        return this;
    }

    public SnmpTrapReceiverWhereInput hostContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HOST_CONTAINS);
        return this;
    }

    public void setHostContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HOST_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HOST_CONTAINS);
        }
    }

    public boolean getHostContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HOST_CONTAINS);
    }

    public SnmpTrapReceiverWhereInput hostEndsWith(String hostEndsWith) {

        this.hostEndsWith = hostEndsWith;
        return this;
    }

    /**
     * Get hostEndsWith
     *
     * @return hostEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getHostEndsWith() {
        return hostEndsWith;
    }

    public void setHostEndsWith(String hostEndsWith) {
        this.hostEndsWith = hostEndsWith;
    }

    public SnmpTrapReceiverWhereInput hostEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOST_ENDS_WITH);
        return this;
    }

    public SnmpTrapReceiverWhereInput hostEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HOST_ENDS_WITH);
        return this;
    }

    public void setHostEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HOST_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HOST_ENDS_WITH);
        }
    }

    public boolean getHostEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HOST_ENDS_WITH);
    }

    public SnmpTrapReceiverWhereInput hostGt(String hostGt) {

        this.hostGt = hostGt;
        return this;
    }

    /**
     * Get hostGt
     *
     * @return hostGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getHostGt() {
        return hostGt;
    }

    public void setHostGt(String hostGt) {
        this.hostGt = hostGt;
    }

    public SnmpTrapReceiverWhereInput hostGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOST_GT);
        return this;
    }

    public SnmpTrapReceiverWhereInput hostGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HOST_GT);
        return this;
    }

    public void setHostGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HOST_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HOST_GT);
        }
    }

    public boolean getHostGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HOST_GT);
    }

    public SnmpTrapReceiverWhereInput hostGte(String hostGte) {

        this.hostGte = hostGte;
        return this;
    }

    /**
     * Get hostGte
     *
     * @return hostGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getHostGte() {
        return hostGte;
    }

    public void setHostGte(String hostGte) {
        this.hostGte = hostGte;
    }

    public SnmpTrapReceiverWhereInput hostGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOST_GTE);
        return this;
    }

    public SnmpTrapReceiverWhereInput hostGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HOST_GTE);
        return this;
    }

    public void setHostGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HOST_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HOST_GTE);
        }
    }

    public boolean getHostGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HOST_GTE);
    }

    public SnmpTrapReceiverWhereInput hostIn(List<String> hostIn) {

        this.hostIn = hostIn;
        return this;
    }

    public SnmpTrapReceiverWhereInput addHostInItem(String hostInItem) {
        if (this.hostIn == null) {
            this.hostIn = new ArrayList<String>();
        }
        this.hostIn.add(hostInItem);
        return this;
    }

    /**
     * Get hostIn
     *
     * @return hostIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getHostIn() {
        return hostIn;
    }

    public void setHostIn(List<String> hostIn) {
        this.hostIn = hostIn;
    }

    public SnmpTrapReceiverWhereInput hostIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOST_IN);
        return this;
    }

    public SnmpTrapReceiverWhereInput hostIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HOST_IN);
        return this;
    }

    public void setHostIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HOST_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HOST_IN);
        }
    }

    public boolean getHostIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HOST_IN);
    }

    public SnmpTrapReceiverWhereInput hostLt(String hostLt) {

        this.hostLt = hostLt;
        return this;
    }

    /**
     * Get hostLt
     *
     * @return hostLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getHostLt() {
        return hostLt;
    }

    public void setHostLt(String hostLt) {
        this.hostLt = hostLt;
    }

    public SnmpTrapReceiverWhereInput hostLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOST_LT);
        return this;
    }

    public SnmpTrapReceiverWhereInput hostLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HOST_LT);
        return this;
    }

    public void setHostLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HOST_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HOST_LT);
        }
    }

    public boolean getHostLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HOST_LT);
    }

    public SnmpTrapReceiverWhereInput hostLte(String hostLte) {

        this.hostLte = hostLte;
        return this;
    }

    /**
     * Get hostLte
     *
     * @return hostLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getHostLte() {
        return hostLte;
    }

    public void setHostLte(String hostLte) {
        this.hostLte = hostLte;
    }

    public SnmpTrapReceiverWhereInput hostLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOST_LTE);
        return this;
    }

    public SnmpTrapReceiverWhereInput hostLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HOST_LTE);
        return this;
    }

    public void setHostLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HOST_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HOST_LTE);
        }
    }

    public boolean getHostLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HOST_LTE);
    }

    public SnmpTrapReceiverWhereInput hostNot(String hostNot) {

        this.hostNot = hostNot;
        return this;
    }

    /**
     * Get hostNot
     *
     * @return hostNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getHostNot() {
        return hostNot;
    }

    public void setHostNot(String hostNot) {
        this.hostNot = hostNot;
    }

    public SnmpTrapReceiverWhereInput hostNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOST_NOT);
        return this;
    }

    public SnmpTrapReceiverWhereInput hostNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HOST_NOT);
        return this;
    }

    public void setHostNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HOST_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HOST_NOT);
        }
    }

    public boolean getHostNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HOST_NOT);
    }

    public SnmpTrapReceiverWhereInput hostNotContains(String hostNotContains) {

        this.hostNotContains = hostNotContains;
        return this;
    }

    /**
     * Get hostNotContains
     *
     * @return hostNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getHostNotContains() {
        return hostNotContains;
    }

    public void setHostNotContains(String hostNotContains) {
        this.hostNotContains = hostNotContains;
    }

    public SnmpTrapReceiverWhereInput hostNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOST_NOT_CONTAINS);
        return this;
    }

    public SnmpTrapReceiverWhereInput hostNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HOST_NOT_CONTAINS);
        return this;
    }

    public void setHostNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HOST_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HOST_NOT_CONTAINS);
        }
    }

    public boolean getHostNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HOST_NOT_CONTAINS);
    }

    public SnmpTrapReceiverWhereInput hostNotEndsWith(String hostNotEndsWith) {

        this.hostNotEndsWith = hostNotEndsWith;
        return this;
    }

    /**
     * Get hostNotEndsWith
     *
     * @return hostNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getHostNotEndsWith() {
        return hostNotEndsWith;
    }

    public void setHostNotEndsWith(String hostNotEndsWith) {
        this.hostNotEndsWith = hostNotEndsWith;
    }

    public SnmpTrapReceiverWhereInput hostNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOST_NOT_ENDS_WITH);
        return this;
    }

    public SnmpTrapReceiverWhereInput hostNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HOST_NOT_ENDS_WITH);
        return this;
    }

    public void setHostNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HOST_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HOST_NOT_ENDS_WITH);
        }
    }

    public boolean getHostNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HOST_NOT_ENDS_WITH);
    }

    public SnmpTrapReceiverWhereInput hostNotIn(List<String> hostNotIn) {

        this.hostNotIn = hostNotIn;
        return this;
    }

    public SnmpTrapReceiverWhereInput addHostNotInItem(String hostNotInItem) {
        if (this.hostNotIn == null) {
            this.hostNotIn = new ArrayList<String>();
        }
        this.hostNotIn.add(hostNotInItem);
        return this;
    }

    /**
     * Get hostNotIn
     *
     * @return hostNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getHostNotIn() {
        return hostNotIn;
    }

    public void setHostNotIn(List<String> hostNotIn) {
        this.hostNotIn = hostNotIn;
    }

    public SnmpTrapReceiverWhereInput hostNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOST_NOT_IN);
        return this;
    }

    public SnmpTrapReceiverWhereInput hostNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HOST_NOT_IN);
        return this;
    }

    public void setHostNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HOST_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HOST_NOT_IN);
        }
    }

    public boolean getHostNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HOST_NOT_IN);
    }

    public SnmpTrapReceiverWhereInput hostNotStartsWith(String hostNotStartsWith) {

        this.hostNotStartsWith = hostNotStartsWith;
        return this;
    }

    /**
     * Get hostNotStartsWith
     *
     * @return hostNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getHostNotStartsWith() {
        return hostNotStartsWith;
    }

    public void setHostNotStartsWith(String hostNotStartsWith) {
        this.hostNotStartsWith = hostNotStartsWith;
    }

    public SnmpTrapReceiverWhereInput hostNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOST_NOT_STARTS_WITH);
        return this;
    }

    public SnmpTrapReceiverWhereInput hostNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HOST_NOT_STARTS_WITH);
        return this;
    }

    public void setHostNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HOST_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HOST_NOT_STARTS_WITH);
        }
    }

    public boolean getHostNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HOST_NOT_STARTS_WITH);
    }

    public SnmpTrapReceiverWhereInput hostStartsWith(String hostStartsWith) {

        this.hostStartsWith = hostStartsWith;
        return this;
    }

    /**
     * Get hostStartsWith
     *
     * @return hostStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getHostStartsWith() {
        return hostStartsWith;
    }

    public void setHostStartsWith(String hostStartsWith) {
        this.hostStartsWith = hostStartsWith;
    }

    public SnmpTrapReceiverWhereInput hostStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOST_STARTS_WITH);
        return this;
    }

    public SnmpTrapReceiverWhereInput hostStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HOST_STARTS_WITH);
        return this;
    }

    public void setHostStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HOST_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HOST_STARTS_WITH);
        }
    }

    public boolean getHostStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HOST_STARTS_WITH);
    }

    public SnmpTrapReceiverWhereInput id(String id) {

        this.id = id;
        return this;
    }

    /**
     * Get id
     *
     * @return id
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public SnmpTrapReceiverWhereInput id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public SnmpTrapReceiverWhereInput id_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID);
        return this;
    }

    public void setId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID);
        }
    }

    public boolean getId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID);
    }

    public SnmpTrapReceiverWhereInput idContains(String idContains) {

        this.idContains = idContains;
        return this;
    }

    /**
     * Get idContains
     *
     * @return idContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIdContains() {
        return idContains;
    }

    public void setIdContains(String idContains) {
        this.idContains = idContains;
    }

    public SnmpTrapReceiverWhereInput idContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_CONTAINS);
        return this;
    }

    public SnmpTrapReceiverWhereInput idContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_CONTAINS);
        return this;
    }

    public void setIdContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_CONTAINS);
        }
    }

    public boolean getIdContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_CONTAINS);
    }

    public SnmpTrapReceiverWhereInput idEndsWith(String idEndsWith) {

        this.idEndsWith = idEndsWith;
        return this;
    }

    /**
     * Get idEndsWith
     *
     * @return idEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIdEndsWith() {
        return idEndsWith;
    }

    public void setIdEndsWith(String idEndsWith) {
        this.idEndsWith = idEndsWith;
    }

    public SnmpTrapReceiverWhereInput idEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_ENDS_WITH);
        return this;
    }

    public SnmpTrapReceiverWhereInput idEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_ENDS_WITH);
        return this;
    }

    public void setIdEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_ENDS_WITH);
        }
    }

    public boolean getIdEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_ENDS_WITH);
    }

    public SnmpTrapReceiverWhereInput idGt(String idGt) {

        this.idGt = idGt;
        return this;
    }

    /**
     * Get idGt
     *
     * @return idGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIdGt() {
        return idGt;
    }

    public void setIdGt(String idGt) {
        this.idGt = idGt;
    }

    public SnmpTrapReceiverWhereInput idGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GT);
        return this;
    }

    public SnmpTrapReceiverWhereInput idGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_GT);
        return this;
    }

    public void setIdGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_GT);
        }
    }

    public boolean getIdGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_GT);
    }

    public SnmpTrapReceiverWhereInput idGte(String idGte) {

        this.idGte = idGte;
        return this;
    }

    /**
     * Get idGte
     *
     * @return idGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIdGte() {
        return idGte;
    }

    public void setIdGte(String idGte) {
        this.idGte = idGte;
    }

    public SnmpTrapReceiverWhereInput idGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GTE);
        return this;
    }

    public SnmpTrapReceiverWhereInput idGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_GTE);
        return this;
    }

    public void setIdGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_GTE);
        }
    }

    public boolean getIdGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_GTE);
    }

    public SnmpTrapReceiverWhereInput idIn(List<String> idIn) {

        this.idIn = idIn;
        return this;
    }

    public SnmpTrapReceiverWhereInput addIdInItem(String idInItem) {
        if (this.idIn == null) {
            this.idIn = new ArrayList<String>();
        }
        this.idIn.add(idInItem);
        return this;
    }

    /**
     * Get idIn
     *
     * @return idIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getIdIn() {
        return idIn;
    }

    public void setIdIn(List<String> idIn) {
        this.idIn = idIn;
    }

    public SnmpTrapReceiverWhereInput idIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_IN);
        return this;
    }

    public SnmpTrapReceiverWhereInput idIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_IN);
        return this;
    }

    public void setIdIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_IN);
        }
    }

    public boolean getIdIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_IN);
    }

    public SnmpTrapReceiverWhereInput idLt(String idLt) {

        this.idLt = idLt;
        return this;
    }

    /**
     * Get idLt
     *
     * @return idLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIdLt() {
        return idLt;
    }

    public void setIdLt(String idLt) {
        this.idLt = idLt;
    }

    public SnmpTrapReceiverWhereInput idLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LT);
        return this;
    }

    public SnmpTrapReceiverWhereInput idLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_LT);
        return this;
    }

    public void setIdLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_LT);
        }
    }

    public boolean getIdLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_LT);
    }

    public SnmpTrapReceiverWhereInput idLte(String idLte) {

        this.idLte = idLte;
        return this;
    }

    /**
     * Get idLte
     *
     * @return idLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIdLte() {
        return idLte;
    }

    public void setIdLte(String idLte) {
        this.idLte = idLte;
    }

    public SnmpTrapReceiverWhereInput idLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LTE);
        return this;
    }

    public SnmpTrapReceiverWhereInput idLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_LTE);
        return this;
    }

    public void setIdLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_LTE);
        }
    }

    public boolean getIdLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_LTE);
    }

    public SnmpTrapReceiverWhereInput idNot(String idNot) {

        this.idNot = idNot;
        return this;
    }

    /**
     * Get idNot
     *
     * @return idNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIdNot() {
        return idNot;
    }

    public void setIdNot(String idNot) {
        this.idNot = idNot;
    }

    public SnmpTrapReceiverWhereInput idNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT);
        return this;
    }

    public SnmpTrapReceiverWhereInput idNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_NOT);
        return this;
    }

    public void setIdNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_NOT);
        }
    }

    public boolean getIdNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_NOT);
    }

    public SnmpTrapReceiverWhereInput idNotContains(String idNotContains) {

        this.idNotContains = idNotContains;
        return this;
    }

    /**
     * Get idNotContains
     *
     * @return idNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIdNotContains() {
        return idNotContains;
    }

    public void setIdNotContains(String idNotContains) {
        this.idNotContains = idNotContains;
    }

    public SnmpTrapReceiverWhereInput idNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_CONTAINS);
        return this;
    }

    public SnmpTrapReceiverWhereInput idNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_NOT_CONTAINS);
        return this;
    }

    public void setIdNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_NOT_CONTAINS);
        }
    }

    public boolean getIdNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_NOT_CONTAINS);
    }

    public SnmpTrapReceiverWhereInput idNotEndsWith(String idNotEndsWith) {

        this.idNotEndsWith = idNotEndsWith;
        return this;
    }

    /**
     * Get idNotEndsWith
     *
     * @return idNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIdNotEndsWith() {
        return idNotEndsWith;
    }

    public void setIdNotEndsWith(String idNotEndsWith) {
        this.idNotEndsWith = idNotEndsWith;
    }

    public SnmpTrapReceiverWhereInput idNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
        return this;
    }

    public SnmpTrapReceiverWhereInput idNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
        return this;
    }

    public void setIdNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
        }
    }

    public boolean getIdNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
    }

    public SnmpTrapReceiverWhereInput idNotIn(List<String> idNotIn) {

        this.idNotIn = idNotIn;
        return this;
    }

    public SnmpTrapReceiverWhereInput addIdNotInItem(String idNotInItem) {
        if (this.idNotIn == null) {
            this.idNotIn = new ArrayList<String>();
        }
        this.idNotIn.add(idNotInItem);
        return this;
    }

    /**
     * Get idNotIn
     *
     * @return idNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getIdNotIn() {
        return idNotIn;
    }

    public void setIdNotIn(List<String> idNotIn) {
        this.idNotIn = idNotIn;
    }

    public SnmpTrapReceiverWhereInput idNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_IN);
        return this;
    }

    public SnmpTrapReceiverWhereInput idNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_NOT_IN);
        return this;
    }

    public void setIdNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_NOT_IN);
        }
    }

    public boolean getIdNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_NOT_IN);
    }

    public SnmpTrapReceiverWhereInput idNotStartsWith(String idNotStartsWith) {

        this.idNotStartsWith = idNotStartsWith;
        return this;
    }

    /**
     * Get idNotStartsWith
     *
     * @return idNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIdNotStartsWith() {
        return idNotStartsWith;
    }

    public void setIdNotStartsWith(String idNotStartsWith) {
        this.idNotStartsWith = idNotStartsWith;
    }

    public SnmpTrapReceiverWhereInput idNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
        return this;
    }

    public SnmpTrapReceiverWhereInput idNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
        return this;
    }

    public void setIdNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
        }
    }

    public boolean getIdNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
    }

    public SnmpTrapReceiverWhereInput idStartsWith(String idStartsWith) {

        this.idStartsWith = idStartsWith;
        return this;
    }

    /**
     * Get idStartsWith
     *
     * @return idStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIdStartsWith() {
        return idStartsWith;
    }

    public void setIdStartsWith(String idStartsWith) {
        this.idStartsWith = idStartsWith;
    }

    public SnmpTrapReceiverWhereInput idStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_STARTS_WITH);
        return this;
    }

    public SnmpTrapReceiverWhereInput idStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_STARTS_WITH);
        return this;
    }

    public void setIdStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_STARTS_WITH);
        }
    }

    public boolean getIdStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_STARTS_WITH);
    }

    public SnmpTrapReceiverWhereInput inform(Boolean inform) {

        this.inform = inform;
        return this;
    }

    /**
     * Get inform
     *
     * @return inform
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getInform() {
        return inform;
    }

    public void setInform(Boolean inform) {
        this.inform = inform;
    }

    public SnmpTrapReceiverWhereInput inform_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INFORM);
        return this;
    }

    public SnmpTrapReceiverWhereInput inform_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INFORM);
        return this;
    }

    public void setInform_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INFORM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INFORM);
        }
    }

    public boolean getInform_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INFORM);
    }

    public SnmpTrapReceiverWhereInput informNot(Boolean informNot) {

        this.informNot = informNot;
        return this;
    }

    /**
     * Get informNot
     *
     * @return informNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getInformNot() {
        return informNot;
    }

    public void setInformNot(Boolean informNot) {
        this.informNot = informNot;
    }

    public SnmpTrapReceiverWhereInput informNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INFORM_NOT);
        return this;
    }

    public SnmpTrapReceiverWhereInput informNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INFORM_NOT);
        return this;
    }

    public void setInformNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INFORM_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INFORM_NOT);
        }
    }

    public boolean getInformNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INFORM_NOT);
    }

    public SnmpTrapReceiverWhereInput languageCode(SnmpLanguageCode languageCode) {

        this.languageCode = languageCode;
        return this;
    }

    /**
     * Get languageCode
     *
     * @return languageCode
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public SnmpLanguageCode getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(SnmpLanguageCode languageCode) {
        this.languageCode = languageCode;
    }

    public SnmpTrapReceiverWhereInput languageCode_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LANGUAGE_CODE);
        return this;
    }

    public SnmpTrapReceiverWhereInput languageCode_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LANGUAGE_CODE);
        return this;
    }

    public void setLanguageCode_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LANGUAGE_CODE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LANGUAGE_CODE);
        }
    }

    public boolean getLanguageCode_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LANGUAGE_CODE);
    }

    public SnmpTrapReceiverWhereInput languageCodeIn(List<SnmpLanguageCode> languageCodeIn) {

        this.languageCodeIn = languageCodeIn;
        return this;
    }

    public SnmpTrapReceiverWhereInput addLanguageCodeInItem(SnmpLanguageCode languageCodeInItem) {
        if (this.languageCodeIn == null) {
            this.languageCodeIn = new ArrayList<SnmpLanguageCode>();
        }
        this.languageCodeIn.add(languageCodeInItem);
        return this;
    }

    /**
     * Get languageCodeIn
     *
     * @return languageCodeIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<SnmpLanguageCode> getLanguageCodeIn() {
        return languageCodeIn;
    }

    public void setLanguageCodeIn(List<SnmpLanguageCode> languageCodeIn) {
        this.languageCodeIn = languageCodeIn;
    }

    public SnmpTrapReceiverWhereInput languageCodeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LANGUAGE_CODE_IN);
        return this;
    }

    public SnmpTrapReceiverWhereInput languageCodeIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LANGUAGE_CODE_IN);
        return this;
    }

    public void setLanguageCodeIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LANGUAGE_CODE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LANGUAGE_CODE_IN);
        }
    }

    public boolean getLanguageCodeIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LANGUAGE_CODE_IN);
    }

    public SnmpTrapReceiverWhereInput languageCodeNot(SnmpLanguageCode languageCodeNot) {

        this.languageCodeNot = languageCodeNot;
        return this;
    }

    /**
     * Get languageCodeNot
     *
     * @return languageCodeNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public SnmpLanguageCode getLanguageCodeNot() {
        return languageCodeNot;
    }

    public void setLanguageCodeNot(SnmpLanguageCode languageCodeNot) {
        this.languageCodeNot = languageCodeNot;
    }

    public SnmpTrapReceiverWhereInput languageCodeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LANGUAGE_CODE_NOT);
        return this;
    }

    public SnmpTrapReceiverWhereInput languageCodeNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LANGUAGE_CODE_NOT);
        return this;
    }

    public void setLanguageCodeNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LANGUAGE_CODE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LANGUAGE_CODE_NOT);
        }
    }

    public boolean getLanguageCodeNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LANGUAGE_CODE_NOT);
    }

    public SnmpTrapReceiverWhereInput languageCodeNotIn(List<SnmpLanguageCode> languageCodeNotIn) {

        this.languageCodeNotIn = languageCodeNotIn;
        return this;
    }

    public SnmpTrapReceiverWhereInput addLanguageCodeNotInItem(
            SnmpLanguageCode languageCodeNotInItem) {
        if (this.languageCodeNotIn == null) {
            this.languageCodeNotIn = new ArrayList<SnmpLanguageCode>();
        }
        this.languageCodeNotIn.add(languageCodeNotInItem);
        return this;
    }

    /**
     * Get languageCodeNotIn
     *
     * @return languageCodeNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<SnmpLanguageCode> getLanguageCodeNotIn() {
        return languageCodeNotIn;
    }

    public void setLanguageCodeNotIn(List<SnmpLanguageCode> languageCodeNotIn) {
        this.languageCodeNotIn = languageCodeNotIn;
    }

    public SnmpTrapReceiverWhereInput languageCodeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LANGUAGE_CODE_NOT_IN);
        return this;
    }

    public SnmpTrapReceiverWhereInput languageCodeNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LANGUAGE_CODE_NOT_IN);
        return this;
    }

    public void setLanguageCodeNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LANGUAGE_CODE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LANGUAGE_CODE_NOT_IN);
        }
    }

    public boolean getLanguageCodeNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LANGUAGE_CODE_NOT_IN);
    }

    public SnmpTrapReceiverWhereInput localId(String localId) {

        this.localId = localId;
        return this;
    }

    /**
     * Get localId
     *
     * @return localId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalId() {
        return localId;
    }

    public void setLocalId(String localId) {
        this.localId = localId;
    }

    public SnmpTrapReceiverWhereInput localId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID);
        return this;
    }

    public SnmpTrapReceiverWhereInput localId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID);
        return this;
    }

    public void setLocalId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID);
        }
    }

    public boolean getLocalId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID);
    }

    public SnmpTrapReceiverWhereInput localIdContains(String localIdContains) {

        this.localIdContains = localIdContains;
        return this;
    }

    /**
     * Get localIdContains
     *
     * @return localIdContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalIdContains() {
        return localIdContains;
    }

    public void setLocalIdContains(String localIdContains) {
        this.localIdContains = localIdContains;
    }

    public SnmpTrapReceiverWhereInput localIdContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_CONTAINS);
        return this;
    }

    public SnmpTrapReceiverWhereInput localIdContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_CONTAINS);
        return this;
    }

    public void setLocalIdContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_CONTAINS);
        }
    }

    public boolean getLocalIdContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID_CONTAINS);
    }

    public SnmpTrapReceiverWhereInput localIdEndsWith(String localIdEndsWith) {

        this.localIdEndsWith = localIdEndsWith;
        return this;
    }

    /**
     * Get localIdEndsWith
     *
     * @return localIdEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalIdEndsWith() {
        return localIdEndsWith;
    }

    public void setLocalIdEndsWith(String localIdEndsWith) {
        this.localIdEndsWith = localIdEndsWith;
    }

    public SnmpTrapReceiverWhereInput localIdEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_ENDS_WITH);
        return this;
    }

    public SnmpTrapReceiverWhereInput localIdEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_ENDS_WITH);
        return this;
    }

    public void setLocalIdEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_ENDS_WITH);
        }
    }

    public boolean getLocalIdEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID_ENDS_WITH);
    }

    public SnmpTrapReceiverWhereInput localIdGt(String localIdGt) {

        this.localIdGt = localIdGt;
        return this;
    }

    /**
     * Get localIdGt
     *
     * @return localIdGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalIdGt() {
        return localIdGt;
    }

    public void setLocalIdGt(String localIdGt) {
        this.localIdGt = localIdGt;
    }

    public SnmpTrapReceiverWhereInput localIdGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_GT);
        return this;
    }

    public SnmpTrapReceiverWhereInput localIdGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_GT);
        return this;
    }

    public void setLocalIdGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_GT);
        }
    }

    public boolean getLocalIdGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID_GT);
    }

    public SnmpTrapReceiverWhereInput localIdGte(String localIdGte) {

        this.localIdGte = localIdGte;
        return this;
    }

    /**
     * Get localIdGte
     *
     * @return localIdGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalIdGte() {
        return localIdGte;
    }

    public void setLocalIdGte(String localIdGte) {
        this.localIdGte = localIdGte;
    }

    public SnmpTrapReceiverWhereInput localIdGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_GTE);
        return this;
    }

    public SnmpTrapReceiverWhereInput localIdGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_GTE);
        return this;
    }

    public void setLocalIdGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_GTE);
        }
    }

    public boolean getLocalIdGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID_GTE);
    }

    public SnmpTrapReceiverWhereInput localIdIn(List<String> localIdIn) {

        this.localIdIn = localIdIn;
        return this;
    }

    public SnmpTrapReceiverWhereInput addLocalIdInItem(String localIdInItem) {
        if (this.localIdIn == null) {
            this.localIdIn = new ArrayList<String>();
        }
        this.localIdIn.add(localIdInItem);
        return this;
    }

    /**
     * Get localIdIn
     *
     * @return localIdIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getLocalIdIn() {
        return localIdIn;
    }

    public void setLocalIdIn(List<String> localIdIn) {
        this.localIdIn = localIdIn;
    }

    public SnmpTrapReceiverWhereInput localIdIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_IN);
        return this;
    }

    public SnmpTrapReceiverWhereInput localIdIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_IN);
        return this;
    }

    public void setLocalIdIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_IN);
        }
    }

    public boolean getLocalIdIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID_IN);
    }

    public SnmpTrapReceiverWhereInput localIdLt(String localIdLt) {

        this.localIdLt = localIdLt;
        return this;
    }

    /**
     * Get localIdLt
     *
     * @return localIdLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalIdLt() {
        return localIdLt;
    }

    public void setLocalIdLt(String localIdLt) {
        this.localIdLt = localIdLt;
    }

    public SnmpTrapReceiverWhereInput localIdLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_LT);
        return this;
    }

    public SnmpTrapReceiverWhereInput localIdLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_LT);
        return this;
    }

    public void setLocalIdLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_LT);
        }
    }

    public boolean getLocalIdLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID_LT);
    }

    public SnmpTrapReceiverWhereInput localIdLte(String localIdLte) {

        this.localIdLte = localIdLte;
        return this;
    }

    /**
     * Get localIdLte
     *
     * @return localIdLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalIdLte() {
        return localIdLte;
    }

    public void setLocalIdLte(String localIdLte) {
        this.localIdLte = localIdLte;
    }

    public SnmpTrapReceiverWhereInput localIdLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_LTE);
        return this;
    }

    public SnmpTrapReceiverWhereInput localIdLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_LTE);
        return this;
    }

    public void setLocalIdLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_LTE);
        }
    }

    public boolean getLocalIdLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID_LTE);
    }

    public SnmpTrapReceiverWhereInput localIdNot(String localIdNot) {

        this.localIdNot = localIdNot;
        return this;
    }

    /**
     * Get localIdNot
     *
     * @return localIdNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalIdNot() {
        return localIdNot;
    }

    public void setLocalIdNot(String localIdNot) {
        this.localIdNot = localIdNot;
    }

    public SnmpTrapReceiverWhereInput localIdNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT);
        return this;
    }

    public SnmpTrapReceiverWhereInput localIdNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_NOT);
        return this;
    }

    public void setLocalIdNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_NOT);
        }
    }

    public boolean getLocalIdNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID_NOT);
    }

    public SnmpTrapReceiverWhereInput localIdNotContains(String localIdNotContains) {

        this.localIdNotContains = localIdNotContains;
        return this;
    }

    /**
     * Get localIdNotContains
     *
     * @return localIdNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalIdNotContains() {
        return localIdNotContains;
    }

    public void setLocalIdNotContains(String localIdNotContains) {
        this.localIdNotContains = localIdNotContains;
    }

    public SnmpTrapReceiverWhereInput localIdNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_CONTAINS);
        return this;
    }

    public SnmpTrapReceiverWhereInput localIdNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_NOT_CONTAINS);
        return this;
    }

    public void setLocalIdNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_NOT_CONTAINS);
        }
    }

    public boolean getLocalIdNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID_NOT_CONTAINS);
    }

    public SnmpTrapReceiverWhereInput localIdNotEndsWith(String localIdNotEndsWith) {

        this.localIdNotEndsWith = localIdNotEndsWith;
        return this;
    }

    /**
     * Get localIdNotEndsWith
     *
     * @return localIdNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalIdNotEndsWith() {
        return localIdNotEndsWith;
    }

    public void setLocalIdNotEndsWith(String localIdNotEndsWith) {
        this.localIdNotEndsWith = localIdNotEndsWith;
    }

    public SnmpTrapReceiverWhereInput localIdNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_ENDS_WITH);
        return this;
    }

    public SnmpTrapReceiverWhereInput localIdNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_NOT_ENDS_WITH);
        return this;
    }

    public void setLocalIdNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_NOT_ENDS_WITH);
        }
    }

    public boolean getLocalIdNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID_NOT_ENDS_WITH);
    }

    public SnmpTrapReceiverWhereInput localIdNotIn(List<String> localIdNotIn) {

        this.localIdNotIn = localIdNotIn;
        return this;
    }

    public SnmpTrapReceiverWhereInput addLocalIdNotInItem(String localIdNotInItem) {
        if (this.localIdNotIn == null) {
            this.localIdNotIn = new ArrayList<String>();
        }
        this.localIdNotIn.add(localIdNotInItem);
        return this;
    }

    /**
     * Get localIdNotIn
     *
     * @return localIdNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getLocalIdNotIn() {
        return localIdNotIn;
    }

    public void setLocalIdNotIn(List<String> localIdNotIn) {
        this.localIdNotIn = localIdNotIn;
    }

    public SnmpTrapReceiverWhereInput localIdNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_IN);
        return this;
    }

    public SnmpTrapReceiverWhereInput localIdNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_NOT_IN);
        return this;
    }

    public void setLocalIdNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_NOT_IN);
        }
    }

    public boolean getLocalIdNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID_NOT_IN);
    }

    public SnmpTrapReceiverWhereInput localIdNotStartsWith(String localIdNotStartsWith) {

        this.localIdNotStartsWith = localIdNotStartsWith;
        return this;
    }

    /**
     * Get localIdNotStartsWith
     *
     * @return localIdNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalIdNotStartsWith() {
        return localIdNotStartsWith;
    }

    public void setLocalIdNotStartsWith(String localIdNotStartsWith) {
        this.localIdNotStartsWith = localIdNotStartsWith;
    }

    public SnmpTrapReceiverWhereInput localIdNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_STARTS_WITH);
        return this;
    }

    public SnmpTrapReceiverWhereInput localIdNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_NOT_STARTS_WITH);
        return this;
    }

    public void setLocalIdNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_NOT_STARTS_WITH);
        }
    }

    public boolean getLocalIdNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID_NOT_STARTS_WITH);
    }

    public SnmpTrapReceiverWhereInput localIdStartsWith(String localIdStartsWith) {

        this.localIdStartsWith = localIdStartsWith;
        return this;
    }

    /**
     * Get localIdStartsWith
     *
     * @return localIdStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalIdStartsWith() {
        return localIdStartsWith;
    }

    public void setLocalIdStartsWith(String localIdStartsWith) {
        this.localIdStartsWith = localIdStartsWith;
    }

    public SnmpTrapReceiverWhereInput localIdStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_STARTS_WITH);
        return this;
    }

    public SnmpTrapReceiverWhereInput localIdStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_STARTS_WITH);
        return this;
    }

    public void setLocalIdStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_STARTS_WITH);
        }
    }

    public boolean getLocalIdStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID_STARTS_WITH);
    }

    public SnmpTrapReceiverWhereInput name(String name) {

        this.name = name;
        return this;
    }

    /**
     * Get name
     *
     * @return name
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SnmpTrapReceiverWhereInput name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public SnmpTrapReceiverWhereInput name_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME);
        return this;
    }

    public void setName_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME);
        }
    }

    public boolean getName_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME);
    }

    public SnmpTrapReceiverWhereInput nameContains(String nameContains) {

        this.nameContains = nameContains;
        return this;
    }

    /**
     * Get nameContains
     *
     * @return nameContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNameContains() {
        return nameContains;
    }

    public void setNameContains(String nameContains) {
        this.nameContains = nameContains;
    }

    public SnmpTrapReceiverWhereInput nameContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_CONTAINS);
        return this;
    }

    public SnmpTrapReceiverWhereInput nameContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_CONTAINS);
        return this;
    }

    public void setNameContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_CONTAINS);
        }
    }

    public boolean getNameContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_CONTAINS);
    }

    public SnmpTrapReceiverWhereInput nameEndsWith(String nameEndsWith) {

        this.nameEndsWith = nameEndsWith;
        return this;
    }

    /**
     * Get nameEndsWith
     *
     * @return nameEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNameEndsWith() {
        return nameEndsWith;
    }

    public void setNameEndsWith(String nameEndsWith) {
        this.nameEndsWith = nameEndsWith;
    }

    public SnmpTrapReceiverWhereInput nameEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_ENDS_WITH);
        return this;
    }

    public SnmpTrapReceiverWhereInput nameEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_ENDS_WITH);
        return this;
    }

    public void setNameEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_ENDS_WITH);
        }
    }

    public boolean getNameEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_ENDS_WITH);
    }

    public SnmpTrapReceiverWhereInput nameGt(String nameGt) {

        this.nameGt = nameGt;
        return this;
    }

    /**
     * Get nameGt
     *
     * @return nameGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNameGt() {
        return nameGt;
    }

    public void setNameGt(String nameGt) {
        this.nameGt = nameGt;
    }

    public SnmpTrapReceiverWhereInput nameGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_GT);
        return this;
    }

    public SnmpTrapReceiverWhereInput nameGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_GT);
        return this;
    }

    public void setNameGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_GT);
        }
    }

    public boolean getNameGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_GT);
    }

    public SnmpTrapReceiverWhereInput nameGte(String nameGte) {

        this.nameGte = nameGte;
        return this;
    }

    /**
     * Get nameGte
     *
     * @return nameGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNameGte() {
        return nameGte;
    }

    public void setNameGte(String nameGte) {
        this.nameGte = nameGte;
    }

    public SnmpTrapReceiverWhereInput nameGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_GTE);
        return this;
    }

    public SnmpTrapReceiverWhereInput nameGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_GTE);
        return this;
    }

    public void setNameGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_GTE);
        }
    }

    public boolean getNameGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_GTE);
    }

    public SnmpTrapReceiverWhereInput nameIn(List<String> nameIn) {

        this.nameIn = nameIn;
        return this;
    }

    public SnmpTrapReceiverWhereInput addNameInItem(String nameInItem) {
        if (this.nameIn == null) {
            this.nameIn = new ArrayList<String>();
        }
        this.nameIn.add(nameInItem);
        return this;
    }

    /**
     * Get nameIn
     *
     * @return nameIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getNameIn() {
        return nameIn;
    }

    public void setNameIn(List<String> nameIn) {
        this.nameIn = nameIn;
    }

    public SnmpTrapReceiverWhereInput nameIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_IN);
        return this;
    }

    public SnmpTrapReceiverWhereInput nameIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_IN);
        return this;
    }

    public void setNameIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_IN);
        }
    }

    public boolean getNameIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_IN);
    }

    public SnmpTrapReceiverWhereInput nameLt(String nameLt) {

        this.nameLt = nameLt;
        return this;
    }

    /**
     * Get nameLt
     *
     * @return nameLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNameLt() {
        return nameLt;
    }

    public void setNameLt(String nameLt) {
        this.nameLt = nameLt;
    }

    public SnmpTrapReceiverWhereInput nameLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_LT);
        return this;
    }

    public SnmpTrapReceiverWhereInput nameLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_LT);
        return this;
    }

    public void setNameLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_LT);
        }
    }

    public boolean getNameLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_LT);
    }

    public SnmpTrapReceiverWhereInput nameLte(String nameLte) {

        this.nameLte = nameLte;
        return this;
    }

    /**
     * Get nameLte
     *
     * @return nameLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNameLte() {
        return nameLte;
    }

    public void setNameLte(String nameLte) {
        this.nameLte = nameLte;
    }

    public SnmpTrapReceiverWhereInput nameLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_LTE);
        return this;
    }

    public SnmpTrapReceiverWhereInput nameLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_LTE);
        return this;
    }

    public void setNameLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_LTE);
        }
    }

    public boolean getNameLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_LTE);
    }

    public SnmpTrapReceiverWhereInput nameNot(String nameNot) {

        this.nameNot = nameNot;
        return this;
    }

    /**
     * Get nameNot
     *
     * @return nameNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNameNot() {
        return nameNot;
    }

    public void setNameNot(String nameNot) {
        this.nameNot = nameNot;
    }

    public SnmpTrapReceiverWhereInput nameNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT);
        return this;
    }

    public SnmpTrapReceiverWhereInput nameNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_NOT);
        return this;
    }

    public void setNameNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_NOT);
        }
    }

    public boolean getNameNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_NOT);
    }

    public SnmpTrapReceiverWhereInput nameNotContains(String nameNotContains) {

        this.nameNotContains = nameNotContains;
        return this;
    }

    /**
     * Get nameNotContains
     *
     * @return nameNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNameNotContains() {
        return nameNotContains;
    }

    public void setNameNotContains(String nameNotContains) {
        this.nameNotContains = nameNotContains;
    }

    public SnmpTrapReceiverWhereInput nameNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_CONTAINS);
        return this;
    }

    public SnmpTrapReceiverWhereInput nameNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_NOT_CONTAINS);
        return this;
    }

    public void setNameNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_NOT_CONTAINS);
        }
    }

    public boolean getNameNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_NOT_CONTAINS);
    }

    public SnmpTrapReceiverWhereInput nameNotEndsWith(String nameNotEndsWith) {

        this.nameNotEndsWith = nameNotEndsWith;
        return this;
    }

    /**
     * Get nameNotEndsWith
     *
     * @return nameNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNameNotEndsWith() {
        return nameNotEndsWith;
    }

    public void setNameNotEndsWith(String nameNotEndsWith) {
        this.nameNotEndsWith = nameNotEndsWith;
    }

    public SnmpTrapReceiverWhereInput nameNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_ENDS_WITH);
        return this;
    }

    public SnmpTrapReceiverWhereInput nameNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_NOT_ENDS_WITH);
        return this;
    }

    public void setNameNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_NOT_ENDS_WITH);
        }
    }

    public boolean getNameNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_NOT_ENDS_WITH);
    }

    public SnmpTrapReceiverWhereInput nameNotIn(List<String> nameNotIn) {

        this.nameNotIn = nameNotIn;
        return this;
    }

    public SnmpTrapReceiverWhereInput addNameNotInItem(String nameNotInItem) {
        if (this.nameNotIn == null) {
            this.nameNotIn = new ArrayList<String>();
        }
        this.nameNotIn.add(nameNotInItem);
        return this;
    }

    /**
     * Get nameNotIn
     *
     * @return nameNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getNameNotIn() {
        return nameNotIn;
    }

    public void setNameNotIn(List<String> nameNotIn) {
        this.nameNotIn = nameNotIn;
    }

    public SnmpTrapReceiverWhereInput nameNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_IN);
        return this;
    }

    public SnmpTrapReceiverWhereInput nameNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_NOT_IN);
        return this;
    }

    public void setNameNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_NOT_IN);
        }
    }

    public boolean getNameNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_NOT_IN);
    }

    public SnmpTrapReceiverWhereInput nameNotStartsWith(String nameNotStartsWith) {

        this.nameNotStartsWith = nameNotStartsWith;
        return this;
    }

    /**
     * Get nameNotStartsWith
     *
     * @return nameNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNameNotStartsWith() {
        return nameNotStartsWith;
    }

    public void setNameNotStartsWith(String nameNotStartsWith) {
        this.nameNotStartsWith = nameNotStartsWith;
    }

    public SnmpTrapReceiverWhereInput nameNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_STARTS_WITH);
        return this;
    }

    public SnmpTrapReceiverWhereInput nameNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_NOT_STARTS_WITH);
        return this;
    }

    public void setNameNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_NOT_STARTS_WITH);
        }
    }

    public boolean getNameNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_NOT_STARTS_WITH);
    }

    public SnmpTrapReceiverWhereInput nameStartsWith(String nameStartsWith) {

        this.nameStartsWith = nameStartsWith;
        return this;
    }

    /**
     * Get nameStartsWith
     *
     * @return nameStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNameStartsWith() {
        return nameStartsWith;
    }

    public void setNameStartsWith(String nameStartsWith) {
        this.nameStartsWith = nameStartsWith;
    }

    public SnmpTrapReceiverWhereInput nameStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_STARTS_WITH);
        return this;
    }

    public SnmpTrapReceiverWhereInput nameStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_STARTS_WITH);
        return this;
    }

    public void setNameStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_STARTS_WITH);
        }
    }

    public boolean getNameStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_STARTS_WITH);
    }

    public SnmpTrapReceiverWhereInput port(Integer port) {

        this.port = port;
        return this;
    }

    /**
     * Get port
     *
     * @return port
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public SnmpTrapReceiverWhereInput port_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PORT);
        return this;
    }

    public SnmpTrapReceiverWhereInput port_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PORT);
        return this;
    }

    public void setPort_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PORT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PORT);
        }
    }

    public boolean getPort_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PORT);
    }

    public SnmpTrapReceiverWhereInput portGt(Integer portGt) {

        this.portGt = portGt;
        return this;
    }

    /**
     * Get portGt
     *
     * @return portGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getPortGt() {
        return portGt;
    }

    public void setPortGt(Integer portGt) {
        this.portGt = portGt;
    }

    public SnmpTrapReceiverWhereInput portGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PORT_GT);
        return this;
    }

    public SnmpTrapReceiverWhereInput portGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PORT_GT);
        return this;
    }

    public void setPortGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PORT_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PORT_GT);
        }
    }

    public boolean getPortGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PORT_GT);
    }

    public SnmpTrapReceiverWhereInput portGte(Integer portGte) {

        this.portGte = portGte;
        return this;
    }

    /**
     * Get portGte
     *
     * @return portGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getPortGte() {
        return portGte;
    }

    public void setPortGte(Integer portGte) {
        this.portGte = portGte;
    }

    public SnmpTrapReceiverWhereInput portGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PORT_GTE);
        return this;
    }

    public SnmpTrapReceiverWhereInput portGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PORT_GTE);
        return this;
    }

    public void setPortGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PORT_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PORT_GTE);
        }
    }

    public boolean getPortGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PORT_GTE);
    }

    public SnmpTrapReceiverWhereInput portIn(List<Integer> portIn) {

        this.portIn = portIn;
        return this;
    }

    public SnmpTrapReceiverWhereInput addPortInItem(Integer portInItem) {
        if (this.portIn == null) {
            this.portIn = new ArrayList<Integer>();
        }
        this.portIn.add(portInItem);
        return this;
    }

    /**
     * Get portIn
     *
     * @return portIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getPortIn() {
        return portIn;
    }

    public void setPortIn(List<Integer> portIn) {
        this.portIn = portIn;
    }

    public SnmpTrapReceiverWhereInput portIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PORT_IN);
        return this;
    }

    public SnmpTrapReceiverWhereInput portIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PORT_IN);
        return this;
    }

    public void setPortIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PORT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PORT_IN);
        }
    }

    public boolean getPortIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PORT_IN);
    }

    public SnmpTrapReceiverWhereInput portLt(Integer portLt) {

        this.portLt = portLt;
        return this;
    }

    /**
     * Get portLt
     *
     * @return portLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getPortLt() {
        return portLt;
    }

    public void setPortLt(Integer portLt) {
        this.portLt = portLt;
    }

    public SnmpTrapReceiverWhereInput portLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PORT_LT);
        return this;
    }

    public SnmpTrapReceiverWhereInput portLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PORT_LT);
        return this;
    }

    public void setPortLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PORT_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PORT_LT);
        }
    }

    public boolean getPortLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PORT_LT);
    }

    public SnmpTrapReceiverWhereInput portLte(Integer portLte) {

        this.portLte = portLte;
        return this;
    }

    /**
     * Get portLte
     *
     * @return portLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getPortLte() {
        return portLte;
    }

    public void setPortLte(Integer portLte) {
        this.portLte = portLte;
    }

    public SnmpTrapReceiverWhereInput portLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PORT_LTE);
        return this;
    }

    public SnmpTrapReceiverWhereInput portLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PORT_LTE);
        return this;
    }

    public void setPortLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PORT_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PORT_LTE);
        }
    }

    public boolean getPortLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PORT_LTE);
    }

    public SnmpTrapReceiverWhereInput portNot(Integer portNot) {

        this.portNot = portNot;
        return this;
    }

    /**
     * Get portNot
     *
     * @return portNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getPortNot() {
        return portNot;
    }

    public void setPortNot(Integer portNot) {
        this.portNot = portNot;
    }

    public SnmpTrapReceiverWhereInput portNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PORT_NOT);
        return this;
    }

    public SnmpTrapReceiverWhereInput portNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PORT_NOT);
        return this;
    }

    public void setPortNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PORT_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PORT_NOT);
        }
    }

    public boolean getPortNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PORT_NOT);
    }

    public SnmpTrapReceiverWhereInput portNotIn(List<Integer> portNotIn) {

        this.portNotIn = portNotIn;
        return this;
    }

    public SnmpTrapReceiverWhereInput addPortNotInItem(Integer portNotInItem) {
        if (this.portNotIn == null) {
            this.portNotIn = new ArrayList<Integer>();
        }
        this.portNotIn.add(portNotInItem);
        return this;
    }

    /**
     * Get portNotIn
     *
     * @return portNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getPortNotIn() {
        return portNotIn;
    }

    public void setPortNotIn(List<Integer> portNotIn) {
        this.portNotIn = portNotIn;
    }

    public SnmpTrapReceiverWhereInput portNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PORT_NOT_IN);
        return this;
    }

    public SnmpTrapReceiverWhereInput portNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PORT_NOT_IN);
        return this;
    }

    public void setPortNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PORT_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PORT_NOT_IN);
        }
    }

    public boolean getPortNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PORT_NOT_IN);
    }

    public SnmpTrapReceiverWhereInput privacyPassPhrase(String privacyPassPhrase) {

        this.privacyPassPhrase = privacyPassPhrase;
        return this;
    }

    /**
     * Get privacyPassPhrase
     *
     * @return privacyPassPhrase
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPrivacyPassPhrase() {
        return privacyPassPhrase;
    }

    public void setPrivacyPassPhrase(String privacyPassPhrase) {
        this.privacyPassPhrase = privacyPassPhrase;
    }

    public SnmpTrapReceiverWhereInput privacyPassPhrase_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRIVACY_PASS_PHRASE);
        return this;
    }

    public SnmpTrapReceiverWhereInput privacyPassPhrase_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRIVACY_PASS_PHRASE);
        return this;
    }

    public void setPrivacyPassPhrase_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRIVACY_PASS_PHRASE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRIVACY_PASS_PHRASE);
        }
    }

    public boolean getPrivacyPassPhrase_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRIVACY_PASS_PHRASE);
    }

    public SnmpTrapReceiverWhereInput privacyPassPhraseContains(String privacyPassPhraseContains) {

        this.privacyPassPhraseContains = privacyPassPhraseContains;
        return this;
    }

    /**
     * Get privacyPassPhraseContains
     *
     * @return privacyPassPhraseContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPrivacyPassPhraseContains() {
        return privacyPassPhraseContains;
    }

    public void setPrivacyPassPhraseContains(String privacyPassPhraseContains) {
        this.privacyPassPhraseContains = privacyPassPhraseContains;
    }

    public SnmpTrapReceiverWhereInput privacyPassPhraseContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRIVACY_PASS_PHRASE_CONTAINS);
        return this;
    }

    public SnmpTrapReceiverWhereInput privacyPassPhraseContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRIVACY_PASS_PHRASE_CONTAINS);
        return this;
    }

    public void setPrivacyPassPhraseContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRIVACY_PASS_PHRASE_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRIVACY_PASS_PHRASE_CONTAINS);
        }
    }

    public boolean getPrivacyPassPhraseContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRIVACY_PASS_PHRASE_CONTAINS);
    }

    public SnmpTrapReceiverWhereInput privacyPassPhraseEndsWith(String privacyPassPhraseEndsWith) {

        this.privacyPassPhraseEndsWith = privacyPassPhraseEndsWith;
        return this;
    }

    /**
     * Get privacyPassPhraseEndsWith
     *
     * @return privacyPassPhraseEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPrivacyPassPhraseEndsWith() {
        return privacyPassPhraseEndsWith;
    }

    public void setPrivacyPassPhraseEndsWith(String privacyPassPhraseEndsWith) {
        this.privacyPassPhraseEndsWith = privacyPassPhraseEndsWith;
    }

    public SnmpTrapReceiverWhereInput privacyPassPhraseEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRIVACY_PASS_PHRASE_ENDS_WITH);
        return this;
    }

    public SnmpTrapReceiverWhereInput privacyPassPhraseEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRIVACY_PASS_PHRASE_ENDS_WITH);
        return this;
    }

    public void setPrivacyPassPhraseEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRIVACY_PASS_PHRASE_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRIVACY_PASS_PHRASE_ENDS_WITH);
        }
    }

    public boolean getPrivacyPassPhraseEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRIVACY_PASS_PHRASE_ENDS_WITH);
    }

    public SnmpTrapReceiverWhereInput privacyPassPhraseGt(String privacyPassPhraseGt) {

        this.privacyPassPhraseGt = privacyPassPhraseGt;
        return this;
    }

    /**
     * Get privacyPassPhraseGt
     *
     * @return privacyPassPhraseGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPrivacyPassPhraseGt() {
        return privacyPassPhraseGt;
    }

    public void setPrivacyPassPhraseGt(String privacyPassPhraseGt) {
        this.privacyPassPhraseGt = privacyPassPhraseGt;
    }

    public SnmpTrapReceiverWhereInput privacyPassPhraseGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRIVACY_PASS_PHRASE_GT);
        return this;
    }

    public SnmpTrapReceiverWhereInput privacyPassPhraseGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRIVACY_PASS_PHRASE_GT);
        return this;
    }

    public void setPrivacyPassPhraseGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRIVACY_PASS_PHRASE_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRIVACY_PASS_PHRASE_GT);
        }
    }

    public boolean getPrivacyPassPhraseGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRIVACY_PASS_PHRASE_GT);
    }

    public SnmpTrapReceiverWhereInput privacyPassPhraseGte(String privacyPassPhraseGte) {

        this.privacyPassPhraseGte = privacyPassPhraseGte;
        return this;
    }

    /**
     * Get privacyPassPhraseGte
     *
     * @return privacyPassPhraseGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPrivacyPassPhraseGte() {
        return privacyPassPhraseGte;
    }

    public void setPrivacyPassPhraseGte(String privacyPassPhraseGte) {
        this.privacyPassPhraseGte = privacyPassPhraseGte;
    }

    public SnmpTrapReceiverWhereInput privacyPassPhraseGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRIVACY_PASS_PHRASE_GTE);
        return this;
    }

    public SnmpTrapReceiverWhereInput privacyPassPhraseGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRIVACY_PASS_PHRASE_GTE);
        return this;
    }

    public void setPrivacyPassPhraseGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRIVACY_PASS_PHRASE_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRIVACY_PASS_PHRASE_GTE);
        }
    }

    public boolean getPrivacyPassPhraseGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRIVACY_PASS_PHRASE_GTE);
    }

    public SnmpTrapReceiverWhereInput privacyPassPhraseIn(List<String> privacyPassPhraseIn) {

        this.privacyPassPhraseIn = privacyPassPhraseIn;
        return this;
    }

    public SnmpTrapReceiverWhereInput addPrivacyPassPhraseInItem(String privacyPassPhraseInItem) {
        if (this.privacyPassPhraseIn == null) {
            this.privacyPassPhraseIn = new ArrayList<String>();
        }
        this.privacyPassPhraseIn.add(privacyPassPhraseInItem);
        return this;
    }

    /**
     * Get privacyPassPhraseIn
     *
     * @return privacyPassPhraseIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getPrivacyPassPhraseIn() {
        return privacyPassPhraseIn;
    }

    public void setPrivacyPassPhraseIn(List<String> privacyPassPhraseIn) {
        this.privacyPassPhraseIn = privacyPassPhraseIn;
    }

    public SnmpTrapReceiverWhereInput privacyPassPhraseIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRIVACY_PASS_PHRASE_IN);
        return this;
    }

    public SnmpTrapReceiverWhereInput privacyPassPhraseIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRIVACY_PASS_PHRASE_IN);
        return this;
    }

    public void setPrivacyPassPhraseIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRIVACY_PASS_PHRASE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRIVACY_PASS_PHRASE_IN);
        }
    }

    public boolean getPrivacyPassPhraseIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRIVACY_PASS_PHRASE_IN);
    }

    public SnmpTrapReceiverWhereInput privacyPassPhraseLt(String privacyPassPhraseLt) {

        this.privacyPassPhraseLt = privacyPassPhraseLt;
        return this;
    }

    /**
     * Get privacyPassPhraseLt
     *
     * @return privacyPassPhraseLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPrivacyPassPhraseLt() {
        return privacyPassPhraseLt;
    }

    public void setPrivacyPassPhraseLt(String privacyPassPhraseLt) {
        this.privacyPassPhraseLt = privacyPassPhraseLt;
    }

    public SnmpTrapReceiverWhereInput privacyPassPhraseLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRIVACY_PASS_PHRASE_LT);
        return this;
    }

    public SnmpTrapReceiverWhereInput privacyPassPhraseLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRIVACY_PASS_PHRASE_LT);
        return this;
    }

    public void setPrivacyPassPhraseLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRIVACY_PASS_PHRASE_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRIVACY_PASS_PHRASE_LT);
        }
    }

    public boolean getPrivacyPassPhraseLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRIVACY_PASS_PHRASE_LT);
    }

    public SnmpTrapReceiverWhereInput privacyPassPhraseLte(String privacyPassPhraseLte) {

        this.privacyPassPhraseLte = privacyPassPhraseLte;
        return this;
    }

    /**
     * Get privacyPassPhraseLte
     *
     * @return privacyPassPhraseLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPrivacyPassPhraseLte() {
        return privacyPassPhraseLte;
    }

    public void setPrivacyPassPhraseLte(String privacyPassPhraseLte) {
        this.privacyPassPhraseLte = privacyPassPhraseLte;
    }

    public SnmpTrapReceiverWhereInput privacyPassPhraseLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRIVACY_PASS_PHRASE_LTE);
        return this;
    }

    public SnmpTrapReceiverWhereInput privacyPassPhraseLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRIVACY_PASS_PHRASE_LTE);
        return this;
    }

    public void setPrivacyPassPhraseLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRIVACY_PASS_PHRASE_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRIVACY_PASS_PHRASE_LTE);
        }
    }

    public boolean getPrivacyPassPhraseLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRIVACY_PASS_PHRASE_LTE);
    }

    public SnmpTrapReceiverWhereInput privacyPassPhraseNot(String privacyPassPhraseNot) {

        this.privacyPassPhraseNot = privacyPassPhraseNot;
        return this;
    }

    /**
     * Get privacyPassPhraseNot
     *
     * @return privacyPassPhraseNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPrivacyPassPhraseNot() {
        return privacyPassPhraseNot;
    }

    public void setPrivacyPassPhraseNot(String privacyPassPhraseNot) {
        this.privacyPassPhraseNot = privacyPassPhraseNot;
    }

    public SnmpTrapReceiverWhereInput privacyPassPhraseNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRIVACY_PASS_PHRASE_NOT);
        return this;
    }

    public SnmpTrapReceiverWhereInput privacyPassPhraseNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRIVACY_PASS_PHRASE_NOT);
        return this;
    }

    public void setPrivacyPassPhraseNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRIVACY_PASS_PHRASE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRIVACY_PASS_PHRASE_NOT);
        }
    }

    public boolean getPrivacyPassPhraseNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRIVACY_PASS_PHRASE_NOT);
    }

    public SnmpTrapReceiverWhereInput privacyPassPhraseNotContains(
            String privacyPassPhraseNotContains) {

        this.privacyPassPhraseNotContains = privacyPassPhraseNotContains;
        return this;
    }

    /**
     * Get privacyPassPhraseNotContains
     *
     * @return privacyPassPhraseNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPrivacyPassPhraseNotContains() {
        return privacyPassPhraseNotContains;
    }

    public void setPrivacyPassPhraseNotContains(String privacyPassPhraseNotContains) {
        this.privacyPassPhraseNotContains = privacyPassPhraseNotContains;
    }

    public SnmpTrapReceiverWhereInput privacyPassPhraseNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRIVACY_PASS_PHRASE_NOT_CONTAINS);
        return this;
    }

    public SnmpTrapReceiverWhereInput privacyPassPhraseNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRIVACY_PASS_PHRASE_NOT_CONTAINS);
        return this;
    }

    public void setPrivacyPassPhraseNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRIVACY_PASS_PHRASE_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRIVACY_PASS_PHRASE_NOT_CONTAINS);
        }
    }

    public boolean getPrivacyPassPhraseNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRIVACY_PASS_PHRASE_NOT_CONTAINS);
    }

    public SnmpTrapReceiverWhereInput privacyPassPhraseNotEndsWith(
            String privacyPassPhraseNotEndsWith) {

        this.privacyPassPhraseNotEndsWith = privacyPassPhraseNotEndsWith;
        return this;
    }

    /**
     * Get privacyPassPhraseNotEndsWith
     *
     * @return privacyPassPhraseNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPrivacyPassPhraseNotEndsWith() {
        return privacyPassPhraseNotEndsWith;
    }

    public void setPrivacyPassPhraseNotEndsWith(String privacyPassPhraseNotEndsWith) {
        this.privacyPassPhraseNotEndsWith = privacyPassPhraseNotEndsWith;
    }

    public SnmpTrapReceiverWhereInput privacyPassPhraseNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRIVACY_PASS_PHRASE_NOT_ENDS_WITH);
        return this;
    }

    public SnmpTrapReceiverWhereInput privacyPassPhraseNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRIVACY_PASS_PHRASE_NOT_ENDS_WITH);
        return this;
    }

    public void setPrivacyPassPhraseNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRIVACY_PASS_PHRASE_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRIVACY_PASS_PHRASE_NOT_ENDS_WITH);
        }
    }

    public boolean getPrivacyPassPhraseNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRIVACY_PASS_PHRASE_NOT_ENDS_WITH);
    }

    public SnmpTrapReceiverWhereInput privacyPassPhraseNotIn(List<String> privacyPassPhraseNotIn) {

        this.privacyPassPhraseNotIn = privacyPassPhraseNotIn;
        return this;
    }

    public SnmpTrapReceiverWhereInput addPrivacyPassPhraseNotInItem(
            String privacyPassPhraseNotInItem) {
        if (this.privacyPassPhraseNotIn == null) {
            this.privacyPassPhraseNotIn = new ArrayList<String>();
        }
        this.privacyPassPhraseNotIn.add(privacyPassPhraseNotInItem);
        return this;
    }

    /**
     * Get privacyPassPhraseNotIn
     *
     * @return privacyPassPhraseNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getPrivacyPassPhraseNotIn() {
        return privacyPassPhraseNotIn;
    }

    public void setPrivacyPassPhraseNotIn(List<String> privacyPassPhraseNotIn) {
        this.privacyPassPhraseNotIn = privacyPassPhraseNotIn;
    }

    public SnmpTrapReceiverWhereInput privacyPassPhraseNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRIVACY_PASS_PHRASE_NOT_IN);
        return this;
    }

    public SnmpTrapReceiverWhereInput privacyPassPhraseNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRIVACY_PASS_PHRASE_NOT_IN);
        return this;
    }

    public void setPrivacyPassPhraseNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRIVACY_PASS_PHRASE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRIVACY_PASS_PHRASE_NOT_IN);
        }
    }

    public boolean getPrivacyPassPhraseNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRIVACY_PASS_PHRASE_NOT_IN);
    }

    public SnmpTrapReceiverWhereInput privacyPassPhraseNotStartsWith(
            String privacyPassPhraseNotStartsWith) {

        this.privacyPassPhraseNotStartsWith = privacyPassPhraseNotStartsWith;
        return this;
    }

    /**
     * Get privacyPassPhraseNotStartsWith
     *
     * @return privacyPassPhraseNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPrivacyPassPhraseNotStartsWith() {
        return privacyPassPhraseNotStartsWith;
    }

    public void setPrivacyPassPhraseNotStartsWith(String privacyPassPhraseNotStartsWith) {
        this.privacyPassPhraseNotStartsWith = privacyPassPhraseNotStartsWith;
    }

    public SnmpTrapReceiverWhereInput privacyPassPhraseNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRIVACY_PASS_PHRASE_NOT_STARTS_WITH);
        return this;
    }

    public SnmpTrapReceiverWhereInput privacyPassPhraseNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRIVACY_PASS_PHRASE_NOT_STARTS_WITH);
        return this;
    }

    public void setPrivacyPassPhraseNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRIVACY_PASS_PHRASE_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRIVACY_PASS_PHRASE_NOT_STARTS_WITH);
        }
    }

    public boolean getPrivacyPassPhraseNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRIVACY_PASS_PHRASE_NOT_STARTS_WITH);
    }

    public SnmpTrapReceiverWhereInput privacyPassPhraseStartsWith(
            String privacyPassPhraseStartsWith) {

        this.privacyPassPhraseStartsWith = privacyPassPhraseStartsWith;
        return this;
    }

    /**
     * Get privacyPassPhraseStartsWith
     *
     * @return privacyPassPhraseStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPrivacyPassPhraseStartsWith() {
        return privacyPassPhraseStartsWith;
    }

    public void setPrivacyPassPhraseStartsWith(String privacyPassPhraseStartsWith) {
        this.privacyPassPhraseStartsWith = privacyPassPhraseStartsWith;
    }

    public SnmpTrapReceiverWhereInput privacyPassPhraseStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRIVACY_PASS_PHRASE_STARTS_WITH);
        return this;
    }

    public SnmpTrapReceiverWhereInput privacyPassPhraseStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRIVACY_PASS_PHRASE_STARTS_WITH);
        return this;
    }

    public void setPrivacyPassPhraseStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRIVACY_PASS_PHRASE_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRIVACY_PASS_PHRASE_STARTS_WITH);
        }
    }

    public boolean getPrivacyPassPhraseStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRIVACY_PASS_PHRASE_STARTS_WITH);
    }

    public SnmpTrapReceiverWhereInput privacyProtocol(SnmpPrivacyProtocol privacyProtocol) {

        this.privacyProtocol = privacyProtocol;
        return this;
    }

    /**
     * Get privacyProtocol
     *
     * @return privacyProtocol
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public SnmpPrivacyProtocol getPrivacyProtocol() {
        return privacyProtocol;
    }

    public void setPrivacyProtocol(SnmpPrivacyProtocol privacyProtocol) {
        this.privacyProtocol = privacyProtocol;
    }

    public SnmpTrapReceiverWhereInput privacyProtocol_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRIVACY_PROTOCOL);
        return this;
    }

    public SnmpTrapReceiverWhereInput privacyProtocol_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRIVACY_PROTOCOL);
        return this;
    }

    public void setPrivacyProtocol_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRIVACY_PROTOCOL);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRIVACY_PROTOCOL);
        }
    }

    public boolean getPrivacyProtocol_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRIVACY_PROTOCOL);
    }

    public SnmpTrapReceiverWhereInput privacyProtocolIn(
            List<SnmpPrivacyProtocol> privacyProtocolIn) {

        this.privacyProtocolIn = privacyProtocolIn;
        return this;
    }

    public SnmpTrapReceiverWhereInput addPrivacyProtocolInItem(
            SnmpPrivacyProtocol privacyProtocolInItem) {
        if (this.privacyProtocolIn == null) {
            this.privacyProtocolIn = new ArrayList<SnmpPrivacyProtocol>();
        }
        this.privacyProtocolIn.add(privacyProtocolInItem);
        return this;
    }

    /**
     * Get privacyProtocolIn
     *
     * @return privacyProtocolIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<SnmpPrivacyProtocol> getPrivacyProtocolIn() {
        return privacyProtocolIn;
    }

    public void setPrivacyProtocolIn(List<SnmpPrivacyProtocol> privacyProtocolIn) {
        this.privacyProtocolIn = privacyProtocolIn;
    }

    public SnmpTrapReceiverWhereInput privacyProtocolIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRIVACY_PROTOCOL_IN);
        return this;
    }

    public SnmpTrapReceiverWhereInput privacyProtocolIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRIVACY_PROTOCOL_IN);
        return this;
    }

    public void setPrivacyProtocolIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRIVACY_PROTOCOL_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRIVACY_PROTOCOL_IN);
        }
    }

    public boolean getPrivacyProtocolIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRIVACY_PROTOCOL_IN);
    }

    public SnmpTrapReceiverWhereInput privacyProtocolNot(SnmpPrivacyProtocol privacyProtocolNot) {

        this.privacyProtocolNot = privacyProtocolNot;
        return this;
    }

    /**
     * Get privacyProtocolNot
     *
     * @return privacyProtocolNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public SnmpPrivacyProtocol getPrivacyProtocolNot() {
        return privacyProtocolNot;
    }

    public void setPrivacyProtocolNot(SnmpPrivacyProtocol privacyProtocolNot) {
        this.privacyProtocolNot = privacyProtocolNot;
    }

    public SnmpTrapReceiverWhereInput privacyProtocolNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRIVACY_PROTOCOL_NOT);
        return this;
    }

    public SnmpTrapReceiverWhereInput privacyProtocolNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRIVACY_PROTOCOL_NOT);
        return this;
    }

    public void setPrivacyProtocolNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRIVACY_PROTOCOL_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRIVACY_PROTOCOL_NOT);
        }
    }

    public boolean getPrivacyProtocolNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRIVACY_PROTOCOL_NOT);
    }

    public SnmpTrapReceiverWhereInput privacyProtocolNotIn(
            List<SnmpPrivacyProtocol> privacyProtocolNotIn) {

        this.privacyProtocolNotIn = privacyProtocolNotIn;
        return this;
    }

    public SnmpTrapReceiverWhereInput addPrivacyProtocolNotInItem(
            SnmpPrivacyProtocol privacyProtocolNotInItem) {
        if (this.privacyProtocolNotIn == null) {
            this.privacyProtocolNotIn = new ArrayList<SnmpPrivacyProtocol>();
        }
        this.privacyProtocolNotIn.add(privacyProtocolNotInItem);
        return this;
    }

    /**
     * Get privacyProtocolNotIn
     *
     * @return privacyProtocolNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<SnmpPrivacyProtocol> getPrivacyProtocolNotIn() {
        return privacyProtocolNotIn;
    }

    public void setPrivacyProtocolNotIn(List<SnmpPrivacyProtocol> privacyProtocolNotIn) {
        this.privacyProtocolNotIn = privacyProtocolNotIn;
    }

    public SnmpTrapReceiverWhereInput privacyProtocolNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRIVACY_PROTOCOL_NOT_IN);
        return this;
    }

    public SnmpTrapReceiverWhereInput privacyProtocolNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRIVACY_PROTOCOL_NOT_IN);
        return this;
    }

    public void setPrivacyProtocolNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRIVACY_PROTOCOL_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRIVACY_PROTOCOL_NOT_IN);
        }
    }

    public boolean getPrivacyProtocolNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRIVACY_PROTOCOL_NOT_IN);
    }

    public SnmpTrapReceiverWhereInput protocol(SnmpProtocol protocol) {

        this.protocol = protocol;
        return this;
    }

    /**
     * Get protocol
     *
     * @return protocol
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public SnmpProtocol getProtocol() {
        return protocol;
    }

    public void setProtocol(SnmpProtocol protocol) {
        this.protocol = protocol;
    }

    public SnmpTrapReceiverWhereInput protocol_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PROTOCOL);
        return this;
    }

    public SnmpTrapReceiverWhereInput protocol_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PROTOCOL);
        return this;
    }

    public void setProtocol_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PROTOCOL);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PROTOCOL);
        }
    }

    public boolean getProtocol_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PROTOCOL);
    }

    public SnmpTrapReceiverWhereInput protocolIn(List<SnmpProtocol> protocolIn) {

        this.protocolIn = protocolIn;
        return this;
    }

    public SnmpTrapReceiverWhereInput addProtocolInItem(SnmpProtocol protocolInItem) {
        if (this.protocolIn == null) {
            this.protocolIn = new ArrayList<SnmpProtocol>();
        }
        this.protocolIn.add(protocolInItem);
        return this;
    }

    /**
     * Get protocolIn
     *
     * @return protocolIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<SnmpProtocol> getProtocolIn() {
        return protocolIn;
    }

    public void setProtocolIn(List<SnmpProtocol> protocolIn) {
        this.protocolIn = protocolIn;
    }

    public SnmpTrapReceiverWhereInput protocolIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PROTOCOL_IN);
        return this;
    }

    public SnmpTrapReceiverWhereInput protocolIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PROTOCOL_IN);
        return this;
    }

    public void setProtocolIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PROTOCOL_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PROTOCOL_IN);
        }
    }

    public boolean getProtocolIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PROTOCOL_IN);
    }

    public SnmpTrapReceiverWhereInput protocolNot(SnmpProtocol protocolNot) {

        this.protocolNot = protocolNot;
        return this;
    }

    /**
     * Get protocolNot
     *
     * @return protocolNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public SnmpProtocol getProtocolNot() {
        return protocolNot;
    }

    public void setProtocolNot(SnmpProtocol protocolNot) {
        this.protocolNot = protocolNot;
    }

    public SnmpTrapReceiverWhereInput protocolNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PROTOCOL_NOT);
        return this;
    }

    public SnmpTrapReceiverWhereInput protocolNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PROTOCOL_NOT);
        return this;
    }

    public void setProtocolNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PROTOCOL_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PROTOCOL_NOT);
        }
    }

    public boolean getProtocolNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PROTOCOL_NOT);
    }

    public SnmpTrapReceiverWhereInput protocolNotIn(List<SnmpProtocol> protocolNotIn) {

        this.protocolNotIn = protocolNotIn;
        return this;
    }

    public SnmpTrapReceiverWhereInput addProtocolNotInItem(SnmpProtocol protocolNotInItem) {
        if (this.protocolNotIn == null) {
            this.protocolNotIn = new ArrayList<SnmpProtocol>();
        }
        this.protocolNotIn.add(protocolNotInItem);
        return this;
    }

    /**
     * Get protocolNotIn
     *
     * @return protocolNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<SnmpProtocol> getProtocolNotIn() {
        return protocolNotIn;
    }

    public void setProtocolNotIn(List<SnmpProtocol> protocolNotIn) {
        this.protocolNotIn = protocolNotIn;
    }

    public SnmpTrapReceiverWhereInput protocolNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PROTOCOL_NOT_IN);
        return this;
    }

    public SnmpTrapReceiverWhereInput protocolNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PROTOCOL_NOT_IN);
        return this;
    }

    public void setProtocolNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PROTOCOL_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PROTOCOL_NOT_IN);
        }
    }

    public boolean getProtocolNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PROTOCOL_NOT_IN);
    }

    public SnmpTrapReceiverWhereInput username(String username) {

        this.username = username;
        return this;
    }

    /**
     * Get username
     *
     * @return username
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public SnmpTrapReceiverWhereInput username_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USERNAME);
        return this;
    }

    public SnmpTrapReceiverWhereInput username_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USERNAME);
        return this;
    }

    public void setUsername_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USERNAME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USERNAME);
        }
    }

    public boolean getUsername_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USERNAME);
    }

    public SnmpTrapReceiverWhereInput usernameContains(String usernameContains) {

        this.usernameContains = usernameContains;
        return this;
    }

    /**
     * Get usernameContains
     *
     * @return usernameContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUsernameContains() {
        return usernameContains;
    }

    public void setUsernameContains(String usernameContains) {
        this.usernameContains = usernameContains;
    }

    public SnmpTrapReceiverWhereInput usernameContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USERNAME_CONTAINS);
        return this;
    }

    public SnmpTrapReceiverWhereInput usernameContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USERNAME_CONTAINS);
        return this;
    }

    public void setUsernameContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USERNAME_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USERNAME_CONTAINS);
        }
    }

    public boolean getUsernameContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USERNAME_CONTAINS);
    }

    public SnmpTrapReceiverWhereInput usernameEndsWith(String usernameEndsWith) {

        this.usernameEndsWith = usernameEndsWith;
        return this;
    }

    /**
     * Get usernameEndsWith
     *
     * @return usernameEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUsernameEndsWith() {
        return usernameEndsWith;
    }

    public void setUsernameEndsWith(String usernameEndsWith) {
        this.usernameEndsWith = usernameEndsWith;
    }

    public SnmpTrapReceiverWhereInput usernameEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USERNAME_ENDS_WITH);
        return this;
    }

    public SnmpTrapReceiverWhereInput usernameEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USERNAME_ENDS_WITH);
        return this;
    }

    public void setUsernameEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USERNAME_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USERNAME_ENDS_WITH);
        }
    }

    public boolean getUsernameEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USERNAME_ENDS_WITH);
    }

    public SnmpTrapReceiverWhereInput usernameGt(String usernameGt) {

        this.usernameGt = usernameGt;
        return this;
    }

    /**
     * Get usernameGt
     *
     * @return usernameGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUsernameGt() {
        return usernameGt;
    }

    public void setUsernameGt(String usernameGt) {
        this.usernameGt = usernameGt;
    }

    public SnmpTrapReceiverWhereInput usernameGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USERNAME_GT);
        return this;
    }

    public SnmpTrapReceiverWhereInput usernameGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USERNAME_GT);
        return this;
    }

    public void setUsernameGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USERNAME_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USERNAME_GT);
        }
    }

    public boolean getUsernameGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USERNAME_GT);
    }

    public SnmpTrapReceiverWhereInput usernameGte(String usernameGte) {

        this.usernameGte = usernameGte;
        return this;
    }

    /**
     * Get usernameGte
     *
     * @return usernameGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUsernameGte() {
        return usernameGte;
    }

    public void setUsernameGte(String usernameGte) {
        this.usernameGte = usernameGte;
    }

    public SnmpTrapReceiverWhereInput usernameGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USERNAME_GTE);
        return this;
    }

    public SnmpTrapReceiverWhereInput usernameGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USERNAME_GTE);
        return this;
    }

    public void setUsernameGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USERNAME_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USERNAME_GTE);
        }
    }

    public boolean getUsernameGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USERNAME_GTE);
    }

    public SnmpTrapReceiverWhereInput usernameIn(List<String> usernameIn) {

        this.usernameIn = usernameIn;
        return this;
    }

    public SnmpTrapReceiverWhereInput addUsernameInItem(String usernameInItem) {
        if (this.usernameIn == null) {
            this.usernameIn = new ArrayList<String>();
        }
        this.usernameIn.add(usernameInItem);
        return this;
    }

    /**
     * Get usernameIn
     *
     * @return usernameIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getUsernameIn() {
        return usernameIn;
    }

    public void setUsernameIn(List<String> usernameIn) {
        this.usernameIn = usernameIn;
    }

    public SnmpTrapReceiverWhereInput usernameIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USERNAME_IN);
        return this;
    }

    public SnmpTrapReceiverWhereInput usernameIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USERNAME_IN);
        return this;
    }

    public void setUsernameIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USERNAME_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USERNAME_IN);
        }
    }

    public boolean getUsernameIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USERNAME_IN);
    }

    public SnmpTrapReceiverWhereInput usernameLt(String usernameLt) {

        this.usernameLt = usernameLt;
        return this;
    }

    /**
     * Get usernameLt
     *
     * @return usernameLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUsernameLt() {
        return usernameLt;
    }

    public void setUsernameLt(String usernameLt) {
        this.usernameLt = usernameLt;
    }

    public SnmpTrapReceiverWhereInput usernameLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USERNAME_LT);
        return this;
    }

    public SnmpTrapReceiverWhereInput usernameLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USERNAME_LT);
        return this;
    }

    public void setUsernameLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USERNAME_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USERNAME_LT);
        }
    }

    public boolean getUsernameLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USERNAME_LT);
    }

    public SnmpTrapReceiverWhereInput usernameLte(String usernameLte) {

        this.usernameLte = usernameLte;
        return this;
    }

    /**
     * Get usernameLte
     *
     * @return usernameLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUsernameLte() {
        return usernameLte;
    }

    public void setUsernameLte(String usernameLte) {
        this.usernameLte = usernameLte;
    }

    public SnmpTrapReceiverWhereInput usernameLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USERNAME_LTE);
        return this;
    }

    public SnmpTrapReceiverWhereInput usernameLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USERNAME_LTE);
        return this;
    }

    public void setUsernameLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USERNAME_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USERNAME_LTE);
        }
    }

    public boolean getUsernameLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USERNAME_LTE);
    }

    public SnmpTrapReceiverWhereInput usernameNot(String usernameNot) {

        this.usernameNot = usernameNot;
        return this;
    }

    /**
     * Get usernameNot
     *
     * @return usernameNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUsernameNot() {
        return usernameNot;
    }

    public void setUsernameNot(String usernameNot) {
        this.usernameNot = usernameNot;
    }

    public SnmpTrapReceiverWhereInput usernameNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USERNAME_NOT);
        return this;
    }

    public SnmpTrapReceiverWhereInput usernameNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USERNAME_NOT);
        return this;
    }

    public void setUsernameNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USERNAME_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USERNAME_NOT);
        }
    }

    public boolean getUsernameNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USERNAME_NOT);
    }

    public SnmpTrapReceiverWhereInput usernameNotContains(String usernameNotContains) {

        this.usernameNotContains = usernameNotContains;
        return this;
    }

    /**
     * Get usernameNotContains
     *
     * @return usernameNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUsernameNotContains() {
        return usernameNotContains;
    }

    public void setUsernameNotContains(String usernameNotContains) {
        this.usernameNotContains = usernameNotContains;
    }

    public SnmpTrapReceiverWhereInput usernameNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USERNAME_NOT_CONTAINS);
        return this;
    }

    public SnmpTrapReceiverWhereInput usernameNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USERNAME_NOT_CONTAINS);
        return this;
    }

    public void setUsernameNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USERNAME_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USERNAME_NOT_CONTAINS);
        }
    }

    public boolean getUsernameNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USERNAME_NOT_CONTAINS);
    }

    public SnmpTrapReceiverWhereInput usernameNotEndsWith(String usernameNotEndsWith) {

        this.usernameNotEndsWith = usernameNotEndsWith;
        return this;
    }

    /**
     * Get usernameNotEndsWith
     *
     * @return usernameNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUsernameNotEndsWith() {
        return usernameNotEndsWith;
    }

    public void setUsernameNotEndsWith(String usernameNotEndsWith) {
        this.usernameNotEndsWith = usernameNotEndsWith;
    }

    public SnmpTrapReceiverWhereInput usernameNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USERNAME_NOT_ENDS_WITH);
        return this;
    }

    public SnmpTrapReceiverWhereInput usernameNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USERNAME_NOT_ENDS_WITH);
        return this;
    }

    public void setUsernameNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USERNAME_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USERNAME_NOT_ENDS_WITH);
        }
    }

    public boolean getUsernameNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USERNAME_NOT_ENDS_WITH);
    }

    public SnmpTrapReceiverWhereInput usernameNotIn(List<String> usernameNotIn) {

        this.usernameNotIn = usernameNotIn;
        return this;
    }

    public SnmpTrapReceiverWhereInput addUsernameNotInItem(String usernameNotInItem) {
        if (this.usernameNotIn == null) {
            this.usernameNotIn = new ArrayList<String>();
        }
        this.usernameNotIn.add(usernameNotInItem);
        return this;
    }

    /**
     * Get usernameNotIn
     *
     * @return usernameNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getUsernameNotIn() {
        return usernameNotIn;
    }

    public void setUsernameNotIn(List<String> usernameNotIn) {
        this.usernameNotIn = usernameNotIn;
    }

    public SnmpTrapReceiverWhereInput usernameNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USERNAME_NOT_IN);
        return this;
    }

    public SnmpTrapReceiverWhereInput usernameNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USERNAME_NOT_IN);
        return this;
    }

    public void setUsernameNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USERNAME_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USERNAME_NOT_IN);
        }
    }

    public boolean getUsernameNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USERNAME_NOT_IN);
    }

    public SnmpTrapReceiverWhereInput usernameNotStartsWith(String usernameNotStartsWith) {

        this.usernameNotStartsWith = usernameNotStartsWith;
        return this;
    }

    /**
     * Get usernameNotStartsWith
     *
     * @return usernameNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUsernameNotStartsWith() {
        return usernameNotStartsWith;
    }

    public void setUsernameNotStartsWith(String usernameNotStartsWith) {
        this.usernameNotStartsWith = usernameNotStartsWith;
    }

    public SnmpTrapReceiverWhereInput usernameNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USERNAME_NOT_STARTS_WITH);
        return this;
    }

    public SnmpTrapReceiverWhereInput usernameNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USERNAME_NOT_STARTS_WITH);
        return this;
    }

    public void setUsernameNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USERNAME_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USERNAME_NOT_STARTS_WITH);
        }
    }

    public boolean getUsernameNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USERNAME_NOT_STARTS_WITH);
    }

    public SnmpTrapReceiverWhereInput usernameStartsWith(String usernameStartsWith) {

        this.usernameStartsWith = usernameStartsWith;
        return this;
    }

    /**
     * Get usernameStartsWith
     *
     * @return usernameStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUsernameStartsWith() {
        return usernameStartsWith;
    }

    public void setUsernameStartsWith(String usernameStartsWith) {
        this.usernameStartsWith = usernameStartsWith;
    }

    public SnmpTrapReceiverWhereInput usernameStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USERNAME_STARTS_WITH);
        return this;
    }

    public SnmpTrapReceiverWhereInput usernameStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USERNAME_STARTS_WITH);
        return this;
    }

    public void setUsernameStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USERNAME_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USERNAME_STARTS_WITH);
        }
    }

    public boolean getUsernameStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USERNAME_STARTS_WITH);
    }

    public SnmpTrapReceiverWhereInput version(SnmpVersion version) {

        this.version = version;
        return this;
    }

    /**
     * Get version
     *
     * @return version
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public SnmpVersion getVersion() {
        return version;
    }

    public void setVersion(SnmpVersion version) {
        this.version = version;
    }

    public SnmpTrapReceiverWhereInput version_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VERSION);
        return this;
    }

    public SnmpTrapReceiverWhereInput version_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VERSION);
        return this;
    }

    public void setVersion_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VERSION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VERSION);
        }
    }

    public boolean getVersion_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VERSION);
    }

    public SnmpTrapReceiverWhereInput versionIn(List<SnmpVersion> versionIn) {

        this.versionIn = versionIn;
        return this;
    }

    public SnmpTrapReceiverWhereInput addVersionInItem(SnmpVersion versionInItem) {
        if (this.versionIn == null) {
            this.versionIn = new ArrayList<SnmpVersion>();
        }
        this.versionIn.add(versionInItem);
        return this;
    }

    /**
     * Get versionIn
     *
     * @return versionIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<SnmpVersion> getVersionIn() {
        return versionIn;
    }

    public void setVersionIn(List<SnmpVersion> versionIn) {
        this.versionIn = versionIn;
    }

    public SnmpTrapReceiverWhereInput versionIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VERSION_IN);
        return this;
    }

    public SnmpTrapReceiverWhereInput versionIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VERSION_IN);
        return this;
    }

    public void setVersionIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VERSION_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VERSION_IN);
        }
    }

    public boolean getVersionIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VERSION_IN);
    }

    public SnmpTrapReceiverWhereInput versionNot(SnmpVersion versionNot) {

        this.versionNot = versionNot;
        return this;
    }

    /**
     * Get versionNot
     *
     * @return versionNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public SnmpVersion getVersionNot() {
        return versionNot;
    }

    public void setVersionNot(SnmpVersion versionNot) {
        this.versionNot = versionNot;
    }

    public SnmpTrapReceiverWhereInput versionNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VERSION_NOT);
        return this;
    }

    public SnmpTrapReceiverWhereInput versionNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VERSION_NOT);
        return this;
    }

    public void setVersionNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VERSION_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VERSION_NOT);
        }
    }

    public boolean getVersionNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VERSION_NOT);
    }

    public SnmpTrapReceiverWhereInput versionNotIn(List<SnmpVersion> versionNotIn) {

        this.versionNotIn = versionNotIn;
        return this;
    }

    public SnmpTrapReceiverWhereInput addVersionNotInItem(SnmpVersion versionNotInItem) {
        if (this.versionNotIn == null) {
            this.versionNotIn = new ArrayList<SnmpVersion>();
        }
        this.versionNotIn.add(versionNotInItem);
        return this;
    }

    /**
     * Get versionNotIn
     *
     * @return versionNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<SnmpVersion> getVersionNotIn() {
        return versionNotIn;
    }

    public void setVersionNotIn(List<SnmpVersion> versionNotIn) {
        this.versionNotIn = versionNotIn;
    }

    public SnmpTrapReceiverWhereInput versionNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VERSION_NOT_IN);
        return this;
    }

    public SnmpTrapReceiverWhereInput versionNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VERSION_NOT_IN);
        return this;
    }

    public void setVersionNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VERSION_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VERSION_NOT_IN);
        }
    }

    public boolean getVersionNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VERSION_NOT_IN);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SnmpTrapReceiverWhereInput snmpTrapReceiverWhereInput = (SnmpTrapReceiverWhereInput) o;
        return Objects.equals(this.AND, snmpTrapReceiverWhereInput.AND)
                && Objects.equals(this.NOT, snmpTrapReceiverWhereInput.NOT)
                && Objects.equals(this.OR, snmpTrapReceiverWhereInput.OR)
                && Objects.equals(this.authPassPhrase, snmpTrapReceiverWhereInput.authPassPhrase)
                && Objects.equals(
                        this.authPassPhraseContains,
                        snmpTrapReceiverWhereInput.authPassPhraseContains)
                && Objects.equals(
                        this.authPassPhraseEndsWith,
                        snmpTrapReceiverWhereInput.authPassPhraseEndsWith)
                && Objects.equals(
                        this.authPassPhraseGt, snmpTrapReceiverWhereInput.authPassPhraseGt)
                && Objects.equals(
                        this.authPassPhraseGte, snmpTrapReceiverWhereInput.authPassPhraseGte)
                && Objects.equals(
                        this.authPassPhraseIn, snmpTrapReceiverWhereInput.authPassPhraseIn)
                && Objects.equals(
                        this.authPassPhraseLt, snmpTrapReceiverWhereInput.authPassPhraseLt)
                && Objects.equals(
                        this.authPassPhraseLte, snmpTrapReceiverWhereInput.authPassPhraseLte)
                && Objects.equals(
                        this.authPassPhraseNot, snmpTrapReceiverWhereInput.authPassPhraseNot)
                && Objects.equals(
                        this.authPassPhraseNotContains,
                        snmpTrapReceiverWhereInput.authPassPhraseNotContains)
                && Objects.equals(
                        this.authPassPhraseNotEndsWith,
                        snmpTrapReceiverWhereInput.authPassPhraseNotEndsWith)
                && Objects.equals(
                        this.authPassPhraseNotIn, snmpTrapReceiverWhereInput.authPassPhraseNotIn)
                && Objects.equals(
                        this.authPassPhraseNotStartsWith,
                        snmpTrapReceiverWhereInput.authPassPhraseNotStartsWith)
                && Objects.equals(
                        this.authPassPhraseStartsWith,
                        snmpTrapReceiverWhereInput.authPassPhraseStartsWith)
                && Objects.equals(this.authProtocol, snmpTrapReceiverWhereInput.authProtocol)
                && Objects.equals(this.authProtocolIn, snmpTrapReceiverWhereInput.authProtocolIn)
                && Objects.equals(this.authProtocolNot, snmpTrapReceiverWhereInput.authProtocolNot)
                && Objects.equals(
                        this.authProtocolNotIn, snmpTrapReceiverWhereInput.authProtocolNotIn)
                && Objects.equals(this.cluster, snmpTrapReceiverWhereInput.cluster)
                && Objects.equals(this.community, snmpTrapReceiverWhereInput.community)
                && Objects.equals(
                        this.communityContains, snmpTrapReceiverWhereInput.communityContains)
                && Objects.equals(
                        this.communityEndsWith, snmpTrapReceiverWhereInput.communityEndsWith)
                && Objects.equals(this.communityGt, snmpTrapReceiverWhereInput.communityGt)
                && Objects.equals(this.communityGte, snmpTrapReceiverWhereInput.communityGte)
                && Objects.equals(this.communityIn, snmpTrapReceiverWhereInput.communityIn)
                && Objects.equals(this.communityLt, snmpTrapReceiverWhereInput.communityLt)
                && Objects.equals(this.communityLte, snmpTrapReceiverWhereInput.communityLte)
                && Objects.equals(this.communityNot, snmpTrapReceiverWhereInput.communityNot)
                && Objects.equals(
                        this.communityNotContains, snmpTrapReceiverWhereInput.communityNotContains)
                && Objects.equals(
                        this.communityNotEndsWith, snmpTrapReceiverWhereInput.communityNotEndsWith)
                && Objects.equals(this.communityNotIn, snmpTrapReceiverWhereInput.communityNotIn)
                && Objects.equals(
                        this.communityNotStartsWith,
                        snmpTrapReceiverWhereInput.communityNotStartsWith)
                && Objects.equals(
                        this.communityStartsWith, snmpTrapReceiverWhereInput.communityStartsWith)
                && Objects.equals(this.disabled, snmpTrapReceiverWhereInput.disabled)
                && Objects.equals(this.disabledNot, snmpTrapReceiverWhereInput.disabledNot)
                && Objects.equals(this.engineId, snmpTrapReceiverWhereInput.engineId)
                && Objects.equals(
                        this.engineIdContains, snmpTrapReceiverWhereInput.engineIdContains)
                && Objects.equals(
                        this.engineIdEndsWith, snmpTrapReceiverWhereInput.engineIdEndsWith)
                && Objects.equals(this.engineIdGt, snmpTrapReceiverWhereInput.engineIdGt)
                && Objects.equals(this.engineIdGte, snmpTrapReceiverWhereInput.engineIdGte)
                && Objects.equals(this.engineIdIn, snmpTrapReceiverWhereInput.engineIdIn)
                && Objects.equals(this.engineIdLt, snmpTrapReceiverWhereInput.engineIdLt)
                && Objects.equals(this.engineIdLte, snmpTrapReceiverWhereInput.engineIdLte)
                && Objects.equals(this.engineIdNot, snmpTrapReceiverWhereInput.engineIdNot)
                && Objects.equals(
                        this.engineIdNotContains, snmpTrapReceiverWhereInput.engineIdNotContains)
                && Objects.equals(
                        this.engineIdNotEndsWith, snmpTrapReceiverWhereInput.engineIdNotEndsWith)
                && Objects.equals(this.engineIdNotIn, snmpTrapReceiverWhereInput.engineIdNotIn)
                && Objects.equals(
                        this.engineIdNotStartsWith,
                        snmpTrapReceiverWhereInput.engineIdNotStartsWith)
                && Objects.equals(
                        this.engineIdStartsWith, snmpTrapReceiverWhereInput.engineIdStartsWith)
                && Objects.equals(
                        this.entityAsyncStatus, snmpTrapReceiverWhereInput.entityAsyncStatus)
                && Objects.equals(
                        this.entityAsyncStatusIn, snmpTrapReceiverWhereInput.entityAsyncStatusIn)
                && Objects.equals(
                        this.entityAsyncStatusNot, snmpTrapReceiverWhereInput.entityAsyncStatusNot)
                && Objects.equals(
                        this.entityAsyncStatusNotIn,
                        snmpTrapReceiverWhereInput.entityAsyncStatusNotIn)
                && Objects.equals(this.host, snmpTrapReceiverWhereInput.host)
                && Objects.equals(this.hostContains, snmpTrapReceiverWhereInput.hostContains)
                && Objects.equals(this.hostEndsWith, snmpTrapReceiverWhereInput.hostEndsWith)
                && Objects.equals(this.hostGt, snmpTrapReceiverWhereInput.hostGt)
                && Objects.equals(this.hostGte, snmpTrapReceiverWhereInput.hostGte)
                && Objects.equals(this.hostIn, snmpTrapReceiverWhereInput.hostIn)
                && Objects.equals(this.hostLt, snmpTrapReceiverWhereInput.hostLt)
                && Objects.equals(this.hostLte, snmpTrapReceiverWhereInput.hostLte)
                && Objects.equals(this.hostNot, snmpTrapReceiverWhereInput.hostNot)
                && Objects.equals(this.hostNotContains, snmpTrapReceiverWhereInput.hostNotContains)
                && Objects.equals(this.hostNotEndsWith, snmpTrapReceiverWhereInput.hostNotEndsWith)
                && Objects.equals(this.hostNotIn, snmpTrapReceiverWhereInput.hostNotIn)
                && Objects.equals(
                        this.hostNotStartsWith, snmpTrapReceiverWhereInput.hostNotStartsWith)
                && Objects.equals(this.hostStartsWith, snmpTrapReceiverWhereInput.hostStartsWith)
                && Objects.equals(this.id, snmpTrapReceiverWhereInput.id)
                && Objects.equals(this.idContains, snmpTrapReceiverWhereInput.idContains)
                && Objects.equals(this.idEndsWith, snmpTrapReceiverWhereInput.idEndsWith)
                && Objects.equals(this.idGt, snmpTrapReceiverWhereInput.idGt)
                && Objects.equals(this.idGte, snmpTrapReceiverWhereInput.idGte)
                && Objects.equals(this.idIn, snmpTrapReceiverWhereInput.idIn)
                && Objects.equals(this.idLt, snmpTrapReceiverWhereInput.idLt)
                && Objects.equals(this.idLte, snmpTrapReceiverWhereInput.idLte)
                && Objects.equals(this.idNot, snmpTrapReceiverWhereInput.idNot)
                && Objects.equals(this.idNotContains, snmpTrapReceiverWhereInput.idNotContains)
                && Objects.equals(this.idNotEndsWith, snmpTrapReceiverWhereInput.idNotEndsWith)
                && Objects.equals(this.idNotIn, snmpTrapReceiverWhereInput.idNotIn)
                && Objects.equals(this.idNotStartsWith, snmpTrapReceiverWhereInput.idNotStartsWith)
                && Objects.equals(this.idStartsWith, snmpTrapReceiverWhereInput.idStartsWith)
                && Objects.equals(this.inform, snmpTrapReceiverWhereInput.inform)
                && Objects.equals(this.informNot, snmpTrapReceiverWhereInput.informNot)
                && Objects.equals(this.languageCode, snmpTrapReceiverWhereInput.languageCode)
                && Objects.equals(this.languageCodeIn, snmpTrapReceiverWhereInput.languageCodeIn)
                && Objects.equals(this.languageCodeNot, snmpTrapReceiverWhereInput.languageCodeNot)
                && Objects.equals(
                        this.languageCodeNotIn, snmpTrapReceiverWhereInput.languageCodeNotIn)
                && Objects.equals(this.localId, snmpTrapReceiverWhereInput.localId)
                && Objects.equals(this.localIdContains, snmpTrapReceiverWhereInput.localIdContains)
                && Objects.equals(this.localIdEndsWith, snmpTrapReceiverWhereInput.localIdEndsWith)
                && Objects.equals(this.localIdGt, snmpTrapReceiverWhereInput.localIdGt)
                && Objects.equals(this.localIdGte, snmpTrapReceiverWhereInput.localIdGte)
                && Objects.equals(this.localIdIn, snmpTrapReceiverWhereInput.localIdIn)
                && Objects.equals(this.localIdLt, snmpTrapReceiverWhereInput.localIdLt)
                && Objects.equals(this.localIdLte, snmpTrapReceiverWhereInput.localIdLte)
                && Objects.equals(this.localIdNot, snmpTrapReceiverWhereInput.localIdNot)
                && Objects.equals(
                        this.localIdNotContains, snmpTrapReceiverWhereInput.localIdNotContains)
                && Objects.equals(
                        this.localIdNotEndsWith, snmpTrapReceiverWhereInput.localIdNotEndsWith)
                && Objects.equals(this.localIdNotIn, snmpTrapReceiverWhereInput.localIdNotIn)
                && Objects.equals(
                        this.localIdNotStartsWith, snmpTrapReceiverWhereInput.localIdNotStartsWith)
                && Objects.equals(
                        this.localIdStartsWith, snmpTrapReceiverWhereInput.localIdStartsWith)
                && Objects.equals(this.name, snmpTrapReceiverWhereInput.name)
                && Objects.equals(this.nameContains, snmpTrapReceiverWhereInput.nameContains)
                && Objects.equals(this.nameEndsWith, snmpTrapReceiverWhereInput.nameEndsWith)
                && Objects.equals(this.nameGt, snmpTrapReceiverWhereInput.nameGt)
                && Objects.equals(this.nameGte, snmpTrapReceiverWhereInput.nameGte)
                && Objects.equals(this.nameIn, snmpTrapReceiverWhereInput.nameIn)
                && Objects.equals(this.nameLt, snmpTrapReceiverWhereInput.nameLt)
                && Objects.equals(this.nameLte, snmpTrapReceiverWhereInput.nameLte)
                && Objects.equals(this.nameNot, snmpTrapReceiverWhereInput.nameNot)
                && Objects.equals(this.nameNotContains, snmpTrapReceiverWhereInput.nameNotContains)
                && Objects.equals(this.nameNotEndsWith, snmpTrapReceiverWhereInput.nameNotEndsWith)
                && Objects.equals(this.nameNotIn, snmpTrapReceiverWhereInput.nameNotIn)
                && Objects.equals(
                        this.nameNotStartsWith, snmpTrapReceiverWhereInput.nameNotStartsWith)
                && Objects.equals(this.nameStartsWith, snmpTrapReceiverWhereInput.nameStartsWith)
                && Objects.equals(this.port, snmpTrapReceiverWhereInput.port)
                && Objects.equals(this.portGt, snmpTrapReceiverWhereInput.portGt)
                && Objects.equals(this.portGte, snmpTrapReceiverWhereInput.portGte)
                && Objects.equals(this.portIn, snmpTrapReceiverWhereInput.portIn)
                && Objects.equals(this.portLt, snmpTrapReceiverWhereInput.portLt)
                && Objects.equals(this.portLte, snmpTrapReceiverWhereInput.portLte)
                && Objects.equals(this.portNot, snmpTrapReceiverWhereInput.portNot)
                && Objects.equals(this.portNotIn, snmpTrapReceiverWhereInput.portNotIn)
                && Objects.equals(
                        this.privacyPassPhrase, snmpTrapReceiverWhereInput.privacyPassPhrase)
                && Objects.equals(
                        this.privacyPassPhraseContains,
                        snmpTrapReceiverWhereInput.privacyPassPhraseContains)
                && Objects.equals(
                        this.privacyPassPhraseEndsWith,
                        snmpTrapReceiverWhereInput.privacyPassPhraseEndsWith)
                && Objects.equals(
                        this.privacyPassPhraseGt, snmpTrapReceiverWhereInput.privacyPassPhraseGt)
                && Objects.equals(
                        this.privacyPassPhraseGte, snmpTrapReceiverWhereInput.privacyPassPhraseGte)
                && Objects.equals(
                        this.privacyPassPhraseIn, snmpTrapReceiverWhereInput.privacyPassPhraseIn)
                && Objects.equals(
                        this.privacyPassPhraseLt, snmpTrapReceiverWhereInput.privacyPassPhraseLt)
                && Objects.equals(
                        this.privacyPassPhraseLte, snmpTrapReceiverWhereInput.privacyPassPhraseLte)
                && Objects.equals(
                        this.privacyPassPhraseNot, snmpTrapReceiverWhereInput.privacyPassPhraseNot)
                && Objects.equals(
                        this.privacyPassPhraseNotContains,
                        snmpTrapReceiverWhereInput.privacyPassPhraseNotContains)
                && Objects.equals(
                        this.privacyPassPhraseNotEndsWith,
                        snmpTrapReceiverWhereInput.privacyPassPhraseNotEndsWith)
                && Objects.equals(
                        this.privacyPassPhraseNotIn,
                        snmpTrapReceiverWhereInput.privacyPassPhraseNotIn)
                && Objects.equals(
                        this.privacyPassPhraseNotStartsWith,
                        snmpTrapReceiverWhereInput.privacyPassPhraseNotStartsWith)
                && Objects.equals(
                        this.privacyPassPhraseStartsWith,
                        snmpTrapReceiverWhereInput.privacyPassPhraseStartsWith)
                && Objects.equals(this.privacyProtocol, snmpTrapReceiverWhereInput.privacyProtocol)
                && Objects.equals(
                        this.privacyProtocolIn, snmpTrapReceiverWhereInput.privacyProtocolIn)
                && Objects.equals(
                        this.privacyProtocolNot, snmpTrapReceiverWhereInput.privacyProtocolNot)
                && Objects.equals(
                        this.privacyProtocolNotIn, snmpTrapReceiverWhereInput.privacyProtocolNotIn)
                && Objects.equals(this.protocol, snmpTrapReceiverWhereInput.protocol)
                && Objects.equals(this.protocolIn, snmpTrapReceiverWhereInput.protocolIn)
                && Objects.equals(this.protocolNot, snmpTrapReceiverWhereInput.protocolNot)
                && Objects.equals(this.protocolNotIn, snmpTrapReceiverWhereInput.protocolNotIn)
                && Objects.equals(this.username, snmpTrapReceiverWhereInput.username)
                && Objects.equals(
                        this.usernameContains, snmpTrapReceiverWhereInput.usernameContains)
                && Objects.equals(
                        this.usernameEndsWith, snmpTrapReceiverWhereInput.usernameEndsWith)
                && Objects.equals(this.usernameGt, snmpTrapReceiverWhereInput.usernameGt)
                && Objects.equals(this.usernameGte, snmpTrapReceiverWhereInput.usernameGte)
                && Objects.equals(this.usernameIn, snmpTrapReceiverWhereInput.usernameIn)
                && Objects.equals(this.usernameLt, snmpTrapReceiverWhereInput.usernameLt)
                && Objects.equals(this.usernameLte, snmpTrapReceiverWhereInput.usernameLte)
                && Objects.equals(this.usernameNot, snmpTrapReceiverWhereInput.usernameNot)
                && Objects.equals(
                        this.usernameNotContains, snmpTrapReceiverWhereInput.usernameNotContains)
                && Objects.equals(
                        this.usernameNotEndsWith, snmpTrapReceiverWhereInput.usernameNotEndsWith)
                && Objects.equals(this.usernameNotIn, snmpTrapReceiverWhereInput.usernameNotIn)
                && Objects.equals(
                        this.usernameNotStartsWith,
                        snmpTrapReceiverWhereInput.usernameNotStartsWith)
                && Objects.equals(
                        this.usernameStartsWith, snmpTrapReceiverWhereInput.usernameStartsWith)
                && Objects.equals(this.version, snmpTrapReceiverWhereInput.version)
                && Objects.equals(this.versionIn, snmpTrapReceiverWhereInput.versionIn)
                && Objects.equals(this.versionNot, snmpTrapReceiverWhereInput.versionNot)
                && Objects.equals(this.versionNotIn, snmpTrapReceiverWhereInput.versionNotIn);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null
                        && b != null
                        && a.isPresent()
                        && b.isPresent()
                        && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                AND,
                NOT,
                OR,
                authPassPhrase,
                authPassPhraseContains,
                authPassPhraseEndsWith,
                authPassPhraseGt,
                authPassPhraseGte,
                authPassPhraseIn,
                authPassPhraseLt,
                authPassPhraseLte,
                authPassPhraseNot,
                authPassPhraseNotContains,
                authPassPhraseNotEndsWith,
                authPassPhraseNotIn,
                authPassPhraseNotStartsWith,
                authPassPhraseStartsWith,
                authProtocol,
                authProtocolIn,
                authProtocolNot,
                authProtocolNotIn,
                cluster,
                community,
                communityContains,
                communityEndsWith,
                communityGt,
                communityGte,
                communityIn,
                communityLt,
                communityLte,
                communityNot,
                communityNotContains,
                communityNotEndsWith,
                communityNotIn,
                communityNotStartsWith,
                communityStartsWith,
                disabled,
                disabledNot,
                engineId,
                engineIdContains,
                engineIdEndsWith,
                engineIdGt,
                engineIdGte,
                engineIdIn,
                engineIdLt,
                engineIdLte,
                engineIdNot,
                engineIdNotContains,
                engineIdNotEndsWith,
                engineIdNotIn,
                engineIdNotStartsWith,
                engineIdStartsWith,
                entityAsyncStatus,
                entityAsyncStatusIn,
                entityAsyncStatusNot,
                entityAsyncStatusNotIn,
                host,
                hostContains,
                hostEndsWith,
                hostGt,
                hostGte,
                hostIn,
                hostLt,
                hostLte,
                hostNot,
                hostNotContains,
                hostNotEndsWith,
                hostNotIn,
                hostNotStartsWith,
                hostStartsWith,
                id,
                idContains,
                idEndsWith,
                idGt,
                idGte,
                idIn,
                idLt,
                idLte,
                idNot,
                idNotContains,
                idNotEndsWith,
                idNotIn,
                idNotStartsWith,
                idStartsWith,
                inform,
                informNot,
                languageCode,
                languageCodeIn,
                languageCodeNot,
                languageCodeNotIn,
                localId,
                localIdContains,
                localIdEndsWith,
                localIdGt,
                localIdGte,
                localIdIn,
                localIdLt,
                localIdLte,
                localIdNot,
                localIdNotContains,
                localIdNotEndsWith,
                localIdNotIn,
                localIdNotStartsWith,
                localIdStartsWith,
                name,
                nameContains,
                nameEndsWith,
                nameGt,
                nameGte,
                nameIn,
                nameLt,
                nameLte,
                nameNot,
                nameNotContains,
                nameNotEndsWith,
                nameNotIn,
                nameNotStartsWith,
                nameStartsWith,
                port,
                portGt,
                portGte,
                portIn,
                portLt,
                portLte,
                portNot,
                portNotIn,
                privacyPassPhrase,
                privacyPassPhraseContains,
                privacyPassPhraseEndsWith,
                privacyPassPhraseGt,
                privacyPassPhraseGte,
                privacyPassPhraseIn,
                privacyPassPhraseLt,
                privacyPassPhraseLte,
                privacyPassPhraseNot,
                privacyPassPhraseNotContains,
                privacyPassPhraseNotEndsWith,
                privacyPassPhraseNotIn,
                privacyPassPhraseNotStartsWith,
                privacyPassPhraseStartsWith,
                privacyProtocol,
                privacyProtocolIn,
                privacyProtocolNot,
                privacyProtocolNotIn,
                protocol,
                protocolIn,
                protocolNot,
                protocolNotIn,
                username,
                usernameContains,
                usernameEndsWith,
                usernameGt,
                usernameGte,
                usernameIn,
                usernameLt,
                usernameLte,
                usernameNot,
                usernameNotContains,
                usernameNotEndsWith,
                usernameNotIn,
                usernameNotStartsWith,
                usernameStartsWith,
                version,
                versionIn,
                versionNot,
                versionNotIn);
    }

    private static <T> int hashCodeNullable(JsonNullable<T> a) {
        if (a == null) {
            return 1;
        }
        return a.isPresent() ? Arrays.deepHashCode(new Object[] {a.get()}) : 31;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SnmpTrapReceiverWhereInput {\n");
        sb.append("    AND: ").append(toIndentedString(AND)).append("\n");
        sb.append("    NOT: ").append(toIndentedString(NOT)).append("\n");
        sb.append("    OR: ").append(toIndentedString(OR)).append("\n");
        sb.append("    authPassPhrase: ").append(toIndentedString(authPassPhrase)).append("\n");
        sb.append("    authPassPhraseContains: ")
                .append(toIndentedString(authPassPhraseContains))
                .append("\n");
        sb.append("    authPassPhraseEndsWith: ")
                .append(toIndentedString(authPassPhraseEndsWith))
                .append("\n");
        sb.append("    authPassPhraseGt: ").append(toIndentedString(authPassPhraseGt)).append("\n");
        sb.append("    authPassPhraseGte: ")
                .append(toIndentedString(authPassPhraseGte))
                .append("\n");
        sb.append("    authPassPhraseIn: ").append(toIndentedString(authPassPhraseIn)).append("\n");
        sb.append("    authPassPhraseLt: ").append(toIndentedString(authPassPhraseLt)).append("\n");
        sb.append("    authPassPhraseLte: ")
                .append(toIndentedString(authPassPhraseLte))
                .append("\n");
        sb.append("    authPassPhraseNot: ")
                .append(toIndentedString(authPassPhraseNot))
                .append("\n");
        sb.append("    authPassPhraseNotContains: ")
                .append(toIndentedString(authPassPhraseNotContains))
                .append("\n");
        sb.append("    authPassPhraseNotEndsWith: ")
                .append(toIndentedString(authPassPhraseNotEndsWith))
                .append("\n");
        sb.append("    authPassPhraseNotIn: ")
                .append(toIndentedString(authPassPhraseNotIn))
                .append("\n");
        sb.append("    authPassPhraseNotStartsWith: ")
                .append(toIndentedString(authPassPhraseNotStartsWith))
                .append("\n");
        sb.append("    authPassPhraseStartsWith: ")
                .append(toIndentedString(authPassPhraseStartsWith))
                .append("\n");
        sb.append("    authProtocol: ").append(toIndentedString(authProtocol)).append("\n");
        sb.append("    authProtocolIn: ").append(toIndentedString(authProtocolIn)).append("\n");
        sb.append("    authProtocolNot: ").append(toIndentedString(authProtocolNot)).append("\n");
        sb.append("    authProtocolNotIn: ")
                .append(toIndentedString(authProtocolNotIn))
                .append("\n");
        sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
        sb.append("    community: ").append(toIndentedString(community)).append("\n");
        sb.append("    communityContains: ")
                .append(toIndentedString(communityContains))
                .append("\n");
        sb.append("    communityEndsWith: ")
                .append(toIndentedString(communityEndsWith))
                .append("\n");
        sb.append("    communityGt: ").append(toIndentedString(communityGt)).append("\n");
        sb.append("    communityGte: ").append(toIndentedString(communityGte)).append("\n");
        sb.append("    communityIn: ").append(toIndentedString(communityIn)).append("\n");
        sb.append("    communityLt: ").append(toIndentedString(communityLt)).append("\n");
        sb.append("    communityLte: ").append(toIndentedString(communityLte)).append("\n");
        sb.append("    communityNot: ").append(toIndentedString(communityNot)).append("\n");
        sb.append("    communityNotContains: ")
                .append(toIndentedString(communityNotContains))
                .append("\n");
        sb.append("    communityNotEndsWith: ")
                .append(toIndentedString(communityNotEndsWith))
                .append("\n");
        sb.append("    communityNotIn: ").append(toIndentedString(communityNotIn)).append("\n");
        sb.append("    communityNotStartsWith: ")
                .append(toIndentedString(communityNotStartsWith))
                .append("\n");
        sb.append("    communityStartsWith: ")
                .append(toIndentedString(communityStartsWith))
                .append("\n");
        sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
        sb.append("    disabledNot: ").append(toIndentedString(disabledNot)).append("\n");
        sb.append("    engineId: ").append(toIndentedString(engineId)).append("\n");
        sb.append("    engineIdContains: ").append(toIndentedString(engineIdContains)).append("\n");
        sb.append("    engineIdEndsWith: ").append(toIndentedString(engineIdEndsWith)).append("\n");
        sb.append("    engineIdGt: ").append(toIndentedString(engineIdGt)).append("\n");
        sb.append("    engineIdGte: ").append(toIndentedString(engineIdGte)).append("\n");
        sb.append("    engineIdIn: ").append(toIndentedString(engineIdIn)).append("\n");
        sb.append("    engineIdLt: ").append(toIndentedString(engineIdLt)).append("\n");
        sb.append("    engineIdLte: ").append(toIndentedString(engineIdLte)).append("\n");
        sb.append("    engineIdNot: ").append(toIndentedString(engineIdNot)).append("\n");
        sb.append("    engineIdNotContains: ")
                .append(toIndentedString(engineIdNotContains))
                .append("\n");
        sb.append("    engineIdNotEndsWith: ")
                .append(toIndentedString(engineIdNotEndsWith))
                .append("\n");
        sb.append("    engineIdNotIn: ").append(toIndentedString(engineIdNotIn)).append("\n");
        sb.append("    engineIdNotStartsWith: ")
                .append(toIndentedString(engineIdNotStartsWith))
                .append("\n");
        sb.append("    engineIdStartsWith: ")
                .append(toIndentedString(engineIdStartsWith))
                .append("\n");
        sb.append("    entityAsyncStatus: ")
                .append(toIndentedString(entityAsyncStatus))
                .append("\n");
        sb.append("    entityAsyncStatusIn: ")
                .append(toIndentedString(entityAsyncStatusIn))
                .append("\n");
        sb.append("    entityAsyncStatusNot: ")
                .append(toIndentedString(entityAsyncStatusNot))
                .append("\n");
        sb.append("    entityAsyncStatusNotIn: ")
                .append(toIndentedString(entityAsyncStatusNotIn))
                .append("\n");
        sb.append("    host: ").append(toIndentedString(host)).append("\n");
        sb.append("    hostContains: ").append(toIndentedString(hostContains)).append("\n");
        sb.append("    hostEndsWith: ").append(toIndentedString(hostEndsWith)).append("\n");
        sb.append("    hostGt: ").append(toIndentedString(hostGt)).append("\n");
        sb.append("    hostGte: ").append(toIndentedString(hostGte)).append("\n");
        sb.append("    hostIn: ").append(toIndentedString(hostIn)).append("\n");
        sb.append("    hostLt: ").append(toIndentedString(hostLt)).append("\n");
        sb.append("    hostLte: ").append(toIndentedString(hostLte)).append("\n");
        sb.append("    hostNot: ").append(toIndentedString(hostNot)).append("\n");
        sb.append("    hostNotContains: ").append(toIndentedString(hostNotContains)).append("\n");
        sb.append("    hostNotEndsWith: ").append(toIndentedString(hostNotEndsWith)).append("\n");
        sb.append("    hostNotIn: ").append(toIndentedString(hostNotIn)).append("\n");
        sb.append("    hostNotStartsWith: ")
                .append(toIndentedString(hostNotStartsWith))
                .append("\n");
        sb.append("    hostStartsWith: ").append(toIndentedString(hostStartsWith)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    idContains: ").append(toIndentedString(idContains)).append("\n");
        sb.append("    idEndsWith: ").append(toIndentedString(idEndsWith)).append("\n");
        sb.append("    idGt: ").append(toIndentedString(idGt)).append("\n");
        sb.append("    idGte: ").append(toIndentedString(idGte)).append("\n");
        sb.append("    idIn: ").append(toIndentedString(idIn)).append("\n");
        sb.append("    idLt: ").append(toIndentedString(idLt)).append("\n");
        sb.append("    idLte: ").append(toIndentedString(idLte)).append("\n");
        sb.append("    idNot: ").append(toIndentedString(idNot)).append("\n");
        sb.append("    idNotContains: ").append(toIndentedString(idNotContains)).append("\n");
        sb.append("    idNotEndsWith: ").append(toIndentedString(idNotEndsWith)).append("\n");
        sb.append("    idNotIn: ").append(toIndentedString(idNotIn)).append("\n");
        sb.append("    idNotStartsWith: ").append(toIndentedString(idNotStartsWith)).append("\n");
        sb.append("    idStartsWith: ").append(toIndentedString(idStartsWith)).append("\n");
        sb.append("    inform: ").append(toIndentedString(inform)).append("\n");
        sb.append("    informNot: ").append(toIndentedString(informNot)).append("\n");
        sb.append("    languageCode: ").append(toIndentedString(languageCode)).append("\n");
        sb.append("    languageCodeIn: ").append(toIndentedString(languageCodeIn)).append("\n");
        sb.append("    languageCodeNot: ").append(toIndentedString(languageCodeNot)).append("\n");
        sb.append("    languageCodeNotIn: ")
                .append(toIndentedString(languageCodeNotIn))
                .append("\n");
        sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
        sb.append("    localIdContains: ").append(toIndentedString(localIdContains)).append("\n");
        sb.append("    localIdEndsWith: ").append(toIndentedString(localIdEndsWith)).append("\n");
        sb.append("    localIdGt: ").append(toIndentedString(localIdGt)).append("\n");
        sb.append("    localIdGte: ").append(toIndentedString(localIdGte)).append("\n");
        sb.append("    localIdIn: ").append(toIndentedString(localIdIn)).append("\n");
        sb.append("    localIdLt: ").append(toIndentedString(localIdLt)).append("\n");
        sb.append("    localIdLte: ").append(toIndentedString(localIdLte)).append("\n");
        sb.append("    localIdNot: ").append(toIndentedString(localIdNot)).append("\n");
        sb.append("    localIdNotContains: ")
                .append(toIndentedString(localIdNotContains))
                .append("\n");
        sb.append("    localIdNotEndsWith: ")
                .append(toIndentedString(localIdNotEndsWith))
                .append("\n");
        sb.append("    localIdNotIn: ").append(toIndentedString(localIdNotIn)).append("\n");
        sb.append("    localIdNotStartsWith: ")
                .append(toIndentedString(localIdNotStartsWith))
                .append("\n");
        sb.append("    localIdStartsWith: ")
                .append(toIndentedString(localIdStartsWith))
                .append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    nameContains: ").append(toIndentedString(nameContains)).append("\n");
        sb.append("    nameEndsWith: ").append(toIndentedString(nameEndsWith)).append("\n");
        sb.append("    nameGt: ").append(toIndentedString(nameGt)).append("\n");
        sb.append("    nameGte: ").append(toIndentedString(nameGte)).append("\n");
        sb.append("    nameIn: ").append(toIndentedString(nameIn)).append("\n");
        sb.append("    nameLt: ").append(toIndentedString(nameLt)).append("\n");
        sb.append("    nameLte: ").append(toIndentedString(nameLte)).append("\n");
        sb.append("    nameNot: ").append(toIndentedString(nameNot)).append("\n");
        sb.append("    nameNotContains: ").append(toIndentedString(nameNotContains)).append("\n");
        sb.append("    nameNotEndsWith: ").append(toIndentedString(nameNotEndsWith)).append("\n");
        sb.append("    nameNotIn: ").append(toIndentedString(nameNotIn)).append("\n");
        sb.append("    nameNotStartsWith: ")
                .append(toIndentedString(nameNotStartsWith))
                .append("\n");
        sb.append("    nameStartsWith: ").append(toIndentedString(nameStartsWith)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    portGt: ").append(toIndentedString(portGt)).append("\n");
        sb.append("    portGte: ").append(toIndentedString(portGte)).append("\n");
        sb.append("    portIn: ").append(toIndentedString(portIn)).append("\n");
        sb.append("    portLt: ").append(toIndentedString(portLt)).append("\n");
        sb.append("    portLte: ").append(toIndentedString(portLte)).append("\n");
        sb.append("    portNot: ").append(toIndentedString(portNot)).append("\n");
        sb.append("    portNotIn: ").append(toIndentedString(portNotIn)).append("\n");
        sb.append("    privacyPassPhrase: ")
                .append(toIndentedString(privacyPassPhrase))
                .append("\n");
        sb.append("    privacyPassPhraseContains: ")
                .append(toIndentedString(privacyPassPhraseContains))
                .append("\n");
        sb.append("    privacyPassPhraseEndsWith: ")
                .append(toIndentedString(privacyPassPhraseEndsWith))
                .append("\n");
        sb.append("    privacyPassPhraseGt: ")
                .append(toIndentedString(privacyPassPhraseGt))
                .append("\n");
        sb.append("    privacyPassPhraseGte: ")
                .append(toIndentedString(privacyPassPhraseGte))
                .append("\n");
        sb.append("    privacyPassPhraseIn: ")
                .append(toIndentedString(privacyPassPhraseIn))
                .append("\n");
        sb.append("    privacyPassPhraseLt: ")
                .append(toIndentedString(privacyPassPhraseLt))
                .append("\n");
        sb.append("    privacyPassPhraseLte: ")
                .append(toIndentedString(privacyPassPhraseLte))
                .append("\n");
        sb.append("    privacyPassPhraseNot: ")
                .append(toIndentedString(privacyPassPhraseNot))
                .append("\n");
        sb.append("    privacyPassPhraseNotContains: ")
                .append(toIndentedString(privacyPassPhraseNotContains))
                .append("\n");
        sb.append("    privacyPassPhraseNotEndsWith: ")
                .append(toIndentedString(privacyPassPhraseNotEndsWith))
                .append("\n");
        sb.append("    privacyPassPhraseNotIn: ")
                .append(toIndentedString(privacyPassPhraseNotIn))
                .append("\n");
        sb.append("    privacyPassPhraseNotStartsWith: ")
                .append(toIndentedString(privacyPassPhraseNotStartsWith))
                .append("\n");
        sb.append("    privacyPassPhraseStartsWith: ")
                .append(toIndentedString(privacyPassPhraseStartsWith))
                .append("\n");
        sb.append("    privacyProtocol: ").append(toIndentedString(privacyProtocol)).append("\n");
        sb.append("    privacyProtocolIn: ")
                .append(toIndentedString(privacyProtocolIn))
                .append("\n");
        sb.append("    privacyProtocolNot: ")
                .append(toIndentedString(privacyProtocolNot))
                .append("\n");
        sb.append("    privacyProtocolNotIn: ")
                .append(toIndentedString(privacyProtocolNotIn))
                .append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    protocolIn: ").append(toIndentedString(protocolIn)).append("\n");
        sb.append("    protocolNot: ").append(toIndentedString(protocolNot)).append("\n");
        sb.append("    protocolNotIn: ").append(toIndentedString(protocolNotIn)).append("\n");
        sb.append("    username: ").append(toIndentedString(username)).append("\n");
        sb.append("    usernameContains: ").append(toIndentedString(usernameContains)).append("\n");
        sb.append("    usernameEndsWith: ").append(toIndentedString(usernameEndsWith)).append("\n");
        sb.append("    usernameGt: ").append(toIndentedString(usernameGt)).append("\n");
        sb.append("    usernameGte: ").append(toIndentedString(usernameGte)).append("\n");
        sb.append("    usernameIn: ").append(toIndentedString(usernameIn)).append("\n");
        sb.append("    usernameLt: ").append(toIndentedString(usernameLt)).append("\n");
        sb.append("    usernameLte: ").append(toIndentedString(usernameLte)).append("\n");
        sb.append("    usernameNot: ").append(toIndentedString(usernameNot)).append("\n");
        sb.append("    usernameNotContains: ")
                .append(toIndentedString(usernameNotContains))
                .append("\n");
        sb.append("    usernameNotEndsWith: ")
                .append(toIndentedString(usernameNotEndsWith))
                .append("\n");
        sb.append("    usernameNotIn: ").append(toIndentedString(usernameNotIn)).append("\n");
        sb.append("    usernameNotStartsWith: ")
                .append(toIndentedString(usernameNotStartsWith))
                .append("\n");
        sb.append("    usernameStartsWith: ")
                .append(toIndentedString(usernameStartsWith))
                .append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    versionIn: ").append(toIndentedString(versionIn)).append("\n");
        sb.append("    versionNot: ").append(toIndentedString(versionNot)).append("\n");
        sb.append("    versionNotIn: ").append(toIndentedString(versionNotIn)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces (except the first
     * line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

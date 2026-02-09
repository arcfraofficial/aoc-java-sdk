package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** SnmpTransportWhereInput */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class SnmpTransportWhereInput
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_A_N_D = "AND";

    @SerializedName(SERIALIZED_NAME_A_N_D)
    private List<SnmpTransportWhereInput> AND = null;

    public static final String SERIALIZED_NAME_N_O_T = "NOT";

    @SerializedName(SERIALIZED_NAME_N_O_T)
    private List<SnmpTransportWhereInput> NOT = null;

    public static final String SERIALIZED_NAME_O_R = "OR";

    @SerializedName(SERIALIZED_NAME_O_R)
    private List<SnmpTransportWhereInput> OR = null;

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

    public SnmpTransportWhereInput() {}

    public SnmpTransportWhereInput AND(List<SnmpTransportWhereInput> AND) {

        this.AND = AND;
        return this;
    }

    public SnmpTransportWhereInput addANDItem(SnmpTransportWhereInput ANDItem) {
        if (this.AND == null) {
            this.AND = new ArrayList<SnmpTransportWhereInput>();
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
    public List<SnmpTransportWhereInput> getAND() {
        return AND;
    }

    public void setAND(List<SnmpTransportWhereInput> AND) {
        this.AND = AND;
    }

    public SnmpTransportWhereInput AND_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_A_N_D);
        return this;
    }

    public SnmpTransportWhereInput AND_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput NOT(List<SnmpTransportWhereInput> NOT) {

        this.NOT = NOT;
        return this;
    }

    public SnmpTransportWhereInput addNOTItem(SnmpTransportWhereInput NOTItem) {
        if (this.NOT == null) {
            this.NOT = new ArrayList<SnmpTransportWhereInput>();
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
    public List<SnmpTransportWhereInput> getNOT() {
        return NOT;
    }

    public void setNOT(List<SnmpTransportWhereInput> NOT) {
        this.NOT = NOT;
    }

    public SnmpTransportWhereInput NOT_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_N_O_T);
        return this;
    }

    public SnmpTransportWhereInput NOT_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput OR(List<SnmpTransportWhereInput> OR) {

        this.OR = OR;
        return this;
    }

    public SnmpTransportWhereInput addORItem(SnmpTransportWhereInput ORItem) {
        if (this.OR == null) {
            this.OR = new ArrayList<SnmpTransportWhereInput>();
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
    public List<SnmpTransportWhereInput> getOR() {
        return OR;
    }

    public void setOR(List<SnmpTransportWhereInput> OR) {
        this.OR = OR;
    }

    public SnmpTransportWhereInput OR_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_O_R);
        return this;
    }

    public SnmpTransportWhereInput OR_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput authPassPhrase(String authPassPhrase) {

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

    public SnmpTransportWhereInput authPassPhrase_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_AUTH_PASS_PHRASE);
        return this;
    }

    public SnmpTransportWhereInput authPassPhrase_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput authPassPhraseContains(String authPassPhraseContains) {

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

    public SnmpTransportWhereInput authPassPhraseContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_AUTH_PASS_PHRASE_CONTAINS);
        return this;
    }

    public SnmpTransportWhereInput authPassPhraseContains_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput authPassPhraseEndsWith(String authPassPhraseEndsWith) {

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

    public SnmpTransportWhereInput authPassPhraseEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_AUTH_PASS_PHRASE_ENDS_WITH);
        return this;
    }

    public SnmpTransportWhereInput authPassPhraseEndsWith_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput authPassPhraseGt(String authPassPhraseGt) {

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

    public SnmpTransportWhereInput authPassPhraseGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_AUTH_PASS_PHRASE_GT);
        return this;
    }

    public SnmpTransportWhereInput authPassPhraseGt_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput authPassPhraseGte(String authPassPhraseGte) {

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

    public SnmpTransportWhereInput authPassPhraseGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_AUTH_PASS_PHRASE_GTE);
        return this;
    }

    public SnmpTransportWhereInput authPassPhraseGte_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput authPassPhraseIn(List<String> authPassPhraseIn) {

        this.authPassPhraseIn = authPassPhraseIn;
        return this;
    }

    public SnmpTransportWhereInput addAuthPassPhraseInItem(String authPassPhraseInItem) {
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

    public SnmpTransportWhereInput authPassPhraseIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_AUTH_PASS_PHRASE_IN);
        return this;
    }

    public SnmpTransportWhereInput authPassPhraseIn_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput authPassPhraseLt(String authPassPhraseLt) {

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

    public SnmpTransportWhereInput authPassPhraseLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_AUTH_PASS_PHRASE_LT);
        return this;
    }

    public SnmpTransportWhereInput authPassPhraseLt_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput authPassPhraseLte(String authPassPhraseLte) {

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

    public SnmpTransportWhereInput authPassPhraseLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_AUTH_PASS_PHRASE_LTE);
        return this;
    }

    public SnmpTransportWhereInput authPassPhraseLte_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput authPassPhraseNot(String authPassPhraseNot) {

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

    public SnmpTransportWhereInput authPassPhraseNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_AUTH_PASS_PHRASE_NOT);
        return this;
    }

    public SnmpTransportWhereInput authPassPhraseNot_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput authPassPhraseNotContains(String authPassPhraseNotContains) {

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

    public SnmpTransportWhereInput authPassPhraseNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_AUTH_PASS_PHRASE_NOT_CONTAINS);
        return this;
    }

    public SnmpTransportWhereInput authPassPhraseNotContains_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput authPassPhraseNotEndsWith(String authPassPhraseNotEndsWith) {

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

    public SnmpTransportWhereInput authPassPhraseNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_AUTH_PASS_PHRASE_NOT_ENDS_WITH);
        return this;
    }

    public SnmpTransportWhereInput authPassPhraseNotEndsWith_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput authPassPhraseNotIn(List<String> authPassPhraseNotIn) {

        this.authPassPhraseNotIn = authPassPhraseNotIn;
        return this;
    }

    public SnmpTransportWhereInput addAuthPassPhraseNotInItem(String authPassPhraseNotInItem) {
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

    public SnmpTransportWhereInput authPassPhraseNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_AUTH_PASS_PHRASE_NOT_IN);
        return this;
    }

    public SnmpTransportWhereInput authPassPhraseNotIn_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput authPassPhraseNotStartsWith(String authPassPhraseNotStartsWith) {

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

    public SnmpTransportWhereInput authPassPhraseNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_AUTH_PASS_PHRASE_NOT_STARTS_WITH);
        return this;
    }

    public SnmpTransportWhereInput authPassPhraseNotStartsWith_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput authPassPhraseStartsWith(String authPassPhraseStartsWith) {

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

    public SnmpTransportWhereInput authPassPhraseStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_AUTH_PASS_PHRASE_STARTS_WITH);
        return this;
    }

    public SnmpTransportWhereInput authPassPhraseStartsWith_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput authProtocol(SnmpAuthProtocol authProtocol) {

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

    public SnmpTransportWhereInput authProtocol_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_AUTH_PROTOCOL);
        return this;
    }

    public SnmpTransportWhereInput authProtocol_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput authProtocolIn(List<SnmpAuthProtocol> authProtocolIn) {

        this.authProtocolIn = authProtocolIn;
        return this;
    }

    public SnmpTransportWhereInput addAuthProtocolInItem(SnmpAuthProtocol authProtocolInItem) {
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

    public SnmpTransportWhereInput authProtocolIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_AUTH_PROTOCOL_IN);
        return this;
    }

    public SnmpTransportWhereInput authProtocolIn_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput authProtocolNot(SnmpAuthProtocol authProtocolNot) {

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

    public SnmpTransportWhereInput authProtocolNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_AUTH_PROTOCOL_NOT);
        return this;
    }

    public SnmpTransportWhereInput authProtocolNot_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput authProtocolNotIn(List<SnmpAuthProtocol> authProtocolNotIn) {

        this.authProtocolNotIn = authProtocolNotIn;
        return this;
    }

    public SnmpTransportWhereInput addAuthProtocolNotInItem(
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

    public SnmpTransportWhereInput authProtocolNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_AUTH_PROTOCOL_NOT_IN);
        return this;
    }

    public SnmpTransportWhereInput authProtocolNotIn_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput cluster(ClusterWhereInput cluster) {

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

    public SnmpTransportWhereInput cluster_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER);
        return this;
    }

    public SnmpTransportWhereInput cluster_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput community(String community) {

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

    public SnmpTransportWhereInput community_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_COMMUNITY);
        return this;
    }

    public SnmpTransportWhereInput community_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput communityContains(String communityContains) {

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

    public SnmpTransportWhereInput communityContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_COMMUNITY_CONTAINS);
        return this;
    }

    public SnmpTransportWhereInput communityContains_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput communityEndsWith(String communityEndsWith) {

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

    public SnmpTransportWhereInput communityEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_COMMUNITY_ENDS_WITH);
        return this;
    }

    public SnmpTransportWhereInput communityEndsWith_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput communityGt(String communityGt) {

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

    public SnmpTransportWhereInput communityGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_COMMUNITY_GT);
        return this;
    }

    public SnmpTransportWhereInput communityGt_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput communityGte(String communityGte) {

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

    public SnmpTransportWhereInput communityGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_COMMUNITY_GTE);
        return this;
    }

    public SnmpTransportWhereInput communityGte_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput communityIn(List<String> communityIn) {

        this.communityIn = communityIn;
        return this;
    }

    public SnmpTransportWhereInput addCommunityInItem(String communityInItem) {
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

    public SnmpTransportWhereInput communityIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_COMMUNITY_IN);
        return this;
    }

    public SnmpTransportWhereInput communityIn_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput communityLt(String communityLt) {

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

    public SnmpTransportWhereInput communityLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_COMMUNITY_LT);
        return this;
    }

    public SnmpTransportWhereInput communityLt_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput communityLte(String communityLte) {

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

    public SnmpTransportWhereInput communityLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_COMMUNITY_LTE);
        return this;
    }

    public SnmpTransportWhereInput communityLte_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput communityNot(String communityNot) {

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

    public SnmpTransportWhereInput communityNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_COMMUNITY_NOT);
        return this;
    }

    public SnmpTransportWhereInput communityNot_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput communityNotContains(String communityNotContains) {

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

    public SnmpTransportWhereInput communityNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_COMMUNITY_NOT_CONTAINS);
        return this;
    }

    public SnmpTransportWhereInput communityNotContains_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput communityNotEndsWith(String communityNotEndsWith) {

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

    public SnmpTransportWhereInput communityNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_COMMUNITY_NOT_ENDS_WITH);
        return this;
    }

    public SnmpTransportWhereInput communityNotEndsWith_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput communityNotIn(List<String> communityNotIn) {

        this.communityNotIn = communityNotIn;
        return this;
    }

    public SnmpTransportWhereInput addCommunityNotInItem(String communityNotInItem) {
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

    public SnmpTransportWhereInput communityNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_COMMUNITY_NOT_IN);
        return this;
    }

    public SnmpTransportWhereInput communityNotIn_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput communityNotStartsWith(String communityNotStartsWith) {

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

    public SnmpTransportWhereInput communityNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_COMMUNITY_NOT_STARTS_WITH);
        return this;
    }

    public SnmpTransportWhereInput communityNotStartsWith_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput communityStartsWith(String communityStartsWith) {

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

    public SnmpTransportWhereInput communityStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_COMMUNITY_STARTS_WITH);
        return this;
    }

    public SnmpTransportWhereInput communityStartsWith_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput disabled(Boolean disabled) {

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

    public SnmpTransportWhereInput disabled_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISABLED);
        return this;
    }

    public SnmpTransportWhereInput disabled_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput disabledNot(Boolean disabledNot) {

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

    public SnmpTransportWhereInput disabledNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISABLED_NOT);
        return this;
    }

    public SnmpTransportWhereInput disabledNot_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {

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

    public SnmpTransportWhereInput entityAsyncStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        return this;
    }

    public SnmpTransportWhereInput entityAsyncStatus_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput entityAsyncStatusIn(
            List<EntityAsyncStatus> entityAsyncStatusIn) {

        this.entityAsyncStatusIn = entityAsyncStatusIn;
        return this;
    }

    public SnmpTransportWhereInput addEntityAsyncStatusInItem(
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

    public SnmpTransportWhereInput entityAsyncStatusIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_IN);
        return this;
    }

    public SnmpTransportWhereInput entityAsyncStatusIn_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput entityAsyncStatusNot(EntityAsyncStatus entityAsyncStatusNot) {

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

    public SnmpTransportWhereInput entityAsyncStatusNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT);
        return this;
    }

    public SnmpTransportWhereInput entityAsyncStatusNot_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput entityAsyncStatusNotIn(
            List<EntityAsyncStatus> entityAsyncStatusNotIn) {

        this.entityAsyncStatusNotIn = entityAsyncStatusNotIn;
        return this;
    }

    public SnmpTransportWhereInput addEntityAsyncStatusNotInItem(
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

    public SnmpTransportWhereInput entityAsyncStatusNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT_IN);
        return this;
    }

    public SnmpTransportWhereInput entityAsyncStatusNotIn_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput id(String id) {

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

    public SnmpTransportWhereInput id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public SnmpTransportWhereInput id_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput idContains(String idContains) {

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

    public SnmpTransportWhereInput idContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_CONTAINS);
        return this;
    }

    public SnmpTransportWhereInput idContains_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput idEndsWith(String idEndsWith) {

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

    public SnmpTransportWhereInput idEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_ENDS_WITH);
        return this;
    }

    public SnmpTransportWhereInput idEndsWith_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput idGt(String idGt) {

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

    public SnmpTransportWhereInput idGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GT);
        return this;
    }

    public SnmpTransportWhereInput idGt_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput idGte(String idGte) {

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

    public SnmpTransportWhereInput idGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GTE);
        return this;
    }

    public SnmpTransportWhereInput idGte_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput idIn(List<String> idIn) {

        this.idIn = idIn;
        return this;
    }

    public SnmpTransportWhereInput addIdInItem(String idInItem) {
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

    public SnmpTransportWhereInput idIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_IN);
        return this;
    }

    public SnmpTransportWhereInput idIn_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput idLt(String idLt) {

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

    public SnmpTransportWhereInput idLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LT);
        return this;
    }

    public SnmpTransportWhereInput idLt_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput idLte(String idLte) {

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

    public SnmpTransportWhereInput idLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LTE);
        return this;
    }

    public SnmpTransportWhereInput idLte_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput idNot(String idNot) {

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

    public SnmpTransportWhereInput idNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT);
        return this;
    }

    public SnmpTransportWhereInput idNot_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput idNotContains(String idNotContains) {

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

    public SnmpTransportWhereInput idNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_CONTAINS);
        return this;
    }

    public SnmpTransportWhereInput idNotContains_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput idNotEndsWith(String idNotEndsWith) {

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

    public SnmpTransportWhereInput idNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
        return this;
    }

    public SnmpTransportWhereInput idNotEndsWith_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput idNotIn(List<String> idNotIn) {

        this.idNotIn = idNotIn;
        return this;
    }

    public SnmpTransportWhereInput addIdNotInItem(String idNotInItem) {
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

    public SnmpTransportWhereInput idNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_IN);
        return this;
    }

    public SnmpTransportWhereInput idNotIn_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput idNotStartsWith(String idNotStartsWith) {

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

    public SnmpTransportWhereInput idNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
        return this;
    }

    public SnmpTransportWhereInput idNotStartsWith_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput idStartsWith(String idStartsWith) {

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

    public SnmpTransportWhereInput idStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_STARTS_WITH);
        return this;
    }

    public SnmpTransportWhereInput idStartsWith_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput localId(String localId) {

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

    public SnmpTransportWhereInput localId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID);
        return this;
    }

    public SnmpTransportWhereInput localId_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput localIdContains(String localIdContains) {

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

    public SnmpTransportWhereInput localIdContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_CONTAINS);
        return this;
    }

    public SnmpTransportWhereInput localIdContains_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput localIdEndsWith(String localIdEndsWith) {

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

    public SnmpTransportWhereInput localIdEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_ENDS_WITH);
        return this;
    }

    public SnmpTransportWhereInput localIdEndsWith_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput localIdGt(String localIdGt) {

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

    public SnmpTransportWhereInput localIdGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_GT);
        return this;
    }

    public SnmpTransportWhereInput localIdGt_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput localIdGte(String localIdGte) {

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

    public SnmpTransportWhereInput localIdGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_GTE);
        return this;
    }

    public SnmpTransportWhereInput localIdGte_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput localIdIn(List<String> localIdIn) {

        this.localIdIn = localIdIn;
        return this;
    }

    public SnmpTransportWhereInput addLocalIdInItem(String localIdInItem) {
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

    public SnmpTransportWhereInput localIdIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_IN);
        return this;
    }

    public SnmpTransportWhereInput localIdIn_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput localIdLt(String localIdLt) {

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

    public SnmpTransportWhereInput localIdLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_LT);
        return this;
    }

    public SnmpTransportWhereInput localIdLt_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput localIdLte(String localIdLte) {

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

    public SnmpTransportWhereInput localIdLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_LTE);
        return this;
    }

    public SnmpTransportWhereInput localIdLte_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput localIdNot(String localIdNot) {

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

    public SnmpTransportWhereInput localIdNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT);
        return this;
    }

    public SnmpTransportWhereInput localIdNot_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput localIdNotContains(String localIdNotContains) {

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

    public SnmpTransportWhereInput localIdNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_CONTAINS);
        return this;
    }

    public SnmpTransportWhereInput localIdNotContains_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput localIdNotEndsWith(String localIdNotEndsWith) {

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

    public SnmpTransportWhereInput localIdNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_ENDS_WITH);
        return this;
    }

    public SnmpTransportWhereInput localIdNotEndsWith_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput localIdNotIn(List<String> localIdNotIn) {

        this.localIdNotIn = localIdNotIn;
        return this;
    }

    public SnmpTransportWhereInput addLocalIdNotInItem(String localIdNotInItem) {
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

    public SnmpTransportWhereInput localIdNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_IN);
        return this;
    }

    public SnmpTransportWhereInput localIdNotIn_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput localIdNotStartsWith(String localIdNotStartsWith) {

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

    public SnmpTransportWhereInput localIdNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_STARTS_WITH);
        return this;
    }

    public SnmpTransportWhereInput localIdNotStartsWith_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput localIdStartsWith(String localIdStartsWith) {

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

    public SnmpTransportWhereInput localIdStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_STARTS_WITH);
        return this;
    }

    public SnmpTransportWhereInput localIdStartsWith_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput name(String name) {

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

    public SnmpTransportWhereInput name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public SnmpTransportWhereInput name_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput nameContains(String nameContains) {

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

    public SnmpTransportWhereInput nameContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_CONTAINS);
        return this;
    }

    public SnmpTransportWhereInput nameContains_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput nameEndsWith(String nameEndsWith) {

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

    public SnmpTransportWhereInput nameEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_ENDS_WITH);
        return this;
    }

    public SnmpTransportWhereInput nameEndsWith_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput nameGt(String nameGt) {

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

    public SnmpTransportWhereInput nameGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_GT);
        return this;
    }

    public SnmpTransportWhereInput nameGt_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput nameGte(String nameGte) {

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

    public SnmpTransportWhereInput nameGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_GTE);
        return this;
    }

    public SnmpTransportWhereInput nameGte_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput nameIn(List<String> nameIn) {

        this.nameIn = nameIn;
        return this;
    }

    public SnmpTransportWhereInput addNameInItem(String nameInItem) {
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

    public SnmpTransportWhereInput nameIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_IN);
        return this;
    }

    public SnmpTransportWhereInput nameIn_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput nameLt(String nameLt) {

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

    public SnmpTransportWhereInput nameLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_LT);
        return this;
    }

    public SnmpTransportWhereInput nameLt_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput nameLte(String nameLte) {

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

    public SnmpTransportWhereInput nameLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_LTE);
        return this;
    }

    public SnmpTransportWhereInput nameLte_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput nameNot(String nameNot) {

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

    public SnmpTransportWhereInput nameNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT);
        return this;
    }

    public SnmpTransportWhereInput nameNot_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput nameNotContains(String nameNotContains) {

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

    public SnmpTransportWhereInput nameNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_CONTAINS);
        return this;
    }

    public SnmpTransportWhereInput nameNotContains_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput nameNotEndsWith(String nameNotEndsWith) {

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

    public SnmpTransportWhereInput nameNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_ENDS_WITH);
        return this;
    }

    public SnmpTransportWhereInput nameNotEndsWith_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput nameNotIn(List<String> nameNotIn) {

        this.nameNotIn = nameNotIn;
        return this;
    }

    public SnmpTransportWhereInput addNameNotInItem(String nameNotInItem) {
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

    public SnmpTransportWhereInput nameNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_IN);
        return this;
    }

    public SnmpTransportWhereInput nameNotIn_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput nameNotStartsWith(String nameNotStartsWith) {

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

    public SnmpTransportWhereInput nameNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_STARTS_WITH);
        return this;
    }

    public SnmpTransportWhereInput nameNotStartsWith_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput nameStartsWith(String nameStartsWith) {

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

    public SnmpTransportWhereInput nameStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_STARTS_WITH);
        return this;
    }

    public SnmpTransportWhereInput nameStartsWith_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput port(Integer port) {

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

    public SnmpTransportWhereInput port_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PORT);
        return this;
    }

    public SnmpTransportWhereInput port_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput portGt(Integer portGt) {

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

    public SnmpTransportWhereInput portGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PORT_GT);
        return this;
    }

    public SnmpTransportWhereInput portGt_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput portGte(Integer portGte) {

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

    public SnmpTransportWhereInput portGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PORT_GTE);
        return this;
    }

    public SnmpTransportWhereInput portGte_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput portIn(List<Integer> portIn) {

        this.portIn = portIn;
        return this;
    }

    public SnmpTransportWhereInput addPortInItem(Integer portInItem) {
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

    public SnmpTransportWhereInput portIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PORT_IN);
        return this;
    }

    public SnmpTransportWhereInput portIn_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput portLt(Integer portLt) {

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

    public SnmpTransportWhereInput portLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PORT_LT);
        return this;
    }

    public SnmpTransportWhereInput portLt_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput portLte(Integer portLte) {

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

    public SnmpTransportWhereInput portLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PORT_LTE);
        return this;
    }

    public SnmpTransportWhereInput portLte_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput portNot(Integer portNot) {

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

    public SnmpTransportWhereInput portNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PORT_NOT);
        return this;
    }

    public SnmpTransportWhereInput portNot_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput portNotIn(List<Integer> portNotIn) {

        this.portNotIn = portNotIn;
        return this;
    }

    public SnmpTransportWhereInput addPortNotInItem(Integer portNotInItem) {
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

    public SnmpTransportWhereInput portNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PORT_NOT_IN);
        return this;
    }

    public SnmpTransportWhereInput portNotIn_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput privacyPassPhrase(String privacyPassPhrase) {

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

    public SnmpTransportWhereInput privacyPassPhrase_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRIVACY_PASS_PHRASE);
        return this;
    }

    public SnmpTransportWhereInput privacyPassPhrase_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput privacyPassPhraseContains(String privacyPassPhraseContains) {

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

    public SnmpTransportWhereInput privacyPassPhraseContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRIVACY_PASS_PHRASE_CONTAINS);
        return this;
    }

    public SnmpTransportWhereInput privacyPassPhraseContains_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput privacyPassPhraseEndsWith(String privacyPassPhraseEndsWith) {

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

    public SnmpTransportWhereInput privacyPassPhraseEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRIVACY_PASS_PHRASE_ENDS_WITH);
        return this;
    }

    public SnmpTransportWhereInput privacyPassPhraseEndsWith_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput privacyPassPhraseGt(String privacyPassPhraseGt) {

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

    public SnmpTransportWhereInput privacyPassPhraseGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRIVACY_PASS_PHRASE_GT);
        return this;
    }

    public SnmpTransportWhereInput privacyPassPhraseGt_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput privacyPassPhraseGte(String privacyPassPhraseGte) {

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

    public SnmpTransportWhereInput privacyPassPhraseGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRIVACY_PASS_PHRASE_GTE);
        return this;
    }

    public SnmpTransportWhereInput privacyPassPhraseGte_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput privacyPassPhraseIn(List<String> privacyPassPhraseIn) {

        this.privacyPassPhraseIn = privacyPassPhraseIn;
        return this;
    }

    public SnmpTransportWhereInput addPrivacyPassPhraseInItem(String privacyPassPhraseInItem) {
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

    public SnmpTransportWhereInput privacyPassPhraseIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRIVACY_PASS_PHRASE_IN);
        return this;
    }

    public SnmpTransportWhereInput privacyPassPhraseIn_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput privacyPassPhraseLt(String privacyPassPhraseLt) {

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

    public SnmpTransportWhereInput privacyPassPhraseLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRIVACY_PASS_PHRASE_LT);
        return this;
    }

    public SnmpTransportWhereInput privacyPassPhraseLt_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput privacyPassPhraseLte(String privacyPassPhraseLte) {

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

    public SnmpTransportWhereInput privacyPassPhraseLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRIVACY_PASS_PHRASE_LTE);
        return this;
    }

    public SnmpTransportWhereInput privacyPassPhraseLte_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput privacyPassPhraseNot(String privacyPassPhraseNot) {

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

    public SnmpTransportWhereInput privacyPassPhraseNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRIVACY_PASS_PHRASE_NOT);
        return this;
    }

    public SnmpTransportWhereInput privacyPassPhraseNot_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput privacyPassPhraseNotContains(
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

    public SnmpTransportWhereInput privacyPassPhraseNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRIVACY_PASS_PHRASE_NOT_CONTAINS);
        return this;
    }

    public SnmpTransportWhereInput privacyPassPhraseNotContains_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput privacyPassPhraseNotEndsWith(
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

    public SnmpTransportWhereInput privacyPassPhraseNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRIVACY_PASS_PHRASE_NOT_ENDS_WITH);
        return this;
    }

    public SnmpTransportWhereInput privacyPassPhraseNotEndsWith_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput privacyPassPhraseNotIn(List<String> privacyPassPhraseNotIn) {

        this.privacyPassPhraseNotIn = privacyPassPhraseNotIn;
        return this;
    }

    public SnmpTransportWhereInput addPrivacyPassPhraseNotInItem(
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

    public SnmpTransportWhereInput privacyPassPhraseNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRIVACY_PASS_PHRASE_NOT_IN);
        return this;
    }

    public SnmpTransportWhereInput privacyPassPhraseNotIn_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput privacyPassPhraseNotStartsWith(
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

    public SnmpTransportWhereInput privacyPassPhraseNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRIVACY_PASS_PHRASE_NOT_STARTS_WITH);
        return this;
    }

    public SnmpTransportWhereInput privacyPassPhraseNotStartsWith_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput privacyPassPhraseStartsWith(String privacyPassPhraseStartsWith) {

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

    public SnmpTransportWhereInput privacyPassPhraseStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRIVACY_PASS_PHRASE_STARTS_WITH);
        return this;
    }

    public SnmpTransportWhereInput privacyPassPhraseStartsWith_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput privacyProtocol(SnmpPrivacyProtocol privacyProtocol) {

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

    public SnmpTransportWhereInput privacyProtocol_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRIVACY_PROTOCOL);
        return this;
    }

    public SnmpTransportWhereInput privacyProtocol_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput privacyProtocolIn(List<SnmpPrivacyProtocol> privacyProtocolIn) {

        this.privacyProtocolIn = privacyProtocolIn;
        return this;
    }

    public SnmpTransportWhereInput addPrivacyProtocolInItem(
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

    public SnmpTransportWhereInput privacyProtocolIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRIVACY_PROTOCOL_IN);
        return this;
    }

    public SnmpTransportWhereInput privacyProtocolIn_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput privacyProtocolNot(SnmpPrivacyProtocol privacyProtocolNot) {

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

    public SnmpTransportWhereInput privacyProtocolNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRIVACY_PROTOCOL_NOT);
        return this;
    }

    public SnmpTransportWhereInput privacyProtocolNot_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput privacyProtocolNotIn(
            List<SnmpPrivacyProtocol> privacyProtocolNotIn) {

        this.privacyProtocolNotIn = privacyProtocolNotIn;
        return this;
    }

    public SnmpTransportWhereInput addPrivacyProtocolNotInItem(
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

    public SnmpTransportWhereInput privacyProtocolNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRIVACY_PROTOCOL_NOT_IN);
        return this;
    }

    public SnmpTransportWhereInput privacyProtocolNotIn_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput protocol(SnmpProtocol protocol) {

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

    public SnmpTransportWhereInput protocol_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PROTOCOL);
        return this;
    }

    public SnmpTransportWhereInput protocol_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput protocolIn(List<SnmpProtocol> protocolIn) {

        this.protocolIn = protocolIn;
        return this;
    }

    public SnmpTransportWhereInput addProtocolInItem(SnmpProtocol protocolInItem) {
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

    public SnmpTransportWhereInput protocolIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PROTOCOL_IN);
        return this;
    }

    public SnmpTransportWhereInput protocolIn_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput protocolNot(SnmpProtocol protocolNot) {

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

    public SnmpTransportWhereInput protocolNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PROTOCOL_NOT);
        return this;
    }

    public SnmpTransportWhereInput protocolNot_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput protocolNotIn(List<SnmpProtocol> protocolNotIn) {

        this.protocolNotIn = protocolNotIn;
        return this;
    }

    public SnmpTransportWhereInput addProtocolNotInItem(SnmpProtocol protocolNotInItem) {
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

    public SnmpTransportWhereInput protocolNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PROTOCOL_NOT_IN);
        return this;
    }

    public SnmpTransportWhereInput protocolNotIn_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput username(String username) {

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

    public SnmpTransportWhereInput username_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USERNAME);
        return this;
    }

    public SnmpTransportWhereInput username_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput usernameContains(String usernameContains) {

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

    public SnmpTransportWhereInput usernameContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USERNAME_CONTAINS);
        return this;
    }

    public SnmpTransportWhereInput usernameContains_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput usernameEndsWith(String usernameEndsWith) {

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

    public SnmpTransportWhereInput usernameEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USERNAME_ENDS_WITH);
        return this;
    }

    public SnmpTransportWhereInput usernameEndsWith_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput usernameGt(String usernameGt) {

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

    public SnmpTransportWhereInput usernameGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USERNAME_GT);
        return this;
    }

    public SnmpTransportWhereInput usernameGt_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput usernameGte(String usernameGte) {

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

    public SnmpTransportWhereInput usernameGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USERNAME_GTE);
        return this;
    }

    public SnmpTransportWhereInput usernameGte_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput usernameIn(List<String> usernameIn) {

        this.usernameIn = usernameIn;
        return this;
    }

    public SnmpTransportWhereInput addUsernameInItem(String usernameInItem) {
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

    public SnmpTransportWhereInput usernameIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USERNAME_IN);
        return this;
    }

    public SnmpTransportWhereInput usernameIn_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput usernameLt(String usernameLt) {

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

    public SnmpTransportWhereInput usernameLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USERNAME_LT);
        return this;
    }

    public SnmpTransportWhereInput usernameLt_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput usernameLte(String usernameLte) {

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

    public SnmpTransportWhereInput usernameLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USERNAME_LTE);
        return this;
    }

    public SnmpTransportWhereInput usernameLte_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput usernameNot(String usernameNot) {

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

    public SnmpTransportWhereInput usernameNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USERNAME_NOT);
        return this;
    }

    public SnmpTransportWhereInput usernameNot_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput usernameNotContains(String usernameNotContains) {

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

    public SnmpTransportWhereInput usernameNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USERNAME_NOT_CONTAINS);
        return this;
    }

    public SnmpTransportWhereInput usernameNotContains_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput usernameNotEndsWith(String usernameNotEndsWith) {

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

    public SnmpTransportWhereInput usernameNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USERNAME_NOT_ENDS_WITH);
        return this;
    }

    public SnmpTransportWhereInput usernameNotEndsWith_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput usernameNotIn(List<String> usernameNotIn) {

        this.usernameNotIn = usernameNotIn;
        return this;
    }

    public SnmpTransportWhereInput addUsernameNotInItem(String usernameNotInItem) {
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

    public SnmpTransportWhereInput usernameNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USERNAME_NOT_IN);
        return this;
    }

    public SnmpTransportWhereInput usernameNotIn_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput usernameNotStartsWith(String usernameNotStartsWith) {

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

    public SnmpTransportWhereInput usernameNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USERNAME_NOT_STARTS_WITH);
        return this;
    }

    public SnmpTransportWhereInput usernameNotStartsWith_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput usernameStartsWith(String usernameStartsWith) {

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

    public SnmpTransportWhereInput usernameStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USERNAME_STARTS_WITH);
        return this;
    }

    public SnmpTransportWhereInput usernameStartsWith_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput version(SnmpVersion version) {

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

    public SnmpTransportWhereInput version_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VERSION);
        return this;
    }

    public SnmpTransportWhereInput version_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput versionIn(List<SnmpVersion> versionIn) {

        this.versionIn = versionIn;
        return this;
    }

    public SnmpTransportWhereInput addVersionInItem(SnmpVersion versionInItem) {
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

    public SnmpTransportWhereInput versionIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VERSION_IN);
        return this;
    }

    public SnmpTransportWhereInput versionIn_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput versionNot(SnmpVersion versionNot) {

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

    public SnmpTransportWhereInput versionNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VERSION_NOT);
        return this;
    }

    public SnmpTransportWhereInput versionNot_ExplictlyNonNull() {
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

    public SnmpTransportWhereInput versionNotIn(List<SnmpVersion> versionNotIn) {

        this.versionNotIn = versionNotIn;
        return this;
    }

    public SnmpTransportWhereInput addVersionNotInItem(SnmpVersion versionNotInItem) {
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

    public SnmpTransportWhereInput versionNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VERSION_NOT_IN);
        return this;
    }

    public SnmpTransportWhereInput versionNotIn_ExplictlyNonNull() {
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
        SnmpTransportWhereInput snmpTransportWhereInput = (SnmpTransportWhereInput) o;
        return Objects.equals(this.AND, snmpTransportWhereInput.AND)
                && Objects.equals(this.NOT, snmpTransportWhereInput.NOT)
                && Objects.equals(this.OR, snmpTransportWhereInput.OR)
                && Objects.equals(this.authPassPhrase, snmpTransportWhereInput.authPassPhrase)
                && Objects.equals(
                        this.authPassPhraseContains, snmpTransportWhereInput.authPassPhraseContains)
                && Objects.equals(
                        this.authPassPhraseEndsWith, snmpTransportWhereInput.authPassPhraseEndsWith)
                && Objects.equals(this.authPassPhraseGt, snmpTransportWhereInput.authPassPhraseGt)
                && Objects.equals(this.authPassPhraseGte, snmpTransportWhereInput.authPassPhraseGte)
                && Objects.equals(this.authPassPhraseIn, snmpTransportWhereInput.authPassPhraseIn)
                && Objects.equals(this.authPassPhraseLt, snmpTransportWhereInput.authPassPhraseLt)
                && Objects.equals(this.authPassPhraseLte, snmpTransportWhereInput.authPassPhraseLte)
                && Objects.equals(this.authPassPhraseNot, snmpTransportWhereInput.authPassPhraseNot)
                && Objects.equals(
                        this.authPassPhraseNotContains,
                        snmpTransportWhereInput.authPassPhraseNotContains)
                && Objects.equals(
                        this.authPassPhraseNotEndsWith,
                        snmpTransportWhereInput.authPassPhraseNotEndsWith)
                && Objects.equals(
                        this.authPassPhraseNotIn, snmpTransportWhereInput.authPassPhraseNotIn)
                && Objects.equals(
                        this.authPassPhraseNotStartsWith,
                        snmpTransportWhereInput.authPassPhraseNotStartsWith)
                && Objects.equals(
                        this.authPassPhraseStartsWith,
                        snmpTransportWhereInput.authPassPhraseStartsWith)
                && Objects.equals(this.authProtocol, snmpTransportWhereInput.authProtocol)
                && Objects.equals(this.authProtocolIn, snmpTransportWhereInput.authProtocolIn)
                && Objects.equals(this.authProtocolNot, snmpTransportWhereInput.authProtocolNot)
                && Objects.equals(this.authProtocolNotIn, snmpTransportWhereInput.authProtocolNotIn)
                && Objects.equals(this.cluster, snmpTransportWhereInput.cluster)
                && Objects.equals(this.community, snmpTransportWhereInput.community)
                && Objects.equals(this.communityContains, snmpTransportWhereInput.communityContains)
                && Objects.equals(this.communityEndsWith, snmpTransportWhereInput.communityEndsWith)
                && Objects.equals(this.communityGt, snmpTransportWhereInput.communityGt)
                && Objects.equals(this.communityGte, snmpTransportWhereInput.communityGte)
                && Objects.equals(this.communityIn, snmpTransportWhereInput.communityIn)
                && Objects.equals(this.communityLt, snmpTransportWhereInput.communityLt)
                && Objects.equals(this.communityLte, snmpTransportWhereInput.communityLte)
                && Objects.equals(this.communityNot, snmpTransportWhereInput.communityNot)
                && Objects.equals(
                        this.communityNotContains, snmpTransportWhereInput.communityNotContains)
                && Objects.equals(
                        this.communityNotEndsWith, snmpTransportWhereInput.communityNotEndsWith)
                && Objects.equals(this.communityNotIn, snmpTransportWhereInput.communityNotIn)
                && Objects.equals(
                        this.communityNotStartsWith, snmpTransportWhereInput.communityNotStartsWith)
                && Objects.equals(
                        this.communityStartsWith, snmpTransportWhereInput.communityStartsWith)
                && Objects.equals(this.disabled, snmpTransportWhereInput.disabled)
                && Objects.equals(this.disabledNot, snmpTransportWhereInput.disabledNot)
                && Objects.equals(this.entityAsyncStatus, snmpTransportWhereInput.entityAsyncStatus)
                && Objects.equals(
                        this.entityAsyncStatusIn, snmpTransportWhereInput.entityAsyncStatusIn)
                && Objects.equals(
                        this.entityAsyncStatusNot, snmpTransportWhereInput.entityAsyncStatusNot)
                && Objects.equals(
                        this.entityAsyncStatusNotIn, snmpTransportWhereInput.entityAsyncStatusNotIn)
                && Objects.equals(this.id, snmpTransportWhereInput.id)
                && Objects.equals(this.idContains, snmpTransportWhereInput.idContains)
                && Objects.equals(this.idEndsWith, snmpTransportWhereInput.idEndsWith)
                && Objects.equals(this.idGt, snmpTransportWhereInput.idGt)
                && Objects.equals(this.idGte, snmpTransportWhereInput.idGte)
                && Objects.equals(this.idIn, snmpTransportWhereInput.idIn)
                && Objects.equals(this.idLt, snmpTransportWhereInput.idLt)
                && Objects.equals(this.idLte, snmpTransportWhereInput.idLte)
                && Objects.equals(this.idNot, snmpTransportWhereInput.idNot)
                && Objects.equals(this.idNotContains, snmpTransportWhereInput.idNotContains)
                && Objects.equals(this.idNotEndsWith, snmpTransportWhereInput.idNotEndsWith)
                && Objects.equals(this.idNotIn, snmpTransportWhereInput.idNotIn)
                && Objects.equals(this.idNotStartsWith, snmpTransportWhereInput.idNotStartsWith)
                && Objects.equals(this.idStartsWith, snmpTransportWhereInput.idStartsWith)
                && Objects.equals(this.localId, snmpTransportWhereInput.localId)
                && Objects.equals(this.localIdContains, snmpTransportWhereInput.localIdContains)
                && Objects.equals(this.localIdEndsWith, snmpTransportWhereInput.localIdEndsWith)
                && Objects.equals(this.localIdGt, snmpTransportWhereInput.localIdGt)
                && Objects.equals(this.localIdGte, snmpTransportWhereInput.localIdGte)
                && Objects.equals(this.localIdIn, snmpTransportWhereInput.localIdIn)
                && Objects.equals(this.localIdLt, snmpTransportWhereInput.localIdLt)
                && Objects.equals(this.localIdLte, snmpTransportWhereInput.localIdLte)
                && Objects.equals(this.localIdNot, snmpTransportWhereInput.localIdNot)
                && Objects.equals(
                        this.localIdNotContains, snmpTransportWhereInput.localIdNotContains)
                && Objects.equals(
                        this.localIdNotEndsWith, snmpTransportWhereInput.localIdNotEndsWith)
                && Objects.equals(this.localIdNotIn, snmpTransportWhereInput.localIdNotIn)
                && Objects.equals(
                        this.localIdNotStartsWith, snmpTransportWhereInput.localIdNotStartsWith)
                && Objects.equals(this.localIdStartsWith, snmpTransportWhereInput.localIdStartsWith)
                && Objects.equals(this.name, snmpTransportWhereInput.name)
                && Objects.equals(this.nameContains, snmpTransportWhereInput.nameContains)
                && Objects.equals(this.nameEndsWith, snmpTransportWhereInput.nameEndsWith)
                && Objects.equals(this.nameGt, snmpTransportWhereInput.nameGt)
                && Objects.equals(this.nameGte, snmpTransportWhereInput.nameGte)
                && Objects.equals(this.nameIn, snmpTransportWhereInput.nameIn)
                && Objects.equals(this.nameLt, snmpTransportWhereInput.nameLt)
                && Objects.equals(this.nameLte, snmpTransportWhereInput.nameLte)
                && Objects.equals(this.nameNot, snmpTransportWhereInput.nameNot)
                && Objects.equals(this.nameNotContains, snmpTransportWhereInput.nameNotContains)
                && Objects.equals(this.nameNotEndsWith, snmpTransportWhereInput.nameNotEndsWith)
                && Objects.equals(this.nameNotIn, snmpTransportWhereInput.nameNotIn)
                && Objects.equals(this.nameNotStartsWith, snmpTransportWhereInput.nameNotStartsWith)
                && Objects.equals(this.nameStartsWith, snmpTransportWhereInput.nameStartsWith)
                && Objects.equals(this.port, snmpTransportWhereInput.port)
                && Objects.equals(this.portGt, snmpTransportWhereInput.portGt)
                && Objects.equals(this.portGte, snmpTransportWhereInput.portGte)
                && Objects.equals(this.portIn, snmpTransportWhereInput.portIn)
                && Objects.equals(this.portLt, snmpTransportWhereInput.portLt)
                && Objects.equals(this.portLte, snmpTransportWhereInput.portLte)
                && Objects.equals(this.portNot, snmpTransportWhereInput.portNot)
                && Objects.equals(this.portNotIn, snmpTransportWhereInput.portNotIn)
                && Objects.equals(this.privacyPassPhrase, snmpTransportWhereInput.privacyPassPhrase)
                && Objects.equals(
                        this.privacyPassPhraseContains,
                        snmpTransportWhereInput.privacyPassPhraseContains)
                && Objects.equals(
                        this.privacyPassPhraseEndsWith,
                        snmpTransportWhereInput.privacyPassPhraseEndsWith)
                && Objects.equals(
                        this.privacyPassPhraseGt, snmpTransportWhereInput.privacyPassPhraseGt)
                && Objects.equals(
                        this.privacyPassPhraseGte, snmpTransportWhereInput.privacyPassPhraseGte)
                && Objects.equals(
                        this.privacyPassPhraseIn, snmpTransportWhereInput.privacyPassPhraseIn)
                && Objects.equals(
                        this.privacyPassPhraseLt, snmpTransportWhereInput.privacyPassPhraseLt)
                && Objects.equals(
                        this.privacyPassPhraseLte, snmpTransportWhereInput.privacyPassPhraseLte)
                && Objects.equals(
                        this.privacyPassPhraseNot, snmpTransportWhereInput.privacyPassPhraseNot)
                && Objects.equals(
                        this.privacyPassPhraseNotContains,
                        snmpTransportWhereInput.privacyPassPhraseNotContains)
                && Objects.equals(
                        this.privacyPassPhraseNotEndsWith,
                        snmpTransportWhereInput.privacyPassPhraseNotEndsWith)
                && Objects.equals(
                        this.privacyPassPhraseNotIn, snmpTransportWhereInput.privacyPassPhraseNotIn)
                && Objects.equals(
                        this.privacyPassPhraseNotStartsWith,
                        snmpTransportWhereInput.privacyPassPhraseNotStartsWith)
                && Objects.equals(
                        this.privacyPassPhraseStartsWith,
                        snmpTransportWhereInput.privacyPassPhraseStartsWith)
                && Objects.equals(this.privacyProtocol, snmpTransportWhereInput.privacyProtocol)
                && Objects.equals(this.privacyProtocolIn, snmpTransportWhereInput.privacyProtocolIn)
                && Objects.equals(
                        this.privacyProtocolNot, snmpTransportWhereInput.privacyProtocolNot)
                && Objects.equals(
                        this.privacyProtocolNotIn, snmpTransportWhereInput.privacyProtocolNotIn)
                && Objects.equals(this.protocol, snmpTransportWhereInput.protocol)
                && Objects.equals(this.protocolIn, snmpTransportWhereInput.protocolIn)
                && Objects.equals(this.protocolNot, snmpTransportWhereInput.protocolNot)
                && Objects.equals(this.protocolNotIn, snmpTransportWhereInput.protocolNotIn)
                && Objects.equals(this.username, snmpTransportWhereInput.username)
                && Objects.equals(this.usernameContains, snmpTransportWhereInput.usernameContains)
                && Objects.equals(this.usernameEndsWith, snmpTransportWhereInput.usernameEndsWith)
                && Objects.equals(this.usernameGt, snmpTransportWhereInput.usernameGt)
                && Objects.equals(this.usernameGte, snmpTransportWhereInput.usernameGte)
                && Objects.equals(this.usernameIn, snmpTransportWhereInput.usernameIn)
                && Objects.equals(this.usernameLt, snmpTransportWhereInput.usernameLt)
                && Objects.equals(this.usernameLte, snmpTransportWhereInput.usernameLte)
                && Objects.equals(this.usernameNot, snmpTransportWhereInput.usernameNot)
                && Objects.equals(
                        this.usernameNotContains, snmpTransportWhereInput.usernameNotContains)
                && Objects.equals(
                        this.usernameNotEndsWith, snmpTransportWhereInput.usernameNotEndsWith)
                && Objects.equals(this.usernameNotIn, snmpTransportWhereInput.usernameNotIn)
                && Objects.equals(
                        this.usernameNotStartsWith, snmpTransportWhereInput.usernameNotStartsWith)
                && Objects.equals(
                        this.usernameStartsWith, snmpTransportWhereInput.usernameStartsWith)
                && Objects.equals(this.version, snmpTransportWhereInput.version)
                && Objects.equals(this.versionIn, snmpTransportWhereInput.versionIn)
                && Objects.equals(this.versionNot, snmpTransportWhereInput.versionNot)
                && Objects.equals(this.versionNotIn, snmpTransportWhereInput.versionNotIn);
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
                entityAsyncStatus,
                entityAsyncStatusIn,
                entityAsyncStatusNot,
                entityAsyncStatusNotIn,
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
        sb.append("class SnmpTransportWhereInput {\n");
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

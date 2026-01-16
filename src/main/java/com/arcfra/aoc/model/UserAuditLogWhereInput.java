package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** UserAuditLogWhereInput */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class UserAuditLogWhereInput
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_A_N_D = "AND";

    @SerializedName(SERIALIZED_NAME_A_N_D)
    private List<UserAuditLogWhereInput> AND = null;

    public static final String SERIALIZED_NAME_N_O_T = "NOT";

    @SerializedName(SERIALIZED_NAME_N_O_T)
    private List<UserAuditLogWhereInput> NOT = null;

    public static final String SERIALIZED_NAME_O_R = "OR";

    @SerializedName(SERIALIZED_NAME_O_R)
    private List<UserAuditLogWhereInput> OR = null;

    public static final String SERIALIZED_NAME_ACTION = "action";

    @SerializedName(SERIALIZED_NAME_ACTION)
    private String action;

    public static final String SERIALIZED_NAME_ACTION_CONTAINS = "action_contains";

    @SerializedName(SERIALIZED_NAME_ACTION_CONTAINS)
    private String actionContains;

    public static final String SERIALIZED_NAME_ACTION_ENDS_WITH = "action_ends_with";

    @SerializedName(SERIALIZED_NAME_ACTION_ENDS_WITH)
    private String actionEndsWith;

    public static final String SERIALIZED_NAME_ACTION_GT = "action_gt";

    @SerializedName(SERIALIZED_NAME_ACTION_GT)
    private String actionGt;

    public static final String SERIALIZED_NAME_ACTION_GTE = "action_gte";

    @SerializedName(SERIALIZED_NAME_ACTION_GTE)
    private String actionGte;

    public static final String SERIALIZED_NAME_ACTION_IN = "action_in";

    @SerializedName(SERIALIZED_NAME_ACTION_IN)
    private List<String> actionIn = null;

    public static final String SERIALIZED_NAME_ACTION_LT = "action_lt";

    @SerializedName(SERIALIZED_NAME_ACTION_LT)
    private String actionLt;

    public static final String SERIALIZED_NAME_ACTION_LTE = "action_lte";

    @SerializedName(SERIALIZED_NAME_ACTION_LTE)
    private String actionLte;

    public static final String SERIALIZED_NAME_ACTION_NOT = "action_not";

    @SerializedName(SERIALIZED_NAME_ACTION_NOT)
    private String actionNot;

    public static final String SERIALIZED_NAME_ACTION_NOT_CONTAINS = "action_not_contains";

    @SerializedName(SERIALIZED_NAME_ACTION_NOT_CONTAINS)
    private String actionNotContains;

    public static final String SERIALIZED_NAME_ACTION_NOT_ENDS_WITH = "action_not_ends_with";

    @SerializedName(SERIALIZED_NAME_ACTION_NOT_ENDS_WITH)
    private String actionNotEndsWith;

    public static final String SERIALIZED_NAME_ACTION_NOT_IN = "action_not_in";

    @SerializedName(SERIALIZED_NAME_ACTION_NOT_IN)
    private List<String> actionNotIn = null;

    public static final String SERIALIZED_NAME_ACTION_NOT_STARTS_WITH = "action_not_starts_with";

    @SerializedName(SERIALIZED_NAME_ACTION_NOT_STARTS_WITH)
    private String actionNotStartsWith;

    public static final String SERIALIZED_NAME_ACTION_STARTS_WITH = "action_starts_with";

    @SerializedName(SERIALIZED_NAME_ACTION_STARTS_WITH)
    private String actionStartsWith;

    public static final String SERIALIZED_NAME_AUTH_TYPE = "auth_type";

    @SerializedName(SERIALIZED_NAME_AUTH_TYPE)
    private String authType;

    public static final String SERIALIZED_NAME_AUTH_TYPE_CONTAINS = "auth_type_contains";

    @SerializedName(SERIALIZED_NAME_AUTH_TYPE_CONTAINS)
    private String authTypeContains;

    public static final String SERIALIZED_NAME_AUTH_TYPE_ENDS_WITH = "auth_type_ends_with";

    @SerializedName(SERIALIZED_NAME_AUTH_TYPE_ENDS_WITH)
    private String authTypeEndsWith;

    public static final String SERIALIZED_NAME_AUTH_TYPE_GT = "auth_type_gt";

    @SerializedName(SERIALIZED_NAME_AUTH_TYPE_GT)
    private String authTypeGt;

    public static final String SERIALIZED_NAME_AUTH_TYPE_GTE = "auth_type_gte";

    @SerializedName(SERIALIZED_NAME_AUTH_TYPE_GTE)
    private String authTypeGte;

    public static final String SERIALIZED_NAME_AUTH_TYPE_IN = "auth_type_in";

    @SerializedName(SERIALIZED_NAME_AUTH_TYPE_IN)
    private List<String> authTypeIn = null;

    public static final String SERIALIZED_NAME_AUTH_TYPE_LT = "auth_type_lt";

    @SerializedName(SERIALIZED_NAME_AUTH_TYPE_LT)
    private String authTypeLt;

    public static final String SERIALIZED_NAME_AUTH_TYPE_LTE = "auth_type_lte";

    @SerializedName(SERIALIZED_NAME_AUTH_TYPE_LTE)
    private String authTypeLte;

    public static final String SERIALIZED_NAME_AUTH_TYPE_NOT = "auth_type_not";

    @SerializedName(SERIALIZED_NAME_AUTH_TYPE_NOT)
    private String authTypeNot;

    public static final String SERIALIZED_NAME_AUTH_TYPE_NOT_CONTAINS = "auth_type_not_contains";

    @SerializedName(SERIALIZED_NAME_AUTH_TYPE_NOT_CONTAINS)
    private String authTypeNotContains;

    public static final String SERIALIZED_NAME_AUTH_TYPE_NOT_ENDS_WITH = "auth_type_not_ends_with";

    @SerializedName(SERIALIZED_NAME_AUTH_TYPE_NOT_ENDS_WITH)
    private String authTypeNotEndsWith;

    public static final String SERIALIZED_NAME_AUTH_TYPE_NOT_IN = "auth_type_not_in";

    @SerializedName(SERIALIZED_NAME_AUTH_TYPE_NOT_IN)
    private List<String> authTypeNotIn = null;

    public static final String SERIALIZED_NAME_AUTH_TYPE_NOT_STARTS_WITH =
            "auth_type_not_starts_with";

    @SerializedName(SERIALIZED_NAME_AUTH_TYPE_NOT_STARTS_WITH)
    private String authTypeNotStartsWith;

    public static final String SERIALIZED_NAME_AUTH_TYPE_STARTS_WITH = "auth_type_starts_with";

    @SerializedName(SERIALIZED_NAME_AUTH_TYPE_STARTS_WITH)
    private String authTypeStartsWith;

    public static final String SERIALIZED_NAME_CLUSTER = "cluster";

    @SerializedName(SERIALIZED_NAME_CLUSTER)
    private ClusterWhereInput cluster;

    public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";

    @SerializedName(SERIALIZED_NAME_CREATED_AT)
    private String createdAt;

    public static final String SERIALIZED_NAME_CREATED_AT_GT = "createdAt_gt";

    @SerializedName(SERIALIZED_NAME_CREATED_AT_GT)
    private String createdAtGt;

    public static final String SERIALIZED_NAME_CREATED_AT_GTE = "createdAt_gte";

    @SerializedName(SERIALIZED_NAME_CREATED_AT_GTE)
    private String createdAtGte;

    public static final String SERIALIZED_NAME_CREATED_AT_IN = "createdAt_in";

    @SerializedName(SERIALIZED_NAME_CREATED_AT_IN)
    private List<String> createdAtIn = null;

    public static final String SERIALIZED_NAME_CREATED_AT_LT = "createdAt_lt";

    @SerializedName(SERIALIZED_NAME_CREATED_AT_LT)
    private String createdAtLt;

    public static final String SERIALIZED_NAME_CREATED_AT_LTE = "createdAt_lte";

    @SerializedName(SERIALIZED_NAME_CREATED_AT_LTE)
    private String createdAtLte;

    public static final String SERIALIZED_NAME_CREATED_AT_NOT = "createdAt_not";

    @SerializedName(SERIALIZED_NAME_CREATED_AT_NOT)
    private String createdAtNot;

    public static final String SERIALIZED_NAME_CREATED_AT_NOT_IN = "createdAt_not_in";

    @SerializedName(SERIALIZED_NAME_CREATED_AT_NOT_IN)
    private List<String> createdAtNotIn = null;

    public static final String SERIALIZED_NAME_FINISHED_AT = "finished_at";

    @SerializedName(SERIALIZED_NAME_FINISHED_AT)
    private String finishedAt;

    public static final String SERIALIZED_NAME_FINISHED_AT_GT = "finished_at_gt";

    @SerializedName(SERIALIZED_NAME_FINISHED_AT_GT)
    private String finishedAtGt;

    public static final String SERIALIZED_NAME_FINISHED_AT_GTE = "finished_at_gte";

    @SerializedName(SERIALIZED_NAME_FINISHED_AT_GTE)
    private String finishedAtGte;

    public static final String SERIALIZED_NAME_FINISHED_AT_IN = "finished_at_in";

    @SerializedName(SERIALIZED_NAME_FINISHED_AT_IN)
    private List<String> finishedAtIn = null;

    public static final String SERIALIZED_NAME_FINISHED_AT_LT = "finished_at_lt";

    @SerializedName(SERIALIZED_NAME_FINISHED_AT_LT)
    private String finishedAtLt;

    public static final String SERIALIZED_NAME_FINISHED_AT_LTE = "finished_at_lte";

    @SerializedName(SERIALIZED_NAME_FINISHED_AT_LTE)
    private String finishedAtLte;

    public static final String SERIALIZED_NAME_FINISHED_AT_NOT = "finished_at_not";

    @SerializedName(SERIALIZED_NAME_FINISHED_AT_NOT)
    private String finishedAtNot;

    public static final String SERIALIZED_NAME_FINISHED_AT_NOT_IN = "finished_at_not_in";

    @SerializedName(SERIALIZED_NAME_FINISHED_AT_NOT_IN)
    private List<String> finishedAtNotIn = null;

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

    public static final String SERIALIZED_NAME_IP_ADDRESS = "ip_address";

    @SerializedName(SERIALIZED_NAME_IP_ADDRESS)
    private String ipAddress;

    public static final String SERIALIZED_NAME_IP_ADDRESS_CONTAINS = "ip_address_contains";

    @SerializedName(SERIALIZED_NAME_IP_ADDRESS_CONTAINS)
    private String ipAddressContains;

    public static final String SERIALIZED_NAME_IP_ADDRESS_ENDS_WITH = "ip_address_ends_with";

    @SerializedName(SERIALIZED_NAME_IP_ADDRESS_ENDS_WITH)
    private String ipAddressEndsWith;

    public static final String SERIALIZED_NAME_IP_ADDRESS_GT = "ip_address_gt";

    @SerializedName(SERIALIZED_NAME_IP_ADDRESS_GT)
    private String ipAddressGt;

    public static final String SERIALIZED_NAME_IP_ADDRESS_GTE = "ip_address_gte";

    @SerializedName(SERIALIZED_NAME_IP_ADDRESS_GTE)
    private String ipAddressGte;

    public static final String SERIALIZED_NAME_IP_ADDRESS_IN = "ip_address_in";

    @SerializedName(SERIALIZED_NAME_IP_ADDRESS_IN)
    private List<String> ipAddressIn = null;

    public static final String SERIALIZED_NAME_IP_ADDRESS_LT = "ip_address_lt";

    @SerializedName(SERIALIZED_NAME_IP_ADDRESS_LT)
    private String ipAddressLt;

    public static final String SERIALIZED_NAME_IP_ADDRESS_LTE = "ip_address_lte";

    @SerializedName(SERIALIZED_NAME_IP_ADDRESS_LTE)
    private String ipAddressLte;

    public static final String SERIALIZED_NAME_IP_ADDRESS_NOT = "ip_address_not";

    @SerializedName(SERIALIZED_NAME_IP_ADDRESS_NOT)
    private String ipAddressNot;

    public static final String SERIALIZED_NAME_IP_ADDRESS_NOT_CONTAINS = "ip_address_not_contains";

    @SerializedName(SERIALIZED_NAME_IP_ADDRESS_NOT_CONTAINS)
    private String ipAddressNotContains;

    public static final String SERIALIZED_NAME_IP_ADDRESS_NOT_ENDS_WITH =
            "ip_address_not_ends_with";

    @SerializedName(SERIALIZED_NAME_IP_ADDRESS_NOT_ENDS_WITH)
    private String ipAddressNotEndsWith;

    public static final String SERIALIZED_NAME_IP_ADDRESS_NOT_IN = "ip_address_not_in";

    @SerializedName(SERIALIZED_NAME_IP_ADDRESS_NOT_IN)
    private List<String> ipAddressNotIn = null;

    public static final String SERIALIZED_NAME_IP_ADDRESS_NOT_STARTS_WITH =
            "ip_address_not_starts_with";

    @SerializedName(SERIALIZED_NAME_IP_ADDRESS_NOT_STARTS_WITH)
    private String ipAddressNotStartsWith;

    public static final String SERIALIZED_NAME_IP_ADDRESS_STARTS_WITH = "ip_address_starts_with";

    @SerializedName(SERIALIZED_NAME_IP_ADDRESS_STARTS_WITH)
    private String ipAddressStartsWith;

    public static final String SERIALIZED_NAME_MESSAGE = "message";

    @SerializedName(SERIALIZED_NAME_MESSAGE)
    private String message;

    public static final String SERIALIZED_NAME_MESSAGE_CONTAINS = "message_contains";

    @SerializedName(SERIALIZED_NAME_MESSAGE_CONTAINS)
    private String messageContains;

    public static final String SERIALIZED_NAME_MESSAGE_ENDS_WITH = "message_ends_with";

    @SerializedName(SERIALIZED_NAME_MESSAGE_ENDS_WITH)
    private String messageEndsWith;

    public static final String SERIALIZED_NAME_MESSAGE_GT = "message_gt";

    @SerializedName(SERIALIZED_NAME_MESSAGE_GT)
    private String messageGt;

    public static final String SERIALIZED_NAME_MESSAGE_GTE = "message_gte";

    @SerializedName(SERIALIZED_NAME_MESSAGE_GTE)
    private String messageGte;

    public static final String SERIALIZED_NAME_MESSAGE_IN = "message_in";

    @SerializedName(SERIALIZED_NAME_MESSAGE_IN)
    private List<String> messageIn = null;

    public static final String SERIALIZED_NAME_MESSAGE_LT = "message_lt";

    @SerializedName(SERIALIZED_NAME_MESSAGE_LT)
    private String messageLt;

    public static final String SERIALIZED_NAME_MESSAGE_LTE = "message_lte";

    @SerializedName(SERIALIZED_NAME_MESSAGE_LTE)
    private String messageLte;

    public static final String SERIALIZED_NAME_MESSAGE_NOT = "message_not";

    @SerializedName(SERIALIZED_NAME_MESSAGE_NOT)
    private String messageNot;

    public static final String SERIALIZED_NAME_MESSAGE_NOT_CONTAINS = "message_not_contains";

    @SerializedName(SERIALIZED_NAME_MESSAGE_NOT_CONTAINS)
    private String messageNotContains;

    public static final String SERIALIZED_NAME_MESSAGE_NOT_ENDS_WITH = "message_not_ends_with";

    @SerializedName(SERIALIZED_NAME_MESSAGE_NOT_ENDS_WITH)
    private String messageNotEndsWith;

    public static final String SERIALIZED_NAME_MESSAGE_NOT_IN = "message_not_in";

    @SerializedName(SERIALIZED_NAME_MESSAGE_NOT_IN)
    private List<String> messageNotIn = null;

    public static final String SERIALIZED_NAME_MESSAGE_NOT_STARTS_WITH = "message_not_starts_with";

    @SerializedName(SERIALIZED_NAME_MESSAGE_NOT_STARTS_WITH)
    private String messageNotStartsWith;

    public static final String SERIALIZED_NAME_MESSAGE_STARTS_WITH = "message_starts_with";

    @SerializedName(SERIALIZED_NAME_MESSAGE_STARTS_WITH)
    private String messageStartsWith;

    public static final String SERIALIZED_NAME_RESOURCE_ID = "resource_id";

    @SerializedName(SERIALIZED_NAME_RESOURCE_ID)
    private String resourceId;

    public static final String SERIALIZED_NAME_RESOURCE_ID_CONTAINS = "resource_id_contains";

    @SerializedName(SERIALIZED_NAME_RESOURCE_ID_CONTAINS)
    private String resourceIdContains;

    public static final String SERIALIZED_NAME_RESOURCE_ID_ENDS_WITH = "resource_id_ends_with";

    @SerializedName(SERIALIZED_NAME_RESOURCE_ID_ENDS_WITH)
    private String resourceIdEndsWith;

    public static final String SERIALIZED_NAME_RESOURCE_ID_GT = "resource_id_gt";

    @SerializedName(SERIALIZED_NAME_RESOURCE_ID_GT)
    private String resourceIdGt;

    public static final String SERIALIZED_NAME_RESOURCE_ID_GTE = "resource_id_gte";

    @SerializedName(SERIALIZED_NAME_RESOURCE_ID_GTE)
    private String resourceIdGte;

    public static final String SERIALIZED_NAME_RESOURCE_ID_IN = "resource_id_in";

    @SerializedName(SERIALIZED_NAME_RESOURCE_ID_IN)
    private List<String> resourceIdIn = null;

    public static final String SERIALIZED_NAME_RESOURCE_ID_LT = "resource_id_lt";

    @SerializedName(SERIALIZED_NAME_RESOURCE_ID_LT)
    private String resourceIdLt;

    public static final String SERIALIZED_NAME_RESOURCE_ID_LTE = "resource_id_lte";

    @SerializedName(SERIALIZED_NAME_RESOURCE_ID_LTE)
    private String resourceIdLte;

    public static final String SERIALIZED_NAME_RESOURCE_ID_NOT = "resource_id_not";

    @SerializedName(SERIALIZED_NAME_RESOURCE_ID_NOT)
    private String resourceIdNot;

    public static final String SERIALIZED_NAME_RESOURCE_ID_NOT_CONTAINS =
            "resource_id_not_contains";

    @SerializedName(SERIALIZED_NAME_RESOURCE_ID_NOT_CONTAINS)
    private String resourceIdNotContains;

    public static final String SERIALIZED_NAME_RESOURCE_ID_NOT_ENDS_WITH =
            "resource_id_not_ends_with";

    @SerializedName(SERIALIZED_NAME_RESOURCE_ID_NOT_ENDS_WITH)
    private String resourceIdNotEndsWith;

    public static final String SERIALIZED_NAME_RESOURCE_ID_NOT_IN = "resource_id_not_in";

    @SerializedName(SERIALIZED_NAME_RESOURCE_ID_NOT_IN)
    private List<String> resourceIdNotIn = null;

    public static final String SERIALIZED_NAME_RESOURCE_ID_NOT_STARTS_WITH =
            "resource_id_not_starts_with";

    @SerializedName(SERIALIZED_NAME_RESOURCE_ID_NOT_STARTS_WITH)
    private String resourceIdNotStartsWith;

    public static final String SERIALIZED_NAME_RESOURCE_ID_STARTS_WITH = "resource_id_starts_with";

    @SerializedName(SERIALIZED_NAME_RESOURCE_ID_STARTS_WITH)
    private String resourceIdStartsWith;

    public static final String SERIALIZED_NAME_RESOURCE_TYPE = "resource_type";

    @SerializedName(SERIALIZED_NAME_RESOURCE_TYPE)
    private String resourceType;

    public static final String SERIALIZED_NAME_RESOURCE_TYPE_CONTAINS = "resource_type_contains";

    @SerializedName(SERIALIZED_NAME_RESOURCE_TYPE_CONTAINS)
    private String resourceTypeContains;

    public static final String SERIALIZED_NAME_RESOURCE_TYPE_ENDS_WITH = "resource_type_ends_with";

    @SerializedName(SERIALIZED_NAME_RESOURCE_TYPE_ENDS_WITH)
    private String resourceTypeEndsWith;

    public static final String SERIALIZED_NAME_RESOURCE_TYPE_GT = "resource_type_gt";

    @SerializedName(SERIALIZED_NAME_RESOURCE_TYPE_GT)
    private String resourceTypeGt;

    public static final String SERIALIZED_NAME_RESOURCE_TYPE_GTE = "resource_type_gte";

    @SerializedName(SERIALIZED_NAME_RESOURCE_TYPE_GTE)
    private String resourceTypeGte;

    public static final String SERIALIZED_NAME_RESOURCE_TYPE_IN = "resource_type_in";

    @SerializedName(SERIALIZED_NAME_RESOURCE_TYPE_IN)
    private List<String> resourceTypeIn = null;

    public static final String SERIALIZED_NAME_RESOURCE_TYPE_LT = "resource_type_lt";

    @SerializedName(SERIALIZED_NAME_RESOURCE_TYPE_LT)
    private String resourceTypeLt;

    public static final String SERIALIZED_NAME_RESOURCE_TYPE_LTE = "resource_type_lte";

    @SerializedName(SERIALIZED_NAME_RESOURCE_TYPE_LTE)
    private String resourceTypeLte;

    public static final String SERIALIZED_NAME_RESOURCE_TYPE_NOT = "resource_type_not";

    @SerializedName(SERIALIZED_NAME_RESOURCE_TYPE_NOT)
    private String resourceTypeNot;

    public static final String SERIALIZED_NAME_RESOURCE_TYPE_NOT_CONTAINS =
            "resource_type_not_contains";

    @SerializedName(SERIALIZED_NAME_RESOURCE_TYPE_NOT_CONTAINS)
    private String resourceTypeNotContains;

    public static final String SERIALIZED_NAME_RESOURCE_TYPE_NOT_ENDS_WITH =
            "resource_type_not_ends_with";

    @SerializedName(SERIALIZED_NAME_RESOURCE_TYPE_NOT_ENDS_WITH)
    private String resourceTypeNotEndsWith;

    public static final String SERIALIZED_NAME_RESOURCE_TYPE_NOT_IN = "resource_type_not_in";

    @SerializedName(SERIALIZED_NAME_RESOURCE_TYPE_NOT_IN)
    private List<String> resourceTypeNotIn = null;

    public static final String SERIALIZED_NAME_RESOURCE_TYPE_NOT_STARTS_WITH =
            "resource_type_not_starts_with";

    @SerializedName(SERIALIZED_NAME_RESOURCE_TYPE_NOT_STARTS_WITH)
    private String resourceTypeNotStartsWith;

    public static final String SERIALIZED_NAME_RESOURCE_TYPE_STARTS_WITH =
            "resource_type_starts_with";

    @SerializedName(SERIALIZED_NAME_RESOURCE_TYPE_STARTS_WITH)
    private String resourceTypeStartsWith;

    public static final String SERIALIZED_NAME_STARTED_AT = "started_at";

    @SerializedName(SERIALIZED_NAME_STARTED_AT)
    private String startedAt;

    public static final String SERIALIZED_NAME_STARTED_AT_GT = "started_at_gt";

    @SerializedName(SERIALIZED_NAME_STARTED_AT_GT)
    private String startedAtGt;

    public static final String SERIALIZED_NAME_STARTED_AT_GTE = "started_at_gte";

    @SerializedName(SERIALIZED_NAME_STARTED_AT_GTE)
    private String startedAtGte;

    public static final String SERIALIZED_NAME_STARTED_AT_IN = "started_at_in";

    @SerializedName(SERIALIZED_NAME_STARTED_AT_IN)
    private List<String> startedAtIn = null;

    public static final String SERIALIZED_NAME_STARTED_AT_LT = "started_at_lt";

    @SerializedName(SERIALIZED_NAME_STARTED_AT_LT)
    private String startedAtLt;

    public static final String SERIALIZED_NAME_STARTED_AT_LTE = "started_at_lte";

    @SerializedName(SERIALIZED_NAME_STARTED_AT_LTE)
    private String startedAtLte;

    public static final String SERIALIZED_NAME_STARTED_AT_NOT = "started_at_not";

    @SerializedName(SERIALIZED_NAME_STARTED_AT_NOT)
    private String startedAtNot;

    public static final String SERIALIZED_NAME_STARTED_AT_NOT_IN = "started_at_not_in";

    @SerializedName(SERIALIZED_NAME_STARTED_AT_NOT_IN)
    private List<String> startedAtNotIn = null;

    public static final String SERIALIZED_NAME_STATUS = "status";

    @SerializedName(SERIALIZED_NAME_STATUS)
    private UserAuditLogStatus status;

    public static final String SERIALIZED_NAME_STATUS_IN = "status_in";

    @SerializedName(SERIALIZED_NAME_STATUS_IN)
    private List<UserAuditLogStatus> statusIn = null;

    public static final String SERIALIZED_NAME_STATUS_NOT = "status_not";

    @SerializedName(SERIALIZED_NAME_STATUS_NOT)
    private UserAuditLogStatus statusNot;

    public static final String SERIALIZED_NAME_STATUS_NOT_IN = "status_not_in";

    @SerializedName(SERIALIZED_NAME_STATUS_NOT_IN)
    private List<UserAuditLogStatus> statusNotIn = null;

    public static final String SERIALIZED_NAME_USER = "user";

    @SerializedName(SERIALIZED_NAME_USER)
    private UserWhereInput user;

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

    public UserAuditLogWhereInput() {}

    public UserAuditLogWhereInput AND(List<UserAuditLogWhereInput> AND) {

        this.AND = AND;
        return this;
    }

    public UserAuditLogWhereInput addANDItem(UserAuditLogWhereInput ANDItem) {
        if (this.AND == null) {
            this.AND = new ArrayList<UserAuditLogWhereInput>();
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
    public List<UserAuditLogWhereInput> getAND() {
        return AND;
    }

    public void setAND(List<UserAuditLogWhereInput> AND) {
        this.AND = AND;
    }

    public UserAuditLogWhereInput AND_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_A_N_D);
        return this;
    }

    public UserAuditLogWhereInput AND_ExplictlyNonNull() {
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

    public UserAuditLogWhereInput NOT(List<UserAuditLogWhereInput> NOT) {

        this.NOT = NOT;
        return this;
    }

    public UserAuditLogWhereInput addNOTItem(UserAuditLogWhereInput NOTItem) {
        if (this.NOT == null) {
            this.NOT = new ArrayList<UserAuditLogWhereInput>();
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
    public List<UserAuditLogWhereInput> getNOT() {
        return NOT;
    }

    public void setNOT(List<UserAuditLogWhereInput> NOT) {
        this.NOT = NOT;
    }

    public UserAuditLogWhereInput NOT_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_N_O_T);
        return this;
    }

    public UserAuditLogWhereInput NOT_ExplictlyNonNull() {
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

    public UserAuditLogWhereInput OR(List<UserAuditLogWhereInput> OR) {

        this.OR = OR;
        return this;
    }

    public UserAuditLogWhereInput addORItem(UserAuditLogWhereInput ORItem) {
        if (this.OR == null) {
            this.OR = new ArrayList<UserAuditLogWhereInput>();
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
    public List<UserAuditLogWhereInput> getOR() {
        return OR;
    }

    public void setOR(List<UserAuditLogWhereInput> OR) {
        this.OR = OR;
    }

    public UserAuditLogWhereInput OR_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_O_R);
        return this;
    }

    public UserAuditLogWhereInput OR_ExplictlyNonNull() {
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

    public UserAuditLogWhereInput action(String action) {

        this.action = action;
        return this;
    }

    /**
     * Get action
     *
     * @return action
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public UserAuditLogWhereInput action_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ACTION);
        return this;
    }

    public UserAuditLogWhereInput action_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ACTION);
        return this;
    }

    public void setAction_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ACTION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ACTION);
        }
    }

    public boolean getAction_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ACTION);
    }

    public UserAuditLogWhereInput actionContains(String actionContains) {

        this.actionContains = actionContains;
        return this;
    }

    /**
     * Get actionContains
     *
     * @return actionContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getActionContains() {
        return actionContains;
    }

    public void setActionContains(String actionContains) {
        this.actionContains = actionContains;
    }

    public UserAuditLogWhereInput actionContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ACTION_CONTAINS);
        return this;
    }

    public UserAuditLogWhereInput actionContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ACTION_CONTAINS);
        return this;
    }

    public void setActionContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ACTION_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ACTION_CONTAINS);
        }
    }

    public boolean getActionContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ACTION_CONTAINS);
    }

    public UserAuditLogWhereInput actionEndsWith(String actionEndsWith) {

        this.actionEndsWith = actionEndsWith;
        return this;
    }

    /**
     * Get actionEndsWith
     *
     * @return actionEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getActionEndsWith() {
        return actionEndsWith;
    }

    public void setActionEndsWith(String actionEndsWith) {
        this.actionEndsWith = actionEndsWith;
    }

    public UserAuditLogWhereInput actionEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ACTION_ENDS_WITH);
        return this;
    }

    public UserAuditLogWhereInput actionEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ACTION_ENDS_WITH);
        return this;
    }

    public void setActionEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ACTION_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ACTION_ENDS_WITH);
        }
    }

    public boolean getActionEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ACTION_ENDS_WITH);
    }

    public UserAuditLogWhereInput actionGt(String actionGt) {

        this.actionGt = actionGt;
        return this;
    }

    /**
     * Get actionGt
     *
     * @return actionGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getActionGt() {
        return actionGt;
    }

    public void setActionGt(String actionGt) {
        this.actionGt = actionGt;
    }

    public UserAuditLogWhereInput actionGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ACTION_GT);
        return this;
    }

    public UserAuditLogWhereInput actionGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ACTION_GT);
        return this;
    }

    public void setActionGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ACTION_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ACTION_GT);
        }
    }

    public boolean getActionGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ACTION_GT);
    }

    public UserAuditLogWhereInput actionGte(String actionGte) {

        this.actionGte = actionGte;
        return this;
    }

    /**
     * Get actionGte
     *
     * @return actionGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getActionGte() {
        return actionGte;
    }

    public void setActionGte(String actionGte) {
        this.actionGte = actionGte;
    }

    public UserAuditLogWhereInput actionGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ACTION_GTE);
        return this;
    }

    public UserAuditLogWhereInput actionGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ACTION_GTE);
        return this;
    }

    public void setActionGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ACTION_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ACTION_GTE);
        }
    }

    public boolean getActionGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ACTION_GTE);
    }

    public UserAuditLogWhereInput actionIn(List<String> actionIn) {

        this.actionIn = actionIn;
        return this;
    }

    public UserAuditLogWhereInput addActionInItem(String actionInItem) {
        if (this.actionIn == null) {
            this.actionIn = new ArrayList<String>();
        }
        this.actionIn.add(actionInItem);
        return this;
    }

    /**
     * Get actionIn
     *
     * @return actionIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getActionIn() {
        return actionIn;
    }

    public void setActionIn(List<String> actionIn) {
        this.actionIn = actionIn;
    }

    public UserAuditLogWhereInput actionIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ACTION_IN);
        return this;
    }

    public UserAuditLogWhereInput actionIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ACTION_IN);
        return this;
    }

    public void setActionIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ACTION_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ACTION_IN);
        }
    }

    public boolean getActionIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ACTION_IN);
    }

    public UserAuditLogWhereInput actionLt(String actionLt) {

        this.actionLt = actionLt;
        return this;
    }

    /**
     * Get actionLt
     *
     * @return actionLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getActionLt() {
        return actionLt;
    }

    public void setActionLt(String actionLt) {
        this.actionLt = actionLt;
    }

    public UserAuditLogWhereInput actionLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ACTION_LT);
        return this;
    }

    public UserAuditLogWhereInput actionLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ACTION_LT);
        return this;
    }

    public void setActionLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ACTION_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ACTION_LT);
        }
    }

    public boolean getActionLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ACTION_LT);
    }

    public UserAuditLogWhereInput actionLte(String actionLte) {

        this.actionLte = actionLte;
        return this;
    }

    /**
     * Get actionLte
     *
     * @return actionLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getActionLte() {
        return actionLte;
    }

    public void setActionLte(String actionLte) {
        this.actionLte = actionLte;
    }

    public UserAuditLogWhereInput actionLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ACTION_LTE);
        return this;
    }

    public UserAuditLogWhereInput actionLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ACTION_LTE);
        return this;
    }

    public void setActionLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ACTION_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ACTION_LTE);
        }
    }

    public boolean getActionLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ACTION_LTE);
    }

    public UserAuditLogWhereInput actionNot(String actionNot) {

        this.actionNot = actionNot;
        return this;
    }

    /**
     * Get actionNot
     *
     * @return actionNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getActionNot() {
        return actionNot;
    }

    public void setActionNot(String actionNot) {
        this.actionNot = actionNot;
    }

    public UserAuditLogWhereInput actionNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ACTION_NOT);
        return this;
    }

    public UserAuditLogWhereInput actionNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ACTION_NOT);
        return this;
    }

    public void setActionNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ACTION_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ACTION_NOT);
        }
    }

    public boolean getActionNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ACTION_NOT);
    }

    public UserAuditLogWhereInput actionNotContains(String actionNotContains) {

        this.actionNotContains = actionNotContains;
        return this;
    }

    /**
     * Get actionNotContains
     *
     * @return actionNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getActionNotContains() {
        return actionNotContains;
    }

    public void setActionNotContains(String actionNotContains) {
        this.actionNotContains = actionNotContains;
    }

    public UserAuditLogWhereInput actionNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ACTION_NOT_CONTAINS);
        return this;
    }

    public UserAuditLogWhereInput actionNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ACTION_NOT_CONTAINS);
        return this;
    }

    public void setActionNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ACTION_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ACTION_NOT_CONTAINS);
        }
    }

    public boolean getActionNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ACTION_NOT_CONTAINS);
    }

    public UserAuditLogWhereInput actionNotEndsWith(String actionNotEndsWith) {

        this.actionNotEndsWith = actionNotEndsWith;
        return this;
    }

    /**
     * Get actionNotEndsWith
     *
     * @return actionNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getActionNotEndsWith() {
        return actionNotEndsWith;
    }

    public void setActionNotEndsWith(String actionNotEndsWith) {
        this.actionNotEndsWith = actionNotEndsWith;
    }

    public UserAuditLogWhereInput actionNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ACTION_NOT_ENDS_WITH);
        return this;
    }

    public UserAuditLogWhereInput actionNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ACTION_NOT_ENDS_WITH);
        return this;
    }

    public void setActionNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ACTION_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ACTION_NOT_ENDS_WITH);
        }
    }

    public boolean getActionNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ACTION_NOT_ENDS_WITH);
    }

    public UserAuditLogWhereInput actionNotIn(List<String> actionNotIn) {

        this.actionNotIn = actionNotIn;
        return this;
    }

    public UserAuditLogWhereInput addActionNotInItem(String actionNotInItem) {
        if (this.actionNotIn == null) {
            this.actionNotIn = new ArrayList<String>();
        }
        this.actionNotIn.add(actionNotInItem);
        return this;
    }

    /**
     * Get actionNotIn
     *
     * @return actionNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getActionNotIn() {
        return actionNotIn;
    }

    public void setActionNotIn(List<String> actionNotIn) {
        this.actionNotIn = actionNotIn;
    }

    public UserAuditLogWhereInput actionNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ACTION_NOT_IN);
        return this;
    }

    public UserAuditLogWhereInput actionNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ACTION_NOT_IN);
        return this;
    }

    public void setActionNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ACTION_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ACTION_NOT_IN);
        }
    }

    public boolean getActionNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ACTION_NOT_IN);
    }

    public UserAuditLogWhereInput actionNotStartsWith(String actionNotStartsWith) {

        this.actionNotStartsWith = actionNotStartsWith;
        return this;
    }

    /**
     * Get actionNotStartsWith
     *
     * @return actionNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getActionNotStartsWith() {
        return actionNotStartsWith;
    }

    public void setActionNotStartsWith(String actionNotStartsWith) {
        this.actionNotStartsWith = actionNotStartsWith;
    }

    public UserAuditLogWhereInput actionNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ACTION_NOT_STARTS_WITH);
        return this;
    }

    public UserAuditLogWhereInput actionNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ACTION_NOT_STARTS_WITH);
        return this;
    }

    public void setActionNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ACTION_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ACTION_NOT_STARTS_WITH);
        }
    }

    public boolean getActionNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ACTION_NOT_STARTS_WITH);
    }

    public UserAuditLogWhereInput actionStartsWith(String actionStartsWith) {

        this.actionStartsWith = actionStartsWith;
        return this;
    }

    /**
     * Get actionStartsWith
     *
     * @return actionStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getActionStartsWith() {
        return actionStartsWith;
    }

    public void setActionStartsWith(String actionStartsWith) {
        this.actionStartsWith = actionStartsWith;
    }

    public UserAuditLogWhereInput actionStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ACTION_STARTS_WITH);
        return this;
    }

    public UserAuditLogWhereInput actionStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ACTION_STARTS_WITH);
        return this;
    }

    public void setActionStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ACTION_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ACTION_STARTS_WITH);
        }
    }

    public boolean getActionStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ACTION_STARTS_WITH);
    }

    public UserAuditLogWhereInput authType(String authType) {

        this.authType = authType;
        return this;
    }

    /**
     * Get authType
     *
     * @return authType
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getAuthType() {
        return authType;
    }

    public void setAuthType(String authType) {
        this.authType = authType;
    }

    public UserAuditLogWhereInput authType_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_AUTH_TYPE);
        return this;
    }

    public UserAuditLogWhereInput authType_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_AUTH_TYPE);
        return this;
    }

    public void setAuthType_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_AUTH_TYPE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_AUTH_TYPE);
        }
    }

    public boolean getAuthType_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_AUTH_TYPE);
    }

    public UserAuditLogWhereInput authTypeContains(String authTypeContains) {

        this.authTypeContains = authTypeContains;
        return this;
    }

    /**
     * Get authTypeContains
     *
     * @return authTypeContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getAuthTypeContains() {
        return authTypeContains;
    }

    public void setAuthTypeContains(String authTypeContains) {
        this.authTypeContains = authTypeContains;
    }

    public UserAuditLogWhereInput authTypeContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_AUTH_TYPE_CONTAINS);
        return this;
    }

    public UserAuditLogWhereInput authTypeContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_AUTH_TYPE_CONTAINS);
        return this;
    }

    public void setAuthTypeContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_AUTH_TYPE_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_AUTH_TYPE_CONTAINS);
        }
    }

    public boolean getAuthTypeContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_AUTH_TYPE_CONTAINS);
    }

    public UserAuditLogWhereInput authTypeEndsWith(String authTypeEndsWith) {

        this.authTypeEndsWith = authTypeEndsWith;
        return this;
    }

    /**
     * Get authTypeEndsWith
     *
     * @return authTypeEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getAuthTypeEndsWith() {
        return authTypeEndsWith;
    }

    public void setAuthTypeEndsWith(String authTypeEndsWith) {
        this.authTypeEndsWith = authTypeEndsWith;
    }

    public UserAuditLogWhereInput authTypeEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_AUTH_TYPE_ENDS_WITH);
        return this;
    }

    public UserAuditLogWhereInput authTypeEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_AUTH_TYPE_ENDS_WITH);
        return this;
    }

    public void setAuthTypeEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_AUTH_TYPE_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_AUTH_TYPE_ENDS_WITH);
        }
    }

    public boolean getAuthTypeEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_AUTH_TYPE_ENDS_WITH);
    }

    public UserAuditLogWhereInput authTypeGt(String authTypeGt) {

        this.authTypeGt = authTypeGt;
        return this;
    }

    /**
     * Get authTypeGt
     *
     * @return authTypeGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getAuthTypeGt() {
        return authTypeGt;
    }

    public void setAuthTypeGt(String authTypeGt) {
        this.authTypeGt = authTypeGt;
    }

    public UserAuditLogWhereInput authTypeGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_AUTH_TYPE_GT);
        return this;
    }

    public UserAuditLogWhereInput authTypeGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_AUTH_TYPE_GT);
        return this;
    }

    public void setAuthTypeGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_AUTH_TYPE_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_AUTH_TYPE_GT);
        }
    }

    public boolean getAuthTypeGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_AUTH_TYPE_GT);
    }

    public UserAuditLogWhereInput authTypeGte(String authTypeGte) {

        this.authTypeGte = authTypeGte;
        return this;
    }

    /**
     * Get authTypeGte
     *
     * @return authTypeGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getAuthTypeGte() {
        return authTypeGte;
    }

    public void setAuthTypeGte(String authTypeGte) {
        this.authTypeGte = authTypeGte;
    }

    public UserAuditLogWhereInput authTypeGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_AUTH_TYPE_GTE);
        return this;
    }

    public UserAuditLogWhereInput authTypeGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_AUTH_TYPE_GTE);
        return this;
    }

    public void setAuthTypeGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_AUTH_TYPE_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_AUTH_TYPE_GTE);
        }
    }

    public boolean getAuthTypeGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_AUTH_TYPE_GTE);
    }

    public UserAuditLogWhereInput authTypeIn(List<String> authTypeIn) {

        this.authTypeIn = authTypeIn;
        return this;
    }

    public UserAuditLogWhereInput addAuthTypeInItem(String authTypeInItem) {
        if (this.authTypeIn == null) {
            this.authTypeIn = new ArrayList<String>();
        }
        this.authTypeIn.add(authTypeInItem);
        return this;
    }

    /**
     * Get authTypeIn
     *
     * @return authTypeIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getAuthTypeIn() {
        return authTypeIn;
    }

    public void setAuthTypeIn(List<String> authTypeIn) {
        this.authTypeIn = authTypeIn;
    }

    public UserAuditLogWhereInput authTypeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_AUTH_TYPE_IN);
        return this;
    }

    public UserAuditLogWhereInput authTypeIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_AUTH_TYPE_IN);
        return this;
    }

    public void setAuthTypeIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_AUTH_TYPE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_AUTH_TYPE_IN);
        }
    }

    public boolean getAuthTypeIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_AUTH_TYPE_IN);
    }

    public UserAuditLogWhereInput authTypeLt(String authTypeLt) {

        this.authTypeLt = authTypeLt;
        return this;
    }

    /**
     * Get authTypeLt
     *
     * @return authTypeLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getAuthTypeLt() {
        return authTypeLt;
    }

    public void setAuthTypeLt(String authTypeLt) {
        this.authTypeLt = authTypeLt;
    }

    public UserAuditLogWhereInput authTypeLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_AUTH_TYPE_LT);
        return this;
    }

    public UserAuditLogWhereInput authTypeLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_AUTH_TYPE_LT);
        return this;
    }

    public void setAuthTypeLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_AUTH_TYPE_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_AUTH_TYPE_LT);
        }
    }

    public boolean getAuthTypeLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_AUTH_TYPE_LT);
    }

    public UserAuditLogWhereInput authTypeLte(String authTypeLte) {

        this.authTypeLte = authTypeLte;
        return this;
    }

    /**
     * Get authTypeLte
     *
     * @return authTypeLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getAuthTypeLte() {
        return authTypeLte;
    }

    public void setAuthTypeLte(String authTypeLte) {
        this.authTypeLte = authTypeLte;
    }

    public UserAuditLogWhereInput authTypeLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_AUTH_TYPE_LTE);
        return this;
    }

    public UserAuditLogWhereInput authTypeLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_AUTH_TYPE_LTE);
        return this;
    }

    public void setAuthTypeLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_AUTH_TYPE_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_AUTH_TYPE_LTE);
        }
    }

    public boolean getAuthTypeLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_AUTH_TYPE_LTE);
    }

    public UserAuditLogWhereInput authTypeNot(String authTypeNot) {

        this.authTypeNot = authTypeNot;
        return this;
    }

    /**
     * Get authTypeNot
     *
     * @return authTypeNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getAuthTypeNot() {
        return authTypeNot;
    }

    public void setAuthTypeNot(String authTypeNot) {
        this.authTypeNot = authTypeNot;
    }

    public UserAuditLogWhereInput authTypeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_AUTH_TYPE_NOT);
        return this;
    }

    public UserAuditLogWhereInput authTypeNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_AUTH_TYPE_NOT);
        return this;
    }

    public void setAuthTypeNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_AUTH_TYPE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_AUTH_TYPE_NOT);
        }
    }

    public boolean getAuthTypeNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_AUTH_TYPE_NOT);
    }

    public UserAuditLogWhereInput authTypeNotContains(String authTypeNotContains) {

        this.authTypeNotContains = authTypeNotContains;
        return this;
    }

    /**
     * Get authTypeNotContains
     *
     * @return authTypeNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getAuthTypeNotContains() {
        return authTypeNotContains;
    }

    public void setAuthTypeNotContains(String authTypeNotContains) {
        this.authTypeNotContains = authTypeNotContains;
    }

    public UserAuditLogWhereInput authTypeNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_AUTH_TYPE_NOT_CONTAINS);
        return this;
    }

    public UserAuditLogWhereInput authTypeNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_AUTH_TYPE_NOT_CONTAINS);
        return this;
    }

    public void setAuthTypeNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_AUTH_TYPE_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_AUTH_TYPE_NOT_CONTAINS);
        }
    }

    public boolean getAuthTypeNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_AUTH_TYPE_NOT_CONTAINS);
    }

    public UserAuditLogWhereInput authTypeNotEndsWith(String authTypeNotEndsWith) {

        this.authTypeNotEndsWith = authTypeNotEndsWith;
        return this;
    }

    /**
     * Get authTypeNotEndsWith
     *
     * @return authTypeNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getAuthTypeNotEndsWith() {
        return authTypeNotEndsWith;
    }

    public void setAuthTypeNotEndsWith(String authTypeNotEndsWith) {
        this.authTypeNotEndsWith = authTypeNotEndsWith;
    }

    public UserAuditLogWhereInput authTypeNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_AUTH_TYPE_NOT_ENDS_WITH);
        return this;
    }

    public UserAuditLogWhereInput authTypeNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_AUTH_TYPE_NOT_ENDS_WITH);
        return this;
    }

    public void setAuthTypeNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_AUTH_TYPE_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_AUTH_TYPE_NOT_ENDS_WITH);
        }
    }

    public boolean getAuthTypeNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_AUTH_TYPE_NOT_ENDS_WITH);
    }

    public UserAuditLogWhereInput authTypeNotIn(List<String> authTypeNotIn) {

        this.authTypeNotIn = authTypeNotIn;
        return this;
    }

    public UserAuditLogWhereInput addAuthTypeNotInItem(String authTypeNotInItem) {
        if (this.authTypeNotIn == null) {
            this.authTypeNotIn = new ArrayList<String>();
        }
        this.authTypeNotIn.add(authTypeNotInItem);
        return this;
    }

    /**
     * Get authTypeNotIn
     *
     * @return authTypeNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getAuthTypeNotIn() {
        return authTypeNotIn;
    }

    public void setAuthTypeNotIn(List<String> authTypeNotIn) {
        this.authTypeNotIn = authTypeNotIn;
    }

    public UserAuditLogWhereInput authTypeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_AUTH_TYPE_NOT_IN);
        return this;
    }

    public UserAuditLogWhereInput authTypeNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_AUTH_TYPE_NOT_IN);
        return this;
    }

    public void setAuthTypeNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_AUTH_TYPE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_AUTH_TYPE_NOT_IN);
        }
    }

    public boolean getAuthTypeNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_AUTH_TYPE_NOT_IN);
    }

    public UserAuditLogWhereInput authTypeNotStartsWith(String authTypeNotStartsWith) {

        this.authTypeNotStartsWith = authTypeNotStartsWith;
        return this;
    }

    /**
     * Get authTypeNotStartsWith
     *
     * @return authTypeNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getAuthTypeNotStartsWith() {
        return authTypeNotStartsWith;
    }

    public void setAuthTypeNotStartsWith(String authTypeNotStartsWith) {
        this.authTypeNotStartsWith = authTypeNotStartsWith;
    }

    public UserAuditLogWhereInput authTypeNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_AUTH_TYPE_NOT_STARTS_WITH);
        return this;
    }

    public UserAuditLogWhereInput authTypeNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_AUTH_TYPE_NOT_STARTS_WITH);
        return this;
    }

    public void setAuthTypeNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_AUTH_TYPE_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_AUTH_TYPE_NOT_STARTS_WITH);
        }
    }

    public boolean getAuthTypeNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_AUTH_TYPE_NOT_STARTS_WITH);
    }

    public UserAuditLogWhereInput authTypeStartsWith(String authTypeStartsWith) {

        this.authTypeStartsWith = authTypeStartsWith;
        return this;
    }

    /**
     * Get authTypeStartsWith
     *
     * @return authTypeStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getAuthTypeStartsWith() {
        return authTypeStartsWith;
    }

    public void setAuthTypeStartsWith(String authTypeStartsWith) {
        this.authTypeStartsWith = authTypeStartsWith;
    }

    public UserAuditLogWhereInput authTypeStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_AUTH_TYPE_STARTS_WITH);
        return this;
    }

    public UserAuditLogWhereInput authTypeStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_AUTH_TYPE_STARTS_WITH);
        return this;
    }

    public void setAuthTypeStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_AUTH_TYPE_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_AUTH_TYPE_STARTS_WITH);
        }
    }

    public boolean getAuthTypeStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_AUTH_TYPE_STARTS_WITH);
    }

    public UserAuditLogWhereInput cluster(ClusterWhereInput cluster) {

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

    public UserAuditLogWhereInput cluster_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER);
        return this;
    }

    public UserAuditLogWhereInput cluster_ExplictlyNonNull() {
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

    public UserAuditLogWhereInput createdAt(String createdAt) {

        this.createdAt = createdAt;
        return this;
    }

    /**
     * Get createdAt
     *
     * @return createdAt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public UserAuditLogWhereInput createdAt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT);
        return this;
    }

    public UserAuditLogWhereInput createdAt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CREATED_AT);
        return this;
    }

    public void setCreatedAt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CREATED_AT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CREATED_AT);
        }
    }

    public boolean getCreatedAt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CREATED_AT);
    }

    public UserAuditLogWhereInput createdAtGt(String createdAtGt) {

        this.createdAtGt = createdAtGt;
        return this;
    }

    /**
     * Get createdAtGt
     *
     * @return createdAtGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCreatedAtGt() {
        return createdAtGt;
    }

    public void setCreatedAtGt(String createdAtGt) {
        this.createdAtGt = createdAtGt;
    }

    public UserAuditLogWhereInput createdAtGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_GT);
        return this;
    }

    public UserAuditLogWhereInput createdAtGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CREATED_AT_GT);
        return this;
    }

    public void setCreatedAtGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CREATED_AT_GT);
        }
    }

    public boolean getCreatedAtGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CREATED_AT_GT);
    }

    public UserAuditLogWhereInput createdAtGte(String createdAtGte) {

        this.createdAtGte = createdAtGte;
        return this;
    }

    /**
     * Get createdAtGte
     *
     * @return createdAtGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCreatedAtGte() {
        return createdAtGte;
    }

    public void setCreatedAtGte(String createdAtGte) {
        this.createdAtGte = createdAtGte;
    }

    public UserAuditLogWhereInput createdAtGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_GTE);
        return this;
    }

    public UserAuditLogWhereInput createdAtGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CREATED_AT_GTE);
        return this;
    }

    public void setCreatedAtGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CREATED_AT_GTE);
        }
    }

    public boolean getCreatedAtGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CREATED_AT_GTE);
    }

    public UserAuditLogWhereInput createdAtIn(List<String> createdAtIn) {

        this.createdAtIn = createdAtIn;
        return this;
    }

    public UserAuditLogWhereInput addCreatedAtInItem(String createdAtInItem) {
        if (this.createdAtIn == null) {
            this.createdAtIn = new ArrayList<String>();
        }
        this.createdAtIn.add(createdAtInItem);
        return this;
    }

    /**
     * Get createdAtIn
     *
     * @return createdAtIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getCreatedAtIn() {
        return createdAtIn;
    }

    public void setCreatedAtIn(List<String> createdAtIn) {
        this.createdAtIn = createdAtIn;
    }

    public UserAuditLogWhereInput createdAtIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_IN);
        return this;
    }

    public UserAuditLogWhereInput createdAtIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CREATED_AT_IN);
        return this;
    }

    public void setCreatedAtIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CREATED_AT_IN);
        }
    }

    public boolean getCreatedAtIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CREATED_AT_IN);
    }

    public UserAuditLogWhereInput createdAtLt(String createdAtLt) {

        this.createdAtLt = createdAtLt;
        return this;
    }

    /**
     * Get createdAtLt
     *
     * @return createdAtLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCreatedAtLt() {
        return createdAtLt;
    }

    public void setCreatedAtLt(String createdAtLt) {
        this.createdAtLt = createdAtLt;
    }

    public UserAuditLogWhereInput createdAtLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_LT);
        return this;
    }

    public UserAuditLogWhereInput createdAtLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CREATED_AT_LT);
        return this;
    }

    public void setCreatedAtLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CREATED_AT_LT);
        }
    }

    public boolean getCreatedAtLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CREATED_AT_LT);
    }

    public UserAuditLogWhereInput createdAtLte(String createdAtLte) {

        this.createdAtLte = createdAtLte;
        return this;
    }

    /**
     * Get createdAtLte
     *
     * @return createdAtLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCreatedAtLte() {
        return createdAtLte;
    }

    public void setCreatedAtLte(String createdAtLte) {
        this.createdAtLte = createdAtLte;
    }

    public UserAuditLogWhereInput createdAtLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_LTE);
        return this;
    }

    public UserAuditLogWhereInput createdAtLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CREATED_AT_LTE);
        return this;
    }

    public void setCreatedAtLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CREATED_AT_LTE);
        }
    }

    public boolean getCreatedAtLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CREATED_AT_LTE);
    }

    public UserAuditLogWhereInput createdAtNot(String createdAtNot) {

        this.createdAtNot = createdAtNot;
        return this;
    }

    /**
     * Get createdAtNot
     *
     * @return createdAtNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCreatedAtNot() {
        return createdAtNot;
    }

    public void setCreatedAtNot(String createdAtNot) {
        this.createdAtNot = createdAtNot;
    }

    public UserAuditLogWhereInput createdAtNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_NOT);
        return this;
    }

    public UserAuditLogWhereInput createdAtNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CREATED_AT_NOT);
        return this;
    }

    public void setCreatedAtNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CREATED_AT_NOT);
        }
    }

    public boolean getCreatedAtNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CREATED_AT_NOT);
    }

    public UserAuditLogWhereInput createdAtNotIn(List<String> createdAtNotIn) {

        this.createdAtNotIn = createdAtNotIn;
        return this;
    }

    public UserAuditLogWhereInput addCreatedAtNotInItem(String createdAtNotInItem) {
        if (this.createdAtNotIn == null) {
            this.createdAtNotIn = new ArrayList<String>();
        }
        this.createdAtNotIn.add(createdAtNotInItem);
        return this;
    }

    /**
     * Get createdAtNotIn
     *
     * @return createdAtNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getCreatedAtNotIn() {
        return createdAtNotIn;
    }

    public void setCreatedAtNotIn(List<String> createdAtNotIn) {
        this.createdAtNotIn = createdAtNotIn;
    }

    public UserAuditLogWhereInput createdAtNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_NOT_IN);
        return this;
    }

    public UserAuditLogWhereInput createdAtNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CREATED_AT_NOT_IN);
        return this;
    }

    public void setCreatedAtNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CREATED_AT_NOT_IN);
        }
    }

    public boolean getCreatedAtNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CREATED_AT_NOT_IN);
    }

    public UserAuditLogWhereInput finishedAt(String finishedAt) {

        this.finishedAt = finishedAt;
        return this;
    }

    /**
     * Get finishedAt
     *
     * @return finishedAt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getFinishedAt() {
        return finishedAt;
    }

    public void setFinishedAt(String finishedAt) {
        this.finishedAt = finishedAt;
    }

    public UserAuditLogWhereInput finishedAt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FINISHED_AT);
        return this;
    }

    public UserAuditLogWhereInput finishedAt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FINISHED_AT);
        return this;
    }

    public void setFinishedAt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FINISHED_AT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FINISHED_AT);
        }
    }

    public boolean getFinishedAt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FINISHED_AT);
    }

    public UserAuditLogWhereInput finishedAtGt(String finishedAtGt) {

        this.finishedAtGt = finishedAtGt;
        return this;
    }

    /**
     * Get finishedAtGt
     *
     * @return finishedAtGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getFinishedAtGt() {
        return finishedAtGt;
    }

    public void setFinishedAtGt(String finishedAtGt) {
        this.finishedAtGt = finishedAtGt;
    }

    public UserAuditLogWhereInput finishedAtGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FINISHED_AT_GT);
        return this;
    }

    public UserAuditLogWhereInput finishedAtGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FINISHED_AT_GT);
        return this;
    }

    public void setFinishedAtGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FINISHED_AT_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FINISHED_AT_GT);
        }
    }

    public boolean getFinishedAtGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FINISHED_AT_GT);
    }

    public UserAuditLogWhereInput finishedAtGte(String finishedAtGte) {

        this.finishedAtGte = finishedAtGte;
        return this;
    }

    /**
     * Get finishedAtGte
     *
     * @return finishedAtGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getFinishedAtGte() {
        return finishedAtGte;
    }

    public void setFinishedAtGte(String finishedAtGte) {
        this.finishedAtGte = finishedAtGte;
    }

    public UserAuditLogWhereInput finishedAtGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FINISHED_AT_GTE);
        return this;
    }

    public UserAuditLogWhereInput finishedAtGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FINISHED_AT_GTE);
        return this;
    }

    public void setFinishedAtGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FINISHED_AT_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FINISHED_AT_GTE);
        }
    }

    public boolean getFinishedAtGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FINISHED_AT_GTE);
    }

    public UserAuditLogWhereInput finishedAtIn(List<String> finishedAtIn) {

        this.finishedAtIn = finishedAtIn;
        return this;
    }

    public UserAuditLogWhereInput addFinishedAtInItem(String finishedAtInItem) {
        if (this.finishedAtIn == null) {
            this.finishedAtIn = new ArrayList<String>();
        }
        this.finishedAtIn.add(finishedAtInItem);
        return this;
    }

    /**
     * Get finishedAtIn
     *
     * @return finishedAtIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getFinishedAtIn() {
        return finishedAtIn;
    }

    public void setFinishedAtIn(List<String> finishedAtIn) {
        this.finishedAtIn = finishedAtIn;
    }

    public UserAuditLogWhereInput finishedAtIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FINISHED_AT_IN);
        return this;
    }

    public UserAuditLogWhereInput finishedAtIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FINISHED_AT_IN);
        return this;
    }

    public void setFinishedAtIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FINISHED_AT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FINISHED_AT_IN);
        }
    }

    public boolean getFinishedAtIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FINISHED_AT_IN);
    }

    public UserAuditLogWhereInput finishedAtLt(String finishedAtLt) {

        this.finishedAtLt = finishedAtLt;
        return this;
    }

    /**
     * Get finishedAtLt
     *
     * @return finishedAtLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getFinishedAtLt() {
        return finishedAtLt;
    }

    public void setFinishedAtLt(String finishedAtLt) {
        this.finishedAtLt = finishedAtLt;
    }

    public UserAuditLogWhereInput finishedAtLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FINISHED_AT_LT);
        return this;
    }

    public UserAuditLogWhereInput finishedAtLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FINISHED_AT_LT);
        return this;
    }

    public void setFinishedAtLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FINISHED_AT_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FINISHED_AT_LT);
        }
    }

    public boolean getFinishedAtLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FINISHED_AT_LT);
    }

    public UserAuditLogWhereInput finishedAtLte(String finishedAtLte) {

        this.finishedAtLte = finishedAtLte;
        return this;
    }

    /**
     * Get finishedAtLte
     *
     * @return finishedAtLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getFinishedAtLte() {
        return finishedAtLte;
    }

    public void setFinishedAtLte(String finishedAtLte) {
        this.finishedAtLte = finishedAtLte;
    }

    public UserAuditLogWhereInput finishedAtLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FINISHED_AT_LTE);
        return this;
    }

    public UserAuditLogWhereInput finishedAtLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FINISHED_AT_LTE);
        return this;
    }

    public void setFinishedAtLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FINISHED_AT_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FINISHED_AT_LTE);
        }
    }

    public boolean getFinishedAtLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FINISHED_AT_LTE);
    }

    public UserAuditLogWhereInput finishedAtNot(String finishedAtNot) {

        this.finishedAtNot = finishedAtNot;
        return this;
    }

    /**
     * Get finishedAtNot
     *
     * @return finishedAtNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getFinishedAtNot() {
        return finishedAtNot;
    }

    public void setFinishedAtNot(String finishedAtNot) {
        this.finishedAtNot = finishedAtNot;
    }

    public UserAuditLogWhereInput finishedAtNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FINISHED_AT_NOT);
        return this;
    }

    public UserAuditLogWhereInput finishedAtNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FINISHED_AT_NOT);
        return this;
    }

    public void setFinishedAtNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FINISHED_AT_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FINISHED_AT_NOT);
        }
    }

    public boolean getFinishedAtNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FINISHED_AT_NOT);
    }

    public UserAuditLogWhereInput finishedAtNotIn(List<String> finishedAtNotIn) {

        this.finishedAtNotIn = finishedAtNotIn;
        return this;
    }

    public UserAuditLogWhereInput addFinishedAtNotInItem(String finishedAtNotInItem) {
        if (this.finishedAtNotIn == null) {
            this.finishedAtNotIn = new ArrayList<String>();
        }
        this.finishedAtNotIn.add(finishedAtNotInItem);
        return this;
    }

    /**
     * Get finishedAtNotIn
     *
     * @return finishedAtNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getFinishedAtNotIn() {
        return finishedAtNotIn;
    }

    public void setFinishedAtNotIn(List<String> finishedAtNotIn) {
        this.finishedAtNotIn = finishedAtNotIn;
    }

    public UserAuditLogWhereInput finishedAtNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FINISHED_AT_NOT_IN);
        return this;
    }

    public UserAuditLogWhereInput finishedAtNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FINISHED_AT_NOT_IN);
        return this;
    }

    public void setFinishedAtNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FINISHED_AT_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FINISHED_AT_NOT_IN);
        }
    }

    public boolean getFinishedAtNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FINISHED_AT_NOT_IN);
    }

    public UserAuditLogWhereInput id(String id) {

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

    public UserAuditLogWhereInput id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public UserAuditLogWhereInput id_ExplictlyNonNull() {
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

    public UserAuditLogWhereInput idContains(String idContains) {

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

    public UserAuditLogWhereInput idContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_CONTAINS);
        return this;
    }

    public UserAuditLogWhereInput idContains_ExplictlyNonNull() {
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

    public UserAuditLogWhereInput idEndsWith(String idEndsWith) {

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

    public UserAuditLogWhereInput idEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_ENDS_WITH);
        return this;
    }

    public UserAuditLogWhereInput idEndsWith_ExplictlyNonNull() {
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

    public UserAuditLogWhereInput idGt(String idGt) {

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

    public UserAuditLogWhereInput idGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GT);
        return this;
    }

    public UserAuditLogWhereInput idGt_ExplictlyNonNull() {
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

    public UserAuditLogWhereInput idGte(String idGte) {

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

    public UserAuditLogWhereInput idGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GTE);
        return this;
    }

    public UserAuditLogWhereInput idGte_ExplictlyNonNull() {
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

    public UserAuditLogWhereInput idIn(List<String> idIn) {

        this.idIn = idIn;
        return this;
    }

    public UserAuditLogWhereInput addIdInItem(String idInItem) {
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

    public UserAuditLogWhereInput idIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_IN);
        return this;
    }

    public UserAuditLogWhereInput idIn_ExplictlyNonNull() {
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

    public UserAuditLogWhereInput idLt(String idLt) {

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

    public UserAuditLogWhereInput idLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LT);
        return this;
    }

    public UserAuditLogWhereInput idLt_ExplictlyNonNull() {
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

    public UserAuditLogWhereInput idLte(String idLte) {

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

    public UserAuditLogWhereInput idLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LTE);
        return this;
    }

    public UserAuditLogWhereInput idLte_ExplictlyNonNull() {
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

    public UserAuditLogWhereInput idNot(String idNot) {

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

    public UserAuditLogWhereInput idNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT);
        return this;
    }

    public UserAuditLogWhereInput idNot_ExplictlyNonNull() {
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

    public UserAuditLogWhereInput idNotContains(String idNotContains) {

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

    public UserAuditLogWhereInput idNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_CONTAINS);
        return this;
    }

    public UserAuditLogWhereInput idNotContains_ExplictlyNonNull() {
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

    public UserAuditLogWhereInput idNotEndsWith(String idNotEndsWith) {

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

    public UserAuditLogWhereInput idNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
        return this;
    }

    public UserAuditLogWhereInput idNotEndsWith_ExplictlyNonNull() {
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

    public UserAuditLogWhereInput idNotIn(List<String> idNotIn) {

        this.idNotIn = idNotIn;
        return this;
    }

    public UserAuditLogWhereInput addIdNotInItem(String idNotInItem) {
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

    public UserAuditLogWhereInput idNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_IN);
        return this;
    }

    public UserAuditLogWhereInput idNotIn_ExplictlyNonNull() {
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

    public UserAuditLogWhereInput idNotStartsWith(String idNotStartsWith) {

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

    public UserAuditLogWhereInput idNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
        return this;
    }

    public UserAuditLogWhereInput idNotStartsWith_ExplictlyNonNull() {
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

    public UserAuditLogWhereInput idStartsWith(String idStartsWith) {

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

    public UserAuditLogWhereInput idStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_STARTS_WITH);
        return this;
    }

    public UserAuditLogWhereInput idStartsWith_ExplictlyNonNull() {
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

    public UserAuditLogWhereInput ipAddress(String ipAddress) {

        this.ipAddress = ipAddress;
        return this;
    }

    /**
     * Get ipAddress
     *
     * @return ipAddress
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public UserAuditLogWhereInput ipAddress_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_ADDRESS);
        return this;
    }

    public UserAuditLogWhereInput ipAddress_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IP_ADDRESS);
        return this;
    }

    public void setIpAddress_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IP_ADDRESS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IP_ADDRESS);
        }
    }

    public boolean getIpAddress_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IP_ADDRESS);
    }

    public UserAuditLogWhereInput ipAddressContains(String ipAddressContains) {

        this.ipAddressContains = ipAddressContains;
        return this;
    }

    /**
     * Get ipAddressContains
     *
     * @return ipAddressContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIpAddressContains() {
        return ipAddressContains;
    }

    public void setIpAddressContains(String ipAddressContains) {
        this.ipAddressContains = ipAddressContains;
    }

    public UserAuditLogWhereInput ipAddressContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_ADDRESS_CONTAINS);
        return this;
    }

    public UserAuditLogWhereInput ipAddressContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IP_ADDRESS_CONTAINS);
        return this;
    }

    public void setIpAddressContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IP_ADDRESS_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IP_ADDRESS_CONTAINS);
        }
    }

    public boolean getIpAddressContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IP_ADDRESS_CONTAINS);
    }

    public UserAuditLogWhereInput ipAddressEndsWith(String ipAddressEndsWith) {

        this.ipAddressEndsWith = ipAddressEndsWith;
        return this;
    }

    /**
     * Get ipAddressEndsWith
     *
     * @return ipAddressEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIpAddressEndsWith() {
        return ipAddressEndsWith;
    }

    public void setIpAddressEndsWith(String ipAddressEndsWith) {
        this.ipAddressEndsWith = ipAddressEndsWith;
    }

    public UserAuditLogWhereInput ipAddressEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_ADDRESS_ENDS_WITH);
        return this;
    }

    public UserAuditLogWhereInput ipAddressEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IP_ADDRESS_ENDS_WITH);
        return this;
    }

    public void setIpAddressEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IP_ADDRESS_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IP_ADDRESS_ENDS_WITH);
        }
    }

    public boolean getIpAddressEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IP_ADDRESS_ENDS_WITH);
    }

    public UserAuditLogWhereInput ipAddressGt(String ipAddressGt) {

        this.ipAddressGt = ipAddressGt;
        return this;
    }

    /**
     * Get ipAddressGt
     *
     * @return ipAddressGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIpAddressGt() {
        return ipAddressGt;
    }

    public void setIpAddressGt(String ipAddressGt) {
        this.ipAddressGt = ipAddressGt;
    }

    public UserAuditLogWhereInput ipAddressGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_ADDRESS_GT);
        return this;
    }

    public UserAuditLogWhereInput ipAddressGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IP_ADDRESS_GT);
        return this;
    }

    public void setIpAddressGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IP_ADDRESS_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IP_ADDRESS_GT);
        }
    }

    public boolean getIpAddressGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IP_ADDRESS_GT);
    }

    public UserAuditLogWhereInput ipAddressGte(String ipAddressGte) {

        this.ipAddressGte = ipAddressGte;
        return this;
    }

    /**
     * Get ipAddressGte
     *
     * @return ipAddressGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIpAddressGte() {
        return ipAddressGte;
    }

    public void setIpAddressGte(String ipAddressGte) {
        this.ipAddressGte = ipAddressGte;
    }

    public UserAuditLogWhereInput ipAddressGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_ADDRESS_GTE);
        return this;
    }

    public UserAuditLogWhereInput ipAddressGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IP_ADDRESS_GTE);
        return this;
    }

    public void setIpAddressGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IP_ADDRESS_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IP_ADDRESS_GTE);
        }
    }

    public boolean getIpAddressGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IP_ADDRESS_GTE);
    }

    public UserAuditLogWhereInput ipAddressIn(List<String> ipAddressIn) {

        this.ipAddressIn = ipAddressIn;
        return this;
    }

    public UserAuditLogWhereInput addIpAddressInItem(String ipAddressInItem) {
        if (this.ipAddressIn == null) {
            this.ipAddressIn = new ArrayList<String>();
        }
        this.ipAddressIn.add(ipAddressInItem);
        return this;
    }

    /**
     * Get ipAddressIn
     *
     * @return ipAddressIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getIpAddressIn() {
        return ipAddressIn;
    }

    public void setIpAddressIn(List<String> ipAddressIn) {
        this.ipAddressIn = ipAddressIn;
    }

    public UserAuditLogWhereInput ipAddressIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_ADDRESS_IN);
        return this;
    }

    public UserAuditLogWhereInput ipAddressIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IP_ADDRESS_IN);
        return this;
    }

    public void setIpAddressIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IP_ADDRESS_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IP_ADDRESS_IN);
        }
    }

    public boolean getIpAddressIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IP_ADDRESS_IN);
    }

    public UserAuditLogWhereInput ipAddressLt(String ipAddressLt) {

        this.ipAddressLt = ipAddressLt;
        return this;
    }

    /**
     * Get ipAddressLt
     *
     * @return ipAddressLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIpAddressLt() {
        return ipAddressLt;
    }

    public void setIpAddressLt(String ipAddressLt) {
        this.ipAddressLt = ipAddressLt;
    }

    public UserAuditLogWhereInput ipAddressLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_ADDRESS_LT);
        return this;
    }

    public UserAuditLogWhereInput ipAddressLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IP_ADDRESS_LT);
        return this;
    }

    public void setIpAddressLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IP_ADDRESS_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IP_ADDRESS_LT);
        }
    }

    public boolean getIpAddressLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IP_ADDRESS_LT);
    }

    public UserAuditLogWhereInput ipAddressLte(String ipAddressLte) {

        this.ipAddressLte = ipAddressLte;
        return this;
    }

    /**
     * Get ipAddressLte
     *
     * @return ipAddressLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIpAddressLte() {
        return ipAddressLte;
    }

    public void setIpAddressLte(String ipAddressLte) {
        this.ipAddressLte = ipAddressLte;
    }

    public UserAuditLogWhereInput ipAddressLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_ADDRESS_LTE);
        return this;
    }

    public UserAuditLogWhereInput ipAddressLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IP_ADDRESS_LTE);
        return this;
    }

    public void setIpAddressLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IP_ADDRESS_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IP_ADDRESS_LTE);
        }
    }

    public boolean getIpAddressLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IP_ADDRESS_LTE);
    }

    public UserAuditLogWhereInput ipAddressNot(String ipAddressNot) {

        this.ipAddressNot = ipAddressNot;
        return this;
    }

    /**
     * Get ipAddressNot
     *
     * @return ipAddressNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIpAddressNot() {
        return ipAddressNot;
    }

    public void setIpAddressNot(String ipAddressNot) {
        this.ipAddressNot = ipAddressNot;
    }

    public UserAuditLogWhereInput ipAddressNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_ADDRESS_NOT);
        return this;
    }

    public UserAuditLogWhereInput ipAddressNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IP_ADDRESS_NOT);
        return this;
    }

    public void setIpAddressNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IP_ADDRESS_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IP_ADDRESS_NOT);
        }
    }

    public boolean getIpAddressNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IP_ADDRESS_NOT);
    }

    public UserAuditLogWhereInput ipAddressNotContains(String ipAddressNotContains) {

        this.ipAddressNotContains = ipAddressNotContains;
        return this;
    }

    /**
     * Get ipAddressNotContains
     *
     * @return ipAddressNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIpAddressNotContains() {
        return ipAddressNotContains;
    }

    public void setIpAddressNotContains(String ipAddressNotContains) {
        this.ipAddressNotContains = ipAddressNotContains;
    }

    public UserAuditLogWhereInput ipAddressNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_ADDRESS_NOT_CONTAINS);
        return this;
    }

    public UserAuditLogWhereInput ipAddressNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IP_ADDRESS_NOT_CONTAINS);
        return this;
    }

    public void setIpAddressNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IP_ADDRESS_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IP_ADDRESS_NOT_CONTAINS);
        }
    }

    public boolean getIpAddressNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IP_ADDRESS_NOT_CONTAINS);
    }

    public UserAuditLogWhereInput ipAddressNotEndsWith(String ipAddressNotEndsWith) {

        this.ipAddressNotEndsWith = ipAddressNotEndsWith;
        return this;
    }

    /**
     * Get ipAddressNotEndsWith
     *
     * @return ipAddressNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIpAddressNotEndsWith() {
        return ipAddressNotEndsWith;
    }

    public void setIpAddressNotEndsWith(String ipAddressNotEndsWith) {
        this.ipAddressNotEndsWith = ipAddressNotEndsWith;
    }

    public UserAuditLogWhereInput ipAddressNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_ADDRESS_NOT_ENDS_WITH);
        return this;
    }

    public UserAuditLogWhereInput ipAddressNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IP_ADDRESS_NOT_ENDS_WITH);
        return this;
    }

    public void setIpAddressNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IP_ADDRESS_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IP_ADDRESS_NOT_ENDS_WITH);
        }
    }

    public boolean getIpAddressNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IP_ADDRESS_NOT_ENDS_WITH);
    }

    public UserAuditLogWhereInput ipAddressNotIn(List<String> ipAddressNotIn) {

        this.ipAddressNotIn = ipAddressNotIn;
        return this;
    }

    public UserAuditLogWhereInput addIpAddressNotInItem(String ipAddressNotInItem) {
        if (this.ipAddressNotIn == null) {
            this.ipAddressNotIn = new ArrayList<String>();
        }
        this.ipAddressNotIn.add(ipAddressNotInItem);
        return this;
    }

    /**
     * Get ipAddressNotIn
     *
     * @return ipAddressNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getIpAddressNotIn() {
        return ipAddressNotIn;
    }

    public void setIpAddressNotIn(List<String> ipAddressNotIn) {
        this.ipAddressNotIn = ipAddressNotIn;
    }

    public UserAuditLogWhereInput ipAddressNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_ADDRESS_NOT_IN);
        return this;
    }

    public UserAuditLogWhereInput ipAddressNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IP_ADDRESS_NOT_IN);
        return this;
    }

    public void setIpAddressNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IP_ADDRESS_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IP_ADDRESS_NOT_IN);
        }
    }

    public boolean getIpAddressNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IP_ADDRESS_NOT_IN);
    }

    public UserAuditLogWhereInput ipAddressNotStartsWith(String ipAddressNotStartsWith) {

        this.ipAddressNotStartsWith = ipAddressNotStartsWith;
        return this;
    }

    /**
     * Get ipAddressNotStartsWith
     *
     * @return ipAddressNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIpAddressNotStartsWith() {
        return ipAddressNotStartsWith;
    }

    public void setIpAddressNotStartsWith(String ipAddressNotStartsWith) {
        this.ipAddressNotStartsWith = ipAddressNotStartsWith;
    }

    public UserAuditLogWhereInput ipAddressNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_ADDRESS_NOT_STARTS_WITH);
        return this;
    }

    public UserAuditLogWhereInput ipAddressNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IP_ADDRESS_NOT_STARTS_WITH);
        return this;
    }

    public void setIpAddressNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IP_ADDRESS_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IP_ADDRESS_NOT_STARTS_WITH);
        }
    }

    public boolean getIpAddressNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IP_ADDRESS_NOT_STARTS_WITH);
    }

    public UserAuditLogWhereInput ipAddressStartsWith(String ipAddressStartsWith) {

        this.ipAddressStartsWith = ipAddressStartsWith;
        return this;
    }

    /**
     * Get ipAddressStartsWith
     *
     * @return ipAddressStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIpAddressStartsWith() {
        return ipAddressStartsWith;
    }

    public void setIpAddressStartsWith(String ipAddressStartsWith) {
        this.ipAddressStartsWith = ipAddressStartsWith;
    }

    public UserAuditLogWhereInput ipAddressStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_ADDRESS_STARTS_WITH);
        return this;
    }

    public UserAuditLogWhereInput ipAddressStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IP_ADDRESS_STARTS_WITH);
        return this;
    }

    public void setIpAddressStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IP_ADDRESS_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IP_ADDRESS_STARTS_WITH);
        }
    }

    public boolean getIpAddressStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IP_ADDRESS_STARTS_WITH);
    }

    public UserAuditLogWhereInput message(String message) {

        this.message = message;
        return this;
    }

    /**
     * Get message
     *
     * @return message
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public UserAuditLogWhereInput message_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MESSAGE);
        return this;
    }

    public UserAuditLogWhereInput message_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MESSAGE);
        return this;
    }

    public void setMessage_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MESSAGE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MESSAGE);
        }
    }

    public boolean getMessage_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MESSAGE);
    }

    public UserAuditLogWhereInput messageContains(String messageContains) {

        this.messageContains = messageContains;
        return this;
    }

    /**
     * Get messageContains
     *
     * @return messageContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMessageContains() {
        return messageContains;
    }

    public void setMessageContains(String messageContains) {
        this.messageContains = messageContains;
    }

    public UserAuditLogWhereInput messageContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MESSAGE_CONTAINS);
        return this;
    }

    public UserAuditLogWhereInput messageContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MESSAGE_CONTAINS);
        return this;
    }

    public void setMessageContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MESSAGE_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MESSAGE_CONTAINS);
        }
    }

    public boolean getMessageContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MESSAGE_CONTAINS);
    }

    public UserAuditLogWhereInput messageEndsWith(String messageEndsWith) {

        this.messageEndsWith = messageEndsWith;
        return this;
    }

    /**
     * Get messageEndsWith
     *
     * @return messageEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMessageEndsWith() {
        return messageEndsWith;
    }

    public void setMessageEndsWith(String messageEndsWith) {
        this.messageEndsWith = messageEndsWith;
    }

    public UserAuditLogWhereInput messageEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MESSAGE_ENDS_WITH);
        return this;
    }

    public UserAuditLogWhereInput messageEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MESSAGE_ENDS_WITH);
        return this;
    }

    public void setMessageEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MESSAGE_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MESSAGE_ENDS_WITH);
        }
    }

    public boolean getMessageEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MESSAGE_ENDS_WITH);
    }

    public UserAuditLogWhereInput messageGt(String messageGt) {

        this.messageGt = messageGt;
        return this;
    }

    /**
     * Get messageGt
     *
     * @return messageGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMessageGt() {
        return messageGt;
    }

    public void setMessageGt(String messageGt) {
        this.messageGt = messageGt;
    }

    public UserAuditLogWhereInput messageGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MESSAGE_GT);
        return this;
    }

    public UserAuditLogWhereInput messageGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MESSAGE_GT);
        return this;
    }

    public void setMessageGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MESSAGE_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MESSAGE_GT);
        }
    }

    public boolean getMessageGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MESSAGE_GT);
    }

    public UserAuditLogWhereInput messageGte(String messageGte) {

        this.messageGte = messageGte;
        return this;
    }

    /**
     * Get messageGte
     *
     * @return messageGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMessageGte() {
        return messageGte;
    }

    public void setMessageGte(String messageGte) {
        this.messageGte = messageGte;
    }

    public UserAuditLogWhereInput messageGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MESSAGE_GTE);
        return this;
    }

    public UserAuditLogWhereInput messageGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MESSAGE_GTE);
        return this;
    }

    public void setMessageGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MESSAGE_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MESSAGE_GTE);
        }
    }

    public boolean getMessageGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MESSAGE_GTE);
    }

    public UserAuditLogWhereInput messageIn(List<String> messageIn) {

        this.messageIn = messageIn;
        return this;
    }

    public UserAuditLogWhereInput addMessageInItem(String messageInItem) {
        if (this.messageIn == null) {
            this.messageIn = new ArrayList<String>();
        }
        this.messageIn.add(messageInItem);
        return this;
    }

    /**
     * Get messageIn
     *
     * @return messageIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getMessageIn() {
        return messageIn;
    }

    public void setMessageIn(List<String> messageIn) {
        this.messageIn = messageIn;
    }

    public UserAuditLogWhereInput messageIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MESSAGE_IN);
        return this;
    }

    public UserAuditLogWhereInput messageIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MESSAGE_IN);
        return this;
    }

    public void setMessageIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MESSAGE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MESSAGE_IN);
        }
    }

    public boolean getMessageIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MESSAGE_IN);
    }

    public UserAuditLogWhereInput messageLt(String messageLt) {

        this.messageLt = messageLt;
        return this;
    }

    /**
     * Get messageLt
     *
     * @return messageLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMessageLt() {
        return messageLt;
    }

    public void setMessageLt(String messageLt) {
        this.messageLt = messageLt;
    }

    public UserAuditLogWhereInput messageLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MESSAGE_LT);
        return this;
    }

    public UserAuditLogWhereInput messageLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MESSAGE_LT);
        return this;
    }

    public void setMessageLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MESSAGE_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MESSAGE_LT);
        }
    }

    public boolean getMessageLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MESSAGE_LT);
    }

    public UserAuditLogWhereInput messageLte(String messageLte) {

        this.messageLte = messageLte;
        return this;
    }

    /**
     * Get messageLte
     *
     * @return messageLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMessageLte() {
        return messageLte;
    }

    public void setMessageLte(String messageLte) {
        this.messageLte = messageLte;
    }

    public UserAuditLogWhereInput messageLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MESSAGE_LTE);
        return this;
    }

    public UserAuditLogWhereInput messageLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MESSAGE_LTE);
        return this;
    }

    public void setMessageLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MESSAGE_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MESSAGE_LTE);
        }
    }

    public boolean getMessageLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MESSAGE_LTE);
    }

    public UserAuditLogWhereInput messageNot(String messageNot) {

        this.messageNot = messageNot;
        return this;
    }

    /**
     * Get messageNot
     *
     * @return messageNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMessageNot() {
        return messageNot;
    }

    public void setMessageNot(String messageNot) {
        this.messageNot = messageNot;
    }

    public UserAuditLogWhereInput messageNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MESSAGE_NOT);
        return this;
    }

    public UserAuditLogWhereInput messageNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MESSAGE_NOT);
        return this;
    }

    public void setMessageNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MESSAGE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MESSAGE_NOT);
        }
    }

    public boolean getMessageNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MESSAGE_NOT);
    }

    public UserAuditLogWhereInput messageNotContains(String messageNotContains) {

        this.messageNotContains = messageNotContains;
        return this;
    }

    /**
     * Get messageNotContains
     *
     * @return messageNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMessageNotContains() {
        return messageNotContains;
    }

    public void setMessageNotContains(String messageNotContains) {
        this.messageNotContains = messageNotContains;
    }

    public UserAuditLogWhereInput messageNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MESSAGE_NOT_CONTAINS);
        return this;
    }

    public UserAuditLogWhereInput messageNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MESSAGE_NOT_CONTAINS);
        return this;
    }

    public void setMessageNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MESSAGE_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MESSAGE_NOT_CONTAINS);
        }
    }

    public boolean getMessageNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MESSAGE_NOT_CONTAINS);
    }

    public UserAuditLogWhereInput messageNotEndsWith(String messageNotEndsWith) {

        this.messageNotEndsWith = messageNotEndsWith;
        return this;
    }

    /**
     * Get messageNotEndsWith
     *
     * @return messageNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMessageNotEndsWith() {
        return messageNotEndsWith;
    }

    public void setMessageNotEndsWith(String messageNotEndsWith) {
        this.messageNotEndsWith = messageNotEndsWith;
    }

    public UserAuditLogWhereInput messageNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MESSAGE_NOT_ENDS_WITH);
        return this;
    }

    public UserAuditLogWhereInput messageNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MESSAGE_NOT_ENDS_WITH);
        return this;
    }

    public void setMessageNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MESSAGE_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MESSAGE_NOT_ENDS_WITH);
        }
    }

    public boolean getMessageNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MESSAGE_NOT_ENDS_WITH);
    }

    public UserAuditLogWhereInput messageNotIn(List<String> messageNotIn) {

        this.messageNotIn = messageNotIn;
        return this;
    }

    public UserAuditLogWhereInput addMessageNotInItem(String messageNotInItem) {
        if (this.messageNotIn == null) {
            this.messageNotIn = new ArrayList<String>();
        }
        this.messageNotIn.add(messageNotInItem);
        return this;
    }

    /**
     * Get messageNotIn
     *
     * @return messageNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getMessageNotIn() {
        return messageNotIn;
    }

    public void setMessageNotIn(List<String> messageNotIn) {
        this.messageNotIn = messageNotIn;
    }

    public UserAuditLogWhereInput messageNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MESSAGE_NOT_IN);
        return this;
    }

    public UserAuditLogWhereInput messageNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MESSAGE_NOT_IN);
        return this;
    }

    public void setMessageNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MESSAGE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MESSAGE_NOT_IN);
        }
    }

    public boolean getMessageNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MESSAGE_NOT_IN);
    }

    public UserAuditLogWhereInput messageNotStartsWith(String messageNotStartsWith) {

        this.messageNotStartsWith = messageNotStartsWith;
        return this;
    }

    /**
     * Get messageNotStartsWith
     *
     * @return messageNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMessageNotStartsWith() {
        return messageNotStartsWith;
    }

    public void setMessageNotStartsWith(String messageNotStartsWith) {
        this.messageNotStartsWith = messageNotStartsWith;
    }

    public UserAuditLogWhereInput messageNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MESSAGE_NOT_STARTS_WITH);
        return this;
    }

    public UserAuditLogWhereInput messageNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MESSAGE_NOT_STARTS_WITH);
        return this;
    }

    public void setMessageNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MESSAGE_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MESSAGE_NOT_STARTS_WITH);
        }
    }

    public boolean getMessageNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MESSAGE_NOT_STARTS_WITH);
    }

    public UserAuditLogWhereInput messageStartsWith(String messageStartsWith) {

        this.messageStartsWith = messageStartsWith;
        return this;
    }

    /**
     * Get messageStartsWith
     *
     * @return messageStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMessageStartsWith() {
        return messageStartsWith;
    }

    public void setMessageStartsWith(String messageStartsWith) {
        this.messageStartsWith = messageStartsWith;
    }

    public UserAuditLogWhereInput messageStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MESSAGE_STARTS_WITH);
        return this;
    }

    public UserAuditLogWhereInput messageStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MESSAGE_STARTS_WITH);
        return this;
    }

    public void setMessageStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MESSAGE_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MESSAGE_STARTS_WITH);
        }
    }

    public boolean getMessageStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MESSAGE_STARTS_WITH);
    }

    public UserAuditLogWhereInput resourceId(String resourceId) {

        this.resourceId = resourceId;
        return this;
    }

    /**
     * Get resourceId
     *
     * @return resourceId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public UserAuditLogWhereInput resourceId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_ID);
        return this;
    }

    public UserAuditLogWhereInput resourceId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_ID);
        return this;
    }

    public void setResourceId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_ID);
        }
    }

    public boolean getResourceId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_ID);
    }

    public UserAuditLogWhereInput resourceIdContains(String resourceIdContains) {

        this.resourceIdContains = resourceIdContains;
        return this;
    }

    /**
     * Get resourceIdContains
     *
     * @return resourceIdContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getResourceIdContains() {
        return resourceIdContains;
    }

    public void setResourceIdContains(String resourceIdContains) {
        this.resourceIdContains = resourceIdContains;
    }

    public UserAuditLogWhereInput resourceIdContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_ID_CONTAINS);
        return this;
    }

    public UserAuditLogWhereInput resourceIdContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_ID_CONTAINS);
        return this;
    }

    public void setResourceIdContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_ID_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_ID_CONTAINS);
        }
    }

    public boolean getResourceIdContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_ID_CONTAINS);
    }

    public UserAuditLogWhereInput resourceIdEndsWith(String resourceIdEndsWith) {

        this.resourceIdEndsWith = resourceIdEndsWith;
        return this;
    }

    /**
     * Get resourceIdEndsWith
     *
     * @return resourceIdEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getResourceIdEndsWith() {
        return resourceIdEndsWith;
    }

    public void setResourceIdEndsWith(String resourceIdEndsWith) {
        this.resourceIdEndsWith = resourceIdEndsWith;
    }

    public UserAuditLogWhereInput resourceIdEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_ID_ENDS_WITH);
        return this;
    }

    public UserAuditLogWhereInput resourceIdEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_ID_ENDS_WITH);
        return this;
    }

    public void setResourceIdEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_ID_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_ID_ENDS_WITH);
        }
    }

    public boolean getResourceIdEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_ID_ENDS_WITH);
    }

    public UserAuditLogWhereInput resourceIdGt(String resourceIdGt) {

        this.resourceIdGt = resourceIdGt;
        return this;
    }

    /**
     * Get resourceIdGt
     *
     * @return resourceIdGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getResourceIdGt() {
        return resourceIdGt;
    }

    public void setResourceIdGt(String resourceIdGt) {
        this.resourceIdGt = resourceIdGt;
    }

    public UserAuditLogWhereInput resourceIdGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_ID_GT);
        return this;
    }

    public UserAuditLogWhereInput resourceIdGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_ID_GT);
        return this;
    }

    public void setResourceIdGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_ID_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_ID_GT);
        }
    }

    public boolean getResourceIdGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_ID_GT);
    }

    public UserAuditLogWhereInput resourceIdGte(String resourceIdGte) {

        this.resourceIdGte = resourceIdGte;
        return this;
    }

    /**
     * Get resourceIdGte
     *
     * @return resourceIdGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getResourceIdGte() {
        return resourceIdGte;
    }

    public void setResourceIdGte(String resourceIdGte) {
        this.resourceIdGte = resourceIdGte;
    }

    public UserAuditLogWhereInput resourceIdGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_ID_GTE);
        return this;
    }

    public UserAuditLogWhereInput resourceIdGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_ID_GTE);
        return this;
    }

    public void setResourceIdGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_ID_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_ID_GTE);
        }
    }

    public boolean getResourceIdGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_ID_GTE);
    }

    public UserAuditLogWhereInput resourceIdIn(List<String> resourceIdIn) {

        this.resourceIdIn = resourceIdIn;
        return this;
    }

    public UserAuditLogWhereInput addResourceIdInItem(String resourceIdInItem) {
        if (this.resourceIdIn == null) {
            this.resourceIdIn = new ArrayList<String>();
        }
        this.resourceIdIn.add(resourceIdInItem);
        return this;
    }

    /**
     * Get resourceIdIn
     *
     * @return resourceIdIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getResourceIdIn() {
        return resourceIdIn;
    }

    public void setResourceIdIn(List<String> resourceIdIn) {
        this.resourceIdIn = resourceIdIn;
    }

    public UserAuditLogWhereInput resourceIdIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_ID_IN);
        return this;
    }

    public UserAuditLogWhereInput resourceIdIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_ID_IN);
        return this;
    }

    public void setResourceIdIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_ID_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_ID_IN);
        }
    }

    public boolean getResourceIdIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_ID_IN);
    }

    public UserAuditLogWhereInput resourceIdLt(String resourceIdLt) {

        this.resourceIdLt = resourceIdLt;
        return this;
    }

    /**
     * Get resourceIdLt
     *
     * @return resourceIdLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getResourceIdLt() {
        return resourceIdLt;
    }

    public void setResourceIdLt(String resourceIdLt) {
        this.resourceIdLt = resourceIdLt;
    }

    public UserAuditLogWhereInput resourceIdLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_ID_LT);
        return this;
    }

    public UserAuditLogWhereInput resourceIdLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_ID_LT);
        return this;
    }

    public void setResourceIdLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_ID_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_ID_LT);
        }
    }

    public boolean getResourceIdLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_ID_LT);
    }

    public UserAuditLogWhereInput resourceIdLte(String resourceIdLte) {

        this.resourceIdLte = resourceIdLte;
        return this;
    }

    /**
     * Get resourceIdLte
     *
     * @return resourceIdLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getResourceIdLte() {
        return resourceIdLte;
    }

    public void setResourceIdLte(String resourceIdLte) {
        this.resourceIdLte = resourceIdLte;
    }

    public UserAuditLogWhereInput resourceIdLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_ID_LTE);
        return this;
    }

    public UserAuditLogWhereInput resourceIdLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_ID_LTE);
        return this;
    }

    public void setResourceIdLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_ID_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_ID_LTE);
        }
    }

    public boolean getResourceIdLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_ID_LTE);
    }

    public UserAuditLogWhereInput resourceIdNot(String resourceIdNot) {

        this.resourceIdNot = resourceIdNot;
        return this;
    }

    /**
     * Get resourceIdNot
     *
     * @return resourceIdNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getResourceIdNot() {
        return resourceIdNot;
    }

    public void setResourceIdNot(String resourceIdNot) {
        this.resourceIdNot = resourceIdNot;
    }

    public UserAuditLogWhereInput resourceIdNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_ID_NOT);
        return this;
    }

    public UserAuditLogWhereInput resourceIdNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_ID_NOT);
        return this;
    }

    public void setResourceIdNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_ID_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_ID_NOT);
        }
    }

    public boolean getResourceIdNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_ID_NOT);
    }

    public UserAuditLogWhereInput resourceIdNotContains(String resourceIdNotContains) {

        this.resourceIdNotContains = resourceIdNotContains;
        return this;
    }

    /**
     * Get resourceIdNotContains
     *
     * @return resourceIdNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getResourceIdNotContains() {
        return resourceIdNotContains;
    }

    public void setResourceIdNotContains(String resourceIdNotContains) {
        this.resourceIdNotContains = resourceIdNotContains;
    }

    public UserAuditLogWhereInput resourceIdNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_ID_NOT_CONTAINS);
        return this;
    }

    public UserAuditLogWhereInput resourceIdNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_ID_NOT_CONTAINS);
        return this;
    }

    public void setResourceIdNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_ID_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_ID_NOT_CONTAINS);
        }
    }

    public boolean getResourceIdNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_ID_NOT_CONTAINS);
    }

    public UserAuditLogWhereInput resourceIdNotEndsWith(String resourceIdNotEndsWith) {

        this.resourceIdNotEndsWith = resourceIdNotEndsWith;
        return this;
    }

    /**
     * Get resourceIdNotEndsWith
     *
     * @return resourceIdNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getResourceIdNotEndsWith() {
        return resourceIdNotEndsWith;
    }

    public void setResourceIdNotEndsWith(String resourceIdNotEndsWith) {
        this.resourceIdNotEndsWith = resourceIdNotEndsWith;
    }

    public UserAuditLogWhereInput resourceIdNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_ID_NOT_ENDS_WITH);
        return this;
    }

    public UserAuditLogWhereInput resourceIdNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_ID_NOT_ENDS_WITH);
        return this;
    }

    public void setResourceIdNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_ID_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_ID_NOT_ENDS_WITH);
        }
    }

    public boolean getResourceIdNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_ID_NOT_ENDS_WITH);
    }

    public UserAuditLogWhereInput resourceIdNotIn(List<String> resourceIdNotIn) {

        this.resourceIdNotIn = resourceIdNotIn;
        return this;
    }

    public UserAuditLogWhereInput addResourceIdNotInItem(String resourceIdNotInItem) {
        if (this.resourceIdNotIn == null) {
            this.resourceIdNotIn = new ArrayList<String>();
        }
        this.resourceIdNotIn.add(resourceIdNotInItem);
        return this;
    }

    /**
     * Get resourceIdNotIn
     *
     * @return resourceIdNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getResourceIdNotIn() {
        return resourceIdNotIn;
    }

    public void setResourceIdNotIn(List<String> resourceIdNotIn) {
        this.resourceIdNotIn = resourceIdNotIn;
    }

    public UserAuditLogWhereInput resourceIdNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_ID_NOT_IN);
        return this;
    }

    public UserAuditLogWhereInput resourceIdNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_ID_NOT_IN);
        return this;
    }

    public void setResourceIdNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_ID_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_ID_NOT_IN);
        }
    }

    public boolean getResourceIdNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_ID_NOT_IN);
    }

    public UserAuditLogWhereInput resourceIdNotStartsWith(String resourceIdNotStartsWith) {

        this.resourceIdNotStartsWith = resourceIdNotStartsWith;
        return this;
    }

    /**
     * Get resourceIdNotStartsWith
     *
     * @return resourceIdNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getResourceIdNotStartsWith() {
        return resourceIdNotStartsWith;
    }

    public void setResourceIdNotStartsWith(String resourceIdNotStartsWith) {
        this.resourceIdNotStartsWith = resourceIdNotStartsWith;
    }

    public UserAuditLogWhereInput resourceIdNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_ID_NOT_STARTS_WITH);
        return this;
    }

    public UserAuditLogWhereInput resourceIdNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_ID_NOT_STARTS_WITH);
        return this;
    }

    public void setResourceIdNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_ID_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_ID_NOT_STARTS_WITH);
        }
    }

    public boolean getResourceIdNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_ID_NOT_STARTS_WITH);
    }

    public UserAuditLogWhereInput resourceIdStartsWith(String resourceIdStartsWith) {

        this.resourceIdStartsWith = resourceIdStartsWith;
        return this;
    }

    /**
     * Get resourceIdStartsWith
     *
     * @return resourceIdStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getResourceIdStartsWith() {
        return resourceIdStartsWith;
    }

    public void setResourceIdStartsWith(String resourceIdStartsWith) {
        this.resourceIdStartsWith = resourceIdStartsWith;
    }

    public UserAuditLogWhereInput resourceIdStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_ID_STARTS_WITH);
        return this;
    }

    public UserAuditLogWhereInput resourceIdStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_ID_STARTS_WITH);
        return this;
    }

    public void setResourceIdStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_ID_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_ID_STARTS_WITH);
        }
    }

    public boolean getResourceIdStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_ID_STARTS_WITH);
    }

    public UserAuditLogWhereInput resourceType(String resourceType) {

        this.resourceType = resourceType;
        return this;
    }

    /**
     * Get resourceType
     *
     * @return resourceType
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public UserAuditLogWhereInput resourceType_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_TYPE);
        return this;
    }

    public UserAuditLogWhereInput resourceType_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_TYPE);
        return this;
    }

    public void setResourceType_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_TYPE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_TYPE);
        }
    }

    public boolean getResourceType_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_TYPE);
    }

    public UserAuditLogWhereInput resourceTypeContains(String resourceTypeContains) {

        this.resourceTypeContains = resourceTypeContains;
        return this;
    }

    /**
     * Get resourceTypeContains
     *
     * @return resourceTypeContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getResourceTypeContains() {
        return resourceTypeContains;
    }

    public void setResourceTypeContains(String resourceTypeContains) {
        this.resourceTypeContains = resourceTypeContains;
    }

    public UserAuditLogWhereInput resourceTypeContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_TYPE_CONTAINS);
        return this;
    }

    public UserAuditLogWhereInput resourceTypeContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_TYPE_CONTAINS);
        return this;
    }

    public void setResourceTypeContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_TYPE_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_TYPE_CONTAINS);
        }
    }

    public boolean getResourceTypeContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_TYPE_CONTAINS);
    }

    public UserAuditLogWhereInput resourceTypeEndsWith(String resourceTypeEndsWith) {

        this.resourceTypeEndsWith = resourceTypeEndsWith;
        return this;
    }

    /**
     * Get resourceTypeEndsWith
     *
     * @return resourceTypeEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getResourceTypeEndsWith() {
        return resourceTypeEndsWith;
    }

    public void setResourceTypeEndsWith(String resourceTypeEndsWith) {
        this.resourceTypeEndsWith = resourceTypeEndsWith;
    }

    public UserAuditLogWhereInput resourceTypeEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_TYPE_ENDS_WITH);
        return this;
    }

    public UserAuditLogWhereInput resourceTypeEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_TYPE_ENDS_WITH);
        return this;
    }

    public void setResourceTypeEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_TYPE_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_TYPE_ENDS_WITH);
        }
    }

    public boolean getResourceTypeEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_TYPE_ENDS_WITH);
    }

    public UserAuditLogWhereInput resourceTypeGt(String resourceTypeGt) {

        this.resourceTypeGt = resourceTypeGt;
        return this;
    }

    /**
     * Get resourceTypeGt
     *
     * @return resourceTypeGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getResourceTypeGt() {
        return resourceTypeGt;
    }

    public void setResourceTypeGt(String resourceTypeGt) {
        this.resourceTypeGt = resourceTypeGt;
    }

    public UserAuditLogWhereInput resourceTypeGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_TYPE_GT);
        return this;
    }

    public UserAuditLogWhereInput resourceTypeGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_TYPE_GT);
        return this;
    }

    public void setResourceTypeGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_TYPE_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_TYPE_GT);
        }
    }

    public boolean getResourceTypeGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_TYPE_GT);
    }

    public UserAuditLogWhereInput resourceTypeGte(String resourceTypeGte) {

        this.resourceTypeGte = resourceTypeGte;
        return this;
    }

    /**
     * Get resourceTypeGte
     *
     * @return resourceTypeGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getResourceTypeGte() {
        return resourceTypeGte;
    }

    public void setResourceTypeGte(String resourceTypeGte) {
        this.resourceTypeGte = resourceTypeGte;
    }

    public UserAuditLogWhereInput resourceTypeGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_TYPE_GTE);
        return this;
    }

    public UserAuditLogWhereInput resourceTypeGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_TYPE_GTE);
        return this;
    }

    public void setResourceTypeGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_TYPE_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_TYPE_GTE);
        }
    }

    public boolean getResourceTypeGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_TYPE_GTE);
    }

    public UserAuditLogWhereInput resourceTypeIn(List<String> resourceTypeIn) {

        this.resourceTypeIn = resourceTypeIn;
        return this;
    }

    public UserAuditLogWhereInput addResourceTypeInItem(String resourceTypeInItem) {
        if (this.resourceTypeIn == null) {
            this.resourceTypeIn = new ArrayList<String>();
        }
        this.resourceTypeIn.add(resourceTypeInItem);
        return this;
    }

    /**
     * Get resourceTypeIn
     *
     * @return resourceTypeIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getResourceTypeIn() {
        return resourceTypeIn;
    }

    public void setResourceTypeIn(List<String> resourceTypeIn) {
        this.resourceTypeIn = resourceTypeIn;
    }

    public UserAuditLogWhereInput resourceTypeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_TYPE_IN);
        return this;
    }

    public UserAuditLogWhereInput resourceTypeIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_TYPE_IN);
        return this;
    }

    public void setResourceTypeIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_TYPE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_TYPE_IN);
        }
    }

    public boolean getResourceTypeIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_TYPE_IN);
    }

    public UserAuditLogWhereInput resourceTypeLt(String resourceTypeLt) {

        this.resourceTypeLt = resourceTypeLt;
        return this;
    }

    /**
     * Get resourceTypeLt
     *
     * @return resourceTypeLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getResourceTypeLt() {
        return resourceTypeLt;
    }

    public void setResourceTypeLt(String resourceTypeLt) {
        this.resourceTypeLt = resourceTypeLt;
    }

    public UserAuditLogWhereInput resourceTypeLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_TYPE_LT);
        return this;
    }

    public UserAuditLogWhereInput resourceTypeLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_TYPE_LT);
        return this;
    }

    public void setResourceTypeLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_TYPE_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_TYPE_LT);
        }
    }

    public boolean getResourceTypeLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_TYPE_LT);
    }

    public UserAuditLogWhereInput resourceTypeLte(String resourceTypeLte) {

        this.resourceTypeLte = resourceTypeLte;
        return this;
    }

    /**
     * Get resourceTypeLte
     *
     * @return resourceTypeLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getResourceTypeLte() {
        return resourceTypeLte;
    }

    public void setResourceTypeLte(String resourceTypeLte) {
        this.resourceTypeLte = resourceTypeLte;
    }

    public UserAuditLogWhereInput resourceTypeLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_TYPE_LTE);
        return this;
    }

    public UserAuditLogWhereInput resourceTypeLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_TYPE_LTE);
        return this;
    }

    public void setResourceTypeLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_TYPE_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_TYPE_LTE);
        }
    }

    public boolean getResourceTypeLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_TYPE_LTE);
    }

    public UserAuditLogWhereInput resourceTypeNot(String resourceTypeNot) {

        this.resourceTypeNot = resourceTypeNot;
        return this;
    }

    /**
     * Get resourceTypeNot
     *
     * @return resourceTypeNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getResourceTypeNot() {
        return resourceTypeNot;
    }

    public void setResourceTypeNot(String resourceTypeNot) {
        this.resourceTypeNot = resourceTypeNot;
    }

    public UserAuditLogWhereInput resourceTypeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_TYPE_NOT);
        return this;
    }

    public UserAuditLogWhereInput resourceTypeNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_TYPE_NOT);
        return this;
    }

    public void setResourceTypeNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_TYPE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_TYPE_NOT);
        }
    }

    public boolean getResourceTypeNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_TYPE_NOT);
    }

    public UserAuditLogWhereInput resourceTypeNotContains(String resourceTypeNotContains) {

        this.resourceTypeNotContains = resourceTypeNotContains;
        return this;
    }

    /**
     * Get resourceTypeNotContains
     *
     * @return resourceTypeNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getResourceTypeNotContains() {
        return resourceTypeNotContains;
    }

    public void setResourceTypeNotContains(String resourceTypeNotContains) {
        this.resourceTypeNotContains = resourceTypeNotContains;
    }

    public UserAuditLogWhereInput resourceTypeNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_TYPE_NOT_CONTAINS);
        return this;
    }

    public UserAuditLogWhereInput resourceTypeNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_TYPE_NOT_CONTAINS);
        return this;
    }

    public void setResourceTypeNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_TYPE_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_TYPE_NOT_CONTAINS);
        }
    }

    public boolean getResourceTypeNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_TYPE_NOT_CONTAINS);
    }

    public UserAuditLogWhereInput resourceTypeNotEndsWith(String resourceTypeNotEndsWith) {

        this.resourceTypeNotEndsWith = resourceTypeNotEndsWith;
        return this;
    }

    /**
     * Get resourceTypeNotEndsWith
     *
     * @return resourceTypeNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getResourceTypeNotEndsWith() {
        return resourceTypeNotEndsWith;
    }

    public void setResourceTypeNotEndsWith(String resourceTypeNotEndsWith) {
        this.resourceTypeNotEndsWith = resourceTypeNotEndsWith;
    }

    public UserAuditLogWhereInput resourceTypeNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_TYPE_NOT_ENDS_WITH);
        return this;
    }

    public UserAuditLogWhereInput resourceTypeNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_TYPE_NOT_ENDS_WITH);
        return this;
    }

    public void setResourceTypeNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_TYPE_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_TYPE_NOT_ENDS_WITH);
        }
    }

    public boolean getResourceTypeNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_TYPE_NOT_ENDS_WITH);
    }

    public UserAuditLogWhereInput resourceTypeNotIn(List<String> resourceTypeNotIn) {

        this.resourceTypeNotIn = resourceTypeNotIn;
        return this;
    }

    public UserAuditLogWhereInput addResourceTypeNotInItem(String resourceTypeNotInItem) {
        if (this.resourceTypeNotIn == null) {
            this.resourceTypeNotIn = new ArrayList<String>();
        }
        this.resourceTypeNotIn.add(resourceTypeNotInItem);
        return this;
    }

    /**
     * Get resourceTypeNotIn
     *
     * @return resourceTypeNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getResourceTypeNotIn() {
        return resourceTypeNotIn;
    }

    public void setResourceTypeNotIn(List<String> resourceTypeNotIn) {
        this.resourceTypeNotIn = resourceTypeNotIn;
    }

    public UserAuditLogWhereInput resourceTypeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_TYPE_NOT_IN);
        return this;
    }

    public UserAuditLogWhereInput resourceTypeNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_TYPE_NOT_IN);
        return this;
    }

    public void setResourceTypeNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_TYPE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_TYPE_NOT_IN);
        }
    }

    public boolean getResourceTypeNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_TYPE_NOT_IN);
    }

    public UserAuditLogWhereInput resourceTypeNotStartsWith(String resourceTypeNotStartsWith) {

        this.resourceTypeNotStartsWith = resourceTypeNotStartsWith;
        return this;
    }

    /**
     * Get resourceTypeNotStartsWith
     *
     * @return resourceTypeNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getResourceTypeNotStartsWith() {
        return resourceTypeNotStartsWith;
    }

    public void setResourceTypeNotStartsWith(String resourceTypeNotStartsWith) {
        this.resourceTypeNotStartsWith = resourceTypeNotStartsWith;
    }

    public UserAuditLogWhereInput resourceTypeNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_TYPE_NOT_STARTS_WITH);
        return this;
    }

    public UserAuditLogWhereInput resourceTypeNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_TYPE_NOT_STARTS_WITH);
        return this;
    }

    public void setResourceTypeNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_TYPE_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_TYPE_NOT_STARTS_WITH);
        }
    }

    public boolean getResourceTypeNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_TYPE_NOT_STARTS_WITH);
    }

    public UserAuditLogWhereInput resourceTypeStartsWith(String resourceTypeStartsWith) {

        this.resourceTypeStartsWith = resourceTypeStartsWith;
        return this;
    }

    /**
     * Get resourceTypeStartsWith
     *
     * @return resourceTypeStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getResourceTypeStartsWith() {
        return resourceTypeStartsWith;
    }

    public void setResourceTypeStartsWith(String resourceTypeStartsWith) {
        this.resourceTypeStartsWith = resourceTypeStartsWith;
    }

    public UserAuditLogWhereInput resourceTypeStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_TYPE_STARTS_WITH);
        return this;
    }

    public UserAuditLogWhereInput resourceTypeStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_TYPE_STARTS_WITH);
        return this;
    }

    public void setResourceTypeStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_TYPE_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_TYPE_STARTS_WITH);
        }
    }

    public boolean getResourceTypeStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_TYPE_STARTS_WITH);
    }

    public UserAuditLogWhereInput startedAt(String startedAt) {

        this.startedAt = startedAt;
        return this;
    }

    /**
     * Get startedAt
     *
     * @return startedAt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getStartedAt() {
        return startedAt;
    }

    public void setStartedAt(String startedAt) {
        this.startedAt = startedAt;
    }

    public UserAuditLogWhereInput startedAt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STARTED_AT);
        return this;
    }

    public UserAuditLogWhereInput startedAt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STARTED_AT);
        return this;
    }

    public void setStartedAt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STARTED_AT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STARTED_AT);
        }
    }

    public boolean getStartedAt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STARTED_AT);
    }

    public UserAuditLogWhereInput startedAtGt(String startedAtGt) {

        this.startedAtGt = startedAtGt;
        return this;
    }

    /**
     * Get startedAtGt
     *
     * @return startedAtGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getStartedAtGt() {
        return startedAtGt;
    }

    public void setStartedAtGt(String startedAtGt) {
        this.startedAtGt = startedAtGt;
    }

    public UserAuditLogWhereInput startedAtGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STARTED_AT_GT);
        return this;
    }

    public UserAuditLogWhereInput startedAtGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STARTED_AT_GT);
        return this;
    }

    public void setStartedAtGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STARTED_AT_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STARTED_AT_GT);
        }
    }

    public boolean getStartedAtGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STARTED_AT_GT);
    }

    public UserAuditLogWhereInput startedAtGte(String startedAtGte) {

        this.startedAtGte = startedAtGte;
        return this;
    }

    /**
     * Get startedAtGte
     *
     * @return startedAtGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getStartedAtGte() {
        return startedAtGte;
    }

    public void setStartedAtGte(String startedAtGte) {
        this.startedAtGte = startedAtGte;
    }

    public UserAuditLogWhereInput startedAtGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STARTED_AT_GTE);
        return this;
    }

    public UserAuditLogWhereInput startedAtGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STARTED_AT_GTE);
        return this;
    }

    public void setStartedAtGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STARTED_AT_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STARTED_AT_GTE);
        }
    }

    public boolean getStartedAtGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STARTED_AT_GTE);
    }

    public UserAuditLogWhereInput startedAtIn(List<String> startedAtIn) {

        this.startedAtIn = startedAtIn;
        return this;
    }

    public UserAuditLogWhereInput addStartedAtInItem(String startedAtInItem) {
        if (this.startedAtIn == null) {
            this.startedAtIn = new ArrayList<String>();
        }
        this.startedAtIn.add(startedAtInItem);
        return this;
    }

    /**
     * Get startedAtIn
     *
     * @return startedAtIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getStartedAtIn() {
        return startedAtIn;
    }

    public void setStartedAtIn(List<String> startedAtIn) {
        this.startedAtIn = startedAtIn;
    }

    public UserAuditLogWhereInput startedAtIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STARTED_AT_IN);
        return this;
    }

    public UserAuditLogWhereInput startedAtIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STARTED_AT_IN);
        return this;
    }

    public void setStartedAtIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STARTED_AT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STARTED_AT_IN);
        }
    }

    public boolean getStartedAtIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STARTED_AT_IN);
    }

    public UserAuditLogWhereInput startedAtLt(String startedAtLt) {

        this.startedAtLt = startedAtLt;
        return this;
    }

    /**
     * Get startedAtLt
     *
     * @return startedAtLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getStartedAtLt() {
        return startedAtLt;
    }

    public void setStartedAtLt(String startedAtLt) {
        this.startedAtLt = startedAtLt;
    }

    public UserAuditLogWhereInput startedAtLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STARTED_AT_LT);
        return this;
    }

    public UserAuditLogWhereInput startedAtLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STARTED_AT_LT);
        return this;
    }

    public void setStartedAtLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STARTED_AT_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STARTED_AT_LT);
        }
    }

    public boolean getStartedAtLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STARTED_AT_LT);
    }

    public UserAuditLogWhereInput startedAtLte(String startedAtLte) {

        this.startedAtLte = startedAtLte;
        return this;
    }

    /**
     * Get startedAtLte
     *
     * @return startedAtLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getStartedAtLte() {
        return startedAtLte;
    }

    public void setStartedAtLte(String startedAtLte) {
        this.startedAtLte = startedAtLte;
    }

    public UserAuditLogWhereInput startedAtLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STARTED_AT_LTE);
        return this;
    }

    public UserAuditLogWhereInput startedAtLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STARTED_AT_LTE);
        return this;
    }

    public void setStartedAtLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STARTED_AT_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STARTED_AT_LTE);
        }
    }

    public boolean getStartedAtLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STARTED_AT_LTE);
    }

    public UserAuditLogWhereInput startedAtNot(String startedAtNot) {

        this.startedAtNot = startedAtNot;
        return this;
    }

    /**
     * Get startedAtNot
     *
     * @return startedAtNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getStartedAtNot() {
        return startedAtNot;
    }

    public void setStartedAtNot(String startedAtNot) {
        this.startedAtNot = startedAtNot;
    }

    public UserAuditLogWhereInput startedAtNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STARTED_AT_NOT);
        return this;
    }

    public UserAuditLogWhereInput startedAtNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STARTED_AT_NOT);
        return this;
    }

    public void setStartedAtNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STARTED_AT_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STARTED_AT_NOT);
        }
    }

    public boolean getStartedAtNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STARTED_AT_NOT);
    }

    public UserAuditLogWhereInput startedAtNotIn(List<String> startedAtNotIn) {

        this.startedAtNotIn = startedAtNotIn;
        return this;
    }

    public UserAuditLogWhereInput addStartedAtNotInItem(String startedAtNotInItem) {
        if (this.startedAtNotIn == null) {
            this.startedAtNotIn = new ArrayList<String>();
        }
        this.startedAtNotIn.add(startedAtNotInItem);
        return this;
    }

    /**
     * Get startedAtNotIn
     *
     * @return startedAtNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getStartedAtNotIn() {
        return startedAtNotIn;
    }

    public void setStartedAtNotIn(List<String> startedAtNotIn) {
        this.startedAtNotIn = startedAtNotIn;
    }

    public UserAuditLogWhereInput startedAtNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STARTED_AT_NOT_IN);
        return this;
    }

    public UserAuditLogWhereInput startedAtNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STARTED_AT_NOT_IN);
        return this;
    }

    public void setStartedAtNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STARTED_AT_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STARTED_AT_NOT_IN);
        }
    }

    public boolean getStartedAtNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STARTED_AT_NOT_IN);
    }

    public UserAuditLogWhereInput status(UserAuditLogStatus status) {

        this.status = status;
        return this;
    }

    /**
     * Get status
     *
     * @return status
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public UserAuditLogStatus getStatus() {
        return status;
    }

    public void setStatus(UserAuditLogStatus status) {
        this.status = status;
    }

    public UserAuditLogWhereInput status_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATUS);
        return this;
    }

    public UserAuditLogWhereInput status_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STATUS);
        return this;
    }

    public void setStatus_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STATUS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STATUS);
        }
    }

    public boolean getStatus_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STATUS);
    }

    public UserAuditLogWhereInput statusIn(List<UserAuditLogStatus> statusIn) {

        this.statusIn = statusIn;
        return this;
    }

    public UserAuditLogWhereInput addStatusInItem(UserAuditLogStatus statusInItem) {
        if (this.statusIn == null) {
            this.statusIn = new ArrayList<UserAuditLogStatus>();
        }
        this.statusIn.add(statusInItem);
        return this;
    }

    /**
     * Get statusIn
     *
     * @return statusIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<UserAuditLogStatus> getStatusIn() {
        return statusIn;
    }

    public void setStatusIn(List<UserAuditLogStatus> statusIn) {
        this.statusIn = statusIn;
    }

    public UserAuditLogWhereInput statusIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATUS_IN);
        return this;
    }

    public UserAuditLogWhereInput statusIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STATUS_IN);
        return this;
    }

    public void setStatusIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STATUS_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STATUS_IN);
        }
    }

    public boolean getStatusIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STATUS_IN);
    }

    public UserAuditLogWhereInput statusNot(UserAuditLogStatus statusNot) {

        this.statusNot = statusNot;
        return this;
    }

    /**
     * Get statusNot
     *
     * @return statusNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public UserAuditLogStatus getStatusNot() {
        return statusNot;
    }

    public void setStatusNot(UserAuditLogStatus statusNot) {
        this.statusNot = statusNot;
    }

    public UserAuditLogWhereInput statusNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATUS_NOT);
        return this;
    }

    public UserAuditLogWhereInput statusNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STATUS_NOT);
        return this;
    }

    public void setStatusNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STATUS_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STATUS_NOT);
        }
    }

    public boolean getStatusNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STATUS_NOT);
    }

    public UserAuditLogWhereInput statusNotIn(List<UserAuditLogStatus> statusNotIn) {

        this.statusNotIn = statusNotIn;
        return this;
    }

    public UserAuditLogWhereInput addStatusNotInItem(UserAuditLogStatus statusNotInItem) {
        if (this.statusNotIn == null) {
            this.statusNotIn = new ArrayList<UserAuditLogStatus>();
        }
        this.statusNotIn.add(statusNotInItem);
        return this;
    }

    /**
     * Get statusNotIn
     *
     * @return statusNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<UserAuditLogStatus> getStatusNotIn() {
        return statusNotIn;
    }

    public void setStatusNotIn(List<UserAuditLogStatus> statusNotIn) {
        this.statusNotIn = statusNotIn;
    }

    public UserAuditLogWhereInput statusNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATUS_NOT_IN);
        return this;
    }

    public UserAuditLogWhereInput statusNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STATUS_NOT_IN);
        return this;
    }

    public void setStatusNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STATUS_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STATUS_NOT_IN);
        }
    }

    public boolean getStatusNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STATUS_NOT_IN);
    }

    public UserAuditLogWhereInput user(UserWhereInput user) {

        this.user = user;
        return this;
    }

    /**
     * Get user
     *
     * @return user
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public UserWhereInput getUser() {
        return user;
    }

    public void setUser(UserWhereInput user) {
        this.user = user;
    }

    public UserAuditLogWhereInput user_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USER);
        return this;
    }

    public UserAuditLogWhereInput user_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USER);
        return this;
    }

    public void setUser_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USER);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USER);
        }
    }

    public boolean getUser_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USER);
    }

    public UserAuditLogWhereInput username(String username) {

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

    public UserAuditLogWhereInput username_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USERNAME);
        return this;
    }

    public UserAuditLogWhereInput username_ExplictlyNonNull() {
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

    public UserAuditLogWhereInput usernameContains(String usernameContains) {

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

    public UserAuditLogWhereInput usernameContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USERNAME_CONTAINS);
        return this;
    }

    public UserAuditLogWhereInput usernameContains_ExplictlyNonNull() {
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

    public UserAuditLogWhereInput usernameEndsWith(String usernameEndsWith) {

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

    public UserAuditLogWhereInput usernameEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USERNAME_ENDS_WITH);
        return this;
    }

    public UserAuditLogWhereInput usernameEndsWith_ExplictlyNonNull() {
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

    public UserAuditLogWhereInput usernameGt(String usernameGt) {

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

    public UserAuditLogWhereInput usernameGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USERNAME_GT);
        return this;
    }

    public UserAuditLogWhereInput usernameGt_ExplictlyNonNull() {
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

    public UserAuditLogWhereInput usernameGte(String usernameGte) {

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

    public UserAuditLogWhereInput usernameGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USERNAME_GTE);
        return this;
    }

    public UserAuditLogWhereInput usernameGte_ExplictlyNonNull() {
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

    public UserAuditLogWhereInput usernameIn(List<String> usernameIn) {

        this.usernameIn = usernameIn;
        return this;
    }

    public UserAuditLogWhereInput addUsernameInItem(String usernameInItem) {
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

    public UserAuditLogWhereInput usernameIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USERNAME_IN);
        return this;
    }

    public UserAuditLogWhereInput usernameIn_ExplictlyNonNull() {
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

    public UserAuditLogWhereInput usernameLt(String usernameLt) {

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

    public UserAuditLogWhereInput usernameLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USERNAME_LT);
        return this;
    }

    public UserAuditLogWhereInput usernameLt_ExplictlyNonNull() {
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

    public UserAuditLogWhereInput usernameLte(String usernameLte) {

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

    public UserAuditLogWhereInput usernameLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USERNAME_LTE);
        return this;
    }

    public UserAuditLogWhereInput usernameLte_ExplictlyNonNull() {
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

    public UserAuditLogWhereInput usernameNot(String usernameNot) {

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

    public UserAuditLogWhereInput usernameNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USERNAME_NOT);
        return this;
    }

    public UserAuditLogWhereInput usernameNot_ExplictlyNonNull() {
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

    public UserAuditLogWhereInput usernameNotContains(String usernameNotContains) {

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

    public UserAuditLogWhereInput usernameNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USERNAME_NOT_CONTAINS);
        return this;
    }

    public UserAuditLogWhereInput usernameNotContains_ExplictlyNonNull() {
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

    public UserAuditLogWhereInput usernameNotEndsWith(String usernameNotEndsWith) {

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

    public UserAuditLogWhereInput usernameNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USERNAME_NOT_ENDS_WITH);
        return this;
    }

    public UserAuditLogWhereInput usernameNotEndsWith_ExplictlyNonNull() {
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

    public UserAuditLogWhereInput usernameNotIn(List<String> usernameNotIn) {

        this.usernameNotIn = usernameNotIn;
        return this;
    }

    public UserAuditLogWhereInput addUsernameNotInItem(String usernameNotInItem) {
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

    public UserAuditLogWhereInput usernameNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USERNAME_NOT_IN);
        return this;
    }

    public UserAuditLogWhereInput usernameNotIn_ExplictlyNonNull() {
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

    public UserAuditLogWhereInput usernameNotStartsWith(String usernameNotStartsWith) {

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

    public UserAuditLogWhereInput usernameNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USERNAME_NOT_STARTS_WITH);
        return this;
    }

    public UserAuditLogWhereInput usernameNotStartsWith_ExplictlyNonNull() {
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

    public UserAuditLogWhereInput usernameStartsWith(String usernameStartsWith) {

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

    public UserAuditLogWhereInput usernameStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USERNAME_STARTS_WITH);
        return this;
    }

    public UserAuditLogWhereInput usernameStartsWith_ExplictlyNonNull() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UserAuditLogWhereInput userAuditLogWhereInput = (UserAuditLogWhereInput) o;
        return Objects.equals(this.AND, userAuditLogWhereInput.AND)
                && Objects.equals(this.NOT, userAuditLogWhereInput.NOT)
                && Objects.equals(this.OR, userAuditLogWhereInput.OR)
                && Objects.equals(this.action, userAuditLogWhereInput.action)
                && Objects.equals(this.actionContains, userAuditLogWhereInput.actionContains)
                && Objects.equals(this.actionEndsWith, userAuditLogWhereInput.actionEndsWith)
                && Objects.equals(this.actionGt, userAuditLogWhereInput.actionGt)
                && Objects.equals(this.actionGte, userAuditLogWhereInput.actionGte)
                && Objects.equals(this.actionIn, userAuditLogWhereInput.actionIn)
                && Objects.equals(this.actionLt, userAuditLogWhereInput.actionLt)
                && Objects.equals(this.actionLte, userAuditLogWhereInput.actionLte)
                && Objects.equals(this.actionNot, userAuditLogWhereInput.actionNot)
                && Objects.equals(this.actionNotContains, userAuditLogWhereInput.actionNotContains)
                && Objects.equals(this.actionNotEndsWith, userAuditLogWhereInput.actionNotEndsWith)
                && Objects.equals(this.actionNotIn, userAuditLogWhereInput.actionNotIn)
                && Objects.equals(
                        this.actionNotStartsWith, userAuditLogWhereInput.actionNotStartsWith)
                && Objects.equals(this.actionStartsWith, userAuditLogWhereInput.actionStartsWith)
                && Objects.equals(this.authType, userAuditLogWhereInput.authType)
                && Objects.equals(this.authTypeContains, userAuditLogWhereInput.authTypeContains)
                && Objects.equals(this.authTypeEndsWith, userAuditLogWhereInput.authTypeEndsWith)
                && Objects.equals(this.authTypeGt, userAuditLogWhereInput.authTypeGt)
                && Objects.equals(this.authTypeGte, userAuditLogWhereInput.authTypeGte)
                && Objects.equals(this.authTypeIn, userAuditLogWhereInput.authTypeIn)
                && Objects.equals(this.authTypeLt, userAuditLogWhereInput.authTypeLt)
                && Objects.equals(this.authTypeLte, userAuditLogWhereInput.authTypeLte)
                && Objects.equals(this.authTypeNot, userAuditLogWhereInput.authTypeNot)
                && Objects.equals(
                        this.authTypeNotContains, userAuditLogWhereInput.authTypeNotContains)
                && Objects.equals(
                        this.authTypeNotEndsWith, userAuditLogWhereInput.authTypeNotEndsWith)
                && Objects.equals(this.authTypeNotIn, userAuditLogWhereInput.authTypeNotIn)
                && Objects.equals(
                        this.authTypeNotStartsWith, userAuditLogWhereInput.authTypeNotStartsWith)
                && Objects.equals(
                        this.authTypeStartsWith, userAuditLogWhereInput.authTypeStartsWith)
                && Objects.equals(this.cluster, userAuditLogWhereInput.cluster)
                && Objects.equals(this.createdAt, userAuditLogWhereInput.createdAt)
                && Objects.equals(this.createdAtGt, userAuditLogWhereInput.createdAtGt)
                && Objects.equals(this.createdAtGte, userAuditLogWhereInput.createdAtGte)
                && Objects.equals(this.createdAtIn, userAuditLogWhereInput.createdAtIn)
                && Objects.equals(this.createdAtLt, userAuditLogWhereInput.createdAtLt)
                && Objects.equals(this.createdAtLte, userAuditLogWhereInput.createdAtLte)
                && Objects.equals(this.createdAtNot, userAuditLogWhereInput.createdAtNot)
                && Objects.equals(this.createdAtNotIn, userAuditLogWhereInput.createdAtNotIn)
                && Objects.equals(this.finishedAt, userAuditLogWhereInput.finishedAt)
                && Objects.equals(this.finishedAtGt, userAuditLogWhereInput.finishedAtGt)
                && Objects.equals(this.finishedAtGte, userAuditLogWhereInput.finishedAtGte)
                && Objects.equals(this.finishedAtIn, userAuditLogWhereInput.finishedAtIn)
                && Objects.equals(this.finishedAtLt, userAuditLogWhereInput.finishedAtLt)
                && Objects.equals(this.finishedAtLte, userAuditLogWhereInput.finishedAtLte)
                && Objects.equals(this.finishedAtNot, userAuditLogWhereInput.finishedAtNot)
                && Objects.equals(this.finishedAtNotIn, userAuditLogWhereInput.finishedAtNotIn)
                && Objects.equals(this.id, userAuditLogWhereInput.id)
                && Objects.equals(this.idContains, userAuditLogWhereInput.idContains)
                && Objects.equals(this.idEndsWith, userAuditLogWhereInput.idEndsWith)
                && Objects.equals(this.idGt, userAuditLogWhereInput.idGt)
                && Objects.equals(this.idGte, userAuditLogWhereInput.idGte)
                && Objects.equals(this.idIn, userAuditLogWhereInput.idIn)
                && Objects.equals(this.idLt, userAuditLogWhereInput.idLt)
                && Objects.equals(this.idLte, userAuditLogWhereInput.idLte)
                && Objects.equals(this.idNot, userAuditLogWhereInput.idNot)
                && Objects.equals(this.idNotContains, userAuditLogWhereInput.idNotContains)
                && Objects.equals(this.idNotEndsWith, userAuditLogWhereInput.idNotEndsWith)
                && Objects.equals(this.idNotIn, userAuditLogWhereInput.idNotIn)
                && Objects.equals(this.idNotStartsWith, userAuditLogWhereInput.idNotStartsWith)
                && Objects.equals(this.idStartsWith, userAuditLogWhereInput.idStartsWith)
                && Objects.equals(this.ipAddress, userAuditLogWhereInput.ipAddress)
                && Objects.equals(this.ipAddressContains, userAuditLogWhereInput.ipAddressContains)
                && Objects.equals(this.ipAddressEndsWith, userAuditLogWhereInput.ipAddressEndsWith)
                && Objects.equals(this.ipAddressGt, userAuditLogWhereInput.ipAddressGt)
                && Objects.equals(this.ipAddressGte, userAuditLogWhereInput.ipAddressGte)
                && Objects.equals(this.ipAddressIn, userAuditLogWhereInput.ipAddressIn)
                && Objects.equals(this.ipAddressLt, userAuditLogWhereInput.ipAddressLt)
                && Objects.equals(this.ipAddressLte, userAuditLogWhereInput.ipAddressLte)
                && Objects.equals(this.ipAddressNot, userAuditLogWhereInput.ipAddressNot)
                && Objects.equals(
                        this.ipAddressNotContains, userAuditLogWhereInput.ipAddressNotContains)
                && Objects.equals(
                        this.ipAddressNotEndsWith, userAuditLogWhereInput.ipAddressNotEndsWith)
                && Objects.equals(this.ipAddressNotIn, userAuditLogWhereInput.ipAddressNotIn)
                && Objects.equals(
                        this.ipAddressNotStartsWith, userAuditLogWhereInput.ipAddressNotStartsWith)
                && Objects.equals(
                        this.ipAddressStartsWith, userAuditLogWhereInput.ipAddressStartsWith)
                && Objects.equals(this.message, userAuditLogWhereInput.message)
                && Objects.equals(this.messageContains, userAuditLogWhereInput.messageContains)
                && Objects.equals(this.messageEndsWith, userAuditLogWhereInput.messageEndsWith)
                && Objects.equals(this.messageGt, userAuditLogWhereInput.messageGt)
                && Objects.equals(this.messageGte, userAuditLogWhereInput.messageGte)
                && Objects.equals(this.messageIn, userAuditLogWhereInput.messageIn)
                && Objects.equals(this.messageLt, userAuditLogWhereInput.messageLt)
                && Objects.equals(this.messageLte, userAuditLogWhereInput.messageLte)
                && Objects.equals(this.messageNot, userAuditLogWhereInput.messageNot)
                && Objects.equals(
                        this.messageNotContains, userAuditLogWhereInput.messageNotContains)
                && Objects.equals(
                        this.messageNotEndsWith, userAuditLogWhereInput.messageNotEndsWith)
                && Objects.equals(this.messageNotIn, userAuditLogWhereInput.messageNotIn)
                && Objects.equals(
                        this.messageNotStartsWith, userAuditLogWhereInput.messageNotStartsWith)
                && Objects.equals(this.messageStartsWith, userAuditLogWhereInput.messageStartsWith)
                && Objects.equals(this.resourceId, userAuditLogWhereInput.resourceId)
                && Objects.equals(
                        this.resourceIdContains, userAuditLogWhereInput.resourceIdContains)
                && Objects.equals(
                        this.resourceIdEndsWith, userAuditLogWhereInput.resourceIdEndsWith)
                && Objects.equals(this.resourceIdGt, userAuditLogWhereInput.resourceIdGt)
                && Objects.equals(this.resourceIdGte, userAuditLogWhereInput.resourceIdGte)
                && Objects.equals(this.resourceIdIn, userAuditLogWhereInput.resourceIdIn)
                && Objects.equals(this.resourceIdLt, userAuditLogWhereInput.resourceIdLt)
                && Objects.equals(this.resourceIdLte, userAuditLogWhereInput.resourceIdLte)
                && Objects.equals(this.resourceIdNot, userAuditLogWhereInput.resourceIdNot)
                && Objects.equals(
                        this.resourceIdNotContains, userAuditLogWhereInput.resourceIdNotContains)
                && Objects.equals(
                        this.resourceIdNotEndsWith, userAuditLogWhereInput.resourceIdNotEndsWith)
                && Objects.equals(this.resourceIdNotIn, userAuditLogWhereInput.resourceIdNotIn)
                && Objects.equals(
                        this.resourceIdNotStartsWith,
                        userAuditLogWhereInput.resourceIdNotStartsWith)
                && Objects.equals(
                        this.resourceIdStartsWith, userAuditLogWhereInput.resourceIdStartsWith)
                && Objects.equals(this.resourceType, userAuditLogWhereInput.resourceType)
                && Objects.equals(
                        this.resourceTypeContains, userAuditLogWhereInput.resourceTypeContains)
                && Objects.equals(
                        this.resourceTypeEndsWith, userAuditLogWhereInput.resourceTypeEndsWith)
                && Objects.equals(this.resourceTypeGt, userAuditLogWhereInput.resourceTypeGt)
                && Objects.equals(this.resourceTypeGte, userAuditLogWhereInput.resourceTypeGte)
                && Objects.equals(this.resourceTypeIn, userAuditLogWhereInput.resourceTypeIn)
                && Objects.equals(this.resourceTypeLt, userAuditLogWhereInput.resourceTypeLt)
                && Objects.equals(this.resourceTypeLte, userAuditLogWhereInput.resourceTypeLte)
                && Objects.equals(this.resourceTypeNot, userAuditLogWhereInput.resourceTypeNot)
                && Objects.equals(
                        this.resourceTypeNotContains,
                        userAuditLogWhereInput.resourceTypeNotContains)
                && Objects.equals(
                        this.resourceTypeNotEndsWith,
                        userAuditLogWhereInput.resourceTypeNotEndsWith)
                && Objects.equals(this.resourceTypeNotIn, userAuditLogWhereInput.resourceTypeNotIn)
                && Objects.equals(
                        this.resourceTypeNotStartsWith,
                        userAuditLogWhereInput.resourceTypeNotStartsWith)
                && Objects.equals(
                        this.resourceTypeStartsWith, userAuditLogWhereInput.resourceTypeStartsWith)
                && Objects.equals(this.startedAt, userAuditLogWhereInput.startedAt)
                && Objects.equals(this.startedAtGt, userAuditLogWhereInput.startedAtGt)
                && Objects.equals(this.startedAtGte, userAuditLogWhereInput.startedAtGte)
                && Objects.equals(this.startedAtIn, userAuditLogWhereInput.startedAtIn)
                && Objects.equals(this.startedAtLt, userAuditLogWhereInput.startedAtLt)
                && Objects.equals(this.startedAtLte, userAuditLogWhereInput.startedAtLte)
                && Objects.equals(this.startedAtNot, userAuditLogWhereInput.startedAtNot)
                && Objects.equals(this.startedAtNotIn, userAuditLogWhereInput.startedAtNotIn)
                && Objects.equals(this.status, userAuditLogWhereInput.status)
                && Objects.equals(this.statusIn, userAuditLogWhereInput.statusIn)
                && Objects.equals(this.statusNot, userAuditLogWhereInput.statusNot)
                && Objects.equals(this.statusNotIn, userAuditLogWhereInput.statusNotIn)
                && Objects.equals(this.user, userAuditLogWhereInput.user)
                && Objects.equals(this.username, userAuditLogWhereInput.username)
                && Objects.equals(this.usernameContains, userAuditLogWhereInput.usernameContains)
                && Objects.equals(this.usernameEndsWith, userAuditLogWhereInput.usernameEndsWith)
                && Objects.equals(this.usernameGt, userAuditLogWhereInput.usernameGt)
                && Objects.equals(this.usernameGte, userAuditLogWhereInput.usernameGte)
                && Objects.equals(this.usernameIn, userAuditLogWhereInput.usernameIn)
                && Objects.equals(this.usernameLt, userAuditLogWhereInput.usernameLt)
                && Objects.equals(this.usernameLte, userAuditLogWhereInput.usernameLte)
                && Objects.equals(this.usernameNot, userAuditLogWhereInput.usernameNot)
                && Objects.equals(
                        this.usernameNotContains, userAuditLogWhereInput.usernameNotContains)
                && Objects.equals(
                        this.usernameNotEndsWith, userAuditLogWhereInput.usernameNotEndsWith)
                && Objects.equals(this.usernameNotIn, userAuditLogWhereInput.usernameNotIn)
                && Objects.equals(
                        this.usernameNotStartsWith, userAuditLogWhereInput.usernameNotStartsWith)
                && Objects.equals(
                        this.usernameStartsWith, userAuditLogWhereInput.usernameStartsWith);
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
                action,
                actionContains,
                actionEndsWith,
                actionGt,
                actionGte,
                actionIn,
                actionLt,
                actionLte,
                actionNot,
                actionNotContains,
                actionNotEndsWith,
                actionNotIn,
                actionNotStartsWith,
                actionStartsWith,
                authType,
                authTypeContains,
                authTypeEndsWith,
                authTypeGt,
                authTypeGte,
                authTypeIn,
                authTypeLt,
                authTypeLte,
                authTypeNot,
                authTypeNotContains,
                authTypeNotEndsWith,
                authTypeNotIn,
                authTypeNotStartsWith,
                authTypeStartsWith,
                cluster,
                createdAt,
                createdAtGt,
                createdAtGte,
                createdAtIn,
                createdAtLt,
                createdAtLte,
                createdAtNot,
                createdAtNotIn,
                finishedAt,
                finishedAtGt,
                finishedAtGte,
                finishedAtIn,
                finishedAtLt,
                finishedAtLte,
                finishedAtNot,
                finishedAtNotIn,
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
                ipAddress,
                ipAddressContains,
                ipAddressEndsWith,
                ipAddressGt,
                ipAddressGte,
                ipAddressIn,
                ipAddressLt,
                ipAddressLte,
                ipAddressNot,
                ipAddressNotContains,
                ipAddressNotEndsWith,
                ipAddressNotIn,
                ipAddressNotStartsWith,
                ipAddressStartsWith,
                message,
                messageContains,
                messageEndsWith,
                messageGt,
                messageGte,
                messageIn,
                messageLt,
                messageLte,
                messageNot,
                messageNotContains,
                messageNotEndsWith,
                messageNotIn,
                messageNotStartsWith,
                messageStartsWith,
                resourceId,
                resourceIdContains,
                resourceIdEndsWith,
                resourceIdGt,
                resourceIdGte,
                resourceIdIn,
                resourceIdLt,
                resourceIdLte,
                resourceIdNot,
                resourceIdNotContains,
                resourceIdNotEndsWith,
                resourceIdNotIn,
                resourceIdNotStartsWith,
                resourceIdStartsWith,
                resourceType,
                resourceTypeContains,
                resourceTypeEndsWith,
                resourceTypeGt,
                resourceTypeGte,
                resourceTypeIn,
                resourceTypeLt,
                resourceTypeLte,
                resourceTypeNot,
                resourceTypeNotContains,
                resourceTypeNotEndsWith,
                resourceTypeNotIn,
                resourceTypeNotStartsWith,
                resourceTypeStartsWith,
                startedAt,
                startedAtGt,
                startedAtGte,
                startedAtIn,
                startedAtLt,
                startedAtLte,
                startedAtNot,
                startedAtNotIn,
                status,
                statusIn,
                statusNot,
                statusNotIn,
                user,
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
                usernameStartsWith);
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
        sb.append("class UserAuditLogWhereInput {\n");
        sb.append("    AND: ").append(toIndentedString(AND)).append("\n");
        sb.append("    NOT: ").append(toIndentedString(NOT)).append("\n");
        sb.append("    OR: ").append(toIndentedString(OR)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    actionContains: ").append(toIndentedString(actionContains)).append("\n");
        sb.append("    actionEndsWith: ").append(toIndentedString(actionEndsWith)).append("\n");
        sb.append("    actionGt: ").append(toIndentedString(actionGt)).append("\n");
        sb.append("    actionGte: ").append(toIndentedString(actionGte)).append("\n");
        sb.append("    actionIn: ").append(toIndentedString(actionIn)).append("\n");
        sb.append("    actionLt: ").append(toIndentedString(actionLt)).append("\n");
        sb.append("    actionLte: ").append(toIndentedString(actionLte)).append("\n");
        sb.append("    actionNot: ").append(toIndentedString(actionNot)).append("\n");
        sb.append("    actionNotContains: ")
                .append(toIndentedString(actionNotContains))
                .append("\n");
        sb.append("    actionNotEndsWith: ")
                .append(toIndentedString(actionNotEndsWith))
                .append("\n");
        sb.append("    actionNotIn: ").append(toIndentedString(actionNotIn)).append("\n");
        sb.append("    actionNotStartsWith: ")
                .append(toIndentedString(actionNotStartsWith))
                .append("\n");
        sb.append("    actionStartsWith: ").append(toIndentedString(actionStartsWith)).append("\n");
        sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
        sb.append("    authTypeContains: ").append(toIndentedString(authTypeContains)).append("\n");
        sb.append("    authTypeEndsWith: ").append(toIndentedString(authTypeEndsWith)).append("\n");
        sb.append("    authTypeGt: ").append(toIndentedString(authTypeGt)).append("\n");
        sb.append("    authTypeGte: ").append(toIndentedString(authTypeGte)).append("\n");
        sb.append("    authTypeIn: ").append(toIndentedString(authTypeIn)).append("\n");
        sb.append("    authTypeLt: ").append(toIndentedString(authTypeLt)).append("\n");
        sb.append("    authTypeLte: ").append(toIndentedString(authTypeLte)).append("\n");
        sb.append("    authTypeNot: ").append(toIndentedString(authTypeNot)).append("\n");
        sb.append("    authTypeNotContains: ")
                .append(toIndentedString(authTypeNotContains))
                .append("\n");
        sb.append("    authTypeNotEndsWith: ")
                .append(toIndentedString(authTypeNotEndsWith))
                .append("\n");
        sb.append("    authTypeNotIn: ").append(toIndentedString(authTypeNotIn)).append("\n");
        sb.append("    authTypeNotStartsWith: ")
                .append(toIndentedString(authTypeNotStartsWith))
                .append("\n");
        sb.append("    authTypeStartsWith: ")
                .append(toIndentedString(authTypeStartsWith))
                .append("\n");
        sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    createdAtGt: ").append(toIndentedString(createdAtGt)).append("\n");
        sb.append("    createdAtGte: ").append(toIndentedString(createdAtGte)).append("\n");
        sb.append("    createdAtIn: ").append(toIndentedString(createdAtIn)).append("\n");
        sb.append("    createdAtLt: ").append(toIndentedString(createdAtLt)).append("\n");
        sb.append("    createdAtLte: ").append(toIndentedString(createdAtLte)).append("\n");
        sb.append("    createdAtNot: ").append(toIndentedString(createdAtNot)).append("\n");
        sb.append("    createdAtNotIn: ").append(toIndentedString(createdAtNotIn)).append("\n");
        sb.append("    finishedAt: ").append(toIndentedString(finishedAt)).append("\n");
        sb.append("    finishedAtGt: ").append(toIndentedString(finishedAtGt)).append("\n");
        sb.append("    finishedAtGte: ").append(toIndentedString(finishedAtGte)).append("\n");
        sb.append("    finishedAtIn: ").append(toIndentedString(finishedAtIn)).append("\n");
        sb.append("    finishedAtLt: ").append(toIndentedString(finishedAtLt)).append("\n");
        sb.append("    finishedAtLte: ").append(toIndentedString(finishedAtLte)).append("\n");
        sb.append("    finishedAtNot: ").append(toIndentedString(finishedAtNot)).append("\n");
        sb.append("    finishedAtNotIn: ").append(toIndentedString(finishedAtNotIn)).append("\n");
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
        sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
        sb.append("    ipAddressContains: ")
                .append(toIndentedString(ipAddressContains))
                .append("\n");
        sb.append("    ipAddressEndsWith: ")
                .append(toIndentedString(ipAddressEndsWith))
                .append("\n");
        sb.append("    ipAddressGt: ").append(toIndentedString(ipAddressGt)).append("\n");
        sb.append("    ipAddressGte: ").append(toIndentedString(ipAddressGte)).append("\n");
        sb.append("    ipAddressIn: ").append(toIndentedString(ipAddressIn)).append("\n");
        sb.append("    ipAddressLt: ").append(toIndentedString(ipAddressLt)).append("\n");
        sb.append("    ipAddressLte: ").append(toIndentedString(ipAddressLte)).append("\n");
        sb.append("    ipAddressNot: ").append(toIndentedString(ipAddressNot)).append("\n");
        sb.append("    ipAddressNotContains: ")
                .append(toIndentedString(ipAddressNotContains))
                .append("\n");
        sb.append("    ipAddressNotEndsWith: ")
                .append(toIndentedString(ipAddressNotEndsWith))
                .append("\n");
        sb.append("    ipAddressNotIn: ").append(toIndentedString(ipAddressNotIn)).append("\n");
        sb.append("    ipAddressNotStartsWith: ")
                .append(toIndentedString(ipAddressNotStartsWith))
                .append("\n");
        sb.append("    ipAddressStartsWith: ")
                .append(toIndentedString(ipAddressStartsWith))
                .append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    messageContains: ").append(toIndentedString(messageContains)).append("\n");
        sb.append("    messageEndsWith: ").append(toIndentedString(messageEndsWith)).append("\n");
        sb.append("    messageGt: ").append(toIndentedString(messageGt)).append("\n");
        sb.append("    messageGte: ").append(toIndentedString(messageGte)).append("\n");
        sb.append("    messageIn: ").append(toIndentedString(messageIn)).append("\n");
        sb.append("    messageLt: ").append(toIndentedString(messageLt)).append("\n");
        sb.append("    messageLte: ").append(toIndentedString(messageLte)).append("\n");
        sb.append("    messageNot: ").append(toIndentedString(messageNot)).append("\n");
        sb.append("    messageNotContains: ")
                .append(toIndentedString(messageNotContains))
                .append("\n");
        sb.append("    messageNotEndsWith: ")
                .append(toIndentedString(messageNotEndsWith))
                .append("\n");
        sb.append("    messageNotIn: ").append(toIndentedString(messageNotIn)).append("\n");
        sb.append("    messageNotStartsWith: ")
                .append(toIndentedString(messageNotStartsWith))
                .append("\n");
        sb.append("    messageStartsWith: ")
                .append(toIndentedString(messageStartsWith))
                .append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    resourceIdContains: ")
                .append(toIndentedString(resourceIdContains))
                .append("\n");
        sb.append("    resourceIdEndsWith: ")
                .append(toIndentedString(resourceIdEndsWith))
                .append("\n");
        sb.append("    resourceIdGt: ").append(toIndentedString(resourceIdGt)).append("\n");
        sb.append("    resourceIdGte: ").append(toIndentedString(resourceIdGte)).append("\n");
        sb.append("    resourceIdIn: ").append(toIndentedString(resourceIdIn)).append("\n");
        sb.append("    resourceIdLt: ").append(toIndentedString(resourceIdLt)).append("\n");
        sb.append("    resourceIdLte: ").append(toIndentedString(resourceIdLte)).append("\n");
        sb.append("    resourceIdNot: ").append(toIndentedString(resourceIdNot)).append("\n");
        sb.append("    resourceIdNotContains: ")
                .append(toIndentedString(resourceIdNotContains))
                .append("\n");
        sb.append("    resourceIdNotEndsWith: ")
                .append(toIndentedString(resourceIdNotEndsWith))
                .append("\n");
        sb.append("    resourceIdNotIn: ").append(toIndentedString(resourceIdNotIn)).append("\n");
        sb.append("    resourceIdNotStartsWith: ")
                .append(toIndentedString(resourceIdNotStartsWith))
                .append("\n");
        sb.append("    resourceIdStartsWith: ")
                .append(toIndentedString(resourceIdStartsWith))
                .append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    resourceTypeContains: ")
                .append(toIndentedString(resourceTypeContains))
                .append("\n");
        sb.append("    resourceTypeEndsWith: ")
                .append(toIndentedString(resourceTypeEndsWith))
                .append("\n");
        sb.append("    resourceTypeGt: ").append(toIndentedString(resourceTypeGt)).append("\n");
        sb.append("    resourceTypeGte: ").append(toIndentedString(resourceTypeGte)).append("\n");
        sb.append("    resourceTypeIn: ").append(toIndentedString(resourceTypeIn)).append("\n");
        sb.append("    resourceTypeLt: ").append(toIndentedString(resourceTypeLt)).append("\n");
        sb.append("    resourceTypeLte: ").append(toIndentedString(resourceTypeLte)).append("\n");
        sb.append("    resourceTypeNot: ").append(toIndentedString(resourceTypeNot)).append("\n");
        sb.append("    resourceTypeNotContains: ")
                .append(toIndentedString(resourceTypeNotContains))
                .append("\n");
        sb.append("    resourceTypeNotEndsWith: ")
                .append(toIndentedString(resourceTypeNotEndsWith))
                .append("\n");
        sb.append("    resourceTypeNotIn: ")
                .append(toIndentedString(resourceTypeNotIn))
                .append("\n");
        sb.append("    resourceTypeNotStartsWith: ")
                .append(toIndentedString(resourceTypeNotStartsWith))
                .append("\n");
        sb.append("    resourceTypeStartsWith: ")
                .append(toIndentedString(resourceTypeStartsWith))
                .append("\n");
        sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
        sb.append("    startedAtGt: ").append(toIndentedString(startedAtGt)).append("\n");
        sb.append("    startedAtGte: ").append(toIndentedString(startedAtGte)).append("\n");
        sb.append("    startedAtIn: ").append(toIndentedString(startedAtIn)).append("\n");
        sb.append("    startedAtLt: ").append(toIndentedString(startedAtLt)).append("\n");
        sb.append("    startedAtLte: ").append(toIndentedString(startedAtLte)).append("\n");
        sb.append("    startedAtNot: ").append(toIndentedString(startedAtNot)).append("\n");
        sb.append("    startedAtNotIn: ").append(toIndentedString(startedAtNotIn)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    statusIn: ").append(toIndentedString(statusIn)).append("\n");
        sb.append("    statusNot: ").append(toIndentedString(statusNot)).append("\n");
        sb.append("    statusNotIn: ").append(toIndentedString(statusNotIn)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

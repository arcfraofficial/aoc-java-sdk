package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** ReplicationPlanWhereInput */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class ReplicationPlanWhereInput
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_A_N_D = "AND";

    @SerializedName(SERIALIZED_NAME_A_N_D)
    private List<ReplicationPlanWhereInput> AND = null;

    public static final String SERIALIZED_NAME_N_O_T = "NOT";

    @SerializedName(SERIALIZED_NAME_N_O_T)
    private List<ReplicationPlanWhereInput> NOT = null;

    public static final String SERIALIZED_NAME_O_R = "OR";

    @SerializedName(SERIALIZED_NAME_O_R)
    private List<ReplicationPlanWhereInput> OR = null;

    public static final String SERIALIZED_NAME_ABORT_WINDOW_UNFINISHED = "abort_window_unfinished";

    @SerializedName(SERIALIZED_NAME_ABORT_WINDOW_UNFINISHED)
    private Boolean abortWindowUnfinished;

    public static final String SERIALIZED_NAME_ABORT_WINDOW_UNFINISHED_NOT =
            "abort_window_unfinished_not";

    @SerializedName(SERIALIZED_NAME_ABORT_WINDOW_UNFINISHED_NOT)
    private Boolean abortWindowUnfinishedNot;

    public static final String SERIALIZED_NAME_ACTIVATION_TIMESTAMP = "activation_timestamp";

    @SerializedName(SERIALIZED_NAME_ACTIVATION_TIMESTAMP)
    private String activationTimestamp;

    public static final String SERIALIZED_NAME_ACTIVATION_TIMESTAMP_GT = "activation_timestamp_gt";

    @SerializedName(SERIALIZED_NAME_ACTIVATION_TIMESTAMP_GT)
    private String activationTimestampGt;

    public static final String SERIALIZED_NAME_ACTIVATION_TIMESTAMP_GTE =
            "activation_timestamp_gte";

    @SerializedName(SERIALIZED_NAME_ACTIVATION_TIMESTAMP_GTE)
    private String activationTimestampGte;

    public static final String SERIALIZED_NAME_ACTIVATION_TIMESTAMP_IN = "activation_timestamp_in";

    @SerializedName(SERIALIZED_NAME_ACTIVATION_TIMESTAMP_IN)
    private List<String> activationTimestampIn = null;

    public static final String SERIALIZED_NAME_ACTIVATION_TIMESTAMP_LT = "activation_timestamp_lt";

    @SerializedName(SERIALIZED_NAME_ACTIVATION_TIMESTAMP_LT)
    private String activationTimestampLt;

    public static final String SERIALIZED_NAME_ACTIVATION_TIMESTAMP_LTE =
            "activation_timestamp_lte";

    @SerializedName(SERIALIZED_NAME_ACTIVATION_TIMESTAMP_LTE)
    private String activationTimestampLte;

    public static final String SERIALIZED_NAME_ACTIVATION_TIMESTAMP_NOT =
            "activation_timestamp_not";

    @SerializedName(SERIALIZED_NAME_ACTIVATION_TIMESTAMP_NOT)
    private String activationTimestampNot;

    public static final String SERIALIZED_NAME_ACTIVATION_TIMESTAMP_NOT_IN =
            "activation_timestamp_not_in";

    @SerializedName(SERIALIZED_NAME_ACTIVATION_TIMESTAMP_NOT_IN)
    private List<String> activationTimestampNotIn = null;

    public static final String SERIALIZED_NAME_COMPRESSION = "compression";

    @SerializedName(SERIALIZED_NAME_COMPRESSION)
    private Boolean compression;

    public static final String SERIALIZED_NAME_COMPRESSION_NOT = "compression_not";

    @SerializedName(SERIALIZED_NAME_COMPRESSION_NOT)
    private Boolean compressionNot;

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

    public static final String SERIALIZED_NAME_DELETE_STRATEGY = "delete_strategy";

    @SerializedName(SERIALIZED_NAME_DELETE_STRATEGY)
    private BackupPlanDeleteStrategy deleteStrategy;

    public static final String SERIALIZED_NAME_DELETE_STRATEGY_IN = "delete_strategy_in";

    @SerializedName(SERIALIZED_NAME_DELETE_STRATEGY_IN)
    private List<BackupPlanDeleteStrategy> deleteStrategyIn = null;

    public static final String SERIALIZED_NAME_DELETE_STRATEGY_NOT = "delete_strategy_not";

    @SerializedName(SERIALIZED_NAME_DELETE_STRATEGY_NOT)
    private BackupPlanDeleteStrategy deleteStrategyNot;

    public static final String SERIALIZED_NAME_DELETE_STRATEGY_NOT_IN = "delete_strategy_not_in";

    @SerializedName(SERIALIZED_NAME_DELETE_STRATEGY_NOT_IN)
    private List<BackupPlanDeleteStrategy> deleteStrategyNotIn = null;

    public static final String SERIALIZED_NAME_DESCRIPTION = "description";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION)
    private String description;

    public static final String SERIALIZED_NAME_DESCRIPTION_CONTAINS = "description_contains";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION_CONTAINS)
    private String descriptionContains;

    public static final String SERIALIZED_NAME_DESCRIPTION_ENDS_WITH = "description_ends_with";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION_ENDS_WITH)
    private String descriptionEndsWith;

    public static final String SERIALIZED_NAME_DESCRIPTION_GT = "description_gt";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION_GT)
    private String descriptionGt;

    public static final String SERIALIZED_NAME_DESCRIPTION_GTE = "description_gte";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION_GTE)
    private String descriptionGte;

    public static final String SERIALIZED_NAME_DESCRIPTION_IN = "description_in";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION_IN)
    private List<String> descriptionIn = null;

    public static final String SERIALIZED_NAME_DESCRIPTION_LT = "description_lt";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION_LT)
    private String descriptionLt;

    public static final String SERIALIZED_NAME_DESCRIPTION_LTE = "description_lte";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION_LTE)
    private String descriptionLte;

    public static final String SERIALIZED_NAME_DESCRIPTION_NOT = "description_not";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION_NOT)
    private String descriptionNot;

    public static final String SERIALIZED_NAME_DESCRIPTION_NOT_CONTAINS =
            "description_not_contains";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION_NOT_CONTAINS)
    private String descriptionNotContains;

    public static final String SERIALIZED_NAME_DESCRIPTION_NOT_ENDS_WITH =
            "description_not_ends_with";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION_NOT_ENDS_WITH)
    private String descriptionNotEndsWith;

    public static final String SERIALIZED_NAME_DESCRIPTION_NOT_IN = "description_not_in";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION_NOT_IN)
    private List<String> descriptionNotIn = null;

    public static final String SERIALIZED_NAME_DESCRIPTION_NOT_STARTS_WITH =
            "description_not_starts_with";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION_NOT_STARTS_WITH)
    private String descriptionNotStartsWith;

    public static final String SERIALIZED_NAME_DESCRIPTION_STARTS_WITH = "description_starts_with";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION_STARTS_WITH)
    private String descriptionStartsWith;

    public static final String SERIALIZED_NAME_EC_K = "ec_k";

    @SerializedName(SERIALIZED_NAME_EC_K)
    private Integer ecK;

    public static final String SERIALIZED_NAME_EC_K_GT = "ec_k_gt";

    @SerializedName(SERIALIZED_NAME_EC_K_GT)
    private Integer ecKGt;

    public static final String SERIALIZED_NAME_EC_K_GTE = "ec_k_gte";

    @SerializedName(SERIALIZED_NAME_EC_K_GTE)
    private Integer ecKGte;

    public static final String SERIALIZED_NAME_EC_K_IN = "ec_k_in";

    @SerializedName(SERIALIZED_NAME_EC_K_IN)
    private List<Integer> ecKIn = null;

    public static final String SERIALIZED_NAME_EC_K_LT = "ec_k_lt";

    @SerializedName(SERIALIZED_NAME_EC_K_LT)
    private Integer ecKLt;

    public static final String SERIALIZED_NAME_EC_K_LTE = "ec_k_lte";

    @SerializedName(SERIALIZED_NAME_EC_K_LTE)
    private Integer ecKLte;

    public static final String SERIALIZED_NAME_EC_K_NOT = "ec_k_not";

    @SerializedName(SERIALIZED_NAME_EC_K_NOT)
    private Integer ecKNot;

    public static final String SERIALIZED_NAME_EC_K_NOT_IN = "ec_k_not_in";

    @SerializedName(SERIALIZED_NAME_EC_K_NOT_IN)
    private List<Integer> ecKNotIn = null;

    public static final String SERIALIZED_NAME_EC_M = "ec_m";

    @SerializedName(SERIALIZED_NAME_EC_M)
    private Integer ecM;

    public static final String SERIALIZED_NAME_EC_M_GT = "ec_m_gt";

    @SerializedName(SERIALIZED_NAME_EC_M_GT)
    private Integer ecMGt;

    public static final String SERIALIZED_NAME_EC_M_GTE = "ec_m_gte";

    @SerializedName(SERIALIZED_NAME_EC_M_GTE)
    private Integer ecMGte;

    public static final String SERIALIZED_NAME_EC_M_IN = "ec_m_in";

    @SerializedName(SERIALIZED_NAME_EC_M_IN)
    private List<Integer> ecMIn = null;

    public static final String SERIALIZED_NAME_EC_M_LT = "ec_m_lt";

    @SerializedName(SERIALIZED_NAME_EC_M_LT)
    private Integer ecMLt;

    public static final String SERIALIZED_NAME_EC_M_LTE = "ec_m_lte";

    @SerializedName(SERIALIZED_NAME_EC_M_LTE)
    private Integer ecMLte;

    public static final String SERIALIZED_NAME_EC_M_NOT = "ec_m_not";

    @SerializedName(SERIALIZED_NAME_EC_M_NOT)
    private Integer ecMNot;

    public static final String SERIALIZED_NAME_EC_M_NOT_IN = "ec_m_not_in";

    @SerializedName(SERIALIZED_NAME_EC_M_NOT_IN)
    private List<Integer> ecMNotIn = null;

    public static final String SERIALIZED_NAME_ENABLE_WINDOW = "enable_window";

    @SerializedName(SERIALIZED_NAME_ENABLE_WINDOW)
    private Boolean enableWindow;

    public static final String SERIALIZED_NAME_ENABLE_WINDOW_NOT = "enable_window_not";

    @SerializedName(SERIALIZED_NAME_ENABLE_WINDOW_NOT)
    private Boolean enableWindowNot;

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

    public static final String SERIALIZED_NAME_EXTERNAL_CLOUDTOWER = "external_cloudtower";

    @SerializedName(SERIALIZED_NAME_EXTERNAL_CLOUDTOWER)
    private ExternalCloudTowerWhereInput externalCloudtower;

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

    public static final String SERIALIZED_NAME_INBOUND = "inbound";

    @SerializedName(SERIALIZED_NAME_INBOUND)
    private Boolean inbound;

    public static final String SERIALIZED_NAME_INBOUND_NOT = "inbound_not";

    @SerializedName(SERIALIZED_NAME_INBOUND_NOT)
    private Boolean inboundNot;

    public static final String SERIALIZED_NAME_INTERVAL = "interval";

    @SerializedName(SERIALIZED_NAME_INTERVAL)
    private Integer interval;

    public static final String SERIALIZED_NAME_INTERVAL_GT = "interval_gt";

    @SerializedName(SERIALIZED_NAME_INTERVAL_GT)
    private Integer intervalGt;

    public static final String SERIALIZED_NAME_INTERVAL_GTE = "interval_gte";

    @SerializedName(SERIALIZED_NAME_INTERVAL_GTE)
    private Integer intervalGte;

    public static final String SERIALIZED_NAME_INTERVAL_IN = "interval_in";

    @SerializedName(SERIALIZED_NAME_INTERVAL_IN)
    private List<Integer> intervalIn = null;

    public static final String SERIALIZED_NAME_INTERVAL_LT = "interval_lt";

    @SerializedName(SERIALIZED_NAME_INTERVAL_LT)
    private Integer intervalLt;

    public static final String SERIALIZED_NAME_INTERVAL_LTE = "interval_lte";

    @SerializedName(SERIALIZED_NAME_INTERVAL_LTE)
    private Integer intervalLte;

    public static final String SERIALIZED_NAME_INTERVAL_NOT = "interval_not";

    @SerializedName(SERIALIZED_NAME_INTERVAL_NOT)
    private Integer intervalNot;

    public static final String SERIALIZED_NAME_INTERVAL_NOT_IN = "interval_not_in";

    @SerializedName(SERIALIZED_NAME_INTERVAL_NOT_IN)
    private List<Integer> intervalNotIn = null;

    public static final String SERIALIZED_NAME_ISCSI_LUNS_EVERY = "iscsi_luns_every";

    @SerializedName(SERIALIZED_NAME_ISCSI_LUNS_EVERY)
    private IscsiLunWhereInput iscsiLunsEvery;

    public static final String SERIALIZED_NAME_ISCSI_LUNS_NONE = "iscsi_luns_none";

    @SerializedName(SERIALIZED_NAME_ISCSI_LUNS_NONE)
    private IscsiLunWhereInput iscsiLunsNone;

    public static final String SERIALIZED_NAME_ISCSI_LUNS_SOME = "iscsi_luns_some";

    @SerializedName(SERIALIZED_NAME_ISCSI_LUNS_SOME)
    private IscsiLunWhereInput iscsiLunsSome;

    public static final String SERIALIZED_NAME_KEEP_MAC_ADDRESS = "keep_mac_address";

    @SerializedName(SERIALIZED_NAME_KEEP_MAC_ADDRESS)
    private Boolean keepMacAddress;

    public static final String SERIALIZED_NAME_KEEP_MAC_ADDRESS_NOT = "keep_mac_address_not";

    @SerializedName(SERIALIZED_NAME_KEEP_MAC_ADDRESS_NOT)
    private Boolean keepMacAddressNot;

    public static final String SERIALIZED_NAME_KEEP_POLICY = "keep_policy";

    @SerializedName(SERIALIZED_NAME_KEEP_POLICY)
    private BackupPlanKeepPolicy keepPolicy;

    public static final String SERIALIZED_NAME_KEEP_POLICY_IN = "keep_policy_in";

    @SerializedName(SERIALIZED_NAME_KEEP_POLICY_IN)
    private List<BackupPlanKeepPolicy> keepPolicyIn = null;

    public static final String SERIALIZED_NAME_KEEP_POLICY_NOT = "keep_policy_not";

    @SerializedName(SERIALIZED_NAME_KEEP_POLICY_NOT)
    private BackupPlanKeepPolicy keepPolicyNot;

    public static final String SERIALIZED_NAME_KEEP_POLICY_NOT_IN = "keep_policy_not_in";

    @SerializedName(SERIALIZED_NAME_KEEP_POLICY_NOT_IN)
    private List<BackupPlanKeepPolicy> keepPolicyNotIn = null;

    public static final String SERIALIZED_NAME_KEEP_POLICY_VALUE = "keep_policy_value";

    @SerializedName(SERIALIZED_NAME_KEEP_POLICY_VALUE)
    private Integer keepPolicyValue;

    public static final String SERIALIZED_NAME_KEEP_POLICY_VALUE_GT = "keep_policy_value_gt";

    @SerializedName(SERIALIZED_NAME_KEEP_POLICY_VALUE_GT)
    private Integer keepPolicyValueGt;

    public static final String SERIALIZED_NAME_KEEP_POLICY_VALUE_GTE = "keep_policy_value_gte";

    @SerializedName(SERIALIZED_NAME_KEEP_POLICY_VALUE_GTE)
    private Integer keepPolicyValueGte;

    public static final String SERIALIZED_NAME_KEEP_POLICY_VALUE_IN = "keep_policy_value_in";

    @SerializedName(SERIALIZED_NAME_KEEP_POLICY_VALUE_IN)
    private List<Integer> keepPolicyValueIn = null;

    public static final String SERIALIZED_NAME_KEEP_POLICY_VALUE_LT = "keep_policy_value_lt";

    @SerializedName(SERIALIZED_NAME_KEEP_POLICY_VALUE_LT)
    private Integer keepPolicyValueLt;

    public static final String SERIALIZED_NAME_KEEP_POLICY_VALUE_LTE = "keep_policy_value_lte";

    @SerializedName(SERIALIZED_NAME_KEEP_POLICY_VALUE_LTE)
    private Integer keepPolicyValueLte;

    public static final String SERIALIZED_NAME_KEEP_POLICY_VALUE_NOT = "keep_policy_value_not";

    @SerializedName(SERIALIZED_NAME_KEEP_POLICY_VALUE_NOT)
    private Integer keepPolicyValueNot;

    public static final String SERIALIZED_NAME_KEEP_POLICY_VALUE_NOT_IN =
            "keep_policy_value_not_in";

    @SerializedName(SERIALIZED_NAME_KEEP_POLICY_VALUE_NOT_IN)
    private List<Integer> keepPolicyValueNotIn = null;

    public static final String SERIALIZED_NAME_LAST_EXECUTE_STATUS = "last_execute_status";

    @SerializedName(SERIALIZED_NAME_LAST_EXECUTE_STATUS)
    private BackupPlanExecutionStatus lastExecuteStatus;

    public static final String SERIALIZED_NAME_LAST_EXECUTE_STATUS_IN = "last_execute_status_in";

    @SerializedName(SERIALIZED_NAME_LAST_EXECUTE_STATUS_IN)
    private List<BackupPlanExecutionStatus> lastExecuteStatusIn = null;

    public static final String SERIALIZED_NAME_LAST_EXECUTE_STATUS_MESSAGE =
            "last_execute_status_message";

    @SerializedName(SERIALIZED_NAME_LAST_EXECUTE_STATUS_MESSAGE)
    private String lastExecuteStatusMessage;

    public static final String SERIALIZED_NAME_LAST_EXECUTE_STATUS_MESSAGE_CONTAINS =
            "last_execute_status_message_contains";

    @SerializedName(SERIALIZED_NAME_LAST_EXECUTE_STATUS_MESSAGE_CONTAINS)
    private String lastExecuteStatusMessageContains;

    public static final String SERIALIZED_NAME_LAST_EXECUTE_STATUS_MESSAGE_ENDS_WITH =
            "last_execute_status_message_ends_with";

    @SerializedName(SERIALIZED_NAME_LAST_EXECUTE_STATUS_MESSAGE_ENDS_WITH)
    private String lastExecuteStatusMessageEndsWith;

    public static final String SERIALIZED_NAME_LAST_EXECUTE_STATUS_MESSAGE_GT =
            "last_execute_status_message_gt";

    @SerializedName(SERIALIZED_NAME_LAST_EXECUTE_STATUS_MESSAGE_GT)
    private String lastExecuteStatusMessageGt;

    public static final String SERIALIZED_NAME_LAST_EXECUTE_STATUS_MESSAGE_GTE =
            "last_execute_status_message_gte";

    @SerializedName(SERIALIZED_NAME_LAST_EXECUTE_STATUS_MESSAGE_GTE)
    private String lastExecuteStatusMessageGte;

    public static final String SERIALIZED_NAME_LAST_EXECUTE_STATUS_MESSAGE_IN =
            "last_execute_status_message_in";

    @SerializedName(SERIALIZED_NAME_LAST_EXECUTE_STATUS_MESSAGE_IN)
    private List<String> lastExecuteStatusMessageIn = null;

    public static final String SERIALIZED_NAME_LAST_EXECUTE_STATUS_MESSAGE_LT =
            "last_execute_status_message_lt";

    @SerializedName(SERIALIZED_NAME_LAST_EXECUTE_STATUS_MESSAGE_LT)
    private String lastExecuteStatusMessageLt;

    public static final String SERIALIZED_NAME_LAST_EXECUTE_STATUS_MESSAGE_LTE =
            "last_execute_status_message_lte";

    @SerializedName(SERIALIZED_NAME_LAST_EXECUTE_STATUS_MESSAGE_LTE)
    private String lastExecuteStatusMessageLte;

    public static final String SERIALIZED_NAME_LAST_EXECUTE_STATUS_MESSAGE_NOT =
            "last_execute_status_message_not";

    @SerializedName(SERIALIZED_NAME_LAST_EXECUTE_STATUS_MESSAGE_NOT)
    private String lastExecuteStatusMessageNot;

    public static final String SERIALIZED_NAME_LAST_EXECUTE_STATUS_MESSAGE_NOT_CONTAINS =
            "last_execute_status_message_not_contains";

    @SerializedName(SERIALIZED_NAME_LAST_EXECUTE_STATUS_MESSAGE_NOT_CONTAINS)
    private String lastExecuteStatusMessageNotContains;

    public static final String SERIALIZED_NAME_LAST_EXECUTE_STATUS_MESSAGE_NOT_ENDS_WITH =
            "last_execute_status_message_not_ends_with";

    @SerializedName(SERIALIZED_NAME_LAST_EXECUTE_STATUS_MESSAGE_NOT_ENDS_WITH)
    private String lastExecuteStatusMessageNotEndsWith;

    public static final String SERIALIZED_NAME_LAST_EXECUTE_STATUS_MESSAGE_NOT_IN =
            "last_execute_status_message_not_in";

    @SerializedName(SERIALIZED_NAME_LAST_EXECUTE_STATUS_MESSAGE_NOT_IN)
    private List<String> lastExecuteStatusMessageNotIn = null;

    public static final String SERIALIZED_NAME_LAST_EXECUTE_STATUS_MESSAGE_NOT_STARTS_WITH =
            "last_execute_status_message_not_starts_with";

    @SerializedName(SERIALIZED_NAME_LAST_EXECUTE_STATUS_MESSAGE_NOT_STARTS_WITH)
    private String lastExecuteStatusMessageNotStartsWith;

    public static final String SERIALIZED_NAME_LAST_EXECUTE_STATUS_MESSAGE_STARTS_WITH =
            "last_execute_status_message_starts_with";

    @SerializedName(SERIALIZED_NAME_LAST_EXECUTE_STATUS_MESSAGE_STARTS_WITH)
    private String lastExecuteStatusMessageStartsWith;

    public static final String SERIALIZED_NAME_LAST_EXECUTE_STATUS_NOT = "last_execute_status_not";

    @SerializedName(SERIALIZED_NAME_LAST_EXECUTE_STATUS_NOT)
    private BackupPlanExecutionStatus lastExecuteStatusNot;

    public static final String SERIALIZED_NAME_LAST_EXECUTE_STATUS_NOT_IN =
            "last_execute_status_not_in";

    @SerializedName(SERIALIZED_NAME_LAST_EXECUTE_STATUS_NOT_IN)
    private List<BackupPlanExecutionStatus> lastExecuteStatusNotIn = null;

    public static final String SERIALIZED_NAME_LAST_EXECUTE_SUCCESS_JOB_COUNT =
            "last_execute_success_job_count";

    @SerializedName(SERIALIZED_NAME_LAST_EXECUTE_SUCCESS_JOB_COUNT)
    private Integer lastExecuteSuccessJobCount;

    public static final String SERIALIZED_NAME_LAST_EXECUTE_SUCCESS_JOB_COUNT_GT =
            "last_execute_success_job_count_gt";

    @SerializedName(SERIALIZED_NAME_LAST_EXECUTE_SUCCESS_JOB_COUNT_GT)
    private Integer lastExecuteSuccessJobCountGt;

    public static final String SERIALIZED_NAME_LAST_EXECUTE_SUCCESS_JOB_COUNT_GTE =
            "last_execute_success_job_count_gte";

    @SerializedName(SERIALIZED_NAME_LAST_EXECUTE_SUCCESS_JOB_COUNT_GTE)
    private Integer lastExecuteSuccessJobCountGte;

    public static final String SERIALIZED_NAME_LAST_EXECUTE_SUCCESS_JOB_COUNT_IN =
            "last_execute_success_job_count_in";

    @SerializedName(SERIALIZED_NAME_LAST_EXECUTE_SUCCESS_JOB_COUNT_IN)
    private List<Integer> lastExecuteSuccessJobCountIn = null;

    public static final String SERIALIZED_NAME_LAST_EXECUTE_SUCCESS_JOB_COUNT_LT =
            "last_execute_success_job_count_lt";

    @SerializedName(SERIALIZED_NAME_LAST_EXECUTE_SUCCESS_JOB_COUNT_LT)
    private Integer lastExecuteSuccessJobCountLt;

    public static final String SERIALIZED_NAME_LAST_EXECUTE_SUCCESS_JOB_COUNT_LTE =
            "last_execute_success_job_count_lte";

    @SerializedName(SERIALIZED_NAME_LAST_EXECUTE_SUCCESS_JOB_COUNT_LTE)
    private Integer lastExecuteSuccessJobCountLte;

    public static final String SERIALIZED_NAME_LAST_EXECUTE_SUCCESS_JOB_COUNT_NOT =
            "last_execute_success_job_count_not";

    @SerializedName(SERIALIZED_NAME_LAST_EXECUTE_SUCCESS_JOB_COUNT_NOT)
    private Integer lastExecuteSuccessJobCountNot;

    public static final String SERIALIZED_NAME_LAST_EXECUTE_SUCCESS_JOB_COUNT_NOT_IN =
            "last_execute_success_job_count_not_in";

    @SerializedName(SERIALIZED_NAME_LAST_EXECUTE_SUCCESS_JOB_COUNT_NOT_IN)
    private List<Integer> lastExecuteSuccessJobCountNotIn = null;

    public static final String SERIALIZED_NAME_LAST_EXECUTE_TOTAL_JOB_COUNT =
            "last_execute_total_job_count";

    @SerializedName(SERIALIZED_NAME_LAST_EXECUTE_TOTAL_JOB_COUNT)
    private Integer lastExecuteTotalJobCount;

    public static final String SERIALIZED_NAME_LAST_EXECUTE_TOTAL_JOB_COUNT_GT =
            "last_execute_total_job_count_gt";

    @SerializedName(SERIALIZED_NAME_LAST_EXECUTE_TOTAL_JOB_COUNT_GT)
    private Integer lastExecuteTotalJobCountGt;

    public static final String SERIALIZED_NAME_LAST_EXECUTE_TOTAL_JOB_COUNT_GTE =
            "last_execute_total_job_count_gte";

    @SerializedName(SERIALIZED_NAME_LAST_EXECUTE_TOTAL_JOB_COUNT_GTE)
    private Integer lastExecuteTotalJobCountGte;

    public static final String SERIALIZED_NAME_LAST_EXECUTE_TOTAL_JOB_COUNT_IN =
            "last_execute_total_job_count_in";

    @SerializedName(SERIALIZED_NAME_LAST_EXECUTE_TOTAL_JOB_COUNT_IN)
    private List<Integer> lastExecuteTotalJobCountIn = null;

    public static final String SERIALIZED_NAME_LAST_EXECUTE_TOTAL_JOB_COUNT_LT =
            "last_execute_total_job_count_lt";

    @SerializedName(SERIALIZED_NAME_LAST_EXECUTE_TOTAL_JOB_COUNT_LT)
    private Integer lastExecuteTotalJobCountLt;

    public static final String SERIALIZED_NAME_LAST_EXECUTE_TOTAL_JOB_COUNT_LTE =
            "last_execute_total_job_count_lte";

    @SerializedName(SERIALIZED_NAME_LAST_EXECUTE_TOTAL_JOB_COUNT_LTE)
    private Integer lastExecuteTotalJobCountLte;

    public static final String SERIALIZED_NAME_LAST_EXECUTE_TOTAL_JOB_COUNT_NOT =
            "last_execute_total_job_count_not";

    @SerializedName(SERIALIZED_NAME_LAST_EXECUTE_TOTAL_JOB_COUNT_NOT)
    private Integer lastExecuteTotalJobCountNot;

    public static final String SERIALIZED_NAME_LAST_EXECUTE_TOTAL_JOB_COUNT_NOT_IN =
            "last_execute_total_job_count_not_in";

    @SerializedName(SERIALIZED_NAME_LAST_EXECUTE_TOTAL_JOB_COUNT_NOT_IN)
    private List<Integer> lastExecuteTotalJobCountNotIn = null;

    public static final String SERIALIZED_NAME_LAST_EXECUTED_AT = "last_executed_at";

    @SerializedName(SERIALIZED_NAME_LAST_EXECUTED_AT)
    private String lastExecutedAt;

    public static final String SERIALIZED_NAME_LAST_EXECUTED_AT_GT = "last_executed_at_gt";

    @SerializedName(SERIALIZED_NAME_LAST_EXECUTED_AT_GT)
    private String lastExecutedAtGt;

    public static final String SERIALIZED_NAME_LAST_EXECUTED_AT_GTE = "last_executed_at_gte";

    @SerializedName(SERIALIZED_NAME_LAST_EXECUTED_AT_GTE)
    private String lastExecutedAtGte;

    public static final String SERIALIZED_NAME_LAST_EXECUTED_AT_IN = "last_executed_at_in";

    @SerializedName(SERIALIZED_NAME_LAST_EXECUTED_AT_IN)
    private List<String> lastExecutedAtIn = null;

    public static final String SERIALIZED_NAME_LAST_EXECUTED_AT_LT = "last_executed_at_lt";

    @SerializedName(SERIALIZED_NAME_LAST_EXECUTED_AT_LT)
    private String lastExecutedAtLt;

    public static final String SERIALIZED_NAME_LAST_EXECUTED_AT_LTE = "last_executed_at_lte";

    @SerializedName(SERIALIZED_NAME_LAST_EXECUTED_AT_LTE)
    private String lastExecutedAtLte;

    public static final String SERIALIZED_NAME_LAST_EXECUTED_AT_NOT = "last_executed_at_not";

    @SerializedName(SERIALIZED_NAME_LAST_EXECUTED_AT_NOT)
    private String lastExecutedAtNot;

    public static final String SERIALIZED_NAME_LAST_EXECUTED_AT_NOT_IN = "last_executed_at_not_in";

    @SerializedName(SERIALIZED_NAME_LAST_EXECUTED_AT_NOT_IN)
    private List<String> lastExecutedAtNotIn = null;

    public static final String SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS =
            "last_manual_execute_status";

    @SerializedName(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS)
    private BackupPlanExecutionStatus lastManualExecuteStatus;

    public static final String SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_IN =
            "last_manual_execute_status_in";

    @SerializedName(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_IN)
    private List<BackupPlanExecutionStatus> lastManualExecuteStatusIn = null;

    public static final String SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_MESSAGE =
            "last_manual_execute_status_message";

    @SerializedName(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_MESSAGE)
    private String lastManualExecuteStatusMessage;

    public static final String SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_MESSAGE_CONTAINS =
            "last_manual_execute_status_message_contains";

    @SerializedName(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_MESSAGE_CONTAINS)
    private String lastManualExecuteStatusMessageContains;

    public static final String SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_MESSAGE_ENDS_WITH =
            "last_manual_execute_status_message_ends_with";

    @SerializedName(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_MESSAGE_ENDS_WITH)
    private String lastManualExecuteStatusMessageEndsWith;

    public static final String SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_MESSAGE_GT =
            "last_manual_execute_status_message_gt";

    @SerializedName(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_MESSAGE_GT)
    private String lastManualExecuteStatusMessageGt;

    public static final String SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_MESSAGE_GTE =
            "last_manual_execute_status_message_gte";

    @SerializedName(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_MESSAGE_GTE)
    private String lastManualExecuteStatusMessageGte;

    public static final String SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_MESSAGE_IN =
            "last_manual_execute_status_message_in";

    @SerializedName(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_MESSAGE_IN)
    private List<String> lastManualExecuteStatusMessageIn = null;

    public static final String SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_MESSAGE_LT =
            "last_manual_execute_status_message_lt";

    @SerializedName(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_MESSAGE_LT)
    private String lastManualExecuteStatusMessageLt;

    public static final String SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_MESSAGE_LTE =
            "last_manual_execute_status_message_lte";

    @SerializedName(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_MESSAGE_LTE)
    private String lastManualExecuteStatusMessageLte;

    public static final String SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_MESSAGE_NOT =
            "last_manual_execute_status_message_not";

    @SerializedName(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_MESSAGE_NOT)
    private String lastManualExecuteStatusMessageNot;

    public static final String SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_MESSAGE_NOT_CONTAINS =
            "last_manual_execute_status_message_not_contains";

    @SerializedName(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_MESSAGE_NOT_CONTAINS)
    private String lastManualExecuteStatusMessageNotContains;

    public static final String SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_MESSAGE_NOT_ENDS_WITH =
            "last_manual_execute_status_message_not_ends_with";

    @SerializedName(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_MESSAGE_NOT_ENDS_WITH)
    private String lastManualExecuteStatusMessageNotEndsWith;

    public static final String SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_MESSAGE_NOT_IN =
            "last_manual_execute_status_message_not_in";

    @SerializedName(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_MESSAGE_NOT_IN)
    private List<String> lastManualExecuteStatusMessageNotIn = null;

    public static final String SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_MESSAGE_NOT_STARTS_WITH =
            "last_manual_execute_status_message_not_starts_with";

    @SerializedName(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_MESSAGE_NOT_STARTS_WITH)
    private String lastManualExecuteStatusMessageNotStartsWith;

    public static final String SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_MESSAGE_STARTS_WITH =
            "last_manual_execute_status_message_starts_with";

    @SerializedName(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_MESSAGE_STARTS_WITH)
    private String lastManualExecuteStatusMessageStartsWith;

    public static final String SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_NOT =
            "last_manual_execute_status_not";

    @SerializedName(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_NOT)
    private BackupPlanExecutionStatus lastManualExecuteStatusNot;

    public static final String SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_NOT_IN =
            "last_manual_execute_status_not_in";

    @SerializedName(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_NOT_IN)
    private List<BackupPlanExecutionStatus> lastManualExecuteStatusNotIn = null;

    public static final String SERIALIZED_NAME_LAST_MANUAL_EXECUTE_SUCCESS_JOB_COUNT =
            "last_manual_execute_success_job_count";

    @SerializedName(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_SUCCESS_JOB_COUNT)
    private Integer lastManualExecuteSuccessJobCount;

    public static final String SERIALIZED_NAME_LAST_MANUAL_EXECUTE_SUCCESS_JOB_COUNT_GT =
            "last_manual_execute_success_job_count_gt";

    @SerializedName(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_SUCCESS_JOB_COUNT_GT)
    private Integer lastManualExecuteSuccessJobCountGt;

    public static final String SERIALIZED_NAME_LAST_MANUAL_EXECUTE_SUCCESS_JOB_COUNT_GTE =
            "last_manual_execute_success_job_count_gte";

    @SerializedName(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_SUCCESS_JOB_COUNT_GTE)
    private Integer lastManualExecuteSuccessJobCountGte;

    public static final String SERIALIZED_NAME_LAST_MANUAL_EXECUTE_SUCCESS_JOB_COUNT_IN =
            "last_manual_execute_success_job_count_in";

    @SerializedName(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_SUCCESS_JOB_COUNT_IN)
    private List<Integer> lastManualExecuteSuccessJobCountIn = null;

    public static final String SERIALIZED_NAME_LAST_MANUAL_EXECUTE_SUCCESS_JOB_COUNT_LT =
            "last_manual_execute_success_job_count_lt";

    @SerializedName(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_SUCCESS_JOB_COUNT_LT)
    private Integer lastManualExecuteSuccessJobCountLt;

    public static final String SERIALIZED_NAME_LAST_MANUAL_EXECUTE_SUCCESS_JOB_COUNT_LTE =
            "last_manual_execute_success_job_count_lte";

    @SerializedName(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_SUCCESS_JOB_COUNT_LTE)
    private Integer lastManualExecuteSuccessJobCountLte;

    public static final String SERIALIZED_NAME_LAST_MANUAL_EXECUTE_SUCCESS_JOB_COUNT_NOT =
            "last_manual_execute_success_job_count_not";

    @SerializedName(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_SUCCESS_JOB_COUNT_NOT)
    private Integer lastManualExecuteSuccessJobCountNot;

    public static final String SERIALIZED_NAME_LAST_MANUAL_EXECUTE_SUCCESS_JOB_COUNT_NOT_IN =
            "last_manual_execute_success_job_count_not_in";

    @SerializedName(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_SUCCESS_JOB_COUNT_NOT_IN)
    private List<Integer> lastManualExecuteSuccessJobCountNotIn = null;

    public static final String SERIALIZED_NAME_LAST_MANUAL_EXECUTE_TOTAL_JOB_COUNT =
            "last_manual_execute_total_job_count";

    @SerializedName(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_TOTAL_JOB_COUNT)
    private Integer lastManualExecuteTotalJobCount;

    public static final String SERIALIZED_NAME_LAST_MANUAL_EXECUTE_TOTAL_JOB_COUNT_GT =
            "last_manual_execute_total_job_count_gt";

    @SerializedName(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_TOTAL_JOB_COUNT_GT)
    private Integer lastManualExecuteTotalJobCountGt;

    public static final String SERIALIZED_NAME_LAST_MANUAL_EXECUTE_TOTAL_JOB_COUNT_GTE =
            "last_manual_execute_total_job_count_gte";

    @SerializedName(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_TOTAL_JOB_COUNT_GTE)
    private Integer lastManualExecuteTotalJobCountGte;

    public static final String SERIALIZED_NAME_LAST_MANUAL_EXECUTE_TOTAL_JOB_COUNT_IN =
            "last_manual_execute_total_job_count_in";

    @SerializedName(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_TOTAL_JOB_COUNT_IN)
    private List<Integer> lastManualExecuteTotalJobCountIn = null;

    public static final String SERIALIZED_NAME_LAST_MANUAL_EXECUTE_TOTAL_JOB_COUNT_LT =
            "last_manual_execute_total_job_count_lt";

    @SerializedName(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_TOTAL_JOB_COUNT_LT)
    private Integer lastManualExecuteTotalJobCountLt;

    public static final String SERIALIZED_NAME_LAST_MANUAL_EXECUTE_TOTAL_JOB_COUNT_LTE =
            "last_manual_execute_total_job_count_lte";

    @SerializedName(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_TOTAL_JOB_COUNT_LTE)
    private Integer lastManualExecuteTotalJobCountLte;

    public static final String SERIALIZED_NAME_LAST_MANUAL_EXECUTE_TOTAL_JOB_COUNT_NOT =
            "last_manual_execute_total_job_count_not";

    @SerializedName(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_TOTAL_JOB_COUNT_NOT)
    private Integer lastManualExecuteTotalJobCountNot;

    public static final String SERIALIZED_NAME_LAST_MANUAL_EXECUTE_TOTAL_JOB_COUNT_NOT_IN =
            "last_manual_execute_total_job_count_not_in";

    @SerializedName(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_TOTAL_JOB_COUNT_NOT_IN)
    private List<Integer> lastManualExecuteTotalJobCountNotIn = null;

    public static final String SERIALIZED_NAME_LAST_MANUAL_EXECUTED_AT = "last_manual_executed_at";

    @SerializedName(SERIALIZED_NAME_LAST_MANUAL_EXECUTED_AT)
    private String lastManualExecutedAt;

    public static final String SERIALIZED_NAME_LAST_MANUAL_EXECUTED_AT_GT =
            "last_manual_executed_at_gt";

    @SerializedName(SERIALIZED_NAME_LAST_MANUAL_EXECUTED_AT_GT)
    private String lastManualExecutedAtGt;

    public static final String SERIALIZED_NAME_LAST_MANUAL_EXECUTED_AT_GTE =
            "last_manual_executed_at_gte";

    @SerializedName(SERIALIZED_NAME_LAST_MANUAL_EXECUTED_AT_GTE)
    private String lastManualExecutedAtGte;

    public static final String SERIALIZED_NAME_LAST_MANUAL_EXECUTED_AT_IN =
            "last_manual_executed_at_in";

    @SerializedName(SERIALIZED_NAME_LAST_MANUAL_EXECUTED_AT_IN)
    private List<String> lastManualExecutedAtIn = null;

    public static final String SERIALIZED_NAME_LAST_MANUAL_EXECUTED_AT_LT =
            "last_manual_executed_at_lt";

    @SerializedName(SERIALIZED_NAME_LAST_MANUAL_EXECUTED_AT_LT)
    private String lastManualExecutedAtLt;

    public static final String SERIALIZED_NAME_LAST_MANUAL_EXECUTED_AT_LTE =
            "last_manual_executed_at_lte";

    @SerializedName(SERIALIZED_NAME_LAST_MANUAL_EXECUTED_AT_LTE)
    private String lastManualExecutedAtLte;

    public static final String SERIALIZED_NAME_LAST_MANUAL_EXECUTED_AT_NOT =
            "last_manual_executed_at_not";

    @SerializedName(SERIALIZED_NAME_LAST_MANUAL_EXECUTED_AT_NOT)
    private String lastManualExecutedAtNot;

    public static final String SERIALIZED_NAME_LAST_MANUAL_EXECUTED_AT_NOT_IN =
            "last_manual_executed_at_not_in";

    @SerializedName(SERIALIZED_NAME_LAST_MANUAL_EXECUTED_AT_NOT_IN)
    private List<String> lastManualExecutedAtNotIn = null;

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

    public static final String SERIALIZED_NAME_NEXT_EXECUTION_TIME = "next_execution_time";

    @SerializedName(SERIALIZED_NAME_NEXT_EXECUTION_TIME)
    private String nextExecutionTime;

    public static final String SERIALIZED_NAME_NEXT_EXECUTION_TIME_GT = "next_execution_time_gt";

    @SerializedName(SERIALIZED_NAME_NEXT_EXECUTION_TIME_GT)
    private String nextExecutionTimeGt;

    public static final String SERIALIZED_NAME_NEXT_EXECUTION_TIME_GTE = "next_execution_time_gte";

    @SerializedName(SERIALIZED_NAME_NEXT_EXECUTION_TIME_GTE)
    private String nextExecutionTimeGte;

    public static final String SERIALIZED_NAME_NEXT_EXECUTION_TIME_IN = "next_execution_time_in";

    @SerializedName(SERIALIZED_NAME_NEXT_EXECUTION_TIME_IN)
    private List<String> nextExecutionTimeIn = null;

    public static final String SERIALIZED_NAME_NEXT_EXECUTION_TIME_LT = "next_execution_time_lt";

    @SerializedName(SERIALIZED_NAME_NEXT_EXECUTION_TIME_LT)
    private String nextExecutionTimeLt;

    public static final String SERIALIZED_NAME_NEXT_EXECUTION_TIME_LTE = "next_execution_time_lte";

    @SerializedName(SERIALIZED_NAME_NEXT_EXECUTION_TIME_LTE)
    private String nextExecutionTimeLte;

    public static final String SERIALIZED_NAME_NEXT_EXECUTION_TIME_NOT = "next_execution_time_not";

    @SerializedName(SERIALIZED_NAME_NEXT_EXECUTION_TIME_NOT)
    private String nextExecutionTimeNot;

    public static final String SERIALIZED_NAME_NEXT_EXECUTION_TIME_NOT_IN =
            "next_execution_time_not_in";

    @SerializedName(SERIALIZED_NAME_NEXT_EXECUTION_TIME_NOT_IN)
    private List<String> nextExecutionTimeNotIn = null;

    public static final String SERIALIZED_NAME_PERIOD = "period";

    @SerializedName(SERIALIZED_NAME_PERIOD)
    private ReplicationPlanPeriod period;

    public static final String SERIALIZED_NAME_PERIOD_IN = "period_in";

    @SerializedName(SERIALIZED_NAME_PERIOD_IN)
    private List<ReplicationPlanPeriod> periodIn = null;

    public static final String SERIALIZED_NAME_PERIOD_NOT = "period_not";

    @SerializedName(SERIALIZED_NAME_PERIOD_NOT)
    private ReplicationPlanPeriod periodNot;

    public static final String SERIALIZED_NAME_PERIOD_NOT_IN = "period_not_in";

    @SerializedName(SERIALIZED_NAME_PERIOD_NOT_IN)
    private List<ReplicationPlanPeriod> periodNotIn = null;

    public static final String SERIALIZED_NAME_PHASE = "phase";

    @SerializedName(SERIALIZED_NAME_PHASE)
    private BackupPlanPhase phase;

    public static final String SERIALIZED_NAME_PHASE_IN = "phase_in";

    @SerializedName(SERIALIZED_NAME_PHASE_IN)
    private List<BackupPlanPhase> phaseIn = null;

    public static final String SERIALIZED_NAME_PHASE_NOT = "phase_not";

    @SerializedName(SERIALIZED_NAME_PHASE_NOT)
    private BackupPlanPhase phaseNot;

    public static final String SERIALIZED_NAME_PHASE_NOT_IN = "phase_not_in";

    @SerializedName(SERIALIZED_NAME_PHASE_NOT_IN)
    private List<BackupPlanPhase> phaseNotIn = null;

    public static final String SERIALIZED_NAME_REPLICA_NAME_RULE = "replica_name_rule";

    @SerializedName(SERIALIZED_NAME_REPLICA_NAME_RULE)
    private ReplicaNameRule replicaNameRule;

    public static final String SERIALIZED_NAME_REPLICA_NAME_RULE_IN = "replica_name_rule_in";

    @SerializedName(SERIALIZED_NAME_REPLICA_NAME_RULE_IN)
    private List<ReplicaNameRule> replicaNameRuleIn = null;

    public static final String SERIALIZED_NAME_REPLICA_NAME_RULE_NOT = "replica_name_rule_not";

    @SerializedName(SERIALIZED_NAME_REPLICA_NAME_RULE_NOT)
    private ReplicaNameRule replicaNameRuleNot;

    public static final String SERIALIZED_NAME_REPLICA_NAME_RULE_NOT_IN =
            "replica_name_rule_not_in";

    @SerializedName(SERIALIZED_NAME_REPLICA_NAME_RULE_NOT_IN)
    private List<ReplicaNameRule> replicaNameRuleNotIn = null;

    public static final String SERIALIZED_NAME_REPLICA_NAME_SETTING = "replica_name_setting";

    @SerializedName(SERIALIZED_NAME_REPLICA_NAME_SETTING)
    private String replicaNameSetting;

    public static final String SERIALIZED_NAME_REPLICA_NAME_SETTING_CONTAINS =
            "replica_name_setting_contains";

    @SerializedName(SERIALIZED_NAME_REPLICA_NAME_SETTING_CONTAINS)
    private String replicaNameSettingContains;

    public static final String SERIALIZED_NAME_REPLICA_NAME_SETTING_ENDS_WITH =
            "replica_name_setting_ends_with";

    @SerializedName(SERIALIZED_NAME_REPLICA_NAME_SETTING_ENDS_WITH)
    private String replicaNameSettingEndsWith;

    public static final String SERIALIZED_NAME_REPLICA_NAME_SETTING_GT = "replica_name_setting_gt";

    @SerializedName(SERIALIZED_NAME_REPLICA_NAME_SETTING_GT)
    private String replicaNameSettingGt;

    public static final String SERIALIZED_NAME_REPLICA_NAME_SETTING_GTE =
            "replica_name_setting_gte";

    @SerializedName(SERIALIZED_NAME_REPLICA_NAME_SETTING_GTE)
    private String replicaNameSettingGte;

    public static final String SERIALIZED_NAME_REPLICA_NAME_SETTING_IN = "replica_name_setting_in";

    @SerializedName(SERIALIZED_NAME_REPLICA_NAME_SETTING_IN)
    private List<String> replicaNameSettingIn = null;

    public static final String SERIALIZED_NAME_REPLICA_NAME_SETTING_LT = "replica_name_setting_lt";

    @SerializedName(SERIALIZED_NAME_REPLICA_NAME_SETTING_LT)
    private String replicaNameSettingLt;

    public static final String SERIALIZED_NAME_REPLICA_NAME_SETTING_LTE =
            "replica_name_setting_lte";

    @SerializedName(SERIALIZED_NAME_REPLICA_NAME_SETTING_LTE)
    private String replicaNameSettingLte;

    public static final String SERIALIZED_NAME_REPLICA_NAME_SETTING_NOT =
            "replica_name_setting_not";

    @SerializedName(SERIALIZED_NAME_REPLICA_NAME_SETTING_NOT)
    private String replicaNameSettingNot;

    public static final String SERIALIZED_NAME_REPLICA_NAME_SETTING_NOT_CONTAINS =
            "replica_name_setting_not_contains";

    @SerializedName(SERIALIZED_NAME_REPLICA_NAME_SETTING_NOT_CONTAINS)
    private String replicaNameSettingNotContains;

    public static final String SERIALIZED_NAME_REPLICA_NAME_SETTING_NOT_ENDS_WITH =
            "replica_name_setting_not_ends_with";

    @SerializedName(SERIALIZED_NAME_REPLICA_NAME_SETTING_NOT_ENDS_WITH)
    private String replicaNameSettingNotEndsWith;

    public static final String SERIALIZED_NAME_REPLICA_NAME_SETTING_NOT_IN =
            "replica_name_setting_not_in";

    @SerializedName(SERIALIZED_NAME_REPLICA_NAME_SETTING_NOT_IN)
    private List<String> replicaNameSettingNotIn = null;

    public static final String SERIALIZED_NAME_REPLICA_NAME_SETTING_NOT_STARTS_WITH =
            "replica_name_setting_not_starts_with";

    @SerializedName(SERIALIZED_NAME_REPLICA_NAME_SETTING_NOT_STARTS_WITH)
    private String replicaNameSettingNotStartsWith;

    public static final String SERIALIZED_NAME_REPLICA_NAME_SETTING_STARTS_WITH =
            "replica_name_setting_starts_with";

    @SerializedName(SERIALIZED_NAME_REPLICA_NAME_SETTING_STARTS_WITH)
    private String replicaNameSettingStartsWith;

    public static final String SERIALIZED_NAME_REPLICA_NUM = "replica_num";

    @SerializedName(SERIALIZED_NAME_REPLICA_NUM)
    private Integer replicaNum;

    public static final String SERIALIZED_NAME_REPLICA_NUM_GT = "replica_num_gt";

    @SerializedName(SERIALIZED_NAME_REPLICA_NUM_GT)
    private Integer replicaNumGt;

    public static final String SERIALIZED_NAME_REPLICA_NUM_GTE = "replica_num_gte";

    @SerializedName(SERIALIZED_NAME_REPLICA_NUM_GTE)
    private Integer replicaNumGte;

    public static final String SERIALIZED_NAME_REPLICA_NUM_IN = "replica_num_in";

    @SerializedName(SERIALIZED_NAME_REPLICA_NUM_IN)
    private List<Integer> replicaNumIn = null;

    public static final String SERIALIZED_NAME_REPLICA_NUM_LT = "replica_num_lt";

    @SerializedName(SERIALIZED_NAME_REPLICA_NUM_LT)
    private Integer replicaNumLt;

    public static final String SERIALIZED_NAME_REPLICA_NUM_LTE = "replica_num_lte";

    @SerializedName(SERIALIZED_NAME_REPLICA_NUM_LTE)
    private Integer replicaNumLte;

    public static final String SERIALIZED_NAME_REPLICA_NUM_NOT = "replica_num_not";

    @SerializedName(SERIALIZED_NAME_REPLICA_NUM_NOT)
    private Integer replicaNumNot;

    public static final String SERIALIZED_NAME_REPLICA_NUM_NOT_IN = "replica_num_not_in";

    @SerializedName(SERIALIZED_NAME_REPLICA_NUM_NOT_IN)
    private List<Integer> replicaNumNotIn = null;

    public static final String SERIALIZED_NAME_REPLICA_VMS_EVERY = "replica_vms_every";

    @SerializedName(SERIALIZED_NAME_REPLICA_VMS_EVERY)
    private ReplicaVmWhereInput replicaVmsEvery;

    public static final String SERIALIZED_NAME_REPLICA_VMS_NONE = "replica_vms_none";

    @SerializedName(SERIALIZED_NAME_REPLICA_VMS_NONE)
    private ReplicaVmWhereInput replicaVmsNone;

    public static final String SERIALIZED_NAME_REPLICA_VMS_SOME = "replica_vms_some";

    @SerializedName(SERIALIZED_NAME_REPLICA_VMS_SOME)
    private ReplicaVmWhereInput replicaVmsSome;

    public static final String SERIALIZED_NAME_REPLICATION_PLAN_EXECUTIONS_EVERY =
            "replication_plan_executions_every";

    @SerializedName(SERIALIZED_NAME_REPLICATION_PLAN_EXECUTIONS_EVERY)
    private ReplicationPlanExecutionWhereInput replicationPlanExecutionsEvery;

    public static final String SERIALIZED_NAME_REPLICATION_PLAN_EXECUTIONS_NONE =
            "replication_plan_executions_none";

    @SerializedName(SERIALIZED_NAME_REPLICATION_PLAN_EXECUTIONS_NONE)
    private ReplicationPlanExecutionWhereInput replicationPlanExecutionsNone;

    public static final String SERIALIZED_NAME_REPLICATION_PLAN_EXECUTIONS_SOME =
            "replication_plan_executions_some";

    @SerializedName(SERIALIZED_NAME_REPLICATION_PLAN_EXECUTIONS_SOME)
    private ReplicationPlanExecutionWhereInput replicationPlanExecutionsSome;

    public static final String SERIALIZED_NAME_REPLICATION_RESTORE_POINTS_EVERY =
            "replication_restore_points_every";

    @SerializedName(SERIALIZED_NAME_REPLICATION_RESTORE_POINTS_EVERY)
    private ReplicationRestorePointWhereInput replicationRestorePointsEvery;

    public static final String SERIALIZED_NAME_REPLICATION_RESTORE_POINTS_NONE =
            "replication_restore_points_none";

    @SerializedName(SERIALIZED_NAME_REPLICATION_RESTORE_POINTS_NONE)
    private ReplicationRestorePointWhereInput replicationRestorePointsNone;

    public static final String SERIALIZED_NAME_REPLICATION_RESTORE_POINTS_SOME =
            "replication_restore_points_some";

    @SerializedName(SERIALIZED_NAME_REPLICATION_RESTORE_POINTS_SOME)
    private ReplicationRestorePointWhereInput replicationRestorePointsSome;

    public static final String SERIALIZED_NAME_REPLICATION_TARGET_EXECUTIONS_EVERY =
            "replication_target_executions_every";

    @SerializedName(SERIALIZED_NAME_REPLICATION_TARGET_EXECUTIONS_EVERY)
    private ReplicationTargetExecutionWhereInput replicationTargetExecutionsEvery;

    public static final String SERIALIZED_NAME_REPLICATION_TARGET_EXECUTIONS_NONE =
            "replication_target_executions_none";

    @SerializedName(SERIALIZED_NAME_REPLICATION_TARGET_EXECUTIONS_NONE)
    private ReplicationTargetExecutionWhereInput replicationTargetExecutionsNone;

    public static final String SERIALIZED_NAME_REPLICATION_TARGET_EXECUTIONS_SOME =
            "replication_target_executions_some";

    @SerializedName(SERIALIZED_NAME_REPLICATION_TARGET_EXECUTIONS_SOME)
    private ReplicationTargetExecutionWhereInput replicationTargetExecutionsSome;

    public static final String SERIALIZED_NAME_RESILIENCY_TYPE = "resiliency_type";

    @SerializedName(SERIALIZED_NAME_RESILIENCY_TYPE)
    private ResiliencyType resiliencyType;

    public static final String SERIALIZED_NAME_RESILIENCY_TYPE_IN = "resiliency_type_in";

    @SerializedName(SERIALIZED_NAME_RESILIENCY_TYPE_IN)
    private List<ResiliencyType> resiliencyTypeIn = null;

    public static final String SERIALIZED_NAME_RESILIENCY_TYPE_NOT = "resiliency_type_not";

    @SerializedName(SERIALIZED_NAME_RESILIENCY_TYPE_NOT)
    private ResiliencyType resiliencyTypeNot;

    public static final String SERIALIZED_NAME_RESILIENCY_TYPE_NOT_IN = "resiliency_type_not_in";

    @SerializedName(SERIALIZED_NAME_RESILIENCY_TYPE_NOT_IN)
    private List<ResiliencyType> resiliencyTypeNotIn = null;

    public static final String SERIALIZED_NAME_SNAPSHOT_CONSISTENT_TYPE =
            "snapshot_consistent_type";

    @SerializedName(SERIALIZED_NAME_SNAPSHOT_CONSISTENT_TYPE)
    private ConsistentType snapshotConsistentType;

    public static final String SERIALIZED_NAME_SNAPSHOT_CONSISTENT_TYPE_IN =
            "snapshot_consistent_type_in";

    @SerializedName(SERIALIZED_NAME_SNAPSHOT_CONSISTENT_TYPE_IN)
    private List<ConsistentType> snapshotConsistentTypeIn = null;

    public static final String SERIALIZED_NAME_SNAPSHOT_CONSISTENT_TYPE_NOT =
            "snapshot_consistent_type_not";

    @SerializedName(SERIALIZED_NAME_SNAPSHOT_CONSISTENT_TYPE_NOT)
    private ConsistentType snapshotConsistentTypeNot;

    public static final String SERIALIZED_NAME_SNAPSHOT_CONSISTENT_TYPE_NOT_IN =
            "snapshot_consistent_type_not_in";

    @SerializedName(SERIALIZED_NAME_SNAPSHOT_CONSISTENT_TYPE_NOT_IN)
    private List<ConsistentType> snapshotConsistentTypeNotIn = null;

    public static final String SERIALIZED_NAME_STATUS = "status";

    @SerializedName(SERIALIZED_NAME_STATUS)
    private BackupPlanStatus status;

    public static final String SERIALIZED_NAME_STATUS_IN = "status_in";

    @SerializedName(SERIALIZED_NAME_STATUS_IN)
    private List<BackupPlanStatus> statusIn = null;

    public static final String SERIALIZED_NAME_STATUS_NOT = "status_not";

    @SerializedName(SERIALIZED_NAME_STATUS_NOT)
    private BackupPlanStatus statusNot;

    public static final String SERIALIZED_NAME_STATUS_NOT_IN = "status_not_in";

    @SerializedName(SERIALIZED_NAME_STATUS_NOT_IN)
    private List<BackupPlanStatus> statusNotIn = null;

    public static final String SERIALIZED_NAME_STORAGE_POLICY = "storage_policy";

    @SerializedName(SERIALIZED_NAME_STORAGE_POLICY)
    private VmVolumeElfStoragePolicyType storagePolicy;

    public static final String SERIALIZED_NAME_STORAGE_POLICY_IN = "storage_policy_in";

    @SerializedName(SERIALIZED_NAME_STORAGE_POLICY_IN)
    private List<VmVolumeElfStoragePolicyType> storagePolicyIn = null;

    public static final String SERIALIZED_NAME_STORAGE_POLICY_NOT = "storage_policy_not";

    @SerializedName(SERIALIZED_NAME_STORAGE_POLICY_NOT)
    private VmVolumeElfStoragePolicyType storagePolicyNot;

    public static final String SERIALIZED_NAME_STORAGE_POLICY_NOT_IN = "storage_policy_not_in";

    @SerializedName(SERIALIZED_NAME_STORAGE_POLICY_NOT_IN)
    private List<VmVolumeElfStoragePolicyType> storagePolicyNotIn = null;

    public static final String SERIALIZED_NAME_TARGET_CLUSTER = "target_cluster";

    @SerializedName(SERIALIZED_NAME_TARGET_CLUSTER)
    private ClusterWhereInput targetCluster;

    public static final String SERIALIZED_NAME_TARGET_REPLICATION_SERVICE =
            "target_replication_service";

    @SerializedName(SERIALIZED_NAME_TARGET_REPLICATION_SERVICE)
    private ReplicationServiceWhereInput targetReplicationService;

    public static final String SERIALIZED_NAME_THIN_PROVISION = "thin_provision";

    @SerializedName(SERIALIZED_NAME_THIN_PROVISION)
    private Boolean thinProvision;

    public static final String SERIALIZED_NAME_THIN_PROVISION_NOT = "thin_provision_not";

    @SerializedName(SERIALIZED_NAME_THIN_PROVISION_NOT)
    private Boolean thinProvisionNot;

    public static final String SERIALIZED_NAME_TYPE = "type";

    @SerializedName(SERIALIZED_NAME_TYPE)
    private ReplicationPlanType type;

    public static final String SERIALIZED_NAME_TYPE_IN = "type_in";

    @SerializedName(SERIALIZED_NAME_TYPE_IN)
    private List<ReplicationPlanType> typeIn = null;

    public static final String SERIALIZED_NAME_TYPE_NOT = "type_not";

    @SerializedName(SERIALIZED_NAME_TYPE_NOT)
    private ReplicationPlanType typeNot;

    public static final String SERIALIZED_NAME_TYPE_NOT_IN = "type_not_in";

    @SerializedName(SERIALIZED_NAME_TYPE_NOT_IN)
    private List<ReplicationPlanType> typeNotIn = null;

    public static final String SERIALIZED_NAME_UPDATED_AT = "updatedAt";

    @SerializedName(SERIALIZED_NAME_UPDATED_AT)
    private String updatedAt;

    public static final String SERIALIZED_NAME_UPDATED_AT_GT = "updatedAt_gt";

    @SerializedName(SERIALIZED_NAME_UPDATED_AT_GT)
    private String updatedAtGt;

    public static final String SERIALIZED_NAME_UPDATED_AT_GTE = "updatedAt_gte";

    @SerializedName(SERIALIZED_NAME_UPDATED_AT_GTE)
    private String updatedAtGte;

    public static final String SERIALIZED_NAME_UPDATED_AT_IN = "updatedAt_in";

    @SerializedName(SERIALIZED_NAME_UPDATED_AT_IN)
    private List<String> updatedAtIn = null;

    public static final String SERIALIZED_NAME_UPDATED_AT_LT = "updatedAt_lt";

    @SerializedName(SERIALIZED_NAME_UPDATED_AT_LT)
    private String updatedAtLt;

    public static final String SERIALIZED_NAME_UPDATED_AT_LTE = "updatedAt_lte";

    @SerializedName(SERIALIZED_NAME_UPDATED_AT_LTE)
    private String updatedAtLte;

    public static final String SERIALIZED_NAME_UPDATED_AT_NOT = "updatedAt_not";

    @SerializedName(SERIALIZED_NAME_UPDATED_AT_NOT)
    private String updatedAtNot;

    public static final String SERIALIZED_NAME_UPDATED_AT_NOT_IN = "updatedAt_not_in";

    @SerializedName(SERIALIZED_NAME_UPDATED_AT_NOT_IN)
    private List<String> updatedAtNotIn = null;

    public static final String SERIALIZED_NAME_VMS_EVERY = "vms_every";

    @SerializedName(SERIALIZED_NAME_VMS_EVERY)
    private VmWhereInput vmsEvery;

    public static final String SERIALIZED_NAME_VMS_NONE = "vms_none";

    @SerializedName(SERIALIZED_NAME_VMS_NONE)
    private VmWhereInput vmsNone;

    public static final String SERIALIZED_NAME_VMS_SOME = "vms_some";

    @SerializedName(SERIALIZED_NAME_VMS_SOME)
    private VmWhereInput vmsSome;

    public static final String SERIALIZED_NAME_WINDOW_END = "window_end";

    @SerializedName(SERIALIZED_NAME_WINDOW_END)
    private String windowEnd;

    public static final String SERIALIZED_NAME_WINDOW_END_CONTAINS = "window_end_contains";

    @SerializedName(SERIALIZED_NAME_WINDOW_END_CONTAINS)
    private String windowEndContains;

    public static final String SERIALIZED_NAME_WINDOW_END_ENDS_WITH = "window_end_ends_with";

    @SerializedName(SERIALIZED_NAME_WINDOW_END_ENDS_WITH)
    private String windowEndEndsWith;

    public static final String SERIALIZED_NAME_WINDOW_END_GT = "window_end_gt";

    @SerializedName(SERIALIZED_NAME_WINDOW_END_GT)
    private String windowEndGt;

    public static final String SERIALIZED_NAME_WINDOW_END_GTE = "window_end_gte";

    @SerializedName(SERIALIZED_NAME_WINDOW_END_GTE)
    private String windowEndGte;

    public static final String SERIALIZED_NAME_WINDOW_END_IN = "window_end_in";

    @SerializedName(SERIALIZED_NAME_WINDOW_END_IN)
    private List<String> windowEndIn = null;

    public static final String SERIALIZED_NAME_WINDOW_END_LT = "window_end_lt";

    @SerializedName(SERIALIZED_NAME_WINDOW_END_LT)
    private String windowEndLt;

    public static final String SERIALIZED_NAME_WINDOW_END_LTE = "window_end_lte";

    @SerializedName(SERIALIZED_NAME_WINDOW_END_LTE)
    private String windowEndLte;

    public static final String SERIALIZED_NAME_WINDOW_END_NOT = "window_end_not";

    @SerializedName(SERIALIZED_NAME_WINDOW_END_NOT)
    private String windowEndNot;

    public static final String SERIALIZED_NAME_WINDOW_END_NOT_CONTAINS = "window_end_not_contains";

    @SerializedName(SERIALIZED_NAME_WINDOW_END_NOT_CONTAINS)
    private String windowEndNotContains;

    public static final String SERIALIZED_NAME_WINDOW_END_NOT_ENDS_WITH =
            "window_end_not_ends_with";

    @SerializedName(SERIALIZED_NAME_WINDOW_END_NOT_ENDS_WITH)
    private String windowEndNotEndsWith;

    public static final String SERIALIZED_NAME_WINDOW_END_NOT_IN = "window_end_not_in";

    @SerializedName(SERIALIZED_NAME_WINDOW_END_NOT_IN)
    private List<String> windowEndNotIn = null;

    public static final String SERIALIZED_NAME_WINDOW_END_NOT_STARTS_WITH =
            "window_end_not_starts_with";

    @SerializedName(SERIALIZED_NAME_WINDOW_END_NOT_STARTS_WITH)
    private String windowEndNotStartsWith;

    public static final String SERIALIZED_NAME_WINDOW_END_STARTS_WITH = "window_end_starts_with";

    @SerializedName(SERIALIZED_NAME_WINDOW_END_STARTS_WITH)
    private String windowEndStartsWith;

    public static final String SERIALIZED_NAME_WINDOW_START = "window_start";

    @SerializedName(SERIALIZED_NAME_WINDOW_START)
    private String windowStart;

    public static final String SERIALIZED_NAME_WINDOW_START_CONTAINS = "window_start_contains";

    @SerializedName(SERIALIZED_NAME_WINDOW_START_CONTAINS)
    private String windowStartContains;

    public static final String SERIALIZED_NAME_WINDOW_START_ENDS_WITH = "window_start_ends_with";

    @SerializedName(SERIALIZED_NAME_WINDOW_START_ENDS_WITH)
    private String windowStartEndsWith;

    public static final String SERIALIZED_NAME_WINDOW_START_GT = "window_start_gt";

    @SerializedName(SERIALIZED_NAME_WINDOW_START_GT)
    private String windowStartGt;

    public static final String SERIALIZED_NAME_WINDOW_START_GTE = "window_start_gte";

    @SerializedName(SERIALIZED_NAME_WINDOW_START_GTE)
    private String windowStartGte;

    public static final String SERIALIZED_NAME_WINDOW_START_IN = "window_start_in";

    @SerializedName(SERIALIZED_NAME_WINDOW_START_IN)
    private List<String> windowStartIn = null;

    public static final String SERIALIZED_NAME_WINDOW_START_LT = "window_start_lt";

    @SerializedName(SERIALIZED_NAME_WINDOW_START_LT)
    private String windowStartLt;

    public static final String SERIALIZED_NAME_WINDOW_START_LTE = "window_start_lte";

    @SerializedName(SERIALIZED_NAME_WINDOW_START_LTE)
    private String windowStartLte;

    public static final String SERIALIZED_NAME_WINDOW_START_NOT = "window_start_not";

    @SerializedName(SERIALIZED_NAME_WINDOW_START_NOT)
    private String windowStartNot;

    public static final String SERIALIZED_NAME_WINDOW_START_NOT_CONTAINS =
            "window_start_not_contains";

    @SerializedName(SERIALIZED_NAME_WINDOW_START_NOT_CONTAINS)
    private String windowStartNotContains;

    public static final String SERIALIZED_NAME_WINDOW_START_NOT_ENDS_WITH =
            "window_start_not_ends_with";

    @SerializedName(SERIALIZED_NAME_WINDOW_START_NOT_ENDS_WITH)
    private String windowStartNotEndsWith;

    public static final String SERIALIZED_NAME_WINDOW_START_NOT_IN = "window_start_not_in";

    @SerializedName(SERIALIZED_NAME_WINDOW_START_NOT_IN)
    private List<String> windowStartNotIn = null;

    public static final String SERIALIZED_NAME_WINDOW_START_NOT_STARTS_WITH =
            "window_start_not_starts_with";

    @SerializedName(SERIALIZED_NAME_WINDOW_START_NOT_STARTS_WITH)
    private String windowStartNotStartsWith;

    public static final String SERIALIZED_NAME_WINDOW_START_STARTS_WITH =
            "window_start_starts_with";

    @SerializedName(SERIALIZED_NAME_WINDOW_START_STARTS_WITH)
    private String windowStartStartsWith;

    public ReplicationPlanWhereInput() {}

    public ReplicationPlanWhereInput AND(List<ReplicationPlanWhereInput> AND) {

        this.AND = AND;
        return this;
    }

    public ReplicationPlanWhereInput addANDItem(ReplicationPlanWhereInput ANDItem) {
        if (this.AND == null) {
            this.AND = new ArrayList<ReplicationPlanWhereInput>();
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
    public List<ReplicationPlanWhereInput> getAND() {
        return AND;
    }

    public void setAND(List<ReplicationPlanWhereInput> AND) {
        this.AND = AND;
    }

    public ReplicationPlanWhereInput AND_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_A_N_D);
        return this;
    }

    public ReplicationPlanWhereInput AND_ExplictlyNonNull() {
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

    public ReplicationPlanWhereInput NOT(List<ReplicationPlanWhereInput> NOT) {

        this.NOT = NOT;
        return this;
    }

    public ReplicationPlanWhereInput addNOTItem(ReplicationPlanWhereInput NOTItem) {
        if (this.NOT == null) {
            this.NOT = new ArrayList<ReplicationPlanWhereInput>();
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
    public List<ReplicationPlanWhereInput> getNOT() {
        return NOT;
    }

    public void setNOT(List<ReplicationPlanWhereInput> NOT) {
        this.NOT = NOT;
    }

    public ReplicationPlanWhereInput NOT_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_N_O_T);
        return this;
    }

    public ReplicationPlanWhereInput NOT_ExplictlyNonNull() {
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

    public ReplicationPlanWhereInput OR(List<ReplicationPlanWhereInput> OR) {

        this.OR = OR;
        return this;
    }

    public ReplicationPlanWhereInput addORItem(ReplicationPlanWhereInput ORItem) {
        if (this.OR == null) {
            this.OR = new ArrayList<ReplicationPlanWhereInput>();
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
    public List<ReplicationPlanWhereInput> getOR() {
        return OR;
    }

    public void setOR(List<ReplicationPlanWhereInput> OR) {
        this.OR = OR;
    }

    public ReplicationPlanWhereInput OR_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_O_R);
        return this;
    }

    public ReplicationPlanWhereInput OR_ExplictlyNonNull() {
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

    public ReplicationPlanWhereInput abortWindowUnfinished(Boolean abortWindowUnfinished) {

        this.abortWindowUnfinished = abortWindowUnfinished;
        return this;
    }

    /**
     * Get abortWindowUnfinished
     *
     * @return abortWindowUnfinished
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getAbortWindowUnfinished() {
        return abortWindowUnfinished;
    }

    public void setAbortWindowUnfinished(Boolean abortWindowUnfinished) {
        this.abortWindowUnfinished = abortWindowUnfinished;
    }

    public ReplicationPlanWhereInput abortWindowUnfinished_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ABORT_WINDOW_UNFINISHED);
        return this;
    }

    public ReplicationPlanWhereInput abortWindowUnfinished_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ABORT_WINDOW_UNFINISHED);
        return this;
    }

    public void setAbortWindowUnfinished_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ABORT_WINDOW_UNFINISHED);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ABORT_WINDOW_UNFINISHED);
        }
    }

    public boolean getAbortWindowUnfinished_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ABORT_WINDOW_UNFINISHED);
    }

    public ReplicationPlanWhereInput abortWindowUnfinishedNot(Boolean abortWindowUnfinishedNot) {

        this.abortWindowUnfinishedNot = abortWindowUnfinishedNot;
        return this;
    }

    /**
     * Get abortWindowUnfinishedNot
     *
     * @return abortWindowUnfinishedNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getAbortWindowUnfinishedNot() {
        return abortWindowUnfinishedNot;
    }

    public void setAbortWindowUnfinishedNot(Boolean abortWindowUnfinishedNot) {
        this.abortWindowUnfinishedNot = abortWindowUnfinishedNot;
    }

    public ReplicationPlanWhereInput abortWindowUnfinishedNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ABORT_WINDOW_UNFINISHED_NOT);
        return this;
    }

    public ReplicationPlanWhereInput abortWindowUnfinishedNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ABORT_WINDOW_UNFINISHED_NOT);
        return this;
    }

    public void setAbortWindowUnfinishedNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ABORT_WINDOW_UNFINISHED_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ABORT_WINDOW_UNFINISHED_NOT);
        }
    }

    public boolean getAbortWindowUnfinishedNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ABORT_WINDOW_UNFINISHED_NOT);
    }

    public ReplicationPlanWhereInput activationTimestamp(String activationTimestamp) {

        this.activationTimestamp = activationTimestamp;
        return this;
    }

    /**
     * Get activationTimestamp
     *
     * @return activationTimestamp
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getActivationTimestamp() {
        return activationTimestamp;
    }

    public void setActivationTimestamp(String activationTimestamp) {
        this.activationTimestamp = activationTimestamp;
    }

    public ReplicationPlanWhereInput activationTimestamp_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ACTIVATION_TIMESTAMP);
        return this;
    }

    public ReplicationPlanWhereInput activationTimestamp_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ACTIVATION_TIMESTAMP);
        return this;
    }

    public void setActivationTimestamp_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ACTIVATION_TIMESTAMP);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ACTIVATION_TIMESTAMP);
        }
    }

    public boolean getActivationTimestamp_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ACTIVATION_TIMESTAMP);
    }

    public ReplicationPlanWhereInput activationTimestampGt(String activationTimestampGt) {

        this.activationTimestampGt = activationTimestampGt;
        return this;
    }

    /**
     * Get activationTimestampGt
     *
     * @return activationTimestampGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getActivationTimestampGt() {
        return activationTimestampGt;
    }

    public void setActivationTimestampGt(String activationTimestampGt) {
        this.activationTimestampGt = activationTimestampGt;
    }

    public ReplicationPlanWhereInput activationTimestampGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ACTIVATION_TIMESTAMP_GT);
        return this;
    }

    public ReplicationPlanWhereInput activationTimestampGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ACTIVATION_TIMESTAMP_GT);
        return this;
    }

    public void setActivationTimestampGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ACTIVATION_TIMESTAMP_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ACTIVATION_TIMESTAMP_GT);
        }
    }

    public boolean getActivationTimestampGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ACTIVATION_TIMESTAMP_GT);
    }

    public ReplicationPlanWhereInput activationTimestampGte(String activationTimestampGte) {

        this.activationTimestampGte = activationTimestampGte;
        return this;
    }

    /**
     * Get activationTimestampGte
     *
     * @return activationTimestampGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getActivationTimestampGte() {
        return activationTimestampGte;
    }

    public void setActivationTimestampGte(String activationTimestampGte) {
        this.activationTimestampGte = activationTimestampGte;
    }

    public ReplicationPlanWhereInput activationTimestampGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ACTIVATION_TIMESTAMP_GTE);
        return this;
    }

    public ReplicationPlanWhereInput activationTimestampGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ACTIVATION_TIMESTAMP_GTE);
        return this;
    }

    public void setActivationTimestampGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ACTIVATION_TIMESTAMP_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ACTIVATION_TIMESTAMP_GTE);
        }
    }

    public boolean getActivationTimestampGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ACTIVATION_TIMESTAMP_GTE);
    }

    public ReplicationPlanWhereInput activationTimestampIn(List<String> activationTimestampIn) {

        this.activationTimestampIn = activationTimestampIn;
        return this;
    }

    public ReplicationPlanWhereInput addActivationTimestampInItem(
            String activationTimestampInItem) {
        if (this.activationTimestampIn == null) {
            this.activationTimestampIn = new ArrayList<String>();
        }
        this.activationTimestampIn.add(activationTimestampInItem);
        return this;
    }

    /**
     * Get activationTimestampIn
     *
     * @return activationTimestampIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getActivationTimestampIn() {
        return activationTimestampIn;
    }

    public void setActivationTimestampIn(List<String> activationTimestampIn) {
        this.activationTimestampIn = activationTimestampIn;
    }

    public ReplicationPlanWhereInput activationTimestampIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ACTIVATION_TIMESTAMP_IN);
        return this;
    }

    public ReplicationPlanWhereInput activationTimestampIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ACTIVATION_TIMESTAMP_IN);
        return this;
    }

    public void setActivationTimestampIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ACTIVATION_TIMESTAMP_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ACTIVATION_TIMESTAMP_IN);
        }
    }

    public boolean getActivationTimestampIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ACTIVATION_TIMESTAMP_IN);
    }

    public ReplicationPlanWhereInput activationTimestampLt(String activationTimestampLt) {

        this.activationTimestampLt = activationTimestampLt;
        return this;
    }

    /**
     * Get activationTimestampLt
     *
     * @return activationTimestampLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getActivationTimestampLt() {
        return activationTimestampLt;
    }

    public void setActivationTimestampLt(String activationTimestampLt) {
        this.activationTimestampLt = activationTimestampLt;
    }

    public ReplicationPlanWhereInput activationTimestampLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ACTIVATION_TIMESTAMP_LT);
        return this;
    }

    public ReplicationPlanWhereInput activationTimestampLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ACTIVATION_TIMESTAMP_LT);
        return this;
    }

    public void setActivationTimestampLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ACTIVATION_TIMESTAMP_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ACTIVATION_TIMESTAMP_LT);
        }
    }

    public boolean getActivationTimestampLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ACTIVATION_TIMESTAMP_LT);
    }

    public ReplicationPlanWhereInput activationTimestampLte(String activationTimestampLte) {

        this.activationTimestampLte = activationTimestampLte;
        return this;
    }

    /**
     * Get activationTimestampLte
     *
     * @return activationTimestampLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getActivationTimestampLte() {
        return activationTimestampLte;
    }

    public void setActivationTimestampLte(String activationTimestampLte) {
        this.activationTimestampLte = activationTimestampLte;
    }

    public ReplicationPlanWhereInput activationTimestampLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ACTIVATION_TIMESTAMP_LTE);
        return this;
    }

    public ReplicationPlanWhereInput activationTimestampLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ACTIVATION_TIMESTAMP_LTE);
        return this;
    }

    public void setActivationTimestampLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ACTIVATION_TIMESTAMP_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ACTIVATION_TIMESTAMP_LTE);
        }
    }

    public boolean getActivationTimestampLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ACTIVATION_TIMESTAMP_LTE);
    }

    public ReplicationPlanWhereInput activationTimestampNot(String activationTimestampNot) {

        this.activationTimestampNot = activationTimestampNot;
        return this;
    }

    /**
     * Get activationTimestampNot
     *
     * @return activationTimestampNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getActivationTimestampNot() {
        return activationTimestampNot;
    }

    public void setActivationTimestampNot(String activationTimestampNot) {
        this.activationTimestampNot = activationTimestampNot;
    }

    public ReplicationPlanWhereInput activationTimestampNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ACTIVATION_TIMESTAMP_NOT);
        return this;
    }

    public ReplicationPlanWhereInput activationTimestampNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ACTIVATION_TIMESTAMP_NOT);
        return this;
    }

    public void setActivationTimestampNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ACTIVATION_TIMESTAMP_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ACTIVATION_TIMESTAMP_NOT);
        }
    }

    public boolean getActivationTimestampNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ACTIVATION_TIMESTAMP_NOT);
    }

    public ReplicationPlanWhereInput activationTimestampNotIn(
            List<String> activationTimestampNotIn) {

        this.activationTimestampNotIn = activationTimestampNotIn;
        return this;
    }

    public ReplicationPlanWhereInput addActivationTimestampNotInItem(
            String activationTimestampNotInItem) {
        if (this.activationTimestampNotIn == null) {
            this.activationTimestampNotIn = new ArrayList<String>();
        }
        this.activationTimestampNotIn.add(activationTimestampNotInItem);
        return this;
    }

    /**
     * Get activationTimestampNotIn
     *
     * @return activationTimestampNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getActivationTimestampNotIn() {
        return activationTimestampNotIn;
    }

    public void setActivationTimestampNotIn(List<String> activationTimestampNotIn) {
        this.activationTimestampNotIn = activationTimestampNotIn;
    }

    public ReplicationPlanWhereInput activationTimestampNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ACTIVATION_TIMESTAMP_NOT_IN);
        return this;
    }

    public ReplicationPlanWhereInput activationTimestampNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ACTIVATION_TIMESTAMP_NOT_IN);
        return this;
    }

    public void setActivationTimestampNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ACTIVATION_TIMESTAMP_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ACTIVATION_TIMESTAMP_NOT_IN);
        }
    }

    public boolean getActivationTimestampNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ACTIVATION_TIMESTAMP_NOT_IN);
    }

    public ReplicationPlanWhereInput compression(Boolean compression) {

        this.compression = compression;
        return this;
    }

    /**
     * Get compression
     *
     * @return compression
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getCompression() {
        return compression;
    }

    public void setCompression(Boolean compression) {
        this.compression = compression;
    }

    public ReplicationPlanWhereInput compression_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_COMPRESSION);
        return this;
    }

    public ReplicationPlanWhereInput compression_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_COMPRESSION);
        return this;
    }

    public void setCompression_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_COMPRESSION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_COMPRESSION);
        }
    }

    public boolean getCompression_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_COMPRESSION);
    }

    public ReplicationPlanWhereInput compressionNot(Boolean compressionNot) {

        this.compressionNot = compressionNot;
        return this;
    }

    /**
     * Get compressionNot
     *
     * @return compressionNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getCompressionNot() {
        return compressionNot;
    }

    public void setCompressionNot(Boolean compressionNot) {
        this.compressionNot = compressionNot;
    }

    public ReplicationPlanWhereInput compressionNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_COMPRESSION_NOT);
        return this;
    }

    public ReplicationPlanWhereInput compressionNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_COMPRESSION_NOT);
        return this;
    }

    public void setCompressionNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_COMPRESSION_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_COMPRESSION_NOT);
        }
    }

    public boolean getCompressionNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_COMPRESSION_NOT);
    }

    public ReplicationPlanWhereInput createdAt(String createdAt) {

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

    public ReplicationPlanWhereInput createdAt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT);
        return this;
    }

    public ReplicationPlanWhereInput createdAt_ExplictlyNonNull() {
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

    public ReplicationPlanWhereInput createdAtGt(String createdAtGt) {

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

    public ReplicationPlanWhereInput createdAtGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_GT);
        return this;
    }

    public ReplicationPlanWhereInput createdAtGt_ExplictlyNonNull() {
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

    public ReplicationPlanWhereInput createdAtGte(String createdAtGte) {

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

    public ReplicationPlanWhereInput createdAtGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_GTE);
        return this;
    }

    public ReplicationPlanWhereInput createdAtGte_ExplictlyNonNull() {
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

    public ReplicationPlanWhereInput createdAtIn(List<String> createdAtIn) {

        this.createdAtIn = createdAtIn;
        return this;
    }

    public ReplicationPlanWhereInput addCreatedAtInItem(String createdAtInItem) {
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

    public ReplicationPlanWhereInput createdAtIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_IN);
        return this;
    }

    public ReplicationPlanWhereInput createdAtIn_ExplictlyNonNull() {
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

    public ReplicationPlanWhereInput createdAtLt(String createdAtLt) {

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

    public ReplicationPlanWhereInput createdAtLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_LT);
        return this;
    }

    public ReplicationPlanWhereInput createdAtLt_ExplictlyNonNull() {
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

    public ReplicationPlanWhereInput createdAtLte(String createdAtLte) {

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

    public ReplicationPlanWhereInput createdAtLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_LTE);
        return this;
    }

    public ReplicationPlanWhereInput createdAtLte_ExplictlyNonNull() {
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

    public ReplicationPlanWhereInput createdAtNot(String createdAtNot) {

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

    public ReplicationPlanWhereInput createdAtNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_NOT);
        return this;
    }

    public ReplicationPlanWhereInput createdAtNot_ExplictlyNonNull() {
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

    public ReplicationPlanWhereInput createdAtNotIn(List<String> createdAtNotIn) {

        this.createdAtNotIn = createdAtNotIn;
        return this;
    }

    public ReplicationPlanWhereInput addCreatedAtNotInItem(String createdAtNotInItem) {
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

    public ReplicationPlanWhereInput createdAtNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_NOT_IN);
        return this;
    }

    public ReplicationPlanWhereInput createdAtNotIn_ExplictlyNonNull() {
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

    public ReplicationPlanWhereInput deleteStrategy(BackupPlanDeleteStrategy deleteStrategy) {

        this.deleteStrategy = deleteStrategy;
        return this;
    }

    /**
     * Get deleteStrategy
     *
     * @return deleteStrategy
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public BackupPlanDeleteStrategy getDeleteStrategy() {
        return deleteStrategy;
    }

    public void setDeleteStrategy(BackupPlanDeleteStrategy deleteStrategy) {
        this.deleteStrategy = deleteStrategy;
    }

    public ReplicationPlanWhereInput deleteStrategy_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DELETE_STRATEGY);
        return this;
    }

    public ReplicationPlanWhereInput deleteStrategy_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DELETE_STRATEGY);
        return this;
    }

    public void setDeleteStrategy_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DELETE_STRATEGY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DELETE_STRATEGY);
        }
    }

    public boolean getDeleteStrategy_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DELETE_STRATEGY);
    }

    public ReplicationPlanWhereInput deleteStrategyIn(
            List<BackupPlanDeleteStrategy> deleteStrategyIn) {

        this.deleteStrategyIn = deleteStrategyIn;
        return this;
    }

    public ReplicationPlanWhereInput addDeleteStrategyInItem(
            BackupPlanDeleteStrategy deleteStrategyInItem) {
        if (this.deleteStrategyIn == null) {
            this.deleteStrategyIn = new ArrayList<BackupPlanDeleteStrategy>();
        }
        this.deleteStrategyIn.add(deleteStrategyInItem);
        return this;
    }

    /**
     * Get deleteStrategyIn
     *
     * @return deleteStrategyIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<BackupPlanDeleteStrategy> getDeleteStrategyIn() {
        return deleteStrategyIn;
    }

    public void setDeleteStrategyIn(List<BackupPlanDeleteStrategy> deleteStrategyIn) {
        this.deleteStrategyIn = deleteStrategyIn;
    }

    public ReplicationPlanWhereInput deleteStrategyIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DELETE_STRATEGY_IN);
        return this;
    }

    public ReplicationPlanWhereInput deleteStrategyIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DELETE_STRATEGY_IN);
        return this;
    }

    public void setDeleteStrategyIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DELETE_STRATEGY_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DELETE_STRATEGY_IN);
        }
    }

    public boolean getDeleteStrategyIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DELETE_STRATEGY_IN);
    }

    public ReplicationPlanWhereInput deleteStrategyNot(BackupPlanDeleteStrategy deleteStrategyNot) {

        this.deleteStrategyNot = deleteStrategyNot;
        return this;
    }

    /**
     * Get deleteStrategyNot
     *
     * @return deleteStrategyNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public BackupPlanDeleteStrategy getDeleteStrategyNot() {
        return deleteStrategyNot;
    }

    public void setDeleteStrategyNot(BackupPlanDeleteStrategy deleteStrategyNot) {
        this.deleteStrategyNot = deleteStrategyNot;
    }

    public ReplicationPlanWhereInput deleteStrategyNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DELETE_STRATEGY_NOT);
        return this;
    }

    public ReplicationPlanWhereInput deleteStrategyNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DELETE_STRATEGY_NOT);
        return this;
    }

    public void setDeleteStrategyNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DELETE_STRATEGY_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DELETE_STRATEGY_NOT);
        }
    }

    public boolean getDeleteStrategyNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DELETE_STRATEGY_NOT);
    }

    public ReplicationPlanWhereInput deleteStrategyNotIn(
            List<BackupPlanDeleteStrategy> deleteStrategyNotIn) {

        this.deleteStrategyNotIn = deleteStrategyNotIn;
        return this;
    }

    public ReplicationPlanWhereInput addDeleteStrategyNotInItem(
            BackupPlanDeleteStrategy deleteStrategyNotInItem) {
        if (this.deleteStrategyNotIn == null) {
            this.deleteStrategyNotIn = new ArrayList<BackupPlanDeleteStrategy>();
        }
        this.deleteStrategyNotIn.add(deleteStrategyNotInItem);
        return this;
    }

    /**
     * Get deleteStrategyNotIn
     *
     * @return deleteStrategyNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<BackupPlanDeleteStrategy> getDeleteStrategyNotIn() {
        return deleteStrategyNotIn;
    }

    public void setDeleteStrategyNotIn(List<BackupPlanDeleteStrategy> deleteStrategyNotIn) {
        this.deleteStrategyNotIn = deleteStrategyNotIn;
    }

    public ReplicationPlanWhereInput deleteStrategyNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DELETE_STRATEGY_NOT_IN);
        return this;
    }

    public ReplicationPlanWhereInput deleteStrategyNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DELETE_STRATEGY_NOT_IN);
        return this;
    }

    public void setDeleteStrategyNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DELETE_STRATEGY_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DELETE_STRATEGY_NOT_IN);
        }
    }

    public boolean getDeleteStrategyNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DELETE_STRATEGY_NOT_IN);
    }

    public ReplicationPlanWhereInput description(String description) {

        this.description = description;
        return this;
    }

    /**
     * Get description
     *
     * @return description
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ReplicationPlanWhereInput description_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION);
        return this;
    }

    public ReplicationPlanWhereInput description_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION);
        return this;
    }

    public void setDescription_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION);
        }
    }

    public boolean getDescription_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESCRIPTION);
    }

    public ReplicationPlanWhereInput descriptionContains(String descriptionContains) {

        this.descriptionContains = descriptionContains;
        return this;
    }

    /**
     * Get descriptionContains
     *
     * @return descriptionContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDescriptionContains() {
        return descriptionContains;
    }

    public void setDescriptionContains(String descriptionContains) {
        this.descriptionContains = descriptionContains;
    }

    public ReplicationPlanWhereInput descriptionContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_CONTAINS);
        return this;
    }

    public ReplicationPlanWhereInput descriptionContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_CONTAINS);
        return this;
    }

    public void setDescriptionContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_CONTAINS);
        }
    }

    public boolean getDescriptionContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESCRIPTION_CONTAINS);
    }

    public ReplicationPlanWhereInput descriptionEndsWith(String descriptionEndsWith) {

        this.descriptionEndsWith = descriptionEndsWith;
        return this;
    }

    /**
     * Get descriptionEndsWith
     *
     * @return descriptionEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDescriptionEndsWith() {
        return descriptionEndsWith;
    }

    public void setDescriptionEndsWith(String descriptionEndsWith) {
        this.descriptionEndsWith = descriptionEndsWith;
    }

    public ReplicationPlanWhereInput descriptionEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_ENDS_WITH);
        return this;
    }

    public ReplicationPlanWhereInput descriptionEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_ENDS_WITH);
        return this;
    }

    public void setDescriptionEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_ENDS_WITH);
        }
    }

    public boolean getDescriptionEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESCRIPTION_ENDS_WITH);
    }

    public ReplicationPlanWhereInput descriptionGt(String descriptionGt) {

        this.descriptionGt = descriptionGt;
        return this;
    }

    /**
     * Get descriptionGt
     *
     * @return descriptionGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDescriptionGt() {
        return descriptionGt;
    }

    public void setDescriptionGt(String descriptionGt) {
        this.descriptionGt = descriptionGt;
    }

    public ReplicationPlanWhereInput descriptionGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_GT);
        return this;
    }

    public ReplicationPlanWhereInput descriptionGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_GT);
        return this;
    }

    public void setDescriptionGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_GT);
        }
    }

    public boolean getDescriptionGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESCRIPTION_GT);
    }

    public ReplicationPlanWhereInput descriptionGte(String descriptionGte) {

        this.descriptionGte = descriptionGte;
        return this;
    }

    /**
     * Get descriptionGte
     *
     * @return descriptionGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDescriptionGte() {
        return descriptionGte;
    }

    public void setDescriptionGte(String descriptionGte) {
        this.descriptionGte = descriptionGte;
    }

    public ReplicationPlanWhereInput descriptionGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_GTE);
        return this;
    }

    public ReplicationPlanWhereInput descriptionGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_GTE);
        return this;
    }

    public void setDescriptionGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_GTE);
        }
    }

    public boolean getDescriptionGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESCRIPTION_GTE);
    }

    public ReplicationPlanWhereInput descriptionIn(List<String> descriptionIn) {

        this.descriptionIn = descriptionIn;
        return this;
    }

    public ReplicationPlanWhereInput addDescriptionInItem(String descriptionInItem) {
        if (this.descriptionIn == null) {
            this.descriptionIn = new ArrayList<String>();
        }
        this.descriptionIn.add(descriptionInItem);
        return this;
    }

    /**
     * Get descriptionIn
     *
     * @return descriptionIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getDescriptionIn() {
        return descriptionIn;
    }

    public void setDescriptionIn(List<String> descriptionIn) {
        this.descriptionIn = descriptionIn;
    }

    public ReplicationPlanWhereInput descriptionIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_IN);
        return this;
    }

    public ReplicationPlanWhereInput descriptionIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_IN);
        return this;
    }

    public void setDescriptionIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_IN);
        }
    }

    public boolean getDescriptionIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESCRIPTION_IN);
    }

    public ReplicationPlanWhereInput descriptionLt(String descriptionLt) {

        this.descriptionLt = descriptionLt;
        return this;
    }

    /**
     * Get descriptionLt
     *
     * @return descriptionLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDescriptionLt() {
        return descriptionLt;
    }

    public void setDescriptionLt(String descriptionLt) {
        this.descriptionLt = descriptionLt;
    }

    public ReplicationPlanWhereInput descriptionLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_LT);
        return this;
    }

    public ReplicationPlanWhereInput descriptionLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_LT);
        return this;
    }

    public void setDescriptionLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_LT);
        }
    }

    public boolean getDescriptionLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESCRIPTION_LT);
    }

    public ReplicationPlanWhereInput descriptionLte(String descriptionLte) {

        this.descriptionLte = descriptionLte;
        return this;
    }

    /**
     * Get descriptionLte
     *
     * @return descriptionLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDescriptionLte() {
        return descriptionLte;
    }

    public void setDescriptionLte(String descriptionLte) {
        this.descriptionLte = descriptionLte;
    }

    public ReplicationPlanWhereInput descriptionLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_LTE);
        return this;
    }

    public ReplicationPlanWhereInput descriptionLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_LTE);
        return this;
    }

    public void setDescriptionLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_LTE);
        }
    }

    public boolean getDescriptionLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESCRIPTION_LTE);
    }

    public ReplicationPlanWhereInput descriptionNot(String descriptionNot) {

        this.descriptionNot = descriptionNot;
        return this;
    }

    /**
     * Get descriptionNot
     *
     * @return descriptionNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDescriptionNot() {
        return descriptionNot;
    }

    public void setDescriptionNot(String descriptionNot) {
        this.descriptionNot = descriptionNot;
    }

    public ReplicationPlanWhereInput descriptionNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT);
        return this;
    }

    public ReplicationPlanWhereInput descriptionNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_NOT);
        return this;
    }

    public void setDescriptionNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_NOT);
        }
    }

    public boolean getDescriptionNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESCRIPTION_NOT);
    }

    public ReplicationPlanWhereInput descriptionNotContains(String descriptionNotContains) {

        this.descriptionNotContains = descriptionNotContains;
        return this;
    }

    /**
     * Get descriptionNotContains
     *
     * @return descriptionNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDescriptionNotContains() {
        return descriptionNotContains;
    }

    public void setDescriptionNotContains(String descriptionNotContains) {
        this.descriptionNotContains = descriptionNotContains;
    }

    public ReplicationPlanWhereInput descriptionNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_CONTAINS);
        return this;
    }

    public ReplicationPlanWhereInput descriptionNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_NOT_CONTAINS);
        return this;
    }

    public void setDescriptionNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_NOT_CONTAINS);
        }
    }

    public boolean getDescriptionNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESCRIPTION_NOT_CONTAINS);
    }

    public ReplicationPlanWhereInput descriptionNotEndsWith(String descriptionNotEndsWith) {

        this.descriptionNotEndsWith = descriptionNotEndsWith;
        return this;
    }

    /**
     * Get descriptionNotEndsWith
     *
     * @return descriptionNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDescriptionNotEndsWith() {
        return descriptionNotEndsWith;
    }

    public void setDescriptionNotEndsWith(String descriptionNotEndsWith) {
        this.descriptionNotEndsWith = descriptionNotEndsWith;
    }

    public ReplicationPlanWhereInput descriptionNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_ENDS_WITH);
        return this;
    }

    public ReplicationPlanWhereInput descriptionNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_NOT_ENDS_WITH);
        return this;
    }

    public void setDescriptionNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_NOT_ENDS_WITH);
        }
    }

    public boolean getDescriptionNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESCRIPTION_NOT_ENDS_WITH);
    }

    public ReplicationPlanWhereInput descriptionNotIn(List<String> descriptionNotIn) {

        this.descriptionNotIn = descriptionNotIn;
        return this;
    }

    public ReplicationPlanWhereInput addDescriptionNotInItem(String descriptionNotInItem) {
        if (this.descriptionNotIn == null) {
            this.descriptionNotIn = new ArrayList<String>();
        }
        this.descriptionNotIn.add(descriptionNotInItem);
        return this;
    }

    /**
     * Get descriptionNotIn
     *
     * @return descriptionNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getDescriptionNotIn() {
        return descriptionNotIn;
    }

    public void setDescriptionNotIn(List<String> descriptionNotIn) {
        this.descriptionNotIn = descriptionNotIn;
    }

    public ReplicationPlanWhereInput descriptionNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_IN);
        return this;
    }

    public ReplicationPlanWhereInput descriptionNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_NOT_IN);
        return this;
    }

    public void setDescriptionNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_NOT_IN);
        }
    }

    public boolean getDescriptionNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESCRIPTION_NOT_IN);
    }

    public ReplicationPlanWhereInput descriptionNotStartsWith(String descriptionNotStartsWith) {

        this.descriptionNotStartsWith = descriptionNotStartsWith;
        return this;
    }

    /**
     * Get descriptionNotStartsWith
     *
     * @return descriptionNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDescriptionNotStartsWith() {
        return descriptionNotStartsWith;
    }

    public void setDescriptionNotStartsWith(String descriptionNotStartsWith) {
        this.descriptionNotStartsWith = descriptionNotStartsWith;
    }

    public ReplicationPlanWhereInput descriptionNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_STARTS_WITH);
        return this;
    }

    public ReplicationPlanWhereInput descriptionNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_NOT_STARTS_WITH);
        return this;
    }

    public void setDescriptionNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_NOT_STARTS_WITH);
        }
    }

    public boolean getDescriptionNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESCRIPTION_NOT_STARTS_WITH);
    }

    public ReplicationPlanWhereInput descriptionStartsWith(String descriptionStartsWith) {

        this.descriptionStartsWith = descriptionStartsWith;
        return this;
    }

    /**
     * Get descriptionStartsWith
     *
     * @return descriptionStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDescriptionStartsWith() {
        return descriptionStartsWith;
    }

    public void setDescriptionStartsWith(String descriptionStartsWith) {
        this.descriptionStartsWith = descriptionStartsWith;
    }

    public ReplicationPlanWhereInput descriptionStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_STARTS_WITH);
        return this;
    }

    public ReplicationPlanWhereInput descriptionStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_STARTS_WITH);
        return this;
    }

    public void setDescriptionStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_STARTS_WITH);
        }
    }

    public boolean getDescriptionStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESCRIPTION_STARTS_WITH);
    }

    public ReplicationPlanWhereInput ecK(Integer ecK) {

        this.ecK = ecK;
        return this;
    }

    /**
     * Get ecK
     *
     * @return ecK
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getEcK() {
        return ecK;
    }

    public void setEcK(Integer ecK) {
        this.ecK = ecK;
    }

    public ReplicationPlanWhereInput ecK_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EC_K);
        return this;
    }

    public ReplicationPlanWhereInput ecK_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EC_K);
        return this;
    }

    public void setEcK_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EC_K);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EC_K);
        }
    }

    public boolean getEcK_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EC_K);
    }

    public ReplicationPlanWhereInput ecKGt(Integer ecKGt) {

        this.ecKGt = ecKGt;
        return this;
    }

    /**
     * Get ecKGt
     *
     * @return ecKGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getEcKGt() {
        return ecKGt;
    }

    public void setEcKGt(Integer ecKGt) {
        this.ecKGt = ecKGt;
    }

    public ReplicationPlanWhereInput ecKGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EC_K_GT);
        return this;
    }

    public ReplicationPlanWhereInput ecKGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EC_K_GT);
        return this;
    }

    public void setEcKGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EC_K_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EC_K_GT);
        }
    }

    public boolean getEcKGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EC_K_GT);
    }

    public ReplicationPlanWhereInput ecKGte(Integer ecKGte) {

        this.ecKGte = ecKGte;
        return this;
    }

    /**
     * Get ecKGte
     *
     * @return ecKGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getEcKGte() {
        return ecKGte;
    }

    public void setEcKGte(Integer ecKGte) {
        this.ecKGte = ecKGte;
    }

    public ReplicationPlanWhereInput ecKGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EC_K_GTE);
        return this;
    }

    public ReplicationPlanWhereInput ecKGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EC_K_GTE);
        return this;
    }

    public void setEcKGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EC_K_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EC_K_GTE);
        }
    }

    public boolean getEcKGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EC_K_GTE);
    }

    public ReplicationPlanWhereInput ecKIn(List<Integer> ecKIn) {

        this.ecKIn = ecKIn;
        return this;
    }

    public ReplicationPlanWhereInput addEcKInItem(Integer ecKInItem) {
        if (this.ecKIn == null) {
            this.ecKIn = new ArrayList<Integer>();
        }
        this.ecKIn.add(ecKInItem);
        return this;
    }

    /**
     * Get ecKIn
     *
     * @return ecKIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getEcKIn() {
        return ecKIn;
    }

    public void setEcKIn(List<Integer> ecKIn) {
        this.ecKIn = ecKIn;
    }

    public ReplicationPlanWhereInput ecKIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EC_K_IN);
        return this;
    }

    public ReplicationPlanWhereInput ecKIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EC_K_IN);
        return this;
    }

    public void setEcKIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EC_K_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EC_K_IN);
        }
    }

    public boolean getEcKIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EC_K_IN);
    }

    public ReplicationPlanWhereInput ecKLt(Integer ecKLt) {

        this.ecKLt = ecKLt;
        return this;
    }

    /**
     * Get ecKLt
     *
     * @return ecKLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getEcKLt() {
        return ecKLt;
    }

    public void setEcKLt(Integer ecKLt) {
        this.ecKLt = ecKLt;
    }

    public ReplicationPlanWhereInput ecKLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EC_K_LT);
        return this;
    }

    public ReplicationPlanWhereInput ecKLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EC_K_LT);
        return this;
    }

    public void setEcKLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EC_K_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EC_K_LT);
        }
    }

    public boolean getEcKLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EC_K_LT);
    }

    public ReplicationPlanWhereInput ecKLte(Integer ecKLte) {

        this.ecKLte = ecKLte;
        return this;
    }

    /**
     * Get ecKLte
     *
     * @return ecKLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getEcKLte() {
        return ecKLte;
    }

    public void setEcKLte(Integer ecKLte) {
        this.ecKLte = ecKLte;
    }

    public ReplicationPlanWhereInput ecKLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EC_K_LTE);
        return this;
    }

    public ReplicationPlanWhereInput ecKLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EC_K_LTE);
        return this;
    }

    public void setEcKLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EC_K_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EC_K_LTE);
        }
    }

    public boolean getEcKLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EC_K_LTE);
    }

    public ReplicationPlanWhereInput ecKNot(Integer ecKNot) {

        this.ecKNot = ecKNot;
        return this;
    }

    /**
     * Get ecKNot
     *
     * @return ecKNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getEcKNot() {
        return ecKNot;
    }

    public void setEcKNot(Integer ecKNot) {
        this.ecKNot = ecKNot;
    }

    public ReplicationPlanWhereInput ecKNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EC_K_NOT);
        return this;
    }

    public ReplicationPlanWhereInput ecKNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EC_K_NOT);
        return this;
    }

    public void setEcKNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EC_K_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EC_K_NOT);
        }
    }

    public boolean getEcKNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EC_K_NOT);
    }

    public ReplicationPlanWhereInput ecKNotIn(List<Integer> ecKNotIn) {

        this.ecKNotIn = ecKNotIn;
        return this;
    }

    public ReplicationPlanWhereInput addEcKNotInItem(Integer ecKNotInItem) {
        if (this.ecKNotIn == null) {
            this.ecKNotIn = new ArrayList<Integer>();
        }
        this.ecKNotIn.add(ecKNotInItem);
        return this;
    }

    /**
     * Get ecKNotIn
     *
     * @return ecKNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getEcKNotIn() {
        return ecKNotIn;
    }

    public void setEcKNotIn(List<Integer> ecKNotIn) {
        this.ecKNotIn = ecKNotIn;
    }

    public ReplicationPlanWhereInput ecKNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EC_K_NOT_IN);
        return this;
    }

    public ReplicationPlanWhereInput ecKNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EC_K_NOT_IN);
        return this;
    }

    public void setEcKNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EC_K_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EC_K_NOT_IN);
        }
    }

    public boolean getEcKNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EC_K_NOT_IN);
    }

    public ReplicationPlanWhereInput ecM(Integer ecM) {

        this.ecM = ecM;
        return this;
    }

    /**
     * Get ecM
     *
     * @return ecM
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getEcM() {
        return ecM;
    }

    public void setEcM(Integer ecM) {
        this.ecM = ecM;
    }

    public ReplicationPlanWhereInput ecM_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EC_M);
        return this;
    }

    public ReplicationPlanWhereInput ecM_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EC_M);
        return this;
    }

    public void setEcM_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EC_M);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EC_M);
        }
    }

    public boolean getEcM_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EC_M);
    }

    public ReplicationPlanWhereInput ecMGt(Integer ecMGt) {

        this.ecMGt = ecMGt;
        return this;
    }

    /**
     * Get ecMGt
     *
     * @return ecMGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getEcMGt() {
        return ecMGt;
    }

    public void setEcMGt(Integer ecMGt) {
        this.ecMGt = ecMGt;
    }

    public ReplicationPlanWhereInput ecMGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EC_M_GT);
        return this;
    }

    public ReplicationPlanWhereInput ecMGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EC_M_GT);
        return this;
    }

    public void setEcMGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EC_M_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EC_M_GT);
        }
    }

    public boolean getEcMGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EC_M_GT);
    }

    public ReplicationPlanWhereInput ecMGte(Integer ecMGte) {

        this.ecMGte = ecMGte;
        return this;
    }

    /**
     * Get ecMGte
     *
     * @return ecMGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getEcMGte() {
        return ecMGte;
    }

    public void setEcMGte(Integer ecMGte) {
        this.ecMGte = ecMGte;
    }

    public ReplicationPlanWhereInput ecMGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EC_M_GTE);
        return this;
    }

    public ReplicationPlanWhereInput ecMGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EC_M_GTE);
        return this;
    }

    public void setEcMGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EC_M_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EC_M_GTE);
        }
    }

    public boolean getEcMGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EC_M_GTE);
    }

    public ReplicationPlanWhereInput ecMIn(List<Integer> ecMIn) {

        this.ecMIn = ecMIn;
        return this;
    }

    public ReplicationPlanWhereInput addEcMInItem(Integer ecMInItem) {
        if (this.ecMIn == null) {
            this.ecMIn = new ArrayList<Integer>();
        }
        this.ecMIn.add(ecMInItem);
        return this;
    }

    /**
     * Get ecMIn
     *
     * @return ecMIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getEcMIn() {
        return ecMIn;
    }

    public void setEcMIn(List<Integer> ecMIn) {
        this.ecMIn = ecMIn;
    }

    public ReplicationPlanWhereInput ecMIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EC_M_IN);
        return this;
    }

    public ReplicationPlanWhereInput ecMIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EC_M_IN);
        return this;
    }

    public void setEcMIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EC_M_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EC_M_IN);
        }
    }

    public boolean getEcMIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EC_M_IN);
    }

    public ReplicationPlanWhereInput ecMLt(Integer ecMLt) {

        this.ecMLt = ecMLt;
        return this;
    }

    /**
     * Get ecMLt
     *
     * @return ecMLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getEcMLt() {
        return ecMLt;
    }

    public void setEcMLt(Integer ecMLt) {
        this.ecMLt = ecMLt;
    }

    public ReplicationPlanWhereInput ecMLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EC_M_LT);
        return this;
    }

    public ReplicationPlanWhereInput ecMLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EC_M_LT);
        return this;
    }

    public void setEcMLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EC_M_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EC_M_LT);
        }
    }

    public boolean getEcMLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EC_M_LT);
    }

    public ReplicationPlanWhereInput ecMLte(Integer ecMLte) {

        this.ecMLte = ecMLte;
        return this;
    }

    /**
     * Get ecMLte
     *
     * @return ecMLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getEcMLte() {
        return ecMLte;
    }

    public void setEcMLte(Integer ecMLte) {
        this.ecMLte = ecMLte;
    }

    public ReplicationPlanWhereInput ecMLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EC_M_LTE);
        return this;
    }

    public ReplicationPlanWhereInput ecMLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EC_M_LTE);
        return this;
    }

    public void setEcMLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EC_M_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EC_M_LTE);
        }
    }

    public boolean getEcMLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EC_M_LTE);
    }

    public ReplicationPlanWhereInput ecMNot(Integer ecMNot) {

        this.ecMNot = ecMNot;
        return this;
    }

    /**
     * Get ecMNot
     *
     * @return ecMNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getEcMNot() {
        return ecMNot;
    }

    public void setEcMNot(Integer ecMNot) {
        this.ecMNot = ecMNot;
    }

    public ReplicationPlanWhereInput ecMNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EC_M_NOT);
        return this;
    }

    public ReplicationPlanWhereInput ecMNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EC_M_NOT);
        return this;
    }

    public void setEcMNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EC_M_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EC_M_NOT);
        }
    }

    public boolean getEcMNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EC_M_NOT);
    }

    public ReplicationPlanWhereInput ecMNotIn(List<Integer> ecMNotIn) {

        this.ecMNotIn = ecMNotIn;
        return this;
    }

    public ReplicationPlanWhereInput addEcMNotInItem(Integer ecMNotInItem) {
        if (this.ecMNotIn == null) {
            this.ecMNotIn = new ArrayList<Integer>();
        }
        this.ecMNotIn.add(ecMNotInItem);
        return this;
    }

    /**
     * Get ecMNotIn
     *
     * @return ecMNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getEcMNotIn() {
        return ecMNotIn;
    }

    public void setEcMNotIn(List<Integer> ecMNotIn) {
        this.ecMNotIn = ecMNotIn;
    }

    public ReplicationPlanWhereInput ecMNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EC_M_NOT_IN);
        return this;
    }

    public ReplicationPlanWhereInput ecMNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EC_M_NOT_IN);
        return this;
    }

    public void setEcMNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EC_M_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EC_M_NOT_IN);
        }
    }

    public boolean getEcMNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EC_M_NOT_IN);
    }

    public ReplicationPlanWhereInput enableWindow(Boolean enableWindow) {

        this.enableWindow = enableWindow;
        return this;
    }

    /**
     * Get enableWindow
     *
     * @return enableWindow
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getEnableWindow() {
        return enableWindow;
    }

    public void setEnableWindow(Boolean enableWindow) {
        this.enableWindow = enableWindow;
    }

    public ReplicationPlanWhereInput enableWindow_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENABLE_WINDOW);
        return this;
    }

    public ReplicationPlanWhereInput enableWindow_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ENABLE_WINDOW);
        return this;
    }

    public void setEnableWindow_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ENABLE_WINDOW);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ENABLE_WINDOW);
        }
    }

    public boolean getEnableWindow_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ENABLE_WINDOW);
    }

    public ReplicationPlanWhereInput enableWindowNot(Boolean enableWindowNot) {

        this.enableWindowNot = enableWindowNot;
        return this;
    }

    /**
     * Get enableWindowNot
     *
     * @return enableWindowNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getEnableWindowNot() {
        return enableWindowNot;
    }

    public void setEnableWindowNot(Boolean enableWindowNot) {
        this.enableWindowNot = enableWindowNot;
    }

    public ReplicationPlanWhereInput enableWindowNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENABLE_WINDOW_NOT);
        return this;
    }

    public ReplicationPlanWhereInput enableWindowNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ENABLE_WINDOW_NOT);
        return this;
    }

    public void setEnableWindowNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ENABLE_WINDOW_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ENABLE_WINDOW_NOT);
        }
    }

    public boolean getEnableWindowNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ENABLE_WINDOW_NOT);
    }

    public ReplicationPlanWhereInput entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {

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

    public ReplicationPlanWhereInput entityAsyncStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        return this;
    }

    public ReplicationPlanWhereInput entityAsyncStatus_ExplictlyNonNull() {
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

    public ReplicationPlanWhereInput entityAsyncStatusIn(
            List<EntityAsyncStatus> entityAsyncStatusIn) {

        this.entityAsyncStatusIn = entityAsyncStatusIn;
        return this;
    }

    public ReplicationPlanWhereInput addEntityAsyncStatusInItem(
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

    public ReplicationPlanWhereInput entityAsyncStatusIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_IN);
        return this;
    }

    public ReplicationPlanWhereInput entityAsyncStatusIn_ExplictlyNonNull() {
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

    public ReplicationPlanWhereInput entityAsyncStatusNot(EntityAsyncStatus entityAsyncStatusNot) {

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

    public ReplicationPlanWhereInput entityAsyncStatusNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT);
        return this;
    }

    public ReplicationPlanWhereInput entityAsyncStatusNot_ExplictlyNonNull() {
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

    public ReplicationPlanWhereInput entityAsyncStatusNotIn(
            List<EntityAsyncStatus> entityAsyncStatusNotIn) {

        this.entityAsyncStatusNotIn = entityAsyncStatusNotIn;
        return this;
    }

    public ReplicationPlanWhereInput addEntityAsyncStatusNotInItem(
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

    public ReplicationPlanWhereInput entityAsyncStatusNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT_IN);
        return this;
    }

    public ReplicationPlanWhereInput entityAsyncStatusNotIn_ExplictlyNonNull() {
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

    public ReplicationPlanWhereInput externalCloudtower(
            ExternalCloudTowerWhereInput externalCloudtower) {

        this.externalCloudtower = externalCloudtower;
        return this;
    }

    /**
     * Get externalCloudtower
     *
     * @return externalCloudtower
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ExternalCloudTowerWhereInput getExternalCloudtower() {
        return externalCloudtower;
    }

    public void setExternalCloudtower(ExternalCloudTowerWhereInput externalCloudtower) {
        this.externalCloudtower = externalCloudtower;
    }

    public ReplicationPlanWhereInput externalCloudtower_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXTERNAL_CLOUDTOWER);
        return this;
    }

    public ReplicationPlanWhereInput externalCloudtower_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EXTERNAL_CLOUDTOWER);
        return this;
    }

    public void setExternalCloudtower_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EXTERNAL_CLOUDTOWER);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EXTERNAL_CLOUDTOWER);
        }
    }

    public boolean getExternalCloudtower_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EXTERNAL_CLOUDTOWER);
    }

    public ReplicationPlanWhereInput id(String id) {

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

    public ReplicationPlanWhereInput id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public ReplicationPlanWhereInput id_ExplictlyNonNull() {
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

    public ReplicationPlanWhereInput idContains(String idContains) {

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

    public ReplicationPlanWhereInput idContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_CONTAINS);
        return this;
    }

    public ReplicationPlanWhereInput idContains_ExplictlyNonNull() {
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

    public ReplicationPlanWhereInput idEndsWith(String idEndsWith) {

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

    public ReplicationPlanWhereInput idEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_ENDS_WITH);
        return this;
    }

    public ReplicationPlanWhereInput idEndsWith_ExplictlyNonNull() {
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

    public ReplicationPlanWhereInput idGt(String idGt) {

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

    public ReplicationPlanWhereInput idGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GT);
        return this;
    }

    public ReplicationPlanWhereInput idGt_ExplictlyNonNull() {
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

    public ReplicationPlanWhereInput idGte(String idGte) {

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

    public ReplicationPlanWhereInput idGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GTE);
        return this;
    }

    public ReplicationPlanWhereInput idGte_ExplictlyNonNull() {
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

    public ReplicationPlanWhereInput idIn(List<String> idIn) {

        this.idIn = idIn;
        return this;
    }

    public ReplicationPlanWhereInput addIdInItem(String idInItem) {
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

    public ReplicationPlanWhereInput idIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_IN);
        return this;
    }

    public ReplicationPlanWhereInput idIn_ExplictlyNonNull() {
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

    public ReplicationPlanWhereInput idLt(String idLt) {

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

    public ReplicationPlanWhereInput idLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LT);
        return this;
    }

    public ReplicationPlanWhereInput idLt_ExplictlyNonNull() {
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

    public ReplicationPlanWhereInput idLte(String idLte) {

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

    public ReplicationPlanWhereInput idLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LTE);
        return this;
    }

    public ReplicationPlanWhereInput idLte_ExplictlyNonNull() {
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

    public ReplicationPlanWhereInput idNot(String idNot) {

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

    public ReplicationPlanWhereInput idNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT);
        return this;
    }

    public ReplicationPlanWhereInput idNot_ExplictlyNonNull() {
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

    public ReplicationPlanWhereInput idNotContains(String idNotContains) {

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

    public ReplicationPlanWhereInput idNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_CONTAINS);
        return this;
    }

    public ReplicationPlanWhereInput idNotContains_ExplictlyNonNull() {
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

    public ReplicationPlanWhereInput idNotEndsWith(String idNotEndsWith) {

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

    public ReplicationPlanWhereInput idNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
        return this;
    }

    public ReplicationPlanWhereInput idNotEndsWith_ExplictlyNonNull() {
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

    public ReplicationPlanWhereInput idNotIn(List<String> idNotIn) {

        this.idNotIn = idNotIn;
        return this;
    }

    public ReplicationPlanWhereInput addIdNotInItem(String idNotInItem) {
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

    public ReplicationPlanWhereInput idNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_IN);
        return this;
    }

    public ReplicationPlanWhereInput idNotIn_ExplictlyNonNull() {
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

    public ReplicationPlanWhereInput idNotStartsWith(String idNotStartsWith) {

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

    public ReplicationPlanWhereInput idNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
        return this;
    }

    public ReplicationPlanWhereInput idNotStartsWith_ExplictlyNonNull() {
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

    public ReplicationPlanWhereInput idStartsWith(String idStartsWith) {

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

    public ReplicationPlanWhereInput idStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_STARTS_WITH);
        return this;
    }

    public ReplicationPlanWhereInput idStartsWith_ExplictlyNonNull() {
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

    public ReplicationPlanWhereInput inbound(Boolean inbound) {

        this.inbound = inbound;
        return this;
    }

    /**
     * Get inbound
     *
     * @return inbound
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getInbound() {
        return inbound;
    }

    public void setInbound(Boolean inbound) {
        this.inbound = inbound;
    }

    public ReplicationPlanWhereInput inbound_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INBOUND);
        return this;
    }

    public ReplicationPlanWhereInput inbound_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INBOUND);
        return this;
    }

    public void setInbound_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INBOUND);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INBOUND);
        }
    }

    public boolean getInbound_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INBOUND);
    }

    public ReplicationPlanWhereInput inboundNot(Boolean inboundNot) {

        this.inboundNot = inboundNot;
        return this;
    }

    /**
     * Get inboundNot
     *
     * @return inboundNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getInboundNot() {
        return inboundNot;
    }

    public void setInboundNot(Boolean inboundNot) {
        this.inboundNot = inboundNot;
    }

    public ReplicationPlanWhereInput inboundNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INBOUND_NOT);
        return this;
    }

    public ReplicationPlanWhereInput inboundNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INBOUND_NOT);
        return this;
    }

    public void setInboundNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INBOUND_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INBOUND_NOT);
        }
    }

    public boolean getInboundNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INBOUND_NOT);
    }

    public ReplicationPlanWhereInput interval(Integer interval) {

        this.interval = interval;
        return this;
    }

    /**
     * Get interval
     *
     * @return interval
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getInterval() {
        return interval;
    }

    public void setInterval(Integer interval) {
        this.interval = interval;
    }

    public ReplicationPlanWhereInput interval_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INTERVAL);
        return this;
    }

    public ReplicationPlanWhereInput interval_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INTERVAL);
        return this;
    }

    public void setInterval_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INTERVAL);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INTERVAL);
        }
    }

    public boolean getInterval_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INTERVAL);
    }

    public ReplicationPlanWhereInput intervalGt(Integer intervalGt) {

        this.intervalGt = intervalGt;
        return this;
    }

    /**
     * Get intervalGt
     *
     * @return intervalGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getIntervalGt() {
        return intervalGt;
    }

    public void setIntervalGt(Integer intervalGt) {
        this.intervalGt = intervalGt;
    }

    public ReplicationPlanWhereInput intervalGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INTERVAL_GT);
        return this;
    }

    public ReplicationPlanWhereInput intervalGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INTERVAL_GT);
        return this;
    }

    public void setIntervalGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INTERVAL_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INTERVAL_GT);
        }
    }

    public boolean getIntervalGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INTERVAL_GT);
    }

    public ReplicationPlanWhereInput intervalGte(Integer intervalGte) {

        this.intervalGte = intervalGte;
        return this;
    }

    /**
     * Get intervalGte
     *
     * @return intervalGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getIntervalGte() {
        return intervalGte;
    }

    public void setIntervalGte(Integer intervalGte) {
        this.intervalGte = intervalGte;
    }

    public ReplicationPlanWhereInput intervalGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INTERVAL_GTE);
        return this;
    }

    public ReplicationPlanWhereInput intervalGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INTERVAL_GTE);
        return this;
    }

    public void setIntervalGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INTERVAL_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INTERVAL_GTE);
        }
    }

    public boolean getIntervalGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INTERVAL_GTE);
    }

    public ReplicationPlanWhereInput intervalIn(List<Integer> intervalIn) {

        this.intervalIn = intervalIn;
        return this;
    }

    public ReplicationPlanWhereInput addIntervalInItem(Integer intervalInItem) {
        if (this.intervalIn == null) {
            this.intervalIn = new ArrayList<Integer>();
        }
        this.intervalIn.add(intervalInItem);
        return this;
    }

    /**
     * Get intervalIn
     *
     * @return intervalIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getIntervalIn() {
        return intervalIn;
    }

    public void setIntervalIn(List<Integer> intervalIn) {
        this.intervalIn = intervalIn;
    }

    public ReplicationPlanWhereInput intervalIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INTERVAL_IN);
        return this;
    }

    public ReplicationPlanWhereInput intervalIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INTERVAL_IN);
        return this;
    }

    public void setIntervalIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INTERVAL_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INTERVAL_IN);
        }
    }

    public boolean getIntervalIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INTERVAL_IN);
    }

    public ReplicationPlanWhereInput intervalLt(Integer intervalLt) {

        this.intervalLt = intervalLt;
        return this;
    }

    /**
     * Get intervalLt
     *
     * @return intervalLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getIntervalLt() {
        return intervalLt;
    }

    public void setIntervalLt(Integer intervalLt) {
        this.intervalLt = intervalLt;
    }

    public ReplicationPlanWhereInput intervalLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INTERVAL_LT);
        return this;
    }

    public ReplicationPlanWhereInput intervalLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INTERVAL_LT);
        return this;
    }

    public void setIntervalLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INTERVAL_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INTERVAL_LT);
        }
    }

    public boolean getIntervalLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INTERVAL_LT);
    }

    public ReplicationPlanWhereInput intervalLte(Integer intervalLte) {

        this.intervalLte = intervalLte;
        return this;
    }

    /**
     * Get intervalLte
     *
     * @return intervalLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getIntervalLte() {
        return intervalLte;
    }

    public void setIntervalLte(Integer intervalLte) {
        this.intervalLte = intervalLte;
    }

    public ReplicationPlanWhereInput intervalLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INTERVAL_LTE);
        return this;
    }

    public ReplicationPlanWhereInput intervalLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INTERVAL_LTE);
        return this;
    }

    public void setIntervalLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INTERVAL_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INTERVAL_LTE);
        }
    }

    public boolean getIntervalLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INTERVAL_LTE);
    }

    public ReplicationPlanWhereInput intervalNot(Integer intervalNot) {

        this.intervalNot = intervalNot;
        return this;
    }

    /**
     * Get intervalNot
     *
     * @return intervalNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getIntervalNot() {
        return intervalNot;
    }

    public void setIntervalNot(Integer intervalNot) {
        this.intervalNot = intervalNot;
    }

    public ReplicationPlanWhereInput intervalNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INTERVAL_NOT);
        return this;
    }

    public ReplicationPlanWhereInput intervalNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INTERVAL_NOT);
        return this;
    }

    public void setIntervalNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INTERVAL_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INTERVAL_NOT);
        }
    }

    public boolean getIntervalNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INTERVAL_NOT);
    }

    public ReplicationPlanWhereInput intervalNotIn(List<Integer> intervalNotIn) {

        this.intervalNotIn = intervalNotIn;
        return this;
    }

    public ReplicationPlanWhereInput addIntervalNotInItem(Integer intervalNotInItem) {
        if (this.intervalNotIn == null) {
            this.intervalNotIn = new ArrayList<Integer>();
        }
        this.intervalNotIn.add(intervalNotInItem);
        return this;
    }

    /**
     * Get intervalNotIn
     *
     * @return intervalNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getIntervalNotIn() {
        return intervalNotIn;
    }

    public void setIntervalNotIn(List<Integer> intervalNotIn) {
        this.intervalNotIn = intervalNotIn;
    }

    public ReplicationPlanWhereInput intervalNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INTERVAL_NOT_IN);
        return this;
    }

    public ReplicationPlanWhereInput intervalNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INTERVAL_NOT_IN);
        return this;
    }

    public void setIntervalNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INTERVAL_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INTERVAL_NOT_IN);
        }
    }

    public boolean getIntervalNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INTERVAL_NOT_IN);
    }

    public ReplicationPlanWhereInput iscsiLunsEvery(IscsiLunWhereInput iscsiLunsEvery) {

        this.iscsiLunsEvery = iscsiLunsEvery;
        return this;
    }

    /**
     * Get iscsiLunsEvery
     *
     * @return iscsiLunsEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public IscsiLunWhereInput getIscsiLunsEvery() {
        return iscsiLunsEvery;
    }

    public void setIscsiLunsEvery(IscsiLunWhereInput iscsiLunsEvery) {
        this.iscsiLunsEvery = iscsiLunsEvery;
    }

    public ReplicationPlanWhereInput iscsiLunsEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_LUNS_EVERY);
        return this;
    }

    public ReplicationPlanWhereInput iscsiLunsEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_LUNS_EVERY);
        return this;
    }

    public void setIscsiLunsEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_LUNS_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_LUNS_EVERY);
        }
    }

    public boolean getIscsiLunsEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_LUNS_EVERY);
    }

    public ReplicationPlanWhereInput iscsiLunsNone(IscsiLunWhereInput iscsiLunsNone) {

        this.iscsiLunsNone = iscsiLunsNone;
        return this;
    }

    /**
     * Get iscsiLunsNone
     *
     * @return iscsiLunsNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public IscsiLunWhereInput getIscsiLunsNone() {
        return iscsiLunsNone;
    }

    public void setIscsiLunsNone(IscsiLunWhereInput iscsiLunsNone) {
        this.iscsiLunsNone = iscsiLunsNone;
    }

    public ReplicationPlanWhereInput iscsiLunsNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_LUNS_NONE);
        return this;
    }

    public ReplicationPlanWhereInput iscsiLunsNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_LUNS_NONE);
        return this;
    }

    public void setIscsiLunsNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_LUNS_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_LUNS_NONE);
        }
    }

    public boolean getIscsiLunsNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_LUNS_NONE);
    }

    public ReplicationPlanWhereInput iscsiLunsSome(IscsiLunWhereInput iscsiLunsSome) {

        this.iscsiLunsSome = iscsiLunsSome;
        return this;
    }

    /**
     * Get iscsiLunsSome
     *
     * @return iscsiLunsSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public IscsiLunWhereInput getIscsiLunsSome() {
        return iscsiLunsSome;
    }

    public void setIscsiLunsSome(IscsiLunWhereInput iscsiLunsSome) {
        this.iscsiLunsSome = iscsiLunsSome;
    }

    public ReplicationPlanWhereInput iscsiLunsSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_LUNS_SOME);
        return this;
    }

    public ReplicationPlanWhereInput iscsiLunsSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_LUNS_SOME);
        return this;
    }

    public void setIscsiLunsSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_LUNS_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_LUNS_SOME);
        }
    }

    public boolean getIscsiLunsSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_LUNS_SOME);
    }

    public ReplicationPlanWhereInput keepMacAddress(Boolean keepMacAddress) {

        this.keepMacAddress = keepMacAddress;
        return this;
    }

    /**
     * Get keepMacAddress
     *
     * @return keepMacAddress
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getKeepMacAddress() {
        return keepMacAddress;
    }

    public void setKeepMacAddress(Boolean keepMacAddress) {
        this.keepMacAddress = keepMacAddress;
    }

    public ReplicationPlanWhereInput keepMacAddress_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KEEP_MAC_ADDRESS);
        return this;
    }

    public ReplicationPlanWhereInput keepMacAddress_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_KEEP_MAC_ADDRESS);
        return this;
    }

    public void setKeepMacAddress_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_KEEP_MAC_ADDRESS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_KEEP_MAC_ADDRESS);
        }
    }

    public boolean getKeepMacAddress_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_KEEP_MAC_ADDRESS);
    }

    public ReplicationPlanWhereInput keepMacAddressNot(Boolean keepMacAddressNot) {

        this.keepMacAddressNot = keepMacAddressNot;
        return this;
    }

    /**
     * Get keepMacAddressNot
     *
     * @return keepMacAddressNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getKeepMacAddressNot() {
        return keepMacAddressNot;
    }

    public void setKeepMacAddressNot(Boolean keepMacAddressNot) {
        this.keepMacAddressNot = keepMacAddressNot;
    }

    public ReplicationPlanWhereInput keepMacAddressNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KEEP_MAC_ADDRESS_NOT);
        return this;
    }

    public ReplicationPlanWhereInput keepMacAddressNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_KEEP_MAC_ADDRESS_NOT);
        return this;
    }

    public void setKeepMacAddressNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_KEEP_MAC_ADDRESS_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_KEEP_MAC_ADDRESS_NOT);
        }
    }

    public boolean getKeepMacAddressNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_KEEP_MAC_ADDRESS_NOT);
    }

    public ReplicationPlanWhereInput keepPolicy(BackupPlanKeepPolicy keepPolicy) {

        this.keepPolicy = keepPolicy;
        return this;
    }

    /**
     * Get keepPolicy
     *
     * @return keepPolicy
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public BackupPlanKeepPolicy getKeepPolicy() {
        return keepPolicy;
    }

    public void setKeepPolicy(BackupPlanKeepPolicy keepPolicy) {
        this.keepPolicy = keepPolicy;
    }

    public ReplicationPlanWhereInput keepPolicy_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KEEP_POLICY);
        return this;
    }

    public ReplicationPlanWhereInput keepPolicy_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_KEEP_POLICY);
        return this;
    }

    public void setKeepPolicy_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_KEEP_POLICY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_KEEP_POLICY);
        }
    }

    public boolean getKeepPolicy_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_KEEP_POLICY);
    }

    public ReplicationPlanWhereInput keepPolicyIn(List<BackupPlanKeepPolicy> keepPolicyIn) {

        this.keepPolicyIn = keepPolicyIn;
        return this;
    }

    public ReplicationPlanWhereInput addKeepPolicyInItem(BackupPlanKeepPolicy keepPolicyInItem) {
        if (this.keepPolicyIn == null) {
            this.keepPolicyIn = new ArrayList<BackupPlanKeepPolicy>();
        }
        this.keepPolicyIn.add(keepPolicyInItem);
        return this;
    }

    /**
     * Get keepPolicyIn
     *
     * @return keepPolicyIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<BackupPlanKeepPolicy> getKeepPolicyIn() {
        return keepPolicyIn;
    }

    public void setKeepPolicyIn(List<BackupPlanKeepPolicy> keepPolicyIn) {
        this.keepPolicyIn = keepPolicyIn;
    }

    public ReplicationPlanWhereInput keepPolicyIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KEEP_POLICY_IN);
        return this;
    }

    public ReplicationPlanWhereInput keepPolicyIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_KEEP_POLICY_IN);
        return this;
    }

    public void setKeepPolicyIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_KEEP_POLICY_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_KEEP_POLICY_IN);
        }
    }

    public boolean getKeepPolicyIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_KEEP_POLICY_IN);
    }

    public ReplicationPlanWhereInput keepPolicyNot(BackupPlanKeepPolicy keepPolicyNot) {

        this.keepPolicyNot = keepPolicyNot;
        return this;
    }

    /**
     * Get keepPolicyNot
     *
     * @return keepPolicyNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public BackupPlanKeepPolicy getKeepPolicyNot() {
        return keepPolicyNot;
    }

    public void setKeepPolicyNot(BackupPlanKeepPolicy keepPolicyNot) {
        this.keepPolicyNot = keepPolicyNot;
    }

    public ReplicationPlanWhereInput keepPolicyNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KEEP_POLICY_NOT);
        return this;
    }

    public ReplicationPlanWhereInput keepPolicyNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_KEEP_POLICY_NOT);
        return this;
    }

    public void setKeepPolicyNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_KEEP_POLICY_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_KEEP_POLICY_NOT);
        }
    }

    public boolean getKeepPolicyNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_KEEP_POLICY_NOT);
    }

    public ReplicationPlanWhereInput keepPolicyNotIn(List<BackupPlanKeepPolicy> keepPolicyNotIn) {

        this.keepPolicyNotIn = keepPolicyNotIn;
        return this;
    }

    public ReplicationPlanWhereInput addKeepPolicyNotInItem(
            BackupPlanKeepPolicy keepPolicyNotInItem) {
        if (this.keepPolicyNotIn == null) {
            this.keepPolicyNotIn = new ArrayList<BackupPlanKeepPolicy>();
        }
        this.keepPolicyNotIn.add(keepPolicyNotInItem);
        return this;
    }

    /**
     * Get keepPolicyNotIn
     *
     * @return keepPolicyNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<BackupPlanKeepPolicy> getKeepPolicyNotIn() {
        return keepPolicyNotIn;
    }

    public void setKeepPolicyNotIn(List<BackupPlanKeepPolicy> keepPolicyNotIn) {
        this.keepPolicyNotIn = keepPolicyNotIn;
    }

    public ReplicationPlanWhereInput keepPolicyNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KEEP_POLICY_NOT_IN);
        return this;
    }

    public ReplicationPlanWhereInput keepPolicyNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_KEEP_POLICY_NOT_IN);
        return this;
    }

    public void setKeepPolicyNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_KEEP_POLICY_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_KEEP_POLICY_NOT_IN);
        }
    }

    public boolean getKeepPolicyNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_KEEP_POLICY_NOT_IN);
    }

    public ReplicationPlanWhereInput keepPolicyValue(Integer keepPolicyValue) {

        this.keepPolicyValue = keepPolicyValue;
        return this;
    }

    /**
     * Get keepPolicyValue
     *
     * @return keepPolicyValue
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getKeepPolicyValue() {
        return keepPolicyValue;
    }

    public void setKeepPolicyValue(Integer keepPolicyValue) {
        this.keepPolicyValue = keepPolicyValue;
    }

    public ReplicationPlanWhereInput keepPolicyValue_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KEEP_POLICY_VALUE);
        return this;
    }

    public ReplicationPlanWhereInput keepPolicyValue_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_KEEP_POLICY_VALUE);
        return this;
    }

    public void setKeepPolicyValue_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_KEEP_POLICY_VALUE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_KEEP_POLICY_VALUE);
        }
    }

    public boolean getKeepPolicyValue_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_KEEP_POLICY_VALUE);
    }

    public ReplicationPlanWhereInput keepPolicyValueGt(Integer keepPolicyValueGt) {

        this.keepPolicyValueGt = keepPolicyValueGt;
        return this;
    }

    /**
     * Get keepPolicyValueGt
     *
     * @return keepPolicyValueGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getKeepPolicyValueGt() {
        return keepPolicyValueGt;
    }

    public void setKeepPolicyValueGt(Integer keepPolicyValueGt) {
        this.keepPolicyValueGt = keepPolicyValueGt;
    }

    public ReplicationPlanWhereInput keepPolicyValueGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KEEP_POLICY_VALUE_GT);
        return this;
    }

    public ReplicationPlanWhereInput keepPolicyValueGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_KEEP_POLICY_VALUE_GT);
        return this;
    }

    public void setKeepPolicyValueGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_KEEP_POLICY_VALUE_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_KEEP_POLICY_VALUE_GT);
        }
    }

    public boolean getKeepPolicyValueGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_KEEP_POLICY_VALUE_GT);
    }

    public ReplicationPlanWhereInput keepPolicyValueGte(Integer keepPolicyValueGte) {

        this.keepPolicyValueGte = keepPolicyValueGte;
        return this;
    }

    /**
     * Get keepPolicyValueGte
     *
     * @return keepPolicyValueGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getKeepPolicyValueGte() {
        return keepPolicyValueGte;
    }

    public void setKeepPolicyValueGte(Integer keepPolicyValueGte) {
        this.keepPolicyValueGte = keepPolicyValueGte;
    }

    public ReplicationPlanWhereInput keepPolicyValueGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KEEP_POLICY_VALUE_GTE);
        return this;
    }

    public ReplicationPlanWhereInput keepPolicyValueGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_KEEP_POLICY_VALUE_GTE);
        return this;
    }

    public void setKeepPolicyValueGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_KEEP_POLICY_VALUE_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_KEEP_POLICY_VALUE_GTE);
        }
    }

    public boolean getKeepPolicyValueGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_KEEP_POLICY_VALUE_GTE);
    }

    public ReplicationPlanWhereInput keepPolicyValueIn(List<Integer> keepPolicyValueIn) {

        this.keepPolicyValueIn = keepPolicyValueIn;
        return this;
    }

    public ReplicationPlanWhereInput addKeepPolicyValueInItem(Integer keepPolicyValueInItem) {
        if (this.keepPolicyValueIn == null) {
            this.keepPolicyValueIn = new ArrayList<Integer>();
        }
        this.keepPolicyValueIn.add(keepPolicyValueInItem);
        return this;
    }

    /**
     * Get keepPolicyValueIn
     *
     * @return keepPolicyValueIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getKeepPolicyValueIn() {
        return keepPolicyValueIn;
    }

    public void setKeepPolicyValueIn(List<Integer> keepPolicyValueIn) {
        this.keepPolicyValueIn = keepPolicyValueIn;
    }

    public ReplicationPlanWhereInput keepPolicyValueIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KEEP_POLICY_VALUE_IN);
        return this;
    }

    public ReplicationPlanWhereInput keepPolicyValueIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_KEEP_POLICY_VALUE_IN);
        return this;
    }

    public void setKeepPolicyValueIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_KEEP_POLICY_VALUE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_KEEP_POLICY_VALUE_IN);
        }
    }

    public boolean getKeepPolicyValueIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_KEEP_POLICY_VALUE_IN);
    }

    public ReplicationPlanWhereInput keepPolicyValueLt(Integer keepPolicyValueLt) {

        this.keepPolicyValueLt = keepPolicyValueLt;
        return this;
    }

    /**
     * Get keepPolicyValueLt
     *
     * @return keepPolicyValueLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getKeepPolicyValueLt() {
        return keepPolicyValueLt;
    }

    public void setKeepPolicyValueLt(Integer keepPolicyValueLt) {
        this.keepPolicyValueLt = keepPolicyValueLt;
    }

    public ReplicationPlanWhereInput keepPolicyValueLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KEEP_POLICY_VALUE_LT);
        return this;
    }

    public ReplicationPlanWhereInput keepPolicyValueLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_KEEP_POLICY_VALUE_LT);
        return this;
    }

    public void setKeepPolicyValueLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_KEEP_POLICY_VALUE_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_KEEP_POLICY_VALUE_LT);
        }
    }

    public boolean getKeepPolicyValueLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_KEEP_POLICY_VALUE_LT);
    }

    public ReplicationPlanWhereInput keepPolicyValueLte(Integer keepPolicyValueLte) {

        this.keepPolicyValueLte = keepPolicyValueLte;
        return this;
    }

    /**
     * Get keepPolicyValueLte
     *
     * @return keepPolicyValueLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getKeepPolicyValueLte() {
        return keepPolicyValueLte;
    }

    public void setKeepPolicyValueLte(Integer keepPolicyValueLte) {
        this.keepPolicyValueLte = keepPolicyValueLte;
    }

    public ReplicationPlanWhereInput keepPolicyValueLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KEEP_POLICY_VALUE_LTE);
        return this;
    }

    public ReplicationPlanWhereInput keepPolicyValueLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_KEEP_POLICY_VALUE_LTE);
        return this;
    }

    public void setKeepPolicyValueLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_KEEP_POLICY_VALUE_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_KEEP_POLICY_VALUE_LTE);
        }
    }

    public boolean getKeepPolicyValueLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_KEEP_POLICY_VALUE_LTE);
    }

    public ReplicationPlanWhereInput keepPolicyValueNot(Integer keepPolicyValueNot) {

        this.keepPolicyValueNot = keepPolicyValueNot;
        return this;
    }

    /**
     * Get keepPolicyValueNot
     *
     * @return keepPolicyValueNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getKeepPolicyValueNot() {
        return keepPolicyValueNot;
    }

    public void setKeepPolicyValueNot(Integer keepPolicyValueNot) {
        this.keepPolicyValueNot = keepPolicyValueNot;
    }

    public ReplicationPlanWhereInput keepPolicyValueNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KEEP_POLICY_VALUE_NOT);
        return this;
    }

    public ReplicationPlanWhereInput keepPolicyValueNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_KEEP_POLICY_VALUE_NOT);
        return this;
    }

    public void setKeepPolicyValueNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_KEEP_POLICY_VALUE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_KEEP_POLICY_VALUE_NOT);
        }
    }

    public boolean getKeepPolicyValueNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_KEEP_POLICY_VALUE_NOT);
    }

    public ReplicationPlanWhereInput keepPolicyValueNotIn(List<Integer> keepPolicyValueNotIn) {

        this.keepPolicyValueNotIn = keepPolicyValueNotIn;
        return this;
    }

    public ReplicationPlanWhereInput addKeepPolicyValueNotInItem(Integer keepPolicyValueNotInItem) {
        if (this.keepPolicyValueNotIn == null) {
            this.keepPolicyValueNotIn = new ArrayList<Integer>();
        }
        this.keepPolicyValueNotIn.add(keepPolicyValueNotInItem);
        return this;
    }

    /**
     * Get keepPolicyValueNotIn
     *
     * @return keepPolicyValueNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getKeepPolicyValueNotIn() {
        return keepPolicyValueNotIn;
    }

    public void setKeepPolicyValueNotIn(List<Integer> keepPolicyValueNotIn) {
        this.keepPolicyValueNotIn = keepPolicyValueNotIn;
    }

    public ReplicationPlanWhereInput keepPolicyValueNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KEEP_POLICY_VALUE_NOT_IN);
        return this;
    }

    public ReplicationPlanWhereInput keepPolicyValueNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_KEEP_POLICY_VALUE_NOT_IN);
        return this;
    }

    public void setKeepPolicyValueNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_KEEP_POLICY_VALUE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_KEEP_POLICY_VALUE_NOT_IN);
        }
    }

    public boolean getKeepPolicyValueNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_KEEP_POLICY_VALUE_NOT_IN);
    }

    public ReplicationPlanWhereInput lastExecuteStatus(
            BackupPlanExecutionStatus lastExecuteStatus) {

        this.lastExecuteStatus = lastExecuteStatus;
        return this;
    }

    /**
     * Get lastExecuteStatus
     *
     * @return lastExecuteStatus
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public BackupPlanExecutionStatus getLastExecuteStatus() {
        return lastExecuteStatus;
    }

    public void setLastExecuteStatus(BackupPlanExecutionStatus lastExecuteStatus) {
        this.lastExecuteStatus = lastExecuteStatus;
    }

    public ReplicationPlanWhereInput lastExecuteStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_STATUS);
        return this;
    }

    public ReplicationPlanWhereInput lastExecuteStatus_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTE_STATUS);
        return this;
    }

    public void setLastExecuteStatus_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_STATUS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTE_STATUS);
        }
    }

    public boolean getLastExecuteStatus_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LAST_EXECUTE_STATUS);
    }

    public ReplicationPlanWhereInput lastExecuteStatusIn(
            List<BackupPlanExecutionStatus> lastExecuteStatusIn) {

        this.lastExecuteStatusIn = lastExecuteStatusIn;
        return this;
    }

    public ReplicationPlanWhereInput addLastExecuteStatusInItem(
            BackupPlanExecutionStatus lastExecuteStatusInItem) {
        if (this.lastExecuteStatusIn == null) {
            this.lastExecuteStatusIn = new ArrayList<BackupPlanExecutionStatus>();
        }
        this.lastExecuteStatusIn.add(lastExecuteStatusInItem);
        return this;
    }

    /**
     * Get lastExecuteStatusIn
     *
     * @return lastExecuteStatusIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<BackupPlanExecutionStatus> getLastExecuteStatusIn() {
        return lastExecuteStatusIn;
    }

    public void setLastExecuteStatusIn(List<BackupPlanExecutionStatus> lastExecuteStatusIn) {
        this.lastExecuteStatusIn = lastExecuteStatusIn;
    }

    public ReplicationPlanWhereInput lastExecuteStatusIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_STATUS_IN);
        return this;
    }

    public ReplicationPlanWhereInput lastExecuteStatusIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTE_STATUS_IN);
        return this;
    }

    public void setLastExecuteStatusIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_STATUS_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTE_STATUS_IN);
        }
    }

    public boolean getLastExecuteStatusIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LAST_EXECUTE_STATUS_IN);
    }

    public ReplicationPlanWhereInput lastExecuteStatusMessage(String lastExecuteStatusMessage) {

        this.lastExecuteStatusMessage = lastExecuteStatusMessage;
        return this;
    }

    /**
     * Get lastExecuteStatusMessage
     *
     * @return lastExecuteStatusMessage
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLastExecuteStatusMessage() {
        return lastExecuteStatusMessage;
    }

    public void setLastExecuteStatusMessage(String lastExecuteStatusMessage) {
        this.lastExecuteStatusMessage = lastExecuteStatusMessage;
    }

    public ReplicationPlanWhereInput lastExecuteStatusMessage_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_STATUS_MESSAGE);
        return this;
    }

    public ReplicationPlanWhereInput lastExecuteStatusMessage_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTE_STATUS_MESSAGE);
        return this;
    }

    public void setLastExecuteStatusMessage_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_STATUS_MESSAGE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTE_STATUS_MESSAGE);
        }
    }

    public boolean getLastExecuteStatusMessage_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LAST_EXECUTE_STATUS_MESSAGE);
    }

    public ReplicationPlanWhereInput lastExecuteStatusMessageContains(
            String lastExecuteStatusMessageContains) {

        this.lastExecuteStatusMessageContains = lastExecuteStatusMessageContains;
        return this;
    }

    /**
     * Get lastExecuteStatusMessageContains
     *
     * @return lastExecuteStatusMessageContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLastExecuteStatusMessageContains() {
        return lastExecuteStatusMessageContains;
    }

    public void setLastExecuteStatusMessageContains(String lastExecuteStatusMessageContains) {
        this.lastExecuteStatusMessageContains = lastExecuteStatusMessageContains;
    }

    public ReplicationPlanWhereInput lastExecuteStatusMessageContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_STATUS_MESSAGE_CONTAINS);
        return this;
    }

    public ReplicationPlanWhereInput lastExecuteStatusMessageContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTE_STATUS_MESSAGE_CONTAINS);
        return this;
    }

    public void setLastExecuteStatusMessageContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_STATUS_MESSAGE_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTE_STATUS_MESSAGE_CONTAINS);
        }
    }

    public boolean getLastExecuteStatusMessageContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LAST_EXECUTE_STATUS_MESSAGE_CONTAINS);
    }

    public ReplicationPlanWhereInput lastExecuteStatusMessageEndsWith(
            String lastExecuteStatusMessageEndsWith) {

        this.lastExecuteStatusMessageEndsWith = lastExecuteStatusMessageEndsWith;
        return this;
    }

    /**
     * Get lastExecuteStatusMessageEndsWith
     *
     * @return lastExecuteStatusMessageEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLastExecuteStatusMessageEndsWith() {
        return lastExecuteStatusMessageEndsWith;
    }

    public void setLastExecuteStatusMessageEndsWith(String lastExecuteStatusMessageEndsWith) {
        this.lastExecuteStatusMessageEndsWith = lastExecuteStatusMessageEndsWith;
    }

    public ReplicationPlanWhereInput lastExecuteStatusMessageEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_STATUS_MESSAGE_ENDS_WITH);
        return this;
    }

    public ReplicationPlanWhereInput lastExecuteStatusMessageEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTE_STATUS_MESSAGE_ENDS_WITH);
        return this;
    }

    public void setLastExecuteStatusMessageEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_STATUS_MESSAGE_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTE_STATUS_MESSAGE_ENDS_WITH);
        }
    }

    public boolean getLastExecuteStatusMessageEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LAST_EXECUTE_STATUS_MESSAGE_ENDS_WITH);
    }

    public ReplicationPlanWhereInput lastExecuteStatusMessageGt(String lastExecuteStatusMessageGt) {

        this.lastExecuteStatusMessageGt = lastExecuteStatusMessageGt;
        return this;
    }

    /**
     * Get lastExecuteStatusMessageGt
     *
     * @return lastExecuteStatusMessageGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLastExecuteStatusMessageGt() {
        return lastExecuteStatusMessageGt;
    }

    public void setLastExecuteStatusMessageGt(String lastExecuteStatusMessageGt) {
        this.lastExecuteStatusMessageGt = lastExecuteStatusMessageGt;
    }

    public ReplicationPlanWhereInput lastExecuteStatusMessageGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_STATUS_MESSAGE_GT);
        return this;
    }

    public ReplicationPlanWhereInput lastExecuteStatusMessageGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTE_STATUS_MESSAGE_GT);
        return this;
    }

    public void setLastExecuteStatusMessageGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_STATUS_MESSAGE_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTE_STATUS_MESSAGE_GT);
        }
    }

    public boolean getLastExecuteStatusMessageGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LAST_EXECUTE_STATUS_MESSAGE_GT);
    }

    public ReplicationPlanWhereInput lastExecuteStatusMessageGte(
            String lastExecuteStatusMessageGte) {

        this.lastExecuteStatusMessageGte = lastExecuteStatusMessageGte;
        return this;
    }

    /**
     * Get lastExecuteStatusMessageGte
     *
     * @return lastExecuteStatusMessageGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLastExecuteStatusMessageGte() {
        return lastExecuteStatusMessageGte;
    }

    public void setLastExecuteStatusMessageGte(String lastExecuteStatusMessageGte) {
        this.lastExecuteStatusMessageGte = lastExecuteStatusMessageGte;
    }

    public ReplicationPlanWhereInput lastExecuteStatusMessageGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_STATUS_MESSAGE_GTE);
        return this;
    }

    public ReplicationPlanWhereInput lastExecuteStatusMessageGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTE_STATUS_MESSAGE_GTE);
        return this;
    }

    public void setLastExecuteStatusMessageGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_STATUS_MESSAGE_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTE_STATUS_MESSAGE_GTE);
        }
    }

    public boolean getLastExecuteStatusMessageGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LAST_EXECUTE_STATUS_MESSAGE_GTE);
    }

    public ReplicationPlanWhereInput lastExecuteStatusMessageIn(
            List<String> lastExecuteStatusMessageIn) {

        this.lastExecuteStatusMessageIn = lastExecuteStatusMessageIn;
        return this;
    }

    public ReplicationPlanWhereInput addLastExecuteStatusMessageInItem(
            String lastExecuteStatusMessageInItem) {
        if (this.lastExecuteStatusMessageIn == null) {
            this.lastExecuteStatusMessageIn = new ArrayList<String>();
        }
        this.lastExecuteStatusMessageIn.add(lastExecuteStatusMessageInItem);
        return this;
    }

    /**
     * Get lastExecuteStatusMessageIn
     *
     * @return lastExecuteStatusMessageIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getLastExecuteStatusMessageIn() {
        return lastExecuteStatusMessageIn;
    }

    public void setLastExecuteStatusMessageIn(List<String> lastExecuteStatusMessageIn) {
        this.lastExecuteStatusMessageIn = lastExecuteStatusMessageIn;
    }

    public ReplicationPlanWhereInput lastExecuteStatusMessageIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_STATUS_MESSAGE_IN);
        return this;
    }

    public ReplicationPlanWhereInput lastExecuteStatusMessageIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTE_STATUS_MESSAGE_IN);
        return this;
    }

    public void setLastExecuteStatusMessageIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_STATUS_MESSAGE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTE_STATUS_MESSAGE_IN);
        }
    }

    public boolean getLastExecuteStatusMessageIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LAST_EXECUTE_STATUS_MESSAGE_IN);
    }

    public ReplicationPlanWhereInput lastExecuteStatusMessageLt(String lastExecuteStatusMessageLt) {

        this.lastExecuteStatusMessageLt = lastExecuteStatusMessageLt;
        return this;
    }

    /**
     * Get lastExecuteStatusMessageLt
     *
     * @return lastExecuteStatusMessageLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLastExecuteStatusMessageLt() {
        return lastExecuteStatusMessageLt;
    }

    public void setLastExecuteStatusMessageLt(String lastExecuteStatusMessageLt) {
        this.lastExecuteStatusMessageLt = lastExecuteStatusMessageLt;
    }

    public ReplicationPlanWhereInput lastExecuteStatusMessageLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_STATUS_MESSAGE_LT);
        return this;
    }

    public ReplicationPlanWhereInput lastExecuteStatusMessageLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTE_STATUS_MESSAGE_LT);
        return this;
    }

    public void setLastExecuteStatusMessageLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_STATUS_MESSAGE_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTE_STATUS_MESSAGE_LT);
        }
    }

    public boolean getLastExecuteStatusMessageLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LAST_EXECUTE_STATUS_MESSAGE_LT);
    }

    public ReplicationPlanWhereInput lastExecuteStatusMessageLte(
            String lastExecuteStatusMessageLte) {

        this.lastExecuteStatusMessageLte = lastExecuteStatusMessageLte;
        return this;
    }

    /**
     * Get lastExecuteStatusMessageLte
     *
     * @return lastExecuteStatusMessageLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLastExecuteStatusMessageLte() {
        return lastExecuteStatusMessageLte;
    }

    public void setLastExecuteStatusMessageLte(String lastExecuteStatusMessageLte) {
        this.lastExecuteStatusMessageLte = lastExecuteStatusMessageLte;
    }

    public ReplicationPlanWhereInput lastExecuteStatusMessageLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_STATUS_MESSAGE_LTE);
        return this;
    }

    public ReplicationPlanWhereInput lastExecuteStatusMessageLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTE_STATUS_MESSAGE_LTE);
        return this;
    }

    public void setLastExecuteStatusMessageLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_STATUS_MESSAGE_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTE_STATUS_MESSAGE_LTE);
        }
    }

    public boolean getLastExecuteStatusMessageLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LAST_EXECUTE_STATUS_MESSAGE_LTE);
    }

    public ReplicationPlanWhereInput lastExecuteStatusMessageNot(
            String lastExecuteStatusMessageNot) {

        this.lastExecuteStatusMessageNot = lastExecuteStatusMessageNot;
        return this;
    }

    /**
     * Get lastExecuteStatusMessageNot
     *
     * @return lastExecuteStatusMessageNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLastExecuteStatusMessageNot() {
        return lastExecuteStatusMessageNot;
    }

    public void setLastExecuteStatusMessageNot(String lastExecuteStatusMessageNot) {
        this.lastExecuteStatusMessageNot = lastExecuteStatusMessageNot;
    }

    public ReplicationPlanWhereInput lastExecuteStatusMessageNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_STATUS_MESSAGE_NOT);
        return this;
    }

    public ReplicationPlanWhereInput lastExecuteStatusMessageNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTE_STATUS_MESSAGE_NOT);
        return this;
    }

    public void setLastExecuteStatusMessageNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_STATUS_MESSAGE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTE_STATUS_MESSAGE_NOT);
        }
    }

    public boolean getLastExecuteStatusMessageNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LAST_EXECUTE_STATUS_MESSAGE_NOT);
    }

    public ReplicationPlanWhereInput lastExecuteStatusMessageNotContains(
            String lastExecuteStatusMessageNotContains) {

        this.lastExecuteStatusMessageNotContains = lastExecuteStatusMessageNotContains;
        return this;
    }

    /**
     * Get lastExecuteStatusMessageNotContains
     *
     * @return lastExecuteStatusMessageNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLastExecuteStatusMessageNotContains() {
        return lastExecuteStatusMessageNotContains;
    }

    public void setLastExecuteStatusMessageNotContains(String lastExecuteStatusMessageNotContains) {
        this.lastExecuteStatusMessageNotContains = lastExecuteStatusMessageNotContains;
    }

    public ReplicationPlanWhereInput lastExecuteStatusMessageNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_STATUS_MESSAGE_NOT_CONTAINS);
        return this;
    }

    public ReplicationPlanWhereInput lastExecuteStatusMessageNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTE_STATUS_MESSAGE_NOT_CONTAINS);
        return this;
    }

    public void setLastExecuteStatusMessageNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_STATUS_MESSAGE_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTE_STATUS_MESSAGE_NOT_CONTAINS);
        }
    }

    public boolean getLastExecuteStatusMessageNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LAST_EXECUTE_STATUS_MESSAGE_NOT_CONTAINS);
    }

    public ReplicationPlanWhereInput lastExecuteStatusMessageNotEndsWith(
            String lastExecuteStatusMessageNotEndsWith) {

        this.lastExecuteStatusMessageNotEndsWith = lastExecuteStatusMessageNotEndsWith;
        return this;
    }

    /**
     * Get lastExecuteStatusMessageNotEndsWith
     *
     * @return lastExecuteStatusMessageNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLastExecuteStatusMessageNotEndsWith() {
        return lastExecuteStatusMessageNotEndsWith;
    }

    public void setLastExecuteStatusMessageNotEndsWith(String lastExecuteStatusMessageNotEndsWith) {
        this.lastExecuteStatusMessageNotEndsWith = lastExecuteStatusMessageNotEndsWith;
    }

    public ReplicationPlanWhereInput lastExecuteStatusMessageNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_STATUS_MESSAGE_NOT_ENDS_WITH);
        return this;
    }

    public ReplicationPlanWhereInput lastExecuteStatusMessageNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTE_STATUS_MESSAGE_NOT_ENDS_WITH);
        return this;
    }

    public void setLastExecuteStatusMessageNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_STATUS_MESSAGE_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTE_STATUS_MESSAGE_NOT_ENDS_WITH);
        }
    }

    public boolean getLastExecuteStatusMessageNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LAST_EXECUTE_STATUS_MESSAGE_NOT_ENDS_WITH);
    }

    public ReplicationPlanWhereInput lastExecuteStatusMessageNotIn(
            List<String> lastExecuteStatusMessageNotIn) {

        this.lastExecuteStatusMessageNotIn = lastExecuteStatusMessageNotIn;
        return this;
    }

    public ReplicationPlanWhereInput addLastExecuteStatusMessageNotInItem(
            String lastExecuteStatusMessageNotInItem) {
        if (this.lastExecuteStatusMessageNotIn == null) {
            this.lastExecuteStatusMessageNotIn = new ArrayList<String>();
        }
        this.lastExecuteStatusMessageNotIn.add(lastExecuteStatusMessageNotInItem);
        return this;
    }

    /**
     * Get lastExecuteStatusMessageNotIn
     *
     * @return lastExecuteStatusMessageNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getLastExecuteStatusMessageNotIn() {
        return lastExecuteStatusMessageNotIn;
    }

    public void setLastExecuteStatusMessageNotIn(List<String> lastExecuteStatusMessageNotIn) {
        this.lastExecuteStatusMessageNotIn = lastExecuteStatusMessageNotIn;
    }

    public ReplicationPlanWhereInput lastExecuteStatusMessageNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_STATUS_MESSAGE_NOT_IN);
        return this;
    }

    public ReplicationPlanWhereInput lastExecuteStatusMessageNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTE_STATUS_MESSAGE_NOT_IN);
        return this;
    }

    public void setLastExecuteStatusMessageNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_STATUS_MESSAGE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTE_STATUS_MESSAGE_NOT_IN);
        }
    }

    public boolean getLastExecuteStatusMessageNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LAST_EXECUTE_STATUS_MESSAGE_NOT_IN);
    }

    public ReplicationPlanWhereInput lastExecuteStatusMessageNotStartsWith(
            String lastExecuteStatusMessageNotStartsWith) {

        this.lastExecuteStatusMessageNotStartsWith = lastExecuteStatusMessageNotStartsWith;
        return this;
    }

    /**
     * Get lastExecuteStatusMessageNotStartsWith
     *
     * @return lastExecuteStatusMessageNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLastExecuteStatusMessageNotStartsWith() {
        return lastExecuteStatusMessageNotStartsWith;
    }

    public void setLastExecuteStatusMessageNotStartsWith(
            String lastExecuteStatusMessageNotStartsWith) {
        this.lastExecuteStatusMessageNotStartsWith = lastExecuteStatusMessageNotStartsWith;
    }

    public ReplicationPlanWhereInput lastExecuteStatusMessageNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_STATUS_MESSAGE_NOT_STARTS_WITH);
        return this;
    }

    public ReplicationPlanWhereInput lastExecuteStatusMessageNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTE_STATUS_MESSAGE_NOT_STARTS_WITH);
        return this;
    }

    public void setLastExecuteStatusMessageNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_STATUS_MESSAGE_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTE_STATUS_MESSAGE_NOT_STARTS_WITH);
        }
    }

    public boolean getLastExecuteStatusMessageNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(
                SERIALIZED_NAME_LAST_EXECUTE_STATUS_MESSAGE_NOT_STARTS_WITH);
    }

    public ReplicationPlanWhereInput lastExecuteStatusMessageStartsWith(
            String lastExecuteStatusMessageStartsWith) {

        this.lastExecuteStatusMessageStartsWith = lastExecuteStatusMessageStartsWith;
        return this;
    }

    /**
     * Get lastExecuteStatusMessageStartsWith
     *
     * @return lastExecuteStatusMessageStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLastExecuteStatusMessageStartsWith() {
        return lastExecuteStatusMessageStartsWith;
    }

    public void setLastExecuteStatusMessageStartsWith(String lastExecuteStatusMessageStartsWith) {
        this.lastExecuteStatusMessageStartsWith = lastExecuteStatusMessageStartsWith;
    }

    public ReplicationPlanWhereInput lastExecuteStatusMessageStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_STATUS_MESSAGE_STARTS_WITH);
        return this;
    }

    public ReplicationPlanWhereInput lastExecuteStatusMessageStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTE_STATUS_MESSAGE_STARTS_WITH);
        return this;
    }

    public void setLastExecuteStatusMessageStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_STATUS_MESSAGE_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTE_STATUS_MESSAGE_STARTS_WITH);
        }
    }

    public boolean getLastExecuteStatusMessageStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LAST_EXECUTE_STATUS_MESSAGE_STARTS_WITH);
    }

    public ReplicationPlanWhereInput lastExecuteStatusNot(
            BackupPlanExecutionStatus lastExecuteStatusNot) {

        this.lastExecuteStatusNot = lastExecuteStatusNot;
        return this;
    }

    /**
     * Get lastExecuteStatusNot
     *
     * @return lastExecuteStatusNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public BackupPlanExecutionStatus getLastExecuteStatusNot() {
        return lastExecuteStatusNot;
    }

    public void setLastExecuteStatusNot(BackupPlanExecutionStatus lastExecuteStatusNot) {
        this.lastExecuteStatusNot = lastExecuteStatusNot;
    }

    public ReplicationPlanWhereInput lastExecuteStatusNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_STATUS_NOT);
        return this;
    }

    public ReplicationPlanWhereInput lastExecuteStatusNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTE_STATUS_NOT);
        return this;
    }

    public void setLastExecuteStatusNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_STATUS_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTE_STATUS_NOT);
        }
    }

    public boolean getLastExecuteStatusNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LAST_EXECUTE_STATUS_NOT);
    }

    public ReplicationPlanWhereInput lastExecuteStatusNotIn(
            List<BackupPlanExecutionStatus> lastExecuteStatusNotIn) {

        this.lastExecuteStatusNotIn = lastExecuteStatusNotIn;
        return this;
    }

    public ReplicationPlanWhereInput addLastExecuteStatusNotInItem(
            BackupPlanExecutionStatus lastExecuteStatusNotInItem) {
        if (this.lastExecuteStatusNotIn == null) {
            this.lastExecuteStatusNotIn = new ArrayList<BackupPlanExecutionStatus>();
        }
        this.lastExecuteStatusNotIn.add(lastExecuteStatusNotInItem);
        return this;
    }

    /**
     * Get lastExecuteStatusNotIn
     *
     * @return lastExecuteStatusNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<BackupPlanExecutionStatus> getLastExecuteStatusNotIn() {
        return lastExecuteStatusNotIn;
    }

    public void setLastExecuteStatusNotIn(List<BackupPlanExecutionStatus> lastExecuteStatusNotIn) {
        this.lastExecuteStatusNotIn = lastExecuteStatusNotIn;
    }

    public ReplicationPlanWhereInput lastExecuteStatusNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_STATUS_NOT_IN);
        return this;
    }

    public ReplicationPlanWhereInput lastExecuteStatusNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTE_STATUS_NOT_IN);
        return this;
    }

    public void setLastExecuteStatusNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_STATUS_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTE_STATUS_NOT_IN);
        }
    }

    public boolean getLastExecuteStatusNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LAST_EXECUTE_STATUS_NOT_IN);
    }

    public ReplicationPlanWhereInput lastExecuteSuccessJobCount(
            Integer lastExecuteSuccessJobCount) {

        this.lastExecuteSuccessJobCount = lastExecuteSuccessJobCount;
        return this;
    }

    /**
     * Get lastExecuteSuccessJobCount
     *
     * @return lastExecuteSuccessJobCount
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getLastExecuteSuccessJobCount() {
        return lastExecuteSuccessJobCount;
    }

    public void setLastExecuteSuccessJobCount(Integer lastExecuteSuccessJobCount) {
        this.lastExecuteSuccessJobCount = lastExecuteSuccessJobCount;
    }

    public ReplicationPlanWhereInput lastExecuteSuccessJobCount_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_SUCCESS_JOB_COUNT);
        return this;
    }

    public ReplicationPlanWhereInput lastExecuteSuccessJobCount_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTE_SUCCESS_JOB_COUNT);
        return this;
    }

    public void setLastExecuteSuccessJobCount_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_SUCCESS_JOB_COUNT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTE_SUCCESS_JOB_COUNT);
        }
    }

    public boolean getLastExecuteSuccessJobCount_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LAST_EXECUTE_SUCCESS_JOB_COUNT);
    }

    public ReplicationPlanWhereInput lastExecuteSuccessJobCountGt(
            Integer lastExecuteSuccessJobCountGt) {

        this.lastExecuteSuccessJobCountGt = lastExecuteSuccessJobCountGt;
        return this;
    }

    /**
     * Get lastExecuteSuccessJobCountGt
     *
     * @return lastExecuteSuccessJobCountGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getLastExecuteSuccessJobCountGt() {
        return lastExecuteSuccessJobCountGt;
    }

    public void setLastExecuteSuccessJobCountGt(Integer lastExecuteSuccessJobCountGt) {
        this.lastExecuteSuccessJobCountGt = lastExecuteSuccessJobCountGt;
    }

    public ReplicationPlanWhereInput lastExecuteSuccessJobCountGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_SUCCESS_JOB_COUNT_GT);
        return this;
    }

    public ReplicationPlanWhereInput lastExecuteSuccessJobCountGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTE_SUCCESS_JOB_COUNT_GT);
        return this;
    }

    public void setLastExecuteSuccessJobCountGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_SUCCESS_JOB_COUNT_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTE_SUCCESS_JOB_COUNT_GT);
        }
    }

    public boolean getLastExecuteSuccessJobCountGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LAST_EXECUTE_SUCCESS_JOB_COUNT_GT);
    }

    public ReplicationPlanWhereInput lastExecuteSuccessJobCountGte(
            Integer lastExecuteSuccessJobCountGte) {

        this.lastExecuteSuccessJobCountGte = lastExecuteSuccessJobCountGte;
        return this;
    }

    /**
     * Get lastExecuteSuccessJobCountGte
     *
     * @return lastExecuteSuccessJobCountGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getLastExecuteSuccessJobCountGte() {
        return lastExecuteSuccessJobCountGte;
    }

    public void setLastExecuteSuccessJobCountGte(Integer lastExecuteSuccessJobCountGte) {
        this.lastExecuteSuccessJobCountGte = lastExecuteSuccessJobCountGte;
    }

    public ReplicationPlanWhereInput lastExecuteSuccessJobCountGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_SUCCESS_JOB_COUNT_GTE);
        return this;
    }

    public ReplicationPlanWhereInput lastExecuteSuccessJobCountGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTE_SUCCESS_JOB_COUNT_GTE);
        return this;
    }

    public void setLastExecuteSuccessJobCountGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_SUCCESS_JOB_COUNT_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTE_SUCCESS_JOB_COUNT_GTE);
        }
    }

    public boolean getLastExecuteSuccessJobCountGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LAST_EXECUTE_SUCCESS_JOB_COUNT_GTE);
    }

    public ReplicationPlanWhereInput lastExecuteSuccessJobCountIn(
            List<Integer> lastExecuteSuccessJobCountIn) {

        this.lastExecuteSuccessJobCountIn = lastExecuteSuccessJobCountIn;
        return this;
    }

    public ReplicationPlanWhereInput addLastExecuteSuccessJobCountInItem(
            Integer lastExecuteSuccessJobCountInItem) {
        if (this.lastExecuteSuccessJobCountIn == null) {
            this.lastExecuteSuccessJobCountIn = new ArrayList<Integer>();
        }
        this.lastExecuteSuccessJobCountIn.add(lastExecuteSuccessJobCountInItem);
        return this;
    }

    /**
     * Get lastExecuteSuccessJobCountIn
     *
     * @return lastExecuteSuccessJobCountIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getLastExecuteSuccessJobCountIn() {
        return lastExecuteSuccessJobCountIn;
    }

    public void setLastExecuteSuccessJobCountIn(List<Integer> lastExecuteSuccessJobCountIn) {
        this.lastExecuteSuccessJobCountIn = lastExecuteSuccessJobCountIn;
    }

    public ReplicationPlanWhereInput lastExecuteSuccessJobCountIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_SUCCESS_JOB_COUNT_IN);
        return this;
    }

    public ReplicationPlanWhereInput lastExecuteSuccessJobCountIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTE_SUCCESS_JOB_COUNT_IN);
        return this;
    }

    public void setLastExecuteSuccessJobCountIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_SUCCESS_JOB_COUNT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTE_SUCCESS_JOB_COUNT_IN);
        }
    }

    public boolean getLastExecuteSuccessJobCountIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LAST_EXECUTE_SUCCESS_JOB_COUNT_IN);
    }

    public ReplicationPlanWhereInput lastExecuteSuccessJobCountLt(
            Integer lastExecuteSuccessJobCountLt) {

        this.lastExecuteSuccessJobCountLt = lastExecuteSuccessJobCountLt;
        return this;
    }

    /**
     * Get lastExecuteSuccessJobCountLt
     *
     * @return lastExecuteSuccessJobCountLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getLastExecuteSuccessJobCountLt() {
        return lastExecuteSuccessJobCountLt;
    }

    public void setLastExecuteSuccessJobCountLt(Integer lastExecuteSuccessJobCountLt) {
        this.lastExecuteSuccessJobCountLt = lastExecuteSuccessJobCountLt;
    }

    public ReplicationPlanWhereInput lastExecuteSuccessJobCountLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_SUCCESS_JOB_COUNT_LT);
        return this;
    }

    public ReplicationPlanWhereInput lastExecuteSuccessJobCountLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTE_SUCCESS_JOB_COUNT_LT);
        return this;
    }

    public void setLastExecuteSuccessJobCountLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_SUCCESS_JOB_COUNT_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTE_SUCCESS_JOB_COUNT_LT);
        }
    }

    public boolean getLastExecuteSuccessJobCountLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LAST_EXECUTE_SUCCESS_JOB_COUNT_LT);
    }

    public ReplicationPlanWhereInput lastExecuteSuccessJobCountLte(
            Integer lastExecuteSuccessJobCountLte) {

        this.lastExecuteSuccessJobCountLte = lastExecuteSuccessJobCountLte;
        return this;
    }

    /**
     * Get lastExecuteSuccessJobCountLte
     *
     * @return lastExecuteSuccessJobCountLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getLastExecuteSuccessJobCountLte() {
        return lastExecuteSuccessJobCountLte;
    }

    public void setLastExecuteSuccessJobCountLte(Integer lastExecuteSuccessJobCountLte) {
        this.lastExecuteSuccessJobCountLte = lastExecuteSuccessJobCountLte;
    }

    public ReplicationPlanWhereInput lastExecuteSuccessJobCountLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_SUCCESS_JOB_COUNT_LTE);
        return this;
    }

    public ReplicationPlanWhereInput lastExecuteSuccessJobCountLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTE_SUCCESS_JOB_COUNT_LTE);
        return this;
    }

    public void setLastExecuteSuccessJobCountLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_SUCCESS_JOB_COUNT_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTE_SUCCESS_JOB_COUNT_LTE);
        }
    }

    public boolean getLastExecuteSuccessJobCountLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LAST_EXECUTE_SUCCESS_JOB_COUNT_LTE);
    }

    public ReplicationPlanWhereInput lastExecuteSuccessJobCountNot(
            Integer lastExecuteSuccessJobCountNot) {

        this.lastExecuteSuccessJobCountNot = lastExecuteSuccessJobCountNot;
        return this;
    }

    /**
     * Get lastExecuteSuccessJobCountNot
     *
     * @return lastExecuteSuccessJobCountNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getLastExecuteSuccessJobCountNot() {
        return lastExecuteSuccessJobCountNot;
    }

    public void setLastExecuteSuccessJobCountNot(Integer lastExecuteSuccessJobCountNot) {
        this.lastExecuteSuccessJobCountNot = lastExecuteSuccessJobCountNot;
    }

    public ReplicationPlanWhereInput lastExecuteSuccessJobCountNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_SUCCESS_JOB_COUNT_NOT);
        return this;
    }

    public ReplicationPlanWhereInput lastExecuteSuccessJobCountNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTE_SUCCESS_JOB_COUNT_NOT);
        return this;
    }

    public void setLastExecuteSuccessJobCountNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_SUCCESS_JOB_COUNT_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTE_SUCCESS_JOB_COUNT_NOT);
        }
    }

    public boolean getLastExecuteSuccessJobCountNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LAST_EXECUTE_SUCCESS_JOB_COUNT_NOT);
    }

    public ReplicationPlanWhereInput lastExecuteSuccessJobCountNotIn(
            List<Integer> lastExecuteSuccessJobCountNotIn) {

        this.lastExecuteSuccessJobCountNotIn = lastExecuteSuccessJobCountNotIn;
        return this;
    }

    public ReplicationPlanWhereInput addLastExecuteSuccessJobCountNotInItem(
            Integer lastExecuteSuccessJobCountNotInItem) {
        if (this.lastExecuteSuccessJobCountNotIn == null) {
            this.lastExecuteSuccessJobCountNotIn = new ArrayList<Integer>();
        }
        this.lastExecuteSuccessJobCountNotIn.add(lastExecuteSuccessJobCountNotInItem);
        return this;
    }

    /**
     * Get lastExecuteSuccessJobCountNotIn
     *
     * @return lastExecuteSuccessJobCountNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getLastExecuteSuccessJobCountNotIn() {
        return lastExecuteSuccessJobCountNotIn;
    }

    public void setLastExecuteSuccessJobCountNotIn(List<Integer> lastExecuteSuccessJobCountNotIn) {
        this.lastExecuteSuccessJobCountNotIn = lastExecuteSuccessJobCountNotIn;
    }

    public ReplicationPlanWhereInput lastExecuteSuccessJobCountNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_SUCCESS_JOB_COUNT_NOT_IN);
        return this;
    }

    public ReplicationPlanWhereInput lastExecuteSuccessJobCountNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTE_SUCCESS_JOB_COUNT_NOT_IN);
        return this;
    }

    public void setLastExecuteSuccessJobCountNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_SUCCESS_JOB_COUNT_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTE_SUCCESS_JOB_COUNT_NOT_IN);
        }
    }

    public boolean getLastExecuteSuccessJobCountNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LAST_EXECUTE_SUCCESS_JOB_COUNT_NOT_IN);
    }

    public ReplicationPlanWhereInput lastExecuteTotalJobCount(Integer lastExecuteTotalJobCount) {

        this.lastExecuteTotalJobCount = lastExecuteTotalJobCount;
        return this;
    }

    /**
     * Get lastExecuteTotalJobCount
     *
     * @return lastExecuteTotalJobCount
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getLastExecuteTotalJobCount() {
        return lastExecuteTotalJobCount;
    }

    public void setLastExecuteTotalJobCount(Integer lastExecuteTotalJobCount) {
        this.lastExecuteTotalJobCount = lastExecuteTotalJobCount;
    }

    public ReplicationPlanWhereInput lastExecuteTotalJobCount_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_TOTAL_JOB_COUNT);
        return this;
    }

    public ReplicationPlanWhereInput lastExecuteTotalJobCount_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTE_TOTAL_JOB_COUNT);
        return this;
    }

    public void setLastExecuteTotalJobCount_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_TOTAL_JOB_COUNT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTE_TOTAL_JOB_COUNT);
        }
    }

    public boolean getLastExecuteTotalJobCount_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LAST_EXECUTE_TOTAL_JOB_COUNT);
    }

    public ReplicationPlanWhereInput lastExecuteTotalJobCountGt(
            Integer lastExecuteTotalJobCountGt) {

        this.lastExecuteTotalJobCountGt = lastExecuteTotalJobCountGt;
        return this;
    }

    /**
     * Get lastExecuteTotalJobCountGt
     *
     * @return lastExecuteTotalJobCountGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getLastExecuteTotalJobCountGt() {
        return lastExecuteTotalJobCountGt;
    }

    public void setLastExecuteTotalJobCountGt(Integer lastExecuteTotalJobCountGt) {
        this.lastExecuteTotalJobCountGt = lastExecuteTotalJobCountGt;
    }

    public ReplicationPlanWhereInput lastExecuteTotalJobCountGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_TOTAL_JOB_COUNT_GT);
        return this;
    }

    public ReplicationPlanWhereInput lastExecuteTotalJobCountGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTE_TOTAL_JOB_COUNT_GT);
        return this;
    }

    public void setLastExecuteTotalJobCountGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_TOTAL_JOB_COUNT_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTE_TOTAL_JOB_COUNT_GT);
        }
    }

    public boolean getLastExecuteTotalJobCountGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LAST_EXECUTE_TOTAL_JOB_COUNT_GT);
    }

    public ReplicationPlanWhereInput lastExecuteTotalJobCountGte(
            Integer lastExecuteTotalJobCountGte) {

        this.lastExecuteTotalJobCountGte = lastExecuteTotalJobCountGte;
        return this;
    }

    /**
     * Get lastExecuteTotalJobCountGte
     *
     * @return lastExecuteTotalJobCountGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getLastExecuteTotalJobCountGte() {
        return lastExecuteTotalJobCountGte;
    }

    public void setLastExecuteTotalJobCountGte(Integer lastExecuteTotalJobCountGte) {
        this.lastExecuteTotalJobCountGte = lastExecuteTotalJobCountGte;
    }

    public ReplicationPlanWhereInput lastExecuteTotalJobCountGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_TOTAL_JOB_COUNT_GTE);
        return this;
    }

    public ReplicationPlanWhereInput lastExecuteTotalJobCountGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTE_TOTAL_JOB_COUNT_GTE);
        return this;
    }

    public void setLastExecuteTotalJobCountGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_TOTAL_JOB_COUNT_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTE_TOTAL_JOB_COUNT_GTE);
        }
    }

    public boolean getLastExecuteTotalJobCountGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LAST_EXECUTE_TOTAL_JOB_COUNT_GTE);
    }

    public ReplicationPlanWhereInput lastExecuteTotalJobCountIn(
            List<Integer> lastExecuteTotalJobCountIn) {

        this.lastExecuteTotalJobCountIn = lastExecuteTotalJobCountIn;
        return this;
    }

    public ReplicationPlanWhereInput addLastExecuteTotalJobCountInItem(
            Integer lastExecuteTotalJobCountInItem) {
        if (this.lastExecuteTotalJobCountIn == null) {
            this.lastExecuteTotalJobCountIn = new ArrayList<Integer>();
        }
        this.lastExecuteTotalJobCountIn.add(lastExecuteTotalJobCountInItem);
        return this;
    }

    /**
     * Get lastExecuteTotalJobCountIn
     *
     * @return lastExecuteTotalJobCountIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getLastExecuteTotalJobCountIn() {
        return lastExecuteTotalJobCountIn;
    }

    public void setLastExecuteTotalJobCountIn(List<Integer> lastExecuteTotalJobCountIn) {
        this.lastExecuteTotalJobCountIn = lastExecuteTotalJobCountIn;
    }

    public ReplicationPlanWhereInput lastExecuteTotalJobCountIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_TOTAL_JOB_COUNT_IN);
        return this;
    }

    public ReplicationPlanWhereInput lastExecuteTotalJobCountIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTE_TOTAL_JOB_COUNT_IN);
        return this;
    }

    public void setLastExecuteTotalJobCountIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_TOTAL_JOB_COUNT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTE_TOTAL_JOB_COUNT_IN);
        }
    }

    public boolean getLastExecuteTotalJobCountIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LAST_EXECUTE_TOTAL_JOB_COUNT_IN);
    }

    public ReplicationPlanWhereInput lastExecuteTotalJobCountLt(
            Integer lastExecuteTotalJobCountLt) {

        this.lastExecuteTotalJobCountLt = lastExecuteTotalJobCountLt;
        return this;
    }

    /**
     * Get lastExecuteTotalJobCountLt
     *
     * @return lastExecuteTotalJobCountLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getLastExecuteTotalJobCountLt() {
        return lastExecuteTotalJobCountLt;
    }

    public void setLastExecuteTotalJobCountLt(Integer lastExecuteTotalJobCountLt) {
        this.lastExecuteTotalJobCountLt = lastExecuteTotalJobCountLt;
    }

    public ReplicationPlanWhereInput lastExecuteTotalJobCountLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_TOTAL_JOB_COUNT_LT);
        return this;
    }

    public ReplicationPlanWhereInput lastExecuteTotalJobCountLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTE_TOTAL_JOB_COUNT_LT);
        return this;
    }

    public void setLastExecuteTotalJobCountLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_TOTAL_JOB_COUNT_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTE_TOTAL_JOB_COUNT_LT);
        }
    }

    public boolean getLastExecuteTotalJobCountLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LAST_EXECUTE_TOTAL_JOB_COUNT_LT);
    }

    public ReplicationPlanWhereInput lastExecuteTotalJobCountLte(
            Integer lastExecuteTotalJobCountLte) {

        this.lastExecuteTotalJobCountLte = lastExecuteTotalJobCountLte;
        return this;
    }

    /**
     * Get lastExecuteTotalJobCountLte
     *
     * @return lastExecuteTotalJobCountLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getLastExecuteTotalJobCountLte() {
        return lastExecuteTotalJobCountLte;
    }

    public void setLastExecuteTotalJobCountLte(Integer lastExecuteTotalJobCountLte) {
        this.lastExecuteTotalJobCountLte = lastExecuteTotalJobCountLte;
    }

    public ReplicationPlanWhereInput lastExecuteTotalJobCountLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_TOTAL_JOB_COUNT_LTE);
        return this;
    }

    public ReplicationPlanWhereInput lastExecuteTotalJobCountLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTE_TOTAL_JOB_COUNT_LTE);
        return this;
    }

    public void setLastExecuteTotalJobCountLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_TOTAL_JOB_COUNT_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTE_TOTAL_JOB_COUNT_LTE);
        }
    }

    public boolean getLastExecuteTotalJobCountLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LAST_EXECUTE_TOTAL_JOB_COUNT_LTE);
    }

    public ReplicationPlanWhereInput lastExecuteTotalJobCountNot(
            Integer lastExecuteTotalJobCountNot) {

        this.lastExecuteTotalJobCountNot = lastExecuteTotalJobCountNot;
        return this;
    }

    /**
     * Get lastExecuteTotalJobCountNot
     *
     * @return lastExecuteTotalJobCountNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getLastExecuteTotalJobCountNot() {
        return lastExecuteTotalJobCountNot;
    }

    public void setLastExecuteTotalJobCountNot(Integer lastExecuteTotalJobCountNot) {
        this.lastExecuteTotalJobCountNot = lastExecuteTotalJobCountNot;
    }

    public ReplicationPlanWhereInput lastExecuteTotalJobCountNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_TOTAL_JOB_COUNT_NOT);
        return this;
    }

    public ReplicationPlanWhereInput lastExecuteTotalJobCountNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTE_TOTAL_JOB_COUNT_NOT);
        return this;
    }

    public void setLastExecuteTotalJobCountNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_TOTAL_JOB_COUNT_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTE_TOTAL_JOB_COUNT_NOT);
        }
    }

    public boolean getLastExecuteTotalJobCountNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LAST_EXECUTE_TOTAL_JOB_COUNT_NOT);
    }

    public ReplicationPlanWhereInput lastExecuteTotalJobCountNotIn(
            List<Integer> lastExecuteTotalJobCountNotIn) {

        this.lastExecuteTotalJobCountNotIn = lastExecuteTotalJobCountNotIn;
        return this;
    }

    public ReplicationPlanWhereInput addLastExecuteTotalJobCountNotInItem(
            Integer lastExecuteTotalJobCountNotInItem) {
        if (this.lastExecuteTotalJobCountNotIn == null) {
            this.lastExecuteTotalJobCountNotIn = new ArrayList<Integer>();
        }
        this.lastExecuteTotalJobCountNotIn.add(lastExecuteTotalJobCountNotInItem);
        return this;
    }

    /**
     * Get lastExecuteTotalJobCountNotIn
     *
     * @return lastExecuteTotalJobCountNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getLastExecuteTotalJobCountNotIn() {
        return lastExecuteTotalJobCountNotIn;
    }

    public void setLastExecuteTotalJobCountNotIn(List<Integer> lastExecuteTotalJobCountNotIn) {
        this.lastExecuteTotalJobCountNotIn = lastExecuteTotalJobCountNotIn;
    }

    public ReplicationPlanWhereInput lastExecuteTotalJobCountNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_TOTAL_JOB_COUNT_NOT_IN);
        return this;
    }

    public ReplicationPlanWhereInput lastExecuteTotalJobCountNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTE_TOTAL_JOB_COUNT_NOT_IN);
        return this;
    }

    public void setLastExecuteTotalJobCountNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_TOTAL_JOB_COUNT_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTE_TOTAL_JOB_COUNT_NOT_IN);
        }
    }

    public boolean getLastExecuteTotalJobCountNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LAST_EXECUTE_TOTAL_JOB_COUNT_NOT_IN);
    }

    public ReplicationPlanWhereInput lastExecutedAt(String lastExecutedAt) {

        this.lastExecutedAt = lastExecutedAt;
        return this;
    }

    /**
     * Get lastExecutedAt
     *
     * @return lastExecutedAt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLastExecutedAt() {
        return lastExecutedAt;
    }

    public void setLastExecutedAt(String lastExecutedAt) {
        this.lastExecutedAt = lastExecutedAt;
    }

    public ReplicationPlanWhereInput lastExecutedAt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTED_AT);
        return this;
    }

    public ReplicationPlanWhereInput lastExecutedAt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTED_AT);
        return this;
    }

    public void setLastExecutedAt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTED_AT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTED_AT);
        }
    }

    public boolean getLastExecutedAt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LAST_EXECUTED_AT);
    }

    public ReplicationPlanWhereInput lastExecutedAtGt(String lastExecutedAtGt) {

        this.lastExecutedAtGt = lastExecutedAtGt;
        return this;
    }

    /**
     * Get lastExecutedAtGt
     *
     * @return lastExecutedAtGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLastExecutedAtGt() {
        return lastExecutedAtGt;
    }

    public void setLastExecutedAtGt(String lastExecutedAtGt) {
        this.lastExecutedAtGt = lastExecutedAtGt;
    }

    public ReplicationPlanWhereInput lastExecutedAtGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTED_AT_GT);
        return this;
    }

    public ReplicationPlanWhereInput lastExecutedAtGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTED_AT_GT);
        return this;
    }

    public void setLastExecutedAtGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTED_AT_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTED_AT_GT);
        }
    }

    public boolean getLastExecutedAtGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LAST_EXECUTED_AT_GT);
    }

    public ReplicationPlanWhereInput lastExecutedAtGte(String lastExecutedAtGte) {

        this.lastExecutedAtGte = lastExecutedAtGte;
        return this;
    }

    /**
     * Get lastExecutedAtGte
     *
     * @return lastExecutedAtGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLastExecutedAtGte() {
        return lastExecutedAtGte;
    }

    public void setLastExecutedAtGte(String lastExecutedAtGte) {
        this.lastExecutedAtGte = lastExecutedAtGte;
    }

    public ReplicationPlanWhereInput lastExecutedAtGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTED_AT_GTE);
        return this;
    }

    public ReplicationPlanWhereInput lastExecutedAtGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTED_AT_GTE);
        return this;
    }

    public void setLastExecutedAtGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTED_AT_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTED_AT_GTE);
        }
    }

    public boolean getLastExecutedAtGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LAST_EXECUTED_AT_GTE);
    }

    public ReplicationPlanWhereInput lastExecutedAtIn(List<String> lastExecutedAtIn) {

        this.lastExecutedAtIn = lastExecutedAtIn;
        return this;
    }

    public ReplicationPlanWhereInput addLastExecutedAtInItem(String lastExecutedAtInItem) {
        if (this.lastExecutedAtIn == null) {
            this.lastExecutedAtIn = new ArrayList<String>();
        }
        this.lastExecutedAtIn.add(lastExecutedAtInItem);
        return this;
    }

    /**
     * Get lastExecutedAtIn
     *
     * @return lastExecutedAtIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getLastExecutedAtIn() {
        return lastExecutedAtIn;
    }

    public void setLastExecutedAtIn(List<String> lastExecutedAtIn) {
        this.lastExecutedAtIn = lastExecutedAtIn;
    }

    public ReplicationPlanWhereInput lastExecutedAtIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTED_AT_IN);
        return this;
    }

    public ReplicationPlanWhereInput lastExecutedAtIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTED_AT_IN);
        return this;
    }

    public void setLastExecutedAtIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTED_AT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTED_AT_IN);
        }
    }

    public boolean getLastExecutedAtIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LAST_EXECUTED_AT_IN);
    }

    public ReplicationPlanWhereInput lastExecutedAtLt(String lastExecutedAtLt) {

        this.lastExecutedAtLt = lastExecutedAtLt;
        return this;
    }

    /**
     * Get lastExecutedAtLt
     *
     * @return lastExecutedAtLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLastExecutedAtLt() {
        return lastExecutedAtLt;
    }

    public void setLastExecutedAtLt(String lastExecutedAtLt) {
        this.lastExecutedAtLt = lastExecutedAtLt;
    }

    public ReplicationPlanWhereInput lastExecutedAtLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTED_AT_LT);
        return this;
    }

    public ReplicationPlanWhereInput lastExecutedAtLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTED_AT_LT);
        return this;
    }

    public void setLastExecutedAtLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTED_AT_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTED_AT_LT);
        }
    }

    public boolean getLastExecutedAtLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LAST_EXECUTED_AT_LT);
    }

    public ReplicationPlanWhereInput lastExecutedAtLte(String lastExecutedAtLte) {

        this.lastExecutedAtLte = lastExecutedAtLte;
        return this;
    }

    /**
     * Get lastExecutedAtLte
     *
     * @return lastExecutedAtLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLastExecutedAtLte() {
        return lastExecutedAtLte;
    }

    public void setLastExecutedAtLte(String lastExecutedAtLte) {
        this.lastExecutedAtLte = lastExecutedAtLte;
    }

    public ReplicationPlanWhereInput lastExecutedAtLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTED_AT_LTE);
        return this;
    }

    public ReplicationPlanWhereInput lastExecutedAtLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTED_AT_LTE);
        return this;
    }

    public void setLastExecutedAtLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTED_AT_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTED_AT_LTE);
        }
    }

    public boolean getLastExecutedAtLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LAST_EXECUTED_AT_LTE);
    }

    public ReplicationPlanWhereInput lastExecutedAtNot(String lastExecutedAtNot) {

        this.lastExecutedAtNot = lastExecutedAtNot;
        return this;
    }

    /**
     * Get lastExecutedAtNot
     *
     * @return lastExecutedAtNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLastExecutedAtNot() {
        return lastExecutedAtNot;
    }

    public void setLastExecutedAtNot(String lastExecutedAtNot) {
        this.lastExecutedAtNot = lastExecutedAtNot;
    }

    public ReplicationPlanWhereInput lastExecutedAtNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTED_AT_NOT);
        return this;
    }

    public ReplicationPlanWhereInput lastExecutedAtNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTED_AT_NOT);
        return this;
    }

    public void setLastExecutedAtNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTED_AT_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTED_AT_NOT);
        }
    }

    public boolean getLastExecutedAtNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LAST_EXECUTED_AT_NOT);
    }

    public ReplicationPlanWhereInput lastExecutedAtNotIn(List<String> lastExecutedAtNotIn) {

        this.lastExecutedAtNotIn = lastExecutedAtNotIn;
        return this;
    }

    public ReplicationPlanWhereInput addLastExecutedAtNotInItem(String lastExecutedAtNotInItem) {
        if (this.lastExecutedAtNotIn == null) {
            this.lastExecutedAtNotIn = new ArrayList<String>();
        }
        this.lastExecutedAtNotIn.add(lastExecutedAtNotInItem);
        return this;
    }

    /**
     * Get lastExecutedAtNotIn
     *
     * @return lastExecutedAtNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getLastExecutedAtNotIn() {
        return lastExecutedAtNotIn;
    }

    public void setLastExecutedAtNotIn(List<String> lastExecutedAtNotIn) {
        this.lastExecutedAtNotIn = lastExecutedAtNotIn;
    }

    public ReplicationPlanWhereInput lastExecutedAtNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTED_AT_NOT_IN);
        return this;
    }

    public ReplicationPlanWhereInput lastExecutedAtNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTED_AT_NOT_IN);
        return this;
    }

    public void setLastExecutedAtNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTED_AT_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTED_AT_NOT_IN);
        }
    }

    public boolean getLastExecutedAtNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LAST_EXECUTED_AT_NOT_IN);
    }

    public ReplicationPlanWhereInput lastManualExecuteStatus(
            BackupPlanExecutionStatus lastManualExecuteStatus) {

        this.lastManualExecuteStatus = lastManualExecuteStatus;
        return this;
    }

    /**
     * Get lastManualExecuteStatus
     *
     * @return lastManualExecuteStatus
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public BackupPlanExecutionStatus getLastManualExecuteStatus() {
        return lastManualExecuteStatus;
    }

    public void setLastManualExecuteStatus(BackupPlanExecutionStatus lastManualExecuteStatus) {
        this.lastManualExecuteStatus = lastManualExecuteStatus;
    }

    public ReplicationPlanWhereInput lastManualExecuteStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS);
        return this;
    }

    public ReplicationPlanWhereInput lastManualExecuteStatus_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS);
        return this;
    }

    public void setLastManualExecuteStatus_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS);
        }
    }

    public boolean getLastManualExecuteStatus_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS);
    }

    public ReplicationPlanWhereInput lastManualExecuteStatusIn(
            List<BackupPlanExecutionStatus> lastManualExecuteStatusIn) {

        this.lastManualExecuteStatusIn = lastManualExecuteStatusIn;
        return this;
    }

    public ReplicationPlanWhereInput addLastManualExecuteStatusInItem(
            BackupPlanExecutionStatus lastManualExecuteStatusInItem) {
        if (this.lastManualExecuteStatusIn == null) {
            this.lastManualExecuteStatusIn = new ArrayList<BackupPlanExecutionStatus>();
        }
        this.lastManualExecuteStatusIn.add(lastManualExecuteStatusInItem);
        return this;
    }

    /**
     * Get lastManualExecuteStatusIn
     *
     * @return lastManualExecuteStatusIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<BackupPlanExecutionStatus> getLastManualExecuteStatusIn() {
        return lastManualExecuteStatusIn;
    }

    public void setLastManualExecuteStatusIn(
            List<BackupPlanExecutionStatus> lastManualExecuteStatusIn) {
        this.lastManualExecuteStatusIn = lastManualExecuteStatusIn;
    }

    public ReplicationPlanWhereInput lastManualExecuteStatusIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_IN);
        return this;
    }

    public ReplicationPlanWhereInput lastManualExecuteStatusIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_IN);
        return this;
    }

    public void setLastManualExecuteStatusIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_IN);
        }
    }

    public boolean getLastManualExecuteStatusIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_IN);
    }

    public ReplicationPlanWhereInput lastManualExecuteStatusMessage(
            String lastManualExecuteStatusMessage) {

        this.lastManualExecuteStatusMessage = lastManualExecuteStatusMessage;
        return this;
    }

    /**
     * Get lastManualExecuteStatusMessage
     *
     * @return lastManualExecuteStatusMessage
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLastManualExecuteStatusMessage() {
        return lastManualExecuteStatusMessage;
    }

    public void setLastManualExecuteStatusMessage(String lastManualExecuteStatusMessage) {
        this.lastManualExecuteStatusMessage = lastManualExecuteStatusMessage;
    }

    public ReplicationPlanWhereInput lastManualExecuteStatusMessage_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_MESSAGE);
        return this;
    }

    public ReplicationPlanWhereInput lastManualExecuteStatusMessage_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_MESSAGE);
        return this;
    }

    public void setLastManualExecuteStatusMessage_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_MESSAGE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_MESSAGE);
        }
    }

    public boolean getLastManualExecuteStatusMessage_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_MESSAGE);
    }

    public ReplicationPlanWhereInput lastManualExecuteStatusMessageContains(
            String lastManualExecuteStatusMessageContains) {

        this.lastManualExecuteStatusMessageContains = lastManualExecuteStatusMessageContains;
        return this;
    }

    /**
     * Get lastManualExecuteStatusMessageContains
     *
     * @return lastManualExecuteStatusMessageContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLastManualExecuteStatusMessageContains() {
        return lastManualExecuteStatusMessageContains;
    }

    public void setLastManualExecuteStatusMessageContains(
            String lastManualExecuteStatusMessageContains) {
        this.lastManualExecuteStatusMessageContains = lastManualExecuteStatusMessageContains;
    }

    public ReplicationPlanWhereInput lastManualExecuteStatusMessageContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_MESSAGE_CONTAINS);
        return this;
    }

    public ReplicationPlanWhereInput lastManualExecuteStatusMessageContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_MESSAGE_CONTAINS);
        return this;
    }

    public void setLastManualExecuteStatusMessageContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_MESSAGE_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_MESSAGE_CONTAINS);
        }
    }

    public boolean getLastManualExecuteStatusMessageContains_IsExplictlyNull() {
        return this._isPresent_.contains(
                SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_MESSAGE_CONTAINS);
    }

    public ReplicationPlanWhereInput lastManualExecuteStatusMessageEndsWith(
            String lastManualExecuteStatusMessageEndsWith) {

        this.lastManualExecuteStatusMessageEndsWith = lastManualExecuteStatusMessageEndsWith;
        return this;
    }

    /**
     * Get lastManualExecuteStatusMessageEndsWith
     *
     * @return lastManualExecuteStatusMessageEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLastManualExecuteStatusMessageEndsWith() {
        return lastManualExecuteStatusMessageEndsWith;
    }

    public void setLastManualExecuteStatusMessageEndsWith(
            String lastManualExecuteStatusMessageEndsWith) {
        this.lastManualExecuteStatusMessageEndsWith = lastManualExecuteStatusMessageEndsWith;
    }

    public ReplicationPlanWhereInput lastManualExecuteStatusMessageEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_MESSAGE_ENDS_WITH);
        return this;
    }

    public ReplicationPlanWhereInput lastManualExecuteStatusMessageEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_MESSAGE_ENDS_WITH);
        return this;
    }

    public void setLastManualExecuteStatusMessageEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_MESSAGE_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_MESSAGE_ENDS_WITH);
        }
    }

    public boolean getLastManualExecuteStatusMessageEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(
                SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_MESSAGE_ENDS_WITH);
    }

    public ReplicationPlanWhereInput lastManualExecuteStatusMessageGt(
            String lastManualExecuteStatusMessageGt) {

        this.lastManualExecuteStatusMessageGt = lastManualExecuteStatusMessageGt;
        return this;
    }

    /**
     * Get lastManualExecuteStatusMessageGt
     *
     * @return lastManualExecuteStatusMessageGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLastManualExecuteStatusMessageGt() {
        return lastManualExecuteStatusMessageGt;
    }

    public void setLastManualExecuteStatusMessageGt(String lastManualExecuteStatusMessageGt) {
        this.lastManualExecuteStatusMessageGt = lastManualExecuteStatusMessageGt;
    }

    public ReplicationPlanWhereInput lastManualExecuteStatusMessageGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_MESSAGE_GT);
        return this;
    }

    public ReplicationPlanWhereInput lastManualExecuteStatusMessageGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_MESSAGE_GT);
        return this;
    }

    public void setLastManualExecuteStatusMessageGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_MESSAGE_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_MESSAGE_GT);
        }
    }

    public boolean getLastManualExecuteStatusMessageGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_MESSAGE_GT);
    }

    public ReplicationPlanWhereInput lastManualExecuteStatusMessageGte(
            String lastManualExecuteStatusMessageGte) {

        this.lastManualExecuteStatusMessageGte = lastManualExecuteStatusMessageGte;
        return this;
    }

    /**
     * Get lastManualExecuteStatusMessageGte
     *
     * @return lastManualExecuteStatusMessageGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLastManualExecuteStatusMessageGte() {
        return lastManualExecuteStatusMessageGte;
    }

    public void setLastManualExecuteStatusMessageGte(String lastManualExecuteStatusMessageGte) {
        this.lastManualExecuteStatusMessageGte = lastManualExecuteStatusMessageGte;
    }

    public ReplicationPlanWhereInput lastManualExecuteStatusMessageGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_MESSAGE_GTE);
        return this;
    }

    public ReplicationPlanWhereInput lastManualExecuteStatusMessageGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_MESSAGE_GTE);
        return this;
    }

    public void setLastManualExecuteStatusMessageGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_MESSAGE_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_MESSAGE_GTE);
        }
    }

    public boolean getLastManualExecuteStatusMessageGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_MESSAGE_GTE);
    }

    public ReplicationPlanWhereInput lastManualExecuteStatusMessageIn(
            List<String> lastManualExecuteStatusMessageIn) {

        this.lastManualExecuteStatusMessageIn = lastManualExecuteStatusMessageIn;
        return this;
    }

    public ReplicationPlanWhereInput addLastManualExecuteStatusMessageInItem(
            String lastManualExecuteStatusMessageInItem) {
        if (this.lastManualExecuteStatusMessageIn == null) {
            this.lastManualExecuteStatusMessageIn = new ArrayList<String>();
        }
        this.lastManualExecuteStatusMessageIn.add(lastManualExecuteStatusMessageInItem);
        return this;
    }

    /**
     * Get lastManualExecuteStatusMessageIn
     *
     * @return lastManualExecuteStatusMessageIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getLastManualExecuteStatusMessageIn() {
        return lastManualExecuteStatusMessageIn;
    }

    public void setLastManualExecuteStatusMessageIn(List<String> lastManualExecuteStatusMessageIn) {
        this.lastManualExecuteStatusMessageIn = lastManualExecuteStatusMessageIn;
    }

    public ReplicationPlanWhereInput lastManualExecuteStatusMessageIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_MESSAGE_IN);
        return this;
    }

    public ReplicationPlanWhereInput lastManualExecuteStatusMessageIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_MESSAGE_IN);
        return this;
    }

    public void setLastManualExecuteStatusMessageIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_MESSAGE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_MESSAGE_IN);
        }
    }

    public boolean getLastManualExecuteStatusMessageIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_MESSAGE_IN);
    }

    public ReplicationPlanWhereInput lastManualExecuteStatusMessageLt(
            String lastManualExecuteStatusMessageLt) {

        this.lastManualExecuteStatusMessageLt = lastManualExecuteStatusMessageLt;
        return this;
    }

    /**
     * Get lastManualExecuteStatusMessageLt
     *
     * @return lastManualExecuteStatusMessageLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLastManualExecuteStatusMessageLt() {
        return lastManualExecuteStatusMessageLt;
    }

    public void setLastManualExecuteStatusMessageLt(String lastManualExecuteStatusMessageLt) {
        this.lastManualExecuteStatusMessageLt = lastManualExecuteStatusMessageLt;
    }

    public ReplicationPlanWhereInput lastManualExecuteStatusMessageLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_MESSAGE_LT);
        return this;
    }

    public ReplicationPlanWhereInput lastManualExecuteStatusMessageLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_MESSAGE_LT);
        return this;
    }

    public void setLastManualExecuteStatusMessageLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_MESSAGE_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_MESSAGE_LT);
        }
    }

    public boolean getLastManualExecuteStatusMessageLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_MESSAGE_LT);
    }

    public ReplicationPlanWhereInput lastManualExecuteStatusMessageLte(
            String lastManualExecuteStatusMessageLte) {

        this.lastManualExecuteStatusMessageLte = lastManualExecuteStatusMessageLte;
        return this;
    }

    /**
     * Get lastManualExecuteStatusMessageLte
     *
     * @return lastManualExecuteStatusMessageLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLastManualExecuteStatusMessageLte() {
        return lastManualExecuteStatusMessageLte;
    }

    public void setLastManualExecuteStatusMessageLte(String lastManualExecuteStatusMessageLte) {
        this.lastManualExecuteStatusMessageLte = lastManualExecuteStatusMessageLte;
    }

    public ReplicationPlanWhereInput lastManualExecuteStatusMessageLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_MESSAGE_LTE);
        return this;
    }

    public ReplicationPlanWhereInput lastManualExecuteStatusMessageLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_MESSAGE_LTE);
        return this;
    }

    public void setLastManualExecuteStatusMessageLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_MESSAGE_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_MESSAGE_LTE);
        }
    }

    public boolean getLastManualExecuteStatusMessageLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_MESSAGE_LTE);
    }

    public ReplicationPlanWhereInput lastManualExecuteStatusMessageNot(
            String lastManualExecuteStatusMessageNot) {

        this.lastManualExecuteStatusMessageNot = lastManualExecuteStatusMessageNot;
        return this;
    }

    /**
     * Get lastManualExecuteStatusMessageNot
     *
     * @return lastManualExecuteStatusMessageNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLastManualExecuteStatusMessageNot() {
        return lastManualExecuteStatusMessageNot;
    }

    public void setLastManualExecuteStatusMessageNot(String lastManualExecuteStatusMessageNot) {
        this.lastManualExecuteStatusMessageNot = lastManualExecuteStatusMessageNot;
    }

    public ReplicationPlanWhereInput lastManualExecuteStatusMessageNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_MESSAGE_NOT);
        return this;
    }

    public ReplicationPlanWhereInput lastManualExecuteStatusMessageNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_MESSAGE_NOT);
        return this;
    }

    public void setLastManualExecuteStatusMessageNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_MESSAGE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_MESSAGE_NOT);
        }
    }

    public boolean getLastManualExecuteStatusMessageNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_MESSAGE_NOT);
    }

    public ReplicationPlanWhereInput lastManualExecuteStatusMessageNotContains(
            String lastManualExecuteStatusMessageNotContains) {

        this.lastManualExecuteStatusMessageNotContains = lastManualExecuteStatusMessageNotContains;
        return this;
    }

    /**
     * Get lastManualExecuteStatusMessageNotContains
     *
     * @return lastManualExecuteStatusMessageNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLastManualExecuteStatusMessageNotContains() {
        return lastManualExecuteStatusMessageNotContains;
    }

    public void setLastManualExecuteStatusMessageNotContains(
            String lastManualExecuteStatusMessageNotContains) {
        this.lastManualExecuteStatusMessageNotContains = lastManualExecuteStatusMessageNotContains;
    }

    public ReplicationPlanWhereInput lastManualExecuteStatusMessageNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_MESSAGE_NOT_CONTAINS);
        return this;
    }

    public ReplicationPlanWhereInput lastManualExecuteStatusMessageNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_MESSAGE_NOT_CONTAINS);
        return this;
    }

    public void setLastManualExecuteStatusMessageNotContains_IsExplictlyNull(
            boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_MESSAGE_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(
                    SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_MESSAGE_NOT_CONTAINS);
        }
    }

    public boolean getLastManualExecuteStatusMessageNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(
                SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_MESSAGE_NOT_CONTAINS);
    }

    public ReplicationPlanWhereInput lastManualExecuteStatusMessageNotEndsWith(
            String lastManualExecuteStatusMessageNotEndsWith) {

        this.lastManualExecuteStatusMessageNotEndsWith = lastManualExecuteStatusMessageNotEndsWith;
        return this;
    }

    /**
     * Get lastManualExecuteStatusMessageNotEndsWith
     *
     * @return lastManualExecuteStatusMessageNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLastManualExecuteStatusMessageNotEndsWith() {
        return lastManualExecuteStatusMessageNotEndsWith;
    }

    public void setLastManualExecuteStatusMessageNotEndsWith(
            String lastManualExecuteStatusMessageNotEndsWith) {
        this.lastManualExecuteStatusMessageNotEndsWith = lastManualExecuteStatusMessageNotEndsWith;
    }

    public ReplicationPlanWhereInput lastManualExecuteStatusMessageNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_MESSAGE_NOT_ENDS_WITH);
        return this;
    }

    public ReplicationPlanWhereInput lastManualExecuteStatusMessageNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_MESSAGE_NOT_ENDS_WITH);
        return this;
    }

    public void setLastManualExecuteStatusMessageNotEndsWith_IsExplictlyNull(
            boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_MESSAGE_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(
                    SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_MESSAGE_NOT_ENDS_WITH);
        }
    }

    public boolean getLastManualExecuteStatusMessageNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(
                SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_MESSAGE_NOT_ENDS_WITH);
    }

    public ReplicationPlanWhereInput lastManualExecuteStatusMessageNotIn(
            List<String> lastManualExecuteStatusMessageNotIn) {

        this.lastManualExecuteStatusMessageNotIn = lastManualExecuteStatusMessageNotIn;
        return this;
    }

    public ReplicationPlanWhereInput addLastManualExecuteStatusMessageNotInItem(
            String lastManualExecuteStatusMessageNotInItem) {
        if (this.lastManualExecuteStatusMessageNotIn == null) {
            this.lastManualExecuteStatusMessageNotIn = new ArrayList<String>();
        }
        this.lastManualExecuteStatusMessageNotIn.add(lastManualExecuteStatusMessageNotInItem);
        return this;
    }

    /**
     * Get lastManualExecuteStatusMessageNotIn
     *
     * @return lastManualExecuteStatusMessageNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getLastManualExecuteStatusMessageNotIn() {
        return lastManualExecuteStatusMessageNotIn;
    }

    public void setLastManualExecuteStatusMessageNotIn(
            List<String> lastManualExecuteStatusMessageNotIn) {
        this.lastManualExecuteStatusMessageNotIn = lastManualExecuteStatusMessageNotIn;
    }

    public ReplicationPlanWhereInput lastManualExecuteStatusMessageNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_MESSAGE_NOT_IN);
        return this;
    }

    public ReplicationPlanWhereInput lastManualExecuteStatusMessageNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_MESSAGE_NOT_IN);
        return this;
    }

    public void setLastManualExecuteStatusMessageNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_MESSAGE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_MESSAGE_NOT_IN);
        }
    }

    public boolean getLastManualExecuteStatusMessageNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_MESSAGE_NOT_IN);
    }

    public ReplicationPlanWhereInput lastManualExecuteStatusMessageNotStartsWith(
            String lastManualExecuteStatusMessageNotStartsWith) {

        this.lastManualExecuteStatusMessageNotStartsWith =
                lastManualExecuteStatusMessageNotStartsWith;
        return this;
    }

    /**
     * Get lastManualExecuteStatusMessageNotStartsWith
     *
     * @return lastManualExecuteStatusMessageNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLastManualExecuteStatusMessageNotStartsWith() {
        return lastManualExecuteStatusMessageNotStartsWith;
    }

    public void setLastManualExecuteStatusMessageNotStartsWith(
            String lastManualExecuteStatusMessageNotStartsWith) {
        this.lastManualExecuteStatusMessageNotStartsWith =
                lastManualExecuteStatusMessageNotStartsWith;
    }

    public ReplicationPlanWhereInput lastManualExecuteStatusMessageNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_MESSAGE_NOT_STARTS_WITH);
        return this;
    }

    public ReplicationPlanWhereInput
            lastManualExecuteStatusMessageNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_MESSAGE_NOT_STARTS_WITH);
        return this;
    }

    public void setLastManualExecuteStatusMessageNotStartsWith_IsExplictlyNull(
            boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(
                    SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_MESSAGE_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(
                    SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_MESSAGE_NOT_STARTS_WITH);
        }
    }

    public boolean getLastManualExecuteStatusMessageNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(
                SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_MESSAGE_NOT_STARTS_WITH);
    }

    public ReplicationPlanWhereInput lastManualExecuteStatusMessageStartsWith(
            String lastManualExecuteStatusMessageStartsWith) {

        this.lastManualExecuteStatusMessageStartsWith = lastManualExecuteStatusMessageStartsWith;
        return this;
    }

    /**
     * Get lastManualExecuteStatusMessageStartsWith
     *
     * @return lastManualExecuteStatusMessageStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLastManualExecuteStatusMessageStartsWith() {
        return lastManualExecuteStatusMessageStartsWith;
    }

    public void setLastManualExecuteStatusMessageStartsWith(
            String lastManualExecuteStatusMessageStartsWith) {
        this.lastManualExecuteStatusMessageStartsWith = lastManualExecuteStatusMessageStartsWith;
    }

    public ReplicationPlanWhereInput lastManualExecuteStatusMessageStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_MESSAGE_STARTS_WITH);
        return this;
    }

    public ReplicationPlanWhereInput lastManualExecuteStatusMessageStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_MESSAGE_STARTS_WITH);
        return this;
    }

    public void setLastManualExecuteStatusMessageStartsWith_IsExplictlyNull(
            boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_MESSAGE_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_MESSAGE_STARTS_WITH);
        }
    }

    public boolean getLastManualExecuteStatusMessageStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(
                SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_MESSAGE_STARTS_WITH);
    }

    public ReplicationPlanWhereInput lastManualExecuteStatusNot(
            BackupPlanExecutionStatus lastManualExecuteStatusNot) {

        this.lastManualExecuteStatusNot = lastManualExecuteStatusNot;
        return this;
    }

    /**
     * Get lastManualExecuteStatusNot
     *
     * @return lastManualExecuteStatusNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public BackupPlanExecutionStatus getLastManualExecuteStatusNot() {
        return lastManualExecuteStatusNot;
    }

    public void setLastManualExecuteStatusNot(
            BackupPlanExecutionStatus lastManualExecuteStatusNot) {
        this.lastManualExecuteStatusNot = lastManualExecuteStatusNot;
    }

    public ReplicationPlanWhereInput lastManualExecuteStatusNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_NOT);
        return this;
    }

    public ReplicationPlanWhereInput lastManualExecuteStatusNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_NOT);
        return this;
    }

    public void setLastManualExecuteStatusNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_NOT);
        }
    }

    public boolean getLastManualExecuteStatusNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_NOT);
    }

    public ReplicationPlanWhereInput lastManualExecuteStatusNotIn(
            List<BackupPlanExecutionStatus> lastManualExecuteStatusNotIn) {

        this.lastManualExecuteStatusNotIn = lastManualExecuteStatusNotIn;
        return this;
    }

    public ReplicationPlanWhereInput addLastManualExecuteStatusNotInItem(
            BackupPlanExecutionStatus lastManualExecuteStatusNotInItem) {
        if (this.lastManualExecuteStatusNotIn == null) {
            this.lastManualExecuteStatusNotIn = new ArrayList<BackupPlanExecutionStatus>();
        }
        this.lastManualExecuteStatusNotIn.add(lastManualExecuteStatusNotInItem);
        return this;
    }

    /**
     * Get lastManualExecuteStatusNotIn
     *
     * @return lastManualExecuteStatusNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<BackupPlanExecutionStatus> getLastManualExecuteStatusNotIn() {
        return lastManualExecuteStatusNotIn;
    }

    public void setLastManualExecuteStatusNotIn(
            List<BackupPlanExecutionStatus> lastManualExecuteStatusNotIn) {
        this.lastManualExecuteStatusNotIn = lastManualExecuteStatusNotIn;
    }

    public ReplicationPlanWhereInput lastManualExecuteStatusNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_NOT_IN);
        return this;
    }

    public ReplicationPlanWhereInput lastManualExecuteStatusNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_NOT_IN);
        return this;
    }

    public void setLastManualExecuteStatusNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_NOT_IN);
        }
    }

    public boolean getLastManualExecuteStatusNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_NOT_IN);
    }

    public ReplicationPlanWhereInput lastManualExecuteSuccessJobCount(
            Integer lastManualExecuteSuccessJobCount) {

        this.lastManualExecuteSuccessJobCount = lastManualExecuteSuccessJobCount;
        return this;
    }

    /**
     * Get lastManualExecuteSuccessJobCount
     *
     * @return lastManualExecuteSuccessJobCount
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getLastManualExecuteSuccessJobCount() {
        return lastManualExecuteSuccessJobCount;
    }

    public void setLastManualExecuteSuccessJobCount(Integer lastManualExecuteSuccessJobCount) {
        this.lastManualExecuteSuccessJobCount = lastManualExecuteSuccessJobCount;
    }

    public ReplicationPlanWhereInput lastManualExecuteSuccessJobCount_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_SUCCESS_JOB_COUNT);
        return this;
    }

    public ReplicationPlanWhereInput lastManualExecuteSuccessJobCount_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_SUCCESS_JOB_COUNT);
        return this;
    }

    public void setLastManualExecuteSuccessJobCount_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_SUCCESS_JOB_COUNT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_SUCCESS_JOB_COUNT);
        }
    }

    public boolean getLastManualExecuteSuccessJobCount_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_SUCCESS_JOB_COUNT);
    }

    public ReplicationPlanWhereInput lastManualExecuteSuccessJobCountGt(
            Integer lastManualExecuteSuccessJobCountGt) {

        this.lastManualExecuteSuccessJobCountGt = lastManualExecuteSuccessJobCountGt;
        return this;
    }

    /**
     * Get lastManualExecuteSuccessJobCountGt
     *
     * @return lastManualExecuteSuccessJobCountGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getLastManualExecuteSuccessJobCountGt() {
        return lastManualExecuteSuccessJobCountGt;
    }

    public void setLastManualExecuteSuccessJobCountGt(Integer lastManualExecuteSuccessJobCountGt) {
        this.lastManualExecuteSuccessJobCountGt = lastManualExecuteSuccessJobCountGt;
    }

    public ReplicationPlanWhereInput lastManualExecuteSuccessJobCountGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_SUCCESS_JOB_COUNT_GT);
        return this;
    }

    public ReplicationPlanWhereInput lastManualExecuteSuccessJobCountGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_SUCCESS_JOB_COUNT_GT);
        return this;
    }

    public void setLastManualExecuteSuccessJobCountGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_SUCCESS_JOB_COUNT_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_SUCCESS_JOB_COUNT_GT);
        }
    }

    public boolean getLastManualExecuteSuccessJobCountGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_SUCCESS_JOB_COUNT_GT);
    }

    public ReplicationPlanWhereInput lastManualExecuteSuccessJobCountGte(
            Integer lastManualExecuteSuccessJobCountGte) {

        this.lastManualExecuteSuccessJobCountGte = lastManualExecuteSuccessJobCountGte;
        return this;
    }

    /**
     * Get lastManualExecuteSuccessJobCountGte
     *
     * @return lastManualExecuteSuccessJobCountGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getLastManualExecuteSuccessJobCountGte() {
        return lastManualExecuteSuccessJobCountGte;
    }

    public void setLastManualExecuteSuccessJobCountGte(
            Integer lastManualExecuteSuccessJobCountGte) {
        this.lastManualExecuteSuccessJobCountGte = lastManualExecuteSuccessJobCountGte;
    }

    public ReplicationPlanWhereInput lastManualExecuteSuccessJobCountGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_SUCCESS_JOB_COUNT_GTE);
        return this;
    }

    public ReplicationPlanWhereInput lastManualExecuteSuccessJobCountGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_SUCCESS_JOB_COUNT_GTE);
        return this;
    }

    public void setLastManualExecuteSuccessJobCountGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_SUCCESS_JOB_COUNT_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_SUCCESS_JOB_COUNT_GTE);
        }
    }

    public boolean getLastManualExecuteSuccessJobCountGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_SUCCESS_JOB_COUNT_GTE);
    }

    public ReplicationPlanWhereInput lastManualExecuteSuccessJobCountIn(
            List<Integer> lastManualExecuteSuccessJobCountIn) {

        this.lastManualExecuteSuccessJobCountIn = lastManualExecuteSuccessJobCountIn;
        return this;
    }

    public ReplicationPlanWhereInput addLastManualExecuteSuccessJobCountInItem(
            Integer lastManualExecuteSuccessJobCountInItem) {
        if (this.lastManualExecuteSuccessJobCountIn == null) {
            this.lastManualExecuteSuccessJobCountIn = new ArrayList<Integer>();
        }
        this.lastManualExecuteSuccessJobCountIn.add(lastManualExecuteSuccessJobCountInItem);
        return this;
    }

    /**
     * Get lastManualExecuteSuccessJobCountIn
     *
     * @return lastManualExecuteSuccessJobCountIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getLastManualExecuteSuccessJobCountIn() {
        return lastManualExecuteSuccessJobCountIn;
    }

    public void setLastManualExecuteSuccessJobCountIn(
            List<Integer> lastManualExecuteSuccessJobCountIn) {
        this.lastManualExecuteSuccessJobCountIn = lastManualExecuteSuccessJobCountIn;
    }

    public ReplicationPlanWhereInput lastManualExecuteSuccessJobCountIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_SUCCESS_JOB_COUNT_IN);
        return this;
    }

    public ReplicationPlanWhereInput lastManualExecuteSuccessJobCountIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_SUCCESS_JOB_COUNT_IN);
        return this;
    }

    public void setLastManualExecuteSuccessJobCountIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_SUCCESS_JOB_COUNT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_SUCCESS_JOB_COUNT_IN);
        }
    }

    public boolean getLastManualExecuteSuccessJobCountIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_SUCCESS_JOB_COUNT_IN);
    }

    public ReplicationPlanWhereInput lastManualExecuteSuccessJobCountLt(
            Integer lastManualExecuteSuccessJobCountLt) {

        this.lastManualExecuteSuccessJobCountLt = lastManualExecuteSuccessJobCountLt;
        return this;
    }

    /**
     * Get lastManualExecuteSuccessJobCountLt
     *
     * @return lastManualExecuteSuccessJobCountLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getLastManualExecuteSuccessJobCountLt() {
        return lastManualExecuteSuccessJobCountLt;
    }

    public void setLastManualExecuteSuccessJobCountLt(Integer lastManualExecuteSuccessJobCountLt) {
        this.lastManualExecuteSuccessJobCountLt = lastManualExecuteSuccessJobCountLt;
    }

    public ReplicationPlanWhereInput lastManualExecuteSuccessJobCountLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_SUCCESS_JOB_COUNT_LT);
        return this;
    }

    public ReplicationPlanWhereInput lastManualExecuteSuccessJobCountLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_SUCCESS_JOB_COUNT_LT);
        return this;
    }

    public void setLastManualExecuteSuccessJobCountLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_SUCCESS_JOB_COUNT_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_SUCCESS_JOB_COUNT_LT);
        }
    }

    public boolean getLastManualExecuteSuccessJobCountLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_SUCCESS_JOB_COUNT_LT);
    }

    public ReplicationPlanWhereInput lastManualExecuteSuccessJobCountLte(
            Integer lastManualExecuteSuccessJobCountLte) {

        this.lastManualExecuteSuccessJobCountLte = lastManualExecuteSuccessJobCountLte;
        return this;
    }

    /**
     * Get lastManualExecuteSuccessJobCountLte
     *
     * @return lastManualExecuteSuccessJobCountLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getLastManualExecuteSuccessJobCountLte() {
        return lastManualExecuteSuccessJobCountLte;
    }

    public void setLastManualExecuteSuccessJobCountLte(
            Integer lastManualExecuteSuccessJobCountLte) {
        this.lastManualExecuteSuccessJobCountLte = lastManualExecuteSuccessJobCountLte;
    }

    public ReplicationPlanWhereInput lastManualExecuteSuccessJobCountLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_SUCCESS_JOB_COUNT_LTE);
        return this;
    }

    public ReplicationPlanWhereInput lastManualExecuteSuccessJobCountLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_SUCCESS_JOB_COUNT_LTE);
        return this;
    }

    public void setLastManualExecuteSuccessJobCountLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_SUCCESS_JOB_COUNT_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_SUCCESS_JOB_COUNT_LTE);
        }
    }

    public boolean getLastManualExecuteSuccessJobCountLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_SUCCESS_JOB_COUNT_LTE);
    }

    public ReplicationPlanWhereInput lastManualExecuteSuccessJobCountNot(
            Integer lastManualExecuteSuccessJobCountNot) {

        this.lastManualExecuteSuccessJobCountNot = lastManualExecuteSuccessJobCountNot;
        return this;
    }

    /**
     * Get lastManualExecuteSuccessJobCountNot
     *
     * @return lastManualExecuteSuccessJobCountNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getLastManualExecuteSuccessJobCountNot() {
        return lastManualExecuteSuccessJobCountNot;
    }

    public void setLastManualExecuteSuccessJobCountNot(
            Integer lastManualExecuteSuccessJobCountNot) {
        this.lastManualExecuteSuccessJobCountNot = lastManualExecuteSuccessJobCountNot;
    }

    public ReplicationPlanWhereInput lastManualExecuteSuccessJobCountNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_SUCCESS_JOB_COUNT_NOT);
        return this;
    }

    public ReplicationPlanWhereInput lastManualExecuteSuccessJobCountNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_SUCCESS_JOB_COUNT_NOT);
        return this;
    }

    public void setLastManualExecuteSuccessJobCountNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_SUCCESS_JOB_COUNT_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_SUCCESS_JOB_COUNT_NOT);
        }
    }

    public boolean getLastManualExecuteSuccessJobCountNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_SUCCESS_JOB_COUNT_NOT);
    }

    public ReplicationPlanWhereInput lastManualExecuteSuccessJobCountNotIn(
            List<Integer> lastManualExecuteSuccessJobCountNotIn) {

        this.lastManualExecuteSuccessJobCountNotIn = lastManualExecuteSuccessJobCountNotIn;
        return this;
    }

    public ReplicationPlanWhereInput addLastManualExecuteSuccessJobCountNotInItem(
            Integer lastManualExecuteSuccessJobCountNotInItem) {
        if (this.lastManualExecuteSuccessJobCountNotIn == null) {
            this.lastManualExecuteSuccessJobCountNotIn = new ArrayList<Integer>();
        }
        this.lastManualExecuteSuccessJobCountNotIn.add(lastManualExecuteSuccessJobCountNotInItem);
        return this;
    }

    /**
     * Get lastManualExecuteSuccessJobCountNotIn
     *
     * @return lastManualExecuteSuccessJobCountNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getLastManualExecuteSuccessJobCountNotIn() {
        return lastManualExecuteSuccessJobCountNotIn;
    }

    public void setLastManualExecuteSuccessJobCountNotIn(
            List<Integer> lastManualExecuteSuccessJobCountNotIn) {
        this.lastManualExecuteSuccessJobCountNotIn = lastManualExecuteSuccessJobCountNotIn;
    }

    public ReplicationPlanWhereInput lastManualExecuteSuccessJobCountNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_SUCCESS_JOB_COUNT_NOT_IN);
        return this;
    }

    public ReplicationPlanWhereInput lastManualExecuteSuccessJobCountNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_SUCCESS_JOB_COUNT_NOT_IN);
        return this;
    }

    public void setLastManualExecuteSuccessJobCountNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_SUCCESS_JOB_COUNT_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_SUCCESS_JOB_COUNT_NOT_IN);
        }
    }

    public boolean getLastManualExecuteSuccessJobCountNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(
                SERIALIZED_NAME_LAST_MANUAL_EXECUTE_SUCCESS_JOB_COUNT_NOT_IN);
    }

    public ReplicationPlanWhereInput lastManualExecuteTotalJobCount(
            Integer lastManualExecuteTotalJobCount) {

        this.lastManualExecuteTotalJobCount = lastManualExecuteTotalJobCount;
        return this;
    }

    /**
     * Get lastManualExecuteTotalJobCount
     *
     * @return lastManualExecuteTotalJobCount
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getLastManualExecuteTotalJobCount() {
        return lastManualExecuteTotalJobCount;
    }

    public void setLastManualExecuteTotalJobCount(Integer lastManualExecuteTotalJobCount) {
        this.lastManualExecuteTotalJobCount = lastManualExecuteTotalJobCount;
    }

    public ReplicationPlanWhereInput lastManualExecuteTotalJobCount_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_TOTAL_JOB_COUNT);
        return this;
    }

    public ReplicationPlanWhereInput lastManualExecuteTotalJobCount_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_TOTAL_JOB_COUNT);
        return this;
    }

    public void setLastManualExecuteTotalJobCount_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_TOTAL_JOB_COUNT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_TOTAL_JOB_COUNT);
        }
    }

    public boolean getLastManualExecuteTotalJobCount_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_TOTAL_JOB_COUNT);
    }

    public ReplicationPlanWhereInput lastManualExecuteTotalJobCountGt(
            Integer lastManualExecuteTotalJobCountGt) {

        this.lastManualExecuteTotalJobCountGt = lastManualExecuteTotalJobCountGt;
        return this;
    }

    /**
     * Get lastManualExecuteTotalJobCountGt
     *
     * @return lastManualExecuteTotalJobCountGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getLastManualExecuteTotalJobCountGt() {
        return lastManualExecuteTotalJobCountGt;
    }

    public void setLastManualExecuteTotalJobCountGt(Integer lastManualExecuteTotalJobCountGt) {
        this.lastManualExecuteTotalJobCountGt = lastManualExecuteTotalJobCountGt;
    }

    public ReplicationPlanWhereInput lastManualExecuteTotalJobCountGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_TOTAL_JOB_COUNT_GT);
        return this;
    }

    public ReplicationPlanWhereInput lastManualExecuteTotalJobCountGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_TOTAL_JOB_COUNT_GT);
        return this;
    }

    public void setLastManualExecuteTotalJobCountGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_TOTAL_JOB_COUNT_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_TOTAL_JOB_COUNT_GT);
        }
    }

    public boolean getLastManualExecuteTotalJobCountGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_TOTAL_JOB_COUNT_GT);
    }

    public ReplicationPlanWhereInput lastManualExecuteTotalJobCountGte(
            Integer lastManualExecuteTotalJobCountGte) {

        this.lastManualExecuteTotalJobCountGte = lastManualExecuteTotalJobCountGte;
        return this;
    }

    /**
     * Get lastManualExecuteTotalJobCountGte
     *
     * @return lastManualExecuteTotalJobCountGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getLastManualExecuteTotalJobCountGte() {
        return lastManualExecuteTotalJobCountGte;
    }

    public void setLastManualExecuteTotalJobCountGte(Integer lastManualExecuteTotalJobCountGte) {
        this.lastManualExecuteTotalJobCountGte = lastManualExecuteTotalJobCountGte;
    }

    public ReplicationPlanWhereInput lastManualExecuteTotalJobCountGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_TOTAL_JOB_COUNT_GTE);
        return this;
    }

    public ReplicationPlanWhereInput lastManualExecuteTotalJobCountGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_TOTAL_JOB_COUNT_GTE);
        return this;
    }

    public void setLastManualExecuteTotalJobCountGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_TOTAL_JOB_COUNT_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_TOTAL_JOB_COUNT_GTE);
        }
    }

    public boolean getLastManualExecuteTotalJobCountGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_TOTAL_JOB_COUNT_GTE);
    }

    public ReplicationPlanWhereInput lastManualExecuteTotalJobCountIn(
            List<Integer> lastManualExecuteTotalJobCountIn) {

        this.lastManualExecuteTotalJobCountIn = lastManualExecuteTotalJobCountIn;
        return this;
    }

    public ReplicationPlanWhereInput addLastManualExecuteTotalJobCountInItem(
            Integer lastManualExecuteTotalJobCountInItem) {
        if (this.lastManualExecuteTotalJobCountIn == null) {
            this.lastManualExecuteTotalJobCountIn = new ArrayList<Integer>();
        }
        this.lastManualExecuteTotalJobCountIn.add(lastManualExecuteTotalJobCountInItem);
        return this;
    }

    /**
     * Get lastManualExecuteTotalJobCountIn
     *
     * @return lastManualExecuteTotalJobCountIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getLastManualExecuteTotalJobCountIn() {
        return lastManualExecuteTotalJobCountIn;
    }

    public void setLastManualExecuteTotalJobCountIn(
            List<Integer> lastManualExecuteTotalJobCountIn) {
        this.lastManualExecuteTotalJobCountIn = lastManualExecuteTotalJobCountIn;
    }

    public ReplicationPlanWhereInput lastManualExecuteTotalJobCountIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_TOTAL_JOB_COUNT_IN);
        return this;
    }

    public ReplicationPlanWhereInput lastManualExecuteTotalJobCountIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_TOTAL_JOB_COUNT_IN);
        return this;
    }

    public void setLastManualExecuteTotalJobCountIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_TOTAL_JOB_COUNT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_TOTAL_JOB_COUNT_IN);
        }
    }

    public boolean getLastManualExecuteTotalJobCountIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_TOTAL_JOB_COUNT_IN);
    }

    public ReplicationPlanWhereInput lastManualExecuteTotalJobCountLt(
            Integer lastManualExecuteTotalJobCountLt) {

        this.lastManualExecuteTotalJobCountLt = lastManualExecuteTotalJobCountLt;
        return this;
    }

    /**
     * Get lastManualExecuteTotalJobCountLt
     *
     * @return lastManualExecuteTotalJobCountLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getLastManualExecuteTotalJobCountLt() {
        return lastManualExecuteTotalJobCountLt;
    }

    public void setLastManualExecuteTotalJobCountLt(Integer lastManualExecuteTotalJobCountLt) {
        this.lastManualExecuteTotalJobCountLt = lastManualExecuteTotalJobCountLt;
    }

    public ReplicationPlanWhereInput lastManualExecuteTotalJobCountLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_TOTAL_JOB_COUNT_LT);
        return this;
    }

    public ReplicationPlanWhereInput lastManualExecuteTotalJobCountLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_TOTAL_JOB_COUNT_LT);
        return this;
    }

    public void setLastManualExecuteTotalJobCountLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_TOTAL_JOB_COUNT_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_TOTAL_JOB_COUNT_LT);
        }
    }

    public boolean getLastManualExecuteTotalJobCountLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_TOTAL_JOB_COUNT_LT);
    }

    public ReplicationPlanWhereInput lastManualExecuteTotalJobCountLte(
            Integer lastManualExecuteTotalJobCountLte) {

        this.lastManualExecuteTotalJobCountLte = lastManualExecuteTotalJobCountLte;
        return this;
    }

    /**
     * Get lastManualExecuteTotalJobCountLte
     *
     * @return lastManualExecuteTotalJobCountLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getLastManualExecuteTotalJobCountLte() {
        return lastManualExecuteTotalJobCountLte;
    }

    public void setLastManualExecuteTotalJobCountLte(Integer lastManualExecuteTotalJobCountLte) {
        this.lastManualExecuteTotalJobCountLte = lastManualExecuteTotalJobCountLte;
    }

    public ReplicationPlanWhereInput lastManualExecuteTotalJobCountLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_TOTAL_JOB_COUNT_LTE);
        return this;
    }

    public ReplicationPlanWhereInput lastManualExecuteTotalJobCountLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_TOTAL_JOB_COUNT_LTE);
        return this;
    }

    public void setLastManualExecuteTotalJobCountLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_TOTAL_JOB_COUNT_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_TOTAL_JOB_COUNT_LTE);
        }
    }

    public boolean getLastManualExecuteTotalJobCountLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_TOTAL_JOB_COUNT_LTE);
    }

    public ReplicationPlanWhereInput lastManualExecuteTotalJobCountNot(
            Integer lastManualExecuteTotalJobCountNot) {

        this.lastManualExecuteTotalJobCountNot = lastManualExecuteTotalJobCountNot;
        return this;
    }

    /**
     * Get lastManualExecuteTotalJobCountNot
     *
     * @return lastManualExecuteTotalJobCountNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getLastManualExecuteTotalJobCountNot() {
        return lastManualExecuteTotalJobCountNot;
    }

    public void setLastManualExecuteTotalJobCountNot(Integer lastManualExecuteTotalJobCountNot) {
        this.lastManualExecuteTotalJobCountNot = lastManualExecuteTotalJobCountNot;
    }

    public ReplicationPlanWhereInput lastManualExecuteTotalJobCountNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_TOTAL_JOB_COUNT_NOT);
        return this;
    }

    public ReplicationPlanWhereInput lastManualExecuteTotalJobCountNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_TOTAL_JOB_COUNT_NOT);
        return this;
    }

    public void setLastManualExecuteTotalJobCountNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_TOTAL_JOB_COUNT_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_TOTAL_JOB_COUNT_NOT);
        }
    }

    public boolean getLastManualExecuteTotalJobCountNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_TOTAL_JOB_COUNT_NOT);
    }

    public ReplicationPlanWhereInput lastManualExecuteTotalJobCountNotIn(
            List<Integer> lastManualExecuteTotalJobCountNotIn) {

        this.lastManualExecuteTotalJobCountNotIn = lastManualExecuteTotalJobCountNotIn;
        return this;
    }

    public ReplicationPlanWhereInput addLastManualExecuteTotalJobCountNotInItem(
            Integer lastManualExecuteTotalJobCountNotInItem) {
        if (this.lastManualExecuteTotalJobCountNotIn == null) {
            this.lastManualExecuteTotalJobCountNotIn = new ArrayList<Integer>();
        }
        this.lastManualExecuteTotalJobCountNotIn.add(lastManualExecuteTotalJobCountNotInItem);
        return this;
    }

    /**
     * Get lastManualExecuteTotalJobCountNotIn
     *
     * @return lastManualExecuteTotalJobCountNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getLastManualExecuteTotalJobCountNotIn() {
        return lastManualExecuteTotalJobCountNotIn;
    }

    public void setLastManualExecuteTotalJobCountNotIn(
            List<Integer> lastManualExecuteTotalJobCountNotIn) {
        this.lastManualExecuteTotalJobCountNotIn = lastManualExecuteTotalJobCountNotIn;
    }

    public ReplicationPlanWhereInput lastManualExecuteTotalJobCountNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_TOTAL_JOB_COUNT_NOT_IN);
        return this;
    }

    public ReplicationPlanWhereInput lastManualExecuteTotalJobCountNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_TOTAL_JOB_COUNT_NOT_IN);
        return this;
    }

    public void setLastManualExecuteTotalJobCountNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_TOTAL_JOB_COUNT_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_TOTAL_JOB_COUNT_NOT_IN);
        }
    }

    public boolean getLastManualExecuteTotalJobCountNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(
                SERIALIZED_NAME_LAST_MANUAL_EXECUTE_TOTAL_JOB_COUNT_NOT_IN);
    }

    public ReplicationPlanWhereInput lastManualExecutedAt(String lastManualExecutedAt) {

        this.lastManualExecutedAt = lastManualExecutedAt;
        return this;
    }

    /**
     * Get lastManualExecutedAt
     *
     * @return lastManualExecutedAt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLastManualExecutedAt() {
        return lastManualExecutedAt;
    }

    public void setLastManualExecutedAt(String lastManualExecutedAt) {
        this.lastManualExecutedAt = lastManualExecutedAt;
    }

    public ReplicationPlanWhereInput lastManualExecutedAt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTED_AT);
        return this;
    }

    public ReplicationPlanWhereInput lastManualExecutedAt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_MANUAL_EXECUTED_AT);
        return this;
    }

    public void setLastManualExecutedAt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTED_AT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_MANUAL_EXECUTED_AT);
        }
    }

    public boolean getLastManualExecutedAt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LAST_MANUAL_EXECUTED_AT);
    }

    public ReplicationPlanWhereInput lastManualExecutedAtGt(String lastManualExecutedAtGt) {

        this.lastManualExecutedAtGt = lastManualExecutedAtGt;
        return this;
    }

    /**
     * Get lastManualExecutedAtGt
     *
     * @return lastManualExecutedAtGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLastManualExecutedAtGt() {
        return lastManualExecutedAtGt;
    }

    public void setLastManualExecutedAtGt(String lastManualExecutedAtGt) {
        this.lastManualExecutedAtGt = lastManualExecutedAtGt;
    }

    public ReplicationPlanWhereInput lastManualExecutedAtGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTED_AT_GT);
        return this;
    }

    public ReplicationPlanWhereInput lastManualExecutedAtGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_MANUAL_EXECUTED_AT_GT);
        return this;
    }

    public void setLastManualExecutedAtGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTED_AT_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_MANUAL_EXECUTED_AT_GT);
        }
    }

    public boolean getLastManualExecutedAtGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LAST_MANUAL_EXECUTED_AT_GT);
    }

    public ReplicationPlanWhereInput lastManualExecutedAtGte(String lastManualExecutedAtGte) {

        this.lastManualExecutedAtGte = lastManualExecutedAtGte;
        return this;
    }

    /**
     * Get lastManualExecutedAtGte
     *
     * @return lastManualExecutedAtGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLastManualExecutedAtGte() {
        return lastManualExecutedAtGte;
    }

    public void setLastManualExecutedAtGte(String lastManualExecutedAtGte) {
        this.lastManualExecutedAtGte = lastManualExecutedAtGte;
    }

    public ReplicationPlanWhereInput lastManualExecutedAtGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTED_AT_GTE);
        return this;
    }

    public ReplicationPlanWhereInput lastManualExecutedAtGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_MANUAL_EXECUTED_AT_GTE);
        return this;
    }

    public void setLastManualExecutedAtGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTED_AT_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_MANUAL_EXECUTED_AT_GTE);
        }
    }

    public boolean getLastManualExecutedAtGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LAST_MANUAL_EXECUTED_AT_GTE);
    }

    public ReplicationPlanWhereInput lastManualExecutedAtIn(List<String> lastManualExecutedAtIn) {

        this.lastManualExecutedAtIn = lastManualExecutedAtIn;
        return this;
    }

    public ReplicationPlanWhereInput addLastManualExecutedAtInItem(
            String lastManualExecutedAtInItem) {
        if (this.lastManualExecutedAtIn == null) {
            this.lastManualExecutedAtIn = new ArrayList<String>();
        }
        this.lastManualExecutedAtIn.add(lastManualExecutedAtInItem);
        return this;
    }

    /**
     * Get lastManualExecutedAtIn
     *
     * @return lastManualExecutedAtIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getLastManualExecutedAtIn() {
        return lastManualExecutedAtIn;
    }

    public void setLastManualExecutedAtIn(List<String> lastManualExecutedAtIn) {
        this.lastManualExecutedAtIn = lastManualExecutedAtIn;
    }

    public ReplicationPlanWhereInput lastManualExecutedAtIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTED_AT_IN);
        return this;
    }

    public ReplicationPlanWhereInput lastManualExecutedAtIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_MANUAL_EXECUTED_AT_IN);
        return this;
    }

    public void setLastManualExecutedAtIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTED_AT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_MANUAL_EXECUTED_AT_IN);
        }
    }

    public boolean getLastManualExecutedAtIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LAST_MANUAL_EXECUTED_AT_IN);
    }

    public ReplicationPlanWhereInput lastManualExecutedAtLt(String lastManualExecutedAtLt) {

        this.lastManualExecutedAtLt = lastManualExecutedAtLt;
        return this;
    }

    /**
     * Get lastManualExecutedAtLt
     *
     * @return lastManualExecutedAtLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLastManualExecutedAtLt() {
        return lastManualExecutedAtLt;
    }

    public void setLastManualExecutedAtLt(String lastManualExecutedAtLt) {
        this.lastManualExecutedAtLt = lastManualExecutedAtLt;
    }

    public ReplicationPlanWhereInput lastManualExecutedAtLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTED_AT_LT);
        return this;
    }

    public ReplicationPlanWhereInput lastManualExecutedAtLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_MANUAL_EXECUTED_AT_LT);
        return this;
    }

    public void setLastManualExecutedAtLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTED_AT_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_MANUAL_EXECUTED_AT_LT);
        }
    }

    public boolean getLastManualExecutedAtLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LAST_MANUAL_EXECUTED_AT_LT);
    }

    public ReplicationPlanWhereInput lastManualExecutedAtLte(String lastManualExecutedAtLte) {

        this.lastManualExecutedAtLte = lastManualExecutedAtLte;
        return this;
    }

    /**
     * Get lastManualExecutedAtLte
     *
     * @return lastManualExecutedAtLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLastManualExecutedAtLte() {
        return lastManualExecutedAtLte;
    }

    public void setLastManualExecutedAtLte(String lastManualExecutedAtLte) {
        this.lastManualExecutedAtLte = lastManualExecutedAtLte;
    }

    public ReplicationPlanWhereInput lastManualExecutedAtLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTED_AT_LTE);
        return this;
    }

    public ReplicationPlanWhereInput lastManualExecutedAtLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_MANUAL_EXECUTED_AT_LTE);
        return this;
    }

    public void setLastManualExecutedAtLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTED_AT_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_MANUAL_EXECUTED_AT_LTE);
        }
    }

    public boolean getLastManualExecutedAtLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LAST_MANUAL_EXECUTED_AT_LTE);
    }

    public ReplicationPlanWhereInput lastManualExecutedAtNot(String lastManualExecutedAtNot) {

        this.lastManualExecutedAtNot = lastManualExecutedAtNot;
        return this;
    }

    /**
     * Get lastManualExecutedAtNot
     *
     * @return lastManualExecutedAtNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLastManualExecutedAtNot() {
        return lastManualExecutedAtNot;
    }

    public void setLastManualExecutedAtNot(String lastManualExecutedAtNot) {
        this.lastManualExecutedAtNot = lastManualExecutedAtNot;
    }

    public ReplicationPlanWhereInput lastManualExecutedAtNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTED_AT_NOT);
        return this;
    }

    public ReplicationPlanWhereInput lastManualExecutedAtNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_MANUAL_EXECUTED_AT_NOT);
        return this;
    }

    public void setLastManualExecutedAtNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTED_AT_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_MANUAL_EXECUTED_AT_NOT);
        }
    }

    public boolean getLastManualExecutedAtNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LAST_MANUAL_EXECUTED_AT_NOT);
    }

    public ReplicationPlanWhereInput lastManualExecutedAtNotIn(
            List<String> lastManualExecutedAtNotIn) {

        this.lastManualExecutedAtNotIn = lastManualExecutedAtNotIn;
        return this;
    }

    public ReplicationPlanWhereInput addLastManualExecutedAtNotInItem(
            String lastManualExecutedAtNotInItem) {
        if (this.lastManualExecutedAtNotIn == null) {
            this.lastManualExecutedAtNotIn = new ArrayList<String>();
        }
        this.lastManualExecutedAtNotIn.add(lastManualExecutedAtNotInItem);
        return this;
    }

    /**
     * Get lastManualExecutedAtNotIn
     *
     * @return lastManualExecutedAtNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getLastManualExecutedAtNotIn() {
        return lastManualExecutedAtNotIn;
    }

    public void setLastManualExecutedAtNotIn(List<String> lastManualExecutedAtNotIn) {
        this.lastManualExecutedAtNotIn = lastManualExecutedAtNotIn;
    }

    public ReplicationPlanWhereInput lastManualExecutedAtNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTED_AT_NOT_IN);
        return this;
    }

    public ReplicationPlanWhereInput lastManualExecutedAtNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_MANUAL_EXECUTED_AT_NOT_IN);
        return this;
    }

    public void setLastManualExecutedAtNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTED_AT_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_MANUAL_EXECUTED_AT_NOT_IN);
        }
    }

    public boolean getLastManualExecutedAtNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LAST_MANUAL_EXECUTED_AT_NOT_IN);
    }

    public ReplicationPlanWhereInput name(String name) {

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

    public ReplicationPlanWhereInput name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public ReplicationPlanWhereInput name_ExplictlyNonNull() {
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

    public ReplicationPlanWhereInput nameContains(String nameContains) {

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

    public ReplicationPlanWhereInput nameContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_CONTAINS);
        return this;
    }

    public ReplicationPlanWhereInput nameContains_ExplictlyNonNull() {
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

    public ReplicationPlanWhereInput nameEndsWith(String nameEndsWith) {

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

    public ReplicationPlanWhereInput nameEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_ENDS_WITH);
        return this;
    }

    public ReplicationPlanWhereInput nameEndsWith_ExplictlyNonNull() {
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

    public ReplicationPlanWhereInput nameGt(String nameGt) {

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

    public ReplicationPlanWhereInput nameGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_GT);
        return this;
    }

    public ReplicationPlanWhereInput nameGt_ExplictlyNonNull() {
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

    public ReplicationPlanWhereInput nameGte(String nameGte) {

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

    public ReplicationPlanWhereInput nameGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_GTE);
        return this;
    }

    public ReplicationPlanWhereInput nameGte_ExplictlyNonNull() {
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

    public ReplicationPlanWhereInput nameIn(List<String> nameIn) {

        this.nameIn = nameIn;
        return this;
    }

    public ReplicationPlanWhereInput addNameInItem(String nameInItem) {
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

    public ReplicationPlanWhereInput nameIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_IN);
        return this;
    }

    public ReplicationPlanWhereInput nameIn_ExplictlyNonNull() {
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

    public ReplicationPlanWhereInput nameLt(String nameLt) {

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

    public ReplicationPlanWhereInput nameLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_LT);
        return this;
    }

    public ReplicationPlanWhereInput nameLt_ExplictlyNonNull() {
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

    public ReplicationPlanWhereInput nameLte(String nameLte) {

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

    public ReplicationPlanWhereInput nameLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_LTE);
        return this;
    }

    public ReplicationPlanWhereInput nameLte_ExplictlyNonNull() {
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

    public ReplicationPlanWhereInput nameNot(String nameNot) {

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

    public ReplicationPlanWhereInput nameNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT);
        return this;
    }

    public ReplicationPlanWhereInput nameNot_ExplictlyNonNull() {
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

    public ReplicationPlanWhereInput nameNotContains(String nameNotContains) {

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

    public ReplicationPlanWhereInput nameNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_CONTAINS);
        return this;
    }

    public ReplicationPlanWhereInput nameNotContains_ExplictlyNonNull() {
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

    public ReplicationPlanWhereInput nameNotEndsWith(String nameNotEndsWith) {

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

    public ReplicationPlanWhereInput nameNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_ENDS_WITH);
        return this;
    }

    public ReplicationPlanWhereInput nameNotEndsWith_ExplictlyNonNull() {
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

    public ReplicationPlanWhereInput nameNotIn(List<String> nameNotIn) {

        this.nameNotIn = nameNotIn;
        return this;
    }

    public ReplicationPlanWhereInput addNameNotInItem(String nameNotInItem) {
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

    public ReplicationPlanWhereInput nameNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_IN);
        return this;
    }

    public ReplicationPlanWhereInput nameNotIn_ExplictlyNonNull() {
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

    public ReplicationPlanWhereInput nameNotStartsWith(String nameNotStartsWith) {

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

    public ReplicationPlanWhereInput nameNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_STARTS_WITH);
        return this;
    }

    public ReplicationPlanWhereInput nameNotStartsWith_ExplictlyNonNull() {
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

    public ReplicationPlanWhereInput nameStartsWith(String nameStartsWith) {

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

    public ReplicationPlanWhereInput nameStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_STARTS_WITH);
        return this;
    }

    public ReplicationPlanWhereInput nameStartsWith_ExplictlyNonNull() {
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

    public ReplicationPlanWhereInput nextExecutionTime(String nextExecutionTime) {

        this.nextExecutionTime = nextExecutionTime;
        return this;
    }

    /**
     * Get nextExecutionTime
     *
     * @return nextExecutionTime
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNextExecutionTime() {
        return nextExecutionTime;
    }

    public void setNextExecutionTime(String nextExecutionTime) {
        this.nextExecutionTime = nextExecutionTime;
    }

    public ReplicationPlanWhereInput nextExecutionTime_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NEXT_EXECUTION_TIME);
        return this;
    }

    public ReplicationPlanWhereInput nextExecutionTime_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NEXT_EXECUTION_TIME);
        return this;
    }

    public void setNextExecutionTime_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NEXT_EXECUTION_TIME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NEXT_EXECUTION_TIME);
        }
    }

    public boolean getNextExecutionTime_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NEXT_EXECUTION_TIME);
    }

    public ReplicationPlanWhereInput nextExecutionTimeGt(String nextExecutionTimeGt) {

        this.nextExecutionTimeGt = nextExecutionTimeGt;
        return this;
    }

    /**
     * Get nextExecutionTimeGt
     *
     * @return nextExecutionTimeGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNextExecutionTimeGt() {
        return nextExecutionTimeGt;
    }

    public void setNextExecutionTimeGt(String nextExecutionTimeGt) {
        this.nextExecutionTimeGt = nextExecutionTimeGt;
    }

    public ReplicationPlanWhereInput nextExecutionTimeGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NEXT_EXECUTION_TIME_GT);
        return this;
    }

    public ReplicationPlanWhereInput nextExecutionTimeGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NEXT_EXECUTION_TIME_GT);
        return this;
    }

    public void setNextExecutionTimeGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NEXT_EXECUTION_TIME_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NEXT_EXECUTION_TIME_GT);
        }
    }

    public boolean getNextExecutionTimeGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NEXT_EXECUTION_TIME_GT);
    }

    public ReplicationPlanWhereInput nextExecutionTimeGte(String nextExecutionTimeGte) {

        this.nextExecutionTimeGte = nextExecutionTimeGte;
        return this;
    }

    /**
     * Get nextExecutionTimeGte
     *
     * @return nextExecutionTimeGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNextExecutionTimeGte() {
        return nextExecutionTimeGte;
    }

    public void setNextExecutionTimeGte(String nextExecutionTimeGte) {
        this.nextExecutionTimeGte = nextExecutionTimeGte;
    }

    public ReplicationPlanWhereInput nextExecutionTimeGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NEXT_EXECUTION_TIME_GTE);
        return this;
    }

    public ReplicationPlanWhereInput nextExecutionTimeGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NEXT_EXECUTION_TIME_GTE);
        return this;
    }

    public void setNextExecutionTimeGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NEXT_EXECUTION_TIME_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NEXT_EXECUTION_TIME_GTE);
        }
    }

    public boolean getNextExecutionTimeGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NEXT_EXECUTION_TIME_GTE);
    }

    public ReplicationPlanWhereInput nextExecutionTimeIn(List<String> nextExecutionTimeIn) {

        this.nextExecutionTimeIn = nextExecutionTimeIn;
        return this;
    }

    public ReplicationPlanWhereInput addNextExecutionTimeInItem(String nextExecutionTimeInItem) {
        if (this.nextExecutionTimeIn == null) {
            this.nextExecutionTimeIn = new ArrayList<String>();
        }
        this.nextExecutionTimeIn.add(nextExecutionTimeInItem);
        return this;
    }

    /**
     * Get nextExecutionTimeIn
     *
     * @return nextExecutionTimeIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getNextExecutionTimeIn() {
        return nextExecutionTimeIn;
    }

    public void setNextExecutionTimeIn(List<String> nextExecutionTimeIn) {
        this.nextExecutionTimeIn = nextExecutionTimeIn;
    }

    public ReplicationPlanWhereInput nextExecutionTimeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NEXT_EXECUTION_TIME_IN);
        return this;
    }

    public ReplicationPlanWhereInput nextExecutionTimeIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NEXT_EXECUTION_TIME_IN);
        return this;
    }

    public void setNextExecutionTimeIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NEXT_EXECUTION_TIME_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NEXT_EXECUTION_TIME_IN);
        }
    }

    public boolean getNextExecutionTimeIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NEXT_EXECUTION_TIME_IN);
    }

    public ReplicationPlanWhereInput nextExecutionTimeLt(String nextExecutionTimeLt) {

        this.nextExecutionTimeLt = nextExecutionTimeLt;
        return this;
    }

    /**
     * Get nextExecutionTimeLt
     *
     * @return nextExecutionTimeLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNextExecutionTimeLt() {
        return nextExecutionTimeLt;
    }

    public void setNextExecutionTimeLt(String nextExecutionTimeLt) {
        this.nextExecutionTimeLt = nextExecutionTimeLt;
    }

    public ReplicationPlanWhereInput nextExecutionTimeLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NEXT_EXECUTION_TIME_LT);
        return this;
    }

    public ReplicationPlanWhereInput nextExecutionTimeLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NEXT_EXECUTION_TIME_LT);
        return this;
    }

    public void setNextExecutionTimeLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NEXT_EXECUTION_TIME_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NEXT_EXECUTION_TIME_LT);
        }
    }

    public boolean getNextExecutionTimeLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NEXT_EXECUTION_TIME_LT);
    }

    public ReplicationPlanWhereInput nextExecutionTimeLte(String nextExecutionTimeLte) {

        this.nextExecutionTimeLte = nextExecutionTimeLte;
        return this;
    }

    /**
     * Get nextExecutionTimeLte
     *
     * @return nextExecutionTimeLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNextExecutionTimeLte() {
        return nextExecutionTimeLte;
    }

    public void setNextExecutionTimeLte(String nextExecutionTimeLte) {
        this.nextExecutionTimeLte = nextExecutionTimeLte;
    }

    public ReplicationPlanWhereInput nextExecutionTimeLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NEXT_EXECUTION_TIME_LTE);
        return this;
    }

    public ReplicationPlanWhereInput nextExecutionTimeLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NEXT_EXECUTION_TIME_LTE);
        return this;
    }

    public void setNextExecutionTimeLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NEXT_EXECUTION_TIME_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NEXT_EXECUTION_TIME_LTE);
        }
    }

    public boolean getNextExecutionTimeLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NEXT_EXECUTION_TIME_LTE);
    }

    public ReplicationPlanWhereInput nextExecutionTimeNot(String nextExecutionTimeNot) {

        this.nextExecutionTimeNot = nextExecutionTimeNot;
        return this;
    }

    /**
     * Get nextExecutionTimeNot
     *
     * @return nextExecutionTimeNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNextExecutionTimeNot() {
        return nextExecutionTimeNot;
    }

    public void setNextExecutionTimeNot(String nextExecutionTimeNot) {
        this.nextExecutionTimeNot = nextExecutionTimeNot;
    }

    public ReplicationPlanWhereInput nextExecutionTimeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NEXT_EXECUTION_TIME_NOT);
        return this;
    }

    public ReplicationPlanWhereInput nextExecutionTimeNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NEXT_EXECUTION_TIME_NOT);
        return this;
    }

    public void setNextExecutionTimeNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NEXT_EXECUTION_TIME_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NEXT_EXECUTION_TIME_NOT);
        }
    }

    public boolean getNextExecutionTimeNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NEXT_EXECUTION_TIME_NOT);
    }

    public ReplicationPlanWhereInput nextExecutionTimeNotIn(List<String> nextExecutionTimeNotIn) {

        this.nextExecutionTimeNotIn = nextExecutionTimeNotIn;
        return this;
    }

    public ReplicationPlanWhereInput addNextExecutionTimeNotInItem(
            String nextExecutionTimeNotInItem) {
        if (this.nextExecutionTimeNotIn == null) {
            this.nextExecutionTimeNotIn = new ArrayList<String>();
        }
        this.nextExecutionTimeNotIn.add(nextExecutionTimeNotInItem);
        return this;
    }

    /**
     * Get nextExecutionTimeNotIn
     *
     * @return nextExecutionTimeNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getNextExecutionTimeNotIn() {
        return nextExecutionTimeNotIn;
    }

    public void setNextExecutionTimeNotIn(List<String> nextExecutionTimeNotIn) {
        this.nextExecutionTimeNotIn = nextExecutionTimeNotIn;
    }

    public ReplicationPlanWhereInput nextExecutionTimeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NEXT_EXECUTION_TIME_NOT_IN);
        return this;
    }

    public ReplicationPlanWhereInput nextExecutionTimeNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NEXT_EXECUTION_TIME_NOT_IN);
        return this;
    }

    public void setNextExecutionTimeNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NEXT_EXECUTION_TIME_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NEXT_EXECUTION_TIME_NOT_IN);
        }
    }

    public boolean getNextExecutionTimeNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NEXT_EXECUTION_TIME_NOT_IN);
    }

    public ReplicationPlanWhereInput period(ReplicationPlanPeriod period) {

        this.period = period;
        return this;
    }

    /**
     * Get period
     *
     * @return period
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ReplicationPlanPeriod getPeriod() {
        return period;
    }

    public void setPeriod(ReplicationPlanPeriod period) {
        this.period = period;
    }

    public ReplicationPlanWhereInput period_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PERIOD);
        return this;
    }

    public ReplicationPlanWhereInput period_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PERIOD);
        return this;
    }

    public void setPeriod_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PERIOD);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PERIOD);
        }
    }

    public boolean getPeriod_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PERIOD);
    }

    public ReplicationPlanWhereInput periodIn(List<ReplicationPlanPeriod> periodIn) {

        this.periodIn = periodIn;
        return this;
    }

    public ReplicationPlanWhereInput addPeriodInItem(ReplicationPlanPeriod periodInItem) {
        if (this.periodIn == null) {
            this.periodIn = new ArrayList<ReplicationPlanPeriod>();
        }
        this.periodIn.add(periodInItem);
        return this;
    }

    /**
     * Get periodIn
     *
     * @return periodIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<ReplicationPlanPeriod> getPeriodIn() {
        return periodIn;
    }

    public void setPeriodIn(List<ReplicationPlanPeriod> periodIn) {
        this.periodIn = periodIn;
    }

    public ReplicationPlanWhereInput periodIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PERIOD_IN);
        return this;
    }

    public ReplicationPlanWhereInput periodIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PERIOD_IN);
        return this;
    }

    public void setPeriodIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PERIOD_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PERIOD_IN);
        }
    }

    public boolean getPeriodIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PERIOD_IN);
    }

    public ReplicationPlanWhereInput periodNot(ReplicationPlanPeriod periodNot) {

        this.periodNot = periodNot;
        return this;
    }

    /**
     * Get periodNot
     *
     * @return periodNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ReplicationPlanPeriod getPeriodNot() {
        return periodNot;
    }

    public void setPeriodNot(ReplicationPlanPeriod periodNot) {
        this.periodNot = periodNot;
    }

    public ReplicationPlanWhereInput periodNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PERIOD_NOT);
        return this;
    }

    public ReplicationPlanWhereInput periodNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PERIOD_NOT);
        return this;
    }

    public void setPeriodNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PERIOD_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PERIOD_NOT);
        }
    }

    public boolean getPeriodNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PERIOD_NOT);
    }

    public ReplicationPlanWhereInput periodNotIn(List<ReplicationPlanPeriod> periodNotIn) {

        this.periodNotIn = periodNotIn;
        return this;
    }

    public ReplicationPlanWhereInput addPeriodNotInItem(ReplicationPlanPeriod periodNotInItem) {
        if (this.periodNotIn == null) {
            this.periodNotIn = new ArrayList<ReplicationPlanPeriod>();
        }
        this.periodNotIn.add(periodNotInItem);
        return this;
    }

    /**
     * Get periodNotIn
     *
     * @return periodNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<ReplicationPlanPeriod> getPeriodNotIn() {
        return periodNotIn;
    }

    public void setPeriodNotIn(List<ReplicationPlanPeriod> periodNotIn) {
        this.periodNotIn = periodNotIn;
    }

    public ReplicationPlanWhereInput periodNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PERIOD_NOT_IN);
        return this;
    }

    public ReplicationPlanWhereInput periodNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PERIOD_NOT_IN);
        return this;
    }

    public void setPeriodNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PERIOD_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PERIOD_NOT_IN);
        }
    }

    public boolean getPeriodNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PERIOD_NOT_IN);
    }

    public ReplicationPlanWhereInput phase(BackupPlanPhase phase) {

        this.phase = phase;
        return this;
    }

    /**
     * Get phase
     *
     * @return phase
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public BackupPlanPhase getPhase() {
        return phase;
    }

    public void setPhase(BackupPlanPhase phase) {
        this.phase = phase;
    }

    public ReplicationPlanWhereInput phase_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PHASE);
        return this;
    }

    public ReplicationPlanWhereInput phase_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PHASE);
        return this;
    }

    public void setPhase_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PHASE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PHASE);
        }
    }

    public boolean getPhase_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PHASE);
    }

    public ReplicationPlanWhereInput phaseIn(List<BackupPlanPhase> phaseIn) {

        this.phaseIn = phaseIn;
        return this;
    }

    public ReplicationPlanWhereInput addPhaseInItem(BackupPlanPhase phaseInItem) {
        if (this.phaseIn == null) {
            this.phaseIn = new ArrayList<BackupPlanPhase>();
        }
        this.phaseIn.add(phaseInItem);
        return this;
    }

    /**
     * Get phaseIn
     *
     * @return phaseIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<BackupPlanPhase> getPhaseIn() {
        return phaseIn;
    }

    public void setPhaseIn(List<BackupPlanPhase> phaseIn) {
        this.phaseIn = phaseIn;
    }

    public ReplicationPlanWhereInput phaseIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PHASE_IN);
        return this;
    }

    public ReplicationPlanWhereInput phaseIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PHASE_IN);
        return this;
    }

    public void setPhaseIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PHASE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PHASE_IN);
        }
    }

    public boolean getPhaseIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PHASE_IN);
    }

    public ReplicationPlanWhereInput phaseNot(BackupPlanPhase phaseNot) {

        this.phaseNot = phaseNot;
        return this;
    }

    /**
     * Get phaseNot
     *
     * @return phaseNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public BackupPlanPhase getPhaseNot() {
        return phaseNot;
    }

    public void setPhaseNot(BackupPlanPhase phaseNot) {
        this.phaseNot = phaseNot;
    }

    public ReplicationPlanWhereInput phaseNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PHASE_NOT);
        return this;
    }

    public ReplicationPlanWhereInput phaseNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PHASE_NOT);
        return this;
    }

    public void setPhaseNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PHASE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PHASE_NOT);
        }
    }

    public boolean getPhaseNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PHASE_NOT);
    }

    public ReplicationPlanWhereInput phaseNotIn(List<BackupPlanPhase> phaseNotIn) {

        this.phaseNotIn = phaseNotIn;
        return this;
    }

    public ReplicationPlanWhereInput addPhaseNotInItem(BackupPlanPhase phaseNotInItem) {
        if (this.phaseNotIn == null) {
            this.phaseNotIn = new ArrayList<BackupPlanPhase>();
        }
        this.phaseNotIn.add(phaseNotInItem);
        return this;
    }

    /**
     * Get phaseNotIn
     *
     * @return phaseNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<BackupPlanPhase> getPhaseNotIn() {
        return phaseNotIn;
    }

    public void setPhaseNotIn(List<BackupPlanPhase> phaseNotIn) {
        this.phaseNotIn = phaseNotIn;
    }

    public ReplicationPlanWhereInput phaseNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PHASE_NOT_IN);
        return this;
    }

    public ReplicationPlanWhereInput phaseNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PHASE_NOT_IN);
        return this;
    }

    public void setPhaseNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PHASE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PHASE_NOT_IN);
        }
    }

    public boolean getPhaseNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PHASE_NOT_IN);
    }

    public ReplicationPlanWhereInput replicaNameRule(ReplicaNameRule replicaNameRule) {

        this.replicaNameRule = replicaNameRule;
        return this;
    }

    /**
     * Get replicaNameRule
     *
     * @return replicaNameRule
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ReplicaNameRule getReplicaNameRule() {
        return replicaNameRule;
    }

    public void setReplicaNameRule(ReplicaNameRule replicaNameRule) {
        this.replicaNameRule = replicaNameRule;
    }

    public ReplicationPlanWhereInput replicaNameRule_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICA_NAME_RULE);
        return this;
    }

    public ReplicationPlanWhereInput replicaNameRule_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REPLICA_NAME_RULE);
        return this;
    }

    public void setReplicaNameRule_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REPLICA_NAME_RULE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REPLICA_NAME_RULE);
        }
    }

    public boolean getReplicaNameRule_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REPLICA_NAME_RULE);
    }

    public ReplicationPlanWhereInput replicaNameRuleIn(List<ReplicaNameRule> replicaNameRuleIn) {

        this.replicaNameRuleIn = replicaNameRuleIn;
        return this;
    }

    public ReplicationPlanWhereInput addReplicaNameRuleInItem(
            ReplicaNameRule replicaNameRuleInItem) {
        if (this.replicaNameRuleIn == null) {
            this.replicaNameRuleIn = new ArrayList<ReplicaNameRule>();
        }
        this.replicaNameRuleIn.add(replicaNameRuleInItem);
        return this;
    }

    /**
     * Get replicaNameRuleIn
     *
     * @return replicaNameRuleIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<ReplicaNameRule> getReplicaNameRuleIn() {
        return replicaNameRuleIn;
    }

    public void setReplicaNameRuleIn(List<ReplicaNameRule> replicaNameRuleIn) {
        this.replicaNameRuleIn = replicaNameRuleIn;
    }

    public ReplicationPlanWhereInput replicaNameRuleIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICA_NAME_RULE_IN);
        return this;
    }

    public ReplicationPlanWhereInput replicaNameRuleIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REPLICA_NAME_RULE_IN);
        return this;
    }

    public void setReplicaNameRuleIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REPLICA_NAME_RULE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REPLICA_NAME_RULE_IN);
        }
    }

    public boolean getReplicaNameRuleIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REPLICA_NAME_RULE_IN);
    }

    public ReplicationPlanWhereInput replicaNameRuleNot(ReplicaNameRule replicaNameRuleNot) {

        this.replicaNameRuleNot = replicaNameRuleNot;
        return this;
    }

    /**
     * Get replicaNameRuleNot
     *
     * @return replicaNameRuleNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ReplicaNameRule getReplicaNameRuleNot() {
        return replicaNameRuleNot;
    }

    public void setReplicaNameRuleNot(ReplicaNameRule replicaNameRuleNot) {
        this.replicaNameRuleNot = replicaNameRuleNot;
    }

    public ReplicationPlanWhereInput replicaNameRuleNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICA_NAME_RULE_NOT);
        return this;
    }

    public ReplicationPlanWhereInput replicaNameRuleNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REPLICA_NAME_RULE_NOT);
        return this;
    }

    public void setReplicaNameRuleNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REPLICA_NAME_RULE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REPLICA_NAME_RULE_NOT);
        }
    }

    public boolean getReplicaNameRuleNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REPLICA_NAME_RULE_NOT);
    }

    public ReplicationPlanWhereInput replicaNameRuleNotIn(
            List<ReplicaNameRule> replicaNameRuleNotIn) {

        this.replicaNameRuleNotIn = replicaNameRuleNotIn;
        return this;
    }

    public ReplicationPlanWhereInput addReplicaNameRuleNotInItem(
            ReplicaNameRule replicaNameRuleNotInItem) {
        if (this.replicaNameRuleNotIn == null) {
            this.replicaNameRuleNotIn = new ArrayList<ReplicaNameRule>();
        }
        this.replicaNameRuleNotIn.add(replicaNameRuleNotInItem);
        return this;
    }

    /**
     * Get replicaNameRuleNotIn
     *
     * @return replicaNameRuleNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<ReplicaNameRule> getReplicaNameRuleNotIn() {
        return replicaNameRuleNotIn;
    }

    public void setReplicaNameRuleNotIn(List<ReplicaNameRule> replicaNameRuleNotIn) {
        this.replicaNameRuleNotIn = replicaNameRuleNotIn;
    }

    public ReplicationPlanWhereInput replicaNameRuleNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICA_NAME_RULE_NOT_IN);
        return this;
    }

    public ReplicationPlanWhereInput replicaNameRuleNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REPLICA_NAME_RULE_NOT_IN);
        return this;
    }

    public void setReplicaNameRuleNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REPLICA_NAME_RULE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REPLICA_NAME_RULE_NOT_IN);
        }
    }

    public boolean getReplicaNameRuleNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REPLICA_NAME_RULE_NOT_IN);
    }

    public ReplicationPlanWhereInput replicaNameSetting(String replicaNameSetting) {

        this.replicaNameSetting = replicaNameSetting;
        return this;
    }

    /**
     * Get replicaNameSetting
     *
     * @return replicaNameSetting
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getReplicaNameSetting() {
        return replicaNameSetting;
    }

    public void setReplicaNameSetting(String replicaNameSetting) {
        this.replicaNameSetting = replicaNameSetting;
    }

    public ReplicationPlanWhereInput replicaNameSetting_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICA_NAME_SETTING);
        return this;
    }

    public ReplicationPlanWhereInput replicaNameSetting_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REPLICA_NAME_SETTING);
        return this;
    }

    public void setReplicaNameSetting_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REPLICA_NAME_SETTING);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REPLICA_NAME_SETTING);
        }
    }

    public boolean getReplicaNameSetting_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REPLICA_NAME_SETTING);
    }

    public ReplicationPlanWhereInput replicaNameSettingContains(String replicaNameSettingContains) {

        this.replicaNameSettingContains = replicaNameSettingContains;
        return this;
    }

    /**
     * Get replicaNameSettingContains
     *
     * @return replicaNameSettingContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getReplicaNameSettingContains() {
        return replicaNameSettingContains;
    }

    public void setReplicaNameSettingContains(String replicaNameSettingContains) {
        this.replicaNameSettingContains = replicaNameSettingContains;
    }

    public ReplicationPlanWhereInput replicaNameSettingContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICA_NAME_SETTING_CONTAINS);
        return this;
    }

    public ReplicationPlanWhereInput replicaNameSettingContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REPLICA_NAME_SETTING_CONTAINS);
        return this;
    }

    public void setReplicaNameSettingContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REPLICA_NAME_SETTING_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REPLICA_NAME_SETTING_CONTAINS);
        }
    }

    public boolean getReplicaNameSettingContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REPLICA_NAME_SETTING_CONTAINS);
    }

    public ReplicationPlanWhereInput replicaNameSettingEndsWith(String replicaNameSettingEndsWith) {

        this.replicaNameSettingEndsWith = replicaNameSettingEndsWith;
        return this;
    }

    /**
     * Get replicaNameSettingEndsWith
     *
     * @return replicaNameSettingEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getReplicaNameSettingEndsWith() {
        return replicaNameSettingEndsWith;
    }

    public void setReplicaNameSettingEndsWith(String replicaNameSettingEndsWith) {
        this.replicaNameSettingEndsWith = replicaNameSettingEndsWith;
    }

    public ReplicationPlanWhereInput replicaNameSettingEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICA_NAME_SETTING_ENDS_WITH);
        return this;
    }

    public ReplicationPlanWhereInput replicaNameSettingEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REPLICA_NAME_SETTING_ENDS_WITH);
        return this;
    }

    public void setReplicaNameSettingEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REPLICA_NAME_SETTING_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REPLICA_NAME_SETTING_ENDS_WITH);
        }
    }

    public boolean getReplicaNameSettingEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REPLICA_NAME_SETTING_ENDS_WITH);
    }

    public ReplicationPlanWhereInput replicaNameSettingGt(String replicaNameSettingGt) {

        this.replicaNameSettingGt = replicaNameSettingGt;
        return this;
    }

    /**
     * Get replicaNameSettingGt
     *
     * @return replicaNameSettingGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getReplicaNameSettingGt() {
        return replicaNameSettingGt;
    }

    public void setReplicaNameSettingGt(String replicaNameSettingGt) {
        this.replicaNameSettingGt = replicaNameSettingGt;
    }

    public ReplicationPlanWhereInput replicaNameSettingGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICA_NAME_SETTING_GT);
        return this;
    }

    public ReplicationPlanWhereInput replicaNameSettingGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REPLICA_NAME_SETTING_GT);
        return this;
    }

    public void setReplicaNameSettingGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REPLICA_NAME_SETTING_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REPLICA_NAME_SETTING_GT);
        }
    }

    public boolean getReplicaNameSettingGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REPLICA_NAME_SETTING_GT);
    }

    public ReplicationPlanWhereInput replicaNameSettingGte(String replicaNameSettingGte) {

        this.replicaNameSettingGte = replicaNameSettingGte;
        return this;
    }

    /**
     * Get replicaNameSettingGte
     *
     * @return replicaNameSettingGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getReplicaNameSettingGte() {
        return replicaNameSettingGte;
    }

    public void setReplicaNameSettingGte(String replicaNameSettingGte) {
        this.replicaNameSettingGte = replicaNameSettingGte;
    }

    public ReplicationPlanWhereInput replicaNameSettingGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICA_NAME_SETTING_GTE);
        return this;
    }

    public ReplicationPlanWhereInput replicaNameSettingGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REPLICA_NAME_SETTING_GTE);
        return this;
    }

    public void setReplicaNameSettingGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REPLICA_NAME_SETTING_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REPLICA_NAME_SETTING_GTE);
        }
    }

    public boolean getReplicaNameSettingGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REPLICA_NAME_SETTING_GTE);
    }

    public ReplicationPlanWhereInput replicaNameSettingIn(List<String> replicaNameSettingIn) {

        this.replicaNameSettingIn = replicaNameSettingIn;
        return this;
    }

    public ReplicationPlanWhereInput addReplicaNameSettingInItem(String replicaNameSettingInItem) {
        if (this.replicaNameSettingIn == null) {
            this.replicaNameSettingIn = new ArrayList<String>();
        }
        this.replicaNameSettingIn.add(replicaNameSettingInItem);
        return this;
    }

    /**
     * Get replicaNameSettingIn
     *
     * @return replicaNameSettingIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getReplicaNameSettingIn() {
        return replicaNameSettingIn;
    }

    public void setReplicaNameSettingIn(List<String> replicaNameSettingIn) {
        this.replicaNameSettingIn = replicaNameSettingIn;
    }

    public ReplicationPlanWhereInput replicaNameSettingIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICA_NAME_SETTING_IN);
        return this;
    }

    public ReplicationPlanWhereInput replicaNameSettingIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REPLICA_NAME_SETTING_IN);
        return this;
    }

    public void setReplicaNameSettingIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REPLICA_NAME_SETTING_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REPLICA_NAME_SETTING_IN);
        }
    }

    public boolean getReplicaNameSettingIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REPLICA_NAME_SETTING_IN);
    }

    public ReplicationPlanWhereInput replicaNameSettingLt(String replicaNameSettingLt) {

        this.replicaNameSettingLt = replicaNameSettingLt;
        return this;
    }

    /**
     * Get replicaNameSettingLt
     *
     * @return replicaNameSettingLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getReplicaNameSettingLt() {
        return replicaNameSettingLt;
    }

    public void setReplicaNameSettingLt(String replicaNameSettingLt) {
        this.replicaNameSettingLt = replicaNameSettingLt;
    }

    public ReplicationPlanWhereInput replicaNameSettingLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICA_NAME_SETTING_LT);
        return this;
    }

    public ReplicationPlanWhereInput replicaNameSettingLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REPLICA_NAME_SETTING_LT);
        return this;
    }

    public void setReplicaNameSettingLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REPLICA_NAME_SETTING_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REPLICA_NAME_SETTING_LT);
        }
    }

    public boolean getReplicaNameSettingLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REPLICA_NAME_SETTING_LT);
    }

    public ReplicationPlanWhereInput replicaNameSettingLte(String replicaNameSettingLte) {

        this.replicaNameSettingLte = replicaNameSettingLte;
        return this;
    }

    /**
     * Get replicaNameSettingLte
     *
     * @return replicaNameSettingLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getReplicaNameSettingLte() {
        return replicaNameSettingLte;
    }

    public void setReplicaNameSettingLte(String replicaNameSettingLte) {
        this.replicaNameSettingLte = replicaNameSettingLte;
    }

    public ReplicationPlanWhereInput replicaNameSettingLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICA_NAME_SETTING_LTE);
        return this;
    }

    public ReplicationPlanWhereInput replicaNameSettingLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REPLICA_NAME_SETTING_LTE);
        return this;
    }

    public void setReplicaNameSettingLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REPLICA_NAME_SETTING_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REPLICA_NAME_SETTING_LTE);
        }
    }

    public boolean getReplicaNameSettingLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REPLICA_NAME_SETTING_LTE);
    }

    public ReplicationPlanWhereInput replicaNameSettingNot(String replicaNameSettingNot) {

        this.replicaNameSettingNot = replicaNameSettingNot;
        return this;
    }

    /**
     * Get replicaNameSettingNot
     *
     * @return replicaNameSettingNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getReplicaNameSettingNot() {
        return replicaNameSettingNot;
    }

    public void setReplicaNameSettingNot(String replicaNameSettingNot) {
        this.replicaNameSettingNot = replicaNameSettingNot;
    }

    public ReplicationPlanWhereInput replicaNameSettingNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICA_NAME_SETTING_NOT);
        return this;
    }

    public ReplicationPlanWhereInput replicaNameSettingNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REPLICA_NAME_SETTING_NOT);
        return this;
    }

    public void setReplicaNameSettingNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REPLICA_NAME_SETTING_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REPLICA_NAME_SETTING_NOT);
        }
    }

    public boolean getReplicaNameSettingNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REPLICA_NAME_SETTING_NOT);
    }

    public ReplicationPlanWhereInput replicaNameSettingNotContains(
            String replicaNameSettingNotContains) {

        this.replicaNameSettingNotContains = replicaNameSettingNotContains;
        return this;
    }

    /**
     * Get replicaNameSettingNotContains
     *
     * @return replicaNameSettingNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getReplicaNameSettingNotContains() {
        return replicaNameSettingNotContains;
    }

    public void setReplicaNameSettingNotContains(String replicaNameSettingNotContains) {
        this.replicaNameSettingNotContains = replicaNameSettingNotContains;
    }

    public ReplicationPlanWhereInput replicaNameSettingNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICA_NAME_SETTING_NOT_CONTAINS);
        return this;
    }

    public ReplicationPlanWhereInput replicaNameSettingNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REPLICA_NAME_SETTING_NOT_CONTAINS);
        return this;
    }

    public void setReplicaNameSettingNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REPLICA_NAME_SETTING_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REPLICA_NAME_SETTING_NOT_CONTAINS);
        }
    }

    public boolean getReplicaNameSettingNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REPLICA_NAME_SETTING_NOT_CONTAINS);
    }

    public ReplicationPlanWhereInput replicaNameSettingNotEndsWith(
            String replicaNameSettingNotEndsWith) {

        this.replicaNameSettingNotEndsWith = replicaNameSettingNotEndsWith;
        return this;
    }

    /**
     * Get replicaNameSettingNotEndsWith
     *
     * @return replicaNameSettingNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getReplicaNameSettingNotEndsWith() {
        return replicaNameSettingNotEndsWith;
    }

    public void setReplicaNameSettingNotEndsWith(String replicaNameSettingNotEndsWith) {
        this.replicaNameSettingNotEndsWith = replicaNameSettingNotEndsWith;
    }

    public ReplicationPlanWhereInput replicaNameSettingNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICA_NAME_SETTING_NOT_ENDS_WITH);
        return this;
    }

    public ReplicationPlanWhereInput replicaNameSettingNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REPLICA_NAME_SETTING_NOT_ENDS_WITH);
        return this;
    }

    public void setReplicaNameSettingNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REPLICA_NAME_SETTING_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REPLICA_NAME_SETTING_NOT_ENDS_WITH);
        }
    }

    public boolean getReplicaNameSettingNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REPLICA_NAME_SETTING_NOT_ENDS_WITH);
    }

    public ReplicationPlanWhereInput replicaNameSettingNotIn(List<String> replicaNameSettingNotIn) {

        this.replicaNameSettingNotIn = replicaNameSettingNotIn;
        return this;
    }

    public ReplicationPlanWhereInput addReplicaNameSettingNotInItem(
            String replicaNameSettingNotInItem) {
        if (this.replicaNameSettingNotIn == null) {
            this.replicaNameSettingNotIn = new ArrayList<String>();
        }
        this.replicaNameSettingNotIn.add(replicaNameSettingNotInItem);
        return this;
    }

    /**
     * Get replicaNameSettingNotIn
     *
     * @return replicaNameSettingNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getReplicaNameSettingNotIn() {
        return replicaNameSettingNotIn;
    }

    public void setReplicaNameSettingNotIn(List<String> replicaNameSettingNotIn) {
        this.replicaNameSettingNotIn = replicaNameSettingNotIn;
    }

    public ReplicationPlanWhereInput replicaNameSettingNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICA_NAME_SETTING_NOT_IN);
        return this;
    }

    public ReplicationPlanWhereInput replicaNameSettingNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REPLICA_NAME_SETTING_NOT_IN);
        return this;
    }

    public void setReplicaNameSettingNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REPLICA_NAME_SETTING_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REPLICA_NAME_SETTING_NOT_IN);
        }
    }

    public boolean getReplicaNameSettingNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REPLICA_NAME_SETTING_NOT_IN);
    }

    public ReplicationPlanWhereInput replicaNameSettingNotStartsWith(
            String replicaNameSettingNotStartsWith) {

        this.replicaNameSettingNotStartsWith = replicaNameSettingNotStartsWith;
        return this;
    }

    /**
     * Get replicaNameSettingNotStartsWith
     *
     * @return replicaNameSettingNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getReplicaNameSettingNotStartsWith() {
        return replicaNameSettingNotStartsWith;
    }

    public void setReplicaNameSettingNotStartsWith(String replicaNameSettingNotStartsWith) {
        this.replicaNameSettingNotStartsWith = replicaNameSettingNotStartsWith;
    }

    public ReplicationPlanWhereInput replicaNameSettingNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICA_NAME_SETTING_NOT_STARTS_WITH);
        return this;
    }

    public ReplicationPlanWhereInput replicaNameSettingNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REPLICA_NAME_SETTING_NOT_STARTS_WITH);
        return this;
    }

    public void setReplicaNameSettingNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REPLICA_NAME_SETTING_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REPLICA_NAME_SETTING_NOT_STARTS_WITH);
        }
    }

    public boolean getReplicaNameSettingNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REPLICA_NAME_SETTING_NOT_STARTS_WITH);
    }

    public ReplicationPlanWhereInput replicaNameSettingStartsWith(
            String replicaNameSettingStartsWith) {

        this.replicaNameSettingStartsWith = replicaNameSettingStartsWith;
        return this;
    }

    /**
     * Get replicaNameSettingStartsWith
     *
     * @return replicaNameSettingStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getReplicaNameSettingStartsWith() {
        return replicaNameSettingStartsWith;
    }

    public void setReplicaNameSettingStartsWith(String replicaNameSettingStartsWith) {
        this.replicaNameSettingStartsWith = replicaNameSettingStartsWith;
    }

    public ReplicationPlanWhereInput replicaNameSettingStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICA_NAME_SETTING_STARTS_WITH);
        return this;
    }

    public ReplicationPlanWhereInput replicaNameSettingStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REPLICA_NAME_SETTING_STARTS_WITH);
        return this;
    }

    public void setReplicaNameSettingStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REPLICA_NAME_SETTING_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REPLICA_NAME_SETTING_STARTS_WITH);
        }
    }

    public boolean getReplicaNameSettingStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REPLICA_NAME_SETTING_STARTS_WITH);
    }

    public ReplicationPlanWhereInput replicaNum(Integer replicaNum) {

        this.replicaNum = replicaNum;
        return this;
    }

    /**
     * Get replicaNum
     *
     * @return replicaNum
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getReplicaNum() {
        return replicaNum;
    }

    public void setReplicaNum(Integer replicaNum) {
        this.replicaNum = replicaNum;
    }

    public ReplicationPlanWhereInput replicaNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICA_NUM);
        return this;
    }

    public ReplicationPlanWhereInput replicaNum_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REPLICA_NUM);
        return this;
    }

    public void setReplicaNum_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REPLICA_NUM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REPLICA_NUM);
        }
    }

    public boolean getReplicaNum_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REPLICA_NUM);
    }

    public ReplicationPlanWhereInput replicaNumGt(Integer replicaNumGt) {

        this.replicaNumGt = replicaNumGt;
        return this;
    }

    /**
     * Get replicaNumGt
     *
     * @return replicaNumGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getReplicaNumGt() {
        return replicaNumGt;
    }

    public void setReplicaNumGt(Integer replicaNumGt) {
        this.replicaNumGt = replicaNumGt;
    }

    public ReplicationPlanWhereInput replicaNumGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICA_NUM_GT);
        return this;
    }

    public ReplicationPlanWhereInput replicaNumGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REPLICA_NUM_GT);
        return this;
    }

    public void setReplicaNumGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REPLICA_NUM_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REPLICA_NUM_GT);
        }
    }

    public boolean getReplicaNumGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REPLICA_NUM_GT);
    }

    public ReplicationPlanWhereInput replicaNumGte(Integer replicaNumGte) {

        this.replicaNumGte = replicaNumGte;
        return this;
    }

    /**
     * Get replicaNumGte
     *
     * @return replicaNumGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getReplicaNumGte() {
        return replicaNumGte;
    }

    public void setReplicaNumGte(Integer replicaNumGte) {
        this.replicaNumGte = replicaNumGte;
    }

    public ReplicationPlanWhereInput replicaNumGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICA_NUM_GTE);
        return this;
    }

    public ReplicationPlanWhereInput replicaNumGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REPLICA_NUM_GTE);
        return this;
    }

    public void setReplicaNumGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REPLICA_NUM_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REPLICA_NUM_GTE);
        }
    }

    public boolean getReplicaNumGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REPLICA_NUM_GTE);
    }

    public ReplicationPlanWhereInput replicaNumIn(List<Integer> replicaNumIn) {

        this.replicaNumIn = replicaNumIn;
        return this;
    }

    public ReplicationPlanWhereInput addReplicaNumInItem(Integer replicaNumInItem) {
        if (this.replicaNumIn == null) {
            this.replicaNumIn = new ArrayList<Integer>();
        }
        this.replicaNumIn.add(replicaNumInItem);
        return this;
    }

    /**
     * Get replicaNumIn
     *
     * @return replicaNumIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getReplicaNumIn() {
        return replicaNumIn;
    }

    public void setReplicaNumIn(List<Integer> replicaNumIn) {
        this.replicaNumIn = replicaNumIn;
    }

    public ReplicationPlanWhereInput replicaNumIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICA_NUM_IN);
        return this;
    }

    public ReplicationPlanWhereInput replicaNumIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REPLICA_NUM_IN);
        return this;
    }

    public void setReplicaNumIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REPLICA_NUM_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REPLICA_NUM_IN);
        }
    }

    public boolean getReplicaNumIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REPLICA_NUM_IN);
    }

    public ReplicationPlanWhereInput replicaNumLt(Integer replicaNumLt) {

        this.replicaNumLt = replicaNumLt;
        return this;
    }

    /**
     * Get replicaNumLt
     *
     * @return replicaNumLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getReplicaNumLt() {
        return replicaNumLt;
    }

    public void setReplicaNumLt(Integer replicaNumLt) {
        this.replicaNumLt = replicaNumLt;
    }

    public ReplicationPlanWhereInput replicaNumLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICA_NUM_LT);
        return this;
    }

    public ReplicationPlanWhereInput replicaNumLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REPLICA_NUM_LT);
        return this;
    }

    public void setReplicaNumLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REPLICA_NUM_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REPLICA_NUM_LT);
        }
    }

    public boolean getReplicaNumLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REPLICA_NUM_LT);
    }

    public ReplicationPlanWhereInput replicaNumLte(Integer replicaNumLte) {

        this.replicaNumLte = replicaNumLte;
        return this;
    }

    /**
     * Get replicaNumLte
     *
     * @return replicaNumLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getReplicaNumLte() {
        return replicaNumLte;
    }

    public void setReplicaNumLte(Integer replicaNumLte) {
        this.replicaNumLte = replicaNumLte;
    }

    public ReplicationPlanWhereInput replicaNumLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICA_NUM_LTE);
        return this;
    }

    public ReplicationPlanWhereInput replicaNumLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REPLICA_NUM_LTE);
        return this;
    }

    public void setReplicaNumLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REPLICA_NUM_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REPLICA_NUM_LTE);
        }
    }

    public boolean getReplicaNumLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REPLICA_NUM_LTE);
    }

    public ReplicationPlanWhereInput replicaNumNot(Integer replicaNumNot) {

        this.replicaNumNot = replicaNumNot;
        return this;
    }

    /**
     * Get replicaNumNot
     *
     * @return replicaNumNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getReplicaNumNot() {
        return replicaNumNot;
    }

    public void setReplicaNumNot(Integer replicaNumNot) {
        this.replicaNumNot = replicaNumNot;
    }

    public ReplicationPlanWhereInput replicaNumNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICA_NUM_NOT);
        return this;
    }

    public ReplicationPlanWhereInput replicaNumNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REPLICA_NUM_NOT);
        return this;
    }

    public void setReplicaNumNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REPLICA_NUM_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REPLICA_NUM_NOT);
        }
    }

    public boolean getReplicaNumNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REPLICA_NUM_NOT);
    }

    public ReplicationPlanWhereInput replicaNumNotIn(List<Integer> replicaNumNotIn) {

        this.replicaNumNotIn = replicaNumNotIn;
        return this;
    }

    public ReplicationPlanWhereInput addReplicaNumNotInItem(Integer replicaNumNotInItem) {
        if (this.replicaNumNotIn == null) {
            this.replicaNumNotIn = new ArrayList<Integer>();
        }
        this.replicaNumNotIn.add(replicaNumNotInItem);
        return this;
    }

    /**
     * Get replicaNumNotIn
     *
     * @return replicaNumNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getReplicaNumNotIn() {
        return replicaNumNotIn;
    }

    public void setReplicaNumNotIn(List<Integer> replicaNumNotIn) {
        this.replicaNumNotIn = replicaNumNotIn;
    }

    public ReplicationPlanWhereInput replicaNumNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICA_NUM_NOT_IN);
        return this;
    }

    public ReplicationPlanWhereInput replicaNumNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REPLICA_NUM_NOT_IN);
        return this;
    }

    public void setReplicaNumNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REPLICA_NUM_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REPLICA_NUM_NOT_IN);
        }
    }

    public boolean getReplicaNumNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REPLICA_NUM_NOT_IN);
    }

    public ReplicationPlanWhereInput replicaVmsEvery(ReplicaVmWhereInput replicaVmsEvery) {

        this.replicaVmsEvery = replicaVmsEvery;
        return this;
    }

    /**
     * Get replicaVmsEvery
     *
     * @return replicaVmsEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ReplicaVmWhereInput getReplicaVmsEvery() {
        return replicaVmsEvery;
    }

    public void setReplicaVmsEvery(ReplicaVmWhereInput replicaVmsEvery) {
        this.replicaVmsEvery = replicaVmsEvery;
    }

    public ReplicationPlanWhereInput replicaVmsEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICA_VMS_EVERY);
        return this;
    }

    public ReplicationPlanWhereInput replicaVmsEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REPLICA_VMS_EVERY);
        return this;
    }

    public void setReplicaVmsEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REPLICA_VMS_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REPLICA_VMS_EVERY);
        }
    }

    public boolean getReplicaVmsEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REPLICA_VMS_EVERY);
    }

    public ReplicationPlanWhereInput replicaVmsNone(ReplicaVmWhereInput replicaVmsNone) {

        this.replicaVmsNone = replicaVmsNone;
        return this;
    }

    /**
     * Get replicaVmsNone
     *
     * @return replicaVmsNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ReplicaVmWhereInput getReplicaVmsNone() {
        return replicaVmsNone;
    }

    public void setReplicaVmsNone(ReplicaVmWhereInput replicaVmsNone) {
        this.replicaVmsNone = replicaVmsNone;
    }

    public ReplicationPlanWhereInput replicaVmsNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICA_VMS_NONE);
        return this;
    }

    public ReplicationPlanWhereInput replicaVmsNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REPLICA_VMS_NONE);
        return this;
    }

    public void setReplicaVmsNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REPLICA_VMS_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REPLICA_VMS_NONE);
        }
    }

    public boolean getReplicaVmsNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REPLICA_VMS_NONE);
    }

    public ReplicationPlanWhereInput replicaVmsSome(ReplicaVmWhereInput replicaVmsSome) {

        this.replicaVmsSome = replicaVmsSome;
        return this;
    }

    /**
     * Get replicaVmsSome
     *
     * @return replicaVmsSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ReplicaVmWhereInput getReplicaVmsSome() {
        return replicaVmsSome;
    }

    public void setReplicaVmsSome(ReplicaVmWhereInput replicaVmsSome) {
        this.replicaVmsSome = replicaVmsSome;
    }

    public ReplicationPlanWhereInput replicaVmsSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICA_VMS_SOME);
        return this;
    }

    public ReplicationPlanWhereInput replicaVmsSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REPLICA_VMS_SOME);
        return this;
    }

    public void setReplicaVmsSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REPLICA_VMS_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REPLICA_VMS_SOME);
        }
    }

    public boolean getReplicaVmsSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REPLICA_VMS_SOME);
    }

    public ReplicationPlanWhereInput replicationPlanExecutionsEvery(
            ReplicationPlanExecutionWhereInput replicationPlanExecutionsEvery) {

        this.replicationPlanExecutionsEvery = replicationPlanExecutionsEvery;
        return this;
    }

    /**
     * Get replicationPlanExecutionsEvery
     *
     * @return replicationPlanExecutionsEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ReplicationPlanExecutionWhereInput getReplicationPlanExecutionsEvery() {
        return replicationPlanExecutionsEvery;
    }

    public void setReplicationPlanExecutionsEvery(
            ReplicationPlanExecutionWhereInput replicationPlanExecutionsEvery) {
        this.replicationPlanExecutionsEvery = replicationPlanExecutionsEvery;
    }

    public ReplicationPlanWhereInput replicationPlanExecutionsEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICATION_PLAN_EXECUTIONS_EVERY);
        return this;
    }

    public ReplicationPlanWhereInput replicationPlanExecutionsEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REPLICATION_PLAN_EXECUTIONS_EVERY);
        return this;
    }

    public void setReplicationPlanExecutionsEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REPLICATION_PLAN_EXECUTIONS_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REPLICATION_PLAN_EXECUTIONS_EVERY);
        }
    }

    public boolean getReplicationPlanExecutionsEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REPLICATION_PLAN_EXECUTIONS_EVERY);
    }

    public ReplicationPlanWhereInput replicationPlanExecutionsNone(
            ReplicationPlanExecutionWhereInput replicationPlanExecutionsNone) {

        this.replicationPlanExecutionsNone = replicationPlanExecutionsNone;
        return this;
    }

    /**
     * Get replicationPlanExecutionsNone
     *
     * @return replicationPlanExecutionsNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ReplicationPlanExecutionWhereInput getReplicationPlanExecutionsNone() {
        return replicationPlanExecutionsNone;
    }

    public void setReplicationPlanExecutionsNone(
            ReplicationPlanExecutionWhereInput replicationPlanExecutionsNone) {
        this.replicationPlanExecutionsNone = replicationPlanExecutionsNone;
    }

    public ReplicationPlanWhereInput replicationPlanExecutionsNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICATION_PLAN_EXECUTIONS_NONE);
        return this;
    }

    public ReplicationPlanWhereInput replicationPlanExecutionsNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REPLICATION_PLAN_EXECUTIONS_NONE);
        return this;
    }

    public void setReplicationPlanExecutionsNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REPLICATION_PLAN_EXECUTIONS_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REPLICATION_PLAN_EXECUTIONS_NONE);
        }
    }

    public boolean getReplicationPlanExecutionsNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REPLICATION_PLAN_EXECUTIONS_NONE);
    }

    public ReplicationPlanWhereInput replicationPlanExecutionsSome(
            ReplicationPlanExecutionWhereInput replicationPlanExecutionsSome) {

        this.replicationPlanExecutionsSome = replicationPlanExecutionsSome;
        return this;
    }

    /**
     * Get replicationPlanExecutionsSome
     *
     * @return replicationPlanExecutionsSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ReplicationPlanExecutionWhereInput getReplicationPlanExecutionsSome() {
        return replicationPlanExecutionsSome;
    }

    public void setReplicationPlanExecutionsSome(
            ReplicationPlanExecutionWhereInput replicationPlanExecutionsSome) {
        this.replicationPlanExecutionsSome = replicationPlanExecutionsSome;
    }

    public ReplicationPlanWhereInput replicationPlanExecutionsSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICATION_PLAN_EXECUTIONS_SOME);
        return this;
    }

    public ReplicationPlanWhereInput replicationPlanExecutionsSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REPLICATION_PLAN_EXECUTIONS_SOME);
        return this;
    }

    public void setReplicationPlanExecutionsSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REPLICATION_PLAN_EXECUTIONS_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REPLICATION_PLAN_EXECUTIONS_SOME);
        }
    }

    public boolean getReplicationPlanExecutionsSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REPLICATION_PLAN_EXECUTIONS_SOME);
    }

    public ReplicationPlanWhereInput replicationRestorePointsEvery(
            ReplicationRestorePointWhereInput replicationRestorePointsEvery) {

        this.replicationRestorePointsEvery = replicationRestorePointsEvery;
        return this;
    }

    /**
     * Get replicationRestorePointsEvery
     *
     * @return replicationRestorePointsEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ReplicationRestorePointWhereInput getReplicationRestorePointsEvery() {
        return replicationRestorePointsEvery;
    }

    public void setReplicationRestorePointsEvery(
            ReplicationRestorePointWhereInput replicationRestorePointsEvery) {
        this.replicationRestorePointsEvery = replicationRestorePointsEvery;
    }

    public ReplicationPlanWhereInput replicationRestorePointsEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICATION_RESTORE_POINTS_EVERY);
        return this;
    }

    public ReplicationPlanWhereInput replicationRestorePointsEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REPLICATION_RESTORE_POINTS_EVERY);
        return this;
    }

    public void setReplicationRestorePointsEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REPLICATION_RESTORE_POINTS_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REPLICATION_RESTORE_POINTS_EVERY);
        }
    }

    public boolean getReplicationRestorePointsEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REPLICATION_RESTORE_POINTS_EVERY);
    }

    public ReplicationPlanWhereInput replicationRestorePointsNone(
            ReplicationRestorePointWhereInput replicationRestorePointsNone) {

        this.replicationRestorePointsNone = replicationRestorePointsNone;
        return this;
    }

    /**
     * Get replicationRestorePointsNone
     *
     * @return replicationRestorePointsNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ReplicationRestorePointWhereInput getReplicationRestorePointsNone() {
        return replicationRestorePointsNone;
    }

    public void setReplicationRestorePointsNone(
            ReplicationRestorePointWhereInput replicationRestorePointsNone) {
        this.replicationRestorePointsNone = replicationRestorePointsNone;
    }

    public ReplicationPlanWhereInput replicationRestorePointsNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICATION_RESTORE_POINTS_NONE);
        return this;
    }

    public ReplicationPlanWhereInput replicationRestorePointsNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REPLICATION_RESTORE_POINTS_NONE);
        return this;
    }

    public void setReplicationRestorePointsNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REPLICATION_RESTORE_POINTS_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REPLICATION_RESTORE_POINTS_NONE);
        }
    }

    public boolean getReplicationRestorePointsNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REPLICATION_RESTORE_POINTS_NONE);
    }

    public ReplicationPlanWhereInput replicationRestorePointsSome(
            ReplicationRestorePointWhereInput replicationRestorePointsSome) {

        this.replicationRestorePointsSome = replicationRestorePointsSome;
        return this;
    }

    /**
     * Get replicationRestorePointsSome
     *
     * @return replicationRestorePointsSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ReplicationRestorePointWhereInput getReplicationRestorePointsSome() {
        return replicationRestorePointsSome;
    }

    public void setReplicationRestorePointsSome(
            ReplicationRestorePointWhereInput replicationRestorePointsSome) {
        this.replicationRestorePointsSome = replicationRestorePointsSome;
    }

    public ReplicationPlanWhereInput replicationRestorePointsSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICATION_RESTORE_POINTS_SOME);
        return this;
    }

    public ReplicationPlanWhereInput replicationRestorePointsSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REPLICATION_RESTORE_POINTS_SOME);
        return this;
    }

    public void setReplicationRestorePointsSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REPLICATION_RESTORE_POINTS_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REPLICATION_RESTORE_POINTS_SOME);
        }
    }

    public boolean getReplicationRestorePointsSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REPLICATION_RESTORE_POINTS_SOME);
    }

    public ReplicationPlanWhereInput replicationTargetExecutionsEvery(
            ReplicationTargetExecutionWhereInput replicationTargetExecutionsEvery) {

        this.replicationTargetExecutionsEvery = replicationTargetExecutionsEvery;
        return this;
    }

    /**
     * Get replicationTargetExecutionsEvery
     *
     * @return replicationTargetExecutionsEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ReplicationTargetExecutionWhereInput getReplicationTargetExecutionsEvery() {
        return replicationTargetExecutionsEvery;
    }

    public void setReplicationTargetExecutionsEvery(
            ReplicationTargetExecutionWhereInput replicationTargetExecutionsEvery) {
        this.replicationTargetExecutionsEvery = replicationTargetExecutionsEvery;
    }

    public ReplicationPlanWhereInput replicationTargetExecutionsEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICATION_TARGET_EXECUTIONS_EVERY);
        return this;
    }

    public ReplicationPlanWhereInput replicationTargetExecutionsEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REPLICATION_TARGET_EXECUTIONS_EVERY);
        return this;
    }

    public void setReplicationTargetExecutionsEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REPLICATION_TARGET_EXECUTIONS_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REPLICATION_TARGET_EXECUTIONS_EVERY);
        }
    }

    public boolean getReplicationTargetExecutionsEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REPLICATION_TARGET_EXECUTIONS_EVERY);
    }

    public ReplicationPlanWhereInput replicationTargetExecutionsNone(
            ReplicationTargetExecutionWhereInput replicationTargetExecutionsNone) {

        this.replicationTargetExecutionsNone = replicationTargetExecutionsNone;
        return this;
    }

    /**
     * Get replicationTargetExecutionsNone
     *
     * @return replicationTargetExecutionsNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ReplicationTargetExecutionWhereInput getReplicationTargetExecutionsNone() {
        return replicationTargetExecutionsNone;
    }

    public void setReplicationTargetExecutionsNone(
            ReplicationTargetExecutionWhereInput replicationTargetExecutionsNone) {
        this.replicationTargetExecutionsNone = replicationTargetExecutionsNone;
    }

    public ReplicationPlanWhereInput replicationTargetExecutionsNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICATION_TARGET_EXECUTIONS_NONE);
        return this;
    }

    public ReplicationPlanWhereInput replicationTargetExecutionsNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REPLICATION_TARGET_EXECUTIONS_NONE);
        return this;
    }

    public void setReplicationTargetExecutionsNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REPLICATION_TARGET_EXECUTIONS_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REPLICATION_TARGET_EXECUTIONS_NONE);
        }
    }

    public boolean getReplicationTargetExecutionsNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REPLICATION_TARGET_EXECUTIONS_NONE);
    }

    public ReplicationPlanWhereInput replicationTargetExecutionsSome(
            ReplicationTargetExecutionWhereInput replicationTargetExecutionsSome) {

        this.replicationTargetExecutionsSome = replicationTargetExecutionsSome;
        return this;
    }

    /**
     * Get replicationTargetExecutionsSome
     *
     * @return replicationTargetExecutionsSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ReplicationTargetExecutionWhereInput getReplicationTargetExecutionsSome() {
        return replicationTargetExecutionsSome;
    }

    public void setReplicationTargetExecutionsSome(
            ReplicationTargetExecutionWhereInput replicationTargetExecutionsSome) {
        this.replicationTargetExecutionsSome = replicationTargetExecutionsSome;
    }

    public ReplicationPlanWhereInput replicationTargetExecutionsSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICATION_TARGET_EXECUTIONS_SOME);
        return this;
    }

    public ReplicationPlanWhereInput replicationTargetExecutionsSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REPLICATION_TARGET_EXECUTIONS_SOME);
        return this;
    }

    public void setReplicationTargetExecutionsSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REPLICATION_TARGET_EXECUTIONS_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REPLICATION_TARGET_EXECUTIONS_SOME);
        }
    }

    public boolean getReplicationTargetExecutionsSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REPLICATION_TARGET_EXECUTIONS_SOME);
    }

    public ReplicationPlanWhereInput resiliencyType(ResiliencyType resiliencyType) {

        this.resiliencyType = resiliencyType;
        return this;
    }

    /**
     * Get resiliencyType
     *
     * @return resiliencyType
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ResiliencyType getResiliencyType() {
        return resiliencyType;
    }

    public void setResiliencyType(ResiliencyType resiliencyType) {
        this.resiliencyType = resiliencyType;
    }

    public ReplicationPlanWhereInput resiliencyType_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESILIENCY_TYPE);
        return this;
    }

    public ReplicationPlanWhereInput resiliencyType_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESILIENCY_TYPE);
        return this;
    }

    public void setResiliencyType_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESILIENCY_TYPE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESILIENCY_TYPE);
        }
    }

    public boolean getResiliencyType_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESILIENCY_TYPE);
    }

    public ReplicationPlanWhereInput resiliencyTypeIn(List<ResiliencyType> resiliencyTypeIn) {

        this.resiliencyTypeIn = resiliencyTypeIn;
        return this;
    }

    public ReplicationPlanWhereInput addResiliencyTypeInItem(ResiliencyType resiliencyTypeInItem) {
        if (this.resiliencyTypeIn == null) {
            this.resiliencyTypeIn = new ArrayList<ResiliencyType>();
        }
        this.resiliencyTypeIn.add(resiliencyTypeInItem);
        return this;
    }

    /**
     * Get resiliencyTypeIn
     *
     * @return resiliencyTypeIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<ResiliencyType> getResiliencyTypeIn() {
        return resiliencyTypeIn;
    }

    public void setResiliencyTypeIn(List<ResiliencyType> resiliencyTypeIn) {
        this.resiliencyTypeIn = resiliencyTypeIn;
    }

    public ReplicationPlanWhereInput resiliencyTypeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESILIENCY_TYPE_IN);
        return this;
    }

    public ReplicationPlanWhereInput resiliencyTypeIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESILIENCY_TYPE_IN);
        return this;
    }

    public void setResiliencyTypeIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESILIENCY_TYPE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESILIENCY_TYPE_IN);
        }
    }

    public boolean getResiliencyTypeIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESILIENCY_TYPE_IN);
    }

    public ReplicationPlanWhereInput resiliencyTypeNot(ResiliencyType resiliencyTypeNot) {

        this.resiliencyTypeNot = resiliencyTypeNot;
        return this;
    }

    /**
     * Get resiliencyTypeNot
     *
     * @return resiliencyTypeNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ResiliencyType getResiliencyTypeNot() {
        return resiliencyTypeNot;
    }

    public void setResiliencyTypeNot(ResiliencyType resiliencyTypeNot) {
        this.resiliencyTypeNot = resiliencyTypeNot;
    }

    public ReplicationPlanWhereInput resiliencyTypeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESILIENCY_TYPE_NOT);
        return this;
    }

    public ReplicationPlanWhereInput resiliencyTypeNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESILIENCY_TYPE_NOT);
        return this;
    }

    public void setResiliencyTypeNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESILIENCY_TYPE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESILIENCY_TYPE_NOT);
        }
    }

    public boolean getResiliencyTypeNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESILIENCY_TYPE_NOT);
    }

    public ReplicationPlanWhereInput resiliencyTypeNotIn(List<ResiliencyType> resiliencyTypeNotIn) {

        this.resiliencyTypeNotIn = resiliencyTypeNotIn;
        return this;
    }

    public ReplicationPlanWhereInput addResiliencyTypeNotInItem(
            ResiliencyType resiliencyTypeNotInItem) {
        if (this.resiliencyTypeNotIn == null) {
            this.resiliencyTypeNotIn = new ArrayList<ResiliencyType>();
        }
        this.resiliencyTypeNotIn.add(resiliencyTypeNotInItem);
        return this;
    }

    /**
     * Get resiliencyTypeNotIn
     *
     * @return resiliencyTypeNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<ResiliencyType> getResiliencyTypeNotIn() {
        return resiliencyTypeNotIn;
    }

    public void setResiliencyTypeNotIn(List<ResiliencyType> resiliencyTypeNotIn) {
        this.resiliencyTypeNotIn = resiliencyTypeNotIn;
    }

    public ReplicationPlanWhereInput resiliencyTypeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESILIENCY_TYPE_NOT_IN);
        return this;
    }

    public ReplicationPlanWhereInput resiliencyTypeNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESILIENCY_TYPE_NOT_IN);
        return this;
    }

    public void setResiliencyTypeNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESILIENCY_TYPE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESILIENCY_TYPE_NOT_IN);
        }
    }

    public boolean getResiliencyTypeNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESILIENCY_TYPE_NOT_IN);
    }

    public ReplicationPlanWhereInput snapshotConsistentType(ConsistentType snapshotConsistentType) {

        this.snapshotConsistentType = snapshotConsistentType;
        return this;
    }

    /**
     * Get snapshotConsistentType
     *
     * @return snapshotConsistentType
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ConsistentType getSnapshotConsistentType() {
        return snapshotConsistentType;
    }

    public void setSnapshotConsistentType(ConsistentType snapshotConsistentType) {
        this.snapshotConsistentType = snapshotConsistentType;
    }

    public ReplicationPlanWhereInput snapshotConsistentType_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT_CONSISTENT_TYPE);
        return this;
    }

    public ReplicationPlanWhereInput snapshotConsistentType_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SNAPSHOT_CONSISTENT_TYPE);
        return this;
    }

    public void setSnapshotConsistentType_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT_CONSISTENT_TYPE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SNAPSHOT_CONSISTENT_TYPE);
        }
    }

    public boolean getSnapshotConsistentType_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SNAPSHOT_CONSISTENT_TYPE);
    }

    public ReplicationPlanWhereInput snapshotConsistentTypeIn(
            List<ConsistentType> snapshotConsistentTypeIn) {

        this.snapshotConsistentTypeIn = snapshotConsistentTypeIn;
        return this;
    }

    public ReplicationPlanWhereInput addSnapshotConsistentTypeInItem(
            ConsistentType snapshotConsistentTypeInItem) {
        if (this.snapshotConsistentTypeIn == null) {
            this.snapshotConsistentTypeIn = new ArrayList<ConsistentType>();
        }
        this.snapshotConsistentTypeIn.add(snapshotConsistentTypeInItem);
        return this;
    }

    /**
     * Get snapshotConsistentTypeIn
     *
     * @return snapshotConsistentTypeIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<ConsistentType> getSnapshotConsistentTypeIn() {
        return snapshotConsistentTypeIn;
    }

    public void setSnapshotConsistentTypeIn(List<ConsistentType> snapshotConsistentTypeIn) {
        this.snapshotConsistentTypeIn = snapshotConsistentTypeIn;
    }

    public ReplicationPlanWhereInput snapshotConsistentTypeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT_CONSISTENT_TYPE_IN);
        return this;
    }

    public ReplicationPlanWhereInput snapshotConsistentTypeIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SNAPSHOT_CONSISTENT_TYPE_IN);
        return this;
    }

    public void setSnapshotConsistentTypeIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT_CONSISTENT_TYPE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SNAPSHOT_CONSISTENT_TYPE_IN);
        }
    }

    public boolean getSnapshotConsistentTypeIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SNAPSHOT_CONSISTENT_TYPE_IN);
    }

    public ReplicationPlanWhereInput snapshotConsistentTypeNot(
            ConsistentType snapshotConsistentTypeNot) {

        this.snapshotConsistentTypeNot = snapshotConsistentTypeNot;
        return this;
    }

    /**
     * Get snapshotConsistentTypeNot
     *
     * @return snapshotConsistentTypeNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ConsistentType getSnapshotConsistentTypeNot() {
        return snapshotConsistentTypeNot;
    }

    public void setSnapshotConsistentTypeNot(ConsistentType snapshotConsistentTypeNot) {
        this.snapshotConsistentTypeNot = snapshotConsistentTypeNot;
    }

    public ReplicationPlanWhereInput snapshotConsistentTypeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT_CONSISTENT_TYPE_NOT);
        return this;
    }

    public ReplicationPlanWhereInput snapshotConsistentTypeNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SNAPSHOT_CONSISTENT_TYPE_NOT);
        return this;
    }

    public void setSnapshotConsistentTypeNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT_CONSISTENT_TYPE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SNAPSHOT_CONSISTENT_TYPE_NOT);
        }
    }

    public boolean getSnapshotConsistentTypeNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SNAPSHOT_CONSISTENT_TYPE_NOT);
    }

    public ReplicationPlanWhereInput snapshotConsistentTypeNotIn(
            List<ConsistentType> snapshotConsistentTypeNotIn) {

        this.snapshotConsistentTypeNotIn = snapshotConsistentTypeNotIn;
        return this;
    }

    public ReplicationPlanWhereInput addSnapshotConsistentTypeNotInItem(
            ConsistentType snapshotConsistentTypeNotInItem) {
        if (this.snapshotConsistentTypeNotIn == null) {
            this.snapshotConsistentTypeNotIn = new ArrayList<ConsistentType>();
        }
        this.snapshotConsistentTypeNotIn.add(snapshotConsistentTypeNotInItem);
        return this;
    }

    /**
     * Get snapshotConsistentTypeNotIn
     *
     * @return snapshotConsistentTypeNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<ConsistentType> getSnapshotConsistentTypeNotIn() {
        return snapshotConsistentTypeNotIn;
    }

    public void setSnapshotConsistentTypeNotIn(List<ConsistentType> snapshotConsistentTypeNotIn) {
        this.snapshotConsistentTypeNotIn = snapshotConsistentTypeNotIn;
    }

    public ReplicationPlanWhereInput snapshotConsistentTypeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT_CONSISTENT_TYPE_NOT_IN);
        return this;
    }

    public ReplicationPlanWhereInput snapshotConsistentTypeNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SNAPSHOT_CONSISTENT_TYPE_NOT_IN);
        return this;
    }

    public void setSnapshotConsistentTypeNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT_CONSISTENT_TYPE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SNAPSHOT_CONSISTENT_TYPE_NOT_IN);
        }
    }

    public boolean getSnapshotConsistentTypeNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SNAPSHOT_CONSISTENT_TYPE_NOT_IN);
    }

    public ReplicationPlanWhereInput status(BackupPlanStatus status) {

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
    public BackupPlanStatus getStatus() {
        return status;
    }

    public void setStatus(BackupPlanStatus status) {
        this.status = status;
    }

    public ReplicationPlanWhereInput status_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATUS);
        return this;
    }

    public ReplicationPlanWhereInput status_ExplictlyNonNull() {
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

    public ReplicationPlanWhereInput statusIn(List<BackupPlanStatus> statusIn) {

        this.statusIn = statusIn;
        return this;
    }

    public ReplicationPlanWhereInput addStatusInItem(BackupPlanStatus statusInItem) {
        if (this.statusIn == null) {
            this.statusIn = new ArrayList<BackupPlanStatus>();
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
    public List<BackupPlanStatus> getStatusIn() {
        return statusIn;
    }

    public void setStatusIn(List<BackupPlanStatus> statusIn) {
        this.statusIn = statusIn;
    }

    public ReplicationPlanWhereInput statusIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATUS_IN);
        return this;
    }

    public ReplicationPlanWhereInput statusIn_ExplictlyNonNull() {
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

    public ReplicationPlanWhereInput statusNot(BackupPlanStatus statusNot) {

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
    public BackupPlanStatus getStatusNot() {
        return statusNot;
    }

    public void setStatusNot(BackupPlanStatus statusNot) {
        this.statusNot = statusNot;
    }

    public ReplicationPlanWhereInput statusNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATUS_NOT);
        return this;
    }

    public ReplicationPlanWhereInput statusNot_ExplictlyNonNull() {
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

    public ReplicationPlanWhereInput statusNotIn(List<BackupPlanStatus> statusNotIn) {

        this.statusNotIn = statusNotIn;
        return this;
    }

    public ReplicationPlanWhereInput addStatusNotInItem(BackupPlanStatus statusNotInItem) {
        if (this.statusNotIn == null) {
            this.statusNotIn = new ArrayList<BackupPlanStatus>();
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
    public List<BackupPlanStatus> getStatusNotIn() {
        return statusNotIn;
    }

    public void setStatusNotIn(List<BackupPlanStatus> statusNotIn) {
        this.statusNotIn = statusNotIn;
    }

    public ReplicationPlanWhereInput statusNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATUS_NOT_IN);
        return this;
    }

    public ReplicationPlanWhereInput statusNotIn_ExplictlyNonNull() {
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

    public ReplicationPlanWhereInput storagePolicy(VmVolumeElfStoragePolicyType storagePolicy) {

        this.storagePolicy = storagePolicy;
        return this;
    }

    /**
     * Get storagePolicy
     *
     * @return storagePolicy
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmVolumeElfStoragePolicyType getStoragePolicy() {
        return storagePolicy;
    }

    public void setStoragePolicy(VmVolumeElfStoragePolicyType storagePolicy) {
        this.storagePolicy = storagePolicy;
    }

    public ReplicationPlanWhereInput storagePolicy_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_POLICY);
        return this;
    }

    public ReplicationPlanWhereInput storagePolicy_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_POLICY);
        return this;
    }

    public void setStoragePolicy_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_POLICY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_POLICY);
        }
    }

    public boolean getStoragePolicy_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_POLICY);
    }

    public ReplicationPlanWhereInput storagePolicyIn(
            List<VmVolumeElfStoragePolicyType> storagePolicyIn) {

        this.storagePolicyIn = storagePolicyIn;
        return this;
    }

    public ReplicationPlanWhereInput addStoragePolicyInItem(
            VmVolumeElfStoragePolicyType storagePolicyInItem) {
        if (this.storagePolicyIn == null) {
            this.storagePolicyIn = new ArrayList<VmVolumeElfStoragePolicyType>();
        }
        this.storagePolicyIn.add(storagePolicyInItem);
        return this;
    }

    /**
     * Get storagePolicyIn
     *
     * @return storagePolicyIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<VmVolumeElfStoragePolicyType> getStoragePolicyIn() {
        return storagePolicyIn;
    }

    public void setStoragePolicyIn(List<VmVolumeElfStoragePolicyType> storagePolicyIn) {
        this.storagePolicyIn = storagePolicyIn;
    }

    public ReplicationPlanWhereInput storagePolicyIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_POLICY_IN);
        return this;
    }

    public ReplicationPlanWhereInput storagePolicyIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_POLICY_IN);
        return this;
    }

    public void setStoragePolicyIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_POLICY_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_POLICY_IN);
        }
    }

    public boolean getStoragePolicyIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_POLICY_IN);
    }

    public ReplicationPlanWhereInput storagePolicyNot(
            VmVolumeElfStoragePolicyType storagePolicyNot) {

        this.storagePolicyNot = storagePolicyNot;
        return this;
    }

    /**
     * Get storagePolicyNot
     *
     * @return storagePolicyNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmVolumeElfStoragePolicyType getStoragePolicyNot() {
        return storagePolicyNot;
    }

    public void setStoragePolicyNot(VmVolumeElfStoragePolicyType storagePolicyNot) {
        this.storagePolicyNot = storagePolicyNot;
    }

    public ReplicationPlanWhereInput storagePolicyNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_POLICY_NOT);
        return this;
    }

    public ReplicationPlanWhereInput storagePolicyNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_POLICY_NOT);
        return this;
    }

    public void setStoragePolicyNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_POLICY_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_POLICY_NOT);
        }
    }

    public boolean getStoragePolicyNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_POLICY_NOT);
    }

    public ReplicationPlanWhereInput storagePolicyNotIn(
            List<VmVolumeElfStoragePolicyType> storagePolicyNotIn) {

        this.storagePolicyNotIn = storagePolicyNotIn;
        return this;
    }

    public ReplicationPlanWhereInput addStoragePolicyNotInItem(
            VmVolumeElfStoragePolicyType storagePolicyNotInItem) {
        if (this.storagePolicyNotIn == null) {
            this.storagePolicyNotIn = new ArrayList<VmVolumeElfStoragePolicyType>();
        }
        this.storagePolicyNotIn.add(storagePolicyNotInItem);
        return this;
    }

    /**
     * Get storagePolicyNotIn
     *
     * @return storagePolicyNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<VmVolumeElfStoragePolicyType> getStoragePolicyNotIn() {
        return storagePolicyNotIn;
    }

    public void setStoragePolicyNotIn(List<VmVolumeElfStoragePolicyType> storagePolicyNotIn) {
        this.storagePolicyNotIn = storagePolicyNotIn;
    }

    public ReplicationPlanWhereInput storagePolicyNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_POLICY_NOT_IN);
        return this;
    }

    public ReplicationPlanWhereInput storagePolicyNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_POLICY_NOT_IN);
        return this;
    }

    public void setStoragePolicyNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_POLICY_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_POLICY_NOT_IN);
        }
    }

    public boolean getStoragePolicyNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_POLICY_NOT_IN);
    }

    public ReplicationPlanWhereInput targetCluster(ClusterWhereInput targetCluster) {

        this.targetCluster = targetCluster;
        return this;
    }

    /**
     * Get targetCluster
     *
     * @return targetCluster
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ClusterWhereInput getTargetCluster() {
        return targetCluster;
    }

    public void setTargetCluster(ClusterWhereInput targetCluster) {
        this.targetCluster = targetCluster;
    }

    public ReplicationPlanWhereInput targetCluster_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TARGET_CLUSTER);
        return this;
    }

    public ReplicationPlanWhereInput targetCluster_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TARGET_CLUSTER);
        return this;
    }

    public void setTargetCluster_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TARGET_CLUSTER);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TARGET_CLUSTER);
        }
    }

    public boolean getTargetCluster_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TARGET_CLUSTER);
    }

    public ReplicationPlanWhereInput targetReplicationService(
            ReplicationServiceWhereInput targetReplicationService) {

        this.targetReplicationService = targetReplicationService;
        return this;
    }

    /**
     * Get targetReplicationService
     *
     * @return targetReplicationService
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ReplicationServiceWhereInput getTargetReplicationService() {
        return targetReplicationService;
    }

    public void setTargetReplicationService(ReplicationServiceWhereInput targetReplicationService) {
        this.targetReplicationService = targetReplicationService;
    }

    public ReplicationPlanWhereInput targetReplicationService_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TARGET_REPLICATION_SERVICE);
        return this;
    }

    public ReplicationPlanWhereInput targetReplicationService_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TARGET_REPLICATION_SERVICE);
        return this;
    }

    public void setTargetReplicationService_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TARGET_REPLICATION_SERVICE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TARGET_REPLICATION_SERVICE);
        }
    }

    public boolean getTargetReplicationService_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TARGET_REPLICATION_SERVICE);
    }

    public ReplicationPlanWhereInput thinProvision(Boolean thinProvision) {

        this.thinProvision = thinProvision;
        return this;
    }

    /**
     * Get thinProvision
     *
     * @return thinProvision
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getThinProvision() {
        return thinProvision;
    }

    public void setThinProvision(Boolean thinProvision) {
        this.thinProvision = thinProvision;
    }

    public ReplicationPlanWhereInput thinProvision_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_THIN_PROVISION);
        return this;
    }

    public ReplicationPlanWhereInput thinProvision_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_THIN_PROVISION);
        return this;
    }

    public void setThinProvision_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_THIN_PROVISION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_THIN_PROVISION);
        }
    }

    public boolean getThinProvision_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_THIN_PROVISION);
    }

    public ReplicationPlanWhereInput thinProvisionNot(Boolean thinProvisionNot) {

        this.thinProvisionNot = thinProvisionNot;
        return this;
    }

    /**
     * Get thinProvisionNot
     *
     * @return thinProvisionNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getThinProvisionNot() {
        return thinProvisionNot;
    }

    public void setThinProvisionNot(Boolean thinProvisionNot) {
        this.thinProvisionNot = thinProvisionNot;
    }

    public ReplicationPlanWhereInput thinProvisionNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_THIN_PROVISION_NOT);
        return this;
    }

    public ReplicationPlanWhereInput thinProvisionNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_THIN_PROVISION_NOT);
        return this;
    }

    public void setThinProvisionNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_THIN_PROVISION_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_THIN_PROVISION_NOT);
        }
    }

    public boolean getThinProvisionNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_THIN_PROVISION_NOT);
    }

    public ReplicationPlanWhereInput type(ReplicationPlanType type) {

        this.type = type;
        return this;
    }

    /**
     * Get type
     *
     * @return type
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ReplicationPlanType getType() {
        return type;
    }

    public void setType(ReplicationPlanType type) {
        this.type = type;
    }

    public ReplicationPlanWhereInput type_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE);
        return this;
    }

    public ReplicationPlanWhereInput type_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TYPE);
        return this;
    }

    public void setType_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TYPE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TYPE);
        }
    }

    public boolean getType_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TYPE);
    }

    public ReplicationPlanWhereInput typeIn(List<ReplicationPlanType> typeIn) {

        this.typeIn = typeIn;
        return this;
    }

    public ReplicationPlanWhereInput addTypeInItem(ReplicationPlanType typeInItem) {
        if (this.typeIn == null) {
            this.typeIn = new ArrayList<ReplicationPlanType>();
        }
        this.typeIn.add(typeInItem);
        return this;
    }

    /**
     * Get typeIn
     *
     * @return typeIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<ReplicationPlanType> getTypeIn() {
        return typeIn;
    }

    public void setTypeIn(List<ReplicationPlanType> typeIn) {
        this.typeIn = typeIn;
    }

    public ReplicationPlanWhereInput typeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE_IN);
        return this;
    }

    public ReplicationPlanWhereInput typeIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TYPE_IN);
        return this;
    }

    public void setTypeIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TYPE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TYPE_IN);
        }
    }

    public boolean getTypeIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TYPE_IN);
    }

    public ReplicationPlanWhereInput typeNot(ReplicationPlanType typeNot) {

        this.typeNot = typeNot;
        return this;
    }

    /**
     * Get typeNot
     *
     * @return typeNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ReplicationPlanType getTypeNot() {
        return typeNot;
    }

    public void setTypeNot(ReplicationPlanType typeNot) {
        this.typeNot = typeNot;
    }

    public ReplicationPlanWhereInput typeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE_NOT);
        return this;
    }

    public ReplicationPlanWhereInput typeNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TYPE_NOT);
        return this;
    }

    public void setTypeNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TYPE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TYPE_NOT);
        }
    }

    public boolean getTypeNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TYPE_NOT);
    }

    public ReplicationPlanWhereInput typeNotIn(List<ReplicationPlanType> typeNotIn) {

        this.typeNotIn = typeNotIn;
        return this;
    }

    public ReplicationPlanWhereInput addTypeNotInItem(ReplicationPlanType typeNotInItem) {
        if (this.typeNotIn == null) {
            this.typeNotIn = new ArrayList<ReplicationPlanType>();
        }
        this.typeNotIn.add(typeNotInItem);
        return this;
    }

    /**
     * Get typeNotIn
     *
     * @return typeNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<ReplicationPlanType> getTypeNotIn() {
        return typeNotIn;
    }

    public void setTypeNotIn(List<ReplicationPlanType> typeNotIn) {
        this.typeNotIn = typeNotIn;
    }

    public ReplicationPlanWhereInput typeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE_NOT_IN);
        return this;
    }

    public ReplicationPlanWhereInput typeNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TYPE_NOT_IN);
        return this;
    }

    public void setTypeNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TYPE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TYPE_NOT_IN);
        }
    }

    public boolean getTypeNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TYPE_NOT_IN);
    }

    public ReplicationPlanWhereInput updatedAt(String updatedAt) {

        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Get updatedAt
     *
     * @return updatedAt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public ReplicationPlanWhereInput updatedAt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPDATED_AT);
        return this;
    }

    public ReplicationPlanWhereInput updatedAt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UPDATED_AT);
        return this;
    }

    public void setUpdatedAt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UPDATED_AT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UPDATED_AT);
        }
    }

    public boolean getUpdatedAt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UPDATED_AT);
    }

    public ReplicationPlanWhereInput updatedAtGt(String updatedAtGt) {

        this.updatedAtGt = updatedAtGt;
        return this;
    }

    /**
     * Get updatedAtGt
     *
     * @return updatedAtGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUpdatedAtGt() {
        return updatedAtGt;
    }

    public void setUpdatedAtGt(String updatedAtGt) {
        this.updatedAtGt = updatedAtGt;
    }

    public ReplicationPlanWhereInput updatedAtGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPDATED_AT_GT);
        return this;
    }

    public ReplicationPlanWhereInput updatedAtGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UPDATED_AT_GT);
        return this;
    }

    public void setUpdatedAtGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UPDATED_AT_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UPDATED_AT_GT);
        }
    }

    public boolean getUpdatedAtGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UPDATED_AT_GT);
    }

    public ReplicationPlanWhereInput updatedAtGte(String updatedAtGte) {

        this.updatedAtGte = updatedAtGte;
        return this;
    }

    /**
     * Get updatedAtGte
     *
     * @return updatedAtGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUpdatedAtGte() {
        return updatedAtGte;
    }

    public void setUpdatedAtGte(String updatedAtGte) {
        this.updatedAtGte = updatedAtGte;
    }

    public ReplicationPlanWhereInput updatedAtGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPDATED_AT_GTE);
        return this;
    }

    public ReplicationPlanWhereInput updatedAtGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UPDATED_AT_GTE);
        return this;
    }

    public void setUpdatedAtGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UPDATED_AT_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UPDATED_AT_GTE);
        }
    }

    public boolean getUpdatedAtGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UPDATED_AT_GTE);
    }

    public ReplicationPlanWhereInput updatedAtIn(List<String> updatedAtIn) {

        this.updatedAtIn = updatedAtIn;
        return this;
    }

    public ReplicationPlanWhereInput addUpdatedAtInItem(String updatedAtInItem) {
        if (this.updatedAtIn == null) {
            this.updatedAtIn = new ArrayList<String>();
        }
        this.updatedAtIn.add(updatedAtInItem);
        return this;
    }

    /**
     * Get updatedAtIn
     *
     * @return updatedAtIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getUpdatedAtIn() {
        return updatedAtIn;
    }

    public void setUpdatedAtIn(List<String> updatedAtIn) {
        this.updatedAtIn = updatedAtIn;
    }

    public ReplicationPlanWhereInput updatedAtIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPDATED_AT_IN);
        return this;
    }

    public ReplicationPlanWhereInput updatedAtIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UPDATED_AT_IN);
        return this;
    }

    public void setUpdatedAtIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UPDATED_AT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UPDATED_AT_IN);
        }
    }

    public boolean getUpdatedAtIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UPDATED_AT_IN);
    }

    public ReplicationPlanWhereInput updatedAtLt(String updatedAtLt) {

        this.updatedAtLt = updatedAtLt;
        return this;
    }

    /**
     * Get updatedAtLt
     *
     * @return updatedAtLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUpdatedAtLt() {
        return updatedAtLt;
    }

    public void setUpdatedAtLt(String updatedAtLt) {
        this.updatedAtLt = updatedAtLt;
    }

    public ReplicationPlanWhereInput updatedAtLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPDATED_AT_LT);
        return this;
    }

    public ReplicationPlanWhereInput updatedAtLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UPDATED_AT_LT);
        return this;
    }

    public void setUpdatedAtLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UPDATED_AT_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UPDATED_AT_LT);
        }
    }

    public boolean getUpdatedAtLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UPDATED_AT_LT);
    }

    public ReplicationPlanWhereInput updatedAtLte(String updatedAtLte) {

        this.updatedAtLte = updatedAtLte;
        return this;
    }

    /**
     * Get updatedAtLte
     *
     * @return updatedAtLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUpdatedAtLte() {
        return updatedAtLte;
    }

    public void setUpdatedAtLte(String updatedAtLte) {
        this.updatedAtLte = updatedAtLte;
    }

    public ReplicationPlanWhereInput updatedAtLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPDATED_AT_LTE);
        return this;
    }

    public ReplicationPlanWhereInput updatedAtLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UPDATED_AT_LTE);
        return this;
    }

    public void setUpdatedAtLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UPDATED_AT_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UPDATED_AT_LTE);
        }
    }

    public boolean getUpdatedAtLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UPDATED_AT_LTE);
    }

    public ReplicationPlanWhereInput updatedAtNot(String updatedAtNot) {

        this.updatedAtNot = updatedAtNot;
        return this;
    }

    /**
     * Get updatedAtNot
     *
     * @return updatedAtNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUpdatedAtNot() {
        return updatedAtNot;
    }

    public void setUpdatedAtNot(String updatedAtNot) {
        this.updatedAtNot = updatedAtNot;
    }

    public ReplicationPlanWhereInput updatedAtNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPDATED_AT_NOT);
        return this;
    }

    public ReplicationPlanWhereInput updatedAtNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UPDATED_AT_NOT);
        return this;
    }

    public void setUpdatedAtNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UPDATED_AT_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UPDATED_AT_NOT);
        }
    }

    public boolean getUpdatedAtNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UPDATED_AT_NOT);
    }

    public ReplicationPlanWhereInput updatedAtNotIn(List<String> updatedAtNotIn) {

        this.updatedAtNotIn = updatedAtNotIn;
        return this;
    }

    public ReplicationPlanWhereInput addUpdatedAtNotInItem(String updatedAtNotInItem) {
        if (this.updatedAtNotIn == null) {
            this.updatedAtNotIn = new ArrayList<String>();
        }
        this.updatedAtNotIn.add(updatedAtNotInItem);
        return this;
    }

    /**
     * Get updatedAtNotIn
     *
     * @return updatedAtNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getUpdatedAtNotIn() {
        return updatedAtNotIn;
    }

    public void setUpdatedAtNotIn(List<String> updatedAtNotIn) {
        this.updatedAtNotIn = updatedAtNotIn;
    }

    public ReplicationPlanWhereInput updatedAtNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPDATED_AT_NOT_IN);
        return this;
    }

    public ReplicationPlanWhereInput updatedAtNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UPDATED_AT_NOT_IN);
        return this;
    }

    public void setUpdatedAtNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UPDATED_AT_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UPDATED_AT_NOT_IN);
        }
    }

    public boolean getUpdatedAtNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UPDATED_AT_NOT_IN);
    }

    public ReplicationPlanWhereInput vmsEvery(VmWhereInput vmsEvery) {

        this.vmsEvery = vmsEvery;
        return this;
    }

    /**
     * Get vmsEvery
     *
     * @return vmsEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmWhereInput getVmsEvery() {
        return vmsEvery;
    }

    public void setVmsEvery(VmWhereInput vmsEvery) {
        this.vmsEvery = vmsEvery;
    }

    public ReplicationPlanWhereInput vmsEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VMS_EVERY);
        return this;
    }

    public ReplicationPlanWhereInput vmsEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VMS_EVERY);
        return this;
    }

    public void setVmsEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VMS_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VMS_EVERY);
        }
    }

    public boolean getVmsEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VMS_EVERY);
    }

    public ReplicationPlanWhereInput vmsNone(VmWhereInput vmsNone) {

        this.vmsNone = vmsNone;
        return this;
    }

    /**
     * Get vmsNone
     *
     * @return vmsNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmWhereInput getVmsNone() {
        return vmsNone;
    }

    public void setVmsNone(VmWhereInput vmsNone) {
        this.vmsNone = vmsNone;
    }

    public ReplicationPlanWhereInput vmsNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VMS_NONE);
        return this;
    }

    public ReplicationPlanWhereInput vmsNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VMS_NONE);
        return this;
    }

    public void setVmsNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VMS_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VMS_NONE);
        }
    }

    public boolean getVmsNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VMS_NONE);
    }

    public ReplicationPlanWhereInput vmsSome(VmWhereInput vmsSome) {

        this.vmsSome = vmsSome;
        return this;
    }

    /**
     * Get vmsSome
     *
     * @return vmsSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmWhereInput getVmsSome() {
        return vmsSome;
    }

    public void setVmsSome(VmWhereInput vmsSome) {
        this.vmsSome = vmsSome;
    }

    public ReplicationPlanWhereInput vmsSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VMS_SOME);
        return this;
    }

    public ReplicationPlanWhereInput vmsSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VMS_SOME);
        return this;
    }

    public void setVmsSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VMS_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VMS_SOME);
        }
    }

    public boolean getVmsSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VMS_SOME);
    }

    public ReplicationPlanWhereInput windowEnd(String windowEnd) {

        this.windowEnd = windowEnd;
        return this;
    }

    /**
     * Get windowEnd
     *
     * @return windowEnd
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getWindowEnd() {
        return windowEnd;
    }

    public void setWindowEnd(String windowEnd) {
        this.windowEnd = windowEnd;
    }

    public ReplicationPlanWhereInput windowEnd_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WINDOW_END);
        return this;
    }

    public ReplicationPlanWhereInput windowEnd_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_WINDOW_END);
        return this;
    }

    public void setWindowEnd_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_WINDOW_END);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_WINDOW_END);
        }
    }

    public boolean getWindowEnd_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_WINDOW_END);
    }

    public ReplicationPlanWhereInput windowEndContains(String windowEndContains) {

        this.windowEndContains = windowEndContains;
        return this;
    }

    /**
     * Get windowEndContains
     *
     * @return windowEndContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getWindowEndContains() {
        return windowEndContains;
    }

    public void setWindowEndContains(String windowEndContains) {
        this.windowEndContains = windowEndContains;
    }

    public ReplicationPlanWhereInput windowEndContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WINDOW_END_CONTAINS);
        return this;
    }

    public ReplicationPlanWhereInput windowEndContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_WINDOW_END_CONTAINS);
        return this;
    }

    public void setWindowEndContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_WINDOW_END_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_WINDOW_END_CONTAINS);
        }
    }

    public boolean getWindowEndContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_WINDOW_END_CONTAINS);
    }

    public ReplicationPlanWhereInput windowEndEndsWith(String windowEndEndsWith) {

        this.windowEndEndsWith = windowEndEndsWith;
        return this;
    }

    /**
     * Get windowEndEndsWith
     *
     * @return windowEndEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getWindowEndEndsWith() {
        return windowEndEndsWith;
    }

    public void setWindowEndEndsWith(String windowEndEndsWith) {
        this.windowEndEndsWith = windowEndEndsWith;
    }

    public ReplicationPlanWhereInput windowEndEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WINDOW_END_ENDS_WITH);
        return this;
    }

    public ReplicationPlanWhereInput windowEndEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_WINDOW_END_ENDS_WITH);
        return this;
    }

    public void setWindowEndEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_WINDOW_END_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_WINDOW_END_ENDS_WITH);
        }
    }

    public boolean getWindowEndEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_WINDOW_END_ENDS_WITH);
    }

    public ReplicationPlanWhereInput windowEndGt(String windowEndGt) {

        this.windowEndGt = windowEndGt;
        return this;
    }

    /**
     * Get windowEndGt
     *
     * @return windowEndGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getWindowEndGt() {
        return windowEndGt;
    }

    public void setWindowEndGt(String windowEndGt) {
        this.windowEndGt = windowEndGt;
    }

    public ReplicationPlanWhereInput windowEndGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WINDOW_END_GT);
        return this;
    }

    public ReplicationPlanWhereInput windowEndGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_WINDOW_END_GT);
        return this;
    }

    public void setWindowEndGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_WINDOW_END_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_WINDOW_END_GT);
        }
    }

    public boolean getWindowEndGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_WINDOW_END_GT);
    }

    public ReplicationPlanWhereInput windowEndGte(String windowEndGte) {

        this.windowEndGte = windowEndGte;
        return this;
    }

    /**
     * Get windowEndGte
     *
     * @return windowEndGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getWindowEndGte() {
        return windowEndGte;
    }

    public void setWindowEndGte(String windowEndGte) {
        this.windowEndGte = windowEndGte;
    }

    public ReplicationPlanWhereInput windowEndGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WINDOW_END_GTE);
        return this;
    }

    public ReplicationPlanWhereInput windowEndGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_WINDOW_END_GTE);
        return this;
    }

    public void setWindowEndGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_WINDOW_END_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_WINDOW_END_GTE);
        }
    }

    public boolean getWindowEndGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_WINDOW_END_GTE);
    }

    public ReplicationPlanWhereInput windowEndIn(List<String> windowEndIn) {

        this.windowEndIn = windowEndIn;
        return this;
    }

    public ReplicationPlanWhereInput addWindowEndInItem(String windowEndInItem) {
        if (this.windowEndIn == null) {
            this.windowEndIn = new ArrayList<String>();
        }
        this.windowEndIn.add(windowEndInItem);
        return this;
    }

    /**
     * Get windowEndIn
     *
     * @return windowEndIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getWindowEndIn() {
        return windowEndIn;
    }

    public void setWindowEndIn(List<String> windowEndIn) {
        this.windowEndIn = windowEndIn;
    }

    public ReplicationPlanWhereInput windowEndIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WINDOW_END_IN);
        return this;
    }

    public ReplicationPlanWhereInput windowEndIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_WINDOW_END_IN);
        return this;
    }

    public void setWindowEndIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_WINDOW_END_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_WINDOW_END_IN);
        }
    }

    public boolean getWindowEndIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_WINDOW_END_IN);
    }

    public ReplicationPlanWhereInput windowEndLt(String windowEndLt) {

        this.windowEndLt = windowEndLt;
        return this;
    }

    /**
     * Get windowEndLt
     *
     * @return windowEndLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getWindowEndLt() {
        return windowEndLt;
    }

    public void setWindowEndLt(String windowEndLt) {
        this.windowEndLt = windowEndLt;
    }

    public ReplicationPlanWhereInput windowEndLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WINDOW_END_LT);
        return this;
    }

    public ReplicationPlanWhereInput windowEndLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_WINDOW_END_LT);
        return this;
    }

    public void setWindowEndLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_WINDOW_END_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_WINDOW_END_LT);
        }
    }

    public boolean getWindowEndLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_WINDOW_END_LT);
    }

    public ReplicationPlanWhereInput windowEndLte(String windowEndLte) {

        this.windowEndLte = windowEndLte;
        return this;
    }

    /**
     * Get windowEndLte
     *
     * @return windowEndLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getWindowEndLte() {
        return windowEndLte;
    }

    public void setWindowEndLte(String windowEndLte) {
        this.windowEndLte = windowEndLte;
    }

    public ReplicationPlanWhereInput windowEndLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WINDOW_END_LTE);
        return this;
    }

    public ReplicationPlanWhereInput windowEndLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_WINDOW_END_LTE);
        return this;
    }

    public void setWindowEndLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_WINDOW_END_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_WINDOW_END_LTE);
        }
    }

    public boolean getWindowEndLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_WINDOW_END_LTE);
    }

    public ReplicationPlanWhereInput windowEndNot(String windowEndNot) {

        this.windowEndNot = windowEndNot;
        return this;
    }

    /**
     * Get windowEndNot
     *
     * @return windowEndNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getWindowEndNot() {
        return windowEndNot;
    }

    public void setWindowEndNot(String windowEndNot) {
        this.windowEndNot = windowEndNot;
    }

    public ReplicationPlanWhereInput windowEndNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WINDOW_END_NOT);
        return this;
    }

    public ReplicationPlanWhereInput windowEndNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_WINDOW_END_NOT);
        return this;
    }

    public void setWindowEndNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_WINDOW_END_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_WINDOW_END_NOT);
        }
    }

    public boolean getWindowEndNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_WINDOW_END_NOT);
    }

    public ReplicationPlanWhereInput windowEndNotContains(String windowEndNotContains) {

        this.windowEndNotContains = windowEndNotContains;
        return this;
    }

    /**
     * Get windowEndNotContains
     *
     * @return windowEndNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getWindowEndNotContains() {
        return windowEndNotContains;
    }

    public void setWindowEndNotContains(String windowEndNotContains) {
        this.windowEndNotContains = windowEndNotContains;
    }

    public ReplicationPlanWhereInput windowEndNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WINDOW_END_NOT_CONTAINS);
        return this;
    }

    public ReplicationPlanWhereInput windowEndNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_WINDOW_END_NOT_CONTAINS);
        return this;
    }

    public void setWindowEndNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_WINDOW_END_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_WINDOW_END_NOT_CONTAINS);
        }
    }

    public boolean getWindowEndNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_WINDOW_END_NOT_CONTAINS);
    }

    public ReplicationPlanWhereInput windowEndNotEndsWith(String windowEndNotEndsWith) {

        this.windowEndNotEndsWith = windowEndNotEndsWith;
        return this;
    }

    /**
     * Get windowEndNotEndsWith
     *
     * @return windowEndNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getWindowEndNotEndsWith() {
        return windowEndNotEndsWith;
    }

    public void setWindowEndNotEndsWith(String windowEndNotEndsWith) {
        this.windowEndNotEndsWith = windowEndNotEndsWith;
    }

    public ReplicationPlanWhereInput windowEndNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WINDOW_END_NOT_ENDS_WITH);
        return this;
    }

    public ReplicationPlanWhereInput windowEndNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_WINDOW_END_NOT_ENDS_WITH);
        return this;
    }

    public void setWindowEndNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_WINDOW_END_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_WINDOW_END_NOT_ENDS_WITH);
        }
    }

    public boolean getWindowEndNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_WINDOW_END_NOT_ENDS_WITH);
    }

    public ReplicationPlanWhereInput windowEndNotIn(List<String> windowEndNotIn) {

        this.windowEndNotIn = windowEndNotIn;
        return this;
    }

    public ReplicationPlanWhereInput addWindowEndNotInItem(String windowEndNotInItem) {
        if (this.windowEndNotIn == null) {
            this.windowEndNotIn = new ArrayList<String>();
        }
        this.windowEndNotIn.add(windowEndNotInItem);
        return this;
    }

    /**
     * Get windowEndNotIn
     *
     * @return windowEndNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getWindowEndNotIn() {
        return windowEndNotIn;
    }

    public void setWindowEndNotIn(List<String> windowEndNotIn) {
        this.windowEndNotIn = windowEndNotIn;
    }

    public ReplicationPlanWhereInput windowEndNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WINDOW_END_NOT_IN);
        return this;
    }

    public ReplicationPlanWhereInput windowEndNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_WINDOW_END_NOT_IN);
        return this;
    }

    public void setWindowEndNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_WINDOW_END_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_WINDOW_END_NOT_IN);
        }
    }

    public boolean getWindowEndNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_WINDOW_END_NOT_IN);
    }

    public ReplicationPlanWhereInput windowEndNotStartsWith(String windowEndNotStartsWith) {

        this.windowEndNotStartsWith = windowEndNotStartsWith;
        return this;
    }

    /**
     * Get windowEndNotStartsWith
     *
     * @return windowEndNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getWindowEndNotStartsWith() {
        return windowEndNotStartsWith;
    }

    public void setWindowEndNotStartsWith(String windowEndNotStartsWith) {
        this.windowEndNotStartsWith = windowEndNotStartsWith;
    }

    public ReplicationPlanWhereInput windowEndNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WINDOW_END_NOT_STARTS_WITH);
        return this;
    }

    public ReplicationPlanWhereInput windowEndNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_WINDOW_END_NOT_STARTS_WITH);
        return this;
    }

    public void setWindowEndNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_WINDOW_END_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_WINDOW_END_NOT_STARTS_WITH);
        }
    }

    public boolean getWindowEndNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_WINDOW_END_NOT_STARTS_WITH);
    }

    public ReplicationPlanWhereInput windowEndStartsWith(String windowEndStartsWith) {

        this.windowEndStartsWith = windowEndStartsWith;
        return this;
    }

    /**
     * Get windowEndStartsWith
     *
     * @return windowEndStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getWindowEndStartsWith() {
        return windowEndStartsWith;
    }

    public void setWindowEndStartsWith(String windowEndStartsWith) {
        this.windowEndStartsWith = windowEndStartsWith;
    }

    public ReplicationPlanWhereInput windowEndStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WINDOW_END_STARTS_WITH);
        return this;
    }

    public ReplicationPlanWhereInput windowEndStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_WINDOW_END_STARTS_WITH);
        return this;
    }

    public void setWindowEndStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_WINDOW_END_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_WINDOW_END_STARTS_WITH);
        }
    }

    public boolean getWindowEndStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_WINDOW_END_STARTS_WITH);
    }

    public ReplicationPlanWhereInput windowStart(String windowStart) {

        this.windowStart = windowStart;
        return this;
    }

    /**
     * Get windowStart
     *
     * @return windowStart
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getWindowStart() {
        return windowStart;
    }

    public void setWindowStart(String windowStart) {
        this.windowStart = windowStart;
    }

    public ReplicationPlanWhereInput windowStart_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WINDOW_START);
        return this;
    }

    public ReplicationPlanWhereInput windowStart_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_WINDOW_START);
        return this;
    }

    public void setWindowStart_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_WINDOW_START);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_WINDOW_START);
        }
    }

    public boolean getWindowStart_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_WINDOW_START);
    }

    public ReplicationPlanWhereInput windowStartContains(String windowStartContains) {

        this.windowStartContains = windowStartContains;
        return this;
    }

    /**
     * Get windowStartContains
     *
     * @return windowStartContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getWindowStartContains() {
        return windowStartContains;
    }

    public void setWindowStartContains(String windowStartContains) {
        this.windowStartContains = windowStartContains;
    }

    public ReplicationPlanWhereInput windowStartContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WINDOW_START_CONTAINS);
        return this;
    }

    public ReplicationPlanWhereInput windowStartContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_WINDOW_START_CONTAINS);
        return this;
    }

    public void setWindowStartContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_WINDOW_START_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_WINDOW_START_CONTAINS);
        }
    }

    public boolean getWindowStartContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_WINDOW_START_CONTAINS);
    }

    public ReplicationPlanWhereInput windowStartEndsWith(String windowStartEndsWith) {

        this.windowStartEndsWith = windowStartEndsWith;
        return this;
    }

    /**
     * Get windowStartEndsWith
     *
     * @return windowStartEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getWindowStartEndsWith() {
        return windowStartEndsWith;
    }

    public void setWindowStartEndsWith(String windowStartEndsWith) {
        this.windowStartEndsWith = windowStartEndsWith;
    }

    public ReplicationPlanWhereInput windowStartEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WINDOW_START_ENDS_WITH);
        return this;
    }

    public ReplicationPlanWhereInput windowStartEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_WINDOW_START_ENDS_WITH);
        return this;
    }

    public void setWindowStartEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_WINDOW_START_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_WINDOW_START_ENDS_WITH);
        }
    }

    public boolean getWindowStartEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_WINDOW_START_ENDS_WITH);
    }

    public ReplicationPlanWhereInput windowStartGt(String windowStartGt) {

        this.windowStartGt = windowStartGt;
        return this;
    }

    /**
     * Get windowStartGt
     *
     * @return windowStartGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getWindowStartGt() {
        return windowStartGt;
    }

    public void setWindowStartGt(String windowStartGt) {
        this.windowStartGt = windowStartGt;
    }

    public ReplicationPlanWhereInput windowStartGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WINDOW_START_GT);
        return this;
    }

    public ReplicationPlanWhereInput windowStartGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_WINDOW_START_GT);
        return this;
    }

    public void setWindowStartGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_WINDOW_START_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_WINDOW_START_GT);
        }
    }

    public boolean getWindowStartGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_WINDOW_START_GT);
    }

    public ReplicationPlanWhereInput windowStartGte(String windowStartGte) {

        this.windowStartGte = windowStartGte;
        return this;
    }

    /**
     * Get windowStartGte
     *
     * @return windowStartGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getWindowStartGte() {
        return windowStartGte;
    }

    public void setWindowStartGte(String windowStartGte) {
        this.windowStartGte = windowStartGte;
    }

    public ReplicationPlanWhereInput windowStartGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WINDOW_START_GTE);
        return this;
    }

    public ReplicationPlanWhereInput windowStartGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_WINDOW_START_GTE);
        return this;
    }

    public void setWindowStartGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_WINDOW_START_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_WINDOW_START_GTE);
        }
    }

    public boolean getWindowStartGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_WINDOW_START_GTE);
    }

    public ReplicationPlanWhereInput windowStartIn(List<String> windowStartIn) {

        this.windowStartIn = windowStartIn;
        return this;
    }

    public ReplicationPlanWhereInput addWindowStartInItem(String windowStartInItem) {
        if (this.windowStartIn == null) {
            this.windowStartIn = new ArrayList<String>();
        }
        this.windowStartIn.add(windowStartInItem);
        return this;
    }

    /**
     * Get windowStartIn
     *
     * @return windowStartIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getWindowStartIn() {
        return windowStartIn;
    }

    public void setWindowStartIn(List<String> windowStartIn) {
        this.windowStartIn = windowStartIn;
    }

    public ReplicationPlanWhereInput windowStartIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WINDOW_START_IN);
        return this;
    }

    public ReplicationPlanWhereInput windowStartIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_WINDOW_START_IN);
        return this;
    }

    public void setWindowStartIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_WINDOW_START_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_WINDOW_START_IN);
        }
    }

    public boolean getWindowStartIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_WINDOW_START_IN);
    }

    public ReplicationPlanWhereInput windowStartLt(String windowStartLt) {

        this.windowStartLt = windowStartLt;
        return this;
    }

    /**
     * Get windowStartLt
     *
     * @return windowStartLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getWindowStartLt() {
        return windowStartLt;
    }

    public void setWindowStartLt(String windowStartLt) {
        this.windowStartLt = windowStartLt;
    }

    public ReplicationPlanWhereInput windowStartLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WINDOW_START_LT);
        return this;
    }

    public ReplicationPlanWhereInput windowStartLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_WINDOW_START_LT);
        return this;
    }

    public void setWindowStartLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_WINDOW_START_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_WINDOW_START_LT);
        }
    }

    public boolean getWindowStartLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_WINDOW_START_LT);
    }

    public ReplicationPlanWhereInput windowStartLte(String windowStartLte) {

        this.windowStartLte = windowStartLte;
        return this;
    }

    /**
     * Get windowStartLte
     *
     * @return windowStartLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getWindowStartLte() {
        return windowStartLte;
    }

    public void setWindowStartLte(String windowStartLte) {
        this.windowStartLte = windowStartLte;
    }

    public ReplicationPlanWhereInput windowStartLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WINDOW_START_LTE);
        return this;
    }

    public ReplicationPlanWhereInput windowStartLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_WINDOW_START_LTE);
        return this;
    }

    public void setWindowStartLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_WINDOW_START_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_WINDOW_START_LTE);
        }
    }

    public boolean getWindowStartLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_WINDOW_START_LTE);
    }

    public ReplicationPlanWhereInput windowStartNot(String windowStartNot) {

        this.windowStartNot = windowStartNot;
        return this;
    }

    /**
     * Get windowStartNot
     *
     * @return windowStartNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getWindowStartNot() {
        return windowStartNot;
    }

    public void setWindowStartNot(String windowStartNot) {
        this.windowStartNot = windowStartNot;
    }

    public ReplicationPlanWhereInput windowStartNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WINDOW_START_NOT);
        return this;
    }

    public ReplicationPlanWhereInput windowStartNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_WINDOW_START_NOT);
        return this;
    }

    public void setWindowStartNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_WINDOW_START_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_WINDOW_START_NOT);
        }
    }

    public boolean getWindowStartNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_WINDOW_START_NOT);
    }

    public ReplicationPlanWhereInput windowStartNotContains(String windowStartNotContains) {

        this.windowStartNotContains = windowStartNotContains;
        return this;
    }

    /**
     * Get windowStartNotContains
     *
     * @return windowStartNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getWindowStartNotContains() {
        return windowStartNotContains;
    }

    public void setWindowStartNotContains(String windowStartNotContains) {
        this.windowStartNotContains = windowStartNotContains;
    }

    public ReplicationPlanWhereInput windowStartNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WINDOW_START_NOT_CONTAINS);
        return this;
    }

    public ReplicationPlanWhereInput windowStartNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_WINDOW_START_NOT_CONTAINS);
        return this;
    }

    public void setWindowStartNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_WINDOW_START_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_WINDOW_START_NOT_CONTAINS);
        }
    }

    public boolean getWindowStartNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_WINDOW_START_NOT_CONTAINS);
    }

    public ReplicationPlanWhereInput windowStartNotEndsWith(String windowStartNotEndsWith) {

        this.windowStartNotEndsWith = windowStartNotEndsWith;
        return this;
    }

    /**
     * Get windowStartNotEndsWith
     *
     * @return windowStartNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getWindowStartNotEndsWith() {
        return windowStartNotEndsWith;
    }

    public void setWindowStartNotEndsWith(String windowStartNotEndsWith) {
        this.windowStartNotEndsWith = windowStartNotEndsWith;
    }

    public ReplicationPlanWhereInput windowStartNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WINDOW_START_NOT_ENDS_WITH);
        return this;
    }

    public ReplicationPlanWhereInput windowStartNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_WINDOW_START_NOT_ENDS_WITH);
        return this;
    }

    public void setWindowStartNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_WINDOW_START_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_WINDOW_START_NOT_ENDS_WITH);
        }
    }

    public boolean getWindowStartNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_WINDOW_START_NOT_ENDS_WITH);
    }

    public ReplicationPlanWhereInput windowStartNotIn(List<String> windowStartNotIn) {

        this.windowStartNotIn = windowStartNotIn;
        return this;
    }

    public ReplicationPlanWhereInput addWindowStartNotInItem(String windowStartNotInItem) {
        if (this.windowStartNotIn == null) {
            this.windowStartNotIn = new ArrayList<String>();
        }
        this.windowStartNotIn.add(windowStartNotInItem);
        return this;
    }

    /**
     * Get windowStartNotIn
     *
     * @return windowStartNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getWindowStartNotIn() {
        return windowStartNotIn;
    }

    public void setWindowStartNotIn(List<String> windowStartNotIn) {
        this.windowStartNotIn = windowStartNotIn;
    }

    public ReplicationPlanWhereInput windowStartNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WINDOW_START_NOT_IN);
        return this;
    }

    public ReplicationPlanWhereInput windowStartNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_WINDOW_START_NOT_IN);
        return this;
    }

    public void setWindowStartNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_WINDOW_START_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_WINDOW_START_NOT_IN);
        }
    }

    public boolean getWindowStartNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_WINDOW_START_NOT_IN);
    }

    public ReplicationPlanWhereInput windowStartNotStartsWith(String windowStartNotStartsWith) {

        this.windowStartNotStartsWith = windowStartNotStartsWith;
        return this;
    }

    /**
     * Get windowStartNotStartsWith
     *
     * @return windowStartNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getWindowStartNotStartsWith() {
        return windowStartNotStartsWith;
    }

    public void setWindowStartNotStartsWith(String windowStartNotStartsWith) {
        this.windowStartNotStartsWith = windowStartNotStartsWith;
    }

    public ReplicationPlanWhereInput windowStartNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WINDOW_START_NOT_STARTS_WITH);
        return this;
    }

    public ReplicationPlanWhereInput windowStartNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_WINDOW_START_NOT_STARTS_WITH);
        return this;
    }

    public void setWindowStartNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_WINDOW_START_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_WINDOW_START_NOT_STARTS_WITH);
        }
    }

    public boolean getWindowStartNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_WINDOW_START_NOT_STARTS_WITH);
    }

    public ReplicationPlanWhereInput windowStartStartsWith(String windowStartStartsWith) {

        this.windowStartStartsWith = windowStartStartsWith;
        return this;
    }

    /**
     * Get windowStartStartsWith
     *
     * @return windowStartStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getWindowStartStartsWith() {
        return windowStartStartsWith;
    }

    public void setWindowStartStartsWith(String windowStartStartsWith) {
        this.windowStartStartsWith = windowStartStartsWith;
    }

    public ReplicationPlanWhereInput windowStartStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WINDOW_START_STARTS_WITH);
        return this;
    }

    public ReplicationPlanWhereInput windowStartStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_WINDOW_START_STARTS_WITH);
        return this;
    }

    public void setWindowStartStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_WINDOW_START_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_WINDOW_START_STARTS_WITH);
        }
    }

    public boolean getWindowStartStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_WINDOW_START_STARTS_WITH);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReplicationPlanWhereInput replicationPlanWhereInput = (ReplicationPlanWhereInput) o;
        return Objects.equals(this.AND, replicationPlanWhereInput.AND)
                && Objects.equals(this.NOT, replicationPlanWhereInput.NOT)
                && Objects.equals(this.OR, replicationPlanWhereInput.OR)
                && Objects.equals(
                        this.abortWindowUnfinished, replicationPlanWhereInput.abortWindowUnfinished)
                && Objects.equals(
                        this.abortWindowUnfinishedNot,
                        replicationPlanWhereInput.abortWindowUnfinishedNot)
                && Objects.equals(
                        this.activationTimestamp, replicationPlanWhereInput.activationTimestamp)
                && Objects.equals(
                        this.activationTimestampGt, replicationPlanWhereInput.activationTimestampGt)
                && Objects.equals(
                        this.activationTimestampGte,
                        replicationPlanWhereInput.activationTimestampGte)
                && Objects.equals(
                        this.activationTimestampIn, replicationPlanWhereInput.activationTimestampIn)
                && Objects.equals(
                        this.activationTimestampLt, replicationPlanWhereInput.activationTimestampLt)
                && Objects.equals(
                        this.activationTimestampLte,
                        replicationPlanWhereInput.activationTimestampLte)
                && Objects.equals(
                        this.activationTimestampNot,
                        replicationPlanWhereInput.activationTimestampNot)
                && Objects.equals(
                        this.activationTimestampNotIn,
                        replicationPlanWhereInput.activationTimestampNotIn)
                && Objects.equals(this.compression, replicationPlanWhereInput.compression)
                && Objects.equals(this.compressionNot, replicationPlanWhereInput.compressionNot)
                && Objects.equals(this.createdAt, replicationPlanWhereInput.createdAt)
                && Objects.equals(this.createdAtGt, replicationPlanWhereInput.createdAtGt)
                && Objects.equals(this.createdAtGte, replicationPlanWhereInput.createdAtGte)
                && Objects.equals(this.createdAtIn, replicationPlanWhereInput.createdAtIn)
                && Objects.equals(this.createdAtLt, replicationPlanWhereInput.createdAtLt)
                && Objects.equals(this.createdAtLte, replicationPlanWhereInput.createdAtLte)
                && Objects.equals(this.createdAtNot, replicationPlanWhereInput.createdAtNot)
                && Objects.equals(this.createdAtNotIn, replicationPlanWhereInput.createdAtNotIn)
                && Objects.equals(this.deleteStrategy, replicationPlanWhereInput.deleteStrategy)
                && Objects.equals(this.deleteStrategyIn, replicationPlanWhereInput.deleteStrategyIn)
                && Objects.equals(
                        this.deleteStrategyNot, replicationPlanWhereInput.deleteStrategyNot)
                && Objects.equals(
                        this.deleteStrategyNotIn, replicationPlanWhereInput.deleteStrategyNotIn)
                && Objects.equals(this.description, replicationPlanWhereInput.description)
                && Objects.equals(
                        this.descriptionContains, replicationPlanWhereInput.descriptionContains)
                && Objects.equals(
                        this.descriptionEndsWith, replicationPlanWhereInput.descriptionEndsWith)
                && Objects.equals(this.descriptionGt, replicationPlanWhereInput.descriptionGt)
                && Objects.equals(this.descriptionGte, replicationPlanWhereInput.descriptionGte)
                && Objects.equals(this.descriptionIn, replicationPlanWhereInput.descriptionIn)
                && Objects.equals(this.descriptionLt, replicationPlanWhereInput.descriptionLt)
                && Objects.equals(this.descriptionLte, replicationPlanWhereInput.descriptionLte)
                && Objects.equals(this.descriptionNot, replicationPlanWhereInput.descriptionNot)
                && Objects.equals(
                        this.descriptionNotContains,
                        replicationPlanWhereInput.descriptionNotContains)
                && Objects.equals(
                        this.descriptionNotEndsWith,
                        replicationPlanWhereInput.descriptionNotEndsWith)
                && Objects.equals(this.descriptionNotIn, replicationPlanWhereInput.descriptionNotIn)
                && Objects.equals(
                        this.descriptionNotStartsWith,
                        replicationPlanWhereInput.descriptionNotStartsWith)
                && Objects.equals(
                        this.descriptionStartsWith, replicationPlanWhereInput.descriptionStartsWith)
                && Objects.equals(this.ecK, replicationPlanWhereInput.ecK)
                && Objects.equals(this.ecKGt, replicationPlanWhereInput.ecKGt)
                && Objects.equals(this.ecKGte, replicationPlanWhereInput.ecKGte)
                && Objects.equals(this.ecKIn, replicationPlanWhereInput.ecKIn)
                && Objects.equals(this.ecKLt, replicationPlanWhereInput.ecKLt)
                && Objects.equals(this.ecKLte, replicationPlanWhereInput.ecKLte)
                && Objects.equals(this.ecKNot, replicationPlanWhereInput.ecKNot)
                && Objects.equals(this.ecKNotIn, replicationPlanWhereInput.ecKNotIn)
                && Objects.equals(this.ecM, replicationPlanWhereInput.ecM)
                && Objects.equals(this.ecMGt, replicationPlanWhereInput.ecMGt)
                && Objects.equals(this.ecMGte, replicationPlanWhereInput.ecMGte)
                && Objects.equals(this.ecMIn, replicationPlanWhereInput.ecMIn)
                && Objects.equals(this.ecMLt, replicationPlanWhereInput.ecMLt)
                && Objects.equals(this.ecMLte, replicationPlanWhereInput.ecMLte)
                && Objects.equals(this.ecMNot, replicationPlanWhereInput.ecMNot)
                && Objects.equals(this.ecMNotIn, replicationPlanWhereInput.ecMNotIn)
                && Objects.equals(this.enableWindow, replicationPlanWhereInput.enableWindow)
                && Objects.equals(this.enableWindowNot, replicationPlanWhereInput.enableWindowNot)
                && Objects.equals(
                        this.entityAsyncStatus, replicationPlanWhereInput.entityAsyncStatus)
                && Objects.equals(
                        this.entityAsyncStatusIn, replicationPlanWhereInput.entityAsyncStatusIn)
                && Objects.equals(
                        this.entityAsyncStatusNot, replicationPlanWhereInput.entityAsyncStatusNot)
                && Objects.equals(
                        this.entityAsyncStatusNotIn,
                        replicationPlanWhereInput.entityAsyncStatusNotIn)
                && Objects.equals(
                        this.externalCloudtower, replicationPlanWhereInput.externalCloudtower)
                && Objects.equals(this.id, replicationPlanWhereInput.id)
                && Objects.equals(this.idContains, replicationPlanWhereInput.idContains)
                && Objects.equals(this.idEndsWith, replicationPlanWhereInput.idEndsWith)
                && Objects.equals(this.idGt, replicationPlanWhereInput.idGt)
                && Objects.equals(this.idGte, replicationPlanWhereInput.idGte)
                && Objects.equals(this.idIn, replicationPlanWhereInput.idIn)
                && Objects.equals(this.idLt, replicationPlanWhereInput.idLt)
                && Objects.equals(this.idLte, replicationPlanWhereInput.idLte)
                && Objects.equals(this.idNot, replicationPlanWhereInput.idNot)
                && Objects.equals(this.idNotContains, replicationPlanWhereInput.idNotContains)
                && Objects.equals(this.idNotEndsWith, replicationPlanWhereInput.idNotEndsWith)
                && Objects.equals(this.idNotIn, replicationPlanWhereInput.idNotIn)
                && Objects.equals(this.idNotStartsWith, replicationPlanWhereInput.idNotStartsWith)
                && Objects.equals(this.idStartsWith, replicationPlanWhereInput.idStartsWith)
                && Objects.equals(this.inbound, replicationPlanWhereInput.inbound)
                && Objects.equals(this.inboundNot, replicationPlanWhereInput.inboundNot)
                && Objects.equals(this.interval, replicationPlanWhereInput.interval)
                && Objects.equals(this.intervalGt, replicationPlanWhereInput.intervalGt)
                && Objects.equals(this.intervalGte, replicationPlanWhereInput.intervalGte)
                && Objects.equals(this.intervalIn, replicationPlanWhereInput.intervalIn)
                && Objects.equals(this.intervalLt, replicationPlanWhereInput.intervalLt)
                && Objects.equals(this.intervalLte, replicationPlanWhereInput.intervalLte)
                && Objects.equals(this.intervalNot, replicationPlanWhereInput.intervalNot)
                && Objects.equals(this.intervalNotIn, replicationPlanWhereInput.intervalNotIn)
                && Objects.equals(this.iscsiLunsEvery, replicationPlanWhereInput.iscsiLunsEvery)
                && Objects.equals(this.iscsiLunsNone, replicationPlanWhereInput.iscsiLunsNone)
                && Objects.equals(this.iscsiLunsSome, replicationPlanWhereInput.iscsiLunsSome)
                && Objects.equals(this.keepMacAddress, replicationPlanWhereInput.keepMacAddress)
                && Objects.equals(
                        this.keepMacAddressNot, replicationPlanWhereInput.keepMacAddressNot)
                && Objects.equals(this.keepPolicy, replicationPlanWhereInput.keepPolicy)
                && Objects.equals(this.keepPolicyIn, replicationPlanWhereInput.keepPolicyIn)
                && Objects.equals(this.keepPolicyNot, replicationPlanWhereInput.keepPolicyNot)
                && Objects.equals(this.keepPolicyNotIn, replicationPlanWhereInput.keepPolicyNotIn)
                && Objects.equals(this.keepPolicyValue, replicationPlanWhereInput.keepPolicyValue)
                && Objects.equals(
                        this.keepPolicyValueGt, replicationPlanWhereInput.keepPolicyValueGt)
                && Objects.equals(
                        this.keepPolicyValueGte, replicationPlanWhereInput.keepPolicyValueGte)
                && Objects.equals(
                        this.keepPolicyValueIn, replicationPlanWhereInput.keepPolicyValueIn)
                && Objects.equals(
                        this.keepPolicyValueLt, replicationPlanWhereInput.keepPolicyValueLt)
                && Objects.equals(
                        this.keepPolicyValueLte, replicationPlanWhereInput.keepPolicyValueLte)
                && Objects.equals(
                        this.keepPolicyValueNot, replicationPlanWhereInput.keepPolicyValueNot)
                && Objects.equals(
                        this.keepPolicyValueNotIn, replicationPlanWhereInput.keepPolicyValueNotIn)
                && Objects.equals(
                        this.lastExecuteStatus, replicationPlanWhereInput.lastExecuteStatus)
                && Objects.equals(
                        this.lastExecuteStatusIn, replicationPlanWhereInput.lastExecuteStatusIn)
                && Objects.equals(
                        this.lastExecuteStatusMessage,
                        replicationPlanWhereInput.lastExecuteStatusMessage)
                && Objects.equals(
                        this.lastExecuteStatusMessageContains,
                        replicationPlanWhereInput.lastExecuteStatusMessageContains)
                && Objects.equals(
                        this.lastExecuteStatusMessageEndsWith,
                        replicationPlanWhereInput.lastExecuteStatusMessageEndsWith)
                && Objects.equals(
                        this.lastExecuteStatusMessageGt,
                        replicationPlanWhereInput.lastExecuteStatusMessageGt)
                && Objects.equals(
                        this.lastExecuteStatusMessageGte,
                        replicationPlanWhereInput.lastExecuteStatusMessageGte)
                && Objects.equals(
                        this.lastExecuteStatusMessageIn,
                        replicationPlanWhereInput.lastExecuteStatusMessageIn)
                && Objects.equals(
                        this.lastExecuteStatusMessageLt,
                        replicationPlanWhereInput.lastExecuteStatusMessageLt)
                && Objects.equals(
                        this.lastExecuteStatusMessageLte,
                        replicationPlanWhereInput.lastExecuteStatusMessageLte)
                && Objects.equals(
                        this.lastExecuteStatusMessageNot,
                        replicationPlanWhereInput.lastExecuteStatusMessageNot)
                && Objects.equals(
                        this.lastExecuteStatusMessageNotContains,
                        replicationPlanWhereInput.lastExecuteStatusMessageNotContains)
                && Objects.equals(
                        this.lastExecuteStatusMessageNotEndsWith,
                        replicationPlanWhereInput.lastExecuteStatusMessageNotEndsWith)
                && Objects.equals(
                        this.lastExecuteStatusMessageNotIn,
                        replicationPlanWhereInput.lastExecuteStatusMessageNotIn)
                && Objects.equals(
                        this.lastExecuteStatusMessageNotStartsWith,
                        replicationPlanWhereInput.lastExecuteStatusMessageNotStartsWith)
                && Objects.equals(
                        this.lastExecuteStatusMessageStartsWith,
                        replicationPlanWhereInput.lastExecuteStatusMessageStartsWith)
                && Objects.equals(
                        this.lastExecuteStatusNot, replicationPlanWhereInput.lastExecuteStatusNot)
                && Objects.equals(
                        this.lastExecuteStatusNotIn,
                        replicationPlanWhereInput.lastExecuteStatusNotIn)
                && Objects.equals(
                        this.lastExecuteSuccessJobCount,
                        replicationPlanWhereInput.lastExecuteSuccessJobCount)
                && Objects.equals(
                        this.lastExecuteSuccessJobCountGt,
                        replicationPlanWhereInput.lastExecuteSuccessJobCountGt)
                && Objects.equals(
                        this.lastExecuteSuccessJobCountGte,
                        replicationPlanWhereInput.lastExecuteSuccessJobCountGte)
                && Objects.equals(
                        this.lastExecuteSuccessJobCountIn,
                        replicationPlanWhereInput.lastExecuteSuccessJobCountIn)
                && Objects.equals(
                        this.lastExecuteSuccessJobCountLt,
                        replicationPlanWhereInput.lastExecuteSuccessJobCountLt)
                && Objects.equals(
                        this.lastExecuteSuccessJobCountLte,
                        replicationPlanWhereInput.lastExecuteSuccessJobCountLte)
                && Objects.equals(
                        this.lastExecuteSuccessJobCountNot,
                        replicationPlanWhereInput.lastExecuteSuccessJobCountNot)
                && Objects.equals(
                        this.lastExecuteSuccessJobCountNotIn,
                        replicationPlanWhereInput.lastExecuteSuccessJobCountNotIn)
                && Objects.equals(
                        this.lastExecuteTotalJobCount,
                        replicationPlanWhereInput.lastExecuteTotalJobCount)
                && Objects.equals(
                        this.lastExecuteTotalJobCountGt,
                        replicationPlanWhereInput.lastExecuteTotalJobCountGt)
                && Objects.equals(
                        this.lastExecuteTotalJobCountGte,
                        replicationPlanWhereInput.lastExecuteTotalJobCountGte)
                && Objects.equals(
                        this.lastExecuteTotalJobCountIn,
                        replicationPlanWhereInput.lastExecuteTotalJobCountIn)
                && Objects.equals(
                        this.lastExecuteTotalJobCountLt,
                        replicationPlanWhereInput.lastExecuteTotalJobCountLt)
                && Objects.equals(
                        this.lastExecuteTotalJobCountLte,
                        replicationPlanWhereInput.lastExecuteTotalJobCountLte)
                && Objects.equals(
                        this.lastExecuteTotalJobCountNot,
                        replicationPlanWhereInput.lastExecuteTotalJobCountNot)
                && Objects.equals(
                        this.lastExecuteTotalJobCountNotIn,
                        replicationPlanWhereInput.lastExecuteTotalJobCountNotIn)
                && Objects.equals(this.lastExecutedAt, replicationPlanWhereInput.lastExecutedAt)
                && Objects.equals(this.lastExecutedAtGt, replicationPlanWhereInput.lastExecutedAtGt)
                && Objects.equals(
                        this.lastExecutedAtGte, replicationPlanWhereInput.lastExecutedAtGte)
                && Objects.equals(this.lastExecutedAtIn, replicationPlanWhereInput.lastExecutedAtIn)
                && Objects.equals(this.lastExecutedAtLt, replicationPlanWhereInput.lastExecutedAtLt)
                && Objects.equals(
                        this.lastExecutedAtLte, replicationPlanWhereInput.lastExecutedAtLte)
                && Objects.equals(
                        this.lastExecutedAtNot, replicationPlanWhereInput.lastExecutedAtNot)
                && Objects.equals(
                        this.lastExecutedAtNotIn, replicationPlanWhereInput.lastExecutedAtNotIn)
                && Objects.equals(
                        this.lastManualExecuteStatus,
                        replicationPlanWhereInput.lastManualExecuteStatus)
                && Objects.equals(
                        this.lastManualExecuteStatusIn,
                        replicationPlanWhereInput.lastManualExecuteStatusIn)
                && Objects.equals(
                        this.lastManualExecuteStatusMessage,
                        replicationPlanWhereInput.lastManualExecuteStatusMessage)
                && Objects.equals(
                        this.lastManualExecuteStatusMessageContains,
                        replicationPlanWhereInput.lastManualExecuteStatusMessageContains)
                && Objects.equals(
                        this.lastManualExecuteStatusMessageEndsWith,
                        replicationPlanWhereInput.lastManualExecuteStatusMessageEndsWith)
                && Objects.equals(
                        this.lastManualExecuteStatusMessageGt,
                        replicationPlanWhereInput.lastManualExecuteStatusMessageGt)
                && Objects.equals(
                        this.lastManualExecuteStatusMessageGte,
                        replicationPlanWhereInput.lastManualExecuteStatusMessageGte)
                && Objects.equals(
                        this.lastManualExecuteStatusMessageIn,
                        replicationPlanWhereInput.lastManualExecuteStatusMessageIn)
                && Objects.equals(
                        this.lastManualExecuteStatusMessageLt,
                        replicationPlanWhereInput.lastManualExecuteStatusMessageLt)
                && Objects.equals(
                        this.lastManualExecuteStatusMessageLte,
                        replicationPlanWhereInput.lastManualExecuteStatusMessageLte)
                && Objects.equals(
                        this.lastManualExecuteStatusMessageNot,
                        replicationPlanWhereInput.lastManualExecuteStatusMessageNot)
                && Objects.equals(
                        this.lastManualExecuteStatusMessageNotContains,
                        replicationPlanWhereInput.lastManualExecuteStatusMessageNotContains)
                && Objects.equals(
                        this.lastManualExecuteStatusMessageNotEndsWith,
                        replicationPlanWhereInput.lastManualExecuteStatusMessageNotEndsWith)
                && Objects.equals(
                        this.lastManualExecuteStatusMessageNotIn,
                        replicationPlanWhereInput.lastManualExecuteStatusMessageNotIn)
                && Objects.equals(
                        this.lastManualExecuteStatusMessageNotStartsWith,
                        replicationPlanWhereInput.lastManualExecuteStatusMessageNotStartsWith)
                && Objects.equals(
                        this.lastManualExecuteStatusMessageStartsWith,
                        replicationPlanWhereInput.lastManualExecuteStatusMessageStartsWith)
                && Objects.equals(
                        this.lastManualExecuteStatusNot,
                        replicationPlanWhereInput.lastManualExecuteStatusNot)
                && Objects.equals(
                        this.lastManualExecuteStatusNotIn,
                        replicationPlanWhereInput.lastManualExecuteStatusNotIn)
                && Objects.equals(
                        this.lastManualExecuteSuccessJobCount,
                        replicationPlanWhereInput.lastManualExecuteSuccessJobCount)
                && Objects.equals(
                        this.lastManualExecuteSuccessJobCountGt,
                        replicationPlanWhereInput.lastManualExecuteSuccessJobCountGt)
                && Objects.equals(
                        this.lastManualExecuteSuccessJobCountGte,
                        replicationPlanWhereInput.lastManualExecuteSuccessJobCountGte)
                && Objects.equals(
                        this.lastManualExecuteSuccessJobCountIn,
                        replicationPlanWhereInput.lastManualExecuteSuccessJobCountIn)
                && Objects.equals(
                        this.lastManualExecuteSuccessJobCountLt,
                        replicationPlanWhereInput.lastManualExecuteSuccessJobCountLt)
                && Objects.equals(
                        this.lastManualExecuteSuccessJobCountLte,
                        replicationPlanWhereInput.lastManualExecuteSuccessJobCountLte)
                && Objects.equals(
                        this.lastManualExecuteSuccessJobCountNot,
                        replicationPlanWhereInput.lastManualExecuteSuccessJobCountNot)
                && Objects.equals(
                        this.lastManualExecuteSuccessJobCountNotIn,
                        replicationPlanWhereInput.lastManualExecuteSuccessJobCountNotIn)
                && Objects.equals(
                        this.lastManualExecuteTotalJobCount,
                        replicationPlanWhereInput.lastManualExecuteTotalJobCount)
                && Objects.equals(
                        this.lastManualExecuteTotalJobCountGt,
                        replicationPlanWhereInput.lastManualExecuteTotalJobCountGt)
                && Objects.equals(
                        this.lastManualExecuteTotalJobCountGte,
                        replicationPlanWhereInput.lastManualExecuteTotalJobCountGte)
                && Objects.equals(
                        this.lastManualExecuteTotalJobCountIn,
                        replicationPlanWhereInput.lastManualExecuteTotalJobCountIn)
                && Objects.equals(
                        this.lastManualExecuteTotalJobCountLt,
                        replicationPlanWhereInput.lastManualExecuteTotalJobCountLt)
                && Objects.equals(
                        this.lastManualExecuteTotalJobCountLte,
                        replicationPlanWhereInput.lastManualExecuteTotalJobCountLte)
                && Objects.equals(
                        this.lastManualExecuteTotalJobCountNot,
                        replicationPlanWhereInput.lastManualExecuteTotalJobCountNot)
                && Objects.equals(
                        this.lastManualExecuteTotalJobCountNotIn,
                        replicationPlanWhereInput.lastManualExecuteTotalJobCountNotIn)
                && Objects.equals(
                        this.lastManualExecutedAt, replicationPlanWhereInput.lastManualExecutedAt)
                && Objects.equals(
                        this.lastManualExecutedAtGt,
                        replicationPlanWhereInput.lastManualExecutedAtGt)
                && Objects.equals(
                        this.lastManualExecutedAtGte,
                        replicationPlanWhereInput.lastManualExecutedAtGte)
                && Objects.equals(
                        this.lastManualExecutedAtIn,
                        replicationPlanWhereInput.lastManualExecutedAtIn)
                && Objects.equals(
                        this.lastManualExecutedAtLt,
                        replicationPlanWhereInput.lastManualExecutedAtLt)
                && Objects.equals(
                        this.lastManualExecutedAtLte,
                        replicationPlanWhereInput.lastManualExecutedAtLte)
                && Objects.equals(
                        this.lastManualExecutedAtNot,
                        replicationPlanWhereInput.lastManualExecutedAtNot)
                && Objects.equals(
                        this.lastManualExecutedAtNotIn,
                        replicationPlanWhereInput.lastManualExecutedAtNotIn)
                && Objects.equals(this.name, replicationPlanWhereInput.name)
                && Objects.equals(this.nameContains, replicationPlanWhereInput.nameContains)
                && Objects.equals(this.nameEndsWith, replicationPlanWhereInput.nameEndsWith)
                && Objects.equals(this.nameGt, replicationPlanWhereInput.nameGt)
                && Objects.equals(this.nameGte, replicationPlanWhereInput.nameGte)
                && Objects.equals(this.nameIn, replicationPlanWhereInput.nameIn)
                && Objects.equals(this.nameLt, replicationPlanWhereInput.nameLt)
                && Objects.equals(this.nameLte, replicationPlanWhereInput.nameLte)
                && Objects.equals(this.nameNot, replicationPlanWhereInput.nameNot)
                && Objects.equals(this.nameNotContains, replicationPlanWhereInput.nameNotContains)
                && Objects.equals(this.nameNotEndsWith, replicationPlanWhereInput.nameNotEndsWith)
                && Objects.equals(this.nameNotIn, replicationPlanWhereInput.nameNotIn)
                && Objects.equals(
                        this.nameNotStartsWith, replicationPlanWhereInput.nameNotStartsWith)
                && Objects.equals(this.nameStartsWith, replicationPlanWhereInput.nameStartsWith)
                && Objects.equals(
                        this.nextExecutionTime, replicationPlanWhereInput.nextExecutionTime)
                && Objects.equals(
                        this.nextExecutionTimeGt, replicationPlanWhereInput.nextExecutionTimeGt)
                && Objects.equals(
                        this.nextExecutionTimeGte, replicationPlanWhereInput.nextExecutionTimeGte)
                && Objects.equals(
                        this.nextExecutionTimeIn, replicationPlanWhereInput.nextExecutionTimeIn)
                && Objects.equals(
                        this.nextExecutionTimeLt, replicationPlanWhereInput.nextExecutionTimeLt)
                && Objects.equals(
                        this.nextExecutionTimeLte, replicationPlanWhereInput.nextExecutionTimeLte)
                && Objects.equals(
                        this.nextExecutionTimeNot, replicationPlanWhereInput.nextExecutionTimeNot)
                && Objects.equals(
                        this.nextExecutionTimeNotIn,
                        replicationPlanWhereInput.nextExecutionTimeNotIn)
                && Objects.equals(this.period, replicationPlanWhereInput.period)
                && Objects.equals(this.periodIn, replicationPlanWhereInput.periodIn)
                && Objects.equals(this.periodNot, replicationPlanWhereInput.periodNot)
                && Objects.equals(this.periodNotIn, replicationPlanWhereInput.periodNotIn)
                && Objects.equals(this.phase, replicationPlanWhereInput.phase)
                && Objects.equals(this.phaseIn, replicationPlanWhereInput.phaseIn)
                && Objects.equals(this.phaseNot, replicationPlanWhereInput.phaseNot)
                && Objects.equals(this.phaseNotIn, replicationPlanWhereInput.phaseNotIn)
                && Objects.equals(this.replicaNameRule, replicationPlanWhereInput.replicaNameRule)
                && Objects.equals(
                        this.replicaNameRuleIn, replicationPlanWhereInput.replicaNameRuleIn)
                && Objects.equals(
                        this.replicaNameRuleNot, replicationPlanWhereInput.replicaNameRuleNot)
                && Objects.equals(
                        this.replicaNameRuleNotIn, replicationPlanWhereInput.replicaNameRuleNotIn)
                && Objects.equals(
                        this.replicaNameSetting, replicationPlanWhereInput.replicaNameSetting)
                && Objects.equals(
                        this.replicaNameSettingContains,
                        replicationPlanWhereInput.replicaNameSettingContains)
                && Objects.equals(
                        this.replicaNameSettingEndsWith,
                        replicationPlanWhereInput.replicaNameSettingEndsWith)
                && Objects.equals(
                        this.replicaNameSettingGt, replicationPlanWhereInput.replicaNameSettingGt)
                && Objects.equals(
                        this.replicaNameSettingGte, replicationPlanWhereInput.replicaNameSettingGte)
                && Objects.equals(
                        this.replicaNameSettingIn, replicationPlanWhereInput.replicaNameSettingIn)
                && Objects.equals(
                        this.replicaNameSettingLt, replicationPlanWhereInput.replicaNameSettingLt)
                && Objects.equals(
                        this.replicaNameSettingLte, replicationPlanWhereInput.replicaNameSettingLte)
                && Objects.equals(
                        this.replicaNameSettingNot, replicationPlanWhereInput.replicaNameSettingNot)
                && Objects.equals(
                        this.replicaNameSettingNotContains,
                        replicationPlanWhereInput.replicaNameSettingNotContains)
                && Objects.equals(
                        this.replicaNameSettingNotEndsWith,
                        replicationPlanWhereInput.replicaNameSettingNotEndsWith)
                && Objects.equals(
                        this.replicaNameSettingNotIn,
                        replicationPlanWhereInput.replicaNameSettingNotIn)
                && Objects.equals(
                        this.replicaNameSettingNotStartsWith,
                        replicationPlanWhereInput.replicaNameSettingNotStartsWith)
                && Objects.equals(
                        this.replicaNameSettingStartsWith,
                        replicationPlanWhereInput.replicaNameSettingStartsWith)
                && Objects.equals(this.replicaNum, replicationPlanWhereInput.replicaNum)
                && Objects.equals(this.replicaNumGt, replicationPlanWhereInput.replicaNumGt)
                && Objects.equals(this.replicaNumGte, replicationPlanWhereInput.replicaNumGte)
                && Objects.equals(this.replicaNumIn, replicationPlanWhereInput.replicaNumIn)
                && Objects.equals(this.replicaNumLt, replicationPlanWhereInput.replicaNumLt)
                && Objects.equals(this.replicaNumLte, replicationPlanWhereInput.replicaNumLte)
                && Objects.equals(this.replicaNumNot, replicationPlanWhereInput.replicaNumNot)
                && Objects.equals(this.replicaNumNotIn, replicationPlanWhereInput.replicaNumNotIn)
                && Objects.equals(this.replicaVmsEvery, replicationPlanWhereInput.replicaVmsEvery)
                && Objects.equals(this.replicaVmsNone, replicationPlanWhereInput.replicaVmsNone)
                && Objects.equals(this.replicaVmsSome, replicationPlanWhereInput.replicaVmsSome)
                && Objects.equals(
                        this.replicationPlanExecutionsEvery,
                        replicationPlanWhereInput.replicationPlanExecutionsEvery)
                && Objects.equals(
                        this.replicationPlanExecutionsNone,
                        replicationPlanWhereInput.replicationPlanExecutionsNone)
                && Objects.equals(
                        this.replicationPlanExecutionsSome,
                        replicationPlanWhereInput.replicationPlanExecutionsSome)
                && Objects.equals(
                        this.replicationRestorePointsEvery,
                        replicationPlanWhereInput.replicationRestorePointsEvery)
                && Objects.equals(
                        this.replicationRestorePointsNone,
                        replicationPlanWhereInput.replicationRestorePointsNone)
                && Objects.equals(
                        this.replicationRestorePointsSome,
                        replicationPlanWhereInput.replicationRestorePointsSome)
                && Objects.equals(
                        this.replicationTargetExecutionsEvery,
                        replicationPlanWhereInput.replicationTargetExecutionsEvery)
                && Objects.equals(
                        this.replicationTargetExecutionsNone,
                        replicationPlanWhereInput.replicationTargetExecutionsNone)
                && Objects.equals(
                        this.replicationTargetExecutionsSome,
                        replicationPlanWhereInput.replicationTargetExecutionsSome)
                && Objects.equals(this.resiliencyType, replicationPlanWhereInput.resiliencyType)
                && Objects.equals(this.resiliencyTypeIn, replicationPlanWhereInput.resiliencyTypeIn)
                && Objects.equals(
                        this.resiliencyTypeNot, replicationPlanWhereInput.resiliencyTypeNot)
                && Objects.equals(
                        this.resiliencyTypeNotIn, replicationPlanWhereInput.resiliencyTypeNotIn)
                && Objects.equals(
                        this.snapshotConsistentType,
                        replicationPlanWhereInput.snapshotConsistentType)
                && Objects.equals(
                        this.snapshotConsistentTypeIn,
                        replicationPlanWhereInput.snapshotConsistentTypeIn)
                && Objects.equals(
                        this.snapshotConsistentTypeNot,
                        replicationPlanWhereInput.snapshotConsistentTypeNot)
                && Objects.equals(
                        this.snapshotConsistentTypeNotIn,
                        replicationPlanWhereInput.snapshotConsistentTypeNotIn)
                && Objects.equals(this.status, replicationPlanWhereInput.status)
                && Objects.equals(this.statusIn, replicationPlanWhereInput.statusIn)
                && Objects.equals(this.statusNot, replicationPlanWhereInput.statusNot)
                && Objects.equals(this.statusNotIn, replicationPlanWhereInput.statusNotIn)
                && Objects.equals(this.storagePolicy, replicationPlanWhereInput.storagePolicy)
                && Objects.equals(this.storagePolicyIn, replicationPlanWhereInput.storagePolicyIn)
                && Objects.equals(this.storagePolicyNot, replicationPlanWhereInput.storagePolicyNot)
                && Objects.equals(
                        this.storagePolicyNotIn, replicationPlanWhereInput.storagePolicyNotIn)
                && Objects.equals(this.targetCluster, replicationPlanWhereInput.targetCluster)
                && Objects.equals(
                        this.targetReplicationService,
                        replicationPlanWhereInput.targetReplicationService)
                && Objects.equals(this.thinProvision, replicationPlanWhereInput.thinProvision)
                && Objects.equals(this.thinProvisionNot, replicationPlanWhereInput.thinProvisionNot)
                && Objects.equals(this.type, replicationPlanWhereInput.type)
                && Objects.equals(this.typeIn, replicationPlanWhereInput.typeIn)
                && Objects.equals(this.typeNot, replicationPlanWhereInput.typeNot)
                && Objects.equals(this.typeNotIn, replicationPlanWhereInput.typeNotIn)
                && Objects.equals(this.updatedAt, replicationPlanWhereInput.updatedAt)
                && Objects.equals(this.updatedAtGt, replicationPlanWhereInput.updatedAtGt)
                && Objects.equals(this.updatedAtGte, replicationPlanWhereInput.updatedAtGte)
                && Objects.equals(this.updatedAtIn, replicationPlanWhereInput.updatedAtIn)
                && Objects.equals(this.updatedAtLt, replicationPlanWhereInput.updatedAtLt)
                && Objects.equals(this.updatedAtLte, replicationPlanWhereInput.updatedAtLte)
                && Objects.equals(this.updatedAtNot, replicationPlanWhereInput.updatedAtNot)
                && Objects.equals(this.updatedAtNotIn, replicationPlanWhereInput.updatedAtNotIn)
                && Objects.equals(this.vmsEvery, replicationPlanWhereInput.vmsEvery)
                && Objects.equals(this.vmsNone, replicationPlanWhereInput.vmsNone)
                && Objects.equals(this.vmsSome, replicationPlanWhereInput.vmsSome)
                && Objects.equals(this.windowEnd, replicationPlanWhereInput.windowEnd)
                && Objects.equals(
                        this.windowEndContains, replicationPlanWhereInput.windowEndContains)
                && Objects.equals(
                        this.windowEndEndsWith, replicationPlanWhereInput.windowEndEndsWith)
                && Objects.equals(this.windowEndGt, replicationPlanWhereInput.windowEndGt)
                && Objects.equals(this.windowEndGte, replicationPlanWhereInput.windowEndGte)
                && Objects.equals(this.windowEndIn, replicationPlanWhereInput.windowEndIn)
                && Objects.equals(this.windowEndLt, replicationPlanWhereInput.windowEndLt)
                && Objects.equals(this.windowEndLte, replicationPlanWhereInput.windowEndLte)
                && Objects.equals(this.windowEndNot, replicationPlanWhereInput.windowEndNot)
                && Objects.equals(
                        this.windowEndNotContains, replicationPlanWhereInput.windowEndNotContains)
                && Objects.equals(
                        this.windowEndNotEndsWith, replicationPlanWhereInput.windowEndNotEndsWith)
                && Objects.equals(this.windowEndNotIn, replicationPlanWhereInput.windowEndNotIn)
                && Objects.equals(
                        this.windowEndNotStartsWith,
                        replicationPlanWhereInput.windowEndNotStartsWith)
                && Objects.equals(
                        this.windowEndStartsWith, replicationPlanWhereInput.windowEndStartsWith)
                && Objects.equals(this.windowStart, replicationPlanWhereInput.windowStart)
                && Objects.equals(
                        this.windowStartContains, replicationPlanWhereInput.windowStartContains)
                && Objects.equals(
                        this.windowStartEndsWith, replicationPlanWhereInput.windowStartEndsWith)
                && Objects.equals(this.windowStartGt, replicationPlanWhereInput.windowStartGt)
                && Objects.equals(this.windowStartGte, replicationPlanWhereInput.windowStartGte)
                && Objects.equals(this.windowStartIn, replicationPlanWhereInput.windowStartIn)
                && Objects.equals(this.windowStartLt, replicationPlanWhereInput.windowStartLt)
                && Objects.equals(this.windowStartLte, replicationPlanWhereInput.windowStartLte)
                && Objects.equals(this.windowStartNot, replicationPlanWhereInput.windowStartNot)
                && Objects.equals(
                        this.windowStartNotContains,
                        replicationPlanWhereInput.windowStartNotContains)
                && Objects.equals(
                        this.windowStartNotEndsWith,
                        replicationPlanWhereInput.windowStartNotEndsWith)
                && Objects.equals(this.windowStartNotIn, replicationPlanWhereInput.windowStartNotIn)
                && Objects.equals(
                        this.windowStartNotStartsWith,
                        replicationPlanWhereInput.windowStartNotStartsWith)
                && Objects.equals(
                        this.windowStartStartsWith,
                        replicationPlanWhereInput.windowStartStartsWith);
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
                abortWindowUnfinished,
                abortWindowUnfinishedNot,
                activationTimestamp,
                activationTimestampGt,
                activationTimestampGte,
                activationTimestampIn,
                activationTimestampLt,
                activationTimestampLte,
                activationTimestampNot,
                activationTimestampNotIn,
                compression,
                compressionNot,
                createdAt,
                createdAtGt,
                createdAtGte,
                createdAtIn,
                createdAtLt,
                createdAtLte,
                createdAtNot,
                createdAtNotIn,
                deleteStrategy,
                deleteStrategyIn,
                deleteStrategyNot,
                deleteStrategyNotIn,
                description,
                descriptionContains,
                descriptionEndsWith,
                descriptionGt,
                descriptionGte,
                descriptionIn,
                descriptionLt,
                descriptionLte,
                descriptionNot,
                descriptionNotContains,
                descriptionNotEndsWith,
                descriptionNotIn,
                descriptionNotStartsWith,
                descriptionStartsWith,
                ecK,
                ecKGt,
                ecKGte,
                ecKIn,
                ecKLt,
                ecKLte,
                ecKNot,
                ecKNotIn,
                ecM,
                ecMGt,
                ecMGte,
                ecMIn,
                ecMLt,
                ecMLte,
                ecMNot,
                ecMNotIn,
                enableWindow,
                enableWindowNot,
                entityAsyncStatus,
                entityAsyncStatusIn,
                entityAsyncStatusNot,
                entityAsyncStatusNotIn,
                externalCloudtower,
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
                inbound,
                inboundNot,
                interval,
                intervalGt,
                intervalGte,
                intervalIn,
                intervalLt,
                intervalLte,
                intervalNot,
                intervalNotIn,
                iscsiLunsEvery,
                iscsiLunsNone,
                iscsiLunsSome,
                keepMacAddress,
                keepMacAddressNot,
                keepPolicy,
                keepPolicyIn,
                keepPolicyNot,
                keepPolicyNotIn,
                keepPolicyValue,
                keepPolicyValueGt,
                keepPolicyValueGte,
                keepPolicyValueIn,
                keepPolicyValueLt,
                keepPolicyValueLte,
                keepPolicyValueNot,
                keepPolicyValueNotIn,
                lastExecuteStatus,
                lastExecuteStatusIn,
                lastExecuteStatusMessage,
                lastExecuteStatusMessageContains,
                lastExecuteStatusMessageEndsWith,
                lastExecuteStatusMessageGt,
                lastExecuteStatusMessageGte,
                lastExecuteStatusMessageIn,
                lastExecuteStatusMessageLt,
                lastExecuteStatusMessageLte,
                lastExecuteStatusMessageNot,
                lastExecuteStatusMessageNotContains,
                lastExecuteStatusMessageNotEndsWith,
                lastExecuteStatusMessageNotIn,
                lastExecuteStatusMessageNotStartsWith,
                lastExecuteStatusMessageStartsWith,
                lastExecuteStatusNot,
                lastExecuteStatusNotIn,
                lastExecuteSuccessJobCount,
                lastExecuteSuccessJobCountGt,
                lastExecuteSuccessJobCountGte,
                lastExecuteSuccessJobCountIn,
                lastExecuteSuccessJobCountLt,
                lastExecuteSuccessJobCountLte,
                lastExecuteSuccessJobCountNot,
                lastExecuteSuccessJobCountNotIn,
                lastExecuteTotalJobCount,
                lastExecuteTotalJobCountGt,
                lastExecuteTotalJobCountGte,
                lastExecuteTotalJobCountIn,
                lastExecuteTotalJobCountLt,
                lastExecuteTotalJobCountLte,
                lastExecuteTotalJobCountNot,
                lastExecuteTotalJobCountNotIn,
                lastExecutedAt,
                lastExecutedAtGt,
                lastExecutedAtGte,
                lastExecutedAtIn,
                lastExecutedAtLt,
                lastExecutedAtLte,
                lastExecutedAtNot,
                lastExecutedAtNotIn,
                lastManualExecuteStatus,
                lastManualExecuteStatusIn,
                lastManualExecuteStatusMessage,
                lastManualExecuteStatusMessageContains,
                lastManualExecuteStatusMessageEndsWith,
                lastManualExecuteStatusMessageGt,
                lastManualExecuteStatusMessageGte,
                lastManualExecuteStatusMessageIn,
                lastManualExecuteStatusMessageLt,
                lastManualExecuteStatusMessageLte,
                lastManualExecuteStatusMessageNot,
                lastManualExecuteStatusMessageNotContains,
                lastManualExecuteStatusMessageNotEndsWith,
                lastManualExecuteStatusMessageNotIn,
                lastManualExecuteStatusMessageNotStartsWith,
                lastManualExecuteStatusMessageStartsWith,
                lastManualExecuteStatusNot,
                lastManualExecuteStatusNotIn,
                lastManualExecuteSuccessJobCount,
                lastManualExecuteSuccessJobCountGt,
                lastManualExecuteSuccessJobCountGte,
                lastManualExecuteSuccessJobCountIn,
                lastManualExecuteSuccessJobCountLt,
                lastManualExecuteSuccessJobCountLte,
                lastManualExecuteSuccessJobCountNot,
                lastManualExecuteSuccessJobCountNotIn,
                lastManualExecuteTotalJobCount,
                lastManualExecuteTotalJobCountGt,
                lastManualExecuteTotalJobCountGte,
                lastManualExecuteTotalJobCountIn,
                lastManualExecuteTotalJobCountLt,
                lastManualExecuteTotalJobCountLte,
                lastManualExecuteTotalJobCountNot,
                lastManualExecuteTotalJobCountNotIn,
                lastManualExecutedAt,
                lastManualExecutedAtGt,
                lastManualExecutedAtGte,
                lastManualExecutedAtIn,
                lastManualExecutedAtLt,
                lastManualExecutedAtLte,
                lastManualExecutedAtNot,
                lastManualExecutedAtNotIn,
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
                nextExecutionTime,
                nextExecutionTimeGt,
                nextExecutionTimeGte,
                nextExecutionTimeIn,
                nextExecutionTimeLt,
                nextExecutionTimeLte,
                nextExecutionTimeNot,
                nextExecutionTimeNotIn,
                period,
                periodIn,
                periodNot,
                periodNotIn,
                phase,
                phaseIn,
                phaseNot,
                phaseNotIn,
                replicaNameRule,
                replicaNameRuleIn,
                replicaNameRuleNot,
                replicaNameRuleNotIn,
                replicaNameSetting,
                replicaNameSettingContains,
                replicaNameSettingEndsWith,
                replicaNameSettingGt,
                replicaNameSettingGte,
                replicaNameSettingIn,
                replicaNameSettingLt,
                replicaNameSettingLte,
                replicaNameSettingNot,
                replicaNameSettingNotContains,
                replicaNameSettingNotEndsWith,
                replicaNameSettingNotIn,
                replicaNameSettingNotStartsWith,
                replicaNameSettingStartsWith,
                replicaNum,
                replicaNumGt,
                replicaNumGte,
                replicaNumIn,
                replicaNumLt,
                replicaNumLte,
                replicaNumNot,
                replicaNumNotIn,
                replicaVmsEvery,
                replicaVmsNone,
                replicaVmsSome,
                replicationPlanExecutionsEvery,
                replicationPlanExecutionsNone,
                replicationPlanExecutionsSome,
                replicationRestorePointsEvery,
                replicationRestorePointsNone,
                replicationRestorePointsSome,
                replicationTargetExecutionsEvery,
                replicationTargetExecutionsNone,
                replicationTargetExecutionsSome,
                resiliencyType,
                resiliencyTypeIn,
                resiliencyTypeNot,
                resiliencyTypeNotIn,
                snapshotConsistentType,
                snapshotConsistentTypeIn,
                snapshotConsistentTypeNot,
                snapshotConsistentTypeNotIn,
                status,
                statusIn,
                statusNot,
                statusNotIn,
                storagePolicy,
                storagePolicyIn,
                storagePolicyNot,
                storagePolicyNotIn,
                targetCluster,
                targetReplicationService,
                thinProvision,
                thinProvisionNot,
                type,
                typeIn,
                typeNot,
                typeNotIn,
                updatedAt,
                updatedAtGt,
                updatedAtGte,
                updatedAtIn,
                updatedAtLt,
                updatedAtLte,
                updatedAtNot,
                updatedAtNotIn,
                vmsEvery,
                vmsNone,
                vmsSome,
                windowEnd,
                windowEndContains,
                windowEndEndsWith,
                windowEndGt,
                windowEndGte,
                windowEndIn,
                windowEndLt,
                windowEndLte,
                windowEndNot,
                windowEndNotContains,
                windowEndNotEndsWith,
                windowEndNotIn,
                windowEndNotStartsWith,
                windowEndStartsWith,
                windowStart,
                windowStartContains,
                windowStartEndsWith,
                windowStartGt,
                windowStartGte,
                windowStartIn,
                windowStartLt,
                windowStartLte,
                windowStartNot,
                windowStartNotContains,
                windowStartNotEndsWith,
                windowStartNotIn,
                windowStartNotStartsWith,
                windowStartStartsWith);
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
        sb.append("class ReplicationPlanWhereInput {\n");
        sb.append("    AND: ").append(toIndentedString(AND)).append("\n");
        sb.append("    NOT: ").append(toIndentedString(NOT)).append("\n");
        sb.append("    OR: ").append(toIndentedString(OR)).append("\n");
        sb.append("    abortWindowUnfinished: ")
                .append(toIndentedString(abortWindowUnfinished))
                .append("\n");
        sb.append("    abortWindowUnfinishedNot: ")
                .append(toIndentedString(abortWindowUnfinishedNot))
                .append("\n");
        sb.append("    activationTimestamp: ")
                .append(toIndentedString(activationTimestamp))
                .append("\n");
        sb.append("    activationTimestampGt: ")
                .append(toIndentedString(activationTimestampGt))
                .append("\n");
        sb.append("    activationTimestampGte: ")
                .append(toIndentedString(activationTimestampGte))
                .append("\n");
        sb.append("    activationTimestampIn: ")
                .append(toIndentedString(activationTimestampIn))
                .append("\n");
        sb.append("    activationTimestampLt: ")
                .append(toIndentedString(activationTimestampLt))
                .append("\n");
        sb.append("    activationTimestampLte: ")
                .append(toIndentedString(activationTimestampLte))
                .append("\n");
        sb.append("    activationTimestampNot: ")
                .append(toIndentedString(activationTimestampNot))
                .append("\n");
        sb.append("    activationTimestampNotIn: ")
                .append(toIndentedString(activationTimestampNotIn))
                .append("\n");
        sb.append("    compression: ").append(toIndentedString(compression)).append("\n");
        sb.append("    compressionNot: ").append(toIndentedString(compressionNot)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    createdAtGt: ").append(toIndentedString(createdAtGt)).append("\n");
        sb.append("    createdAtGte: ").append(toIndentedString(createdAtGte)).append("\n");
        sb.append("    createdAtIn: ").append(toIndentedString(createdAtIn)).append("\n");
        sb.append("    createdAtLt: ").append(toIndentedString(createdAtLt)).append("\n");
        sb.append("    createdAtLte: ").append(toIndentedString(createdAtLte)).append("\n");
        sb.append("    createdAtNot: ").append(toIndentedString(createdAtNot)).append("\n");
        sb.append("    createdAtNotIn: ").append(toIndentedString(createdAtNotIn)).append("\n");
        sb.append("    deleteStrategy: ").append(toIndentedString(deleteStrategy)).append("\n");
        sb.append("    deleteStrategyIn: ").append(toIndentedString(deleteStrategyIn)).append("\n");
        sb.append("    deleteStrategyNot: ")
                .append(toIndentedString(deleteStrategyNot))
                .append("\n");
        sb.append("    deleteStrategyNotIn: ")
                .append(toIndentedString(deleteStrategyNotIn))
                .append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    descriptionContains: ")
                .append(toIndentedString(descriptionContains))
                .append("\n");
        sb.append("    descriptionEndsWith: ")
                .append(toIndentedString(descriptionEndsWith))
                .append("\n");
        sb.append("    descriptionGt: ").append(toIndentedString(descriptionGt)).append("\n");
        sb.append("    descriptionGte: ").append(toIndentedString(descriptionGte)).append("\n");
        sb.append("    descriptionIn: ").append(toIndentedString(descriptionIn)).append("\n");
        sb.append("    descriptionLt: ").append(toIndentedString(descriptionLt)).append("\n");
        sb.append("    descriptionLte: ").append(toIndentedString(descriptionLte)).append("\n");
        sb.append("    descriptionNot: ").append(toIndentedString(descriptionNot)).append("\n");
        sb.append("    descriptionNotContains: ")
                .append(toIndentedString(descriptionNotContains))
                .append("\n");
        sb.append("    descriptionNotEndsWith: ")
                .append(toIndentedString(descriptionNotEndsWith))
                .append("\n");
        sb.append("    descriptionNotIn: ").append(toIndentedString(descriptionNotIn)).append("\n");
        sb.append("    descriptionNotStartsWith: ")
                .append(toIndentedString(descriptionNotStartsWith))
                .append("\n");
        sb.append("    descriptionStartsWith: ")
                .append(toIndentedString(descriptionStartsWith))
                .append("\n");
        sb.append("    ecK: ").append(toIndentedString(ecK)).append("\n");
        sb.append("    ecKGt: ").append(toIndentedString(ecKGt)).append("\n");
        sb.append("    ecKGte: ").append(toIndentedString(ecKGte)).append("\n");
        sb.append("    ecKIn: ").append(toIndentedString(ecKIn)).append("\n");
        sb.append("    ecKLt: ").append(toIndentedString(ecKLt)).append("\n");
        sb.append("    ecKLte: ").append(toIndentedString(ecKLte)).append("\n");
        sb.append("    ecKNot: ").append(toIndentedString(ecKNot)).append("\n");
        sb.append("    ecKNotIn: ").append(toIndentedString(ecKNotIn)).append("\n");
        sb.append("    ecM: ").append(toIndentedString(ecM)).append("\n");
        sb.append("    ecMGt: ").append(toIndentedString(ecMGt)).append("\n");
        sb.append("    ecMGte: ").append(toIndentedString(ecMGte)).append("\n");
        sb.append("    ecMIn: ").append(toIndentedString(ecMIn)).append("\n");
        sb.append("    ecMLt: ").append(toIndentedString(ecMLt)).append("\n");
        sb.append("    ecMLte: ").append(toIndentedString(ecMLte)).append("\n");
        sb.append("    ecMNot: ").append(toIndentedString(ecMNot)).append("\n");
        sb.append("    ecMNotIn: ").append(toIndentedString(ecMNotIn)).append("\n");
        sb.append("    enableWindow: ").append(toIndentedString(enableWindow)).append("\n");
        sb.append("    enableWindowNot: ").append(toIndentedString(enableWindowNot)).append("\n");
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
        sb.append("    externalCloudtower: ")
                .append(toIndentedString(externalCloudtower))
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
        sb.append("    inbound: ").append(toIndentedString(inbound)).append("\n");
        sb.append("    inboundNot: ").append(toIndentedString(inboundNot)).append("\n");
        sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
        sb.append("    intervalGt: ").append(toIndentedString(intervalGt)).append("\n");
        sb.append("    intervalGte: ").append(toIndentedString(intervalGte)).append("\n");
        sb.append("    intervalIn: ").append(toIndentedString(intervalIn)).append("\n");
        sb.append("    intervalLt: ").append(toIndentedString(intervalLt)).append("\n");
        sb.append("    intervalLte: ").append(toIndentedString(intervalLte)).append("\n");
        sb.append("    intervalNot: ").append(toIndentedString(intervalNot)).append("\n");
        sb.append("    intervalNotIn: ").append(toIndentedString(intervalNotIn)).append("\n");
        sb.append("    iscsiLunsEvery: ").append(toIndentedString(iscsiLunsEvery)).append("\n");
        sb.append("    iscsiLunsNone: ").append(toIndentedString(iscsiLunsNone)).append("\n");
        sb.append("    iscsiLunsSome: ").append(toIndentedString(iscsiLunsSome)).append("\n");
        sb.append("    keepMacAddress: ").append(toIndentedString(keepMacAddress)).append("\n");
        sb.append("    keepMacAddressNot: ")
                .append(toIndentedString(keepMacAddressNot))
                .append("\n");
        sb.append("    keepPolicy: ").append(toIndentedString(keepPolicy)).append("\n");
        sb.append("    keepPolicyIn: ").append(toIndentedString(keepPolicyIn)).append("\n");
        sb.append("    keepPolicyNot: ").append(toIndentedString(keepPolicyNot)).append("\n");
        sb.append("    keepPolicyNotIn: ").append(toIndentedString(keepPolicyNotIn)).append("\n");
        sb.append("    keepPolicyValue: ").append(toIndentedString(keepPolicyValue)).append("\n");
        sb.append("    keepPolicyValueGt: ")
                .append(toIndentedString(keepPolicyValueGt))
                .append("\n");
        sb.append("    keepPolicyValueGte: ")
                .append(toIndentedString(keepPolicyValueGte))
                .append("\n");
        sb.append("    keepPolicyValueIn: ")
                .append(toIndentedString(keepPolicyValueIn))
                .append("\n");
        sb.append("    keepPolicyValueLt: ")
                .append(toIndentedString(keepPolicyValueLt))
                .append("\n");
        sb.append("    keepPolicyValueLte: ")
                .append(toIndentedString(keepPolicyValueLte))
                .append("\n");
        sb.append("    keepPolicyValueNot: ")
                .append(toIndentedString(keepPolicyValueNot))
                .append("\n");
        sb.append("    keepPolicyValueNotIn: ")
                .append(toIndentedString(keepPolicyValueNotIn))
                .append("\n");
        sb.append("    lastExecuteStatus: ")
                .append(toIndentedString(lastExecuteStatus))
                .append("\n");
        sb.append("    lastExecuteStatusIn: ")
                .append(toIndentedString(lastExecuteStatusIn))
                .append("\n");
        sb.append("    lastExecuteStatusMessage: ")
                .append(toIndentedString(lastExecuteStatusMessage))
                .append("\n");
        sb.append("    lastExecuteStatusMessageContains: ")
                .append(toIndentedString(lastExecuteStatusMessageContains))
                .append("\n");
        sb.append("    lastExecuteStatusMessageEndsWith: ")
                .append(toIndentedString(lastExecuteStatusMessageEndsWith))
                .append("\n");
        sb.append("    lastExecuteStatusMessageGt: ")
                .append(toIndentedString(lastExecuteStatusMessageGt))
                .append("\n");
        sb.append("    lastExecuteStatusMessageGte: ")
                .append(toIndentedString(lastExecuteStatusMessageGte))
                .append("\n");
        sb.append("    lastExecuteStatusMessageIn: ")
                .append(toIndentedString(lastExecuteStatusMessageIn))
                .append("\n");
        sb.append("    lastExecuteStatusMessageLt: ")
                .append(toIndentedString(lastExecuteStatusMessageLt))
                .append("\n");
        sb.append("    lastExecuteStatusMessageLte: ")
                .append(toIndentedString(lastExecuteStatusMessageLte))
                .append("\n");
        sb.append("    lastExecuteStatusMessageNot: ")
                .append(toIndentedString(lastExecuteStatusMessageNot))
                .append("\n");
        sb.append("    lastExecuteStatusMessageNotContains: ")
                .append(toIndentedString(lastExecuteStatusMessageNotContains))
                .append("\n");
        sb.append("    lastExecuteStatusMessageNotEndsWith: ")
                .append(toIndentedString(lastExecuteStatusMessageNotEndsWith))
                .append("\n");
        sb.append("    lastExecuteStatusMessageNotIn: ")
                .append(toIndentedString(lastExecuteStatusMessageNotIn))
                .append("\n");
        sb.append("    lastExecuteStatusMessageNotStartsWith: ")
                .append(toIndentedString(lastExecuteStatusMessageNotStartsWith))
                .append("\n");
        sb.append("    lastExecuteStatusMessageStartsWith: ")
                .append(toIndentedString(lastExecuteStatusMessageStartsWith))
                .append("\n");
        sb.append("    lastExecuteStatusNot: ")
                .append(toIndentedString(lastExecuteStatusNot))
                .append("\n");
        sb.append("    lastExecuteStatusNotIn: ")
                .append(toIndentedString(lastExecuteStatusNotIn))
                .append("\n");
        sb.append("    lastExecuteSuccessJobCount: ")
                .append(toIndentedString(lastExecuteSuccessJobCount))
                .append("\n");
        sb.append("    lastExecuteSuccessJobCountGt: ")
                .append(toIndentedString(lastExecuteSuccessJobCountGt))
                .append("\n");
        sb.append("    lastExecuteSuccessJobCountGte: ")
                .append(toIndentedString(lastExecuteSuccessJobCountGte))
                .append("\n");
        sb.append("    lastExecuteSuccessJobCountIn: ")
                .append(toIndentedString(lastExecuteSuccessJobCountIn))
                .append("\n");
        sb.append("    lastExecuteSuccessJobCountLt: ")
                .append(toIndentedString(lastExecuteSuccessJobCountLt))
                .append("\n");
        sb.append("    lastExecuteSuccessJobCountLte: ")
                .append(toIndentedString(lastExecuteSuccessJobCountLte))
                .append("\n");
        sb.append("    lastExecuteSuccessJobCountNot: ")
                .append(toIndentedString(lastExecuteSuccessJobCountNot))
                .append("\n");
        sb.append("    lastExecuteSuccessJobCountNotIn: ")
                .append(toIndentedString(lastExecuteSuccessJobCountNotIn))
                .append("\n");
        sb.append("    lastExecuteTotalJobCount: ")
                .append(toIndentedString(lastExecuteTotalJobCount))
                .append("\n");
        sb.append("    lastExecuteTotalJobCountGt: ")
                .append(toIndentedString(lastExecuteTotalJobCountGt))
                .append("\n");
        sb.append("    lastExecuteTotalJobCountGte: ")
                .append(toIndentedString(lastExecuteTotalJobCountGte))
                .append("\n");
        sb.append("    lastExecuteTotalJobCountIn: ")
                .append(toIndentedString(lastExecuteTotalJobCountIn))
                .append("\n");
        sb.append("    lastExecuteTotalJobCountLt: ")
                .append(toIndentedString(lastExecuteTotalJobCountLt))
                .append("\n");
        sb.append("    lastExecuteTotalJobCountLte: ")
                .append(toIndentedString(lastExecuteTotalJobCountLte))
                .append("\n");
        sb.append("    lastExecuteTotalJobCountNot: ")
                .append(toIndentedString(lastExecuteTotalJobCountNot))
                .append("\n");
        sb.append("    lastExecuteTotalJobCountNotIn: ")
                .append(toIndentedString(lastExecuteTotalJobCountNotIn))
                .append("\n");
        sb.append("    lastExecutedAt: ").append(toIndentedString(lastExecutedAt)).append("\n");
        sb.append("    lastExecutedAtGt: ").append(toIndentedString(lastExecutedAtGt)).append("\n");
        sb.append("    lastExecutedAtGte: ")
                .append(toIndentedString(lastExecutedAtGte))
                .append("\n");
        sb.append("    lastExecutedAtIn: ").append(toIndentedString(lastExecutedAtIn)).append("\n");
        sb.append("    lastExecutedAtLt: ").append(toIndentedString(lastExecutedAtLt)).append("\n");
        sb.append("    lastExecutedAtLte: ")
                .append(toIndentedString(lastExecutedAtLte))
                .append("\n");
        sb.append("    lastExecutedAtNot: ")
                .append(toIndentedString(lastExecutedAtNot))
                .append("\n");
        sb.append("    lastExecutedAtNotIn: ")
                .append(toIndentedString(lastExecutedAtNotIn))
                .append("\n");
        sb.append("    lastManualExecuteStatus: ")
                .append(toIndentedString(lastManualExecuteStatus))
                .append("\n");
        sb.append("    lastManualExecuteStatusIn: ")
                .append(toIndentedString(lastManualExecuteStatusIn))
                .append("\n");
        sb.append("    lastManualExecuteStatusMessage: ")
                .append(toIndentedString(lastManualExecuteStatusMessage))
                .append("\n");
        sb.append("    lastManualExecuteStatusMessageContains: ")
                .append(toIndentedString(lastManualExecuteStatusMessageContains))
                .append("\n");
        sb.append("    lastManualExecuteStatusMessageEndsWith: ")
                .append(toIndentedString(lastManualExecuteStatusMessageEndsWith))
                .append("\n");
        sb.append("    lastManualExecuteStatusMessageGt: ")
                .append(toIndentedString(lastManualExecuteStatusMessageGt))
                .append("\n");
        sb.append("    lastManualExecuteStatusMessageGte: ")
                .append(toIndentedString(lastManualExecuteStatusMessageGte))
                .append("\n");
        sb.append("    lastManualExecuteStatusMessageIn: ")
                .append(toIndentedString(lastManualExecuteStatusMessageIn))
                .append("\n");
        sb.append("    lastManualExecuteStatusMessageLt: ")
                .append(toIndentedString(lastManualExecuteStatusMessageLt))
                .append("\n");
        sb.append("    lastManualExecuteStatusMessageLte: ")
                .append(toIndentedString(lastManualExecuteStatusMessageLte))
                .append("\n");
        sb.append("    lastManualExecuteStatusMessageNot: ")
                .append(toIndentedString(lastManualExecuteStatusMessageNot))
                .append("\n");
        sb.append("    lastManualExecuteStatusMessageNotContains: ")
                .append(toIndentedString(lastManualExecuteStatusMessageNotContains))
                .append("\n");
        sb.append("    lastManualExecuteStatusMessageNotEndsWith: ")
                .append(toIndentedString(lastManualExecuteStatusMessageNotEndsWith))
                .append("\n");
        sb.append("    lastManualExecuteStatusMessageNotIn: ")
                .append(toIndentedString(lastManualExecuteStatusMessageNotIn))
                .append("\n");
        sb.append("    lastManualExecuteStatusMessageNotStartsWith: ")
                .append(toIndentedString(lastManualExecuteStatusMessageNotStartsWith))
                .append("\n");
        sb.append("    lastManualExecuteStatusMessageStartsWith: ")
                .append(toIndentedString(lastManualExecuteStatusMessageStartsWith))
                .append("\n");
        sb.append("    lastManualExecuteStatusNot: ")
                .append(toIndentedString(lastManualExecuteStatusNot))
                .append("\n");
        sb.append("    lastManualExecuteStatusNotIn: ")
                .append(toIndentedString(lastManualExecuteStatusNotIn))
                .append("\n");
        sb.append("    lastManualExecuteSuccessJobCount: ")
                .append(toIndentedString(lastManualExecuteSuccessJobCount))
                .append("\n");
        sb.append("    lastManualExecuteSuccessJobCountGt: ")
                .append(toIndentedString(lastManualExecuteSuccessJobCountGt))
                .append("\n");
        sb.append("    lastManualExecuteSuccessJobCountGte: ")
                .append(toIndentedString(lastManualExecuteSuccessJobCountGte))
                .append("\n");
        sb.append("    lastManualExecuteSuccessJobCountIn: ")
                .append(toIndentedString(lastManualExecuteSuccessJobCountIn))
                .append("\n");
        sb.append("    lastManualExecuteSuccessJobCountLt: ")
                .append(toIndentedString(lastManualExecuteSuccessJobCountLt))
                .append("\n");
        sb.append("    lastManualExecuteSuccessJobCountLte: ")
                .append(toIndentedString(lastManualExecuteSuccessJobCountLte))
                .append("\n");
        sb.append("    lastManualExecuteSuccessJobCountNot: ")
                .append(toIndentedString(lastManualExecuteSuccessJobCountNot))
                .append("\n");
        sb.append("    lastManualExecuteSuccessJobCountNotIn: ")
                .append(toIndentedString(lastManualExecuteSuccessJobCountNotIn))
                .append("\n");
        sb.append("    lastManualExecuteTotalJobCount: ")
                .append(toIndentedString(lastManualExecuteTotalJobCount))
                .append("\n");
        sb.append("    lastManualExecuteTotalJobCountGt: ")
                .append(toIndentedString(lastManualExecuteTotalJobCountGt))
                .append("\n");
        sb.append("    lastManualExecuteTotalJobCountGte: ")
                .append(toIndentedString(lastManualExecuteTotalJobCountGte))
                .append("\n");
        sb.append("    lastManualExecuteTotalJobCountIn: ")
                .append(toIndentedString(lastManualExecuteTotalJobCountIn))
                .append("\n");
        sb.append("    lastManualExecuteTotalJobCountLt: ")
                .append(toIndentedString(lastManualExecuteTotalJobCountLt))
                .append("\n");
        sb.append("    lastManualExecuteTotalJobCountLte: ")
                .append(toIndentedString(lastManualExecuteTotalJobCountLte))
                .append("\n");
        sb.append("    lastManualExecuteTotalJobCountNot: ")
                .append(toIndentedString(lastManualExecuteTotalJobCountNot))
                .append("\n");
        sb.append("    lastManualExecuteTotalJobCountNotIn: ")
                .append(toIndentedString(lastManualExecuteTotalJobCountNotIn))
                .append("\n");
        sb.append("    lastManualExecutedAt: ")
                .append(toIndentedString(lastManualExecutedAt))
                .append("\n");
        sb.append("    lastManualExecutedAtGt: ")
                .append(toIndentedString(lastManualExecutedAtGt))
                .append("\n");
        sb.append("    lastManualExecutedAtGte: ")
                .append(toIndentedString(lastManualExecutedAtGte))
                .append("\n");
        sb.append("    lastManualExecutedAtIn: ")
                .append(toIndentedString(lastManualExecutedAtIn))
                .append("\n");
        sb.append("    lastManualExecutedAtLt: ")
                .append(toIndentedString(lastManualExecutedAtLt))
                .append("\n");
        sb.append("    lastManualExecutedAtLte: ")
                .append(toIndentedString(lastManualExecutedAtLte))
                .append("\n");
        sb.append("    lastManualExecutedAtNot: ")
                .append(toIndentedString(lastManualExecutedAtNot))
                .append("\n");
        sb.append("    lastManualExecutedAtNotIn: ")
                .append(toIndentedString(lastManualExecutedAtNotIn))
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
        sb.append("    nextExecutionTime: ")
                .append(toIndentedString(nextExecutionTime))
                .append("\n");
        sb.append("    nextExecutionTimeGt: ")
                .append(toIndentedString(nextExecutionTimeGt))
                .append("\n");
        sb.append("    nextExecutionTimeGte: ")
                .append(toIndentedString(nextExecutionTimeGte))
                .append("\n");
        sb.append("    nextExecutionTimeIn: ")
                .append(toIndentedString(nextExecutionTimeIn))
                .append("\n");
        sb.append("    nextExecutionTimeLt: ")
                .append(toIndentedString(nextExecutionTimeLt))
                .append("\n");
        sb.append("    nextExecutionTimeLte: ")
                .append(toIndentedString(nextExecutionTimeLte))
                .append("\n");
        sb.append("    nextExecutionTimeNot: ")
                .append(toIndentedString(nextExecutionTimeNot))
                .append("\n");
        sb.append("    nextExecutionTimeNotIn: ")
                .append(toIndentedString(nextExecutionTimeNotIn))
                .append("\n");
        sb.append("    period: ").append(toIndentedString(period)).append("\n");
        sb.append("    periodIn: ").append(toIndentedString(periodIn)).append("\n");
        sb.append("    periodNot: ").append(toIndentedString(periodNot)).append("\n");
        sb.append("    periodNotIn: ").append(toIndentedString(periodNotIn)).append("\n");
        sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
        sb.append("    phaseIn: ").append(toIndentedString(phaseIn)).append("\n");
        sb.append("    phaseNot: ").append(toIndentedString(phaseNot)).append("\n");
        sb.append("    phaseNotIn: ").append(toIndentedString(phaseNotIn)).append("\n");
        sb.append("    replicaNameRule: ").append(toIndentedString(replicaNameRule)).append("\n");
        sb.append("    replicaNameRuleIn: ")
                .append(toIndentedString(replicaNameRuleIn))
                .append("\n");
        sb.append("    replicaNameRuleNot: ")
                .append(toIndentedString(replicaNameRuleNot))
                .append("\n");
        sb.append("    replicaNameRuleNotIn: ")
                .append(toIndentedString(replicaNameRuleNotIn))
                .append("\n");
        sb.append("    replicaNameSetting: ")
                .append(toIndentedString(replicaNameSetting))
                .append("\n");
        sb.append("    replicaNameSettingContains: ")
                .append(toIndentedString(replicaNameSettingContains))
                .append("\n");
        sb.append("    replicaNameSettingEndsWith: ")
                .append(toIndentedString(replicaNameSettingEndsWith))
                .append("\n");
        sb.append("    replicaNameSettingGt: ")
                .append(toIndentedString(replicaNameSettingGt))
                .append("\n");
        sb.append("    replicaNameSettingGte: ")
                .append(toIndentedString(replicaNameSettingGte))
                .append("\n");
        sb.append("    replicaNameSettingIn: ")
                .append(toIndentedString(replicaNameSettingIn))
                .append("\n");
        sb.append("    replicaNameSettingLt: ")
                .append(toIndentedString(replicaNameSettingLt))
                .append("\n");
        sb.append("    replicaNameSettingLte: ")
                .append(toIndentedString(replicaNameSettingLte))
                .append("\n");
        sb.append("    replicaNameSettingNot: ")
                .append(toIndentedString(replicaNameSettingNot))
                .append("\n");
        sb.append("    replicaNameSettingNotContains: ")
                .append(toIndentedString(replicaNameSettingNotContains))
                .append("\n");
        sb.append("    replicaNameSettingNotEndsWith: ")
                .append(toIndentedString(replicaNameSettingNotEndsWith))
                .append("\n");
        sb.append("    replicaNameSettingNotIn: ")
                .append(toIndentedString(replicaNameSettingNotIn))
                .append("\n");
        sb.append("    replicaNameSettingNotStartsWith: ")
                .append(toIndentedString(replicaNameSettingNotStartsWith))
                .append("\n");
        sb.append("    replicaNameSettingStartsWith: ")
                .append(toIndentedString(replicaNameSettingStartsWith))
                .append("\n");
        sb.append("    replicaNum: ").append(toIndentedString(replicaNum)).append("\n");
        sb.append("    replicaNumGt: ").append(toIndentedString(replicaNumGt)).append("\n");
        sb.append("    replicaNumGte: ").append(toIndentedString(replicaNumGte)).append("\n");
        sb.append("    replicaNumIn: ").append(toIndentedString(replicaNumIn)).append("\n");
        sb.append("    replicaNumLt: ").append(toIndentedString(replicaNumLt)).append("\n");
        sb.append("    replicaNumLte: ").append(toIndentedString(replicaNumLte)).append("\n");
        sb.append("    replicaNumNot: ").append(toIndentedString(replicaNumNot)).append("\n");
        sb.append("    replicaNumNotIn: ").append(toIndentedString(replicaNumNotIn)).append("\n");
        sb.append("    replicaVmsEvery: ").append(toIndentedString(replicaVmsEvery)).append("\n");
        sb.append("    replicaVmsNone: ").append(toIndentedString(replicaVmsNone)).append("\n");
        sb.append("    replicaVmsSome: ").append(toIndentedString(replicaVmsSome)).append("\n");
        sb.append("    replicationPlanExecutionsEvery: ")
                .append(toIndentedString(replicationPlanExecutionsEvery))
                .append("\n");
        sb.append("    replicationPlanExecutionsNone: ")
                .append(toIndentedString(replicationPlanExecutionsNone))
                .append("\n");
        sb.append("    replicationPlanExecutionsSome: ")
                .append(toIndentedString(replicationPlanExecutionsSome))
                .append("\n");
        sb.append("    replicationRestorePointsEvery: ")
                .append(toIndentedString(replicationRestorePointsEvery))
                .append("\n");
        sb.append("    replicationRestorePointsNone: ")
                .append(toIndentedString(replicationRestorePointsNone))
                .append("\n");
        sb.append("    replicationRestorePointsSome: ")
                .append(toIndentedString(replicationRestorePointsSome))
                .append("\n");
        sb.append("    replicationTargetExecutionsEvery: ")
                .append(toIndentedString(replicationTargetExecutionsEvery))
                .append("\n");
        sb.append("    replicationTargetExecutionsNone: ")
                .append(toIndentedString(replicationTargetExecutionsNone))
                .append("\n");
        sb.append("    replicationTargetExecutionsSome: ")
                .append(toIndentedString(replicationTargetExecutionsSome))
                .append("\n");
        sb.append("    resiliencyType: ").append(toIndentedString(resiliencyType)).append("\n");
        sb.append("    resiliencyTypeIn: ").append(toIndentedString(resiliencyTypeIn)).append("\n");
        sb.append("    resiliencyTypeNot: ")
                .append(toIndentedString(resiliencyTypeNot))
                .append("\n");
        sb.append("    resiliencyTypeNotIn: ")
                .append(toIndentedString(resiliencyTypeNotIn))
                .append("\n");
        sb.append("    snapshotConsistentType: ")
                .append(toIndentedString(snapshotConsistentType))
                .append("\n");
        sb.append("    snapshotConsistentTypeIn: ")
                .append(toIndentedString(snapshotConsistentTypeIn))
                .append("\n");
        sb.append("    snapshotConsistentTypeNot: ")
                .append(toIndentedString(snapshotConsistentTypeNot))
                .append("\n");
        sb.append("    snapshotConsistentTypeNotIn: ")
                .append(toIndentedString(snapshotConsistentTypeNotIn))
                .append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    statusIn: ").append(toIndentedString(statusIn)).append("\n");
        sb.append("    statusNot: ").append(toIndentedString(statusNot)).append("\n");
        sb.append("    statusNotIn: ").append(toIndentedString(statusNotIn)).append("\n");
        sb.append("    storagePolicy: ").append(toIndentedString(storagePolicy)).append("\n");
        sb.append("    storagePolicyIn: ").append(toIndentedString(storagePolicyIn)).append("\n");
        sb.append("    storagePolicyNot: ").append(toIndentedString(storagePolicyNot)).append("\n");
        sb.append("    storagePolicyNotIn: ")
                .append(toIndentedString(storagePolicyNotIn))
                .append("\n");
        sb.append("    targetCluster: ").append(toIndentedString(targetCluster)).append("\n");
        sb.append("    targetReplicationService: ")
                .append(toIndentedString(targetReplicationService))
                .append("\n");
        sb.append("    thinProvision: ").append(toIndentedString(thinProvision)).append("\n");
        sb.append("    thinProvisionNot: ").append(toIndentedString(thinProvisionNot)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    typeIn: ").append(toIndentedString(typeIn)).append("\n");
        sb.append("    typeNot: ").append(toIndentedString(typeNot)).append("\n");
        sb.append("    typeNotIn: ").append(toIndentedString(typeNotIn)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    updatedAtGt: ").append(toIndentedString(updatedAtGt)).append("\n");
        sb.append("    updatedAtGte: ").append(toIndentedString(updatedAtGte)).append("\n");
        sb.append("    updatedAtIn: ").append(toIndentedString(updatedAtIn)).append("\n");
        sb.append("    updatedAtLt: ").append(toIndentedString(updatedAtLt)).append("\n");
        sb.append("    updatedAtLte: ").append(toIndentedString(updatedAtLte)).append("\n");
        sb.append("    updatedAtNot: ").append(toIndentedString(updatedAtNot)).append("\n");
        sb.append("    updatedAtNotIn: ").append(toIndentedString(updatedAtNotIn)).append("\n");
        sb.append("    vmsEvery: ").append(toIndentedString(vmsEvery)).append("\n");
        sb.append("    vmsNone: ").append(toIndentedString(vmsNone)).append("\n");
        sb.append("    vmsSome: ").append(toIndentedString(vmsSome)).append("\n");
        sb.append("    windowEnd: ").append(toIndentedString(windowEnd)).append("\n");
        sb.append("    windowEndContains: ")
                .append(toIndentedString(windowEndContains))
                .append("\n");
        sb.append("    windowEndEndsWith: ")
                .append(toIndentedString(windowEndEndsWith))
                .append("\n");
        sb.append("    windowEndGt: ").append(toIndentedString(windowEndGt)).append("\n");
        sb.append("    windowEndGte: ").append(toIndentedString(windowEndGte)).append("\n");
        sb.append("    windowEndIn: ").append(toIndentedString(windowEndIn)).append("\n");
        sb.append("    windowEndLt: ").append(toIndentedString(windowEndLt)).append("\n");
        sb.append("    windowEndLte: ").append(toIndentedString(windowEndLte)).append("\n");
        sb.append("    windowEndNot: ").append(toIndentedString(windowEndNot)).append("\n");
        sb.append("    windowEndNotContains: ")
                .append(toIndentedString(windowEndNotContains))
                .append("\n");
        sb.append("    windowEndNotEndsWith: ")
                .append(toIndentedString(windowEndNotEndsWith))
                .append("\n");
        sb.append("    windowEndNotIn: ").append(toIndentedString(windowEndNotIn)).append("\n");
        sb.append("    windowEndNotStartsWith: ")
                .append(toIndentedString(windowEndNotStartsWith))
                .append("\n");
        sb.append("    windowEndStartsWith: ")
                .append(toIndentedString(windowEndStartsWith))
                .append("\n");
        sb.append("    windowStart: ").append(toIndentedString(windowStart)).append("\n");
        sb.append("    windowStartContains: ")
                .append(toIndentedString(windowStartContains))
                .append("\n");
        sb.append("    windowStartEndsWith: ")
                .append(toIndentedString(windowStartEndsWith))
                .append("\n");
        sb.append("    windowStartGt: ").append(toIndentedString(windowStartGt)).append("\n");
        sb.append("    windowStartGte: ").append(toIndentedString(windowStartGte)).append("\n");
        sb.append("    windowStartIn: ").append(toIndentedString(windowStartIn)).append("\n");
        sb.append("    windowStartLt: ").append(toIndentedString(windowStartLt)).append("\n");
        sb.append("    windowStartLte: ").append(toIndentedString(windowStartLte)).append("\n");
        sb.append("    windowStartNot: ").append(toIndentedString(windowStartNot)).append("\n");
        sb.append("    windowStartNotContains: ")
                .append(toIndentedString(windowStartNotContains))
                .append("\n");
        sb.append("    windowStartNotEndsWith: ")
                .append(toIndentedString(windowStartNotEndsWith))
                .append("\n");
        sb.append("    windowStartNotIn: ").append(toIndentedString(windowStartNotIn)).append("\n");
        sb.append("    windowStartNotStartsWith: ")
                .append(toIndentedString(windowStartNotStartsWith))
                .append("\n");
        sb.append("    windowStartStartsWith: ")
                .append(toIndentedString(windowStartStartsWith))
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

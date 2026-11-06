package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** SyncReplicationPlanWhereInput */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class SyncReplicationPlanWhereInput
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_A_N_D = "AND";

    @SerializedName(SERIALIZED_NAME_A_N_D)
    private List<SyncReplicationPlanWhereInput> AND = null;

    public static final String SERIALIZED_NAME_N_O_T = "NOT";

    @SerializedName(SERIALIZED_NAME_N_O_T)
    private List<SyncReplicationPlanWhereInput> NOT = null;

    public static final String SERIALIZED_NAME_O_R = "OR";

    @SerializedName(SERIALIZED_NAME_O_R)
    private List<SyncReplicationPlanWhereInput> OR = null;

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

    public static final String SERIALIZED_NAME_DATA_VERSION = "data_version";

    @SerializedName(SERIALIZED_NAME_DATA_VERSION)
    private Integer dataVersion;

    public static final String SERIALIZED_NAME_DATA_VERSION_GT = "data_version_gt";

    @SerializedName(SERIALIZED_NAME_DATA_VERSION_GT)
    private Integer dataVersionGt;

    public static final String SERIALIZED_NAME_DATA_VERSION_GTE = "data_version_gte";

    @SerializedName(SERIALIZED_NAME_DATA_VERSION_GTE)
    private Integer dataVersionGte;

    public static final String SERIALIZED_NAME_DATA_VERSION_IN = "data_version_in";

    @SerializedName(SERIALIZED_NAME_DATA_VERSION_IN)
    private List<Integer> dataVersionIn = null;

    public static final String SERIALIZED_NAME_DATA_VERSION_LT = "data_version_lt";

    @SerializedName(SERIALIZED_NAME_DATA_VERSION_LT)
    private Integer dataVersionLt;

    public static final String SERIALIZED_NAME_DATA_VERSION_LTE = "data_version_lte";

    @SerializedName(SERIALIZED_NAME_DATA_VERSION_LTE)
    private Integer dataVersionLte;

    public static final String SERIALIZED_NAME_DATA_VERSION_NOT = "data_version_not";

    @SerializedName(SERIALIZED_NAME_DATA_VERSION_NOT)
    private Integer dataVersionNot;

    public static final String SERIALIZED_NAME_DATA_VERSION_NOT_IN = "data_version_not_in";

    @SerializedName(SERIALIZED_NAME_DATA_VERSION_NOT_IN)
    private List<Integer> dataVersionNotIn = null;

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

    public static final String SERIALIZED_NAME_FAILOVER_TEST_KEEP_MAC_ADDRESS =
            "failover_test_keep_mac_address";

    @SerializedName(SERIALIZED_NAME_FAILOVER_TEST_KEEP_MAC_ADDRESS)
    private Boolean failoverTestKeepMacAddress;

    public static final String SERIALIZED_NAME_FAILOVER_TEST_KEEP_MAC_ADDRESS_NOT =
            "failover_test_keep_mac_address_not";

    @SerializedName(SERIALIZED_NAME_FAILOVER_TEST_KEEP_MAC_ADDRESS_NOT)
    private Boolean failoverTestKeepMacAddressNot;

    public static final String SERIALIZED_NAME_FAILOVER_TEST_NAME_RULE = "failover_test_name_rule";

    @SerializedName(SERIALIZED_NAME_FAILOVER_TEST_NAME_RULE)
    private ReplicaNameRule failoverTestNameRule;

    public static final String SERIALIZED_NAME_FAILOVER_TEST_NAME_RULE_IN =
            "failover_test_name_rule_in";

    @SerializedName(SERIALIZED_NAME_FAILOVER_TEST_NAME_RULE_IN)
    private List<ReplicaNameRule> failoverTestNameRuleIn = null;

    public static final String SERIALIZED_NAME_FAILOVER_TEST_NAME_RULE_NOT =
            "failover_test_name_rule_not";

    @SerializedName(SERIALIZED_NAME_FAILOVER_TEST_NAME_RULE_NOT)
    private ReplicaNameRule failoverTestNameRuleNot;

    public static final String SERIALIZED_NAME_FAILOVER_TEST_NAME_RULE_NOT_IN =
            "failover_test_name_rule_not_in";

    @SerializedName(SERIALIZED_NAME_FAILOVER_TEST_NAME_RULE_NOT_IN)
    private List<ReplicaNameRule> failoverTestNameRuleNotIn = null;

    public static final String SERIALIZED_NAME_FAILOVER_TEST_NAME_SETTING =
            "failover_test_name_setting";

    @SerializedName(SERIALIZED_NAME_FAILOVER_TEST_NAME_SETTING)
    private String failoverTestNameSetting;

    public static final String SERIALIZED_NAME_FAILOVER_TEST_NAME_SETTING_CONTAINS =
            "failover_test_name_setting_contains";

    @SerializedName(SERIALIZED_NAME_FAILOVER_TEST_NAME_SETTING_CONTAINS)
    private String failoverTestNameSettingContains;

    public static final String SERIALIZED_NAME_FAILOVER_TEST_NAME_SETTING_ENDS_WITH =
            "failover_test_name_setting_ends_with";

    @SerializedName(SERIALIZED_NAME_FAILOVER_TEST_NAME_SETTING_ENDS_WITH)
    private String failoverTestNameSettingEndsWith;

    public static final String SERIALIZED_NAME_FAILOVER_TEST_NAME_SETTING_GT =
            "failover_test_name_setting_gt";

    @SerializedName(SERIALIZED_NAME_FAILOVER_TEST_NAME_SETTING_GT)
    private String failoverTestNameSettingGt;

    public static final String SERIALIZED_NAME_FAILOVER_TEST_NAME_SETTING_GTE =
            "failover_test_name_setting_gte";

    @SerializedName(SERIALIZED_NAME_FAILOVER_TEST_NAME_SETTING_GTE)
    private String failoverTestNameSettingGte;

    public static final String SERIALIZED_NAME_FAILOVER_TEST_NAME_SETTING_IN =
            "failover_test_name_setting_in";

    @SerializedName(SERIALIZED_NAME_FAILOVER_TEST_NAME_SETTING_IN)
    private List<String> failoverTestNameSettingIn = null;

    public static final String SERIALIZED_NAME_FAILOVER_TEST_NAME_SETTING_LT =
            "failover_test_name_setting_lt";

    @SerializedName(SERIALIZED_NAME_FAILOVER_TEST_NAME_SETTING_LT)
    private String failoverTestNameSettingLt;

    public static final String SERIALIZED_NAME_FAILOVER_TEST_NAME_SETTING_LTE =
            "failover_test_name_setting_lte";

    @SerializedName(SERIALIZED_NAME_FAILOVER_TEST_NAME_SETTING_LTE)
    private String failoverTestNameSettingLte;

    public static final String SERIALIZED_NAME_FAILOVER_TEST_NAME_SETTING_NOT =
            "failover_test_name_setting_not";

    @SerializedName(SERIALIZED_NAME_FAILOVER_TEST_NAME_SETTING_NOT)
    private String failoverTestNameSettingNot;

    public static final String SERIALIZED_NAME_FAILOVER_TEST_NAME_SETTING_NOT_CONTAINS =
            "failover_test_name_setting_not_contains";

    @SerializedName(SERIALIZED_NAME_FAILOVER_TEST_NAME_SETTING_NOT_CONTAINS)
    private String failoverTestNameSettingNotContains;

    public static final String SERIALIZED_NAME_FAILOVER_TEST_NAME_SETTING_NOT_ENDS_WITH =
            "failover_test_name_setting_not_ends_with";

    @SerializedName(SERIALIZED_NAME_FAILOVER_TEST_NAME_SETTING_NOT_ENDS_WITH)
    private String failoverTestNameSettingNotEndsWith;

    public static final String SERIALIZED_NAME_FAILOVER_TEST_NAME_SETTING_NOT_IN =
            "failover_test_name_setting_not_in";

    @SerializedName(SERIALIZED_NAME_FAILOVER_TEST_NAME_SETTING_NOT_IN)
    private List<String> failoverTestNameSettingNotIn = null;

    public static final String SERIALIZED_NAME_FAILOVER_TEST_NAME_SETTING_NOT_STARTS_WITH =
            "failover_test_name_setting_not_starts_with";

    @SerializedName(SERIALIZED_NAME_FAILOVER_TEST_NAME_SETTING_NOT_STARTS_WITH)
    private String failoverTestNameSettingNotStartsWith;

    public static final String SERIALIZED_NAME_FAILOVER_TEST_NAME_SETTING_STARTS_WITH =
            "failover_test_name_setting_starts_with";

    @SerializedName(SERIALIZED_NAME_FAILOVER_TEST_NAME_SETTING_STARTS_WITH)
    private String failoverTestNameSettingStartsWith;

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

    public static final String SERIALIZED_NAME_INITIALIZATION_TIME_POINT =
            "initialization_time_point";

    @SerializedName(SERIALIZED_NAME_INITIALIZATION_TIME_POINT)
    private String initializationTimePoint;

    public static final String SERIALIZED_NAME_INITIALIZATION_TIME_POINT_CONTAINS =
            "initialization_time_point_contains";

    @SerializedName(SERIALIZED_NAME_INITIALIZATION_TIME_POINT_CONTAINS)
    private String initializationTimePointContains;

    public static final String SERIALIZED_NAME_INITIALIZATION_TIME_POINT_ENDS_WITH =
            "initialization_time_point_ends_with";

    @SerializedName(SERIALIZED_NAME_INITIALIZATION_TIME_POINT_ENDS_WITH)
    private String initializationTimePointEndsWith;

    public static final String SERIALIZED_NAME_INITIALIZATION_TIME_POINT_GT =
            "initialization_time_point_gt";

    @SerializedName(SERIALIZED_NAME_INITIALIZATION_TIME_POINT_GT)
    private String initializationTimePointGt;

    public static final String SERIALIZED_NAME_INITIALIZATION_TIME_POINT_GTE =
            "initialization_time_point_gte";

    @SerializedName(SERIALIZED_NAME_INITIALIZATION_TIME_POINT_GTE)
    private String initializationTimePointGte;

    public static final String SERIALIZED_NAME_INITIALIZATION_TIME_POINT_IN =
            "initialization_time_point_in";

    @SerializedName(SERIALIZED_NAME_INITIALIZATION_TIME_POINT_IN)
    private List<String> initializationTimePointIn = null;

    public static final String SERIALIZED_NAME_INITIALIZATION_TIME_POINT_LT =
            "initialization_time_point_lt";

    @SerializedName(SERIALIZED_NAME_INITIALIZATION_TIME_POINT_LT)
    private String initializationTimePointLt;

    public static final String SERIALIZED_NAME_INITIALIZATION_TIME_POINT_LTE =
            "initialization_time_point_lte";

    @SerializedName(SERIALIZED_NAME_INITIALIZATION_TIME_POINT_LTE)
    private String initializationTimePointLte;

    public static final String SERIALIZED_NAME_INITIALIZATION_TIME_POINT_NOT =
            "initialization_time_point_not";

    @SerializedName(SERIALIZED_NAME_INITIALIZATION_TIME_POINT_NOT)
    private String initializationTimePointNot;

    public static final String SERIALIZED_NAME_INITIALIZATION_TIME_POINT_NOT_CONTAINS =
            "initialization_time_point_not_contains";

    @SerializedName(SERIALIZED_NAME_INITIALIZATION_TIME_POINT_NOT_CONTAINS)
    private String initializationTimePointNotContains;

    public static final String SERIALIZED_NAME_INITIALIZATION_TIME_POINT_NOT_ENDS_WITH =
            "initialization_time_point_not_ends_with";

    @SerializedName(SERIALIZED_NAME_INITIALIZATION_TIME_POINT_NOT_ENDS_WITH)
    private String initializationTimePointNotEndsWith;

    public static final String SERIALIZED_NAME_INITIALIZATION_TIME_POINT_NOT_IN =
            "initialization_time_point_not_in";

    @SerializedName(SERIALIZED_NAME_INITIALIZATION_TIME_POINT_NOT_IN)
    private List<String> initializationTimePointNotIn = null;

    public static final String SERIALIZED_NAME_INITIALIZATION_TIME_POINT_NOT_STARTS_WITH =
            "initialization_time_point_not_starts_with";

    @SerializedName(SERIALIZED_NAME_INITIALIZATION_TIME_POINT_NOT_STARTS_WITH)
    private String initializationTimePointNotStartsWith;

    public static final String SERIALIZED_NAME_INITIALIZATION_TIME_POINT_STARTS_WITH =
            "initialization_time_point_starts_with";

    @SerializedName(SERIALIZED_NAME_INITIALIZATION_TIME_POINT_STARTS_WITH)
    private String initializationTimePointStartsWith;

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

    public static final String SERIALIZED_NAME_RESOURCE_VERSION = "resource_version";

    @SerializedName(SERIALIZED_NAME_RESOURCE_VERSION)
    private Integer resourceVersion;

    public static final String SERIALIZED_NAME_RESOURCE_VERSION_GT = "resource_version_gt";

    @SerializedName(SERIALIZED_NAME_RESOURCE_VERSION_GT)
    private Integer resourceVersionGt;

    public static final String SERIALIZED_NAME_RESOURCE_VERSION_GTE = "resource_version_gte";

    @SerializedName(SERIALIZED_NAME_RESOURCE_VERSION_GTE)
    private Integer resourceVersionGte;

    public static final String SERIALIZED_NAME_RESOURCE_VERSION_IN = "resource_version_in";

    @SerializedName(SERIALIZED_NAME_RESOURCE_VERSION_IN)
    private List<Integer> resourceVersionIn = null;

    public static final String SERIALIZED_NAME_RESOURCE_VERSION_LT = "resource_version_lt";

    @SerializedName(SERIALIZED_NAME_RESOURCE_VERSION_LT)
    private Integer resourceVersionLt;

    public static final String SERIALIZED_NAME_RESOURCE_VERSION_LTE = "resource_version_lte";

    @SerializedName(SERIALIZED_NAME_RESOURCE_VERSION_LTE)
    private Integer resourceVersionLte;

    public static final String SERIALIZED_NAME_RESOURCE_VERSION_NOT = "resource_version_not";

    @SerializedName(SERIALIZED_NAME_RESOURCE_VERSION_NOT)
    private Integer resourceVersionNot;

    public static final String SERIALIZED_NAME_RESOURCE_VERSION_NOT_IN = "resource_version_not_in";

    @SerializedName(SERIALIZED_NAME_RESOURCE_VERSION_NOT_IN)
    private List<Integer> resourceVersionNotIn = null;

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

    public static final String SERIALIZED_NAME_STORAGE_ENCRYPTED = "storage_encrypted";

    @SerializedName(SERIALIZED_NAME_STORAGE_ENCRYPTED)
    private Boolean storageEncrypted;

    public static final String SERIALIZED_NAME_STORAGE_ENCRYPTED_NOT = "storage_encrypted_not";

    @SerializedName(SERIALIZED_NAME_STORAGE_ENCRYPTED_NOT)
    private Boolean storageEncryptedNot;

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

    public SyncReplicationPlanWhereInput() {}

    public SyncReplicationPlanWhereInput AND(List<SyncReplicationPlanWhereInput> AND) {

        this.AND = AND;
        return this;
    }

    public SyncReplicationPlanWhereInput addANDItem(SyncReplicationPlanWhereInput ANDItem) {
        if (this.AND == null) {
            this.AND = new ArrayList<SyncReplicationPlanWhereInput>();
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
    public List<SyncReplicationPlanWhereInput> getAND() {
        return AND;
    }

    public void setAND(List<SyncReplicationPlanWhereInput> AND) {
        this.AND = AND;
    }

    public SyncReplicationPlanWhereInput AND_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_A_N_D);
        return this;
    }

    public SyncReplicationPlanWhereInput AND_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput NOT(List<SyncReplicationPlanWhereInput> NOT) {

        this.NOT = NOT;
        return this;
    }

    public SyncReplicationPlanWhereInput addNOTItem(SyncReplicationPlanWhereInput NOTItem) {
        if (this.NOT == null) {
            this.NOT = new ArrayList<SyncReplicationPlanWhereInput>();
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
    public List<SyncReplicationPlanWhereInput> getNOT() {
        return NOT;
    }

    public void setNOT(List<SyncReplicationPlanWhereInput> NOT) {
        this.NOT = NOT;
    }

    public SyncReplicationPlanWhereInput NOT_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_N_O_T);
        return this;
    }

    public SyncReplicationPlanWhereInput NOT_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput OR(List<SyncReplicationPlanWhereInput> OR) {

        this.OR = OR;
        return this;
    }

    public SyncReplicationPlanWhereInput addORItem(SyncReplicationPlanWhereInput ORItem) {
        if (this.OR == null) {
            this.OR = new ArrayList<SyncReplicationPlanWhereInput>();
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
    public List<SyncReplicationPlanWhereInput> getOR() {
        return OR;
    }

    public void setOR(List<SyncReplicationPlanWhereInput> OR) {
        this.OR = OR;
    }

    public SyncReplicationPlanWhereInput OR_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_O_R);
        return this;
    }

    public SyncReplicationPlanWhereInput OR_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput activationTimestamp(String activationTimestamp) {

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

    public SyncReplicationPlanWhereInput activationTimestamp_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ACTIVATION_TIMESTAMP);
        return this;
    }

    public SyncReplicationPlanWhereInput activationTimestamp_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput activationTimestampGt(String activationTimestampGt) {

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

    public SyncReplicationPlanWhereInput activationTimestampGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ACTIVATION_TIMESTAMP_GT);
        return this;
    }

    public SyncReplicationPlanWhereInput activationTimestampGt_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput activationTimestampGte(String activationTimestampGte) {

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

    public SyncReplicationPlanWhereInput activationTimestampGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ACTIVATION_TIMESTAMP_GTE);
        return this;
    }

    public SyncReplicationPlanWhereInput activationTimestampGte_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput activationTimestampIn(List<String> activationTimestampIn) {

        this.activationTimestampIn = activationTimestampIn;
        return this;
    }

    public SyncReplicationPlanWhereInput addActivationTimestampInItem(
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

    public SyncReplicationPlanWhereInput activationTimestampIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ACTIVATION_TIMESTAMP_IN);
        return this;
    }

    public SyncReplicationPlanWhereInput activationTimestampIn_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput activationTimestampLt(String activationTimestampLt) {

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

    public SyncReplicationPlanWhereInput activationTimestampLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ACTIVATION_TIMESTAMP_LT);
        return this;
    }

    public SyncReplicationPlanWhereInput activationTimestampLt_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput activationTimestampLte(String activationTimestampLte) {

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

    public SyncReplicationPlanWhereInput activationTimestampLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ACTIVATION_TIMESTAMP_LTE);
        return this;
    }

    public SyncReplicationPlanWhereInput activationTimestampLte_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput activationTimestampNot(String activationTimestampNot) {

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

    public SyncReplicationPlanWhereInput activationTimestampNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ACTIVATION_TIMESTAMP_NOT);
        return this;
    }

    public SyncReplicationPlanWhereInput activationTimestampNot_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput activationTimestampNotIn(
            List<String> activationTimestampNotIn) {

        this.activationTimestampNotIn = activationTimestampNotIn;
        return this;
    }

    public SyncReplicationPlanWhereInput addActivationTimestampNotInItem(
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

    public SyncReplicationPlanWhereInput activationTimestampNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ACTIVATION_TIMESTAMP_NOT_IN);
        return this;
    }

    public SyncReplicationPlanWhereInput activationTimestampNotIn_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput compression(Boolean compression) {

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

    public SyncReplicationPlanWhereInput compression_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_COMPRESSION);
        return this;
    }

    public SyncReplicationPlanWhereInput compression_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput compressionNot(Boolean compressionNot) {

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

    public SyncReplicationPlanWhereInput compressionNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_COMPRESSION_NOT);
        return this;
    }

    public SyncReplicationPlanWhereInput compressionNot_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput createdAt(String createdAt) {

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

    public SyncReplicationPlanWhereInput createdAt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT);
        return this;
    }

    public SyncReplicationPlanWhereInput createdAt_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput createdAtGt(String createdAtGt) {

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

    public SyncReplicationPlanWhereInput createdAtGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_GT);
        return this;
    }

    public SyncReplicationPlanWhereInput createdAtGt_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput createdAtGte(String createdAtGte) {

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

    public SyncReplicationPlanWhereInput createdAtGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_GTE);
        return this;
    }

    public SyncReplicationPlanWhereInput createdAtGte_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput createdAtIn(List<String> createdAtIn) {

        this.createdAtIn = createdAtIn;
        return this;
    }

    public SyncReplicationPlanWhereInput addCreatedAtInItem(String createdAtInItem) {
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

    public SyncReplicationPlanWhereInput createdAtIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_IN);
        return this;
    }

    public SyncReplicationPlanWhereInput createdAtIn_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput createdAtLt(String createdAtLt) {

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

    public SyncReplicationPlanWhereInput createdAtLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_LT);
        return this;
    }

    public SyncReplicationPlanWhereInput createdAtLt_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput createdAtLte(String createdAtLte) {

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

    public SyncReplicationPlanWhereInput createdAtLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_LTE);
        return this;
    }

    public SyncReplicationPlanWhereInput createdAtLte_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput createdAtNot(String createdAtNot) {

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

    public SyncReplicationPlanWhereInput createdAtNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_NOT);
        return this;
    }

    public SyncReplicationPlanWhereInput createdAtNot_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput createdAtNotIn(List<String> createdAtNotIn) {

        this.createdAtNotIn = createdAtNotIn;
        return this;
    }

    public SyncReplicationPlanWhereInput addCreatedAtNotInItem(String createdAtNotInItem) {
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

    public SyncReplicationPlanWhereInput createdAtNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_NOT_IN);
        return this;
    }

    public SyncReplicationPlanWhereInput createdAtNotIn_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput dataVersion(Integer dataVersion) {

        this.dataVersion = dataVersion;
        return this;
    }

    /**
     * Get dataVersion
     *
     * @return dataVersion
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getDataVersion() {
        return dataVersion;
    }

    public void setDataVersion(Integer dataVersion) {
        this.dataVersion = dataVersion;
    }

    public SyncReplicationPlanWhereInput dataVersion_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATA_VERSION);
        return this;
    }

    public SyncReplicationPlanWhereInput dataVersion_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATA_VERSION);
        return this;
    }

    public void setDataVersion_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATA_VERSION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATA_VERSION);
        }
    }

    public boolean getDataVersion_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATA_VERSION);
    }

    public SyncReplicationPlanWhereInput dataVersionGt(Integer dataVersionGt) {

        this.dataVersionGt = dataVersionGt;
        return this;
    }

    /**
     * Get dataVersionGt
     *
     * @return dataVersionGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getDataVersionGt() {
        return dataVersionGt;
    }

    public void setDataVersionGt(Integer dataVersionGt) {
        this.dataVersionGt = dataVersionGt;
    }

    public SyncReplicationPlanWhereInput dataVersionGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATA_VERSION_GT);
        return this;
    }

    public SyncReplicationPlanWhereInput dataVersionGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATA_VERSION_GT);
        return this;
    }

    public void setDataVersionGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATA_VERSION_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATA_VERSION_GT);
        }
    }

    public boolean getDataVersionGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATA_VERSION_GT);
    }

    public SyncReplicationPlanWhereInput dataVersionGte(Integer dataVersionGte) {

        this.dataVersionGte = dataVersionGte;
        return this;
    }

    /**
     * Get dataVersionGte
     *
     * @return dataVersionGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getDataVersionGte() {
        return dataVersionGte;
    }

    public void setDataVersionGte(Integer dataVersionGte) {
        this.dataVersionGte = dataVersionGte;
    }

    public SyncReplicationPlanWhereInput dataVersionGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATA_VERSION_GTE);
        return this;
    }

    public SyncReplicationPlanWhereInput dataVersionGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATA_VERSION_GTE);
        return this;
    }

    public void setDataVersionGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATA_VERSION_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATA_VERSION_GTE);
        }
    }

    public boolean getDataVersionGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATA_VERSION_GTE);
    }

    public SyncReplicationPlanWhereInput dataVersionIn(List<Integer> dataVersionIn) {

        this.dataVersionIn = dataVersionIn;
        return this;
    }

    public SyncReplicationPlanWhereInput addDataVersionInItem(Integer dataVersionInItem) {
        if (this.dataVersionIn == null) {
            this.dataVersionIn = new ArrayList<Integer>();
        }
        this.dataVersionIn.add(dataVersionInItem);
        return this;
    }

    /**
     * Get dataVersionIn
     *
     * @return dataVersionIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getDataVersionIn() {
        return dataVersionIn;
    }

    public void setDataVersionIn(List<Integer> dataVersionIn) {
        this.dataVersionIn = dataVersionIn;
    }

    public SyncReplicationPlanWhereInput dataVersionIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATA_VERSION_IN);
        return this;
    }

    public SyncReplicationPlanWhereInput dataVersionIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATA_VERSION_IN);
        return this;
    }

    public void setDataVersionIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATA_VERSION_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATA_VERSION_IN);
        }
    }

    public boolean getDataVersionIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATA_VERSION_IN);
    }

    public SyncReplicationPlanWhereInput dataVersionLt(Integer dataVersionLt) {

        this.dataVersionLt = dataVersionLt;
        return this;
    }

    /**
     * Get dataVersionLt
     *
     * @return dataVersionLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getDataVersionLt() {
        return dataVersionLt;
    }

    public void setDataVersionLt(Integer dataVersionLt) {
        this.dataVersionLt = dataVersionLt;
    }

    public SyncReplicationPlanWhereInput dataVersionLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATA_VERSION_LT);
        return this;
    }

    public SyncReplicationPlanWhereInput dataVersionLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATA_VERSION_LT);
        return this;
    }

    public void setDataVersionLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATA_VERSION_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATA_VERSION_LT);
        }
    }

    public boolean getDataVersionLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATA_VERSION_LT);
    }

    public SyncReplicationPlanWhereInput dataVersionLte(Integer dataVersionLte) {

        this.dataVersionLte = dataVersionLte;
        return this;
    }

    /**
     * Get dataVersionLte
     *
     * @return dataVersionLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getDataVersionLte() {
        return dataVersionLte;
    }

    public void setDataVersionLte(Integer dataVersionLte) {
        this.dataVersionLte = dataVersionLte;
    }

    public SyncReplicationPlanWhereInput dataVersionLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATA_VERSION_LTE);
        return this;
    }

    public SyncReplicationPlanWhereInput dataVersionLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATA_VERSION_LTE);
        return this;
    }

    public void setDataVersionLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATA_VERSION_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATA_VERSION_LTE);
        }
    }

    public boolean getDataVersionLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATA_VERSION_LTE);
    }

    public SyncReplicationPlanWhereInput dataVersionNot(Integer dataVersionNot) {

        this.dataVersionNot = dataVersionNot;
        return this;
    }

    /**
     * Get dataVersionNot
     *
     * @return dataVersionNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getDataVersionNot() {
        return dataVersionNot;
    }

    public void setDataVersionNot(Integer dataVersionNot) {
        this.dataVersionNot = dataVersionNot;
    }

    public SyncReplicationPlanWhereInput dataVersionNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATA_VERSION_NOT);
        return this;
    }

    public SyncReplicationPlanWhereInput dataVersionNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATA_VERSION_NOT);
        return this;
    }

    public void setDataVersionNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATA_VERSION_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATA_VERSION_NOT);
        }
    }

    public boolean getDataVersionNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATA_VERSION_NOT);
    }

    public SyncReplicationPlanWhereInput dataVersionNotIn(List<Integer> dataVersionNotIn) {

        this.dataVersionNotIn = dataVersionNotIn;
        return this;
    }

    public SyncReplicationPlanWhereInput addDataVersionNotInItem(Integer dataVersionNotInItem) {
        if (this.dataVersionNotIn == null) {
            this.dataVersionNotIn = new ArrayList<Integer>();
        }
        this.dataVersionNotIn.add(dataVersionNotInItem);
        return this;
    }

    /**
     * Get dataVersionNotIn
     *
     * @return dataVersionNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getDataVersionNotIn() {
        return dataVersionNotIn;
    }

    public void setDataVersionNotIn(List<Integer> dataVersionNotIn) {
        this.dataVersionNotIn = dataVersionNotIn;
    }

    public SyncReplicationPlanWhereInput dataVersionNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATA_VERSION_NOT_IN);
        return this;
    }

    public SyncReplicationPlanWhereInput dataVersionNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATA_VERSION_NOT_IN);
        return this;
    }

    public void setDataVersionNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATA_VERSION_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATA_VERSION_NOT_IN);
        }
    }

    public boolean getDataVersionNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATA_VERSION_NOT_IN);
    }

    public SyncReplicationPlanWhereInput deleteStrategy(BackupPlanDeleteStrategy deleteStrategy) {

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

    public SyncReplicationPlanWhereInput deleteStrategy_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DELETE_STRATEGY);
        return this;
    }

    public SyncReplicationPlanWhereInput deleteStrategy_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput deleteStrategyIn(
            List<BackupPlanDeleteStrategy> deleteStrategyIn) {

        this.deleteStrategyIn = deleteStrategyIn;
        return this;
    }

    public SyncReplicationPlanWhereInput addDeleteStrategyInItem(
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

    public SyncReplicationPlanWhereInput deleteStrategyIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DELETE_STRATEGY_IN);
        return this;
    }

    public SyncReplicationPlanWhereInput deleteStrategyIn_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput deleteStrategyNot(
            BackupPlanDeleteStrategy deleteStrategyNot) {

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

    public SyncReplicationPlanWhereInput deleteStrategyNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DELETE_STRATEGY_NOT);
        return this;
    }

    public SyncReplicationPlanWhereInput deleteStrategyNot_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput deleteStrategyNotIn(
            List<BackupPlanDeleteStrategy> deleteStrategyNotIn) {

        this.deleteStrategyNotIn = deleteStrategyNotIn;
        return this;
    }

    public SyncReplicationPlanWhereInput addDeleteStrategyNotInItem(
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

    public SyncReplicationPlanWhereInput deleteStrategyNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DELETE_STRATEGY_NOT_IN);
        return this;
    }

    public SyncReplicationPlanWhereInput deleteStrategyNotIn_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput description(String description) {

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

    public SyncReplicationPlanWhereInput description_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION);
        return this;
    }

    public SyncReplicationPlanWhereInput description_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput descriptionContains(String descriptionContains) {

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

    public SyncReplicationPlanWhereInput descriptionContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_CONTAINS);
        return this;
    }

    public SyncReplicationPlanWhereInput descriptionContains_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput descriptionEndsWith(String descriptionEndsWith) {

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

    public SyncReplicationPlanWhereInput descriptionEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_ENDS_WITH);
        return this;
    }

    public SyncReplicationPlanWhereInput descriptionEndsWith_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput descriptionGt(String descriptionGt) {

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

    public SyncReplicationPlanWhereInput descriptionGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_GT);
        return this;
    }

    public SyncReplicationPlanWhereInput descriptionGt_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput descriptionGte(String descriptionGte) {

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

    public SyncReplicationPlanWhereInput descriptionGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_GTE);
        return this;
    }

    public SyncReplicationPlanWhereInput descriptionGte_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput descriptionIn(List<String> descriptionIn) {

        this.descriptionIn = descriptionIn;
        return this;
    }

    public SyncReplicationPlanWhereInput addDescriptionInItem(String descriptionInItem) {
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

    public SyncReplicationPlanWhereInput descriptionIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_IN);
        return this;
    }

    public SyncReplicationPlanWhereInput descriptionIn_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput descriptionLt(String descriptionLt) {

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

    public SyncReplicationPlanWhereInput descriptionLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_LT);
        return this;
    }

    public SyncReplicationPlanWhereInput descriptionLt_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput descriptionLte(String descriptionLte) {

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

    public SyncReplicationPlanWhereInput descriptionLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_LTE);
        return this;
    }

    public SyncReplicationPlanWhereInput descriptionLte_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput descriptionNot(String descriptionNot) {

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

    public SyncReplicationPlanWhereInput descriptionNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT);
        return this;
    }

    public SyncReplicationPlanWhereInput descriptionNot_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput descriptionNotContains(String descriptionNotContains) {

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

    public SyncReplicationPlanWhereInput descriptionNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_CONTAINS);
        return this;
    }

    public SyncReplicationPlanWhereInput descriptionNotContains_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput descriptionNotEndsWith(String descriptionNotEndsWith) {

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

    public SyncReplicationPlanWhereInput descriptionNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_ENDS_WITH);
        return this;
    }

    public SyncReplicationPlanWhereInput descriptionNotEndsWith_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput descriptionNotIn(List<String> descriptionNotIn) {

        this.descriptionNotIn = descriptionNotIn;
        return this;
    }

    public SyncReplicationPlanWhereInput addDescriptionNotInItem(String descriptionNotInItem) {
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

    public SyncReplicationPlanWhereInput descriptionNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_IN);
        return this;
    }

    public SyncReplicationPlanWhereInput descriptionNotIn_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput descriptionNotStartsWith(String descriptionNotStartsWith) {

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

    public SyncReplicationPlanWhereInput descriptionNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_STARTS_WITH);
        return this;
    }

    public SyncReplicationPlanWhereInput descriptionNotStartsWith_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput descriptionStartsWith(String descriptionStartsWith) {

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

    public SyncReplicationPlanWhereInput descriptionStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_STARTS_WITH);
        return this;
    }

    public SyncReplicationPlanWhereInput descriptionStartsWith_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput ecK(Integer ecK) {

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

    public SyncReplicationPlanWhereInput ecK_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EC_K);
        return this;
    }

    public SyncReplicationPlanWhereInput ecK_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput ecKGt(Integer ecKGt) {

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

    public SyncReplicationPlanWhereInput ecKGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EC_K_GT);
        return this;
    }

    public SyncReplicationPlanWhereInput ecKGt_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput ecKGte(Integer ecKGte) {

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

    public SyncReplicationPlanWhereInput ecKGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EC_K_GTE);
        return this;
    }

    public SyncReplicationPlanWhereInput ecKGte_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput ecKIn(List<Integer> ecKIn) {

        this.ecKIn = ecKIn;
        return this;
    }

    public SyncReplicationPlanWhereInput addEcKInItem(Integer ecKInItem) {
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

    public SyncReplicationPlanWhereInput ecKIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EC_K_IN);
        return this;
    }

    public SyncReplicationPlanWhereInput ecKIn_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput ecKLt(Integer ecKLt) {

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

    public SyncReplicationPlanWhereInput ecKLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EC_K_LT);
        return this;
    }

    public SyncReplicationPlanWhereInput ecKLt_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput ecKLte(Integer ecKLte) {

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

    public SyncReplicationPlanWhereInput ecKLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EC_K_LTE);
        return this;
    }

    public SyncReplicationPlanWhereInput ecKLte_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput ecKNot(Integer ecKNot) {

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

    public SyncReplicationPlanWhereInput ecKNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EC_K_NOT);
        return this;
    }

    public SyncReplicationPlanWhereInput ecKNot_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput ecKNotIn(List<Integer> ecKNotIn) {

        this.ecKNotIn = ecKNotIn;
        return this;
    }

    public SyncReplicationPlanWhereInput addEcKNotInItem(Integer ecKNotInItem) {
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

    public SyncReplicationPlanWhereInput ecKNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EC_K_NOT_IN);
        return this;
    }

    public SyncReplicationPlanWhereInput ecKNotIn_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput ecM(Integer ecM) {

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

    public SyncReplicationPlanWhereInput ecM_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EC_M);
        return this;
    }

    public SyncReplicationPlanWhereInput ecM_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput ecMGt(Integer ecMGt) {

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

    public SyncReplicationPlanWhereInput ecMGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EC_M_GT);
        return this;
    }

    public SyncReplicationPlanWhereInput ecMGt_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput ecMGte(Integer ecMGte) {

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

    public SyncReplicationPlanWhereInput ecMGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EC_M_GTE);
        return this;
    }

    public SyncReplicationPlanWhereInput ecMGte_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput ecMIn(List<Integer> ecMIn) {

        this.ecMIn = ecMIn;
        return this;
    }

    public SyncReplicationPlanWhereInput addEcMInItem(Integer ecMInItem) {
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

    public SyncReplicationPlanWhereInput ecMIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EC_M_IN);
        return this;
    }

    public SyncReplicationPlanWhereInput ecMIn_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput ecMLt(Integer ecMLt) {

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

    public SyncReplicationPlanWhereInput ecMLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EC_M_LT);
        return this;
    }

    public SyncReplicationPlanWhereInput ecMLt_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput ecMLte(Integer ecMLte) {

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

    public SyncReplicationPlanWhereInput ecMLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EC_M_LTE);
        return this;
    }

    public SyncReplicationPlanWhereInput ecMLte_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput ecMNot(Integer ecMNot) {

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

    public SyncReplicationPlanWhereInput ecMNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EC_M_NOT);
        return this;
    }

    public SyncReplicationPlanWhereInput ecMNot_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput ecMNotIn(List<Integer> ecMNotIn) {

        this.ecMNotIn = ecMNotIn;
        return this;
    }

    public SyncReplicationPlanWhereInput addEcMNotInItem(Integer ecMNotInItem) {
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

    public SyncReplicationPlanWhereInput ecMNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EC_M_NOT_IN);
        return this;
    }

    public SyncReplicationPlanWhereInput ecMNotIn_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {

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

    public SyncReplicationPlanWhereInput entityAsyncStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        return this;
    }

    public SyncReplicationPlanWhereInput entityAsyncStatus_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput entityAsyncStatusIn(
            List<EntityAsyncStatus> entityAsyncStatusIn) {

        this.entityAsyncStatusIn = entityAsyncStatusIn;
        return this;
    }

    public SyncReplicationPlanWhereInput addEntityAsyncStatusInItem(
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

    public SyncReplicationPlanWhereInput entityAsyncStatusIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_IN);
        return this;
    }

    public SyncReplicationPlanWhereInput entityAsyncStatusIn_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput entityAsyncStatusNot(
            EntityAsyncStatus entityAsyncStatusNot) {

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

    public SyncReplicationPlanWhereInput entityAsyncStatusNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT);
        return this;
    }

    public SyncReplicationPlanWhereInput entityAsyncStatusNot_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput entityAsyncStatusNotIn(
            List<EntityAsyncStatus> entityAsyncStatusNotIn) {

        this.entityAsyncStatusNotIn = entityAsyncStatusNotIn;
        return this;
    }

    public SyncReplicationPlanWhereInput addEntityAsyncStatusNotInItem(
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

    public SyncReplicationPlanWhereInput entityAsyncStatusNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT_IN);
        return this;
    }

    public SyncReplicationPlanWhereInput entityAsyncStatusNotIn_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput failoverTestKeepMacAddress(
            Boolean failoverTestKeepMacAddress) {

        this.failoverTestKeepMacAddress = failoverTestKeepMacAddress;
        return this;
    }

    /**
     * Get failoverTestKeepMacAddress
     *
     * @return failoverTestKeepMacAddress
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getFailoverTestKeepMacAddress() {
        return failoverTestKeepMacAddress;
    }

    public void setFailoverTestKeepMacAddress(Boolean failoverTestKeepMacAddress) {
        this.failoverTestKeepMacAddress = failoverTestKeepMacAddress;
    }

    public SyncReplicationPlanWhereInput failoverTestKeepMacAddress_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FAILOVER_TEST_KEEP_MAC_ADDRESS);
        return this;
    }

    public SyncReplicationPlanWhereInput failoverTestKeepMacAddress_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FAILOVER_TEST_KEEP_MAC_ADDRESS);
        return this;
    }

    public void setFailoverTestKeepMacAddress_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FAILOVER_TEST_KEEP_MAC_ADDRESS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FAILOVER_TEST_KEEP_MAC_ADDRESS);
        }
    }

    public boolean getFailoverTestKeepMacAddress_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FAILOVER_TEST_KEEP_MAC_ADDRESS);
    }

    public SyncReplicationPlanWhereInput failoverTestKeepMacAddressNot(
            Boolean failoverTestKeepMacAddressNot) {

        this.failoverTestKeepMacAddressNot = failoverTestKeepMacAddressNot;
        return this;
    }

    /**
     * Get failoverTestKeepMacAddressNot
     *
     * @return failoverTestKeepMacAddressNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getFailoverTestKeepMacAddressNot() {
        return failoverTestKeepMacAddressNot;
    }

    public void setFailoverTestKeepMacAddressNot(Boolean failoverTestKeepMacAddressNot) {
        this.failoverTestKeepMacAddressNot = failoverTestKeepMacAddressNot;
    }

    public SyncReplicationPlanWhereInput failoverTestKeepMacAddressNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FAILOVER_TEST_KEEP_MAC_ADDRESS_NOT);
        return this;
    }

    public SyncReplicationPlanWhereInput failoverTestKeepMacAddressNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FAILOVER_TEST_KEEP_MAC_ADDRESS_NOT);
        return this;
    }

    public void setFailoverTestKeepMacAddressNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FAILOVER_TEST_KEEP_MAC_ADDRESS_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FAILOVER_TEST_KEEP_MAC_ADDRESS_NOT);
        }
    }

    public boolean getFailoverTestKeepMacAddressNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FAILOVER_TEST_KEEP_MAC_ADDRESS_NOT);
    }

    public SyncReplicationPlanWhereInput failoverTestNameRule(
            ReplicaNameRule failoverTestNameRule) {

        this.failoverTestNameRule = failoverTestNameRule;
        return this;
    }

    /**
     * Get failoverTestNameRule
     *
     * @return failoverTestNameRule
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ReplicaNameRule getFailoverTestNameRule() {
        return failoverTestNameRule;
    }

    public void setFailoverTestNameRule(ReplicaNameRule failoverTestNameRule) {
        this.failoverTestNameRule = failoverTestNameRule;
    }

    public SyncReplicationPlanWhereInput failoverTestNameRule_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FAILOVER_TEST_NAME_RULE);
        return this;
    }

    public SyncReplicationPlanWhereInput failoverTestNameRule_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FAILOVER_TEST_NAME_RULE);
        return this;
    }

    public void setFailoverTestNameRule_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FAILOVER_TEST_NAME_RULE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FAILOVER_TEST_NAME_RULE);
        }
    }

    public boolean getFailoverTestNameRule_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FAILOVER_TEST_NAME_RULE);
    }

    public SyncReplicationPlanWhereInput failoverTestNameRuleIn(
            List<ReplicaNameRule> failoverTestNameRuleIn) {

        this.failoverTestNameRuleIn = failoverTestNameRuleIn;
        return this;
    }

    public SyncReplicationPlanWhereInput addFailoverTestNameRuleInItem(
            ReplicaNameRule failoverTestNameRuleInItem) {
        if (this.failoverTestNameRuleIn == null) {
            this.failoverTestNameRuleIn = new ArrayList<ReplicaNameRule>();
        }
        this.failoverTestNameRuleIn.add(failoverTestNameRuleInItem);
        return this;
    }

    /**
     * Get failoverTestNameRuleIn
     *
     * @return failoverTestNameRuleIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<ReplicaNameRule> getFailoverTestNameRuleIn() {
        return failoverTestNameRuleIn;
    }

    public void setFailoverTestNameRuleIn(List<ReplicaNameRule> failoverTestNameRuleIn) {
        this.failoverTestNameRuleIn = failoverTestNameRuleIn;
    }

    public SyncReplicationPlanWhereInput failoverTestNameRuleIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FAILOVER_TEST_NAME_RULE_IN);
        return this;
    }

    public SyncReplicationPlanWhereInput failoverTestNameRuleIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FAILOVER_TEST_NAME_RULE_IN);
        return this;
    }

    public void setFailoverTestNameRuleIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FAILOVER_TEST_NAME_RULE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FAILOVER_TEST_NAME_RULE_IN);
        }
    }

    public boolean getFailoverTestNameRuleIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FAILOVER_TEST_NAME_RULE_IN);
    }

    public SyncReplicationPlanWhereInput failoverTestNameRuleNot(
            ReplicaNameRule failoverTestNameRuleNot) {

        this.failoverTestNameRuleNot = failoverTestNameRuleNot;
        return this;
    }

    /**
     * Get failoverTestNameRuleNot
     *
     * @return failoverTestNameRuleNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ReplicaNameRule getFailoverTestNameRuleNot() {
        return failoverTestNameRuleNot;
    }

    public void setFailoverTestNameRuleNot(ReplicaNameRule failoverTestNameRuleNot) {
        this.failoverTestNameRuleNot = failoverTestNameRuleNot;
    }

    public SyncReplicationPlanWhereInput failoverTestNameRuleNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FAILOVER_TEST_NAME_RULE_NOT);
        return this;
    }

    public SyncReplicationPlanWhereInput failoverTestNameRuleNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FAILOVER_TEST_NAME_RULE_NOT);
        return this;
    }

    public void setFailoverTestNameRuleNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FAILOVER_TEST_NAME_RULE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FAILOVER_TEST_NAME_RULE_NOT);
        }
    }

    public boolean getFailoverTestNameRuleNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FAILOVER_TEST_NAME_RULE_NOT);
    }

    public SyncReplicationPlanWhereInput failoverTestNameRuleNotIn(
            List<ReplicaNameRule> failoverTestNameRuleNotIn) {

        this.failoverTestNameRuleNotIn = failoverTestNameRuleNotIn;
        return this;
    }

    public SyncReplicationPlanWhereInput addFailoverTestNameRuleNotInItem(
            ReplicaNameRule failoverTestNameRuleNotInItem) {
        if (this.failoverTestNameRuleNotIn == null) {
            this.failoverTestNameRuleNotIn = new ArrayList<ReplicaNameRule>();
        }
        this.failoverTestNameRuleNotIn.add(failoverTestNameRuleNotInItem);
        return this;
    }

    /**
     * Get failoverTestNameRuleNotIn
     *
     * @return failoverTestNameRuleNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<ReplicaNameRule> getFailoverTestNameRuleNotIn() {
        return failoverTestNameRuleNotIn;
    }

    public void setFailoverTestNameRuleNotIn(List<ReplicaNameRule> failoverTestNameRuleNotIn) {
        this.failoverTestNameRuleNotIn = failoverTestNameRuleNotIn;
    }

    public SyncReplicationPlanWhereInput failoverTestNameRuleNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FAILOVER_TEST_NAME_RULE_NOT_IN);
        return this;
    }

    public SyncReplicationPlanWhereInput failoverTestNameRuleNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FAILOVER_TEST_NAME_RULE_NOT_IN);
        return this;
    }

    public void setFailoverTestNameRuleNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FAILOVER_TEST_NAME_RULE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FAILOVER_TEST_NAME_RULE_NOT_IN);
        }
    }

    public boolean getFailoverTestNameRuleNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FAILOVER_TEST_NAME_RULE_NOT_IN);
    }

    public SyncReplicationPlanWhereInput failoverTestNameSetting(String failoverTestNameSetting) {

        this.failoverTestNameSetting = failoverTestNameSetting;
        return this;
    }

    /**
     * Get failoverTestNameSetting
     *
     * @return failoverTestNameSetting
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getFailoverTestNameSetting() {
        return failoverTestNameSetting;
    }

    public void setFailoverTestNameSetting(String failoverTestNameSetting) {
        this.failoverTestNameSetting = failoverTestNameSetting;
    }

    public SyncReplicationPlanWhereInput failoverTestNameSetting_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FAILOVER_TEST_NAME_SETTING);
        return this;
    }

    public SyncReplicationPlanWhereInput failoverTestNameSetting_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FAILOVER_TEST_NAME_SETTING);
        return this;
    }

    public void setFailoverTestNameSetting_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FAILOVER_TEST_NAME_SETTING);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FAILOVER_TEST_NAME_SETTING);
        }
    }

    public boolean getFailoverTestNameSetting_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FAILOVER_TEST_NAME_SETTING);
    }

    public SyncReplicationPlanWhereInput failoverTestNameSettingContains(
            String failoverTestNameSettingContains) {

        this.failoverTestNameSettingContains = failoverTestNameSettingContains;
        return this;
    }

    /**
     * Get failoverTestNameSettingContains
     *
     * @return failoverTestNameSettingContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getFailoverTestNameSettingContains() {
        return failoverTestNameSettingContains;
    }

    public void setFailoverTestNameSettingContains(String failoverTestNameSettingContains) {
        this.failoverTestNameSettingContains = failoverTestNameSettingContains;
    }

    public SyncReplicationPlanWhereInput failoverTestNameSettingContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FAILOVER_TEST_NAME_SETTING_CONTAINS);
        return this;
    }

    public SyncReplicationPlanWhereInput failoverTestNameSettingContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FAILOVER_TEST_NAME_SETTING_CONTAINS);
        return this;
    }

    public void setFailoverTestNameSettingContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FAILOVER_TEST_NAME_SETTING_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FAILOVER_TEST_NAME_SETTING_CONTAINS);
        }
    }

    public boolean getFailoverTestNameSettingContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FAILOVER_TEST_NAME_SETTING_CONTAINS);
    }

    public SyncReplicationPlanWhereInput failoverTestNameSettingEndsWith(
            String failoverTestNameSettingEndsWith) {

        this.failoverTestNameSettingEndsWith = failoverTestNameSettingEndsWith;
        return this;
    }

    /**
     * Get failoverTestNameSettingEndsWith
     *
     * @return failoverTestNameSettingEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getFailoverTestNameSettingEndsWith() {
        return failoverTestNameSettingEndsWith;
    }

    public void setFailoverTestNameSettingEndsWith(String failoverTestNameSettingEndsWith) {
        this.failoverTestNameSettingEndsWith = failoverTestNameSettingEndsWith;
    }

    public SyncReplicationPlanWhereInput failoverTestNameSettingEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FAILOVER_TEST_NAME_SETTING_ENDS_WITH);
        return this;
    }

    public SyncReplicationPlanWhereInput failoverTestNameSettingEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FAILOVER_TEST_NAME_SETTING_ENDS_WITH);
        return this;
    }

    public void setFailoverTestNameSettingEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FAILOVER_TEST_NAME_SETTING_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FAILOVER_TEST_NAME_SETTING_ENDS_WITH);
        }
    }

    public boolean getFailoverTestNameSettingEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FAILOVER_TEST_NAME_SETTING_ENDS_WITH);
    }

    public SyncReplicationPlanWhereInput failoverTestNameSettingGt(
            String failoverTestNameSettingGt) {

        this.failoverTestNameSettingGt = failoverTestNameSettingGt;
        return this;
    }

    /**
     * Get failoverTestNameSettingGt
     *
     * @return failoverTestNameSettingGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getFailoverTestNameSettingGt() {
        return failoverTestNameSettingGt;
    }

    public void setFailoverTestNameSettingGt(String failoverTestNameSettingGt) {
        this.failoverTestNameSettingGt = failoverTestNameSettingGt;
    }

    public SyncReplicationPlanWhereInput failoverTestNameSettingGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FAILOVER_TEST_NAME_SETTING_GT);
        return this;
    }

    public SyncReplicationPlanWhereInput failoverTestNameSettingGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FAILOVER_TEST_NAME_SETTING_GT);
        return this;
    }

    public void setFailoverTestNameSettingGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FAILOVER_TEST_NAME_SETTING_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FAILOVER_TEST_NAME_SETTING_GT);
        }
    }

    public boolean getFailoverTestNameSettingGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FAILOVER_TEST_NAME_SETTING_GT);
    }

    public SyncReplicationPlanWhereInput failoverTestNameSettingGte(
            String failoverTestNameSettingGte) {

        this.failoverTestNameSettingGte = failoverTestNameSettingGte;
        return this;
    }

    /**
     * Get failoverTestNameSettingGte
     *
     * @return failoverTestNameSettingGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getFailoverTestNameSettingGte() {
        return failoverTestNameSettingGte;
    }

    public void setFailoverTestNameSettingGte(String failoverTestNameSettingGte) {
        this.failoverTestNameSettingGte = failoverTestNameSettingGte;
    }

    public SyncReplicationPlanWhereInput failoverTestNameSettingGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FAILOVER_TEST_NAME_SETTING_GTE);
        return this;
    }

    public SyncReplicationPlanWhereInput failoverTestNameSettingGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FAILOVER_TEST_NAME_SETTING_GTE);
        return this;
    }

    public void setFailoverTestNameSettingGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FAILOVER_TEST_NAME_SETTING_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FAILOVER_TEST_NAME_SETTING_GTE);
        }
    }

    public boolean getFailoverTestNameSettingGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FAILOVER_TEST_NAME_SETTING_GTE);
    }

    public SyncReplicationPlanWhereInput failoverTestNameSettingIn(
            List<String> failoverTestNameSettingIn) {

        this.failoverTestNameSettingIn = failoverTestNameSettingIn;
        return this;
    }

    public SyncReplicationPlanWhereInput addFailoverTestNameSettingInItem(
            String failoverTestNameSettingInItem) {
        if (this.failoverTestNameSettingIn == null) {
            this.failoverTestNameSettingIn = new ArrayList<String>();
        }
        this.failoverTestNameSettingIn.add(failoverTestNameSettingInItem);
        return this;
    }

    /**
     * Get failoverTestNameSettingIn
     *
     * @return failoverTestNameSettingIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getFailoverTestNameSettingIn() {
        return failoverTestNameSettingIn;
    }

    public void setFailoverTestNameSettingIn(List<String> failoverTestNameSettingIn) {
        this.failoverTestNameSettingIn = failoverTestNameSettingIn;
    }

    public SyncReplicationPlanWhereInput failoverTestNameSettingIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FAILOVER_TEST_NAME_SETTING_IN);
        return this;
    }

    public SyncReplicationPlanWhereInput failoverTestNameSettingIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FAILOVER_TEST_NAME_SETTING_IN);
        return this;
    }

    public void setFailoverTestNameSettingIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FAILOVER_TEST_NAME_SETTING_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FAILOVER_TEST_NAME_SETTING_IN);
        }
    }

    public boolean getFailoverTestNameSettingIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FAILOVER_TEST_NAME_SETTING_IN);
    }

    public SyncReplicationPlanWhereInput failoverTestNameSettingLt(
            String failoverTestNameSettingLt) {

        this.failoverTestNameSettingLt = failoverTestNameSettingLt;
        return this;
    }

    /**
     * Get failoverTestNameSettingLt
     *
     * @return failoverTestNameSettingLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getFailoverTestNameSettingLt() {
        return failoverTestNameSettingLt;
    }

    public void setFailoverTestNameSettingLt(String failoverTestNameSettingLt) {
        this.failoverTestNameSettingLt = failoverTestNameSettingLt;
    }

    public SyncReplicationPlanWhereInput failoverTestNameSettingLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FAILOVER_TEST_NAME_SETTING_LT);
        return this;
    }

    public SyncReplicationPlanWhereInput failoverTestNameSettingLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FAILOVER_TEST_NAME_SETTING_LT);
        return this;
    }

    public void setFailoverTestNameSettingLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FAILOVER_TEST_NAME_SETTING_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FAILOVER_TEST_NAME_SETTING_LT);
        }
    }

    public boolean getFailoverTestNameSettingLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FAILOVER_TEST_NAME_SETTING_LT);
    }

    public SyncReplicationPlanWhereInput failoverTestNameSettingLte(
            String failoverTestNameSettingLte) {

        this.failoverTestNameSettingLte = failoverTestNameSettingLte;
        return this;
    }

    /**
     * Get failoverTestNameSettingLte
     *
     * @return failoverTestNameSettingLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getFailoverTestNameSettingLte() {
        return failoverTestNameSettingLte;
    }

    public void setFailoverTestNameSettingLte(String failoverTestNameSettingLte) {
        this.failoverTestNameSettingLte = failoverTestNameSettingLte;
    }

    public SyncReplicationPlanWhereInput failoverTestNameSettingLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FAILOVER_TEST_NAME_SETTING_LTE);
        return this;
    }

    public SyncReplicationPlanWhereInput failoverTestNameSettingLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FAILOVER_TEST_NAME_SETTING_LTE);
        return this;
    }

    public void setFailoverTestNameSettingLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FAILOVER_TEST_NAME_SETTING_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FAILOVER_TEST_NAME_SETTING_LTE);
        }
    }

    public boolean getFailoverTestNameSettingLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FAILOVER_TEST_NAME_SETTING_LTE);
    }

    public SyncReplicationPlanWhereInput failoverTestNameSettingNot(
            String failoverTestNameSettingNot) {

        this.failoverTestNameSettingNot = failoverTestNameSettingNot;
        return this;
    }

    /**
     * Get failoverTestNameSettingNot
     *
     * @return failoverTestNameSettingNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getFailoverTestNameSettingNot() {
        return failoverTestNameSettingNot;
    }

    public void setFailoverTestNameSettingNot(String failoverTestNameSettingNot) {
        this.failoverTestNameSettingNot = failoverTestNameSettingNot;
    }

    public SyncReplicationPlanWhereInput failoverTestNameSettingNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FAILOVER_TEST_NAME_SETTING_NOT);
        return this;
    }

    public SyncReplicationPlanWhereInput failoverTestNameSettingNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FAILOVER_TEST_NAME_SETTING_NOT);
        return this;
    }

    public void setFailoverTestNameSettingNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FAILOVER_TEST_NAME_SETTING_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FAILOVER_TEST_NAME_SETTING_NOT);
        }
    }

    public boolean getFailoverTestNameSettingNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FAILOVER_TEST_NAME_SETTING_NOT);
    }

    public SyncReplicationPlanWhereInput failoverTestNameSettingNotContains(
            String failoverTestNameSettingNotContains) {

        this.failoverTestNameSettingNotContains = failoverTestNameSettingNotContains;
        return this;
    }

    /**
     * Get failoverTestNameSettingNotContains
     *
     * @return failoverTestNameSettingNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getFailoverTestNameSettingNotContains() {
        return failoverTestNameSettingNotContains;
    }

    public void setFailoverTestNameSettingNotContains(String failoverTestNameSettingNotContains) {
        this.failoverTestNameSettingNotContains = failoverTestNameSettingNotContains;
    }

    public SyncReplicationPlanWhereInput failoverTestNameSettingNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FAILOVER_TEST_NAME_SETTING_NOT_CONTAINS);
        return this;
    }

    public SyncReplicationPlanWhereInput failoverTestNameSettingNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FAILOVER_TEST_NAME_SETTING_NOT_CONTAINS);
        return this;
    }

    public void setFailoverTestNameSettingNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FAILOVER_TEST_NAME_SETTING_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FAILOVER_TEST_NAME_SETTING_NOT_CONTAINS);
        }
    }

    public boolean getFailoverTestNameSettingNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FAILOVER_TEST_NAME_SETTING_NOT_CONTAINS);
    }

    public SyncReplicationPlanWhereInput failoverTestNameSettingNotEndsWith(
            String failoverTestNameSettingNotEndsWith) {

        this.failoverTestNameSettingNotEndsWith = failoverTestNameSettingNotEndsWith;
        return this;
    }

    /**
     * Get failoverTestNameSettingNotEndsWith
     *
     * @return failoverTestNameSettingNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getFailoverTestNameSettingNotEndsWith() {
        return failoverTestNameSettingNotEndsWith;
    }

    public void setFailoverTestNameSettingNotEndsWith(String failoverTestNameSettingNotEndsWith) {
        this.failoverTestNameSettingNotEndsWith = failoverTestNameSettingNotEndsWith;
    }

    public SyncReplicationPlanWhereInput failoverTestNameSettingNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FAILOVER_TEST_NAME_SETTING_NOT_ENDS_WITH);
        return this;
    }

    public SyncReplicationPlanWhereInput failoverTestNameSettingNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FAILOVER_TEST_NAME_SETTING_NOT_ENDS_WITH);
        return this;
    }

    public void setFailoverTestNameSettingNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FAILOVER_TEST_NAME_SETTING_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FAILOVER_TEST_NAME_SETTING_NOT_ENDS_WITH);
        }
    }

    public boolean getFailoverTestNameSettingNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FAILOVER_TEST_NAME_SETTING_NOT_ENDS_WITH);
    }

    public SyncReplicationPlanWhereInput failoverTestNameSettingNotIn(
            List<String> failoverTestNameSettingNotIn) {

        this.failoverTestNameSettingNotIn = failoverTestNameSettingNotIn;
        return this;
    }

    public SyncReplicationPlanWhereInput addFailoverTestNameSettingNotInItem(
            String failoverTestNameSettingNotInItem) {
        if (this.failoverTestNameSettingNotIn == null) {
            this.failoverTestNameSettingNotIn = new ArrayList<String>();
        }
        this.failoverTestNameSettingNotIn.add(failoverTestNameSettingNotInItem);
        return this;
    }

    /**
     * Get failoverTestNameSettingNotIn
     *
     * @return failoverTestNameSettingNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getFailoverTestNameSettingNotIn() {
        return failoverTestNameSettingNotIn;
    }

    public void setFailoverTestNameSettingNotIn(List<String> failoverTestNameSettingNotIn) {
        this.failoverTestNameSettingNotIn = failoverTestNameSettingNotIn;
    }

    public SyncReplicationPlanWhereInput failoverTestNameSettingNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FAILOVER_TEST_NAME_SETTING_NOT_IN);
        return this;
    }

    public SyncReplicationPlanWhereInput failoverTestNameSettingNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FAILOVER_TEST_NAME_SETTING_NOT_IN);
        return this;
    }

    public void setFailoverTestNameSettingNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FAILOVER_TEST_NAME_SETTING_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FAILOVER_TEST_NAME_SETTING_NOT_IN);
        }
    }

    public boolean getFailoverTestNameSettingNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FAILOVER_TEST_NAME_SETTING_NOT_IN);
    }

    public SyncReplicationPlanWhereInput failoverTestNameSettingNotStartsWith(
            String failoverTestNameSettingNotStartsWith) {

        this.failoverTestNameSettingNotStartsWith = failoverTestNameSettingNotStartsWith;
        return this;
    }

    /**
     * Get failoverTestNameSettingNotStartsWith
     *
     * @return failoverTestNameSettingNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getFailoverTestNameSettingNotStartsWith() {
        return failoverTestNameSettingNotStartsWith;
    }

    public void setFailoverTestNameSettingNotStartsWith(
            String failoverTestNameSettingNotStartsWith) {
        this.failoverTestNameSettingNotStartsWith = failoverTestNameSettingNotStartsWith;
    }

    public SyncReplicationPlanWhereInput failoverTestNameSettingNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FAILOVER_TEST_NAME_SETTING_NOT_STARTS_WITH);
        return this;
    }

    public SyncReplicationPlanWhereInput failoverTestNameSettingNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FAILOVER_TEST_NAME_SETTING_NOT_STARTS_WITH);
        return this;
    }

    public void setFailoverTestNameSettingNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FAILOVER_TEST_NAME_SETTING_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FAILOVER_TEST_NAME_SETTING_NOT_STARTS_WITH);
        }
    }

    public boolean getFailoverTestNameSettingNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(
                SERIALIZED_NAME_FAILOVER_TEST_NAME_SETTING_NOT_STARTS_WITH);
    }

    public SyncReplicationPlanWhereInput failoverTestNameSettingStartsWith(
            String failoverTestNameSettingStartsWith) {

        this.failoverTestNameSettingStartsWith = failoverTestNameSettingStartsWith;
        return this;
    }

    /**
     * Get failoverTestNameSettingStartsWith
     *
     * @return failoverTestNameSettingStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getFailoverTestNameSettingStartsWith() {
        return failoverTestNameSettingStartsWith;
    }

    public void setFailoverTestNameSettingStartsWith(String failoverTestNameSettingStartsWith) {
        this.failoverTestNameSettingStartsWith = failoverTestNameSettingStartsWith;
    }

    public SyncReplicationPlanWhereInput failoverTestNameSettingStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FAILOVER_TEST_NAME_SETTING_STARTS_WITH);
        return this;
    }

    public SyncReplicationPlanWhereInput failoverTestNameSettingStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FAILOVER_TEST_NAME_SETTING_STARTS_WITH);
        return this;
    }

    public void setFailoverTestNameSettingStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FAILOVER_TEST_NAME_SETTING_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FAILOVER_TEST_NAME_SETTING_STARTS_WITH);
        }
    }

    public boolean getFailoverTestNameSettingStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FAILOVER_TEST_NAME_SETTING_STARTS_WITH);
    }

    public SyncReplicationPlanWhereInput id(String id) {

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

    public SyncReplicationPlanWhereInput id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public SyncReplicationPlanWhereInput id_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput idContains(String idContains) {

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

    public SyncReplicationPlanWhereInput idContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_CONTAINS);
        return this;
    }

    public SyncReplicationPlanWhereInput idContains_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput idEndsWith(String idEndsWith) {

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

    public SyncReplicationPlanWhereInput idEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_ENDS_WITH);
        return this;
    }

    public SyncReplicationPlanWhereInput idEndsWith_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput idGt(String idGt) {

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

    public SyncReplicationPlanWhereInput idGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GT);
        return this;
    }

    public SyncReplicationPlanWhereInput idGt_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput idGte(String idGte) {

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

    public SyncReplicationPlanWhereInput idGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GTE);
        return this;
    }

    public SyncReplicationPlanWhereInput idGte_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput idIn(List<String> idIn) {

        this.idIn = idIn;
        return this;
    }

    public SyncReplicationPlanWhereInput addIdInItem(String idInItem) {
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

    public SyncReplicationPlanWhereInput idIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_IN);
        return this;
    }

    public SyncReplicationPlanWhereInput idIn_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput idLt(String idLt) {

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

    public SyncReplicationPlanWhereInput idLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LT);
        return this;
    }

    public SyncReplicationPlanWhereInput idLt_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput idLte(String idLte) {

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

    public SyncReplicationPlanWhereInput idLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LTE);
        return this;
    }

    public SyncReplicationPlanWhereInput idLte_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput idNot(String idNot) {

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

    public SyncReplicationPlanWhereInput idNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT);
        return this;
    }

    public SyncReplicationPlanWhereInput idNot_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput idNotContains(String idNotContains) {

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

    public SyncReplicationPlanWhereInput idNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_CONTAINS);
        return this;
    }

    public SyncReplicationPlanWhereInput idNotContains_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput idNotEndsWith(String idNotEndsWith) {

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

    public SyncReplicationPlanWhereInput idNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
        return this;
    }

    public SyncReplicationPlanWhereInput idNotEndsWith_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput idNotIn(List<String> idNotIn) {

        this.idNotIn = idNotIn;
        return this;
    }

    public SyncReplicationPlanWhereInput addIdNotInItem(String idNotInItem) {
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

    public SyncReplicationPlanWhereInput idNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_IN);
        return this;
    }

    public SyncReplicationPlanWhereInput idNotIn_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput idNotStartsWith(String idNotStartsWith) {

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

    public SyncReplicationPlanWhereInput idNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
        return this;
    }

    public SyncReplicationPlanWhereInput idNotStartsWith_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput idStartsWith(String idStartsWith) {

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

    public SyncReplicationPlanWhereInput idStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_STARTS_WITH);
        return this;
    }

    public SyncReplicationPlanWhereInput idStartsWith_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput inbound(Boolean inbound) {

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

    public SyncReplicationPlanWhereInput inbound_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INBOUND);
        return this;
    }

    public SyncReplicationPlanWhereInput inbound_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput inboundNot(Boolean inboundNot) {

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

    public SyncReplicationPlanWhereInput inboundNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INBOUND_NOT);
        return this;
    }

    public SyncReplicationPlanWhereInput inboundNot_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput initializationTimePoint(String initializationTimePoint) {

        this.initializationTimePoint = initializationTimePoint;
        return this;
    }

    /**
     * Get initializationTimePoint
     *
     * @return initializationTimePoint
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getInitializationTimePoint() {
        return initializationTimePoint;
    }

    public void setInitializationTimePoint(String initializationTimePoint) {
        this.initializationTimePoint = initializationTimePoint;
    }

    public SyncReplicationPlanWhereInput initializationTimePoint_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INITIALIZATION_TIME_POINT);
        return this;
    }

    public SyncReplicationPlanWhereInput initializationTimePoint_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INITIALIZATION_TIME_POINT);
        return this;
    }

    public void setInitializationTimePoint_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INITIALIZATION_TIME_POINT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INITIALIZATION_TIME_POINT);
        }
    }

    public boolean getInitializationTimePoint_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INITIALIZATION_TIME_POINT);
    }

    public SyncReplicationPlanWhereInput initializationTimePointContains(
            String initializationTimePointContains) {

        this.initializationTimePointContains = initializationTimePointContains;
        return this;
    }

    /**
     * Get initializationTimePointContains
     *
     * @return initializationTimePointContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getInitializationTimePointContains() {
        return initializationTimePointContains;
    }

    public void setInitializationTimePointContains(String initializationTimePointContains) {
        this.initializationTimePointContains = initializationTimePointContains;
    }

    public SyncReplicationPlanWhereInput initializationTimePointContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INITIALIZATION_TIME_POINT_CONTAINS);
        return this;
    }

    public SyncReplicationPlanWhereInput initializationTimePointContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INITIALIZATION_TIME_POINT_CONTAINS);
        return this;
    }

    public void setInitializationTimePointContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INITIALIZATION_TIME_POINT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INITIALIZATION_TIME_POINT_CONTAINS);
        }
    }

    public boolean getInitializationTimePointContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INITIALIZATION_TIME_POINT_CONTAINS);
    }

    public SyncReplicationPlanWhereInput initializationTimePointEndsWith(
            String initializationTimePointEndsWith) {

        this.initializationTimePointEndsWith = initializationTimePointEndsWith;
        return this;
    }

    /**
     * Get initializationTimePointEndsWith
     *
     * @return initializationTimePointEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getInitializationTimePointEndsWith() {
        return initializationTimePointEndsWith;
    }

    public void setInitializationTimePointEndsWith(String initializationTimePointEndsWith) {
        this.initializationTimePointEndsWith = initializationTimePointEndsWith;
    }

    public SyncReplicationPlanWhereInput initializationTimePointEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INITIALIZATION_TIME_POINT_ENDS_WITH);
        return this;
    }

    public SyncReplicationPlanWhereInput initializationTimePointEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INITIALIZATION_TIME_POINT_ENDS_WITH);
        return this;
    }

    public void setInitializationTimePointEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INITIALIZATION_TIME_POINT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INITIALIZATION_TIME_POINT_ENDS_WITH);
        }
    }

    public boolean getInitializationTimePointEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INITIALIZATION_TIME_POINT_ENDS_WITH);
    }

    public SyncReplicationPlanWhereInput initializationTimePointGt(
            String initializationTimePointGt) {

        this.initializationTimePointGt = initializationTimePointGt;
        return this;
    }

    /**
     * Get initializationTimePointGt
     *
     * @return initializationTimePointGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getInitializationTimePointGt() {
        return initializationTimePointGt;
    }

    public void setInitializationTimePointGt(String initializationTimePointGt) {
        this.initializationTimePointGt = initializationTimePointGt;
    }

    public SyncReplicationPlanWhereInput initializationTimePointGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INITIALIZATION_TIME_POINT_GT);
        return this;
    }

    public SyncReplicationPlanWhereInput initializationTimePointGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INITIALIZATION_TIME_POINT_GT);
        return this;
    }

    public void setInitializationTimePointGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INITIALIZATION_TIME_POINT_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INITIALIZATION_TIME_POINT_GT);
        }
    }

    public boolean getInitializationTimePointGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INITIALIZATION_TIME_POINT_GT);
    }

    public SyncReplicationPlanWhereInput initializationTimePointGte(
            String initializationTimePointGte) {

        this.initializationTimePointGte = initializationTimePointGte;
        return this;
    }

    /**
     * Get initializationTimePointGte
     *
     * @return initializationTimePointGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getInitializationTimePointGte() {
        return initializationTimePointGte;
    }

    public void setInitializationTimePointGte(String initializationTimePointGte) {
        this.initializationTimePointGte = initializationTimePointGte;
    }

    public SyncReplicationPlanWhereInput initializationTimePointGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INITIALIZATION_TIME_POINT_GTE);
        return this;
    }

    public SyncReplicationPlanWhereInput initializationTimePointGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INITIALIZATION_TIME_POINT_GTE);
        return this;
    }

    public void setInitializationTimePointGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INITIALIZATION_TIME_POINT_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INITIALIZATION_TIME_POINT_GTE);
        }
    }

    public boolean getInitializationTimePointGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INITIALIZATION_TIME_POINT_GTE);
    }

    public SyncReplicationPlanWhereInput initializationTimePointIn(
            List<String> initializationTimePointIn) {

        this.initializationTimePointIn = initializationTimePointIn;
        return this;
    }

    public SyncReplicationPlanWhereInput addInitializationTimePointInItem(
            String initializationTimePointInItem) {
        if (this.initializationTimePointIn == null) {
            this.initializationTimePointIn = new ArrayList<String>();
        }
        this.initializationTimePointIn.add(initializationTimePointInItem);
        return this;
    }

    /**
     * Get initializationTimePointIn
     *
     * @return initializationTimePointIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getInitializationTimePointIn() {
        return initializationTimePointIn;
    }

    public void setInitializationTimePointIn(List<String> initializationTimePointIn) {
        this.initializationTimePointIn = initializationTimePointIn;
    }

    public SyncReplicationPlanWhereInput initializationTimePointIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INITIALIZATION_TIME_POINT_IN);
        return this;
    }

    public SyncReplicationPlanWhereInput initializationTimePointIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INITIALIZATION_TIME_POINT_IN);
        return this;
    }

    public void setInitializationTimePointIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INITIALIZATION_TIME_POINT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INITIALIZATION_TIME_POINT_IN);
        }
    }

    public boolean getInitializationTimePointIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INITIALIZATION_TIME_POINT_IN);
    }

    public SyncReplicationPlanWhereInput initializationTimePointLt(
            String initializationTimePointLt) {

        this.initializationTimePointLt = initializationTimePointLt;
        return this;
    }

    /**
     * Get initializationTimePointLt
     *
     * @return initializationTimePointLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getInitializationTimePointLt() {
        return initializationTimePointLt;
    }

    public void setInitializationTimePointLt(String initializationTimePointLt) {
        this.initializationTimePointLt = initializationTimePointLt;
    }

    public SyncReplicationPlanWhereInput initializationTimePointLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INITIALIZATION_TIME_POINT_LT);
        return this;
    }

    public SyncReplicationPlanWhereInput initializationTimePointLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INITIALIZATION_TIME_POINT_LT);
        return this;
    }

    public void setInitializationTimePointLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INITIALIZATION_TIME_POINT_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INITIALIZATION_TIME_POINT_LT);
        }
    }

    public boolean getInitializationTimePointLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INITIALIZATION_TIME_POINT_LT);
    }

    public SyncReplicationPlanWhereInput initializationTimePointLte(
            String initializationTimePointLte) {

        this.initializationTimePointLte = initializationTimePointLte;
        return this;
    }

    /**
     * Get initializationTimePointLte
     *
     * @return initializationTimePointLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getInitializationTimePointLte() {
        return initializationTimePointLte;
    }

    public void setInitializationTimePointLte(String initializationTimePointLte) {
        this.initializationTimePointLte = initializationTimePointLte;
    }

    public SyncReplicationPlanWhereInput initializationTimePointLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INITIALIZATION_TIME_POINT_LTE);
        return this;
    }

    public SyncReplicationPlanWhereInput initializationTimePointLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INITIALIZATION_TIME_POINT_LTE);
        return this;
    }

    public void setInitializationTimePointLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INITIALIZATION_TIME_POINT_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INITIALIZATION_TIME_POINT_LTE);
        }
    }

    public boolean getInitializationTimePointLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INITIALIZATION_TIME_POINT_LTE);
    }

    public SyncReplicationPlanWhereInput initializationTimePointNot(
            String initializationTimePointNot) {

        this.initializationTimePointNot = initializationTimePointNot;
        return this;
    }

    /**
     * Get initializationTimePointNot
     *
     * @return initializationTimePointNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getInitializationTimePointNot() {
        return initializationTimePointNot;
    }

    public void setInitializationTimePointNot(String initializationTimePointNot) {
        this.initializationTimePointNot = initializationTimePointNot;
    }

    public SyncReplicationPlanWhereInput initializationTimePointNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INITIALIZATION_TIME_POINT_NOT);
        return this;
    }

    public SyncReplicationPlanWhereInput initializationTimePointNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INITIALIZATION_TIME_POINT_NOT);
        return this;
    }

    public void setInitializationTimePointNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INITIALIZATION_TIME_POINT_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INITIALIZATION_TIME_POINT_NOT);
        }
    }

    public boolean getInitializationTimePointNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INITIALIZATION_TIME_POINT_NOT);
    }

    public SyncReplicationPlanWhereInput initializationTimePointNotContains(
            String initializationTimePointNotContains) {

        this.initializationTimePointNotContains = initializationTimePointNotContains;
        return this;
    }

    /**
     * Get initializationTimePointNotContains
     *
     * @return initializationTimePointNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getInitializationTimePointNotContains() {
        return initializationTimePointNotContains;
    }

    public void setInitializationTimePointNotContains(String initializationTimePointNotContains) {
        this.initializationTimePointNotContains = initializationTimePointNotContains;
    }

    public SyncReplicationPlanWhereInput initializationTimePointNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INITIALIZATION_TIME_POINT_NOT_CONTAINS);
        return this;
    }

    public SyncReplicationPlanWhereInput initializationTimePointNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INITIALIZATION_TIME_POINT_NOT_CONTAINS);
        return this;
    }

    public void setInitializationTimePointNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INITIALIZATION_TIME_POINT_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INITIALIZATION_TIME_POINT_NOT_CONTAINS);
        }
    }

    public boolean getInitializationTimePointNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INITIALIZATION_TIME_POINT_NOT_CONTAINS);
    }

    public SyncReplicationPlanWhereInput initializationTimePointNotEndsWith(
            String initializationTimePointNotEndsWith) {

        this.initializationTimePointNotEndsWith = initializationTimePointNotEndsWith;
        return this;
    }

    /**
     * Get initializationTimePointNotEndsWith
     *
     * @return initializationTimePointNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getInitializationTimePointNotEndsWith() {
        return initializationTimePointNotEndsWith;
    }

    public void setInitializationTimePointNotEndsWith(String initializationTimePointNotEndsWith) {
        this.initializationTimePointNotEndsWith = initializationTimePointNotEndsWith;
    }

    public SyncReplicationPlanWhereInput initializationTimePointNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INITIALIZATION_TIME_POINT_NOT_ENDS_WITH);
        return this;
    }

    public SyncReplicationPlanWhereInput initializationTimePointNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INITIALIZATION_TIME_POINT_NOT_ENDS_WITH);
        return this;
    }

    public void setInitializationTimePointNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INITIALIZATION_TIME_POINT_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INITIALIZATION_TIME_POINT_NOT_ENDS_WITH);
        }
    }

    public boolean getInitializationTimePointNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INITIALIZATION_TIME_POINT_NOT_ENDS_WITH);
    }

    public SyncReplicationPlanWhereInput initializationTimePointNotIn(
            List<String> initializationTimePointNotIn) {

        this.initializationTimePointNotIn = initializationTimePointNotIn;
        return this;
    }

    public SyncReplicationPlanWhereInput addInitializationTimePointNotInItem(
            String initializationTimePointNotInItem) {
        if (this.initializationTimePointNotIn == null) {
            this.initializationTimePointNotIn = new ArrayList<String>();
        }
        this.initializationTimePointNotIn.add(initializationTimePointNotInItem);
        return this;
    }

    /**
     * Get initializationTimePointNotIn
     *
     * @return initializationTimePointNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getInitializationTimePointNotIn() {
        return initializationTimePointNotIn;
    }

    public void setInitializationTimePointNotIn(List<String> initializationTimePointNotIn) {
        this.initializationTimePointNotIn = initializationTimePointNotIn;
    }

    public SyncReplicationPlanWhereInput initializationTimePointNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INITIALIZATION_TIME_POINT_NOT_IN);
        return this;
    }

    public SyncReplicationPlanWhereInput initializationTimePointNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INITIALIZATION_TIME_POINT_NOT_IN);
        return this;
    }

    public void setInitializationTimePointNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INITIALIZATION_TIME_POINT_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INITIALIZATION_TIME_POINT_NOT_IN);
        }
    }

    public boolean getInitializationTimePointNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INITIALIZATION_TIME_POINT_NOT_IN);
    }

    public SyncReplicationPlanWhereInput initializationTimePointNotStartsWith(
            String initializationTimePointNotStartsWith) {

        this.initializationTimePointNotStartsWith = initializationTimePointNotStartsWith;
        return this;
    }

    /**
     * Get initializationTimePointNotStartsWith
     *
     * @return initializationTimePointNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getInitializationTimePointNotStartsWith() {
        return initializationTimePointNotStartsWith;
    }

    public void setInitializationTimePointNotStartsWith(
            String initializationTimePointNotStartsWith) {
        this.initializationTimePointNotStartsWith = initializationTimePointNotStartsWith;
    }

    public SyncReplicationPlanWhereInput initializationTimePointNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INITIALIZATION_TIME_POINT_NOT_STARTS_WITH);
        return this;
    }

    public SyncReplicationPlanWhereInput initializationTimePointNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INITIALIZATION_TIME_POINT_NOT_STARTS_WITH);
        return this;
    }

    public void setInitializationTimePointNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INITIALIZATION_TIME_POINT_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INITIALIZATION_TIME_POINT_NOT_STARTS_WITH);
        }
    }

    public boolean getInitializationTimePointNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INITIALIZATION_TIME_POINT_NOT_STARTS_WITH);
    }

    public SyncReplicationPlanWhereInput initializationTimePointStartsWith(
            String initializationTimePointStartsWith) {

        this.initializationTimePointStartsWith = initializationTimePointStartsWith;
        return this;
    }

    /**
     * Get initializationTimePointStartsWith
     *
     * @return initializationTimePointStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getInitializationTimePointStartsWith() {
        return initializationTimePointStartsWith;
    }

    public void setInitializationTimePointStartsWith(String initializationTimePointStartsWith) {
        this.initializationTimePointStartsWith = initializationTimePointStartsWith;
    }

    public SyncReplicationPlanWhereInput initializationTimePointStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INITIALIZATION_TIME_POINT_STARTS_WITH);
        return this;
    }

    public SyncReplicationPlanWhereInput initializationTimePointStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INITIALIZATION_TIME_POINT_STARTS_WITH);
        return this;
    }

    public void setInitializationTimePointStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INITIALIZATION_TIME_POINT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INITIALIZATION_TIME_POINT_STARTS_WITH);
        }
    }

    public boolean getInitializationTimePointStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INITIALIZATION_TIME_POINT_STARTS_WITH);
    }

    public SyncReplicationPlanWhereInput interval(Integer interval) {

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

    public SyncReplicationPlanWhereInput interval_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INTERVAL);
        return this;
    }

    public SyncReplicationPlanWhereInput interval_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput intervalGt(Integer intervalGt) {

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

    public SyncReplicationPlanWhereInput intervalGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INTERVAL_GT);
        return this;
    }

    public SyncReplicationPlanWhereInput intervalGt_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput intervalGte(Integer intervalGte) {

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

    public SyncReplicationPlanWhereInput intervalGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INTERVAL_GTE);
        return this;
    }

    public SyncReplicationPlanWhereInput intervalGte_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput intervalIn(List<Integer> intervalIn) {

        this.intervalIn = intervalIn;
        return this;
    }

    public SyncReplicationPlanWhereInput addIntervalInItem(Integer intervalInItem) {
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

    public SyncReplicationPlanWhereInput intervalIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INTERVAL_IN);
        return this;
    }

    public SyncReplicationPlanWhereInput intervalIn_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput intervalLt(Integer intervalLt) {

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

    public SyncReplicationPlanWhereInput intervalLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INTERVAL_LT);
        return this;
    }

    public SyncReplicationPlanWhereInput intervalLt_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput intervalLte(Integer intervalLte) {

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

    public SyncReplicationPlanWhereInput intervalLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INTERVAL_LTE);
        return this;
    }

    public SyncReplicationPlanWhereInput intervalLte_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput intervalNot(Integer intervalNot) {

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

    public SyncReplicationPlanWhereInput intervalNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INTERVAL_NOT);
        return this;
    }

    public SyncReplicationPlanWhereInput intervalNot_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput intervalNotIn(List<Integer> intervalNotIn) {

        this.intervalNotIn = intervalNotIn;
        return this;
    }

    public SyncReplicationPlanWhereInput addIntervalNotInItem(Integer intervalNotInItem) {
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

    public SyncReplicationPlanWhereInput intervalNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INTERVAL_NOT_IN);
        return this;
    }

    public SyncReplicationPlanWhereInput intervalNotIn_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput keepMacAddress(Boolean keepMacAddress) {

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

    public SyncReplicationPlanWhereInput keepMacAddress_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KEEP_MAC_ADDRESS);
        return this;
    }

    public SyncReplicationPlanWhereInput keepMacAddress_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput keepMacAddressNot(Boolean keepMacAddressNot) {

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

    public SyncReplicationPlanWhereInput keepMacAddressNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KEEP_MAC_ADDRESS_NOT);
        return this;
    }

    public SyncReplicationPlanWhereInput keepMacAddressNot_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput keepPolicy(BackupPlanKeepPolicy keepPolicy) {

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

    public SyncReplicationPlanWhereInput keepPolicy_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KEEP_POLICY);
        return this;
    }

    public SyncReplicationPlanWhereInput keepPolicy_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput keepPolicyIn(List<BackupPlanKeepPolicy> keepPolicyIn) {

        this.keepPolicyIn = keepPolicyIn;
        return this;
    }

    public SyncReplicationPlanWhereInput addKeepPolicyInItem(
            BackupPlanKeepPolicy keepPolicyInItem) {
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

    public SyncReplicationPlanWhereInput keepPolicyIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KEEP_POLICY_IN);
        return this;
    }

    public SyncReplicationPlanWhereInput keepPolicyIn_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput keepPolicyNot(BackupPlanKeepPolicy keepPolicyNot) {

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

    public SyncReplicationPlanWhereInput keepPolicyNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KEEP_POLICY_NOT);
        return this;
    }

    public SyncReplicationPlanWhereInput keepPolicyNot_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput keepPolicyNotIn(
            List<BackupPlanKeepPolicy> keepPolicyNotIn) {

        this.keepPolicyNotIn = keepPolicyNotIn;
        return this;
    }

    public SyncReplicationPlanWhereInput addKeepPolicyNotInItem(
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

    public SyncReplicationPlanWhereInput keepPolicyNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KEEP_POLICY_NOT_IN);
        return this;
    }

    public SyncReplicationPlanWhereInput keepPolicyNotIn_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput keepPolicyValue(Integer keepPolicyValue) {

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

    public SyncReplicationPlanWhereInput keepPolicyValue_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KEEP_POLICY_VALUE);
        return this;
    }

    public SyncReplicationPlanWhereInput keepPolicyValue_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput keepPolicyValueGt(Integer keepPolicyValueGt) {

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

    public SyncReplicationPlanWhereInput keepPolicyValueGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KEEP_POLICY_VALUE_GT);
        return this;
    }

    public SyncReplicationPlanWhereInput keepPolicyValueGt_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput keepPolicyValueGte(Integer keepPolicyValueGte) {

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

    public SyncReplicationPlanWhereInput keepPolicyValueGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KEEP_POLICY_VALUE_GTE);
        return this;
    }

    public SyncReplicationPlanWhereInput keepPolicyValueGte_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput keepPolicyValueIn(List<Integer> keepPolicyValueIn) {

        this.keepPolicyValueIn = keepPolicyValueIn;
        return this;
    }

    public SyncReplicationPlanWhereInput addKeepPolicyValueInItem(Integer keepPolicyValueInItem) {
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

    public SyncReplicationPlanWhereInput keepPolicyValueIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KEEP_POLICY_VALUE_IN);
        return this;
    }

    public SyncReplicationPlanWhereInput keepPolicyValueIn_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput keepPolicyValueLt(Integer keepPolicyValueLt) {

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

    public SyncReplicationPlanWhereInput keepPolicyValueLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KEEP_POLICY_VALUE_LT);
        return this;
    }

    public SyncReplicationPlanWhereInput keepPolicyValueLt_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput keepPolicyValueLte(Integer keepPolicyValueLte) {

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

    public SyncReplicationPlanWhereInput keepPolicyValueLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KEEP_POLICY_VALUE_LTE);
        return this;
    }

    public SyncReplicationPlanWhereInput keepPolicyValueLte_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput keepPolicyValueNot(Integer keepPolicyValueNot) {

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

    public SyncReplicationPlanWhereInput keepPolicyValueNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KEEP_POLICY_VALUE_NOT);
        return this;
    }

    public SyncReplicationPlanWhereInput keepPolicyValueNot_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput keepPolicyValueNotIn(List<Integer> keepPolicyValueNotIn) {

        this.keepPolicyValueNotIn = keepPolicyValueNotIn;
        return this;
    }

    public SyncReplicationPlanWhereInput addKeepPolicyValueNotInItem(
            Integer keepPolicyValueNotInItem) {
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

    public SyncReplicationPlanWhereInput keepPolicyValueNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KEEP_POLICY_VALUE_NOT_IN);
        return this;
    }

    public SyncReplicationPlanWhereInput keepPolicyValueNotIn_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput name(String name) {

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

    public SyncReplicationPlanWhereInput name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public SyncReplicationPlanWhereInput name_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput nameContains(String nameContains) {

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

    public SyncReplicationPlanWhereInput nameContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_CONTAINS);
        return this;
    }

    public SyncReplicationPlanWhereInput nameContains_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput nameEndsWith(String nameEndsWith) {

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

    public SyncReplicationPlanWhereInput nameEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_ENDS_WITH);
        return this;
    }

    public SyncReplicationPlanWhereInput nameEndsWith_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput nameGt(String nameGt) {

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

    public SyncReplicationPlanWhereInput nameGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_GT);
        return this;
    }

    public SyncReplicationPlanWhereInput nameGt_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput nameGte(String nameGte) {

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

    public SyncReplicationPlanWhereInput nameGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_GTE);
        return this;
    }

    public SyncReplicationPlanWhereInput nameGte_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput nameIn(List<String> nameIn) {

        this.nameIn = nameIn;
        return this;
    }

    public SyncReplicationPlanWhereInput addNameInItem(String nameInItem) {
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

    public SyncReplicationPlanWhereInput nameIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_IN);
        return this;
    }

    public SyncReplicationPlanWhereInput nameIn_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput nameLt(String nameLt) {

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

    public SyncReplicationPlanWhereInput nameLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_LT);
        return this;
    }

    public SyncReplicationPlanWhereInput nameLt_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput nameLte(String nameLte) {

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

    public SyncReplicationPlanWhereInput nameLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_LTE);
        return this;
    }

    public SyncReplicationPlanWhereInput nameLte_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput nameNot(String nameNot) {

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

    public SyncReplicationPlanWhereInput nameNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT);
        return this;
    }

    public SyncReplicationPlanWhereInput nameNot_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput nameNotContains(String nameNotContains) {

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

    public SyncReplicationPlanWhereInput nameNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_CONTAINS);
        return this;
    }

    public SyncReplicationPlanWhereInput nameNotContains_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput nameNotEndsWith(String nameNotEndsWith) {

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

    public SyncReplicationPlanWhereInput nameNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_ENDS_WITH);
        return this;
    }

    public SyncReplicationPlanWhereInput nameNotEndsWith_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput nameNotIn(List<String> nameNotIn) {

        this.nameNotIn = nameNotIn;
        return this;
    }

    public SyncReplicationPlanWhereInput addNameNotInItem(String nameNotInItem) {
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

    public SyncReplicationPlanWhereInput nameNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_IN);
        return this;
    }

    public SyncReplicationPlanWhereInput nameNotIn_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput nameNotStartsWith(String nameNotStartsWith) {

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

    public SyncReplicationPlanWhereInput nameNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_STARTS_WITH);
        return this;
    }

    public SyncReplicationPlanWhereInput nameNotStartsWith_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput nameStartsWith(String nameStartsWith) {

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

    public SyncReplicationPlanWhereInput nameStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_STARTS_WITH);
        return this;
    }

    public SyncReplicationPlanWhereInput nameStartsWith_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput period(ReplicationPlanPeriod period) {

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

    public SyncReplicationPlanWhereInput period_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PERIOD);
        return this;
    }

    public SyncReplicationPlanWhereInput period_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput periodIn(List<ReplicationPlanPeriod> periodIn) {

        this.periodIn = periodIn;
        return this;
    }

    public SyncReplicationPlanWhereInput addPeriodInItem(ReplicationPlanPeriod periodInItem) {
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

    public SyncReplicationPlanWhereInput periodIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PERIOD_IN);
        return this;
    }

    public SyncReplicationPlanWhereInput periodIn_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput periodNot(ReplicationPlanPeriod periodNot) {

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

    public SyncReplicationPlanWhereInput periodNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PERIOD_NOT);
        return this;
    }

    public SyncReplicationPlanWhereInput periodNot_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput periodNotIn(List<ReplicationPlanPeriod> periodNotIn) {

        this.periodNotIn = periodNotIn;
        return this;
    }

    public SyncReplicationPlanWhereInput addPeriodNotInItem(ReplicationPlanPeriod periodNotInItem) {
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

    public SyncReplicationPlanWhereInput periodNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PERIOD_NOT_IN);
        return this;
    }

    public SyncReplicationPlanWhereInput periodNotIn_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput phase(BackupPlanPhase phase) {

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

    public SyncReplicationPlanWhereInput phase_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PHASE);
        return this;
    }

    public SyncReplicationPlanWhereInput phase_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput phaseIn(List<BackupPlanPhase> phaseIn) {

        this.phaseIn = phaseIn;
        return this;
    }

    public SyncReplicationPlanWhereInput addPhaseInItem(BackupPlanPhase phaseInItem) {
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

    public SyncReplicationPlanWhereInput phaseIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PHASE_IN);
        return this;
    }

    public SyncReplicationPlanWhereInput phaseIn_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput phaseNot(BackupPlanPhase phaseNot) {

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

    public SyncReplicationPlanWhereInput phaseNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PHASE_NOT);
        return this;
    }

    public SyncReplicationPlanWhereInput phaseNot_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput phaseNotIn(List<BackupPlanPhase> phaseNotIn) {

        this.phaseNotIn = phaseNotIn;
        return this;
    }

    public SyncReplicationPlanWhereInput addPhaseNotInItem(BackupPlanPhase phaseNotInItem) {
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

    public SyncReplicationPlanWhereInput phaseNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PHASE_NOT_IN);
        return this;
    }

    public SyncReplicationPlanWhereInput phaseNotIn_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput replicaNameRule(ReplicaNameRule replicaNameRule) {

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

    public SyncReplicationPlanWhereInput replicaNameRule_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICA_NAME_RULE);
        return this;
    }

    public SyncReplicationPlanWhereInput replicaNameRule_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput replicaNameRuleIn(
            List<ReplicaNameRule> replicaNameRuleIn) {

        this.replicaNameRuleIn = replicaNameRuleIn;
        return this;
    }

    public SyncReplicationPlanWhereInput addReplicaNameRuleInItem(
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

    public SyncReplicationPlanWhereInput replicaNameRuleIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICA_NAME_RULE_IN);
        return this;
    }

    public SyncReplicationPlanWhereInput replicaNameRuleIn_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput replicaNameRuleNot(ReplicaNameRule replicaNameRuleNot) {

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

    public SyncReplicationPlanWhereInput replicaNameRuleNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICA_NAME_RULE_NOT);
        return this;
    }

    public SyncReplicationPlanWhereInput replicaNameRuleNot_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput replicaNameRuleNotIn(
            List<ReplicaNameRule> replicaNameRuleNotIn) {

        this.replicaNameRuleNotIn = replicaNameRuleNotIn;
        return this;
    }

    public SyncReplicationPlanWhereInput addReplicaNameRuleNotInItem(
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

    public SyncReplicationPlanWhereInput replicaNameRuleNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICA_NAME_RULE_NOT_IN);
        return this;
    }

    public SyncReplicationPlanWhereInput replicaNameRuleNotIn_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput replicaNameSetting(String replicaNameSetting) {

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

    public SyncReplicationPlanWhereInput replicaNameSetting_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICA_NAME_SETTING);
        return this;
    }

    public SyncReplicationPlanWhereInput replicaNameSetting_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput replicaNameSettingContains(
            String replicaNameSettingContains) {

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

    public SyncReplicationPlanWhereInput replicaNameSettingContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICA_NAME_SETTING_CONTAINS);
        return this;
    }

    public SyncReplicationPlanWhereInput replicaNameSettingContains_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput replicaNameSettingEndsWith(
            String replicaNameSettingEndsWith) {

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

    public SyncReplicationPlanWhereInput replicaNameSettingEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICA_NAME_SETTING_ENDS_WITH);
        return this;
    }

    public SyncReplicationPlanWhereInput replicaNameSettingEndsWith_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput replicaNameSettingGt(String replicaNameSettingGt) {

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

    public SyncReplicationPlanWhereInput replicaNameSettingGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICA_NAME_SETTING_GT);
        return this;
    }

    public SyncReplicationPlanWhereInput replicaNameSettingGt_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput replicaNameSettingGte(String replicaNameSettingGte) {

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

    public SyncReplicationPlanWhereInput replicaNameSettingGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICA_NAME_SETTING_GTE);
        return this;
    }

    public SyncReplicationPlanWhereInput replicaNameSettingGte_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput replicaNameSettingIn(List<String> replicaNameSettingIn) {

        this.replicaNameSettingIn = replicaNameSettingIn;
        return this;
    }

    public SyncReplicationPlanWhereInput addReplicaNameSettingInItem(
            String replicaNameSettingInItem) {
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

    public SyncReplicationPlanWhereInput replicaNameSettingIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICA_NAME_SETTING_IN);
        return this;
    }

    public SyncReplicationPlanWhereInput replicaNameSettingIn_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput replicaNameSettingLt(String replicaNameSettingLt) {

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

    public SyncReplicationPlanWhereInput replicaNameSettingLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICA_NAME_SETTING_LT);
        return this;
    }

    public SyncReplicationPlanWhereInput replicaNameSettingLt_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput replicaNameSettingLte(String replicaNameSettingLte) {

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

    public SyncReplicationPlanWhereInput replicaNameSettingLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICA_NAME_SETTING_LTE);
        return this;
    }

    public SyncReplicationPlanWhereInput replicaNameSettingLte_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput replicaNameSettingNot(String replicaNameSettingNot) {

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

    public SyncReplicationPlanWhereInput replicaNameSettingNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICA_NAME_SETTING_NOT);
        return this;
    }

    public SyncReplicationPlanWhereInput replicaNameSettingNot_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput replicaNameSettingNotContains(
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

    public SyncReplicationPlanWhereInput replicaNameSettingNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICA_NAME_SETTING_NOT_CONTAINS);
        return this;
    }

    public SyncReplicationPlanWhereInput replicaNameSettingNotContains_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput replicaNameSettingNotEndsWith(
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

    public SyncReplicationPlanWhereInput replicaNameSettingNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICA_NAME_SETTING_NOT_ENDS_WITH);
        return this;
    }

    public SyncReplicationPlanWhereInput replicaNameSettingNotEndsWith_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput replicaNameSettingNotIn(
            List<String> replicaNameSettingNotIn) {

        this.replicaNameSettingNotIn = replicaNameSettingNotIn;
        return this;
    }

    public SyncReplicationPlanWhereInput addReplicaNameSettingNotInItem(
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

    public SyncReplicationPlanWhereInput replicaNameSettingNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICA_NAME_SETTING_NOT_IN);
        return this;
    }

    public SyncReplicationPlanWhereInput replicaNameSettingNotIn_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput replicaNameSettingNotStartsWith(
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

    public SyncReplicationPlanWhereInput replicaNameSettingNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICA_NAME_SETTING_NOT_STARTS_WITH);
        return this;
    }

    public SyncReplicationPlanWhereInput replicaNameSettingNotStartsWith_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput replicaNameSettingStartsWith(
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

    public SyncReplicationPlanWhereInput replicaNameSettingStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICA_NAME_SETTING_STARTS_WITH);
        return this;
    }

    public SyncReplicationPlanWhereInput replicaNameSettingStartsWith_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput replicaNum(Integer replicaNum) {

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

    public SyncReplicationPlanWhereInput replicaNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICA_NUM);
        return this;
    }

    public SyncReplicationPlanWhereInput replicaNum_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput replicaNumGt(Integer replicaNumGt) {

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

    public SyncReplicationPlanWhereInput replicaNumGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICA_NUM_GT);
        return this;
    }

    public SyncReplicationPlanWhereInput replicaNumGt_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput replicaNumGte(Integer replicaNumGte) {

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

    public SyncReplicationPlanWhereInput replicaNumGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICA_NUM_GTE);
        return this;
    }

    public SyncReplicationPlanWhereInput replicaNumGte_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput replicaNumIn(List<Integer> replicaNumIn) {

        this.replicaNumIn = replicaNumIn;
        return this;
    }

    public SyncReplicationPlanWhereInput addReplicaNumInItem(Integer replicaNumInItem) {
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

    public SyncReplicationPlanWhereInput replicaNumIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICA_NUM_IN);
        return this;
    }

    public SyncReplicationPlanWhereInput replicaNumIn_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput replicaNumLt(Integer replicaNumLt) {

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

    public SyncReplicationPlanWhereInput replicaNumLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICA_NUM_LT);
        return this;
    }

    public SyncReplicationPlanWhereInput replicaNumLt_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput replicaNumLte(Integer replicaNumLte) {

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

    public SyncReplicationPlanWhereInput replicaNumLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICA_NUM_LTE);
        return this;
    }

    public SyncReplicationPlanWhereInput replicaNumLte_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput replicaNumNot(Integer replicaNumNot) {

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

    public SyncReplicationPlanWhereInput replicaNumNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICA_NUM_NOT);
        return this;
    }

    public SyncReplicationPlanWhereInput replicaNumNot_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput replicaNumNotIn(List<Integer> replicaNumNotIn) {

        this.replicaNumNotIn = replicaNumNotIn;
        return this;
    }

    public SyncReplicationPlanWhereInput addReplicaNumNotInItem(Integer replicaNumNotInItem) {
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

    public SyncReplicationPlanWhereInput replicaNumNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICA_NUM_NOT_IN);
        return this;
    }

    public SyncReplicationPlanWhereInput replicaNumNotIn_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput replicaVmsEvery(ReplicaVmWhereInput replicaVmsEvery) {

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

    public SyncReplicationPlanWhereInput replicaVmsEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICA_VMS_EVERY);
        return this;
    }

    public SyncReplicationPlanWhereInput replicaVmsEvery_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput replicaVmsNone(ReplicaVmWhereInput replicaVmsNone) {

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

    public SyncReplicationPlanWhereInput replicaVmsNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICA_VMS_NONE);
        return this;
    }

    public SyncReplicationPlanWhereInput replicaVmsNone_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput replicaVmsSome(ReplicaVmWhereInput replicaVmsSome) {

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

    public SyncReplicationPlanWhereInput replicaVmsSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICA_VMS_SOME);
        return this;
    }

    public SyncReplicationPlanWhereInput replicaVmsSome_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput resiliencyType(ResiliencyType resiliencyType) {

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

    public SyncReplicationPlanWhereInput resiliencyType_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESILIENCY_TYPE);
        return this;
    }

    public SyncReplicationPlanWhereInput resiliencyType_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput resiliencyTypeIn(List<ResiliencyType> resiliencyTypeIn) {

        this.resiliencyTypeIn = resiliencyTypeIn;
        return this;
    }

    public SyncReplicationPlanWhereInput addResiliencyTypeInItem(
            ResiliencyType resiliencyTypeInItem) {
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

    public SyncReplicationPlanWhereInput resiliencyTypeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESILIENCY_TYPE_IN);
        return this;
    }

    public SyncReplicationPlanWhereInput resiliencyTypeIn_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput resiliencyTypeNot(ResiliencyType resiliencyTypeNot) {

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

    public SyncReplicationPlanWhereInput resiliencyTypeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESILIENCY_TYPE_NOT);
        return this;
    }

    public SyncReplicationPlanWhereInput resiliencyTypeNot_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput resiliencyTypeNotIn(
            List<ResiliencyType> resiliencyTypeNotIn) {

        this.resiliencyTypeNotIn = resiliencyTypeNotIn;
        return this;
    }

    public SyncReplicationPlanWhereInput addResiliencyTypeNotInItem(
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

    public SyncReplicationPlanWhereInput resiliencyTypeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESILIENCY_TYPE_NOT_IN);
        return this;
    }

    public SyncReplicationPlanWhereInput resiliencyTypeNotIn_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput resourceVersion(Integer resourceVersion) {

        this.resourceVersion = resourceVersion;
        return this;
    }

    /**
     * Get resourceVersion
     *
     * @return resourceVersion
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getResourceVersion() {
        return resourceVersion;
    }

    public void setResourceVersion(Integer resourceVersion) {
        this.resourceVersion = resourceVersion;
    }

    public SyncReplicationPlanWhereInput resourceVersion_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_VERSION);
        return this;
    }

    public SyncReplicationPlanWhereInput resourceVersion_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_VERSION);
        return this;
    }

    public void setResourceVersion_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_VERSION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_VERSION);
        }
    }

    public boolean getResourceVersion_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_VERSION);
    }

    public SyncReplicationPlanWhereInput resourceVersionGt(Integer resourceVersionGt) {

        this.resourceVersionGt = resourceVersionGt;
        return this;
    }

    /**
     * Get resourceVersionGt
     *
     * @return resourceVersionGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getResourceVersionGt() {
        return resourceVersionGt;
    }

    public void setResourceVersionGt(Integer resourceVersionGt) {
        this.resourceVersionGt = resourceVersionGt;
    }

    public SyncReplicationPlanWhereInput resourceVersionGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_VERSION_GT);
        return this;
    }

    public SyncReplicationPlanWhereInput resourceVersionGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_VERSION_GT);
        return this;
    }

    public void setResourceVersionGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_VERSION_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_VERSION_GT);
        }
    }

    public boolean getResourceVersionGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_VERSION_GT);
    }

    public SyncReplicationPlanWhereInput resourceVersionGte(Integer resourceVersionGte) {

        this.resourceVersionGte = resourceVersionGte;
        return this;
    }

    /**
     * Get resourceVersionGte
     *
     * @return resourceVersionGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getResourceVersionGte() {
        return resourceVersionGte;
    }

    public void setResourceVersionGte(Integer resourceVersionGte) {
        this.resourceVersionGte = resourceVersionGte;
    }

    public SyncReplicationPlanWhereInput resourceVersionGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_VERSION_GTE);
        return this;
    }

    public SyncReplicationPlanWhereInput resourceVersionGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_VERSION_GTE);
        return this;
    }

    public void setResourceVersionGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_VERSION_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_VERSION_GTE);
        }
    }

    public boolean getResourceVersionGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_VERSION_GTE);
    }

    public SyncReplicationPlanWhereInput resourceVersionIn(List<Integer> resourceVersionIn) {

        this.resourceVersionIn = resourceVersionIn;
        return this;
    }

    public SyncReplicationPlanWhereInput addResourceVersionInItem(Integer resourceVersionInItem) {
        if (this.resourceVersionIn == null) {
            this.resourceVersionIn = new ArrayList<Integer>();
        }
        this.resourceVersionIn.add(resourceVersionInItem);
        return this;
    }

    /**
     * Get resourceVersionIn
     *
     * @return resourceVersionIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getResourceVersionIn() {
        return resourceVersionIn;
    }

    public void setResourceVersionIn(List<Integer> resourceVersionIn) {
        this.resourceVersionIn = resourceVersionIn;
    }

    public SyncReplicationPlanWhereInput resourceVersionIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_VERSION_IN);
        return this;
    }

    public SyncReplicationPlanWhereInput resourceVersionIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_VERSION_IN);
        return this;
    }

    public void setResourceVersionIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_VERSION_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_VERSION_IN);
        }
    }

    public boolean getResourceVersionIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_VERSION_IN);
    }

    public SyncReplicationPlanWhereInput resourceVersionLt(Integer resourceVersionLt) {

        this.resourceVersionLt = resourceVersionLt;
        return this;
    }

    /**
     * Get resourceVersionLt
     *
     * @return resourceVersionLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getResourceVersionLt() {
        return resourceVersionLt;
    }

    public void setResourceVersionLt(Integer resourceVersionLt) {
        this.resourceVersionLt = resourceVersionLt;
    }

    public SyncReplicationPlanWhereInput resourceVersionLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_VERSION_LT);
        return this;
    }

    public SyncReplicationPlanWhereInput resourceVersionLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_VERSION_LT);
        return this;
    }

    public void setResourceVersionLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_VERSION_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_VERSION_LT);
        }
    }

    public boolean getResourceVersionLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_VERSION_LT);
    }

    public SyncReplicationPlanWhereInput resourceVersionLte(Integer resourceVersionLte) {

        this.resourceVersionLte = resourceVersionLte;
        return this;
    }

    /**
     * Get resourceVersionLte
     *
     * @return resourceVersionLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getResourceVersionLte() {
        return resourceVersionLte;
    }

    public void setResourceVersionLte(Integer resourceVersionLte) {
        this.resourceVersionLte = resourceVersionLte;
    }

    public SyncReplicationPlanWhereInput resourceVersionLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_VERSION_LTE);
        return this;
    }

    public SyncReplicationPlanWhereInput resourceVersionLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_VERSION_LTE);
        return this;
    }

    public void setResourceVersionLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_VERSION_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_VERSION_LTE);
        }
    }

    public boolean getResourceVersionLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_VERSION_LTE);
    }

    public SyncReplicationPlanWhereInput resourceVersionNot(Integer resourceVersionNot) {

        this.resourceVersionNot = resourceVersionNot;
        return this;
    }

    /**
     * Get resourceVersionNot
     *
     * @return resourceVersionNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getResourceVersionNot() {
        return resourceVersionNot;
    }

    public void setResourceVersionNot(Integer resourceVersionNot) {
        this.resourceVersionNot = resourceVersionNot;
    }

    public SyncReplicationPlanWhereInput resourceVersionNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_VERSION_NOT);
        return this;
    }

    public SyncReplicationPlanWhereInput resourceVersionNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_VERSION_NOT);
        return this;
    }

    public void setResourceVersionNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_VERSION_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_VERSION_NOT);
        }
    }

    public boolean getResourceVersionNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_VERSION_NOT);
    }

    public SyncReplicationPlanWhereInput resourceVersionNotIn(List<Integer> resourceVersionNotIn) {

        this.resourceVersionNotIn = resourceVersionNotIn;
        return this;
    }

    public SyncReplicationPlanWhereInput addResourceVersionNotInItem(
            Integer resourceVersionNotInItem) {
        if (this.resourceVersionNotIn == null) {
            this.resourceVersionNotIn = new ArrayList<Integer>();
        }
        this.resourceVersionNotIn.add(resourceVersionNotInItem);
        return this;
    }

    /**
     * Get resourceVersionNotIn
     *
     * @return resourceVersionNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getResourceVersionNotIn() {
        return resourceVersionNotIn;
    }

    public void setResourceVersionNotIn(List<Integer> resourceVersionNotIn) {
        this.resourceVersionNotIn = resourceVersionNotIn;
    }

    public SyncReplicationPlanWhereInput resourceVersionNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_VERSION_NOT_IN);
        return this;
    }

    public SyncReplicationPlanWhereInput resourceVersionNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_VERSION_NOT_IN);
        return this;
    }

    public void setResourceVersionNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_VERSION_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_VERSION_NOT_IN);
        }
    }

    public boolean getResourceVersionNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_VERSION_NOT_IN);
    }

    public SyncReplicationPlanWhereInput snapshotConsistentType(
            ConsistentType snapshotConsistentType) {

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

    public SyncReplicationPlanWhereInput snapshotConsistentType_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT_CONSISTENT_TYPE);
        return this;
    }

    public SyncReplicationPlanWhereInput snapshotConsistentType_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput snapshotConsistentTypeIn(
            List<ConsistentType> snapshotConsistentTypeIn) {

        this.snapshotConsistentTypeIn = snapshotConsistentTypeIn;
        return this;
    }

    public SyncReplicationPlanWhereInput addSnapshotConsistentTypeInItem(
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

    public SyncReplicationPlanWhereInput snapshotConsistentTypeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT_CONSISTENT_TYPE_IN);
        return this;
    }

    public SyncReplicationPlanWhereInput snapshotConsistentTypeIn_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput snapshotConsistentTypeNot(
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

    public SyncReplicationPlanWhereInput snapshotConsistentTypeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT_CONSISTENT_TYPE_NOT);
        return this;
    }

    public SyncReplicationPlanWhereInput snapshotConsistentTypeNot_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput snapshotConsistentTypeNotIn(
            List<ConsistentType> snapshotConsistentTypeNotIn) {

        this.snapshotConsistentTypeNotIn = snapshotConsistentTypeNotIn;
        return this;
    }

    public SyncReplicationPlanWhereInput addSnapshotConsistentTypeNotInItem(
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

    public SyncReplicationPlanWhereInput snapshotConsistentTypeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT_CONSISTENT_TYPE_NOT_IN);
        return this;
    }

    public SyncReplicationPlanWhereInput snapshotConsistentTypeNotIn_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput status(BackupPlanStatus status) {

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

    public SyncReplicationPlanWhereInput status_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATUS);
        return this;
    }

    public SyncReplicationPlanWhereInput status_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput statusIn(List<BackupPlanStatus> statusIn) {

        this.statusIn = statusIn;
        return this;
    }

    public SyncReplicationPlanWhereInput addStatusInItem(BackupPlanStatus statusInItem) {
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

    public SyncReplicationPlanWhereInput statusIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATUS_IN);
        return this;
    }

    public SyncReplicationPlanWhereInput statusIn_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput statusNot(BackupPlanStatus statusNot) {

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

    public SyncReplicationPlanWhereInput statusNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATUS_NOT);
        return this;
    }

    public SyncReplicationPlanWhereInput statusNot_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput statusNotIn(List<BackupPlanStatus> statusNotIn) {

        this.statusNotIn = statusNotIn;
        return this;
    }

    public SyncReplicationPlanWhereInput addStatusNotInItem(BackupPlanStatus statusNotInItem) {
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

    public SyncReplicationPlanWhereInput statusNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATUS_NOT_IN);
        return this;
    }

    public SyncReplicationPlanWhereInput statusNotIn_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput storageEncrypted(Boolean storageEncrypted) {

        this.storageEncrypted = storageEncrypted;
        return this;
    }

    /**
     * Get storageEncrypted
     *
     * @return storageEncrypted
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getStorageEncrypted() {
        return storageEncrypted;
    }

    public void setStorageEncrypted(Boolean storageEncrypted) {
        this.storageEncrypted = storageEncrypted;
    }

    public SyncReplicationPlanWhereInput storageEncrypted_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_ENCRYPTED);
        return this;
    }

    public SyncReplicationPlanWhereInput storageEncrypted_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_ENCRYPTED);
        return this;
    }

    public void setStorageEncrypted_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_ENCRYPTED);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_ENCRYPTED);
        }
    }

    public boolean getStorageEncrypted_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_ENCRYPTED);
    }

    public SyncReplicationPlanWhereInput storageEncryptedNot(Boolean storageEncryptedNot) {

        this.storageEncryptedNot = storageEncryptedNot;
        return this;
    }

    /**
     * Get storageEncryptedNot
     *
     * @return storageEncryptedNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getStorageEncryptedNot() {
        return storageEncryptedNot;
    }

    public void setStorageEncryptedNot(Boolean storageEncryptedNot) {
        this.storageEncryptedNot = storageEncryptedNot;
    }

    public SyncReplicationPlanWhereInput storageEncryptedNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_ENCRYPTED_NOT);
        return this;
    }

    public SyncReplicationPlanWhereInput storageEncryptedNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_ENCRYPTED_NOT);
        return this;
    }

    public void setStorageEncryptedNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_ENCRYPTED_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_ENCRYPTED_NOT);
        }
    }

    public boolean getStorageEncryptedNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_ENCRYPTED_NOT);
    }

    public SyncReplicationPlanWhereInput storagePolicy(VmVolumeElfStoragePolicyType storagePolicy) {

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

    public SyncReplicationPlanWhereInput storagePolicy_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_POLICY);
        return this;
    }

    public SyncReplicationPlanWhereInput storagePolicy_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput storagePolicyIn(
            List<VmVolumeElfStoragePolicyType> storagePolicyIn) {

        this.storagePolicyIn = storagePolicyIn;
        return this;
    }

    public SyncReplicationPlanWhereInput addStoragePolicyInItem(
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

    public SyncReplicationPlanWhereInput storagePolicyIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_POLICY_IN);
        return this;
    }

    public SyncReplicationPlanWhereInput storagePolicyIn_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput storagePolicyNot(
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

    public SyncReplicationPlanWhereInput storagePolicyNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_POLICY_NOT);
        return this;
    }

    public SyncReplicationPlanWhereInput storagePolicyNot_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput storagePolicyNotIn(
            List<VmVolumeElfStoragePolicyType> storagePolicyNotIn) {

        this.storagePolicyNotIn = storagePolicyNotIn;
        return this;
    }

    public SyncReplicationPlanWhereInput addStoragePolicyNotInItem(
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

    public SyncReplicationPlanWhereInput storagePolicyNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_POLICY_NOT_IN);
        return this;
    }

    public SyncReplicationPlanWhereInput storagePolicyNotIn_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput targetCluster(ClusterWhereInput targetCluster) {

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

    public SyncReplicationPlanWhereInput targetCluster_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TARGET_CLUSTER);
        return this;
    }

    public SyncReplicationPlanWhereInput targetCluster_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput targetReplicationService(
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

    public SyncReplicationPlanWhereInput targetReplicationService_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TARGET_REPLICATION_SERVICE);
        return this;
    }

    public SyncReplicationPlanWhereInput targetReplicationService_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput thinProvision(Boolean thinProvision) {

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

    public SyncReplicationPlanWhereInput thinProvision_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_THIN_PROVISION);
        return this;
    }

    public SyncReplicationPlanWhereInput thinProvision_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput thinProvisionNot(Boolean thinProvisionNot) {

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

    public SyncReplicationPlanWhereInput thinProvisionNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_THIN_PROVISION_NOT);
        return this;
    }

    public SyncReplicationPlanWhereInput thinProvisionNot_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput type(ReplicationPlanType type) {

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

    public SyncReplicationPlanWhereInput type_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE);
        return this;
    }

    public SyncReplicationPlanWhereInput type_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput typeIn(List<ReplicationPlanType> typeIn) {

        this.typeIn = typeIn;
        return this;
    }

    public SyncReplicationPlanWhereInput addTypeInItem(ReplicationPlanType typeInItem) {
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

    public SyncReplicationPlanWhereInput typeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE_IN);
        return this;
    }

    public SyncReplicationPlanWhereInput typeIn_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput typeNot(ReplicationPlanType typeNot) {

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

    public SyncReplicationPlanWhereInput typeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE_NOT);
        return this;
    }

    public SyncReplicationPlanWhereInput typeNot_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput typeNotIn(List<ReplicationPlanType> typeNotIn) {

        this.typeNotIn = typeNotIn;
        return this;
    }

    public SyncReplicationPlanWhereInput addTypeNotInItem(ReplicationPlanType typeNotInItem) {
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

    public SyncReplicationPlanWhereInput typeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE_NOT_IN);
        return this;
    }

    public SyncReplicationPlanWhereInput typeNotIn_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput updatedAt(String updatedAt) {

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

    public SyncReplicationPlanWhereInput updatedAt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPDATED_AT);
        return this;
    }

    public SyncReplicationPlanWhereInput updatedAt_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput updatedAtGt(String updatedAtGt) {

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

    public SyncReplicationPlanWhereInput updatedAtGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPDATED_AT_GT);
        return this;
    }

    public SyncReplicationPlanWhereInput updatedAtGt_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput updatedAtGte(String updatedAtGte) {

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

    public SyncReplicationPlanWhereInput updatedAtGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPDATED_AT_GTE);
        return this;
    }

    public SyncReplicationPlanWhereInput updatedAtGte_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput updatedAtIn(List<String> updatedAtIn) {

        this.updatedAtIn = updatedAtIn;
        return this;
    }

    public SyncReplicationPlanWhereInput addUpdatedAtInItem(String updatedAtInItem) {
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

    public SyncReplicationPlanWhereInput updatedAtIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPDATED_AT_IN);
        return this;
    }

    public SyncReplicationPlanWhereInput updatedAtIn_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput updatedAtLt(String updatedAtLt) {

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

    public SyncReplicationPlanWhereInput updatedAtLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPDATED_AT_LT);
        return this;
    }

    public SyncReplicationPlanWhereInput updatedAtLt_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput updatedAtLte(String updatedAtLte) {

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

    public SyncReplicationPlanWhereInput updatedAtLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPDATED_AT_LTE);
        return this;
    }

    public SyncReplicationPlanWhereInput updatedAtLte_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput updatedAtNot(String updatedAtNot) {

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

    public SyncReplicationPlanWhereInput updatedAtNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPDATED_AT_NOT);
        return this;
    }

    public SyncReplicationPlanWhereInput updatedAtNot_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput updatedAtNotIn(List<String> updatedAtNotIn) {

        this.updatedAtNotIn = updatedAtNotIn;
        return this;
    }

    public SyncReplicationPlanWhereInput addUpdatedAtNotInItem(String updatedAtNotInItem) {
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

    public SyncReplicationPlanWhereInput updatedAtNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPDATED_AT_NOT_IN);
        return this;
    }

    public SyncReplicationPlanWhereInput updatedAtNotIn_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput vmsEvery(VmWhereInput vmsEvery) {

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

    public SyncReplicationPlanWhereInput vmsEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VMS_EVERY);
        return this;
    }

    public SyncReplicationPlanWhereInput vmsEvery_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput vmsNone(VmWhereInput vmsNone) {

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

    public SyncReplicationPlanWhereInput vmsNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VMS_NONE);
        return this;
    }

    public SyncReplicationPlanWhereInput vmsNone_ExplictlyNonNull() {
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

    public SyncReplicationPlanWhereInput vmsSome(VmWhereInput vmsSome) {

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

    public SyncReplicationPlanWhereInput vmsSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VMS_SOME);
        return this;
    }

    public SyncReplicationPlanWhereInput vmsSome_ExplictlyNonNull() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SyncReplicationPlanWhereInput syncReplicationPlanWhereInput =
                (SyncReplicationPlanWhereInput) o;
        return Objects.equals(this.AND, syncReplicationPlanWhereInput.AND)
                && Objects.equals(this.NOT, syncReplicationPlanWhereInput.NOT)
                && Objects.equals(this.OR, syncReplicationPlanWhereInput.OR)
                && Objects.equals(
                        this.activationTimestamp, syncReplicationPlanWhereInput.activationTimestamp)
                && Objects.equals(
                        this.activationTimestampGt,
                        syncReplicationPlanWhereInput.activationTimestampGt)
                && Objects.equals(
                        this.activationTimestampGte,
                        syncReplicationPlanWhereInput.activationTimestampGte)
                && Objects.equals(
                        this.activationTimestampIn,
                        syncReplicationPlanWhereInput.activationTimestampIn)
                && Objects.equals(
                        this.activationTimestampLt,
                        syncReplicationPlanWhereInput.activationTimestampLt)
                && Objects.equals(
                        this.activationTimestampLte,
                        syncReplicationPlanWhereInput.activationTimestampLte)
                && Objects.equals(
                        this.activationTimestampNot,
                        syncReplicationPlanWhereInput.activationTimestampNot)
                && Objects.equals(
                        this.activationTimestampNotIn,
                        syncReplicationPlanWhereInput.activationTimestampNotIn)
                && Objects.equals(this.compression, syncReplicationPlanWhereInput.compression)
                && Objects.equals(this.compressionNot, syncReplicationPlanWhereInput.compressionNot)
                && Objects.equals(this.createdAt, syncReplicationPlanWhereInput.createdAt)
                && Objects.equals(this.createdAtGt, syncReplicationPlanWhereInput.createdAtGt)
                && Objects.equals(this.createdAtGte, syncReplicationPlanWhereInput.createdAtGte)
                && Objects.equals(this.createdAtIn, syncReplicationPlanWhereInput.createdAtIn)
                && Objects.equals(this.createdAtLt, syncReplicationPlanWhereInput.createdAtLt)
                && Objects.equals(this.createdAtLte, syncReplicationPlanWhereInput.createdAtLte)
                && Objects.equals(this.createdAtNot, syncReplicationPlanWhereInput.createdAtNot)
                && Objects.equals(this.createdAtNotIn, syncReplicationPlanWhereInput.createdAtNotIn)
                && Objects.equals(this.dataVersion, syncReplicationPlanWhereInput.dataVersion)
                && Objects.equals(this.dataVersionGt, syncReplicationPlanWhereInput.dataVersionGt)
                && Objects.equals(this.dataVersionGte, syncReplicationPlanWhereInput.dataVersionGte)
                && Objects.equals(this.dataVersionIn, syncReplicationPlanWhereInput.dataVersionIn)
                && Objects.equals(this.dataVersionLt, syncReplicationPlanWhereInput.dataVersionLt)
                && Objects.equals(this.dataVersionLte, syncReplicationPlanWhereInput.dataVersionLte)
                && Objects.equals(this.dataVersionNot, syncReplicationPlanWhereInput.dataVersionNot)
                && Objects.equals(
                        this.dataVersionNotIn, syncReplicationPlanWhereInput.dataVersionNotIn)
                && Objects.equals(this.deleteStrategy, syncReplicationPlanWhereInput.deleteStrategy)
                && Objects.equals(
                        this.deleteStrategyIn, syncReplicationPlanWhereInput.deleteStrategyIn)
                && Objects.equals(
                        this.deleteStrategyNot, syncReplicationPlanWhereInput.deleteStrategyNot)
                && Objects.equals(
                        this.deleteStrategyNotIn, syncReplicationPlanWhereInput.deleteStrategyNotIn)
                && Objects.equals(this.description, syncReplicationPlanWhereInput.description)
                && Objects.equals(
                        this.descriptionContains, syncReplicationPlanWhereInput.descriptionContains)
                && Objects.equals(
                        this.descriptionEndsWith, syncReplicationPlanWhereInput.descriptionEndsWith)
                && Objects.equals(this.descriptionGt, syncReplicationPlanWhereInput.descriptionGt)
                && Objects.equals(this.descriptionGte, syncReplicationPlanWhereInput.descriptionGte)
                && Objects.equals(this.descriptionIn, syncReplicationPlanWhereInput.descriptionIn)
                && Objects.equals(this.descriptionLt, syncReplicationPlanWhereInput.descriptionLt)
                && Objects.equals(this.descriptionLte, syncReplicationPlanWhereInput.descriptionLte)
                && Objects.equals(this.descriptionNot, syncReplicationPlanWhereInput.descriptionNot)
                && Objects.equals(
                        this.descriptionNotContains,
                        syncReplicationPlanWhereInput.descriptionNotContains)
                && Objects.equals(
                        this.descriptionNotEndsWith,
                        syncReplicationPlanWhereInput.descriptionNotEndsWith)
                && Objects.equals(
                        this.descriptionNotIn, syncReplicationPlanWhereInput.descriptionNotIn)
                && Objects.equals(
                        this.descriptionNotStartsWith,
                        syncReplicationPlanWhereInput.descriptionNotStartsWith)
                && Objects.equals(
                        this.descriptionStartsWith,
                        syncReplicationPlanWhereInput.descriptionStartsWith)
                && Objects.equals(this.ecK, syncReplicationPlanWhereInput.ecK)
                && Objects.equals(this.ecKGt, syncReplicationPlanWhereInput.ecKGt)
                && Objects.equals(this.ecKGte, syncReplicationPlanWhereInput.ecKGte)
                && Objects.equals(this.ecKIn, syncReplicationPlanWhereInput.ecKIn)
                && Objects.equals(this.ecKLt, syncReplicationPlanWhereInput.ecKLt)
                && Objects.equals(this.ecKLte, syncReplicationPlanWhereInput.ecKLte)
                && Objects.equals(this.ecKNot, syncReplicationPlanWhereInput.ecKNot)
                && Objects.equals(this.ecKNotIn, syncReplicationPlanWhereInput.ecKNotIn)
                && Objects.equals(this.ecM, syncReplicationPlanWhereInput.ecM)
                && Objects.equals(this.ecMGt, syncReplicationPlanWhereInput.ecMGt)
                && Objects.equals(this.ecMGte, syncReplicationPlanWhereInput.ecMGte)
                && Objects.equals(this.ecMIn, syncReplicationPlanWhereInput.ecMIn)
                && Objects.equals(this.ecMLt, syncReplicationPlanWhereInput.ecMLt)
                && Objects.equals(this.ecMLte, syncReplicationPlanWhereInput.ecMLte)
                && Objects.equals(this.ecMNot, syncReplicationPlanWhereInput.ecMNot)
                && Objects.equals(this.ecMNotIn, syncReplicationPlanWhereInput.ecMNotIn)
                && Objects.equals(
                        this.entityAsyncStatus, syncReplicationPlanWhereInput.entityAsyncStatus)
                && Objects.equals(
                        this.entityAsyncStatusIn, syncReplicationPlanWhereInput.entityAsyncStatusIn)
                && Objects.equals(
                        this.entityAsyncStatusNot,
                        syncReplicationPlanWhereInput.entityAsyncStatusNot)
                && Objects.equals(
                        this.entityAsyncStatusNotIn,
                        syncReplicationPlanWhereInput.entityAsyncStatusNotIn)
                && Objects.equals(
                        this.failoverTestKeepMacAddress,
                        syncReplicationPlanWhereInput.failoverTestKeepMacAddress)
                && Objects.equals(
                        this.failoverTestKeepMacAddressNot,
                        syncReplicationPlanWhereInput.failoverTestKeepMacAddressNot)
                && Objects.equals(
                        this.failoverTestNameRule,
                        syncReplicationPlanWhereInput.failoverTestNameRule)
                && Objects.equals(
                        this.failoverTestNameRuleIn,
                        syncReplicationPlanWhereInput.failoverTestNameRuleIn)
                && Objects.equals(
                        this.failoverTestNameRuleNot,
                        syncReplicationPlanWhereInput.failoverTestNameRuleNot)
                && Objects.equals(
                        this.failoverTestNameRuleNotIn,
                        syncReplicationPlanWhereInput.failoverTestNameRuleNotIn)
                && Objects.equals(
                        this.failoverTestNameSetting,
                        syncReplicationPlanWhereInput.failoverTestNameSetting)
                && Objects.equals(
                        this.failoverTestNameSettingContains,
                        syncReplicationPlanWhereInput.failoverTestNameSettingContains)
                && Objects.equals(
                        this.failoverTestNameSettingEndsWith,
                        syncReplicationPlanWhereInput.failoverTestNameSettingEndsWith)
                && Objects.equals(
                        this.failoverTestNameSettingGt,
                        syncReplicationPlanWhereInput.failoverTestNameSettingGt)
                && Objects.equals(
                        this.failoverTestNameSettingGte,
                        syncReplicationPlanWhereInput.failoverTestNameSettingGte)
                && Objects.equals(
                        this.failoverTestNameSettingIn,
                        syncReplicationPlanWhereInput.failoverTestNameSettingIn)
                && Objects.equals(
                        this.failoverTestNameSettingLt,
                        syncReplicationPlanWhereInput.failoverTestNameSettingLt)
                && Objects.equals(
                        this.failoverTestNameSettingLte,
                        syncReplicationPlanWhereInput.failoverTestNameSettingLte)
                && Objects.equals(
                        this.failoverTestNameSettingNot,
                        syncReplicationPlanWhereInput.failoverTestNameSettingNot)
                && Objects.equals(
                        this.failoverTestNameSettingNotContains,
                        syncReplicationPlanWhereInput.failoverTestNameSettingNotContains)
                && Objects.equals(
                        this.failoverTestNameSettingNotEndsWith,
                        syncReplicationPlanWhereInput.failoverTestNameSettingNotEndsWith)
                && Objects.equals(
                        this.failoverTestNameSettingNotIn,
                        syncReplicationPlanWhereInput.failoverTestNameSettingNotIn)
                && Objects.equals(
                        this.failoverTestNameSettingNotStartsWith,
                        syncReplicationPlanWhereInput.failoverTestNameSettingNotStartsWith)
                && Objects.equals(
                        this.failoverTestNameSettingStartsWith,
                        syncReplicationPlanWhereInput.failoverTestNameSettingStartsWith)
                && Objects.equals(this.id, syncReplicationPlanWhereInput.id)
                && Objects.equals(this.idContains, syncReplicationPlanWhereInput.idContains)
                && Objects.equals(this.idEndsWith, syncReplicationPlanWhereInput.idEndsWith)
                && Objects.equals(this.idGt, syncReplicationPlanWhereInput.idGt)
                && Objects.equals(this.idGte, syncReplicationPlanWhereInput.idGte)
                && Objects.equals(this.idIn, syncReplicationPlanWhereInput.idIn)
                && Objects.equals(this.idLt, syncReplicationPlanWhereInput.idLt)
                && Objects.equals(this.idLte, syncReplicationPlanWhereInput.idLte)
                && Objects.equals(this.idNot, syncReplicationPlanWhereInput.idNot)
                && Objects.equals(this.idNotContains, syncReplicationPlanWhereInput.idNotContains)
                && Objects.equals(this.idNotEndsWith, syncReplicationPlanWhereInput.idNotEndsWith)
                && Objects.equals(this.idNotIn, syncReplicationPlanWhereInput.idNotIn)
                && Objects.equals(
                        this.idNotStartsWith, syncReplicationPlanWhereInput.idNotStartsWith)
                && Objects.equals(this.idStartsWith, syncReplicationPlanWhereInput.idStartsWith)
                && Objects.equals(this.inbound, syncReplicationPlanWhereInput.inbound)
                && Objects.equals(this.inboundNot, syncReplicationPlanWhereInput.inboundNot)
                && Objects.equals(
                        this.initializationTimePoint,
                        syncReplicationPlanWhereInput.initializationTimePoint)
                && Objects.equals(
                        this.initializationTimePointContains,
                        syncReplicationPlanWhereInput.initializationTimePointContains)
                && Objects.equals(
                        this.initializationTimePointEndsWith,
                        syncReplicationPlanWhereInput.initializationTimePointEndsWith)
                && Objects.equals(
                        this.initializationTimePointGt,
                        syncReplicationPlanWhereInput.initializationTimePointGt)
                && Objects.equals(
                        this.initializationTimePointGte,
                        syncReplicationPlanWhereInput.initializationTimePointGte)
                && Objects.equals(
                        this.initializationTimePointIn,
                        syncReplicationPlanWhereInput.initializationTimePointIn)
                && Objects.equals(
                        this.initializationTimePointLt,
                        syncReplicationPlanWhereInput.initializationTimePointLt)
                && Objects.equals(
                        this.initializationTimePointLte,
                        syncReplicationPlanWhereInput.initializationTimePointLte)
                && Objects.equals(
                        this.initializationTimePointNot,
                        syncReplicationPlanWhereInput.initializationTimePointNot)
                && Objects.equals(
                        this.initializationTimePointNotContains,
                        syncReplicationPlanWhereInput.initializationTimePointNotContains)
                && Objects.equals(
                        this.initializationTimePointNotEndsWith,
                        syncReplicationPlanWhereInput.initializationTimePointNotEndsWith)
                && Objects.equals(
                        this.initializationTimePointNotIn,
                        syncReplicationPlanWhereInput.initializationTimePointNotIn)
                && Objects.equals(
                        this.initializationTimePointNotStartsWith,
                        syncReplicationPlanWhereInput.initializationTimePointNotStartsWith)
                && Objects.equals(
                        this.initializationTimePointStartsWith,
                        syncReplicationPlanWhereInput.initializationTimePointStartsWith)
                && Objects.equals(this.interval, syncReplicationPlanWhereInput.interval)
                && Objects.equals(this.intervalGt, syncReplicationPlanWhereInput.intervalGt)
                && Objects.equals(this.intervalGte, syncReplicationPlanWhereInput.intervalGte)
                && Objects.equals(this.intervalIn, syncReplicationPlanWhereInput.intervalIn)
                && Objects.equals(this.intervalLt, syncReplicationPlanWhereInput.intervalLt)
                && Objects.equals(this.intervalLte, syncReplicationPlanWhereInput.intervalLte)
                && Objects.equals(this.intervalNot, syncReplicationPlanWhereInput.intervalNot)
                && Objects.equals(this.intervalNotIn, syncReplicationPlanWhereInput.intervalNotIn)
                && Objects.equals(this.keepMacAddress, syncReplicationPlanWhereInput.keepMacAddress)
                && Objects.equals(
                        this.keepMacAddressNot, syncReplicationPlanWhereInput.keepMacAddressNot)
                && Objects.equals(this.keepPolicy, syncReplicationPlanWhereInput.keepPolicy)
                && Objects.equals(this.keepPolicyIn, syncReplicationPlanWhereInput.keepPolicyIn)
                && Objects.equals(this.keepPolicyNot, syncReplicationPlanWhereInput.keepPolicyNot)
                && Objects.equals(
                        this.keepPolicyNotIn, syncReplicationPlanWhereInput.keepPolicyNotIn)
                && Objects.equals(
                        this.keepPolicyValue, syncReplicationPlanWhereInput.keepPolicyValue)
                && Objects.equals(
                        this.keepPolicyValueGt, syncReplicationPlanWhereInput.keepPolicyValueGt)
                && Objects.equals(
                        this.keepPolicyValueGte, syncReplicationPlanWhereInput.keepPolicyValueGte)
                && Objects.equals(
                        this.keepPolicyValueIn, syncReplicationPlanWhereInput.keepPolicyValueIn)
                && Objects.equals(
                        this.keepPolicyValueLt, syncReplicationPlanWhereInput.keepPolicyValueLt)
                && Objects.equals(
                        this.keepPolicyValueLte, syncReplicationPlanWhereInput.keepPolicyValueLte)
                && Objects.equals(
                        this.keepPolicyValueNot, syncReplicationPlanWhereInput.keepPolicyValueNot)
                && Objects.equals(
                        this.keepPolicyValueNotIn,
                        syncReplicationPlanWhereInput.keepPolicyValueNotIn)
                && Objects.equals(this.name, syncReplicationPlanWhereInput.name)
                && Objects.equals(this.nameContains, syncReplicationPlanWhereInput.nameContains)
                && Objects.equals(this.nameEndsWith, syncReplicationPlanWhereInput.nameEndsWith)
                && Objects.equals(this.nameGt, syncReplicationPlanWhereInput.nameGt)
                && Objects.equals(this.nameGte, syncReplicationPlanWhereInput.nameGte)
                && Objects.equals(this.nameIn, syncReplicationPlanWhereInput.nameIn)
                && Objects.equals(this.nameLt, syncReplicationPlanWhereInput.nameLt)
                && Objects.equals(this.nameLte, syncReplicationPlanWhereInput.nameLte)
                && Objects.equals(this.nameNot, syncReplicationPlanWhereInput.nameNot)
                && Objects.equals(
                        this.nameNotContains, syncReplicationPlanWhereInput.nameNotContains)
                && Objects.equals(
                        this.nameNotEndsWith, syncReplicationPlanWhereInput.nameNotEndsWith)
                && Objects.equals(this.nameNotIn, syncReplicationPlanWhereInput.nameNotIn)
                && Objects.equals(
                        this.nameNotStartsWith, syncReplicationPlanWhereInput.nameNotStartsWith)
                && Objects.equals(this.nameStartsWith, syncReplicationPlanWhereInput.nameStartsWith)
                && Objects.equals(this.period, syncReplicationPlanWhereInput.period)
                && Objects.equals(this.periodIn, syncReplicationPlanWhereInput.periodIn)
                && Objects.equals(this.periodNot, syncReplicationPlanWhereInput.periodNot)
                && Objects.equals(this.periodNotIn, syncReplicationPlanWhereInput.periodNotIn)
                && Objects.equals(this.phase, syncReplicationPlanWhereInput.phase)
                && Objects.equals(this.phaseIn, syncReplicationPlanWhereInput.phaseIn)
                && Objects.equals(this.phaseNot, syncReplicationPlanWhereInput.phaseNot)
                && Objects.equals(this.phaseNotIn, syncReplicationPlanWhereInput.phaseNotIn)
                && Objects.equals(
                        this.replicaNameRule, syncReplicationPlanWhereInput.replicaNameRule)
                && Objects.equals(
                        this.replicaNameRuleIn, syncReplicationPlanWhereInput.replicaNameRuleIn)
                && Objects.equals(
                        this.replicaNameRuleNot, syncReplicationPlanWhereInput.replicaNameRuleNot)
                && Objects.equals(
                        this.replicaNameRuleNotIn,
                        syncReplicationPlanWhereInput.replicaNameRuleNotIn)
                && Objects.equals(
                        this.replicaNameSetting, syncReplicationPlanWhereInput.replicaNameSetting)
                && Objects.equals(
                        this.replicaNameSettingContains,
                        syncReplicationPlanWhereInput.replicaNameSettingContains)
                && Objects.equals(
                        this.replicaNameSettingEndsWith,
                        syncReplicationPlanWhereInput.replicaNameSettingEndsWith)
                && Objects.equals(
                        this.replicaNameSettingGt,
                        syncReplicationPlanWhereInput.replicaNameSettingGt)
                && Objects.equals(
                        this.replicaNameSettingGte,
                        syncReplicationPlanWhereInput.replicaNameSettingGte)
                && Objects.equals(
                        this.replicaNameSettingIn,
                        syncReplicationPlanWhereInput.replicaNameSettingIn)
                && Objects.equals(
                        this.replicaNameSettingLt,
                        syncReplicationPlanWhereInput.replicaNameSettingLt)
                && Objects.equals(
                        this.replicaNameSettingLte,
                        syncReplicationPlanWhereInput.replicaNameSettingLte)
                && Objects.equals(
                        this.replicaNameSettingNot,
                        syncReplicationPlanWhereInput.replicaNameSettingNot)
                && Objects.equals(
                        this.replicaNameSettingNotContains,
                        syncReplicationPlanWhereInput.replicaNameSettingNotContains)
                && Objects.equals(
                        this.replicaNameSettingNotEndsWith,
                        syncReplicationPlanWhereInput.replicaNameSettingNotEndsWith)
                && Objects.equals(
                        this.replicaNameSettingNotIn,
                        syncReplicationPlanWhereInput.replicaNameSettingNotIn)
                && Objects.equals(
                        this.replicaNameSettingNotStartsWith,
                        syncReplicationPlanWhereInput.replicaNameSettingNotStartsWith)
                && Objects.equals(
                        this.replicaNameSettingStartsWith,
                        syncReplicationPlanWhereInput.replicaNameSettingStartsWith)
                && Objects.equals(this.replicaNum, syncReplicationPlanWhereInput.replicaNum)
                && Objects.equals(this.replicaNumGt, syncReplicationPlanWhereInput.replicaNumGt)
                && Objects.equals(this.replicaNumGte, syncReplicationPlanWhereInput.replicaNumGte)
                && Objects.equals(this.replicaNumIn, syncReplicationPlanWhereInput.replicaNumIn)
                && Objects.equals(this.replicaNumLt, syncReplicationPlanWhereInput.replicaNumLt)
                && Objects.equals(this.replicaNumLte, syncReplicationPlanWhereInput.replicaNumLte)
                && Objects.equals(this.replicaNumNot, syncReplicationPlanWhereInput.replicaNumNot)
                && Objects.equals(
                        this.replicaNumNotIn, syncReplicationPlanWhereInput.replicaNumNotIn)
                && Objects.equals(
                        this.replicaVmsEvery, syncReplicationPlanWhereInput.replicaVmsEvery)
                && Objects.equals(this.replicaVmsNone, syncReplicationPlanWhereInput.replicaVmsNone)
                && Objects.equals(this.replicaVmsSome, syncReplicationPlanWhereInput.replicaVmsSome)
                && Objects.equals(this.resiliencyType, syncReplicationPlanWhereInput.resiliencyType)
                && Objects.equals(
                        this.resiliencyTypeIn, syncReplicationPlanWhereInput.resiliencyTypeIn)
                && Objects.equals(
                        this.resiliencyTypeNot, syncReplicationPlanWhereInput.resiliencyTypeNot)
                && Objects.equals(
                        this.resiliencyTypeNotIn, syncReplicationPlanWhereInput.resiliencyTypeNotIn)
                && Objects.equals(
                        this.resourceVersion, syncReplicationPlanWhereInput.resourceVersion)
                && Objects.equals(
                        this.resourceVersionGt, syncReplicationPlanWhereInput.resourceVersionGt)
                && Objects.equals(
                        this.resourceVersionGte, syncReplicationPlanWhereInput.resourceVersionGte)
                && Objects.equals(
                        this.resourceVersionIn, syncReplicationPlanWhereInput.resourceVersionIn)
                && Objects.equals(
                        this.resourceVersionLt, syncReplicationPlanWhereInput.resourceVersionLt)
                && Objects.equals(
                        this.resourceVersionLte, syncReplicationPlanWhereInput.resourceVersionLte)
                && Objects.equals(
                        this.resourceVersionNot, syncReplicationPlanWhereInput.resourceVersionNot)
                && Objects.equals(
                        this.resourceVersionNotIn,
                        syncReplicationPlanWhereInput.resourceVersionNotIn)
                && Objects.equals(
                        this.snapshotConsistentType,
                        syncReplicationPlanWhereInput.snapshotConsistentType)
                && Objects.equals(
                        this.snapshotConsistentTypeIn,
                        syncReplicationPlanWhereInput.snapshotConsistentTypeIn)
                && Objects.equals(
                        this.snapshotConsistentTypeNot,
                        syncReplicationPlanWhereInput.snapshotConsistentTypeNot)
                && Objects.equals(
                        this.snapshotConsistentTypeNotIn,
                        syncReplicationPlanWhereInput.snapshotConsistentTypeNotIn)
                && Objects.equals(this.status, syncReplicationPlanWhereInput.status)
                && Objects.equals(this.statusIn, syncReplicationPlanWhereInput.statusIn)
                && Objects.equals(this.statusNot, syncReplicationPlanWhereInput.statusNot)
                && Objects.equals(this.statusNotIn, syncReplicationPlanWhereInput.statusNotIn)
                && Objects.equals(
                        this.storageEncrypted, syncReplicationPlanWhereInput.storageEncrypted)
                && Objects.equals(
                        this.storageEncryptedNot, syncReplicationPlanWhereInput.storageEncryptedNot)
                && Objects.equals(this.storagePolicy, syncReplicationPlanWhereInput.storagePolicy)
                && Objects.equals(
                        this.storagePolicyIn, syncReplicationPlanWhereInput.storagePolicyIn)
                && Objects.equals(
                        this.storagePolicyNot, syncReplicationPlanWhereInput.storagePolicyNot)
                && Objects.equals(
                        this.storagePolicyNotIn, syncReplicationPlanWhereInput.storagePolicyNotIn)
                && Objects.equals(this.targetCluster, syncReplicationPlanWhereInput.targetCluster)
                && Objects.equals(
                        this.targetReplicationService,
                        syncReplicationPlanWhereInput.targetReplicationService)
                && Objects.equals(this.thinProvision, syncReplicationPlanWhereInput.thinProvision)
                && Objects.equals(
                        this.thinProvisionNot, syncReplicationPlanWhereInput.thinProvisionNot)
                && Objects.equals(this.type, syncReplicationPlanWhereInput.type)
                && Objects.equals(this.typeIn, syncReplicationPlanWhereInput.typeIn)
                && Objects.equals(this.typeNot, syncReplicationPlanWhereInput.typeNot)
                && Objects.equals(this.typeNotIn, syncReplicationPlanWhereInput.typeNotIn)
                && Objects.equals(this.updatedAt, syncReplicationPlanWhereInput.updatedAt)
                && Objects.equals(this.updatedAtGt, syncReplicationPlanWhereInput.updatedAtGt)
                && Objects.equals(this.updatedAtGte, syncReplicationPlanWhereInput.updatedAtGte)
                && Objects.equals(this.updatedAtIn, syncReplicationPlanWhereInput.updatedAtIn)
                && Objects.equals(this.updatedAtLt, syncReplicationPlanWhereInput.updatedAtLt)
                && Objects.equals(this.updatedAtLte, syncReplicationPlanWhereInput.updatedAtLte)
                && Objects.equals(this.updatedAtNot, syncReplicationPlanWhereInput.updatedAtNot)
                && Objects.equals(this.updatedAtNotIn, syncReplicationPlanWhereInput.updatedAtNotIn)
                && Objects.equals(this.vmsEvery, syncReplicationPlanWhereInput.vmsEvery)
                && Objects.equals(this.vmsNone, syncReplicationPlanWhereInput.vmsNone)
                && Objects.equals(this.vmsSome, syncReplicationPlanWhereInput.vmsSome);
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
                dataVersion,
                dataVersionGt,
                dataVersionGte,
                dataVersionIn,
                dataVersionLt,
                dataVersionLte,
                dataVersionNot,
                dataVersionNotIn,
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
                entityAsyncStatus,
                entityAsyncStatusIn,
                entityAsyncStatusNot,
                entityAsyncStatusNotIn,
                failoverTestKeepMacAddress,
                failoverTestKeepMacAddressNot,
                failoverTestNameRule,
                failoverTestNameRuleIn,
                failoverTestNameRuleNot,
                failoverTestNameRuleNotIn,
                failoverTestNameSetting,
                failoverTestNameSettingContains,
                failoverTestNameSettingEndsWith,
                failoverTestNameSettingGt,
                failoverTestNameSettingGte,
                failoverTestNameSettingIn,
                failoverTestNameSettingLt,
                failoverTestNameSettingLte,
                failoverTestNameSettingNot,
                failoverTestNameSettingNotContains,
                failoverTestNameSettingNotEndsWith,
                failoverTestNameSettingNotIn,
                failoverTestNameSettingNotStartsWith,
                failoverTestNameSettingStartsWith,
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
                initializationTimePoint,
                initializationTimePointContains,
                initializationTimePointEndsWith,
                initializationTimePointGt,
                initializationTimePointGte,
                initializationTimePointIn,
                initializationTimePointLt,
                initializationTimePointLte,
                initializationTimePointNot,
                initializationTimePointNotContains,
                initializationTimePointNotEndsWith,
                initializationTimePointNotIn,
                initializationTimePointNotStartsWith,
                initializationTimePointStartsWith,
                interval,
                intervalGt,
                intervalGte,
                intervalIn,
                intervalLt,
                intervalLte,
                intervalNot,
                intervalNotIn,
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
                resiliencyType,
                resiliencyTypeIn,
                resiliencyTypeNot,
                resiliencyTypeNotIn,
                resourceVersion,
                resourceVersionGt,
                resourceVersionGte,
                resourceVersionIn,
                resourceVersionLt,
                resourceVersionLte,
                resourceVersionNot,
                resourceVersionNotIn,
                snapshotConsistentType,
                snapshotConsistentTypeIn,
                snapshotConsistentTypeNot,
                snapshotConsistentTypeNotIn,
                status,
                statusIn,
                statusNot,
                statusNotIn,
                storageEncrypted,
                storageEncryptedNot,
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
                vmsSome);
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
        sb.append("class SyncReplicationPlanWhereInput {\n");
        sb.append("    AND: ").append(toIndentedString(AND)).append("\n");
        sb.append("    NOT: ").append(toIndentedString(NOT)).append("\n");
        sb.append("    OR: ").append(toIndentedString(OR)).append("\n");
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
        sb.append("    dataVersion: ").append(toIndentedString(dataVersion)).append("\n");
        sb.append("    dataVersionGt: ").append(toIndentedString(dataVersionGt)).append("\n");
        sb.append("    dataVersionGte: ").append(toIndentedString(dataVersionGte)).append("\n");
        sb.append("    dataVersionIn: ").append(toIndentedString(dataVersionIn)).append("\n");
        sb.append("    dataVersionLt: ").append(toIndentedString(dataVersionLt)).append("\n");
        sb.append("    dataVersionLte: ").append(toIndentedString(dataVersionLte)).append("\n");
        sb.append("    dataVersionNot: ").append(toIndentedString(dataVersionNot)).append("\n");
        sb.append("    dataVersionNotIn: ").append(toIndentedString(dataVersionNotIn)).append("\n");
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
        sb.append("    failoverTestKeepMacAddress: ")
                .append(toIndentedString(failoverTestKeepMacAddress))
                .append("\n");
        sb.append("    failoverTestKeepMacAddressNot: ")
                .append(toIndentedString(failoverTestKeepMacAddressNot))
                .append("\n");
        sb.append("    failoverTestNameRule: ")
                .append(toIndentedString(failoverTestNameRule))
                .append("\n");
        sb.append("    failoverTestNameRuleIn: ")
                .append(toIndentedString(failoverTestNameRuleIn))
                .append("\n");
        sb.append("    failoverTestNameRuleNot: ")
                .append(toIndentedString(failoverTestNameRuleNot))
                .append("\n");
        sb.append("    failoverTestNameRuleNotIn: ")
                .append(toIndentedString(failoverTestNameRuleNotIn))
                .append("\n");
        sb.append("    failoverTestNameSetting: ")
                .append(toIndentedString(failoverTestNameSetting))
                .append("\n");
        sb.append("    failoverTestNameSettingContains: ")
                .append(toIndentedString(failoverTestNameSettingContains))
                .append("\n");
        sb.append("    failoverTestNameSettingEndsWith: ")
                .append(toIndentedString(failoverTestNameSettingEndsWith))
                .append("\n");
        sb.append("    failoverTestNameSettingGt: ")
                .append(toIndentedString(failoverTestNameSettingGt))
                .append("\n");
        sb.append("    failoverTestNameSettingGte: ")
                .append(toIndentedString(failoverTestNameSettingGte))
                .append("\n");
        sb.append("    failoverTestNameSettingIn: ")
                .append(toIndentedString(failoverTestNameSettingIn))
                .append("\n");
        sb.append("    failoverTestNameSettingLt: ")
                .append(toIndentedString(failoverTestNameSettingLt))
                .append("\n");
        sb.append("    failoverTestNameSettingLte: ")
                .append(toIndentedString(failoverTestNameSettingLte))
                .append("\n");
        sb.append("    failoverTestNameSettingNot: ")
                .append(toIndentedString(failoverTestNameSettingNot))
                .append("\n");
        sb.append("    failoverTestNameSettingNotContains: ")
                .append(toIndentedString(failoverTestNameSettingNotContains))
                .append("\n");
        sb.append("    failoverTestNameSettingNotEndsWith: ")
                .append(toIndentedString(failoverTestNameSettingNotEndsWith))
                .append("\n");
        sb.append("    failoverTestNameSettingNotIn: ")
                .append(toIndentedString(failoverTestNameSettingNotIn))
                .append("\n");
        sb.append("    failoverTestNameSettingNotStartsWith: ")
                .append(toIndentedString(failoverTestNameSettingNotStartsWith))
                .append("\n");
        sb.append("    failoverTestNameSettingStartsWith: ")
                .append(toIndentedString(failoverTestNameSettingStartsWith))
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
        sb.append("    initializationTimePoint: ")
                .append(toIndentedString(initializationTimePoint))
                .append("\n");
        sb.append("    initializationTimePointContains: ")
                .append(toIndentedString(initializationTimePointContains))
                .append("\n");
        sb.append("    initializationTimePointEndsWith: ")
                .append(toIndentedString(initializationTimePointEndsWith))
                .append("\n");
        sb.append("    initializationTimePointGt: ")
                .append(toIndentedString(initializationTimePointGt))
                .append("\n");
        sb.append("    initializationTimePointGte: ")
                .append(toIndentedString(initializationTimePointGte))
                .append("\n");
        sb.append("    initializationTimePointIn: ")
                .append(toIndentedString(initializationTimePointIn))
                .append("\n");
        sb.append("    initializationTimePointLt: ")
                .append(toIndentedString(initializationTimePointLt))
                .append("\n");
        sb.append("    initializationTimePointLte: ")
                .append(toIndentedString(initializationTimePointLte))
                .append("\n");
        sb.append("    initializationTimePointNot: ")
                .append(toIndentedString(initializationTimePointNot))
                .append("\n");
        sb.append("    initializationTimePointNotContains: ")
                .append(toIndentedString(initializationTimePointNotContains))
                .append("\n");
        sb.append("    initializationTimePointNotEndsWith: ")
                .append(toIndentedString(initializationTimePointNotEndsWith))
                .append("\n");
        sb.append("    initializationTimePointNotIn: ")
                .append(toIndentedString(initializationTimePointNotIn))
                .append("\n");
        sb.append("    initializationTimePointNotStartsWith: ")
                .append(toIndentedString(initializationTimePointNotStartsWith))
                .append("\n");
        sb.append("    initializationTimePointStartsWith: ")
                .append(toIndentedString(initializationTimePointStartsWith))
                .append("\n");
        sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
        sb.append("    intervalGt: ").append(toIndentedString(intervalGt)).append("\n");
        sb.append("    intervalGte: ").append(toIndentedString(intervalGte)).append("\n");
        sb.append("    intervalIn: ").append(toIndentedString(intervalIn)).append("\n");
        sb.append("    intervalLt: ").append(toIndentedString(intervalLt)).append("\n");
        sb.append("    intervalLte: ").append(toIndentedString(intervalLte)).append("\n");
        sb.append("    intervalNot: ").append(toIndentedString(intervalNot)).append("\n");
        sb.append("    intervalNotIn: ").append(toIndentedString(intervalNotIn)).append("\n");
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
        sb.append("    resiliencyType: ").append(toIndentedString(resiliencyType)).append("\n");
        sb.append("    resiliencyTypeIn: ").append(toIndentedString(resiliencyTypeIn)).append("\n");
        sb.append("    resiliencyTypeNot: ")
                .append(toIndentedString(resiliencyTypeNot))
                .append("\n");
        sb.append("    resiliencyTypeNotIn: ")
                .append(toIndentedString(resiliencyTypeNotIn))
                .append("\n");
        sb.append("    resourceVersion: ").append(toIndentedString(resourceVersion)).append("\n");
        sb.append("    resourceVersionGt: ")
                .append(toIndentedString(resourceVersionGt))
                .append("\n");
        sb.append("    resourceVersionGte: ")
                .append(toIndentedString(resourceVersionGte))
                .append("\n");
        sb.append("    resourceVersionIn: ")
                .append(toIndentedString(resourceVersionIn))
                .append("\n");
        sb.append("    resourceVersionLt: ")
                .append(toIndentedString(resourceVersionLt))
                .append("\n");
        sb.append("    resourceVersionLte: ")
                .append(toIndentedString(resourceVersionLte))
                .append("\n");
        sb.append("    resourceVersionNot: ")
                .append(toIndentedString(resourceVersionNot))
                .append("\n");
        sb.append("    resourceVersionNotIn: ")
                .append(toIndentedString(resourceVersionNotIn))
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
        sb.append("    storageEncrypted: ").append(toIndentedString(storageEncrypted)).append("\n");
        sb.append("    storageEncryptedNot: ")
                .append(toIndentedString(storageEncryptedNot))
                .append("\n");
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

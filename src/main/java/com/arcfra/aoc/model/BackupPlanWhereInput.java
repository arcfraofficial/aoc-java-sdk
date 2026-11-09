package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** BackupPlanWhereInput */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class BackupPlanWhereInput
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_A_N_D = "AND";

    @SerializedName(SERIALIZED_NAME_A_N_D)
    private List<BackupPlanWhereInput> AND = null;

    public static final String SERIALIZED_NAME_N_O_T = "NOT";

    @SerializedName(SERIALIZED_NAME_N_O_T)
    private List<BackupPlanWhereInput> NOT = null;

    public static final String SERIALIZED_NAME_O_R = "OR";

    @SerializedName(SERIALIZED_NAME_O_R)
    private List<BackupPlanWhereInput> OR = null;

    public static final String SERIALIZED_NAME_BACKUP_DELAY_OPTION = "backup_delay_option";

    @SerializedName(SERIALIZED_NAME_BACKUP_DELAY_OPTION)
    private BackupPlanDelayOption backupDelayOption;

    public static final String SERIALIZED_NAME_BACKUP_DELAY_OPTION_IN = "backup_delay_option_in";

    @SerializedName(SERIALIZED_NAME_BACKUP_DELAY_OPTION_IN)
    private List<BackupPlanDelayOption> backupDelayOptionIn = null;

    public static final String SERIALIZED_NAME_BACKUP_DELAY_OPTION_NOT = "backup_delay_option_not";

    @SerializedName(SERIALIZED_NAME_BACKUP_DELAY_OPTION_NOT)
    private BackupPlanDelayOption backupDelayOptionNot;

    public static final String SERIALIZED_NAME_BACKUP_DELAY_OPTION_NOT_IN =
            "backup_delay_option_not_in";

    @SerializedName(SERIALIZED_NAME_BACKUP_DELAY_OPTION_NOT_IN)
    private List<BackupPlanDelayOption> backupDelayOptionNotIn = null;

    public static final String SERIALIZED_NAME_BACKUP_PLAN_EXECUTIONS_EVERY =
            "backup_plan_executions_every";

    @SerializedName(SERIALIZED_NAME_BACKUP_PLAN_EXECUTIONS_EVERY)
    private BackupPlanExecutionWhereInput backupPlanExecutionsEvery;

    public static final String SERIALIZED_NAME_BACKUP_PLAN_EXECUTIONS_NONE =
            "backup_plan_executions_none";

    @SerializedName(SERIALIZED_NAME_BACKUP_PLAN_EXECUTIONS_NONE)
    private BackupPlanExecutionWhereInput backupPlanExecutionsNone;

    public static final String SERIALIZED_NAME_BACKUP_PLAN_EXECUTIONS_SOME =
            "backup_plan_executions_some";

    @SerializedName(SERIALIZED_NAME_BACKUP_PLAN_EXECUTIONS_SOME)
    private BackupPlanExecutionWhereInput backupPlanExecutionsSome;

    public static final String SERIALIZED_NAME_BACKUP_RESTORE_POINT_COUNT =
            "backup_restore_point_count";

    @SerializedName(SERIALIZED_NAME_BACKUP_RESTORE_POINT_COUNT)
    private Integer backupRestorePointCount;

    public static final String SERIALIZED_NAME_BACKUP_RESTORE_POINT_COUNT_GT =
            "backup_restore_point_count_gt";

    @SerializedName(SERIALIZED_NAME_BACKUP_RESTORE_POINT_COUNT_GT)
    private Integer backupRestorePointCountGt;

    public static final String SERIALIZED_NAME_BACKUP_RESTORE_POINT_COUNT_GTE =
            "backup_restore_point_count_gte";

    @SerializedName(SERIALIZED_NAME_BACKUP_RESTORE_POINT_COUNT_GTE)
    private Integer backupRestorePointCountGte;

    public static final String SERIALIZED_NAME_BACKUP_RESTORE_POINT_COUNT_IN =
            "backup_restore_point_count_in";

    @SerializedName(SERIALIZED_NAME_BACKUP_RESTORE_POINT_COUNT_IN)
    private List<Integer> backupRestorePointCountIn = null;

    public static final String SERIALIZED_NAME_BACKUP_RESTORE_POINT_COUNT_LT =
            "backup_restore_point_count_lt";

    @SerializedName(SERIALIZED_NAME_BACKUP_RESTORE_POINT_COUNT_LT)
    private Integer backupRestorePointCountLt;

    public static final String SERIALIZED_NAME_BACKUP_RESTORE_POINT_COUNT_LTE =
            "backup_restore_point_count_lte";

    @SerializedName(SERIALIZED_NAME_BACKUP_RESTORE_POINT_COUNT_LTE)
    private Integer backupRestorePointCountLte;

    public static final String SERIALIZED_NAME_BACKUP_RESTORE_POINT_COUNT_NOT =
            "backup_restore_point_count_not";

    @SerializedName(SERIALIZED_NAME_BACKUP_RESTORE_POINT_COUNT_NOT)
    private Integer backupRestorePointCountNot;

    public static final String SERIALIZED_NAME_BACKUP_RESTORE_POINT_COUNT_NOT_IN =
            "backup_restore_point_count_not_in";

    @SerializedName(SERIALIZED_NAME_BACKUP_RESTORE_POINT_COUNT_NOT_IN)
    private List<Integer> backupRestorePointCountNotIn = null;

    public static final String SERIALIZED_NAME_BACKUP_RESTORE_POINTS_EVERY =
            "backup_restore_points_every";

    @SerializedName(SERIALIZED_NAME_BACKUP_RESTORE_POINTS_EVERY)
    private BackupRestorePointWhereInput backupRestorePointsEvery;

    public static final String SERIALIZED_NAME_BACKUP_RESTORE_POINTS_NONE =
            "backup_restore_points_none";

    @SerializedName(SERIALIZED_NAME_BACKUP_RESTORE_POINTS_NONE)
    private BackupRestorePointWhereInput backupRestorePointsNone;

    public static final String SERIALIZED_NAME_BACKUP_RESTORE_POINTS_SOME =
            "backup_restore_points_some";

    @SerializedName(SERIALIZED_NAME_BACKUP_RESTORE_POINTS_SOME)
    private BackupRestorePointWhereInput backupRestorePointsSome;

    public static final String SERIALIZED_NAME_BACKUP_SERVICE = "backup_service";

    @SerializedName(SERIALIZED_NAME_BACKUP_SERVICE)
    private BackupServiceWhereInput backupService;

    public static final String SERIALIZED_NAME_BACKUP_STORE_REPOSITORY = "backup_store_repository";

    @SerializedName(SERIALIZED_NAME_BACKUP_STORE_REPOSITORY)
    private BackupStoreRepositoryWhereInput backupStoreRepository;

    public static final String SERIALIZED_NAME_BACKUP_TOTAL_SIZE = "backup_total_size";

    @SerializedName(SERIALIZED_NAME_BACKUP_TOTAL_SIZE)
    private Long backupTotalSize;

    public static final String SERIALIZED_NAME_BACKUP_TOTAL_SIZE_GT = "backup_total_size_gt";

    @SerializedName(SERIALIZED_NAME_BACKUP_TOTAL_SIZE_GT)
    private Long backupTotalSizeGt;

    public static final String SERIALIZED_NAME_BACKUP_TOTAL_SIZE_GTE = "backup_total_size_gte";

    @SerializedName(SERIALIZED_NAME_BACKUP_TOTAL_SIZE_GTE)
    private Long backupTotalSizeGte;

    public static final String SERIALIZED_NAME_BACKUP_TOTAL_SIZE_IN = "backup_total_size_in";

    @SerializedName(SERIALIZED_NAME_BACKUP_TOTAL_SIZE_IN)
    private List<Long> backupTotalSizeIn = null;

    public static final String SERIALIZED_NAME_BACKUP_TOTAL_SIZE_LT = "backup_total_size_lt";

    @SerializedName(SERIALIZED_NAME_BACKUP_TOTAL_SIZE_LT)
    private Long backupTotalSizeLt;

    public static final String SERIALIZED_NAME_BACKUP_TOTAL_SIZE_LTE = "backup_total_size_lte";

    @SerializedName(SERIALIZED_NAME_BACKUP_TOTAL_SIZE_LTE)
    private Long backupTotalSizeLte;

    public static final String SERIALIZED_NAME_BACKUP_TOTAL_SIZE_NOT = "backup_total_size_not";

    @SerializedName(SERIALIZED_NAME_BACKUP_TOTAL_SIZE_NOT)
    private Long backupTotalSizeNot;

    public static final String SERIALIZED_NAME_BACKUP_TOTAL_SIZE_NOT_IN =
            "backup_total_size_not_in";

    @SerializedName(SERIALIZED_NAME_BACKUP_TOTAL_SIZE_NOT_IN)
    private List<Long> backupTotalSizeNotIn = null;

    public static final String SERIALIZED_NAME_COMPRESSION = "compression";

    @SerializedName(SERIALIZED_NAME_COMPRESSION)
    private Boolean compression;

    public static final String SERIALIZED_NAME_COMPRESSION_NOT = "compression_not";

    @SerializedName(SERIALIZED_NAME_COMPRESSION_NOT)
    private Boolean compressionNot;

    public static final String SERIALIZED_NAME_COMPRESSION_RATIO = "compression_ratio";

    @SerializedName(SERIALIZED_NAME_COMPRESSION_RATIO)
    private Double compressionRatio;

    public static final String SERIALIZED_NAME_COMPRESSION_RATIO_GT = "compression_ratio_gt";

    @SerializedName(SERIALIZED_NAME_COMPRESSION_RATIO_GT)
    private Double compressionRatioGt;

    public static final String SERIALIZED_NAME_COMPRESSION_RATIO_GTE = "compression_ratio_gte";

    @SerializedName(SERIALIZED_NAME_COMPRESSION_RATIO_GTE)
    private Double compressionRatioGte;

    public static final String SERIALIZED_NAME_COMPRESSION_RATIO_IN = "compression_ratio_in";

    @SerializedName(SERIALIZED_NAME_COMPRESSION_RATIO_IN)
    private List<Double> compressionRatioIn = null;

    public static final String SERIALIZED_NAME_COMPRESSION_RATIO_LT = "compression_ratio_lt";

    @SerializedName(SERIALIZED_NAME_COMPRESSION_RATIO_LT)
    private Double compressionRatioLt;

    public static final String SERIALIZED_NAME_COMPRESSION_RATIO_LTE = "compression_ratio_lte";

    @SerializedName(SERIALIZED_NAME_COMPRESSION_RATIO_LTE)
    private Double compressionRatioLte;

    public static final String SERIALIZED_NAME_COMPRESSION_RATIO_NOT = "compression_ratio_not";

    @SerializedName(SERIALIZED_NAME_COMPRESSION_RATIO_NOT)
    private Double compressionRatioNot;

    public static final String SERIALIZED_NAME_COMPRESSION_RATIO_NOT_IN =
            "compression_ratio_not_in";

    @SerializedName(SERIALIZED_NAME_COMPRESSION_RATIO_NOT_IN)
    private List<Double> compressionRatioNotIn = null;

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

    public static final String SERIALIZED_NAME_FULL_INTERVAL = "full_interval";

    @SerializedName(SERIALIZED_NAME_FULL_INTERVAL)
    private Integer fullInterval;

    public static final String SERIALIZED_NAME_FULL_INTERVAL_GT = "full_interval_gt";

    @SerializedName(SERIALIZED_NAME_FULL_INTERVAL_GT)
    private Integer fullIntervalGt;

    public static final String SERIALIZED_NAME_FULL_INTERVAL_GTE = "full_interval_gte";

    @SerializedName(SERIALIZED_NAME_FULL_INTERVAL_GTE)
    private Integer fullIntervalGte;

    public static final String SERIALIZED_NAME_FULL_INTERVAL_IN = "full_interval_in";

    @SerializedName(SERIALIZED_NAME_FULL_INTERVAL_IN)
    private List<Integer> fullIntervalIn = null;

    public static final String SERIALIZED_NAME_FULL_INTERVAL_LT = "full_interval_lt";

    @SerializedName(SERIALIZED_NAME_FULL_INTERVAL_LT)
    private Integer fullIntervalLt;

    public static final String SERIALIZED_NAME_FULL_INTERVAL_LTE = "full_interval_lte";

    @SerializedName(SERIALIZED_NAME_FULL_INTERVAL_LTE)
    private Integer fullIntervalLte;

    public static final String SERIALIZED_NAME_FULL_INTERVAL_NOT = "full_interval_not";

    @SerializedName(SERIALIZED_NAME_FULL_INTERVAL_NOT)
    private Integer fullIntervalNot;

    public static final String SERIALIZED_NAME_FULL_INTERVAL_NOT_IN = "full_interval_not_in";

    @SerializedName(SERIALIZED_NAME_FULL_INTERVAL_NOT_IN)
    private List<Integer> fullIntervalNotIn = null;

    public static final String SERIALIZED_NAME_FULL_PERIOD = "full_period";

    @SerializedName(SERIALIZED_NAME_FULL_PERIOD)
    private BackupPlanPeriod fullPeriod;

    public static final String SERIALIZED_NAME_FULL_PERIOD_IN = "full_period_in";

    @SerializedName(SERIALIZED_NAME_FULL_PERIOD_IN)
    private List<BackupPlanPeriod> fullPeriodIn = null;

    public static final String SERIALIZED_NAME_FULL_PERIOD_NOT = "full_period_not";

    @SerializedName(SERIALIZED_NAME_FULL_PERIOD_NOT)
    private BackupPlanPeriod fullPeriodNot;

    public static final String SERIALIZED_NAME_FULL_PERIOD_NOT_IN = "full_period_not_in";

    @SerializedName(SERIALIZED_NAME_FULL_PERIOD_NOT_IN)
    private List<BackupPlanPeriod> fullPeriodNotIn = null;

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

    public static final String SERIALIZED_NAME_INCREMENTAL_INTERVAL = "incremental_interval";

    @SerializedName(SERIALIZED_NAME_INCREMENTAL_INTERVAL)
    private Integer incrementalInterval;

    public static final String SERIALIZED_NAME_INCREMENTAL_INTERVAL_GT = "incremental_interval_gt";

    @SerializedName(SERIALIZED_NAME_INCREMENTAL_INTERVAL_GT)
    private Integer incrementalIntervalGt;

    public static final String SERIALIZED_NAME_INCREMENTAL_INTERVAL_GTE =
            "incremental_interval_gte";

    @SerializedName(SERIALIZED_NAME_INCREMENTAL_INTERVAL_GTE)
    private Integer incrementalIntervalGte;

    public static final String SERIALIZED_NAME_INCREMENTAL_INTERVAL_IN = "incremental_interval_in";

    @SerializedName(SERIALIZED_NAME_INCREMENTAL_INTERVAL_IN)
    private List<Integer> incrementalIntervalIn = null;

    public static final String SERIALIZED_NAME_INCREMENTAL_INTERVAL_LT = "incremental_interval_lt";

    @SerializedName(SERIALIZED_NAME_INCREMENTAL_INTERVAL_LT)
    private Integer incrementalIntervalLt;

    public static final String SERIALIZED_NAME_INCREMENTAL_INTERVAL_LTE =
            "incremental_interval_lte";

    @SerializedName(SERIALIZED_NAME_INCREMENTAL_INTERVAL_LTE)
    private Integer incrementalIntervalLte;

    public static final String SERIALIZED_NAME_INCREMENTAL_INTERVAL_NOT =
            "incremental_interval_not";

    @SerializedName(SERIALIZED_NAME_INCREMENTAL_INTERVAL_NOT)
    private Integer incrementalIntervalNot;

    public static final String SERIALIZED_NAME_INCREMENTAL_INTERVAL_NOT_IN =
            "incremental_interval_not_in";

    @SerializedName(SERIALIZED_NAME_INCREMENTAL_INTERVAL_NOT_IN)
    private List<Integer> incrementalIntervalNotIn = null;

    public static final String SERIALIZED_NAME_INCREMENTAL_PERIOD = "incremental_period";

    @SerializedName(SERIALIZED_NAME_INCREMENTAL_PERIOD)
    private BackupPlanPeriod incrementalPeriod;

    public static final String SERIALIZED_NAME_INCREMENTAL_PERIOD_IN = "incremental_period_in";

    @SerializedName(SERIALIZED_NAME_INCREMENTAL_PERIOD_IN)
    private List<BackupPlanPeriod> incrementalPeriodIn = null;

    public static final String SERIALIZED_NAME_INCREMENTAL_PERIOD_NOT = "incremental_period_not";

    @SerializedName(SERIALIZED_NAME_INCREMENTAL_PERIOD_NOT)
    private BackupPlanPeriod incrementalPeriodNot;

    public static final String SERIALIZED_NAME_INCREMENTAL_PERIOD_NOT_IN =
            "incremental_period_not_in";

    @SerializedName(SERIALIZED_NAME_INCREMENTAL_PERIOD_NOT_IN)
    private List<BackupPlanPeriod> incrementalPeriodNotIn = null;

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

    public static final String SERIALIZED_NAME_LOGICAL_SIZE = "logical_size";

    @SerializedName(SERIALIZED_NAME_LOGICAL_SIZE)
    private Long logicalSize;

    public static final String SERIALIZED_NAME_LOGICAL_SIZE_GT = "logical_size_gt";

    @SerializedName(SERIALIZED_NAME_LOGICAL_SIZE_GT)
    private Long logicalSizeGt;

    public static final String SERIALIZED_NAME_LOGICAL_SIZE_GTE = "logical_size_gte";

    @SerializedName(SERIALIZED_NAME_LOGICAL_SIZE_GTE)
    private Long logicalSizeGte;

    public static final String SERIALIZED_NAME_LOGICAL_SIZE_IN = "logical_size_in";

    @SerializedName(SERIALIZED_NAME_LOGICAL_SIZE_IN)
    private List<Long> logicalSizeIn = null;

    public static final String SERIALIZED_NAME_LOGICAL_SIZE_LT = "logical_size_lt";

    @SerializedName(SERIALIZED_NAME_LOGICAL_SIZE_LT)
    private Long logicalSizeLt;

    public static final String SERIALIZED_NAME_LOGICAL_SIZE_LTE = "logical_size_lte";

    @SerializedName(SERIALIZED_NAME_LOGICAL_SIZE_LTE)
    private Long logicalSizeLte;

    public static final String SERIALIZED_NAME_LOGICAL_SIZE_NOT = "logical_size_not";

    @SerializedName(SERIALIZED_NAME_LOGICAL_SIZE_NOT)
    private Long logicalSizeNot;

    public static final String SERIALIZED_NAME_LOGICAL_SIZE_NOT_IN = "logical_size_not_in";

    @SerializedName(SERIALIZED_NAME_LOGICAL_SIZE_NOT_IN)
    private List<Long> logicalSizeNotIn = null;

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

    public static final String SERIALIZED_NAME_NEXT_EXECUTE_TIME = "next_execute_time";

    @SerializedName(SERIALIZED_NAME_NEXT_EXECUTE_TIME)
    private String nextExecuteTime;

    public static final String SERIALIZED_NAME_NEXT_EXECUTE_TIME_GT = "next_execute_time_gt";

    @SerializedName(SERIALIZED_NAME_NEXT_EXECUTE_TIME_GT)
    private String nextExecuteTimeGt;

    public static final String SERIALIZED_NAME_NEXT_EXECUTE_TIME_GTE = "next_execute_time_gte";

    @SerializedName(SERIALIZED_NAME_NEXT_EXECUTE_TIME_GTE)
    private String nextExecuteTimeGte;

    public static final String SERIALIZED_NAME_NEXT_EXECUTE_TIME_IN = "next_execute_time_in";

    @SerializedName(SERIALIZED_NAME_NEXT_EXECUTE_TIME_IN)
    private List<String> nextExecuteTimeIn = null;

    public static final String SERIALIZED_NAME_NEXT_EXECUTE_TIME_LT = "next_execute_time_lt";

    @SerializedName(SERIALIZED_NAME_NEXT_EXECUTE_TIME_LT)
    private String nextExecuteTimeLt;

    public static final String SERIALIZED_NAME_NEXT_EXECUTE_TIME_LTE = "next_execute_time_lte";

    @SerializedName(SERIALIZED_NAME_NEXT_EXECUTE_TIME_LTE)
    private String nextExecuteTimeLte;

    public static final String SERIALIZED_NAME_NEXT_EXECUTE_TIME_NOT = "next_execute_time_not";

    @SerializedName(SERIALIZED_NAME_NEXT_EXECUTE_TIME_NOT)
    private String nextExecuteTimeNot;

    public static final String SERIALIZED_NAME_NEXT_EXECUTE_TIME_NOT_IN =
            "next_execute_time_not_in";

    @SerializedName(SERIALIZED_NAME_NEXT_EXECUTE_TIME_NOT_IN)
    private List<String> nextExecuteTimeNotIn = null;

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

    public static final String SERIALIZED_NAME_PHYSICAL_SIZE = "physical_size";

    @SerializedName(SERIALIZED_NAME_PHYSICAL_SIZE)
    private Long physicalSize;

    public static final String SERIALIZED_NAME_PHYSICAL_SIZE_GT = "physical_size_gt";

    @SerializedName(SERIALIZED_NAME_PHYSICAL_SIZE_GT)
    private Long physicalSizeGt;

    public static final String SERIALIZED_NAME_PHYSICAL_SIZE_GTE = "physical_size_gte";

    @SerializedName(SERIALIZED_NAME_PHYSICAL_SIZE_GTE)
    private Long physicalSizeGte;

    public static final String SERIALIZED_NAME_PHYSICAL_SIZE_IN = "physical_size_in";

    @SerializedName(SERIALIZED_NAME_PHYSICAL_SIZE_IN)
    private List<Long> physicalSizeIn = null;

    public static final String SERIALIZED_NAME_PHYSICAL_SIZE_LT = "physical_size_lt";

    @SerializedName(SERIALIZED_NAME_PHYSICAL_SIZE_LT)
    private Long physicalSizeLt;

    public static final String SERIALIZED_NAME_PHYSICAL_SIZE_LTE = "physical_size_lte";

    @SerializedName(SERIALIZED_NAME_PHYSICAL_SIZE_LTE)
    private Long physicalSizeLte;

    public static final String SERIALIZED_NAME_PHYSICAL_SIZE_NOT = "physical_size_not";

    @SerializedName(SERIALIZED_NAME_PHYSICAL_SIZE_NOT)
    private Long physicalSizeNot;

    public static final String SERIALIZED_NAME_PHYSICAL_SIZE_NOT_IN = "physical_size_not_in";

    @SerializedName(SERIALIZED_NAME_PHYSICAL_SIZE_NOT_IN)
    private List<Long> physicalSizeNotIn = null;

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

    public static final String SERIALIZED_NAME_VALID_SIZE_OF_BACKUP_OBJECT =
            "valid_size_of_backup_object";

    @SerializedName(SERIALIZED_NAME_VALID_SIZE_OF_BACKUP_OBJECT)
    private Long validSizeOfBackupObject;

    public static final String SERIALIZED_NAME_VALID_SIZE_OF_BACKUP_OBJECT_GT =
            "valid_size_of_backup_object_gt";

    @SerializedName(SERIALIZED_NAME_VALID_SIZE_OF_BACKUP_OBJECT_GT)
    private Long validSizeOfBackupObjectGt;

    public static final String SERIALIZED_NAME_VALID_SIZE_OF_BACKUP_OBJECT_GTE =
            "valid_size_of_backup_object_gte";

    @SerializedName(SERIALIZED_NAME_VALID_SIZE_OF_BACKUP_OBJECT_GTE)
    private Long validSizeOfBackupObjectGte;

    public static final String SERIALIZED_NAME_VALID_SIZE_OF_BACKUP_OBJECT_IN =
            "valid_size_of_backup_object_in";

    @SerializedName(SERIALIZED_NAME_VALID_SIZE_OF_BACKUP_OBJECT_IN)
    private List<Long> validSizeOfBackupObjectIn = null;

    public static final String SERIALIZED_NAME_VALID_SIZE_OF_BACKUP_OBJECT_LT =
            "valid_size_of_backup_object_lt";

    @SerializedName(SERIALIZED_NAME_VALID_SIZE_OF_BACKUP_OBJECT_LT)
    private Long validSizeOfBackupObjectLt;

    public static final String SERIALIZED_NAME_VALID_SIZE_OF_BACKUP_OBJECT_LTE =
            "valid_size_of_backup_object_lte";

    @SerializedName(SERIALIZED_NAME_VALID_SIZE_OF_BACKUP_OBJECT_LTE)
    private Long validSizeOfBackupObjectLte;

    public static final String SERIALIZED_NAME_VALID_SIZE_OF_BACKUP_OBJECT_NOT =
            "valid_size_of_backup_object_not";

    @SerializedName(SERIALIZED_NAME_VALID_SIZE_OF_BACKUP_OBJECT_NOT)
    private Long validSizeOfBackupObjectNot;

    public static final String SERIALIZED_NAME_VALID_SIZE_OF_BACKUP_OBJECT_NOT_IN =
            "valid_size_of_backup_object_not_in";

    @SerializedName(SERIALIZED_NAME_VALID_SIZE_OF_BACKUP_OBJECT_NOT_IN)
    private List<Long> validSizeOfBackupObjectNotIn = null;

    public static final String SERIALIZED_NAME_VALID_SIZE_OF_RESTORE_POINT =
            "valid_size_of_restore_point";

    @SerializedName(SERIALIZED_NAME_VALID_SIZE_OF_RESTORE_POINT)
    private Long validSizeOfRestorePoint;

    public static final String SERIALIZED_NAME_VALID_SIZE_OF_RESTORE_POINT_GT =
            "valid_size_of_restore_point_gt";

    @SerializedName(SERIALIZED_NAME_VALID_SIZE_OF_RESTORE_POINT_GT)
    private Long validSizeOfRestorePointGt;

    public static final String SERIALIZED_NAME_VALID_SIZE_OF_RESTORE_POINT_GTE =
            "valid_size_of_restore_point_gte";

    @SerializedName(SERIALIZED_NAME_VALID_SIZE_OF_RESTORE_POINT_GTE)
    private Long validSizeOfRestorePointGte;

    public static final String SERIALIZED_NAME_VALID_SIZE_OF_RESTORE_POINT_IN =
            "valid_size_of_restore_point_in";

    @SerializedName(SERIALIZED_NAME_VALID_SIZE_OF_RESTORE_POINT_IN)
    private List<Long> validSizeOfRestorePointIn = null;

    public static final String SERIALIZED_NAME_VALID_SIZE_OF_RESTORE_POINT_LT =
            "valid_size_of_restore_point_lt";

    @SerializedName(SERIALIZED_NAME_VALID_SIZE_OF_RESTORE_POINT_LT)
    private Long validSizeOfRestorePointLt;

    public static final String SERIALIZED_NAME_VALID_SIZE_OF_RESTORE_POINT_LTE =
            "valid_size_of_restore_point_lte";

    @SerializedName(SERIALIZED_NAME_VALID_SIZE_OF_RESTORE_POINT_LTE)
    private Long validSizeOfRestorePointLte;

    public static final String SERIALIZED_NAME_VALID_SIZE_OF_RESTORE_POINT_NOT =
            "valid_size_of_restore_point_not";

    @SerializedName(SERIALIZED_NAME_VALID_SIZE_OF_RESTORE_POINT_NOT)
    private Long validSizeOfRestorePointNot;

    public static final String SERIALIZED_NAME_VALID_SIZE_OF_RESTORE_POINT_NOT_IN =
            "valid_size_of_restore_point_not_in";

    @SerializedName(SERIALIZED_NAME_VALID_SIZE_OF_RESTORE_POINT_NOT_IN)
    private List<Long> validSizeOfRestorePointNotIn = null;

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

    public BackupPlanWhereInput() {}

    public BackupPlanWhereInput AND(List<BackupPlanWhereInput> AND) {

        this.AND = AND;
        return this;
    }

    public BackupPlanWhereInput addANDItem(BackupPlanWhereInput ANDItem) {
        if (this.AND == null) {
            this.AND = new ArrayList<BackupPlanWhereInput>();
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
    public List<BackupPlanWhereInput> getAND() {
        return AND;
    }

    public void setAND(List<BackupPlanWhereInput> AND) {
        this.AND = AND;
    }

    public BackupPlanWhereInput AND_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_A_N_D);
        return this;
    }

    public BackupPlanWhereInput AND_ExplictlyNonNull() {
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

    public BackupPlanWhereInput NOT(List<BackupPlanWhereInput> NOT) {

        this.NOT = NOT;
        return this;
    }

    public BackupPlanWhereInput addNOTItem(BackupPlanWhereInput NOTItem) {
        if (this.NOT == null) {
            this.NOT = new ArrayList<BackupPlanWhereInput>();
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
    public List<BackupPlanWhereInput> getNOT() {
        return NOT;
    }

    public void setNOT(List<BackupPlanWhereInput> NOT) {
        this.NOT = NOT;
    }

    public BackupPlanWhereInput NOT_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_N_O_T);
        return this;
    }

    public BackupPlanWhereInput NOT_ExplictlyNonNull() {
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

    public BackupPlanWhereInput OR(List<BackupPlanWhereInput> OR) {

        this.OR = OR;
        return this;
    }

    public BackupPlanWhereInput addORItem(BackupPlanWhereInput ORItem) {
        if (this.OR == null) {
            this.OR = new ArrayList<BackupPlanWhereInput>();
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
    public List<BackupPlanWhereInput> getOR() {
        return OR;
    }

    public void setOR(List<BackupPlanWhereInput> OR) {
        this.OR = OR;
    }

    public BackupPlanWhereInput OR_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_O_R);
        return this;
    }

    public BackupPlanWhereInput OR_ExplictlyNonNull() {
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

    public BackupPlanWhereInput backupDelayOption(BackupPlanDelayOption backupDelayOption) {

        this.backupDelayOption = backupDelayOption;
        return this;
    }

    /**
     * Get backupDelayOption
     *
     * @return backupDelayOption
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public BackupPlanDelayOption getBackupDelayOption() {
        return backupDelayOption;
    }

    public void setBackupDelayOption(BackupPlanDelayOption backupDelayOption) {
        this.backupDelayOption = backupDelayOption;
    }

    public BackupPlanWhereInput backupDelayOption_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_DELAY_OPTION);
        return this;
    }

    public BackupPlanWhereInput backupDelayOption_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_DELAY_OPTION);
        return this;
    }

    public void setBackupDelayOption_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_DELAY_OPTION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_DELAY_OPTION);
        }
    }

    public boolean getBackupDelayOption_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_DELAY_OPTION);
    }

    public BackupPlanWhereInput backupDelayOptionIn(
            List<BackupPlanDelayOption> backupDelayOptionIn) {

        this.backupDelayOptionIn = backupDelayOptionIn;
        return this;
    }

    public BackupPlanWhereInput addBackupDelayOptionInItem(
            BackupPlanDelayOption backupDelayOptionInItem) {
        if (this.backupDelayOptionIn == null) {
            this.backupDelayOptionIn = new ArrayList<BackupPlanDelayOption>();
        }
        this.backupDelayOptionIn.add(backupDelayOptionInItem);
        return this;
    }

    /**
     * Get backupDelayOptionIn
     *
     * @return backupDelayOptionIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<BackupPlanDelayOption> getBackupDelayOptionIn() {
        return backupDelayOptionIn;
    }

    public void setBackupDelayOptionIn(List<BackupPlanDelayOption> backupDelayOptionIn) {
        this.backupDelayOptionIn = backupDelayOptionIn;
    }

    public BackupPlanWhereInput backupDelayOptionIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_DELAY_OPTION_IN);
        return this;
    }

    public BackupPlanWhereInput backupDelayOptionIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_DELAY_OPTION_IN);
        return this;
    }

    public void setBackupDelayOptionIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_DELAY_OPTION_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_DELAY_OPTION_IN);
        }
    }

    public boolean getBackupDelayOptionIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_DELAY_OPTION_IN);
    }

    public BackupPlanWhereInput backupDelayOptionNot(BackupPlanDelayOption backupDelayOptionNot) {

        this.backupDelayOptionNot = backupDelayOptionNot;
        return this;
    }

    /**
     * Get backupDelayOptionNot
     *
     * @return backupDelayOptionNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public BackupPlanDelayOption getBackupDelayOptionNot() {
        return backupDelayOptionNot;
    }

    public void setBackupDelayOptionNot(BackupPlanDelayOption backupDelayOptionNot) {
        this.backupDelayOptionNot = backupDelayOptionNot;
    }

    public BackupPlanWhereInput backupDelayOptionNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_DELAY_OPTION_NOT);
        return this;
    }

    public BackupPlanWhereInput backupDelayOptionNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_DELAY_OPTION_NOT);
        return this;
    }

    public void setBackupDelayOptionNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_DELAY_OPTION_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_DELAY_OPTION_NOT);
        }
    }

    public boolean getBackupDelayOptionNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_DELAY_OPTION_NOT);
    }

    public BackupPlanWhereInput backupDelayOptionNotIn(
            List<BackupPlanDelayOption> backupDelayOptionNotIn) {

        this.backupDelayOptionNotIn = backupDelayOptionNotIn;
        return this;
    }

    public BackupPlanWhereInput addBackupDelayOptionNotInItem(
            BackupPlanDelayOption backupDelayOptionNotInItem) {
        if (this.backupDelayOptionNotIn == null) {
            this.backupDelayOptionNotIn = new ArrayList<BackupPlanDelayOption>();
        }
        this.backupDelayOptionNotIn.add(backupDelayOptionNotInItem);
        return this;
    }

    /**
     * Get backupDelayOptionNotIn
     *
     * @return backupDelayOptionNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<BackupPlanDelayOption> getBackupDelayOptionNotIn() {
        return backupDelayOptionNotIn;
    }

    public void setBackupDelayOptionNotIn(List<BackupPlanDelayOption> backupDelayOptionNotIn) {
        this.backupDelayOptionNotIn = backupDelayOptionNotIn;
    }

    public BackupPlanWhereInput backupDelayOptionNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_DELAY_OPTION_NOT_IN);
        return this;
    }

    public BackupPlanWhereInput backupDelayOptionNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_DELAY_OPTION_NOT_IN);
        return this;
    }

    public void setBackupDelayOptionNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_DELAY_OPTION_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_DELAY_OPTION_NOT_IN);
        }
    }

    public boolean getBackupDelayOptionNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_DELAY_OPTION_NOT_IN);
    }

    public BackupPlanWhereInput backupPlanExecutionsEvery(
            BackupPlanExecutionWhereInput backupPlanExecutionsEvery) {

        this.backupPlanExecutionsEvery = backupPlanExecutionsEvery;
        return this;
    }

    /**
     * Get backupPlanExecutionsEvery
     *
     * @return backupPlanExecutionsEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public BackupPlanExecutionWhereInput getBackupPlanExecutionsEvery() {
        return backupPlanExecutionsEvery;
    }

    public void setBackupPlanExecutionsEvery(
            BackupPlanExecutionWhereInput backupPlanExecutionsEvery) {
        this.backupPlanExecutionsEvery = backupPlanExecutionsEvery;
    }

    public BackupPlanWhereInput backupPlanExecutionsEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_PLAN_EXECUTIONS_EVERY);
        return this;
    }

    public BackupPlanWhereInput backupPlanExecutionsEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_PLAN_EXECUTIONS_EVERY);
        return this;
    }

    public void setBackupPlanExecutionsEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_PLAN_EXECUTIONS_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_PLAN_EXECUTIONS_EVERY);
        }
    }

    public boolean getBackupPlanExecutionsEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_PLAN_EXECUTIONS_EVERY);
    }

    public BackupPlanWhereInput backupPlanExecutionsNone(
            BackupPlanExecutionWhereInput backupPlanExecutionsNone) {

        this.backupPlanExecutionsNone = backupPlanExecutionsNone;
        return this;
    }

    /**
     * Get backupPlanExecutionsNone
     *
     * @return backupPlanExecutionsNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public BackupPlanExecutionWhereInput getBackupPlanExecutionsNone() {
        return backupPlanExecutionsNone;
    }

    public void setBackupPlanExecutionsNone(
            BackupPlanExecutionWhereInput backupPlanExecutionsNone) {
        this.backupPlanExecutionsNone = backupPlanExecutionsNone;
    }

    public BackupPlanWhereInput backupPlanExecutionsNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_PLAN_EXECUTIONS_NONE);
        return this;
    }

    public BackupPlanWhereInput backupPlanExecutionsNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_PLAN_EXECUTIONS_NONE);
        return this;
    }

    public void setBackupPlanExecutionsNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_PLAN_EXECUTIONS_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_PLAN_EXECUTIONS_NONE);
        }
    }

    public boolean getBackupPlanExecutionsNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_PLAN_EXECUTIONS_NONE);
    }

    public BackupPlanWhereInput backupPlanExecutionsSome(
            BackupPlanExecutionWhereInput backupPlanExecutionsSome) {

        this.backupPlanExecutionsSome = backupPlanExecutionsSome;
        return this;
    }

    /**
     * Get backupPlanExecutionsSome
     *
     * @return backupPlanExecutionsSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public BackupPlanExecutionWhereInput getBackupPlanExecutionsSome() {
        return backupPlanExecutionsSome;
    }

    public void setBackupPlanExecutionsSome(
            BackupPlanExecutionWhereInput backupPlanExecutionsSome) {
        this.backupPlanExecutionsSome = backupPlanExecutionsSome;
    }

    public BackupPlanWhereInput backupPlanExecutionsSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_PLAN_EXECUTIONS_SOME);
        return this;
    }

    public BackupPlanWhereInput backupPlanExecutionsSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_PLAN_EXECUTIONS_SOME);
        return this;
    }

    public void setBackupPlanExecutionsSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_PLAN_EXECUTIONS_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_PLAN_EXECUTIONS_SOME);
        }
    }

    public boolean getBackupPlanExecutionsSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_PLAN_EXECUTIONS_SOME);
    }

    public BackupPlanWhereInput backupRestorePointCount(Integer backupRestorePointCount) {

        this.backupRestorePointCount = backupRestorePointCount;
        return this;
    }

    /**
     * Get backupRestorePointCount
     *
     * @return backupRestorePointCount
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getBackupRestorePointCount() {
        return backupRestorePointCount;
    }

    public void setBackupRestorePointCount(Integer backupRestorePointCount) {
        this.backupRestorePointCount = backupRestorePointCount;
    }

    public BackupPlanWhereInput backupRestorePointCount_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_RESTORE_POINT_COUNT);
        return this;
    }

    public BackupPlanWhereInput backupRestorePointCount_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_RESTORE_POINT_COUNT);
        return this;
    }

    public void setBackupRestorePointCount_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_RESTORE_POINT_COUNT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_RESTORE_POINT_COUNT);
        }
    }

    public boolean getBackupRestorePointCount_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_RESTORE_POINT_COUNT);
    }

    public BackupPlanWhereInput backupRestorePointCountGt(Integer backupRestorePointCountGt) {

        this.backupRestorePointCountGt = backupRestorePointCountGt;
        return this;
    }

    /**
     * Get backupRestorePointCountGt
     *
     * @return backupRestorePointCountGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getBackupRestorePointCountGt() {
        return backupRestorePointCountGt;
    }

    public void setBackupRestorePointCountGt(Integer backupRestorePointCountGt) {
        this.backupRestorePointCountGt = backupRestorePointCountGt;
    }

    public BackupPlanWhereInput backupRestorePointCountGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_RESTORE_POINT_COUNT_GT);
        return this;
    }

    public BackupPlanWhereInput backupRestorePointCountGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_RESTORE_POINT_COUNT_GT);
        return this;
    }

    public void setBackupRestorePointCountGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_RESTORE_POINT_COUNT_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_RESTORE_POINT_COUNT_GT);
        }
    }

    public boolean getBackupRestorePointCountGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_RESTORE_POINT_COUNT_GT);
    }

    public BackupPlanWhereInput backupRestorePointCountGte(Integer backupRestorePointCountGte) {

        this.backupRestorePointCountGte = backupRestorePointCountGte;
        return this;
    }

    /**
     * Get backupRestorePointCountGte
     *
     * @return backupRestorePointCountGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getBackupRestorePointCountGte() {
        return backupRestorePointCountGte;
    }

    public void setBackupRestorePointCountGte(Integer backupRestorePointCountGte) {
        this.backupRestorePointCountGte = backupRestorePointCountGte;
    }

    public BackupPlanWhereInput backupRestorePointCountGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_RESTORE_POINT_COUNT_GTE);
        return this;
    }

    public BackupPlanWhereInput backupRestorePointCountGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_RESTORE_POINT_COUNT_GTE);
        return this;
    }

    public void setBackupRestorePointCountGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_RESTORE_POINT_COUNT_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_RESTORE_POINT_COUNT_GTE);
        }
    }

    public boolean getBackupRestorePointCountGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_RESTORE_POINT_COUNT_GTE);
    }

    public BackupPlanWhereInput backupRestorePointCountIn(List<Integer> backupRestorePointCountIn) {

        this.backupRestorePointCountIn = backupRestorePointCountIn;
        return this;
    }

    public BackupPlanWhereInput addBackupRestorePointCountInItem(
            Integer backupRestorePointCountInItem) {
        if (this.backupRestorePointCountIn == null) {
            this.backupRestorePointCountIn = new ArrayList<Integer>();
        }
        this.backupRestorePointCountIn.add(backupRestorePointCountInItem);
        return this;
    }

    /**
     * Get backupRestorePointCountIn
     *
     * @return backupRestorePointCountIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getBackupRestorePointCountIn() {
        return backupRestorePointCountIn;
    }

    public void setBackupRestorePointCountIn(List<Integer> backupRestorePointCountIn) {
        this.backupRestorePointCountIn = backupRestorePointCountIn;
    }

    public BackupPlanWhereInput backupRestorePointCountIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_RESTORE_POINT_COUNT_IN);
        return this;
    }

    public BackupPlanWhereInput backupRestorePointCountIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_RESTORE_POINT_COUNT_IN);
        return this;
    }

    public void setBackupRestorePointCountIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_RESTORE_POINT_COUNT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_RESTORE_POINT_COUNT_IN);
        }
    }

    public boolean getBackupRestorePointCountIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_RESTORE_POINT_COUNT_IN);
    }

    public BackupPlanWhereInput backupRestorePointCountLt(Integer backupRestorePointCountLt) {

        this.backupRestorePointCountLt = backupRestorePointCountLt;
        return this;
    }

    /**
     * Get backupRestorePointCountLt
     *
     * @return backupRestorePointCountLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getBackupRestorePointCountLt() {
        return backupRestorePointCountLt;
    }

    public void setBackupRestorePointCountLt(Integer backupRestorePointCountLt) {
        this.backupRestorePointCountLt = backupRestorePointCountLt;
    }

    public BackupPlanWhereInput backupRestorePointCountLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_RESTORE_POINT_COUNT_LT);
        return this;
    }

    public BackupPlanWhereInput backupRestorePointCountLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_RESTORE_POINT_COUNT_LT);
        return this;
    }

    public void setBackupRestorePointCountLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_RESTORE_POINT_COUNT_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_RESTORE_POINT_COUNT_LT);
        }
    }

    public boolean getBackupRestorePointCountLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_RESTORE_POINT_COUNT_LT);
    }

    public BackupPlanWhereInput backupRestorePointCountLte(Integer backupRestorePointCountLte) {

        this.backupRestorePointCountLte = backupRestorePointCountLte;
        return this;
    }

    /**
     * Get backupRestorePointCountLte
     *
     * @return backupRestorePointCountLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getBackupRestorePointCountLte() {
        return backupRestorePointCountLte;
    }

    public void setBackupRestorePointCountLte(Integer backupRestorePointCountLte) {
        this.backupRestorePointCountLte = backupRestorePointCountLte;
    }

    public BackupPlanWhereInput backupRestorePointCountLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_RESTORE_POINT_COUNT_LTE);
        return this;
    }

    public BackupPlanWhereInput backupRestorePointCountLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_RESTORE_POINT_COUNT_LTE);
        return this;
    }

    public void setBackupRestorePointCountLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_RESTORE_POINT_COUNT_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_RESTORE_POINT_COUNT_LTE);
        }
    }

    public boolean getBackupRestorePointCountLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_RESTORE_POINT_COUNT_LTE);
    }

    public BackupPlanWhereInput backupRestorePointCountNot(Integer backupRestorePointCountNot) {

        this.backupRestorePointCountNot = backupRestorePointCountNot;
        return this;
    }

    /**
     * Get backupRestorePointCountNot
     *
     * @return backupRestorePointCountNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getBackupRestorePointCountNot() {
        return backupRestorePointCountNot;
    }

    public void setBackupRestorePointCountNot(Integer backupRestorePointCountNot) {
        this.backupRestorePointCountNot = backupRestorePointCountNot;
    }

    public BackupPlanWhereInput backupRestorePointCountNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_RESTORE_POINT_COUNT_NOT);
        return this;
    }

    public BackupPlanWhereInput backupRestorePointCountNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_RESTORE_POINT_COUNT_NOT);
        return this;
    }

    public void setBackupRestorePointCountNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_RESTORE_POINT_COUNT_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_RESTORE_POINT_COUNT_NOT);
        }
    }

    public boolean getBackupRestorePointCountNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_RESTORE_POINT_COUNT_NOT);
    }

    public BackupPlanWhereInput backupRestorePointCountNotIn(
            List<Integer> backupRestorePointCountNotIn) {

        this.backupRestorePointCountNotIn = backupRestorePointCountNotIn;
        return this;
    }

    public BackupPlanWhereInput addBackupRestorePointCountNotInItem(
            Integer backupRestorePointCountNotInItem) {
        if (this.backupRestorePointCountNotIn == null) {
            this.backupRestorePointCountNotIn = new ArrayList<Integer>();
        }
        this.backupRestorePointCountNotIn.add(backupRestorePointCountNotInItem);
        return this;
    }

    /**
     * Get backupRestorePointCountNotIn
     *
     * @return backupRestorePointCountNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getBackupRestorePointCountNotIn() {
        return backupRestorePointCountNotIn;
    }

    public void setBackupRestorePointCountNotIn(List<Integer> backupRestorePointCountNotIn) {
        this.backupRestorePointCountNotIn = backupRestorePointCountNotIn;
    }

    public BackupPlanWhereInput backupRestorePointCountNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_RESTORE_POINT_COUNT_NOT_IN);
        return this;
    }

    public BackupPlanWhereInput backupRestorePointCountNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_RESTORE_POINT_COUNT_NOT_IN);
        return this;
    }

    public void setBackupRestorePointCountNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_RESTORE_POINT_COUNT_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_RESTORE_POINT_COUNT_NOT_IN);
        }
    }

    public boolean getBackupRestorePointCountNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_RESTORE_POINT_COUNT_NOT_IN);
    }

    public BackupPlanWhereInput backupRestorePointsEvery(
            BackupRestorePointWhereInput backupRestorePointsEvery) {

        this.backupRestorePointsEvery = backupRestorePointsEvery;
        return this;
    }

    /**
     * Get backupRestorePointsEvery
     *
     * @return backupRestorePointsEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public BackupRestorePointWhereInput getBackupRestorePointsEvery() {
        return backupRestorePointsEvery;
    }

    public void setBackupRestorePointsEvery(BackupRestorePointWhereInput backupRestorePointsEvery) {
        this.backupRestorePointsEvery = backupRestorePointsEvery;
    }

    public BackupPlanWhereInput backupRestorePointsEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_RESTORE_POINTS_EVERY);
        return this;
    }

    public BackupPlanWhereInput backupRestorePointsEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_RESTORE_POINTS_EVERY);
        return this;
    }

    public void setBackupRestorePointsEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_RESTORE_POINTS_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_RESTORE_POINTS_EVERY);
        }
    }

    public boolean getBackupRestorePointsEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_RESTORE_POINTS_EVERY);
    }

    public BackupPlanWhereInput backupRestorePointsNone(
            BackupRestorePointWhereInput backupRestorePointsNone) {

        this.backupRestorePointsNone = backupRestorePointsNone;
        return this;
    }

    /**
     * Get backupRestorePointsNone
     *
     * @return backupRestorePointsNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public BackupRestorePointWhereInput getBackupRestorePointsNone() {
        return backupRestorePointsNone;
    }

    public void setBackupRestorePointsNone(BackupRestorePointWhereInput backupRestorePointsNone) {
        this.backupRestorePointsNone = backupRestorePointsNone;
    }

    public BackupPlanWhereInput backupRestorePointsNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_RESTORE_POINTS_NONE);
        return this;
    }

    public BackupPlanWhereInput backupRestorePointsNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_RESTORE_POINTS_NONE);
        return this;
    }

    public void setBackupRestorePointsNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_RESTORE_POINTS_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_RESTORE_POINTS_NONE);
        }
    }

    public boolean getBackupRestorePointsNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_RESTORE_POINTS_NONE);
    }

    public BackupPlanWhereInput backupRestorePointsSome(
            BackupRestorePointWhereInput backupRestorePointsSome) {

        this.backupRestorePointsSome = backupRestorePointsSome;
        return this;
    }

    /**
     * Get backupRestorePointsSome
     *
     * @return backupRestorePointsSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public BackupRestorePointWhereInput getBackupRestorePointsSome() {
        return backupRestorePointsSome;
    }

    public void setBackupRestorePointsSome(BackupRestorePointWhereInput backupRestorePointsSome) {
        this.backupRestorePointsSome = backupRestorePointsSome;
    }

    public BackupPlanWhereInput backupRestorePointsSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_RESTORE_POINTS_SOME);
        return this;
    }

    public BackupPlanWhereInput backupRestorePointsSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_RESTORE_POINTS_SOME);
        return this;
    }

    public void setBackupRestorePointsSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_RESTORE_POINTS_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_RESTORE_POINTS_SOME);
        }
    }

    public boolean getBackupRestorePointsSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_RESTORE_POINTS_SOME);
    }

    public BackupPlanWhereInput backupService(BackupServiceWhereInput backupService) {

        this.backupService = backupService;
        return this;
    }

    /**
     * Get backupService
     *
     * @return backupService
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public BackupServiceWhereInput getBackupService() {
        return backupService;
    }

    public void setBackupService(BackupServiceWhereInput backupService) {
        this.backupService = backupService;
    }

    public BackupPlanWhereInput backupService_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_SERVICE);
        return this;
    }

    public BackupPlanWhereInput backupService_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_SERVICE);
        return this;
    }

    public void setBackupService_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_SERVICE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_SERVICE);
        }
    }

    public boolean getBackupService_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_SERVICE);
    }

    public BackupPlanWhereInput backupStoreRepository(
            BackupStoreRepositoryWhereInput backupStoreRepository) {

        this.backupStoreRepository = backupStoreRepository;
        return this;
    }

    /**
     * Get backupStoreRepository
     *
     * @return backupStoreRepository
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public BackupStoreRepositoryWhereInput getBackupStoreRepository() {
        return backupStoreRepository;
    }

    public void setBackupStoreRepository(BackupStoreRepositoryWhereInput backupStoreRepository) {
        this.backupStoreRepository = backupStoreRepository;
    }

    public BackupPlanWhereInput backupStoreRepository_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_STORE_REPOSITORY);
        return this;
    }

    public BackupPlanWhereInput backupStoreRepository_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_STORE_REPOSITORY);
        return this;
    }

    public void setBackupStoreRepository_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_STORE_REPOSITORY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_STORE_REPOSITORY);
        }
    }

    public boolean getBackupStoreRepository_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_STORE_REPOSITORY);
    }

    public BackupPlanWhereInput backupTotalSize(Long backupTotalSize) {

        this.backupTotalSize = backupTotalSize;
        return this;
    }

    /**
     * Get backupTotalSize
     *
     * @return backupTotalSize
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getBackupTotalSize() {
        return backupTotalSize;
    }

    public void setBackupTotalSize(Long backupTotalSize) {
        this.backupTotalSize = backupTotalSize;
    }

    public BackupPlanWhereInput backupTotalSize_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_TOTAL_SIZE);
        return this;
    }

    public BackupPlanWhereInput backupTotalSize_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_TOTAL_SIZE);
        return this;
    }

    public void setBackupTotalSize_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_TOTAL_SIZE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_TOTAL_SIZE);
        }
    }

    public boolean getBackupTotalSize_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_TOTAL_SIZE);
    }

    public BackupPlanWhereInput backupTotalSizeGt(Long backupTotalSizeGt) {

        this.backupTotalSizeGt = backupTotalSizeGt;
        return this;
    }

    /**
     * Get backupTotalSizeGt
     *
     * @return backupTotalSizeGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getBackupTotalSizeGt() {
        return backupTotalSizeGt;
    }

    public void setBackupTotalSizeGt(Long backupTotalSizeGt) {
        this.backupTotalSizeGt = backupTotalSizeGt;
    }

    public BackupPlanWhereInput backupTotalSizeGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_TOTAL_SIZE_GT);
        return this;
    }

    public BackupPlanWhereInput backupTotalSizeGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_TOTAL_SIZE_GT);
        return this;
    }

    public void setBackupTotalSizeGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_TOTAL_SIZE_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_TOTAL_SIZE_GT);
        }
    }

    public boolean getBackupTotalSizeGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_TOTAL_SIZE_GT);
    }

    public BackupPlanWhereInput backupTotalSizeGte(Long backupTotalSizeGte) {

        this.backupTotalSizeGte = backupTotalSizeGte;
        return this;
    }

    /**
     * Get backupTotalSizeGte
     *
     * @return backupTotalSizeGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getBackupTotalSizeGte() {
        return backupTotalSizeGte;
    }

    public void setBackupTotalSizeGte(Long backupTotalSizeGte) {
        this.backupTotalSizeGte = backupTotalSizeGte;
    }

    public BackupPlanWhereInput backupTotalSizeGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_TOTAL_SIZE_GTE);
        return this;
    }

    public BackupPlanWhereInput backupTotalSizeGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_TOTAL_SIZE_GTE);
        return this;
    }

    public void setBackupTotalSizeGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_TOTAL_SIZE_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_TOTAL_SIZE_GTE);
        }
    }

    public boolean getBackupTotalSizeGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_TOTAL_SIZE_GTE);
    }

    public BackupPlanWhereInput backupTotalSizeIn(List<Long> backupTotalSizeIn) {

        this.backupTotalSizeIn = backupTotalSizeIn;
        return this;
    }

    public BackupPlanWhereInput addBackupTotalSizeInItem(Long backupTotalSizeInItem) {
        if (this.backupTotalSizeIn == null) {
            this.backupTotalSizeIn = new ArrayList<Long>();
        }
        this.backupTotalSizeIn.add(backupTotalSizeInItem);
        return this;
    }

    /**
     * Get backupTotalSizeIn
     *
     * @return backupTotalSizeIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getBackupTotalSizeIn() {
        return backupTotalSizeIn;
    }

    public void setBackupTotalSizeIn(List<Long> backupTotalSizeIn) {
        this.backupTotalSizeIn = backupTotalSizeIn;
    }

    public BackupPlanWhereInput backupTotalSizeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_TOTAL_SIZE_IN);
        return this;
    }

    public BackupPlanWhereInput backupTotalSizeIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_TOTAL_SIZE_IN);
        return this;
    }

    public void setBackupTotalSizeIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_TOTAL_SIZE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_TOTAL_SIZE_IN);
        }
    }

    public boolean getBackupTotalSizeIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_TOTAL_SIZE_IN);
    }

    public BackupPlanWhereInput backupTotalSizeLt(Long backupTotalSizeLt) {

        this.backupTotalSizeLt = backupTotalSizeLt;
        return this;
    }

    /**
     * Get backupTotalSizeLt
     *
     * @return backupTotalSizeLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getBackupTotalSizeLt() {
        return backupTotalSizeLt;
    }

    public void setBackupTotalSizeLt(Long backupTotalSizeLt) {
        this.backupTotalSizeLt = backupTotalSizeLt;
    }

    public BackupPlanWhereInput backupTotalSizeLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_TOTAL_SIZE_LT);
        return this;
    }

    public BackupPlanWhereInput backupTotalSizeLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_TOTAL_SIZE_LT);
        return this;
    }

    public void setBackupTotalSizeLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_TOTAL_SIZE_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_TOTAL_SIZE_LT);
        }
    }

    public boolean getBackupTotalSizeLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_TOTAL_SIZE_LT);
    }

    public BackupPlanWhereInput backupTotalSizeLte(Long backupTotalSizeLte) {

        this.backupTotalSizeLte = backupTotalSizeLte;
        return this;
    }

    /**
     * Get backupTotalSizeLte
     *
     * @return backupTotalSizeLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getBackupTotalSizeLte() {
        return backupTotalSizeLte;
    }

    public void setBackupTotalSizeLte(Long backupTotalSizeLte) {
        this.backupTotalSizeLte = backupTotalSizeLte;
    }

    public BackupPlanWhereInput backupTotalSizeLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_TOTAL_SIZE_LTE);
        return this;
    }

    public BackupPlanWhereInput backupTotalSizeLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_TOTAL_SIZE_LTE);
        return this;
    }

    public void setBackupTotalSizeLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_TOTAL_SIZE_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_TOTAL_SIZE_LTE);
        }
    }

    public boolean getBackupTotalSizeLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_TOTAL_SIZE_LTE);
    }

    public BackupPlanWhereInput backupTotalSizeNot(Long backupTotalSizeNot) {

        this.backupTotalSizeNot = backupTotalSizeNot;
        return this;
    }

    /**
     * Get backupTotalSizeNot
     *
     * @return backupTotalSizeNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getBackupTotalSizeNot() {
        return backupTotalSizeNot;
    }

    public void setBackupTotalSizeNot(Long backupTotalSizeNot) {
        this.backupTotalSizeNot = backupTotalSizeNot;
    }

    public BackupPlanWhereInput backupTotalSizeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_TOTAL_SIZE_NOT);
        return this;
    }

    public BackupPlanWhereInput backupTotalSizeNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_TOTAL_SIZE_NOT);
        return this;
    }

    public void setBackupTotalSizeNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_TOTAL_SIZE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_TOTAL_SIZE_NOT);
        }
    }

    public boolean getBackupTotalSizeNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_TOTAL_SIZE_NOT);
    }

    public BackupPlanWhereInput backupTotalSizeNotIn(List<Long> backupTotalSizeNotIn) {

        this.backupTotalSizeNotIn = backupTotalSizeNotIn;
        return this;
    }

    public BackupPlanWhereInput addBackupTotalSizeNotInItem(Long backupTotalSizeNotInItem) {
        if (this.backupTotalSizeNotIn == null) {
            this.backupTotalSizeNotIn = new ArrayList<Long>();
        }
        this.backupTotalSizeNotIn.add(backupTotalSizeNotInItem);
        return this;
    }

    /**
     * Get backupTotalSizeNotIn
     *
     * @return backupTotalSizeNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getBackupTotalSizeNotIn() {
        return backupTotalSizeNotIn;
    }

    public void setBackupTotalSizeNotIn(List<Long> backupTotalSizeNotIn) {
        this.backupTotalSizeNotIn = backupTotalSizeNotIn;
    }

    public BackupPlanWhereInput backupTotalSizeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_TOTAL_SIZE_NOT_IN);
        return this;
    }

    public BackupPlanWhereInput backupTotalSizeNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_TOTAL_SIZE_NOT_IN);
        return this;
    }

    public void setBackupTotalSizeNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_TOTAL_SIZE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_TOTAL_SIZE_NOT_IN);
        }
    }

    public boolean getBackupTotalSizeNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_TOTAL_SIZE_NOT_IN);
    }

    public BackupPlanWhereInput compression(Boolean compression) {

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

    public BackupPlanWhereInput compression_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_COMPRESSION);
        return this;
    }

    public BackupPlanWhereInput compression_ExplictlyNonNull() {
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

    public BackupPlanWhereInput compressionNot(Boolean compressionNot) {

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

    public BackupPlanWhereInput compressionNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_COMPRESSION_NOT);
        return this;
    }

    public BackupPlanWhereInput compressionNot_ExplictlyNonNull() {
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

    public BackupPlanWhereInput compressionRatio(Double compressionRatio) {

        this.compressionRatio = compressionRatio;
        return this;
    }

    /**
     * Get compressionRatio
     *
     * @return compressionRatio
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getCompressionRatio() {
        return compressionRatio;
    }

    public void setCompressionRatio(Double compressionRatio) {
        this.compressionRatio = compressionRatio;
    }

    public BackupPlanWhereInput compressionRatio_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_COMPRESSION_RATIO);
        return this;
    }

    public BackupPlanWhereInput compressionRatio_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_COMPRESSION_RATIO);
        return this;
    }

    public void setCompressionRatio_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_COMPRESSION_RATIO);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_COMPRESSION_RATIO);
        }
    }

    public boolean getCompressionRatio_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_COMPRESSION_RATIO);
    }

    public BackupPlanWhereInput compressionRatioGt(Double compressionRatioGt) {

        this.compressionRatioGt = compressionRatioGt;
        return this;
    }

    /**
     * Get compressionRatioGt
     *
     * @return compressionRatioGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getCompressionRatioGt() {
        return compressionRatioGt;
    }

    public void setCompressionRatioGt(Double compressionRatioGt) {
        this.compressionRatioGt = compressionRatioGt;
    }

    public BackupPlanWhereInput compressionRatioGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_COMPRESSION_RATIO_GT);
        return this;
    }

    public BackupPlanWhereInput compressionRatioGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_COMPRESSION_RATIO_GT);
        return this;
    }

    public void setCompressionRatioGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_COMPRESSION_RATIO_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_COMPRESSION_RATIO_GT);
        }
    }

    public boolean getCompressionRatioGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_COMPRESSION_RATIO_GT);
    }

    public BackupPlanWhereInput compressionRatioGte(Double compressionRatioGte) {

        this.compressionRatioGte = compressionRatioGte;
        return this;
    }

    /**
     * Get compressionRatioGte
     *
     * @return compressionRatioGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getCompressionRatioGte() {
        return compressionRatioGte;
    }

    public void setCompressionRatioGte(Double compressionRatioGte) {
        this.compressionRatioGte = compressionRatioGte;
    }

    public BackupPlanWhereInput compressionRatioGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_COMPRESSION_RATIO_GTE);
        return this;
    }

    public BackupPlanWhereInput compressionRatioGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_COMPRESSION_RATIO_GTE);
        return this;
    }

    public void setCompressionRatioGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_COMPRESSION_RATIO_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_COMPRESSION_RATIO_GTE);
        }
    }

    public boolean getCompressionRatioGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_COMPRESSION_RATIO_GTE);
    }

    public BackupPlanWhereInput compressionRatioIn(List<Double> compressionRatioIn) {

        this.compressionRatioIn = compressionRatioIn;
        return this;
    }

    public BackupPlanWhereInput addCompressionRatioInItem(Double compressionRatioInItem) {
        if (this.compressionRatioIn == null) {
            this.compressionRatioIn = new ArrayList<Double>();
        }
        this.compressionRatioIn.add(compressionRatioInItem);
        return this;
    }

    /**
     * Get compressionRatioIn
     *
     * @return compressionRatioIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Double> getCompressionRatioIn() {
        return compressionRatioIn;
    }

    public void setCompressionRatioIn(List<Double> compressionRatioIn) {
        this.compressionRatioIn = compressionRatioIn;
    }

    public BackupPlanWhereInput compressionRatioIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_COMPRESSION_RATIO_IN);
        return this;
    }

    public BackupPlanWhereInput compressionRatioIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_COMPRESSION_RATIO_IN);
        return this;
    }

    public void setCompressionRatioIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_COMPRESSION_RATIO_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_COMPRESSION_RATIO_IN);
        }
    }

    public boolean getCompressionRatioIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_COMPRESSION_RATIO_IN);
    }

    public BackupPlanWhereInput compressionRatioLt(Double compressionRatioLt) {

        this.compressionRatioLt = compressionRatioLt;
        return this;
    }

    /**
     * Get compressionRatioLt
     *
     * @return compressionRatioLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getCompressionRatioLt() {
        return compressionRatioLt;
    }

    public void setCompressionRatioLt(Double compressionRatioLt) {
        this.compressionRatioLt = compressionRatioLt;
    }

    public BackupPlanWhereInput compressionRatioLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_COMPRESSION_RATIO_LT);
        return this;
    }

    public BackupPlanWhereInput compressionRatioLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_COMPRESSION_RATIO_LT);
        return this;
    }

    public void setCompressionRatioLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_COMPRESSION_RATIO_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_COMPRESSION_RATIO_LT);
        }
    }

    public boolean getCompressionRatioLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_COMPRESSION_RATIO_LT);
    }

    public BackupPlanWhereInput compressionRatioLte(Double compressionRatioLte) {

        this.compressionRatioLte = compressionRatioLte;
        return this;
    }

    /**
     * Get compressionRatioLte
     *
     * @return compressionRatioLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getCompressionRatioLte() {
        return compressionRatioLte;
    }

    public void setCompressionRatioLte(Double compressionRatioLte) {
        this.compressionRatioLte = compressionRatioLte;
    }

    public BackupPlanWhereInput compressionRatioLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_COMPRESSION_RATIO_LTE);
        return this;
    }

    public BackupPlanWhereInput compressionRatioLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_COMPRESSION_RATIO_LTE);
        return this;
    }

    public void setCompressionRatioLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_COMPRESSION_RATIO_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_COMPRESSION_RATIO_LTE);
        }
    }

    public boolean getCompressionRatioLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_COMPRESSION_RATIO_LTE);
    }

    public BackupPlanWhereInput compressionRatioNot(Double compressionRatioNot) {

        this.compressionRatioNot = compressionRatioNot;
        return this;
    }

    /**
     * Get compressionRatioNot
     *
     * @return compressionRatioNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getCompressionRatioNot() {
        return compressionRatioNot;
    }

    public void setCompressionRatioNot(Double compressionRatioNot) {
        this.compressionRatioNot = compressionRatioNot;
    }

    public BackupPlanWhereInput compressionRatioNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_COMPRESSION_RATIO_NOT);
        return this;
    }

    public BackupPlanWhereInput compressionRatioNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_COMPRESSION_RATIO_NOT);
        return this;
    }

    public void setCompressionRatioNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_COMPRESSION_RATIO_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_COMPRESSION_RATIO_NOT);
        }
    }

    public boolean getCompressionRatioNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_COMPRESSION_RATIO_NOT);
    }

    public BackupPlanWhereInput compressionRatioNotIn(List<Double> compressionRatioNotIn) {

        this.compressionRatioNotIn = compressionRatioNotIn;
        return this;
    }

    public BackupPlanWhereInput addCompressionRatioNotInItem(Double compressionRatioNotInItem) {
        if (this.compressionRatioNotIn == null) {
            this.compressionRatioNotIn = new ArrayList<Double>();
        }
        this.compressionRatioNotIn.add(compressionRatioNotInItem);
        return this;
    }

    /**
     * Get compressionRatioNotIn
     *
     * @return compressionRatioNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Double> getCompressionRatioNotIn() {
        return compressionRatioNotIn;
    }

    public void setCompressionRatioNotIn(List<Double> compressionRatioNotIn) {
        this.compressionRatioNotIn = compressionRatioNotIn;
    }

    public BackupPlanWhereInput compressionRatioNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_COMPRESSION_RATIO_NOT_IN);
        return this;
    }

    public BackupPlanWhereInput compressionRatioNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_COMPRESSION_RATIO_NOT_IN);
        return this;
    }

    public void setCompressionRatioNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_COMPRESSION_RATIO_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_COMPRESSION_RATIO_NOT_IN);
        }
    }

    public boolean getCompressionRatioNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_COMPRESSION_RATIO_NOT_IN);
    }

    public BackupPlanWhereInput createdAt(String createdAt) {

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

    public BackupPlanWhereInput createdAt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT);
        return this;
    }

    public BackupPlanWhereInput createdAt_ExplictlyNonNull() {
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

    public BackupPlanWhereInput createdAtGt(String createdAtGt) {

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

    public BackupPlanWhereInput createdAtGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_GT);
        return this;
    }

    public BackupPlanWhereInput createdAtGt_ExplictlyNonNull() {
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

    public BackupPlanWhereInput createdAtGte(String createdAtGte) {

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

    public BackupPlanWhereInput createdAtGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_GTE);
        return this;
    }

    public BackupPlanWhereInput createdAtGte_ExplictlyNonNull() {
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

    public BackupPlanWhereInput createdAtIn(List<String> createdAtIn) {

        this.createdAtIn = createdAtIn;
        return this;
    }

    public BackupPlanWhereInput addCreatedAtInItem(String createdAtInItem) {
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

    public BackupPlanWhereInput createdAtIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_IN);
        return this;
    }

    public BackupPlanWhereInput createdAtIn_ExplictlyNonNull() {
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

    public BackupPlanWhereInput createdAtLt(String createdAtLt) {

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

    public BackupPlanWhereInput createdAtLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_LT);
        return this;
    }

    public BackupPlanWhereInput createdAtLt_ExplictlyNonNull() {
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

    public BackupPlanWhereInput createdAtLte(String createdAtLte) {

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

    public BackupPlanWhereInput createdAtLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_LTE);
        return this;
    }

    public BackupPlanWhereInput createdAtLte_ExplictlyNonNull() {
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

    public BackupPlanWhereInput createdAtNot(String createdAtNot) {

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

    public BackupPlanWhereInput createdAtNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_NOT);
        return this;
    }

    public BackupPlanWhereInput createdAtNot_ExplictlyNonNull() {
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

    public BackupPlanWhereInput createdAtNotIn(List<String> createdAtNotIn) {

        this.createdAtNotIn = createdAtNotIn;
        return this;
    }

    public BackupPlanWhereInput addCreatedAtNotInItem(String createdAtNotInItem) {
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

    public BackupPlanWhereInput createdAtNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_NOT_IN);
        return this;
    }

    public BackupPlanWhereInput createdAtNotIn_ExplictlyNonNull() {
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

    public BackupPlanWhereInput deleteStrategy(BackupPlanDeleteStrategy deleteStrategy) {

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

    public BackupPlanWhereInput deleteStrategy_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DELETE_STRATEGY);
        return this;
    }

    public BackupPlanWhereInput deleteStrategy_ExplictlyNonNull() {
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

    public BackupPlanWhereInput deleteStrategyIn(List<BackupPlanDeleteStrategy> deleteStrategyIn) {

        this.deleteStrategyIn = deleteStrategyIn;
        return this;
    }

    public BackupPlanWhereInput addDeleteStrategyInItem(
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

    public BackupPlanWhereInput deleteStrategyIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DELETE_STRATEGY_IN);
        return this;
    }

    public BackupPlanWhereInput deleteStrategyIn_ExplictlyNonNull() {
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

    public BackupPlanWhereInput deleteStrategyNot(BackupPlanDeleteStrategy deleteStrategyNot) {

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

    public BackupPlanWhereInput deleteStrategyNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DELETE_STRATEGY_NOT);
        return this;
    }

    public BackupPlanWhereInput deleteStrategyNot_ExplictlyNonNull() {
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

    public BackupPlanWhereInput deleteStrategyNotIn(
            List<BackupPlanDeleteStrategy> deleteStrategyNotIn) {

        this.deleteStrategyNotIn = deleteStrategyNotIn;
        return this;
    }

    public BackupPlanWhereInput addDeleteStrategyNotInItem(
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

    public BackupPlanWhereInput deleteStrategyNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DELETE_STRATEGY_NOT_IN);
        return this;
    }

    public BackupPlanWhereInput deleteStrategyNotIn_ExplictlyNonNull() {
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

    public BackupPlanWhereInput description(String description) {

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

    public BackupPlanWhereInput description_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION);
        return this;
    }

    public BackupPlanWhereInput description_ExplictlyNonNull() {
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

    public BackupPlanWhereInput descriptionContains(String descriptionContains) {

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

    public BackupPlanWhereInput descriptionContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_CONTAINS);
        return this;
    }

    public BackupPlanWhereInput descriptionContains_ExplictlyNonNull() {
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

    public BackupPlanWhereInput descriptionEndsWith(String descriptionEndsWith) {

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

    public BackupPlanWhereInput descriptionEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_ENDS_WITH);
        return this;
    }

    public BackupPlanWhereInput descriptionEndsWith_ExplictlyNonNull() {
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

    public BackupPlanWhereInput descriptionGt(String descriptionGt) {

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

    public BackupPlanWhereInput descriptionGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_GT);
        return this;
    }

    public BackupPlanWhereInput descriptionGt_ExplictlyNonNull() {
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

    public BackupPlanWhereInput descriptionGte(String descriptionGte) {

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

    public BackupPlanWhereInput descriptionGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_GTE);
        return this;
    }

    public BackupPlanWhereInput descriptionGte_ExplictlyNonNull() {
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

    public BackupPlanWhereInput descriptionIn(List<String> descriptionIn) {

        this.descriptionIn = descriptionIn;
        return this;
    }

    public BackupPlanWhereInput addDescriptionInItem(String descriptionInItem) {
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

    public BackupPlanWhereInput descriptionIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_IN);
        return this;
    }

    public BackupPlanWhereInput descriptionIn_ExplictlyNonNull() {
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

    public BackupPlanWhereInput descriptionLt(String descriptionLt) {

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

    public BackupPlanWhereInput descriptionLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_LT);
        return this;
    }

    public BackupPlanWhereInput descriptionLt_ExplictlyNonNull() {
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

    public BackupPlanWhereInput descriptionLte(String descriptionLte) {

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

    public BackupPlanWhereInput descriptionLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_LTE);
        return this;
    }

    public BackupPlanWhereInput descriptionLte_ExplictlyNonNull() {
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

    public BackupPlanWhereInput descriptionNot(String descriptionNot) {

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

    public BackupPlanWhereInput descriptionNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT);
        return this;
    }

    public BackupPlanWhereInput descriptionNot_ExplictlyNonNull() {
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

    public BackupPlanWhereInput descriptionNotContains(String descriptionNotContains) {

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

    public BackupPlanWhereInput descriptionNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_CONTAINS);
        return this;
    }

    public BackupPlanWhereInput descriptionNotContains_ExplictlyNonNull() {
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

    public BackupPlanWhereInput descriptionNotEndsWith(String descriptionNotEndsWith) {

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

    public BackupPlanWhereInput descriptionNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_ENDS_WITH);
        return this;
    }

    public BackupPlanWhereInput descriptionNotEndsWith_ExplictlyNonNull() {
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

    public BackupPlanWhereInput descriptionNotIn(List<String> descriptionNotIn) {

        this.descriptionNotIn = descriptionNotIn;
        return this;
    }

    public BackupPlanWhereInput addDescriptionNotInItem(String descriptionNotInItem) {
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

    public BackupPlanWhereInput descriptionNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_IN);
        return this;
    }

    public BackupPlanWhereInput descriptionNotIn_ExplictlyNonNull() {
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

    public BackupPlanWhereInput descriptionNotStartsWith(String descriptionNotStartsWith) {

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

    public BackupPlanWhereInput descriptionNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_STARTS_WITH);
        return this;
    }

    public BackupPlanWhereInput descriptionNotStartsWith_ExplictlyNonNull() {
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

    public BackupPlanWhereInput descriptionStartsWith(String descriptionStartsWith) {

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

    public BackupPlanWhereInput descriptionStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_STARTS_WITH);
        return this;
    }

    public BackupPlanWhereInput descriptionStartsWith_ExplictlyNonNull() {
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

    public BackupPlanWhereInput enableWindow(Boolean enableWindow) {

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

    public BackupPlanWhereInput enableWindow_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENABLE_WINDOW);
        return this;
    }

    public BackupPlanWhereInput enableWindow_ExplictlyNonNull() {
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

    public BackupPlanWhereInput enableWindowNot(Boolean enableWindowNot) {

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

    public BackupPlanWhereInput enableWindowNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENABLE_WINDOW_NOT);
        return this;
    }

    public BackupPlanWhereInput enableWindowNot_ExplictlyNonNull() {
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

    public BackupPlanWhereInput entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {

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

    public BackupPlanWhereInput entityAsyncStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        return this;
    }

    public BackupPlanWhereInput entityAsyncStatus_ExplictlyNonNull() {
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

    public BackupPlanWhereInput entityAsyncStatusIn(List<EntityAsyncStatus> entityAsyncStatusIn) {

        this.entityAsyncStatusIn = entityAsyncStatusIn;
        return this;
    }

    public BackupPlanWhereInput addEntityAsyncStatusInItem(
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

    public BackupPlanWhereInput entityAsyncStatusIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_IN);
        return this;
    }

    public BackupPlanWhereInput entityAsyncStatusIn_ExplictlyNonNull() {
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

    public BackupPlanWhereInput entityAsyncStatusNot(EntityAsyncStatus entityAsyncStatusNot) {

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

    public BackupPlanWhereInput entityAsyncStatusNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT);
        return this;
    }

    public BackupPlanWhereInput entityAsyncStatusNot_ExplictlyNonNull() {
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

    public BackupPlanWhereInput entityAsyncStatusNotIn(
            List<EntityAsyncStatus> entityAsyncStatusNotIn) {

        this.entityAsyncStatusNotIn = entityAsyncStatusNotIn;
        return this;
    }

    public BackupPlanWhereInput addEntityAsyncStatusNotInItem(
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

    public BackupPlanWhereInput entityAsyncStatusNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT_IN);
        return this;
    }

    public BackupPlanWhereInput entityAsyncStatusNotIn_ExplictlyNonNull() {
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

    public BackupPlanWhereInput fullInterval(Integer fullInterval) {

        this.fullInterval = fullInterval;
        return this;
    }

    /**
     * Get fullInterval
     *
     * @return fullInterval
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getFullInterval() {
        return fullInterval;
    }

    public void setFullInterval(Integer fullInterval) {
        this.fullInterval = fullInterval;
    }

    public BackupPlanWhereInput fullInterval_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FULL_INTERVAL);
        return this;
    }

    public BackupPlanWhereInput fullInterval_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FULL_INTERVAL);
        return this;
    }

    public void setFullInterval_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FULL_INTERVAL);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FULL_INTERVAL);
        }
    }

    public boolean getFullInterval_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FULL_INTERVAL);
    }

    public BackupPlanWhereInput fullIntervalGt(Integer fullIntervalGt) {

        this.fullIntervalGt = fullIntervalGt;
        return this;
    }

    /**
     * Get fullIntervalGt
     *
     * @return fullIntervalGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getFullIntervalGt() {
        return fullIntervalGt;
    }

    public void setFullIntervalGt(Integer fullIntervalGt) {
        this.fullIntervalGt = fullIntervalGt;
    }

    public BackupPlanWhereInput fullIntervalGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FULL_INTERVAL_GT);
        return this;
    }

    public BackupPlanWhereInput fullIntervalGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FULL_INTERVAL_GT);
        return this;
    }

    public void setFullIntervalGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FULL_INTERVAL_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FULL_INTERVAL_GT);
        }
    }

    public boolean getFullIntervalGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FULL_INTERVAL_GT);
    }

    public BackupPlanWhereInput fullIntervalGte(Integer fullIntervalGte) {

        this.fullIntervalGte = fullIntervalGte;
        return this;
    }

    /**
     * Get fullIntervalGte
     *
     * @return fullIntervalGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getFullIntervalGte() {
        return fullIntervalGte;
    }

    public void setFullIntervalGte(Integer fullIntervalGte) {
        this.fullIntervalGte = fullIntervalGte;
    }

    public BackupPlanWhereInput fullIntervalGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FULL_INTERVAL_GTE);
        return this;
    }

    public BackupPlanWhereInput fullIntervalGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FULL_INTERVAL_GTE);
        return this;
    }

    public void setFullIntervalGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FULL_INTERVAL_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FULL_INTERVAL_GTE);
        }
    }

    public boolean getFullIntervalGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FULL_INTERVAL_GTE);
    }

    public BackupPlanWhereInput fullIntervalIn(List<Integer> fullIntervalIn) {

        this.fullIntervalIn = fullIntervalIn;
        return this;
    }

    public BackupPlanWhereInput addFullIntervalInItem(Integer fullIntervalInItem) {
        if (this.fullIntervalIn == null) {
            this.fullIntervalIn = new ArrayList<Integer>();
        }
        this.fullIntervalIn.add(fullIntervalInItem);
        return this;
    }

    /**
     * Get fullIntervalIn
     *
     * @return fullIntervalIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getFullIntervalIn() {
        return fullIntervalIn;
    }

    public void setFullIntervalIn(List<Integer> fullIntervalIn) {
        this.fullIntervalIn = fullIntervalIn;
    }

    public BackupPlanWhereInput fullIntervalIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FULL_INTERVAL_IN);
        return this;
    }

    public BackupPlanWhereInput fullIntervalIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FULL_INTERVAL_IN);
        return this;
    }

    public void setFullIntervalIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FULL_INTERVAL_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FULL_INTERVAL_IN);
        }
    }

    public boolean getFullIntervalIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FULL_INTERVAL_IN);
    }

    public BackupPlanWhereInput fullIntervalLt(Integer fullIntervalLt) {

        this.fullIntervalLt = fullIntervalLt;
        return this;
    }

    /**
     * Get fullIntervalLt
     *
     * @return fullIntervalLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getFullIntervalLt() {
        return fullIntervalLt;
    }

    public void setFullIntervalLt(Integer fullIntervalLt) {
        this.fullIntervalLt = fullIntervalLt;
    }

    public BackupPlanWhereInput fullIntervalLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FULL_INTERVAL_LT);
        return this;
    }

    public BackupPlanWhereInput fullIntervalLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FULL_INTERVAL_LT);
        return this;
    }

    public void setFullIntervalLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FULL_INTERVAL_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FULL_INTERVAL_LT);
        }
    }

    public boolean getFullIntervalLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FULL_INTERVAL_LT);
    }

    public BackupPlanWhereInput fullIntervalLte(Integer fullIntervalLte) {

        this.fullIntervalLte = fullIntervalLte;
        return this;
    }

    /**
     * Get fullIntervalLte
     *
     * @return fullIntervalLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getFullIntervalLte() {
        return fullIntervalLte;
    }

    public void setFullIntervalLte(Integer fullIntervalLte) {
        this.fullIntervalLte = fullIntervalLte;
    }

    public BackupPlanWhereInput fullIntervalLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FULL_INTERVAL_LTE);
        return this;
    }

    public BackupPlanWhereInput fullIntervalLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FULL_INTERVAL_LTE);
        return this;
    }

    public void setFullIntervalLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FULL_INTERVAL_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FULL_INTERVAL_LTE);
        }
    }

    public boolean getFullIntervalLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FULL_INTERVAL_LTE);
    }

    public BackupPlanWhereInput fullIntervalNot(Integer fullIntervalNot) {

        this.fullIntervalNot = fullIntervalNot;
        return this;
    }

    /**
     * Get fullIntervalNot
     *
     * @return fullIntervalNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getFullIntervalNot() {
        return fullIntervalNot;
    }

    public void setFullIntervalNot(Integer fullIntervalNot) {
        this.fullIntervalNot = fullIntervalNot;
    }

    public BackupPlanWhereInput fullIntervalNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FULL_INTERVAL_NOT);
        return this;
    }

    public BackupPlanWhereInput fullIntervalNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FULL_INTERVAL_NOT);
        return this;
    }

    public void setFullIntervalNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FULL_INTERVAL_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FULL_INTERVAL_NOT);
        }
    }

    public boolean getFullIntervalNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FULL_INTERVAL_NOT);
    }

    public BackupPlanWhereInput fullIntervalNotIn(List<Integer> fullIntervalNotIn) {

        this.fullIntervalNotIn = fullIntervalNotIn;
        return this;
    }

    public BackupPlanWhereInput addFullIntervalNotInItem(Integer fullIntervalNotInItem) {
        if (this.fullIntervalNotIn == null) {
            this.fullIntervalNotIn = new ArrayList<Integer>();
        }
        this.fullIntervalNotIn.add(fullIntervalNotInItem);
        return this;
    }

    /**
     * Get fullIntervalNotIn
     *
     * @return fullIntervalNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getFullIntervalNotIn() {
        return fullIntervalNotIn;
    }

    public void setFullIntervalNotIn(List<Integer> fullIntervalNotIn) {
        this.fullIntervalNotIn = fullIntervalNotIn;
    }

    public BackupPlanWhereInput fullIntervalNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FULL_INTERVAL_NOT_IN);
        return this;
    }

    public BackupPlanWhereInput fullIntervalNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FULL_INTERVAL_NOT_IN);
        return this;
    }

    public void setFullIntervalNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FULL_INTERVAL_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FULL_INTERVAL_NOT_IN);
        }
    }

    public boolean getFullIntervalNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FULL_INTERVAL_NOT_IN);
    }

    public BackupPlanWhereInput fullPeriod(BackupPlanPeriod fullPeriod) {

        this.fullPeriod = fullPeriod;
        return this;
    }

    /**
     * Get fullPeriod
     *
     * @return fullPeriod
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public BackupPlanPeriod getFullPeriod() {
        return fullPeriod;
    }

    public void setFullPeriod(BackupPlanPeriod fullPeriod) {
        this.fullPeriod = fullPeriod;
    }

    public BackupPlanWhereInput fullPeriod_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FULL_PERIOD);
        return this;
    }

    public BackupPlanWhereInput fullPeriod_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FULL_PERIOD);
        return this;
    }

    public void setFullPeriod_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FULL_PERIOD);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FULL_PERIOD);
        }
    }

    public boolean getFullPeriod_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FULL_PERIOD);
    }

    public BackupPlanWhereInput fullPeriodIn(List<BackupPlanPeriod> fullPeriodIn) {

        this.fullPeriodIn = fullPeriodIn;
        return this;
    }

    public BackupPlanWhereInput addFullPeriodInItem(BackupPlanPeriod fullPeriodInItem) {
        if (this.fullPeriodIn == null) {
            this.fullPeriodIn = new ArrayList<BackupPlanPeriod>();
        }
        this.fullPeriodIn.add(fullPeriodInItem);
        return this;
    }

    /**
     * Get fullPeriodIn
     *
     * @return fullPeriodIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<BackupPlanPeriod> getFullPeriodIn() {
        return fullPeriodIn;
    }

    public void setFullPeriodIn(List<BackupPlanPeriod> fullPeriodIn) {
        this.fullPeriodIn = fullPeriodIn;
    }

    public BackupPlanWhereInput fullPeriodIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FULL_PERIOD_IN);
        return this;
    }

    public BackupPlanWhereInput fullPeriodIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FULL_PERIOD_IN);
        return this;
    }

    public void setFullPeriodIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FULL_PERIOD_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FULL_PERIOD_IN);
        }
    }

    public boolean getFullPeriodIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FULL_PERIOD_IN);
    }

    public BackupPlanWhereInput fullPeriodNot(BackupPlanPeriod fullPeriodNot) {

        this.fullPeriodNot = fullPeriodNot;
        return this;
    }

    /**
     * Get fullPeriodNot
     *
     * @return fullPeriodNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public BackupPlanPeriod getFullPeriodNot() {
        return fullPeriodNot;
    }

    public void setFullPeriodNot(BackupPlanPeriod fullPeriodNot) {
        this.fullPeriodNot = fullPeriodNot;
    }

    public BackupPlanWhereInput fullPeriodNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FULL_PERIOD_NOT);
        return this;
    }

    public BackupPlanWhereInput fullPeriodNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FULL_PERIOD_NOT);
        return this;
    }

    public void setFullPeriodNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FULL_PERIOD_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FULL_PERIOD_NOT);
        }
    }

    public boolean getFullPeriodNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FULL_PERIOD_NOT);
    }

    public BackupPlanWhereInput fullPeriodNotIn(List<BackupPlanPeriod> fullPeriodNotIn) {

        this.fullPeriodNotIn = fullPeriodNotIn;
        return this;
    }

    public BackupPlanWhereInput addFullPeriodNotInItem(BackupPlanPeriod fullPeriodNotInItem) {
        if (this.fullPeriodNotIn == null) {
            this.fullPeriodNotIn = new ArrayList<BackupPlanPeriod>();
        }
        this.fullPeriodNotIn.add(fullPeriodNotInItem);
        return this;
    }

    /**
     * Get fullPeriodNotIn
     *
     * @return fullPeriodNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<BackupPlanPeriod> getFullPeriodNotIn() {
        return fullPeriodNotIn;
    }

    public void setFullPeriodNotIn(List<BackupPlanPeriod> fullPeriodNotIn) {
        this.fullPeriodNotIn = fullPeriodNotIn;
    }

    public BackupPlanWhereInput fullPeriodNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FULL_PERIOD_NOT_IN);
        return this;
    }

    public BackupPlanWhereInput fullPeriodNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FULL_PERIOD_NOT_IN);
        return this;
    }

    public void setFullPeriodNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FULL_PERIOD_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FULL_PERIOD_NOT_IN);
        }
    }

    public boolean getFullPeriodNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FULL_PERIOD_NOT_IN);
    }

    public BackupPlanWhereInput id(String id) {

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

    public BackupPlanWhereInput id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public BackupPlanWhereInput id_ExplictlyNonNull() {
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

    public BackupPlanWhereInput idContains(String idContains) {

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

    public BackupPlanWhereInput idContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_CONTAINS);
        return this;
    }

    public BackupPlanWhereInput idContains_ExplictlyNonNull() {
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

    public BackupPlanWhereInput idEndsWith(String idEndsWith) {

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

    public BackupPlanWhereInput idEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_ENDS_WITH);
        return this;
    }

    public BackupPlanWhereInput idEndsWith_ExplictlyNonNull() {
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

    public BackupPlanWhereInput idGt(String idGt) {

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

    public BackupPlanWhereInput idGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GT);
        return this;
    }

    public BackupPlanWhereInput idGt_ExplictlyNonNull() {
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

    public BackupPlanWhereInput idGte(String idGte) {

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

    public BackupPlanWhereInput idGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GTE);
        return this;
    }

    public BackupPlanWhereInput idGte_ExplictlyNonNull() {
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

    public BackupPlanWhereInput idIn(List<String> idIn) {

        this.idIn = idIn;
        return this;
    }

    public BackupPlanWhereInput addIdInItem(String idInItem) {
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

    public BackupPlanWhereInput idIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_IN);
        return this;
    }

    public BackupPlanWhereInput idIn_ExplictlyNonNull() {
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

    public BackupPlanWhereInput idLt(String idLt) {

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

    public BackupPlanWhereInput idLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LT);
        return this;
    }

    public BackupPlanWhereInput idLt_ExplictlyNonNull() {
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

    public BackupPlanWhereInput idLte(String idLte) {

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

    public BackupPlanWhereInput idLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LTE);
        return this;
    }

    public BackupPlanWhereInput idLte_ExplictlyNonNull() {
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

    public BackupPlanWhereInput idNot(String idNot) {

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

    public BackupPlanWhereInput idNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT);
        return this;
    }

    public BackupPlanWhereInput idNot_ExplictlyNonNull() {
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

    public BackupPlanWhereInput idNotContains(String idNotContains) {

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

    public BackupPlanWhereInput idNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_CONTAINS);
        return this;
    }

    public BackupPlanWhereInput idNotContains_ExplictlyNonNull() {
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

    public BackupPlanWhereInput idNotEndsWith(String idNotEndsWith) {

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

    public BackupPlanWhereInput idNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
        return this;
    }

    public BackupPlanWhereInput idNotEndsWith_ExplictlyNonNull() {
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

    public BackupPlanWhereInput idNotIn(List<String> idNotIn) {

        this.idNotIn = idNotIn;
        return this;
    }

    public BackupPlanWhereInput addIdNotInItem(String idNotInItem) {
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

    public BackupPlanWhereInput idNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_IN);
        return this;
    }

    public BackupPlanWhereInput idNotIn_ExplictlyNonNull() {
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

    public BackupPlanWhereInput idNotStartsWith(String idNotStartsWith) {

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

    public BackupPlanWhereInput idNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
        return this;
    }

    public BackupPlanWhereInput idNotStartsWith_ExplictlyNonNull() {
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

    public BackupPlanWhereInput idStartsWith(String idStartsWith) {

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

    public BackupPlanWhereInput idStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_STARTS_WITH);
        return this;
    }

    public BackupPlanWhereInput idStartsWith_ExplictlyNonNull() {
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

    public BackupPlanWhereInput incrementalInterval(Integer incrementalInterval) {

        this.incrementalInterval = incrementalInterval;
        return this;
    }

    /**
     * Get incrementalInterval
     *
     * @return incrementalInterval
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getIncrementalInterval() {
        return incrementalInterval;
    }

    public void setIncrementalInterval(Integer incrementalInterval) {
        this.incrementalInterval = incrementalInterval;
    }

    public BackupPlanWhereInput incrementalInterval_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INCREMENTAL_INTERVAL);
        return this;
    }

    public BackupPlanWhereInput incrementalInterval_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INCREMENTAL_INTERVAL);
        return this;
    }

    public void setIncrementalInterval_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INCREMENTAL_INTERVAL);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INCREMENTAL_INTERVAL);
        }
    }

    public boolean getIncrementalInterval_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INCREMENTAL_INTERVAL);
    }

    public BackupPlanWhereInput incrementalIntervalGt(Integer incrementalIntervalGt) {

        this.incrementalIntervalGt = incrementalIntervalGt;
        return this;
    }

    /**
     * Get incrementalIntervalGt
     *
     * @return incrementalIntervalGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getIncrementalIntervalGt() {
        return incrementalIntervalGt;
    }

    public void setIncrementalIntervalGt(Integer incrementalIntervalGt) {
        this.incrementalIntervalGt = incrementalIntervalGt;
    }

    public BackupPlanWhereInput incrementalIntervalGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INCREMENTAL_INTERVAL_GT);
        return this;
    }

    public BackupPlanWhereInput incrementalIntervalGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INCREMENTAL_INTERVAL_GT);
        return this;
    }

    public void setIncrementalIntervalGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INCREMENTAL_INTERVAL_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INCREMENTAL_INTERVAL_GT);
        }
    }

    public boolean getIncrementalIntervalGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INCREMENTAL_INTERVAL_GT);
    }

    public BackupPlanWhereInput incrementalIntervalGte(Integer incrementalIntervalGte) {

        this.incrementalIntervalGte = incrementalIntervalGte;
        return this;
    }

    /**
     * Get incrementalIntervalGte
     *
     * @return incrementalIntervalGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getIncrementalIntervalGte() {
        return incrementalIntervalGte;
    }

    public void setIncrementalIntervalGte(Integer incrementalIntervalGte) {
        this.incrementalIntervalGte = incrementalIntervalGte;
    }

    public BackupPlanWhereInput incrementalIntervalGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INCREMENTAL_INTERVAL_GTE);
        return this;
    }

    public BackupPlanWhereInput incrementalIntervalGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INCREMENTAL_INTERVAL_GTE);
        return this;
    }

    public void setIncrementalIntervalGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INCREMENTAL_INTERVAL_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INCREMENTAL_INTERVAL_GTE);
        }
    }

    public boolean getIncrementalIntervalGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INCREMENTAL_INTERVAL_GTE);
    }

    public BackupPlanWhereInput incrementalIntervalIn(List<Integer> incrementalIntervalIn) {

        this.incrementalIntervalIn = incrementalIntervalIn;
        return this;
    }

    public BackupPlanWhereInput addIncrementalIntervalInItem(Integer incrementalIntervalInItem) {
        if (this.incrementalIntervalIn == null) {
            this.incrementalIntervalIn = new ArrayList<Integer>();
        }
        this.incrementalIntervalIn.add(incrementalIntervalInItem);
        return this;
    }

    /**
     * Get incrementalIntervalIn
     *
     * @return incrementalIntervalIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getIncrementalIntervalIn() {
        return incrementalIntervalIn;
    }

    public void setIncrementalIntervalIn(List<Integer> incrementalIntervalIn) {
        this.incrementalIntervalIn = incrementalIntervalIn;
    }

    public BackupPlanWhereInput incrementalIntervalIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INCREMENTAL_INTERVAL_IN);
        return this;
    }

    public BackupPlanWhereInput incrementalIntervalIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INCREMENTAL_INTERVAL_IN);
        return this;
    }

    public void setIncrementalIntervalIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INCREMENTAL_INTERVAL_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INCREMENTAL_INTERVAL_IN);
        }
    }

    public boolean getIncrementalIntervalIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INCREMENTAL_INTERVAL_IN);
    }

    public BackupPlanWhereInput incrementalIntervalLt(Integer incrementalIntervalLt) {

        this.incrementalIntervalLt = incrementalIntervalLt;
        return this;
    }

    /**
     * Get incrementalIntervalLt
     *
     * @return incrementalIntervalLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getIncrementalIntervalLt() {
        return incrementalIntervalLt;
    }

    public void setIncrementalIntervalLt(Integer incrementalIntervalLt) {
        this.incrementalIntervalLt = incrementalIntervalLt;
    }

    public BackupPlanWhereInput incrementalIntervalLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INCREMENTAL_INTERVAL_LT);
        return this;
    }

    public BackupPlanWhereInput incrementalIntervalLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INCREMENTAL_INTERVAL_LT);
        return this;
    }

    public void setIncrementalIntervalLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INCREMENTAL_INTERVAL_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INCREMENTAL_INTERVAL_LT);
        }
    }

    public boolean getIncrementalIntervalLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INCREMENTAL_INTERVAL_LT);
    }

    public BackupPlanWhereInput incrementalIntervalLte(Integer incrementalIntervalLte) {

        this.incrementalIntervalLte = incrementalIntervalLte;
        return this;
    }

    /**
     * Get incrementalIntervalLte
     *
     * @return incrementalIntervalLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getIncrementalIntervalLte() {
        return incrementalIntervalLte;
    }

    public void setIncrementalIntervalLte(Integer incrementalIntervalLte) {
        this.incrementalIntervalLte = incrementalIntervalLte;
    }

    public BackupPlanWhereInput incrementalIntervalLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INCREMENTAL_INTERVAL_LTE);
        return this;
    }

    public BackupPlanWhereInput incrementalIntervalLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INCREMENTAL_INTERVAL_LTE);
        return this;
    }

    public void setIncrementalIntervalLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INCREMENTAL_INTERVAL_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INCREMENTAL_INTERVAL_LTE);
        }
    }

    public boolean getIncrementalIntervalLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INCREMENTAL_INTERVAL_LTE);
    }

    public BackupPlanWhereInput incrementalIntervalNot(Integer incrementalIntervalNot) {

        this.incrementalIntervalNot = incrementalIntervalNot;
        return this;
    }

    /**
     * Get incrementalIntervalNot
     *
     * @return incrementalIntervalNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getIncrementalIntervalNot() {
        return incrementalIntervalNot;
    }

    public void setIncrementalIntervalNot(Integer incrementalIntervalNot) {
        this.incrementalIntervalNot = incrementalIntervalNot;
    }

    public BackupPlanWhereInput incrementalIntervalNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INCREMENTAL_INTERVAL_NOT);
        return this;
    }

    public BackupPlanWhereInput incrementalIntervalNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INCREMENTAL_INTERVAL_NOT);
        return this;
    }

    public void setIncrementalIntervalNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INCREMENTAL_INTERVAL_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INCREMENTAL_INTERVAL_NOT);
        }
    }

    public boolean getIncrementalIntervalNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INCREMENTAL_INTERVAL_NOT);
    }

    public BackupPlanWhereInput incrementalIntervalNotIn(List<Integer> incrementalIntervalNotIn) {

        this.incrementalIntervalNotIn = incrementalIntervalNotIn;
        return this;
    }

    public BackupPlanWhereInput addIncrementalIntervalNotInItem(
            Integer incrementalIntervalNotInItem) {
        if (this.incrementalIntervalNotIn == null) {
            this.incrementalIntervalNotIn = new ArrayList<Integer>();
        }
        this.incrementalIntervalNotIn.add(incrementalIntervalNotInItem);
        return this;
    }

    /**
     * Get incrementalIntervalNotIn
     *
     * @return incrementalIntervalNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getIncrementalIntervalNotIn() {
        return incrementalIntervalNotIn;
    }

    public void setIncrementalIntervalNotIn(List<Integer> incrementalIntervalNotIn) {
        this.incrementalIntervalNotIn = incrementalIntervalNotIn;
    }

    public BackupPlanWhereInput incrementalIntervalNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INCREMENTAL_INTERVAL_NOT_IN);
        return this;
    }

    public BackupPlanWhereInput incrementalIntervalNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INCREMENTAL_INTERVAL_NOT_IN);
        return this;
    }

    public void setIncrementalIntervalNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INCREMENTAL_INTERVAL_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INCREMENTAL_INTERVAL_NOT_IN);
        }
    }

    public boolean getIncrementalIntervalNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INCREMENTAL_INTERVAL_NOT_IN);
    }

    public BackupPlanWhereInput incrementalPeriod(BackupPlanPeriod incrementalPeriod) {

        this.incrementalPeriod = incrementalPeriod;
        return this;
    }

    /**
     * Get incrementalPeriod
     *
     * @return incrementalPeriod
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public BackupPlanPeriod getIncrementalPeriod() {
        return incrementalPeriod;
    }

    public void setIncrementalPeriod(BackupPlanPeriod incrementalPeriod) {
        this.incrementalPeriod = incrementalPeriod;
    }

    public BackupPlanWhereInput incrementalPeriod_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INCREMENTAL_PERIOD);
        return this;
    }

    public BackupPlanWhereInput incrementalPeriod_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INCREMENTAL_PERIOD);
        return this;
    }

    public void setIncrementalPeriod_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INCREMENTAL_PERIOD);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INCREMENTAL_PERIOD);
        }
    }

    public boolean getIncrementalPeriod_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INCREMENTAL_PERIOD);
    }

    public BackupPlanWhereInput incrementalPeriodIn(List<BackupPlanPeriod> incrementalPeriodIn) {

        this.incrementalPeriodIn = incrementalPeriodIn;
        return this;
    }

    public BackupPlanWhereInput addIncrementalPeriodInItem(
            BackupPlanPeriod incrementalPeriodInItem) {
        if (this.incrementalPeriodIn == null) {
            this.incrementalPeriodIn = new ArrayList<BackupPlanPeriod>();
        }
        this.incrementalPeriodIn.add(incrementalPeriodInItem);
        return this;
    }

    /**
     * Get incrementalPeriodIn
     *
     * @return incrementalPeriodIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<BackupPlanPeriod> getIncrementalPeriodIn() {
        return incrementalPeriodIn;
    }

    public void setIncrementalPeriodIn(List<BackupPlanPeriod> incrementalPeriodIn) {
        this.incrementalPeriodIn = incrementalPeriodIn;
    }

    public BackupPlanWhereInput incrementalPeriodIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INCREMENTAL_PERIOD_IN);
        return this;
    }

    public BackupPlanWhereInput incrementalPeriodIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INCREMENTAL_PERIOD_IN);
        return this;
    }

    public void setIncrementalPeriodIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INCREMENTAL_PERIOD_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INCREMENTAL_PERIOD_IN);
        }
    }

    public boolean getIncrementalPeriodIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INCREMENTAL_PERIOD_IN);
    }

    public BackupPlanWhereInput incrementalPeriodNot(BackupPlanPeriod incrementalPeriodNot) {

        this.incrementalPeriodNot = incrementalPeriodNot;
        return this;
    }

    /**
     * Get incrementalPeriodNot
     *
     * @return incrementalPeriodNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public BackupPlanPeriod getIncrementalPeriodNot() {
        return incrementalPeriodNot;
    }

    public void setIncrementalPeriodNot(BackupPlanPeriod incrementalPeriodNot) {
        this.incrementalPeriodNot = incrementalPeriodNot;
    }

    public BackupPlanWhereInput incrementalPeriodNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INCREMENTAL_PERIOD_NOT);
        return this;
    }

    public BackupPlanWhereInput incrementalPeriodNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INCREMENTAL_PERIOD_NOT);
        return this;
    }

    public void setIncrementalPeriodNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INCREMENTAL_PERIOD_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INCREMENTAL_PERIOD_NOT);
        }
    }

    public boolean getIncrementalPeriodNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INCREMENTAL_PERIOD_NOT);
    }

    public BackupPlanWhereInput incrementalPeriodNotIn(
            List<BackupPlanPeriod> incrementalPeriodNotIn) {

        this.incrementalPeriodNotIn = incrementalPeriodNotIn;
        return this;
    }

    public BackupPlanWhereInput addIncrementalPeriodNotInItem(
            BackupPlanPeriod incrementalPeriodNotInItem) {
        if (this.incrementalPeriodNotIn == null) {
            this.incrementalPeriodNotIn = new ArrayList<BackupPlanPeriod>();
        }
        this.incrementalPeriodNotIn.add(incrementalPeriodNotInItem);
        return this;
    }

    /**
     * Get incrementalPeriodNotIn
     *
     * @return incrementalPeriodNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<BackupPlanPeriod> getIncrementalPeriodNotIn() {
        return incrementalPeriodNotIn;
    }

    public void setIncrementalPeriodNotIn(List<BackupPlanPeriod> incrementalPeriodNotIn) {
        this.incrementalPeriodNotIn = incrementalPeriodNotIn;
    }

    public BackupPlanWhereInput incrementalPeriodNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INCREMENTAL_PERIOD_NOT_IN);
        return this;
    }

    public BackupPlanWhereInput incrementalPeriodNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INCREMENTAL_PERIOD_NOT_IN);
        return this;
    }

    public void setIncrementalPeriodNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INCREMENTAL_PERIOD_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INCREMENTAL_PERIOD_NOT_IN);
        }
    }

    public boolean getIncrementalPeriodNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INCREMENTAL_PERIOD_NOT_IN);
    }

    public BackupPlanWhereInput keepPolicy(BackupPlanKeepPolicy keepPolicy) {

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

    public BackupPlanWhereInput keepPolicy_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KEEP_POLICY);
        return this;
    }

    public BackupPlanWhereInput keepPolicy_ExplictlyNonNull() {
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

    public BackupPlanWhereInput keepPolicyIn(List<BackupPlanKeepPolicy> keepPolicyIn) {

        this.keepPolicyIn = keepPolicyIn;
        return this;
    }

    public BackupPlanWhereInput addKeepPolicyInItem(BackupPlanKeepPolicy keepPolicyInItem) {
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

    public BackupPlanWhereInput keepPolicyIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KEEP_POLICY_IN);
        return this;
    }

    public BackupPlanWhereInput keepPolicyIn_ExplictlyNonNull() {
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

    public BackupPlanWhereInput keepPolicyNot(BackupPlanKeepPolicy keepPolicyNot) {

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

    public BackupPlanWhereInput keepPolicyNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KEEP_POLICY_NOT);
        return this;
    }

    public BackupPlanWhereInput keepPolicyNot_ExplictlyNonNull() {
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

    public BackupPlanWhereInput keepPolicyNotIn(List<BackupPlanKeepPolicy> keepPolicyNotIn) {

        this.keepPolicyNotIn = keepPolicyNotIn;
        return this;
    }

    public BackupPlanWhereInput addKeepPolicyNotInItem(BackupPlanKeepPolicy keepPolicyNotInItem) {
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

    public BackupPlanWhereInput keepPolicyNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KEEP_POLICY_NOT_IN);
        return this;
    }

    public BackupPlanWhereInput keepPolicyNotIn_ExplictlyNonNull() {
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

    public BackupPlanWhereInput keepPolicyValue(Integer keepPolicyValue) {

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

    public BackupPlanWhereInput keepPolicyValue_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KEEP_POLICY_VALUE);
        return this;
    }

    public BackupPlanWhereInput keepPolicyValue_ExplictlyNonNull() {
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

    public BackupPlanWhereInput keepPolicyValueGt(Integer keepPolicyValueGt) {

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

    public BackupPlanWhereInput keepPolicyValueGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KEEP_POLICY_VALUE_GT);
        return this;
    }

    public BackupPlanWhereInput keepPolicyValueGt_ExplictlyNonNull() {
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

    public BackupPlanWhereInput keepPolicyValueGte(Integer keepPolicyValueGte) {

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

    public BackupPlanWhereInput keepPolicyValueGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KEEP_POLICY_VALUE_GTE);
        return this;
    }

    public BackupPlanWhereInput keepPolicyValueGte_ExplictlyNonNull() {
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

    public BackupPlanWhereInput keepPolicyValueIn(List<Integer> keepPolicyValueIn) {

        this.keepPolicyValueIn = keepPolicyValueIn;
        return this;
    }

    public BackupPlanWhereInput addKeepPolicyValueInItem(Integer keepPolicyValueInItem) {
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

    public BackupPlanWhereInput keepPolicyValueIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KEEP_POLICY_VALUE_IN);
        return this;
    }

    public BackupPlanWhereInput keepPolicyValueIn_ExplictlyNonNull() {
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

    public BackupPlanWhereInput keepPolicyValueLt(Integer keepPolicyValueLt) {

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

    public BackupPlanWhereInput keepPolicyValueLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KEEP_POLICY_VALUE_LT);
        return this;
    }

    public BackupPlanWhereInput keepPolicyValueLt_ExplictlyNonNull() {
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

    public BackupPlanWhereInput keepPolicyValueLte(Integer keepPolicyValueLte) {

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

    public BackupPlanWhereInput keepPolicyValueLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KEEP_POLICY_VALUE_LTE);
        return this;
    }

    public BackupPlanWhereInput keepPolicyValueLte_ExplictlyNonNull() {
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

    public BackupPlanWhereInput keepPolicyValueNot(Integer keepPolicyValueNot) {

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

    public BackupPlanWhereInput keepPolicyValueNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KEEP_POLICY_VALUE_NOT);
        return this;
    }

    public BackupPlanWhereInput keepPolicyValueNot_ExplictlyNonNull() {
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

    public BackupPlanWhereInput keepPolicyValueNotIn(List<Integer> keepPolicyValueNotIn) {

        this.keepPolicyValueNotIn = keepPolicyValueNotIn;
        return this;
    }

    public BackupPlanWhereInput addKeepPolicyValueNotInItem(Integer keepPolicyValueNotInItem) {
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

    public BackupPlanWhereInput keepPolicyValueNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KEEP_POLICY_VALUE_NOT_IN);
        return this;
    }

    public BackupPlanWhereInput keepPolicyValueNotIn_ExplictlyNonNull() {
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

    public BackupPlanWhereInput lastExecuteStatus(BackupPlanExecutionStatus lastExecuteStatus) {

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

    public BackupPlanWhereInput lastExecuteStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_STATUS);
        return this;
    }

    public BackupPlanWhereInput lastExecuteStatus_ExplictlyNonNull() {
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

    public BackupPlanWhereInput lastExecuteStatusIn(
            List<BackupPlanExecutionStatus> lastExecuteStatusIn) {

        this.lastExecuteStatusIn = lastExecuteStatusIn;
        return this;
    }

    public BackupPlanWhereInput addLastExecuteStatusInItem(
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

    public BackupPlanWhereInput lastExecuteStatusIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_STATUS_IN);
        return this;
    }

    public BackupPlanWhereInput lastExecuteStatusIn_ExplictlyNonNull() {
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

    public BackupPlanWhereInput lastExecuteStatusMessage(String lastExecuteStatusMessage) {

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

    public BackupPlanWhereInput lastExecuteStatusMessage_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_STATUS_MESSAGE);
        return this;
    }

    public BackupPlanWhereInput lastExecuteStatusMessage_ExplictlyNonNull() {
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

    public BackupPlanWhereInput lastExecuteStatusMessageContains(
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

    public BackupPlanWhereInput lastExecuteStatusMessageContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_STATUS_MESSAGE_CONTAINS);
        return this;
    }

    public BackupPlanWhereInput lastExecuteStatusMessageContains_ExplictlyNonNull() {
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

    public BackupPlanWhereInput lastExecuteStatusMessageEndsWith(
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

    public BackupPlanWhereInput lastExecuteStatusMessageEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_STATUS_MESSAGE_ENDS_WITH);
        return this;
    }

    public BackupPlanWhereInput lastExecuteStatusMessageEndsWith_ExplictlyNonNull() {
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

    public BackupPlanWhereInput lastExecuteStatusMessageGt(String lastExecuteStatusMessageGt) {

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

    public BackupPlanWhereInput lastExecuteStatusMessageGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_STATUS_MESSAGE_GT);
        return this;
    }

    public BackupPlanWhereInput lastExecuteStatusMessageGt_ExplictlyNonNull() {
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

    public BackupPlanWhereInput lastExecuteStatusMessageGte(String lastExecuteStatusMessageGte) {

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

    public BackupPlanWhereInput lastExecuteStatusMessageGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_STATUS_MESSAGE_GTE);
        return this;
    }

    public BackupPlanWhereInput lastExecuteStatusMessageGte_ExplictlyNonNull() {
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

    public BackupPlanWhereInput lastExecuteStatusMessageIn(
            List<String> lastExecuteStatusMessageIn) {

        this.lastExecuteStatusMessageIn = lastExecuteStatusMessageIn;
        return this;
    }

    public BackupPlanWhereInput addLastExecuteStatusMessageInItem(
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

    public BackupPlanWhereInput lastExecuteStatusMessageIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_STATUS_MESSAGE_IN);
        return this;
    }

    public BackupPlanWhereInput lastExecuteStatusMessageIn_ExplictlyNonNull() {
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

    public BackupPlanWhereInput lastExecuteStatusMessageLt(String lastExecuteStatusMessageLt) {

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

    public BackupPlanWhereInput lastExecuteStatusMessageLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_STATUS_MESSAGE_LT);
        return this;
    }

    public BackupPlanWhereInput lastExecuteStatusMessageLt_ExplictlyNonNull() {
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

    public BackupPlanWhereInput lastExecuteStatusMessageLte(String lastExecuteStatusMessageLte) {

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

    public BackupPlanWhereInput lastExecuteStatusMessageLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_STATUS_MESSAGE_LTE);
        return this;
    }

    public BackupPlanWhereInput lastExecuteStatusMessageLte_ExplictlyNonNull() {
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

    public BackupPlanWhereInput lastExecuteStatusMessageNot(String lastExecuteStatusMessageNot) {

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

    public BackupPlanWhereInput lastExecuteStatusMessageNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_STATUS_MESSAGE_NOT);
        return this;
    }

    public BackupPlanWhereInput lastExecuteStatusMessageNot_ExplictlyNonNull() {
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

    public BackupPlanWhereInput lastExecuteStatusMessageNotContains(
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

    public BackupPlanWhereInput lastExecuteStatusMessageNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_STATUS_MESSAGE_NOT_CONTAINS);
        return this;
    }

    public BackupPlanWhereInput lastExecuteStatusMessageNotContains_ExplictlyNonNull() {
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

    public BackupPlanWhereInput lastExecuteStatusMessageNotEndsWith(
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

    public BackupPlanWhereInput lastExecuteStatusMessageNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_STATUS_MESSAGE_NOT_ENDS_WITH);
        return this;
    }

    public BackupPlanWhereInput lastExecuteStatusMessageNotEndsWith_ExplictlyNonNull() {
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

    public BackupPlanWhereInput lastExecuteStatusMessageNotIn(
            List<String> lastExecuteStatusMessageNotIn) {

        this.lastExecuteStatusMessageNotIn = lastExecuteStatusMessageNotIn;
        return this;
    }

    public BackupPlanWhereInput addLastExecuteStatusMessageNotInItem(
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

    public BackupPlanWhereInput lastExecuteStatusMessageNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_STATUS_MESSAGE_NOT_IN);
        return this;
    }

    public BackupPlanWhereInput lastExecuteStatusMessageNotIn_ExplictlyNonNull() {
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

    public BackupPlanWhereInput lastExecuteStatusMessageNotStartsWith(
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

    public BackupPlanWhereInput lastExecuteStatusMessageNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_STATUS_MESSAGE_NOT_STARTS_WITH);
        return this;
    }

    public BackupPlanWhereInput lastExecuteStatusMessageNotStartsWith_ExplictlyNonNull() {
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

    public BackupPlanWhereInput lastExecuteStatusMessageStartsWith(
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

    public BackupPlanWhereInput lastExecuteStatusMessageStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_STATUS_MESSAGE_STARTS_WITH);
        return this;
    }

    public BackupPlanWhereInput lastExecuteStatusMessageStartsWith_ExplictlyNonNull() {
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

    public BackupPlanWhereInput lastExecuteStatusNot(
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

    public BackupPlanWhereInput lastExecuteStatusNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_STATUS_NOT);
        return this;
    }

    public BackupPlanWhereInput lastExecuteStatusNot_ExplictlyNonNull() {
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

    public BackupPlanWhereInput lastExecuteStatusNotIn(
            List<BackupPlanExecutionStatus> lastExecuteStatusNotIn) {

        this.lastExecuteStatusNotIn = lastExecuteStatusNotIn;
        return this;
    }

    public BackupPlanWhereInput addLastExecuteStatusNotInItem(
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

    public BackupPlanWhereInput lastExecuteStatusNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_STATUS_NOT_IN);
        return this;
    }

    public BackupPlanWhereInput lastExecuteStatusNotIn_ExplictlyNonNull() {
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

    public BackupPlanWhereInput lastExecuteSuccessJobCount(Integer lastExecuteSuccessJobCount) {

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

    public BackupPlanWhereInput lastExecuteSuccessJobCount_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_SUCCESS_JOB_COUNT);
        return this;
    }

    public BackupPlanWhereInput lastExecuteSuccessJobCount_ExplictlyNonNull() {
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

    public BackupPlanWhereInput lastExecuteSuccessJobCountGt(Integer lastExecuteSuccessJobCountGt) {

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

    public BackupPlanWhereInput lastExecuteSuccessJobCountGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_SUCCESS_JOB_COUNT_GT);
        return this;
    }

    public BackupPlanWhereInput lastExecuteSuccessJobCountGt_ExplictlyNonNull() {
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

    public BackupPlanWhereInput lastExecuteSuccessJobCountGte(
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

    public BackupPlanWhereInput lastExecuteSuccessJobCountGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_SUCCESS_JOB_COUNT_GTE);
        return this;
    }

    public BackupPlanWhereInput lastExecuteSuccessJobCountGte_ExplictlyNonNull() {
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

    public BackupPlanWhereInput lastExecuteSuccessJobCountIn(
            List<Integer> lastExecuteSuccessJobCountIn) {

        this.lastExecuteSuccessJobCountIn = lastExecuteSuccessJobCountIn;
        return this;
    }

    public BackupPlanWhereInput addLastExecuteSuccessJobCountInItem(
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

    public BackupPlanWhereInput lastExecuteSuccessJobCountIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_SUCCESS_JOB_COUNT_IN);
        return this;
    }

    public BackupPlanWhereInput lastExecuteSuccessJobCountIn_ExplictlyNonNull() {
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

    public BackupPlanWhereInput lastExecuteSuccessJobCountLt(Integer lastExecuteSuccessJobCountLt) {

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

    public BackupPlanWhereInput lastExecuteSuccessJobCountLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_SUCCESS_JOB_COUNT_LT);
        return this;
    }

    public BackupPlanWhereInput lastExecuteSuccessJobCountLt_ExplictlyNonNull() {
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

    public BackupPlanWhereInput lastExecuteSuccessJobCountLte(
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

    public BackupPlanWhereInput lastExecuteSuccessJobCountLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_SUCCESS_JOB_COUNT_LTE);
        return this;
    }

    public BackupPlanWhereInput lastExecuteSuccessJobCountLte_ExplictlyNonNull() {
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

    public BackupPlanWhereInput lastExecuteSuccessJobCountNot(
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

    public BackupPlanWhereInput lastExecuteSuccessJobCountNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_SUCCESS_JOB_COUNT_NOT);
        return this;
    }

    public BackupPlanWhereInput lastExecuteSuccessJobCountNot_ExplictlyNonNull() {
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

    public BackupPlanWhereInput lastExecuteSuccessJobCountNotIn(
            List<Integer> lastExecuteSuccessJobCountNotIn) {

        this.lastExecuteSuccessJobCountNotIn = lastExecuteSuccessJobCountNotIn;
        return this;
    }

    public BackupPlanWhereInput addLastExecuteSuccessJobCountNotInItem(
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

    public BackupPlanWhereInput lastExecuteSuccessJobCountNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_SUCCESS_JOB_COUNT_NOT_IN);
        return this;
    }

    public BackupPlanWhereInput lastExecuteSuccessJobCountNotIn_ExplictlyNonNull() {
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

    public BackupPlanWhereInput lastExecuteTotalJobCount(Integer lastExecuteTotalJobCount) {

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

    public BackupPlanWhereInput lastExecuteTotalJobCount_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_TOTAL_JOB_COUNT);
        return this;
    }

    public BackupPlanWhereInput lastExecuteTotalJobCount_ExplictlyNonNull() {
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

    public BackupPlanWhereInput lastExecuteTotalJobCountGt(Integer lastExecuteTotalJobCountGt) {

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

    public BackupPlanWhereInput lastExecuteTotalJobCountGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_TOTAL_JOB_COUNT_GT);
        return this;
    }

    public BackupPlanWhereInput lastExecuteTotalJobCountGt_ExplictlyNonNull() {
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

    public BackupPlanWhereInput lastExecuteTotalJobCountGte(Integer lastExecuteTotalJobCountGte) {

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

    public BackupPlanWhereInput lastExecuteTotalJobCountGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_TOTAL_JOB_COUNT_GTE);
        return this;
    }

    public BackupPlanWhereInput lastExecuteTotalJobCountGte_ExplictlyNonNull() {
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

    public BackupPlanWhereInput lastExecuteTotalJobCountIn(
            List<Integer> lastExecuteTotalJobCountIn) {

        this.lastExecuteTotalJobCountIn = lastExecuteTotalJobCountIn;
        return this;
    }

    public BackupPlanWhereInput addLastExecuteTotalJobCountInItem(
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

    public BackupPlanWhereInput lastExecuteTotalJobCountIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_TOTAL_JOB_COUNT_IN);
        return this;
    }

    public BackupPlanWhereInput lastExecuteTotalJobCountIn_ExplictlyNonNull() {
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

    public BackupPlanWhereInput lastExecuteTotalJobCountLt(Integer lastExecuteTotalJobCountLt) {

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

    public BackupPlanWhereInput lastExecuteTotalJobCountLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_TOTAL_JOB_COUNT_LT);
        return this;
    }

    public BackupPlanWhereInput lastExecuteTotalJobCountLt_ExplictlyNonNull() {
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

    public BackupPlanWhereInput lastExecuteTotalJobCountLte(Integer lastExecuteTotalJobCountLte) {

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

    public BackupPlanWhereInput lastExecuteTotalJobCountLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_TOTAL_JOB_COUNT_LTE);
        return this;
    }

    public BackupPlanWhereInput lastExecuteTotalJobCountLte_ExplictlyNonNull() {
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

    public BackupPlanWhereInput lastExecuteTotalJobCountNot(Integer lastExecuteTotalJobCountNot) {

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

    public BackupPlanWhereInput lastExecuteTotalJobCountNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_TOTAL_JOB_COUNT_NOT);
        return this;
    }

    public BackupPlanWhereInput lastExecuteTotalJobCountNot_ExplictlyNonNull() {
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

    public BackupPlanWhereInput lastExecuteTotalJobCountNotIn(
            List<Integer> lastExecuteTotalJobCountNotIn) {

        this.lastExecuteTotalJobCountNotIn = lastExecuteTotalJobCountNotIn;
        return this;
    }

    public BackupPlanWhereInput addLastExecuteTotalJobCountNotInItem(
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

    public BackupPlanWhereInput lastExecuteTotalJobCountNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_TOTAL_JOB_COUNT_NOT_IN);
        return this;
    }

    public BackupPlanWhereInput lastExecuteTotalJobCountNotIn_ExplictlyNonNull() {
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

    public BackupPlanWhereInput lastExecutedAt(String lastExecutedAt) {

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

    public BackupPlanWhereInput lastExecutedAt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTED_AT);
        return this;
    }

    public BackupPlanWhereInput lastExecutedAt_ExplictlyNonNull() {
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

    public BackupPlanWhereInput lastExecutedAtGt(String lastExecutedAtGt) {

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

    public BackupPlanWhereInput lastExecutedAtGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTED_AT_GT);
        return this;
    }

    public BackupPlanWhereInput lastExecutedAtGt_ExplictlyNonNull() {
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

    public BackupPlanWhereInput lastExecutedAtGte(String lastExecutedAtGte) {

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

    public BackupPlanWhereInput lastExecutedAtGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTED_AT_GTE);
        return this;
    }

    public BackupPlanWhereInput lastExecutedAtGte_ExplictlyNonNull() {
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

    public BackupPlanWhereInput lastExecutedAtIn(List<String> lastExecutedAtIn) {

        this.lastExecutedAtIn = lastExecutedAtIn;
        return this;
    }

    public BackupPlanWhereInput addLastExecutedAtInItem(String lastExecutedAtInItem) {
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

    public BackupPlanWhereInput lastExecutedAtIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTED_AT_IN);
        return this;
    }

    public BackupPlanWhereInput lastExecutedAtIn_ExplictlyNonNull() {
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

    public BackupPlanWhereInput lastExecutedAtLt(String lastExecutedAtLt) {

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

    public BackupPlanWhereInput lastExecutedAtLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTED_AT_LT);
        return this;
    }

    public BackupPlanWhereInput lastExecutedAtLt_ExplictlyNonNull() {
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

    public BackupPlanWhereInput lastExecutedAtLte(String lastExecutedAtLte) {

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

    public BackupPlanWhereInput lastExecutedAtLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTED_AT_LTE);
        return this;
    }

    public BackupPlanWhereInput lastExecutedAtLte_ExplictlyNonNull() {
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

    public BackupPlanWhereInput lastExecutedAtNot(String lastExecutedAtNot) {

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

    public BackupPlanWhereInput lastExecutedAtNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTED_AT_NOT);
        return this;
    }

    public BackupPlanWhereInput lastExecutedAtNot_ExplictlyNonNull() {
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

    public BackupPlanWhereInput lastExecutedAtNotIn(List<String> lastExecutedAtNotIn) {

        this.lastExecutedAtNotIn = lastExecutedAtNotIn;
        return this;
    }

    public BackupPlanWhereInput addLastExecutedAtNotInItem(String lastExecutedAtNotInItem) {
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

    public BackupPlanWhereInput lastExecutedAtNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTED_AT_NOT_IN);
        return this;
    }

    public BackupPlanWhereInput lastExecutedAtNotIn_ExplictlyNonNull() {
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

    public BackupPlanWhereInput lastManualExecuteStatus(
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

    public BackupPlanWhereInput lastManualExecuteStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS);
        return this;
    }

    public BackupPlanWhereInput lastManualExecuteStatus_ExplictlyNonNull() {
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

    public BackupPlanWhereInput lastManualExecuteStatusIn(
            List<BackupPlanExecutionStatus> lastManualExecuteStatusIn) {

        this.lastManualExecuteStatusIn = lastManualExecuteStatusIn;
        return this;
    }

    public BackupPlanWhereInput addLastManualExecuteStatusInItem(
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

    public BackupPlanWhereInput lastManualExecuteStatusIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_IN);
        return this;
    }

    public BackupPlanWhereInput lastManualExecuteStatusIn_ExplictlyNonNull() {
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

    public BackupPlanWhereInput lastManualExecuteStatusMessage(
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

    public BackupPlanWhereInput lastManualExecuteStatusMessage_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_MESSAGE);
        return this;
    }

    public BackupPlanWhereInput lastManualExecuteStatusMessage_ExplictlyNonNull() {
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

    public BackupPlanWhereInput lastManualExecuteStatusMessageContains(
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

    public BackupPlanWhereInput lastManualExecuteStatusMessageContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_MESSAGE_CONTAINS);
        return this;
    }

    public BackupPlanWhereInput lastManualExecuteStatusMessageContains_ExplictlyNonNull() {
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

    public BackupPlanWhereInput lastManualExecuteStatusMessageEndsWith(
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

    public BackupPlanWhereInput lastManualExecuteStatusMessageEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_MESSAGE_ENDS_WITH);
        return this;
    }

    public BackupPlanWhereInput lastManualExecuteStatusMessageEndsWith_ExplictlyNonNull() {
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

    public BackupPlanWhereInput lastManualExecuteStatusMessageGt(
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

    public BackupPlanWhereInput lastManualExecuteStatusMessageGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_MESSAGE_GT);
        return this;
    }

    public BackupPlanWhereInput lastManualExecuteStatusMessageGt_ExplictlyNonNull() {
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

    public BackupPlanWhereInput lastManualExecuteStatusMessageGte(
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

    public BackupPlanWhereInput lastManualExecuteStatusMessageGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_MESSAGE_GTE);
        return this;
    }

    public BackupPlanWhereInput lastManualExecuteStatusMessageGte_ExplictlyNonNull() {
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

    public BackupPlanWhereInput lastManualExecuteStatusMessageIn(
            List<String> lastManualExecuteStatusMessageIn) {

        this.lastManualExecuteStatusMessageIn = lastManualExecuteStatusMessageIn;
        return this;
    }

    public BackupPlanWhereInput addLastManualExecuteStatusMessageInItem(
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

    public BackupPlanWhereInput lastManualExecuteStatusMessageIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_MESSAGE_IN);
        return this;
    }

    public BackupPlanWhereInput lastManualExecuteStatusMessageIn_ExplictlyNonNull() {
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

    public BackupPlanWhereInput lastManualExecuteStatusMessageLt(
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

    public BackupPlanWhereInput lastManualExecuteStatusMessageLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_MESSAGE_LT);
        return this;
    }

    public BackupPlanWhereInput lastManualExecuteStatusMessageLt_ExplictlyNonNull() {
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

    public BackupPlanWhereInput lastManualExecuteStatusMessageLte(
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

    public BackupPlanWhereInput lastManualExecuteStatusMessageLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_MESSAGE_LTE);
        return this;
    }

    public BackupPlanWhereInput lastManualExecuteStatusMessageLte_ExplictlyNonNull() {
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

    public BackupPlanWhereInput lastManualExecuteStatusMessageNot(
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

    public BackupPlanWhereInput lastManualExecuteStatusMessageNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_MESSAGE_NOT);
        return this;
    }

    public BackupPlanWhereInput lastManualExecuteStatusMessageNot_ExplictlyNonNull() {
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

    public BackupPlanWhereInput lastManualExecuteStatusMessageNotContains(
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

    public BackupPlanWhereInput lastManualExecuteStatusMessageNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_MESSAGE_NOT_CONTAINS);
        return this;
    }

    public BackupPlanWhereInput lastManualExecuteStatusMessageNotContains_ExplictlyNonNull() {
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

    public BackupPlanWhereInput lastManualExecuteStatusMessageNotEndsWith(
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

    public BackupPlanWhereInput lastManualExecuteStatusMessageNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_MESSAGE_NOT_ENDS_WITH);
        return this;
    }

    public BackupPlanWhereInput lastManualExecuteStatusMessageNotEndsWith_ExplictlyNonNull() {
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

    public BackupPlanWhereInput lastManualExecuteStatusMessageNotIn(
            List<String> lastManualExecuteStatusMessageNotIn) {

        this.lastManualExecuteStatusMessageNotIn = lastManualExecuteStatusMessageNotIn;
        return this;
    }

    public BackupPlanWhereInput addLastManualExecuteStatusMessageNotInItem(
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

    public BackupPlanWhereInput lastManualExecuteStatusMessageNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_MESSAGE_NOT_IN);
        return this;
    }

    public BackupPlanWhereInput lastManualExecuteStatusMessageNotIn_ExplictlyNonNull() {
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

    public BackupPlanWhereInput lastManualExecuteStatusMessageNotStartsWith(
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

    public BackupPlanWhereInput lastManualExecuteStatusMessageNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_MESSAGE_NOT_STARTS_WITH);
        return this;
    }

    public BackupPlanWhereInput lastManualExecuteStatusMessageNotStartsWith_ExplictlyNonNull() {
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

    public BackupPlanWhereInput lastManualExecuteStatusMessageStartsWith(
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

    public BackupPlanWhereInput lastManualExecuteStatusMessageStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_MESSAGE_STARTS_WITH);
        return this;
    }

    public BackupPlanWhereInput lastManualExecuteStatusMessageStartsWith_ExplictlyNonNull() {
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

    public BackupPlanWhereInput lastManualExecuteStatusNot(
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

    public BackupPlanWhereInput lastManualExecuteStatusNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_NOT);
        return this;
    }

    public BackupPlanWhereInput lastManualExecuteStatusNot_ExplictlyNonNull() {
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

    public BackupPlanWhereInput lastManualExecuteStatusNotIn(
            List<BackupPlanExecutionStatus> lastManualExecuteStatusNotIn) {

        this.lastManualExecuteStatusNotIn = lastManualExecuteStatusNotIn;
        return this;
    }

    public BackupPlanWhereInput addLastManualExecuteStatusNotInItem(
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

    public BackupPlanWhereInput lastManualExecuteStatusNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_NOT_IN);
        return this;
    }

    public BackupPlanWhereInput lastManualExecuteStatusNotIn_ExplictlyNonNull() {
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

    public BackupPlanWhereInput lastManualExecuteSuccessJobCount(
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

    public BackupPlanWhereInput lastManualExecuteSuccessJobCount_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_SUCCESS_JOB_COUNT);
        return this;
    }

    public BackupPlanWhereInput lastManualExecuteSuccessJobCount_ExplictlyNonNull() {
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

    public BackupPlanWhereInput lastManualExecuteSuccessJobCountGt(
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

    public BackupPlanWhereInput lastManualExecuteSuccessJobCountGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_SUCCESS_JOB_COUNT_GT);
        return this;
    }

    public BackupPlanWhereInput lastManualExecuteSuccessJobCountGt_ExplictlyNonNull() {
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

    public BackupPlanWhereInput lastManualExecuteSuccessJobCountGte(
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

    public BackupPlanWhereInput lastManualExecuteSuccessJobCountGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_SUCCESS_JOB_COUNT_GTE);
        return this;
    }

    public BackupPlanWhereInput lastManualExecuteSuccessJobCountGte_ExplictlyNonNull() {
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

    public BackupPlanWhereInput lastManualExecuteSuccessJobCountIn(
            List<Integer> lastManualExecuteSuccessJobCountIn) {

        this.lastManualExecuteSuccessJobCountIn = lastManualExecuteSuccessJobCountIn;
        return this;
    }

    public BackupPlanWhereInput addLastManualExecuteSuccessJobCountInItem(
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

    public BackupPlanWhereInput lastManualExecuteSuccessJobCountIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_SUCCESS_JOB_COUNT_IN);
        return this;
    }

    public BackupPlanWhereInput lastManualExecuteSuccessJobCountIn_ExplictlyNonNull() {
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

    public BackupPlanWhereInput lastManualExecuteSuccessJobCountLt(
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

    public BackupPlanWhereInput lastManualExecuteSuccessJobCountLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_SUCCESS_JOB_COUNT_LT);
        return this;
    }

    public BackupPlanWhereInput lastManualExecuteSuccessJobCountLt_ExplictlyNonNull() {
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

    public BackupPlanWhereInput lastManualExecuteSuccessJobCountLte(
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

    public BackupPlanWhereInput lastManualExecuteSuccessJobCountLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_SUCCESS_JOB_COUNT_LTE);
        return this;
    }

    public BackupPlanWhereInput lastManualExecuteSuccessJobCountLte_ExplictlyNonNull() {
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

    public BackupPlanWhereInput lastManualExecuteSuccessJobCountNot(
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

    public BackupPlanWhereInput lastManualExecuteSuccessJobCountNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_SUCCESS_JOB_COUNT_NOT);
        return this;
    }

    public BackupPlanWhereInput lastManualExecuteSuccessJobCountNot_ExplictlyNonNull() {
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

    public BackupPlanWhereInput lastManualExecuteSuccessJobCountNotIn(
            List<Integer> lastManualExecuteSuccessJobCountNotIn) {

        this.lastManualExecuteSuccessJobCountNotIn = lastManualExecuteSuccessJobCountNotIn;
        return this;
    }

    public BackupPlanWhereInput addLastManualExecuteSuccessJobCountNotInItem(
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

    public BackupPlanWhereInput lastManualExecuteSuccessJobCountNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_SUCCESS_JOB_COUNT_NOT_IN);
        return this;
    }

    public BackupPlanWhereInput lastManualExecuteSuccessJobCountNotIn_ExplictlyNonNull() {
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

    public BackupPlanWhereInput lastManualExecuteTotalJobCount(
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

    public BackupPlanWhereInput lastManualExecuteTotalJobCount_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_TOTAL_JOB_COUNT);
        return this;
    }

    public BackupPlanWhereInput lastManualExecuteTotalJobCount_ExplictlyNonNull() {
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

    public BackupPlanWhereInput lastManualExecuteTotalJobCountGt(
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

    public BackupPlanWhereInput lastManualExecuteTotalJobCountGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_TOTAL_JOB_COUNT_GT);
        return this;
    }

    public BackupPlanWhereInput lastManualExecuteTotalJobCountGt_ExplictlyNonNull() {
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

    public BackupPlanWhereInput lastManualExecuteTotalJobCountGte(
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

    public BackupPlanWhereInput lastManualExecuteTotalJobCountGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_TOTAL_JOB_COUNT_GTE);
        return this;
    }

    public BackupPlanWhereInput lastManualExecuteTotalJobCountGte_ExplictlyNonNull() {
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

    public BackupPlanWhereInput lastManualExecuteTotalJobCountIn(
            List<Integer> lastManualExecuteTotalJobCountIn) {

        this.lastManualExecuteTotalJobCountIn = lastManualExecuteTotalJobCountIn;
        return this;
    }

    public BackupPlanWhereInput addLastManualExecuteTotalJobCountInItem(
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

    public BackupPlanWhereInput lastManualExecuteTotalJobCountIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_TOTAL_JOB_COUNT_IN);
        return this;
    }

    public BackupPlanWhereInput lastManualExecuteTotalJobCountIn_ExplictlyNonNull() {
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

    public BackupPlanWhereInput lastManualExecuteTotalJobCountLt(
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

    public BackupPlanWhereInput lastManualExecuteTotalJobCountLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_TOTAL_JOB_COUNT_LT);
        return this;
    }

    public BackupPlanWhereInput lastManualExecuteTotalJobCountLt_ExplictlyNonNull() {
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

    public BackupPlanWhereInput lastManualExecuteTotalJobCountLte(
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

    public BackupPlanWhereInput lastManualExecuteTotalJobCountLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_TOTAL_JOB_COUNT_LTE);
        return this;
    }

    public BackupPlanWhereInput lastManualExecuteTotalJobCountLte_ExplictlyNonNull() {
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

    public BackupPlanWhereInput lastManualExecuteTotalJobCountNot(
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

    public BackupPlanWhereInput lastManualExecuteTotalJobCountNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_TOTAL_JOB_COUNT_NOT);
        return this;
    }

    public BackupPlanWhereInput lastManualExecuteTotalJobCountNot_ExplictlyNonNull() {
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

    public BackupPlanWhereInput lastManualExecuteTotalJobCountNotIn(
            List<Integer> lastManualExecuteTotalJobCountNotIn) {

        this.lastManualExecuteTotalJobCountNotIn = lastManualExecuteTotalJobCountNotIn;
        return this;
    }

    public BackupPlanWhereInput addLastManualExecuteTotalJobCountNotInItem(
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

    public BackupPlanWhereInput lastManualExecuteTotalJobCountNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_TOTAL_JOB_COUNT_NOT_IN);
        return this;
    }

    public BackupPlanWhereInput lastManualExecuteTotalJobCountNotIn_ExplictlyNonNull() {
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

    public BackupPlanWhereInput lastManualExecutedAt(String lastManualExecutedAt) {

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

    public BackupPlanWhereInput lastManualExecutedAt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTED_AT);
        return this;
    }

    public BackupPlanWhereInput lastManualExecutedAt_ExplictlyNonNull() {
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

    public BackupPlanWhereInput lastManualExecutedAtGt(String lastManualExecutedAtGt) {

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

    public BackupPlanWhereInput lastManualExecutedAtGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTED_AT_GT);
        return this;
    }

    public BackupPlanWhereInput lastManualExecutedAtGt_ExplictlyNonNull() {
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

    public BackupPlanWhereInput lastManualExecutedAtGte(String lastManualExecutedAtGte) {

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

    public BackupPlanWhereInput lastManualExecutedAtGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTED_AT_GTE);
        return this;
    }

    public BackupPlanWhereInput lastManualExecutedAtGte_ExplictlyNonNull() {
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

    public BackupPlanWhereInput lastManualExecutedAtIn(List<String> lastManualExecutedAtIn) {

        this.lastManualExecutedAtIn = lastManualExecutedAtIn;
        return this;
    }

    public BackupPlanWhereInput addLastManualExecutedAtInItem(String lastManualExecutedAtInItem) {
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

    public BackupPlanWhereInput lastManualExecutedAtIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTED_AT_IN);
        return this;
    }

    public BackupPlanWhereInput lastManualExecutedAtIn_ExplictlyNonNull() {
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

    public BackupPlanWhereInput lastManualExecutedAtLt(String lastManualExecutedAtLt) {

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

    public BackupPlanWhereInput lastManualExecutedAtLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTED_AT_LT);
        return this;
    }

    public BackupPlanWhereInput lastManualExecutedAtLt_ExplictlyNonNull() {
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

    public BackupPlanWhereInput lastManualExecutedAtLte(String lastManualExecutedAtLte) {

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

    public BackupPlanWhereInput lastManualExecutedAtLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTED_AT_LTE);
        return this;
    }

    public BackupPlanWhereInput lastManualExecutedAtLte_ExplictlyNonNull() {
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

    public BackupPlanWhereInput lastManualExecutedAtNot(String lastManualExecutedAtNot) {

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

    public BackupPlanWhereInput lastManualExecutedAtNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTED_AT_NOT);
        return this;
    }

    public BackupPlanWhereInput lastManualExecutedAtNot_ExplictlyNonNull() {
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

    public BackupPlanWhereInput lastManualExecutedAtNotIn(List<String> lastManualExecutedAtNotIn) {

        this.lastManualExecutedAtNotIn = lastManualExecutedAtNotIn;
        return this;
    }

    public BackupPlanWhereInput addLastManualExecutedAtNotInItem(
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

    public BackupPlanWhereInput lastManualExecutedAtNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTED_AT_NOT_IN);
        return this;
    }

    public BackupPlanWhereInput lastManualExecutedAtNotIn_ExplictlyNonNull() {
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

    public BackupPlanWhereInput logicalSize(Long logicalSize) {

        this.logicalSize = logicalSize;
        return this;
    }

    /**
     * Get logicalSize
     *
     * @return logicalSize
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getLogicalSize() {
        return logicalSize;
    }

    public void setLogicalSize(Long logicalSize) {
        this.logicalSize = logicalSize;
    }

    public BackupPlanWhereInput logicalSize_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOGICAL_SIZE);
        return this;
    }

    public BackupPlanWhereInput logicalSize_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOGICAL_SIZE);
        return this;
    }

    public void setLogicalSize_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOGICAL_SIZE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOGICAL_SIZE);
        }
    }

    public boolean getLogicalSize_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOGICAL_SIZE);
    }

    public BackupPlanWhereInput logicalSizeGt(Long logicalSizeGt) {

        this.logicalSizeGt = logicalSizeGt;
        return this;
    }

    /**
     * Get logicalSizeGt
     *
     * @return logicalSizeGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getLogicalSizeGt() {
        return logicalSizeGt;
    }

    public void setLogicalSizeGt(Long logicalSizeGt) {
        this.logicalSizeGt = logicalSizeGt;
    }

    public BackupPlanWhereInput logicalSizeGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOGICAL_SIZE_GT);
        return this;
    }

    public BackupPlanWhereInput logicalSizeGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOGICAL_SIZE_GT);
        return this;
    }

    public void setLogicalSizeGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOGICAL_SIZE_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOGICAL_SIZE_GT);
        }
    }

    public boolean getLogicalSizeGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOGICAL_SIZE_GT);
    }

    public BackupPlanWhereInput logicalSizeGte(Long logicalSizeGte) {

        this.logicalSizeGte = logicalSizeGte;
        return this;
    }

    /**
     * Get logicalSizeGte
     *
     * @return logicalSizeGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getLogicalSizeGte() {
        return logicalSizeGte;
    }

    public void setLogicalSizeGte(Long logicalSizeGte) {
        this.logicalSizeGte = logicalSizeGte;
    }

    public BackupPlanWhereInput logicalSizeGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOGICAL_SIZE_GTE);
        return this;
    }

    public BackupPlanWhereInput logicalSizeGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOGICAL_SIZE_GTE);
        return this;
    }

    public void setLogicalSizeGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOGICAL_SIZE_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOGICAL_SIZE_GTE);
        }
    }

    public boolean getLogicalSizeGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOGICAL_SIZE_GTE);
    }

    public BackupPlanWhereInput logicalSizeIn(List<Long> logicalSizeIn) {

        this.logicalSizeIn = logicalSizeIn;
        return this;
    }

    public BackupPlanWhereInput addLogicalSizeInItem(Long logicalSizeInItem) {
        if (this.logicalSizeIn == null) {
            this.logicalSizeIn = new ArrayList<Long>();
        }
        this.logicalSizeIn.add(logicalSizeInItem);
        return this;
    }

    /**
     * Get logicalSizeIn
     *
     * @return logicalSizeIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getLogicalSizeIn() {
        return logicalSizeIn;
    }

    public void setLogicalSizeIn(List<Long> logicalSizeIn) {
        this.logicalSizeIn = logicalSizeIn;
    }

    public BackupPlanWhereInput logicalSizeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOGICAL_SIZE_IN);
        return this;
    }

    public BackupPlanWhereInput logicalSizeIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOGICAL_SIZE_IN);
        return this;
    }

    public void setLogicalSizeIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOGICAL_SIZE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOGICAL_SIZE_IN);
        }
    }

    public boolean getLogicalSizeIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOGICAL_SIZE_IN);
    }

    public BackupPlanWhereInput logicalSizeLt(Long logicalSizeLt) {

        this.logicalSizeLt = logicalSizeLt;
        return this;
    }

    /**
     * Get logicalSizeLt
     *
     * @return logicalSizeLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getLogicalSizeLt() {
        return logicalSizeLt;
    }

    public void setLogicalSizeLt(Long logicalSizeLt) {
        this.logicalSizeLt = logicalSizeLt;
    }

    public BackupPlanWhereInput logicalSizeLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOGICAL_SIZE_LT);
        return this;
    }

    public BackupPlanWhereInput logicalSizeLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOGICAL_SIZE_LT);
        return this;
    }

    public void setLogicalSizeLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOGICAL_SIZE_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOGICAL_SIZE_LT);
        }
    }

    public boolean getLogicalSizeLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOGICAL_SIZE_LT);
    }

    public BackupPlanWhereInput logicalSizeLte(Long logicalSizeLte) {

        this.logicalSizeLte = logicalSizeLte;
        return this;
    }

    /**
     * Get logicalSizeLte
     *
     * @return logicalSizeLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getLogicalSizeLte() {
        return logicalSizeLte;
    }

    public void setLogicalSizeLte(Long logicalSizeLte) {
        this.logicalSizeLte = logicalSizeLte;
    }

    public BackupPlanWhereInput logicalSizeLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOGICAL_SIZE_LTE);
        return this;
    }

    public BackupPlanWhereInput logicalSizeLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOGICAL_SIZE_LTE);
        return this;
    }

    public void setLogicalSizeLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOGICAL_SIZE_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOGICAL_SIZE_LTE);
        }
    }

    public boolean getLogicalSizeLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOGICAL_SIZE_LTE);
    }

    public BackupPlanWhereInput logicalSizeNot(Long logicalSizeNot) {

        this.logicalSizeNot = logicalSizeNot;
        return this;
    }

    /**
     * Get logicalSizeNot
     *
     * @return logicalSizeNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getLogicalSizeNot() {
        return logicalSizeNot;
    }

    public void setLogicalSizeNot(Long logicalSizeNot) {
        this.logicalSizeNot = logicalSizeNot;
    }

    public BackupPlanWhereInput logicalSizeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOGICAL_SIZE_NOT);
        return this;
    }

    public BackupPlanWhereInput logicalSizeNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOGICAL_SIZE_NOT);
        return this;
    }

    public void setLogicalSizeNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOGICAL_SIZE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOGICAL_SIZE_NOT);
        }
    }

    public boolean getLogicalSizeNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOGICAL_SIZE_NOT);
    }

    public BackupPlanWhereInput logicalSizeNotIn(List<Long> logicalSizeNotIn) {

        this.logicalSizeNotIn = logicalSizeNotIn;
        return this;
    }

    public BackupPlanWhereInput addLogicalSizeNotInItem(Long logicalSizeNotInItem) {
        if (this.logicalSizeNotIn == null) {
            this.logicalSizeNotIn = new ArrayList<Long>();
        }
        this.logicalSizeNotIn.add(logicalSizeNotInItem);
        return this;
    }

    /**
     * Get logicalSizeNotIn
     *
     * @return logicalSizeNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getLogicalSizeNotIn() {
        return logicalSizeNotIn;
    }

    public void setLogicalSizeNotIn(List<Long> logicalSizeNotIn) {
        this.logicalSizeNotIn = logicalSizeNotIn;
    }

    public BackupPlanWhereInput logicalSizeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOGICAL_SIZE_NOT_IN);
        return this;
    }

    public BackupPlanWhereInput logicalSizeNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOGICAL_SIZE_NOT_IN);
        return this;
    }

    public void setLogicalSizeNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOGICAL_SIZE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOGICAL_SIZE_NOT_IN);
        }
    }

    public boolean getLogicalSizeNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOGICAL_SIZE_NOT_IN);
    }

    public BackupPlanWhereInput name(String name) {

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

    public BackupPlanWhereInput name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public BackupPlanWhereInput name_ExplictlyNonNull() {
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

    public BackupPlanWhereInput nameContains(String nameContains) {

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

    public BackupPlanWhereInput nameContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_CONTAINS);
        return this;
    }

    public BackupPlanWhereInput nameContains_ExplictlyNonNull() {
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

    public BackupPlanWhereInput nameEndsWith(String nameEndsWith) {

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

    public BackupPlanWhereInput nameEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_ENDS_WITH);
        return this;
    }

    public BackupPlanWhereInput nameEndsWith_ExplictlyNonNull() {
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

    public BackupPlanWhereInput nameGt(String nameGt) {

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

    public BackupPlanWhereInput nameGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_GT);
        return this;
    }

    public BackupPlanWhereInput nameGt_ExplictlyNonNull() {
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

    public BackupPlanWhereInput nameGte(String nameGte) {

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

    public BackupPlanWhereInput nameGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_GTE);
        return this;
    }

    public BackupPlanWhereInput nameGte_ExplictlyNonNull() {
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

    public BackupPlanWhereInput nameIn(List<String> nameIn) {

        this.nameIn = nameIn;
        return this;
    }

    public BackupPlanWhereInput addNameInItem(String nameInItem) {
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

    public BackupPlanWhereInput nameIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_IN);
        return this;
    }

    public BackupPlanWhereInput nameIn_ExplictlyNonNull() {
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

    public BackupPlanWhereInput nameLt(String nameLt) {

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

    public BackupPlanWhereInput nameLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_LT);
        return this;
    }

    public BackupPlanWhereInput nameLt_ExplictlyNonNull() {
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

    public BackupPlanWhereInput nameLte(String nameLte) {

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

    public BackupPlanWhereInput nameLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_LTE);
        return this;
    }

    public BackupPlanWhereInput nameLte_ExplictlyNonNull() {
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

    public BackupPlanWhereInput nameNot(String nameNot) {

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

    public BackupPlanWhereInput nameNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT);
        return this;
    }

    public BackupPlanWhereInput nameNot_ExplictlyNonNull() {
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

    public BackupPlanWhereInput nameNotContains(String nameNotContains) {

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

    public BackupPlanWhereInput nameNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_CONTAINS);
        return this;
    }

    public BackupPlanWhereInput nameNotContains_ExplictlyNonNull() {
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

    public BackupPlanWhereInput nameNotEndsWith(String nameNotEndsWith) {

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

    public BackupPlanWhereInput nameNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_ENDS_WITH);
        return this;
    }

    public BackupPlanWhereInput nameNotEndsWith_ExplictlyNonNull() {
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

    public BackupPlanWhereInput nameNotIn(List<String> nameNotIn) {

        this.nameNotIn = nameNotIn;
        return this;
    }

    public BackupPlanWhereInput addNameNotInItem(String nameNotInItem) {
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

    public BackupPlanWhereInput nameNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_IN);
        return this;
    }

    public BackupPlanWhereInput nameNotIn_ExplictlyNonNull() {
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

    public BackupPlanWhereInput nameNotStartsWith(String nameNotStartsWith) {

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

    public BackupPlanWhereInput nameNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_STARTS_WITH);
        return this;
    }

    public BackupPlanWhereInput nameNotStartsWith_ExplictlyNonNull() {
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

    public BackupPlanWhereInput nameStartsWith(String nameStartsWith) {

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

    public BackupPlanWhereInput nameStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_STARTS_WITH);
        return this;
    }

    public BackupPlanWhereInput nameStartsWith_ExplictlyNonNull() {
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

    public BackupPlanWhereInput nextExecuteTime(String nextExecuteTime) {

        this.nextExecuteTime = nextExecuteTime;
        return this;
    }

    /**
     * Get nextExecuteTime
     *
     * @return nextExecuteTime
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNextExecuteTime() {
        return nextExecuteTime;
    }

    public void setNextExecuteTime(String nextExecuteTime) {
        this.nextExecuteTime = nextExecuteTime;
    }

    public BackupPlanWhereInput nextExecuteTime_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NEXT_EXECUTE_TIME);
        return this;
    }

    public BackupPlanWhereInput nextExecuteTime_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NEXT_EXECUTE_TIME);
        return this;
    }

    public void setNextExecuteTime_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NEXT_EXECUTE_TIME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NEXT_EXECUTE_TIME);
        }
    }

    public boolean getNextExecuteTime_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NEXT_EXECUTE_TIME);
    }

    public BackupPlanWhereInput nextExecuteTimeGt(String nextExecuteTimeGt) {

        this.nextExecuteTimeGt = nextExecuteTimeGt;
        return this;
    }

    /**
     * Get nextExecuteTimeGt
     *
     * @return nextExecuteTimeGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNextExecuteTimeGt() {
        return nextExecuteTimeGt;
    }

    public void setNextExecuteTimeGt(String nextExecuteTimeGt) {
        this.nextExecuteTimeGt = nextExecuteTimeGt;
    }

    public BackupPlanWhereInput nextExecuteTimeGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NEXT_EXECUTE_TIME_GT);
        return this;
    }

    public BackupPlanWhereInput nextExecuteTimeGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NEXT_EXECUTE_TIME_GT);
        return this;
    }

    public void setNextExecuteTimeGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NEXT_EXECUTE_TIME_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NEXT_EXECUTE_TIME_GT);
        }
    }

    public boolean getNextExecuteTimeGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NEXT_EXECUTE_TIME_GT);
    }

    public BackupPlanWhereInput nextExecuteTimeGte(String nextExecuteTimeGte) {

        this.nextExecuteTimeGte = nextExecuteTimeGte;
        return this;
    }

    /**
     * Get nextExecuteTimeGte
     *
     * @return nextExecuteTimeGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNextExecuteTimeGte() {
        return nextExecuteTimeGte;
    }

    public void setNextExecuteTimeGte(String nextExecuteTimeGte) {
        this.nextExecuteTimeGte = nextExecuteTimeGte;
    }

    public BackupPlanWhereInput nextExecuteTimeGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NEXT_EXECUTE_TIME_GTE);
        return this;
    }

    public BackupPlanWhereInput nextExecuteTimeGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NEXT_EXECUTE_TIME_GTE);
        return this;
    }

    public void setNextExecuteTimeGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NEXT_EXECUTE_TIME_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NEXT_EXECUTE_TIME_GTE);
        }
    }

    public boolean getNextExecuteTimeGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NEXT_EXECUTE_TIME_GTE);
    }

    public BackupPlanWhereInput nextExecuteTimeIn(List<String> nextExecuteTimeIn) {

        this.nextExecuteTimeIn = nextExecuteTimeIn;
        return this;
    }

    public BackupPlanWhereInput addNextExecuteTimeInItem(String nextExecuteTimeInItem) {
        if (this.nextExecuteTimeIn == null) {
            this.nextExecuteTimeIn = new ArrayList<String>();
        }
        this.nextExecuteTimeIn.add(nextExecuteTimeInItem);
        return this;
    }

    /**
     * Get nextExecuteTimeIn
     *
     * @return nextExecuteTimeIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getNextExecuteTimeIn() {
        return nextExecuteTimeIn;
    }

    public void setNextExecuteTimeIn(List<String> nextExecuteTimeIn) {
        this.nextExecuteTimeIn = nextExecuteTimeIn;
    }

    public BackupPlanWhereInput nextExecuteTimeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NEXT_EXECUTE_TIME_IN);
        return this;
    }

    public BackupPlanWhereInput nextExecuteTimeIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NEXT_EXECUTE_TIME_IN);
        return this;
    }

    public void setNextExecuteTimeIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NEXT_EXECUTE_TIME_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NEXT_EXECUTE_TIME_IN);
        }
    }

    public boolean getNextExecuteTimeIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NEXT_EXECUTE_TIME_IN);
    }

    public BackupPlanWhereInput nextExecuteTimeLt(String nextExecuteTimeLt) {

        this.nextExecuteTimeLt = nextExecuteTimeLt;
        return this;
    }

    /**
     * Get nextExecuteTimeLt
     *
     * @return nextExecuteTimeLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNextExecuteTimeLt() {
        return nextExecuteTimeLt;
    }

    public void setNextExecuteTimeLt(String nextExecuteTimeLt) {
        this.nextExecuteTimeLt = nextExecuteTimeLt;
    }

    public BackupPlanWhereInput nextExecuteTimeLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NEXT_EXECUTE_TIME_LT);
        return this;
    }

    public BackupPlanWhereInput nextExecuteTimeLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NEXT_EXECUTE_TIME_LT);
        return this;
    }

    public void setNextExecuteTimeLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NEXT_EXECUTE_TIME_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NEXT_EXECUTE_TIME_LT);
        }
    }

    public boolean getNextExecuteTimeLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NEXT_EXECUTE_TIME_LT);
    }

    public BackupPlanWhereInput nextExecuteTimeLte(String nextExecuteTimeLte) {

        this.nextExecuteTimeLte = nextExecuteTimeLte;
        return this;
    }

    /**
     * Get nextExecuteTimeLte
     *
     * @return nextExecuteTimeLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNextExecuteTimeLte() {
        return nextExecuteTimeLte;
    }

    public void setNextExecuteTimeLte(String nextExecuteTimeLte) {
        this.nextExecuteTimeLte = nextExecuteTimeLte;
    }

    public BackupPlanWhereInput nextExecuteTimeLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NEXT_EXECUTE_TIME_LTE);
        return this;
    }

    public BackupPlanWhereInput nextExecuteTimeLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NEXT_EXECUTE_TIME_LTE);
        return this;
    }

    public void setNextExecuteTimeLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NEXT_EXECUTE_TIME_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NEXT_EXECUTE_TIME_LTE);
        }
    }

    public boolean getNextExecuteTimeLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NEXT_EXECUTE_TIME_LTE);
    }

    public BackupPlanWhereInput nextExecuteTimeNot(String nextExecuteTimeNot) {

        this.nextExecuteTimeNot = nextExecuteTimeNot;
        return this;
    }

    /**
     * Get nextExecuteTimeNot
     *
     * @return nextExecuteTimeNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNextExecuteTimeNot() {
        return nextExecuteTimeNot;
    }

    public void setNextExecuteTimeNot(String nextExecuteTimeNot) {
        this.nextExecuteTimeNot = nextExecuteTimeNot;
    }

    public BackupPlanWhereInput nextExecuteTimeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NEXT_EXECUTE_TIME_NOT);
        return this;
    }

    public BackupPlanWhereInput nextExecuteTimeNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NEXT_EXECUTE_TIME_NOT);
        return this;
    }

    public void setNextExecuteTimeNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NEXT_EXECUTE_TIME_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NEXT_EXECUTE_TIME_NOT);
        }
    }

    public boolean getNextExecuteTimeNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NEXT_EXECUTE_TIME_NOT);
    }

    public BackupPlanWhereInput nextExecuteTimeNotIn(List<String> nextExecuteTimeNotIn) {

        this.nextExecuteTimeNotIn = nextExecuteTimeNotIn;
        return this;
    }

    public BackupPlanWhereInput addNextExecuteTimeNotInItem(String nextExecuteTimeNotInItem) {
        if (this.nextExecuteTimeNotIn == null) {
            this.nextExecuteTimeNotIn = new ArrayList<String>();
        }
        this.nextExecuteTimeNotIn.add(nextExecuteTimeNotInItem);
        return this;
    }

    /**
     * Get nextExecuteTimeNotIn
     *
     * @return nextExecuteTimeNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getNextExecuteTimeNotIn() {
        return nextExecuteTimeNotIn;
    }

    public void setNextExecuteTimeNotIn(List<String> nextExecuteTimeNotIn) {
        this.nextExecuteTimeNotIn = nextExecuteTimeNotIn;
    }

    public BackupPlanWhereInput nextExecuteTimeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NEXT_EXECUTE_TIME_NOT_IN);
        return this;
    }

    public BackupPlanWhereInput nextExecuteTimeNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NEXT_EXECUTE_TIME_NOT_IN);
        return this;
    }

    public void setNextExecuteTimeNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NEXT_EXECUTE_TIME_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NEXT_EXECUTE_TIME_NOT_IN);
        }
    }

    public boolean getNextExecuteTimeNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NEXT_EXECUTE_TIME_NOT_IN);
    }

    public BackupPlanWhereInput phase(BackupPlanPhase phase) {

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

    public BackupPlanWhereInput phase_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PHASE);
        return this;
    }

    public BackupPlanWhereInput phase_ExplictlyNonNull() {
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

    public BackupPlanWhereInput phaseIn(List<BackupPlanPhase> phaseIn) {

        this.phaseIn = phaseIn;
        return this;
    }

    public BackupPlanWhereInput addPhaseInItem(BackupPlanPhase phaseInItem) {
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

    public BackupPlanWhereInput phaseIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PHASE_IN);
        return this;
    }

    public BackupPlanWhereInput phaseIn_ExplictlyNonNull() {
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

    public BackupPlanWhereInput phaseNot(BackupPlanPhase phaseNot) {

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

    public BackupPlanWhereInput phaseNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PHASE_NOT);
        return this;
    }

    public BackupPlanWhereInput phaseNot_ExplictlyNonNull() {
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

    public BackupPlanWhereInput phaseNotIn(List<BackupPlanPhase> phaseNotIn) {

        this.phaseNotIn = phaseNotIn;
        return this;
    }

    public BackupPlanWhereInput addPhaseNotInItem(BackupPlanPhase phaseNotInItem) {
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

    public BackupPlanWhereInput phaseNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PHASE_NOT_IN);
        return this;
    }

    public BackupPlanWhereInput phaseNotIn_ExplictlyNonNull() {
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

    public BackupPlanWhereInput physicalSize(Long physicalSize) {

        this.physicalSize = physicalSize;
        return this;
    }

    /**
     * Get physicalSize
     *
     * @return physicalSize
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getPhysicalSize() {
        return physicalSize;
    }

    public void setPhysicalSize(Long physicalSize) {
        this.physicalSize = physicalSize;
    }

    public BackupPlanWhereInput physicalSize_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PHYSICAL_SIZE);
        return this;
    }

    public BackupPlanWhereInput physicalSize_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PHYSICAL_SIZE);
        return this;
    }

    public void setPhysicalSize_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PHYSICAL_SIZE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PHYSICAL_SIZE);
        }
    }

    public boolean getPhysicalSize_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PHYSICAL_SIZE);
    }

    public BackupPlanWhereInput physicalSizeGt(Long physicalSizeGt) {

        this.physicalSizeGt = physicalSizeGt;
        return this;
    }

    /**
     * Get physicalSizeGt
     *
     * @return physicalSizeGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getPhysicalSizeGt() {
        return physicalSizeGt;
    }

    public void setPhysicalSizeGt(Long physicalSizeGt) {
        this.physicalSizeGt = physicalSizeGt;
    }

    public BackupPlanWhereInput physicalSizeGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PHYSICAL_SIZE_GT);
        return this;
    }

    public BackupPlanWhereInput physicalSizeGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PHYSICAL_SIZE_GT);
        return this;
    }

    public void setPhysicalSizeGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PHYSICAL_SIZE_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PHYSICAL_SIZE_GT);
        }
    }

    public boolean getPhysicalSizeGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PHYSICAL_SIZE_GT);
    }

    public BackupPlanWhereInput physicalSizeGte(Long physicalSizeGte) {

        this.physicalSizeGte = physicalSizeGte;
        return this;
    }

    /**
     * Get physicalSizeGte
     *
     * @return physicalSizeGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getPhysicalSizeGte() {
        return physicalSizeGte;
    }

    public void setPhysicalSizeGte(Long physicalSizeGte) {
        this.physicalSizeGte = physicalSizeGte;
    }

    public BackupPlanWhereInput physicalSizeGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PHYSICAL_SIZE_GTE);
        return this;
    }

    public BackupPlanWhereInput physicalSizeGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PHYSICAL_SIZE_GTE);
        return this;
    }

    public void setPhysicalSizeGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PHYSICAL_SIZE_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PHYSICAL_SIZE_GTE);
        }
    }

    public boolean getPhysicalSizeGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PHYSICAL_SIZE_GTE);
    }

    public BackupPlanWhereInput physicalSizeIn(List<Long> physicalSizeIn) {

        this.physicalSizeIn = physicalSizeIn;
        return this;
    }

    public BackupPlanWhereInput addPhysicalSizeInItem(Long physicalSizeInItem) {
        if (this.physicalSizeIn == null) {
            this.physicalSizeIn = new ArrayList<Long>();
        }
        this.physicalSizeIn.add(physicalSizeInItem);
        return this;
    }

    /**
     * Get physicalSizeIn
     *
     * @return physicalSizeIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getPhysicalSizeIn() {
        return physicalSizeIn;
    }

    public void setPhysicalSizeIn(List<Long> physicalSizeIn) {
        this.physicalSizeIn = physicalSizeIn;
    }

    public BackupPlanWhereInput physicalSizeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PHYSICAL_SIZE_IN);
        return this;
    }

    public BackupPlanWhereInput physicalSizeIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PHYSICAL_SIZE_IN);
        return this;
    }

    public void setPhysicalSizeIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PHYSICAL_SIZE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PHYSICAL_SIZE_IN);
        }
    }

    public boolean getPhysicalSizeIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PHYSICAL_SIZE_IN);
    }

    public BackupPlanWhereInput physicalSizeLt(Long physicalSizeLt) {

        this.physicalSizeLt = physicalSizeLt;
        return this;
    }

    /**
     * Get physicalSizeLt
     *
     * @return physicalSizeLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getPhysicalSizeLt() {
        return physicalSizeLt;
    }

    public void setPhysicalSizeLt(Long physicalSizeLt) {
        this.physicalSizeLt = physicalSizeLt;
    }

    public BackupPlanWhereInput physicalSizeLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PHYSICAL_SIZE_LT);
        return this;
    }

    public BackupPlanWhereInput physicalSizeLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PHYSICAL_SIZE_LT);
        return this;
    }

    public void setPhysicalSizeLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PHYSICAL_SIZE_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PHYSICAL_SIZE_LT);
        }
    }

    public boolean getPhysicalSizeLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PHYSICAL_SIZE_LT);
    }

    public BackupPlanWhereInput physicalSizeLte(Long physicalSizeLte) {

        this.physicalSizeLte = physicalSizeLte;
        return this;
    }

    /**
     * Get physicalSizeLte
     *
     * @return physicalSizeLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getPhysicalSizeLte() {
        return physicalSizeLte;
    }

    public void setPhysicalSizeLte(Long physicalSizeLte) {
        this.physicalSizeLte = physicalSizeLte;
    }

    public BackupPlanWhereInput physicalSizeLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PHYSICAL_SIZE_LTE);
        return this;
    }

    public BackupPlanWhereInput physicalSizeLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PHYSICAL_SIZE_LTE);
        return this;
    }

    public void setPhysicalSizeLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PHYSICAL_SIZE_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PHYSICAL_SIZE_LTE);
        }
    }

    public boolean getPhysicalSizeLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PHYSICAL_SIZE_LTE);
    }

    public BackupPlanWhereInput physicalSizeNot(Long physicalSizeNot) {

        this.physicalSizeNot = physicalSizeNot;
        return this;
    }

    /**
     * Get physicalSizeNot
     *
     * @return physicalSizeNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getPhysicalSizeNot() {
        return physicalSizeNot;
    }

    public void setPhysicalSizeNot(Long physicalSizeNot) {
        this.physicalSizeNot = physicalSizeNot;
    }

    public BackupPlanWhereInput physicalSizeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PHYSICAL_SIZE_NOT);
        return this;
    }

    public BackupPlanWhereInput physicalSizeNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PHYSICAL_SIZE_NOT);
        return this;
    }

    public void setPhysicalSizeNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PHYSICAL_SIZE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PHYSICAL_SIZE_NOT);
        }
    }

    public boolean getPhysicalSizeNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PHYSICAL_SIZE_NOT);
    }

    public BackupPlanWhereInput physicalSizeNotIn(List<Long> physicalSizeNotIn) {

        this.physicalSizeNotIn = physicalSizeNotIn;
        return this;
    }

    public BackupPlanWhereInput addPhysicalSizeNotInItem(Long physicalSizeNotInItem) {
        if (this.physicalSizeNotIn == null) {
            this.physicalSizeNotIn = new ArrayList<Long>();
        }
        this.physicalSizeNotIn.add(physicalSizeNotInItem);
        return this;
    }

    /**
     * Get physicalSizeNotIn
     *
     * @return physicalSizeNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getPhysicalSizeNotIn() {
        return physicalSizeNotIn;
    }

    public void setPhysicalSizeNotIn(List<Long> physicalSizeNotIn) {
        this.physicalSizeNotIn = physicalSizeNotIn;
    }

    public BackupPlanWhereInput physicalSizeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PHYSICAL_SIZE_NOT_IN);
        return this;
    }

    public BackupPlanWhereInput physicalSizeNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PHYSICAL_SIZE_NOT_IN);
        return this;
    }

    public void setPhysicalSizeNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PHYSICAL_SIZE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PHYSICAL_SIZE_NOT_IN);
        }
    }

    public boolean getPhysicalSizeNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PHYSICAL_SIZE_NOT_IN);
    }

    public BackupPlanWhereInput snapshotConsistentType(ConsistentType snapshotConsistentType) {

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

    public BackupPlanWhereInput snapshotConsistentType_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT_CONSISTENT_TYPE);
        return this;
    }

    public BackupPlanWhereInput snapshotConsistentType_ExplictlyNonNull() {
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

    public BackupPlanWhereInput snapshotConsistentTypeIn(
            List<ConsistentType> snapshotConsistentTypeIn) {

        this.snapshotConsistentTypeIn = snapshotConsistentTypeIn;
        return this;
    }

    public BackupPlanWhereInput addSnapshotConsistentTypeInItem(
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

    public BackupPlanWhereInput snapshotConsistentTypeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT_CONSISTENT_TYPE_IN);
        return this;
    }

    public BackupPlanWhereInput snapshotConsistentTypeIn_ExplictlyNonNull() {
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

    public BackupPlanWhereInput snapshotConsistentTypeNot(
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

    public BackupPlanWhereInput snapshotConsistentTypeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT_CONSISTENT_TYPE_NOT);
        return this;
    }

    public BackupPlanWhereInput snapshotConsistentTypeNot_ExplictlyNonNull() {
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

    public BackupPlanWhereInput snapshotConsistentTypeNotIn(
            List<ConsistentType> snapshotConsistentTypeNotIn) {

        this.snapshotConsistentTypeNotIn = snapshotConsistentTypeNotIn;
        return this;
    }

    public BackupPlanWhereInput addSnapshotConsistentTypeNotInItem(
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

    public BackupPlanWhereInput snapshotConsistentTypeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT_CONSISTENT_TYPE_NOT_IN);
        return this;
    }

    public BackupPlanWhereInput snapshotConsistentTypeNotIn_ExplictlyNonNull() {
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

    public BackupPlanWhereInput status(BackupPlanStatus status) {

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

    public BackupPlanWhereInput status_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATUS);
        return this;
    }

    public BackupPlanWhereInput status_ExplictlyNonNull() {
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

    public BackupPlanWhereInput statusIn(List<BackupPlanStatus> statusIn) {

        this.statusIn = statusIn;
        return this;
    }

    public BackupPlanWhereInput addStatusInItem(BackupPlanStatus statusInItem) {
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

    public BackupPlanWhereInput statusIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATUS_IN);
        return this;
    }

    public BackupPlanWhereInput statusIn_ExplictlyNonNull() {
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

    public BackupPlanWhereInput statusNot(BackupPlanStatus statusNot) {

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

    public BackupPlanWhereInput statusNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATUS_NOT);
        return this;
    }

    public BackupPlanWhereInput statusNot_ExplictlyNonNull() {
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

    public BackupPlanWhereInput statusNotIn(List<BackupPlanStatus> statusNotIn) {

        this.statusNotIn = statusNotIn;
        return this;
    }

    public BackupPlanWhereInput addStatusNotInItem(BackupPlanStatus statusNotInItem) {
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

    public BackupPlanWhereInput statusNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATUS_NOT_IN);
        return this;
    }

    public BackupPlanWhereInput statusNotIn_ExplictlyNonNull() {
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

    public BackupPlanWhereInput validSizeOfBackupObject(Long validSizeOfBackupObject) {

        this.validSizeOfBackupObject = validSizeOfBackupObject;
        return this;
    }

    /**
     * Get validSizeOfBackupObject
     *
     * @return validSizeOfBackupObject
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getValidSizeOfBackupObject() {
        return validSizeOfBackupObject;
    }

    public void setValidSizeOfBackupObject(Long validSizeOfBackupObject) {
        this.validSizeOfBackupObject = validSizeOfBackupObject;
    }

    public BackupPlanWhereInput validSizeOfBackupObject_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VALID_SIZE_OF_BACKUP_OBJECT);
        return this;
    }

    public BackupPlanWhereInput validSizeOfBackupObject_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VALID_SIZE_OF_BACKUP_OBJECT);
        return this;
    }

    public void setValidSizeOfBackupObject_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VALID_SIZE_OF_BACKUP_OBJECT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VALID_SIZE_OF_BACKUP_OBJECT);
        }
    }

    public boolean getValidSizeOfBackupObject_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VALID_SIZE_OF_BACKUP_OBJECT);
    }

    public BackupPlanWhereInput validSizeOfBackupObjectGt(Long validSizeOfBackupObjectGt) {

        this.validSizeOfBackupObjectGt = validSizeOfBackupObjectGt;
        return this;
    }

    /**
     * Get validSizeOfBackupObjectGt
     *
     * @return validSizeOfBackupObjectGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getValidSizeOfBackupObjectGt() {
        return validSizeOfBackupObjectGt;
    }

    public void setValidSizeOfBackupObjectGt(Long validSizeOfBackupObjectGt) {
        this.validSizeOfBackupObjectGt = validSizeOfBackupObjectGt;
    }

    public BackupPlanWhereInput validSizeOfBackupObjectGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VALID_SIZE_OF_BACKUP_OBJECT_GT);
        return this;
    }

    public BackupPlanWhereInput validSizeOfBackupObjectGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VALID_SIZE_OF_BACKUP_OBJECT_GT);
        return this;
    }

    public void setValidSizeOfBackupObjectGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VALID_SIZE_OF_BACKUP_OBJECT_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VALID_SIZE_OF_BACKUP_OBJECT_GT);
        }
    }

    public boolean getValidSizeOfBackupObjectGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VALID_SIZE_OF_BACKUP_OBJECT_GT);
    }

    public BackupPlanWhereInput validSizeOfBackupObjectGte(Long validSizeOfBackupObjectGte) {

        this.validSizeOfBackupObjectGte = validSizeOfBackupObjectGte;
        return this;
    }

    /**
     * Get validSizeOfBackupObjectGte
     *
     * @return validSizeOfBackupObjectGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getValidSizeOfBackupObjectGte() {
        return validSizeOfBackupObjectGte;
    }

    public void setValidSizeOfBackupObjectGte(Long validSizeOfBackupObjectGte) {
        this.validSizeOfBackupObjectGte = validSizeOfBackupObjectGte;
    }

    public BackupPlanWhereInput validSizeOfBackupObjectGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VALID_SIZE_OF_BACKUP_OBJECT_GTE);
        return this;
    }

    public BackupPlanWhereInput validSizeOfBackupObjectGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VALID_SIZE_OF_BACKUP_OBJECT_GTE);
        return this;
    }

    public void setValidSizeOfBackupObjectGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VALID_SIZE_OF_BACKUP_OBJECT_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VALID_SIZE_OF_BACKUP_OBJECT_GTE);
        }
    }

    public boolean getValidSizeOfBackupObjectGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VALID_SIZE_OF_BACKUP_OBJECT_GTE);
    }

    public BackupPlanWhereInput validSizeOfBackupObjectIn(List<Long> validSizeOfBackupObjectIn) {

        this.validSizeOfBackupObjectIn = validSizeOfBackupObjectIn;
        return this;
    }

    public BackupPlanWhereInput addValidSizeOfBackupObjectInItem(
            Long validSizeOfBackupObjectInItem) {
        if (this.validSizeOfBackupObjectIn == null) {
            this.validSizeOfBackupObjectIn = new ArrayList<Long>();
        }
        this.validSizeOfBackupObjectIn.add(validSizeOfBackupObjectInItem);
        return this;
    }

    /**
     * Get validSizeOfBackupObjectIn
     *
     * @return validSizeOfBackupObjectIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getValidSizeOfBackupObjectIn() {
        return validSizeOfBackupObjectIn;
    }

    public void setValidSizeOfBackupObjectIn(List<Long> validSizeOfBackupObjectIn) {
        this.validSizeOfBackupObjectIn = validSizeOfBackupObjectIn;
    }

    public BackupPlanWhereInput validSizeOfBackupObjectIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VALID_SIZE_OF_BACKUP_OBJECT_IN);
        return this;
    }

    public BackupPlanWhereInput validSizeOfBackupObjectIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VALID_SIZE_OF_BACKUP_OBJECT_IN);
        return this;
    }

    public void setValidSizeOfBackupObjectIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VALID_SIZE_OF_BACKUP_OBJECT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VALID_SIZE_OF_BACKUP_OBJECT_IN);
        }
    }

    public boolean getValidSizeOfBackupObjectIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VALID_SIZE_OF_BACKUP_OBJECT_IN);
    }

    public BackupPlanWhereInput validSizeOfBackupObjectLt(Long validSizeOfBackupObjectLt) {

        this.validSizeOfBackupObjectLt = validSizeOfBackupObjectLt;
        return this;
    }

    /**
     * Get validSizeOfBackupObjectLt
     *
     * @return validSizeOfBackupObjectLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getValidSizeOfBackupObjectLt() {
        return validSizeOfBackupObjectLt;
    }

    public void setValidSizeOfBackupObjectLt(Long validSizeOfBackupObjectLt) {
        this.validSizeOfBackupObjectLt = validSizeOfBackupObjectLt;
    }

    public BackupPlanWhereInput validSizeOfBackupObjectLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VALID_SIZE_OF_BACKUP_OBJECT_LT);
        return this;
    }

    public BackupPlanWhereInput validSizeOfBackupObjectLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VALID_SIZE_OF_BACKUP_OBJECT_LT);
        return this;
    }

    public void setValidSizeOfBackupObjectLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VALID_SIZE_OF_BACKUP_OBJECT_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VALID_SIZE_OF_BACKUP_OBJECT_LT);
        }
    }

    public boolean getValidSizeOfBackupObjectLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VALID_SIZE_OF_BACKUP_OBJECT_LT);
    }

    public BackupPlanWhereInput validSizeOfBackupObjectLte(Long validSizeOfBackupObjectLte) {

        this.validSizeOfBackupObjectLte = validSizeOfBackupObjectLte;
        return this;
    }

    /**
     * Get validSizeOfBackupObjectLte
     *
     * @return validSizeOfBackupObjectLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getValidSizeOfBackupObjectLte() {
        return validSizeOfBackupObjectLte;
    }

    public void setValidSizeOfBackupObjectLte(Long validSizeOfBackupObjectLte) {
        this.validSizeOfBackupObjectLte = validSizeOfBackupObjectLte;
    }

    public BackupPlanWhereInput validSizeOfBackupObjectLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VALID_SIZE_OF_BACKUP_OBJECT_LTE);
        return this;
    }

    public BackupPlanWhereInput validSizeOfBackupObjectLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VALID_SIZE_OF_BACKUP_OBJECT_LTE);
        return this;
    }

    public void setValidSizeOfBackupObjectLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VALID_SIZE_OF_BACKUP_OBJECT_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VALID_SIZE_OF_BACKUP_OBJECT_LTE);
        }
    }

    public boolean getValidSizeOfBackupObjectLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VALID_SIZE_OF_BACKUP_OBJECT_LTE);
    }

    public BackupPlanWhereInput validSizeOfBackupObjectNot(Long validSizeOfBackupObjectNot) {

        this.validSizeOfBackupObjectNot = validSizeOfBackupObjectNot;
        return this;
    }

    /**
     * Get validSizeOfBackupObjectNot
     *
     * @return validSizeOfBackupObjectNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getValidSizeOfBackupObjectNot() {
        return validSizeOfBackupObjectNot;
    }

    public void setValidSizeOfBackupObjectNot(Long validSizeOfBackupObjectNot) {
        this.validSizeOfBackupObjectNot = validSizeOfBackupObjectNot;
    }

    public BackupPlanWhereInput validSizeOfBackupObjectNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VALID_SIZE_OF_BACKUP_OBJECT_NOT);
        return this;
    }

    public BackupPlanWhereInput validSizeOfBackupObjectNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VALID_SIZE_OF_BACKUP_OBJECT_NOT);
        return this;
    }

    public void setValidSizeOfBackupObjectNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VALID_SIZE_OF_BACKUP_OBJECT_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VALID_SIZE_OF_BACKUP_OBJECT_NOT);
        }
    }

    public boolean getValidSizeOfBackupObjectNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VALID_SIZE_OF_BACKUP_OBJECT_NOT);
    }

    public BackupPlanWhereInput validSizeOfBackupObjectNotIn(
            List<Long> validSizeOfBackupObjectNotIn) {

        this.validSizeOfBackupObjectNotIn = validSizeOfBackupObjectNotIn;
        return this;
    }

    public BackupPlanWhereInput addValidSizeOfBackupObjectNotInItem(
            Long validSizeOfBackupObjectNotInItem) {
        if (this.validSizeOfBackupObjectNotIn == null) {
            this.validSizeOfBackupObjectNotIn = new ArrayList<Long>();
        }
        this.validSizeOfBackupObjectNotIn.add(validSizeOfBackupObjectNotInItem);
        return this;
    }

    /**
     * Get validSizeOfBackupObjectNotIn
     *
     * @return validSizeOfBackupObjectNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getValidSizeOfBackupObjectNotIn() {
        return validSizeOfBackupObjectNotIn;
    }

    public void setValidSizeOfBackupObjectNotIn(List<Long> validSizeOfBackupObjectNotIn) {
        this.validSizeOfBackupObjectNotIn = validSizeOfBackupObjectNotIn;
    }

    public BackupPlanWhereInput validSizeOfBackupObjectNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VALID_SIZE_OF_BACKUP_OBJECT_NOT_IN);
        return this;
    }

    public BackupPlanWhereInput validSizeOfBackupObjectNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VALID_SIZE_OF_BACKUP_OBJECT_NOT_IN);
        return this;
    }

    public void setValidSizeOfBackupObjectNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VALID_SIZE_OF_BACKUP_OBJECT_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VALID_SIZE_OF_BACKUP_OBJECT_NOT_IN);
        }
    }

    public boolean getValidSizeOfBackupObjectNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VALID_SIZE_OF_BACKUP_OBJECT_NOT_IN);
    }

    public BackupPlanWhereInput validSizeOfRestorePoint(Long validSizeOfRestorePoint) {

        this.validSizeOfRestorePoint = validSizeOfRestorePoint;
        return this;
    }

    /**
     * Get validSizeOfRestorePoint
     *
     * @return validSizeOfRestorePoint
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getValidSizeOfRestorePoint() {
        return validSizeOfRestorePoint;
    }

    public void setValidSizeOfRestorePoint(Long validSizeOfRestorePoint) {
        this.validSizeOfRestorePoint = validSizeOfRestorePoint;
    }

    public BackupPlanWhereInput validSizeOfRestorePoint_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VALID_SIZE_OF_RESTORE_POINT);
        return this;
    }

    public BackupPlanWhereInput validSizeOfRestorePoint_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VALID_SIZE_OF_RESTORE_POINT);
        return this;
    }

    public void setValidSizeOfRestorePoint_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VALID_SIZE_OF_RESTORE_POINT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VALID_SIZE_OF_RESTORE_POINT);
        }
    }

    public boolean getValidSizeOfRestorePoint_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VALID_SIZE_OF_RESTORE_POINT);
    }

    public BackupPlanWhereInput validSizeOfRestorePointGt(Long validSizeOfRestorePointGt) {

        this.validSizeOfRestorePointGt = validSizeOfRestorePointGt;
        return this;
    }

    /**
     * Get validSizeOfRestorePointGt
     *
     * @return validSizeOfRestorePointGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getValidSizeOfRestorePointGt() {
        return validSizeOfRestorePointGt;
    }

    public void setValidSizeOfRestorePointGt(Long validSizeOfRestorePointGt) {
        this.validSizeOfRestorePointGt = validSizeOfRestorePointGt;
    }

    public BackupPlanWhereInput validSizeOfRestorePointGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VALID_SIZE_OF_RESTORE_POINT_GT);
        return this;
    }

    public BackupPlanWhereInput validSizeOfRestorePointGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VALID_SIZE_OF_RESTORE_POINT_GT);
        return this;
    }

    public void setValidSizeOfRestorePointGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VALID_SIZE_OF_RESTORE_POINT_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VALID_SIZE_OF_RESTORE_POINT_GT);
        }
    }

    public boolean getValidSizeOfRestorePointGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VALID_SIZE_OF_RESTORE_POINT_GT);
    }

    public BackupPlanWhereInput validSizeOfRestorePointGte(Long validSizeOfRestorePointGte) {

        this.validSizeOfRestorePointGte = validSizeOfRestorePointGte;
        return this;
    }

    /**
     * Get validSizeOfRestorePointGte
     *
     * @return validSizeOfRestorePointGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getValidSizeOfRestorePointGte() {
        return validSizeOfRestorePointGte;
    }

    public void setValidSizeOfRestorePointGte(Long validSizeOfRestorePointGte) {
        this.validSizeOfRestorePointGte = validSizeOfRestorePointGte;
    }

    public BackupPlanWhereInput validSizeOfRestorePointGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VALID_SIZE_OF_RESTORE_POINT_GTE);
        return this;
    }

    public BackupPlanWhereInput validSizeOfRestorePointGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VALID_SIZE_OF_RESTORE_POINT_GTE);
        return this;
    }

    public void setValidSizeOfRestorePointGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VALID_SIZE_OF_RESTORE_POINT_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VALID_SIZE_OF_RESTORE_POINT_GTE);
        }
    }

    public boolean getValidSizeOfRestorePointGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VALID_SIZE_OF_RESTORE_POINT_GTE);
    }

    public BackupPlanWhereInput validSizeOfRestorePointIn(List<Long> validSizeOfRestorePointIn) {

        this.validSizeOfRestorePointIn = validSizeOfRestorePointIn;
        return this;
    }

    public BackupPlanWhereInput addValidSizeOfRestorePointInItem(
            Long validSizeOfRestorePointInItem) {
        if (this.validSizeOfRestorePointIn == null) {
            this.validSizeOfRestorePointIn = new ArrayList<Long>();
        }
        this.validSizeOfRestorePointIn.add(validSizeOfRestorePointInItem);
        return this;
    }

    /**
     * Get validSizeOfRestorePointIn
     *
     * @return validSizeOfRestorePointIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getValidSizeOfRestorePointIn() {
        return validSizeOfRestorePointIn;
    }

    public void setValidSizeOfRestorePointIn(List<Long> validSizeOfRestorePointIn) {
        this.validSizeOfRestorePointIn = validSizeOfRestorePointIn;
    }

    public BackupPlanWhereInput validSizeOfRestorePointIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VALID_SIZE_OF_RESTORE_POINT_IN);
        return this;
    }

    public BackupPlanWhereInput validSizeOfRestorePointIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VALID_SIZE_OF_RESTORE_POINT_IN);
        return this;
    }

    public void setValidSizeOfRestorePointIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VALID_SIZE_OF_RESTORE_POINT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VALID_SIZE_OF_RESTORE_POINT_IN);
        }
    }

    public boolean getValidSizeOfRestorePointIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VALID_SIZE_OF_RESTORE_POINT_IN);
    }

    public BackupPlanWhereInput validSizeOfRestorePointLt(Long validSizeOfRestorePointLt) {

        this.validSizeOfRestorePointLt = validSizeOfRestorePointLt;
        return this;
    }

    /**
     * Get validSizeOfRestorePointLt
     *
     * @return validSizeOfRestorePointLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getValidSizeOfRestorePointLt() {
        return validSizeOfRestorePointLt;
    }

    public void setValidSizeOfRestorePointLt(Long validSizeOfRestorePointLt) {
        this.validSizeOfRestorePointLt = validSizeOfRestorePointLt;
    }

    public BackupPlanWhereInput validSizeOfRestorePointLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VALID_SIZE_OF_RESTORE_POINT_LT);
        return this;
    }

    public BackupPlanWhereInput validSizeOfRestorePointLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VALID_SIZE_OF_RESTORE_POINT_LT);
        return this;
    }

    public void setValidSizeOfRestorePointLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VALID_SIZE_OF_RESTORE_POINT_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VALID_SIZE_OF_RESTORE_POINT_LT);
        }
    }

    public boolean getValidSizeOfRestorePointLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VALID_SIZE_OF_RESTORE_POINT_LT);
    }

    public BackupPlanWhereInput validSizeOfRestorePointLte(Long validSizeOfRestorePointLte) {

        this.validSizeOfRestorePointLte = validSizeOfRestorePointLte;
        return this;
    }

    /**
     * Get validSizeOfRestorePointLte
     *
     * @return validSizeOfRestorePointLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getValidSizeOfRestorePointLte() {
        return validSizeOfRestorePointLte;
    }

    public void setValidSizeOfRestorePointLte(Long validSizeOfRestorePointLte) {
        this.validSizeOfRestorePointLte = validSizeOfRestorePointLte;
    }

    public BackupPlanWhereInput validSizeOfRestorePointLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VALID_SIZE_OF_RESTORE_POINT_LTE);
        return this;
    }

    public BackupPlanWhereInput validSizeOfRestorePointLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VALID_SIZE_OF_RESTORE_POINT_LTE);
        return this;
    }

    public void setValidSizeOfRestorePointLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VALID_SIZE_OF_RESTORE_POINT_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VALID_SIZE_OF_RESTORE_POINT_LTE);
        }
    }

    public boolean getValidSizeOfRestorePointLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VALID_SIZE_OF_RESTORE_POINT_LTE);
    }

    public BackupPlanWhereInput validSizeOfRestorePointNot(Long validSizeOfRestorePointNot) {

        this.validSizeOfRestorePointNot = validSizeOfRestorePointNot;
        return this;
    }

    /**
     * Get validSizeOfRestorePointNot
     *
     * @return validSizeOfRestorePointNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getValidSizeOfRestorePointNot() {
        return validSizeOfRestorePointNot;
    }

    public void setValidSizeOfRestorePointNot(Long validSizeOfRestorePointNot) {
        this.validSizeOfRestorePointNot = validSizeOfRestorePointNot;
    }

    public BackupPlanWhereInput validSizeOfRestorePointNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VALID_SIZE_OF_RESTORE_POINT_NOT);
        return this;
    }

    public BackupPlanWhereInput validSizeOfRestorePointNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VALID_SIZE_OF_RESTORE_POINT_NOT);
        return this;
    }

    public void setValidSizeOfRestorePointNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VALID_SIZE_OF_RESTORE_POINT_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VALID_SIZE_OF_RESTORE_POINT_NOT);
        }
    }

    public boolean getValidSizeOfRestorePointNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VALID_SIZE_OF_RESTORE_POINT_NOT);
    }

    public BackupPlanWhereInput validSizeOfRestorePointNotIn(
            List<Long> validSizeOfRestorePointNotIn) {

        this.validSizeOfRestorePointNotIn = validSizeOfRestorePointNotIn;
        return this;
    }

    public BackupPlanWhereInput addValidSizeOfRestorePointNotInItem(
            Long validSizeOfRestorePointNotInItem) {
        if (this.validSizeOfRestorePointNotIn == null) {
            this.validSizeOfRestorePointNotIn = new ArrayList<Long>();
        }
        this.validSizeOfRestorePointNotIn.add(validSizeOfRestorePointNotInItem);
        return this;
    }

    /**
     * Get validSizeOfRestorePointNotIn
     *
     * @return validSizeOfRestorePointNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getValidSizeOfRestorePointNotIn() {
        return validSizeOfRestorePointNotIn;
    }

    public void setValidSizeOfRestorePointNotIn(List<Long> validSizeOfRestorePointNotIn) {
        this.validSizeOfRestorePointNotIn = validSizeOfRestorePointNotIn;
    }

    public BackupPlanWhereInput validSizeOfRestorePointNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VALID_SIZE_OF_RESTORE_POINT_NOT_IN);
        return this;
    }

    public BackupPlanWhereInput validSizeOfRestorePointNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VALID_SIZE_OF_RESTORE_POINT_NOT_IN);
        return this;
    }

    public void setValidSizeOfRestorePointNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VALID_SIZE_OF_RESTORE_POINT_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VALID_SIZE_OF_RESTORE_POINT_NOT_IN);
        }
    }

    public boolean getValidSizeOfRestorePointNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VALID_SIZE_OF_RESTORE_POINT_NOT_IN);
    }

    public BackupPlanWhereInput vmsEvery(VmWhereInput vmsEvery) {

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

    public BackupPlanWhereInput vmsEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VMS_EVERY);
        return this;
    }

    public BackupPlanWhereInput vmsEvery_ExplictlyNonNull() {
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

    public BackupPlanWhereInput vmsNone(VmWhereInput vmsNone) {

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

    public BackupPlanWhereInput vmsNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VMS_NONE);
        return this;
    }

    public BackupPlanWhereInput vmsNone_ExplictlyNonNull() {
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

    public BackupPlanWhereInput vmsSome(VmWhereInput vmsSome) {

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

    public BackupPlanWhereInput vmsSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VMS_SOME);
        return this;
    }

    public BackupPlanWhereInput vmsSome_ExplictlyNonNull() {
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

    public BackupPlanWhereInput windowEnd(String windowEnd) {

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

    public BackupPlanWhereInput windowEnd_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WINDOW_END);
        return this;
    }

    public BackupPlanWhereInput windowEnd_ExplictlyNonNull() {
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

    public BackupPlanWhereInput windowEndContains(String windowEndContains) {

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

    public BackupPlanWhereInput windowEndContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WINDOW_END_CONTAINS);
        return this;
    }

    public BackupPlanWhereInput windowEndContains_ExplictlyNonNull() {
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

    public BackupPlanWhereInput windowEndEndsWith(String windowEndEndsWith) {

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

    public BackupPlanWhereInput windowEndEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WINDOW_END_ENDS_WITH);
        return this;
    }

    public BackupPlanWhereInput windowEndEndsWith_ExplictlyNonNull() {
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

    public BackupPlanWhereInput windowEndGt(String windowEndGt) {

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

    public BackupPlanWhereInput windowEndGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WINDOW_END_GT);
        return this;
    }

    public BackupPlanWhereInput windowEndGt_ExplictlyNonNull() {
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

    public BackupPlanWhereInput windowEndGte(String windowEndGte) {

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

    public BackupPlanWhereInput windowEndGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WINDOW_END_GTE);
        return this;
    }

    public BackupPlanWhereInput windowEndGte_ExplictlyNonNull() {
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

    public BackupPlanWhereInput windowEndIn(List<String> windowEndIn) {

        this.windowEndIn = windowEndIn;
        return this;
    }

    public BackupPlanWhereInput addWindowEndInItem(String windowEndInItem) {
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

    public BackupPlanWhereInput windowEndIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WINDOW_END_IN);
        return this;
    }

    public BackupPlanWhereInput windowEndIn_ExplictlyNonNull() {
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

    public BackupPlanWhereInput windowEndLt(String windowEndLt) {

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

    public BackupPlanWhereInput windowEndLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WINDOW_END_LT);
        return this;
    }

    public BackupPlanWhereInput windowEndLt_ExplictlyNonNull() {
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

    public BackupPlanWhereInput windowEndLte(String windowEndLte) {

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

    public BackupPlanWhereInput windowEndLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WINDOW_END_LTE);
        return this;
    }

    public BackupPlanWhereInput windowEndLte_ExplictlyNonNull() {
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

    public BackupPlanWhereInput windowEndNot(String windowEndNot) {

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

    public BackupPlanWhereInput windowEndNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WINDOW_END_NOT);
        return this;
    }

    public BackupPlanWhereInput windowEndNot_ExplictlyNonNull() {
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

    public BackupPlanWhereInput windowEndNotContains(String windowEndNotContains) {

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

    public BackupPlanWhereInput windowEndNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WINDOW_END_NOT_CONTAINS);
        return this;
    }

    public BackupPlanWhereInput windowEndNotContains_ExplictlyNonNull() {
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

    public BackupPlanWhereInput windowEndNotEndsWith(String windowEndNotEndsWith) {

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

    public BackupPlanWhereInput windowEndNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WINDOW_END_NOT_ENDS_WITH);
        return this;
    }

    public BackupPlanWhereInput windowEndNotEndsWith_ExplictlyNonNull() {
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

    public BackupPlanWhereInput windowEndNotIn(List<String> windowEndNotIn) {

        this.windowEndNotIn = windowEndNotIn;
        return this;
    }

    public BackupPlanWhereInput addWindowEndNotInItem(String windowEndNotInItem) {
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

    public BackupPlanWhereInput windowEndNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WINDOW_END_NOT_IN);
        return this;
    }

    public BackupPlanWhereInput windowEndNotIn_ExplictlyNonNull() {
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

    public BackupPlanWhereInput windowEndNotStartsWith(String windowEndNotStartsWith) {

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

    public BackupPlanWhereInput windowEndNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WINDOW_END_NOT_STARTS_WITH);
        return this;
    }

    public BackupPlanWhereInput windowEndNotStartsWith_ExplictlyNonNull() {
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

    public BackupPlanWhereInput windowEndStartsWith(String windowEndStartsWith) {

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

    public BackupPlanWhereInput windowEndStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WINDOW_END_STARTS_WITH);
        return this;
    }

    public BackupPlanWhereInput windowEndStartsWith_ExplictlyNonNull() {
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

    public BackupPlanWhereInput windowStart(String windowStart) {

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

    public BackupPlanWhereInput windowStart_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WINDOW_START);
        return this;
    }

    public BackupPlanWhereInput windowStart_ExplictlyNonNull() {
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

    public BackupPlanWhereInput windowStartContains(String windowStartContains) {

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

    public BackupPlanWhereInput windowStartContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WINDOW_START_CONTAINS);
        return this;
    }

    public BackupPlanWhereInput windowStartContains_ExplictlyNonNull() {
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

    public BackupPlanWhereInput windowStartEndsWith(String windowStartEndsWith) {

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

    public BackupPlanWhereInput windowStartEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WINDOW_START_ENDS_WITH);
        return this;
    }

    public BackupPlanWhereInput windowStartEndsWith_ExplictlyNonNull() {
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

    public BackupPlanWhereInput windowStartGt(String windowStartGt) {

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

    public BackupPlanWhereInput windowStartGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WINDOW_START_GT);
        return this;
    }

    public BackupPlanWhereInput windowStartGt_ExplictlyNonNull() {
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

    public BackupPlanWhereInput windowStartGte(String windowStartGte) {

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

    public BackupPlanWhereInput windowStartGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WINDOW_START_GTE);
        return this;
    }

    public BackupPlanWhereInput windowStartGte_ExplictlyNonNull() {
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

    public BackupPlanWhereInput windowStartIn(List<String> windowStartIn) {

        this.windowStartIn = windowStartIn;
        return this;
    }

    public BackupPlanWhereInput addWindowStartInItem(String windowStartInItem) {
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

    public BackupPlanWhereInput windowStartIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WINDOW_START_IN);
        return this;
    }

    public BackupPlanWhereInput windowStartIn_ExplictlyNonNull() {
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

    public BackupPlanWhereInput windowStartLt(String windowStartLt) {

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

    public BackupPlanWhereInput windowStartLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WINDOW_START_LT);
        return this;
    }

    public BackupPlanWhereInput windowStartLt_ExplictlyNonNull() {
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

    public BackupPlanWhereInput windowStartLte(String windowStartLte) {

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

    public BackupPlanWhereInput windowStartLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WINDOW_START_LTE);
        return this;
    }

    public BackupPlanWhereInput windowStartLte_ExplictlyNonNull() {
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

    public BackupPlanWhereInput windowStartNot(String windowStartNot) {

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

    public BackupPlanWhereInput windowStartNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WINDOW_START_NOT);
        return this;
    }

    public BackupPlanWhereInput windowStartNot_ExplictlyNonNull() {
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

    public BackupPlanWhereInput windowStartNotContains(String windowStartNotContains) {

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

    public BackupPlanWhereInput windowStartNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WINDOW_START_NOT_CONTAINS);
        return this;
    }

    public BackupPlanWhereInput windowStartNotContains_ExplictlyNonNull() {
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

    public BackupPlanWhereInput windowStartNotEndsWith(String windowStartNotEndsWith) {

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

    public BackupPlanWhereInput windowStartNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WINDOW_START_NOT_ENDS_WITH);
        return this;
    }

    public BackupPlanWhereInput windowStartNotEndsWith_ExplictlyNonNull() {
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

    public BackupPlanWhereInput windowStartNotIn(List<String> windowStartNotIn) {

        this.windowStartNotIn = windowStartNotIn;
        return this;
    }

    public BackupPlanWhereInput addWindowStartNotInItem(String windowStartNotInItem) {
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

    public BackupPlanWhereInput windowStartNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WINDOW_START_NOT_IN);
        return this;
    }

    public BackupPlanWhereInput windowStartNotIn_ExplictlyNonNull() {
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

    public BackupPlanWhereInput windowStartNotStartsWith(String windowStartNotStartsWith) {

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

    public BackupPlanWhereInput windowStartNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WINDOW_START_NOT_STARTS_WITH);
        return this;
    }

    public BackupPlanWhereInput windowStartNotStartsWith_ExplictlyNonNull() {
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

    public BackupPlanWhereInput windowStartStartsWith(String windowStartStartsWith) {

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

    public BackupPlanWhereInput windowStartStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WINDOW_START_STARTS_WITH);
        return this;
    }

    public BackupPlanWhereInput windowStartStartsWith_ExplictlyNonNull() {
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
        BackupPlanWhereInput backupPlanWhereInput = (BackupPlanWhereInput) o;
        return Objects.equals(this.AND, backupPlanWhereInput.AND)
                && Objects.equals(this.NOT, backupPlanWhereInput.NOT)
                && Objects.equals(this.OR, backupPlanWhereInput.OR)
                && Objects.equals(this.backupDelayOption, backupPlanWhereInput.backupDelayOption)
                && Objects.equals(
                        this.backupDelayOptionIn, backupPlanWhereInput.backupDelayOptionIn)
                && Objects.equals(
                        this.backupDelayOptionNot, backupPlanWhereInput.backupDelayOptionNot)
                && Objects.equals(
                        this.backupDelayOptionNotIn, backupPlanWhereInput.backupDelayOptionNotIn)
                && Objects.equals(
                        this.backupPlanExecutionsEvery,
                        backupPlanWhereInput.backupPlanExecutionsEvery)
                && Objects.equals(
                        this.backupPlanExecutionsNone,
                        backupPlanWhereInput.backupPlanExecutionsNone)
                && Objects.equals(
                        this.backupPlanExecutionsSome,
                        backupPlanWhereInput.backupPlanExecutionsSome)
                && Objects.equals(
                        this.backupRestorePointCount, backupPlanWhereInput.backupRestorePointCount)
                && Objects.equals(
                        this.backupRestorePointCountGt,
                        backupPlanWhereInput.backupRestorePointCountGt)
                && Objects.equals(
                        this.backupRestorePointCountGte,
                        backupPlanWhereInput.backupRestorePointCountGte)
                && Objects.equals(
                        this.backupRestorePointCountIn,
                        backupPlanWhereInput.backupRestorePointCountIn)
                && Objects.equals(
                        this.backupRestorePointCountLt,
                        backupPlanWhereInput.backupRestorePointCountLt)
                && Objects.equals(
                        this.backupRestorePointCountLte,
                        backupPlanWhereInput.backupRestorePointCountLte)
                && Objects.equals(
                        this.backupRestorePointCountNot,
                        backupPlanWhereInput.backupRestorePointCountNot)
                && Objects.equals(
                        this.backupRestorePointCountNotIn,
                        backupPlanWhereInput.backupRestorePointCountNotIn)
                && Objects.equals(
                        this.backupRestorePointsEvery,
                        backupPlanWhereInput.backupRestorePointsEvery)
                && Objects.equals(
                        this.backupRestorePointsNone, backupPlanWhereInput.backupRestorePointsNone)
                && Objects.equals(
                        this.backupRestorePointsSome, backupPlanWhereInput.backupRestorePointsSome)
                && Objects.equals(this.backupService, backupPlanWhereInput.backupService)
                && Objects.equals(
                        this.backupStoreRepository, backupPlanWhereInput.backupStoreRepository)
                && Objects.equals(this.backupTotalSize, backupPlanWhereInput.backupTotalSize)
                && Objects.equals(this.backupTotalSizeGt, backupPlanWhereInput.backupTotalSizeGt)
                && Objects.equals(this.backupTotalSizeGte, backupPlanWhereInput.backupTotalSizeGte)
                && Objects.equals(this.backupTotalSizeIn, backupPlanWhereInput.backupTotalSizeIn)
                && Objects.equals(this.backupTotalSizeLt, backupPlanWhereInput.backupTotalSizeLt)
                && Objects.equals(this.backupTotalSizeLte, backupPlanWhereInput.backupTotalSizeLte)
                && Objects.equals(this.backupTotalSizeNot, backupPlanWhereInput.backupTotalSizeNot)
                && Objects.equals(
                        this.backupTotalSizeNotIn, backupPlanWhereInput.backupTotalSizeNotIn)
                && Objects.equals(this.compression, backupPlanWhereInput.compression)
                && Objects.equals(this.compressionNot, backupPlanWhereInput.compressionNot)
                && Objects.equals(this.compressionRatio, backupPlanWhereInput.compressionRatio)
                && Objects.equals(this.compressionRatioGt, backupPlanWhereInput.compressionRatioGt)
                && Objects.equals(
                        this.compressionRatioGte, backupPlanWhereInput.compressionRatioGte)
                && Objects.equals(this.compressionRatioIn, backupPlanWhereInput.compressionRatioIn)
                && Objects.equals(this.compressionRatioLt, backupPlanWhereInput.compressionRatioLt)
                && Objects.equals(
                        this.compressionRatioLte, backupPlanWhereInput.compressionRatioLte)
                && Objects.equals(
                        this.compressionRatioNot, backupPlanWhereInput.compressionRatioNot)
                && Objects.equals(
                        this.compressionRatioNotIn, backupPlanWhereInput.compressionRatioNotIn)
                && Objects.equals(this.createdAt, backupPlanWhereInput.createdAt)
                && Objects.equals(this.createdAtGt, backupPlanWhereInput.createdAtGt)
                && Objects.equals(this.createdAtGte, backupPlanWhereInput.createdAtGte)
                && Objects.equals(this.createdAtIn, backupPlanWhereInput.createdAtIn)
                && Objects.equals(this.createdAtLt, backupPlanWhereInput.createdAtLt)
                && Objects.equals(this.createdAtLte, backupPlanWhereInput.createdAtLte)
                && Objects.equals(this.createdAtNot, backupPlanWhereInput.createdAtNot)
                && Objects.equals(this.createdAtNotIn, backupPlanWhereInput.createdAtNotIn)
                && Objects.equals(this.deleteStrategy, backupPlanWhereInput.deleteStrategy)
                && Objects.equals(this.deleteStrategyIn, backupPlanWhereInput.deleteStrategyIn)
                && Objects.equals(this.deleteStrategyNot, backupPlanWhereInput.deleteStrategyNot)
                && Objects.equals(
                        this.deleteStrategyNotIn, backupPlanWhereInput.deleteStrategyNotIn)
                && Objects.equals(this.description, backupPlanWhereInput.description)
                && Objects.equals(
                        this.descriptionContains, backupPlanWhereInput.descriptionContains)
                && Objects.equals(
                        this.descriptionEndsWith, backupPlanWhereInput.descriptionEndsWith)
                && Objects.equals(this.descriptionGt, backupPlanWhereInput.descriptionGt)
                && Objects.equals(this.descriptionGte, backupPlanWhereInput.descriptionGte)
                && Objects.equals(this.descriptionIn, backupPlanWhereInput.descriptionIn)
                && Objects.equals(this.descriptionLt, backupPlanWhereInput.descriptionLt)
                && Objects.equals(this.descriptionLte, backupPlanWhereInput.descriptionLte)
                && Objects.equals(this.descriptionNot, backupPlanWhereInput.descriptionNot)
                && Objects.equals(
                        this.descriptionNotContains, backupPlanWhereInput.descriptionNotContains)
                && Objects.equals(
                        this.descriptionNotEndsWith, backupPlanWhereInput.descriptionNotEndsWith)
                && Objects.equals(this.descriptionNotIn, backupPlanWhereInput.descriptionNotIn)
                && Objects.equals(
                        this.descriptionNotStartsWith,
                        backupPlanWhereInput.descriptionNotStartsWith)
                && Objects.equals(
                        this.descriptionStartsWith, backupPlanWhereInput.descriptionStartsWith)
                && Objects.equals(this.enableWindow, backupPlanWhereInput.enableWindow)
                && Objects.equals(this.enableWindowNot, backupPlanWhereInput.enableWindowNot)
                && Objects.equals(this.entityAsyncStatus, backupPlanWhereInput.entityAsyncStatus)
                && Objects.equals(
                        this.entityAsyncStatusIn, backupPlanWhereInput.entityAsyncStatusIn)
                && Objects.equals(
                        this.entityAsyncStatusNot, backupPlanWhereInput.entityAsyncStatusNot)
                && Objects.equals(
                        this.entityAsyncStatusNotIn, backupPlanWhereInput.entityAsyncStatusNotIn)
                && Objects.equals(this.fullInterval, backupPlanWhereInput.fullInterval)
                && Objects.equals(this.fullIntervalGt, backupPlanWhereInput.fullIntervalGt)
                && Objects.equals(this.fullIntervalGte, backupPlanWhereInput.fullIntervalGte)
                && Objects.equals(this.fullIntervalIn, backupPlanWhereInput.fullIntervalIn)
                && Objects.equals(this.fullIntervalLt, backupPlanWhereInput.fullIntervalLt)
                && Objects.equals(this.fullIntervalLte, backupPlanWhereInput.fullIntervalLte)
                && Objects.equals(this.fullIntervalNot, backupPlanWhereInput.fullIntervalNot)
                && Objects.equals(this.fullIntervalNotIn, backupPlanWhereInput.fullIntervalNotIn)
                && Objects.equals(this.fullPeriod, backupPlanWhereInput.fullPeriod)
                && Objects.equals(this.fullPeriodIn, backupPlanWhereInput.fullPeriodIn)
                && Objects.equals(this.fullPeriodNot, backupPlanWhereInput.fullPeriodNot)
                && Objects.equals(this.fullPeriodNotIn, backupPlanWhereInput.fullPeriodNotIn)
                && Objects.equals(this.id, backupPlanWhereInput.id)
                && Objects.equals(this.idContains, backupPlanWhereInput.idContains)
                && Objects.equals(this.idEndsWith, backupPlanWhereInput.idEndsWith)
                && Objects.equals(this.idGt, backupPlanWhereInput.idGt)
                && Objects.equals(this.idGte, backupPlanWhereInput.idGte)
                && Objects.equals(this.idIn, backupPlanWhereInput.idIn)
                && Objects.equals(this.idLt, backupPlanWhereInput.idLt)
                && Objects.equals(this.idLte, backupPlanWhereInput.idLte)
                && Objects.equals(this.idNot, backupPlanWhereInput.idNot)
                && Objects.equals(this.idNotContains, backupPlanWhereInput.idNotContains)
                && Objects.equals(this.idNotEndsWith, backupPlanWhereInput.idNotEndsWith)
                && Objects.equals(this.idNotIn, backupPlanWhereInput.idNotIn)
                && Objects.equals(this.idNotStartsWith, backupPlanWhereInput.idNotStartsWith)
                && Objects.equals(this.idStartsWith, backupPlanWhereInput.idStartsWith)
                && Objects.equals(
                        this.incrementalInterval, backupPlanWhereInput.incrementalInterval)
                && Objects.equals(
                        this.incrementalIntervalGt, backupPlanWhereInput.incrementalIntervalGt)
                && Objects.equals(
                        this.incrementalIntervalGte, backupPlanWhereInput.incrementalIntervalGte)
                && Objects.equals(
                        this.incrementalIntervalIn, backupPlanWhereInput.incrementalIntervalIn)
                && Objects.equals(
                        this.incrementalIntervalLt, backupPlanWhereInput.incrementalIntervalLt)
                && Objects.equals(
                        this.incrementalIntervalLte, backupPlanWhereInput.incrementalIntervalLte)
                && Objects.equals(
                        this.incrementalIntervalNot, backupPlanWhereInput.incrementalIntervalNot)
                && Objects.equals(
                        this.incrementalIntervalNotIn,
                        backupPlanWhereInput.incrementalIntervalNotIn)
                && Objects.equals(this.incrementalPeriod, backupPlanWhereInput.incrementalPeriod)
                && Objects.equals(
                        this.incrementalPeriodIn, backupPlanWhereInput.incrementalPeriodIn)
                && Objects.equals(
                        this.incrementalPeriodNot, backupPlanWhereInput.incrementalPeriodNot)
                && Objects.equals(
                        this.incrementalPeriodNotIn, backupPlanWhereInput.incrementalPeriodNotIn)
                && Objects.equals(this.keepPolicy, backupPlanWhereInput.keepPolicy)
                && Objects.equals(this.keepPolicyIn, backupPlanWhereInput.keepPolicyIn)
                && Objects.equals(this.keepPolicyNot, backupPlanWhereInput.keepPolicyNot)
                && Objects.equals(this.keepPolicyNotIn, backupPlanWhereInput.keepPolicyNotIn)
                && Objects.equals(this.keepPolicyValue, backupPlanWhereInput.keepPolicyValue)
                && Objects.equals(this.keepPolicyValueGt, backupPlanWhereInput.keepPolicyValueGt)
                && Objects.equals(this.keepPolicyValueGte, backupPlanWhereInput.keepPolicyValueGte)
                && Objects.equals(this.keepPolicyValueIn, backupPlanWhereInput.keepPolicyValueIn)
                && Objects.equals(this.keepPolicyValueLt, backupPlanWhereInput.keepPolicyValueLt)
                && Objects.equals(this.keepPolicyValueLte, backupPlanWhereInput.keepPolicyValueLte)
                && Objects.equals(this.keepPolicyValueNot, backupPlanWhereInput.keepPolicyValueNot)
                && Objects.equals(
                        this.keepPolicyValueNotIn, backupPlanWhereInput.keepPolicyValueNotIn)
                && Objects.equals(this.lastExecuteStatus, backupPlanWhereInput.lastExecuteStatus)
                && Objects.equals(
                        this.lastExecuteStatusIn, backupPlanWhereInput.lastExecuteStatusIn)
                && Objects.equals(
                        this.lastExecuteStatusMessage,
                        backupPlanWhereInput.lastExecuteStatusMessage)
                && Objects.equals(
                        this.lastExecuteStatusMessageContains,
                        backupPlanWhereInput.lastExecuteStatusMessageContains)
                && Objects.equals(
                        this.lastExecuteStatusMessageEndsWith,
                        backupPlanWhereInput.lastExecuteStatusMessageEndsWith)
                && Objects.equals(
                        this.lastExecuteStatusMessageGt,
                        backupPlanWhereInput.lastExecuteStatusMessageGt)
                && Objects.equals(
                        this.lastExecuteStatusMessageGte,
                        backupPlanWhereInput.lastExecuteStatusMessageGte)
                && Objects.equals(
                        this.lastExecuteStatusMessageIn,
                        backupPlanWhereInput.lastExecuteStatusMessageIn)
                && Objects.equals(
                        this.lastExecuteStatusMessageLt,
                        backupPlanWhereInput.lastExecuteStatusMessageLt)
                && Objects.equals(
                        this.lastExecuteStatusMessageLte,
                        backupPlanWhereInput.lastExecuteStatusMessageLte)
                && Objects.equals(
                        this.lastExecuteStatusMessageNot,
                        backupPlanWhereInput.lastExecuteStatusMessageNot)
                && Objects.equals(
                        this.lastExecuteStatusMessageNotContains,
                        backupPlanWhereInput.lastExecuteStatusMessageNotContains)
                && Objects.equals(
                        this.lastExecuteStatusMessageNotEndsWith,
                        backupPlanWhereInput.lastExecuteStatusMessageNotEndsWith)
                && Objects.equals(
                        this.lastExecuteStatusMessageNotIn,
                        backupPlanWhereInput.lastExecuteStatusMessageNotIn)
                && Objects.equals(
                        this.lastExecuteStatusMessageNotStartsWith,
                        backupPlanWhereInput.lastExecuteStatusMessageNotStartsWith)
                && Objects.equals(
                        this.lastExecuteStatusMessageStartsWith,
                        backupPlanWhereInput.lastExecuteStatusMessageStartsWith)
                && Objects.equals(
                        this.lastExecuteStatusNot, backupPlanWhereInput.lastExecuteStatusNot)
                && Objects.equals(
                        this.lastExecuteStatusNotIn, backupPlanWhereInput.lastExecuteStatusNotIn)
                && Objects.equals(
                        this.lastExecuteSuccessJobCount,
                        backupPlanWhereInput.lastExecuteSuccessJobCount)
                && Objects.equals(
                        this.lastExecuteSuccessJobCountGt,
                        backupPlanWhereInput.lastExecuteSuccessJobCountGt)
                && Objects.equals(
                        this.lastExecuteSuccessJobCountGte,
                        backupPlanWhereInput.lastExecuteSuccessJobCountGte)
                && Objects.equals(
                        this.lastExecuteSuccessJobCountIn,
                        backupPlanWhereInput.lastExecuteSuccessJobCountIn)
                && Objects.equals(
                        this.lastExecuteSuccessJobCountLt,
                        backupPlanWhereInput.lastExecuteSuccessJobCountLt)
                && Objects.equals(
                        this.lastExecuteSuccessJobCountLte,
                        backupPlanWhereInput.lastExecuteSuccessJobCountLte)
                && Objects.equals(
                        this.lastExecuteSuccessJobCountNot,
                        backupPlanWhereInput.lastExecuteSuccessJobCountNot)
                && Objects.equals(
                        this.lastExecuteSuccessJobCountNotIn,
                        backupPlanWhereInput.lastExecuteSuccessJobCountNotIn)
                && Objects.equals(
                        this.lastExecuteTotalJobCount,
                        backupPlanWhereInput.lastExecuteTotalJobCount)
                && Objects.equals(
                        this.lastExecuteTotalJobCountGt,
                        backupPlanWhereInput.lastExecuteTotalJobCountGt)
                && Objects.equals(
                        this.lastExecuteTotalJobCountGte,
                        backupPlanWhereInput.lastExecuteTotalJobCountGte)
                && Objects.equals(
                        this.lastExecuteTotalJobCountIn,
                        backupPlanWhereInput.lastExecuteTotalJobCountIn)
                && Objects.equals(
                        this.lastExecuteTotalJobCountLt,
                        backupPlanWhereInput.lastExecuteTotalJobCountLt)
                && Objects.equals(
                        this.lastExecuteTotalJobCountLte,
                        backupPlanWhereInput.lastExecuteTotalJobCountLte)
                && Objects.equals(
                        this.lastExecuteTotalJobCountNot,
                        backupPlanWhereInput.lastExecuteTotalJobCountNot)
                && Objects.equals(
                        this.lastExecuteTotalJobCountNotIn,
                        backupPlanWhereInput.lastExecuteTotalJobCountNotIn)
                && Objects.equals(this.lastExecutedAt, backupPlanWhereInput.lastExecutedAt)
                && Objects.equals(this.lastExecutedAtGt, backupPlanWhereInput.lastExecutedAtGt)
                && Objects.equals(this.lastExecutedAtGte, backupPlanWhereInput.lastExecutedAtGte)
                && Objects.equals(this.lastExecutedAtIn, backupPlanWhereInput.lastExecutedAtIn)
                && Objects.equals(this.lastExecutedAtLt, backupPlanWhereInput.lastExecutedAtLt)
                && Objects.equals(this.lastExecutedAtLte, backupPlanWhereInput.lastExecutedAtLte)
                && Objects.equals(this.lastExecutedAtNot, backupPlanWhereInput.lastExecutedAtNot)
                && Objects.equals(
                        this.lastExecutedAtNotIn, backupPlanWhereInput.lastExecutedAtNotIn)
                && Objects.equals(
                        this.lastManualExecuteStatus, backupPlanWhereInput.lastManualExecuteStatus)
                && Objects.equals(
                        this.lastManualExecuteStatusIn,
                        backupPlanWhereInput.lastManualExecuteStatusIn)
                && Objects.equals(
                        this.lastManualExecuteStatusMessage,
                        backupPlanWhereInput.lastManualExecuteStatusMessage)
                && Objects.equals(
                        this.lastManualExecuteStatusMessageContains,
                        backupPlanWhereInput.lastManualExecuteStatusMessageContains)
                && Objects.equals(
                        this.lastManualExecuteStatusMessageEndsWith,
                        backupPlanWhereInput.lastManualExecuteStatusMessageEndsWith)
                && Objects.equals(
                        this.lastManualExecuteStatusMessageGt,
                        backupPlanWhereInput.lastManualExecuteStatusMessageGt)
                && Objects.equals(
                        this.lastManualExecuteStatusMessageGte,
                        backupPlanWhereInput.lastManualExecuteStatusMessageGte)
                && Objects.equals(
                        this.lastManualExecuteStatusMessageIn,
                        backupPlanWhereInput.lastManualExecuteStatusMessageIn)
                && Objects.equals(
                        this.lastManualExecuteStatusMessageLt,
                        backupPlanWhereInput.lastManualExecuteStatusMessageLt)
                && Objects.equals(
                        this.lastManualExecuteStatusMessageLte,
                        backupPlanWhereInput.lastManualExecuteStatusMessageLte)
                && Objects.equals(
                        this.lastManualExecuteStatusMessageNot,
                        backupPlanWhereInput.lastManualExecuteStatusMessageNot)
                && Objects.equals(
                        this.lastManualExecuteStatusMessageNotContains,
                        backupPlanWhereInput.lastManualExecuteStatusMessageNotContains)
                && Objects.equals(
                        this.lastManualExecuteStatusMessageNotEndsWith,
                        backupPlanWhereInput.lastManualExecuteStatusMessageNotEndsWith)
                && Objects.equals(
                        this.lastManualExecuteStatusMessageNotIn,
                        backupPlanWhereInput.lastManualExecuteStatusMessageNotIn)
                && Objects.equals(
                        this.lastManualExecuteStatusMessageNotStartsWith,
                        backupPlanWhereInput.lastManualExecuteStatusMessageNotStartsWith)
                && Objects.equals(
                        this.lastManualExecuteStatusMessageStartsWith,
                        backupPlanWhereInput.lastManualExecuteStatusMessageStartsWith)
                && Objects.equals(
                        this.lastManualExecuteStatusNot,
                        backupPlanWhereInput.lastManualExecuteStatusNot)
                && Objects.equals(
                        this.lastManualExecuteStatusNotIn,
                        backupPlanWhereInput.lastManualExecuteStatusNotIn)
                && Objects.equals(
                        this.lastManualExecuteSuccessJobCount,
                        backupPlanWhereInput.lastManualExecuteSuccessJobCount)
                && Objects.equals(
                        this.lastManualExecuteSuccessJobCountGt,
                        backupPlanWhereInput.lastManualExecuteSuccessJobCountGt)
                && Objects.equals(
                        this.lastManualExecuteSuccessJobCountGte,
                        backupPlanWhereInput.lastManualExecuteSuccessJobCountGte)
                && Objects.equals(
                        this.lastManualExecuteSuccessJobCountIn,
                        backupPlanWhereInput.lastManualExecuteSuccessJobCountIn)
                && Objects.equals(
                        this.lastManualExecuteSuccessJobCountLt,
                        backupPlanWhereInput.lastManualExecuteSuccessJobCountLt)
                && Objects.equals(
                        this.lastManualExecuteSuccessJobCountLte,
                        backupPlanWhereInput.lastManualExecuteSuccessJobCountLte)
                && Objects.equals(
                        this.lastManualExecuteSuccessJobCountNot,
                        backupPlanWhereInput.lastManualExecuteSuccessJobCountNot)
                && Objects.equals(
                        this.lastManualExecuteSuccessJobCountNotIn,
                        backupPlanWhereInput.lastManualExecuteSuccessJobCountNotIn)
                && Objects.equals(
                        this.lastManualExecuteTotalJobCount,
                        backupPlanWhereInput.lastManualExecuteTotalJobCount)
                && Objects.equals(
                        this.lastManualExecuteTotalJobCountGt,
                        backupPlanWhereInput.lastManualExecuteTotalJobCountGt)
                && Objects.equals(
                        this.lastManualExecuteTotalJobCountGte,
                        backupPlanWhereInput.lastManualExecuteTotalJobCountGte)
                && Objects.equals(
                        this.lastManualExecuteTotalJobCountIn,
                        backupPlanWhereInput.lastManualExecuteTotalJobCountIn)
                && Objects.equals(
                        this.lastManualExecuteTotalJobCountLt,
                        backupPlanWhereInput.lastManualExecuteTotalJobCountLt)
                && Objects.equals(
                        this.lastManualExecuteTotalJobCountLte,
                        backupPlanWhereInput.lastManualExecuteTotalJobCountLte)
                && Objects.equals(
                        this.lastManualExecuteTotalJobCountNot,
                        backupPlanWhereInput.lastManualExecuteTotalJobCountNot)
                && Objects.equals(
                        this.lastManualExecuteTotalJobCountNotIn,
                        backupPlanWhereInput.lastManualExecuteTotalJobCountNotIn)
                && Objects.equals(
                        this.lastManualExecutedAt, backupPlanWhereInput.lastManualExecutedAt)
                && Objects.equals(
                        this.lastManualExecutedAtGt, backupPlanWhereInput.lastManualExecutedAtGt)
                && Objects.equals(
                        this.lastManualExecutedAtGte, backupPlanWhereInput.lastManualExecutedAtGte)
                && Objects.equals(
                        this.lastManualExecutedAtIn, backupPlanWhereInput.lastManualExecutedAtIn)
                && Objects.equals(
                        this.lastManualExecutedAtLt, backupPlanWhereInput.lastManualExecutedAtLt)
                && Objects.equals(
                        this.lastManualExecutedAtLte, backupPlanWhereInput.lastManualExecutedAtLte)
                && Objects.equals(
                        this.lastManualExecutedAtNot, backupPlanWhereInput.lastManualExecutedAtNot)
                && Objects.equals(
                        this.lastManualExecutedAtNotIn,
                        backupPlanWhereInput.lastManualExecutedAtNotIn)
                && Objects.equals(this.logicalSize, backupPlanWhereInput.logicalSize)
                && Objects.equals(this.logicalSizeGt, backupPlanWhereInput.logicalSizeGt)
                && Objects.equals(this.logicalSizeGte, backupPlanWhereInput.logicalSizeGte)
                && Objects.equals(this.logicalSizeIn, backupPlanWhereInput.logicalSizeIn)
                && Objects.equals(this.logicalSizeLt, backupPlanWhereInput.logicalSizeLt)
                && Objects.equals(this.logicalSizeLte, backupPlanWhereInput.logicalSizeLte)
                && Objects.equals(this.logicalSizeNot, backupPlanWhereInput.logicalSizeNot)
                && Objects.equals(this.logicalSizeNotIn, backupPlanWhereInput.logicalSizeNotIn)
                && Objects.equals(this.name, backupPlanWhereInput.name)
                && Objects.equals(this.nameContains, backupPlanWhereInput.nameContains)
                && Objects.equals(this.nameEndsWith, backupPlanWhereInput.nameEndsWith)
                && Objects.equals(this.nameGt, backupPlanWhereInput.nameGt)
                && Objects.equals(this.nameGte, backupPlanWhereInput.nameGte)
                && Objects.equals(this.nameIn, backupPlanWhereInput.nameIn)
                && Objects.equals(this.nameLt, backupPlanWhereInput.nameLt)
                && Objects.equals(this.nameLte, backupPlanWhereInput.nameLte)
                && Objects.equals(this.nameNot, backupPlanWhereInput.nameNot)
                && Objects.equals(this.nameNotContains, backupPlanWhereInput.nameNotContains)
                && Objects.equals(this.nameNotEndsWith, backupPlanWhereInput.nameNotEndsWith)
                && Objects.equals(this.nameNotIn, backupPlanWhereInput.nameNotIn)
                && Objects.equals(this.nameNotStartsWith, backupPlanWhereInput.nameNotStartsWith)
                && Objects.equals(this.nameStartsWith, backupPlanWhereInput.nameStartsWith)
                && Objects.equals(this.nextExecuteTime, backupPlanWhereInput.nextExecuteTime)
                && Objects.equals(this.nextExecuteTimeGt, backupPlanWhereInput.nextExecuteTimeGt)
                && Objects.equals(this.nextExecuteTimeGte, backupPlanWhereInput.nextExecuteTimeGte)
                && Objects.equals(this.nextExecuteTimeIn, backupPlanWhereInput.nextExecuteTimeIn)
                && Objects.equals(this.nextExecuteTimeLt, backupPlanWhereInput.nextExecuteTimeLt)
                && Objects.equals(this.nextExecuteTimeLte, backupPlanWhereInput.nextExecuteTimeLte)
                && Objects.equals(this.nextExecuteTimeNot, backupPlanWhereInput.nextExecuteTimeNot)
                && Objects.equals(
                        this.nextExecuteTimeNotIn, backupPlanWhereInput.nextExecuteTimeNotIn)
                && Objects.equals(this.phase, backupPlanWhereInput.phase)
                && Objects.equals(this.phaseIn, backupPlanWhereInput.phaseIn)
                && Objects.equals(this.phaseNot, backupPlanWhereInput.phaseNot)
                && Objects.equals(this.phaseNotIn, backupPlanWhereInput.phaseNotIn)
                && Objects.equals(this.physicalSize, backupPlanWhereInput.physicalSize)
                && Objects.equals(this.physicalSizeGt, backupPlanWhereInput.physicalSizeGt)
                && Objects.equals(this.physicalSizeGte, backupPlanWhereInput.physicalSizeGte)
                && Objects.equals(this.physicalSizeIn, backupPlanWhereInput.physicalSizeIn)
                && Objects.equals(this.physicalSizeLt, backupPlanWhereInput.physicalSizeLt)
                && Objects.equals(this.physicalSizeLte, backupPlanWhereInput.physicalSizeLte)
                && Objects.equals(this.physicalSizeNot, backupPlanWhereInput.physicalSizeNot)
                && Objects.equals(this.physicalSizeNotIn, backupPlanWhereInput.physicalSizeNotIn)
                && Objects.equals(
                        this.snapshotConsistentType, backupPlanWhereInput.snapshotConsistentType)
                && Objects.equals(
                        this.snapshotConsistentTypeIn,
                        backupPlanWhereInput.snapshotConsistentTypeIn)
                && Objects.equals(
                        this.snapshotConsistentTypeNot,
                        backupPlanWhereInput.snapshotConsistentTypeNot)
                && Objects.equals(
                        this.snapshotConsistentTypeNotIn,
                        backupPlanWhereInput.snapshotConsistentTypeNotIn)
                && Objects.equals(this.status, backupPlanWhereInput.status)
                && Objects.equals(this.statusIn, backupPlanWhereInput.statusIn)
                && Objects.equals(this.statusNot, backupPlanWhereInput.statusNot)
                && Objects.equals(this.statusNotIn, backupPlanWhereInput.statusNotIn)
                && Objects.equals(
                        this.validSizeOfBackupObject, backupPlanWhereInput.validSizeOfBackupObject)
                && Objects.equals(
                        this.validSizeOfBackupObjectGt,
                        backupPlanWhereInput.validSizeOfBackupObjectGt)
                && Objects.equals(
                        this.validSizeOfBackupObjectGte,
                        backupPlanWhereInput.validSizeOfBackupObjectGte)
                && Objects.equals(
                        this.validSizeOfBackupObjectIn,
                        backupPlanWhereInput.validSizeOfBackupObjectIn)
                && Objects.equals(
                        this.validSizeOfBackupObjectLt,
                        backupPlanWhereInput.validSizeOfBackupObjectLt)
                && Objects.equals(
                        this.validSizeOfBackupObjectLte,
                        backupPlanWhereInput.validSizeOfBackupObjectLte)
                && Objects.equals(
                        this.validSizeOfBackupObjectNot,
                        backupPlanWhereInput.validSizeOfBackupObjectNot)
                && Objects.equals(
                        this.validSizeOfBackupObjectNotIn,
                        backupPlanWhereInput.validSizeOfBackupObjectNotIn)
                && Objects.equals(
                        this.validSizeOfRestorePoint, backupPlanWhereInput.validSizeOfRestorePoint)
                && Objects.equals(
                        this.validSizeOfRestorePointGt,
                        backupPlanWhereInput.validSizeOfRestorePointGt)
                && Objects.equals(
                        this.validSizeOfRestorePointGte,
                        backupPlanWhereInput.validSizeOfRestorePointGte)
                && Objects.equals(
                        this.validSizeOfRestorePointIn,
                        backupPlanWhereInput.validSizeOfRestorePointIn)
                && Objects.equals(
                        this.validSizeOfRestorePointLt,
                        backupPlanWhereInput.validSizeOfRestorePointLt)
                && Objects.equals(
                        this.validSizeOfRestorePointLte,
                        backupPlanWhereInput.validSizeOfRestorePointLte)
                && Objects.equals(
                        this.validSizeOfRestorePointNot,
                        backupPlanWhereInput.validSizeOfRestorePointNot)
                && Objects.equals(
                        this.validSizeOfRestorePointNotIn,
                        backupPlanWhereInput.validSizeOfRestorePointNotIn)
                && Objects.equals(this.vmsEvery, backupPlanWhereInput.vmsEvery)
                && Objects.equals(this.vmsNone, backupPlanWhereInput.vmsNone)
                && Objects.equals(this.vmsSome, backupPlanWhereInput.vmsSome)
                && Objects.equals(this.windowEnd, backupPlanWhereInput.windowEnd)
                && Objects.equals(this.windowEndContains, backupPlanWhereInput.windowEndContains)
                && Objects.equals(this.windowEndEndsWith, backupPlanWhereInput.windowEndEndsWith)
                && Objects.equals(this.windowEndGt, backupPlanWhereInput.windowEndGt)
                && Objects.equals(this.windowEndGte, backupPlanWhereInput.windowEndGte)
                && Objects.equals(this.windowEndIn, backupPlanWhereInput.windowEndIn)
                && Objects.equals(this.windowEndLt, backupPlanWhereInput.windowEndLt)
                && Objects.equals(this.windowEndLte, backupPlanWhereInput.windowEndLte)
                && Objects.equals(this.windowEndNot, backupPlanWhereInput.windowEndNot)
                && Objects.equals(
                        this.windowEndNotContains, backupPlanWhereInput.windowEndNotContains)
                && Objects.equals(
                        this.windowEndNotEndsWith, backupPlanWhereInput.windowEndNotEndsWith)
                && Objects.equals(this.windowEndNotIn, backupPlanWhereInput.windowEndNotIn)
                && Objects.equals(
                        this.windowEndNotStartsWith, backupPlanWhereInput.windowEndNotStartsWith)
                && Objects.equals(
                        this.windowEndStartsWith, backupPlanWhereInput.windowEndStartsWith)
                && Objects.equals(this.windowStart, backupPlanWhereInput.windowStart)
                && Objects.equals(
                        this.windowStartContains, backupPlanWhereInput.windowStartContains)
                && Objects.equals(
                        this.windowStartEndsWith, backupPlanWhereInput.windowStartEndsWith)
                && Objects.equals(this.windowStartGt, backupPlanWhereInput.windowStartGt)
                && Objects.equals(this.windowStartGte, backupPlanWhereInput.windowStartGte)
                && Objects.equals(this.windowStartIn, backupPlanWhereInput.windowStartIn)
                && Objects.equals(this.windowStartLt, backupPlanWhereInput.windowStartLt)
                && Objects.equals(this.windowStartLte, backupPlanWhereInput.windowStartLte)
                && Objects.equals(this.windowStartNot, backupPlanWhereInput.windowStartNot)
                && Objects.equals(
                        this.windowStartNotContains, backupPlanWhereInput.windowStartNotContains)
                && Objects.equals(
                        this.windowStartNotEndsWith, backupPlanWhereInput.windowStartNotEndsWith)
                && Objects.equals(this.windowStartNotIn, backupPlanWhereInput.windowStartNotIn)
                && Objects.equals(
                        this.windowStartNotStartsWith,
                        backupPlanWhereInput.windowStartNotStartsWith)
                && Objects.equals(
                        this.windowStartStartsWith, backupPlanWhereInput.windowStartStartsWith);
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
                backupDelayOption,
                backupDelayOptionIn,
                backupDelayOptionNot,
                backupDelayOptionNotIn,
                backupPlanExecutionsEvery,
                backupPlanExecutionsNone,
                backupPlanExecutionsSome,
                backupRestorePointCount,
                backupRestorePointCountGt,
                backupRestorePointCountGte,
                backupRestorePointCountIn,
                backupRestorePointCountLt,
                backupRestorePointCountLte,
                backupRestorePointCountNot,
                backupRestorePointCountNotIn,
                backupRestorePointsEvery,
                backupRestorePointsNone,
                backupRestorePointsSome,
                backupService,
                backupStoreRepository,
                backupTotalSize,
                backupTotalSizeGt,
                backupTotalSizeGte,
                backupTotalSizeIn,
                backupTotalSizeLt,
                backupTotalSizeLte,
                backupTotalSizeNot,
                backupTotalSizeNotIn,
                compression,
                compressionNot,
                compressionRatio,
                compressionRatioGt,
                compressionRatioGte,
                compressionRatioIn,
                compressionRatioLt,
                compressionRatioLte,
                compressionRatioNot,
                compressionRatioNotIn,
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
                enableWindow,
                enableWindowNot,
                entityAsyncStatus,
                entityAsyncStatusIn,
                entityAsyncStatusNot,
                entityAsyncStatusNotIn,
                fullInterval,
                fullIntervalGt,
                fullIntervalGte,
                fullIntervalIn,
                fullIntervalLt,
                fullIntervalLte,
                fullIntervalNot,
                fullIntervalNotIn,
                fullPeriod,
                fullPeriodIn,
                fullPeriodNot,
                fullPeriodNotIn,
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
                incrementalInterval,
                incrementalIntervalGt,
                incrementalIntervalGte,
                incrementalIntervalIn,
                incrementalIntervalLt,
                incrementalIntervalLte,
                incrementalIntervalNot,
                incrementalIntervalNotIn,
                incrementalPeriod,
                incrementalPeriodIn,
                incrementalPeriodNot,
                incrementalPeriodNotIn,
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
                logicalSize,
                logicalSizeGt,
                logicalSizeGte,
                logicalSizeIn,
                logicalSizeLt,
                logicalSizeLte,
                logicalSizeNot,
                logicalSizeNotIn,
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
                nextExecuteTime,
                nextExecuteTimeGt,
                nextExecuteTimeGte,
                nextExecuteTimeIn,
                nextExecuteTimeLt,
                nextExecuteTimeLte,
                nextExecuteTimeNot,
                nextExecuteTimeNotIn,
                phase,
                phaseIn,
                phaseNot,
                phaseNotIn,
                physicalSize,
                physicalSizeGt,
                physicalSizeGte,
                physicalSizeIn,
                physicalSizeLt,
                physicalSizeLte,
                physicalSizeNot,
                physicalSizeNotIn,
                snapshotConsistentType,
                snapshotConsistentTypeIn,
                snapshotConsistentTypeNot,
                snapshotConsistentTypeNotIn,
                status,
                statusIn,
                statusNot,
                statusNotIn,
                validSizeOfBackupObject,
                validSizeOfBackupObjectGt,
                validSizeOfBackupObjectGte,
                validSizeOfBackupObjectIn,
                validSizeOfBackupObjectLt,
                validSizeOfBackupObjectLte,
                validSizeOfBackupObjectNot,
                validSizeOfBackupObjectNotIn,
                validSizeOfRestorePoint,
                validSizeOfRestorePointGt,
                validSizeOfRestorePointGte,
                validSizeOfRestorePointIn,
                validSizeOfRestorePointLt,
                validSizeOfRestorePointLte,
                validSizeOfRestorePointNot,
                validSizeOfRestorePointNotIn,
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
        sb.append("class BackupPlanWhereInput {\n");
        sb.append("    AND: ").append(toIndentedString(AND)).append("\n");
        sb.append("    NOT: ").append(toIndentedString(NOT)).append("\n");
        sb.append("    OR: ").append(toIndentedString(OR)).append("\n");
        sb.append("    backupDelayOption: ")
                .append(toIndentedString(backupDelayOption))
                .append("\n");
        sb.append("    backupDelayOptionIn: ")
                .append(toIndentedString(backupDelayOptionIn))
                .append("\n");
        sb.append("    backupDelayOptionNot: ")
                .append(toIndentedString(backupDelayOptionNot))
                .append("\n");
        sb.append("    backupDelayOptionNotIn: ")
                .append(toIndentedString(backupDelayOptionNotIn))
                .append("\n");
        sb.append("    backupPlanExecutionsEvery: ")
                .append(toIndentedString(backupPlanExecutionsEvery))
                .append("\n");
        sb.append("    backupPlanExecutionsNone: ")
                .append(toIndentedString(backupPlanExecutionsNone))
                .append("\n");
        sb.append("    backupPlanExecutionsSome: ")
                .append(toIndentedString(backupPlanExecutionsSome))
                .append("\n");
        sb.append("    backupRestorePointCount: ")
                .append(toIndentedString(backupRestorePointCount))
                .append("\n");
        sb.append("    backupRestorePointCountGt: ")
                .append(toIndentedString(backupRestorePointCountGt))
                .append("\n");
        sb.append("    backupRestorePointCountGte: ")
                .append(toIndentedString(backupRestorePointCountGte))
                .append("\n");
        sb.append("    backupRestorePointCountIn: ")
                .append(toIndentedString(backupRestorePointCountIn))
                .append("\n");
        sb.append("    backupRestorePointCountLt: ")
                .append(toIndentedString(backupRestorePointCountLt))
                .append("\n");
        sb.append("    backupRestorePointCountLte: ")
                .append(toIndentedString(backupRestorePointCountLte))
                .append("\n");
        sb.append("    backupRestorePointCountNot: ")
                .append(toIndentedString(backupRestorePointCountNot))
                .append("\n");
        sb.append("    backupRestorePointCountNotIn: ")
                .append(toIndentedString(backupRestorePointCountNotIn))
                .append("\n");
        sb.append("    backupRestorePointsEvery: ")
                .append(toIndentedString(backupRestorePointsEvery))
                .append("\n");
        sb.append("    backupRestorePointsNone: ")
                .append(toIndentedString(backupRestorePointsNone))
                .append("\n");
        sb.append("    backupRestorePointsSome: ")
                .append(toIndentedString(backupRestorePointsSome))
                .append("\n");
        sb.append("    backupService: ").append(toIndentedString(backupService)).append("\n");
        sb.append("    backupStoreRepository: ")
                .append(toIndentedString(backupStoreRepository))
                .append("\n");
        sb.append("    backupTotalSize: ").append(toIndentedString(backupTotalSize)).append("\n");
        sb.append("    backupTotalSizeGt: ")
                .append(toIndentedString(backupTotalSizeGt))
                .append("\n");
        sb.append("    backupTotalSizeGte: ")
                .append(toIndentedString(backupTotalSizeGte))
                .append("\n");
        sb.append("    backupTotalSizeIn: ")
                .append(toIndentedString(backupTotalSizeIn))
                .append("\n");
        sb.append("    backupTotalSizeLt: ")
                .append(toIndentedString(backupTotalSizeLt))
                .append("\n");
        sb.append("    backupTotalSizeLte: ")
                .append(toIndentedString(backupTotalSizeLte))
                .append("\n");
        sb.append("    backupTotalSizeNot: ")
                .append(toIndentedString(backupTotalSizeNot))
                .append("\n");
        sb.append("    backupTotalSizeNotIn: ")
                .append(toIndentedString(backupTotalSizeNotIn))
                .append("\n");
        sb.append("    compression: ").append(toIndentedString(compression)).append("\n");
        sb.append("    compressionNot: ").append(toIndentedString(compressionNot)).append("\n");
        sb.append("    compressionRatio: ").append(toIndentedString(compressionRatio)).append("\n");
        sb.append("    compressionRatioGt: ")
                .append(toIndentedString(compressionRatioGt))
                .append("\n");
        sb.append("    compressionRatioGte: ")
                .append(toIndentedString(compressionRatioGte))
                .append("\n");
        sb.append("    compressionRatioIn: ")
                .append(toIndentedString(compressionRatioIn))
                .append("\n");
        sb.append("    compressionRatioLt: ")
                .append(toIndentedString(compressionRatioLt))
                .append("\n");
        sb.append("    compressionRatioLte: ")
                .append(toIndentedString(compressionRatioLte))
                .append("\n");
        sb.append("    compressionRatioNot: ")
                .append(toIndentedString(compressionRatioNot))
                .append("\n");
        sb.append("    compressionRatioNotIn: ")
                .append(toIndentedString(compressionRatioNotIn))
                .append("\n");
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
        sb.append("    fullInterval: ").append(toIndentedString(fullInterval)).append("\n");
        sb.append("    fullIntervalGt: ").append(toIndentedString(fullIntervalGt)).append("\n");
        sb.append("    fullIntervalGte: ").append(toIndentedString(fullIntervalGte)).append("\n");
        sb.append("    fullIntervalIn: ").append(toIndentedString(fullIntervalIn)).append("\n");
        sb.append("    fullIntervalLt: ").append(toIndentedString(fullIntervalLt)).append("\n");
        sb.append("    fullIntervalLte: ").append(toIndentedString(fullIntervalLte)).append("\n");
        sb.append("    fullIntervalNot: ").append(toIndentedString(fullIntervalNot)).append("\n");
        sb.append("    fullIntervalNotIn: ")
                .append(toIndentedString(fullIntervalNotIn))
                .append("\n");
        sb.append("    fullPeriod: ").append(toIndentedString(fullPeriod)).append("\n");
        sb.append("    fullPeriodIn: ").append(toIndentedString(fullPeriodIn)).append("\n");
        sb.append("    fullPeriodNot: ").append(toIndentedString(fullPeriodNot)).append("\n");
        sb.append("    fullPeriodNotIn: ").append(toIndentedString(fullPeriodNotIn)).append("\n");
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
        sb.append("    incrementalInterval: ")
                .append(toIndentedString(incrementalInterval))
                .append("\n");
        sb.append("    incrementalIntervalGt: ")
                .append(toIndentedString(incrementalIntervalGt))
                .append("\n");
        sb.append("    incrementalIntervalGte: ")
                .append(toIndentedString(incrementalIntervalGte))
                .append("\n");
        sb.append("    incrementalIntervalIn: ")
                .append(toIndentedString(incrementalIntervalIn))
                .append("\n");
        sb.append("    incrementalIntervalLt: ")
                .append(toIndentedString(incrementalIntervalLt))
                .append("\n");
        sb.append("    incrementalIntervalLte: ")
                .append(toIndentedString(incrementalIntervalLte))
                .append("\n");
        sb.append("    incrementalIntervalNot: ")
                .append(toIndentedString(incrementalIntervalNot))
                .append("\n");
        sb.append("    incrementalIntervalNotIn: ")
                .append(toIndentedString(incrementalIntervalNotIn))
                .append("\n");
        sb.append("    incrementalPeriod: ")
                .append(toIndentedString(incrementalPeriod))
                .append("\n");
        sb.append("    incrementalPeriodIn: ")
                .append(toIndentedString(incrementalPeriodIn))
                .append("\n");
        sb.append("    incrementalPeriodNot: ")
                .append(toIndentedString(incrementalPeriodNot))
                .append("\n");
        sb.append("    incrementalPeriodNotIn: ")
                .append(toIndentedString(incrementalPeriodNotIn))
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
        sb.append("    logicalSize: ").append(toIndentedString(logicalSize)).append("\n");
        sb.append("    logicalSizeGt: ").append(toIndentedString(logicalSizeGt)).append("\n");
        sb.append("    logicalSizeGte: ").append(toIndentedString(logicalSizeGte)).append("\n");
        sb.append("    logicalSizeIn: ").append(toIndentedString(logicalSizeIn)).append("\n");
        sb.append("    logicalSizeLt: ").append(toIndentedString(logicalSizeLt)).append("\n");
        sb.append("    logicalSizeLte: ").append(toIndentedString(logicalSizeLte)).append("\n");
        sb.append("    logicalSizeNot: ").append(toIndentedString(logicalSizeNot)).append("\n");
        sb.append("    logicalSizeNotIn: ").append(toIndentedString(logicalSizeNotIn)).append("\n");
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
        sb.append("    nextExecuteTime: ").append(toIndentedString(nextExecuteTime)).append("\n");
        sb.append("    nextExecuteTimeGt: ")
                .append(toIndentedString(nextExecuteTimeGt))
                .append("\n");
        sb.append("    nextExecuteTimeGte: ")
                .append(toIndentedString(nextExecuteTimeGte))
                .append("\n");
        sb.append("    nextExecuteTimeIn: ")
                .append(toIndentedString(nextExecuteTimeIn))
                .append("\n");
        sb.append("    nextExecuteTimeLt: ")
                .append(toIndentedString(nextExecuteTimeLt))
                .append("\n");
        sb.append("    nextExecuteTimeLte: ")
                .append(toIndentedString(nextExecuteTimeLte))
                .append("\n");
        sb.append("    nextExecuteTimeNot: ")
                .append(toIndentedString(nextExecuteTimeNot))
                .append("\n");
        sb.append("    nextExecuteTimeNotIn: ")
                .append(toIndentedString(nextExecuteTimeNotIn))
                .append("\n");
        sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
        sb.append("    phaseIn: ").append(toIndentedString(phaseIn)).append("\n");
        sb.append("    phaseNot: ").append(toIndentedString(phaseNot)).append("\n");
        sb.append("    phaseNotIn: ").append(toIndentedString(phaseNotIn)).append("\n");
        sb.append("    physicalSize: ").append(toIndentedString(physicalSize)).append("\n");
        sb.append("    physicalSizeGt: ").append(toIndentedString(physicalSizeGt)).append("\n");
        sb.append("    physicalSizeGte: ").append(toIndentedString(physicalSizeGte)).append("\n");
        sb.append("    physicalSizeIn: ").append(toIndentedString(physicalSizeIn)).append("\n");
        sb.append("    physicalSizeLt: ").append(toIndentedString(physicalSizeLt)).append("\n");
        sb.append("    physicalSizeLte: ").append(toIndentedString(physicalSizeLte)).append("\n");
        sb.append("    physicalSizeNot: ").append(toIndentedString(physicalSizeNot)).append("\n");
        sb.append("    physicalSizeNotIn: ")
                .append(toIndentedString(physicalSizeNotIn))
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
        sb.append("    validSizeOfBackupObject: ")
                .append(toIndentedString(validSizeOfBackupObject))
                .append("\n");
        sb.append("    validSizeOfBackupObjectGt: ")
                .append(toIndentedString(validSizeOfBackupObjectGt))
                .append("\n");
        sb.append("    validSizeOfBackupObjectGte: ")
                .append(toIndentedString(validSizeOfBackupObjectGte))
                .append("\n");
        sb.append("    validSizeOfBackupObjectIn: ")
                .append(toIndentedString(validSizeOfBackupObjectIn))
                .append("\n");
        sb.append("    validSizeOfBackupObjectLt: ")
                .append(toIndentedString(validSizeOfBackupObjectLt))
                .append("\n");
        sb.append("    validSizeOfBackupObjectLte: ")
                .append(toIndentedString(validSizeOfBackupObjectLte))
                .append("\n");
        sb.append("    validSizeOfBackupObjectNot: ")
                .append(toIndentedString(validSizeOfBackupObjectNot))
                .append("\n");
        sb.append("    validSizeOfBackupObjectNotIn: ")
                .append(toIndentedString(validSizeOfBackupObjectNotIn))
                .append("\n");
        sb.append("    validSizeOfRestorePoint: ")
                .append(toIndentedString(validSizeOfRestorePoint))
                .append("\n");
        sb.append("    validSizeOfRestorePointGt: ")
                .append(toIndentedString(validSizeOfRestorePointGt))
                .append("\n");
        sb.append("    validSizeOfRestorePointGte: ")
                .append(toIndentedString(validSizeOfRestorePointGte))
                .append("\n");
        sb.append("    validSizeOfRestorePointIn: ")
                .append(toIndentedString(validSizeOfRestorePointIn))
                .append("\n");
        sb.append("    validSizeOfRestorePointLt: ")
                .append(toIndentedString(validSizeOfRestorePointLt))
                .append("\n");
        sb.append("    validSizeOfRestorePointLte: ")
                .append(toIndentedString(validSizeOfRestorePointLte))
                .append("\n");
        sb.append("    validSizeOfRestorePointNot: ")
                .append(toIndentedString(validSizeOfRestorePointNot))
                .append("\n");
        sb.append("    validSizeOfRestorePointNotIn: ")
                .append(toIndentedString(validSizeOfRestorePointNotIn))
                .append("\n");
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

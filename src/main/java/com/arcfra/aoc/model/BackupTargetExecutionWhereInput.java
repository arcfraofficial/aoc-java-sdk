package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** BackupTargetExecutionWhereInput */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class BackupTargetExecutionWhereInput
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_A_N_D = "AND";

    @SerializedName(SERIALIZED_NAME_A_N_D)
    private List<BackupTargetExecutionWhereInput> AND = null;

    public static final String SERIALIZED_NAME_N_O_T = "NOT";

    @SerializedName(SERIALIZED_NAME_N_O_T)
    private List<BackupTargetExecutionWhereInput> NOT = null;

    public static final String SERIALIZED_NAME_O_R = "OR";

    @SerializedName(SERIALIZED_NAME_O_R)
    private List<BackupTargetExecutionWhereInput> OR = null;

    public static final String SERIALIZED_NAME_BACKUP_GROUP = "backup_group";

    @SerializedName(SERIALIZED_NAME_BACKUP_GROUP)
    private String backupGroup;

    public static final String SERIALIZED_NAME_BACKUP_GROUP_CONTAINS = "backup_group_contains";

    @SerializedName(SERIALIZED_NAME_BACKUP_GROUP_CONTAINS)
    private String backupGroupContains;

    public static final String SERIALIZED_NAME_BACKUP_GROUP_ENDS_WITH = "backup_group_ends_with";

    @SerializedName(SERIALIZED_NAME_BACKUP_GROUP_ENDS_WITH)
    private String backupGroupEndsWith;

    public static final String SERIALIZED_NAME_BACKUP_GROUP_GT = "backup_group_gt";

    @SerializedName(SERIALIZED_NAME_BACKUP_GROUP_GT)
    private String backupGroupGt;

    public static final String SERIALIZED_NAME_BACKUP_GROUP_GTE = "backup_group_gte";

    @SerializedName(SERIALIZED_NAME_BACKUP_GROUP_GTE)
    private String backupGroupGte;

    public static final String SERIALIZED_NAME_BACKUP_GROUP_IN = "backup_group_in";

    @SerializedName(SERIALIZED_NAME_BACKUP_GROUP_IN)
    private List<String> backupGroupIn = null;

    public static final String SERIALIZED_NAME_BACKUP_GROUP_LT = "backup_group_lt";

    @SerializedName(SERIALIZED_NAME_BACKUP_GROUP_LT)
    private String backupGroupLt;

    public static final String SERIALIZED_NAME_BACKUP_GROUP_LTE = "backup_group_lte";

    @SerializedName(SERIALIZED_NAME_BACKUP_GROUP_LTE)
    private String backupGroupLte;

    public static final String SERIALIZED_NAME_BACKUP_GROUP_NOT = "backup_group_not";

    @SerializedName(SERIALIZED_NAME_BACKUP_GROUP_NOT)
    private String backupGroupNot;

    public static final String SERIALIZED_NAME_BACKUP_GROUP_NOT_CONTAINS =
            "backup_group_not_contains";

    @SerializedName(SERIALIZED_NAME_BACKUP_GROUP_NOT_CONTAINS)
    private String backupGroupNotContains;

    public static final String SERIALIZED_NAME_BACKUP_GROUP_NOT_ENDS_WITH =
            "backup_group_not_ends_with";

    @SerializedName(SERIALIZED_NAME_BACKUP_GROUP_NOT_ENDS_WITH)
    private String backupGroupNotEndsWith;

    public static final String SERIALIZED_NAME_BACKUP_GROUP_NOT_IN = "backup_group_not_in";

    @SerializedName(SERIALIZED_NAME_BACKUP_GROUP_NOT_IN)
    private List<String> backupGroupNotIn = null;

    public static final String SERIALIZED_NAME_BACKUP_GROUP_NOT_STARTS_WITH =
            "backup_group_not_starts_with";

    @SerializedName(SERIALIZED_NAME_BACKUP_GROUP_NOT_STARTS_WITH)
    private String backupGroupNotStartsWith;

    public static final String SERIALIZED_NAME_BACKUP_GROUP_STARTS_WITH =
            "backup_group_starts_with";

    @SerializedName(SERIALIZED_NAME_BACKUP_GROUP_STARTS_WITH)
    private String backupGroupStartsWith;

    public static final String SERIALIZED_NAME_BACKUP_PLAN_EXECUTION = "backup_plan_execution";

    @SerializedName(SERIALIZED_NAME_BACKUP_PLAN_EXECUTION)
    private BackupPlanExecutionWhereInput backupPlanExecution;

    public static final String SERIALIZED_NAME_BACKUP_RESTORE_POINT = "backup_restore_point";

    @SerializedName(SERIALIZED_NAME_BACKUP_RESTORE_POINT)
    private BackupRestorePointWhereInput backupRestorePoint;

    public static final String SERIALIZED_NAME_CLUSTER_LOCAL_ID = "cluster_local_id";

    @SerializedName(SERIALIZED_NAME_CLUSTER_LOCAL_ID)
    private String clusterLocalId;

    public static final String SERIALIZED_NAME_CLUSTER_LOCAL_ID_CONTAINS =
            "cluster_local_id_contains";

    @SerializedName(SERIALIZED_NAME_CLUSTER_LOCAL_ID_CONTAINS)
    private String clusterLocalIdContains;

    public static final String SERIALIZED_NAME_CLUSTER_LOCAL_ID_ENDS_WITH =
            "cluster_local_id_ends_with";

    @SerializedName(SERIALIZED_NAME_CLUSTER_LOCAL_ID_ENDS_WITH)
    private String clusterLocalIdEndsWith;

    public static final String SERIALIZED_NAME_CLUSTER_LOCAL_ID_GT = "cluster_local_id_gt";

    @SerializedName(SERIALIZED_NAME_CLUSTER_LOCAL_ID_GT)
    private String clusterLocalIdGt;

    public static final String SERIALIZED_NAME_CLUSTER_LOCAL_ID_GTE = "cluster_local_id_gte";

    @SerializedName(SERIALIZED_NAME_CLUSTER_LOCAL_ID_GTE)
    private String clusterLocalIdGte;

    public static final String SERIALIZED_NAME_CLUSTER_LOCAL_ID_IN = "cluster_local_id_in";

    @SerializedName(SERIALIZED_NAME_CLUSTER_LOCAL_ID_IN)
    private List<String> clusterLocalIdIn = null;

    public static final String SERIALIZED_NAME_CLUSTER_LOCAL_ID_LT = "cluster_local_id_lt";

    @SerializedName(SERIALIZED_NAME_CLUSTER_LOCAL_ID_LT)
    private String clusterLocalIdLt;

    public static final String SERIALIZED_NAME_CLUSTER_LOCAL_ID_LTE = "cluster_local_id_lte";

    @SerializedName(SERIALIZED_NAME_CLUSTER_LOCAL_ID_LTE)
    private String clusterLocalIdLte;

    public static final String SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT = "cluster_local_id_not";

    @SerializedName(SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT)
    private String clusterLocalIdNot;

    public static final String SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT_CONTAINS =
            "cluster_local_id_not_contains";

    @SerializedName(SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT_CONTAINS)
    private String clusterLocalIdNotContains;

    public static final String SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT_ENDS_WITH =
            "cluster_local_id_not_ends_with";

    @SerializedName(SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT_ENDS_WITH)
    private String clusterLocalIdNotEndsWith;

    public static final String SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT_IN = "cluster_local_id_not_in";

    @SerializedName(SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT_IN)
    private List<String> clusterLocalIdNotIn = null;

    public static final String SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT_STARTS_WITH =
            "cluster_local_id_not_starts_with";

    @SerializedName(SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT_STARTS_WITH)
    private String clusterLocalIdNotStartsWith;

    public static final String SERIALIZED_NAME_CLUSTER_LOCAL_ID_STARTS_WITH =
            "cluster_local_id_starts_with";

    @SerializedName(SERIALIZED_NAME_CLUSTER_LOCAL_ID_STARTS_WITH)
    private String clusterLocalIdStartsWith;

    public static final String SERIALIZED_NAME_DURATION = "duration";

    @SerializedName(SERIALIZED_NAME_DURATION)
    private Integer duration;

    public static final String SERIALIZED_NAME_DURATION_GT = "duration_gt";

    @SerializedName(SERIALIZED_NAME_DURATION_GT)
    private Integer durationGt;

    public static final String SERIALIZED_NAME_DURATION_GTE = "duration_gte";

    @SerializedName(SERIALIZED_NAME_DURATION_GTE)
    private Integer durationGte;

    public static final String SERIALIZED_NAME_DURATION_IN = "duration_in";

    @SerializedName(SERIALIZED_NAME_DURATION_IN)
    private List<Integer> durationIn = null;

    public static final String SERIALIZED_NAME_DURATION_LT = "duration_lt";

    @SerializedName(SERIALIZED_NAME_DURATION_LT)
    private Integer durationLt;

    public static final String SERIALIZED_NAME_DURATION_LTE = "duration_lte";

    @SerializedName(SERIALIZED_NAME_DURATION_LTE)
    private Integer durationLte;

    public static final String SERIALIZED_NAME_DURATION_NOT = "duration_not";

    @SerializedName(SERIALIZED_NAME_DURATION_NOT)
    private Integer durationNot;

    public static final String SERIALIZED_NAME_DURATION_NOT_IN = "duration_not_in";

    @SerializedName(SERIALIZED_NAME_DURATION_NOT_IN)
    private List<Integer> durationNotIn = null;

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

    public static final String SERIALIZED_NAME_EXECUTED_AT = "executed_at";

    @SerializedName(SERIALIZED_NAME_EXECUTED_AT)
    private String executedAt;

    public static final String SERIALIZED_NAME_EXECUTED_AT_GT = "executed_at_gt";

    @SerializedName(SERIALIZED_NAME_EXECUTED_AT_GT)
    private String executedAtGt;

    public static final String SERIALIZED_NAME_EXECUTED_AT_GTE = "executed_at_gte";

    @SerializedName(SERIALIZED_NAME_EXECUTED_AT_GTE)
    private String executedAtGte;

    public static final String SERIALIZED_NAME_EXECUTED_AT_IN = "executed_at_in";

    @SerializedName(SERIALIZED_NAME_EXECUTED_AT_IN)
    private List<String> executedAtIn = null;

    public static final String SERIALIZED_NAME_EXECUTED_AT_LT = "executed_at_lt";

    @SerializedName(SERIALIZED_NAME_EXECUTED_AT_LT)
    private String executedAtLt;

    public static final String SERIALIZED_NAME_EXECUTED_AT_LTE = "executed_at_lte";

    @SerializedName(SERIALIZED_NAME_EXECUTED_AT_LTE)
    private String executedAtLte;

    public static final String SERIALIZED_NAME_EXECUTED_AT_NOT = "executed_at_not";

    @SerializedName(SERIALIZED_NAME_EXECUTED_AT_NOT)
    private String executedAtNot;

    public static final String SERIALIZED_NAME_EXECUTED_AT_NOT_IN = "executed_at_not_in";

    @SerializedName(SERIALIZED_NAME_EXECUTED_AT_NOT_IN)
    private List<String> executedAtNotIn = null;

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

    public static final String SERIALIZED_NAME_PARENT_BACKUP = "parent_backup";

    @SerializedName(SERIALIZED_NAME_PARENT_BACKUP)
    private String parentBackup;

    public static final String SERIALIZED_NAME_PARENT_BACKUP_CONTAINS = "parent_backup_contains";

    @SerializedName(SERIALIZED_NAME_PARENT_BACKUP_CONTAINS)
    private String parentBackupContains;

    public static final String SERIALIZED_NAME_PARENT_BACKUP_ENDS_WITH = "parent_backup_ends_with";

    @SerializedName(SERIALIZED_NAME_PARENT_BACKUP_ENDS_WITH)
    private String parentBackupEndsWith;

    public static final String SERIALIZED_NAME_PARENT_BACKUP_GT = "parent_backup_gt";

    @SerializedName(SERIALIZED_NAME_PARENT_BACKUP_GT)
    private String parentBackupGt;

    public static final String SERIALIZED_NAME_PARENT_BACKUP_GTE = "parent_backup_gte";

    @SerializedName(SERIALIZED_NAME_PARENT_BACKUP_GTE)
    private String parentBackupGte;

    public static final String SERIALIZED_NAME_PARENT_BACKUP_IN = "parent_backup_in";

    @SerializedName(SERIALIZED_NAME_PARENT_BACKUP_IN)
    private List<String> parentBackupIn = null;

    public static final String SERIALIZED_NAME_PARENT_BACKUP_LT = "parent_backup_lt";

    @SerializedName(SERIALIZED_NAME_PARENT_BACKUP_LT)
    private String parentBackupLt;

    public static final String SERIALIZED_NAME_PARENT_BACKUP_LTE = "parent_backup_lte";

    @SerializedName(SERIALIZED_NAME_PARENT_BACKUP_LTE)
    private String parentBackupLte;

    public static final String SERIALIZED_NAME_PARENT_BACKUP_NOT = "parent_backup_not";

    @SerializedName(SERIALIZED_NAME_PARENT_BACKUP_NOT)
    private String parentBackupNot;

    public static final String SERIALIZED_NAME_PARENT_BACKUP_NOT_CONTAINS =
            "parent_backup_not_contains";

    @SerializedName(SERIALIZED_NAME_PARENT_BACKUP_NOT_CONTAINS)
    private String parentBackupNotContains;

    public static final String SERIALIZED_NAME_PARENT_BACKUP_NOT_ENDS_WITH =
            "parent_backup_not_ends_with";

    @SerializedName(SERIALIZED_NAME_PARENT_BACKUP_NOT_ENDS_WITH)
    private String parentBackupNotEndsWith;

    public static final String SERIALIZED_NAME_PARENT_BACKUP_NOT_IN = "parent_backup_not_in";

    @SerializedName(SERIALIZED_NAME_PARENT_BACKUP_NOT_IN)
    private List<String> parentBackupNotIn = null;

    public static final String SERIALIZED_NAME_PARENT_BACKUP_NOT_STARTS_WITH =
            "parent_backup_not_starts_with";

    @SerializedName(SERIALIZED_NAME_PARENT_BACKUP_NOT_STARTS_WITH)
    private String parentBackupNotStartsWith;

    public static final String SERIALIZED_NAME_PARENT_BACKUP_STARTS_WITH =
            "parent_backup_starts_with";

    @SerializedName(SERIALIZED_NAME_PARENT_BACKUP_STARTS_WITH)
    private String parentBackupStartsWith;

    public static final String SERIALIZED_NAME_READ_BYTES = "read_bytes";

    @SerializedName(SERIALIZED_NAME_READ_BYTES)
    private Long readBytes;

    public static final String SERIALIZED_NAME_READ_BYTES_GT = "read_bytes_gt";

    @SerializedName(SERIALIZED_NAME_READ_BYTES_GT)
    private Long readBytesGt;

    public static final String SERIALIZED_NAME_READ_BYTES_GTE = "read_bytes_gte";

    @SerializedName(SERIALIZED_NAME_READ_BYTES_GTE)
    private Long readBytesGte;

    public static final String SERIALIZED_NAME_READ_BYTES_IN = "read_bytes_in";

    @SerializedName(SERIALIZED_NAME_READ_BYTES_IN)
    private List<Long> readBytesIn = null;

    public static final String SERIALIZED_NAME_READ_BYTES_LT = "read_bytes_lt";

    @SerializedName(SERIALIZED_NAME_READ_BYTES_LT)
    private Long readBytesLt;

    public static final String SERIALIZED_NAME_READ_BYTES_LTE = "read_bytes_lte";

    @SerializedName(SERIALIZED_NAME_READ_BYTES_LTE)
    private Long readBytesLte;

    public static final String SERIALIZED_NAME_READ_BYTES_NOT = "read_bytes_not";

    @SerializedName(SERIALIZED_NAME_READ_BYTES_NOT)
    private Long readBytesNot;

    public static final String SERIALIZED_NAME_READ_BYTES_NOT_IN = "read_bytes_not_in";

    @SerializedName(SERIALIZED_NAME_READ_BYTES_NOT_IN)
    private List<Long> readBytesNotIn = null;

    public static final String SERIALIZED_NAME_RETRY_TIMES = "retry_times";

    @SerializedName(SERIALIZED_NAME_RETRY_TIMES)
    private Integer retryTimes;

    public static final String SERIALIZED_NAME_RETRY_TIMES_GT = "retry_times_gt";

    @SerializedName(SERIALIZED_NAME_RETRY_TIMES_GT)
    private Integer retryTimesGt;

    public static final String SERIALIZED_NAME_RETRY_TIMES_GTE = "retry_times_gte";

    @SerializedName(SERIALIZED_NAME_RETRY_TIMES_GTE)
    private Integer retryTimesGte;

    public static final String SERIALIZED_NAME_RETRY_TIMES_IN = "retry_times_in";

    @SerializedName(SERIALIZED_NAME_RETRY_TIMES_IN)
    private List<Integer> retryTimesIn = null;

    public static final String SERIALIZED_NAME_RETRY_TIMES_LT = "retry_times_lt";

    @SerializedName(SERIALIZED_NAME_RETRY_TIMES_LT)
    private Integer retryTimesLt;

    public static final String SERIALIZED_NAME_RETRY_TIMES_LTE = "retry_times_lte";

    @SerializedName(SERIALIZED_NAME_RETRY_TIMES_LTE)
    private Integer retryTimesLte;

    public static final String SERIALIZED_NAME_RETRY_TIMES_NOT = "retry_times_not";

    @SerializedName(SERIALIZED_NAME_RETRY_TIMES_NOT)
    private Integer retryTimesNot;

    public static final String SERIALIZED_NAME_RETRY_TIMES_NOT_IN = "retry_times_not_in";

    @SerializedName(SERIALIZED_NAME_RETRY_TIMES_NOT_IN)
    private List<Integer> retryTimesNotIn = null;

    public static final String SERIALIZED_NAME_STATUS = "status";

    @SerializedName(SERIALIZED_NAME_STATUS)
    private BackupExecutionStatus status;

    public static final String SERIALIZED_NAME_STATUS_IN = "status_in";

    @SerializedName(SERIALIZED_NAME_STATUS_IN)
    private List<BackupExecutionStatus> statusIn = null;

    public static final String SERIALIZED_NAME_STATUS_NOT = "status_not";

    @SerializedName(SERIALIZED_NAME_STATUS_NOT)
    private BackupExecutionStatus statusNot;

    public static final String SERIALIZED_NAME_STATUS_NOT_IN = "status_not_in";

    @SerializedName(SERIALIZED_NAME_STATUS_NOT_IN)
    private List<BackupExecutionStatus> statusNotIn = null;

    public static final String SERIALIZED_NAME_TOTAL_BYTES = "total_bytes";

    @SerializedName(SERIALIZED_NAME_TOTAL_BYTES)
    private Long totalBytes;

    public static final String SERIALIZED_NAME_TOTAL_BYTES_GT = "total_bytes_gt";

    @SerializedName(SERIALIZED_NAME_TOTAL_BYTES_GT)
    private Long totalBytesGt;

    public static final String SERIALIZED_NAME_TOTAL_BYTES_GTE = "total_bytes_gte";

    @SerializedName(SERIALIZED_NAME_TOTAL_BYTES_GTE)
    private Long totalBytesGte;

    public static final String SERIALIZED_NAME_TOTAL_BYTES_IN = "total_bytes_in";

    @SerializedName(SERIALIZED_NAME_TOTAL_BYTES_IN)
    private List<Long> totalBytesIn = null;

    public static final String SERIALIZED_NAME_TOTAL_BYTES_LT = "total_bytes_lt";

    @SerializedName(SERIALIZED_NAME_TOTAL_BYTES_LT)
    private Long totalBytesLt;

    public static final String SERIALIZED_NAME_TOTAL_BYTES_LTE = "total_bytes_lte";

    @SerializedName(SERIALIZED_NAME_TOTAL_BYTES_LTE)
    private Long totalBytesLte;

    public static final String SERIALIZED_NAME_TOTAL_BYTES_NOT = "total_bytes_not";

    @SerializedName(SERIALIZED_NAME_TOTAL_BYTES_NOT)
    private Long totalBytesNot;

    public static final String SERIALIZED_NAME_TOTAL_BYTES_NOT_IN = "total_bytes_not_in";

    @SerializedName(SERIALIZED_NAME_TOTAL_BYTES_NOT_IN)
    private List<Long> totalBytesNotIn = null;

    public static final String SERIALIZED_NAME_TYPE = "type";

    @SerializedName(SERIALIZED_NAME_TYPE)
    private BackupExecutionType type;

    public static final String SERIALIZED_NAME_TYPE_IN = "type_in";

    @SerializedName(SERIALIZED_NAME_TYPE_IN)
    private List<BackupExecutionType> typeIn = null;

    public static final String SERIALIZED_NAME_TYPE_NOT = "type_not";

    @SerializedName(SERIALIZED_NAME_TYPE_NOT)
    private BackupExecutionType typeNot;

    public static final String SERIALIZED_NAME_TYPE_NOT_IN = "type_not_in";

    @SerializedName(SERIALIZED_NAME_TYPE_NOT_IN)
    private List<BackupExecutionType> typeNotIn = null;

    public static final String SERIALIZED_NAME_VM = "vm";

    @SerializedName(SERIALIZED_NAME_VM)
    private VmWhereInput vm;

    public static final String SERIALIZED_NAME_VM_LOCAL_ID = "vm_local_id";

    @SerializedName(SERIALIZED_NAME_VM_LOCAL_ID)
    private String vmLocalId;

    public static final String SERIALIZED_NAME_VM_LOCAL_ID_CONTAINS = "vm_local_id_contains";

    @SerializedName(SERIALIZED_NAME_VM_LOCAL_ID_CONTAINS)
    private String vmLocalIdContains;

    public static final String SERIALIZED_NAME_VM_LOCAL_ID_ENDS_WITH = "vm_local_id_ends_with";

    @SerializedName(SERIALIZED_NAME_VM_LOCAL_ID_ENDS_WITH)
    private String vmLocalIdEndsWith;

    public static final String SERIALIZED_NAME_VM_LOCAL_ID_GT = "vm_local_id_gt";

    @SerializedName(SERIALIZED_NAME_VM_LOCAL_ID_GT)
    private String vmLocalIdGt;

    public static final String SERIALIZED_NAME_VM_LOCAL_ID_GTE = "vm_local_id_gte";

    @SerializedName(SERIALIZED_NAME_VM_LOCAL_ID_GTE)
    private String vmLocalIdGte;

    public static final String SERIALIZED_NAME_VM_LOCAL_ID_IN = "vm_local_id_in";

    @SerializedName(SERIALIZED_NAME_VM_LOCAL_ID_IN)
    private List<String> vmLocalIdIn = null;

    public static final String SERIALIZED_NAME_VM_LOCAL_ID_LT = "vm_local_id_lt";

    @SerializedName(SERIALIZED_NAME_VM_LOCAL_ID_LT)
    private String vmLocalIdLt;

    public static final String SERIALIZED_NAME_VM_LOCAL_ID_LTE = "vm_local_id_lte";

    @SerializedName(SERIALIZED_NAME_VM_LOCAL_ID_LTE)
    private String vmLocalIdLte;

    public static final String SERIALIZED_NAME_VM_LOCAL_ID_NOT = "vm_local_id_not";

    @SerializedName(SERIALIZED_NAME_VM_LOCAL_ID_NOT)
    private String vmLocalIdNot;

    public static final String SERIALIZED_NAME_VM_LOCAL_ID_NOT_CONTAINS =
            "vm_local_id_not_contains";

    @SerializedName(SERIALIZED_NAME_VM_LOCAL_ID_NOT_CONTAINS)
    private String vmLocalIdNotContains;

    public static final String SERIALIZED_NAME_VM_LOCAL_ID_NOT_ENDS_WITH =
            "vm_local_id_not_ends_with";

    @SerializedName(SERIALIZED_NAME_VM_LOCAL_ID_NOT_ENDS_WITH)
    private String vmLocalIdNotEndsWith;

    public static final String SERIALIZED_NAME_VM_LOCAL_ID_NOT_IN = "vm_local_id_not_in";

    @SerializedName(SERIALIZED_NAME_VM_LOCAL_ID_NOT_IN)
    private List<String> vmLocalIdNotIn = null;

    public static final String SERIALIZED_NAME_VM_LOCAL_ID_NOT_STARTS_WITH =
            "vm_local_id_not_starts_with";

    @SerializedName(SERIALIZED_NAME_VM_LOCAL_ID_NOT_STARTS_WITH)
    private String vmLocalIdNotStartsWith;

    public static final String SERIALIZED_NAME_VM_LOCAL_ID_STARTS_WITH = "vm_local_id_starts_with";

    @SerializedName(SERIALIZED_NAME_VM_LOCAL_ID_STARTS_WITH)
    private String vmLocalIdStartsWith;

    public static final String SERIALIZED_NAME_VM_NAME = "vm_name";

    @SerializedName(SERIALIZED_NAME_VM_NAME)
    private String vmName;

    public static final String SERIALIZED_NAME_VM_NAME_CONTAINS = "vm_name_contains";

    @SerializedName(SERIALIZED_NAME_VM_NAME_CONTAINS)
    private String vmNameContains;

    public static final String SERIALIZED_NAME_VM_NAME_ENDS_WITH = "vm_name_ends_with";

    @SerializedName(SERIALIZED_NAME_VM_NAME_ENDS_WITH)
    private String vmNameEndsWith;

    public static final String SERIALIZED_NAME_VM_NAME_GT = "vm_name_gt";

    @SerializedName(SERIALIZED_NAME_VM_NAME_GT)
    private String vmNameGt;

    public static final String SERIALIZED_NAME_VM_NAME_GTE = "vm_name_gte";

    @SerializedName(SERIALIZED_NAME_VM_NAME_GTE)
    private String vmNameGte;

    public static final String SERIALIZED_NAME_VM_NAME_IN = "vm_name_in";

    @SerializedName(SERIALIZED_NAME_VM_NAME_IN)
    private List<String> vmNameIn = null;

    public static final String SERIALIZED_NAME_VM_NAME_LT = "vm_name_lt";

    @SerializedName(SERIALIZED_NAME_VM_NAME_LT)
    private String vmNameLt;

    public static final String SERIALIZED_NAME_VM_NAME_LTE = "vm_name_lte";

    @SerializedName(SERIALIZED_NAME_VM_NAME_LTE)
    private String vmNameLte;

    public static final String SERIALIZED_NAME_VM_NAME_NOT = "vm_name_not";

    @SerializedName(SERIALIZED_NAME_VM_NAME_NOT)
    private String vmNameNot;

    public static final String SERIALIZED_NAME_VM_NAME_NOT_CONTAINS = "vm_name_not_contains";

    @SerializedName(SERIALIZED_NAME_VM_NAME_NOT_CONTAINS)
    private String vmNameNotContains;

    public static final String SERIALIZED_NAME_VM_NAME_NOT_ENDS_WITH = "vm_name_not_ends_with";

    @SerializedName(SERIALIZED_NAME_VM_NAME_NOT_ENDS_WITH)
    private String vmNameNotEndsWith;

    public static final String SERIALIZED_NAME_VM_NAME_NOT_IN = "vm_name_not_in";

    @SerializedName(SERIALIZED_NAME_VM_NAME_NOT_IN)
    private List<String> vmNameNotIn = null;

    public static final String SERIALIZED_NAME_VM_NAME_NOT_STARTS_WITH = "vm_name_not_starts_with";

    @SerializedName(SERIALIZED_NAME_VM_NAME_NOT_STARTS_WITH)
    private String vmNameNotStartsWith;

    public static final String SERIALIZED_NAME_VM_NAME_STARTS_WITH = "vm_name_starts_with";

    @SerializedName(SERIALIZED_NAME_VM_NAME_STARTS_WITH)
    private String vmNameStartsWith;

    public BackupTargetExecutionWhereInput() {}

    public BackupTargetExecutionWhereInput AND(List<BackupTargetExecutionWhereInput> AND) {

        this.AND = AND;
        return this;
    }

    public BackupTargetExecutionWhereInput addANDItem(BackupTargetExecutionWhereInput ANDItem) {
        if (this.AND == null) {
            this.AND = new ArrayList<BackupTargetExecutionWhereInput>();
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
    public List<BackupTargetExecutionWhereInput> getAND() {
        return AND;
    }

    public void setAND(List<BackupTargetExecutionWhereInput> AND) {
        this.AND = AND;
    }

    public BackupTargetExecutionWhereInput AND_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_A_N_D);
        return this;
    }

    public BackupTargetExecutionWhereInput AND_ExplictlyNonNull() {
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

    public BackupTargetExecutionWhereInput NOT(List<BackupTargetExecutionWhereInput> NOT) {

        this.NOT = NOT;
        return this;
    }

    public BackupTargetExecutionWhereInput addNOTItem(BackupTargetExecutionWhereInput NOTItem) {
        if (this.NOT == null) {
            this.NOT = new ArrayList<BackupTargetExecutionWhereInput>();
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
    public List<BackupTargetExecutionWhereInput> getNOT() {
        return NOT;
    }

    public void setNOT(List<BackupTargetExecutionWhereInput> NOT) {
        this.NOT = NOT;
    }

    public BackupTargetExecutionWhereInput NOT_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_N_O_T);
        return this;
    }

    public BackupTargetExecutionWhereInput NOT_ExplictlyNonNull() {
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

    public BackupTargetExecutionWhereInput OR(List<BackupTargetExecutionWhereInput> OR) {

        this.OR = OR;
        return this;
    }

    public BackupTargetExecutionWhereInput addORItem(BackupTargetExecutionWhereInput ORItem) {
        if (this.OR == null) {
            this.OR = new ArrayList<BackupTargetExecutionWhereInput>();
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
    public List<BackupTargetExecutionWhereInput> getOR() {
        return OR;
    }

    public void setOR(List<BackupTargetExecutionWhereInput> OR) {
        this.OR = OR;
    }

    public BackupTargetExecutionWhereInput OR_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_O_R);
        return this;
    }

    public BackupTargetExecutionWhereInput OR_ExplictlyNonNull() {
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

    public BackupTargetExecutionWhereInput backupGroup(String backupGroup) {

        this.backupGroup = backupGroup;
        return this;
    }

    /**
     * Get backupGroup
     *
     * @return backupGroup
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBackupGroup() {
        return backupGroup;
    }

    public void setBackupGroup(String backupGroup) {
        this.backupGroup = backupGroup;
    }

    public BackupTargetExecutionWhereInput backupGroup_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_GROUP);
        return this;
    }

    public BackupTargetExecutionWhereInput backupGroup_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_GROUP);
        return this;
    }

    public void setBackupGroup_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_GROUP);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_GROUP);
        }
    }

    public boolean getBackupGroup_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_GROUP);
    }

    public BackupTargetExecutionWhereInput backupGroupContains(String backupGroupContains) {

        this.backupGroupContains = backupGroupContains;
        return this;
    }

    /**
     * Get backupGroupContains
     *
     * @return backupGroupContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBackupGroupContains() {
        return backupGroupContains;
    }

    public void setBackupGroupContains(String backupGroupContains) {
        this.backupGroupContains = backupGroupContains;
    }

    public BackupTargetExecutionWhereInput backupGroupContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_GROUP_CONTAINS);
        return this;
    }

    public BackupTargetExecutionWhereInput backupGroupContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_GROUP_CONTAINS);
        return this;
    }

    public void setBackupGroupContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_GROUP_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_GROUP_CONTAINS);
        }
    }

    public boolean getBackupGroupContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_GROUP_CONTAINS);
    }

    public BackupTargetExecutionWhereInput backupGroupEndsWith(String backupGroupEndsWith) {

        this.backupGroupEndsWith = backupGroupEndsWith;
        return this;
    }

    /**
     * Get backupGroupEndsWith
     *
     * @return backupGroupEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBackupGroupEndsWith() {
        return backupGroupEndsWith;
    }

    public void setBackupGroupEndsWith(String backupGroupEndsWith) {
        this.backupGroupEndsWith = backupGroupEndsWith;
    }

    public BackupTargetExecutionWhereInput backupGroupEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_GROUP_ENDS_WITH);
        return this;
    }

    public BackupTargetExecutionWhereInput backupGroupEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_GROUP_ENDS_WITH);
        return this;
    }

    public void setBackupGroupEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_GROUP_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_GROUP_ENDS_WITH);
        }
    }

    public boolean getBackupGroupEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_GROUP_ENDS_WITH);
    }

    public BackupTargetExecutionWhereInput backupGroupGt(String backupGroupGt) {

        this.backupGroupGt = backupGroupGt;
        return this;
    }

    /**
     * Get backupGroupGt
     *
     * @return backupGroupGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBackupGroupGt() {
        return backupGroupGt;
    }

    public void setBackupGroupGt(String backupGroupGt) {
        this.backupGroupGt = backupGroupGt;
    }

    public BackupTargetExecutionWhereInput backupGroupGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_GROUP_GT);
        return this;
    }

    public BackupTargetExecutionWhereInput backupGroupGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_GROUP_GT);
        return this;
    }

    public void setBackupGroupGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_GROUP_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_GROUP_GT);
        }
    }

    public boolean getBackupGroupGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_GROUP_GT);
    }

    public BackupTargetExecutionWhereInput backupGroupGte(String backupGroupGte) {

        this.backupGroupGte = backupGroupGte;
        return this;
    }

    /**
     * Get backupGroupGte
     *
     * @return backupGroupGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBackupGroupGte() {
        return backupGroupGte;
    }

    public void setBackupGroupGte(String backupGroupGte) {
        this.backupGroupGte = backupGroupGte;
    }

    public BackupTargetExecutionWhereInput backupGroupGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_GROUP_GTE);
        return this;
    }

    public BackupTargetExecutionWhereInput backupGroupGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_GROUP_GTE);
        return this;
    }

    public void setBackupGroupGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_GROUP_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_GROUP_GTE);
        }
    }

    public boolean getBackupGroupGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_GROUP_GTE);
    }

    public BackupTargetExecutionWhereInput backupGroupIn(List<String> backupGroupIn) {

        this.backupGroupIn = backupGroupIn;
        return this;
    }

    public BackupTargetExecutionWhereInput addBackupGroupInItem(String backupGroupInItem) {
        if (this.backupGroupIn == null) {
            this.backupGroupIn = new ArrayList<String>();
        }
        this.backupGroupIn.add(backupGroupInItem);
        return this;
    }

    /**
     * Get backupGroupIn
     *
     * @return backupGroupIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getBackupGroupIn() {
        return backupGroupIn;
    }

    public void setBackupGroupIn(List<String> backupGroupIn) {
        this.backupGroupIn = backupGroupIn;
    }

    public BackupTargetExecutionWhereInput backupGroupIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_GROUP_IN);
        return this;
    }

    public BackupTargetExecutionWhereInput backupGroupIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_GROUP_IN);
        return this;
    }

    public void setBackupGroupIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_GROUP_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_GROUP_IN);
        }
    }

    public boolean getBackupGroupIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_GROUP_IN);
    }

    public BackupTargetExecutionWhereInput backupGroupLt(String backupGroupLt) {

        this.backupGroupLt = backupGroupLt;
        return this;
    }

    /**
     * Get backupGroupLt
     *
     * @return backupGroupLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBackupGroupLt() {
        return backupGroupLt;
    }

    public void setBackupGroupLt(String backupGroupLt) {
        this.backupGroupLt = backupGroupLt;
    }

    public BackupTargetExecutionWhereInput backupGroupLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_GROUP_LT);
        return this;
    }

    public BackupTargetExecutionWhereInput backupGroupLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_GROUP_LT);
        return this;
    }

    public void setBackupGroupLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_GROUP_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_GROUP_LT);
        }
    }

    public boolean getBackupGroupLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_GROUP_LT);
    }

    public BackupTargetExecutionWhereInput backupGroupLte(String backupGroupLte) {

        this.backupGroupLte = backupGroupLte;
        return this;
    }

    /**
     * Get backupGroupLte
     *
     * @return backupGroupLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBackupGroupLte() {
        return backupGroupLte;
    }

    public void setBackupGroupLte(String backupGroupLte) {
        this.backupGroupLte = backupGroupLte;
    }

    public BackupTargetExecutionWhereInput backupGroupLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_GROUP_LTE);
        return this;
    }

    public BackupTargetExecutionWhereInput backupGroupLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_GROUP_LTE);
        return this;
    }

    public void setBackupGroupLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_GROUP_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_GROUP_LTE);
        }
    }

    public boolean getBackupGroupLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_GROUP_LTE);
    }

    public BackupTargetExecutionWhereInput backupGroupNot(String backupGroupNot) {

        this.backupGroupNot = backupGroupNot;
        return this;
    }

    /**
     * Get backupGroupNot
     *
     * @return backupGroupNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBackupGroupNot() {
        return backupGroupNot;
    }

    public void setBackupGroupNot(String backupGroupNot) {
        this.backupGroupNot = backupGroupNot;
    }

    public BackupTargetExecutionWhereInput backupGroupNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_GROUP_NOT);
        return this;
    }

    public BackupTargetExecutionWhereInput backupGroupNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_GROUP_NOT);
        return this;
    }

    public void setBackupGroupNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_GROUP_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_GROUP_NOT);
        }
    }

    public boolean getBackupGroupNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_GROUP_NOT);
    }

    public BackupTargetExecutionWhereInput backupGroupNotContains(String backupGroupNotContains) {

        this.backupGroupNotContains = backupGroupNotContains;
        return this;
    }

    /**
     * Get backupGroupNotContains
     *
     * @return backupGroupNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBackupGroupNotContains() {
        return backupGroupNotContains;
    }

    public void setBackupGroupNotContains(String backupGroupNotContains) {
        this.backupGroupNotContains = backupGroupNotContains;
    }

    public BackupTargetExecutionWhereInput backupGroupNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_GROUP_NOT_CONTAINS);
        return this;
    }

    public BackupTargetExecutionWhereInput backupGroupNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_GROUP_NOT_CONTAINS);
        return this;
    }

    public void setBackupGroupNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_GROUP_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_GROUP_NOT_CONTAINS);
        }
    }

    public boolean getBackupGroupNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_GROUP_NOT_CONTAINS);
    }

    public BackupTargetExecutionWhereInput backupGroupNotEndsWith(String backupGroupNotEndsWith) {

        this.backupGroupNotEndsWith = backupGroupNotEndsWith;
        return this;
    }

    /**
     * Get backupGroupNotEndsWith
     *
     * @return backupGroupNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBackupGroupNotEndsWith() {
        return backupGroupNotEndsWith;
    }

    public void setBackupGroupNotEndsWith(String backupGroupNotEndsWith) {
        this.backupGroupNotEndsWith = backupGroupNotEndsWith;
    }

    public BackupTargetExecutionWhereInput backupGroupNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_GROUP_NOT_ENDS_WITH);
        return this;
    }

    public BackupTargetExecutionWhereInput backupGroupNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_GROUP_NOT_ENDS_WITH);
        return this;
    }

    public void setBackupGroupNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_GROUP_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_GROUP_NOT_ENDS_WITH);
        }
    }

    public boolean getBackupGroupNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_GROUP_NOT_ENDS_WITH);
    }

    public BackupTargetExecutionWhereInput backupGroupNotIn(List<String> backupGroupNotIn) {

        this.backupGroupNotIn = backupGroupNotIn;
        return this;
    }

    public BackupTargetExecutionWhereInput addBackupGroupNotInItem(String backupGroupNotInItem) {
        if (this.backupGroupNotIn == null) {
            this.backupGroupNotIn = new ArrayList<String>();
        }
        this.backupGroupNotIn.add(backupGroupNotInItem);
        return this;
    }

    /**
     * Get backupGroupNotIn
     *
     * @return backupGroupNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getBackupGroupNotIn() {
        return backupGroupNotIn;
    }

    public void setBackupGroupNotIn(List<String> backupGroupNotIn) {
        this.backupGroupNotIn = backupGroupNotIn;
    }

    public BackupTargetExecutionWhereInput backupGroupNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_GROUP_NOT_IN);
        return this;
    }

    public BackupTargetExecutionWhereInput backupGroupNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_GROUP_NOT_IN);
        return this;
    }

    public void setBackupGroupNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_GROUP_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_GROUP_NOT_IN);
        }
    }

    public boolean getBackupGroupNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_GROUP_NOT_IN);
    }

    public BackupTargetExecutionWhereInput backupGroupNotStartsWith(
            String backupGroupNotStartsWith) {

        this.backupGroupNotStartsWith = backupGroupNotStartsWith;
        return this;
    }

    /**
     * Get backupGroupNotStartsWith
     *
     * @return backupGroupNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBackupGroupNotStartsWith() {
        return backupGroupNotStartsWith;
    }

    public void setBackupGroupNotStartsWith(String backupGroupNotStartsWith) {
        this.backupGroupNotStartsWith = backupGroupNotStartsWith;
    }

    public BackupTargetExecutionWhereInput backupGroupNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_GROUP_NOT_STARTS_WITH);
        return this;
    }

    public BackupTargetExecutionWhereInput backupGroupNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_GROUP_NOT_STARTS_WITH);
        return this;
    }

    public void setBackupGroupNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_GROUP_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_GROUP_NOT_STARTS_WITH);
        }
    }

    public boolean getBackupGroupNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_GROUP_NOT_STARTS_WITH);
    }

    public BackupTargetExecutionWhereInput backupGroupStartsWith(String backupGroupStartsWith) {

        this.backupGroupStartsWith = backupGroupStartsWith;
        return this;
    }

    /**
     * Get backupGroupStartsWith
     *
     * @return backupGroupStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBackupGroupStartsWith() {
        return backupGroupStartsWith;
    }

    public void setBackupGroupStartsWith(String backupGroupStartsWith) {
        this.backupGroupStartsWith = backupGroupStartsWith;
    }

    public BackupTargetExecutionWhereInput backupGroupStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_GROUP_STARTS_WITH);
        return this;
    }

    public BackupTargetExecutionWhereInput backupGroupStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_GROUP_STARTS_WITH);
        return this;
    }

    public void setBackupGroupStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_GROUP_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_GROUP_STARTS_WITH);
        }
    }

    public boolean getBackupGroupStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_GROUP_STARTS_WITH);
    }

    public BackupTargetExecutionWhereInput backupPlanExecution(
            BackupPlanExecutionWhereInput backupPlanExecution) {

        this.backupPlanExecution = backupPlanExecution;
        return this;
    }

    /**
     * Get backupPlanExecution
     *
     * @return backupPlanExecution
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public BackupPlanExecutionWhereInput getBackupPlanExecution() {
        return backupPlanExecution;
    }

    public void setBackupPlanExecution(BackupPlanExecutionWhereInput backupPlanExecution) {
        this.backupPlanExecution = backupPlanExecution;
    }

    public BackupTargetExecutionWhereInput backupPlanExecution_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_PLAN_EXECUTION);
        return this;
    }

    public BackupTargetExecutionWhereInput backupPlanExecution_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_PLAN_EXECUTION);
        return this;
    }

    public void setBackupPlanExecution_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_PLAN_EXECUTION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_PLAN_EXECUTION);
        }
    }

    public boolean getBackupPlanExecution_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_PLAN_EXECUTION);
    }

    public BackupTargetExecutionWhereInput backupRestorePoint(
            BackupRestorePointWhereInput backupRestorePoint) {

        this.backupRestorePoint = backupRestorePoint;
        return this;
    }

    /**
     * Get backupRestorePoint
     *
     * @return backupRestorePoint
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public BackupRestorePointWhereInput getBackupRestorePoint() {
        return backupRestorePoint;
    }

    public void setBackupRestorePoint(BackupRestorePointWhereInput backupRestorePoint) {
        this.backupRestorePoint = backupRestorePoint;
    }

    public BackupTargetExecutionWhereInput backupRestorePoint_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_RESTORE_POINT);
        return this;
    }

    public BackupTargetExecutionWhereInput backupRestorePoint_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_RESTORE_POINT);
        return this;
    }

    public void setBackupRestorePoint_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_RESTORE_POINT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_RESTORE_POINT);
        }
    }

    public boolean getBackupRestorePoint_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_RESTORE_POINT);
    }

    public BackupTargetExecutionWhereInput clusterLocalId(String clusterLocalId) {

        this.clusterLocalId = clusterLocalId;
        return this;
    }

    /**
     * Get clusterLocalId
     *
     * @return clusterLocalId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getClusterLocalId() {
        return clusterLocalId;
    }

    public void setClusterLocalId(String clusterLocalId) {
        this.clusterLocalId = clusterLocalId;
    }

    public BackupTargetExecutionWhereInput clusterLocalId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID);
        return this;
    }

    public BackupTargetExecutionWhereInput clusterLocalId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_LOCAL_ID);
        return this;
    }

    public void setClusterLocalId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_LOCAL_ID);
        }
    }

    public boolean getClusterLocalId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLUSTER_LOCAL_ID);
    }

    public BackupTargetExecutionWhereInput clusterLocalIdContains(String clusterLocalIdContains) {

        this.clusterLocalIdContains = clusterLocalIdContains;
        return this;
    }

    /**
     * Get clusterLocalIdContains
     *
     * @return clusterLocalIdContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getClusterLocalIdContains() {
        return clusterLocalIdContains;
    }

    public void setClusterLocalIdContains(String clusterLocalIdContains) {
        this.clusterLocalIdContains = clusterLocalIdContains;
    }

    public BackupTargetExecutionWhereInput clusterLocalIdContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID_CONTAINS);
        return this;
    }

    public BackupTargetExecutionWhereInput clusterLocalIdContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_LOCAL_ID_CONTAINS);
        return this;
    }

    public void setClusterLocalIdContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_LOCAL_ID_CONTAINS);
        }
    }

    public boolean getClusterLocalIdContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLUSTER_LOCAL_ID_CONTAINS);
    }

    public BackupTargetExecutionWhereInput clusterLocalIdEndsWith(String clusterLocalIdEndsWith) {

        this.clusterLocalIdEndsWith = clusterLocalIdEndsWith;
        return this;
    }

    /**
     * Get clusterLocalIdEndsWith
     *
     * @return clusterLocalIdEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getClusterLocalIdEndsWith() {
        return clusterLocalIdEndsWith;
    }

    public void setClusterLocalIdEndsWith(String clusterLocalIdEndsWith) {
        this.clusterLocalIdEndsWith = clusterLocalIdEndsWith;
    }

    public BackupTargetExecutionWhereInput clusterLocalIdEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID_ENDS_WITH);
        return this;
    }

    public BackupTargetExecutionWhereInput clusterLocalIdEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_LOCAL_ID_ENDS_WITH);
        return this;
    }

    public void setClusterLocalIdEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_LOCAL_ID_ENDS_WITH);
        }
    }

    public boolean getClusterLocalIdEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLUSTER_LOCAL_ID_ENDS_WITH);
    }

    public BackupTargetExecutionWhereInput clusterLocalIdGt(String clusterLocalIdGt) {

        this.clusterLocalIdGt = clusterLocalIdGt;
        return this;
    }

    /**
     * Get clusterLocalIdGt
     *
     * @return clusterLocalIdGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getClusterLocalIdGt() {
        return clusterLocalIdGt;
    }

    public void setClusterLocalIdGt(String clusterLocalIdGt) {
        this.clusterLocalIdGt = clusterLocalIdGt;
    }

    public BackupTargetExecutionWhereInput clusterLocalIdGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID_GT);
        return this;
    }

    public BackupTargetExecutionWhereInput clusterLocalIdGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_LOCAL_ID_GT);
        return this;
    }

    public void setClusterLocalIdGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_LOCAL_ID_GT);
        }
    }

    public boolean getClusterLocalIdGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLUSTER_LOCAL_ID_GT);
    }

    public BackupTargetExecutionWhereInput clusterLocalIdGte(String clusterLocalIdGte) {

        this.clusterLocalIdGte = clusterLocalIdGte;
        return this;
    }

    /**
     * Get clusterLocalIdGte
     *
     * @return clusterLocalIdGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getClusterLocalIdGte() {
        return clusterLocalIdGte;
    }

    public void setClusterLocalIdGte(String clusterLocalIdGte) {
        this.clusterLocalIdGte = clusterLocalIdGte;
    }

    public BackupTargetExecutionWhereInput clusterLocalIdGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID_GTE);
        return this;
    }

    public BackupTargetExecutionWhereInput clusterLocalIdGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_LOCAL_ID_GTE);
        return this;
    }

    public void setClusterLocalIdGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_LOCAL_ID_GTE);
        }
    }

    public boolean getClusterLocalIdGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLUSTER_LOCAL_ID_GTE);
    }

    public BackupTargetExecutionWhereInput clusterLocalIdIn(List<String> clusterLocalIdIn) {

        this.clusterLocalIdIn = clusterLocalIdIn;
        return this;
    }

    public BackupTargetExecutionWhereInput addClusterLocalIdInItem(String clusterLocalIdInItem) {
        if (this.clusterLocalIdIn == null) {
            this.clusterLocalIdIn = new ArrayList<String>();
        }
        this.clusterLocalIdIn.add(clusterLocalIdInItem);
        return this;
    }

    /**
     * Get clusterLocalIdIn
     *
     * @return clusterLocalIdIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getClusterLocalIdIn() {
        return clusterLocalIdIn;
    }

    public void setClusterLocalIdIn(List<String> clusterLocalIdIn) {
        this.clusterLocalIdIn = clusterLocalIdIn;
    }

    public BackupTargetExecutionWhereInput clusterLocalIdIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID_IN);
        return this;
    }

    public BackupTargetExecutionWhereInput clusterLocalIdIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_LOCAL_ID_IN);
        return this;
    }

    public void setClusterLocalIdIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_LOCAL_ID_IN);
        }
    }

    public boolean getClusterLocalIdIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLUSTER_LOCAL_ID_IN);
    }

    public BackupTargetExecutionWhereInput clusterLocalIdLt(String clusterLocalIdLt) {

        this.clusterLocalIdLt = clusterLocalIdLt;
        return this;
    }

    /**
     * Get clusterLocalIdLt
     *
     * @return clusterLocalIdLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getClusterLocalIdLt() {
        return clusterLocalIdLt;
    }

    public void setClusterLocalIdLt(String clusterLocalIdLt) {
        this.clusterLocalIdLt = clusterLocalIdLt;
    }

    public BackupTargetExecutionWhereInput clusterLocalIdLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID_LT);
        return this;
    }

    public BackupTargetExecutionWhereInput clusterLocalIdLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_LOCAL_ID_LT);
        return this;
    }

    public void setClusterLocalIdLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_LOCAL_ID_LT);
        }
    }

    public boolean getClusterLocalIdLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLUSTER_LOCAL_ID_LT);
    }

    public BackupTargetExecutionWhereInput clusterLocalIdLte(String clusterLocalIdLte) {

        this.clusterLocalIdLte = clusterLocalIdLte;
        return this;
    }

    /**
     * Get clusterLocalIdLte
     *
     * @return clusterLocalIdLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getClusterLocalIdLte() {
        return clusterLocalIdLte;
    }

    public void setClusterLocalIdLte(String clusterLocalIdLte) {
        this.clusterLocalIdLte = clusterLocalIdLte;
    }

    public BackupTargetExecutionWhereInput clusterLocalIdLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID_LTE);
        return this;
    }

    public BackupTargetExecutionWhereInput clusterLocalIdLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_LOCAL_ID_LTE);
        return this;
    }

    public void setClusterLocalIdLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_LOCAL_ID_LTE);
        }
    }

    public boolean getClusterLocalIdLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLUSTER_LOCAL_ID_LTE);
    }

    public BackupTargetExecutionWhereInput clusterLocalIdNot(String clusterLocalIdNot) {

        this.clusterLocalIdNot = clusterLocalIdNot;
        return this;
    }

    /**
     * Get clusterLocalIdNot
     *
     * @return clusterLocalIdNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getClusterLocalIdNot() {
        return clusterLocalIdNot;
    }

    public void setClusterLocalIdNot(String clusterLocalIdNot) {
        this.clusterLocalIdNot = clusterLocalIdNot;
    }

    public BackupTargetExecutionWhereInput clusterLocalIdNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT);
        return this;
    }

    public BackupTargetExecutionWhereInput clusterLocalIdNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT);
        return this;
    }

    public void setClusterLocalIdNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT);
        }
    }

    public boolean getClusterLocalIdNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT);
    }

    public BackupTargetExecutionWhereInput clusterLocalIdNotContains(
            String clusterLocalIdNotContains) {

        this.clusterLocalIdNotContains = clusterLocalIdNotContains;
        return this;
    }

    /**
     * Get clusterLocalIdNotContains
     *
     * @return clusterLocalIdNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getClusterLocalIdNotContains() {
        return clusterLocalIdNotContains;
    }

    public void setClusterLocalIdNotContains(String clusterLocalIdNotContains) {
        this.clusterLocalIdNotContains = clusterLocalIdNotContains;
    }

    public BackupTargetExecutionWhereInput clusterLocalIdNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT_CONTAINS);
        return this;
    }

    public BackupTargetExecutionWhereInput clusterLocalIdNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT_CONTAINS);
        return this;
    }

    public void setClusterLocalIdNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT_CONTAINS);
        }
    }

    public boolean getClusterLocalIdNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT_CONTAINS);
    }

    public BackupTargetExecutionWhereInput clusterLocalIdNotEndsWith(
            String clusterLocalIdNotEndsWith) {

        this.clusterLocalIdNotEndsWith = clusterLocalIdNotEndsWith;
        return this;
    }

    /**
     * Get clusterLocalIdNotEndsWith
     *
     * @return clusterLocalIdNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getClusterLocalIdNotEndsWith() {
        return clusterLocalIdNotEndsWith;
    }

    public void setClusterLocalIdNotEndsWith(String clusterLocalIdNotEndsWith) {
        this.clusterLocalIdNotEndsWith = clusterLocalIdNotEndsWith;
    }

    public BackupTargetExecutionWhereInput clusterLocalIdNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT_ENDS_WITH);
        return this;
    }

    public BackupTargetExecutionWhereInput clusterLocalIdNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT_ENDS_WITH);
        return this;
    }

    public void setClusterLocalIdNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT_ENDS_WITH);
        }
    }

    public boolean getClusterLocalIdNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT_ENDS_WITH);
    }

    public BackupTargetExecutionWhereInput clusterLocalIdNotIn(List<String> clusterLocalIdNotIn) {

        this.clusterLocalIdNotIn = clusterLocalIdNotIn;
        return this;
    }

    public BackupTargetExecutionWhereInput addClusterLocalIdNotInItem(
            String clusterLocalIdNotInItem) {
        if (this.clusterLocalIdNotIn == null) {
            this.clusterLocalIdNotIn = new ArrayList<String>();
        }
        this.clusterLocalIdNotIn.add(clusterLocalIdNotInItem);
        return this;
    }

    /**
     * Get clusterLocalIdNotIn
     *
     * @return clusterLocalIdNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getClusterLocalIdNotIn() {
        return clusterLocalIdNotIn;
    }

    public void setClusterLocalIdNotIn(List<String> clusterLocalIdNotIn) {
        this.clusterLocalIdNotIn = clusterLocalIdNotIn;
    }

    public BackupTargetExecutionWhereInput clusterLocalIdNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT_IN);
        return this;
    }

    public BackupTargetExecutionWhereInput clusterLocalIdNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT_IN);
        return this;
    }

    public void setClusterLocalIdNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT_IN);
        }
    }

    public boolean getClusterLocalIdNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT_IN);
    }

    public BackupTargetExecutionWhereInput clusterLocalIdNotStartsWith(
            String clusterLocalIdNotStartsWith) {

        this.clusterLocalIdNotStartsWith = clusterLocalIdNotStartsWith;
        return this;
    }

    /**
     * Get clusterLocalIdNotStartsWith
     *
     * @return clusterLocalIdNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getClusterLocalIdNotStartsWith() {
        return clusterLocalIdNotStartsWith;
    }

    public void setClusterLocalIdNotStartsWith(String clusterLocalIdNotStartsWith) {
        this.clusterLocalIdNotStartsWith = clusterLocalIdNotStartsWith;
    }

    public BackupTargetExecutionWhereInput clusterLocalIdNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT_STARTS_WITH);
        return this;
    }

    public BackupTargetExecutionWhereInput clusterLocalIdNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT_STARTS_WITH);
        return this;
    }

    public void setClusterLocalIdNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT_STARTS_WITH);
        }
    }

    public boolean getClusterLocalIdNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT_STARTS_WITH);
    }

    public BackupTargetExecutionWhereInput clusterLocalIdStartsWith(
            String clusterLocalIdStartsWith) {

        this.clusterLocalIdStartsWith = clusterLocalIdStartsWith;
        return this;
    }

    /**
     * Get clusterLocalIdStartsWith
     *
     * @return clusterLocalIdStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getClusterLocalIdStartsWith() {
        return clusterLocalIdStartsWith;
    }

    public void setClusterLocalIdStartsWith(String clusterLocalIdStartsWith) {
        this.clusterLocalIdStartsWith = clusterLocalIdStartsWith;
    }

    public BackupTargetExecutionWhereInput clusterLocalIdStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID_STARTS_WITH);
        return this;
    }

    public BackupTargetExecutionWhereInput clusterLocalIdStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_LOCAL_ID_STARTS_WITH);
        return this;
    }

    public void setClusterLocalIdStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_LOCAL_ID_STARTS_WITH);
        }
    }

    public boolean getClusterLocalIdStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLUSTER_LOCAL_ID_STARTS_WITH);
    }

    public BackupTargetExecutionWhereInput duration(Integer duration) {

        this.duration = duration;
        return this;
    }

    /**
     * Get duration
     *
     * @return duration
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public BackupTargetExecutionWhereInput duration_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DURATION);
        return this;
    }

    public BackupTargetExecutionWhereInput duration_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DURATION);
        return this;
    }

    public void setDuration_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DURATION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DURATION);
        }
    }

    public boolean getDuration_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DURATION);
    }

    public BackupTargetExecutionWhereInput durationGt(Integer durationGt) {

        this.durationGt = durationGt;
        return this;
    }

    /**
     * Get durationGt
     *
     * @return durationGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getDurationGt() {
        return durationGt;
    }

    public void setDurationGt(Integer durationGt) {
        this.durationGt = durationGt;
    }

    public BackupTargetExecutionWhereInput durationGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DURATION_GT);
        return this;
    }

    public BackupTargetExecutionWhereInput durationGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DURATION_GT);
        return this;
    }

    public void setDurationGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DURATION_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DURATION_GT);
        }
    }

    public boolean getDurationGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DURATION_GT);
    }

    public BackupTargetExecutionWhereInput durationGte(Integer durationGte) {

        this.durationGte = durationGte;
        return this;
    }

    /**
     * Get durationGte
     *
     * @return durationGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getDurationGte() {
        return durationGte;
    }

    public void setDurationGte(Integer durationGte) {
        this.durationGte = durationGte;
    }

    public BackupTargetExecutionWhereInput durationGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DURATION_GTE);
        return this;
    }

    public BackupTargetExecutionWhereInput durationGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DURATION_GTE);
        return this;
    }

    public void setDurationGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DURATION_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DURATION_GTE);
        }
    }

    public boolean getDurationGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DURATION_GTE);
    }

    public BackupTargetExecutionWhereInput durationIn(List<Integer> durationIn) {

        this.durationIn = durationIn;
        return this;
    }

    public BackupTargetExecutionWhereInput addDurationInItem(Integer durationInItem) {
        if (this.durationIn == null) {
            this.durationIn = new ArrayList<Integer>();
        }
        this.durationIn.add(durationInItem);
        return this;
    }

    /**
     * Get durationIn
     *
     * @return durationIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getDurationIn() {
        return durationIn;
    }

    public void setDurationIn(List<Integer> durationIn) {
        this.durationIn = durationIn;
    }

    public BackupTargetExecutionWhereInput durationIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DURATION_IN);
        return this;
    }

    public BackupTargetExecutionWhereInput durationIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DURATION_IN);
        return this;
    }

    public void setDurationIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DURATION_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DURATION_IN);
        }
    }

    public boolean getDurationIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DURATION_IN);
    }

    public BackupTargetExecutionWhereInput durationLt(Integer durationLt) {

        this.durationLt = durationLt;
        return this;
    }

    /**
     * Get durationLt
     *
     * @return durationLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getDurationLt() {
        return durationLt;
    }

    public void setDurationLt(Integer durationLt) {
        this.durationLt = durationLt;
    }

    public BackupTargetExecutionWhereInput durationLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DURATION_LT);
        return this;
    }

    public BackupTargetExecutionWhereInput durationLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DURATION_LT);
        return this;
    }

    public void setDurationLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DURATION_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DURATION_LT);
        }
    }

    public boolean getDurationLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DURATION_LT);
    }

    public BackupTargetExecutionWhereInput durationLte(Integer durationLte) {

        this.durationLte = durationLte;
        return this;
    }

    /**
     * Get durationLte
     *
     * @return durationLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getDurationLte() {
        return durationLte;
    }

    public void setDurationLte(Integer durationLte) {
        this.durationLte = durationLte;
    }

    public BackupTargetExecutionWhereInput durationLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DURATION_LTE);
        return this;
    }

    public BackupTargetExecutionWhereInput durationLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DURATION_LTE);
        return this;
    }

    public void setDurationLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DURATION_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DURATION_LTE);
        }
    }

    public boolean getDurationLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DURATION_LTE);
    }

    public BackupTargetExecutionWhereInput durationNot(Integer durationNot) {

        this.durationNot = durationNot;
        return this;
    }

    /**
     * Get durationNot
     *
     * @return durationNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getDurationNot() {
        return durationNot;
    }

    public void setDurationNot(Integer durationNot) {
        this.durationNot = durationNot;
    }

    public BackupTargetExecutionWhereInput durationNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DURATION_NOT);
        return this;
    }

    public BackupTargetExecutionWhereInput durationNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DURATION_NOT);
        return this;
    }

    public void setDurationNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DURATION_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DURATION_NOT);
        }
    }

    public boolean getDurationNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DURATION_NOT);
    }

    public BackupTargetExecutionWhereInput durationNotIn(List<Integer> durationNotIn) {

        this.durationNotIn = durationNotIn;
        return this;
    }

    public BackupTargetExecutionWhereInput addDurationNotInItem(Integer durationNotInItem) {
        if (this.durationNotIn == null) {
            this.durationNotIn = new ArrayList<Integer>();
        }
        this.durationNotIn.add(durationNotInItem);
        return this;
    }

    /**
     * Get durationNotIn
     *
     * @return durationNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getDurationNotIn() {
        return durationNotIn;
    }

    public void setDurationNotIn(List<Integer> durationNotIn) {
        this.durationNotIn = durationNotIn;
    }

    public BackupTargetExecutionWhereInput durationNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DURATION_NOT_IN);
        return this;
    }

    public BackupTargetExecutionWhereInput durationNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DURATION_NOT_IN);
        return this;
    }

    public void setDurationNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DURATION_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DURATION_NOT_IN);
        }
    }

    public boolean getDurationNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DURATION_NOT_IN);
    }

    public BackupTargetExecutionWhereInput entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {

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

    public BackupTargetExecutionWhereInput entityAsyncStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        return this;
    }

    public BackupTargetExecutionWhereInput entityAsyncStatus_ExplictlyNonNull() {
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

    public BackupTargetExecutionWhereInput entityAsyncStatusIn(
            List<EntityAsyncStatus> entityAsyncStatusIn) {

        this.entityAsyncStatusIn = entityAsyncStatusIn;
        return this;
    }

    public BackupTargetExecutionWhereInput addEntityAsyncStatusInItem(
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

    public BackupTargetExecutionWhereInput entityAsyncStatusIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_IN);
        return this;
    }

    public BackupTargetExecutionWhereInput entityAsyncStatusIn_ExplictlyNonNull() {
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

    public BackupTargetExecutionWhereInput entityAsyncStatusNot(
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

    public BackupTargetExecutionWhereInput entityAsyncStatusNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT);
        return this;
    }

    public BackupTargetExecutionWhereInput entityAsyncStatusNot_ExplictlyNonNull() {
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

    public BackupTargetExecutionWhereInput entityAsyncStatusNotIn(
            List<EntityAsyncStatus> entityAsyncStatusNotIn) {

        this.entityAsyncStatusNotIn = entityAsyncStatusNotIn;
        return this;
    }

    public BackupTargetExecutionWhereInput addEntityAsyncStatusNotInItem(
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

    public BackupTargetExecutionWhereInput entityAsyncStatusNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT_IN);
        return this;
    }

    public BackupTargetExecutionWhereInput entityAsyncStatusNotIn_ExplictlyNonNull() {
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

    public BackupTargetExecutionWhereInput executedAt(String executedAt) {

        this.executedAt = executedAt;
        return this;
    }

    /**
     * Get executedAt
     *
     * @return executedAt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getExecutedAt() {
        return executedAt;
    }

    public void setExecutedAt(String executedAt) {
        this.executedAt = executedAt;
    }

    public BackupTargetExecutionWhereInput executedAt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXECUTED_AT);
        return this;
    }

    public BackupTargetExecutionWhereInput executedAt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EXECUTED_AT);
        return this;
    }

    public void setExecutedAt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EXECUTED_AT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EXECUTED_AT);
        }
    }

    public boolean getExecutedAt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EXECUTED_AT);
    }

    public BackupTargetExecutionWhereInput executedAtGt(String executedAtGt) {

        this.executedAtGt = executedAtGt;
        return this;
    }

    /**
     * Get executedAtGt
     *
     * @return executedAtGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getExecutedAtGt() {
        return executedAtGt;
    }

    public void setExecutedAtGt(String executedAtGt) {
        this.executedAtGt = executedAtGt;
    }

    public BackupTargetExecutionWhereInput executedAtGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXECUTED_AT_GT);
        return this;
    }

    public BackupTargetExecutionWhereInput executedAtGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EXECUTED_AT_GT);
        return this;
    }

    public void setExecutedAtGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EXECUTED_AT_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EXECUTED_AT_GT);
        }
    }

    public boolean getExecutedAtGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EXECUTED_AT_GT);
    }

    public BackupTargetExecutionWhereInput executedAtGte(String executedAtGte) {

        this.executedAtGte = executedAtGte;
        return this;
    }

    /**
     * Get executedAtGte
     *
     * @return executedAtGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getExecutedAtGte() {
        return executedAtGte;
    }

    public void setExecutedAtGte(String executedAtGte) {
        this.executedAtGte = executedAtGte;
    }

    public BackupTargetExecutionWhereInput executedAtGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXECUTED_AT_GTE);
        return this;
    }

    public BackupTargetExecutionWhereInput executedAtGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EXECUTED_AT_GTE);
        return this;
    }

    public void setExecutedAtGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EXECUTED_AT_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EXECUTED_AT_GTE);
        }
    }

    public boolean getExecutedAtGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EXECUTED_AT_GTE);
    }

    public BackupTargetExecutionWhereInput executedAtIn(List<String> executedAtIn) {

        this.executedAtIn = executedAtIn;
        return this;
    }

    public BackupTargetExecutionWhereInput addExecutedAtInItem(String executedAtInItem) {
        if (this.executedAtIn == null) {
            this.executedAtIn = new ArrayList<String>();
        }
        this.executedAtIn.add(executedAtInItem);
        return this;
    }

    /**
     * Get executedAtIn
     *
     * @return executedAtIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getExecutedAtIn() {
        return executedAtIn;
    }

    public void setExecutedAtIn(List<String> executedAtIn) {
        this.executedAtIn = executedAtIn;
    }

    public BackupTargetExecutionWhereInput executedAtIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXECUTED_AT_IN);
        return this;
    }

    public BackupTargetExecutionWhereInput executedAtIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EXECUTED_AT_IN);
        return this;
    }

    public void setExecutedAtIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EXECUTED_AT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EXECUTED_AT_IN);
        }
    }

    public boolean getExecutedAtIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EXECUTED_AT_IN);
    }

    public BackupTargetExecutionWhereInput executedAtLt(String executedAtLt) {

        this.executedAtLt = executedAtLt;
        return this;
    }

    /**
     * Get executedAtLt
     *
     * @return executedAtLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getExecutedAtLt() {
        return executedAtLt;
    }

    public void setExecutedAtLt(String executedAtLt) {
        this.executedAtLt = executedAtLt;
    }

    public BackupTargetExecutionWhereInput executedAtLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXECUTED_AT_LT);
        return this;
    }

    public BackupTargetExecutionWhereInput executedAtLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EXECUTED_AT_LT);
        return this;
    }

    public void setExecutedAtLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EXECUTED_AT_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EXECUTED_AT_LT);
        }
    }

    public boolean getExecutedAtLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EXECUTED_AT_LT);
    }

    public BackupTargetExecutionWhereInput executedAtLte(String executedAtLte) {

        this.executedAtLte = executedAtLte;
        return this;
    }

    /**
     * Get executedAtLte
     *
     * @return executedAtLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getExecutedAtLte() {
        return executedAtLte;
    }

    public void setExecutedAtLte(String executedAtLte) {
        this.executedAtLte = executedAtLte;
    }

    public BackupTargetExecutionWhereInput executedAtLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXECUTED_AT_LTE);
        return this;
    }

    public BackupTargetExecutionWhereInput executedAtLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EXECUTED_AT_LTE);
        return this;
    }

    public void setExecutedAtLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EXECUTED_AT_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EXECUTED_AT_LTE);
        }
    }

    public boolean getExecutedAtLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EXECUTED_AT_LTE);
    }

    public BackupTargetExecutionWhereInput executedAtNot(String executedAtNot) {

        this.executedAtNot = executedAtNot;
        return this;
    }

    /**
     * Get executedAtNot
     *
     * @return executedAtNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getExecutedAtNot() {
        return executedAtNot;
    }

    public void setExecutedAtNot(String executedAtNot) {
        this.executedAtNot = executedAtNot;
    }

    public BackupTargetExecutionWhereInput executedAtNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXECUTED_AT_NOT);
        return this;
    }

    public BackupTargetExecutionWhereInput executedAtNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EXECUTED_AT_NOT);
        return this;
    }

    public void setExecutedAtNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EXECUTED_AT_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EXECUTED_AT_NOT);
        }
    }

    public boolean getExecutedAtNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EXECUTED_AT_NOT);
    }

    public BackupTargetExecutionWhereInput executedAtNotIn(List<String> executedAtNotIn) {

        this.executedAtNotIn = executedAtNotIn;
        return this;
    }

    public BackupTargetExecutionWhereInput addExecutedAtNotInItem(String executedAtNotInItem) {
        if (this.executedAtNotIn == null) {
            this.executedAtNotIn = new ArrayList<String>();
        }
        this.executedAtNotIn.add(executedAtNotInItem);
        return this;
    }

    /**
     * Get executedAtNotIn
     *
     * @return executedAtNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getExecutedAtNotIn() {
        return executedAtNotIn;
    }

    public void setExecutedAtNotIn(List<String> executedAtNotIn) {
        this.executedAtNotIn = executedAtNotIn;
    }

    public BackupTargetExecutionWhereInput executedAtNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXECUTED_AT_NOT_IN);
        return this;
    }

    public BackupTargetExecutionWhereInput executedAtNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EXECUTED_AT_NOT_IN);
        return this;
    }

    public void setExecutedAtNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EXECUTED_AT_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EXECUTED_AT_NOT_IN);
        }
    }

    public boolean getExecutedAtNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EXECUTED_AT_NOT_IN);
    }

    public BackupTargetExecutionWhereInput id(String id) {

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

    public BackupTargetExecutionWhereInput id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public BackupTargetExecutionWhereInput id_ExplictlyNonNull() {
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

    public BackupTargetExecutionWhereInput idContains(String idContains) {

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

    public BackupTargetExecutionWhereInput idContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_CONTAINS);
        return this;
    }

    public BackupTargetExecutionWhereInput idContains_ExplictlyNonNull() {
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

    public BackupTargetExecutionWhereInput idEndsWith(String idEndsWith) {

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

    public BackupTargetExecutionWhereInput idEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_ENDS_WITH);
        return this;
    }

    public BackupTargetExecutionWhereInput idEndsWith_ExplictlyNonNull() {
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

    public BackupTargetExecutionWhereInput idGt(String idGt) {

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

    public BackupTargetExecutionWhereInput idGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GT);
        return this;
    }

    public BackupTargetExecutionWhereInput idGt_ExplictlyNonNull() {
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

    public BackupTargetExecutionWhereInput idGte(String idGte) {

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

    public BackupTargetExecutionWhereInput idGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GTE);
        return this;
    }

    public BackupTargetExecutionWhereInput idGte_ExplictlyNonNull() {
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

    public BackupTargetExecutionWhereInput idIn(List<String> idIn) {

        this.idIn = idIn;
        return this;
    }

    public BackupTargetExecutionWhereInput addIdInItem(String idInItem) {
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

    public BackupTargetExecutionWhereInput idIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_IN);
        return this;
    }

    public BackupTargetExecutionWhereInput idIn_ExplictlyNonNull() {
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

    public BackupTargetExecutionWhereInput idLt(String idLt) {

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

    public BackupTargetExecutionWhereInput idLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LT);
        return this;
    }

    public BackupTargetExecutionWhereInput idLt_ExplictlyNonNull() {
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

    public BackupTargetExecutionWhereInput idLte(String idLte) {

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

    public BackupTargetExecutionWhereInput idLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LTE);
        return this;
    }

    public BackupTargetExecutionWhereInput idLte_ExplictlyNonNull() {
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

    public BackupTargetExecutionWhereInput idNot(String idNot) {

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

    public BackupTargetExecutionWhereInput idNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT);
        return this;
    }

    public BackupTargetExecutionWhereInput idNot_ExplictlyNonNull() {
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

    public BackupTargetExecutionWhereInput idNotContains(String idNotContains) {

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

    public BackupTargetExecutionWhereInput idNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_CONTAINS);
        return this;
    }

    public BackupTargetExecutionWhereInput idNotContains_ExplictlyNonNull() {
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

    public BackupTargetExecutionWhereInput idNotEndsWith(String idNotEndsWith) {

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

    public BackupTargetExecutionWhereInput idNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
        return this;
    }

    public BackupTargetExecutionWhereInput idNotEndsWith_ExplictlyNonNull() {
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

    public BackupTargetExecutionWhereInput idNotIn(List<String> idNotIn) {

        this.idNotIn = idNotIn;
        return this;
    }

    public BackupTargetExecutionWhereInput addIdNotInItem(String idNotInItem) {
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

    public BackupTargetExecutionWhereInput idNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_IN);
        return this;
    }

    public BackupTargetExecutionWhereInput idNotIn_ExplictlyNonNull() {
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

    public BackupTargetExecutionWhereInput idNotStartsWith(String idNotStartsWith) {

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

    public BackupTargetExecutionWhereInput idNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
        return this;
    }

    public BackupTargetExecutionWhereInput idNotStartsWith_ExplictlyNonNull() {
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

    public BackupTargetExecutionWhereInput idStartsWith(String idStartsWith) {

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

    public BackupTargetExecutionWhereInput idStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_STARTS_WITH);
        return this;
    }

    public BackupTargetExecutionWhereInput idStartsWith_ExplictlyNonNull() {
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

    public BackupTargetExecutionWhereInput localId(String localId) {

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

    public BackupTargetExecutionWhereInput localId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID);
        return this;
    }

    public BackupTargetExecutionWhereInput localId_ExplictlyNonNull() {
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

    public BackupTargetExecutionWhereInput localIdContains(String localIdContains) {

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

    public BackupTargetExecutionWhereInput localIdContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_CONTAINS);
        return this;
    }

    public BackupTargetExecutionWhereInput localIdContains_ExplictlyNonNull() {
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

    public BackupTargetExecutionWhereInput localIdEndsWith(String localIdEndsWith) {

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

    public BackupTargetExecutionWhereInput localIdEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_ENDS_WITH);
        return this;
    }

    public BackupTargetExecutionWhereInput localIdEndsWith_ExplictlyNonNull() {
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

    public BackupTargetExecutionWhereInput localIdGt(String localIdGt) {

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

    public BackupTargetExecutionWhereInput localIdGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_GT);
        return this;
    }

    public BackupTargetExecutionWhereInput localIdGt_ExplictlyNonNull() {
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

    public BackupTargetExecutionWhereInput localIdGte(String localIdGte) {

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

    public BackupTargetExecutionWhereInput localIdGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_GTE);
        return this;
    }

    public BackupTargetExecutionWhereInput localIdGte_ExplictlyNonNull() {
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

    public BackupTargetExecutionWhereInput localIdIn(List<String> localIdIn) {

        this.localIdIn = localIdIn;
        return this;
    }

    public BackupTargetExecutionWhereInput addLocalIdInItem(String localIdInItem) {
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

    public BackupTargetExecutionWhereInput localIdIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_IN);
        return this;
    }

    public BackupTargetExecutionWhereInput localIdIn_ExplictlyNonNull() {
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

    public BackupTargetExecutionWhereInput localIdLt(String localIdLt) {

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

    public BackupTargetExecutionWhereInput localIdLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_LT);
        return this;
    }

    public BackupTargetExecutionWhereInput localIdLt_ExplictlyNonNull() {
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

    public BackupTargetExecutionWhereInput localIdLte(String localIdLte) {

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

    public BackupTargetExecutionWhereInput localIdLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_LTE);
        return this;
    }

    public BackupTargetExecutionWhereInput localIdLte_ExplictlyNonNull() {
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

    public BackupTargetExecutionWhereInput localIdNot(String localIdNot) {

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

    public BackupTargetExecutionWhereInput localIdNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT);
        return this;
    }

    public BackupTargetExecutionWhereInput localIdNot_ExplictlyNonNull() {
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

    public BackupTargetExecutionWhereInput localIdNotContains(String localIdNotContains) {

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

    public BackupTargetExecutionWhereInput localIdNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_CONTAINS);
        return this;
    }

    public BackupTargetExecutionWhereInput localIdNotContains_ExplictlyNonNull() {
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

    public BackupTargetExecutionWhereInput localIdNotEndsWith(String localIdNotEndsWith) {

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

    public BackupTargetExecutionWhereInput localIdNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_ENDS_WITH);
        return this;
    }

    public BackupTargetExecutionWhereInput localIdNotEndsWith_ExplictlyNonNull() {
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

    public BackupTargetExecutionWhereInput localIdNotIn(List<String> localIdNotIn) {

        this.localIdNotIn = localIdNotIn;
        return this;
    }

    public BackupTargetExecutionWhereInput addLocalIdNotInItem(String localIdNotInItem) {
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

    public BackupTargetExecutionWhereInput localIdNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_IN);
        return this;
    }

    public BackupTargetExecutionWhereInput localIdNotIn_ExplictlyNonNull() {
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

    public BackupTargetExecutionWhereInput localIdNotStartsWith(String localIdNotStartsWith) {

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

    public BackupTargetExecutionWhereInput localIdNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_STARTS_WITH);
        return this;
    }

    public BackupTargetExecutionWhereInput localIdNotStartsWith_ExplictlyNonNull() {
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

    public BackupTargetExecutionWhereInput localIdStartsWith(String localIdStartsWith) {

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

    public BackupTargetExecutionWhereInput localIdStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_STARTS_WITH);
        return this;
    }

    public BackupTargetExecutionWhereInput localIdStartsWith_ExplictlyNonNull() {
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

    public BackupTargetExecutionWhereInput parentBackup(String parentBackup) {

        this.parentBackup = parentBackup;
        return this;
    }

    /**
     * Get parentBackup
     *
     * @return parentBackup
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getParentBackup() {
        return parentBackup;
    }

    public void setParentBackup(String parentBackup) {
        this.parentBackup = parentBackup;
    }

    public BackupTargetExecutionWhereInput parentBackup_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PARENT_BACKUP);
        return this;
    }

    public BackupTargetExecutionWhereInput parentBackup_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PARENT_BACKUP);
        return this;
    }

    public void setParentBackup_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PARENT_BACKUP);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PARENT_BACKUP);
        }
    }

    public boolean getParentBackup_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PARENT_BACKUP);
    }

    public BackupTargetExecutionWhereInput parentBackupContains(String parentBackupContains) {

        this.parentBackupContains = parentBackupContains;
        return this;
    }

    /**
     * Get parentBackupContains
     *
     * @return parentBackupContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getParentBackupContains() {
        return parentBackupContains;
    }

    public void setParentBackupContains(String parentBackupContains) {
        this.parentBackupContains = parentBackupContains;
    }

    public BackupTargetExecutionWhereInput parentBackupContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PARENT_BACKUP_CONTAINS);
        return this;
    }

    public BackupTargetExecutionWhereInput parentBackupContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PARENT_BACKUP_CONTAINS);
        return this;
    }

    public void setParentBackupContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PARENT_BACKUP_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PARENT_BACKUP_CONTAINS);
        }
    }

    public boolean getParentBackupContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PARENT_BACKUP_CONTAINS);
    }

    public BackupTargetExecutionWhereInput parentBackupEndsWith(String parentBackupEndsWith) {

        this.parentBackupEndsWith = parentBackupEndsWith;
        return this;
    }

    /**
     * Get parentBackupEndsWith
     *
     * @return parentBackupEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getParentBackupEndsWith() {
        return parentBackupEndsWith;
    }

    public void setParentBackupEndsWith(String parentBackupEndsWith) {
        this.parentBackupEndsWith = parentBackupEndsWith;
    }

    public BackupTargetExecutionWhereInput parentBackupEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PARENT_BACKUP_ENDS_WITH);
        return this;
    }

    public BackupTargetExecutionWhereInput parentBackupEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PARENT_BACKUP_ENDS_WITH);
        return this;
    }

    public void setParentBackupEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PARENT_BACKUP_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PARENT_BACKUP_ENDS_WITH);
        }
    }

    public boolean getParentBackupEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PARENT_BACKUP_ENDS_WITH);
    }

    public BackupTargetExecutionWhereInput parentBackupGt(String parentBackupGt) {

        this.parentBackupGt = parentBackupGt;
        return this;
    }

    /**
     * Get parentBackupGt
     *
     * @return parentBackupGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getParentBackupGt() {
        return parentBackupGt;
    }

    public void setParentBackupGt(String parentBackupGt) {
        this.parentBackupGt = parentBackupGt;
    }

    public BackupTargetExecutionWhereInput parentBackupGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PARENT_BACKUP_GT);
        return this;
    }

    public BackupTargetExecutionWhereInput parentBackupGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PARENT_BACKUP_GT);
        return this;
    }

    public void setParentBackupGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PARENT_BACKUP_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PARENT_BACKUP_GT);
        }
    }

    public boolean getParentBackupGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PARENT_BACKUP_GT);
    }

    public BackupTargetExecutionWhereInput parentBackupGte(String parentBackupGte) {

        this.parentBackupGte = parentBackupGte;
        return this;
    }

    /**
     * Get parentBackupGte
     *
     * @return parentBackupGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getParentBackupGte() {
        return parentBackupGte;
    }

    public void setParentBackupGte(String parentBackupGte) {
        this.parentBackupGte = parentBackupGte;
    }

    public BackupTargetExecutionWhereInput parentBackupGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PARENT_BACKUP_GTE);
        return this;
    }

    public BackupTargetExecutionWhereInput parentBackupGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PARENT_BACKUP_GTE);
        return this;
    }

    public void setParentBackupGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PARENT_BACKUP_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PARENT_BACKUP_GTE);
        }
    }

    public boolean getParentBackupGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PARENT_BACKUP_GTE);
    }

    public BackupTargetExecutionWhereInput parentBackupIn(List<String> parentBackupIn) {

        this.parentBackupIn = parentBackupIn;
        return this;
    }

    public BackupTargetExecutionWhereInput addParentBackupInItem(String parentBackupInItem) {
        if (this.parentBackupIn == null) {
            this.parentBackupIn = new ArrayList<String>();
        }
        this.parentBackupIn.add(parentBackupInItem);
        return this;
    }

    /**
     * Get parentBackupIn
     *
     * @return parentBackupIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getParentBackupIn() {
        return parentBackupIn;
    }

    public void setParentBackupIn(List<String> parentBackupIn) {
        this.parentBackupIn = parentBackupIn;
    }

    public BackupTargetExecutionWhereInput parentBackupIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PARENT_BACKUP_IN);
        return this;
    }

    public BackupTargetExecutionWhereInput parentBackupIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PARENT_BACKUP_IN);
        return this;
    }

    public void setParentBackupIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PARENT_BACKUP_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PARENT_BACKUP_IN);
        }
    }

    public boolean getParentBackupIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PARENT_BACKUP_IN);
    }

    public BackupTargetExecutionWhereInput parentBackupLt(String parentBackupLt) {

        this.parentBackupLt = parentBackupLt;
        return this;
    }

    /**
     * Get parentBackupLt
     *
     * @return parentBackupLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getParentBackupLt() {
        return parentBackupLt;
    }

    public void setParentBackupLt(String parentBackupLt) {
        this.parentBackupLt = parentBackupLt;
    }

    public BackupTargetExecutionWhereInput parentBackupLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PARENT_BACKUP_LT);
        return this;
    }

    public BackupTargetExecutionWhereInput parentBackupLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PARENT_BACKUP_LT);
        return this;
    }

    public void setParentBackupLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PARENT_BACKUP_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PARENT_BACKUP_LT);
        }
    }

    public boolean getParentBackupLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PARENT_BACKUP_LT);
    }

    public BackupTargetExecutionWhereInput parentBackupLte(String parentBackupLte) {

        this.parentBackupLte = parentBackupLte;
        return this;
    }

    /**
     * Get parentBackupLte
     *
     * @return parentBackupLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getParentBackupLte() {
        return parentBackupLte;
    }

    public void setParentBackupLte(String parentBackupLte) {
        this.parentBackupLte = parentBackupLte;
    }

    public BackupTargetExecutionWhereInput parentBackupLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PARENT_BACKUP_LTE);
        return this;
    }

    public BackupTargetExecutionWhereInput parentBackupLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PARENT_BACKUP_LTE);
        return this;
    }

    public void setParentBackupLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PARENT_BACKUP_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PARENT_BACKUP_LTE);
        }
    }

    public boolean getParentBackupLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PARENT_BACKUP_LTE);
    }

    public BackupTargetExecutionWhereInput parentBackupNot(String parentBackupNot) {

        this.parentBackupNot = parentBackupNot;
        return this;
    }

    /**
     * Get parentBackupNot
     *
     * @return parentBackupNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getParentBackupNot() {
        return parentBackupNot;
    }

    public void setParentBackupNot(String parentBackupNot) {
        this.parentBackupNot = parentBackupNot;
    }

    public BackupTargetExecutionWhereInput parentBackupNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PARENT_BACKUP_NOT);
        return this;
    }

    public BackupTargetExecutionWhereInput parentBackupNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PARENT_BACKUP_NOT);
        return this;
    }

    public void setParentBackupNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PARENT_BACKUP_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PARENT_BACKUP_NOT);
        }
    }

    public boolean getParentBackupNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PARENT_BACKUP_NOT);
    }

    public BackupTargetExecutionWhereInput parentBackupNotContains(String parentBackupNotContains) {

        this.parentBackupNotContains = parentBackupNotContains;
        return this;
    }

    /**
     * Get parentBackupNotContains
     *
     * @return parentBackupNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getParentBackupNotContains() {
        return parentBackupNotContains;
    }

    public void setParentBackupNotContains(String parentBackupNotContains) {
        this.parentBackupNotContains = parentBackupNotContains;
    }

    public BackupTargetExecutionWhereInput parentBackupNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PARENT_BACKUP_NOT_CONTAINS);
        return this;
    }

    public BackupTargetExecutionWhereInput parentBackupNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PARENT_BACKUP_NOT_CONTAINS);
        return this;
    }

    public void setParentBackupNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PARENT_BACKUP_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PARENT_BACKUP_NOT_CONTAINS);
        }
    }

    public boolean getParentBackupNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PARENT_BACKUP_NOT_CONTAINS);
    }

    public BackupTargetExecutionWhereInput parentBackupNotEndsWith(String parentBackupNotEndsWith) {

        this.parentBackupNotEndsWith = parentBackupNotEndsWith;
        return this;
    }

    /**
     * Get parentBackupNotEndsWith
     *
     * @return parentBackupNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getParentBackupNotEndsWith() {
        return parentBackupNotEndsWith;
    }

    public void setParentBackupNotEndsWith(String parentBackupNotEndsWith) {
        this.parentBackupNotEndsWith = parentBackupNotEndsWith;
    }

    public BackupTargetExecutionWhereInput parentBackupNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PARENT_BACKUP_NOT_ENDS_WITH);
        return this;
    }

    public BackupTargetExecutionWhereInput parentBackupNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PARENT_BACKUP_NOT_ENDS_WITH);
        return this;
    }

    public void setParentBackupNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PARENT_BACKUP_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PARENT_BACKUP_NOT_ENDS_WITH);
        }
    }

    public boolean getParentBackupNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PARENT_BACKUP_NOT_ENDS_WITH);
    }

    public BackupTargetExecutionWhereInput parentBackupNotIn(List<String> parentBackupNotIn) {

        this.parentBackupNotIn = parentBackupNotIn;
        return this;
    }

    public BackupTargetExecutionWhereInput addParentBackupNotInItem(String parentBackupNotInItem) {
        if (this.parentBackupNotIn == null) {
            this.parentBackupNotIn = new ArrayList<String>();
        }
        this.parentBackupNotIn.add(parentBackupNotInItem);
        return this;
    }

    /**
     * Get parentBackupNotIn
     *
     * @return parentBackupNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getParentBackupNotIn() {
        return parentBackupNotIn;
    }

    public void setParentBackupNotIn(List<String> parentBackupNotIn) {
        this.parentBackupNotIn = parentBackupNotIn;
    }

    public BackupTargetExecutionWhereInput parentBackupNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PARENT_BACKUP_NOT_IN);
        return this;
    }

    public BackupTargetExecutionWhereInput parentBackupNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PARENT_BACKUP_NOT_IN);
        return this;
    }

    public void setParentBackupNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PARENT_BACKUP_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PARENT_BACKUP_NOT_IN);
        }
    }

    public boolean getParentBackupNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PARENT_BACKUP_NOT_IN);
    }

    public BackupTargetExecutionWhereInput parentBackupNotStartsWith(
            String parentBackupNotStartsWith) {

        this.parentBackupNotStartsWith = parentBackupNotStartsWith;
        return this;
    }

    /**
     * Get parentBackupNotStartsWith
     *
     * @return parentBackupNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getParentBackupNotStartsWith() {
        return parentBackupNotStartsWith;
    }

    public void setParentBackupNotStartsWith(String parentBackupNotStartsWith) {
        this.parentBackupNotStartsWith = parentBackupNotStartsWith;
    }

    public BackupTargetExecutionWhereInput parentBackupNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PARENT_BACKUP_NOT_STARTS_WITH);
        return this;
    }

    public BackupTargetExecutionWhereInput parentBackupNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PARENT_BACKUP_NOT_STARTS_WITH);
        return this;
    }

    public void setParentBackupNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PARENT_BACKUP_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PARENT_BACKUP_NOT_STARTS_WITH);
        }
    }

    public boolean getParentBackupNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PARENT_BACKUP_NOT_STARTS_WITH);
    }

    public BackupTargetExecutionWhereInput parentBackupStartsWith(String parentBackupStartsWith) {

        this.parentBackupStartsWith = parentBackupStartsWith;
        return this;
    }

    /**
     * Get parentBackupStartsWith
     *
     * @return parentBackupStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getParentBackupStartsWith() {
        return parentBackupStartsWith;
    }

    public void setParentBackupStartsWith(String parentBackupStartsWith) {
        this.parentBackupStartsWith = parentBackupStartsWith;
    }

    public BackupTargetExecutionWhereInput parentBackupStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PARENT_BACKUP_STARTS_WITH);
        return this;
    }

    public BackupTargetExecutionWhereInput parentBackupStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PARENT_BACKUP_STARTS_WITH);
        return this;
    }

    public void setParentBackupStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PARENT_BACKUP_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PARENT_BACKUP_STARTS_WITH);
        }
    }

    public boolean getParentBackupStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PARENT_BACKUP_STARTS_WITH);
    }

    public BackupTargetExecutionWhereInput readBytes(Long readBytes) {

        this.readBytes = readBytes;
        return this;
    }

    /**
     * Get readBytes
     *
     * @return readBytes
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getReadBytes() {
        return readBytes;
    }

    public void setReadBytes(Long readBytes) {
        this.readBytes = readBytes;
    }

    public BackupTargetExecutionWhereInput readBytes_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_READ_BYTES);
        return this;
    }

    public BackupTargetExecutionWhereInput readBytes_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_READ_BYTES);
        return this;
    }

    public void setReadBytes_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_READ_BYTES);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_READ_BYTES);
        }
    }

    public boolean getReadBytes_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_READ_BYTES);
    }

    public BackupTargetExecutionWhereInput readBytesGt(Long readBytesGt) {

        this.readBytesGt = readBytesGt;
        return this;
    }

    /**
     * Get readBytesGt
     *
     * @return readBytesGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getReadBytesGt() {
        return readBytesGt;
    }

    public void setReadBytesGt(Long readBytesGt) {
        this.readBytesGt = readBytesGt;
    }

    public BackupTargetExecutionWhereInput readBytesGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_READ_BYTES_GT);
        return this;
    }

    public BackupTargetExecutionWhereInput readBytesGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_READ_BYTES_GT);
        return this;
    }

    public void setReadBytesGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_READ_BYTES_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_READ_BYTES_GT);
        }
    }

    public boolean getReadBytesGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_READ_BYTES_GT);
    }

    public BackupTargetExecutionWhereInput readBytesGte(Long readBytesGte) {

        this.readBytesGte = readBytesGte;
        return this;
    }

    /**
     * Get readBytesGte
     *
     * @return readBytesGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getReadBytesGte() {
        return readBytesGte;
    }

    public void setReadBytesGte(Long readBytesGte) {
        this.readBytesGte = readBytesGte;
    }

    public BackupTargetExecutionWhereInput readBytesGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_READ_BYTES_GTE);
        return this;
    }

    public BackupTargetExecutionWhereInput readBytesGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_READ_BYTES_GTE);
        return this;
    }

    public void setReadBytesGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_READ_BYTES_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_READ_BYTES_GTE);
        }
    }

    public boolean getReadBytesGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_READ_BYTES_GTE);
    }

    public BackupTargetExecutionWhereInput readBytesIn(List<Long> readBytesIn) {

        this.readBytesIn = readBytesIn;
        return this;
    }

    public BackupTargetExecutionWhereInput addReadBytesInItem(Long readBytesInItem) {
        if (this.readBytesIn == null) {
            this.readBytesIn = new ArrayList<Long>();
        }
        this.readBytesIn.add(readBytesInItem);
        return this;
    }

    /**
     * Get readBytesIn
     *
     * @return readBytesIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getReadBytesIn() {
        return readBytesIn;
    }

    public void setReadBytesIn(List<Long> readBytesIn) {
        this.readBytesIn = readBytesIn;
    }

    public BackupTargetExecutionWhereInput readBytesIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_READ_BYTES_IN);
        return this;
    }

    public BackupTargetExecutionWhereInput readBytesIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_READ_BYTES_IN);
        return this;
    }

    public void setReadBytesIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_READ_BYTES_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_READ_BYTES_IN);
        }
    }

    public boolean getReadBytesIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_READ_BYTES_IN);
    }

    public BackupTargetExecutionWhereInput readBytesLt(Long readBytesLt) {

        this.readBytesLt = readBytesLt;
        return this;
    }

    /**
     * Get readBytesLt
     *
     * @return readBytesLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getReadBytesLt() {
        return readBytesLt;
    }

    public void setReadBytesLt(Long readBytesLt) {
        this.readBytesLt = readBytesLt;
    }

    public BackupTargetExecutionWhereInput readBytesLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_READ_BYTES_LT);
        return this;
    }

    public BackupTargetExecutionWhereInput readBytesLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_READ_BYTES_LT);
        return this;
    }

    public void setReadBytesLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_READ_BYTES_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_READ_BYTES_LT);
        }
    }

    public boolean getReadBytesLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_READ_BYTES_LT);
    }

    public BackupTargetExecutionWhereInput readBytesLte(Long readBytesLte) {

        this.readBytesLte = readBytesLte;
        return this;
    }

    /**
     * Get readBytesLte
     *
     * @return readBytesLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getReadBytesLte() {
        return readBytesLte;
    }

    public void setReadBytesLte(Long readBytesLte) {
        this.readBytesLte = readBytesLte;
    }

    public BackupTargetExecutionWhereInput readBytesLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_READ_BYTES_LTE);
        return this;
    }

    public BackupTargetExecutionWhereInput readBytesLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_READ_BYTES_LTE);
        return this;
    }

    public void setReadBytesLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_READ_BYTES_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_READ_BYTES_LTE);
        }
    }

    public boolean getReadBytesLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_READ_BYTES_LTE);
    }

    public BackupTargetExecutionWhereInput readBytesNot(Long readBytesNot) {

        this.readBytesNot = readBytesNot;
        return this;
    }

    /**
     * Get readBytesNot
     *
     * @return readBytesNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getReadBytesNot() {
        return readBytesNot;
    }

    public void setReadBytesNot(Long readBytesNot) {
        this.readBytesNot = readBytesNot;
    }

    public BackupTargetExecutionWhereInput readBytesNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_READ_BYTES_NOT);
        return this;
    }

    public BackupTargetExecutionWhereInput readBytesNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_READ_BYTES_NOT);
        return this;
    }

    public void setReadBytesNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_READ_BYTES_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_READ_BYTES_NOT);
        }
    }

    public boolean getReadBytesNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_READ_BYTES_NOT);
    }

    public BackupTargetExecutionWhereInput readBytesNotIn(List<Long> readBytesNotIn) {

        this.readBytesNotIn = readBytesNotIn;
        return this;
    }

    public BackupTargetExecutionWhereInput addReadBytesNotInItem(Long readBytesNotInItem) {
        if (this.readBytesNotIn == null) {
            this.readBytesNotIn = new ArrayList<Long>();
        }
        this.readBytesNotIn.add(readBytesNotInItem);
        return this;
    }

    /**
     * Get readBytesNotIn
     *
     * @return readBytesNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getReadBytesNotIn() {
        return readBytesNotIn;
    }

    public void setReadBytesNotIn(List<Long> readBytesNotIn) {
        this.readBytesNotIn = readBytesNotIn;
    }

    public BackupTargetExecutionWhereInput readBytesNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_READ_BYTES_NOT_IN);
        return this;
    }

    public BackupTargetExecutionWhereInput readBytesNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_READ_BYTES_NOT_IN);
        return this;
    }

    public void setReadBytesNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_READ_BYTES_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_READ_BYTES_NOT_IN);
        }
    }

    public boolean getReadBytesNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_READ_BYTES_NOT_IN);
    }

    public BackupTargetExecutionWhereInput retryTimes(Integer retryTimes) {

        this.retryTimes = retryTimes;
        return this;
    }

    /**
     * Get retryTimes
     *
     * @return retryTimes
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getRetryTimes() {
        return retryTimes;
    }

    public void setRetryTimes(Integer retryTimes) {
        this.retryTimes = retryTimes;
    }

    public BackupTargetExecutionWhereInput retryTimes_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RETRY_TIMES);
        return this;
    }

    public BackupTargetExecutionWhereInput retryTimes_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RETRY_TIMES);
        return this;
    }

    public void setRetryTimes_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RETRY_TIMES);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RETRY_TIMES);
        }
    }

    public boolean getRetryTimes_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RETRY_TIMES);
    }

    public BackupTargetExecutionWhereInput retryTimesGt(Integer retryTimesGt) {

        this.retryTimesGt = retryTimesGt;
        return this;
    }

    /**
     * Get retryTimesGt
     *
     * @return retryTimesGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getRetryTimesGt() {
        return retryTimesGt;
    }

    public void setRetryTimesGt(Integer retryTimesGt) {
        this.retryTimesGt = retryTimesGt;
    }

    public BackupTargetExecutionWhereInput retryTimesGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RETRY_TIMES_GT);
        return this;
    }

    public BackupTargetExecutionWhereInput retryTimesGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RETRY_TIMES_GT);
        return this;
    }

    public void setRetryTimesGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RETRY_TIMES_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RETRY_TIMES_GT);
        }
    }

    public boolean getRetryTimesGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RETRY_TIMES_GT);
    }

    public BackupTargetExecutionWhereInput retryTimesGte(Integer retryTimesGte) {

        this.retryTimesGte = retryTimesGte;
        return this;
    }

    /**
     * Get retryTimesGte
     *
     * @return retryTimesGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getRetryTimesGte() {
        return retryTimesGte;
    }

    public void setRetryTimesGte(Integer retryTimesGte) {
        this.retryTimesGte = retryTimesGte;
    }

    public BackupTargetExecutionWhereInput retryTimesGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RETRY_TIMES_GTE);
        return this;
    }

    public BackupTargetExecutionWhereInput retryTimesGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RETRY_TIMES_GTE);
        return this;
    }

    public void setRetryTimesGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RETRY_TIMES_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RETRY_TIMES_GTE);
        }
    }

    public boolean getRetryTimesGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RETRY_TIMES_GTE);
    }

    public BackupTargetExecutionWhereInput retryTimesIn(List<Integer> retryTimesIn) {

        this.retryTimesIn = retryTimesIn;
        return this;
    }

    public BackupTargetExecutionWhereInput addRetryTimesInItem(Integer retryTimesInItem) {
        if (this.retryTimesIn == null) {
            this.retryTimesIn = new ArrayList<Integer>();
        }
        this.retryTimesIn.add(retryTimesInItem);
        return this;
    }

    /**
     * Get retryTimesIn
     *
     * @return retryTimesIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getRetryTimesIn() {
        return retryTimesIn;
    }

    public void setRetryTimesIn(List<Integer> retryTimesIn) {
        this.retryTimesIn = retryTimesIn;
    }

    public BackupTargetExecutionWhereInput retryTimesIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RETRY_TIMES_IN);
        return this;
    }

    public BackupTargetExecutionWhereInput retryTimesIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RETRY_TIMES_IN);
        return this;
    }

    public void setRetryTimesIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RETRY_TIMES_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RETRY_TIMES_IN);
        }
    }

    public boolean getRetryTimesIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RETRY_TIMES_IN);
    }

    public BackupTargetExecutionWhereInput retryTimesLt(Integer retryTimesLt) {

        this.retryTimesLt = retryTimesLt;
        return this;
    }

    /**
     * Get retryTimesLt
     *
     * @return retryTimesLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getRetryTimesLt() {
        return retryTimesLt;
    }

    public void setRetryTimesLt(Integer retryTimesLt) {
        this.retryTimesLt = retryTimesLt;
    }

    public BackupTargetExecutionWhereInput retryTimesLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RETRY_TIMES_LT);
        return this;
    }

    public BackupTargetExecutionWhereInput retryTimesLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RETRY_TIMES_LT);
        return this;
    }

    public void setRetryTimesLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RETRY_TIMES_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RETRY_TIMES_LT);
        }
    }

    public boolean getRetryTimesLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RETRY_TIMES_LT);
    }

    public BackupTargetExecutionWhereInput retryTimesLte(Integer retryTimesLte) {

        this.retryTimesLte = retryTimesLte;
        return this;
    }

    /**
     * Get retryTimesLte
     *
     * @return retryTimesLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getRetryTimesLte() {
        return retryTimesLte;
    }

    public void setRetryTimesLte(Integer retryTimesLte) {
        this.retryTimesLte = retryTimesLte;
    }

    public BackupTargetExecutionWhereInput retryTimesLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RETRY_TIMES_LTE);
        return this;
    }

    public BackupTargetExecutionWhereInput retryTimesLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RETRY_TIMES_LTE);
        return this;
    }

    public void setRetryTimesLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RETRY_TIMES_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RETRY_TIMES_LTE);
        }
    }

    public boolean getRetryTimesLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RETRY_TIMES_LTE);
    }

    public BackupTargetExecutionWhereInput retryTimesNot(Integer retryTimesNot) {

        this.retryTimesNot = retryTimesNot;
        return this;
    }

    /**
     * Get retryTimesNot
     *
     * @return retryTimesNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getRetryTimesNot() {
        return retryTimesNot;
    }

    public void setRetryTimesNot(Integer retryTimesNot) {
        this.retryTimesNot = retryTimesNot;
    }

    public BackupTargetExecutionWhereInput retryTimesNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RETRY_TIMES_NOT);
        return this;
    }

    public BackupTargetExecutionWhereInput retryTimesNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RETRY_TIMES_NOT);
        return this;
    }

    public void setRetryTimesNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RETRY_TIMES_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RETRY_TIMES_NOT);
        }
    }

    public boolean getRetryTimesNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RETRY_TIMES_NOT);
    }

    public BackupTargetExecutionWhereInput retryTimesNotIn(List<Integer> retryTimesNotIn) {

        this.retryTimesNotIn = retryTimesNotIn;
        return this;
    }

    public BackupTargetExecutionWhereInput addRetryTimesNotInItem(Integer retryTimesNotInItem) {
        if (this.retryTimesNotIn == null) {
            this.retryTimesNotIn = new ArrayList<Integer>();
        }
        this.retryTimesNotIn.add(retryTimesNotInItem);
        return this;
    }

    /**
     * Get retryTimesNotIn
     *
     * @return retryTimesNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getRetryTimesNotIn() {
        return retryTimesNotIn;
    }

    public void setRetryTimesNotIn(List<Integer> retryTimesNotIn) {
        this.retryTimesNotIn = retryTimesNotIn;
    }

    public BackupTargetExecutionWhereInput retryTimesNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RETRY_TIMES_NOT_IN);
        return this;
    }

    public BackupTargetExecutionWhereInput retryTimesNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RETRY_TIMES_NOT_IN);
        return this;
    }

    public void setRetryTimesNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RETRY_TIMES_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RETRY_TIMES_NOT_IN);
        }
    }

    public boolean getRetryTimesNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RETRY_TIMES_NOT_IN);
    }

    public BackupTargetExecutionWhereInput status(BackupExecutionStatus status) {

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
    public BackupExecutionStatus getStatus() {
        return status;
    }

    public void setStatus(BackupExecutionStatus status) {
        this.status = status;
    }

    public BackupTargetExecutionWhereInput status_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATUS);
        return this;
    }

    public BackupTargetExecutionWhereInput status_ExplictlyNonNull() {
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

    public BackupTargetExecutionWhereInput statusIn(List<BackupExecutionStatus> statusIn) {

        this.statusIn = statusIn;
        return this;
    }

    public BackupTargetExecutionWhereInput addStatusInItem(BackupExecutionStatus statusInItem) {
        if (this.statusIn == null) {
            this.statusIn = new ArrayList<BackupExecutionStatus>();
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
    public List<BackupExecutionStatus> getStatusIn() {
        return statusIn;
    }

    public void setStatusIn(List<BackupExecutionStatus> statusIn) {
        this.statusIn = statusIn;
    }

    public BackupTargetExecutionWhereInput statusIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATUS_IN);
        return this;
    }

    public BackupTargetExecutionWhereInput statusIn_ExplictlyNonNull() {
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

    public BackupTargetExecutionWhereInput statusNot(BackupExecutionStatus statusNot) {

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
    public BackupExecutionStatus getStatusNot() {
        return statusNot;
    }

    public void setStatusNot(BackupExecutionStatus statusNot) {
        this.statusNot = statusNot;
    }

    public BackupTargetExecutionWhereInput statusNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATUS_NOT);
        return this;
    }

    public BackupTargetExecutionWhereInput statusNot_ExplictlyNonNull() {
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

    public BackupTargetExecutionWhereInput statusNotIn(List<BackupExecutionStatus> statusNotIn) {

        this.statusNotIn = statusNotIn;
        return this;
    }

    public BackupTargetExecutionWhereInput addStatusNotInItem(
            BackupExecutionStatus statusNotInItem) {
        if (this.statusNotIn == null) {
            this.statusNotIn = new ArrayList<BackupExecutionStatus>();
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
    public List<BackupExecutionStatus> getStatusNotIn() {
        return statusNotIn;
    }

    public void setStatusNotIn(List<BackupExecutionStatus> statusNotIn) {
        this.statusNotIn = statusNotIn;
    }

    public BackupTargetExecutionWhereInput statusNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATUS_NOT_IN);
        return this;
    }

    public BackupTargetExecutionWhereInput statusNotIn_ExplictlyNonNull() {
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

    public BackupTargetExecutionWhereInput totalBytes(Long totalBytes) {

        this.totalBytes = totalBytes;
        return this;
    }

    /**
     * Get totalBytes
     *
     * @return totalBytes
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getTotalBytes() {
        return totalBytes;
    }

    public void setTotalBytes(Long totalBytes) {
        this.totalBytes = totalBytes;
    }

    public BackupTargetExecutionWhereInput totalBytes_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_BYTES);
        return this;
    }

    public BackupTargetExecutionWhereInput totalBytes_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_BYTES);
        return this;
    }

    public void setTotalBytes_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_BYTES);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_BYTES);
        }
    }

    public boolean getTotalBytes_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_BYTES);
    }

    public BackupTargetExecutionWhereInput totalBytesGt(Long totalBytesGt) {

        this.totalBytesGt = totalBytesGt;
        return this;
    }

    /**
     * Get totalBytesGt
     *
     * @return totalBytesGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getTotalBytesGt() {
        return totalBytesGt;
    }

    public void setTotalBytesGt(Long totalBytesGt) {
        this.totalBytesGt = totalBytesGt;
    }

    public BackupTargetExecutionWhereInput totalBytesGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_BYTES_GT);
        return this;
    }

    public BackupTargetExecutionWhereInput totalBytesGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_BYTES_GT);
        return this;
    }

    public void setTotalBytesGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_BYTES_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_BYTES_GT);
        }
    }

    public boolean getTotalBytesGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_BYTES_GT);
    }

    public BackupTargetExecutionWhereInput totalBytesGte(Long totalBytesGte) {

        this.totalBytesGte = totalBytesGte;
        return this;
    }

    /**
     * Get totalBytesGte
     *
     * @return totalBytesGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getTotalBytesGte() {
        return totalBytesGte;
    }

    public void setTotalBytesGte(Long totalBytesGte) {
        this.totalBytesGte = totalBytesGte;
    }

    public BackupTargetExecutionWhereInput totalBytesGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_BYTES_GTE);
        return this;
    }

    public BackupTargetExecutionWhereInput totalBytesGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_BYTES_GTE);
        return this;
    }

    public void setTotalBytesGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_BYTES_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_BYTES_GTE);
        }
    }

    public boolean getTotalBytesGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_BYTES_GTE);
    }

    public BackupTargetExecutionWhereInput totalBytesIn(List<Long> totalBytesIn) {

        this.totalBytesIn = totalBytesIn;
        return this;
    }

    public BackupTargetExecutionWhereInput addTotalBytesInItem(Long totalBytesInItem) {
        if (this.totalBytesIn == null) {
            this.totalBytesIn = new ArrayList<Long>();
        }
        this.totalBytesIn.add(totalBytesInItem);
        return this;
    }

    /**
     * Get totalBytesIn
     *
     * @return totalBytesIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getTotalBytesIn() {
        return totalBytesIn;
    }

    public void setTotalBytesIn(List<Long> totalBytesIn) {
        this.totalBytesIn = totalBytesIn;
    }

    public BackupTargetExecutionWhereInput totalBytesIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_BYTES_IN);
        return this;
    }

    public BackupTargetExecutionWhereInput totalBytesIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_BYTES_IN);
        return this;
    }

    public void setTotalBytesIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_BYTES_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_BYTES_IN);
        }
    }

    public boolean getTotalBytesIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_BYTES_IN);
    }

    public BackupTargetExecutionWhereInput totalBytesLt(Long totalBytesLt) {

        this.totalBytesLt = totalBytesLt;
        return this;
    }

    /**
     * Get totalBytesLt
     *
     * @return totalBytesLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getTotalBytesLt() {
        return totalBytesLt;
    }

    public void setTotalBytesLt(Long totalBytesLt) {
        this.totalBytesLt = totalBytesLt;
    }

    public BackupTargetExecutionWhereInput totalBytesLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_BYTES_LT);
        return this;
    }

    public BackupTargetExecutionWhereInput totalBytesLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_BYTES_LT);
        return this;
    }

    public void setTotalBytesLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_BYTES_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_BYTES_LT);
        }
    }

    public boolean getTotalBytesLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_BYTES_LT);
    }

    public BackupTargetExecutionWhereInput totalBytesLte(Long totalBytesLte) {

        this.totalBytesLte = totalBytesLte;
        return this;
    }

    /**
     * Get totalBytesLte
     *
     * @return totalBytesLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getTotalBytesLte() {
        return totalBytesLte;
    }

    public void setTotalBytesLte(Long totalBytesLte) {
        this.totalBytesLte = totalBytesLte;
    }

    public BackupTargetExecutionWhereInput totalBytesLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_BYTES_LTE);
        return this;
    }

    public BackupTargetExecutionWhereInput totalBytesLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_BYTES_LTE);
        return this;
    }

    public void setTotalBytesLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_BYTES_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_BYTES_LTE);
        }
    }

    public boolean getTotalBytesLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_BYTES_LTE);
    }

    public BackupTargetExecutionWhereInput totalBytesNot(Long totalBytesNot) {

        this.totalBytesNot = totalBytesNot;
        return this;
    }

    /**
     * Get totalBytesNot
     *
     * @return totalBytesNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getTotalBytesNot() {
        return totalBytesNot;
    }

    public void setTotalBytesNot(Long totalBytesNot) {
        this.totalBytesNot = totalBytesNot;
    }

    public BackupTargetExecutionWhereInput totalBytesNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_BYTES_NOT);
        return this;
    }

    public BackupTargetExecutionWhereInput totalBytesNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_BYTES_NOT);
        return this;
    }

    public void setTotalBytesNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_BYTES_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_BYTES_NOT);
        }
    }

    public boolean getTotalBytesNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_BYTES_NOT);
    }

    public BackupTargetExecutionWhereInput totalBytesNotIn(List<Long> totalBytesNotIn) {

        this.totalBytesNotIn = totalBytesNotIn;
        return this;
    }

    public BackupTargetExecutionWhereInput addTotalBytesNotInItem(Long totalBytesNotInItem) {
        if (this.totalBytesNotIn == null) {
            this.totalBytesNotIn = new ArrayList<Long>();
        }
        this.totalBytesNotIn.add(totalBytesNotInItem);
        return this;
    }

    /**
     * Get totalBytesNotIn
     *
     * @return totalBytesNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getTotalBytesNotIn() {
        return totalBytesNotIn;
    }

    public void setTotalBytesNotIn(List<Long> totalBytesNotIn) {
        this.totalBytesNotIn = totalBytesNotIn;
    }

    public BackupTargetExecutionWhereInput totalBytesNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_BYTES_NOT_IN);
        return this;
    }

    public BackupTargetExecutionWhereInput totalBytesNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_BYTES_NOT_IN);
        return this;
    }

    public void setTotalBytesNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_BYTES_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_BYTES_NOT_IN);
        }
    }

    public boolean getTotalBytesNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_BYTES_NOT_IN);
    }

    public BackupTargetExecutionWhereInput type(BackupExecutionType type) {

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
    public BackupExecutionType getType() {
        return type;
    }

    public void setType(BackupExecutionType type) {
        this.type = type;
    }

    public BackupTargetExecutionWhereInput type_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE);
        return this;
    }

    public BackupTargetExecutionWhereInput type_ExplictlyNonNull() {
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

    public BackupTargetExecutionWhereInput typeIn(List<BackupExecutionType> typeIn) {

        this.typeIn = typeIn;
        return this;
    }

    public BackupTargetExecutionWhereInput addTypeInItem(BackupExecutionType typeInItem) {
        if (this.typeIn == null) {
            this.typeIn = new ArrayList<BackupExecutionType>();
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
    public List<BackupExecutionType> getTypeIn() {
        return typeIn;
    }

    public void setTypeIn(List<BackupExecutionType> typeIn) {
        this.typeIn = typeIn;
    }

    public BackupTargetExecutionWhereInput typeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE_IN);
        return this;
    }

    public BackupTargetExecutionWhereInput typeIn_ExplictlyNonNull() {
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

    public BackupTargetExecutionWhereInput typeNot(BackupExecutionType typeNot) {

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
    public BackupExecutionType getTypeNot() {
        return typeNot;
    }

    public void setTypeNot(BackupExecutionType typeNot) {
        this.typeNot = typeNot;
    }

    public BackupTargetExecutionWhereInput typeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE_NOT);
        return this;
    }

    public BackupTargetExecutionWhereInput typeNot_ExplictlyNonNull() {
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

    public BackupTargetExecutionWhereInput typeNotIn(List<BackupExecutionType> typeNotIn) {

        this.typeNotIn = typeNotIn;
        return this;
    }

    public BackupTargetExecutionWhereInput addTypeNotInItem(BackupExecutionType typeNotInItem) {
        if (this.typeNotIn == null) {
            this.typeNotIn = new ArrayList<BackupExecutionType>();
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
    public List<BackupExecutionType> getTypeNotIn() {
        return typeNotIn;
    }

    public void setTypeNotIn(List<BackupExecutionType> typeNotIn) {
        this.typeNotIn = typeNotIn;
    }

    public BackupTargetExecutionWhereInput typeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE_NOT_IN);
        return this;
    }

    public BackupTargetExecutionWhereInput typeNotIn_ExplictlyNonNull() {
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

    public BackupTargetExecutionWhereInput vm(VmWhereInput vm) {

        this.vm = vm;
        return this;
    }

    /**
     * Get vm
     *
     * @return vm
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmWhereInput getVm() {
        return vm;
    }

    public void setVm(VmWhereInput vm) {
        this.vm = vm;
    }

    public BackupTargetExecutionWhereInput vm_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM);
        return this;
    }

    public BackupTargetExecutionWhereInput vm_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM);
        return this;
    }

    public void setVm_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM);
        }
    }

    public boolean getVm_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM);
    }

    public BackupTargetExecutionWhereInput vmLocalId(String vmLocalId) {

        this.vmLocalId = vmLocalId;
        return this;
    }

    /**
     * Get vmLocalId
     *
     * @return vmLocalId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVmLocalId() {
        return vmLocalId;
    }

    public void setVmLocalId(String vmLocalId) {
        this.vmLocalId = vmLocalId;
    }

    public BackupTargetExecutionWhereInput vmLocalId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_LOCAL_ID);
        return this;
    }

    public BackupTargetExecutionWhereInput vmLocalId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_LOCAL_ID);
        return this;
    }

    public void setVmLocalId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_LOCAL_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_LOCAL_ID);
        }
    }

    public boolean getVmLocalId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_LOCAL_ID);
    }

    public BackupTargetExecutionWhereInput vmLocalIdContains(String vmLocalIdContains) {

        this.vmLocalIdContains = vmLocalIdContains;
        return this;
    }

    /**
     * Get vmLocalIdContains
     *
     * @return vmLocalIdContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVmLocalIdContains() {
        return vmLocalIdContains;
    }

    public void setVmLocalIdContains(String vmLocalIdContains) {
        this.vmLocalIdContains = vmLocalIdContains;
    }

    public BackupTargetExecutionWhereInput vmLocalIdContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_LOCAL_ID_CONTAINS);
        return this;
    }

    public BackupTargetExecutionWhereInput vmLocalIdContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_LOCAL_ID_CONTAINS);
        return this;
    }

    public void setVmLocalIdContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_LOCAL_ID_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_LOCAL_ID_CONTAINS);
        }
    }

    public boolean getVmLocalIdContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_LOCAL_ID_CONTAINS);
    }

    public BackupTargetExecutionWhereInput vmLocalIdEndsWith(String vmLocalIdEndsWith) {

        this.vmLocalIdEndsWith = vmLocalIdEndsWith;
        return this;
    }

    /**
     * Get vmLocalIdEndsWith
     *
     * @return vmLocalIdEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVmLocalIdEndsWith() {
        return vmLocalIdEndsWith;
    }

    public void setVmLocalIdEndsWith(String vmLocalIdEndsWith) {
        this.vmLocalIdEndsWith = vmLocalIdEndsWith;
    }

    public BackupTargetExecutionWhereInput vmLocalIdEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_LOCAL_ID_ENDS_WITH);
        return this;
    }

    public BackupTargetExecutionWhereInput vmLocalIdEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_LOCAL_ID_ENDS_WITH);
        return this;
    }

    public void setVmLocalIdEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_LOCAL_ID_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_LOCAL_ID_ENDS_WITH);
        }
    }

    public boolean getVmLocalIdEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_LOCAL_ID_ENDS_WITH);
    }

    public BackupTargetExecutionWhereInput vmLocalIdGt(String vmLocalIdGt) {

        this.vmLocalIdGt = vmLocalIdGt;
        return this;
    }

    /**
     * Get vmLocalIdGt
     *
     * @return vmLocalIdGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVmLocalIdGt() {
        return vmLocalIdGt;
    }

    public void setVmLocalIdGt(String vmLocalIdGt) {
        this.vmLocalIdGt = vmLocalIdGt;
    }

    public BackupTargetExecutionWhereInput vmLocalIdGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_LOCAL_ID_GT);
        return this;
    }

    public BackupTargetExecutionWhereInput vmLocalIdGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_LOCAL_ID_GT);
        return this;
    }

    public void setVmLocalIdGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_LOCAL_ID_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_LOCAL_ID_GT);
        }
    }

    public boolean getVmLocalIdGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_LOCAL_ID_GT);
    }

    public BackupTargetExecutionWhereInput vmLocalIdGte(String vmLocalIdGte) {

        this.vmLocalIdGte = vmLocalIdGte;
        return this;
    }

    /**
     * Get vmLocalIdGte
     *
     * @return vmLocalIdGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVmLocalIdGte() {
        return vmLocalIdGte;
    }

    public void setVmLocalIdGte(String vmLocalIdGte) {
        this.vmLocalIdGte = vmLocalIdGte;
    }

    public BackupTargetExecutionWhereInput vmLocalIdGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_LOCAL_ID_GTE);
        return this;
    }

    public BackupTargetExecutionWhereInput vmLocalIdGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_LOCAL_ID_GTE);
        return this;
    }

    public void setVmLocalIdGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_LOCAL_ID_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_LOCAL_ID_GTE);
        }
    }

    public boolean getVmLocalIdGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_LOCAL_ID_GTE);
    }

    public BackupTargetExecutionWhereInput vmLocalIdIn(List<String> vmLocalIdIn) {

        this.vmLocalIdIn = vmLocalIdIn;
        return this;
    }

    public BackupTargetExecutionWhereInput addVmLocalIdInItem(String vmLocalIdInItem) {
        if (this.vmLocalIdIn == null) {
            this.vmLocalIdIn = new ArrayList<String>();
        }
        this.vmLocalIdIn.add(vmLocalIdInItem);
        return this;
    }

    /**
     * Get vmLocalIdIn
     *
     * @return vmLocalIdIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getVmLocalIdIn() {
        return vmLocalIdIn;
    }

    public void setVmLocalIdIn(List<String> vmLocalIdIn) {
        this.vmLocalIdIn = vmLocalIdIn;
    }

    public BackupTargetExecutionWhereInput vmLocalIdIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_LOCAL_ID_IN);
        return this;
    }

    public BackupTargetExecutionWhereInput vmLocalIdIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_LOCAL_ID_IN);
        return this;
    }

    public void setVmLocalIdIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_LOCAL_ID_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_LOCAL_ID_IN);
        }
    }

    public boolean getVmLocalIdIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_LOCAL_ID_IN);
    }

    public BackupTargetExecutionWhereInput vmLocalIdLt(String vmLocalIdLt) {

        this.vmLocalIdLt = vmLocalIdLt;
        return this;
    }

    /**
     * Get vmLocalIdLt
     *
     * @return vmLocalIdLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVmLocalIdLt() {
        return vmLocalIdLt;
    }

    public void setVmLocalIdLt(String vmLocalIdLt) {
        this.vmLocalIdLt = vmLocalIdLt;
    }

    public BackupTargetExecutionWhereInput vmLocalIdLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_LOCAL_ID_LT);
        return this;
    }

    public BackupTargetExecutionWhereInput vmLocalIdLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_LOCAL_ID_LT);
        return this;
    }

    public void setVmLocalIdLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_LOCAL_ID_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_LOCAL_ID_LT);
        }
    }

    public boolean getVmLocalIdLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_LOCAL_ID_LT);
    }

    public BackupTargetExecutionWhereInput vmLocalIdLte(String vmLocalIdLte) {

        this.vmLocalIdLte = vmLocalIdLte;
        return this;
    }

    /**
     * Get vmLocalIdLte
     *
     * @return vmLocalIdLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVmLocalIdLte() {
        return vmLocalIdLte;
    }

    public void setVmLocalIdLte(String vmLocalIdLte) {
        this.vmLocalIdLte = vmLocalIdLte;
    }

    public BackupTargetExecutionWhereInput vmLocalIdLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_LOCAL_ID_LTE);
        return this;
    }

    public BackupTargetExecutionWhereInput vmLocalIdLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_LOCAL_ID_LTE);
        return this;
    }

    public void setVmLocalIdLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_LOCAL_ID_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_LOCAL_ID_LTE);
        }
    }

    public boolean getVmLocalIdLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_LOCAL_ID_LTE);
    }

    public BackupTargetExecutionWhereInput vmLocalIdNot(String vmLocalIdNot) {

        this.vmLocalIdNot = vmLocalIdNot;
        return this;
    }

    /**
     * Get vmLocalIdNot
     *
     * @return vmLocalIdNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVmLocalIdNot() {
        return vmLocalIdNot;
    }

    public void setVmLocalIdNot(String vmLocalIdNot) {
        this.vmLocalIdNot = vmLocalIdNot;
    }

    public BackupTargetExecutionWhereInput vmLocalIdNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_LOCAL_ID_NOT);
        return this;
    }

    public BackupTargetExecutionWhereInput vmLocalIdNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_LOCAL_ID_NOT);
        return this;
    }

    public void setVmLocalIdNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_LOCAL_ID_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_LOCAL_ID_NOT);
        }
    }

    public boolean getVmLocalIdNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_LOCAL_ID_NOT);
    }

    public BackupTargetExecutionWhereInput vmLocalIdNotContains(String vmLocalIdNotContains) {

        this.vmLocalIdNotContains = vmLocalIdNotContains;
        return this;
    }

    /**
     * Get vmLocalIdNotContains
     *
     * @return vmLocalIdNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVmLocalIdNotContains() {
        return vmLocalIdNotContains;
    }

    public void setVmLocalIdNotContains(String vmLocalIdNotContains) {
        this.vmLocalIdNotContains = vmLocalIdNotContains;
    }

    public BackupTargetExecutionWhereInput vmLocalIdNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_LOCAL_ID_NOT_CONTAINS);
        return this;
    }

    public BackupTargetExecutionWhereInput vmLocalIdNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_LOCAL_ID_NOT_CONTAINS);
        return this;
    }

    public void setVmLocalIdNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_LOCAL_ID_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_LOCAL_ID_NOT_CONTAINS);
        }
    }

    public boolean getVmLocalIdNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_LOCAL_ID_NOT_CONTAINS);
    }

    public BackupTargetExecutionWhereInput vmLocalIdNotEndsWith(String vmLocalIdNotEndsWith) {

        this.vmLocalIdNotEndsWith = vmLocalIdNotEndsWith;
        return this;
    }

    /**
     * Get vmLocalIdNotEndsWith
     *
     * @return vmLocalIdNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVmLocalIdNotEndsWith() {
        return vmLocalIdNotEndsWith;
    }

    public void setVmLocalIdNotEndsWith(String vmLocalIdNotEndsWith) {
        this.vmLocalIdNotEndsWith = vmLocalIdNotEndsWith;
    }

    public BackupTargetExecutionWhereInput vmLocalIdNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_LOCAL_ID_NOT_ENDS_WITH);
        return this;
    }

    public BackupTargetExecutionWhereInput vmLocalIdNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_LOCAL_ID_NOT_ENDS_WITH);
        return this;
    }

    public void setVmLocalIdNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_LOCAL_ID_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_LOCAL_ID_NOT_ENDS_WITH);
        }
    }

    public boolean getVmLocalIdNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_LOCAL_ID_NOT_ENDS_WITH);
    }

    public BackupTargetExecutionWhereInput vmLocalIdNotIn(List<String> vmLocalIdNotIn) {

        this.vmLocalIdNotIn = vmLocalIdNotIn;
        return this;
    }

    public BackupTargetExecutionWhereInput addVmLocalIdNotInItem(String vmLocalIdNotInItem) {
        if (this.vmLocalIdNotIn == null) {
            this.vmLocalIdNotIn = new ArrayList<String>();
        }
        this.vmLocalIdNotIn.add(vmLocalIdNotInItem);
        return this;
    }

    /**
     * Get vmLocalIdNotIn
     *
     * @return vmLocalIdNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getVmLocalIdNotIn() {
        return vmLocalIdNotIn;
    }

    public void setVmLocalIdNotIn(List<String> vmLocalIdNotIn) {
        this.vmLocalIdNotIn = vmLocalIdNotIn;
    }

    public BackupTargetExecutionWhereInput vmLocalIdNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_LOCAL_ID_NOT_IN);
        return this;
    }

    public BackupTargetExecutionWhereInput vmLocalIdNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_LOCAL_ID_NOT_IN);
        return this;
    }

    public void setVmLocalIdNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_LOCAL_ID_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_LOCAL_ID_NOT_IN);
        }
    }

    public boolean getVmLocalIdNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_LOCAL_ID_NOT_IN);
    }

    public BackupTargetExecutionWhereInput vmLocalIdNotStartsWith(String vmLocalIdNotStartsWith) {

        this.vmLocalIdNotStartsWith = vmLocalIdNotStartsWith;
        return this;
    }

    /**
     * Get vmLocalIdNotStartsWith
     *
     * @return vmLocalIdNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVmLocalIdNotStartsWith() {
        return vmLocalIdNotStartsWith;
    }

    public void setVmLocalIdNotStartsWith(String vmLocalIdNotStartsWith) {
        this.vmLocalIdNotStartsWith = vmLocalIdNotStartsWith;
    }

    public BackupTargetExecutionWhereInput vmLocalIdNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_LOCAL_ID_NOT_STARTS_WITH);
        return this;
    }

    public BackupTargetExecutionWhereInput vmLocalIdNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_LOCAL_ID_NOT_STARTS_WITH);
        return this;
    }

    public void setVmLocalIdNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_LOCAL_ID_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_LOCAL_ID_NOT_STARTS_WITH);
        }
    }

    public boolean getVmLocalIdNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_LOCAL_ID_NOT_STARTS_WITH);
    }

    public BackupTargetExecutionWhereInput vmLocalIdStartsWith(String vmLocalIdStartsWith) {

        this.vmLocalIdStartsWith = vmLocalIdStartsWith;
        return this;
    }

    /**
     * Get vmLocalIdStartsWith
     *
     * @return vmLocalIdStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVmLocalIdStartsWith() {
        return vmLocalIdStartsWith;
    }

    public void setVmLocalIdStartsWith(String vmLocalIdStartsWith) {
        this.vmLocalIdStartsWith = vmLocalIdStartsWith;
    }

    public BackupTargetExecutionWhereInput vmLocalIdStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_LOCAL_ID_STARTS_WITH);
        return this;
    }

    public BackupTargetExecutionWhereInput vmLocalIdStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_LOCAL_ID_STARTS_WITH);
        return this;
    }

    public void setVmLocalIdStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_LOCAL_ID_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_LOCAL_ID_STARTS_WITH);
        }
    }

    public boolean getVmLocalIdStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_LOCAL_ID_STARTS_WITH);
    }

    public BackupTargetExecutionWhereInput vmName(String vmName) {

        this.vmName = vmName;
        return this;
    }

    /**
     * Get vmName
     *
     * @return vmName
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVmName() {
        return vmName;
    }

    public void setVmName(String vmName) {
        this.vmName = vmName;
    }

    public BackupTargetExecutionWhereInput vmName_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_NAME);
        return this;
    }

    public BackupTargetExecutionWhereInput vmName_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_NAME);
        return this;
    }

    public void setVmName_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_NAME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_NAME);
        }
    }

    public boolean getVmName_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_NAME);
    }

    public BackupTargetExecutionWhereInput vmNameContains(String vmNameContains) {

        this.vmNameContains = vmNameContains;
        return this;
    }

    /**
     * Get vmNameContains
     *
     * @return vmNameContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVmNameContains() {
        return vmNameContains;
    }

    public void setVmNameContains(String vmNameContains) {
        this.vmNameContains = vmNameContains;
    }

    public BackupTargetExecutionWhereInput vmNameContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_NAME_CONTAINS);
        return this;
    }

    public BackupTargetExecutionWhereInput vmNameContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_NAME_CONTAINS);
        return this;
    }

    public void setVmNameContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_NAME_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_NAME_CONTAINS);
        }
    }

    public boolean getVmNameContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_NAME_CONTAINS);
    }

    public BackupTargetExecutionWhereInput vmNameEndsWith(String vmNameEndsWith) {

        this.vmNameEndsWith = vmNameEndsWith;
        return this;
    }

    /**
     * Get vmNameEndsWith
     *
     * @return vmNameEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVmNameEndsWith() {
        return vmNameEndsWith;
    }

    public void setVmNameEndsWith(String vmNameEndsWith) {
        this.vmNameEndsWith = vmNameEndsWith;
    }

    public BackupTargetExecutionWhereInput vmNameEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_NAME_ENDS_WITH);
        return this;
    }

    public BackupTargetExecutionWhereInput vmNameEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_NAME_ENDS_WITH);
        return this;
    }

    public void setVmNameEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_NAME_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_NAME_ENDS_WITH);
        }
    }

    public boolean getVmNameEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_NAME_ENDS_WITH);
    }

    public BackupTargetExecutionWhereInput vmNameGt(String vmNameGt) {

        this.vmNameGt = vmNameGt;
        return this;
    }

    /**
     * Get vmNameGt
     *
     * @return vmNameGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVmNameGt() {
        return vmNameGt;
    }

    public void setVmNameGt(String vmNameGt) {
        this.vmNameGt = vmNameGt;
    }

    public BackupTargetExecutionWhereInput vmNameGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_NAME_GT);
        return this;
    }

    public BackupTargetExecutionWhereInput vmNameGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_NAME_GT);
        return this;
    }

    public void setVmNameGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_NAME_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_NAME_GT);
        }
    }

    public boolean getVmNameGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_NAME_GT);
    }

    public BackupTargetExecutionWhereInput vmNameGte(String vmNameGte) {

        this.vmNameGte = vmNameGte;
        return this;
    }

    /**
     * Get vmNameGte
     *
     * @return vmNameGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVmNameGte() {
        return vmNameGte;
    }

    public void setVmNameGte(String vmNameGte) {
        this.vmNameGte = vmNameGte;
    }

    public BackupTargetExecutionWhereInput vmNameGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_NAME_GTE);
        return this;
    }

    public BackupTargetExecutionWhereInput vmNameGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_NAME_GTE);
        return this;
    }

    public void setVmNameGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_NAME_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_NAME_GTE);
        }
    }

    public boolean getVmNameGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_NAME_GTE);
    }

    public BackupTargetExecutionWhereInput vmNameIn(List<String> vmNameIn) {

        this.vmNameIn = vmNameIn;
        return this;
    }

    public BackupTargetExecutionWhereInput addVmNameInItem(String vmNameInItem) {
        if (this.vmNameIn == null) {
            this.vmNameIn = new ArrayList<String>();
        }
        this.vmNameIn.add(vmNameInItem);
        return this;
    }

    /**
     * Get vmNameIn
     *
     * @return vmNameIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getVmNameIn() {
        return vmNameIn;
    }

    public void setVmNameIn(List<String> vmNameIn) {
        this.vmNameIn = vmNameIn;
    }

    public BackupTargetExecutionWhereInput vmNameIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_NAME_IN);
        return this;
    }

    public BackupTargetExecutionWhereInput vmNameIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_NAME_IN);
        return this;
    }

    public void setVmNameIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_NAME_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_NAME_IN);
        }
    }

    public boolean getVmNameIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_NAME_IN);
    }

    public BackupTargetExecutionWhereInput vmNameLt(String vmNameLt) {

        this.vmNameLt = vmNameLt;
        return this;
    }

    /**
     * Get vmNameLt
     *
     * @return vmNameLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVmNameLt() {
        return vmNameLt;
    }

    public void setVmNameLt(String vmNameLt) {
        this.vmNameLt = vmNameLt;
    }

    public BackupTargetExecutionWhereInput vmNameLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_NAME_LT);
        return this;
    }

    public BackupTargetExecutionWhereInput vmNameLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_NAME_LT);
        return this;
    }

    public void setVmNameLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_NAME_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_NAME_LT);
        }
    }

    public boolean getVmNameLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_NAME_LT);
    }

    public BackupTargetExecutionWhereInput vmNameLte(String vmNameLte) {

        this.vmNameLte = vmNameLte;
        return this;
    }

    /**
     * Get vmNameLte
     *
     * @return vmNameLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVmNameLte() {
        return vmNameLte;
    }

    public void setVmNameLte(String vmNameLte) {
        this.vmNameLte = vmNameLte;
    }

    public BackupTargetExecutionWhereInput vmNameLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_NAME_LTE);
        return this;
    }

    public BackupTargetExecutionWhereInput vmNameLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_NAME_LTE);
        return this;
    }

    public void setVmNameLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_NAME_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_NAME_LTE);
        }
    }

    public boolean getVmNameLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_NAME_LTE);
    }

    public BackupTargetExecutionWhereInput vmNameNot(String vmNameNot) {

        this.vmNameNot = vmNameNot;
        return this;
    }

    /**
     * Get vmNameNot
     *
     * @return vmNameNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVmNameNot() {
        return vmNameNot;
    }

    public void setVmNameNot(String vmNameNot) {
        this.vmNameNot = vmNameNot;
    }

    public BackupTargetExecutionWhereInput vmNameNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_NAME_NOT);
        return this;
    }

    public BackupTargetExecutionWhereInput vmNameNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_NAME_NOT);
        return this;
    }

    public void setVmNameNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_NAME_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_NAME_NOT);
        }
    }

    public boolean getVmNameNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_NAME_NOT);
    }

    public BackupTargetExecutionWhereInput vmNameNotContains(String vmNameNotContains) {

        this.vmNameNotContains = vmNameNotContains;
        return this;
    }

    /**
     * Get vmNameNotContains
     *
     * @return vmNameNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVmNameNotContains() {
        return vmNameNotContains;
    }

    public void setVmNameNotContains(String vmNameNotContains) {
        this.vmNameNotContains = vmNameNotContains;
    }

    public BackupTargetExecutionWhereInput vmNameNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_NAME_NOT_CONTAINS);
        return this;
    }

    public BackupTargetExecutionWhereInput vmNameNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_NAME_NOT_CONTAINS);
        return this;
    }

    public void setVmNameNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_NAME_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_NAME_NOT_CONTAINS);
        }
    }

    public boolean getVmNameNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_NAME_NOT_CONTAINS);
    }

    public BackupTargetExecutionWhereInput vmNameNotEndsWith(String vmNameNotEndsWith) {

        this.vmNameNotEndsWith = vmNameNotEndsWith;
        return this;
    }

    /**
     * Get vmNameNotEndsWith
     *
     * @return vmNameNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVmNameNotEndsWith() {
        return vmNameNotEndsWith;
    }

    public void setVmNameNotEndsWith(String vmNameNotEndsWith) {
        this.vmNameNotEndsWith = vmNameNotEndsWith;
    }

    public BackupTargetExecutionWhereInput vmNameNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_NAME_NOT_ENDS_WITH);
        return this;
    }

    public BackupTargetExecutionWhereInput vmNameNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_NAME_NOT_ENDS_WITH);
        return this;
    }

    public void setVmNameNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_NAME_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_NAME_NOT_ENDS_WITH);
        }
    }

    public boolean getVmNameNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_NAME_NOT_ENDS_WITH);
    }

    public BackupTargetExecutionWhereInput vmNameNotIn(List<String> vmNameNotIn) {

        this.vmNameNotIn = vmNameNotIn;
        return this;
    }

    public BackupTargetExecutionWhereInput addVmNameNotInItem(String vmNameNotInItem) {
        if (this.vmNameNotIn == null) {
            this.vmNameNotIn = new ArrayList<String>();
        }
        this.vmNameNotIn.add(vmNameNotInItem);
        return this;
    }

    /**
     * Get vmNameNotIn
     *
     * @return vmNameNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getVmNameNotIn() {
        return vmNameNotIn;
    }

    public void setVmNameNotIn(List<String> vmNameNotIn) {
        this.vmNameNotIn = vmNameNotIn;
    }

    public BackupTargetExecutionWhereInput vmNameNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_NAME_NOT_IN);
        return this;
    }

    public BackupTargetExecutionWhereInput vmNameNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_NAME_NOT_IN);
        return this;
    }

    public void setVmNameNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_NAME_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_NAME_NOT_IN);
        }
    }

    public boolean getVmNameNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_NAME_NOT_IN);
    }

    public BackupTargetExecutionWhereInput vmNameNotStartsWith(String vmNameNotStartsWith) {

        this.vmNameNotStartsWith = vmNameNotStartsWith;
        return this;
    }

    /**
     * Get vmNameNotStartsWith
     *
     * @return vmNameNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVmNameNotStartsWith() {
        return vmNameNotStartsWith;
    }

    public void setVmNameNotStartsWith(String vmNameNotStartsWith) {
        this.vmNameNotStartsWith = vmNameNotStartsWith;
    }

    public BackupTargetExecutionWhereInput vmNameNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_NAME_NOT_STARTS_WITH);
        return this;
    }

    public BackupTargetExecutionWhereInput vmNameNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_NAME_NOT_STARTS_WITH);
        return this;
    }

    public void setVmNameNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_NAME_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_NAME_NOT_STARTS_WITH);
        }
    }

    public boolean getVmNameNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_NAME_NOT_STARTS_WITH);
    }

    public BackupTargetExecutionWhereInput vmNameStartsWith(String vmNameStartsWith) {

        this.vmNameStartsWith = vmNameStartsWith;
        return this;
    }

    /**
     * Get vmNameStartsWith
     *
     * @return vmNameStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVmNameStartsWith() {
        return vmNameStartsWith;
    }

    public void setVmNameStartsWith(String vmNameStartsWith) {
        this.vmNameStartsWith = vmNameStartsWith;
    }

    public BackupTargetExecutionWhereInput vmNameStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_NAME_STARTS_WITH);
        return this;
    }

    public BackupTargetExecutionWhereInput vmNameStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_NAME_STARTS_WITH);
        return this;
    }

    public void setVmNameStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_NAME_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_NAME_STARTS_WITH);
        }
    }

    public boolean getVmNameStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_NAME_STARTS_WITH);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BackupTargetExecutionWhereInput backupTargetExecutionWhereInput =
                (BackupTargetExecutionWhereInput) o;
        return Objects.equals(this.AND, backupTargetExecutionWhereInput.AND)
                && Objects.equals(this.NOT, backupTargetExecutionWhereInput.NOT)
                && Objects.equals(this.OR, backupTargetExecutionWhereInput.OR)
                && Objects.equals(this.backupGroup, backupTargetExecutionWhereInput.backupGroup)
                && Objects.equals(
                        this.backupGroupContains,
                        backupTargetExecutionWhereInput.backupGroupContains)
                && Objects.equals(
                        this.backupGroupEndsWith,
                        backupTargetExecutionWhereInput.backupGroupEndsWith)
                && Objects.equals(this.backupGroupGt, backupTargetExecutionWhereInput.backupGroupGt)
                && Objects.equals(
                        this.backupGroupGte, backupTargetExecutionWhereInput.backupGroupGte)
                && Objects.equals(this.backupGroupIn, backupTargetExecutionWhereInput.backupGroupIn)
                && Objects.equals(this.backupGroupLt, backupTargetExecutionWhereInput.backupGroupLt)
                && Objects.equals(
                        this.backupGroupLte, backupTargetExecutionWhereInput.backupGroupLte)
                && Objects.equals(
                        this.backupGroupNot, backupTargetExecutionWhereInput.backupGroupNot)
                && Objects.equals(
                        this.backupGroupNotContains,
                        backupTargetExecutionWhereInput.backupGroupNotContains)
                && Objects.equals(
                        this.backupGroupNotEndsWith,
                        backupTargetExecutionWhereInput.backupGroupNotEndsWith)
                && Objects.equals(
                        this.backupGroupNotIn, backupTargetExecutionWhereInput.backupGroupNotIn)
                && Objects.equals(
                        this.backupGroupNotStartsWith,
                        backupTargetExecutionWhereInput.backupGroupNotStartsWith)
                && Objects.equals(
                        this.backupGroupStartsWith,
                        backupTargetExecutionWhereInput.backupGroupStartsWith)
                && Objects.equals(
                        this.backupPlanExecution,
                        backupTargetExecutionWhereInput.backupPlanExecution)
                && Objects.equals(
                        this.backupRestorePoint, backupTargetExecutionWhereInput.backupRestorePoint)
                && Objects.equals(
                        this.clusterLocalId, backupTargetExecutionWhereInput.clusterLocalId)
                && Objects.equals(
                        this.clusterLocalIdContains,
                        backupTargetExecutionWhereInput.clusterLocalIdContains)
                && Objects.equals(
                        this.clusterLocalIdEndsWith,
                        backupTargetExecutionWhereInput.clusterLocalIdEndsWith)
                && Objects.equals(
                        this.clusterLocalIdGt, backupTargetExecutionWhereInput.clusterLocalIdGt)
                && Objects.equals(
                        this.clusterLocalIdGte, backupTargetExecutionWhereInput.clusterLocalIdGte)
                && Objects.equals(
                        this.clusterLocalIdIn, backupTargetExecutionWhereInput.clusterLocalIdIn)
                && Objects.equals(
                        this.clusterLocalIdLt, backupTargetExecutionWhereInput.clusterLocalIdLt)
                && Objects.equals(
                        this.clusterLocalIdLte, backupTargetExecutionWhereInput.clusterLocalIdLte)
                && Objects.equals(
                        this.clusterLocalIdNot, backupTargetExecutionWhereInput.clusterLocalIdNot)
                && Objects.equals(
                        this.clusterLocalIdNotContains,
                        backupTargetExecutionWhereInput.clusterLocalIdNotContains)
                && Objects.equals(
                        this.clusterLocalIdNotEndsWith,
                        backupTargetExecutionWhereInput.clusterLocalIdNotEndsWith)
                && Objects.equals(
                        this.clusterLocalIdNotIn,
                        backupTargetExecutionWhereInput.clusterLocalIdNotIn)
                && Objects.equals(
                        this.clusterLocalIdNotStartsWith,
                        backupTargetExecutionWhereInput.clusterLocalIdNotStartsWith)
                && Objects.equals(
                        this.clusterLocalIdStartsWith,
                        backupTargetExecutionWhereInput.clusterLocalIdStartsWith)
                && Objects.equals(this.duration, backupTargetExecutionWhereInput.duration)
                && Objects.equals(this.durationGt, backupTargetExecutionWhereInput.durationGt)
                && Objects.equals(this.durationGte, backupTargetExecutionWhereInput.durationGte)
                && Objects.equals(this.durationIn, backupTargetExecutionWhereInput.durationIn)
                && Objects.equals(this.durationLt, backupTargetExecutionWhereInput.durationLt)
                && Objects.equals(this.durationLte, backupTargetExecutionWhereInput.durationLte)
                && Objects.equals(this.durationNot, backupTargetExecutionWhereInput.durationNot)
                && Objects.equals(this.durationNotIn, backupTargetExecutionWhereInput.durationNotIn)
                && Objects.equals(
                        this.entityAsyncStatus, backupTargetExecutionWhereInput.entityAsyncStatus)
                && Objects.equals(
                        this.entityAsyncStatusIn,
                        backupTargetExecutionWhereInput.entityAsyncStatusIn)
                && Objects.equals(
                        this.entityAsyncStatusNot,
                        backupTargetExecutionWhereInput.entityAsyncStatusNot)
                && Objects.equals(
                        this.entityAsyncStatusNotIn,
                        backupTargetExecutionWhereInput.entityAsyncStatusNotIn)
                && Objects.equals(this.executedAt, backupTargetExecutionWhereInput.executedAt)
                && Objects.equals(this.executedAtGt, backupTargetExecutionWhereInput.executedAtGt)
                && Objects.equals(this.executedAtGte, backupTargetExecutionWhereInput.executedAtGte)
                && Objects.equals(this.executedAtIn, backupTargetExecutionWhereInput.executedAtIn)
                && Objects.equals(this.executedAtLt, backupTargetExecutionWhereInput.executedAtLt)
                && Objects.equals(this.executedAtLte, backupTargetExecutionWhereInput.executedAtLte)
                && Objects.equals(this.executedAtNot, backupTargetExecutionWhereInput.executedAtNot)
                && Objects.equals(
                        this.executedAtNotIn, backupTargetExecutionWhereInput.executedAtNotIn)
                && Objects.equals(this.id, backupTargetExecutionWhereInput.id)
                && Objects.equals(this.idContains, backupTargetExecutionWhereInput.idContains)
                && Objects.equals(this.idEndsWith, backupTargetExecutionWhereInput.idEndsWith)
                && Objects.equals(this.idGt, backupTargetExecutionWhereInput.idGt)
                && Objects.equals(this.idGte, backupTargetExecutionWhereInput.idGte)
                && Objects.equals(this.idIn, backupTargetExecutionWhereInput.idIn)
                && Objects.equals(this.idLt, backupTargetExecutionWhereInput.idLt)
                && Objects.equals(this.idLte, backupTargetExecutionWhereInput.idLte)
                && Objects.equals(this.idNot, backupTargetExecutionWhereInput.idNot)
                && Objects.equals(this.idNotContains, backupTargetExecutionWhereInput.idNotContains)
                && Objects.equals(this.idNotEndsWith, backupTargetExecutionWhereInput.idNotEndsWith)
                && Objects.equals(this.idNotIn, backupTargetExecutionWhereInput.idNotIn)
                && Objects.equals(
                        this.idNotStartsWith, backupTargetExecutionWhereInput.idNotStartsWith)
                && Objects.equals(this.idStartsWith, backupTargetExecutionWhereInput.idStartsWith)
                && Objects.equals(this.localId, backupTargetExecutionWhereInput.localId)
                && Objects.equals(
                        this.localIdContains, backupTargetExecutionWhereInput.localIdContains)
                && Objects.equals(
                        this.localIdEndsWith, backupTargetExecutionWhereInput.localIdEndsWith)
                && Objects.equals(this.localIdGt, backupTargetExecutionWhereInput.localIdGt)
                && Objects.equals(this.localIdGte, backupTargetExecutionWhereInput.localIdGte)
                && Objects.equals(this.localIdIn, backupTargetExecutionWhereInput.localIdIn)
                && Objects.equals(this.localIdLt, backupTargetExecutionWhereInput.localIdLt)
                && Objects.equals(this.localIdLte, backupTargetExecutionWhereInput.localIdLte)
                && Objects.equals(this.localIdNot, backupTargetExecutionWhereInput.localIdNot)
                && Objects.equals(
                        this.localIdNotContains, backupTargetExecutionWhereInput.localIdNotContains)
                && Objects.equals(
                        this.localIdNotEndsWith, backupTargetExecutionWhereInput.localIdNotEndsWith)
                && Objects.equals(this.localIdNotIn, backupTargetExecutionWhereInput.localIdNotIn)
                && Objects.equals(
                        this.localIdNotStartsWith,
                        backupTargetExecutionWhereInput.localIdNotStartsWith)
                && Objects.equals(
                        this.localIdStartsWith, backupTargetExecutionWhereInput.localIdStartsWith)
                && Objects.equals(this.parentBackup, backupTargetExecutionWhereInput.parentBackup)
                && Objects.equals(
                        this.parentBackupContains,
                        backupTargetExecutionWhereInput.parentBackupContains)
                && Objects.equals(
                        this.parentBackupEndsWith,
                        backupTargetExecutionWhereInput.parentBackupEndsWith)
                && Objects.equals(
                        this.parentBackupGt, backupTargetExecutionWhereInput.parentBackupGt)
                && Objects.equals(
                        this.parentBackupGte, backupTargetExecutionWhereInput.parentBackupGte)
                && Objects.equals(
                        this.parentBackupIn, backupTargetExecutionWhereInput.parentBackupIn)
                && Objects.equals(
                        this.parentBackupLt, backupTargetExecutionWhereInput.parentBackupLt)
                && Objects.equals(
                        this.parentBackupLte, backupTargetExecutionWhereInput.parentBackupLte)
                && Objects.equals(
                        this.parentBackupNot, backupTargetExecutionWhereInput.parentBackupNot)
                && Objects.equals(
                        this.parentBackupNotContains,
                        backupTargetExecutionWhereInput.parentBackupNotContains)
                && Objects.equals(
                        this.parentBackupNotEndsWith,
                        backupTargetExecutionWhereInput.parentBackupNotEndsWith)
                && Objects.equals(
                        this.parentBackupNotIn, backupTargetExecutionWhereInput.parentBackupNotIn)
                && Objects.equals(
                        this.parentBackupNotStartsWith,
                        backupTargetExecutionWhereInput.parentBackupNotStartsWith)
                && Objects.equals(
                        this.parentBackupStartsWith,
                        backupTargetExecutionWhereInput.parentBackupStartsWith)
                && Objects.equals(this.readBytes, backupTargetExecutionWhereInput.readBytes)
                && Objects.equals(this.readBytesGt, backupTargetExecutionWhereInput.readBytesGt)
                && Objects.equals(this.readBytesGte, backupTargetExecutionWhereInput.readBytesGte)
                && Objects.equals(this.readBytesIn, backupTargetExecutionWhereInput.readBytesIn)
                && Objects.equals(this.readBytesLt, backupTargetExecutionWhereInput.readBytesLt)
                && Objects.equals(this.readBytesLte, backupTargetExecutionWhereInput.readBytesLte)
                && Objects.equals(this.readBytesNot, backupTargetExecutionWhereInput.readBytesNot)
                && Objects.equals(
                        this.readBytesNotIn, backupTargetExecutionWhereInput.readBytesNotIn)
                && Objects.equals(this.retryTimes, backupTargetExecutionWhereInput.retryTimes)
                && Objects.equals(this.retryTimesGt, backupTargetExecutionWhereInput.retryTimesGt)
                && Objects.equals(this.retryTimesGte, backupTargetExecutionWhereInput.retryTimesGte)
                && Objects.equals(this.retryTimesIn, backupTargetExecutionWhereInput.retryTimesIn)
                && Objects.equals(this.retryTimesLt, backupTargetExecutionWhereInput.retryTimesLt)
                && Objects.equals(this.retryTimesLte, backupTargetExecutionWhereInput.retryTimesLte)
                && Objects.equals(this.retryTimesNot, backupTargetExecutionWhereInput.retryTimesNot)
                && Objects.equals(
                        this.retryTimesNotIn, backupTargetExecutionWhereInput.retryTimesNotIn)
                && Objects.equals(this.status, backupTargetExecutionWhereInput.status)
                && Objects.equals(this.statusIn, backupTargetExecutionWhereInput.statusIn)
                && Objects.equals(this.statusNot, backupTargetExecutionWhereInput.statusNot)
                && Objects.equals(this.statusNotIn, backupTargetExecutionWhereInput.statusNotIn)
                && Objects.equals(this.totalBytes, backupTargetExecutionWhereInput.totalBytes)
                && Objects.equals(this.totalBytesGt, backupTargetExecutionWhereInput.totalBytesGt)
                && Objects.equals(this.totalBytesGte, backupTargetExecutionWhereInput.totalBytesGte)
                && Objects.equals(this.totalBytesIn, backupTargetExecutionWhereInput.totalBytesIn)
                && Objects.equals(this.totalBytesLt, backupTargetExecutionWhereInput.totalBytesLt)
                && Objects.equals(this.totalBytesLte, backupTargetExecutionWhereInput.totalBytesLte)
                && Objects.equals(this.totalBytesNot, backupTargetExecutionWhereInput.totalBytesNot)
                && Objects.equals(
                        this.totalBytesNotIn, backupTargetExecutionWhereInput.totalBytesNotIn)
                && Objects.equals(this.type, backupTargetExecutionWhereInput.type)
                && Objects.equals(this.typeIn, backupTargetExecutionWhereInput.typeIn)
                && Objects.equals(this.typeNot, backupTargetExecutionWhereInput.typeNot)
                && Objects.equals(this.typeNotIn, backupTargetExecutionWhereInput.typeNotIn)
                && Objects.equals(this.vm, backupTargetExecutionWhereInput.vm)
                && Objects.equals(this.vmLocalId, backupTargetExecutionWhereInput.vmLocalId)
                && Objects.equals(
                        this.vmLocalIdContains, backupTargetExecutionWhereInput.vmLocalIdContains)
                && Objects.equals(
                        this.vmLocalIdEndsWith, backupTargetExecutionWhereInput.vmLocalIdEndsWith)
                && Objects.equals(this.vmLocalIdGt, backupTargetExecutionWhereInput.vmLocalIdGt)
                && Objects.equals(this.vmLocalIdGte, backupTargetExecutionWhereInput.vmLocalIdGte)
                && Objects.equals(this.vmLocalIdIn, backupTargetExecutionWhereInput.vmLocalIdIn)
                && Objects.equals(this.vmLocalIdLt, backupTargetExecutionWhereInput.vmLocalIdLt)
                && Objects.equals(this.vmLocalIdLte, backupTargetExecutionWhereInput.vmLocalIdLte)
                && Objects.equals(this.vmLocalIdNot, backupTargetExecutionWhereInput.vmLocalIdNot)
                && Objects.equals(
                        this.vmLocalIdNotContains,
                        backupTargetExecutionWhereInput.vmLocalIdNotContains)
                && Objects.equals(
                        this.vmLocalIdNotEndsWith,
                        backupTargetExecutionWhereInput.vmLocalIdNotEndsWith)
                && Objects.equals(
                        this.vmLocalIdNotIn, backupTargetExecutionWhereInput.vmLocalIdNotIn)
                && Objects.equals(
                        this.vmLocalIdNotStartsWith,
                        backupTargetExecutionWhereInput.vmLocalIdNotStartsWith)
                && Objects.equals(
                        this.vmLocalIdStartsWith,
                        backupTargetExecutionWhereInput.vmLocalIdStartsWith)
                && Objects.equals(this.vmName, backupTargetExecutionWhereInput.vmName)
                && Objects.equals(
                        this.vmNameContains, backupTargetExecutionWhereInput.vmNameContains)
                && Objects.equals(
                        this.vmNameEndsWith, backupTargetExecutionWhereInput.vmNameEndsWith)
                && Objects.equals(this.vmNameGt, backupTargetExecutionWhereInput.vmNameGt)
                && Objects.equals(this.vmNameGte, backupTargetExecutionWhereInput.vmNameGte)
                && Objects.equals(this.vmNameIn, backupTargetExecutionWhereInput.vmNameIn)
                && Objects.equals(this.vmNameLt, backupTargetExecutionWhereInput.vmNameLt)
                && Objects.equals(this.vmNameLte, backupTargetExecutionWhereInput.vmNameLte)
                && Objects.equals(this.vmNameNot, backupTargetExecutionWhereInput.vmNameNot)
                && Objects.equals(
                        this.vmNameNotContains, backupTargetExecutionWhereInput.vmNameNotContains)
                && Objects.equals(
                        this.vmNameNotEndsWith, backupTargetExecutionWhereInput.vmNameNotEndsWith)
                && Objects.equals(this.vmNameNotIn, backupTargetExecutionWhereInput.vmNameNotIn)
                && Objects.equals(
                        this.vmNameNotStartsWith,
                        backupTargetExecutionWhereInput.vmNameNotStartsWith)
                && Objects.equals(
                        this.vmNameStartsWith, backupTargetExecutionWhereInput.vmNameStartsWith);
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
                backupGroup,
                backupGroupContains,
                backupGroupEndsWith,
                backupGroupGt,
                backupGroupGte,
                backupGroupIn,
                backupGroupLt,
                backupGroupLte,
                backupGroupNot,
                backupGroupNotContains,
                backupGroupNotEndsWith,
                backupGroupNotIn,
                backupGroupNotStartsWith,
                backupGroupStartsWith,
                backupPlanExecution,
                backupRestorePoint,
                clusterLocalId,
                clusterLocalIdContains,
                clusterLocalIdEndsWith,
                clusterLocalIdGt,
                clusterLocalIdGte,
                clusterLocalIdIn,
                clusterLocalIdLt,
                clusterLocalIdLte,
                clusterLocalIdNot,
                clusterLocalIdNotContains,
                clusterLocalIdNotEndsWith,
                clusterLocalIdNotIn,
                clusterLocalIdNotStartsWith,
                clusterLocalIdStartsWith,
                duration,
                durationGt,
                durationGte,
                durationIn,
                durationLt,
                durationLte,
                durationNot,
                durationNotIn,
                entityAsyncStatus,
                entityAsyncStatusIn,
                entityAsyncStatusNot,
                entityAsyncStatusNotIn,
                executedAt,
                executedAtGt,
                executedAtGte,
                executedAtIn,
                executedAtLt,
                executedAtLte,
                executedAtNot,
                executedAtNotIn,
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
                parentBackup,
                parentBackupContains,
                parentBackupEndsWith,
                parentBackupGt,
                parentBackupGte,
                parentBackupIn,
                parentBackupLt,
                parentBackupLte,
                parentBackupNot,
                parentBackupNotContains,
                parentBackupNotEndsWith,
                parentBackupNotIn,
                parentBackupNotStartsWith,
                parentBackupStartsWith,
                readBytes,
                readBytesGt,
                readBytesGte,
                readBytesIn,
                readBytesLt,
                readBytesLte,
                readBytesNot,
                readBytesNotIn,
                retryTimes,
                retryTimesGt,
                retryTimesGte,
                retryTimesIn,
                retryTimesLt,
                retryTimesLte,
                retryTimesNot,
                retryTimesNotIn,
                status,
                statusIn,
                statusNot,
                statusNotIn,
                totalBytes,
                totalBytesGt,
                totalBytesGte,
                totalBytesIn,
                totalBytesLt,
                totalBytesLte,
                totalBytesNot,
                totalBytesNotIn,
                type,
                typeIn,
                typeNot,
                typeNotIn,
                vm,
                vmLocalId,
                vmLocalIdContains,
                vmLocalIdEndsWith,
                vmLocalIdGt,
                vmLocalIdGte,
                vmLocalIdIn,
                vmLocalIdLt,
                vmLocalIdLte,
                vmLocalIdNot,
                vmLocalIdNotContains,
                vmLocalIdNotEndsWith,
                vmLocalIdNotIn,
                vmLocalIdNotStartsWith,
                vmLocalIdStartsWith,
                vmName,
                vmNameContains,
                vmNameEndsWith,
                vmNameGt,
                vmNameGte,
                vmNameIn,
                vmNameLt,
                vmNameLte,
                vmNameNot,
                vmNameNotContains,
                vmNameNotEndsWith,
                vmNameNotIn,
                vmNameNotStartsWith,
                vmNameStartsWith);
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
        sb.append("class BackupTargetExecutionWhereInput {\n");
        sb.append("    AND: ").append(toIndentedString(AND)).append("\n");
        sb.append("    NOT: ").append(toIndentedString(NOT)).append("\n");
        sb.append("    OR: ").append(toIndentedString(OR)).append("\n");
        sb.append("    backupGroup: ").append(toIndentedString(backupGroup)).append("\n");
        sb.append("    backupGroupContains: ")
                .append(toIndentedString(backupGroupContains))
                .append("\n");
        sb.append("    backupGroupEndsWith: ")
                .append(toIndentedString(backupGroupEndsWith))
                .append("\n");
        sb.append("    backupGroupGt: ").append(toIndentedString(backupGroupGt)).append("\n");
        sb.append("    backupGroupGte: ").append(toIndentedString(backupGroupGte)).append("\n");
        sb.append("    backupGroupIn: ").append(toIndentedString(backupGroupIn)).append("\n");
        sb.append("    backupGroupLt: ").append(toIndentedString(backupGroupLt)).append("\n");
        sb.append("    backupGroupLte: ").append(toIndentedString(backupGroupLte)).append("\n");
        sb.append("    backupGroupNot: ").append(toIndentedString(backupGroupNot)).append("\n");
        sb.append("    backupGroupNotContains: ")
                .append(toIndentedString(backupGroupNotContains))
                .append("\n");
        sb.append("    backupGroupNotEndsWith: ")
                .append(toIndentedString(backupGroupNotEndsWith))
                .append("\n");
        sb.append("    backupGroupNotIn: ").append(toIndentedString(backupGroupNotIn)).append("\n");
        sb.append("    backupGroupNotStartsWith: ")
                .append(toIndentedString(backupGroupNotStartsWith))
                .append("\n");
        sb.append("    backupGroupStartsWith: ")
                .append(toIndentedString(backupGroupStartsWith))
                .append("\n");
        sb.append("    backupPlanExecution: ")
                .append(toIndentedString(backupPlanExecution))
                .append("\n");
        sb.append("    backupRestorePoint: ")
                .append(toIndentedString(backupRestorePoint))
                .append("\n");
        sb.append("    clusterLocalId: ").append(toIndentedString(clusterLocalId)).append("\n");
        sb.append("    clusterLocalIdContains: ")
                .append(toIndentedString(clusterLocalIdContains))
                .append("\n");
        sb.append("    clusterLocalIdEndsWith: ")
                .append(toIndentedString(clusterLocalIdEndsWith))
                .append("\n");
        sb.append("    clusterLocalIdGt: ").append(toIndentedString(clusterLocalIdGt)).append("\n");
        sb.append("    clusterLocalIdGte: ")
                .append(toIndentedString(clusterLocalIdGte))
                .append("\n");
        sb.append("    clusterLocalIdIn: ").append(toIndentedString(clusterLocalIdIn)).append("\n");
        sb.append("    clusterLocalIdLt: ").append(toIndentedString(clusterLocalIdLt)).append("\n");
        sb.append("    clusterLocalIdLte: ")
                .append(toIndentedString(clusterLocalIdLte))
                .append("\n");
        sb.append("    clusterLocalIdNot: ")
                .append(toIndentedString(clusterLocalIdNot))
                .append("\n");
        sb.append("    clusterLocalIdNotContains: ")
                .append(toIndentedString(clusterLocalIdNotContains))
                .append("\n");
        sb.append("    clusterLocalIdNotEndsWith: ")
                .append(toIndentedString(clusterLocalIdNotEndsWith))
                .append("\n");
        sb.append("    clusterLocalIdNotIn: ")
                .append(toIndentedString(clusterLocalIdNotIn))
                .append("\n");
        sb.append("    clusterLocalIdNotStartsWith: ")
                .append(toIndentedString(clusterLocalIdNotStartsWith))
                .append("\n");
        sb.append("    clusterLocalIdStartsWith: ")
                .append(toIndentedString(clusterLocalIdStartsWith))
                .append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    durationGt: ").append(toIndentedString(durationGt)).append("\n");
        sb.append("    durationGte: ").append(toIndentedString(durationGte)).append("\n");
        sb.append("    durationIn: ").append(toIndentedString(durationIn)).append("\n");
        sb.append("    durationLt: ").append(toIndentedString(durationLt)).append("\n");
        sb.append("    durationLte: ").append(toIndentedString(durationLte)).append("\n");
        sb.append("    durationNot: ").append(toIndentedString(durationNot)).append("\n");
        sb.append("    durationNotIn: ").append(toIndentedString(durationNotIn)).append("\n");
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
        sb.append("    executedAt: ").append(toIndentedString(executedAt)).append("\n");
        sb.append("    executedAtGt: ").append(toIndentedString(executedAtGt)).append("\n");
        sb.append("    executedAtGte: ").append(toIndentedString(executedAtGte)).append("\n");
        sb.append("    executedAtIn: ").append(toIndentedString(executedAtIn)).append("\n");
        sb.append("    executedAtLt: ").append(toIndentedString(executedAtLt)).append("\n");
        sb.append("    executedAtLte: ").append(toIndentedString(executedAtLte)).append("\n");
        sb.append("    executedAtNot: ").append(toIndentedString(executedAtNot)).append("\n");
        sb.append("    executedAtNotIn: ").append(toIndentedString(executedAtNotIn)).append("\n");
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
        sb.append("    parentBackup: ").append(toIndentedString(parentBackup)).append("\n");
        sb.append("    parentBackupContains: ")
                .append(toIndentedString(parentBackupContains))
                .append("\n");
        sb.append("    parentBackupEndsWith: ")
                .append(toIndentedString(parentBackupEndsWith))
                .append("\n");
        sb.append("    parentBackupGt: ").append(toIndentedString(parentBackupGt)).append("\n");
        sb.append("    parentBackupGte: ").append(toIndentedString(parentBackupGte)).append("\n");
        sb.append("    parentBackupIn: ").append(toIndentedString(parentBackupIn)).append("\n");
        sb.append("    parentBackupLt: ").append(toIndentedString(parentBackupLt)).append("\n");
        sb.append("    parentBackupLte: ").append(toIndentedString(parentBackupLte)).append("\n");
        sb.append("    parentBackupNot: ").append(toIndentedString(parentBackupNot)).append("\n");
        sb.append("    parentBackupNotContains: ")
                .append(toIndentedString(parentBackupNotContains))
                .append("\n");
        sb.append("    parentBackupNotEndsWith: ")
                .append(toIndentedString(parentBackupNotEndsWith))
                .append("\n");
        sb.append("    parentBackupNotIn: ")
                .append(toIndentedString(parentBackupNotIn))
                .append("\n");
        sb.append("    parentBackupNotStartsWith: ")
                .append(toIndentedString(parentBackupNotStartsWith))
                .append("\n");
        sb.append("    parentBackupStartsWith: ")
                .append(toIndentedString(parentBackupStartsWith))
                .append("\n");
        sb.append("    readBytes: ").append(toIndentedString(readBytes)).append("\n");
        sb.append("    readBytesGt: ").append(toIndentedString(readBytesGt)).append("\n");
        sb.append("    readBytesGte: ").append(toIndentedString(readBytesGte)).append("\n");
        sb.append("    readBytesIn: ").append(toIndentedString(readBytesIn)).append("\n");
        sb.append("    readBytesLt: ").append(toIndentedString(readBytesLt)).append("\n");
        sb.append("    readBytesLte: ").append(toIndentedString(readBytesLte)).append("\n");
        sb.append("    readBytesNot: ").append(toIndentedString(readBytesNot)).append("\n");
        sb.append("    readBytesNotIn: ").append(toIndentedString(readBytesNotIn)).append("\n");
        sb.append("    retryTimes: ").append(toIndentedString(retryTimes)).append("\n");
        sb.append("    retryTimesGt: ").append(toIndentedString(retryTimesGt)).append("\n");
        sb.append("    retryTimesGte: ").append(toIndentedString(retryTimesGte)).append("\n");
        sb.append("    retryTimesIn: ").append(toIndentedString(retryTimesIn)).append("\n");
        sb.append("    retryTimesLt: ").append(toIndentedString(retryTimesLt)).append("\n");
        sb.append("    retryTimesLte: ").append(toIndentedString(retryTimesLte)).append("\n");
        sb.append("    retryTimesNot: ").append(toIndentedString(retryTimesNot)).append("\n");
        sb.append("    retryTimesNotIn: ").append(toIndentedString(retryTimesNotIn)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    statusIn: ").append(toIndentedString(statusIn)).append("\n");
        sb.append("    statusNot: ").append(toIndentedString(statusNot)).append("\n");
        sb.append("    statusNotIn: ").append(toIndentedString(statusNotIn)).append("\n");
        sb.append("    totalBytes: ").append(toIndentedString(totalBytes)).append("\n");
        sb.append("    totalBytesGt: ").append(toIndentedString(totalBytesGt)).append("\n");
        sb.append("    totalBytesGte: ").append(toIndentedString(totalBytesGte)).append("\n");
        sb.append("    totalBytesIn: ").append(toIndentedString(totalBytesIn)).append("\n");
        sb.append("    totalBytesLt: ").append(toIndentedString(totalBytesLt)).append("\n");
        sb.append("    totalBytesLte: ").append(toIndentedString(totalBytesLte)).append("\n");
        sb.append("    totalBytesNot: ").append(toIndentedString(totalBytesNot)).append("\n");
        sb.append("    totalBytesNotIn: ").append(toIndentedString(totalBytesNotIn)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    typeIn: ").append(toIndentedString(typeIn)).append("\n");
        sb.append("    typeNot: ").append(toIndentedString(typeNot)).append("\n");
        sb.append("    typeNotIn: ").append(toIndentedString(typeNotIn)).append("\n");
        sb.append("    vm: ").append(toIndentedString(vm)).append("\n");
        sb.append("    vmLocalId: ").append(toIndentedString(vmLocalId)).append("\n");
        sb.append("    vmLocalIdContains: ")
                .append(toIndentedString(vmLocalIdContains))
                .append("\n");
        sb.append("    vmLocalIdEndsWith: ")
                .append(toIndentedString(vmLocalIdEndsWith))
                .append("\n");
        sb.append("    vmLocalIdGt: ").append(toIndentedString(vmLocalIdGt)).append("\n");
        sb.append("    vmLocalIdGte: ").append(toIndentedString(vmLocalIdGte)).append("\n");
        sb.append("    vmLocalIdIn: ").append(toIndentedString(vmLocalIdIn)).append("\n");
        sb.append("    vmLocalIdLt: ").append(toIndentedString(vmLocalIdLt)).append("\n");
        sb.append("    vmLocalIdLte: ").append(toIndentedString(vmLocalIdLte)).append("\n");
        sb.append("    vmLocalIdNot: ").append(toIndentedString(vmLocalIdNot)).append("\n");
        sb.append("    vmLocalIdNotContains: ")
                .append(toIndentedString(vmLocalIdNotContains))
                .append("\n");
        sb.append("    vmLocalIdNotEndsWith: ")
                .append(toIndentedString(vmLocalIdNotEndsWith))
                .append("\n");
        sb.append("    vmLocalIdNotIn: ").append(toIndentedString(vmLocalIdNotIn)).append("\n");
        sb.append("    vmLocalIdNotStartsWith: ")
                .append(toIndentedString(vmLocalIdNotStartsWith))
                .append("\n");
        sb.append("    vmLocalIdStartsWith: ")
                .append(toIndentedString(vmLocalIdStartsWith))
                .append("\n");
        sb.append("    vmName: ").append(toIndentedString(vmName)).append("\n");
        sb.append("    vmNameContains: ").append(toIndentedString(vmNameContains)).append("\n");
        sb.append("    vmNameEndsWith: ").append(toIndentedString(vmNameEndsWith)).append("\n");
        sb.append("    vmNameGt: ").append(toIndentedString(vmNameGt)).append("\n");
        sb.append("    vmNameGte: ").append(toIndentedString(vmNameGte)).append("\n");
        sb.append("    vmNameIn: ").append(toIndentedString(vmNameIn)).append("\n");
        sb.append("    vmNameLt: ").append(toIndentedString(vmNameLt)).append("\n");
        sb.append("    vmNameLte: ").append(toIndentedString(vmNameLte)).append("\n");
        sb.append("    vmNameNot: ").append(toIndentedString(vmNameNot)).append("\n");
        sb.append("    vmNameNotContains: ")
                .append(toIndentedString(vmNameNotContains))
                .append("\n");
        sb.append("    vmNameNotEndsWith: ")
                .append(toIndentedString(vmNameNotEndsWith))
                .append("\n");
        sb.append("    vmNameNotIn: ").append(toIndentedString(vmNameNotIn)).append("\n");
        sb.append("    vmNameNotStartsWith: ")
                .append(toIndentedString(vmNameNotStartsWith))
                .append("\n");
        sb.append("    vmNameStartsWith: ").append(toIndentedString(vmNameStartsWith)).append("\n");
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

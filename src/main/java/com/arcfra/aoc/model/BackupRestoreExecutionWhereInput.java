package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** BackupRestoreExecutionWhereInput */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class BackupRestoreExecutionWhereInput
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_A_N_D = "AND";

    @SerializedName(SERIALIZED_NAME_A_N_D)
    private List<BackupRestoreExecutionWhereInput> AND = null;

    public static final String SERIALIZED_NAME_N_O_T = "NOT";

    @SerializedName(SERIALIZED_NAME_N_O_T)
    private List<BackupRestoreExecutionWhereInput> NOT = null;

    public static final String SERIALIZED_NAME_O_R = "OR";

    @SerializedName(SERIALIZED_NAME_O_R)
    private List<BackupRestoreExecutionWhereInput> OR = null;

    public static final String SERIALIZED_NAME_BACKUP_RESTORE_POINT = "backup_restore_point";

    @SerializedName(SERIALIZED_NAME_BACKUP_RESTORE_POINT)
    private BackupRestorePointWhereInput backupRestorePoint;

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

    public static final String SERIALIZED_NAME_MODE = "mode";

    @SerializedName(SERIALIZED_NAME_MODE)
    private BackupRestoreExecutionMode mode;

    public static final String SERIALIZED_NAME_MODE_IN = "mode_in";

    @SerializedName(SERIALIZED_NAME_MODE_IN)
    private List<BackupRestoreExecutionMode> modeIn = null;

    public static final String SERIALIZED_NAME_MODE_NOT = "mode_not";

    @SerializedName(SERIALIZED_NAME_MODE_NOT)
    private BackupRestoreExecutionMode modeNot;

    public static final String SERIALIZED_NAME_MODE_NOT_IN = "mode_not_in";

    @SerializedName(SERIALIZED_NAME_MODE_NOT_IN)
    private List<BackupRestoreExecutionMode> modeNotIn = null;

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

    public static final String SERIALIZED_NAME_REBUILD_NAME = "rebuild_name";

    @SerializedName(SERIALIZED_NAME_REBUILD_NAME)
    private String rebuildName;

    public static final String SERIALIZED_NAME_REBUILD_NAME_CONTAINS = "rebuild_name_contains";

    @SerializedName(SERIALIZED_NAME_REBUILD_NAME_CONTAINS)
    private String rebuildNameContains;

    public static final String SERIALIZED_NAME_REBUILD_NAME_ENDS_WITH = "rebuild_name_ends_with";

    @SerializedName(SERIALIZED_NAME_REBUILD_NAME_ENDS_WITH)
    private String rebuildNameEndsWith;

    public static final String SERIALIZED_NAME_REBUILD_NAME_GT = "rebuild_name_gt";

    @SerializedName(SERIALIZED_NAME_REBUILD_NAME_GT)
    private String rebuildNameGt;

    public static final String SERIALIZED_NAME_REBUILD_NAME_GTE = "rebuild_name_gte";

    @SerializedName(SERIALIZED_NAME_REBUILD_NAME_GTE)
    private String rebuildNameGte;

    public static final String SERIALIZED_NAME_REBUILD_NAME_IN = "rebuild_name_in";

    @SerializedName(SERIALIZED_NAME_REBUILD_NAME_IN)
    private List<String> rebuildNameIn = null;

    public static final String SERIALIZED_NAME_REBUILD_NAME_LT = "rebuild_name_lt";

    @SerializedName(SERIALIZED_NAME_REBUILD_NAME_LT)
    private String rebuildNameLt;

    public static final String SERIALIZED_NAME_REBUILD_NAME_LTE = "rebuild_name_lte";

    @SerializedName(SERIALIZED_NAME_REBUILD_NAME_LTE)
    private String rebuildNameLte;

    public static final String SERIALIZED_NAME_REBUILD_NAME_NOT = "rebuild_name_not";

    @SerializedName(SERIALIZED_NAME_REBUILD_NAME_NOT)
    private String rebuildNameNot;

    public static final String SERIALIZED_NAME_REBUILD_NAME_NOT_CONTAINS =
            "rebuild_name_not_contains";

    @SerializedName(SERIALIZED_NAME_REBUILD_NAME_NOT_CONTAINS)
    private String rebuildNameNotContains;

    public static final String SERIALIZED_NAME_REBUILD_NAME_NOT_ENDS_WITH =
            "rebuild_name_not_ends_with";

    @SerializedName(SERIALIZED_NAME_REBUILD_NAME_NOT_ENDS_WITH)
    private String rebuildNameNotEndsWith;

    public static final String SERIALIZED_NAME_REBUILD_NAME_NOT_IN = "rebuild_name_not_in";

    @SerializedName(SERIALIZED_NAME_REBUILD_NAME_NOT_IN)
    private List<String> rebuildNameNotIn = null;

    public static final String SERIALIZED_NAME_REBUILD_NAME_NOT_STARTS_WITH =
            "rebuild_name_not_starts_with";

    @SerializedName(SERIALIZED_NAME_REBUILD_NAME_NOT_STARTS_WITH)
    private String rebuildNameNotStartsWith;

    public static final String SERIALIZED_NAME_REBUILD_NAME_STARTS_WITH =
            "rebuild_name_starts_with";

    @SerializedName(SERIALIZED_NAME_REBUILD_NAME_STARTS_WITH)
    private String rebuildNameStartsWith;

    public static final String SERIALIZED_NAME_REBUILD_TARGET_CLUSTER = "rebuild_target_cluster";

    @SerializedName(SERIALIZED_NAME_REBUILD_TARGET_CLUSTER)
    private String rebuildTargetCluster;

    public static final String SERIALIZED_NAME_REBUILD_TARGET_CLUSTER_CONTAINS =
            "rebuild_target_cluster_contains";

    @SerializedName(SERIALIZED_NAME_REBUILD_TARGET_CLUSTER_CONTAINS)
    private String rebuildTargetClusterContains;

    public static final String SERIALIZED_NAME_REBUILD_TARGET_CLUSTER_ENDS_WITH =
            "rebuild_target_cluster_ends_with";

    @SerializedName(SERIALIZED_NAME_REBUILD_TARGET_CLUSTER_ENDS_WITH)
    private String rebuildTargetClusterEndsWith;

    public static final String SERIALIZED_NAME_REBUILD_TARGET_CLUSTER_GT =
            "rebuild_target_cluster_gt";

    @SerializedName(SERIALIZED_NAME_REBUILD_TARGET_CLUSTER_GT)
    private String rebuildTargetClusterGt;

    public static final String SERIALIZED_NAME_REBUILD_TARGET_CLUSTER_GTE =
            "rebuild_target_cluster_gte";

    @SerializedName(SERIALIZED_NAME_REBUILD_TARGET_CLUSTER_GTE)
    private String rebuildTargetClusterGte;

    public static final String SERIALIZED_NAME_REBUILD_TARGET_CLUSTER_IN =
            "rebuild_target_cluster_in";

    @SerializedName(SERIALIZED_NAME_REBUILD_TARGET_CLUSTER_IN)
    private List<String> rebuildTargetClusterIn = null;

    public static final String SERIALIZED_NAME_REBUILD_TARGET_CLUSTER_LT =
            "rebuild_target_cluster_lt";

    @SerializedName(SERIALIZED_NAME_REBUILD_TARGET_CLUSTER_LT)
    private String rebuildTargetClusterLt;

    public static final String SERIALIZED_NAME_REBUILD_TARGET_CLUSTER_LTE =
            "rebuild_target_cluster_lte";

    @SerializedName(SERIALIZED_NAME_REBUILD_TARGET_CLUSTER_LTE)
    private String rebuildTargetClusterLte;

    public static final String SERIALIZED_NAME_REBUILD_TARGET_CLUSTER_NOT =
            "rebuild_target_cluster_not";

    @SerializedName(SERIALIZED_NAME_REBUILD_TARGET_CLUSTER_NOT)
    private String rebuildTargetClusterNot;

    public static final String SERIALIZED_NAME_REBUILD_TARGET_CLUSTER_NOT_CONTAINS =
            "rebuild_target_cluster_not_contains";

    @SerializedName(SERIALIZED_NAME_REBUILD_TARGET_CLUSTER_NOT_CONTAINS)
    private String rebuildTargetClusterNotContains;

    public static final String SERIALIZED_NAME_REBUILD_TARGET_CLUSTER_NOT_ENDS_WITH =
            "rebuild_target_cluster_not_ends_with";

    @SerializedName(SERIALIZED_NAME_REBUILD_TARGET_CLUSTER_NOT_ENDS_WITH)
    private String rebuildTargetClusterNotEndsWith;

    public static final String SERIALIZED_NAME_REBUILD_TARGET_CLUSTER_NOT_IN =
            "rebuild_target_cluster_not_in";

    @SerializedName(SERIALIZED_NAME_REBUILD_TARGET_CLUSTER_NOT_IN)
    private List<String> rebuildTargetClusterNotIn = null;

    public static final String SERIALIZED_NAME_REBUILD_TARGET_CLUSTER_NOT_STARTS_WITH =
            "rebuild_target_cluster_not_starts_with";

    @SerializedName(SERIALIZED_NAME_REBUILD_TARGET_CLUSTER_NOT_STARTS_WITH)
    private String rebuildTargetClusterNotStartsWith;

    public static final String SERIALIZED_NAME_REBUILD_TARGET_CLUSTER_STARTS_WITH =
            "rebuild_target_cluster_starts_with";

    @SerializedName(SERIALIZED_NAME_REBUILD_TARGET_CLUSTER_STARTS_WITH)
    private String rebuildTargetClusterStartsWith;

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

    public static final String SERIALIZED_NAME_STARTUP_AFTER_RESTORE = "startup_after_restore";

    @SerializedName(SERIALIZED_NAME_STARTUP_AFTER_RESTORE)
    private Boolean startupAfterRestore;

    public static final String SERIALIZED_NAME_STARTUP_AFTER_RESTORE_NOT =
            "startup_after_restore_not";

    @SerializedName(SERIALIZED_NAME_STARTUP_AFTER_RESTORE_NOT)
    private Boolean startupAfterRestoreNot;

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

    public BackupRestoreExecutionWhereInput() {}

    public BackupRestoreExecutionWhereInput AND(List<BackupRestoreExecutionWhereInput> AND) {

        this.AND = AND;
        return this;
    }

    public BackupRestoreExecutionWhereInput addANDItem(BackupRestoreExecutionWhereInput ANDItem) {
        if (this.AND == null) {
            this.AND = new ArrayList<BackupRestoreExecutionWhereInput>();
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
    public List<BackupRestoreExecutionWhereInput> getAND() {
        return AND;
    }

    public void setAND(List<BackupRestoreExecutionWhereInput> AND) {
        this.AND = AND;
    }

    public BackupRestoreExecutionWhereInput AND_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_A_N_D);
        return this;
    }

    public BackupRestoreExecutionWhereInput AND_ExplictlyNonNull() {
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

    public BackupRestoreExecutionWhereInput NOT(List<BackupRestoreExecutionWhereInput> NOT) {

        this.NOT = NOT;
        return this;
    }

    public BackupRestoreExecutionWhereInput addNOTItem(BackupRestoreExecutionWhereInput NOTItem) {
        if (this.NOT == null) {
            this.NOT = new ArrayList<BackupRestoreExecutionWhereInput>();
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
    public List<BackupRestoreExecutionWhereInput> getNOT() {
        return NOT;
    }

    public void setNOT(List<BackupRestoreExecutionWhereInput> NOT) {
        this.NOT = NOT;
    }

    public BackupRestoreExecutionWhereInput NOT_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_N_O_T);
        return this;
    }

    public BackupRestoreExecutionWhereInput NOT_ExplictlyNonNull() {
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

    public BackupRestoreExecutionWhereInput OR(List<BackupRestoreExecutionWhereInput> OR) {

        this.OR = OR;
        return this;
    }

    public BackupRestoreExecutionWhereInput addORItem(BackupRestoreExecutionWhereInput ORItem) {
        if (this.OR == null) {
            this.OR = new ArrayList<BackupRestoreExecutionWhereInput>();
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
    public List<BackupRestoreExecutionWhereInput> getOR() {
        return OR;
    }

    public void setOR(List<BackupRestoreExecutionWhereInput> OR) {
        this.OR = OR;
    }

    public BackupRestoreExecutionWhereInput OR_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_O_R);
        return this;
    }

    public BackupRestoreExecutionWhereInput OR_ExplictlyNonNull() {
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

    public BackupRestoreExecutionWhereInput backupRestorePoint(
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

    public BackupRestoreExecutionWhereInput backupRestorePoint_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_RESTORE_POINT);
        return this;
    }

    public BackupRestoreExecutionWhereInput backupRestorePoint_ExplictlyNonNull() {
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

    public BackupRestoreExecutionWhereInput duration(Integer duration) {

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

    public BackupRestoreExecutionWhereInput duration_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DURATION);
        return this;
    }

    public BackupRestoreExecutionWhereInput duration_ExplictlyNonNull() {
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

    public BackupRestoreExecutionWhereInput durationGt(Integer durationGt) {

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

    public BackupRestoreExecutionWhereInput durationGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DURATION_GT);
        return this;
    }

    public BackupRestoreExecutionWhereInput durationGt_ExplictlyNonNull() {
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

    public BackupRestoreExecutionWhereInput durationGte(Integer durationGte) {

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

    public BackupRestoreExecutionWhereInput durationGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DURATION_GTE);
        return this;
    }

    public BackupRestoreExecutionWhereInput durationGte_ExplictlyNonNull() {
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

    public BackupRestoreExecutionWhereInput durationIn(List<Integer> durationIn) {

        this.durationIn = durationIn;
        return this;
    }

    public BackupRestoreExecutionWhereInput addDurationInItem(Integer durationInItem) {
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

    public BackupRestoreExecutionWhereInput durationIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DURATION_IN);
        return this;
    }

    public BackupRestoreExecutionWhereInput durationIn_ExplictlyNonNull() {
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

    public BackupRestoreExecutionWhereInput durationLt(Integer durationLt) {

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

    public BackupRestoreExecutionWhereInput durationLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DURATION_LT);
        return this;
    }

    public BackupRestoreExecutionWhereInput durationLt_ExplictlyNonNull() {
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

    public BackupRestoreExecutionWhereInput durationLte(Integer durationLte) {

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

    public BackupRestoreExecutionWhereInput durationLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DURATION_LTE);
        return this;
    }

    public BackupRestoreExecutionWhereInput durationLte_ExplictlyNonNull() {
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

    public BackupRestoreExecutionWhereInput durationNot(Integer durationNot) {

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

    public BackupRestoreExecutionWhereInput durationNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DURATION_NOT);
        return this;
    }

    public BackupRestoreExecutionWhereInput durationNot_ExplictlyNonNull() {
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

    public BackupRestoreExecutionWhereInput durationNotIn(List<Integer> durationNotIn) {

        this.durationNotIn = durationNotIn;
        return this;
    }

    public BackupRestoreExecutionWhereInput addDurationNotInItem(Integer durationNotInItem) {
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

    public BackupRestoreExecutionWhereInput durationNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DURATION_NOT_IN);
        return this;
    }

    public BackupRestoreExecutionWhereInput durationNotIn_ExplictlyNonNull() {
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

    public BackupRestoreExecutionWhereInput entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {

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

    public BackupRestoreExecutionWhereInput entityAsyncStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        return this;
    }

    public BackupRestoreExecutionWhereInput entityAsyncStatus_ExplictlyNonNull() {
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

    public BackupRestoreExecutionWhereInput entityAsyncStatusIn(
            List<EntityAsyncStatus> entityAsyncStatusIn) {

        this.entityAsyncStatusIn = entityAsyncStatusIn;
        return this;
    }

    public BackupRestoreExecutionWhereInput addEntityAsyncStatusInItem(
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

    public BackupRestoreExecutionWhereInput entityAsyncStatusIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_IN);
        return this;
    }

    public BackupRestoreExecutionWhereInput entityAsyncStatusIn_ExplictlyNonNull() {
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

    public BackupRestoreExecutionWhereInput entityAsyncStatusNot(
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

    public BackupRestoreExecutionWhereInput entityAsyncStatusNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT);
        return this;
    }

    public BackupRestoreExecutionWhereInput entityAsyncStatusNot_ExplictlyNonNull() {
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

    public BackupRestoreExecutionWhereInput entityAsyncStatusNotIn(
            List<EntityAsyncStatus> entityAsyncStatusNotIn) {

        this.entityAsyncStatusNotIn = entityAsyncStatusNotIn;
        return this;
    }

    public BackupRestoreExecutionWhereInput addEntityAsyncStatusNotInItem(
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

    public BackupRestoreExecutionWhereInput entityAsyncStatusNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT_IN);
        return this;
    }

    public BackupRestoreExecutionWhereInput entityAsyncStatusNotIn_ExplictlyNonNull() {
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

    public BackupRestoreExecutionWhereInput executedAt(String executedAt) {

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

    public BackupRestoreExecutionWhereInput executedAt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXECUTED_AT);
        return this;
    }

    public BackupRestoreExecutionWhereInput executedAt_ExplictlyNonNull() {
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

    public BackupRestoreExecutionWhereInput executedAtGt(String executedAtGt) {

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

    public BackupRestoreExecutionWhereInput executedAtGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXECUTED_AT_GT);
        return this;
    }

    public BackupRestoreExecutionWhereInput executedAtGt_ExplictlyNonNull() {
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

    public BackupRestoreExecutionWhereInput executedAtGte(String executedAtGte) {

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

    public BackupRestoreExecutionWhereInput executedAtGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXECUTED_AT_GTE);
        return this;
    }

    public BackupRestoreExecutionWhereInput executedAtGte_ExplictlyNonNull() {
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

    public BackupRestoreExecutionWhereInput executedAtIn(List<String> executedAtIn) {

        this.executedAtIn = executedAtIn;
        return this;
    }

    public BackupRestoreExecutionWhereInput addExecutedAtInItem(String executedAtInItem) {
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

    public BackupRestoreExecutionWhereInput executedAtIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXECUTED_AT_IN);
        return this;
    }

    public BackupRestoreExecutionWhereInput executedAtIn_ExplictlyNonNull() {
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

    public BackupRestoreExecutionWhereInput executedAtLt(String executedAtLt) {

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

    public BackupRestoreExecutionWhereInput executedAtLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXECUTED_AT_LT);
        return this;
    }

    public BackupRestoreExecutionWhereInput executedAtLt_ExplictlyNonNull() {
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

    public BackupRestoreExecutionWhereInput executedAtLte(String executedAtLte) {

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

    public BackupRestoreExecutionWhereInput executedAtLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXECUTED_AT_LTE);
        return this;
    }

    public BackupRestoreExecutionWhereInput executedAtLte_ExplictlyNonNull() {
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

    public BackupRestoreExecutionWhereInput executedAtNot(String executedAtNot) {

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

    public BackupRestoreExecutionWhereInput executedAtNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXECUTED_AT_NOT);
        return this;
    }

    public BackupRestoreExecutionWhereInput executedAtNot_ExplictlyNonNull() {
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

    public BackupRestoreExecutionWhereInput executedAtNotIn(List<String> executedAtNotIn) {

        this.executedAtNotIn = executedAtNotIn;
        return this;
    }

    public BackupRestoreExecutionWhereInput addExecutedAtNotInItem(String executedAtNotInItem) {
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

    public BackupRestoreExecutionWhereInput executedAtNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXECUTED_AT_NOT_IN);
        return this;
    }

    public BackupRestoreExecutionWhereInput executedAtNotIn_ExplictlyNonNull() {
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

    public BackupRestoreExecutionWhereInput id(String id) {

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

    public BackupRestoreExecutionWhereInput id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public BackupRestoreExecutionWhereInput id_ExplictlyNonNull() {
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

    public BackupRestoreExecutionWhereInput idContains(String idContains) {

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

    public BackupRestoreExecutionWhereInput idContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_CONTAINS);
        return this;
    }

    public BackupRestoreExecutionWhereInput idContains_ExplictlyNonNull() {
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

    public BackupRestoreExecutionWhereInput idEndsWith(String idEndsWith) {

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

    public BackupRestoreExecutionWhereInput idEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_ENDS_WITH);
        return this;
    }

    public BackupRestoreExecutionWhereInput idEndsWith_ExplictlyNonNull() {
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

    public BackupRestoreExecutionWhereInput idGt(String idGt) {

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

    public BackupRestoreExecutionWhereInput idGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GT);
        return this;
    }

    public BackupRestoreExecutionWhereInput idGt_ExplictlyNonNull() {
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

    public BackupRestoreExecutionWhereInput idGte(String idGte) {

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

    public BackupRestoreExecutionWhereInput idGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GTE);
        return this;
    }

    public BackupRestoreExecutionWhereInput idGte_ExplictlyNonNull() {
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

    public BackupRestoreExecutionWhereInput idIn(List<String> idIn) {

        this.idIn = idIn;
        return this;
    }

    public BackupRestoreExecutionWhereInput addIdInItem(String idInItem) {
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

    public BackupRestoreExecutionWhereInput idIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_IN);
        return this;
    }

    public BackupRestoreExecutionWhereInput idIn_ExplictlyNonNull() {
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

    public BackupRestoreExecutionWhereInput idLt(String idLt) {

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

    public BackupRestoreExecutionWhereInput idLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LT);
        return this;
    }

    public BackupRestoreExecutionWhereInput idLt_ExplictlyNonNull() {
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

    public BackupRestoreExecutionWhereInput idLte(String idLte) {

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

    public BackupRestoreExecutionWhereInput idLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LTE);
        return this;
    }

    public BackupRestoreExecutionWhereInput idLte_ExplictlyNonNull() {
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

    public BackupRestoreExecutionWhereInput idNot(String idNot) {

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

    public BackupRestoreExecutionWhereInput idNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT);
        return this;
    }

    public BackupRestoreExecutionWhereInput idNot_ExplictlyNonNull() {
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

    public BackupRestoreExecutionWhereInput idNotContains(String idNotContains) {

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

    public BackupRestoreExecutionWhereInput idNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_CONTAINS);
        return this;
    }

    public BackupRestoreExecutionWhereInput idNotContains_ExplictlyNonNull() {
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

    public BackupRestoreExecutionWhereInput idNotEndsWith(String idNotEndsWith) {

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

    public BackupRestoreExecutionWhereInput idNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
        return this;
    }

    public BackupRestoreExecutionWhereInput idNotEndsWith_ExplictlyNonNull() {
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

    public BackupRestoreExecutionWhereInput idNotIn(List<String> idNotIn) {

        this.idNotIn = idNotIn;
        return this;
    }

    public BackupRestoreExecutionWhereInput addIdNotInItem(String idNotInItem) {
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

    public BackupRestoreExecutionWhereInput idNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_IN);
        return this;
    }

    public BackupRestoreExecutionWhereInput idNotIn_ExplictlyNonNull() {
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

    public BackupRestoreExecutionWhereInput idNotStartsWith(String idNotStartsWith) {

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

    public BackupRestoreExecutionWhereInput idNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
        return this;
    }

    public BackupRestoreExecutionWhereInput idNotStartsWith_ExplictlyNonNull() {
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

    public BackupRestoreExecutionWhereInput idStartsWith(String idStartsWith) {

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

    public BackupRestoreExecutionWhereInput idStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_STARTS_WITH);
        return this;
    }

    public BackupRestoreExecutionWhereInput idStartsWith_ExplictlyNonNull() {
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

    public BackupRestoreExecutionWhereInput mode(BackupRestoreExecutionMode mode) {

        this.mode = mode;
        return this;
    }

    /**
     * Get mode
     *
     * @return mode
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public BackupRestoreExecutionMode getMode() {
        return mode;
    }

    public void setMode(BackupRestoreExecutionMode mode) {
        this.mode = mode;
    }

    public BackupRestoreExecutionWhereInput mode_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MODE);
        return this;
    }

    public BackupRestoreExecutionWhereInput mode_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MODE);
        return this;
    }

    public void setMode_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MODE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MODE);
        }
    }

    public boolean getMode_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MODE);
    }

    public BackupRestoreExecutionWhereInput modeIn(List<BackupRestoreExecutionMode> modeIn) {

        this.modeIn = modeIn;
        return this;
    }

    public BackupRestoreExecutionWhereInput addModeInItem(BackupRestoreExecutionMode modeInItem) {
        if (this.modeIn == null) {
            this.modeIn = new ArrayList<BackupRestoreExecutionMode>();
        }
        this.modeIn.add(modeInItem);
        return this;
    }

    /**
     * Get modeIn
     *
     * @return modeIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<BackupRestoreExecutionMode> getModeIn() {
        return modeIn;
    }

    public void setModeIn(List<BackupRestoreExecutionMode> modeIn) {
        this.modeIn = modeIn;
    }

    public BackupRestoreExecutionWhereInput modeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MODE_IN);
        return this;
    }

    public BackupRestoreExecutionWhereInput modeIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MODE_IN);
        return this;
    }

    public void setModeIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MODE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MODE_IN);
        }
    }

    public boolean getModeIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MODE_IN);
    }

    public BackupRestoreExecutionWhereInput modeNot(BackupRestoreExecutionMode modeNot) {

        this.modeNot = modeNot;
        return this;
    }

    /**
     * Get modeNot
     *
     * @return modeNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public BackupRestoreExecutionMode getModeNot() {
        return modeNot;
    }

    public void setModeNot(BackupRestoreExecutionMode modeNot) {
        this.modeNot = modeNot;
    }

    public BackupRestoreExecutionWhereInput modeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MODE_NOT);
        return this;
    }

    public BackupRestoreExecutionWhereInput modeNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MODE_NOT);
        return this;
    }

    public void setModeNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MODE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MODE_NOT);
        }
    }

    public boolean getModeNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MODE_NOT);
    }

    public BackupRestoreExecutionWhereInput modeNotIn(List<BackupRestoreExecutionMode> modeNotIn) {

        this.modeNotIn = modeNotIn;
        return this;
    }

    public BackupRestoreExecutionWhereInput addModeNotInItem(
            BackupRestoreExecutionMode modeNotInItem) {
        if (this.modeNotIn == null) {
            this.modeNotIn = new ArrayList<BackupRestoreExecutionMode>();
        }
        this.modeNotIn.add(modeNotInItem);
        return this;
    }

    /**
     * Get modeNotIn
     *
     * @return modeNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<BackupRestoreExecutionMode> getModeNotIn() {
        return modeNotIn;
    }

    public void setModeNotIn(List<BackupRestoreExecutionMode> modeNotIn) {
        this.modeNotIn = modeNotIn;
    }

    public BackupRestoreExecutionWhereInput modeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MODE_NOT_IN);
        return this;
    }

    public BackupRestoreExecutionWhereInput modeNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MODE_NOT_IN);
        return this;
    }

    public void setModeNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MODE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MODE_NOT_IN);
        }
    }

    public boolean getModeNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MODE_NOT_IN);
    }

    public BackupRestoreExecutionWhereInput name(String name) {

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

    public BackupRestoreExecutionWhereInput name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public BackupRestoreExecutionWhereInput name_ExplictlyNonNull() {
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

    public BackupRestoreExecutionWhereInput nameContains(String nameContains) {

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

    public BackupRestoreExecutionWhereInput nameContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_CONTAINS);
        return this;
    }

    public BackupRestoreExecutionWhereInput nameContains_ExplictlyNonNull() {
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

    public BackupRestoreExecutionWhereInput nameEndsWith(String nameEndsWith) {

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

    public BackupRestoreExecutionWhereInput nameEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_ENDS_WITH);
        return this;
    }

    public BackupRestoreExecutionWhereInput nameEndsWith_ExplictlyNonNull() {
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

    public BackupRestoreExecutionWhereInput nameGt(String nameGt) {

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

    public BackupRestoreExecutionWhereInput nameGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_GT);
        return this;
    }

    public BackupRestoreExecutionWhereInput nameGt_ExplictlyNonNull() {
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

    public BackupRestoreExecutionWhereInput nameGte(String nameGte) {

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

    public BackupRestoreExecutionWhereInput nameGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_GTE);
        return this;
    }

    public BackupRestoreExecutionWhereInput nameGte_ExplictlyNonNull() {
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

    public BackupRestoreExecutionWhereInput nameIn(List<String> nameIn) {

        this.nameIn = nameIn;
        return this;
    }

    public BackupRestoreExecutionWhereInput addNameInItem(String nameInItem) {
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

    public BackupRestoreExecutionWhereInput nameIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_IN);
        return this;
    }

    public BackupRestoreExecutionWhereInput nameIn_ExplictlyNonNull() {
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

    public BackupRestoreExecutionWhereInput nameLt(String nameLt) {

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

    public BackupRestoreExecutionWhereInput nameLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_LT);
        return this;
    }

    public BackupRestoreExecutionWhereInput nameLt_ExplictlyNonNull() {
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

    public BackupRestoreExecutionWhereInput nameLte(String nameLte) {

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

    public BackupRestoreExecutionWhereInput nameLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_LTE);
        return this;
    }

    public BackupRestoreExecutionWhereInput nameLte_ExplictlyNonNull() {
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

    public BackupRestoreExecutionWhereInput nameNot(String nameNot) {

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

    public BackupRestoreExecutionWhereInput nameNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT);
        return this;
    }

    public BackupRestoreExecutionWhereInput nameNot_ExplictlyNonNull() {
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

    public BackupRestoreExecutionWhereInput nameNotContains(String nameNotContains) {

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

    public BackupRestoreExecutionWhereInput nameNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_CONTAINS);
        return this;
    }

    public BackupRestoreExecutionWhereInput nameNotContains_ExplictlyNonNull() {
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

    public BackupRestoreExecutionWhereInput nameNotEndsWith(String nameNotEndsWith) {

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

    public BackupRestoreExecutionWhereInput nameNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_ENDS_WITH);
        return this;
    }

    public BackupRestoreExecutionWhereInput nameNotEndsWith_ExplictlyNonNull() {
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

    public BackupRestoreExecutionWhereInput nameNotIn(List<String> nameNotIn) {

        this.nameNotIn = nameNotIn;
        return this;
    }

    public BackupRestoreExecutionWhereInput addNameNotInItem(String nameNotInItem) {
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

    public BackupRestoreExecutionWhereInput nameNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_IN);
        return this;
    }

    public BackupRestoreExecutionWhereInput nameNotIn_ExplictlyNonNull() {
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

    public BackupRestoreExecutionWhereInput nameNotStartsWith(String nameNotStartsWith) {

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

    public BackupRestoreExecutionWhereInput nameNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_STARTS_WITH);
        return this;
    }

    public BackupRestoreExecutionWhereInput nameNotStartsWith_ExplictlyNonNull() {
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

    public BackupRestoreExecutionWhereInput nameStartsWith(String nameStartsWith) {

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

    public BackupRestoreExecutionWhereInput nameStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_STARTS_WITH);
        return this;
    }

    public BackupRestoreExecutionWhereInput nameStartsWith_ExplictlyNonNull() {
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

    public BackupRestoreExecutionWhereInput readBytes(Long readBytes) {

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

    public BackupRestoreExecutionWhereInput readBytes_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_READ_BYTES);
        return this;
    }

    public BackupRestoreExecutionWhereInput readBytes_ExplictlyNonNull() {
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

    public BackupRestoreExecutionWhereInput readBytesGt(Long readBytesGt) {

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

    public BackupRestoreExecutionWhereInput readBytesGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_READ_BYTES_GT);
        return this;
    }

    public BackupRestoreExecutionWhereInput readBytesGt_ExplictlyNonNull() {
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

    public BackupRestoreExecutionWhereInput readBytesGte(Long readBytesGte) {

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

    public BackupRestoreExecutionWhereInput readBytesGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_READ_BYTES_GTE);
        return this;
    }

    public BackupRestoreExecutionWhereInput readBytesGte_ExplictlyNonNull() {
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

    public BackupRestoreExecutionWhereInput readBytesIn(List<Long> readBytesIn) {

        this.readBytesIn = readBytesIn;
        return this;
    }

    public BackupRestoreExecutionWhereInput addReadBytesInItem(Long readBytesInItem) {
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

    public BackupRestoreExecutionWhereInput readBytesIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_READ_BYTES_IN);
        return this;
    }

    public BackupRestoreExecutionWhereInput readBytesIn_ExplictlyNonNull() {
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

    public BackupRestoreExecutionWhereInput readBytesLt(Long readBytesLt) {

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

    public BackupRestoreExecutionWhereInput readBytesLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_READ_BYTES_LT);
        return this;
    }

    public BackupRestoreExecutionWhereInput readBytesLt_ExplictlyNonNull() {
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

    public BackupRestoreExecutionWhereInput readBytesLte(Long readBytesLte) {

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

    public BackupRestoreExecutionWhereInput readBytesLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_READ_BYTES_LTE);
        return this;
    }

    public BackupRestoreExecutionWhereInput readBytesLte_ExplictlyNonNull() {
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

    public BackupRestoreExecutionWhereInput readBytesNot(Long readBytesNot) {

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

    public BackupRestoreExecutionWhereInput readBytesNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_READ_BYTES_NOT);
        return this;
    }

    public BackupRestoreExecutionWhereInput readBytesNot_ExplictlyNonNull() {
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

    public BackupRestoreExecutionWhereInput readBytesNotIn(List<Long> readBytesNotIn) {

        this.readBytesNotIn = readBytesNotIn;
        return this;
    }

    public BackupRestoreExecutionWhereInput addReadBytesNotInItem(Long readBytesNotInItem) {
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

    public BackupRestoreExecutionWhereInput readBytesNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_READ_BYTES_NOT_IN);
        return this;
    }

    public BackupRestoreExecutionWhereInput readBytesNotIn_ExplictlyNonNull() {
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

    public BackupRestoreExecutionWhereInput rebuildName(String rebuildName) {

        this.rebuildName = rebuildName;
        return this;
    }

    /**
     * Get rebuildName
     *
     * @return rebuildName
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getRebuildName() {
        return rebuildName;
    }

    public void setRebuildName(String rebuildName) {
        this.rebuildName = rebuildName;
    }

    public BackupRestoreExecutionWhereInput rebuildName_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REBUILD_NAME);
        return this;
    }

    public BackupRestoreExecutionWhereInput rebuildName_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REBUILD_NAME);
        return this;
    }

    public void setRebuildName_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REBUILD_NAME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REBUILD_NAME);
        }
    }

    public boolean getRebuildName_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REBUILD_NAME);
    }

    public BackupRestoreExecutionWhereInput rebuildNameContains(String rebuildNameContains) {

        this.rebuildNameContains = rebuildNameContains;
        return this;
    }

    /**
     * Get rebuildNameContains
     *
     * @return rebuildNameContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getRebuildNameContains() {
        return rebuildNameContains;
    }

    public void setRebuildNameContains(String rebuildNameContains) {
        this.rebuildNameContains = rebuildNameContains;
    }

    public BackupRestoreExecutionWhereInput rebuildNameContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REBUILD_NAME_CONTAINS);
        return this;
    }

    public BackupRestoreExecutionWhereInput rebuildNameContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REBUILD_NAME_CONTAINS);
        return this;
    }

    public void setRebuildNameContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REBUILD_NAME_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REBUILD_NAME_CONTAINS);
        }
    }

    public boolean getRebuildNameContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REBUILD_NAME_CONTAINS);
    }

    public BackupRestoreExecutionWhereInput rebuildNameEndsWith(String rebuildNameEndsWith) {

        this.rebuildNameEndsWith = rebuildNameEndsWith;
        return this;
    }

    /**
     * Get rebuildNameEndsWith
     *
     * @return rebuildNameEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getRebuildNameEndsWith() {
        return rebuildNameEndsWith;
    }

    public void setRebuildNameEndsWith(String rebuildNameEndsWith) {
        this.rebuildNameEndsWith = rebuildNameEndsWith;
    }

    public BackupRestoreExecutionWhereInput rebuildNameEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REBUILD_NAME_ENDS_WITH);
        return this;
    }

    public BackupRestoreExecutionWhereInput rebuildNameEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REBUILD_NAME_ENDS_WITH);
        return this;
    }

    public void setRebuildNameEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REBUILD_NAME_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REBUILD_NAME_ENDS_WITH);
        }
    }

    public boolean getRebuildNameEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REBUILD_NAME_ENDS_WITH);
    }

    public BackupRestoreExecutionWhereInput rebuildNameGt(String rebuildNameGt) {

        this.rebuildNameGt = rebuildNameGt;
        return this;
    }

    /**
     * Get rebuildNameGt
     *
     * @return rebuildNameGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getRebuildNameGt() {
        return rebuildNameGt;
    }

    public void setRebuildNameGt(String rebuildNameGt) {
        this.rebuildNameGt = rebuildNameGt;
    }

    public BackupRestoreExecutionWhereInput rebuildNameGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REBUILD_NAME_GT);
        return this;
    }

    public BackupRestoreExecutionWhereInput rebuildNameGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REBUILD_NAME_GT);
        return this;
    }

    public void setRebuildNameGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REBUILD_NAME_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REBUILD_NAME_GT);
        }
    }

    public boolean getRebuildNameGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REBUILD_NAME_GT);
    }

    public BackupRestoreExecutionWhereInput rebuildNameGte(String rebuildNameGte) {

        this.rebuildNameGte = rebuildNameGte;
        return this;
    }

    /**
     * Get rebuildNameGte
     *
     * @return rebuildNameGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getRebuildNameGte() {
        return rebuildNameGte;
    }

    public void setRebuildNameGte(String rebuildNameGte) {
        this.rebuildNameGte = rebuildNameGte;
    }

    public BackupRestoreExecutionWhereInput rebuildNameGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REBUILD_NAME_GTE);
        return this;
    }

    public BackupRestoreExecutionWhereInput rebuildNameGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REBUILD_NAME_GTE);
        return this;
    }

    public void setRebuildNameGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REBUILD_NAME_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REBUILD_NAME_GTE);
        }
    }

    public boolean getRebuildNameGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REBUILD_NAME_GTE);
    }

    public BackupRestoreExecutionWhereInput rebuildNameIn(List<String> rebuildNameIn) {

        this.rebuildNameIn = rebuildNameIn;
        return this;
    }

    public BackupRestoreExecutionWhereInput addRebuildNameInItem(String rebuildNameInItem) {
        if (this.rebuildNameIn == null) {
            this.rebuildNameIn = new ArrayList<String>();
        }
        this.rebuildNameIn.add(rebuildNameInItem);
        return this;
    }

    /**
     * Get rebuildNameIn
     *
     * @return rebuildNameIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getRebuildNameIn() {
        return rebuildNameIn;
    }

    public void setRebuildNameIn(List<String> rebuildNameIn) {
        this.rebuildNameIn = rebuildNameIn;
    }

    public BackupRestoreExecutionWhereInput rebuildNameIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REBUILD_NAME_IN);
        return this;
    }

    public BackupRestoreExecutionWhereInput rebuildNameIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REBUILD_NAME_IN);
        return this;
    }

    public void setRebuildNameIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REBUILD_NAME_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REBUILD_NAME_IN);
        }
    }

    public boolean getRebuildNameIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REBUILD_NAME_IN);
    }

    public BackupRestoreExecutionWhereInput rebuildNameLt(String rebuildNameLt) {

        this.rebuildNameLt = rebuildNameLt;
        return this;
    }

    /**
     * Get rebuildNameLt
     *
     * @return rebuildNameLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getRebuildNameLt() {
        return rebuildNameLt;
    }

    public void setRebuildNameLt(String rebuildNameLt) {
        this.rebuildNameLt = rebuildNameLt;
    }

    public BackupRestoreExecutionWhereInput rebuildNameLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REBUILD_NAME_LT);
        return this;
    }

    public BackupRestoreExecutionWhereInput rebuildNameLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REBUILD_NAME_LT);
        return this;
    }

    public void setRebuildNameLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REBUILD_NAME_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REBUILD_NAME_LT);
        }
    }

    public boolean getRebuildNameLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REBUILD_NAME_LT);
    }

    public BackupRestoreExecutionWhereInput rebuildNameLte(String rebuildNameLte) {

        this.rebuildNameLte = rebuildNameLte;
        return this;
    }

    /**
     * Get rebuildNameLte
     *
     * @return rebuildNameLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getRebuildNameLte() {
        return rebuildNameLte;
    }

    public void setRebuildNameLte(String rebuildNameLte) {
        this.rebuildNameLte = rebuildNameLte;
    }

    public BackupRestoreExecutionWhereInput rebuildNameLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REBUILD_NAME_LTE);
        return this;
    }

    public BackupRestoreExecutionWhereInput rebuildNameLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REBUILD_NAME_LTE);
        return this;
    }

    public void setRebuildNameLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REBUILD_NAME_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REBUILD_NAME_LTE);
        }
    }

    public boolean getRebuildNameLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REBUILD_NAME_LTE);
    }

    public BackupRestoreExecutionWhereInput rebuildNameNot(String rebuildNameNot) {

        this.rebuildNameNot = rebuildNameNot;
        return this;
    }

    /**
     * Get rebuildNameNot
     *
     * @return rebuildNameNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getRebuildNameNot() {
        return rebuildNameNot;
    }

    public void setRebuildNameNot(String rebuildNameNot) {
        this.rebuildNameNot = rebuildNameNot;
    }

    public BackupRestoreExecutionWhereInput rebuildNameNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REBUILD_NAME_NOT);
        return this;
    }

    public BackupRestoreExecutionWhereInput rebuildNameNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REBUILD_NAME_NOT);
        return this;
    }

    public void setRebuildNameNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REBUILD_NAME_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REBUILD_NAME_NOT);
        }
    }

    public boolean getRebuildNameNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REBUILD_NAME_NOT);
    }

    public BackupRestoreExecutionWhereInput rebuildNameNotContains(String rebuildNameNotContains) {

        this.rebuildNameNotContains = rebuildNameNotContains;
        return this;
    }

    /**
     * Get rebuildNameNotContains
     *
     * @return rebuildNameNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getRebuildNameNotContains() {
        return rebuildNameNotContains;
    }

    public void setRebuildNameNotContains(String rebuildNameNotContains) {
        this.rebuildNameNotContains = rebuildNameNotContains;
    }

    public BackupRestoreExecutionWhereInput rebuildNameNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REBUILD_NAME_NOT_CONTAINS);
        return this;
    }

    public BackupRestoreExecutionWhereInput rebuildNameNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REBUILD_NAME_NOT_CONTAINS);
        return this;
    }

    public void setRebuildNameNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REBUILD_NAME_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REBUILD_NAME_NOT_CONTAINS);
        }
    }

    public boolean getRebuildNameNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REBUILD_NAME_NOT_CONTAINS);
    }

    public BackupRestoreExecutionWhereInput rebuildNameNotEndsWith(String rebuildNameNotEndsWith) {

        this.rebuildNameNotEndsWith = rebuildNameNotEndsWith;
        return this;
    }

    /**
     * Get rebuildNameNotEndsWith
     *
     * @return rebuildNameNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getRebuildNameNotEndsWith() {
        return rebuildNameNotEndsWith;
    }

    public void setRebuildNameNotEndsWith(String rebuildNameNotEndsWith) {
        this.rebuildNameNotEndsWith = rebuildNameNotEndsWith;
    }

    public BackupRestoreExecutionWhereInput rebuildNameNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REBUILD_NAME_NOT_ENDS_WITH);
        return this;
    }

    public BackupRestoreExecutionWhereInput rebuildNameNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REBUILD_NAME_NOT_ENDS_WITH);
        return this;
    }

    public void setRebuildNameNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REBUILD_NAME_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REBUILD_NAME_NOT_ENDS_WITH);
        }
    }

    public boolean getRebuildNameNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REBUILD_NAME_NOT_ENDS_WITH);
    }

    public BackupRestoreExecutionWhereInput rebuildNameNotIn(List<String> rebuildNameNotIn) {

        this.rebuildNameNotIn = rebuildNameNotIn;
        return this;
    }

    public BackupRestoreExecutionWhereInput addRebuildNameNotInItem(String rebuildNameNotInItem) {
        if (this.rebuildNameNotIn == null) {
            this.rebuildNameNotIn = new ArrayList<String>();
        }
        this.rebuildNameNotIn.add(rebuildNameNotInItem);
        return this;
    }

    /**
     * Get rebuildNameNotIn
     *
     * @return rebuildNameNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getRebuildNameNotIn() {
        return rebuildNameNotIn;
    }

    public void setRebuildNameNotIn(List<String> rebuildNameNotIn) {
        this.rebuildNameNotIn = rebuildNameNotIn;
    }

    public BackupRestoreExecutionWhereInput rebuildNameNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REBUILD_NAME_NOT_IN);
        return this;
    }

    public BackupRestoreExecutionWhereInput rebuildNameNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REBUILD_NAME_NOT_IN);
        return this;
    }

    public void setRebuildNameNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REBUILD_NAME_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REBUILD_NAME_NOT_IN);
        }
    }

    public boolean getRebuildNameNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REBUILD_NAME_NOT_IN);
    }

    public BackupRestoreExecutionWhereInput rebuildNameNotStartsWith(
            String rebuildNameNotStartsWith) {

        this.rebuildNameNotStartsWith = rebuildNameNotStartsWith;
        return this;
    }

    /**
     * Get rebuildNameNotStartsWith
     *
     * @return rebuildNameNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getRebuildNameNotStartsWith() {
        return rebuildNameNotStartsWith;
    }

    public void setRebuildNameNotStartsWith(String rebuildNameNotStartsWith) {
        this.rebuildNameNotStartsWith = rebuildNameNotStartsWith;
    }

    public BackupRestoreExecutionWhereInput rebuildNameNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REBUILD_NAME_NOT_STARTS_WITH);
        return this;
    }

    public BackupRestoreExecutionWhereInput rebuildNameNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REBUILD_NAME_NOT_STARTS_WITH);
        return this;
    }

    public void setRebuildNameNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REBUILD_NAME_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REBUILD_NAME_NOT_STARTS_WITH);
        }
    }

    public boolean getRebuildNameNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REBUILD_NAME_NOT_STARTS_WITH);
    }

    public BackupRestoreExecutionWhereInput rebuildNameStartsWith(String rebuildNameStartsWith) {

        this.rebuildNameStartsWith = rebuildNameStartsWith;
        return this;
    }

    /**
     * Get rebuildNameStartsWith
     *
     * @return rebuildNameStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getRebuildNameStartsWith() {
        return rebuildNameStartsWith;
    }

    public void setRebuildNameStartsWith(String rebuildNameStartsWith) {
        this.rebuildNameStartsWith = rebuildNameStartsWith;
    }

    public BackupRestoreExecutionWhereInput rebuildNameStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REBUILD_NAME_STARTS_WITH);
        return this;
    }

    public BackupRestoreExecutionWhereInput rebuildNameStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REBUILD_NAME_STARTS_WITH);
        return this;
    }

    public void setRebuildNameStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REBUILD_NAME_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REBUILD_NAME_STARTS_WITH);
        }
    }

    public boolean getRebuildNameStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REBUILD_NAME_STARTS_WITH);
    }

    public BackupRestoreExecutionWhereInput rebuildTargetCluster(String rebuildTargetCluster) {

        this.rebuildTargetCluster = rebuildTargetCluster;
        return this;
    }

    /**
     * Get rebuildTargetCluster
     *
     * @return rebuildTargetCluster
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getRebuildTargetCluster() {
        return rebuildTargetCluster;
    }

    public void setRebuildTargetCluster(String rebuildTargetCluster) {
        this.rebuildTargetCluster = rebuildTargetCluster;
    }

    public BackupRestoreExecutionWhereInput rebuildTargetCluster_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REBUILD_TARGET_CLUSTER);
        return this;
    }

    public BackupRestoreExecutionWhereInput rebuildTargetCluster_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REBUILD_TARGET_CLUSTER);
        return this;
    }

    public void setRebuildTargetCluster_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REBUILD_TARGET_CLUSTER);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REBUILD_TARGET_CLUSTER);
        }
    }

    public boolean getRebuildTargetCluster_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REBUILD_TARGET_CLUSTER);
    }

    public BackupRestoreExecutionWhereInput rebuildTargetClusterContains(
            String rebuildTargetClusterContains) {

        this.rebuildTargetClusterContains = rebuildTargetClusterContains;
        return this;
    }

    /**
     * Get rebuildTargetClusterContains
     *
     * @return rebuildTargetClusterContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getRebuildTargetClusterContains() {
        return rebuildTargetClusterContains;
    }

    public void setRebuildTargetClusterContains(String rebuildTargetClusterContains) {
        this.rebuildTargetClusterContains = rebuildTargetClusterContains;
    }

    public BackupRestoreExecutionWhereInput rebuildTargetClusterContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REBUILD_TARGET_CLUSTER_CONTAINS);
        return this;
    }

    public BackupRestoreExecutionWhereInput rebuildTargetClusterContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REBUILD_TARGET_CLUSTER_CONTAINS);
        return this;
    }

    public void setRebuildTargetClusterContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REBUILD_TARGET_CLUSTER_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REBUILD_TARGET_CLUSTER_CONTAINS);
        }
    }

    public boolean getRebuildTargetClusterContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REBUILD_TARGET_CLUSTER_CONTAINS);
    }

    public BackupRestoreExecutionWhereInput rebuildTargetClusterEndsWith(
            String rebuildTargetClusterEndsWith) {

        this.rebuildTargetClusterEndsWith = rebuildTargetClusterEndsWith;
        return this;
    }

    /**
     * Get rebuildTargetClusterEndsWith
     *
     * @return rebuildTargetClusterEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getRebuildTargetClusterEndsWith() {
        return rebuildTargetClusterEndsWith;
    }

    public void setRebuildTargetClusterEndsWith(String rebuildTargetClusterEndsWith) {
        this.rebuildTargetClusterEndsWith = rebuildTargetClusterEndsWith;
    }

    public BackupRestoreExecutionWhereInput rebuildTargetClusterEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REBUILD_TARGET_CLUSTER_ENDS_WITH);
        return this;
    }

    public BackupRestoreExecutionWhereInput rebuildTargetClusterEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REBUILD_TARGET_CLUSTER_ENDS_WITH);
        return this;
    }

    public void setRebuildTargetClusterEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REBUILD_TARGET_CLUSTER_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REBUILD_TARGET_CLUSTER_ENDS_WITH);
        }
    }

    public boolean getRebuildTargetClusterEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REBUILD_TARGET_CLUSTER_ENDS_WITH);
    }

    public BackupRestoreExecutionWhereInput rebuildTargetClusterGt(String rebuildTargetClusterGt) {

        this.rebuildTargetClusterGt = rebuildTargetClusterGt;
        return this;
    }

    /**
     * Get rebuildTargetClusterGt
     *
     * @return rebuildTargetClusterGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getRebuildTargetClusterGt() {
        return rebuildTargetClusterGt;
    }

    public void setRebuildTargetClusterGt(String rebuildTargetClusterGt) {
        this.rebuildTargetClusterGt = rebuildTargetClusterGt;
    }

    public BackupRestoreExecutionWhereInput rebuildTargetClusterGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REBUILD_TARGET_CLUSTER_GT);
        return this;
    }

    public BackupRestoreExecutionWhereInput rebuildTargetClusterGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REBUILD_TARGET_CLUSTER_GT);
        return this;
    }

    public void setRebuildTargetClusterGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REBUILD_TARGET_CLUSTER_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REBUILD_TARGET_CLUSTER_GT);
        }
    }

    public boolean getRebuildTargetClusterGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REBUILD_TARGET_CLUSTER_GT);
    }

    public BackupRestoreExecutionWhereInput rebuildTargetClusterGte(
            String rebuildTargetClusterGte) {

        this.rebuildTargetClusterGte = rebuildTargetClusterGte;
        return this;
    }

    /**
     * Get rebuildTargetClusterGte
     *
     * @return rebuildTargetClusterGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getRebuildTargetClusterGte() {
        return rebuildTargetClusterGte;
    }

    public void setRebuildTargetClusterGte(String rebuildTargetClusterGte) {
        this.rebuildTargetClusterGte = rebuildTargetClusterGte;
    }

    public BackupRestoreExecutionWhereInput rebuildTargetClusterGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REBUILD_TARGET_CLUSTER_GTE);
        return this;
    }

    public BackupRestoreExecutionWhereInput rebuildTargetClusterGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REBUILD_TARGET_CLUSTER_GTE);
        return this;
    }

    public void setRebuildTargetClusterGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REBUILD_TARGET_CLUSTER_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REBUILD_TARGET_CLUSTER_GTE);
        }
    }

    public boolean getRebuildTargetClusterGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REBUILD_TARGET_CLUSTER_GTE);
    }

    public BackupRestoreExecutionWhereInput rebuildTargetClusterIn(
            List<String> rebuildTargetClusterIn) {

        this.rebuildTargetClusterIn = rebuildTargetClusterIn;
        return this;
    }

    public BackupRestoreExecutionWhereInput addRebuildTargetClusterInItem(
            String rebuildTargetClusterInItem) {
        if (this.rebuildTargetClusterIn == null) {
            this.rebuildTargetClusterIn = new ArrayList<String>();
        }
        this.rebuildTargetClusterIn.add(rebuildTargetClusterInItem);
        return this;
    }

    /**
     * Get rebuildTargetClusterIn
     *
     * @return rebuildTargetClusterIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getRebuildTargetClusterIn() {
        return rebuildTargetClusterIn;
    }

    public void setRebuildTargetClusterIn(List<String> rebuildTargetClusterIn) {
        this.rebuildTargetClusterIn = rebuildTargetClusterIn;
    }

    public BackupRestoreExecutionWhereInput rebuildTargetClusterIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REBUILD_TARGET_CLUSTER_IN);
        return this;
    }

    public BackupRestoreExecutionWhereInput rebuildTargetClusterIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REBUILD_TARGET_CLUSTER_IN);
        return this;
    }

    public void setRebuildTargetClusterIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REBUILD_TARGET_CLUSTER_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REBUILD_TARGET_CLUSTER_IN);
        }
    }

    public boolean getRebuildTargetClusterIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REBUILD_TARGET_CLUSTER_IN);
    }

    public BackupRestoreExecutionWhereInput rebuildTargetClusterLt(String rebuildTargetClusterLt) {

        this.rebuildTargetClusterLt = rebuildTargetClusterLt;
        return this;
    }

    /**
     * Get rebuildTargetClusterLt
     *
     * @return rebuildTargetClusterLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getRebuildTargetClusterLt() {
        return rebuildTargetClusterLt;
    }

    public void setRebuildTargetClusterLt(String rebuildTargetClusterLt) {
        this.rebuildTargetClusterLt = rebuildTargetClusterLt;
    }

    public BackupRestoreExecutionWhereInput rebuildTargetClusterLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REBUILD_TARGET_CLUSTER_LT);
        return this;
    }

    public BackupRestoreExecutionWhereInput rebuildTargetClusterLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REBUILD_TARGET_CLUSTER_LT);
        return this;
    }

    public void setRebuildTargetClusterLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REBUILD_TARGET_CLUSTER_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REBUILD_TARGET_CLUSTER_LT);
        }
    }

    public boolean getRebuildTargetClusterLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REBUILD_TARGET_CLUSTER_LT);
    }

    public BackupRestoreExecutionWhereInput rebuildTargetClusterLte(
            String rebuildTargetClusterLte) {

        this.rebuildTargetClusterLte = rebuildTargetClusterLte;
        return this;
    }

    /**
     * Get rebuildTargetClusterLte
     *
     * @return rebuildTargetClusterLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getRebuildTargetClusterLte() {
        return rebuildTargetClusterLte;
    }

    public void setRebuildTargetClusterLte(String rebuildTargetClusterLte) {
        this.rebuildTargetClusterLte = rebuildTargetClusterLte;
    }

    public BackupRestoreExecutionWhereInput rebuildTargetClusterLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REBUILD_TARGET_CLUSTER_LTE);
        return this;
    }

    public BackupRestoreExecutionWhereInput rebuildTargetClusterLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REBUILD_TARGET_CLUSTER_LTE);
        return this;
    }

    public void setRebuildTargetClusterLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REBUILD_TARGET_CLUSTER_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REBUILD_TARGET_CLUSTER_LTE);
        }
    }

    public boolean getRebuildTargetClusterLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REBUILD_TARGET_CLUSTER_LTE);
    }

    public BackupRestoreExecutionWhereInput rebuildTargetClusterNot(
            String rebuildTargetClusterNot) {

        this.rebuildTargetClusterNot = rebuildTargetClusterNot;
        return this;
    }

    /**
     * Get rebuildTargetClusterNot
     *
     * @return rebuildTargetClusterNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getRebuildTargetClusterNot() {
        return rebuildTargetClusterNot;
    }

    public void setRebuildTargetClusterNot(String rebuildTargetClusterNot) {
        this.rebuildTargetClusterNot = rebuildTargetClusterNot;
    }

    public BackupRestoreExecutionWhereInput rebuildTargetClusterNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REBUILD_TARGET_CLUSTER_NOT);
        return this;
    }

    public BackupRestoreExecutionWhereInput rebuildTargetClusterNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REBUILD_TARGET_CLUSTER_NOT);
        return this;
    }

    public void setRebuildTargetClusterNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REBUILD_TARGET_CLUSTER_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REBUILD_TARGET_CLUSTER_NOT);
        }
    }

    public boolean getRebuildTargetClusterNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REBUILD_TARGET_CLUSTER_NOT);
    }

    public BackupRestoreExecutionWhereInput rebuildTargetClusterNotContains(
            String rebuildTargetClusterNotContains) {

        this.rebuildTargetClusterNotContains = rebuildTargetClusterNotContains;
        return this;
    }

    /**
     * Get rebuildTargetClusterNotContains
     *
     * @return rebuildTargetClusterNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getRebuildTargetClusterNotContains() {
        return rebuildTargetClusterNotContains;
    }

    public void setRebuildTargetClusterNotContains(String rebuildTargetClusterNotContains) {
        this.rebuildTargetClusterNotContains = rebuildTargetClusterNotContains;
    }

    public BackupRestoreExecutionWhereInput rebuildTargetClusterNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REBUILD_TARGET_CLUSTER_NOT_CONTAINS);
        return this;
    }

    public BackupRestoreExecutionWhereInput rebuildTargetClusterNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REBUILD_TARGET_CLUSTER_NOT_CONTAINS);
        return this;
    }

    public void setRebuildTargetClusterNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REBUILD_TARGET_CLUSTER_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REBUILD_TARGET_CLUSTER_NOT_CONTAINS);
        }
    }

    public boolean getRebuildTargetClusterNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REBUILD_TARGET_CLUSTER_NOT_CONTAINS);
    }

    public BackupRestoreExecutionWhereInput rebuildTargetClusterNotEndsWith(
            String rebuildTargetClusterNotEndsWith) {

        this.rebuildTargetClusterNotEndsWith = rebuildTargetClusterNotEndsWith;
        return this;
    }

    /**
     * Get rebuildTargetClusterNotEndsWith
     *
     * @return rebuildTargetClusterNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getRebuildTargetClusterNotEndsWith() {
        return rebuildTargetClusterNotEndsWith;
    }

    public void setRebuildTargetClusterNotEndsWith(String rebuildTargetClusterNotEndsWith) {
        this.rebuildTargetClusterNotEndsWith = rebuildTargetClusterNotEndsWith;
    }

    public BackupRestoreExecutionWhereInput rebuildTargetClusterNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REBUILD_TARGET_CLUSTER_NOT_ENDS_WITH);
        return this;
    }

    public BackupRestoreExecutionWhereInput rebuildTargetClusterNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REBUILD_TARGET_CLUSTER_NOT_ENDS_WITH);
        return this;
    }

    public void setRebuildTargetClusterNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REBUILD_TARGET_CLUSTER_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REBUILD_TARGET_CLUSTER_NOT_ENDS_WITH);
        }
    }

    public boolean getRebuildTargetClusterNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REBUILD_TARGET_CLUSTER_NOT_ENDS_WITH);
    }

    public BackupRestoreExecutionWhereInput rebuildTargetClusterNotIn(
            List<String> rebuildTargetClusterNotIn) {

        this.rebuildTargetClusterNotIn = rebuildTargetClusterNotIn;
        return this;
    }

    public BackupRestoreExecutionWhereInput addRebuildTargetClusterNotInItem(
            String rebuildTargetClusterNotInItem) {
        if (this.rebuildTargetClusterNotIn == null) {
            this.rebuildTargetClusterNotIn = new ArrayList<String>();
        }
        this.rebuildTargetClusterNotIn.add(rebuildTargetClusterNotInItem);
        return this;
    }

    /**
     * Get rebuildTargetClusterNotIn
     *
     * @return rebuildTargetClusterNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getRebuildTargetClusterNotIn() {
        return rebuildTargetClusterNotIn;
    }

    public void setRebuildTargetClusterNotIn(List<String> rebuildTargetClusterNotIn) {
        this.rebuildTargetClusterNotIn = rebuildTargetClusterNotIn;
    }

    public BackupRestoreExecutionWhereInput rebuildTargetClusterNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REBUILD_TARGET_CLUSTER_NOT_IN);
        return this;
    }

    public BackupRestoreExecutionWhereInput rebuildTargetClusterNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REBUILD_TARGET_CLUSTER_NOT_IN);
        return this;
    }

    public void setRebuildTargetClusterNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REBUILD_TARGET_CLUSTER_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REBUILD_TARGET_CLUSTER_NOT_IN);
        }
    }

    public boolean getRebuildTargetClusterNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REBUILD_TARGET_CLUSTER_NOT_IN);
    }

    public BackupRestoreExecutionWhereInput rebuildTargetClusterNotStartsWith(
            String rebuildTargetClusterNotStartsWith) {

        this.rebuildTargetClusterNotStartsWith = rebuildTargetClusterNotStartsWith;
        return this;
    }

    /**
     * Get rebuildTargetClusterNotStartsWith
     *
     * @return rebuildTargetClusterNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getRebuildTargetClusterNotStartsWith() {
        return rebuildTargetClusterNotStartsWith;
    }

    public void setRebuildTargetClusterNotStartsWith(String rebuildTargetClusterNotStartsWith) {
        this.rebuildTargetClusterNotStartsWith = rebuildTargetClusterNotStartsWith;
    }

    public BackupRestoreExecutionWhereInput rebuildTargetClusterNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REBUILD_TARGET_CLUSTER_NOT_STARTS_WITH);
        return this;
    }

    public BackupRestoreExecutionWhereInput rebuildTargetClusterNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REBUILD_TARGET_CLUSTER_NOT_STARTS_WITH);
        return this;
    }

    public void setRebuildTargetClusterNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REBUILD_TARGET_CLUSTER_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REBUILD_TARGET_CLUSTER_NOT_STARTS_WITH);
        }
    }

    public boolean getRebuildTargetClusterNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REBUILD_TARGET_CLUSTER_NOT_STARTS_WITH);
    }

    public BackupRestoreExecutionWhereInput rebuildTargetClusterStartsWith(
            String rebuildTargetClusterStartsWith) {

        this.rebuildTargetClusterStartsWith = rebuildTargetClusterStartsWith;
        return this;
    }

    /**
     * Get rebuildTargetClusterStartsWith
     *
     * @return rebuildTargetClusterStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getRebuildTargetClusterStartsWith() {
        return rebuildTargetClusterStartsWith;
    }

    public void setRebuildTargetClusterStartsWith(String rebuildTargetClusterStartsWith) {
        this.rebuildTargetClusterStartsWith = rebuildTargetClusterStartsWith;
    }

    public BackupRestoreExecutionWhereInput rebuildTargetClusterStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REBUILD_TARGET_CLUSTER_STARTS_WITH);
        return this;
    }

    public BackupRestoreExecutionWhereInput rebuildTargetClusterStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REBUILD_TARGET_CLUSTER_STARTS_WITH);
        return this;
    }

    public void setRebuildTargetClusterStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REBUILD_TARGET_CLUSTER_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REBUILD_TARGET_CLUSTER_STARTS_WITH);
        }
    }

    public boolean getRebuildTargetClusterStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REBUILD_TARGET_CLUSTER_STARTS_WITH);
    }

    public BackupRestoreExecutionWhereInput retryTimes(Integer retryTimes) {

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

    public BackupRestoreExecutionWhereInput retryTimes_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RETRY_TIMES);
        return this;
    }

    public BackupRestoreExecutionWhereInput retryTimes_ExplictlyNonNull() {
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

    public BackupRestoreExecutionWhereInput retryTimesGt(Integer retryTimesGt) {

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

    public BackupRestoreExecutionWhereInput retryTimesGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RETRY_TIMES_GT);
        return this;
    }

    public BackupRestoreExecutionWhereInput retryTimesGt_ExplictlyNonNull() {
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

    public BackupRestoreExecutionWhereInput retryTimesGte(Integer retryTimesGte) {

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

    public BackupRestoreExecutionWhereInput retryTimesGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RETRY_TIMES_GTE);
        return this;
    }

    public BackupRestoreExecutionWhereInput retryTimesGte_ExplictlyNonNull() {
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

    public BackupRestoreExecutionWhereInput retryTimesIn(List<Integer> retryTimesIn) {

        this.retryTimesIn = retryTimesIn;
        return this;
    }

    public BackupRestoreExecutionWhereInput addRetryTimesInItem(Integer retryTimesInItem) {
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

    public BackupRestoreExecutionWhereInput retryTimesIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RETRY_TIMES_IN);
        return this;
    }

    public BackupRestoreExecutionWhereInput retryTimesIn_ExplictlyNonNull() {
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

    public BackupRestoreExecutionWhereInput retryTimesLt(Integer retryTimesLt) {

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

    public BackupRestoreExecutionWhereInput retryTimesLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RETRY_TIMES_LT);
        return this;
    }

    public BackupRestoreExecutionWhereInput retryTimesLt_ExplictlyNonNull() {
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

    public BackupRestoreExecutionWhereInput retryTimesLte(Integer retryTimesLte) {

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

    public BackupRestoreExecutionWhereInput retryTimesLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RETRY_TIMES_LTE);
        return this;
    }

    public BackupRestoreExecutionWhereInput retryTimesLte_ExplictlyNonNull() {
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

    public BackupRestoreExecutionWhereInput retryTimesNot(Integer retryTimesNot) {

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

    public BackupRestoreExecutionWhereInput retryTimesNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RETRY_TIMES_NOT);
        return this;
    }

    public BackupRestoreExecutionWhereInput retryTimesNot_ExplictlyNonNull() {
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

    public BackupRestoreExecutionWhereInput retryTimesNotIn(List<Integer> retryTimesNotIn) {

        this.retryTimesNotIn = retryTimesNotIn;
        return this;
    }

    public BackupRestoreExecutionWhereInput addRetryTimesNotInItem(Integer retryTimesNotInItem) {
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

    public BackupRestoreExecutionWhereInput retryTimesNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RETRY_TIMES_NOT_IN);
        return this;
    }

    public BackupRestoreExecutionWhereInput retryTimesNotIn_ExplictlyNonNull() {
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

    public BackupRestoreExecutionWhereInput startupAfterRestore(Boolean startupAfterRestore) {

        this.startupAfterRestore = startupAfterRestore;
        return this;
    }

    /**
     * Get startupAfterRestore
     *
     * @return startupAfterRestore
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getStartupAfterRestore() {
        return startupAfterRestore;
    }

    public void setStartupAfterRestore(Boolean startupAfterRestore) {
        this.startupAfterRestore = startupAfterRestore;
    }

    public BackupRestoreExecutionWhereInput startupAfterRestore_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STARTUP_AFTER_RESTORE);
        return this;
    }

    public BackupRestoreExecutionWhereInput startupAfterRestore_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STARTUP_AFTER_RESTORE);
        return this;
    }

    public void setStartupAfterRestore_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STARTUP_AFTER_RESTORE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STARTUP_AFTER_RESTORE);
        }
    }

    public boolean getStartupAfterRestore_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STARTUP_AFTER_RESTORE);
    }

    public BackupRestoreExecutionWhereInput startupAfterRestoreNot(Boolean startupAfterRestoreNot) {

        this.startupAfterRestoreNot = startupAfterRestoreNot;
        return this;
    }

    /**
     * Get startupAfterRestoreNot
     *
     * @return startupAfterRestoreNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getStartupAfterRestoreNot() {
        return startupAfterRestoreNot;
    }

    public void setStartupAfterRestoreNot(Boolean startupAfterRestoreNot) {
        this.startupAfterRestoreNot = startupAfterRestoreNot;
    }

    public BackupRestoreExecutionWhereInput startupAfterRestoreNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STARTUP_AFTER_RESTORE_NOT);
        return this;
    }

    public BackupRestoreExecutionWhereInput startupAfterRestoreNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STARTUP_AFTER_RESTORE_NOT);
        return this;
    }

    public void setStartupAfterRestoreNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STARTUP_AFTER_RESTORE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STARTUP_AFTER_RESTORE_NOT);
        }
    }

    public boolean getStartupAfterRestoreNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STARTUP_AFTER_RESTORE_NOT);
    }

    public BackupRestoreExecutionWhereInput status(BackupExecutionStatus status) {

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

    public BackupRestoreExecutionWhereInput status_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATUS);
        return this;
    }

    public BackupRestoreExecutionWhereInput status_ExplictlyNonNull() {
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

    public BackupRestoreExecutionWhereInput statusIn(List<BackupExecutionStatus> statusIn) {

        this.statusIn = statusIn;
        return this;
    }

    public BackupRestoreExecutionWhereInput addStatusInItem(BackupExecutionStatus statusInItem) {
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

    public BackupRestoreExecutionWhereInput statusIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATUS_IN);
        return this;
    }

    public BackupRestoreExecutionWhereInput statusIn_ExplictlyNonNull() {
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

    public BackupRestoreExecutionWhereInput statusNot(BackupExecutionStatus statusNot) {

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

    public BackupRestoreExecutionWhereInput statusNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATUS_NOT);
        return this;
    }

    public BackupRestoreExecutionWhereInput statusNot_ExplictlyNonNull() {
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

    public BackupRestoreExecutionWhereInput statusNotIn(List<BackupExecutionStatus> statusNotIn) {

        this.statusNotIn = statusNotIn;
        return this;
    }

    public BackupRestoreExecutionWhereInput addStatusNotInItem(
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

    public BackupRestoreExecutionWhereInput statusNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATUS_NOT_IN);
        return this;
    }

    public BackupRestoreExecutionWhereInput statusNotIn_ExplictlyNonNull() {
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

    public BackupRestoreExecutionWhereInput totalBytes(Long totalBytes) {

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

    public BackupRestoreExecutionWhereInput totalBytes_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_BYTES);
        return this;
    }

    public BackupRestoreExecutionWhereInput totalBytes_ExplictlyNonNull() {
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

    public BackupRestoreExecutionWhereInput totalBytesGt(Long totalBytesGt) {

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

    public BackupRestoreExecutionWhereInput totalBytesGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_BYTES_GT);
        return this;
    }

    public BackupRestoreExecutionWhereInput totalBytesGt_ExplictlyNonNull() {
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

    public BackupRestoreExecutionWhereInput totalBytesGte(Long totalBytesGte) {

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

    public BackupRestoreExecutionWhereInput totalBytesGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_BYTES_GTE);
        return this;
    }

    public BackupRestoreExecutionWhereInput totalBytesGte_ExplictlyNonNull() {
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

    public BackupRestoreExecutionWhereInput totalBytesIn(List<Long> totalBytesIn) {

        this.totalBytesIn = totalBytesIn;
        return this;
    }

    public BackupRestoreExecutionWhereInput addTotalBytesInItem(Long totalBytesInItem) {
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

    public BackupRestoreExecutionWhereInput totalBytesIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_BYTES_IN);
        return this;
    }

    public BackupRestoreExecutionWhereInput totalBytesIn_ExplictlyNonNull() {
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

    public BackupRestoreExecutionWhereInput totalBytesLt(Long totalBytesLt) {

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

    public BackupRestoreExecutionWhereInput totalBytesLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_BYTES_LT);
        return this;
    }

    public BackupRestoreExecutionWhereInput totalBytesLt_ExplictlyNonNull() {
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

    public BackupRestoreExecutionWhereInput totalBytesLte(Long totalBytesLte) {

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

    public BackupRestoreExecutionWhereInput totalBytesLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_BYTES_LTE);
        return this;
    }

    public BackupRestoreExecutionWhereInput totalBytesLte_ExplictlyNonNull() {
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

    public BackupRestoreExecutionWhereInput totalBytesNot(Long totalBytesNot) {

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

    public BackupRestoreExecutionWhereInput totalBytesNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_BYTES_NOT);
        return this;
    }

    public BackupRestoreExecutionWhereInput totalBytesNot_ExplictlyNonNull() {
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

    public BackupRestoreExecutionWhereInput totalBytesNotIn(List<Long> totalBytesNotIn) {

        this.totalBytesNotIn = totalBytesNotIn;
        return this;
    }

    public BackupRestoreExecutionWhereInput addTotalBytesNotInItem(Long totalBytesNotInItem) {
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

    public BackupRestoreExecutionWhereInput totalBytesNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_BYTES_NOT_IN);
        return this;
    }

    public BackupRestoreExecutionWhereInput totalBytesNotIn_ExplictlyNonNull() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BackupRestoreExecutionWhereInput backupRestoreExecutionWhereInput =
                (BackupRestoreExecutionWhereInput) o;
        return Objects.equals(this.AND, backupRestoreExecutionWhereInput.AND)
                && Objects.equals(this.NOT, backupRestoreExecutionWhereInput.NOT)
                && Objects.equals(this.OR, backupRestoreExecutionWhereInput.OR)
                && Objects.equals(
                        this.backupRestorePoint,
                        backupRestoreExecutionWhereInput.backupRestorePoint)
                && Objects.equals(this.duration, backupRestoreExecutionWhereInput.duration)
                && Objects.equals(this.durationGt, backupRestoreExecutionWhereInput.durationGt)
                && Objects.equals(this.durationGte, backupRestoreExecutionWhereInput.durationGte)
                && Objects.equals(this.durationIn, backupRestoreExecutionWhereInput.durationIn)
                && Objects.equals(this.durationLt, backupRestoreExecutionWhereInput.durationLt)
                && Objects.equals(this.durationLte, backupRestoreExecutionWhereInput.durationLte)
                && Objects.equals(this.durationNot, backupRestoreExecutionWhereInput.durationNot)
                && Objects.equals(
                        this.durationNotIn, backupRestoreExecutionWhereInput.durationNotIn)
                && Objects.equals(
                        this.entityAsyncStatus, backupRestoreExecutionWhereInput.entityAsyncStatus)
                && Objects.equals(
                        this.entityAsyncStatusIn,
                        backupRestoreExecutionWhereInput.entityAsyncStatusIn)
                && Objects.equals(
                        this.entityAsyncStatusNot,
                        backupRestoreExecutionWhereInput.entityAsyncStatusNot)
                && Objects.equals(
                        this.entityAsyncStatusNotIn,
                        backupRestoreExecutionWhereInput.entityAsyncStatusNotIn)
                && Objects.equals(this.executedAt, backupRestoreExecutionWhereInput.executedAt)
                && Objects.equals(this.executedAtGt, backupRestoreExecutionWhereInput.executedAtGt)
                && Objects.equals(
                        this.executedAtGte, backupRestoreExecutionWhereInput.executedAtGte)
                && Objects.equals(this.executedAtIn, backupRestoreExecutionWhereInput.executedAtIn)
                && Objects.equals(this.executedAtLt, backupRestoreExecutionWhereInput.executedAtLt)
                && Objects.equals(
                        this.executedAtLte, backupRestoreExecutionWhereInput.executedAtLte)
                && Objects.equals(
                        this.executedAtNot, backupRestoreExecutionWhereInput.executedAtNot)
                && Objects.equals(
                        this.executedAtNotIn, backupRestoreExecutionWhereInput.executedAtNotIn)
                && Objects.equals(this.id, backupRestoreExecutionWhereInput.id)
                && Objects.equals(this.idContains, backupRestoreExecutionWhereInput.idContains)
                && Objects.equals(this.idEndsWith, backupRestoreExecutionWhereInput.idEndsWith)
                && Objects.equals(this.idGt, backupRestoreExecutionWhereInput.idGt)
                && Objects.equals(this.idGte, backupRestoreExecutionWhereInput.idGte)
                && Objects.equals(this.idIn, backupRestoreExecutionWhereInput.idIn)
                && Objects.equals(this.idLt, backupRestoreExecutionWhereInput.idLt)
                && Objects.equals(this.idLte, backupRestoreExecutionWhereInput.idLte)
                && Objects.equals(this.idNot, backupRestoreExecutionWhereInput.idNot)
                && Objects.equals(
                        this.idNotContains, backupRestoreExecutionWhereInput.idNotContains)
                && Objects.equals(
                        this.idNotEndsWith, backupRestoreExecutionWhereInput.idNotEndsWith)
                && Objects.equals(this.idNotIn, backupRestoreExecutionWhereInput.idNotIn)
                && Objects.equals(
                        this.idNotStartsWith, backupRestoreExecutionWhereInput.idNotStartsWith)
                && Objects.equals(this.idStartsWith, backupRestoreExecutionWhereInput.idStartsWith)
                && Objects.equals(this.mode, backupRestoreExecutionWhereInput.mode)
                && Objects.equals(this.modeIn, backupRestoreExecutionWhereInput.modeIn)
                && Objects.equals(this.modeNot, backupRestoreExecutionWhereInput.modeNot)
                && Objects.equals(this.modeNotIn, backupRestoreExecutionWhereInput.modeNotIn)
                && Objects.equals(this.name, backupRestoreExecutionWhereInput.name)
                && Objects.equals(this.nameContains, backupRestoreExecutionWhereInput.nameContains)
                && Objects.equals(this.nameEndsWith, backupRestoreExecutionWhereInput.nameEndsWith)
                && Objects.equals(this.nameGt, backupRestoreExecutionWhereInput.nameGt)
                && Objects.equals(this.nameGte, backupRestoreExecutionWhereInput.nameGte)
                && Objects.equals(this.nameIn, backupRestoreExecutionWhereInput.nameIn)
                && Objects.equals(this.nameLt, backupRestoreExecutionWhereInput.nameLt)
                && Objects.equals(this.nameLte, backupRestoreExecutionWhereInput.nameLte)
                && Objects.equals(this.nameNot, backupRestoreExecutionWhereInput.nameNot)
                && Objects.equals(
                        this.nameNotContains, backupRestoreExecutionWhereInput.nameNotContains)
                && Objects.equals(
                        this.nameNotEndsWith, backupRestoreExecutionWhereInput.nameNotEndsWith)
                && Objects.equals(this.nameNotIn, backupRestoreExecutionWhereInput.nameNotIn)
                && Objects.equals(
                        this.nameNotStartsWith, backupRestoreExecutionWhereInput.nameNotStartsWith)
                && Objects.equals(
                        this.nameStartsWith, backupRestoreExecutionWhereInput.nameStartsWith)
                && Objects.equals(this.readBytes, backupRestoreExecutionWhereInput.readBytes)
                && Objects.equals(this.readBytesGt, backupRestoreExecutionWhereInput.readBytesGt)
                && Objects.equals(this.readBytesGte, backupRestoreExecutionWhereInput.readBytesGte)
                && Objects.equals(this.readBytesIn, backupRestoreExecutionWhereInput.readBytesIn)
                && Objects.equals(this.readBytesLt, backupRestoreExecutionWhereInput.readBytesLt)
                && Objects.equals(this.readBytesLte, backupRestoreExecutionWhereInput.readBytesLte)
                && Objects.equals(this.readBytesNot, backupRestoreExecutionWhereInput.readBytesNot)
                && Objects.equals(
                        this.readBytesNotIn, backupRestoreExecutionWhereInput.readBytesNotIn)
                && Objects.equals(this.rebuildName, backupRestoreExecutionWhereInput.rebuildName)
                && Objects.equals(
                        this.rebuildNameContains,
                        backupRestoreExecutionWhereInput.rebuildNameContains)
                && Objects.equals(
                        this.rebuildNameEndsWith,
                        backupRestoreExecutionWhereInput.rebuildNameEndsWith)
                && Objects.equals(
                        this.rebuildNameGt, backupRestoreExecutionWhereInput.rebuildNameGt)
                && Objects.equals(
                        this.rebuildNameGte, backupRestoreExecutionWhereInput.rebuildNameGte)
                && Objects.equals(
                        this.rebuildNameIn, backupRestoreExecutionWhereInput.rebuildNameIn)
                && Objects.equals(
                        this.rebuildNameLt, backupRestoreExecutionWhereInput.rebuildNameLt)
                && Objects.equals(
                        this.rebuildNameLte, backupRestoreExecutionWhereInput.rebuildNameLte)
                && Objects.equals(
                        this.rebuildNameNot, backupRestoreExecutionWhereInput.rebuildNameNot)
                && Objects.equals(
                        this.rebuildNameNotContains,
                        backupRestoreExecutionWhereInput.rebuildNameNotContains)
                && Objects.equals(
                        this.rebuildNameNotEndsWith,
                        backupRestoreExecutionWhereInput.rebuildNameNotEndsWith)
                && Objects.equals(
                        this.rebuildNameNotIn, backupRestoreExecutionWhereInput.rebuildNameNotIn)
                && Objects.equals(
                        this.rebuildNameNotStartsWith,
                        backupRestoreExecutionWhereInput.rebuildNameNotStartsWith)
                && Objects.equals(
                        this.rebuildNameStartsWith,
                        backupRestoreExecutionWhereInput.rebuildNameStartsWith)
                && Objects.equals(
                        this.rebuildTargetCluster,
                        backupRestoreExecutionWhereInput.rebuildTargetCluster)
                && Objects.equals(
                        this.rebuildTargetClusterContains,
                        backupRestoreExecutionWhereInput.rebuildTargetClusterContains)
                && Objects.equals(
                        this.rebuildTargetClusterEndsWith,
                        backupRestoreExecutionWhereInput.rebuildTargetClusterEndsWith)
                && Objects.equals(
                        this.rebuildTargetClusterGt,
                        backupRestoreExecutionWhereInput.rebuildTargetClusterGt)
                && Objects.equals(
                        this.rebuildTargetClusterGte,
                        backupRestoreExecutionWhereInput.rebuildTargetClusterGte)
                && Objects.equals(
                        this.rebuildTargetClusterIn,
                        backupRestoreExecutionWhereInput.rebuildTargetClusterIn)
                && Objects.equals(
                        this.rebuildTargetClusterLt,
                        backupRestoreExecutionWhereInput.rebuildTargetClusterLt)
                && Objects.equals(
                        this.rebuildTargetClusterLte,
                        backupRestoreExecutionWhereInput.rebuildTargetClusterLte)
                && Objects.equals(
                        this.rebuildTargetClusterNot,
                        backupRestoreExecutionWhereInput.rebuildTargetClusterNot)
                && Objects.equals(
                        this.rebuildTargetClusterNotContains,
                        backupRestoreExecutionWhereInput.rebuildTargetClusterNotContains)
                && Objects.equals(
                        this.rebuildTargetClusterNotEndsWith,
                        backupRestoreExecutionWhereInput.rebuildTargetClusterNotEndsWith)
                && Objects.equals(
                        this.rebuildTargetClusterNotIn,
                        backupRestoreExecutionWhereInput.rebuildTargetClusterNotIn)
                && Objects.equals(
                        this.rebuildTargetClusterNotStartsWith,
                        backupRestoreExecutionWhereInput.rebuildTargetClusterNotStartsWith)
                && Objects.equals(
                        this.rebuildTargetClusterStartsWith,
                        backupRestoreExecutionWhereInput.rebuildTargetClusterStartsWith)
                && Objects.equals(this.retryTimes, backupRestoreExecutionWhereInput.retryTimes)
                && Objects.equals(this.retryTimesGt, backupRestoreExecutionWhereInput.retryTimesGt)
                && Objects.equals(
                        this.retryTimesGte, backupRestoreExecutionWhereInput.retryTimesGte)
                && Objects.equals(this.retryTimesIn, backupRestoreExecutionWhereInput.retryTimesIn)
                && Objects.equals(this.retryTimesLt, backupRestoreExecutionWhereInput.retryTimesLt)
                && Objects.equals(
                        this.retryTimesLte, backupRestoreExecutionWhereInput.retryTimesLte)
                && Objects.equals(
                        this.retryTimesNot, backupRestoreExecutionWhereInput.retryTimesNot)
                && Objects.equals(
                        this.retryTimesNotIn, backupRestoreExecutionWhereInput.retryTimesNotIn)
                && Objects.equals(
                        this.startupAfterRestore,
                        backupRestoreExecutionWhereInput.startupAfterRestore)
                && Objects.equals(
                        this.startupAfterRestoreNot,
                        backupRestoreExecutionWhereInput.startupAfterRestoreNot)
                && Objects.equals(this.status, backupRestoreExecutionWhereInput.status)
                && Objects.equals(this.statusIn, backupRestoreExecutionWhereInput.statusIn)
                && Objects.equals(this.statusNot, backupRestoreExecutionWhereInput.statusNot)
                && Objects.equals(this.statusNotIn, backupRestoreExecutionWhereInput.statusNotIn)
                && Objects.equals(this.totalBytes, backupRestoreExecutionWhereInput.totalBytes)
                && Objects.equals(this.totalBytesGt, backupRestoreExecutionWhereInput.totalBytesGt)
                && Objects.equals(
                        this.totalBytesGte, backupRestoreExecutionWhereInput.totalBytesGte)
                && Objects.equals(this.totalBytesIn, backupRestoreExecutionWhereInput.totalBytesIn)
                && Objects.equals(this.totalBytesLt, backupRestoreExecutionWhereInput.totalBytesLt)
                && Objects.equals(
                        this.totalBytesLte, backupRestoreExecutionWhereInput.totalBytesLte)
                && Objects.equals(
                        this.totalBytesNot, backupRestoreExecutionWhereInput.totalBytesNot)
                && Objects.equals(
                        this.totalBytesNotIn, backupRestoreExecutionWhereInput.totalBytesNotIn);
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
                backupRestorePoint,
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
                mode,
                modeIn,
                modeNot,
                modeNotIn,
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
                readBytes,
                readBytesGt,
                readBytesGte,
                readBytesIn,
                readBytesLt,
                readBytesLte,
                readBytesNot,
                readBytesNotIn,
                rebuildName,
                rebuildNameContains,
                rebuildNameEndsWith,
                rebuildNameGt,
                rebuildNameGte,
                rebuildNameIn,
                rebuildNameLt,
                rebuildNameLte,
                rebuildNameNot,
                rebuildNameNotContains,
                rebuildNameNotEndsWith,
                rebuildNameNotIn,
                rebuildNameNotStartsWith,
                rebuildNameStartsWith,
                rebuildTargetCluster,
                rebuildTargetClusterContains,
                rebuildTargetClusterEndsWith,
                rebuildTargetClusterGt,
                rebuildTargetClusterGte,
                rebuildTargetClusterIn,
                rebuildTargetClusterLt,
                rebuildTargetClusterLte,
                rebuildTargetClusterNot,
                rebuildTargetClusterNotContains,
                rebuildTargetClusterNotEndsWith,
                rebuildTargetClusterNotIn,
                rebuildTargetClusterNotStartsWith,
                rebuildTargetClusterStartsWith,
                retryTimes,
                retryTimesGt,
                retryTimesGte,
                retryTimesIn,
                retryTimesLt,
                retryTimesLte,
                retryTimesNot,
                retryTimesNotIn,
                startupAfterRestore,
                startupAfterRestoreNot,
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
                totalBytesNotIn);
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
        sb.append("class BackupRestoreExecutionWhereInput {\n");
        sb.append("    AND: ").append(toIndentedString(AND)).append("\n");
        sb.append("    NOT: ").append(toIndentedString(NOT)).append("\n");
        sb.append("    OR: ").append(toIndentedString(OR)).append("\n");
        sb.append("    backupRestorePoint: ")
                .append(toIndentedString(backupRestorePoint))
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
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
        sb.append("    modeIn: ").append(toIndentedString(modeIn)).append("\n");
        sb.append("    modeNot: ").append(toIndentedString(modeNot)).append("\n");
        sb.append("    modeNotIn: ").append(toIndentedString(modeNotIn)).append("\n");
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
        sb.append("    readBytes: ").append(toIndentedString(readBytes)).append("\n");
        sb.append("    readBytesGt: ").append(toIndentedString(readBytesGt)).append("\n");
        sb.append("    readBytesGte: ").append(toIndentedString(readBytesGte)).append("\n");
        sb.append("    readBytesIn: ").append(toIndentedString(readBytesIn)).append("\n");
        sb.append("    readBytesLt: ").append(toIndentedString(readBytesLt)).append("\n");
        sb.append("    readBytesLte: ").append(toIndentedString(readBytesLte)).append("\n");
        sb.append("    readBytesNot: ").append(toIndentedString(readBytesNot)).append("\n");
        sb.append("    readBytesNotIn: ").append(toIndentedString(readBytesNotIn)).append("\n");
        sb.append("    rebuildName: ").append(toIndentedString(rebuildName)).append("\n");
        sb.append("    rebuildNameContains: ")
                .append(toIndentedString(rebuildNameContains))
                .append("\n");
        sb.append("    rebuildNameEndsWith: ")
                .append(toIndentedString(rebuildNameEndsWith))
                .append("\n");
        sb.append("    rebuildNameGt: ").append(toIndentedString(rebuildNameGt)).append("\n");
        sb.append("    rebuildNameGte: ").append(toIndentedString(rebuildNameGte)).append("\n");
        sb.append("    rebuildNameIn: ").append(toIndentedString(rebuildNameIn)).append("\n");
        sb.append("    rebuildNameLt: ").append(toIndentedString(rebuildNameLt)).append("\n");
        sb.append("    rebuildNameLte: ").append(toIndentedString(rebuildNameLte)).append("\n");
        sb.append("    rebuildNameNot: ").append(toIndentedString(rebuildNameNot)).append("\n");
        sb.append("    rebuildNameNotContains: ")
                .append(toIndentedString(rebuildNameNotContains))
                .append("\n");
        sb.append("    rebuildNameNotEndsWith: ")
                .append(toIndentedString(rebuildNameNotEndsWith))
                .append("\n");
        sb.append("    rebuildNameNotIn: ").append(toIndentedString(rebuildNameNotIn)).append("\n");
        sb.append("    rebuildNameNotStartsWith: ")
                .append(toIndentedString(rebuildNameNotStartsWith))
                .append("\n");
        sb.append("    rebuildNameStartsWith: ")
                .append(toIndentedString(rebuildNameStartsWith))
                .append("\n");
        sb.append("    rebuildTargetCluster: ")
                .append(toIndentedString(rebuildTargetCluster))
                .append("\n");
        sb.append("    rebuildTargetClusterContains: ")
                .append(toIndentedString(rebuildTargetClusterContains))
                .append("\n");
        sb.append("    rebuildTargetClusterEndsWith: ")
                .append(toIndentedString(rebuildTargetClusterEndsWith))
                .append("\n");
        sb.append("    rebuildTargetClusterGt: ")
                .append(toIndentedString(rebuildTargetClusterGt))
                .append("\n");
        sb.append("    rebuildTargetClusterGte: ")
                .append(toIndentedString(rebuildTargetClusterGte))
                .append("\n");
        sb.append("    rebuildTargetClusterIn: ")
                .append(toIndentedString(rebuildTargetClusterIn))
                .append("\n");
        sb.append("    rebuildTargetClusterLt: ")
                .append(toIndentedString(rebuildTargetClusterLt))
                .append("\n");
        sb.append("    rebuildTargetClusterLte: ")
                .append(toIndentedString(rebuildTargetClusterLte))
                .append("\n");
        sb.append("    rebuildTargetClusterNot: ")
                .append(toIndentedString(rebuildTargetClusterNot))
                .append("\n");
        sb.append("    rebuildTargetClusterNotContains: ")
                .append(toIndentedString(rebuildTargetClusterNotContains))
                .append("\n");
        sb.append("    rebuildTargetClusterNotEndsWith: ")
                .append(toIndentedString(rebuildTargetClusterNotEndsWith))
                .append("\n");
        sb.append("    rebuildTargetClusterNotIn: ")
                .append(toIndentedString(rebuildTargetClusterNotIn))
                .append("\n");
        sb.append("    rebuildTargetClusterNotStartsWith: ")
                .append(toIndentedString(rebuildTargetClusterNotStartsWith))
                .append("\n");
        sb.append("    rebuildTargetClusterStartsWith: ")
                .append(toIndentedString(rebuildTargetClusterStartsWith))
                .append("\n");
        sb.append("    retryTimes: ").append(toIndentedString(retryTimes)).append("\n");
        sb.append("    retryTimesGt: ").append(toIndentedString(retryTimesGt)).append("\n");
        sb.append("    retryTimesGte: ").append(toIndentedString(retryTimesGte)).append("\n");
        sb.append("    retryTimesIn: ").append(toIndentedString(retryTimesIn)).append("\n");
        sb.append("    retryTimesLt: ").append(toIndentedString(retryTimesLt)).append("\n");
        sb.append("    retryTimesLte: ").append(toIndentedString(retryTimesLte)).append("\n");
        sb.append("    retryTimesNot: ").append(toIndentedString(retryTimesNot)).append("\n");
        sb.append("    retryTimesNotIn: ").append(toIndentedString(retryTimesNotIn)).append("\n");
        sb.append("    startupAfterRestore: ")
                .append(toIndentedString(startupAfterRestore))
                .append("\n");
        sb.append("    startupAfterRestoreNot: ")
                .append(toIndentedString(startupAfterRestoreNot))
                .append("\n");
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

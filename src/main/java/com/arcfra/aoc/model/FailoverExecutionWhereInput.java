package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** FailoverExecutionWhereInput */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class FailoverExecutionWhereInput
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_A_N_D = "AND";

    @SerializedName(SERIALIZED_NAME_A_N_D)
    private List<FailoverExecutionWhereInput> AND = null;

    public static final String SERIALIZED_NAME_N_O_T = "NOT";

    @SerializedName(SERIALIZED_NAME_N_O_T)
    private List<FailoverExecutionWhereInput> NOT = null;

    public static final String SERIALIZED_NAME_O_R = "OR";

    @SerializedName(SERIALIZED_NAME_O_R)
    private List<FailoverExecutionWhereInput> OR = null;

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

    public static final String SERIALIZED_NAME_IS_SYNC_REPLICATION = "is_sync_replication";

    @SerializedName(SERIALIZED_NAME_IS_SYNC_REPLICATION)
    private Boolean isSyncReplication;

    public static final String SERIALIZED_NAME_IS_SYNC_REPLICATION_NOT = "is_sync_replication_not";

    @SerializedName(SERIALIZED_NAME_IS_SYNC_REPLICATION_NOT)
    private Boolean isSyncReplicationNot;

    public static final String SERIALIZED_NAME_IS_TEST_MODE = "is_test_mode";

    @SerializedName(SERIALIZED_NAME_IS_TEST_MODE)
    private Boolean isTestMode;

    public static final String SERIALIZED_NAME_IS_TEST_MODE_NOT = "is_test_mode_not";

    @SerializedName(SERIALIZED_NAME_IS_TEST_MODE_NOT)
    private Boolean isTestModeNot;

    public static final String SERIALIZED_NAME_REPLICATION_FAILOVER_TARGET_EXECUTIONS_EVERY =
            "replication_failover_target_executions_every";

    @SerializedName(SERIALIZED_NAME_REPLICATION_FAILOVER_TARGET_EXECUTIONS_EVERY)
    private ReplicationFailoverTargetExecutionWhereInput replicationFailoverTargetExecutionsEvery;

    public static final String SERIALIZED_NAME_REPLICATION_FAILOVER_TARGET_EXECUTIONS_NONE =
            "replication_failover_target_executions_none";

    @SerializedName(SERIALIZED_NAME_REPLICATION_FAILOVER_TARGET_EXECUTIONS_NONE)
    private ReplicationFailoverTargetExecutionWhereInput replicationFailoverTargetExecutionsNone;

    public static final String SERIALIZED_NAME_REPLICATION_FAILOVER_TARGET_EXECUTIONS_SOME =
            "replication_failover_target_executions_some";

    @SerializedName(SERIALIZED_NAME_REPLICATION_FAILOVER_TARGET_EXECUTIONS_SOME)
    private ReplicationFailoverTargetExecutionWhereInput replicationFailoverTargetExecutionsSome;

    public static final String SERIALIZED_NAME_REPLICATION_SERVICE = "replication_service";

    @SerializedName(SERIALIZED_NAME_REPLICATION_SERVICE)
    private ReplicationServiceWhereInput replicationService;

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

    public static final String SERIALIZED_NAME_SHUTDOWN_MODE = "shutdown_mode";

    @SerializedName(SERIALIZED_NAME_SHUTDOWN_MODE)
    private FailoverShutdownMode shutdownMode;

    public static final String SERIALIZED_NAME_SHUTDOWN_MODE_IN = "shutdown_mode_in";

    @SerializedName(SERIALIZED_NAME_SHUTDOWN_MODE_IN)
    private List<FailoverShutdownMode> shutdownModeIn = null;

    public static final String SERIALIZED_NAME_SHUTDOWN_MODE_NOT = "shutdown_mode_not";

    @SerializedName(SERIALIZED_NAME_SHUTDOWN_MODE_NOT)
    private FailoverShutdownMode shutdownModeNot;

    public static final String SERIALIZED_NAME_SHUTDOWN_MODE_NOT_IN = "shutdown_mode_not_in";

    @SerializedName(SERIALIZED_NAME_SHUTDOWN_MODE_NOT_IN)
    private List<FailoverShutdownMode> shutdownModeNotIn = null;

    public static final String SERIALIZED_NAME_STATE = "state";

    @SerializedName(SERIALIZED_NAME_STATE)
    private BackupExecutionState state;

    public static final String SERIALIZED_NAME_STATE_IN = "state_in";

    @SerializedName(SERIALIZED_NAME_STATE_IN)
    private List<BackupExecutionState> stateIn = null;

    public static final String SERIALIZED_NAME_STATE_NOT = "state_not";

    @SerializedName(SERIALIZED_NAME_STATE_NOT)
    private BackupExecutionState stateNot;

    public static final String SERIALIZED_NAME_STATE_NOT_IN = "state_not_in";

    @SerializedName(SERIALIZED_NAME_STATE_NOT_IN)
    private List<BackupExecutionState> stateNotIn = null;

    public static final String SERIALIZED_NAME_SUCCESS_JOB_COUNT = "success_job_count";

    @SerializedName(SERIALIZED_NAME_SUCCESS_JOB_COUNT)
    private Integer successJobCount;

    public static final String SERIALIZED_NAME_SUCCESS_JOB_COUNT_GT = "success_job_count_gt";

    @SerializedName(SERIALIZED_NAME_SUCCESS_JOB_COUNT_GT)
    private Integer successJobCountGt;

    public static final String SERIALIZED_NAME_SUCCESS_JOB_COUNT_GTE = "success_job_count_gte";

    @SerializedName(SERIALIZED_NAME_SUCCESS_JOB_COUNT_GTE)
    private Integer successJobCountGte;

    public static final String SERIALIZED_NAME_SUCCESS_JOB_COUNT_IN = "success_job_count_in";

    @SerializedName(SERIALIZED_NAME_SUCCESS_JOB_COUNT_IN)
    private List<Integer> successJobCountIn = null;

    public static final String SERIALIZED_NAME_SUCCESS_JOB_COUNT_LT = "success_job_count_lt";

    @SerializedName(SERIALIZED_NAME_SUCCESS_JOB_COUNT_LT)
    private Integer successJobCountLt;

    public static final String SERIALIZED_NAME_SUCCESS_JOB_COUNT_LTE = "success_job_count_lte";

    @SerializedName(SERIALIZED_NAME_SUCCESS_JOB_COUNT_LTE)
    private Integer successJobCountLte;

    public static final String SERIALIZED_NAME_SUCCESS_JOB_COUNT_NOT = "success_job_count_not";

    @SerializedName(SERIALIZED_NAME_SUCCESS_JOB_COUNT_NOT)
    private Integer successJobCountNot;

    public static final String SERIALIZED_NAME_SUCCESS_JOB_COUNT_NOT_IN =
            "success_job_count_not_in";

    @SerializedName(SERIALIZED_NAME_SUCCESS_JOB_COUNT_NOT_IN)
    private List<Integer> successJobCountNotIn = null;

    public static final String SERIALIZED_NAME_TOTAL_JOB_COUNT = "total_job_count";

    @SerializedName(SERIALIZED_NAME_TOTAL_JOB_COUNT)
    private Integer totalJobCount;

    public static final String SERIALIZED_NAME_TOTAL_JOB_COUNT_GT = "total_job_count_gt";

    @SerializedName(SERIALIZED_NAME_TOTAL_JOB_COUNT_GT)
    private Integer totalJobCountGt;

    public static final String SERIALIZED_NAME_TOTAL_JOB_COUNT_GTE = "total_job_count_gte";

    @SerializedName(SERIALIZED_NAME_TOTAL_JOB_COUNT_GTE)
    private Integer totalJobCountGte;

    public static final String SERIALIZED_NAME_TOTAL_JOB_COUNT_IN = "total_job_count_in";

    @SerializedName(SERIALIZED_NAME_TOTAL_JOB_COUNT_IN)
    private List<Integer> totalJobCountIn = null;

    public static final String SERIALIZED_NAME_TOTAL_JOB_COUNT_LT = "total_job_count_lt";

    @SerializedName(SERIALIZED_NAME_TOTAL_JOB_COUNT_LT)
    private Integer totalJobCountLt;

    public static final String SERIALIZED_NAME_TOTAL_JOB_COUNT_LTE = "total_job_count_lte";

    @SerializedName(SERIALIZED_NAME_TOTAL_JOB_COUNT_LTE)
    private Integer totalJobCountLte;

    public static final String SERIALIZED_NAME_TOTAL_JOB_COUNT_NOT = "total_job_count_not";

    @SerializedName(SERIALIZED_NAME_TOTAL_JOB_COUNT_NOT)
    private Integer totalJobCountNot;

    public static final String SERIALIZED_NAME_TOTAL_JOB_COUNT_NOT_IN = "total_job_count_not_in";

    @SerializedName(SERIALIZED_NAME_TOTAL_JOB_COUNT_NOT_IN)
    private List<Integer> totalJobCountNotIn = null;

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

    public FailoverExecutionWhereInput() {}

    public FailoverExecutionWhereInput AND(List<FailoverExecutionWhereInput> AND) {

        this.AND = AND;
        return this;
    }

    public FailoverExecutionWhereInput addANDItem(FailoverExecutionWhereInput ANDItem) {
        if (this.AND == null) {
            this.AND = new ArrayList<FailoverExecutionWhereInput>();
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
    public List<FailoverExecutionWhereInput> getAND() {
        return AND;
    }

    public void setAND(List<FailoverExecutionWhereInput> AND) {
        this.AND = AND;
    }

    public FailoverExecutionWhereInput AND_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_A_N_D);
        return this;
    }

    public FailoverExecutionWhereInput AND_ExplictlyNonNull() {
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

    public FailoverExecutionWhereInput NOT(List<FailoverExecutionWhereInput> NOT) {

        this.NOT = NOT;
        return this;
    }

    public FailoverExecutionWhereInput addNOTItem(FailoverExecutionWhereInput NOTItem) {
        if (this.NOT == null) {
            this.NOT = new ArrayList<FailoverExecutionWhereInput>();
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
    public List<FailoverExecutionWhereInput> getNOT() {
        return NOT;
    }

    public void setNOT(List<FailoverExecutionWhereInput> NOT) {
        this.NOT = NOT;
    }

    public FailoverExecutionWhereInput NOT_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_N_O_T);
        return this;
    }

    public FailoverExecutionWhereInput NOT_ExplictlyNonNull() {
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

    public FailoverExecutionWhereInput OR(List<FailoverExecutionWhereInput> OR) {

        this.OR = OR;
        return this;
    }

    public FailoverExecutionWhereInput addORItem(FailoverExecutionWhereInput ORItem) {
        if (this.OR == null) {
            this.OR = new ArrayList<FailoverExecutionWhereInput>();
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
    public List<FailoverExecutionWhereInput> getOR() {
        return OR;
    }

    public void setOR(List<FailoverExecutionWhereInput> OR) {
        this.OR = OR;
    }

    public FailoverExecutionWhereInput OR_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_O_R);
        return this;
    }

    public FailoverExecutionWhereInput OR_ExplictlyNonNull() {
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

    public FailoverExecutionWhereInput createdAt(String createdAt) {

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

    public FailoverExecutionWhereInput createdAt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT);
        return this;
    }

    public FailoverExecutionWhereInput createdAt_ExplictlyNonNull() {
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

    public FailoverExecutionWhereInput createdAtGt(String createdAtGt) {

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

    public FailoverExecutionWhereInput createdAtGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_GT);
        return this;
    }

    public FailoverExecutionWhereInput createdAtGt_ExplictlyNonNull() {
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

    public FailoverExecutionWhereInput createdAtGte(String createdAtGte) {

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

    public FailoverExecutionWhereInput createdAtGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_GTE);
        return this;
    }

    public FailoverExecutionWhereInput createdAtGte_ExplictlyNonNull() {
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

    public FailoverExecutionWhereInput createdAtIn(List<String> createdAtIn) {

        this.createdAtIn = createdAtIn;
        return this;
    }

    public FailoverExecutionWhereInput addCreatedAtInItem(String createdAtInItem) {
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

    public FailoverExecutionWhereInput createdAtIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_IN);
        return this;
    }

    public FailoverExecutionWhereInput createdAtIn_ExplictlyNonNull() {
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

    public FailoverExecutionWhereInput createdAtLt(String createdAtLt) {

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

    public FailoverExecutionWhereInput createdAtLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_LT);
        return this;
    }

    public FailoverExecutionWhereInput createdAtLt_ExplictlyNonNull() {
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

    public FailoverExecutionWhereInput createdAtLte(String createdAtLte) {

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

    public FailoverExecutionWhereInput createdAtLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_LTE);
        return this;
    }

    public FailoverExecutionWhereInput createdAtLte_ExplictlyNonNull() {
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

    public FailoverExecutionWhereInput createdAtNot(String createdAtNot) {

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

    public FailoverExecutionWhereInput createdAtNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_NOT);
        return this;
    }

    public FailoverExecutionWhereInput createdAtNot_ExplictlyNonNull() {
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

    public FailoverExecutionWhereInput createdAtNotIn(List<String> createdAtNotIn) {

        this.createdAtNotIn = createdAtNotIn;
        return this;
    }

    public FailoverExecutionWhereInput addCreatedAtNotInItem(String createdAtNotInItem) {
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

    public FailoverExecutionWhereInput createdAtNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_NOT_IN);
        return this;
    }

    public FailoverExecutionWhereInput createdAtNotIn_ExplictlyNonNull() {
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

    public FailoverExecutionWhereInput entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {

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

    public FailoverExecutionWhereInput entityAsyncStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        return this;
    }

    public FailoverExecutionWhereInput entityAsyncStatus_ExplictlyNonNull() {
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

    public FailoverExecutionWhereInput entityAsyncStatusIn(
            List<EntityAsyncStatus> entityAsyncStatusIn) {

        this.entityAsyncStatusIn = entityAsyncStatusIn;
        return this;
    }

    public FailoverExecutionWhereInput addEntityAsyncStatusInItem(
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

    public FailoverExecutionWhereInput entityAsyncStatusIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_IN);
        return this;
    }

    public FailoverExecutionWhereInput entityAsyncStatusIn_ExplictlyNonNull() {
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

    public FailoverExecutionWhereInput entityAsyncStatusNot(
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

    public FailoverExecutionWhereInput entityAsyncStatusNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT);
        return this;
    }

    public FailoverExecutionWhereInput entityAsyncStatusNot_ExplictlyNonNull() {
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

    public FailoverExecutionWhereInput entityAsyncStatusNotIn(
            List<EntityAsyncStatus> entityAsyncStatusNotIn) {

        this.entityAsyncStatusNotIn = entityAsyncStatusNotIn;
        return this;
    }

    public FailoverExecutionWhereInput addEntityAsyncStatusNotInItem(
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

    public FailoverExecutionWhereInput entityAsyncStatusNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT_IN);
        return this;
    }

    public FailoverExecutionWhereInput entityAsyncStatusNotIn_ExplictlyNonNull() {
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

    public FailoverExecutionWhereInput externalCloudtower(
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

    public FailoverExecutionWhereInput externalCloudtower_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXTERNAL_CLOUDTOWER);
        return this;
    }

    public FailoverExecutionWhereInput externalCloudtower_ExplictlyNonNull() {
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

    public FailoverExecutionWhereInput finishedAt(String finishedAt) {

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

    public FailoverExecutionWhereInput finishedAt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FINISHED_AT);
        return this;
    }

    public FailoverExecutionWhereInput finishedAt_ExplictlyNonNull() {
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

    public FailoverExecutionWhereInput finishedAtGt(String finishedAtGt) {

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

    public FailoverExecutionWhereInput finishedAtGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FINISHED_AT_GT);
        return this;
    }

    public FailoverExecutionWhereInput finishedAtGt_ExplictlyNonNull() {
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

    public FailoverExecutionWhereInput finishedAtGte(String finishedAtGte) {

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

    public FailoverExecutionWhereInput finishedAtGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FINISHED_AT_GTE);
        return this;
    }

    public FailoverExecutionWhereInput finishedAtGte_ExplictlyNonNull() {
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

    public FailoverExecutionWhereInput finishedAtIn(List<String> finishedAtIn) {

        this.finishedAtIn = finishedAtIn;
        return this;
    }

    public FailoverExecutionWhereInput addFinishedAtInItem(String finishedAtInItem) {
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

    public FailoverExecutionWhereInput finishedAtIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FINISHED_AT_IN);
        return this;
    }

    public FailoverExecutionWhereInput finishedAtIn_ExplictlyNonNull() {
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

    public FailoverExecutionWhereInput finishedAtLt(String finishedAtLt) {

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

    public FailoverExecutionWhereInput finishedAtLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FINISHED_AT_LT);
        return this;
    }

    public FailoverExecutionWhereInput finishedAtLt_ExplictlyNonNull() {
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

    public FailoverExecutionWhereInput finishedAtLte(String finishedAtLte) {

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

    public FailoverExecutionWhereInput finishedAtLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FINISHED_AT_LTE);
        return this;
    }

    public FailoverExecutionWhereInput finishedAtLte_ExplictlyNonNull() {
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

    public FailoverExecutionWhereInput finishedAtNot(String finishedAtNot) {

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

    public FailoverExecutionWhereInput finishedAtNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FINISHED_AT_NOT);
        return this;
    }

    public FailoverExecutionWhereInput finishedAtNot_ExplictlyNonNull() {
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

    public FailoverExecutionWhereInput finishedAtNotIn(List<String> finishedAtNotIn) {

        this.finishedAtNotIn = finishedAtNotIn;
        return this;
    }

    public FailoverExecutionWhereInput addFinishedAtNotInItem(String finishedAtNotInItem) {
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

    public FailoverExecutionWhereInput finishedAtNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FINISHED_AT_NOT_IN);
        return this;
    }

    public FailoverExecutionWhereInput finishedAtNotIn_ExplictlyNonNull() {
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

    public FailoverExecutionWhereInput id(String id) {

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

    public FailoverExecutionWhereInput id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public FailoverExecutionWhereInput id_ExplictlyNonNull() {
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

    public FailoverExecutionWhereInput idContains(String idContains) {

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

    public FailoverExecutionWhereInput idContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_CONTAINS);
        return this;
    }

    public FailoverExecutionWhereInput idContains_ExplictlyNonNull() {
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

    public FailoverExecutionWhereInput idEndsWith(String idEndsWith) {

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

    public FailoverExecutionWhereInput idEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_ENDS_WITH);
        return this;
    }

    public FailoverExecutionWhereInput idEndsWith_ExplictlyNonNull() {
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

    public FailoverExecutionWhereInput idGt(String idGt) {

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

    public FailoverExecutionWhereInput idGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GT);
        return this;
    }

    public FailoverExecutionWhereInput idGt_ExplictlyNonNull() {
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

    public FailoverExecutionWhereInput idGte(String idGte) {

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

    public FailoverExecutionWhereInput idGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GTE);
        return this;
    }

    public FailoverExecutionWhereInput idGte_ExplictlyNonNull() {
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

    public FailoverExecutionWhereInput idIn(List<String> idIn) {

        this.idIn = idIn;
        return this;
    }

    public FailoverExecutionWhereInput addIdInItem(String idInItem) {
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

    public FailoverExecutionWhereInput idIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_IN);
        return this;
    }

    public FailoverExecutionWhereInput idIn_ExplictlyNonNull() {
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

    public FailoverExecutionWhereInput idLt(String idLt) {

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

    public FailoverExecutionWhereInput idLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LT);
        return this;
    }

    public FailoverExecutionWhereInput idLt_ExplictlyNonNull() {
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

    public FailoverExecutionWhereInput idLte(String idLte) {

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

    public FailoverExecutionWhereInput idLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LTE);
        return this;
    }

    public FailoverExecutionWhereInput idLte_ExplictlyNonNull() {
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

    public FailoverExecutionWhereInput idNot(String idNot) {

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

    public FailoverExecutionWhereInput idNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT);
        return this;
    }

    public FailoverExecutionWhereInput idNot_ExplictlyNonNull() {
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

    public FailoverExecutionWhereInput idNotContains(String idNotContains) {

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

    public FailoverExecutionWhereInput idNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_CONTAINS);
        return this;
    }

    public FailoverExecutionWhereInput idNotContains_ExplictlyNonNull() {
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

    public FailoverExecutionWhereInput idNotEndsWith(String idNotEndsWith) {

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

    public FailoverExecutionWhereInput idNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
        return this;
    }

    public FailoverExecutionWhereInput idNotEndsWith_ExplictlyNonNull() {
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

    public FailoverExecutionWhereInput idNotIn(List<String> idNotIn) {

        this.idNotIn = idNotIn;
        return this;
    }

    public FailoverExecutionWhereInput addIdNotInItem(String idNotInItem) {
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

    public FailoverExecutionWhereInput idNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_IN);
        return this;
    }

    public FailoverExecutionWhereInput idNotIn_ExplictlyNonNull() {
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

    public FailoverExecutionWhereInput idNotStartsWith(String idNotStartsWith) {

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

    public FailoverExecutionWhereInput idNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
        return this;
    }

    public FailoverExecutionWhereInput idNotStartsWith_ExplictlyNonNull() {
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

    public FailoverExecutionWhereInput idStartsWith(String idStartsWith) {

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

    public FailoverExecutionWhereInput idStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_STARTS_WITH);
        return this;
    }

    public FailoverExecutionWhereInput idStartsWith_ExplictlyNonNull() {
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

    public FailoverExecutionWhereInput isSyncReplication(Boolean isSyncReplication) {

        this.isSyncReplication = isSyncReplication;
        return this;
    }

    /**
     * Get isSyncReplication
     *
     * @return isSyncReplication
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getIsSyncReplication() {
        return isSyncReplication;
    }

    public void setIsSyncReplication(Boolean isSyncReplication) {
        this.isSyncReplication = isSyncReplication;
    }

    public FailoverExecutionWhereInput isSyncReplication_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IS_SYNC_REPLICATION);
        return this;
    }

    public FailoverExecutionWhereInput isSyncReplication_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IS_SYNC_REPLICATION);
        return this;
    }

    public void setIsSyncReplication_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IS_SYNC_REPLICATION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IS_SYNC_REPLICATION);
        }
    }

    public boolean getIsSyncReplication_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IS_SYNC_REPLICATION);
    }

    public FailoverExecutionWhereInput isSyncReplicationNot(Boolean isSyncReplicationNot) {

        this.isSyncReplicationNot = isSyncReplicationNot;
        return this;
    }

    /**
     * Get isSyncReplicationNot
     *
     * @return isSyncReplicationNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getIsSyncReplicationNot() {
        return isSyncReplicationNot;
    }

    public void setIsSyncReplicationNot(Boolean isSyncReplicationNot) {
        this.isSyncReplicationNot = isSyncReplicationNot;
    }

    public FailoverExecutionWhereInput isSyncReplicationNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IS_SYNC_REPLICATION_NOT);
        return this;
    }

    public FailoverExecutionWhereInput isSyncReplicationNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IS_SYNC_REPLICATION_NOT);
        return this;
    }

    public void setIsSyncReplicationNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IS_SYNC_REPLICATION_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IS_SYNC_REPLICATION_NOT);
        }
    }

    public boolean getIsSyncReplicationNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IS_SYNC_REPLICATION_NOT);
    }

    public FailoverExecutionWhereInput isTestMode(Boolean isTestMode) {

        this.isTestMode = isTestMode;
        return this;
    }

    /**
     * Get isTestMode
     *
     * @return isTestMode
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getIsTestMode() {
        return isTestMode;
    }

    public void setIsTestMode(Boolean isTestMode) {
        this.isTestMode = isTestMode;
    }

    public FailoverExecutionWhereInput isTestMode_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IS_TEST_MODE);
        return this;
    }

    public FailoverExecutionWhereInput isTestMode_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IS_TEST_MODE);
        return this;
    }

    public void setIsTestMode_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IS_TEST_MODE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IS_TEST_MODE);
        }
    }

    public boolean getIsTestMode_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IS_TEST_MODE);
    }

    public FailoverExecutionWhereInput isTestModeNot(Boolean isTestModeNot) {

        this.isTestModeNot = isTestModeNot;
        return this;
    }

    /**
     * Get isTestModeNot
     *
     * @return isTestModeNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getIsTestModeNot() {
        return isTestModeNot;
    }

    public void setIsTestModeNot(Boolean isTestModeNot) {
        this.isTestModeNot = isTestModeNot;
    }

    public FailoverExecutionWhereInput isTestModeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IS_TEST_MODE_NOT);
        return this;
    }

    public FailoverExecutionWhereInput isTestModeNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IS_TEST_MODE_NOT);
        return this;
    }

    public void setIsTestModeNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IS_TEST_MODE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IS_TEST_MODE_NOT);
        }
    }

    public boolean getIsTestModeNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IS_TEST_MODE_NOT);
    }

    public FailoverExecutionWhereInput replicationFailoverTargetExecutionsEvery(
            ReplicationFailoverTargetExecutionWhereInput replicationFailoverTargetExecutionsEvery) {

        this.replicationFailoverTargetExecutionsEvery = replicationFailoverTargetExecutionsEvery;
        return this;
    }

    /**
     * Get replicationFailoverTargetExecutionsEvery
     *
     * @return replicationFailoverTargetExecutionsEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ReplicationFailoverTargetExecutionWhereInput
            getReplicationFailoverTargetExecutionsEvery() {
        return replicationFailoverTargetExecutionsEvery;
    }

    public void setReplicationFailoverTargetExecutionsEvery(
            ReplicationFailoverTargetExecutionWhereInput replicationFailoverTargetExecutionsEvery) {
        this.replicationFailoverTargetExecutionsEvery = replicationFailoverTargetExecutionsEvery;
    }

    public FailoverExecutionWhereInput replicationFailoverTargetExecutionsEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICATION_FAILOVER_TARGET_EXECUTIONS_EVERY);
        return this;
    }

    public FailoverExecutionWhereInput replicationFailoverTargetExecutionsEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REPLICATION_FAILOVER_TARGET_EXECUTIONS_EVERY);
        return this;
    }

    public void setReplicationFailoverTargetExecutionsEvery_IsExplictlyNull(
            boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REPLICATION_FAILOVER_TARGET_EXECUTIONS_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REPLICATION_FAILOVER_TARGET_EXECUTIONS_EVERY);
        }
    }

    public boolean getReplicationFailoverTargetExecutionsEvery_IsExplictlyNull() {
        return this._isPresent_.contains(
                SERIALIZED_NAME_REPLICATION_FAILOVER_TARGET_EXECUTIONS_EVERY);
    }

    public FailoverExecutionWhereInput replicationFailoverTargetExecutionsNone(
            ReplicationFailoverTargetExecutionWhereInput replicationFailoverTargetExecutionsNone) {

        this.replicationFailoverTargetExecutionsNone = replicationFailoverTargetExecutionsNone;
        return this;
    }

    /**
     * Get replicationFailoverTargetExecutionsNone
     *
     * @return replicationFailoverTargetExecutionsNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ReplicationFailoverTargetExecutionWhereInput
            getReplicationFailoverTargetExecutionsNone() {
        return replicationFailoverTargetExecutionsNone;
    }

    public void setReplicationFailoverTargetExecutionsNone(
            ReplicationFailoverTargetExecutionWhereInput replicationFailoverTargetExecutionsNone) {
        this.replicationFailoverTargetExecutionsNone = replicationFailoverTargetExecutionsNone;
    }

    public FailoverExecutionWhereInput replicationFailoverTargetExecutionsNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICATION_FAILOVER_TARGET_EXECUTIONS_NONE);
        return this;
    }

    public FailoverExecutionWhereInput replicationFailoverTargetExecutionsNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REPLICATION_FAILOVER_TARGET_EXECUTIONS_NONE);
        return this;
    }

    public void setReplicationFailoverTargetExecutionsNone_IsExplictlyNull(
            boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REPLICATION_FAILOVER_TARGET_EXECUTIONS_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REPLICATION_FAILOVER_TARGET_EXECUTIONS_NONE);
        }
    }

    public boolean getReplicationFailoverTargetExecutionsNone_IsExplictlyNull() {
        return this._isPresent_.contains(
                SERIALIZED_NAME_REPLICATION_FAILOVER_TARGET_EXECUTIONS_NONE);
    }

    public FailoverExecutionWhereInput replicationFailoverTargetExecutionsSome(
            ReplicationFailoverTargetExecutionWhereInput replicationFailoverTargetExecutionsSome) {

        this.replicationFailoverTargetExecutionsSome = replicationFailoverTargetExecutionsSome;
        return this;
    }

    /**
     * Get replicationFailoverTargetExecutionsSome
     *
     * @return replicationFailoverTargetExecutionsSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ReplicationFailoverTargetExecutionWhereInput
            getReplicationFailoverTargetExecutionsSome() {
        return replicationFailoverTargetExecutionsSome;
    }

    public void setReplicationFailoverTargetExecutionsSome(
            ReplicationFailoverTargetExecutionWhereInput replicationFailoverTargetExecutionsSome) {
        this.replicationFailoverTargetExecutionsSome = replicationFailoverTargetExecutionsSome;
    }

    public FailoverExecutionWhereInput replicationFailoverTargetExecutionsSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICATION_FAILOVER_TARGET_EXECUTIONS_SOME);
        return this;
    }

    public FailoverExecutionWhereInput replicationFailoverTargetExecutionsSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REPLICATION_FAILOVER_TARGET_EXECUTIONS_SOME);
        return this;
    }

    public void setReplicationFailoverTargetExecutionsSome_IsExplictlyNull(
            boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REPLICATION_FAILOVER_TARGET_EXECUTIONS_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REPLICATION_FAILOVER_TARGET_EXECUTIONS_SOME);
        }
    }

    public boolean getReplicationFailoverTargetExecutionsSome_IsExplictlyNull() {
        return this._isPresent_.contains(
                SERIALIZED_NAME_REPLICATION_FAILOVER_TARGET_EXECUTIONS_SOME);
    }

    public FailoverExecutionWhereInput replicationService(
            ReplicationServiceWhereInput replicationService) {

        this.replicationService = replicationService;
        return this;
    }

    /**
     * Get replicationService
     *
     * @return replicationService
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ReplicationServiceWhereInput getReplicationService() {
        return replicationService;
    }

    public void setReplicationService(ReplicationServiceWhereInput replicationService) {
        this.replicationService = replicationService;
    }

    public FailoverExecutionWhereInput replicationService_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICATION_SERVICE);
        return this;
    }

    public FailoverExecutionWhereInput replicationService_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REPLICATION_SERVICE);
        return this;
    }

    public void setReplicationService_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REPLICATION_SERVICE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REPLICATION_SERVICE);
        }
    }

    public boolean getReplicationService_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REPLICATION_SERVICE);
    }

    public FailoverExecutionWhereInput resourceVersion(Integer resourceVersion) {

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

    public FailoverExecutionWhereInput resourceVersion_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_VERSION);
        return this;
    }

    public FailoverExecutionWhereInput resourceVersion_ExplictlyNonNull() {
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

    public FailoverExecutionWhereInput resourceVersionGt(Integer resourceVersionGt) {

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

    public FailoverExecutionWhereInput resourceVersionGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_VERSION_GT);
        return this;
    }

    public FailoverExecutionWhereInput resourceVersionGt_ExplictlyNonNull() {
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

    public FailoverExecutionWhereInput resourceVersionGte(Integer resourceVersionGte) {

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

    public FailoverExecutionWhereInput resourceVersionGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_VERSION_GTE);
        return this;
    }

    public FailoverExecutionWhereInput resourceVersionGte_ExplictlyNonNull() {
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

    public FailoverExecutionWhereInput resourceVersionIn(List<Integer> resourceVersionIn) {

        this.resourceVersionIn = resourceVersionIn;
        return this;
    }

    public FailoverExecutionWhereInput addResourceVersionInItem(Integer resourceVersionInItem) {
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

    public FailoverExecutionWhereInput resourceVersionIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_VERSION_IN);
        return this;
    }

    public FailoverExecutionWhereInput resourceVersionIn_ExplictlyNonNull() {
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

    public FailoverExecutionWhereInput resourceVersionLt(Integer resourceVersionLt) {

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

    public FailoverExecutionWhereInput resourceVersionLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_VERSION_LT);
        return this;
    }

    public FailoverExecutionWhereInput resourceVersionLt_ExplictlyNonNull() {
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

    public FailoverExecutionWhereInput resourceVersionLte(Integer resourceVersionLte) {

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

    public FailoverExecutionWhereInput resourceVersionLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_VERSION_LTE);
        return this;
    }

    public FailoverExecutionWhereInput resourceVersionLte_ExplictlyNonNull() {
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

    public FailoverExecutionWhereInput resourceVersionNot(Integer resourceVersionNot) {

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

    public FailoverExecutionWhereInput resourceVersionNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_VERSION_NOT);
        return this;
    }

    public FailoverExecutionWhereInput resourceVersionNot_ExplictlyNonNull() {
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

    public FailoverExecutionWhereInput resourceVersionNotIn(List<Integer> resourceVersionNotIn) {

        this.resourceVersionNotIn = resourceVersionNotIn;
        return this;
    }

    public FailoverExecutionWhereInput addResourceVersionNotInItem(
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

    public FailoverExecutionWhereInput resourceVersionNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_VERSION_NOT_IN);
        return this;
    }

    public FailoverExecutionWhereInput resourceVersionNotIn_ExplictlyNonNull() {
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

    public FailoverExecutionWhereInput shutdownMode(FailoverShutdownMode shutdownMode) {

        this.shutdownMode = shutdownMode;
        return this;
    }

    /**
     * Get shutdownMode
     *
     * @return shutdownMode
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public FailoverShutdownMode getShutdownMode() {
        return shutdownMode;
    }

    public void setShutdownMode(FailoverShutdownMode shutdownMode) {
        this.shutdownMode = shutdownMode;
    }

    public FailoverExecutionWhereInput shutdownMode_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SHUTDOWN_MODE);
        return this;
    }

    public FailoverExecutionWhereInput shutdownMode_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SHUTDOWN_MODE);
        return this;
    }

    public void setShutdownMode_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SHUTDOWN_MODE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SHUTDOWN_MODE);
        }
    }

    public boolean getShutdownMode_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SHUTDOWN_MODE);
    }

    public FailoverExecutionWhereInput shutdownModeIn(List<FailoverShutdownMode> shutdownModeIn) {

        this.shutdownModeIn = shutdownModeIn;
        return this;
    }

    public FailoverExecutionWhereInput addShutdownModeInItem(
            FailoverShutdownMode shutdownModeInItem) {
        if (this.shutdownModeIn == null) {
            this.shutdownModeIn = new ArrayList<FailoverShutdownMode>();
        }
        this.shutdownModeIn.add(shutdownModeInItem);
        return this;
    }

    /**
     * Get shutdownModeIn
     *
     * @return shutdownModeIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<FailoverShutdownMode> getShutdownModeIn() {
        return shutdownModeIn;
    }

    public void setShutdownModeIn(List<FailoverShutdownMode> shutdownModeIn) {
        this.shutdownModeIn = shutdownModeIn;
    }

    public FailoverExecutionWhereInput shutdownModeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SHUTDOWN_MODE_IN);
        return this;
    }

    public FailoverExecutionWhereInput shutdownModeIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SHUTDOWN_MODE_IN);
        return this;
    }

    public void setShutdownModeIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SHUTDOWN_MODE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SHUTDOWN_MODE_IN);
        }
    }

    public boolean getShutdownModeIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SHUTDOWN_MODE_IN);
    }

    public FailoverExecutionWhereInput shutdownModeNot(FailoverShutdownMode shutdownModeNot) {

        this.shutdownModeNot = shutdownModeNot;
        return this;
    }

    /**
     * Get shutdownModeNot
     *
     * @return shutdownModeNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public FailoverShutdownMode getShutdownModeNot() {
        return shutdownModeNot;
    }

    public void setShutdownModeNot(FailoverShutdownMode shutdownModeNot) {
        this.shutdownModeNot = shutdownModeNot;
    }

    public FailoverExecutionWhereInput shutdownModeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SHUTDOWN_MODE_NOT);
        return this;
    }

    public FailoverExecutionWhereInput shutdownModeNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SHUTDOWN_MODE_NOT);
        return this;
    }

    public void setShutdownModeNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SHUTDOWN_MODE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SHUTDOWN_MODE_NOT);
        }
    }

    public boolean getShutdownModeNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SHUTDOWN_MODE_NOT);
    }

    public FailoverExecutionWhereInput shutdownModeNotIn(
            List<FailoverShutdownMode> shutdownModeNotIn) {

        this.shutdownModeNotIn = shutdownModeNotIn;
        return this;
    }

    public FailoverExecutionWhereInput addShutdownModeNotInItem(
            FailoverShutdownMode shutdownModeNotInItem) {
        if (this.shutdownModeNotIn == null) {
            this.shutdownModeNotIn = new ArrayList<FailoverShutdownMode>();
        }
        this.shutdownModeNotIn.add(shutdownModeNotInItem);
        return this;
    }

    /**
     * Get shutdownModeNotIn
     *
     * @return shutdownModeNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<FailoverShutdownMode> getShutdownModeNotIn() {
        return shutdownModeNotIn;
    }

    public void setShutdownModeNotIn(List<FailoverShutdownMode> shutdownModeNotIn) {
        this.shutdownModeNotIn = shutdownModeNotIn;
    }

    public FailoverExecutionWhereInput shutdownModeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SHUTDOWN_MODE_NOT_IN);
        return this;
    }

    public FailoverExecutionWhereInput shutdownModeNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SHUTDOWN_MODE_NOT_IN);
        return this;
    }

    public void setShutdownModeNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SHUTDOWN_MODE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SHUTDOWN_MODE_NOT_IN);
        }
    }

    public boolean getShutdownModeNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SHUTDOWN_MODE_NOT_IN);
    }

    public FailoverExecutionWhereInput state(BackupExecutionState state) {

        this.state = state;
        return this;
    }

    /**
     * Get state
     *
     * @return state
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public BackupExecutionState getState() {
        return state;
    }

    public void setState(BackupExecutionState state) {
        this.state = state;
    }

    public FailoverExecutionWhereInput state_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATE);
        return this;
    }

    public FailoverExecutionWhereInput state_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STATE);
        return this;
    }

    public void setState_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STATE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STATE);
        }
    }

    public boolean getState_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STATE);
    }

    public FailoverExecutionWhereInput stateIn(List<BackupExecutionState> stateIn) {

        this.stateIn = stateIn;
        return this;
    }

    public FailoverExecutionWhereInput addStateInItem(BackupExecutionState stateInItem) {
        if (this.stateIn == null) {
            this.stateIn = new ArrayList<BackupExecutionState>();
        }
        this.stateIn.add(stateInItem);
        return this;
    }

    /**
     * Get stateIn
     *
     * @return stateIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<BackupExecutionState> getStateIn() {
        return stateIn;
    }

    public void setStateIn(List<BackupExecutionState> stateIn) {
        this.stateIn = stateIn;
    }

    public FailoverExecutionWhereInput stateIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATE_IN);
        return this;
    }

    public FailoverExecutionWhereInput stateIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STATE_IN);
        return this;
    }

    public void setStateIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STATE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STATE_IN);
        }
    }

    public boolean getStateIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STATE_IN);
    }

    public FailoverExecutionWhereInput stateNot(BackupExecutionState stateNot) {

        this.stateNot = stateNot;
        return this;
    }

    /**
     * Get stateNot
     *
     * @return stateNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public BackupExecutionState getStateNot() {
        return stateNot;
    }

    public void setStateNot(BackupExecutionState stateNot) {
        this.stateNot = stateNot;
    }

    public FailoverExecutionWhereInput stateNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATE_NOT);
        return this;
    }

    public FailoverExecutionWhereInput stateNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STATE_NOT);
        return this;
    }

    public void setStateNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STATE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STATE_NOT);
        }
    }

    public boolean getStateNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STATE_NOT);
    }

    public FailoverExecutionWhereInput stateNotIn(List<BackupExecutionState> stateNotIn) {

        this.stateNotIn = stateNotIn;
        return this;
    }

    public FailoverExecutionWhereInput addStateNotInItem(BackupExecutionState stateNotInItem) {
        if (this.stateNotIn == null) {
            this.stateNotIn = new ArrayList<BackupExecutionState>();
        }
        this.stateNotIn.add(stateNotInItem);
        return this;
    }

    /**
     * Get stateNotIn
     *
     * @return stateNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<BackupExecutionState> getStateNotIn() {
        return stateNotIn;
    }

    public void setStateNotIn(List<BackupExecutionState> stateNotIn) {
        this.stateNotIn = stateNotIn;
    }

    public FailoverExecutionWhereInput stateNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATE_NOT_IN);
        return this;
    }

    public FailoverExecutionWhereInput stateNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STATE_NOT_IN);
        return this;
    }

    public void setStateNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STATE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STATE_NOT_IN);
        }
    }

    public boolean getStateNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STATE_NOT_IN);
    }

    public FailoverExecutionWhereInput successJobCount(Integer successJobCount) {

        this.successJobCount = successJobCount;
        return this;
    }

    /**
     * Get successJobCount
     *
     * @return successJobCount
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getSuccessJobCount() {
        return successJobCount;
    }

    public void setSuccessJobCount(Integer successJobCount) {
        this.successJobCount = successJobCount;
    }

    public FailoverExecutionWhereInput successJobCount_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUCCESS_JOB_COUNT);
        return this;
    }

    public FailoverExecutionWhereInput successJobCount_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SUCCESS_JOB_COUNT);
        return this;
    }

    public void setSuccessJobCount_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SUCCESS_JOB_COUNT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SUCCESS_JOB_COUNT);
        }
    }

    public boolean getSuccessJobCount_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SUCCESS_JOB_COUNT);
    }

    public FailoverExecutionWhereInput successJobCountGt(Integer successJobCountGt) {

        this.successJobCountGt = successJobCountGt;
        return this;
    }

    /**
     * Get successJobCountGt
     *
     * @return successJobCountGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getSuccessJobCountGt() {
        return successJobCountGt;
    }

    public void setSuccessJobCountGt(Integer successJobCountGt) {
        this.successJobCountGt = successJobCountGt;
    }

    public FailoverExecutionWhereInput successJobCountGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUCCESS_JOB_COUNT_GT);
        return this;
    }

    public FailoverExecutionWhereInput successJobCountGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SUCCESS_JOB_COUNT_GT);
        return this;
    }

    public void setSuccessJobCountGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SUCCESS_JOB_COUNT_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SUCCESS_JOB_COUNT_GT);
        }
    }

    public boolean getSuccessJobCountGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SUCCESS_JOB_COUNT_GT);
    }

    public FailoverExecutionWhereInput successJobCountGte(Integer successJobCountGte) {

        this.successJobCountGte = successJobCountGte;
        return this;
    }

    /**
     * Get successJobCountGte
     *
     * @return successJobCountGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getSuccessJobCountGte() {
        return successJobCountGte;
    }

    public void setSuccessJobCountGte(Integer successJobCountGte) {
        this.successJobCountGte = successJobCountGte;
    }

    public FailoverExecutionWhereInput successJobCountGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUCCESS_JOB_COUNT_GTE);
        return this;
    }

    public FailoverExecutionWhereInput successJobCountGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SUCCESS_JOB_COUNT_GTE);
        return this;
    }

    public void setSuccessJobCountGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SUCCESS_JOB_COUNT_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SUCCESS_JOB_COUNT_GTE);
        }
    }

    public boolean getSuccessJobCountGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SUCCESS_JOB_COUNT_GTE);
    }

    public FailoverExecutionWhereInput successJobCountIn(List<Integer> successJobCountIn) {

        this.successJobCountIn = successJobCountIn;
        return this;
    }

    public FailoverExecutionWhereInput addSuccessJobCountInItem(Integer successJobCountInItem) {
        if (this.successJobCountIn == null) {
            this.successJobCountIn = new ArrayList<Integer>();
        }
        this.successJobCountIn.add(successJobCountInItem);
        return this;
    }

    /**
     * Get successJobCountIn
     *
     * @return successJobCountIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getSuccessJobCountIn() {
        return successJobCountIn;
    }

    public void setSuccessJobCountIn(List<Integer> successJobCountIn) {
        this.successJobCountIn = successJobCountIn;
    }

    public FailoverExecutionWhereInput successJobCountIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUCCESS_JOB_COUNT_IN);
        return this;
    }

    public FailoverExecutionWhereInput successJobCountIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SUCCESS_JOB_COUNT_IN);
        return this;
    }

    public void setSuccessJobCountIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SUCCESS_JOB_COUNT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SUCCESS_JOB_COUNT_IN);
        }
    }

    public boolean getSuccessJobCountIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SUCCESS_JOB_COUNT_IN);
    }

    public FailoverExecutionWhereInput successJobCountLt(Integer successJobCountLt) {

        this.successJobCountLt = successJobCountLt;
        return this;
    }

    /**
     * Get successJobCountLt
     *
     * @return successJobCountLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getSuccessJobCountLt() {
        return successJobCountLt;
    }

    public void setSuccessJobCountLt(Integer successJobCountLt) {
        this.successJobCountLt = successJobCountLt;
    }

    public FailoverExecutionWhereInput successJobCountLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUCCESS_JOB_COUNT_LT);
        return this;
    }

    public FailoverExecutionWhereInput successJobCountLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SUCCESS_JOB_COUNT_LT);
        return this;
    }

    public void setSuccessJobCountLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SUCCESS_JOB_COUNT_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SUCCESS_JOB_COUNT_LT);
        }
    }

    public boolean getSuccessJobCountLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SUCCESS_JOB_COUNT_LT);
    }

    public FailoverExecutionWhereInput successJobCountLte(Integer successJobCountLte) {

        this.successJobCountLte = successJobCountLte;
        return this;
    }

    /**
     * Get successJobCountLte
     *
     * @return successJobCountLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getSuccessJobCountLte() {
        return successJobCountLte;
    }

    public void setSuccessJobCountLte(Integer successJobCountLte) {
        this.successJobCountLte = successJobCountLte;
    }

    public FailoverExecutionWhereInput successJobCountLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUCCESS_JOB_COUNT_LTE);
        return this;
    }

    public FailoverExecutionWhereInput successJobCountLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SUCCESS_JOB_COUNT_LTE);
        return this;
    }

    public void setSuccessJobCountLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SUCCESS_JOB_COUNT_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SUCCESS_JOB_COUNT_LTE);
        }
    }

    public boolean getSuccessJobCountLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SUCCESS_JOB_COUNT_LTE);
    }

    public FailoverExecutionWhereInput successJobCountNot(Integer successJobCountNot) {

        this.successJobCountNot = successJobCountNot;
        return this;
    }

    /**
     * Get successJobCountNot
     *
     * @return successJobCountNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getSuccessJobCountNot() {
        return successJobCountNot;
    }

    public void setSuccessJobCountNot(Integer successJobCountNot) {
        this.successJobCountNot = successJobCountNot;
    }

    public FailoverExecutionWhereInput successJobCountNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUCCESS_JOB_COUNT_NOT);
        return this;
    }

    public FailoverExecutionWhereInput successJobCountNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SUCCESS_JOB_COUNT_NOT);
        return this;
    }

    public void setSuccessJobCountNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SUCCESS_JOB_COUNT_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SUCCESS_JOB_COUNT_NOT);
        }
    }

    public boolean getSuccessJobCountNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SUCCESS_JOB_COUNT_NOT);
    }

    public FailoverExecutionWhereInput successJobCountNotIn(List<Integer> successJobCountNotIn) {

        this.successJobCountNotIn = successJobCountNotIn;
        return this;
    }

    public FailoverExecutionWhereInput addSuccessJobCountNotInItem(
            Integer successJobCountNotInItem) {
        if (this.successJobCountNotIn == null) {
            this.successJobCountNotIn = new ArrayList<Integer>();
        }
        this.successJobCountNotIn.add(successJobCountNotInItem);
        return this;
    }

    /**
     * Get successJobCountNotIn
     *
     * @return successJobCountNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getSuccessJobCountNotIn() {
        return successJobCountNotIn;
    }

    public void setSuccessJobCountNotIn(List<Integer> successJobCountNotIn) {
        this.successJobCountNotIn = successJobCountNotIn;
    }

    public FailoverExecutionWhereInput successJobCountNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUCCESS_JOB_COUNT_NOT_IN);
        return this;
    }

    public FailoverExecutionWhereInput successJobCountNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SUCCESS_JOB_COUNT_NOT_IN);
        return this;
    }

    public void setSuccessJobCountNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SUCCESS_JOB_COUNT_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SUCCESS_JOB_COUNT_NOT_IN);
        }
    }

    public boolean getSuccessJobCountNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SUCCESS_JOB_COUNT_NOT_IN);
    }

    public FailoverExecutionWhereInput totalJobCount(Integer totalJobCount) {

        this.totalJobCount = totalJobCount;
        return this;
    }

    /**
     * Get totalJobCount
     *
     * @return totalJobCount
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getTotalJobCount() {
        return totalJobCount;
    }

    public void setTotalJobCount(Integer totalJobCount) {
        this.totalJobCount = totalJobCount;
    }

    public FailoverExecutionWhereInput totalJobCount_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_JOB_COUNT);
        return this;
    }

    public FailoverExecutionWhereInput totalJobCount_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_JOB_COUNT);
        return this;
    }

    public void setTotalJobCount_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_JOB_COUNT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_JOB_COUNT);
        }
    }

    public boolean getTotalJobCount_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_JOB_COUNT);
    }

    public FailoverExecutionWhereInput totalJobCountGt(Integer totalJobCountGt) {

        this.totalJobCountGt = totalJobCountGt;
        return this;
    }

    /**
     * Get totalJobCountGt
     *
     * @return totalJobCountGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getTotalJobCountGt() {
        return totalJobCountGt;
    }

    public void setTotalJobCountGt(Integer totalJobCountGt) {
        this.totalJobCountGt = totalJobCountGt;
    }

    public FailoverExecutionWhereInput totalJobCountGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_JOB_COUNT_GT);
        return this;
    }

    public FailoverExecutionWhereInput totalJobCountGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_JOB_COUNT_GT);
        return this;
    }

    public void setTotalJobCountGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_JOB_COUNT_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_JOB_COUNT_GT);
        }
    }

    public boolean getTotalJobCountGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_JOB_COUNT_GT);
    }

    public FailoverExecutionWhereInput totalJobCountGte(Integer totalJobCountGte) {

        this.totalJobCountGte = totalJobCountGte;
        return this;
    }

    /**
     * Get totalJobCountGte
     *
     * @return totalJobCountGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getTotalJobCountGte() {
        return totalJobCountGte;
    }

    public void setTotalJobCountGte(Integer totalJobCountGte) {
        this.totalJobCountGte = totalJobCountGte;
    }

    public FailoverExecutionWhereInput totalJobCountGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_JOB_COUNT_GTE);
        return this;
    }

    public FailoverExecutionWhereInput totalJobCountGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_JOB_COUNT_GTE);
        return this;
    }

    public void setTotalJobCountGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_JOB_COUNT_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_JOB_COUNT_GTE);
        }
    }

    public boolean getTotalJobCountGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_JOB_COUNT_GTE);
    }

    public FailoverExecutionWhereInput totalJobCountIn(List<Integer> totalJobCountIn) {

        this.totalJobCountIn = totalJobCountIn;
        return this;
    }

    public FailoverExecutionWhereInput addTotalJobCountInItem(Integer totalJobCountInItem) {
        if (this.totalJobCountIn == null) {
            this.totalJobCountIn = new ArrayList<Integer>();
        }
        this.totalJobCountIn.add(totalJobCountInItem);
        return this;
    }

    /**
     * Get totalJobCountIn
     *
     * @return totalJobCountIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getTotalJobCountIn() {
        return totalJobCountIn;
    }

    public void setTotalJobCountIn(List<Integer> totalJobCountIn) {
        this.totalJobCountIn = totalJobCountIn;
    }

    public FailoverExecutionWhereInput totalJobCountIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_JOB_COUNT_IN);
        return this;
    }

    public FailoverExecutionWhereInput totalJobCountIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_JOB_COUNT_IN);
        return this;
    }

    public void setTotalJobCountIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_JOB_COUNT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_JOB_COUNT_IN);
        }
    }

    public boolean getTotalJobCountIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_JOB_COUNT_IN);
    }

    public FailoverExecutionWhereInput totalJobCountLt(Integer totalJobCountLt) {

        this.totalJobCountLt = totalJobCountLt;
        return this;
    }

    /**
     * Get totalJobCountLt
     *
     * @return totalJobCountLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getTotalJobCountLt() {
        return totalJobCountLt;
    }

    public void setTotalJobCountLt(Integer totalJobCountLt) {
        this.totalJobCountLt = totalJobCountLt;
    }

    public FailoverExecutionWhereInput totalJobCountLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_JOB_COUNT_LT);
        return this;
    }

    public FailoverExecutionWhereInput totalJobCountLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_JOB_COUNT_LT);
        return this;
    }

    public void setTotalJobCountLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_JOB_COUNT_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_JOB_COUNT_LT);
        }
    }

    public boolean getTotalJobCountLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_JOB_COUNT_LT);
    }

    public FailoverExecutionWhereInput totalJobCountLte(Integer totalJobCountLte) {

        this.totalJobCountLte = totalJobCountLte;
        return this;
    }

    /**
     * Get totalJobCountLte
     *
     * @return totalJobCountLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getTotalJobCountLte() {
        return totalJobCountLte;
    }

    public void setTotalJobCountLte(Integer totalJobCountLte) {
        this.totalJobCountLte = totalJobCountLte;
    }

    public FailoverExecutionWhereInput totalJobCountLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_JOB_COUNT_LTE);
        return this;
    }

    public FailoverExecutionWhereInput totalJobCountLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_JOB_COUNT_LTE);
        return this;
    }

    public void setTotalJobCountLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_JOB_COUNT_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_JOB_COUNT_LTE);
        }
    }

    public boolean getTotalJobCountLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_JOB_COUNT_LTE);
    }

    public FailoverExecutionWhereInput totalJobCountNot(Integer totalJobCountNot) {

        this.totalJobCountNot = totalJobCountNot;
        return this;
    }

    /**
     * Get totalJobCountNot
     *
     * @return totalJobCountNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getTotalJobCountNot() {
        return totalJobCountNot;
    }

    public void setTotalJobCountNot(Integer totalJobCountNot) {
        this.totalJobCountNot = totalJobCountNot;
    }

    public FailoverExecutionWhereInput totalJobCountNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_JOB_COUNT_NOT);
        return this;
    }

    public FailoverExecutionWhereInput totalJobCountNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_JOB_COUNT_NOT);
        return this;
    }

    public void setTotalJobCountNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_JOB_COUNT_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_JOB_COUNT_NOT);
        }
    }

    public boolean getTotalJobCountNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_JOB_COUNT_NOT);
    }

    public FailoverExecutionWhereInput totalJobCountNotIn(List<Integer> totalJobCountNotIn) {

        this.totalJobCountNotIn = totalJobCountNotIn;
        return this;
    }

    public FailoverExecutionWhereInput addTotalJobCountNotInItem(Integer totalJobCountNotInItem) {
        if (this.totalJobCountNotIn == null) {
            this.totalJobCountNotIn = new ArrayList<Integer>();
        }
        this.totalJobCountNotIn.add(totalJobCountNotInItem);
        return this;
    }

    /**
     * Get totalJobCountNotIn
     *
     * @return totalJobCountNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getTotalJobCountNotIn() {
        return totalJobCountNotIn;
    }

    public void setTotalJobCountNotIn(List<Integer> totalJobCountNotIn) {
        this.totalJobCountNotIn = totalJobCountNotIn;
    }

    public FailoverExecutionWhereInput totalJobCountNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_JOB_COUNT_NOT_IN);
        return this;
    }

    public FailoverExecutionWhereInput totalJobCountNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_JOB_COUNT_NOT_IN);
        return this;
    }

    public void setTotalJobCountNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_JOB_COUNT_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_JOB_COUNT_NOT_IN);
        }
    }

    public boolean getTotalJobCountNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_JOB_COUNT_NOT_IN);
    }

    public FailoverExecutionWhereInput updatedAt(String updatedAt) {

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

    public FailoverExecutionWhereInput updatedAt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPDATED_AT);
        return this;
    }

    public FailoverExecutionWhereInput updatedAt_ExplictlyNonNull() {
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

    public FailoverExecutionWhereInput updatedAtGt(String updatedAtGt) {

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

    public FailoverExecutionWhereInput updatedAtGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPDATED_AT_GT);
        return this;
    }

    public FailoverExecutionWhereInput updatedAtGt_ExplictlyNonNull() {
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

    public FailoverExecutionWhereInput updatedAtGte(String updatedAtGte) {

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

    public FailoverExecutionWhereInput updatedAtGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPDATED_AT_GTE);
        return this;
    }

    public FailoverExecutionWhereInput updatedAtGte_ExplictlyNonNull() {
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

    public FailoverExecutionWhereInput updatedAtIn(List<String> updatedAtIn) {

        this.updatedAtIn = updatedAtIn;
        return this;
    }

    public FailoverExecutionWhereInput addUpdatedAtInItem(String updatedAtInItem) {
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

    public FailoverExecutionWhereInput updatedAtIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPDATED_AT_IN);
        return this;
    }

    public FailoverExecutionWhereInput updatedAtIn_ExplictlyNonNull() {
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

    public FailoverExecutionWhereInput updatedAtLt(String updatedAtLt) {

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

    public FailoverExecutionWhereInput updatedAtLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPDATED_AT_LT);
        return this;
    }

    public FailoverExecutionWhereInput updatedAtLt_ExplictlyNonNull() {
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

    public FailoverExecutionWhereInput updatedAtLte(String updatedAtLte) {

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

    public FailoverExecutionWhereInput updatedAtLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPDATED_AT_LTE);
        return this;
    }

    public FailoverExecutionWhereInput updatedAtLte_ExplictlyNonNull() {
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

    public FailoverExecutionWhereInput updatedAtNot(String updatedAtNot) {

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

    public FailoverExecutionWhereInput updatedAtNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPDATED_AT_NOT);
        return this;
    }

    public FailoverExecutionWhereInput updatedAtNot_ExplictlyNonNull() {
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

    public FailoverExecutionWhereInput updatedAtNotIn(List<String> updatedAtNotIn) {

        this.updatedAtNotIn = updatedAtNotIn;
        return this;
    }

    public FailoverExecutionWhereInput addUpdatedAtNotInItem(String updatedAtNotInItem) {
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

    public FailoverExecutionWhereInput updatedAtNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPDATED_AT_NOT_IN);
        return this;
    }

    public FailoverExecutionWhereInput updatedAtNotIn_ExplictlyNonNull() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FailoverExecutionWhereInput failoverExecutionWhereInput = (FailoverExecutionWhereInput) o;
        return Objects.equals(this.AND, failoverExecutionWhereInput.AND)
                && Objects.equals(this.NOT, failoverExecutionWhereInput.NOT)
                && Objects.equals(this.OR, failoverExecutionWhereInput.OR)
                && Objects.equals(this.createdAt, failoverExecutionWhereInput.createdAt)
                && Objects.equals(this.createdAtGt, failoverExecutionWhereInput.createdAtGt)
                && Objects.equals(this.createdAtGte, failoverExecutionWhereInput.createdAtGte)
                && Objects.equals(this.createdAtIn, failoverExecutionWhereInput.createdAtIn)
                && Objects.equals(this.createdAtLt, failoverExecutionWhereInput.createdAtLt)
                && Objects.equals(this.createdAtLte, failoverExecutionWhereInput.createdAtLte)
                && Objects.equals(this.createdAtNot, failoverExecutionWhereInput.createdAtNot)
                && Objects.equals(this.createdAtNotIn, failoverExecutionWhereInput.createdAtNotIn)
                && Objects.equals(
                        this.entityAsyncStatus, failoverExecutionWhereInput.entityAsyncStatus)
                && Objects.equals(
                        this.entityAsyncStatusIn, failoverExecutionWhereInput.entityAsyncStatusIn)
                && Objects.equals(
                        this.entityAsyncStatusNot, failoverExecutionWhereInput.entityAsyncStatusNot)
                && Objects.equals(
                        this.entityAsyncStatusNotIn,
                        failoverExecutionWhereInput.entityAsyncStatusNotIn)
                && Objects.equals(
                        this.externalCloudtower, failoverExecutionWhereInput.externalCloudtower)
                && Objects.equals(this.finishedAt, failoverExecutionWhereInput.finishedAt)
                && Objects.equals(this.finishedAtGt, failoverExecutionWhereInput.finishedAtGt)
                && Objects.equals(this.finishedAtGte, failoverExecutionWhereInput.finishedAtGte)
                && Objects.equals(this.finishedAtIn, failoverExecutionWhereInput.finishedAtIn)
                && Objects.equals(this.finishedAtLt, failoverExecutionWhereInput.finishedAtLt)
                && Objects.equals(this.finishedAtLte, failoverExecutionWhereInput.finishedAtLte)
                && Objects.equals(this.finishedAtNot, failoverExecutionWhereInput.finishedAtNot)
                && Objects.equals(this.finishedAtNotIn, failoverExecutionWhereInput.finishedAtNotIn)
                && Objects.equals(this.id, failoverExecutionWhereInput.id)
                && Objects.equals(this.idContains, failoverExecutionWhereInput.idContains)
                && Objects.equals(this.idEndsWith, failoverExecutionWhereInput.idEndsWith)
                && Objects.equals(this.idGt, failoverExecutionWhereInput.idGt)
                && Objects.equals(this.idGte, failoverExecutionWhereInput.idGte)
                && Objects.equals(this.idIn, failoverExecutionWhereInput.idIn)
                && Objects.equals(this.idLt, failoverExecutionWhereInput.idLt)
                && Objects.equals(this.idLte, failoverExecutionWhereInput.idLte)
                && Objects.equals(this.idNot, failoverExecutionWhereInput.idNot)
                && Objects.equals(this.idNotContains, failoverExecutionWhereInput.idNotContains)
                && Objects.equals(this.idNotEndsWith, failoverExecutionWhereInput.idNotEndsWith)
                && Objects.equals(this.idNotIn, failoverExecutionWhereInput.idNotIn)
                && Objects.equals(this.idNotStartsWith, failoverExecutionWhereInput.idNotStartsWith)
                && Objects.equals(this.idStartsWith, failoverExecutionWhereInput.idStartsWith)
                && Objects.equals(
                        this.isSyncReplication, failoverExecutionWhereInput.isSyncReplication)
                && Objects.equals(
                        this.isSyncReplicationNot, failoverExecutionWhereInput.isSyncReplicationNot)
                && Objects.equals(this.isTestMode, failoverExecutionWhereInput.isTestMode)
                && Objects.equals(this.isTestModeNot, failoverExecutionWhereInput.isTestModeNot)
                && Objects.equals(
                        this.replicationFailoverTargetExecutionsEvery,
                        failoverExecutionWhereInput.replicationFailoverTargetExecutionsEvery)
                && Objects.equals(
                        this.replicationFailoverTargetExecutionsNone,
                        failoverExecutionWhereInput.replicationFailoverTargetExecutionsNone)
                && Objects.equals(
                        this.replicationFailoverTargetExecutionsSome,
                        failoverExecutionWhereInput.replicationFailoverTargetExecutionsSome)
                && Objects.equals(
                        this.replicationService, failoverExecutionWhereInput.replicationService)
                && Objects.equals(this.resourceVersion, failoverExecutionWhereInput.resourceVersion)
                && Objects.equals(
                        this.resourceVersionGt, failoverExecutionWhereInput.resourceVersionGt)
                && Objects.equals(
                        this.resourceVersionGte, failoverExecutionWhereInput.resourceVersionGte)
                && Objects.equals(
                        this.resourceVersionIn, failoverExecutionWhereInput.resourceVersionIn)
                && Objects.equals(
                        this.resourceVersionLt, failoverExecutionWhereInput.resourceVersionLt)
                && Objects.equals(
                        this.resourceVersionLte, failoverExecutionWhereInput.resourceVersionLte)
                && Objects.equals(
                        this.resourceVersionNot, failoverExecutionWhereInput.resourceVersionNot)
                && Objects.equals(
                        this.resourceVersionNotIn, failoverExecutionWhereInput.resourceVersionNotIn)
                && Objects.equals(this.shutdownMode, failoverExecutionWhereInput.shutdownMode)
                && Objects.equals(this.shutdownModeIn, failoverExecutionWhereInput.shutdownModeIn)
                && Objects.equals(this.shutdownModeNot, failoverExecutionWhereInput.shutdownModeNot)
                && Objects.equals(
                        this.shutdownModeNotIn, failoverExecutionWhereInput.shutdownModeNotIn)
                && Objects.equals(this.state, failoverExecutionWhereInput.state)
                && Objects.equals(this.stateIn, failoverExecutionWhereInput.stateIn)
                && Objects.equals(this.stateNot, failoverExecutionWhereInput.stateNot)
                && Objects.equals(this.stateNotIn, failoverExecutionWhereInput.stateNotIn)
                && Objects.equals(this.successJobCount, failoverExecutionWhereInput.successJobCount)
                && Objects.equals(
                        this.successJobCountGt, failoverExecutionWhereInput.successJobCountGt)
                && Objects.equals(
                        this.successJobCountGte, failoverExecutionWhereInput.successJobCountGte)
                && Objects.equals(
                        this.successJobCountIn, failoverExecutionWhereInput.successJobCountIn)
                && Objects.equals(
                        this.successJobCountLt, failoverExecutionWhereInput.successJobCountLt)
                && Objects.equals(
                        this.successJobCountLte, failoverExecutionWhereInput.successJobCountLte)
                && Objects.equals(
                        this.successJobCountNot, failoverExecutionWhereInput.successJobCountNot)
                && Objects.equals(
                        this.successJobCountNotIn, failoverExecutionWhereInput.successJobCountNotIn)
                && Objects.equals(this.totalJobCount, failoverExecutionWhereInput.totalJobCount)
                && Objects.equals(this.totalJobCountGt, failoverExecutionWhereInput.totalJobCountGt)
                && Objects.equals(
                        this.totalJobCountGte, failoverExecutionWhereInput.totalJobCountGte)
                && Objects.equals(this.totalJobCountIn, failoverExecutionWhereInput.totalJobCountIn)
                && Objects.equals(this.totalJobCountLt, failoverExecutionWhereInput.totalJobCountLt)
                && Objects.equals(
                        this.totalJobCountLte, failoverExecutionWhereInput.totalJobCountLte)
                && Objects.equals(
                        this.totalJobCountNot, failoverExecutionWhereInput.totalJobCountNot)
                && Objects.equals(
                        this.totalJobCountNotIn, failoverExecutionWhereInput.totalJobCountNotIn)
                && Objects.equals(this.updatedAt, failoverExecutionWhereInput.updatedAt)
                && Objects.equals(this.updatedAtGt, failoverExecutionWhereInput.updatedAtGt)
                && Objects.equals(this.updatedAtGte, failoverExecutionWhereInput.updatedAtGte)
                && Objects.equals(this.updatedAtIn, failoverExecutionWhereInput.updatedAtIn)
                && Objects.equals(this.updatedAtLt, failoverExecutionWhereInput.updatedAtLt)
                && Objects.equals(this.updatedAtLte, failoverExecutionWhereInput.updatedAtLte)
                && Objects.equals(this.updatedAtNot, failoverExecutionWhereInput.updatedAtNot)
                && Objects.equals(this.updatedAtNotIn, failoverExecutionWhereInput.updatedAtNotIn);
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
                createdAt,
                createdAtGt,
                createdAtGte,
                createdAtIn,
                createdAtLt,
                createdAtLte,
                createdAtNot,
                createdAtNotIn,
                entityAsyncStatus,
                entityAsyncStatusIn,
                entityAsyncStatusNot,
                entityAsyncStatusNotIn,
                externalCloudtower,
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
                isSyncReplication,
                isSyncReplicationNot,
                isTestMode,
                isTestModeNot,
                replicationFailoverTargetExecutionsEvery,
                replicationFailoverTargetExecutionsNone,
                replicationFailoverTargetExecutionsSome,
                replicationService,
                resourceVersion,
                resourceVersionGt,
                resourceVersionGte,
                resourceVersionIn,
                resourceVersionLt,
                resourceVersionLte,
                resourceVersionNot,
                resourceVersionNotIn,
                shutdownMode,
                shutdownModeIn,
                shutdownModeNot,
                shutdownModeNotIn,
                state,
                stateIn,
                stateNot,
                stateNotIn,
                successJobCount,
                successJobCountGt,
                successJobCountGte,
                successJobCountIn,
                successJobCountLt,
                successJobCountLte,
                successJobCountNot,
                successJobCountNotIn,
                totalJobCount,
                totalJobCountGt,
                totalJobCountGte,
                totalJobCountIn,
                totalJobCountLt,
                totalJobCountLte,
                totalJobCountNot,
                totalJobCountNotIn,
                updatedAt,
                updatedAtGt,
                updatedAtGte,
                updatedAtIn,
                updatedAtLt,
                updatedAtLte,
                updatedAtNot,
                updatedAtNotIn);
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
        sb.append("class FailoverExecutionWhereInput {\n");
        sb.append("    AND: ").append(toIndentedString(AND)).append("\n");
        sb.append("    NOT: ").append(toIndentedString(NOT)).append("\n");
        sb.append("    OR: ").append(toIndentedString(OR)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    createdAtGt: ").append(toIndentedString(createdAtGt)).append("\n");
        sb.append("    createdAtGte: ").append(toIndentedString(createdAtGte)).append("\n");
        sb.append("    createdAtIn: ").append(toIndentedString(createdAtIn)).append("\n");
        sb.append("    createdAtLt: ").append(toIndentedString(createdAtLt)).append("\n");
        sb.append("    createdAtLte: ").append(toIndentedString(createdAtLte)).append("\n");
        sb.append("    createdAtNot: ").append(toIndentedString(createdAtNot)).append("\n");
        sb.append("    createdAtNotIn: ").append(toIndentedString(createdAtNotIn)).append("\n");
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
        sb.append("    isSyncReplication: ")
                .append(toIndentedString(isSyncReplication))
                .append("\n");
        sb.append("    isSyncReplicationNot: ")
                .append(toIndentedString(isSyncReplicationNot))
                .append("\n");
        sb.append("    isTestMode: ").append(toIndentedString(isTestMode)).append("\n");
        sb.append("    isTestModeNot: ").append(toIndentedString(isTestModeNot)).append("\n");
        sb.append("    replicationFailoverTargetExecutionsEvery: ")
                .append(toIndentedString(replicationFailoverTargetExecutionsEvery))
                .append("\n");
        sb.append("    replicationFailoverTargetExecutionsNone: ")
                .append(toIndentedString(replicationFailoverTargetExecutionsNone))
                .append("\n");
        sb.append("    replicationFailoverTargetExecutionsSome: ")
                .append(toIndentedString(replicationFailoverTargetExecutionsSome))
                .append("\n");
        sb.append("    replicationService: ")
                .append(toIndentedString(replicationService))
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
        sb.append("    shutdownMode: ").append(toIndentedString(shutdownMode)).append("\n");
        sb.append("    shutdownModeIn: ").append(toIndentedString(shutdownModeIn)).append("\n");
        sb.append("    shutdownModeNot: ").append(toIndentedString(shutdownModeNot)).append("\n");
        sb.append("    shutdownModeNotIn: ")
                .append(toIndentedString(shutdownModeNotIn))
                .append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    stateIn: ").append(toIndentedString(stateIn)).append("\n");
        sb.append("    stateNot: ").append(toIndentedString(stateNot)).append("\n");
        sb.append("    stateNotIn: ").append(toIndentedString(stateNotIn)).append("\n");
        sb.append("    successJobCount: ").append(toIndentedString(successJobCount)).append("\n");
        sb.append("    successJobCountGt: ")
                .append(toIndentedString(successJobCountGt))
                .append("\n");
        sb.append("    successJobCountGte: ")
                .append(toIndentedString(successJobCountGte))
                .append("\n");
        sb.append("    successJobCountIn: ")
                .append(toIndentedString(successJobCountIn))
                .append("\n");
        sb.append("    successJobCountLt: ")
                .append(toIndentedString(successJobCountLt))
                .append("\n");
        sb.append("    successJobCountLte: ")
                .append(toIndentedString(successJobCountLte))
                .append("\n");
        sb.append("    successJobCountNot: ")
                .append(toIndentedString(successJobCountNot))
                .append("\n");
        sb.append("    successJobCountNotIn: ")
                .append(toIndentedString(successJobCountNotIn))
                .append("\n");
        sb.append("    totalJobCount: ").append(toIndentedString(totalJobCount)).append("\n");
        sb.append("    totalJobCountGt: ").append(toIndentedString(totalJobCountGt)).append("\n");
        sb.append("    totalJobCountGte: ").append(toIndentedString(totalJobCountGte)).append("\n");
        sb.append("    totalJobCountIn: ").append(toIndentedString(totalJobCountIn)).append("\n");
        sb.append("    totalJobCountLt: ").append(toIndentedString(totalJobCountLt)).append("\n");
        sb.append("    totalJobCountLte: ").append(toIndentedString(totalJobCountLte)).append("\n");
        sb.append("    totalJobCountNot: ").append(toIndentedString(totalJobCountNot)).append("\n");
        sb.append("    totalJobCountNotIn: ")
                .append(toIndentedString(totalJobCountNotIn))
                .append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    updatedAtGt: ").append(toIndentedString(updatedAtGt)).append("\n");
        sb.append("    updatedAtGte: ").append(toIndentedString(updatedAtGte)).append("\n");
        sb.append("    updatedAtIn: ").append(toIndentedString(updatedAtIn)).append("\n");
        sb.append("    updatedAtLt: ").append(toIndentedString(updatedAtLt)).append("\n");
        sb.append("    updatedAtLte: ").append(toIndentedString(updatedAtLte)).append("\n");
        sb.append("    updatedAtNot: ").append(toIndentedString(updatedAtNot)).append("\n");
        sb.append("    updatedAtNotIn: ").append(toIndentedString(updatedAtNotIn)).append("\n");
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

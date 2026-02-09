package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** FailbackExecutionWhereInput */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class FailbackExecutionWhereInput
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_A_N_D = "AND";

    @SerializedName(SERIALIZED_NAME_A_N_D)
    private List<FailbackExecutionWhereInput> AND = null;

    public static final String SERIALIZED_NAME_N_O_T = "NOT";

    @SerializedName(SERIALIZED_NAME_N_O_T)
    private List<FailbackExecutionWhereInput> NOT = null;

    public static final String SERIALIZED_NAME_O_R = "OR";

    @SerializedName(SERIALIZED_NAME_O_R)
    private List<FailbackExecutionWhereInput> OR = null;

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

    public static final String SERIALIZED_NAME_REPLICATION_FAILBACK_TARGET_EXECUTIONS_EVERY =
            "replication_failback_target_executions_every";

    @SerializedName(SERIALIZED_NAME_REPLICATION_FAILBACK_TARGET_EXECUTIONS_EVERY)
    private ReplicationFailbackTargetExecutionWhereInput replicationFailbackTargetExecutionsEvery;

    public static final String SERIALIZED_NAME_REPLICATION_FAILBACK_TARGET_EXECUTIONS_NONE =
            "replication_failback_target_executions_none";

    @SerializedName(SERIALIZED_NAME_REPLICATION_FAILBACK_TARGET_EXECUTIONS_NONE)
    private ReplicationFailbackTargetExecutionWhereInput replicationFailbackTargetExecutionsNone;

    public static final String SERIALIZED_NAME_REPLICATION_FAILBACK_TARGET_EXECUTIONS_SOME =
            "replication_failback_target_executions_some";

    @SerializedName(SERIALIZED_NAME_REPLICATION_FAILBACK_TARGET_EXECUTIONS_SOME)
    private ReplicationFailbackTargetExecutionWhereInput replicationFailbackTargetExecutionsSome;

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

    public FailbackExecutionWhereInput() {}

    public FailbackExecutionWhereInput AND(List<FailbackExecutionWhereInput> AND) {

        this.AND = AND;
        return this;
    }

    public FailbackExecutionWhereInput addANDItem(FailbackExecutionWhereInput ANDItem) {
        if (this.AND == null) {
            this.AND = new ArrayList<FailbackExecutionWhereInput>();
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
    public List<FailbackExecutionWhereInput> getAND() {
        return AND;
    }

    public void setAND(List<FailbackExecutionWhereInput> AND) {
        this.AND = AND;
    }

    public FailbackExecutionWhereInput AND_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_A_N_D);
        return this;
    }

    public FailbackExecutionWhereInput AND_ExplictlyNonNull() {
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

    public FailbackExecutionWhereInput NOT(List<FailbackExecutionWhereInput> NOT) {

        this.NOT = NOT;
        return this;
    }

    public FailbackExecutionWhereInput addNOTItem(FailbackExecutionWhereInput NOTItem) {
        if (this.NOT == null) {
            this.NOT = new ArrayList<FailbackExecutionWhereInput>();
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
    public List<FailbackExecutionWhereInput> getNOT() {
        return NOT;
    }

    public void setNOT(List<FailbackExecutionWhereInput> NOT) {
        this.NOT = NOT;
    }

    public FailbackExecutionWhereInput NOT_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_N_O_T);
        return this;
    }

    public FailbackExecutionWhereInput NOT_ExplictlyNonNull() {
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

    public FailbackExecutionWhereInput OR(List<FailbackExecutionWhereInput> OR) {

        this.OR = OR;
        return this;
    }

    public FailbackExecutionWhereInput addORItem(FailbackExecutionWhereInput ORItem) {
        if (this.OR == null) {
            this.OR = new ArrayList<FailbackExecutionWhereInput>();
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
    public List<FailbackExecutionWhereInput> getOR() {
        return OR;
    }

    public void setOR(List<FailbackExecutionWhereInput> OR) {
        this.OR = OR;
    }

    public FailbackExecutionWhereInput OR_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_O_R);
        return this;
    }

    public FailbackExecutionWhereInput OR_ExplictlyNonNull() {
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

    public FailbackExecutionWhereInput createdAt(String createdAt) {

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

    public FailbackExecutionWhereInput createdAt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT);
        return this;
    }

    public FailbackExecutionWhereInput createdAt_ExplictlyNonNull() {
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

    public FailbackExecutionWhereInput createdAtGt(String createdAtGt) {

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

    public FailbackExecutionWhereInput createdAtGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_GT);
        return this;
    }

    public FailbackExecutionWhereInput createdAtGt_ExplictlyNonNull() {
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

    public FailbackExecutionWhereInput createdAtGte(String createdAtGte) {

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

    public FailbackExecutionWhereInput createdAtGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_GTE);
        return this;
    }

    public FailbackExecutionWhereInput createdAtGte_ExplictlyNonNull() {
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

    public FailbackExecutionWhereInput createdAtIn(List<String> createdAtIn) {

        this.createdAtIn = createdAtIn;
        return this;
    }

    public FailbackExecutionWhereInput addCreatedAtInItem(String createdAtInItem) {
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

    public FailbackExecutionWhereInput createdAtIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_IN);
        return this;
    }

    public FailbackExecutionWhereInput createdAtIn_ExplictlyNonNull() {
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

    public FailbackExecutionWhereInput createdAtLt(String createdAtLt) {

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

    public FailbackExecutionWhereInput createdAtLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_LT);
        return this;
    }

    public FailbackExecutionWhereInput createdAtLt_ExplictlyNonNull() {
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

    public FailbackExecutionWhereInput createdAtLte(String createdAtLte) {

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

    public FailbackExecutionWhereInput createdAtLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_LTE);
        return this;
    }

    public FailbackExecutionWhereInput createdAtLte_ExplictlyNonNull() {
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

    public FailbackExecutionWhereInput createdAtNot(String createdAtNot) {

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

    public FailbackExecutionWhereInput createdAtNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_NOT);
        return this;
    }

    public FailbackExecutionWhereInput createdAtNot_ExplictlyNonNull() {
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

    public FailbackExecutionWhereInput createdAtNotIn(List<String> createdAtNotIn) {

        this.createdAtNotIn = createdAtNotIn;
        return this;
    }

    public FailbackExecutionWhereInput addCreatedAtNotInItem(String createdAtNotInItem) {
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

    public FailbackExecutionWhereInput createdAtNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_NOT_IN);
        return this;
    }

    public FailbackExecutionWhereInput createdAtNotIn_ExplictlyNonNull() {
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

    public FailbackExecutionWhereInput entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {

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

    public FailbackExecutionWhereInput entityAsyncStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        return this;
    }

    public FailbackExecutionWhereInput entityAsyncStatus_ExplictlyNonNull() {
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

    public FailbackExecutionWhereInput entityAsyncStatusIn(
            List<EntityAsyncStatus> entityAsyncStatusIn) {

        this.entityAsyncStatusIn = entityAsyncStatusIn;
        return this;
    }

    public FailbackExecutionWhereInput addEntityAsyncStatusInItem(
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

    public FailbackExecutionWhereInput entityAsyncStatusIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_IN);
        return this;
    }

    public FailbackExecutionWhereInput entityAsyncStatusIn_ExplictlyNonNull() {
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

    public FailbackExecutionWhereInput entityAsyncStatusNot(
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

    public FailbackExecutionWhereInput entityAsyncStatusNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT);
        return this;
    }

    public FailbackExecutionWhereInput entityAsyncStatusNot_ExplictlyNonNull() {
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

    public FailbackExecutionWhereInput entityAsyncStatusNotIn(
            List<EntityAsyncStatus> entityAsyncStatusNotIn) {

        this.entityAsyncStatusNotIn = entityAsyncStatusNotIn;
        return this;
    }

    public FailbackExecutionWhereInput addEntityAsyncStatusNotInItem(
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

    public FailbackExecutionWhereInput entityAsyncStatusNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT_IN);
        return this;
    }

    public FailbackExecutionWhereInput entityAsyncStatusNotIn_ExplictlyNonNull() {
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

    public FailbackExecutionWhereInput externalCloudtower(
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

    public FailbackExecutionWhereInput externalCloudtower_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXTERNAL_CLOUDTOWER);
        return this;
    }

    public FailbackExecutionWhereInput externalCloudtower_ExplictlyNonNull() {
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

    public FailbackExecutionWhereInput finishedAt(String finishedAt) {

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

    public FailbackExecutionWhereInput finishedAt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FINISHED_AT);
        return this;
    }

    public FailbackExecutionWhereInput finishedAt_ExplictlyNonNull() {
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

    public FailbackExecutionWhereInput finishedAtGt(String finishedAtGt) {

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

    public FailbackExecutionWhereInput finishedAtGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FINISHED_AT_GT);
        return this;
    }

    public FailbackExecutionWhereInput finishedAtGt_ExplictlyNonNull() {
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

    public FailbackExecutionWhereInput finishedAtGte(String finishedAtGte) {

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

    public FailbackExecutionWhereInput finishedAtGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FINISHED_AT_GTE);
        return this;
    }

    public FailbackExecutionWhereInput finishedAtGte_ExplictlyNonNull() {
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

    public FailbackExecutionWhereInput finishedAtIn(List<String> finishedAtIn) {

        this.finishedAtIn = finishedAtIn;
        return this;
    }

    public FailbackExecutionWhereInput addFinishedAtInItem(String finishedAtInItem) {
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

    public FailbackExecutionWhereInput finishedAtIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FINISHED_AT_IN);
        return this;
    }

    public FailbackExecutionWhereInput finishedAtIn_ExplictlyNonNull() {
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

    public FailbackExecutionWhereInput finishedAtLt(String finishedAtLt) {

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

    public FailbackExecutionWhereInput finishedAtLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FINISHED_AT_LT);
        return this;
    }

    public FailbackExecutionWhereInput finishedAtLt_ExplictlyNonNull() {
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

    public FailbackExecutionWhereInput finishedAtLte(String finishedAtLte) {

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

    public FailbackExecutionWhereInput finishedAtLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FINISHED_AT_LTE);
        return this;
    }

    public FailbackExecutionWhereInput finishedAtLte_ExplictlyNonNull() {
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

    public FailbackExecutionWhereInput finishedAtNot(String finishedAtNot) {

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

    public FailbackExecutionWhereInput finishedAtNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FINISHED_AT_NOT);
        return this;
    }

    public FailbackExecutionWhereInput finishedAtNot_ExplictlyNonNull() {
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

    public FailbackExecutionWhereInput finishedAtNotIn(List<String> finishedAtNotIn) {

        this.finishedAtNotIn = finishedAtNotIn;
        return this;
    }

    public FailbackExecutionWhereInput addFinishedAtNotInItem(String finishedAtNotInItem) {
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

    public FailbackExecutionWhereInput finishedAtNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FINISHED_AT_NOT_IN);
        return this;
    }

    public FailbackExecutionWhereInput finishedAtNotIn_ExplictlyNonNull() {
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

    public FailbackExecutionWhereInput id(String id) {

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

    public FailbackExecutionWhereInput id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public FailbackExecutionWhereInput id_ExplictlyNonNull() {
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

    public FailbackExecutionWhereInput idContains(String idContains) {

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

    public FailbackExecutionWhereInput idContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_CONTAINS);
        return this;
    }

    public FailbackExecutionWhereInput idContains_ExplictlyNonNull() {
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

    public FailbackExecutionWhereInput idEndsWith(String idEndsWith) {

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

    public FailbackExecutionWhereInput idEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_ENDS_WITH);
        return this;
    }

    public FailbackExecutionWhereInput idEndsWith_ExplictlyNonNull() {
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

    public FailbackExecutionWhereInput idGt(String idGt) {

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

    public FailbackExecutionWhereInput idGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GT);
        return this;
    }

    public FailbackExecutionWhereInput idGt_ExplictlyNonNull() {
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

    public FailbackExecutionWhereInput idGte(String idGte) {

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

    public FailbackExecutionWhereInput idGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GTE);
        return this;
    }

    public FailbackExecutionWhereInput idGte_ExplictlyNonNull() {
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

    public FailbackExecutionWhereInput idIn(List<String> idIn) {

        this.idIn = idIn;
        return this;
    }

    public FailbackExecutionWhereInput addIdInItem(String idInItem) {
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

    public FailbackExecutionWhereInput idIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_IN);
        return this;
    }

    public FailbackExecutionWhereInput idIn_ExplictlyNonNull() {
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

    public FailbackExecutionWhereInput idLt(String idLt) {

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

    public FailbackExecutionWhereInput idLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LT);
        return this;
    }

    public FailbackExecutionWhereInput idLt_ExplictlyNonNull() {
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

    public FailbackExecutionWhereInput idLte(String idLte) {

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

    public FailbackExecutionWhereInput idLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LTE);
        return this;
    }

    public FailbackExecutionWhereInput idLte_ExplictlyNonNull() {
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

    public FailbackExecutionWhereInput idNot(String idNot) {

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

    public FailbackExecutionWhereInput idNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT);
        return this;
    }

    public FailbackExecutionWhereInput idNot_ExplictlyNonNull() {
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

    public FailbackExecutionWhereInput idNotContains(String idNotContains) {

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

    public FailbackExecutionWhereInput idNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_CONTAINS);
        return this;
    }

    public FailbackExecutionWhereInput idNotContains_ExplictlyNonNull() {
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

    public FailbackExecutionWhereInput idNotEndsWith(String idNotEndsWith) {

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

    public FailbackExecutionWhereInput idNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
        return this;
    }

    public FailbackExecutionWhereInput idNotEndsWith_ExplictlyNonNull() {
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

    public FailbackExecutionWhereInput idNotIn(List<String> idNotIn) {

        this.idNotIn = idNotIn;
        return this;
    }

    public FailbackExecutionWhereInput addIdNotInItem(String idNotInItem) {
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

    public FailbackExecutionWhereInput idNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_IN);
        return this;
    }

    public FailbackExecutionWhereInput idNotIn_ExplictlyNonNull() {
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

    public FailbackExecutionWhereInput idNotStartsWith(String idNotStartsWith) {

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

    public FailbackExecutionWhereInput idNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
        return this;
    }

    public FailbackExecutionWhereInput idNotStartsWith_ExplictlyNonNull() {
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

    public FailbackExecutionWhereInput idStartsWith(String idStartsWith) {

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

    public FailbackExecutionWhereInput idStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_STARTS_WITH);
        return this;
    }

    public FailbackExecutionWhereInput idStartsWith_ExplictlyNonNull() {
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

    public FailbackExecutionWhereInput isSyncReplication(Boolean isSyncReplication) {

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

    public FailbackExecutionWhereInput isSyncReplication_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IS_SYNC_REPLICATION);
        return this;
    }

    public FailbackExecutionWhereInput isSyncReplication_ExplictlyNonNull() {
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

    public FailbackExecutionWhereInput isSyncReplicationNot(Boolean isSyncReplicationNot) {

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

    public FailbackExecutionWhereInput isSyncReplicationNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IS_SYNC_REPLICATION_NOT);
        return this;
    }

    public FailbackExecutionWhereInput isSyncReplicationNot_ExplictlyNonNull() {
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

    public FailbackExecutionWhereInput replicationFailbackTargetExecutionsEvery(
            ReplicationFailbackTargetExecutionWhereInput replicationFailbackTargetExecutionsEvery) {

        this.replicationFailbackTargetExecutionsEvery = replicationFailbackTargetExecutionsEvery;
        return this;
    }

    /**
     * Get replicationFailbackTargetExecutionsEvery
     *
     * @return replicationFailbackTargetExecutionsEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ReplicationFailbackTargetExecutionWhereInput
            getReplicationFailbackTargetExecutionsEvery() {
        return replicationFailbackTargetExecutionsEvery;
    }

    public void setReplicationFailbackTargetExecutionsEvery(
            ReplicationFailbackTargetExecutionWhereInput replicationFailbackTargetExecutionsEvery) {
        this.replicationFailbackTargetExecutionsEvery = replicationFailbackTargetExecutionsEvery;
    }

    public FailbackExecutionWhereInput replicationFailbackTargetExecutionsEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICATION_FAILBACK_TARGET_EXECUTIONS_EVERY);
        return this;
    }

    public FailbackExecutionWhereInput replicationFailbackTargetExecutionsEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REPLICATION_FAILBACK_TARGET_EXECUTIONS_EVERY);
        return this;
    }

    public void setReplicationFailbackTargetExecutionsEvery_IsExplictlyNull(
            boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REPLICATION_FAILBACK_TARGET_EXECUTIONS_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REPLICATION_FAILBACK_TARGET_EXECUTIONS_EVERY);
        }
    }

    public boolean getReplicationFailbackTargetExecutionsEvery_IsExplictlyNull() {
        return this._isPresent_.contains(
                SERIALIZED_NAME_REPLICATION_FAILBACK_TARGET_EXECUTIONS_EVERY);
    }

    public FailbackExecutionWhereInput replicationFailbackTargetExecutionsNone(
            ReplicationFailbackTargetExecutionWhereInput replicationFailbackTargetExecutionsNone) {

        this.replicationFailbackTargetExecutionsNone = replicationFailbackTargetExecutionsNone;
        return this;
    }

    /**
     * Get replicationFailbackTargetExecutionsNone
     *
     * @return replicationFailbackTargetExecutionsNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ReplicationFailbackTargetExecutionWhereInput
            getReplicationFailbackTargetExecutionsNone() {
        return replicationFailbackTargetExecutionsNone;
    }

    public void setReplicationFailbackTargetExecutionsNone(
            ReplicationFailbackTargetExecutionWhereInput replicationFailbackTargetExecutionsNone) {
        this.replicationFailbackTargetExecutionsNone = replicationFailbackTargetExecutionsNone;
    }

    public FailbackExecutionWhereInput replicationFailbackTargetExecutionsNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICATION_FAILBACK_TARGET_EXECUTIONS_NONE);
        return this;
    }

    public FailbackExecutionWhereInput replicationFailbackTargetExecutionsNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REPLICATION_FAILBACK_TARGET_EXECUTIONS_NONE);
        return this;
    }

    public void setReplicationFailbackTargetExecutionsNone_IsExplictlyNull(
            boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REPLICATION_FAILBACK_TARGET_EXECUTIONS_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REPLICATION_FAILBACK_TARGET_EXECUTIONS_NONE);
        }
    }

    public boolean getReplicationFailbackTargetExecutionsNone_IsExplictlyNull() {
        return this._isPresent_.contains(
                SERIALIZED_NAME_REPLICATION_FAILBACK_TARGET_EXECUTIONS_NONE);
    }

    public FailbackExecutionWhereInput replicationFailbackTargetExecutionsSome(
            ReplicationFailbackTargetExecutionWhereInput replicationFailbackTargetExecutionsSome) {

        this.replicationFailbackTargetExecutionsSome = replicationFailbackTargetExecutionsSome;
        return this;
    }

    /**
     * Get replicationFailbackTargetExecutionsSome
     *
     * @return replicationFailbackTargetExecutionsSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ReplicationFailbackTargetExecutionWhereInput
            getReplicationFailbackTargetExecutionsSome() {
        return replicationFailbackTargetExecutionsSome;
    }

    public void setReplicationFailbackTargetExecutionsSome(
            ReplicationFailbackTargetExecutionWhereInput replicationFailbackTargetExecutionsSome) {
        this.replicationFailbackTargetExecutionsSome = replicationFailbackTargetExecutionsSome;
    }

    public FailbackExecutionWhereInput replicationFailbackTargetExecutionsSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICATION_FAILBACK_TARGET_EXECUTIONS_SOME);
        return this;
    }

    public FailbackExecutionWhereInput replicationFailbackTargetExecutionsSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REPLICATION_FAILBACK_TARGET_EXECUTIONS_SOME);
        return this;
    }

    public void setReplicationFailbackTargetExecutionsSome_IsExplictlyNull(
            boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REPLICATION_FAILBACK_TARGET_EXECUTIONS_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REPLICATION_FAILBACK_TARGET_EXECUTIONS_SOME);
        }
    }

    public boolean getReplicationFailbackTargetExecutionsSome_IsExplictlyNull() {
        return this._isPresent_.contains(
                SERIALIZED_NAME_REPLICATION_FAILBACK_TARGET_EXECUTIONS_SOME);
    }

    public FailbackExecutionWhereInput replicationService(
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

    public FailbackExecutionWhereInput replicationService_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICATION_SERVICE);
        return this;
    }

    public FailbackExecutionWhereInput replicationService_ExplictlyNonNull() {
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

    public FailbackExecutionWhereInput resourceVersion(Integer resourceVersion) {

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

    public FailbackExecutionWhereInput resourceVersion_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_VERSION);
        return this;
    }

    public FailbackExecutionWhereInput resourceVersion_ExplictlyNonNull() {
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

    public FailbackExecutionWhereInput resourceVersionGt(Integer resourceVersionGt) {

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

    public FailbackExecutionWhereInput resourceVersionGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_VERSION_GT);
        return this;
    }

    public FailbackExecutionWhereInput resourceVersionGt_ExplictlyNonNull() {
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

    public FailbackExecutionWhereInput resourceVersionGte(Integer resourceVersionGte) {

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

    public FailbackExecutionWhereInput resourceVersionGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_VERSION_GTE);
        return this;
    }

    public FailbackExecutionWhereInput resourceVersionGte_ExplictlyNonNull() {
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

    public FailbackExecutionWhereInput resourceVersionIn(List<Integer> resourceVersionIn) {

        this.resourceVersionIn = resourceVersionIn;
        return this;
    }

    public FailbackExecutionWhereInput addResourceVersionInItem(Integer resourceVersionInItem) {
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

    public FailbackExecutionWhereInput resourceVersionIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_VERSION_IN);
        return this;
    }

    public FailbackExecutionWhereInput resourceVersionIn_ExplictlyNonNull() {
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

    public FailbackExecutionWhereInput resourceVersionLt(Integer resourceVersionLt) {

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

    public FailbackExecutionWhereInput resourceVersionLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_VERSION_LT);
        return this;
    }

    public FailbackExecutionWhereInput resourceVersionLt_ExplictlyNonNull() {
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

    public FailbackExecutionWhereInput resourceVersionLte(Integer resourceVersionLte) {

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

    public FailbackExecutionWhereInput resourceVersionLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_VERSION_LTE);
        return this;
    }

    public FailbackExecutionWhereInput resourceVersionLte_ExplictlyNonNull() {
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

    public FailbackExecutionWhereInput resourceVersionNot(Integer resourceVersionNot) {

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

    public FailbackExecutionWhereInput resourceVersionNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_VERSION_NOT);
        return this;
    }

    public FailbackExecutionWhereInput resourceVersionNot_ExplictlyNonNull() {
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

    public FailbackExecutionWhereInput resourceVersionNotIn(List<Integer> resourceVersionNotIn) {

        this.resourceVersionNotIn = resourceVersionNotIn;
        return this;
    }

    public FailbackExecutionWhereInput addResourceVersionNotInItem(
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

    public FailbackExecutionWhereInput resourceVersionNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_VERSION_NOT_IN);
        return this;
    }

    public FailbackExecutionWhereInput resourceVersionNotIn_ExplictlyNonNull() {
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

    public FailbackExecutionWhereInput state(BackupExecutionState state) {

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

    public FailbackExecutionWhereInput state_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATE);
        return this;
    }

    public FailbackExecutionWhereInput state_ExplictlyNonNull() {
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

    public FailbackExecutionWhereInput stateIn(List<BackupExecutionState> stateIn) {

        this.stateIn = stateIn;
        return this;
    }

    public FailbackExecutionWhereInput addStateInItem(BackupExecutionState stateInItem) {
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

    public FailbackExecutionWhereInput stateIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATE_IN);
        return this;
    }

    public FailbackExecutionWhereInput stateIn_ExplictlyNonNull() {
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

    public FailbackExecutionWhereInput stateNot(BackupExecutionState stateNot) {

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

    public FailbackExecutionWhereInput stateNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATE_NOT);
        return this;
    }

    public FailbackExecutionWhereInput stateNot_ExplictlyNonNull() {
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

    public FailbackExecutionWhereInput stateNotIn(List<BackupExecutionState> stateNotIn) {

        this.stateNotIn = stateNotIn;
        return this;
    }

    public FailbackExecutionWhereInput addStateNotInItem(BackupExecutionState stateNotInItem) {
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

    public FailbackExecutionWhereInput stateNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATE_NOT_IN);
        return this;
    }

    public FailbackExecutionWhereInput stateNotIn_ExplictlyNonNull() {
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

    public FailbackExecutionWhereInput successJobCount(Integer successJobCount) {

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

    public FailbackExecutionWhereInput successJobCount_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUCCESS_JOB_COUNT);
        return this;
    }

    public FailbackExecutionWhereInput successJobCount_ExplictlyNonNull() {
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

    public FailbackExecutionWhereInput successJobCountGt(Integer successJobCountGt) {

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

    public FailbackExecutionWhereInput successJobCountGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUCCESS_JOB_COUNT_GT);
        return this;
    }

    public FailbackExecutionWhereInput successJobCountGt_ExplictlyNonNull() {
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

    public FailbackExecutionWhereInput successJobCountGte(Integer successJobCountGte) {

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

    public FailbackExecutionWhereInput successJobCountGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUCCESS_JOB_COUNT_GTE);
        return this;
    }

    public FailbackExecutionWhereInput successJobCountGte_ExplictlyNonNull() {
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

    public FailbackExecutionWhereInput successJobCountIn(List<Integer> successJobCountIn) {

        this.successJobCountIn = successJobCountIn;
        return this;
    }

    public FailbackExecutionWhereInput addSuccessJobCountInItem(Integer successJobCountInItem) {
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

    public FailbackExecutionWhereInput successJobCountIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUCCESS_JOB_COUNT_IN);
        return this;
    }

    public FailbackExecutionWhereInput successJobCountIn_ExplictlyNonNull() {
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

    public FailbackExecutionWhereInput successJobCountLt(Integer successJobCountLt) {

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

    public FailbackExecutionWhereInput successJobCountLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUCCESS_JOB_COUNT_LT);
        return this;
    }

    public FailbackExecutionWhereInput successJobCountLt_ExplictlyNonNull() {
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

    public FailbackExecutionWhereInput successJobCountLte(Integer successJobCountLte) {

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

    public FailbackExecutionWhereInput successJobCountLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUCCESS_JOB_COUNT_LTE);
        return this;
    }

    public FailbackExecutionWhereInput successJobCountLte_ExplictlyNonNull() {
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

    public FailbackExecutionWhereInput successJobCountNot(Integer successJobCountNot) {

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

    public FailbackExecutionWhereInput successJobCountNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUCCESS_JOB_COUNT_NOT);
        return this;
    }

    public FailbackExecutionWhereInput successJobCountNot_ExplictlyNonNull() {
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

    public FailbackExecutionWhereInput successJobCountNotIn(List<Integer> successJobCountNotIn) {

        this.successJobCountNotIn = successJobCountNotIn;
        return this;
    }

    public FailbackExecutionWhereInput addSuccessJobCountNotInItem(
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

    public FailbackExecutionWhereInput successJobCountNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUCCESS_JOB_COUNT_NOT_IN);
        return this;
    }

    public FailbackExecutionWhereInput successJobCountNotIn_ExplictlyNonNull() {
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

    public FailbackExecutionWhereInput totalJobCount(Integer totalJobCount) {

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

    public FailbackExecutionWhereInput totalJobCount_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_JOB_COUNT);
        return this;
    }

    public FailbackExecutionWhereInput totalJobCount_ExplictlyNonNull() {
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

    public FailbackExecutionWhereInput totalJobCountGt(Integer totalJobCountGt) {

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

    public FailbackExecutionWhereInput totalJobCountGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_JOB_COUNT_GT);
        return this;
    }

    public FailbackExecutionWhereInput totalJobCountGt_ExplictlyNonNull() {
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

    public FailbackExecutionWhereInput totalJobCountGte(Integer totalJobCountGte) {

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

    public FailbackExecutionWhereInput totalJobCountGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_JOB_COUNT_GTE);
        return this;
    }

    public FailbackExecutionWhereInput totalJobCountGte_ExplictlyNonNull() {
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

    public FailbackExecutionWhereInput totalJobCountIn(List<Integer> totalJobCountIn) {

        this.totalJobCountIn = totalJobCountIn;
        return this;
    }

    public FailbackExecutionWhereInput addTotalJobCountInItem(Integer totalJobCountInItem) {
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

    public FailbackExecutionWhereInput totalJobCountIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_JOB_COUNT_IN);
        return this;
    }

    public FailbackExecutionWhereInput totalJobCountIn_ExplictlyNonNull() {
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

    public FailbackExecutionWhereInput totalJobCountLt(Integer totalJobCountLt) {

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

    public FailbackExecutionWhereInput totalJobCountLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_JOB_COUNT_LT);
        return this;
    }

    public FailbackExecutionWhereInput totalJobCountLt_ExplictlyNonNull() {
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

    public FailbackExecutionWhereInput totalJobCountLte(Integer totalJobCountLte) {

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

    public FailbackExecutionWhereInput totalJobCountLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_JOB_COUNT_LTE);
        return this;
    }

    public FailbackExecutionWhereInput totalJobCountLte_ExplictlyNonNull() {
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

    public FailbackExecutionWhereInput totalJobCountNot(Integer totalJobCountNot) {

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

    public FailbackExecutionWhereInput totalJobCountNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_JOB_COUNT_NOT);
        return this;
    }

    public FailbackExecutionWhereInput totalJobCountNot_ExplictlyNonNull() {
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

    public FailbackExecutionWhereInput totalJobCountNotIn(List<Integer> totalJobCountNotIn) {

        this.totalJobCountNotIn = totalJobCountNotIn;
        return this;
    }

    public FailbackExecutionWhereInput addTotalJobCountNotInItem(Integer totalJobCountNotInItem) {
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

    public FailbackExecutionWhereInput totalJobCountNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_JOB_COUNT_NOT_IN);
        return this;
    }

    public FailbackExecutionWhereInput totalJobCountNotIn_ExplictlyNonNull() {
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

    public FailbackExecutionWhereInput updatedAt(String updatedAt) {

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

    public FailbackExecutionWhereInput updatedAt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPDATED_AT);
        return this;
    }

    public FailbackExecutionWhereInput updatedAt_ExplictlyNonNull() {
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

    public FailbackExecutionWhereInput updatedAtGt(String updatedAtGt) {

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

    public FailbackExecutionWhereInput updatedAtGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPDATED_AT_GT);
        return this;
    }

    public FailbackExecutionWhereInput updatedAtGt_ExplictlyNonNull() {
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

    public FailbackExecutionWhereInput updatedAtGte(String updatedAtGte) {

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

    public FailbackExecutionWhereInput updatedAtGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPDATED_AT_GTE);
        return this;
    }

    public FailbackExecutionWhereInput updatedAtGte_ExplictlyNonNull() {
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

    public FailbackExecutionWhereInput updatedAtIn(List<String> updatedAtIn) {

        this.updatedAtIn = updatedAtIn;
        return this;
    }

    public FailbackExecutionWhereInput addUpdatedAtInItem(String updatedAtInItem) {
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

    public FailbackExecutionWhereInput updatedAtIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPDATED_AT_IN);
        return this;
    }

    public FailbackExecutionWhereInput updatedAtIn_ExplictlyNonNull() {
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

    public FailbackExecutionWhereInput updatedAtLt(String updatedAtLt) {

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

    public FailbackExecutionWhereInput updatedAtLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPDATED_AT_LT);
        return this;
    }

    public FailbackExecutionWhereInput updatedAtLt_ExplictlyNonNull() {
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

    public FailbackExecutionWhereInput updatedAtLte(String updatedAtLte) {

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

    public FailbackExecutionWhereInput updatedAtLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPDATED_AT_LTE);
        return this;
    }

    public FailbackExecutionWhereInput updatedAtLte_ExplictlyNonNull() {
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

    public FailbackExecutionWhereInput updatedAtNot(String updatedAtNot) {

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

    public FailbackExecutionWhereInput updatedAtNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPDATED_AT_NOT);
        return this;
    }

    public FailbackExecutionWhereInput updatedAtNot_ExplictlyNonNull() {
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

    public FailbackExecutionWhereInput updatedAtNotIn(List<String> updatedAtNotIn) {

        this.updatedAtNotIn = updatedAtNotIn;
        return this;
    }

    public FailbackExecutionWhereInput addUpdatedAtNotInItem(String updatedAtNotInItem) {
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

    public FailbackExecutionWhereInput updatedAtNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPDATED_AT_NOT_IN);
        return this;
    }

    public FailbackExecutionWhereInput updatedAtNotIn_ExplictlyNonNull() {
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
        FailbackExecutionWhereInput failbackExecutionWhereInput = (FailbackExecutionWhereInput) o;
        return Objects.equals(this.AND, failbackExecutionWhereInput.AND)
                && Objects.equals(this.NOT, failbackExecutionWhereInput.NOT)
                && Objects.equals(this.OR, failbackExecutionWhereInput.OR)
                && Objects.equals(this.createdAt, failbackExecutionWhereInput.createdAt)
                && Objects.equals(this.createdAtGt, failbackExecutionWhereInput.createdAtGt)
                && Objects.equals(this.createdAtGte, failbackExecutionWhereInput.createdAtGte)
                && Objects.equals(this.createdAtIn, failbackExecutionWhereInput.createdAtIn)
                && Objects.equals(this.createdAtLt, failbackExecutionWhereInput.createdAtLt)
                && Objects.equals(this.createdAtLte, failbackExecutionWhereInput.createdAtLte)
                && Objects.equals(this.createdAtNot, failbackExecutionWhereInput.createdAtNot)
                && Objects.equals(this.createdAtNotIn, failbackExecutionWhereInput.createdAtNotIn)
                && Objects.equals(
                        this.entityAsyncStatus, failbackExecutionWhereInput.entityAsyncStatus)
                && Objects.equals(
                        this.entityAsyncStatusIn, failbackExecutionWhereInput.entityAsyncStatusIn)
                && Objects.equals(
                        this.entityAsyncStatusNot, failbackExecutionWhereInput.entityAsyncStatusNot)
                && Objects.equals(
                        this.entityAsyncStatusNotIn,
                        failbackExecutionWhereInput.entityAsyncStatusNotIn)
                && Objects.equals(
                        this.externalCloudtower, failbackExecutionWhereInput.externalCloudtower)
                && Objects.equals(this.finishedAt, failbackExecutionWhereInput.finishedAt)
                && Objects.equals(this.finishedAtGt, failbackExecutionWhereInput.finishedAtGt)
                && Objects.equals(this.finishedAtGte, failbackExecutionWhereInput.finishedAtGte)
                && Objects.equals(this.finishedAtIn, failbackExecutionWhereInput.finishedAtIn)
                && Objects.equals(this.finishedAtLt, failbackExecutionWhereInput.finishedAtLt)
                && Objects.equals(this.finishedAtLte, failbackExecutionWhereInput.finishedAtLte)
                && Objects.equals(this.finishedAtNot, failbackExecutionWhereInput.finishedAtNot)
                && Objects.equals(this.finishedAtNotIn, failbackExecutionWhereInput.finishedAtNotIn)
                && Objects.equals(this.id, failbackExecutionWhereInput.id)
                && Objects.equals(this.idContains, failbackExecutionWhereInput.idContains)
                && Objects.equals(this.idEndsWith, failbackExecutionWhereInput.idEndsWith)
                && Objects.equals(this.idGt, failbackExecutionWhereInput.idGt)
                && Objects.equals(this.idGte, failbackExecutionWhereInput.idGte)
                && Objects.equals(this.idIn, failbackExecutionWhereInput.idIn)
                && Objects.equals(this.idLt, failbackExecutionWhereInput.idLt)
                && Objects.equals(this.idLte, failbackExecutionWhereInput.idLte)
                && Objects.equals(this.idNot, failbackExecutionWhereInput.idNot)
                && Objects.equals(this.idNotContains, failbackExecutionWhereInput.idNotContains)
                && Objects.equals(this.idNotEndsWith, failbackExecutionWhereInput.idNotEndsWith)
                && Objects.equals(this.idNotIn, failbackExecutionWhereInput.idNotIn)
                && Objects.equals(this.idNotStartsWith, failbackExecutionWhereInput.idNotStartsWith)
                && Objects.equals(this.idStartsWith, failbackExecutionWhereInput.idStartsWith)
                && Objects.equals(
                        this.isSyncReplication, failbackExecutionWhereInput.isSyncReplication)
                && Objects.equals(
                        this.isSyncReplicationNot, failbackExecutionWhereInput.isSyncReplicationNot)
                && Objects.equals(
                        this.replicationFailbackTargetExecutionsEvery,
                        failbackExecutionWhereInput.replicationFailbackTargetExecutionsEvery)
                && Objects.equals(
                        this.replicationFailbackTargetExecutionsNone,
                        failbackExecutionWhereInput.replicationFailbackTargetExecutionsNone)
                && Objects.equals(
                        this.replicationFailbackTargetExecutionsSome,
                        failbackExecutionWhereInput.replicationFailbackTargetExecutionsSome)
                && Objects.equals(
                        this.replicationService, failbackExecutionWhereInput.replicationService)
                && Objects.equals(this.resourceVersion, failbackExecutionWhereInput.resourceVersion)
                && Objects.equals(
                        this.resourceVersionGt, failbackExecutionWhereInput.resourceVersionGt)
                && Objects.equals(
                        this.resourceVersionGte, failbackExecutionWhereInput.resourceVersionGte)
                && Objects.equals(
                        this.resourceVersionIn, failbackExecutionWhereInput.resourceVersionIn)
                && Objects.equals(
                        this.resourceVersionLt, failbackExecutionWhereInput.resourceVersionLt)
                && Objects.equals(
                        this.resourceVersionLte, failbackExecutionWhereInput.resourceVersionLte)
                && Objects.equals(
                        this.resourceVersionNot, failbackExecutionWhereInput.resourceVersionNot)
                && Objects.equals(
                        this.resourceVersionNotIn, failbackExecutionWhereInput.resourceVersionNotIn)
                && Objects.equals(this.state, failbackExecutionWhereInput.state)
                && Objects.equals(this.stateIn, failbackExecutionWhereInput.stateIn)
                && Objects.equals(this.stateNot, failbackExecutionWhereInput.stateNot)
                && Objects.equals(this.stateNotIn, failbackExecutionWhereInput.stateNotIn)
                && Objects.equals(this.successJobCount, failbackExecutionWhereInput.successJobCount)
                && Objects.equals(
                        this.successJobCountGt, failbackExecutionWhereInput.successJobCountGt)
                && Objects.equals(
                        this.successJobCountGte, failbackExecutionWhereInput.successJobCountGte)
                && Objects.equals(
                        this.successJobCountIn, failbackExecutionWhereInput.successJobCountIn)
                && Objects.equals(
                        this.successJobCountLt, failbackExecutionWhereInput.successJobCountLt)
                && Objects.equals(
                        this.successJobCountLte, failbackExecutionWhereInput.successJobCountLte)
                && Objects.equals(
                        this.successJobCountNot, failbackExecutionWhereInput.successJobCountNot)
                && Objects.equals(
                        this.successJobCountNotIn, failbackExecutionWhereInput.successJobCountNotIn)
                && Objects.equals(this.totalJobCount, failbackExecutionWhereInput.totalJobCount)
                && Objects.equals(this.totalJobCountGt, failbackExecutionWhereInput.totalJobCountGt)
                && Objects.equals(
                        this.totalJobCountGte, failbackExecutionWhereInput.totalJobCountGte)
                && Objects.equals(this.totalJobCountIn, failbackExecutionWhereInput.totalJobCountIn)
                && Objects.equals(this.totalJobCountLt, failbackExecutionWhereInput.totalJobCountLt)
                && Objects.equals(
                        this.totalJobCountLte, failbackExecutionWhereInput.totalJobCountLte)
                && Objects.equals(
                        this.totalJobCountNot, failbackExecutionWhereInput.totalJobCountNot)
                && Objects.equals(
                        this.totalJobCountNotIn, failbackExecutionWhereInput.totalJobCountNotIn)
                && Objects.equals(this.updatedAt, failbackExecutionWhereInput.updatedAt)
                && Objects.equals(this.updatedAtGt, failbackExecutionWhereInput.updatedAtGt)
                && Objects.equals(this.updatedAtGte, failbackExecutionWhereInput.updatedAtGte)
                && Objects.equals(this.updatedAtIn, failbackExecutionWhereInput.updatedAtIn)
                && Objects.equals(this.updatedAtLt, failbackExecutionWhereInput.updatedAtLt)
                && Objects.equals(this.updatedAtLte, failbackExecutionWhereInput.updatedAtLte)
                && Objects.equals(this.updatedAtNot, failbackExecutionWhereInput.updatedAtNot)
                && Objects.equals(this.updatedAtNotIn, failbackExecutionWhereInput.updatedAtNotIn);
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
                replicationFailbackTargetExecutionsEvery,
                replicationFailbackTargetExecutionsNone,
                replicationFailbackTargetExecutionsSome,
                replicationService,
                resourceVersion,
                resourceVersionGt,
                resourceVersionGte,
                resourceVersionIn,
                resourceVersionLt,
                resourceVersionLte,
                resourceVersionNot,
                resourceVersionNotIn,
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
        sb.append("class FailbackExecutionWhereInput {\n");
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
        sb.append("    replicationFailbackTargetExecutionsEvery: ")
                .append(toIndentedString(replicationFailbackTargetExecutionsEvery))
                .append("\n");
        sb.append("    replicationFailbackTargetExecutionsNone: ")
                .append(toIndentedString(replicationFailbackTargetExecutionsNone))
                .append("\n");
        sb.append("    replicationFailbackTargetExecutionsSome: ")
                .append(toIndentedString(replicationFailbackTargetExecutionsSome))
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

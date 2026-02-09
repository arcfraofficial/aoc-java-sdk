package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** ReplicationPlanExecutionWhereInput */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class ReplicationPlanExecutionWhereInput
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_A_N_D = "AND";

    @SerializedName(SERIALIZED_NAME_A_N_D)
    private List<ReplicationPlanExecutionWhereInput> AND = null;

    public static final String SERIALIZED_NAME_N_O_T = "NOT";

    @SerializedName(SERIALIZED_NAME_N_O_T)
    private List<ReplicationPlanExecutionWhereInput> NOT = null;

    public static final String SERIALIZED_NAME_O_R = "OR";

    @SerializedName(SERIALIZED_NAME_O_R)
    private List<ReplicationPlanExecutionWhereInput> OR = null;

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

    public static final String SERIALIZED_NAME_DELETABLE_FLAG_MARKED = "deletable_flag_marked";

    @SerializedName(SERIALIZED_NAME_DELETABLE_FLAG_MARKED)
    private Boolean deletableFlagMarked;

    public static final String SERIALIZED_NAME_DELETABLE_FLAG_MARKED_NOT =
            "deletable_flag_marked_not";

    @SerializedName(SERIALIZED_NAME_DELETABLE_FLAG_MARKED_NOT)
    private Boolean deletableFlagMarkedNot;

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

    public static final String SERIALIZED_NAME_METHOD = "method";

    @SerializedName(SERIALIZED_NAME_METHOD)
    private BackupExecutionMethod method;

    public static final String SERIALIZED_NAME_METHOD_IN = "method_in";

    @SerializedName(SERIALIZED_NAME_METHOD_IN)
    private List<BackupExecutionMethod> methodIn = null;

    public static final String SERIALIZED_NAME_METHOD_NOT = "method_not";

    @SerializedName(SERIALIZED_NAME_METHOD_NOT)
    private BackupExecutionMethod methodNot;

    public static final String SERIALIZED_NAME_METHOD_NOT_IN = "method_not_in";

    @SerializedName(SERIALIZED_NAME_METHOD_NOT_IN)
    private List<BackupExecutionMethod> methodNotIn = null;

    public static final String SERIALIZED_NAME_PAUSE = "pause";

    @SerializedName(SERIALIZED_NAME_PAUSE)
    private Boolean pause;

    public static final String SERIALIZED_NAME_PAUSE_NOT = "pause_not";

    @SerializedName(SERIALIZED_NAME_PAUSE_NOT)
    private Boolean pauseNot;

    public static final String SERIALIZED_NAME_REPLICATION_PLAN = "replication_plan";

    @SerializedName(SERIALIZED_NAME_REPLICATION_PLAN)
    private ReplicationPlanWhereInput replicationPlan;

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

    public ReplicationPlanExecutionWhereInput() {}

    public ReplicationPlanExecutionWhereInput AND(List<ReplicationPlanExecutionWhereInput> AND) {

        this.AND = AND;
        return this;
    }

    public ReplicationPlanExecutionWhereInput addANDItem(
            ReplicationPlanExecutionWhereInput ANDItem) {
        if (this.AND == null) {
            this.AND = new ArrayList<ReplicationPlanExecutionWhereInput>();
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
    public List<ReplicationPlanExecutionWhereInput> getAND() {
        return AND;
    }

    public void setAND(List<ReplicationPlanExecutionWhereInput> AND) {
        this.AND = AND;
    }

    public ReplicationPlanExecutionWhereInput AND_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_A_N_D);
        return this;
    }

    public ReplicationPlanExecutionWhereInput AND_ExplictlyNonNull() {
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

    public ReplicationPlanExecutionWhereInput NOT(List<ReplicationPlanExecutionWhereInput> NOT) {

        this.NOT = NOT;
        return this;
    }

    public ReplicationPlanExecutionWhereInput addNOTItem(
            ReplicationPlanExecutionWhereInput NOTItem) {
        if (this.NOT == null) {
            this.NOT = new ArrayList<ReplicationPlanExecutionWhereInput>();
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
    public List<ReplicationPlanExecutionWhereInput> getNOT() {
        return NOT;
    }

    public void setNOT(List<ReplicationPlanExecutionWhereInput> NOT) {
        this.NOT = NOT;
    }

    public ReplicationPlanExecutionWhereInput NOT_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_N_O_T);
        return this;
    }

    public ReplicationPlanExecutionWhereInput NOT_ExplictlyNonNull() {
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

    public ReplicationPlanExecutionWhereInput OR(List<ReplicationPlanExecutionWhereInput> OR) {

        this.OR = OR;
        return this;
    }

    public ReplicationPlanExecutionWhereInput addORItem(ReplicationPlanExecutionWhereInput ORItem) {
        if (this.OR == null) {
            this.OR = new ArrayList<ReplicationPlanExecutionWhereInput>();
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
    public List<ReplicationPlanExecutionWhereInput> getOR() {
        return OR;
    }

    public void setOR(List<ReplicationPlanExecutionWhereInput> OR) {
        this.OR = OR;
    }

    public ReplicationPlanExecutionWhereInput OR_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_O_R);
        return this;
    }

    public ReplicationPlanExecutionWhereInput OR_ExplictlyNonNull() {
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

    public ReplicationPlanExecutionWhereInput createdAt(String createdAt) {

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

    public ReplicationPlanExecutionWhereInput createdAt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT);
        return this;
    }

    public ReplicationPlanExecutionWhereInput createdAt_ExplictlyNonNull() {
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

    public ReplicationPlanExecutionWhereInput createdAtGt(String createdAtGt) {

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

    public ReplicationPlanExecutionWhereInput createdAtGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_GT);
        return this;
    }

    public ReplicationPlanExecutionWhereInput createdAtGt_ExplictlyNonNull() {
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

    public ReplicationPlanExecutionWhereInput createdAtGte(String createdAtGte) {

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

    public ReplicationPlanExecutionWhereInput createdAtGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_GTE);
        return this;
    }

    public ReplicationPlanExecutionWhereInput createdAtGte_ExplictlyNonNull() {
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

    public ReplicationPlanExecutionWhereInput createdAtIn(List<String> createdAtIn) {

        this.createdAtIn = createdAtIn;
        return this;
    }

    public ReplicationPlanExecutionWhereInput addCreatedAtInItem(String createdAtInItem) {
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

    public ReplicationPlanExecutionWhereInput createdAtIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_IN);
        return this;
    }

    public ReplicationPlanExecutionWhereInput createdAtIn_ExplictlyNonNull() {
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

    public ReplicationPlanExecutionWhereInput createdAtLt(String createdAtLt) {

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

    public ReplicationPlanExecutionWhereInput createdAtLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_LT);
        return this;
    }

    public ReplicationPlanExecutionWhereInput createdAtLt_ExplictlyNonNull() {
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

    public ReplicationPlanExecutionWhereInput createdAtLte(String createdAtLte) {

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

    public ReplicationPlanExecutionWhereInput createdAtLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_LTE);
        return this;
    }

    public ReplicationPlanExecutionWhereInput createdAtLte_ExplictlyNonNull() {
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

    public ReplicationPlanExecutionWhereInput createdAtNot(String createdAtNot) {

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

    public ReplicationPlanExecutionWhereInput createdAtNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_NOT);
        return this;
    }

    public ReplicationPlanExecutionWhereInput createdAtNot_ExplictlyNonNull() {
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

    public ReplicationPlanExecutionWhereInput createdAtNotIn(List<String> createdAtNotIn) {

        this.createdAtNotIn = createdAtNotIn;
        return this;
    }

    public ReplicationPlanExecutionWhereInput addCreatedAtNotInItem(String createdAtNotInItem) {
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

    public ReplicationPlanExecutionWhereInput createdAtNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_NOT_IN);
        return this;
    }

    public ReplicationPlanExecutionWhereInput createdAtNotIn_ExplictlyNonNull() {
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

    public ReplicationPlanExecutionWhereInput deletableFlagMarked(Boolean deletableFlagMarked) {

        this.deletableFlagMarked = deletableFlagMarked;
        return this;
    }

    /**
     * Get deletableFlagMarked
     *
     * @return deletableFlagMarked
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getDeletableFlagMarked() {
        return deletableFlagMarked;
    }

    public void setDeletableFlagMarked(Boolean deletableFlagMarked) {
        this.deletableFlagMarked = deletableFlagMarked;
    }

    public ReplicationPlanExecutionWhereInput deletableFlagMarked_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DELETABLE_FLAG_MARKED);
        return this;
    }

    public ReplicationPlanExecutionWhereInput deletableFlagMarked_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DELETABLE_FLAG_MARKED);
        return this;
    }

    public void setDeletableFlagMarked_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DELETABLE_FLAG_MARKED);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DELETABLE_FLAG_MARKED);
        }
    }

    public boolean getDeletableFlagMarked_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DELETABLE_FLAG_MARKED);
    }

    public ReplicationPlanExecutionWhereInput deletableFlagMarkedNot(
            Boolean deletableFlagMarkedNot) {

        this.deletableFlagMarkedNot = deletableFlagMarkedNot;
        return this;
    }

    /**
     * Get deletableFlagMarkedNot
     *
     * @return deletableFlagMarkedNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getDeletableFlagMarkedNot() {
        return deletableFlagMarkedNot;
    }

    public void setDeletableFlagMarkedNot(Boolean deletableFlagMarkedNot) {
        this.deletableFlagMarkedNot = deletableFlagMarkedNot;
    }

    public ReplicationPlanExecutionWhereInput deletableFlagMarkedNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DELETABLE_FLAG_MARKED_NOT);
        return this;
    }

    public ReplicationPlanExecutionWhereInput deletableFlagMarkedNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DELETABLE_FLAG_MARKED_NOT);
        return this;
    }

    public void setDeletableFlagMarkedNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DELETABLE_FLAG_MARKED_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DELETABLE_FLAG_MARKED_NOT);
        }
    }

    public boolean getDeletableFlagMarkedNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DELETABLE_FLAG_MARKED_NOT);
    }

    public ReplicationPlanExecutionWhereInput entityAsyncStatus(
            EntityAsyncStatus entityAsyncStatus) {

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

    public ReplicationPlanExecutionWhereInput entityAsyncStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        return this;
    }

    public ReplicationPlanExecutionWhereInput entityAsyncStatus_ExplictlyNonNull() {
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

    public ReplicationPlanExecutionWhereInput entityAsyncStatusIn(
            List<EntityAsyncStatus> entityAsyncStatusIn) {

        this.entityAsyncStatusIn = entityAsyncStatusIn;
        return this;
    }

    public ReplicationPlanExecutionWhereInput addEntityAsyncStatusInItem(
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

    public ReplicationPlanExecutionWhereInput entityAsyncStatusIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_IN);
        return this;
    }

    public ReplicationPlanExecutionWhereInput entityAsyncStatusIn_ExplictlyNonNull() {
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

    public ReplicationPlanExecutionWhereInput entityAsyncStatusNot(
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

    public ReplicationPlanExecutionWhereInput entityAsyncStatusNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT);
        return this;
    }

    public ReplicationPlanExecutionWhereInput entityAsyncStatusNot_ExplictlyNonNull() {
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

    public ReplicationPlanExecutionWhereInput entityAsyncStatusNotIn(
            List<EntityAsyncStatus> entityAsyncStatusNotIn) {

        this.entityAsyncStatusNotIn = entityAsyncStatusNotIn;
        return this;
    }

    public ReplicationPlanExecutionWhereInput addEntityAsyncStatusNotInItem(
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

    public ReplicationPlanExecutionWhereInput entityAsyncStatusNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT_IN);
        return this;
    }

    public ReplicationPlanExecutionWhereInput entityAsyncStatusNotIn_ExplictlyNonNull() {
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

    public ReplicationPlanExecutionWhereInput executedAt(String executedAt) {

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

    public ReplicationPlanExecutionWhereInput executedAt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXECUTED_AT);
        return this;
    }

    public ReplicationPlanExecutionWhereInput executedAt_ExplictlyNonNull() {
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

    public ReplicationPlanExecutionWhereInput executedAtGt(String executedAtGt) {

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

    public ReplicationPlanExecutionWhereInput executedAtGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXECUTED_AT_GT);
        return this;
    }

    public ReplicationPlanExecutionWhereInput executedAtGt_ExplictlyNonNull() {
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

    public ReplicationPlanExecutionWhereInput executedAtGte(String executedAtGte) {

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

    public ReplicationPlanExecutionWhereInput executedAtGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXECUTED_AT_GTE);
        return this;
    }

    public ReplicationPlanExecutionWhereInput executedAtGte_ExplictlyNonNull() {
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

    public ReplicationPlanExecutionWhereInput executedAtIn(List<String> executedAtIn) {

        this.executedAtIn = executedAtIn;
        return this;
    }

    public ReplicationPlanExecutionWhereInput addExecutedAtInItem(String executedAtInItem) {
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

    public ReplicationPlanExecutionWhereInput executedAtIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXECUTED_AT_IN);
        return this;
    }

    public ReplicationPlanExecutionWhereInput executedAtIn_ExplictlyNonNull() {
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

    public ReplicationPlanExecutionWhereInput executedAtLt(String executedAtLt) {

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

    public ReplicationPlanExecutionWhereInput executedAtLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXECUTED_AT_LT);
        return this;
    }

    public ReplicationPlanExecutionWhereInput executedAtLt_ExplictlyNonNull() {
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

    public ReplicationPlanExecutionWhereInput executedAtLte(String executedAtLte) {

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

    public ReplicationPlanExecutionWhereInput executedAtLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXECUTED_AT_LTE);
        return this;
    }

    public ReplicationPlanExecutionWhereInput executedAtLte_ExplictlyNonNull() {
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

    public ReplicationPlanExecutionWhereInput executedAtNot(String executedAtNot) {

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

    public ReplicationPlanExecutionWhereInput executedAtNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXECUTED_AT_NOT);
        return this;
    }

    public ReplicationPlanExecutionWhereInput executedAtNot_ExplictlyNonNull() {
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

    public ReplicationPlanExecutionWhereInput executedAtNotIn(List<String> executedAtNotIn) {

        this.executedAtNotIn = executedAtNotIn;
        return this;
    }

    public ReplicationPlanExecutionWhereInput addExecutedAtNotInItem(String executedAtNotInItem) {
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

    public ReplicationPlanExecutionWhereInput executedAtNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXECUTED_AT_NOT_IN);
        return this;
    }

    public ReplicationPlanExecutionWhereInput executedAtNotIn_ExplictlyNonNull() {
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

    public ReplicationPlanExecutionWhereInput finishedAt(String finishedAt) {

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

    public ReplicationPlanExecutionWhereInput finishedAt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FINISHED_AT);
        return this;
    }

    public ReplicationPlanExecutionWhereInput finishedAt_ExplictlyNonNull() {
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

    public ReplicationPlanExecutionWhereInput finishedAtGt(String finishedAtGt) {

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

    public ReplicationPlanExecutionWhereInput finishedAtGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FINISHED_AT_GT);
        return this;
    }

    public ReplicationPlanExecutionWhereInput finishedAtGt_ExplictlyNonNull() {
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

    public ReplicationPlanExecutionWhereInput finishedAtGte(String finishedAtGte) {

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

    public ReplicationPlanExecutionWhereInput finishedAtGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FINISHED_AT_GTE);
        return this;
    }

    public ReplicationPlanExecutionWhereInput finishedAtGte_ExplictlyNonNull() {
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

    public ReplicationPlanExecutionWhereInput finishedAtIn(List<String> finishedAtIn) {

        this.finishedAtIn = finishedAtIn;
        return this;
    }

    public ReplicationPlanExecutionWhereInput addFinishedAtInItem(String finishedAtInItem) {
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

    public ReplicationPlanExecutionWhereInput finishedAtIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FINISHED_AT_IN);
        return this;
    }

    public ReplicationPlanExecutionWhereInput finishedAtIn_ExplictlyNonNull() {
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

    public ReplicationPlanExecutionWhereInput finishedAtLt(String finishedAtLt) {

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

    public ReplicationPlanExecutionWhereInput finishedAtLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FINISHED_AT_LT);
        return this;
    }

    public ReplicationPlanExecutionWhereInput finishedAtLt_ExplictlyNonNull() {
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

    public ReplicationPlanExecutionWhereInput finishedAtLte(String finishedAtLte) {

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

    public ReplicationPlanExecutionWhereInput finishedAtLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FINISHED_AT_LTE);
        return this;
    }

    public ReplicationPlanExecutionWhereInput finishedAtLte_ExplictlyNonNull() {
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

    public ReplicationPlanExecutionWhereInput finishedAtNot(String finishedAtNot) {

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

    public ReplicationPlanExecutionWhereInput finishedAtNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FINISHED_AT_NOT);
        return this;
    }

    public ReplicationPlanExecutionWhereInput finishedAtNot_ExplictlyNonNull() {
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

    public ReplicationPlanExecutionWhereInput finishedAtNotIn(List<String> finishedAtNotIn) {

        this.finishedAtNotIn = finishedAtNotIn;
        return this;
    }

    public ReplicationPlanExecutionWhereInput addFinishedAtNotInItem(String finishedAtNotInItem) {
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

    public ReplicationPlanExecutionWhereInput finishedAtNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FINISHED_AT_NOT_IN);
        return this;
    }

    public ReplicationPlanExecutionWhereInput finishedAtNotIn_ExplictlyNonNull() {
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

    public ReplicationPlanExecutionWhereInput id(String id) {

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

    public ReplicationPlanExecutionWhereInput id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public ReplicationPlanExecutionWhereInput id_ExplictlyNonNull() {
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

    public ReplicationPlanExecutionWhereInput idContains(String idContains) {

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

    public ReplicationPlanExecutionWhereInput idContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_CONTAINS);
        return this;
    }

    public ReplicationPlanExecutionWhereInput idContains_ExplictlyNonNull() {
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

    public ReplicationPlanExecutionWhereInput idEndsWith(String idEndsWith) {

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

    public ReplicationPlanExecutionWhereInput idEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_ENDS_WITH);
        return this;
    }

    public ReplicationPlanExecutionWhereInput idEndsWith_ExplictlyNonNull() {
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

    public ReplicationPlanExecutionWhereInput idGt(String idGt) {

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

    public ReplicationPlanExecutionWhereInput idGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GT);
        return this;
    }

    public ReplicationPlanExecutionWhereInput idGt_ExplictlyNonNull() {
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

    public ReplicationPlanExecutionWhereInput idGte(String idGte) {

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

    public ReplicationPlanExecutionWhereInput idGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GTE);
        return this;
    }

    public ReplicationPlanExecutionWhereInput idGte_ExplictlyNonNull() {
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

    public ReplicationPlanExecutionWhereInput idIn(List<String> idIn) {

        this.idIn = idIn;
        return this;
    }

    public ReplicationPlanExecutionWhereInput addIdInItem(String idInItem) {
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

    public ReplicationPlanExecutionWhereInput idIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_IN);
        return this;
    }

    public ReplicationPlanExecutionWhereInput idIn_ExplictlyNonNull() {
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

    public ReplicationPlanExecutionWhereInput idLt(String idLt) {

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

    public ReplicationPlanExecutionWhereInput idLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LT);
        return this;
    }

    public ReplicationPlanExecutionWhereInput idLt_ExplictlyNonNull() {
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

    public ReplicationPlanExecutionWhereInput idLte(String idLte) {

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

    public ReplicationPlanExecutionWhereInput idLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LTE);
        return this;
    }

    public ReplicationPlanExecutionWhereInput idLte_ExplictlyNonNull() {
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

    public ReplicationPlanExecutionWhereInput idNot(String idNot) {

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

    public ReplicationPlanExecutionWhereInput idNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT);
        return this;
    }

    public ReplicationPlanExecutionWhereInput idNot_ExplictlyNonNull() {
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

    public ReplicationPlanExecutionWhereInput idNotContains(String idNotContains) {

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

    public ReplicationPlanExecutionWhereInput idNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_CONTAINS);
        return this;
    }

    public ReplicationPlanExecutionWhereInput idNotContains_ExplictlyNonNull() {
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

    public ReplicationPlanExecutionWhereInput idNotEndsWith(String idNotEndsWith) {

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

    public ReplicationPlanExecutionWhereInput idNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
        return this;
    }

    public ReplicationPlanExecutionWhereInput idNotEndsWith_ExplictlyNonNull() {
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

    public ReplicationPlanExecutionWhereInput idNotIn(List<String> idNotIn) {

        this.idNotIn = idNotIn;
        return this;
    }

    public ReplicationPlanExecutionWhereInput addIdNotInItem(String idNotInItem) {
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

    public ReplicationPlanExecutionWhereInput idNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_IN);
        return this;
    }

    public ReplicationPlanExecutionWhereInput idNotIn_ExplictlyNonNull() {
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

    public ReplicationPlanExecutionWhereInput idNotStartsWith(String idNotStartsWith) {

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

    public ReplicationPlanExecutionWhereInput idNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
        return this;
    }

    public ReplicationPlanExecutionWhereInput idNotStartsWith_ExplictlyNonNull() {
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

    public ReplicationPlanExecutionWhereInput idStartsWith(String idStartsWith) {

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

    public ReplicationPlanExecutionWhereInput idStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_STARTS_WITH);
        return this;
    }

    public ReplicationPlanExecutionWhereInput idStartsWith_ExplictlyNonNull() {
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

    public ReplicationPlanExecutionWhereInput localId(String localId) {

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

    public ReplicationPlanExecutionWhereInput localId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID);
        return this;
    }

    public ReplicationPlanExecutionWhereInput localId_ExplictlyNonNull() {
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

    public ReplicationPlanExecutionWhereInput localIdContains(String localIdContains) {

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

    public ReplicationPlanExecutionWhereInput localIdContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_CONTAINS);
        return this;
    }

    public ReplicationPlanExecutionWhereInput localIdContains_ExplictlyNonNull() {
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

    public ReplicationPlanExecutionWhereInput localIdEndsWith(String localIdEndsWith) {

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

    public ReplicationPlanExecutionWhereInput localIdEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_ENDS_WITH);
        return this;
    }

    public ReplicationPlanExecutionWhereInput localIdEndsWith_ExplictlyNonNull() {
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

    public ReplicationPlanExecutionWhereInput localIdGt(String localIdGt) {

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

    public ReplicationPlanExecutionWhereInput localIdGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_GT);
        return this;
    }

    public ReplicationPlanExecutionWhereInput localIdGt_ExplictlyNonNull() {
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

    public ReplicationPlanExecutionWhereInput localIdGte(String localIdGte) {

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

    public ReplicationPlanExecutionWhereInput localIdGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_GTE);
        return this;
    }

    public ReplicationPlanExecutionWhereInput localIdGte_ExplictlyNonNull() {
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

    public ReplicationPlanExecutionWhereInput localIdIn(List<String> localIdIn) {

        this.localIdIn = localIdIn;
        return this;
    }

    public ReplicationPlanExecutionWhereInput addLocalIdInItem(String localIdInItem) {
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

    public ReplicationPlanExecutionWhereInput localIdIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_IN);
        return this;
    }

    public ReplicationPlanExecutionWhereInput localIdIn_ExplictlyNonNull() {
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

    public ReplicationPlanExecutionWhereInput localIdLt(String localIdLt) {

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

    public ReplicationPlanExecutionWhereInput localIdLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_LT);
        return this;
    }

    public ReplicationPlanExecutionWhereInput localIdLt_ExplictlyNonNull() {
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

    public ReplicationPlanExecutionWhereInput localIdLte(String localIdLte) {

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

    public ReplicationPlanExecutionWhereInput localIdLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_LTE);
        return this;
    }

    public ReplicationPlanExecutionWhereInput localIdLte_ExplictlyNonNull() {
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

    public ReplicationPlanExecutionWhereInput localIdNot(String localIdNot) {

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

    public ReplicationPlanExecutionWhereInput localIdNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT);
        return this;
    }

    public ReplicationPlanExecutionWhereInput localIdNot_ExplictlyNonNull() {
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

    public ReplicationPlanExecutionWhereInput localIdNotContains(String localIdNotContains) {

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

    public ReplicationPlanExecutionWhereInput localIdNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_CONTAINS);
        return this;
    }

    public ReplicationPlanExecutionWhereInput localIdNotContains_ExplictlyNonNull() {
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

    public ReplicationPlanExecutionWhereInput localIdNotEndsWith(String localIdNotEndsWith) {

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

    public ReplicationPlanExecutionWhereInput localIdNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_ENDS_WITH);
        return this;
    }

    public ReplicationPlanExecutionWhereInput localIdNotEndsWith_ExplictlyNonNull() {
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

    public ReplicationPlanExecutionWhereInput localIdNotIn(List<String> localIdNotIn) {

        this.localIdNotIn = localIdNotIn;
        return this;
    }

    public ReplicationPlanExecutionWhereInput addLocalIdNotInItem(String localIdNotInItem) {
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

    public ReplicationPlanExecutionWhereInput localIdNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_IN);
        return this;
    }

    public ReplicationPlanExecutionWhereInput localIdNotIn_ExplictlyNonNull() {
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

    public ReplicationPlanExecutionWhereInput localIdNotStartsWith(String localIdNotStartsWith) {

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

    public ReplicationPlanExecutionWhereInput localIdNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_STARTS_WITH);
        return this;
    }

    public ReplicationPlanExecutionWhereInput localIdNotStartsWith_ExplictlyNonNull() {
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

    public ReplicationPlanExecutionWhereInput localIdStartsWith(String localIdStartsWith) {

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

    public ReplicationPlanExecutionWhereInput localIdStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_STARTS_WITH);
        return this;
    }

    public ReplicationPlanExecutionWhereInput localIdStartsWith_ExplictlyNonNull() {
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

    public ReplicationPlanExecutionWhereInput method(BackupExecutionMethod method) {

        this.method = method;
        return this;
    }

    /**
     * Get method
     *
     * @return method
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public BackupExecutionMethod getMethod() {
        return method;
    }

    public void setMethod(BackupExecutionMethod method) {
        this.method = method;
    }

    public ReplicationPlanExecutionWhereInput method_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_METHOD);
        return this;
    }

    public ReplicationPlanExecutionWhereInput method_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_METHOD);
        return this;
    }

    public void setMethod_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_METHOD);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_METHOD);
        }
    }

    public boolean getMethod_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_METHOD);
    }

    public ReplicationPlanExecutionWhereInput methodIn(List<BackupExecutionMethod> methodIn) {

        this.methodIn = methodIn;
        return this;
    }

    public ReplicationPlanExecutionWhereInput addMethodInItem(BackupExecutionMethod methodInItem) {
        if (this.methodIn == null) {
            this.methodIn = new ArrayList<BackupExecutionMethod>();
        }
        this.methodIn.add(methodInItem);
        return this;
    }

    /**
     * Get methodIn
     *
     * @return methodIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<BackupExecutionMethod> getMethodIn() {
        return methodIn;
    }

    public void setMethodIn(List<BackupExecutionMethod> methodIn) {
        this.methodIn = methodIn;
    }

    public ReplicationPlanExecutionWhereInput methodIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_METHOD_IN);
        return this;
    }

    public ReplicationPlanExecutionWhereInput methodIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_METHOD_IN);
        return this;
    }

    public void setMethodIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_METHOD_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_METHOD_IN);
        }
    }

    public boolean getMethodIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_METHOD_IN);
    }

    public ReplicationPlanExecutionWhereInput methodNot(BackupExecutionMethod methodNot) {

        this.methodNot = methodNot;
        return this;
    }

    /**
     * Get methodNot
     *
     * @return methodNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public BackupExecutionMethod getMethodNot() {
        return methodNot;
    }

    public void setMethodNot(BackupExecutionMethod methodNot) {
        this.methodNot = methodNot;
    }

    public ReplicationPlanExecutionWhereInput methodNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_METHOD_NOT);
        return this;
    }

    public ReplicationPlanExecutionWhereInput methodNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_METHOD_NOT);
        return this;
    }

    public void setMethodNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_METHOD_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_METHOD_NOT);
        }
    }

    public boolean getMethodNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_METHOD_NOT);
    }

    public ReplicationPlanExecutionWhereInput methodNotIn(List<BackupExecutionMethod> methodNotIn) {

        this.methodNotIn = methodNotIn;
        return this;
    }

    public ReplicationPlanExecutionWhereInput addMethodNotInItem(
            BackupExecutionMethod methodNotInItem) {
        if (this.methodNotIn == null) {
            this.methodNotIn = new ArrayList<BackupExecutionMethod>();
        }
        this.methodNotIn.add(methodNotInItem);
        return this;
    }

    /**
     * Get methodNotIn
     *
     * @return methodNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<BackupExecutionMethod> getMethodNotIn() {
        return methodNotIn;
    }

    public void setMethodNotIn(List<BackupExecutionMethod> methodNotIn) {
        this.methodNotIn = methodNotIn;
    }

    public ReplicationPlanExecutionWhereInput methodNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_METHOD_NOT_IN);
        return this;
    }

    public ReplicationPlanExecutionWhereInput methodNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_METHOD_NOT_IN);
        return this;
    }

    public void setMethodNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_METHOD_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_METHOD_NOT_IN);
        }
    }

    public boolean getMethodNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_METHOD_NOT_IN);
    }

    public ReplicationPlanExecutionWhereInput pause(Boolean pause) {

        this.pause = pause;
        return this;
    }

    /**
     * Get pause
     *
     * @return pause
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getPause() {
        return pause;
    }

    public void setPause(Boolean pause) {
        this.pause = pause;
    }

    public ReplicationPlanExecutionWhereInput pause_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PAUSE);
        return this;
    }

    public ReplicationPlanExecutionWhereInput pause_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PAUSE);
        return this;
    }

    public void setPause_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PAUSE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PAUSE);
        }
    }

    public boolean getPause_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PAUSE);
    }

    public ReplicationPlanExecutionWhereInput pauseNot(Boolean pauseNot) {

        this.pauseNot = pauseNot;
        return this;
    }

    /**
     * Get pauseNot
     *
     * @return pauseNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getPauseNot() {
        return pauseNot;
    }

    public void setPauseNot(Boolean pauseNot) {
        this.pauseNot = pauseNot;
    }

    public ReplicationPlanExecutionWhereInput pauseNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PAUSE_NOT);
        return this;
    }

    public ReplicationPlanExecutionWhereInput pauseNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PAUSE_NOT);
        return this;
    }

    public void setPauseNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PAUSE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PAUSE_NOT);
        }
    }

    public boolean getPauseNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PAUSE_NOT);
    }

    public ReplicationPlanExecutionWhereInput replicationPlan(
            ReplicationPlanWhereInput replicationPlan) {

        this.replicationPlan = replicationPlan;
        return this;
    }

    /**
     * Get replicationPlan
     *
     * @return replicationPlan
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ReplicationPlanWhereInput getReplicationPlan() {
        return replicationPlan;
    }

    public void setReplicationPlan(ReplicationPlanWhereInput replicationPlan) {
        this.replicationPlan = replicationPlan;
    }

    public ReplicationPlanExecutionWhereInput replicationPlan_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICATION_PLAN);
        return this;
    }

    public ReplicationPlanExecutionWhereInput replicationPlan_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REPLICATION_PLAN);
        return this;
    }

    public void setReplicationPlan_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REPLICATION_PLAN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REPLICATION_PLAN);
        }
    }

    public boolean getReplicationPlan_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REPLICATION_PLAN);
    }

    public ReplicationPlanExecutionWhereInput replicationTargetExecutionsEvery(
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

    public ReplicationPlanExecutionWhereInput replicationTargetExecutionsEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICATION_TARGET_EXECUTIONS_EVERY);
        return this;
    }

    public ReplicationPlanExecutionWhereInput replicationTargetExecutionsEvery_ExplictlyNonNull() {
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

    public ReplicationPlanExecutionWhereInput replicationTargetExecutionsNone(
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

    public ReplicationPlanExecutionWhereInput replicationTargetExecutionsNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICATION_TARGET_EXECUTIONS_NONE);
        return this;
    }

    public ReplicationPlanExecutionWhereInput replicationTargetExecutionsNone_ExplictlyNonNull() {
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

    public ReplicationPlanExecutionWhereInput replicationTargetExecutionsSome(
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

    public ReplicationPlanExecutionWhereInput replicationTargetExecutionsSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICATION_TARGET_EXECUTIONS_SOME);
        return this;
    }

    public ReplicationPlanExecutionWhereInput replicationTargetExecutionsSome_ExplictlyNonNull() {
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

    public ReplicationPlanExecutionWhereInput resourceVersion(Integer resourceVersion) {

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

    public ReplicationPlanExecutionWhereInput resourceVersion_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_VERSION);
        return this;
    }

    public ReplicationPlanExecutionWhereInput resourceVersion_ExplictlyNonNull() {
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

    public ReplicationPlanExecutionWhereInput resourceVersionGt(Integer resourceVersionGt) {

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

    public ReplicationPlanExecutionWhereInput resourceVersionGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_VERSION_GT);
        return this;
    }

    public ReplicationPlanExecutionWhereInput resourceVersionGt_ExplictlyNonNull() {
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

    public ReplicationPlanExecutionWhereInput resourceVersionGte(Integer resourceVersionGte) {

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

    public ReplicationPlanExecutionWhereInput resourceVersionGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_VERSION_GTE);
        return this;
    }

    public ReplicationPlanExecutionWhereInput resourceVersionGte_ExplictlyNonNull() {
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

    public ReplicationPlanExecutionWhereInput resourceVersionIn(List<Integer> resourceVersionIn) {

        this.resourceVersionIn = resourceVersionIn;
        return this;
    }

    public ReplicationPlanExecutionWhereInput addResourceVersionInItem(
            Integer resourceVersionInItem) {
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

    public ReplicationPlanExecutionWhereInput resourceVersionIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_VERSION_IN);
        return this;
    }

    public ReplicationPlanExecutionWhereInput resourceVersionIn_ExplictlyNonNull() {
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

    public ReplicationPlanExecutionWhereInput resourceVersionLt(Integer resourceVersionLt) {

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

    public ReplicationPlanExecutionWhereInput resourceVersionLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_VERSION_LT);
        return this;
    }

    public ReplicationPlanExecutionWhereInput resourceVersionLt_ExplictlyNonNull() {
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

    public ReplicationPlanExecutionWhereInput resourceVersionLte(Integer resourceVersionLte) {

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

    public ReplicationPlanExecutionWhereInput resourceVersionLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_VERSION_LTE);
        return this;
    }

    public ReplicationPlanExecutionWhereInput resourceVersionLte_ExplictlyNonNull() {
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

    public ReplicationPlanExecutionWhereInput resourceVersionNot(Integer resourceVersionNot) {

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

    public ReplicationPlanExecutionWhereInput resourceVersionNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_VERSION_NOT);
        return this;
    }

    public ReplicationPlanExecutionWhereInput resourceVersionNot_ExplictlyNonNull() {
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

    public ReplicationPlanExecutionWhereInput resourceVersionNotIn(
            List<Integer> resourceVersionNotIn) {

        this.resourceVersionNotIn = resourceVersionNotIn;
        return this;
    }

    public ReplicationPlanExecutionWhereInput addResourceVersionNotInItem(
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

    public ReplicationPlanExecutionWhereInput resourceVersionNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_VERSION_NOT_IN);
        return this;
    }

    public ReplicationPlanExecutionWhereInput resourceVersionNotIn_ExplictlyNonNull() {
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

    public ReplicationPlanExecutionWhereInput state(BackupExecutionState state) {

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

    public ReplicationPlanExecutionWhereInput state_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATE);
        return this;
    }

    public ReplicationPlanExecutionWhereInput state_ExplictlyNonNull() {
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

    public ReplicationPlanExecutionWhereInput stateIn(List<BackupExecutionState> stateIn) {

        this.stateIn = stateIn;
        return this;
    }

    public ReplicationPlanExecutionWhereInput addStateInItem(BackupExecutionState stateInItem) {
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

    public ReplicationPlanExecutionWhereInput stateIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATE_IN);
        return this;
    }

    public ReplicationPlanExecutionWhereInput stateIn_ExplictlyNonNull() {
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

    public ReplicationPlanExecutionWhereInput stateNot(BackupExecutionState stateNot) {

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

    public ReplicationPlanExecutionWhereInput stateNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATE_NOT);
        return this;
    }

    public ReplicationPlanExecutionWhereInput stateNot_ExplictlyNonNull() {
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

    public ReplicationPlanExecutionWhereInput stateNotIn(List<BackupExecutionState> stateNotIn) {

        this.stateNotIn = stateNotIn;
        return this;
    }

    public ReplicationPlanExecutionWhereInput addStateNotInItem(
            BackupExecutionState stateNotInItem) {
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

    public ReplicationPlanExecutionWhereInput stateNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATE_NOT_IN);
        return this;
    }

    public ReplicationPlanExecutionWhereInput stateNotIn_ExplictlyNonNull() {
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

    public ReplicationPlanExecutionWhereInput successJobCount(Integer successJobCount) {

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

    public ReplicationPlanExecutionWhereInput successJobCount_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUCCESS_JOB_COUNT);
        return this;
    }

    public ReplicationPlanExecutionWhereInput successJobCount_ExplictlyNonNull() {
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

    public ReplicationPlanExecutionWhereInput successJobCountGt(Integer successJobCountGt) {

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

    public ReplicationPlanExecutionWhereInput successJobCountGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUCCESS_JOB_COUNT_GT);
        return this;
    }

    public ReplicationPlanExecutionWhereInput successJobCountGt_ExplictlyNonNull() {
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

    public ReplicationPlanExecutionWhereInput successJobCountGte(Integer successJobCountGte) {

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

    public ReplicationPlanExecutionWhereInput successJobCountGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUCCESS_JOB_COUNT_GTE);
        return this;
    }

    public ReplicationPlanExecutionWhereInput successJobCountGte_ExplictlyNonNull() {
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

    public ReplicationPlanExecutionWhereInput successJobCountIn(List<Integer> successJobCountIn) {

        this.successJobCountIn = successJobCountIn;
        return this;
    }

    public ReplicationPlanExecutionWhereInput addSuccessJobCountInItem(
            Integer successJobCountInItem) {
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

    public ReplicationPlanExecutionWhereInput successJobCountIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUCCESS_JOB_COUNT_IN);
        return this;
    }

    public ReplicationPlanExecutionWhereInput successJobCountIn_ExplictlyNonNull() {
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

    public ReplicationPlanExecutionWhereInput successJobCountLt(Integer successJobCountLt) {

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

    public ReplicationPlanExecutionWhereInput successJobCountLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUCCESS_JOB_COUNT_LT);
        return this;
    }

    public ReplicationPlanExecutionWhereInput successJobCountLt_ExplictlyNonNull() {
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

    public ReplicationPlanExecutionWhereInput successJobCountLte(Integer successJobCountLte) {

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

    public ReplicationPlanExecutionWhereInput successJobCountLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUCCESS_JOB_COUNT_LTE);
        return this;
    }

    public ReplicationPlanExecutionWhereInput successJobCountLte_ExplictlyNonNull() {
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

    public ReplicationPlanExecutionWhereInput successJobCountNot(Integer successJobCountNot) {

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

    public ReplicationPlanExecutionWhereInput successJobCountNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUCCESS_JOB_COUNT_NOT);
        return this;
    }

    public ReplicationPlanExecutionWhereInput successJobCountNot_ExplictlyNonNull() {
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

    public ReplicationPlanExecutionWhereInput successJobCountNotIn(
            List<Integer> successJobCountNotIn) {

        this.successJobCountNotIn = successJobCountNotIn;
        return this;
    }

    public ReplicationPlanExecutionWhereInput addSuccessJobCountNotInItem(
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

    public ReplicationPlanExecutionWhereInput successJobCountNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUCCESS_JOB_COUNT_NOT_IN);
        return this;
    }

    public ReplicationPlanExecutionWhereInput successJobCountNotIn_ExplictlyNonNull() {
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

    public ReplicationPlanExecutionWhereInput totalJobCount(Integer totalJobCount) {

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

    public ReplicationPlanExecutionWhereInput totalJobCount_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_JOB_COUNT);
        return this;
    }

    public ReplicationPlanExecutionWhereInput totalJobCount_ExplictlyNonNull() {
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

    public ReplicationPlanExecutionWhereInput totalJobCountGt(Integer totalJobCountGt) {

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

    public ReplicationPlanExecutionWhereInput totalJobCountGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_JOB_COUNT_GT);
        return this;
    }

    public ReplicationPlanExecutionWhereInput totalJobCountGt_ExplictlyNonNull() {
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

    public ReplicationPlanExecutionWhereInput totalJobCountGte(Integer totalJobCountGte) {

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

    public ReplicationPlanExecutionWhereInput totalJobCountGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_JOB_COUNT_GTE);
        return this;
    }

    public ReplicationPlanExecutionWhereInput totalJobCountGte_ExplictlyNonNull() {
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

    public ReplicationPlanExecutionWhereInput totalJobCountIn(List<Integer> totalJobCountIn) {

        this.totalJobCountIn = totalJobCountIn;
        return this;
    }

    public ReplicationPlanExecutionWhereInput addTotalJobCountInItem(Integer totalJobCountInItem) {
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

    public ReplicationPlanExecutionWhereInput totalJobCountIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_JOB_COUNT_IN);
        return this;
    }

    public ReplicationPlanExecutionWhereInput totalJobCountIn_ExplictlyNonNull() {
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

    public ReplicationPlanExecutionWhereInput totalJobCountLt(Integer totalJobCountLt) {

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

    public ReplicationPlanExecutionWhereInput totalJobCountLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_JOB_COUNT_LT);
        return this;
    }

    public ReplicationPlanExecutionWhereInput totalJobCountLt_ExplictlyNonNull() {
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

    public ReplicationPlanExecutionWhereInput totalJobCountLte(Integer totalJobCountLte) {

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

    public ReplicationPlanExecutionWhereInput totalJobCountLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_JOB_COUNT_LTE);
        return this;
    }

    public ReplicationPlanExecutionWhereInput totalJobCountLte_ExplictlyNonNull() {
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

    public ReplicationPlanExecutionWhereInput totalJobCountNot(Integer totalJobCountNot) {

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

    public ReplicationPlanExecutionWhereInput totalJobCountNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_JOB_COUNT_NOT);
        return this;
    }

    public ReplicationPlanExecutionWhereInput totalJobCountNot_ExplictlyNonNull() {
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

    public ReplicationPlanExecutionWhereInput totalJobCountNotIn(List<Integer> totalJobCountNotIn) {

        this.totalJobCountNotIn = totalJobCountNotIn;
        return this;
    }

    public ReplicationPlanExecutionWhereInput addTotalJobCountNotInItem(
            Integer totalJobCountNotInItem) {
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

    public ReplicationPlanExecutionWhereInput totalJobCountNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_JOB_COUNT_NOT_IN);
        return this;
    }

    public ReplicationPlanExecutionWhereInput totalJobCountNotIn_ExplictlyNonNull() {
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

    public ReplicationPlanExecutionWhereInput type(BackupExecutionType type) {

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

    public ReplicationPlanExecutionWhereInput type_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE);
        return this;
    }

    public ReplicationPlanExecutionWhereInput type_ExplictlyNonNull() {
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

    public ReplicationPlanExecutionWhereInput typeIn(List<BackupExecutionType> typeIn) {

        this.typeIn = typeIn;
        return this;
    }

    public ReplicationPlanExecutionWhereInput addTypeInItem(BackupExecutionType typeInItem) {
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

    public ReplicationPlanExecutionWhereInput typeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE_IN);
        return this;
    }

    public ReplicationPlanExecutionWhereInput typeIn_ExplictlyNonNull() {
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

    public ReplicationPlanExecutionWhereInput typeNot(BackupExecutionType typeNot) {

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

    public ReplicationPlanExecutionWhereInput typeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE_NOT);
        return this;
    }

    public ReplicationPlanExecutionWhereInput typeNot_ExplictlyNonNull() {
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

    public ReplicationPlanExecutionWhereInput typeNotIn(List<BackupExecutionType> typeNotIn) {

        this.typeNotIn = typeNotIn;
        return this;
    }

    public ReplicationPlanExecutionWhereInput addTypeNotInItem(BackupExecutionType typeNotInItem) {
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

    public ReplicationPlanExecutionWhereInput typeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE_NOT_IN);
        return this;
    }

    public ReplicationPlanExecutionWhereInput typeNotIn_ExplictlyNonNull() {
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

    public ReplicationPlanExecutionWhereInput updatedAt(String updatedAt) {

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

    public ReplicationPlanExecutionWhereInput updatedAt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPDATED_AT);
        return this;
    }

    public ReplicationPlanExecutionWhereInput updatedAt_ExplictlyNonNull() {
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

    public ReplicationPlanExecutionWhereInput updatedAtGt(String updatedAtGt) {

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

    public ReplicationPlanExecutionWhereInput updatedAtGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPDATED_AT_GT);
        return this;
    }

    public ReplicationPlanExecutionWhereInput updatedAtGt_ExplictlyNonNull() {
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

    public ReplicationPlanExecutionWhereInput updatedAtGte(String updatedAtGte) {

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

    public ReplicationPlanExecutionWhereInput updatedAtGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPDATED_AT_GTE);
        return this;
    }

    public ReplicationPlanExecutionWhereInput updatedAtGte_ExplictlyNonNull() {
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

    public ReplicationPlanExecutionWhereInput updatedAtIn(List<String> updatedAtIn) {

        this.updatedAtIn = updatedAtIn;
        return this;
    }

    public ReplicationPlanExecutionWhereInput addUpdatedAtInItem(String updatedAtInItem) {
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

    public ReplicationPlanExecutionWhereInput updatedAtIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPDATED_AT_IN);
        return this;
    }

    public ReplicationPlanExecutionWhereInput updatedAtIn_ExplictlyNonNull() {
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

    public ReplicationPlanExecutionWhereInput updatedAtLt(String updatedAtLt) {

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

    public ReplicationPlanExecutionWhereInput updatedAtLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPDATED_AT_LT);
        return this;
    }

    public ReplicationPlanExecutionWhereInput updatedAtLt_ExplictlyNonNull() {
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

    public ReplicationPlanExecutionWhereInput updatedAtLte(String updatedAtLte) {

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

    public ReplicationPlanExecutionWhereInput updatedAtLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPDATED_AT_LTE);
        return this;
    }

    public ReplicationPlanExecutionWhereInput updatedAtLte_ExplictlyNonNull() {
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

    public ReplicationPlanExecutionWhereInput updatedAtNot(String updatedAtNot) {

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

    public ReplicationPlanExecutionWhereInput updatedAtNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPDATED_AT_NOT);
        return this;
    }

    public ReplicationPlanExecutionWhereInput updatedAtNot_ExplictlyNonNull() {
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

    public ReplicationPlanExecutionWhereInput updatedAtNotIn(List<String> updatedAtNotIn) {

        this.updatedAtNotIn = updatedAtNotIn;
        return this;
    }

    public ReplicationPlanExecutionWhereInput addUpdatedAtNotInItem(String updatedAtNotInItem) {
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

    public ReplicationPlanExecutionWhereInput updatedAtNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPDATED_AT_NOT_IN);
        return this;
    }

    public ReplicationPlanExecutionWhereInput updatedAtNotIn_ExplictlyNonNull() {
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
        ReplicationPlanExecutionWhereInput replicationPlanExecutionWhereInput =
                (ReplicationPlanExecutionWhereInput) o;
        return Objects.equals(this.AND, replicationPlanExecutionWhereInput.AND)
                && Objects.equals(this.NOT, replicationPlanExecutionWhereInput.NOT)
                && Objects.equals(this.OR, replicationPlanExecutionWhereInput.OR)
                && Objects.equals(this.createdAt, replicationPlanExecutionWhereInput.createdAt)
                && Objects.equals(this.createdAtGt, replicationPlanExecutionWhereInput.createdAtGt)
                && Objects.equals(
                        this.createdAtGte, replicationPlanExecutionWhereInput.createdAtGte)
                && Objects.equals(this.createdAtIn, replicationPlanExecutionWhereInput.createdAtIn)
                && Objects.equals(this.createdAtLt, replicationPlanExecutionWhereInput.createdAtLt)
                && Objects.equals(
                        this.createdAtLte, replicationPlanExecutionWhereInput.createdAtLte)
                && Objects.equals(
                        this.createdAtNot, replicationPlanExecutionWhereInput.createdAtNot)
                && Objects.equals(
                        this.createdAtNotIn, replicationPlanExecutionWhereInput.createdAtNotIn)
                && Objects.equals(
                        this.deletableFlagMarked,
                        replicationPlanExecutionWhereInput.deletableFlagMarked)
                && Objects.equals(
                        this.deletableFlagMarkedNot,
                        replicationPlanExecutionWhereInput.deletableFlagMarkedNot)
                && Objects.equals(
                        this.entityAsyncStatus,
                        replicationPlanExecutionWhereInput.entityAsyncStatus)
                && Objects.equals(
                        this.entityAsyncStatusIn,
                        replicationPlanExecutionWhereInput.entityAsyncStatusIn)
                && Objects.equals(
                        this.entityAsyncStatusNot,
                        replicationPlanExecutionWhereInput.entityAsyncStatusNot)
                && Objects.equals(
                        this.entityAsyncStatusNotIn,
                        replicationPlanExecutionWhereInput.entityAsyncStatusNotIn)
                && Objects.equals(this.executedAt, replicationPlanExecutionWhereInput.executedAt)
                && Objects.equals(
                        this.executedAtGt, replicationPlanExecutionWhereInput.executedAtGt)
                && Objects.equals(
                        this.executedAtGte, replicationPlanExecutionWhereInput.executedAtGte)
                && Objects.equals(
                        this.executedAtIn, replicationPlanExecutionWhereInput.executedAtIn)
                && Objects.equals(
                        this.executedAtLt, replicationPlanExecutionWhereInput.executedAtLt)
                && Objects.equals(
                        this.executedAtLte, replicationPlanExecutionWhereInput.executedAtLte)
                && Objects.equals(
                        this.executedAtNot, replicationPlanExecutionWhereInput.executedAtNot)
                && Objects.equals(
                        this.executedAtNotIn, replicationPlanExecutionWhereInput.executedAtNotIn)
                && Objects.equals(this.finishedAt, replicationPlanExecutionWhereInput.finishedAt)
                && Objects.equals(
                        this.finishedAtGt, replicationPlanExecutionWhereInput.finishedAtGt)
                && Objects.equals(
                        this.finishedAtGte, replicationPlanExecutionWhereInput.finishedAtGte)
                && Objects.equals(
                        this.finishedAtIn, replicationPlanExecutionWhereInput.finishedAtIn)
                && Objects.equals(
                        this.finishedAtLt, replicationPlanExecutionWhereInput.finishedAtLt)
                && Objects.equals(
                        this.finishedAtLte, replicationPlanExecutionWhereInput.finishedAtLte)
                && Objects.equals(
                        this.finishedAtNot, replicationPlanExecutionWhereInput.finishedAtNot)
                && Objects.equals(
                        this.finishedAtNotIn, replicationPlanExecutionWhereInput.finishedAtNotIn)
                && Objects.equals(this.id, replicationPlanExecutionWhereInput.id)
                && Objects.equals(this.idContains, replicationPlanExecutionWhereInput.idContains)
                && Objects.equals(this.idEndsWith, replicationPlanExecutionWhereInput.idEndsWith)
                && Objects.equals(this.idGt, replicationPlanExecutionWhereInput.idGt)
                && Objects.equals(this.idGte, replicationPlanExecutionWhereInput.idGte)
                && Objects.equals(this.idIn, replicationPlanExecutionWhereInput.idIn)
                && Objects.equals(this.idLt, replicationPlanExecutionWhereInput.idLt)
                && Objects.equals(this.idLte, replicationPlanExecutionWhereInput.idLte)
                && Objects.equals(this.idNot, replicationPlanExecutionWhereInput.idNot)
                && Objects.equals(
                        this.idNotContains, replicationPlanExecutionWhereInput.idNotContains)
                && Objects.equals(
                        this.idNotEndsWith, replicationPlanExecutionWhereInput.idNotEndsWith)
                && Objects.equals(this.idNotIn, replicationPlanExecutionWhereInput.idNotIn)
                && Objects.equals(
                        this.idNotStartsWith, replicationPlanExecutionWhereInput.idNotStartsWith)
                && Objects.equals(
                        this.idStartsWith, replicationPlanExecutionWhereInput.idStartsWith)
                && Objects.equals(this.localId, replicationPlanExecutionWhereInput.localId)
                && Objects.equals(
                        this.localIdContains, replicationPlanExecutionWhereInput.localIdContains)
                && Objects.equals(
                        this.localIdEndsWith, replicationPlanExecutionWhereInput.localIdEndsWith)
                && Objects.equals(this.localIdGt, replicationPlanExecutionWhereInput.localIdGt)
                && Objects.equals(this.localIdGte, replicationPlanExecutionWhereInput.localIdGte)
                && Objects.equals(this.localIdIn, replicationPlanExecutionWhereInput.localIdIn)
                && Objects.equals(this.localIdLt, replicationPlanExecutionWhereInput.localIdLt)
                && Objects.equals(this.localIdLte, replicationPlanExecutionWhereInput.localIdLte)
                && Objects.equals(this.localIdNot, replicationPlanExecutionWhereInput.localIdNot)
                && Objects.equals(
                        this.localIdNotContains,
                        replicationPlanExecutionWhereInput.localIdNotContains)
                && Objects.equals(
                        this.localIdNotEndsWith,
                        replicationPlanExecutionWhereInput.localIdNotEndsWith)
                && Objects.equals(
                        this.localIdNotIn, replicationPlanExecutionWhereInput.localIdNotIn)
                && Objects.equals(
                        this.localIdNotStartsWith,
                        replicationPlanExecutionWhereInput.localIdNotStartsWith)
                && Objects.equals(
                        this.localIdStartsWith,
                        replicationPlanExecutionWhereInput.localIdStartsWith)
                && Objects.equals(this.method, replicationPlanExecutionWhereInput.method)
                && Objects.equals(this.methodIn, replicationPlanExecutionWhereInput.methodIn)
                && Objects.equals(this.methodNot, replicationPlanExecutionWhereInput.methodNot)
                && Objects.equals(this.methodNotIn, replicationPlanExecutionWhereInput.methodNotIn)
                && Objects.equals(this.pause, replicationPlanExecutionWhereInput.pause)
                && Objects.equals(this.pauseNot, replicationPlanExecutionWhereInput.pauseNot)
                && Objects.equals(
                        this.replicationPlan, replicationPlanExecutionWhereInput.replicationPlan)
                && Objects.equals(
                        this.replicationTargetExecutionsEvery,
                        replicationPlanExecutionWhereInput.replicationTargetExecutionsEvery)
                && Objects.equals(
                        this.replicationTargetExecutionsNone,
                        replicationPlanExecutionWhereInput.replicationTargetExecutionsNone)
                && Objects.equals(
                        this.replicationTargetExecutionsSome,
                        replicationPlanExecutionWhereInput.replicationTargetExecutionsSome)
                && Objects.equals(
                        this.resourceVersion, replicationPlanExecutionWhereInput.resourceVersion)
                && Objects.equals(
                        this.resourceVersionGt,
                        replicationPlanExecutionWhereInput.resourceVersionGt)
                && Objects.equals(
                        this.resourceVersionGte,
                        replicationPlanExecutionWhereInput.resourceVersionGte)
                && Objects.equals(
                        this.resourceVersionIn,
                        replicationPlanExecutionWhereInput.resourceVersionIn)
                && Objects.equals(
                        this.resourceVersionLt,
                        replicationPlanExecutionWhereInput.resourceVersionLt)
                && Objects.equals(
                        this.resourceVersionLte,
                        replicationPlanExecutionWhereInput.resourceVersionLte)
                && Objects.equals(
                        this.resourceVersionNot,
                        replicationPlanExecutionWhereInput.resourceVersionNot)
                && Objects.equals(
                        this.resourceVersionNotIn,
                        replicationPlanExecutionWhereInput.resourceVersionNotIn)
                && Objects.equals(this.state, replicationPlanExecutionWhereInput.state)
                && Objects.equals(this.stateIn, replicationPlanExecutionWhereInput.stateIn)
                && Objects.equals(this.stateNot, replicationPlanExecutionWhereInput.stateNot)
                && Objects.equals(this.stateNotIn, replicationPlanExecutionWhereInput.stateNotIn)
                && Objects.equals(
                        this.successJobCount, replicationPlanExecutionWhereInput.successJobCount)
                && Objects.equals(
                        this.successJobCountGt,
                        replicationPlanExecutionWhereInput.successJobCountGt)
                && Objects.equals(
                        this.successJobCountGte,
                        replicationPlanExecutionWhereInput.successJobCountGte)
                && Objects.equals(
                        this.successJobCountIn,
                        replicationPlanExecutionWhereInput.successJobCountIn)
                && Objects.equals(
                        this.successJobCountLt,
                        replicationPlanExecutionWhereInput.successJobCountLt)
                && Objects.equals(
                        this.successJobCountLte,
                        replicationPlanExecutionWhereInput.successJobCountLte)
                && Objects.equals(
                        this.successJobCountNot,
                        replicationPlanExecutionWhereInput.successJobCountNot)
                && Objects.equals(
                        this.successJobCountNotIn,
                        replicationPlanExecutionWhereInput.successJobCountNotIn)
                && Objects.equals(
                        this.totalJobCount, replicationPlanExecutionWhereInput.totalJobCount)
                && Objects.equals(
                        this.totalJobCountGt, replicationPlanExecutionWhereInput.totalJobCountGt)
                && Objects.equals(
                        this.totalJobCountGte, replicationPlanExecutionWhereInput.totalJobCountGte)
                && Objects.equals(
                        this.totalJobCountIn, replicationPlanExecutionWhereInput.totalJobCountIn)
                && Objects.equals(
                        this.totalJobCountLt, replicationPlanExecutionWhereInput.totalJobCountLt)
                && Objects.equals(
                        this.totalJobCountLte, replicationPlanExecutionWhereInput.totalJobCountLte)
                && Objects.equals(
                        this.totalJobCountNot, replicationPlanExecutionWhereInput.totalJobCountNot)
                && Objects.equals(
                        this.totalJobCountNotIn,
                        replicationPlanExecutionWhereInput.totalJobCountNotIn)
                && Objects.equals(this.type, replicationPlanExecutionWhereInput.type)
                && Objects.equals(this.typeIn, replicationPlanExecutionWhereInput.typeIn)
                && Objects.equals(this.typeNot, replicationPlanExecutionWhereInput.typeNot)
                && Objects.equals(this.typeNotIn, replicationPlanExecutionWhereInput.typeNotIn)
                && Objects.equals(this.updatedAt, replicationPlanExecutionWhereInput.updatedAt)
                && Objects.equals(this.updatedAtGt, replicationPlanExecutionWhereInput.updatedAtGt)
                && Objects.equals(
                        this.updatedAtGte, replicationPlanExecutionWhereInput.updatedAtGte)
                && Objects.equals(this.updatedAtIn, replicationPlanExecutionWhereInput.updatedAtIn)
                && Objects.equals(this.updatedAtLt, replicationPlanExecutionWhereInput.updatedAtLt)
                && Objects.equals(
                        this.updatedAtLte, replicationPlanExecutionWhereInput.updatedAtLte)
                && Objects.equals(
                        this.updatedAtNot, replicationPlanExecutionWhereInput.updatedAtNot)
                && Objects.equals(
                        this.updatedAtNotIn, replicationPlanExecutionWhereInput.updatedAtNotIn);
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
                deletableFlagMarked,
                deletableFlagMarkedNot,
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
                method,
                methodIn,
                methodNot,
                methodNotIn,
                pause,
                pauseNot,
                replicationPlan,
                replicationTargetExecutionsEvery,
                replicationTargetExecutionsNone,
                replicationTargetExecutionsSome,
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
        sb.append("class ReplicationPlanExecutionWhereInput {\n");
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
        sb.append("    deletableFlagMarked: ")
                .append(toIndentedString(deletableFlagMarked))
                .append("\n");
        sb.append("    deletableFlagMarkedNot: ")
                .append(toIndentedString(deletableFlagMarkedNot))
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
        sb.append("    executedAt: ").append(toIndentedString(executedAt)).append("\n");
        sb.append("    executedAtGt: ").append(toIndentedString(executedAtGt)).append("\n");
        sb.append("    executedAtGte: ").append(toIndentedString(executedAtGte)).append("\n");
        sb.append("    executedAtIn: ").append(toIndentedString(executedAtIn)).append("\n");
        sb.append("    executedAtLt: ").append(toIndentedString(executedAtLt)).append("\n");
        sb.append("    executedAtLte: ").append(toIndentedString(executedAtLte)).append("\n");
        sb.append("    executedAtNot: ").append(toIndentedString(executedAtNot)).append("\n");
        sb.append("    executedAtNotIn: ").append(toIndentedString(executedAtNotIn)).append("\n");
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
        sb.append("    method: ").append(toIndentedString(method)).append("\n");
        sb.append("    methodIn: ").append(toIndentedString(methodIn)).append("\n");
        sb.append("    methodNot: ").append(toIndentedString(methodNot)).append("\n");
        sb.append("    methodNotIn: ").append(toIndentedString(methodNotIn)).append("\n");
        sb.append("    pause: ").append(toIndentedString(pause)).append("\n");
        sb.append("    pauseNot: ").append(toIndentedString(pauseNot)).append("\n");
        sb.append("    replicationPlan: ").append(toIndentedString(replicationPlan)).append("\n");
        sb.append("    replicationTargetExecutionsEvery: ")
                .append(toIndentedString(replicationTargetExecutionsEvery))
                .append("\n");
        sb.append("    replicationTargetExecutionsNone: ")
                .append(toIndentedString(replicationTargetExecutionsNone))
                .append("\n");
        sb.append("    replicationTargetExecutionsSome: ")
                .append(toIndentedString(replicationTargetExecutionsSome))
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

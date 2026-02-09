package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** ReplicationTargetExecutionWhereInput */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class ReplicationTargetExecutionWhereInput
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_A_N_D = "AND";

    @SerializedName(SERIALIZED_NAME_A_N_D)
    private List<ReplicationTargetExecutionWhereInput> AND = null;

    public static final String SERIALIZED_NAME_N_O_T = "NOT";

    @SerializedName(SERIALIZED_NAME_N_O_T)
    private List<ReplicationTargetExecutionWhereInput> NOT = null;

    public static final String SERIALIZED_NAME_O_R = "OR";

    @SerializedName(SERIALIZED_NAME_O_R)
    private List<ReplicationTargetExecutionWhereInput> OR = null;

    public static final String SERIALIZED_NAME_CREATION = "creation";

    @SerializedName(SERIALIZED_NAME_CREATION)
    private ReplicationTargetExecutionCreation creation;

    public static final String SERIALIZED_NAME_CREATION_IN = "creation_in";

    @SerializedName(SERIALIZED_NAME_CREATION_IN)
    private List<ReplicationTargetExecutionCreation> creationIn = null;

    public static final String SERIALIZED_NAME_CREATION_NOT = "creation_not";

    @SerializedName(SERIALIZED_NAME_CREATION_NOT)
    private ReplicationTargetExecutionCreation creationNot;

    public static final String SERIALIZED_NAME_CREATION_NOT_IN = "creation_not_in";

    @SerializedName(SERIALIZED_NAME_CREATION_NOT_IN)
    private List<ReplicationTargetExecutionCreation> creationNotIn = null;

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

    public static final String SERIALIZED_NAME_PHASE = "phase";

    @SerializedName(SERIALIZED_NAME_PHASE)
    private BackupJobPhase phase;

    public static final String SERIALIZED_NAME_PHASE_IN = "phase_in";

    @SerializedName(SERIALIZED_NAME_PHASE_IN)
    private List<BackupJobPhase> phaseIn = null;

    public static final String SERIALIZED_NAME_PHASE_NOT = "phase_not";

    @SerializedName(SERIALIZED_NAME_PHASE_NOT)
    private BackupJobPhase phaseNot;

    public static final String SERIALIZED_NAME_PHASE_NOT_IN = "phase_not_in";

    @SerializedName(SERIALIZED_NAME_PHASE_NOT_IN)
    private List<BackupJobPhase> phaseNotIn = null;

    public static final String SERIALIZED_NAME_REPLICA_VM = "replica_vm";

    @SerializedName(SERIALIZED_NAME_REPLICA_VM)
    private ReplicaVmWhereInput replicaVm;

    public static final String SERIALIZED_NAME_REPLICATION_PLAN = "replication_plan";

    @SerializedName(SERIALIZED_NAME_REPLICATION_PLAN)
    private ReplicationPlanWhereInput replicationPlan;

    public static final String SERIALIZED_NAME_REPLICATION_PLAN_EXECUTION =
            "replication_plan_execution";

    @SerializedName(SERIALIZED_NAME_REPLICATION_PLAN_EXECUTION)
    private ReplicationPlanExecutionWhereInput replicationPlanExecution;

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

    public static final String SERIALIZED_NAME_SYNC_REPLICATION_PLAN = "sync_replication_plan";

    @SerializedName(SERIALIZED_NAME_SYNC_REPLICATION_PLAN)
    private SyncReplicationPlanWhereInput syncReplicationPlan;

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

    public ReplicationTargetExecutionWhereInput() {}

    public ReplicationTargetExecutionWhereInput AND(
            List<ReplicationTargetExecutionWhereInput> AND) {

        this.AND = AND;
        return this;
    }

    public ReplicationTargetExecutionWhereInput addANDItem(
            ReplicationTargetExecutionWhereInput ANDItem) {
        if (this.AND == null) {
            this.AND = new ArrayList<ReplicationTargetExecutionWhereInput>();
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
    public List<ReplicationTargetExecutionWhereInput> getAND() {
        return AND;
    }

    public void setAND(List<ReplicationTargetExecutionWhereInput> AND) {
        this.AND = AND;
    }

    public ReplicationTargetExecutionWhereInput AND_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_A_N_D);
        return this;
    }

    public ReplicationTargetExecutionWhereInput AND_ExplictlyNonNull() {
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

    public ReplicationTargetExecutionWhereInput NOT(
            List<ReplicationTargetExecutionWhereInput> NOT) {

        this.NOT = NOT;
        return this;
    }

    public ReplicationTargetExecutionWhereInput addNOTItem(
            ReplicationTargetExecutionWhereInput NOTItem) {
        if (this.NOT == null) {
            this.NOT = new ArrayList<ReplicationTargetExecutionWhereInput>();
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
    public List<ReplicationTargetExecutionWhereInput> getNOT() {
        return NOT;
    }

    public void setNOT(List<ReplicationTargetExecutionWhereInput> NOT) {
        this.NOT = NOT;
    }

    public ReplicationTargetExecutionWhereInput NOT_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_N_O_T);
        return this;
    }

    public ReplicationTargetExecutionWhereInput NOT_ExplictlyNonNull() {
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

    public ReplicationTargetExecutionWhereInput OR(List<ReplicationTargetExecutionWhereInput> OR) {

        this.OR = OR;
        return this;
    }

    public ReplicationTargetExecutionWhereInput addORItem(
            ReplicationTargetExecutionWhereInput ORItem) {
        if (this.OR == null) {
            this.OR = new ArrayList<ReplicationTargetExecutionWhereInput>();
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
    public List<ReplicationTargetExecutionWhereInput> getOR() {
        return OR;
    }

    public void setOR(List<ReplicationTargetExecutionWhereInput> OR) {
        this.OR = OR;
    }

    public ReplicationTargetExecutionWhereInput OR_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_O_R);
        return this;
    }

    public ReplicationTargetExecutionWhereInput OR_ExplictlyNonNull() {
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

    public ReplicationTargetExecutionWhereInput creation(
            ReplicationTargetExecutionCreation creation) {

        this.creation = creation;
        return this;
    }

    /**
     * Get creation
     *
     * @return creation
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ReplicationTargetExecutionCreation getCreation() {
        return creation;
    }

    public void setCreation(ReplicationTargetExecutionCreation creation) {
        this.creation = creation;
    }

    public ReplicationTargetExecutionWhereInput creation_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATION);
        return this;
    }

    public ReplicationTargetExecutionWhereInput creation_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CREATION);
        return this;
    }

    public void setCreation_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CREATION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CREATION);
        }
    }

    public boolean getCreation_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CREATION);
    }

    public ReplicationTargetExecutionWhereInput creationIn(
            List<ReplicationTargetExecutionCreation> creationIn) {

        this.creationIn = creationIn;
        return this;
    }

    public ReplicationTargetExecutionWhereInput addCreationInItem(
            ReplicationTargetExecutionCreation creationInItem) {
        if (this.creationIn == null) {
            this.creationIn = new ArrayList<ReplicationTargetExecutionCreation>();
        }
        this.creationIn.add(creationInItem);
        return this;
    }

    /**
     * Get creationIn
     *
     * @return creationIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<ReplicationTargetExecutionCreation> getCreationIn() {
        return creationIn;
    }

    public void setCreationIn(List<ReplicationTargetExecutionCreation> creationIn) {
        this.creationIn = creationIn;
    }

    public ReplicationTargetExecutionWhereInput creationIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATION_IN);
        return this;
    }

    public ReplicationTargetExecutionWhereInput creationIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CREATION_IN);
        return this;
    }

    public void setCreationIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CREATION_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CREATION_IN);
        }
    }

    public boolean getCreationIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CREATION_IN);
    }

    public ReplicationTargetExecutionWhereInput creationNot(
            ReplicationTargetExecutionCreation creationNot) {

        this.creationNot = creationNot;
        return this;
    }

    /**
     * Get creationNot
     *
     * @return creationNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ReplicationTargetExecutionCreation getCreationNot() {
        return creationNot;
    }

    public void setCreationNot(ReplicationTargetExecutionCreation creationNot) {
        this.creationNot = creationNot;
    }

    public ReplicationTargetExecutionWhereInput creationNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATION_NOT);
        return this;
    }

    public ReplicationTargetExecutionWhereInput creationNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CREATION_NOT);
        return this;
    }

    public void setCreationNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CREATION_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CREATION_NOT);
        }
    }

    public boolean getCreationNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CREATION_NOT);
    }

    public ReplicationTargetExecutionWhereInput creationNotIn(
            List<ReplicationTargetExecutionCreation> creationNotIn) {

        this.creationNotIn = creationNotIn;
        return this;
    }

    public ReplicationTargetExecutionWhereInput addCreationNotInItem(
            ReplicationTargetExecutionCreation creationNotInItem) {
        if (this.creationNotIn == null) {
            this.creationNotIn = new ArrayList<ReplicationTargetExecutionCreation>();
        }
        this.creationNotIn.add(creationNotInItem);
        return this;
    }

    /**
     * Get creationNotIn
     *
     * @return creationNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<ReplicationTargetExecutionCreation> getCreationNotIn() {
        return creationNotIn;
    }

    public void setCreationNotIn(List<ReplicationTargetExecutionCreation> creationNotIn) {
        this.creationNotIn = creationNotIn;
    }

    public ReplicationTargetExecutionWhereInput creationNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATION_NOT_IN);
        return this;
    }

    public ReplicationTargetExecutionWhereInput creationNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CREATION_NOT_IN);
        return this;
    }

    public void setCreationNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CREATION_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CREATION_NOT_IN);
        }
    }

    public boolean getCreationNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CREATION_NOT_IN);
    }

    public ReplicationTargetExecutionWhereInput entityAsyncStatus(
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

    public ReplicationTargetExecutionWhereInput entityAsyncStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        return this;
    }

    public ReplicationTargetExecutionWhereInput entityAsyncStatus_ExplictlyNonNull() {
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

    public ReplicationTargetExecutionWhereInput entityAsyncStatusIn(
            List<EntityAsyncStatus> entityAsyncStatusIn) {

        this.entityAsyncStatusIn = entityAsyncStatusIn;
        return this;
    }

    public ReplicationTargetExecutionWhereInput addEntityAsyncStatusInItem(
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

    public ReplicationTargetExecutionWhereInput entityAsyncStatusIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_IN);
        return this;
    }

    public ReplicationTargetExecutionWhereInput entityAsyncStatusIn_ExplictlyNonNull() {
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

    public ReplicationTargetExecutionWhereInput entityAsyncStatusNot(
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

    public ReplicationTargetExecutionWhereInput entityAsyncStatusNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT);
        return this;
    }

    public ReplicationTargetExecutionWhereInput entityAsyncStatusNot_ExplictlyNonNull() {
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

    public ReplicationTargetExecutionWhereInput entityAsyncStatusNotIn(
            List<EntityAsyncStatus> entityAsyncStatusNotIn) {

        this.entityAsyncStatusNotIn = entityAsyncStatusNotIn;
        return this;
    }

    public ReplicationTargetExecutionWhereInput addEntityAsyncStatusNotInItem(
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

    public ReplicationTargetExecutionWhereInput entityAsyncStatusNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT_IN);
        return this;
    }

    public ReplicationTargetExecutionWhereInput entityAsyncStatusNotIn_ExplictlyNonNull() {
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

    public ReplicationTargetExecutionWhereInput finishedAt(String finishedAt) {

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

    public ReplicationTargetExecutionWhereInput finishedAt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FINISHED_AT);
        return this;
    }

    public ReplicationTargetExecutionWhereInput finishedAt_ExplictlyNonNull() {
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

    public ReplicationTargetExecutionWhereInput finishedAtGt(String finishedAtGt) {

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

    public ReplicationTargetExecutionWhereInput finishedAtGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FINISHED_AT_GT);
        return this;
    }

    public ReplicationTargetExecutionWhereInput finishedAtGt_ExplictlyNonNull() {
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

    public ReplicationTargetExecutionWhereInput finishedAtGte(String finishedAtGte) {

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

    public ReplicationTargetExecutionWhereInput finishedAtGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FINISHED_AT_GTE);
        return this;
    }

    public ReplicationTargetExecutionWhereInput finishedAtGte_ExplictlyNonNull() {
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

    public ReplicationTargetExecutionWhereInput finishedAtIn(List<String> finishedAtIn) {

        this.finishedAtIn = finishedAtIn;
        return this;
    }

    public ReplicationTargetExecutionWhereInput addFinishedAtInItem(String finishedAtInItem) {
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

    public ReplicationTargetExecutionWhereInput finishedAtIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FINISHED_AT_IN);
        return this;
    }

    public ReplicationTargetExecutionWhereInput finishedAtIn_ExplictlyNonNull() {
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

    public ReplicationTargetExecutionWhereInput finishedAtLt(String finishedAtLt) {

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

    public ReplicationTargetExecutionWhereInput finishedAtLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FINISHED_AT_LT);
        return this;
    }

    public ReplicationTargetExecutionWhereInput finishedAtLt_ExplictlyNonNull() {
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

    public ReplicationTargetExecutionWhereInput finishedAtLte(String finishedAtLte) {

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

    public ReplicationTargetExecutionWhereInput finishedAtLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FINISHED_AT_LTE);
        return this;
    }

    public ReplicationTargetExecutionWhereInput finishedAtLte_ExplictlyNonNull() {
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

    public ReplicationTargetExecutionWhereInput finishedAtNot(String finishedAtNot) {

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

    public ReplicationTargetExecutionWhereInput finishedAtNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FINISHED_AT_NOT);
        return this;
    }

    public ReplicationTargetExecutionWhereInput finishedAtNot_ExplictlyNonNull() {
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

    public ReplicationTargetExecutionWhereInput finishedAtNotIn(List<String> finishedAtNotIn) {

        this.finishedAtNotIn = finishedAtNotIn;
        return this;
    }

    public ReplicationTargetExecutionWhereInput addFinishedAtNotInItem(String finishedAtNotInItem) {
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

    public ReplicationTargetExecutionWhereInput finishedAtNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FINISHED_AT_NOT_IN);
        return this;
    }

    public ReplicationTargetExecutionWhereInput finishedAtNotIn_ExplictlyNonNull() {
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

    public ReplicationTargetExecutionWhereInput id(String id) {

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

    public ReplicationTargetExecutionWhereInput id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public ReplicationTargetExecutionWhereInput id_ExplictlyNonNull() {
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

    public ReplicationTargetExecutionWhereInput idContains(String idContains) {

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

    public ReplicationTargetExecutionWhereInput idContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_CONTAINS);
        return this;
    }

    public ReplicationTargetExecutionWhereInput idContains_ExplictlyNonNull() {
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

    public ReplicationTargetExecutionWhereInput idEndsWith(String idEndsWith) {

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

    public ReplicationTargetExecutionWhereInput idEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_ENDS_WITH);
        return this;
    }

    public ReplicationTargetExecutionWhereInput idEndsWith_ExplictlyNonNull() {
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

    public ReplicationTargetExecutionWhereInput idGt(String idGt) {

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

    public ReplicationTargetExecutionWhereInput idGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GT);
        return this;
    }

    public ReplicationTargetExecutionWhereInput idGt_ExplictlyNonNull() {
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

    public ReplicationTargetExecutionWhereInput idGte(String idGte) {

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

    public ReplicationTargetExecutionWhereInput idGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GTE);
        return this;
    }

    public ReplicationTargetExecutionWhereInput idGte_ExplictlyNonNull() {
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

    public ReplicationTargetExecutionWhereInput idIn(List<String> idIn) {

        this.idIn = idIn;
        return this;
    }

    public ReplicationTargetExecutionWhereInput addIdInItem(String idInItem) {
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

    public ReplicationTargetExecutionWhereInput idIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_IN);
        return this;
    }

    public ReplicationTargetExecutionWhereInput idIn_ExplictlyNonNull() {
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

    public ReplicationTargetExecutionWhereInput idLt(String idLt) {

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

    public ReplicationTargetExecutionWhereInput idLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LT);
        return this;
    }

    public ReplicationTargetExecutionWhereInput idLt_ExplictlyNonNull() {
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

    public ReplicationTargetExecutionWhereInput idLte(String idLte) {

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

    public ReplicationTargetExecutionWhereInput idLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LTE);
        return this;
    }

    public ReplicationTargetExecutionWhereInput idLte_ExplictlyNonNull() {
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

    public ReplicationTargetExecutionWhereInput idNot(String idNot) {

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

    public ReplicationTargetExecutionWhereInput idNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT);
        return this;
    }

    public ReplicationTargetExecutionWhereInput idNot_ExplictlyNonNull() {
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

    public ReplicationTargetExecutionWhereInput idNotContains(String idNotContains) {

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

    public ReplicationTargetExecutionWhereInput idNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_CONTAINS);
        return this;
    }

    public ReplicationTargetExecutionWhereInput idNotContains_ExplictlyNonNull() {
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

    public ReplicationTargetExecutionWhereInput idNotEndsWith(String idNotEndsWith) {

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

    public ReplicationTargetExecutionWhereInput idNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
        return this;
    }

    public ReplicationTargetExecutionWhereInput idNotEndsWith_ExplictlyNonNull() {
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

    public ReplicationTargetExecutionWhereInput idNotIn(List<String> idNotIn) {

        this.idNotIn = idNotIn;
        return this;
    }

    public ReplicationTargetExecutionWhereInput addIdNotInItem(String idNotInItem) {
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

    public ReplicationTargetExecutionWhereInput idNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_IN);
        return this;
    }

    public ReplicationTargetExecutionWhereInput idNotIn_ExplictlyNonNull() {
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

    public ReplicationTargetExecutionWhereInput idNotStartsWith(String idNotStartsWith) {

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

    public ReplicationTargetExecutionWhereInput idNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
        return this;
    }

    public ReplicationTargetExecutionWhereInput idNotStartsWith_ExplictlyNonNull() {
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

    public ReplicationTargetExecutionWhereInput idStartsWith(String idStartsWith) {

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

    public ReplicationTargetExecutionWhereInput idStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_STARTS_WITH);
        return this;
    }

    public ReplicationTargetExecutionWhereInput idStartsWith_ExplictlyNonNull() {
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

    public ReplicationTargetExecutionWhereInput localId(String localId) {

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

    public ReplicationTargetExecutionWhereInput localId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID);
        return this;
    }

    public ReplicationTargetExecutionWhereInput localId_ExplictlyNonNull() {
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

    public ReplicationTargetExecutionWhereInput localIdContains(String localIdContains) {

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

    public ReplicationTargetExecutionWhereInput localIdContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_CONTAINS);
        return this;
    }

    public ReplicationTargetExecutionWhereInput localIdContains_ExplictlyNonNull() {
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

    public ReplicationTargetExecutionWhereInput localIdEndsWith(String localIdEndsWith) {

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

    public ReplicationTargetExecutionWhereInput localIdEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_ENDS_WITH);
        return this;
    }

    public ReplicationTargetExecutionWhereInput localIdEndsWith_ExplictlyNonNull() {
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

    public ReplicationTargetExecutionWhereInput localIdGt(String localIdGt) {

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

    public ReplicationTargetExecutionWhereInput localIdGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_GT);
        return this;
    }

    public ReplicationTargetExecutionWhereInput localIdGt_ExplictlyNonNull() {
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

    public ReplicationTargetExecutionWhereInput localIdGte(String localIdGte) {

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

    public ReplicationTargetExecutionWhereInput localIdGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_GTE);
        return this;
    }

    public ReplicationTargetExecutionWhereInput localIdGte_ExplictlyNonNull() {
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

    public ReplicationTargetExecutionWhereInput localIdIn(List<String> localIdIn) {

        this.localIdIn = localIdIn;
        return this;
    }

    public ReplicationTargetExecutionWhereInput addLocalIdInItem(String localIdInItem) {
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

    public ReplicationTargetExecutionWhereInput localIdIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_IN);
        return this;
    }

    public ReplicationTargetExecutionWhereInput localIdIn_ExplictlyNonNull() {
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

    public ReplicationTargetExecutionWhereInput localIdLt(String localIdLt) {

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

    public ReplicationTargetExecutionWhereInput localIdLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_LT);
        return this;
    }

    public ReplicationTargetExecutionWhereInput localIdLt_ExplictlyNonNull() {
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

    public ReplicationTargetExecutionWhereInput localIdLte(String localIdLte) {

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

    public ReplicationTargetExecutionWhereInput localIdLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_LTE);
        return this;
    }

    public ReplicationTargetExecutionWhereInput localIdLte_ExplictlyNonNull() {
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

    public ReplicationTargetExecutionWhereInput localIdNot(String localIdNot) {

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

    public ReplicationTargetExecutionWhereInput localIdNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT);
        return this;
    }

    public ReplicationTargetExecutionWhereInput localIdNot_ExplictlyNonNull() {
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

    public ReplicationTargetExecutionWhereInput localIdNotContains(String localIdNotContains) {

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

    public ReplicationTargetExecutionWhereInput localIdNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_CONTAINS);
        return this;
    }

    public ReplicationTargetExecutionWhereInput localIdNotContains_ExplictlyNonNull() {
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

    public ReplicationTargetExecutionWhereInput localIdNotEndsWith(String localIdNotEndsWith) {

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

    public ReplicationTargetExecutionWhereInput localIdNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_ENDS_WITH);
        return this;
    }

    public ReplicationTargetExecutionWhereInput localIdNotEndsWith_ExplictlyNonNull() {
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

    public ReplicationTargetExecutionWhereInput localIdNotIn(List<String> localIdNotIn) {

        this.localIdNotIn = localIdNotIn;
        return this;
    }

    public ReplicationTargetExecutionWhereInput addLocalIdNotInItem(String localIdNotInItem) {
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

    public ReplicationTargetExecutionWhereInput localIdNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_IN);
        return this;
    }

    public ReplicationTargetExecutionWhereInput localIdNotIn_ExplictlyNonNull() {
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

    public ReplicationTargetExecutionWhereInput localIdNotStartsWith(String localIdNotStartsWith) {

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

    public ReplicationTargetExecutionWhereInput localIdNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_STARTS_WITH);
        return this;
    }

    public ReplicationTargetExecutionWhereInput localIdNotStartsWith_ExplictlyNonNull() {
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

    public ReplicationTargetExecutionWhereInput localIdStartsWith(String localIdStartsWith) {

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

    public ReplicationTargetExecutionWhereInput localIdStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_STARTS_WITH);
        return this;
    }

    public ReplicationTargetExecutionWhereInput localIdStartsWith_ExplictlyNonNull() {
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

    public ReplicationTargetExecutionWhereInput phase(BackupJobPhase phase) {

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
    public BackupJobPhase getPhase() {
        return phase;
    }

    public void setPhase(BackupJobPhase phase) {
        this.phase = phase;
    }

    public ReplicationTargetExecutionWhereInput phase_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PHASE);
        return this;
    }

    public ReplicationTargetExecutionWhereInput phase_ExplictlyNonNull() {
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

    public ReplicationTargetExecutionWhereInput phaseIn(List<BackupJobPhase> phaseIn) {

        this.phaseIn = phaseIn;
        return this;
    }

    public ReplicationTargetExecutionWhereInput addPhaseInItem(BackupJobPhase phaseInItem) {
        if (this.phaseIn == null) {
            this.phaseIn = new ArrayList<BackupJobPhase>();
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
    public List<BackupJobPhase> getPhaseIn() {
        return phaseIn;
    }

    public void setPhaseIn(List<BackupJobPhase> phaseIn) {
        this.phaseIn = phaseIn;
    }

    public ReplicationTargetExecutionWhereInput phaseIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PHASE_IN);
        return this;
    }

    public ReplicationTargetExecutionWhereInput phaseIn_ExplictlyNonNull() {
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

    public ReplicationTargetExecutionWhereInput phaseNot(BackupJobPhase phaseNot) {

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
    public BackupJobPhase getPhaseNot() {
        return phaseNot;
    }

    public void setPhaseNot(BackupJobPhase phaseNot) {
        this.phaseNot = phaseNot;
    }

    public ReplicationTargetExecutionWhereInput phaseNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PHASE_NOT);
        return this;
    }

    public ReplicationTargetExecutionWhereInput phaseNot_ExplictlyNonNull() {
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

    public ReplicationTargetExecutionWhereInput phaseNotIn(List<BackupJobPhase> phaseNotIn) {

        this.phaseNotIn = phaseNotIn;
        return this;
    }

    public ReplicationTargetExecutionWhereInput addPhaseNotInItem(BackupJobPhase phaseNotInItem) {
        if (this.phaseNotIn == null) {
            this.phaseNotIn = new ArrayList<BackupJobPhase>();
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
    public List<BackupJobPhase> getPhaseNotIn() {
        return phaseNotIn;
    }

    public void setPhaseNotIn(List<BackupJobPhase> phaseNotIn) {
        this.phaseNotIn = phaseNotIn;
    }

    public ReplicationTargetExecutionWhereInput phaseNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PHASE_NOT_IN);
        return this;
    }

    public ReplicationTargetExecutionWhereInput phaseNotIn_ExplictlyNonNull() {
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

    public ReplicationTargetExecutionWhereInput replicaVm(ReplicaVmWhereInput replicaVm) {

        this.replicaVm = replicaVm;
        return this;
    }

    /**
     * Get replicaVm
     *
     * @return replicaVm
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ReplicaVmWhereInput getReplicaVm() {
        return replicaVm;
    }

    public void setReplicaVm(ReplicaVmWhereInput replicaVm) {
        this.replicaVm = replicaVm;
    }

    public ReplicationTargetExecutionWhereInput replicaVm_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICA_VM);
        return this;
    }

    public ReplicationTargetExecutionWhereInput replicaVm_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REPLICA_VM);
        return this;
    }

    public void setReplicaVm_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REPLICA_VM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REPLICA_VM);
        }
    }

    public boolean getReplicaVm_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REPLICA_VM);
    }

    public ReplicationTargetExecutionWhereInput replicationPlan(
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

    public ReplicationTargetExecutionWhereInput replicationPlan_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICATION_PLAN);
        return this;
    }

    public ReplicationTargetExecutionWhereInput replicationPlan_ExplictlyNonNull() {
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

    public ReplicationTargetExecutionWhereInput replicationPlanExecution(
            ReplicationPlanExecutionWhereInput replicationPlanExecution) {

        this.replicationPlanExecution = replicationPlanExecution;
        return this;
    }

    /**
     * Get replicationPlanExecution
     *
     * @return replicationPlanExecution
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ReplicationPlanExecutionWhereInput getReplicationPlanExecution() {
        return replicationPlanExecution;
    }

    public void setReplicationPlanExecution(
            ReplicationPlanExecutionWhereInput replicationPlanExecution) {
        this.replicationPlanExecution = replicationPlanExecution;
    }

    public ReplicationTargetExecutionWhereInput replicationPlanExecution_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICATION_PLAN_EXECUTION);
        return this;
    }

    public ReplicationTargetExecutionWhereInput replicationPlanExecution_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REPLICATION_PLAN_EXECUTION);
        return this;
    }

    public void setReplicationPlanExecution_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REPLICATION_PLAN_EXECUTION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REPLICATION_PLAN_EXECUTION);
        }
    }

    public boolean getReplicationPlanExecution_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REPLICATION_PLAN_EXECUTION);
    }

    public ReplicationTargetExecutionWhereInput resourceVersion(Integer resourceVersion) {

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

    public ReplicationTargetExecutionWhereInput resourceVersion_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_VERSION);
        return this;
    }

    public ReplicationTargetExecutionWhereInput resourceVersion_ExplictlyNonNull() {
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

    public ReplicationTargetExecutionWhereInput resourceVersionGt(Integer resourceVersionGt) {

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

    public ReplicationTargetExecutionWhereInput resourceVersionGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_VERSION_GT);
        return this;
    }

    public ReplicationTargetExecutionWhereInput resourceVersionGt_ExplictlyNonNull() {
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

    public ReplicationTargetExecutionWhereInput resourceVersionGte(Integer resourceVersionGte) {

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

    public ReplicationTargetExecutionWhereInput resourceVersionGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_VERSION_GTE);
        return this;
    }

    public ReplicationTargetExecutionWhereInput resourceVersionGte_ExplictlyNonNull() {
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

    public ReplicationTargetExecutionWhereInput resourceVersionIn(List<Integer> resourceVersionIn) {

        this.resourceVersionIn = resourceVersionIn;
        return this;
    }

    public ReplicationTargetExecutionWhereInput addResourceVersionInItem(
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

    public ReplicationTargetExecutionWhereInput resourceVersionIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_VERSION_IN);
        return this;
    }

    public ReplicationTargetExecutionWhereInput resourceVersionIn_ExplictlyNonNull() {
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

    public ReplicationTargetExecutionWhereInput resourceVersionLt(Integer resourceVersionLt) {

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

    public ReplicationTargetExecutionWhereInput resourceVersionLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_VERSION_LT);
        return this;
    }

    public ReplicationTargetExecutionWhereInput resourceVersionLt_ExplictlyNonNull() {
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

    public ReplicationTargetExecutionWhereInput resourceVersionLte(Integer resourceVersionLte) {

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

    public ReplicationTargetExecutionWhereInput resourceVersionLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_VERSION_LTE);
        return this;
    }

    public ReplicationTargetExecutionWhereInput resourceVersionLte_ExplictlyNonNull() {
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

    public ReplicationTargetExecutionWhereInput resourceVersionNot(Integer resourceVersionNot) {

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

    public ReplicationTargetExecutionWhereInput resourceVersionNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_VERSION_NOT);
        return this;
    }

    public ReplicationTargetExecutionWhereInput resourceVersionNot_ExplictlyNonNull() {
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

    public ReplicationTargetExecutionWhereInput resourceVersionNotIn(
            List<Integer> resourceVersionNotIn) {

        this.resourceVersionNotIn = resourceVersionNotIn;
        return this;
    }

    public ReplicationTargetExecutionWhereInput addResourceVersionNotInItem(
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

    public ReplicationTargetExecutionWhereInput resourceVersionNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_VERSION_NOT_IN);
        return this;
    }

    public ReplicationTargetExecutionWhereInput resourceVersionNotIn_ExplictlyNonNull() {
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

    public ReplicationTargetExecutionWhereInput startedAt(String startedAt) {

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

    public ReplicationTargetExecutionWhereInput startedAt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STARTED_AT);
        return this;
    }

    public ReplicationTargetExecutionWhereInput startedAt_ExplictlyNonNull() {
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

    public ReplicationTargetExecutionWhereInput startedAtGt(String startedAtGt) {

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

    public ReplicationTargetExecutionWhereInput startedAtGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STARTED_AT_GT);
        return this;
    }

    public ReplicationTargetExecutionWhereInput startedAtGt_ExplictlyNonNull() {
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

    public ReplicationTargetExecutionWhereInput startedAtGte(String startedAtGte) {

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

    public ReplicationTargetExecutionWhereInput startedAtGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STARTED_AT_GTE);
        return this;
    }

    public ReplicationTargetExecutionWhereInput startedAtGte_ExplictlyNonNull() {
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

    public ReplicationTargetExecutionWhereInput startedAtIn(List<String> startedAtIn) {

        this.startedAtIn = startedAtIn;
        return this;
    }

    public ReplicationTargetExecutionWhereInput addStartedAtInItem(String startedAtInItem) {
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

    public ReplicationTargetExecutionWhereInput startedAtIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STARTED_AT_IN);
        return this;
    }

    public ReplicationTargetExecutionWhereInput startedAtIn_ExplictlyNonNull() {
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

    public ReplicationTargetExecutionWhereInput startedAtLt(String startedAtLt) {

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

    public ReplicationTargetExecutionWhereInput startedAtLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STARTED_AT_LT);
        return this;
    }

    public ReplicationTargetExecutionWhereInput startedAtLt_ExplictlyNonNull() {
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

    public ReplicationTargetExecutionWhereInput startedAtLte(String startedAtLte) {

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

    public ReplicationTargetExecutionWhereInput startedAtLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STARTED_AT_LTE);
        return this;
    }

    public ReplicationTargetExecutionWhereInput startedAtLte_ExplictlyNonNull() {
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

    public ReplicationTargetExecutionWhereInput startedAtNot(String startedAtNot) {

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

    public ReplicationTargetExecutionWhereInput startedAtNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STARTED_AT_NOT);
        return this;
    }

    public ReplicationTargetExecutionWhereInput startedAtNot_ExplictlyNonNull() {
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

    public ReplicationTargetExecutionWhereInput startedAtNotIn(List<String> startedAtNotIn) {

        this.startedAtNotIn = startedAtNotIn;
        return this;
    }

    public ReplicationTargetExecutionWhereInput addStartedAtNotInItem(String startedAtNotInItem) {
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

    public ReplicationTargetExecutionWhereInput startedAtNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STARTED_AT_NOT_IN);
        return this;
    }

    public ReplicationTargetExecutionWhereInput startedAtNotIn_ExplictlyNonNull() {
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

    public ReplicationTargetExecutionWhereInput syncReplicationPlan(
            SyncReplicationPlanWhereInput syncReplicationPlan) {

        this.syncReplicationPlan = syncReplicationPlan;
        return this;
    }

    /**
     * Get syncReplicationPlan
     *
     * @return syncReplicationPlan
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public SyncReplicationPlanWhereInput getSyncReplicationPlan() {
        return syncReplicationPlan;
    }

    public void setSyncReplicationPlan(SyncReplicationPlanWhereInput syncReplicationPlan) {
        this.syncReplicationPlan = syncReplicationPlan;
    }

    public ReplicationTargetExecutionWhereInput syncReplicationPlan_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SYNC_REPLICATION_PLAN);
        return this;
    }

    public ReplicationTargetExecutionWhereInput syncReplicationPlan_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SYNC_REPLICATION_PLAN);
        return this;
    }

    public void setSyncReplicationPlan_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SYNC_REPLICATION_PLAN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SYNC_REPLICATION_PLAN);
        }
    }

    public boolean getSyncReplicationPlan_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SYNC_REPLICATION_PLAN);
    }

    public ReplicationTargetExecutionWhereInput type(BackupExecutionType type) {

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

    public ReplicationTargetExecutionWhereInput type_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE);
        return this;
    }

    public ReplicationTargetExecutionWhereInput type_ExplictlyNonNull() {
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

    public ReplicationTargetExecutionWhereInput typeIn(List<BackupExecutionType> typeIn) {

        this.typeIn = typeIn;
        return this;
    }

    public ReplicationTargetExecutionWhereInput addTypeInItem(BackupExecutionType typeInItem) {
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

    public ReplicationTargetExecutionWhereInput typeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE_IN);
        return this;
    }

    public ReplicationTargetExecutionWhereInput typeIn_ExplictlyNonNull() {
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

    public ReplicationTargetExecutionWhereInput typeNot(BackupExecutionType typeNot) {

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

    public ReplicationTargetExecutionWhereInput typeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE_NOT);
        return this;
    }

    public ReplicationTargetExecutionWhereInput typeNot_ExplictlyNonNull() {
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

    public ReplicationTargetExecutionWhereInput typeNotIn(List<BackupExecutionType> typeNotIn) {

        this.typeNotIn = typeNotIn;
        return this;
    }

    public ReplicationTargetExecutionWhereInput addTypeNotInItem(
            BackupExecutionType typeNotInItem) {
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

    public ReplicationTargetExecutionWhereInput typeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE_NOT_IN);
        return this;
    }

    public ReplicationTargetExecutionWhereInput typeNotIn_ExplictlyNonNull() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReplicationTargetExecutionWhereInput replicationTargetExecutionWhereInput =
                (ReplicationTargetExecutionWhereInput) o;
        return Objects.equals(this.AND, replicationTargetExecutionWhereInput.AND)
                && Objects.equals(this.NOT, replicationTargetExecutionWhereInput.NOT)
                && Objects.equals(this.OR, replicationTargetExecutionWhereInput.OR)
                && Objects.equals(this.creation, replicationTargetExecutionWhereInput.creation)
                && Objects.equals(this.creationIn, replicationTargetExecutionWhereInput.creationIn)
                && Objects.equals(
                        this.creationNot, replicationTargetExecutionWhereInput.creationNot)
                && Objects.equals(
                        this.creationNotIn, replicationTargetExecutionWhereInput.creationNotIn)
                && Objects.equals(
                        this.entityAsyncStatus,
                        replicationTargetExecutionWhereInput.entityAsyncStatus)
                && Objects.equals(
                        this.entityAsyncStatusIn,
                        replicationTargetExecutionWhereInput.entityAsyncStatusIn)
                && Objects.equals(
                        this.entityAsyncStatusNot,
                        replicationTargetExecutionWhereInput.entityAsyncStatusNot)
                && Objects.equals(
                        this.entityAsyncStatusNotIn,
                        replicationTargetExecutionWhereInput.entityAsyncStatusNotIn)
                && Objects.equals(this.finishedAt, replicationTargetExecutionWhereInput.finishedAt)
                && Objects.equals(
                        this.finishedAtGt, replicationTargetExecutionWhereInput.finishedAtGt)
                && Objects.equals(
                        this.finishedAtGte, replicationTargetExecutionWhereInput.finishedAtGte)
                && Objects.equals(
                        this.finishedAtIn, replicationTargetExecutionWhereInput.finishedAtIn)
                && Objects.equals(
                        this.finishedAtLt, replicationTargetExecutionWhereInput.finishedAtLt)
                && Objects.equals(
                        this.finishedAtLte, replicationTargetExecutionWhereInput.finishedAtLte)
                && Objects.equals(
                        this.finishedAtNot, replicationTargetExecutionWhereInput.finishedAtNot)
                && Objects.equals(
                        this.finishedAtNotIn, replicationTargetExecutionWhereInput.finishedAtNotIn)
                && Objects.equals(this.id, replicationTargetExecutionWhereInput.id)
                && Objects.equals(this.idContains, replicationTargetExecutionWhereInput.idContains)
                && Objects.equals(this.idEndsWith, replicationTargetExecutionWhereInput.idEndsWith)
                && Objects.equals(this.idGt, replicationTargetExecutionWhereInput.idGt)
                && Objects.equals(this.idGte, replicationTargetExecutionWhereInput.idGte)
                && Objects.equals(this.idIn, replicationTargetExecutionWhereInput.idIn)
                && Objects.equals(this.idLt, replicationTargetExecutionWhereInput.idLt)
                && Objects.equals(this.idLte, replicationTargetExecutionWhereInput.idLte)
                && Objects.equals(this.idNot, replicationTargetExecutionWhereInput.idNot)
                && Objects.equals(
                        this.idNotContains, replicationTargetExecutionWhereInput.idNotContains)
                && Objects.equals(
                        this.idNotEndsWith, replicationTargetExecutionWhereInput.idNotEndsWith)
                && Objects.equals(this.idNotIn, replicationTargetExecutionWhereInput.idNotIn)
                && Objects.equals(
                        this.idNotStartsWith, replicationTargetExecutionWhereInput.idNotStartsWith)
                && Objects.equals(
                        this.idStartsWith, replicationTargetExecutionWhereInput.idStartsWith)
                && Objects.equals(this.localId, replicationTargetExecutionWhereInput.localId)
                && Objects.equals(
                        this.localIdContains, replicationTargetExecutionWhereInput.localIdContains)
                && Objects.equals(
                        this.localIdEndsWith, replicationTargetExecutionWhereInput.localIdEndsWith)
                && Objects.equals(this.localIdGt, replicationTargetExecutionWhereInput.localIdGt)
                && Objects.equals(this.localIdGte, replicationTargetExecutionWhereInput.localIdGte)
                && Objects.equals(this.localIdIn, replicationTargetExecutionWhereInput.localIdIn)
                && Objects.equals(this.localIdLt, replicationTargetExecutionWhereInput.localIdLt)
                && Objects.equals(this.localIdLte, replicationTargetExecutionWhereInput.localIdLte)
                && Objects.equals(this.localIdNot, replicationTargetExecutionWhereInput.localIdNot)
                && Objects.equals(
                        this.localIdNotContains,
                        replicationTargetExecutionWhereInput.localIdNotContains)
                && Objects.equals(
                        this.localIdNotEndsWith,
                        replicationTargetExecutionWhereInput.localIdNotEndsWith)
                && Objects.equals(
                        this.localIdNotIn, replicationTargetExecutionWhereInput.localIdNotIn)
                && Objects.equals(
                        this.localIdNotStartsWith,
                        replicationTargetExecutionWhereInput.localIdNotStartsWith)
                && Objects.equals(
                        this.localIdStartsWith,
                        replicationTargetExecutionWhereInput.localIdStartsWith)
                && Objects.equals(this.phase, replicationTargetExecutionWhereInput.phase)
                && Objects.equals(this.phaseIn, replicationTargetExecutionWhereInput.phaseIn)
                && Objects.equals(this.phaseNot, replicationTargetExecutionWhereInput.phaseNot)
                && Objects.equals(this.phaseNotIn, replicationTargetExecutionWhereInput.phaseNotIn)
                && Objects.equals(this.replicaVm, replicationTargetExecutionWhereInput.replicaVm)
                && Objects.equals(
                        this.replicationPlan, replicationTargetExecutionWhereInput.replicationPlan)
                && Objects.equals(
                        this.replicationPlanExecution,
                        replicationTargetExecutionWhereInput.replicationPlanExecution)
                && Objects.equals(
                        this.resourceVersion, replicationTargetExecutionWhereInput.resourceVersion)
                && Objects.equals(
                        this.resourceVersionGt,
                        replicationTargetExecutionWhereInput.resourceVersionGt)
                && Objects.equals(
                        this.resourceVersionGte,
                        replicationTargetExecutionWhereInput.resourceVersionGte)
                && Objects.equals(
                        this.resourceVersionIn,
                        replicationTargetExecutionWhereInput.resourceVersionIn)
                && Objects.equals(
                        this.resourceVersionLt,
                        replicationTargetExecutionWhereInput.resourceVersionLt)
                && Objects.equals(
                        this.resourceVersionLte,
                        replicationTargetExecutionWhereInput.resourceVersionLte)
                && Objects.equals(
                        this.resourceVersionNot,
                        replicationTargetExecutionWhereInput.resourceVersionNot)
                && Objects.equals(
                        this.resourceVersionNotIn,
                        replicationTargetExecutionWhereInput.resourceVersionNotIn)
                && Objects.equals(this.startedAt, replicationTargetExecutionWhereInput.startedAt)
                && Objects.equals(
                        this.startedAtGt, replicationTargetExecutionWhereInput.startedAtGt)
                && Objects.equals(
                        this.startedAtGte, replicationTargetExecutionWhereInput.startedAtGte)
                && Objects.equals(
                        this.startedAtIn, replicationTargetExecutionWhereInput.startedAtIn)
                && Objects.equals(
                        this.startedAtLt, replicationTargetExecutionWhereInput.startedAtLt)
                && Objects.equals(
                        this.startedAtLte, replicationTargetExecutionWhereInput.startedAtLte)
                && Objects.equals(
                        this.startedAtNot, replicationTargetExecutionWhereInput.startedAtNot)
                && Objects.equals(
                        this.startedAtNotIn, replicationTargetExecutionWhereInput.startedAtNotIn)
                && Objects.equals(
                        this.syncReplicationPlan,
                        replicationTargetExecutionWhereInput.syncReplicationPlan)
                && Objects.equals(this.type, replicationTargetExecutionWhereInput.type)
                && Objects.equals(this.typeIn, replicationTargetExecutionWhereInput.typeIn)
                && Objects.equals(this.typeNot, replicationTargetExecutionWhereInput.typeNot)
                && Objects.equals(this.typeNotIn, replicationTargetExecutionWhereInput.typeNotIn);
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
                creation,
                creationIn,
                creationNot,
                creationNotIn,
                entityAsyncStatus,
                entityAsyncStatusIn,
                entityAsyncStatusNot,
                entityAsyncStatusNotIn,
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
                phase,
                phaseIn,
                phaseNot,
                phaseNotIn,
                replicaVm,
                replicationPlan,
                replicationPlanExecution,
                resourceVersion,
                resourceVersionGt,
                resourceVersionGte,
                resourceVersionIn,
                resourceVersionLt,
                resourceVersionLte,
                resourceVersionNot,
                resourceVersionNotIn,
                startedAt,
                startedAtGt,
                startedAtGte,
                startedAtIn,
                startedAtLt,
                startedAtLte,
                startedAtNot,
                startedAtNotIn,
                syncReplicationPlan,
                type,
                typeIn,
                typeNot,
                typeNotIn);
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
        sb.append("class ReplicationTargetExecutionWhereInput {\n");
        sb.append("    AND: ").append(toIndentedString(AND)).append("\n");
        sb.append("    NOT: ").append(toIndentedString(NOT)).append("\n");
        sb.append("    OR: ").append(toIndentedString(OR)).append("\n");
        sb.append("    creation: ").append(toIndentedString(creation)).append("\n");
        sb.append("    creationIn: ").append(toIndentedString(creationIn)).append("\n");
        sb.append("    creationNot: ").append(toIndentedString(creationNot)).append("\n");
        sb.append("    creationNotIn: ").append(toIndentedString(creationNotIn)).append("\n");
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
        sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
        sb.append("    phaseIn: ").append(toIndentedString(phaseIn)).append("\n");
        sb.append("    phaseNot: ").append(toIndentedString(phaseNot)).append("\n");
        sb.append("    phaseNotIn: ").append(toIndentedString(phaseNotIn)).append("\n");
        sb.append("    replicaVm: ").append(toIndentedString(replicaVm)).append("\n");
        sb.append("    replicationPlan: ").append(toIndentedString(replicationPlan)).append("\n");
        sb.append("    replicationPlanExecution: ")
                .append(toIndentedString(replicationPlanExecution))
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
        sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
        sb.append("    startedAtGt: ").append(toIndentedString(startedAtGt)).append("\n");
        sb.append("    startedAtGte: ").append(toIndentedString(startedAtGte)).append("\n");
        sb.append("    startedAtIn: ").append(toIndentedString(startedAtIn)).append("\n");
        sb.append("    startedAtLt: ").append(toIndentedString(startedAtLt)).append("\n");
        sb.append("    startedAtLte: ").append(toIndentedString(startedAtLte)).append("\n");
        sb.append("    startedAtNot: ").append(toIndentedString(startedAtNot)).append("\n");
        sb.append("    startedAtNotIn: ").append(toIndentedString(startedAtNotIn)).append("\n");
        sb.append("    syncReplicationPlan: ")
                .append(toIndentedString(syncReplicationPlan))
                .append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    typeIn: ").append(toIndentedString(typeIn)).append("\n");
        sb.append("    typeNot: ").append(toIndentedString(typeNot)).append("\n");
        sb.append("    typeNotIn: ").append(toIndentedString(typeNotIn)).append("\n");
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

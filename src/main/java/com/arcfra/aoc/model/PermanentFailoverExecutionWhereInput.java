package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** PermanentFailoverExecutionWhereInput */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class PermanentFailoverExecutionWhereInput
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_A_N_D = "AND";

    @SerializedName(SERIALIZED_NAME_A_N_D)
    private List<PermanentFailoverExecutionWhereInput> AND = null;

    public static final String SERIALIZED_NAME_N_O_T = "NOT";

    @SerializedName(SERIALIZED_NAME_N_O_T)
    private List<PermanentFailoverExecutionWhereInput> NOT = null;

    public static final String SERIALIZED_NAME_O_R = "OR";

    @SerializedName(SERIALIZED_NAME_O_R)
    private List<PermanentFailoverExecutionWhereInput> OR = null;

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

    public static final String SERIALIZED_NAME_PERMANENT_FAILOVER_TARGET_EXECUTIONS_EVERY =
            "permanent_failover_target_executions_every";

    @SerializedName(SERIALIZED_NAME_PERMANENT_FAILOVER_TARGET_EXECUTIONS_EVERY)
    private PermanentFailoverTargetExecutionWhereInput permanentFailoverTargetExecutionsEvery;

    public static final String SERIALIZED_NAME_PERMANENT_FAILOVER_TARGET_EXECUTIONS_NONE =
            "permanent_failover_target_executions_none";

    @SerializedName(SERIALIZED_NAME_PERMANENT_FAILOVER_TARGET_EXECUTIONS_NONE)
    private PermanentFailoverTargetExecutionWhereInput permanentFailoverTargetExecutionsNone;

    public static final String SERIALIZED_NAME_PERMANENT_FAILOVER_TARGET_EXECUTIONS_SOME =
            "permanent_failover_target_executions_some";

    @SerializedName(SERIALIZED_NAME_PERMANENT_FAILOVER_TARGET_EXECUTIONS_SOME)
    private PermanentFailoverTargetExecutionWhereInput permanentFailoverTargetExecutionsSome;

    public static final String SERIALIZED_NAME_REPLICATION_SERVICE = "replication_service";

    @SerializedName(SERIALIZED_NAME_REPLICATION_SERVICE)
    private ReplicationServiceWhereInput replicationService;

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

    public PermanentFailoverExecutionWhereInput() {}

    public PermanentFailoverExecutionWhereInput AND(
            List<PermanentFailoverExecutionWhereInput> AND) {

        this.AND = AND;
        return this;
    }

    public PermanentFailoverExecutionWhereInput addANDItem(
            PermanentFailoverExecutionWhereInput ANDItem) {
        if (this.AND == null) {
            this.AND = new ArrayList<PermanentFailoverExecutionWhereInput>();
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
    public List<PermanentFailoverExecutionWhereInput> getAND() {
        return AND;
    }

    public void setAND(List<PermanentFailoverExecutionWhereInput> AND) {
        this.AND = AND;
    }

    public PermanentFailoverExecutionWhereInput AND_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_A_N_D);
        return this;
    }

    public PermanentFailoverExecutionWhereInput AND_ExplictlyNonNull() {
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

    public PermanentFailoverExecutionWhereInput NOT(
            List<PermanentFailoverExecutionWhereInput> NOT) {

        this.NOT = NOT;
        return this;
    }

    public PermanentFailoverExecutionWhereInput addNOTItem(
            PermanentFailoverExecutionWhereInput NOTItem) {
        if (this.NOT == null) {
            this.NOT = new ArrayList<PermanentFailoverExecutionWhereInput>();
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
    public List<PermanentFailoverExecutionWhereInput> getNOT() {
        return NOT;
    }

    public void setNOT(List<PermanentFailoverExecutionWhereInput> NOT) {
        this.NOT = NOT;
    }

    public PermanentFailoverExecutionWhereInput NOT_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_N_O_T);
        return this;
    }

    public PermanentFailoverExecutionWhereInput NOT_ExplictlyNonNull() {
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

    public PermanentFailoverExecutionWhereInput OR(List<PermanentFailoverExecutionWhereInput> OR) {

        this.OR = OR;
        return this;
    }

    public PermanentFailoverExecutionWhereInput addORItem(
            PermanentFailoverExecutionWhereInput ORItem) {
        if (this.OR == null) {
            this.OR = new ArrayList<PermanentFailoverExecutionWhereInput>();
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
    public List<PermanentFailoverExecutionWhereInput> getOR() {
        return OR;
    }

    public void setOR(List<PermanentFailoverExecutionWhereInput> OR) {
        this.OR = OR;
    }

    public PermanentFailoverExecutionWhereInput OR_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_O_R);
        return this;
    }

    public PermanentFailoverExecutionWhereInput OR_ExplictlyNonNull() {
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

    public PermanentFailoverExecutionWhereInput createdAt(String createdAt) {

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

    public PermanentFailoverExecutionWhereInput createdAt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT);
        return this;
    }

    public PermanentFailoverExecutionWhereInput createdAt_ExplictlyNonNull() {
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

    public PermanentFailoverExecutionWhereInput createdAtGt(String createdAtGt) {

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

    public PermanentFailoverExecutionWhereInput createdAtGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_GT);
        return this;
    }

    public PermanentFailoverExecutionWhereInput createdAtGt_ExplictlyNonNull() {
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

    public PermanentFailoverExecutionWhereInput createdAtGte(String createdAtGte) {

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

    public PermanentFailoverExecutionWhereInput createdAtGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_GTE);
        return this;
    }

    public PermanentFailoverExecutionWhereInput createdAtGte_ExplictlyNonNull() {
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

    public PermanentFailoverExecutionWhereInput createdAtIn(List<String> createdAtIn) {

        this.createdAtIn = createdAtIn;
        return this;
    }

    public PermanentFailoverExecutionWhereInput addCreatedAtInItem(String createdAtInItem) {
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

    public PermanentFailoverExecutionWhereInput createdAtIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_IN);
        return this;
    }

    public PermanentFailoverExecutionWhereInput createdAtIn_ExplictlyNonNull() {
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

    public PermanentFailoverExecutionWhereInput createdAtLt(String createdAtLt) {

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

    public PermanentFailoverExecutionWhereInput createdAtLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_LT);
        return this;
    }

    public PermanentFailoverExecutionWhereInput createdAtLt_ExplictlyNonNull() {
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

    public PermanentFailoverExecutionWhereInput createdAtLte(String createdAtLte) {

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

    public PermanentFailoverExecutionWhereInput createdAtLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_LTE);
        return this;
    }

    public PermanentFailoverExecutionWhereInput createdAtLte_ExplictlyNonNull() {
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

    public PermanentFailoverExecutionWhereInput createdAtNot(String createdAtNot) {

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

    public PermanentFailoverExecutionWhereInput createdAtNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_NOT);
        return this;
    }

    public PermanentFailoverExecutionWhereInput createdAtNot_ExplictlyNonNull() {
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

    public PermanentFailoverExecutionWhereInput createdAtNotIn(List<String> createdAtNotIn) {

        this.createdAtNotIn = createdAtNotIn;
        return this;
    }

    public PermanentFailoverExecutionWhereInput addCreatedAtNotInItem(String createdAtNotInItem) {
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

    public PermanentFailoverExecutionWhereInput createdAtNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_NOT_IN);
        return this;
    }

    public PermanentFailoverExecutionWhereInput createdAtNotIn_ExplictlyNonNull() {
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

    public PermanentFailoverExecutionWhereInput externalCloudtower(
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

    public PermanentFailoverExecutionWhereInput externalCloudtower_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXTERNAL_CLOUDTOWER);
        return this;
    }

    public PermanentFailoverExecutionWhereInput externalCloudtower_ExplictlyNonNull() {
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

    public PermanentFailoverExecutionWhereInput finishedAt(String finishedAt) {

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

    public PermanentFailoverExecutionWhereInput finishedAt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FINISHED_AT);
        return this;
    }

    public PermanentFailoverExecutionWhereInput finishedAt_ExplictlyNonNull() {
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

    public PermanentFailoverExecutionWhereInput finishedAtGt(String finishedAtGt) {

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

    public PermanentFailoverExecutionWhereInput finishedAtGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FINISHED_AT_GT);
        return this;
    }

    public PermanentFailoverExecutionWhereInput finishedAtGt_ExplictlyNonNull() {
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

    public PermanentFailoverExecutionWhereInput finishedAtGte(String finishedAtGte) {

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

    public PermanentFailoverExecutionWhereInput finishedAtGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FINISHED_AT_GTE);
        return this;
    }

    public PermanentFailoverExecutionWhereInput finishedAtGte_ExplictlyNonNull() {
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

    public PermanentFailoverExecutionWhereInput finishedAtIn(List<String> finishedAtIn) {

        this.finishedAtIn = finishedAtIn;
        return this;
    }

    public PermanentFailoverExecutionWhereInput addFinishedAtInItem(String finishedAtInItem) {
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

    public PermanentFailoverExecutionWhereInput finishedAtIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FINISHED_AT_IN);
        return this;
    }

    public PermanentFailoverExecutionWhereInput finishedAtIn_ExplictlyNonNull() {
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

    public PermanentFailoverExecutionWhereInput finishedAtLt(String finishedAtLt) {

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

    public PermanentFailoverExecutionWhereInput finishedAtLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FINISHED_AT_LT);
        return this;
    }

    public PermanentFailoverExecutionWhereInput finishedAtLt_ExplictlyNonNull() {
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

    public PermanentFailoverExecutionWhereInput finishedAtLte(String finishedAtLte) {

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

    public PermanentFailoverExecutionWhereInput finishedAtLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FINISHED_AT_LTE);
        return this;
    }

    public PermanentFailoverExecutionWhereInput finishedAtLte_ExplictlyNonNull() {
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

    public PermanentFailoverExecutionWhereInput finishedAtNot(String finishedAtNot) {

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

    public PermanentFailoverExecutionWhereInput finishedAtNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FINISHED_AT_NOT);
        return this;
    }

    public PermanentFailoverExecutionWhereInput finishedAtNot_ExplictlyNonNull() {
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

    public PermanentFailoverExecutionWhereInput finishedAtNotIn(List<String> finishedAtNotIn) {

        this.finishedAtNotIn = finishedAtNotIn;
        return this;
    }

    public PermanentFailoverExecutionWhereInput addFinishedAtNotInItem(String finishedAtNotInItem) {
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

    public PermanentFailoverExecutionWhereInput finishedAtNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FINISHED_AT_NOT_IN);
        return this;
    }

    public PermanentFailoverExecutionWhereInput finishedAtNotIn_ExplictlyNonNull() {
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

    public PermanentFailoverExecutionWhereInput id(String id) {

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

    public PermanentFailoverExecutionWhereInput id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public PermanentFailoverExecutionWhereInput id_ExplictlyNonNull() {
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

    public PermanentFailoverExecutionWhereInput idContains(String idContains) {

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

    public PermanentFailoverExecutionWhereInput idContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_CONTAINS);
        return this;
    }

    public PermanentFailoverExecutionWhereInput idContains_ExplictlyNonNull() {
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

    public PermanentFailoverExecutionWhereInput idEndsWith(String idEndsWith) {

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

    public PermanentFailoverExecutionWhereInput idEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_ENDS_WITH);
        return this;
    }

    public PermanentFailoverExecutionWhereInput idEndsWith_ExplictlyNonNull() {
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

    public PermanentFailoverExecutionWhereInput idGt(String idGt) {

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

    public PermanentFailoverExecutionWhereInput idGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GT);
        return this;
    }

    public PermanentFailoverExecutionWhereInput idGt_ExplictlyNonNull() {
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

    public PermanentFailoverExecutionWhereInput idGte(String idGte) {

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

    public PermanentFailoverExecutionWhereInput idGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GTE);
        return this;
    }

    public PermanentFailoverExecutionWhereInput idGte_ExplictlyNonNull() {
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

    public PermanentFailoverExecutionWhereInput idIn(List<String> idIn) {

        this.idIn = idIn;
        return this;
    }

    public PermanentFailoverExecutionWhereInput addIdInItem(String idInItem) {
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

    public PermanentFailoverExecutionWhereInput idIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_IN);
        return this;
    }

    public PermanentFailoverExecutionWhereInput idIn_ExplictlyNonNull() {
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

    public PermanentFailoverExecutionWhereInput idLt(String idLt) {

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

    public PermanentFailoverExecutionWhereInput idLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LT);
        return this;
    }

    public PermanentFailoverExecutionWhereInput idLt_ExplictlyNonNull() {
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

    public PermanentFailoverExecutionWhereInput idLte(String idLte) {

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

    public PermanentFailoverExecutionWhereInput idLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LTE);
        return this;
    }

    public PermanentFailoverExecutionWhereInput idLte_ExplictlyNonNull() {
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

    public PermanentFailoverExecutionWhereInput idNot(String idNot) {

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

    public PermanentFailoverExecutionWhereInput idNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT);
        return this;
    }

    public PermanentFailoverExecutionWhereInput idNot_ExplictlyNonNull() {
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

    public PermanentFailoverExecutionWhereInput idNotContains(String idNotContains) {

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

    public PermanentFailoverExecutionWhereInput idNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_CONTAINS);
        return this;
    }

    public PermanentFailoverExecutionWhereInput idNotContains_ExplictlyNonNull() {
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

    public PermanentFailoverExecutionWhereInput idNotEndsWith(String idNotEndsWith) {

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

    public PermanentFailoverExecutionWhereInput idNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
        return this;
    }

    public PermanentFailoverExecutionWhereInput idNotEndsWith_ExplictlyNonNull() {
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

    public PermanentFailoverExecutionWhereInput idNotIn(List<String> idNotIn) {

        this.idNotIn = idNotIn;
        return this;
    }

    public PermanentFailoverExecutionWhereInput addIdNotInItem(String idNotInItem) {
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

    public PermanentFailoverExecutionWhereInput idNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_IN);
        return this;
    }

    public PermanentFailoverExecutionWhereInput idNotIn_ExplictlyNonNull() {
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

    public PermanentFailoverExecutionWhereInput idNotStartsWith(String idNotStartsWith) {

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

    public PermanentFailoverExecutionWhereInput idNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
        return this;
    }

    public PermanentFailoverExecutionWhereInput idNotStartsWith_ExplictlyNonNull() {
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

    public PermanentFailoverExecutionWhereInput idStartsWith(String idStartsWith) {

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

    public PermanentFailoverExecutionWhereInput idStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_STARTS_WITH);
        return this;
    }

    public PermanentFailoverExecutionWhereInput idStartsWith_ExplictlyNonNull() {
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

    public PermanentFailoverExecutionWhereInput isSyncReplication(Boolean isSyncReplication) {

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

    public PermanentFailoverExecutionWhereInput isSyncReplication_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IS_SYNC_REPLICATION);
        return this;
    }

    public PermanentFailoverExecutionWhereInput isSyncReplication_ExplictlyNonNull() {
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

    public PermanentFailoverExecutionWhereInput isSyncReplicationNot(Boolean isSyncReplicationNot) {

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

    public PermanentFailoverExecutionWhereInput isSyncReplicationNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IS_SYNC_REPLICATION_NOT);
        return this;
    }

    public PermanentFailoverExecutionWhereInput isSyncReplicationNot_ExplictlyNonNull() {
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

    public PermanentFailoverExecutionWhereInput permanentFailoverTargetExecutionsEvery(
            PermanentFailoverTargetExecutionWhereInput permanentFailoverTargetExecutionsEvery) {

        this.permanentFailoverTargetExecutionsEvery = permanentFailoverTargetExecutionsEvery;
        return this;
    }

    /**
     * Get permanentFailoverTargetExecutionsEvery
     *
     * @return permanentFailoverTargetExecutionsEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public PermanentFailoverTargetExecutionWhereInput getPermanentFailoverTargetExecutionsEvery() {
        return permanentFailoverTargetExecutionsEvery;
    }

    public void setPermanentFailoverTargetExecutionsEvery(
            PermanentFailoverTargetExecutionWhereInput permanentFailoverTargetExecutionsEvery) {
        this.permanentFailoverTargetExecutionsEvery = permanentFailoverTargetExecutionsEvery;
    }

    public PermanentFailoverExecutionWhereInput
            permanentFailoverTargetExecutionsEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PERMANENT_FAILOVER_TARGET_EXECUTIONS_EVERY);
        return this;
    }

    public PermanentFailoverExecutionWhereInput
            permanentFailoverTargetExecutionsEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PERMANENT_FAILOVER_TARGET_EXECUTIONS_EVERY);
        return this;
    }

    public void setPermanentFailoverTargetExecutionsEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PERMANENT_FAILOVER_TARGET_EXECUTIONS_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PERMANENT_FAILOVER_TARGET_EXECUTIONS_EVERY);
        }
    }

    public boolean getPermanentFailoverTargetExecutionsEvery_IsExplictlyNull() {
        return this._isPresent_.contains(
                SERIALIZED_NAME_PERMANENT_FAILOVER_TARGET_EXECUTIONS_EVERY);
    }

    public PermanentFailoverExecutionWhereInput permanentFailoverTargetExecutionsNone(
            PermanentFailoverTargetExecutionWhereInput permanentFailoverTargetExecutionsNone) {

        this.permanentFailoverTargetExecutionsNone = permanentFailoverTargetExecutionsNone;
        return this;
    }

    /**
     * Get permanentFailoverTargetExecutionsNone
     *
     * @return permanentFailoverTargetExecutionsNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public PermanentFailoverTargetExecutionWhereInput getPermanentFailoverTargetExecutionsNone() {
        return permanentFailoverTargetExecutionsNone;
    }

    public void setPermanentFailoverTargetExecutionsNone(
            PermanentFailoverTargetExecutionWhereInput permanentFailoverTargetExecutionsNone) {
        this.permanentFailoverTargetExecutionsNone = permanentFailoverTargetExecutionsNone;
    }

    public PermanentFailoverExecutionWhereInput
            permanentFailoverTargetExecutionsNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PERMANENT_FAILOVER_TARGET_EXECUTIONS_NONE);
        return this;
    }

    public PermanentFailoverExecutionWhereInput
            permanentFailoverTargetExecutionsNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PERMANENT_FAILOVER_TARGET_EXECUTIONS_NONE);
        return this;
    }

    public void setPermanentFailoverTargetExecutionsNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PERMANENT_FAILOVER_TARGET_EXECUTIONS_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PERMANENT_FAILOVER_TARGET_EXECUTIONS_NONE);
        }
    }

    public boolean getPermanentFailoverTargetExecutionsNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PERMANENT_FAILOVER_TARGET_EXECUTIONS_NONE);
    }

    public PermanentFailoverExecutionWhereInput permanentFailoverTargetExecutionsSome(
            PermanentFailoverTargetExecutionWhereInput permanentFailoverTargetExecutionsSome) {

        this.permanentFailoverTargetExecutionsSome = permanentFailoverTargetExecutionsSome;
        return this;
    }

    /**
     * Get permanentFailoverTargetExecutionsSome
     *
     * @return permanentFailoverTargetExecutionsSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public PermanentFailoverTargetExecutionWhereInput getPermanentFailoverTargetExecutionsSome() {
        return permanentFailoverTargetExecutionsSome;
    }

    public void setPermanentFailoverTargetExecutionsSome(
            PermanentFailoverTargetExecutionWhereInput permanentFailoverTargetExecutionsSome) {
        this.permanentFailoverTargetExecutionsSome = permanentFailoverTargetExecutionsSome;
    }

    public PermanentFailoverExecutionWhereInput
            permanentFailoverTargetExecutionsSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PERMANENT_FAILOVER_TARGET_EXECUTIONS_SOME);
        return this;
    }

    public PermanentFailoverExecutionWhereInput
            permanentFailoverTargetExecutionsSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PERMANENT_FAILOVER_TARGET_EXECUTIONS_SOME);
        return this;
    }

    public void setPermanentFailoverTargetExecutionsSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PERMANENT_FAILOVER_TARGET_EXECUTIONS_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PERMANENT_FAILOVER_TARGET_EXECUTIONS_SOME);
        }
    }

    public boolean getPermanentFailoverTargetExecutionsSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PERMANENT_FAILOVER_TARGET_EXECUTIONS_SOME);
    }

    public PermanentFailoverExecutionWhereInput replicationService(
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

    public PermanentFailoverExecutionWhereInput replicationService_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICATION_SERVICE);
        return this;
    }

    public PermanentFailoverExecutionWhereInput replicationService_ExplictlyNonNull() {
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

    public PermanentFailoverExecutionWhereInput startedAt(String startedAt) {

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

    public PermanentFailoverExecutionWhereInput startedAt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STARTED_AT);
        return this;
    }

    public PermanentFailoverExecutionWhereInput startedAt_ExplictlyNonNull() {
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

    public PermanentFailoverExecutionWhereInput startedAtGt(String startedAtGt) {

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

    public PermanentFailoverExecutionWhereInput startedAtGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STARTED_AT_GT);
        return this;
    }

    public PermanentFailoverExecutionWhereInput startedAtGt_ExplictlyNonNull() {
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

    public PermanentFailoverExecutionWhereInput startedAtGte(String startedAtGte) {

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

    public PermanentFailoverExecutionWhereInput startedAtGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STARTED_AT_GTE);
        return this;
    }

    public PermanentFailoverExecutionWhereInput startedAtGte_ExplictlyNonNull() {
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

    public PermanentFailoverExecutionWhereInput startedAtIn(List<String> startedAtIn) {

        this.startedAtIn = startedAtIn;
        return this;
    }

    public PermanentFailoverExecutionWhereInput addStartedAtInItem(String startedAtInItem) {
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

    public PermanentFailoverExecutionWhereInput startedAtIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STARTED_AT_IN);
        return this;
    }

    public PermanentFailoverExecutionWhereInput startedAtIn_ExplictlyNonNull() {
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

    public PermanentFailoverExecutionWhereInput startedAtLt(String startedAtLt) {

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

    public PermanentFailoverExecutionWhereInput startedAtLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STARTED_AT_LT);
        return this;
    }

    public PermanentFailoverExecutionWhereInput startedAtLt_ExplictlyNonNull() {
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

    public PermanentFailoverExecutionWhereInput startedAtLte(String startedAtLte) {

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

    public PermanentFailoverExecutionWhereInput startedAtLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STARTED_AT_LTE);
        return this;
    }

    public PermanentFailoverExecutionWhereInput startedAtLte_ExplictlyNonNull() {
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

    public PermanentFailoverExecutionWhereInput startedAtNot(String startedAtNot) {

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

    public PermanentFailoverExecutionWhereInput startedAtNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STARTED_AT_NOT);
        return this;
    }

    public PermanentFailoverExecutionWhereInput startedAtNot_ExplictlyNonNull() {
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

    public PermanentFailoverExecutionWhereInput startedAtNotIn(List<String> startedAtNotIn) {

        this.startedAtNotIn = startedAtNotIn;
        return this;
    }

    public PermanentFailoverExecutionWhereInput addStartedAtNotInItem(String startedAtNotInItem) {
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

    public PermanentFailoverExecutionWhereInput startedAtNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STARTED_AT_NOT_IN);
        return this;
    }

    public PermanentFailoverExecutionWhereInput startedAtNotIn_ExplictlyNonNull() {
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

    public PermanentFailoverExecutionWhereInput state(BackupExecutionState state) {

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

    public PermanentFailoverExecutionWhereInput state_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATE);
        return this;
    }

    public PermanentFailoverExecutionWhereInput state_ExplictlyNonNull() {
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

    public PermanentFailoverExecutionWhereInput stateIn(List<BackupExecutionState> stateIn) {

        this.stateIn = stateIn;
        return this;
    }

    public PermanentFailoverExecutionWhereInput addStateInItem(BackupExecutionState stateInItem) {
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

    public PermanentFailoverExecutionWhereInput stateIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATE_IN);
        return this;
    }

    public PermanentFailoverExecutionWhereInput stateIn_ExplictlyNonNull() {
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

    public PermanentFailoverExecutionWhereInput stateNot(BackupExecutionState stateNot) {

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

    public PermanentFailoverExecutionWhereInput stateNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATE_NOT);
        return this;
    }

    public PermanentFailoverExecutionWhereInput stateNot_ExplictlyNonNull() {
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

    public PermanentFailoverExecutionWhereInput stateNotIn(List<BackupExecutionState> stateNotIn) {

        this.stateNotIn = stateNotIn;
        return this;
    }

    public PermanentFailoverExecutionWhereInput addStateNotInItem(
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

    public PermanentFailoverExecutionWhereInput stateNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATE_NOT_IN);
        return this;
    }

    public PermanentFailoverExecutionWhereInput stateNotIn_ExplictlyNonNull() {
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

    public PermanentFailoverExecutionWhereInput updatedAt(String updatedAt) {

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

    public PermanentFailoverExecutionWhereInput updatedAt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPDATED_AT);
        return this;
    }

    public PermanentFailoverExecutionWhereInput updatedAt_ExplictlyNonNull() {
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

    public PermanentFailoverExecutionWhereInput updatedAtGt(String updatedAtGt) {

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

    public PermanentFailoverExecutionWhereInput updatedAtGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPDATED_AT_GT);
        return this;
    }

    public PermanentFailoverExecutionWhereInput updatedAtGt_ExplictlyNonNull() {
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

    public PermanentFailoverExecutionWhereInput updatedAtGte(String updatedAtGte) {

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

    public PermanentFailoverExecutionWhereInput updatedAtGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPDATED_AT_GTE);
        return this;
    }

    public PermanentFailoverExecutionWhereInput updatedAtGte_ExplictlyNonNull() {
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

    public PermanentFailoverExecutionWhereInput updatedAtIn(List<String> updatedAtIn) {

        this.updatedAtIn = updatedAtIn;
        return this;
    }

    public PermanentFailoverExecutionWhereInput addUpdatedAtInItem(String updatedAtInItem) {
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

    public PermanentFailoverExecutionWhereInput updatedAtIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPDATED_AT_IN);
        return this;
    }

    public PermanentFailoverExecutionWhereInput updatedAtIn_ExplictlyNonNull() {
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

    public PermanentFailoverExecutionWhereInput updatedAtLt(String updatedAtLt) {

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

    public PermanentFailoverExecutionWhereInput updatedAtLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPDATED_AT_LT);
        return this;
    }

    public PermanentFailoverExecutionWhereInput updatedAtLt_ExplictlyNonNull() {
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

    public PermanentFailoverExecutionWhereInput updatedAtLte(String updatedAtLte) {

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

    public PermanentFailoverExecutionWhereInput updatedAtLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPDATED_AT_LTE);
        return this;
    }

    public PermanentFailoverExecutionWhereInput updatedAtLte_ExplictlyNonNull() {
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

    public PermanentFailoverExecutionWhereInput updatedAtNot(String updatedAtNot) {

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

    public PermanentFailoverExecutionWhereInput updatedAtNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPDATED_AT_NOT);
        return this;
    }

    public PermanentFailoverExecutionWhereInput updatedAtNot_ExplictlyNonNull() {
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

    public PermanentFailoverExecutionWhereInput updatedAtNotIn(List<String> updatedAtNotIn) {

        this.updatedAtNotIn = updatedAtNotIn;
        return this;
    }

    public PermanentFailoverExecutionWhereInput addUpdatedAtNotInItem(String updatedAtNotInItem) {
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

    public PermanentFailoverExecutionWhereInput updatedAtNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPDATED_AT_NOT_IN);
        return this;
    }

    public PermanentFailoverExecutionWhereInput updatedAtNotIn_ExplictlyNonNull() {
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
        PermanentFailoverExecutionWhereInput permanentFailoverExecutionWhereInput =
                (PermanentFailoverExecutionWhereInput) o;
        return Objects.equals(this.AND, permanentFailoverExecutionWhereInput.AND)
                && Objects.equals(this.NOT, permanentFailoverExecutionWhereInput.NOT)
                && Objects.equals(this.OR, permanentFailoverExecutionWhereInput.OR)
                && Objects.equals(this.createdAt, permanentFailoverExecutionWhereInput.createdAt)
                && Objects.equals(
                        this.createdAtGt, permanentFailoverExecutionWhereInput.createdAtGt)
                && Objects.equals(
                        this.createdAtGte, permanentFailoverExecutionWhereInput.createdAtGte)
                && Objects.equals(
                        this.createdAtIn, permanentFailoverExecutionWhereInput.createdAtIn)
                && Objects.equals(
                        this.createdAtLt, permanentFailoverExecutionWhereInput.createdAtLt)
                && Objects.equals(
                        this.createdAtLte, permanentFailoverExecutionWhereInput.createdAtLte)
                && Objects.equals(
                        this.createdAtNot, permanentFailoverExecutionWhereInput.createdAtNot)
                && Objects.equals(
                        this.createdAtNotIn, permanentFailoverExecutionWhereInput.createdAtNotIn)
                && Objects.equals(
                        this.externalCloudtower,
                        permanentFailoverExecutionWhereInput.externalCloudtower)
                && Objects.equals(this.finishedAt, permanentFailoverExecutionWhereInput.finishedAt)
                && Objects.equals(
                        this.finishedAtGt, permanentFailoverExecutionWhereInput.finishedAtGt)
                && Objects.equals(
                        this.finishedAtGte, permanentFailoverExecutionWhereInput.finishedAtGte)
                && Objects.equals(
                        this.finishedAtIn, permanentFailoverExecutionWhereInput.finishedAtIn)
                && Objects.equals(
                        this.finishedAtLt, permanentFailoverExecutionWhereInput.finishedAtLt)
                && Objects.equals(
                        this.finishedAtLte, permanentFailoverExecutionWhereInput.finishedAtLte)
                && Objects.equals(
                        this.finishedAtNot, permanentFailoverExecutionWhereInput.finishedAtNot)
                && Objects.equals(
                        this.finishedAtNotIn, permanentFailoverExecutionWhereInput.finishedAtNotIn)
                && Objects.equals(this.id, permanentFailoverExecutionWhereInput.id)
                && Objects.equals(this.idContains, permanentFailoverExecutionWhereInput.idContains)
                && Objects.equals(this.idEndsWith, permanentFailoverExecutionWhereInput.idEndsWith)
                && Objects.equals(this.idGt, permanentFailoverExecutionWhereInput.idGt)
                && Objects.equals(this.idGte, permanentFailoverExecutionWhereInput.idGte)
                && Objects.equals(this.idIn, permanentFailoverExecutionWhereInput.idIn)
                && Objects.equals(this.idLt, permanentFailoverExecutionWhereInput.idLt)
                && Objects.equals(this.idLte, permanentFailoverExecutionWhereInput.idLte)
                && Objects.equals(this.idNot, permanentFailoverExecutionWhereInput.idNot)
                && Objects.equals(
                        this.idNotContains, permanentFailoverExecutionWhereInput.idNotContains)
                && Objects.equals(
                        this.idNotEndsWith, permanentFailoverExecutionWhereInput.idNotEndsWith)
                && Objects.equals(this.idNotIn, permanentFailoverExecutionWhereInput.idNotIn)
                && Objects.equals(
                        this.idNotStartsWith, permanentFailoverExecutionWhereInput.idNotStartsWith)
                && Objects.equals(
                        this.idStartsWith, permanentFailoverExecutionWhereInput.idStartsWith)
                && Objects.equals(
                        this.isSyncReplication,
                        permanentFailoverExecutionWhereInput.isSyncReplication)
                && Objects.equals(
                        this.isSyncReplicationNot,
                        permanentFailoverExecutionWhereInput.isSyncReplicationNot)
                && Objects.equals(
                        this.permanentFailoverTargetExecutionsEvery,
                        permanentFailoverExecutionWhereInput.permanentFailoverTargetExecutionsEvery)
                && Objects.equals(
                        this.permanentFailoverTargetExecutionsNone,
                        permanentFailoverExecutionWhereInput.permanentFailoverTargetExecutionsNone)
                && Objects.equals(
                        this.permanentFailoverTargetExecutionsSome,
                        permanentFailoverExecutionWhereInput.permanentFailoverTargetExecutionsSome)
                && Objects.equals(
                        this.replicationService,
                        permanentFailoverExecutionWhereInput.replicationService)
                && Objects.equals(this.startedAt, permanentFailoverExecutionWhereInput.startedAt)
                && Objects.equals(
                        this.startedAtGt, permanentFailoverExecutionWhereInput.startedAtGt)
                && Objects.equals(
                        this.startedAtGte, permanentFailoverExecutionWhereInput.startedAtGte)
                && Objects.equals(
                        this.startedAtIn, permanentFailoverExecutionWhereInput.startedAtIn)
                && Objects.equals(
                        this.startedAtLt, permanentFailoverExecutionWhereInput.startedAtLt)
                && Objects.equals(
                        this.startedAtLte, permanentFailoverExecutionWhereInput.startedAtLte)
                && Objects.equals(
                        this.startedAtNot, permanentFailoverExecutionWhereInput.startedAtNot)
                && Objects.equals(
                        this.startedAtNotIn, permanentFailoverExecutionWhereInput.startedAtNotIn)
                && Objects.equals(this.state, permanentFailoverExecutionWhereInput.state)
                && Objects.equals(this.stateIn, permanentFailoverExecutionWhereInput.stateIn)
                && Objects.equals(this.stateNot, permanentFailoverExecutionWhereInput.stateNot)
                && Objects.equals(this.stateNotIn, permanentFailoverExecutionWhereInput.stateNotIn)
                && Objects.equals(this.updatedAt, permanentFailoverExecutionWhereInput.updatedAt)
                && Objects.equals(
                        this.updatedAtGt, permanentFailoverExecutionWhereInput.updatedAtGt)
                && Objects.equals(
                        this.updatedAtGte, permanentFailoverExecutionWhereInput.updatedAtGte)
                && Objects.equals(
                        this.updatedAtIn, permanentFailoverExecutionWhereInput.updatedAtIn)
                && Objects.equals(
                        this.updatedAtLt, permanentFailoverExecutionWhereInput.updatedAtLt)
                && Objects.equals(
                        this.updatedAtLte, permanentFailoverExecutionWhereInput.updatedAtLte)
                && Objects.equals(
                        this.updatedAtNot, permanentFailoverExecutionWhereInput.updatedAtNot)
                && Objects.equals(
                        this.updatedAtNotIn, permanentFailoverExecutionWhereInput.updatedAtNotIn);
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
                permanentFailoverTargetExecutionsEvery,
                permanentFailoverTargetExecutionsNone,
                permanentFailoverTargetExecutionsSome,
                replicationService,
                startedAt,
                startedAtGt,
                startedAtGte,
                startedAtIn,
                startedAtLt,
                startedAtLte,
                startedAtNot,
                startedAtNotIn,
                state,
                stateIn,
                stateNot,
                stateNotIn,
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
        sb.append("class PermanentFailoverExecutionWhereInput {\n");
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
        sb.append("    permanentFailoverTargetExecutionsEvery: ")
                .append(toIndentedString(permanentFailoverTargetExecutionsEvery))
                .append("\n");
        sb.append("    permanentFailoverTargetExecutionsNone: ")
                .append(toIndentedString(permanentFailoverTargetExecutionsNone))
                .append("\n");
        sb.append("    permanentFailoverTargetExecutionsSome: ")
                .append(toIndentedString(permanentFailoverTargetExecutionsSome))
                .append("\n");
        sb.append("    replicationService: ")
                .append(toIndentedString(replicationService))
                .append("\n");
        sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
        sb.append("    startedAtGt: ").append(toIndentedString(startedAtGt)).append("\n");
        sb.append("    startedAtGte: ").append(toIndentedString(startedAtGte)).append("\n");
        sb.append("    startedAtIn: ").append(toIndentedString(startedAtIn)).append("\n");
        sb.append("    startedAtLt: ").append(toIndentedString(startedAtLt)).append("\n");
        sb.append("    startedAtLte: ").append(toIndentedString(startedAtLte)).append("\n");
        sb.append("    startedAtNot: ").append(toIndentedString(startedAtNot)).append("\n");
        sb.append("    startedAtNotIn: ").append(toIndentedString(startedAtNotIn)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    stateIn: ").append(toIndentedString(stateIn)).append("\n");
        sb.append("    stateNot: ").append(toIndentedString(stateNot)).append("\n");
        sb.append("    stateNotIn: ").append(toIndentedString(stateNotIn)).append("\n");
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

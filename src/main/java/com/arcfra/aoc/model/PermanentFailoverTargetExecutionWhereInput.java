package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** PermanentFailoverTargetExecutionWhereInput */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class PermanentFailoverTargetExecutionWhereInput
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_A_N_D = "AND";

    @SerializedName(SERIALIZED_NAME_A_N_D)
    private List<PermanentFailoverTargetExecutionWhereInput> AND = null;

    public static final String SERIALIZED_NAME_N_O_T = "NOT";

    @SerializedName(SERIALIZED_NAME_N_O_T)
    private List<PermanentFailoverTargetExecutionWhereInput> NOT = null;

    public static final String SERIALIZED_NAME_O_R = "OR";

    @SerializedName(SERIALIZED_NAME_O_R)
    private List<PermanentFailoverTargetExecutionWhereInput> OR = null;

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

    public static final String SERIALIZED_NAME_KEEP_SNAPSHOT = "keep_snapshot";

    @SerializedName(SERIALIZED_NAME_KEEP_SNAPSHOT)
    private Boolean keepSnapshot;

    public static final String SERIALIZED_NAME_KEEP_SNAPSHOT_NOT = "keep_snapshot_not";

    @SerializedName(SERIALIZED_NAME_KEEP_SNAPSHOT_NOT)
    private Boolean keepSnapshotNot;

    public static final String SERIALIZED_NAME_KEEP_TEST_VM = "keep_test_vm";

    @SerializedName(SERIALIZED_NAME_KEEP_TEST_VM)
    private Boolean keepTestVm;

    public static final String SERIALIZED_NAME_KEEP_TEST_VM_NOT = "keep_test_vm_not";

    @SerializedName(SERIALIZED_NAME_KEEP_TEST_VM_NOT)
    private Boolean keepTestVmNot;

    public static final String SERIALIZED_NAME_PERMANENT_FAILOVER_EXECUTION =
            "permanent_failover_execution";

    @SerializedName(SERIALIZED_NAME_PERMANENT_FAILOVER_EXECUTION)
    private PermanentFailoverExecutionWhereInput permanentFailoverExecution;

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

    public PermanentFailoverTargetExecutionWhereInput() {}

    public PermanentFailoverTargetExecutionWhereInput AND(
            List<PermanentFailoverTargetExecutionWhereInput> AND) {

        this.AND = AND;
        return this;
    }

    public PermanentFailoverTargetExecutionWhereInput addANDItem(
            PermanentFailoverTargetExecutionWhereInput ANDItem) {
        if (this.AND == null) {
            this.AND = new ArrayList<PermanentFailoverTargetExecutionWhereInput>();
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
    public List<PermanentFailoverTargetExecutionWhereInput> getAND() {
        return AND;
    }

    public void setAND(List<PermanentFailoverTargetExecutionWhereInput> AND) {
        this.AND = AND;
    }

    public PermanentFailoverTargetExecutionWhereInput AND_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_A_N_D);
        return this;
    }

    public PermanentFailoverTargetExecutionWhereInput AND_ExplictlyNonNull() {
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

    public PermanentFailoverTargetExecutionWhereInput NOT(
            List<PermanentFailoverTargetExecutionWhereInput> NOT) {

        this.NOT = NOT;
        return this;
    }

    public PermanentFailoverTargetExecutionWhereInput addNOTItem(
            PermanentFailoverTargetExecutionWhereInput NOTItem) {
        if (this.NOT == null) {
            this.NOT = new ArrayList<PermanentFailoverTargetExecutionWhereInput>();
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
    public List<PermanentFailoverTargetExecutionWhereInput> getNOT() {
        return NOT;
    }

    public void setNOT(List<PermanentFailoverTargetExecutionWhereInput> NOT) {
        this.NOT = NOT;
    }

    public PermanentFailoverTargetExecutionWhereInput NOT_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_N_O_T);
        return this;
    }

    public PermanentFailoverTargetExecutionWhereInput NOT_ExplictlyNonNull() {
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

    public PermanentFailoverTargetExecutionWhereInput OR(
            List<PermanentFailoverTargetExecutionWhereInput> OR) {

        this.OR = OR;
        return this;
    }

    public PermanentFailoverTargetExecutionWhereInput addORItem(
            PermanentFailoverTargetExecutionWhereInput ORItem) {
        if (this.OR == null) {
            this.OR = new ArrayList<PermanentFailoverTargetExecutionWhereInput>();
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
    public List<PermanentFailoverTargetExecutionWhereInput> getOR() {
        return OR;
    }

    public void setOR(List<PermanentFailoverTargetExecutionWhereInput> OR) {
        this.OR = OR;
    }

    public PermanentFailoverTargetExecutionWhereInput OR_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_O_R);
        return this;
    }

    public PermanentFailoverTargetExecutionWhereInput OR_ExplictlyNonNull() {
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

    public PermanentFailoverTargetExecutionWhereInput createdAt(String createdAt) {

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

    public PermanentFailoverTargetExecutionWhereInput createdAt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT);
        return this;
    }

    public PermanentFailoverTargetExecutionWhereInput createdAt_ExplictlyNonNull() {
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

    public PermanentFailoverTargetExecutionWhereInput createdAtGt(String createdAtGt) {

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

    public PermanentFailoverTargetExecutionWhereInput createdAtGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_GT);
        return this;
    }

    public PermanentFailoverTargetExecutionWhereInput createdAtGt_ExplictlyNonNull() {
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

    public PermanentFailoverTargetExecutionWhereInput createdAtGte(String createdAtGte) {

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

    public PermanentFailoverTargetExecutionWhereInput createdAtGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_GTE);
        return this;
    }

    public PermanentFailoverTargetExecutionWhereInput createdAtGte_ExplictlyNonNull() {
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

    public PermanentFailoverTargetExecutionWhereInput createdAtIn(List<String> createdAtIn) {

        this.createdAtIn = createdAtIn;
        return this;
    }

    public PermanentFailoverTargetExecutionWhereInput addCreatedAtInItem(String createdAtInItem) {
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

    public PermanentFailoverTargetExecutionWhereInput createdAtIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_IN);
        return this;
    }

    public PermanentFailoverTargetExecutionWhereInput createdAtIn_ExplictlyNonNull() {
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

    public PermanentFailoverTargetExecutionWhereInput createdAtLt(String createdAtLt) {

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

    public PermanentFailoverTargetExecutionWhereInput createdAtLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_LT);
        return this;
    }

    public PermanentFailoverTargetExecutionWhereInput createdAtLt_ExplictlyNonNull() {
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

    public PermanentFailoverTargetExecutionWhereInput createdAtLte(String createdAtLte) {

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

    public PermanentFailoverTargetExecutionWhereInput createdAtLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_LTE);
        return this;
    }

    public PermanentFailoverTargetExecutionWhereInput createdAtLte_ExplictlyNonNull() {
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

    public PermanentFailoverTargetExecutionWhereInput createdAtNot(String createdAtNot) {

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

    public PermanentFailoverTargetExecutionWhereInput createdAtNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_NOT);
        return this;
    }

    public PermanentFailoverTargetExecutionWhereInput createdAtNot_ExplictlyNonNull() {
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

    public PermanentFailoverTargetExecutionWhereInput createdAtNotIn(List<String> createdAtNotIn) {

        this.createdAtNotIn = createdAtNotIn;
        return this;
    }

    public PermanentFailoverTargetExecutionWhereInput addCreatedAtNotInItem(
            String createdAtNotInItem) {
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

    public PermanentFailoverTargetExecutionWhereInput createdAtNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_NOT_IN);
        return this;
    }

    public PermanentFailoverTargetExecutionWhereInput createdAtNotIn_ExplictlyNonNull() {
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

    public PermanentFailoverTargetExecutionWhereInput externalCloudtower(
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

    public PermanentFailoverTargetExecutionWhereInput externalCloudtower_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXTERNAL_CLOUDTOWER);
        return this;
    }

    public PermanentFailoverTargetExecutionWhereInput externalCloudtower_ExplictlyNonNull() {
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

    public PermanentFailoverTargetExecutionWhereInput finishedAt(String finishedAt) {

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

    public PermanentFailoverTargetExecutionWhereInput finishedAt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FINISHED_AT);
        return this;
    }

    public PermanentFailoverTargetExecutionWhereInput finishedAt_ExplictlyNonNull() {
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

    public PermanentFailoverTargetExecutionWhereInput finishedAtGt(String finishedAtGt) {

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

    public PermanentFailoverTargetExecutionWhereInput finishedAtGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FINISHED_AT_GT);
        return this;
    }

    public PermanentFailoverTargetExecutionWhereInput finishedAtGt_ExplictlyNonNull() {
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

    public PermanentFailoverTargetExecutionWhereInput finishedAtGte(String finishedAtGte) {

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

    public PermanentFailoverTargetExecutionWhereInput finishedAtGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FINISHED_AT_GTE);
        return this;
    }

    public PermanentFailoverTargetExecutionWhereInput finishedAtGte_ExplictlyNonNull() {
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

    public PermanentFailoverTargetExecutionWhereInput finishedAtIn(List<String> finishedAtIn) {

        this.finishedAtIn = finishedAtIn;
        return this;
    }

    public PermanentFailoverTargetExecutionWhereInput addFinishedAtInItem(String finishedAtInItem) {
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

    public PermanentFailoverTargetExecutionWhereInput finishedAtIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FINISHED_AT_IN);
        return this;
    }

    public PermanentFailoverTargetExecutionWhereInput finishedAtIn_ExplictlyNonNull() {
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

    public PermanentFailoverTargetExecutionWhereInput finishedAtLt(String finishedAtLt) {

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

    public PermanentFailoverTargetExecutionWhereInput finishedAtLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FINISHED_AT_LT);
        return this;
    }

    public PermanentFailoverTargetExecutionWhereInput finishedAtLt_ExplictlyNonNull() {
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

    public PermanentFailoverTargetExecutionWhereInput finishedAtLte(String finishedAtLte) {

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

    public PermanentFailoverTargetExecutionWhereInput finishedAtLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FINISHED_AT_LTE);
        return this;
    }

    public PermanentFailoverTargetExecutionWhereInput finishedAtLte_ExplictlyNonNull() {
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

    public PermanentFailoverTargetExecutionWhereInput finishedAtNot(String finishedAtNot) {

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

    public PermanentFailoverTargetExecutionWhereInput finishedAtNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FINISHED_AT_NOT);
        return this;
    }

    public PermanentFailoverTargetExecutionWhereInput finishedAtNot_ExplictlyNonNull() {
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

    public PermanentFailoverTargetExecutionWhereInput finishedAtNotIn(
            List<String> finishedAtNotIn) {

        this.finishedAtNotIn = finishedAtNotIn;
        return this;
    }

    public PermanentFailoverTargetExecutionWhereInput addFinishedAtNotInItem(
            String finishedAtNotInItem) {
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

    public PermanentFailoverTargetExecutionWhereInput finishedAtNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FINISHED_AT_NOT_IN);
        return this;
    }

    public PermanentFailoverTargetExecutionWhereInput finishedAtNotIn_ExplictlyNonNull() {
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

    public PermanentFailoverTargetExecutionWhereInput id(String id) {

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

    public PermanentFailoverTargetExecutionWhereInput id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public PermanentFailoverTargetExecutionWhereInput id_ExplictlyNonNull() {
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

    public PermanentFailoverTargetExecutionWhereInput idContains(String idContains) {

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

    public PermanentFailoverTargetExecutionWhereInput idContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_CONTAINS);
        return this;
    }

    public PermanentFailoverTargetExecutionWhereInput idContains_ExplictlyNonNull() {
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

    public PermanentFailoverTargetExecutionWhereInput idEndsWith(String idEndsWith) {

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

    public PermanentFailoverTargetExecutionWhereInput idEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_ENDS_WITH);
        return this;
    }

    public PermanentFailoverTargetExecutionWhereInput idEndsWith_ExplictlyNonNull() {
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

    public PermanentFailoverTargetExecutionWhereInput idGt(String idGt) {

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

    public PermanentFailoverTargetExecutionWhereInput idGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GT);
        return this;
    }

    public PermanentFailoverTargetExecutionWhereInput idGt_ExplictlyNonNull() {
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

    public PermanentFailoverTargetExecutionWhereInput idGte(String idGte) {

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

    public PermanentFailoverTargetExecutionWhereInput idGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GTE);
        return this;
    }

    public PermanentFailoverTargetExecutionWhereInput idGte_ExplictlyNonNull() {
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

    public PermanentFailoverTargetExecutionWhereInput idIn(List<String> idIn) {

        this.idIn = idIn;
        return this;
    }

    public PermanentFailoverTargetExecutionWhereInput addIdInItem(String idInItem) {
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

    public PermanentFailoverTargetExecutionWhereInput idIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_IN);
        return this;
    }

    public PermanentFailoverTargetExecutionWhereInput idIn_ExplictlyNonNull() {
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

    public PermanentFailoverTargetExecutionWhereInput idLt(String idLt) {

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

    public PermanentFailoverTargetExecutionWhereInput idLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LT);
        return this;
    }

    public PermanentFailoverTargetExecutionWhereInput idLt_ExplictlyNonNull() {
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

    public PermanentFailoverTargetExecutionWhereInput idLte(String idLte) {

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

    public PermanentFailoverTargetExecutionWhereInput idLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LTE);
        return this;
    }

    public PermanentFailoverTargetExecutionWhereInput idLte_ExplictlyNonNull() {
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

    public PermanentFailoverTargetExecutionWhereInput idNot(String idNot) {

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

    public PermanentFailoverTargetExecutionWhereInput idNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT);
        return this;
    }

    public PermanentFailoverTargetExecutionWhereInput idNot_ExplictlyNonNull() {
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

    public PermanentFailoverTargetExecutionWhereInput idNotContains(String idNotContains) {

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

    public PermanentFailoverTargetExecutionWhereInput idNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_CONTAINS);
        return this;
    }

    public PermanentFailoverTargetExecutionWhereInput idNotContains_ExplictlyNonNull() {
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

    public PermanentFailoverTargetExecutionWhereInput idNotEndsWith(String idNotEndsWith) {

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

    public PermanentFailoverTargetExecutionWhereInput idNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
        return this;
    }

    public PermanentFailoverTargetExecutionWhereInput idNotEndsWith_ExplictlyNonNull() {
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

    public PermanentFailoverTargetExecutionWhereInput idNotIn(List<String> idNotIn) {

        this.idNotIn = idNotIn;
        return this;
    }

    public PermanentFailoverTargetExecutionWhereInput addIdNotInItem(String idNotInItem) {
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

    public PermanentFailoverTargetExecutionWhereInput idNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_IN);
        return this;
    }

    public PermanentFailoverTargetExecutionWhereInput idNotIn_ExplictlyNonNull() {
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

    public PermanentFailoverTargetExecutionWhereInput idNotStartsWith(String idNotStartsWith) {

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

    public PermanentFailoverTargetExecutionWhereInput idNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
        return this;
    }

    public PermanentFailoverTargetExecutionWhereInput idNotStartsWith_ExplictlyNonNull() {
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

    public PermanentFailoverTargetExecutionWhereInput idStartsWith(String idStartsWith) {

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

    public PermanentFailoverTargetExecutionWhereInput idStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_STARTS_WITH);
        return this;
    }

    public PermanentFailoverTargetExecutionWhereInput idStartsWith_ExplictlyNonNull() {
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

    public PermanentFailoverTargetExecutionWhereInput isSyncReplication(Boolean isSyncReplication) {

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

    public PermanentFailoverTargetExecutionWhereInput isSyncReplication_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IS_SYNC_REPLICATION);
        return this;
    }

    public PermanentFailoverTargetExecutionWhereInput isSyncReplication_ExplictlyNonNull() {
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

    public PermanentFailoverTargetExecutionWhereInput isSyncReplicationNot(
            Boolean isSyncReplicationNot) {

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

    public PermanentFailoverTargetExecutionWhereInput isSyncReplicationNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IS_SYNC_REPLICATION_NOT);
        return this;
    }

    public PermanentFailoverTargetExecutionWhereInput isSyncReplicationNot_ExplictlyNonNull() {
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

    public PermanentFailoverTargetExecutionWhereInput keepSnapshot(Boolean keepSnapshot) {

        this.keepSnapshot = keepSnapshot;
        return this;
    }

    /**
     * Get keepSnapshot
     *
     * @return keepSnapshot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getKeepSnapshot() {
        return keepSnapshot;
    }

    public void setKeepSnapshot(Boolean keepSnapshot) {
        this.keepSnapshot = keepSnapshot;
    }

    public PermanentFailoverTargetExecutionWhereInput keepSnapshot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KEEP_SNAPSHOT);
        return this;
    }

    public PermanentFailoverTargetExecutionWhereInput keepSnapshot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_KEEP_SNAPSHOT);
        return this;
    }

    public void setKeepSnapshot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_KEEP_SNAPSHOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_KEEP_SNAPSHOT);
        }
    }

    public boolean getKeepSnapshot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_KEEP_SNAPSHOT);
    }

    public PermanentFailoverTargetExecutionWhereInput keepSnapshotNot(Boolean keepSnapshotNot) {

        this.keepSnapshotNot = keepSnapshotNot;
        return this;
    }

    /**
     * Get keepSnapshotNot
     *
     * @return keepSnapshotNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getKeepSnapshotNot() {
        return keepSnapshotNot;
    }

    public void setKeepSnapshotNot(Boolean keepSnapshotNot) {
        this.keepSnapshotNot = keepSnapshotNot;
    }

    public PermanentFailoverTargetExecutionWhereInput keepSnapshotNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KEEP_SNAPSHOT_NOT);
        return this;
    }

    public PermanentFailoverTargetExecutionWhereInput keepSnapshotNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_KEEP_SNAPSHOT_NOT);
        return this;
    }

    public void setKeepSnapshotNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_KEEP_SNAPSHOT_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_KEEP_SNAPSHOT_NOT);
        }
    }

    public boolean getKeepSnapshotNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_KEEP_SNAPSHOT_NOT);
    }

    public PermanentFailoverTargetExecutionWhereInput keepTestVm(Boolean keepTestVm) {

        this.keepTestVm = keepTestVm;
        return this;
    }

    /**
     * Get keepTestVm
     *
     * @return keepTestVm
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getKeepTestVm() {
        return keepTestVm;
    }

    public void setKeepTestVm(Boolean keepTestVm) {
        this.keepTestVm = keepTestVm;
    }

    public PermanentFailoverTargetExecutionWhereInput keepTestVm_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KEEP_TEST_VM);
        return this;
    }

    public PermanentFailoverTargetExecutionWhereInput keepTestVm_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_KEEP_TEST_VM);
        return this;
    }

    public void setKeepTestVm_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_KEEP_TEST_VM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_KEEP_TEST_VM);
        }
    }

    public boolean getKeepTestVm_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_KEEP_TEST_VM);
    }

    public PermanentFailoverTargetExecutionWhereInput keepTestVmNot(Boolean keepTestVmNot) {

        this.keepTestVmNot = keepTestVmNot;
        return this;
    }

    /**
     * Get keepTestVmNot
     *
     * @return keepTestVmNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getKeepTestVmNot() {
        return keepTestVmNot;
    }

    public void setKeepTestVmNot(Boolean keepTestVmNot) {
        this.keepTestVmNot = keepTestVmNot;
    }

    public PermanentFailoverTargetExecutionWhereInput keepTestVmNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KEEP_TEST_VM_NOT);
        return this;
    }

    public PermanentFailoverTargetExecutionWhereInput keepTestVmNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_KEEP_TEST_VM_NOT);
        return this;
    }

    public void setKeepTestVmNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_KEEP_TEST_VM_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_KEEP_TEST_VM_NOT);
        }
    }

    public boolean getKeepTestVmNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_KEEP_TEST_VM_NOT);
    }

    public PermanentFailoverTargetExecutionWhereInput permanentFailoverExecution(
            PermanentFailoverExecutionWhereInput permanentFailoverExecution) {

        this.permanentFailoverExecution = permanentFailoverExecution;
        return this;
    }

    /**
     * Get permanentFailoverExecution
     *
     * @return permanentFailoverExecution
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public PermanentFailoverExecutionWhereInput getPermanentFailoverExecution() {
        return permanentFailoverExecution;
    }

    public void setPermanentFailoverExecution(
            PermanentFailoverExecutionWhereInput permanentFailoverExecution) {
        this.permanentFailoverExecution = permanentFailoverExecution;
    }

    public PermanentFailoverTargetExecutionWhereInput permanentFailoverExecution_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PERMANENT_FAILOVER_EXECUTION);
        return this;
    }

    public PermanentFailoverTargetExecutionWhereInput
            permanentFailoverExecution_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PERMANENT_FAILOVER_EXECUTION);
        return this;
    }

    public void setPermanentFailoverExecution_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PERMANENT_FAILOVER_EXECUTION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PERMANENT_FAILOVER_EXECUTION);
        }
    }

    public boolean getPermanentFailoverExecution_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PERMANENT_FAILOVER_EXECUTION);
    }

    public PermanentFailoverTargetExecutionWhereInput phase(BackupJobPhase phase) {

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

    public PermanentFailoverTargetExecutionWhereInput phase_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PHASE);
        return this;
    }

    public PermanentFailoverTargetExecutionWhereInput phase_ExplictlyNonNull() {
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

    public PermanentFailoverTargetExecutionWhereInput phaseIn(List<BackupJobPhase> phaseIn) {

        this.phaseIn = phaseIn;
        return this;
    }

    public PermanentFailoverTargetExecutionWhereInput addPhaseInItem(BackupJobPhase phaseInItem) {
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

    public PermanentFailoverTargetExecutionWhereInput phaseIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PHASE_IN);
        return this;
    }

    public PermanentFailoverTargetExecutionWhereInput phaseIn_ExplictlyNonNull() {
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

    public PermanentFailoverTargetExecutionWhereInput phaseNot(BackupJobPhase phaseNot) {

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

    public PermanentFailoverTargetExecutionWhereInput phaseNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PHASE_NOT);
        return this;
    }

    public PermanentFailoverTargetExecutionWhereInput phaseNot_ExplictlyNonNull() {
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

    public PermanentFailoverTargetExecutionWhereInput phaseNotIn(List<BackupJobPhase> phaseNotIn) {

        this.phaseNotIn = phaseNotIn;
        return this;
    }

    public PermanentFailoverTargetExecutionWhereInput addPhaseNotInItem(
            BackupJobPhase phaseNotInItem) {
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

    public PermanentFailoverTargetExecutionWhereInput phaseNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PHASE_NOT_IN);
        return this;
    }

    public PermanentFailoverTargetExecutionWhereInput phaseNotIn_ExplictlyNonNull() {
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

    public PermanentFailoverTargetExecutionWhereInput replicaVm(ReplicaVmWhereInput replicaVm) {

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

    public PermanentFailoverTargetExecutionWhereInput replicaVm_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICA_VM);
        return this;
    }

    public PermanentFailoverTargetExecutionWhereInput replicaVm_ExplictlyNonNull() {
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

    public PermanentFailoverTargetExecutionWhereInput resourceVersion(Integer resourceVersion) {

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

    public PermanentFailoverTargetExecutionWhereInput resourceVersion_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_VERSION);
        return this;
    }

    public PermanentFailoverTargetExecutionWhereInput resourceVersion_ExplictlyNonNull() {
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

    public PermanentFailoverTargetExecutionWhereInput resourceVersionGt(Integer resourceVersionGt) {

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

    public PermanentFailoverTargetExecutionWhereInput resourceVersionGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_VERSION_GT);
        return this;
    }

    public PermanentFailoverTargetExecutionWhereInput resourceVersionGt_ExplictlyNonNull() {
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

    public PermanentFailoverTargetExecutionWhereInput resourceVersionGte(
            Integer resourceVersionGte) {

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

    public PermanentFailoverTargetExecutionWhereInput resourceVersionGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_VERSION_GTE);
        return this;
    }

    public PermanentFailoverTargetExecutionWhereInput resourceVersionGte_ExplictlyNonNull() {
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

    public PermanentFailoverTargetExecutionWhereInput resourceVersionIn(
            List<Integer> resourceVersionIn) {

        this.resourceVersionIn = resourceVersionIn;
        return this;
    }

    public PermanentFailoverTargetExecutionWhereInput addResourceVersionInItem(
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

    public PermanentFailoverTargetExecutionWhereInput resourceVersionIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_VERSION_IN);
        return this;
    }

    public PermanentFailoverTargetExecutionWhereInput resourceVersionIn_ExplictlyNonNull() {
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

    public PermanentFailoverTargetExecutionWhereInput resourceVersionLt(Integer resourceVersionLt) {

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

    public PermanentFailoverTargetExecutionWhereInput resourceVersionLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_VERSION_LT);
        return this;
    }

    public PermanentFailoverTargetExecutionWhereInput resourceVersionLt_ExplictlyNonNull() {
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

    public PermanentFailoverTargetExecutionWhereInput resourceVersionLte(
            Integer resourceVersionLte) {

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

    public PermanentFailoverTargetExecutionWhereInput resourceVersionLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_VERSION_LTE);
        return this;
    }

    public PermanentFailoverTargetExecutionWhereInput resourceVersionLte_ExplictlyNonNull() {
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

    public PermanentFailoverTargetExecutionWhereInput resourceVersionNot(
            Integer resourceVersionNot) {

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

    public PermanentFailoverTargetExecutionWhereInput resourceVersionNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_VERSION_NOT);
        return this;
    }

    public PermanentFailoverTargetExecutionWhereInput resourceVersionNot_ExplictlyNonNull() {
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

    public PermanentFailoverTargetExecutionWhereInput resourceVersionNotIn(
            List<Integer> resourceVersionNotIn) {

        this.resourceVersionNotIn = resourceVersionNotIn;
        return this;
    }

    public PermanentFailoverTargetExecutionWhereInput addResourceVersionNotInItem(
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

    public PermanentFailoverTargetExecutionWhereInput resourceVersionNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_VERSION_NOT_IN);
        return this;
    }

    public PermanentFailoverTargetExecutionWhereInput resourceVersionNotIn_ExplictlyNonNull() {
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

    public PermanentFailoverTargetExecutionWhereInput startedAt(String startedAt) {

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

    public PermanentFailoverTargetExecutionWhereInput startedAt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STARTED_AT);
        return this;
    }

    public PermanentFailoverTargetExecutionWhereInput startedAt_ExplictlyNonNull() {
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

    public PermanentFailoverTargetExecutionWhereInput startedAtGt(String startedAtGt) {

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

    public PermanentFailoverTargetExecutionWhereInput startedAtGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STARTED_AT_GT);
        return this;
    }

    public PermanentFailoverTargetExecutionWhereInput startedAtGt_ExplictlyNonNull() {
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

    public PermanentFailoverTargetExecutionWhereInput startedAtGte(String startedAtGte) {

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

    public PermanentFailoverTargetExecutionWhereInput startedAtGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STARTED_AT_GTE);
        return this;
    }

    public PermanentFailoverTargetExecutionWhereInput startedAtGte_ExplictlyNonNull() {
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

    public PermanentFailoverTargetExecutionWhereInput startedAtIn(List<String> startedAtIn) {

        this.startedAtIn = startedAtIn;
        return this;
    }

    public PermanentFailoverTargetExecutionWhereInput addStartedAtInItem(String startedAtInItem) {
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

    public PermanentFailoverTargetExecutionWhereInput startedAtIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STARTED_AT_IN);
        return this;
    }

    public PermanentFailoverTargetExecutionWhereInput startedAtIn_ExplictlyNonNull() {
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

    public PermanentFailoverTargetExecutionWhereInput startedAtLt(String startedAtLt) {

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

    public PermanentFailoverTargetExecutionWhereInput startedAtLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STARTED_AT_LT);
        return this;
    }

    public PermanentFailoverTargetExecutionWhereInput startedAtLt_ExplictlyNonNull() {
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

    public PermanentFailoverTargetExecutionWhereInput startedAtLte(String startedAtLte) {

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

    public PermanentFailoverTargetExecutionWhereInput startedAtLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STARTED_AT_LTE);
        return this;
    }

    public PermanentFailoverTargetExecutionWhereInput startedAtLte_ExplictlyNonNull() {
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

    public PermanentFailoverTargetExecutionWhereInput startedAtNot(String startedAtNot) {

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

    public PermanentFailoverTargetExecutionWhereInput startedAtNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STARTED_AT_NOT);
        return this;
    }

    public PermanentFailoverTargetExecutionWhereInput startedAtNot_ExplictlyNonNull() {
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

    public PermanentFailoverTargetExecutionWhereInput startedAtNotIn(List<String> startedAtNotIn) {

        this.startedAtNotIn = startedAtNotIn;
        return this;
    }

    public PermanentFailoverTargetExecutionWhereInput addStartedAtNotInItem(
            String startedAtNotInItem) {
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

    public PermanentFailoverTargetExecutionWhereInput startedAtNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STARTED_AT_NOT_IN);
        return this;
    }

    public PermanentFailoverTargetExecutionWhereInput startedAtNotIn_ExplictlyNonNull() {
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

    public PermanentFailoverTargetExecutionWhereInput updatedAt(String updatedAt) {

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

    public PermanentFailoverTargetExecutionWhereInput updatedAt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPDATED_AT);
        return this;
    }

    public PermanentFailoverTargetExecutionWhereInput updatedAt_ExplictlyNonNull() {
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

    public PermanentFailoverTargetExecutionWhereInput updatedAtGt(String updatedAtGt) {

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

    public PermanentFailoverTargetExecutionWhereInput updatedAtGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPDATED_AT_GT);
        return this;
    }

    public PermanentFailoverTargetExecutionWhereInput updatedAtGt_ExplictlyNonNull() {
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

    public PermanentFailoverTargetExecutionWhereInput updatedAtGte(String updatedAtGte) {

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

    public PermanentFailoverTargetExecutionWhereInput updatedAtGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPDATED_AT_GTE);
        return this;
    }

    public PermanentFailoverTargetExecutionWhereInput updatedAtGte_ExplictlyNonNull() {
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

    public PermanentFailoverTargetExecutionWhereInput updatedAtIn(List<String> updatedAtIn) {

        this.updatedAtIn = updatedAtIn;
        return this;
    }

    public PermanentFailoverTargetExecutionWhereInput addUpdatedAtInItem(String updatedAtInItem) {
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

    public PermanentFailoverTargetExecutionWhereInput updatedAtIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPDATED_AT_IN);
        return this;
    }

    public PermanentFailoverTargetExecutionWhereInput updatedAtIn_ExplictlyNonNull() {
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

    public PermanentFailoverTargetExecutionWhereInput updatedAtLt(String updatedAtLt) {

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

    public PermanentFailoverTargetExecutionWhereInput updatedAtLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPDATED_AT_LT);
        return this;
    }

    public PermanentFailoverTargetExecutionWhereInput updatedAtLt_ExplictlyNonNull() {
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

    public PermanentFailoverTargetExecutionWhereInput updatedAtLte(String updatedAtLte) {

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

    public PermanentFailoverTargetExecutionWhereInput updatedAtLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPDATED_AT_LTE);
        return this;
    }

    public PermanentFailoverTargetExecutionWhereInput updatedAtLte_ExplictlyNonNull() {
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

    public PermanentFailoverTargetExecutionWhereInput updatedAtNot(String updatedAtNot) {

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

    public PermanentFailoverTargetExecutionWhereInput updatedAtNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPDATED_AT_NOT);
        return this;
    }

    public PermanentFailoverTargetExecutionWhereInput updatedAtNot_ExplictlyNonNull() {
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

    public PermanentFailoverTargetExecutionWhereInput updatedAtNotIn(List<String> updatedAtNotIn) {

        this.updatedAtNotIn = updatedAtNotIn;
        return this;
    }

    public PermanentFailoverTargetExecutionWhereInput addUpdatedAtNotInItem(
            String updatedAtNotInItem) {
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

    public PermanentFailoverTargetExecutionWhereInput updatedAtNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPDATED_AT_NOT_IN);
        return this;
    }

    public PermanentFailoverTargetExecutionWhereInput updatedAtNotIn_ExplictlyNonNull() {
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
        PermanentFailoverTargetExecutionWhereInput permanentFailoverTargetExecutionWhereInput =
                (PermanentFailoverTargetExecutionWhereInput) o;
        return Objects.equals(this.AND, permanentFailoverTargetExecutionWhereInput.AND)
                && Objects.equals(this.NOT, permanentFailoverTargetExecutionWhereInput.NOT)
                && Objects.equals(this.OR, permanentFailoverTargetExecutionWhereInput.OR)
                && Objects.equals(
                        this.createdAt, permanentFailoverTargetExecutionWhereInput.createdAt)
                && Objects.equals(
                        this.createdAtGt, permanentFailoverTargetExecutionWhereInput.createdAtGt)
                && Objects.equals(
                        this.createdAtGte, permanentFailoverTargetExecutionWhereInput.createdAtGte)
                && Objects.equals(
                        this.createdAtIn, permanentFailoverTargetExecutionWhereInput.createdAtIn)
                && Objects.equals(
                        this.createdAtLt, permanentFailoverTargetExecutionWhereInput.createdAtLt)
                && Objects.equals(
                        this.createdAtLte, permanentFailoverTargetExecutionWhereInput.createdAtLte)
                && Objects.equals(
                        this.createdAtNot, permanentFailoverTargetExecutionWhereInput.createdAtNot)
                && Objects.equals(
                        this.createdAtNotIn,
                        permanentFailoverTargetExecutionWhereInput.createdAtNotIn)
                && Objects.equals(
                        this.externalCloudtower,
                        permanentFailoverTargetExecutionWhereInput.externalCloudtower)
                && Objects.equals(
                        this.finishedAt, permanentFailoverTargetExecutionWhereInput.finishedAt)
                && Objects.equals(
                        this.finishedAtGt, permanentFailoverTargetExecutionWhereInput.finishedAtGt)
                && Objects.equals(
                        this.finishedAtGte,
                        permanentFailoverTargetExecutionWhereInput.finishedAtGte)
                && Objects.equals(
                        this.finishedAtIn, permanentFailoverTargetExecutionWhereInput.finishedAtIn)
                && Objects.equals(
                        this.finishedAtLt, permanentFailoverTargetExecutionWhereInput.finishedAtLt)
                && Objects.equals(
                        this.finishedAtLte,
                        permanentFailoverTargetExecutionWhereInput.finishedAtLte)
                && Objects.equals(
                        this.finishedAtNot,
                        permanentFailoverTargetExecutionWhereInput.finishedAtNot)
                && Objects.equals(
                        this.finishedAtNotIn,
                        permanentFailoverTargetExecutionWhereInput.finishedAtNotIn)
                && Objects.equals(this.id, permanentFailoverTargetExecutionWhereInput.id)
                && Objects.equals(
                        this.idContains, permanentFailoverTargetExecutionWhereInput.idContains)
                && Objects.equals(
                        this.idEndsWith, permanentFailoverTargetExecutionWhereInput.idEndsWith)
                && Objects.equals(this.idGt, permanentFailoverTargetExecutionWhereInput.idGt)
                && Objects.equals(this.idGte, permanentFailoverTargetExecutionWhereInput.idGte)
                && Objects.equals(this.idIn, permanentFailoverTargetExecutionWhereInput.idIn)
                && Objects.equals(this.idLt, permanentFailoverTargetExecutionWhereInput.idLt)
                && Objects.equals(this.idLte, permanentFailoverTargetExecutionWhereInput.idLte)
                && Objects.equals(this.idNot, permanentFailoverTargetExecutionWhereInput.idNot)
                && Objects.equals(
                        this.idNotContains,
                        permanentFailoverTargetExecutionWhereInput.idNotContains)
                && Objects.equals(
                        this.idNotEndsWith,
                        permanentFailoverTargetExecutionWhereInput.idNotEndsWith)
                && Objects.equals(this.idNotIn, permanentFailoverTargetExecutionWhereInput.idNotIn)
                && Objects.equals(
                        this.idNotStartsWith,
                        permanentFailoverTargetExecutionWhereInput.idNotStartsWith)
                && Objects.equals(
                        this.idStartsWith, permanentFailoverTargetExecutionWhereInput.idStartsWith)
                && Objects.equals(
                        this.isSyncReplication,
                        permanentFailoverTargetExecutionWhereInput.isSyncReplication)
                && Objects.equals(
                        this.isSyncReplicationNot,
                        permanentFailoverTargetExecutionWhereInput.isSyncReplicationNot)
                && Objects.equals(
                        this.keepSnapshot, permanentFailoverTargetExecutionWhereInput.keepSnapshot)
                && Objects.equals(
                        this.keepSnapshotNot,
                        permanentFailoverTargetExecutionWhereInput.keepSnapshotNot)
                && Objects.equals(
                        this.keepTestVm, permanentFailoverTargetExecutionWhereInput.keepTestVm)
                && Objects.equals(
                        this.keepTestVmNot,
                        permanentFailoverTargetExecutionWhereInput.keepTestVmNot)
                && Objects.equals(
                        this.permanentFailoverExecution,
                        permanentFailoverTargetExecutionWhereInput.permanentFailoverExecution)
                && Objects.equals(this.phase, permanentFailoverTargetExecutionWhereInput.phase)
                && Objects.equals(this.phaseIn, permanentFailoverTargetExecutionWhereInput.phaseIn)
                && Objects.equals(
                        this.phaseNot, permanentFailoverTargetExecutionWhereInput.phaseNot)
                && Objects.equals(
                        this.phaseNotIn, permanentFailoverTargetExecutionWhereInput.phaseNotIn)
                && Objects.equals(
                        this.replicaVm, permanentFailoverTargetExecutionWhereInput.replicaVm)
                && Objects.equals(
                        this.resourceVersion,
                        permanentFailoverTargetExecutionWhereInput.resourceVersion)
                && Objects.equals(
                        this.resourceVersionGt,
                        permanentFailoverTargetExecutionWhereInput.resourceVersionGt)
                && Objects.equals(
                        this.resourceVersionGte,
                        permanentFailoverTargetExecutionWhereInput.resourceVersionGte)
                && Objects.equals(
                        this.resourceVersionIn,
                        permanentFailoverTargetExecutionWhereInput.resourceVersionIn)
                && Objects.equals(
                        this.resourceVersionLt,
                        permanentFailoverTargetExecutionWhereInput.resourceVersionLt)
                && Objects.equals(
                        this.resourceVersionLte,
                        permanentFailoverTargetExecutionWhereInput.resourceVersionLte)
                && Objects.equals(
                        this.resourceVersionNot,
                        permanentFailoverTargetExecutionWhereInput.resourceVersionNot)
                && Objects.equals(
                        this.resourceVersionNotIn,
                        permanentFailoverTargetExecutionWhereInput.resourceVersionNotIn)
                && Objects.equals(
                        this.startedAt, permanentFailoverTargetExecutionWhereInput.startedAt)
                && Objects.equals(
                        this.startedAtGt, permanentFailoverTargetExecutionWhereInput.startedAtGt)
                && Objects.equals(
                        this.startedAtGte, permanentFailoverTargetExecutionWhereInput.startedAtGte)
                && Objects.equals(
                        this.startedAtIn, permanentFailoverTargetExecutionWhereInput.startedAtIn)
                && Objects.equals(
                        this.startedAtLt, permanentFailoverTargetExecutionWhereInput.startedAtLt)
                && Objects.equals(
                        this.startedAtLte, permanentFailoverTargetExecutionWhereInput.startedAtLte)
                && Objects.equals(
                        this.startedAtNot, permanentFailoverTargetExecutionWhereInput.startedAtNot)
                && Objects.equals(
                        this.startedAtNotIn,
                        permanentFailoverTargetExecutionWhereInput.startedAtNotIn)
                && Objects.equals(
                        this.updatedAt, permanentFailoverTargetExecutionWhereInput.updatedAt)
                && Objects.equals(
                        this.updatedAtGt, permanentFailoverTargetExecutionWhereInput.updatedAtGt)
                && Objects.equals(
                        this.updatedAtGte, permanentFailoverTargetExecutionWhereInput.updatedAtGte)
                && Objects.equals(
                        this.updatedAtIn, permanentFailoverTargetExecutionWhereInput.updatedAtIn)
                && Objects.equals(
                        this.updatedAtLt, permanentFailoverTargetExecutionWhereInput.updatedAtLt)
                && Objects.equals(
                        this.updatedAtLte, permanentFailoverTargetExecutionWhereInput.updatedAtLte)
                && Objects.equals(
                        this.updatedAtNot, permanentFailoverTargetExecutionWhereInput.updatedAtNot)
                && Objects.equals(
                        this.updatedAtNotIn,
                        permanentFailoverTargetExecutionWhereInput.updatedAtNotIn);
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
                keepSnapshot,
                keepSnapshotNot,
                keepTestVm,
                keepTestVmNot,
                permanentFailoverExecution,
                phase,
                phaseIn,
                phaseNot,
                phaseNotIn,
                replicaVm,
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
        sb.append("class PermanentFailoverTargetExecutionWhereInput {\n");
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
        sb.append("    keepSnapshot: ").append(toIndentedString(keepSnapshot)).append("\n");
        sb.append("    keepSnapshotNot: ").append(toIndentedString(keepSnapshotNot)).append("\n");
        sb.append("    keepTestVm: ").append(toIndentedString(keepTestVm)).append("\n");
        sb.append("    keepTestVmNot: ").append(toIndentedString(keepTestVmNot)).append("\n");
        sb.append("    permanentFailoverExecution: ")
                .append(toIndentedString(permanentFailoverExecution))
                .append("\n");
        sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
        sb.append("    phaseIn: ").append(toIndentedString(phaseIn)).append("\n");
        sb.append("    phaseNot: ").append(toIndentedString(phaseNot)).append("\n");
        sb.append("    phaseNotIn: ").append(toIndentedString(phaseNotIn)).append("\n");
        sb.append("    replicaVm: ").append(toIndentedString(replicaVm)).append("\n");
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

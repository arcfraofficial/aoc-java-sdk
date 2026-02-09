package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** SnapshotGroupWhereInput */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class SnapshotGroupWhereInput
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_A_N_D = "AND";

    @SerializedName(SERIALIZED_NAME_A_N_D)
    private List<SnapshotGroupWhereInput> AND = null;

    public static final String SERIALIZED_NAME_N_O_T = "NOT";

    @SerializedName(SERIALIZED_NAME_N_O_T)
    private List<SnapshotGroupWhereInput> NOT = null;

    public static final String SERIALIZED_NAME_O_R = "OR";

    @SerializedName(SERIALIZED_NAME_O_R)
    private List<SnapshotGroupWhereInput> OR = null;

    public static final String SERIALIZED_NAME_CLUSTER = "cluster";

    @SerializedName(SERIALIZED_NAME_CLUSTER)
    private ClusterWhereInput cluster;

    public static final String SERIALIZED_NAME_DELETED = "deleted";

    @SerializedName(SERIALIZED_NAME_DELETED)
    private Boolean deleted;

    public static final String SERIALIZED_NAME_DELETED_NOT = "deleted_not";

    @SerializedName(SERIALIZED_NAME_DELETED_NOT)
    private Boolean deletedNot;

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

    public static final String SERIALIZED_NAME_ESTIMATED_RECYCLING_TIME =
            "estimated_recycling_time";

    @SerializedName(SERIALIZED_NAME_ESTIMATED_RECYCLING_TIME)
    private String estimatedRecyclingTime;

    public static final String SERIALIZED_NAME_ESTIMATED_RECYCLING_TIME_GT =
            "estimated_recycling_time_gt";

    @SerializedName(SERIALIZED_NAME_ESTIMATED_RECYCLING_TIME_GT)
    private String estimatedRecyclingTimeGt;

    public static final String SERIALIZED_NAME_ESTIMATED_RECYCLING_TIME_GTE =
            "estimated_recycling_time_gte";

    @SerializedName(SERIALIZED_NAME_ESTIMATED_RECYCLING_TIME_GTE)
    private String estimatedRecyclingTimeGte;

    public static final String SERIALIZED_NAME_ESTIMATED_RECYCLING_TIME_IN =
            "estimated_recycling_time_in";

    @SerializedName(SERIALIZED_NAME_ESTIMATED_RECYCLING_TIME_IN)
    private List<String> estimatedRecyclingTimeIn = null;

    public static final String SERIALIZED_NAME_ESTIMATED_RECYCLING_TIME_LT =
            "estimated_recycling_time_lt";

    @SerializedName(SERIALIZED_NAME_ESTIMATED_RECYCLING_TIME_LT)
    private String estimatedRecyclingTimeLt;

    public static final String SERIALIZED_NAME_ESTIMATED_RECYCLING_TIME_LTE =
            "estimated_recycling_time_lte";

    @SerializedName(SERIALIZED_NAME_ESTIMATED_RECYCLING_TIME_LTE)
    private String estimatedRecyclingTimeLte;

    public static final String SERIALIZED_NAME_ESTIMATED_RECYCLING_TIME_NOT =
            "estimated_recycling_time_not";

    @SerializedName(SERIALIZED_NAME_ESTIMATED_RECYCLING_TIME_NOT)
    private String estimatedRecyclingTimeNot;

    public static final String SERIALIZED_NAME_ESTIMATED_RECYCLING_TIME_NOT_IN =
            "estimated_recycling_time_not_in";

    @SerializedName(SERIALIZED_NAME_ESTIMATED_RECYCLING_TIME_NOT_IN)
    private List<String> estimatedRecyclingTimeNotIn = null;

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

    public static final String SERIALIZED_NAME_INTERNAL = "internal";

    @SerializedName(SERIALIZED_NAME_INTERNAL)
    private Boolean internal;

    public static final String SERIALIZED_NAME_INTERNAL_NOT = "internal_not";

    @SerializedName(SERIALIZED_NAME_INTERNAL_NOT)
    private Boolean internalNot;

    public static final String SERIALIZED_NAME_KEEP = "keep";

    @SerializedName(SERIALIZED_NAME_KEEP)
    private Boolean keep;

    public static final String SERIALIZED_NAME_KEEP_NOT = "keep_not";

    @SerializedName(SERIALIZED_NAME_KEEP_NOT)
    private Boolean keepNot;

    public static final String SERIALIZED_NAME_LOCAL_CREATED_AT = "local_created_at";

    @SerializedName(SERIALIZED_NAME_LOCAL_CREATED_AT)
    private String localCreatedAt;

    public static final String SERIALIZED_NAME_LOCAL_CREATED_AT_GT = "local_created_at_gt";

    @SerializedName(SERIALIZED_NAME_LOCAL_CREATED_AT_GT)
    private String localCreatedAtGt;

    public static final String SERIALIZED_NAME_LOCAL_CREATED_AT_GTE = "local_created_at_gte";

    @SerializedName(SERIALIZED_NAME_LOCAL_CREATED_AT_GTE)
    private String localCreatedAtGte;

    public static final String SERIALIZED_NAME_LOCAL_CREATED_AT_IN = "local_created_at_in";

    @SerializedName(SERIALIZED_NAME_LOCAL_CREATED_AT_IN)
    private List<String> localCreatedAtIn = null;

    public static final String SERIALIZED_NAME_LOCAL_CREATED_AT_LT = "local_created_at_lt";

    @SerializedName(SERIALIZED_NAME_LOCAL_CREATED_AT_LT)
    private String localCreatedAtLt;

    public static final String SERIALIZED_NAME_LOCAL_CREATED_AT_LTE = "local_created_at_lte";

    @SerializedName(SERIALIZED_NAME_LOCAL_CREATED_AT_LTE)
    private String localCreatedAtLte;

    public static final String SERIALIZED_NAME_LOCAL_CREATED_AT_NOT = "local_created_at_not";

    @SerializedName(SERIALIZED_NAME_LOCAL_CREATED_AT_NOT)
    private String localCreatedAtNot;

    public static final String SERIALIZED_NAME_LOCAL_CREATED_AT_NOT_IN = "local_created_at_not_in";

    @SerializedName(SERIALIZED_NAME_LOCAL_CREATED_AT_NOT_IN)
    private List<String> localCreatedAtNotIn = null;

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

    public static final String SERIALIZED_NAME_LOGICAL_SIZE_BYTES = "logical_size_bytes";

    @SerializedName(SERIALIZED_NAME_LOGICAL_SIZE_BYTES)
    private Long logicalSizeBytes;

    public static final String SERIALIZED_NAME_LOGICAL_SIZE_BYTES_GT = "logical_size_bytes_gt";

    @SerializedName(SERIALIZED_NAME_LOGICAL_SIZE_BYTES_GT)
    private Long logicalSizeBytesGt;

    public static final String SERIALIZED_NAME_LOGICAL_SIZE_BYTES_GTE = "logical_size_bytes_gte";

    @SerializedName(SERIALIZED_NAME_LOGICAL_SIZE_BYTES_GTE)
    private Long logicalSizeBytesGte;

    public static final String SERIALIZED_NAME_LOGICAL_SIZE_BYTES_IN = "logical_size_bytes_in";

    @SerializedName(SERIALIZED_NAME_LOGICAL_SIZE_BYTES_IN)
    private List<Long> logicalSizeBytesIn = null;

    public static final String SERIALIZED_NAME_LOGICAL_SIZE_BYTES_LT = "logical_size_bytes_lt";

    @SerializedName(SERIALIZED_NAME_LOGICAL_SIZE_BYTES_LT)
    private Long logicalSizeBytesLt;

    public static final String SERIALIZED_NAME_LOGICAL_SIZE_BYTES_LTE = "logical_size_bytes_lte";

    @SerializedName(SERIALIZED_NAME_LOGICAL_SIZE_BYTES_LTE)
    private Long logicalSizeBytesLte;

    public static final String SERIALIZED_NAME_LOGICAL_SIZE_BYTES_NOT = "logical_size_bytes_not";

    @SerializedName(SERIALIZED_NAME_LOGICAL_SIZE_BYTES_NOT)
    private Long logicalSizeBytesNot;

    public static final String SERIALIZED_NAME_LOGICAL_SIZE_BYTES_NOT_IN =
            "logical_size_bytes_not_in";

    @SerializedName(SERIALIZED_NAME_LOGICAL_SIZE_BYTES_NOT_IN)
    private List<Long> logicalSizeBytesNotIn = null;

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

    public static final String SERIALIZED_NAME_OBJECT_NUM = "object_num";

    @SerializedName(SERIALIZED_NAME_OBJECT_NUM)
    private Integer objectNum;

    public static final String SERIALIZED_NAME_OBJECT_NUM_GT = "object_num_gt";

    @SerializedName(SERIALIZED_NAME_OBJECT_NUM_GT)
    private Integer objectNumGt;

    public static final String SERIALIZED_NAME_OBJECT_NUM_GTE = "object_num_gte";

    @SerializedName(SERIALIZED_NAME_OBJECT_NUM_GTE)
    private Integer objectNumGte;

    public static final String SERIALIZED_NAME_OBJECT_NUM_IN = "object_num_in";

    @SerializedName(SERIALIZED_NAME_OBJECT_NUM_IN)
    private List<Integer> objectNumIn = null;

    public static final String SERIALIZED_NAME_OBJECT_NUM_LT = "object_num_lt";

    @SerializedName(SERIALIZED_NAME_OBJECT_NUM_LT)
    private Integer objectNumLt;

    public static final String SERIALIZED_NAME_OBJECT_NUM_LTE = "object_num_lte";

    @SerializedName(SERIALIZED_NAME_OBJECT_NUM_LTE)
    private Integer objectNumLte;

    public static final String SERIALIZED_NAME_OBJECT_NUM_NOT = "object_num_not";

    @SerializedName(SERIALIZED_NAME_OBJECT_NUM_NOT)
    private Integer objectNumNot;

    public static final String SERIALIZED_NAME_OBJECT_NUM_NOT_IN = "object_num_not_in";

    @SerializedName(SERIALIZED_NAME_OBJECT_NUM_NOT_IN)
    private List<Integer> objectNumNotIn = null;

    public static final String SERIALIZED_NAME_SNAPSHOT_PLAN_TASK = "snapshotPlanTask";

    @SerializedName(SERIALIZED_NAME_SNAPSHOT_PLAN_TASK)
    private SnapshotPlanTaskWhereInput snapshotPlanTask;

    public static final String SERIALIZED_NAME_VM_SNAPSHOTS_EVERY = "vm_snapshots_every";

    @SerializedName(SERIALIZED_NAME_VM_SNAPSHOTS_EVERY)
    private VmSnapshotWhereInput vmSnapshotsEvery;

    public static final String SERIALIZED_NAME_VM_SNAPSHOTS_NONE = "vm_snapshots_none";

    @SerializedName(SERIALIZED_NAME_VM_SNAPSHOTS_NONE)
    private VmSnapshotWhereInput vmSnapshotsNone;

    public static final String SERIALIZED_NAME_VM_SNAPSHOTS_SOME = "vm_snapshots_some";

    @SerializedName(SERIALIZED_NAME_VM_SNAPSHOTS_SOME)
    private VmSnapshotWhereInput vmSnapshotsSome;

    public SnapshotGroupWhereInput() {}

    public SnapshotGroupWhereInput AND(List<SnapshotGroupWhereInput> AND) {

        this.AND = AND;
        return this;
    }

    public SnapshotGroupWhereInput addANDItem(SnapshotGroupWhereInput ANDItem) {
        if (this.AND == null) {
            this.AND = new ArrayList<SnapshotGroupWhereInput>();
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
    public List<SnapshotGroupWhereInput> getAND() {
        return AND;
    }

    public void setAND(List<SnapshotGroupWhereInput> AND) {
        this.AND = AND;
    }

    public SnapshotGroupWhereInput AND_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_A_N_D);
        return this;
    }

    public SnapshotGroupWhereInput AND_ExplictlyNonNull() {
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

    public SnapshotGroupWhereInput NOT(List<SnapshotGroupWhereInput> NOT) {

        this.NOT = NOT;
        return this;
    }

    public SnapshotGroupWhereInput addNOTItem(SnapshotGroupWhereInput NOTItem) {
        if (this.NOT == null) {
            this.NOT = new ArrayList<SnapshotGroupWhereInput>();
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
    public List<SnapshotGroupWhereInput> getNOT() {
        return NOT;
    }

    public void setNOT(List<SnapshotGroupWhereInput> NOT) {
        this.NOT = NOT;
    }

    public SnapshotGroupWhereInput NOT_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_N_O_T);
        return this;
    }

    public SnapshotGroupWhereInput NOT_ExplictlyNonNull() {
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

    public SnapshotGroupWhereInput OR(List<SnapshotGroupWhereInput> OR) {

        this.OR = OR;
        return this;
    }

    public SnapshotGroupWhereInput addORItem(SnapshotGroupWhereInput ORItem) {
        if (this.OR == null) {
            this.OR = new ArrayList<SnapshotGroupWhereInput>();
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
    public List<SnapshotGroupWhereInput> getOR() {
        return OR;
    }

    public void setOR(List<SnapshotGroupWhereInput> OR) {
        this.OR = OR;
    }

    public SnapshotGroupWhereInput OR_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_O_R);
        return this;
    }

    public SnapshotGroupWhereInput OR_ExplictlyNonNull() {
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

    public SnapshotGroupWhereInput cluster(ClusterWhereInput cluster) {

        this.cluster = cluster;
        return this;
    }

    /**
     * Get cluster
     *
     * @return cluster
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ClusterWhereInput getCluster() {
        return cluster;
    }

    public void setCluster(ClusterWhereInput cluster) {
        this.cluster = cluster;
    }

    public SnapshotGroupWhereInput cluster_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER);
        return this;
    }

    public SnapshotGroupWhereInput cluster_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLUSTER);
        return this;
    }

    public void setCluster_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLUSTER);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLUSTER);
        }
    }

    public boolean getCluster_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLUSTER);
    }

    public SnapshotGroupWhereInput deleted(Boolean deleted) {

        this.deleted = deleted;
        return this;
    }

    /**
     * Get deleted
     *
     * @return deleted
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public SnapshotGroupWhereInput deleted_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DELETED);
        return this;
    }

    public SnapshotGroupWhereInput deleted_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DELETED);
        return this;
    }

    public void setDeleted_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DELETED);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DELETED);
        }
    }

    public boolean getDeleted_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DELETED);
    }

    public SnapshotGroupWhereInput deletedNot(Boolean deletedNot) {

        this.deletedNot = deletedNot;
        return this;
    }

    /**
     * Get deletedNot
     *
     * @return deletedNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getDeletedNot() {
        return deletedNot;
    }

    public void setDeletedNot(Boolean deletedNot) {
        this.deletedNot = deletedNot;
    }

    public SnapshotGroupWhereInput deletedNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DELETED_NOT);
        return this;
    }

    public SnapshotGroupWhereInput deletedNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DELETED_NOT);
        return this;
    }

    public void setDeletedNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DELETED_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DELETED_NOT);
        }
    }

    public boolean getDeletedNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DELETED_NOT);
    }

    public SnapshotGroupWhereInput entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {

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

    public SnapshotGroupWhereInput entityAsyncStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        return this;
    }

    public SnapshotGroupWhereInput entityAsyncStatus_ExplictlyNonNull() {
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

    public SnapshotGroupWhereInput entityAsyncStatusIn(
            List<EntityAsyncStatus> entityAsyncStatusIn) {

        this.entityAsyncStatusIn = entityAsyncStatusIn;
        return this;
    }

    public SnapshotGroupWhereInput addEntityAsyncStatusInItem(
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

    public SnapshotGroupWhereInput entityAsyncStatusIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_IN);
        return this;
    }

    public SnapshotGroupWhereInput entityAsyncStatusIn_ExplictlyNonNull() {
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

    public SnapshotGroupWhereInput entityAsyncStatusNot(EntityAsyncStatus entityAsyncStatusNot) {

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

    public SnapshotGroupWhereInput entityAsyncStatusNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT);
        return this;
    }

    public SnapshotGroupWhereInput entityAsyncStatusNot_ExplictlyNonNull() {
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

    public SnapshotGroupWhereInput entityAsyncStatusNotIn(
            List<EntityAsyncStatus> entityAsyncStatusNotIn) {

        this.entityAsyncStatusNotIn = entityAsyncStatusNotIn;
        return this;
    }

    public SnapshotGroupWhereInput addEntityAsyncStatusNotInItem(
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

    public SnapshotGroupWhereInput entityAsyncStatusNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT_IN);
        return this;
    }

    public SnapshotGroupWhereInput entityAsyncStatusNotIn_ExplictlyNonNull() {
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

    public SnapshotGroupWhereInput estimatedRecyclingTime(String estimatedRecyclingTime) {

        this.estimatedRecyclingTime = estimatedRecyclingTime;
        return this;
    }

    /**
     * Get estimatedRecyclingTime
     *
     * @return estimatedRecyclingTime
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getEstimatedRecyclingTime() {
        return estimatedRecyclingTime;
    }

    public void setEstimatedRecyclingTime(String estimatedRecyclingTime) {
        this.estimatedRecyclingTime = estimatedRecyclingTime;
    }

    public SnapshotGroupWhereInput estimatedRecyclingTime_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ESTIMATED_RECYCLING_TIME);
        return this;
    }

    public SnapshotGroupWhereInput estimatedRecyclingTime_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ESTIMATED_RECYCLING_TIME);
        return this;
    }

    public void setEstimatedRecyclingTime_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ESTIMATED_RECYCLING_TIME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ESTIMATED_RECYCLING_TIME);
        }
    }

    public boolean getEstimatedRecyclingTime_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ESTIMATED_RECYCLING_TIME);
    }

    public SnapshotGroupWhereInput estimatedRecyclingTimeGt(String estimatedRecyclingTimeGt) {

        this.estimatedRecyclingTimeGt = estimatedRecyclingTimeGt;
        return this;
    }

    /**
     * Get estimatedRecyclingTimeGt
     *
     * @return estimatedRecyclingTimeGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getEstimatedRecyclingTimeGt() {
        return estimatedRecyclingTimeGt;
    }

    public void setEstimatedRecyclingTimeGt(String estimatedRecyclingTimeGt) {
        this.estimatedRecyclingTimeGt = estimatedRecyclingTimeGt;
    }

    public SnapshotGroupWhereInput estimatedRecyclingTimeGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ESTIMATED_RECYCLING_TIME_GT);
        return this;
    }

    public SnapshotGroupWhereInput estimatedRecyclingTimeGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ESTIMATED_RECYCLING_TIME_GT);
        return this;
    }

    public void setEstimatedRecyclingTimeGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ESTIMATED_RECYCLING_TIME_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ESTIMATED_RECYCLING_TIME_GT);
        }
    }

    public boolean getEstimatedRecyclingTimeGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ESTIMATED_RECYCLING_TIME_GT);
    }

    public SnapshotGroupWhereInput estimatedRecyclingTimeGte(String estimatedRecyclingTimeGte) {

        this.estimatedRecyclingTimeGte = estimatedRecyclingTimeGte;
        return this;
    }

    /**
     * Get estimatedRecyclingTimeGte
     *
     * @return estimatedRecyclingTimeGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getEstimatedRecyclingTimeGte() {
        return estimatedRecyclingTimeGte;
    }

    public void setEstimatedRecyclingTimeGte(String estimatedRecyclingTimeGte) {
        this.estimatedRecyclingTimeGte = estimatedRecyclingTimeGte;
    }

    public SnapshotGroupWhereInput estimatedRecyclingTimeGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ESTIMATED_RECYCLING_TIME_GTE);
        return this;
    }

    public SnapshotGroupWhereInput estimatedRecyclingTimeGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ESTIMATED_RECYCLING_TIME_GTE);
        return this;
    }

    public void setEstimatedRecyclingTimeGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ESTIMATED_RECYCLING_TIME_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ESTIMATED_RECYCLING_TIME_GTE);
        }
    }

    public boolean getEstimatedRecyclingTimeGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ESTIMATED_RECYCLING_TIME_GTE);
    }

    public SnapshotGroupWhereInput estimatedRecyclingTimeIn(List<String> estimatedRecyclingTimeIn) {

        this.estimatedRecyclingTimeIn = estimatedRecyclingTimeIn;
        return this;
    }

    public SnapshotGroupWhereInput addEstimatedRecyclingTimeInItem(
            String estimatedRecyclingTimeInItem) {
        if (this.estimatedRecyclingTimeIn == null) {
            this.estimatedRecyclingTimeIn = new ArrayList<String>();
        }
        this.estimatedRecyclingTimeIn.add(estimatedRecyclingTimeInItem);
        return this;
    }

    /**
     * Get estimatedRecyclingTimeIn
     *
     * @return estimatedRecyclingTimeIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getEstimatedRecyclingTimeIn() {
        return estimatedRecyclingTimeIn;
    }

    public void setEstimatedRecyclingTimeIn(List<String> estimatedRecyclingTimeIn) {
        this.estimatedRecyclingTimeIn = estimatedRecyclingTimeIn;
    }

    public SnapshotGroupWhereInput estimatedRecyclingTimeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ESTIMATED_RECYCLING_TIME_IN);
        return this;
    }

    public SnapshotGroupWhereInput estimatedRecyclingTimeIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ESTIMATED_RECYCLING_TIME_IN);
        return this;
    }

    public void setEstimatedRecyclingTimeIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ESTIMATED_RECYCLING_TIME_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ESTIMATED_RECYCLING_TIME_IN);
        }
    }

    public boolean getEstimatedRecyclingTimeIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ESTIMATED_RECYCLING_TIME_IN);
    }

    public SnapshotGroupWhereInput estimatedRecyclingTimeLt(String estimatedRecyclingTimeLt) {

        this.estimatedRecyclingTimeLt = estimatedRecyclingTimeLt;
        return this;
    }

    /**
     * Get estimatedRecyclingTimeLt
     *
     * @return estimatedRecyclingTimeLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getEstimatedRecyclingTimeLt() {
        return estimatedRecyclingTimeLt;
    }

    public void setEstimatedRecyclingTimeLt(String estimatedRecyclingTimeLt) {
        this.estimatedRecyclingTimeLt = estimatedRecyclingTimeLt;
    }

    public SnapshotGroupWhereInput estimatedRecyclingTimeLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ESTIMATED_RECYCLING_TIME_LT);
        return this;
    }

    public SnapshotGroupWhereInput estimatedRecyclingTimeLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ESTIMATED_RECYCLING_TIME_LT);
        return this;
    }

    public void setEstimatedRecyclingTimeLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ESTIMATED_RECYCLING_TIME_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ESTIMATED_RECYCLING_TIME_LT);
        }
    }

    public boolean getEstimatedRecyclingTimeLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ESTIMATED_RECYCLING_TIME_LT);
    }

    public SnapshotGroupWhereInput estimatedRecyclingTimeLte(String estimatedRecyclingTimeLte) {

        this.estimatedRecyclingTimeLte = estimatedRecyclingTimeLte;
        return this;
    }

    /**
     * Get estimatedRecyclingTimeLte
     *
     * @return estimatedRecyclingTimeLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getEstimatedRecyclingTimeLte() {
        return estimatedRecyclingTimeLte;
    }

    public void setEstimatedRecyclingTimeLte(String estimatedRecyclingTimeLte) {
        this.estimatedRecyclingTimeLte = estimatedRecyclingTimeLte;
    }

    public SnapshotGroupWhereInput estimatedRecyclingTimeLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ESTIMATED_RECYCLING_TIME_LTE);
        return this;
    }

    public SnapshotGroupWhereInput estimatedRecyclingTimeLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ESTIMATED_RECYCLING_TIME_LTE);
        return this;
    }

    public void setEstimatedRecyclingTimeLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ESTIMATED_RECYCLING_TIME_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ESTIMATED_RECYCLING_TIME_LTE);
        }
    }

    public boolean getEstimatedRecyclingTimeLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ESTIMATED_RECYCLING_TIME_LTE);
    }

    public SnapshotGroupWhereInput estimatedRecyclingTimeNot(String estimatedRecyclingTimeNot) {

        this.estimatedRecyclingTimeNot = estimatedRecyclingTimeNot;
        return this;
    }

    /**
     * Get estimatedRecyclingTimeNot
     *
     * @return estimatedRecyclingTimeNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getEstimatedRecyclingTimeNot() {
        return estimatedRecyclingTimeNot;
    }

    public void setEstimatedRecyclingTimeNot(String estimatedRecyclingTimeNot) {
        this.estimatedRecyclingTimeNot = estimatedRecyclingTimeNot;
    }

    public SnapshotGroupWhereInput estimatedRecyclingTimeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ESTIMATED_RECYCLING_TIME_NOT);
        return this;
    }

    public SnapshotGroupWhereInput estimatedRecyclingTimeNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ESTIMATED_RECYCLING_TIME_NOT);
        return this;
    }

    public void setEstimatedRecyclingTimeNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ESTIMATED_RECYCLING_TIME_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ESTIMATED_RECYCLING_TIME_NOT);
        }
    }

    public boolean getEstimatedRecyclingTimeNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ESTIMATED_RECYCLING_TIME_NOT);
    }

    public SnapshotGroupWhereInput estimatedRecyclingTimeNotIn(
            List<String> estimatedRecyclingTimeNotIn) {

        this.estimatedRecyclingTimeNotIn = estimatedRecyclingTimeNotIn;
        return this;
    }

    public SnapshotGroupWhereInput addEstimatedRecyclingTimeNotInItem(
            String estimatedRecyclingTimeNotInItem) {
        if (this.estimatedRecyclingTimeNotIn == null) {
            this.estimatedRecyclingTimeNotIn = new ArrayList<String>();
        }
        this.estimatedRecyclingTimeNotIn.add(estimatedRecyclingTimeNotInItem);
        return this;
    }

    /**
     * Get estimatedRecyclingTimeNotIn
     *
     * @return estimatedRecyclingTimeNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getEstimatedRecyclingTimeNotIn() {
        return estimatedRecyclingTimeNotIn;
    }

    public void setEstimatedRecyclingTimeNotIn(List<String> estimatedRecyclingTimeNotIn) {
        this.estimatedRecyclingTimeNotIn = estimatedRecyclingTimeNotIn;
    }

    public SnapshotGroupWhereInput estimatedRecyclingTimeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ESTIMATED_RECYCLING_TIME_NOT_IN);
        return this;
    }

    public SnapshotGroupWhereInput estimatedRecyclingTimeNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ESTIMATED_RECYCLING_TIME_NOT_IN);
        return this;
    }

    public void setEstimatedRecyclingTimeNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ESTIMATED_RECYCLING_TIME_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ESTIMATED_RECYCLING_TIME_NOT_IN);
        }
    }

    public boolean getEstimatedRecyclingTimeNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ESTIMATED_RECYCLING_TIME_NOT_IN);
    }

    public SnapshotGroupWhereInput id(String id) {

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

    public SnapshotGroupWhereInput id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public SnapshotGroupWhereInput id_ExplictlyNonNull() {
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

    public SnapshotGroupWhereInput idContains(String idContains) {

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

    public SnapshotGroupWhereInput idContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_CONTAINS);
        return this;
    }

    public SnapshotGroupWhereInput idContains_ExplictlyNonNull() {
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

    public SnapshotGroupWhereInput idEndsWith(String idEndsWith) {

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

    public SnapshotGroupWhereInput idEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_ENDS_WITH);
        return this;
    }

    public SnapshotGroupWhereInput idEndsWith_ExplictlyNonNull() {
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

    public SnapshotGroupWhereInput idGt(String idGt) {

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

    public SnapshotGroupWhereInput idGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GT);
        return this;
    }

    public SnapshotGroupWhereInput idGt_ExplictlyNonNull() {
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

    public SnapshotGroupWhereInput idGte(String idGte) {

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

    public SnapshotGroupWhereInput idGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GTE);
        return this;
    }

    public SnapshotGroupWhereInput idGte_ExplictlyNonNull() {
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

    public SnapshotGroupWhereInput idIn(List<String> idIn) {

        this.idIn = idIn;
        return this;
    }

    public SnapshotGroupWhereInput addIdInItem(String idInItem) {
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

    public SnapshotGroupWhereInput idIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_IN);
        return this;
    }

    public SnapshotGroupWhereInput idIn_ExplictlyNonNull() {
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

    public SnapshotGroupWhereInput idLt(String idLt) {

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

    public SnapshotGroupWhereInput idLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LT);
        return this;
    }

    public SnapshotGroupWhereInput idLt_ExplictlyNonNull() {
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

    public SnapshotGroupWhereInput idLte(String idLte) {

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

    public SnapshotGroupWhereInput idLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LTE);
        return this;
    }

    public SnapshotGroupWhereInput idLte_ExplictlyNonNull() {
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

    public SnapshotGroupWhereInput idNot(String idNot) {

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

    public SnapshotGroupWhereInput idNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT);
        return this;
    }

    public SnapshotGroupWhereInput idNot_ExplictlyNonNull() {
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

    public SnapshotGroupWhereInput idNotContains(String idNotContains) {

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

    public SnapshotGroupWhereInput idNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_CONTAINS);
        return this;
    }

    public SnapshotGroupWhereInput idNotContains_ExplictlyNonNull() {
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

    public SnapshotGroupWhereInput idNotEndsWith(String idNotEndsWith) {

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

    public SnapshotGroupWhereInput idNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
        return this;
    }

    public SnapshotGroupWhereInput idNotEndsWith_ExplictlyNonNull() {
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

    public SnapshotGroupWhereInput idNotIn(List<String> idNotIn) {

        this.idNotIn = idNotIn;
        return this;
    }

    public SnapshotGroupWhereInput addIdNotInItem(String idNotInItem) {
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

    public SnapshotGroupWhereInput idNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_IN);
        return this;
    }

    public SnapshotGroupWhereInput idNotIn_ExplictlyNonNull() {
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

    public SnapshotGroupWhereInput idNotStartsWith(String idNotStartsWith) {

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

    public SnapshotGroupWhereInput idNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
        return this;
    }

    public SnapshotGroupWhereInput idNotStartsWith_ExplictlyNonNull() {
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

    public SnapshotGroupWhereInput idStartsWith(String idStartsWith) {

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

    public SnapshotGroupWhereInput idStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_STARTS_WITH);
        return this;
    }

    public SnapshotGroupWhereInput idStartsWith_ExplictlyNonNull() {
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

    public SnapshotGroupWhereInput internal(Boolean internal) {

        this.internal = internal;
        return this;
    }

    /**
     * Get internal
     *
     * @return internal
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getInternal() {
        return internal;
    }

    public void setInternal(Boolean internal) {
        this.internal = internal;
    }

    public SnapshotGroupWhereInput internal_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INTERNAL);
        return this;
    }

    public SnapshotGroupWhereInput internal_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INTERNAL);
        return this;
    }

    public void setInternal_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INTERNAL);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INTERNAL);
        }
    }

    public boolean getInternal_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INTERNAL);
    }

    public SnapshotGroupWhereInput internalNot(Boolean internalNot) {

        this.internalNot = internalNot;
        return this;
    }

    /**
     * Get internalNot
     *
     * @return internalNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getInternalNot() {
        return internalNot;
    }

    public void setInternalNot(Boolean internalNot) {
        this.internalNot = internalNot;
    }

    public SnapshotGroupWhereInput internalNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INTERNAL_NOT);
        return this;
    }

    public SnapshotGroupWhereInput internalNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INTERNAL_NOT);
        return this;
    }

    public void setInternalNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INTERNAL_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INTERNAL_NOT);
        }
    }

    public boolean getInternalNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INTERNAL_NOT);
    }

    public SnapshotGroupWhereInput keep(Boolean keep) {

        this.keep = keep;
        return this;
    }

    /**
     * Get keep
     *
     * @return keep
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getKeep() {
        return keep;
    }

    public void setKeep(Boolean keep) {
        this.keep = keep;
    }

    public SnapshotGroupWhereInput keep_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KEEP);
        return this;
    }

    public SnapshotGroupWhereInput keep_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_KEEP);
        return this;
    }

    public void setKeep_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_KEEP);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_KEEP);
        }
    }

    public boolean getKeep_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_KEEP);
    }

    public SnapshotGroupWhereInput keepNot(Boolean keepNot) {

        this.keepNot = keepNot;
        return this;
    }

    /**
     * Get keepNot
     *
     * @return keepNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getKeepNot() {
        return keepNot;
    }

    public void setKeepNot(Boolean keepNot) {
        this.keepNot = keepNot;
    }

    public SnapshotGroupWhereInput keepNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KEEP_NOT);
        return this;
    }

    public SnapshotGroupWhereInput keepNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_KEEP_NOT);
        return this;
    }

    public void setKeepNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_KEEP_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_KEEP_NOT);
        }
    }

    public boolean getKeepNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_KEEP_NOT);
    }

    public SnapshotGroupWhereInput localCreatedAt(String localCreatedAt) {

        this.localCreatedAt = localCreatedAt;
        return this;
    }

    /**
     * Get localCreatedAt
     *
     * @return localCreatedAt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalCreatedAt() {
        return localCreatedAt;
    }

    public void setLocalCreatedAt(String localCreatedAt) {
        this.localCreatedAt = localCreatedAt;
    }

    public SnapshotGroupWhereInput localCreatedAt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATED_AT);
        return this;
    }

    public SnapshotGroupWhereInput localCreatedAt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_CREATED_AT);
        return this;
    }

    public void setLocalCreatedAt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATED_AT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_CREATED_AT);
        }
    }

    public boolean getLocalCreatedAt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_CREATED_AT);
    }

    public SnapshotGroupWhereInput localCreatedAtGt(String localCreatedAtGt) {

        this.localCreatedAtGt = localCreatedAtGt;
        return this;
    }

    /**
     * Get localCreatedAtGt
     *
     * @return localCreatedAtGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalCreatedAtGt() {
        return localCreatedAtGt;
    }

    public void setLocalCreatedAtGt(String localCreatedAtGt) {
        this.localCreatedAtGt = localCreatedAtGt;
    }

    public SnapshotGroupWhereInput localCreatedAtGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATED_AT_GT);
        return this;
    }

    public SnapshotGroupWhereInput localCreatedAtGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_CREATED_AT_GT);
        return this;
    }

    public void setLocalCreatedAtGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATED_AT_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_CREATED_AT_GT);
        }
    }

    public boolean getLocalCreatedAtGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_CREATED_AT_GT);
    }

    public SnapshotGroupWhereInput localCreatedAtGte(String localCreatedAtGte) {

        this.localCreatedAtGte = localCreatedAtGte;
        return this;
    }

    /**
     * Get localCreatedAtGte
     *
     * @return localCreatedAtGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalCreatedAtGte() {
        return localCreatedAtGte;
    }

    public void setLocalCreatedAtGte(String localCreatedAtGte) {
        this.localCreatedAtGte = localCreatedAtGte;
    }

    public SnapshotGroupWhereInput localCreatedAtGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATED_AT_GTE);
        return this;
    }

    public SnapshotGroupWhereInput localCreatedAtGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_CREATED_AT_GTE);
        return this;
    }

    public void setLocalCreatedAtGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATED_AT_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_CREATED_AT_GTE);
        }
    }

    public boolean getLocalCreatedAtGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_CREATED_AT_GTE);
    }

    public SnapshotGroupWhereInput localCreatedAtIn(List<String> localCreatedAtIn) {

        this.localCreatedAtIn = localCreatedAtIn;
        return this;
    }

    public SnapshotGroupWhereInput addLocalCreatedAtInItem(String localCreatedAtInItem) {
        if (this.localCreatedAtIn == null) {
            this.localCreatedAtIn = new ArrayList<String>();
        }
        this.localCreatedAtIn.add(localCreatedAtInItem);
        return this;
    }

    /**
     * Get localCreatedAtIn
     *
     * @return localCreatedAtIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getLocalCreatedAtIn() {
        return localCreatedAtIn;
    }

    public void setLocalCreatedAtIn(List<String> localCreatedAtIn) {
        this.localCreatedAtIn = localCreatedAtIn;
    }

    public SnapshotGroupWhereInput localCreatedAtIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATED_AT_IN);
        return this;
    }

    public SnapshotGroupWhereInput localCreatedAtIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_CREATED_AT_IN);
        return this;
    }

    public void setLocalCreatedAtIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATED_AT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_CREATED_AT_IN);
        }
    }

    public boolean getLocalCreatedAtIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_CREATED_AT_IN);
    }

    public SnapshotGroupWhereInput localCreatedAtLt(String localCreatedAtLt) {

        this.localCreatedAtLt = localCreatedAtLt;
        return this;
    }

    /**
     * Get localCreatedAtLt
     *
     * @return localCreatedAtLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalCreatedAtLt() {
        return localCreatedAtLt;
    }

    public void setLocalCreatedAtLt(String localCreatedAtLt) {
        this.localCreatedAtLt = localCreatedAtLt;
    }

    public SnapshotGroupWhereInput localCreatedAtLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATED_AT_LT);
        return this;
    }

    public SnapshotGroupWhereInput localCreatedAtLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_CREATED_AT_LT);
        return this;
    }

    public void setLocalCreatedAtLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATED_AT_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_CREATED_AT_LT);
        }
    }

    public boolean getLocalCreatedAtLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_CREATED_AT_LT);
    }

    public SnapshotGroupWhereInput localCreatedAtLte(String localCreatedAtLte) {

        this.localCreatedAtLte = localCreatedAtLte;
        return this;
    }

    /**
     * Get localCreatedAtLte
     *
     * @return localCreatedAtLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalCreatedAtLte() {
        return localCreatedAtLte;
    }

    public void setLocalCreatedAtLte(String localCreatedAtLte) {
        this.localCreatedAtLte = localCreatedAtLte;
    }

    public SnapshotGroupWhereInput localCreatedAtLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATED_AT_LTE);
        return this;
    }

    public SnapshotGroupWhereInput localCreatedAtLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_CREATED_AT_LTE);
        return this;
    }

    public void setLocalCreatedAtLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATED_AT_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_CREATED_AT_LTE);
        }
    }

    public boolean getLocalCreatedAtLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_CREATED_AT_LTE);
    }

    public SnapshotGroupWhereInput localCreatedAtNot(String localCreatedAtNot) {

        this.localCreatedAtNot = localCreatedAtNot;
        return this;
    }

    /**
     * Get localCreatedAtNot
     *
     * @return localCreatedAtNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalCreatedAtNot() {
        return localCreatedAtNot;
    }

    public void setLocalCreatedAtNot(String localCreatedAtNot) {
        this.localCreatedAtNot = localCreatedAtNot;
    }

    public SnapshotGroupWhereInput localCreatedAtNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATED_AT_NOT);
        return this;
    }

    public SnapshotGroupWhereInput localCreatedAtNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_CREATED_AT_NOT);
        return this;
    }

    public void setLocalCreatedAtNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATED_AT_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_CREATED_AT_NOT);
        }
    }

    public boolean getLocalCreatedAtNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_CREATED_AT_NOT);
    }

    public SnapshotGroupWhereInput localCreatedAtNotIn(List<String> localCreatedAtNotIn) {

        this.localCreatedAtNotIn = localCreatedAtNotIn;
        return this;
    }

    public SnapshotGroupWhereInput addLocalCreatedAtNotInItem(String localCreatedAtNotInItem) {
        if (this.localCreatedAtNotIn == null) {
            this.localCreatedAtNotIn = new ArrayList<String>();
        }
        this.localCreatedAtNotIn.add(localCreatedAtNotInItem);
        return this;
    }

    /**
     * Get localCreatedAtNotIn
     *
     * @return localCreatedAtNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getLocalCreatedAtNotIn() {
        return localCreatedAtNotIn;
    }

    public void setLocalCreatedAtNotIn(List<String> localCreatedAtNotIn) {
        this.localCreatedAtNotIn = localCreatedAtNotIn;
    }

    public SnapshotGroupWhereInput localCreatedAtNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATED_AT_NOT_IN);
        return this;
    }

    public SnapshotGroupWhereInput localCreatedAtNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_CREATED_AT_NOT_IN);
        return this;
    }

    public void setLocalCreatedAtNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATED_AT_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_CREATED_AT_NOT_IN);
        }
    }

    public boolean getLocalCreatedAtNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_CREATED_AT_NOT_IN);
    }

    public SnapshotGroupWhereInput localId(String localId) {

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

    public SnapshotGroupWhereInput localId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID);
        return this;
    }

    public SnapshotGroupWhereInput localId_ExplictlyNonNull() {
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

    public SnapshotGroupWhereInput localIdContains(String localIdContains) {

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

    public SnapshotGroupWhereInput localIdContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_CONTAINS);
        return this;
    }

    public SnapshotGroupWhereInput localIdContains_ExplictlyNonNull() {
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

    public SnapshotGroupWhereInput localIdEndsWith(String localIdEndsWith) {

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

    public SnapshotGroupWhereInput localIdEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_ENDS_WITH);
        return this;
    }

    public SnapshotGroupWhereInput localIdEndsWith_ExplictlyNonNull() {
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

    public SnapshotGroupWhereInput localIdGt(String localIdGt) {

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

    public SnapshotGroupWhereInput localIdGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_GT);
        return this;
    }

    public SnapshotGroupWhereInput localIdGt_ExplictlyNonNull() {
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

    public SnapshotGroupWhereInput localIdGte(String localIdGte) {

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

    public SnapshotGroupWhereInput localIdGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_GTE);
        return this;
    }

    public SnapshotGroupWhereInput localIdGte_ExplictlyNonNull() {
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

    public SnapshotGroupWhereInput localIdIn(List<String> localIdIn) {

        this.localIdIn = localIdIn;
        return this;
    }

    public SnapshotGroupWhereInput addLocalIdInItem(String localIdInItem) {
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

    public SnapshotGroupWhereInput localIdIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_IN);
        return this;
    }

    public SnapshotGroupWhereInput localIdIn_ExplictlyNonNull() {
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

    public SnapshotGroupWhereInput localIdLt(String localIdLt) {

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

    public SnapshotGroupWhereInput localIdLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_LT);
        return this;
    }

    public SnapshotGroupWhereInput localIdLt_ExplictlyNonNull() {
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

    public SnapshotGroupWhereInput localIdLte(String localIdLte) {

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

    public SnapshotGroupWhereInput localIdLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_LTE);
        return this;
    }

    public SnapshotGroupWhereInput localIdLte_ExplictlyNonNull() {
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

    public SnapshotGroupWhereInput localIdNot(String localIdNot) {

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

    public SnapshotGroupWhereInput localIdNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT);
        return this;
    }

    public SnapshotGroupWhereInput localIdNot_ExplictlyNonNull() {
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

    public SnapshotGroupWhereInput localIdNotContains(String localIdNotContains) {

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

    public SnapshotGroupWhereInput localIdNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_CONTAINS);
        return this;
    }

    public SnapshotGroupWhereInput localIdNotContains_ExplictlyNonNull() {
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

    public SnapshotGroupWhereInput localIdNotEndsWith(String localIdNotEndsWith) {

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

    public SnapshotGroupWhereInput localIdNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_ENDS_WITH);
        return this;
    }

    public SnapshotGroupWhereInput localIdNotEndsWith_ExplictlyNonNull() {
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

    public SnapshotGroupWhereInput localIdNotIn(List<String> localIdNotIn) {

        this.localIdNotIn = localIdNotIn;
        return this;
    }

    public SnapshotGroupWhereInput addLocalIdNotInItem(String localIdNotInItem) {
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

    public SnapshotGroupWhereInput localIdNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_IN);
        return this;
    }

    public SnapshotGroupWhereInput localIdNotIn_ExplictlyNonNull() {
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

    public SnapshotGroupWhereInput localIdNotStartsWith(String localIdNotStartsWith) {

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

    public SnapshotGroupWhereInput localIdNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_STARTS_WITH);
        return this;
    }

    public SnapshotGroupWhereInput localIdNotStartsWith_ExplictlyNonNull() {
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

    public SnapshotGroupWhereInput localIdStartsWith(String localIdStartsWith) {

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

    public SnapshotGroupWhereInput localIdStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_STARTS_WITH);
        return this;
    }

    public SnapshotGroupWhereInput localIdStartsWith_ExplictlyNonNull() {
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

    public SnapshotGroupWhereInput logicalSizeBytes(Long logicalSizeBytes) {

        this.logicalSizeBytes = logicalSizeBytes;
        return this;
    }

    /**
     * Get logicalSizeBytes
     *
     * @return logicalSizeBytes
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getLogicalSizeBytes() {
        return logicalSizeBytes;
    }

    public void setLogicalSizeBytes(Long logicalSizeBytes) {
        this.logicalSizeBytes = logicalSizeBytes;
    }

    public SnapshotGroupWhereInput logicalSizeBytes_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOGICAL_SIZE_BYTES);
        return this;
    }

    public SnapshotGroupWhereInput logicalSizeBytes_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOGICAL_SIZE_BYTES);
        return this;
    }

    public void setLogicalSizeBytes_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOGICAL_SIZE_BYTES);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOGICAL_SIZE_BYTES);
        }
    }

    public boolean getLogicalSizeBytes_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOGICAL_SIZE_BYTES);
    }

    public SnapshotGroupWhereInput logicalSizeBytesGt(Long logicalSizeBytesGt) {

        this.logicalSizeBytesGt = logicalSizeBytesGt;
        return this;
    }

    /**
     * Get logicalSizeBytesGt
     *
     * @return logicalSizeBytesGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getLogicalSizeBytesGt() {
        return logicalSizeBytesGt;
    }

    public void setLogicalSizeBytesGt(Long logicalSizeBytesGt) {
        this.logicalSizeBytesGt = logicalSizeBytesGt;
    }

    public SnapshotGroupWhereInput logicalSizeBytesGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOGICAL_SIZE_BYTES_GT);
        return this;
    }

    public SnapshotGroupWhereInput logicalSizeBytesGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOGICAL_SIZE_BYTES_GT);
        return this;
    }

    public void setLogicalSizeBytesGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOGICAL_SIZE_BYTES_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOGICAL_SIZE_BYTES_GT);
        }
    }

    public boolean getLogicalSizeBytesGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOGICAL_SIZE_BYTES_GT);
    }

    public SnapshotGroupWhereInput logicalSizeBytesGte(Long logicalSizeBytesGte) {

        this.logicalSizeBytesGte = logicalSizeBytesGte;
        return this;
    }

    /**
     * Get logicalSizeBytesGte
     *
     * @return logicalSizeBytesGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getLogicalSizeBytesGte() {
        return logicalSizeBytesGte;
    }

    public void setLogicalSizeBytesGte(Long logicalSizeBytesGte) {
        this.logicalSizeBytesGte = logicalSizeBytesGte;
    }

    public SnapshotGroupWhereInput logicalSizeBytesGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOGICAL_SIZE_BYTES_GTE);
        return this;
    }

    public SnapshotGroupWhereInput logicalSizeBytesGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOGICAL_SIZE_BYTES_GTE);
        return this;
    }

    public void setLogicalSizeBytesGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOGICAL_SIZE_BYTES_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOGICAL_SIZE_BYTES_GTE);
        }
    }

    public boolean getLogicalSizeBytesGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOGICAL_SIZE_BYTES_GTE);
    }

    public SnapshotGroupWhereInput logicalSizeBytesIn(List<Long> logicalSizeBytesIn) {

        this.logicalSizeBytesIn = logicalSizeBytesIn;
        return this;
    }

    public SnapshotGroupWhereInput addLogicalSizeBytesInItem(Long logicalSizeBytesInItem) {
        if (this.logicalSizeBytesIn == null) {
            this.logicalSizeBytesIn = new ArrayList<Long>();
        }
        this.logicalSizeBytesIn.add(logicalSizeBytesInItem);
        return this;
    }

    /**
     * Get logicalSizeBytesIn
     *
     * @return logicalSizeBytesIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getLogicalSizeBytesIn() {
        return logicalSizeBytesIn;
    }

    public void setLogicalSizeBytesIn(List<Long> logicalSizeBytesIn) {
        this.logicalSizeBytesIn = logicalSizeBytesIn;
    }

    public SnapshotGroupWhereInput logicalSizeBytesIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOGICAL_SIZE_BYTES_IN);
        return this;
    }

    public SnapshotGroupWhereInput logicalSizeBytesIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOGICAL_SIZE_BYTES_IN);
        return this;
    }

    public void setLogicalSizeBytesIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOGICAL_SIZE_BYTES_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOGICAL_SIZE_BYTES_IN);
        }
    }

    public boolean getLogicalSizeBytesIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOGICAL_SIZE_BYTES_IN);
    }

    public SnapshotGroupWhereInput logicalSizeBytesLt(Long logicalSizeBytesLt) {

        this.logicalSizeBytesLt = logicalSizeBytesLt;
        return this;
    }

    /**
     * Get logicalSizeBytesLt
     *
     * @return logicalSizeBytesLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getLogicalSizeBytesLt() {
        return logicalSizeBytesLt;
    }

    public void setLogicalSizeBytesLt(Long logicalSizeBytesLt) {
        this.logicalSizeBytesLt = logicalSizeBytesLt;
    }

    public SnapshotGroupWhereInput logicalSizeBytesLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOGICAL_SIZE_BYTES_LT);
        return this;
    }

    public SnapshotGroupWhereInput logicalSizeBytesLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOGICAL_SIZE_BYTES_LT);
        return this;
    }

    public void setLogicalSizeBytesLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOGICAL_SIZE_BYTES_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOGICAL_SIZE_BYTES_LT);
        }
    }

    public boolean getLogicalSizeBytesLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOGICAL_SIZE_BYTES_LT);
    }

    public SnapshotGroupWhereInput logicalSizeBytesLte(Long logicalSizeBytesLte) {

        this.logicalSizeBytesLte = logicalSizeBytesLte;
        return this;
    }

    /**
     * Get logicalSizeBytesLte
     *
     * @return logicalSizeBytesLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getLogicalSizeBytesLte() {
        return logicalSizeBytesLte;
    }

    public void setLogicalSizeBytesLte(Long logicalSizeBytesLte) {
        this.logicalSizeBytesLte = logicalSizeBytesLte;
    }

    public SnapshotGroupWhereInput logicalSizeBytesLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOGICAL_SIZE_BYTES_LTE);
        return this;
    }

    public SnapshotGroupWhereInput logicalSizeBytesLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOGICAL_SIZE_BYTES_LTE);
        return this;
    }

    public void setLogicalSizeBytesLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOGICAL_SIZE_BYTES_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOGICAL_SIZE_BYTES_LTE);
        }
    }

    public boolean getLogicalSizeBytesLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOGICAL_SIZE_BYTES_LTE);
    }

    public SnapshotGroupWhereInput logicalSizeBytesNot(Long logicalSizeBytesNot) {

        this.logicalSizeBytesNot = logicalSizeBytesNot;
        return this;
    }

    /**
     * Get logicalSizeBytesNot
     *
     * @return logicalSizeBytesNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getLogicalSizeBytesNot() {
        return logicalSizeBytesNot;
    }

    public void setLogicalSizeBytesNot(Long logicalSizeBytesNot) {
        this.logicalSizeBytesNot = logicalSizeBytesNot;
    }

    public SnapshotGroupWhereInput logicalSizeBytesNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOGICAL_SIZE_BYTES_NOT);
        return this;
    }

    public SnapshotGroupWhereInput logicalSizeBytesNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOGICAL_SIZE_BYTES_NOT);
        return this;
    }

    public void setLogicalSizeBytesNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOGICAL_SIZE_BYTES_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOGICAL_SIZE_BYTES_NOT);
        }
    }

    public boolean getLogicalSizeBytesNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOGICAL_SIZE_BYTES_NOT);
    }

    public SnapshotGroupWhereInput logicalSizeBytesNotIn(List<Long> logicalSizeBytesNotIn) {

        this.logicalSizeBytesNotIn = logicalSizeBytesNotIn;
        return this;
    }

    public SnapshotGroupWhereInput addLogicalSizeBytesNotInItem(Long logicalSizeBytesNotInItem) {
        if (this.logicalSizeBytesNotIn == null) {
            this.logicalSizeBytesNotIn = new ArrayList<Long>();
        }
        this.logicalSizeBytesNotIn.add(logicalSizeBytesNotInItem);
        return this;
    }

    /**
     * Get logicalSizeBytesNotIn
     *
     * @return logicalSizeBytesNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getLogicalSizeBytesNotIn() {
        return logicalSizeBytesNotIn;
    }

    public void setLogicalSizeBytesNotIn(List<Long> logicalSizeBytesNotIn) {
        this.logicalSizeBytesNotIn = logicalSizeBytesNotIn;
    }

    public SnapshotGroupWhereInput logicalSizeBytesNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOGICAL_SIZE_BYTES_NOT_IN);
        return this;
    }

    public SnapshotGroupWhereInput logicalSizeBytesNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOGICAL_SIZE_BYTES_NOT_IN);
        return this;
    }

    public void setLogicalSizeBytesNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOGICAL_SIZE_BYTES_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOGICAL_SIZE_BYTES_NOT_IN);
        }
    }

    public boolean getLogicalSizeBytesNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOGICAL_SIZE_BYTES_NOT_IN);
    }

    public SnapshotGroupWhereInput name(String name) {

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

    public SnapshotGroupWhereInput name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public SnapshotGroupWhereInput name_ExplictlyNonNull() {
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

    public SnapshotGroupWhereInput nameContains(String nameContains) {

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

    public SnapshotGroupWhereInput nameContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_CONTAINS);
        return this;
    }

    public SnapshotGroupWhereInput nameContains_ExplictlyNonNull() {
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

    public SnapshotGroupWhereInput nameEndsWith(String nameEndsWith) {

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

    public SnapshotGroupWhereInput nameEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_ENDS_WITH);
        return this;
    }

    public SnapshotGroupWhereInput nameEndsWith_ExplictlyNonNull() {
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

    public SnapshotGroupWhereInput nameGt(String nameGt) {

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

    public SnapshotGroupWhereInput nameGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_GT);
        return this;
    }

    public SnapshotGroupWhereInput nameGt_ExplictlyNonNull() {
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

    public SnapshotGroupWhereInput nameGte(String nameGte) {

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

    public SnapshotGroupWhereInput nameGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_GTE);
        return this;
    }

    public SnapshotGroupWhereInput nameGte_ExplictlyNonNull() {
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

    public SnapshotGroupWhereInput nameIn(List<String> nameIn) {

        this.nameIn = nameIn;
        return this;
    }

    public SnapshotGroupWhereInput addNameInItem(String nameInItem) {
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

    public SnapshotGroupWhereInput nameIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_IN);
        return this;
    }

    public SnapshotGroupWhereInput nameIn_ExplictlyNonNull() {
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

    public SnapshotGroupWhereInput nameLt(String nameLt) {

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

    public SnapshotGroupWhereInput nameLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_LT);
        return this;
    }

    public SnapshotGroupWhereInput nameLt_ExplictlyNonNull() {
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

    public SnapshotGroupWhereInput nameLte(String nameLte) {

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

    public SnapshotGroupWhereInput nameLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_LTE);
        return this;
    }

    public SnapshotGroupWhereInput nameLte_ExplictlyNonNull() {
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

    public SnapshotGroupWhereInput nameNot(String nameNot) {

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

    public SnapshotGroupWhereInput nameNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT);
        return this;
    }

    public SnapshotGroupWhereInput nameNot_ExplictlyNonNull() {
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

    public SnapshotGroupWhereInput nameNotContains(String nameNotContains) {

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

    public SnapshotGroupWhereInput nameNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_CONTAINS);
        return this;
    }

    public SnapshotGroupWhereInput nameNotContains_ExplictlyNonNull() {
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

    public SnapshotGroupWhereInput nameNotEndsWith(String nameNotEndsWith) {

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

    public SnapshotGroupWhereInput nameNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_ENDS_WITH);
        return this;
    }

    public SnapshotGroupWhereInput nameNotEndsWith_ExplictlyNonNull() {
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

    public SnapshotGroupWhereInput nameNotIn(List<String> nameNotIn) {

        this.nameNotIn = nameNotIn;
        return this;
    }

    public SnapshotGroupWhereInput addNameNotInItem(String nameNotInItem) {
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

    public SnapshotGroupWhereInput nameNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_IN);
        return this;
    }

    public SnapshotGroupWhereInput nameNotIn_ExplictlyNonNull() {
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

    public SnapshotGroupWhereInput nameNotStartsWith(String nameNotStartsWith) {

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

    public SnapshotGroupWhereInput nameNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_STARTS_WITH);
        return this;
    }

    public SnapshotGroupWhereInput nameNotStartsWith_ExplictlyNonNull() {
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

    public SnapshotGroupWhereInput nameStartsWith(String nameStartsWith) {

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

    public SnapshotGroupWhereInput nameStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_STARTS_WITH);
        return this;
    }

    public SnapshotGroupWhereInput nameStartsWith_ExplictlyNonNull() {
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

    public SnapshotGroupWhereInput objectNum(Integer objectNum) {

        this.objectNum = objectNum;
        return this;
    }

    /**
     * Get objectNum
     *
     * @return objectNum
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getObjectNum() {
        return objectNum;
    }

    public void setObjectNum(Integer objectNum) {
        this.objectNum = objectNum;
    }

    public SnapshotGroupWhereInput objectNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_OBJECT_NUM);
        return this;
    }

    public SnapshotGroupWhereInput objectNum_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_OBJECT_NUM);
        return this;
    }

    public void setObjectNum_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_OBJECT_NUM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_OBJECT_NUM);
        }
    }

    public boolean getObjectNum_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_OBJECT_NUM);
    }

    public SnapshotGroupWhereInput objectNumGt(Integer objectNumGt) {

        this.objectNumGt = objectNumGt;
        return this;
    }

    /**
     * Get objectNumGt
     *
     * @return objectNumGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getObjectNumGt() {
        return objectNumGt;
    }

    public void setObjectNumGt(Integer objectNumGt) {
        this.objectNumGt = objectNumGt;
    }

    public SnapshotGroupWhereInput objectNumGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_OBJECT_NUM_GT);
        return this;
    }

    public SnapshotGroupWhereInput objectNumGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_OBJECT_NUM_GT);
        return this;
    }

    public void setObjectNumGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_OBJECT_NUM_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_OBJECT_NUM_GT);
        }
    }

    public boolean getObjectNumGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_OBJECT_NUM_GT);
    }

    public SnapshotGroupWhereInput objectNumGte(Integer objectNumGte) {

        this.objectNumGte = objectNumGte;
        return this;
    }

    /**
     * Get objectNumGte
     *
     * @return objectNumGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getObjectNumGte() {
        return objectNumGte;
    }

    public void setObjectNumGte(Integer objectNumGte) {
        this.objectNumGte = objectNumGte;
    }

    public SnapshotGroupWhereInput objectNumGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_OBJECT_NUM_GTE);
        return this;
    }

    public SnapshotGroupWhereInput objectNumGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_OBJECT_NUM_GTE);
        return this;
    }

    public void setObjectNumGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_OBJECT_NUM_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_OBJECT_NUM_GTE);
        }
    }

    public boolean getObjectNumGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_OBJECT_NUM_GTE);
    }

    public SnapshotGroupWhereInput objectNumIn(List<Integer> objectNumIn) {

        this.objectNumIn = objectNumIn;
        return this;
    }

    public SnapshotGroupWhereInput addObjectNumInItem(Integer objectNumInItem) {
        if (this.objectNumIn == null) {
            this.objectNumIn = new ArrayList<Integer>();
        }
        this.objectNumIn.add(objectNumInItem);
        return this;
    }

    /**
     * Get objectNumIn
     *
     * @return objectNumIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getObjectNumIn() {
        return objectNumIn;
    }

    public void setObjectNumIn(List<Integer> objectNumIn) {
        this.objectNumIn = objectNumIn;
    }

    public SnapshotGroupWhereInput objectNumIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_OBJECT_NUM_IN);
        return this;
    }

    public SnapshotGroupWhereInput objectNumIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_OBJECT_NUM_IN);
        return this;
    }

    public void setObjectNumIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_OBJECT_NUM_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_OBJECT_NUM_IN);
        }
    }

    public boolean getObjectNumIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_OBJECT_NUM_IN);
    }

    public SnapshotGroupWhereInput objectNumLt(Integer objectNumLt) {

        this.objectNumLt = objectNumLt;
        return this;
    }

    /**
     * Get objectNumLt
     *
     * @return objectNumLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getObjectNumLt() {
        return objectNumLt;
    }

    public void setObjectNumLt(Integer objectNumLt) {
        this.objectNumLt = objectNumLt;
    }

    public SnapshotGroupWhereInput objectNumLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_OBJECT_NUM_LT);
        return this;
    }

    public SnapshotGroupWhereInput objectNumLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_OBJECT_NUM_LT);
        return this;
    }

    public void setObjectNumLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_OBJECT_NUM_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_OBJECT_NUM_LT);
        }
    }

    public boolean getObjectNumLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_OBJECT_NUM_LT);
    }

    public SnapshotGroupWhereInput objectNumLte(Integer objectNumLte) {

        this.objectNumLte = objectNumLte;
        return this;
    }

    /**
     * Get objectNumLte
     *
     * @return objectNumLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getObjectNumLte() {
        return objectNumLte;
    }

    public void setObjectNumLte(Integer objectNumLte) {
        this.objectNumLte = objectNumLte;
    }

    public SnapshotGroupWhereInput objectNumLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_OBJECT_NUM_LTE);
        return this;
    }

    public SnapshotGroupWhereInput objectNumLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_OBJECT_NUM_LTE);
        return this;
    }

    public void setObjectNumLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_OBJECT_NUM_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_OBJECT_NUM_LTE);
        }
    }

    public boolean getObjectNumLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_OBJECT_NUM_LTE);
    }

    public SnapshotGroupWhereInput objectNumNot(Integer objectNumNot) {

        this.objectNumNot = objectNumNot;
        return this;
    }

    /**
     * Get objectNumNot
     *
     * @return objectNumNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getObjectNumNot() {
        return objectNumNot;
    }

    public void setObjectNumNot(Integer objectNumNot) {
        this.objectNumNot = objectNumNot;
    }

    public SnapshotGroupWhereInput objectNumNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_OBJECT_NUM_NOT);
        return this;
    }

    public SnapshotGroupWhereInput objectNumNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_OBJECT_NUM_NOT);
        return this;
    }

    public void setObjectNumNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_OBJECT_NUM_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_OBJECT_NUM_NOT);
        }
    }

    public boolean getObjectNumNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_OBJECT_NUM_NOT);
    }

    public SnapshotGroupWhereInput objectNumNotIn(List<Integer> objectNumNotIn) {

        this.objectNumNotIn = objectNumNotIn;
        return this;
    }

    public SnapshotGroupWhereInput addObjectNumNotInItem(Integer objectNumNotInItem) {
        if (this.objectNumNotIn == null) {
            this.objectNumNotIn = new ArrayList<Integer>();
        }
        this.objectNumNotIn.add(objectNumNotInItem);
        return this;
    }

    /**
     * Get objectNumNotIn
     *
     * @return objectNumNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getObjectNumNotIn() {
        return objectNumNotIn;
    }

    public void setObjectNumNotIn(List<Integer> objectNumNotIn) {
        this.objectNumNotIn = objectNumNotIn;
    }

    public SnapshotGroupWhereInput objectNumNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_OBJECT_NUM_NOT_IN);
        return this;
    }

    public SnapshotGroupWhereInput objectNumNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_OBJECT_NUM_NOT_IN);
        return this;
    }

    public void setObjectNumNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_OBJECT_NUM_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_OBJECT_NUM_NOT_IN);
        }
    }

    public boolean getObjectNumNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_OBJECT_NUM_NOT_IN);
    }

    public SnapshotGroupWhereInput snapshotPlanTask(SnapshotPlanTaskWhereInput snapshotPlanTask) {

        this.snapshotPlanTask = snapshotPlanTask;
        return this;
    }

    /**
     * Get snapshotPlanTask
     *
     * @return snapshotPlanTask
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public SnapshotPlanTaskWhereInput getSnapshotPlanTask() {
        return snapshotPlanTask;
    }

    public void setSnapshotPlanTask(SnapshotPlanTaskWhereInput snapshotPlanTask) {
        this.snapshotPlanTask = snapshotPlanTask;
    }

    public SnapshotGroupWhereInput snapshotPlanTask_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT_PLAN_TASK);
        return this;
    }

    public SnapshotGroupWhereInput snapshotPlanTask_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SNAPSHOT_PLAN_TASK);
        return this;
    }

    public void setSnapshotPlanTask_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT_PLAN_TASK);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SNAPSHOT_PLAN_TASK);
        }
    }

    public boolean getSnapshotPlanTask_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SNAPSHOT_PLAN_TASK);
    }

    public SnapshotGroupWhereInput vmSnapshotsEvery(VmSnapshotWhereInput vmSnapshotsEvery) {

        this.vmSnapshotsEvery = vmSnapshotsEvery;
        return this;
    }

    /**
     * Get vmSnapshotsEvery
     *
     * @return vmSnapshotsEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmSnapshotWhereInput getVmSnapshotsEvery() {
        return vmSnapshotsEvery;
    }

    public void setVmSnapshotsEvery(VmSnapshotWhereInput vmSnapshotsEvery) {
        this.vmSnapshotsEvery = vmSnapshotsEvery;
    }

    public SnapshotGroupWhereInput vmSnapshotsEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_SNAPSHOTS_EVERY);
        return this;
    }

    public SnapshotGroupWhereInput vmSnapshotsEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_SNAPSHOTS_EVERY);
        return this;
    }

    public void setVmSnapshotsEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_SNAPSHOTS_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_SNAPSHOTS_EVERY);
        }
    }

    public boolean getVmSnapshotsEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_SNAPSHOTS_EVERY);
    }

    public SnapshotGroupWhereInput vmSnapshotsNone(VmSnapshotWhereInput vmSnapshotsNone) {

        this.vmSnapshotsNone = vmSnapshotsNone;
        return this;
    }

    /**
     * Get vmSnapshotsNone
     *
     * @return vmSnapshotsNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmSnapshotWhereInput getVmSnapshotsNone() {
        return vmSnapshotsNone;
    }

    public void setVmSnapshotsNone(VmSnapshotWhereInput vmSnapshotsNone) {
        this.vmSnapshotsNone = vmSnapshotsNone;
    }

    public SnapshotGroupWhereInput vmSnapshotsNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_SNAPSHOTS_NONE);
        return this;
    }

    public SnapshotGroupWhereInput vmSnapshotsNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_SNAPSHOTS_NONE);
        return this;
    }

    public void setVmSnapshotsNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_SNAPSHOTS_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_SNAPSHOTS_NONE);
        }
    }

    public boolean getVmSnapshotsNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_SNAPSHOTS_NONE);
    }

    public SnapshotGroupWhereInput vmSnapshotsSome(VmSnapshotWhereInput vmSnapshotsSome) {

        this.vmSnapshotsSome = vmSnapshotsSome;
        return this;
    }

    /**
     * Get vmSnapshotsSome
     *
     * @return vmSnapshotsSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmSnapshotWhereInput getVmSnapshotsSome() {
        return vmSnapshotsSome;
    }

    public void setVmSnapshotsSome(VmSnapshotWhereInput vmSnapshotsSome) {
        this.vmSnapshotsSome = vmSnapshotsSome;
    }

    public SnapshotGroupWhereInput vmSnapshotsSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_SNAPSHOTS_SOME);
        return this;
    }

    public SnapshotGroupWhereInput vmSnapshotsSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_SNAPSHOTS_SOME);
        return this;
    }

    public void setVmSnapshotsSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_SNAPSHOTS_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_SNAPSHOTS_SOME);
        }
    }

    public boolean getVmSnapshotsSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_SNAPSHOTS_SOME);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SnapshotGroupWhereInput snapshotGroupWhereInput = (SnapshotGroupWhereInput) o;
        return Objects.equals(this.AND, snapshotGroupWhereInput.AND)
                && Objects.equals(this.NOT, snapshotGroupWhereInput.NOT)
                && Objects.equals(this.OR, snapshotGroupWhereInput.OR)
                && Objects.equals(this.cluster, snapshotGroupWhereInput.cluster)
                && Objects.equals(this.deleted, snapshotGroupWhereInput.deleted)
                && Objects.equals(this.deletedNot, snapshotGroupWhereInput.deletedNot)
                && Objects.equals(this.entityAsyncStatus, snapshotGroupWhereInput.entityAsyncStatus)
                && Objects.equals(
                        this.entityAsyncStatusIn, snapshotGroupWhereInput.entityAsyncStatusIn)
                && Objects.equals(
                        this.entityAsyncStatusNot, snapshotGroupWhereInput.entityAsyncStatusNot)
                && Objects.equals(
                        this.entityAsyncStatusNotIn, snapshotGroupWhereInput.entityAsyncStatusNotIn)
                && Objects.equals(
                        this.estimatedRecyclingTime, snapshotGroupWhereInput.estimatedRecyclingTime)
                && Objects.equals(
                        this.estimatedRecyclingTimeGt,
                        snapshotGroupWhereInput.estimatedRecyclingTimeGt)
                && Objects.equals(
                        this.estimatedRecyclingTimeGte,
                        snapshotGroupWhereInput.estimatedRecyclingTimeGte)
                && Objects.equals(
                        this.estimatedRecyclingTimeIn,
                        snapshotGroupWhereInput.estimatedRecyclingTimeIn)
                && Objects.equals(
                        this.estimatedRecyclingTimeLt,
                        snapshotGroupWhereInput.estimatedRecyclingTimeLt)
                && Objects.equals(
                        this.estimatedRecyclingTimeLte,
                        snapshotGroupWhereInput.estimatedRecyclingTimeLte)
                && Objects.equals(
                        this.estimatedRecyclingTimeNot,
                        snapshotGroupWhereInput.estimatedRecyclingTimeNot)
                && Objects.equals(
                        this.estimatedRecyclingTimeNotIn,
                        snapshotGroupWhereInput.estimatedRecyclingTimeNotIn)
                && Objects.equals(this.id, snapshotGroupWhereInput.id)
                && Objects.equals(this.idContains, snapshotGroupWhereInput.idContains)
                && Objects.equals(this.idEndsWith, snapshotGroupWhereInput.idEndsWith)
                && Objects.equals(this.idGt, snapshotGroupWhereInput.idGt)
                && Objects.equals(this.idGte, snapshotGroupWhereInput.idGte)
                && Objects.equals(this.idIn, snapshotGroupWhereInput.idIn)
                && Objects.equals(this.idLt, snapshotGroupWhereInput.idLt)
                && Objects.equals(this.idLte, snapshotGroupWhereInput.idLte)
                && Objects.equals(this.idNot, snapshotGroupWhereInput.idNot)
                && Objects.equals(this.idNotContains, snapshotGroupWhereInput.idNotContains)
                && Objects.equals(this.idNotEndsWith, snapshotGroupWhereInput.idNotEndsWith)
                && Objects.equals(this.idNotIn, snapshotGroupWhereInput.idNotIn)
                && Objects.equals(this.idNotStartsWith, snapshotGroupWhereInput.idNotStartsWith)
                && Objects.equals(this.idStartsWith, snapshotGroupWhereInput.idStartsWith)
                && Objects.equals(this.internal, snapshotGroupWhereInput.internal)
                && Objects.equals(this.internalNot, snapshotGroupWhereInput.internalNot)
                && Objects.equals(this.keep, snapshotGroupWhereInput.keep)
                && Objects.equals(this.keepNot, snapshotGroupWhereInput.keepNot)
                && Objects.equals(this.localCreatedAt, snapshotGroupWhereInput.localCreatedAt)
                && Objects.equals(this.localCreatedAtGt, snapshotGroupWhereInput.localCreatedAtGt)
                && Objects.equals(this.localCreatedAtGte, snapshotGroupWhereInput.localCreatedAtGte)
                && Objects.equals(this.localCreatedAtIn, snapshotGroupWhereInput.localCreatedAtIn)
                && Objects.equals(this.localCreatedAtLt, snapshotGroupWhereInput.localCreatedAtLt)
                && Objects.equals(this.localCreatedAtLte, snapshotGroupWhereInput.localCreatedAtLte)
                && Objects.equals(this.localCreatedAtNot, snapshotGroupWhereInput.localCreatedAtNot)
                && Objects.equals(
                        this.localCreatedAtNotIn, snapshotGroupWhereInput.localCreatedAtNotIn)
                && Objects.equals(this.localId, snapshotGroupWhereInput.localId)
                && Objects.equals(this.localIdContains, snapshotGroupWhereInput.localIdContains)
                && Objects.equals(this.localIdEndsWith, snapshotGroupWhereInput.localIdEndsWith)
                && Objects.equals(this.localIdGt, snapshotGroupWhereInput.localIdGt)
                && Objects.equals(this.localIdGte, snapshotGroupWhereInput.localIdGte)
                && Objects.equals(this.localIdIn, snapshotGroupWhereInput.localIdIn)
                && Objects.equals(this.localIdLt, snapshotGroupWhereInput.localIdLt)
                && Objects.equals(this.localIdLte, snapshotGroupWhereInput.localIdLte)
                && Objects.equals(this.localIdNot, snapshotGroupWhereInput.localIdNot)
                && Objects.equals(
                        this.localIdNotContains, snapshotGroupWhereInput.localIdNotContains)
                && Objects.equals(
                        this.localIdNotEndsWith, snapshotGroupWhereInput.localIdNotEndsWith)
                && Objects.equals(this.localIdNotIn, snapshotGroupWhereInput.localIdNotIn)
                && Objects.equals(
                        this.localIdNotStartsWith, snapshotGroupWhereInput.localIdNotStartsWith)
                && Objects.equals(this.localIdStartsWith, snapshotGroupWhereInput.localIdStartsWith)
                && Objects.equals(this.logicalSizeBytes, snapshotGroupWhereInput.logicalSizeBytes)
                && Objects.equals(
                        this.logicalSizeBytesGt, snapshotGroupWhereInput.logicalSizeBytesGt)
                && Objects.equals(
                        this.logicalSizeBytesGte, snapshotGroupWhereInput.logicalSizeBytesGte)
                && Objects.equals(
                        this.logicalSizeBytesIn, snapshotGroupWhereInput.logicalSizeBytesIn)
                && Objects.equals(
                        this.logicalSizeBytesLt, snapshotGroupWhereInput.logicalSizeBytesLt)
                && Objects.equals(
                        this.logicalSizeBytesLte, snapshotGroupWhereInput.logicalSizeBytesLte)
                && Objects.equals(
                        this.logicalSizeBytesNot, snapshotGroupWhereInput.logicalSizeBytesNot)
                && Objects.equals(
                        this.logicalSizeBytesNotIn, snapshotGroupWhereInput.logicalSizeBytesNotIn)
                && Objects.equals(this.name, snapshotGroupWhereInput.name)
                && Objects.equals(this.nameContains, snapshotGroupWhereInput.nameContains)
                && Objects.equals(this.nameEndsWith, snapshotGroupWhereInput.nameEndsWith)
                && Objects.equals(this.nameGt, snapshotGroupWhereInput.nameGt)
                && Objects.equals(this.nameGte, snapshotGroupWhereInput.nameGte)
                && Objects.equals(this.nameIn, snapshotGroupWhereInput.nameIn)
                && Objects.equals(this.nameLt, snapshotGroupWhereInput.nameLt)
                && Objects.equals(this.nameLte, snapshotGroupWhereInput.nameLte)
                && Objects.equals(this.nameNot, snapshotGroupWhereInput.nameNot)
                && Objects.equals(this.nameNotContains, snapshotGroupWhereInput.nameNotContains)
                && Objects.equals(this.nameNotEndsWith, snapshotGroupWhereInput.nameNotEndsWith)
                && Objects.equals(this.nameNotIn, snapshotGroupWhereInput.nameNotIn)
                && Objects.equals(this.nameNotStartsWith, snapshotGroupWhereInput.nameNotStartsWith)
                && Objects.equals(this.nameStartsWith, snapshotGroupWhereInput.nameStartsWith)
                && Objects.equals(this.objectNum, snapshotGroupWhereInput.objectNum)
                && Objects.equals(this.objectNumGt, snapshotGroupWhereInput.objectNumGt)
                && Objects.equals(this.objectNumGte, snapshotGroupWhereInput.objectNumGte)
                && Objects.equals(this.objectNumIn, snapshotGroupWhereInput.objectNumIn)
                && Objects.equals(this.objectNumLt, snapshotGroupWhereInput.objectNumLt)
                && Objects.equals(this.objectNumLte, snapshotGroupWhereInput.objectNumLte)
                && Objects.equals(this.objectNumNot, snapshotGroupWhereInput.objectNumNot)
                && Objects.equals(this.objectNumNotIn, snapshotGroupWhereInput.objectNumNotIn)
                && Objects.equals(this.snapshotPlanTask, snapshotGroupWhereInput.snapshotPlanTask)
                && Objects.equals(this.vmSnapshotsEvery, snapshotGroupWhereInput.vmSnapshotsEvery)
                && Objects.equals(this.vmSnapshotsNone, snapshotGroupWhereInput.vmSnapshotsNone)
                && Objects.equals(this.vmSnapshotsSome, snapshotGroupWhereInput.vmSnapshotsSome);
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
                cluster,
                deleted,
                deletedNot,
                entityAsyncStatus,
                entityAsyncStatusIn,
                entityAsyncStatusNot,
                entityAsyncStatusNotIn,
                estimatedRecyclingTime,
                estimatedRecyclingTimeGt,
                estimatedRecyclingTimeGte,
                estimatedRecyclingTimeIn,
                estimatedRecyclingTimeLt,
                estimatedRecyclingTimeLte,
                estimatedRecyclingTimeNot,
                estimatedRecyclingTimeNotIn,
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
                internal,
                internalNot,
                keep,
                keepNot,
                localCreatedAt,
                localCreatedAtGt,
                localCreatedAtGte,
                localCreatedAtIn,
                localCreatedAtLt,
                localCreatedAtLte,
                localCreatedAtNot,
                localCreatedAtNotIn,
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
                logicalSizeBytes,
                logicalSizeBytesGt,
                logicalSizeBytesGte,
                logicalSizeBytesIn,
                logicalSizeBytesLt,
                logicalSizeBytesLte,
                logicalSizeBytesNot,
                logicalSizeBytesNotIn,
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
                objectNum,
                objectNumGt,
                objectNumGte,
                objectNumIn,
                objectNumLt,
                objectNumLte,
                objectNumNot,
                objectNumNotIn,
                snapshotPlanTask,
                vmSnapshotsEvery,
                vmSnapshotsNone,
                vmSnapshotsSome);
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
        sb.append("class SnapshotGroupWhereInput {\n");
        sb.append("    AND: ").append(toIndentedString(AND)).append("\n");
        sb.append("    NOT: ").append(toIndentedString(NOT)).append("\n");
        sb.append("    OR: ").append(toIndentedString(OR)).append("\n");
        sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
        sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
        sb.append("    deletedNot: ").append(toIndentedString(deletedNot)).append("\n");
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
        sb.append("    estimatedRecyclingTime: ")
                .append(toIndentedString(estimatedRecyclingTime))
                .append("\n");
        sb.append("    estimatedRecyclingTimeGt: ")
                .append(toIndentedString(estimatedRecyclingTimeGt))
                .append("\n");
        sb.append("    estimatedRecyclingTimeGte: ")
                .append(toIndentedString(estimatedRecyclingTimeGte))
                .append("\n");
        sb.append("    estimatedRecyclingTimeIn: ")
                .append(toIndentedString(estimatedRecyclingTimeIn))
                .append("\n");
        sb.append("    estimatedRecyclingTimeLt: ")
                .append(toIndentedString(estimatedRecyclingTimeLt))
                .append("\n");
        sb.append("    estimatedRecyclingTimeLte: ")
                .append(toIndentedString(estimatedRecyclingTimeLte))
                .append("\n");
        sb.append("    estimatedRecyclingTimeNot: ")
                .append(toIndentedString(estimatedRecyclingTimeNot))
                .append("\n");
        sb.append("    estimatedRecyclingTimeNotIn: ")
                .append(toIndentedString(estimatedRecyclingTimeNotIn))
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
        sb.append("    internal: ").append(toIndentedString(internal)).append("\n");
        sb.append("    internalNot: ").append(toIndentedString(internalNot)).append("\n");
        sb.append("    keep: ").append(toIndentedString(keep)).append("\n");
        sb.append("    keepNot: ").append(toIndentedString(keepNot)).append("\n");
        sb.append("    localCreatedAt: ").append(toIndentedString(localCreatedAt)).append("\n");
        sb.append("    localCreatedAtGt: ").append(toIndentedString(localCreatedAtGt)).append("\n");
        sb.append("    localCreatedAtGte: ")
                .append(toIndentedString(localCreatedAtGte))
                .append("\n");
        sb.append("    localCreatedAtIn: ").append(toIndentedString(localCreatedAtIn)).append("\n");
        sb.append("    localCreatedAtLt: ").append(toIndentedString(localCreatedAtLt)).append("\n");
        sb.append("    localCreatedAtLte: ")
                .append(toIndentedString(localCreatedAtLte))
                .append("\n");
        sb.append("    localCreatedAtNot: ")
                .append(toIndentedString(localCreatedAtNot))
                .append("\n");
        sb.append("    localCreatedAtNotIn: ")
                .append(toIndentedString(localCreatedAtNotIn))
                .append("\n");
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
        sb.append("    logicalSizeBytes: ").append(toIndentedString(logicalSizeBytes)).append("\n");
        sb.append("    logicalSizeBytesGt: ")
                .append(toIndentedString(logicalSizeBytesGt))
                .append("\n");
        sb.append("    logicalSizeBytesGte: ")
                .append(toIndentedString(logicalSizeBytesGte))
                .append("\n");
        sb.append("    logicalSizeBytesIn: ")
                .append(toIndentedString(logicalSizeBytesIn))
                .append("\n");
        sb.append("    logicalSizeBytesLt: ")
                .append(toIndentedString(logicalSizeBytesLt))
                .append("\n");
        sb.append("    logicalSizeBytesLte: ")
                .append(toIndentedString(logicalSizeBytesLte))
                .append("\n");
        sb.append("    logicalSizeBytesNot: ")
                .append(toIndentedString(logicalSizeBytesNot))
                .append("\n");
        sb.append("    logicalSizeBytesNotIn: ")
                .append(toIndentedString(logicalSizeBytesNotIn))
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
        sb.append("    objectNum: ").append(toIndentedString(objectNum)).append("\n");
        sb.append("    objectNumGt: ").append(toIndentedString(objectNumGt)).append("\n");
        sb.append("    objectNumGte: ").append(toIndentedString(objectNumGte)).append("\n");
        sb.append("    objectNumIn: ").append(toIndentedString(objectNumIn)).append("\n");
        sb.append("    objectNumLt: ").append(toIndentedString(objectNumLt)).append("\n");
        sb.append("    objectNumLte: ").append(toIndentedString(objectNumLte)).append("\n");
        sb.append("    objectNumNot: ").append(toIndentedString(objectNumNot)).append("\n");
        sb.append("    objectNumNotIn: ").append(toIndentedString(objectNumNotIn)).append("\n");
        sb.append("    snapshotPlanTask: ").append(toIndentedString(snapshotPlanTask)).append("\n");
        sb.append("    vmSnapshotsEvery: ").append(toIndentedString(vmSnapshotsEvery)).append("\n");
        sb.append("    vmSnapshotsNone: ").append(toIndentedString(vmSnapshotsNone)).append("\n");
        sb.append("    vmSnapshotsSome: ").append(toIndentedString(vmSnapshotsSome)).append("\n");
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

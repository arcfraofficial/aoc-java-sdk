package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** SnapshotGroup */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class SnapshotGroup extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_CLUSTER = "cluster";

    @SerializedName(SERIALIZED_NAME_CLUSTER)
    private NestedCluster cluster;

    public static final String SERIALIZED_NAME_DELETED = "deleted";

    @SerializedName(SERIALIZED_NAME_DELETED)
    private Boolean deleted;

    public static final String SERIALIZED_NAME_ENTITY_ASYNC_STATUS = "entityAsyncStatus";

    @SerializedName(SERIALIZED_NAME_ENTITY_ASYNC_STATUS)
    private EntityAsyncStatus entityAsyncStatus;

    public static final String SERIALIZED_NAME_ESTIMATED_RECYCLING_TIME =
            "estimated_recycling_time";

    @SerializedName(SERIALIZED_NAME_ESTIMATED_RECYCLING_TIME)
    private String estimatedRecyclingTime;

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

    public static final String SERIALIZED_NAME_INTERNAL = "internal";

    @SerializedName(SERIALIZED_NAME_INTERNAL)
    private Boolean internal;

    public static final String SERIALIZED_NAME_KEEP = "keep";

    @SerializedName(SERIALIZED_NAME_KEEP)
    private Boolean keep;

    public static final String SERIALIZED_NAME_LOCAL_CREATED_AT = "local_created_at";

    @SerializedName(SERIALIZED_NAME_LOCAL_CREATED_AT)
    private String localCreatedAt;

    public static final String SERIALIZED_NAME_LOCAL_ID = "local_id";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID)
    private String localId;

    public static final String SERIALIZED_NAME_LOGICAL_SIZE_BYTES = "logical_size_bytes";

    @SerializedName(SERIALIZED_NAME_LOGICAL_SIZE_BYTES)
    private Long logicalSizeBytes;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_OBJECT_NUM = "object_num";

    @SerializedName(SERIALIZED_NAME_OBJECT_NUM)
    private Integer objectNum;

    public static final String SERIALIZED_NAME_SNAPSHOT_PLAN_TASK = "snapshotPlanTask";

    @SerializedName(SERIALIZED_NAME_SNAPSHOT_PLAN_TASK)
    private NestedSnapshotPlanTask snapshotPlanTask;

    public static final String SERIALIZED_NAME_VM_INFO = "vm_info";

    @SerializedName(SERIALIZED_NAME_VM_INFO)
    private List<NestedSnapshotGroupVmInfo> vmInfo = new ArrayList<NestedSnapshotGroupVmInfo>();

    public static final String SERIALIZED_NAME_VM_SNAPSHOTS = "vm_snapshots";

    @SerializedName(SERIALIZED_NAME_VM_SNAPSHOTS)
    private List<NestedVmSnapshot> vmSnapshots = null;

    public SnapshotGroup() {}

    public SnapshotGroup cluster(NestedCluster cluster) {

        this.cluster = cluster;
        return this;
    }

    /**
     * Get cluster
     *
     * @return cluster
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public NestedCluster getCluster() {
        return cluster;
    }

    public void setCluster(NestedCluster cluster) {
        this.cluster = cluster;
    }

    public SnapshotGroup cluster_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER);
        return this;
    }

    public SnapshotGroup cluster_ExplictlyNonNull() {
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

    public SnapshotGroup deleted(Boolean deleted) {

        this.deleted = deleted;
        return this;
    }

    /**
     * Get deleted
     *
     * @return deleted
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public SnapshotGroup deleted_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DELETED);
        return this;
    }

    public SnapshotGroup deleted_ExplictlyNonNull() {
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

    public SnapshotGroup entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {

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

    public SnapshotGroup entityAsyncStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        return this;
    }

    public SnapshotGroup entityAsyncStatus_ExplictlyNonNull() {
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

    public SnapshotGroup estimatedRecyclingTime(String estimatedRecyclingTime) {

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

    public SnapshotGroup estimatedRecyclingTime_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ESTIMATED_RECYCLING_TIME);
        return this;
    }

    public SnapshotGroup estimatedRecyclingTime_ExplictlyNonNull() {
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

    public SnapshotGroup id(String id) {

        this.id = id;
        return this;
    }

    /**
     * Get id
     *
     * @return id
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public SnapshotGroup id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public SnapshotGroup id_ExplictlyNonNull() {
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

    public SnapshotGroup internal(Boolean internal) {

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

    public SnapshotGroup internal_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INTERNAL);
        return this;
    }

    public SnapshotGroup internal_ExplictlyNonNull() {
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

    public SnapshotGroup keep(Boolean keep) {

        this.keep = keep;
        return this;
    }

    /**
     * Get keep
     *
     * @return keep
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Boolean getKeep() {
        return keep;
    }

    public void setKeep(Boolean keep) {
        this.keep = keep;
    }

    public SnapshotGroup keep_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KEEP);
        return this;
    }

    public SnapshotGroup keep_ExplictlyNonNull() {
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

    public SnapshotGroup localCreatedAt(String localCreatedAt) {

        this.localCreatedAt = localCreatedAt;
        return this;
    }

    /**
     * Get localCreatedAt
     *
     * @return localCreatedAt
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getLocalCreatedAt() {
        return localCreatedAt;
    }

    public void setLocalCreatedAt(String localCreatedAt) {
        this.localCreatedAt = localCreatedAt;
    }

    public SnapshotGroup localCreatedAt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATED_AT);
        return this;
    }

    public SnapshotGroup localCreatedAt_ExplictlyNonNull() {
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

    public SnapshotGroup localId(String localId) {

        this.localId = localId;
        return this;
    }

    /**
     * Get localId
     *
     * @return localId
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getLocalId() {
        return localId;
    }

    public void setLocalId(String localId) {
        this.localId = localId;
    }

    public SnapshotGroup localId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID);
        return this;
    }

    public SnapshotGroup localId_ExplictlyNonNull() {
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

    public SnapshotGroup logicalSizeBytes(Long logicalSizeBytes) {

        this.logicalSizeBytes = logicalSizeBytes;
        return this;
    }

    /**
     * Get logicalSizeBytes
     *
     * @return logicalSizeBytes
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Long getLogicalSizeBytes() {
        return logicalSizeBytes;
    }

    public void setLogicalSizeBytes(Long logicalSizeBytes) {
        this.logicalSizeBytes = logicalSizeBytes;
    }

    public SnapshotGroup logicalSizeBytes_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOGICAL_SIZE_BYTES);
        return this;
    }

    public SnapshotGroup logicalSizeBytes_ExplictlyNonNull() {
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

    public SnapshotGroup name(String name) {

        this.name = name;
        return this;
    }

    /**
     * Get name
     *
     * @return name
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SnapshotGroup name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public SnapshotGroup name_ExplictlyNonNull() {
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

    public SnapshotGroup objectNum(Integer objectNum) {

        this.objectNum = objectNum;
        return this;
    }

    /**
     * Get objectNum
     *
     * @return objectNum
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Integer getObjectNum() {
        return objectNum;
    }

    public void setObjectNum(Integer objectNum) {
        this.objectNum = objectNum;
    }

    public SnapshotGroup objectNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_OBJECT_NUM);
        return this;
    }

    public SnapshotGroup objectNum_ExplictlyNonNull() {
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

    public SnapshotGroup snapshotPlanTask(NestedSnapshotPlanTask snapshotPlanTask) {

        this.snapshotPlanTask = snapshotPlanTask;
        return this;
    }

    /**
     * Get snapshotPlanTask
     *
     * @return snapshotPlanTask
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public NestedSnapshotPlanTask getSnapshotPlanTask() {
        return snapshotPlanTask;
    }

    public void setSnapshotPlanTask(NestedSnapshotPlanTask snapshotPlanTask) {
        this.snapshotPlanTask = snapshotPlanTask;
    }

    public SnapshotGroup snapshotPlanTask_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT_PLAN_TASK);
        return this;
    }

    public SnapshotGroup snapshotPlanTask_ExplictlyNonNull() {
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

    public SnapshotGroup vmInfo(List<NestedSnapshotGroupVmInfo> vmInfo) {

        this.vmInfo = vmInfo;
        return this;
    }

    public SnapshotGroup addVmInfoItem(NestedSnapshotGroupVmInfo vmInfoItem) {
        this.vmInfo.add(vmInfoItem);
        return this;
    }

    /**
     * Get vmInfo
     *
     * @return vmInfo
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public List<NestedSnapshotGroupVmInfo> getVmInfo() {
        return vmInfo;
    }

    public void setVmInfo(List<NestedSnapshotGroupVmInfo> vmInfo) {
        this.vmInfo = vmInfo;
    }

    public SnapshotGroup vmInfo_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_INFO);
        return this;
    }

    public SnapshotGroup vmInfo_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_INFO);
        return this;
    }

    public void setVmInfo_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_INFO);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_INFO);
        }
    }

    public boolean getVmInfo_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_INFO);
    }

    public SnapshotGroup vmSnapshots(List<NestedVmSnapshot> vmSnapshots) {

        this.vmSnapshots = vmSnapshots;
        return this;
    }

    public SnapshotGroup addVmSnapshotsItem(NestedVmSnapshot vmSnapshotsItem) {
        if (this.vmSnapshots == null) {
            this.vmSnapshots = new ArrayList<NestedVmSnapshot>();
        }
        this.vmSnapshots.add(vmSnapshotsItem);
        return this;
    }

    /**
     * Get vmSnapshots
     *
     * @return vmSnapshots
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedVmSnapshot> getVmSnapshots() {
        return vmSnapshots;
    }

    public void setVmSnapshots(List<NestedVmSnapshot> vmSnapshots) {
        this.vmSnapshots = vmSnapshots;
    }

    public SnapshotGroup vmSnapshots_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_SNAPSHOTS);
        return this;
    }

    public SnapshotGroup vmSnapshots_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_SNAPSHOTS);
        return this;
    }

    public void setVmSnapshots_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_SNAPSHOTS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_SNAPSHOTS);
        }
    }

    public boolean getVmSnapshots_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_SNAPSHOTS);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SnapshotGroup snapshotGroup = (SnapshotGroup) o;
        return Objects.equals(this.cluster, snapshotGroup.cluster)
                && Objects.equals(this.deleted, snapshotGroup.deleted)
                && Objects.equals(this.entityAsyncStatus, snapshotGroup.entityAsyncStatus)
                && Objects.equals(this.estimatedRecyclingTime, snapshotGroup.estimatedRecyclingTime)
                && Objects.equals(this.id, snapshotGroup.id)
                && Objects.equals(this.internal, snapshotGroup.internal)
                && Objects.equals(this.keep, snapshotGroup.keep)
                && Objects.equals(this.localCreatedAt, snapshotGroup.localCreatedAt)
                && Objects.equals(this.localId, snapshotGroup.localId)
                && Objects.equals(this.logicalSizeBytes, snapshotGroup.logicalSizeBytes)
                && Objects.equals(this.name, snapshotGroup.name)
                && Objects.equals(this.objectNum, snapshotGroup.objectNum)
                && Objects.equals(this.snapshotPlanTask, snapshotGroup.snapshotPlanTask)
                && Objects.equals(this.vmInfo, snapshotGroup.vmInfo)
                && Objects.equals(this.vmSnapshots, snapshotGroup.vmSnapshots);
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
                cluster,
                deleted,
                entityAsyncStatus,
                estimatedRecyclingTime,
                id,
                internal,
                keep,
                localCreatedAt,
                localId,
                logicalSizeBytes,
                name,
                objectNum,
                snapshotPlanTask,
                vmInfo,
                vmSnapshots);
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
        sb.append("class SnapshotGroup {\n");
        sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
        sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
        sb.append("    entityAsyncStatus: ")
                .append(toIndentedString(entityAsyncStatus))
                .append("\n");
        sb.append("    estimatedRecyclingTime: ")
                .append(toIndentedString(estimatedRecyclingTime))
                .append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    internal: ").append(toIndentedString(internal)).append("\n");
        sb.append("    keep: ").append(toIndentedString(keep)).append("\n");
        sb.append("    localCreatedAt: ").append(toIndentedString(localCreatedAt)).append("\n");
        sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
        sb.append("    logicalSizeBytes: ").append(toIndentedString(logicalSizeBytes)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    objectNum: ").append(toIndentedString(objectNum)).append("\n");
        sb.append("    snapshotPlanTask: ").append(toIndentedString(snapshotPlanTask)).append("\n");
        sb.append("    vmInfo: ").append(toIndentedString(vmInfo)).append("\n");
        sb.append("    vmSnapshots: ").append(toIndentedString(vmSnapshots)).append("\n");
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

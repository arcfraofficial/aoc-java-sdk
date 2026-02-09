package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Arrays;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** SnapshotPlanTask */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class SnapshotPlanTask extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_CLUSTER = "cluster";

    @SerializedName(SERIALIZED_NAME_CLUSTER)
    private NestedCluster cluster;

    public static final String SERIALIZED_NAME_END_TIME = "end_time";

    @SerializedName(SERIALIZED_NAME_END_TIME)
    private String endTime;

    public static final String SERIALIZED_NAME_ENTITY_ASYNC_STATUS = "entityAsyncStatus";

    @SerializedName(SERIALIZED_NAME_ENTITY_ASYNC_STATUS)
    private EntityAsyncStatus entityAsyncStatus;

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

    public static final String SERIALIZED_NAME_INTERNAL = "internal";

    @SerializedName(SERIALIZED_NAME_INTERNAL)
    private Boolean internal;

    public static final String SERIALIZED_NAME_LOCAL_ID = "local_id";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID)
    private String localId;

    public static final String SERIALIZED_NAME_SNAPSHOT_GROUP = "snapshotGroup";

    @SerializedName(SERIALIZED_NAME_SNAPSHOT_GROUP)
    private NestedSnapshotGroup snapshotGroup;

    public static final String SERIALIZED_NAME_SNAPSHOT_PLAN = "snapshotPlan";

    @SerializedName(SERIALIZED_NAME_SNAPSHOT_PLAN)
    private NestedSnapshotPlan snapshotPlan;

    public static final String SERIALIZED_NAME_START_TIME = "start_time";

    @SerializedName(SERIALIZED_NAME_START_TIME)
    private String startTime;

    public static final String SERIALIZED_NAME_STATUS = "status";

    @SerializedName(SERIALIZED_NAME_STATUS)
    private SnapshotPlanExecuteStatus status;

    public static final String SERIALIZED_NAME_TYPE = "type";

    @SerializedName(SERIALIZED_NAME_TYPE)
    private SnapshotPlanTaskType type;

    public SnapshotPlanTask() {}

    public SnapshotPlanTask cluster(NestedCluster cluster) {

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

    public SnapshotPlanTask cluster_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER);
        return this;
    }

    public SnapshotPlanTask cluster_ExplictlyNonNull() {
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

    public SnapshotPlanTask endTime(String endTime) {

        this.endTime = endTime;
        return this;
    }

    /**
     * Get endTime
     *
     * @return endTime
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public SnapshotPlanTask endTime_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_END_TIME);
        return this;
    }

    public SnapshotPlanTask endTime_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_END_TIME);
        return this;
    }

    public void setEndTime_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_END_TIME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_END_TIME);
        }
    }

    public boolean getEndTime_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_END_TIME);
    }

    public SnapshotPlanTask entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {

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

    public SnapshotPlanTask entityAsyncStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        return this;
    }

    public SnapshotPlanTask entityAsyncStatus_ExplictlyNonNull() {
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

    public SnapshotPlanTask id(String id) {

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

    public SnapshotPlanTask id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public SnapshotPlanTask id_ExplictlyNonNull() {
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

    public SnapshotPlanTask internal(Boolean internal) {

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

    public SnapshotPlanTask internal_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INTERNAL);
        return this;
    }

    public SnapshotPlanTask internal_ExplictlyNonNull() {
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

    public SnapshotPlanTask localId(String localId) {

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

    public SnapshotPlanTask localId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID);
        return this;
    }

    public SnapshotPlanTask localId_ExplictlyNonNull() {
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

    public SnapshotPlanTask snapshotGroup(NestedSnapshotGroup snapshotGroup) {

        this.snapshotGroup = snapshotGroup;
        return this;
    }

    /**
     * Get snapshotGroup
     *
     * @return snapshotGroup
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NestedSnapshotGroup getSnapshotGroup() {
        return snapshotGroup;
    }

    public void setSnapshotGroup(NestedSnapshotGroup snapshotGroup) {
        this.snapshotGroup = snapshotGroup;
    }

    public SnapshotPlanTask snapshotGroup_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT_GROUP);
        return this;
    }

    public SnapshotPlanTask snapshotGroup_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SNAPSHOT_GROUP);
        return this;
    }

    public void setSnapshotGroup_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT_GROUP);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SNAPSHOT_GROUP);
        }
    }

    public boolean getSnapshotGroup_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SNAPSHOT_GROUP);
    }

    public SnapshotPlanTask snapshotPlan(NestedSnapshotPlan snapshotPlan) {

        this.snapshotPlan = snapshotPlan;
        return this;
    }

    /**
     * Get snapshotPlan
     *
     * @return snapshotPlan
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public NestedSnapshotPlan getSnapshotPlan() {
        return snapshotPlan;
    }

    public void setSnapshotPlan(NestedSnapshotPlan snapshotPlan) {
        this.snapshotPlan = snapshotPlan;
    }

    public SnapshotPlanTask snapshotPlan_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT_PLAN);
        return this;
    }

    public SnapshotPlanTask snapshotPlan_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SNAPSHOT_PLAN);
        return this;
    }

    public void setSnapshotPlan_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT_PLAN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SNAPSHOT_PLAN);
        }
    }

    public boolean getSnapshotPlan_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SNAPSHOT_PLAN);
    }

    public SnapshotPlanTask startTime(String startTime) {

        this.startTime = startTime;
        return this;
    }

    /**
     * Get startTime
     *
     * @return startTime
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public SnapshotPlanTask startTime_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_START_TIME);
        return this;
    }

    public SnapshotPlanTask startTime_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_START_TIME);
        return this;
    }

    public void setStartTime_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_START_TIME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_START_TIME);
        }
    }

    public boolean getStartTime_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_START_TIME);
    }

    public SnapshotPlanTask status(SnapshotPlanExecuteStatus status) {

        this.status = status;
        return this;
    }

    /**
     * Get status
     *
     * @return status
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public SnapshotPlanExecuteStatus getStatus() {
        return status;
    }

    public void setStatus(SnapshotPlanExecuteStatus status) {
        this.status = status;
    }

    public SnapshotPlanTask status_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATUS);
        return this;
    }

    public SnapshotPlanTask status_ExplictlyNonNull() {
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

    public SnapshotPlanTask type(SnapshotPlanTaskType type) {

        this.type = type;
        return this;
    }

    /**
     * Get type
     *
     * @return type
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public SnapshotPlanTaskType getType() {
        return type;
    }

    public void setType(SnapshotPlanTaskType type) {
        this.type = type;
    }

    public SnapshotPlanTask type_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE);
        return this;
    }

    public SnapshotPlanTask type_ExplictlyNonNull() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SnapshotPlanTask snapshotPlanTask = (SnapshotPlanTask) o;
        return Objects.equals(this.cluster, snapshotPlanTask.cluster)
                && Objects.equals(this.endTime, snapshotPlanTask.endTime)
                && Objects.equals(this.entityAsyncStatus, snapshotPlanTask.entityAsyncStatus)
                && Objects.equals(this.id, snapshotPlanTask.id)
                && Objects.equals(this.internal, snapshotPlanTask.internal)
                && Objects.equals(this.localId, snapshotPlanTask.localId)
                && Objects.equals(this.snapshotGroup, snapshotPlanTask.snapshotGroup)
                && Objects.equals(this.snapshotPlan, snapshotPlanTask.snapshotPlan)
                && Objects.equals(this.startTime, snapshotPlanTask.startTime)
                && Objects.equals(this.status, snapshotPlanTask.status)
                && Objects.equals(this.type, snapshotPlanTask.type);
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
                endTime,
                entityAsyncStatus,
                id,
                internal,
                localId,
                snapshotGroup,
                snapshotPlan,
                startTime,
                status,
                type);
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
        sb.append("class SnapshotPlanTask {\n");
        sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    entityAsyncStatus: ")
                .append(toIndentedString(entityAsyncStatus))
                .append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    internal: ").append(toIndentedString(internal)).append("\n");
        sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
        sb.append("    snapshotGroup: ").append(toIndentedString(snapshotGroup)).append("\n");
        sb.append("    snapshotPlan: ").append(toIndentedString(snapshotPlan)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** ConsistencyGroupSnapshot */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class ConsistencyGroupSnapshot
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_ISCSI_LUN_SNAPSHOTS = "Iscsi_lun_snapshots";

    @SerializedName(SERIALIZED_NAME_ISCSI_LUN_SNAPSHOTS)
    private List<NestedIscsiLunSnapshot> iscsiLunSnapshots = null;

    public static final String SERIALIZED_NAME_CONSISTENCY_GROUP = "consistency_group";

    @SerializedName(SERIALIZED_NAME_CONSISTENCY_GROUP)
    private NestedConsistencyGroup consistencyGroup;

    public static final String SERIALIZED_NAME_ENTITY_ASYNC_STATUS = "entityAsyncStatus";

    @SerializedName(SERIALIZED_NAME_ENTITY_ASYNC_STATUS)
    private EntityAsyncStatus entityAsyncStatus;

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

    public static final String SERIALIZED_NAME_LABELS = "labels";

    @SerializedName(SERIALIZED_NAME_LABELS)
    private List<NestedLabel> labels = null;

    public static final String SERIALIZED_NAME_LOCAL_CREATED_AT = "local_created_at";

    @SerializedName(SERIALIZED_NAME_LOCAL_CREATED_AT)
    private String localCreatedAt;

    public static final String SERIALIZED_NAME_LOCAL_ID = "local_id";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID)
    private String localId;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_NVMF_NAMESPACE_SNAPSHOTS =
            "nvmf_namespace_snapshots";

    @SerializedName(SERIALIZED_NAME_NVMF_NAMESPACE_SNAPSHOTS)
    private List<NestedNvmfNamespaceSnapshot> nvmfNamespaceSnapshots = null;

    public static final String SERIALIZED_NAME_UNIQUE_SIZE = "unique_size";

    @SerializedName(SERIALIZED_NAME_UNIQUE_SIZE)
    private Long uniqueSize;

    public ConsistencyGroupSnapshot() {}

    public ConsistencyGroupSnapshot iscsiLunSnapshots(
            List<NestedIscsiLunSnapshot> iscsiLunSnapshots) {

        this.iscsiLunSnapshots = iscsiLunSnapshots;
        return this;
    }

    public ConsistencyGroupSnapshot addIscsiLunSnapshotsItem(
            NestedIscsiLunSnapshot iscsiLunSnapshotsItem) {
        if (this.iscsiLunSnapshots == null) {
            this.iscsiLunSnapshots = new ArrayList<NestedIscsiLunSnapshot>();
        }
        this.iscsiLunSnapshots.add(iscsiLunSnapshotsItem);
        return this;
    }

    /**
     * Get iscsiLunSnapshots
     *
     * @return iscsiLunSnapshots
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedIscsiLunSnapshot> getIscsiLunSnapshots() {
        return iscsiLunSnapshots;
    }

    public void setIscsiLunSnapshots(List<NestedIscsiLunSnapshot> iscsiLunSnapshots) {
        this.iscsiLunSnapshots = iscsiLunSnapshots;
    }

    public ConsistencyGroupSnapshot iscsiLunSnapshots_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_LUN_SNAPSHOTS);
        return this;
    }

    public ConsistencyGroupSnapshot iscsiLunSnapshots_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_LUN_SNAPSHOTS);
        return this;
    }

    public void setIscsiLunSnapshots_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_LUN_SNAPSHOTS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_LUN_SNAPSHOTS);
        }
    }

    public boolean getIscsiLunSnapshots_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_LUN_SNAPSHOTS);
    }

    public ConsistencyGroupSnapshot consistencyGroup(NestedConsistencyGroup consistencyGroup) {

        this.consistencyGroup = consistencyGroup;
        return this;
    }

    /**
     * Get consistencyGroup
     *
     * @return consistencyGroup
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NestedConsistencyGroup getConsistencyGroup() {
        return consistencyGroup;
    }

    public void setConsistencyGroup(NestedConsistencyGroup consistencyGroup) {
        this.consistencyGroup = consistencyGroup;
    }

    public ConsistencyGroupSnapshot consistencyGroup_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CONSISTENCY_GROUP);
        return this;
    }

    public ConsistencyGroupSnapshot consistencyGroup_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CONSISTENCY_GROUP);
        return this;
    }

    public void setConsistencyGroup_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CONSISTENCY_GROUP);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CONSISTENCY_GROUP);
        }
    }

    public boolean getConsistencyGroup_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CONSISTENCY_GROUP);
    }

    public ConsistencyGroupSnapshot entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {

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

    public ConsistencyGroupSnapshot entityAsyncStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        return this;
    }

    public ConsistencyGroupSnapshot entityAsyncStatus_ExplictlyNonNull() {
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

    public ConsistencyGroupSnapshot id(String id) {

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

    public ConsistencyGroupSnapshot id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public ConsistencyGroupSnapshot id_ExplictlyNonNull() {
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

    public ConsistencyGroupSnapshot labels(List<NestedLabel> labels) {

        this.labels = labels;
        return this;
    }

    public ConsistencyGroupSnapshot addLabelsItem(NestedLabel labelsItem) {
        if (this.labels == null) {
            this.labels = new ArrayList<NestedLabel>();
        }
        this.labels.add(labelsItem);
        return this;
    }

    /**
     * Get labels
     *
     * @return labels
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedLabel> getLabels() {
        return labels;
    }

    public void setLabels(List<NestedLabel> labels) {
        this.labels = labels;
    }

    public ConsistencyGroupSnapshot labels_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LABELS);
        return this;
    }

    public ConsistencyGroupSnapshot labels_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LABELS);
        return this;
    }

    public void setLabels_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LABELS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LABELS);
        }
    }

    public boolean getLabels_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LABELS);
    }

    public ConsistencyGroupSnapshot localCreatedAt(String localCreatedAt) {

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

    public ConsistencyGroupSnapshot localCreatedAt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATED_AT);
        return this;
    }

    public ConsistencyGroupSnapshot localCreatedAt_ExplictlyNonNull() {
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

    public ConsistencyGroupSnapshot localId(String localId) {

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

    public ConsistencyGroupSnapshot localId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID);
        return this;
    }

    public ConsistencyGroupSnapshot localId_ExplictlyNonNull() {
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

    public ConsistencyGroupSnapshot name(String name) {

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

    public ConsistencyGroupSnapshot name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public ConsistencyGroupSnapshot name_ExplictlyNonNull() {
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

    public ConsistencyGroupSnapshot nvmfNamespaceSnapshots(
            List<NestedNvmfNamespaceSnapshot> nvmfNamespaceSnapshots) {

        this.nvmfNamespaceSnapshots = nvmfNamespaceSnapshots;
        return this;
    }

    public ConsistencyGroupSnapshot addNvmfNamespaceSnapshotsItem(
            NestedNvmfNamespaceSnapshot nvmfNamespaceSnapshotsItem) {
        if (this.nvmfNamespaceSnapshots == null) {
            this.nvmfNamespaceSnapshots = new ArrayList<NestedNvmfNamespaceSnapshot>();
        }
        this.nvmfNamespaceSnapshots.add(nvmfNamespaceSnapshotsItem);
        return this;
    }

    /**
     * Get nvmfNamespaceSnapshots
     *
     * @return nvmfNamespaceSnapshots
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedNvmfNamespaceSnapshot> getNvmfNamespaceSnapshots() {
        return nvmfNamespaceSnapshots;
    }

    public void setNvmfNamespaceSnapshots(
            List<NestedNvmfNamespaceSnapshot> nvmfNamespaceSnapshots) {
        this.nvmfNamespaceSnapshots = nvmfNamespaceSnapshots;
    }

    public ConsistencyGroupSnapshot nvmfNamespaceSnapshots_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NVMF_NAMESPACE_SNAPSHOTS);
        return this;
    }

    public ConsistencyGroupSnapshot nvmfNamespaceSnapshots_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NVMF_NAMESPACE_SNAPSHOTS);
        return this;
    }

    public void setNvmfNamespaceSnapshots_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NVMF_NAMESPACE_SNAPSHOTS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NVMF_NAMESPACE_SNAPSHOTS);
        }
    }

    public boolean getNvmfNamespaceSnapshots_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NVMF_NAMESPACE_SNAPSHOTS);
    }

    public ConsistencyGroupSnapshot uniqueSize(Long uniqueSize) {

        this.uniqueSize = uniqueSize;
        return this;
    }

    /**
     * Get uniqueSize
     *
     * @return uniqueSize
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Long getUniqueSize() {
        return uniqueSize;
    }

    public void setUniqueSize(Long uniqueSize) {
        this.uniqueSize = uniqueSize;
    }

    public ConsistencyGroupSnapshot uniqueSize_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UNIQUE_SIZE);
        return this;
    }

    public ConsistencyGroupSnapshot uniqueSize_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UNIQUE_SIZE);
        return this;
    }

    public void setUniqueSize_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UNIQUE_SIZE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UNIQUE_SIZE);
        }
    }

    public boolean getUniqueSize_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UNIQUE_SIZE);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ConsistencyGroupSnapshot consistencyGroupSnapshot = (ConsistencyGroupSnapshot) o;
        return Objects.equals(this.iscsiLunSnapshots, consistencyGroupSnapshot.iscsiLunSnapshots)
                && Objects.equals(this.consistencyGroup, consistencyGroupSnapshot.consistencyGroup)
                && Objects.equals(
                        this.entityAsyncStatus, consistencyGroupSnapshot.entityAsyncStatus)
                && Objects.equals(this.id, consistencyGroupSnapshot.id)
                && Objects.equals(this.labels, consistencyGroupSnapshot.labels)
                && Objects.equals(this.localCreatedAt, consistencyGroupSnapshot.localCreatedAt)
                && Objects.equals(this.localId, consistencyGroupSnapshot.localId)
                && Objects.equals(this.name, consistencyGroupSnapshot.name)
                && Objects.equals(
                        this.nvmfNamespaceSnapshots,
                        consistencyGroupSnapshot.nvmfNamespaceSnapshots)
                && Objects.equals(this.uniqueSize, consistencyGroupSnapshot.uniqueSize);
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
                iscsiLunSnapshots,
                consistencyGroup,
                entityAsyncStatus,
                id,
                labels,
                localCreatedAt,
                localId,
                name,
                nvmfNamespaceSnapshots,
                uniqueSize);
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
        sb.append("class ConsistencyGroupSnapshot {\n");
        sb.append("    iscsiLunSnapshots: ")
                .append(toIndentedString(iscsiLunSnapshots))
                .append("\n");
        sb.append("    consistencyGroup: ").append(toIndentedString(consistencyGroup)).append("\n");
        sb.append("    entityAsyncStatus: ")
                .append(toIndentedString(entityAsyncStatus))
                .append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    localCreatedAt: ").append(toIndentedString(localCreatedAt)).append("\n");
        sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    nvmfNamespaceSnapshots: ")
                .append(toIndentedString(nvmfNamespaceSnapshots))
                .append("\n");
        sb.append("    uniqueSize: ").append(toIndentedString(uniqueSize)).append("\n");
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

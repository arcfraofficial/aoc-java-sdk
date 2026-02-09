package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** NvmfNamespaceSnapshot */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class NvmfNamespaceSnapshot
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_CONSISTENCY_GROUP_SNAPSHOT =
            "consistency_group_snapshot";

    @SerializedName(SERIALIZED_NAME_CONSISTENCY_GROUP_SNAPSHOT)
    private NestedConsistencyGroupSnapshot consistencyGroupSnapshot;

    public static final String SERIALIZED_NAME_EC_K = "ec_k";

    @SerializedName(SERIALIZED_NAME_EC_K)
    private Integer ecK;

    public static final String SERIALIZED_NAME_EC_M = "ec_m";

    @SerializedName(SERIALIZED_NAME_EC_M)
    private Integer ecM;

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

    public static final String SERIALIZED_NAME_NVMF_NAMESPACE = "nvmf_namespace";

    @SerializedName(SERIALIZED_NAME_NVMF_NAMESPACE)
    private NestedNvmfNamespace nvmfNamespace;

    public static final String SERIALIZED_NAME_NVMF_SUBSYSTEM = "nvmf_subsystem";

    @SerializedName(SERIALIZED_NAME_NVMF_SUBSYSTEM)
    private NestedNvmfSubsystem nvmfSubsystem;

    public static final String SERIALIZED_NAME_RESILIENCY_TYPE = "resiliency_type";

    @SerializedName(SERIALIZED_NAME_RESILIENCY_TYPE)
    private ResiliencyType resiliencyType;

    public static final String SERIALIZED_NAME_SNAPSHOT_GROUP = "snapshot_group";

    @SerializedName(SERIALIZED_NAME_SNAPSHOT_GROUP)
    private NestedSnapshotGroup snapshotGroup;

    public static final String SERIALIZED_NAME_UNIQUE_SIZE = "unique_size";

    @SerializedName(SERIALIZED_NAME_UNIQUE_SIZE)
    private Long uniqueSize;

    public NvmfNamespaceSnapshot() {}

    public NvmfNamespaceSnapshot consistencyGroupSnapshot(
            NestedConsistencyGroupSnapshot consistencyGroupSnapshot) {

        this.consistencyGroupSnapshot = consistencyGroupSnapshot;
        return this;
    }

    /**
     * Get consistencyGroupSnapshot
     *
     * @return consistencyGroupSnapshot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NestedConsistencyGroupSnapshot getConsistencyGroupSnapshot() {
        return consistencyGroupSnapshot;
    }

    public void setConsistencyGroupSnapshot(
            NestedConsistencyGroupSnapshot consistencyGroupSnapshot) {
        this.consistencyGroupSnapshot = consistencyGroupSnapshot;
    }

    public NvmfNamespaceSnapshot consistencyGroupSnapshot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CONSISTENCY_GROUP_SNAPSHOT);
        return this;
    }

    public NvmfNamespaceSnapshot consistencyGroupSnapshot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CONSISTENCY_GROUP_SNAPSHOT);
        return this;
    }

    public void setConsistencyGroupSnapshot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CONSISTENCY_GROUP_SNAPSHOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CONSISTENCY_GROUP_SNAPSHOT);
        }
    }

    public boolean getConsistencyGroupSnapshot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CONSISTENCY_GROUP_SNAPSHOT);
    }

    public NvmfNamespaceSnapshot ecK(Integer ecK) {

        this.ecK = ecK;
        return this;
    }

    /**
     * Get ecK
     *
     * @return ecK
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getEcK() {
        return ecK;
    }

    public void setEcK(Integer ecK) {
        this.ecK = ecK;
    }

    public NvmfNamespaceSnapshot ecK_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EC_K);
        return this;
    }

    public NvmfNamespaceSnapshot ecK_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EC_K);
        return this;
    }

    public void setEcK_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EC_K);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EC_K);
        }
    }

    public boolean getEcK_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EC_K);
    }

    public NvmfNamespaceSnapshot ecM(Integer ecM) {

        this.ecM = ecM;
        return this;
    }

    /**
     * Get ecM
     *
     * @return ecM
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getEcM() {
        return ecM;
    }

    public void setEcM(Integer ecM) {
        this.ecM = ecM;
    }

    public NvmfNamespaceSnapshot ecM_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EC_M);
        return this;
    }

    public NvmfNamespaceSnapshot ecM_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EC_M);
        return this;
    }

    public void setEcM_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EC_M);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EC_M);
        }
    }

    public boolean getEcM_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EC_M);
    }

    public NvmfNamespaceSnapshot entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {

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

    public NvmfNamespaceSnapshot entityAsyncStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        return this;
    }

    public NvmfNamespaceSnapshot entityAsyncStatus_ExplictlyNonNull() {
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

    public NvmfNamespaceSnapshot id(String id) {

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

    public NvmfNamespaceSnapshot id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public NvmfNamespaceSnapshot id_ExplictlyNonNull() {
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

    public NvmfNamespaceSnapshot labels(List<NestedLabel> labels) {

        this.labels = labels;
        return this;
    }

    public NvmfNamespaceSnapshot addLabelsItem(NestedLabel labelsItem) {
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

    public NvmfNamespaceSnapshot labels_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LABELS);
        return this;
    }

    public NvmfNamespaceSnapshot labels_ExplictlyNonNull() {
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

    public NvmfNamespaceSnapshot localCreatedAt(String localCreatedAt) {

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

    public NvmfNamespaceSnapshot localCreatedAt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATED_AT);
        return this;
    }

    public NvmfNamespaceSnapshot localCreatedAt_ExplictlyNonNull() {
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

    public NvmfNamespaceSnapshot localId(String localId) {

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

    public NvmfNamespaceSnapshot localId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID);
        return this;
    }

    public NvmfNamespaceSnapshot localId_ExplictlyNonNull() {
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

    public NvmfNamespaceSnapshot name(String name) {

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

    public NvmfNamespaceSnapshot name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public NvmfNamespaceSnapshot name_ExplictlyNonNull() {
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

    public NvmfNamespaceSnapshot nvmfNamespace(NestedNvmfNamespace nvmfNamespace) {

        this.nvmfNamespace = nvmfNamespace;
        return this;
    }

    /**
     * Get nvmfNamespace
     *
     * @return nvmfNamespace
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NestedNvmfNamespace getNvmfNamespace() {
        return nvmfNamespace;
    }

    public void setNvmfNamespace(NestedNvmfNamespace nvmfNamespace) {
        this.nvmfNamespace = nvmfNamespace;
    }

    public NvmfNamespaceSnapshot nvmfNamespace_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NVMF_NAMESPACE);
        return this;
    }

    public NvmfNamespaceSnapshot nvmfNamespace_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NVMF_NAMESPACE);
        return this;
    }

    public void setNvmfNamespace_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NVMF_NAMESPACE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NVMF_NAMESPACE);
        }
    }

    public boolean getNvmfNamespace_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NVMF_NAMESPACE);
    }

    public NvmfNamespaceSnapshot nvmfSubsystem(NestedNvmfSubsystem nvmfSubsystem) {

        this.nvmfSubsystem = nvmfSubsystem;
        return this;
    }

    /**
     * Get nvmfSubsystem
     *
     * @return nvmfSubsystem
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public NestedNvmfSubsystem getNvmfSubsystem() {
        return nvmfSubsystem;
    }

    public void setNvmfSubsystem(NestedNvmfSubsystem nvmfSubsystem) {
        this.nvmfSubsystem = nvmfSubsystem;
    }

    public NvmfNamespaceSnapshot nvmfSubsystem_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NVMF_SUBSYSTEM);
        return this;
    }

    public NvmfNamespaceSnapshot nvmfSubsystem_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NVMF_SUBSYSTEM);
        return this;
    }

    public void setNvmfSubsystem_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NVMF_SUBSYSTEM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NVMF_SUBSYSTEM);
        }
    }

    public boolean getNvmfSubsystem_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NVMF_SUBSYSTEM);
    }

    public NvmfNamespaceSnapshot resiliencyType(ResiliencyType resiliencyType) {

        this.resiliencyType = resiliencyType;
        return this;
    }

    /**
     * Get resiliencyType
     *
     * @return resiliencyType
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ResiliencyType getResiliencyType() {
        return resiliencyType;
    }

    public void setResiliencyType(ResiliencyType resiliencyType) {
        this.resiliencyType = resiliencyType;
    }

    public NvmfNamespaceSnapshot resiliencyType_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESILIENCY_TYPE);
        return this;
    }

    public NvmfNamespaceSnapshot resiliencyType_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESILIENCY_TYPE);
        return this;
    }

    public void setResiliencyType_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESILIENCY_TYPE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESILIENCY_TYPE);
        }
    }

    public boolean getResiliencyType_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESILIENCY_TYPE);
    }

    public NvmfNamespaceSnapshot snapshotGroup(NestedSnapshotGroup snapshotGroup) {

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

    public NvmfNamespaceSnapshot snapshotGroup_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT_GROUP);
        return this;
    }

    public NvmfNamespaceSnapshot snapshotGroup_ExplictlyNonNull() {
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

    public NvmfNamespaceSnapshot uniqueSize(Long uniqueSize) {

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

    public NvmfNamespaceSnapshot uniqueSize_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UNIQUE_SIZE);
        return this;
    }

    public NvmfNamespaceSnapshot uniqueSize_ExplictlyNonNull() {
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
        NvmfNamespaceSnapshot nvmfNamespaceSnapshot = (NvmfNamespaceSnapshot) o;
        return Objects.equals(
                        this.consistencyGroupSnapshot,
                        nvmfNamespaceSnapshot.consistencyGroupSnapshot)
                && Objects.equals(this.ecK, nvmfNamespaceSnapshot.ecK)
                && Objects.equals(this.ecM, nvmfNamespaceSnapshot.ecM)
                && Objects.equals(this.entityAsyncStatus, nvmfNamespaceSnapshot.entityAsyncStatus)
                && Objects.equals(this.id, nvmfNamespaceSnapshot.id)
                && Objects.equals(this.labels, nvmfNamespaceSnapshot.labels)
                && Objects.equals(this.localCreatedAt, nvmfNamespaceSnapshot.localCreatedAt)
                && Objects.equals(this.localId, nvmfNamespaceSnapshot.localId)
                && Objects.equals(this.name, nvmfNamespaceSnapshot.name)
                && Objects.equals(this.nvmfNamespace, nvmfNamespaceSnapshot.nvmfNamespace)
                && Objects.equals(this.nvmfSubsystem, nvmfNamespaceSnapshot.nvmfSubsystem)
                && Objects.equals(this.resiliencyType, nvmfNamespaceSnapshot.resiliencyType)
                && Objects.equals(this.snapshotGroup, nvmfNamespaceSnapshot.snapshotGroup)
                && Objects.equals(this.uniqueSize, nvmfNamespaceSnapshot.uniqueSize);
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
                consistencyGroupSnapshot,
                ecK,
                ecM,
                entityAsyncStatus,
                id,
                labels,
                localCreatedAt,
                localId,
                name,
                nvmfNamespace,
                nvmfSubsystem,
                resiliencyType,
                snapshotGroup,
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
        sb.append("class NvmfNamespaceSnapshot {\n");
        sb.append("    consistencyGroupSnapshot: ")
                .append(toIndentedString(consistencyGroupSnapshot))
                .append("\n");
        sb.append("    ecK: ").append(toIndentedString(ecK)).append("\n");
        sb.append("    ecM: ").append(toIndentedString(ecM)).append("\n");
        sb.append("    entityAsyncStatus: ")
                .append(toIndentedString(entityAsyncStatus))
                .append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    localCreatedAt: ").append(toIndentedString(localCreatedAt)).append("\n");
        sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    nvmfNamespace: ").append(toIndentedString(nvmfNamespace)).append("\n");
        sb.append("    nvmfSubsystem: ").append(toIndentedString(nvmfSubsystem)).append("\n");
        sb.append("    resiliencyType: ").append(toIndentedString(resiliencyType)).append("\n");
        sb.append("    snapshotGroup: ").append(toIndentedString(snapshotGroup)).append("\n");
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

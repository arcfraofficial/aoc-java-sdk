package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** NvmfNamespaceCloneParams */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class NvmfNamespaceCloneParams
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_NAMESPACE_GROUP_ID = "namespace_group_id";

    @SerializedName(SERIALIZED_NAME_NAMESPACE_GROUP_ID)
    private String namespaceGroupId;

    public static final String SERIALIZED_NAME_NVMF_SUBSYSTEM_ID = "nvmf_subsystem_id";

    @SerializedName(SERIALIZED_NAME_NVMF_SUBSYSTEM_ID)
    private String nvmfSubsystemId;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_SNAPSHOT_ID = "snapshot_id";

    @SerializedName(SERIALIZED_NAME_SNAPSHOT_ID)
    private String snapshotId;

    public NvmfNamespaceCloneParams() {}

    public NvmfNamespaceCloneParams namespaceGroupId(String namespaceGroupId) {

        this.namespaceGroupId = namespaceGroupId;
        return this;
    }

    /**
     * Get namespaceGroupId
     *
     * @return namespaceGroupId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNamespaceGroupId() {
        return namespaceGroupId;
    }

    public void setNamespaceGroupId(String namespaceGroupId) {
        this.namespaceGroupId = namespaceGroupId;
    }

    public NvmfNamespaceCloneParams namespaceGroupId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAMESPACE_GROUP_ID);
        return this;
    }

    public NvmfNamespaceCloneParams namespaceGroupId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAMESPACE_GROUP_ID);
        return this;
    }

    public void setNamespaceGroupId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAMESPACE_GROUP_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAMESPACE_GROUP_ID);
        }
    }

    public boolean getNamespaceGroupId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAMESPACE_GROUP_ID);
    }

    public NvmfNamespaceCloneParams nvmfSubsystemId(String nvmfSubsystemId) {

        this.nvmfSubsystemId = nvmfSubsystemId;
        return this;
    }

    /**
     * Get nvmfSubsystemId
     *
     * @return nvmfSubsystemId
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getNvmfSubsystemId() {
        return nvmfSubsystemId;
    }

    public void setNvmfSubsystemId(String nvmfSubsystemId) {
        this.nvmfSubsystemId = nvmfSubsystemId;
    }

    public NvmfNamespaceCloneParams nvmfSubsystemId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NVMF_SUBSYSTEM_ID);
        return this;
    }

    public NvmfNamespaceCloneParams nvmfSubsystemId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NVMF_SUBSYSTEM_ID);
        return this;
    }

    public void setNvmfSubsystemId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NVMF_SUBSYSTEM_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NVMF_SUBSYSTEM_ID);
        }
    }

    public boolean getNvmfSubsystemId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NVMF_SUBSYSTEM_ID);
    }

    public NvmfNamespaceCloneParams name(String name) {

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

    public NvmfNamespaceCloneParams name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public NvmfNamespaceCloneParams name_ExplictlyNonNull() {
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

    public NvmfNamespaceCloneParams snapshotId(String snapshotId) {

        this.snapshotId = snapshotId;
        return this;
    }

    /**
     * Get snapshotId
     *
     * @return snapshotId
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getSnapshotId() {
        return snapshotId;
    }

    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }

    public NvmfNamespaceCloneParams snapshotId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT_ID);
        return this;
    }

    public NvmfNamespaceCloneParams snapshotId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SNAPSHOT_ID);
        return this;
    }

    public void setSnapshotId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SNAPSHOT_ID);
        }
    }

    public boolean getSnapshotId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SNAPSHOT_ID);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NvmfNamespaceCloneParams nvmfNamespaceCloneParams = (NvmfNamespaceCloneParams) o;
        return Objects.equals(this.namespaceGroupId, nvmfNamespaceCloneParams.namespaceGroupId)
                && Objects.equals(this.nvmfSubsystemId, nvmfNamespaceCloneParams.nvmfSubsystemId)
                && Objects.equals(this.name, nvmfNamespaceCloneParams.name)
                && Objects.equals(this.snapshotId, nvmfNamespaceCloneParams.snapshotId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(namespaceGroupId, nvmfSubsystemId, name, snapshotId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NvmfNamespaceCloneParams {\n");
        sb.append("    namespaceGroupId: ").append(toIndentedString(namespaceGroupId)).append("\n");
        sb.append("    nvmfSubsystemId: ").append(toIndentedString(nvmfSubsystemId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    snapshotId: ").append(toIndentedString(snapshotId)).append("\n");
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

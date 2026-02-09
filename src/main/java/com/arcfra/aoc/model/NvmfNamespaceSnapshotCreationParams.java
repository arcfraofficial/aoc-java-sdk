package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** NvmfNamespaceSnapshotCreationParams */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class NvmfNamespaceSnapshotCreationParams
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_NVMF_SUBSYSTEM_ID = "nvmf_subsystem_id";

    @SerializedName(SERIALIZED_NAME_NVMF_SUBSYSTEM_ID)
    private String nvmfSubsystemId;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_NVMF_NAMESPACE_ID = "nvmf_namespace_id";

    @SerializedName(SERIALIZED_NAME_NVMF_NAMESPACE_ID)
    private String nvmfNamespaceId;

    public NvmfNamespaceSnapshotCreationParams() {}

    public NvmfNamespaceSnapshotCreationParams nvmfSubsystemId(String nvmfSubsystemId) {

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

    public NvmfNamespaceSnapshotCreationParams nvmfSubsystemId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NVMF_SUBSYSTEM_ID);
        return this;
    }

    public NvmfNamespaceSnapshotCreationParams nvmfSubsystemId_ExplictlyNonNull() {
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

    public NvmfNamespaceSnapshotCreationParams name(String name) {

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

    public NvmfNamespaceSnapshotCreationParams name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public NvmfNamespaceSnapshotCreationParams name_ExplictlyNonNull() {
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

    public NvmfNamespaceSnapshotCreationParams nvmfNamespaceId(String nvmfNamespaceId) {

        this.nvmfNamespaceId = nvmfNamespaceId;
        return this;
    }

    /**
     * Get nvmfNamespaceId
     *
     * @return nvmfNamespaceId
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getNvmfNamespaceId() {
        return nvmfNamespaceId;
    }

    public void setNvmfNamespaceId(String nvmfNamespaceId) {
        this.nvmfNamespaceId = nvmfNamespaceId;
    }

    public NvmfNamespaceSnapshotCreationParams nvmfNamespaceId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NVMF_NAMESPACE_ID);
        return this;
    }

    public NvmfNamespaceSnapshotCreationParams nvmfNamespaceId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NVMF_NAMESPACE_ID);
        return this;
    }

    public void setNvmfNamespaceId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NVMF_NAMESPACE_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NVMF_NAMESPACE_ID);
        }
    }

    public boolean getNvmfNamespaceId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NVMF_NAMESPACE_ID);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NvmfNamespaceSnapshotCreationParams nvmfNamespaceSnapshotCreationParams =
                (NvmfNamespaceSnapshotCreationParams) o;
        return Objects.equals(
                        this.nvmfSubsystemId, nvmfNamespaceSnapshotCreationParams.nvmfSubsystemId)
                && Objects.equals(this.name, nvmfNamespaceSnapshotCreationParams.name)
                && Objects.equals(
                        this.nvmfNamespaceId, nvmfNamespaceSnapshotCreationParams.nvmfNamespaceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nvmfSubsystemId, name, nvmfNamespaceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NvmfNamespaceSnapshotCreationParams {\n");
        sb.append("    nvmfSubsystemId: ").append(toIndentedString(nvmfSubsystemId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    nvmfNamespaceId: ").append(toIndentedString(nvmfNamespaceId)).append("\n");
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

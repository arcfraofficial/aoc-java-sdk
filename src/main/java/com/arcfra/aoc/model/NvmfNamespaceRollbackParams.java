package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** NvmfNamespaceRollbackParams */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class NvmfNamespaceRollbackParams
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_NAMESPACE_ID = "namespace_id";

    @SerializedName(SERIALIZED_NAME_NAMESPACE_ID)
    private String namespaceId;

    public static final String SERIALIZED_NAME_SNAPSHOT_ID = "snapshot_id";

    @SerializedName(SERIALIZED_NAME_SNAPSHOT_ID)
    private String snapshotId;

    public NvmfNamespaceRollbackParams() {}

    public NvmfNamespaceRollbackParams namespaceId(String namespaceId) {

        this.namespaceId = namespaceId;
        return this;
    }

    /**
     * Get namespaceId
     *
     * @return namespaceId
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getNamespaceId() {
        return namespaceId;
    }

    public void setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
    }

    public NvmfNamespaceRollbackParams namespaceId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAMESPACE_ID);
        return this;
    }

    public NvmfNamespaceRollbackParams namespaceId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAMESPACE_ID);
        return this;
    }

    public void setNamespaceId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAMESPACE_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAMESPACE_ID);
        }
    }

    public boolean getNamespaceId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAMESPACE_ID);
    }

    public NvmfNamespaceRollbackParams snapshotId(String snapshotId) {

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

    public NvmfNamespaceRollbackParams snapshotId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT_ID);
        return this;
    }

    public NvmfNamespaceRollbackParams snapshotId_ExplictlyNonNull() {
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
        NvmfNamespaceRollbackParams nvmfNamespaceRollbackParams = (NvmfNamespaceRollbackParams) o;
        return Objects.equals(this.namespaceId, nvmfNamespaceRollbackParams.namespaceId)
                && Objects.equals(this.snapshotId, nvmfNamespaceRollbackParams.snapshotId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(namespaceId, snapshotId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NvmfNamespaceRollbackParams {\n");
        sb.append("    namespaceId: ").append(toIndentedString(namespaceId)).append("\n");
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

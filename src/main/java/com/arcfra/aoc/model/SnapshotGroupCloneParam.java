package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** SnapshotGroupCloneParam */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class SnapshotGroupCloneParam
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_FROM_SOURCE_VM_ID = "from_source_vm_id";

    @SerializedName(SERIALIZED_NAME_FROM_SOURCE_VM_ID)
    private String fromSourceVmId;

    public static final String SERIALIZED_NAME_TO_CLONED_VM_NAME = "to_cloned_vm_name";

    @SerializedName(SERIALIZED_NAME_TO_CLONED_VM_NAME)
    private String toClonedVmName;

    public SnapshotGroupCloneParam() {}

    public SnapshotGroupCloneParam fromSourceVmId(String fromSourceVmId) {

        this.fromSourceVmId = fromSourceVmId;
        return this;
    }

    /**
     * Get fromSourceVmId
     *
     * @return fromSourceVmId
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getFromSourceVmId() {
        return fromSourceVmId;
    }

    public void setFromSourceVmId(String fromSourceVmId) {
        this.fromSourceVmId = fromSourceVmId;
    }

    public SnapshotGroupCloneParam fromSourceVmId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FROM_SOURCE_VM_ID);
        return this;
    }

    public SnapshotGroupCloneParam fromSourceVmId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FROM_SOURCE_VM_ID);
        return this;
    }

    public void setFromSourceVmId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FROM_SOURCE_VM_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FROM_SOURCE_VM_ID);
        }
    }

    public boolean getFromSourceVmId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FROM_SOURCE_VM_ID);
    }

    public SnapshotGroupCloneParam toClonedVmName(String toClonedVmName) {

        this.toClonedVmName = toClonedVmName;
        return this;
    }

    /**
     * Get toClonedVmName
     *
     * @return toClonedVmName
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getToClonedVmName() {
        return toClonedVmName;
    }

    public void setToClonedVmName(String toClonedVmName) {
        this.toClonedVmName = toClonedVmName;
    }

    public SnapshotGroupCloneParam toClonedVmName_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TO_CLONED_VM_NAME);
        return this;
    }

    public SnapshotGroupCloneParam toClonedVmName_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TO_CLONED_VM_NAME);
        return this;
    }

    public void setToClonedVmName_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TO_CLONED_VM_NAME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TO_CLONED_VM_NAME);
        }
    }

    public boolean getToClonedVmName_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TO_CLONED_VM_NAME);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SnapshotGroupCloneParam snapshotGroupCloneParam = (SnapshotGroupCloneParam) o;
        return Objects.equals(this.fromSourceVmId, snapshotGroupCloneParam.fromSourceVmId)
                && Objects.equals(this.toClonedVmName, snapshotGroupCloneParam.toClonedVmName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fromSourceVmId, toClonedVmName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SnapshotGroupCloneParam {\n");
        sb.append("    fromSourceVmId: ").append(toIndentedString(fromSourceVmId)).append("\n");
        sb.append("    toClonedVmName: ").append(toIndentedString(toClonedVmName)).append("\n");
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

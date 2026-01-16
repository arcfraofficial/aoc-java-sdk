package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** VmSnapshotCreationParamsData */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VmSnapshotCreationParamsData
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_CONSISTENT_TYPE = "consistent_type";

    @SerializedName(SERIALIZED_NAME_CONSISTENT_TYPE)
    private ConsistentType consistentType;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_VM_ID = "vm_id";

    @SerializedName(SERIALIZED_NAME_VM_ID)
    private String vmId;

    public VmSnapshotCreationParamsData() {}

    public VmSnapshotCreationParamsData consistentType(ConsistentType consistentType) {

        this.consistentType = consistentType;
        return this;
    }

    /**
     * Get consistentType
     *
     * @return consistentType
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ConsistentType getConsistentType() {
        return consistentType;
    }

    public void setConsistentType(ConsistentType consistentType) {
        this.consistentType = consistentType;
    }

    public VmSnapshotCreationParamsData consistentType_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CONSISTENT_TYPE);
        return this;
    }

    public VmSnapshotCreationParamsData consistentType_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CONSISTENT_TYPE);
        return this;
    }

    public void setConsistentType_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CONSISTENT_TYPE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CONSISTENT_TYPE);
        }
    }

    public boolean getConsistentType_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CONSISTENT_TYPE);
    }

    public VmSnapshotCreationParamsData name(String name) {

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

    public VmSnapshotCreationParamsData name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public VmSnapshotCreationParamsData name_ExplictlyNonNull() {
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

    public VmSnapshotCreationParamsData vmId(String vmId) {

        this.vmId = vmId;
        return this;
    }

    /**
     * Get vmId
     *
     * @return vmId
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getVmId() {
        return vmId;
    }

    public void setVmId(String vmId) {
        this.vmId = vmId;
    }

    public VmSnapshotCreationParamsData vmId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_ID);
        return this;
    }

    public VmSnapshotCreationParamsData vmId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_ID);
        return this;
    }

    public void setVmId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_ID);
        }
    }

    public boolean getVmId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_ID);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VmSnapshotCreationParamsData vmSnapshotCreationParamsData =
                (VmSnapshotCreationParamsData) o;
        return Objects.equals(this.consistentType, vmSnapshotCreationParamsData.consistentType)
                && Objects.equals(this.name, vmSnapshotCreationParamsData.name)
                && Objects.equals(this.vmId, vmSnapshotCreationParamsData.vmId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(consistentType, name, vmId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VmSnapshotCreationParamsData {\n");
        sb.append("    consistentType: ").append(toIndentedString(consistentType)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    vmId: ").append(toIndentedString(vmId)).append("\n");
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

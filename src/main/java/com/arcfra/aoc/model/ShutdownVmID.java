package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** ShutdownVmID */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class ShutdownVmID extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_VM_UUID = "vm_uuid";

    @SerializedName(SERIALIZED_NAME_VM_UUID)
    private String vmUuid;

    public ShutdownVmID() {}

    public ShutdownVmID vmUuid(String vmUuid) {

        this.vmUuid = vmUuid;
        return this;
    }

    /**
     * Get vmUuid
     *
     * @return vmUuid
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getVmUuid() {
        return vmUuid;
    }

    public void setVmUuid(String vmUuid) {
        this.vmUuid = vmUuid;
    }

    public ShutdownVmID vmUuid_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_UUID);
        return this;
    }

    public ShutdownVmID vmUuid_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_UUID);
        return this;
    }

    public void setVmUuid_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_UUID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_UUID);
        }
    }

    public boolean getVmUuid_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_UUID);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShutdownVmID shutdownVmID = (ShutdownVmID) o;
        return Objects.equals(this.vmUuid, shutdownVmID.vmUuid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vmUuid);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShutdownVmID {\n");
        sb.append("    vmUuid: ").append(toIndentedString(vmUuid)).append("\n");
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

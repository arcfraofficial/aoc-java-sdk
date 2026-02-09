package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** ApplicationVmSpecStatus */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class ApplicationVmSpecStatus
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_VM_IPS = "vmIps";

    @SerializedName(SERIALIZED_NAME_VM_IPS)
    private List<String> vmIps = null;

    public static final String SERIALIZED_NAME_MESSAGE = "message";

    @SerializedName(SERIALIZED_NAME_MESSAGE)
    private VmStatus message;

    public ApplicationVmSpecStatus() {}

    public ApplicationVmSpecStatus vmIps(List<String> vmIps) {

        this.vmIps = vmIps;
        return this;
    }

    public ApplicationVmSpecStatus addVmIpsItem(String vmIpsItem) {
        if (this.vmIps == null) {
            this.vmIps = new ArrayList<String>();
        }
        this.vmIps.add(vmIpsItem);
        return this;
    }

    /**
     * Get vmIps
     *
     * @return vmIps
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getVmIps() {
        return vmIps;
    }

    public void setVmIps(List<String> vmIps) {
        this.vmIps = vmIps;
    }

    public ApplicationVmSpecStatus vmIps_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_IPS);
        return this;
    }

    public ApplicationVmSpecStatus vmIps_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_IPS);
        return this;
    }

    public void setVmIps_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_IPS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_IPS);
        }
    }

    public boolean getVmIps_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_IPS);
    }

    public ApplicationVmSpecStatus message(VmStatus message) {

        this.message = message;
        return this;
    }

    /**
     * Get message
     *
     * @return message
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmStatus getMessage() {
        return message;
    }

    public void setMessage(VmStatus message) {
        this.message = message;
    }

    public ApplicationVmSpecStatus message_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MESSAGE);
        return this;
    }

    public ApplicationVmSpecStatus message_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MESSAGE);
        return this;
    }

    public void setMessage_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MESSAGE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MESSAGE);
        }
    }

    public boolean getMessage_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MESSAGE);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApplicationVmSpecStatus applicationVmSpecStatus = (ApplicationVmSpecStatus) o;
        return Objects.equals(this.vmIps, applicationVmSpecStatus.vmIps)
                && Objects.equals(this.message, applicationVmSpecStatus.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vmIps, message);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApplicationVmSpecStatus {\n");
        sb.append("    vmIps: ").append(toIndentedString(vmIps)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

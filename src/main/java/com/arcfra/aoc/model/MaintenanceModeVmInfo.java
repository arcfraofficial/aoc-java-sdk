package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Arrays;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** MaintenanceModeVmInfo */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class MaintenanceModeVmInfo
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_VM_UUID = "vm_uuid";

    @SerializedName(SERIALIZED_NAME_VM_UUID)
    private String vmUuid;

    public static final String SERIALIZED_NAME_VM_STATE = "vm_state";

    @SerializedName(SERIALIZED_NAME_VM_STATE)
    private String vmState;

    public static final String SERIALIZED_NAME_VM_NAME = "vm_name";

    @SerializedName(SERIALIZED_NAME_VM_NAME)
    private String vmName;

    public static final String SERIALIZED_NAME_VM_HA = "vm_ha";

    @SerializedName(SERIALIZED_NAME_VM_HA)
    private Boolean vmHa;

    public static final String SERIALIZED_NAME_VERIFY = "verify";

    @SerializedName(SERIALIZED_NAME_VERIFY)
    private MaintenanceModeVerify verify;

    public static final String SERIALIZED_NAME_TARGET_HOST_NAME = "target_host_name";

    @SerializedName(SERIALIZED_NAME_TARGET_HOST_NAME)
    private String targetHostName;

    public static final String SERIALIZED_NAME_STATE = "state";

    @SerializedName(SERIALIZED_NAME_STATE)
    private String state;

    public MaintenanceModeVmInfo() {}

    public MaintenanceModeVmInfo vmUuid(String vmUuid) {

        this.vmUuid = vmUuid;
        return this;
    }

    /**
     * Get vmUuid
     *
     * @return vmUuid
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVmUuid() {
        return vmUuid;
    }

    public void setVmUuid(String vmUuid) {
        this.vmUuid = vmUuid;
    }

    public MaintenanceModeVmInfo vmUuid_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_UUID);
        return this;
    }

    public MaintenanceModeVmInfo vmUuid_ExplictlyNonNull() {
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

    public MaintenanceModeVmInfo vmState(String vmState) {

        this.vmState = vmState;
        return this;
    }

    /**
     * Get vmState
     *
     * @return vmState
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVmState() {
        return vmState;
    }

    public void setVmState(String vmState) {
        this.vmState = vmState;
    }

    public MaintenanceModeVmInfo vmState_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_STATE);
        return this;
    }

    public MaintenanceModeVmInfo vmState_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_STATE);
        return this;
    }

    public void setVmState_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_STATE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_STATE);
        }
    }

    public boolean getVmState_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_STATE);
    }

    public MaintenanceModeVmInfo vmName(String vmName) {

        this.vmName = vmName;
        return this;
    }

    /**
     * Get vmName
     *
     * @return vmName
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVmName() {
        return vmName;
    }

    public void setVmName(String vmName) {
        this.vmName = vmName;
    }

    public MaintenanceModeVmInfo vmName_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_NAME);
        return this;
    }

    public MaintenanceModeVmInfo vmName_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_NAME);
        return this;
    }

    public void setVmName_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_NAME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_NAME);
        }
    }

    public boolean getVmName_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_NAME);
    }

    public MaintenanceModeVmInfo vmHa(Boolean vmHa) {

        this.vmHa = vmHa;
        return this;
    }

    /**
     * Get vmHa
     *
     * @return vmHa
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getVmHa() {
        return vmHa;
    }

    public void setVmHa(Boolean vmHa) {
        this.vmHa = vmHa;
    }

    public MaintenanceModeVmInfo vmHa_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_HA);
        return this;
    }

    public MaintenanceModeVmInfo vmHa_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_HA);
        return this;
    }

    public void setVmHa_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_HA);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_HA);
        }
    }

    public boolean getVmHa_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_HA);
    }

    public MaintenanceModeVmInfo verify(MaintenanceModeVerify verify) {

        this.verify = verify;
        return this;
    }

    /**
     * Get verify
     *
     * @return verify
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public MaintenanceModeVerify getVerify() {
        return verify;
    }

    public void setVerify(MaintenanceModeVerify verify) {
        this.verify = verify;
    }

    public MaintenanceModeVmInfo verify_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VERIFY);
        return this;
    }

    public MaintenanceModeVmInfo verify_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VERIFY);
        return this;
    }

    public void setVerify_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VERIFY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VERIFY);
        }
    }

    public boolean getVerify_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VERIFY);
    }

    public MaintenanceModeVmInfo targetHostName(String targetHostName) {

        this.targetHostName = targetHostName;
        return this;
    }

    /**
     * Get targetHostName
     *
     * @return targetHostName
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getTargetHostName() {
        return targetHostName;
    }

    public void setTargetHostName(String targetHostName) {
        this.targetHostName = targetHostName;
    }

    public MaintenanceModeVmInfo targetHostName_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TARGET_HOST_NAME);
        return this;
    }

    public MaintenanceModeVmInfo targetHostName_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TARGET_HOST_NAME);
        return this;
    }

    public void setTargetHostName_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TARGET_HOST_NAME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TARGET_HOST_NAME);
        }
    }

    public boolean getTargetHostName_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TARGET_HOST_NAME);
    }

    public MaintenanceModeVmInfo state(String state) {

        this.state = state;
        return this;
    }

    /**
     * Get state
     *
     * @return state
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public MaintenanceModeVmInfo state_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATE);
        return this;
    }

    public MaintenanceModeVmInfo state_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STATE);
        return this;
    }

    public void setState_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STATE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STATE);
        }
    }

    public boolean getState_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STATE);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MaintenanceModeVmInfo maintenanceModeVmInfo = (MaintenanceModeVmInfo) o;
        return Objects.equals(this.vmUuid, maintenanceModeVmInfo.vmUuid)
                && Objects.equals(this.vmState, maintenanceModeVmInfo.vmState)
                && Objects.equals(this.vmName, maintenanceModeVmInfo.vmName)
                && Objects.equals(this.vmHa, maintenanceModeVmInfo.vmHa)
                && Objects.equals(this.verify, maintenanceModeVmInfo.verify)
                && Objects.equals(this.targetHostName, maintenanceModeVmInfo.targetHostName)
                && Objects.equals(this.state, maintenanceModeVmInfo.state);
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
        return Objects.hash(vmUuid, vmState, vmName, vmHa, verify, targetHostName, state);
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
        sb.append("class MaintenanceModeVmInfo {\n");
        sb.append("    vmUuid: ").append(toIndentedString(vmUuid)).append("\n");
        sb.append("    vmState: ").append(toIndentedString(vmState)).append("\n");
        sb.append("    vmName: ").append(toIndentedString(vmName)).append("\n");
        sb.append("    vmHa: ").append(toIndentedString(vmHa)).append("\n");
        sb.append("    verify: ").append(toIndentedString(verify)).append("\n");
        sb.append("    targetHostName: ").append(toIndentedString(targetHostName)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

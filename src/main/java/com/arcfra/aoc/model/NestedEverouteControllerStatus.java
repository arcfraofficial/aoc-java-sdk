package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Arrays;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** NestedEverouteControllerStatus */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class NestedEverouteControllerStatus
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_IP_ADDR = "ipAddr";

    @SerializedName(SERIALIZED_NAME_IP_ADDR)
    private String ipAddr;

    public static final String SERIALIZED_NAME_IS_HEALTH = "isHealth";

    @SerializedName(SERIALIZED_NAME_IS_HEALTH)
    private Boolean isHealth;

    public static final String SERIALIZED_NAME_MESSAGE = "message";

    @SerializedName(SERIALIZED_NAME_MESSAGE)
    private String message;

    public static final String SERIALIZED_NAME_METRICS = "metrics";

    @SerializedName(SERIALIZED_NAME_METRICS)
    private NestedEverouteClusterVMMetrics metrics;

    public static final String SERIALIZED_NAME_PHASE = "phase";

    @SerializedName(SERIALIZED_NAME_PHASE)
    private EverouteClusterPhase phase;

    public static final String SERIALIZED_NAME_REASON = "reason";

    @SerializedName(SERIALIZED_NAME_REASON)
    private String reason;

    public static final String SERIALIZED_NAME_VM = "vm";

    @SerializedName(SERIALIZED_NAME_VM)
    private NestedVm vm;

    public static final String SERIALIZED_NAME_VM_I_D = "vmID";

    @SerializedName(SERIALIZED_NAME_VM_I_D)
    private String vmID;

    public NestedEverouteControllerStatus() {}

    public NestedEverouteControllerStatus ipAddr(String ipAddr) {

        this.ipAddr = ipAddr;
        return this;
    }

    /**
     * Get ipAddr
     *
     * @return ipAddr
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIpAddr() {
        return ipAddr;
    }

    public void setIpAddr(String ipAddr) {
        this.ipAddr = ipAddr;
    }

    public NestedEverouteControllerStatus ipAddr_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_ADDR);
        return this;
    }

    public NestedEverouteControllerStatus ipAddr_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IP_ADDR);
        return this;
    }

    public void setIpAddr_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IP_ADDR);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IP_ADDR);
        }
    }

    public boolean getIpAddr_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IP_ADDR);
    }

    public NestedEverouteControllerStatus isHealth(Boolean isHealth) {

        this.isHealth = isHealth;
        return this;
    }

    /**
     * Get isHealth
     *
     * @return isHealth
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Boolean getIsHealth() {
        return isHealth;
    }

    public void setIsHealth(Boolean isHealth) {
        this.isHealth = isHealth;
    }

    public NestedEverouteControllerStatus isHealth_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IS_HEALTH);
        return this;
    }

    public NestedEverouteControllerStatus isHealth_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IS_HEALTH);
        return this;
    }

    public void setIsHealth_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IS_HEALTH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IS_HEALTH);
        }
    }

    public boolean getIsHealth_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IS_HEALTH);
    }

    public NestedEverouteControllerStatus message(String message) {

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
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public NestedEverouteControllerStatus message_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MESSAGE);
        return this;
    }

    public NestedEverouteControllerStatus message_ExplictlyNonNull() {
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

    public NestedEverouteControllerStatus metrics(NestedEverouteClusterVMMetrics metrics) {

        this.metrics = metrics;
        return this;
    }

    /**
     * Get metrics
     *
     * @return metrics
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NestedEverouteClusterVMMetrics getMetrics() {
        return metrics;
    }

    public void setMetrics(NestedEverouteClusterVMMetrics metrics) {
        this.metrics = metrics;
    }

    public NestedEverouteControllerStatus metrics_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_METRICS);
        return this;
    }

    public NestedEverouteControllerStatus metrics_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_METRICS);
        return this;
    }

    public void setMetrics_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_METRICS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_METRICS);
        }
    }

    public boolean getMetrics_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_METRICS);
    }

    public NestedEverouteControllerStatus phase(EverouteClusterPhase phase) {

        this.phase = phase;
        return this;
    }

    /**
     * Get phase
     *
     * @return phase
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public EverouteClusterPhase getPhase() {
        return phase;
    }

    public void setPhase(EverouteClusterPhase phase) {
        this.phase = phase;
    }

    public NestedEverouteControllerStatus phase_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PHASE);
        return this;
    }

    public NestedEverouteControllerStatus phase_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PHASE);
        return this;
    }

    public void setPhase_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PHASE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PHASE);
        }
    }

    public boolean getPhase_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PHASE);
    }

    public NestedEverouteControllerStatus reason(String reason) {

        this.reason = reason;
        return this;
    }

    /**
     * Get reason
     *
     * @return reason
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public NestedEverouteControllerStatus reason_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REASON);
        return this;
    }

    public NestedEverouteControllerStatus reason_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REASON);
        return this;
    }

    public void setReason_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REASON);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REASON);
        }
    }

    public boolean getReason_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REASON);
    }

    public NestedEverouteControllerStatus vm(NestedVm vm) {

        this.vm = vm;
        return this;
    }

    /**
     * Get vm
     *
     * @return vm
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NestedVm getVm() {
        return vm;
    }

    public void setVm(NestedVm vm) {
        this.vm = vm;
    }

    public NestedEverouteControllerStatus vm_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM);
        return this;
    }

    public NestedEverouteControllerStatus vm_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM);
        return this;
    }

    public void setVm_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM);
        }
    }

    public boolean getVm_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM);
    }

    public NestedEverouteControllerStatus vmID(String vmID) {

        this.vmID = vmID;
        return this;
    }

    /**
     * Get vmID
     *
     * @return vmID
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVmID() {
        return vmID;
    }

    public void setVmID(String vmID) {
        this.vmID = vmID;
    }

    public NestedEverouteControllerStatus vmID_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_I_D);
        return this;
    }

    public NestedEverouteControllerStatus vmID_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_I_D);
        return this;
    }

    public void setVmID_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_I_D);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_I_D);
        }
    }

    public boolean getVmID_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_I_D);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NestedEverouteControllerStatus nestedEverouteControllerStatus =
                (NestedEverouteControllerStatus) o;
        return Objects.equals(this.ipAddr, nestedEverouteControllerStatus.ipAddr)
                && Objects.equals(this.isHealth, nestedEverouteControllerStatus.isHealth)
                && Objects.equals(this.message, nestedEverouteControllerStatus.message)
                && Objects.equals(this.metrics, nestedEverouteControllerStatus.metrics)
                && Objects.equals(this.phase, nestedEverouteControllerStatus.phase)
                && Objects.equals(this.reason, nestedEverouteControllerStatus.reason)
                && Objects.equals(this.vm, nestedEverouteControllerStatus.vm)
                && Objects.equals(this.vmID, nestedEverouteControllerStatus.vmID);
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
        return Objects.hash(ipAddr, isHealth, message, metrics, phase, reason, vm, vmID);
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
        sb.append("class NestedEverouteControllerStatus {\n");
        sb.append("    ipAddr: ").append(toIndentedString(ipAddr)).append("\n");
        sb.append("    isHealth: ").append(toIndentedString(isHealth)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
        sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    vm: ").append(toIndentedString(vm)).append("\n");
        sb.append("    vmID: ").append(toIndentedString(vmID)).append("\n");
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

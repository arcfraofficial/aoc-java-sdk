package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** IsolationPolicyCreateParams */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class IsolationPolicyCreateParams
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_INGRESS = "ingress";

    @SerializedName(SERIALIZED_NAME_INGRESS)
    private List<SecurityPolicyIngressEgressInput> ingress = null;

    public static final String SERIALIZED_NAME_EGRESS = "egress";

    @SerializedName(SERIALIZED_NAME_EGRESS)
    private List<SecurityPolicyIngressEgressInput> egress = null;

    public static final String SERIALIZED_NAME_MODE = "mode";

    @SerializedName(SERIALIZED_NAME_MODE)
    private IsolationMode mode;

    public static final String SERIALIZED_NAME_VM_ID = "vm_id";

    @SerializedName(SERIALIZED_NAME_VM_ID)
    private String vmId;

    public static final String SERIALIZED_NAME_EVEROUTE_CLUSTER_ID = "everoute_cluster_id";

    @SerializedName(SERIALIZED_NAME_EVEROUTE_CLUSTER_ID)
    private String everouteClusterId;

    public IsolationPolicyCreateParams() {}

    public IsolationPolicyCreateParams ingress(List<SecurityPolicyIngressEgressInput> ingress) {

        this.ingress = ingress;
        return this;
    }

    public IsolationPolicyCreateParams addIngressItem(
            SecurityPolicyIngressEgressInput ingressItem) {
        if (this.ingress == null) {
            this.ingress = new ArrayList<SecurityPolicyIngressEgressInput>();
        }
        this.ingress.add(ingressItem);
        return this;
    }

    /**
     * Get ingress
     *
     * @return ingress
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<SecurityPolicyIngressEgressInput> getIngress() {
        return ingress;
    }

    public void setIngress(List<SecurityPolicyIngressEgressInput> ingress) {
        this.ingress = ingress;
    }

    public IsolationPolicyCreateParams ingress_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INGRESS);
        return this;
    }

    public IsolationPolicyCreateParams ingress_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INGRESS);
        return this;
    }

    public void setIngress_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INGRESS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INGRESS);
        }
    }

    public boolean getIngress_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INGRESS);
    }

    public IsolationPolicyCreateParams egress(List<SecurityPolicyIngressEgressInput> egress) {

        this.egress = egress;
        return this;
    }

    public IsolationPolicyCreateParams addEgressItem(SecurityPolicyIngressEgressInput egressItem) {
        if (this.egress == null) {
            this.egress = new ArrayList<SecurityPolicyIngressEgressInput>();
        }
        this.egress.add(egressItem);
        return this;
    }

    /**
     * Get egress
     *
     * @return egress
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<SecurityPolicyIngressEgressInput> getEgress() {
        return egress;
    }

    public void setEgress(List<SecurityPolicyIngressEgressInput> egress) {
        this.egress = egress;
    }

    public IsolationPolicyCreateParams egress_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EGRESS);
        return this;
    }

    public IsolationPolicyCreateParams egress_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EGRESS);
        return this;
    }

    public void setEgress_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EGRESS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EGRESS);
        }
    }

    public boolean getEgress_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EGRESS);
    }

    public IsolationPolicyCreateParams mode(IsolationMode mode) {

        this.mode = mode;
        return this;
    }

    /**
     * Get mode
     *
     * @return mode
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public IsolationMode getMode() {
        return mode;
    }

    public void setMode(IsolationMode mode) {
        this.mode = mode;
    }

    public IsolationPolicyCreateParams mode_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MODE);
        return this;
    }

    public IsolationPolicyCreateParams mode_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MODE);
        return this;
    }

    public void setMode_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MODE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MODE);
        }
    }

    public boolean getMode_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MODE);
    }

    public IsolationPolicyCreateParams vmId(String vmId) {

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

    public IsolationPolicyCreateParams vmId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_ID);
        return this;
    }

    public IsolationPolicyCreateParams vmId_ExplictlyNonNull() {
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

    public IsolationPolicyCreateParams everouteClusterId(String everouteClusterId) {

        this.everouteClusterId = everouteClusterId;
        return this;
    }

    /**
     * Get everouteClusterId
     *
     * @return everouteClusterId
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getEverouteClusterId() {
        return everouteClusterId;
    }

    public void setEverouteClusterId(String everouteClusterId) {
        this.everouteClusterId = everouteClusterId;
    }

    public IsolationPolicyCreateParams everouteClusterId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EVEROUTE_CLUSTER_ID);
        return this;
    }

    public IsolationPolicyCreateParams everouteClusterId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EVEROUTE_CLUSTER_ID);
        return this;
    }

    public void setEverouteClusterId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EVEROUTE_CLUSTER_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EVEROUTE_CLUSTER_ID);
        }
    }

    public boolean getEverouteClusterId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EVEROUTE_CLUSTER_ID);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IsolationPolicyCreateParams isolationPolicyCreateParams = (IsolationPolicyCreateParams) o;
        return Objects.equals(this.ingress, isolationPolicyCreateParams.ingress)
                && Objects.equals(this.egress, isolationPolicyCreateParams.egress)
                && Objects.equals(this.mode, isolationPolicyCreateParams.mode)
                && Objects.equals(this.vmId, isolationPolicyCreateParams.vmId)
                && Objects.equals(
                        this.everouteClusterId, isolationPolicyCreateParams.everouteClusterId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ingress, egress, mode, vmId, everouteClusterId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IsolationPolicyCreateParams {\n");
        sb.append("    ingress: ").append(toIndentedString(ingress)).append("\n");
        sb.append("    egress: ").append(toIndentedString(egress)).append("\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
        sb.append("    vmId: ").append(toIndentedString(vmId)).append("\n");
        sb.append("    everouteClusterId: ")
                .append(toIndentedString(everouteClusterId))
                .append("\n");
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

package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** IsolationPolicyUpdateParams */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class IsolationPolicyUpdateParams
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

    public IsolationPolicyUpdateParams() {}

    public IsolationPolicyUpdateParams ingress(List<SecurityPolicyIngressEgressInput> ingress) {

        this.ingress = ingress;
        return this;
    }

    public IsolationPolicyUpdateParams addIngressItem(
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

    public IsolationPolicyUpdateParams ingress_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INGRESS);
        return this;
    }

    public IsolationPolicyUpdateParams ingress_ExplictlyNonNull() {
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

    public IsolationPolicyUpdateParams egress(List<SecurityPolicyIngressEgressInput> egress) {

        this.egress = egress;
        return this;
    }

    public IsolationPolicyUpdateParams addEgressItem(SecurityPolicyIngressEgressInput egressItem) {
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

    public IsolationPolicyUpdateParams egress_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EGRESS);
        return this;
    }

    public IsolationPolicyUpdateParams egress_ExplictlyNonNull() {
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

    public IsolationPolicyUpdateParams mode(IsolationMode mode) {

        this.mode = mode;
        return this;
    }

    /**
     * Get mode
     *
     * @return mode
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public IsolationMode getMode() {
        return mode;
    }

    public void setMode(IsolationMode mode) {
        this.mode = mode;
    }

    public IsolationPolicyUpdateParams mode_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MODE);
        return this;
    }

    public IsolationPolicyUpdateParams mode_ExplictlyNonNull() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IsolationPolicyUpdateParams isolationPolicyUpdateParams = (IsolationPolicyUpdateParams) o;
        return Objects.equals(this.ingress, isolationPolicyUpdateParams.ingress)
                && Objects.equals(this.egress, isolationPolicyUpdateParams.egress)
                && Objects.equals(this.mode, isolationPolicyUpdateParams.mode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ingress, egress, mode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IsolationPolicyUpdateParams {\n");
        sb.append("    ingress: ").append(toIndentedString(ingress)).append("\n");
        sb.append("    egress: ").append(toIndentedString(egress)).append("\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
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

package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** SecurityPolicyUpdateParams */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class SecurityPolicyUpdateParams
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_IS_BLOCKLIST = "is_blocklist";

    @SerializedName(SERIALIZED_NAME_IS_BLOCKLIST)
    private Boolean isBlocklist;

    public static final String SERIALIZED_NAME_INGRESS = "ingress";

    @SerializedName(SERIALIZED_NAME_INGRESS)
    private List<SecurityPolicyIngressEgressInput> ingress = null;

    public static final String SERIALIZED_NAME_EGRESS = "egress";

    @SerializedName(SERIALIZED_NAME_EGRESS)
    private List<SecurityPolicyIngressEgressInput> egress = null;

    public static final String SERIALIZED_NAME_APPLY_TO = "apply_to";

    @SerializedName(SERIALIZED_NAME_APPLY_TO)
    private List<SecurityPolicyApplyToInput> applyTo = null;

    public static final String SERIALIZED_NAME_POLICY_MODE = "policy_mode";

    @SerializedName(SERIALIZED_NAME_POLICY_MODE)
    private PolicyMode policyMode;

    public SecurityPolicyUpdateParams() {}

    public SecurityPolicyUpdateParams isBlocklist(Boolean isBlocklist) {

        this.isBlocklist = isBlocklist;
        return this;
    }

    /**
     * Get isBlocklist
     *
     * @return isBlocklist
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getIsBlocklist() {
        return isBlocklist;
    }

    public void setIsBlocklist(Boolean isBlocklist) {
        this.isBlocklist = isBlocklist;
    }

    public SecurityPolicyUpdateParams isBlocklist_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IS_BLOCKLIST);
        return this;
    }

    public SecurityPolicyUpdateParams isBlocklist_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IS_BLOCKLIST);
        return this;
    }

    public void setIsBlocklist_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IS_BLOCKLIST);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IS_BLOCKLIST);
        }
    }

    public boolean getIsBlocklist_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IS_BLOCKLIST);
    }

    public SecurityPolicyUpdateParams ingress(List<SecurityPolicyIngressEgressInput> ingress) {

        this.ingress = ingress;
        return this;
    }

    public SecurityPolicyUpdateParams addIngressItem(SecurityPolicyIngressEgressInput ingressItem) {
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

    public SecurityPolicyUpdateParams ingress_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INGRESS);
        return this;
    }

    public SecurityPolicyUpdateParams ingress_ExplictlyNonNull() {
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

    public SecurityPolicyUpdateParams egress(List<SecurityPolicyIngressEgressInput> egress) {

        this.egress = egress;
        return this;
    }

    public SecurityPolicyUpdateParams addEgressItem(SecurityPolicyIngressEgressInput egressItem) {
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

    public SecurityPolicyUpdateParams egress_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EGRESS);
        return this;
    }

    public SecurityPolicyUpdateParams egress_ExplictlyNonNull() {
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

    public SecurityPolicyUpdateParams applyTo(List<SecurityPolicyApplyToInput> applyTo) {

        this.applyTo = applyTo;
        return this;
    }

    public SecurityPolicyUpdateParams addApplyToItem(SecurityPolicyApplyToInput applyToItem) {
        if (this.applyTo == null) {
            this.applyTo = new ArrayList<SecurityPolicyApplyToInput>();
        }
        this.applyTo.add(applyToItem);
        return this;
    }

    /**
     * Get applyTo
     *
     * @return applyTo
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<SecurityPolicyApplyToInput> getApplyTo() {
        return applyTo;
    }

    public void setApplyTo(List<SecurityPolicyApplyToInput> applyTo) {
        this.applyTo = applyTo;
    }

    public SecurityPolicyUpdateParams applyTo_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_APPLY_TO);
        return this;
    }

    public SecurityPolicyUpdateParams applyTo_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_APPLY_TO);
        return this;
    }

    public void setApplyTo_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_APPLY_TO);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_APPLY_TO);
        }
    }

    public boolean getApplyTo_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_APPLY_TO);
    }

    public SecurityPolicyUpdateParams policyMode(PolicyMode policyMode) {

        this.policyMode = policyMode;
        return this;
    }

    /**
     * Get policyMode
     *
     * @return policyMode
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public PolicyMode getPolicyMode() {
        return policyMode;
    }

    public void setPolicyMode(PolicyMode policyMode) {
        this.policyMode = policyMode;
    }

    public SecurityPolicyUpdateParams policyMode_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_POLICY_MODE);
        return this;
    }

    public SecurityPolicyUpdateParams policyMode_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_POLICY_MODE);
        return this;
    }

    public void setPolicyMode_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_POLICY_MODE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_POLICY_MODE);
        }
    }

    public boolean getPolicyMode_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_POLICY_MODE);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SecurityPolicyUpdateParams securityPolicyUpdateParams = (SecurityPolicyUpdateParams) o;
        return Objects.equals(this.isBlocklist, securityPolicyUpdateParams.isBlocklist)
                && Objects.equals(this.ingress, securityPolicyUpdateParams.ingress)
                && Objects.equals(this.egress, securityPolicyUpdateParams.egress)
                && Objects.equals(this.applyTo, securityPolicyUpdateParams.applyTo)
                && Objects.equals(this.policyMode, securityPolicyUpdateParams.policyMode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isBlocklist, ingress, egress, applyTo, policyMode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SecurityPolicyUpdateParams {\n");
        sb.append("    isBlocklist: ").append(toIndentedString(isBlocklist)).append("\n");
        sb.append("    ingress: ").append(toIndentedString(ingress)).append("\n");
        sb.append("    egress: ").append(toIndentedString(egress)).append("\n");
        sb.append("    applyTo: ").append(toIndentedString(applyTo)).append("\n");
        sb.append("    policyMode: ").append(toIndentedString(policyMode)).append("\n");
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

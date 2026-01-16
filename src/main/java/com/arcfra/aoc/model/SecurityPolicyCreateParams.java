package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** SecurityPolicyCreateParams */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class SecurityPolicyCreateParams
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

    public static final String SERIALIZED_NAME_EVEROUTE_CLUSTER_ID = "everoute_cluster_id";

    @SerializedName(SERIALIZED_NAME_EVEROUTE_CLUSTER_ID)
    private String everouteClusterId;

    public static final String SERIALIZED_NAME_DESCRIPTION = "description";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION)
    private String description;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public SecurityPolicyCreateParams() {}

    public SecurityPolicyCreateParams isBlocklist(Boolean isBlocklist) {

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

    public SecurityPolicyCreateParams isBlocklist_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IS_BLOCKLIST);
        return this;
    }

    public SecurityPolicyCreateParams isBlocklist_ExplictlyNonNull() {
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

    public SecurityPolicyCreateParams ingress(List<SecurityPolicyIngressEgressInput> ingress) {

        this.ingress = ingress;
        return this;
    }

    public SecurityPolicyCreateParams addIngressItem(SecurityPolicyIngressEgressInput ingressItem) {
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

    public SecurityPolicyCreateParams ingress_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INGRESS);
        return this;
    }

    public SecurityPolicyCreateParams ingress_ExplictlyNonNull() {
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

    public SecurityPolicyCreateParams egress(List<SecurityPolicyIngressEgressInput> egress) {

        this.egress = egress;
        return this;
    }

    public SecurityPolicyCreateParams addEgressItem(SecurityPolicyIngressEgressInput egressItem) {
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

    public SecurityPolicyCreateParams egress_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EGRESS);
        return this;
    }

    public SecurityPolicyCreateParams egress_ExplictlyNonNull() {
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

    public SecurityPolicyCreateParams applyTo(List<SecurityPolicyApplyToInput> applyTo) {

        this.applyTo = applyTo;
        return this;
    }

    public SecurityPolicyCreateParams addApplyToItem(SecurityPolicyApplyToInput applyToItem) {
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

    public SecurityPolicyCreateParams applyTo_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_APPLY_TO);
        return this;
    }

    public SecurityPolicyCreateParams applyTo_ExplictlyNonNull() {
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

    public SecurityPolicyCreateParams policyMode(PolicyMode policyMode) {

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

    public SecurityPolicyCreateParams policyMode_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_POLICY_MODE);
        return this;
    }

    public SecurityPolicyCreateParams policyMode_ExplictlyNonNull() {
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

    public SecurityPolicyCreateParams everouteClusterId(String everouteClusterId) {

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

    public SecurityPolicyCreateParams everouteClusterId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EVEROUTE_CLUSTER_ID);
        return this;
    }

    public SecurityPolicyCreateParams everouteClusterId_ExplictlyNonNull() {
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

    public SecurityPolicyCreateParams description(String description) {

        this.description = description;
        return this;
    }

    /**
     * Get description
     *
     * @return description
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public SecurityPolicyCreateParams description_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION);
        return this;
    }

    public SecurityPolicyCreateParams description_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION);
        return this;
    }

    public void setDescription_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION);
        }
    }

    public boolean getDescription_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESCRIPTION);
    }

    public SecurityPolicyCreateParams name(String name) {

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

    public SecurityPolicyCreateParams name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public SecurityPolicyCreateParams name_ExplictlyNonNull() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SecurityPolicyCreateParams securityPolicyCreateParams = (SecurityPolicyCreateParams) o;
        return Objects.equals(this.isBlocklist, securityPolicyCreateParams.isBlocklist)
                && Objects.equals(this.ingress, securityPolicyCreateParams.ingress)
                && Objects.equals(this.egress, securityPolicyCreateParams.egress)
                && Objects.equals(this.applyTo, securityPolicyCreateParams.applyTo)
                && Objects.equals(this.policyMode, securityPolicyCreateParams.policyMode)
                && Objects.equals(
                        this.everouteClusterId, securityPolicyCreateParams.everouteClusterId)
                && Objects.equals(this.description, securityPolicyCreateParams.description)
                && Objects.equals(this.name, securityPolicyCreateParams.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                isBlocklist,
                ingress,
                egress,
                applyTo,
                policyMode,
                everouteClusterId,
                description,
                name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SecurityPolicyCreateParams {\n");
        sb.append("    isBlocklist: ").append(toIndentedString(isBlocklist)).append("\n");
        sb.append("    ingress: ").append(toIndentedString(ingress)).append("\n");
        sb.append("    egress: ").append(toIndentedString(egress)).append("\n");
        sb.append("    applyTo: ").append(toIndentedString(applyTo)).append("\n");
        sb.append("    policyMode: ").append(toIndentedString(policyMode)).append("\n");
        sb.append("    everouteClusterId: ")
                .append(toIndentedString(everouteClusterId))
                .append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

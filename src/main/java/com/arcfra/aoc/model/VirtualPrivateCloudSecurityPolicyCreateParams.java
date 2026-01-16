package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** VirtualPrivateCloudSecurityPolicyCreateParams */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VirtualPrivateCloudSecurityPolicyCreateParams
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_EGRESS = "egress";

    @SerializedName(SERIALIZED_NAME_EGRESS)
    private List<VirtualPrivateCloudNetworkPolicyRuleInput> egress = null;

    public static final String SERIALIZED_NAME_INGRESS = "ingress";

    @SerializedName(SERIALIZED_NAME_INGRESS)
    private List<VirtualPrivateCloudNetworkPolicyRuleInput> ingress = null;

    public static final String SERIALIZED_NAME_APPLY_TO = "apply_to";

    @SerializedName(SERIALIZED_NAME_APPLY_TO)
    private List<VirtualPrivateCloudSecurityPolicyApplyInput> applyTo =
            new ArrayList<VirtualPrivateCloudSecurityPolicyApplyInput>();

    public static final String SERIALIZED_NAME_POLICY_MODE = "policy_mode";

    @SerializedName(SERIALIZED_NAME_POLICY_MODE)
    private VirtualPrivateCloudSecurityPolicyMode policyMode;

    public static final String SERIALIZED_NAME_VPC_ID = "vpc_id";

    @SerializedName(SERIALIZED_NAME_VPC_ID)
    private String vpcId;

    public static final String SERIALIZED_NAME_DESCRIPTION = "description";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION)
    private String description;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public VirtualPrivateCloudSecurityPolicyCreateParams() {}

    public VirtualPrivateCloudSecurityPolicyCreateParams egress(
            List<VirtualPrivateCloudNetworkPolicyRuleInput> egress) {

        this.egress = egress;
        return this;
    }

    public VirtualPrivateCloudSecurityPolicyCreateParams addEgressItem(
            VirtualPrivateCloudNetworkPolicyRuleInput egressItem) {
        if (this.egress == null) {
            this.egress = new ArrayList<VirtualPrivateCloudNetworkPolicyRuleInput>();
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
    public List<VirtualPrivateCloudNetworkPolicyRuleInput> getEgress() {
        return egress;
    }

    public void setEgress(List<VirtualPrivateCloudNetworkPolicyRuleInput> egress) {
        this.egress = egress;
    }

    public VirtualPrivateCloudSecurityPolicyCreateParams egress_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EGRESS);
        return this;
    }

    public VirtualPrivateCloudSecurityPolicyCreateParams egress_ExplictlyNonNull() {
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

    public VirtualPrivateCloudSecurityPolicyCreateParams ingress(
            List<VirtualPrivateCloudNetworkPolicyRuleInput> ingress) {

        this.ingress = ingress;
        return this;
    }

    public VirtualPrivateCloudSecurityPolicyCreateParams addIngressItem(
            VirtualPrivateCloudNetworkPolicyRuleInput ingressItem) {
        if (this.ingress == null) {
            this.ingress = new ArrayList<VirtualPrivateCloudNetworkPolicyRuleInput>();
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
    public List<VirtualPrivateCloudNetworkPolicyRuleInput> getIngress() {
        return ingress;
    }

    public void setIngress(List<VirtualPrivateCloudNetworkPolicyRuleInput> ingress) {
        this.ingress = ingress;
    }

    public VirtualPrivateCloudSecurityPolicyCreateParams ingress_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INGRESS);
        return this;
    }

    public VirtualPrivateCloudSecurityPolicyCreateParams ingress_ExplictlyNonNull() {
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

    public VirtualPrivateCloudSecurityPolicyCreateParams applyTo(
            List<VirtualPrivateCloudSecurityPolicyApplyInput> applyTo) {

        this.applyTo = applyTo;
        return this;
    }

    public VirtualPrivateCloudSecurityPolicyCreateParams addApplyToItem(
            VirtualPrivateCloudSecurityPolicyApplyInput applyToItem) {
        this.applyTo.add(applyToItem);
        return this;
    }

    /**
     * Get applyTo
     *
     * @return applyTo
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public List<VirtualPrivateCloudSecurityPolicyApplyInput> getApplyTo() {
        return applyTo;
    }

    public void setApplyTo(List<VirtualPrivateCloudSecurityPolicyApplyInput> applyTo) {
        this.applyTo = applyTo;
    }

    public VirtualPrivateCloudSecurityPolicyCreateParams applyTo_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_APPLY_TO);
        return this;
    }

    public VirtualPrivateCloudSecurityPolicyCreateParams applyTo_ExplictlyNonNull() {
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

    public VirtualPrivateCloudSecurityPolicyCreateParams policyMode(
            VirtualPrivateCloudSecurityPolicyMode policyMode) {

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
    public VirtualPrivateCloudSecurityPolicyMode getPolicyMode() {
        return policyMode;
    }

    public void setPolicyMode(VirtualPrivateCloudSecurityPolicyMode policyMode) {
        this.policyMode = policyMode;
    }

    public VirtualPrivateCloudSecurityPolicyCreateParams policyMode_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_POLICY_MODE);
        return this;
    }

    public VirtualPrivateCloudSecurityPolicyCreateParams policyMode_ExplictlyNonNull() {
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

    public VirtualPrivateCloudSecurityPolicyCreateParams vpcId(String vpcId) {

        this.vpcId = vpcId;
        return this;
    }

    /**
     * Get vpcId
     *
     * @return vpcId
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public VirtualPrivateCloudSecurityPolicyCreateParams vpcId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VPC_ID);
        return this;
    }

    public VirtualPrivateCloudSecurityPolicyCreateParams vpcId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VPC_ID);
        return this;
    }

    public void setVpcId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VPC_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VPC_ID);
        }
    }

    public boolean getVpcId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VPC_ID);
    }

    public VirtualPrivateCloudSecurityPolicyCreateParams description(String description) {

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

    public VirtualPrivateCloudSecurityPolicyCreateParams description_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION);
        return this;
    }

    public VirtualPrivateCloudSecurityPolicyCreateParams description_ExplictlyNonNull() {
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

    public VirtualPrivateCloudSecurityPolicyCreateParams name(String name) {

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

    public VirtualPrivateCloudSecurityPolicyCreateParams name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public VirtualPrivateCloudSecurityPolicyCreateParams name_ExplictlyNonNull() {
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
        VirtualPrivateCloudSecurityPolicyCreateParams
                virtualPrivateCloudSecurityPolicyCreateParams =
                        (VirtualPrivateCloudSecurityPolicyCreateParams) o;
        return Objects.equals(this.egress, virtualPrivateCloudSecurityPolicyCreateParams.egress)
                && Objects.equals(
                        this.ingress, virtualPrivateCloudSecurityPolicyCreateParams.ingress)
                && Objects.equals(
                        this.applyTo, virtualPrivateCloudSecurityPolicyCreateParams.applyTo)
                && Objects.equals(
                        this.policyMode, virtualPrivateCloudSecurityPolicyCreateParams.policyMode)
                && Objects.equals(this.vpcId, virtualPrivateCloudSecurityPolicyCreateParams.vpcId)
                && Objects.equals(
                        this.description, virtualPrivateCloudSecurityPolicyCreateParams.description)
                && Objects.equals(this.name, virtualPrivateCloudSecurityPolicyCreateParams.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(egress, ingress, applyTo, policyMode, vpcId, description, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VirtualPrivateCloudSecurityPolicyCreateParams {\n");
        sb.append("    egress: ").append(toIndentedString(egress)).append("\n");
        sb.append("    ingress: ").append(toIndentedString(ingress)).append("\n");
        sb.append("    applyTo: ").append(toIndentedString(applyTo)).append("\n");
        sb.append("    policyMode: ").append(toIndentedString(policyMode)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
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

package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** VirtualPrivateCloudRouterGatewayCreationParams */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VirtualPrivateCloudRouterGatewayCreationParams
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_RULES = "rules";

    @SerializedName(SERIALIZED_NAME_RULES)
    private List<VirtualPrivateCloudRouterGatewayRuleInputType> rules =
            new ArrayList<VirtualPrivateCloudRouterGatewayRuleInputType>();

    public static final String SERIALIZED_NAME_ASSOCIATED_SUBNETS_IDS = "associated_subnets_ids";

    @SerializedName(SERIALIZED_NAME_ASSOCIATED_SUBNETS_IDS)
    private List<String> associatedSubnetsIds = new ArrayList<String>();

    public static final String SERIALIZED_NAME_EXTERNAL_IPS = "external_ips";

    @SerializedName(SERIALIZED_NAME_EXTERNAL_IPS)
    private List<VirtualPrivateCloudExternalIpsParams> externalIps = null;

    public static final String SERIALIZED_NAME_EXTERNAL_SUBNET_GROUP_ID =
            "external_subnet_group_id";

    @SerializedName(SERIALIZED_NAME_EXTERNAL_SUBNET_GROUP_ID)
    private String externalSubnetGroupId;

    public static final String SERIALIZED_NAME_EXTERNAL_IP = "external_ip";

    @SerializedName(SERIALIZED_NAME_EXTERNAL_IP)
    private String externalIp;

    public static final String SERIALIZED_NAME_EXTERNAL_SUBNET_ID = "external_subnet_id";

    @SerializedName(SERIALIZED_NAME_EXTERNAL_SUBNET_ID)
    private String externalSubnetId;

    public static final String SERIALIZED_NAME_VPC_ID = "vpc_id";

    @SerializedName(SERIALIZED_NAME_VPC_ID)
    private String vpcId;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public VirtualPrivateCloudRouterGatewayCreationParams() {}

    public VirtualPrivateCloudRouterGatewayCreationParams rules(
            List<VirtualPrivateCloudRouterGatewayRuleInputType> rules) {

        this.rules = rules;
        return this;
    }

    public VirtualPrivateCloudRouterGatewayCreationParams addRulesItem(
            VirtualPrivateCloudRouterGatewayRuleInputType rulesItem) {
        this.rules.add(rulesItem);
        return this;
    }

    /**
     * Get rules
     *
     * @return rules
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public List<VirtualPrivateCloudRouterGatewayRuleInputType> getRules() {
        return rules;
    }

    public void setRules(List<VirtualPrivateCloudRouterGatewayRuleInputType> rules) {
        this.rules = rules;
    }

    public VirtualPrivateCloudRouterGatewayCreationParams rules_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RULES);
        return this;
    }

    public VirtualPrivateCloudRouterGatewayCreationParams rules_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RULES);
        return this;
    }

    public void setRules_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RULES);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RULES);
        }
    }

    public boolean getRules_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RULES);
    }

    public VirtualPrivateCloudRouterGatewayCreationParams associatedSubnetsIds(
            List<String> associatedSubnetsIds) {

        this.associatedSubnetsIds = associatedSubnetsIds;
        return this;
    }

    public VirtualPrivateCloudRouterGatewayCreationParams addAssociatedSubnetsIdsItem(
            String associatedSubnetsIdsItem) {
        this.associatedSubnetsIds.add(associatedSubnetsIdsItem);
        return this;
    }

    /**
     * Get associatedSubnetsIds
     *
     * @return associatedSubnetsIds
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public List<String> getAssociatedSubnetsIds() {
        return associatedSubnetsIds;
    }

    public void setAssociatedSubnetsIds(List<String> associatedSubnetsIds) {
        this.associatedSubnetsIds = associatedSubnetsIds;
    }

    public VirtualPrivateCloudRouterGatewayCreationParams associatedSubnetsIds_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ASSOCIATED_SUBNETS_IDS);
        return this;
    }

    public VirtualPrivateCloudRouterGatewayCreationParams associatedSubnetsIds_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ASSOCIATED_SUBNETS_IDS);
        return this;
    }

    public void setAssociatedSubnetsIds_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ASSOCIATED_SUBNETS_IDS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ASSOCIATED_SUBNETS_IDS);
        }
    }

    public boolean getAssociatedSubnetsIds_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ASSOCIATED_SUBNETS_IDS);
    }

    public VirtualPrivateCloudRouterGatewayCreationParams externalIps(
            List<VirtualPrivateCloudExternalIpsParams> externalIps) {

        this.externalIps = externalIps;
        return this;
    }

    public VirtualPrivateCloudRouterGatewayCreationParams addExternalIpsItem(
            VirtualPrivateCloudExternalIpsParams externalIpsItem) {
        if (this.externalIps == null) {
            this.externalIps = new ArrayList<VirtualPrivateCloudExternalIpsParams>();
        }
        this.externalIps.add(externalIpsItem);
        return this;
    }

    /**
     * Get externalIps
     *
     * @return externalIps
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<VirtualPrivateCloudExternalIpsParams> getExternalIps() {
        return externalIps;
    }

    public void setExternalIps(List<VirtualPrivateCloudExternalIpsParams> externalIps) {
        this.externalIps = externalIps;
    }

    public VirtualPrivateCloudRouterGatewayCreationParams externalIps_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXTERNAL_IPS);
        return this;
    }

    public VirtualPrivateCloudRouterGatewayCreationParams externalIps_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EXTERNAL_IPS);
        return this;
    }

    public void setExternalIps_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EXTERNAL_IPS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EXTERNAL_IPS);
        }
    }

    public boolean getExternalIps_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EXTERNAL_IPS);
    }

    public VirtualPrivateCloudRouterGatewayCreationParams externalSubnetGroupId(
            String externalSubnetGroupId) {

        this.externalSubnetGroupId = externalSubnetGroupId;
        return this;
    }

    /**
     * Get externalSubnetGroupId
     *
     * @return externalSubnetGroupId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getExternalSubnetGroupId() {
        return externalSubnetGroupId;
    }

    public void setExternalSubnetGroupId(String externalSubnetGroupId) {
        this.externalSubnetGroupId = externalSubnetGroupId;
    }

    public VirtualPrivateCloudRouterGatewayCreationParams externalSubnetGroupId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXTERNAL_SUBNET_GROUP_ID);
        return this;
    }

    public VirtualPrivateCloudRouterGatewayCreationParams externalSubnetGroupId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EXTERNAL_SUBNET_GROUP_ID);
        return this;
    }

    public void setExternalSubnetGroupId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EXTERNAL_SUBNET_GROUP_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EXTERNAL_SUBNET_GROUP_ID);
        }
    }

    public boolean getExternalSubnetGroupId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EXTERNAL_SUBNET_GROUP_ID);
    }

    public VirtualPrivateCloudRouterGatewayCreationParams externalIp(String externalIp) {

        this.externalIp = externalIp;
        return this;
    }

    /**
     * Get externalIp
     *
     * @return externalIp
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getExternalIp() {
        return externalIp;
    }

    public void setExternalIp(String externalIp) {
        this.externalIp = externalIp;
    }

    public VirtualPrivateCloudRouterGatewayCreationParams externalIp_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXTERNAL_IP);
        return this;
    }

    public VirtualPrivateCloudRouterGatewayCreationParams externalIp_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EXTERNAL_IP);
        return this;
    }

    public void setExternalIp_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EXTERNAL_IP);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EXTERNAL_IP);
        }
    }

    public boolean getExternalIp_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EXTERNAL_IP);
    }

    public VirtualPrivateCloudRouterGatewayCreationParams externalSubnetId(
            String externalSubnetId) {

        this.externalSubnetId = externalSubnetId;
        return this;
    }

    /**
     * Get externalSubnetId
     *
     * @return externalSubnetId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getExternalSubnetId() {
        return externalSubnetId;
    }

    public void setExternalSubnetId(String externalSubnetId) {
        this.externalSubnetId = externalSubnetId;
    }

    public VirtualPrivateCloudRouterGatewayCreationParams externalSubnetId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXTERNAL_SUBNET_ID);
        return this;
    }

    public VirtualPrivateCloudRouterGatewayCreationParams externalSubnetId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EXTERNAL_SUBNET_ID);
        return this;
    }

    public void setExternalSubnetId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EXTERNAL_SUBNET_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EXTERNAL_SUBNET_ID);
        }
    }

    public boolean getExternalSubnetId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EXTERNAL_SUBNET_ID);
    }

    public VirtualPrivateCloudRouterGatewayCreationParams vpcId(String vpcId) {

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

    public VirtualPrivateCloudRouterGatewayCreationParams vpcId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VPC_ID);
        return this;
    }

    public VirtualPrivateCloudRouterGatewayCreationParams vpcId_ExplictlyNonNull() {
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

    public VirtualPrivateCloudRouterGatewayCreationParams name(String name) {

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

    public VirtualPrivateCloudRouterGatewayCreationParams name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public VirtualPrivateCloudRouterGatewayCreationParams name_ExplictlyNonNull() {
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
        VirtualPrivateCloudRouterGatewayCreationParams
                virtualPrivateCloudRouterGatewayCreationParams =
                        (VirtualPrivateCloudRouterGatewayCreationParams) o;
        return Objects.equals(this.rules, virtualPrivateCloudRouterGatewayCreationParams.rules)
                && Objects.equals(
                        this.associatedSubnetsIds,
                        virtualPrivateCloudRouterGatewayCreationParams.associatedSubnetsIds)
                && Objects.equals(
                        this.externalIps,
                        virtualPrivateCloudRouterGatewayCreationParams.externalIps)
                && Objects.equals(
                        this.externalSubnetGroupId,
                        virtualPrivateCloudRouterGatewayCreationParams.externalSubnetGroupId)
                && Objects.equals(
                        this.externalIp, virtualPrivateCloudRouterGatewayCreationParams.externalIp)
                && Objects.equals(
                        this.externalSubnetId,
                        virtualPrivateCloudRouterGatewayCreationParams.externalSubnetId)
                && Objects.equals(this.vpcId, virtualPrivateCloudRouterGatewayCreationParams.vpcId)
                && Objects.equals(this.name, virtualPrivateCloudRouterGatewayCreationParams.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                rules,
                associatedSubnetsIds,
                externalIps,
                externalSubnetGroupId,
                externalIp,
                externalSubnetId,
                vpcId,
                name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VirtualPrivateCloudRouterGatewayCreationParams {\n");
        sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
        sb.append("    associatedSubnetsIds: ")
                .append(toIndentedString(associatedSubnetsIds))
                .append("\n");
        sb.append("    externalIps: ").append(toIndentedString(externalIps)).append("\n");
        sb.append("    externalSubnetGroupId: ")
                .append(toIndentedString(externalSubnetGroupId))
                .append("\n");
        sb.append("    externalIp: ").append(toIndentedString(externalIp)).append("\n");
        sb.append("    externalSubnetId: ").append(toIndentedString(externalSubnetId)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
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

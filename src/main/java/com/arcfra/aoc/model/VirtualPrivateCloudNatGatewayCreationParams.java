package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** VirtualPrivateCloudNatGatewayCreationParams */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VirtualPrivateCloudNatGatewayCreationParams
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_EXTERNAL_IPS = "external_ips";

    @SerializedName(SERIALIZED_NAME_EXTERNAL_IPS)
    private List<VirtualPrivateCloudExternalIpsParams> externalIps = null;

    public static final String SERIALIZED_NAME_EXTERNAL_IP = "external_ip";

    @SerializedName(SERIALIZED_NAME_EXTERNAL_IP)
    private String externalIp;

    public static final String SERIALIZED_NAME_EXTERNAL_SUBNET_GROUP_ID =
            "external_subnet_group_id";

    @SerializedName(SERIALIZED_NAME_EXTERNAL_SUBNET_GROUP_ID)
    private String externalSubnetGroupId;

    public static final String SERIALIZED_NAME_EXTERNAL_SUBNET_ID = "external_subnet_id";

    @SerializedName(SERIALIZED_NAME_EXTERNAL_SUBNET_ID)
    private String externalSubnetId;

    public static final String SERIALIZED_NAME_DNAT_RULES = "dnat_rules";

    @SerializedName(SERIALIZED_NAME_DNAT_RULES)
    private List<VirtualPrivateCloudDnatRuleParams> dnatRules = null;

    public static final String SERIALIZED_NAME_ENABLE_DNAT = "enable_dnat";

    @SerializedName(SERIALIZED_NAME_ENABLE_DNAT)
    private Boolean enableDnat;

    public static final String SERIALIZED_NAME_ENABLE_SNAT = "enable_snat";

    @SerializedName(SERIALIZED_NAME_ENABLE_SNAT)
    private Boolean enableSnat;

    public static final String SERIALIZED_NAME_VPC_ID = "vpc_id";

    @SerializedName(SERIALIZED_NAME_VPC_ID)
    private String vpcId;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public VirtualPrivateCloudNatGatewayCreationParams() {}

    public VirtualPrivateCloudNatGatewayCreationParams externalIps(
            List<VirtualPrivateCloudExternalIpsParams> externalIps) {

        this.externalIps = externalIps;
        return this;
    }

    public VirtualPrivateCloudNatGatewayCreationParams addExternalIpsItem(
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

    public VirtualPrivateCloudNatGatewayCreationParams externalIps_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXTERNAL_IPS);
        return this;
    }

    public VirtualPrivateCloudNatGatewayCreationParams externalIps_ExplictlyNonNull() {
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

    public VirtualPrivateCloudNatGatewayCreationParams externalIp(String externalIp) {

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

    public VirtualPrivateCloudNatGatewayCreationParams externalIp_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXTERNAL_IP);
        return this;
    }

    public VirtualPrivateCloudNatGatewayCreationParams externalIp_ExplictlyNonNull() {
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

    public VirtualPrivateCloudNatGatewayCreationParams externalSubnetGroupId(
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

    public VirtualPrivateCloudNatGatewayCreationParams externalSubnetGroupId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXTERNAL_SUBNET_GROUP_ID);
        return this;
    }

    public VirtualPrivateCloudNatGatewayCreationParams externalSubnetGroupId_ExplictlyNonNull() {
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

    public VirtualPrivateCloudNatGatewayCreationParams externalSubnetId(String externalSubnetId) {

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

    public VirtualPrivateCloudNatGatewayCreationParams externalSubnetId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXTERNAL_SUBNET_ID);
        return this;
    }

    public VirtualPrivateCloudNatGatewayCreationParams externalSubnetId_ExplictlyNonNull() {
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

    public VirtualPrivateCloudNatGatewayCreationParams dnatRules(
            List<VirtualPrivateCloudDnatRuleParams> dnatRules) {

        this.dnatRules = dnatRules;
        return this;
    }

    public VirtualPrivateCloudNatGatewayCreationParams addDnatRulesItem(
            VirtualPrivateCloudDnatRuleParams dnatRulesItem) {
        if (this.dnatRules == null) {
            this.dnatRules = new ArrayList<VirtualPrivateCloudDnatRuleParams>();
        }
        this.dnatRules.add(dnatRulesItem);
        return this;
    }

    /**
     * Get dnatRules
     *
     * @return dnatRules
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<VirtualPrivateCloudDnatRuleParams> getDnatRules() {
        return dnatRules;
    }

    public void setDnatRules(List<VirtualPrivateCloudDnatRuleParams> dnatRules) {
        this.dnatRules = dnatRules;
    }

    public VirtualPrivateCloudNatGatewayCreationParams dnatRules_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DNAT_RULES);
        return this;
    }

    public VirtualPrivateCloudNatGatewayCreationParams dnatRules_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DNAT_RULES);
        return this;
    }

    public void setDnatRules_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DNAT_RULES);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DNAT_RULES);
        }
    }

    public boolean getDnatRules_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DNAT_RULES);
    }

    public VirtualPrivateCloudNatGatewayCreationParams enableDnat(Boolean enableDnat) {

        this.enableDnat = enableDnat;
        return this;
    }

    /**
     * Get enableDnat
     *
     * @return enableDnat
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Boolean getEnableDnat() {
        return enableDnat;
    }

    public void setEnableDnat(Boolean enableDnat) {
        this.enableDnat = enableDnat;
    }

    public VirtualPrivateCloudNatGatewayCreationParams enableDnat_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENABLE_DNAT);
        return this;
    }

    public VirtualPrivateCloudNatGatewayCreationParams enableDnat_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ENABLE_DNAT);
        return this;
    }

    public void setEnableDnat_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ENABLE_DNAT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ENABLE_DNAT);
        }
    }

    public boolean getEnableDnat_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ENABLE_DNAT);
    }

    public VirtualPrivateCloudNatGatewayCreationParams enableSnat(Boolean enableSnat) {

        this.enableSnat = enableSnat;
        return this;
    }

    /**
     * Get enableSnat
     *
     * @return enableSnat
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Boolean getEnableSnat() {
        return enableSnat;
    }

    public void setEnableSnat(Boolean enableSnat) {
        this.enableSnat = enableSnat;
    }

    public VirtualPrivateCloudNatGatewayCreationParams enableSnat_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENABLE_SNAT);
        return this;
    }

    public VirtualPrivateCloudNatGatewayCreationParams enableSnat_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ENABLE_SNAT);
        return this;
    }

    public void setEnableSnat_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ENABLE_SNAT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ENABLE_SNAT);
        }
    }

    public boolean getEnableSnat_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ENABLE_SNAT);
    }

    public VirtualPrivateCloudNatGatewayCreationParams vpcId(String vpcId) {

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

    public VirtualPrivateCloudNatGatewayCreationParams vpcId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VPC_ID);
        return this;
    }

    public VirtualPrivateCloudNatGatewayCreationParams vpcId_ExplictlyNonNull() {
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

    public VirtualPrivateCloudNatGatewayCreationParams name(String name) {

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

    public VirtualPrivateCloudNatGatewayCreationParams name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public VirtualPrivateCloudNatGatewayCreationParams name_ExplictlyNonNull() {
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
        VirtualPrivateCloudNatGatewayCreationParams virtualPrivateCloudNatGatewayCreationParams =
                (VirtualPrivateCloudNatGatewayCreationParams) o;
        return Objects.equals(
                        this.externalIps, virtualPrivateCloudNatGatewayCreationParams.externalIps)
                && Objects.equals(
                        this.externalIp, virtualPrivateCloudNatGatewayCreationParams.externalIp)
                && Objects.equals(
                        this.externalSubnetGroupId,
                        virtualPrivateCloudNatGatewayCreationParams.externalSubnetGroupId)
                && Objects.equals(
                        this.externalSubnetId,
                        virtualPrivateCloudNatGatewayCreationParams.externalSubnetId)
                && Objects.equals(
                        this.dnatRules, virtualPrivateCloudNatGatewayCreationParams.dnatRules)
                && Objects.equals(
                        this.enableDnat, virtualPrivateCloudNatGatewayCreationParams.enableDnat)
                && Objects.equals(
                        this.enableSnat, virtualPrivateCloudNatGatewayCreationParams.enableSnat)
                && Objects.equals(this.vpcId, virtualPrivateCloudNatGatewayCreationParams.vpcId)
                && Objects.equals(this.name, virtualPrivateCloudNatGatewayCreationParams.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                externalIps,
                externalIp,
                externalSubnetGroupId,
                externalSubnetId,
                dnatRules,
                enableDnat,
                enableSnat,
                vpcId,
                name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VirtualPrivateCloudNatGatewayCreationParams {\n");
        sb.append("    externalIps: ").append(toIndentedString(externalIps)).append("\n");
        sb.append("    externalIp: ").append(toIndentedString(externalIp)).append("\n");
        sb.append("    externalSubnetGroupId: ")
                .append(toIndentedString(externalSubnetGroupId))
                .append("\n");
        sb.append("    externalSubnetId: ").append(toIndentedString(externalSubnetId)).append("\n");
        sb.append("    dnatRules: ").append(toIndentedString(dnatRules)).append("\n");
        sb.append("    enableDnat: ").append(toIndentedString(enableDnat)).append("\n");
        sb.append("    enableSnat: ").append(toIndentedString(enableSnat)).append("\n");
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

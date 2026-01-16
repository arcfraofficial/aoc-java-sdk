package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** VirtualPrivateCloudRouterGatewayUpdateDataParams */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VirtualPrivateCloudRouterGatewayUpdateDataParams
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_RULES = "rules";

    @SerializedName(SERIALIZED_NAME_RULES)
    private List<VirtualPrivateCloudRouterGatewayRuleInputType> rules = null;

    public static final String SERIALIZED_NAME_ASSOCIATED_SUBNETS_IDS = "associated_subnets_ids";

    @SerializedName(SERIALIZED_NAME_ASSOCIATED_SUBNETS_IDS)
    private List<String> associatedSubnetsIds = null;

    public static final String SERIALIZED_NAME_EXTERNAL_IPS = "external_ips";

    @SerializedName(SERIALIZED_NAME_EXTERNAL_IPS)
    private List<VirtualPrivateCloudExternalIpsParams> externalIps = null;

    public static final String SERIALIZED_NAME_EXTERNAL_IP = "external_ip";

    @SerializedName(SERIALIZED_NAME_EXTERNAL_IP)
    private String externalIp;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public VirtualPrivateCloudRouterGatewayUpdateDataParams() {}

    public VirtualPrivateCloudRouterGatewayUpdateDataParams rules(
            List<VirtualPrivateCloudRouterGatewayRuleInputType> rules) {

        this.rules = rules;
        return this;
    }

    public VirtualPrivateCloudRouterGatewayUpdateDataParams addRulesItem(
            VirtualPrivateCloudRouterGatewayRuleInputType rulesItem) {
        if (this.rules == null) {
            this.rules = new ArrayList<VirtualPrivateCloudRouterGatewayRuleInputType>();
        }
        this.rules.add(rulesItem);
        return this;
    }

    /**
     * Get rules
     *
     * @return rules
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<VirtualPrivateCloudRouterGatewayRuleInputType> getRules() {
        return rules;
    }

    public void setRules(List<VirtualPrivateCloudRouterGatewayRuleInputType> rules) {
        this.rules = rules;
    }

    public VirtualPrivateCloudRouterGatewayUpdateDataParams rules_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RULES);
        return this;
    }

    public VirtualPrivateCloudRouterGatewayUpdateDataParams rules_ExplictlyNonNull() {
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

    public VirtualPrivateCloudRouterGatewayUpdateDataParams associatedSubnetsIds(
            List<String> associatedSubnetsIds) {

        this.associatedSubnetsIds = associatedSubnetsIds;
        return this;
    }

    public VirtualPrivateCloudRouterGatewayUpdateDataParams addAssociatedSubnetsIdsItem(
            String associatedSubnetsIdsItem) {
        if (this.associatedSubnetsIds == null) {
            this.associatedSubnetsIds = new ArrayList<String>();
        }
        this.associatedSubnetsIds.add(associatedSubnetsIdsItem);
        return this;
    }

    /**
     * Get associatedSubnetsIds
     *
     * @return associatedSubnetsIds
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getAssociatedSubnetsIds() {
        return associatedSubnetsIds;
    }

    public void setAssociatedSubnetsIds(List<String> associatedSubnetsIds) {
        this.associatedSubnetsIds = associatedSubnetsIds;
    }

    public VirtualPrivateCloudRouterGatewayUpdateDataParams associatedSubnetsIds_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ASSOCIATED_SUBNETS_IDS);
        return this;
    }

    public VirtualPrivateCloudRouterGatewayUpdateDataParams
            associatedSubnetsIds_ExplictlyNonNull() {
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

    public VirtualPrivateCloudRouterGatewayUpdateDataParams externalIps(
            List<VirtualPrivateCloudExternalIpsParams> externalIps) {

        this.externalIps = externalIps;
        return this;
    }

    public VirtualPrivateCloudRouterGatewayUpdateDataParams addExternalIpsItem(
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

    public VirtualPrivateCloudRouterGatewayUpdateDataParams externalIps_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXTERNAL_IPS);
        return this;
    }

    public VirtualPrivateCloudRouterGatewayUpdateDataParams externalIps_ExplictlyNonNull() {
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

    public VirtualPrivateCloudRouterGatewayUpdateDataParams externalIp(String externalIp) {

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

    public VirtualPrivateCloudRouterGatewayUpdateDataParams externalIp_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXTERNAL_IP);
        return this;
    }

    public VirtualPrivateCloudRouterGatewayUpdateDataParams externalIp_ExplictlyNonNull() {
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

    public VirtualPrivateCloudRouterGatewayUpdateDataParams name(String name) {

        this.name = name;
        return this;
    }

    /**
     * Get name
     *
     * @return name
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public VirtualPrivateCloudRouterGatewayUpdateDataParams name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public VirtualPrivateCloudRouterGatewayUpdateDataParams name_ExplictlyNonNull() {
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
        VirtualPrivateCloudRouterGatewayUpdateDataParams
                virtualPrivateCloudRouterGatewayUpdateDataParams =
                        (VirtualPrivateCloudRouterGatewayUpdateDataParams) o;
        return Objects.equals(this.rules, virtualPrivateCloudRouterGatewayUpdateDataParams.rules)
                && Objects.equals(
                        this.associatedSubnetsIds,
                        virtualPrivateCloudRouterGatewayUpdateDataParams.associatedSubnetsIds)
                && Objects.equals(
                        this.externalIps,
                        virtualPrivateCloudRouterGatewayUpdateDataParams.externalIps)
                && Objects.equals(
                        this.externalIp,
                        virtualPrivateCloudRouterGatewayUpdateDataParams.externalIp)
                && Objects.equals(this.name, virtualPrivateCloudRouterGatewayUpdateDataParams.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rules, associatedSubnetsIds, externalIps, externalIp, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VirtualPrivateCloudRouterGatewayUpdateDataParams {\n");
        sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
        sb.append("    associatedSubnetsIds: ")
                .append(toIndentedString(associatedSubnetsIds))
                .append("\n");
        sb.append("    externalIps: ").append(toIndentedString(externalIps)).append("\n");
        sb.append("    externalIp: ").append(toIndentedString(externalIp)).append("\n");
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

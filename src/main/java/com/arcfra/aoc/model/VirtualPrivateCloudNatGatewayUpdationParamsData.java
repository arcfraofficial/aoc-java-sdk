package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** VirtualPrivateCloudNatGatewayUpdationParamsData */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VirtualPrivateCloudNatGatewayUpdationParamsData
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_EXTERNAL_IPS = "external_ips";

    @SerializedName(SERIALIZED_NAME_EXTERNAL_IPS)
    private List<VirtualPrivateCloudExternalIpsParams> externalIps = null;

    public static final String SERIALIZED_NAME_EXTERNAL_IP = "external_ip";

    @SerializedName(SERIALIZED_NAME_EXTERNAL_IP)
    private String externalIp;

    public static final String SERIALIZED_NAME_DNAT_RULES = "dnat_rules";

    @SerializedName(SERIALIZED_NAME_DNAT_RULES)
    private List<VirtualPrivateCloudDnatRuleParams> dnatRules = null;

    public static final String SERIALIZED_NAME_ENABLE_DNAT = "enable_dnat";

    @SerializedName(SERIALIZED_NAME_ENABLE_DNAT)
    private Boolean enableDnat;

    public static final String SERIALIZED_NAME_ENABLE_SNAT = "enable_snat";

    @SerializedName(SERIALIZED_NAME_ENABLE_SNAT)
    private Boolean enableSnat;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public VirtualPrivateCloudNatGatewayUpdationParamsData() {}

    public VirtualPrivateCloudNatGatewayUpdationParamsData externalIps(
            List<VirtualPrivateCloudExternalIpsParams> externalIps) {

        this.externalIps = externalIps;
        return this;
    }

    public VirtualPrivateCloudNatGatewayUpdationParamsData addExternalIpsItem(
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

    public VirtualPrivateCloudNatGatewayUpdationParamsData externalIps_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXTERNAL_IPS);
        return this;
    }

    public VirtualPrivateCloudNatGatewayUpdationParamsData externalIps_ExplictlyNonNull() {
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

    public VirtualPrivateCloudNatGatewayUpdationParamsData externalIp(String externalIp) {

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

    public VirtualPrivateCloudNatGatewayUpdationParamsData externalIp_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXTERNAL_IP);
        return this;
    }

    public VirtualPrivateCloudNatGatewayUpdationParamsData externalIp_ExplictlyNonNull() {
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

    public VirtualPrivateCloudNatGatewayUpdationParamsData dnatRules(
            List<VirtualPrivateCloudDnatRuleParams> dnatRules) {

        this.dnatRules = dnatRules;
        return this;
    }

    public VirtualPrivateCloudNatGatewayUpdationParamsData addDnatRulesItem(
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

    public VirtualPrivateCloudNatGatewayUpdationParamsData dnatRules_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DNAT_RULES);
        return this;
    }

    public VirtualPrivateCloudNatGatewayUpdationParamsData dnatRules_ExplictlyNonNull() {
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

    public VirtualPrivateCloudNatGatewayUpdationParamsData enableDnat(Boolean enableDnat) {

        this.enableDnat = enableDnat;
        return this;
    }

    /**
     * Get enableDnat
     *
     * @return enableDnat
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getEnableDnat() {
        return enableDnat;
    }

    public void setEnableDnat(Boolean enableDnat) {
        this.enableDnat = enableDnat;
    }

    public VirtualPrivateCloudNatGatewayUpdationParamsData enableDnat_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENABLE_DNAT);
        return this;
    }

    public VirtualPrivateCloudNatGatewayUpdationParamsData enableDnat_ExplictlyNonNull() {
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

    public VirtualPrivateCloudNatGatewayUpdationParamsData enableSnat(Boolean enableSnat) {

        this.enableSnat = enableSnat;
        return this;
    }

    /**
     * Get enableSnat
     *
     * @return enableSnat
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getEnableSnat() {
        return enableSnat;
    }

    public void setEnableSnat(Boolean enableSnat) {
        this.enableSnat = enableSnat;
    }

    public VirtualPrivateCloudNatGatewayUpdationParamsData enableSnat_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENABLE_SNAT);
        return this;
    }

    public VirtualPrivateCloudNatGatewayUpdationParamsData enableSnat_ExplictlyNonNull() {
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

    public VirtualPrivateCloudNatGatewayUpdationParamsData name(String name) {

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

    public VirtualPrivateCloudNatGatewayUpdationParamsData name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public VirtualPrivateCloudNatGatewayUpdationParamsData name_ExplictlyNonNull() {
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
        VirtualPrivateCloudNatGatewayUpdationParamsData
                virtualPrivateCloudNatGatewayUpdationParamsData =
                        (VirtualPrivateCloudNatGatewayUpdationParamsData) o;
        return Objects.equals(
                        this.externalIps,
                        virtualPrivateCloudNatGatewayUpdationParamsData.externalIps)
                && Objects.equals(
                        this.externalIp, virtualPrivateCloudNatGatewayUpdationParamsData.externalIp)
                && Objects.equals(
                        this.dnatRules, virtualPrivateCloudNatGatewayUpdationParamsData.dnatRules)
                && Objects.equals(
                        this.enableDnat, virtualPrivateCloudNatGatewayUpdationParamsData.enableDnat)
                && Objects.equals(
                        this.enableSnat, virtualPrivateCloudNatGatewayUpdationParamsData.enableSnat)
                && Objects.equals(this.name, virtualPrivateCloudNatGatewayUpdationParamsData.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(externalIps, externalIp, dnatRules, enableDnat, enableSnat, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VirtualPrivateCloudNatGatewayUpdationParamsData {\n");
        sb.append("    externalIps: ").append(toIndentedString(externalIps)).append("\n");
        sb.append("    externalIp: ").append(toIndentedString(externalIp)).append("\n");
        sb.append("    dnatRules: ").append(toIndentedString(dnatRules)).append("\n");
        sb.append("    enableDnat: ").append(toIndentedString(enableDnat)).append("\n");
        sb.append("    enableSnat: ").append(toIndentedString(enableSnat)).append("\n");
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

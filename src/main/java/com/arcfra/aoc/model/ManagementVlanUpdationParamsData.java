package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** ManagementVlanUpdationParamsData */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class ManagementVlanUpdationParamsData
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_EXTRA_IP = "extra_ip";

    @SerializedName(SERIALIZED_NAME_EXTRA_IP)
    private List<ExtraIp> extraIp = null;

    public static final String SERIALIZED_NAME_SUBNETMASK = "subnetmask";

    @SerializedName(SERIALIZED_NAME_SUBNETMASK)
    private String subnetmask;

    public static final String SERIALIZED_NAME_GATEWAY_IP = "gateway_ip";

    @SerializedName(SERIALIZED_NAME_GATEWAY_IP)
    private String gatewayIp;

    public static final String SERIALIZED_NAME_VLAN_ID = "vlan_id";

    @SerializedName(SERIALIZED_NAME_VLAN_ID)
    private Integer vlanId;

    public ManagementVlanUpdationParamsData() {}

    public ManagementVlanUpdationParamsData extraIp(List<ExtraIp> extraIp) {

        this.extraIp = extraIp;
        return this;
    }

    public ManagementVlanUpdationParamsData addExtraIpItem(ExtraIp extraIpItem) {
        if (this.extraIp == null) {
            this.extraIp = new ArrayList<ExtraIp>();
        }
        this.extraIp.add(extraIpItem);
        return this;
    }

    /**
     * Get extraIp
     *
     * @return extraIp
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<ExtraIp> getExtraIp() {
        return extraIp;
    }

    public void setExtraIp(List<ExtraIp> extraIp) {
        this.extraIp = extraIp;
    }

    public ManagementVlanUpdationParamsData extraIp_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXTRA_IP);
        return this;
    }

    public ManagementVlanUpdationParamsData extraIp_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EXTRA_IP);
        return this;
    }

    public void setExtraIp_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EXTRA_IP);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EXTRA_IP);
        }
    }

    public boolean getExtraIp_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EXTRA_IP);
    }

    public ManagementVlanUpdationParamsData subnetmask(String subnetmask) {

        this.subnetmask = subnetmask;
        return this;
    }

    /**
     * Get subnetmask
     *
     * @return subnetmask
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSubnetmask() {
        return subnetmask;
    }

    public void setSubnetmask(String subnetmask) {
        this.subnetmask = subnetmask;
    }

    public ManagementVlanUpdationParamsData subnetmask_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUBNETMASK);
        return this;
    }

    public ManagementVlanUpdationParamsData subnetmask_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SUBNETMASK);
        return this;
    }

    public void setSubnetmask_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SUBNETMASK);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SUBNETMASK);
        }
    }

    public boolean getSubnetmask_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SUBNETMASK);
    }

    public ManagementVlanUpdationParamsData gatewayIp(String gatewayIp) {

        this.gatewayIp = gatewayIp;
        return this;
    }

    /**
     * Get gatewayIp
     *
     * @return gatewayIp
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getGatewayIp() {
        return gatewayIp;
    }

    public void setGatewayIp(String gatewayIp) {
        this.gatewayIp = gatewayIp;
    }

    public ManagementVlanUpdationParamsData gatewayIp_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_GATEWAY_IP);
        return this;
    }

    public ManagementVlanUpdationParamsData gatewayIp_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_GATEWAY_IP);
        return this;
    }

    public void setGatewayIp_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_GATEWAY_IP);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_GATEWAY_IP);
        }
    }

    public boolean getGatewayIp_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_GATEWAY_IP);
    }

    public ManagementVlanUpdationParamsData vlanId(Integer vlanId) {

        this.vlanId = vlanId;
        return this;
    }

    /**
     * Get vlanId minimum: 0 maximum: 4095
     *
     * @return vlanId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getVlanId() {
        return vlanId;
    }

    public void setVlanId(Integer vlanId) {
        this.vlanId = vlanId;
    }

    public ManagementVlanUpdationParamsData vlanId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VLAN_ID);
        return this;
    }

    public ManagementVlanUpdationParamsData vlanId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VLAN_ID);
        return this;
    }

    public void setVlanId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VLAN_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VLAN_ID);
        }
    }

    public boolean getVlanId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VLAN_ID);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ManagementVlanUpdationParamsData managementVlanUpdationParamsData =
                (ManagementVlanUpdationParamsData) o;
        return Objects.equals(this.extraIp, managementVlanUpdationParamsData.extraIp)
                && Objects.equals(this.subnetmask, managementVlanUpdationParamsData.subnetmask)
                && Objects.equals(this.gatewayIp, managementVlanUpdationParamsData.gatewayIp)
                && Objects.equals(this.vlanId, managementVlanUpdationParamsData.vlanId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(extraIp, subnetmask, gatewayIp, vlanId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ManagementVlanUpdationParamsData {\n");
        sb.append("    extraIp: ").append(toIndentedString(extraIp)).append("\n");
        sb.append("    subnetmask: ").append(toIndentedString(subnetmask)).append("\n");
        sb.append("    gatewayIp: ").append(toIndentedString(gatewayIp)).append("\n");
        sb.append("    vlanId: ").append(toIndentedString(vlanId)).append("\n");
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

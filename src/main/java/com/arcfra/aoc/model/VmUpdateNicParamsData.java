package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** VmUpdateNicParamsData */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VmUpdateNicParamsData
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_VPC_NIC = "vpc_nic";

    @SerializedName(SERIALIZED_NAME_VPC_NIC)
    private UpdateVpcNicPayloads vpcNic;

    public static final String SERIALIZED_NAME_SUBNET_MASK = "subnet_mask";

    @SerializedName(SERIALIZED_NAME_SUBNET_MASK)
    private String subnetMask;

    public static final String SERIALIZED_NAME_GATEWAY = "gateway";

    @SerializedName(SERIALIZED_NAME_GATEWAY)
    private String gateway;

    public static final String SERIALIZED_NAME_IP_ADDRESS = "ip_address";

    @SerializedName(SERIALIZED_NAME_IP_ADDRESS)
    private String ipAddress;

    public static final String SERIALIZED_NAME_NIC_ID = "nic_id";

    @SerializedName(SERIALIZED_NAME_NIC_ID)
    private String nicId;

    public static final String SERIALIZED_NAME_CONNECT_VLAN_ID = "connect_vlan_id";

    @SerializedName(SERIALIZED_NAME_CONNECT_VLAN_ID)
    private String connectVlanId;

    public static final String SERIALIZED_NAME_MIRROR = "mirror";

    @SerializedName(SERIALIZED_NAME_MIRROR)
    private Boolean mirror;

    public static final String SERIALIZED_NAME_MODEL = "model";

    @SerializedName(SERIALIZED_NAME_MODEL)
    private VmNicModel model;

    public static final String SERIALIZED_NAME_ENABLED = "enabled";

    @SerializedName(SERIALIZED_NAME_ENABLED)
    private Boolean enabled;

    public static final String SERIALIZED_NAME_MAC_ADDRESS = "mac_address";

    @SerializedName(SERIALIZED_NAME_MAC_ADDRESS)
    private String macAddress;

    public static final String SERIALIZED_NAME_NIC_INDEX = "nic_index";

    @SerializedName(SERIALIZED_NAME_NIC_INDEX)
    private Integer nicIndex;

    public VmUpdateNicParamsData() {}

    public VmUpdateNicParamsData vpcNic(UpdateVpcNicPayloads vpcNic) {

        this.vpcNic = vpcNic;
        return this;
    }

    /**
     * Get vpcNic
     *
     * @return vpcNic
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public UpdateVpcNicPayloads getVpcNic() {
        return vpcNic;
    }

    public void setVpcNic(UpdateVpcNicPayloads vpcNic) {
        this.vpcNic = vpcNic;
    }

    public VmUpdateNicParamsData vpcNic_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VPC_NIC);
        return this;
    }

    public VmUpdateNicParamsData vpcNic_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VPC_NIC);
        return this;
    }

    public void setVpcNic_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VPC_NIC);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VPC_NIC);
        }
    }

    public boolean getVpcNic_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VPC_NIC);
    }

    public VmUpdateNicParamsData subnetMask(String subnetMask) {

        this.subnetMask = subnetMask;
        return this;
    }

    /**
     * Get subnetMask
     *
     * @return subnetMask
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSubnetMask() {
        return subnetMask;
    }

    public void setSubnetMask(String subnetMask) {
        this.subnetMask = subnetMask;
    }

    public VmUpdateNicParamsData subnetMask_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUBNET_MASK);
        return this;
    }

    public VmUpdateNicParamsData subnetMask_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SUBNET_MASK);
        return this;
    }

    public void setSubnetMask_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SUBNET_MASK);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SUBNET_MASK);
        }
    }

    public boolean getSubnetMask_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SUBNET_MASK);
    }

    public VmUpdateNicParamsData gateway(String gateway) {

        this.gateway = gateway;
        return this;
    }

    /**
     * Get gateway
     *
     * @return gateway
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getGateway() {
        return gateway;
    }

    public void setGateway(String gateway) {
        this.gateway = gateway;
    }

    public VmUpdateNicParamsData gateway_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_GATEWAY);
        return this;
    }

    public VmUpdateNicParamsData gateway_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_GATEWAY);
        return this;
    }

    public void setGateway_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_GATEWAY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_GATEWAY);
        }
    }

    public boolean getGateway_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_GATEWAY);
    }

    public VmUpdateNicParamsData ipAddress(String ipAddress) {

        this.ipAddress = ipAddress;
        return this;
    }

    /**
     * Get ipAddress
     *
     * @return ipAddress
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public VmUpdateNicParamsData ipAddress_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_ADDRESS);
        return this;
    }

    public VmUpdateNicParamsData ipAddress_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IP_ADDRESS);
        return this;
    }

    public void setIpAddress_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IP_ADDRESS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IP_ADDRESS);
        }
    }

    public boolean getIpAddress_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IP_ADDRESS);
    }

    public VmUpdateNicParamsData nicId(String nicId) {

        this.nicId = nicId;
        return this;
    }

    /**
     * Get nicId
     *
     * @return nicId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNicId() {
        return nicId;
    }

    public void setNicId(String nicId) {
        this.nicId = nicId;
    }

    public VmUpdateNicParamsData nicId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NIC_ID);
        return this;
    }

    public VmUpdateNicParamsData nicId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NIC_ID);
        return this;
    }

    public void setNicId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NIC_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NIC_ID);
        }
    }

    public boolean getNicId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NIC_ID);
    }

    public VmUpdateNicParamsData connectVlanId(String connectVlanId) {

        this.connectVlanId = connectVlanId;
        return this;
    }

    /**
     * Get connectVlanId
     *
     * @return connectVlanId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getConnectVlanId() {
        return connectVlanId;
    }

    public void setConnectVlanId(String connectVlanId) {
        this.connectVlanId = connectVlanId;
    }

    public VmUpdateNicParamsData connectVlanId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CONNECT_VLAN_ID);
        return this;
    }

    public VmUpdateNicParamsData connectVlanId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CONNECT_VLAN_ID);
        return this;
    }

    public void setConnectVlanId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CONNECT_VLAN_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CONNECT_VLAN_ID);
        }
    }

    public boolean getConnectVlanId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CONNECT_VLAN_ID);
    }

    public VmUpdateNicParamsData mirror(Boolean mirror) {

        this.mirror = mirror;
        return this;
    }

    /**
     * Get mirror
     *
     * @return mirror
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getMirror() {
        return mirror;
    }

    public void setMirror(Boolean mirror) {
        this.mirror = mirror;
    }

    public VmUpdateNicParamsData mirror_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MIRROR);
        return this;
    }

    public VmUpdateNicParamsData mirror_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MIRROR);
        return this;
    }

    public void setMirror_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MIRROR);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MIRROR);
        }
    }

    public boolean getMirror_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MIRROR);
    }

    public VmUpdateNicParamsData model(VmNicModel model) {

        this.model = model;
        return this;
    }

    /**
     * Get model
     *
     * @return model
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmNicModel getModel() {
        return model;
    }

    public void setModel(VmNicModel model) {
        this.model = model;
    }

    public VmUpdateNicParamsData model_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MODEL);
        return this;
    }

    public VmUpdateNicParamsData model_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MODEL);
        return this;
    }

    public void setModel_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MODEL);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MODEL);
        }
    }

    public boolean getModel_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MODEL);
    }

    public VmUpdateNicParamsData enabled(Boolean enabled) {

        this.enabled = enabled;
        return this;
    }

    /**
     * Get enabled
     *
     * @return enabled
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public VmUpdateNicParamsData enabled_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENABLED);
        return this;
    }

    public VmUpdateNicParamsData enabled_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ENABLED);
        return this;
    }

    public void setEnabled_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ENABLED);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ENABLED);
        }
    }

    public boolean getEnabled_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ENABLED);
    }

    public VmUpdateNicParamsData macAddress(String macAddress) {

        this.macAddress = macAddress;
        return this;
    }

    /**
     * Get macAddress
     *
     * @return macAddress
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMacAddress() {
        return macAddress;
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    public VmUpdateNicParamsData macAddress_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAC_ADDRESS);
        return this;
    }

    public VmUpdateNicParamsData macAddress_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAC_ADDRESS);
        return this;
    }

    public void setMacAddress_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAC_ADDRESS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAC_ADDRESS);
        }
    }

    public boolean getMacAddress_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAC_ADDRESS);
    }

    public VmUpdateNicParamsData nicIndex(Integer nicIndex) {

        this.nicIndex = nicIndex;
        return this;
    }

    /**
     * Get nicIndex
     *
     * @return nicIndex
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Integer getNicIndex() {
        return nicIndex;
    }

    public void setNicIndex(Integer nicIndex) {
        this.nicIndex = nicIndex;
    }

    public VmUpdateNicParamsData nicIndex_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NIC_INDEX);
        return this;
    }

    public VmUpdateNicParamsData nicIndex_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NIC_INDEX);
        return this;
    }

    public void setNicIndex_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NIC_INDEX);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NIC_INDEX);
        }
    }

    public boolean getNicIndex_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NIC_INDEX);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VmUpdateNicParamsData vmUpdateNicParamsData = (VmUpdateNicParamsData) o;
        return Objects.equals(this.vpcNic, vmUpdateNicParamsData.vpcNic)
                && Objects.equals(this.subnetMask, vmUpdateNicParamsData.subnetMask)
                && Objects.equals(this.gateway, vmUpdateNicParamsData.gateway)
                && Objects.equals(this.ipAddress, vmUpdateNicParamsData.ipAddress)
                && Objects.equals(this.nicId, vmUpdateNicParamsData.nicId)
                && Objects.equals(this.connectVlanId, vmUpdateNicParamsData.connectVlanId)
                && Objects.equals(this.mirror, vmUpdateNicParamsData.mirror)
                && Objects.equals(this.model, vmUpdateNicParamsData.model)
                && Objects.equals(this.enabled, vmUpdateNicParamsData.enabled)
                && Objects.equals(this.macAddress, vmUpdateNicParamsData.macAddress)
                && Objects.equals(this.nicIndex, vmUpdateNicParamsData.nicIndex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                vpcNic,
                subnetMask,
                gateway,
                ipAddress,
                nicId,
                connectVlanId,
                mirror,
                model,
                enabled,
                macAddress,
                nicIndex);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VmUpdateNicParamsData {\n");
        sb.append("    vpcNic: ").append(toIndentedString(vpcNic)).append("\n");
        sb.append("    subnetMask: ").append(toIndentedString(subnetMask)).append("\n");
        sb.append("    gateway: ").append(toIndentedString(gateway)).append("\n");
        sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
        sb.append("    nicId: ").append(toIndentedString(nicId)).append("\n");
        sb.append("    connectVlanId: ").append(toIndentedString(connectVlanId)).append("\n");
        sb.append("    mirror: ").append(toIndentedString(mirror)).append("\n");
        sb.append("    model: ").append(toIndentedString(model)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    macAddress: ").append(toIndentedString(macAddress)).append("\n");
        sb.append("    nicIndex: ").append(toIndentedString(nicIndex)).append("\n");
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

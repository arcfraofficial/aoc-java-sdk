package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** VmNicParams */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VmNicParams extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_VPC_NIC = "vpc_nic";

    @SerializedName(SERIALIZED_NAME_VPC_NIC)
    private VpcNicParams vpcNic;

    public static final String SERIALIZED_NAME_TYPE = "type";

    @SerializedName(SERIALIZED_NAME_TYPE)
    private VmNicType type;

    public static final String SERIALIZED_NAME_QOS = "qos";

    @SerializedName(SERIALIZED_NAME_QOS)
    private VmNicQosOption qos;

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

    public static final String SERIALIZED_NAME_LOCAL_ID = "local_id";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID)
    private String localId;

    public VmNicParams() {}

    public VmNicParams vpcNic(VpcNicParams vpcNic) {

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
    public VpcNicParams getVpcNic() {
        return vpcNic;
    }

    public void setVpcNic(VpcNicParams vpcNic) {
        this.vpcNic = vpcNic;
    }

    public VmNicParams vpcNic_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VPC_NIC);
        return this;
    }

    public VmNicParams vpcNic_ExplictlyNonNull() {
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

    public VmNicParams type(VmNicType type) {

        this.type = type;
        return this;
    }

    /**
     * Get type
     *
     * @return type
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmNicType getType() {
        return type;
    }

    public void setType(VmNicType type) {
        this.type = type;
    }

    public VmNicParams type_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE);
        return this;
    }

    public VmNicParams type_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TYPE);
        return this;
    }

    public void setType_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TYPE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TYPE);
        }
    }

    public boolean getType_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TYPE);
    }

    public VmNicParams qos(VmNicQosOption qos) {

        this.qos = qos;
        return this;
    }

    /**
     * Get qos
     *
     * @return qos
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmNicQosOption getQos() {
        return qos;
    }

    public void setQos(VmNicQosOption qos) {
        this.qos = qos;
    }

    public VmNicParams qos_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_QOS);
        return this;
    }

    public VmNicParams qos_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_QOS);
        return this;
    }

    public void setQos_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_QOS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_QOS);
        }
    }

    public boolean getQos_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_QOS);
    }

    public VmNicParams subnetMask(String subnetMask) {

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

    public VmNicParams subnetMask_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUBNET_MASK);
        return this;
    }

    public VmNicParams subnetMask_ExplictlyNonNull() {
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

    public VmNicParams gateway(String gateway) {

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

    public VmNicParams gateway_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_GATEWAY);
        return this;
    }

    public VmNicParams gateway_ExplictlyNonNull() {
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

    public VmNicParams ipAddress(String ipAddress) {

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

    public VmNicParams ipAddress_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_ADDRESS);
        return this;
    }

    public VmNicParams ipAddress_ExplictlyNonNull() {
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

    public VmNicParams nicId(String nicId) {

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

    public VmNicParams nicId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NIC_ID);
        return this;
    }

    public VmNicParams nicId_ExplictlyNonNull() {
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

    public VmNicParams connectVlanId(String connectVlanId) {

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

    public VmNicParams connectVlanId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CONNECT_VLAN_ID);
        return this;
    }

    public VmNicParams connectVlanId_ExplictlyNonNull() {
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

    public VmNicParams mirror(Boolean mirror) {

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

    public VmNicParams mirror_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MIRROR);
        return this;
    }

    public VmNicParams mirror_ExplictlyNonNull() {
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

    public VmNicParams model(VmNicModel model) {

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

    public VmNicParams model_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MODEL);
        return this;
    }

    public VmNicParams model_ExplictlyNonNull() {
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

    public VmNicParams enabled(Boolean enabled) {

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

    public VmNicParams enabled_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENABLED);
        return this;
    }

    public VmNicParams enabled_ExplictlyNonNull() {
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

    public VmNicParams macAddress(String macAddress) {

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

    public VmNicParams macAddress_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAC_ADDRESS);
        return this;
    }

    public VmNicParams macAddress_ExplictlyNonNull() {
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

    public VmNicParams localId(String localId) {

        this.localId = localId;
        return this;
    }

    /**
     * Get localId
     *
     * @return localId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalId() {
        return localId;
    }

    public void setLocalId(String localId) {
        this.localId = localId;
    }

    public VmNicParams localId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID);
        return this;
    }

    public VmNicParams localId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID);
        return this;
    }

    public void setLocalId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID);
        }
    }

    public boolean getLocalId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VmNicParams vmNicParams = (VmNicParams) o;
        return Objects.equals(this.vpcNic, vmNicParams.vpcNic)
                && Objects.equals(this.type, vmNicParams.type)
                && Objects.equals(this.qos, vmNicParams.qos)
                && Objects.equals(this.subnetMask, vmNicParams.subnetMask)
                && Objects.equals(this.gateway, vmNicParams.gateway)
                && Objects.equals(this.ipAddress, vmNicParams.ipAddress)
                && Objects.equals(this.nicId, vmNicParams.nicId)
                && Objects.equals(this.connectVlanId, vmNicParams.connectVlanId)
                && Objects.equals(this.mirror, vmNicParams.mirror)
                && Objects.equals(this.model, vmNicParams.model)
                && Objects.equals(this.enabled, vmNicParams.enabled)
                && Objects.equals(this.macAddress, vmNicParams.macAddress)
                && Objects.equals(this.localId, vmNicParams.localId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                vpcNic,
                type,
                qos,
                subnetMask,
                gateway,
                ipAddress,
                nicId,
                connectVlanId,
                mirror,
                model,
                enabled,
                macAddress,
                localId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VmNicParams {\n");
        sb.append("    vpcNic: ").append(toIndentedString(vpcNic)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    qos: ").append(toIndentedString(qos)).append("\n");
        sb.append("    subnetMask: ").append(toIndentedString(subnetMask)).append("\n");
        sb.append("    gateway: ").append(toIndentedString(gateway)).append("\n");
        sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
        sb.append("    nicId: ").append(toIndentedString(nicId)).append("\n");
        sb.append("    connectVlanId: ").append(toIndentedString(connectVlanId)).append("\n");
        sb.append("    mirror: ").append(toIndentedString(mirror)).append("\n");
        sb.append("    model: ").append(toIndentedString(model)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    macAddress: ").append(toIndentedString(macAddress)).append("\n");
        sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
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

package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** VmUpdateNicBasicInfoParamsData */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VmUpdateNicBasicInfoParamsData
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_SUBNET_MASK = "subnet_mask";

    @SerializedName(SERIALIZED_NAME_SUBNET_MASK)
    private String subnetMask;

    public static final String SERIALIZED_NAME_GATEWAY = "gateway";

    @SerializedName(SERIALIZED_NAME_GATEWAY)
    private String gateway;

    public static final String SERIALIZED_NAME_IP_ADDRESS = "ip_address";

    @SerializedName(SERIALIZED_NAME_IP_ADDRESS)
    private String ipAddress;

    public VmUpdateNicBasicInfoParamsData() {}

    public VmUpdateNicBasicInfoParamsData subnetMask(String subnetMask) {

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

    public VmUpdateNicBasicInfoParamsData subnetMask_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUBNET_MASK);
        return this;
    }

    public VmUpdateNicBasicInfoParamsData subnetMask_ExplictlyNonNull() {
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

    public VmUpdateNicBasicInfoParamsData gateway(String gateway) {

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

    public VmUpdateNicBasicInfoParamsData gateway_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_GATEWAY);
        return this;
    }

    public VmUpdateNicBasicInfoParamsData gateway_ExplictlyNonNull() {
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

    public VmUpdateNicBasicInfoParamsData ipAddress(String ipAddress) {

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

    public VmUpdateNicBasicInfoParamsData ipAddress_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_ADDRESS);
        return this;
    }

    public VmUpdateNicBasicInfoParamsData ipAddress_ExplictlyNonNull() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VmUpdateNicBasicInfoParamsData vmUpdateNicBasicInfoParamsData =
                (VmUpdateNicBasicInfoParamsData) o;
        return Objects.equals(this.subnetMask, vmUpdateNicBasicInfoParamsData.subnetMask)
                && Objects.equals(this.gateway, vmUpdateNicBasicInfoParamsData.gateway)
                && Objects.equals(this.ipAddress, vmUpdateNicBasicInfoParamsData.ipAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subnetMask, gateway, ipAddress);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VmUpdateNicBasicInfoParamsData {\n");
        sb.append("    subnetMask: ").append(toIndentedString(subnetMask)).append("\n");
        sb.append("    gateway: ").append(toIndentedString(gateway)).append("\n");
        sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
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

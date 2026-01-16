package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** VpcNicParams */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VpcNicParams extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_IP_ADDRESSES = "ip_addresses";

    @SerializedName(SERIALIZED_NAME_IP_ADDRESSES)
    private List<String> ipAddresses = null;

    public static final String SERIALIZED_NAME_FLOATING_IP_ID = "floating_ip_id";

    @SerializedName(SERIALIZED_NAME_FLOATING_IP_ID)
    private String floatingIpId;

    public static final String SERIALIZED_NAME_VPC_SUBNET_ID = "vpc_subnet_id";

    @SerializedName(SERIALIZED_NAME_VPC_SUBNET_ID)
    private String vpcSubnetId;

    public static final String SERIALIZED_NAME_VPC_ID = "vpc_id";

    @SerializedName(SERIALIZED_NAME_VPC_ID)
    private String vpcId;

    public VpcNicParams() {}

    public VpcNicParams ipAddresses(List<String> ipAddresses) {

        this.ipAddresses = ipAddresses;
        return this;
    }

    public VpcNicParams addIpAddressesItem(String ipAddressesItem) {
        if (this.ipAddresses == null) {
            this.ipAddresses = new ArrayList<String>();
        }
        this.ipAddresses.add(ipAddressesItem);
        return this;
    }

    /**
     * Get ipAddresses
     *
     * @return ipAddresses
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getIpAddresses() {
        return ipAddresses;
    }

    public void setIpAddresses(List<String> ipAddresses) {
        this.ipAddresses = ipAddresses;
    }

    public VpcNicParams ipAddresses_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_ADDRESSES);
        return this;
    }

    public VpcNicParams ipAddresses_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IP_ADDRESSES);
        return this;
    }

    public void setIpAddresses_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IP_ADDRESSES);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IP_ADDRESSES);
        }
    }

    public boolean getIpAddresses_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IP_ADDRESSES);
    }

    public VpcNicParams floatingIpId(String floatingIpId) {

        this.floatingIpId = floatingIpId;
        return this;
    }

    /**
     * Get floatingIpId
     *
     * @return floatingIpId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getFloatingIpId() {
        return floatingIpId;
    }

    public void setFloatingIpId(String floatingIpId) {
        this.floatingIpId = floatingIpId;
    }

    public VpcNicParams floatingIpId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FLOATING_IP_ID);
        return this;
    }

    public VpcNicParams floatingIpId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FLOATING_IP_ID);
        return this;
    }

    public void setFloatingIpId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FLOATING_IP_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FLOATING_IP_ID);
        }
    }

    public boolean getFloatingIpId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FLOATING_IP_ID);
    }

    public VpcNicParams vpcSubnetId(String vpcSubnetId) {

        this.vpcSubnetId = vpcSubnetId;
        return this;
    }

    /**
     * Get vpcSubnetId
     *
     * @return vpcSubnetId
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getVpcSubnetId() {
        return vpcSubnetId;
    }

    public void setVpcSubnetId(String vpcSubnetId) {
        this.vpcSubnetId = vpcSubnetId;
    }

    public VpcNicParams vpcSubnetId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VPC_SUBNET_ID);
        return this;
    }

    public VpcNicParams vpcSubnetId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VPC_SUBNET_ID);
        return this;
    }

    public void setVpcSubnetId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VPC_SUBNET_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VPC_SUBNET_ID);
        }
    }

    public boolean getVpcSubnetId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VPC_SUBNET_ID);
    }

    public VpcNicParams vpcId(String vpcId) {

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

    public VpcNicParams vpcId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VPC_ID);
        return this;
    }

    public VpcNicParams vpcId_ExplictlyNonNull() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VpcNicParams vpcNicParams = (VpcNicParams) o;
        return Objects.equals(this.ipAddresses, vpcNicParams.ipAddresses)
                && Objects.equals(this.floatingIpId, vpcNicParams.floatingIpId)
                && Objects.equals(this.vpcSubnetId, vpcNicParams.vpcSubnetId)
                && Objects.equals(this.vpcId, vpcNicParams.vpcId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ipAddresses, floatingIpId, vpcSubnetId, vpcId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VpcNicParams {\n");
        sb.append("    ipAddresses: ").append(toIndentedString(ipAddresses)).append("\n");
        sb.append("    floatingIpId: ").append(toIndentedString(floatingIpId)).append("\n");
        sb.append("    vpcSubnetId: ").append(toIndentedString(vpcSubnetId)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
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

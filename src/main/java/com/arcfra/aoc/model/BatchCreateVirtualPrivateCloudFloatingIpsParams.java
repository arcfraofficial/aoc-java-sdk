package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** BatchCreateVirtualPrivateCloudFloatingIpsParams */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class BatchCreateVirtualPrivateCloudFloatingIpsParams
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_AUTO_ALLOCATE_NUMBER = "auto_allocate_number";

    @SerializedName(SERIALIZED_NAME_AUTO_ALLOCATE_NUMBER)
    private Double autoAllocateNumber;

    public static final String SERIALIZED_NAME_IP_ADDRESSES_UNDER_GROUP =
            "ip_addresses_under_group";

    @SerializedName(SERIALIZED_NAME_IP_ADDRESSES_UNDER_GROUP)
    private List<List<VirtualPrivateCloudExternalIpsParams>> ipAddressesUnderGroup = null;

    public static final String SERIALIZED_NAME_IP_ADDRESSES = "ip_addresses";

    @SerializedName(SERIALIZED_NAME_IP_ADDRESSES)
    private List<String> ipAddresses = null;

    public static final String SERIALIZED_NAME_EXTERNAL_SUBNET_GROUP_ID =
            "external_subnet_group_id";

    @SerializedName(SERIALIZED_NAME_EXTERNAL_SUBNET_GROUP_ID)
    private String externalSubnetGroupId;

    public static final String SERIALIZED_NAME_EXTERNAL_SUBNET_ID = "external_subnet_id";

    @SerializedName(SERIALIZED_NAME_EXTERNAL_SUBNET_ID)
    private String externalSubnetId;

    public static final String SERIALIZED_NAME_VPC_ID = "vpc_id";

    @SerializedName(SERIALIZED_NAME_VPC_ID)
    private String vpcId;

    public BatchCreateVirtualPrivateCloudFloatingIpsParams() {}

    public BatchCreateVirtualPrivateCloudFloatingIpsParams autoAllocateNumber(
            Double autoAllocateNumber) {

        this.autoAllocateNumber = autoAllocateNumber;
        return this;
    }

    /**
     * Get autoAllocateNumber
     *
     * @return autoAllocateNumber
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getAutoAllocateNumber() {
        return autoAllocateNumber;
    }

    public void setAutoAllocateNumber(Double autoAllocateNumber) {
        this.autoAllocateNumber = autoAllocateNumber;
    }

    public BatchCreateVirtualPrivateCloudFloatingIpsParams autoAllocateNumber_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_AUTO_ALLOCATE_NUMBER);
        return this;
    }

    public BatchCreateVirtualPrivateCloudFloatingIpsParams autoAllocateNumber_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_AUTO_ALLOCATE_NUMBER);
        return this;
    }

    public void setAutoAllocateNumber_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_AUTO_ALLOCATE_NUMBER);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_AUTO_ALLOCATE_NUMBER);
        }
    }

    public boolean getAutoAllocateNumber_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_AUTO_ALLOCATE_NUMBER);
    }

    public BatchCreateVirtualPrivateCloudFloatingIpsParams ipAddressesUnderGroup(
            List<List<VirtualPrivateCloudExternalIpsParams>> ipAddressesUnderGroup) {

        this.ipAddressesUnderGroup = ipAddressesUnderGroup;
        return this;
    }

    public BatchCreateVirtualPrivateCloudFloatingIpsParams addIpAddressesUnderGroupItem(
            List<VirtualPrivateCloudExternalIpsParams> ipAddressesUnderGroupItem) {
        if (this.ipAddressesUnderGroup == null) {
            this.ipAddressesUnderGroup =
                    new ArrayList<List<VirtualPrivateCloudExternalIpsParams>>();
        }
        this.ipAddressesUnderGroup.add(ipAddressesUnderGroupItem);
        return this;
    }

    /**
     * Get ipAddressesUnderGroup
     *
     * @return ipAddressesUnderGroup
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<List<VirtualPrivateCloudExternalIpsParams>> getIpAddressesUnderGroup() {
        return ipAddressesUnderGroup;
    }

    public void setIpAddressesUnderGroup(
            List<List<VirtualPrivateCloudExternalIpsParams>> ipAddressesUnderGroup) {
        this.ipAddressesUnderGroup = ipAddressesUnderGroup;
    }

    public BatchCreateVirtualPrivateCloudFloatingIpsParams ipAddressesUnderGroup_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_ADDRESSES_UNDER_GROUP);
        return this;
    }

    public BatchCreateVirtualPrivateCloudFloatingIpsParams
            ipAddressesUnderGroup_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IP_ADDRESSES_UNDER_GROUP);
        return this;
    }

    public void setIpAddressesUnderGroup_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IP_ADDRESSES_UNDER_GROUP);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IP_ADDRESSES_UNDER_GROUP);
        }
    }

    public boolean getIpAddressesUnderGroup_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IP_ADDRESSES_UNDER_GROUP);
    }

    public BatchCreateVirtualPrivateCloudFloatingIpsParams ipAddresses(List<String> ipAddresses) {

        this.ipAddresses = ipAddresses;
        return this;
    }

    public BatchCreateVirtualPrivateCloudFloatingIpsParams addIpAddressesItem(
            String ipAddressesItem) {
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

    public BatchCreateVirtualPrivateCloudFloatingIpsParams ipAddresses_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_ADDRESSES);
        return this;
    }

    public BatchCreateVirtualPrivateCloudFloatingIpsParams ipAddresses_ExplictlyNonNull() {
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

    public BatchCreateVirtualPrivateCloudFloatingIpsParams externalSubnetGroupId(
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

    public BatchCreateVirtualPrivateCloudFloatingIpsParams externalSubnetGroupId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXTERNAL_SUBNET_GROUP_ID);
        return this;
    }

    public BatchCreateVirtualPrivateCloudFloatingIpsParams
            externalSubnetGroupId_ExplictlyNonNull() {
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

    public BatchCreateVirtualPrivateCloudFloatingIpsParams externalSubnetId(
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

    public BatchCreateVirtualPrivateCloudFloatingIpsParams externalSubnetId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXTERNAL_SUBNET_ID);
        return this;
    }

    public BatchCreateVirtualPrivateCloudFloatingIpsParams externalSubnetId_ExplictlyNonNull() {
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

    public BatchCreateVirtualPrivateCloudFloatingIpsParams vpcId(String vpcId) {

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

    public BatchCreateVirtualPrivateCloudFloatingIpsParams vpcId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VPC_ID);
        return this;
    }

    public BatchCreateVirtualPrivateCloudFloatingIpsParams vpcId_ExplictlyNonNull() {
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
        BatchCreateVirtualPrivateCloudFloatingIpsParams
                batchCreateVirtualPrivateCloudFloatingIpsParams =
                        (BatchCreateVirtualPrivateCloudFloatingIpsParams) o;
        return Objects.equals(
                        this.autoAllocateNumber,
                        batchCreateVirtualPrivateCloudFloatingIpsParams.autoAllocateNumber)
                && Objects.equals(
                        this.ipAddressesUnderGroup,
                        batchCreateVirtualPrivateCloudFloatingIpsParams.ipAddressesUnderGroup)
                && Objects.equals(
                        this.ipAddresses,
                        batchCreateVirtualPrivateCloudFloatingIpsParams.ipAddresses)
                && Objects.equals(
                        this.externalSubnetGroupId,
                        batchCreateVirtualPrivateCloudFloatingIpsParams.externalSubnetGroupId)
                && Objects.equals(
                        this.externalSubnetId,
                        batchCreateVirtualPrivateCloudFloatingIpsParams.externalSubnetId)
                && Objects.equals(
                        this.vpcId, batchCreateVirtualPrivateCloudFloatingIpsParams.vpcId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                autoAllocateNumber,
                ipAddressesUnderGroup,
                ipAddresses,
                externalSubnetGroupId,
                externalSubnetId,
                vpcId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchCreateVirtualPrivateCloudFloatingIpsParams {\n");
        sb.append("    autoAllocateNumber: ")
                .append(toIndentedString(autoAllocateNumber))
                .append("\n");
        sb.append("    ipAddressesUnderGroup: ")
                .append(toIndentedString(ipAddressesUnderGroup))
                .append("\n");
        sb.append("    ipAddresses: ").append(toIndentedString(ipAddresses)).append("\n");
        sb.append("    externalSubnetGroupId: ")
                .append(toIndentedString(externalSubnetGroupId))
                .append("\n");
        sb.append("    externalSubnetId: ").append(toIndentedString(externalSubnetId)).append("\n");
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

package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** NestedVirtualPrivateCloudNic */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class NestedVirtualPrivateCloudNic
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_FLOATING_IP = "floating_ip";

    @SerializedName(SERIALIZED_NAME_FLOATING_IP)
    private NestedVirtualPrivateCloudFloatingIp floatingIp;

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

    public static final String SERIALIZED_NAME_IP_ADDRESSES = "ip_addresses";

    @SerializedName(SERIALIZED_NAME_IP_ADDRESSES)
    private List<String> ipAddresses = new ArrayList<String>();

    public static final String SERIALIZED_NAME_LOCAL_ID = "local_id";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID)
    private String localId;

    public static final String SERIALIZED_NAME_VPC = "vpc";

    @SerializedName(SERIALIZED_NAME_VPC)
    private NestedVirtualPrivateCloud vpc;

    public static final String SERIALIZED_NAME_VPC_SUBNET = "vpc_subnet";

    @SerializedName(SERIALIZED_NAME_VPC_SUBNET)
    private NestedVirtualPrivateCloudSubnet vpcSubnet;

    public NestedVirtualPrivateCloudNic() {}

    public NestedVirtualPrivateCloudNic floatingIp(NestedVirtualPrivateCloudFloatingIp floatingIp) {

        this.floatingIp = floatingIp;
        return this;
    }

    /**
     * Get floatingIp
     *
     * @return floatingIp
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NestedVirtualPrivateCloudFloatingIp getFloatingIp() {
        return floatingIp;
    }

    public void setFloatingIp(NestedVirtualPrivateCloudFloatingIp floatingIp) {
        this.floatingIp = floatingIp;
    }

    public NestedVirtualPrivateCloudNic floatingIp_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FLOATING_IP);
        return this;
    }

    public NestedVirtualPrivateCloudNic floatingIp_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FLOATING_IP);
        return this;
    }

    public void setFloatingIp_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FLOATING_IP);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FLOATING_IP);
        }
    }

    public boolean getFloatingIp_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FLOATING_IP);
    }

    public NestedVirtualPrivateCloudNic id(String id) {

        this.id = id;
        return this;
    }

    /**
     * Get id
     *
     * @return id
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public NestedVirtualPrivateCloudNic id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public NestedVirtualPrivateCloudNic id_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID);
        return this;
    }

    public void setId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID);
        }
    }

    public boolean getId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID);
    }

    public NestedVirtualPrivateCloudNic ipAddresses(List<String> ipAddresses) {

        this.ipAddresses = ipAddresses;
        return this;
    }

    public NestedVirtualPrivateCloudNic addIpAddressesItem(String ipAddressesItem) {
        this.ipAddresses.add(ipAddressesItem);
        return this;
    }

    /**
     * Get ipAddresses
     *
     * @return ipAddresses
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public List<String> getIpAddresses() {
        return ipAddresses;
    }

    public void setIpAddresses(List<String> ipAddresses) {
        this.ipAddresses = ipAddresses;
    }

    public NestedVirtualPrivateCloudNic ipAddresses_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_ADDRESSES);
        return this;
    }

    public NestedVirtualPrivateCloudNic ipAddresses_ExplictlyNonNull() {
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

    public NestedVirtualPrivateCloudNic localId(String localId) {

        this.localId = localId;
        return this;
    }

    /**
     * Get localId
     *
     * @return localId
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getLocalId() {
        return localId;
    }

    public void setLocalId(String localId) {
        this.localId = localId;
    }

    public NestedVirtualPrivateCloudNic localId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID);
        return this;
    }

    public NestedVirtualPrivateCloudNic localId_ExplictlyNonNull() {
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

    public NestedVirtualPrivateCloudNic vpc(NestedVirtualPrivateCloud vpc) {

        this.vpc = vpc;
        return this;
    }

    /**
     * Get vpc
     *
     * @return vpc
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public NestedVirtualPrivateCloud getVpc() {
        return vpc;
    }

    public void setVpc(NestedVirtualPrivateCloud vpc) {
        this.vpc = vpc;
    }

    public NestedVirtualPrivateCloudNic vpc_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VPC);
        return this;
    }

    public NestedVirtualPrivateCloudNic vpc_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VPC);
        return this;
    }

    public void setVpc_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VPC);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VPC);
        }
    }

    public boolean getVpc_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VPC);
    }

    public NestedVirtualPrivateCloudNic vpcSubnet(NestedVirtualPrivateCloudSubnet vpcSubnet) {

        this.vpcSubnet = vpcSubnet;
        return this;
    }

    /**
     * Get vpcSubnet
     *
     * @return vpcSubnet
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public NestedVirtualPrivateCloudSubnet getVpcSubnet() {
        return vpcSubnet;
    }

    public void setVpcSubnet(NestedVirtualPrivateCloudSubnet vpcSubnet) {
        this.vpcSubnet = vpcSubnet;
    }

    public NestedVirtualPrivateCloudNic vpcSubnet_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VPC_SUBNET);
        return this;
    }

    public NestedVirtualPrivateCloudNic vpcSubnet_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VPC_SUBNET);
        return this;
    }

    public void setVpcSubnet_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VPC_SUBNET);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VPC_SUBNET);
        }
    }

    public boolean getVpcSubnet_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VPC_SUBNET);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NestedVirtualPrivateCloudNic nestedVirtualPrivateCloudNic =
                (NestedVirtualPrivateCloudNic) o;
        return Objects.equals(this.floatingIp, nestedVirtualPrivateCloudNic.floatingIp)
                && Objects.equals(this.id, nestedVirtualPrivateCloudNic.id)
                && Objects.equals(this.ipAddresses, nestedVirtualPrivateCloudNic.ipAddresses)
                && Objects.equals(this.localId, nestedVirtualPrivateCloudNic.localId)
                && Objects.equals(this.vpc, nestedVirtualPrivateCloudNic.vpc)
                && Objects.equals(this.vpcSubnet, nestedVirtualPrivateCloudNic.vpcSubnet);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null
                        && b != null
                        && a.isPresent()
                        && b.isPresent()
                        && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(floatingIp, id, ipAddresses, localId, vpc, vpcSubnet);
    }

    private static <T> int hashCodeNullable(JsonNullable<T> a) {
        if (a == null) {
            return 1;
        }
        return a.isPresent() ? Arrays.deepHashCode(new Object[] {a.get()}) : 31;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NestedVirtualPrivateCloudNic {\n");
        sb.append("    floatingIp: ").append(toIndentedString(floatingIp)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    ipAddresses: ").append(toIndentedString(ipAddresses)).append("\n");
        sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
        sb.append("    vpc: ").append(toIndentedString(vpc)).append("\n");
        sb.append("    vpcSubnet: ").append(toIndentedString(vpcSubnet)).append("\n");
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

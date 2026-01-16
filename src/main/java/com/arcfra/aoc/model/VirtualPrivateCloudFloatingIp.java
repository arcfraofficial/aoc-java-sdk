package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** VirtualPrivateCloudFloatingIp */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VirtualPrivateCloudFloatingIp
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_ENTITY_ASYNC_STATUS = "entityAsyncStatus";

    @SerializedName(SERIALIZED_NAME_ENTITY_ASYNC_STATUS)
    private EntityAsyncStatus entityAsyncStatus;

    public static final String SERIALIZED_NAME_EXTERNAL_IP = "external_ip";

    @SerializedName(SERIALIZED_NAME_EXTERNAL_IP)
    private String externalIp;

    public static final String SERIALIZED_NAME_EXTERNAL_IPS = "external_ips";

    @SerializedName(SERIALIZED_NAME_EXTERNAL_IPS)
    private List<NestedVpcGatewaysCommonExternalIpsType> externalIps = null;

    public static final String SERIALIZED_NAME_EXTERNAL_SUBNET = "external_subnet";

    @SerializedName(SERIALIZED_NAME_EXTERNAL_SUBNET)
    private NestedVirtualPrivateCloudExternalSubnet externalSubnet;

    public static final String SERIALIZED_NAME_EXTERNAL_SUBNET_GROUP = "external_subnet_group";

    @SerializedName(SERIALIZED_NAME_EXTERNAL_SUBNET_GROUP)
    private NestedVirtualPrivateCloudExternalSubnetGroup externalSubnetGroup;

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

    public static final String SERIALIZED_NAME_LOCAL_ID = "local_id";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID)
    private String localId;

    public static final String SERIALIZED_NAME_VPC = "vpc";

    @SerializedName(SERIALIZED_NAME_VPC)
    private NestedVirtualPrivateCloud vpc;

    public VirtualPrivateCloudFloatingIp() {}

    public VirtualPrivateCloudFloatingIp entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {

        this.entityAsyncStatus = entityAsyncStatus;
        return this;
    }

    /**
     * Get entityAsyncStatus
     *
     * @return entityAsyncStatus
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public EntityAsyncStatus getEntityAsyncStatus() {
        return entityAsyncStatus;
    }

    public void setEntityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {
        this.entityAsyncStatus = entityAsyncStatus;
    }

    public VirtualPrivateCloudFloatingIp entityAsyncStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        return this;
    }

    public VirtualPrivateCloudFloatingIp entityAsyncStatus_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        return this;
    }

    public void setEntityAsyncStatus_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        }
    }

    public boolean getEntityAsyncStatus_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
    }

    public VirtualPrivateCloudFloatingIp externalIp(String externalIp) {

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

    public VirtualPrivateCloudFloatingIp externalIp_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXTERNAL_IP);
        return this;
    }

    public VirtualPrivateCloudFloatingIp externalIp_ExplictlyNonNull() {
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

    public VirtualPrivateCloudFloatingIp externalIps(
            List<NestedVpcGatewaysCommonExternalIpsType> externalIps) {

        this.externalIps = externalIps;
        return this;
    }

    public VirtualPrivateCloudFloatingIp addExternalIpsItem(
            NestedVpcGatewaysCommonExternalIpsType externalIpsItem) {
        if (this.externalIps == null) {
            this.externalIps = new ArrayList<NestedVpcGatewaysCommonExternalIpsType>();
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
    public List<NestedVpcGatewaysCommonExternalIpsType> getExternalIps() {
        return externalIps;
    }

    public void setExternalIps(List<NestedVpcGatewaysCommonExternalIpsType> externalIps) {
        this.externalIps = externalIps;
    }

    public VirtualPrivateCloudFloatingIp externalIps_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXTERNAL_IPS);
        return this;
    }

    public VirtualPrivateCloudFloatingIp externalIps_ExplictlyNonNull() {
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

    public VirtualPrivateCloudFloatingIp externalSubnet(
            NestedVirtualPrivateCloudExternalSubnet externalSubnet) {

        this.externalSubnet = externalSubnet;
        return this;
    }

    /**
     * Get externalSubnet
     *
     * @return externalSubnet
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NestedVirtualPrivateCloudExternalSubnet getExternalSubnet() {
        return externalSubnet;
    }

    public void setExternalSubnet(NestedVirtualPrivateCloudExternalSubnet externalSubnet) {
        this.externalSubnet = externalSubnet;
    }

    public VirtualPrivateCloudFloatingIp externalSubnet_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXTERNAL_SUBNET);
        return this;
    }

    public VirtualPrivateCloudFloatingIp externalSubnet_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EXTERNAL_SUBNET);
        return this;
    }

    public void setExternalSubnet_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EXTERNAL_SUBNET);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EXTERNAL_SUBNET);
        }
    }

    public boolean getExternalSubnet_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EXTERNAL_SUBNET);
    }

    public VirtualPrivateCloudFloatingIp externalSubnetGroup(
            NestedVirtualPrivateCloudExternalSubnetGroup externalSubnetGroup) {

        this.externalSubnetGroup = externalSubnetGroup;
        return this;
    }

    /**
     * Get externalSubnetGroup
     *
     * @return externalSubnetGroup
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NestedVirtualPrivateCloudExternalSubnetGroup getExternalSubnetGroup() {
        return externalSubnetGroup;
    }

    public void setExternalSubnetGroup(
            NestedVirtualPrivateCloudExternalSubnetGroup externalSubnetGroup) {
        this.externalSubnetGroup = externalSubnetGroup;
    }

    public VirtualPrivateCloudFloatingIp externalSubnetGroup_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXTERNAL_SUBNET_GROUP);
        return this;
    }

    public VirtualPrivateCloudFloatingIp externalSubnetGroup_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EXTERNAL_SUBNET_GROUP);
        return this;
    }

    public void setExternalSubnetGroup_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EXTERNAL_SUBNET_GROUP);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EXTERNAL_SUBNET_GROUP);
        }
    }

    public boolean getExternalSubnetGroup_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EXTERNAL_SUBNET_GROUP);
    }

    public VirtualPrivateCloudFloatingIp id(String id) {

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

    public VirtualPrivateCloudFloatingIp id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public VirtualPrivateCloudFloatingIp id_ExplictlyNonNull() {
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

    public VirtualPrivateCloudFloatingIp localId(String localId) {

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

    public VirtualPrivateCloudFloatingIp localId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID);
        return this;
    }

    public VirtualPrivateCloudFloatingIp localId_ExplictlyNonNull() {
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

    public VirtualPrivateCloudFloatingIp vpc(NestedVirtualPrivateCloud vpc) {

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

    public VirtualPrivateCloudFloatingIp vpc_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VPC);
        return this;
    }

    public VirtualPrivateCloudFloatingIp vpc_ExplictlyNonNull() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VirtualPrivateCloudFloatingIp virtualPrivateCloudFloatingIp =
                (VirtualPrivateCloudFloatingIp) o;
        return Objects.equals(
                        this.entityAsyncStatus, virtualPrivateCloudFloatingIp.entityAsyncStatus)
                && Objects.equals(this.externalIp, virtualPrivateCloudFloatingIp.externalIp)
                && Objects.equals(this.externalIps, virtualPrivateCloudFloatingIp.externalIps)
                && Objects.equals(this.externalSubnet, virtualPrivateCloudFloatingIp.externalSubnet)
                && Objects.equals(
                        this.externalSubnetGroup, virtualPrivateCloudFloatingIp.externalSubnetGroup)
                && Objects.equals(this.id, virtualPrivateCloudFloatingIp.id)
                && Objects.equals(this.localId, virtualPrivateCloudFloatingIp.localId)
                && Objects.equals(this.vpc, virtualPrivateCloudFloatingIp.vpc);
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
        return Objects.hash(
                entityAsyncStatus,
                externalIp,
                externalIps,
                externalSubnet,
                externalSubnetGroup,
                id,
                localId,
                vpc);
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
        sb.append("class VirtualPrivateCloudFloatingIp {\n");
        sb.append("    entityAsyncStatus: ")
                .append(toIndentedString(entityAsyncStatus))
                .append("\n");
        sb.append("    externalIp: ").append(toIndentedString(externalIp)).append("\n");
        sb.append("    externalIps: ").append(toIndentedString(externalIps)).append("\n");
        sb.append("    externalSubnet: ").append(toIndentedString(externalSubnet)).append("\n");
        sb.append("    externalSubnetGroup: ")
                .append(toIndentedString(externalSubnetGroup))
                .append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
        sb.append("    vpc: ").append(toIndentedString(vpc)).append("\n");
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

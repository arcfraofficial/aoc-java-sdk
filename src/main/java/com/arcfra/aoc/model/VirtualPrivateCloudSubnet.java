package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** VirtualPrivateCloudSubnet */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VirtualPrivateCloudSubnet
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_CIDR = "cidr";

    @SerializedName(SERIALIZED_NAME_CIDR)
    private String cidr;

    public static final String SERIALIZED_NAME_DESCRIPTION = "description";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION)
    private String description;

    public static final String SERIALIZED_NAME_ENTITY_ASYNC_STATUS = "entityAsyncStatus";

    @SerializedName(SERIALIZED_NAME_ENTITY_ASYNC_STATUS)
    private EntityAsyncStatus entityAsyncStatus;

    public static final String SERIALIZED_NAME_GATEWAY = "gateway";

    @SerializedName(SERIALIZED_NAME_GATEWAY)
    private String gateway;

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

    public static final String SERIALIZED_NAME_IP_POOLS = "ip_pools";

    @SerializedName(SERIALIZED_NAME_IP_POOLS)
    private List<NestedVpcSubnetIpPooType> ipPools = null;

    public static final String SERIALIZED_NAME_LOCAL_ID = "local_id";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID)
    private String localId;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_ROUTE_TABLE = "route_table";

    @SerializedName(SERIALIZED_NAME_ROUTE_TABLE)
    private NestedVirtualPrivateCloudRouteTable routeTable;

    public static final String SERIALIZED_NAME_TOTAL_IP_COUNT = "total_ip_count";

    @SerializedName(SERIALIZED_NAME_TOTAL_IP_COUNT)
    private Integer totalIpCount;

    public static final String SERIALIZED_NAME_UNUSED_IP_COUNT = "unused_ip_count";

    @SerializedName(SERIALIZED_NAME_UNUSED_IP_COUNT)
    private Integer unusedIpCount;

    public static final String SERIALIZED_NAME_VPC = "vpc";

    @SerializedName(SERIALIZED_NAME_VPC)
    private NestedVirtualPrivateCloud vpc;

    public VirtualPrivateCloudSubnet() {}

    public VirtualPrivateCloudSubnet cidr(String cidr) {

        this.cidr = cidr;
        return this;
    }

    /**
     * Get cidr
     *
     * @return cidr
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getCidr() {
        return cidr;
    }

    public void setCidr(String cidr) {
        this.cidr = cidr;
    }

    public VirtualPrivateCloudSubnet cidr_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CIDR);
        return this;
    }

    public VirtualPrivateCloudSubnet cidr_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CIDR);
        return this;
    }

    public void setCidr_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CIDR);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CIDR);
        }
    }

    public boolean getCidr_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CIDR);
    }

    public VirtualPrivateCloudSubnet description(String description) {

        this.description = description;
        return this;
    }

    /**
     * Get description
     *
     * @return description
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public VirtualPrivateCloudSubnet description_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION);
        return this;
    }

    public VirtualPrivateCloudSubnet description_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION);
        return this;
    }

    public void setDescription_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION);
        }
    }

    public boolean getDescription_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESCRIPTION);
    }

    public VirtualPrivateCloudSubnet entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {

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

    public VirtualPrivateCloudSubnet entityAsyncStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        return this;
    }

    public VirtualPrivateCloudSubnet entityAsyncStatus_ExplictlyNonNull() {
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

    public VirtualPrivateCloudSubnet gateway(String gateway) {

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

    public VirtualPrivateCloudSubnet gateway_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_GATEWAY);
        return this;
    }

    public VirtualPrivateCloudSubnet gateway_ExplictlyNonNull() {
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

    public VirtualPrivateCloudSubnet id(String id) {

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

    public VirtualPrivateCloudSubnet id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public VirtualPrivateCloudSubnet id_ExplictlyNonNull() {
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

    public VirtualPrivateCloudSubnet ipPools(List<NestedVpcSubnetIpPooType> ipPools) {

        this.ipPools = ipPools;
        return this;
    }

    public VirtualPrivateCloudSubnet addIpPoolsItem(NestedVpcSubnetIpPooType ipPoolsItem) {
        if (this.ipPools == null) {
            this.ipPools = new ArrayList<NestedVpcSubnetIpPooType>();
        }
        this.ipPools.add(ipPoolsItem);
        return this;
    }

    /**
     * Get ipPools
     *
     * @return ipPools
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedVpcSubnetIpPooType> getIpPools() {
        return ipPools;
    }

    public void setIpPools(List<NestedVpcSubnetIpPooType> ipPools) {
        this.ipPools = ipPools;
    }

    public VirtualPrivateCloudSubnet ipPools_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_POOLS);
        return this;
    }

    public VirtualPrivateCloudSubnet ipPools_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IP_POOLS);
        return this;
    }

    public void setIpPools_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IP_POOLS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IP_POOLS);
        }
    }

    public boolean getIpPools_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IP_POOLS);
    }

    public VirtualPrivateCloudSubnet localId(String localId) {

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

    public VirtualPrivateCloudSubnet localId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID);
        return this;
    }

    public VirtualPrivateCloudSubnet localId_ExplictlyNonNull() {
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

    public VirtualPrivateCloudSubnet name(String name) {

        this.name = name;
        return this;
    }

    /**
     * Get name
     *
     * @return name
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public VirtualPrivateCloudSubnet name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public VirtualPrivateCloudSubnet name_ExplictlyNonNull() {
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

    public VirtualPrivateCloudSubnet routeTable(NestedVirtualPrivateCloudRouteTable routeTable) {

        this.routeTable = routeTable;
        return this;
    }

    /**
     * Get routeTable
     *
     * @return routeTable
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public NestedVirtualPrivateCloudRouteTable getRouteTable() {
        return routeTable;
    }

    public void setRouteTable(NestedVirtualPrivateCloudRouteTable routeTable) {
        this.routeTable = routeTable;
    }

    public VirtualPrivateCloudSubnet routeTable_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ROUTE_TABLE);
        return this;
    }

    public VirtualPrivateCloudSubnet routeTable_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ROUTE_TABLE);
        return this;
    }

    public void setRouteTable_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ROUTE_TABLE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ROUTE_TABLE);
        }
    }

    public boolean getRouteTable_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ROUTE_TABLE);
    }

    public VirtualPrivateCloudSubnet totalIpCount(Integer totalIpCount) {

        this.totalIpCount = totalIpCount;
        return this;
    }

    /**
     * Get totalIpCount
     *
     * @return totalIpCount
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getTotalIpCount() {
        return totalIpCount;
    }

    public void setTotalIpCount(Integer totalIpCount) {
        this.totalIpCount = totalIpCount;
    }

    public VirtualPrivateCloudSubnet totalIpCount_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_IP_COUNT);
        return this;
    }

    public VirtualPrivateCloudSubnet totalIpCount_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_IP_COUNT);
        return this;
    }

    public void setTotalIpCount_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_IP_COUNT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_IP_COUNT);
        }
    }

    public boolean getTotalIpCount_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_IP_COUNT);
    }

    public VirtualPrivateCloudSubnet unusedIpCount(Integer unusedIpCount) {

        this.unusedIpCount = unusedIpCount;
        return this;
    }

    /**
     * Get unusedIpCount
     *
     * @return unusedIpCount
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getUnusedIpCount() {
        return unusedIpCount;
    }

    public void setUnusedIpCount(Integer unusedIpCount) {
        this.unusedIpCount = unusedIpCount;
    }

    public VirtualPrivateCloudSubnet unusedIpCount_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UNUSED_IP_COUNT);
        return this;
    }

    public VirtualPrivateCloudSubnet unusedIpCount_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UNUSED_IP_COUNT);
        return this;
    }

    public void setUnusedIpCount_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UNUSED_IP_COUNT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UNUSED_IP_COUNT);
        }
    }

    public boolean getUnusedIpCount_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UNUSED_IP_COUNT);
    }

    public VirtualPrivateCloudSubnet vpc(NestedVirtualPrivateCloud vpc) {

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

    public VirtualPrivateCloudSubnet vpc_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VPC);
        return this;
    }

    public VirtualPrivateCloudSubnet vpc_ExplictlyNonNull() {
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
        VirtualPrivateCloudSubnet virtualPrivateCloudSubnet = (VirtualPrivateCloudSubnet) o;
        return Objects.equals(this.cidr, virtualPrivateCloudSubnet.cidr)
                && Objects.equals(this.description, virtualPrivateCloudSubnet.description)
                && Objects.equals(
                        this.entityAsyncStatus, virtualPrivateCloudSubnet.entityAsyncStatus)
                && Objects.equals(this.gateway, virtualPrivateCloudSubnet.gateway)
                && Objects.equals(this.id, virtualPrivateCloudSubnet.id)
                && Objects.equals(this.ipPools, virtualPrivateCloudSubnet.ipPools)
                && Objects.equals(this.localId, virtualPrivateCloudSubnet.localId)
                && Objects.equals(this.name, virtualPrivateCloudSubnet.name)
                && Objects.equals(this.routeTable, virtualPrivateCloudSubnet.routeTable)
                && Objects.equals(this.totalIpCount, virtualPrivateCloudSubnet.totalIpCount)
                && Objects.equals(this.unusedIpCount, virtualPrivateCloudSubnet.unusedIpCount)
                && Objects.equals(this.vpc, virtualPrivateCloudSubnet.vpc);
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
                cidr,
                description,
                entityAsyncStatus,
                gateway,
                id,
                ipPools,
                localId,
                name,
                routeTable,
                totalIpCount,
                unusedIpCount,
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
        sb.append("class VirtualPrivateCloudSubnet {\n");
        sb.append("    cidr: ").append(toIndentedString(cidr)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    entityAsyncStatus: ")
                .append(toIndentedString(entityAsyncStatus))
                .append("\n");
        sb.append("    gateway: ").append(toIndentedString(gateway)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    ipPools: ").append(toIndentedString(ipPools)).append("\n");
        sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    routeTable: ").append(toIndentedString(routeTable)).append("\n");
        sb.append("    totalIpCount: ").append(toIndentedString(totalIpCount)).append("\n");
        sb.append("    unusedIpCount: ").append(toIndentedString(unusedIpCount)).append("\n");
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

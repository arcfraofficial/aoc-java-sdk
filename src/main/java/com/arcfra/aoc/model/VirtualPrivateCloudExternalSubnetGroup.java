package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** VirtualPrivateCloudExternalSubnetGroup */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VirtualPrivateCloudExternalSubnetGroup
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_DESCRIPTION = "description";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION)
    private String description;

    public static final String SERIALIZED_NAME_EDGE_GATEWAY_GROUP = "edge_gateway_group";

    @SerializedName(SERIALIZED_NAME_EDGE_GATEWAY_GROUP)
    private NestedVirtualPrivateCloudEdgeGatewayGroup edgeGatewayGroup;

    public static final String SERIALIZED_NAME_ENTITY_ASYNC_STATUS = "entityAsyncStatus";

    @SerializedName(SERIALIZED_NAME_ENTITY_ASYNC_STATUS)
    private EntityAsyncStatus entityAsyncStatus;

    public static final String SERIALIZED_NAME_EXCLUSIVE = "exclusive";

    @SerializedName(SERIALIZED_NAME_EXCLUSIVE)
    private Boolean exclusive;

    public static final String SERIALIZED_NAME_EXTERNAL_SUBNETS_SPEC = "external_subnets_spec";

    @SerializedName(SERIALIZED_NAME_EXTERNAL_SUBNETS_SPEC)
    private List<NestedVirtualPrivateCloudExternalSubnetGroupExternalSubnetsSpec>
            externalSubnetsSpec =
                    new ArrayList<
                            NestedVirtualPrivateCloudExternalSubnetGroupExternalSubnetsSpec>();

    public static final String SERIALIZED_NAME_FLOATING_IPS = "floating_ips";

    @SerializedName(SERIALIZED_NAME_FLOATING_IPS)
    private List<NestedVirtualPrivateCloudFloatingIp> floatingIps = null;

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

    public static final String SERIALIZED_NAME_LOCAL_ID = "local_id";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID)
    private String localId;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_NAT_GATEWAYS = "nat_gateways";

    @SerializedName(SERIALIZED_NAME_NAT_GATEWAYS)
    private List<NestedVirtualPrivateCloudNatGateway> natGateways = null;

    public static final String SERIALIZED_NAME_ROUTER_GATEWAYS = "router_gateways";

    @SerializedName(SERIALIZED_NAME_ROUTER_GATEWAYS)
    private List<NestedVirtualPrivateCloudRouterGateway> routerGateways = null;

    public static final String SERIALIZED_NAME_SHARED_IN_EDGE_GATEWAY_GROUP =
            "shared_in_edge_gateway_group";

    @SerializedName(SERIALIZED_NAME_SHARED_IN_EDGE_GATEWAY_GROUP)
    private Boolean sharedInEdgeGatewayGroup;

    public static final String SERIALIZED_NAME_VPC = "vpc";

    @SerializedName(SERIALIZED_NAME_VPC)
    private NestedVirtualPrivateCloud vpc;

    public VirtualPrivateCloudExternalSubnetGroup() {}

    public VirtualPrivateCloudExternalSubnetGroup description(String description) {

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

    public VirtualPrivateCloudExternalSubnetGroup description_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION);
        return this;
    }

    public VirtualPrivateCloudExternalSubnetGroup description_ExplictlyNonNull() {
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

    public VirtualPrivateCloudExternalSubnetGroup edgeGatewayGroup(
            NestedVirtualPrivateCloudEdgeGatewayGroup edgeGatewayGroup) {

        this.edgeGatewayGroup = edgeGatewayGroup;
        return this;
    }

    /**
     * Get edgeGatewayGroup
     *
     * @return edgeGatewayGroup
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public NestedVirtualPrivateCloudEdgeGatewayGroup getEdgeGatewayGroup() {
        return edgeGatewayGroup;
    }

    public void setEdgeGatewayGroup(NestedVirtualPrivateCloudEdgeGatewayGroup edgeGatewayGroup) {
        this.edgeGatewayGroup = edgeGatewayGroup;
    }

    public VirtualPrivateCloudExternalSubnetGroup edgeGatewayGroup_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EDGE_GATEWAY_GROUP);
        return this;
    }

    public VirtualPrivateCloudExternalSubnetGroup edgeGatewayGroup_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EDGE_GATEWAY_GROUP);
        return this;
    }

    public void setEdgeGatewayGroup_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EDGE_GATEWAY_GROUP);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EDGE_GATEWAY_GROUP);
        }
    }

    public boolean getEdgeGatewayGroup_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EDGE_GATEWAY_GROUP);
    }

    public VirtualPrivateCloudExternalSubnetGroup entityAsyncStatus(
            EntityAsyncStatus entityAsyncStatus) {

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

    public VirtualPrivateCloudExternalSubnetGroup entityAsyncStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        return this;
    }

    public VirtualPrivateCloudExternalSubnetGroup entityAsyncStatus_ExplictlyNonNull() {
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

    public VirtualPrivateCloudExternalSubnetGroup exclusive(Boolean exclusive) {

        this.exclusive = exclusive;
        return this;
    }

    /**
     * Get exclusive
     *
     * @return exclusive
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Boolean getExclusive() {
        return exclusive;
    }

    public void setExclusive(Boolean exclusive) {
        this.exclusive = exclusive;
    }

    public VirtualPrivateCloudExternalSubnetGroup exclusive_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXCLUSIVE);
        return this;
    }

    public VirtualPrivateCloudExternalSubnetGroup exclusive_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EXCLUSIVE);
        return this;
    }

    public void setExclusive_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EXCLUSIVE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EXCLUSIVE);
        }
    }

    public boolean getExclusive_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EXCLUSIVE);
    }

    public VirtualPrivateCloudExternalSubnetGroup externalSubnetsSpec(
            List<NestedVirtualPrivateCloudExternalSubnetGroupExternalSubnetsSpec>
                    externalSubnetsSpec) {

        this.externalSubnetsSpec = externalSubnetsSpec;
        return this;
    }

    public VirtualPrivateCloudExternalSubnetGroup addExternalSubnetsSpecItem(
            NestedVirtualPrivateCloudExternalSubnetGroupExternalSubnetsSpec
                    externalSubnetsSpecItem) {
        this.externalSubnetsSpec.add(externalSubnetsSpecItem);
        return this;
    }

    /**
     * Get externalSubnetsSpec
     *
     * @return externalSubnetsSpec
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public List<NestedVirtualPrivateCloudExternalSubnetGroupExternalSubnetsSpec>
            getExternalSubnetsSpec() {
        return externalSubnetsSpec;
    }

    public void setExternalSubnetsSpec(
            List<NestedVirtualPrivateCloudExternalSubnetGroupExternalSubnetsSpec>
                    externalSubnetsSpec) {
        this.externalSubnetsSpec = externalSubnetsSpec;
    }

    public VirtualPrivateCloudExternalSubnetGroup externalSubnetsSpec_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXTERNAL_SUBNETS_SPEC);
        return this;
    }

    public VirtualPrivateCloudExternalSubnetGroup externalSubnetsSpec_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EXTERNAL_SUBNETS_SPEC);
        return this;
    }

    public void setExternalSubnetsSpec_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EXTERNAL_SUBNETS_SPEC);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EXTERNAL_SUBNETS_SPEC);
        }
    }

    public boolean getExternalSubnetsSpec_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EXTERNAL_SUBNETS_SPEC);
    }

    public VirtualPrivateCloudExternalSubnetGroup floatingIps(
            List<NestedVirtualPrivateCloudFloatingIp> floatingIps) {

        this.floatingIps = floatingIps;
        return this;
    }

    public VirtualPrivateCloudExternalSubnetGroup addFloatingIpsItem(
            NestedVirtualPrivateCloudFloatingIp floatingIpsItem) {
        if (this.floatingIps == null) {
            this.floatingIps = new ArrayList<NestedVirtualPrivateCloudFloatingIp>();
        }
        this.floatingIps.add(floatingIpsItem);
        return this;
    }

    /**
     * Get floatingIps
     *
     * @return floatingIps
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedVirtualPrivateCloudFloatingIp> getFloatingIps() {
        return floatingIps;
    }

    public void setFloatingIps(List<NestedVirtualPrivateCloudFloatingIp> floatingIps) {
        this.floatingIps = floatingIps;
    }

    public VirtualPrivateCloudExternalSubnetGroup floatingIps_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FLOATING_IPS);
        return this;
    }

    public VirtualPrivateCloudExternalSubnetGroup floatingIps_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FLOATING_IPS);
        return this;
    }

    public void setFloatingIps_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FLOATING_IPS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FLOATING_IPS);
        }
    }

    public boolean getFloatingIps_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FLOATING_IPS);
    }

    public VirtualPrivateCloudExternalSubnetGroup id(String id) {

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

    public VirtualPrivateCloudExternalSubnetGroup id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public VirtualPrivateCloudExternalSubnetGroup id_ExplictlyNonNull() {
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

    public VirtualPrivateCloudExternalSubnetGroup localId(String localId) {

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

    public VirtualPrivateCloudExternalSubnetGroup localId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID);
        return this;
    }

    public VirtualPrivateCloudExternalSubnetGroup localId_ExplictlyNonNull() {
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

    public VirtualPrivateCloudExternalSubnetGroup name(String name) {

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

    public VirtualPrivateCloudExternalSubnetGroup name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public VirtualPrivateCloudExternalSubnetGroup name_ExplictlyNonNull() {
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

    public VirtualPrivateCloudExternalSubnetGroup natGateways(
            List<NestedVirtualPrivateCloudNatGateway> natGateways) {

        this.natGateways = natGateways;
        return this;
    }

    public VirtualPrivateCloudExternalSubnetGroup addNatGatewaysItem(
            NestedVirtualPrivateCloudNatGateway natGatewaysItem) {
        if (this.natGateways == null) {
            this.natGateways = new ArrayList<NestedVirtualPrivateCloudNatGateway>();
        }
        this.natGateways.add(natGatewaysItem);
        return this;
    }

    /**
     * Get natGateways
     *
     * @return natGateways
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedVirtualPrivateCloudNatGateway> getNatGateways() {
        return natGateways;
    }

    public void setNatGateways(List<NestedVirtualPrivateCloudNatGateway> natGateways) {
        this.natGateways = natGateways;
    }

    public VirtualPrivateCloudExternalSubnetGroup natGateways_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAT_GATEWAYS);
        return this;
    }

    public VirtualPrivateCloudExternalSubnetGroup natGateways_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAT_GATEWAYS);
        return this;
    }

    public void setNatGateways_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAT_GATEWAYS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAT_GATEWAYS);
        }
    }

    public boolean getNatGateways_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAT_GATEWAYS);
    }

    public VirtualPrivateCloudExternalSubnetGroup routerGateways(
            List<NestedVirtualPrivateCloudRouterGateway> routerGateways) {

        this.routerGateways = routerGateways;
        return this;
    }

    public VirtualPrivateCloudExternalSubnetGroup addRouterGatewaysItem(
            NestedVirtualPrivateCloudRouterGateway routerGatewaysItem) {
        if (this.routerGateways == null) {
            this.routerGateways = new ArrayList<NestedVirtualPrivateCloudRouterGateway>();
        }
        this.routerGateways.add(routerGatewaysItem);
        return this;
    }

    /**
     * Get routerGateways
     *
     * @return routerGateways
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedVirtualPrivateCloudRouterGateway> getRouterGateways() {
        return routerGateways;
    }

    public void setRouterGateways(List<NestedVirtualPrivateCloudRouterGateway> routerGateways) {
        this.routerGateways = routerGateways;
    }

    public VirtualPrivateCloudExternalSubnetGroup routerGateways_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ROUTER_GATEWAYS);
        return this;
    }

    public VirtualPrivateCloudExternalSubnetGroup routerGateways_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ROUTER_GATEWAYS);
        return this;
    }

    public void setRouterGateways_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ROUTER_GATEWAYS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ROUTER_GATEWAYS);
        }
    }

    public boolean getRouterGateways_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ROUTER_GATEWAYS);
    }

    public VirtualPrivateCloudExternalSubnetGroup sharedInEdgeGatewayGroup(
            Boolean sharedInEdgeGatewayGroup) {

        this.sharedInEdgeGatewayGroup = sharedInEdgeGatewayGroup;
        return this;
    }

    /**
     * Get sharedInEdgeGatewayGroup
     *
     * @return sharedInEdgeGatewayGroup
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Boolean getSharedInEdgeGatewayGroup() {
        return sharedInEdgeGatewayGroup;
    }

    public void setSharedInEdgeGatewayGroup(Boolean sharedInEdgeGatewayGroup) {
        this.sharedInEdgeGatewayGroup = sharedInEdgeGatewayGroup;
    }

    public VirtualPrivateCloudExternalSubnetGroup sharedInEdgeGatewayGroup_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SHARED_IN_EDGE_GATEWAY_GROUP);
        return this;
    }

    public VirtualPrivateCloudExternalSubnetGroup sharedInEdgeGatewayGroup_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SHARED_IN_EDGE_GATEWAY_GROUP);
        return this;
    }

    public void setSharedInEdgeGatewayGroup_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SHARED_IN_EDGE_GATEWAY_GROUP);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SHARED_IN_EDGE_GATEWAY_GROUP);
        }
    }

    public boolean getSharedInEdgeGatewayGroup_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SHARED_IN_EDGE_GATEWAY_GROUP);
    }

    public VirtualPrivateCloudExternalSubnetGroup vpc(NestedVirtualPrivateCloud vpc) {

        this.vpc = vpc;
        return this;
    }

    /**
     * Get vpc
     *
     * @return vpc
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NestedVirtualPrivateCloud getVpc() {
        return vpc;
    }

    public void setVpc(NestedVirtualPrivateCloud vpc) {
        this.vpc = vpc;
    }

    public VirtualPrivateCloudExternalSubnetGroup vpc_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VPC);
        return this;
    }

    public VirtualPrivateCloudExternalSubnetGroup vpc_ExplictlyNonNull() {
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
        VirtualPrivateCloudExternalSubnetGroup virtualPrivateCloudExternalSubnetGroup =
                (VirtualPrivateCloudExternalSubnetGroup) o;
        return Objects.equals(this.description, virtualPrivateCloudExternalSubnetGroup.description)
                && Objects.equals(
                        this.edgeGatewayGroup,
                        virtualPrivateCloudExternalSubnetGroup.edgeGatewayGroup)
                && Objects.equals(
                        this.entityAsyncStatus,
                        virtualPrivateCloudExternalSubnetGroup.entityAsyncStatus)
                && Objects.equals(this.exclusive, virtualPrivateCloudExternalSubnetGroup.exclusive)
                && Objects.equals(
                        this.externalSubnetsSpec,
                        virtualPrivateCloudExternalSubnetGroup.externalSubnetsSpec)
                && Objects.equals(
                        this.floatingIps, virtualPrivateCloudExternalSubnetGroup.floatingIps)
                && Objects.equals(this.id, virtualPrivateCloudExternalSubnetGroup.id)
                && Objects.equals(this.localId, virtualPrivateCloudExternalSubnetGroup.localId)
                && Objects.equals(this.name, virtualPrivateCloudExternalSubnetGroup.name)
                && Objects.equals(
                        this.natGateways, virtualPrivateCloudExternalSubnetGroup.natGateways)
                && Objects.equals(
                        this.routerGateways, virtualPrivateCloudExternalSubnetGroup.routerGateways)
                && Objects.equals(
                        this.sharedInEdgeGatewayGroup,
                        virtualPrivateCloudExternalSubnetGroup.sharedInEdgeGatewayGroup)
                && Objects.equals(this.vpc, virtualPrivateCloudExternalSubnetGroup.vpc);
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
                description,
                edgeGatewayGroup,
                entityAsyncStatus,
                exclusive,
                externalSubnetsSpec,
                floatingIps,
                id,
                localId,
                name,
                natGateways,
                routerGateways,
                sharedInEdgeGatewayGroup,
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
        sb.append("class VirtualPrivateCloudExternalSubnetGroup {\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    edgeGatewayGroup: ").append(toIndentedString(edgeGatewayGroup)).append("\n");
        sb.append("    entityAsyncStatus: ")
                .append(toIndentedString(entityAsyncStatus))
                .append("\n");
        sb.append("    exclusive: ").append(toIndentedString(exclusive)).append("\n");
        sb.append("    externalSubnetsSpec: ")
                .append(toIndentedString(externalSubnetsSpec))
                .append("\n");
        sb.append("    floatingIps: ").append(toIndentedString(floatingIps)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    natGateways: ").append(toIndentedString(natGateways)).append("\n");
        sb.append("    routerGateways: ").append(toIndentedString(routerGateways)).append("\n");
        sb.append("    sharedInEdgeGatewayGroup: ")
                .append(toIndentedString(sharedInEdgeGatewayGroup))
                .append("\n");
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

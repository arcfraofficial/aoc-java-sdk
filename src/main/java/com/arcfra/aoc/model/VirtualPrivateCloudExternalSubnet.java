package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** VirtualPrivateCloudExternalSubnet */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VirtualPrivateCloudExternalSubnet
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_CIDR = "cidr";

    @SerializedName(SERIALIZED_NAME_CIDR)
    private String cidr;

    public static final String SERIALIZED_NAME_DESCRIPTION = "description";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION)
    private String description;

    public static final String SERIALIZED_NAME_EDGE_GATEWAY = "edge_gateway";

    @SerializedName(SERIALIZED_NAME_EDGE_GATEWAY)
    private NestedVirtualPrivateCloudEdgeGateway edgeGateway;

    public static final String SERIALIZED_NAME_ENTITY_ASYNC_STATUS = "entityAsyncStatus";

    @SerializedName(SERIALIZED_NAME_ENTITY_ASYNC_STATUS)
    private EntityAsyncStatus entityAsyncStatus;

    public static final String SERIALIZED_NAME_EXCLUSIVE = "exclusive";

    @SerializedName(SERIALIZED_NAME_EXCLUSIVE)
    private Boolean exclusive;

    public static final String SERIALIZED_NAME_FLOATING_IP_CIDR = "floating_ip_cidr";

    @SerializedName(SERIALIZED_NAME_FLOATING_IP_CIDR)
    private String floatingIpCidr;

    public static final String SERIALIZED_NAME_FLOATING_IPS = "floating_ips";

    @SerializedName(SERIALIZED_NAME_FLOATING_IPS)
    private List<NestedVirtualPrivateCloudFloatingIp> floatingIps = null;

    public static final String SERIALIZED_NAME_GATEWAY = "gateway";

    @SerializedName(SERIALIZED_NAME_GATEWAY)
    private String gateway;

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

    public static final String SERIALIZED_NAME_LOCAL_ID = "local_id";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID)
    private String localId;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_NAT_GATEWAY_CIDR = "nat_gateway_cidr";

    @SerializedName(SERIALIZED_NAME_NAT_GATEWAY_CIDR)
    private String natGatewayCidr;

    public static final String SERIALIZED_NAME_NAT_GATEWAYS = "nat_gateways";

    @SerializedName(SERIALIZED_NAME_NAT_GATEWAYS)
    private List<NestedVirtualPrivateCloudNatGateway> natGateways = null;

    public static final String SERIALIZED_NAME_ROUTER_GATEWAY_CIDR = "router_gateway_cidr";

    @SerializedName(SERIALIZED_NAME_ROUTER_GATEWAY_CIDR)
    private String routerGatewayCidr;

    public static final String SERIALIZED_NAME_ROUTER_GATEWAYS = "router_gateways";

    @SerializedName(SERIALIZED_NAME_ROUTER_GATEWAYS)
    private List<NestedVirtualPrivateCloudRouterGateway> routerGateways = null;

    public static final String SERIALIZED_NAME_VLAN = "vlan";

    @SerializedName(SERIALIZED_NAME_VLAN)
    private NestedVlan vlan;

    public static final String SERIALIZED_NAME_VPC = "vpc";

    @SerializedName(SERIALIZED_NAME_VPC)
    private NestedVirtualPrivateCloud vpc;

    public VirtualPrivateCloudExternalSubnet() {}

    public VirtualPrivateCloudExternalSubnet cidr(String cidr) {

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

    public VirtualPrivateCloudExternalSubnet cidr_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CIDR);
        return this;
    }

    public VirtualPrivateCloudExternalSubnet cidr_ExplictlyNonNull() {
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

    public VirtualPrivateCloudExternalSubnet description(String description) {

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

    public VirtualPrivateCloudExternalSubnet description_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION);
        return this;
    }

    public VirtualPrivateCloudExternalSubnet description_ExplictlyNonNull() {
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

    public VirtualPrivateCloudExternalSubnet edgeGateway(
            NestedVirtualPrivateCloudEdgeGateway edgeGateway) {

        this.edgeGateway = edgeGateway;
        return this;
    }

    /**
     * Get edgeGateway
     *
     * @return edgeGateway
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NestedVirtualPrivateCloudEdgeGateway getEdgeGateway() {
        return edgeGateway;
    }

    public void setEdgeGateway(NestedVirtualPrivateCloudEdgeGateway edgeGateway) {
        this.edgeGateway = edgeGateway;
    }

    public VirtualPrivateCloudExternalSubnet edgeGateway_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EDGE_GATEWAY);
        return this;
    }

    public VirtualPrivateCloudExternalSubnet edgeGateway_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EDGE_GATEWAY);
        return this;
    }

    public void setEdgeGateway_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EDGE_GATEWAY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EDGE_GATEWAY);
        }
    }

    public boolean getEdgeGateway_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EDGE_GATEWAY);
    }

    public VirtualPrivateCloudExternalSubnet entityAsyncStatus(
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

    public VirtualPrivateCloudExternalSubnet entityAsyncStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        return this;
    }

    public VirtualPrivateCloudExternalSubnet entityAsyncStatus_ExplictlyNonNull() {
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

    public VirtualPrivateCloudExternalSubnet exclusive(Boolean exclusive) {

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

    public VirtualPrivateCloudExternalSubnet exclusive_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXCLUSIVE);
        return this;
    }

    public VirtualPrivateCloudExternalSubnet exclusive_ExplictlyNonNull() {
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

    public VirtualPrivateCloudExternalSubnet floatingIpCidr(String floatingIpCidr) {

        this.floatingIpCidr = floatingIpCidr;
        return this;
    }

    /**
     * Get floatingIpCidr
     *
     * @return floatingIpCidr
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getFloatingIpCidr() {
        return floatingIpCidr;
    }

    public void setFloatingIpCidr(String floatingIpCidr) {
        this.floatingIpCidr = floatingIpCidr;
    }

    public VirtualPrivateCloudExternalSubnet floatingIpCidr_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FLOATING_IP_CIDR);
        return this;
    }

    public VirtualPrivateCloudExternalSubnet floatingIpCidr_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FLOATING_IP_CIDR);
        return this;
    }

    public void setFloatingIpCidr_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FLOATING_IP_CIDR);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FLOATING_IP_CIDR);
        }
    }

    public boolean getFloatingIpCidr_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FLOATING_IP_CIDR);
    }

    public VirtualPrivateCloudExternalSubnet floatingIps(
            List<NestedVirtualPrivateCloudFloatingIp> floatingIps) {

        this.floatingIps = floatingIps;
        return this;
    }

    public VirtualPrivateCloudExternalSubnet addFloatingIpsItem(
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

    public VirtualPrivateCloudExternalSubnet floatingIps_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FLOATING_IPS);
        return this;
    }

    public VirtualPrivateCloudExternalSubnet floatingIps_ExplictlyNonNull() {
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

    public VirtualPrivateCloudExternalSubnet gateway(String gateway) {

        this.gateway = gateway;
        return this;
    }

    /**
     * Get gateway
     *
     * @return gateway
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getGateway() {
        return gateway;
    }

    public void setGateway(String gateway) {
        this.gateway = gateway;
    }

    public VirtualPrivateCloudExternalSubnet gateway_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_GATEWAY);
        return this;
    }

    public VirtualPrivateCloudExternalSubnet gateway_ExplictlyNonNull() {
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

    public VirtualPrivateCloudExternalSubnet id(String id) {

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

    public VirtualPrivateCloudExternalSubnet id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public VirtualPrivateCloudExternalSubnet id_ExplictlyNonNull() {
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

    public VirtualPrivateCloudExternalSubnet localId(String localId) {

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

    public VirtualPrivateCloudExternalSubnet localId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID);
        return this;
    }

    public VirtualPrivateCloudExternalSubnet localId_ExplictlyNonNull() {
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

    public VirtualPrivateCloudExternalSubnet name(String name) {

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

    public VirtualPrivateCloudExternalSubnet name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public VirtualPrivateCloudExternalSubnet name_ExplictlyNonNull() {
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

    public VirtualPrivateCloudExternalSubnet natGatewayCidr(String natGatewayCidr) {

        this.natGatewayCidr = natGatewayCidr;
        return this;
    }

    /**
     * Get natGatewayCidr
     *
     * @return natGatewayCidr
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNatGatewayCidr() {
        return natGatewayCidr;
    }

    public void setNatGatewayCidr(String natGatewayCidr) {
        this.natGatewayCidr = natGatewayCidr;
    }

    public VirtualPrivateCloudExternalSubnet natGatewayCidr_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAT_GATEWAY_CIDR);
        return this;
    }

    public VirtualPrivateCloudExternalSubnet natGatewayCidr_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAT_GATEWAY_CIDR);
        return this;
    }

    public void setNatGatewayCidr_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAT_GATEWAY_CIDR);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAT_GATEWAY_CIDR);
        }
    }

    public boolean getNatGatewayCidr_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAT_GATEWAY_CIDR);
    }

    public VirtualPrivateCloudExternalSubnet natGateways(
            List<NestedVirtualPrivateCloudNatGateway> natGateways) {

        this.natGateways = natGateways;
        return this;
    }

    public VirtualPrivateCloudExternalSubnet addNatGatewaysItem(
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

    public VirtualPrivateCloudExternalSubnet natGateways_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAT_GATEWAYS);
        return this;
    }

    public VirtualPrivateCloudExternalSubnet natGateways_ExplictlyNonNull() {
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

    public VirtualPrivateCloudExternalSubnet routerGatewayCidr(String routerGatewayCidr) {

        this.routerGatewayCidr = routerGatewayCidr;
        return this;
    }

    /**
     * Get routerGatewayCidr
     *
     * @return routerGatewayCidr
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getRouterGatewayCidr() {
        return routerGatewayCidr;
    }

    public void setRouterGatewayCidr(String routerGatewayCidr) {
        this.routerGatewayCidr = routerGatewayCidr;
    }

    public VirtualPrivateCloudExternalSubnet routerGatewayCidr_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ROUTER_GATEWAY_CIDR);
        return this;
    }

    public VirtualPrivateCloudExternalSubnet routerGatewayCidr_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ROUTER_GATEWAY_CIDR);
        return this;
    }

    public void setRouterGatewayCidr_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ROUTER_GATEWAY_CIDR);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ROUTER_GATEWAY_CIDR);
        }
    }

    public boolean getRouterGatewayCidr_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ROUTER_GATEWAY_CIDR);
    }

    public VirtualPrivateCloudExternalSubnet routerGateways(
            List<NestedVirtualPrivateCloudRouterGateway> routerGateways) {

        this.routerGateways = routerGateways;
        return this;
    }

    public VirtualPrivateCloudExternalSubnet addRouterGatewaysItem(
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

    public VirtualPrivateCloudExternalSubnet routerGateways_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ROUTER_GATEWAYS);
        return this;
    }

    public VirtualPrivateCloudExternalSubnet routerGateways_ExplictlyNonNull() {
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

    public VirtualPrivateCloudExternalSubnet vlan(NestedVlan vlan) {

        this.vlan = vlan;
        return this;
    }

    /**
     * Get vlan
     *
     * @return vlan
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public NestedVlan getVlan() {
        return vlan;
    }

    public void setVlan(NestedVlan vlan) {
        this.vlan = vlan;
    }

    public VirtualPrivateCloudExternalSubnet vlan_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VLAN);
        return this;
    }

    public VirtualPrivateCloudExternalSubnet vlan_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VLAN);
        return this;
    }

    public void setVlan_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VLAN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VLAN);
        }
    }

    public boolean getVlan_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VLAN);
    }

    public VirtualPrivateCloudExternalSubnet vpc(NestedVirtualPrivateCloud vpc) {

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

    public VirtualPrivateCloudExternalSubnet vpc_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VPC);
        return this;
    }

    public VirtualPrivateCloudExternalSubnet vpc_ExplictlyNonNull() {
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
        VirtualPrivateCloudExternalSubnet virtualPrivateCloudExternalSubnet =
                (VirtualPrivateCloudExternalSubnet) o;
        return Objects.equals(this.cidr, virtualPrivateCloudExternalSubnet.cidr)
                && Objects.equals(this.description, virtualPrivateCloudExternalSubnet.description)
                && Objects.equals(this.edgeGateway, virtualPrivateCloudExternalSubnet.edgeGateway)
                && Objects.equals(
                        this.entityAsyncStatus, virtualPrivateCloudExternalSubnet.entityAsyncStatus)
                && Objects.equals(this.exclusive, virtualPrivateCloudExternalSubnet.exclusive)
                && Objects.equals(
                        this.floatingIpCidr, virtualPrivateCloudExternalSubnet.floatingIpCidr)
                && Objects.equals(this.floatingIps, virtualPrivateCloudExternalSubnet.floatingIps)
                && Objects.equals(this.gateway, virtualPrivateCloudExternalSubnet.gateway)
                && Objects.equals(this.id, virtualPrivateCloudExternalSubnet.id)
                && Objects.equals(this.localId, virtualPrivateCloudExternalSubnet.localId)
                && Objects.equals(this.name, virtualPrivateCloudExternalSubnet.name)
                && Objects.equals(
                        this.natGatewayCidr, virtualPrivateCloudExternalSubnet.natGatewayCidr)
                && Objects.equals(this.natGateways, virtualPrivateCloudExternalSubnet.natGateways)
                && Objects.equals(
                        this.routerGatewayCidr, virtualPrivateCloudExternalSubnet.routerGatewayCidr)
                && Objects.equals(
                        this.routerGateways, virtualPrivateCloudExternalSubnet.routerGateways)
                && Objects.equals(this.vlan, virtualPrivateCloudExternalSubnet.vlan)
                && Objects.equals(this.vpc, virtualPrivateCloudExternalSubnet.vpc);
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
                edgeGateway,
                entityAsyncStatus,
                exclusive,
                floatingIpCidr,
                floatingIps,
                gateway,
                id,
                localId,
                name,
                natGatewayCidr,
                natGateways,
                routerGatewayCidr,
                routerGateways,
                vlan,
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
        sb.append("class VirtualPrivateCloudExternalSubnet {\n");
        sb.append("    cidr: ").append(toIndentedString(cidr)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    edgeGateway: ").append(toIndentedString(edgeGateway)).append("\n");
        sb.append("    entityAsyncStatus: ")
                .append(toIndentedString(entityAsyncStatus))
                .append("\n");
        sb.append("    exclusive: ").append(toIndentedString(exclusive)).append("\n");
        sb.append("    floatingIpCidr: ").append(toIndentedString(floatingIpCidr)).append("\n");
        sb.append("    floatingIps: ").append(toIndentedString(floatingIps)).append("\n");
        sb.append("    gateway: ").append(toIndentedString(gateway)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    natGatewayCidr: ").append(toIndentedString(natGatewayCidr)).append("\n");
        sb.append("    natGateways: ").append(toIndentedString(natGateways)).append("\n");
        sb.append("    routerGatewayCidr: ")
                .append(toIndentedString(routerGatewayCidr))
                .append("\n");
        sb.append("    routerGateways: ").append(toIndentedString(routerGateways)).append("\n");
        sb.append("    vlan: ").append(toIndentedString(vlan)).append("\n");
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

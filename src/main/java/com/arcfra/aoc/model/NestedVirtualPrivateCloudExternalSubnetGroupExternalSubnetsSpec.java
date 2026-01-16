package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Arrays;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** NestedVirtualPrivateCloudExternalSubnetGroupExternalSubnetsSpec */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class NestedVirtualPrivateCloudExternalSubnetGroupExternalSubnetsSpec
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_CIDR = "cidr";

    @SerializedName(SERIALIZED_NAME_CIDR)
    private String cidr;

    public static final String SERIALIZED_NAME_EDGE_GATEWAY_ID = "edge_gateway_id";

    @SerializedName(SERIALIZED_NAME_EDGE_GATEWAY_ID)
    private String edgeGatewayId;

    public static final String SERIALIZED_NAME_FLOATING_IP_CIDR = "floating_ip_cidr";

    @SerializedName(SERIALIZED_NAME_FLOATING_IP_CIDR)
    private String floatingIpCidr;

    public static final String SERIALIZED_NAME_GATEWAY = "gateway";

    @SerializedName(SERIALIZED_NAME_GATEWAY)
    private String gateway;

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

    public static final String SERIALIZED_NAME_NAT_GATEWAY_CIDR = "nat_gateway_cidr";

    @SerializedName(SERIALIZED_NAME_NAT_GATEWAY_CIDR)
    private String natGatewayCidr;

    public static final String SERIALIZED_NAME_ROUTER_GATEWAY_CIDR = "router_gateway_cidr";

    @SerializedName(SERIALIZED_NAME_ROUTER_GATEWAY_CIDR)
    private String routerGatewayCidr;

    public static final String SERIALIZED_NAME_VLAN_ID = "vlan_id";

    @SerializedName(SERIALIZED_NAME_VLAN_ID)
    private String vlanId;

    public NestedVirtualPrivateCloudExternalSubnetGroupExternalSubnetsSpec() {}

    public NestedVirtualPrivateCloudExternalSubnetGroupExternalSubnetsSpec cidr(String cidr) {

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

    public NestedVirtualPrivateCloudExternalSubnetGroupExternalSubnetsSpec cidr_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CIDR);
        return this;
    }

    public NestedVirtualPrivateCloudExternalSubnetGroupExternalSubnetsSpec cidr_ExplictlyNonNull() {
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

    public NestedVirtualPrivateCloudExternalSubnetGroupExternalSubnetsSpec edgeGatewayId(
            String edgeGatewayId) {

        this.edgeGatewayId = edgeGatewayId;
        return this;
    }

    /**
     * Get edgeGatewayId
     *
     * @return edgeGatewayId
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getEdgeGatewayId() {
        return edgeGatewayId;
    }

    public void setEdgeGatewayId(String edgeGatewayId) {
        this.edgeGatewayId = edgeGatewayId;
    }

    public NestedVirtualPrivateCloudExternalSubnetGroupExternalSubnetsSpec
            edgeGatewayId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EDGE_GATEWAY_ID);
        return this;
    }

    public NestedVirtualPrivateCloudExternalSubnetGroupExternalSubnetsSpec
            edgeGatewayId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EDGE_GATEWAY_ID);
        return this;
    }

    public void setEdgeGatewayId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EDGE_GATEWAY_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EDGE_GATEWAY_ID);
        }
    }

    public boolean getEdgeGatewayId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EDGE_GATEWAY_ID);
    }

    public NestedVirtualPrivateCloudExternalSubnetGroupExternalSubnetsSpec floatingIpCidr(
            String floatingIpCidr) {

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

    public NestedVirtualPrivateCloudExternalSubnetGroupExternalSubnetsSpec
            floatingIpCidr_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FLOATING_IP_CIDR);
        return this;
    }

    public NestedVirtualPrivateCloudExternalSubnetGroupExternalSubnetsSpec
            floatingIpCidr_ExplictlyNonNull() {
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

    public NestedVirtualPrivateCloudExternalSubnetGroupExternalSubnetsSpec gateway(String gateway) {

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

    public NestedVirtualPrivateCloudExternalSubnetGroupExternalSubnetsSpec gateway_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_GATEWAY);
        return this;
    }

    public NestedVirtualPrivateCloudExternalSubnetGroupExternalSubnetsSpec
            gateway_ExplictlyNonNull() {
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

    public NestedVirtualPrivateCloudExternalSubnetGroupExternalSubnetsSpec id(String id) {

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

    public NestedVirtualPrivateCloudExternalSubnetGroupExternalSubnetsSpec id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public NestedVirtualPrivateCloudExternalSubnetGroupExternalSubnetsSpec id_ExplictlyNonNull() {
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

    public NestedVirtualPrivateCloudExternalSubnetGroupExternalSubnetsSpec natGatewayCidr(
            String natGatewayCidr) {

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

    public NestedVirtualPrivateCloudExternalSubnetGroupExternalSubnetsSpec
            natGatewayCidr_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAT_GATEWAY_CIDR);
        return this;
    }

    public NestedVirtualPrivateCloudExternalSubnetGroupExternalSubnetsSpec
            natGatewayCidr_ExplictlyNonNull() {
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

    public NestedVirtualPrivateCloudExternalSubnetGroupExternalSubnetsSpec routerGatewayCidr(
            String routerGatewayCidr) {

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

    public NestedVirtualPrivateCloudExternalSubnetGroupExternalSubnetsSpec
            routerGatewayCidr_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ROUTER_GATEWAY_CIDR);
        return this;
    }

    public NestedVirtualPrivateCloudExternalSubnetGroupExternalSubnetsSpec
            routerGatewayCidr_ExplictlyNonNull() {
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

    public NestedVirtualPrivateCloudExternalSubnetGroupExternalSubnetsSpec vlanId(String vlanId) {

        this.vlanId = vlanId;
        return this;
    }

    /**
     * Get vlanId
     *
     * @return vlanId
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getVlanId() {
        return vlanId;
    }

    public void setVlanId(String vlanId) {
        this.vlanId = vlanId;
    }

    public NestedVirtualPrivateCloudExternalSubnetGroupExternalSubnetsSpec vlanId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VLAN_ID);
        return this;
    }

    public NestedVirtualPrivateCloudExternalSubnetGroupExternalSubnetsSpec
            vlanId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VLAN_ID);
        return this;
    }

    public void setVlanId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VLAN_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VLAN_ID);
        }
    }

    public boolean getVlanId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VLAN_ID);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NestedVirtualPrivateCloudExternalSubnetGroupExternalSubnetsSpec
                nestedVirtualPrivateCloudExternalSubnetGroupExternalSubnetsSpec =
                        (NestedVirtualPrivateCloudExternalSubnetGroupExternalSubnetsSpec) o;
        return Objects.equals(
                        this.cidr,
                        nestedVirtualPrivateCloudExternalSubnetGroupExternalSubnetsSpec.cidr)
                && Objects.equals(
                        this.edgeGatewayId,
                        nestedVirtualPrivateCloudExternalSubnetGroupExternalSubnetsSpec
                                .edgeGatewayId)
                && Objects.equals(
                        this.floatingIpCidr,
                        nestedVirtualPrivateCloudExternalSubnetGroupExternalSubnetsSpec
                                .floatingIpCidr)
                && Objects.equals(
                        this.gateway,
                        nestedVirtualPrivateCloudExternalSubnetGroupExternalSubnetsSpec.gateway)
                && Objects.equals(
                        this.id, nestedVirtualPrivateCloudExternalSubnetGroupExternalSubnetsSpec.id)
                && Objects.equals(
                        this.natGatewayCidr,
                        nestedVirtualPrivateCloudExternalSubnetGroupExternalSubnetsSpec
                                .natGatewayCidr)
                && Objects.equals(
                        this.routerGatewayCidr,
                        nestedVirtualPrivateCloudExternalSubnetGroupExternalSubnetsSpec
                                .routerGatewayCidr)
                && Objects.equals(
                        this.vlanId,
                        nestedVirtualPrivateCloudExternalSubnetGroupExternalSubnetsSpec.vlanId);
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
                edgeGatewayId,
                floatingIpCidr,
                gateway,
                id,
                natGatewayCidr,
                routerGatewayCidr,
                vlanId);
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
        sb.append("class NestedVirtualPrivateCloudExternalSubnetGroupExternalSubnetsSpec {\n");
        sb.append("    cidr: ").append(toIndentedString(cidr)).append("\n");
        sb.append("    edgeGatewayId: ").append(toIndentedString(edgeGatewayId)).append("\n");
        sb.append("    floatingIpCidr: ").append(toIndentedString(floatingIpCidr)).append("\n");
        sb.append("    gateway: ").append(toIndentedString(gateway)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    natGatewayCidr: ").append(toIndentedString(natGatewayCidr)).append("\n");
        sb.append("    routerGatewayCidr: ")
                .append(toIndentedString(routerGatewayCidr))
                .append("\n");
        sb.append("    vlanId: ").append(toIndentedString(vlanId)).append("\n");
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

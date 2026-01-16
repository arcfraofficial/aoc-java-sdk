package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Arrays;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** NestedVirtualPrivateCloudExternalSubnet */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class NestedVirtualPrivateCloudExternalSubnet
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_EDGE_GATEWAY = "edge_gateway";

    @SerializedName(SERIALIZED_NAME_EDGE_GATEWAY)
    private NestedVirtualPrivateCloudEdgeGateway edgeGateway;

    public static final String SERIALIZED_NAME_FLOATING_IP_CIDR = "floating_ip_cidr";

    @SerializedName(SERIALIZED_NAME_FLOATING_IP_CIDR)
    private String floatingIpCidr;

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_NAT_GATEWAY_CIDR = "nat_gateway_cidr";

    @SerializedName(SERIALIZED_NAME_NAT_GATEWAY_CIDR)
    private String natGatewayCidr;

    public static final String SERIALIZED_NAME_ROUTER_GATEWAY_CIDR = "router_gateway_cidr";

    @SerializedName(SERIALIZED_NAME_ROUTER_GATEWAY_CIDR)
    private String routerGatewayCidr;

    public NestedVirtualPrivateCloudExternalSubnet() {}

    public NestedVirtualPrivateCloudExternalSubnet edgeGateway(
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

    public NestedVirtualPrivateCloudExternalSubnet edgeGateway_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EDGE_GATEWAY);
        return this;
    }

    public NestedVirtualPrivateCloudExternalSubnet edgeGateway_ExplictlyNonNull() {
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

    public NestedVirtualPrivateCloudExternalSubnet floatingIpCidr(String floatingIpCidr) {

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

    public NestedVirtualPrivateCloudExternalSubnet floatingIpCidr_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FLOATING_IP_CIDR);
        return this;
    }

    public NestedVirtualPrivateCloudExternalSubnet floatingIpCidr_ExplictlyNonNull() {
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

    public NestedVirtualPrivateCloudExternalSubnet id(String id) {

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

    public NestedVirtualPrivateCloudExternalSubnet id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public NestedVirtualPrivateCloudExternalSubnet id_ExplictlyNonNull() {
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

    public NestedVirtualPrivateCloudExternalSubnet name(String name) {

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

    public NestedVirtualPrivateCloudExternalSubnet name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public NestedVirtualPrivateCloudExternalSubnet name_ExplictlyNonNull() {
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

    public NestedVirtualPrivateCloudExternalSubnet natGatewayCidr(String natGatewayCidr) {

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

    public NestedVirtualPrivateCloudExternalSubnet natGatewayCidr_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAT_GATEWAY_CIDR);
        return this;
    }

    public NestedVirtualPrivateCloudExternalSubnet natGatewayCidr_ExplictlyNonNull() {
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

    public NestedVirtualPrivateCloudExternalSubnet routerGatewayCidr(String routerGatewayCidr) {

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

    public NestedVirtualPrivateCloudExternalSubnet routerGatewayCidr_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ROUTER_GATEWAY_CIDR);
        return this;
    }

    public NestedVirtualPrivateCloudExternalSubnet routerGatewayCidr_ExplictlyNonNull() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NestedVirtualPrivateCloudExternalSubnet nestedVirtualPrivateCloudExternalSubnet =
                (NestedVirtualPrivateCloudExternalSubnet) o;
        return Objects.equals(this.edgeGateway, nestedVirtualPrivateCloudExternalSubnet.edgeGateway)
                && Objects.equals(
                        this.floatingIpCidr, nestedVirtualPrivateCloudExternalSubnet.floatingIpCidr)
                && Objects.equals(this.id, nestedVirtualPrivateCloudExternalSubnet.id)
                && Objects.equals(this.name, nestedVirtualPrivateCloudExternalSubnet.name)
                && Objects.equals(
                        this.natGatewayCidr, nestedVirtualPrivateCloudExternalSubnet.natGatewayCidr)
                && Objects.equals(
                        this.routerGatewayCidr,
                        nestedVirtualPrivateCloudExternalSubnet.routerGatewayCidr);
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
                edgeGateway, floatingIpCidr, id, name, natGatewayCidr, routerGatewayCidr);
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
        sb.append("class NestedVirtualPrivateCloudExternalSubnet {\n");
        sb.append("    edgeGateway: ").append(toIndentedString(edgeGateway)).append("\n");
        sb.append("    floatingIpCidr: ").append(toIndentedString(floatingIpCidr)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    natGatewayCidr: ").append(toIndentedString(natGatewayCidr)).append("\n");
        sb.append("    routerGatewayCidr: ")
                .append(toIndentedString(routerGatewayCidr))
                .append("\n");
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

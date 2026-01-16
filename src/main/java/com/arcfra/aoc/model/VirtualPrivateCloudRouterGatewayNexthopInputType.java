package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** VirtualPrivateCloudRouterGatewayNexthopInputType */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VirtualPrivateCloudRouterGatewayNexthopInputType
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_EDGE_GATEWAY_ID = "edge_gateway_id";

    @SerializedName(SERIALIZED_NAME_EDGE_GATEWAY_ID)
    private String edgeGatewayId;

    public static final String SERIALIZED_NAME_NEXTHOP = "nexthop";

    @SerializedName(SERIALIZED_NAME_NEXTHOP)
    private String nexthop;

    public VirtualPrivateCloudRouterGatewayNexthopInputType() {}

    public VirtualPrivateCloudRouterGatewayNexthopInputType edgeGatewayId(String edgeGatewayId) {

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

    public VirtualPrivateCloudRouterGatewayNexthopInputType edgeGatewayId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EDGE_GATEWAY_ID);
        return this;
    }

    public VirtualPrivateCloudRouterGatewayNexthopInputType edgeGatewayId_ExplictlyNonNull() {
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

    public VirtualPrivateCloudRouterGatewayNexthopInputType nexthop(String nexthop) {

        this.nexthop = nexthop;
        return this;
    }

    /**
     * Get nexthop
     *
     * @return nexthop
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNexthop() {
        return nexthop;
    }

    public void setNexthop(String nexthop) {
        this.nexthop = nexthop;
    }

    public VirtualPrivateCloudRouterGatewayNexthopInputType nexthop_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NEXTHOP);
        return this;
    }

    public VirtualPrivateCloudRouterGatewayNexthopInputType nexthop_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NEXTHOP);
        return this;
    }

    public void setNexthop_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NEXTHOP);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NEXTHOP);
        }
    }

    public boolean getNexthop_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NEXTHOP);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VirtualPrivateCloudRouterGatewayNexthopInputType
                virtualPrivateCloudRouterGatewayNexthopInputType =
                        (VirtualPrivateCloudRouterGatewayNexthopInputType) o;
        return Objects.equals(
                        this.edgeGatewayId,
                        virtualPrivateCloudRouterGatewayNexthopInputType.edgeGatewayId)
                && Objects.equals(
                        this.nexthop, virtualPrivateCloudRouterGatewayNexthopInputType.nexthop);
    }

    @Override
    public int hashCode() {
        return Objects.hash(edgeGatewayId, nexthop);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VirtualPrivateCloudRouterGatewayNexthopInputType {\n");
        sb.append("    edgeGatewayId: ").append(toIndentedString(edgeGatewayId)).append("\n");
        sb.append("    nexthop: ").append(toIndentedString(nexthop)).append("\n");
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

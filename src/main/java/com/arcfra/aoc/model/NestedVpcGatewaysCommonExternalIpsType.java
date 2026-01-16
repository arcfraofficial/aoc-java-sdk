package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Arrays;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** NestedVpcGatewaysCommonExternalIpsType */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class NestedVpcGatewaysCommonExternalIpsType
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_EDGE_GATEWAY_ID = "edge_gateway_id";

    @SerializedName(SERIALIZED_NAME_EDGE_GATEWAY_ID)
    private String edgeGatewayId;

    public static final String SERIALIZED_NAME_EXTERNAL_IP = "external_ip";

    @SerializedName(SERIALIZED_NAME_EXTERNAL_IP)
    private String externalIp;

    public NestedVpcGatewaysCommonExternalIpsType() {}

    public NestedVpcGatewaysCommonExternalIpsType edgeGatewayId(String edgeGatewayId) {

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

    public NestedVpcGatewaysCommonExternalIpsType edgeGatewayId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EDGE_GATEWAY_ID);
        return this;
    }

    public NestedVpcGatewaysCommonExternalIpsType edgeGatewayId_ExplictlyNonNull() {
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

    public NestedVpcGatewaysCommonExternalIpsType externalIp(String externalIp) {

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

    public NestedVpcGatewaysCommonExternalIpsType externalIp_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXTERNAL_IP);
        return this;
    }

    public NestedVpcGatewaysCommonExternalIpsType externalIp_ExplictlyNonNull() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NestedVpcGatewaysCommonExternalIpsType nestedVpcGatewaysCommonExternalIpsType =
                (NestedVpcGatewaysCommonExternalIpsType) o;
        return Objects.equals(
                        this.edgeGatewayId, nestedVpcGatewaysCommonExternalIpsType.edgeGatewayId)
                && Objects.equals(
                        this.externalIp, nestedVpcGatewaysCommonExternalIpsType.externalIp);
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
        return Objects.hash(edgeGatewayId, externalIp);
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
        sb.append("class NestedVpcGatewaysCommonExternalIpsType {\n");
        sb.append("    edgeGatewayId: ").append(toIndentedString(edgeGatewayId)).append("\n");
        sb.append("    externalIp: ").append(toIndentedString(externalIp)).append("\n");
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

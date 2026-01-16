package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** NestedVirtualPrivateCloudExternalSubnetGroup */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class NestedVirtualPrivateCloudExternalSubnetGroup
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_EDGE_GATEWAY_GROUP = "edge_gateway_group";

    @SerializedName(SERIALIZED_NAME_EDGE_GATEWAY_GROUP)
    private NestedVirtualPrivateCloudEdgeGatewayGroup edgeGatewayGroup;

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public NestedVirtualPrivateCloudExternalSubnetGroup() {}

    public NestedVirtualPrivateCloudExternalSubnetGroup edgeGatewayGroup(
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

    public NestedVirtualPrivateCloudExternalSubnetGroup edgeGatewayGroup_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EDGE_GATEWAY_GROUP);
        return this;
    }

    public NestedVirtualPrivateCloudExternalSubnetGroup edgeGatewayGroup_ExplictlyNonNull() {
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

    public NestedVirtualPrivateCloudExternalSubnetGroup id(String id) {

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

    public NestedVirtualPrivateCloudExternalSubnetGroup id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public NestedVirtualPrivateCloudExternalSubnetGroup id_ExplictlyNonNull() {
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

    public NestedVirtualPrivateCloudExternalSubnetGroup name(String name) {

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

    public NestedVirtualPrivateCloudExternalSubnetGroup name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public NestedVirtualPrivateCloudExternalSubnetGroup name_ExplictlyNonNull() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NestedVirtualPrivateCloudExternalSubnetGroup nestedVirtualPrivateCloudExternalSubnetGroup =
                (NestedVirtualPrivateCloudExternalSubnetGroup) o;
        return Objects.equals(
                        this.edgeGatewayGroup,
                        nestedVirtualPrivateCloudExternalSubnetGroup.edgeGatewayGroup)
                && Objects.equals(this.id, nestedVirtualPrivateCloudExternalSubnetGroup.id)
                && Objects.equals(this.name, nestedVirtualPrivateCloudExternalSubnetGroup.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(edgeGatewayGroup, id, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NestedVirtualPrivateCloudExternalSubnetGroup {\n");
        sb.append("    edgeGatewayGroup: ").append(toIndentedString(edgeGatewayGroup)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

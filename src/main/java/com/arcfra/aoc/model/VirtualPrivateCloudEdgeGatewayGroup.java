package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** VirtualPrivateCloudEdgeGatewayGroup */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VirtualPrivateCloudEdgeGatewayGroup
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_ACTIVE_EDGE_GATEWAY_IDS = "active_edge_gateway_ids";

    @SerializedName(SERIALIZED_NAME_ACTIVE_EDGE_GATEWAY_IDS)
    private List<String> activeEdgeGatewayIds = new ArrayList<String>();

    public static final String SERIALIZED_NAME_DESCRIPTION = "description";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION)
    private String description;

    public static final String SERIALIZED_NAME_EDGE_GATEWAYS = "edge_gateways";

    @SerializedName(SERIALIZED_NAME_EDGE_GATEWAYS)
    private List<NestedVirtualPrivateCloudEdgeGateway> edgeGateways = null;

    public static final String SERIALIZED_NAME_ENTITY_ASYNC_STATUS = "entityAsyncStatus";

    @SerializedName(SERIALIZED_NAME_ENTITY_ASYNC_STATUS)
    private EntityAsyncStatus entityAsyncStatus;

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID = "primary_edge_gateway_id";

    @SerializedName(SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID)
    private String primaryEdgeGatewayId;

    public VirtualPrivateCloudEdgeGatewayGroup() {}

    public VirtualPrivateCloudEdgeGatewayGroup activeEdgeGatewayIds(
            List<String> activeEdgeGatewayIds) {

        this.activeEdgeGatewayIds = activeEdgeGatewayIds;
        return this;
    }

    public VirtualPrivateCloudEdgeGatewayGroup addActiveEdgeGatewayIdsItem(
            String activeEdgeGatewayIdsItem) {
        this.activeEdgeGatewayIds.add(activeEdgeGatewayIdsItem);
        return this;
    }

    /**
     * Get activeEdgeGatewayIds
     *
     * @return activeEdgeGatewayIds
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public List<String> getActiveEdgeGatewayIds() {
        return activeEdgeGatewayIds;
    }

    public void setActiveEdgeGatewayIds(List<String> activeEdgeGatewayIds) {
        this.activeEdgeGatewayIds = activeEdgeGatewayIds;
    }

    public VirtualPrivateCloudEdgeGatewayGroup activeEdgeGatewayIds_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ACTIVE_EDGE_GATEWAY_IDS);
        return this;
    }

    public VirtualPrivateCloudEdgeGatewayGroup activeEdgeGatewayIds_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ACTIVE_EDGE_GATEWAY_IDS);
        return this;
    }

    public void setActiveEdgeGatewayIds_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ACTIVE_EDGE_GATEWAY_IDS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ACTIVE_EDGE_GATEWAY_IDS);
        }
    }

    public boolean getActiveEdgeGatewayIds_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ACTIVE_EDGE_GATEWAY_IDS);
    }

    public VirtualPrivateCloudEdgeGatewayGroup description(String description) {

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

    public VirtualPrivateCloudEdgeGatewayGroup description_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION);
        return this;
    }

    public VirtualPrivateCloudEdgeGatewayGroup description_ExplictlyNonNull() {
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

    public VirtualPrivateCloudEdgeGatewayGroup edgeGateways(
            List<NestedVirtualPrivateCloudEdgeGateway> edgeGateways) {

        this.edgeGateways = edgeGateways;
        return this;
    }

    public VirtualPrivateCloudEdgeGatewayGroup addEdgeGatewaysItem(
            NestedVirtualPrivateCloudEdgeGateway edgeGatewaysItem) {
        if (this.edgeGateways == null) {
            this.edgeGateways = new ArrayList<NestedVirtualPrivateCloudEdgeGateway>();
        }
        this.edgeGateways.add(edgeGatewaysItem);
        return this;
    }

    /**
     * Get edgeGateways
     *
     * @return edgeGateways
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedVirtualPrivateCloudEdgeGateway> getEdgeGateways() {
        return edgeGateways;
    }

    public void setEdgeGateways(List<NestedVirtualPrivateCloudEdgeGateway> edgeGateways) {
        this.edgeGateways = edgeGateways;
    }

    public VirtualPrivateCloudEdgeGatewayGroup edgeGateways_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EDGE_GATEWAYS);
        return this;
    }

    public VirtualPrivateCloudEdgeGatewayGroup edgeGateways_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EDGE_GATEWAYS);
        return this;
    }

    public void setEdgeGateways_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EDGE_GATEWAYS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EDGE_GATEWAYS);
        }
    }

    public boolean getEdgeGateways_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EDGE_GATEWAYS);
    }

    public VirtualPrivateCloudEdgeGatewayGroup entityAsyncStatus(
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

    public VirtualPrivateCloudEdgeGatewayGroup entityAsyncStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        return this;
    }

    public VirtualPrivateCloudEdgeGatewayGroup entityAsyncStatus_ExplictlyNonNull() {
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

    public VirtualPrivateCloudEdgeGatewayGroup id(String id) {

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

    public VirtualPrivateCloudEdgeGatewayGroup id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public VirtualPrivateCloudEdgeGatewayGroup id_ExplictlyNonNull() {
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

    public VirtualPrivateCloudEdgeGatewayGroup name(String name) {

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

    public VirtualPrivateCloudEdgeGatewayGroup name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public VirtualPrivateCloudEdgeGatewayGroup name_ExplictlyNonNull() {
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

    public VirtualPrivateCloudEdgeGatewayGroup primaryEdgeGatewayId(String primaryEdgeGatewayId) {

        this.primaryEdgeGatewayId = primaryEdgeGatewayId;
        return this;
    }

    /**
     * Get primaryEdgeGatewayId
     *
     * @return primaryEdgeGatewayId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPrimaryEdgeGatewayId() {
        return primaryEdgeGatewayId;
    }

    public void setPrimaryEdgeGatewayId(String primaryEdgeGatewayId) {
        this.primaryEdgeGatewayId = primaryEdgeGatewayId;
    }

    public VirtualPrivateCloudEdgeGatewayGroup primaryEdgeGatewayId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID);
        return this;
    }

    public VirtualPrivateCloudEdgeGatewayGroup primaryEdgeGatewayId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID);
        return this;
    }

    public void setPrimaryEdgeGatewayId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID);
        }
    }

    public boolean getPrimaryEdgeGatewayId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRIMARY_EDGE_GATEWAY_ID);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VirtualPrivateCloudEdgeGatewayGroup virtualPrivateCloudEdgeGatewayGroup =
                (VirtualPrivateCloudEdgeGatewayGroup) o;
        return Objects.equals(
                        this.activeEdgeGatewayIds,
                        virtualPrivateCloudEdgeGatewayGroup.activeEdgeGatewayIds)
                && Objects.equals(this.description, virtualPrivateCloudEdgeGatewayGroup.description)
                && Objects.equals(
                        this.edgeGateways, virtualPrivateCloudEdgeGatewayGroup.edgeGateways)
                && Objects.equals(
                        this.entityAsyncStatus,
                        virtualPrivateCloudEdgeGatewayGroup.entityAsyncStatus)
                && Objects.equals(this.id, virtualPrivateCloudEdgeGatewayGroup.id)
                && Objects.equals(this.name, virtualPrivateCloudEdgeGatewayGroup.name)
                && Objects.equals(
                        this.primaryEdgeGatewayId,
                        virtualPrivateCloudEdgeGatewayGroup.primaryEdgeGatewayId);
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
                activeEdgeGatewayIds,
                description,
                edgeGateways,
                entityAsyncStatus,
                id,
                name,
                primaryEdgeGatewayId);
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
        sb.append("class VirtualPrivateCloudEdgeGatewayGroup {\n");
        sb.append("    activeEdgeGatewayIds: ")
                .append(toIndentedString(activeEdgeGatewayIds))
                .append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    edgeGateways: ").append(toIndentedString(edgeGateways)).append("\n");
        sb.append("    entityAsyncStatus: ")
                .append(toIndentedString(entityAsyncStatus))
                .append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    primaryEdgeGatewayId: ")
                .append(toIndentedString(primaryEdgeGatewayId))
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

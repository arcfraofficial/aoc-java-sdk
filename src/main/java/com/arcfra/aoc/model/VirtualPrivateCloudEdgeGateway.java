package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** VirtualPrivateCloudEdgeGateway */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VirtualPrivateCloudEdgeGateway
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

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_STATUS = "status";

    @SerializedName(SERIALIZED_NAME_STATUS)
    private NestedVirtualPrivateCloudEdgeGatewayStatus status;

    public static final String SERIALIZED_NAME_VDSES = "vdses";

    @SerializedName(SERIALIZED_NAME_VDSES)
    private List<NestedVds> vdses = null;

    public static final String SERIALIZED_NAME_VPC_SERVICE = "vpc_service";

    @SerializedName(SERIALIZED_NAME_VPC_SERVICE)
    private NestedVirtualPrivateCloudService vpcService;

    public VirtualPrivateCloudEdgeGateway() {}

    public VirtualPrivateCloudEdgeGateway description(String description) {

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

    public VirtualPrivateCloudEdgeGateway description_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION);
        return this;
    }

    public VirtualPrivateCloudEdgeGateway description_ExplictlyNonNull() {
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

    public VirtualPrivateCloudEdgeGateway edgeGatewayGroup(
            NestedVirtualPrivateCloudEdgeGatewayGroup edgeGatewayGroup) {

        this.edgeGatewayGroup = edgeGatewayGroup;
        return this;
    }

    /**
     * Get edgeGatewayGroup
     *
     * @return edgeGatewayGroup
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NestedVirtualPrivateCloudEdgeGatewayGroup getEdgeGatewayGroup() {
        return edgeGatewayGroup;
    }

    public void setEdgeGatewayGroup(NestedVirtualPrivateCloudEdgeGatewayGroup edgeGatewayGroup) {
        this.edgeGatewayGroup = edgeGatewayGroup;
    }

    public VirtualPrivateCloudEdgeGateway edgeGatewayGroup_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EDGE_GATEWAY_GROUP);
        return this;
    }

    public VirtualPrivateCloudEdgeGateway edgeGatewayGroup_ExplictlyNonNull() {
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

    public VirtualPrivateCloudEdgeGateway entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {

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

    public VirtualPrivateCloudEdgeGateway entityAsyncStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        return this;
    }

    public VirtualPrivateCloudEdgeGateway entityAsyncStatus_ExplictlyNonNull() {
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

    public VirtualPrivateCloudEdgeGateway id(String id) {

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

    public VirtualPrivateCloudEdgeGateway id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public VirtualPrivateCloudEdgeGateway id_ExplictlyNonNull() {
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

    public VirtualPrivateCloudEdgeGateway name(String name) {

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

    public VirtualPrivateCloudEdgeGateway name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public VirtualPrivateCloudEdgeGateway name_ExplictlyNonNull() {
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

    public VirtualPrivateCloudEdgeGateway status(
            NestedVirtualPrivateCloudEdgeGatewayStatus status) {

        this.status = status;
        return this;
    }

    /**
     * Get status
     *
     * @return status
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NestedVirtualPrivateCloudEdgeGatewayStatus getStatus() {
        return status;
    }

    public void setStatus(NestedVirtualPrivateCloudEdgeGatewayStatus status) {
        this.status = status;
    }

    public VirtualPrivateCloudEdgeGateway status_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATUS);
        return this;
    }

    public VirtualPrivateCloudEdgeGateway status_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STATUS);
        return this;
    }

    public void setStatus_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STATUS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STATUS);
        }
    }

    public boolean getStatus_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STATUS);
    }

    public VirtualPrivateCloudEdgeGateway vdses(List<NestedVds> vdses) {

        this.vdses = vdses;
        return this;
    }

    public VirtualPrivateCloudEdgeGateway addVdsesItem(NestedVds vdsesItem) {
        if (this.vdses == null) {
            this.vdses = new ArrayList<NestedVds>();
        }
        this.vdses.add(vdsesItem);
        return this;
    }

    /**
     * Get vdses
     *
     * @return vdses
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedVds> getVdses() {
        return vdses;
    }

    public void setVdses(List<NestedVds> vdses) {
        this.vdses = vdses;
    }

    public VirtualPrivateCloudEdgeGateway vdses_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VDSES);
        return this;
    }

    public VirtualPrivateCloudEdgeGateway vdses_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VDSES);
        return this;
    }

    public void setVdses_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VDSES);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VDSES);
        }
    }

    public boolean getVdses_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VDSES);
    }

    public VirtualPrivateCloudEdgeGateway vpcService(NestedVirtualPrivateCloudService vpcService) {

        this.vpcService = vpcService;
        return this;
    }

    /**
     * Get vpcService
     *
     * @return vpcService
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public NestedVirtualPrivateCloudService getVpcService() {
        return vpcService;
    }

    public void setVpcService(NestedVirtualPrivateCloudService vpcService) {
        this.vpcService = vpcService;
    }

    public VirtualPrivateCloudEdgeGateway vpcService_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VPC_SERVICE);
        return this;
    }

    public VirtualPrivateCloudEdgeGateway vpcService_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VPC_SERVICE);
        return this;
    }

    public void setVpcService_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VPC_SERVICE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VPC_SERVICE);
        }
    }

    public boolean getVpcService_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VPC_SERVICE);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VirtualPrivateCloudEdgeGateway virtualPrivateCloudEdgeGateway =
                (VirtualPrivateCloudEdgeGateway) o;
        return Objects.equals(this.description, virtualPrivateCloudEdgeGateway.description)
                && Objects.equals(
                        this.edgeGatewayGroup, virtualPrivateCloudEdgeGateway.edgeGatewayGroup)
                && Objects.equals(
                        this.entityAsyncStatus, virtualPrivateCloudEdgeGateway.entityAsyncStatus)
                && Objects.equals(this.id, virtualPrivateCloudEdgeGateway.id)
                && Objects.equals(this.name, virtualPrivateCloudEdgeGateway.name)
                && Objects.equals(this.status, virtualPrivateCloudEdgeGateway.status)
                && Objects.equals(this.vdses, virtualPrivateCloudEdgeGateway.vdses)
                && Objects.equals(this.vpcService, virtualPrivateCloudEdgeGateway.vpcService);
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
                id,
                name,
                status,
                vdses,
                vpcService);
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
        sb.append("class VirtualPrivateCloudEdgeGateway {\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    edgeGatewayGroup: ").append(toIndentedString(edgeGatewayGroup)).append("\n");
        sb.append("    entityAsyncStatus: ")
                .append(toIndentedString(entityAsyncStatus))
                .append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    vdses: ").append(toIndentedString(vdses)).append("\n");
        sb.append("    vpcService: ").append(toIndentedString(vpcService)).append("\n");
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

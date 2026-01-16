package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** VirtualPrivateCloudRouteTable */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VirtualPrivateCloudRouteTable
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_DEFAULT_FOR_VPC = "default_for_vpc";

    @SerializedName(SERIALIZED_NAME_DEFAULT_FOR_VPC)
    private Boolean defaultForVpc;

    public static final String SERIALIZED_NAME_DESCRIPTION = "description";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION)
    private String description;

    public static final String SERIALIZED_NAME_ENTITY_ASYNC_STATUS = "entityAsyncStatus";

    @SerializedName(SERIALIZED_NAME_ENTITY_ASYNC_STATUS)
    private EntityAsyncStatus entityAsyncStatus;

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

    public static final String SERIALIZED_NAME_LOCAL_ID = "local_id";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID)
    private String localId;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_ROUTES = "routes";

    @SerializedName(SERIALIZED_NAME_ROUTES)
    private List<NestedVirtualPrivateCloudRoute> routes = null;

    public static final String SERIALIZED_NAME_SUBNETS = "subnets";

    @SerializedName(SERIALIZED_NAME_SUBNETS)
    private List<NestedVirtualPrivateCloudSubnet> subnets = null;

    public static final String SERIALIZED_NAME_VPC = "vpc";

    @SerializedName(SERIALIZED_NAME_VPC)
    private NestedVirtualPrivateCloud vpc;

    public VirtualPrivateCloudRouteTable() {}

    public VirtualPrivateCloudRouteTable defaultForVpc(Boolean defaultForVpc) {

        this.defaultForVpc = defaultForVpc;
        return this;
    }

    /**
     * Get defaultForVpc
     *
     * @return defaultForVpc
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getDefaultForVpc() {
        return defaultForVpc;
    }

    public void setDefaultForVpc(Boolean defaultForVpc) {
        this.defaultForVpc = defaultForVpc;
    }

    public VirtualPrivateCloudRouteTable defaultForVpc_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEFAULT_FOR_VPC);
        return this;
    }

    public VirtualPrivateCloudRouteTable defaultForVpc_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_FOR_VPC);
        return this;
    }

    public void setDefaultForVpc_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEFAULT_FOR_VPC);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_FOR_VPC);
        }
    }

    public boolean getDefaultForVpc_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEFAULT_FOR_VPC);
    }

    public VirtualPrivateCloudRouteTable description(String description) {

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

    public VirtualPrivateCloudRouteTable description_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION);
        return this;
    }

    public VirtualPrivateCloudRouteTable description_ExplictlyNonNull() {
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

    public VirtualPrivateCloudRouteTable entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {

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

    public VirtualPrivateCloudRouteTable entityAsyncStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        return this;
    }

    public VirtualPrivateCloudRouteTable entityAsyncStatus_ExplictlyNonNull() {
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

    public VirtualPrivateCloudRouteTable id(String id) {

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

    public VirtualPrivateCloudRouteTable id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public VirtualPrivateCloudRouteTable id_ExplictlyNonNull() {
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

    public VirtualPrivateCloudRouteTable localId(String localId) {

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

    public VirtualPrivateCloudRouteTable localId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID);
        return this;
    }

    public VirtualPrivateCloudRouteTable localId_ExplictlyNonNull() {
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

    public VirtualPrivateCloudRouteTable name(String name) {

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

    public VirtualPrivateCloudRouteTable name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public VirtualPrivateCloudRouteTable name_ExplictlyNonNull() {
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

    public VirtualPrivateCloudRouteTable routes(List<NestedVirtualPrivateCloudRoute> routes) {

        this.routes = routes;
        return this;
    }

    public VirtualPrivateCloudRouteTable addRoutesItem(NestedVirtualPrivateCloudRoute routesItem) {
        if (this.routes == null) {
            this.routes = new ArrayList<NestedVirtualPrivateCloudRoute>();
        }
        this.routes.add(routesItem);
        return this;
    }

    /**
     * Get routes
     *
     * @return routes
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedVirtualPrivateCloudRoute> getRoutes() {
        return routes;
    }

    public void setRoutes(List<NestedVirtualPrivateCloudRoute> routes) {
        this.routes = routes;
    }

    public VirtualPrivateCloudRouteTable routes_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ROUTES);
        return this;
    }

    public VirtualPrivateCloudRouteTable routes_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ROUTES);
        return this;
    }

    public void setRoutes_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ROUTES);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ROUTES);
        }
    }

    public boolean getRoutes_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ROUTES);
    }

    public VirtualPrivateCloudRouteTable subnets(List<NestedVirtualPrivateCloudSubnet> subnets) {

        this.subnets = subnets;
        return this;
    }

    public VirtualPrivateCloudRouteTable addSubnetsItem(
            NestedVirtualPrivateCloudSubnet subnetsItem) {
        if (this.subnets == null) {
            this.subnets = new ArrayList<NestedVirtualPrivateCloudSubnet>();
        }
        this.subnets.add(subnetsItem);
        return this;
    }

    /**
     * Get subnets
     *
     * @return subnets
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedVirtualPrivateCloudSubnet> getSubnets() {
        return subnets;
    }

    public void setSubnets(List<NestedVirtualPrivateCloudSubnet> subnets) {
        this.subnets = subnets;
    }

    public VirtualPrivateCloudRouteTable subnets_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUBNETS);
        return this;
    }

    public VirtualPrivateCloudRouteTable subnets_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SUBNETS);
        return this;
    }

    public void setSubnets_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SUBNETS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SUBNETS);
        }
    }

    public boolean getSubnets_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SUBNETS);
    }

    public VirtualPrivateCloudRouteTable vpc(NestedVirtualPrivateCloud vpc) {

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

    public VirtualPrivateCloudRouteTable vpc_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VPC);
        return this;
    }

    public VirtualPrivateCloudRouteTable vpc_ExplictlyNonNull() {
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
        VirtualPrivateCloudRouteTable virtualPrivateCloudRouteTable =
                (VirtualPrivateCloudRouteTable) o;
        return Objects.equals(this.defaultForVpc, virtualPrivateCloudRouteTable.defaultForVpc)
                && Objects.equals(this.description, virtualPrivateCloudRouteTable.description)
                && Objects.equals(
                        this.entityAsyncStatus, virtualPrivateCloudRouteTable.entityAsyncStatus)
                && Objects.equals(this.id, virtualPrivateCloudRouteTable.id)
                && Objects.equals(this.localId, virtualPrivateCloudRouteTable.localId)
                && Objects.equals(this.name, virtualPrivateCloudRouteTable.name)
                && Objects.equals(this.routes, virtualPrivateCloudRouteTable.routes)
                && Objects.equals(this.subnets, virtualPrivateCloudRouteTable.subnets)
                && Objects.equals(this.vpc, virtualPrivateCloudRouteTable.vpc);
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
                defaultForVpc,
                description,
                entityAsyncStatus,
                id,
                localId,
                name,
                routes,
                subnets,
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
        sb.append("class VirtualPrivateCloudRouteTable {\n");
        sb.append("    defaultForVpc: ").append(toIndentedString(defaultForVpc)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    entityAsyncStatus: ")
                .append(toIndentedString(entityAsyncStatus))
                .append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    routes: ").append(toIndentedString(routes)).append("\n");
        sb.append("    subnets: ").append(toIndentedString(subnets)).append("\n");
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

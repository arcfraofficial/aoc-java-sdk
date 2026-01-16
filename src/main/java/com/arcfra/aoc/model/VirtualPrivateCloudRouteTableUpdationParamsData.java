package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** VirtualPrivateCloudRouteTableUpdationParamsData */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VirtualPrivateCloudRouteTableUpdationParamsData
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_ROUTES = "routes";

    @SerializedName(SERIALIZED_NAME_ROUTES)
    private List<VirtualPrivateCloudRouteParams> routes = null;

    public static final String SERIALIZED_NAME_DESCRIPTION = "description";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION)
    private String description;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public VirtualPrivateCloudRouteTableUpdationParamsData() {}

    public VirtualPrivateCloudRouteTableUpdationParamsData routes(
            List<VirtualPrivateCloudRouteParams> routes) {

        this.routes = routes;
        return this;
    }

    public VirtualPrivateCloudRouteTableUpdationParamsData addRoutesItem(
            VirtualPrivateCloudRouteParams routesItem) {
        if (this.routes == null) {
            this.routes = new ArrayList<VirtualPrivateCloudRouteParams>();
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
    public List<VirtualPrivateCloudRouteParams> getRoutes() {
        return routes;
    }

    public void setRoutes(List<VirtualPrivateCloudRouteParams> routes) {
        this.routes = routes;
    }

    public VirtualPrivateCloudRouteTableUpdationParamsData routes_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ROUTES);
        return this;
    }

    public VirtualPrivateCloudRouteTableUpdationParamsData routes_ExplictlyNonNull() {
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

    public VirtualPrivateCloudRouteTableUpdationParamsData description(String description) {

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

    public VirtualPrivateCloudRouteTableUpdationParamsData description_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION);
        return this;
    }

    public VirtualPrivateCloudRouteTableUpdationParamsData description_ExplictlyNonNull() {
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

    public VirtualPrivateCloudRouteTableUpdationParamsData name(String name) {

        this.name = name;
        return this;
    }

    /**
     * Get name
     *
     * @return name
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public VirtualPrivateCloudRouteTableUpdationParamsData name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public VirtualPrivateCloudRouteTableUpdationParamsData name_ExplictlyNonNull() {
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
        VirtualPrivateCloudRouteTableUpdationParamsData
                virtualPrivateCloudRouteTableUpdationParamsData =
                        (VirtualPrivateCloudRouteTableUpdationParamsData) o;
        return Objects.equals(this.routes, virtualPrivateCloudRouteTableUpdationParamsData.routes)
                && Objects.equals(
                        this.description,
                        virtualPrivateCloudRouteTableUpdationParamsData.description)
                && Objects.equals(this.name, virtualPrivateCloudRouteTableUpdationParamsData.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(routes, description, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VirtualPrivateCloudRouteTableUpdationParamsData {\n");
        sb.append("    routes: ").append(toIndentedString(routes)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

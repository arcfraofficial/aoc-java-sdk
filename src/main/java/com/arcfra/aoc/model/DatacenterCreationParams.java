package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** DatacenterCreationParams */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class DatacenterCreationParams
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_CLUSTERS = "clusters";

    @SerializedName(SERIALIZED_NAME_CLUSTERS)
    private ClusterWhereInput clusters;

    public static final String SERIALIZED_NAME_ORGANIZATION_ID = "organization_id";

    @SerializedName(SERIALIZED_NAME_ORGANIZATION_ID)
    private String organizationId;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public DatacenterCreationParams() {}

    public DatacenterCreationParams clusters(ClusterWhereInput clusters) {

        this.clusters = clusters;
        return this;
    }

    /**
     * Get clusters
     *
     * @return clusters
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ClusterWhereInput getClusters() {
        return clusters;
    }

    public void setClusters(ClusterWhereInput clusters) {
        this.clusters = clusters;
    }

    public DatacenterCreationParams clusters_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTERS);
        return this;
    }

    public DatacenterCreationParams clusters_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLUSTERS);
        return this;
    }

    public void setClusters_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLUSTERS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLUSTERS);
        }
    }

    public boolean getClusters_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLUSTERS);
    }

    public DatacenterCreationParams organizationId(String organizationId) {

        this.organizationId = organizationId;
        return this;
    }

    /**
     * Get organizationId
     *
     * @return organizationId
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    public DatacenterCreationParams organizationId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ORGANIZATION_ID);
        return this;
    }

    public DatacenterCreationParams organizationId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ORGANIZATION_ID);
        return this;
    }

    public void setOrganizationId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ORGANIZATION_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ORGANIZATION_ID);
        }
    }

    public boolean getOrganizationId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ORGANIZATION_ID);
    }

    public DatacenterCreationParams name(String name) {

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

    public DatacenterCreationParams name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public DatacenterCreationParams name_ExplictlyNonNull() {
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
        DatacenterCreationParams datacenterCreationParams = (DatacenterCreationParams) o;
        return Objects.equals(this.clusters, datacenterCreationParams.clusters)
                && Objects.equals(this.organizationId, datacenterCreationParams.organizationId)
                && Objects.equals(this.name, datacenterCreationParams.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusters, organizationId, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DatacenterCreationParams {\n");
        sb.append("    clusters: ").append(toIndentedString(clusters)).append("\n");
        sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
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

package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Arrays;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** ContentLibraryImageUpdationClusterParamsData */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class ContentLibraryImageUpdationClusterParamsData
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_DATASTORES = "datastores";

    @SerializedName(SERIALIZED_NAME_DATASTORES)
    private DatastoreWhereInput datastores;

    public static final String SERIALIZED_NAME_CLUSTERS = "clusters";

    @SerializedName(SERIALIZED_NAME_CLUSTERS)
    private ClusterWhereInput clusters;

    public ContentLibraryImageUpdationClusterParamsData() {}

    public ContentLibraryImageUpdationClusterParamsData datastores(DatastoreWhereInput datastores) {

        this.datastores = datastores;
        return this;
    }

    /**
     * Get datastores
     *
     * @return datastores
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public DatastoreWhereInput getDatastores() {
        return datastores;
    }

    public void setDatastores(DatastoreWhereInput datastores) {
        this.datastores = datastores;
    }

    public ContentLibraryImageUpdationClusterParamsData datastores_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATASTORES);
        return this;
    }

    public ContentLibraryImageUpdationClusterParamsData datastores_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATASTORES);
        return this;
    }

    public void setDatastores_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATASTORES);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATASTORES);
        }
    }

    public boolean getDatastores_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATASTORES);
    }

    public ContentLibraryImageUpdationClusterParamsData clusters(ClusterWhereInput clusters) {

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

    public ContentLibraryImageUpdationClusterParamsData clusters_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTERS);
        return this;
    }

    public ContentLibraryImageUpdationClusterParamsData clusters_ExplictlyNonNull() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ContentLibraryImageUpdationClusterParamsData contentLibraryImageUpdationClusterParamsData =
                (ContentLibraryImageUpdationClusterParamsData) o;
        return Objects.equals(
                        this.datastores, contentLibraryImageUpdationClusterParamsData.datastores)
                && Objects.equals(
                        this.clusters, contentLibraryImageUpdationClusterParamsData.clusters);
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
        return Objects.hash(datastores, clusters);
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
        sb.append("class ContentLibraryImageUpdationClusterParamsData {\n");
        sb.append("    datastores: ").append(toIndentedString(datastores)).append("\n");
        sb.append("    clusters: ").append(toIndentedString(clusters)).append("\n");
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

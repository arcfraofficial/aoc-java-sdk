package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Arrays;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** NodeTopo */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class NodeTopo extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_BRICK_TOPO = "brick_topo";

    @SerializedName(SERIALIZED_NAME_BRICK_TOPO)
    private NestedBrickTopo brickTopo;

    public static final String SERIALIZED_NAME_CLUSTER = "cluster";

    @SerializedName(SERIALIZED_NAME_CLUSTER)
    private NestedCluster cluster;

    public static final String SERIALIZED_NAME_CLUSTER_TOPO = "cluster_topo";

    @SerializedName(SERIALIZED_NAME_CLUSTER_TOPO)
    private NestedClusterTopo clusterTopo;

    public static final String SERIALIZED_NAME_HOST = "host";

    @SerializedName(SERIALIZED_NAME_HOST)
    private NestedHost host;

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

    public static final String SERIALIZED_NAME_LOCAL_ID = "local_id";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID)
    private String localId;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_POSITION = "position";

    @SerializedName(SERIALIZED_NAME_POSITION)
    private NestedPosition position;

    public NodeTopo() {}

    public NodeTopo brickTopo(NestedBrickTopo brickTopo) {

        this.brickTopo = brickTopo;
        return this;
    }

    /**
     * Get brickTopo
     *
     * @return brickTopo
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NestedBrickTopo getBrickTopo() {
        return brickTopo;
    }

    public void setBrickTopo(NestedBrickTopo brickTopo) {
        this.brickTopo = brickTopo;
    }

    public NodeTopo brickTopo_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BRICK_TOPO);
        return this;
    }

    public NodeTopo brickTopo_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BRICK_TOPO);
        return this;
    }

    public void setBrickTopo_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BRICK_TOPO);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BRICK_TOPO);
        }
    }

    public boolean getBrickTopo_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BRICK_TOPO);
    }

    public NodeTopo cluster(NestedCluster cluster) {

        this.cluster = cluster;
        return this;
    }

    /**
     * Get cluster
     *
     * @return cluster
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public NestedCluster getCluster() {
        return cluster;
    }

    public void setCluster(NestedCluster cluster) {
        this.cluster = cluster;
    }

    public NodeTopo cluster_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER);
        return this;
    }

    public NodeTopo cluster_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLUSTER);
        return this;
    }

    public void setCluster_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLUSTER);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLUSTER);
        }
    }

    public boolean getCluster_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLUSTER);
    }

    public NodeTopo clusterTopo(NestedClusterTopo clusterTopo) {

        this.clusterTopo = clusterTopo;
        return this;
    }

    /**
     * Get clusterTopo
     *
     * @return clusterTopo
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NestedClusterTopo getClusterTopo() {
        return clusterTopo;
    }

    public void setClusterTopo(NestedClusterTopo clusterTopo) {
        this.clusterTopo = clusterTopo;
    }

    public NodeTopo clusterTopo_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER_TOPO);
        return this;
    }

    public NodeTopo clusterTopo_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_TOPO);
        return this;
    }

    public void setClusterTopo_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLUSTER_TOPO);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_TOPO);
        }
    }

    public boolean getClusterTopo_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLUSTER_TOPO);
    }

    public NodeTopo host(NestedHost host) {

        this.host = host;
        return this;
    }

    /**
     * Get host
     *
     * @return host
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public NestedHost getHost() {
        return host;
    }

    public void setHost(NestedHost host) {
        this.host = host;
    }

    public NodeTopo host_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOST);
        return this;
    }

    public NodeTopo host_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HOST);
        return this;
    }

    public void setHost_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HOST);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HOST);
        }
    }

    public boolean getHost_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HOST);
    }

    public NodeTopo id(String id) {

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

    public NodeTopo id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public NodeTopo id_ExplictlyNonNull() {
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

    public NodeTopo localId(String localId) {

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

    public NodeTopo localId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID);
        return this;
    }

    public NodeTopo localId_ExplictlyNonNull() {
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

    public NodeTopo name(String name) {

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

    public NodeTopo name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public NodeTopo name_ExplictlyNonNull() {
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

    public NodeTopo position(NestedPosition position) {

        this.position = position;
        return this;
    }

    /**
     * Get position
     *
     * @return position
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public NestedPosition getPosition() {
        return position;
    }

    public void setPosition(NestedPosition position) {
        this.position = position;
    }

    public NodeTopo position_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_POSITION);
        return this;
    }

    public NodeTopo position_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_POSITION);
        return this;
    }

    public void setPosition_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_POSITION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_POSITION);
        }
    }

    public boolean getPosition_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_POSITION);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NodeTopo nodeTopo = (NodeTopo) o;
        return Objects.equals(this.brickTopo, nodeTopo.brickTopo)
                && Objects.equals(this.cluster, nodeTopo.cluster)
                && Objects.equals(this.clusterTopo, nodeTopo.clusterTopo)
                && Objects.equals(this.host, nodeTopo.host)
                && Objects.equals(this.id, nodeTopo.id)
                && Objects.equals(this.localId, nodeTopo.localId)
                && Objects.equals(this.name, nodeTopo.name)
                && Objects.equals(this.position, nodeTopo.position);
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
        return Objects.hash(brickTopo, cluster, clusterTopo, host, id, localId, name, position);
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
        sb.append("class NodeTopo {\n");
        sb.append("    brickTopo: ").append(toIndentedString(brickTopo)).append("\n");
        sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
        sb.append("    clusterTopo: ").append(toIndentedString(clusterTopo)).append("\n");
        sb.append("    host: ").append(toIndentedString(host)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    position: ").append(toIndentedString(position)).append("\n");
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

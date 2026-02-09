package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** ZoneTopo */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class ZoneTopo extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_CLUSTER = "cluster";

    @SerializedName(SERIALIZED_NAME_CLUSTER)
    private NestedCluster cluster;

    public static final String SERIALIZED_NAME_CLUSTER_TOPO = "cluster_topo";

    @SerializedName(SERIALIZED_NAME_CLUSTER_TOPO)
    private NestedClusterTopo clusterTopo;

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

    public static final String SERIALIZED_NAME_LOCAL_ID = "local_id";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID)
    private String localId;

    public static final String SERIALIZED_NAME_RACK_TOPOES = "rack_topoes";

    @SerializedName(SERIALIZED_NAME_RACK_TOPOES)
    private List<NestedRackTopo> rackTopoes = null;

    public ZoneTopo() {}

    public ZoneTopo cluster(NestedCluster cluster) {

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

    public ZoneTopo cluster_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER);
        return this;
    }

    public ZoneTopo cluster_ExplictlyNonNull() {
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

    public ZoneTopo clusterTopo(NestedClusterTopo clusterTopo) {

        this.clusterTopo = clusterTopo;
        return this;
    }

    /**
     * Get clusterTopo
     *
     * @return clusterTopo
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public NestedClusterTopo getClusterTopo() {
        return clusterTopo;
    }

    public void setClusterTopo(NestedClusterTopo clusterTopo) {
        this.clusterTopo = clusterTopo;
    }

    public ZoneTopo clusterTopo_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER_TOPO);
        return this;
    }

    public ZoneTopo clusterTopo_ExplictlyNonNull() {
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

    public ZoneTopo id(String id) {

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

    public ZoneTopo id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public ZoneTopo id_ExplictlyNonNull() {
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

    public ZoneTopo localId(String localId) {

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

    public ZoneTopo localId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID);
        return this;
    }

    public ZoneTopo localId_ExplictlyNonNull() {
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

    public ZoneTopo rackTopoes(List<NestedRackTopo> rackTopoes) {

        this.rackTopoes = rackTopoes;
        return this;
    }

    public ZoneTopo addRackTopoesItem(NestedRackTopo rackTopoesItem) {
        if (this.rackTopoes == null) {
            this.rackTopoes = new ArrayList<NestedRackTopo>();
        }
        this.rackTopoes.add(rackTopoesItem);
        return this;
    }

    /**
     * Get rackTopoes
     *
     * @return rackTopoes
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedRackTopo> getRackTopoes() {
        return rackTopoes;
    }

    public void setRackTopoes(List<NestedRackTopo> rackTopoes) {
        this.rackTopoes = rackTopoes;
    }

    public ZoneTopo rackTopoes_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RACK_TOPOES);
        return this;
    }

    public ZoneTopo rackTopoes_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RACK_TOPOES);
        return this;
    }

    public void setRackTopoes_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RACK_TOPOES);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RACK_TOPOES);
        }
    }

    public boolean getRackTopoes_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RACK_TOPOES);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ZoneTopo zoneTopo = (ZoneTopo) o;
        return Objects.equals(this.cluster, zoneTopo.cluster)
                && Objects.equals(this.clusterTopo, zoneTopo.clusterTopo)
                && Objects.equals(this.id, zoneTopo.id)
                && Objects.equals(this.localId, zoneTopo.localId)
                && Objects.equals(this.rackTopoes, zoneTopo.rackTopoes);
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
        return Objects.hash(cluster, clusterTopo, id, localId, rackTopoes);
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
        sb.append("class ZoneTopo {\n");
        sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
        sb.append("    clusterTopo: ").append(toIndentedString(clusterTopo)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
        sb.append("    rackTopoes: ").append(toIndentedString(rackTopoes)).append("\n");
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

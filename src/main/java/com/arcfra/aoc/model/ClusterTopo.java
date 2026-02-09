package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** ClusterTopo */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class ClusterTopo extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_BRICK_TOPOES = "brick_topoes";

    @SerializedName(SERIALIZED_NAME_BRICK_TOPOES)
    private List<NestedBrickTopo> brickTopoes = null;

    public static final String SERIALIZED_NAME_CLUSTER = "cluster";

    @SerializedName(SERIALIZED_NAME_CLUSTER)
    private NestedCluster cluster;

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

    public static final String SERIALIZED_NAME_LOCAL_ID = "local_id";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID)
    private String localId;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_NODE_TOPOES = "node_topoes";

    @SerializedName(SERIALIZED_NAME_NODE_TOPOES)
    private List<NestedNodeTopo> nodeTopoes = null;

    public static final String SERIALIZED_NAME_ZONE_TOPOES = "zone_topoes";

    @SerializedName(SERIALIZED_NAME_ZONE_TOPOES)
    private List<NestedZoneTopo> zoneTopoes = null;

    public ClusterTopo() {}

    public ClusterTopo brickTopoes(List<NestedBrickTopo> brickTopoes) {

        this.brickTopoes = brickTopoes;
        return this;
    }

    public ClusterTopo addBrickTopoesItem(NestedBrickTopo brickTopoesItem) {
        if (this.brickTopoes == null) {
            this.brickTopoes = new ArrayList<NestedBrickTopo>();
        }
        this.brickTopoes.add(brickTopoesItem);
        return this;
    }

    /**
     * Get brickTopoes
     *
     * @return brickTopoes
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedBrickTopo> getBrickTopoes() {
        return brickTopoes;
    }

    public void setBrickTopoes(List<NestedBrickTopo> brickTopoes) {
        this.brickTopoes = brickTopoes;
    }

    public ClusterTopo brickTopoes_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BRICK_TOPOES);
        return this;
    }

    public ClusterTopo brickTopoes_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BRICK_TOPOES);
        return this;
    }

    public void setBrickTopoes_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BRICK_TOPOES);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BRICK_TOPOES);
        }
    }

    public boolean getBrickTopoes_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BRICK_TOPOES);
    }

    public ClusterTopo cluster(NestedCluster cluster) {

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

    public ClusterTopo cluster_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER);
        return this;
    }

    public ClusterTopo cluster_ExplictlyNonNull() {
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

    public ClusterTopo id(String id) {

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

    public ClusterTopo id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public ClusterTopo id_ExplictlyNonNull() {
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

    public ClusterTopo localId(String localId) {

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

    public ClusterTopo localId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID);
        return this;
    }

    public ClusterTopo localId_ExplictlyNonNull() {
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

    public ClusterTopo name(String name) {

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

    public ClusterTopo name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public ClusterTopo name_ExplictlyNonNull() {
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

    public ClusterTopo nodeTopoes(List<NestedNodeTopo> nodeTopoes) {

        this.nodeTopoes = nodeTopoes;
        return this;
    }

    public ClusterTopo addNodeTopoesItem(NestedNodeTopo nodeTopoesItem) {
        if (this.nodeTopoes == null) {
            this.nodeTopoes = new ArrayList<NestedNodeTopo>();
        }
        this.nodeTopoes.add(nodeTopoesItem);
        return this;
    }

    /**
     * Get nodeTopoes
     *
     * @return nodeTopoes
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedNodeTopo> getNodeTopoes() {
        return nodeTopoes;
    }

    public void setNodeTopoes(List<NestedNodeTopo> nodeTopoes) {
        this.nodeTopoes = nodeTopoes;
    }

    public ClusterTopo nodeTopoes_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NODE_TOPOES);
        return this;
    }

    public ClusterTopo nodeTopoes_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NODE_TOPOES);
        return this;
    }

    public void setNodeTopoes_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NODE_TOPOES);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NODE_TOPOES);
        }
    }

    public boolean getNodeTopoes_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NODE_TOPOES);
    }

    public ClusterTopo zoneTopoes(List<NestedZoneTopo> zoneTopoes) {

        this.zoneTopoes = zoneTopoes;
        return this;
    }

    public ClusterTopo addZoneTopoesItem(NestedZoneTopo zoneTopoesItem) {
        if (this.zoneTopoes == null) {
            this.zoneTopoes = new ArrayList<NestedZoneTopo>();
        }
        this.zoneTopoes.add(zoneTopoesItem);
        return this;
    }

    /**
     * Get zoneTopoes
     *
     * @return zoneTopoes
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedZoneTopo> getZoneTopoes() {
        return zoneTopoes;
    }

    public void setZoneTopoes(List<NestedZoneTopo> zoneTopoes) {
        this.zoneTopoes = zoneTopoes;
    }

    public ClusterTopo zoneTopoes_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ZONE_TOPOES);
        return this;
    }

    public ClusterTopo zoneTopoes_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ZONE_TOPOES);
        return this;
    }

    public void setZoneTopoes_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ZONE_TOPOES);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ZONE_TOPOES);
        }
    }

    public boolean getZoneTopoes_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ZONE_TOPOES);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ClusterTopo clusterTopo = (ClusterTopo) o;
        return Objects.equals(this.brickTopoes, clusterTopo.brickTopoes)
                && Objects.equals(this.cluster, clusterTopo.cluster)
                && Objects.equals(this.id, clusterTopo.id)
                && Objects.equals(this.localId, clusterTopo.localId)
                && Objects.equals(this.name, clusterTopo.name)
                && Objects.equals(this.nodeTopoes, clusterTopo.nodeTopoes)
                && Objects.equals(this.zoneTopoes, clusterTopo.zoneTopoes);
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
        return Objects.hash(brickTopoes, cluster, id, localId, name, nodeTopoes, zoneTopoes);
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
        sb.append("class ClusterTopo {\n");
        sb.append("    brickTopoes: ").append(toIndentedString(brickTopoes)).append("\n");
        sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    nodeTopoes: ").append(toIndentedString(nodeTopoes)).append("\n");
        sb.append("    zoneTopoes: ").append(toIndentedString(zoneTopoes)).append("\n");
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

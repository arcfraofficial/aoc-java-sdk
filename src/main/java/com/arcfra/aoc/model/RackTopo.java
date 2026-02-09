package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** RackTopo */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class RackTopo extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_BRICK_TOPOES = "brick_topoes";

    @SerializedName(SERIALIZED_NAME_BRICK_TOPOES)
    private List<NestedBrickTopo> brickTopoes = null;

    public static final String SERIALIZED_NAME_CLUSTER = "cluster";

    @SerializedName(SERIALIZED_NAME_CLUSTER)
    private NestedCluster cluster;

    public static final String SERIALIZED_NAME_HEIGHT = "height";

    @SerializedName(SERIALIZED_NAME_HEIGHT)
    private Integer height;

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

    public static final String SERIALIZED_NAME_LOCAL_ID = "local_id";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID)
    private String localId;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_ZONE_TOPO = "zone_topo";

    @SerializedName(SERIALIZED_NAME_ZONE_TOPO)
    private NestedZoneTopo zoneTopo;

    public RackTopo() {}

    public RackTopo brickTopoes(List<NestedBrickTopo> brickTopoes) {

        this.brickTopoes = brickTopoes;
        return this;
    }

    public RackTopo addBrickTopoesItem(NestedBrickTopo brickTopoesItem) {
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

    public RackTopo brickTopoes_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BRICK_TOPOES);
        return this;
    }

    public RackTopo brickTopoes_ExplictlyNonNull() {
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

    public RackTopo cluster(NestedCluster cluster) {

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

    public RackTopo cluster_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER);
        return this;
    }

    public RackTopo cluster_ExplictlyNonNull() {
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

    public RackTopo height(Integer height) {

        this.height = height;
        return this;
    }

    /**
     * Get height
     *
     * @return height
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public RackTopo height_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HEIGHT);
        return this;
    }

    public RackTopo height_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HEIGHT);
        return this;
    }

    public void setHeight_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HEIGHT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HEIGHT);
        }
    }

    public boolean getHeight_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HEIGHT);
    }

    public RackTopo id(String id) {

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

    public RackTopo id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public RackTopo id_ExplictlyNonNull() {
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

    public RackTopo localId(String localId) {

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

    public RackTopo localId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID);
        return this;
    }

    public RackTopo localId_ExplictlyNonNull() {
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

    public RackTopo name(String name) {

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

    public RackTopo name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public RackTopo name_ExplictlyNonNull() {
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

    public RackTopo zoneTopo(NestedZoneTopo zoneTopo) {

        this.zoneTopo = zoneTopo;
        return this;
    }

    /**
     * Get zoneTopo
     *
     * @return zoneTopo
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public NestedZoneTopo getZoneTopo() {
        return zoneTopo;
    }

    public void setZoneTopo(NestedZoneTopo zoneTopo) {
        this.zoneTopo = zoneTopo;
    }

    public RackTopo zoneTopo_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ZONE_TOPO);
        return this;
    }

    public RackTopo zoneTopo_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ZONE_TOPO);
        return this;
    }

    public void setZoneTopo_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ZONE_TOPO);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ZONE_TOPO);
        }
    }

    public boolean getZoneTopo_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ZONE_TOPO);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RackTopo rackTopo = (RackTopo) o;
        return Objects.equals(this.brickTopoes, rackTopo.brickTopoes)
                && Objects.equals(this.cluster, rackTopo.cluster)
                && Objects.equals(this.height, rackTopo.height)
                && Objects.equals(this.id, rackTopo.id)
                && Objects.equals(this.localId, rackTopo.localId)
                && Objects.equals(this.name, rackTopo.name)
                && Objects.equals(this.zoneTopo, rackTopo.zoneTopo);
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
        return Objects.hash(brickTopoes, cluster, height, id, localId, name, zoneTopo);
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
        sb.append("class RackTopo {\n");
        sb.append("    brickTopoes: ").append(toIndentedString(brickTopoes)).append("\n");
        sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
        sb.append("    height: ").append(toIndentedString(height)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    zoneTopo: ").append(toIndentedString(zoneTopo)).append("\n");
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

package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** BrickTopo */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class BrickTopo extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_CAPACITY = "capacity";

    @SerializedName(SERIALIZED_NAME_CAPACITY)
    private NestedCapacity capacity;

    public static final String SERIALIZED_NAME_CLUSTER = "cluster";

    @SerializedName(SERIALIZED_NAME_CLUSTER)
    private NestedCluster cluster;

    public static final String SERIALIZED_NAME_CLUSTER_TOPO = "cluster_topo";

    @SerializedName(SERIALIZED_NAME_CLUSTER_TOPO)
    private NestedClusterTopo clusterTopo;

    public static final String SERIALIZED_NAME_DISK_LAYOUT = "disk_layout";

    @SerializedName(SERIALIZED_NAME_DISK_LAYOUT)
    private NestedBrickDiskLayout diskLayout;

    public static final String SERIALIZED_NAME_HEIGHT = "height";

    @SerializedName(SERIALIZED_NAME_HEIGHT)
    private Integer height;

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

    public static final String SERIALIZED_NAME_LOCAL_ID = "local_id";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID)
    private String localId;

    public static final String SERIALIZED_NAME_MODEL = "model";

    @SerializedName(SERIALIZED_NAME_MODEL)
    private String model;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_NODE_TOPOES = "node_topoes";

    @SerializedName(SERIALIZED_NAME_NODE_TOPOES)
    private List<NestedNodeTopo> nodeTopoes = null;

    public static final String SERIALIZED_NAME_POSITION = "position";

    @SerializedName(SERIALIZED_NAME_POSITION)
    private Integer position;

    public static final String SERIALIZED_NAME_POWER_LAYOUT = "power_layout";

    @SerializedName(SERIALIZED_NAME_POWER_LAYOUT)
    private Direction powerLayout;

    public static final String SERIALIZED_NAME_POWER_POSITION = "power_position";

    @SerializedName(SERIALIZED_NAME_POWER_POSITION)
    private PowerPosition powerPosition;

    public static final String SERIALIZED_NAME_POWERS = "powers";

    @SerializedName(SERIALIZED_NAME_POWERS)
    private List<NestedBrickPower> powers = null;

    public static final String SERIALIZED_NAME_RACK_TOPO = "rack_topo";

    @SerializedName(SERIALIZED_NAME_RACK_TOPO)
    private NestedRackTopo rackTopo;

    public static final String SERIALIZED_NAME_TAG_POSITION_IN_BRICK = "tag_position_in_brick";

    @SerializedName(SERIALIZED_NAME_TAG_POSITION_IN_BRICK)
    private List<NestedTagPosition> tagPositionInBrick = null;

    public BrickTopo() {}

    public BrickTopo capacity(NestedCapacity capacity) {

        this.capacity = capacity;
        return this;
    }

    /**
     * Get capacity
     *
     * @return capacity
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public NestedCapacity getCapacity() {
        return capacity;
    }

    public void setCapacity(NestedCapacity capacity) {
        this.capacity = capacity;
    }

    public BrickTopo capacity_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CAPACITY);
        return this;
    }

    public BrickTopo capacity_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CAPACITY);
        return this;
    }

    public void setCapacity_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CAPACITY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CAPACITY);
        }
    }

    public boolean getCapacity_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CAPACITY);
    }

    public BrickTopo cluster(NestedCluster cluster) {

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

    public BrickTopo cluster_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER);
        return this;
    }

    public BrickTopo cluster_ExplictlyNonNull() {
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

    public BrickTopo clusterTopo(NestedClusterTopo clusterTopo) {

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

    public BrickTopo clusterTopo_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER_TOPO);
        return this;
    }

    public BrickTopo clusterTopo_ExplictlyNonNull() {
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

    public BrickTopo diskLayout(NestedBrickDiskLayout diskLayout) {

        this.diskLayout = diskLayout;
        return this;
    }

    /**
     * Get diskLayout
     *
     * @return diskLayout
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NestedBrickDiskLayout getDiskLayout() {
        return diskLayout;
    }

    public void setDiskLayout(NestedBrickDiskLayout diskLayout) {
        this.diskLayout = diskLayout;
    }

    public BrickTopo diskLayout_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISK_LAYOUT);
        return this;
    }

    public BrickTopo diskLayout_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DISK_LAYOUT);
        return this;
    }

    public void setDiskLayout_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DISK_LAYOUT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DISK_LAYOUT);
        }
    }

    public boolean getDiskLayout_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DISK_LAYOUT);
    }

    public BrickTopo height(Integer height) {

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

    public BrickTopo height_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HEIGHT);
        return this;
    }

    public BrickTopo height_ExplictlyNonNull() {
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

    public BrickTopo id(String id) {

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

    public BrickTopo id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public BrickTopo id_ExplictlyNonNull() {
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

    public BrickTopo localId(String localId) {

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

    public BrickTopo localId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID);
        return this;
    }

    public BrickTopo localId_ExplictlyNonNull() {
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

    public BrickTopo model(String model) {

        this.model = model;
        return this;
    }

    /**
     * Get model
     *
     * @return model
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public BrickTopo model_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MODEL);
        return this;
    }

    public BrickTopo model_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MODEL);
        return this;
    }

    public void setModel_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MODEL);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MODEL);
        }
    }

    public boolean getModel_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MODEL);
    }

    public BrickTopo name(String name) {

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

    public BrickTopo name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public BrickTopo name_ExplictlyNonNull() {
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

    public BrickTopo nodeTopoes(List<NestedNodeTopo> nodeTopoes) {

        this.nodeTopoes = nodeTopoes;
        return this;
    }

    public BrickTopo addNodeTopoesItem(NestedNodeTopo nodeTopoesItem) {
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

    public BrickTopo nodeTopoes_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NODE_TOPOES);
        return this;
    }

    public BrickTopo nodeTopoes_ExplictlyNonNull() {
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

    public BrickTopo position(Integer position) {

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
    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public BrickTopo position_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_POSITION);
        return this;
    }

    public BrickTopo position_ExplictlyNonNull() {
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

    public BrickTopo powerLayout(Direction powerLayout) {

        this.powerLayout = powerLayout;
        return this;
    }

    /**
     * Get powerLayout
     *
     * @return powerLayout
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Direction getPowerLayout() {
        return powerLayout;
    }

    public void setPowerLayout(Direction powerLayout) {
        this.powerLayout = powerLayout;
    }

    public BrickTopo powerLayout_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_POWER_LAYOUT);
        return this;
    }

    public BrickTopo powerLayout_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_POWER_LAYOUT);
        return this;
    }

    public void setPowerLayout_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_POWER_LAYOUT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_POWER_LAYOUT);
        }
    }

    public boolean getPowerLayout_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_POWER_LAYOUT);
    }

    public BrickTopo powerPosition(PowerPosition powerPosition) {

        this.powerPosition = powerPosition;
        return this;
    }

    /**
     * Get powerPosition
     *
     * @return powerPosition
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public PowerPosition getPowerPosition() {
        return powerPosition;
    }

    public void setPowerPosition(PowerPosition powerPosition) {
        this.powerPosition = powerPosition;
    }

    public BrickTopo powerPosition_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_POWER_POSITION);
        return this;
    }

    public BrickTopo powerPosition_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_POWER_POSITION);
        return this;
    }

    public void setPowerPosition_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_POWER_POSITION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_POWER_POSITION);
        }
    }

    public boolean getPowerPosition_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_POWER_POSITION);
    }

    public BrickTopo powers(List<NestedBrickPower> powers) {

        this.powers = powers;
        return this;
    }

    public BrickTopo addPowersItem(NestedBrickPower powersItem) {
        if (this.powers == null) {
            this.powers = new ArrayList<NestedBrickPower>();
        }
        this.powers.add(powersItem);
        return this;
    }

    /**
     * Get powers
     *
     * @return powers
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedBrickPower> getPowers() {
        return powers;
    }

    public void setPowers(List<NestedBrickPower> powers) {
        this.powers = powers;
    }

    public BrickTopo powers_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_POWERS);
        return this;
    }

    public BrickTopo powers_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_POWERS);
        return this;
    }

    public void setPowers_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_POWERS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_POWERS);
        }
    }

    public boolean getPowers_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_POWERS);
    }

    public BrickTopo rackTopo(NestedRackTopo rackTopo) {

        this.rackTopo = rackTopo;
        return this;
    }

    /**
     * Get rackTopo
     *
     * @return rackTopo
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NestedRackTopo getRackTopo() {
        return rackTopo;
    }

    public void setRackTopo(NestedRackTopo rackTopo) {
        this.rackTopo = rackTopo;
    }

    public BrickTopo rackTopo_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RACK_TOPO);
        return this;
    }

    public BrickTopo rackTopo_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RACK_TOPO);
        return this;
    }

    public void setRackTopo_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RACK_TOPO);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RACK_TOPO);
        }
    }

    public boolean getRackTopo_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RACK_TOPO);
    }

    public BrickTopo tagPositionInBrick(List<NestedTagPosition> tagPositionInBrick) {

        this.tagPositionInBrick = tagPositionInBrick;
        return this;
    }

    public BrickTopo addTagPositionInBrickItem(NestedTagPosition tagPositionInBrickItem) {
        if (this.tagPositionInBrick == null) {
            this.tagPositionInBrick = new ArrayList<NestedTagPosition>();
        }
        this.tagPositionInBrick.add(tagPositionInBrickItem);
        return this;
    }

    /**
     * Get tagPositionInBrick
     *
     * @return tagPositionInBrick
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedTagPosition> getTagPositionInBrick() {
        return tagPositionInBrick;
    }

    public void setTagPositionInBrick(List<NestedTagPosition> tagPositionInBrick) {
        this.tagPositionInBrick = tagPositionInBrick;
    }

    public BrickTopo tagPositionInBrick_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TAG_POSITION_IN_BRICK);
        return this;
    }

    public BrickTopo tagPositionInBrick_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TAG_POSITION_IN_BRICK);
        return this;
    }

    public void setTagPositionInBrick_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TAG_POSITION_IN_BRICK);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TAG_POSITION_IN_BRICK);
        }
    }

    public boolean getTagPositionInBrick_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TAG_POSITION_IN_BRICK);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BrickTopo brickTopo = (BrickTopo) o;
        return Objects.equals(this.capacity, brickTopo.capacity)
                && Objects.equals(this.cluster, brickTopo.cluster)
                && Objects.equals(this.clusterTopo, brickTopo.clusterTopo)
                && Objects.equals(this.diskLayout, brickTopo.diskLayout)
                && Objects.equals(this.height, brickTopo.height)
                && Objects.equals(this.id, brickTopo.id)
                && Objects.equals(this.localId, brickTopo.localId)
                && Objects.equals(this.model, brickTopo.model)
                && Objects.equals(this.name, brickTopo.name)
                && Objects.equals(this.nodeTopoes, brickTopo.nodeTopoes)
                && Objects.equals(this.position, brickTopo.position)
                && Objects.equals(this.powerLayout, brickTopo.powerLayout)
                && Objects.equals(this.powerPosition, brickTopo.powerPosition)
                && Objects.equals(this.powers, brickTopo.powers)
                && Objects.equals(this.rackTopo, brickTopo.rackTopo)
                && Objects.equals(this.tagPositionInBrick, brickTopo.tagPositionInBrick);
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
                capacity,
                cluster,
                clusterTopo,
                diskLayout,
                height,
                id,
                localId,
                model,
                name,
                nodeTopoes,
                position,
                powerLayout,
                powerPosition,
                powers,
                rackTopo,
                tagPositionInBrick);
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
        sb.append("class BrickTopo {\n");
        sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
        sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
        sb.append("    clusterTopo: ").append(toIndentedString(clusterTopo)).append("\n");
        sb.append("    diskLayout: ").append(toIndentedString(diskLayout)).append("\n");
        sb.append("    height: ").append(toIndentedString(height)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
        sb.append("    model: ").append(toIndentedString(model)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    nodeTopoes: ").append(toIndentedString(nodeTopoes)).append("\n");
        sb.append("    position: ").append(toIndentedString(position)).append("\n");
        sb.append("    powerLayout: ").append(toIndentedString(powerLayout)).append("\n");
        sb.append("    powerPosition: ").append(toIndentedString(powerPosition)).append("\n");
        sb.append("    powers: ").append(toIndentedString(powers)).append("\n");
        sb.append("    rackTopo: ").append(toIndentedString(rackTopo)).append("\n");
        sb.append("    tagPositionInBrick: ")
                .append(toIndentedString(tagPositionInBrick))
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

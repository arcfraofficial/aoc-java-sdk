package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** NodeTopoUpdationParamsData */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class NodeTopoUpdationParamsData
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_CLUSTER_TOPO_ID = "cluster_topo_id";

    @SerializedName(SERIALIZED_NAME_CLUSTER_TOPO_ID)
    private String clusterTopoId;

    public static final String SERIALIZED_NAME_POSITION = "position";

    @SerializedName(SERIALIZED_NAME_POSITION)
    private Position position;

    public static final String SERIALIZED_NAME_BRICK_TOPO_ID = "brick_topo_id";

    @SerializedName(SERIALIZED_NAME_BRICK_TOPO_ID)
    private String brickTopoId;

    public NodeTopoUpdationParamsData() {}

    public NodeTopoUpdationParamsData clusterTopoId(String clusterTopoId) {

        this.clusterTopoId = clusterTopoId;
        return this;
    }

    /**
     * Get clusterTopoId
     *
     * @return clusterTopoId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getClusterTopoId() {
        return clusterTopoId;
    }

    public void setClusterTopoId(String clusterTopoId) {
        this.clusterTopoId = clusterTopoId;
    }

    public NodeTopoUpdationParamsData clusterTopoId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER_TOPO_ID);
        return this;
    }

    public NodeTopoUpdationParamsData clusterTopoId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_TOPO_ID);
        return this;
    }

    public void setClusterTopoId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLUSTER_TOPO_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_TOPO_ID);
        }
    }

    public boolean getClusterTopoId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLUSTER_TOPO_ID);
    }

    public NodeTopoUpdationParamsData position(Position position) {

        this.position = position;
        return this;
    }

    /**
     * Get position
     *
     * @return position
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public NodeTopoUpdationParamsData position_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_POSITION);
        return this;
    }

    public NodeTopoUpdationParamsData position_ExplictlyNonNull() {
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

    public NodeTopoUpdationParamsData brickTopoId(String brickTopoId) {

        this.brickTopoId = brickTopoId;
        return this;
    }

    /**
     * Get brickTopoId
     *
     * @return brickTopoId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBrickTopoId() {
        return brickTopoId;
    }

    public void setBrickTopoId(String brickTopoId) {
        this.brickTopoId = brickTopoId;
    }

    public NodeTopoUpdationParamsData brickTopoId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BRICK_TOPO_ID);
        return this;
    }

    public NodeTopoUpdationParamsData brickTopoId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BRICK_TOPO_ID);
        return this;
    }

    public void setBrickTopoId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BRICK_TOPO_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BRICK_TOPO_ID);
        }
    }

    public boolean getBrickTopoId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BRICK_TOPO_ID);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NodeTopoUpdationParamsData nodeTopoUpdationParamsData = (NodeTopoUpdationParamsData) o;
        return Objects.equals(this.clusterTopoId, nodeTopoUpdationParamsData.clusterTopoId)
                && Objects.equals(this.position, nodeTopoUpdationParamsData.position)
                && Objects.equals(this.brickTopoId, nodeTopoUpdationParamsData.brickTopoId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterTopoId, position, brickTopoId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodeTopoUpdationParamsData {\n");
        sb.append("    clusterTopoId: ").append(toIndentedString(clusterTopoId)).append("\n");
        sb.append("    position: ").append(toIndentedString(position)).append("\n");
        sb.append("    brickTopoId: ").append(toIndentedString(brickTopoId)).append("\n");
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

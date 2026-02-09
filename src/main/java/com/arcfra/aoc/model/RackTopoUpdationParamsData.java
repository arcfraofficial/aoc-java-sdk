package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** RackTopoUpdationParamsData */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class RackTopoUpdationParamsData
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_BRICK_TOPOES = "brick_topoes";

    @SerializedName(SERIALIZED_NAME_BRICK_TOPOES)
    private BrickTopoWhereInput brickTopoes;

    public static final String SERIALIZED_NAME_CLUSTER_ID = "cluster_id";

    @SerializedName(SERIALIZED_NAME_CLUSTER_ID)
    private String clusterId;

    public static final String SERIALIZED_NAME_ZONE_TOPO_ID = "zone_topo_id";

    @SerializedName(SERIALIZED_NAME_ZONE_TOPO_ID)
    private String zoneTopoId;

    public static final String SERIALIZED_NAME_HEIGHT = "height";

    @SerializedName(SERIALIZED_NAME_HEIGHT)
    private Integer height;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public RackTopoUpdationParamsData() {}

    public RackTopoUpdationParamsData brickTopoes(BrickTopoWhereInput brickTopoes) {

        this.brickTopoes = brickTopoes;
        return this;
    }

    /**
     * Get brickTopoes
     *
     * @return brickTopoes
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public BrickTopoWhereInput getBrickTopoes() {
        return brickTopoes;
    }

    public void setBrickTopoes(BrickTopoWhereInput brickTopoes) {
        this.brickTopoes = brickTopoes;
    }

    public RackTopoUpdationParamsData brickTopoes_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BRICK_TOPOES);
        return this;
    }

    public RackTopoUpdationParamsData brickTopoes_ExplictlyNonNull() {
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

    public RackTopoUpdationParamsData clusterId(String clusterId) {

        this.clusterId = clusterId;
        return this;
    }

    /**
     * Get clusterId
     *
     * @return clusterId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public RackTopoUpdationParamsData clusterId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER_ID);
        return this;
    }

    public RackTopoUpdationParamsData clusterId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_ID);
        return this;
    }

    public void setClusterId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLUSTER_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_ID);
        }
    }

    public boolean getClusterId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLUSTER_ID);
    }

    public RackTopoUpdationParamsData zoneTopoId(String zoneTopoId) {

        this.zoneTopoId = zoneTopoId;
        return this;
    }

    /**
     * Get zoneTopoId
     *
     * @return zoneTopoId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getZoneTopoId() {
        return zoneTopoId;
    }

    public void setZoneTopoId(String zoneTopoId) {
        this.zoneTopoId = zoneTopoId;
    }

    public RackTopoUpdationParamsData zoneTopoId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ZONE_TOPO_ID);
        return this;
    }

    public RackTopoUpdationParamsData zoneTopoId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ZONE_TOPO_ID);
        return this;
    }

    public void setZoneTopoId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ZONE_TOPO_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ZONE_TOPO_ID);
        }
    }

    public boolean getZoneTopoId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ZONE_TOPO_ID);
    }

    public RackTopoUpdationParamsData height(Integer height) {

        this.height = height;
        return this;
    }

    /**
     * Get height
     *
     * @return height
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public RackTopoUpdationParamsData height_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HEIGHT);
        return this;
    }

    public RackTopoUpdationParamsData height_ExplictlyNonNull() {
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

    public RackTopoUpdationParamsData name(String name) {

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

    public RackTopoUpdationParamsData name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public RackTopoUpdationParamsData name_ExplictlyNonNull() {
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
        RackTopoUpdationParamsData rackTopoUpdationParamsData = (RackTopoUpdationParamsData) o;
        return Objects.equals(this.brickTopoes, rackTopoUpdationParamsData.brickTopoes)
                && Objects.equals(this.clusterId, rackTopoUpdationParamsData.clusterId)
                && Objects.equals(this.zoneTopoId, rackTopoUpdationParamsData.zoneTopoId)
                && Objects.equals(this.height, rackTopoUpdationParamsData.height)
                && Objects.equals(this.name, rackTopoUpdationParamsData.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brickTopoes, clusterId, zoneTopoId, height, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RackTopoUpdationParamsData {\n");
        sb.append("    brickTopoes: ").append(toIndentedString(brickTopoes)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    zoneTopoId: ").append(toIndentedString(zoneTopoId)).append("\n");
        sb.append("    height: ").append(toIndentedString(height)).append("\n");
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

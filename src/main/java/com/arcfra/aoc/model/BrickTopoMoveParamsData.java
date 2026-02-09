package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** BrickTopoMoveParamsData */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class BrickTopoMoveParamsData
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_RACK_TOPO_ID = "rack_topo_id";

    @SerializedName(SERIALIZED_NAME_RACK_TOPO_ID)
    private String rackTopoId;

    public static final String SERIALIZED_NAME_POSITION = "position";

    @SerializedName(SERIALIZED_NAME_POSITION)
    private Integer position;

    public BrickTopoMoveParamsData() {}

    public BrickTopoMoveParamsData rackTopoId(String rackTopoId) {

        this.rackTopoId = rackTopoId;
        return this;
    }

    /**
     * Get rackTopoId
     *
     * @return rackTopoId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getRackTopoId() {
        return rackTopoId;
    }

    public void setRackTopoId(String rackTopoId) {
        this.rackTopoId = rackTopoId;
    }

    public BrickTopoMoveParamsData rackTopoId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RACK_TOPO_ID);
        return this;
    }

    public BrickTopoMoveParamsData rackTopoId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RACK_TOPO_ID);
        return this;
    }

    public void setRackTopoId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RACK_TOPO_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RACK_TOPO_ID);
        }
    }

    public boolean getRackTopoId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RACK_TOPO_ID);
    }

    public BrickTopoMoveParamsData position(Integer position) {

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

    public BrickTopoMoveParamsData position_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_POSITION);
        return this;
    }

    public BrickTopoMoveParamsData position_ExplictlyNonNull() {
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
        BrickTopoMoveParamsData brickTopoMoveParamsData = (BrickTopoMoveParamsData) o;
        return Objects.equals(this.rackTopoId, brickTopoMoveParamsData.rackTopoId)
                && Objects.equals(this.position, brickTopoMoveParamsData.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rackTopoId, position);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BrickTopoMoveParamsData {\n");
        sb.append("    rackTopoId: ").append(toIndentedString(rackTopoId)).append("\n");
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

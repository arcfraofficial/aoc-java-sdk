package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** BrickTopoUpdationParamsData */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class BrickTopoUpdationParamsData
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_TAG_POSITION_IN_BRICK = "tag_position_in_brick";

    @SerializedName(SERIALIZED_NAME_TAG_POSITION_IN_BRICK)
    private List<NestedTagPosition> tagPositionInBrick = null;

    public static final String SERIALIZED_NAME_NODE_TOPOES = "node_topoes";

    @SerializedName(SERIALIZED_NAME_NODE_TOPOES)
    private NodeTopoWhereInput nodeTopoes;

    public static final String SERIALIZED_NAME_CAPACITY = "capacity";

    @SerializedName(SERIALIZED_NAME_CAPACITY)
    private NestedCapacity capacity;

    public static final String SERIALIZED_NAME_HEIGHT = "height";

    @SerializedName(SERIALIZED_NAME_HEIGHT)
    private Integer height;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_POSITION = "position";

    @SerializedName(SERIALIZED_NAME_POSITION)
    private Integer position;

    public BrickTopoUpdationParamsData() {}

    public BrickTopoUpdationParamsData tagPositionInBrick(
            List<NestedTagPosition> tagPositionInBrick) {

        this.tagPositionInBrick = tagPositionInBrick;
        return this;
    }

    public BrickTopoUpdationParamsData addTagPositionInBrickItem(
            NestedTagPosition tagPositionInBrickItem) {
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

    public BrickTopoUpdationParamsData tagPositionInBrick_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TAG_POSITION_IN_BRICK);
        return this;
    }

    public BrickTopoUpdationParamsData tagPositionInBrick_ExplictlyNonNull() {
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

    public BrickTopoUpdationParamsData nodeTopoes(NodeTopoWhereInput nodeTopoes) {

        this.nodeTopoes = nodeTopoes;
        return this;
    }

    /**
     * Get nodeTopoes
     *
     * @return nodeTopoes
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NodeTopoWhereInput getNodeTopoes() {
        return nodeTopoes;
    }

    public void setNodeTopoes(NodeTopoWhereInput nodeTopoes) {
        this.nodeTopoes = nodeTopoes;
    }

    public BrickTopoUpdationParamsData nodeTopoes_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NODE_TOPOES);
        return this;
    }

    public BrickTopoUpdationParamsData nodeTopoes_ExplictlyNonNull() {
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

    public BrickTopoUpdationParamsData capacity(NestedCapacity capacity) {

        this.capacity = capacity;
        return this;
    }

    /**
     * Get capacity
     *
     * @return capacity
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NestedCapacity getCapacity() {
        return capacity;
    }

    public void setCapacity(NestedCapacity capacity) {
        this.capacity = capacity;
    }

    public BrickTopoUpdationParamsData capacity_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CAPACITY);
        return this;
    }

    public BrickTopoUpdationParamsData capacity_ExplictlyNonNull() {
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

    public BrickTopoUpdationParamsData height(Integer height) {

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

    public BrickTopoUpdationParamsData height_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HEIGHT);
        return this;
    }

    public BrickTopoUpdationParamsData height_ExplictlyNonNull() {
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

    public BrickTopoUpdationParamsData name(String name) {

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

    public BrickTopoUpdationParamsData name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public BrickTopoUpdationParamsData name_ExplictlyNonNull() {
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

    public BrickTopoUpdationParamsData position(Integer position) {

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
    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public BrickTopoUpdationParamsData position_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_POSITION);
        return this;
    }

    public BrickTopoUpdationParamsData position_ExplictlyNonNull() {
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
        BrickTopoUpdationParamsData brickTopoUpdationParamsData = (BrickTopoUpdationParamsData) o;
        return Objects.equals(
                        this.tagPositionInBrick, brickTopoUpdationParamsData.tagPositionInBrick)
                && Objects.equals(this.nodeTopoes, brickTopoUpdationParamsData.nodeTopoes)
                && Objects.equals(this.capacity, brickTopoUpdationParamsData.capacity)
                && Objects.equals(this.height, brickTopoUpdationParamsData.height)
                && Objects.equals(this.name, brickTopoUpdationParamsData.name)
                && Objects.equals(this.position, brickTopoUpdationParamsData.position);
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
        return Objects.hash(tagPositionInBrick, nodeTopoes, capacity, height, name, position);
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
        sb.append("class BrickTopoUpdationParamsData {\n");
        sb.append("    tagPositionInBrick: ")
                .append(toIndentedString(tagPositionInBrick))
                .append("\n");
        sb.append("    nodeTopoes: ").append(toIndentedString(nodeTopoes)).append("\n");
        sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
        sb.append("    height: ").append(toIndentedString(height)).append("\n");
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

package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** NestedBrickDiskLayout */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class NestedBrickDiskLayout
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_COLUMN = "column";

    @SerializedName(SERIALIZED_NAME_COLUMN)
    private Integer column;

    public static final String SERIALIZED_NAME_DIRECTION = "direction";

    @SerializedName(SERIALIZED_NAME_DIRECTION)
    private Direction direction;

    public static final String SERIALIZED_NAME_PHASE = "phase";

    @SerializedName(SERIALIZED_NAME_PHASE)
    private BrickPhaseEnum phase;

    public static final String SERIALIZED_NAME_ROW = "row";

    @SerializedName(SERIALIZED_NAME_ROW)
    private Integer row;

    public NestedBrickDiskLayout() {}

    public NestedBrickDiskLayout column(Integer column) {

        this.column = column;
        return this;
    }

    /**
     * Get column
     *
     * @return column
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Integer getColumn() {
        return column;
    }

    public void setColumn(Integer column) {
        this.column = column;
    }

    public NestedBrickDiskLayout column_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_COLUMN);
        return this;
    }

    public NestedBrickDiskLayout column_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_COLUMN);
        return this;
    }

    public void setColumn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_COLUMN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_COLUMN);
        }
    }

    public boolean getColumn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_COLUMN);
    }

    public NestedBrickDiskLayout direction(Direction direction) {

        this.direction = direction;
        return this;
    }

    /**
     * Get direction
     *
     * @return direction
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public NestedBrickDiskLayout direction_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DIRECTION);
        return this;
    }

    public NestedBrickDiskLayout direction_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DIRECTION);
        return this;
    }

    public void setDirection_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DIRECTION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DIRECTION);
        }
    }

    public boolean getDirection_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DIRECTION);
    }

    public NestedBrickDiskLayout phase(BrickPhaseEnum phase) {

        this.phase = phase;
        return this;
    }

    /**
     * Get phase
     *
     * @return phase
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public BrickPhaseEnum getPhase() {
        return phase;
    }

    public void setPhase(BrickPhaseEnum phase) {
        this.phase = phase;
    }

    public NestedBrickDiskLayout phase_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PHASE);
        return this;
    }

    public NestedBrickDiskLayout phase_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PHASE);
        return this;
    }

    public void setPhase_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PHASE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PHASE);
        }
    }

    public boolean getPhase_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PHASE);
    }

    public NestedBrickDiskLayout row(Integer row) {

        this.row = row;
        return this;
    }

    /**
     * Get row
     *
     * @return row
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Integer getRow() {
        return row;
    }

    public void setRow(Integer row) {
        this.row = row;
    }

    public NestedBrickDiskLayout row_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ROW);
        return this;
    }

    public NestedBrickDiskLayout row_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ROW);
        return this;
    }

    public void setRow_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ROW);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ROW);
        }
    }

    public boolean getRow_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ROW);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NestedBrickDiskLayout nestedBrickDiskLayout = (NestedBrickDiskLayout) o;
        return Objects.equals(this.column, nestedBrickDiskLayout.column)
                && Objects.equals(this.direction, nestedBrickDiskLayout.direction)
                && Objects.equals(this.phase, nestedBrickDiskLayout.phase)
                && Objects.equals(this.row, nestedBrickDiskLayout.row);
    }

    @Override
    public int hashCode() {
        return Objects.hash(column, direction, phase, row);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NestedBrickDiskLayout {\n");
        sb.append("    column: ").append(toIndentedString(column)).append("\n");
        sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
        sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
        sb.append("    row: ").append(toIndentedString(row)).append("\n");
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

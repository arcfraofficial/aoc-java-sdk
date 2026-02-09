package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** NestedTagPosition */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class NestedTagPosition extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_COLUMN = "column";

    @SerializedName(SERIALIZED_NAME_COLUMN)
    private Integer column;

    public static final String SERIALIZED_NAME_ROW = "row";

    @SerializedName(SERIALIZED_NAME_ROW)
    private Integer row;

    public static final String SERIALIZED_NAME_TAG = "tag";

    @SerializedName(SERIALIZED_NAME_TAG)
    private String tag;

    public NestedTagPosition() {}

    public NestedTagPosition column(Integer column) {

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

    public NestedTagPosition column_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_COLUMN);
        return this;
    }

    public NestedTagPosition column_ExplictlyNonNull() {
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

    public NestedTagPosition row(Integer row) {

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

    public NestedTagPosition row_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ROW);
        return this;
    }

    public NestedTagPosition row_ExplictlyNonNull() {
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

    public NestedTagPosition tag(String tag) {

        this.tag = tag;
        return this;
    }

    /**
     * Get tag
     *
     * @return tag
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public NestedTagPosition tag_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TAG);
        return this;
    }

    public NestedTagPosition tag_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TAG);
        return this;
    }

    public void setTag_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TAG);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TAG);
        }
    }

    public boolean getTag_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TAG);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NestedTagPosition nestedTagPosition = (NestedTagPosition) o;
        return Objects.equals(this.column, nestedTagPosition.column)
                && Objects.equals(this.row, nestedTagPosition.row)
                && Objects.equals(this.tag, nestedTagPosition.tag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(column, row, tag);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NestedTagPosition {\n");
        sb.append("    column: ").append(toIndentedString(column)).append("\n");
        sb.append("    row: ").append(toIndentedString(row)).append("\n");
        sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
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

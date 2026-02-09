package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Arrays;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** NestedPosition */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class NestedPosition extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_COLUMN = "column";

    @SerializedName(SERIALIZED_NAME_COLUMN)
    private Integer column;

    public static final String SERIALIZED_NAME_ROW = "row";

    @SerializedName(SERIALIZED_NAME_ROW)
    private Integer row;

    public NestedPosition() {}

    public NestedPosition column(Integer column) {

        this.column = column;
        return this;
    }

    /**
     * Get column
     *
     * @return column
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getColumn() {
        return column;
    }

    public void setColumn(Integer column) {
        this.column = column;
    }

    public NestedPosition column_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_COLUMN);
        return this;
    }

    public NestedPosition column_ExplictlyNonNull() {
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

    public NestedPosition row(Integer row) {

        this.row = row;
        return this;
    }

    /**
     * Get row
     *
     * @return row
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getRow() {
        return row;
    }

    public void setRow(Integer row) {
        this.row = row;
    }

    public NestedPosition row_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ROW);
        return this;
    }

    public NestedPosition row_ExplictlyNonNull() {
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
        NestedPosition nestedPosition = (NestedPosition) o;
        return Objects.equals(this.column, nestedPosition.column)
                && Objects.equals(this.row, nestedPosition.row);
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
        return Objects.hash(column, row);
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
        sb.append("class NestedPosition {\n");
        sb.append("    column: ").append(toIndentedString(column)).append("\n");
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

package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** Position */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class Position extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_ROW = "row";

    @SerializedName(SERIALIZED_NAME_ROW)
    private Integer row;

    public static final String SERIALIZED_NAME_COLUMN = "column";

    @SerializedName(SERIALIZED_NAME_COLUMN)
    private Integer column;

    /** Gets or Sets typename */
    @JsonAdapter(TypenameEnum.Adapter.class)
    public enum TypenameEnum {
        POSITION("position");

        private String value;

        TypenameEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static TypenameEnum fromValue(String value) {
            for (TypenameEnum b : TypenameEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<TypenameEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final TypenameEnum enumeration)
                    throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public TypenameEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return TypenameEnum.fromValue(value);
            }
        }
    }

    public static final String SERIALIZED_NAME_TYPENAME = "__typename";

    @SerializedName(SERIALIZED_NAME_TYPENAME)
    private TypenameEnum typename;

    public Position() {}

    public Position row(Integer row) {

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

    public Position row_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ROW);
        return this;
    }

    public Position row_ExplictlyNonNull() {
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

    public Position column(Integer column) {

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

    public Position column_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_COLUMN);
        return this;
    }

    public Position column_ExplictlyNonNull() {
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

    public Position typename(TypenameEnum typename) {

        this.typename = typename;
        return this;
    }

    /**
     * Get typename
     *
     * @return typename
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public TypenameEnum getTypename() {
        return typename;
    }

    public void setTypename(TypenameEnum typename) {
        this.typename = typename;
    }

    public Position typename_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPENAME);
        return this;
    }

    public Position typename_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TYPENAME);
        return this;
    }

    public void setTypename_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TYPENAME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TYPENAME);
        }
    }

    public boolean getTypename_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TYPENAME);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Position position = (Position) o;
        return Objects.equals(this.row, position.row)
                && Objects.equals(this.column, position.column)
                && Objects.equals(this.typename, position.typename);
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
        return Objects.hash(row, column, typename);
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
        sb.append("class Position {\n");
        sb.append("    row: ").append(toIndentedString(row)).append("\n");
        sb.append("    column: ").append(toIndentedString(column)).append("\n");
        sb.append("    typename: ").append(toIndentedString(typename)).append("\n");
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

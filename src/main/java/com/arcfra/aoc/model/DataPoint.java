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

/** DataPoint */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class DataPoint extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_V = "v";

    @SerializedName(SERIALIZED_NAME_V)
    private Double v;

    public static final String SERIALIZED_NAME_T = "t";

    @SerializedName(SERIALIZED_NAME_T)
    private Long t;

    /** Gets or Sets typename */
    @JsonAdapter(TypenameEnum.Adapter.class)
    public enum TypenameEnum {
        DATAPOINT("DataPoint");

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

    public DataPoint() {}

    public DataPoint v(Double v) {

        this.v = v;
        return this;
    }

    /**
     * Get v
     *
     * @return v
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getV() {
        return v;
    }

    public void setV(Double v) {
        this.v = v;
    }

    public DataPoint v_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_V);
        return this;
    }

    public DataPoint v_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_V);
        return this;
    }

    public void setV_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_V);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_V);
        }
    }

    public boolean getV_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_V);
    }

    public DataPoint t(Long t) {

        this.t = t;
        return this;
    }

    /**
     * Get t
     *
     * @return t
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Long getT() {
        return t;
    }

    public void setT(Long t) {
        this.t = t;
    }

    public DataPoint t_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_T);
        return this;
    }

    public DataPoint t_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_T);
        return this;
    }

    public void setT_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_T);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_T);
        }
    }

    public boolean getT_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_T);
    }

    public DataPoint typename(TypenameEnum typename) {

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

    public DataPoint typename_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPENAME);
        return this;
    }

    public DataPoint typename_ExplictlyNonNull() {
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
        DataPoint dataPoint = (DataPoint) o;
        return Objects.equals(this.v, dataPoint.v)
                && Objects.equals(this.t, dataPoint.t)
                && Objects.equals(this.typename, dataPoint.typename);
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
        return Objects.hash(v, t, typename);
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
        sb.append("class DataPoint {\n");
        sb.append("    v: ").append(toIndentedString(v)).append("\n");
        sb.append("    t: ").append(toIndentedString(t)).append("\n");
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

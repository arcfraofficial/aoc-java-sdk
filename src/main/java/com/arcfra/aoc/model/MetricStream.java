package com.arcfra.aoc.model;


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** MetricStream */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class MetricStream extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_POINTS = "points";

    @SerializedName(SERIALIZED_NAME_POINTS)
    private List<DataPoint> points = null;

    public static final String SERIALIZED_NAME_LABELS = "labels";

    @SerializedName(SERIALIZED_NAME_LABELS)
    private MetricLabel labels;

    /** Gets or Sets typename */
    @JsonAdapter(TypenameEnum.Adapter.class)
    public enum TypenameEnum {
        METRICSTREAM("MetricStream");

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

    public MetricStream() {}

    public MetricStream points(List<DataPoint> points) {

        this.points = points;
        return this;
    }

    public MetricStream addPointsItem(DataPoint pointsItem) {
        if (this.points == null) {
            this.points = new ArrayList<DataPoint>();
        }
        this.points.add(pointsItem);
        return this;
    }

    /**
     * Get points
     *
     * @return points
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<DataPoint> getPoints() {
        return points;
    }

    public void setPoints(List<DataPoint> points) {
        this.points = points;
    }

    public MetricStream points_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_POINTS);
        return this;
    }

    public MetricStream points_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_POINTS);
        return this;
    }

    public void setPoints_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_POINTS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_POINTS);
        }
    }

    public boolean getPoints_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_POINTS);
    }

    public MetricStream labels(MetricLabel labels) {

        this.labels = labels;
        return this;
    }

    /**
     * Get labels
     *
     * @return labels
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public MetricLabel getLabels() {
        return labels;
    }

    public void setLabels(MetricLabel labels) {
        this.labels = labels;
    }

    public MetricStream labels_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LABELS);
        return this;
    }

    public MetricStream labels_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LABELS);
        return this;
    }

    public void setLabels_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LABELS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LABELS);
        }
    }

    public boolean getLabels_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LABELS);
    }

    public MetricStream typename(TypenameEnum typename) {

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

    public MetricStream typename_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPENAME);
        return this;
    }

    public MetricStream typename_ExplictlyNonNull() {
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
        MetricStream metricStream = (MetricStream) o;
        return Objects.equals(this.points, metricStream.points)
                && Objects.equals(this.labels, metricStream.labels)
                && Objects.equals(this.typename, metricStream.typename);
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
        return Objects.hash(points, labels, typename);
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
        sb.append("class MetricStream {\n");
        sb.append("    points: ").append(toIndentedString(points)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
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

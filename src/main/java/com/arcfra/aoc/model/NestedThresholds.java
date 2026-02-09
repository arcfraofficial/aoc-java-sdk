package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Arrays;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** NestedThresholds */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class NestedThresholds extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_QUANTILE = "quantile";

    @SerializedName(SERIALIZED_NAME_QUANTILE)
    private Integer quantile;

    public static final String SERIALIZED_NAME_SEVERITY = "severity";

    @SerializedName(SERIALIZED_NAME_SEVERITY)
    private SeverityEnum severity;

    public static final String SERIALIZED_NAME_VALUE = "value";

    @SerializedName(SERIALIZED_NAME_VALUE)
    private Double value;

    public NestedThresholds() {}

    public NestedThresholds quantile(Integer quantile) {

        this.quantile = quantile;
        return this;
    }

    /**
     * Get quantile
     *
     * @return quantile
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getQuantile() {
        return quantile;
    }

    public void setQuantile(Integer quantile) {
        this.quantile = quantile;
    }

    public NestedThresholds quantile_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_QUANTILE);
        return this;
    }

    public NestedThresholds quantile_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_QUANTILE);
        return this;
    }

    public void setQuantile_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_QUANTILE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_QUANTILE);
        }
    }

    public boolean getQuantile_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_QUANTILE);
    }

    public NestedThresholds severity(SeverityEnum severity) {

        this.severity = severity;
        return this;
    }

    /**
     * Get severity
     *
     * @return severity
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public SeverityEnum getSeverity() {
        return severity;
    }

    public void setSeverity(SeverityEnum severity) {
        this.severity = severity;
    }

    public NestedThresholds severity_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SEVERITY);
        return this;
    }

    public NestedThresholds severity_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SEVERITY);
        return this;
    }

    public void setSeverity_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SEVERITY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SEVERITY);
        }
    }

    public boolean getSeverity_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SEVERITY);
    }

    public NestedThresholds value(Double value) {

        this.value = value;
        return this;
    }

    /**
     * Get value
     *
     * @return value
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public NestedThresholds value_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VALUE);
        return this;
    }

    public NestedThresholds value_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VALUE);
        return this;
    }

    public void setValue_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VALUE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VALUE);
        }
    }

    public boolean getValue_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VALUE);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NestedThresholds nestedThresholds = (NestedThresholds) o;
        return Objects.equals(this.quantile, nestedThresholds.quantile)
                && Objects.equals(this.severity, nestedThresholds.severity)
                && Objects.equals(this.value, nestedThresholds.value);
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
        return Objects.hash(quantile, severity, value);
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
        sb.append("class NestedThresholds {\n");
        sb.append("    quantile: ").append(toIndentedString(quantile)).append("\n");
        sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

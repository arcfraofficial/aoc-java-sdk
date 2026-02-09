package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** AlertRuleThresholds */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class AlertRuleThresholds
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_VALUE = "value";

    @SerializedName(SERIALIZED_NAME_VALUE)
    private Integer value;

    public static final String SERIALIZED_NAME_SEVERITY = "severity";

    @SerializedName(SERIALIZED_NAME_SEVERITY)
    private SeverityEnum severity;

    public AlertRuleThresholds() {}

    public AlertRuleThresholds value(Integer value) {

        this.value = value;
        return this;
    }

    /**
     * Get value
     *
     * @return value
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public AlertRuleThresholds value_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VALUE);
        return this;
    }

    public AlertRuleThresholds value_ExplictlyNonNull() {
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

    public AlertRuleThresholds severity(SeverityEnum severity) {

        this.severity = severity;
        return this;
    }

    /**
     * Get severity
     *
     * @return severity
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public SeverityEnum getSeverity() {
        return severity;
    }

    public void setSeverity(SeverityEnum severity) {
        this.severity = severity;
    }

    public AlertRuleThresholds severity_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SEVERITY);
        return this;
    }

    public AlertRuleThresholds severity_ExplictlyNonNull() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AlertRuleThresholds alertRuleThresholds = (AlertRuleThresholds) o;
        return Objects.equals(this.value, alertRuleThresholds.value)
                && Objects.equals(this.severity, alertRuleThresholds.severity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, severity);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AlertRuleThresholds {\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
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

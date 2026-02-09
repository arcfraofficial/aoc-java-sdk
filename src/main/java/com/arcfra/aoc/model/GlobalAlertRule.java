package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** GlobalAlertRule */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class GlobalAlertRule extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_ALERT_RULES = "alert_rules";

    @SerializedName(SERIALIZED_NAME_ALERT_RULES)
    private List<NestedAlertRule> alertRules = null;

    public static final String SERIALIZED_NAME_BOOLEAN = "boolean";

    @SerializedName(SERIALIZED_NAME_BOOLEAN)
    private Boolean _boolean;

    public static final String SERIALIZED_NAME_CAUSE = "cause";

    @SerializedName(SERIALIZED_NAME_CAUSE)
    private String cause;

    public static final String SERIALIZED_NAME_DEFAULT_THRESHOLDS = "default_thresholds";

    @SerializedName(SERIALIZED_NAME_DEFAULT_THRESHOLDS)
    private List<NestedThresholds> defaultThresholds = new ArrayList<NestedThresholds>();

    public static final String SERIALIZED_NAME_DISABLED = "disabled";

    @SerializedName(SERIALIZED_NAME_DISABLED)
    private Boolean disabled;

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

    public static final String SERIALIZED_NAME_IMPACT = "impact";

    @SerializedName(SERIALIZED_NAME_IMPACT)
    private String impact;

    public static final String SERIALIZED_NAME_MESSAGE = "message";

    @SerializedName(SERIALIZED_NAME_MESSAGE)
    private String message;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_OBJECT = "object";

    @SerializedName(SERIALIZED_NAME_OBJECT)
    private AlertRuleObject _object;

    public static final String SERIALIZED_NAME_OPERATOR = "operator";

    @SerializedName(SERIALIZED_NAME_OPERATOR)
    private String operator;

    public static final String SERIALIZED_NAME_SOLUTION = "solution";

    @SerializedName(SERIALIZED_NAME_SOLUTION)
    private String solution;

    public static final String SERIALIZED_NAME_THRESHOLDS = "thresholds";

    @SerializedName(SERIALIZED_NAME_THRESHOLDS)
    private List<NestedThresholds> thresholds = new ArrayList<NestedThresholds>();

    public static final String SERIALIZED_NAME_UNIT = "unit";

    @SerializedName(SERIALIZED_NAME_UNIT)
    private AlertRuleUnit unit;

    public GlobalAlertRule() {}

    public GlobalAlertRule alertRules(List<NestedAlertRule> alertRules) {

        this.alertRules = alertRules;
        return this;
    }

    public GlobalAlertRule addAlertRulesItem(NestedAlertRule alertRulesItem) {
        if (this.alertRules == null) {
            this.alertRules = new ArrayList<NestedAlertRule>();
        }
        this.alertRules.add(alertRulesItem);
        return this;
    }

    /**
     * Get alertRules
     *
     * @return alertRules
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedAlertRule> getAlertRules() {
        return alertRules;
    }

    public void setAlertRules(List<NestedAlertRule> alertRules) {
        this.alertRules = alertRules;
    }

    public GlobalAlertRule alertRules_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ALERT_RULES);
        return this;
    }

    public GlobalAlertRule alertRules_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ALERT_RULES);
        return this;
    }

    public void setAlertRules_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ALERT_RULES);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ALERT_RULES);
        }
    }

    public boolean getAlertRules_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ALERT_RULES);
    }

    public GlobalAlertRule _boolean(Boolean _boolean) {

        this._boolean = _boolean;
        return this;
    }

    /**
     * Get _boolean
     *
     * @return _boolean
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Boolean getBoolean() {
        return _boolean;
    }

    public void setBoolean(Boolean _boolean) {
        this._boolean = _boolean;
    }

    public GlobalAlertRule _boolean_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BOOLEAN);
        return this;
    }

    public GlobalAlertRule _boolean_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BOOLEAN);
        return this;
    }

    public void setBoolean_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BOOLEAN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BOOLEAN);
        }
    }

    public boolean getBoolean_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BOOLEAN);
    }

    public GlobalAlertRule cause(String cause) {

        this.cause = cause;
        return this;
    }

    /**
     * Get cause
     *
     * @return cause
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }

    public GlobalAlertRule cause_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CAUSE);
        return this;
    }

    public GlobalAlertRule cause_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CAUSE);
        return this;
    }

    public void setCause_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CAUSE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CAUSE);
        }
    }

    public boolean getCause_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CAUSE);
    }

    public GlobalAlertRule defaultThresholds(List<NestedThresholds> defaultThresholds) {

        this.defaultThresholds = defaultThresholds;
        return this;
    }

    public GlobalAlertRule addDefaultThresholdsItem(NestedThresholds defaultThresholdsItem) {
        this.defaultThresholds.add(defaultThresholdsItem);
        return this;
    }

    /**
     * Get defaultThresholds
     *
     * @return defaultThresholds
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public List<NestedThresholds> getDefaultThresholds() {
        return defaultThresholds;
    }

    public void setDefaultThresholds(List<NestedThresholds> defaultThresholds) {
        this.defaultThresholds = defaultThresholds;
    }

    public GlobalAlertRule defaultThresholds_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEFAULT_THRESHOLDS);
        return this;
    }

    public GlobalAlertRule defaultThresholds_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_THRESHOLDS);
        return this;
    }

    public void setDefaultThresholds_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEFAULT_THRESHOLDS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_THRESHOLDS);
        }
    }

    public boolean getDefaultThresholds_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEFAULT_THRESHOLDS);
    }

    public GlobalAlertRule disabled(Boolean disabled) {

        this.disabled = disabled;
        return this;
    }

    /**
     * Get disabled
     *
     * @return disabled
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Boolean getDisabled() {
        return disabled;
    }

    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    public GlobalAlertRule disabled_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISABLED);
        return this;
    }

    public GlobalAlertRule disabled_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DISABLED);
        return this;
    }

    public void setDisabled_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DISABLED);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DISABLED);
        }
    }

    public boolean getDisabled_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DISABLED);
    }

    public GlobalAlertRule id(String id) {

        this.id = id;
        return this;
    }

    /**
     * Get id
     *
     * @return id
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public GlobalAlertRule id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public GlobalAlertRule id_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID);
        return this;
    }

    public void setId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID);
        }
    }

    public boolean getId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID);
    }

    public GlobalAlertRule impact(String impact) {

        this.impact = impact;
        return this;
    }

    /**
     * Get impact
     *
     * @return impact
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getImpact() {
        return impact;
    }

    public void setImpact(String impact) {
        this.impact = impact;
    }

    public GlobalAlertRule impact_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IMPACT);
        return this;
    }

    public GlobalAlertRule impact_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IMPACT);
        return this;
    }

    public void setImpact_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IMPACT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IMPACT);
        }
    }

    public boolean getImpact_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IMPACT);
    }

    public GlobalAlertRule message(String message) {

        this.message = message;
        return this;
    }

    /**
     * Get message
     *
     * @return message
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public GlobalAlertRule message_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MESSAGE);
        return this;
    }

    public GlobalAlertRule message_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MESSAGE);
        return this;
    }

    public void setMessage_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MESSAGE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MESSAGE);
        }
    }

    public boolean getMessage_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MESSAGE);
    }

    public GlobalAlertRule name(String name) {

        this.name = name;
        return this;
    }

    /**
     * Get name
     *
     * @return name
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GlobalAlertRule name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public GlobalAlertRule name_ExplictlyNonNull() {
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

    public GlobalAlertRule _object(AlertRuleObject _object) {

        this._object = _object;
        return this;
    }

    /**
     * Get _object
     *
     * @return _object
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public AlertRuleObject getObject() {
        return _object;
    }

    public void setObject(AlertRuleObject _object) {
        this._object = _object;
    }

    public GlobalAlertRule _object_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_OBJECT);
        return this;
    }

    public GlobalAlertRule _object_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_OBJECT);
        return this;
    }

    public void setObject_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_OBJECT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_OBJECT);
        }
    }

    public boolean getObject_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_OBJECT);
    }

    public GlobalAlertRule operator(String operator) {

        this.operator = operator;
        return this;
    }

    /**
     * Get operator
     *
     * @return operator
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public GlobalAlertRule operator_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_OPERATOR);
        return this;
    }

    public GlobalAlertRule operator_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_OPERATOR);
        return this;
    }

    public void setOperator_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_OPERATOR);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_OPERATOR);
        }
    }

    public boolean getOperator_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_OPERATOR);
    }

    public GlobalAlertRule solution(String solution) {

        this.solution = solution;
        return this;
    }

    /**
     * Get solution
     *
     * @return solution
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getSolution() {
        return solution;
    }

    public void setSolution(String solution) {
        this.solution = solution;
    }

    public GlobalAlertRule solution_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SOLUTION);
        return this;
    }

    public GlobalAlertRule solution_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SOLUTION);
        return this;
    }

    public void setSolution_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SOLUTION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SOLUTION);
        }
    }

    public boolean getSolution_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SOLUTION);
    }

    public GlobalAlertRule thresholds(List<NestedThresholds> thresholds) {

        this.thresholds = thresholds;
        return this;
    }

    public GlobalAlertRule addThresholdsItem(NestedThresholds thresholdsItem) {
        this.thresholds.add(thresholdsItem);
        return this;
    }

    /**
     * Get thresholds
     *
     * @return thresholds
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public List<NestedThresholds> getThresholds() {
        return thresholds;
    }

    public void setThresholds(List<NestedThresholds> thresholds) {
        this.thresholds = thresholds;
    }

    public GlobalAlertRule thresholds_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_THRESHOLDS);
        return this;
    }

    public GlobalAlertRule thresholds_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_THRESHOLDS);
        return this;
    }

    public void setThresholds_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_THRESHOLDS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_THRESHOLDS);
        }
    }

    public boolean getThresholds_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_THRESHOLDS);
    }

    public GlobalAlertRule unit(AlertRuleUnit unit) {

        this.unit = unit;
        return this;
    }

    /**
     * Get unit
     *
     * @return unit
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public AlertRuleUnit getUnit() {
        return unit;
    }

    public void setUnit(AlertRuleUnit unit) {
        this.unit = unit;
    }

    public GlobalAlertRule unit_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UNIT);
        return this;
    }

    public GlobalAlertRule unit_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UNIT);
        return this;
    }

    public void setUnit_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UNIT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UNIT);
        }
    }

    public boolean getUnit_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UNIT);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GlobalAlertRule globalAlertRule = (GlobalAlertRule) o;
        return Objects.equals(this.alertRules, globalAlertRule.alertRules)
                && Objects.equals(this._boolean, globalAlertRule._boolean)
                && Objects.equals(this.cause, globalAlertRule.cause)
                && Objects.equals(this.defaultThresholds, globalAlertRule.defaultThresholds)
                && Objects.equals(this.disabled, globalAlertRule.disabled)
                && Objects.equals(this.id, globalAlertRule.id)
                && Objects.equals(this.impact, globalAlertRule.impact)
                && Objects.equals(this.message, globalAlertRule.message)
                && Objects.equals(this.name, globalAlertRule.name)
                && Objects.equals(this._object, globalAlertRule._object)
                && Objects.equals(this.operator, globalAlertRule.operator)
                && Objects.equals(this.solution, globalAlertRule.solution)
                && Objects.equals(this.thresholds, globalAlertRule.thresholds)
                && Objects.equals(this.unit, globalAlertRule.unit);
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
        return Objects.hash(
                alertRules,
                _boolean,
                cause,
                defaultThresholds,
                disabled,
                id,
                impact,
                message,
                name,
                _object,
                operator,
                solution,
                thresholds,
                unit);
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
        sb.append("class GlobalAlertRule {\n");
        sb.append("    alertRules: ").append(toIndentedString(alertRules)).append("\n");
        sb.append("    _boolean: ").append(toIndentedString(_boolean)).append("\n");
        sb.append("    cause: ").append(toIndentedString(cause)).append("\n");
        sb.append("    defaultThresholds: ")
                .append(toIndentedString(defaultThresholds))
                .append("\n");
        sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    impact: ").append(toIndentedString(impact)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
        sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
        sb.append("    solution: ").append(toIndentedString(solution)).append("\n");
        sb.append("    thresholds: ").append(toIndentedString(thresholds)).append("\n");
        sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
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

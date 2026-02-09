package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** GlobalAlertRuleUpdationParamsData */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class GlobalAlertRuleUpdationParamsData
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_THRESHOLDS = "thresholds";

    @SerializedName(SERIALIZED_NAME_THRESHOLDS)
    private List<AlertRuleThresholds> thresholds = null;

    public static final String SERIALIZED_NAME_DISABLED = "disabled";

    @SerializedName(SERIALIZED_NAME_DISABLED)
    private Boolean disabled;

    public GlobalAlertRuleUpdationParamsData() {}

    public GlobalAlertRuleUpdationParamsData thresholds(List<AlertRuleThresholds> thresholds) {

        this.thresholds = thresholds;
        return this;
    }

    public GlobalAlertRuleUpdationParamsData addThresholdsItem(AlertRuleThresholds thresholdsItem) {
        if (this.thresholds == null) {
            this.thresholds = new ArrayList<AlertRuleThresholds>();
        }
        this.thresholds.add(thresholdsItem);
        return this;
    }

    /**
     * Get thresholds
     *
     * @return thresholds
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<AlertRuleThresholds> getThresholds() {
        return thresholds;
    }

    public void setThresholds(List<AlertRuleThresholds> thresholds) {
        this.thresholds = thresholds;
    }

    public GlobalAlertRuleUpdationParamsData thresholds_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_THRESHOLDS);
        return this;
    }

    public GlobalAlertRuleUpdationParamsData thresholds_ExplictlyNonNull() {
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

    public GlobalAlertRuleUpdationParamsData disabled(Boolean disabled) {

        this.disabled = disabled;
        return this;
    }

    /**
     * Get disabled
     *
     * @return disabled
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getDisabled() {
        return disabled;
    }

    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    public GlobalAlertRuleUpdationParamsData disabled_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISABLED);
        return this;
    }

    public GlobalAlertRuleUpdationParamsData disabled_ExplictlyNonNull() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GlobalAlertRuleUpdationParamsData globalAlertRuleUpdationParamsData =
                (GlobalAlertRuleUpdationParamsData) o;
        return Objects.equals(this.thresholds, globalAlertRuleUpdationParamsData.thresholds)
                && Objects.equals(this.disabled, globalAlertRuleUpdationParamsData.disabled);
    }

    @Override
    public int hashCode() {
        return Objects.hash(thresholds, disabled);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GlobalAlertRuleUpdationParamsData {\n");
        sb.append("    thresholds: ").append(toIndentedString(thresholds)).append("\n");
        sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
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

package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** CustomizeAlertRuleUpdationParamsData */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class CustomizeAlertRuleUpdationParamsData
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_THRESHOLDS = "thresholds";

    @SerializedName(SERIALIZED_NAME_THRESHOLDS)
    private List<AlertRuleThresholds> thresholds = null;

    public static final String SERIALIZED_NAME_DISABLED = "disabled";

    @SerializedName(SERIALIZED_NAME_DISABLED)
    private Boolean disabled;

    public static final String SERIALIZED_NAME_CLUSTERS = "clusters";

    @SerializedName(SERIALIZED_NAME_CLUSTERS)
    private ClusterWhereInput clusters;

    public CustomizeAlertRuleUpdationParamsData() {}

    public CustomizeAlertRuleUpdationParamsData thresholds(List<AlertRuleThresholds> thresholds) {

        this.thresholds = thresholds;
        return this;
    }

    public CustomizeAlertRuleUpdationParamsData addThresholdsItem(
            AlertRuleThresholds thresholdsItem) {
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

    public CustomizeAlertRuleUpdationParamsData thresholds_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_THRESHOLDS);
        return this;
    }

    public CustomizeAlertRuleUpdationParamsData thresholds_ExplictlyNonNull() {
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

    public CustomizeAlertRuleUpdationParamsData disabled(Boolean disabled) {

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

    public CustomizeAlertRuleUpdationParamsData disabled_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISABLED);
        return this;
    }

    public CustomizeAlertRuleUpdationParamsData disabled_ExplictlyNonNull() {
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

    public CustomizeAlertRuleUpdationParamsData clusters(ClusterWhereInput clusters) {

        this.clusters = clusters;
        return this;
    }

    /**
     * Get clusters
     *
     * @return clusters
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public ClusterWhereInput getClusters() {
        return clusters;
    }

    public void setClusters(ClusterWhereInput clusters) {
        this.clusters = clusters;
    }

    public CustomizeAlertRuleUpdationParamsData clusters_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTERS);
        return this;
    }

    public CustomizeAlertRuleUpdationParamsData clusters_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLUSTERS);
        return this;
    }

    public void setClusters_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLUSTERS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLUSTERS);
        }
    }

    public boolean getClusters_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLUSTERS);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CustomizeAlertRuleUpdationParamsData customizeAlertRuleUpdationParamsData =
                (CustomizeAlertRuleUpdationParamsData) o;
        return Objects.equals(this.thresholds, customizeAlertRuleUpdationParamsData.thresholds)
                && Objects.equals(this.disabled, customizeAlertRuleUpdationParamsData.disabled)
                && Objects.equals(this.clusters, customizeAlertRuleUpdationParamsData.clusters);
    }

    @Override
    public int hashCode() {
        return Objects.hash(thresholds, disabled, clusters);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomizeAlertRuleUpdationParamsData {\n");
        sb.append("    thresholds: ").append(toIndentedString(thresholds)).append("\n");
        sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
        sb.append("    clusters: ").append(toIndentedString(clusters)).append("\n");
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

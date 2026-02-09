package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** AlertRule */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class AlertRule extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_CLUSTER = "cluster";

    @SerializedName(SERIALIZED_NAME_CLUSTER)
    private NestedCluster cluster;

    public static final String SERIALIZED_NAME_CUSTOMIZED = "customized";

    @SerializedName(SERIALIZED_NAME_CUSTOMIZED)
    private Boolean customized;

    public static final String SERIALIZED_NAME_DISABLED = "disabled";

    @SerializedName(SERIALIZED_NAME_DISABLED)
    private Boolean disabled;

    public static final String SERIALIZED_NAME_GLOBAL_ALERT_RULE = "global_alert_rule";

    @SerializedName(SERIALIZED_NAME_GLOBAL_ALERT_RULE)
    private NestedGlobalAlertRule globalAlertRule;

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

    public static final String SERIALIZED_NAME_LOCAL_ID = "local_id";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID)
    private String localId;

    public static final String SERIALIZED_NAME_THRESHOLDS = "thresholds";

    @SerializedName(SERIALIZED_NAME_THRESHOLDS)
    private List<NestedThresholds> thresholds = new ArrayList<NestedThresholds>();

    public AlertRule() {}

    public AlertRule cluster(NestedCluster cluster) {

        this.cluster = cluster;
        return this;
    }

    /**
     * Get cluster
     *
     * @return cluster
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NestedCluster getCluster() {
        return cluster;
    }

    public void setCluster(NestedCluster cluster) {
        this.cluster = cluster;
    }

    public AlertRule cluster_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER);
        return this;
    }

    public AlertRule cluster_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLUSTER);
        return this;
    }

    public void setCluster_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLUSTER);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLUSTER);
        }
    }

    public boolean getCluster_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLUSTER);
    }

    public AlertRule customized(Boolean customized) {

        this.customized = customized;
        return this;
    }

    /**
     * Get customized
     *
     * @return customized
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Boolean getCustomized() {
        return customized;
    }

    public void setCustomized(Boolean customized) {
        this.customized = customized;
    }

    public AlertRule customized_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CUSTOMIZED);
        return this;
    }

    public AlertRule customized_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CUSTOMIZED);
        return this;
    }

    public void setCustomized_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CUSTOMIZED);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CUSTOMIZED);
        }
    }

    public boolean getCustomized_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CUSTOMIZED);
    }

    public AlertRule disabled(Boolean disabled) {

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

    public AlertRule disabled_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISABLED);
        return this;
    }

    public AlertRule disabled_ExplictlyNonNull() {
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

    public AlertRule globalAlertRule(NestedGlobalAlertRule globalAlertRule) {

        this.globalAlertRule = globalAlertRule;
        return this;
    }

    /**
     * Get globalAlertRule
     *
     * @return globalAlertRule
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public NestedGlobalAlertRule getGlobalAlertRule() {
        return globalAlertRule;
    }

    public void setGlobalAlertRule(NestedGlobalAlertRule globalAlertRule) {
        this.globalAlertRule = globalAlertRule;
    }

    public AlertRule globalAlertRule_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_GLOBAL_ALERT_RULE);
        return this;
    }

    public AlertRule globalAlertRule_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_GLOBAL_ALERT_RULE);
        return this;
    }

    public void setGlobalAlertRule_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_GLOBAL_ALERT_RULE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_GLOBAL_ALERT_RULE);
        }
    }

    public boolean getGlobalAlertRule_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_GLOBAL_ALERT_RULE);
    }

    public AlertRule id(String id) {

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

    public AlertRule id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public AlertRule id_ExplictlyNonNull() {
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

    public AlertRule localId(String localId) {

        this.localId = localId;
        return this;
    }

    /**
     * Get localId
     *
     * @return localId
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getLocalId() {
        return localId;
    }

    public void setLocalId(String localId) {
        this.localId = localId;
    }

    public AlertRule localId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID);
        return this;
    }

    public AlertRule localId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID);
        return this;
    }

    public void setLocalId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID);
        }
    }

    public boolean getLocalId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID);
    }

    public AlertRule thresholds(List<NestedThresholds> thresholds) {

        this.thresholds = thresholds;
        return this;
    }

    public AlertRule addThresholdsItem(NestedThresholds thresholdsItem) {
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

    public AlertRule thresholds_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_THRESHOLDS);
        return this;
    }

    public AlertRule thresholds_ExplictlyNonNull() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AlertRule alertRule = (AlertRule) o;
        return Objects.equals(this.cluster, alertRule.cluster)
                && Objects.equals(this.customized, alertRule.customized)
                && Objects.equals(this.disabled, alertRule.disabled)
                && Objects.equals(this.globalAlertRule, alertRule.globalAlertRule)
                && Objects.equals(this.id, alertRule.id)
                && Objects.equals(this.localId, alertRule.localId)
                && Objects.equals(this.thresholds, alertRule.thresholds);
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
                cluster, customized, disabled, globalAlertRule, id, localId, thresholds);
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
        sb.append("class AlertRule {\n");
        sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
        sb.append("    customized: ").append(toIndentedString(customized)).append("\n");
        sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
        sb.append("    globalAlertRule: ").append(toIndentedString(globalAlertRule)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
        sb.append("    thresholds: ").append(toIndentedString(thresholds)).append("\n");
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

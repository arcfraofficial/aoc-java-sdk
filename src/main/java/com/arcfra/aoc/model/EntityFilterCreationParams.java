package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** EntityFilterCreationParams */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class EntityFilterCreationParams
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_EXCLUDE_VMS = "exclude_vms";

    @SerializedName(SERIALIZED_NAME_EXCLUDE_VMS)
    private VmWhereInput excludeVms;

    public static final String SERIALIZED_NAME_CLUSTERS = "clusters";

    @SerializedName(SERIALIZED_NAME_CLUSTERS)
    private ClusterWhereInput clusters;

    public static final String SERIALIZED_NAME_APPLY_TO_ALL_CLUSTERS = "apply_to_all_clusters";

    @SerializedName(SERIALIZED_NAME_APPLY_TO_ALL_CLUSTERS)
    private Boolean applyToAllClusters;

    public static final String SERIALIZED_NAME_RULES = "rules";

    @SerializedName(SERIALIZED_NAME_RULES)
    private List<FilterRuleInput> rules = new ArrayList<FilterRuleInput>();

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public EntityFilterCreationParams() {}

    public EntityFilterCreationParams excludeVms(VmWhereInput excludeVms) {

        this.excludeVms = excludeVms;
        return this;
    }

    /**
     * Get excludeVms
     *
     * @return excludeVms
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmWhereInput getExcludeVms() {
        return excludeVms;
    }

    public void setExcludeVms(VmWhereInput excludeVms) {
        this.excludeVms = excludeVms;
    }

    public EntityFilterCreationParams excludeVms_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXCLUDE_VMS);
        return this;
    }

    public EntityFilterCreationParams excludeVms_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EXCLUDE_VMS);
        return this;
    }

    public void setExcludeVms_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EXCLUDE_VMS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EXCLUDE_VMS);
        }
    }

    public boolean getExcludeVms_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EXCLUDE_VMS);
    }

    public EntityFilterCreationParams clusters(ClusterWhereInput clusters) {

        this.clusters = clusters;
        return this;
    }

    /**
     * Get clusters
     *
     * @return clusters
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ClusterWhereInput getClusters() {
        return clusters;
    }

    public void setClusters(ClusterWhereInput clusters) {
        this.clusters = clusters;
    }

    public EntityFilterCreationParams clusters_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTERS);
        return this;
    }

    public EntityFilterCreationParams clusters_ExplictlyNonNull() {
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

    public EntityFilterCreationParams applyToAllClusters(Boolean applyToAllClusters) {

        this.applyToAllClusters = applyToAllClusters;
        return this;
    }

    /**
     * Get applyToAllClusters
     *
     * @return applyToAllClusters
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getApplyToAllClusters() {
        return applyToAllClusters;
    }

    public void setApplyToAllClusters(Boolean applyToAllClusters) {
        this.applyToAllClusters = applyToAllClusters;
    }

    public EntityFilterCreationParams applyToAllClusters_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_APPLY_TO_ALL_CLUSTERS);
        return this;
    }

    public EntityFilterCreationParams applyToAllClusters_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_APPLY_TO_ALL_CLUSTERS);
        return this;
    }

    public void setApplyToAllClusters_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_APPLY_TO_ALL_CLUSTERS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_APPLY_TO_ALL_CLUSTERS);
        }
    }

    public boolean getApplyToAllClusters_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_APPLY_TO_ALL_CLUSTERS);
    }

    public EntityFilterCreationParams rules(List<FilterRuleInput> rules) {

        this.rules = rules;
        return this;
    }

    public EntityFilterCreationParams addRulesItem(FilterRuleInput rulesItem) {
        this.rules.add(rulesItem);
        return this;
    }

    /**
     * Get rules
     *
     * @return rules
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public List<FilterRuleInput> getRules() {
        return rules;
    }

    public void setRules(List<FilterRuleInput> rules) {
        this.rules = rules;
    }

    public EntityFilterCreationParams rules_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RULES);
        return this;
    }

    public EntityFilterCreationParams rules_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RULES);
        return this;
    }

    public void setRules_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RULES);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RULES);
        }
    }

    public boolean getRules_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RULES);
    }

    public EntityFilterCreationParams name(String name) {

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

    public EntityFilterCreationParams name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public EntityFilterCreationParams name_ExplictlyNonNull() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EntityFilterCreationParams entityFilterCreationParams = (EntityFilterCreationParams) o;
        return Objects.equals(this.excludeVms, entityFilterCreationParams.excludeVms)
                && Objects.equals(this.clusters, entityFilterCreationParams.clusters)
                && Objects.equals(
                        this.applyToAllClusters, entityFilterCreationParams.applyToAllClusters)
                && Objects.equals(this.rules, entityFilterCreationParams.rules)
                && Objects.equals(this.name, entityFilterCreationParams.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(excludeVms, clusters, applyToAllClusters, rules, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EntityFilterCreationParams {\n");
        sb.append("    excludeVms: ").append(toIndentedString(excludeVms)).append("\n");
        sb.append("    clusters: ").append(toIndentedString(clusters)).append("\n");
        sb.append("    applyToAllClusters: ")
                .append(toIndentedString(applyToAllClusters))
                .append("\n");
        sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

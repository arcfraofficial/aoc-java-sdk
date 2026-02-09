package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** EntityFilter */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class EntityFilter extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_APPLY_TO_ALL_CLUSTERS = "apply_to_all_clusters";

    @SerializedName(SERIALIZED_NAME_APPLY_TO_ALL_CLUSTERS)
    private Boolean applyToAllClusters;

    public static final String SERIALIZED_NAME_CLUSTERS = "clusters";

    @SerializedName(SERIALIZED_NAME_CLUSTERS)
    private List<NestedCluster> clusters = null;

    public static final String SERIALIZED_NAME_ENTITY_TYPE = "entity_type";

    @SerializedName(SERIALIZED_NAME_ENTITY_TYPE)
    private EntityType entityType;

    public static final String SERIALIZED_NAME_EXCLUDE_IDS = "exclude_ids";

    @SerializedName(SERIALIZED_NAME_EXCLUDE_IDS)
    private List<String> excludeIds = new ArrayList<String>();

    public static final String SERIALIZED_NAME_EXEC_FAILED_CLUSTER = "exec_failed_cluster";

    @SerializedName(SERIALIZED_NAME_EXEC_FAILED_CLUSTER)
    private List<NestedCluster> execFailedCluster = null;

    public static final String SERIALIZED_NAME_FILTER_ERROR = "filter_error";

    @SerializedName(SERIALIZED_NAME_FILTER_ERROR)
    private List<String> filterError = new ArrayList<String>();

    public static final String SERIALIZED_NAME_FILTER_STATUS = "filter_status";

    @SerializedName(SERIALIZED_NAME_FILTER_STATUS)
    private FilterStatus filterStatus;

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

    public static final String SERIALIZED_NAME_IDS = "ids";

    @SerializedName(SERIALIZED_NAME_IDS)
    private List<String> ids = new ArrayList<String>();

    public static final String SERIALIZED_NAME_LAST_EXECUTED_AT = "last_executed_at";

    @SerializedName(SERIALIZED_NAME_LAST_EXECUTED_AT)
    private String lastExecutedAt;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_PRESET = "preset";

    @SerializedName(SERIALIZED_NAME_PRESET)
    private String preset;

    public static final String SERIALIZED_NAME_RULES = "rules";

    @SerializedName(SERIALIZED_NAME_RULES)
    private List<NestedFilterRule> rules = new ArrayList<NestedFilterRule>();

    public EntityFilter() {}

    public EntityFilter applyToAllClusters(Boolean applyToAllClusters) {

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

    public EntityFilter applyToAllClusters_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_APPLY_TO_ALL_CLUSTERS);
        return this;
    }

    public EntityFilter applyToAllClusters_ExplictlyNonNull() {
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

    public EntityFilter clusters(List<NestedCluster> clusters) {

        this.clusters = clusters;
        return this;
    }

    public EntityFilter addClustersItem(NestedCluster clustersItem) {
        if (this.clusters == null) {
            this.clusters = new ArrayList<NestedCluster>();
        }
        this.clusters.add(clustersItem);
        return this;
    }

    /**
     * Get clusters
     *
     * @return clusters
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedCluster> getClusters() {
        return clusters;
    }

    public void setClusters(List<NestedCluster> clusters) {
        this.clusters = clusters;
    }

    public EntityFilter clusters_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTERS);
        return this;
    }

    public EntityFilter clusters_ExplictlyNonNull() {
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

    public EntityFilter entityType(EntityType entityType) {

        this.entityType = entityType;
        return this;
    }

    /**
     * Get entityType
     *
     * @return entityType
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public EntityType getEntityType() {
        return entityType;
    }

    public void setEntityType(EntityType entityType) {
        this.entityType = entityType;
    }

    public EntityFilter entityType_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_TYPE);
        return this;
    }

    public EntityFilter entityType_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ENTITY_TYPE);
        return this;
    }

    public void setEntityType_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ENTITY_TYPE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ENTITY_TYPE);
        }
    }

    public boolean getEntityType_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ENTITY_TYPE);
    }

    public EntityFilter excludeIds(List<String> excludeIds) {

        this.excludeIds = excludeIds;
        return this;
    }

    public EntityFilter addExcludeIdsItem(String excludeIdsItem) {
        this.excludeIds.add(excludeIdsItem);
        return this;
    }

    /**
     * Get excludeIds
     *
     * @return excludeIds
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public List<String> getExcludeIds() {
        return excludeIds;
    }

    public void setExcludeIds(List<String> excludeIds) {
        this.excludeIds = excludeIds;
    }

    public EntityFilter excludeIds_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXCLUDE_IDS);
        return this;
    }

    public EntityFilter excludeIds_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EXCLUDE_IDS);
        return this;
    }

    public void setExcludeIds_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EXCLUDE_IDS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EXCLUDE_IDS);
        }
    }

    public boolean getExcludeIds_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EXCLUDE_IDS);
    }

    public EntityFilter execFailedCluster(List<NestedCluster> execFailedCluster) {

        this.execFailedCluster = execFailedCluster;
        return this;
    }

    public EntityFilter addExecFailedClusterItem(NestedCluster execFailedClusterItem) {
        if (this.execFailedCluster == null) {
            this.execFailedCluster = new ArrayList<NestedCluster>();
        }
        this.execFailedCluster.add(execFailedClusterItem);
        return this;
    }

    /**
     * Get execFailedCluster
     *
     * @return execFailedCluster
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedCluster> getExecFailedCluster() {
        return execFailedCluster;
    }

    public void setExecFailedCluster(List<NestedCluster> execFailedCluster) {
        this.execFailedCluster = execFailedCluster;
    }

    public EntityFilter execFailedCluster_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXEC_FAILED_CLUSTER);
        return this;
    }

    public EntityFilter execFailedCluster_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EXEC_FAILED_CLUSTER);
        return this;
    }

    public void setExecFailedCluster_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EXEC_FAILED_CLUSTER);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EXEC_FAILED_CLUSTER);
        }
    }

    public boolean getExecFailedCluster_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EXEC_FAILED_CLUSTER);
    }

    public EntityFilter filterError(List<String> filterError) {

        this.filterError = filterError;
        return this;
    }

    public EntityFilter addFilterErrorItem(String filterErrorItem) {
        this.filterError.add(filterErrorItem);
        return this;
    }

    /**
     * Get filterError
     *
     * @return filterError
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public List<String> getFilterError() {
        return filterError;
    }

    public void setFilterError(List<String> filterError) {
        this.filterError = filterError;
    }

    public EntityFilter filterError_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FILTER_ERROR);
        return this;
    }

    public EntityFilter filterError_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FILTER_ERROR);
        return this;
    }

    public void setFilterError_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FILTER_ERROR);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FILTER_ERROR);
        }
    }

    public boolean getFilterError_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FILTER_ERROR);
    }

    public EntityFilter filterStatus(FilterStatus filterStatus) {

        this.filterStatus = filterStatus;
        return this;
    }

    /**
     * Get filterStatus
     *
     * @return filterStatus
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public FilterStatus getFilterStatus() {
        return filterStatus;
    }

    public void setFilterStatus(FilterStatus filterStatus) {
        this.filterStatus = filterStatus;
    }

    public EntityFilter filterStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FILTER_STATUS);
        return this;
    }

    public EntityFilter filterStatus_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FILTER_STATUS);
        return this;
    }

    public void setFilterStatus_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FILTER_STATUS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FILTER_STATUS);
        }
    }

    public boolean getFilterStatus_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FILTER_STATUS);
    }

    public EntityFilter id(String id) {

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

    public EntityFilter id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public EntityFilter id_ExplictlyNonNull() {
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

    public EntityFilter ids(List<String> ids) {

        this.ids = ids;
        return this;
    }

    public EntityFilter addIdsItem(String idsItem) {
        this.ids.add(idsItem);
        return this;
    }

    /**
     * Get ids
     *
     * @return ids
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public List<String> getIds() {
        return ids;
    }

    public void setIds(List<String> ids) {
        this.ids = ids;
    }

    public EntityFilter ids_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IDS);
        return this;
    }

    public EntityFilter ids_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IDS);
        return this;
    }

    public void setIds_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IDS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IDS);
        }
    }

    public boolean getIds_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IDS);
    }

    public EntityFilter lastExecutedAt(String lastExecutedAt) {

        this.lastExecutedAt = lastExecutedAt;
        return this;
    }

    /**
     * Get lastExecutedAt
     *
     * @return lastExecutedAt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLastExecutedAt() {
        return lastExecutedAt;
    }

    public void setLastExecutedAt(String lastExecutedAt) {
        this.lastExecutedAt = lastExecutedAt;
    }

    public EntityFilter lastExecutedAt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTED_AT);
        return this;
    }

    public EntityFilter lastExecutedAt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTED_AT);
        return this;
    }

    public void setLastExecutedAt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTED_AT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTED_AT);
        }
    }

    public boolean getLastExecutedAt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LAST_EXECUTED_AT);
    }

    public EntityFilter name(String name) {

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

    public EntityFilter name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public EntityFilter name_ExplictlyNonNull() {
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

    public EntityFilter preset(String preset) {

        this.preset = preset;
        return this;
    }

    /**
     * Get preset
     *
     * @return preset
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPreset() {
        return preset;
    }

    public void setPreset(String preset) {
        this.preset = preset;
    }

    public EntityFilter preset_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRESET);
        return this;
    }

    public EntityFilter preset_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRESET);
        return this;
    }

    public void setPreset_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRESET);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRESET);
        }
    }

    public boolean getPreset_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRESET);
    }

    public EntityFilter rules(List<NestedFilterRule> rules) {

        this.rules = rules;
        return this;
    }

    public EntityFilter addRulesItem(NestedFilterRule rulesItem) {
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
    public List<NestedFilterRule> getRules() {
        return rules;
    }

    public void setRules(List<NestedFilterRule> rules) {
        this.rules = rules;
    }

    public EntityFilter rules_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RULES);
        return this;
    }

    public EntityFilter rules_ExplictlyNonNull() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EntityFilter entityFilter = (EntityFilter) o;
        return Objects.equals(this.applyToAllClusters, entityFilter.applyToAllClusters)
                && Objects.equals(this.clusters, entityFilter.clusters)
                && Objects.equals(this.entityType, entityFilter.entityType)
                && Objects.equals(this.excludeIds, entityFilter.excludeIds)
                && Objects.equals(this.execFailedCluster, entityFilter.execFailedCluster)
                && Objects.equals(this.filterError, entityFilter.filterError)
                && Objects.equals(this.filterStatus, entityFilter.filterStatus)
                && Objects.equals(this.id, entityFilter.id)
                && Objects.equals(this.ids, entityFilter.ids)
                && Objects.equals(this.lastExecutedAt, entityFilter.lastExecutedAt)
                && Objects.equals(this.name, entityFilter.name)
                && Objects.equals(this.preset, entityFilter.preset)
                && Objects.equals(this.rules, entityFilter.rules);
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
                applyToAllClusters,
                clusters,
                entityType,
                excludeIds,
                execFailedCluster,
                filterError,
                filterStatus,
                id,
                ids,
                lastExecutedAt,
                name,
                preset,
                rules);
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
        sb.append("class EntityFilter {\n");
        sb.append("    applyToAllClusters: ")
                .append(toIndentedString(applyToAllClusters))
                .append("\n");
        sb.append("    clusters: ").append(toIndentedString(clusters)).append("\n");
        sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
        sb.append("    excludeIds: ").append(toIndentedString(excludeIds)).append("\n");
        sb.append("    execFailedCluster: ")
                .append(toIndentedString(execFailedCluster))
                .append("\n");
        sb.append("    filterError: ").append(toIndentedString(filterError)).append("\n");
        sb.append("    filterStatus: ").append(toIndentedString(filterStatus)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
        sb.append("    lastExecutedAt: ").append(toIndentedString(lastExecutedAt)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    preset: ").append(toIndentedString(preset)).append("\n");
        sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
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

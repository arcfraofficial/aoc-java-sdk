package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** EntityFilterWhereInput */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class EntityFilterWhereInput
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_A_N_D = "AND";

    @SerializedName(SERIALIZED_NAME_A_N_D)
    private List<EntityFilterWhereInput> AND = null;

    public static final String SERIALIZED_NAME_N_O_T = "NOT";

    @SerializedName(SERIALIZED_NAME_N_O_T)
    private List<EntityFilterWhereInput> NOT = null;

    public static final String SERIALIZED_NAME_O_R = "OR";

    @SerializedName(SERIALIZED_NAME_O_R)
    private List<EntityFilterWhereInput> OR = null;

    public static final String SERIALIZED_NAME_APPLY_TO_ALL_CLUSTERS = "apply_to_all_clusters";

    @SerializedName(SERIALIZED_NAME_APPLY_TO_ALL_CLUSTERS)
    private Boolean applyToAllClusters;

    public static final String SERIALIZED_NAME_APPLY_TO_ALL_CLUSTERS_NOT =
            "apply_to_all_clusters_not";

    @SerializedName(SERIALIZED_NAME_APPLY_TO_ALL_CLUSTERS_NOT)
    private Boolean applyToAllClustersNot;

    public static final String SERIALIZED_NAME_CLUSTERS_EVERY = "clusters_every";

    @SerializedName(SERIALIZED_NAME_CLUSTERS_EVERY)
    private ClusterWhereInput clustersEvery;

    public static final String SERIALIZED_NAME_CLUSTERS_NONE = "clusters_none";

    @SerializedName(SERIALIZED_NAME_CLUSTERS_NONE)
    private ClusterWhereInput clustersNone;

    public static final String SERIALIZED_NAME_CLUSTERS_SOME = "clusters_some";

    @SerializedName(SERIALIZED_NAME_CLUSTERS_SOME)
    private ClusterWhereInput clustersSome;

    public static final String SERIALIZED_NAME_ENTITY_TYPE = "entity_type";

    @SerializedName(SERIALIZED_NAME_ENTITY_TYPE)
    private EntityType entityType;

    public static final String SERIALIZED_NAME_ENTITY_TYPE_IN = "entity_type_in";

    @SerializedName(SERIALIZED_NAME_ENTITY_TYPE_IN)
    private List<EntityType> entityTypeIn = null;

    public static final String SERIALIZED_NAME_ENTITY_TYPE_NOT = "entity_type_not";

    @SerializedName(SERIALIZED_NAME_ENTITY_TYPE_NOT)
    private EntityType entityTypeNot;

    public static final String SERIALIZED_NAME_ENTITY_TYPE_NOT_IN = "entity_type_not_in";

    @SerializedName(SERIALIZED_NAME_ENTITY_TYPE_NOT_IN)
    private List<EntityType> entityTypeNotIn = null;

    public static final String SERIALIZED_NAME_EXEC_FAILED_CLUSTER_EVERY =
            "exec_failed_cluster_every";

    @SerializedName(SERIALIZED_NAME_EXEC_FAILED_CLUSTER_EVERY)
    private ClusterWhereInput execFailedClusterEvery;

    public static final String SERIALIZED_NAME_EXEC_FAILED_CLUSTER_NONE =
            "exec_failed_cluster_none";

    @SerializedName(SERIALIZED_NAME_EXEC_FAILED_CLUSTER_NONE)
    private ClusterWhereInput execFailedClusterNone;

    public static final String SERIALIZED_NAME_EXEC_FAILED_CLUSTER_SOME =
            "exec_failed_cluster_some";

    @SerializedName(SERIALIZED_NAME_EXEC_FAILED_CLUSTER_SOME)
    private ClusterWhereInput execFailedClusterSome;

    public static final String SERIALIZED_NAME_FILTER_STATUS = "filter_status";

    @SerializedName(SERIALIZED_NAME_FILTER_STATUS)
    private FilterStatus filterStatus;

    public static final String SERIALIZED_NAME_FILTER_STATUS_IN = "filter_status_in";

    @SerializedName(SERIALIZED_NAME_FILTER_STATUS_IN)
    private List<FilterStatus> filterStatusIn = null;

    public static final String SERIALIZED_NAME_FILTER_STATUS_NOT = "filter_status_not";

    @SerializedName(SERIALIZED_NAME_FILTER_STATUS_NOT)
    private FilterStatus filterStatusNot;

    public static final String SERIALIZED_NAME_FILTER_STATUS_NOT_IN = "filter_status_not_in";

    @SerializedName(SERIALIZED_NAME_FILTER_STATUS_NOT_IN)
    private List<FilterStatus> filterStatusNotIn = null;

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

    public static final String SERIALIZED_NAME_ID_CONTAINS = "id_contains";

    @SerializedName(SERIALIZED_NAME_ID_CONTAINS)
    private String idContains;

    public static final String SERIALIZED_NAME_ID_ENDS_WITH = "id_ends_with";

    @SerializedName(SERIALIZED_NAME_ID_ENDS_WITH)
    private String idEndsWith;

    public static final String SERIALIZED_NAME_ID_GT = "id_gt";

    @SerializedName(SERIALIZED_NAME_ID_GT)
    private String idGt;

    public static final String SERIALIZED_NAME_ID_GTE = "id_gte";

    @SerializedName(SERIALIZED_NAME_ID_GTE)
    private String idGte;

    public static final String SERIALIZED_NAME_ID_IN = "id_in";

    @SerializedName(SERIALIZED_NAME_ID_IN)
    private List<String> idIn = null;

    public static final String SERIALIZED_NAME_ID_LT = "id_lt";

    @SerializedName(SERIALIZED_NAME_ID_LT)
    private String idLt;

    public static final String SERIALIZED_NAME_ID_LTE = "id_lte";

    @SerializedName(SERIALIZED_NAME_ID_LTE)
    private String idLte;

    public static final String SERIALIZED_NAME_ID_NOT = "id_not";

    @SerializedName(SERIALIZED_NAME_ID_NOT)
    private String idNot;

    public static final String SERIALIZED_NAME_ID_NOT_CONTAINS = "id_not_contains";

    @SerializedName(SERIALIZED_NAME_ID_NOT_CONTAINS)
    private String idNotContains;

    public static final String SERIALIZED_NAME_ID_NOT_ENDS_WITH = "id_not_ends_with";

    @SerializedName(SERIALIZED_NAME_ID_NOT_ENDS_WITH)
    private String idNotEndsWith;

    public static final String SERIALIZED_NAME_ID_NOT_IN = "id_not_in";

    @SerializedName(SERIALIZED_NAME_ID_NOT_IN)
    private List<String> idNotIn = null;

    public static final String SERIALIZED_NAME_ID_NOT_STARTS_WITH = "id_not_starts_with";

    @SerializedName(SERIALIZED_NAME_ID_NOT_STARTS_WITH)
    private String idNotStartsWith;

    public static final String SERIALIZED_NAME_ID_STARTS_WITH = "id_starts_with";

    @SerializedName(SERIALIZED_NAME_ID_STARTS_WITH)
    private String idStartsWith;

    public static final String SERIALIZED_NAME_LAST_EXECUTED_AT = "last_executed_at";

    @SerializedName(SERIALIZED_NAME_LAST_EXECUTED_AT)
    private String lastExecutedAt;

    public static final String SERIALIZED_NAME_LAST_EXECUTED_AT_GT = "last_executed_at_gt";

    @SerializedName(SERIALIZED_NAME_LAST_EXECUTED_AT_GT)
    private String lastExecutedAtGt;

    public static final String SERIALIZED_NAME_LAST_EXECUTED_AT_GTE = "last_executed_at_gte";

    @SerializedName(SERIALIZED_NAME_LAST_EXECUTED_AT_GTE)
    private String lastExecutedAtGte;

    public static final String SERIALIZED_NAME_LAST_EXECUTED_AT_IN = "last_executed_at_in";

    @SerializedName(SERIALIZED_NAME_LAST_EXECUTED_AT_IN)
    private List<String> lastExecutedAtIn = null;

    public static final String SERIALIZED_NAME_LAST_EXECUTED_AT_LT = "last_executed_at_lt";

    @SerializedName(SERIALIZED_NAME_LAST_EXECUTED_AT_LT)
    private String lastExecutedAtLt;

    public static final String SERIALIZED_NAME_LAST_EXECUTED_AT_LTE = "last_executed_at_lte";

    @SerializedName(SERIALIZED_NAME_LAST_EXECUTED_AT_LTE)
    private String lastExecutedAtLte;

    public static final String SERIALIZED_NAME_LAST_EXECUTED_AT_NOT = "last_executed_at_not";

    @SerializedName(SERIALIZED_NAME_LAST_EXECUTED_AT_NOT)
    private String lastExecutedAtNot;

    public static final String SERIALIZED_NAME_LAST_EXECUTED_AT_NOT_IN = "last_executed_at_not_in";

    @SerializedName(SERIALIZED_NAME_LAST_EXECUTED_AT_NOT_IN)
    private List<String> lastExecutedAtNotIn = null;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_NAME_CONTAINS = "name_contains";

    @SerializedName(SERIALIZED_NAME_NAME_CONTAINS)
    private String nameContains;

    public static final String SERIALIZED_NAME_NAME_ENDS_WITH = "name_ends_with";

    @SerializedName(SERIALIZED_NAME_NAME_ENDS_WITH)
    private String nameEndsWith;

    public static final String SERIALIZED_NAME_NAME_GT = "name_gt";

    @SerializedName(SERIALIZED_NAME_NAME_GT)
    private String nameGt;

    public static final String SERIALIZED_NAME_NAME_GTE = "name_gte";

    @SerializedName(SERIALIZED_NAME_NAME_GTE)
    private String nameGte;

    public static final String SERIALIZED_NAME_NAME_IN = "name_in";

    @SerializedName(SERIALIZED_NAME_NAME_IN)
    private List<String> nameIn = null;

    public static final String SERIALIZED_NAME_NAME_LT = "name_lt";

    @SerializedName(SERIALIZED_NAME_NAME_LT)
    private String nameLt;

    public static final String SERIALIZED_NAME_NAME_LTE = "name_lte";

    @SerializedName(SERIALIZED_NAME_NAME_LTE)
    private String nameLte;

    public static final String SERIALIZED_NAME_NAME_NOT = "name_not";

    @SerializedName(SERIALIZED_NAME_NAME_NOT)
    private String nameNot;

    public static final String SERIALIZED_NAME_NAME_NOT_CONTAINS = "name_not_contains";

    @SerializedName(SERIALIZED_NAME_NAME_NOT_CONTAINS)
    private String nameNotContains;

    public static final String SERIALIZED_NAME_NAME_NOT_ENDS_WITH = "name_not_ends_with";

    @SerializedName(SERIALIZED_NAME_NAME_NOT_ENDS_WITH)
    private String nameNotEndsWith;

    public static final String SERIALIZED_NAME_NAME_NOT_IN = "name_not_in";

    @SerializedName(SERIALIZED_NAME_NAME_NOT_IN)
    private List<String> nameNotIn = null;

    public static final String SERIALIZED_NAME_NAME_NOT_STARTS_WITH = "name_not_starts_with";

    @SerializedName(SERIALIZED_NAME_NAME_NOT_STARTS_WITH)
    private String nameNotStartsWith;

    public static final String SERIALIZED_NAME_NAME_STARTS_WITH = "name_starts_with";

    @SerializedName(SERIALIZED_NAME_NAME_STARTS_WITH)
    private String nameStartsWith;

    public static final String SERIALIZED_NAME_PRESET = "preset";

    @SerializedName(SERIALIZED_NAME_PRESET)
    private String preset;

    public static final String SERIALIZED_NAME_PRESET_CONTAINS = "preset_contains";

    @SerializedName(SERIALIZED_NAME_PRESET_CONTAINS)
    private String presetContains;

    public static final String SERIALIZED_NAME_PRESET_ENDS_WITH = "preset_ends_with";

    @SerializedName(SERIALIZED_NAME_PRESET_ENDS_WITH)
    private String presetEndsWith;

    public static final String SERIALIZED_NAME_PRESET_GT = "preset_gt";

    @SerializedName(SERIALIZED_NAME_PRESET_GT)
    private String presetGt;

    public static final String SERIALIZED_NAME_PRESET_GTE = "preset_gte";

    @SerializedName(SERIALIZED_NAME_PRESET_GTE)
    private String presetGte;

    public static final String SERIALIZED_NAME_PRESET_IN = "preset_in";

    @SerializedName(SERIALIZED_NAME_PRESET_IN)
    private List<String> presetIn = null;

    public static final String SERIALIZED_NAME_PRESET_LT = "preset_lt";

    @SerializedName(SERIALIZED_NAME_PRESET_LT)
    private String presetLt;

    public static final String SERIALIZED_NAME_PRESET_LTE = "preset_lte";

    @SerializedName(SERIALIZED_NAME_PRESET_LTE)
    private String presetLte;

    public static final String SERIALIZED_NAME_PRESET_NOT = "preset_not";

    @SerializedName(SERIALIZED_NAME_PRESET_NOT)
    private String presetNot;

    public static final String SERIALIZED_NAME_PRESET_NOT_CONTAINS = "preset_not_contains";

    @SerializedName(SERIALIZED_NAME_PRESET_NOT_CONTAINS)
    private String presetNotContains;

    public static final String SERIALIZED_NAME_PRESET_NOT_ENDS_WITH = "preset_not_ends_with";

    @SerializedName(SERIALIZED_NAME_PRESET_NOT_ENDS_WITH)
    private String presetNotEndsWith;

    public static final String SERIALIZED_NAME_PRESET_NOT_IN = "preset_not_in";

    @SerializedName(SERIALIZED_NAME_PRESET_NOT_IN)
    private List<String> presetNotIn = null;

    public static final String SERIALIZED_NAME_PRESET_NOT_STARTS_WITH = "preset_not_starts_with";

    @SerializedName(SERIALIZED_NAME_PRESET_NOT_STARTS_WITH)
    private String presetNotStartsWith;

    public static final String SERIALIZED_NAME_PRESET_STARTS_WITH = "preset_starts_with";

    @SerializedName(SERIALIZED_NAME_PRESET_STARTS_WITH)
    private String presetStartsWith;

    public EntityFilterWhereInput() {}

    public EntityFilterWhereInput AND(List<EntityFilterWhereInput> AND) {

        this.AND = AND;
        return this;
    }

    public EntityFilterWhereInput addANDItem(EntityFilterWhereInput ANDItem) {
        if (this.AND == null) {
            this.AND = new ArrayList<EntityFilterWhereInput>();
        }
        this.AND.add(ANDItem);
        return this;
    }

    /**
     * Get AND
     *
     * @return AND
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<EntityFilterWhereInput> getAND() {
        return AND;
    }

    public void setAND(List<EntityFilterWhereInput> AND) {
        this.AND = AND;
    }

    public EntityFilterWhereInput AND_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_A_N_D);
        return this;
    }

    public EntityFilterWhereInput AND_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_A_N_D);
        return this;
    }

    public void setAND_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_A_N_D);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_A_N_D);
        }
    }

    public boolean getAND_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_A_N_D);
    }

    public EntityFilterWhereInput NOT(List<EntityFilterWhereInput> NOT) {

        this.NOT = NOT;
        return this;
    }

    public EntityFilterWhereInput addNOTItem(EntityFilterWhereInput NOTItem) {
        if (this.NOT == null) {
            this.NOT = new ArrayList<EntityFilterWhereInput>();
        }
        this.NOT.add(NOTItem);
        return this;
    }

    /**
     * Get NOT
     *
     * @return NOT
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<EntityFilterWhereInput> getNOT() {
        return NOT;
    }

    public void setNOT(List<EntityFilterWhereInput> NOT) {
        this.NOT = NOT;
    }

    public EntityFilterWhereInput NOT_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_N_O_T);
        return this;
    }

    public EntityFilterWhereInput NOT_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_N_O_T);
        return this;
    }

    public void setNOT_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_N_O_T);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_N_O_T);
        }
    }

    public boolean getNOT_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_N_O_T);
    }

    public EntityFilterWhereInput OR(List<EntityFilterWhereInput> OR) {

        this.OR = OR;
        return this;
    }

    public EntityFilterWhereInput addORItem(EntityFilterWhereInput ORItem) {
        if (this.OR == null) {
            this.OR = new ArrayList<EntityFilterWhereInput>();
        }
        this.OR.add(ORItem);
        return this;
    }

    /**
     * Get OR
     *
     * @return OR
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<EntityFilterWhereInput> getOR() {
        return OR;
    }

    public void setOR(List<EntityFilterWhereInput> OR) {
        this.OR = OR;
    }

    public EntityFilterWhereInput OR_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_O_R);
        return this;
    }

    public EntityFilterWhereInput OR_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_O_R);
        return this;
    }

    public void setOR_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_O_R);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_O_R);
        }
    }

    public boolean getOR_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_O_R);
    }

    public EntityFilterWhereInput applyToAllClusters(Boolean applyToAllClusters) {

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

    public EntityFilterWhereInput applyToAllClusters_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_APPLY_TO_ALL_CLUSTERS);
        return this;
    }

    public EntityFilterWhereInput applyToAllClusters_ExplictlyNonNull() {
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

    public EntityFilterWhereInput applyToAllClustersNot(Boolean applyToAllClustersNot) {

        this.applyToAllClustersNot = applyToAllClustersNot;
        return this;
    }

    /**
     * Get applyToAllClustersNot
     *
     * @return applyToAllClustersNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getApplyToAllClustersNot() {
        return applyToAllClustersNot;
    }

    public void setApplyToAllClustersNot(Boolean applyToAllClustersNot) {
        this.applyToAllClustersNot = applyToAllClustersNot;
    }

    public EntityFilterWhereInput applyToAllClustersNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_APPLY_TO_ALL_CLUSTERS_NOT);
        return this;
    }

    public EntityFilterWhereInput applyToAllClustersNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_APPLY_TO_ALL_CLUSTERS_NOT);
        return this;
    }

    public void setApplyToAllClustersNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_APPLY_TO_ALL_CLUSTERS_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_APPLY_TO_ALL_CLUSTERS_NOT);
        }
    }

    public boolean getApplyToAllClustersNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_APPLY_TO_ALL_CLUSTERS_NOT);
    }

    public EntityFilterWhereInput clustersEvery(ClusterWhereInput clustersEvery) {

        this.clustersEvery = clustersEvery;
        return this;
    }

    /**
     * Get clustersEvery
     *
     * @return clustersEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ClusterWhereInput getClustersEvery() {
        return clustersEvery;
    }

    public void setClustersEvery(ClusterWhereInput clustersEvery) {
        this.clustersEvery = clustersEvery;
    }

    public EntityFilterWhereInput clustersEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTERS_EVERY);
        return this;
    }

    public EntityFilterWhereInput clustersEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLUSTERS_EVERY);
        return this;
    }

    public void setClustersEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLUSTERS_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLUSTERS_EVERY);
        }
    }

    public boolean getClustersEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLUSTERS_EVERY);
    }

    public EntityFilterWhereInput clustersNone(ClusterWhereInput clustersNone) {

        this.clustersNone = clustersNone;
        return this;
    }

    /**
     * Get clustersNone
     *
     * @return clustersNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ClusterWhereInput getClustersNone() {
        return clustersNone;
    }

    public void setClustersNone(ClusterWhereInput clustersNone) {
        this.clustersNone = clustersNone;
    }

    public EntityFilterWhereInput clustersNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTERS_NONE);
        return this;
    }

    public EntityFilterWhereInput clustersNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLUSTERS_NONE);
        return this;
    }

    public void setClustersNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLUSTERS_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLUSTERS_NONE);
        }
    }

    public boolean getClustersNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLUSTERS_NONE);
    }

    public EntityFilterWhereInput clustersSome(ClusterWhereInput clustersSome) {

        this.clustersSome = clustersSome;
        return this;
    }

    /**
     * Get clustersSome
     *
     * @return clustersSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ClusterWhereInput getClustersSome() {
        return clustersSome;
    }

    public void setClustersSome(ClusterWhereInput clustersSome) {
        this.clustersSome = clustersSome;
    }

    public EntityFilterWhereInput clustersSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTERS_SOME);
        return this;
    }

    public EntityFilterWhereInput clustersSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLUSTERS_SOME);
        return this;
    }

    public void setClustersSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLUSTERS_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLUSTERS_SOME);
        }
    }

    public boolean getClustersSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLUSTERS_SOME);
    }

    public EntityFilterWhereInput entityType(EntityType entityType) {

        this.entityType = entityType;
        return this;
    }

    /**
     * Get entityType
     *
     * @return entityType
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public EntityType getEntityType() {
        return entityType;
    }

    public void setEntityType(EntityType entityType) {
        this.entityType = entityType;
    }

    public EntityFilterWhereInput entityType_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_TYPE);
        return this;
    }

    public EntityFilterWhereInput entityType_ExplictlyNonNull() {
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

    public EntityFilterWhereInput entityTypeIn(List<EntityType> entityTypeIn) {

        this.entityTypeIn = entityTypeIn;
        return this;
    }

    public EntityFilterWhereInput addEntityTypeInItem(EntityType entityTypeInItem) {
        if (this.entityTypeIn == null) {
            this.entityTypeIn = new ArrayList<EntityType>();
        }
        this.entityTypeIn.add(entityTypeInItem);
        return this;
    }

    /**
     * Get entityTypeIn
     *
     * @return entityTypeIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<EntityType> getEntityTypeIn() {
        return entityTypeIn;
    }

    public void setEntityTypeIn(List<EntityType> entityTypeIn) {
        this.entityTypeIn = entityTypeIn;
    }

    public EntityFilterWhereInput entityTypeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_TYPE_IN);
        return this;
    }

    public EntityFilterWhereInput entityTypeIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ENTITY_TYPE_IN);
        return this;
    }

    public void setEntityTypeIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ENTITY_TYPE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ENTITY_TYPE_IN);
        }
    }

    public boolean getEntityTypeIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ENTITY_TYPE_IN);
    }

    public EntityFilterWhereInput entityTypeNot(EntityType entityTypeNot) {

        this.entityTypeNot = entityTypeNot;
        return this;
    }

    /**
     * Get entityTypeNot
     *
     * @return entityTypeNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public EntityType getEntityTypeNot() {
        return entityTypeNot;
    }

    public void setEntityTypeNot(EntityType entityTypeNot) {
        this.entityTypeNot = entityTypeNot;
    }

    public EntityFilterWhereInput entityTypeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_TYPE_NOT);
        return this;
    }

    public EntityFilterWhereInput entityTypeNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ENTITY_TYPE_NOT);
        return this;
    }

    public void setEntityTypeNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ENTITY_TYPE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ENTITY_TYPE_NOT);
        }
    }

    public boolean getEntityTypeNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ENTITY_TYPE_NOT);
    }

    public EntityFilterWhereInput entityTypeNotIn(List<EntityType> entityTypeNotIn) {

        this.entityTypeNotIn = entityTypeNotIn;
        return this;
    }

    public EntityFilterWhereInput addEntityTypeNotInItem(EntityType entityTypeNotInItem) {
        if (this.entityTypeNotIn == null) {
            this.entityTypeNotIn = new ArrayList<EntityType>();
        }
        this.entityTypeNotIn.add(entityTypeNotInItem);
        return this;
    }

    /**
     * Get entityTypeNotIn
     *
     * @return entityTypeNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<EntityType> getEntityTypeNotIn() {
        return entityTypeNotIn;
    }

    public void setEntityTypeNotIn(List<EntityType> entityTypeNotIn) {
        this.entityTypeNotIn = entityTypeNotIn;
    }

    public EntityFilterWhereInput entityTypeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_TYPE_NOT_IN);
        return this;
    }

    public EntityFilterWhereInput entityTypeNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ENTITY_TYPE_NOT_IN);
        return this;
    }

    public void setEntityTypeNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ENTITY_TYPE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ENTITY_TYPE_NOT_IN);
        }
    }

    public boolean getEntityTypeNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ENTITY_TYPE_NOT_IN);
    }

    public EntityFilterWhereInput execFailedClusterEvery(ClusterWhereInput execFailedClusterEvery) {

        this.execFailedClusterEvery = execFailedClusterEvery;
        return this;
    }

    /**
     * Get execFailedClusterEvery
     *
     * @return execFailedClusterEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ClusterWhereInput getExecFailedClusterEvery() {
        return execFailedClusterEvery;
    }

    public void setExecFailedClusterEvery(ClusterWhereInput execFailedClusterEvery) {
        this.execFailedClusterEvery = execFailedClusterEvery;
    }

    public EntityFilterWhereInput execFailedClusterEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXEC_FAILED_CLUSTER_EVERY);
        return this;
    }

    public EntityFilterWhereInput execFailedClusterEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EXEC_FAILED_CLUSTER_EVERY);
        return this;
    }

    public void setExecFailedClusterEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EXEC_FAILED_CLUSTER_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EXEC_FAILED_CLUSTER_EVERY);
        }
    }

    public boolean getExecFailedClusterEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EXEC_FAILED_CLUSTER_EVERY);
    }

    public EntityFilterWhereInput execFailedClusterNone(ClusterWhereInput execFailedClusterNone) {

        this.execFailedClusterNone = execFailedClusterNone;
        return this;
    }

    /**
     * Get execFailedClusterNone
     *
     * @return execFailedClusterNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ClusterWhereInput getExecFailedClusterNone() {
        return execFailedClusterNone;
    }

    public void setExecFailedClusterNone(ClusterWhereInput execFailedClusterNone) {
        this.execFailedClusterNone = execFailedClusterNone;
    }

    public EntityFilterWhereInput execFailedClusterNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXEC_FAILED_CLUSTER_NONE);
        return this;
    }

    public EntityFilterWhereInput execFailedClusterNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EXEC_FAILED_CLUSTER_NONE);
        return this;
    }

    public void setExecFailedClusterNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EXEC_FAILED_CLUSTER_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EXEC_FAILED_CLUSTER_NONE);
        }
    }

    public boolean getExecFailedClusterNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EXEC_FAILED_CLUSTER_NONE);
    }

    public EntityFilterWhereInput execFailedClusterSome(ClusterWhereInput execFailedClusterSome) {

        this.execFailedClusterSome = execFailedClusterSome;
        return this;
    }

    /**
     * Get execFailedClusterSome
     *
     * @return execFailedClusterSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ClusterWhereInput getExecFailedClusterSome() {
        return execFailedClusterSome;
    }

    public void setExecFailedClusterSome(ClusterWhereInput execFailedClusterSome) {
        this.execFailedClusterSome = execFailedClusterSome;
    }

    public EntityFilterWhereInput execFailedClusterSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXEC_FAILED_CLUSTER_SOME);
        return this;
    }

    public EntityFilterWhereInput execFailedClusterSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EXEC_FAILED_CLUSTER_SOME);
        return this;
    }

    public void setExecFailedClusterSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EXEC_FAILED_CLUSTER_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EXEC_FAILED_CLUSTER_SOME);
        }
    }

    public boolean getExecFailedClusterSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EXEC_FAILED_CLUSTER_SOME);
    }

    public EntityFilterWhereInput filterStatus(FilterStatus filterStatus) {

        this.filterStatus = filterStatus;
        return this;
    }

    /**
     * Get filterStatus
     *
     * @return filterStatus
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public FilterStatus getFilterStatus() {
        return filterStatus;
    }

    public void setFilterStatus(FilterStatus filterStatus) {
        this.filterStatus = filterStatus;
    }

    public EntityFilterWhereInput filterStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FILTER_STATUS);
        return this;
    }

    public EntityFilterWhereInput filterStatus_ExplictlyNonNull() {
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

    public EntityFilterWhereInput filterStatusIn(List<FilterStatus> filterStatusIn) {

        this.filterStatusIn = filterStatusIn;
        return this;
    }

    public EntityFilterWhereInput addFilterStatusInItem(FilterStatus filterStatusInItem) {
        if (this.filterStatusIn == null) {
            this.filterStatusIn = new ArrayList<FilterStatus>();
        }
        this.filterStatusIn.add(filterStatusInItem);
        return this;
    }

    /**
     * Get filterStatusIn
     *
     * @return filterStatusIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<FilterStatus> getFilterStatusIn() {
        return filterStatusIn;
    }

    public void setFilterStatusIn(List<FilterStatus> filterStatusIn) {
        this.filterStatusIn = filterStatusIn;
    }

    public EntityFilterWhereInput filterStatusIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FILTER_STATUS_IN);
        return this;
    }

    public EntityFilterWhereInput filterStatusIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FILTER_STATUS_IN);
        return this;
    }

    public void setFilterStatusIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FILTER_STATUS_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FILTER_STATUS_IN);
        }
    }

    public boolean getFilterStatusIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FILTER_STATUS_IN);
    }

    public EntityFilterWhereInput filterStatusNot(FilterStatus filterStatusNot) {

        this.filterStatusNot = filterStatusNot;
        return this;
    }

    /**
     * Get filterStatusNot
     *
     * @return filterStatusNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public FilterStatus getFilterStatusNot() {
        return filterStatusNot;
    }

    public void setFilterStatusNot(FilterStatus filterStatusNot) {
        this.filterStatusNot = filterStatusNot;
    }

    public EntityFilterWhereInput filterStatusNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FILTER_STATUS_NOT);
        return this;
    }

    public EntityFilterWhereInput filterStatusNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FILTER_STATUS_NOT);
        return this;
    }

    public void setFilterStatusNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FILTER_STATUS_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FILTER_STATUS_NOT);
        }
    }

    public boolean getFilterStatusNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FILTER_STATUS_NOT);
    }

    public EntityFilterWhereInput filterStatusNotIn(List<FilterStatus> filterStatusNotIn) {

        this.filterStatusNotIn = filterStatusNotIn;
        return this;
    }

    public EntityFilterWhereInput addFilterStatusNotInItem(FilterStatus filterStatusNotInItem) {
        if (this.filterStatusNotIn == null) {
            this.filterStatusNotIn = new ArrayList<FilterStatus>();
        }
        this.filterStatusNotIn.add(filterStatusNotInItem);
        return this;
    }

    /**
     * Get filterStatusNotIn
     *
     * @return filterStatusNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<FilterStatus> getFilterStatusNotIn() {
        return filterStatusNotIn;
    }

    public void setFilterStatusNotIn(List<FilterStatus> filterStatusNotIn) {
        this.filterStatusNotIn = filterStatusNotIn;
    }

    public EntityFilterWhereInput filterStatusNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FILTER_STATUS_NOT_IN);
        return this;
    }

    public EntityFilterWhereInput filterStatusNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FILTER_STATUS_NOT_IN);
        return this;
    }

    public void setFilterStatusNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FILTER_STATUS_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FILTER_STATUS_NOT_IN);
        }
    }

    public boolean getFilterStatusNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FILTER_STATUS_NOT_IN);
    }

    public EntityFilterWhereInput id(String id) {

        this.id = id;
        return this;
    }

    /**
     * Get id
     *
     * @return id
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public EntityFilterWhereInput id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public EntityFilterWhereInput id_ExplictlyNonNull() {
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

    public EntityFilterWhereInput idContains(String idContains) {

        this.idContains = idContains;
        return this;
    }

    /**
     * Get idContains
     *
     * @return idContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIdContains() {
        return idContains;
    }

    public void setIdContains(String idContains) {
        this.idContains = idContains;
    }

    public EntityFilterWhereInput idContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_CONTAINS);
        return this;
    }

    public EntityFilterWhereInput idContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_CONTAINS);
        return this;
    }

    public void setIdContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_CONTAINS);
        }
    }

    public boolean getIdContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_CONTAINS);
    }

    public EntityFilterWhereInput idEndsWith(String idEndsWith) {

        this.idEndsWith = idEndsWith;
        return this;
    }

    /**
     * Get idEndsWith
     *
     * @return idEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIdEndsWith() {
        return idEndsWith;
    }

    public void setIdEndsWith(String idEndsWith) {
        this.idEndsWith = idEndsWith;
    }

    public EntityFilterWhereInput idEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_ENDS_WITH);
        return this;
    }

    public EntityFilterWhereInput idEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_ENDS_WITH);
        return this;
    }

    public void setIdEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_ENDS_WITH);
        }
    }

    public boolean getIdEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_ENDS_WITH);
    }

    public EntityFilterWhereInput idGt(String idGt) {

        this.idGt = idGt;
        return this;
    }

    /**
     * Get idGt
     *
     * @return idGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIdGt() {
        return idGt;
    }

    public void setIdGt(String idGt) {
        this.idGt = idGt;
    }

    public EntityFilterWhereInput idGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GT);
        return this;
    }

    public EntityFilterWhereInput idGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_GT);
        return this;
    }

    public void setIdGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_GT);
        }
    }

    public boolean getIdGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_GT);
    }

    public EntityFilterWhereInput idGte(String idGte) {

        this.idGte = idGte;
        return this;
    }

    /**
     * Get idGte
     *
     * @return idGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIdGte() {
        return idGte;
    }

    public void setIdGte(String idGte) {
        this.idGte = idGte;
    }

    public EntityFilterWhereInput idGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GTE);
        return this;
    }

    public EntityFilterWhereInput idGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_GTE);
        return this;
    }

    public void setIdGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_GTE);
        }
    }

    public boolean getIdGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_GTE);
    }

    public EntityFilterWhereInput idIn(List<String> idIn) {

        this.idIn = idIn;
        return this;
    }

    public EntityFilterWhereInput addIdInItem(String idInItem) {
        if (this.idIn == null) {
            this.idIn = new ArrayList<String>();
        }
        this.idIn.add(idInItem);
        return this;
    }

    /**
     * Get idIn
     *
     * @return idIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getIdIn() {
        return idIn;
    }

    public void setIdIn(List<String> idIn) {
        this.idIn = idIn;
    }

    public EntityFilterWhereInput idIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_IN);
        return this;
    }

    public EntityFilterWhereInput idIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_IN);
        return this;
    }

    public void setIdIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_IN);
        }
    }

    public boolean getIdIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_IN);
    }

    public EntityFilterWhereInput idLt(String idLt) {

        this.idLt = idLt;
        return this;
    }

    /**
     * Get idLt
     *
     * @return idLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIdLt() {
        return idLt;
    }

    public void setIdLt(String idLt) {
        this.idLt = idLt;
    }

    public EntityFilterWhereInput idLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LT);
        return this;
    }

    public EntityFilterWhereInput idLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_LT);
        return this;
    }

    public void setIdLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_LT);
        }
    }

    public boolean getIdLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_LT);
    }

    public EntityFilterWhereInput idLte(String idLte) {

        this.idLte = idLte;
        return this;
    }

    /**
     * Get idLte
     *
     * @return idLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIdLte() {
        return idLte;
    }

    public void setIdLte(String idLte) {
        this.idLte = idLte;
    }

    public EntityFilterWhereInput idLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LTE);
        return this;
    }

    public EntityFilterWhereInput idLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_LTE);
        return this;
    }

    public void setIdLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_LTE);
        }
    }

    public boolean getIdLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_LTE);
    }

    public EntityFilterWhereInput idNot(String idNot) {

        this.idNot = idNot;
        return this;
    }

    /**
     * Get idNot
     *
     * @return idNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIdNot() {
        return idNot;
    }

    public void setIdNot(String idNot) {
        this.idNot = idNot;
    }

    public EntityFilterWhereInput idNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT);
        return this;
    }

    public EntityFilterWhereInput idNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_NOT);
        return this;
    }

    public void setIdNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_NOT);
        }
    }

    public boolean getIdNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_NOT);
    }

    public EntityFilterWhereInput idNotContains(String idNotContains) {

        this.idNotContains = idNotContains;
        return this;
    }

    /**
     * Get idNotContains
     *
     * @return idNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIdNotContains() {
        return idNotContains;
    }

    public void setIdNotContains(String idNotContains) {
        this.idNotContains = idNotContains;
    }

    public EntityFilterWhereInput idNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_CONTAINS);
        return this;
    }

    public EntityFilterWhereInput idNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_NOT_CONTAINS);
        return this;
    }

    public void setIdNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_NOT_CONTAINS);
        }
    }

    public boolean getIdNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_NOT_CONTAINS);
    }

    public EntityFilterWhereInput idNotEndsWith(String idNotEndsWith) {

        this.idNotEndsWith = idNotEndsWith;
        return this;
    }

    /**
     * Get idNotEndsWith
     *
     * @return idNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIdNotEndsWith() {
        return idNotEndsWith;
    }

    public void setIdNotEndsWith(String idNotEndsWith) {
        this.idNotEndsWith = idNotEndsWith;
    }

    public EntityFilterWhereInput idNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
        return this;
    }

    public EntityFilterWhereInput idNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
        return this;
    }

    public void setIdNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
        }
    }

    public boolean getIdNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
    }

    public EntityFilterWhereInput idNotIn(List<String> idNotIn) {

        this.idNotIn = idNotIn;
        return this;
    }

    public EntityFilterWhereInput addIdNotInItem(String idNotInItem) {
        if (this.idNotIn == null) {
            this.idNotIn = new ArrayList<String>();
        }
        this.idNotIn.add(idNotInItem);
        return this;
    }

    /**
     * Get idNotIn
     *
     * @return idNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getIdNotIn() {
        return idNotIn;
    }

    public void setIdNotIn(List<String> idNotIn) {
        this.idNotIn = idNotIn;
    }

    public EntityFilterWhereInput idNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_IN);
        return this;
    }

    public EntityFilterWhereInput idNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_NOT_IN);
        return this;
    }

    public void setIdNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_NOT_IN);
        }
    }

    public boolean getIdNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_NOT_IN);
    }

    public EntityFilterWhereInput idNotStartsWith(String idNotStartsWith) {

        this.idNotStartsWith = idNotStartsWith;
        return this;
    }

    /**
     * Get idNotStartsWith
     *
     * @return idNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIdNotStartsWith() {
        return idNotStartsWith;
    }

    public void setIdNotStartsWith(String idNotStartsWith) {
        this.idNotStartsWith = idNotStartsWith;
    }

    public EntityFilterWhereInput idNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
        return this;
    }

    public EntityFilterWhereInput idNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
        return this;
    }

    public void setIdNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
        }
    }

    public boolean getIdNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
    }

    public EntityFilterWhereInput idStartsWith(String idStartsWith) {

        this.idStartsWith = idStartsWith;
        return this;
    }

    /**
     * Get idStartsWith
     *
     * @return idStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIdStartsWith() {
        return idStartsWith;
    }

    public void setIdStartsWith(String idStartsWith) {
        this.idStartsWith = idStartsWith;
    }

    public EntityFilterWhereInput idStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_STARTS_WITH);
        return this;
    }

    public EntityFilterWhereInput idStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_STARTS_WITH);
        return this;
    }

    public void setIdStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_STARTS_WITH);
        }
    }

    public boolean getIdStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_STARTS_WITH);
    }

    public EntityFilterWhereInput lastExecutedAt(String lastExecutedAt) {

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

    public EntityFilterWhereInput lastExecutedAt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTED_AT);
        return this;
    }

    public EntityFilterWhereInput lastExecutedAt_ExplictlyNonNull() {
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

    public EntityFilterWhereInput lastExecutedAtGt(String lastExecutedAtGt) {

        this.lastExecutedAtGt = lastExecutedAtGt;
        return this;
    }

    /**
     * Get lastExecutedAtGt
     *
     * @return lastExecutedAtGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLastExecutedAtGt() {
        return lastExecutedAtGt;
    }

    public void setLastExecutedAtGt(String lastExecutedAtGt) {
        this.lastExecutedAtGt = lastExecutedAtGt;
    }

    public EntityFilterWhereInput lastExecutedAtGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTED_AT_GT);
        return this;
    }

    public EntityFilterWhereInput lastExecutedAtGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTED_AT_GT);
        return this;
    }

    public void setLastExecutedAtGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTED_AT_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTED_AT_GT);
        }
    }

    public boolean getLastExecutedAtGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LAST_EXECUTED_AT_GT);
    }

    public EntityFilterWhereInput lastExecutedAtGte(String lastExecutedAtGte) {

        this.lastExecutedAtGte = lastExecutedAtGte;
        return this;
    }

    /**
     * Get lastExecutedAtGte
     *
     * @return lastExecutedAtGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLastExecutedAtGte() {
        return lastExecutedAtGte;
    }

    public void setLastExecutedAtGte(String lastExecutedAtGte) {
        this.lastExecutedAtGte = lastExecutedAtGte;
    }

    public EntityFilterWhereInput lastExecutedAtGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTED_AT_GTE);
        return this;
    }

    public EntityFilterWhereInput lastExecutedAtGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTED_AT_GTE);
        return this;
    }

    public void setLastExecutedAtGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTED_AT_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTED_AT_GTE);
        }
    }

    public boolean getLastExecutedAtGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LAST_EXECUTED_AT_GTE);
    }

    public EntityFilterWhereInput lastExecutedAtIn(List<String> lastExecutedAtIn) {

        this.lastExecutedAtIn = lastExecutedAtIn;
        return this;
    }

    public EntityFilterWhereInput addLastExecutedAtInItem(String lastExecutedAtInItem) {
        if (this.lastExecutedAtIn == null) {
            this.lastExecutedAtIn = new ArrayList<String>();
        }
        this.lastExecutedAtIn.add(lastExecutedAtInItem);
        return this;
    }

    /**
     * Get lastExecutedAtIn
     *
     * @return lastExecutedAtIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getLastExecutedAtIn() {
        return lastExecutedAtIn;
    }

    public void setLastExecutedAtIn(List<String> lastExecutedAtIn) {
        this.lastExecutedAtIn = lastExecutedAtIn;
    }

    public EntityFilterWhereInput lastExecutedAtIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTED_AT_IN);
        return this;
    }

    public EntityFilterWhereInput lastExecutedAtIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTED_AT_IN);
        return this;
    }

    public void setLastExecutedAtIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTED_AT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTED_AT_IN);
        }
    }

    public boolean getLastExecutedAtIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LAST_EXECUTED_AT_IN);
    }

    public EntityFilterWhereInput lastExecutedAtLt(String lastExecutedAtLt) {

        this.lastExecutedAtLt = lastExecutedAtLt;
        return this;
    }

    /**
     * Get lastExecutedAtLt
     *
     * @return lastExecutedAtLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLastExecutedAtLt() {
        return lastExecutedAtLt;
    }

    public void setLastExecutedAtLt(String lastExecutedAtLt) {
        this.lastExecutedAtLt = lastExecutedAtLt;
    }

    public EntityFilterWhereInput lastExecutedAtLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTED_AT_LT);
        return this;
    }

    public EntityFilterWhereInput lastExecutedAtLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTED_AT_LT);
        return this;
    }

    public void setLastExecutedAtLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTED_AT_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTED_AT_LT);
        }
    }

    public boolean getLastExecutedAtLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LAST_EXECUTED_AT_LT);
    }

    public EntityFilterWhereInput lastExecutedAtLte(String lastExecutedAtLte) {

        this.lastExecutedAtLte = lastExecutedAtLte;
        return this;
    }

    /**
     * Get lastExecutedAtLte
     *
     * @return lastExecutedAtLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLastExecutedAtLte() {
        return lastExecutedAtLte;
    }

    public void setLastExecutedAtLte(String lastExecutedAtLte) {
        this.lastExecutedAtLte = lastExecutedAtLte;
    }

    public EntityFilterWhereInput lastExecutedAtLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTED_AT_LTE);
        return this;
    }

    public EntityFilterWhereInput lastExecutedAtLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTED_AT_LTE);
        return this;
    }

    public void setLastExecutedAtLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTED_AT_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTED_AT_LTE);
        }
    }

    public boolean getLastExecutedAtLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LAST_EXECUTED_AT_LTE);
    }

    public EntityFilterWhereInput lastExecutedAtNot(String lastExecutedAtNot) {

        this.lastExecutedAtNot = lastExecutedAtNot;
        return this;
    }

    /**
     * Get lastExecutedAtNot
     *
     * @return lastExecutedAtNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLastExecutedAtNot() {
        return lastExecutedAtNot;
    }

    public void setLastExecutedAtNot(String lastExecutedAtNot) {
        this.lastExecutedAtNot = lastExecutedAtNot;
    }

    public EntityFilterWhereInput lastExecutedAtNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTED_AT_NOT);
        return this;
    }

    public EntityFilterWhereInput lastExecutedAtNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTED_AT_NOT);
        return this;
    }

    public void setLastExecutedAtNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTED_AT_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTED_AT_NOT);
        }
    }

    public boolean getLastExecutedAtNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LAST_EXECUTED_AT_NOT);
    }

    public EntityFilterWhereInput lastExecutedAtNotIn(List<String> lastExecutedAtNotIn) {

        this.lastExecutedAtNotIn = lastExecutedAtNotIn;
        return this;
    }

    public EntityFilterWhereInput addLastExecutedAtNotInItem(String lastExecutedAtNotInItem) {
        if (this.lastExecutedAtNotIn == null) {
            this.lastExecutedAtNotIn = new ArrayList<String>();
        }
        this.lastExecutedAtNotIn.add(lastExecutedAtNotInItem);
        return this;
    }

    /**
     * Get lastExecutedAtNotIn
     *
     * @return lastExecutedAtNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getLastExecutedAtNotIn() {
        return lastExecutedAtNotIn;
    }

    public void setLastExecutedAtNotIn(List<String> lastExecutedAtNotIn) {
        this.lastExecutedAtNotIn = lastExecutedAtNotIn;
    }

    public EntityFilterWhereInput lastExecutedAtNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTED_AT_NOT_IN);
        return this;
    }

    public EntityFilterWhereInput lastExecutedAtNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTED_AT_NOT_IN);
        return this;
    }

    public void setLastExecutedAtNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTED_AT_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTED_AT_NOT_IN);
        }
    }

    public boolean getLastExecutedAtNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LAST_EXECUTED_AT_NOT_IN);
    }

    public EntityFilterWhereInput name(String name) {

        this.name = name;
        return this;
    }

    /**
     * Get name
     *
     * @return name
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EntityFilterWhereInput name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public EntityFilterWhereInput name_ExplictlyNonNull() {
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

    public EntityFilterWhereInput nameContains(String nameContains) {

        this.nameContains = nameContains;
        return this;
    }

    /**
     * Get nameContains
     *
     * @return nameContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNameContains() {
        return nameContains;
    }

    public void setNameContains(String nameContains) {
        this.nameContains = nameContains;
    }

    public EntityFilterWhereInput nameContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_CONTAINS);
        return this;
    }

    public EntityFilterWhereInput nameContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_CONTAINS);
        return this;
    }

    public void setNameContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_CONTAINS);
        }
    }

    public boolean getNameContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_CONTAINS);
    }

    public EntityFilterWhereInput nameEndsWith(String nameEndsWith) {

        this.nameEndsWith = nameEndsWith;
        return this;
    }

    /**
     * Get nameEndsWith
     *
     * @return nameEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNameEndsWith() {
        return nameEndsWith;
    }

    public void setNameEndsWith(String nameEndsWith) {
        this.nameEndsWith = nameEndsWith;
    }

    public EntityFilterWhereInput nameEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_ENDS_WITH);
        return this;
    }

    public EntityFilterWhereInput nameEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_ENDS_WITH);
        return this;
    }

    public void setNameEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_ENDS_WITH);
        }
    }

    public boolean getNameEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_ENDS_WITH);
    }

    public EntityFilterWhereInput nameGt(String nameGt) {

        this.nameGt = nameGt;
        return this;
    }

    /**
     * Get nameGt
     *
     * @return nameGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNameGt() {
        return nameGt;
    }

    public void setNameGt(String nameGt) {
        this.nameGt = nameGt;
    }

    public EntityFilterWhereInput nameGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_GT);
        return this;
    }

    public EntityFilterWhereInput nameGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_GT);
        return this;
    }

    public void setNameGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_GT);
        }
    }

    public boolean getNameGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_GT);
    }

    public EntityFilterWhereInput nameGte(String nameGte) {

        this.nameGte = nameGte;
        return this;
    }

    /**
     * Get nameGte
     *
     * @return nameGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNameGte() {
        return nameGte;
    }

    public void setNameGte(String nameGte) {
        this.nameGte = nameGte;
    }

    public EntityFilterWhereInput nameGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_GTE);
        return this;
    }

    public EntityFilterWhereInput nameGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_GTE);
        return this;
    }

    public void setNameGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_GTE);
        }
    }

    public boolean getNameGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_GTE);
    }

    public EntityFilterWhereInput nameIn(List<String> nameIn) {

        this.nameIn = nameIn;
        return this;
    }

    public EntityFilterWhereInput addNameInItem(String nameInItem) {
        if (this.nameIn == null) {
            this.nameIn = new ArrayList<String>();
        }
        this.nameIn.add(nameInItem);
        return this;
    }

    /**
     * Get nameIn
     *
     * @return nameIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getNameIn() {
        return nameIn;
    }

    public void setNameIn(List<String> nameIn) {
        this.nameIn = nameIn;
    }

    public EntityFilterWhereInput nameIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_IN);
        return this;
    }

    public EntityFilterWhereInput nameIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_IN);
        return this;
    }

    public void setNameIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_IN);
        }
    }

    public boolean getNameIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_IN);
    }

    public EntityFilterWhereInput nameLt(String nameLt) {

        this.nameLt = nameLt;
        return this;
    }

    /**
     * Get nameLt
     *
     * @return nameLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNameLt() {
        return nameLt;
    }

    public void setNameLt(String nameLt) {
        this.nameLt = nameLt;
    }

    public EntityFilterWhereInput nameLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_LT);
        return this;
    }

    public EntityFilterWhereInput nameLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_LT);
        return this;
    }

    public void setNameLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_LT);
        }
    }

    public boolean getNameLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_LT);
    }

    public EntityFilterWhereInput nameLte(String nameLte) {

        this.nameLte = nameLte;
        return this;
    }

    /**
     * Get nameLte
     *
     * @return nameLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNameLte() {
        return nameLte;
    }

    public void setNameLte(String nameLte) {
        this.nameLte = nameLte;
    }

    public EntityFilterWhereInput nameLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_LTE);
        return this;
    }

    public EntityFilterWhereInput nameLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_LTE);
        return this;
    }

    public void setNameLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_LTE);
        }
    }

    public boolean getNameLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_LTE);
    }

    public EntityFilterWhereInput nameNot(String nameNot) {

        this.nameNot = nameNot;
        return this;
    }

    /**
     * Get nameNot
     *
     * @return nameNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNameNot() {
        return nameNot;
    }

    public void setNameNot(String nameNot) {
        this.nameNot = nameNot;
    }

    public EntityFilterWhereInput nameNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT);
        return this;
    }

    public EntityFilterWhereInput nameNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_NOT);
        return this;
    }

    public void setNameNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_NOT);
        }
    }

    public boolean getNameNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_NOT);
    }

    public EntityFilterWhereInput nameNotContains(String nameNotContains) {

        this.nameNotContains = nameNotContains;
        return this;
    }

    /**
     * Get nameNotContains
     *
     * @return nameNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNameNotContains() {
        return nameNotContains;
    }

    public void setNameNotContains(String nameNotContains) {
        this.nameNotContains = nameNotContains;
    }

    public EntityFilterWhereInput nameNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_CONTAINS);
        return this;
    }

    public EntityFilterWhereInput nameNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_NOT_CONTAINS);
        return this;
    }

    public void setNameNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_NOT_CONTAINS);
        }
    }

    public boolean getNameNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_NOT_CONTAINS);
    }

    public EntityFilterWhereInput nameNotEndsWith(String nameNotEndsWith) {

        this.nameNotEndsWith = nameNotEndsWith;
        return this;
    }

    /**
     * Get nameNotEndsWith
     *
     * @return nameNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNameNotEndsWith() {
        return nameNotEndsWith;
    }

    public void setNameNotEndsWith(String nameNotEndsWith) {
        this.nameNotEndsWith = nameNotEndsWith;
    }

    public EntityFilterWhereInput nameNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_ENDS_WITH);
        return this;
    }

    public EntityFilterWhereInput nameNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_NOT_ENDS_WITH);
        return this;
    }

    public void setNameNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_NOT_ENDS_WITH);
        }
    }

    public boolean getNameNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_NOT_ENDS_WITH);
    }

    public EntityFilterWhereInput nameNotIn(List<String> nameNotIn) {

        this.nameNotIn = nameNotIn;
        return this;
    }

    public EntityFilterWhereInput addNameNotInItem(String nameNotInItem) {
        if (this.nameNotIn == null) {
            this.nameNotIn = new ArrayList<String>();
        }
        this.nameNotIn.add(nameNotInItem);
        return this;
    }

    /**
     * Get nameNotIn
     *
     * @return nameNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getNameNotIn() {
        return nameNotIn;
    }

    public void setNameNotIn(List<String> nameNotIn) {
        this.nameNotIn = nameNotIn;
    }

    public EntityFilterWhereInput nameNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_IN);
        return this;
    }

    public EntityFilterWhereInput nameNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_NOT_IN);
        return this;
    }

    public void setNameNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_NOT_IN);
        }
    }

    public boolean getNameNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_NOT_IN);
    }

    public EntityFilterWhereInput nameNotStartsWith(String nameNotStartsWith) {

        this.nameNotStartsWith = nameNotStartsWith;
        return this;
    }

    /**
     * Get nameNotStartsWith
     *
     * @return nameNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNameNotStartsWith() {
        return nameNotStartsWith;
    }

    public void setNameNotStartsWith(String nameNotStartsWith) {
        this.nameNotStartsWith = nameNotStartsWith;
    }

    public EntityFilterWhereInput nameNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_STARTS_WITH);
        return this;
    }

    public EntityFilterWhereInput nameNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_NOT_STARTS_WITH);
        return this;
    }

    public void setNameNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_NOT_STARTS_WITH);
        }
    }

    public boolean getNameNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_NOT_STARTS_WITH);
    }

    public EntityFilterWhereInput nameStartsWith(String nameStartsWith) {

        this.nameStartsWith = nameStartsWith;
        return this;
    }

    /**
     * Get nameStartsWith
     *
     * @return nameStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNameStartsWith() {
        return nameStartsWith;
    }

    public void setNameStartsWith(String nameStartsWith) {
        this.nameStartsWith = nameStartsWith;
    }

    public EntityFilterWhereInput nameStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_STARTS_WITH);
        return this;
    }

    public EntityFilterWhereInput nameStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_STARTS_WITH);
        return this;
    }

    public void setNameStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_STARTS_WITH);
        }
    }

    public boolean getNameStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_STARTS_WITH);
    }

    public EntityFilterWhereInput preset(String preset) {

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

    public EntityFilterWhereInput preset_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRESET);
        return this;
    }

    public EntityFilterWhereInput preset_ExplictlyNonNull() {
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

    public EntityFilterWhereInput presetContains(String presetContains) {

        this.presetContains = presetContains;
        return this;
    }

    /**
     * Get presetContains
     *
     * @return presetContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPresetContains() {
        return presetContains;
    }

    public void setPresetContains(String presetContains) {
        this.presetContains = presetContains;
    }

    public EntityFilterWhereInput presetContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRESET_CONTAINS);
        return this;
    }

    public EntityFilterWhereInput presetContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRESET_CONTAINS);
        return this;
    }

    public void setPresetContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRESET_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRESET_CONTAINS);
        }
    }

    public boolean getPresetContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRESET_CONTAINS);
    }

    public EntityFilterWhereInput presetEndsWith(String presetEndsWith) {

        this.presetEndsWith = presetEndsWith;
        return this;
    }

    /**
     * Get presetEndsWith
     *
     * @return presetEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPresetEndsWith() {
        return presetEndsWith;
    }

    public void setPresetEndsWith(String presetEndsWith) {
        this.presetEndsWith = presetEndsWith;
    }

    public EntityFilterWhereInput presetEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRESET_ENDS_WITH);
        return this;
    }

    public EntityFilterWhereInput presetEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRESET_ENDS_WITH);
        return this;
    }

    public void setPresetEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRESET_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRESET_ENDS_WITH);
        }
    }

    public boolean getPresetEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRESET_ENDS_WITH);
    }

    public EntityFilterWhereInput presetGt(String presetGt) {

        this.presetGt = presetGt;
        return this;
    }

    /**
     * Get presetGt
     *
     * @return presetGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPresetGt() {
        return presetGt;
    }

    public void setPresetGt(String presetGt) {
        this.presetGt = presetGt;
    }

    public EntityFilterWhereInput presetGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRESET_GT);
        return this;
    }

    public EntityFilterWhereInput presetGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRESET_GT);
        return this;
    }

    public void setPresetGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRESET_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRESET_GT);
        }
    }

    public boolean getPresetGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRESET_GT);
    }

    public EntityFilterWhereInput presetGte(String presetGte) {

        this.presetGte = presetGte;
        return this;
    }

    /**
     * Get presetGte
     *
     * @return presetGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPresetGte() {
        return presetGte;
    }

    public void setPresetGte(String presetGte) {
        this.presetGte = presetGte;
    }

    public EntityFilterWhereInput presetGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRESET_GTE);
        return this;
    }

    public EntityFilterWhereInput presetGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRESET_GTE);
        return this;
    }

    public void setPresetGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRESET_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRESET_GTE);
        }
    }

    public boolean getPresetGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRESET_GTE);
    }

    public EntityFilterWhereInput presetIn(List<String> presetIn) {

        this.presetIn = presetIn;
        return this;
    }

    public EntityFilterWhereInput addPresetInItem(String presetInItem) {
        if (this.presetIn == null) {
            this.presetIn = new ArrayList<String>();
        }
        this.presetIn.add(presetInItem);
        return this;
    }

    /**
     * Get presetIn
     *
     * @return presetIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getPresetIn() {
        return presetIn;
    }

    public void setPresetIn(List<String> presetIn) {
        this.presetIn = presetIn;
    }

    public EntityFilterWhereInput presetIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRESET_IN);
        return this;
    }

    public EntityFilterWhereInput presetIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRESET_IN);
        return this;
    }

    public void setPresetIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRESET_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRESET_IN);
        }
    }

    public boolean getPresetIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRESET_IN);
    }

    public EntityFilterWhereInput presetLt(String presetLt) {

        this.presetLt = presetLt;
        return this;
    }

    /**
     * Get presetLt
     *
     * @return presetLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPresetLt() {
        return presetLt;
    }

    public void setPresetLt(String presetLt) {
        this.presetLt = presetLt;
    }

    public EntityFilterWhereInput presetLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRESET_LT);
        return this;
    }

    public EntityFilterWhereInput presetLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRESET_LT);
        return this;
    }

    public void setPresetLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRESET_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRESET_LT);
        }
    }

    public boolean getPresetLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRESET_LT);
    }

    public EntityFilterWhereInput presetLte(String presetLte) {

        this.presetLte = presetLte;
        return this;
    }

    /**
     * Get presetLte
     *
     * @return presetLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPresetLte() {
        return presetLte;
    }

    public void setPresetLte(String presetLte) {
        this.presetLte = presetLte;
    }

    public EntityFilterWhereInput presetLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRESET_LTE);
        return this;
    }

    public EntityFilterWhereInput presetLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRESET_LTE);
        return this;
    }

    public void setPresetLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRESET_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRESET_LTE);
        }
    }

    public boolean getPresetLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRESET_LTE);
    }

    public EntityFilterWhereInput presetNot(String presetNot) {

        this.presetNot = presetNot;
        return this;
    }

    /**
     * Get presetNot
     *
     * @return presetNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPresetNot() {
        return presetNot;
    }

    public void setPresetNot(String presetNot) {
        this.presetNot = presetNot;
    }

    public EntityFilterWhereInput presetNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRESET_NOT);
        return this;
    }

    public EntityFilterWhereInput presetNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRESET_NOT);
        return this;
    }

    public void setPresetNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRESET_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRESET_NOT);
        }
    }

    public boolean getPresetNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRESET_NOT);
    }

    public EntityFilterWhereInput presetNotContains(String presetNotContains) {

        this.presetNotContains = presetNotContains;
        return this;
    }

    /**
     * Get presetNotContains
     *
     * @return presetNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPresetNotContains() {
        return presetNotContains;
    }

    public void setPresetNotContains(String presetNotContains) {
        this.presetNotContains = presetNotContains;
    }

    public EntityFilterWhereInput presetNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRESET_NOT_CONTAINS);
        return this;
    }

    public EntityFilterWhereInput presetNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRESET_NOT_CONTAINS);
        return this;
    }

    public void setPresetNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRESET_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRESET_NOT_CONTAINS);
        }
    }

    public boolean getPresetNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRESET_NOT_CONTAINS);
    }

    public EntityFilterWhereInput presetNotEndsWith(String presetNotEndsWith) {

        this.presetNotEndsWith = presetNotEndsWith;
        return this;
    }

    /**
     * Get presetNotEndsWith
     *
     * @return presetNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPresetNotEndsWith() {
        return presetNotEndsWith;
    }

    public void setPresetNotEndsWith(String presetNotEndsWith) {
        this.presetNotEndsWith = presetNotEndsWith;
    }

    public EntityFilterWhereInput presetNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRESET_NOT_ENDS_WITH);
        return this;
    }

    public EntityFilterWhereInput presetNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRESET_NOT_ENDS_WITH);
        return this;
    }

    public void setPresetNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRESET_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRESET_NOT_ENDS_WITH);
        }
    }

    public boolean getPresetNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRESET_NOT_ENDS_WITH);
    }

    public EntityFilterWhereInput presetNotIn(List<String> presetNotIn) {

        this.presetNotIn = presetNotIn;
        return this;
    }

    public EntityFilterWhereInput addPresetNotInItem(String presetNotInItem) {
        if (this.presetNotIn == null) {
            this.presetNotIn = new ArrayList<String>();
        }
        this.presetNotIn.add(presetNotInItem);
        return this;
    }

    /**
     * Get presetNotIn
     *
     * @return presetNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getPresetNotIn() {
        return presetNotIn;
    }

    public void setPresetNotIn(List<String> presetNotIn) {
        this.presetNotIn = presetNotIn;
    }

    public EntityFilterWhereInput presetNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRESET_NOT_IN);
        return this;
    }

    public EntityFilterWhereInput presetNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRESET_NOT_IN);
        return this;
    }

    public void setPresetNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRESET_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRESET_NOT_IN);
        }
    }

    public boolean getPresetNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRESET_NOT_IN);
    }

    public EntityFilterWhereInput presetNotStartsWith(String presetNotStartsWith) {

        this.presetNotStartsWith = presetNotStartsWith;
        return this;
    }

    /**
     * Get presetNotStartsWith
     *
     * @return presetNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPresetNotStartsWith() {
        return presetNotStartsWith;
    }

    public void setPresetNotStartsWith(String presetNotStartsWith) {
        this.presetNotStartsWith = presetNotStartsWith;
    }

    public EntityFilterWhereInput presetNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRESET_NOT_STARTS_WITH);
        return this;
    }

    public EntityFilterWhereInput presetNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRESET_NOT_STARTS_WITH);
        return this;
    }

    public void setPresetNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRESET_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRESET_NOT_STARTS_WITH);
        }
    }

    public boolean getPresetNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRESET_NOT_STARTS_WITH);
    }

    public EntityFilterWhereInput presetStartsWith(String presetStartsWith) {

        this.presetStartsWith = presetStartsWith;
        return this;
    }

    /**
     * Get presetStartsWith
     *
     * @return presetStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPresetStartsWith() {
        return presetStartsWith;
    }

    public void setPresetStartsWith(String presetStartsWith) {
        this.presetStartsWith = presetStartsWith;
    }

    public EntityFilterWhereInput presetStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRESET_STARTS_WITH);
        return this;
    }

    public EntityFilterWhereInput presetStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRESET_STARTS_WITH);
        return this;
    }

    public void setPresetStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRESET_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRESET_STARTS_WITH);
        }
    }

    public boolean getPresetStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRESET_STARTS_WITH);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EntityFilterWhereInput entityFilterWhereInput = (EntityFilterWhereInput) o;
        return Objects.equals(this.AND, entityFilterWhereInput.AND)
                && Objects.equals(this.NOT, entityFilterWhereInput.NOT)
                && Objects.equals(this.OR, entityFilterWhereInput.OR)
                && Objects.equals(
                        this.applyToAllClusters, entityFilterWhereInput.applyToAllClusters)
                && Objects.equals(
                        this.applyToAllClustersNot, entityFilterWhereInput.applyToAllClustersNot)
                && Objects.equals(this.clustersEvery, entityFilterWhereInput.clustersEvery)
                && Objects.equals(this.clustersNone, entityFilterWhereInput.clustersNone)
                && Objects.equals(this.clustersSome, entityFilterWhereInput.clustersSome)
                && Objects.equals(this.entityType, entityFilterWhereInput.entityType)
                && Objects.equals(this.entityTypeIn, entityFilterWhereInput.entityTypeIn)
                && Objects.equals(this.entityTypeNot, entityFilterWhereInput.entityTypeNot)
                && Objects.equals(this.entityTypeNotIn, entityFilterWhereInput.entityTypeNotIn)
                && Objects.equals(
                        this.execFailedClusterEvery, entityFilterWhereInput.execFailedClusterEvery)
                && Objects.equals(
                        this.execFailedClusterNone, entityFilterWhereInput.execFailedClusterNone)
                && Objects.equals(
                        this.execFailedClusterSome, entityFilterWhereInput.execFailedClusterSome)
                && Objects.equals(this.filterStatus, entityFilterWhereInput.filterStatus)
                && Objects.equals(this.filterStatusIn, entityFilterWhereInput.filterStatusIn)
                && Objects.equals(this.filterStatusNot, entityFilterWhereInput.filterStatusNot)
                && Objects.equals(this.filterStatusNotIn, entityFilterWhereInput.filterStatusNotIn)
                && Objects.equals(this.id, entityFilterWhereInput.id)
                && Objects.equals(this.idContains, entityFilterWhereInput.idContains)
                && Objects.equals(this.idEndsWith, entityFilterWhereInput.idEndsWith)
                && Objects.equals(this.idGt, entityFilterWhereInput.idGt)
                && Objects.equals(this.idGte, entityFilterWhereInput.idGte)
                && Objects.equals(this.idIn, entityFilterWhereInput.idIn)
                && Objects.equals(this.idLt, entityFilterWhereInput.idLt)
                && Objects.equals(this.idLte, entityFilterWhereInput.idLte)
                && Objects.equals(this.idNot, entityFilterWhereInput.idNot)
                && Objects.equals(this.idNotContains, entityFilterWhereInput.idNotContains)
                && Objects.equals(this.idNotEndsWith, entityFilterWhereInput.idNotEndsWith)
                && Objects.equals(this.idNotIn, entityFilterWhereInput.idNotIn)
                && Objects.equals(this.idNotStartsWith, entityFilterWhereInput.idNotStartsWith)
                && Objects.equals(this.idStartsWith, entityFilterWhereInput.idStartsWith)
                && Objects.equals(this.lastExecutedAt, entityFilterWhereInput.lastExecutedAt)
                && Objects.equals(this.lastExecutedAtGt, entityFilterWhereInput.lastExecutedAtGt)
                && Objects.equals(this.lastExecutedAtGte, entityFilterWhereInput.lastExecutedAtGte)
                && Objects.equals(this.lastExecutedAtIn, entityFilterWhereInput.lastExecutedAtIn)
                && Objects.equals(this.lastExecutedAtLt, entityFilterWhereInput.lastExecutedAtLt)
                && Objects.equals(this.lastExecutedAtLte, entityFilterWhereInput.lastExecutedAtLte)
                && Objects.equals(this.lastExecutedAtNot, entityFilterWhereInput.lastExecutedAtNot)
                && Objects.equals(
                        this.lastExecutedAtNotIn, entityFilterWhereInput.lastExecutedAtNotIn)
                && Objects.equals(this.name, entityFilterWhereInput.name)
                && Objects.equals(this.nameContains, entityFilterWhereInput.nameContains)
                && Objects.equals(this.nameEndsWith, entityFilterWhereInput.nameEndsWith)
                && Objects.equals(this.nameGt, entityFilterWhereInput.nameGt)
                && Objects.equals(this.nameGte, entityFilterWhereInput.nameGte)
                && Objects.equals(this.nameIn, entityFilterWhereInput.nameIn)
                && Objects.equals(this.nameLt, entityFilterWhereInput.nameLt)
                && Objects.equals(this.nameLte, entityFilterWhereInput.nameLte)
                && Objects.equals(this.nameNot, entityFilterWhereInput.nameNot)
                && Objects.equals(this.nameNotContains, entityFilterWhereInput.nameNotContains)
                && Objects.equals(this.nameNotEndsWith, entityFilterWhereInput.nameNotEndsWith)
                && Objects.equals(this.nameNotIn, entityFilterWhereInput.nameNotIn)
                && Objects.equals(this.nameNotStartsWith, entityFilterWhereInput.nameNotStartsWith)
                && Objects.equals(this.nameStartsWith, entityFilterWhereInput.nameStartsWith)
                && Objects.equals(this.preset, entityFilterWhereInput.preset)
                && Objects.equals(this.presetContains, entityFilterWhereInput.presetContains)
                && Objects.equals(this.presetEndsWith, entityFilterWhereInput.presetEndsWith)
                && Objects.equals(this.presetGt, entityFilterWhereInput.presetGt)
                && Objects.equals(this.presetGte, entityFilterWhereInput.presetGte)
                && Objects.equals(this.presetIn, entityFilterWhereInput.presetIn)
                && Objects.equals(this.presetLt, entityFilterWhereInput.presetLt)
                && Objects.equals(this.presetLte, entityFilterWhereInput.presetLte)
                && Objects.equals(this.presetNot, entityFilterWhereInput.presetNot)
                && Objects.equals(this.presetNotContains, entityFilterWhereInput.presetNotContains)
                && Objects.equals(this.presetNotEndsWith, entityFilterWhereInput.presetNotEndsWith)
                && Objects.equals(this.presetNotIn, entityFilterWhereInput.presetNotIn)
                && Objects.equals(
                        this.presetNotStartsWith, entityFilterWhereInput.presetNotStartsWith)
                && Objects.equals(this.presetStartsWith, entityFilterWhereInput.presetStartsWith);
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
                AND,
                NOT,
                OR,
                applyToAllClusters,
                applyToAllClustersNot,
                clustersEvery,
                clustersNone,
                clustersSome,
                entityType,
                entityTypeIn,
                entityTypeNot,
                entityTypeNotIn,
                execFailedClusterEvery,
                execFailedClusterNone,
                execFailedClusterSome,
                filterStatus,
                filterStatusIn,
                filterStatusNot,
                filterStatusNotIn,
                id,
                idContains,
                idEndsWith,
                idGt,
                idGte,
                idIn,
                idLt,
                idLte,
                idNot,
                idNotContains,
                idNotEndsWith,
                idNotIn,
                idNotStartsWith,
                idStartsWith,
                lastExecutedAt,
                lastExecutedAtGt,
                lastExecutedAtGte,
                lastExecutedAtIn,
                lastExecutedAtLt,
                lastExecutedAtLte,
                lastExecutedAtNot,
                lastExecutedAtNotIn,
                name,
                nameContains,
                nameEndsWith,
                nameGt,
                nameGte,
                nameIn,
                nameLt,
                nameLte,
                nameNot,
                nameNotContains,
                nameNotEndsWith,
                nameNotIn,
                nameNotStartsWith,
                nameStartsWith,
                preset,
                presetContains,
                presetEndsWith,
                presetGt,
                presetGte,
                presetIn,
                presetLt,
                presetLte,
                presetNot,
                presetNotContains,
                presetNotEndsWith,
                presetNotIn,
                presetNotStartsWith,
                presetStartsWith);
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
        sb.append("class EntityFilterWhereInput {\n");
        sb.append("    AND: ").append(toIndentedString(AND)).append("\n");
        sb.append("    NOT: ").append(toIndentedString(NOT)).append("\n");
        sb.append("    OR: ").append(toIndentedString(OR)).append("\n");
        sb.append("    applyToAllClusters: ")
                .append(toIndentedString(applyToAllClusters))
                .append("\n");
        sb.append("    applyToAllClustersNot: ")
                .append(toIndentedString(applyToAllClustersNot))
                .append("\n");
        sb.append("    clustersEvery: ").append(toIndentedString(clustersEvery)).append("\n");
        sb.append("    clustersNone: ").append(toIndentedString(clustersNone)).append("\n");
        sb.append("    clustersSome: ").append(toIndentedString(clustersSome)).append("\n");
        sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
        sb.append("    entityTypeIn: ").append(toIndentedString(entityTypeIn)).append("\n");
        sb.append("    entityTypeNot: ").append(toIndentedString(entityTypeNot)).append("\n");
        sb.append("    entityTypeNotIn: ").append(toIndentedString(entityTypeNotIn)).append("\n");
        sb.append("    execFailedClusterEvery: ")
                .append(toIndentedString(execFailedClusterEvery))
                .append("\n");
        sb.append("    execFailedClusterNone: ")
                .append(toIndentedString(execFailedClusterNone))
                .append("\n");
        sb.append("    execFailedClusterSome: ")
                .append(toIndentedString(execFailedClusterSome))
                .append("\n");
        sb.append("    filterStatus: ").append(toIndentedString(filterStatus)).append("\n");
        sb.append("    filterStatusIn: ").append(toIndentedString(filterStatusIn)).append("\n");
        sb.append("    filterStatusNot: ").append(toIndentedString(filterStatusNot)).append("\n");
        sb.append("    filterStatusNotIn: ")
                .append(toIndentedString(filterStatusNotIn))
                .append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    idContains: ").append(toIndentedString(idContains)).append("\n");
        sb.append("    idEndsWith: ").append(toIndentedString(idEndsWith)).append("\n");
        sb.append("    idGt: ").append(toIndentedString(idGt)).append("\n");
        sb.append("    idGte: ").append(toIndentedString(idGte)).append("\n");
        sb.append("    idIn: ").append(toIndentedString(idIn)).append("\n");
        sb.append("    idLt: ").append(toIndentedString(idLt)).append("\n");
        sb.append("    idLte: ").append(toIndentedString(idLte)).append("\n");
        sb.append("    idNot: ").append(toIndentedString(idNot)).append("\n");
        sb.append("    idNotContains: ").append(toIndentedString(idNotContains)).append("\n");
        sb.append("    idNotEndsWith: ").append(toIndentedString(idNotEndsWith)).append("\n");
        sb.append("    idNotIn: ").append(toIndentedString(idNotIn)).append("\n");
        sb.append("    idNotStartsWith: ").append(toIndentedString(idNotStartsWith)).append("\n");
        sb.append("    idStartsWith: ").append(toIndentedString(idStartsWith)).append("\n");
        sb.append("    lastExecutedAt: ").append(toIndentedString(lastExecutedAt)).append("\n");
        sb.append("    lastExecutedAtGt: ").append(toIndentedString(lastExecutedAtGt)).append("\n");
        sb.append("    lastExecutedAtGte: ")
                .append(toIndentedString(lastExecutedAtGte))
                .append("\n");
        sb.append("    lastExecutedAtIn: ").append(toIndentedString(lastExecutedAtIn)).append("\n");
        sb.append("    lastExecutedAtLt: ").append(toIndentedString(lastExecutedAtLt)).append("\n");
        sb.append("    lastExecutedAtLte: ")
                .append(toIndentedString(lastExecutedAtLte))
                .append("\n");
        sb.append("    lastExecutedAtNot: ")
                .append(toIndentedString(lastExecutedAtNot))
                .append("\n");
        sb.append("    lastExecutedAtNotIn: ")
                .append(toIndentedString(lastExecutedAtNotIn))
                .append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    nameContains: ").append(toIndentedString(nameContains)).append("\n");
        sb.append("    nameEndsWith: ").append(toIndentedString(nameEndsWith)).append("\n");
        sb.append("    nameGt: ").append(toIndentedString(nameGt)).append("\n");
        sb.append("    nameGte: ").append(toIndentedString(nameGte)).append("\n");
        sb.append("    nameIn: ").append(toIndentedString(nameIn)).append("\n");
        sb.append("    nameLt: ").append(toIndentedString(nameLt)).append("\n");
        sb.append("    nameLte: ").append(toIndentedString(nameLte)).append("\n");
        sb.append("    nameNot: ").append(toIndentedString(nameNot)).append("\n");
        sb.append("    nameNotContains: ").append(toIndentedString(nameNotContains)).append("\n");
        sb.append("    nameNotEndsWith: ").append(toIndentedString(nameNotEndsWith)).append("\n");
        sb.append("    nameNotIn: ").append(toIndentedString(nameNotIn)).append("\n");
        sb.append("    nameNotStartsWith: ")
                .append(toIndentedString(nameNotStartsWith))
                .append("\n");
        sb.append("    nameStartsWith: ").append(toIndentedString(nameStartsWith)).append("\n");
        sb.append("    preset: ").append(toIndentedString(preset)).append("\n");
        sb.append("    presetContains: ").append(toIndentedString(presetContains)).append("\n");
        sb.append("    presetEndsWith: ").append(toIndentedString(presetEndsWith)).append("\n");
        sb.append("    presetGt: ").append(toIndentedString(presetGt)).append("\n");
        sb.append("    presetGte: ").append(toIndentedString(presetGte)).append("\n");
        sb.append("    presetIn: ").append(toIndentedString(presetIn)).append("\n");
        sb.append("    presetLt: ").append(toIndentedString(presetLt)).append("\n");
        sb.append("    presetLte: ").append(toIndentedString(presetLte)).append("\n");
        sb.append("    presetNot: ").append(toIndentedString(presetNot)).append("\n");
        sb.append("    presetNotContains: ")
                .append(toIndentedString(presetNotContains))
                .append("\n");
        sb.append("    presetNotEndsWith: ")
                .append(toIndentedString(presetNotEndsWith))
                .append("\n");
        sb.append("    presetNotIn: ").append(toIndentedString(presetNotIn)).append("\n");
        sb.append("    presetNotStartsWith: ")
                .append(toIndentedString(presetNotStartsWith))
                .append("\n");
        sb.append("    presetStartsWith: ").append(toIndentedString(presetStartsWith)).append("\n");
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

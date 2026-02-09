package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** ClusterImageWhereInput */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class ClusterImageWhereInput
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_A_N_D = "AND";

    @SerializedName(SERIALIZED_NAME_A_N_D)
    private List<ClusterImageWhereInput> AND = null;

    public static final String SERIALIZED_NAME_N_O_T = "NOT";

    @SerializedName(SERIALIZED_NAME_N_O_T)
    private List<ClusterImageWhereInput> NOT = null;

    public static final String SERIALIZED_NAME_O_R = "OR";

    @SerializedName(SERIALIZED_NAME_O_R)
    private List<ClusterImageWhereInput> OR = null;

    public static final String SERIALIZED_NAME_CLUSTER = "cluster";

    @SerializedName(SERIALIZED_NAME_CLUSTER)
    private ClusterWhereInput cluster;

    public static final String SERIALIZED_NAME_ENTITY_ASYNC_STATUS = "entityAsyncStatus";

    @SerializedName(SERIALIZED_NAME_ENTITY_ASYNC_STATUS)
    private EntityAsyncStatus entityAsyncStatus;

    public static final String SERIALIZED_NAME_ENTITY_ASYNC_STATUS_IN = "entityAsyncStatus_in";

    @SerializedName(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_IN)
    private List<EntityAsyncStatus> entityAsyncStatusIn = null;

    public static final String SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT = "entityAsyncStatus_not";

    @SerializedName(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT)
    private EntityAsyncStatus entityAsyncStatusNot;

    public static final String SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT_IN =
            "entityAsyncStatus_not_in";

    @SerializedName(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT_IN)
    private List<EntityAsyncStatus> entityAsyncStatusNotIn = null;

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

    public static final String SERIALIZED_NAME_LOCAL_ID = "local_id";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID)
    private String localId;

    public static final String SERIALIZED_NAME_LOCAL_ID_CONTAINS = "local_id_contains";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID_CONTAINS)
    private String localIdContains;

    public static final String SERIALIZED_NAME_LOCAL_ID_ENDS_WITH = "local_id_ends_with";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID_ENDS_WITH)
    private String localIdEndsWith;

    public static final String SERIALIZED_NAME_LOCAL_ID_GT = "local_id_gt";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID_GT)
    private String localIdGt;

    public static final String SERIALIZED_NAME_LOCAL_ID_GTE = "local_id_gte";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID_GTE)
    private String localIdGte;

    public static final String SERIALIZED_NAME_LOCAL_ID_IN = "local_id_in";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID_IN)
    private List<String> localIdIn = null;

    public static final String SERIALIZED_NAME_LOCAL_ID_LT = "local_id_lt";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID_LT)
    private String localIdLt;

    public static final String SERIALIZED_NAME_LOCAL_ID_LTE = "local_id_lte";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID_LTE)
    private String localIdLte;

    public static final String SERIALIZED_NAME_LOCAL_ID_NOT = "local_id_not";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID_NOT)
    private String localIdNot;

    public static final String SERIALIZED_NAME_LOCAL_ID_NOT_CONTAINS = "local_id_not_contains";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID_NOT_CONTAINS)
    private String localIdNotContains;

    public static final String SERIALIZED_NAME_LOCAL_ID_NOT_ENDS_WITH = "local_id_not_ends_with";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID_NOT_ENDS_WITH)
    private String localIdNotEndsWith;

    public static final String SERIALIZED_NAME_LOCAL_ID_NOT_IN = "local_id_not_in";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID_NOT_IN)
    private List<String> localIdNotIn = null;

    public static final String SERIALIZED_NAME_LOCAL_ID_NOT_STARTS_WITH =
            "local_id_not_starts_with";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID_NOT_STARTS_WITH)
    private String localIdNotStartsWith;

    public static final String SERIALIZED_NAME_LOCAL_ID_STARTS_WITH = "local_id_starts_with";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID_STARTS_WITH)
    private String localIdStartsWith;

    public static final String SERIALIZED_NAME_META_NAME = "meta_name";

    @SerializedName(SERIALIZED_NAME_META_NAME)
    private String metaName;

    public static final String SERIALIZED_NAME_META_NAME_CONTAINS = "meta_name_contains";

    @SerializedName(SERIALIZED_NAME_META_NAME_CONTAINS)
    private String metaNameContains;

    public static final String SERIALIZED_NAME_META_NAME_ENDS_WITH = "meta_name_ends_with";

    @SerializedName(SERIALIZED_NAME_META_NAME_ENDS_WITH)
    private String metaNameEndsWith;

    public static final String SERIALIZED_NAME_META_NAME_GT = "meta_name_gt";

    @SerializedName(SERIALIZED_NAME_META_NAME_GT)
    private String metaNameGt;

    public static final String SERIALIZED_NAME_META_NAME_GTE = "meta_name_gte";

    @SerializedName(SERIALIZED_NAME_META_NAME_GTE)
    private String metaNameGte;

    public static final String SERIALIZED_NAME_META_NAME_IN = "meta_name_in";

    @SerializedName(SERIALIZED_NAME_META_NAME_IN)
    private List<String> metaNameIn = null;

    public static final String SERIALIZED_NAME_META_NAME_LT = "meta_name_lt";

    @SerializedName(SERIALIZED_NAME_META_NAME_LT)
    private String metaNameLt;

    public static final String SERIALIZED_NAME_META_NAME_LTE = "meta_name_lte";

    @SerializedName(SERIALIZED_NAME_META_NAME_LTE)
    private String metaNameLte;

    public static final String SERIALIZED_NAME_META_NAME_NOT = "meta_name_not";

    @SerializedName(SERIALIZED_NAME_META_NAME_NOT)
    private String metaNameNot;

    public static final String SERIALIZED_NAME_META_NAME_NOT_CONTAINS = "meta_name_not_contains";

    @SerializedName(SERIALIZED_NAME_META_NAME_NOT_CONTAINS)
    private String metaNameNotContains;

    public static final String SERIALIZED_NAME_META_NAME_NOT_ENDS_WITH = "meta_name_not_ends_with";

    @SerializedName(SERIALIZED_NAME_META_NAME_NOT_ENDS_WITH)
    private String metaNameNotEndsWith;

    public static final String SERIALIZED_NAME_META_NAME_NOT_IN = "meta_name_not_in";

    @SerializedName(SERIALIZED_NAME_META_NAME_NOT_IN)
    private List<String> metaNameNotIn = null;

    public static final String SERIALIZED_NAME_META_NAME_NOT_STARTS_WITH =
            "meta_name_not_starts_with";

    @SerializedName(SERIALIZED_NAME_META_NAME_NOT_STARTS_WITH)
    private String metaNameNotStartsWith;

    public static final String SERIALIZED_NAME_META_NAME_STARTS_WITH = "meta_name_starts_with";

    @SerializedName(SERIALIZED_NAME_META_NAME_STARTS_WITH)
    private String metaNameStartsWith;

    public static final String SERIALIZED_NAME_META_SIZE = "meta_size";

    @SerializedName(SERIALIZED_NAME_META_SIZE)
    private Long metaSize;

    public static final String SERIALIZED_NAME_META_SIZE_GT = "meta_size_gt";

    @SerializedName(SERIALIZED_NAME_META_SIZE_GT)
    private Long metaSizeGt;

    public static final String SERIALIZED_NAME_META_SIZE_GTE = "meta_size_gte";

    @SerializedName(SERIALIZED_NAME_META_SIZE_GTE)
    private Long metaSizeGte;

    public static final String SERIALIZED_NAME_META_SIZE_IN = "meta_size_in";

    @SerializedName(SERIALIZED_NAME_META_SIZE_IN)
    private List<Long> metaSizeIn = null;

    public static final String SERIALIZED_NAME_META_SIZE_LT = "meta_size_lt";

    @SerializedName(SERIALIZED_NAME_META_SIZE_LT)
    private Long metaSizeLt;

    public static final String SERIALIZED_NAME_META_SIZE_LTE = "meta_size_lte";

    @SerializedName(SERIALIZED_NAME_META_SIZE_LTE)
    private Long metaSizeLte;

    public static final String SERIALIZED_NAME_META_SIZE_NOT = "meta_size_not";

    @SerializedName(SERIALIZED_NAME_META_SIZE_NOT)
    private Long metaSizeNot;

    public static final String SERIALIZED_NAME_META_SIZE_NOT_IN = "meta_size_not_in";

    @SerializedName(SERIALIZED_NAME_META_SIZE_NOT_IN)
    private List<Long> metaSizeNotIn = null;

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

    public static final String SERIALIZED_NAME_SIZE = "size";

    @SerializedName(SERIALIZED_NAME_SIZE)
    private Long size;

    public static final String SERIALIZED_NAME_SIZE_GT = "size_gt";

    @SerializedName(SERIALIZED_NAME_SIZE_GT)
    private Long sizeGt;

    public static final String SERIALIZED_NAME_SIZE_GTE = "size_gte";

    @SerializedName(SERIALIZED_NAME_SIZE_GTE)
    private Long sizeGte;

    public static final String SERIALIZED_NAME_SIZE_IN = "size_in";

    @SerializedName(SERIALIZED_NAME_SIZE_IN)
    private List<Long> sizeIn = null;

    public static final String SERIALIZED_NAME_SIZE_LT = "size_lt";

    @SerializedName(SERIALIZED_NAME_SIZE_LT)
    private Long sizeLt;

    public static final String SERIALIZED_NAME_SIZE_LTE = "size_lte";

    @SerializedName(SERIALIZED_NAME_SIZE_LTE)
    private Long sizeLte;

    public static final String SERIALIZED_NAME_SIZE_NOT = "size_not";

    @SerializedName(SERIALIZED_NAME_SIZE_NOT)
    private Long sizeNot;

    public static final String SERIALIZED_NAME_SIZE_NOT_IN = "size_not_in";

    @SerializedName(SERIALIZED_NAME_SIZE_NOT_IN)
    private List<Long> sizeNotIn = null;

    public static final String SERIALIZED_NAME_UPGRADE_TOOL_VERSION = "upgrade_tool_version";

    @SerializedName(SERIALIZED_NAME_UPGRADE_TOOL_VERSION)
    private String upgradeToolVersion;

    public static final String SERIALIZED_NAME_UPGRADE_TOOL_VERSION_CONTAINS =
            "upgrade_tool_version_contains";

    @SerializedName(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_CONTAINS)
    private String upgradeToolVersionContains;

    public static final String SERIALIZED_NAME_UPGRADE_TOOL_VERSION_ENDS_WITH =
            "upgrade_tool_version_ends_with";

    @SerializedName(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_ENDS_WITH)
    private String upgradeToolVersionEndsWith;

    public static final String SERIALIZED_NAME_UPGRADE_TOOL_VERSION_GT = "upgrade_tool_version_gt";

    @SerializedName(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_GT)
    private String upgradeToolVersionGt;

    public static final String SERIALIZED_NAME_UPGRADE_TOOL_VERSION_GTE =
            "upgrade_tool_version_gte";

    @SerializedName(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_GTE)
    private String upgradeToolVersionGte;

    public static final String SERIALIZED_NAME_UPGRADE_TOOL_VERSION_IN = "upgrade_tool_version_in";

    @SerializedName(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_IN)
    private List<String> upgradeToolVersionIn = null;

    public static final String SERIALIZED_NAME_UPGRADE_TOOL_VERSION_LT = "upgrade_tool_version_lt";

    @SerializedName(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_LT)
    private String upgradeToolVersionLt;

    public static final String SERIALIZED_NAME_UPGRADE_TOOL_VERSION_LTE =
            "upgrade_tool_version_lte";

    @SerializedName(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_LTE)
    private String upgradeToolVersionLte;

    public static final String SERIALIZED_NAME_UPGRADE_TOOL_VERSION_NOT =
            "upgrade_tool_version_not";

    @SerializedName(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_NOT)
    private String upgradeToolVersionNot;

    public static final String SERIALIZED_NAME_UPGRADE_TOOL_VERSION_NOT_CONTAINS =
            "upgrade_tool_version_not_contains";

    @SerializedName(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_NOT_CONTAINS)
    private String upgradeToolVersionNotContains;

    public static final String SERIALIZED_NAME_UPGRADE_TOOL_VERSION_NOT_ENDS_WITH =
            "upgrade_tool_version_not_ends_with";

    @SerializedName(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_NOT_ENDS_WITH)
    private String upgradeToolVersionNotEndsWith;

    public static final String SERIALIZED_NAME_UPGRADE_TOOL_VERSION_NOT_IN =
            "upgrade_tool_version_not_in";

    @SerializedName(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_NOT_IN)
    private List<String> upgradeToolVersionNotIn = null;

    public static final String SERIALIZED_NAME_UPGRADE_TOOL_VERSION_NOT_STARTS_WITH =
            "upgrade_tool_version_not_starts_with";

    @SerializedName(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_NOT_STARTS_WITH)
    private String upgradeToolVersionNotStartsWith;

    public static final String SERIALIZED_NAME_UPGRADE_TOOL_VERSION_STARTS_WITH =
            "upgrade_tool_version_starts_with";

    @SerializedName(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_STARTS_WITH)
    private String upgradeToolVersionStartsWith;

    public static final String SERIALIZED_NAME_VERSION = "version";

    @SerializedName(SERIALIZED_NAME_VERSION)
    private String version;

    public static final String SERIALIZED_NAME_VERSION_CONTAINS = "version_contains";

    @SerializedName(SERIALIZED_NAME_VERSION_CONTAINS)
    private String versionContains;

    public static final String SERIALIZED_NAME_VERSION_ENDS_WITH = "version_ends_with";

    @SerializedName(SERIALIZED_NAME_VERSION_ENDS_WITH)
    private String versionEndsWith;

    public static final String SERIALIZED_NAME_VERSION_GT = "version_gt";

    @SerializedName(SERIALIZED_NAME_VERSION_GT)
    private String versionGt;

    public static final String SERIALIZED_NAME_VERSION_GTE = "version_gte";

    @SerializedName(SERIALIZED_NAME_VERSION_GTE)
    private String versionGte;

    public static final String SERIALIZED_NAME_VERSION_IN = "version_in";

    @SerializedName(SERIALIZED_NAME_VERSION_IN)
    private List<String> versionIn = null;

    public static final String SERIALIZED_NAME_VERSION_LT = "version_lt";

    @SerializedName(SERIALIZED_NAME_VERSION_LT)
    private String versionLt;

    public static final String SERIALIZED_NAME_VERSION_LTE = "version_lte";

    @SerializedName(SERIALIZED_NAME_VERSION_LTE)
    private String versionLte;

    public static final String SERIALIZED_NAME_VERSION_NOT = "version_not";

    @SerializedName(SERIALIZED_NAME_VERSION_NOT)
    private String versionNot;

    public static final String SERIALIZED_NAME_VERSION_NOT_CONTAINS = "version_not_contains";

    @SerializedName(SERIALIZED_NAME_VERSION_NOT_CONTAINS)
    private String versionNotContains;

    public static final String SERIALIZED_NAME_VERSION_NOT_ENDS_WITH = "version_not_ends_with";

    @SerializedName(SERIALIZED_NAME_VERSION_NOT_ENDS_WITH)
    private String versionNotEndsWith;

    public static final String SERIALIZED_NAME_VERSION_NOT_IN = "version_not_in";

    @SerializedName(SERIALIZED_NAME_VERSION_NOT_IN)
    private List<String> versionNotIn = null;

    public static final String SERIALIZED_NAME_VERSION_NOT_STARTS_WITH = "version_not_starts_with";

    @SerializedName(SERIALIZED_NAME_VERSION_NOT_STARTS_WITH)
    private String versionNotStartsWith;

    public static final String SERIALIZED_NAME_VERSION_SEMANTIC_GT = "version_semantic_gt";

    @SerializedName(SERIALIZED_NAME_VERSION_SEMANTIC_GT)
    private String versionSemanticGt;

    public static final String SERIALIZED_NAME_VERSION_SEMANTIC_GTE = "version_semantic_gte";

    @SerializedName(SERIALIZED_NAME_VERSION_SEMANTIC_GTE)
    private String versionSemanticGte;

    public static final String SERIALIZED_NAME_VERSION_SEMANTIC_LT = "version_semantic_lt";

    @SerializedName(SERIALIZED_NAME_VERSION_SEMANTIC_LT)
    private String versionSemanticLt;

    public static final String SERIALIZED_NAME_VERSION_SEMANTIC_LTE = "version_semantic_lte";

    @SerializedName(SERIALIZED_NAME_VERSION_SEMANTIC_LTE)
    private String versionSemanticLte;

    public static final String SERIALIZED_NAME_VERSION_STARTS_WITH = "version_starts_with";

    @SerializedName(SERIALIZED_NAME_VERSION_STARTS_WITH)
    private String versionStartsWith;

    public static final String SERIALIZED_NAME_ZBS_VERSION = "zbs_version";

    @SerializedName(SERIALIZED_NAME_ZBS_VERSION)
    private String zbsVersion;

    public static final String SERIALIZED_NAME_ZBS_VERSION_CONTAINS = "zbs_version_contains";

    @SerializedName(SERIALIZED_NAME_ZBS_VERSION_CONTAINS)
    private String zbsVersionContains;

    public static final String SERIALIZED_NAME_ZBS_VERSION_ENDS_WITH = "zbs_version_ends_with";

    @SerializedName(SERIALIZED_NAME_ZBS_VERSION_ENDS_WITH)
    private String zbsVersionEndsWith;

    public static final String SERIALIZED_NAME_ZBS_VERSION_GT = "zbs_version_gt";

    @SerializedName(SERIALIZED_NAME_ZBS_VERSION_GT)
    private String zbsVersionGt;

    public static final String SERIALIZED_NAME_ZBS_VERSION_GTE = "zbs_version_gte";

    @SerializedName(SERIALIZED_NAME_ZBS_VERSION_GTE)
    private String zbsVersionGte;

    public static final String SERIALIZED_NAME_ZBS_VERSION_IN = "zbs_version_in";

    @SerializedName(SERIALIZED_NAME_ZBS_VERSION_IN)
    private List<String> zbsVersionIn = null;

    public static final String SERIALIZED_NAME_ZBS_VERSION_LT = "zbs_version_lt";

    @SerializedName(SERIALIZED_NAME_ZBS_VERSION_LT)
    private String zbsVersionLt;

    public static final String SERIALIZED_NAME_ZBS_VERSION_LTE = "zbs_version_lte";

    @SerializedName(SERIALIZED_NAME_ZBS_VERSION_LTE)
    private String zbsVersionLte;

    public static final String SERIALIZED_NAME_ZBS_VERSION_NOT = "zbs_version_not";

    @SerializedName(SERIALIZED_NAME_ZBS_VERSION_NOT)
    private String zbsVersionNot;

    public static final String SERIALIZED_NAME_ZBS_VERSION_NOT_CONTAINS =
            "zbs_version_not_contains";

    @SerializedName(SERIALIZED_NAME_ZBS_VERSION_NOT_CONTAINS)
    private String zbsVersionNotContains;

    public static final String SERIALIZED_NAME_ZBS_VERSION_NOT_ENDS_WITH =
            "zbs_version_not_ends_with";

    @SerializedName(SERIALIZED_NAME_ZBS_VERSION_NOT_ENDS_WITH)
    private String zbsVersionNotEndsWith;

    public static final String SERIALIZED_NAME_ZBS_VERSION_NOT_IN = "zbs_version_not_in";

    @SerializedName(SERIALIZED_NAME_ZBS_VERSION_NOT_IN)
    private List<String> zbsVersionNotIn = null;

    public static final String SERIALIZED_NAME_ZBS_VERSION_NOT_STARTS_WITH =
            "zbs_version_not_starts_with";

    @SerializedName(SERIALIZED_NAME_ZBS_VERSION_NOT_STARTS_WITH)
    private String zbsVersionNotStartsWith;

    public static final String SERIALIZED_NAME_ZBS_VERSION_STARTS_WITH = "zbs_version_starts_with";

    @SerializedName(SERIALIZED_NAME_ZBS_VERSION_STARTS_WITH)
    private String zbsVersionStartsWith;

    public ClusterImageWhereInput() {}

    public ClusterImageWhereInput AND(List<ClusterImageWhereInput> AND) {

        this.AND = AND;
        return this;
    }

    public ClusterImageWhereInput addANDItem(ClusterImageWhereInput ANDItem) {
        if (this.AND == null) {
            this.AND = new ArrayList<ClusterImageWhereInput>();
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
    public List<ClusterImageWhereInput> getAND() {
        return AND;
    }

    public void setAND(List<ClusterImageWhereInput> AND) {
        this.AND = AND;
    }

    public ClusterImageWhereInput AND_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_A_N_D);
        return this;
    }

    public ClusterImageWhereInput AND_ExplictlyNonNull() {
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

    public ClusterImageWhereInput NOT(List<ClusterImageWhereInput> NOT) {

        this.NOT = NOT;
        return this;
    }

    public ClusterImageWhereInput addNOTItem(ClusterImageWhereInput NOTItem) {
        if (this.NOT == null) {
            this.NOT = new ArrayList<ClusterImageWhereInput>();
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
    public List<ClusterImageWhereInput> getNOT() {
        return NOT;
    }

    public void setNOT(List<ClusterImageWhereInput> NOT) {
        this.NOT = NOT;
    }

    public ClusterImageWhereInput NOT_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_N_O_T);
        return this;
    }

    public ClusterImageWhereInput NOT_ExplictlyNonNull() {
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

    public ClusterImageWhereInput OR(List<ClusterImageWhereInput> OR) {

        this.OR = OR;
        return this;
    }

    public ClusterImageWhereInput addORItem(ClusterImageWhereInput ORItem) {
        if (this.OR == null) {
            this.OR = new ArrayList<ClusterImageWhereInput>();
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
    public List<ClusterImageWhereInput> getOR() {
        return OR;
    }

    public void setOR(List<ClusterImageWhereInput> OR) {
        this.OR = OR;
    }

    public ClusterImageWhereInput OR_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_O_R);
        return this;
    }

    public ClusterImageWhereInput OR_ExplictlyNonNull() {
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

    public ClusterImageWhereInput cluster(ClusterWhereInput cluster) {

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
    public ClusterWhereInput getCluster() {
        return cluster;
    }

    public void setCluster(ClusterWhereInput cluster) {
        this.cluster = cluster;
    }

    public ClusterImageWhereInput cluster_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER);
        return this;
    }

    public ClusterImageWhereInput cluster_ExplictlyNonNull() {
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

    public ClusterImageWhereInput entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {

        this.entityAsyncStatus = entityAsyncStatus;
        return this;
    }

    /**
     * Get entityAsyncStatus
     *
     * @return entityAsyncStatus
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public EntityAsyncStatus getEntityAsyncStatus() {
        return entityAsyncStatus;
    }

    public void setEntityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {
        this.entityAsyncStatus = entityAsyncStatus;
    }

    public ClusterImageWhereInput entityAsyncStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        return this;
    }

    public ClusterImageWhereInput entityAsyncStatus_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        return this;
    }

    public void setEntityAsyncStatus_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        }
    }

    public boolean getEntityAsyncStatus_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
    }

    public ClusterImageWhereInput entityAsyncStatusIn(List<EntityAsyncStatus> entityAsyncStatusIn) {

        this.entityAsyncStatusIn = entityAsyncStatusIn;
        return this;
    }

    public ClusterImageWhereInput addEntityAsyncStatusInItem(
            EntityAsyncStatus entityAsyncStatusInItem) {
        if (this.entityAsyncStatusIn == null) {
            this.entityAsyncStatusIn = new ArrayList<EntityAsyncStatus>();
        }
        this.entityAsyncStatusIn.add(entityAsyncStatusInItem);
        return this;
    }

    /**
     * Get entityAsyncStatusIn
     *
     * @return entityAsyncStatusIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<EntityAsyncStatus> getEntityAsyncStatusIn() {
        return entityAsyncStatusIn;
    }

    public void setEntityAsyncStatusIn(List<EntityAsyncStatus> entityAsyncStatusIn) {
        this.entityAsyncStatusIn = entityAsyncStatusIn;
    }

    public ClusterImageWhereInput entityAsyncStatusIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_IN);
        return this;
    }

    public ClusterImageWhereInput entityAsyncStatusIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_IN);
        return this;
    }

    public void setEntityAsyncStatusIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_IN);
        }
    }

    public boolean getEntityAsyncStatusIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_IN);
    }

    public ClusterImageWhereInput entityAsyncStatusNot(EntityAsyncStatus entityAsyncStatusNot) {

        this.entityAsyncStatusNot = entityAsyncStatusNot;
        return this;
    }

    /**
     * Get entityAsyncStatusNot
     *
     * @return entityAsyncStatusNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public EntityAsyncStatus getEntityAsyncStatusNot() {
        return entityAsyncStatusNot;
    }

    public void setEntityAsyncStatusNot(EntityAsyncStatus entityAsyncStatusNot) {
        this.entityAsyncStatusNot = entityAsyncStatusNot;
    }

    public ClusterImageWhereInput entityAsyncStatusNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT);
        return this;
    }

    public ClusterImageWhereInput entityAsyncStatusNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT);
        return this;
    }

    public void setEntityAsyncStatusNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT);
        }
    }

    public boolean getEntityAsyncStatusNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT);
    }

    public ClusterImageWhereInput entityAsyncStatusNotIn(
            List<EntityAsyncStatus> entityAsyncStatusNotIn) {

        this.entityAsyncStatusNotIn = entityAsyncStatusNotIn;
        return this;
    }

    public ClusterImageWhereInput addEntityAsyncStatusNotInItem(
            EntityAsyncStatus entityAsyncStatusNotInItem) {
        if (this.entityAsyncStatusNotIn == null) {
            this.entityAsyncStatusNotIn = new ArrayList<EntityAsyncStatus>();
        }
        this.entityAsyncStatusNotIn.add(entityAsyncStatusNotInItem);
        return this;
    }

    /**
     * Get entityAsyncStatusNotIn
     *
     * @return entityAsyncStatusNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<EntityAsyncStatus> getEntityAsyncStatusNotIn() {
        return entityAsyncStatusNotIn;
    }

    public void setEntityAsyncStatusNotIn(List<EntityAsyncStatus> entityAsyncStatusNotIn) {
        this.entityAsyncStatusNotIn = entityAsyncStatusNotIn;
    }

    public ClusterImageWhereInput entityAsyncStatusNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT_IN);
        return this;
    }

    public ClusterImageWhereInput entityAsyncStatusNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT_IN);
        return this;
    }

    public void setEntityAsyncStatusNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT_IN);
        }
    }

    public boolean getEntityAsyncStatusNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT_IN);
    }

    public ClusterImageWhereInput id(String id) {

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

    public ClusterImageWhereInput id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public ClusterImageWhereInput id_ExplictlyNonNull() {
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

    public ClusterImageWhereInput idContains(String idContains) {

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

    public ClusterImageWhereInput idContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_CONTAINS);
        return this;
    }

    public ClusterImageWhereInput idContains_ExplictlyNonNull() {
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

    public ClusterImageWhereInput idEndsWith(String idEndsWith) {

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

    public ClusterImageWhereInput idEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_ENDS_WITH);
        return this;
    }

    public ClusterImageWhereInput idEndsWith_ExplictlyNonNull() {
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

    public ClusterImageWhereInput idGt(String idGt) {

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

    public ClusterImageWhereInput idGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GT);
        return this;
    }

    public ClusterImageWhereInput idGt_ExplictlyNonNull() {
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

    public ClusterImageWhereInput idGte(String idGte) {

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

    public ClusterImageWhereInput idGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GTE);
        return this;
    }

    public ClusterImageWhereInput idGte_ExplictlyNonNull() {
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

    public ClusterImageWhereInput idIn(List<String> idIn) {

        this.idIn = idIn;
        return this;
    }

    public ClusterImageWhereInput addIdInItem(String idInItem) {
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

    public ClusterImageWhereInput idIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_IN);
        return this;
    }

    public ClusterImageWhereInput idIn_ExplictlyNonNull() {
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

    public ClusterImageWhereInput idLt(String idLt) {

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

    public ClusterImageWhereInput idLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LT);
        return this;
    }

    public ClusterImageWhereInput idLt_ExplictlyNonNull() {
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

    public ClusterImageWhereInput idLte(String idLte) {

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

    public ClusterImageWhereInput idLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LTE);
        return this;
    }

    public ClusterImageWhereInput idLte_ExplictlyNonNull() {
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

    public ClusterImageWhereInput idNot(String idNot) {

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

    public ClusterImageWhereInput idNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT);
        return this;
    }

    public ClusterImageWhereInput idNot_ExplictlyNonNull() {
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

    public ClusterImageWhereInput idNotContains(String idNotContains) {

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

    public ClusterImageWhereInput idNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_CONTAINS);
        return this;
    }

    public ClusterImageWhereInput idNotContains_ExplictlyNonNull() {
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

    public ClusterImageWhereInput idNotEndsWith(String idNotEndsWith) {

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

    public ClusterImageWhereInput idNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
        return this;
    }

    public ClusterImageWhereInput idNotEndsWith_ExplictlyNonNull() {
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

    public ClusterImageWhereInput idNotIn(List<String> idNotIn) {

        this.idNotIn = idNotIn;
        return this;
    }

    public ClusterImageWhereInput addIdNotInItem(String idNotInItem) {
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

    public ClusterImageWhereInput idNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_IN);
        return this;
    }

    public ClusterImageWhereInput idNotIn_ExplictlyNonNull() {
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

    public ClusterImageWhereInput idNotStartsWith(String idNotStartsWith) {

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

    public ClusterImageWhereInput idNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
        return this;
    }

    public ClusterImageWhereInput idNotStartsWith_ExplictlyNonNull() {
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

    public ClusterImageWhereInput idStartsWith(String idStartsWith) {

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

    public ClusterImageWhereInput idStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_STARTS_WITH);
        return this;
    }

    public ClusterImageWhereInput idStartsWith_ExplictlyNonNull() {
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

    public ClusterImageWhereInput localId(String localId) {

        this.localId = localId;
        return this;
    }

    /**
     * Get localId
     *
     * @return localId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalId() {
        return localId;
    }

    public void setLocalId(String localId) {
        this.localId = localId;
    }

    public ClusterImageWhereInput localId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID);
        return this;
    }

    public ClusterImageWhereInput localId_ExplictlyNonNull() {
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

    public ClusterImageWhereInput localIdContains(String localIdContains) {

        this.localIdContains = localIdContains;
        return this;
    }

    /**
     * Get localIdContains
     *
     * @return localIdContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalIdContains() {
        return localIdContains;
    }

    public void setLocalIdContains(String localIdContains) {
        this.localIdContains = localIdContains;
    }

    public ClusterImageWhereInput localIdContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_CONTAINS);
        return this;
    }

    public ClusterImageWhereInput localIdContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_CONTAINS);
        return this;
    }

    public void setLocalIdContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_CONTAINS);
        }
    }

    public boolean getLocalIdContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID_CONTAINS);
    }

    public ClusterImageWhereInput localIdEndsWith(String localIdEndsWith) {

        this.localIdEndsWith = localIdEndsWith;
        return this;
    }

    /**
     * Get localIdEndsWith
     *
     * @return localIdEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalIdEndsWith() {
        return localIdEndsWith;
    }

    public void setLocalIdEndsWith(String localIdEndsWith) {
        this.localIdEndsWith = localIdEndsWith;
    }

    public ClusterImageWhereInput localIdEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_ENDS_WITH);
        return this;
    }

    public ClusterImageWhereInput localIdEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_ENDS_WITH);
        return this;
    }

    public void setLocalIdEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_ENDS_WITH);
        }
    }

    public boolean getLocalIdEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID_ENDS_WITH);
    }

    public ClusterImageWhereInput localIdGt(String localIdGt) {

        this.localIdGt = localIdGt;
        return this;
    }

    /**
     * Get localIdGt
     *
     * @return localIdGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalIdGt() {
        return localIdGt;
    }

    public void setLocalIdGt(String localIdGt) {
        this.localIdGt = localIdGt;
    }

    public ClusterImageWhereInput localIdGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_GT);
        return this;
    }

    public ClusterImageWhereInput localIdGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_GT);
        return this;
    }

    public void setLocalIdGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_GT);
        }
    }

    public boolean getLocalIdGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID_GT);
    }

    public ClusterImageWhereInput localIdGte(String localIdGte) {

        this.localIdGte = localIdGte;
        return this;
    }

    /**
     * Get localIdGte
     *
     * @return localIdGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalIdGte() {
        return localIdGte;
    }

    public void setLocalIdGte(String localIdGte) {
        this.localIdGte = localIdGte;
    }

    public ClusterImageWhereInput localIdGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_GTE);
        return this;
    }

    public ClusterImageWhereInput localIdGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_GTE);
        return this;
    }

    public void setLocalIdGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_GTE);
        }
    }

    public boolean getLocalIdGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID_GTE);
    }

    public ClusterImageWhereInput localIdIn(List<String> localIdIn) {

        this.localIdIn = localIdIn;
        return this;
    }

    public ClusterImageWhereInput addLocalIdInItem(String localIdInItem) {
        if (this.localIdIn == null) {
            this.localIdIn = new ArrayList<String>();
        }
        this.localIdIn.add(localIdInItem);
        return this;
    }

    /**
     * Get localIdIn
     *
     * @return localIdIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getLocalIdIn() {
        return localIdIn;
    }

    public void setLocalIdIn(List<String> localIdIn) {
        this.localIdIn = localIdIn;
    }

    public ClusterImageWhereInput localIdIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_IN);
        return this;
    }

    public ClusterImageWhereInput localIdIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_IN);
        return this;
    }

    public void setLocalIdIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_IN);
        }
    }

    public boolean getLocalIdIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID_IN);
    }

    public ClusterImageWhereInput localIdLt(String localIdLt) {

        this.localIdLt = localIdLt;
        return this;
    }

    /**
     * Get localIdLt
     *
     * @return localIdLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalIdLt() {
        return localIdLt;
    }

    public void setLocalIdLt(String localIdLt) {
        this.localIdLt = localIdLt;
    }

    public ClusterImageWhereInput localIdLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_LT);
        return this;
    }

    public ClusterImageWhereInput localIdLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_LT);
        return this;
    }

    public void setLocalIdLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_LT);
        }
    }

    public boolean getLocalIdLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID_LT);
    }

    public ClusterImageWhereInput localIdLte(String localIdLte) {

        this.localIdLte = localIdLte;
        return this;
    }

    /**
     * Get localIdLte
     *
     * @return localIdLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalIdLte() {
        return localIdLte;
    }

    public void setLocalIdLte(String localIdLte) {
        this.localIdLte = localIdLte;
    }

    public ClusterImageWhereInput localIdLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_LTE);
        return this;
    }

    public ClusterImageWhereInput localIdLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_LTE);
        return this;
    }

    public void setLocalIdLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_LTE);
        }
    }

    public boolean getLocalIdLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID_LTE);
    }

    public ClusterImageWhereInput localIdNot(String localIdNot) {

        this.localIdNot = localIdNot;
        return this;
    }

    /**
     * Get localIdNot
     *
     * @return localIdNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalIdNot() {
        return localIdNot;
    }

    public void setLocalIdNot(String localIdNot) {
        this.localIdNot = localIdNot;
    }

    public ClusterImageWhereInput localIdNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT);
        return this;
    }

    public ClusterImageWhereInput localIdNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_NOT);
        return this;
    }

    public void setLocalIdNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_NOT);
        }
    }

    public boolean getLocalIdNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID_NOT);
    }

    public ClusterImageWhereInput localIdNotContains(String localIdNotContains) {

        this.localIdNotContains = localIdNotContains;
        return this;
    }

    /**
     * Get localIdNotContains
     *
     * @return localIdNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalIdNotContains() {
        return localIdNotContains;
    }

    public void setLocalIdNotContains(String localIdNotContains) {
        this.localIdNotContains = localIdNotContains;
    }

    public ClusterImageWhereInput localIdNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_CONTAINS);
        return this;
    }

    public ClusterImageWhereInput localIdNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_NOT_CONTAINS);
        return this;
    }

    public void setLocalIdNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_NOT_CONTAINS);
        }
    }

    public boolean getLocalIdNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID_NOT_CONTAINS);
    }

    public ClusterImageWhereInput localIdNotEndsWith(String localIdNotEndsWith) {

        this.localIdNotEndsWith = localIdNotEndsWith;
        return this;
    }

    /**
     * Get localIdNotEndsWith
     *
     * @return localIdNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalIdNotEndsWith() {
        return localIdNotEndsWith;
    }

    public void setLocalIdNotEndsWith(String localIdNotEndsWith) {
        this.localIdNotEndsWith = localIdNotEndsWith;
    }

    public ClusterImageWhereInput localIdNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_ENDS_WITH);
        return this;
    }

    public ClusterImageWhereInput localIdNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_NOT_ENDS_WITH);
        return this;
    }

    public void setLocalIdNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_NOT_ENDS_WITH);
        }
    }

    public boolean getLocalIdNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID_NOT_ENDS_WITH);
    }

    public ClusterImageWhereInput localIdNotIn(List<String> localIdNotIn) {

        this.localIdNotIn = localIdNotIn;
        return this;
    }

    public ClusterImageWhereInput addLocalIdNotInItem(String localIdNotInItem) {
        if (this.localIdNotIn == null) {
            this.localIdNotIn = new ArrayList<String>();
        }
        this.localIdNotIn.add(localIdNotInItem);
        return this;
    }

    /**
     * Get localIdNotIn
     *
     * @return localIdNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getLocalIdNotIn() {
        return localIdNotIn;
    }

    public void setLocalIdNotIn(List<String> localIdNotIn) {
        this.localIdNotIn = localIdNotIn;
    }

    public ClusterImageWhereInput localIdNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_IN);
        return this;
    }

    public ClusterImageWhereInput localIdNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_NOT_IN);
        return this;
    }

    public void setLocalIdNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_NOT_IN);
        }
    }

    public boolean getLocalIdNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID_NOT_IN);
    }

    public ClusterImageWhereInput localIdNotStartsWith(String localIdNotStartsWith) {

        this.localIdNotStartsWith = localIdNotStartsWith;
        return this;
    }

    /**
     * Get localIdNotStartsWith
     *
     * @return localIdNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalIdNotStartsWith() {
        return localIdNotStartsWith;
    }

    public void setLocalIdNotStartsWith(String localIdNotStartsWith) {
        this.localIdNotStartsWith = localIdNotStartsWith;
    }

    public ClusterImageWhereInput localIdNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_STARTS_WITH);
        return this;
    }

    public ClusterImageWhereInput localIdNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_NOT_STARTS_WITH);
        return this;
    }

    public void setLocalIdNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_NOT_STARTS_WITH);
        }
    }

    public boolean getLocalIdNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID_NOT_STARTS_WITH);
    }

    public ClusterImageWhereInput localIdStartsWith(String localIdStartsWith) {

        this.localIdStartsWith = localIdStartsWith;
        return this;
    }

    /**
     * Get localIdStartsWith
     *
     * @return localIdStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalIdStartsWith() {
        return localIdStartsWith;
    }

    public void setLocalIdStartsWith(String localIdStartsWith) {
        this.localIdStartsWith = localIdStartsWith;
    }

    public ClusterImageWhereInput localIdStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_STARTS_WITH);
        return this;
    }

    public ClusterImageWhereInput localIdStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_STARTS_WITH);
        return this;
    }

    public void setLocalIdStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_STARTS_WITH);
        }
    }

    public boolean getLocalIdStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID_STARTS_WITH);
    }

    public ClusterImageWhereInput metaName(String metaName) {

        this.metaName = metaName;
        return this;
    }

    /**
     * Get metaName
     *
     * @return metaName
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMetaName() {
        return metaName;
    }

    public void setMetaName(String metaName) {
        this.metaName = metaName;
    }

    public ClusterImageWhereInput metaName_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_META_NAME);
        return this;
    }

    public ClusterImageWhereInput metaName_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_META_NAME);
        return this;
    }

    public void setMetaName_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_META_NAME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_META_NAME);
        }
    }

    public boolean getMetaName_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_META_NAME);
    }

    public ClusterImageWhereInput metaNameContains(String metaNameContains) {

        this.metaNameContains = metaNameContains;
        return this;
    }

    /**
     * Get metaNameContains
     *
     * @return metaNameContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMetaNameContains() {
        return metaNameContains;
    }

    public void setMetaNameContains(String metaNameContains) {
        this.metaNameContains = metaNameContains;
    }

    public ClusterImageWhereInput metaNameContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_META_NAME_CONTAINS);
        return this;
    }

    public ClusterImageWhereInput metaNameContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_META_NAME_CONTAINS);
        return this;
    }

    public void setMetaNameContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_META_NAME_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_META_NAME_CONTAINS);
        }
    }

    public boolean getMetaNameContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_META_NAME_CONTAINS);
    }

    public ClusterImageWhereInput metaNameEndsWith(String metaNameEndsWith) {

        this.metaNameEndsWith = metaNameEndsWith;
        return this;
    }

    /**
     * Get metaNameEndsWith
     *
     * @return metaNameEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMetaNameEndsWith() {
        return metaNameEndsWith;
    }

    public void setMetaNameEndsWith(String metaNameEndsWith) {
        this.metaNameEndsWith = metaNameEndsWith;
    }

    public ClusterImageWhereInput metaNameEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_META_NAME_ENDS_WITH);
        return this;
    }

    public ClusterImageWhereInput metaNameEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_META_NAME_ENDS_WITH);
        return this;
    }

    public void setMetaNameEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_META_NAME_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_META_NAME_ENDS_WITH);
        }
    }

    public boolean getMetaNameEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_META_NAME_ENDS_WITH);
    }

    public ClusterImageWhereInput metaNameGt(String metaNameGt) {

        this.metaNameGt = metaNameGt;
        return this;
    }

    /**
     * Get metaNameGt
     *
     * @return metaNameGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMetaNameGt() {
        return metaNameGt;
    }

    public void setMetaNameGt(String metaNameGt) {
        this.metaNameGt = metaNameGt;
    }

    public ClusterImageWhereInput metaNameGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_META_NAME_GT);
        return this;
    }

    public ClusterImageWhereInput metaNameGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_META_NAME_GT);
        return this;
    }

    public void setMetaNameGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_META_NAME_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_META_NAME_GT);
        }
    }

    public boolean getMetaNameGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_META_NAME_GT);
    }

    public ClusterImageWhereInput metaNameGte(String metaNameGte) {

        this.metaNameGte = metaNameGte;
        return this;
    }

    /**
     * Get metaNameGte
     *
     * @return metaNameGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMetaNameGte() {
        return metaNameGte;
    }

    public void setMetaNameGte(String metaNameGte) {
        this.metaNameGte = metaNameGte;
    }

    public ClusterImageWhereInput metaNameGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_META_NAME_GTE);
        return this;
    }

    public ClusterImageWhereInput metaNameGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_META_NAME_GTE);
        return this;
    }

    public void setMetaNameGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_META_NAME_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_META_NAME_GTE);
        }
    }

    public boolean getMetaNameGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_META_NAME_GTE);
    }

    public ClusterImageWhereInput metaNameIn(List<String> metaNameIn) {

        this.metaNameIn = metaNameIn;
        return this;
    }

    public ClusterImageWhereInput addMetaNameInItem(String metaNameInItem) {
        if (this.metaNameIn == null) {
            this.metaNameIn = new ArrayList<String>();
        }
        this.metaNameIn.add(metaNameInItem);
        return this;
    }

    /**
     * Get metaNameIn
     *
     * @return metaNameIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getMetaNameIn() {
        return metaNameIn;
    }

    public void setMetaNameIn(List<String> metaNameIn) {
        this.metaNameIn = metaNameIn;
    }

    public ClusterImageWhereInput metaNameIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_META_NAME_IN);
        return this;
    }

    public ClusterImageWhereInput metaNameIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_META_NAME_IN);
        return this;
    }

    public void setMetaNameIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_META_NAME_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_META_NAME_IN);
        }
    }

    public boolean getMetaNameIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_META_NAME_IN);
    }

    public ClusterImageWhereInput metaNameLt(String metaNameLt) {

        this.metaNameLt = metaNameLt;
        return this;
    }

    /**
     * Get metaNameLt
     *
     * @return metaNameLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMetaNameLt() {
        return metaNameLt;
    }

    public void setMetaNameLt(String metaNameLt) {
        this.metaNameLt = metaNameLt;
    }

    public ClusterImageWhereInput metaNameLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_META_NAME_LT);
        return this;
    }

    public ClusterImageWhereInput metaNameLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_META_NAME_LT);
        return this;
    }

    public void setMetaNameLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_META_NAME_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_META_NAME_LT);
        }
    }

    public boolean getMetaNameLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_META_NAME_LT);
    }

    public ClusterImageWhereInput metaNameLte(String metaNameLte) {

        this.metaNameLte = metaNameLte;
        return this;
    }

    /**
     * Get metaNameLte
     *
     * @return metaNameLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMetaNameLte() {
        return metaNameLte;
    }

    public void setMetaNameLte(String metaNameLte) {
        this.metaNameLte = metaNameLte;
    }

    public ClusterImageWhereInput metaNameLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_META_NAME_LTE);
        return this;
    }

    public ClusterImageWhereInput metaNameLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_META_NAME_LTE);
        return this;
    }

    public void setMetaNameLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_META_NAME_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_META_NAME_LTE);
        }
    }

    public boolean getMetaNameLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_META_NAME_LTE);
    }

    public ClusterImageWhereInput metaNameNot(String metaNameNot) {

        this.metaNameNot = metaNameNot;
        return this;
    }

    /**
     * Get metaNameNot
     *
     * @return metaNameNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMetaNameNot() {
        return metaNameNot;
    }

    public void setMetaNameNot(String metaNameNot) {
        this.metaNameNot = metaNameNot;
    }

    public ClusterImageWhereInput metaNameNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_META_NAME_NOT);
        return this;
    }

    public ClusterImageWhereInput metaNameNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_META_NAME_NOT);
        return this;
    }

    public void setMetaNameNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_META_NAME_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_META_NAME_NOT);
        }
    }

    public boolean getMetaNameNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_META_NAME_NOT);
    }

    public ClusterImageWhereInput metaNameNotContains(String metaNameNotContains) {

        this.metaNameNotContains = metaNameNotContains;
        return this;
    }

    /**
     * Get metaNameNotContains
     *
     * @return metaNameNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMetaNameNotContains() {
        return metaNameNotContains;
    }

    public void setMetaNameNotContains(String metaNameNotContains) {
        this.metaNameNotContains = metaNameNotContains;
    }

    public ClusterImageWhereInput metaNameNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_META_NAME_NOT_CONTAINS);
        return this;
    }

    public ClusterImageWhereInput metaNameNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_META_NAME_NOT_CONTAINS);
        return this;
    }

    public void setMetaNameNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_META_NAME_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_META_NAME_NOT_CONTAINS);
        }
    }

    public boolean getMetaNameNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_META_NAME_NOT_CONTAINS);
    }

    public ClusterImageWhereInput metaNameNotEndsWith(String metaNameNotEndsWith) {

        this.metaNameNotEndsWith = metaNameNotEndsWith;
        return this;
    }

    /**
     * Get metaNameNotEndsWith
     *
     * @return metaNameNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMetaNameNotEndsWith() {
        return metaNameNotEndsWith;
    }

    public void setMetaNameNotEndsWith(String metaNameNotEndsWith) {
        this.metaNameNotEndsWith = metaNameNotEndsWith;
    }

    public ClusterImageWhereInput metaNameNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_META_NAME_NOT_ENDS_WITH);
        return this;
    }

    public ClusterImageWhereInput metaNameNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_META_NAME_NOT_ENDS_WITH);
        return this;
    }

    public void setMetaNameNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_META_NAME_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_META_NAME_NOT_ENDS_WITH);
        }
    }

    public boolean getMetaNameNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_META_NAME_NOT_ENDS_WITH);
    }

    public ClusterImageWhereInput metaNameNotIn(List<String> metaNameNotIn) {

        this.metaNameNotIn = metaNameNotIn;
        return this;
    }

    public ClusterImageWhereInput addMetaNameNotInItem(String metaNameNotInItem) {
        if (this.metaNameNotIn == null) {
            this.metaNameNotIn = new ArrayList<String>();
        }
        this.metaNameNotIn.add(metaNameNotInItem);
        return this;
    }

    /**
     * Get metaNameNotIn
     *
     * @return metaNameNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getMetaNameNotIn() {
        return metaNameNotIn;
    }

    public void setMetaNameNotIn(List<String> metaNameNotIn) {
        this.metaNameNotIn = metaNameNotIn;
    }

    public ClusterImageWhereInput metaNameNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_META_NAME_NOT_IN);
        return this;
    }

    public ClusterImageWhereInput metaNameNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_META_NAME_NOT_IN);
        return this;
    }

    public void setMetaNameNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_META_NAME_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_META_NAME_NOT_IN);
        }
    }

    public boolean getMetaNameNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_META_NAME_NOT_IN);
    }

    public ClusterImageWhereInput metaNameNotStartsWith(String metaNameNotStartsWith) {

        this.metaNameNotStartsWith = metaNameNotStartsWith;
        return this;
    }

    /**
     * Get metaNameNotStartsWith
     *
     * @return metaNameNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMetaNameNotStartsWith() {
        return metaNameNotStartsWith;
    }

    public void setMetaNameNotStartsWith(String metaNameNotStartsWith) {
        this.metaNameNotStartsWith = metaNameNotStartsWith;
    }

    public ClusterImageWhereInput metaNameNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_META_NAME_NOT_STARTS_WITH);
        return this;
    }

    public ClusterImageWhereInput metaNameNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_META_NAME_NOT_STARTS_WITH);
        return this;
    }

    public void setMetaNameNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_META_NAME_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_META_NAME_NOT_STARTS_WITH);
        }
    }

    public boolean getMetaNameNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_META_NAME_NOT_STARTS_WITH);
    }

    public ClusterImageWhereInput metaNameStartsWith(String metaNameStartsWith) {

        this.metaNameStartsWith = metaNameStartsWith;
        return this;
    }

    /**
     * Get metaNameStartsWith
     *
     * @return metaNameStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMetaNameStartsWith() {
        return metaNameStartsWith;
    }

    public void setMetaNameStartsWith(String metaNameStartsWith) {
        this.metaNameStartsWith = metaNameStartsWith;
    }

    public ClusterImageWhereInput metaNameStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_META_NAME_STARTS_WITH);
        return this;
    }

    public ClusterImageWhereInput metaNameStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_META_NAME_STARTS_WITH);
        return this;
    }

    public void setMetaNameStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_META_NAME_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_META_NAME_STARTS_WITH);
        }
    }

    public boolean getMetaNameStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_META_NAME_STARTS_WITH);
    }

    public ClusterImageWhereInput metaSize(Long metaSize) {

        this.metaSize = metaSize;
        return this;
    }

    /**
     * Get metaSize
     *
     * @return metaSize
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getMetaSize() {
        return metaSize;
    }

    public void setMetaSize(Long metaSize) {
        this.metaSize = metaSize;
    }

    public ClusterImageWhereInput metaSize_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_META_SIZE);
        return this;
    }

    public ClusterImageWhereInput metaSize_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_META_SIZE);
        return this;
    }

    public void setMetaSize_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_META_SIZE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_META_SIZE);
        }
    }

    public boolean getMetaSize_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_META_SIZE);
    }

    public ClusterImageWhereInput metaSizeGt(Long metaSizeGt) {

        this.metaSizeGt = metaSizeGt;
        return this;
    }

    /**
     * Get metaSizeGt
     *
     * @return metaSizeGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getMetaSizeGt() {
        return metaSizeGt;
    }

    public void setMetaSizeGt(Long metaSizeGt) {
        this.metaSizeGt = metaSizeGt;
    }

    public ClusterImageWhereInput metaSizeGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_META_SIZE_GT);
        return this;
    }

    public ClusterImageWhereInput metaSizeGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_META_SIZE_GT);
        return this;
    }

    public void setMetaSizeGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_META_SIZE_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_META_SIZE_GT);
        }
    }

    public boolean getMetaSizeGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_META_SIZE_GT);
    }

    public ClusterImageWhereInput metaSizeGte(Long metaSizeGte) {

        this.metaSizeGte = metaSizeGte;
        return this;
    }

    /**
     * Get metaSizeGte
     *
     * @return metaSizeGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getMetaSizeGte() {
        return metaSizeGte;
    }

    public void setMetaSizeGte(Long metaSizeGte) {
        this.metaSizeGte = metaSizeGte;
    }

    public ClusterImageWhereInput metaSizeGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_META_SIZE_GTE);
        return this;
    }

    public ClusterImageWhereInput metaSizeGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_META_SIZE_GTE);
        return this;
    }

    public void setMetaSizeGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_META_SIZE_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_META_SIZE_GTE);
        }
    }

    public boolean getMetaSizeGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_META_SIZE_GTE);
    }

    public ClusterImageWhereInput metaSizeIn(List<Long> metaSizeIn) {

        this.metaSizeIn = metaSizeIn;
        return this;
    }

    public ClusterImageWhereInput addMetaSizeInItem(Long metaSizeInItem) {
        if (this.metaSizeIn == null) {
            this.metaSizeIn = new ArrayList<Long>();
        }
        this.metaSizeIn.add(metaSizeInItem);
        return this;
    }

    /**
     * Get metaSizeIn
     *
     * @return metaSizeIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getMetaSizeIn() {
        return metaSizeIn;
    }

    public void setMetaSizeIn(List<Long> metaSizeIn) {
        this.metaSizeIn = metaSizeIn;
    }

    public ClusterImageWhereInput metaSizeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_META_SIZE_IN);
        return this;
    }

    public ClusterImageWhereInput metaSizeIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_META_SIZE_IN);
        return this;
    }

    public void setMetaSizeIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_META_SIZE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_META_SIZE_IN);
        }
    }

    public boolean getMetaSizeIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_META_SIZE_IN);
    }

    public ClusterImageWhereInput metaSizeLt(Long metaSizeLt) {

        this.metaSizeLt = metaSizeLt;
        return this;
    }

    /**
     * Get metaSizeLt
     *
     * @return metaSizeLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getMetaSizeLt() {
        return metaSizeLt;
    }

    public void setMetaSizeLt(Long metaSizeLt) {
        this.metaSizeLt = metaSizeLt;
    }

    public ClusterImageWhereInput metaSizeLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_META_SIZE_LT);
        return this;
    }

    public ClusterImageWhereInput metaSizeLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_META_SIZE_LT);
        return this;
    }

    public void setMetaSizeLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_META_SIZE_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_META_SIZE_LT);
        }
    }

    public boolean getMetaSizeLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_META_SIZE_LT);
    }

    public ClusterImageWhereInput metaSizeLte(Long metaSizeLte) {

        this.metaSizeLte = metaSizeLte;
        return this;
    }

    /**
     * Get metaSizeLte
     *
     * @return metaSizeLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getMetaSizeLte() {
        return metaSizeLte;
    }

    public void setMetaSizeLte(Long metaSizeLte) {
        this.metaSizeLte = metaSizeLte;
    }

    public ClusterImageWhereInput metaSizeLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_META_SIZE_LTE);
        return this;
    }

    public ClusterImageWhereInput metaSizeLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_META_SIZE_LTE);
        return this;
    }

    public void setMetaSizeLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_META_SIZE_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_META_SIZE_LTE);
        }
    }

    public boolean getMetaSizeLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_META_SIZE_LTE);
    }

    public ClusterImageWhereInput metaSizeNot(Long metaSizeNot) {

        this.metaSizeNot = metaSizeNot;
        return this;
    }

    /**
     * Get metaSizeNot
     *
     * @return metaSizeNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getMetaSizeNot() {
        return metaSizeNot;
    }

    public void setMetaSizeNot(Long metaSizeNot) {
        this.metaSizeNot = metaSizeNot;
    }

    public ClusterImageWhereInput metaSizeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_META_SIZE_NOT);
        return this;
    }

    public ClusterImageWhereInput metaSizeNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_META_SIZE_NOT);
        return this;
    }

    public void setMetaSizeNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_META_SIZE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_META_SIZE_NOT);
        }
    }

    public boolean getMetaSizeNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_META_SIZE_NOT);
    }

    public ClusterImageWhereInput metaSizeNotIn(List<Long> metaSizeNotIn) {

        this.metaSizeNotIn = metaSizeNotIn;
        return this;
    }

    public ClusterImageWhereInput addMetaSizeNotInItem(Long metaSizeNotInItem) {
        if (this.metaSizeNotIn == null) {
            this.metaSizeNotIn = new ArrayList<Long>();
        }
        this.metaSizeNotIn.add(metaSizeNotInItem);
        return this;
    }

    /**
     * Get metaSizeNotIn
     *
     * @return metaSizeNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getMetaSizeNotIn() {
        return metaSizeNotIn;
    }

    public void setMetaSizeNotIn(List<Long> metaSizeNotIn) {
        this.metaSizeNotIn = metaSizeNotIn;
    }

    public ClusterImageWhereInput metaSizeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_META_SIZE_NOT_IN);
        return this;
    }

    public ClusterImageWhereInput metaSizeNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_META_SIZE_NOT_IN);
        return this;
    }

    public void setMetaSizeNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_META_SIZE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_META_SIZE_NOT_IN);
        }
    }

    public boolean getMetaSizeNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_META_SIZE_NOT_IN);
    }

    public ClusterImageWhereInput name(String name) {

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

    public ClusterImageWhereInput name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public ClusterImageWhereInput name_ExplictlyNonNull() {
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

    public ClusterImageWhereInput nameContains(String nameContains) {

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

    public ClusterImageWhereInput nameContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_CONTAINS);
        return this;
    }

    public ClusterImageWhereInput nameContains_ExplictlyNonNull() {
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

    public ClusterImageWhereInput nameEndsWith(String nameEndsWith) {

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

    public ClusterImageWhereInput nameEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_ENDS_WITH);
        return this;
    }

    public ClusterImageWhereInput nameEndsWith_ExplictlyNonNull() {
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

    public ClusterImageWhereInput nameGt(String nameGt) {

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

    public ClusterImageWhereInput nameGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_GT);
        return this;
    }

    public ClusterImageWhereInput nameGt_ExplictlyNonNull() {
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

    public ClusterImageWhereInput nameGte(String nameGte) {

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

    public ClusterImageWhereInput nameGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_GTE);
        return this;
    }

    public ClusterImageWhereInput nameGte_ExplictlyNonNull() {
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

    public ClusterImageWhereInput nameIn(List<String> nameIn) {

        this.nameIn = nameIn;
        return this;
    }

    public ClusterImageWhereInput addNameInItem(String nameInItem) {
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

    public ClusterImageWhereInput nameIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_IN);
        return this;
    }

    public ClusterImageWhereInput nameIn_ExplictlyNonNull() {
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

    public ClusterImageWhereInput nameLt(String nameLt) {

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

    public ClusterImageWhereInput nameLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_LT);
        return this;
    }

    public ClusterImageWhereInput nameLt_ExplictlyNonNull() {
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

    public ClusterImageWhereInput nameLte(String nameLte) {

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

    public ClusterImageWhereInput nameLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_LTE);
        return this;
    }

    public ClusterImageWhereInput nameLte_ExplictlyNonNull() {
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

    public ClusterImageWhereInput nameNot(String nameNot) {

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

    public ClusterImageWhereInput nameNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT);
        return this;
    }

    public ClusterImageWhereInput nameNot_ExplictlyNonNull() {
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

    public ClusterImageWhereInput nameNotContains(String nameNotContains) {

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

    public ClusterImageWhereInput nameNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_CONTAINS);
        return this;
    }

    public ClusterImageWhereInput nameNotContains_ExplictlyNonNull() {
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

    public ClusterImageWhereInput nameNotEndsWith(String nameNotEndsWith) {

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

    public ClusterImageWhereInput nameNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_ENDS_WITH);
        return this;
    }

    public ClusterImageWhereInput nameNotEndsWith_ExplictlyNonNull() {
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

    public ClusterImageWhereInput nameNotIn(List<String> nameNotIn) {

        this.nameNotIn = nameNotIn;
        return this;
    }

    public ClusterImageWhereInput addNameNotInItem(String nameNotInItem) {
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

    public ClusterImageWhereInput nameNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_IN);
        return this;
    }

    public ClusterImageWhereInput nameNotIn_ExplictlyNonNull() {
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

    public ClusterImageWhereInput nameNotStartsWith(String nameNotStartsWith) {

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

    public ClusterImageWhereInput nameNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_STARTS_WITH);
        return this;
    }

    public ClusterImageWhereInput nameNotStartsWith_ExplictlyNonNull() {
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

    public ClusterImageWhereInput nameStartsWith(String nameStartsWith) {

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

    public ClusterImageWhereInput nameStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_STARTS_WITH);
        return this;
    }

    public ClusterImageWhereInput nameStartsWith_ExplictlyNonNull() {
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

    public ClusterImageWhereInput size(Long size) {

        this.size = size;
        return this;
    }

    /**
     * Get size
     *
     * @return size
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public ClusterImageWhereInput size_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIZE);
        return this;
    }

    public ClusterImageWhereInput size_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SIZE);
        return this;
    }

    public void setSize_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SIZE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SIZE);
        }
    }

    public boolean getSize_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SIZE);
    }

    public ClusterImageWhereInput sizeGt(Long sizeGt) {

        this.sizeGt = sizeGt;
        return this;
    }

    /**
     * Get sizeGt
     *
     * @return sizeGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getSizeGt() {
        return sizeGt;
    }

    public void setSizeGt(Long sizeGt) {
        this.sizeGt = sizeGt;
    }

    public ClusterImageWhereInput sizeGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIZE_GT);
        return this;
    }

    public ClusterImageWhereInput sizeGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SIZE_GT);
        return this;
    }

    public void setSizeGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SIZE_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SIZE_GT);
        }
    }

    public boolean getSizeGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SIZE_GT);
    }

    public ClusterImageWhereInput sizeGte(Long sizeGte) {

        this.sizeGte = sizeGte;
        return this;
    }

    /**
     * Get sizeGte
     *
     * @return sizeGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getSizeGte() {
        return sizeGte;
    }

    public void setSizeGte(Long sizeGte) {
        this.sizeGte = sizeGte;
    }

    public ClusterImageWhereInput sizeGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIZE_GTE);
        return this;
    }

    public ClusterImageWhereInput sizeGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SIZE_GTE);
        return this;
    }

    public void setSizeGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SIZE_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SIZE_GTE);
        }
    }

    public boolean getSizeGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SIZE_GTE);
    }

    public ClusterImageWhereInput sizeIn(List<Long> sizeIn) {

        this.sizeIn = sizeIn;
        return this;
    }

    public ClusterImageWhereInput addSizeInItem(Long sizeInItem) {
        if (this.sizeIn == null) {
            this.sizeIn = new ArrayList<Long>();
        }
        this.sizeIn.add(sizeInItem);
        return this;
    }

    /**
     * Get sizeIn
     *
     * @return sizeIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getSizeIn() {
        return sizeIn;
    }

    public void setSizeIn(List<Long> sizeIn) {
        this.sizeIn = sizeIn;
    }

    public ClusterImageWhereInput sizeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIZE_IN);
        return this;
    }

    public ClusterImageWhereInput sizeIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SIZE_IN);
        return this;
    }

    public void setSizeIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SIZE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SIZE_IN);
        }
    }

    public boolean getSizeIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SIZE_IN);
    }

    public ClusterImageWhereInput sizeLt(Long sizeLt) {

        this.sizeLt = sizeLt;
        return this;
    }

    /**
     * Get sizeLt
     *
     * @return sizeLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getSizeLt() {
        return sizeLt;
    }

    public void setSizeLt(Long sizeLt) {
        this.sizeLt = sizeLt;
    }

    public ClusterImageWhereInput sizeLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIZE_LT);
        return this;
    }

    public ClusterImageWhereInput sizeLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SIZE_LT);
        return this;
    }

    public void setSizeLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SIZE_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SIZE_LT);
        }
    }

    public boolean getSizeLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SIZE_LT);
    }

    public ClusterImageWhereInput sizeLte(Long sizeLte) {

        this.sizeLte = sizeLte;
        return this;
    }

    /**
     * Get sizeLte
     *
     * @return sizeLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getSizeLte() {
        return sizeLte;
    }

    public void setSizeLte(Long sizeLte) {
        this.sizeLte = sizeLte;
    }

    public ClusterImageWhereInput sizeLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIZE_LTE);
        return this;
    }

    public ClusterImageWhereInput sizeLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SIZE_LTE);
        return this;
    }

    public void setSizeLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SIZE_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SIZE_LTE);
        }
    }

    public boolean getSizeLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SIZE_LTE);
    }

    public ClusterImageWhereInput sizeNot(Long sizeNot) {

        this.sizeNot = sizeNot;
        return this;
    }

    /**
     * Get sizeNot
     *
     * @return sizeNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getSizeNot() {
        return sizeNot;
    }

    public void setSizeNot(Long sizeNot) {
        this.sizeNot = sizeNot;
    }

    public ClusterImageWhereInput sizeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIZE_NOT);
        return this;
    }

    public ClusterImageWhereInput sizeNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SIZE_NOT);
        return this;
    }

    public void setSizeNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SIZE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SIZE_NOT);
        }
    }

    public boolean getSizeNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SIZE_NOT);
    }

    public ClusterImageWhereInput sizeNotIn(List<Long> sizeNotIn) {

        this.sizeNotIn = sizeNotIn;
        return this;
    }

    public ClusterImageWhereInput addSizeNotInItem(Long sizeNotInItem) {
        if (this.sizeNotIn == null) {
            this.sizeNotIn = new ArrayList<Long>();
        }
        this.sizeNotIn.add(sizeNotInItem);
        return this;
    }

    /**
     * Get sizeNotIn
     *
     * @return sizeNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getSizeNotIn() {
        return sizeNotIn;
    }

    public void setSizeNotIn(List<Long> sizeNotIn) {
        this.sizeNotIn = sizeNotIn;
    }

    public ClusterImageWhereInput sizeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIZE_NOT_IN);
        return this;
    }

    public ClusterImageWhereInput sizeNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SIZE_NOT_IN);
        return this;
    }

    public void setSizeNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SIZE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SIZE_NOT_IN);
        }
    }

    public boolean getSizeNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SIZE_NOT_IN);
    }

    public ClusterImageWhereInput upgradeToolVersion(String upgradeToolVersion) {

        this.upgradeToolVersion = upgradeToolVersion;
        return this;
    }

    /**
     * Get upgradeToolVersion
     *
     * @return upgradeToolVersion
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUpgradeToolVersion() {
        return upgradeToolVersion;
    }

    public void setUpgradeToolVersion(String upgradeToolVersion) {
        this.upgradeToolVersion = upgradeToolVersion;
    }

    public ClusterImageWhereInput upgradeToolVersion_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPGRADE_TOOL_VERSION);
        return this;
    }

    public ClusterImageWhereInput upgradeToolVersion_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UPGRADE_TOOL_VERSION);
        return this;
    }

    public void setUpgradeToolVersion_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UPGRADE_TOOL_VERSION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UPGRADE_TOOL_VERSION);
        }
    }

    public boolean getUpgradeToolVersion_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UPGRADE_TOOL_VERSION);
    }

    public ClusterImageWhereInput upgradeToolVersionContains(String upgradeToolVersionContains) {

        this.upgradeToolVersionContains = upgradeToolVersionContains;
        return this;
    }

    /**
     * Get upgradeToolVersionContains
     *
     * @return upgradeToolVersionContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUpgradeToolVersionContains() {
        return upgradeToolVersionContains;
    }

    public void setUpgradeToolVersionContains(String upgradeToolVersionContains) {
        this.upgradeToolVersionContains = upgradeToolVersionContains;
    }

    public ClusterImageWhereInput upgradeToolVersionContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_CONTAINS);
        return this;
    }

    public ClusterImageWhereInput upgradeToolVersionContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_CONTAINS);
        return this;
    }

    public void setUpgradeToolVersionContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_CONTAINS);
        }
    }

    public boolean getUpgradeToolVersionContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_CONTAINS);
    }

    public ClusterImageWhereInput upgradeToolVersionEndsWith(String upgradeToolVersionEndsWith) {

        this.upgradeToolVersionEndsWith = upgradeToolVersionEndsWith;
        return this;
    }

    /**
     * Get upgradeToolVersionEndsWith
     *
     * @return upgradeToolVersionEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUpgradeToolVersionEndsWith() {
        return upgradeToolVersionEndsWith;
    }

    public void setUpgradeToolVersionEndsWith(String upgradeToolVersionEndsWith) {
        this.upgradeToolVersionEndsWith = upgradeToolVersionEndsWith;
    }

    public ClusterImageWhereInput upgradeToolVersionEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_ENDS_WITH);
        return this;
    }

    public ClusterImageWhereInput upgradeToolVersionEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_ENDS_WITH);
        return this;
    }

    public void setUpgradeToolVersionEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_ENDS_WITH);
        }
    }

    public boolean getUpgradeToolVersionEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_ENDS_WITH);
    }

    public ClusterImageWhereInput upgradeToolVersionGt(String upgradeToolVersionGt) {

        this.upgradeToolVersionGt = upgradeToolVersionGt;
        return this;
    }

    /**
     * Get upgradeToolVersionGt
     *
     * @return upgradeToolVersionGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUpgradeToolVersionGt() {
        return upgradeToolVersionGt;
    }

    public void setUpgradeToolVersionGt(String upgradeToolVersionGt) {
        this.upgradeToolVersionGt = upgradeToolVersionGt;
    }

    public ClusterImageWhereInput upgradeToolVersionGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_GT);
        return this;
    }

    public ClusterImageWhereInput upgradeToolVersionGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_GT);
        return this;
    }

    public void setUpgradeToolVersionGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_GT);
        }
    }

    public boolean getUpgradeToolVersionGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_GT);
    }

    public ClusterImageWhereInput upgradeToolVersionGte(String upgradeToolVersionGte) {

        this.upgradeToolVersionGte = upgradeToolVersionGte;
        return this;
    }

    /**
     * Get upgradeToolVersionGte
     *
     * @return upgradeToolVersionGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUpgradeToolVersionGte() {
        return upgradeToolVersionGte;
    }

    public void setUpgradeToolVersionGte(String upgradeToolVersionGte) {
        this.upgradeToolVersionGte = upgradeToolVersionGte;
    }

    public ClusterImageWhereInput upgradeToolVersionGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_GTE);
        return this;
    }

    public ClusterImageWhereInput upgradeToolVersionGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_GTE);
        return this;
    }

    public void setUpgradeToolVersionGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_GTE);
        }
    }

    public boolean getUpgradeToolVersionGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_GTE);
    }

    public ClusterImageWhereInput upgradeToolVersionIn(List<String> upgradeToolVersionIn) {

        this.upgradeToolVersionIn = upgradeToolVersionIn;
        return this;
    }

    public ClusterImageWhereInput addUpgradeToolVersionInItem(String upgradeToolVersionInItem) {
        if (this.upgradeToolVersionIn == null) {
            this.upgradeToolVersionIn = new ArrayList<String>();
        }
        this.upgradeToolVersionIn.add(upgradeToolVersionInItem);
        return this;
    }

    /**
     * Get upgradeToolVersionIn
     *
     * @return upgradeToolVersionIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getUpgradeToolVersionIn() {
        return upgradeToolVersionIn;
    }

    public void setUpgradeToolVersionIn(List<String> upgradeToolVersionIn) {
        this.upgradeToolVersionIn = upgradeToolVersionIn;
    }

    public ClusterImageWhereInput upgradeToolVersionIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_IN);
        return this;
    }

    public ClusterImageWhereInput upgradeToolVersionIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_IN);
        return this;
    }

    public void setUpgradeToolVersionIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_IN);
        }
    }

    public boolean getUpgradeToolVersionIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_IN);
    }

    public ClusterImageWhereInput upgradeToolVersionLt(String upgradeToolVersionLt) {

        this.upgradeToolVersionLt = upgradeToolVersionLt;
        return this;
    }

    /**
     * Get upgradeToolVersionLt
     *
     * @return upgradeToolVersionLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUpgradeToolVersionLt() {
        return upgradeToolVersionLt;
    }

    public void setUpgradeToolVersionLt(String upgradeToolVersionLt) {
        this.upgradeToolVersionLt = upgradeToolVersionLt;
    }

    public ClusterImageWhereInput upgradeToolVersionLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_LT);
        return this;
    }

    public ClusterImageWhereInput upgradeToolVersionLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_LT);
        return this;
    }

    public void setUpgradeToolVersionLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_LT);
        }
    }

    public boolean getUpgradeToolVersionLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_LT);
    }

    public ClusterImageWhereInput upgradeToolVersionLte(String upgradeToolVersionLte) {

        this.upgradeToolVersionLte = upgradeToolVersionLte;
        return this;
    }

    /**
     * Get upgradeToolVersionLte
     *
     * @return upgradeToolVersionLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUpgradeToolVersionLte() {
        return upgradeToolVersionLte;
    }

    public void setUpgradeToolVersionLte(String upgradeToolVersionLte) {
        this.upgradeToolVersionLte = upgradeToolVersionLte;
    }

    public ClusterImageWhereInput upgradeToolVersionLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_LTE);
        return this;
    }

    public ClusterImageWhereInput upgradeToolVersionLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_LTE);
        return this;
    }

    public void setUpgradeToolVersionLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_LTE);
        }
    }

    public boolean getUpgradeToolVersionLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_LTE);
    }

    public ClusterImageWhereInput upgradeToolVersionNot(String upgradeToolVersionNot) {

        this.upgradeToolVersionNot = upgradeToolVersionNot;
        return this;
    }

    /**
     * Get upgradeToolVersionNot
     *
     * @return upgradeToolVersionNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUpgradeToolVersionNot() {
        return upgradeToolVersionNot;
    }

    public void setUpgradeToolVersionNot(String upgradeToolVersionNot) {
        this.upgradeToolVersionNot = upgradeToolVersionNot;
    }

    public ClusterImageWhereInput upgradeToolVersionNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_NOT);
        return this;
    }

    public ClusterImageWhereInput upgradeToolVersionNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_NOT);
        return this;
    }

    public void setUpgradeToolVersionNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_NOT);
        }
    }

    public boolean getUpgradeToolVersionNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_NOT);
    }

    public ClusterImageWhereInput upgradeToolVersionNotContains(
            String upgradeToolVersionNotContains) {

        this.upgradeToolVersionNotContains = upgradeToolVersionNotContains;
        return this;
    }

    /**
     * Get upgradeToolVersionNotContains
     *
     * @return upgradeToolVersionNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUpgradeToolVersionNotContains() {
        return upgradeToolVersionNotContains;
    }

    public void setUpgradeToolVersionNotContains(String upgradeToolVersionNotContains) {
        this.upgradeToolVersionNotContains = upgradeToolVersionNotContains;
    }

    public ClusterImageWhereInput upgradeToolVersionNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_NOT_CONTAINS);
        return this;
    }

    public ClusterImageWhereInput upgradeToolVersionNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_NOT_CONTAINS);
        return this;
    }

    public void setUpgradeToolVersionNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_NOT_CONTAINS);
        }
    }

    public boolean getUpgradeToolVersionNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_NOT_CONTAINS);
    }

    public ClusterImageWhereInput upgradeToolVersionNotEndsWith(
            String upgradeToolVersionNotEndsWith) {

        this.upgradeToolVersionNotEndsWith = upgradeToolVersionNotEndsWith;
        return this;
    }

    /**
     * Get upgradeToolVersionNotEndsWith
     *
     * @return upgradeToolVersionNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUpgradeToolVersionNotEndsWith() {
        return upgradeToolVersionNotEndsWith;
    }

    public void setUpgradeToolVersionNotEndsWith(String upgradeToolVersionNotEndsWith) {
        this.upgradeToolVersionNotEndsWith = upgradeToolVersionNotEndsWith;
    }

    public ClusterImageWhereInput upgradeToolVersionNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_NOT_ENDS_WITH);
        return this;
    }

    public ClusterImageWhereInput upgradeToolVersionNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_NOT_ENDS_WITH);
        return this;
    }

    public void setUpgradeToolVersionNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_NOT_ENDS_WITH);
        }
    }

    public boolean getUpgradeToolVersionNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_NOT_ENDS_WITH);
    }

    public ClusterImageWhereInput upgradeToolVersionNotIn(List<String> upgradeToolVersionNotIn) {

        this.upgradeToolVersionNotIn = upgradeToolVersionNotIn;
        return this;
    }

    public ClusterImageWhereInput addUpgradeToolVersionNotInItem(
            String upgradeToolVersionNotInItem) {
        if (this.upgradeToolVersionNotIn == null) {
            this.upgradeToolVersionNotIn = new ArrayList<String>();
        }
        this.upgradeToolVersionNotIn.add(upgradeToolVersionNotInItem);
        return this;
    }

    /**
     * Get upgradeToolVersionNotIn
     *
     * @return upgradeToolVersionNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getUpgradeToolVersionNotIn() {
        return upgradeToolVersionNotIn;
    }

    public void setUpgradeToolVersionNotIn(List<String> upgradeToolVersionNotIn) {
        this.upgradeToolVersionNotIn = upgradeToolVersionNotIn;
    }

    public ClusterImageWhereInput upgradeToolVersionNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_NOT_IN);
        return this;
    }

    public ClusterImageWhereInput upgradeToolVersionNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_NOT_IN);
        return this;
    }

    public void setUpgradeToolVersionNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_NOT_IN);
        }
    }

    public boolean getUpgradeToolVersionNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_NOT_IN);
    }

    public ClusterImageWhereInput upgradeToolVersionNotStartsWith(
            String upgradeToolVersionNotStartsWith) {

        this.upgradeToolVersionNotStartsWith = upgradeToolVersionNotStartsWith;
        return this;
    }

    /**
     * Get upgradeToolVersionNotStartsWith
     *
     * @return upgradeToolVersionNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUpgradeToolVersionNotStartsWith() {
        return upgradeToolVersionNotStartsWith;
    }

    public void setUpgradeToolVersionNotStartsWith(String upgradeToolVersionNotStartsWith) {
        this.upgradeToolVersionNotStartsWith = upgradeToolVersionNotStartsWith;
    }

    public ClusterImageWhereInput upgradeToolVersionNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_NOT_STARTS_WITH);
        return this;
    }

    public ClusterImageWhereInput upgradeToolVersionNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_NOT_STARTS_WITH);
        return this;
    }

    public void setUpgradeToolVersionNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_NOT_STARTS_WITH);
        }
    }

    public boolean getUpgradeToolVersionNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_NOT_STARTS_WITH);
    }

    public ClusterImageWhereInput upgradeToolVersionStartsWith(
            String upgradeToolVersionStartsWith) {

        this.upgradeToolVersionStartsWith = upgradeToolVersionStartsWith;
        return this;
    }

    /**
     * Get upgradeToolVersionStartsWith
     *
     * @return upgradeToolVersionStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUpgradeToolVersionStartsWith() {
        return upgradeToolVersionStartsWith;
    }

    public void setUpgradeToolVersionStartsWith(String upgradeToolVersionStartsWith) {
        this.upgradeToolVersionStartsWith = upgradeToolVersionStartsWith;
    }

    public ClusterImageWhereInput upgradeToolVersionStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_STARTS_WITH);
        return this;
    }

    public ClusterImageWhereInput upgradeToolVersionStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_STARTS_WITH);
        return this;
    }

    public void setUpgradeToolVersionStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_STARTS_WITH);
        }
    }

    public boolean getUpgradeToolVersionStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UPGRADE_TOOL_VERSION_STARTS_WITH);
    }

    public ClusterImageWhereInput version(String version) {

        this.version = version;
        return this;
    }

    /**
     * Get version
     *
     * @return version
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public ClusterImageWhereInput version_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VERSION);
        return this;
    }

    public ClusterImageWhereInput version_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VERSION);
        return this;
    }

    public void setVersion_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VERSION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VERSION);
        }
    }

    public boolean getVersion_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VERSION);
    }

    public ClusterImageWhereInput versionContains(String versionContains) {

        this.versionContains = versionContains;
        return this;
    }

    /**
     * Get versionContains
     *
     * @return versionContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVersionContains() {
        return versionContains;
    }

    public void setVersionContains(String versionContains) {
        this.versionContains = versionContains;
    }

    public ClusterImageWhereInput versionContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VERSION_CONTAINS);
        return this;
    }

    public ClusterImageWhereInput versionContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VERSION_CONTAINS);
        return this;
    }

    public void setVersionContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VERSION_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VERSION_CONTAINS);
        }
    }

    public boolean getVersionContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VERSION_CONTAINS);
    }

    public ClusterImageWhereInput versionEndsWith(String versionEndsWith) {

        this.versionEndsWith = versionEndsWith;
        return this;
    }

    /**
     * Get versionEndsWith
     *
     * @return versionEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVersionEndsWith() {
        return versionEndsWith;
    }

    public void setVersionEndsWith(String versionEndsWith) {
        this.versionEndsWith = versionEndsWith;
    }

    public ClusterImageWhereInput versionEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VERSION_ENDS_WITH);
        return this;
    }

    public ClusterImageWhereInput versionEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VERSION_ENDS_WITH);
        return this;
    }

    public void setVersionEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VERSION_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VERSION_ENDS_WITH);
        }
    }

    public boolean getVersionEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VERSION_ENDS_WITH);
    }

    public ClusterImageWhereInput versionGt(String versionGt) {

        this.versionGt = versionGt;
        return this;
    }

    /**
     * Get versionGt
     *
     * @return versionGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVersionGt() {
        return versionGt;
    }

    public void setVersionGt(String versionGt) {
        this.versionGt = versionGt;
    }

    public ClusterImageWhereInput versionGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VERSION_GT);
        return this;
    }

    public ClusterImageWhereInput versionGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VERSION_GT);
        return this;
    }

    public void setVersionGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VERSION_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VERSION_GT);
        }
    }

    public boolean getVersionGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VERSION_GT);
    }

    public ClusterImageWhereInput versionGte(String versionGte) {

        this.versionGte = versionGte;
        return this;
    }

    /**
     * Get versionGte
     *
     * @return versionGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVersionGte() {
        return versionGte;
    }

    public void setVersionGte(String versionGte) {
        this.versionGte = versionGte;
    }

    public ClusterImageWhereInput versionGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VERSION_GTE);
        return this;
    }

    public ClusterImageWhereInput versionGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VERSION_GTE);
        return this;
    }

    public void setVersionGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VERSION_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VERSION_GTE);
        }
    }

    public boolean getVersionGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VERSION_GTE);
    }

    public ClusterImageWhereInput versionIn(List<String> versionIn) {

        this.versionIn = versionIn;
        return this;
    }

    public ClusterImageWhereInput addVersionInItem(String versionInItem) {
        if (this.versionIn == null) {
            this.versionIn = new ArrayList<String>();
        }
        this.versionIn.add(versionInItem);
        return this;
    }

    /**
     * Get versionIn
     *
     * @return versionIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getVersionIn() {
        return versionIn;
    }

    public void setVersionIn(List<String> versionIn) {
        this.versionIn = versionIn;
    }

    public ClusterImageWhereInput versionIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VERSION_IN);
        return this;
    }

    public ClusterImageWhereInput versionIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VERSION_IN);
        return this;
    }

    public void setVersionIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VERSION_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VERSION_IN);
        }
    }

    public boolean getVersionIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VERSION_IN);
    }

    public ClusterImageWhereInput versionLt(String versionLt) {

        this.versionLt = versionLt;
        return this;
    }

    /**
     * Get versionLt
     *
     * @return versionLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVersionLt() {
        return versionLt;
    }

    public void setVersionLt(String versionLt) {
        this.versionLt = versionLt;
    }

    public ClusterImageWhereInput versionLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VERSION_LT);
        return this;
    }

    public ClusterImageWhereInput versionLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VERSION_LT);
        return this;
    }

    public void setVersionLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VERSION_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VERSION_LT);
        }
    }

    public boolean getVersionLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VERSION_LT);
    }

    public ClusterImageWhereInput versionLte(String versionLte) {

        this.versionLte = versionLte;
        return this;
    }

    /**
     * Get versionLte
     *
     * @return versionLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVersionLte() {
        return versionLte;
    }

    public void setVersionLte(String versionLte) {
        this.versionLte = versionLte;
    }

    public ClusterImageWhereInput versionLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VERSION_LTE);
        return this;
    }

    public ClusterImageWhereInput versionLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VERSION_LTE);
        return this;
    }

    public void setVersionLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VERSION_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VERSION_LTE);
        }
    }

    public boolean getVersionLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VERSION_LTE);
    }

    public ClusterImageWhereInput versionNot(String versionNot) {

        this.versionNot = versionNot;
        return this;
    }

    /**
     * Get versionNot
     *
     * @return versionNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVersionNot() {
        return versionNot;
    }

    public void setVersionNot(String versionNot) {
        this.versionNot = versionNot;
    }

    public ClusterImageWhereInput versionNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VERSION_NOT);
        return this;
    }

    public ClusterImageWhereInput versionNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VERSION_NOT);
        return this;
    }

    public void setVersionNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VERSION_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VERSION_NOT);
        }
    }

    public boolean getVersionNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VERSION_NOT);
    }

    public ClusterImageWhereInput versionNotContains(String versionNotContains) {

        this.versionNotContains = versionNotContains;
        return this;
    }

    /**
     * Get versionNotContains
     *
     * @return versionNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVersionNotContains() {
        return versionNotContains;
    }

    public void setVersionNotContains(String versionNotContains) {
        this.versionNotContains = versionNotContains;
    }

    public ClusterImageWhereInput versionNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VERSION_NOT_CONTAINS);
        return this;
    }

    public ClusterImageWhereInput versionNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VERSION_NOT_CONTAINS);
        return this;
    }

    public void setVersionNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VERSION_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VERSION_NOT_CONTAINS);
        }
    }

    public boolean getVersionNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VERSION_NOT_CONTAINS);
    }

    public ClusterImageWhereInput versionNotEndsWith(String versionNotEndsWith) {

        this.versionNotEndsWith = versionNotEndsWith;
        return this;
    }

    /**
     * Get versionNotEndsWith
     *
     * @return versionNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVersionNotEndsWith() {
        return versionNotEndsWith;
    }

    public void setVersionNotEndsWith(String versionNotEndsWith) {
        this.versionNotEndsWith = versionNotEndsWith;
    }

    public ClusterImageWhereInput versionNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VERSION_NOT_ENDS_WITH);
        return this;
    }

    public ClusterImageWhereInput versionNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VERSION_NOT_ENDS_WITH);
        return this;
    }

    public void setVersionNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VERSION_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VERSION_NOT_ENDS_WITH);
        }
    }

    public boolean getVersionNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VERSION_NOT_ENDS_WITH);
    }

    public ClusterImageWhereInput versionNotIn(List<String> versionNotIn) {

        this.versionNotIn = versionNotIn;
        return this;
    }

    public ClusterImageWhereInput addVersionNotInItem(String versionNotInItem) {
        if (this.versionNotIn == null) {
            this.versionNotIn = new ArrayList<String>();
        }
        this.versionNotIn.add(versionNotInItem);
        return this;
    }

    /**
     * Get versionNotIn
     *
     * @return versionNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getVersionNotIn() {
        return versionNotIn;
    }

    public void setVersionNotIn(List<String> versionNotIn) {
        this.versionNotIn = versionNotIn;
    }

    public ClusterImageWhereInput versionNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VERSION_NOT_IN);
        return this;
    }

    public ClusterImageWhereInput versionNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VERSION_NOT_IN);
        return this;
    }

    public void setVersionNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VERSION_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VERSION_NOT_IN);
        }
    }

    public boolean getVersionNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VERSION_NOT_IN);
    }

    public ClusterImageWhereInput versionNotStartsWith(String versionNotStartsWith) {

        this.versionNotStartsWith = versionNotStartsWith;
        return this;
    }

    /**
     * Get versionNotStartsWith
     *
     * @return versionNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVersionNotStartsWith() {
        return versionNotStartsWith;
    }

    public void setVersionNotStartsWith(String versionNotStartsWith) {
        this.versionNotStartsWith = versionNotStartsWith;
    }

    public ClusterImageWhereInput versionNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VERSION_NOT_STARTS_WITH);
        return this;
    }

    public ClusterImageWhereInput versionNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VERSION_NOT_STARTS_WITH);
        return this;
    }

    public void setVersionNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VERSION_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VERSION_NOT_STARTS_WITH);
        }
    }

    public boolean getVersionNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VERSION_NOT_STARTS_WITH);
    }

    public ClusterImageWhereInput versionSemanticGt(String versionSemanticGt) {

        this.versionSemanticGt = versionSemanticGt;
        return this;
    }

    /**
     * Get versionSemanticGt
     *
     * @return versionSemanticGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVersionSemanticGt() {
        return versionSemanticGt;
    }

    public void setVersionSemanticGt(String versionSemanticGt) {
        this.versionSemanticGt = versionSemanticGt;
    }

    public ClusterImageWhereInput versionSemanticGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VERSION_SEMANTIC_GT);
        return this;
    }

    public ClusterImageWhereInput versionSemanticGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VERSION_SEMANTIC_GT);
        return this;
    }

    public void setVersionSemanticGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VERSION_SEMANTIC_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VERSION_SEMANTIC_GT);
        }
    }

    public boolean getVersionSemanticGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VERSION_SEMANTIC_GT);
    }

    public ClusterImageWhereInput versionSemanticGte(String versionSemanticGte) {

        this.versionSemanticGte = versionSemanticGte;
        return this;
    }

    /**
     * Get versionSemanticGte
     *
     * @return versionSemanticGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVersionSemanticGte() {
        return versionSemanticGte;
    }

    public void setVersionSemanticGte(String versionSemanticGte) {
        this.versionSemanticGte = versionSemanticGte;
    }

    public ClusterImageWhereInput versionSemanticGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VERSION_SEMANTIC_GTE);
        return this;
    }

    public ClusterImageWhereInput versionSemanticGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VERSION_SEMANTIC_GTE);
        return this;
    }

    public void setVersionSemanticGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VERSION_SEMANTIC_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VERSION_SEMANTIC_GTE);
        }
    }

    public boolean getVersionSemanticGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VERSION_SEMANTIC_GTE);
    }

    public ClusterImageWhereInput versionSemanticLt(String versionSemanticLt) {

        this.versionSemanticLt = versionSemanticLt;
        return this;
    }

    /**
     * Get versionSemanticLt
     *
     * @return versionSemanticLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVersionSemanticLt() {
        return versionSemanticLt;
    }

    public void setVersionSemanticLt(String versionSemanticLt) {
        this.versionSemanticLt = versionSemanticLt;
    }

    public ClusterImageWhereInput versionSemanticLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VERSION_SEMANTIC_LT);
        return this;
    }

    public ClusterImageWhereInput versionSemanticLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VERSION_SEMANTIC_LT);
        return this;
    }

    public void setVersionSemanticLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VERSION_SEMANTIC_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VERSION_SEMANTIC_LT);
        }
    }

    public boolean getVersionSemanticLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VERSION_SEMANTIC_LT);
    }

    public ClusterImageWhereInput versionSemanticLte(String versionSemanticLte) {

        this.versionSemanticLte = versionSemanticLte;
        return this;
    }

    /**
     * Get versionSemanticLte
     *
     * @return versionSemanticLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVersionSemanticLte() {
        return versionSemanticLte;
    }

    public void setVersionSemanticLte(String versionSemanticLte) {
        this.versionSemanticLte = versionSemanticLte;
    }

    public ClusterImageWhereInput versionSemanticLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VERSION_SEMANTIC_LTE);
        return this;
    }

    public ClusterImageWhereInput versionSemanticLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VERSION_SEMANTIC_LTE);
        return this;
    }

    public void setVersionSemanticLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VERSION_SEMANTIC_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VERSION_SEMANTIC_LTE);
        }
    }

    public boolean getVersionSemanticLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VERSION_SEMANTIC_LTE);
    }

    public ClusterImageWhereInput versionStartsWith(String versionStartsWith) {

        this.versionStartsWith = versionStartsWith;
        return this;
    }

    /**
     * Get versionStartsWith
     *
     * @return versionStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVersionStartsWith() {
        return versionStartsWith;
    }

    public void setVersionStartsWith(String versionStartsWith) {
        this.versionStartsWith = versionStartsWith;
    }

    public ClusterImageWhereInput versionStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VERSION_STARTS_WITH);
        return this;
    }

    public ClusterImageWhereInput versionStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VERSION_STARTS_WITH);
        return this;
    }

    public void setVersionStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VERSION_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VERSION_STARTS_WITH);
        }
    }

    public boolean getVersionStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VERSION_STARTS_WITH);
    }

    public ClusterImageWhereInput zbsVersion(String zbsVersion) {

        this.zbsVersion = zbsVersion;
        return this;
    }

    /**
     * Get zbsVersion
     *
     * @return zbsVersion
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getZbsVersion() {
        return zbsVersion;
    }

    public void setZbsVersion(String zbsVersion) {
        this.zbsVersion = zbsVersion;
    }

    public ClusterImageWhereInput zbsVersion_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ZBS_VERSION);
        return this;
    }

    public ClusterImageWhereInput zbsVersion_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ZBS_VERSION);
        return this;
    }

    public void setZbsVersion_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ZBS_VERSION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ZBS_VERSION);
        }
    }

    public boolean getZbsVersion_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ZBS_VERSION);
    }

    public ClusterImageWhereInput zbsVersionContains(String zbsVersionContains) {

        this.zbsVersionContains = zbsVersionContains;
        return this;
    }

    /**
     * Get zbsVersionContains
     *
     * @return zbsVersionContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getZbsVersionContains() {
        return zbsVersionContains;
    }

    public void setZbsVersionContains(String zbsVersionContains) {
        this.zbsVersionContains = zbsVersionContains;
    }

    public ClusterImageWhereInput zbsVersionContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ZBS_VERSION_CONTAINS);
        return this;
    }

    public ClusterImageWhereInput zbsVersionContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ZBS_VERSION_CONTAINS);
        return this;
    }

    public void setZbsVersionContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ZBS_VERSION_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ZBS_VERSION_CONTAINS);
        }
    }

    public boolean getZbsVersionContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ZBS_VERSION_CONTAINS);
    }

    public ClusterImageWhereInput zbsVersionEndsWith(String zbsVersionEndsWith) {

        this.zbsVersionEndsWith = zbsVersionEndsWith;
        return this;
    }

    /**
     * Get zbsVersionEndsWith
     *
     * @return zbsVersionEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getZbsVersionEndsWith() {
        return zbsVersionEndsWith;
    }

    public void setZbsVersionEndsWith(String zbsVersionEndsWith) {
        this.zbsVersionEndsWith = zbsVersionEndsWith;
    }

    public ClusterImageWhereInput zbsVersionEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ZBS_VERSION_ENDS_WITH);
        return this;
    }

    public ClusterImageWhereInput zbsVersionEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ZBS_VERSION_ENDS_WITH);
        return this;
    }

    public void setZbsVersionEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ZBS_VERSION_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ZBS_VERSION_ENDS_WITH);
        }
    }

    public boolean getZbsVersionEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ZBS_VERSION_ENDS_WITH);
    }

    public ClusterImageWhereInput zbsVersionGt(String zbsVersionGt) {

        this.zbsVersionGt = zbsVersionGt;
        return this;
    }

    /**
     * Get zbsVersionGt
     *
     * @return zbsVersionGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getZbsVersionGt() {
        return zbsVersionGt;
    }

    public void setZbsVersionGt(String zbsVersionGt) {
        this.zbsVersionGt = zbsVersionGt;
    }

    public ClusterImageWhereInput zbsVersionGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ZBS_VERSION_GT);
        return this;
    }

    public ClusterImageWhereInput zbsVersionGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ZBS_VERSION_GT);
        return this;
    }

    public void setZbsVersionGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ZBS_VERSION_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ZBS_VERSION_GT);
        }
    }

    public boolean getZbsVersionGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ZBS_VERSION_GT);
    }

    public ClusterImageWhereInput zbsVersionGte(String zbsVersionGte) {

        this.zbsVersionGte = zbsVersionGte;
        return this;
    }

    /**
     * Get zbsVersionGte
     *
     * @return zbsVersionGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getZbsVersionGte() {
        return zbsVersionGte;
    }

    public void setZbsVersionGte(String zbsVersionGte) {
        this.zbsVersionGte = zbsVersionGte;
    }

    public ClusterImageWhereInput zbsVersionGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ZBS_VERSION_GTE);
        return this;
    }

    public ClusterImageWhereInput zbsVersionGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ZBS_VERSION_GTE);
        return this;
    }

    public void setZbsVersionGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ZBS_VERSION_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ZBS_VERSION_GTE);
        }
    }

    public boolean getZbsVersionGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ZBS_VERSION_GTE);
    }

    public ClusterImageWhereInput zbsVersionIn(List<String> zbsVersionIn) {

        this.zbsVersionIn = zbsVersionIn;
        return this;
    }

    public ClusterImageWhereInput addZbsVersionInItem(String zbsVersionInItem) {
        if (this.zbsVersionIn == null) {
            this.zbsVersionIn = new ArrayList<String>();
        }
        this.zbsVersionIn.add(zbsVersionInItem);
        return this;
    }

    /**
     * Get zbsVersionIn
     *
     * @return zbsVersionIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getZbsVersionIn() {
        return zbsVersionIn;
    }

    public void setZbsVersionIn(List<String> zbsVersionIn) {
        this.zbsVersionIn = zbsVersionIn;
    }

    public ClusterImageWhereInput zbsVersionIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ZBS_VERSION_IN);
        return this;
    }

    public ClusterImageWhereInput zbsVersionIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ZBS_VERSION_IN);
        return this;
    }

    public void setZbsVersionIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ZBS_VERSION_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ZBS_VERSION_IN);
        }
    }

    public boolean getZbsVersionIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ZBS_VERSION_IN);
    }

    public ClusterImageWhereInput zbsVersionLt(String zbsVersionLt) {

        this.zbsVersionLt = zbsVersionLt;
        return this;
    }

    /**
     * Get zbsVersionLt
     *
     * @return zbsVersionLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getZbsVersionLt() {
        return zbsVersionLt;
    }

    public void setZbsVersionLt(String zbsVersionLt) {
        this.zbsVersionLt = zbsVersionLt;
    }

    public ClusterImageWhereInput zbsVersionLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ZBS_VERSION_LT);
        return this;
    }

    public ClusterImageWhereInput zbsVersionLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ZBS_VERSION_LT);
        return this;
    }

    public void setZbsVersionLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ZBS_VERSION_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ZBS_VERSION_LT);
        }
    }

    public boolean getZbsVersionLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ZBS_VERSION_LT);
    }

    public ClusterImageWhereInput zbsVersionLte(String zbsVersionLte) {

        this.zbsVersionLte = zbsVersionLte;
        return this;
    }

    /**
     * Get zbsVersionLte
     *
     * @return zbsVersionLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getZbsVersionLte() {
        return zbsVersionLte;
    }

    public void setZbsVersionLte(String zbsVersionLte) {
        this.zbsVersionLte = zbsVersionLte;
    }

    public ClusterImageWhereInput zbsVersionLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ZBS_VERSION_LTE);
        return this;
    }

    public ClusterImageWhereInput zbsVersionLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ZBS_VERSION_LTE);
        return this;
    }

    public void setZbsVersionLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ZBS_VERSION_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ZBS_VERSION_LTE);
        }
    }

    public boolean getZbsVersionLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ZBS_VERSION_LTE);
    }

    public ClusterImageWhereInput zbsVersionNot(String zbsVersionNot) {

        this.zbsVersionNot = zbsVersionNot;
        return this;
    }

    /**
     * Get zbsVersionNot
     *
     * @return zbsVersionNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getZbsVersionNot() {
        return zbsVersionNot;
    }

    public void setZbsVersionNot(String zbsVersionNot) {
        this.zbsVersionNot = zbsVersionNot;
    }

    public ClusterImageWhereInput zbsVersionNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ZBS_VERSION_NOT);
        return this;
    }

    public ClusterImageWhereInput zbsVersionNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ZBS_VERSION_NOT);
        return this;
    }

    public void setZbsVersionNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ZBS_VERSION_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ZBS_VERSION_NOT);
        }
    }

    public boolean getZbsVersionNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ZBS_VERSION_NOT);
    }

    public ClusterImageWhereInput zbsVersionNotContains(String zbsVersionNotContains) {

        this.zbsVersionNotContains = zbsVersionNotContains;
        return this;
    }

    /**
     * Get zbsVersionNotContains
     *
     * @return zbsVersionNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getZbsVersionNotContains() {
        return zbsVersionNotContains;
    }

    public void setZbsVersionNotContains(String zbsVersionNotContains) {
        this.zbsVersionNotContains = zbsVersionNotContains;
    }

    public ClusterImageWhereInput zbsVersionNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ZBS_VERSION_NOT_CONTAINS);
        return this;
    }

    public ClusterImageWhereInput zbsVersionNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ZBS_VERSION_NOT_CONTAINS);
        return this;
    }

    public void setZbsVersionNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ZBS_VERSION_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ZBS_VERSION_NOT_CONTAINS);
        }
    }

    public boolean getZbsVersionNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ZBS_VERSION_NOT_CONTAINS);
    }

    public ClusterImageWhereInput zbsVersionNotEndsWith(String zbsVersionNotEndsWith) {

        this.zbsVersionNotEndsWith = zbsVersionNotEndsWith;
        return this;
    }

    /**
     * Get zbsVersionNotEndsWith
     *
     * @return zbsVersionNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getZbsVersionNotEndsWith() {
        return zbsVersionNotEndsWith;
    }

    public void setZbsVersionNotEndsWith(String zbsVersionNotEndsWith) {
        this.zbsVersionNotEndsWith = zbsVersionNotEndsWith;
    }

    public ClusterImageWhereInput zbsVersionNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ZBS_VERSION_NOT_ENDS_WITH);
        return this;
    }

    public ClusterImageWhereInput zbsVersionNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ZBS_VERSION_NOT_ENDS_WITH);
        return this;
    }

    public void setZbsVersionNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ZBS_VERSION_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ZBS_VERSION_NOT_ENDS_WITH);
        }
    }

    public boolean getZbsVersionNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ZBS_VERSION_NOT_ENDS_WITH);
    }

    public ClusterImageWhereInput zbsVersionNotIn(List<String> zbsVersionNotIn) {

        this.zbsVersionNotIn = zbsVersionNotIn;
        return this;
    }

    public ClusterImageWhereInput addZbsVersionNotInItem(String zbsVersionNotInItem) {
        if (this.zbsVersionNotIn == null) {
            this.zbsVersionNotIn = new ArrayList<String>();
        }
        this.zbsVersionNotIn.add(zbsVersionNotInItem);
        return this;
    }

    /**
     * Get zbsVersionNotIn
     *
     * @return zbsVersionNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getZbsVersionNotIn() {
        return zbsVersionNotIn;
    }

    public void setZbsVersionNotIn(List<String> zbsVersionNotIn) {
        this.zbsVersionNotIn = zbsVersionNotIn;
    }

    public ClusterImageWhereInput zbsVersionNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ZBS_VERSION_NOT_IN);
        return this;
    }

    public ClusterImageWhereInput zbsVersionNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ZBS_VERSION_NOT_IN);
        return this;
    }

    public void setZbsVersionNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ZBS_VERSION_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ZBS_VERSION_NOT_IN);
        }
    }

    public boolean getZbsVersionNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ZBS_VERSION_NOT_IN);
    }

    public ClusterImageWhereInput zbsVersionNotStartsWith(String zbsVersionNotStartsWith) {

        this.zbsVersionNotStartsWith = zbsVersionNotStartsWith;
        return this;
    }

    /**
     * Get zbsVersionNotStartsWith
     *
     * @return zbsVersionNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getZbsVersionNotStartsWith() {
        return zbsVersionNotStartsWith;
    }

    public void setZbsVersionNotStartsWith(String zbsVersionNotStartsWith) {
        this.zbsVersionNotStartsWith = zbsVersionNotStartsWith;
    }

    public ClusterImageWhereInput zbsVersionNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ZBS_VERSION_NOT_STARTS_WITH);
        return this;
    }

    public ClusterImageWhereInput zbsVersionNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ZBS_VERSION_NOT_STARTS_WITH);
        return this;
    }

    public void setZbsVersionNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ZBS_VERSION_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ZBS_VERSION_NOT_STARTS_WITH);
        }
    }

    public boolean getZbsVersionNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ZBS_VERSION_NOT_STARTS_WITH);
    }

    public ClusterImageWhereInput zbsVersionStartsWith(String zbsVersionStartsWith) {

        this.zbsVersionStartsWith = zbsVersionStartsWith;
        return this;
    }

    /**
     * Get zbsVersionStartsWith
     *
     * @return zbsVersionStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getZbsVersionStartsWith() {
        return zbsVersionStartsWith;
    }

    public void setZbsVersionStartsWith(String zbsVersionStartsWith) {
        this.zbsVersionStartsWith = zbsVersionStartsWith;
    }

    public ClusterImageWhereInput zbsVersionStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ZBS_VERSION_STARTS_WITH);
        return this;
    }

    public ClusterImageWhereInput zbsVersionStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ZBS_VERSION_STARTS_WITH);
        return this;
    }

    public void setZbsVersionStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ZBS_VERSION_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ZBS_VERSION_STARTS_WITH);
        }
    }

    public boolean getZbsVersionStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ZBS_VERSION_STARTS_WITH);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ClusterImageWhereInput clusterImageWhereInput = (ClusterImageWhereInput) o;
        return Objects.equals(this.AND, clusterImageWhereInput.AND)
                && Objects.equals(this.NOT, clusterImageWhereInput.NOT)
                && Objects.equals(this.OR, clusterImageWhereInput.OR)
                && Objects.equals(this.cluster, clusterImageWhereInput.cluster)
                && Objects.equals(this.entityAsyncStatus, clusterImageWhereInput.entityAsyncStatus)
                && Objects.equals(
                        this.entityAsyncStatusIn, clusterImageWhereInput.entityAsyncStatusIn)
                && Objects.equals(
                        this.entityAsyncStatusNot, clusterImageWhereInput.entityAsyncStatusNot)
                && Objects.equals(
                        this.entityAsyncStatusNotIn, clusterImageWhereInput.entityAsyncStatusNotIn)
                && Objects.equals(this.id, clusterImageWhereInput.id)
                && Objects.equals(this.idContains, clusterImageWhereInput.idContains)
                && Objects.equals(this.idEndsWith, clusterImageWhereInput.idEndsWith)
                && Objects.equals(this.idGt, clusterImageWhereInput.idGt)
                && Objects.equals(this.idGte, clusterImageWhereInput.idGte)
                && Objects.equals(this.idIn, clusterImageWhereInput.idIn)
                && Objects.equals(this.idLt, clusterImageWhereInput.idLt)
                && Objects.equals(this.idLte, clusterImageWhereInput.idLte)
                && Objects.equals(this.idNot, clusterImageWhereInput.idNot)
                && Objects.equals(this.idNotContains, clusterImageWhereInput.idNotContains)
                && Objects.equals(this.idNotEndsWith, clusterImageWhereInput.idNotEndsWith)
                && Objects.equals(this.idNotIn, clusterImageWhereInput.idNotIn)
                && Objects.equals(this.idNotStartsWith, clusterImageWhereInput.idNotStartsWith)
                && Objects.equals(this.idStartsWith, clusterImageWhereInput.idStartsWith)
                && Objects.equals(this.localId, clusterImageWhereInput.localId)
                && Objects.equals(this.localIdContains, clusterImageWhereInput.localIdContains)
                && Objects.equals(this.localIdEndsWith, clusterImageWhereInput.localIdEndsWith)
                && Objects.equals(this.localIdGt, clusterImageWhereInput.localIdGt)
                && Objects.equals(this.localIdGte, clusterImageWhereInput.localIdGte)
                && Objects.equals(this.localIdIn, clusterImageWhereInput.localIdIn)
                && Objects.equals(this.localIdLt, clusterImageWhereInput.localIdLt)
                && Objects.equals(this.localIdLte, clusterImageWhereInput.localIdLte)
                && Objects.equals(this.localIdNot, clusterImageWhereInput.localIdNot)
                && Objects.equals(
                        this.localIdNotContains, clusterImageWhereInput.localIdNotContains)
                && Objects.equals(
                        this.localIdNotEndsWith, clusterImageWhereInput.localIdNotEndsWith)
                && Objects.equals(this.localIdNotIn, clusterImageWhereInput.localIdNotIn)
                && Objects.equals(
                        this.localIdNotStartsWith, clusterImageWhereInput.localIdNotStartsWith)
                && Objects.equals(this.localIdStartsWith, clusterImageWhereInput.localIdStartsWith)
                && Objects.equals(this.metaName, clusterImageWhereInput.metaName)
                && Objects.equals(this.metaNameContains, clusterImageWhereInput.metaNameContains)
                && Objects.equals(this.metaNameEndsWith, clusterImageWhereInput.metaNameEndsWith)
                && Objects.equals(this.metaNameGt, clusterImageWhereInput.metaNameGt)
                && Objects.equals(this.metaNameGte, clusterImageWhereInput.metaNameGte)
                && Objects.equals(this.metaNameIn, clusterImageWhereInput.metaNameIn)
                && Objects.equals(this.metaNameLt, clusterImageWhereInput.metaNameLt)
                && Objects.equals(this.metaNameLte, clusterImageWhereInput.metaNameLte)
                && Objects.equals(this.metaNameNot, clusterImageWhereInput.metaNameNot)
                && Objects.equals(
                        this.metaNameNotContains, clusterImageWhereInput.metaNameNotContains)
                && Objects.equals(
                        this.metaNameNotEndsWith, clusterImageWhereInput.metaNameNotEndsWith)
                && Objects.equals(this.metaNameNotIn, clusterImageWhereInput.metaNameNotIn)
                && Objects.equals(
                        this.metaNameNotStartsWith, clusterImageWhereInput.metaNameNotStartsWith)
                && Objects.equals(
                        this.metaNameStartsWith, clusterImageWhereInput.metaNameStartsWith)
                && Objects.equals(this.metaSize, clusterImageWhereInput.metaSize)
                && Objects.equals(this.metaSizeGt, clusterImageWhereInput.metaSizeGt)
                && Objects.equals(this.metaSizeGte, clusterImageWhereInput.metaSizeGte)
                && Objects.equals(this.metaSizeIn, clusterImageWhereInput.metaSizeIn)
                && Objects.equals(this.metaSizeLt, clusterImageWhereInput.metaSizeLt)
                && Objects.equals(this.metaSizeLte, clusterImageWhereInput.metaSizeLte)
                && Objects.equals(this.metaSizeNot, clusterImageWhereInput.metaSizeNot)
                && Objects.equals(this.metaSizeNotIn, clusterImageWhereInput.metaSizeNotIn)
                && Objects.equals(this.name, clusterImageWhereInput.name)
                && Objects.equals(this.nameContains, clusterImageWhereInput.nameContains)
                && Objects.equals(this.nameEndsWith, clusterImageWhereInput.nameEndsWith)
                && Objects.equals(this.nameGt, clusterImageWhereInput.nameGt)
                && Objects.equals(this.nameGte, clusterImageWhereInput.nameGte)
                && Objects.equals(this.nameIn, clusterImageWhereInput.nameIn)
                && Objects.equals(this.nameLt, clusterImageWhereInput.nameLt)
                && Objects.equals(this.nameLte, clusterImageWhereInput.nameLte)
                && Objects.equals(this.nameNot, clusterImageWhereInput.nameNot)
                && Objects.equals(this.nameNotContains, clusterImageWhereInput.nameNotContains)
                && Objects.equals(this.nameNotEndsWith, clusterImageWhereInput.nameNotEndsWith)
                && Objects.equals(this.nameNotIn, clusterImageWhereInput.nameNotIn)
                && Objects.equals(this.nameNotStartsWith, clusterImageWhereInput.nameNotStartsWith)
                && Objects.equals(this.nameStartsWith, clusterImageWhereInput.nameStartsWith)
                && Objects.equals(this.size, clusterImageWhereInput.size)
                && Objects.equals(this.sizeGt, clusterImageWhereInput.sizeGt)
                && Objects.equals(this.sizeGte, clusterImageWhereInput.sizeGte)
                && Objects.equals(this.sizeIn, clusterImageWhereInput.sizeIn)
                && Objects.equals(this.sizeLt, clusterImageWhereInput.sizeLt)
                && Objects.equals(this.sizeLte, clusterImageWhereInput.sizeLte)
                && Objects.equals(this.sizeNot, clusterImageWhereInput.sizeNot)
                && Objects.equals(this.sizeNotIn, clusterImageWhereInput.sizeNotIn)
                && Objects.equals(
                        this.upgradeToolVersion, clusterImageWhereInput.upgradeToolVersion)
                && Objects.equals(
                        this.upgradeToolVersionContains,
                        clusterImageWhereInput.upgradeToolVersionContains)
                && Objects.equals(
                        this.upgradeToolVersionEndsWith,
                        clusterImageWhereInput.upgradeToolVersionEndsWith)
                && Objects.equals(
                        this.upgradeToolVersionGt, clusterImageWhereInput.upgradeToolVersionGt)
                && Objects.equals(
                        this.upgradeToolVersionGte, clusterImageWhereInput.upgradeToolVersionGte)
                && Objects.equals(
                        this.upgradeToolVersionIn, clusterImageWhereInput.upgradeToolVersionIn)
                && Objects.equals(
                        this.upgradeToolVersionLt, clusterImageWhereInput.upgradeToolVersionLt)
                && Objects.equals(
                        this.upgradeToolVersionLte, clusterImageWhereInput.upgradeToolVersionLte)
                && Objects.equals(
                        this.upgradeToolVersionNot, clusterImageWhereInput.upgradeToolVersionNot)
                && Objects.equals(
                        this.upgradeToolVersionNotContains,
                        clusterImageWhereInput.upgradeToolVersionNotContains)
                && Objects.equals(
                        this.upgradeToolVersionNotEndsWith,
                        clusterImageWhereInput.upgradeToolVersionNotEndsWith)
                && Objects.equals(
                        this.upgradeToolVersionNotIn,
                        clusterImageWhereInput.upgradeToolVersionNotIn)
                && Objects.equals(
                        this.upgradeToolVersionNotStartsWith,
                        clusterImageWhereInput.upgradeToolVersionNotStartsWith)
                && Objects.equals(
                        this.upgradeToolVersionStartsWith,
                        clusterImageWhereInput.upgradeToolVersionStartsWith)
                && Objects.equals(this.version, clusterImageWhereInput.version)
                && Objects.equals(this.versionContains, clusterImageWhereInput.versionContains)
                && Objects.equals(this.versionEndsWith, clusterImageWhereInput.versionEndsWith)
                && Objects.equals(this.versionGt, clusterImageWhereInput.versionGt)
                && Objects.equals(this.versionGte, clusterImageWhereInput.versionGte)
                && Objects.equals(this.versionIn, clusterImageWhereInput.versionIn)
                && Objects.equals(this.versionLt, clusterImageWhereInput.versionLt)
                && Objects.equals(this.versionLte, clusterImageWhereInput.versionLte)
                && Objects.equals(this.versionNot, clusterImageWhereInput.versionNot)
                && Objects.equals(
                        this.versionNotContains, clusterImageWhereInput.versionNotContains)
                && Objects.equals(
                        this.versionNotEndsWith, clusterImageWhereInput.versionNotEndsWith)
                && Objects.equals(this.versionNotIn, clusterImageWhereInput.versionNotIn)
                && Objects.equals(
                        this.versionNotStartsWith, clusterImageWhereInput.versionNotStartsWith)
                && Objects.equals(this.versionSemanticGt, clusterImageWhereInput.versionSemanticGt)
                && Objects.equals(
                        this.versionSemanticGte, clusterImageWhereInput.versionSemanticGte)
                && Objects.equals(this.versionSemanticLt, clusterImageWhereInput.versionSemanticLt)
                && Objects.equals(
                        this.versionSemanticLte, clusterImageWhereInput.versionSemanticLte)
                && Objects.equals(this.versionStartsWith, clusterImageWhereInput.versionStartsWith)
                && Objects.equals(this.zbsVersion, clusterImageWhereInput.zbsVersion)
                && Objects.equals(
                        this.zbsVersionContains, clusterImageWhereInput.zbsVersionContains)
                && Objects.equals(
                        this.zbsVersionEndsWith, clusterImageWhereInput.zbsVersionEndsWith)
                && Objects.equals(this.zbsVersionGt, clusterImageWhereInput.zbsVersionGt)
                && Objects.equals(this.zbsVersionGte, clusterImageWhereInput.zbsVersionGte)
                && Objects.equals(this.zbsVersionIn, clusterImageWhereInput.zbsVersionIn)
                && Objects.equals(this.zbsVersionLt, clusterImageWhereInput.zbsVersionLt)
                && Objects.equals(this.zbsVersionLte, clusterImageWhereInput.zbsVersionLte)
                && Objects.equals(this.zbsVersionNot, clusterImageWhereInput.zbsVersionNot)
                && Objects.equals(
                        this.zbsVersionNotContains, clusterImageWhereInput.zbsVersionNotContains)
                && Objects.equals(
                        this.zbsVersionNotEndsWith, clusterImageWhereInput.zbsVersionNotEndsWith)
                && Objects.equals(this.zbsVersionNotIn, clusterImageWhereInput.zbsVersionNotIn)
                && Objects.equals(
                        this.zbsVersionNotStartsWith,
                        clusterImageWhereInput.zbsVersionNotStartsWith)
                && Objects.equals(
                        this.zbsVersionStartsWith, clusterImageWhereInput.zbsVersionStartsWith);
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
                cluster,
                entityAsyncStatus,
                entityAsyncStatusIn,
                entityAsyncStatusNot,
                entityAsyncStatusNotIn,
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
                localId,
                localIdContains,
                localIdEndsWith,
                localIdGt,
                localIdGte,
                localIdIn,
                localIdLt,
                localIdLte,
                localIdNot,
                localIdNotContains,
                localIdNotEndsWith,
                localIdNotIn,
                localIdNotStartsWith,
                localIdStartsWith,
                metaName,
                metaNameContains,
                metaNameEndsWith,
                metaNameGt,
                metaNameGte,
                metaNameIn,
                metaNameLt,
                metaNameLte,
                metaNameNot,
                metaNameNotContains,
                metaNameNotEndsWith,
                metaNameNotIn,
                metaNameNotStartsWith,
                metaNameStartsWith,
                metaSize,
                metaSizeGt,
                metaSizeGte,
                metaSizeIn,
                metaSizeLt,
                metaSizeLte,
                metaSizeNot,
                metaSizeNotIn,
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
                size,
                sizeGt,
                sizeGte,
                sizeIn,
                sizeLt,
                sizeLte,
                sizeNot,
                sizeNotIn,
                upgradeToolVersion,
                upgradeToolVersionContains,
                upgradeToolVersionEndsWith,
                upgradeToolVersionGt,
                upgradeToolVersionGte,
                upgradeToolVersionIn,
                upgradeToolVersionLt,
                upgradeToolVersionLte,
                upgradeToolVersionNot,
                upgradeToolVersionNotContains,
                upgradeToolVersionNotEndsWith,
                upgradeToolVersionNotIn,
                upgradeToolVersionNotStartsWith,
                upgradeToolVersionStartsWith,
                version,
                versionContains,
                versionEndsWith,
                versionGt,
                versionGte,
                versionIn,
                versionLt,
                versionLte,
                versionNot,
                versionNotContains,
                versionNotEndsWith,
                versionNotIn,
                versionNotStartsWith,
                versionSemanticGt,
                versionSemanticGte,
                versionSemanticLt,
                versionSemanticLte,
                versionStartsWith,
                zbsVersion,
                zbsVersionContains,
                zbsVersionEndsWith,
                zbsVersionGt,
                zbsVersionGte,
                zbsVersionIn,
                zbsVersionLt,
                zbsVersionLte,
                zbsVersionNot,
                zbsVersionNotContains,
                zbsVersionNotEndsWith,
                zbsVersionNotIn,
                zbsVersionNotStartsWith,
                zbsVersionStartsWith);
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
        sb.append("class ClusterImageWhereInput {\n");
        sb.append("    AND: ").append(toIndentedString(AND)).append("\n");
        sb.append("    NOT: ").append(toIndentedString(NOT)).append("\n");
        sb.append("    OR: ").append(toIndentedString(OR)).append("\n");
        sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
        sb.append("    entityAsyncStatus: ")
                .append(toIndentedString(entityAsyncStatus))
                .append("\n");
        sb.append("    entityAsyncStatusIn: ")
                .append(toIndentedString(entityAsyncStatusIn))
                .append("\n");
        sb.append("    entityAsyncStatusNot: ")
                .append(toIndentedString(entityAsyncStatusNot))
                .append("\n");
        sb.append("    entityAsyncStatusNotIn: ")
                .append(toIndentedString(entityAsyncStatusNotIn))
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
        sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
        sb.append("    localIdContains: ").append(toIndentedString(localIdContains)).append("\n");
        sb.append("    localIdEndsWith: ").append(toIndentedString(localIdEndsWith)).append("\n");
        sb.append("    localIdGt: ").append(toIndentedString(localIdGt)).append("\n");
        sb.append("    localIdGte: ").append(toIndentedString(localIdGte)).append("\n");
        sb.append("    localIdIn: ").append(toIndentedString(localIdIn)).append("\n");
        sb.append("    localIdLt: ").append(toIndentedString(localIdLt)).append("\n");
        sb.append("    localIdLte: ").append(toIndentedString(localIdLte)).append("\n");
        sb.append("    localIdNot: ").append(toIndentedString(localIdNot)).append("\n");
        sb.append("    localIdNotContains: ")
                .append(toIndentedString(localIdNotContains))
                .append("\n");
        sb.append("    localIdNotEndsWith: ")
                .append(toIndentedString(localIdNotEndsWith))
                .append("\n");
        sb.append("    localIdNotIn: ").append(toIndentedString(localIdNotIn)).append("\n");
        sb.append("    localIdNotStartsWith: ")
                .append(toIndentedString(localIdNotStartsWith))
                .append("\n");
        sb.append("    localIdStartsWith: ")
                .append(toIndentedString(localIdStartsWith))
                .append("\n");
        sb.append("    metaName: ").append(toIndentedString(metaName)).append("\n");
        sb.append("    metaNameContains: ").append(toIndentedString(metaNameContains)).append("\n");
        sb.append("    metaNameEndsWith: ").append(toIndentedString(metaNameEndsWith)).append("\n");
        sb.append("    metaNameGt: ").append(toIndentedString(metaNameGt)).append("\n");
        sb.append("    metaNameGte: ").append(toIndentedString(metaNameGte)).append("\n");
        sb.append("    metaNameIn: ").append(toIndentedString(metaNameIn)).append("\n");
        sb.append("    metaNameLt: ").append(toIndentedString(metaNameLt)).append("\n");
        sb.append("    metaNameLte: ").append(toIndentedString(metaNameLte)).append("\n");
        sb.append("    metaNameNot: ").append(toIndentedString(metaNameNot)).append("\n");
        sb.append("    metaNameNotContains: ")
                .append(toIndentedString(metaNameNotContains))
                .append("\n");
        sb.append("    metaNameNotEndsWith: ")
                .append(toIndentedString(metaNameNotEndsWith))
                .append("\n");
        sb.append("    metaNameNotIn: ").append(toIndentedString(metaNameNotIn)).append("\n");
        sb.append("    metaNameNotStartsWith: ")
                .append(toIndentedString(metaNameNotStartsWith))
                .append("\n");
        sb.append("    metaNameStartsWith: ")
                .append(toIndentedString(metaNameStartsWith))
                .append("\n");
        sb.append("    metaSize: ").append(toIndentedString(metaSize)).append("\n");
        sb.append("    metaSizeGt: ").append(toIndentedString(metaSizeGt)).append("\n");
        sb.append("    metaSizeGte: ").append(toIndentedString(metaSizeGte)).append("\n");
        sb.append("    metaSizeIn: ").append(toIndentedString(metaSizeIn)).append("\n");
        sb.append("    metaSizeLt: ").append(toIndentedString(metaSizeLt)).append("\n");
        sb.append("    metaSizeLte: ").append(toIndentedString(metaSizeLte)).append("\n");
        sb.append("    metaSizeNot: ").append(toIndentedString(metaSizeNot)).append("\n");
        sb.append("    metaSizeNotIn: ").append(toIndentedString(metaSizeNotIn)).append("\n");
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
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    sizeGt: ").append(toIndentedString(sizeGt)).append("\n");
        sb.append("    sizeGte: ").append(toIndentedString(sizeGte)).append("\n");
        sb.append("    sizeIn: ").append(toIndentedString(sizeIn)).append("\n");
        sb.append("    sizeLt: ").append(toIndentedString(sizeLt)).append("\n");
        sb.append("    sizeLte: ").append(toIndentedString(sizeLte)).append("\n");
        sb.append("    sizeNot: ").append(toIndentedString(sizeNot)).append("\n");
        sb.append("    sizeNotIn: ").append(toIndentedString(sizeNotIn)).append("\n");
        sb.append("    upgradeToolVersion: ")
                .append(toIndentedString(upgradeToolVersion))
                .append("\n");
        sb.append("    upgradeToolVersionContains: ")
                .append(toIndentedString(upgradeToolVersionContains))
                .append("\n");
        sb.append("    upgradeToolVersionEndsWith: ")
                .append(toIndentedString(upgradeToolVersionEndsWith))
                .append("\n");
        sb.append("    upgradeToolVersionGt: ")
                .append(toIndentedString(upgradeToolVersionGt))
                .append("\n");
        sb.append("    upgradeToolVersionGte: ")
                .append(toIndentedString(upgradeToolVersionGte))
                .append("\n");
        sb.append("    upgradeToolVersionIn: ")
                .append(toIndentedString(upgradeToolVersionIn))
                .append("\n");
        sb.append("    upgradeToolVersionLt: ")
                .append(toIndentedString(upgradeToolVersionLt))
                .append("\n");
        sb.append("    upgradeToolVersionLte: ")
                .append(toIndentedString(upgradeToolVersionLte))
                .append("\n");
        sb.append("    upgradeToolVersionNot: ")
                .append(toIndentedString(upgradeToolVersionNot))
                .append("\n");
        sb.append("    upgradeToolVersionNotContains: ")
                .append(toIndentedString(upgradeToolVersionNotContains))
                .append("\n");
        sb.append("    upgradeToolVersionNotEndsWith: ")
                .append(toIndentedString(upgradeToolVersionNotEndsWith))
                .append("\n");
        sb.append("    upgradeToolVersionNotIn: ")
                .append(toIndentedString(upgradeToolVersionNotIn))
                .append("\n");
        sb.append("    upgradeToolVersionNotStartsWith: ")
                .append(toIndentedString(upgradeToolVersionNotStartsWith))
                .append("\n");
        sb.append("    upgradeToolVersionStartsWith: ")
                .append(toIndentedString(upgradeToolVersionStartsWith))
                .append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    versionContains: ").append(toIndentedString(versionContains)).append("\n");
        sb.append("    versionEndsWith: ").append(toIndentedString(versionEndsWith)).append("\n");
        sb.append("    versionGt: ").append(toIndentedString(versionGt)).append("\n");
        sb.append("    versionGte: ").append(toIndentedString(versionGte)).append("\n");
        sb.append("    versionIn: ").append(toIndentedString(versionIn)).append("\n");
        sb.append("    versionLt: ").append(toIndentedString(versionLt)).append("\n");
        sb.append("    versionLte: ").append(toIndentedString(versionLte)).append("\n");
        sb.append("    versionNot: ").append(toIndentedString(versionNot)).append("\n");
        sb.append("    versionNotContains: ")
                .append(toIndentedString(versionNotContains))
                .append("\n");
        sb.append("    versionNotEndsWith: ")
                .append(toIndentedString(versionNotEndsWith))
                .append("\n");
        sb.append("    versionNotIn: ").append(toIndentedString(versionNotIn)).append("\n");
        sb.append("    versionNotStartsWith: ")
                .append(toIndentedString(versionNotStartsWith))
                .append("\n");
        sb.append("    versionSemanticGt: ")
                .append(toIndentedString(versionSemanticGt))
                .append("\n");
        sb.append("    versionSemanticGte: ")
                .append(toIndentedString(versionSemanticGte))
                .append("\n");
        sb.append("    versionSemanticLt: ")
                .append(toIndentedString(versionSemanticLt))
                .append("\n");
        sb.append("    versionSemanticLte: ")
                .append(toIndentedString(versionSemanticLte))
                .append("\n");
        sb.append("    versionStartsWith: ")
                .append(toIndentedString(versionStartsWith))
                .append("\n");
        sb.append("    zbsVersion: ").append(toIndentedString(zbsVersion)).append("\n");
        sb.append("    zbsVersionContains: ")
                .append(toIndentedString(zbsVersionContains))
                .append("\n");
        sb.append("    zbsVersionEndsWith: ")
                .append(toIndentedString(zbsVersionEndsWith))
                .append("\n");
        sb.append("    zbsVersionGt: ").append(toIndentedString(zbsVersionGt)).append("\n");
        sb.append("    zbsVersionGte: ").append(toIndentedString(zbsVersionGte)).append("\n");
        sb.append("    zbsVersionIn: ").append(toIndentedString(zbsVersionIn)).append("\n");
        sb.append("    zbsVersionLt: ").append(toIndentedString(zbsVersionLt)).append("\n");
        sb.append("    zbsVersionLte: ").append(toIndentedString(zbsVersionLte)).append("\n");
        sb.append("    zbsVersionNot: ").append(toIndentedString(zbsVersionNot)).append("\n");
        sb.append("    zbsVersionNotContains: ")
                .append(toIndentedString(zbsVersionNotContains))
                .append("\n");
        sb.append("    zbsVersionNotEndsWith: ")
                .append(toIndentedString(zbsVersionNotEndsWith))
                .append("\n");
        sb.append("    zbsVersionNotIn: ").append(toIndentedString(zbsVersionNotIn)).append("\n");
        sb.append("    zbsVersionNotStartsWith: ")
                .append(toIndentedString(zbsVersionNotStartsWith))
                .append("\n");
        sb.append("    zbsVersionStartsWith: ")
                .append(toIndentedString(zbsVersionStartsWith))
                .append("\n");
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

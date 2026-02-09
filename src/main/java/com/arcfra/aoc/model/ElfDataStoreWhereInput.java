package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** ElfDataStoreWhereInput */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class ElfDataStoreWhereInput
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_A_N_D = "AND";

    @SerializedName(SERIALIZED_NAME_A_N_D)
    private List<ElfDataStoreWhereInput> AND = null;

    public static final String SERIALIZED_NAME_N_O_T = "NOT";

    @SerializedName(SERIALIZED_NAME_N_O_T)
    private List<ElfDataStoreWhereInput> NOT = null;

    public static final String SERIALIZED_NAME_O_R = "OR";

    @SerializedName(SERIALIZED_NAME_O_R)
    private List<ElfDataStoreWhereInput> OR = null;

    public static final String SERIALIZED_NAME_CLUSTER = "cluster";

    @SerializedName(SERIALIZED_NAME_CLUSTER)
    private ClusterWhereInput cluster;

    public static final String SERIALIZED_NAME_DESCRIPTION = "description";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION)
    private String description;

    public static final String SERIALIZED_NAME_DESCRIPTION_CONTAINS = "description_contains";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION_CONTAINS)
    private String descriptionContains;

    public static final String SERIALIZED_NAME_DESCRIPTION_ENDS_WITH = "description_ends_with";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION_ENDS_WITH)
    private String descriptionEndsWith;

    public static final String SERIALIZED_NAME_DESCRIPTION_GT = "description_gt";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION_GT)
    private String descriptionGt;

    public static final String SERIALIZED_NAME_DESCRIPTION_GTE = "description_gte";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION_GTE)
    private String descriptionGte;

    public static final String SERIALIZED_NAME_DESCRIPTION_IN = "description_in";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION_IN)
    private List<String> descriptionIn = null;

    public static final String SERIALIZED_NAME_DESCRIPTION_LT = "description_lt";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION_LT)
    private String descriptionLt;

    public static final String SERIALIZED_NAME_DESCRIPTION_LTE = "description_lte";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION_LTE)
    private String descriptionLte;

    public static final String SERIALIZED_NAME_DESCRIPTION_NOT = "description_not";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION_NOT)
    private String descriptionNot;

    public static final String SERIALIZED_NAME_DESCRIPTION_NOT_CONTAINS =
            "description_not_contains";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION_NOT_CONTAINS)
    private String descriptionNotContains;

    public static final String SERIALIZED_NAME_DESCRIPTION_NOT_ENDS_WITH =
            "description_not_ends_with";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION_NOT_ENDS_WITH)
    private String descriptionNotEndsWith;

    public static final String SERIALIZED_NAME_DESCRIPTION_NOT_IN = "description_not_in";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION_NOT_IN)
    private List<String> descriptionNotIn = null;

    public static final String SERIALIZED_NAME_DESCRIPTION_NOT_STARTS_WITH =
            "description_not_starts_with";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION_NOT_STARTS_WITH)
    private String descriptionNotStartsWith;

    public static final String SERIALIZED_NAME_DESCRIPTION_STARTS_WITH = "description_starts_with";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION_STARTS_WITH)
    private String descriptionStartsWith;

    public static final String SERIALIZED_NAME_EXTERNAL_USE = "external_use";

    @SerializedName(SERIALIZED_NAME_EXTERNAL_USE)
    private Boolean externalUse;

    public static final String SERIALIZED_NAME_EXTERNAL_USE_NOT = "external_use_not";

    @SerializedName(SERIALIZED_NAME_EXTERNAL_USE_NOT)
    private Boolean externalUseNot;

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

    public static final String SERIALIZED_NAME_INTERNAL = "internal";

    @SerializedName(SERIALIZED_NAME_INTERNAL)
    private Boolean internal;

    public static final String SERIALIZED_NAME_INTERNAL_NOT = "internal_not";

    @SerializedName(SERIALIZED_NAME_INTERNAL_NOT)
    private Boolean internalNot;

    public static final String SERIALIZED_NAME_IP_WHITELIST = "ip_whitelist";

    @SerializedName(SERIALIZED_NAME_IP_WHITELIST)
    private String ipWhitelist;

    public static final String SERIALIZED_NAME_IP_WHITELIST_CONTAINS = "ip_whitelist_contains";

    @SerializedName(SERIALIZED_NAME_IP_WHITELIST_CONTAINS)
    private String ipWhitelistContains;

    public static final String SERIALIZED_NAME_IP_WHITELIST_ENDS_WITH = "ip_whitelist_ends_with";

    @SerializedName(SERIALIZED_NAME_IP_WHITELIST_ENDS_WITH)
    private String ipWhitelistEndsWith;

    public static final String SERIALIZED_NAME_IP_WHITELIST_GT = "ip_whitelist_gt";

    @SerializedName(SERIALIZED_NAME_IP_WHITELIST_GT)
    private String ipWhitelistGt;

    public static final String SERIALIZED_NAME_IP_WHITELIST_GTE = "ip_whitelist_gte";

    @SerializedName(SERIALIZED_NAME_IP_WHITELIST_GTE)
    private String ipWhitelistGte;

    public static final String SERIALIZED_NAME_IP_WHITELIST_IN = "ip_whitelist_in";

    @SerializedName(SERIALIZED_NAME_IP_WHITELIST_IN)
    private List<String> ipWhitelistIn = null;

    public static final String SERIALIZED_NAME_IP_WHITELIST_LT = "ip_whitelist_lt";

    @SerializedName(SERIALIZED_NAME_IP_WHITELIST_LT)
    private String ipWhitelistLt;

    public static final String SERIALIZED_NAME_IP_WHITELIST_LTE = "ip_whitelist_lte";

    @SerializedName(SERIALIZED_NAME_IP_WHITELIST_LTE)
    private String ipWhitelistLte;

    public static final String SERIALIZED_NAME_IP_WHITELIST_NOT = "ip_whitelist_not";

    @SerializedName(SERIALIZED_NAME_IP_WHITELIST_NOT)
    private String ipWhitelistNot;

    public static final String SERIALIZED_NAME_IP_WHITELIST_NOT_CONTAINS =
            "ip_whitelist_not_contains";

    @SerializedName(SERIALIZED_NAME_IP_WHITELIST_NOT_CONTAINS)
    private String ipWhitelistNotContains;

    public static final String SERIALIZED_NAME_IP_WHITELIST_NOT_ENDS_WITH =
            "ip_whitelist_not_ends_with";

    @SerializedName(SERIALIZED_NAME_IP_WHITELIST_NOT_ENDS_WITH)
    private String ipWhitelistNotEndsWith;

    public static final String SERIALIZED_NAME_IP_WHITELIST_NOT_IN = "ip_whitelist_not_in";

    @SerializedName(SERIALIZED_NAME_IP_WHITELIST_NOT_IN)
    private List<String> ipWhitelistNotIn = null;

    public static final String SERIALIZED_NAME_IP_WHITELIST_NOT_STARTS_WITH =
            "ip_whitelist_not_starts_with";

    @SerializedName(SERIALIZED_NAME_IP_WHITELIST_NOT_STARTS_WITH)
    private String ipWhitelistNotStartsWith;

    public static final String SERIALIZED_NAME_IP_WHITELIST_STARTS_WITH =
            "ip_whitelist_starts_with";

    @SerializedName(SERIALIZED_NAME_IP_WHITELIST_STARTS_WITH)
    private String ipWhitelistStartsWith;

    public static final String SERIALIZED_NAME_ISCSI_TARGET = "iscsi_target";

    @SerializedName(SERIALIZED_NAME_ISCSI_TARGET)
    private IscsiTargetWhereInput iscsiTarget;

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

    public static final String SERIALIZED_NAME_NFS_EXPORT = "nfs_export";

    @SerializedName(SERIALIZED_NAME_NFS_EXPORT)
    private NfsExportWhereInput nfsExport;

    public static final String SERIALIZED_NAME_NVMF_SUBSYSTEM = "nvmf_subsystem";

    @SerializedName(SERIALIZED_NAME_NVMF_SUBSYSTEM)
    private NvmfSubsystemWhereInput nvmfSubsystem;

    public static final String SERIALIZED_NAME_REPLICA_NUM = "replica_num";

    @SerializedName(SERIALIZED_NAME_REPLICA_NUM)
    private Integer replicaNum;

    public static final String SERIALIZED_NAME_REPLICA_NUM_GT = "replica_num_gt";

    @SerializedName(SERIALIZED_NAME_REPLICA_NUM_GT)
    private Integer replicaNumGt;

    public static final String SERIALIZED_NAME_REPLICA_NUM_GTE = "replica_num_gte";

    @SerializedName(SERIALIZED_NAME_REPLICA_NUM_GTE)
    private Integer replicaNumGte;

    public static final String SERIALIZED_NAME_REPLICA_NUM_IN = "replica_num_in";

    @SerializedName(SERIALIZED_NAME_REPLICA_NUM_IN)
    private List<Integer> replicaNumIn = null;

    public static final String SERIALIZED_NAME_REPLICA_NUM_LT = "replica_num_lt";

    @SerializedName(SERIALIZED_NAME_REPLICA_NUM_LT)
    private Integer replicaNumLt;

    public static final String SERIALIZED_NAME_REPLICA_NUM_LTE = "replica_num_lte";

    @SerializedName(SERIALIZED_NAME_REPLICA_NUM_LTE)
    private Integer replicaNumLte;

    public static final String SERIALIZED_NAME_REPLICA_NUM_NOT = "replica_num_not";

    @SerializedName(SERIALIZED_NAME_REPLICA_NUM_NOT)
    private Integer replicaNumNot;

    public static final String SERIALIZED_NAME_REPLICA_NUM_NOT_IN = "replica_num_not_in";

    @SerializedName(SERIALIZED_NAME_REPLICA_NUM_NOT_IN)
    private List<Integer> replicaNumNotIn = null;

    public static final String SERIALIZED_NAME_THIN_PROVISION = "thin_provision";

    @SerializedName(SERIALIZED_NAME_THIN_PROVISION)
    private Boolean thinProvision;

    public static final String SERIALIZED_NAME_THIN_PROVISION_NOT = "thin_provision_not";

    @SerializedName(SERIALIZED_NAME_THIN_PROVISION_NOT)
    private Boolean thinProvisionNot;

    public static final String SERIALIZED_NAME_TYPE = "type";

    @SerializedName(SERIALIZED_NAME_TYPE)
    private ElfDataStoreType type;

    public static final String SERIALIZED_NAME_TYPE_IN = "type_in";

    @SerializedName(SERIALIZED_NAME_TYPE_IN)
    private List<ElfDataStoreType> typeIn = null;

    public static final String SERIALIZED_NAME_TYPE_NOT = "type_not";

    @SerializedName(SERIALIZED_NAME_TYPE_NOT)
    private ElfDataStoreType typeNot;

    public static final String SERIALIZED_NAME_TYPE_NOT_IN = "type_not_in";

    @SerializedName(SERIALIZED_NAME_TYPE_NOT_IN)
    private List<ElfDataStoreType> typeNotIn = null;

    public ElfDataStoreWhereInput() {}

    public ElfDataStoreWhereInput AND(List<ElfDataStoreWhereInput> AND) {

        this.AND = AND;
        return this;
    }

    public ElfDataStoreWhereInput addANDItem(ElfDataStoreWhereInput ANDItem) {
        if (this.AND == null) {
            this.AND = new ArrayList<ElfDataStoreWhereInput>();
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
    public List<ElfDataStoreWhereInput> getAND() {
        return AND;
    }

    public void setAND(List<ElfDataStoreWhereInput> AND) {
        this.AND = AND;
    }

    public ElfDataStoreWhereInput AND_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_A_N_D);
        return this;
    }

    public ElfDataStoreWhereInput AND_ExplictlyNonNull() {
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

    public ElfDataStoreWhereInput NOT(List<ElfDataStoreWhereInput> NOT) {

        this.NOT = NOT;
        return this;
    }

    public ElfDataStoreWhereInput addNOTItem(ElfDataStoreWhereInput NOTItem) {
        if (this.NOT == null) {
            this.NOT = new ArrayList<ElfDataStoreWhereInput>();
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
    public List<ElfDataStoreWhereInput> getNOT() {
        return NOT;
    }

    public void setNOT(List<ElfDataStoreWhereInput> NOT) {
        this.NOT = NOT;
    }

    public ElfDataStoreWhereInput NOT_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_N_O_T);
        return this;
    }

    public ElfDataStoreWhereInput NOT_ExplictlyNonNull() {
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

    public ElfDataStoreWhereInput OR(List<ElfDataStoreWhereInput> OR) {

        this.OR = OR;
        return this;
    }

    public ElfDataStoreWhereInput addORItem(ElfDataStoreWhereInput ORItem) {
        if (this.OR == null) {
            this.OR = new ArrayList<ElfDataStoreWhereInput>();
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
    public List<ElfDataStoreWhereInput> getOR() {
        return OR;
    }

    public void setOR(List<ElfDataStoreWhereInput> OR) {
        this.OR = OR;
    }

    public ElfDataStoreWhereInput OR_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_O_R);
        return this;
    }

    public ElfDataStoreWhereInput OR_ExplictlyNonNull() {
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

    public ElfDataStoreWhereInput cluster(ClusterWhereInput cluster) {

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

    public ElfDataStoreWhereInput cluster_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER);
        return this;
    }

    public ElfDataStoreWhereInput cluster_ExplictlyNonNull() {
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

    public ElfDataStoreWhereInput description(String description) {

        this.description = description;
        return this;
    }

    /**
     * Get description
     *
     * @return description
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ElfDataStoreWhereInput description_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION);
        return this;
    }

    public ElfDataStoreWhereInput description_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION);
        return this;
    }

    public void setDescription_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION);
        }
    }

    public boolean getDescription_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESCRIPTION);
    }

    public ElfDataStoreWhereInput descriptionContains(String descriptionContains) {

        this.descriptionContains = descriptionContains;
        return this;
    }

    /**
     * Get descriptionContains
     *
     * @return descriptionContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDescriptionContains() {
        return descriptionContains;
    }

    public void setDescriptionContains(String descriptionContains) {
        this.descriptionContains = descriptionContains;
    }

    public ElfDataStoreWhereInput descriptionContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_CONTAINS);
        return this;
    }

    public ElfDataStoreWhereInput descriptionContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_CONTAINS);
        return this;
    }

    public void setDescriptionContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_CONTAINS);
        }
    }

    public boolean getDescriptionContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESCRIPTION_CONTAINS);
    }

    public ElfDataStoreWhereInput descriptionEndsWith(String descriptionEndsWith) {

        this.descriptionEndsWith = descriptionEndsWith;
        return this;
    }

    /**
     * Get descriptionEndsWith
     *
     * @return descriptionEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDescriptionEndsWith() {
        return descriptionEndsWith;
    }

    public void setDescriptionEndsWith(String descriptionEndsWith) {
        this.descriptionEndsWith = descriptionEndsWith;
    }

    public ElfDataStoreWhereInput descriptionEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_ENDS_WITH);
        return this;
    }

    public ElfDataStoreWhereInput descriptionEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_ENDS_WITH);
        return this;
    }

    public void setDescriptionEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_ENDS_WITH);
        }
    }

    public boolean getDescriptionEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESCRIPTION_ENDS_WITH);
    }

    public ElfDataStoreWhereInput descriptionGt(String descriptionGt) {

        this.descriptionGt = descriptionGt;
        return this;
    }

    /**
     * Get descriptionGt
     *
     * @return descriptionGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDescriptionGt() {
        return descriptionGt;
    }

    public void setDescriptionGt(String descriptionGt) {
        this.descriptionGt = descriptionGt;
    }

    public ElfDataStoreWhereInput descriptionGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_GT);
        return this;
    }

    public ElfDataStoreWhereInput descriptionGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_GT);
        return this;
    }

    public void setDescriptionGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_GT);
        }
    }

    public boolean getDescriptionGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESCRIPTION_GT);
    }

    public ElfDataStoreWhereInput descriptionGte(String descriptionGte) {

        this.descriptionGte = descriptionGte;
        return this;
    }

    /**
     * Get descriptionGte
     *
     * @return descriptionGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDescriptionGte() {
        return descriptionGte;
    }

    public void setDescriptionGte(String descriptionGte) {
        this.descriptionGte = descriptionGte;
    }

    public ElfDataStoreWhereInput descriptionGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_GTE);
        return this;
    }

    public ElfDataStoreWhereInput descriptionGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_GTE);
        return this;
    }

    public void setDescriptionGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_GTE);
        }
    }

    public boolean getDescriptionGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESCRIPTION_GTE);
    }

    public ElfDataStoreWhereInput descriptionIn(List<String> descriptionIn) {

        this.descriptionIn = descriptionIn;
        return this;
    }

    public ElfDataStoreWhereInput addDescriptionInItem(String descriptionInItem) {
        if (this.descriptionIn == null) {
            this.descriptionIn = new ArrayList<String>();
        }
        this.descriptionIn.add(descriptionInItem);
        return this;
    }

    /**
     * Get descriptionIn
     *
     * @return descriptionIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getDescriptionIn() {
        return descriptionIn;
    }

    public void setDescriptionIn(List<String> descriptionIn) {
        this.descriptionIn = descriptionIn;
    }

    public ElfDataStoreWhereInput descriptionIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_IN);
        return this;
    }

    public ElfDataStoreWhereInput descriptionIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_IN);
        return this;
    }

    public void setDescriptionIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_IN);
        }
    }

    public boolean getDescriptionIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESCRIPTION_IN);
    }

    public ElfDataStoreWhereInput descriptionLt(String descriptionLt) {

        this.descriptionLt = descriptionLt;
        return this;
    }

    /**
     * Get descriptionLt
     *
     * @return descriptionLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDescriptionLt() {
        return descriptionLt;
    }

    public void setDescriptionLt(String descriptionLt) {
        this.descriptionLt = descriptionLt;
    }

    public ElfDataStoreWhereInput descriptionLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_LT);
        return this;
    }

    public ElfDataStoreWhereInput descriptionLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_LT);
        return this;
    }

    public void setDescriptionLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_LT);
        }
    }

    public boolean getDescriptionLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESCRIPTION_LT);
    }

    public ElfDataStoreWhereInput descriptionLte(String descriptionLte) {

        this.descriptionLte = descriptionLte;
        return this;
    }

    /**
     * Get descriptionLte
     *
     * @return descriptionLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDescriptionLte() {
        return descriptionLte;
    }

    public void setDescriptionLte(String descriptionLte) {
        this.descriptionLte = descriptionLte;
    }

    public ElfDataStoreWhereInput descriptionLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_LTE);
        return this;
    }

    public ElfDataStoreWhereInput descriptionLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_LTE);
        return this;
    }

    public void setDescriptionLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_LTE);
        }
    }

    public boolean getDescriptionLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESCRIPTION_LTE);
    }

    public ElfDataStoreWhereInput descriptionNot(String descriptionNot) {

        this.descriptionNot = descriptionNot;
        return this;
    }

    /**
     * Get descriptionNot
     *
     * @return descriptionNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDescriptionNot() {
        return descriptionNot;
    }

    public void setDescriptionNot(String descriptionNot) {
        this.descriptionNot = descriptionNot;
    }

    public ElfDataStoreWhereInput descriptionNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT);
        return this;
    }

    public ElfDataStoreWhereInput descriptionNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_NOT);
        return this;
    }

    public void setDescriptionNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_NOT);
        }
    }

    public boolean getDescriptionNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESCRIPTION_NOT);
    }

    public ElfDataStoreWhereInput descriptionNotContains(String descriptionNotContains) {

        this.descriptionNotContains = descriptionNotContains;
        return this;
    }

    /**
     * Get descriptionNotContains
     *
     * @return descriptionNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDescriptionNotContains() {
        return descriptionNotContains;
    }

    public void setDescriptionNotContains(String descriptionNotContains) {
        this.descriptionNotContains = descriptionNotContains;
    }

    public ElfDataStoreWhereInput descriptionNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_CONTAINS);
        return this;
    }

    public ElfDataStoreWhereInput descriptionNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_NOT_CONTAINS);
        return this;
    }

    public void setDescriptionNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_NOT_CONTAINS);
        }
    }

    public boolean getDescriptionNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESCRIPTION_NOT_CONTAINS);
    }

    public ElfDataStoreWhereInput descriptionNotEndsWith(String descriptionNotEndsWith) {

        this.descriptionNotEndsWith = descriptionNotEndsWith;
        return this;
    }

    /**
     * Get descriptionNotEndsWith
     *
     * @return descriptionNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDescriptionNotEndsWith() {
        return descriptionNotEndsWith;
    }

    public void setDescriptionNotEndsWith(String descriptionNotEndsWith) {
        this.descriptionNotEndsWith = descriptionNotEndsWith;
    }

    public ElfDataStoreWhereInput descriptionNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_ENDS_WITH);
        return this;
    }

    public ElfDataStoreWhereInput descriptionNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_NOT_ENDS_WITH);
        return this;
    }

    public void setDescriptionNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_NOT_ENDS_WITH);
        }
    }

    public boolean getDescriptionNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESCRIPTION_NOT_ENDS_WITH);
    }

    public ElfDataStoreWhereInput descriptionNotIn(List<String> descriptionNotIn) {

        this.descriptionNotIn = descriptionNotIn;
        return this;
    }

    public ElfDataStoreWhereInput addDescriptionNotInItem(String descriptionNotInItem) {
        if (this.descriptionNotIn == null) {
            this.descriptionNotIn = new ArrayList<String>();
        }
        this.descriptionNotIn.add(descriptionNotInItem);
        return this;
    }

    /**
     * Get descriptionNotIn
     *
     * @return descriptionNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getDescriptionNotIn() {
        return descriptionNotIn;
    }

    public void setDescriptionNotIn(List<String> descriptionNotIn) {
        this.descriptionNotIn = descriptionNotIn;
    }

    public ElfDataStoreWhereInput descriptionNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_IN);
        return this;
    }

    public ElfDataStoreWhereInput descriptionNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_NOT_IN);
        return this;
    }

    public void setDescriptionNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_NOT_IN);
        }
    }

    public boolean getDescriptionNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESCRIPTION_NOT_IN);
    }

    public ElfDataStoreWhereInput descriptionNotStartsWith(String descriptionNotStartsWith) {

        this.descriptionNotStartsWith = descriptionNotStartsWith;
        return this;
    }

    /**
     * Get descriptionNotStartsWith
     *
     * @return descriptionNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDescriptionNotStartsWith() {
        return descriptionNotStartsWith;
    }

    public void setDescriptionNotStartsWith(String descriptionNotStartsWith) {
        this.descriptionNotStartsWith = descriptionNotStartsWith;
    }

    public ElfDataStoreWhereInput descriptionNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_STARTS_WITH);
        return this;
    }

    public ElfDataStoreWhereInput descriptionNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_NOT_STARTS_WITH);
        return this;
    }

    public void setDescriptionNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_NOT_STARTS_WITH);
        }
    }

    public boolean getDescriptionNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESCRIPTION_NOT_STARTS_WITH);
    }

    public ElfDataStoreWhereInput descriptionStartsWith(String descriptionStartsWith) {

        this.descriptionStartsWith = descriptionStartsWith;
        return this;
    }

    /**
     * Get descriptionStartsWith
     *
     * @return descriptionStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDescriptionStartsWith() {
        return descriptionStartsWith;
    }

    public void setDescriptionStartsWith(String descriptionStartsWith) {
        this.descriptionStartsWith = descriptionStartsWith;
    }

    public ElfDataStoreWhereInput descriptionStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_STARTS_WITH);
        return this;
    }

    public ElfDataStoreWhereInput descriptionStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_STARTS_WITH);
        return this;
    }

    public void setDescriptionStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_STARTS_WITH);
        }
    }

    public boolean getDescriptionStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESCRIPTION_STARTS_WITH);
    }

    public ElfDataStoreWhereInput externalUse(Boolean externalUse) {

        this.externalUse = externalUse;
        return this;
    }

    /**
     * Get externalUse
     *
     * @return externalUse
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getExternalUse() {
        return externalUse;
    }

    public void setExternalUse(Boolean externalUse) {
        this.externalUse = externalUse;
    }

    public ElfDataStoreWhereInput externalUse_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXTERNAL_USE);
        return this;
    }

    public ElfDataStoreWhereInput externalUse_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EXTERNAL_USE);
        return this;
    }

    public void setExternalUse_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EXTERNAL_USE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EXTERNAL_USE);
        }
    }

    public boolean getExternalUse_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EXTERNAL_USE);
    }

    public ElfDataStoreWhereInput externalUseNot(Boolean externalUseNot) {

        this.externalUseNot = externalUseNot;
        return this;
    }

    /**
     * Get externalUseNot
     *
     * @return externalUseNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getExternalUseNot() {
        return externalUseNot;
    }

    public void setExternalUseNot(Boolean externalUseNot) {
        this.externalUseNot = externalUseNot;
    }

    public ElfDataStoreWhereInput externalUseNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXTERNAL_USE_NOT);
        return this;
    }

    public ElfDataStoreWhereInput externalUseNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EXTERNAL_USE_NOT);
        return this;
    }

    public void setExternalUseNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EXTERNAL_USE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EXTERNAL_USE_NOT);
        }
    }

    public boolean getExternalUseNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EXTERNAL_USE_NOT);
    }

    public ElfDataStoreWhereInput id(String id) {

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

    public ElfDataStoreWhereInput id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public ElfDataStoreWhereInput id_ExplictlyNonNull() {
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

    public ElfDataStoreWhereInput idContains(String idContains) {

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

    public ElfDataStoreWhereInput idContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_CONTAINS);
        return this;
    }

    public ElfDataStoreWhereInput idContains_ExplictlyNonNull() {
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

    public ElfDataStoreWhereInput idEndsWith(String idEndsWith) {

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

    public ElfDataStoreWhereInput idEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_ENDS_WITH);
        return this;
    }

    public ElfDataStoreWhereInput idEndsWith_ExplictlyNonNull() {
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

    public ElfDataStoreWhereInput idGt(String idGt) {

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

    public ElfDataStoreWhereInput idGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GT);
        return this;
    }

    public ElfDataStoreWhereInput idGt_ExplictlyNonNull() {
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

    public ElfDataStoreWhereInput idGte(String idGte) {

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

    public ElfDataStoreWhereInput idGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GTE);
        return this;
    }

    public ElfDataStoreWhereInput idGte_ExplictlyNonNull() {
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

    public ElfDataStoreWhereInput idIn(List<String> idIn) {

        this.idIn = idIn;
        return this;
    }

    public ElfDataStoreWhereInput addIdInItem(String idInItem) {
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

    public ElfDataStoreWhereInput idIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_IN);
        return this;
    }

    public ElfDataStoreWhereInput idIn_ExplictlyNonNull() {
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

    public ElfDataStoreWhereInput idLt(String idLt) {

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

    public ElfDataStoreWhereInput idLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LT);
        return this;
    }

    public ElfDataStoreWhereInput idLt_ExplictlyNonNull() {
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

    public ElfDataStoreWhereInput idLte(String idLte) {

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

    public ElfDataStoreWhereInput idLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LTE);
        return this;
    }

    public ElfDataStoreWhereInput idLte_ExplictlyNonNull() {
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

    public ElfDataStoreWhereInput idNot(String idNot) {

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

    public ElfDataStoreWhereInput idNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT);
        return this;
    }

    public ElfDataStoreWhereInput idNot_ExplictlyNonNull() {
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

    public ElfDataStoreWhereInput idNotContains(String idNotContains) {

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

    public ElfDataStoreWhereInput idNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_CONTAINS);
        return this;
    }

    public ElfDataStoreWhereInput idNotContains_ExplictlyNonNull() {
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

    public ElfDataStoreWhereInput idNotEndsWith(String idNotEndsWith) {

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

    public ElfDataStoreWhereInput idNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
        return this;
    }

    public ElfDataStoreWhereInput idNotEndsWith_ExplictlyNonNull() {
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

    public ElfDataStoreWhereInput idNotIn(List<String> idNotIn) {

        this.idNotIn = idNotIn;
        return this;
    }

    public ElfDataStoreWhereInput addIdNotInItem(String idNotInItem) {
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

    public ElfDataStoreWhereInput idNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_IN);
        return this;
    }

    public ElfDataStoreWhereInput idNotIn_ExplictlyNonNull() {
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

    public ElfDataStoreWhereInput idNotStartsWith(String idNotStartsWith) {

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

    public ElfDataStoreWhereInput idNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
        return this;
    }

    public ElfDataStoreWhereInput idNotStartsWith_ExplictlyNonNull() {
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

    public ElfDataStoreWhereInput idStartsWith(String idStartsWith) {

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

    public ElfDataStoreWhereInput idStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_STARTS_WITH);
        return this;
    }

    public ElfDataStoreWhereInput idStartsWith_ExplictlyNonNull() {
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

    public ElfDataStoreWhereInput internal(Boolean internal) {

        this.internal = internal;
        return this;
    }

    /**
     * Get internal
     *
     * @return internal
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getInternal() {
        return internal;
    }

    public void setInternal(Boolean internal) {
        this.internal = internal;
    }

    public ElfDataStoreWhereInput internal_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INTERNAL);
        return this;
    }

    public ElfDataStoreWhereInput internal_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INTERNAL);
        return this;
    }

    public void setInternal_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INTERNAL);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INTERNAL);
        }
    }

    public boolean getInternal_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INTERNAL);
    }

    public ElfDataStoreWhereInput internalNot(Boolean internalNot) {

        this.internalNot = internalNot;
        return this;
    }

    /**
     * Get internalNot
     *
     * @return internalNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getInternalNot() {
        return internalNot;
    }

    public void setInternalNot(Boolean internalNot) {
        this.internalNot = internalNot;
    }

    public ElfDataStoreWhereInput internalNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INTERNAL_NOT);
        return this;
    }

    public ElfDataStoreWhereInput internalNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INTERNAL_NOT);
        return this;
    }

    public void setInternalNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INTERNAL_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INTERNAL_NOT);
        }
    }

    public boolean getInternalNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INTERNAL_NOT);
    }

    public ElfDataStoreWhereInput ipWhitelist(String ipWhitelist) {

        this.ipWhitelist = ipWhitelist;
        return this;
    }

    /**
     * Get ipWhitelist
     *
     * @return ipWhitelist
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIpWhitelist() {
        return ipWhitelist;
    }

    public void setIpWhitelist(String ipWhitelist) {
        this.ipWhitelist = ipWhitelist;
    }

    public ElfDataStoreWhereInput ipWhitelist_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_WHITELIST);
        return this;
    }

    public ElfDataStoreWhereInput ipWhitelist_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IP_WHITELIST);
        return this;
    }

    public void setIpWhitelist_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IP_WHITELIST);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IP_WHITELIST);
        }
    }

    public boolean getIpWhitelist_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IP_WHITELIST);
    }

    public ElfDataStoreWhereInput ipWhitelistContains(String ipWhitelistContains) {

        this.ipWhitelistContains = ipWhitelistContains;
        return this;
    }

    /**
     * Get ipWhitelistContains
     *
     * @return ipWhitelistContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIpWhitelistContains() {
        return ipWhitelistContains;
    }

    public void setIpWhitelistContains(String ipWhitelistContains) {
        this.ipWhitelistContains = ipWhitelistContains;
    }

    public ElfDataStoreWhereInput ipWhitelistContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_WHITELIST_CONTAINS);
        return this;
    }

    public ElfDataStoreWhereInput ipWhitelistContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IP_WHITELIST_CONTAINS);
        return this;
    }

    public void setIpWhitelistContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IP_WHITELIST_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IP_WHITELIST_CONTAINS);
        }
    }

    public boolean getIpWhitelistContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IP_WHITELIST_CONTAINS);
    }

    public ElfDataStoreWhereInput ipWhitelistEndsWith(String ipWhitelistEndsWith) {

        this.ipWhitelistEndsWith = ipWhitelistEndsWith;
        return this;
    }

    /**
     * Get ipWhitelistEndsWith
     *
     * @return ipWhitelistEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIpWhitelistEndsWith() {
        return ipWhitelistEndsWith;
    }

    public void setIpWhitelistEndsWith(String ipWhitelistEndsWith) {
        this.ipWhitelistEndsWith = ipWhitelistEndsWith;
    }

    public ElfDataStoreWhereInput ipWhitelistEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_WHITELIST_ENDS_WITH);
        return this;
    }

    public ElfDataStoreWhereInput ipWhitelistEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IP_WHITELIST_ENDS_WITH);
        return this;
    }

    public void setIpWhitelistEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IP_WHITELIST_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IP_WHITELIST_ENDS_WITH);
        }
    }

    public boolean getIpWhitelistEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IP_WHITELIST_ENDS_WITH);
    }

    public ElfDataStoreWhereInput ipWhitelistGt(String ipWhitelistGt) {

        this.ipWhitelistGt = ipWhitelistGt;
        return this;
    }

    /**
     * Get ipWhitelistGt
     *
     * @return ipWhitelistGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIpWhitelistGt() {
        return ipWhitelistGt;
    }

    public void setIpWhitelistGt(String ipWhitelistGt) {
        this.ipWhitelistGt = ipWhitelistGt;
    }

    public ElfDataStoreWhereInput ipWhitelistGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_WHITELIST_GT);
        return this;
    }

    public ElfDataStoreWhereInput ipWhitelistGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IP_WHITELIST_GT);
        return this;
    }

    public void setIpWhitelistGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IP_WHITELIST_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IP_WHITELIST_GT);
        }
    }

    public boolean getIpWhitelistGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IP_WHITELIST_GT);
    }

    public ElfDataStoreWhereInput ipWhitelistGte(String ipWhitelistGte) {

        this.ipWhitelistGte = ipWhitelistGte;
        return this;
    }

    /**
     * Get ipWhitelistGte
     *
     * @return ipWhitelistGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIpWhitelistGte() {
        return ipWhitelistGte;
    }

    public void setIpWhitelistGte(String ipWhitelistGte) {
        this.ipWhitelistGte = ipWhitelistGte;
    }

    public ElfDataStoreWhereInput ipWhitelistGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_WHITELIST_GTE);
        return this;
    }

    public ElfDataStoreWhereInput ipWhitelistGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IP_WHITELIST_GTE);
        return this;
    }

    public void setIpWhitelistGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IP_WHITELIST_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IP_WHITELIST_GTE);
        }
    }

    public boolean getIpWhitelistGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IP_WHITELIST_GTE);
    }

    public ElfDataStoreWhereInput ipWhitelistIn(List<String> ipWhitelistIn) {

        this.ipWhitelistIn = ipWhitelistIn;
        return this;
    }

    public ElfDataStoreWhereInput addIpWhitelistInItem(String ipWhitelistInItem) {
        if (this.ipWhitelistIn == null) {
            this.ipWhitelistIn = new ArrayList<String>();
        }
        this.ipWhitelistIn.add(ipWhitelistInItem);
        return this;
    }

    /**
     * Get ipWhitelistIn
     *
     * @return ipWhitelistIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getIpWhitelistIn() {
        return ipWhitelistIn;
    }

    public void setIpWhitelistIn(List<String> ipWhitelistIn) {
        this.ipWhitelistIn = ipWhitelistIn;
    }

    public ElfDataStoreWhereInput ipWhitelistIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_WHITELIST_IN);
        return this;
    }

    public ElfDataStoreWhereInput ipWhitelistIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IP_WHITELIST_IN);
        return this;
    }

    public void setIpWhitelistIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IP_WHITELIST_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IP_WHITELIST_IN);
        }
    }

    public boolean getIpWhitelistIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IP_WHITELIST_IN);
    }

    public ElfDataStoreWhereInput ipWhitelistLt(String ipWhitelistLt) {

        this.ipWhitelistLt = ipWhitelistLt;
        return this;
    }

    /**
     * Get ipWhitelistLt
     *
     * @return ipWhitelistLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIpWhitelistLt() {
        return ipWhitelistLt;
    }

    public void setIpWhitelistLt(String ipWhitelistLt) {
        this.ipWhitelistLt = ipWhitelistLt;
    }

    public ElfDataStoreWhereInput ipWhitelistLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_WHITELIST_LT);
        return this;
    }

    public ElfDataStoreWhereInput ipWhitelistLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IP_WHITELIST_LT);
        return this;
    }

    public void setIpWhitelistLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IP_WHITELIST_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IP_WHITELIST_LT);
        }
    }

    public boolean getIpWhitelistLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IP_WHITELIST_LT);
    }

    public ElfDataStoreWhereInput ipWhitelistLte(String ipWhitelistLte) {

        this.ipWhitelistLte = ipWhitelistLte;
        return this;
    }

    /**
     * Get ipWhitelistLte
     *
     * @return ipWhitelistLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIpWhitelistLte() {
        return ipWhitelistLte;
    }

    public void setIpWhitelistLte(String ipWhitelistLte) {
        this.ipWhitelistLte = ipWhitelistLte;
    }

    public ElfDataStoreWhereInput ipWhitelistLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_WHITELIST_LTE);
        return this;
    }

    public ElfDataStoreWhereInput ipWhitelistLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IP_WHITELIST_LTE);
        return this;
    }

    public void setIpWhitelistLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IP_WHITELIST_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IP_WHITELIST_LTE);
        }
    }

    public boolean getIpWhitelistLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IP_WHITELIST_LTE);
    }

    public ElfDataStoreWhereInput ipWhitelistNot(String ipWhitelistNot) {

        this.ipWhitelistNot = ipWhitelistNot;
        return this;
    }

    /**
     * Get ipWhitelistNot
     *
     * @return ipWhitelistNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIpWhitelistNot() {
        return ipWhitelistNot;
    }

    public void setIpWhitelistNot(String ipWhitelistNot) {
        this.ipWhitelistNot = ipWhitelistNot;
    }

    public ElfDataStoreWhereInput ipWhitelistNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_WHITELIST_NOT);
        return this;
    }

    public ElfDataStoreWhereInput ipWhitelistNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IP_WHITELIST_NOT);
        return this;
    }

    public void setIpWhitelistNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IP_WHITELIST_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IP_WHITELIST_NOT);
        }
    }

    public boolean getIpWhitelistNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IP_WHITELIST_NOT);
    }

    public ElfDataStoreWhereInput ipWhitelistNotContains(String ipWhitelistNotContains) {

        this.ipWhitelistNotContains = ipWhitelistNotContains;
        return this;
    }

    /**
     * Get ipWhitelistNotContains
     *
     * @return ipWhitelistNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIpWhitelistNotContains() {
        return ipWhitelistNotContains;
    }

    public void setIpWhitelistNotContains(String ipWhitelistNotContains) {
        this.ipWhitelistNotContains = ipWhitelistNotContains;
    }

    public ElfDataStoreWhereInput ipWhitelistNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_WHITELIST_NOT_CONTAINS);
        return this;
    }

    public ElfDataStoreWhereInput ipWhitelistNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IP_WHITELIST_NOT_CONTAINS);
        return this;
    }

    public void setIpWhitelistNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IP_WHITELIST_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IP_WHITELIST_NOT_CONTAINS);
        }
    }

    public boolean getIpWhitelistNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IP_WHITELIST_NOT_CONTAINS);
    }

    public ElfDataStoreWhereInput ipWhitelistNotEndsWith(String ipWhitelistNotEndsWith) {

        this.ipWhitelistNotEndsWith = ipWhitelistNotEndsWith;
        return this;
    }

    /**
     * Get ipWhitelistNotEndsWith
     *
     * @return ipWhitelistNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIpWhitelistNotEndsWith() {
        return ipWhitelistNotEndsWith;
    }

    public void setIpWhitelistNotEndsWith(String ipWhitelistNotEndsWith) {
        this.ipWhitelistNotEndsWith = ipWhitelistNotEndsWith;
    }

    public ElfDataStoreWhereInput ipWhitelistNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_WHITELIST_NOT_ENDS_WITH);
        return this;
    }

    public ElfDataStoreWhereInput ipWhitelistNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IP_WHITELIST_NOT_ENDS_WITH);
        return this;
    }

    public void setIpWhitelistNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IP_WHITELIST_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IP_WHITELIST_NOT_ENDS_WITH);
        }
    }

    public boolean getIpWhitelistNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IP_WHITELIST_NOT_ENDS_WITH);
    }

    public ElfDataStoreWhereInput ipWhitelistNotIn(List<String> ipWhitelistNotIn) {

        this.ipWhitelistNotIn = ipWhitelistNotIn;
        return this;
    }

    public ElfDataStoreWhereInput addIpWhitelistNotInItem(String ipWhitelistNotInItem) {
        if (this.ipWhitelistNotIn == null) {
            this.ipWhitelistNotIn = new ArrayList<String>();
        }
        this.ipWhitelistNotIn.add(ipWhitelistNotInItem);
        return this;
    }

    /**
     * Get ipWhitelistNotIn
     *
     * @return ipWhitelistNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getIpWhitelistNotIn() {
        return ipWhitelistNotIn;
    }

    public void setIpWhitelistNotIn(List<String> ipWhitelistNotIn) {
        this.ipWhitelistNotIn = ipWhitelistNotIn;
    }

    public ElfDataStoreWhereInput ipWhitelistNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_WHITELIST_NOT_IN);
        return this;
    }

    public ElfDataStoreWhereInput ipWhitelistNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IP_WHITELIST_NOT_IN);
        return this;
    }

    public void setIpWhitelistNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IP_WHITELIST_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IP_WHITELIST_NOT_IN);
        }
    }

    public boolean getIpWhitelistNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IP_WHITELIST_NOT_IN);
    }

    public ElfDataStoreWhereInput ipWhitelistNotStartsWith(String ipWhitelistNotStartsWith) {

        this.ipWhitelistNotStartsWith = ipWhitelistNotStartsWith;
        return this;
    }

    /**
     * Get ipWhitelistNotStartsWith
     *
     * @return ipWhitelistNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIpWhitelistNotStartsWith() {
        return ipWhitelistNotStartsWith;
    }

    public void setIpWhitelistNotStartsWith(String ipWhitelistNotStartsWith) {
        this.ipWhitelistNotStartsWith = ipWhitelistNotStartsWith;
    }

    public ElfDataStoreWhereInput ipWhitelistNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_WHITELIST_NOT_STARTS_WITH);
        return this;
    }

    public ElfDataStoreWhereInput ipWhitelistNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IP_WHITELIST_NOT_STARTS_WITH);
        return this;
    }

    public void setIpWhitelistNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IP_WHITELIST_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IP_WHITELIST_NOT_STARTS_WITH);
        }
    }

    public boolean getIpWhitelistNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IP_WHITELIST_NOT_STARTS_WITH);
    }

    public ElfDataStoreWhereInput ipWhitelistStartsWith(String ipWhitelistStartsWith) {

        this.ipWhitelistStartsWith = ipWhitelistStartsWith;
        return this;
    }

    /**
     * Get ipWhitelistStartsWith
     *
     * @return ipWhitelistStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIpWhitelistStartsWith() {
        return ipWhitelistStartsWith;
    }

    public void setIpWhitelistStartsWith(String ipWhitelistStartsWith) {
        this.ipWhitelistStartsWith = ipWhitelistStartsWith;
    }

    public ElfDataStoreWhereInput ipWhitelistStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_WHITELIST_STARTS_WITH);
        return this;
    }

    public ElfDataStoreWhereInput ipWhitelistStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IP_WHITELIST_STARTS_WITH);
        return this;
    }

    public void setIpWhitelistStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IP_WHITELIST_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IP_WHITELIST_STARTS_WITH);
        }
    }

    public boolean getIpWhitelistStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IP_WHITELIST_STARTS_WITH);
    }

    public ElfDataStoreWhereInput iscsiTarget(IscsiTargetWhereInput iscsiTarget) {

        this.iscsiTarget = iscsiTarget;
        return this;
    }

    /**
     * Get iscsiTarget
     *
     * @return iscsiTarget
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public IscsiTargetWhereInput getIscsiTarget() {
        return iscsiTarget;
    }

    public void setIscsiTarget(IscsiTargetWhereInput iscsiTarget) {
        this.iscsiTarget = iscsiTarget;
    }

    public ElfDataStoreWhereInput iscsiTarget_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_TARGET);
        return this;
    }

    public ElfDataStoreWhereInput iscsiTarget_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_TARGET);
        return this;
    }

    public void setIscsiTarget_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_TARGET);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_TARGET);
        }
    }

    public boolean getIscsiTarget_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_TARGET);
    }

    public ElfDataStoreWhereInput localId(String localId) {

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

    public ElfDataStoreWhereInput localId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID);
        return this;
    }

    public ElfDataStoreWhereInput localId_ExplictlyNonNull() {
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

    public ElfDataStoreWhereInput localIdContains(String localIdContains) {

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

    public ElfDataStoreWhereInput localIdContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_CONTAINS);
        return this;
    }

    public ElfDataStoreWhereInput localIdContains_ExplictlyNonNull() {
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

    public ElfDataStoreWhereInput localIdEndsWith(String localIdEndsWith) {

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

    public ElfDataStoreWhereInput localIdEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_ENDS_WITH);
        return this;
    }

    public ElfDataStoreWhereInput localIdEndsWith_ExplictlyNonNull() {
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

    public ElfDataStoreWhereInput localIdGt(String localIdGt) {

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

    public ElfDataStoreWhereInput localIdGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_GT);
        return this;
    }

    public ElfDataStoreWhereInput localIdGt_ExplictlyNonNull() {
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

    public ElfDataStoreWhereInput localIdGte(String localIdGte) {

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

    public ElfDataStoreWhereInput localIdGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_GTE);
        return this;
    }

    public ElfDataStoreWhereInput localIdGte_ExplictlyNonNull() {
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

    public ElfDataStoreWhereInput localIdIn(List<String> localIdIn) {

        this.localIdIn = localIdIn;
        return this;
    }

    public ElfDataStoreWhereInput addLocalIdInItem(String localIdInItem) {
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

    public ElfDataStoreWhereInput localIdIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_IN);
        return this;
    }

    public ElfDataStoreWhereInput localIdIn_ExplictlyNonNull() {
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

    public ElfDataStoreWhereInput localIdLt(String localIdLt) {

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

    public ElfDataStoreWhereInput localIdLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_LT);
        return this;
    }

    public ElfDataStoreWhereInput localIdLt_ExplictlyNonNull() {
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

    public ElfDataStoreWhereInput localIdLte(String localIdLte) {

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

    public ElfDataStoreWhereInput localIdLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_LTE);
        return this;
    }

    public ElfDataStoreWhereInput localIdLte_ExplictlyNonNull() {
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

    public ElfDataStoreWhereInput localIdNot(String localIdNot) {

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

    public ElfDataStoreWhereInput localIdNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT);
        return this;
    }

    public ElfDataStoreWhereInput localIdNot_ExplictlyNonNull() {
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

    public ElfDataStoreWhereInput localIdNotContains(String localIdNotContains) {

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

    public ElfDataStoreWhereInput localIdNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_CONTAINS);
        return this;
    }

    public ElfDataStoreWhereInput localIdNotContains_ExplictlyNonNull() {
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

    public ElfDataStoreWhereInput localIdNotEndsWith(String localIdNotEndsWith) {

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

    public ElfDataStoreWhereInput localIdNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_ENDS_WITH);
        return this;
    }

    public ElfDataStoreWhereInput localIdNotEndsWith_ExplictlyNonNull() {
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

    public ElfDataStoreWhereInput localIdNotIn(List<String> localIdNotIn) {

        this.localIdNotIn = localIdNotIn;
        return this;
    }

    public ElfDataStoreWhereInput addLocalIdNotInItem(String localIdNotInItem) {
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

    public ElfDataStoreWhereInput localIdNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_IN);
        return this;
    }

    public ElfDataStoreWhereInput localIdNotIn_ExplictlyNonNull() {
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

    public ElfDataStoreWhereInput localIdNotStartsWith(String localIdNotStartsWith) {

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

    public ElfDataStoreWhereInput localIdNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_STARTS_WITH);
        return this;
    }

    public ElfDataStoreWhereInput localIdNotStartsWith_ExplictlyNonNull() {
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

    public ElfDataStoreWhereInput localIdStartsWith(String localIdStartsWith) {

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

    public ElfDataStoreWhereInput localIdStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_STARTS_WITH);
        return this;
    }

    public ElfDataStoreWhereInput localIdStartsWith_ExplictlyNonNull() {
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

    public ElfDataStoreWhereInput name(String name) {

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

    public ElfDataStoreWhereInput name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public ElfDataStoreWhereInput name_ExplictlyNonNull() {
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

    public ElfDataStoreWhereInput nameContains(String nameContains) {

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

    public ElfDataStoreWhereInput nameContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_CONTAINS);
        return this;
    }

    public ElfDataStoreWhereInput nameContains_ExplictlyNonNull() {
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

    public ElfDataStoreWhereInput nameEndsWith(String nameEndsWith) {

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

    public ElfDataStoreWhereInput nameEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_ENDS_WITH);
        return this;
    }

    public ElfDataStoreWhereInput nameEndsWith_ExplictlyNonNull() {
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

    public ElfDataStoreWhereInput nameGt(String nameGt) {

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

    public ElfDataStoreWhereInput nameGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_GT);
        return this;
    }

    public ElfDataStoreWhereInput nameGt_ExplictlyNonNull() {
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

    public ElfDataStoreWhereInput nameGte(String nameGte) {

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

    public ElfDataStoreWhereInput nameGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_GTE);
        return this;
    }

    public ElfDataStoreWhereInput nameGte_ExplictlyNonNull() {
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

    public ElfDataStoreWhereInput nameIn(List<String> nameIn) {

        this.nameIn = nameIn;
        return this;
    }

    public ElfDataStoreWhereInput addNameInItem(String nameInItem) {
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

    public ElfDataStoreWhereInput nameIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_IN);
        return this;
    }

    public ElfDataStoreWhereInput nameIn_ExplictlyNonNull() {
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

    public ElfDataStoreWhereInput nameLt(String nameLt) {

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

    public ElfDataStoreWhereInput nameLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_LT);
        return this;
    }

    public ElfDataStoreWhereInput nameLt_ExplictlyNonNull() {
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

    public ElfDataStoreWhereInput nameLte(String nameLte) {

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

    public ElfDataStoreWhereInput nameLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_LTE);
        return this;
    }

    public ElfDataStoreWhereInput nameLte_ExplictlyNonNull() {
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

    public ElfDataStoreWhereInput nameNot(String nameNot) {

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

    public ElfDataStoreWhereInput nameNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT);
        return this;
    }

    public ElfDataStoreWhereInput nameNot_ExplictlyNonNull() {
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

    public ElfDataStoreWhereInput nameNotContains(String nameNotContains) {

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

    public ElfDataStoreWhereInput nameNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_CONTAINS);
        return this;
    }

    public ElfDataStoreWhereInput nameNotContains_ExplictlyNonNull() {
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

    public ElfDataStoreWhereInput nameNotEndsWith(String nameNotEndsWith) {

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

    public ElfDataStoreWhereInput nameNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_ENDS_WITH);
        return this;
    }

    public ElfDataStoreWhereInput nameNotEndsWith_ExplictlyNonNull() {
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

    public ElfDataStoreWhereInput nameNotIn(List<String> nameNotIn) {

        this.nameNotIn = nameNotIn;
        return this;
    }

    public ElfDataStoreWhereInput addNameNotInItem(String nameNotInItem) {
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

    public ElfDataStoreWhereInput nameNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_IN);
        return this;
    }

    public ElfDataStoreWhereInput nameNotIn_ExplictlyNonNull() {
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

    public ElfDataStoreWhereInput nameNotStartsWith(String nameNotStartsWith) {

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

    public ElfDataStoreWhereInput nameNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_STARTS_WITH);
        return this;
    }

    public ElfDataStoreWhereInput nameNotStartsWith_ExplictlyNonNull() {
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

    public ElfDataStoreWhereInput nameStartsWith(String nameStartsWith) {

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

    public ElfDataStoreWhereInput nameStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_STARTS_WITH);
        return this;
    }

    public ElfDataStoreWhereInput nameStartsWith_ExplictlyNonNull() {
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

    public ElfDataStoreWhereInput nfsExport(NfsExportWhereInput nfsExport) {

        this.nfsExport = nfsExport;
        return this;
    }

    /**
     * Get nfsExport
     *
     * @return nfsExport
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NfsExportWhereInput getNfsExport() {
        return nfsExport;
    }

    public void setNfsExport(NfsExportWhereInput nfsExport) {
        this.nfsExport = nfsExport;
    }

    public ElfDataStoreWhereInput nfsExport_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NFS_EXPORT);
        return this;
    }

    public ElfDataStoreWhereInput nfsExport_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NFS_EXPORT);
        return this;
    }

    public void setNfsExport_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NFS_EXPORT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NFS_EXPORT);
        }
    }

    public boolean getNfsExport_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NFS_EXPORT);
    }

    public ElfDataStoreWhereInput nvmfSubsystem(NvmfSubsystemWhereInput nvmfSubsystem) {

        this.nvmfSubsystem = nvmfSubsystem;
        return this;
    }

    /**
     * Get nvmfSubsystem
     *
     * @return nvmfSubsystem
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NvmfSubsystemWhereInput getNvmfSubsystem() {
        return nvmfSubsystem;
    }

    public void setNvmfSubsystem(NvmfSubsystemWhereInput nvmfSubsystem) {
        this.nvmfSubsystem = nvmfSubsystem;
    }

    public ElfDataStoreWhereInput nvmfSubsystem_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NVMF_SUBSYSTEM);
        return this;
    }

    public ElfDataStoreWhereInput nvmfSubsystem_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NVMF_SUBSYSTEM);
        return this;
    }

    public void setNvmfSubsystem_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NVMF_SUBSYSTEM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NVMF_SUBSYSTEM);
        }
    }

    public boolean getNvmfSubsystem_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NVMF_SUBSYSTEM);
    }

    public ElfDataStoreWhereInput replicaNum(Integer replicaNum) {

        this.replicaNum = replicaNum;
        return this;
    }

    /**
     * Get replicaNum
     *
     * @return replicaNum
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getReplicaNum() {
        return replicaNum;
    }

    public void setReplicaNum(Integer replicaNum) {
        this.replicaNum = replicaNum;
    }

    public ElfDataStoreWhereInput replicaNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICA_NUM);
        return this;
    }

    public ElfDataStoreWhereInput replicaNum_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REPLICA_NUM);
        return this;
    }

    public void setReplicaNum_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REPLICA_NUM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REPLICA_NUM);
        }
    }

    public boolean getReplicaNum_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REPLICA_NUM);
    }

    public ElfDataStoreWhereInput replicaNumGt(Integer replicaNumGt) {

        this.replicaNumGt = replicaNumGt;
        return this;
    }

    /**
     * Get replicaNumGt
     *
     * @return replicaNumGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getReplicaNumGt() {
        return replicaNumGt;
    }

    public void setReplicaNumGt(Integer replicaNumGt) {
        this.replicaNumGt = replicaNumGt;
    }

    public ElfDataStoreWhereInput replicaNumGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICA_NUM_GT);
        return this;
    }

    public ElfDataStoreWhereInput replicaNumGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REPLICA_NUM_GT);
        return this;
    }

    public void setReplicaNumGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REPLICA_NUM_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REPLICA_NUM_GT);
        }
    }

    public boolean getReplicaNumGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REPLICA_NUM_GT);
    }

    public ElfDataStoreWhereInput replicaNumGte(Integer replicaNumGte) {

        this.replicaNumGte = replicaNumGte;
        return this;
    }

    /**
     * Get replicaNumGte
     *
     * @return replicaNumGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getReplicaNumGte() {
        return replicaNumGte;
    }

    public void setReplicaNumGte(Integer replicaNumGte) {
        this.replicaNumGte = replicaNumGte;
    }

    public ElfDataStoreWhereInput replicaNumGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICA_NUM_GTE);
        return this;
    }

    public ElfDataStoreWhereInput replicaNumGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REPLICA_NUM_GTE);
        return this;
    }

    public void setReplicaNumGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REPLICA_NUM_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REPLICA_NUM_GTE);
        }
    }

    public boolean getReplicaNumGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REPLICA_NUM_GTE);
    }

    public ElfDataStoreWhereInput replicaNumIn(List<Integer> replicaNumIn) {

        this.replicaNumIn = replicaNumIn;
        return this;
    }

    public ElfDataStoreWhereInput addReplicaNumInItem(Integer replicaNumInItem) {
        if (this.replicaNumIn == null) {
            this.replicaNumIn = new ArrayList<Integer>();
        }
        this.replicaNumIn.add(replicaNumInItem);
        return this;
    }

    /**
     * Get replicaNumIn
     *
     * @return replicaNumIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getReplicaNumIn() {
        return replicaNumIn;
    }

    public void setReplicaNumIn(List<Integer> replicaNumIn) {
        this.replicaNumIn = replicaNumIn;
    }

    public ElfDataStoreWhereInput replicaNumIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICA_NUM_IN);
        return this;
    }

    public ElfDataStoreWhereInput replicaNumIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REPLICA_NUM_IN);
        return this;
    }

    public void setReplicaNumIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REPLICA_NUM_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REPLICA_NUM_IN);
        }
    }

    public boolean getReplicaNumIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REPLICA_NUM_IN);
    }

    public ElfDataStoreWhereInput replicaNumLt(Integer replicaNumLt) {

        this.replicaNumLt = replicaNumLt;
        return this;
    }

    /**
     * Get replicaNumLt
     *
     * @return replicaNumLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getReplicaNumLt() {
        return replicaNumLt;
    }

    public void setReplicaNumLt(Integer replicaNumLt) {
        this.replicaNumLt = replicaNumLt;
    }

    public ElfDataStoreWhereInput replicaNumLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICA_NUM_LT);
        return this;
    }

    public ElfDataStoreWhereInput replicaNumLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REPLICA_NUM_LT);
        return this;
    }

    public void setReplicaNumLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REPLICA_NUM_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REPLICA_NUM_LT);
        }
    }

    public boolean getReplicaNumLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REPLICA_NUM_LT);
    }

    public ElfDataStoreWhereInput replicaNumLte(Integer replicaNumLte) {

        this.replicaNumLte = replicaNumLte;
        return this;
    }

    /**
     * Get replicaNumLte
     *
     * @return replicaNumLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getReplicaNumLte() {
        return replicaNumLte;
    }

    public void setReplicaNumLte(Integer replicaNumLte) {
        this.replicaNumLte = replicaNumLte;
    }

    public ElfDataStoreWhereInput replicaNumLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICA_NUM_LTE);
        return this;
    }

    public ElfDataStoreWhereInput replicaNumLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REPLICA_NUM_LTE);
        return this;
    }

    public void setReplicaNumLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REPLICA_NUM_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REPLICA_NUM_LTE);
        }
    }

    public boolean getReplicaNumLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REPLICA_NUM_LTE);
    }

    public ElfDataStoreWhereInput replicaNumNot(Integer replicaNumNot) {

        this.replicaNumNot = replicaNumNot;
        return this;
    }

    /**
     * Get replicaNumNot
     *
     * @return replicaNumNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getReplicaNumNot() {
        return replicaNumNot;
    }

    public void setReplicaNumNot(Integer replicaNumNot) {
        this.replicaNumNot = replicaNumNot;
    }

    public ElfDataStoreWhereInput replicaNumNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICA_NUM_NOT);
        return this;
    }

    public ElfDataStoreWhereInput replicaNumNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REPLICA_NUM_NOT);
        return this;
    }

    public void setReplicaNumNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REPLICA_NUM_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REPLICA_NUM_NOT);
        }
    }

    public boolean getReplicaNumNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REPLICA_NUM_NOT);
    }

    public ElfDataStoreWhereInput replicaNumNotIn(List<Integer> replicaNumNotIn) {

        this.replicaNumNotIn = replicaNumNotIn;
        return this;
    }

    public ElfDataStoreWhereInput addReplicaNumNotInItem(Integer replicaNumNotInItem) {
        if (this.replicaNumNotIn == null) {
            this.replicaNumNotIn = new ArrayList<Integer>();
        }
        this.replicaNumNotIn.add(replicaNumNotInItem);
        return this;
    }

    /**
     * Get replicaNumNotIn
     *
     * @return replicaNumNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getReplicaNumNotIn() {
        return replicaNumNotIn;
    }

    public void setReplicaNumNotIn(List<Integer> replicaNumNotIn) {
        this.replicaNumNotIn = replicaNumNotIn;
    }

    public ElfDataStoreWhereInput replicaNumNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICA_NUM_NOT_IN);
        return this;
    }

    public ElfDataStoreWhereInput replicaNumNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REPLICA_NUM_NOT_IN);
        return this;
    }

    public void setReplicaNumNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REPLICA_NUM_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REPLICA_NUM_NOT_IN);
        }
    }

    public boolean getReplicaNumNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REPLICA_NUM_NOT_IN);
    }

    public ElfDataStoreWhereInput thinProvision(Boolean thinProvision) {

        this.thinProvision = thinProvision;
        return this;
    }

    /**
     * Get thinProvision
     *
     * @return thinProvision
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getThinProvision() {
        return thinProvision;
    }

    public void setThinProvision(Boolean thinProvision) {
        this.thinProvision = thinProvision;
    }

    public ElfDataStoreWhereInput thinProvision_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_THIN_PROVISION);
        return this;
    }

    public ElfDataStoreWhereInput thinProvision_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_THIN_PROVISION);
        return this;
    }

    public void setThinProvision_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_THIN_PROVISION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_THIN_PROVISION);
        }
    }

    public boolean getThinProvision_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_THIN_PROVISION);
    }

    public ElfDataStoreWhereInput thinProvisionNot(Boolean thinProvisionNot) {

        this.thinProvisionNot = thinProvisionNot;
        return this;
    }

    /**
     * Get thinProvisionNot
     *
     * @return thinProvisionNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getThinProvisionNot() {
        return thinProvisionNot;
    }

    public void setThinProvisionNot(Boolean thinProvisionNot) {
        this.thinProvisionNot = thinProvisionNot;
    }

    public ElfDataStoreWhereInput thinProvisionNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_THIN_PROVISION_NOT);
        return this;
    }

    public ElfDataStoreWhereInput thinProvisionNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_THIN_PROVISION_NOT);
        return this;
    }

    public void setThinProvisionNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_THIN_PROVISION_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_THIN_PROVISION_NOT);
        }
    }

    public boolean getThinProvisionNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_THIN_PROVISION_NOT);
    }

    public ElfDataStoreWhereInput type(ElfDataStoreType type) {

        this.type = type;
        return this;
    }

    /**
     * Get type
     *
     * @return type
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ElfDataStoreType getType() {
        return type;
    }

    public void setType(ElfDataStoreType type) {
        this.type = type;
    }

    public ElfDataStoreWhereInput type_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE);
        return this;
    }

    public ElfDataStoreWhereInput type_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TYPE);
        return this;
    }

    public void setType_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TYPE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TYPE);
        }
    }

    public boolean getType_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TYPE);
    }

    public ElfDataStoreWhereInput typeIn(List<ElfDataStoreType> typeIn) {

        this.typeIn = typeIn;
        return this;
    }

    public ElfDataStoreWhereInput addTypeInItem(ElfDataStoreType typeInItem) {
        if (this.typeIn == null) {
            this.typeIn = new ArrayList<ElfDataStoreType>();
        }
        this.typeIn.add(typeInItem);
        return this;
    }

    /**
     * Get typeIn
     *
     * @return typeIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<ElfDataStoreType> getTypeIn() {
        return typeIn;
    }

    public void setTypeIn(List<ElfDataStoreType> typeIn) {
        this.typeIn = typeIn;
    }

    public ElfDataStoreWhereInput typeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE_IN);
        return this;
    }

    public ElfDataStoreWhereInput typeIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TYPE_IN);
        return this;
    }

    public void setTypeIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TYPE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TYPE_IN);
        }
    }

    public boolean getTypeIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TYPE_IN);
    }

    public ElfDataStoreWhereInput typeNot(ElfDataStoreType typeNot) {

        this.typeNot = typeNot;
        return this;
    }

    /**
     * Get typeNot
     *
     * @return typeNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ElfDataStoreType getTypeNot() {
        return typeNot;
    }

    public void setTypeNot(ElfDataStoreType typeNot) {
        this.typeNot = typeNot;
    }

    public ElfDataStoreWhereInput typeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE_NOT);
        return this;
    }

    public ElfDataStoreWhereInput typeNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TYPE_NOT);
        return this;
    }

    public void setTypeNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TYPE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TYPE_NOT);
        }
    }

    public boolean getTypeNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TYPE_NOT);
    }

    public ElfDataStoreWhereInput typeNotIn(List<ElfDataStoreType> typeNotIn) {

        this.typeNotIn = typeNotIn;
        return this;
    }

    public ElfDataStoreWhereInput addTypeNotInItem(ElfDataStoreType typeNotInItem) {
        if (this.typeNotIn == null) {
            this.typeNotIn = new ArrayList<ElfDataStoreType>();
        }
        this.typeNotIn.add(typeNotInItem);
        return this;
    }

    /**
     * Get typeNotIn
     *
     * @return typeNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<ElfDataStoreType> getTypeNotIn() {
        return typeNotIn;
    }

    public void setTypeNotIn(List<ElfDataStoreType> typeNotIn) {
        this.typeNotIn = typeNotIn;
    }

    public ElfDataStoreWhereInput typeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE_NOT_IN);
        return this;
    }

    public ElfDataStoreWhereInput typeNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TYPE_NOT_IN);
        return this;
    }

    public void setTypeNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TYPE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TYPE_NOT_IN);
        }
    }

    public boolean getTypeNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TYPE_NOT_IN);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ElfDataStoreWhereInput elfDataStoreWhereInput = (ElfDataStoreWhereInput) o;
        return Objects.equals(this.AND, elfDataStoreWhereInput.AND)
                && Objects.equals(this.NOT, elfDataStoreWhereInput.NOT)
                && Objects.equals(this.OR, elfDataStoreWhereInput.OR)
                && Objects.equals(this.cluster, elfDataStoreWhereInput.cluster)
                && Objects.equals(this.description, elfDataStoreWhereInput.description)
                && Objects.equals(
                        this.descriptionContains, elfDataStoreWhereInput.descriptionContains)
                && Objects.equals(
                        this.descriptionEndsWith, elfDataStoreWhereInput.descriptionEndsWith)
                && Objects.equals(this.descriptionGt, elfDataStoreWhereInput.descriptionGt)
                && Objects.equals(this.descriptionGte, elfDataStoreWhereInput.descriptionGte)
                && Objects.equals(this.descriptionIn, elfDataStoreWhereInput.descriptionIn)
                && Objects.equals(this.descriptionLt, elfDataStoreWhereInput.descriptionLt)
                && Objects.equals(this.descriptionLte, elfDataStoreWhereInput.descriptionLte)
                && Objects.equals(this.descriptionNot, elfDataStoreWhereInput.descriptionNot)
                && Objects.equals(
                        this.descriptionNotContains, elfDataStoreWhereInput.descriptionNotContains)
                && Objects.equals(
                        this.descriptionNotEndsWith, elfDataStoreWhereInput.descriptionNotEndsWith)
                && Objects.equals(this.descriptionNotIn, elfDataStoreWhereInput.descriptionNotIn)
                && Objects.equals(
                        this.descriptionNotStartsWith,
                        elfDataStoreWhereInput.descriptionNotStartsWith)
                && Objects.equals(
                        this.descriptionStartsWith, elfDataStoreWhereInput.descriptionStartsWith)
                && Objects.equals(this.externalUse, elfDataStoreWhereInput.externalUse)
                && Objects.equals(this.externalUseNot, elfDataStoreWhereInput.externalUseNot)
                && Objects.equals(this.id, elfDataStoreWhereInput.id)
                && Objects.equals(this.idContains, elfDataStoreWhereInput.idContains)
                && Objects.equals(this.idEndsWith, elfDataStoreWhereInput.idEndsWith)
                && Objects.equals(this.idGt, elfDataStoreWhereInput.idGt)
                && Objects.equals(this.idGte, elfDataStoreWhereInput.idGte)
                && Objects.equals(this.idIn, elfDataStoreWhereInput.idIn)
                && Objects.equals(this.idLt, elfDataStoreWhereInput.idLt)
                && Objects.equals(this.idLte, elfDataStoreWhereInput.idLte)
                && Objects.equals(this.idNot, elfDataStoreWhereInput.idNot)
                && Objects.equals(this.idNotContains, elfDataStoreWhereInput.idNotContains)
                && Objects.equals(this.idNotEndsWith, elfDataStoreWhereInput.idNotEndsWith)
                && Objects.equals(this.idNotIn, elfDataStoreWhereInput.idNotIn)
                && Objects.equals(this.idNotStartsWith, elfDataStoreWhereInput.idNotStartsWith)
                && Objects.equals(this.idStartsWith, elfDataStoreWhereInput.idStartsWith)
                && Objects.equals(this.internal, elfDataStoreWhereInput.internal)
                && Objects.equals(this.internalNot, elfDataStoreWhereInput.internalNot)
                && Objects.equals(this.ipWhitelist, elfDataStoreWhereInput.ipWhitelist)
                && Objects.equals(
                        this.ipWhitelistContains, elfDataStoreWhereInput.ipWhitelistContains)
                && Objects.equals(
                        this.ipWhitelistEndsWith, elfDataStoreWhereInput.ipWhitelistEndsWith)
                && Objects.equals(this.ipWhitelistGt, elfDataStoreWhereInput.ipWhitelistGt)
                && Objects.equals(this.ipWhitelistGte, elfDataStoreWhereInput.ipWhitelistGte)
                && Objects.equals(this.ipWhitelistIn, elfDataStoreWhereInput.ipWhitelistIn)
                && Objects.equals(this.ipWhitelistLt, elfDataStoreWhereInput.ipWhitelistLt)
                && Objects.equals(this.ipWhitelistLte, elfDataStoreWhereInput.ipWhitelistLte)
                && Objects.equals(this.ipWhitelistNot, elfDataStoreWhereInput.ipWhitelistNot)
                && Objects.equals(
                        this.ipWhitelistNotContains, elfDataStoreWhereInput.ipWhitelistNotContains)
                && Objects.equals(
                        this.ipWhitelistNotEndsWith, elfDataStoreWhereInput.ipWhitelistNotEndsWith)
                && Objects.equals(this.ipWhitelistNotIn, elfDataStoreWhereInput.ipWhitelistNotIn)
                && Objects.equals(
                        this.ipWhitelistNotStartsWith,
                        elfDataStoreWhereInput.ipWhitelistNotStartsWith)
                && Objects.equals(
                        this.ipWhitelistStartsWith, elfDataStoreWhereInput.ipWhitelistStartsWith)
                && Objects.equals(this.iscsiTarget, elfDataStoreWhereInput.iscsiTarget)
                && Objects.equals(this.localId, elfDataStoreWhereInput.localId)
                && Objects.equals(this.localIdContains, elfDataStoreWhereInput.localIdContains)
                && Objects.equals(this.localIdEndsWith, elfDataStoreWhereInput.localIdEndsWith)
                && Objects.equals(this.localIdGt, elfDataStoreWhereInput.localIdGt)
                && Objects.equals(this.localIdGte, elfDataStoreWhereInput.localIdGte)
                && Objects.equals(this.localIdIn, elfDataStoreWhereInput.localIdIn)
                && Objects.equals(this.localIdLt, elfDataStoreWhereInput.localIdLt)
                && Objects.equals(this.localIdLte, elfDataStoreWhereInput.localIdLte)
                && Objects.equals(this.localIdNot, elfDataStoreWhereInput.localIdNot)
                && Objects.equals(
                        this.localIdNotContains, elfDataStoreWhereInput.localIdNotContains)
                && Objects.equals(
                        this.localIdNotEndsWith, elfDataStoreWhereInput.localIdNotEndsWith)
                && Objects.equals(this.localIdNotIn, elfDataStoreWhereInput.localIdNotIn)
                && Objects.equals(
                        this.localIdNotStartsWith, elfDataStoreWhereInput.localIdNotStartsWith)
                && Objects.equals(this.localIdStartsWith, elfDataStoreWhereInput.localIdStartsWith)
                && Objects.equals(this.name, elfDataStoreWhereInput.name)
                && Objects.equals(this.nameContains, elfDataStoreWhereInput.nameContains)
                && Objects.equals(this.nameEndsWith, elfDataStoreWhereInput.nameEndsWith)
                && Objects.equals(this.nameGt, elfDataStoreWhereInput.nameGt)
                && Objects.equals(this.nameGte, elfDataStoreWhereInput.nameGte)
                && Objects.equals(this.nameIn, elfDataStoreWhereInput.nameIn)
                && Objects.equals(this.nameLt, elfDataStoreWhereInput.nameLt)
                && Objects.equals(this.nameLte, elfDataStoreWhereInput.nameLte)
                && Objects.equals(this.nameNot, elfDataStoreWhereInput.nameNot)
                && Objects.equals(this.nameNotContains, elfDataStoreWhereInput.nameNotContains)
                && Objects.equals(this.nameNotEndsWith, elfDataStoreWhereInput.nameNotEndsWith)
                && Objects.equals(this.nameNotIn, elfDataStoreWhereInput.nameNotIn)
                && Objects.equals(this.nameNotStartsWith, elfDataStoreWhereInput.nameNotStartsWith)
                && Objects.equals(this.nameStartsWith, elfDataStoreWhereInput.nameStartsWith)
                && Objects.equals(this.nfsExport, elfDataStoreWhereInput.nfsExport)
                && Objects.equals(this.nvmfSubsystem, elfDataStoreWhereInput.nvmfSubsystem)
                && Objects.equals(this.replicaNum, elfDataStoreWhereInput.replicaNum)
                && Objects.equals(this.replicaNumGt, elfDataStoreWhereInput.replicaNumGt)
                && Objects.equals(this.replicaNumGte, elfDataStoreWhereInput.replicaNumGte)
                && Objects.equals(this.replicaNumIn, elfDataStoreWhereInput.replicaNumIn)
                && Objects.equals(this.replicaNumLt, elfDataStoreWhereInput.replicaNumLt)
                && Objects.equals(this.replicaNumLte, elfDataStoreWhereInput.replicaNumLte)
                && Objects.equals(this.replicaNumNot, elfDataStoreWhereInput.replicaNumNot)
                && Objects.equals(this.replicaNumNotIn, elfDataStoreWhereInput.replicaNumNotIn)
                && Objects.equals(this.thinProvision, elfDataStoreWhereInput.thinProvision)
                && Objects.equals(this.thinProvisionNot, elfDataStoreWhereInput.thinProvisionNot)
                && Objects.equals(this.type, elfDataStoreWhereInput.type)
                && Objects.equals(this.typeIn, elfDataStoreWhereInput.typeIn)
                && Objects.equals(this.typeNot, elfDataStoreWhereInput.typeNot)
                && Objects.equals(this.typeNotIn, elfDataStoreWhereInput.typeNotIn);
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
                description,
                descriptionContains,
                descriptionEndsWith,
                descriptionGt,
                descriptionGte,
                descriptionIn,
                descriptionLt,
                descriptionLte,
                descriptionNot,
                descriptionNotContains,
                descriptionNotEndsWith,
                descriptionNotIn,
                descriptionNotStartsWith,
                descriptionStartsWith,
                externalUse,
                externalUseNot,
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
                internal,
                internalNot,
                ipWhitelist,
                ipWhitelistContains,
                ipWhitelistEndsWith,
                ipWhitelistGt,
                ipWhitelistGte,
                ipWhitelistIn,
                ipWhitelistLt,
                ipWhitelistLte,
                ipWhitelistNot,
                ipWhitelistNotContains,
                ipWhitelistNotEndsWith,
                ipWhitelistNotIn,
                ipWhitelistNotStartsWith,
                ipWhitelistStartsWith,
                iscsiTarget,
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
                nfsExport,
                nvmfSubsystem,
                replicaNum,
                replicaNumGt,
                replicaNumGte,
                replicaNumIn,
                replicaNumLt,
                replicaNumLte,
                replicaNumNot,
                replicaNumNotIn,
                thinProvision,
                thinProvisionNot,
                type,
                typeIn,
                typeNot,
                typeNotIn);
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
        sb.append("class ElfDataStoreWhereInput {\n");
        sb.append("    AND: ").append(toIndentedString(AND)).append("\n");
        sb.append("    NOT: ").append(toIndentedString(NOT)).append("\n");
        sb.append("    OR: ").append(toIndentedString(OR)).append("\n");
        sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    descriptionContains: ")
                .append(toIndentedString(descriptionContains))
                .append("\n");
        sb.append("    descriptionEndsWith: ")
                .append(toIndentedString(descriptionEndsWith))
                .append("\n");
        sb.append("    descriptionGt: ").append(toIndentedString(descriptionGt)).append("\n");
        sb.append("    descriptionGte: ").append(toIndentedString(descriptionGte)).append("\n");
        sb.append("    descriptionIn: ").append(toIndentedString(descriptionIn)).append("\n");
        sb.append("    descriptionLt: ").append(toIndentedString(descriptionLt)).append("\n");
        sb.append("    descriptionLte: ").append(toIndentedString(descriptionLte)).append("\n");
        sb.append("    descriptionNot: ").append(toIndentedString(descriptionNot)).append("\n");
        sb.append("    descriptionNotContains: ")
                .append(toIndentedString(descriptionNotContains))
                .append("\n");
        sb.append("    descriptionNotEndsWith: ")
                .append(toIndentedString(descriptionNotEndsWith))
                .append("\n");
        sb.append("    descriptionNotIn: ").append(toIndentedString(descriptionNotIn)).append("\n");
        sb.append("    descriptionNotStartsWith: ")
                .append(toIndentedString(descriptionNotStartsWith))
                .append("\n");
        sb.append("    descriptionStartsWith: ")
                .append(toIndentedString(descriptionStartsWith))
                .append("\n");
        sb.append("    externalUse: ").append(toIndentedString(externalUse)).append("\n");
        sb.append("    externalUseNot: ").append(toIndentedString(externalUseNot)).append("\n");
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
        sb.append("    internal: ").append(toIndentedString(internal)).append("\n");
        sb.append("    internalNot: ").append(toIndentedString(internalNot)).append("\n");
        sb.append("    ipWhitelist: ").append(toIndentedString(ipWhitelist)).append("\n");
        sb.append("    ipWhitelistContains: ")
                .append(toIndentedString(ipWhitelistContains))
                .append("\n");
        sb.append("    ipWhitelistEndsWith: ")
                .append(toIndentedString(ipWhitelistEndsWith))
                .append("\n");
        sb.append("    ipWhitelistGt: ").append(toIndentedString(ipWhitelistGt)).append("\n");
        sb.append("    ipWhitelistGte: ").append(toIndentedString(ipWhitelistGte)).append("\n");
        sb.append("    ipWhitelistIn: ").append(toIndentedString(ipWhitelistIn)).append("\n");
        sb.append("    ipWhitelistLt: ").append(toIndentedString(ipWhitelistLt)).append("\n");
        sb.append("    ipWhitelistLte: ").append(toIndentedString(ipWhitelistLte)).append("\n");
        sb.append("    ipWhitelistNot: ").append(toIndentedString(ipWhitelistNot)).append("\n");
        sb.append("    ipWhitelistNotContains: ")
                .append(toIndentedString(ipWhitelistNotContains))
                .append("\n");
        sb.append("    ipWhitelistNotEndsWith: ")
                .append(toIndentedString(ipWhitelistNotEndsWith))
                .append("\n");
        sb.append("    ipWhitelistNotIn: ").append(toIndentedString(ipWhitelistNotIn)).append("\n");
        sb.append("    ipWhitelistNotStartsWith: ")
                .append(toIndentedString(ipWhitelistNotStartsWith))
                .append("\n");
        sb.append("    ipWhitelistStartsWith: ")
                .append(toIndentedString(ipWhitelistStartsWith))
                .append("\n");
        sb.append("    iscsiTarget: ").append(toIndentedString(iscsiTarget)).append("\n");
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
        sb.append("    nfsExport: ").append(toIndentedString(nfsExport)).append("\n");
        sb.append("    nvmfSubsystem: ").append(toIndentedString(nvmfSubsystem)).append("\n");
        sb.append("    replicaNum: ").append(toIndentedString(replicaNum)).append("\n");
        sb.append("    replicaNumGt: ").append(toIndentedString(replicaNumGt)).append("\n");
        sb.append("    replicaNumGte: ").append(toIndentedString(replicaNumGte)).append("\n");
        sb.append("    replicaNumIn: ").append(toIndentedString(replicaNumIn)).append("\n");
        sb.append("    replicaNumLt: ").append(toIndentedString(replicaNumLt)).append("\n");
        sb.append("    replicaNumLte: ").append(toIndentedString(replicaNumLte)).append("\n");
        sb.append("    replicaNumNot: ").append(toIndentedString(replicaNumNot)).append("\n");
        sb.append("    replicaNumNotIn: ").append(toIndentedString(replicaNumNotIn)).append("\n");
        sb.append("    thinProvision: ").append(toIndentedString(thinProvision)).append("\n");
        sb.append("    thinProvisionNot: ").append(toIndentedString(thinProvisionNot)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    typeIn: ").append(toIndentedString(typeIn)).append("\n");
        sb.append("    typeNot: ").append(toIndentedString(typeNot)).append("\n");
        sb.append("    typeNotIn: ").append(toIndentedString(typeNotIn)).append("\n");
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

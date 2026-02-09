package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** ClusterSettingsWhereInput */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class ClusterSettingsWhereInput
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_A_N_D = "AND";

    @SerializedName(SERIALIZED_NAME_A_N_D)
    private List<ClusterSettingsWhereInput> AND = null;

    public static final String SERIALIZED_NAME_N_O_T = "NOT";

    @SerializedName(SERIALIZED_NAME_N_O_T)
    private List<ClusterSettingsWhereInput> NOT = null;

    public static final String SERIALIZED_NAME_O_R = "OR";

    @SerializedName(SERIALIZED_NAME_O_R)
    private List<ClusterSettingsWhereInput> OR = null;

    public static final String SERIALIZED_NAME_CLUSTER = "cluster";

    @SerializedName(SERIALIZED_NAME_CLUSTER)
    private ClusterWhereInput cluster;

    public static final String SERIALIZED_NAME_DEFAULT_HA = "default_ha";

    @SerializedName(SERIALIZED_NAME_DEFAULT_HA)
    private Boolean defaultHa;

    public static final String SERIALIZED_NAME_DEFAULT_HA_NOT = "default_ha_not";

    @SerializedName(SERIALIZED_NAME_DEFAULT_HA_NOT)
    private Boolean defaultHaNot;

    public static final String SERIALIZED_NAME_DEFAULT_STORAGE_POLICY = "default_storage_policy";

    @SerializedName(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY)
    private VmVolumeElfStoragePolicyType defaultStoragePolicy;

    public static final String SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_K =
            "default_storage_policy_ec_k";

    @SerializedName(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_K)
    private Integer defaultStoragePolicyEcK;

    public static final String SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_K_GT =
            "default_storage_policy_ec_k_gt";

    @SerializedName(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_K_GT)
    private Integer defaultStoragePolicyEcKGt;

    public static final String SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_K_GTE =
            "default_storage_policy_ec_k_gte";

    @SerializedName(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_K_GTE)
    private Integer defaultStoragePolicyEcKGte;

    public static final String SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_K_IN =
            "default_storage_policy_ec_k_in";

    @SerializedName(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_K_IN)
    private List<Integer> defaultStoragePolicyEcKIn = null;

    public static final String SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_K_LT =
            "default_storage_policy_ec_k_lt";

    @SerializedName(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_K_LT)
    private Integer defaultStoragePolicyEcKLt;

    public static final String SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_K_LTE =
            "default_storage_policy_ec_k_lte";

    @SerializedName(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_K_LTE)
    private Integer defaultStoragePolicyEcKLte;

    public static final String SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_K_NOT =
            "default_storage_policy_ec_k_not";

    @SerializedName(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_K_NOT)
    private Integer defaultStoragePolicyEcKNot;

    public static final String SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_K_NOT_IN =
            "default_storage_policy_ec_k_not_in";

    @SerializedName(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_K_NOT_IN)
    private List<Integer> defaultStoragePolicyEcKNotIn = null;

    public static final String SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_M =
            "default_storage_policy_ec_m";

    @SerializedName(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_M)
    private Integer defaultStoragePolicyEcM;

    public static final String SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_M_GT =
            "default_storage_policy_ec_m_gt";

    @SerializedName(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_M_GT)
    private Integer defaultStoragePolicyEcMGt;

    public static final String SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_M_GTE =
            "default_storage_policy_ec_m_gte";

    @SerializedName(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_M_GTE)
    private Integer defaultStoragePolicyEcMGte;

    public static final String SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_M_IN =
            "default_storage_policy_ec_m_in";

    @SerializedName(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_M_IN)
    private List<Integer> defaultStoragePolicyEcMIn = null;

    public static final String SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_M_LT =
            "default_storage_policy_ec_m_lt";

    @SerializedName(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_M_LT)
    private Integer defaultStoragePolicyEcMLt;

    public static final String SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_M_LTE =
            "default_storage_policy_ec_m_lte";

    @SerializedName(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_M_LTE)
    private Integer defaultStoragePolicyEcMLte;

    public static final String SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_M_NOT =
            "default_storage_policy_ec_m_not";

    @SerializedName(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_M_NOT)
    private Integer defaultStoragePolicyEcMNot;

    public static final String SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_M_NOT_IN =
            "default_storage_policy_ec_m_not_in";

    @SerializedName(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_M_NOT_IN)
    private List<Integer> defaultStoragePolicyEcMNotIn = null;

    public static final String SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_IN =
            "default_storage_policy_in";

    @SerializedName(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_IN)
    private List<VmVolumeElfStoragePolicyType> defaultStoragePolicyIn = null;

    public static final String SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_NOT =
            "default_storage_policy_not";

    @SerializedName(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_NOT)
    private VmVolumeElfStoragePolicyType defaultStoragePolicyNot;

    public static final String SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_NOT_IN =
            "default_storage_policy_not_in";

    @SerializedName(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_NOT_IN)
    private List<VmVolumeElfStoragePolicyType> defaultStoragePolicyNotIn = null;

    public static final String SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_REPLICA_NUM =
            "default_storage_policy_replica_num";

    @SerializedName(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_REPLICA_NUM)
    private Integer defaultStoragePolicyReplicaNum;

    public static final String SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_REPLICA_NUM_GT =
            "default_storage_policy_replica_num_gt";

    @SerializedName(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_REPLICA_NUM_GT)
    private Integer defaultStoragePolicyReplicaNumGt;

    public static final String SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_REPLICA_NUM_GTE =
            "default_storage_policy_replica_num_gte";

    @SerializedName(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_REPLICA_NUM_GTE)
    private Integer defaultStoragePolicyReplicaNumGte;

    public static final String SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_REPLICA_NUM_IN =
            "default_storage_policy_replica_num_in";

    @SerializedName(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_REPLICA_NUM_IN)
    private List<Integer> defaultStoragePolicyReplicaNumIn = null;

    public static final String SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_REPLICA_NUM_LT =
            "default_storage_policy_replica_num_lt";

    @SerializedName(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_REPLICA_NUM_LT)
    private Integer defaultStoragePolicyReplicaNumLt;

    public static final String SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_REPLICA_NUM_LTE =
            "default_storage_policy_replica_num_lte";

    @SerializedName(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_REPLICA_NUM_LTE)
    private Integer defaultStoragePolicyReplicaNumLte;

    public static final String SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_REPLICA_NUM_NOT =
            "default_storage_policy_replica_num_not";

    @SerializedName(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_REPLICA_NUM_NOT)
    private Integer defaultStoragePolicyReplicaNumNot;

    public static final String SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_REPLICA_NUM_NOT_IN =
            "default_storage_policy_replica_num_not_in";

    @SerializedName(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_REPLICA_NUM_NOT_IN)
    private List<Integer> defaultStoragePolicyReplicaNumNotIn = null;

    public static final String SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_STRIPE_NUM =
            "default_storage_policy_stripe_num";

    @SerializedName(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_STRIPE_NUM)
    private Integer defaultStoragePolicyStripeNum;

    public static final String SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_STRIPE_NUM_GT =
            "default_storage_policy_stripe_num_gt";

    @SerializedName(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_STRIPE_NUM_GT)
    private Integer defaultStoragePolicyStripeNumGt;

    public static final String SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_STRIPE_NUM_GTE =
            "default_storage_policy_stripe_num_gte";

    @SerializedName(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_STRIPE_NUM_GTE)
    private Integer defaultStoragePolicyStripeNumGte;

    public static final String SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_STRIPE_NUM_IN =
            "default_storage_policy_stripe_num_in";

    @SerializedName(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_STRIPE_NUM_IN)
    private List<Integer> defaultStoragePolicyStripeNumIn = null;

    public static final String SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_STRIPE_NUM_LT =
            "default_storage_policy_stripe_num_lt";

    @SerializedName(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_STRIPE_NUM_LT)
    private Integer defaultStoragePolicyStripeNumLt;

    public static final String SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_STRIPE_NUM_LTE =
            "default_storage_policy_stripe_num_lte";

    @SerializedName(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_STRIPE_NUM_LTE)
    private Integer defaultStoragePolicyStripeNumLte;

    public static final String SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_STRIPE_NUM_NOT =
            "default_storage_policy_stripe_num_not";

    @SerializedName(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_STRIPE_NUM_NOT)
    private Integer defaultStoragePolicyStripeNumNot;

    public static final String SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_STRIPE_NUM_NOT_IN =
            "default_storage_policy_stripe_num_not_in";

    @SerializedName(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_STRIPE_NUM_NOT_IN)
    private List<Integer> defaultStoragePolicyStripeNumNotIn = null;

    public static final String SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_THIN_PROVISION =
            "default_storage_policy_thin_provision";

    @SerializedName(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_THIN_PROVISION)
    private Boolean defaultStoragePolicyThinProvision;

    public static final String SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_THIN_PROVISION_NOT =
            "default_storage_policy_thin_provision_not";

    @SerializedName(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_THIN_PROVISION_NOT)
    private Boolean defaultStoragePolicyThinProvisionNot;

    public static final String SERIALIZED_NAME_ENABLED_ISCSI = "enabled_iscsi";

    @SerializedName(SERIALIZED_NAME_ENABLED_ISCSI)
    private Boolean enabledIscsi;

    public static final String SERIALIZED_NAME_ENABLED_ISCSI_NOT = "enabled_iscsi_not";

    @SerializedName(SERIALIZED_NAME_ENABLED_ISCSI_NOT)
    private Boolean enabledIscsiNot;

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

    public ClusterSettingsWhereInput() {}

    public ClusterSettingsWhereInput AND(List<ClusterSettingsWhereInput> AND) {

        this.AND = AND;
        return this;
    }

    public ClusterSettingsWhereInput addANDItem(ClusterSettingsWhereInput ANDItem) {
        if (this.AND == null) {
            this.AND = new ArrayList<ClusterSettingsWhereInput>();
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
    public List<ClusterSettingsWhereInput> getAND() {
        return AND;
    }

    public void setAND(List<ClusterSettingsWhereInput> AND) {
        this.AND = AND;
    }

    public ClusterSettingsWhereInput AND_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_A_N_D);
        return this;
    }

    public ClusterSettingsWhereInput AND_ExplictlyNonNull() {
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

    public ClusterSettingsWhereInput NOT(List<ClusterSettingsWhereInput> NOT) {

        this.NOT = NOT;
        return this;
    }

    public ClusterSettingsWhereInput addNOTItem(ClusterSettingsWhereInput NOTItem) {
        if (this.NOT == null) {
            this.NOT = new ArrayList<ClusterSettingsWhereInput>();
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
    public List<ClusterSettingsWhereInput> getNOT() {
        return NOT;
    }

    public void setNOT(List<ClusterSettingsWhereInput> NOT) {
        this.NOT = NOT;
    }

    public ClusterSettingsWhereInput NOT_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_N_O_T);
        return this;
    }

    public ClusterSettingsWhereInput NOT_ExplictlyNonNull() {
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

    public ClusterSettingsWhereInput OR(List<ClusterSettingsWhereInput> OR) {

        this.OR = OR;
        return this;
    }

    public ClusterSettingsWhereInput addORItem(ClusterSettingsWhereInput ORItem) {
        if (this.OR == null) {
            this.OR = new ArrayList<ClusterSettingsWhereInput>();
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
    public List<ClusterSettingsWhereInput> getOR() {
        return OR;
    }

    public void setOR(List<ClusterSettingsWhereInput> OR) {
        this.OR = OR;
    }

    public ClusterSettingsWhereInput OR_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_O_R);
        return this;
    }

    public ClusterSettingsWhereInput OR_ExplictlyNonNull() {
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

    public ClusterSettingsWhereInput cluster(ClusterWhereInput cluster) {

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

    public ClusterSettingsWhereInput cluster_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER);
        return this;
    }

    public ClusterSettingsWhereInput cluster_ExplictlyNonNull() {
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

    public ClusterSettingsWhereInput defaultHa(Boolean defaultHa) {

        this.defaultHa = defaultHa;
        return this;
    }

    /**
     * Get defaultHa
     *
     * @return defaultHa
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getDefaultHa() {
        return defaultHa;
    }

    public void setDefaultHa(Boolean defaultHa) {
        this.defaultHa = defaultHa;
    }

    public ClusterSettingsWhereInput defaultHa_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEFAULT_HA);
        return this;
    }

    public ClusterSettingsWhereInput defaultHa_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_HA);
        return this;
    }

    public void setDefaultHa_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEFAULT_HA);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_HA);
        }
    }

    public boolean getDefaultHa_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEFAULT_HA);
    }

    public ClusterSettingsWhereInput defaultHaNot(Boolean defaultHaNot) {

        this.defaultHaNot = defaultHaNot;
        return this;
    }

    /**
     * Get defaultHaNot
     *
     * @return defaultHaNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getDefaultHaNot() {
        return defaultHaNot;
    }

    public void setDefaultHaNot(Boolean defaultHaNot) {
        this.defaultHaNot = defaultHaNot;
    }

    public ClusterSettingsWhereInput defaultHaNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEFAULT_HA_NOT);
        return this;
    }

    public ClusterSettingsWhereInput defaultHaNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_HA_NOT);
        return this;
    }

    public void setDefaultHaNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEFAULT_HA_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_HA_NOT);
        }
    }

    public boolean getDefaultHaNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEFAULT_HA_NOT);
    }

    public ClusterSettingsWhereInput defaultStoragePolicy(
            VmVolumeElfStoragePolicyType defaultStoragePolicy) {

        this.defaultStoragePolicy = defaultStoragePolicy;
        return this;
    }

    /**
     * Get defaultStoragePolicy
     *
     * @return defaultStoragePolicy
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmVolumeElfStoragePolicyType getDefaultStoragePolicy() {
        return defaultStoragePolicy;
    }

    public void setDefaultStoragePolicy(VmVolumeElfStoragePolicyType defaultStoragePolicy) {
        this.defaultStoragePolicy = defaultStoragePolicy;
    }

    public ClusterSettingsWhereInput defaultStoragePolicy_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY);
        return this;
    }

    public ClusterSettingsWhereInput defaultStoragePolicy_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY);
        return this;
    }

    public void setDefaultStoragePolicy_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY);
        }
    }

    public boolean getDefaultStoragePolicy_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY);
    }

    public ClusterSettingsWhereInput defaultStoragePolicyEcK(Integer defaultStoragePolicyEcK) {

        this.defaultStoragePolicyEcK = defaultStoragePolicyEcK;
        return this;
    }

    /**
     * Get defaultStoragePolicyEcK
     *
     * @return defaultStoragePolicyEcK
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getDefaultStoragePolicyEcK() {
        return defaultStoragePolicyEcK;
    }

    public void setDefaultStoragePolicyEcK(Integer defaultStoragePolicyEcK) {
        this.defaultStoragePolicyEcK = defaultStoragePolicyEcK;
    }

    public ClusterSettingsWhereInput defaultStoragePolicyEcK_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_K);
        return this;
    }

    public ClusterSettingsWhereInput defaultStoragePolicyEcK_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_K);
        return this;
    }

    public void setDefaultStoragePolicyEcK_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_K);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_K);
        }
    }

    public boolean getDefaultStoragePolicyEcK_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_K);
    }

    public ClusterSettingsWhereInput defaultStoragePolicyEcKGt(Integer defaultStoragePolicyEcKGt) {

        this.defaultStoragePolicyEcKGt = defaultStoragePolicyEcKGt;
        return this;
    }

    /**
     * Get defaultStoragePolicyEcKGt
     *
     * @return defaultStoragePolicyEcKGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getDefaultStoragePolicyEcKGt() {
        return defaultStoragePolicyEcKGt;
    }

    public void setDefaultStoragePolicyEcKGt(Integer defaultStoragePolicyEcKGt) {
        this.defaultStoragePolicyEcKGt = defaultStoragePolicyEcKGt;
    }

    public ClusterSettingsWhereInput defaultStoragePolicyEcKGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_K_GT);
        return this;
    }

    public ClusterSettingsWhereInput defaultStoragePolicyEcKGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_K_GT);
        return this;
    }

    public void setDefaultStoragePolicyEcKGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_K_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_K_GT);
        }
    }

    public boolean getDefaultStoragePolicyEcKGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_K_GT);
    }

    public ClusterSettingsWhereInput defaultStoragePolicyEcKGte(
            Integer defaultStoragePolicyEcKGte) {

        this.defaultStoragePolicyEcKGte = defaultStoragePolicyEcKGte;
        return this;
    }

    /**
     * Get defaultStoragePolicyEcKGte
     *
     * @return defaultStoragePolicyEcKGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getDefaultStoragePolicyEcKGte() {
        return defaultStoragePolicyEcKGte;
    }

    public void setDefaultStoragePolicyEcKGte(Integer defaultStoragePolicyEcKGte) {
        this.defaultStoragePolicyEcKGte = defaultStoragePolicyEcKGte;
    }

    public ClusterSettingsWhereInput defaultStoragePolicyEcKGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_K_GTE);
        return this;
    }

    public ClusterSettingsWhereInput defaultStoragePolicyEcKGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_K_GTE);
        return this;
    }

    public void setDefaultStoragePolicyEcKGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_K_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_K_GTE);
        }
    }

    public boolean getDefaultStoragePolicyEcKGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_K_GTE);
    }

    public ClusterSettingsWhereInput defaultStoragePolicyEcKIn(
            List<Integer> defaultStoragePolicyEcKIn) {

        this.defaultStoragePolicyEcKIn = defaultStoragePolicyEcKIn;
        return this;
    }

    public ClusterSettingsWhereInput addDefaultStoragePolicyEcKInItem(
            Integer defaultStoragePolicyEcKInItem) {
        if (this.defaultStoragePolicyEcKIn == null) {
            this.defaultStoragePolicyEcKIn = new ArrayList<Integer>();
        }
        this.defaultStoragePolicyEcKIn.add(defaultStoragePolicyEcKInItem);
        return this;
    }

    /**
     * Get defaultStoragePolicyEcKIn
     *
     * @return defaultStoragePolicyEcKIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getDefaultStoragePolicyEcKIn() {
        return defaultStoragePolicyEcKIn;
    }

    public void setDefaultStoragePolicyEcKIn(List<Integer> defaultStoragePolicyEcKIn) {
        this.defaultStoragePolicyEcKIn = defaultStoragePolicyEcKIn;
    }

    public ClusterSettingsWhereInput defaultStoragePolicyEcKIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_K_IN);
        return this;
    }

    public ClusterSettingsWhereInput defaultStoragePolicyEcKIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_K_IN);
        return this;
    }

    public void setDefaultStoragePolicyEcKIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_K_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_K_IN);
        }
    }

    public boolean getDefaultStoragePolicyEcKIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_K_IN);
    }

    public ClusterSettingsWhereInput defaultStoragePolicyEcKLt(Integer defaultStoragePolicyEcKLt) {

        this.defaultStoragePolicyEcKLt = defaultStoragePolicyEcKLt;
        return this;
    }

    /**
     * Get defaultStoragePolicyEcKLt
     *
     * @return defaultStoragePolicyEcKLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getDefaultStoragePolicyEcKLt() {
        return defaultStoragePolicyEcKLt;
    }

    public void setDefaultStoragePolicyEcKLt(Integer defaultStoragePolicyEcKLt) {
        this.defaultStoragePolicyEcKLt = defaultStoragePolicyEcKLt;
    }

    public ClusterSettingsWhereInput defaultStoragePolicyEcKLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_K_LT);
        return this;
    }

    public ClusterSettingsWhereInput defaultStoragePolicyEcKLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_K_LT);
        return this;
    }

    public void setDefaultStoragePolicyEcKLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_K_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_K_LT);
        }
    }

    public boolean getDefaultStoragePolicyEcKLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_K_LT);
    }

    public ClusterSettingsWhereInput defaultStoragePolicyEcKLte(
            Integer defaultStoragePolicyEcKLte) {

        this.defaultStoragePolicyEcKLte = defaultStoragePolicyEcKLte;
        return this;
    }

    /**
     * Get defaultStoragePolicyEcKLte
     *
     * @return defaultStoragePolicyEcKLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getDefaultStoragePolicyEcKLte() {
        return defaultStoragePolicyEcKLte;
    }

    public void setDefaultStoragePolicyEcKLte(Integer defaultStoragePolicyEcKLte) {
        this.defaultStoragePolicyEcKLte = defaultStoragePolicyEcKLte;
    }

    public ClusterSettingsWhereInput defaultStoragePolicyEcKLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_K_LTE);
        return this;
    }

    public ClusterSettingsWhereInput defaultStoragePolicyEcKLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_K_LTE);
        return this;
    }

    public void setDefaultStoragePolicyEcKLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_K_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_K_LTE);
        }
    }

    public boolean getDefaultStoragePolicyEcKLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_K_LTE);
    }

    public ClusterSettingsWhereInput defaultStoragePolicyEcKNot(
            Integer defaultStoragePolicyEcKNot) {

        this.defaultStoragePolicyEcKNot = defaultStoragePolicyEcKNot;
        return this;
    }

    /**
     * Get defaultStoragePolicyEcKNot
     *
     * @return defaultStoragePolicyEcKNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getDefaultStoragePolicyEcKNot() {
        return defaultStoragePolicyEcKNot;
    }

    public void setDefaultStoragePolicyEcKNot(Integer defaultStoragePolicyEcKNot) {
        this.defaultStoragePolicyEcKNot = defaultStoragePolicyEcKNot;
    }

    public ClusterSettingsWhereInput defaultStoragePolicyEcKNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_K_NOT);
        return this;
    }

    public ClusterSettingsWhereInput defaultStoragePolicyEcKNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_K_NOT);
        return this;
    }

    public void setDefaultStoragePolicyEcKNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_K_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_K_NOT);
        }
    }

    public boolean getDefaultStoragePolicyEcKNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_K_NOT);
    }

    public ClusterSettingsWhereInput defaultStoragePolicyEcKNotIn(
            List<Integer> defaultStoragePolicyEcKNotIn) {

        this.defaultStoragePolicyEcKNotIn = defaultStoragePolicyEcKNotIn;
        return this;
    }

    public ClusterSettingsWhereInput addDefaultStoragePolicyEcKNotInItem(
            Integer defaultStoragePolicyEcKNotInItem) {
        if (this.defaultStoragePolicyEcKNotIn == null) {
            this.defaultStoragePolicyEcKNotIn = new ArrayList<Integer>();
        }
        this.defaultStoragePolicyEcKNotIn.add(defaultStoragePolicyEcKNotInItem);
        return this;
    }

    /**
     * Get defaultStoragePolicyEcKNotIn
     *
     * @return defaultStoragePolicyEcKNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getDefaultStoragePolicyEcKNotIn() {
        return defaultStoragePolicyEcKNotIn;
    }

    public void setDefaultStoragePolicyEcKNotIn(List<Integer> defaultStoragePolicyEcKNotIn) {
        this.defaultStoragePolicyEcKNotIn = defaultStoragePolicyEcKNotIn;
    }

    public ClusterSettingsWhereInput defaultStoragePolicyEcKNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_K_NOT_IN);
        return this;
    }

    public ClusterSettingsWhereInput defaultStoragePolicyEcKNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_K_NOT_IN);
        return this;
    }

    public void setDefaultStoragePolicyEcKNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_K_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_K_NOT_IN);
        }
    }

    public boolean getDefaultStoragePolicyEcKNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_K_NOT_IN);
    }

    public ClusterSettingsWhereInput defaultStoragePolicyEcM(Integer defaultStoragePolicyEcM) {

        this.defaultStoragePolicyEcM = defaultStoragePolicyEcM;
        return this;
    }

    /**
     * Get defaultStoragePolicyEcM
     *
     * @return defaultStoragePolicyEcM
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getDefaultStoragePolicyEcM() {
        return defaultStoragePolicyEcM;
    }

    public void setDefaultStoragePolicyEcM(Integer defaultStoragePolicyEcM) {
        this.defaultStoragePolicyEcM = defaultStoragePolicyEcM;
    }

    public ClusterSettingsWhereInput defaultStoragePolicyEcM_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_M);
        return this;
    }

    public ClusterSettingsWhereInput defaultStoragePolicyEcM_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_M);
        return this;
    }

    public void setDefaultStoragePolicyEcM_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_M);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_M);
        }
    }

    public boolean getDefaultStoragePolicyEcM_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_M);
    }

    public ClusterSettingsWhereInput defaultStoragePolicyEcMGt(Integer defaultStoragePolicyEcMGt) {

        this.defaultStoragePolicyEcMGt = defaultStoragePolicyEcMGt;
        return this;
    }

    /**
     * Get defaultStoragePolicyEcMGt
     *
     * @return defaultStoragePolicyEcMGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getDefaultStoragePolicyEcMGt() {
        return defaultStoragePolicyEcMGt;
    }

    public void setDefaultStoragePolicyEcMGt(Integer defaultStoragePolicyEcMGt) {
        this.defaultStoragePolicyEcMGt = defaultStoragePolicyEcMGt;
    }

    public ClusterSettingsWhereInput defaultStoragePolicyEcMGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_M_GT);
        return this;
    }

    public ClusterSettingsWhereInput defaultStoragePolicyEcMGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_M_GT);
        return this;
    }

    public void setDefaultStoragePolicyEcMGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_M_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_M_GT);
        }
    }

    public boolean getDefaultStoragePolicyEcMGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_M_GT);
    }

    public ClusterSettingsWhereInput defaultStoragePolicyEcMGte(
            Integer defaultStoragePolicyEcMGte) {

        this.defaultStoragePolicyEcMGte = defaultStoragePolicyEcMGte;
        return this;
    }

    /**
     * Get defaultStoragePolicyEcMGte
     *
     * @return defaultStoragePolicyEcMGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getDefaultStoragePolicyEcMGte() {
        return defaultStoragePolicyEcMGte;
    }

    public void setDefaultStoragePolicyEcMGte(Integer defaultStoragePolicyEcMGte) {
        this.defaultStoragePolicyEcMGte = defaultStoragePolicyEcMGte;
    }

    public ClusterSettingsWhereInput defaultStoragePolicyEcMGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_M_GTE);
        return this;
    }

    public ClusterSettingsWhereInput defaultStoragePolicyEcMGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_M_GTE);
        return this;
    }

    public void setDefaultStoragePolicyEcMGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_M_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_M_GTE);
        }
    }

    public boolean getDefaultStoragePolicyEcMGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_M_GTE);
    }

    public ClusterSettingsWhereInput defaultStoragePolicyEcMIn(
            List<Integer> defaultStoragePolicyEcMIn) {

        this.defaultStoragePolicyEcMIn = defaultStoragePolicyEcMIn;
        return this;
    }

    public ClusterSettingsWhereInput addDefaultStoragePolicyEcMInItem(
            Integer defaultStoragePolicyEcMInItem) {
        if (this.defaultStoragePolicyEcMIn == null) {
            this.defaultStoragePolicyEcMIn = new ArrayList<Integer>();
        }
        this.defaultStoragePolicyEcMIn.add(defaultStoragePolicyEcMInItem);
        return this;
    }

    /**
     * Get defaultStoragePolicyEcMIn
     *
     * @return defaultStoragePolicyEcMIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getDefaultStoragePolicyEcMIn() {
        return defaultStoragePolicyEcMIn;
    }

    public void setDefaultStoragePolicyEcMIn(List<Integer> defaultStoragePolicyEcMIn) {
        this.defaultStoragePolicyEcMIn = defaultStoragePolicyEcMIn;
    }

    public ClusterSettingsWhereInput defaultStoragePolicyEcMIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_M_IN);
        return this;
    }

    public ClusterSettingsWhereInput defaultStoragePolicyEcMIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_M_IN);
        return this;
    }

    public void setDefaultStoragePolicyEcMIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_M_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_M_IN);
        }
    }

    public boolean getDefaultStoragePolicyEcMIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_M_IN);
    }

    public ClusterSettingsWhereInput defaultStoragePolicyEcMLt(Integer defaultStoragePolicyEcMLt) {

        this.defaultStoragePolicyEcMLt = defaultStoragePolicyEcMLt;
        return this;
    }

    /**
     * Get defaultStoragePolicyEcMLt
     *
     * @return defaultStoragePolicyEcMLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getDefaultStoragePolicyEcMLt() {
        return defaultStoragePolicyEcMLt;
    }

    public void setDefaultStoragePolicyEcMLt(Integer defaultStoragePolicyEcMLt) {
        this.defaultStoragePolicyEcMLt = defaultStoragePolicyEcMLt;
    }

    public ClusterSettingsWhereInput defaultStoragePolicyEcMLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_M_LT);
        return this;
    }

    public ClusterSettingsWhereInput defaultStoragePolicyEcMLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_M_LT);
        return this;
    }

    public void setDefaultStoragePolicyEcMLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_M_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_M_LT);
        }
    }

    public boolean getDefaultStoragePolicyEcMLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_M_LT);
    }

    public ClusterSettingsWhereInput defaultStoragePolicyEcMLte(
            Integer defaultStoragePolicyEcMLte) {

        this.defaultStoragePolicyEcMLte = defaultStoragePolicyEcMLte;
        return this;
    }

    /**
     * Get defaultStoragePolicyEcMLte
     *
     * @return defaultStoragePolicyEcMLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getDefaultStoragePolicyEcMLte() {
        return defaultStoragePolicyEcMLte;
    }

    public void setDefaultStoragePolicyEcMLte(Integer defaultStoragePolicyEcMLte) {
        this.defaultStoragePolicyEcMLte = defaultStoragePolicyEcMLte;
    }

    public ClusterSettingsWhereInput defaultStoragePolicyEcMLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_M_LTE);
        return this;
    }

    public ClusterSettingsWhereInput defaultStoragePolicyEcMLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_M_LTE);
        return this;
    }

    public void setDefaultStoragePolicyEcMLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_M_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_M_LTE);
        }
    }

    public boolean getDefaultStoragePolicyEcMLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_M_LTE);
    }

    public ClusterSettingsWhereInput defaultStoragePolicyEcMNot(
            Integer defaultStoragePolicyEcMNot) {

        this.defaultStoragePolicyEcMNot = defaultStoragePolicyEcMNot;
        return this;
    }

    /**
     * Get defaultStoragePolicyEcMNot
     *
     * @return defaultStoragePolicyEcMNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getDefaultStoragePolicyEcMNot() {
        return defaultStoragePolicyEcMNot;
    }

    public void setDefaultStoragePolicyEcMNot(Integer defaultStoragePolicyEcMNot) {
        this.defaultStoragePolicyEcMNot = defaultStoragePolicyEcMNot;
    }

    public ClusterSettingsWhereInput defaultStoragePolicyEcMNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_M_NOT);
        return this;
    }

    public ClusterSettingsWhereInput defaultStoragePolicyEcMNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_M_NOT);
        return this;
    }

    public void setDefaultStoragePolicyEcMNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_M_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_M_NOT);
        }
    }

    public boolean getDefaultStoragePolicyEcMNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_M_NOT);
    }

    public ClusterSettingsWhereInput defaultStoragePolicyEcMNotIn(
            List<Integer> defaultStoragePolicyEcMNotIn) {

        this.defaultStoragePolicyEcMNotIn = defaultStoragePolicyEcMNotIn;
        return this;
    }

    public ClusterSettingsWhereInput addDefaultStoragePolicyEcMNotInItem(
            Integer defaultStoragePolicyEcMNotInItem) {
        if (this.defaultStoragePolicyEcMNotIn == null) {
            this.defaultStoragePolicyEcMNotIn = new ArrayList<Integer>();
        }
        this.defaultStoragePolicyEcMNotIn.add(defaultStoragePolicyEcMNotInItem);
        return this;
    }

    /**
     * Get defaultStoragePolicyEcMNotIn
     *
     * @return defaultStoragePolicyEcMNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getDefaultStoragePolicyEcMNotIn() {
        return defaultStoragePolicyEcMNotIn;
    }

    public void setDefaultStoragePolicyEcMNotIn(List<Integer> defaultStoragePolicyEcMNotIn) {
        this.defaultStoragePolicyEcMNotIn = defaultStoragePolicyEcMNotIn;
    }

    public ClusterSettingsWhereInput defaultStoragePolicyEcMNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_M_NOT_IN);
        return this;
    }

    public ClusterSettingsWhereInput defaultStoragePolicyEcMNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_M_NOT_IN);
        return this;
    }

    public void setDefaultStoragePolicyEcMNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_M_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_M_NOT_IN);
        }
    }

    public boolean getDefaultStoragePolicyEcMNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_M_NOT_IN);
    }

    public ClusterSettingsWhereInput defaultStoragePolicyIn(
            List<VmVolumeElfStoragePolicyType> defaultStoragePolicyIn) {

        this.defaultStoragePolicyIn = defaultStoragePolicyIn;
        return this;
    }

    public ClusterSettingsWhereInput addDefaultStoragePolicyInItem(
            VmVolumeElfStoragePolicyType defaultStoragePolicyInItem) {
        if (this.defaultStoragePolicyIn == null) {
            this.defaultStoragePolicyIn = new ArrayList<VmVolumeElfStoragePolicyType>();
        }
        this.defaultStoragePolicyIn.add(defaultStoragePolicyInItem);
        return this;
    }

    /**
     * Get defaultStoragePolicyIn
     *
     * @return defaultStoragePolicyIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<VmVolumeElfStoragePolicyType> getDefaultStoragePolicyIn() {
        return defaultStoragePolicyIn;
    }

    public void setDefaultStoragePolicyIn(
            List<VmVolumeElfStoragePolicyType> defaultStoragePolicyIn) {
        this.defaultStoragePolicyIn = defaultStoragePolicyIn;
    }

    public ClusterSettingsWhereInput defaultStoragePolicyIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_IN);
        return this;
    }

    public ClusterSettingsWhereInput defaultStoragePolicyIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_IN);
        return this;
    }

    public void setDefaultStoragePolicyIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_IN);
        }
    }

    public boolean getDefaultStoragePolicyIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_IN);
    }

    public ClusterSettingsWhereInput defaultStoragePolicyNot(
            VmVolumeElfStoragePolicyType defaultStoragePolicyNot) {

        this.defaultStoragePolicyNot = defaultStoragePolicyNot;
        return this;
    }

    /**
     * Get defaultStoragePolicyNot
     *
     * @return defaultStoragePolicyNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmVolumeElfStoragePolicyType getDefaultStoragePolicyNot() {
        return defaultStoragePolicyNot;
    }

    public void setDefaultStoragePolicyNot(VmVolumeElfStoragePolicyType defaultStoragePolicyNot) {
        this.defaultStoragePolicyNot = defaultStoragePolicyNot;
    }

    public ClusterSettingsWhereInput defaultStoragePolicyNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_NOT);
        return this;
    }

    public ClusterSettingsWhereInput defaultStoragePolicyNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_NOT);
        return this;
    }

    public void setDefaultStoragePolicyNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_NOT);
        }
    }

    public boolean getDefaultStoragePolicyNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_NOT);
    }

    public ClusterSettingsWhereInput defaultStoragePolicyNotIn(
            List<VmVolumeElfStoragePolicyType> defaultStoragePolicyNotIn) {

        this.defaultStoragePolicyNotIn = defaultStoragePolicyNotIn;
        return this;
    }

    public ClusterSettingsWhereInput addDefaultStoragePolicyNotInItem(
            VmVolumeElfStoragePolicyType defaultStoragePolicyNotInItem) {
        if (this.defaultStoragePolicyNotIn == null) {
            this.defaultStoragePolicyNotIn = new ArrayList<VmVolumeElfStoragePolicyType>();
        }
        this.defaultStoragePolicyNotIn.add(defaultStoragePolicyNotInItem);
        return this;
    }

    /**
     * Get defaultStoragePolicyNotIn
     *
     * @return defaultStoragePolicyNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<VmVolumeElfStoragePolicyType> getDefaultStoragePolicyNotIn() {
        return defaultStoragePolicyNotIn;
    }

    public void setDefaultStoragePolicyNotIn(
            List<VmVolumeElfStoragePolicyType> defaultStoragePolicyNotIn) {
        this.defaultStoragePolicyNotIn = defaultStoragePolicyNotIn;
    }

    public ClusterSettingsWhereInput defaultStoragePolicyNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_NOT_IN);
        return this;
    }

    public ClusterSettingsWhereInput defaultStoragePolicyNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_NOT_IN);
        return this;
    }

    public void setDefaultStoragePolicyNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_NOT_IN);
        }
    }

    public boolean getDefaultStoragePolicyNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_NOT_IN);
    }

    public ClusterSettingsWhereInput defaultStoragePolicyReplicaNum(
            Integer defaultStoragePolicyReplicaNum) {

        this.defaultStoragePolicyReplicaNum = defaultStoragePolicyReplicaNum;
        return this;
    }

    /**
     * Get defaultStoragePolicyReplicaNum
     *
     * @return defaultStoragePolicyReplicaNum
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getDefaultStoragePolicyReplicaNum() {
        return defaultStoragePolicyReplicaNum;
    }

    public void setDefaultStoragePolicyReplicaNum(Integer defaultStoragePolicyReplicaNum) {
        this.defaultStoragePolicyReplicaNum = defaultStoragePolicyReplicaNum;
    }

    public ClusterSettingsWhereInput defaultStoragePolicyReplicaNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_REPLICA_NUM);
        return this;
    }

    public ClusterSettingsWhereInput defaultStoragePolicyReplicaNum_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_REPLICA_NUM);
        return this;
    }

    public void setDefaultStoragePolicyReplicaNum_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_REPLICA_NUM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_REPLICA_NUM);
        }
    }

    public boolean getDefaultStoragePolicyReplicaNum_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_REPLICA_NUM);
    }

    public ClusterSettingsWhereInput defaultStoragePolicyReplicaNumGt(
            Integer defaultStoragePolicyReplicaNumGt) {

        this.defaultStoragePolicyReplicaNumGt = defaultStoragePolicyReplicaNumGt;
        return this;
    }

    /**
     * Get defaultStoragePolicyReplicaNumGt
     *
     * @return defaultStoragePolicyReplicaNumGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getDefaultStoragePolicyReplicaNumGt() {
        return defaultStoragePolicyReplicaNumGt;
    }

    public void setDefaultStoragePolicyReplicaNumGt(Integer defaultStoragePolicyReplicaNumGt) {
        this.defaultStoragePolicyReplicaNumGt = defaultStoragePolicyReplicaNumGt;
    }

    public ClusterSettingsWhereInput defaultStoragePolicyReplicaNumGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_REPLICA_NUM_GT);
        return this;
    }

    public ClusterSettingsWhereInput defaultStoragePolicyReplicaNumGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_REPLICA_NUM_GT);
        return this;
    }

    public void setDefaultStoragePolicyReplicaNumGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_REPLICA_NUM_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_REPLICA_NUM_GT);
        }
    }

    public boolean getDefaultStoragePolicyReplicaNumGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_REPLICA_NUM_GT);
    }

    public ClusterSettingsWhereInput defaultStoragePolicyReplicaNumGte(
            Integer defaultStoragePolicyReplicaNumGte) {

        this.defaultStoragePolicyReplicaNumGte = defaultStoragePolicyReplicaNumGte;
        return this;
    }

    /**
     * Get defaultStoragePolicyReplicaNumGte
     *
     * @return defaultStoragePolicyReplicaNumGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getDefaultStoragePolicyReplicaNumGte() {
        return defaultStoragePolicyReplicaNumGte;
    }

    public void setDefaultStoragePolicyReplicaNumGte(Integer defaultStoragePolicyReplicaNumGte) {
        this.defaultStoragePolicyReplicaNumGte = defaultStoragePolicyReplicaNumGte;
    }

    public ClusterSettingsWhereInput defaultStoragePolicyReplicaNumGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_REPLICA_NUM_GTE);
        return this;
    }

    public ClusterSettingsWhereInput defaultStoragePolicyReplicaNumGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_REPLICA_NUM_GTE);
        return this;
    }

    public void setDefaultStoragePolicyReplicaNumGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_REPLICA_NUM_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_REPLICA_NUM_GTE);
        }
    }

    public boolean getDefaultStoragePolicyReplicaNumGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_REPLICA_NUM_GTE);
    }

    public ClusterSettingsWhereInput defaultStoragePolicyReplicaNumIn(
            List<Integer> defaultStoragePolicyReplicaNumIn) {

        this.defaultStoragePolicyReplicaNumIn = defaultStoragePolicyReplicaNumIn;
        return this;
    }

    public ClusterSettingsWhereInput addDefaultStoragePolicyReplicaNumInItem(
            Integer defaultStoragePolicyReplicaNumInItem) {
        if (this.defaultStoragePolicyReplicaNumIn == null) {
            this.defaultStoragePolicyReplicaNumIn = new ArrayList<Integer>();
        }
        this.defaultStoragePolicyReplicaNumIn.add(defaultStoragePolicyReplicaNumInItem);
        return this;
    }

    /**
     * Get defaultStoragePolicyReplicaNumIn
     *
     * @return defaultStoragePolicyReplicaNumIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getDefaultStoragePolicyReplicaNumIn() {
        return defaultStoragePolicyReplicaNumIn;
    }

    public void setDefaultStoragePolicyReplicaNumIn(
            List<Integer> defaultStoragePolicyReplicaNumIn) {
        this.defaultStoragePolicyReplicaNumIn = defaultStoragePolicyReplicaNumIn;
    }

    public ClusterSettingsWhereInput defaultStoragePolicyReplicaNumIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_REPLICA_NUM_IN);
        return this;
    }

    public ClusterSettingsWhereInput defaultStoragePolicyReplicaNumIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_REPLICA_NUM_IN);
        return this;
    }

    public void setDefaultStoragePolicyReplicaNumIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_REPLICA_NUM_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_REPLICA_NUM_IN);
        }
    }

    public boolean getDefaultStoragePolicyReplicaNumIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_REPLICA_NUM_IN);
    }

    public ClusterSettingsWhereInput defaultStoragePolicyReplicaNumLt(
            Integer defaultStoragePolicyReplicaNumLt) {

        this.defaultStoragePolicyReplicaNumLt = defaultStoragePolicyReplicaNumLt;
        return this;
    }

    /**
     * Get defaultStoragePolicyReplicaNumLt
     *
     * @return defaultStoragePolicyReplicaNumLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getDefaultStoragePolicyReplicaNumLt() {
        return defaultStoragePolicyReplicaNumLt;
    }

    public void setDefaultStoragePolicyReplicaNumLt(Integer defaultStoragePolicyReplicaNumLt) {
        this.defaultStoragePolicyReplicaNumLt = defaultStoragePolicyReplicaNumLt;
    }

    public ClusterSettingsWhereInput defaultStoragePolicyReplicaNumLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_REPLICA_NUM_LT);
        return this;
    }

    public ClusterSettingsWhereInput defaultStoragePolicyReplicaNumLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_REPLICA_NUM_LT);
        return this;
    }

    public void setDefaultStoragePolicyReplicaNumLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_REPLICA_NUM_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_REPLICA_NUM_LT);
        }
    }

    public boolean getDefaultStoragePolicyReplicaNumLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_REPLICA_NUM_LT);
    }

    public ClusterSettingsWhereInput defaultStoragePolicyReplicaNumLte(
            Integer defaultStoragePolicyReplicaNumLte) {

        this.defaultStoragePolicyReplicaNumLte = defaultStoragePolicyReplicaNumLte;
        return this;
    }

    /**
     * Get defaultStoragePolicyReplicaNumLte
     *
     * @return defaultStoragePolicyReplicaNumLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getDefaultStoragePolicyReplicaNumLte() {
        return defaultStoragePolicyReplicaNumLte;
    }

    public void setDefaultStoragePolicyReplicaNumLte(Integer defaultStoragePolicyReplicaNumLte) {
        this.defaultStoragePolicyReplicaNumLte = defaultStoragePolicyReplicaNumLte;
    }

    public ClusterSettingsWhereInput defaultStoragePolicyReplicaNumLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_REPLICA_NUM_LTE);
        return this;
    }

    public ClusterSettingsWhereInput defaultStoragePolicyReplicaNumLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_REPLICA_NUM_LTE);
        return this;
    }

    public void setDefaultStoragePolicyReplicaNumLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_REPLICA_NUM_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_REPLICA_NUM_LTE);
        }
    }

    public boolean getDefaultStoragePolicyReplicaNumLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_REPLICA_NUM_LTE);
    }

    public ClusterSettingsWhereInput defaultStoragePolicyReplicaNumNot(
            Integer defaultStoragePolicyReplicaNumNot) {

        this.defaultStoragePolicyReplicaNumNot = defaultStoragePolicyReplicaNumNot;
        return this;
    }

    /**
     * Get defaultStoragePolicyReplicaNumNot
     *
     * @return defaultStoragePolicyReplicaNumNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getDefaultStoragePolicyReplicaNumNot() {
        return defaultStoragePolicyReplicaNumNot;
    }

    public void setDefaultStoragePolicyReplicaNumNot(Integer defaultStoragePolicyReplicaNumNot) {
        this.defaultStoragePolicyReplicaNumNot = defaultStoragePolicyReplicaNumNot;
    }

    public ClusterSettingsWhereInput defaultStoragePolicyReplicaNumNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_REPLICA_NUM_NOT);
        return this;
    }

    public ClusterSettingsWhereInput defaultStoragePolicyReplicaNumNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_REPLICA_NUM_NOT);
        return this;
    }

    public void setDefaultStoragePolicyReplicaNumNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_REPLICA_NUM_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_REPLICA_NUM_NOT);
        }
    }

    public boolean getDefaultStoragePolicyReplicaNumNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_REPLICA_NUM_NOT);
    }

    public ClusterSettingsWhereInput defaultStoragePolicyReplicaNumNotIn(
            List<Integer> defaultStoragePolicyReplicaNumNotIn) {

        this.defaultStoragePolicyReplicaNumNotIn = defaultStoragePolicyReplicaNumNotIn;
        return this;
    }

    public ClusterSettingsWhereInput addDefaultStoragePolicyReplicaNumNotInItem(
            Integer defaultStoragePolicyReplicaNumNotInItem) {
        if (this.defaultStoragePolicyReplicaNumNotIn == null) {
            this.defaultStoragePolicyReplicaNumNotIn = new ArrayList<Integer>();
        }
        this.defaultStoragePolicyReplicaNumNotIn.add(defaultStoragePolicyReplicaNumNotInItem);
        return this;
    }

    /**
     * Get defaultStoragePolicyReplicaNumNotIn
     *
     * @return defaultStoragePolicyReplicaNumNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getDefaultStoragePolicyReplicaNumNotIn() {
        return defaultStoragePolicyReplicaNumNotIn;
    }

    public void setDefaultStoragePolicyReplicaNumNotIn(
            List<Integer> defaultStoragePolicyReplicaNumNotIn) {
        this.defaultStoragePolicyReplicaNumNotIn = defaultStoragePolicyReplicaNumNotIn;
    }

    public ClusterSettingsWhereInput defaultStoragePolicyReplicaNumNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_REPLICA_NUM_NOT_IN);
        return this;
    }

    public ClusterSettingsWhereInput defaultStoragePolicyReplicaNumNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_REPLICA_NUM_NOT_IN);
        return this;
    }

    public void setDefaultStoragePolicyReplicaNumNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_REPLICA_NUM_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_REPLICA_NUM_NOT_IN);
        }
    }

    public boolean getDefaultStoragePolicyReplicaNumNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_REPLICA_NUM_NOT_IN);
    }

    public ClusterSettingsWhereInput defaultStoragePolicyStripeNum(
            Integer defaultStoragePolicyStripeNum) {

        this.defaultStoragePolicyStripeNum = defaultStoragePolicyStripeNum;
        return this;
    }

    /**
     * Get defaultStoragePolicyStripeNum
     *
     * @return defaultStoragePolicyStripeNum
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getDefaultStoragePolicyStripeNum() {
        return defaultStoragePolicyStripeNum;
    }

    public void setDefaultStoragePolicyStripeNum(Integer defaultStoragePolicyStripeNum) {
        this.defaultStoragePolicyStripeNum = defaultStoragePolicyStripeNum;
    }

    public ClusterSettingsWhereInput defaultStoragePolicyStripeNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_STRIPE_NUM);
        return this;
    }

    public ClusterSettingsWhereInput defaultStoragePolicyStripeNum_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_STRIPE_NUM);
        return this;
    }

    public void setDefaultStoragePolicyStripeNum_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_STRIPE_NUM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_STRIPE_NUM);
        }
    }

    public boolean getDefaultStoragePolicyStripeNum_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_STRIPE_NUM);
    }

    public ClusterSettingsWhereInput defaultStoragePolicyStripeNumGt(
            Integer defaultStoragePolicyStripeNumGt) {

        this.defaultStoragePolicyStripeNumGt = defaultStoragePolicyStripeNumGt;
        return this;
    }

    /**
     * Get defaultStoragePolicyStripeNumGt
     *
     * @return defaultStoragePolicyStripeNumGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getDefaultStoragePolicyStripeNumGt() {
        return defaultStoragePolicyStripeNumGt;
    }

    public void setDefaultStoragePolicyStripeNumGt(Integer defaultStoragePolicyStripeNumGt) {
        this.defaultStoragePolicyStripeNumGt = defaultStoragePolicyStripeNumGt;
    }

    public ClusterSettingsWhereInput defaultStoragePolicyStripeNumGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_STRIPE_NUM_GT);
        return this;
    }

    public ClusterSettingsWhereInput defaultStoragePolicyStripeNumGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_STRIPE_NUM_GT);
        return this;
    }

    public void setDefaultStoragePolicyStripeNumGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_STRIPE_NUM_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_STRIPE_NUM_GT);
        }
    }

    public boolean getDefaultStoragePolicyStripeNumGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_STRIPE_NUM_GT);
    }

    public ClusterSettingsWhereInput defaultStoragePolicyStripeNumGte(
            Integer defaultStoragePolicyStripeNumGte) {

        this.defaultStoragePolicyStripeNumGte = defaultStoragePolicyStripeNumGte;
        return this;
    }

    /**
     * Get defaultStoragePolicyStripeNumGte
     *
     * @return defaultStoragePolicyStripeNumGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getDefaultStoragePolicyStripeNumGte() {
        return defaultStoragePolicyStripeNumGte;
    }

    public void setDefaultStoragePolicyStripeNumGte(Integer defaultStoragePolicyStripeNumGte) {
        this.defaultStoragePolicyStripeNumGte = defaultStoragePolicyStripeNumGte;
    }

    public ClusterSettingsWhereInput defaultStoragePolicyStripeNumGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_STRIPE_NUM_GTE);
        return this;
    }

    public ClusterSettingsWhereInput defaultStoragePolicyStripeNumGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_STRIPE_NUM_GTE);
        return this;
    }

    public void setDefaultStoragePolicyStripeNumGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_STRIPE_NUM_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_STRIPE_NUM_GTE);
        }
    }

    public boolean getDefaultStoragePolicyStripeNumGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_STRIPE_NUM_GTE);
    }

    public ClusterSettingsWhereInput defaultStoragePolicyStripeNumIn(
            List<Integer> defaultStoragePolicyStripeNumIn) {

        this.defaultStoragePolicyStripeNumIn = defaultStoragePolicyStripeNumIn;
        return this;
    }

    public ClusterSettingsWhereInput addDefaultStoragePolicyStripeNumInItem(
            Integer defaultStoragePolicyStripeNumInItem) {
        if (this.defaultStoragePolicyStripeNumIn == null) {
            this.defaultStoragePolicyStripeNumIn = new ArrayList<Integer>();
        }
        this.defaultStoragePolicyStripeNumIn.add(defaultStoragePolicyStripeNumInItem);
        return this;
    }

    /**
     * Get defaultStoragePolicyStripeNumIn
     *
     * @return defaultStoragePolicyStripeNumIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getDefaultStoragePolicyStripeNumIn() {
        return defaultStoragePolicyStripeNumIn;
    }

    public void setDefaultStoragePolicyStripeNumIn(List<Integer> defaultStoragePolicyStripeNumIn) {
        this.defaultStoragePolicyStripeNumIn = defaultStoragePolicyStripeNumIn;
    }

    public ClusterSettingsWhereInput defaultStoragePolicyStripeNumIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_STRIPE_NUM_IN);
        return this;
    }

    public ClusterSettingsWhereInput defaultStoragePolicyStripeNumIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_STRIPE_NUM_IN);
        return this;
    }

    public void setDefaultStoragePolicyStripeNumIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_STRIPE_NUM_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_STRIPE_NUM_IN);
        }
    }

    public boolean getDefaultStoragePolicyStripeNumIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_STRIPE_NUM_IN);
    }

    public ClusterSettingsWhereInput defaultStoragePolicyStripeNumLt(
            Integer defaultStoragePolicyStripeNumLt) {

        this.defaultStoragePolicyStripeNumLt = defaultStoragePolicyStripeNumLt;
        return this;
    }

    /**
     * Get defaultStoragePolicyStripeNumLt
     *
     * @return defaultStoragePolicyStripeNumLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getDefaultStoragePolicyStripeNumLt() {
        return defaultStoragePolicyStripeNumLt;
    }

    public void setDefaultStoragePolicyStripeNumLt(Integer defaultStoragePolicyStripeNumLt) {
        this.defaultStoragePolicyStripeNumLt = defaultStoragePolicyStripeNumLt;
    }

    public ClusterSettingsWhereInput defaultStoragePolicyStripeNumLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_STRIPE_NUM_LT);
        return this;
    }

    public ClusterSettingsWhereInput defaultStoragePolicyStripeNumLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_STRIPE_NUM_LT);
        return this;
    }

    public void setDefaultStoragePolicyStripeNumLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_STRIPE_NUM_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_STRIPE_NUM_LT);
        }
    }

    public boolean getDefaultStoragePolicyStripeNumLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_STRIPE_NUM_LT);
    }

    public ClusterSettingsWhereInput defaultStoragePolicyStripeNumLte(
            Integer defaultStoragePolicyStripeNumLte) {

        this.defaultStoragePolicyStripeNumLte = defaultStoragePolicyStripeNumLte;
        return this;
    }

    /**
     * Get defaultStoragePolicyStripeNumLte
     *
     * @return defaultStoragePolicyStripeNumLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getDefaultStoragePolicyStripeNumLte() {
        return defaultStoragePolicyStripeNumLte;
    }

    public void setDefaultStoragePolicyStripeNumLte(Integer defaultStoragePolicyStripeNumLte) {
        this.defaultStoragePolicyStripeNumLte = defaultStoragePolicyStripeNumLte;
    }

    public ClusterSettingsWhereInput defaultStoragePolicyStripeNumLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_STRIPE_NUM_LTE);
        return this;
    }

    public ClusterSettingsWhereInput defaultStoragePolicyStripeNumLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_STRIPE_NUM_LTE);
        return this;
    }

    public void setDefaultStoragePolicyStripeNumLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_STRIPE_NUM_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_STRIPE_NUM_LTE);
        }
    }

    public boolean getDefaultStoragePolicyStripeNumLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_STRIPE_NUM_LTE);
    }

    public ClusterSettingsWhereInput defaultStoragePolicyStripeNumNot(
            Integer defaultStoragePolicyStripeNumNot) {

        this.defaultStoragePolicyStripeNumNot = defaultStoragePolicyStripeNumNot;
        return this;
    }

    /**
     * Get defaultStoragePolicyStripeNumNot
     *
     * @return defaultStoragePolicyStripeNumNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getDefaultStoragePolicyStripeNumNot() {
        return defaultStoragePolicyStripeNumNot;
    }

    public void setDefaultStoragePolicyStripeNumNot(Integer defaultStoragePolicyStripeNumNot) {
        this.defaultStoragePolicyStripeNumNot = defaultStoragePolicyStripeNumNot;
    }

    public ClusterSettingsWhereInput defaultStoragePolicyStripeNumNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_STRIPE_NUM_NOT);
        return this;
    }

    public ClusterSettingsWhereInput defaultStoragePolicyStripeNumNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_STRIPE_NUM_NOT);
        return this;
    }

    public void setDefaultStoragePolicyStripeNumNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_STRIPE_NUM_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_STRIPE_NUM_NOT);
        }
    }

    public boolean getDefaultStoragePolicyStripeNumNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_STRIPE_NUM_NOT);
    }

    public ClusterSettingsWhereInput defaultStoragePolicyStripeNumNotIn(
            List<Integer> defaultStoragePolicyStripeNumNotIn) {

        this.defaultStoragePolicyStripeNumNotIn = defaultStoragePolicyStripeNumNotIn;
        return this;
    }

    public ClusterSettingsWhereInput addDefaultStoragePolicyStripeNumNotInItem(
            Integer defaultStoragePolicyStripeNumNotInItem) {
        if (this.defaultStoragePolicyStripeNumNotIn == null) {
            this.defaultStoragePolicyStripeNumNotIn = new ArrayList<Integer>();
        }
        this.defaultStoragePolicyStripeNumNotIn.add(defaultStoragePolicyStripeNumNotInItem);
        return this;
    }

    /**
     * Get defaultStoragePolicyStripeNumNotIn
     *
     * @return defaultStoragePolicyStripeNumNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getDefaultStoragePolicyStripeNumNotIn() {
        return defaultStoragePolicyStripeNumNotIn;
    }

    public void setDefaultStoragePolicyStripeNumNotIn(
            List<Integer> defaultStoragePolicyStripeNumNotIn) {
        this.defaultStoragePolicyStripeNumNotIn = defaultStoragePolicyStripeNumNotIn;
    }

    public ClusterSettingsWhereInput defaultStoragePolicyStripeNumNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_STRIPE_NUM_NOT_IN);
        return this;
    }

    public ClusterSettingsWhereInput defaultStoragePolicyStripeNumNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_STRIPE_NUM_NOT_IN);
        return this;
    }

    public void setDefaultStoragePolicyStripeNumNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_STRIPE_NUM_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_STRIPE_NUM_NOT_IN);
        }
    }

    public boolean getDefaultStoragePolicyStripeNumNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_STRIPE_NUM_NOT_IN);
    }

    public ClusterSettingsWhereInput defaultStoragePolicyThinProvision(
            Boolean defaultStoragePolicyThinProvision) {

        this.defaultStoragePolicyThinProvision = defaultStoragePolicyThinProvision;
        return this;
    }

    /**
     * Get defaultStoragePolicyThinProvision
     *
     * @return defaultStoragePolicyThinProvision
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getDefaultStoragePolicyThinProvision() {
        return defaultStoragePolicyThinProvision;
    }

    public void setDefaultStoragePolicyThinProvision(Boolean defaultStoragePolicyThinProvision) {
        this.defaultStoragePolicyThinProvision = defaultStoragePolicyThinProvision;
    }

    public ClusterSettingsWhereInput defaultStoragePolicyThinProvision_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_THIN_PROVISION);
        return this;
    }

    public ClusterSettingsWhereInput defaultStoragePolicyThinProvision_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_THIN_PROVISION);
        return this;
    }

    public void setDefaultStoragePolicyThinProvision_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_THIN_PROVISION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_THIN_PROVISION);
        }
    }

    public boolean getDefaultStoragePolicyThinProvision_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_THIN_PROVISION);
    }

    public ClusterSettingsWhereInput defaultStoragePolicyThinProvisionNot(
            Boolean defaultStoragePolicyThinProvisionNot) {

        this.defaultStoragePolicyThinProvisionNot = defaultStoragePolicyThinProvisionNot;
        return this;
    }

    /**
     * Get defaultStoragePolicyThinProvisionNot
     *
     * @return defaultStoragePolicyThinProvisionNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getDefaultStoragePolicyThinProvisionNot() {
        return defaultStoragePolicyThinProvisionNot;
    }

    public void setDefaultStoragePolicyThinProvisionNot(
            Boolean defaultStoragePolicyThinProvisionNot) {
        this.defaultStoragePolicyThinProvisionNot = defaultStoragePolicyThinProvisionNot;
    }

    public ClusterSettingsWhereInput defaultStoragePolicyThinProvisionNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_THIN_PROVISION_NOT);
        return this;
    }

    public ClusterSettingsWhereInput defaultStoragePolicyThinProvisionNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_THIN_PROVISION_NOT);
        return this;
    }

    public void setDefaultStoragePolicyThinProvisionNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_THIN_PROVISION_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_THIN_PROVISION_NOT);
        }
    }

    public boolean getDefaultStoragePolicyThinProvisionNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_THIN_PROVISION_NOT);
    }

    public ClusterSettingsWhereInput enabledIscsi(Boolean enabledIscsi) {

        this.enabledIscsi = enabledIscsi;
        return this;
    }

    /**
     * Get enabledIscsi
     *
     * @return enabledIscsi
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getEnabledIscsi() {
        return enabledIscsi;
    }

    public void setEnabledIscsi(Boolean enabledIscsi) {
        this.enabledIscsi = enabledIscsi;
    }

    public ClusterSettingsWhereInput enabledIscsi_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENABLED_ISCSI);
        return this;
    }

    public ClusterSettingsWhereInput enabledIscsi_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ENABLED_ISCSI);
        return this;
    }

    public void setEnabledIscsi_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ENABLED_ISCSI);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ENABLED_ISCSI);
        }
    }

    public boolean getEnabledIscsi_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ENABLED_ISCSI);
    }

    public ClusterSettingsWhereInput enabledIscsiNot(Boolean enabledIscsiNot) {

        this.enabledIscsiNot = enabledIscsiNot;
        return this;
    }

    /**
     * Get enabledIscsiNot
     *
     * @return enabledIscsiNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getEnabledIscsiNot() {
        return enabledIscsiNot;
    }

    public void setEnabledIscsiNot(Boolean enabledIscsiNot) {
        this.enabledIscsiNot = enabledIscsiNot;
    }

    public ClusterSettingsWhereInput enabledIscsiNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENABLED_ISCSI_NOT);
        return this;
    }

    public ClusterSettingsWhereInput enabledIscsiNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ENABLED_ISCSI_NOT);
        return this;
    }

    public void setEnabledIscsiNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ENABLED_ISCSI_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ENABLED_ISCSI_NOT);
        }
    }

    public boolean getEnabledIscsiNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ENABLED_ISCSI_NOT);
    }

    public ClusterSettingsWhereInput id(String id) {

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

    public ClusterSettingsWhereInput id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public ClusterSettingsWhereInput id_ExplictlyNonNull() {
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

    public ClusterSettingsWhereInput idContains(String idContains) {

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

    public ClusterSettingsWhereInput idContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_CONTAINS);
        return this;
    }

    public ClusterSettingsWhereInput idContains_ExplictlyNonNull() {
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

    public ClusterSettingsWhereInput idEndsWith(String idEndsWith) {

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

    public ClusterSettingsWhereInput idEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_ENDS_WITH);
        return this;
    }

    public ClusterSettingsWhereInput idEndsWith_ExplictlyNonNull() {
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

    public ClusterSettingsWhereInput idGt(String idGt) {

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

    public ClusterSettingsWhereInput idGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GT);
        return this;
    }

    public ClusterSettingsWhereInput idGt_ExplictlyNonNull() {
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

    public ClusterSettingsWhereInput idGte(String idGte) {

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

    public ClusterSettingsWhereInput idGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GTE);
        return this;
    }

    public ClusterSettingsWhereInput idGte_ExplictlyNonNull() {
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

    public ClusterSettingsWhereInput idIn(List<String> idIn) {

        this.idIn = idIn;
        return this;
    }

    public ClusterSettingsWhereInput addIdInItem(String idInItem) {
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

    public ClusterSettingsWhereInput idIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_IN);
        return this;
    }

    public ClusterSettingsWhereInput idIn_ExplictlyNonNull() {
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

    public ClusterSettingsWhereInput idLt(String idLt) {

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

    public ClusterSettingsWhereInput idLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LT);
        return this;
    }

    public ClusterSettingsWhereInput idLt_ExplictlyNonNull() {
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

    public ClusterSettingsWhereInput idLte(String idLte) {

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

    public ClusterSettingsWhereInput idLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LTE);
        return this;
    }

    public ClusterSettingsWhereInput idLte_ExplictlyNonNull() {
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

    public ClusterSettingsWhereInput idNot(String idNot) {

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

    public ClusterSettingsWhereInput idNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT);
        return this;
    }

    public ClusterSettingsWhereInput idNot_ExplictlyNonNull() {
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

    public ClusterSettingsWhereInput idNotContains(String idNotContains) {

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

    public ClusterSettingsWhereInput idNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_CONTAINS);
        return this;
    }

    public ClusterSettingsWhereInput idNotContains_ExplictlyNonNull() {
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

    public ClusterSettingsWhereInput idNotEndsWith(String idNotEndsWith) {

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

    public ClusterSettingsWhereInput idNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
        return this;
    }

    public ClusterSettingsWhereInput idNotEndsWith_ExplictlyNonNull() {
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

    public ClusterSettingsWhereInput idNotIn(List<String> idNotIn) {

        this.idNotIn = idNotIn;
        return this;
    }

    public ClusterSettingsWhereInput addIdNotInItem(String idNotInItem) {
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

    public ClusterSettingsWhereInput idNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_IN);
        return this;
    }

    public ClusterSettingsWhereInput idNotIn_ExplictlyNonNull() {
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

    public ClusterSettingsWhereInput idNotStartsWith(String idNotStartsWith) {

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

    public ClusterSettingsWhereInput idNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
        return this;
    }

    public ClusterSettingsWhereInput idNotStartsWith_ExplictlyNonNull() {
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

    public ClusterSettingsWhereInput idStartsWith(String idStartsWith) {

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

    public ClusterSettingsWhereInput idStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_STARTS_WITH);
        return this;
    }

    public ClusterSettingsWhereInput idStartsWith_ExplictlyNonNull() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ClusterSettingsWhereInput clusterSettingsWhereInput = (ClusterSettingsWhereInput) o;
        return Objects.equals(this.AND, clusterSettingsWhereInput.AND)
                && Objects.equals(this.NOT, clusterSettingsWhereInput.NOT)
                && Objects.equals(this.OR, clusterSettingsWhereInput.OR)
                && Objects.equals(this.cluster, clusterSettingsWhereInput.cluster)
                && Objects.equals(this.defaultHa, clusterSettingsWhereInput.defaultHa)
                && Objects.equals(this.defaultHaNot, clusterSettingsWhereInput.defaultHaNot)
                && Objects.equals(
                        this.defaultStoragePolicy, clusterSettingsWhereInput.defaultStoragePolicy)
                && Objects.equals(
                        this.defaultStoragePolicyEcK,
                        clusterSettingsWhereInput.defaultStoragePolicyEcK)
                && Objects.equals(
                        this.defaultStoragePolicyEcKGt,
                        clusterSettingsWhereInput.defaultStoragePolicyEcKGt)
                && Objects.equals(
                        this.defaultStoragePolicyEcKGte,
                        clusterSettingsWhereInput.defaultStoragePolicyEcKGte)
                && Objects.equals(
                        this.defaultStoragePolicyEcKIn,
                        clusterSettingsWhereInput.defaultStoragePolicyEcKIn)
                && Objects.equals(
                        this.defaultStoragePolicyEcKLt,
                        clusterSettingsWhereInput.defaultStoragePolicyEcKLt)
                && Objects.equals(
                        this.defaultStoragePolicyEcKLte,
                        clusterSettingsWhereInput.defaultStoragePolicyEcKLte)
                && Objects.equals(
                        this.defaultStoragePolicyEcKNot,
                        clusterSettingsWhereInput.defaultStoragePolicyEcKNot)
                && Objects.equals(
                        this.defaultStoragePolicyEcKNotIn,
                        clusterSettingsWhereInput.defaultStoragePolicyEcKNotIn)
                && Objects.equals(
                        this.defaultStoragePolicyEcM,
                        clusterSettingsWhereInput.defaultStoragePolicyEcM)
                && Objects.equals(
                        this.defaultStoragePolicyEcMGt,
                        clusterSettingsWhereInput.defaultStoragePolicyEcMGt)
                && Objects.equals(
                        this.defaultStoragePolicyEcMGte,
                        clusterSettingsWhereInput.defaultStoragePolicyEcMGte)
                && Objects.equals(
                        this.defaultStoragePolicyEcMIn,
                        clusterSettingsWhereInput.defaultStoragePolicyEcMIn)
                && Objects.equals(
                        this.defaultStoragePolicyEcMLt,
                        clusterSettingsWhereInput.defaultStoragePolicyEcMLt)
                && Objects.equals(
                        this.defaultStoragePolicyEcMLte,
                        clusterSettingsWhereInput.defaultStoragePolicyEcMLte)
                && Objects.equals(
                        this.defaultStoragePolicyEcMNot,
                        clusterSettingsWhereInput.defaultStoragePolicyEcMNot)
                && Objects.equals(
                        this.defaultStoragePolicyEcMNotIn,
                        clusterSettingsWhereInput.defaultStoragePolicyEcMNotIn)
                && Objects.equals(
                        this.defaultStoragePolicyIn,
                        clusterSettingsWhereInput.defaultStoragePolicyIn)
                && Objects.equals(
                        this.defaultStoragePolicyNot,
                        clusterSettingsWhereInput.defaultStoragePolicyNot)
                && Objects.equals(
                        this.defaultStoragePolicyNotIn,
                        clusterSettingsWhereInput.defaultStoragePolicyNotIn)
                && Objects.equals(
                        this.defaultStoragePolicyReplicaNum,
                        clusterSettingsWhereInput.defaultStoragePolicyReplicaNum)
                && Objects.equals(
                        this.defaultStoragePolicyReplicaNumGt,
                        clusterSettingsWhereInput.defaultStoragePolicyReplicaNumGt)
                && Objects.equals(
                        this.defaultStoragePolicyReplicaNumGte,
                        clusterSettingsWhereInput.defaultStoragePolicyReplicaNumGte)
                && Objects.equals(
                        this.defaultStoragePolicyReplicaNumIn,
                        clusterSettingsWhereInput.defaultStoragePolicyReplicaNumIn)
                && Objects.equals(
                        this.defaultStoragePolicyReplicaNumLt,
                        clusterSettingsWhereInput.defaultStoragePolicyReplicaNumLt)
                && Objects.equals(
                        this.defaultStoragePolicyReplicaNumLte,
                        clusterSettingsWhereInput.defaultStoragePolicyReplicaNumLte)
                && Objects.equals(
                        this.defaultStoragePolicyReplicaNumNot,
                        clusterSettingsWhereInput.defaultStoragePolicyReplicaNumNot)
                && Objects.equals(
                        this.defaultStoragePolicyReplicaNumNotIn,
                        clusterSettingsWhereInput.defaultStoragePolicyReplicaNumNotIn)
                && Objects.equals(
                        this.defaultStoragePolicyStripeNum,
                        clusterSettingsWhereInput.defaultStoragePolicyStripeNum)
                && Objects.equals(
                        this.defaultStoragePolicyStripeNumGt,
                        clusterSettingsWhereInput.defaultStoragePolicyStripeNumGt)
                && Objects.equals(
                        this.defaultStoragePolicyStripeNumGte,
                        clusterSettingsWhereInput.defaultStoragePolicyStripeNumGte)
                && Objects.equals(
                        this.defaultStoragePolicyStripeNumIn,
                        clusterSettingsWhereInput.defaultStoragePolicyStripeNumIn)
                && Objects.equals(
                        this.defaultStoragePolicyStripeNumLt,
                        clusterSettingsWhereInput.defaultStoragePolicyStripeNumLt)
                && Objects.equals(
                        this.defaultStoragePolicyStripeNumLte,
                        clusterSettingsWhereInput.defaultStoragePolicyStripeNumLte)
                && Objects.equals(
                        this.defaultStoragePolicyStripeNumNot,
                        clusterSettingsWhereInput.defaultStoragePolicyStripeNumNot)
                && Objects.equals(
                        this.defaultStoragePolicyStripeNumNotIn,
                        clusterSettingsWhereInput.defaultStoragePolicyStripeNumNotIn)
                && Objects.equals(
                        this.defaultStoragePolicyThinProvision,
                        clusterSettingsWhereInput.defaultStoragePolicyThinProvision)
                && Objects.equals(
                        this.defaultStoragePolicyThinProvisionNot,
                        clusterSettingsWhereInput.defaultStoragePolicyThinProvisionNot)
                && Objects.equals(this.enabledIscsi, clusterSettingsWhereInput.enabledIscsi)
                && Objects.equals(this.enabledIscsiNot, clusterSettingsWhereInput.enabledIscsiNot)
                && Objects.equals(this.id, clusterSettingsWhereInput.id)
                && Objects.equals(this.idContains, clusterSettingsWhereInput.idContains)
                && Objects.equals(this.idEndsWith, clusterSettingsWhereInput.idEndsWith)
                && Objects.equals(this.idGt, clusterSettingsWhereInput.idGt)
                && Objects.equals(this.idGte, clusterSettingsWhereInput.idGte)
                && Objects.equals(this.idIn, clusterSettingsWhereInput.idIn)
                && Objects.equals(this.idLt, clusterSettingsWhereInput.idLt)
                && Objects.equals(this.idLte, clusterSettingsWhereInput.idLte)
                && Objects.equals(this.idNot, clusterSettingsWhereInput.idNot)
                && Objects.equals(this.idNotContains, clusterSettingsWhereInput.idNotContains)
                && Objects.equals(this.idNotEndsWith, clusterSettingsWhereInput.idNotEndsWith)
                && Objects.equals(this.idNotIn, clusterSettingsWhereInput.idNotIn)
                && Objects.equals(this.idNotStartsWith, clusterSettingsWhereInput.idNotStartsWith)
                && Objects.equals(this.idStartsWith, clusterSettingsWhereInput.idStartsWith);
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
                defaultHa,
                defaultHaNot,
                defaultStoragePolicy,
                defaultStoragePolicyEcK,
                defaultStoragePolicyEcKGt,
                defaultStoragePolicyEcKGte,
                defaultStoragePolicyEcKIn,
                defaultStoragePolicyEcKLt,
                defaultStoragePolicyEcKLte,
                defaultStoragePolicyEcKNot,
                defaultStoragePolicyEcKNotIn,
                defaultStoragePolicyEcM,
                defaultStoragePolicyEcMGt,
                defaultStoragePolicyEcMGte,
                defaultStoragePolicyEcMIn,
                defaultStoragePolicyEcMLt,
                defaultStoragePolicyEcMLte,
                defaultStoragePolicyEcMNot,
                defaultStoragePolicyEcMNotIn,
                defaultStoragePolicyIn,
                defaultStoragePolicyNot,
                defaultStoragePolicyNotIn,
                defaultStoragePolicyReplicaNum,
                defaultStoragePolicyReplicaNumGt,
                defaultStoragePolicyReplicaNumGte,
                defaultStoragePolicyReplicaNumIn,
                defaultStoragePolicyReplicaNumLt,
                defaultStoragePolicyReplicaNumLte,
                defaultStoragePolicyReplicaNumNot,
                defaultStoragePolicyReplicaNumNotIn,
                defaultStoragePolicyStripeNum,
                defaultStoragePolicyStripeNumGt,
                defaultStoragePolicyStripeNumGte,
                defaultStoragePolicyStripeNumIn,
                defaultStoragePolicyStripeNumLt,
                defaultStoragePolicyStripeNumLte,
                defaultStoragePolicyStripeNumNot,
                defaultStoragePolicyStripeNumNotIn,
                defaultStoragePolicyThinProvision,
                defaultStoragePolicyThinProvisionNot,
                enabledIscsi,
                enabledIscsiNot,
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
                idStartsWith);
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
        sb.append("class ClusterSettingsWhereInput {\n");
        sb.append("    AND: ").append(toIndentedString(AND)).append("\n");
        sb.append("    NOT: ").append(toIndentedString(NOT)).append("\n");
        sb.append("    OR: ").append(toIndentedString(OR)).append("\n");
        sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
        sb.append("    defaultHa: ").append(toIndentedString(defaultHa)).append("\n");
        sb.append("    defaultHaNot: ").append(toIndentedString(defaultHaNot)).append("\n");
        sb.append("    defaultStoragePolicy: ")
                .append(toIndentedString(defaultStoragePolicy))
                .append("\n");
        sb.append("    defaultStoragePolicyEcK: ")
                .append(toIndentedString(defaultStoragePolicyEcK))
                .append("\n");
        sb.append("    defaultStoragePolicyEcKGt: ")
                .append(toIndentedString(defaultStoragePolicyEcKGt))
                .append("\n");
        sb.append("    defaultStoragePolicyEcKGte: ")
                .append(toIndentedString(defaultStoragePolicyEcKGte))
                .append("\n");
        sb.append("    defaultStoragePolicyEcKIn: ")
                .append(toIndentedString(defaultStoragePolicyEcKIn))
                .append("\n");
        sb.append("    defaultStoragePolicyEcKLt: ")
                .append(toIndentedString(defaultStoragePolicyEcKLt))
                .append("\n");
        sb.append("    defaultStoragePolicyEcKLte: ")
                .append(toIndentedString(defaultStoragePolicyEcKLte))
                .append("\n");
        sb.append("    defaultStoragePolicyEcKNot: ")
                .append(toIndentedString(defaultStoragePolicyEcKNot))
                .append("\n");
        sb.append("    defaultStoragePolicyEcKNotIn: ")
                .append(toIndentedString(defaultStoragePolicyEcKNotIn))
                .append("\n");
        sb.append("    defaultStoragePolicyEcM: ")
                .append(toIndentedString(defaultStoragePolicyEcM))
                .append("\n");
        sb.append("    defaultStoragePolicyEcMGt: ")
                .append(toIndentedString(defaultStoragePolicyEcMGt))
                .append("\n");
        sb.append("    defaultStoragePolicyEcMGte: ")
                .append(toIndentedString(defaultStoragePolicyEcMGte))
                .append("\n");
        sb.append("    defaultStoragePolicyEcMIn: ")
                .append(toIndentedString(defaultStoragePolicyEcMIn))
                .append("\n");
        sb.append("    defaultStoragePolicyEcMLt: ")
                .append(toIndentedString(defaultStoragePolicyEcMLt))
                .append("\n");
        sb.append("    defaultStoragePolicyEcMLte: ")
                .append(toIndentedString(defaultStoragePolicyEcMLte))
                .append("\n");
        sb.append("    defaultStoragePolicyEcMNot: ")
                .append(toIndentedString(defaultStoragePolicyEcMNot))
                .append("\n");
        sb.append("    defaultStoragePolicyEcMNotIn: ")
                .append(toIndentedString(defaultStoragePolicyEcMNotIn))
                .append("\n");
        sb.append("    defaultStoragePolicyIn: ")
                .append(toIndentedString(defaultStoragePolicyIn))
                .append("\n");
        sb.append("    defaultStoragePolicyNot: ")
                .append(toIndentedString(defaultStoragePolicyNot))
                .append("\n");
        sb.append("    defaultStoragePolicyNotIn: ")
                .append(toIndentedString(defaultStoragePolicyNotIn))
                .append("\n");
        sb.append("    defaultStoragePolicyReplicaNum: ")
                .append(toIndentedString(defaultStoragePolicyReplicaNum))
                .append("\n");
        sb.append("    defaultStoragePolicyReplicaNumGt: ")
                .append(toIndentedString(defaultStoragePolicyReplicaNumGt))
                .append("\n");
        sb.append("    defaultStoragePolicyReplicaNumGte: ")
                .append(toIndentedString(defaultStoragePolicyReplicaNumGte))
                .append("\n");
        sb.append("    defaultStoragePolicyReplicaNumIn: ")
                .append(toIndentedString(defaultStoragePolicyReplicaNumIn))
                .append("\n");
        sb.append("    defaultStoragePolicyReplicaNumLt: ")
                .append(toIndentedString(defaultStoragePolicyReplicaNumLt))
                .append("\n");
        sb.append("    defaultStoragePolicyReplicaNumLte: ")
                .append(toIndentedString(defaultStoragePolicyReplicaNumLte))
                .append("\n");
        sb.append("    defaultStoragePolicyReplicaNumNot: ")
                .append(toIndentedString(defaultStoragePolicyReplicaNumNot))
                .append("\n");
        sb.append("    defaultStoragePolicyReplicaNumNotIn: ")
                .append(toIndentedString(defaultStoragePolicyReplicaNumNotIn))
                .append("\n");
        sb.append("    defaultStoragePolicyStripeNum: ")
                .append(toIndentedString(defaultStoragePolicyStripeNum))
                .append("\n");
        sb.append("    defaultStoragePolicyStripeNumGt: ")
                .append(toIndentedString(defaultStoragePolicyStripeNumGt))
                .append("\n");
        sb.append("    defaultStoragePolicyStripeNumGte: ")
                .append(toIndentedString(defaultStoragePolicyStripeNumGte))
                .append("\n");
        sb.append("    defaultStoragePolicyStripeNumIn: ")
                .append(toIndentedString(defaultStoragePolicyStripeNumIn))
                .append("\n");
        sb.append("    defaultStoragePolicyStripeNumLt: ")
                .append(toIndentedString(defaultStoragePolicyStripeNumLt))
                .append("\n");
        sb.append("    defaultStoragePolicyStripeNumLte: ")
                .append(toIndentedString(defaultStoragePolicyStripeNumLte))
                .append("\n");
        sb.append("    defaultStoragePolicyStripeNumNot: ")
                .append(toIndentedString(defaultStoragePolicyStripeNumNot))
                .append("\n");
        sb.append("    defaultStoragePolicyStripeNumNotIn: ")
                .append(toIndentedString(defaultStoragePolicyStripeNumNotIn))
                .append("\n");
        sb.append("    defaultStoragePolicyThinProvision: ")
                .append(toIndentedString(defaultStoragePolicyThinProvision))
                .append("\n");
        sb.append("    defaultStoragePolicyThinProvisionNot: ")
                .append(toIndentedString(defaultStoragePolicyThinProvisionNot))
                .append("\n");
        sb.append("    enabledIscsi: ").append(toIndentedString(enabledIscsi)).append("\n");
        sb.append("    enabledIscsiNot: ").append(toIndentedString(enabledIscsiNot)).append("\n");
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

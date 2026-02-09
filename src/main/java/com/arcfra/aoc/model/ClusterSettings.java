package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Arrays;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** ClusterSettings */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class ClusterSettings extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_CLUSTER = "cluster";

    @SerializedName(SERIALIZED_NAME_CLUSTER)
    private NestedCluster cluster;

    public static final String SERIALIZED_NAME_DEFAULT_HA = "default_ha";

    @SerializedName(SERIALIZED_NAME_DEFAULT_HA)
    private Boolean defaultHa;

    public static final String SERIALIZED_NAME_DEFAULT_STORAGE_POLICY = "default_storage_policy";

    @SerializedName(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY)
    private VmVolumeElfStoragePolicyType defaultStoragePolicy;

    public static final String SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_K =
            "default_storage_policy_ec_k";

    @SerializedName(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_K)
    private Integer defaultStoragePolicyEcK;

    public static final String SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_M =
            "default_storage_policy_ec_m";

    @SerializedName(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_M)
    private Integer defaultStoragePolicyEcM;

    public static final String SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_REPLICA_NUM =
            "default_storage_policy_replica_num";

    @SerializedName(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_REPLICA_NUM)
    private Integer defaultStoragePolicyReplicaNum;

    public static final String SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_STRIPE_NUM =
            "default_storage_policy_stripe_num";

    @SerializedName(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_STRIPE_NUM)
    private Integer defaultStoragePolicyStripeNum;

    public static final String SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_THIN_PROVISION =
            "default_storage_policy_thin_provision";

    @SerializedName(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_THIN_PROVISION)
    private Boolean defaultStoragePolicyThinProvision;

    public static final String SERIALIZED_NAME_ENABLED_ISCSI = "enabled_iscsi";

    @SerializedName(SERIALIZED_NAME_ENABLED_ISCSI)
    private Boolean enabledIscsi;

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

    public static final String SERIALIZED_NAME_VM_RECYCLE_BIN = "vm_recycle_bin";

    @SerializedName(SERIALIZED_NAME_VM_RECYCLE_BIN)
    private NestedVmRecycleBin vmRecycleBin;

    public ClusterSettings() {}

    public ClusterSettings cluster(NestedCluster cluster) {

        this.cluster = cluster;
        return this;
    }

    /**
     * Get cluster
     *
     * @return cluster
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public NestedCluster getCluster() {
        return cluster;
    }

    public void setCluster(NestedCluster cluster) {
        this.cluster = cluster;
    }

    public ClusterSettings cluster_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER);
        return this;
    }

    public ClusterSettings cluster_ExplictlyNonNull() {
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

    public ClusterSettings defaultHa(Boolean defaultHa) {

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

    public ClusterSettings defaultHa_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEFAULT_HA);
        return this;
    }

    public ClusterSettings defaultHa_ExplictlyNonNull() {
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

    public ClusterSettings defaultStoragePolicy(VmVolumeElfStoragePolicyType defaultStoragePolicy) {

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

    public ClusterSettings defaultStoragePolicy_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY);
        return this;
    }

    public ClusterSettings defaultStoragePolicy_ExplictlyNonNull() {
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

    public ClusterSettings defaultStoragePolicyEcK(Integer defaultStoragePolicyEcK) {

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

    public ClusterSettings defaultStoragePolicyEcK_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_K);
        return this;
    }

    public ClusterSettings defaultStoragePolicyEcK_ExplictlyNonNull() {
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

    public ClusterSettings defaultStoragePolicyEcM(Integer defaultStoragePolicyEcM) {

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

    public ClusterSettings defaultStoragePolicyEcM_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_EC_M);
        return this;
    }

    public ClusterSettings defaultStoragePolicyEcM_ExplictlyNonNull() {
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

    public ClusterSettings defaultStoragePolicyReplicaNum(Integer defaultStoragePolicyReplicaNum) {

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

    public ClusterSettings defaultStoragePolicyReplicaNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_REPLICA_NUM);
        return this;
    }

    public ClusterSettings defaultStoragePolicyReplicaNum_ExplictlyNonNull() {
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

    public ClusterSettings defaultStoragePolicyStripeNum(Integer defaultStoragePolicyStripeNum) {

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

    public ClusterSettings defaultStoragePolicyStripeNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_STRIPE_NUM);
        return this;
    }

    public ClusterSettings defaultStoragePolicyStripeNum_ExplictlyNonNull() {
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

    public ClusterSettings defaultStoragePolicyThinProvision(
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

    public ClusterSettings defaultStoragePolicyThinProvision_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEFAULT_STORAGE_POLICY_THIN_PROVISION);
        return this;
    }

    public ClusterSettings defaultStoragePolicyThinProvision_ExplictlyNonNull() {
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

    public ClusterSettings enabledIscsi(Boolean enabledIscsi) {

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

    public ClusterSettings enabledIscsi_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENABLED_ISCSI);
        return this;
    }

    public ClusterSettings enabledIscsi_ExplictlyNonNull() {
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

    public ClusterSettings id(String id) {

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

    public ClusterSettings id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public ClusterSettings id_ExplictlyNonNull() {
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

    public ClusterSettings vmRecycleBin(NestedVmRecycleBin vmRecycleBin) {

        this.vmRecycleBin = vmRecycleBin;
        return this;
    }

    /**
     * Get vmRecycleBin
     *
     * @return vmRecycleBin
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NestedVmRecycleBin getVmRecycleBin() {
        return vmRecycleBin;
    }

    public void setVmRecycleBin(NestedVmRecycleBin vmRecycleBin) {
        this.vmRecycleBin = vmRecycleBin;
    }

    public ClusterSettings vmRecycleBin_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_RECYCLE_BIN);
        return this;
    }

    public ClusterSettings vmRecycleBin_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_RECYCLE_BIN);
        return this;
    }

    public void setVmRecycleBin_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_RECYCLE_BIN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_RECYCLE_BIN);
        }
    }

    public boolean getVmRecycleBin_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_RECYCLE_BIN);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ClusterSettings clusterSettings = (ClusterSettings) o;
        return Objects.equals(this.cluster, clusterSettings.cluster)
                && Objects.equals(this.defaultHa, clusterSettings.defaultHa)
                && Objects.equals(this.defaultStoragePolicy, clusterSettings.defaultStoragePolicy)
                && Objects.equals(
                        this.defaultStoragePolicyEcK, clusterSettings.defaultStoragePolicyEcK)
                && Objects.equals(
                        this.defaultStoragePolicyEcM, clusterSettings.defaultStoragePolicyEcM)
                && Objects.equals(
                        this.defaultStoragePolicyReplicaNum,
                        clusterSettings.defaultStoragePolicyReplicaNum)
                && Objects.equals(
                        this.defaultStoragePolicyStripeNum,
                        clusterSettings.defaultStoragePolicyStripeNum)
                && Objects.equals(
                        this.defaultStoragePolicyThinProvision,
                        clusterSettings.defaultStoragePolicyThinProvision)
                && Objects.equals(this.enabledIscsi, clusterSettings.enabledIscsi)
                && Objects.equals(this.id, clusterSettings.id)
                && Objects.equals(this.vmRecycleBin, clusterSettings.vmRecycleBin);
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
                cluster,
                defaultHa,
                defaultStoragePolicy,
                defaultStoragePolicyEcK,
                defaultStoragePolicyEcM,
                defaultStoragePolicyReplicaNum,
                defaultStoragePolicyStripeNum,
                defaultStoragePolicyThinProvision,
                enabledIscsi,
                id,
                vmRecycleBin);
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
        sb.append("class ClusterSettings {\n");
        sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
        sb.append("    defaultHa: ").append(toIndentedString(defaultHa)).append("\n");
        sb.append("    defaultStoragePolicy: ")
                .append(toIndentedString(defaultStoragePolicy))
                .append("\n");
        sb.append("    defaultStoragePolicyEcK: ")
                .append(toIndentedString(defaultStoragePolicyEcK))
                .append("\n");
        sb.append("    defaultStoragePolicyEcM: ")
                .append(toIndentedString(defaultStoragePolicyEcM))
                .append("\n");
        sb.append("    defaultStoragePolicyReplicaNum: ")
                .append(toIndentedString(defaultStoragePolicyReplicaNum))
                .append("\n");
        sb.append("    defaultStoragePolicyStripeNum: ")
                .append(toIndentedString(defaultStoragePolicyStripeNum))
                .append("\n");
        sb.append("    defaultStoragePolicyThinProvision: ")
                .append(toIndentedString(defaultStoragePolicyThinProvision))
                .append("\n");
        sb.append("    enabledIscsi: ").append(toIndentedString(enabledIscsi)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    vmRecycleBin: ").append(toIndentedString(vmRecycleBin)).append("\n");
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

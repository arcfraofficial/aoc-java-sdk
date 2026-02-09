package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** NvmfSubsystem */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class NvmfSubsystem extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_BPS = "bps";

    @SerializedName(SERIALIZED_NAME_BPS)
    private Long bps;

    public static final String SERIALIZED_NAME_BPS_MAX = "bps_max";

    @SerializedName(SERIALIZED_NAME_BPS_MAX)
    private Long bpsMax;

    public static final String SERIALIZED_NAME_BPS_MAX_LENGTH = "bps_max_length";

    @SerializedName(SERIALIZED_NAME_BPS_MAX_LENGTH)
    private Long bpsMaxLength;

    public static final String SERIALIZED_NAME_BPS_RD = "bps_rd";

    @SerializedName(SERIALIZED_NAME_BPS_RD)
    private Long bpsRd;

    public static final String SERIALIZED_NAME_BPS_RD_MAX = "bps_rd_max";

    @SerializedName(SERIALIZED_NAME_BPS_RD_MAX)
    private Long bpsRdMax;

    public static final String SERIALIZED_NAME_BPS_RD_MAX_LENGTH = "bps_rd_max_length";

    @SerializedName(SERIALIZED_NAME_BPS_RD_MAX_LENGTH)
    private Long bpsRdMaxLength;

    public static final String SERIALIZED_NAME_BPS_WR = "bps_wr";

    @SerializedName(SERIALIZED_NAME_BPS_WR)
    private Long bpsWr;

    public static final String SERIALIZED_NAME_BPS_WR_MAX = "bps_wr_max";

    @SerializedName(SERIALIZED_NAME_BPS_WR_MAX)
    private Long bpsWrMax;

    public static final String SERIALIZED_NAME_BPS_WR_MAX_LENGTH = "bps_wr_max_length";

    @SerializedName(SERIALIZED_NAME_BPS_WR_MAX_LENGTH)
    private Long bpsWrMaxLength;

    public static final String SERIALIZED_NAME_BUSINESS_HOST_GROUPS = "business_host_groups";

    @SerializedName(SERIALIZED_NAME_BUSINESS_HOST_GROUPS)
    private List<NestedBusinessHostGroup> businessHostGroups = null;

    public static final String SERIALIZED_NAME_BUSINESS_HOSTS = "business_hosts";

    @SerializedName(SERIALIZED_NAME_BUSINESS_HOSTS)
    private List<NestedBusinessHost> businessHosts = null;

    public static final String SERIALIZED_NAME_CLUSTER = "cluster";

    @SerializedName(SERIALIZED_NAME_CLUSTER)
    private NestedCluster cluster;

    public static final String SERIALIZED_NAME_CONFIGURATION_ADAPTIVE = "configuration_adaptive";

    @SerializedName(SERIALIZED_NAME_CONFIGURATION_ADAPTIVE)
    private Boolean configurationAdaptive;

    public static final String SERIALIZED_NAME_CONFIGURATION_METHOD = "configuration_method";

    @SerializedName(SERIALIZED_NAME_CONFIGURATION_METHOD)
    private ConfigurationMethod configurationMethod;

    public static final String SERIALIZED_NAME_DESCRIPTION = "description";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION)
    private String description;

    public static final String SERIALIZED_NAME_EC_K = "ec_k";

    @SerializedName(SERIALIZED_NAME_EC_K)
    private Integer ecK;

    public static final String SERIALIZED_NAME_EC_M = "ec_m";

    @SerializedName(SERIALIZED_NAME_EC_M)
    private Integer ecM;

    public static final String SERIALIZED_NAME_ENCRYPT_METHOD = "encrypt_method";

    @SerializedName(SERIALIZED_NAME_ENCRYPT_METHOD)
    private EncryptMethod encryptMethod;

    public static final String SERIALIZED_NAME_ENTITY_ASYNC_STATUS = "entityAsyncStatus";

    @SerializedName(SERIALIZED_NAME_ENTITY_ASYNC_STATUS)
    private EntityAsyncStatus entityAsyncStatus;

    public static final String SERIALIZED_NAME_EXTERNAL_USE = "external_use";

    @SerializedName(SERIALIZED_NAME_EXTERNAL_USE)
    private Boolean externalUse;

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

    public static final String SERIALIZED_NAME_INTERNAL = "internal";

    @SerializedName(SERIALIZED_NAME_INTERNAL)
    private Boolean internal;

    public static final String SERIALIZED_NAME_IO_SIZE = "io_size";

    @SerializedName(SERIALIZED_NAME_IO_SIZE)
    private Long ioSize;

    public static final String SERIALIZED_NAME_IOPS = "iops";

    @SerializedName(SERIALIZED_NAME_IOPS)
    private Long iops;

    public static final String SERIALIZED_NAME_IOPS_MAX = "iops_max";

    @SerializedName(SERIALIZED_NAME_IOPS_MAX)
    private Long iopsMax;

    public static final String SERIALIZED_NAME_IOPS_MAX_LENGTH = "iops_max_length";

    @SerializedName(SERIALIZED_NAME_IOPS_MAX_LENGTH)
    private Long iopsMaxLength;

    public static final String SERIALIZED_NAME_IOPS_RD = "iops_rd";

    @SerializedName(SERIALIZED_NAME_IOPS_RD)
    private Long iopsRd;

    public static final String SERIALIZED_NAME_IOPS_RD_MAX = "iops_rd_max";

    @SerializedName(SERIALIZED_NAME_IOPS_RD_MAX)
    private Long iopsRdMax;

    public static final String SERIALIZED_NAME_IOPS_RD_MAX_LENGTH = "iops_rd_max_length";

    @SerializedName(SERIALIZED_NAME_IOPS_RD_MAX_LENGTH)
    private Long iopsRdMaxLength;

    public static final String SERIALIZED_NAME_IOPS_WR = "iops_wr";

    @SerializedName(SERIALIZED_NAME_IOPS_WR)
    private Long iopsWr;

    public static final String SERIALIZED_NAME_IOPS_WR_MAX = "iops_wr_max";

    @SerializedName(SERIALIZED_NAME_IOPS_WR_MAX)
    private Long iopsWrMax;

    public static final String SERIALIZED_NAME_IOPS_WR_MAX_LENGTH = "iops_wr_max_length";

    @SerializedName(SERIALIZED_NAME_IOPS_WR_MAX_LENGTH)
    private Long iopsWrMaxLength;

    public static final String SERIALIZED_NAME_IP_WHITELIST = "ip_whitelist";

    @SerializedName(SERIALIZED_NAME_IP_WHITELIST)
    private String ipWhitelist;

    public static final String SERIALIZED_NAME_ISCSI_CONNECTIONS = "iscsi_connections";

    @SerializedName(SERIALIZED_NAME_ISCSI_CONNECTIONS)
    private List<NestedIscsiConnection> iscsiConnections = null;

    public static final String SERIALIZED_NAME_LABELS = "labels";

    @SerializedName(SERIALIZED_NAME_LABELS)
    private List<NestedLabel> labels = null;

    public static final String SERIALIZED_NAME_LOCAL_ID = "local_id";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID)
    private String localId;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_NAMESPACE_GROUPS = "namespace_groups";

    @SerializedName(SERIALIZED_NAME_NAMESPACE_GROUPS)
    private List<NestedNamespaceGroup> namespaceGroups = null;

    public static final String SERIALIZED_NAME_NAMESPACES = "namespaces";

    @SerializedName(SERIALIZED_NAME_NAMESPACES)
    private List<NestedNvmfNamespace> namespaces = null;

    public static final String SERIALIZED_NAME_NQN_NAME = "nqn_name";

    @SerializedName(SERIALIZED_NAME_NQN_NAME)
    private String nqnName;

    public static final String SERIALIZED_NAME_NQN_WHITELIST = "nqn_whitelist";

    @SerializedName(SERIALIZED_NAME_NQN_WHITELIST)
    private String nqnWhitelist;

    public static final String SERIALIZED_NAME_NVMF_NAMESPACES_NUM = "nvmf_namespaces_num";

    @SerializedName(SERIALIZED_NAME_NVMF_NAMESPACES_NUM)
    private Integer nvmfNamespacesNum;

    public static final String SERIALIZED_NAME_POLICY = "policy";

    @SerializedName(SERIALIZED_NAME_POLICY)
    private NvmfSubsystemPolicyType policy;

    public static final String SERIALIZED_NAME_PRIORITIZED = "prioritized";

    @SerializedName(SERIALIZED_NAME_PRIORITIZED)
    private Boolean prioritized;

    public static final String SERIALIZED_NAME_REPLICA_NUM = "replica_num";

    @SerializedName(SERIALIZED_NAME_REPLICA_NUM)
    private Integer replicaNum;

    public static final String SERIALIZED_NAME_RESILIENCY_TYPE = "resiliency_type";

    @SerializedName(SERIALIZED_NAME_RESILIENCY_TYPE)
    private ResiliencyType resiliencyType;

    public static final String SERIALIZED_NAME_STRIPE_NUM = "stripe_num";

    @SerializedName(SERIALIZED_NAME_STRIPE_NUM)
    private Integer stripeNum;

    public static final String SERIALIZED_NAME_STRIPE_SIZE = "stripe_size";

    @SerializedName(SERIALIZED_NAME_STRIPE_SIZE)
    private Long stripeSize;

    public static final String SERIALIZED_NAME_THIN_PROVISION = "thin_provision";

    @SerializedName(SERIALIZED_NAME_THIN_PROVISION)
    private Boolean thinProvision;

    public NvmfSubsystem() {}

    public NvmfSubsystem bps(Long bps) {

        this.bps = bps;
        return this;
    }

    /**
     * Get bps
     *
     * @return bps
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getBps() {
        return bps;
    }

    public void setBps(Long bps) {
        this.bps = bps;
    }

    public NvmfSubsystem bps_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS);
        return this;
    }

    public NvmfSubsystem bps_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BPS);
        return this;
    }

    public void setBps_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BPS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BPS);
        }
    }

    public boolean getBps_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BPS);
    }

    public NvmfSubsystem bpsMax(Long bpsMax) {

        this.bpsMax = bpsMax;
        return this;
    }

    /**
     * Get bpsMax
     *
     * @return bpsMax
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getBpsMax() {
        return bpsMax;
    }

    public void setBpsMax(Long bpsMax) {
        this.bpsMax = bpsMax;
    }

    public NvmfSubsystem bpsMax_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_MAX);
        return this;
    }

    public NvmfSubsystem bpsMax_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BPS_MAX);
        return this;
    }

    public void setBpsMax_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BPS_MAX);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BPS_MAX);
        }
    }

    public boolean getBpsMax_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BPS_MAX);
    }

    public NvmfSubsystem bpsMaxLength(Long bpsMaxLength) {

        this.bpsMaxLength = bpsMaxLength;
        return this;
    }

    /**
     * Get bpsMaxLength
     *
     * @return bpsMaxLength
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getBpsMaxLength() {
        return bpsMaxLength;
    }

    public void setBpsMaxLength(Long bpsMaxLength) {
        this.bpsMaxLength = bpsMaxLength;
    }

    public NvmfSubsystem bpsMaxLength_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_MAX_LENGTH);
        return this;
    }

    public NvmfSubsystem bpsMaxLength_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BPS_MAX_LENGTH);
        return this;
    }

    public void setBpsMaxLength_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BPS_MAX_LENGTH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BPS_MAX_LENGTH);
        }
    }

    public boolean getBpsMaxLength_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BPS_MAX_LENGTH);
    }

    public NvmfSubsystem bpsRd(Long bpsRd) {

        this.bpsRd = bpsRd;
        return this;
    }

    /**
     * Get bpsRd
     *
     * @return bpsRd
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getBpsRd() {
        return bpsRd;
    }

    public void setBpsRd(Long bpsRd) {
        this.bpsRd = bpsRd;
    }

    public NvmfSubsystem bpsRd_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_RD);
        return this;
    }

    public NvmfSubsystem bpsRd_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BPS_RD);
        return this;
    }

    public void setBpsRd_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BPS_RD);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BPS_RD);
        }
    }

    public boolean getBpsRd_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BPS_RD);
    }

    public NvmfSubsystem bpsRdMax(Long bpsRdMax) {

        this.bpsRdMax = bpsRdMax;
        return this;
    }

    /**
     * Get bpsRdMax
     *
     * @return bpsRdMax
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getBpsRdMax() {
        return bpsRdMax;
    }

    public void setBpsRdMax(Long bpsRdMax) {
        this.bpsRdMax = bpsRdMax;
    }

    public NvmfSubsystem bpsRdMax_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_RD_MAX);
        return this;
    }

    public NvmfSubsystem bpsRdMax_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BPS_RD_MAX);
        return this;
    }

    public void setBpsRdMax_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BPS_RD_MAX);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BPS_RD_MAX);
        }
    }

    public boolean getBpsRdMax_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BPS_RD_MAX);
    }

    public NvmfSubsystem bpsRdMaxLength(Long bpsRdMaxLength) {

        this.bpsRdMaxLength = bpsRdMaxLength;
        return this;
    }

    /**
     * Get bpsRdMaxLength
     *
     * @return bpsRdMaxLength
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getBpsRdMaxLength() {
        return bpsRdMaxLength;
    }

    public void setBpsRdMaxLength(Long bpsRdMaxLength) {
        this.bpsRdMaxLength = bpsRdMaxLength;
    }

    public NvmfSubsystem bpsRdMaxLength_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_RD_MAX_LENGTH);
        return this;
    }

    public NvmfSubsystem bpsRdMaxLength_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BPS_RD_MAX_LENGTH);
        return this;
    }

    public void setBpsRdMaxLength_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BPS_RD_MAX_LENGTH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BPS_RD_MAX_LENGTH);
        }
    }

    public boolean getBpsRdMaxLength_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BPS_RD_MAX_LENGTH);
    }

    public NvmfSubsystem bpsWr(Long bpsWr) {

        this.bpsWr = bpsWr;
        return this;
    }

    /**
     * Get bpsWr
     *
     * @return bpsWr
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getBpsWr() {
        return bpsWr;
    }

    public void setBpsWr(Long bpsWr) {
        this.bpsWr = bpsWr;
    }

    public NvmfSubsystem bpsWr_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_WR);
        return this;
    }

    public NvmfSubsystem bpsWr_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BPS_WR);
        return this;
    }

    public void setBpsWr_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BPS_WR);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BPS_WR);
        }
    }

    public boolean getBpsWr_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BPS_WR);
    }

    public NvmfSubsystem bpsWrMax(Long bpsWrMax) {

        this.bpsWrMax = bpsWrMax;
        return this;
    }

    /**
     * Get bpsWrMax
     *
     * @return bpsWrMax
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getBpsWrMax() {
        return bpsWrMax;
    }

    public void setBpsWrMax(Long bpsWrMax) {
        this.bpsWrMax = bpsWrMax;
    }

    public NvmfSubsystem bpsWrMax_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_WR_MAX);
        return this;
    }

    public NvmfSubsystem bpsWrMax_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BPS_WR_MAX);
        return this;
    }

    public void setBpsWrMax_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BPS_WR_MAX);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BPS_WR_MAX);
        }
    }

    public boolean getBpsWrMax_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BPS_WR_MAX);
    }

    public NvmfSubsystem bpsWrMaxLength(Long bpsWrMaxLength) {

        this.bpsWrMaxLength = bpsWrMaxLength;
        return this;
    }

    /**
     * Get bpsWrMaxLength
     *
     * @return bpsWrMaxLength
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getBpsWrMaxLength() {
        return bpsWrMaxLength;
    }

    public void setBpsWrMaxLength(Long bpsWrMaxLength) {
        this.bpsWrMaxLength = bpsWrMaxLength;
    }

    public NvmfSubsystem bpsWrMaxLength_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_WR_MAX_LENGTH);
        return this;
    }

    public NvmfSubsystem bpsWrMaxLength_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BPS_WR_MAX_LENGTH);
        return this;
    }

    public void setBpsWrMaxLength_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BPS_WR_MAX_LENGTH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BPS_WR_MAX_LENGTH);
        }
    }

    public boolean getBpsWrMaxLength_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BPS_WR_MAX_LENGTH);
    }

    public NvmfSubsystem businessHostGroups(List<NestedBusinessHostGroup> businessHostGroups) {

        this.businessHostGroups = businessHostGroups;
        return this;
    }

    public NvmfSubsystem addBusinessHostGroupsItem(NestedBusinessHostGroup businessHostGroupsItem) {
        if (this.businessHostGroups == null) {
            this.businessHostGroups = new ArrayList<NestedBusinessHostGroup>();
        }
        this.businessHostGroups.add(businessHostGroupsItem);
        return this;
    }

    /**
     * Get businessHostGroups
     *
     * @return businessHostGroups
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedBusinessHostGroup> getBusinessHostGroups() {
        return businessHostGroups;
    }

    public void setBusinessHostGroups(List<NestedBusinessHostGroup> businessHostGroups) {
        this.businessHostGroups = businessHostGroups;
    }

    public NvmfSubsystem businessHostGroups_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BUSINESS_HOST_GROUPS);
        return this;
    }

    public NvmfSubsystem businessHostGroups_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BUSINESS_HOST_GROUPS);
        return this;
    }

    public void setBusinessHostGroups_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BUSINESS_HOST_GROUPS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BUSINESS_HOST_GROUPS);
        }
    }

    public boolean getBusinessHostGroups_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BUSINESS_HOST_GROUPS);
    }

    public NvmfSubsystem businessHosts(List<NestedBusinessHost> businessHosts) {

        this.businessHosts = businessHosts;
        return this;
    }

    public NvmfSubsystem addBusinessHostsItem(NestedBusinessHost businessHostsItem) {
        if (this.businessHosts == null) {
            this.businessHosts = new ArrayList<NestedBusinessHost>();
        }
        this.businessHosts.add(businessHostsItem);
        return this;
    }

    /**
     * Get businessHosts
     *
     * @return businessHosts
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedBusinessHost> getBusinessHosts() {
        return businessHosts;
    }

    public void setBusinessHosts(List<NestedBusinessHost> businessHosts) {
        this.businessHosts = businessHosts;
    }

    public NvmfSubsystem businessHosts_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BUSINESS_HOSTS);
        return this;
    }

    public NvmfSubsystem businessHosts_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BUSINESS_HOSTS);
        return this;
    }

    public void setBusinessHosts_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BUSINESS_HOSTS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BUSINESS_HOSTS);
        }
    }

    public boolean getBusinessHosts_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BUSINESS_HOSTS);
    }

    public NvmfSubsystem cluster(NestedCluster cluster) {

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

    public NvmfSubsystem cluster_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER);
        return this;
    }

    public NvmfSubsystem cluster_ExplictlyNonNull() {
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

    public NvmfSubsystem configurationAdaptive(Boolean configurationAdaptive) {

        this.configurationAdaptive = configurationAdaptive;
        return this;
    }

    /**
     * Get configurationAdaptive
     *
     * @return configurationAdaptive
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getConfigurationAdaptive() {
        return configurationAdaptive;
    }

    public void setConfigurationAdaptive(Boolean configurationAdaptive) {
        this.configurationAdaptive = configurationAdaptive;
    }

    public NvmfSubsystem configurationAdaptive_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CONFIGURATION_ADAPTIVE);
        return this;
    }

    public NvmfSubsystem configurationAdaptive_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CONFIGURATION_ADAPTIVE);
        return this;
    }

    public void setConfigurationAdaptive_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CONFIGURATION_ADAPTIVE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CONFIGURATION_ADAPTIVE);
        }
    }

    public boolean getConfigurationAdaptive_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CONFIGURATION_ADAPTIVE);
    }

    public NvmfSubsystem configurationMethod(ConfigurationMethod configurationMethod) {

        this.configurationMethod = configurationMethod;
        return this;
    }

    /**
     * Get configurationMethod
     *
     * @return configurationMethod
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ConfigurationMethod getConfigurationMethod() {
        return configurationMethod;
    }

    public void setConfigurationMethod(ConfigurationMethod configurationMethod) {
        this.configurationMethod = configurationMethod;
    }

    public NvmfSubsystem configurationMethod_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CONFIGURATION_METHOD);
        return this;
    }

    public NvmfSubsystem configurationMethod_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CONFIGURATION_METHOD);
        return this;
    }

    public void setConfigurationMethod_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CONFIGURATION_METHOD);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CONFIGURATION_METHOD);
        }
    }

    public boolean getConfigurationMethod_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CONFIGURATION_METHOD);
    }

    public NvmfSubsystem description(String description) {

        this.description = description;
        return this;
    }

    /**
     * Get description
     *
     * @return description
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public NvmfSubsystem description_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION);
        return this;
    }

    public NvmfSubsystem description_ExplictlyNonNull() {
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

    public NvmfSubsystem ecK(Integer ecK) {

        this.ecK = ecK;
        return this;
    }

    /**
     * Get ecK
     *
     * @return ecK
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getEcK() {
        return ecK;
    }

    public void setEcK(Integer ecK) {
        this.ecK = ecK;
    }

    public NvmfSubsystem ecK_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EC_K);
        return this;
    }

    public NvmfSubsystem ecK_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EC_K);
        return this;
    }

    public void setEcK_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EC_K);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EC_K);
        }
    }

    public boolean getEcK_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EC_K);
    }

    public NvmfSubsystem ecM(Integer ecM) {

        this.ecM = ecM;
        return this;
    }

    /**
     * Get ecM
     *
     * @return ecM
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getEcM() {
        return ecM;
    }

    public void setEcM(Integer ecM) {
        this.ecM = ecM;
    }

    public NvmfSubsystem ecM_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EC_M);
        return this;
    }

    public NvmfSubsystem ecM_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EC_M);
        return this;
    }

    public void setEcM_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EC_M);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EC_M);
        }
    }

    public boolean getEcM_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EC_M);
    }

    public NvmfSubsystem encryptMethod(EncryptMethod encryptMethod) {

        this.encryptMethod = encryptMethod;
        return this;
    }

    /**
     * Get encryptMethod
     *
     * @return encryptMethod
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public EncryptMethod getEncryptMethod() {
        return encryptMethod;
    }

    public void setEncryptMethod(EncryptMethod encryptMethod) {
        this.encryptMethod = encryptMethod;
    }

    public NvmfSubsystem encryptMethod_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENCRYPT_METHOD);
        return this;
    }

    public NvmfSubsystem encryptMethod_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ENCRYPT_METHOD);
        return this;
    }

    public void setEncryptMethod_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ENCRYPT_METHOD);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ENCRYPT_METHOD);
        }
    }

    public boolean getEncryptMethod_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ENCRYPT_METHOD);
    }

    public NvmfSubsystem entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {

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

    public NvmfSubsystem entityAsyncStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        return this;
    }

    public NvmfSubsystem entityAsyncStatus_ExplictlyNonNull() {
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

    public NvmfSubsystem externalUse(Boolean externalUse) {

        this.externalUse = externalUse;
        return this;
    }

    /**
     * Get externalUse
     *
     * @return externalUse
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Boolean getExternalUse() {
        return externalUse;
    }

    public void setExternalUse(Boolean externalUse) {
        this.externalUse = externalUse;
    }

    public NvmfSubsystem externalUse_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXTERNAL_USE);
        return this;
    }

    public NvmfSubsystem externalUse_ExplictlyNonNull() {
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

    public NvmfSubsystem id(String id) {

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

    public NvmfSubsystem id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public NvmfSubsystem id_ExplictlyNonNull() {
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

    public NvmfSubsystem internal(Boolean internal) {

        this.internal = internal;
        return this;
    }

    /**
     * Get internal
     *
     * @return internal
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Boolean getInternal() {
        return internal;
    }

    public void setInternal(Boolean internal) {
        this.internal = internal;
    }

    public NvmfSubsystem internal_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INTERNAL);
        return this;
    }

    public NvmfSubsystem internal_ExplictlyNonNull() {
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

    public NvmfSubsystem ioSize(Long ioSize) {

        this.ioSize = ioSize;
        return this;
    }

    /**
     * Get ioSize
     *
     * @return ioSize
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getIoSize() {
        return ioSize;
    }

    public void setIoSize(Long ioSize) {
        this.ioSize = ioSize;
    }

    public NvmfSubsystem ioSize_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IO_SIZE);
        return this;
    }

    public NvmfSubsystem ioSize_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IO_SIZE);
        return this;
    }

    public void setIoSize_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IO_SIZE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IO_SIZE);
        }
    }

    public boolean getIoSize_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IO_SIZE);
    }

    public NvmfSubsystem iops(Long iops) {

        this.iops = iops;
        return this;
    }

    /**
     * Get iops
     *
     * @return iops
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getIops() {
        return iops;
    }

    public void setIops(Long iops) {
        this.iops = iops;
    }

    public NvmfSubsystem iops_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IOPS);
        return this;
    }

    public NvmfSubsystem iops_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IOPS);
        return this;
    }

    public void setIops_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IOPS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IOPS);
        }
    }

    public boolean getIops_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IOPS);
    }

    public NvmfSubsystem iopsMax(Long iopsMax) {

        this.iopsMax = iopsMax;
        return this;
    }

    /**
     * Get iopsMax
     *
     * @return iopsMax
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getIopsMax() {
        return iopsMax;
    }

    public void setIopsMax(Long iopsMax) {
        this.iopsMax = iopsMax;
    }

    public NvmfSubsystem iopsMax_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IOPS_MAX);
        return this;
    }

    public NvmfSubsystem iopsMax_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IOPS_MAX);
        return this;
    }

    public void setIopsMax_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IOPS_MAX);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IOPS_MAX);
        }
    }

    public boolean getIopsMax_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IOPS_MAX);
    }

    public NvmfSubsystem iopsMaxLength(Long iopsMaxLength) {

        this.iopsMaxLength = iopsMaxLength;
        return this;
    }

    /**
     * Get iopsMaxLength
     *
     * @return iopsMaxLength
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getIopsMaxLength() {
        return iopsMaxLength;
    }

    public void setIopsMaxLength(Long iopsMaxLength) {
        this.iopsMaxLength = iopsMaxLength;
    }

    public NvmfSubsystem iopsMaxLength_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IOPS_MAX_LENGTH);
        return this;
    }

    public NvmfSubsystem iopsMaxLength_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IOPS_MAX_LENGTH);
        return this;
    }

    public void setIopsMaxLength_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IOPS_MAX_LENGTH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IOPS_MAX_LENGTH);
        }
    }

    public boolean getIopsMaxLength_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IOPS_MAX_LENGTH);
    }

    public NvmfSubsystem iopsRd(Long iopsRd) {

        this.iopsRd = iopsRd;
        return this;
    }

    /**
     * Get iopsRd
     *
     * @return iopsRd
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getIopsRd() {
        return iopsRd;
    }

    public void setIopsRd(Long iopsRd) {
        this.iopsRd = iopsRd;
    }

    public NvmfSubsystem iopsRd_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IOPS_RD);
        return this;
    }

    public NvmfSubsystem iopsRd_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IOPS_RD);
        return this;
    }

    public void setIopsRd_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IOPS_RD);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IOPS_RD);
        }
    }

    public boolean getIopsRd_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IOPS_RD);
    }

    public NvmfSubsystem iopsRdMax(Long iopsRdMax) {

        this.iopsRdMax = iopsRdMax;
        return this;
    }

    /**
     * Get iopsRdMax
     *
     * @return iopsRdMax
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getIopsRdMax() {
        return iopsRdMax;
    }

    public void setIopsRdMax(Long iopsRdMax) {
        this.iopsRdMax = iopsRdMax;
    }

    public NvmfSubsystem iopsRdMax_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IOPS_RD_MAX);
        return this;
    }

    public NvmfSubsystem iopsRdMax_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IOPS_RD_MAX);
        return this;
    }

    public void setIopsRdMax_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IOPS_RD_MAX);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IOPS_RD_MAX);
        }
    }

    public boolean getIopsRdMax_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IOPS_RD_MAX);
    }

    public NvmfSubsystem iopsRdMaxLength(Long iopsRdMaxLength) {

        this.iopsRdMaxLength = iopsRdMaxLength;
        return this;
    }

    /**
     * Get iopsRdMaxLength
     *
     * @return iopsRdMaxLength
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getIopsRdMaxLength() {
        return iopsRdMaxLength;
    }

    public void setIopsRdMaxLength(Long iopsRdMaxLength) {
        this.iopsRdMaxLength = iopsRdMaxLength;
    }

    public NvmfSubsystem iopsRdMaxLength_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IOPS_RD_MAX_LENGTH);
        return this;
    }

    public NvmfSubsystem iopsRdMaxLength_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IOPS_RD_MAX_LENGTH);
        return this;
    }

    public void setIopsRdMaxLength_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IOPS_RD_MAX_LENGTH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IOPS_RD_MAX_LENGTH);
        }
    }

    public boolean getIopsRdMaxLength_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IOPS_RD_MAX_LENGTH);
    }

    public NvmfSubsystem iopsWr(Long iopsWr) {

        this.iopsWr = iopsWr;
        return this;
    }

    /**
     * Get iopsWr
     *
     * @return iopsWr
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getIopsWr() {
        return iopsWr;
    }

    public void setIopsWr(Long iopsWr) {
        this.iopsWr = iopsWr;
    }

    public NvmfSubsystem iopsWr_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IOPS_WR);
        return this;
    }

    public NvmfSubsystem iopsWr_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IOPS_WR);
        return this;
    }

    public void setIopsWr_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IOPS_WR);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IOPS_WR);
        }
    }

    public boolean getIopsWr_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IOPS_WR);
    }

    public NvmfSubsystem iopsWrMax(Long iopsWrMax) {

        this.iopsWrMax = iopsWrMax;
        return this;
    }

    /**
     * Get iopsWrMax
     *
     * @return iopsWrMax
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getIopsWrMax() {
        return iopsWrMax;
    }

    public void setIopsWrMax(Long iopsWrMax) {
        this.iopsWrMax = iopsWrMax;
    }

    public NvmfSubsystem iopsWrMax_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IOPS_WR_MAX);
        return this;
    }

    public NvmfSubsystem iopsWrMax_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IOPS_WR_MAX);
        return this;
    }

    public void setIopsWrMax_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IOPS_WR_MAX);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IOPS_WR_MAX);
        }
    }

    public boolean getIopsWrMax_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IOPS_WR_MAX);
    }

    public NvmfSubsystem iopsWrMaxLength(Long iopsWrMaxLength) {

        this.iopsWrMaxLength = iopsWrMaxLength;
        return this;
    }

    /**
     * Get iopsWrMaxLength
     *
     * @return iopsWrMaxLength
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getIopsWrMaxLength() {
        return iopsWrMaxLength;
    }

    public void setIopsWrMaxLength(Long iopsWrMaxLength) {
        this.iopsWrMaxLength = iopsWrMaxLength;
    }

    public NvmfSubsystem iopsWrMaxLength_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IOPS_WR_MAX_LENGTH);
        return this;
    }

    public NvmfSubsystem iopsWrMaxLength_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IOPS_WR_MAX_LENGTH);
        return this;
    }

    public void setIopsWrMaxLength_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IOPS_WR_MAX_LENGTH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IOPS_WR_MAX_LENGTH);
        }
    }

    public boolean getIopsWrMaxLength_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IOPS_WR_MAX_LENGTH);
    }

    public NvmfSubsystem ipWhitelist(String ipWhitelist) {

        this.ipWhitelist = ipWhitelist;
        return this;
    }

    /**
     * Get ipWhitelist
     *
     * @return ipWhitelist
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getIpWhitelist() {
        return ipWhitelist;
    }

    public void setIpWhitelist(String ipWhitelist) {
        this.ipWhitelist = ipWhitelist;
    }

    public NvmfSubsystem ipWhitelist_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_WHITELIST);
        return this;
    }

    public NvmfSubsystem ipWhitelist_ExplictlyNonNull() {
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

    public NvmfSubsystem iscsiConnections(List<NestedIscsiConnection> iscsiConnections) {

        this.iscsiConnections = iscsiConnections;
        return this;
    }

    public NvmfSubsystem addIscsiConnectionsItem(NestedIscsiConnection iscsiConnectionsItem) {
        if (this.iscsiConnections == null) {
            this.iscsiConnections = new ArrayList<NestedIscsiConnection>();
        }
        this.iscsiConnections.add(iscsiConnectionsItem);
        return this;
    }

    /**
     * Get iscsiConnections
     *
     * @return iscsiConnections
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedIscsiConnection> getIscsiConnections() {
        return iscsiConnections;
    }

    public void setIscsiConnections(List<NestedIscsiConnection> iscsiConnections) {
        this.iscsiConnections = iscsiConnections;
    }

    public NvmfSubsystem iscsiConnections_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_CONNECTIONS);
        return this;
    }

    public NvmfSubsystem iscsiConnections_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_CONNECTIONS);
        return this;
    }

    public void setIscsiConnections_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_CONNECTIONS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_CONNECTIONS);
        }
    }

    public boolean getIscsiConnections_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_CONNECTIONS);
    }

    public NvmfSubsystem labels(List<NestedLabel> labels) {

        this.labels = labels;
        return this;
    }

    public NvmfSubsystem addLabelsItem(NestedLabel labelsItem) {
        if (this.labels == null) {
            this.labels = new ArrayList<NestedLabel>();
        }
        this.labels.add(labelsItem);
        return this;
    }

    /**
     * Get labels
     *
     * @return labels
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedLabel> getLabels() {
        return labels;
    }

    public void setLabels(List<NestedLabel> labels) {
        this.labels = labels;
    }

    public NvmfSubsystem labels_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LABELS);
        return this;
    }

    public NvmfSubsystem labels_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LABELS);
        return this;
    }

    public void setLabels_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LABELS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LABELS);
        }
    }

    public boolean getLabels_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LABELS);
    }

    public NvmfSubsystem localId(String localId) {

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

    public NvmfSubsystem localId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID);
        return this;
    }

    public NvmfSubsystem localId_ExplictlyNonNull() {
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

    public NvmfSubsystem name(String name) {

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

    public NvmfSubsystem name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public NvmfSubsystem name_ExplictlyNonNull() {
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

    public NvmfSubsystem namespaceGroups(List<NestedNamespaceGroup> namespaceGroups) {

        this.namespaceGroups = namespaceGroups;
        return this;
    }

    public NvmfSubsystem addNamespaceGroupsItem(NestedNamespaceGroup namespaceGroupsItem) {
        if (this.namespaceGroups == null) {
            this.namespaceGroups = new ArrayList<NestedNamespaceGroup>();
        }
        this.namespaceGroups.add(namespaceGroupsItem);
        return this;
    }

    /**
     * Get namespaceGroups
     *
     * @return namespaceGroups
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedNamespaceGroup> getNamespaceGroups() {
        return namespaceGroups;
    }

    public void setNamespaceGroups(List<NestedNamespaceGroup> namespaceGroups) {
        this.namespaceGroups = namespaceGroups;
    }

    public NvmfSubsystem namespaceGroups_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAMESPACE_GROUPS);
        return this;
    }

    public NvmfSubsystem namespaceGroups_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAMESPACE_GROUPS);
        return this;
    }

    public void setNamespaceGroups_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAMESPACE_GROUPS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAMESPACE_GROUPS);
        }
    }

    public boolean getNamespaceGroups_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAMESPACE_GROUPS);
    }

    public NvmfSubsystem namespaces(List<NestedNvmfNamespace> namespaces) {

        this.namespaces = namespaces;
        return this;
    }

    public NvmfSubsystem addNamespacesItem(NestedNvmfNamespace namespacesItem) {
        if (this.namespaces == null) {
            this.namespaces = new ArrayList<NestedNvmfNamespace>();
        }
        this.namespaces.add(namespacesItem);
        return this;
    }

    /**
     * Get namespaces
     *
     * @return namespaces
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedNvmfNamespace> getNamespaces() {
        return namespaces;
    }

    public void setNamespaces(List<NestedNvmfNamespace> namespaces) {
        this.namespaces = namespaces;
    }

    public NvmfSubsystem namespaces_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAMESPACES);
        return this;
    }

    public NvmfSubsystem namespaces_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAMESPACES);
        return this;
    }

    public void setNamespaces_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAMESPACES);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAMESPACES);
        }
    }

    public boolean getNamespaces_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAMESPACES);
    }

    public NvmfSubsystem nqnName(String nqnName) {

        this.nqnName = nqnName;
        return this;
    }

    /**
     * Get nqnName
     *
     * @return nqnName
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getNqnName() {
        return nqnName;
    }

    public void setNqnName(String nqnName) {
        this.nqnName = nqnName;
    }

    public NvmfSubsystem nqnName_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NQN_NAME);
        return this;
    }

    public NvmfSubsystem nqnName_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NQN_NAME);
        return this;
    }

    public void setNqnName_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NQN_NAME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NQN_NAME);
        }
    }

    public boolean getNqnName_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NQN_NAME);
    }

    public NvmfSubsystem nqnWhitelist(String nqnWhitelist) {

        this.nqnWhitelist = nqnWhitelist;
        return this;
    }

    /**
     * Get nqnWhitelist
     *
     * @return nqnWhitelist
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getNqnWhitelist() {
        return nqnWhitelist;
    }

    public void setNqnWhitelist(String nqnWhitelist) {
        this.nqnWhitelist = nqnWhitelist;
    }

    public NvmfSubsystem nqnWhitelist_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NQN_WHITELIST);
        return this;
    }

    public NvmfSubsystem nqnWhitelist_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NQN_WHITELIST);
        return this;
    }

    public void setNqnWhitelist_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NQN_WHITELIST);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NQN_WHITELIST);
        }
    }

    public boolean getNqnWhitelist_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NQN_WHITELIST);
    }

    public NvmfSubsystem nvmfNamespacesNum(Integer nvmfNamespacesNum) {

        this.nvmfNamespacesNum = nvmfNamespacesNum;
        return this;
    }

    /**
     * Get nvmfNamespacesNum
     *
     * @return nvmfNamespacesNum
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getNvmfNamespacesNum() {
        return nvmfNamespacesNum;
    }

    public void setNvmfNamespacesNum(Integer nvmfNamespacesNum) {
        this.nvmfNamespacesNum = nvmfNamespacesNum;
    }

    public NvmfSubsystem nvmfNamespacesNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NVMF_NAMESPACES_NUM);
        return this;
    }

    public NvmfSubsystem nvmfNamespacesNum_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NVMF_NAMESPACES_NUM);
        return this;
    }

    public void setNvmfNamespacesNum_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NVMF_NAMESPACES_NUM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NVMF_NAMESPACES_NUM);
        }
    }

    public boolean getNvmfNamespacesNum_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NVMF_NAMESPACES_NUM);
    }

    public NvmfSubsystem policy(NvmfSubsystemPolicyType policy) {

        this.policy = policy;
        return this;
    }

    /**
     * Get policy
     *
     * @return policy
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public NvmfSubsystemPolicyType getPolicy() {
        return policy;
    }

    public void setPolicy(NvmfSubsystemPolicyType policy) {
        this.policy = policy;
    }

    public NvmfSubsystem policy_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_POLICY);
        return this;
    }

    public NvmfSubsystem policy_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_POLICY);
        return this;
    }

    public void setPolicy_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_POLICY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_POLICY);
        }
    }

    public boolean getPolicy_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_POLICY);
    }

    public NvmfSubsystem prioritized(Boolean prioritized) {

        this.prioritized = prioritized;
        return this;
    }

    /**
     * Get prioritized
     *
     * @return prioritized
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getPrioritized() {
        return prioritized;
    }

    public void setPrioritized(Boolean prioritized) {
        this.prioritized = prioritized;
    }

    public NvmfSubsystem prioritized_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRIORITIZED);
        return this;
    }

    public NvmfSubsystem prioritized_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRIORITIZED);
        return this;
    }

    public void setPrioritized_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRIORITIZED);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRIORITIZED);
        }
    }

    public boolean getPrioritized_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRIORITIZED);
    }

    public NvmfSubsystem replicaNum(Integer replicaNum) {

        this.replicaNum = replicaNum;
        return this;
    }

    /**
     * Get replicaNum
     *
     * @return replicaNum
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Integer getReplicaNum() {
        return replicaNum;
    }

    public void setReplicaNum(Integer replicaNum) {
        this.replicaNum = replicaNum;
    }

    public NvmfSubsystem replicaNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICA_NUM);
        return this;
    }

    public NvmfSubsystem replicaNum_ExplictlyNonNull() {
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

    public NvmfSubsystem resiliencyType(ResiliencyType resiliencyType) {

        this.resiliencyType = resiliencyType;
        return this;
    }

    /**
     * Get resiliencyType
     *
     * @return resiliencyType
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ResiliencyType getResiliencyType() {
        return resiliencyType;
    }

    public void setResiliencyType(ResiliencyType resiliencyType) {
        this.resiliencyType = resiliencyType;
    }

    public NvmfSubsystem resiliencyType_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESILIENCY_TYPE);
        return this;
    }

    public NvmfSubsystem resiliencyType_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESILIENCY_TYPE);
        return this;
    }

    public void setResiliencyType_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESILIENCY_TYPE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESILIENCY_TYPE);
        }
    }

    public boolean getResiliencyType_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESILIENCY_TYPE);
    }

    public NvmfSubsystem stripeNum(Integer stripeNum) {

        this.stripeNum = stripeNum;
        return this;
    }

    /**
     * Get stripeNum
     *
     * @return stripeNum
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Integer getStripeNum() {
        return stripeNum;
    }

    public void setStripeNum(Integer stripeNum) {
        this.stripeNum = stripeNum;
    }

    public NvmfSubsystem stripeNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STRIPE_NUM);
        return this;
    }

    public NvmfSubsystem stripeNum_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STRIPE_NUM);
        return this;
    }

    public void setStripeNum_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STRIPE_NUM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STRIPE_NUM);
        }
    }

    public boolean getStripeNum_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STRIPE_NUM);
    }

    public NvmfSubsystem stripeSize(Long stripeSize) {

        this.stripeSize = stripeSize;
        return this;
    }

    /**
     * Get stripeSize
     *
     * @return stripeSize
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Long getStripeSize() {
        return stripeSize;
    }

    public void setStripeSize(Long stripeSize) {
        this.stripeSize = stripeSize;
    }

    public NvmfSubsystem stripeSize_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STRIPE_SIZE);
        return this;
    }

    public NvmfSubsystem stripeSize_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STRIPE_SIZE);
        return this;
    }

    public void setStripeSize_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STRIPE_SIZE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STRIPE_SIZE);
        }
    }

    public boolean getStripeSize_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STRIPE_SIZE);
    }

    public NvmfSubsystem thinProvision(Boolean thinProvision) {

        this.thinProvision = thinProvision;
        return this;
    }

    /**
     * Get thinProvision
     *
     * @return thinProvision
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Boolean getThinProvision() {
        return thinProvision;
    }

    public void setThinProvision(Boolean thinProvision) {
        this.thinProvision = thinProvision;
    }

    public NvmfSubsystem thinProvision_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_THIN_PROVISION);
        return this;
    }

    public NvmfSubsystem thinProvision_ExplictlyNonNull() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NvmfSubsystem nvmfSubsystem = (NvmfSubsystem) o;
        return Objects.equals(this.bps, nvmfSubsystem.bps)
                && Objects.equals(this.bpsMax, nvmfSubsystem.bpsMax)
                && Objects.equals(this.bpsMaxLength, nvmfSubsystem.bpsMaxLength)
                && Objects.equals(this.bpsRd, nvmfSubsystem.bpsRd)
                && Objects.equals(this.bpsRdMax, nvmfSubsystem.bpsRdMax)
                && Objects.equals(this.bpsRdMaxLength, nvmfSubsystem.bpsRdMaxLength)
                && Objects.equals(this.bpsWr, nvmfSubsystem.bpsWr)
                && Objects.equals(this.bpsWrMax, nvmfSubsystem.bpsWrMax)
                && Objects.equals(this.bpsWrMaxLength, nvmfSubsystem.bpsWrMaxLength)
                && Objects.equals(this.businessHostGroups, nvmfSubsystem.businessHostGroups)
                && Objects.equals(this.businessHosts, nvmfSubsystem.businessHosts)
                && Objects.equals(this.cluster, nvmfSubsystem.cluster)
                && Objects.equals(this.configurationAdaptive, nvmfSubsystem.configurationAdaptive)
                && Objects.equals(this.configurationMethod, nvmfSubsystem.configurationMethod)
                && Objects.equals(this.description, nvmfSubsystem.description)
                && Objects.equals(this.ecK, nvmfSubsystem.ecK)
                && Objects.equals(this.ecM, nvmfSubsystem.ecM)
                && Objects.equals(this.encryptMethod, nvmfSubsystem.encryptMethod)
                && Objects.equals(this.entityAsyncStatus, nvmfSubsystem.entityAsyncStatus)
                && Objects.equals(this.externalUse, nvmfSubsystem.externalUse)
                && Objects.equals(this.id, nvmfSubsystem.id)
                && Objects.equals(this.internal, nvmfSubsystem.internal)
                && Objects.equals(this.ioSize, nvmfSubsystem.ioSize)
                && Objects.equals(this.iops, nvmfSubsystem.iops)
                && Objects.equals(this.iopsMax, nvmfSubsystem.iopsMax)
                && Objects.equals(this.iopsMaxLength, nvmfSubsystem.iopsMaxLength)
                && Objects.equals(this.iopsRd, nvmfSubsystem.iopsRd)
                && Objects.equals(this.iopsRdMax, nvmfSubsystem.iopsRdMax)
                && Objects.equals(this.iopsRdMaxLength, nvmfSubsystem.iopsRdMaxLength)
                && Objects.equals(this.iopsWr, nvmfSubsystem.iopsWr)
                && Objects.equals(this.iopsWrMax, nvmfSubsystem.iopsWrMax)
                && Objects.equals(this.iopsWrMaxLength, nvmfSubsystem.iopsWrMaxLength)
                && Objects.equals(this.ipWhitelist, nvmfSubsystem.ipWhitelist)
                && Objects.equals(this.iscsiConnections, nvmfSubsystem.iscsiConnections)
                && Objects.equals(this.labels, nvmfSubsystem.labels)
                && Objects.equals(this.localId, nvmfSubsystem.localId)
                && Objects.equals(this.name, nvmfSubsystem.name)
                && Objects.equals(this.namespaceGroups, nvmfSubsystem.namespaceGroups)
                && Objects.equals(this.namespaces, nvmfSubsystem.namespaces)
                && Objects.equals(this.nqnName, nvmfSubsystem.nqnName)
                && Objects.equals(this.nqnWhitelist, nvmfSubsystem.nqnWhitelist)
                && Objects.equals(this.nvmfNamespacesNum, nvmfSubsystem.nvmfNamespacesNum)
                && Objects.equals(this.policy, nvmfSubsystem.policy)
                && Objects.equals(this.prioritized, nvmfSubsystem.prioritized)
                && Objects.equals(this.replicaNum, nvmfSubsystem.replicaNum)
                && Objects.equals(this.resiliencyType, nvmfSubsystem.resiliencyType)
                && Objects.equals(this.stripeNum, nvmfSubsystem.stripeNum)
                && Objects.equals(this.stripeSize, nvmfSubsystem.stripeSize)
                && Objects.equals(this.thinProvision, nvmfSubsystem.thinProvision);
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
                bps,
                bpsMax,
                bpsMaxLength,
                bpsRd,
                bpsRdMax,
                bpsRdMaxLength,
                bpsWr,
                bpsWrMax,
                bpsWrMaxLength,
                businessHostGroups,
                businessHosts,
                cluster,
                configurationAdaptive,
                configurationMethod,
                description,
                ecK,
                ecM,
                encryptMethod,
                entityAsyncStatus,
                externalUse,
                id,
                internal,
                ioSize,
                iops,
                iopsMax,
                iopsMaxLength,
                iopsRd,
                iopsRdMax,
                iopsRdMaxLength,
                iopsWr,
                iopsWrMax,
                iopsWrMaxLength,
                ipWhitelist,
                iscsiConnections,
                labels,
                localId,
                name,
                namespaceGroups,
                namespaces,
                nqnName,
                nqnWhitelist,
                nvmfNamespacesNum,
                policy,
                prioritized,
                replicaNum,
                resiliencyType,
                stripeNum,
                stripeSize,
                thinProvision);
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
        sb.append("class NvmfSubsystem {\n");
        sb.append("    bps: ").append(toIndentedString(bps)).append("\n");
        sb.append("    bpsMax: ").append(toIndentedString(bpsMax)).append("\n");
        sb.append("    bpsMaxLength: ").append(toIndentedString(bpsMaxLength)).append("\n");
        sb.append("    bpsRd: ").append(toIndentedString(bpsRd)).append("\n");
        sb.append("    bpsRdMax: ").append(toIndentedString(bpsRdMax)).append("\n");
        sb.append("    bpsRdMaxLength: ").append(toIndentedString(bpsRdMaxLength)).append("\n");
        sb.append("    bpsWr: ").append(toIndentedString(bpsWr)).append("\n");
        sb.append("    bpsWrMax: ").append(toIndentedString(bpsWrMax)).append("\n");
        sb.append("    bpsWrMaxLength: ").append(toIndentedString(bpsWrMaxLength)).append("\n");
        sb.append("    businessHostGroups: ")
                .append(toIndentedString(businessHostGroups))
                .append("\n");
        sb.append("    businessHosts: ").append(toIndentedString(businessHosts)).append("\n");
        sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
        sb.append("    configurationAdaptive: ")
                .append(toIndentedString(configurationAdaptive))
                .append("\n");
        sb.append("    configurationMethod: ")
                .append(toIndentedString(configurationMethod))
                .append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    ecK: ").append(toIndentedString(ecK)).append("\n");
        sb.append("    ecM: ").append(toIndentedString(ecM)).append("\n");
        sb.append("    encryptMethod: ").append(toIndentedString(encryptMethod)).append("\n");
        sb.append("    entityAsyncStatus: ")
                .append(toIndentedString(entityAsyncStatus))
                .append("\n");
        sb.append("    externalUse: ").append(toIndentedString(externalUse)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    internal: ").append(toIndentedString(internal)).append("\n");
        sb.append("    ioSize: ").append(toIndentedString(ioSize)).append("\n");
        sb.append("    iops: ").append(toIndentedString(iops)).append("\n");
        sb.append("    iopsMax: ").append(toIndentedString(iopsMax)).append("\n");
        sb.append("    iopsMaxLength: ").append(toIndentedString(iopsMaxLength)).append("\n");
        sb.append("    iopsRd: ").append(toIndentedString(iopsRd)).append("\n");
        sb.append("    iopsRdMax: ").append(toIndentedString(iopsRdMax)).append("\n");
        sb.append("    iopsRdMaxLength: ").append(toIndentedString(iopsRdMaxLength)).append("\n");
        sb.append("    iopsWr: ").append(toIndentedString(iopsWr)).append("\n");
        sb.append("    iopsWrMax: ").append(toIndentedString(iopsWrMax)).append("\n");
        sb.append("    iopsWrMaxLength: ").append(toIndentedString(iopsWrMaxLength)).append("\n");
        sb.append("    ipWhitelist: ").append(toIndentedString(ipWhitelist)).append("\n");
        sb.append("    iscsiConnections: ").append(toIndentedString(iscsiConnections)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    namespaceGroups: ").append(toIndentedString(namespaceGroups)).append("\n");
        sb.append("    namespaces: ").append(toIndentedString(namespaces)).append("\n");
        sb.append("    nqnName: ").append(toIndentedString(nqnName)).append("\n");
        sb.append("    nqnWhitelist: ").append(toIndentedString(nqnWhitelist)).append("\n");
        sb.append("    nvmfNamespacesNum: ")
                .append(toIndentedString(nvmfNamespacesNum))
                .append("\n");
        sb.append("    policy: ").append(toIndentedString(policy)).append("\n");
        sb.append("    prioritized: ").append(toIndentedString(prioritized)).append("\n");
        sb.append("    replicaNum: ").append(toIndentedString(replicaNum)).append("\n");
        sb.append("    resiliencyType: ").append(toIndentedString(resiliencyType)).append("\n");
        sb.append("    stripeNum: ").append(toIndentedString(stripeNum)).append("\n");
        sb.append("    stripeSize: ").append(toIndentedString(stripeSize)).append("\n");
        sb.append("    thinProvision: ").append(toIndentedString(thinProvision)).append("\n");
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

package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** NvmfNamespace */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class NvmfNamespace extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_ASSIGNED_SIZE = "assigned_size";

    @SerializedName(SERIALIZED_NAME_ASSIGNED_SIZE)
    private Long assignedSize;

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

    public static final String SERIALIZED_NAME_BUSINESS_HOST_IS_SAME_WITH_PARENT =
            "business_host_is_same_with_parent";

    @SerializedName(SERIALIZED_NAME_BUSINESS_HOST_IS_SAME_WITH_PARENT)
    private Boolean businessHostIsSameWithParent;

    public static final String SERIALIZED_NAME_BUSINESS_HOSTS = "business_hosts";

    @SerializedName(SERIALIZED_NAME_BUSINESS_HOSTS)
    private List<NestedBusinessHost> businessHosts = null;

    public static final String SERIALIZED_NAME_CONFIGURATION_METHOD = "configuration_method";

    @SerializedName(SERIALIZED_NAME_CONFIGURATION_METHOD)
    private ConfigurationMethod configurationMethod;

    public static final String SERIALIZED_NAME_CONSISTENCY_GROUP = "consistency_group";

    @SerializedName(SERIALIZED_NAME_CONSISTENCY_GROUP)
    private NestedConsistencyGroup consistencyGroup;

    public static final String SERIALIZED_NAME_DOWNGRADED_PRIORITIZED_SPACE =
            "downgraded_prioritized_space";

    @SerializedName(SERIALIZED_NAME_DOWNGRADED_PRIORITIZED_SPACE)
    private Long downgradedPrioritizedSpace;

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

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

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

    public static final String SERIALIZED_NAME_IS_SHARED = "is_shared";

    @SerializedName(SERIALIZED_NAME_IS_SHARED)
    private Boolean isShared;

    public static final String SERIALIZED_NAME_LABELS = "labels";

    @SerializedName(SERIALIZED_NAME_LABELS)
    private List<NestedLabel> labels = null;

    public static final String SERIALIZED_NAME_LOCAL_CREATED_AT = "local_created_at";

    @SerializedName(SERIALIZED_NAME_LOCAL_CREATED_AT)
    private String localCreatedAt;

    public static final String SERIALIZED_NAME_LOCAL_ID = "local_id";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID)
    private String localId;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_NAMESPACE_GROUP = "namespace_group";

    @SerializedName(SERIALIZED_NAME_NAMESPACE_GROUP)
    private NestedNamespaceGroup namespaceGroup;

    public static final String SERIALIZED_NAME_NAMESPACE_ID = "namespace_id";

    @SerializedName(SERIALIZED_NAME_NAMESPACE_ID)
    private Integer namespaceId;

    public static final String SERIALIZED_NAME_NQN_WHITELIST = "nqn_whitelist";

    @SerializedName(SERIALIZED_NAME_NQN_WHITELIST)
    private String nqnWhitelist;

    public static final String SERIALIZED_NAME_NVMF_SUBSYSTEM = "nvmf_subsystem";

    @SerializedName(SERIALIZED_NAME_NVMF_SUBSYSTEM)
    private NestedNvmfSubsystem nvmfSubsystem;

    public static final String SERIALIZED_NAME_PRIORITIZED = "prioritized";

    @SerializedName(SERIALIZED_NAME_PRIORITIZED)
    private Boolean prioritized;

    public static final String SERIALIZED_NAME_REPLICA_NUM = "replica_num";

    @SerializedName(SERIALIZED_NAME_REPLICA_NUM)
    private Integer replicaNum;

    public static final String SERIALIZED_NAME_RESILIENCY_TYPE = "resiliency_type";

    @SerializedName(SERIALIZED_NAME_RESILIENCY_TYPE)
    private ResiliencyType resiliencyType;

    public static final String SERIALIZED_NAME_SHARED_SIZE = "shared_size";

    @SerializedName(SERIALIZED_NAME_SHARED_SIZE)
    private Long sharedSize;

    public static final String SERIALIZED_NAME_SNAPSHOT_NUM = "snapshot_num";

    @SerializedName(SERIALIZED_NAME_SNAPSHOT_NUM)
    private Integer snapshotNum;

    public static final String SERIALIZED_NAME_SNAPSHOT_PLANS = "snapshot_plans";

    @SerializedName(SERIALIZED_NAME_SNAPSHOT_PLANS)
    private List<NestedSnapshotPlan> snapshotPlans = null;

    public static final String SERIALIZED_NAME_STRIPE_NUM = "stripe_num";

    @SerializedName(SERIALIZED_NAME_STRIPE_NUM)
    private Integer stripeNum;

    public static final String SERIALIZED_NAME_STRIPE_SIZE = "stripe_size";

    @SerializedName(SERIALIZED_NAME_STRIPE_SIZE)
    private Long stripeSize;

    public static final String SERIALIZED_NAME_THIN_PROVISION = "thin_provision";

    @SerializedName(SERIALIZED_NAME_THIN_PROVISION)
    private Boolean thinProvision;

    public static final String SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE = "unique_logical_size";

    @SerializedName(SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE)
    private Double uniqueLogicalSize;

    public static final String SERIALIZED_NAME_UNIQUE_SIZE = "unique_size";

    @SerializedName(SERIALIZED_NAME_UNIQUE_SIZE)
    private Long uniqueSize;

    public static final String SERIALIZED_NAME_ZBS_VOLUME_ID = "zbs_volume_id";

    @SerializedName(SERIALIZED_NAME_ZBS_VOLUME_ID)
    private String zbsVolumeId;

    public NvmfNamespace() {}

    public NvmfNamespace assignedSize(Long assignedSize) {

        this.assignedSize = assignedSize;
        return this;
    }

    /**
     * Get assignedSize
     *
     * @return assignedSize
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Long getAssignedSize() {
        return assignedSize;
    }

    public void setAssignedSize(Long assignedSize) {
        this.assignedSize = assignedSize;
    }

    public NvmfNamespace assignedSize_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ASSIGNED_SIZE);
        return this;
    }

    public NvmfNamespace assignedSize_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ASSIGNED_SIZE);
        return this;
    }

    public void setAssignedSize_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ASSIGNED_SIZE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ASSIGNED_SIZE);
        }
    }

    public boolean getAssignedSize_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ASSIGNED_SIZE);
    }

    public NvmfNamespace bps(Long bps) {

        this.bps = bps;
        return this;
    }

    /**
     * Get bps
     *
     * @return bps
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Long getBps() {
        return bps;
    }

    public void setBps(Long bps) {
        this.bps = bps;
    }

    public NvmfNamespace bps_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS);
        return this;
    }

    public NvmfNamespace bps_ExplictlyNonNull() {
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

    public NvmfNamespace bpsMax(Long bpsMax) {

        this.bpsMax = bpsMax;
        return this;
    }

    /**
     * Get bpsMax
     *
     * @return bpsMax
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Long getBpsMax() {
        return bpsMax;
    }

    public void setBpsMax(Long bpsMax) {
        this.bpsMax = bpsMax;
    }

    public NvmfNamespace bpsMax_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_MAX);
        return this;
    }

    public NvmfNamespace bpsMax_ExplictlyNonNull() {
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

    public NvmfNamespace bpsMaxLength(Long bpsMaxLength) {

        this.bpsMaxLength = bpsMaxLength;
        return this;
    }

    /**
     * Get bpsMaxLength
     *
     * @return bpsMaxLength
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Long getBpsMaxLength() {
        return bpsMaxLength;
    }

    public void setBpsMaxLength(Long bpsMaxLength) {
        this.bpsMaxLength = bpsMaxLength;
    }

    public NvmfNamespace bpsMaxLength_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_MAX_LENGTH);
        return this;
    }

    public NvmfNamespace bpsMaxLength_ExplictlyNonNull() {
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

    public NvmfNamespace bpsRd(Long bpsRd) {

        this.bpsRd = bpsRd;
        return this;
    }

    /**
     * Get bpsRd
     *
     * @return bpsRd
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Long getBpsRd() {
        return bpsRd;
    }

    public void setBpsRd(Long bpsRd) {
        this.bpsRd = bpsRd;
    }

    public NvmfNamespace bpsRd_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_RD);
        return this;
    }

    public NvmfNamespace bpsRd_ExplictlyNonNull() {
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

    public NvmfNamespace bpsRdMax(Long bpsRdMax) {

        this.bpsRdMax = bpsRdMax;
        return this;
    }

    /**
     * Get bpsRdMax
     *
     * @return bpsRdMax
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Long getBpsRdMax() {
        return bpsRdMax;
    }

    public void setBpsRdMax(Long bpsRdMax) {
        this.bpsRdMax = bpsRdMax;
    }

    public NvmfNamespace bpsRdMax_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_RD_MAX);
        return this;
    }

    public NvmfNamespace bpsRdMax_ExplictlyNonNull() {
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

    public NvmfNamespace bpsRdMaxLength(Long bpsRdMaxLength) {

        this.bpsRdMaxLength = bpsRdMaxLength;
        return this;
    }

    /**
     * Get bpsRdMaxLength
     *
     * @return bpsRdMaxLength
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Long getBpsRdMaxLength() {
        return bpsRdMaxLength;
    }

    public void setBpsRdMaxLength(Long bpsRdMaxLength) {
        this.bpsRdMaxLength = bpsRdMaxLength;
    }

    public NvmfNamespace bpsRdMaxLength_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_RD_MAX_LENGTH);
        return this;
    }

    public NvmfNamespace bpsRdMaxLength_ExplictlyNonNull() {
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

    public NvmfNamespace bpsWr(Long bpsWr) {

        this.bpsWr = bpsWr;
        return this;
    }

    /**
     * Get bpsWr
     *
     * @return bpsWr
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Long getBpsWr() {
        return bpsWr;
    }

    public void setBpsWr(Long bpsWr) {
        this.bpsWr = bpsWr;
    }

    public NvmfNamespace bpsWr_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_WR);
        return this;
    }

    public NvmfNamespace bpsWr_ExplictlyNonNull() {
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

    public NvmfNamespace bpsWrMax(Long bpsWrMax) {

        this.bpsWrMax = bpsWrMax;
        return this;
    }

    /**
     * Get bpsWrMax
     *
     * @return bpsWrMax
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Long getBpsWrMax() {
        return bpsWrMax;
    }

    public void setBpsWrMax(Long bpsWrMax) {
        this.bpsWrMax = bpsWrMax;
    }

    public NvmfNamespace bpsWrMax_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_WR_MAX);
        return this;
    }

    public NvmfNamespace bpsWrMax_ExplictlyNonNull() {
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

    public NvmfNamespace bpsWrMaxLength(Long bpsWrMaxLength) {

        this.bpsWrMaxLength = bpsWrMaxLength;
        return this;
    }

    /**
     * Get bpsWrMaxLength
     *
     * @return bpsWrMaxLength
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Long getBpsWrMaxLength() {
        return bpsWrMaxLength;
    }

    public void setBpsWrMaxLength(Long bpsWrMaxLength) {
        this.bpsWrMaxLength = bpsWrMaxLength;
    }

    public NvmfNamespace bpsWrMaxLength_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BPS_WR_MAX_LENGTH);
        return this;
    }

    public NvmfNamespace bpsWrMaxLength_ExplictlyNonNull() {
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

    public NvmfNamespace businessHostGroups(List<NestedBusinessHostGroup> businessHostGroups) {

        this.businessHostGroups = businessHostGroups;
        return this;
    }

    public NvmfNamespace addBusinessHostGroupsItem(NestedBusinessHostGroup businessHostGroupsItem) {
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

    public NvmfNamespace businessHostGroups_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BUSINESS_HOST_GROUPS);
        return this;
    }

    public NvmfNamespace businessHostGroups_ExplictlyNonNull() {
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

    public NvmfNamespace businessHostIsSameWithParent(Boolean businessHostIsSameWithParent) {

        this.businessHostIsSameWithParent = businessHostIsSameWithParent;
        return this;
    }

    /**
     * Get businessHostIsSameWithParent
     *
     * @return businessHostIsSameWithParent
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getBusinessHostIsSameWithParent() {
        return businessHostIsSameWithParent;
    }

    public void setBusinessHostIsSameWithParent(Boolean businessHostIsSameWithParent) {
        this.businessHostIsSameWithParent = businessHostIsSameWithParent;
    }

    public NvmfNamespace businessHostIsSameWithParent_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BUSINESS_HOST_IS_SAME_WITH_PARENT);
        return this;
    }

    public NvmfNamespace businessHostIsSameWithParent_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BUSINESS_HOST_IS_SAME_WITH_PARENT);
        return this;
    }

    public void setBusinessHostIsSameWithParent_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BUSINESS_HOST_IS_SAME_WITH_PARENT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BUSINESS_HOST_IS_SAME_WITH_PARENT);
        }
    }

    public boolean getBusinessHostIsSameWithParent_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BUSINESS_HOST_IS_SAME_WITH_PARENT);
    }

    public NvmfNamespace businessHosts(List<NestedBusinessHost> businessHosts) {

        this.businessHosts = businessHosts;
        return this;
    }

    public NvmfNamespace addBusinessHostsItem(NestedBusinessHost businessHostsItem) {
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

    public NvmfNamespace businessHosts_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BUSINESS_HOSTS);
        return this;
    }

    public NvmfNamespace businessHosts_ExplictlyNonNull() {
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

    public NvmfNamespace configurationMethod(ConfigurationMethod configurationMethod) {

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

    public NvmfNamespace configurationMethod_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CONFIGURATION_METHOD);
        return this;
    }

    public NvmfNamespace configurationMethod_ExplictlyNonNull() {
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

    public NvmfNamespace consistencyGroup(NestedConsistencyGroup consistencyGroup) {

        this.consistencyGroup = consistencyGroup;
        return this;
    }

    /**
     * Get consistencyGroup
     *
     * @return consistencyGroup
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NestedConsistencyGroup getConsistencyGroup() {
        return consistencyGroup;
    }

    public void setConsistencyGroup(NestedConsistencyGroup consistencyGroup) {
        this.consistencyGroup = consistencyGroup;
    }

    public NvmfNamespace consistencyGroup_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CONSISTENCY_GROUP);
        return this;
    }

    public NvmfNamespace consistencyGroup_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CONSISTENCY_GROUP);
        return this;
    }

    public void setConsistencyGroup_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CONSISTENCY_GROUP);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CONSISTENCY_GROUP);
        }
    }

    public boolean getConsistencyGroup_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CONSISTENCY_GROUP);
    }

    public NvmfNamespace downgradedPrioritizedSpace(Long downgradedPrioritizedSpace) {

        this.downgradedPrioritizedSpace = downgradedPrioritizedSpace;
        return this;
    }

    /**
     * Get downgradedPrioritizedSpace
     *
     * @return downgradedPrioritizedSpace
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getDowngradedPrioritizedSpace() {
        return downgradedPrioritizedSpace;
    }

    public void setDowngradedPrioritizedSpace(Long downgradedPrioritizedSpace) {
        this.downgradedPrioritizedSpace = downgradedPrioritizedSpace;
    }

    public NvmfNamespace downgradedPrioritizedSpace_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DOWNGRADED_PRIORITIZED_SPACE);
        return this;
    }

    public NvmfNamespace downgradedPrioritizedSpace_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DOWNGRADED_PRIORITIZED_SPACE);
        return this;
    }

    public void setDowngradedPrioritizedSpace_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DOWNGRADED_PRIORITIZED_SPACE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DOWNGRADED_PRIORITIZED_SPACE);
        }
    }

    public boolean getDowngradedPrioritizedSpace_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DOWNGRADED_PRIORITIZED_SPACE);
    }

    public NvmfNamespace ecK(Integer ecK) {

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

    public NvmfNamespace ecK_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EC_K);
        return this;
    }

    public NvmfNamespace ecK_ExplictlyNonNull() {
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

    public NvmfNamespace ecM(Integer ecM) {

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

    public NvmfNamespace ecM_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EC_M);
        return this;
    }

    public NvmfNamespace ecM_ExplictlyNonNull() {
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

    public NvmfNamespace encryptMethod(EncryptMethod encryptMethod) {

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

    public NvmfNamespace encryptMethod_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENCRYPT_METHOD);
        return this;
    }

    public NvmfNamespace encryptMethod_ExplictlyNonNull() {
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

    public NvmfNamespace entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {

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

    public NvmfNamespace entityAsyncStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        return this;
    }

    public NvmfNamespace entityAsyncStatus_ExplictlyNonNull() {
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

    public NvmfNamespace id(String id) {

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

    public NvmfNamespace id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public NvmfNamespace id_ExplictlyNonNull() {
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

    public NvmfNamespace ioSize(Long ioSize) {

        this.ioSize = ioSize;
        return this;
    }

    /**
     * Get ioSize
     *
     * @return ioSize
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Long getIoSize() {
        return ioSize;
    }

    public void setIoSize(Long ioSize) {
        this.ioSize = ioSize;
    }

    public NvmfNamespace ioSize_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IO_SIZE);
        return this;
    }

    public NvmfNamespace ioSize_ExplictlyNonNull() {
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

    public NvmfNamespace iops(Long iops) {

        this.iops = iops;
        return this;
    }

    /**
     * Get iops
     *
     * @return iops
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Long getIops() {
        return iops;
    }

    public void setIops(Long iops) {
        this.iops = iops;
    }

    public NvmfNamespace iops_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IOPS);
        return this;
    }

    public NvmfNamespace iops_ExplictlyNonNull() {
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

    public NvmfNamespace iopsMax(Long iopsMax) {

        this.iopsMax = iopsMax;
        return this;
    }

    /**
     * Get iopsMax
     *
     * @return iopsMax
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Long getIopsMax() {
        return iopsMax;
    }

    public void setIopsMax(Long iopsMax) {
        this.iopsMax = iopsMax;
    }

    public NvmfNamespace iopsMax_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IOPS_MAX);
        return this;
    }

    public NvmfNamespace iopsMax_ExplictlyNonNull() {
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

    public NvmfNamespace iopsMaxLength(Long iopsMaxLength) {

        this.iopsMaxLength = iopsMaxLength;
        return this;
    }

    /**
     * Get iopsMaxLength
     *
     * @return iopsMaxLength
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Long getIopsMaxLength() {
        return iopsMaxLength;
    }

    public void setIopsMaxLength(Long iopsMaxLength) {
        this.iopsMaxLength = iopsMaxLength;
    }

    public NvmfNamespace iopsMaxLength_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IOPS_MAX_LENGTH);
        return this;
    }

    public NvmfNamespace iopsMaxLength_ExplictlyNonNull() {
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

    public NvmfNamespace iopsRd(Long iopsRd) {

        this.iopsRd = iopsRd;
        return this;
    }

    /**
     * Get iopsRd
     *
     * @return iopsRd
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Long getIopsRd() {
        return iopsRd;
    }

    public void setIopsRd(Long iopsRd) {
        this.iopsRd = iopsRd;
    }

    public NvmfNamespace iopsRd_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IOPS_RD);
        return this;
    }

    public NvmfNamespace iopsRd_ExplictlyNonNull() {
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

    public NvmfNamespace iopsRdMax(Long iopsRdMax) {

        this.iopsRdMax = iopsRdMax;
        return this;
    }

    /**
     * Get iopsRdMax
     *
     * @return iopsRdMax
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Long getIopsRdMax() {
        return iopsRdMax;
    }

    public void setIopsRdMax(Long iopsRdMax) {
        this.iopsRdMax = iopsRdMax;
    }

    public NvmfNamespace iopsRdMax_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IOPS_RD_MAX);
        return this;
    }

    public NvmfNamespace iopsRdMax_ExplictlyNonNull() {
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

    public NvmfNamespace iopsRdMaxLength(Long iopsRdMaxLength) {

        this.iopsRdMaxLength = iopsRdMaxLength;
        return this;
    }

    /**
     * Get iopsRdMaxLength
     *
     * @return iopsRdMaxLength
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Long getIopsRdMaxLength() {
        return iopsRdMaxLength;
    }

    public void setIopsRdMaxLength(Long iopsRdMaxLength) {
        this.iopsRdMaxLength = iopsRdMaxLength;
    }

    public NvmfNamespace iopsRdMaxLength_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IOPS_RD_MAX_LENGTH);
        return this;
    }

    public NvmfNamespace iopsRdMaxLength_ExplictlyNonNull() {
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

    public NvmfNamespace iopsWr(Long iopsWr) {

        this.iopsWr = iopsWr;
        return this;
    }

    /**
     * Get iopsWr
     *
     * @return iopsWr
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Long getIopsWr() {
        return iopsWr;
    }

    public void setIopsWr(Long iopsWr) {
        this.iopsWr = iopsWr;
    }

    public NvmfNamespace iopsWr_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IOPS_WR);
        return this;
    }

    public NvmfNamespace iopsWr_ExplictlyNonNull() {
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

    public NvmfNamespace iopsWrMax(Long iopsWrMax) {

        this.iopsWrMax = iopsWrMax;
        return this;
    }

    /**
     * Get iopsWrMax
     *
     * @return iopsWrMax
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Long getIopsWrMax() {
        return iopsWrMax;
    }

    public void setIopsWrMax(Long iopsWrMax) {
        this.iopsWrMax = iopsWrMax;
    }

    public NvmfNamespace iopsWrMax_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IOPS_WR_MAX);
        return this;
    }

    public NvmfNamespace iopsWrMax_ExplictlyNonNull() {
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

    public NvmfNamespace iopsWrMaxLength(Long iopsWrMaxLength) {

        this.iopsWrMaxLength = iopsWrMaxLength;
        return this;
    }

    /**
     * Get iopsWrMaxLength
     *
     * @return iopsWrMaxLength
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Long getIopsWrMaxLength() {
        return iopsWrMaxLength;
    }

    public void setIopsWrMaxLength(Long iopsWrMaxLength) {
        this.iopsWrMaxLength = iopsWrMaxLength;
    }

    public NvmfNamespace iopsWrMaxLength_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IOPS_WR_MAX_LENGTH);
        return this;
    }

    public NvmfNamespace iopsWrMaxLength_ExplictlyNonNull() {
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

    public NvmfNamespace isShared(Boolean isShared) {

        this.isShared = isShared;
        return this;
    }

    /**
     * Get isShared
     *
     * @return isShared
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Boolean getIsShared() {
        return isShared;
    }

    public void setIsShared(Boolean isShared) {
        this.isShared = isShared;
    }

    public NvmfNamespace isShared_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IS_SHARED);
        return this;
    }

    public NvmfNamespace isShared_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IS_SHARED);
        return this;
    }

    public void setIsShared_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IS_SHARED);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IS_SHARED);
        }
    }

    public boolean getIsShared_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IS_SHARED);
    }

    public NvmfNamespace labels(List<NestedLabel> labels) {

        this.labels = labels;
        return this;
    }

    public NvmfNamespace addLabelsItem(NestedLabel labelsItem) {
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

    public NvmfNamespace labels_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LABELS);
        return this;
    }

    public NvmfNamespace labels_ExplictlyNonNull() {
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

    public NvmfNamespace localCreatedAt(String localCreatedAt) {

        this.localCreatedAt = localCreatedAt;
        return this;
    }

    /**
     * Get localCreatedAt
     *
     * @return localCreatedAt
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getLocalCreatedAt() {
        return localCreatedAt;
    }

    public void setLocalCreatedAt(String localCreatedAt) {
        this.localCreatedAt = localCreatedAt;
    }

    public NvmfNamespace localCreatedAt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATED_AT);
        return this;
    }

    public NvmfNamespace localCreatedAt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_CREATED_AT);
        return this;
    }

    public void setLocalCreatedAt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATED_AT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_CREATED_AT);
        }
    }

    public boolean getLocalCreatedAt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_CREATED_AT);
    }

    public NvmfNamespace localId(String localId) {

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

    public NvmfNamespace localId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID);
        return this;
    }

    public NvmfNamespace localId_ExplictlyNonNull() {
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

    public NvmfNamespace name(String name) {

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

    public NvmfNamespace name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public NvmfNamespace name_ExplictlyNonNull() {
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

    public NvmfNamespace namespaceGroup(NestedNamespaceGroup namespaceGroup) {

        this.namespaceGroup = namespaceGroup;
        return this;
    }

    /**
     * Get namespaceGroup
     *
     * @return namespaceGroup
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NestedNamespaceGroup getNamespaceGroup() {
        return namespaceGroup;
    }

    public void setNamespaceGroup(NestedNamespaceGroup namespaceGroup) {
        this.namespaceGroup = namespaceGroup;
    }

    public NvmfNamespace namespaceGroup_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAMESPACE_GROUP);
        return this;
    }

    public NvmfNamespace namespaceGroup_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAMESPACE_GROUP);
        return this;
    }

    public void setNamespaceGroup_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAMESPACE_GROUP);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAMESPACE_GROUP);
        }
    }

    public boolean getNamespaceGroup_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAMESPACE_GROUP);
    }

    public NvmfNamespace namespaceId(Integer namespaceId) {

        this.namespaceId = namespaceId;
        return this;
    }

    /**
     * Get namespaceId
     *
     * @return namespaceId
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Integer getNamespaceId() {
        return namespaceId;
    }

    public void setNamespaceId(Integer namespaceId) {
        this.namespaceId = namespaceId;
    }

    public NvmfNamespace namespaceId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAMESPACE_ID);
        return this;
    }

    public NvmfNamespace namespaceId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAMESPACE_ID);
        return this;
    }

    public void setNamespaceId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAMESPACE_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAMESPACE_ID);
        }
    }

    public boolean getNamespaceId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAMESPACE_ID);
    }

    public NvmfNamespace nqnWhitelist(String nqnWhitelist) {

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

    public NvmfNamespace nqnWhitelist_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NQN_WHITELIST);
        return this;
    }

    public NvmfNamespace nqnWhitelist_ExplictlyNonNull() {
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

    public NvmfNamespace nvmfSubsystem(NestedNvmfSubsystem nvmfSubsystem) {

        this.nvmfSubsystem = nvmfSubsystem;
        return this;
    }

    /**
     * Get nvmfSubsystem
     *
     * @return nvmfSubsystem
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public NestedNvmfSubsystem getNvmfSubsystem() {
        return nvmfSubsystem;
    }

    public void setNvmfSubsystem(NestedNvmfSubsystem nvmfSubsystem) {
        this.nvmfSubsystem = nvmfSubsystem;
    }

    public NvmfNamespace nvmfSubsystem_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NVMF_SUBSYSTEM);
        return this;
    }

    public NvmfNamespace nvmfSubsystem_ExplictlyNonNull() {
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

    public NvmfNamespace prioritized(Boolean prioritized) {

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

    public NvmfNamespace prioritized_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRIORITIZED);
        return this;
    }

    public NvmfNamespace prioritized_ExplictlyNonNull() {
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

    public NvmfNamespace replicaNum(Integer replicaNum) {

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

    public NvmfNamespace replicaNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICA_NUM);
        return this;
    }

    public NvmfNamespace replicaNum_ExplictlyNonNull() {
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

    public NvmfNamespace resiliencyType(ResiliencyType resiliencyType) {

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

    public NvmfNamespace resiliencyType_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESILIENCY_TYPE);
        return this;
    }

    public NvmfNamespace resiliencyType_ExplictlyNonNull() {
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

    public NvmfNamespace sharedSize(Long sharedSize) {

        this.sharedSize = sharedSize;
        return this;
    }

    /**
     * Get sharedSize
     *
     * @return sharedSize
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Long getSharedSize() {
        return sharedSize;
    }

    public void setSharedSize(Long sharedSize) {
        this.sharedSize = sharedSize;
    }

    public NvmfNamespace sharedSize_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SHARED_SIZE);
        return this;
    }

    public NvmfNamespace sharedSize_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SHARED_SIZE);
        return this;
    }

    public void setSharedSize_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SHARED_SIZE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SHARED_SIZE);
        }
    }

    public boolean getSharedSize_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SHARED_SIZE);
    }

    public NvmfNamespace snapshotNum(Integer snapshotNum) {

        this.snapshotNum = snapshotNum;
        return this;
    }

    /**
     * Get snapshotNum
     *
     * @return snapshotNum
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Integer getSnapshotNum() {
        return snapshotNum;
    }

    public void setSnapshotNum(Integer snapshotNum) {
        this.snapshotNum = snapshotNum;
    }

    public NvmfNamespace snapshotNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT_NUM);
        return this;
    }

    public NvmfNamespace snapshotNum_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SNAPSHOT_NUM);
        return this;
    }

    public void setSnapshotNum_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT_NUM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SNAPSHOT_NUM);
        }
    }

    public boolean getSnapshotNum_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SNAPSHOT_NUM);
    }

    public NvmfNamespace snapshotPlans(List<NestedSnapshotPlan> snapshotPlans) {

        this.snapshotPlans = snapshotPlans;
        return this;
    }

    public NvmfNamespace addSnapshotPlansItem(NestedSnapshotPlan snapshotPlansItem) {
        if (this.snapshotPlans == null) {
            this.snapshotPlans = new ArrayList<NestedSnapshotPlan>();
        }
        this.snapshotPlans.add(snapshotPlansItem);
        return this;
    }

    /**
     * Get snapshotPlans
     *
     * @return snapshotPlans
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedSnapshotPlan> getSnapshotPlans() {
        return snapshotPlans;
    }

    public void setSnapshotPlans(List<NestedSnapshotPlan> snapshotPlans) {
        this.snapshotPlans = snapshotPlans;
    }

    public NvmfNamespace snapshotPlans_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT_PLANS);
        return this;
    }

    public NvmfNamespace snapshotPlans_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SNAPSHOT_PLANS);
        return this;
    }

    public void setSnapshotPlans_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT_PLANS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SNAPSHOT_PLANS);
        }
    }

    public boolean getSnapshotPlans_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SNAPSHOT_PLANS);
    }

    public NvmfNamespace stripeNum(Integer stripeNum) {

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

    public NvmfNamespace stripeNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STRIPE_NUM);
        return this;
    }

    public NvmfNamespace stripeNum_ExplictlyNonNull() {
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

    public NvmfNamespace stripeSize(Long stripeSize) {

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

    public NvmfNamespace stripeSize_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STRIPE_SIZE);
        return this;
    }

    public NvmfNamespace stripeSize_ExplictlyNonNull() {
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

    public NvmfNamespace thinProvision(Boolean thinProvision) {

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

    public NvmfNamespace thinProvision_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_THIN_PROVISION);
        return this;
    }

    public NvmfNamespace thinProvision_ExplictlyNonNull() {
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

    public NvmfNamespace uniqueLogicalSize(Double uniqueLogicalSize) {

        this.uniqueLogicalSize = uniqueLogicalSize;
        return this;
    }

    /**
     * Get uniqueLogicalSize
     *
     * @return uniqueLogicalSize
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getUniqueLogicalSize() {
        return uniqueLogicalSize;
    }

    public void setUniqueLogicalSize(Double uniqueLogicalSize) {
        this.uniqueLogicalSize = uniqueLogicalSize;
    }

    public NvmfNamespace uniqueLogicalSize_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE);
        return this;
    }

    public NvmfNamespace uniqueLogicalSize_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE);
        return this;
    }

    public void setUniqueLogicalSize_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE);
        }
    }

    public boolean getUniqueLogicalSize_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE);
    }

    public NvmfNamespace uniqueSize(Long uniqueSize) {

        this.uniqueSize = uniqueSize;
        return this;
    }

    /**
     * Get uniqueSize
     *
     * @return uniqueSize
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Long getUniqueSize() {
        return uniqueSize;
    }

    public void setUniqueSize(Long uniqueSize) {
        this.uniqueSize = uniqueSize;
    }

    public NvmfNamespace uniqueSize_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UNIQUE_SIZE);
        return this;
    }

    public NvmfNamespace uniqueSize_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UNIQUE_SIZE);
        return this;
    }

    public void setUniqueSize_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UNIQUE_SIZE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UNIQUE_SIZE);
        }
    }

    public boolean getUniqueSize_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UNIQUE_SIZE);
    }

    public NvmfNamespace zbsVolumeId(String zbsVolumeId) {

        this.zbsVolumeId = zbsVolumeId;
        return this;
    }

    /**
     * Get zbsVolumeId
     *
     * @return zbsVolumeId
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getZbsVolumeId() {
        return zbsVolumeId;
    }

    public void setZbsVolumeId(String zbsVolumeId) {
        this.zbsVolumeId = zbsVolumeId;
    }

    public NvmfNamespace zbsVolumeId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ZBS_VOLUME_ID);
        return this;
    }

    public NvmfNamespace zbsVolumeId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ZBS_VOLUME_ID);
        return this;
    }

    public void setZbsVolumeId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ZBS_VOLUME_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ZBS_VOLUME_ID);
        }
    }

    public boolean getZbsVolumeId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ZBS_VOLUME_ID);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NvmfNamespace nvmfNamespace = (NvmfNamespace) o;
        return Objects.equals(this.assignedSize, nvmfNamespace.assignedSize)
                && Objects.equals(this.bps, nvmfNamespace.bps)
                && Objects.equals(this.bpsMax, nvmfNamespace.bpsMax)
                && Objects.equals(this.bpsMaxLength, nvmfNamespace.bpsMaxLength)
                && Objects.equals(this.bpsRd, nvmfNamespace.bpsRd)
                && Objects.equals(this.bpsRdMax, nvmfNamespace.bpsRdMax)
                && Objects.equals(this.bpsRdMaxLength, nvmfNamespace.bpsRdMaxLength)
                && Objects.equals(this.bpsWr, nvmfNamespace.bpsWr)
                && Objects.equals(this.bpsWrMax, nvmfNamespace.bpsWrMax)
                && Objects.equals(this.bpsWrMaxLength, nvmfNamespace.bpsWrMaxLength)
                && Objects.equals(this.businessHostGroups, nvmfNamespace.businessHostGroups)
                && Objects.equals(
                        this.businessHostIsSameWithParent,
                        nvmfNamespace.businessHostIsSameWithParent)
                && Objects.equals(this.businessHosts, nvmfNamespace.businessHosts)
                && Objects.equals(this.configurationMethod, nvmfNamespace.configurationMethod)
                && Objects.equals(this.consistencyGroup, nvmfNamespace.consistencyGroup)
                && Objects.equals(
                        this.downgradedPrioritizedSpace, nvmfNamespace.downgradedPrioritizedSpace)
                && Objects.equals(this.ecK, nvmfNamespace.ecK)
                && Objects.equals(this.ecM, nvmfNamespace.ecM)
                && Objects.equals(this.encryptMethod, nvmfNamespace.encryptMethod)
                && Objects.equals(this.entityAsyncStatus, nvmfNamespace.entityAsyncStatus)
                && Objects.equals(this.id, nvmfNamespace.id)
                && Objects.equals(this.ioSize, nvmfNamespace.ioSize)
                && Objects.equals(this.iops, nvmfNamespace.iops)
                && Objects.equals(this.iopsMax, nvmfNamespace.iopsMax)
                && Objects.equals(this.iopsMaxLength, nvmfNamespace.iopsMaxLength)
                && Objects.equals(this.iopsRd, nvmfNamespace.iopsRd)
                && Objects.equals(this.iopsRdMax, nvmfNamespace.iopsRdMax)
                && Objects.equals(this.iopsRdMaxLength, nvmfNamespace.iopsRdMaxLength)
                && Objects.equals(this.iopsWr, nvmfNamespace.iopsWr)
                && Objects.equals(this.iopsWrMax, nvmfNamespace.iopsWrMax)
                && Objects.equals(this.iopsWrMaxLength, nvmfNamespace.iopsWrMaxLength)
                && Objects.equals(this.isShared, nvmfNamespace.isShared)
                && Objects.equals(this.labels, nvmfNamespace.labels)
                && Objects.equals(this.localCreatedAt, nvmfNamespace.localCreatedAt)
                && Objects.equals(this.localId, nvmfNamespace.localId)
                && Objects.equals(this.name, nvmfNamespace.name)
                && Objects.equals(this.namespaceGroup, nvmfNamespace.namespaceGroup)
                && Objects.equals(this.namespaceId, nvmfNamespace.namespaceId)
                && Objects.equals(this.nqnWhitelist, nvmfNamespace.nqnWhitelist)
                && Objects.equals(this.nvmfSubsystem, nvmfNamespace.nvmfSubsystem)
                && Objects.equals(this.prioritized, nvmfNamespace.prioritized)
                && Objects.equals(this.replicaNum, nvmfNamespace.replicaNum)
                && Objects.equals(this.resiliencyType, nvmfNamespace.resiliencyType)
                && Objects.equals(this.sharedSize, nvmfNamespace.sharedSize)
                && Objects.equals(this.snapshotNum, nvmfNamespace.snapshotNum)
                && Objects.equals(this.snapshotPlans, nvmfNamespace.snapshotPlans)
                && Objects.equals(this.stripeNum, nvmfNamespace.stripeNum)
                && Objects.equals(this.stripeSize, nvmfNamespace.stripeSize)
                && Objects.equals(this.thinProvision, nvmfNamespace.thinProvision)
                && Objects.equals(this.uniqueLogicalSize, nvmfNamespace.uniqueLogicalSize)
                && Objects.equals(this.uniqueSize, nvmfNamespace.uniqueSize)
                && Objects.equals(this.zbsVolumeId, nvmfNamespace.zbsVolumeId);
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
                assignedSize,
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
                businessHostIsSameWithParent,
                businessHosts,
                configurationMethod,
                consistencyGroup,
                downgradedPrioritizedSpace,
                ecK,
                ecM,
                encryptMethod,
                entityAsyncStatus,
                id,
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
                isShared,
                labels,
                localCreatedAt,
                localId,
                name,
                namespaceGroup,
                namespaceId,
                nqnWhitelist,
                nvmfSubsystem,
                prioritized,
                replicaNum,
                resiliencyType,
                sharedSize,
                snapshotNum,
                snapshotPlans,
                stripeNum,
                stripeSize,
                thinProvision,
                uniqueLogicalSize,
                uniqueSize,
                zbsVolumeId);
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
        sb.append("class NvmfNamespace {\n");
        sb.append("    assignedSize: ").append(toIndentedString(assignedSize)).append("\n");
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
        sb.append("    businessHostIsSameWithParent: ")
                .append(toIndentedString(businessHostIsSameWithParent))
                .append("\n");
        sb.append("    businessHosts: ").append(toIndentedString(businessHosts)).append("\n");
        sb.append("    configurationMethod: ")
                .append(toIndentedString(configurationMethod))
                .append("\n");
        sb.append("    consistencyGroup: ").append(toIndentedString(consistencyGroup)).append("\n");
        sb.append("    downgradedPrioritizedSpace: ")
                .append(toIndentedString(downgradedPrioritizedSpace))
                .append("\n");
        sb.append("    ecK: ").append(toIndentedString(ecK)).append("\n");
        sb.append("    ecM: ").append(toIndentedString(ecM)).append("\n");
        sb.append("    encryptMethod: ").append(toIndentedString(encryptMethod)).append("\n");
        sb.append("    entityAsyncStatus: ")
                .append(toIndentedString(entityAsyncStatus))
                .append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
        sb.append("    isShared: ").append(toIndentedString(isShared)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    localCreatedAt: ").append(toIndentedString(localCreatedAt)).append("\n");
        sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    namespaceGroup: ").append(toIndentedString(namespaceGroup)).append("\n");
        sb.append("    namespaceId: ").append(toIndentedString(namespaceId)).append("\n");
        sb.append("    nqnWhitelist: ").append(toIndentedString(nqnWhitelist)).append("\n");
        sb.append("    nvmfSubsystem: ").append(toIndentedString(nvmfSubsystem)).append("\n");
        sb.append("    prioritized: ").append(toIndentedString(prioritized)).append("\n");
        sb.append("    replicaNum: ").append(toIndentedString(replicaNum)).append("\n");
        sb.append("    resiliencyType: ").append(toIndentedString(resiliencyType)).append("\n");
        sb.append("    sharedSize: ").append(toIndentedString(sharedSize)).append("\n");
        sb.append("    snapshotNum: ").append(toIndentedString(snapshotNum)).append("\n");
        sb.append("    snapshotPlans: ").append(toIndentedString(snapshotPlans)).append("\n");
        sb.append("    stripeNum: ").append(toIndentedString(stripeNum)).append("\n");
        sb.append("    stripeSize: ").append(toIndentedString(stripeSize)).append("\n");
        sb.append("    thinProvision: ").append(toIndentedString(thinProvision)).append("\n");
        sb.append("    uniqueLogicalSize: ")
                .append(toIndentedString(uniqueLogicalSize))
                .append("\n");
        sb.append("    uniqueSize: ").append(toIndentedString(uniqueSize)).append("\n");
        sb.append("    zbsVolumeId: ").append(toIndentedString(zbsVolumeId)).append("\n");
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

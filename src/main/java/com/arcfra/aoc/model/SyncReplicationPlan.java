package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** SyncReplicationPlan */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class SyncReplicationPlan
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_ACTIVATION_TIMESTAMP = "activation_timestamp";

    @SerializedName(SERIALIZED_NAME_ACTIVATION_TIMESTAMP)
    private String activationTimestamp;

    public static final String SERIALIZED_NAME_COMPRESSION = "compression";

    @SerializedName(SERIALIZED_NAME_COMPRESSION)
    private Boolean compression;

    public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";

    @SerializedName(SERIALIZED_NAME_CREATED_AT)
    private String createdAt;

    public static final String SERIALIZED_NAME_DATA_VERSION = "data_version";

    @SerializedName(SERIALIZED_NAME_DATA_VERSION)
    private Integer dataVersion;

    public static final String SERIALIZED_NAME_DELETE_STRATEGY = "delete_strategy";

    @SerializedName(SERIALIZED_NAME_DELETE_STRATEGY)
    private BackupPlanDeleteStrategy deleteStrategy;

    public static final String SERIALIZED_NAME_DESCRIPTION = "description";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION)
    private String description;

    public static final String SERIALIZED_NAME_EC_K = "ec_k";

    @SerializedName(SERIALIZED_NAME_EC_K)
    private Integer ecK;

    public static final String SERIALIZED_NAME_EC_M = "ec_m";

    @SerializedName(SERIALIZED_NAME_EC_M)
    private Integer ecM;

    public static final String SERIALIZED_NAME_ENTITY_ASYNC_STATUS = "entityAsyncStatus";

    @SerializedName(SERIALIZED_NAME_ENTITY_ASYNC_STATUS)
    private EntityAsyncStatus entityAsyncStatus;

    public static final String SERIALIZED_NAME_FAILOVER_TEST_IP_MAPPING =
            "failover_test_ip_mapping";

    @SerializedName(SERIALIZED_NAME_FAILOVER_TEST_IP_MAPPING)
    private List<NestedReplicationIPAddressMapping> failoverTestIpMapping = null;

    public static final String SERIALIZED_NAME_FAILOVER_TEST_KEEP_MAC_ADDRESS =
            "failover_test_keep_mac_address";

    @SerializedName(SERIALIZED_NAME_FAILOVER_TEST_KEEP_MAC_ADDRESS)
    private Boolean failoverTestKeepMacAddress;

    public static final String SERIALIZED_NAME_FAILOVER_TEST_NAME_RULE = "failover_test_name_rule";

    @SerializedName(SERIALIZED_NAME_FAILOVER_TEST_NAME_RULE)
    private ReplicaNameRule failoverTestNameRule;

    public static final String SERIALIZED_NAME_FAILOVER_TEST_NAME_SETTING =
            "failover_test_name_setting";

    @SerializedName(SERIALIZED_NAME_FAILOVER_TEST_NAME_SETTING)
    private String failoverTestNameSetting;

    public static final String SERIALIZED_NAME_FAILOVER_TEST_NETWORK_MAPPING =
            "failover_test_network_mapping";

    @SerializedName(SERIALIZED_NAME_FAILOVER_TEST_NETWORK_MAPPING)
    private List<NestedReplicationPlanNetworkMapping> failoverTestNetworkMapping = null;

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

    public static final String SERIALIZED_NAME_INBOUND = "inbound";

    @SerializedName(SERIALIZED_NAME_INBOUND)
    private Boolean inbound;

    public static final String SERIALIZED_NAME_INITIALIZATION_TIME_POINT =
            "initialization_time_point";

    @SerializedName(SERIALIZED_NAME_INITIALIZATION_TIME_POINT)
    private String initializationTimePoint;

    public static final String SERIALIZED_NAME_INTERVAL = "interval";

    @SerializedName(SERIALIZED_NAME_INTERVAL)
    private Integer interval;

    public static final String SERIALIZED_NAME_IP_MAPPING = "ip_mapping";

    @SerializedName(SERIALIZED_NAME_IP_MAPPING)
    private List<NestedReplicationIPAddressMapping> ipMapping =
            new ArrayList<NestedReplicationIPAddressMapping>();

    public static final String SERIALIZED_NAME_KEEP_MAC_ADDRESS = "keep_mac_address";

    @SerializedName(SERIALIZED_NAME_KEEP_MAC_ADDRESS)
    private Boolean keepMacAddress;

    public static final String SERIALIZED_NAME_KEEP_POLICY = "keep_policy";

    @SerializedName(SERIALIZED_NAME_KEEP_POLICY)
    private BackupPlanKeepPolicy keepPolicy;

    public static final String SERIALIZED_NAME_KEEP_POLICY_VALUE = "keep_policy_value";

    @SerializedName(SERIALIZED_NAME_KEEP_POLICY_VALUE)
    private Integer keepPolicyValue;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_NETWORK_MAPPING = "network_mapping";

    @SerializedName(SERIALIZED_NAME_NETWORK_MAPPING)
    private List<NestedReplicationPlanNetworkMapping> networkMapping =
            new ArrayList<NestedReplicationPlanNetworkMapping>();

    public static final String SERIALIZED_NAME_OBJECTS_DESCRIPTOR = "objects_descriptor";

    @SerializedName(SERIALIZED_NAME_OBJECTS_DESCRIPTOR)
    private List<NestedReplicationObjectDescriptor> objectsDescriptor =
            new ArrayList<NestedReplicationObjectDescriptor>();

    public static final String SERIALIZED_NAME_PERIOD = "period";

    @SerializedName(SERIALIZED_NAME_PERIOD)
    private ReplicationPlanPeriod period;

    public static final String SERIALIZED_NAME_PHASE = "phase";

    @SerializedName(SERIALIZED_NAME_PHASE)
    private BackupPlanPhase phase;

    public static final String SERIALIZED_NAME_REPLICA_NAME_RULE = "replica_name_rule";

    @SerializedName(SERIALIZED_NAME_REPLICA_NAME_RULE)
    private ReplicaNameRule replicaNameRule;

    public static final String SERIALIZED_NAME_REPLICA_NAME_SETTING = "replica_name_setting";

    @SerializedName(SERIALIZED_NAME_REPLICA_NAME_SETTING)
    private String replicaNameSetting;

    public static final String SERIALIZED_NAME_REPLICA_NUM = "replica_num";

    @SerializedName(SERIALIZED_NAME_REPLICA_NUM)
    private Integer replicaNum;

    public static final String SERIALIZED_NAME_REPLICA_VMS = "replica_vms";

    @SerializedName(SERIALIZED_NAME_REPLICA_VMS)
    private List<NestedReplicaVm> replicaVms = null;

    public static final String SERIALIZED_NAME_RESILIENCY_TYPE = "resiliency_type";

    @SerializedName(SERIALIZED_NAME_RESILIENCY_TYPE)
    private ResiliencyType resiliencyType;

    public static final String SERIALIZED_NAME_RESOURCE_VERSION = "resource_version";

    @SerializedName(SERIALIZED_NAME_RESOURCE_VERSION)
    private Integer resourceVersion;

    public static final String SERIALIZED_NAME_SNAPSHOT_CONSISTENT_TYPE =
            "snapshot_consistent_type";

    @SerializedName(SERIALIZED_NAME_SNAPSHOT_CONSISTENT_TYPE)
    private ConsistentType snapshotConsistentType;

    public static final String SERIALIZED_NAME_STATUS = "status";

    @SerializedName(SERIALIZED_NAME_STATUS)
    private BackupPlanStatus status;

    public static final String SERIALIZED_NAME_STORAGE_ENCRYPTED = "storage_encrypted";

    @SerializedName(SERIALIZED_NAME_STORAGE_ENCRYPTED)
    private Boolean storageEncrypted;

    public static final String SERIALIZED_NAME_STORAGE_POLICY = "storage_policy";

    @SerializedName(SERIALIZED_NAME_STORAGE_POLICY)
    private VmVolumeElfStoragePolicyType storagePolicy;

    public static final String SERIALIZED_NAME_TARGET_CLUSTER = "target_cluster";

    @SerializedName(SERIALIZED_NAME_TARGET_CLUSTER)
    private NestedCluster targetCluster;

    public static final String SERIALIZED_NAME_TARGET_CLUSTER_DESCRIPTOR =
            "target_cluster_descriptor";

    @SerializedName(SERIALIZED_NAME_TARGET_CLUSTER_DESCRIPTOR)
    private NestedReplicationClusterDescriptor targetClusterDescriptor;

    public static final String SERIALIZED_NAME_TARGET_REPLICATION_SERVICE =
            "target_replication_service";

    @SerializedName(SERIALIZED_NAME_TARGET_REPLICATION_SERVICE)
    private NestedReplicationService targetReplicationService;

    public static final String SERIALIZED_NAME_THIN_PROVISION = "thin_provision";

    @SerializedName(SERIALIZED_NAME_THIN_PROVISION)
    private Boolean thinProvision;

    public static final String SERIALIZED_NAME_TIME_POINTS = "time_points";

    @SerializedName(SERIALIZED_NAME_TIME_POINTS)
    private List<NestedBackupPlanTimePoint> timePoints = null;

    public static final String SERIALIZED_NAME_TYPE = "type";

    @SerializedName(SERIALIZED_NAME_TYPE)
    private ReplicationPlanType type;

    public static final String SERIALIZED_NAME_UPDATED_AT = "updatedAt";

    @SerializedName(SERIALIZED_NAME_UPDATED_AT)
    private String updatedAt;

    public static final String SERIALIZED_NAME_VMS = "vms";

    @SerializedName(SERIALIZED_NAME_VMS)
    private List<NestedVm> vms = null;

    public static final String SERIALIZED_NAME_WEEKDAYS = "weekdays";

    @SerializedName(SERIALIZED_NAME_WEEKDAYS)
    private List<WeekdayTypeEnum> weekdays = null;

    public SyncReplicationPlan() {}

    public SyncReplicationPlan activationTimestamp(String activationTimestamp) {

        this.activationTimestamp = activationTimestamp;
        return this;
    }

    /**
     * Get activationTimestamp
     *
     * @return activationTimestamp
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getActivationTimestamp() {
        return activationTimestamp;
    }

    public void setActivationTimestamp(String activationTimestamp) {
        this.activationTimestamp = activationTimestamp;
    }

    public SyncReplicationPlan activationTimestamp_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ACTIVATION_TIMESTAMP);
        return this;
    }

    public SyncReplicationPlan activationTimestamp_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ACTIVATION_TIMESTAMP);
        return this;
    }

    public void setActivationTimestamp_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ACTIVATION_TIMESTAMP);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ACTIVATION_TIMESTAMP);
        }
    }

    public boolean getActivationTimestamp_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ACTIVATION_TIMESTAMP);
    }

    public SyncReplicationPlan compression(Boolean compression) {

        this.compression = compression;
        return this;
    }

    /**
     * Get compression
     *
     * @return compression
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Boolean getCompression() {
        return compression;
    }

    public void setCompression(Boolean compression) {
        this.compression = compression;
    }

    public SyncReplicationPlan compression_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_COMPRESSION);
        return this;
    }

    public SyncReplicationPlan compression_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_COMPRESSION);
        return this;
    }

    public void setCompression_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_COMPRESSION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_COMPRESSION);
        }
    }

    public boolean getCompression_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_COMPRESSION);
    }

    public SyncReplicationPlan createdAt(String createdAt) {

        this.createdAt = createdAt;
        return this;
    }

    /**
     * Get createdAt
     *
     * @return createdAt
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public SyncReplicationPlan createdAt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT);
        return this;
    }

    public SyncReplicationPlan createdAt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CREATED_AT);
        return this;
    }

    public void setCreatedAt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CREATED_AT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CREATED_AT);
        }
    }

    public boolean getCreatedAt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CREATED_AT);
    }

    public SyncReplicationPlan dataVersion(Integer dataVersion) {

        this.dataVersion = dataVersion;
        return this;
    }

    /**
     * Get dataVersion
     *
     * @return dataVersion
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getDataVersion() {
        return dataVersion;
    }

    public void setDataVersion(Integer dataVersion) {
        this.dataVersion = dataVersion;
    }

    public SyncReplicationPlan dataVersion_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATA_VERSION);
        return this;
    }

    public SyncReplicationPlan dataVersion_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATA_VERSION);
        return this;
    }

    public void setDataVersion_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATA_VERSION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATA_VERSION);
        }
    }

    public boolean getDataVersion_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATA_VERSION);
    }

    public SyncReplicationPlan deleteStrategy(BackupPlanDeleteStrategy deleteStrategy) {

        this.deleteStrategy = deleteStrategy;
        return this;
    }

    /**
     * Get deleteStrategy
     *
     * @return deleteStrategy
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public BackupPlanDeleteStrategy getDeleteStrategy() {
        return deleteStrategy;
    }

    public void setDeleteStrategy(BackupPlanDeleteStrategy deleteStrategy) {
        this.deleteStrategy = deleteStrategy;
    }

    public SyncReplicationPlan deleteStrategy_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DELETE_STRATEGY);
        return this;
    }

    public SyncReplicationPlan deleteStrategy_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DELETE_STRATEGY);
        return this;
    }

    public void setDeleteStrategy_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DELETE_STRATEGY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DELETE_STRATEGY);
        }
    }

    public boolean getDeleteStrategy_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DELETE_STRATEGY);
    }

    public SyncReplicationPlan description(String description) {

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

    public SyncReplicationPlan description_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION);
        return this;
    }

    public SyncReplicationPlan description_ExplictlyNonNull() {
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

    public SyncReplicationPlan ecK(Integer ecK) {

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

    public SyncReplicationPlan ecK_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EC_K);
        return this;
    }

    public SyncReplicationPlan ecK_ExplictlyNonNull() {
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

    public SyncReplicationPlan ecM(Integer ecM) {

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

    public SyncReplicationPlan ecM_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EC_M);
        return this;
    }

    public SyncReplicationPlan ecM_ExplictlyNonNull() {
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

    public SyncReplicationPlan entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {

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

    public SyncReplicationPlan entityAsyncStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        return this;
    }

    public SyncReplicationPlan entityAsyncStatus_ExplictlyNonNull() {
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

    public SyncReplicationPlan failoverTestIpMapping(
            List<NestedReplicationIPAddressMapping> failoverTestIpMapping) {

        this.failoverTestIpMapping = failoverTestIpMapping;
        return this;
    }

    public SyncReplicationPlan addFailoverTestIpMappingItem(
            NestedReplicationIPAddressMapping failoverTestIpMappingItem) {
        if (this.failoverTestIpMapping == null) {
            this.failoverTestIpMapping = new ArrayList<NestedReplicationIPAddressMapping>();
        }
        this.failoverTestIpMapping.add(failoverTestIpMappingItem);
        return this;
    }

    /**
     * Get failoverTestIpMapping
     *
     * @return failoverTestIpMapping
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedReplicationIPAddressMapping> getFailoverTestIpMapping() {
        return failoverTestIpMapping;
    }

    public void setFailoverTestIpMapping(
            List<NestedReplicationIPAddressMapping> failoverTestIpMapping) {
        this.failoverTestIpMapping = failoverTestIpMapping;
    }

    public SyncReplicationPlan failoverTestIpMapping_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FAILOVER_TEST_IP_MAPPING);
        return this;
    }

    public SyncReplicationPlan failoverTestIpMapping_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FAILOVER_TEST_IP_MAPPING);
        return this;
    }

    public void setFailoverTestIpMapping_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FAILOVER_TEST_IP_MAPPING);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FAILOVER_TEST_IP_MAPPING);
        }
    }

    public boolean getFailoverTestIpMapping_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FAILOVER_TEST_IP_MAPPING);
    }

    public SyncReplicationPlan failoverTestKeepMacAddress(Boolean failoverTestKeepMacAddress) {

        this.failoverTestKeepMacAddress = failoverTestKeepMacAddress;
        return this;
    }

    /**
     * Get failoverTestKeepMacAddress
     *
     * @return failoverTestKeepMacAddress
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getFailoverTestKeepMacAddress() {
        return failoverTestKeepMacAddress;
    }

    public void setFailoverTestKeepMacAddress(Boolean failoverTestKeepMacAddress) {
        this.failoverTestKeepMacAddress = failoverTestKeepMacAddress;
    }

    public SyncReplicationPlan failoverTestKeepMacAddress_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FAILOVER_TEST_KEEP_MAC_ADDRESS);
        return this;
    }

    public SyncReplicationPlan failoverTestKeepMacAddress_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FAILOVER_TEST_KEEP_MAC_ADDRESS);
        return this;
    }

    public void setFailoverTestKeepMacAddress_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FAILOVER_TEST_KEEP_MAC_ADDRESS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FAILOVER_TEST_KEEP_MAC_ADDRESS);
        }
    }

    public boolean getFailoverTestKeepMacAddress_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FAILOVER_TEST_KEEP_MAC_ADDRESS);
    }

    public SyncReplicationPlan failoverTestNameRule(ReplicaNameRule failoverTestNameRule) {

        this.failoverTestNameRule = failoverTestNameRule;
        return this;
    }

    /**
     * Get failoverTestNameRule
     *
     * @return failoverTestNameRule
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public ReplicaNameRule getFailoverTestNameRule() {
        return failoverTestNameRule;
    }

    public void setFailoverTestNameRule(ReplicaNameRule failoverTestNameRule) {
        this.failoverTestNameRule = failoverTestNameRule;
    }

    public SyncReplicationPlan failoverTestNameRule_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FAILOVER_TEST_NAME_RULE);
        return this;
    }

    public SyncReplicationPlan failoverTestNameRule_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FAILOVER_TEST_NAME_RULE);
        return this;
    }

    public void setFailoverTestNameRule_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FAILOVER_TEST_NAME_RULE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FAILOVER_TEST_NAME_RULE);
        }
    }

    public boolean getFailoverTestNameRule_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FAILOVER_TEST_NAME_RULE);
    }

    public SyncReplicationPlan failoverTestNameSetting(String failoverTestNameSetting) {

        this.failoverTestNameSetting = failoverTestNameSetting;
        return this;
    }

    /**
     * Get failoverTestNameSetting
     *
     * @return failoverTestNameSetting
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getFailoverTestNameSetting() {
        return failoverTestNameSetting;
    }

    public void setFailoverTestNameSetting(String failoverTestNameSetting) {
        this.failoverTestNameSetting = failoverTestNameSetting;
    }

    public SyncReplicationPlan failoverTestNameSetting_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FAILOVER_TEST_NAME_SETTING);
        return this;
    }

    public SyncReplicationPlan failoverTestNameSetting_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FAILOVER_TEST_NAME_SETTING);
        return this;
    }

    public void setFailoverTestNameSetting_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FAILOVER_TEST_NAME_SETTING);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FAILOVER_TEST_NAME_SETTING);
        }
    }

    public boolean getFailoverTestNameSetting_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FAILOVER_TEST_NAME_SETTING);
    }

    public SyncReplicationPlan failoverTestNetworkMapping(
            List<NestedReplicationPlanNetworkMapping> failoverTestNetworkMapping) {

        this.failoverTestNetworkMapping = failoverTestNetworkMapping;
        return this;
    }

    public SyncReplicationPlan addFailoverTestNetworkMappingItem(
            NestedReplicationPlanNetworkMapping failoverTestNetworkMappingItem) {
        if (this.failoverTestNetworkMapping == null) {
            this.failoverTestNetworkMapping = new ArrayList<NestedReplicationPlanNetworkMapping>();
        }
        this.failoverTestNetworkMapping.add(failoverTestNetworkMappingItem);
        return this;
    }

    /**
     * Get failoverTestNetworkMapping
     *
     * @return failoverTestNetworkMapping
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedReplicationPlanNetworkMapping> getFailoverTestNetworkMapping() {
        return failoverTestNetworkMapping;
    }

    public void setFailoverTestNetworkMapping(
            List<NestedReplicationPlanNetworkMapping> failoverTestNetworkMapping) {
        this.failoverTestNetworkMapping = failoverTestNetworkMapping;
    }

    public SyncReplicationPlan failoverTestNetworkMapping_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FAILOVER_TEST_NETWORK_MAPPING);
        return this;
    }

    public SyncReplicationPlan failoverTestNetworkMapping_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FAILOVER_TEST_NETWORK_MAPPING);
        return this;
    }

    public void setFailoverTestNetworkMapping_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FAILOVER_TEST_NETWORK_MAPPING);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FAILOVER_TEST_NETWORK_MAPPING);
        }
    }

    public boolean getFailoverTestNetworkMapping_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FAILOVER_TEST_NETWORK_MAPPING);
    }

    public SyncReplicationPlan id(String id) {

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

    public SyncReplicationPlan id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public SyncReplicationPlan id_ExplictlyNonNull() {
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

    public SyncReplicationPlan inbound(Boolean inbound) {

        this.inbound = inbound;
        return this;
    }

    /**
     * Get inbound
     *
     * @return inbound
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getInbound() {
        return inbound;
    }

    public void setInbound(Boolean inbound) {
        this.inbound = inbound;
    }

    public SyncReplicationPlan inbound_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INBOUND);
        return this;
    }

    public SyncReplicationPlan inbound_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INBOUND);
        return this;
    }

    public void setInbound_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INBOUND);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INBOUND);
        }
    }

    public boolean getInbound_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INBOUND);
    }

    public SyncReplicationPlan initializationTimePoint(String initializationTimePoint) {

        this.initializationTimePoint = initializationTimePoint;
        return this;
    }

    /**
     * Get initializationTimePoint
     *
     * @return initializationTimePoint
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getInitializationTimePoint() {
        return initializationTimePoint;
    }

    public void setInitializationTimePoint(String initializationTimePoint) {
        this.initializationTimePoint = initializationTimePoint;
    }

    public SyncReplicationPlan initializationTimePoint_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INITIALIZATION_TIME_POINT);
        return this;
    }

    public SyncReplicationPlan initializationTimePoint_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INITIALIZATION_TIME_POINT);
        return this;
    }

    public void setInitializationTimePoint_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INITIALIZATION_TIME_POINT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INITIALIZATION_TIME_POINT);
        }
    }

    public boolean getInitializationTimePoint_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INITIALIZATION_TIME_POINT);
    }

    public SyncReplicationPlan interval(Integer interval) {

        this.interval = interval;
        return this;
    }

    /**
     * Get interval
     *
     * @return interval
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getInterval() {
        return interval;
    }

    public void setInterval(Integer interval) {
        this.interval = interval;
    }

    public SyncReplicationPlan interval_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INTERVAL);
        return this;
    }

    public SyncReplicationPlan interval_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INTERVAL);
        return this;
    }

    public void setInterval_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INTERVAL);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INTERVAL);
        }
    }

    public boolean getInterval_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INTERVAL);
    }

    public SyncReplicationPlan ipMapping(List<NestedReplicationIPAddressMapping> ipMapping) {

        this.ipMapping = ipMapping;
        return this;
    }

    public SyncReplicationPlan addIpMappingItem(NestedReplicationIPAddressMapping ipMappingItem) {
        this.ipMapping.add(ipMappingItem);
        return this;
    }

    /**
     * Get ipMapping
     *
     * @return ipMapping
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public List<NestedReplicationIPAddressMapping> getIpMapping() {
        return ipMapping;
    }

    public void setIpMapping(List<NestedReplicationIPAddressMapping> ipMapping) {
        this.ipMapping = ipMapping;
    }

    public SyncReplicationPlan ipMapping_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_MAPPING);
        return this;
    }

    public SyncReplicationPlan ipMapping_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IP_MAPPING);
        return this;
    }

    public void setIpMapping_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IP_MAPPING);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IP_MAPPING);
        }
    }

    public boolean getIpMapping_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IP_MAPPING);
    }

    public SyncReplicationPlan keepMacAddress(Boolean keepMacAddress) {

        this.keepMacAddress = keepMacAddress;
        return this;
    }

    /**
     * Get keepMacAddress
     *
     * @return keepMacAddress
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getKeepMacAddress() {
        return keepMacAddress;
    }

    public void setKeepMacAddress(Boolean keepMacAddress) {
        this.keepMacAddress = keepMacAddress;
    }

    public SyncReplicationPlan keepMacAddress_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KEEP_MAC_ADDRESS);
        return this;
    }

    public SyncReplicationPlan keepMacAddress_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_KEEP_MAC_ADDRESS);
        return this;
    }

    public void setKeepMacAddress_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_KEEP_MAC_ADDRESS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_KEEP_MAC_ADDRESS);
        }
    }

    public boolean getKeepMacAddress_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_KEEP_MAC_ADDRESS);
    }

    public SyncReplicationPlan keepPolicy(BackupPlanKeepPolicy keepPolicy) {

        this.keepPolicy = keepPolicy;
        return this;
    }

    /**
     * Get keepPolicy
     *
     * @return keepPolicy
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public BackupPlanKeepPolicy getKeepPolicy() {
        return keepPolicy;
    }

    public void setKeepPolicy(BackupPlanKeepPolicy keepPolicy) {
        this.keepPolicy = keepPolicy;
    }

    public SyncReplicationPlan keepPolicy_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KEEP_POLICY);
        return this;
    }

    public SyncReplicationPlan keepPolicy_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_KEEP_POLICY);
        return this;
    }

    public void setKeepPolicy_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_KEEP_POLICY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_KEEP_POLICY);
        }
    }

    public boolean getKeepPolicy_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_KEEP_POLICY);
    }

    public SyncReplicationPlan keepPolicyValue(Integer keepPolicyValue) {

        this.keepPolicyValue = keepPolicyValue;
        return this;
    }

    /**
     * Get keepPolicyValue
     *
     * @return keepPolicyValue
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getKeepPolicyValue() {
        return keepPolicyValue;
    }

    public void setKeepPolicyValue(Integer keepPolicyValue) {
        this.keepPolicyValue = keepPolicyValue;
    }

    public SyncReplicationPlan keepPolicyValue_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KEEP_POLICY_VALUE);
        return this;
    }

    public SyncReplicationPlan keepPolicyValue_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_KEEP_POLICY_VALUE);
        return this;
    }

    public void setKeepPolicyValue_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_KEEP_POLICY_VALUE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_KEEP_POLICY_VALUE);
        }
    }

    public boolean getKeepPolicyValue_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_KEEP_POLICY_VALUE);
    }

    public SyncReplicationPlan name(String name) {

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

    public SyncReplicationPlan name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public SyncReplicationPlan name_ExplictlyNonNull() {
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

    public SyncReplicationPlan networkMapping(
            List<NestedReplicationPlanNetworkMapping> networkMapping) {

        this.networkMapping = networkMapping;
        return this;
    }

    public SyncReplicationPlan addNetworkMappingItem(
            NestedReplicationPlanNetworkMapping networkMappingItem) {
        this.networkMapping.add(networkMappingItem);
        return this;
    }

    /**
     * Get networkMapping
     *
     * @return networkMapping
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public List<NestedReplicationPlanNetworkMapping> getNetworkMapping() {
        return networkMapping;
    }

    public void setNetworkMapping(List<NestedReplicationPlanNetworkMapping> networkMapping) {
        this.networkMapping = networkMapping;
    }

    public SyncReplicationPlan networkMapping_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NETWORK_MAPPING);
        return this;
    }

    public SyncReplicationPlan networkMapping_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NETWORK_MAPPING);
        return this;
    }

    public void setNetworkMapping_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NETWORK_MAPPING);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NETWORK_MAPPING);
        }
    }

    public boolean getNetworkMapping_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NETWORK_MAPPING);
    }

    public SyncReplicationPlan objectsDescriptor(
            List<NestedReplicationObjectDescriptor> objectsDescriptor) {

        this.objectsDescriptor = objectsDescriptor;
        return this;
    }

    public SyncReplicationPlan addObjectsDescriptorItem(
            NestedReplicationObjectDescriptor objectsDescriptorItem) {
        this.objectsDescriptor.add(objectsDescriptorItem);
        return this;
    }

    /**
     * Get objectsDescriptor
     *
     * @return objectsDescriptor
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public List<NestedReplicationObjectDescriptor> getObjectsDescriptor() {
        return objectsDescriptor;
    }

    public void setObjectsDescriptor(List<NestedReplicationObjectDescriptor> objectsDescriptor) {
        this.objectsDescriptor = objectsDescriptor;
    }

    public SyncReplicationPlan objectsDescriptor_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_OBJECTS_DESCRIPTOR);
        return this;
    }

    public SyncReplicationPlan objectsDescriptor_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_OBJECTS_DESCRIPTOR);
        return this;
    }

    public void setObjectsDescriptor_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_OBJECTS_DESCRIPTOR);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_OBJECTS_DESCRIPTOR);
        }
    }

    public boolean getObjectsDescriptor_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_OBJECTS_DESCRIPTOR);
    }

    public SyncReplicationPlan period(ReplicationPlanPeriod period) {

        this.period = period;
        return this;
    }

    /**
     * Get period
     *
     * @return period
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ReplicationPlanPeriod getPeriod() {
        return period;
    }

    public void setPeriod(ReplicationPlanPeriod period) {
        this.period = period;
    }

    public SyncReplicationPlan period_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PERIOD);
        return this;
    }

    public SyncReplicationPlan period_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PERIOD);
        return this;
    }

    public void setPeriod_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PERIOD);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PERIOD);
        }
    }

    public boolean getPeriod_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PERIOD);
    }

    public SyncReplicationPlan phase(BackupPlanPhase phase) {

        this.phase = phase;
        return this;
    }

    /**
     * Get phase
     *
     * @return phase
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public BackupPlanPhase getPhase() {
        return phase;
    }

    public void setPhase(BackupPlanPhase phase) {
        this.phase = phase;
    }

    public SyncReplicationPlan phase_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PHASE);
        return this;
    }

    public SyncReplicationPlan phase_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PHASE);
        return this;
    }

    public void setPhase_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PHASE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PHASE);
        }
    }

    public boolean getPhase_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PHASE);
    }

    public SyncReplicationPlan replicaNameRule(ReplicaNameRule replicaNameRule) {

        this.replicaNameRule = replicaNameRule;
        return this;
    }

    /**
     * Get replicaNameRule
     *
     * @return replicaNameRule
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public ReplicaNameRule getReplicaNameRule() {
        return replicaNameRule;
    }

    public void setReplicaNameRule(ReplicaNameRule replicaNameRule) {
        this.replicaNameRule = replicaNameRule;
    }

    public SyncReplicationPlan replicaNameRule_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICA_NAME_RULE);
        return this;
    }

    public SyncReplicationPlan replicaNameRule_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REPLICA_NAME_RULE);
        return this;
    }

    public void setReplicaNameRule_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REPLICA_NAME_RULE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REPLICA_NAME_RULE);
        }
    }

    public boolean getReplicaNameRule_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REPLICA_NAME_RULE);
    }

    public SyncReplicationPlan replicaNameSetting(String replicaNameSetting) {

        this.replicaNameSetting = replicaNameSetting;
        return this;
    }

    /**
     * Get replicaNameSetting
     *
     * @return replicaNameSetting
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getReplicaNameSetting() {
        return replicaNameSetting;
    }

    public void setReplicaNameSetting(String replicaNameSetting) {
        this.replicaNameSetting = replicaNameSetting;
    }

    public SyncReplicationPlan replicaNameSetting_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICA_NAME_SETTING);
        return this;
    }

    public SyncReplicationPlan replicaNameSetting_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REPLICA_NAME_SETTING);
        return this;
    }

    public void setReplicaNameSetting_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REPLICA_NAME_SETTING);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REPLICA_NAME_SETTING);
        }
    }

    public boolean getReplicaNameSetting_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REPLICA_NAME_SETTING);
    }

    public SyncReplicationPlan replicaNum(Integer replicaNum) {

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

    public SyncReplicationPlan replicaNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICA_NUM);
        return this;
    }

    public SyncReplicationPlan replicaNum_ExplictlyNonNull() {
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

    public SyncReplicationPlan replicaVms(List<NestedReplicaVm> replicaVms) {

        this.replicaVms = replicaVms;
        return this;
    }

    public SyncReplicationPlan addReplicaVmsItem(NestedReplicaVm replicaVmsItem) {
        if (this.replicaVms == null) {
            this.replicaVms = new ArrayList<NestedReplicaVm>();
        }
        this.replicaVms.add(replicaVmsItem);
        return this;
    }

    /**
     * Get replicaVms
     *
     * @return replicaVms
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedReplicaVm> getReplicaVms() {
        return replicaVms;
    }

    public void setReplicaVms(List<NestedReplicaVm> replicaVms) {
        this.replicaVms = replicaVms;
    }

    public SyncReplicationPlan replicaVms_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICA_VMS);
        return this;
    }

    public SyncReplicationPlan replicaVms_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REPLICA_VMS);
        return this;
    }

    public void setReplicaVms_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REPLICA_VMS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REPLICA_VMS);
        }
    }

    public boolean getReplicaVms_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REPLICA_VMS);
    }

    public SyncReplicationPlan resiliencyType(ResiliencyType resiliencyType) {

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

    public SyncReplicationPlan resiliencyType_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESILIENCY_TYPE);
        return this;
    }

    public SyncReplicationPlan resiliencyType_ExplictlyNonNull() {
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

    public SyncReplicationPlan resourceVersion(Integer resourceVersion) {

        this.resourceVersion = resourceVersion;
        return this;
    }

    /**
     * Get resourceVersion
     *
     * @return resourceVersion
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getResourceVersion() {
        return resourceVersion;
    }

    public void setResourceVersion(Integer resourceVersion) {
        this.resourceVersion = resourceVersion;
    }

    public SyncReplicationPlan resourceVersion_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_VERSION);
        return this;
    }

    public SyncReplicationPlan resourceVersion_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_VERSION);
        return this;
    }

    public void setResourceVersion_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_VERSION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_VERSION);
        }
    }

    public boolean getResourceVersion_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_VERSION);
    }

    public SyncReplicationPlan snapshotConsistentType(ConsistentType snapshotConsistentType) {

        this.snapshotConsistentType = snapshotConsistentType;
        return this;
    }

    /**
     * Get snapshotConsistentType
     *
     * @return snapshotConsistentType
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ConsistentType getSnapshotConsistentType() {
        return snapshotConsistentType;
    }

    public void setSnapshotConsistentType(ConsistentType snapshotConsistentType) {
        this.snapshotConsistentType = snapshotConsistentType;
    }

    public SyncReplicationPlan snapshotConsistentType_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT_CONSISTENT_TYPE);
        return this;
    }

    public SyncReplicationPlan snapshotConsistentType_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SNAPSHOT_CONSISTENT_TYPE);
        return this;
    }

    public void setSnapshotConsistentType_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT_CONSISTENT_TYPE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SNAPSHOT_CONSISTENT_TYPE);
        }
    }

    public boolean getSnapshotConsistentType_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SNAPSHOT_CONSISTENT_TYPE);
    }

    public SyncReplicationPlan status(BackupPlanStatus status) {

        this.status = status;
        return this;
    }

    /**
     * Get status
     *
     * @return status
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public BackupPlanStatus getStatus() {
        return status;
    }

    public void setStatus(BackupPlanStatus status) {
        this.status = status;
    }

    public SyncReplicationPlan status_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATUS);
        return this;
    }

    public SyncReplicationPlan status_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STATUS);
        return this;
    }

    public void setStatus_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STATUS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STATUS);
        }
    }

    public boolean getStatus_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STATUS);
    }

    public SyncReplicationPlan storageEncrypted(Boolean storageEncrypted) {

        this.storageEncrypted = storageEncrypted;
        return this;
    }

    /**
     * Get storageEncrypted
     *
     * @return storageEncrypted
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getStorageEncrypted() {
        return storageEncrypted;
    }

    public void setStorageEncrypted(Boolean storageEncrypted) {
        this.storageEncrypted = storageEncrypted;
    }

    public SyncReplicationPlan storageEncrypted_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_ENCRYPTED);
        return this;
    }

    public SyncReplicationPlan storageEncrypted_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_ENCRYPTED);
        return this;
    }

    public void setStorageEncrypted_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_ENCRYPTED);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_ENCRYPTED);
        }
    }

    public boolean getStorageEncrypted_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_ENCRYPTED);
    }

    public SyncReplicationPlan storagePolicy(VmVolumeElfStoragePolicyType storagePolicy) {

        this.storagePolicy = storagePolicy;
        return this;
    }

    /**
     * Get storagePolicy
     *
     * @return storagePolicy
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public VmVolumeElfStoragePolicyType getStoragePolicy() {
        return storagePolicy;
    }

    public void setStoragePolicy(VmVolumeElfStoragePolicyType storagePolicy) {
        this.storagePolicy = storagePolicy;
    }

    public SyncReplicationPlan storagePolicy_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_POLICY);
        return this;
    }

    public SyncReplicationPlan storagePolicy_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_POLICY);
        return this;
    }

    public void setStoragePolicy_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_POLICY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_POLICY);
        }
    }

    public boolean getStoragePolicy_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_POLICY);
    }

    public SyncReplicationPlan targetCluster(NestedCluster targetCluster) {

        this.targetCluster = targetCluster;
        return this;
    }

    /**
     * Get targetCluster
     *
     * @return targetCluster
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NestedCluster getTargetCluster() {
        return targetCluster;
    }

    public void setTargetCluster(NestedCluster targetCluster) {
        this.targetCluster = targetCluster;
    }

    public SyncReplicationPlan targetCluster_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TARGET_CLUSTER);
        return this;
    }

    public SyncReplicationPlan targetCluster_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TARGET_CLUSTER);
        return this;
    }

    public void setTargetCluster_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TARGET_CLUSTER);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TARGET_CLUSTER);
        }
    }

    public boolean getTargetCluster_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TARGET_CLUSTER);
    }

    public SyncReplicationPlan targetClusterDescriptor(
            NestedReplicationClusterDescriptor targetClusterDescriptor) {

        this.targetClusterDescriptor = targetClusterDescriptor;
        return this;
    }

    /**
     * Get targetClusterDescriptor
     *
     * @return targetClusterDescriptor
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public NestedReplicationClusterDescriptor getTargetClusterDescriptor() {
        return targetClusterDescriptor;
    }

    public void setTargetClusterDescriptor(
            NestedReplicationClusterDescriptor targetClusterDescriptor) {
        this.targetClusterDescriptor = targetClusterDescriptor;
    }

    public SyncReplicationPlan targetClusterDescriptor_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TARGET_CLUSTER_DESCRIPTOR);
        return this;
    }

    public SyncReplicationPlan targetClusterDescriptor_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TARGET_CLUSTER_DESCRIPTOR);
        return this;
    }

    public void setTargetClusterDescriptor_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TARGET_CLUSTER_DESCRIPTOR);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TARGET_CLUSTER_DESCRIPTOR);
        }
    }

    public boolean getTargetClusterDescriptor_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TARGET_CLUSTER_DESCRIPTOR);
    }

    public SyncReplicationPlan targetReplicationService(
            NestedReplicationService targetReplicationService) {

        this.targetReplicationService = targetReplicationService;
        return this;
    }

    /**
     * Get targetReplicationService
     *
     * @return targetReplicationService
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public NestedReplicationService getTargetReplicationService() {
        return targetReplicationService;
    }

    public void setTargetReplicationService(NestedReplicationService targetReplicationService) {
        this.targetReplicationService = targetReplicationService;
    }

    public SyncReplicationPlan targetReplicationService_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TARGET_REPLICATION_SERVICE);
        return this;
    }

    public SyncReplicationPlan targetReplicationService_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TARGET_REPLICATION_SERVICE);
        return this;
    }

    public void setTargetReplicationService_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TARGET_REPLICATION_SERVICE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TARGET_REPLICATION_SERVICE);
        }
    }

    public boolean getTargetReplicationService_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TARGET_REPLICATION_SERVICE);
    }

    public SyncReplicationPlan thinProvision(Boolean thinProvision) {

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

    public SyncReplicationPlan thinProvision_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_THIN_PROVISION);
        return this;
    }

    public SyncReplicationPlan thinProvision_ExplictlyNonNull() {
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

    public SyncReplicationPlan timePoints(List<NestedBackupPlanTimePoint> timePoints) {

        this.timePoints = timePoints;
        return this;
    }

    public SyncReplicationPlan addTimePointsItem(NestedBackupPlanTimePoint timePointsItem) {
        if (this.timePoints == null) {
            this.timePoints = new ArrayList<NestedBackupPlanTimePoint>();
        }
        this.timePoints.add(timePointsItem);
        return this;
    }

    /**
     * Get timePoints
     *
     * @return timePoints
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedBackupPlanTimePoint> getTimePoints() {
        return timePoints;
    }

    public void setTimePoints(List<NestedBackupPlanTimePoint> timePoints) {
        this.timePoints = timePoints;
    }

    public SyncReplicationPlan timePoints_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TIME_POINTS);
        return this;
    }

    public SyncReplicationPlan timePoints_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TIME_POINTS);
        return this;
    }

    public void setTimePoints_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TIME_POINTS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TIME_POINTS);
        }
    }

    public boolean getTimePoints_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TIME_POINTS);
    }

    public SyncReplicationPlan type(ReplicationPlanType type) {

        this.type = type;
        return this;
    }

    /**
     * Get type
     *
     * @return type
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public ReplicationPlanType getType() {
        return type;
    }

    public void setType(ReplicationPlanType type) {
        this.type = type;
    }

    public SyncReplicationPlan type_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE);
        return this;
    }

    public SyncReplicationPlan type_ExplictlyNonNull() {
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

    public SyncReplicationPlan updatedAt(String updatedAt) {

        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Get updatedAt
     *
     * @return updatedAt
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public SyncReplicationPlan updatedAt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPDATED_AT);
        return this;
    }

    public SyncReplicationPlan updatedAt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UPDATED_AT);
        return this;
    }

    public void setUpdatedAt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UPDATED_AT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UPDATED_AT);
        }
    }

    public boolean getUpdatedAt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UPDATED_AT);
    }

    public SyncReplicationPlan vms(List<NestedVm> vms) {

        this.vms = vms;
        return this;
    }

    public SyncReplicationPlan addVmsItem(NestedVm vmsItem) {
        if (this.vms == null) {
            this.vms = new ArrayList<NestedVm>();
        }
        this.vms.add(vmsItem);
        return this;
    }

    /**
     * Get vms
     *
     * @return vms
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedVm> getVms() {
        return vms;
    }

    public void setVms(List<NestedVm> vms) {
        this.vms = vms;
    }

    public SyncReplicationPlan vms_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VMS);
        return this;
    }

    public SyncReplicationPlan vms_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VMS);
        return this;
    }

    public void setVms_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VMS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VMS);
        }
    }

    public boolean getVms_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VMS);
    }

    public SyncReplicationPlan weekdays(List<WeekdayTypeEnum> weekdays) {

        this.weekdays = weekdays;
        return this;
    }

    public SyncReplicationPlan addWeekdaysItem(WeekdayTypeEnum weekdaysItem) {
        if (this.weekdays == null) {
            this.weekdays = new ArrayList<WeekdayTypeEnum>();
        }
        this.weekdays.add(weekdaysItem);
        return this;
    }

    /**
     * Get weekdays
     *
     * @return weekdays
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<WeekdayTypeEnum> getWeekdays() {
        return weekdays;
    }

    public void setWeekdays(List<WeekdayTypeEnum> weekdays) {
        this.weekdays = weekdays;
    }

    public SyncReplicationPlan weekdays_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WEEKDAYS);
        return this;
    }

    public SyncReplicationPlan weekdays_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_WEEKDAYS);
        return this;
    }

    public void setWeekdays_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_WEEKDAYS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_WEEKDAYS);
        }
    }

    public boolean getWeekdays_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_WEEKDAYS);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SyncReplicationPlan syncReplicationPlan = (SyncReplicationPlan) o;
        return Objects.equals(this.activationTimestamp, syncReplicationPlan.activationTimestamp)
                && Objects.equals(this.compression, syncReplicationPlan.compression)
                && Objects.equals(this.createdAt, syncReplicationPlan.createdAt)
                && Objects.equals(this.dataVersion, syncReplicationPlan.dataVersion)
                && Objects.equals(this.deleteStrategy, syncReplicationPlan.deleteStrategy)
                && Objects.equals(this.description, syncReplicationPlan.description)
                && Objects.equals(this.ecK, syncReplicationPlan.ecK)
                && Objects.equals(this.ecM, syncReplicationPlan.ecM)
                && Objects.equals(this.entityAsyncStatus, syncReplicationPlan.entityAsyncStatus)
                && Objects.equals(
                        this.failoverTestIpMapping, syncReplicationPlan.failoverTestIpMapping)
                && Objects.equals(
                        this.failoverTestKeepMacAddress,
                        syncReplicationPlan.failoverTestKeepMacAddress)
                && Objects.equals(
                        this.failoverTestNameRule, syncReplicationPlan.failoverTestNameRule)
                && Objects.equals(
                        this.failoverTestNameSetting, syncReplicationPlan.failoverTestNameSetting)
                && Objects.equals(
                        this.failoverTestNetworkMapping,
                        syncReplicationPlan.failoverTestNetworkMapping)
                && Objects.equals(this.id, syncReplicationPlan.id)
                && Objects.equals(this.inbound, syncReplicationPlan.inbound)
                && Objects.equals(
                        this.initializationTimePoint, syncReplicationPlan.initializationTimePoint)
                && Objects.equals(this.interval, syncReplicationPlan.interval)
                && Objects.equals(this.ipMapping, syncReplicationPlan.ipMapping)
                && Objects.equals(this.keepMacAddress, syncReplicationPlan.keepMacAddress)
                && Objects.equals(this.keepPolicy, syncReplicationPlan.keepPolicy)
                && Objects.equals(this.keepPolicyValue, syncReplicationPlan.keepPolicyValue)
                && Objects.equals(this.name, syncReplicationPlan.name)
                && Objects.equals(this.networkMapping, syncReplicationPlan.networkMapping)
                && Objects.equals(this.objectsDescriptor, syncReplicationPlan.objectsDescriptor)
                && Objects.equals(this.period, syncReplicationPlan.period)
                && Objects.equals(this.phase, syncReplicationPlan.phase)
                && Objects.equals(this.replicaNameRule, syncReplicationPlan.replicaNameRule)
                && Objects.equals(this.replicaNameSetting, syncReplicationPlan.replicaNameSetting)
                && Objects.equals(this.replicaNum, syncReplicationPlan.replicaNum)
                && Objects.equals(this.replicaVms, syncReplicationPlan.replicaVms)
                && Objects.equals(this.resiliencyType, syncReplicationPlan.resiliencyType)
                && Objects.equals(this.resourceVersion, syncReplicationPlan.resourceVersion)
                && Objects.equals(
                        this.snapshotConsistentType, syncReplicationPlan.snapshotConsistentType)
                && Objects.equals(this.status, syncReplicationPlan.status)
                && Objects.equals(this.storageEncrypted, syncReplicationPlan.storageEncrypted)
                && Objects.equals(this.storagePolicy, syncReplicationPlan.storagePolicy)
                && Objects.equals(this.targetCluster, syncReplicationPlan.targetCluster)
                && Objects.equals(
                        this.targetClusterDescriptor, syncReplicationPlan.targetClusterDescriptor)
                && Objects.equals(
                        this.targetReplicationService, syncReplicationPlan.targetReplicationService)
                && Objects.equals(this.thinProvision, syncReplicationPlan.thinProvision)
                && Objects.equals(this.timePoints, syncReplicationPlan.timePoints)
                && Objects.equals(this.type, syncReplicationPlan.type)
                && Objects.equals(this.updatedAt, syncReplicationPlan.updatedAt)
                && Objects.equals(this.vms, syncReplicationPlan.vms)
                && Objects.equals(this.weekdays, syncReplicationPlan.weekdays);
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
                activationTimestamp,
                compression,
                createdAt,
                dataVersion,
                deleteStrategy,
                description,
                ecK,
                ecM,
                entityAsyncStatus,
                failoverTestIpMapping,
                failoverTestKeepMacAddress,
                failoverTestNameRule,
                failoverTestNameSetting,
                failoverTestNetworkMapping,
                id,
                inbound,
                initializationTimePoint,
                interval,
                ipMapping,
                keepMacAddress,
                keepPolicy,
                keepPolicyValue,
                name,
                networkMapping,
                objectsDescriptor,
                period,
                phase,
                replicaNameRule,
                replicaNameSetting,
                replicaNum,
                replicaVms,
                resiliencyType,
                resourceVersion,
                snapshotConsistentType,
                status,
                storageEncrypted,
                storagePolicy,
                targetCluster,
                targetClusterDescriptor,
                targetReplicationService,
                thinProvision,
                timePoints,
                type,
                updatedAt,
                vms,
                weekdays);
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
        sb.append("class SyncReplicationPlan {\n");
        sb.append("    activationTimestamp: ")
                .append(toIndentedString(activationTimestamp))
                .append("\n");
        sb.append("    compression: ").append(toIndentedString(compression)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    dataVersion: ").append(toIndentedString(dataVersion)).append("\n");
        sb.append("    deleteStrategy: ").append(toIndentedString(deleteStrategy)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    ecK: ").append(toIndentedString(ecK)).append("\n");
        sb.append("    ecM: ").append(toIndentedString(ecM)).append("\n");
        sb.append("    entityAsyncStatus: ")
                .append(toIndentedString(entityAsyncStatus))
                .append("\n");
        sb.append("    failoverTestIpMapping: ")
                .append(toIndentedString(failoverTestIpMapping))
                .append("\n");
        sb.append("    failoverTestKeepMacAddress: ")
                .append(toIndentedString(failoverTestKeepMacAddress))
                .append("\n");
        sb.append("    failoverTestNameRule: ")
                .append(toIndentedString(failoverTestNameRule))
                .append("\n");
        sb.append("    failoverTestNameSetting: ")
                .append(toIndentedString(failoverTestNameSetting))
                .append("\n");
        sb.append("    failoverTestNetworkMapping: ")
                .append(toIndentedString(failoverTestNetworkMapping))
                .append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    inbound: ").append(toIndentedString(inbound)).append("\n");
        sb.append("    initializationTimePoint: ")
                .append(toIndentedString(initializationTimePoint))
                .append("\n");
        sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
        sb.append("    ipMapping: ").append(toIndentedString(ipMapping)).append("\n");
        sb.append("    keepMacAddress: ").append(toIndentedString(keepMacAddress)).append("\n");
        sb.append("    keepPolicy: ").append(toIndentedString(keepPolicy)).append("\n");
        sb.append("    keepPolicyValue: ").append(toIndentedString(keepPolicyValue)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    networkMapping: ").append(toIndentedString(networkMapping)).append("\n");
        sb.append("    objectsDescriptor: ")
                .append(toIndentedString(objectsDescriptor))
                .append("\n");
        sb.append("    period: ").append(toIndentedString(period)).append("\n");
        sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
        sb.append("    replicaNameRule: ").append(toIndentedString(replicaNameRule)).append("\n");
        sb.append("    replicaNameSetting: ")
                .append(toIndentedString(replicaNameSetting))
                .append("\n");
        sb.append("    replicaNum: ").append(toIndentedString(replicaNum)).append("\n");
        sb.append("    replicaVms: ").append(toIndentedString(replicaVms)).append("\n");
        sb.append("    resiliencyType: ").append(toIndentedString(resiliencyType)).append("\n");
        sb.append("    resourceVersion: ").append(toIndentedString(resourceVersion)).append("\n");
        sb.append("    snapshotConsistentType: ")
                .append(toIndentedString(snapshotConsistentType))
                .append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    storageEncrypted: ").append(toIndentedString(storageEncrypted)).append("\n");
        sb.append("    storagePolicy: ").append(toIndentedString(storagePolicy)).append("\n");
        sb.append("    targetCluster: ").append(toIndentedString(targetCluster)).append("\n");
        sb.append("    targetClusterDescriptor: ")
                .append(toIndentedString(targetClusterDescriptor))
                .append("\n");
        sb.append("    targetReplicationService: ")
                .append(toIndentedString(targetReplicationService))
                .append("\n");
        sb.append("    thinProvision: ").append(toIndentedString(thinProvision)).append("\n");
        sb.append("    timePoints: ").append(toIndentedString(timePoints)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    vms: ").append(toIndentedString(vms)).append("\n");
        sb.append("    weekdays: ").append(toIndentedString(weekdays)).append("\n");
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

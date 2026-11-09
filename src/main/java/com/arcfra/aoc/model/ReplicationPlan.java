package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** ReplicationPlan */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class ReplicationPlan extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_ABORT_WINDOW_UNFINISHED = "abort_window_unfinished";

    @SerializedName(SERIALIZED_NAME_ABORT_WINDOW_UNFINISHED)
    private Boolean abortWindowUnfinished;

    public static final String SERIALIZED_NAME_ACTIVATION_TIMESTAMP = "activation_timestamp";

    @SerializedName(SERIALIZED_NAME_ACTIVATION_TIMESTAMP)
    private String activationTimestamp;

    public static final String SERIALIZED_NAME_COMPRESSION = "compression";

    @SerializedName(SERIALIZED_NAME_COMPRESSION)
    private Boolean compression;

    public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";

    @SerializedName(SERIALIZED_NAME_CREATED_AT)
    private String createdAt;

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

    public static final String SERIALIZED_NAME_ENABLE_WINDOW = "enable_window";

    @SerializedName(SERIALIZED_NAME_ENABLE_WINDOW)
    private Boolean enableWindow;

    public static final String SERIALIZED_NAME_ENTITY_ASYNC_STATUS = "entityAsyncStatus";

    @SerializedName(SERIALIZED_NAME_ENTITY_ASYNC_STATUS)
    private EntityAsyncStatus entityAsyncStatus;

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

    public static final String SERIALIZED_NAME_INBOUND = "inbound";

    @SerializedName(SERIALIZED_NAME_INBOUND)
    private Boolean inbound;

    public static final String SERIALIZED_NAME_INTERVAL = "interval";

    @SerializedName(SERIALIZED_NAME_INTERVAL)
    private Integer interval;

    public static final String SERIALIZED_NAME_IP_MAPPING = "ip_mapping";

    @SerializedName(SERIALIZED_NAME_IP_MAPPING)
    private List<NestedReplicationIPAddressMapping> ipMapping =
            new ArrayList<NestedReplicationIPAddressMapping>();

    public static final String SERIALIZED_NAME_ISCSI_LUNS = "iscsi_luns";

    @SerializedName(SERIALIZED_NAME_ISCSI_LUNS)
    private List<NestedIscsiLun> iscsiLuns = null;

    public static final String SERIALIZED_NAME_KEEP_MAC_ADDRESS = "keep_mac_address";

    @SerializedName(SERIALIZED_NAME_KEEP_MAC_ADDRESS)
    private Boolean keepMacAddress;

    public static final String SERIALIZED_NAME_KEEP_POLICY = "keep_policy";

    @SerializedName(SERIALIZED_NAME_KEEP_POLICY)
    private BackupPlanKeepPolicy keepPolicy;

    public static final String SERIALIZED_NAME_KEEP_POLICY_VALUE = "keep_policy_value";

    @SerializedName(SERIALIZED_NAME_KEEP_POLICY_VALUE)
    private Integer keepPolicyValue;

    public static final String SERIALIZED_NAME_LAST_EXECUTE_STATUS = "last_execute_status";

    @SerializedName(SERIALIZED_NAME_LAST_EXECUTE_STATUS)
    private BackupPlanExecutionStatus lastExecuteStatus;

    public static final String SERIALIZED_NAME_LAST_EXECUTE_STATUS_MESSAGE =
            "last_execute_status_message";

    @SerializedName(SERIALIZED_NAME_LAST_EXECUTE_STATUS_MESSAGE)
    private String lastExecuteStatusMessage;

    public static final String SERIALIZED_NAME_LAST_EXECUTE_SUCCESS_JOB_COUNT =
            "last_execute_success_job_count";

    @SerializedName(SERIALIZED_NAME_LAST_EXECUTE_SUCCESS_JOB_COUNT)
    private Integer lastExecuteSuccessJobCount;

    public static final String SERIALIZED_NAME_LAST_EXECUTE_TOTAL_JOB_COUNT =
            "last_execute_total_job_count";

    @SerializedName(SERIALIZED_NAME_LAST_EXECUTE_TOTAL_JOB_COUNT)
    private Integer lastExecuteTotalJobCount;

    public static final String SERIALIZED_NAME_LAST_EXECUTED_AT = "last_executed_at";

    @SerializedName(SERIALIZED_NAME_LAST_EXECUTED_AT)
    private String lastExecutedAt;

    public static final String SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS =
            "last_manual_execute_status";

    @SerializedName(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS)
    private BackupPlanExecutionStatus lastManualExecuteStatus;

    public static final String SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_MESSAGE =
            "last_manual_execute_status_message";

    @SerializedName(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_MESSAGE)
    private String lastManualExecuteStatusMessage;

    public static final String SERIALIZED_NAME_LAST_MANUAL_EXECUTE_SUCCESS_JOB_COUNT =
            "last_manual_execute_success_job_count";

    @SerializedName(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_SUCCESS_JOB_COUNT)
    private Integer lastManualExecuteSuccessJobCount;

    public static final String SERIALIZED_NAME_LAST_MANUAL_EXECUTE_TOTAL_JOB_COUNT =
            "last_manual_execute_total_job_count";

    @SerializedName(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_TOTAL_JOB_COUNT)
    private Integer lastManualExecuteTotalJobCount;

    public static final String SERIALIZED_NAME_LAST_MANUAL_EXECUTED_AT = "last_manual_executed_at";

    @SerializedName(SERIALIZED_NAME_LAST_MANUAL_EXECUTED_AT)
    private String lastManualExecutedAt;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_NETWORK_MAPPING = "network_mapping";

    @SerializedName(SERIALIZED_NAME_NETWORK_MAPPING)
    private List<NestedReplicationPlanNetworkMapping> networkMapping =
            new ArrayList<NestedReplicationPlanNetworkMapping>();

    public static final String SERIALIZED_NAME_NEXT_EXECUTION_TIME = "next_execution_time";

    @SerializedName(SERIALIZED_NAME_NEXT_EXECUTION_TIME)
    private String nextExecutionTime;

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

    public static final String SERIALIZED_NAME_SNAPSHOT_CONSISTENT_TYPE =
            "snapshot_consistent_type";

    @SerializedName(SERIALIZED_NAME_SNAPSHOT_CONSISTENT_TYPE)
    private ConsistentType snapshotConsistentType;

    public static final String SERIALIZED_NAME_STATUS = "status";

    @SerializedName(SERIALIZED_NAME_STATUS)
    private BackupPlanStatus status;

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
    private List<NestedBackupPlanTimePoint> timePoints = new ArrayList<NestedBackupPlanTimePoint>();

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

    public static final String SERIALIZED_NAME_WINDOW_END = "window_end";

    @SerializedName(SERIALIZED_NAME_WINDOW_END)
    private String windowEnd;

    public static final String SERIALIZED_NAME_WINDOW_START = "window_start";

    @SerializedName(SERIALIZED_NAME_WINDOW_START)
    private String windowStart;

    public ReplicationPlan() {}

    public ReplicationPlan abortWindowUnfinished(Boolean abortWindowUnfinished) {

        this.abortWindowUnfinished = abortWindowUnfinished;
        return this;
    }

    /**
     * Get abortWindowUnfinished
     *
     * @return abortWindowUnfinished
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getAbortWindowUnfinished() {
        return abortWindowUnfinished;
    }

    public void setAbortWindowUnfinished(Boolean abortWindowUnfinished) {
        this.abortWindowUnfinished = abortWindowUnfinished;
    }

    public ReplicationPlan abortWindowUnfinished_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ABORT_WINDOW_UNFINISHED);
        return this;
    }

    public ReplicationPlan abortWindowUnfinished_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ABORT_WINDOW_UNFINISHED);
        return this;
    }

    public void setAbortWindowUnfinished_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ABORT_WINDOW_UNFINISHED);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ABORT_WINDOW_UNFINISHED);
        }
    }

    public boolean getAbortWindowUnfinished_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ABORT_WINDOW_UNFINISHED);
    }

    public ReplicationPlan activationTimestamp(String activationTimestamp) {

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

    public ReplicationPlan activationTimestamp_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ACTIVATION_TIMESTAMP);
        return this;
    }

    public ReplicationPlan activationTimestamp_ExplictlyNonNull() {
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

    public ReplicationPlan compression(Boolean compression) {

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

    public ReplicationPlan compression_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_COMPRESSION);
        return this;
    }

    public ReplicationPlan compression_ExplictlyNonNull() {
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

    public ReplicationPlan createdAt(String createdAt) {

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

    public ReplicationPlan createdAt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT);
        return this;
    }

    public ReplicationPlan createdAt_ExplictlyNonNull() {
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

    public ReplicationPlan deleteStrategy(BackupPlanDeleteStrategy deleteStrategy) {

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

    public ReplicationPlan deleteStrategy_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DELETE_STRATEGY);
        return this;
    }

    public ReplicationPlan deleteStrategy_ExplictlyNonNull() {
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

    public ReplicationPlan description(String description) {

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

    public ReplicationPlan description_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION);
        return this;
    }

    public ReplicationPlan description_ExplictlyNonNull() {
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

    public ReplicationPlan ecK(Integer ecK) {

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

    public ReplicationPlan ecK_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EC_K);
        return this;
    }

    public ReplicationPlan ecK_ExplictlyNonNull() {
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

    public ReplicationPlan ecM(Integer ecM) {

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

    public ReplicationPlan ecM_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EC_M);
        return this;
    }

    public ReplicationPlan ecM_ExplictlyNonNull() {
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

    public ReplicationPlan enableWindow(Boolean enableWindow) {

        this.enableWindow = enableWindow;
        return this;
    }

    /**
     * Get enableWindow
     *
     * @return enableWindow
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Boolean getEnableWindow() {
        return enableWindow;
    }

    public void setEnableWindow(Boolean enableWindow) {
        this.enableWindow = enableWindow;
    }

    public ReplicationPlan enableWindow_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENABLE_WINDOW);
        return this;
    }

    public ReplicationPlan enableWindow_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ENABLE_WINDOW);
        return this;
    }

    public void setEnableWindow_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ENABLE_WINDOW);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ENABLE_WINDOW);
        }
    }

    public boolean getEnableWindow_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ENABLE_WINDOW);
    }

    public ReplicationPlan entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {

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

    public ReplicationPlan entityAsyncStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        return this;
    }

    public ReplicationPlan entityAsyncStatus_ExplictlyNonNull() {
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

    public ReplicationPlan id(String id) {

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

    public ReplicationPlan id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public ReplicationPlan id_ExplictlyNonNull() {
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

    public ReplicationPlan inbound(Boolean inbound) {

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

    public ReplicationPlan inbound_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INBOUND);
        return this;
    }

    public ReplicationPlan inbound_ExplictlyNonNull() {
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

    public ReplicationPlan interval(Integer interval) {

        this.interval = interval;
        return this;
    }

    /**
     * Get interval
     *
     * @return interval
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Integer getInterval() {
        return interval;
    }

    public void setInterval(Integer interval) {
        this.interval = interval;
    }

    public ReplicationPlan interval_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INTERVAL);
        return this;
    }

    public ReplicationPlan interval_ExplictlyNonNull() {
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

    public ReplicationPlan ipMapping(List<NestedReplicationIPAddressMapping> ipMapping) {

        this.ipMapping = ipMapping;
        return this;
    }

    public ReplicationPlan addIpMappingItem(NestedReplicationIPAddressMapping ipMappingItem) {
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

    public ReplicationPlan ipMapping_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_MAPPING);
        return this;
    }

    public ReplicationPlan ipMapping_ExplictlyNonNull() {
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

    public ReplicationPlan iscsiLuns(List<NestedIscsiLun> iscsiLuns) {

        this.iscsiLuns = iscsiLuns;
        return this;
    }

    public ReplicationPlan addIscsiLunsItem(NestedIscsiLun iscsiLunsItem) {
        if (this.iscsiLuns == null) {
            this.iscsiLuns = new ArrayList<NestedIscsiLun>();
        }
        this.iscsiLuns.add(iscsiLunsItem);
        return this;
    }

    /**
     * Get iscsiLuns
     *
     * @return iscsiLuns
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedIscsiLun> getIscsiLuns() {
        return iscsiLuns;
    }

    public void setIscsiLuns(List<NestedIscsiLun> iscsiLuns) {
        this.iscsiLuns = iscsiLuns;
    }

    public ReplicationPlan iscsiLuns_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_LUNS);
        return this;
    }

    public ReplicationPlan iscsiLuns_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_LUNS);
        return this;
    }

    public void setIscsiLuns_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_LUNS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_LUNS);
        }
    }

    public boolean getIscsiLuns_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_LUNS);
    }

    public ReplicationPlan keepMacAddress(Boolean keepMacAddress) {

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

    public ReplicationPlan keepMacAddress_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KEEP_MAC_ADDRESS);
        return this;
    }

    public ReplicationPlan keepMacAddress_ExplictlyNonNull() {
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

    public ReplicationPlan keepPolicy(BackupPlanKeepPolicy keepPolicy) {

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

    public ReplicationPlan keepPolicy_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KEEP_POLICY);
        return this;
    }

    public ReplicationPlan keepPolicy_ExplictlyNonNull() {
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

    public ReplicationPlan keepPolicyValue(Integer keepPolicyValue) {

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

    public ReplicationPlan keepPolicyValue_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KEEP_POLICY_VALUE);
        return this;
    }

    public ReplicationPlan keepPolicyValue_ExplictlyNonNull() {
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

    public ReplicationPlan lastExecuteStatus(BackupPlanExecutionStatus lastExecuteStatus) {

        this.lastExecuteStatus = lastExecuteStatus;
        return this;
    }

    /**
     * Get lastExecuteStatus
     *
     * @return lastExecuteStatus
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public BackupPlanExecutionStatus getLastExecuteStatus() {
        return lastExecuteStatus;
    }

    public void setLastExecuteStatus(BackupPlanExecutionStatus lastExecuteStatus) {
        this.lastExecuteStatus = lastExecuteStatus;
    }

    public ReplicationPlan lastExecuteStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_STATUS);
        return this;
    }

    public ReplicationPlan lastExecuteStatus_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTE_STATUS);
        return this;
    }

    public void setLastExecuteStatus_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_STATUS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTE_STATUS);
        }
    }

    public boolean getLastExecuteStatus_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LAST_EXECUTE_STATUS);
    }

    public ReplicationPlan lastExecuteStatusMessage(String lastExecuteStatusMessage) {

        this.lastExecuteStatusMessage = lastExecuteStatusMessage;
        return this;
    }

    /**
     * Get lastExecuteStatusMessage
     *
     * @return lastExecuteStatusMessage
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLastExecuteStatusMessage() {
        return lastExecuteStatusMessage;
    }

    public void setLastExecuteStatusMessage(String lastExecuteStatusMessage) {
        this.lastExecuteStatusMessage = lastExecuteStatusMessage;
    }

    public ReplicationPlan lastExecuteStatusMessage_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_STATUS_MESSAGE);
        return this;
    }

    public ReplicationPlan lastExecuteStatusMessage_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTE_STATUS_MESSAGE);
        return this;
    }

    public void setLastExecuteStatusMessage_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_STATUS_MESSAGE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTE_STATUS_MESSAGE);
        }
    }

    public boolean getLastExecuteStatusMessage_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LAST_EXECUTE_STATUS_MESSAGE);
    }

    public ReplicationPlan lastExecuteSuccessJobCount(Integer lastExecuteSuccessJobCount) {

        this.lastExecuteSuccessJobCount = lastExecuteSuccessJobCount;
        return this;
    }

    /**
     * Get lastExecuteSuccessJobCount
     *
     * @return lastExecuteSuccessJobCount
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getLastExecuteSuccessJobCount() {
        return lastExecuteSuccessJobCount;
    }

    public void setLastExecuteSuccessJobCount(Integer lastExecuteSuccessJobCount) {
        this.lastExecuteSuccessJobCount = lastExecuteSuccessJobCount;
    }

    public ReplicationPlan lastExecuteSuccessJobCount_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_SUCCESS_JOB_COUNT);
        return this;
    }

    public ReplicationPlan lastExecuteSuccessJobCount_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTE_SUCCESS_JOB_COUNT);
        return this;
    }

    public void setLastExecuteSuccessJobCount_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_SUCCESS_JOB_COUNT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTE_SUCCESS_JOB_COUNT);
        }
    }

    public boolean getLastExecuteSuccessJobCount_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LAST_EXECUTE_SUCCESS_JOB_COUNT);
    }

    public ReplicationPlan lastExecuteTotalJobCount(Integer lastExecuteTotalJobCount) {

        this.lastExecuteTotalJobCount = lastExecuteTotalJobCount;
        return this;
    }

    /**
     * Get lastExecuteTotalJobCount
     *
     * @return lastExecuteTotalJobCount
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getLastExecuteTotalJobCount() {
        return lastExecuteTotalJobCount;
    }

    public void setLastExecuteTotalJobCount(Integer lastExecuteTotalJobCount) {
        this.lastExecuteTotalJobCount = lastExecuteTotalJobCount;
    }

    public ReplicationPlan lastExecuteTotalJobCount_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_TOTAL_JOB_COUNT);
        return this;
    }

    public ReplicationPlan lastExecuteTotalJobCount_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTE_TOTAL_JOB_COUNT);
        return this;
    }

    public void setLastExecuteTotalJobCount_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_TOTAL_JOB_COUNT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTE_TOTAL_JOB_COUNT);
        }
    }

    public boolean getLastExecuteTotalJobCount_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LAST_EXECUTE_TOTAL_JOB_COUNT);
    }

    public ReplicationPlan lastExecutedAt(String lastExecutedAt) {

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

    public ReplicationPlan lastExecutedAt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTED_AT);
        return this;
    }

    public ReplicationPlan lastExecutedAt_ExplictlyNonNull() {
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

    public ReplicationPlan lastManualExecuteStatus(
            BackupPlanExecutionStatus lastManualExecuteStatus) {

        this.lastManualExecuteStatus = lastManualExecuteStatus;
        return this;
    }

    /**
     * Get lastManualExecuteStatus
     *
     * @return lastManualExecuteStatus
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public BackupPlanExecutionStatus getLastManualExecuteStatus() {
        return lastManualExecuteStatus;
    }

    public void setLastManualExecuteStatus(BackupPlanExecutionStatus lastManualExecuteStatus) {
        this.lastManualExecuteStatus = lastManualExecuteStatus;
    }

    public ReplicationPlan lastManualExecuteStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS);
        return this;
    }

    public ReplicationPlan lastManualExecuteStatus_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS);
        return this;
    }

    public void setLastManualExecuteStatus_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS);
        }
    }

    public boolean getLastManualExecuteStatus_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS);
    }

    public ReplicationPlan lastManualExecuteStatusMessage(String lastManualExecuteStatusMessage) {

        this.lastManualExecuteStatusMessage = lastManualExecuteStatusMessage;
        return this;
    }

    /**
     * Get lastManualExecuteStatusMessage
     *
     * @return lastManualExecuteStatusMessage
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLastManualExecuteStatusMessage() {
        return lastManualExecuteStatusMessage;
    }

    public void setLastManualExecuteStatusMessage(String lastManualExecuteStatusMessage) {
        this.lastManualExecuteStatusMessage = lastManualExecuteStatusMessage;
    }

    public ReplicationPlan lastManualExecuteStatusMessage_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_MESSAGE);
        return this;
    }

    public ReplicationPlan lastManualExecuteStatusMessage_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_MESSAGE);
        return this;
    }

    public void setLastManualExecuteStatusMessage_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_MESSAGE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_MESSAGE);
        }
    }

    public boolean getLastManualExecuteStatusMessage_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_STATUS_MESSAGE);
    }

    public ReplicationPlan lastManualExecuteSuccessJobCount(
            Integer lastManualExecuteSuccessJobCount) {

        this.lastManualExecuteSuccessJobCount = lastManualExecuteSuccessJobCount;
        return this;
    }

    /**
     * Get lastManualExecuteSuccessJobCount
     *
     * @return lastManualExecuteSuccessJobCount
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getLastManualExecuteSuccessJobCount() {
        return lastManualExecuteSuccessJobCount;
    }

    public void setLastManualExecuteSuccessJobCount(Integer lastManualExecuteSuccessJobCount) {
        this.lastManualExecuteSuccessJobCount = lastManualExecuteSuccessJobCount;
    }

    public ReplicationPlan lastManualExecuteSuccessJobCount_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_SUCCESS_JOB_COUNT);
        return this;
    }

    public ReplicationPlan lastManualExecuteSuccessJobCount_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_SUCCESS_JOB_COUNT);
        return this;
    }

    public void setLastManualExecuteSuccessJobCount_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_SUCCESS_JOB_COUNT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_SUCCESS_JOB_COUNT);
        }
    }

    public boolean getLastManualExecuteSuccessJobCount_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_SUCCESS_JOB_COUNT);
    }

    public ReplicationPlan lastManualExecuteTotalJobCount(Integer lastManualExecuteTotalJobCount) {

        this.lastManualExecuteTotalJobCount = lastManualExecuteTotalJobCount;
        return this;
    }

    /**
     * Get lastManualExecuteTotalJobCount
     *
     * @return lastManualExecuteTotalJobCount
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getLastManualExecuteTotalJobCount() {
        return lastManualExecuteTotalJobCount;
    }

    public void setLastManualExecuteTotalJobCount(Integer lastManualExecuteTotalJobCount) {
        this.lastManualExecuteTotalJobCount = lastManualExecuteTotalJobCount;
    }

    public ReplicationPlan lastManualExecuteTotalJobCount_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_TOTAL_JOB_COUNT);
        return this;
    }

    public ReplicationPlan lastManualExecuteTotalJobCount_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_TOTAL_JOB_COUNT);
        return this;
    }

    public void setLastManualExecuteTotalJobCount_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_TOTAL_JOB_COUNT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_TOTAL_JOB_COUNT);
        }
    }

    public boolean getLastManualExecuteTotalJobCount_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LAST_MANUAL_EXECUTE_TOTAL_JOB_COUNT);
    }

    public ReplicationPlan lastManualExecutedAt(String lastManualExecutedAt) {

        this.lastManualExecutedAt = lastManualExecutedAt;
        return this;
    }

    /**
     * Get lastManualExecutedAt
     *
     * @return lastManualExecutedAt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLastManualExecutedAt() {
        return lastManualExecutedAt;
    }

    public void setLastManualExecutedAt(String lastManualExecutedAt) {
        this.lastManualExecutedAt = lastManualExecutedAt;
    }

    public ReplicationPlan lastManualExecutedAt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTED_AT);
        return this;
    }

    public ReplicationPlan lastManualExecutedAt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_MANUAL_EXECUTED_AT);
        return this;
    }

    public void setLastManualExecutedAt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_MANUAL_EXECUTED_AT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_MANUAL_EXECUTED_AT);
        }
    }

    public boolean getLastManualExecutedAt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LAST_MANUAL_EXECUTED_AT);
    }

    public ReplicationPlan name(String name) {

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

    public ReplicationPlan name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public ReplicationPlan name_ExplictlyNonNull() {
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

    public ReplicationPlan networkMapping(
            List<NestedReplicationPlanNetworkMapping> networkMapping) {

        this.networkMapping = networkMapping;
        return this;
    }

    public ReplicationPlan addNetworkMappingItem(
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

    public ReplicationPlan networkMapping_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NETWORK_MAPPING);
        return this;
    }

    public ReplicationPlan networkMapping_ExplictlyNonNull() {
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

    public ReplicationPlan nextExecutionTime(String nextExecutionTime) {

        this.nextExecutionTime = nextExecutionTime;
        return this;
    }

    /**
     * Get nextExecutionTime
     *
     * @return nextExecutionTime
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNextExecutionTime() {
        return nextExecutionTime;
    }

    public void setNextExecutionTime(String nextExecutionTime) {
        this.nextExecutionTime = nextExecutionTime;
    }

    public ReplicationPlan nextExecutionTime_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NEXT_EXECUTION_TIME);
        return this;
    }

    public ReplicationPlan nextExecutionTime_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NEXT_EXECUTION_TIME);
        return this;
    }

    public void setNextExecutionTime_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NEXT_EXECUTION_TIME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NEXT_EXECUTION_TIME);
        }
    }

    public boolean getNextExecutionTime_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NEXT_EXECUTION_TIME);
    }

    public ReplicationPlan objectsDescriptor(
            List<NestedReplicationObjectDescriptor> objectsDescriptor) {

        this.objectsDescriptor = objectsDescriptor;
        return this;
    }

    public ReplicationPlan addObjectsDescriptorItem(
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

    public ReplicationPlan objectsDescriptor_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_OBJECTS_DESCRIPTOR);
        return this;
    }

    public ReplicationPlan objectsDescriptor_ExplictlyNonNull() {
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

    public ReplicationPlan period(ReplicationPlanPeriod period) {

        this.period = period;
        return this;
    }

    /**
     * Get period
     *
     * @return period
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public ReplicationPlanPeriod getPeriod() {
        return period;
    }

    public void setPeriod(ReplicationPlanPeriod period) {
        this.period = period;
    }

    public ReplicationPlan period_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PERIOD);
        return this;
    }

    public ReplicationPlan period_ExplictlyNonNull() {
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

    public ReplicationPlan phase(BackupPlanPhase phase) {

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

    public ReplicationPlan phase_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PHASE);
        return this;
    }

    public ReplicationPlan phase_ExplictlyNonNull() {
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

    public ReplicationPlan replicaNameRule(ReplicaNameRule replicaNameRule) {

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

    public ReplicationPlan replicaNameRule_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICA_NAME_RULE);
        return this;
    }

    public ReplicationPlan replicaNameRule_ExplictlyNonNull() {
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

    public ReplicationPlan replicaNameSetting(String replicaNameSetting) {

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

    public ReplicationPlan replicaNameSetting_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICA_NAME_SETTING);
        return this;
    }

    public ReplicationPlan replicaNameSetting_ExplictlyNonNull() {
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

    public ReplicationPlan replicaNum(Integer replicaNum) {

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

    public ReplicationPlan replicaNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICA_NUM);
        return this;
    }

    public ReplicationPlan replicaNum_ExplictlyNonNull() {
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

    public ReplicationPlan replicaVms(List<NestedReplicaVm> replicaVms) {

        this.replicaVms = replicaVms;
        return this;
    }

    public ReplicationPlan addReplicaVmsItem(NestedReplicaVm replicaVmsItem) {
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

    public ReplicationPlan replicaVms_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICA_VMS);
        return this;
    }

    public ReplicationPlan replicaVms_ExplictlyNonNull() {
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

    public ReplicationPlan resiliencyType(ResiliencyType resiliencyType) {

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

    public ReplicationPlan resiliencyType_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESILIENCY_TYPE);
        return this;
    }

    public ReplicationPlan resiliencyType_ExplictlyNonNull() {
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

    public ReplicationPlan snapshotConsistentType(ConsistentType snapshotConsistentType) {

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

    public ReplicationPlan snapshotConsistentType_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT_CONSISTENT_TYPE);
        return this;
    }

    public ReplicationPlan snapshotConsistentType_ExplictlyNonNull() {
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

    public ReplicationPlan status(BackupPlanStatus status) {

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

    public ReplicationPlan status_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATUS);
        return this;
    }

    public ReplicationPlan status_ExplictlyNonNull() {
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

    public ReplicationPlan storagePolicy(VmVolumeElfStoragePolicyType storagePolicy) {

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

    public ReplicationPlan storagePolicy_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_POLICY);
        return this;
    }

    public ReplicationPlan storagePolicy_ExplictlyNonNull() {
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

    public ReplicationPlan targetCluster(NestedCluster targetCluster) {

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

    public ReplicationPlan targetCluster_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TARGET_CLUSTER);
        return this;
    }

    public ReplicationPlan targetCluster_ExplictlyNonNull() {
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

    public ReplicationPlan targetClusterDescriptor(
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

    public ReplicationPlan targetClusterDescriptor_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TARGET_CLUSTER_DESCRIPTOR);
        return this;
    }

    public ReplicationPlan targetClusterDescriptor_ExplictlyNonNull() {
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

    public ReplicationPlan targetReplicationService(
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

    public ReplicationPlan targetReplicationService_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TARGET_REPLICATION_SERVICE);
        return this;
    }

    public ReplicationPlan targetReplicationService_ExplictlyNonNull() {
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

    public ReplicationPlan thinProvision(Boolean thinProvision) {

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

    public ReplicationPlan thinProvision_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_THIN_PROVISION);
        return this;
    }

    public ReplicationPlan thinProvision_ExplictlyNonNull() {
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

    public ReplicationPlan timePoints(List<NestedBackupPlanTimePoint> timePoints) {

        this.timePoints = timePoints;
        return this;
    }

    public ReplicationPlan addTimePointsItem(NestedBackupPlanTimePoint timePointsItem) {
        this.timePoints.add(timePointsItem);
        return this;
    }

    /**
     * Get timePoints
     *
     * @return timePoints
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public List<NestedBackupPlanTimePoint> getTimePoints() {
        return timePoints;
    }

    public void setTimePoints(List<NestedBackupPlanTimePoint> timePoints) {
        this.timePoints = timePoints;
    }

    public ReplicationPlan timePoints_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TIME_POINTS);
        return this;
    }

    public ReplicationPlan timePoints_ExplictlyNonNull() {
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

    public ReplicationPlan type(ReplicationPlanType type) {

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

    public ReplicationPlan type_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE);
        return this;
    }

    public ReplicationPlan type_ExplictlyNonNull() {
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

    public ReplicationPlan updatedAt(String updatedAt) {

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

    public ReplicationPlan updatedAt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPDATED_AT);
        return this;
    }

    public ReplicationPlan updatedAt_ExplictlyNonNull() {
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

    public ReplicationPlan vms(List<NestedVm> vms) {

        this.vms = vms;
        return this;
    }

    public ReplicationPlan addVmsItem(NestedVm vmsItem) {
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

    public ReplicationPlan vms_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VMS);
        return this;
    }

    public ReplicationPlan vms_ExplictlyNonNull() {
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

    public ReplicationPlan weekdays(List<WeekdayTypeEnum> weekdays) {

        this.weekdays = weekdays;
        return this;
    }

    public ReplicationPlan addWeekdaysItem(WeekdayTypeEnum weekdaysItem) {
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

    public ReplicationPlan weekdays_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WEEKDAYS);
        return this;
    }

    public ReplicationPlan weekdays_ExplictlyNonNull() {
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

    public ReplicationPlan windowEnd(String windowEnd) {

        this.windowEnd = windowEnd;
        return this;
    }

    /**
     * Get windowEnd
     *
     * @return windowEnd
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getWindowEnd() {
        return windowEnd;
    }

    public void setWindowEnd(String windowEnd) {
        this.windowEnd = windowEnd;
    }

    public ReplicationPlan windowEnd_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WINDOW_END);
        return this;
    }

    public ReplicationPlan windowEnd_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_WINDOW_END);
        return this;
    }

    public void setWindowEnd_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_WINDOW_END);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_WINDOW_END);
        }
    }

    public boolean getWindowEnd_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_WINDOW_END);
    }

    public ReplicationPlan windowStart(String windowStart) {

        this.windowStart = windowStart;
        return this;
    }

    /**
     * Get windowStart
     *
     * @return windowStart
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getWindowStart() {
        return windowStart;
    }

    public void setWindowStart(String windowStart) {
        this.windowStart = windowStart;
    }

    public ReplicationPlan windowStart_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WINDOW_START);
        return this;
    }

    public ReplicationPlan windowStart_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_WINDOW_START);
        return this;
    }

    public void setWindowStart_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_WINDOW_START);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_WINDOW_START);
        }
    }

    public boolean getWindowStart_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_WINDOW_START);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReplicationPlan replicationPlan = (ReplicationPlan) o;
        return Objects.equals(this.abortWindowUnfinished, replicationPlan.abortWindowUnfinished)
                && Objects.equals(this.activationTimestamp, replicationPlan.activationTimestamp)
                && Objects.equals(this.compression, replicationPlan.compression)
                && Objects.equals(this.createdAt, replicationPlan.createdAt)
                && Objects.equals(this.deleteStrategy, replicationPlan.deleteStrategy)
                && Objects.equals(this.description, replicationPlan.description)
                && Objects.equals(this.ecK, replicationPlan.ecK)
                && Objects.equals(this.ecM, replicationPlan.ecM)
                && Objects.equals(this.enableWindow, replicationPlan.enableWindow)
                && Objects.equals(this.entityAsyncStatus, replicationPlan.entityAsyncStatus)
                && Objects.equals(this.id, replicationPlan.id)
                && Objects.equals(this.inbound, replicationPlan.inbound)
                && Objects.equals(this.interval, replicationPlan.interval)
                && Objects.equals(this.ipMapping, replicationPlan.ipMapping)
                && Objects.equals(this.iscsiLuns, replicationPlan.iscsiLuns)
                && Objects.equals(this.keepMacAddress, replicationPlan.keepMacAddress)
                && Objects.equals(this.keepPolicy, replicationPlan.keepPolicy)
                && Objects.equals(this.keepPolicyValue, replicationPlan.keepPolicyValue)
                && Objects.equals(this.lastExecuteStatus, replicationPlan.lastExecuteStatus)
                && Objects.equals(
                        this.lastExecuteStatusMessage, replicationPlan.lastExecuteStatusMessage)
                && Objects.equals(
                        this.lastExecuteSuccessJobCount, replicationPlan.lastExecuteSuccessJobCount)
                && Objects.equals(
                        this.lastExecuteTotalJobCount, replicationPlan.lastExecuteTotalJobCount)
                && Objects.equals(this.lastExecutedAt, replicationPlan.lastExecutedAt)
                && Objects.equals(
                        this.lastManualExecuteStatus, replicationPlan.lastManualExecuteStatus)
                && Objects.equals(
                        this.lastManualExecuteStatusMessage,
                        replicationPlan.lastManualExecuteStatusMessage)
                && Objects.equals(
                        this.lastManualExecuteSuccessJobCount,
                        replicationPlan.lastManualExecuteSuccessJobCount)
                && Objects.equals(
                        this.lastManualExecuteTotalJobCount,
                        replicationPlan.lastManualExecuteTotalJobCount)
                && Objects.equals(this.lastManualExecutedAt, replicationPlan.lastManualExecutedAt)
                && Objects.equals(this.name, replicationPlan.name)
                && Objects.equals(this.networkMapping, replicationPlan.networkMapping)
                && Objects.equals(this.nextExecutionTime, replicationPlan.nextExecutionTime)
                && Objects.equals(this.objectsDescriptor, replicationPlan.objectsDescriptor)
                && Objects.equals(this.period, replicationPlan.period)
                && Objects.equals(this.phase, replicationPlan.phase)
                && Objects.equals(this.replicaNameRule, replicationPlan.replicaNameRule)
                && Objects.equals(this.replicaNameSetting, replicationPlan.replicaNameSetting)
                && Objects.equals(this.replicaNum, replicationPlan.replicaNum)
                && Objects.equals(this.replicaVms, replicationPlan.replicaVms)
                && Objects.equals(this.resiliencyType, replicationPlan.resiliencyType)
                && Objects.equals(
                        this.snapshotConsistentType, replicationPlan.snapshotConsistentType)
                && Objects.equals(this.status, replicationPlan.status)
                && Objects.equals(this.storagePolicy, replicationPlan.storagePolicy)
                && Objects.equals(this.targetCluster, replicationPlan.targetCluster)
                && Objects.equals(
                        this.targetClusterDescriptor, replicationPlan.targetClusterDescriptor)
                && Objects.equals(
                        this.targetReplicationService, replicationPlan.targetReplicationService)
                && Objects.equals(this.thinProvision, replicationPlan.thinProvision)
                && Objects.equals(this.timePoints, replicationPlan.timePoints)
                && Objects.equals(this.type, replicationPlan.type)
                && Objects.equals(this.updatedAt, replicationPlan.updatedAt)
                && Objects.equals(this.vms, replicationPlan.vms)
                && Objects.equals(this.weekdays, replicationPlan.weekdays)
                && Objects.equals(this.windowEnd, replicationPlan.windowEnd)
                && Objects.equals(this.windowStart, replicationPlan.windowStart);
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
                abortWindowUnfinished,
                activationTimestamp,
                compression,
                createdAt,
                deleteStrategy,
                description,
                ecK,
                ecM,
                enableWindow,
                entityAsyncStatus,
                id,
                inbound,
                interval,
                ipMapping,
                iscsiLuns,
                keepMacAddress,
                keepPolicy,
                keepPolicyValue,
                lastExecuteStatus,
                lastExecuteStatusMessage,
                lastExecuteSuccessJobCount,
                lastExecuteTotalJobCount,
                lastExecutedAt,
                lastManualExecuteStatus,
                lastManualExecuteStatusMessage,
                lastManualExecuteSuccessJobCount,
                lastManualExecuteTotalJobCount,
                lastManualExecutedAt,
                name,
                networkMapping,
                nextExecutionTime,
                objectsDescriptor,
                period,
                phase,
                replicaNameRule,
                replicaNameSetting,
                replicaNum,
                replicaVms,
                resiliencyType,
                snapshotConsistentType,
                status,
                storagePolicy,
                targetCluster,
                targetClusterDescriptor,
                targetReplicationService,
                thinProvision,
                timePoints,
                type,
                updatedAt,
                vms,
                weekdays,
                windowEnd,
                windowStart);
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
        sb.append("class ReplicationPlan {\n");
        sb.append("    abortWindowUnfinished: ")
                .append(toIndentedString(abortWindowUnfinished))
                .append("\n");
        sb.append("    activationTimestamp: ")
                .append(toIndentedString(activationTimestamp))
                .append("\n");
        sb.append("    compression: ").append(toIndentedString(compression)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    deleteStrategy: ").append(toIndentedString(deleteStrategy)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    ecK: ").append(toIndentedString(ecK)).append("\n");
        sb.append("    ecM: ").append(toIndentedString(ecM)).append("\n");
        sb.append("    enableWindow: ").append(toIndentedString(enableWindow)).append("\n");
        sb.append("    entityAsyncStatus: ")
                .append(toIndentedString(entityAsyncStatus))
                .append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    inbound: ").append(toIndentedString(inbound)).append("\n");
        sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
        sb.append("    ipMapping: ").append(toIndentedString(ipMapping)).append("\n");
        sb.append("    iscsiLuns: ").append(toIndentedString(iscsiLuns)).append("\n");
        sb.append("    keepMacAddress: ").append(toIndentedString(keepMacAddress)).append("\n");
        sb.append("    keepPolicy: ").append(toIndentedString(keepPolicy)).append("\n");
        sb.append("    keepPolicyValue: ").append(toIndentedString(keepPolicyValue)).append("\n");
        sb.append("    lastExecuteStatus: ")
                .append(toIndentedString(lastExecuteStatus))
                .append("\n");
        sb.append("    lastExecuteStatusMessage: ")
                .append(toIndentedString(lastExecuteStatusMessage))
                .append("\n");
        sb.append("    lastExecuteSuccessJobCount: ")
                .append(toIndentedString(lastExecuteSuccessJobCount))
                .append("\n");
        sb.append("    lastExecuteTotalJobCount: ")
                .append(toIndentedString(lastExecuteTotalJobCount))
                .append("\n");
        sb.append("    lastExecutedAt: ").append(toIndentedString(lastExecutedAt)).append("\n");
        sb.append("    lastManualExecuteStatus: ")
                .append(toIndentedString(lastManualExecuteStatus))
                .append("\n");
        sb.append("    lastManualExecuteStatusMessage: ")
                .append(toIndentedString(lastManualExecuteStatusMessage))
                .append("\n");
        sb.append("    lastManualExecuteSuccessJobCount: ")
                .append(toIndentedString(lastManualExecuteSuccessJobCount))
                .append("\n");
        sb.append("    lastManualExecuteTotalJobCount: ")
                .append(toIndentedString(lastManualExecuteTotalJobCount))
                .append("\n");
        sb.append("    lastManualExecutedAt: ")
                .append(toIndentedString(lastManualExecutedAt))
                .append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    networkMapping: ").append(toIndentedString(networkMapping)).append("\n");
        sb.append("    nextExecutionTime: ")
                .append(toIndentedString(nextExecutionTime))
                .append("\n");
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
        sb.append("    snapshotConsistentType: ")
                .append(toIndentedString(snapshotConsistentType))
                .append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
        sb.append("    windowEnd: ").append(toIndentedString(windowEnd)).append("\n");
        sb.append("    windowStart: ").append(toIndentedString(windowStart)).append("\n");
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

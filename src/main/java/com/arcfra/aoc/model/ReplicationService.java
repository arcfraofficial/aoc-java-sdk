package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** ReplicationService */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class ReplicationService extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";

    @SerializedName(SERIALIZED_NAME_CREATED_AT)
    private String createdAt;

    public static final String SERIALIZED_NAME_DESCRIPTION = "description";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION)
    private String description;

    public static final String SERIALIZED_NAME_ENTITY_ASYNC_STATUS = "entityAsyncStatus";

    @SerializedName(SERIALIZED_NAME_ENTITY_ASYNC_STATUS)
    private EntityAsyncStatus entityAsyncStatus;

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

    public static final String SERIALIZED_NAME_KUBE_CONFIG = "kube_config";

    @SerializedName(SERIALIZED_NAME_KUBE_CONFIG)
    private String kubeConfig;

    public static final String SERIALIZED_NAME_MANAGEMENT_NETWORK = "management_network";

    @SerializedName(SERIALIZED_NAME_MANAGEMENT_NETWORK)
    private NestedReplicationServiceNetwork managementNetwork;

    public static final String SERIALIZED_NAME_MAX_FAILBACK_JOBS = "max_failback_jobs";

    @SerializedName(SERIALIZED_NAME_MAX_FAILBACK_JOBS)
    private Integer maxFailbackJobs;

    public static final String SERIALIZED_NAME_MAX_FAILBACK_SPEED_LIMIT =
            "max_failback_speed_limit";

    @SerializedName(SERIALIZED_NAME_MAX_FAILBACK_SPEED_LIMIT)
    private Double maxFailbackSpeedLimit;

    public static final String SERIALIZED_NAME_MAX_REPLICATION_JOBS = "max_replication_jobs";

    @SerializedName(SERIALIZED_NAME_MAX_REPLICATION_JOBS)
    private Integer maxReplicationJobs;

    public static final String SERIALIZED_NAME_MAX_REPLICATION_SPEED_LIMIT =
            "max_replication_speed_limit";

    @SerializedName(SERIALIZED_NAME_MAX_REPLICATION_SPEED_LIMIT)
    private Double maxReplicationSpeedLimit;

    public static final String SERIALIZED_NAME_MAX_RETRY_TIMES = "max_retry_times";

    @SerializedName(SERIALIZED_NAME_MAX_RETRY_TIMES)
    private Integer maxRetryTimes;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_REPLICATION_CLUSTERS = "replication_clusters";

    @SerializedName(SERIALIZED_NAME_REPLICATION_CLUSTERS)
    private List<NestedCluster> replicationClusters = null;

    public static final String SERIALIZED_NAME_REPLICATION_CLUSTERS_DESCRIPTOR =
            "replication_clusters_descriptor";

    @SerializedName(SERIALIZED_NAME_REPLICATION_CLUSTERS_DESCRIPTOR)
    private List<NestedReplicationClusterDescriptor> replicationClustersDescriptor =
            new ArrayList<NestedReplicationClusterDescriptor>();

    public static final String SERIALIZED_NAME_REPLICATION_NETWORK = "replication_network";

    @SerializedName(SERIALIZED_NAME_REPLICATION_NETWORK)
    private NestedReplicationServiceNetwork replicationNetwork;

    public static final String SERIALIZED_NAME_REPLICATION_PLANS = "replication_plans";

    @SerializedName(SERIALIZED_NAME_REPLICATION_PLANS)
    private List<NestedReplicationPlan> replicationPlans = null;

    public static final String SERIALIZED_NAME_RETRY_INTERVAL = "retry_interval";

    @SerializedName(SERIALIZED_NAME_RETRY_INTERVAL)
    private Integer retryInterval;

    public static final String SERIALIZED_NAME_STORAGE_NETWORK = "storage_network";

    @SerializedName(SERIALIZED_NAME_STORAGE_NETWORK)
    private NestedReplicationServiceNetwork storageNetwork;

    public static final String SERIALIZED_NAME_SYNC_REPLICATION_PLANS = "sync_replication_plans";

    @SerializedName(SERIALIZED_NAME_SYNC_REPLICATION_PLANS)
    private List<NestedSyncReplicationPlan> syncReplicationPlans = null;

    public static final String SERIALIZED_NAME_UPDATED_AT = "updatedAt";

    @SerializedName(SERIALIZED_NAME_UPDATED_AT)
    private String updatedAt;

    public ReplicationService() {}

    public ReplicationService createdAt(String createdAt) {

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

    public ReplicationService createdAt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT);
        return this;
    }

    public ReplicationService createdAt_ExplictlyNonNull() {
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

    public ReplicationService description(String description) {

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

    public ReplicationService description_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION);
        return this;
    }

    public ReplicationService description_ExplictlyNonNull() {
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

    public ReplicationService entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {

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

    public ReplicationService entityAsyncStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        return this;
    }

    public ReplicationService entityAsyncStatus_ExplictlyNonNull() {
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

    public ReplicationService id(String id) {

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

    public ReplicationService id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public ReplicationService id_ExplictlyNonNull() {
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

    public ReplicationService kubeConfig(String kubeConfig) {

        this.kubeConfig = kubeConfig;
        return this;
    }

    /**
     * Get kubeConfig
     *
     * @return kubeConfig
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getKubeConfig() {
        return kubeConfig;
    }

    public void setKubeConfig(String kubeConfig) {
        this.kubeConfig = kubeConfig;
    }

    public ReplicationService kubeConfig_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KUBE_CONFIG);
        return this;
    }

    public ReplicationService kubeConfig_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_KUBE_CONFIG);
        return this;
    }

    public void setKubeConfig_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_KUBE_CONFIG);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_KUBE_CONFIG);
        }
    }

    public boolean getKubeConfig_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_KUBE_CONFIG);
    }

    public ReplicationService managementNetwork(NestedReplicationServiceNetwork managementNetwork) {

        this.managementNetwork = managementNetwork;
        return this;
    }

    /**
     * Get managementNetwork
     *
     * @return managementNetwork
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public NestedReplicationServiceNetwork getManagementNetwork() {
        return managementNetwork;
    }

    public void setManagementNetwork(NestedReplicationServiceNetwork managementNetwork) {
        this.managementNetwork = managementNetwork;
    }

    public ReplicationService managementNetwork_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_NETWORK);
        return this;
    }

    public ReplicationService managementNetwork_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_NETWORK);
        return this;
    }

    public void setManagementNetwork_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_NETWORK);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_NETWORK);
        }
    }

    public boolean getManagementNetwork_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MANAGEMENT_NETWORK);
    }

    public ReplicationService maxFailbackJobs(Integer maxFailbackJobs) {

        this.maxFailbackJobs = maxFailbackJobs;
        return this;
    }

    /**
     * Get maxFailbackJobs
     *
     * @return maxFailbackJobs
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMaxFailbackJobs() {
        return maxFailbackJobs;
    }

    public void setMaxFailbackJobs(Integer maxFailbackJobs) {
        this.maxFailbackJobs = maxFailbackJobs;
    }

    public ReplicationService maxFailbackJobs_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_FAILBACK_JOBS);
        return this;
    }

    public ReplicationService maxFailbackJobs_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_FAILBACK_JOBS);
        return this;
    }

    public void setMaxFailbackJobs_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_FAILBACK_JOBS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_FAILBACK_JOBS);
        }
    }

    public boolean getMaxFailbackJobs_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_FAILBACK_JOBS);
    }

    public ReplicationService maxFailbackSpeedLimit(Double maxFailbackSpeedLimit) {

        this.maxFailbackSpeedLimit = maxFailbackSpeedLimit;
        return this;
    }

    /**
     * Get maxFailbackSpeedLimit
     *
     * @return maxFailbackSpeedLimit
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getMaxFailbackSpeedLimit() {
        return maxFailbackSpeedLimit;
    }

    public void setMaxFailbackSpeedLimit(Double maxFailbackSpeedLimit) {
        this.maxFailbackSpeedLimit = maxFailbackSpeedLimit;
    }

    public ReplicationService maxFailbackSpeedLimit_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_FAILBACK_SPEED_LIMIT);
        return this;
    }

    public ReplicationService maxFailbackSpeedLimit_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_FAILBACK_SPEED_LIMIT);
        return this;
    }

    public void setMaxFailbackSpeedLimit_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_FAILBACK_SPEED_LIMIT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_FAILBACK_SPEED_LIMIT);
        }
    }

    public boolean getMaxFailbackSpeedLimit_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_FAILBACK_SPEED_LIMIT);
    }

    public ReplicationService maxReplicationJobs(Integer maxReplicationJobs) {

        this.maxReplicationJobs = maxReplicationJobs;
        return this;
    }

    /**
     * Get maxReplicationJobs
     *
     * @return maxReplicationJobs
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMaxReplicationJobs() {
        return maxReplicationJobs;
    }

    public void setMaxReplicationJobs(Integer maxReplicationJobs) {
        this.maxReplicationJobs = maxReplicationJobs;
    }

    public ReplicationService maxReplicationJobs_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_REPLICATION_JOBS);
        return this;
    }

    public ReplicationService maxReplicationJobs_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_REPLICATION_JOBS);
        return this;
    }

    public void setMaxReplicationJobs_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_REPLICATION_JOBS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_REPLICATION_JOBS);
        }
    }

    public boolean getMaxReplicationJobs_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_REPLICATION_JOBS);
    }

    public ReplicationService maxReplicationSpeedLimit(Double maxReplicationSpeedLimit) {

        this.maxReplicationSpeedLimit = maxReplicationSpeedLimit;
        return this;
    }

    /**
     * Get maxReplicationSpeedLimit
     *
     * @return maxReplicationSpeedLimit
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getMaxReplicationSpeedLimit() {
        return maxReplicationSpeedLimit;
    }

    public void setMaxReplicationSpeedLimit(Double maxReplicationSpeedLimit) {
        this.maxReplicationSpeedLimit = maxReplicationSpeedLimit;
    }

    public ReplicationService maxReplicationSpeedLimit_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_REPLICATION_SPEED_LIMIT);
        return this;
    }

    public ReplicationService maxReplicationSpeedLimit_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_REPLICATION_SPEED_LIMIT);
        return this;
    }

    public void setMaxReplicationSpeedLimit_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_REPLICATION_SPEED_LIMIT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_REPLICATION_SPEED_LIMIT);
        }
    }

    public boolean getMaxReplicationSpeedLimit_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_REPLICATION_SPEED_LIMIT);
    }

    public ReplicationService maxRetryTimes(Integer maxRetryTimes) {

        this.maxRetryTimes = maxRetryTimes;
        return this;
    }

    /**
     * Get maxRetryTimes
     *
     * @return maxRetryTimes
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMaxRetryTimes() {
        return maxRetryTimes;
    }

    public void setMaxRetryTimes(Integer maxRetryTimes) {
        this.maxRetryTimes = maxRetryTimes;
    }

    public ReplicationService maxRetryTimes_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_RETRY_TIMES);
        return this;
    }

    public ReplicationService maxRetryTimes_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_RETRY_TIMES);
        return this;
    }

    public void setMaxRetryTimes_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_RETRY_TIMES);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_RETRY_TIMES);
        }
    }

    public boolean getMaxRetryTimes_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_RETRY_TIMES);
    }

    public ReplicationService name(String name) {

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

    public ReplicationService name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public ReplicationService name_ExplictlyNonNull() {
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

    public ReplicationService replicationClusters(List<NestedCluster> replicationClusters) {

        this.replicationClusters = replicationClusters;
        return this;
    }

    public ReplicationService addReplicationClustersItem(NestedCluster replicationClustersItem) {
        if (this.replicationClusters == null) {
            this.replicationClusters = new ArrayList<NestedCluster>();
        }
        this.replicationClusters.add(replicationClustersItem);
        return this;
    }

    /**
     * Get replicationClusters
     *
     * @return replicationClusters
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedCluster> getReplicationClusters() {
        return replicationClusters;
    }

    public void setReplicationClusters(List<NestedCluster> replicationClusters) {
        this.replicationClusters = replicationClusters;
    }

    public ReplicationService replicationClusters_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICATION_CLUSTERS);
        return this;
    }

    public ReplicationService replicationClusters_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REPLICATION_CLUSTERS);
        return this;
    }

    public void setReplicationClusters_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REPLICATION_CLUSTERS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REPLICATION_CLUSTERS);
        }
    }

    public boolean getReplicationClusters_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REPLICATION_CLUSTERS);
    }

    public ReplicationService replicationClustersDescriptor(
            List<NestedReplicationClusterDescriptor> replicationClustersDescriptor) {

        this.replicationClustersDescriptor = replicationClustersDescriptor;
        return this;
    }

    public ReplicationService addReplicationClustersDescriptorItem(
            NestedReplicationClusterDescriptor replicationClustersDescriptorItem) {
        this.replicationClustersDescriptor.add(replicationClustersDescriptorItem);
        return this;
    }

    /**
     * Get replicationClustersDescriptor
     *
     * @return replicationClustersDescriptor
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public List<NestedReplicationClusterDescriptor> getReplicationClustersDescriptor() {
        return replicationClustersDescriptor;
    }

    public void setReplicationClustersDescriptor(
            List<NestedReplicationClusterDescriptor> replicationClustersDescriptor) {
        this.replicationClustersDescriptor = replicationClustersDescriptor;
    }

    public ReplicationService replicationClustersDescriptor_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICATION_CLUSTERS_DESCRIPTOR);
        return this;
    }

    public ReplicationService replicationClustersDescriptor_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REPLICATION_CLUSTERS_DESCRIPTOR);
        return this;
    }

    public void setReplicationClustersDescriptor_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REPLICATION_CLUSTERS_DESCRIPTOR);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REPLICATION_CLUSTERS_DESCRIPTOR);
        }
    }

    public boolean getReplicationClustersDescriptor_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REPLICATION_CLUSTERS_DESCRIPTOR);
    }

    public ReplicationService replicationNetwork(
            NestedReplicationServiceNetwork replicationNetwork) {

        this.replicationNetwork = replicationNetwork;
        return this;
    }

    /**
     * Get replicationNetwork
     *
     * @return replicationNetwork
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public NestedReplicationServiceNetwork getReplicationNetwork() {
        return replicationNetwork;
    }

    public void setReplicationNetwork(NestedReplicationServiceNetwork replicationNetwork) {
        this.replicationNetwork = replicationNetwork;
    }

    public ReplicationService replicationNetwork_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICATION_NETWORK);
        return this;
    }

    public ReplicationService replicationNetwork_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REPLICATION_NETWORK);
        return this;
    }

    public void setReplicationNetwork_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REPLICATION_NETWORK);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REPLICATION_NETWORK);
        }
    }

    public boolean getReplicationNetwork_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REPLICATION_NETWORK);
    }

    public ReplicationService replicationPlans(List<NestedReplicationPlan> replicationPlans) {

        this.replicationPlans = replicationPlans;
        return this;
    }

    public ReplicationService addReplicationPlansItem(NestedReplicationPlan replicationPlansItem) {
        if (this.replicationPlans == null) {
            this.replicationPlans = new ArrayList<NestedReplicationPlan>();
        }
        this.replicationPlans.add(replicationPlansItem);
        return this;
    }

    /**
     * Get replicationPlans
     *
     * @return replicationPlans
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedReplicationPlan> getReplicationPlans() {
        return replicationPlans;
    }

    public void setReplicationPlans(List<NestedReplicationPlan> replicationPlans) {
        this.replicationPlans = replicationPlans;
    }

    public ReplicationService replicationPlans_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICATION_PLANS);
        return this;
    }

    public ReplicationService replicationPlans_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REPLICATION_PLANS);
        return this;
    }

    public void setReplicationPlans_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REPLICATION_PLANS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REPLICATION_PLANS);
        }
    }

    public boolean getReplicationPlans_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REPLICATION_PLANS);
    }

    public ReplicationService retryInterval(Integer retryInterval) {

        this.retryInterval = retryInterval;
        return this;
    }

    /**
     * Get retryInterval
     *
     * @return retryInterval
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getRetryInterval() {
        return retryInterval;
    }

    public void setRetryInterval(Integer retryInterval) {
        this.retryInterval = retryInterval;
    }

    public ReplicationService retryInterval_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RETRY_INTERVAL);
        return this;
    }

    public ReplicationService retryInterval_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RETRY_INTERVAL);
        return this;
    }

    public void setRetryInterval_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RETRY_INTERVAL);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RETRY_INTERVAL);
        }
    }

    public boolean getRetryInterval_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RETRY_INTERVAL);
    }

    public ReplicationService storageNetwork(NestedReplicationServiceNetwork storageNetwork) {

        this.storageNetwork = storageNetwork;
        return this;
    }

    /**
     * Get storageNetwork
     *
     * @return storageNetwork
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public NestedReplicationServiceNetwork getStorageNetwork() {
        return storageNetwork;
    }

    public void setStorageNetwork(NestedReplicationServiceNetwork storageNetwork) {
        this.storageNetwork = storageNetwork;
    }

    public ReplicationService storageNetwork_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_NETWORK);
        return this;
    }

    public ReplicationService storageNetwork_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_NETWORK);
        return this;
    }

    public void setStorageNetwork_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_NETWORK);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_NETWORK);
        }
    }

    public boolean getStorageNetwork_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_NETWORK);
    }

    public ReplicationService syncReplicationPlans(
            List<NestedSyncReplicationPlan> syncReplicationPlans) {

        this.syncReplicationPlans = syncReplicationPlans;
        return this;
    }

    public ReplicationService addSyncReplicationPlansItem(
            NestedSyncReplicationPlan syncReplicationPlansItem) {
        if (this.syncReplicationPlans == null) {
            this.syncReplicationPlans = new ArrayList<NestedSyncReplicationPlan>();
        }
        this.syncReplicationPlans.add(syncReplicationPlansItem);
        return this;
    }

    /**
     * Get syncReplicationPlans
     *
     * @return syncReplicationPlans
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedSyncReplicationPlan> getSyncReplicationPlans() {
        return syncReplicationPlans;
    }

    public void setSyncReplicationPlans(List<NestedSyncReplicationPlan> syncReplicationPlans) {
        this.syncReplicationPlans = syncReplicationPlans;
    }

    public ReplicationService syncReplicationPlans_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SYNC_REPLICATION_PLANS);
        return this;
    }

    public ReplicationService syncReplicationPlans_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SYNC_REPLICATION_PLANS);
        return this;
    }

    public void setSyncReplicationPlans_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SYNC_REPLICATION_PLANS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SYNC_REPLICATION_PLANS);
        }
    }

    public boolean getSyncReplicationPlans_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SYNC_REPLICATION_PLANS);
    }

    public ReplicationService updatedAt(String updatedAt) {

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

    public ReplicationService updatedAt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPDATED_AT);
        return this;
    }

    public ReplicationService updatedAt_ExplictlyNonNull() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReplicationService replicationService = (ReplicationService) o;
        return Objects.equals(this.createdAt, replicationService.createdAt)
                && Objects.equals(this.description, replicationService.description)
                && Objects.equals(this.entityAsyncStatus, replicationService.entityAsyncStatus)
                && Objects.equals(this.id, replicationService.id)
                && Objects.equals(this.kubeConfig, replicationService.kubeConfig)
                && Objects.equals(this.managementNetwork, replicationService.managementNetwork)
                && Objects.equals(this.maxFailbackJobs, replicationService.maxFailbackJobs)
                && Objects.equals(
                        this.maxFailbackSpeedLimit, replicationService.maxFailbackSpeedLimit)
                && Objects.equals(this.maxReplicationJobs, replicationService.maxReplicationJobs)
                && Objects.equals(
                        this.maxReplicationSpeedLimit, replicationService.maxReplicationSpeedLimit)
                && Objects.equals(this.maxRetryTimes, replicationService.maxRetryTimes)
                && Objects.equals(this.name, replicationService.name)
                && Objects.equals(this.replicationClusters, replicationService.replicationClusters)
                && Objects.equals(
                        this.replicationClustersDescriptor,
                        replicationService.replicationClustersDescriptor)
                && Objects.equals(this.replicationNetwork, replicationService.replicationNetwork)
                && Objects.equals(this.replicationPlans, replicationService.replicationPlans)
                && Objects.equals(this.retryInterval, replicationService.retryInterval)
                && Objects.equals(this.storageNetwork, replicationService.storageNetwork)
                && Objects.equals(
                        this.syncReplicationPlans, replicationService.syncReplicationPlans)
                && Objects.equals(this.updatedAt, replicationService.updatedAt);
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
                createdAt,
                description,
                entityAsyncStatus,
                id,
                kubeConfig,
                managementNetwork,
                maxFailbackJobs,
                maxFailbackSpeedLimit,
                maxReplicationJobs,
                maxReplicationSpeedLimit,
                maxRetryTimes,
                name,
                replicationClusters,
                replicationClustersDescriptor,
                replicationNetwork,
                replicationPlans,
                retryInterval,
                storageNetwork,
                syncReplicationPlans,
                updatedAt);
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
        sb.append("class ReplicationService {\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    entityAsyncStatus: ")
                .append(toIndentedString(entityAsyncStatus))
                .append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    kubeConfig: ").append(toIndentedString(kubeConfig)).append("\n");
        sb.append("    managementNetwork: ")
                .append(toIndentedString(managementNetwork))
                .append("\n");
        sb.append("    maxFailbackJobs: ").append(toIndentedString(maxFailbackJobs)).append("\n");
        sb.append("    maxFailbackSpeedLimit: ")
                .append(toIndentedString(maxFailbackSpeedLimit))
                .append("\n");
        sb.append("    maxReplicationJobs: ")
                .append(toIndentedString(maxReplicationJobs))
                .append("\n");
        sb.append("    maxReplicationSpeedLimit: ")
                .append(toIndentedString(maxReplicationSpeedLimit))
                .append("\n");
        sb.append("    maxRetryTimes: ").append(toIndentedString(maxRetryTimes)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    replicationClusters: ")
                .append(toIndentedString(replicationClusters))
                .append("\n");
        sb.append("    replicationClustersDescriptor: ")
                .append(toIndentedString(replicationClustersDescriptor))
                .append("\n");
        sb.append("    replicationNetwork: ")
                .append(toIndentedString(replicationNetwork))
                .append("\n");
        sb.append("    replicationPlans: ").append(toIndentedString(replicationPlans)).append("\n");
        sb.append("    retryInterval: ").append(toIndentedString(retryInterval)).append("\n");
        sb.append("    storageNetwork: ").append(toIndentedString(storageNetwork)).append("\n");
        sb.append("    syncReplicationPlans: ")
                .append(toIndentedString(syncReplicationPlans))
                .append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

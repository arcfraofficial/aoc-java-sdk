package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** Disk */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class Disk extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_ENTITY_ASYNC_STATUS = "entityAsyncStatus";

    @SerializedName(SERIALIZED_NAME_ENTITY_ASYNC_STATUS)
    private EntityAsyncStatus entityAsyncStatus;

    public static final String SERIALIZED_NAME_FAILURE_INFORMATION = "failure_information";

    @SerializedName(SERIALIZED_NAME_FAILURE_INFORMATION)
    private NestedDiskFailureInformation failureInformation;

    public static final String SERIALIZED_NAME_FIRMWARE = "firmware";

    @SerializedName(SERIALIZED_NAME_FIRMWARE)
    private String firmware;

    public static final String SERIALIZED_NAME_FUNCTION = "function";

    @SerializedName(SERIALIZED_NAME_FUNCTION)
    private DiskFunction function;

    public static final String SERIALIZED_NAME_HEALTH_STATUS = "health_status";

    @SerializedName(SERIALIZED_NAME_HEALTH_STATUS)
    private DiskHealthStatus healthStatus;

    public static final String SERIALIZED_NAME_HEALTHY = "healthy";

    @SerializedName(SERIALIZED_NAME_HEALTHY)
    private Boolean healthy;

    public static final String SERIALIZED_NAME_HOST = "host";

    @SerializedName(SERIALIZED_NAME_HOST)
    private NestedHost host;

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

    public static final String SERIALIZED_NAME_LABELS = "labels";

    @SerializedName(SERIALIZED_NAME_LABELS)
    private List<NestedLabel> labels = null;

    public static final String SERIALIZED_NAME_LOCAL_ID = "local_id";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID)
    private String localId;

    public static final String SERIALIZED_NAME_MODEL = "model";

    @SerializedName(SERIALIZED_NAME_MODEL)
    private String model;

    public static final String SERIALIZED_NAME_MOUNTED = "mounted";

    @SerializedName(SERIALIZED_NAME_MOUNTED)
    private Boolean mounted;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_NUMA_NODE = "numa_node";

    @SerializedName(SERIALIZED_NAME_NUMA_NODE)
    private Integer numaNode;

    public static final String SERIALIZED_NAME_OFFLINE = "offline";

    @SerializedName(SERIALIZED_NAME_OFFLINE)
    private Boolean offline;

    public static final String SERIALIZED_NAME_PARTITIONS = "partitions";

    @SerializedName(SERIALIZED_NAME_PARTITIONS)
    private List<NestedPartition> partitions = new ArrayList<NestedPartition>();

    public static final String SERIALIZED_NAME_PATH = "path";

    @SerializedName(SERIALIZED_NAME_PATH)
    private String path;

    public static final String SERIALIZED_NAME_PERSISTENT_MEMORY_TYPE = "persistent_memory_type";

    @SerializedName(SERIALIZED_NAME_PERSISTENT_MEMORY_TYPE)
    private String persistentMemoryType;

    public static final String SERIALIZED_NAME_PHYSICAL_SLOT_ON_BRICK = "physical_slot_on_brick";

    @SerializedName(SERIALIZED_NAME_PHYSICAL_SLOT_ON_BRICK)
    private Integer physicalSlotOnBrick;

    public static final String SERIALIZED_NAME_PMEM_DIMMS = "pmem_dimms";

    @SerializedName(SERIALIZED_NAME_PMEM_DIMMS)
    private List<NestedPmemDimm> pmemDimms = null;

    public static final String SERIALIZED_NAME_RECOMMENDED_USAGE = "recommended_usage";

    @SerializedName(SERIALIZED_NAME_RECOMMENDED_USAGE)
    private DiskUsage recommendedUsage;

    public static final String SERIALIZED_NAME_REMAINING_LIFE_PERCENT = "remaining_life_percent";

    @SerializedName(SERIALIZED_NAME_REMAINING_LIFE_PERCENT)
    private Integer remainingLifePercent;

    public static final String SERIALIZED_NAME_SERIAL = "serial";

    @SerializedName(SERIALIZED_NAME_SERIAL)
    private String serial;

    public static final String SERIALIZED_NAME_SIZE = "size";

    @SerializedName(SERIALIZED_NAME_SIZE)
    private Long size;

    public static final String SERIALIZED_NAME_TYPE = "type";

    @SerializedName(SERIALIZED_NAME_TYPE)
    private DiskType type;

    public static final String SERIALIZED_NAME_USAGE = "usage";

    @SerializedName(SERIALIZED_NAME_USAGE)
    private DiskUsage usage;

    public static final String SERIALIZED_NAME_USAGE_STATUS = "usage_status";

    @SerializedName(SERIALIZED_NAME_USAGE_STATUS)
    private DiskUsageStatus usageStatus;

    public Disk() {}

    public Disk entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {

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

    public Disk entityAsyncStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        return this;
    }

    public Disk entityAsyncStatus_ExplictlyNonNull() {
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

    public Disk failureInformation(NestedDiskFailureInformation failureInformation) {

        this.failureInformation = failureInformation;
        return this;
    }

    /**
     * Get failureInformation
     *
     * @return failureInformation
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NestedDiskFailureInformation getFailureInformation() {
        return failureInformation;
    }

    public void setFailureInformation(NestedDiskFailureInformation failureInformation) {
        this.failureInformation = failureInformation;
    }

    public Disk failureInformation_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FAILURE_INFORMATION);
        return this;
    }

    public Disk failureInformation_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FAILURE_INFORMATION);
        return this;
    }

    public void setFailureInformation_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FAILURE_INFORMATION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FAILURE_INFORMATION);
        }
    }

    public boolean getFailureInformation_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FAILURE_INFORMATION);
    }

    public Disk firmware(String firmware) {

        this.firmware = firmware;
        return this;
    }

    /**
     * Get firmware
     *
     * @return firmware
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getFirmware() {
        return firmware;
    }

    public void setFirmware(String firmware) {
        this.firmware = firmware;
    }

    public Disk firmware_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FIRMWARE);
        return this;
    }

    public Disk firmware_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FIRMWARE);
        return this;
    }

    public void setFirmware_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FIRMWARE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FIRMWARE);
        }
    }

    public boolean getFirmware_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FIRMWARE);
    }

    public Disk function(DiskFunction function) {

        this.function = function;
        return this;
    }

    /**
     * Get function
     *
     * @return function
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public DiskFunction getFunction() {
        return function;
    }

    public void setFunction(DiskFunction function) {
        this.function = function;
    }

    public Disk function_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FUNCTION);
        return this;
    }

    public Disk function_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FUNCTION);
        return this;
    }

    public void setFunction_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FUNCTION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FUNCTION);
        }
    }

    public boolean getFunction_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FUNCTION);
    }

    public Disk healthStatus(DiskHealthStatus healthStatus) {

        this.healthStatus = healthStatus;
        return this;
    }

    /**
     * Get healthStatus
     *
     * @return healthStatus
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public DiskHealthStatus getHealthStatus() {
        return healthStatus;
    }

    public void setHealthStatus(DiskHealthStatus healthStatus) {
        this.healthStatus = healthStatus;
    }

    public Disk healthStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HEALTH_STATUS);
        return this;
    }

    public Disk healthStatus_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HEALTH_STATUS);
        return this;
    }

    public void setHealthStatus_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HEALTH_STATUS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HEALTH_STATUS);
        }
    }

    public boolean getHealthStatus_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HEALTH_STATUS);
    }

    public Disk healthy(Boolean healthy) {

        this.healthy = healthy;
        return this;
    }

    /**
     * Get healthy
     *
     * @return healthy
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Boolean getHealthy() {
        return healthy;
    }

    public void setHealthy(Boolean healthy) {
        this.healthy = healthy;
    }

    public Disk healthy_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HEALTHY);
        return this;
    }

    public Disk healthy_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HEALTHY);
        return this;
    }

    public void setHealthy_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HEALTHY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HEALTHY);
        }
    }

    public boolean getHealthy_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HEALTHY);
    }

    public Disk host(NestedHost host) {

        this.host = host;
        return this;
    }

    /**
     * Get host
     *
     * @return host
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public NestedHost getHost() {
        return host;
    }

    public void setHost(NestedHost host) {
        this.host = host;
    }

    public Disk host_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOST);
        return this;
    }

    public Disk host_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HOST);
        return this;
    }

    public void setHost_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HOST);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HOST);
        }
    }

    public boolean getHost_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HOST);
    }

    public Disk id(String id) {

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

    public Disk id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public Disk id_ExplictlyNonNull() {
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

    public Disk labels(List<NestedLabel> labels) {

        this.labels = labels;
        return this;
    }

    public Disk addLabelsItem(NestedLabel labelsItem) {
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

    public Disk labels_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LABELS);
        return this;
    }

    public Disk labels_ExplictlyNonNull() {
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

    public Disk localId(String localId) {

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

    public Disk localId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID);
        return this;
    }

    public Disk localId_ExplictlyNonNull() {
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

    public Disk model(String model) {

        this.model = model;
        return this;
    }

    /**
     * Get model
     *
     * @return model
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Disk model_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MODEL);
        return this;
    }

    public Disk model_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MODEL);
        return this;
    }

    public void setModel_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MODEL);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MODEL);
        }
    }

    public boolean getModel_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MODEL);
    }

    public Disk mounted(Boolean mounted) {

        this.mounted = mounted;
        return this;
    }

    /**
     * Get mounted
     *
     * @return mounted
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Boolean getMounted() {
        return mounted;
    }

    public void setMounted(Boolean mounted) {
        this.mounted = mounted;
    }

    public Disk mounted_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MOUNTED);
        return this;
    }

    public Disk mounted_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MOUNTED);
        return this;
    }

    public void setMounted_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MOUNTED);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MOUNTED);
        }
    }

    public boolean getMounted_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MOUNTED);
    }

    public Disk name(String name) {

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

    public Disk name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public Disk name_ExplictlyNonNull() {
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

    public Disk numaNode(Integer numaNode) {

        this.numaNode = numaNode;
        return this;
    }

    /**
     * Get numaNode
     *
     * @return numaNode
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getNumaNode() {
        return numaNode;
    }

    public void setNumaNode(Integer numaNode) {
        this.numaNode = numaNode;
    }

    public Disk numaNode_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NUMA_NODE);
        return this;
    }

    public Disk numaNode_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NUMA_NODE);
        return this;
    }

    public void setNumaNode_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NUMA_NODE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NUMA_NODE);
        }
    }

    public boolean getNumaNode_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NUMA_NODE);
    }

    public Disk offline(Boolean offline) {

        this.offline = offline;
        return this;
    }

    /**
     * Get offline
     *
     * @return offline
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Boolean getOffline() {
        return offline;
    }

    public void setOffline(Boolean offline) {
        this.offline = offline;
    }

    public Disk offline_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_OFFLINE);
        return this;
    }

    public Disk offline_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_OFFLINE);
        return this;
    }

    public void setOffline_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_OFFLINE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_OFFLINE);
        }
    }

    public boolean getOffline_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_OFFLINE);
    }

    public Disk partitions(List<NestedPartition> partitions) {

        this.partitions = partitions;
        return this;
    }

    public Disk addPartitionsItem(NestedPartition partitionsItem) {
        this.partitions.add(partitionsItem);
        return this;
    }

    /**
     * Get partitions
     *
     * @return partitions
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public List<NestedPartition> getPartitions() {
        return partitions;
    }

    public void setPartitions(List<NestedPartition> partitions) {
        this.partitions = partitions;
    }

    public Disk partitions_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PARTITIONS);
        return this;
    }

    public Disk partitions_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PARTITIONS);
        return this;
    }

    public void setPartitions_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PARTITIONS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PARTITIONS);
        }
    }

    public boolean getPartitions_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PARTITIONS);
    }

    public Disk path(String path) {

        this.path = path;
        return this;
    }

    /**
     * Get path
     *
     * @return path
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Disk path_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PATH);
        return this;
    }

    public Disk path_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PATH);
        return this;
    }

    public void setPath_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PATH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PATH);
        }
    }

    public boolean getPath_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PATH);
    }

    public Disk persistentMemoryType(String persistentMemoryType) {

        this.persistentMemoryType = persistentMemoryType;
        return this;
    }

    /**
     * Get persistentMemoryType
     *
     * @return persistentMemoryType
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPersistentMemoryType() {
        return persistentMemoryType;
    }

    public void setPersistentMemoryType(String persistentMemoryType) {
        this.persistentMemoryType = persistentMemoryType;
    }

    public Disk persistentMemoryType_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PERSISTENT_MEMORY_TYPE);
        return this;
    }

    public Disk persistentMemoryType_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PERSISTENT_MEMORY_TYPE);
        return this;
    }

    public void setPersistentMemoryType_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PERSISTENT_MEMORY_TYPE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PERSISTENT_MEMORY_TYPE);
        }
    }

    public boolean getPersistentMemoryType_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PERSISTENT_MEMORY_TYPE);
    }

    public Disk physicalSlotOnBrick(Integer physicalSlotOnBrick) {

        this.physicalSlotOnBrick = physicalSlotOnBrick;
        return this;
    }

    /**
     * Get physicalSlotOnBrick
     *
     * @return physicalSlotOnBrick
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getPhysicalSlotOnBrick() {
        return physicalSlotOnBrick;
    }

    public void setPhysicalSlotOnBrick(Integer physicalSlotOnBrick) {
        this.physicalSlotOnBrick = physicalSlotOnBrick;
    }

    public Disk physicalSlotOnBrick_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PHYSICAL_SLOT_ON_BRICK);
        return this;
    }

    public Disk physicalSlotOnBrick_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PHYSICAL_SLOT_ON_BRICK);
        return this;
    }

    public void setPhysicalSlotOnBrick_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PHYSICAL_SLOT_ON_BRICK);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PHYSICAL_SLOT_ON_BRICK);
        }
    }

    public boolean getPhysicalSlotOnBrick_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PHYSICAL_SLOT_ON_BRICK);
    }

    public Disk pmemDimms(List<NestedPmemDimm> pmemDimms) {

        this.pmemDimms = pmemDimms;
        return this;
    }

    public Disk addPmemDimmsItem(NestedPmemDimm pmemDimmsItem) {
        if (this.pmemDimms == null) {
            this.pmemDimms = new ArrayList<NestedPmemDimm>();
        }
        this.pmemDimms.add(pmemDimmsItem);
        return this;
    }

    /**
     * Get pmemDimms
     *
     * @return pmemDimms
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedPmemDimm> getPmemDimms() {
        return pmemDimms;
    }

    public void setPmemDimms(List<NestedPmemDimm> pmemDimms) {
        this.pmemDimms = pmemDimms;
    }

    public Disk pmemDimms_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PMEM_DIMMS);
        return this;
    }

    public Disk pmemDimms_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PMEM_DIMMS);
        return this;
    }

    public void setPmemDimms_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PMEM_DIMMS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PMEM_DIMMS);
        }
    }

    public boolean getPmemDimms_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PMEM_DIMMS);
    }

    public Disk recommendedUsage(DiskUsage recommendedUsage) {

        this.recommendedUsage = recommendedUsage;
        return this;
    }

    /**
     * Get recommendedUsage
     *
     * @return recommendedUsage
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public DiskUsage getRecommendedUsage() {
        return recommendedUsage;
    }

    public void setRecommendedUsage(DiskUsage recommendedUsage) {
        this.recommendedUsage = recommendedUsage;
    }

    public Disk recommendedUsage_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RECOMMENDED_USAGE);
        return this;
    }

    public Disk recommendedUsage_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RECOMMENDED_USAGE);
        return this;
    }

    public void setRecommendedUsage_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RECOMMENDED_USAGE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RECOMMENDED_USAGE);
        }
    }

    public boolean getRecommendedUsage_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RECOMMENDED_USAGE);
    }

    public Disk remainingLifePercent(Integer remainingLifePercent) {

        this.remainingLifePercent = remainingLifePercent;
        return this;
    }

    /**
     * Get remainingLifePercent
     *
     * @return remainingLifePercent
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getRemainingLifePercent() {
        return remainingLifePercent;
    }

    public void setRemainingLifePercent(Integer remainingLifePercent) {
        this.remainingLifePercent = remainingLifePercent;
    }

    public Disk remainingLifePercent_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REMAINING_LIFE_PERCENT);
        return this;
    }

    public Disk remainingLifePercent_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REMAINING_LIFE_PERCENT);
        return this;
    }

    public void setRemainingLifePercent_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REMAINING_LIFE_PERCENT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REMAINING_LIFE_PERCENT);
        }
    }

    public boolean getRemainingLifePercent_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REMAINING_LIFE_PERCENT);
    }

    public Disk serial(String serial) {

        this.serial = serial;
        return this;
    }

    /**
     * Get serial
     *
     * @return serial
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public Disk serial_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SERIAL);
        return this;
    }

    public Disk serial_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SERIAL);
        return this;
    }

    public void setSerial_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SERIAL);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SERIAL);
        }
    }

    public boolean getSerial_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SERIAL);
    }

    public Disk size(Long size) {

        this.size = size;
        return this;
    }

    /**
     * Get size
     *
     * @return size
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public Disk size_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIZE);
        return this;
    }

    public Disk size_ExplictlyNonNull() {
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

    public Disk type(DiskType type) {

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
    public DiskType getType() {
        return type;
    }

    public void setType(DiskType type) {
        this.type = type;
    }

    public Disk type_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE);
        return this;
    }

    public Disk type_ExplictlyNonNull() {
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

    public Disk usage(DiskUsage usage) {

        this.usage = usage;
        return this;
    }

    /**
     * Get usage
     *
     * @return usage
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public DiskUsage getUsage() {
        return usage;
    }

    public void setUsage(DiskUsage usage) {
        this.usage = usage;
    }

    public Disk usage_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USAGE);
        return this;
    }

    public Disk usage_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USAGE);
        return this;
    }

    public void setUsage_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USAGE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USAGE);
        }
    }

    public boolean getUsage_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USAGE);
    }

    public Disk usageStatus(DiskUsageStatus usageStatus) {

        this.usageStatus = usageStatus;
        return this;
    }

    /**
     * Get usageStatus
     *
     * @return usageStatus
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public DiskUsageStatus getUsageStatus() {
        return usageStatus;
    }

    public void setUsageStatus(DiskUsageStatus usageStatus) {
        this.usageStatus = usageStatus;
    }

    public Disk usageStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USAGE_STATUS);
        return this;
    }

    public Disk usageStatus_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USAGE_STATUS);
        return this;
    }

    public void setUsageStatus_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USAGE_STATUS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USAGE_STATUS);
        }
    }

    public boolean getUsageStatus_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USAGE_STATUS);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Disk disk = (Disk) o;
        return Objects.equals(this.entityAsyncStatus, disk.entityAsyncStatus)
                && Objects.equals(this.failureInformation, disk.failureInformation)
                && Objects.equals(this.firmware, disk.firmware)
                && Objects.equals(this.function, disk.function)
                && Objects.equals(this.healthStatus, disk.healthStatus)
                && Objects.equals(this.healthy, disk.healthy)
                && Objects.equals(this.host, disk.host)
                && Objects.equals(this.id, disk.id)
                && Objects.equals(this.labels, disk.labels)
                && Objects.equals(this.localId, disk.localId)
                && Objects.equals(this.model, disk.model)
                && Objects.equals(this.mounted, disk.mounted)
                && Objects.equals(this.name, disk.name)
                && Objects.equals(this.numaNode, disk.numaNode)
                && Objects.equals(this.offline, disk.offline)
                && Objects.equals(this.partitions, disk.partitions)
                && Objects.equals(this.path, disk.path)
                && Objects.equals(this.persistentMemoryType, disk.persistentMemoryType)
                && Objects.equals(this.physicalSlotOnBrick, disk.physicalSlotOnBrick)
                && Objects.equals(this.pmemDimms, disk.pmemDimms)
                && Objects.equals(this.recommendedUsage, disk.recommendedUsage)
                && Objects.equals(this.remainingLifePercent, disk.remainingLifePercent)
                && Objects.equals(this.serial, disk.serial)
                && Objects.equals(this.size, disk.size)
                && Objects.equals(this.type, disk.type)
                && Objects.equals(this.usage, disk.usage)
                && Objects.equals(this.usageStatus, disk.usageStatus);
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
                entityAsyncStatus,
                failureInformation,
                firmware,
                function,
                healthStatus,
                healthy,
                host,
                id,
                labels,
                localId,
                model,
                mounted,
                name,
                numaNode,
                offline,
                partitions,
                path,
                persistentMemoryType,
                physicalSlotOnBrick,
                pmemDimms,
                recommendedUsage,
                remainingLifePercent,
                serial,
                size,
                type,
                usage,
                usageStatus);
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
        sb.append("class Disk {\n");
        sb.append("    entityAsyncStatus: ")
                .append(toIndentedString(entityAsyncStatus))
                .append("\n");
        sb.append("    failureInformation: ")
                .append(toIndentedString(failureInformation))
                .append("\n");
        sb.append("    firmware: ").append(toIndentedString(firmware)).append("\n");
        sb.append("    function: ").append(toIndentedString(function)).append("\n");
        sb.append("    healthStatus: ").append(toIndentedString(healthStatus)).append("\n");
        sb.append("    healthy: ").append(toIndentedString(healthy)).append("\n");
        sb.append("    host: ").append(toIndentedString(host)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
        sb.append("    model: ").append(toIndentedString(model)).append("\n");
        sb.append("    mounted: ").append(toIndentedString(mounted)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    numaNode: ").append(toIndentedString(numaNode)).append("\n");
        sb.append("    offline: ").append(toIndentedString(offline)).append("\n");
        sb.append("    partitions: ").append(toIndentedString(partitions)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    persistentMemoryType: ")
                .append(toIndentedString(persistentMemoryType))
                .append("\n");
        sb.append("    physicalSlotOnBrick: ")
                .append(toIndentedString(physicalSlotOnBrick))
                .append("\n");
        sb.append("    pmemDimms: ").append(toIndentedString(pmemDimms)).append("\n");
        sb.append("    recommendedUsage: ").append(toIndentedString(recommendedUsage)).append("\n");
        sb.append("    remainingLifePercent: ")
                .append(toIndentedString(remainingLifePercent))
                .append("\n");
        sb.append("    serial: ").append(toIndentedString(serial)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
        sb.append("    usageStatus: ").append(toIndentedString(usageStatus)).append("\n");
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

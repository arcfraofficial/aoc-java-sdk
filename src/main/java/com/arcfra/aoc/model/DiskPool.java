package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** DiskPool */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class DiskPool extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_CHUNK_ID = "chunk_id";

    @SerializedName(SERIALIZED_NAME_CHUNK_ID)
    private Integer chunkId;

    public static final String SERIALIZED_NAME_CHUNK_INS_ID = "chunk_ins_id";

    @SerializedName(SERIALIZED_NAME_CHUNK_INS_ID)
    private Integer chunkInsId;

    public static final String SERIALIZED_NAME_DATA_SPACE_USAGE = "data_space_usage";

    @SerializedName(SERIALIZED_NAME_DATA_SPACE_USAGE)
    private Double dataSpaceUsage;

    public static final String SERIALIZED_NAME_DIRTY_CACHE_SPACE = "dirty_cache_space";

    @SerializedName(SERIALIZED_NAME_DIRTY_CACHE_SPACE)
    private Long dirtyCacheSpace;

    public static final String SERIALIZED_NAME_DIRTY_CACHE_USAGE = "dirty_cache_usage";

    @SerializedName(SERIALIZED_NAME_DIRTY_CACHE_USAGE)
    private Double dirtyCacheUsage;

    public static final String SERIALIZED_NAME_DISKS = "disks";

    @SerializedName(SERIALIZED_NAME_DISKS)
    private List<NestedDisk> disks = null;

    public static final String SERIALIZED_NAME_FAILURE_CACHE_SPACE = "failure_cache_space";

    @SerializedName(SERIALIZED_NAME_FAILURE_CACHE_SPACE)
    private Long failureCacheSpace;

    public static final String SERIALIZED_NAME_FAILURE_DATA_SPACE = "failure_data_space";

    @SerializedName(SERIALIZED_NAME_FAILURE_DATA_SPACE)
    private Long failureDataSpace;

    public static final String SERIALIZED_NAME_HDD_DISK_COUNT = "hdd_disk_count";

    @SerializedName(SERIALIZED_NAME_HDD_DISK_COUNT)
    private Integer hddDiskCount;

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

    public static final String SERIALIZED_NAME_NUMA_NODE = "numa_node";

    @SerializedName(SERIALIZED_NAME_NUMA_NODE)
    private String numaNode;

    public static final String SERIALIZED_NAME_NVME_SSD_DISK_COUNT = "nvme_ssd_disk_count";

    @SerializedName(SERIALIZED_NAME_NVME_SSD_DISK_COUNT)
    private Integer nvmeSsdDiskCount;

    public static final String SERIALIZED_NAME_PERF_ALLOCATED_DATA_SPACE =
            "perf_allocated_data_space";

    @SerializedName(SERIALIZED_NAME_PERF_ALLOCATED_DATA_SPACE)
    private Long perfAllocatedDataSpace;

    public static final String SERIALIZED_NAME_PERF_FAILURE_DATA_SPACE = "perf_failure_data_space";

    @SerializedName(SERIALIZED_NAME_PERF_FAILURE_DATA_SPACE)
    private Long perfFailureDataSpace;

    public static final String SERIALIZED_NAME_PERF_TOTAL_DATA_CAPACITY =
            "perf_total_data_capacity";

    @SerializedName(SERIALIZED_NAME_PERF_TOTAL_DATA_CAPACITY)
    private Long perfTotalDataCapacity;

    public static final String SERIALIZED_NAME_PERF_USED_DATA_SPACE = "perf_used_data_space";

    @SerializedName(SERIALIZED_NAME_PERF_USED_DATA_SPACE)
    private Long perfUsedDataSpace;

    public static final String SERIALIZED_NAME_PERF_VALID_DATA_SPACE = "perf_valid_data_space";

    @SerializedName(SERIALIZED_NAME_PERF_VALID_DATA_SPACE)
    private Long perfValidDataSpace;

    public static final String SERIALIZED_NAME_PLANNED_PRIORITIZED_SPACE =
            "planned_prioritized_space";

    @SerializedName(SERIALIZED_NAME_PLANNED_PRIORITIZED_SPACE)
    private Long plannedPrioritizedSpace;

    public static final String SERIALIZED_NAME_PRIO_SPACE_PERCENTAGE = "prio_space_percentage";

    @SerializedName(SERIALIZED_NAME_PRIO_SPACE_PERCENTAGE)
    private Double prioSpacePercentage;

    public static final String SERIALIZED_NAME_SATA_OR_SAS_SSD_DISK_COUNT =
            "sata_or_sas_ssd_disk_count";

    @SerializedName(SERIALIZED_NAME_SATA_OR_SAS_SSD_DISK_COUNT)
    private Integer sataOrSasSsdDiskCount;

    public static final String SERIALIZED_NAME_STATUS = "status";

    @SerializedName(SERIALIZED_NAME_STATUS)
    private DiskPoolStatus status;

    public static final String SERIALIZED_NAME_TOTAL_CACHE_CAPACITY = "total_cache_capacity";

    @SerializedName(SERIALIZED_NAME_TOTAL_CACHE_CAPACITY)
    private Long totalCacheCapacity;

    public static final String SERIALIZED_NAME_TOTAL_DATA_CAPACITY = "total_data_capacity";

    @SerializedName(SERIALIZED_NAME_TOTAL_DATA_CAPACITY)
    private Long totalDataCapacity;

    public static final String SERIALIZED_NAME_USE_STATE = "use_state";

    @SerializedName(SERIALIZED_NAME_USE_STATE)
    private DiskPoolUseState useState;

    public static final String SERIALIZED_NAME_USED_CACHE_SPACE = "used_cache_space";

    @SerializedName(SERIALIZED_NAME_USED_CACHE_SPACE)
    private Long usedCacheSpace;

    public static final String SERIALIZED_NAME_USED_DATA_SPACE = "used_data_space";

    @SerializedName(SERIALIZED_NAME_USED_DATA_SPACE)
    private Long usedDataSpace;

    public static final String SERIALIZED_NAME_VALID_CACHE_SPACE = "valid_cache_space";

    @SerializedName(SERIALIZED_NAME_VALID_CACHE_SPACE)
    private Long validCacheSpace;

    public static final String SERIALIZED_NAME_VALID_FREE_CACHE_SPACE = "valid_free_cache_space";

    @SerializedName(SERIALIZED_NAME_VALID_FREE_CACHE_SPACE)
    private Long validFreeCacheSpace;

    public DiskPool() {}

    public DiskPool chunkId(Integer chunkId) {

        this.chunkId = chunkId;
        return this;
    }

    /**
     * Get chunkId
     *
     * @return chunkId
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Integer getChunkId() {
        return chunkId;
    }

    public void setChunkId(Integer chunkId) {
        this.chunkId = chunkId;
    }

    public DiskPool chunkId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHUNK_ID);
        return this;
    }

    public DiskPool chunkId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CHUNK_ID);
        return this;
    }

    public void setChunkId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CHUNK_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CHUNK_ID);
        }
    }

    public boolean getChunkId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CHUNK_ID);
    }

    public DiskPool chunkInsId(Integer chunkInsId) {

        this.chunkInsId = chunkInsId;
        return this;
    }

    /**
     * Get chunkInsId
     *
     * @return chunkInsId
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Integer getChunkInsId() {
        return chunkInsId;
    }

    public void setChunkInsId(Integer chunkInsId) {
        this.chunkInsId = chunkInsId;
    }

    public DiskPool chunkInsId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHUNK_INS_ID);
        return this;
    }

    public DiskPool chunkInsId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CHUNK_INS_ID);
        return this;
    }

    public void setChunkInsId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CHUNK_INS_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CHUNK_INS_ID);
        }
    }

    public boolean getChunkInsId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CHUNK_INS_ID);
    }

    public DiskPool dataSpaceUsage(Double dataSpaceUsage) {

        this.dataSpaceUsage = dataSpaceUsage;
        return this;
    }

    /**
     * Get dataSpaceUsage
     *
     * @return dataSpaceUsage
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Double getDataSpaceUsage() {
        return dataSpaceUsage;
    }

    public void setDataSpaceUsage(Double dataSpaceUsage) {
        this.dataSpaceUsage = dataSpaceUsage;
    }

    public DiskPool dataSpaceUsage_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATA_SPACE_USAGE);
        return this;
    }

    public DiskPool dataSpaceUsage_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATA_SPACE_USAGE);
        return this;
    }

    public void setDataSpaceUsage_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATA_SPACE_USAGE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATA_SPACE_USAGE);
        }
    }

    public boolean getDataSpaceUsage_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATA_SPACE_USAGE);
    }

    public DiskPool dirtyCacheSpace(Long dirtyCacheSpace) {

        this.dirtyCacheSpace = dirtyCacheSpace;
        return this;
    }

    /**
     * Get dirtyCacheSpace
     *
     * @return dirtyCacheSpace
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Long getDirtyCacheSpace() {
        return dirtyCacheSpace;
    }

    public void setDirtyCacheSpace(Long dirtyCacheSpace) {
        this.dirtyCacheSpace = dirtyCacheSpace;
    }

    public DiskPool dirtyCacheSpace_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DIRTY_CACHE_SPACE);
        return this;
    }

    public DiskPool dirtyCacheSpace_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DIRTY_CACHE_SPACE);
        return this;
    }

    public void setDirtyCacheSpace_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DIRTY_CACHE_SPACE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DIRTY_CACHE_SPACE);
        }
    }

    public boolean getDirtyCacheSpace_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DIRTY_CACHE_SPACE);
    }

    public DiskPool dirtyCacheUsage(Double dirtyCacheUsage) {

        this.dirtyCacheUsage = dirtyCacheUsage;
        return this;
    }

    /**
     * Get dirtyCacheUsage
     *
     * @return dirtyCacheUsage
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Double getDirtyCacheUsage() {
        return dirtyCacheUsage;
    }

    public void setDirtyCacheUsage(Double dirtyCacheUsage) {
        this.dirtyCacheUsage = dirtyCacheUsage;
    }

    public DiskPool dirtyCacheUsage_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DIRTY_CACHE_USAGE);
        return this;
    }

    public DiskPool dirtyCacheUsage_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DIRTY_CACHE_USAGE);
        return this;
    }

    public void setDirtyCacheUsage_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DIRTY_CACHE_USAGE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DIRTY_CACHE_USAGE);
        }
    }

    public boolean getDirtyCacheUsage_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DIRTY_CACHE_USAGE);
    }

    public DiskPool disks(List<NestedDisk> disks) {

        this.disks = disks;
        return this;
    }

    public DiskPool addDisksItem(NestedDisk disksItem) {
        if (this.disks == null) {
            this.disks = new ArrayList<NestedDisk>();
        }
        this.disks.add(disksItem);
        return this;
    }

    /**
     * Get disks
     *
     * @return disks
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedDisk> getDisks() {
        return disks;
    }

    public void setDisks(List<NestedDisk> disks) {
        this.disks = disks;
    }

    public DiskPool disks_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISKS);
        return this;
    }

    public DiskPool disks_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DISKS);
        return this;
    }

    public void setDisks_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DISKS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DISKS);
        }
    }

    public boolean getDisks_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DISKS);
    }

    public DiskPool failureCacheSpace(Long failureCacheSpace) {

        this.failureCacheSpace = failureCacheSpace;
        return this;
    }

    /**
     * Get failureCacheSpace
     *
     * @return failureCacheSpace
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Long getFailureCacheSpace() {
        return failureCacheSpace;
    }

    public void setFailureCacheSpace(Long failureCacheSpace) {
        this.failureCacheSpace = failureCacheSpace;
    }

    public DiskPool failureCacheSpace_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FAILURE_CACHE_SPACE);
        return this;
    }

    public DiskPool failureCacheSpace_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FAILURE_CACHE_SPACE);
        return this;
    }

    public void setFailureCacheSpace_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FAILURE_CACHE_SPACE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FAILURE_CACHE_SPACE);
        }
    }

    public boolean getFailureCacheSpace_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FAILURE_CACHE_SPACE);
    }

    public DiskPool failureDataSpace(Long failureDataSpace) {

        this.failureDataSpace = failureDataSpace;
        return this;
    }

    /**
     * Get failureDataSpace
     *
     * @return failureDataSpace
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Long getFailureDataSpace() {
        return failureDataSpace;
    }

    public void setFailureDataSpace(Long failureDataSpace) {
        this.failureDataSpace = failureDataSpace;
    }

    public DiskPool failureDataSpace_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FAILURE_DATA_SPACE);
        return this;
    }

    public DiskPool failureDataSpace_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FAILURE_DATA_SPACE);
        return this;
    }

    public void setFailureDataSpace_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FAILURE_DATA_SPACE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FAILURE_DATA_SPACE);
        }
    }

    public boolean getFailureDataSpace_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FAILURE_DATA_SPACE);
    }

    public DiskPool hddDiskCount(Integer hddDiskCount) {

        this.hddDiskCount = hddDiskCount;
        return this;
    }

    /**
     * Get hddDiskCount
     *
     * @return hddDiskCount
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Integer getHddDiskCount() {
        return hddDiskCount;
    }

    public void setHddDiskCount(Integer hddDiskCount) {
        this.hddDiskCount = hddDiskCount;
    }

    public DiskPool hddDiskCount_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HDD_DISK_COUNT);
        return this;
    }

    public DiskPool hddDiskCount_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HDD_DISK_COUNT);
        return this;
    }

    public void setHddDiskCount_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HDD_DISK_COUNT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HDD_DISK_COUNT);
        }
    }

    public boolean getHddDiskCount_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HDD_DISK_COUNT);
    }

    public DiskPool host(NestedHost host) {

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

    public DiskPool host_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOST);
        return this;
    }

    public DiskPool host_ExplictlyNonNull() {
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

    public DiskPool id(String id) {

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

    public DiskPool id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public DiskPool id_ExplictlyNonNull() {
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

    public DiskPool labels(List<NestedLabel> labels) {

        this.labels = labels;
        return this;
    }

    public DiskPool addLabelsItem(NestedLabel labelsItem) {
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

    public DiskPool labels_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LABELS);
        return this;
    }

    public DiskPool labels_ExplictlyNonNull() {
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

    public DiskPool localId(String localId) {

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

    public DiskPool localId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID);
        return this;
    }

    public DiskPool localId_ExplictlyNonNull() {
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

    public DiskPool numaNode(String numaNode) {

        this.numaNode = numaNode;
        return this;
    }

    /**
     * Get numaNode
     *
     * @return numaNode
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getNumaNode() {
        return numaNode;
    }

    public void setNumaNode(String numaNode) {
        this.numaNode = numaNode;
    }

    public DiskPool numaNode_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NUMA_NODE);
        return this;
    }

    public DiskPool numaNode_ExplictlyNonNull() {
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

    public DiskPool nvmeSsdDiskCount(Integer nvmeSsdDiskCount) {

        this.nvmeSsdDiskCount = nvmeSsdDiskCount;
        return this;
    }

    /**
     * Get nvmeSsdDiskCount
     *
     * @return nvmeSsdDiskCount
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Integer getNvmeSsdDiskCount() {
        return nvmeSsdDiskCount;
    }

    public void setNvmeSsdDiskCount(Integer nvmeSsdDiskCount) {
        this.nvmeSsdDiskCount = nvmeSsdDiskCount;
    }

    public DiskPool nvmeSsdDiskCount_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NVME_SSD_DISK_COUNT);
        return this;
    }

    public DiskPool nvmeSsdDiskCount_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NVME_SSD_DISK_COUNT);
        return this;
    }

    public void setNvmeSsdDiskCount_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NVME_SSD_DISK_COUNT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NVME_SSD_DISK_COUNT);
        }
    }

    public boolean getNvmeSsdDiskCount_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NVME_SSD_DISK_COUNT);
    }

    public DiskPool perfAllocatedDataSpace(Long perfAllocatedDataSpace) {

        this.perfAllocatedDataSpace = perfAllocatedDataSpace;
        return this;
    }

    /**
     * Get perfAllocatedDataSpace
     *
     * @return perfAllocatedDataSpace
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Long getPerfAllocatedDataSpace() {
        return perfAllocatedDataSpace;
    }

    public void setPerfAllocatedDataSpace(Long perfAllocatedDataSpace) {
        this.perfAllocatedDataSpace = perfAllocatedDataSpace;
    }

    public DiskPool perfAllocatedDataSpace_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PERF_ALLOCATED_DATA_SPACE);
        return this;
    }

    public DiskPool perfAllocatedDataSpace_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PERF_ALLOCATED_DATA_SPACE);
        return this;
    }

    public void setPerfAllocatedDataSpace_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PERF_ALLOCATED_DATA_SPACE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PERF_ALLOCATED_DATA_SPACE);
        }
    }

    public boolean getPerfAllocatedDataSpace_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PERF_ALLOCATED_DATA_SPACE);
    }

    public DiskPool perfFailureDataSpace(Long perfFailureDataSpace) {

        this.perfFailureDataSpace = perfFailureDataSpace;
        return this;
    }

    /**
     * Get perfFailureDataSpace
     *
     * @return perfFailureDataSpace
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Long getPerfFailureDataSpace() {
        return perfFailureDataSpace;
    }

    public void setPerfFailureDataSpace(Long perfFailureDataSpace) {
        this.perfFailureDataSpace = perfFailureDataSpace;
    }

    public DiskPool perfFailureDataSpace_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PERF_FAILURE_DATA_SPACE);
        return this;
    }

    public DiskPool perfFailureDataSpace_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PERF_FAILURE_DATA_SPACE);
        return this;
    }

    public void setPerfFailureDataSpace_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PERF_FAILURE_DATA_SPACE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PERF_FAILURE_DATA_SPACE);
        }
    }

    public boolean getPerfFailureDataSpace_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PERF_FAILURE_DATA_SPACE);
    }

    public DiskPool perfTotalDataCapacity(Long perfTotalDataCapacity) {

        this.perfTotalDataCapacity = perfTotalDataCapacity;
        return this;
    }

    /**
     * Get perfTotalDataCapacity
     *
     * @return perfTotalDataCapacity
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Long getPerfTotalDataCapacity() {
        return perfTotalDataCapacity;
    }

    public void setPerfTotalDataCapacity(Long perfTotalDataCapacity) {
        this.perfTotalDataCapacity = perfTotalDataCapacity;
    }

    public DiskPool perfTotalDataCapacity_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PERF_TOTAL_DATA_CAPACITY);
        return this;
    }

    public DiskPool perfTotalDataCapacity_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PERF_TOTAL_DATA_CAPACITY);
        return this;
    }

    public void setPerfTotalDataCapacity_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PERF_TOTAL_DATA_CAPACITY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PERF_TOTAL_DATA_CAPACITY);
        }
    }

    public boolean getPerfTotalDataCapacity_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PERF_TOTAL_DATA_CAPACITY);
    }

    public DiskPool perfUsedDataSpace(Long perfUsedDataSpace) {

        this.perfUsedDataSpace = perfUsedDataSpace;
        return this;
    }

    /**
     * Get perfUsedDataSpace
     *
     * @return perfUsedDataSpace
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Long getPerfUsedDataSpace() {
        return perfUsedDataSpace;
    }

    public void setPerfUsedDataSpace(Long perfUsedDataSpace) {
        this.perfUsedDataSpace = perfUsedDataSpace;
    }

    public DiskPool perfUsedDataSpace_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PERF_USED_DATA_SPACE);
        return this;
    }

    public DiskPool perfUsedDataSpace_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PERF_USED_DATA_SPACE);
        return this;
    }

    public void setPerfUsedDataSpace_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PERF_USED_DATA_SPACE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PERF_USED_DATA_SPACE);
        }
    }

    public boolean getPerfUsedDataSpace_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PERF_USED_DATA_SPACE);
    }

    public DiskPool perfValidDataSpace(Long perfValidDataSpace) {

        this.perfValidDataSpace = perfValidDataSpace;
        return this;
    }

    /**
     * Get perfValidDataSpace
     *
     * @return perfValidDataSpace
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Long getPerfValidDataSpace() {
        return perfValidDataSpace;
    }

    public void setPerfValidDataSpace(Long perfValidDataSpace) {
        this.perfValidDataSpace = perfValidDataSpace;
    }

    public DiskPool perfValidDataSpace_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PERF_VALID_DATA_SPACE);
        return this;
    }

    public DiskPool perfValidDataSpace_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PERF_VALID_DATA_SPACE);
        return this;
    }

    public void setPerfValidDataSpace_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PERF_VALID_DATA_SPACE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PERF_VALID_DATA_SPACE);
        }
    }

    public boolean getPerfValidDataSpace_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PERF_VALID_DATA_SPACE);
    }

    public DiskPool plannedPrioritizedSpace(Long plannedPrioritizedSpace) {

        this.plannedPrioritizedSpace = plannedPrioritizedSpace;
        return this;
    }

    /**
     * Get plannedPrioritizedSpace
     *
     * @return plannedPrioritizedSpace
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Long getPlannedPrioritizedSpace() {
        return plannedPrioritizedSpace;
    }

    public void setPlannedPrioritizedSpace(Long plannedPrioritizedSpace) {
        this.plannedPrioritizedSpace = plannedPrioritizedSpace;
    }

    public DiskPool plannedPrioritizedSpace_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PLANNED_PRIORITIZED_SPACE);
        return this;
    }

    public DiskPool plannedPrioritizedSpace_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PLANNED_PRIORITIZED_SPACE);
        return this;
    }

    public void setPlannedPrioritizedSpace_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PLANNED_PRIORITIZED_SPACE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PLANNED_PRIORITIZED_SPACE);
        }
    }

    public boolean getPlannedPrioritizedSpace_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PLANNED_PRIORITIZED_SPACE);
    }

    public DiskPool prioSpacePercentage(Double prioSpacePercentage) {

        this.prioSpacePercentage = prioSpacePercentage;
        return this;
    }

    /**
     * Get prioSpacePercentage
     *
     * @return prioSpacePercentage
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getPrioSpacePercentage() {
        return prioSpacePercentage;
    }

    public void setPrioSpacePercentage(Double prioSpacePercentage) {
        this.prioSpacePercentage = prioSpacePercentage;
    }

    public DiskPool prioSpacePercentage_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRIO_SPACE_PERCENTAGE);
        return this;
    }

    public DiskPool prioSpacePercentage_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRIO_SPACE_PERCENTAGE);
        return this;
    }

    public void setPrioSpacePercentage_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRIO_SPACE_PERCENTAGE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRIO_SPACE_PERCENTAGE);
        }
    }

    public boolean getPrioSpacePercentage_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRIO_SPACE_PERCENTAGE);
    }

    public DiskPool sataOrSasSsdDiskCount(Integer sataOrSasSsdDiskCount) {

        this.sataOrSasSsdDiskCount = sataOrSasSsdDiskCount;
        return this;
    }

    /**
     * Get sataOrSasSsdDiskCount
     *
     * @return sataOrSasSsdDiskCount
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Integer getSataOrSasSsdDiskCount() {
        return sataOrSasSsdDiskCount;
    }

    public void setSataOrSasSsdDiskCount(Integer sataOrSasSsdDiskCount) {
        this.sataOrSasSsdDiskCount = sataOrSasSsdDiskCount;
    }

    public DiskPool sataOrSasSsdDiskCount_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SATA_OR_SAS_SSD_DISK_COUNT);
        return this;
    }

    public DiskPool sataOrSasSsdDiskCount_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SATA_OR_SAS_SSD_DISK_COUNT);
        return this;
    }

    public void setSataOrSasSsdDiskCount_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SATA_OR_SAS_SSD_DISK_COUNT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SATA_OR_SAS_SSD_DISK_COUNT);
        }
    }

    public boolean getSataOrSasSsdDiskCount_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SATA_OR_SAS_SSD_DISK_COUNT);
    }

    public DiskPool status(DiskPoolStatus status) {

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
    public DiskPoolStatus getStatus() {
        return status;
    }

    public void setStatus(DiskPoolStatus status) {
        this.status = status;
    }

    public DiskPool status_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATUS);
        return this;
    }

    public DiskPool status_ExplictlyNonNull() {
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

    public DiskPool totalCacheCapacity(Long totalCacheCapacity) {

        this.totalCacheCapacity = totalCacheCapacity;
        return this;
    }

    /**
     * Get totalCacheCapacity
     *
     * @return totalCacheCapacity
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Long getTotalCacheCapacity() {
        return totalCacheCapacity;
    }

    public void setTotalCacheCapacity(Long totalCacheCapacity) {
        this.totalCacheCapacity = totalCacheCapacity;
    }

    public DiskPool totalCacheCapacity_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_CACHE_CAPACITY);
        return this;
    }

    public DiskPool totalCacheCapacity_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CACHE_CAPACITY);
        return this;
    }

    public void setTotalCacheCapacity_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_CACHE_CAPACITY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CACHE_CAPACITY);
        }
    }

    public boolean getTotalCacheCapacity_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_CACHE_CAPACITY);
    }

    public DiskPool totalDataCapacity(Long totalDataCapacity) {

        this.totalDataCapacity = totalDataCapacity;
        return this;
    }

    /**
     * Get totalDataCapacity
     *
     * @return totalDataCapacity
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Long getTotalDataCapacity() {
        return totalDataCapacity;
    }

    public void setTotalDataCapacity(Long totalDataCapacity) {
        this.totalDataCapacity = totalDataCapacity;
    }

    public DiskPool totalDataCapacity_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_DATA_CAPACITY);
        return this;
    }

    public DiskPool totalDataCapacity_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_DATA_CAPACITY);
        return this;
    }

    public void setTotalDataCapacity_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_DATA_CAPACITY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_DATA_CAPACITY);
        }
    }

    public boolean getTotalDataCapacity_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_DATA_CAPACITY);
    }

    public DiskPool useState(DiskPoolUseState useState) {

        this.useState = useState;
        return this;
    }

    /**
     * Get useState
     *
     * @return useState
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public DiskPoolUseState getUseState() {
        return useState;
    }

    public void setUseState(DiskPoolUseState useState) {
        this.useState = useState;
    }

    public DiskPool useState_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USE_STATE);
        return this;
    }

    public DiskPool useState_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USE_STATE);
        return this;
    }

    public void setUseState_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USE_STATE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USE_STATE);
        }
    }

    public boolean getUseState_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USE_STATE);
    }

    public DiskPool usedCacheSpace(Long usedCacheSpace) {

        this.usedCacheSpace = usedCacheSpace;
        return this;
    }

    /**
     * Get usedCacheSpace
     *
     * @return usedCacheSpace
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Long getUsedCacheSpace() {
        return usedCacheSpace;
    }

    public void setUsedCacheSpace(Long usedCacheSpace) {
        this.usedCacheSpace = usedCacheSpace;
    }

    public DiskPool usedCacheSpace_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USED_CACHE_SPACE);
        return this;
    }

    public DiskPool usedCacheSpace_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USED_CACHE_SPACE);
        return this;
    }

    public void setUsedCacheSpace_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USED_CACHE_SPACE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USED_CACHE_SPACE);
        }
    }

    public boolean getUsedCacheSpace_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USED_CACHE_SPACE);
    }

    public DiskPool usedDataSpace(Long usedDataSpace) {

        this.usedDataSpace = usedDataSpace;
        return this;
    }

    /**
     * Get usedDataSpace
     *
     * @return usedDataSpace
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Long getUsedDataSpace() {
        return usedDataSpace;
    }

    public void setUsedDataSpace(Long usedDataSpace) {
        this.usedDataSpace = usedDataSpace;
    }

    public DiskPool usedDataSpace_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USED_DATA_SPACE);
        return this;
    }

    public DiskPool usedDataSpace_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USED_DATA_SPACE);
        return this;
    }

    public void setUsedDataSpace_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USED_DATA_SPACE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USED_DATA_SPACE);
        }
    }

    public boolean getUsedDataSpace_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USED_DATA_SPACE);
    }

    public DiskPool validCacheSpace(Long validCacheSpace) {

        this.validCacheSpace = validCacheSpace;
        return this;
    }

    /**
     * Get validCacheSpace
     *
     * @return validCacheSpace
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Long getValidCacheSpace() {
        return validCacheSpace;
    }

    public void setValidCacheSpace(Long validCacheSpace) {
        this.validCacheSpace = validCacheSpace;
    }

    public DiskPool validCacheSpace_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VALID_CACHE_SPACE);
        return this;
    }

    public DiskPool validCacheSpace_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VALID_CACHE_SPACE);
        return this;
    }

    public void setValidCacheSpace_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VALID_CACHE_SPACE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VALID_CACHE_SPACE);
        }
    }

    public boolean getValidCacheSpace_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VALID_CACHE_SPACE);
    }

    public DiskPool validFreeCacheSpace(Long validFreeCacheSpace) {

        this.validFreeCacheSpace = validFreeCacheSpace;
        return this;
    }

    /**
     * Get validFreeCacheSpace
     *
     * @return validFreeCacheSpace
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Long getValidFreeCacheSpace() {
        return validFreeCacheSpace;
    }

    public void setValidFreeCacheSpace(Long validFreeCacheSpace) {
        this.validFreeCacheSpace = validFreeCacheSpace;
    }

    public DiskPool validFreeCacheSpace_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VALID_FREE_CACHE_SPACE);
        return this;
    }

    public DiskPool validFreeCacheSpace_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VALID_FREE_CACHE_SPACE);
        return this;
    }

    public void setValidFreeCacheSpace_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VALID_FREE_CACHE_SPACE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VALID_FREE_CACHE_SPACE);
        }
    }

    public boolean getValidFreeCacheSpace_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VALID_FREE_CACHE_SPACE);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DiskPool diskPool = (DiskPool) o;
        return Objects.equals(this.chunkId, diskPool.chunkId)
                && Objects.equals(this.chunkInsId, diskPool.chunkInsId)
                && Objects.equals(this.dataSpaceUsage, diskPool.dataSpaceUsage)
                && Objects.equals(this.dirtyCacheSpace, diskPool.dirtyCacheSpace)
                && Objects.equals(this.dirtyCacheUsage, diskPool.dirtyCacheUsage)
                && Objects.equals(this.disks, diskPool.disks)
                && Objects.equals(this.failureCacheSpace, diskPool.failureCacheSpace)
                && Objects.equals(this.failureDataSpace, diskPool.failureDataSpace)
                && Objects.equals(this.hddDiskCount, diskPool.hddDiskCount)
                && Objects.equals(this.host, diskPool.host)
                && Objects.equals(this.id, diskPool.id)
                && Objects.equals(this.labels, diskPool.labels)
                && Objects.equals(this.localId, diskPool.localId)
                && Objects.equals(this.numaNode, diskPool.numaNode)
                && Objects.equals(this.nvmeSsdDiskCount, diskPool.nvmeSsdDiskCount)
                && Objects.equals(this.perfAllocatedDataSpace, diskPool.perfAllocatedDataSpace)
                && Objects.equals(this.perfFailureDataSpace, diskPool.perfFailureDataSpace)
                && Objects.equals(this.perfTotalDataCapacity, diskPool.perfTotalDataCapacity)
                && Objects.equals(this.perfUsedDataSpace, diskPool.perfUsedDataSpace)
                && Objects.equals(this.perfValidDataSpace, diskPool.perfValidDataSpace)
                && Objects.equals(this.plannedPrioritizedSpace, diskPool.plannedPrioritizedSpace)
                && Objects.equals(this.prioSpacePercentage, diskPool.prioSpacePercentage)
                && Objects.equals(this.sataOrSasSsdDiskCount, diskPool.sataOrSasSsdDiskCount)
                && Objects.equals(this.status, diskPool.status)
                && Objects.equals(this.totalCacheCapacity, diskPool.totalCacheCapacity)
                && Objects.equals(this.totalDataCapacity, diskPool.totalDataCapacity)
                && Objects.equals(this.useState, diskPool.useState)
                && Objects.equals(this.usedCacheSpace, diskPool.usedCacheSpace)
                && Objects.equals(this.usedDataSpace, diskPool.usedDataSpace)
                && Objects.equals(this.validCacheSpace, diskPool.validCacheSpace)
                && Objects.equals(this.validFreeCacheSpace, diskPool.validFreeCacheSpace);
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
                chunkId,
                chunkInsId,
                dataSpaceUsage,
                dirtyCacheSpace,
                dirtyCacheUsage,
                disks,
                failureCacheSpace,
                failureDataSpace,
                hddDiskCount,
                host,
                id,
                labels,
                localId,
                numaNode,
                nvmeSsdDiskCount,
                perfAllocatedDataSpace,
                perfFailureDataSpace,
                perfTotalDataCapacity,
                perfUsedDataSpace,
                perfValidDataSpace,
                plannedPrioritizedSpace,
                prioSpacePercentage,
                sataOrSasSsdDiskCount,
                status,
                totalCacheCapacity,
                totalDataCapacity,
                useState,
                usedCacheSpace,
                usedDataSpace,
                validCacheSpace,
                validFreeCacheSpace);
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
        sb.append("class DiskPool {\n");
        sb.append("    chunkId: ").append(toIndentedString(chunkId)).append("\n");
        sb.append("    chunkInsId: ").append(toIndentedString(chunkInsId)).append("\n");
        sb.append("    dataSpaceUsage: ").append(toIndentedString(dataSpaceUsage)).append("\n");
        sb.append("    dirtyCacheSpace: ").append(toIndentedString(dirtyCacheSpace)).append("\n");
        sb.append("    dirtyCacheUsage: ").append(toIndentedString(dirtyCacheUsage)).append("\n");
        sb.append("    disks: ").append(toIndentedString(disks)).append("\n");
        sb.append("    failureCacheSpace: ")
                .append(toIndentedString(failureCacheSpace))
                .append("\n");
        sb.append("    failureDataSpace: ").append(toIndentedString(failureDataSpace)).append("\n");
        sb.append("    hddDiskCount: ").append(toIndentedString(hddDiskCount)).append("\n");
        sb.append("    host: ").append(toIndentedString(host)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
        sb.append("    numaNode: ").append(toIndentedString(numaNode)).append("\n");
        sb.append("    nvmeSsdDiskCount: ").append(toIndentedString(nvmeSsdDiskCount)).append("\n");
        sb.append("    perfAllocatedDataSpace: ")
                .append(toIndentedString(perfAllocatedDataSpace))
                .append("\n");
        sb.append("    perfFailureDataSpace: ")
                .append(toIndentedString(perfFailureDataSpace))
                .append("\n");
        sb.append("    perfTotalDataCapacity: ")
                .append(toIndentedString(perfTotalDataCapacity))
                .append("\n");
        sb.append("    perfUsedDataSpace: ")
                .append(toIndentedString(perfUsedDataSpace))
                .append("\n");
        sb.append("    perfValidDataSpace: ")
                .append(toIndentedString(perfValidDataSpace))
                .append("\n");
        sb.append("    plannedPrioritizedSpace: ")
                .append(toIndentedString(plannedPrioritizedSpace))
                .append("\n");
        sb.append("    prioSpacePercentage: ")
                .append(toIndentedString(prioSpacePercentage))
                .append("\n");
        sb.append("    sataOrSasSsdDiskCount: ")
                .append(toIndentedString(sataOrSasSsdDiskCount))
                .append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    totalCacheCapacity: ")
                .append(toIndentedString(totalCacheCapacity))
                .append("\n");
        sb.append("    totalDataCapacity: ")
                .append(toIndentedString(totalDataCapacity))
                .append("\n");
        sb.append("    useState: ").append(toIndentedString(useState)).append("\n");
        sb.append("    usedCacheSpace: ").append(toIndentedString(usedCacheSpace)).append("\n");
        sb.append("    usedDataSpace: ").append(toIndentedString(usedDataSpace)).append("\n");
        sb.append("    validCacheSpace: ").append(toIndentedString(validCacheSpace)).append("\n");
        sb.append("    validFreeCacheSpace: ")
                .append(toIndentedString(validFreeCacheSpace))
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

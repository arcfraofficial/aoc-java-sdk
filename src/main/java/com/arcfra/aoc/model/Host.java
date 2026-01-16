package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** Host */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class Host extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_ACCESS_IP = "access_ip";

    @SerializedName(SERIALIZED_NAME_ACCESS_IP)
    private String accessIp;

    public static final String SERIALIZED_NAME_ALLOCABLE_CPU_CORES_FOR_VM_EXCLUSIVE =
            "allocable_cpu_cores_for_vm_exclusive";

    @SerializedName(SERIALIZED_NAME_ALLOCABLE_CPU_CORES_FOR_VM_EXCLUSIVE)
    private Integer allocableCpuCoresForVmExclusive;

    public static final String SERIALIZED_NAME_ALLOCATABLE_MEMORY_BYTES =
            "allocatable_memory_bytes";

    @SerializedName(SERIALIZED_NAME_ALLOCATABLE_MEMORY_BYTES)
    private Long allocatableMemoryBytes;

    public static final String SERIALIZED_NAME_ALLOCATED_PRIORITIZED_SPACE =
            "allocated_prioritized_space";

    @SerializedName(SERIALIZED_NAME_ALLOCATED_PRIORITIZED_SPACE)
    private Long allocatedPrioritizedSpace;

    public static final String SERIALIZED_NAME_ALLOCATED_PRIORITIZED_SPACE_USAGE =
            "allocated_prioritized_space_usage";

    @SerializedName(SERIALIZED_NAME_ALLOCATED_PRIORITIZED_SPACE_USAGE)
    private Double allocatedPrioritizedSpaceUsage;

    public static final String SERIALIZED_NAME_CHUNK_ID = "chunk_id";

    @SerializedName(SERIALIZED_NAME_CHUNK_ID)
    private String chunkId;

    public static final String SERIALIZED_NAME_CLUSTER = "cluster";

    @SerializedName(SERIALIZED_NAME_CLUSTER)
    private NestedCluster cluster;

    public static final String SERIALIZED_NAME_COMMITED_MEMORY_BYTES = "commited_memory_bytes";

    @SerializedName(SERIALIZED_NAME_COMMITED_MEMORY_BYTES)
    private Long commitedMemoryBytes;

    public static final String SERIALIZED_NAME_COMPATIBLE_CPU_MODELS = "compatible_cpu_models";

    @SerializedName(SERIALIZED_NAME_COMPATIBLE_CPU_MODELS)
    private List<String> compatibleCpuModels = new ArrayList<String>();

    public static final String SERIALIZED_NAME_CONNECT_STATUS = "connect_status";

    @SerializedName(SERIALIZED_NAME_CONNECT_STATUS)
    private HostConnectStatus connectStatus;

    public static final String SERIALIZED_NAME_CPU_BRAND = "cpu_brand";

    @SerializedName(SERIALIZED_NAME_CPU_BRAND)
    private String cpuBrand;

    public static final String SERIALIZED_NAME_CPU_FAN_SPEED = "cpu_fan_speed";

    @SerializedName(SERIALIZED_NAME_CPU_FAN_SPEED)
    private List<Double> cpuFanSpeed = new ArrayList<Double>();

    public static final String SERIALIZED_NAME_CPU_FAN_SPEED_UNIT = "cpu_fan_speed_unit";

    @SerializedName(SERIALIZED_NAME_CPU_FAN_SPEED_UNIT)
    private CpuFanSpeedUnit cpuFanSpeedUnit;

    public static final String SERIALIZED_NAME_CPU_HZ_PER_CORE = "cpu_hz_per_core";

    @SerializedName(SERIALIZED_NAME_CPU_HZ_PER_CORE)
    private Long cpuHzPerCore;

    public static final String SERIALIZED_NAME_CPU_MODEL = "cpu_model";

    @SerializedName(SERIALIZED_NAME_CPU_MODEL)
    private String cpuModel;

    public static final String SERIALIZED_NAME_CPU_TEMPERATURE_CELSIUS = "cpu_temperature_celsius";

    @SerializedName(SERIALIZED_NAME_CPU_TEMPERATURE_CELSIUS)
    private List<Integer> cpuTemperatureCelsius = new ArrayList<Integer>();

    public static final String SERIALIZED_NAME_CPU_VENDOR = "cpu_vendor";

    @SerializedName(SERIALIZED_NAME_CPU_VENDOR)
    private String cpuVendor;

    public static final String SERIALIZED_NAME_DATA_IP = "data_ip";

    @SerializedName(SERIALIZED_NAME_DATA_IP)
    private String dataIp;

    public static final String SERIALIZED_NAME_DOWNGRADED_PRIORITIZED_SPACE =
            "downgraded_prioritized_space";

    @SerializedName(SERIALIZED_NAME_DOWNGRADED_PRIORITIZED_SPACE)
    private Long downgradedPrioritizedSpace;

    public static final String SERIALIZED_NAME_ENTITY_ASYNC_STATUS = "entityAsyncStatus";

    @SerializedName(SERIALIZED_NAME_ENTITY_ASYNC_STATUS)
    private EntityAsyncStatus entityAsyncStatus;

    public static final String SERIALIZED_NAME_FAILURE_DATA_SPACE = "failure_data_space";

    @SerializedName(SERIALIZED_NAME_FAILURE_DATA_SPACE)
    private Long failureDataSpace;

    public static final String SERIALIZED_NAME_GPU_DEVICES = "gpu_devices";

    @SerializedName(SERIALIZED_NAME_GPU_DEVICES)
    private List<NestedGpuDevice> gpuDevices = null;

    public static final String SERIALIZED_NAME_HDD_DATA_CAPACITY = "hdd_data_capacity";

    @SerializedName(SERIALIZED_NAME_HDD_DATA_CAPACITY)
    private Long hddDataCapacity;

    public static final String SERIALIZED_NAME_HDD_DISK_COUNT = "hdd_disk_count";

    @SerializedName(SERIALIZED_NAME_HDD_DISK_COUNT)
    private Integer hddDiskCount;

    public static final String SERIALIZED_NAME_HOST_STATE = "host_state";

    @SerializedName(SERIALIZED_NAME_HOST_STATE)
    private NestedMaintenanceHostState hostState;

    public static final String SERIALIZED_NAME_HYPERVISOR_IP = "hypervisor_ip";

    @SerializedName(SERIALIZED_NAME_HYPERVISOR_IP)
    private String hypervisorIp;

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

    public static final String SERIALIZED_NAME_IOMMU = "iommu";

    @SerializedName(SERIALIZED_NAME_IOMMU)
    private IommuStatus iommu;

    public static final String SERIALIZED_NAME_IS_OS_IN_RAID1 = "is_os_in_raid1";

    @SerializedName(SERIALIZED_NAME_IS_OS_IN_RAID1)
    private Boolean isOsInRaid1;

    public static final String SERIALIZED_NAME_LABELS = "labels";

    @SerializedName(SERIALIZED_NAME_LABELS)
    private List<NestedLabel> labels = null;

    public static final String SERIALIZED_NAME_LOCAL_ID = "local_id";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID)
    private String localId;

    public static final String SERIALIZED_NAME_LSM_CAP_DISK_SAFE_UMOUNT =
            "lsm_cap_disk_safe_umount";

    @SerializedName(SERIALIZED_NAME_LSM_CAP_DISK_SAFE_UMOUNT)
    private Boolean lsmCapDiskSafeUmount;

    public static final String SERIALIZED_NAME_MANAGEMENT_IP = "management_ip";

    @SerializedName(SERIALIZED_NAME_MANAGEMENT_IP)
    private String managementIp;

    public static final String SERIALIZED_NAME_MERGED_STATUS = "merged_status";

    @SerializedName(SERIALIZED_NAME_MERGED_STATUS)
    private HostMergedStatus mergedStatus;

    public static final String SERIALIZED_NAME_MODEL = "model";

    @SerializedName(SERIALIZED_NAME_MODEL)
    private String model;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_NESTED_VIRTUALIZATION = "nested_virtualization";

    @SerializedName(SERIALIZED_NAME_NESTED_VIRTUALIZATION)
    private Boolean nestedVirtualization;

    public static final String SERIALIZED_NAME_NIC_COUNT = "nic_count";

    @SerializedName(SERIALIZED_NAME_NIC_COUNT)
    private Integer nicCount;

    public static final String SERIALIZED_NAME_NICS = "nics";

    @SerializedName(SERIALIZED_NAME_NICS)
    private List<NestedNic> nics = null;

    public static final String SERIALIZED_NAME_NODE_TOPO_LOCAL_ID = "node_topo_local_id";

    @SerializedName(SERIALIZED_NAME_NODE_TOPO_LOCAL_ID)
    private String nodeTopoLocalId;

    public static final String SERIALIZED_NAME_OS_MEMORY_BYTES = "os_memory_bytes";

    @SerializedName(SERIALIZED_NAME_OS_MEMORY_BYTES)
    private Long osMemoryBytes;

    public static final String SERIALIZED_NAME_OS_VERSION = "os_version";

    @SerializedName(SERIALIZED_NAME_OS_VERSION)
    private String osVersion;

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

    public static final String SERIALIZED_NAME_PMEM_DIMM_CAPACITY = "pmem_dimm_capacity";

    @SerializedName(SERIALIZED_NAME_PMEM_DIMM_CAPACITY)
    private Long pmemDimmCapacity;

    public static final String SERIALIZED_NAME_PMEM_DIMM_COUNT = "pmem_dimm_count";

    @SerializedName(SERIALIZED_NAME_PMEM_DIMM_COUNT)
    private Integer pmemDimmCount;

    public static final String SERIALIZED_NAME_PMEM_DISK_COUNT = "pmem_disk_count";

    @SerializedName(SERIALIZED_NAME_PMEM_DISK_COUNT)
    private Integer pmemDiskCount;

    public static final String SERIALIZED_NAME_PRIO_SPACE_PERCENTAGE = "prio_space_percentage";

    @SerializedName(SERIALIZED_NAME_PRIO_SPACE_PERCENTAGE)
    private Double prioSpacePercentage;

    public static final String SERIALIZED_NAME_PROVISIONED_CPU_CORES = "provisioned_cpu_cores";

    @SerializedName(SERIALIZED_NAME_PROVISIONED_CPU_CORES)
    private Integer provisionedCpuCores;

    public static final String SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES =
            "provisioned_memory_bytes";

    @SerializedName(SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES)
    private Long provisionedMemoryBytes;

    public static final String SERIALIZED_NAME_RUNNING_PAUSE_VM_MEMORY_BYTES =
            "running_pause_vm_memory_bytes";

    @SerializedName(SERIALIZED_NAME_RUNNING_PAUSE_VM_MEMORY_BYTES)
    private Long runningPauseVmMemoryBytes;

    public static final String SERIALIZED_NAME_RUNNING_VM_NUM = "running_vm_num";

    @SerializedName(SERIALIZED_NAME_RUNNING_VM_NUM)
    private Integer runningVmNum;

    public static final String SERIALIZED_NAME_SCVM_CPU = "scvm_cpu";

    @SerializedName(SERIALIZED_NAME_SCVM_CPU)
    private Integer scvmCpu;

    public static final String SERIALIZED_NAME_SCVM_MEMORY = "scvm_memory";

    @SerializedName(SERIALIZED_NAME_SCVM_MEMORY)
    private Long scvmMemory;

    public static final String SERIALIZED_NAME_SCVM_NAME = "scvm_name";

    @SerializedName(SERIALIZED_NAME_SCVM_NAME)
    private String scvmName;

    public static final String SERIALIZED_NAME_SERIAL = "serial";

    @SerializedName(SERIALIZED_NAME_SERIAL)
    private String serial;

    public static final String SERIALIZED_NAME_SSD_DATA_CAPACITY = "ssd_data_capacity";

    @SerializedName(SERIALIZED_NAME_SSD_DATA_CAPACITY)
    private Long ssdDataCapacity;

    public static final String SERIALIZED_NAME_SSD_DISK_COUNT = "ssd_disk_count";

    @SerializedName(SERIALIZED_NAME_SSD_DISK_COUNT)
    private Integer ssdDiskCount;

    public static final String SERIALIZED_NAME_STATE = "state";

    @SerializedName(SERIALIZED_NAME_STATE)
    private HostState state;

    public static final String SERIALIZED_NAME_STATUS = "status";

    @SerializedName(SERIALIZED_NAME_STATUS)
    private HostStatus status;

    public static final String SERIALIZED_NAME_STOPPED_VM_NUM = "stopped_vm_num";

    @SerializedName(SERIALIZED_NAME_STOPPED_VM_NUM)
    private Integer stoppedVmNum;

    public static final String SERIALIZED_NAME_SUSPENDED_VM_NUM = "suspended_vm_num";

    @SerializedName(SERIALIZED_NAME_SUSPENDED_VM_NUM)
    private Integer suspendedVmNum;

    public static final String SERIALIZED_NAME_TOTAL_CACHE_CAPACITY = "total_cache_capacity";

    @SerializedName(SERIALIZED_NAME_TOTAL_CACHE_CAPACITY)
    private Long totalCacheCapacity;

    public static final String SERIALIZED_NAME_TOTAL_CPU_CORES = "total_cpu_cores";

    @SerializedName(SERIALIZED_NAME_TOTAL_CPU_CORES)
    private Integer totalCpuCores;

    public static final String SERIALIZED_NAME_TOTAL_CPU_HZ = "total_cpu_hz";

    @SerializedName(SERIALIZED_NAME_TOTAL_CPU_HZ)
    private Long totalCpuHz;

    public static final String SERIALIZED_NAME_TOTAL_CPU_SOCKETS = "total_cpu_sockets";

    @SerializedName(SERIALIZED_NAME_TOTAL_CPU_SOCKETS)
    private Integer totalCpuSockets;

    public static final String SERIALIZED_NAME_TOTAL_DATA_CAPACITY = "total_data_capacity";

    @SerializedName(SERIALIZED_NAME_TOTAL_DATA_CAPACITY)
    private Long totalDataCapacity;

    public static final String SERIALIZED_NAME_TOTAL_MEMORY_BYTES = "total_memory_bytes";

    @SerializedName(SERIALIZED_NAME_TOTAL_MEMORY_BYTES)
    private Long totalMemoryBytes;

    public static final String SERIALIZED_NAME_USB_DEVICES = "usb_devices";

    @SerializedName(SERIALIZED_NAME_USB_DEVICES)
    private List<NestedUsbDevice> usbDevices = null;

    public static final String SERIALIZED_NAME_USED_CACHE_SPACE = "used_cache_space";

    @SerializedName(SERIALIZED_NAME_USED_CACHE_SPACE)
    private Long usedCacheSpace;

    public static final String SERIALIZED_NAME_USED_CPU_HZ = "used_cpu_hz";

    @SerializedName(SERIALIZED_NAME_USED_CPU_HZ)
    private Double usedCpuHz;

    public static final String SERIALIZED_NAME_USED_DATA_SPACE = "used_data_space";

    @SerializedName(SERIALIZED_NAME_USED_DATA_SPACE)
    private Long usedDataSpace;

    public static final String SERIALIZED_NAME_USED_MEMORY_BYTES = "used_memory_bytes";

    @SerializedName(SERIALIZED_NAME_USED_MEMORY_BYTES)
    private Double usedMemoryBytes;

    public static final String SERIALIZED_NAME_VALID_CACHE_SPACE = "valid_cache_space";

    @SerializedName(SERIALIZED_NAME_VALID_CACHE_SPACE)
    private Long validCacheSpace;

    public static final String SERIALIZED_NAME_VALID_FREE_CACHE_SPACE = "valid_free_cache_space";

    @SerializedName(SERIALIZED_NAME_VALID_FREE_CACHE_SPACE)
    private Long validFreeCacheSpace;

    public static final String SERIALIZED_NAME_VM_NUM = "vm_num";

    @SerializedName(SERIALIZED_NAME_VM_NUM)
    private Integer vmNum;

    public static final String SERIALIZED_NAME_VMOTION_IP = "vmotion_ip";

    @SerializedName(SERIALIZED_NAME_VMOTION_IP)
    private String vmotionIp;

    public static final String SERIALIZED_NAME_VMS = "vms";

    @SerializedName(SERIALIZED_NAME_VMS)
    private List<NestedVm> vms = null;

    public static final String SERIALIZED_NAME_WITH_FASTER_SSD_AS_CACHE =
            "with_faster_ssd_as_cache";

    @SerializedName(SERIALIZED_NAME_WITH_FASTER_SSD_AS_CACHE)
    private Boolean withFasterSsdAsCache;

    public Host() {}

    public Host accessIp(String accessIp) {

        this.accessIp = accessIp;
        return this;
    }

    /**
     * Get accessIp
     *
     * @return accessIp
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getAccessIp() {
        return accessIp;
    }

    public void setAccessIp(String accessIp) {
        this.accessIp = accessIp;
    }

    public Host accessIp_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ACCESS_IP);
        return this;
    }

    public Host accessIp_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ACCESS_IP);
        return this;
    }

    public void setAccessIp_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ACCESS_IP);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ACCESS_IP);
        }
    }

    public boolean getAccessIp_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ACCESS_IP);
    }

    public Host allocableCpuCoresForVmExclusive(Integer allocableCpuCoresForVmExclusive) {

        this.allocableCpuCoresForVmExclusive = allocableCpuCoresForVmExclusive;
        return this;
    }

    /**
     * Get allocableCpuCoresForVmExclusive
     *
     * @return allocableCpuCoresForVmExclusive
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getAllocableCpuCoresForVmExclusive() {
        return allocableCpuCoresForVmExclusive;
    }

    public void setAllocableCpuCoresForVmExclusive(Integer allocableCpuCoresForVmExclusive) {
        this.allocableCpuCoresForVmExclusive = allocableCpuCoresForVmExclusive;
    }

    public Host allocableCpuCoresForVmExclusive_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ALLOCABLE_CPU_CORES_FOR_VM_EXCLUSIVE);
        return this;
    }

    public Host allocableCpuCoresForVmExclusive_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ALLOCABLE_CPU_CORES_FOR_VM_EXCLUSIVE);
        return this;
    }

    public void setAllocableCpuCoresForVmExclusive_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ALLOCABLE_CPU_CORES_FOR_VM_EXCLUSIVE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ALLOCABLE_CPU_CORES_FOR_VM_EXCLUSIVE);
        }
    }

    public boolean getAllocableCpuCoresForVmExclusive_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ALLOCABLE_CPU_CORES_FOR_VM_EXCLUSIVE);
    }

    public Host allocatableMemoryBytes(Long allocatableMemoryBytes) {

        this.allocatableMemoryBytes = allocatableMemoryBytes;
        return this;
    }

    /**
     * Get allocatableMemoryBytes
     *
     * @return allocatableMemoryBytes
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Long getAllocatableMemoryBytes() {
        return allocatableMemoryBytes;
    }

    public void setAllocatableMemoryBytes(Long allocatableMemoryBytes) {
        this.allocatableMemoryBytes = allocatableMemoryBytes;
    }

    public Host allocatableMemoryBytes_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ALLOCATABLE_MEMORY_BYTES);
        return this;
    }

    public Host allocatableMemoryBytes_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ALLOCATABLE_MEMORY_BYTES);
        return this;
    }

    public void setAllocatableMemoryBytes_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ALLOCATABLE_MEMORY_BYTES);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ALLOCATABLE_MEMORY_BYTES);
        }
    }

    public boolean getAllocatableMemoryBytes_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ALLOCATABLE_MEMORY_BYTES);
    }

    public Host allocatedPrioritizedSpace(Long allocatedPrioritizedSpace) {

        this.allocatedPrioritizedSpace = allocatedPrioritizedSpace;
        return this;
    }

    /**
     * Get allocatedPrioritizedSpace
     *
     * @return allocatedPrioritizedSpace
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getAllocatedPrioritizedSpace() {
        return allocatedPrioritizedSpace;
    }

    public void setAllocatedPrioritizedSpace(Long allocatedPrioritizedSpace) {
        this.allocatedPrioritizedSpace = allocatedPrioritizedSpace;
    }

    public Host allocatedPrioritizedSpace_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ALLOCATED_PRIORITIZED_SPACE);
        return this;
    }

    public Host allocatedPrioritizedSpace_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ALLOCATED_PRIORITIZED_SPACE);
        return this;
    }

    public void setAllocatedPrioritizedSpace_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ALLOCATED_PRIORITIZED_SPACE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ALLOCATED_PRIORITIZED_SPACE);
        }
    }

    public boolean getAllocatedPrioritizedSpace_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ALLOCATED_PRIORITIZED_SPACE);
    }

    public Host allocatedPrioritizedSpaceUsage(Double allocatedPrioritizedSpaceUsage) {

        this.allocatedPrioritizedSpaceUsage = allocatedPrioritizedSpaceUsage;
        return this;
    }

    /**
     * Get allocatedPrioritizedSpaceUsage
     *
     * @return allocatedPrioritizedSpaceUsage
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getAllocatedPrioritizedSpaceUsage() {
        return allocatedPrioritizedSpaceUsage;
    }

    public void setAllocatedPrioritizedSpaceUsage(Double allocatedPrioritizedSpaceUsage) {
        this.allocatedPrioritizedSpaceUsage = allocatedPrioritizedSpaceUsage;
    }

    public Host allocatedPrioritizedSpaceUsage_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ALLOCATED_PRIORITIZED_SPACE_USAGE);
        return this;
    }

    public Host allocatedPrioritizedSpaceUsage_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ALLOCATED_PRIORITIZED_SPACE_USAGE);
        return this;
    }

    public void setAllocatedPrioritizedSpaceUsage_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ALLOCATED_PRIORITIZED_SPACE_USAGE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ALLOCATED_PRIORITIZED_SPACE_USAGE);
        }
    }

    public boolean getAllocatedPrioritizedSpaceUsage_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ALLOCATED_PRIORITIZED_SPACE_USAGE);
    }

    public Host chunkId(String chunkId) {

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
    public String getChunkId() {
        return chunkId;
    }

    public void setChunkId(String chunkId) {
        this.chunkId = chunkId;
    }

    public Host chunkId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CHUNK_ID);
        return this;
    }

    public Host chunkId_ExplictlyNonNull() {
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

    public Host cluster(NestedCluster cluster) {

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

    public Host cluster_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER);
        return this;
    }

    public Host cluster_ExplictlyNonNull() {
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

    public Host commitedMemoryBytes(Long commitedMemoryBytes) {

        this.commitedMemoryBytes = commitedMemoryBytes;
        return this;
    }

    /**
     * Get commitedMemoryBytes
     *
     * @return commitedMemoryBytes
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getCommitedMemoryBytes() {
        return commitedMemoryBytes;
    }

    public void setCommitedMemoryBytes(Long commitedMemoryBytes) {
        this.commitedMemoryBytes = commitedMemoryBytes;
    }

    public Host commitedMemoryBytes_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_COMMITED_MEMORY_BYTES);
        return this;
    }

    public Host commitedMemoryBytes_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_COMMITED_MEMORY_BYTES);
        return this;
    }

    public void setCommitedMemoryBytes_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_COMMITED_MEMORY_BYTES);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_COMMITED_MEMORY_BYTES);
        }
    }

    public boolean getCommitedMemoryBytes_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_COMMITED_MEMORY_BYTES);
    }

    public Host compatibleCpuModels(List<String> compatibleCpuModels) {

        this.compatibleCpuModels = compatibleCpuModels;
        return this;
    }

    public Host addCompatibleCpuModelsItem(String compatibleCpuModelsItem) {
        this.compatibleCpuModels.add(compatibleCpuModelsItem);
        return this;
    }

    /**
     * Get compatibleCpuModels
     *
     * @return compatibleCpuModels
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public List<String> getCompatibleCpuModels() {
        return compatibleCpuModels;
    }

    public void setCompatibleCpuModels(List<String> compatibleCpuModels) {
        this.compatibleCpuModels = compatibleCpuModels;
    }

    public Host compatibleCpuModels_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_COMPATIBLE_CPU_MODELS);
        return this;
    }

    public Host compatibleCpuModels_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_COMPATIBLE_CPU_MODELS);
        return this;
    }

    public void setCompatibleCpuModels_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_COMPATIBLE_CPU_MODELS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_COMPATIBLE_CPU_MODELS);
        }
    }

    public boolean getCompatibleCpuModels_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_COMPATIBLE_CPU_MODELS);
    }

    public Host connectStatus(HostConnectStatus connectStatus) {

        this.connectStatus = connectStatus;
        return this;
    }

    /**
     * Get connectStatus
     *
     * @return connectStatus
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public HostConnectStatus getConnectStatus() {
        return connectStatus;
    }

    public void setConnectStatus(HostConnectStatus connectStatus) {
        this.connectStatus = connectStatus;
    }

    public Host connectStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CONNECT_STATUS);
        return this;
    }

    public Host connectStatus_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CONNECT_STATUS);
        return this;
    }

    public void setConnectStatus_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CONNECT_STATUS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CONNECT_STATUS);
        }
    }

    public boolean getConnectStatus_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CONNECT_STATUS);
    }

    public Host cpuBrand(String cpuBrand) {

        this.cpuBrand = cpuBrand;
        return this;
    }

    /**
     * Get cpuBrand
     *
     * @return cpuBrand
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getCpuBrand() {
        return cpuBrand;
    }

    public void setCpuBrand(String cpuBrand) {
        this.cpuBrand = cpuBrand;
    }

    public Host cpuBrand_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CPU_BRAND);
        return this;
    }

    public Host cpuBrand_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CPU_BRAND);
        return this;
    }

    public void setCpuBrand_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CPU_BRAND);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CPU_BRAND);
        }
    }

    public boolean getCpuBrand_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CPU_BRAND);
    }

    public Host cpuFanSpeed(List<Double> cpuFanSpeed) {

        this.cpuFanSpeed = cpuFanSpeed;
        return this;
    }

    public Host addCpuFanSpeedItem(Double cpuFanSpeedItem) {
        this.cpuFanSpeed.add(cpuFanSpeedItem);
        return this;
    }

    /**
     * Get cpuFanSpeed
     *
     * @return cpuFanSpeed
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public List<Double> getCpuFanSpeed() {
        return cpuFanSpeed;
    }

    public void setCpuFanSpeed(List<Double> cpuFanSpeed) {
        this.cpuFanSpeed = cpuFanSpeed;
    }

    public Host cpuFanSpeed_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CPU_FAN_SPEED);
        return this;
    }

    public Host cpuFanSpeed_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CPU_FAN_SPEED);
        return this;
    }

    public void setCpuFanSpeed_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CPU_FAN_SPEED);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CPU_FAN_SPEED);
        }
    }

    public boolean getCpuFanSpeed_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CPU_FAN_SPEED);
    }

    public Host cpuFanSpeedUnit(CpuFanSpeedUnit cpuFanSpeedUnit) {

        this.cpuFanSpeedUnit = cpuFanSpeedUnit;
        return this;
    }

    /**
     * Get cpuFanSpeedUnit
     *
     * @return cpuFanSpeedUnit
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public CpuFanSpeedUnit getCpuFanSpeedUnit() {
        return cpuFanSpeedUnit;
    }

    public void setCpuFanSpeedUnit(CpuFanSpeedUnit cpuFanSpeedUnit) {
        this.cpuFanSpeedUnit = cpuFanSpeedUnit;
    }

    public Host cpuFanSpeedUnit_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CPU_FAN_SPEED_UNIT);
        return this;
    }

    public Host cpuFanSpeedUnit_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CPU_FAN_SPEED_UNIT);
        return this;
    }

    public void setCpuFanSpeedUnit_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CPU_FAN_SPEED_UNIT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CPU_FAN_SPEED_UNIT);
        }
    }

    public boolean getCpuFanSpeedUnit_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CPU_FAN_SPEED_UNIT);
    }

    public Host cpuHzPerCore(Long cpuHzPerCore) {

        this.cpuHzPerCore = cpuHzPerCore;
        return this;
    }

    /**
     * Get cpuHzPerCore
     *
     * @return cpuHzPerCore
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Long getCpuHzPerCore() {
        return cpuHzPerCore;
    }

    public void setCpuHzPerCore(Long cpuHzPerCore) {
        this.cpuHzPerCore = cpuHzPerCore;
    }

    public Host cpuHzPerCore_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CPU_HZ_PER_CORE);
        return this;
    }

    public Host cpuHzPerCore_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CPU_HZ_PER_CORE);
        return this;
    }

    public void setCpuHzPerCore_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CPU_HZ_PER_CORE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CPU_HZ_PER_CORE);
        }
    }

    public boolean getCpuHzPerCore_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CPU_HZ_PER_CORE);
    }

    public Host cpuModel(String cpuModel) {

        this.cpuModel = cpuModel;
        return this;
    }

    /**
     * Get cpuModel
     *
     * @return cpuModel
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getCpuModel() {
        return cpuModel;
    }

    public void setCpuModel(String cpuModel) {
        this.cpuModel = cpuModel;
    }

    public Host cpuModel_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CPU_MODEL);
        return this;
    }

    public Host cpuModel_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CPU_MODEL);
        return this;
    }

    public void setCpuModel_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CPU_MODEL);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CPU_MODEL);
        }
    }

    public boolean getCpuModel_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CPU_MODEL);
    }

    public Host cpuTemperatureCelsius(List<Integer> cpuTemperatureCelsius) {

        this.cpuTemperatureCelsius = cpuTemperatureCelsius;
        return this;
    }

    public Host addCpuTemperatureCelsiusItem(Integer cpuTemperatureCelsiusItem) {
        this.cpuTemperatureCelsius.add(cpuTemperatureCelsiusItem);
        return this;
    }

    /**
     * Get cpuTemperatureCelsius
     *
     * @return cpuTemperatureCelsius
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public List<Integer> getCpuTemperatureCelsius() {
        return cpuTemperatureCelsius;
    }

    public void setCpuTemperatureCelsius(List<Integer> cpuTemperatureCelsius) {
        this.cpuTemperatureCelsius = cpuTemperatureCelsius;
    }

    public Host cpuTemperatureCelsius_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CPU_TEMPERATURE_CELSIUS);
        return this;
    }

    public Host cpuTemperatureCelsius_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CPU_TEMPERATURE_CELSIUS);
        return this;
    }

    public void setCpuTemperatureCelsius_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CPU_TEMPERATURE_CELSIUS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CPU_TEMPERATURE_CELSIUS);
        }
    }

    public boolean getCpuTemperatureCelsius_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CPU_TEMPERATURE_CELSIUS);
    }

    public Host cpuVendor(String cpuVendor) {

        this.cpuVendor = cpuVendor;
        return this;
    }

    /**
     * Get cpuVendor
     *
     * @return cpuVendor
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCpuVendor() {
        return cpuVendor;
    }

    public void setCpuVendor(String cpuVendor) {
        this.cpuVendor = cpuVendor;
    }

    public Host cpuVendor_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CPU_VENDOR);
        return this;
    }

    public Host cpuVendor_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CPU_VENDOR);
        return this;
    }

    public void setCpuVendor_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CPU_VENDOR);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CPU_VENDOR);
        }
    }

    public boolean getCpuVendor_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CPU_VENDOR);
    }

    public Host dataIp(String dataIp) {

        this.dataIp = dataIp;
        return this;
    }

    /**
     * Get dataIp
     *
     * @return dataIp
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDataIp() {
        return dataIp;
    }

    public void setDataIp(String dataIp) {
        this.dataIp = dataIp;
    }

    public Host dataIp_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATA_IP);
        return this;
    }

    public Host dataIp_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATA_IP);
        return this;
    }

    public void setDataIp_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATA_IP);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATA_IP);
        }
    }

    public boolean getDataIp_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATA_IP);
    }

    public Host downgradedPrioritizedSpace(Long downgradedPrioritizedSpace) {

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

    public Host downgradedPrioritizedSpace_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DOWNGRADED_PRIORITIZED_SPACE);
        return this;
    }

    public Host downgradedPrioritizedSpace_ExplictlyNonNull() {
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

    public Host entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {

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

    public Host entityAsyncStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        return this;
    }

    public Host entityAsyncStatus_ExplictlyNonNull() {
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

    public Host failureDataSpace(Long failureDataSpace) {

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

    public Host failureDataSpace_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FAILURE_DATA_SPACE);
        return this;
    }

    public Host failureDataSpace_ExplictlyNonNull() {
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

    public Host gpuDevices(List<NestedGpuDevice> gpuDevices) {

        this.gpuDevices = gpuDevices;
        return this;
    }

    public Host addGpuDevicesItem(NestedGpuDevice gpuDevicesItem) {
        if (this.gpuDevices == null) {
            this.gpuDevices = new ArrayList<NestedGpuDevice>();
        }
        this.gpuDevices.add(gpuDevicesItem);
        return this;
    }

    /**
     * Get gpuDevices
     *
     * @return gpuDevices
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedGpuDevice> getGpuDevices() {
        return gpuDevices;
    }

    public void setGpuDevices(List<NestedGpuDevice> gpuDevices) {
        this.gpuDevices = gpuDevices;
    }

    public Host gpuDevices_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_GPU_DEVICES);
        return this;
    }

    public Host gpuDevices_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_GPU_DEVICES);
        return this;
    }

    public void setGpuDevices_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_GPU_DEVICES);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_GPU_DEVICES);
        }
    }

    public boolean getGpuDevices_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_GPU_DEVICES);
    }

    public Host hddDataCapacity(Long hddDataCapacity) {

        this.hddDataCapacity = hddDataCapacity;
        return this;
    }

    /**
     * Get hddDataCapacity
     *
     * @return hddDataCapacity
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Long getHddDataCapacity() {
        return hddDataCapacity;
    }

    public void setHddDataCapacity(Long hddDataCapacity) {
        this.hddDataCapacity = hddDataCapacity;
    }

    public Host hddDataCapacity_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HDD_DATA_CAPACITY);
        return this;
    }

    public Host hddDataCapacity_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HDD_DATA_CAPACITY);
        return this;
    }

    public void setHddDataCapacity_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HDD_DATA_CAPACITY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HDD_DATA_CAPACITY);
        }
    }

    public boolean getHddDataCapacity_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HDD_DATA_CAPACITY);
    }

    public Host hddDiskCount(Integer hddDiskCount) {

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

    public Host hddDiskCount_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HDD_DISK_COUNT);
        return this;
    }

    public Host hddDiskCount_ExplictlyNonNull() {
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

    public Host hostState(NestedMaintenanceHostState hostState) {

        this.hostState = hostState;
        return this;
    }

    /**
     * Get hostState
     *
     * @return hostState
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NestedMaintenanceHostState getHostState() {
        return hostState;
    }

    public void setHostState(NestedMaintenanceHostState hostState) {
        this.hostState = hostState;
    }

    public Host hostState_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOST_STATE);
        return this;
    }

    public Host hostState_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HOST_STATE);
        return this;
    }

    public void setHostState_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HOST_STATE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HOST_STATE);
        }
    }

    public boolean getHostState_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HOST_STATE);
    }

    public Host hypervisorIp(String hypervisorIp) {

        this.hypervisorIp = hypervisorIp;
        return this;
    }

    /**
     * Get hypervisorIp
     *
     * @return hypervisorIp
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getHypervisorIp() {
        return hypervisorIp;
    }

    public void setHypervisorIp(String hypervisorIp) {
        this.hypervisorIp = hypervisorIp;
    }

    public Host hypervisorIp_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HYPERVISOR_IP);
        return this;
    }

    public Host hypervisorIp_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HYPERVISOR_IP);
        return this;
    }

    public void setHypervisorIp_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HYPERVISOR_IP);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HYPERVISOR_IP);
        }
    }

    public boolean getHypervisorIp_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HYPERVISOR_IP);
    }

    public Host id(String id) {

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

    public Host id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public Host id_ExplictlyNonNull() {
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

    public Host iommu(IommuStatus iommu) {

        this.iommu = iommu;
        return this;
    }

    /**
     * Get iommu
     *
     * @return iommu
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public IommuStatus getIommu() {
        return iommu;
    }

    public void setIommu(IommuStatus iommu) {
        this.iommu = iommu;
    }

    public Host iommu_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IOMMU);
        return this;
    }

    public Host iommu_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IOMMU);
        return this;
    }

    public void setIommu_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IOMMU);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IOMMU);
        }
    }

    public boolean getIommu_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IOMMU);
    }

    public Host isOsInRaid1(Boolean isOsInRaid1) {

        this.isOsInRaid1 = isOsInRaid1;
        return this;
    }

    /**
     * Get isOsInRaid1
     *
     * @return isOsInRaid1
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getIsOsInRaid1() {
        return isOsInRaid1;
    }

    public void setIsOsInRaid1(Boolean isOsInRaid1) {
        this.isOsInRaid1 = isOsInRaid1;
    }

    public Host isOsInRaid1_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IS_OS_IN_RAID1);
        return this;
    }

    public Host isOsInRaid1_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IS_OS_IN_RAID1);
        return this;
    }

    public void setIsOsInRaid1_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IS_OS_IN_RAID1);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IS_OS_IN_RAID1);
        }
    }

    public boolean getIsOsInRaid1_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IS_OS_IN_RAID1);
    }

    public Host labels(List<NestedLabel> labels) {

        this.labels = labels;
        return this;
    }

    public Host addLabelsItem(NestedLabel labelsItem) {
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

    public Host labels_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LABELS);
        return this;
    }

    public Host labels_ExplictlyNonNull() {
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

    public Host localId(String localId) {

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

    public Host localId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID);
        return this;
    }

    public Host localId_ExplictlyNonNull() {
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

    public Host lsmCapDiskSafeUmount(Boolean lsmCapDiskSafeUmount) {

        this.lsmCapDiskSafeUmount = lsmCapDiskSafeUmount;
        return this;
    }

    /**
     * Get lsmCapDiskSafeUmount
     *
     * @return lsmCapDiskSafeUmount
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Boolean getLsmCapDiskSafeUmount() {
        return lsmCapDiskSafeUmount;
    }

    public void setLsmCapDiskSafeUmount(Boolean lsmCapDiskSafeUmount) {
        this.lsmCapDiskSafeUmount = lsmCapDiskSafeUmount;
    }

    public Host lsmCapDiskSafeUmount_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LSM_CAP_DISK_SAFE_UMOUNT);
        return this;
    }

    public Host lsmCapDiskSafeUmount_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LSM_CAP_DISK_SAFE_UMOUNT);
        return this;
    }

    public void setLsmCapDiskSafeUmount_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LSM_CAP_DISK_SAFE_UMOUNT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LSM_CAP_DISK_SAFE_UMOUNT);
        }
    }

    public boolean getLsmCapDiskSafeUmount_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LSM_CAP_DISK_SAFE_UMOUNT);
    }

    public Host managementIp(String managementIp) {

        this.managementIp = managementIp;
        return this;
    }

    /**
     * Get managementIp
     *
     * @return managementIp
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getManagementIp() {
        return managementIp;
    }

    public void setManagementIp(String managementIp) {
        this.managementIp = managementIp;
    }

    public Host managementIp_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_IP);
        return this;
    }

    public Host managementIp_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_IP);
        return this;
    }

    public void setManagementIp_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_IP);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_IP);
        }
    }

    public boolean getManagementIp_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MANAGEMENT_IP);
    }

    public Host mergedStatus(HostMergedStatus mergedStatus) {

        this.mergedStatus = mergedStatus;
        return this;
    }

    /**
     * Get mergedStatus
     *
     * @return mergedStatus
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public HostMergedStatus getMergedStatus() {
        return mergedStatus;
    }

    public void setMergedStatus(HostMergedStatus mergedStatus) {
        this.mergedStatus = mergedStatus;
    }

    public Host mergedStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MERGED_STATUS);
        return this;
    }

    public Host mergedStatus_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MERGED_STATUS);
        return this;
    }

    public void setMergedStatus_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MERGED_STATUS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MERGED_STATUS);
        }
    }

    public boolean getMergedStatus_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MERGED_STATUS);
    }

    public Host model(String model) {

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

    public Host model_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MODEL);
        return this;
    }

    public Host model_ExplictlyNonNull() {
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

    public Host name(String name) {

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

    public Host name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public Host name_ExplictlyNonNull() {
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

    public Host nestedVirtualization(Boolean nestedVirtualization) {

        this.nestedVirtualization = nestedVirtualization;
        return this;
    }

    /**
     * Get nestedVirtualization
     *
     * @return nestedVirtualization
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Boolean getNestedVirtualization() {
        return nestedVirtualization;
    }

    public void setNestedVirtualization(Boolean nestedVirtualization) {
        this.nestedVirtualization = nestedVirtualization;
    }

    public Host nestedVirtualization_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NESTED_VIRTUALIZATION);
        return this;
    }

    public Host nestedVirtualization_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NESTED_VIRTUALIZATION);
        return this;
    }

    public void setNestedVirtualization_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NESTED_VIRTUALIZATION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NESTED_VIRTUALIZATION);
        }
    }

    public boolean getNestedVirtualization_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NESTED_VIRTUALIZATION);
    }

    public Host nicCount(Integer nicCount) {

        this.nicCount = nicCount;
        return this;
    }

    /**
     * Get nicCount
     *
     * @return nicCount
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Integer getNicCount() {
        return nicCount;
    }

    public void setNicCount(Integer nicCount) {
        this.nicCount = nicCount;
    }

    public Host nicCount_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NIC_COUNT);
        return this;
    }

    public Host nicCount_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NIC_COUNT);
        return this;
    }

    public void setNicCount_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NIC_COUNT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NIC_COUNT);
        }
    }

    public boolean getNicCount_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NIC_COUNT);
    }

    public Host nics(List<NestedNic> nics) {

        this.nics = nics;
        return this;
    }

    public Host addNicsItem(NestedNic nicsItem) {
        if (this.nics == null) {
            this.nics = new ArrayList<NestedNic>();
        }
        this.nics.add(nicsItem);
        return this;
    }

    /**
     * Get nics
     *
     * @return nics
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedNic> getNics() {
        return nics;
    }

    public void setNics(List<NestedNic> nics) {
        this.nics = nics;
    }

    public Host nics_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NICS);
        return this;
    }

    public Host nics_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NICS);
        return this;
    }

    public void setNics_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NICS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NICS);
        }
    }

    public boolean getNics_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NICS);
    }

    public Host nodeTopoLocalId(String nodeTopoLocalId) {

        this.nodeTopoLocalId = nodeTopoLocalId;
        return this;
    }

    /**
     * Get nodeTopoLocalId
     *
     * @return nodeTopoLocalId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNodeTopoLocalId() {
        return nodeTopoLocalId;
    }

    public void setNodeTopoLocalId(String nodeTopoLocalId) {
        this.nodeTopoLocalId = nodeTopoLocalId;
    }

    public Host nodeTopoLocalId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NODE_TOPO_LOCAL_ID);
        return this;
    }

    public Host nodeTopoLocalId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NODE_TOPO_LOCAL_ID);
        return this;
    }

    public void setNodeTopoLocalId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NODE_TOPO_LOCAL_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NODE_TOPO_LOCAL_ID);
        }
    }

    public boolean getNodeTopoLocalId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NODE_TOPO_LOCAL_ID);
    }

    public Host osMemoryBytes(Long osMemoryBytes) {

        this.osMemoryBytes = osMemoryBytes;
        return this;
    }

    /**
     * Get osMemoryBytes
     *
     * @return osMemoryBytes
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Long getOsMemoryBytes() {
        return osMemoryBytes;
    }

    public void setOsMemoryBytes(Long osMemoryBytes) {
        this.osMemoryBytes = osMemoryBytes;
    }

    public Host osMemoryBytes_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_OS_MEMORY_BYTES);
        return this;
    }

    public Host osMemoryBytes_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_OS_MEMORY_BYTES);
        return this;
    }

    public void setOsMemoryBytes_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_OS_MEMORY_BYTES);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_OS_MEMORY_BYTES);
        }
    }

    public boolean getOsMemoryBytes_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_OS_MEMORY_BYTES);
    }

    public Host osVersion(String osVersion) {

        this.osVersion = osVersion;
        return this;
    }

    /**
     * Get osVersion
     *
     * @return osVersion
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    public Host osVersion_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_OS_VERSION);
        return this;
    }

    public Host osVersion_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_OS_VERSION);
        return this;
    }

    public void setOsVersion_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_OS_VERSION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_OS_VERSION);
        }
    }

    public boolean getOsVersion_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_OS_VERSION);
    }

    public Host perfAllocatedDataSpace(Long perfAllocatedDataSpace) {

        this.perfAllocatedDataSpace = perfAllocatedDataSpace;
        return this;
    }

    /**
     * Get perfAllocatedDataSpace
     *
     * @return perfAllocatedDataSpace
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getPerfAllocatedDataSpace() {
        return perfAllocatedDataSpace;
    }

    public void setPerfAllocatedDataSpace(Long perfAllocatedDataSpace) {
        this.perfAllocatedDataSpace = perfAllocatedDataSpace;
    }

    public Host perfAllocatedDataSpace_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PERF_ALLOCATED_DATA_SPACE);
        return this;
    }

    public Host perfAllocatedDataSpace_ExplictlyNonNull() {
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

    public Host perfFailureDataSpace(Long perfFailureDataSpace) {

        this.perfFailureDataSpace = perfFailureDataSpace;
        return this;
    }

    /**
     * Get perfFailureDataSpace
     *
     * @return perfFailureDataSpace
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getPerfFailureDataSpace() {
        return perfFailureDataSpace;
    }

    public void setPerfFailureDataSpace(Long perfFailureDataSpace) {
        this.perfFailureDataSpace = perfFailureDataSpace;
    }

    public Host perfFailureDataSpace_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PERF_FAILURE_DATA_SPACE);
        return this;
    }

    public Host perfFailureDataSpace_ExplictlyNonNull() {
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

    public Host perfTotalDataCapacity(Long perfTotalDataCapacity) {

        this.perfTotalDataCapacity = perfTotalDataCapacity;
        return this;
    }

    /**
     * Get perfTotalDataCapacity
     *
     * @return perfTotalDataCapacity
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getPerfTotalDataCapacity() {
        return perfTotalDataCapacity;
    }

    public void setPerfTotalDataCapacity(Long perfTotalDataCapacity) {
        this.perfTotalDataCapacity = perfTotalDataCapacity;
    }

    public Host perfTotalDataCapacity_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PERF_TOTAL_DATA_CAPACITY);
        return this;
    }

    public Host perfTotalDataCapacity_ExplictlyNonNull() {
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

    public Host perfUsedDataSpace(Long perfUsedDataSpace) {

        this.perfUsedDataSpace = perfUsedDataSpace;
        return this;
    }

    /**
     * Get perfUsedDataSpace
     *
     * @return perfUsedDataSpace
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getPerfUsedDataSpace() {
        return perfUsedDataSpace;
    }

    public void setPerfUsedDataSpace(Long perfUsedDataSpace) {
        this.perfUsedDataSpace = perfUsedDataSpace;
    }

    public Host perfUsedDataSpace_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PERF_USED_DATA_SPACE);
        return this;
    }

    public Host perfUsedDataSpace_ExplictlyNonNull() {
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

    public Host perfValidDataSpace(Long perfValidDataSpace) {

        this.perfValidDataSpace = perfValidDataSpace;
        return this;
    }

    /**
     * Get perfValidDataSpace
     *
     * @return perfValidDataSpace
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getPerfValidDataSpace() {
        return perfValidDataSpace;
    }

    public void setPerfValidDataSpace(Long perfValidDataSpace) {
        this.perfValidDataSpace = perfValidDataSpace;
    }

    public Host perfValidDataSpace_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PERF_VALID_DATA_SPACE);
        return this;
    }

    public Host perfValidDataSpace_ExplictlyNonNull() {
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

    public Host plannedPrioritizedSpace(Long plannedPrioritizedSpace) {

        this.plannedPrioritizedSpace = plannedPrioritizedSpace;
        return this;
    }

    /**
     * Get plannedPrioritizedSpace
     *
     * @return plannedPrioritizedSpace
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getPlannedPrioritizedSpace() {
        return plannedPrioritizedSpace;
    }

    public void setPlannedPrioritizedSpace(Long plannedPrioritizedSpace) {
        this.plannedPrioritizedSpace = plannedPrioritizedSpace;
    }

    public Host plannedPrioritizedSpace_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PLANNED_PRIORITIZED_SPACE);
        return this;
    }

    public Host plannedPrioritizedSpace_ExplictlyNonNull() {
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

    public Host pmemDimmCapacity(Long pmemDimmCapacity) {

        this.pmemDimmCapacity = pmemDimmCapacity;
        return this;
    }

    /**
     * Get pmemDimmCapacity
     *
     * @return pmemDimmCapacity
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Long getPmemDimmCapacity() {
        return pmemDimmCapacity;
    }

    public void setPmemDimmCapacity(Long pmemDimmCapacity) {
        this.pmemDimmCapacity = pmemDimmCapacity;
    }

    public Host pmemDimmCapacity_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PMEM_DIMM_CAPACITY);
        return this;
    }

    public Host pmemDimmCapacity_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PMEM_DIMM_CAPACITY);
        return this;
    }

    public void setPmemDimmCapacity_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PMEM_DIMM_CAPACITY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PMEM_DIMM_CAPACITY);
        }
    }

    public boolean getPmemDimmCapacity_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PMEM_DIMM_CAPACITY);
    }

    public Host pmemDimmCount(Integer pmemDimmCount) {

        this.pmemDimmCount = pmemDimmCount;
        return this;
    }

    /**
     * Get pmemDimmCount
     *
     * @return pmemDimmCount
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Integer getPmemDimmCount() {
        return pmemDimmCount;
    }

    public void setPmemDimmCount(Integer pmemDimmCount) {
        this.pmemDimmCount = pmemDimmCount;
    }

    public Host pmemDimmCount_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PMEM_DIMM_COUNT);
        return this;
    }

    public Host pmemDimmCount_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PMEM_DIMM_COUNT);
        return this;
    }

    public void setPmemDimmCount_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PMEM_DIMM_COUNT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PMEM_DIMM_COUNT);
        }
    }

    public boolean getPmemDimmCount_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PMEM_DIMM_COUNT);
    }

    public Host pmemDiskCount(Integer pmemDiskCount) {

        this.pmemDiskCount = pmemDiskCount;
        return this;
    }

    /**
     * Get pmemDiskCount
     *
     * @return pmemDiskCount
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Integer getPmemDiskCount() {
        return pmemDiskCount;
    }

    public void setPmemDiskCount(Integer pmemDiskCount) {
        this.pmemDiskCount = pmemDiskCount;
    }

    public Host pmemDiskCount_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PMEM_DISK_COUNT);
        return this;
    }

    public Host pmemDiskCount_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PMEM_DISK_COUNT);
        return this;
    }

    public void setPmemDiskCount_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PMEM_DISK_COUNT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PMEM_DISK_COUNT);
        }
    }

    public boolean getPmemDiskCount_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PMEM_DISK_COUNT);
    }

    public Host prioSpacePercentage(Double prioSpacePercentage) {

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

    public Host prioSpacePercentage_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRIO_SPACE_PERCENTAGE);
        return this;
    }

    public Host prioSpacePercentage_ExplictlyNonNull() {
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

    public Host provisionedCpuCores(Integer provisionedCpuCores) {

        this.provisionedCpuCores = provisionedCpuCores;
        return this;
    }

    /**
     * Get provisionedCpuCores
     *
     * @return provisionedCpuCores
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Integer getProvisionedCpuCores() {
        return provisionedCpuCores;
    }

    public void setProvisionedCpuCores(Integer provisionedCpuCores) {
        this.provisionedCpuCores = provisionedCpuCores;
    }

    public Host provisionedCpuCores_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_CPU_CORES);
        return this;
    }

    public Host provisionedCpuCores_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_CPU_CORES);
        return this;
    }

    public void setProvisionedCpuCores_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_CPU_CORES);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_CPU_CORES);
        }
    }

    public boolean getProvisionedCpuCores_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PROVISIONED_CPU_CORES);
    }

    public Host provisionedMemoryBytes(Long provisionedMemoryBytes) {

        this.provisionedMemoryBytes = provisionedMemoryBytes;
        return this;
    }

    /**
     * Get provisionedMemoryBytes
     *
     * @return provisionedMemoryBytes
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Long getProvisionedMemoryBytes() {
        return provisionedMemoryBytes;
    }

    public void setProvisionedMemoryBytes(Long provisionedMemoryBytes) {
        this.provisionedMemoryBytes = provisionedMemoryBytes;
    }

    public Host provisionedMemoryBytes_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES);
        return this;
    }

    public Host provisionedMemoryBytes_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES);
        return this;
    }

    public void setProvisionedMemoryBytes_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES);
        }
    }

    public boolean getProvisionedMemoryBytes_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES);
    }

    public Host runningPauseVmMemoryBytes(Long runningPauseVmMemoryBytes) {

        this.runningPauseVmMemoryBytes = runningPauseVmMemoryBytes;
        return this;
    }

    /**
     * Get runningPauseVmMemoryBytes
     *
     * @return runningPauseVmMemoryBytes
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Long getRunningPauseVmMemoryBytes() {
        return runningPauseVmMemoryBytes;
    }

    public void setRunningPauseVmMemoryBytes(Long runningPauseVmMemoryBytes) {
        this.runningPauseVmMemoryBytes = runningPauseVmMemoryBytes;
    }

    public Host runningPauseVmMemoryBytes_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RUNNING_PAUSE_VM_MEMORY_BYTES);
        return this;
    }

    public Host runningPauseVmMemoryBytes_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RUNNING_PAUSE_VM_MEMORY_BYTES);
        return this;
    }

    public void setRunningPauseVmMemoryBytes_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RUNNING_PAUSE_VM_MEMORY_BYTES);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RUNNING_PAUSE_VM_MEMORY_BYTES);
        }
    }

    public boolean getRunningPauseVmMemoryBytes_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RUNNING_PAUSE_VM_MEMORY_BYTES);
    }

    public Host runningVmNum(Integer runningVmNum) {

        this.runningVmNum = runningVmNum;
        return this;
    }

    /**
     * Get runningVmNum
     *
     * @return runningVmNum
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getRunningVmNum() {
        return runningVmNum;
    }

    public void setRunningVmNum(Integer runningVmNum) {
        this.runningVmNum = runningVmNum;
    }

    public Host runningVmNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RUNNING_VM_NUM);
        return this;
    }

    public Host runningVmNum_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RUNNING_VM_NUM);
        return this;
    }

    public void setRunningVmNum_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RUNNING_VM_NUM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RUNNING_VM_NUM);
        }
    }

    public boolean getRunningVmNum_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RUNNING_VM_NUM);
    }

    public Host scvmCpu(Integer scvmCpu) {

        this.scvmCpu = scvmCpu;
        return this;
    }

    /**
     * Get scvmCpu
     *
     * @return scvmCpu
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getScvmCpu() {
        return scvmCpu;
    }

    public void setScvmCpu(Integer scvmCpu) {
        this.scvmCpu = scvmCpu;
    }

    public Host scvmCpu_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SCVM_CPU);
        return this;
    }

    public Host scvmCpu_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SCVM_CPU);
        return this;
    }

    public void setScvmCpu_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SCVM_CPU);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SCVM_CPU);
        }
    }

    public boolean getScvmCpu_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SCVM_CPU);
    }

    public Host scvmMemory(Long scvmMemory) {

        this.scvmMemory = scvmMemory;
        return this;
    }

    /**
     * Get scvmMemory
     *
     * @return scvmMemory
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getScvmMemory() {
        return scvmMemory;
    }

    public void setScvmMemory(Long scvmMemory) {
        this.scvmMemory = scvmMemory;
    }

    public Host scvmMemory_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SCVM_MEMORY);
        return this;
    }

    public Host scvmMemory_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SCVM_MEMORY);
        return this;
    }

    public void setScvmMemory_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SCVM_MEMORY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SCVM_MEMORY);
        }
    }

    public boolean getScvmMemory_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SCVM_MEMORY);
    }

    public Host scvmName(String scvmName) {

        this.scvmName = scvmName;
        return this;
    }

    /**
     * Get scvmName
     *
     * @return scvmName
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getScvmName() {
        return scvmName;
    }

    public void setScvmName(String scvmName) {
        this.scvmName = scvmName;
    }

    public Host scvmName_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SCVM_NAME);
        return this;
    }

    public Host scvmName_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SCVM_NAME);
        return this;
    }

    public void setScvmName_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SCVM_NAME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SCVM_NAME);
        }
    }

    public boolean getScvmName_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SCVM_NAME);
    }

    public Host serial(String serial) {

        this.serial = serial;
        return this;
    }

    /**
     * Get serial
     *
     * @return serial
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public Host serial_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SERIAL);
        return this;
    }

    public Host serial_ExplictlyNonNull() {
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

    public Host ssdDataCapacity(Long ssdDataCapacity) {

        this.ssdDataCapacity = ssdDataCapacity;
        return this;
    }

    /**
     * Get ssdDataCapacity
     *
     * @return ssdDataCapacity
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Long getSsdDataCapacity() {
        return ssdDataCapacity;
    }

    public void setSsdDataCapacity(Long ssdDataCapacity) {
        this.ssdDataCapacity = ssdDataCapacity;
    }

    public Host ssdDataCapacity_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SSD_DATA_CAPACITY);
        return this;
    }

    public Host ssdDataCapacity_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SSD_DATA_CAPACITY);
        return this;
    }

    public void setSsdDataCapacity_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SSD_DATA_CAPACITY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SSD_DATA_CAPACITY);
        }
    }

    public boolean getSsdDataCapacity_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SSD_DATA_CAPACITY);
    }

    public Host ssdDiskCount(Integer ssdDiskCount) {

        this.ssdDiskCount = ssdDiskCount;
        return this;
    }

    /**
     * Get ssdDiskCount
     *
     * @return ssdDiskCount
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Integer getSsdDiskCount() {
        return ssdDiskCount;
    }

    public void setSsdDiskCount(Integer ssdDiskCount) {
        this.ssdDiskCount = ssdDiskCount;
    }

    public Host ssdDiskCount_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SSD_DISK_COUNT);
        return this;
    }

    public Host ssdDiskCount_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SSD_DISK_COUNT);
        return this;
    }

    public void setSsdDiskCount_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SSD_DISK_COUNT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SSD_DISK_COUNT);
        }
    }

    public boolean getSsdDiskCount_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SSD_DISK_COUNT);
    }

    public Host state(HostState state) {

        this.state = state;
        return this;
    }

    /**
     * Get state
     *
     * @return state
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public HostState getState() {
        return state;
    }

    public void setState(HostState state) {
        this.state = state;
    }

    public Host state_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATE);
        return this;
    }

    public Host state_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STATE);
        return this;
    }

    public void setState_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STATE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STATE);
        }
    }

    public boolean getState_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STATE);
    }

    public Host status(HostStatus status) {

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
    public HostStatus getStatus() {
        return status;
    }

    public void setStatus(HostStatus status) {
        this.status = status;
    }

    public Host status_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATUS);
        return this;
    }

    public Host status_ExplictlyNonNull() {
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

    public Host stoppedVmNum(Integer stoppedVmNum) {

        this.stoppedVmNum = stoppedVmNum;
        return this;
    }

    /**
     * Get stoppedVmNum
     *
     * @return stoppedVmNum
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getStoppedVmNum() {
        return stoppedVmNum;
    }

    public void setStoppedVmNum(Integer stoppedVmNum) {
        this.stoppedVmNum = stoppedVmNum;
    }

    public Host stoppedVmNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STOPPED_VM_NUM);
        return this;
    }

    public Host stoppedVmNum_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STOPPED_VM_NUM);
        return this;
    }

    public void setStoppedVmNum_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STOPPED_VM_NUM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STOPPED_VM_NUM);
        }
    }

    public boolean getStoppedVmNum_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STOPPED_VM_NUM);
    }

    public Host suspendedVmNum(Integer suspendedVmNum) {

        this.suspendedVmNum = suspendedVmNum;
        return this;
    }

    /**
     * Get suspendedVmNum
     *
     * @return suspendedVmNum
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getSuspendedVmNum() {
        return suspendedVmNum;
    }

    public void setSuspendedVmNum(Integer suspendedVmNum) {
        this.suspendedVmNum = suspendedVmNum;
    }

    public Host suspendedVmNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUSPENDED_VM_NUM);
        return this;
    }

    public Host suspendedVmNum_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SUSPENDED_VM_NUM);
        return this;
    }

    public void setSuspendedVmNum_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SUSPENDED_VM_NUM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SUSPENDED_VM_NUM);
        }
    }

    public boolean getSuspendedVmNum_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SUSPENDED_VM_NUM);
    }

    public Host totalCacheCapacity(Long totalCacheCapacity) {

        this.totalCacheCapacity = totalCacheCapacity;
        return this;
    }

    /**
     * Get totalCacheCapacity
     *
     * @return totalCacheCapacity
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getTotalCacheCapacity() {
        return totalCacheCapacity;
    }

    public void setTotalCacheCapacity(Long totalCacheCapacity) {
        this.totalCacheCapacity = totalCacheCapacity;
    }

    public Host totalCacheCapacity_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_CACHE_CAPACITY);
        return this;
    }

    public Host totalCacheCapacity_ExplictlyNonNull() {
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

    public Host totalCpuCores(Integer totalCpuCores) {

        this.totalCpuCores = totalCpuCores;
        return this;
    }

    /**
     * Get totalCpuCores
     *
     * @return totalCpuCores
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Integer getTotalCpuCores() {
        return totalCpuCores;
    }

    public void setTotalCpuCores(Integer totalCpuCores) {
        this.totalCpuCores = totalCpuCores;
    }

    public Host totalCpuCores_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_CPU_CORES);
        return this;
    }

    public Host totalCpuCores_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CPU_CORES);
        return this;
    }

    public void setTotalCpuCores_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_CPU_CORES);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CPU_CORES);
        }
    }

    public boolean getTotalCpuCores_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_CPU_CORES);
    }

    public Host totalCpuHz(Long totalCpuHz) {

        this.totalCpuHz = totalCpuHz;
        return this;
    }

    /**
     * Get totalCpuHz
     *
     * @return totalCpuHz
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Long getTotalCpuHz() {
        return totalCpuHz;
    }

    public void setTotalCpuHz(Long totalCpuHz) {
        this.totalCpuHz = totalCpuHz;
    }

    public Host totalCpuHz_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_CPU_HZ);
        return this;
    }

    public Host totalCpuHz_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CPU_HZ);
        return this;
    }

    public void setTotalCpuHz_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_CPU_HZ);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CPU_HZ);
        }
    }

    public boolean getTotalCpuHz_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_CPU_HZ);
    }

    public Host totalCpuSockets(Integer totalCpuSockets) {

        this.totalCpuSockets = totalCpuSockets;
        return this;
    }

    /**
     * Get totalCpuSockets
     *
     * @return totalCpuSockets
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getTotalCpuSockets() {
        return totalCpuSockets;
    }

    public void setTotalCpuSockets(Integer totalCpuSockets) {
        this.totalCpuSockets = totalCpuSockets;
    }

    public Host totalCpuSockets_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_CPU_SOCKETS);
        return this;
    }

    public Host totalCpuSockets_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CPU_SOCKETS);
        return this;
    }

    public void setTotalCpuSockets_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_CPU_SOCKETS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CPU_SOCKETS);
        }
    }

    public boolean getTotalCpuSockets_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_CPU_SOCKETS);
    }

    public Host totalDataCapacity(Long totalDataCapacity) {

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

    public Host totalDataCapacity_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_DATA_CAPACITY);
        return this;
    }

    public Host totalDataCapacity_ExplictlyNonNull() {
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

    public Host totalMemoryBytes(Long totalMemoryBytes) {

        this.totalMemoryBytes = totalMemoryBytes;
        return this;
    }

    /**
     * Get totalMemoryBytes
     *
     * @return totalMemoryBytes
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Long getTotalMemoryBytes() {
        return totalMemoryBytes;
    }

    public void setTotalMemoryBytes(Long totalMemoryBytes) {
        this.totalMemoryBytes = totalMemoryBytes;
    }

    public Host totalMemoryBytes_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_MEMORY_BYTES);
        return this;
    }

    public Host totalMemoryBytes_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_MEMORY_BYTES);
        return this;
    }

    public void setTotalMemoryBytes_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_MEMORY_BYTES);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_MEMORY_BYTES);
        }
    }

    public boolean getTotalMemoryBytes_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_MEMORY_BYTES);
    }

    public Host usbDevices(List<NestedUsbDevice> usbDevices) {

        this.usbDevices = usbDevices;
        return this;
    }

    public Host addUsbDevicesItem(NestedUsbDevice usbDevicesItem) {
        if (this.usbDevices == null) {
            this.usbDevices = new ArrayList<NestedUsbDevice>();
        }
        this.usbDevices.add(usbDevicesItem);
        return this;
    }

    /**
     * Get usbDevices
     *
     * @return usbDevices
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedUsbDevice> getUsbDevices() {
        return usbDevices;
    }

    public void setUsbDevices(List<NestedUsbDevice> usbDevices) {
        this.usbDevices = usbDevices;
    }

    public Host usbDevices_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USB_DEVICES);
        return this;
    }

    public Host usbDevices_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USB_DEVICES);
        return this;
    }

    public void setUsbDevices_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USB_DEVICES);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USB_DEVICES);
        }
    }

    public boolean getUsbDevices_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USB_DEVICES);
    }

    public Host usedCacheSpace(Long usedCacheSpace) {

        this.usedCacheSpace = usedCacheSpace;
        return this;
    }

    /**
     * Get usedCacheSpace
     *
     * @return usedCacheSpace
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getUsedCacheSpace() {
        return usedCacheSpace;
    }

    public void setUsedCacheSpace(Long usedCacheSpace) {
        this.usedCacheSpace = usedCacheSpace;
    }

    public Host usedCacheSpace_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USED_CACHE_SPACE);
        return this;
    }

    public Host usedCacheSpace_ExplictlyNonNull() {
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

    public Host usedCpuHz(Double usedCpuHz) {

        this.usedCpuHz = usedCpuHz;
        return this;
    }

    /**
     * Get usedCpuHz
     *
     * @return usedCpuHz
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getUsedCpuHz() {
        return usedCpuHz;
    }

    public void setUsedCpuHz(Double usedCpuHz) {
        this.usedCpuHz = usedCpuHz;
    }

    public Host usedCpuHz_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USED_CPU_HZ);
        return this;
    }

    public Host usedCpuHz_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USED_CPU_HZ);
        return this;
    }

    public void setUsedCpuHz_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USED_CPU_HZ);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USED_CPU_HZ);
        }
    }

    public boolean getUsedCpuHz_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USED_CPU_HZ);
    }

    public Host usedDataSpace(Long usedDataSpace) {

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

    public Host usedDataSpace_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USED_DATA_SPACE);
        return this;
    }

    public Host usedDataSpace_ExplictlyNonNull() {
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

    public Host usedMemoryBytes(Double usedMemoryBytes) {

        this.usedMemoryBytes = usedMemoryBytes;
        return this;
    }

    /**
     * Get usedMemoryBytes
     *
     * @return usedMemoryBytes
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getUsedMemoryBytes() {
        return usedMemoryBytes;
    }

    public void setUsedMemoryBytes(Double usedMemoryBytes) {
        this.usedMemoryBytes = usedMemoryBytes;
    }

    public Host usedMemoryBytes_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USED_MEMORY_BYTES);
        return this;
    }

    public Host usedMemoryBytes_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USED_MEMORY_BYTES);
        return this;
    }

    public void setUsedMemoryBytes_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USED_MEMORY_BYTES);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USED_MEMORY_BYTES);
        }
    }

    public boolean getUsedMemoryBytes_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USED_MEMORY_BYTES);
    }

    public Host validCacheSpace(Long validCacheSpace) {

        this.validCacheSpace = validCacheSpace;
        return this;
    }

    /**
     * Get validCacheSpace
     *
     * @return validCacheSpace
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getValidCacheSpace() {
        return validCacheSpace;
    }

    public void setValidCacheSpace(Long validCacheSpace) {
        this.validCacheSpace = validCacheSpace;
    }

    public Host validCacheSpace_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VALID_CACHE_SPACE);
        return this;
    }

    public Host validCacheSpace_ExplictlyNonNull() {
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

    public Host validFreeCacheSpace(Long validFreeCacheSpace) {

        this.validFreeCacheSpace = validFreeCacheSpace;
        return this;
    }

    /**
     * Get validFreeCacheSpace
     *
     * @return validFreeCacheSpace
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getValidFreeCacheSpace() {
        return validFreeCacheSpace;
    }

    public void setValidFreeCacheSpace(Long validFreeCacheSpace) {
        this.validFreeCacheSpace = validFreeCacheSpace;
    }

    public Host validFreeCacheSpace_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VALID_FREE_CACHE_SPACE);
        return this;
    }

    public Host validFreeCacheSpace_ExplictlyNonNull() {
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

    public Host vmNum(Integer vmNum) {

        this.vmNum = vmNum;
        return this;
    }

    /**
     * Get vmNum
     *
     * @return vmNum
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getVmNum() {
        return vmNum;
    }

    public void setVmNum(Integer vmNum) {
        this.vmNum = vmNum;
    }

    public Host vmNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_NUM);
        return this;
    }

    public Host vmNum_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_NUM);
        return this;
    }

    public void setVmNum_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_NUM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_NUM);
        }
    }

    public boolean getVmNum_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_NUM);
    }

    public Host vmotionIp(String vmotionIp) {

        this.vmotionIp = vmotionIp;
        return this;
    }

    /**
     * Get vmotionIp
     *
     * @return vmotionIp
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVmotionIp() {
        return vmotionIp;
    }

    public void setVmotionIp(String vmotionIp) {
        this.vmotionIp = vmotionIp;
    }

    public Host vmotionIp_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VMOTION_IP);
        return this;
    }

    public Host vmotionIp_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VMOTION_IP);
        return this;
    }

    public void setVmotionIp_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VMOTION_IP);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VMOTION_IP);
        }
    }

    public boolean getVmotionIp_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VMOTION_IP);
    }

    public Host vms(List<NestedVm> vms) {

        this.vms = vms;
        return this;
    }

    public Host addVmsItem(NestedVm vmsItem) {
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

    public Host vms_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VMS);
        return this;
    }

    public Host vms_ExplictlyNonNull() {
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

    public Host withFasterSsdAsCache(Boolean withFasterSsdAsCache) {

        this.withFasterSsdAsCache = withFasterSsdAsCache;
        return this;
    }

    /**
     * Get withFasterSsdAsCache
     *
     * @return withFasterSsdAsCache
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getWithFasterSsdAsCache() {
        return withFasterSsdAsCache;
    }

    public void setWithFasterSsdAsCache(Boolean withFasterSsdAsCache) {
        this.withFasterSsdAsCache = withFasterSsdAsCache;
    }

    public Host withFasterSsdAsCache_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WITH_FASTER_SSD_AS_CACHE);
        return this;
    }

    public Host withFasterSsdAsCache_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_WITH_FASTER_SSD_AS_CACHE);
        return this;
    }

    public void setWithFasterSsdAsCache_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_WITH_FASTER_SSD_AS_CACHE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_WITH_FASTER_SSD_AS_CACHE);
        }
    }

    public boolean getWithFasterSsdAsCache_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_WITH_FASTER_SSD_AS_CACHE);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Host host = (Host) o;
        return Objects.equals(this.accessIp, host.accessIp)
                && Objects.equals(
                        this.allocableCpuCoresForVmExclusive, host.allocableCpuCoresForVmExclusive)
                && Objects.equals(this.allocatableMemoryBytes, host.allocatableMemoryBytes)
                && Objects.equals(this.allocatedPrioritizedSpace, host.allocatedPrioritizedSpace)
                && Objects.equals(
                        this.allocatedPrioritizedSpaceUsage, host.allocatedPrioritizedSpaceUsage)
                && Objects.equals(this.chunkId, host.chunkId)
                && Objects.equals(this.cluster, host.cluster)
                && Objects.equals(this.commitedMemoryBytes, host.commitedMemoryBytes)
                && Objects.equals(this.compatibleCpuModels, host.compatibleCpuModels)
                && Objects.equals(this.connectStatus, host.connectStatus)
                && Objects.equals(this.cpuBrand, host.cpuBrand)
                && Objects.equals(this.cpuFanSpeed, host.cpuFanSpeed)
                && Objects.equals(this.cpuFanSpeedUnit, host.cpuFanSpeedUnit)
                && Objects.equals(this.cpuHzPerCore, host.cpuHzPerCore)
                && Objects.equals(this.cpuModel, host.cpuModel)
                && Objects.equals(this.cpuTemperatureCelsius, host.cpuTemperatureCelsius)
                && Objects.equals(this.cpuVendor, host.cpuVendor)
                && Objects.equals(this.dataIp, host.dataIp)
                && Objects.equals(this.downgradedPrioritizedSpace, host.downgradedPrioritizedSpace)
                && Objects.equals(this.entityAsyncStatus, host.entityAsyncStatus)
                && Objects.equals(this.failureDataSpace, host.failureDataSpace)
                && Objects.equals(this.gpuDevices, host.gpuDevices)
                && Objects.equals(this.hddDataCapacity, host.hddDataCapacity)
                && Objects.equals(this.hddDiskCount, host.hddDiskCount)
                && Objects.equals(this.hostState, host.hostState)
                && Objects.equals(this.hypervisorIp, host.hypervisorIp)
                && Objects.equals(this.id, host.id)
                && Objects.equals(this.iommu, host.iommu)
                && Objects.equals(this.isOsInRaid1, host.isOsInRaid1)
                && Objects.equals(this.labels, host.labels)
                && Objects.equals(this.localId, host.localId)
                && Objects.equals(this.lsmCapDiskSafeUmount, host.lsmCapDiskSafeUmount)
                && Objects.equals(this.managementIp, host.managementIp)
                && Objects.equals(this.mergedStatus, host.mergedStatus)
                && Objects.equals(this.model, host.model)
                && Objects.equals(this.name, host.name)
                && Objects.equals(this.nestedVirtualization, host.nestedVirtualization)
                && Objects.equals(this.nicCount, host.nicCount)
                && Objects.equals(this.nics, host.nics)
                && Objects.equals(this.nodeTopoLocalId, host.nodeTopoLocalId)
                && Objects.equals(this.osMemoryBytes, host.osMemoryBytes)
                && Objects.equals(this.osVersion, host.osVersion)
                && Objects.equals(this.perfAllocatedDataSpace, host.perfAllocatedDataSpace)
                && Objects.equals(this.perfFailureDataSpace, host.perfFailureDataSpace)
                && Objects.equals(this.perfTotalDataCapacity, host.perfTotalDataCapacity)
                && Objects.equals(this.perfUsedDataSpace, host.perfUsedDataSpace)
                && Objects.equals(this.perfValidDataSpace, host.perfValidDataSpace)
                && Objects.equals(this.plannedPrioritizedSpace, host.plannedPrioritizedSpace)
                && Objects.equals(this.pmemDimmCapacity, host.pmemDimmCapacity)
                && Objects.equals(this.pmemDimmCount, host.pmemDimmCount)
                && Objects.equals(this.pmemDiskCount, host.pmemDiskCount)
                && Objects.equals(this.prioSpacePercentage, host.prioSpacePercentage)
                && Objects.equals(this.provisionedCpuCores, host.provisionedCpuCores)
                && Objects.equals(this.provisionedMemoryBytes, host.provisionedMemoryBytes)
                && Objects.equals(this.runningPauseVmMemoryBytes, host.runningPauseVmMemoryBytes)
                && Objects.equals(this.runningVmNum, host.runningVmNum)
                && Objects.equals(this.scvmCpu, host.scvmCpu)
                && Objects.equals(this.scvmMemory, host.scvmMemory)
                && Objects.equals(this.scvmName, host.scvmName)
                && Objects.equals(this.serial, host.serial)
                && Objects.equals(this.ssdDataCapacity, host.ssdDataCapacity)
                && Objects.equals(this.ssdDiskCount, host.ssdDiskCount)
                && Objects.equals(this.state, host.state)
                && Objects.equals(this.status, host.status)
                && Objects.equals(this.stoppedVmNum, host.stoppedVmNum)
                && Objects.equals(this.suspendedVmNum, host.suspendedVmNum)
                && Objects.equals(this.totalCacheCapacity, host.totalCacheCapacity)
                && Objects.equals(this.totalCpuCores, host.totalCpuCores)
                && Objects.equals(this.totalCpuHz, host.totalCpuHz)
                && Objects.equals(this.totalCpuSockets, host.totalCpuSockets)
                && Objects.equals(this.totalDataCapacity, host.totalDataCapacity)
                && Objects.equals(this.totalMemoryBytes, host.totalMemoryBytes)
                && Objects.equals(this.usbDevices, host.usbDevices)
                && Objects.equals(this.usedCacheSpace, host.usedCacheSpace)
                && Objects.equals(this.usedCpuHz, host.usedCpuHz)
                && Objects.equals(this.usedDataSpace, host.usedDataSpace)
                && Objects.equals(this.usedMemoryBytes, host.usedMemoryBytes)
                && Objects.equals(this.validCacheSpace, host.validCacheSpace)
                && Objects.equals(this.validFreeCacheSpace, host.validFreeCacheSpace)
                && Objects.equals(this.vmNum, host.vmNum)
                && Objects.equals(this.vmotionIp, host.vmotionIp)
                && Objects.equals(this.vms, host.vms)
                && Objects.equals(this.withFasterSsdAsCache, host.withFasterSsdAsCache);
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
                accessIp,
                allocableCpuCoresForVmExclusive,
                allocatableMemoryBytes,
                allocatedPrioritizedSpace,
                allocatedPrioritizedSpaceUsage,
                chunkId,
                cluster,
                commitedMemoryBytes,
                compatibleCpuModels,
                connectStatus,
                cpuBrand,
                cpuFanSpeed,
                cpuFanSpeedUnit,
                cpuHzPerCore,
                cpuModel,
                cpuTemperatureCelsius,
                cpuVendor,
                dataIp,
                downgradedPrioritizedSpace,
                entityAsyncStatus,
                failureDataSpace,
                gpuDevices,
                hddDataCapacity,
                hddDiskCount,
                hostState,
                hypervisorIp,
                id,
                iommu,
                isOsInRaid1,
                labels,
                localId,
                lsmCapDiskSafeUmount,
                managementIp,
                mergedStatus,
                model,
                name,
                nestedVirtualization,
                nicCount,
                nics,
                nodeTopoLocalId,
                osMemoryBytes,
                osVersion,
                perfAllocatedDataSpace,
                perfFailureDataSpace,
                perfTotalDataCapacity,
                perfUsedDataSpace,
                perfValidDataSpace,
                plannedPrioritizedSpace,
                pmemDimmCapacity,
                pmemDimmCount,
                pmemDiskCount,
                prioSpacePercentage,
                provisionedCpuCores,
                provisionedMemoryBytes,
                runningPauseVmMemoryBytes,
                runningVmNum,
                scvmCpu,
                scvmMemory,
                scvmName,
                serial,
                ssdDataCapacity,
                ssdDiskCount,
                state,
                status,
                stoppedVmNum,
                suspendedVmNum,
                totalCacheCapacity,
                totalCpuCores,
                totalCpuHz,
                totalCpuSockets,
                totalDataCapacity,
                totalMemoryBytes,
                usbDevices,
                usedCacheSpace,
                usedCpuHz,
                usedDataSpace,
                usedMemoryBytes,
                validCacheSpace,
                validFreeCacheSpace,
                vmNum,
                vmotionIp,
                vms,
                withFasterSsdAsCache);
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
        sb.append("class Host {\n");
        sb.append("    accessIp: ").append(toIndentedString(accessIp)).append("\n");
        sb.append("    allocableCpuCoresForVmExclusive: ")
                .append(toIndentedString(allocableCpuCoresForVmExclusive))
                .append("\n");
        sb.append("    allocatableMemoryBytes: ")
                .append(toIndentedString(allocatableMemoryBytes))
                .append("\n");
        sb.append("    allocatedPrioritizedSpace: ")
                .append(toIndentedString(allocatedPrioritizedSpace))
                .append("\n");
        sb.append("    allocatedPrioritizedSpaceUsage: ")
                .append(toIndentedString(allocatedPrioritizedSpaceUsage))
                .append("\n");
        sb.append("    chunkId: ").append(toIndentedString(chunkId)).append("\n");
        sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
        sb.append("    commitedMemoryBytes: ")
                .append(toIndentedString(commitedMemoryBytes))
                .append("\n");
        sb.append("    compatibleCpuModels: ")
                .append(toIndentedString(compatibleCpuModels))
                .append("\n");
        sb.append("    connectStatus: ").append(toIndentedString(connectStatus)).append("\n");
        sb.append("    cpuBrand: ").append(toIndentedString(cpuBrand)).append("\n");
        sb.append("    cpuFanSpeed: ").append(toIndentedString(cpuFanSpeed)).append("\n");
        sb.append("    cpuFanSpeedUnit: ").append(toIndentedString(cpuFanSpeedUnit)).append("\n");
        sb.append("    cpuHzPerCore: ").append(toIndentedString(cpuHzPerCore)).append("\n");
        sb.append("    cpuModel: ").append(toIndentedString(cpuModel)).append("\n");
        sb.append("    cpuTemperatureCelsius: ")
                .append(toIndentedString(cpuTemperatureCelsius))
                .append("\n");
        sb.append("    cpuVendor: ").append(toIndentedString(cpuVendor)).append("\n");
        sb.append("    dataIp: ").append(toIndentedString(dataIp)).append("\n");
        sb.append("    downgradedPrioritizedSpace: ")
                .append(toIndentedString(downgradedPrioritizedSpace))
                .append("\n");
        sb.append("    entityAsyncStatus: ")
                .append(toIndentedString(entityAsyncStatus))
                .append("\n");
        sb.append("    failureDataSpace: ").append(toIndentedString(failureDataSpace)).append("\n");
        sb.append("    gpuDevices: ").append(toIndentedString(gpuDevices)).append("\n");
        sb.append("    hddDataCapacity: ").append(toIndentedString(hddDataCapacity)).append("\n");
        sb.append("    hddDiskCount: ").append(toIndentedString(hddDiskCount)).append("\n");
        sb.append("    hostState: ").append(toIndentedString(hostState)).append("\n");
        sb.append("    hypervisorIp: ").append(toIndentedString(hypervisorIp)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    iommu: ").append(toIndentedString(iommu)).append("\n");
        sb.append("    isOsInRaid1: ").append(toIndentedString(isOsInRaid1)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
        sb.append("    lsmCapDiskSafeUmount: ")
                .append(toIndentedString(lsmCapDiskSafeUmount))
                .append("\n");
        sb.append("    managementIp: ").append(toIndentedString(managementIp)).append("\n");
        sb.append("    mergedStatus: ").append(toIndentedString(mergedStatus)).append("\n");
        sb.append("    model: ").append(toIndentedString(model)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    nestedVirtualization: ")
                .append(toIndentedString(nestedVirtualization))
                .append("\n");
        sb.append("    nicCount: ").append(toIndentedString(nicCount)).append("\n");
        sb.append("    nics: ").append(toIndentedString(nics)).append("\n");
        sb.append("    nodeTopoLocalId: ").append(toIndentedString(nodeTopoLocalId)).append("\n");
        sb.append("    osMemoryBytes: ").append(toIndentedString(osMemoryBytes)).append("\n");
        sb.append("    osVersion: ").append(toIndentedString(osVersion)).append("\n");
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
        sb.append("    pmemDimmCapacity: ").append(toIndentedString(pmemDimmCapacity)).append("\n");
        sb.append("    pmemDimmCount: ").append(toIndentedString(pmemDimmCount)).append("\n");
        sb.append("    pmemDiskCount: ").append(toIndentedString(pmemDiskCount)).append("\n");
        sb.append("    prioSpacePercentage: ")
                .append(toIndentedString(prioSpacePercentage))
                .append("\n");
        sb.append("    provisionedCpuCores: ")
                .append(toIndentedString(provisionedCpuCores))
                .append("\n");
        sb.append("    provisionedMemoryBytes: ")
                .append(toIndentedString(provisionedMemoryBytes))
                .append("\n");
        sb.append("    runningPauseVmMemoryBytes: ")
                .append(toIndentedString(runningPauseVmMemoryBytes))
                .append("\n");
        sb.append("    runningVmNum: ").append(toIndentedString(runningVmNum)).append("\n");
        sb.append("    scvmCpu: ").append(toIndentedString(scvmCpu)).append("\n");
        sb.append("    scvmMemory: ").append(toIndentedString(scvmMemory)).append("\n");
        sb.append("    scvmName: ").append(toIndentedString(scvmName)).append("\n");
        sb.append("    serial: ").append(toIndentedString(serial)).append("\n");
        sb.append("    ssdDataCapacity: ").append(toIndentedString(ssdDataCapacity)).append("\n");
        sb.append("    ssdDiskCount: ").append(toIndentedString(ssdDiskCount)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    stoppedVmNum: ").append(toIndentedString(stoppedVmNum)).append("\n");
        sb.append("    suspendedVmNum: ").append(toIndentedString(suspendedVmNum)).append("\n");
        sb.append("    totalCacheCapacity: ")
                .append(toIndentedString(totalCacheCapacity))
                .append("\n");
        sb.append("    totalCpuCores: ").append(toIndentedString(totalCpuCores)).append("\n");
        sb.append("    totalCpuHz: ").append(toIndentedString(totalCpuHz)).append("\n");
        sb.append("    totalCpuSockets: ").append(toIndentedString(totalCpuSockets)).append("\n");
        sb.append("    totalDataCapacity: ")
                .append(toIndentedString(totalDataCapacity))
                .append("\n");
        sb.append("    totalMemoryBytes: ").append(toIndentedString(totalMemoryBytes)).append("\n");
        sb.append("    usbDevices: ").append(toIndentedString(usbDevices)).append("\n");
        sb.append("    usedCacheSpace: ").append(toIndentedString(usedCacheSpace)).append("\n");
        sb.append("    usedCpuHz: ").append(toIndentedString(usedCpuHz)).append("\n");
        sb.append("    usedDataSpace: ").append(toIndentedString(usedDataSpace)).append("\n");
        sb.append("    usedMemoryBytes: ").append(toIndentedString(usedMemoryBytes)).append("\n");
        sb.append("    validCacheSpace: ").append(toIndentedString(validCacheSpace)).append("\n");
        sb.append("    validFreeCacheSpace: ")
                .append(toIndentedString(validFreeCacheSpace))
                .append("\n");
        sb.append("    vmNum: ").append(toIndentedString(vmNum)).append("\n");
        sb.append("    vmotionIp: ").append(toIndentedString(vmotionIp)).append("\n");
        sb.append("    vms: ").append(toIndentedString(vms)).append("\n");
        sb.append("    withFasterSsdAsCache: ")
                .append(toIndentedString(withFasterSsdAsCache))
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

package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** Cluster */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class Cluster extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_ACCESS_WRITE_COMPRESS_ENABLED =
            "access_write_compress_enabled";

    @SerializedName(SERIALIZED_NAME_ACCESS_WRITE_COMPRESS_ENABLED)
    private Boolean accessWriteCompressEnabled;

    public static final String SERIALIZED_NAME_ALLOCATED_MEMORY_BYTES = "allocated_memory_bytes";

    @SerializedName(SERIALIZED_NAME_ALLOCATED_MEMORY_BYTES)
    private Long allocatedMemoryBytes;

    public static final String SERIALIZED_NAME_ALLOCATED_PRIORITIZED_SPACE =
            "allocated_prioritized_space";

    @SerializedName(SERIALIZED_NAME_ALLOCATED_PRIORITIZED_SPACE)
    private Long allocatedPrioritizedSpace;

    public static final String SERIALIZED_NAME_ALLOCATED_PRIORITIZED_SPACE_USAGE =
            "allocated_prioritized_space_usage";

    @SerializedName(SERIALIZED_NAME_ALLOCATED_PRIORITIZED_SPACE_USAGE)
    private Double allocatedPrioritizedSpaceUsage;

    public static final String SERIALIZED_NAME_APPLICATION_HIGHEST_VERSION =
            "application_highest_version";

    @SerializedName(SERIALIZED_NAME_APPLICATION_HIGHEST_VERSION)
    private String applicationHighestVersion;

    public static final String SERIALIZED_NAME_ARCHITECTURE = "architecture";

    @SerializedName(SERIALIZED_NAME_ARCHITECTURE)
    private Architecture architecture;

    public static final String SERIALIZED_NAME_AUTO_CONVERGE = "auto_converge";

    @SerializedName(SERIALIZED_NAME_AUTO_CONVERGE)
    private Boolean autoConverge;

    public static final String SERIALIZED_NAME_CAP_SNAPSHOT_UNIQUE_SIZE =
            "cap_snapshot_unique_size";

    @SerializedName(SERIALIZED_NAME_CAP_SNAPSHOT_UNIQUE_SIZE)
    private Long capSnapshotUniqueSize;

    public static final String SERIALIZED_NAME_CAP_VOLUME_UNIQUE_SIZE = "cap_volume_unique_size";

    @SerializedName(SERIALIZED_NAME_CAP_VOLUME_UNIQUE_SIZE)
    private Long capVolumeUniqueSize;

    public static final String SERIALIZED_NAME_COMMITED_MEMORY_BYTES = "commited_memory_bytes";

    @SerializedName(SERIALIZED_NAME_COMMITED_MEMORY_BYTES)
    private Long commitedMemoryBytes;

    public static final String SERIALIZED_NAME_CONNECT_STATE = "connect_state";

    @SerializedName(SERIALIZED_NAME_CONNECT_STATE)
    private ConnectState connectState;

    public static final String SERIALIZED_NAME_CURRENT_CPU_MODEL = "current_cpu_model";

    @SerializedName(SERIALIZED_NAME_CURRENT_CPU_MODEL)
    private String currentCpuModel;

    public static final String SERIALIZED_NAME_DATA_REDUCTION_RATIO = "data_reduction_ratio";

    @SerializedName(SERIALIZED_NAME_DATA_REDUCTION_RATIO)
    private Double dataReductionRatio;

    public static final String SERIALIZED_NAME_DATA_REDUCTION_SAVING = "data_reduction_saving";

    @SerializedName(SERIALIZED_NAME_DATA_REDUCTION_SAVING)
    private Double dataReductionSaving;

    public static final String SERIALIZED_NAME_DATACENTERS = "datacenters";

    @SerializedName(SERIALIZED_NAME_DATACENTERS)
    private List<NestedDatacenter> datacenters = null;

    public static final String SERIALIZED_NAME_DIRTY_CACHE_SPACE = "dirty_cache_space";

    @SerializedName(SERIALIZED_NAME_DIRTY_CACHE_SPACE)
    private Long dirtyCacheSpace;

    public static final String SERIALIZED_NAME_DIRTY_CACHE_USAGE = "dirty_cache_usage";

    @SerializedName(SERIALIZED_NAME_DIRTY_CACHE_USAGE)
    private Double dirtyCacheUsage;

    public static final String SERIALIZED_NAME_DISCONNECTED_DATE = "disconnected_date";

    @SerializedName(SERIALIZED_NAME_DISCONNECTED_DATE)
    private String disconnectedDate;

    public static final String SERIALIZED_NAME_DISCONNECTED_REASON = "disconnected_reason";

    @SerializedName(SERIALIZED_NAME_DISCONNECTED_REASON)
    private ClusterConnectorErrorCode disconnectedReason;

    public static final String SERIALIZED_NAME_DNS = "dns";

    @SerializedName(SERIALIZED_NAME_DNS)
    private List<String> dns = new ArrayList<String>();

    public static final String SERIALIZED_NAME_DOWNGRADED_PRIORITIZED_SPACE =
            "downgraded_prioritized_space";

    @SerializedName(SERIALIZED_NAME_DOWNGRADED_PRIORITIZED_SPACE)
    private Long downgradedPrioritizedSpace;

    public static final String SERIALIZED_NAME_ENABLE_TIERING = "enable_tiering";

    @SerializedName(SERIALIZED_NAME_ENABLE_TIERING)
    private Boolean enableTiering;

    public static final String SERIALIZED_NAME_ENTITY_ASYNC_STATUS = "entityAsyncStatus";

    @SerializedName(SERIALIZED_NAME_ENTITY_ASYNC_STATUS)
    private EntityAsyncStatus entityAsyncStatus;

    public static final String SERIALIZED_NAME_EVEROUTE_CLUSTER = "everoute_cluster";

    @SerializedName(SERIALIZED_NAME_EVEROUTE_CLUSTER)
    private NestedEverouteCluster everouteCluster;

    public static final String SERIALIZED_NAME_FAILURE_CACHE_SPACE = "failure_cache_space";

    @SerializedName(SERIALIZED_NAME_FAILURE_CACHE_SPACE)
    private Long failureCacheSpace;

    public static final String SERIALIZED_NAME_FAILURE_DATA_SPACE = "failure_data_space";

    @SerializedName(SERIALIZED_NAME_FAILURE_DATA_SPACE)
    private Long failureDataSpace;

    public static final String SERIALIZED_NAME_HAS_METROX = "has_metrox";

    @SerializedName(SERIALIZED_NAME_HAS_METROX)
    private Boolean hasMetrox;

    public static final String SERIALIZED_NAME_HOST_NUM = "host_num";

    @SerializedName(SERIALIZED_NAME_HOST_NUM)
    private Integer hostNum;

    public static final String SERIALIZED_NAME_HOSTS = "hosts";

    @SerializedName(SERIALIZED_NAME_HOSTS)
    private List<NestedHost> hosts = null;

    public static final String SERIALIZED_NAME_HYPERVISOR = "hypervisor";

    @SerializedName(SERIALIZED_NAME_HYPERVISOR)
    private Hypervisor hypervisor;

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

    public static final String SERIALIZED_NAME_IP = "ip";

    @SerializedName(SERIALIZED_NAME_IP)
    private String ip;

    public static final String SERIALIZED_NAME_IS_ALL_FLASH = "is_all_flash";

    @SerializedName(SERIALIZED_NAME_IS_ALL_FLASH)
    private Boolean isAllFlash;

    public static final String SERIALIZED_NAME_ISCSI_VIP = "iscsi_vip";

    @SerializedName(SERIALIZED_NAME_ISCSI_VIP)
    private String iscsiVip;

    public static final String SERIALIZED_NAME_LABELS = "labels";

    @SerializedName(SERIALIZED_NAME_LABELS)
    private List<NestedLabel> labels = null;

    public static final String SERIALIZED_NAME_LICENSE_EXPIRE_DATE = "license_expire_date";

    @SerializedName(SERIALIZED_NAME_LICENSE_EXPIRE_DATE)
    private String licenseExpireDate;

    public static final String SERIALIZED_NAME_LICENSE_SERIAL = "license_serial";

    @SerializedName(SERIALIZED_NAME_LICENSE_SERIAL)
    private String licenseSerial;

    public static final String SERIALIZED_NAME_LICENSE_SIGN_DATE = "license_sign_date";

    @SerializedName(SERIALIZED_NAME_LICENSE_SIGN_DATE)
    private String licenseSignDate;

    public static final String SERIALIZED_NAME_LICENSE_TYPE = "license_type";

    @SerializedName(SERIALIZED_NAME_LICENSE_TYPE)
    private LicenseType licenseType;

    public static final String SERIALIZED_NAME_LOCAL_ID = "local_id";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID)
    private String localId;

    public static final String SERIALIZED_NAME_LOGICAL_USED_DATA_SPACE = "logical_used_data_space";

    @SerializedName(SERIALIZED_NAME_LOGICAL_USED_DATA_SPACE)
    private Long logicalUsedDataSpace;

    public static final String SERIALIZED_NAME_MAINTENANCE_END_DATE = "maintenance_end_date";

    @SerializedName(SERIALIZED_NAME_MAINTENANCE_END_DATE)
    private String maintenanceEndDate;

    public static final String SERIALIZED_NAME_MAINTENANCE_START_DATE = "maintenance_start_date";

    @SerializedName(SERIALIZED_NAME_MAINTENANCE_START_DATE)
    private String maintenanceStartDate;

    public static final String SERIALIZED_NAME_MANAGEMENT_VIP = "management_vip";

    @SerializedName(SERIALIZED_NAME_MANAGEMENT_VIP)
    private String managementVip;

    public static final String SERIALIZED_NAME_MAX_CHUNK_NUM = "max_chunk_num";

    @SerializedName(SERIALIZED_NAME_MAX_CHUNK_NUM)
    private Integer maxChunkNum;

    public static final String SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY =
            "max_physical_data_capacity";

    @SerializedName(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY)
    private Long maxPhysicalDataCapacity;

    public static final String SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_PER_NODE =
            "max_physical_data_capacity_per_node";

    @SerializedName(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_PER_NODE)
    private Long maxPhysicalDataCapacityPerNode;

    public static final String SERIALIZED_NAME_MEMORY_ALLOCATION_RATE = "memory_allocation_rate";

    @SerializedName(SERIALIZED_NAME_MEMORY_ALLOCATION_RATE)
    private Double memoryAllocationRate;

    public static final String SERIALIZED_NAME_METRO_AVAILABILITY_CHECKLIST =
            "metro_availability_checklist";

    @SerializedName(SERIALIZED_NAME_METRO_AVAILABILITY_CHECKLIST)
    private NestedMetroAvailabilityChecklist metroAvailabilityChecklist;

    public static final String SERIALIZED_NAME_MGT_GATEWAY = "mgt_gateway";

    @SerializedName(SERIALIZED_NAME_MGT_GATEWAY)
    private String mgtGateway;

    public static final String SERIALIZED_NAME_MGT_NETMASK = "mgt_netmask";

    @SerializedName(SERIALIZED_NAME_MGT_NETMASK)
    private String mgtNetmask;

    public static final String SERIALIZED_NAME_MIGRATION_DATA_SIZE = "migration_data_size";

    @SerializedName(SERIALIZED_NAME_MIGRATION_DATA_SIZE)
    private Long migrationDataSize;

    public static final String SERIALIZED_NAME_MIGRATION_SPEED = "migration_speed";

    @SerializedName(SERIALIZED_NAME_MIGRATION_SPEED)
    private Long migrationSpeed;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_NO_PERFORMANCE_LAYER = "no_performance_layer";

    @SerializedName(SERIALIZED_NAME_NO_PERFORMANCE_LAYER)
    private Boolean noPerformanceLayer;

    public static final String SERIALIZED_NAME_NTP_MODE = "ntp_mode";

    @SerializedName(SERIALIZED_NAME_NTP_MODE)
    private NtpMode ntpMode;

    public static final String SERIALIZED_NAME_NTP_SERVERS = "ntp_servers";

    @SerializedName(SERIALIZED_NAME_NTP_SERVERS)
    private List<String> ntpServers = new ArrayList<String>();

    public static final String SERIALIZED_NAME_NVME_OVER_RDMA_ENABLED = "nvme_over_rdma_enabled";

    @SerializedName(SERIALIZED_NAME_NVME_OVER_RDMA_ENABLED)
    private Boolean nvmeOverRdmaEnabled;

    public static final String SERIALIZED_NAME_NVME_OVER_TCP_ENABLED = "nvme_over_tcp_enabled";

    @SerializedName(SERIALIZED_NAME_NVME_OVER_TCP_ENABLED)
    private Boolean nvmeOverTcpEnabled;

    public static final String SERIALIZED_NAME_NVMF_ENABLED = "nvmf_enabled";

    @SerializedName(SERIALIZED_NAME_NVMF_ENABLED)
    private Boolean nvmfEnabled;

    public static final String SERIALIZED_NAME_OVERALL_EFFICIENCY = "overall_efficiency";

    @SerializedName(SERIALIZED_NAME_OVERALL_EFFICIENCY)
    private Double overallEfficiency;

    public static final String SERIALIZED_NAME_OVERCOMMIT_MEMORY_RATIO = "overcommit_memory_ratio";

    @SerializedName(SERIALIZED_NAME_OVERCOMMIT_MEMORY_RATIO)
    private Double overcommitMemoryRatio;

    public static final String SERIALIZED_NAME_OVERPROVISION_RATIO = "overprovision_ratio";

    @SerializedName(SERIALIZED_NAME_OVERPROVISION_RATIO)
    private Double overprovisionRatio;

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

    public static final String SERIALIZED_NAME_PMEM_ENABLED = "pmem_enabled";

    @SerializedName(SERIALIZED_NAME_PMEM_ENABLED)
    private Boolean pmemEnabled;

    public static final String SERIALIZED_NAME_PRIO_SPACE_PERCENTAGE = "prio_space_percentage";

    @SerializedName(SERIALIZED_NAME_PRIO_SPACE_PERCENTAGE)
    private Double prioSpacePercentage;

    public static final String SERIALIZED_NAME_PROVISIONED_CPU_CORES = "provisioned_cpu_cores";

    @SerializedName(SERIALIZED_NAME_PROVISIONED_CPU_CORES)
    private Integer provisionedCpuCores;

    public static final String SERIALIZED_NAME_PROVISIONED_CPU_CORES_FOR_ACTIVE_VM =
            "provisioned_cpu_cores_for_active_vm";

    @SerializedName(SERIALIZED_NAME_PROVISIONED_CPU_CORES_FOR_ACTIVE_VM)
    private Integer provisionedCpuCoresForActiveVm;

    public static final String SERIALIZED_NAME_PROVISIONED_FOR_ACTIVE_VM_RATIO =
            "provisioned_for_active_vm_ratio";

    @SerializedName(SERIALIZED_NAME_PROVISIONED_FOR_ACTIVE_VM_RATIO)
    private Double provisionedForActiveVmRatio;

    public static final String SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES =
            "provisioned_memory_bytes";

    @SerializedName(SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES)
    private Long provisionedMemoryBytes;

    public static final String SERIALIZED_NAME_PROVISIONED_RATIO = "provisioned_ratio";

    @SerializedName(SERIALIZED_NAME_PROVISIONED_RATIO)
    private Double provisionedRatio;

    public static final String SERIALIZED_NAME_RDMA_ENABLED = "rdma_enabled";

    @SerializedName(SERIALIZED_NAME_RDMA_ENABLED)
    private Boolean rdmaEnabled;

    public static final String SERIALIZED_NAME_RECOMMENDED_CPU_MODELS = "recommended_cpu_models";

    @SerializedName(SERIALIZED_NAME_RECOMMENDED_CPU_MODELS)
    private List<String> recommendedCpuModels = new ArrayList<String>();

    public static final String SERIALIZED_NAME_RECOVER_DATA_SIZE = "recover_data_size";

    @SerializedName(SERIALIZED_NAME_RECOVER_DATA_SIZE)
    private Long recoverDataSize;

    public static final String SERIALIZED_NAME_RECOVER_SPEED = "recover_speed";

    @SerializedName(SERIALIZED_NAME_RECOVER_SPEED)
    private Long recoverSpeed;

    public static final String SERIALIZED_NAME_REPLICA_CAPACITY_ONLY = "replica_capacity_only";

    @SerializedName(SERIALIZED_NAME_REPLICA_CAPACITY_ONLY)
    private Boolean replicaCapacityOnly;

    public static final String SERIALIZED_NAME_RESERVED_CPU_CORES_FOR_SYSTEM_SERVICE =
            "reserved_cpu_cores_for_system_service";

    @SerializedName(SERIALIZED_NAME_RESERVED_CPU_CORES_FOR_SYSTEM_SERVICE)
    private Integer reservedCpuCoresForSystemService;

    public static final String SERIALIZED_NAME_RUNNING_VM_NUM = "running_vm_num";

    @SerializedName(SERIALIZED_NAME_RUNNING_VM_NUM)
    private Integer runningVmNum;

    public static final String SERIALIZED_NAME_SOFTWARE_EDITION = "software_edition";

    @SerializedName(SERIALIZED_NAME_SOFTWARE_EDITION)
    private SoftwareEdition softwareEdition;

    public static final String SERIALIZED_NAME_STOPPED_VM_NUM = "stopped_vm_num";

    @SerializedName(SERIALIZED_NAME_STOPPED_VM_NUM)
    private Integer stoppedVmNum;

    public static final String SERIALIZED_NAME_STRETCH = "stretch";

    @SerializedName(SERIALIZED_NAME_STRETCH)
    private Boolean stretch;

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

    public static final String SERIALIZED_NAME_TOTAL_CPU_MODELS = "total_cpu_models";

    @SerializedName(SERIALIZED_NAME_TOTAL_CPU_MODELS)
    private List<String> totalCpuModels = new ArrayList<String>();

    public static final String SERIALIZED_NAME_TOTAL_CPU_SOCKETS = "total_cpu_sockets";

    @SerializedName(SERIALIZED_NAME_TOTAL_CPU_SOCKETS)
    private Integer totalCpuSockets;

    public static final String SERIALIZED_NAME_TOTAL_DATA_CAPACITY = "total_data_capacity";

    @SerializedName(SERIALIZED_NAME_TOTAL_DATA_CAPACITY)
    private Long totalDataCapacity;

    public static final String SERIALIZED_NAME_TOTAL_MEMORY_BYTES = "total_memory_bytes";

    @SerializedName(SERIALIZED_NAME_TOTAL_MEMORY_BYTES)
    private Long totalMemoryBytes;

    public static final String SERIALIZED_NAME_TOTAL_PRIO_VOLUME_SIZE = "total_prio_volume_size";

    @SerializedName(SERIALIZED_NAME_TOTAL_PRIO_VOLUME_SIZE)
    private Long totalPrioVolumeSize;

    public static final String SERIALIZED_NAME_TOTAL_PRIO_VOLUME_SIZE_USAGE =
            "total_prio_volume_size_usage";

    @SerializedName(SERIALIZED_NAME_TOTAL_PRIO_VOLUME_SIZE_USAGE)
    private Double totalPrioVolumeSizeUsage;

    public static final String SERIALIZED_NAME_TYPE = "type";

    @SerializedName(SERIALIZED_NAME_TYPE)
    private ClusterType type;

    public static final String SERIALIZED_NAME_UPGRADE_FOR_TIERING = "upgrade_for_tiering";

    @SerializedName(SERIALIZED_NAME_UPGRADE_FOR_TIERING)
    private Boolean upgradeForTiering;

    public static final String SERIALIZED_NAME_UPGRADE_TOOL_VERSION = "upgrade_tool_version";

    @SerializedName(SERIALIZED_NAME_UPGRADE_TOOL_VERSION)
    private String upgradeToolVersion;

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

    public static final String SERIALIZED_NAME_VALID_DATA_SPACE = "valid_data_space";

    @SerializedName(SERIALIZED_NAME_VALID_DATA_SPACE)
    private Long validDataSpace;

    public static final String SERIALIZED_NAME_VDSES = "vdses";

    @SerializedName(SERIALIZED_NAME_VDSES)
    private List<NestedVds> vdses = null;

    public static final String SERIALIZED_NAME_VERSION = "version";

    @SerializedName(SERIALIZED_NAME_VERSION)
    private String version;

    public static final String SERIALIZED_NAME_VHOST_ENABLED = "vhost_enabled";

    @SerializedName(SERIALIZED_NAME_VHOST_ENABLED)
    private Boolean vhostEnabled;

    public static final String SERIALIZED_NAME_VM_FOLDERS = "vm_folders";

    @SerializedName(SERIALIZED_NAME_VM_FOLDERS)
    private List<NestedVmFolder> vmFolders = null;

    public static final String SERIALIZED_NAME_VM_NUM = "vm_num";

    @SerializedName(SERIALIZED_NAME_VM_NUM)
    private Integer vmNum;

    public static final String SERIALIZED_NAME_VM_TEMPLATES = "vm_templates";

    @SerializedName(SERIALIZED_NAME_VM_TEMPLATES)
    private List<NestedVmTemplate> vmTemplates = null;

    public static final String SERIALIZED_NAME_VMS = "vms";

    @SerializedName(SERIALIZED_NAME_VMS)
    private List<NestedVm> vms = null;

    public Cluster() {}

    public Cluster accessWriteCompressEnabled(Boolean accessWriteCompressEnabled) {

        this.accessWriteCompressEnabled = accessWriteCompressEnabled;
        return this;
    }

    /**
     * Get accessWriteCompressEnabled
     *
     * @return accessWriteCompressEnabled
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getAccessWriteCompressEnabled() {
        return accessWriteCompressEnabled;
    }

    public void setAccessWriteCompressEnabled(Boolean accessWriteCompressEnabled) {
        this.accessWriteCompressEnabled = accessWriteCompressEnabled;
    }

    public Cluster accessWriteCompressEnabled_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ACCESS_WRITE_COMPRESS_ENABLED);
        return this;
    }

    public Cluster accessWriteCompressEnabled_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ACCESS_WRITE_COMPRESS_ENABLED);
        return this;
    }

    public void setAccessWriteCompressEnabled_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ACCESS_WRITE_COMPRESS_ENABLED);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ACCESS_WRITE_COMPRESS_ENABLED);
        }
    }

    public boolean getAccessWriteCompressEnabled_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ACCESS_WRITE_COMPRESS_ENABLED);
    }

    public Cluster allocatedMemoryBytes(Long allocatedMemoryBytes) {

        this.allocatedMemoryBytes = allocatedMemoryBytes;
        return this;
    }

    /**
     * Get allocatedMemoryBytes
     *
     * @return allocatedMemoryBytes
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getAllocatedMemoryBytes() {
        return allocatedMemoryBytes;
    }

    public void setAllocatedMemoryBytes(Long allocatedMemoryBytes) {
        this.allocatedMemoryBytes = allocatedMemoryBytes;
    }

    public Cluster allocatedMemoryBytes_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ALLOCATED_MEMORY_BYTES);
        return this;
    }

    public Cluster allocatedMemoryBytes_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ALLOCATED_MEMORY_BYTES);
        return this;
    }

    public void setAllocatedMemoryBytes_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ALLOCATED_MEMORY_BYTES);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ALLOCATED_MEMORY_BYTES);
        }
    }

    public boolean getAllocatedMemoryBytes_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ALLOCATED_MEMORY_BYTES);
    }

    public Cluster allocatedPrioritizedSpace(Long allocatedPrioritizedSpace) {

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

    public Cluster allocatedPrioritizedSpace_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ALLOCATED_PRIORITIZED_SPACE);
        return this;
    }

    public Cluster allocatedPrioritizedSpace_ExplictlyNonNull() {
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

    public Cluster allocatedPrioritizedSpaceUsage(Double allocatedPrioritizedSpaceUsage) {

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

    public Cluster allocatedPrioritizedSpaceUsage_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ALLOCATED_PRIORITIZED_SPACE_USAGE);
        return this;
    }

    public Cluster allocatedPrioritizedSpaceUsage_ExplictlyNonNull() {
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

    public Cluster applicationHighestVersion(String applicationHighestVersion) {

        this.applicationHighestVersion = applicationHighestVersion;
        return this;
    }

    /**
     * Get applicationHighestVersion
     *
     * @return applicationHighestVersion
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getApplicationHighestVersion() {
        return applicationHighestVersion;
    }

    public void setApplicationHighestVersion(String applicationHighestVersion) {
        this.applicationHighestVersion = applicationHighestVersion;
    }

    public Cluster applicationHighestVersion_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_APPLICATION_HIGHEST_VERSION);
        return this;
    }

    public Cluster applicationHighestVersion_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_APPLICATION_HIGHEST_VERSION);
        return this;
    }

    public void setApplicationHighestVersion_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_APPLICATION_HIGHEST_VERSION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_APPLICATION_HIGHEST_VERSION);
        }
    }

    public boolean getApplicationHighestVersion_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_APPLICATION_HIGHEST_VERSION);
    }

    public Cluster architecture(Architecture architecture) {

        this.architecture = architecture;
        return this;
    }

    /**
     * Get architecture
     *
     * @return architecture
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Architecture getArchitecture() {
        return architecture;
    }

    public void setArchitecture(Architecture architecture) {
        this.architecture = architecture;
    }

    public Cluster architecture_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ARCHITECTURE);
        return this;
    }

    public Cluster architecture_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ARCHITECTURE);
        return this;
    }

    public void setArchitecture_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ARCHITECTURE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ARCHITECTURE);
        }
    }

    public boolean getArchitecture_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ARCHITECTURE);
    }

    public Cluster autoConverge(Boolean autoConverge) {

        this.autoConverge = autoConverge;
        return this;
    }

    /**
     * Get autoConverge
     *
     * @return autoConverge
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getAutoConverge() {
        return autoConverge;
    }

    public void setAutoConverge(Boolean autoConverge) {
        this.autoConverge = autoConverge;
    }

    public Cluster autoConverge_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_AUTO_CONVERGE);
        return this;
    }

    public Cluster autoConverge_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_AUTO_CONVERGE);
        return this;
    }

    public void setAutoConverge_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_AUTO_CONVERGE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_AUTO_CONVERGE);
        }
    }

    public boolean getAutoConverge_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_AUTO_CONVERGE);
    }

    public Cluster capSnapshotUniqueSize(Long capSnapshotUniqueSize) {

        this.capSnapshotUniqueSize = capSnapshotUniqueSize;
        return this;
    }

    /**
     * Get capSnapshotUniqueSize
     *
     * @return capSnapshotUniqueSize
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getCapSnapshotUniqueSize() {
        return capSnapshotUniqueSize;
    }

    public void setCapSnapshotUniqueSize(Long capSnapshotUniqueSize) {
        this.capSnapshotUniqueSize = capSnapshotUniqueSize;
    }

    public Cluster capSnapshotUniqueSize_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CAP_SNAPSHOT_UNIQUE_SIZE);
        return this;
    }

    public Cluster capSnapshotUniqueSize_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CAP_SNAPSHOT_UNIQUE_SIZE);
        return this;
    }

    public void setCapSnapshotUniqueSize_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CAP_SNAPSHOT_UNIQUE_SIZE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CAP_SNAPSHOT_UNIQUE_SIZE);
        }
    }

    public boolean getCapSnapshotUniqueSize_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CAP_SNAPSHOT_UNIQUE_SIZE);
    }

    public Cluster capVolumeUniqueSize(Long capVolumeUniqueSize) {

        this.capVolumeUniqueSize = capVolumeUniqueSize;
        return this;
    }

    /**
     * Get capVolumeUniqueSize
     *
     * @return capVolumeUniqueSize
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getCapVolumeUniqueSize() {
        return capVolumeUniqueSize;
    }

    public void setCapVolumeUniqueSize(Long capVolumeUniqueSize) {
        this.capVolumeUniqueSize = capVolumeUniqueSize;
    }

    public Cluster capVolumeUniqueSize_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CAP_VOLUME_UNIQUE_SIZE);
        return this;
    }

    public Cluster capVolumeUniqueSize_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CAP_VOLUME_UNIQUE_SIZE);
        return this;
    }

    public void setCapVolumeUniqueSize_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CAP_VOLUME_UNIQUE_SIZE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CAP_VOLUME_UNIQUE_SIZE);
        }
    }

    public boolean getCapVolumeUniqueSize_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CAP_VOLUME_UNIQUE_SIZE);
    }

    public Cluster commitedMemoryBytes(Long commitedMemoryBytes) {

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

    public Cluster commitedMemoryBytes_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_COMMITED_MEMORY_BYTES);
        return this;
    }

    public Cluster commitedMemoryBytes_ExplictlyNonNull() {
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

    public Cluster connectState(ConnectState connectState) {

        this.connectState = connectState;
        return this;
    }

    /**
     * Get connectState
     *
     * @return connectState
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public ConnectState getConnectState() {
        return connectState;
    }

    public void setConnectState(ConnectState connectState) {
        this.connectState = connectState;
    }

    public Cluster connectState_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CONNECT_STATE);
        return this;
    }

    public Cluster connectState_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CONNECT_STATE);
        return this;
    }

    public void setConnectState_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CONNECT_STATE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CONNECT_STATE);
        }
    }

    public boolean getConnectState_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CONNECT_STATE);
    }

    public Cluster currentCpuModel(String currentCpuModel) {

        this.currentCpuModel = currentCpuModel;
        return this;
    }

    /**
     * Get currentCpuModel
     *
     * @return currentCpuModel
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCurrentCpuModel() {
        return currentCpuModel;
    }

    public void setCurrentCpuModel(String currentCpuModel) {
        this.currentCpuModel = currentCpuModel;
    }

    public Cluster currentCpuModel_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CURRENT_CPU_MODEL);
        return this;
    }

    public Cluster currentCpuModel_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CURRENT_CPU_MODEL);
        return this;
    }

    public void setCurrentCpuModel_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CURRENT_CPU_MODEL);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CURRENT_CPU_MODEL);
        }
    }

    public boolean getCurrentCpuModel_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CURRENT_CPU_MODEL);
    }

    public Cluster dataReductionRatio(Double dataReductionRatio) {

        this.dataReductionRatio = dataReductionRatio;
        return this;
    }

    /**
     * Get dataReductionRatio
     *
     * @return dataReductionRatio
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getDataReductionRatio() {
        return dataReductionRatio;
    }

    public void setDataReductionRatio(Double dataReductionRatio) {
        this.dataReductionRatio = dataReductionRatio;
    }

    public Cluster dataReductionRatio_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATA_REDUCTION_RATIO);
        return this;
    }

    public Cluster dataReductionRatio_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATA_REDUCTION_RATIO);
        return this;
    }

    public void setDataReductionRatio_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATA_REDUCTION_RATIO);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATA_REDUCTION_RATIO);
        }
    }

    public boolean getDataReductionRatio_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATA_REDUCTION_RATIO);
    }

    public Cluster dataReductionSaving(Double dataReductionSaving) {

        this.dataReductionSaving = dataReductionSaving;
        return this;
    }

    /**
     * Get dataReductionSaving
     *
     * @return dataReductionSaving
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getDataReductionSaving() {
        return dataReductionSaving;
    }

    public void setDataReductionSaving(Double dataReductionSaving) {
        this.dataReductionSaving = dataReductionSaving;
    }

    public Cluster dataReductionSaving_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATA_REDUCTION_SAVING);
        return this;
    }

    public Cluster dataReductionSaving_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATA_REDUCTION_SAVING);
        return this;
    }

    public void setDataReductionSaving_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATA_REDUCTION_SAVING);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATA_REDUCTION_SAVING);
        }
    }

    public boolean getDataReductionSaving_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATA_REDUCTION_SAVING);
    }

    public Cluster datacenters(List<NestedDatacenter> datacenters) {

        this.datacenters = datacenters;
        return this;
    }

    public Cluster addDatacentersItem(NestedDatacenter datacentersItem) {
        if (this.datacenters == null) {
            this.datacenters = new ArrayList<NestedDatacenter>();
        }
        this.datacenters.add(datacentersItem);
        return this;
    }

    /**
     * Get datacenters
     *
     * @return datacenters
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedDatacenter> getDatacenters() {
        return datacenters;
    }

    public void setDatacenters(List<NestedDatacenter> datacenters) {
        this.datacenters = datacenters;
    }

    public Cluster datacenters_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATACENTERS);
        return this;
    }

    public Cluster datacenters_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATACENTERS);
        return this;
    }

    public void setDatacenters_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATACENTERS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATACENTERS);
        }
    }

    public boolean getDatacenters_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATACENTERS);
    }

    public Cluster dirtyCacheSpace(Long dirtyCacheSpace) {

        this.dirtyCacheSpace = dirtyCacheSpace;
        return this;
    }

    /**
     * Get dirtyCacheSpace
     *
     * @return dirtyCacheSpace
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getDirtyCacheSpace() {
        return dirtyCacheSpace;
    }

    public void setDirtyCacheSpace(Long dirtyCacheSpace) {
        this.dirtyCacheSpace = dirtyCacheSpace;
    }

    public Cluster dirtyCacheSpace_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DIRTY_CACHE_SPACE);
        return this;
    }

    public Cluster dirtyCacheSpace_ExplictlyNonNull() {
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

    public Cluster dirtyCacheUsage(Double dirtyCacheUsage) {

        this.dirtyCacheUsage = dirtyCacheUsage;
        return this;
    }

    /**
     * Get dirtyCacheUsage
     *
     * @return dirtyCacheUsage
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getDirtyCacheUsage() {
        return dirtyCacheUsage;
    }

    public void setDirtyCacheUsage(Double dirtyCacheUsage) {
        this.dirtyCacheUsage = dirtyCacheUsage;
    }

    public Cluster dirtyCacheUsage_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DIRTY_CACHE_USAGE);
        return this;
    }

    public Cluster dirtyCacheUsage_ExplictlyNonNull() {
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

    public Cluster disconnectedDate(String disconnectedDate) {

        this.disconnectedDate = disconnectedDate;
        return this;
    }

    /**
     * Get disconnectedDate
     *
     * @return disconnectedDate
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDisconnectedDate() {
        return disconnectedDate;
    }

    public void setDisconnectedDate(String disconnectedDate) {
        this.disconnectedDate = disconnectedDate;
    }

    public Cluster disconnectedDate_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISCONNECTED_DATE);
        return this;
    }

    public Cluster disconnectedDate_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DISCONNECTED_DATE);
        return this;
    }

    public void setDisconnectedDate_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DISCONNECTED_DATE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DISCONNECTED_DATE);
        }
    }

    public boolean getDisconnectedDate_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DISCONNECTED_DATE);
    }

    public Cluster disconnectedReason(ClusterConnectorErrorCode disconnectedReason) {

        this.disconnectedReason = disconnectedReason;
        return this;
    }

    /**
     * Get disconnectedReason
     *
     * @return disconnectedReason
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ClusterConnectorErrorCode getDisconnectedReason() {
        return disconnectedReason;
    }

    public void setDisconnectedReason(ClusterConnectorErrorCode disconnectedReason) {
        this.disconnectedReason = disconnectedReason;
    }

    public Cluster disconnectedReason_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISCONNECTED_REASON);
        return this;
    }

    public Cluster disconnectedReason_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DISCONNECTED_REASON);
        return this;
    }

    public void setDisconnectedReason_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DISCONNECTED_REASON);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DISCONNECTED_REASON);
        }
    }

    public boolean getDisconnectedReason_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DISCONNECTED_REASON);
    }

    public Cluster dns(List<String> dns) {

        this.dns = dns;
        return this;
    }

    public Cluster addDnsItem(String dnsItem) {
        this.dns.add(dnsItem);
        return this;
    }

    /**
     * Get dns
     *
     * @return dns
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public List<String> getDns() {
        return dns;
    }

    public void setDns(List<String> dns) {
        this.dns = dns;
    }

    public Cluster dns_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DNS);
        return this;
    }

    public Cluster dns_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DNS);
        return this;
    }

    public void setDns_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DNS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DNS);
        }
    }

    public boolean getDns_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DNS);
    }

    public Cluster downgradedPrioritizedSpace(Long downgradedPrioritizedSpace) {

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

    public Cluster downgradedPrioritizedSpace_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DOWNGRADED_PRIORITIZED_SPACE);
        return this;
    }

    public Cluster downgradedPrioritizedSpace_ExplictlyNonNull() {
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

    public Cluster enableTiering(Boolean enableTiering) {

        this.enableTiering = enableTiering;
        return this;
    }

    /**
     * Get enableTiering
     *
     * @return enableTiering
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getEnableTiering() {
        return enableTiering;
    }

    public void setEnableTiering(Boolean enableTiering) {
        this.enableTiering = enableTiering;
    }

    public Cluster enableTiering_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENABLE_TIERING);
        return this;
    }

    public Cluster enableTiering_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ENABLE_TIERING);
        return this;
    }

    public void setEnableTiering_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ENABLE_TIERING);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ENABLE_TIERING);
        }
    }

    public boolean getEnableTiering_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ENABLE_TIERING);
    }

    public Cluster entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {

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

    public Cluster entityAsyncStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        return this;
    }

    public Cluster entityAsyncStatus_ExplictlyNonNull() {
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

    public Cluster everouteCluster(NestedEverouteCluster everouteCluster) {

        this.everouteCluster = everouteCluster;
        return this;
    }

    /**
     * Get everouteCluster
     *
     * @return everouteCluster
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NestedEverouteCluster getEverouteCluster() {
        return everouteCluster;
    }

    public void setEverouteCluster(NestedEverouteCluster everouteCluster) {
        this.everouteCluster = everouteCluster;
    }

    public Cluster everouteCluster_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EVEROUTE_CLUSTER);
        return this;
    }

    public Cluster everouteCluster_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EVEROUTE_CLUSTER);
        return this;
    }

    public void setEverouteCluster_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EVEROUTE_CLUSTER);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EVEROUTE_CLUSTER);
        }
    }

    public boolean getEverouteCluster_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EVEROUTE_CLUSTER);
    }

    public Cluster failureCacheSpace(Long failureCacheSpace) {

        this.failureCacheSpace = failureCacheSpace;
        return this;
    }

    /**
     * Get failureCacheSpace
     *
     * @return failureCacheSpace
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getFailureCacheSpace() {
        return failureCacheSpace;
    }

    public void setFailureCacheSpace(Long failureCacheSpace) {
        this.failureCacheSpace = failureCacheSpace;
    }

    public Cluster failureCacheSpace_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FAILURE_CACHE_SPACE);
        return this;
    }

    public Cluster failureCacheSpace_ExplictlyNonNull() {
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

    public Cluster failureDataSpace(Long failureDataSpace) {

        this.failureDataSpace = failureDataSpace;
        return this;
    }

    /**
     * Get failureDataSpace
     *
     * @return failureDataSpace
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getFailureDataSpace() {
        return failureDataSpace;
    }

    public void setFailureDataSpace(Long failureDataSpace) {
        this.failureDataSpace = failureDataSpace;
    }

    public Cluster failureDataSpace_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FAILURE_DATA_SPACE);
        return this;
    }

    public Cluster failureDataSpace_ExplictlyNonNull() {
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

    public Cluster hasMetrox(Boolean hasMetrox) {

        this.hasMetrox = hasMetrox;
        return this;
    }

    /**
     * Get hasMetrox
     *
     * @return hasMetrox
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getHasMetrox() {
        return hasMetrox;
    }

    public void setHasMetrox(Boolean hasMetrox) {
        this.hasMetrox = hasMetrox;
    }

    public Cluster hasMetrox_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HAS_METROX);
        return this;
    }

    public Cluster hasMetrox_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HAS_METROX);
        return this;
    }

    public void setHasMetrox_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HAS_METROX);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HAS_METROX);
        }
    }

    public boolean getHasMetrox_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HAS_METROX);
    }

    public Cluster hostNum(Integer hostNum) {

        this.hostNum = hostNum;
        return this;
    }

    /**
     * Get hostNum
     *
     * @return hostNum
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getHostNum() {
        return hostNum;
    }

    public void setHostNum(Integer hostNum) {
        this.hostNum = hostNum;
    }

    public Cluster hostNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOST_NUM);
        return this;
    }

    public Cluster hostNum_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HOST_NUM);
        return this;
    }

    public void setHostNum_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HOST_NUM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HOST_NUM);
        }
    }

    public boolean getHostNum_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HOST_NUM);
    }

    public Cluster hosts(List<NestedHost> hosts) {

        this.hosts = hosts;
        return this;
    }

    public Cluster addHostsItem(NestedHost hostsItem) {
        if (this.hosts == null) {
            this.hosts = new ArrayList<NestedHost>();
        }
        this.hosts.add(hostsItem);
        return this;
    }

    /**
     * Get hosts
     *
     * @return hosts
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedHost> getHosts() {
        return hosts;
    }

    public void setHosts(List<NestedHost> hosts) {
        this.hosts = hosts;
    }

    public Cluster hosts_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOSTS);
        return this;
    }

    public Cluster hosts_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HOSTS);
        return this;
    }

    public void setHosts_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HOSTS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HOSTS);
        }
    }

    public boolean getHosts_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HOSTS);
    }

    public Cluster hypervisor(Hypervisor hypervisor) {

        this.hypervisor = hypervisor;
        return this;
    }

    /**
     * Get hypervisor
     *
     * @return hypervisor
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Hypervisor getHypervisor() {
        return hypervisor;
    }

    public void setHypervisor(Hypervisor hypervisor) {
        this.hypervisor = hypervisor;
    }

    public Cluster hypervisor_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HYPERVISOR);
        return this;
    }

    public Cluster hypervisor_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HYPERVISOR);
        return this;
    }

    public void setHypervisor_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HYPERVISOR);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HYPERVISOR);
        }
    }

    public boolean getHypervisor_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HYPERVISOR);
    }

    public Cluster id(String id) {

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

    public Cluster id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public Cluster id_ExplictlyNonNull() {
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

    public Cluster ip(String ip) {

        this.ip = ip;
        return this;
    }

    /**
     * Get ip
     *
     * @return ip
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Cluster ip_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP);
        return this;
    }

    public Cluster ip_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IP);
        return this;
    }

    public void setIp_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IP);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IP);
        }
    }

    public boolean getIp_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IP);
    }

    public Cluster isAllFlash(Boolean isAllFlash) {

        this.isAllFlash = isAllFlash;
        return this;
    }

    /**
     * Get isAllFlash
     *
     * @return isAllFlash
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getIsAllFlash() {
        return isAllFlash;
    }

    public void setIsAllFlash(Boolean isAllFlash) {
        this.isAllFlash = isAllFlash;
    }

    public Cluster isAllFlash_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IS_ALL_FLASH);
        return this;
    }

    public Cluster isAllFlash_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IS_ALL_FLASH);
        return this;
    }

    public void setIsAllFlash_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IS_ALL_FLASH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IS_ALL_FLASH);
        }
    }

    public boolean getIsAllFlash_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IS_ALL_FLASH);
    }

    public Cluster iscsiVip(String iscsiVip) {

        this.iscsiVip = iscsiVip;
        return this;
    }

    /**
     * Get iscsiVip
     *
     * @return iscsiVip
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIscsiVip() {
        return iscsiVip;
    }

    public void setIscsiVip(String iscsiVip) {
        this.iscsiVip = iscsiVip;
    }

    public Cluster iscsiVip_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_VIP);
        return this;
    }

    public Cluster iscsiVip_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_VIP);
        return this;
    }

    public void setIscsiVip_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_VIP);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_VIP);
        }
    }

    public boolean getIscsiVip_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_VIP);
    }

    public Cluster labels(List<NestedLabel> labels) {

        this.labels = labels;
        return this;
    }

    public Cluster addLabelsItem(NestedLabel labelsItem) {
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

    public Cluster labels_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LABELS);
        return this;
    }

    public Cluster labels_ExplictlyNonNull() {
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

    public Cluster licenseExpireDate(String licenseExpireDate) {

        this.licenseExpireDate = licenseExpireDate;
        return this;
    }

    /**
     * Get licenseExpireDate
     *
     * @return licenseExpireDate
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLicenseExpireDate() {
        return licenseExpireDate;
    }

    public void setLicenseExpireDate(String licenseExpireDate) {
        this.licenseExpireDate = licenseExpireDate;
    }

    public Cluster licenseExpireDate_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LICENSE_EXPIRE_DATE);
        return this;
    }

    public Cluster licenseExpireDate_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LICENSE_EXPIRE_DATE);
        return this;
    }

    public void setLicenseExpireDate_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LICENSE_EXPIRE_DATE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LICENSE_EXPIRE_DATE);
        }
    }

    public boolean getLicenseExpireDate_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LICENSE_EXPIRE_DATE);
    }

    public Cluster licenseSerial(String licenseSerial) {

        this.licenseSerial = licenseSerial;
        return this;
    }

    /**
     * Get licenseSerial
     *
     * @return licenseSerial
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLicenseSerial() {
        return licenseSerial;
    }

    public void setLicenseSerial(String licenseSerial) {
        this.licenseSerial = licenseSerial;
    }

    public Cluster licenseSerial_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LICENSE_SERIAL);
        return this;
    }

    public Cluster licenseSerial_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LICENSE_SERIAL);
        return this;
    }

    public void setLicenseSerial_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LICENSE_SERIAL);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LICENSE_SERIAL);
        }
    }

    public boolean getLicenseSerial_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LICENSE_SERIAL);
    }

    public Cluster licenseSignDate(String licenseSignDate) {

        this.licenseSignDate = licenseSignDate;
        return this;
    }

    /**
     * Get licenseSignDate
     *
     * @return licenseSignDate
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLicenseSignDate() {
        return licenseSignDate;
    }

    public void setLicenseSignDate(String licenseSignDate) {
        this.licenseSignDate = licenseSignDate;
    }

    public Cluster licenseSignDate_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LICENSE_SIGN_DATE);
        return this;
    }

    public Cluster licenseSignDate_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LICENSE_SIGN_DATE);
        return this;
    }

    public void setLicenseSignDate_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LICENSE_SIGN_DATE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LICENSE_SIGN_DATE);
        }
    }

    public boolean getLicenseSignDate_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LICENSE_SIGN_DATE);
    }

    public Cluster licenseType(LicenseType licenseType) {

        this.licenseType = licenseType;
        return this;
    }

    /**
     * Get licenseType
     *
     * @return licenseType
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public LicenseType getLicenseType() {
        return licenseType;
    }

    public void setLicenseType(LicenseType licenseType) {
        this.licenseType = licenseType;
    }

    public Cluster licenseType_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LICENSE_TYPE);
        return this;
    }

    public Cluster licenseType_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LICENSE_TYPE);
        return this;
    }

    public void setLicenseType_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LICENSE_TYPE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LICENSE_TYPE);
        }
    }

    public boolean getLicenseType_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LICENSE_TYPE);
    }

    public Cluster localId(String localId) {

        this.localId = localId;
        return this;
    }

    /**
     * Get localId
     *
     * @return localId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalId() {
        return localId;
    }

    public void setLocalId(String localId) {
        this.localId = localId;
    }

    public Cluster localId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID);
        return this;
    }

    public Cluster localId_ExplictlyNonNull() {
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

    public Cluster logicalUsedDataSpace(Long logicalUsedDataSpace) {

        this.logicalUsedDataSpace = logicalUsedDataSpace;
        return this;
    }

    /**
     * Get logicalUsedDataSpace
     *
     * @return logicalUsedDataSpace
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getLogicalUsedDataSpace() {
        return logicalUsedDataSpace;
    }

    public void setLogicalUsedDataSpace(Long logicalUsedDataSpace) {
        this.logicalUsedDataSpace = logicalUsedDataSpace;
    }

    public Cluster logicalUsedDataSpace_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOGICAL_USED_DATA_SPACE);
        return this;
    }

    public Cluster logicalUsedDataSpace_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOGICAL_USED_DATA_SPACE);
        return this;
    }

    public void setLogicalUsedDataSpace_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOGICAL_USED_DATA_SPACE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOGICAL_USED_DATA_SPACE);
        }
    }

    public boolean getLogicalUsedDataSpace_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOGICAL_USED_DATA_SPACE);
    }

    public Cluster maintenanceEndDate(String maintenanceEndDate) {

        this.maintenanceEndDate = maintenanceEndDate;
        return this;
    }

    /**
     * Get maintenanceEndDate
     *
     * @return maintenanceEndDate
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMaintenanceEndDate() {
        return maintenanceEndDate;
    }

    public void setMaintenanceEndDate(String maintenanceEndDate) {
        this.maintenanceEndDate = maintenanceEndDate;
    }

    public Cluster maintenanceEndDate_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAINTENANCE_END_DATE);
        return this;
    }

    public Cluster maintenanceEndDate_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAINTENANCE_END_DATE);
        return this;
    }

    public void setMaintenanceEndDate_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAINTENANCE_END_DATE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAINTENANCE_END_DATE);
        }
    }

    public boolean getMaintenanceEndDate_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAINTENANCE_END_DATE);
    }

    public Cluster maintenanceStartDate(String maintenanceStartDate) {

        this.maintenanceStartDate = maintenanceStartDate;
        return this;
    }

    /**
     * Get maintenanceStartDate
     *
     * @return maintenanceStartDate
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMaintenanceStartDate() {
        return maintenanceStartDate;
    }

    public void setMaintenanceStartDate(String maintenanceStartDate) {
        this.maintenanceStartDate = maintenanceStartDate;
    }

    public Cluster maintenanceStartDate_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAINTENANCE_START_DATE);
        return this;
    }

    public Cluster maintenanceStartDate_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAINTENANCE_START_DATE);
        return this;
    }

    public void setMaintenanceStartDate_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAINTENANCE_START_DATE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAINTENANCE_START_DATE);
        }
    }

    public boolean getMaintenanceStartDate_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAINTENANCE_START_DATE);
    }

    public Cluster managementVip(String managementVip) {

        this.managementVip = managementVip;
        return this;
    }

    /**
     * Get managementVip
     *
     * @return managementVip
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getManagementVip() {
        return managementVip;
    }

    public void setManagementVip(String managementVip) {
        this.managementVip = managementVip;
    }

    public Cluster managementVip_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_VIP);
        return this;
    }

    public Cluster managementVip_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_VIP);
        return this;
    }

    public void setManagementVip_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MANAGEMENT_VIP);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MANAGEMENT_VIP);
        }
    }

    public boolean getManagementVip_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MANAGEMENT_VIP);
    }

    public Cluster maxChunkNum(Integer maxChunkNum) {

        this.maxChunkNum = maxChunkNum;
        return this;
    }

    /**
     * Get maxChunkNum
     *
     * @return maxChunkNum
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMaxChunkNum() {
        return maxChunkNum;
    }

    public void setMaxChunkNum(Integer maxChunkNum) {
        this.maxChunkNum = maxChunkNum;
    }

    public Cluster maxChunkNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_CHUNK_NUM);
        return this;
    }

    public Cluster maxChunkNum_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_CHUNK_NUM);
        return this;
    }

    public void setMaxChunkNum_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_CHUNK_NUM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_CHUNK_NUM);
        }
    }

    public boolean getMaxChunkNum_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_CHUNK_NUM);
    }

    public Cluster maxPhysicalDataCapacity(Long maxPhysicalDataCapacity) {

        this.maxPhysicalDataCapacity = maxPhysicalDataCapacity;
        return this;
    }

    /**
     * Get maxPhysicalDataCapacity
     *
     * @return maxPhysicalDataCapacity
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getMaxPhysicalDataCapacity() {
        return maxPhysicalDataCapacity;
    }

    public void setMaxPhysicalDataCapacity(Long maxPhysicalDataCapacity) {
        this.maxPhysicalDataCapacity = maxPhysicalDataCapacity;
    }

    public Cluster maxPhysicalDataCapacity_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY);
        return this;
    }

    public Cluster maxPhysicalDataCapacity_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY);
        return this;
    }

    public void setMaxPhysicalDataCapacity_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY);
        }
    }

    public boolean getMaxPhysicalDataCapacity_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY);
    }

    public Cluster maxPhysicalDataCapacityPerNode(Long maxPhysicalDataCapacityPerNode) {

        this.maxPhysicalDataCapacityPerNode = maxPhysicalDataCapacityPerNode;
        return this;
    }

    /**
     * Get maxPhysicalDataCapacityPerNode
     *
     * @return maxPhysicalDataCapacityPerNode
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getMaxPhysicalDataCapacityPerNode() {
        return maxPhysicalDataCapacityPerNode;
    }

    public void setMaxPhysicalDataCapacityPerNode(Long maxPhysicalDataCapacityPerNode) {
        this.maxPhysicalDataCapacityPerNode = maxPhysicalDataCapacityPerNode;
    }

    public Cluster maxPhysicalDataCapacityPerNode_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_PER_NODE);
        return this;
    }

    public Cluster maxPhysicalDataCapacityPerNode_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_PER_NODE);
        return this;
    }

    public void setMaxPhysicalDataCapacityPerNode_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_PER_NODE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_PER_NODE);
        }
    }

    public boolean getMaxPhysicalDataCapacityPerNode_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_PHYSICAL_DATA_CAPACITY_PER_NODE);
    }

    public Cluster memoryAllocationRate(Double memoryAllocationRate) {

        this.memoryAllocationRate = memoryAllocationRate;
        return this;
    }

    /**
     * Get memoryAllocationRate
     *
     * @return memoryAllocationRate
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getMemoryAllocationRate() {
        return memoryAllocationRate;
    }

    public void setMemoryAllocationRate(Double memoryAllocationRate) {
        this.memoryAllocationRate = memoryAllocationRate;
    }

    public Cluster memoryAllocationRate_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MEMORY_ALLOCATION_RATE);
        return this;
    }

    public Cluster memoryAllocationRate_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MEMORY_ALLOCATION_RATE);
        return this;
    }

    public void setMemoryAllocationRate_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MEMORY_ALLOCATION_RATE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MEMORY_ALLOCATION_RATE);
        }
    }

    public boolean getMemoryAllocationRate_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MEMORY_ALLOCATION_RATE);
    }

    public Cluster metroAvailabilityChecklist(
            NestedMetroAvailabilityChecklist metroAvailabilityChecklist) {

        this.metroAvailabilityChecklist = metroAvailabilityChecklist;
        return this;
    }

    /**
     * Get metroAvailabilityChecklist
     *
     * @return metroAvailabilityChecklist
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NestedMetroAvailabilityChecklist getMetroAvailabilityChecklist() {
        return metroAvailabilityChecklist;
    }

    public void setMetroAvailabilityChecklist(
            NestedMetroAvailabilityChecklist metroAvailabilityChecklist) {
        this.metroAvailabilityChecklist = metroAvailabilityChecklist;
    }

    public Cluster metroAvailabilityChecklist_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_METRO_AVAILABILITY_CHECKLIST);
        return this;
    }

    public Cluster metroAvailabilityChecklist_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_METRO_AVAILABILITY_CHECKLIST);
        return this;
    }

    public void setMetroAvailabilityChecklist_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_METRO_AVAILABILITY_CHECKLIST);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_METRO_AVAILABILITY_CHECKLIST);
        }
    }

    public boolean getMetroAvailabilityChecklist_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_METRO_AVAILABILITY_CHECKLIST);
    }

    public Cluster mgtGateway(String mgtGateway) {

        this.mgtGateway = mgtGateway;
        return this;
    }

    /**
     * Get mgtGateway
     *
     * @return mgtGateway
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMgtGateway() {
        return mgtGateway;
    }

    public void setMgtGateway(String mgtGateway) {
        this.mgtGateway = mgtGateway;
    }

    public Cluster mgtGateway_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MGT_GATEWAY);
        return this;
    }

    public Cluster mgtGateway_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MGT_GATEWAY);
        return this;
    }

    public void setMgtGateway_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MGT_GATEWAY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MGT_GATEWAY);
        }
    }

    public boolean getMgtGateway_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MGT_GATEWAY);
    }

    public Cluster mgtNetmask(String mgtNetmask) {

        this.mgtNetmask = mgtNetmask;
        return this;
    }

    /**
     * Get mgtNetmask
     *
     * @return mgtNetmask
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMgtNetmask() {
        return mgtNetmask;
    }

    public void setMgtNetmask(String mgtNetmask) {
        this.mgtNetmask = mgtNetmask;
    }

    public Cluster mgtNetmask_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MGT_NETMASK);
        return this;
    }

    public Cluster mgtNetmask_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MGT_NETMASK);
        return this;
    }

    public void setMgtNetmask_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MGT_NETMASK);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MGT_NETMASK);
        }
    }

    public boolean getMgtNetmask_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MGT_NETMASK);
    }

    public Cluster migrationDataSize(Long migrationDataSize) {

        this.migrationDataSize = migrationDataSize;
        return this;
    }

    /**
     * Get migrationDataSize
     *
     * @return migrationDataSize
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getMigrationDataSize() {
        return migrationDataSize;
    }

    public void setMigrationDataSize(Long migrationDataSize) {
        this.migrationDataSize = migrationDataSize;
    }

    public Cluster migrationDataSize_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MIGRATION_DATA_SIZE);
        return this;
    }

    public Cluster migrationDataSize_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MIGRATION_DATA_SIZE);
        return this;
    }

    public void setMigrationDataSize_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MIGRATION_DATA_SIZE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MIGRATION_DATA_SIZE);
        }
    }

    public boolean getMigrationDataSize_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MIGRATION_DATA_SIZE);
    }

    public Cluster migrationSpeed(Long migrationSpeed) {

        this.migrationSpeed = migrationSpeed;
        return this;
    }

    /**
     * Get migrationSpeed
     *
     * @return migrationSpeed
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getMigrationSpeed() {
        return migrationSpeed;
    }

    public void setMigrationSpeed(Long migrationSpeed) {
        this.migrationSpeed = migrationSpeed;
    }

    public Cluster migrationSpeed_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MIGRATION_SPEED);
        return this;
    }

    public Cluster migrationSpeed_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MIGRATION_SPEED);
        return this;
    }

    public void setMigrationSpeed_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MIGRATION_SPEED);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MIGRATION_SPEED);
        }
    }

    public boolean getMigrationSpeed_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MIGRATION_SPEED);
    }

    public Cluster name(String name) {

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

    public Cluster name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public Cluster name_ExplictlyNonNull() {
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

    public Cluster noPerformanceLayer(Boolean noPerformanceLayer) {

        this.noPerformanceLayer = noPerformanceLayer;
        return this;
    }

    /**
     * Get noPerformanceLayer
     *
     * @return noPerformanceLayer
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getNoPerformanceLayer() {
        return noPerformanceLayer;
    }

    public void setNoPerformanceLayer(Boolean noPerformanceLayer) {
        this.noPerformanceLayer = noPerformanceLayer;
    }

    public Cluster noPerformanceLayer_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NO_PERFORMANCE_LAYER);
        return this;
    }

    public Cluster noPerformanceLayer_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NO_PERFORMANCE_LAYER);
        return this;
    }

    public void setNoPerformanceLayer_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NO_PERFORMANCE_LAYER);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NO_PERFORMANCE_LAYER);
        }
    }

    public boolean getNoPerformanceLayer_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NO_PERFORMANCE_LAYER);
    }

    public Cluster ntpMode(NtpMode ntpMode) {

        this.ntpMode = ntpMode;
        return this;
    }

    /**
     * Get ntpMode
     *
     * @return ntpMode
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NtpMode getNtpMode() {
        return ntpMode;
    }

    public void setNtpMode(NtpMode ntpMode) {
        this.ntpMode = ntpMode;
    }

    public Cluster ntpMode_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NTP_MODE);
        return this;
    }

    public Cluster ntpMode_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NTP_MODE);
        return this;
    }

    public void setNtpMode_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NTP_MODE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NTP_MODE);
        }
    }

    public boolean getNtpMode_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NTP_MODE);
    }

    public Cluster ntpServers(List<String> ntpServers) {

        this.ntpServers = ntpServers;
        return this;
    }

    public Cluster addNtpServersItem(String ntpServersItem) {
        this.ntpServers.add(ntpServersItem);
        return this;
    }

    /**
     * Get ntpServers
     *
     * @return ntpServers
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public List<String> getNtpServers() {
        return ntpServers;
    }

    public void setNtpServers(List<String> ntpServers) {
        this.ntpServers = ntpServers;
    }

    public Cluster ntpServers_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NTP_SERVERS);
        return this;
    }

    public Cluster ntpServers_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NTP_SERVERS);
        return this;
    }

    public void setNtpServers_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NTP_SERVERS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NTP_SERVERS);
        }
    }

    public boolean getNtpServers_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NTP_SERVERS);
    }

    public Cluster nvmeOverRdmaEnabled(Boolean nvmeOverRdmaEnabled) {

        this.nvmeOverRdmaEnabled = nvmeOverRdmaEnabled;
        return this;
    }

    /**
     * Get nvmeOverRdmaEnabled
     *
     * @return nvmeOverRdmaEnabled
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getNvmeOverRdmaEnabled() {
        return nvmeOverRdmaEnabled;
    }

    public void setNvmeOverRdmaEnabled(Boolean nvmeOverRdmaEnabled) {
        this.nvmeOverRdmaEnabled = nvmeOverRdmaEnabled;
    }

    public Cluster nvmeOverRdmaEnabled_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NVME_OVER_RDMA_ENABLED);
        return this;
    }

    public Cluster nvmeOverRdmaEnabled_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NVME_OVER_RDMA_ENABLED);
        return this;
    }

    public void setNvmeOverRdmaEnabled_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NVME_OVER_RDMA_ENABLED);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NVME_OVER_RDMA_ENABLED);
        }
    }

    public boolean getNvmeOverRdmaEnabled_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NVME_OVER_RDMA_ENABLED);
    }

    public Cluster nvmeOverTcpEnabled(Boolean nvmeOverTcpEnabled) {

        this.nvmeOverTcpEnabled = nvmeOverTcpEnabled;
        return this;
    }

    /**
     * Get nvmeOverTcpEnabled
     *
     * @return nvmeOverTcpEnabled
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getNvmeOverTcpEnabled() {
        return nvmeOverTcpEnabled;
    }

    public void setNvmeOverTcpEnabled(Boolean nvmeOverTcpEnabled) {
        this.nvmeOverTcpEnabled = nvmeOverTcpEnabled;
    }

    public Cluster nvmeOverTcpEnabled_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NVME_OVER_TCP_ENABLED);
        return this;
    }

    public Cluster nvmeOverTcpEnabled_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NVME_OVER_TCP_ENABLED);
        return this;
    }

    public void setNvmeOverTcpEnabled_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NVME_OVER_TCP_ENABLED);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NVME_OVER_TCP_ENABLED);
        }
    }

    public boolean getNvmeOverTcpEnabled_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NVME_OVER_TCP_ENABLED);
    }

    public Cluster nvmfEnabled(Boolean nvmfEnabled) {

        this.nvmfEnabled = nvmfEnabled;
        return this;
    }

    /**
     * Get nvmfEnabled
     *
     * @return nvmfEnabled
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getNvmfEnabled() {
        return nvmfEnabled;
    }

    public void setNvmfEnabled(Boolean nvmfEnabled) {
        this.nvmfEnabled = nvmfEnabled;
    }

    public Cluster nvmfEnabled_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NVMF_ENABLED);
        return this;
    }

    public Cluster nvmfEnabled_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NVMF_ENABLED);
        return this;
    }

    public void setNvmfEnabled_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NVMF_ENABLED);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NVMF_ENABLED);
        }
    }

    public boolean getNvmfEnabled_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NVMF_ENABLED);
    }

    public Cluster overallEfficiency(Double overallEfficiency) {

        this.overallEfficiency = overallEfficiency;
        return this;
    }

    /**
     * Get overallEfficiency
     *
     * @return overallEfficiency
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getOverallEfficiency() {
        return overallEfficiency;
    }

    public void setOverallEfficiency(Double overallEfficiency) {
        this.overallEfficiency = overallEfficiency;
    }

    public Cluster overallEfficiency_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_OVERALL_EFFICIENCY);
        return this;
    }

    public Cluster overallEfficiency_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_OVERALL_EFFICIENCY);
        return this;
    }

    public void setOverallEfficiency_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_OVERALL_EFFICIENCY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_OVERALL_EFFICIENCY);
        }
    }

    public boolean getOverallEfficiency_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_OVERALL_EFFICIENCY);
    }

    public Cluster overcommitMemoryRatio(Double overcommitMemoryRatio) {

        this.overcommitMemoryRatio = overcommitMemoryRatio;
        return this;
    }

    /**
     * Get overcommitMemoryRatio
     *
     * @return overcommitMemoryRatio
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getOvercommitMemoryRatio() {
        return overcommitMemoryRatio;
    }

    public void setOvercommitMemoryRatio(Double overcommitMemoryRatio) {
        this.overcommitMemoryRatio = overcommitMemoryRatio;
    }

    public Cluster overcommitMemoryRatio_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_OVERCOMMIT_MEMORY_RATIO);
        return this;
    }

    public Cluster overcommitMemoryRatio_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_OVERCOMMIT_MEMORY_RATIO);
        return this;
    }

    public void setOvercommitMemoryRatio_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_OVERCOMMIT_MEMORY_RATIO);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_OVERCOMMIT_MEMORY_RATIO);
        }
    }

    public boolean getOvercommitMemoryRatio_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_OVERCOMMIT_MEMORY_RATIO);
    }

    public Cluster overprovisionRatio(Double overprovisionRatio) {

        this.overprovisionRatio = overprovisionRatio;
        return this;
    }

    /**
     * Get overprovisionRatio
     *
     * @return overprovisionRatio
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getOverprovisionRatio() {
        return overprovisionRatio;
    }

    public void setOverprovisionRatio(Double overprovisionRatio) {
        this.overprovisionRatio = overprovisionRatio;
    }

    public Cluster overprovisionRatio_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_OVERPROVISION_RATIO);
        return this;
    }

    public Cluster overprovisionRatio_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_OVERPROVISION_RATIO);
        return this;
    }

    public void setOverprovisionRatio_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_OVERPROVISION_RATIO);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_OVERPROVISION_RATIO);
        }
    }

    public boolean getOverprovisionRatio_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_OVERPROVISION_RATIO);
    }

    public Cluster perfAllocatedDataSpace(Long perfAllocatedDataSpace) {

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

    public Cluster perfAllocatedDataSpace_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PERF_ALLOCATED_DATA_SPACE);
        return this;
    }

    public Cluster perfAllocatedDataSpace_ExplictlyNonNull() {
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

    public Cluster perfFailureDataSpace(Long perfFailureDataSpace) {

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

    public Cluster perfFailureDataSpace_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PERF_FAILURE_DATA_SPACE);
        return this;
    }

    public Cluster perfFailureDataSpace_ExplictlyNonNull() {
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

    public Cluster perfTotalDataCapacity(Long perfTotalDataCapacity) {

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

    public Cluster perfTotalDataCapacity_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PERF_TOTAL_DATA_CAPACITY);
        return this;
    }

    public Cluster perfTotalDataCapacity_ExplictlyNonNull() {
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

    public Cluster perfUsedDataSpace(Long perfUsedDataSpace) {

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

    public Cluster perfUsedDataSpace_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PERF_USED_DATA_SPACE);
        return this;
    }

    public Cluster perfUsedDataSpace_ExplictlyNonNull() {
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

    public Cluster perfValidDataSpace(Long perfValidDataSpace) {

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

    public Cluster perfValidDataSpace_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PERF_VALID_DATA_SPACE);
        return this;
    }

    public Cluster perfValidDataSpace_ExplictlyNonNull() {
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

    public Cluster plannedPrioritizedSpace(Long plannedPrioritizedSpace) {

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

    public Cluster plannedPrioritizedSpace_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PLANNED_PRIORITIZED_SPACE);
        return this;
    }

    public Cluster plannedPrioritizedSpace_ExplictlyNonNull() {
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

    public Cluster pmemEnabled(Boolean pmemEnabled) {

        this.pmemEnabled = pmemEnabled;
        return this;
    }

    /**
     * Get pmemEnabled
     *
     * @return pmemEnabled
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getPmemEnabled() {
        return pmemEnabled;
    }

    public void setPmemEnabled(Boolean pmemEnabled) {
        this.pmemEnabled = pmemEnabled;
    }

    public Cluster pmemEnabled_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PMEM_ENABLED);
        return this;
    }

    public Cluster pmemEnabled_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PMEM_ENABLED);
        return this;
    }

    public void setPmemEnabled_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PMEM_ENABLED);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PMEM_ENABLED);
        }
    }

    public boolean getPmemEnabled_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PMEM_ENABLED);
    }

    public Cluster prioSpacePercentage(Double prioSpacePercentage) {

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

    public Cluster prioSpacePercentage_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRIO_SPACE_PERCENTAGE);
        return this;
    }

    public Cluster prioSpacePercentage_ExplictlyNonNull() {
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

    public Cluster provisionedCpuCores(Integer provisionedCpuCores) {

        this.provisionedCpuCores = provisionedCpuCores;
        return this;
    }

    /**
     * Get provisionedCpuCores
     *
     * @return provisionedCpuCores
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getProvisionedCpuCores() {
        return provisionedCpuCores;
    }

    public void setProvisionedCpuCores(Integer provisionedCpuCores) {
        this.provisionedCpuCores = provisionedCpuCores;
    }

    public Cluster provisionedCpuCores_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_CPU_CORES);
        return this;
    }

    public Cluster provisionedCpuCores_ExplictlyNonNull() {
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

    public Cluster provisionedCpuCoresForActiveVm(Integer provisionedCpuCoresForActiveVm) {

        this.provisionedCpuCoresForActiveVm = provisionedCpuCoresForActiveVm;
        return this;
    }

    /**
     * Get provisionedCpuCoresForActiveVm
     *
     * @return provisionedCpuCoresForActiveVm
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getProvisionedCpuCoresForActiveVm() {
        return provisionedCpuCoresForActiveVm;
    }

    public void setProvisionedCpuCoresForActiveVm(Integer provisionedCpuCoresForActiveVm) {
        this.provisionedCpuCoresForActiveVm = provisionedCpuCoresForActiveVm;
    }

    public Cluster provisionedCpuCoresForActiveVm_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_CPU_CORES_FOR_ACTIVE_VM);
        return this;
    }

    public Cluster provisionedCpuCoresForActiveVm_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_CPU_CORES_FOR_ACTIVE_VM);
        return this;
    }

    public void setProvisionedCpuCoresForActiveVm_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_CPU_CORES_FOR_ACTIVE_VM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_CPU_CORES_FOR_ACTIVE_VM);
        }
    }

    public boolean getProvisionedCpuCoresForActiveVm_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PROVISIONED_CPU_CORES_FOR_ACTIVE_VM);
    }

    public Cluster provisionedForActiveVmRatio(Double provisionedForActiveVmRatio) {

        this.provisionedForActiveVmRatio = provisionedForActiveVmRatio;
        return this;
    }

    /**
     * Get provisionedForActiveVmRatio
     *
     * @return provisionedForActiveVmRatio
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getProvisionedForActiveVmRatio() {
        return provisionedForActiveVmRatio;
    }

    public void setProvisionedForActiveVmRatio(Double provisionedForActiveVmRatio) {
        this.provisionedForActiveVmRatio = provisionedForActiveVmRatio;
    }

    public Cluster provisionedForActiveVmRatio_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_FOR_ACTIVE_VM_RATIO);
        return this;
    }

    public Cluster provisionedForActiveVmRatio_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_FOR_ACTIVE_VM_RATIO);
        return this;
    }

    public void setProvisionedForActiveVmRatio_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_FOR_ACTIVE_VM_RATIO);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_FOR_ACTIVE_VM_RATIO);
        }
    }

    public boolean getProvisionedForActiveVmRatio_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PROVISIONED_FOR_ACTIVE_VM_RATIO);
    }

    public Cluster provisionedMemoryBytes(Long provisionedMemoryBytes) {

        this.provisionedMemoryBytes = provisionedMemoryBytes;
        return this;
    }

    /**
     * Get provisionedMemoryBytes
     *
     * @return provisionedMemoryBytes
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getProvisionedMemoryBytes() {
        return provisionedMemoryBytes;
    }

    public void setProvisionedMemoryBytes(Long provisionedMemoryBytes) {
        this.provisionedMemoryBytes = provisionedMemoryBytes;
    }

    public Cluster provisionedMemoryBytes_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_MEMORY_BYTES);
        return this;
    }

    public Cluster provisionedMemoryBytes_ExplictlyNonNull() {
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

    public Cluster provisionedRatio(Double provisionedRatio) {

        this.provisionedRatio = provisionedRatio;
        return this;
    }

    /**
     * Get provisionedRatio
     *
     * @return provisionedRatio
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getProvisionedRatio() {
        return provisionedRatio;
    }

    public void setProvisionedRatio(Double provisionedRatio) {
        this.provisionedRatio = provisionedRatio;
    }

    public Cluster provisionedRatio_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_RATIO);
        return this;
    }

    public Cluster provisionedRatio_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_RATIO);
        return this;
    }

    public void setProvisionedRatio_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_RATIO);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_RATIO);
        }
    }

    public boolean getProvisionedRatio_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PROVISIONED_RATIO);
    }

    public Cluster rdmaEnabled(Boolean rdmaEnabled) {

        this.rdmaEnabled = rdmaEnabled;
        return this;
    }

    /**
     * Get rdmaEnabled
     *
     * @return rdmaEnabled
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getRdmaEnabled() {
        return rdmaEnabled;
    }

    public void setRdmaEnabled(Boolean rdmaEnabled) {
        this.rdmaEnabled = rdmaEnabled;
    }

    public Cluster rdmaEnabled_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RDMA_ENABLED);
        return this;
    }

    public Cluster rdmaEnabled_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RDMA_ENABLED);
        return this;
    }

    public void setRdmaEnabled_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RDMA_ENABLED);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RDMA_ENABLED);
        }
    }

    public boolean getRdmaEnabled_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RDMA_ENABLED);
    }

    public Cluster recommendedCpuModels(List<String> recommendedCpuModels) {

        this.recommendedCpuModels = recommendedCpuModels;
        return this;
    }

    public Cluster addRecommendedCpuModelsItem(String recommendedCpuModelsItem) {
        this.recommendedCpuModels.add(recommendedCpuModelsItem);
        return this;
    }

    /**
     * Get recommendedCpuModels
     *
     * @return recommendedCpuModels
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public List<String> getRecommendedCpuModels() {
        return recommendedCpuModels;
    }

    public void setRecommendedCpuModels(List<String> recommendedCpuModels) {
        this.recommendedCpuModels = recommendedCpuModels;
    }

    public Cluster recommendedCpuModels_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RECOMMENDED_CPU_MODELS);
        return this;
    }

    public Cluster recommendedCpuModels_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RECOMMENDED_CPU_MODELS);
        return this;
    }

    public void setRecommendedCpuModels_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RECOMMENDED_CPU_MODELS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RECOMMENDED_CPU_MODELS);
        }
    }

    public boolean getRecommendedCpuModels_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RECOMMENDED_CPU_MODELS);
    }

    public Cluster recoverDataSize(Long recoverDataSize) {

        this.recoverDataSize = recoverDataSize;
        return this;
    }

    /**
     * Get recoverDataSize
     *
     * @return recoverDataSize
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getRecoverDataSize() {
        return recoverDataSize;
    }

    public void setRecoverDataSize(Long recoverDataSize) {
        this.recoverDataSize = recoverDataSize;
    }

    public Cluster recoverDataSize_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RECOVER_DATA_SIZE);
        return this;
    }

    public Cluster recoverDataSize_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RECOVER_DATA_SIZE);
        return this;
    }

    public void setRecoverDataSize_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RECOVER_DATA_SIZE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RECOVER_DATA_SIZE);
        }
    }

    public boolean getRecoverDataSize_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RECOVER_DATA_SIZE);
    }

    public Cluster recoverSpeed(Long recoverSpeed) {

        this.recoverSpeed = recoverSpeed;
        return this;
    }

    /**
     * Get recoverSpeed
     *
     * @return recoverSpeed
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getRecoverSpeed() {
        return recoverSpeed;
    }

    public void setRecoverSpeed(Long recoverSpeed) {
        this.recoverSpeed = recoverSpeed;
    }

    public Cluster recoverSpeed_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RECOVER_SPEED);
        return this;
    }

    public Cluster recoverSpeed_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RECOVER_SPEED);
        return this;
    }

    public void setRecoverSpeed_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RECOVER_SPEED);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RECOVER_SPEED);
        }
    }

    public boolean getRecoverSpeed_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RECOVER_SPEED);
    }

    public Cluster replicaCapacityOnly(Boolean replicaCapacityOnly) {

        this.replicaCapacityOnly = replicaCapacityOnly;
        return this;
    }

    /**
     * Get replicaCapacityOnly
     *
     * @return replicaCapacityOnly
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getReplicaCapacityOnly() {
        return replicaCapacityOnly;
    }

    public void setReplicaCapacityOnly(Boolean replicaCapacityOnly) {
        this.replicaCapacityOnly = replicaCapacityOnly;
    }

    public Cluster replicaCapacityOnly_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICA_CAPACITY_ONLY);
        return this;
    }

    public Cluster replicaCapacityOnly_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REPLICA_CAPACITY_ONLY);
        return this;
    }

    public void setReplicaCapacityOnly_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REPLICA_CAPACITY_ONLY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REPLICA_CAPACITY_ONLY);
        }
    }

    public boolean getReplicaCapacityOnly_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REPLICA_CAPACITY_ONLY);
    }

    public Cluster reservedCpuCoresForSystemService(Integer reservedCpuCoresForSystemService) {

        this.reservedCpuCoresForSystemService = reservedCpuCoresForSystemService;
        return this;
    }

    /**
     * Get reservedCpuCoresForSystemService
     *
     * @return reservedCpuCoresForSystemService
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getReservedCpuCoresForSystemService() {
        return reservedCpuCoresForSystemService;
    }

    public void setReservedCpuCoresForSystemService(Integer reservedCpuCoresForSystemService) {
        this.reservedCpuCoresForSystemService = reservedCpuCoresForSystemService;
    }

    public Cluster reservedCpuCoresForSystemService_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESERVED_CPU_CORES_FOR_SYSTEM_SERVICE);
        return this;
    }

    public Cluster reservedCpuCoresForSystemService_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESERVED_CPU_CORES_FOR_SYSTEM_SERVICE);
        return this;
    }

    public void setReservedCpuCoresForSystemService_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESERVED_CPU_CORES_FOR_SYSTEM_SERVICE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESERVED_CPU_CORES_FOR_SYSTEM_SERVICE);
        }
    }

    public boolean getReservedCpuCoresForSystemService_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESERVED_CPU_CORES_FOR_SYSTEM_SERVICE);
    }

    public Cluster runningVmNum(Integer runningVmNum) {

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

    public Cluster runningVmNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RUNNING_VM_NUM);
        return this;
    }

    public Cluster runningVmNum_ExplictlyNonNull() {
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

    public Cluster softwareEdition(SoftwareEdition softwareEdition) {

        this.softwareEdition = softwareEdition;
        return this;
    }

    /**
     * Get softwareEdition
     *
     * @return softwareEdition
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public SoftwareEdition getSoftwareEdition() {
        return softwareEdition;
    }

    public void setSoftwareEdition(SoftwareEdition softwareEdition) {
        this.softwareEdition = softwareEdition;
    }

    public Cluster softwareEdition_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SOFTWARE_EDITION);
        return this;
    }

    public Cluster softwareEdition_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SOFTWARE_EDITION);
        return this;
    }

    public void setSoftwareEdition_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SOFTWARE_EDITION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SOFTWARE_EDITION);
        }
    }

    public boolean getSoftwareEdition_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SOFTWARE_EDITION);
    }

    public Cluster stoppedVmNum(Integer stoppedVmNum) {

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

    public Cluster stoppedVmNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STOPPED_VM_NUM);
        return this;
    }

    public Cluster stoppedVmNum_ExplictlyNonNull() {
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

    public Cluster stretch(Boolean stretch) {

        this.stretch = stretch;
        return this;
    }

    /**
     * Get stretch
     *
     * @return stretch
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getStretch() {
        return stretch;
    }

    public void setStretch(Boolean stretch) {
        this.stretch = stretch;
    }

    public Cluster stretch_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STRETCH);
        return this;
    }

    public Cluster stretch_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STRETCH);
        return this;
    }

    public void setStretch_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STRETCH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STRETCH);
        }
    }

    public boolean getStretch_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STRETCH);
    }

    public Cluster suspendedVmNum(Integer suspendedVmNum) {

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

    public Cluster suspendedVmNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUSPENDED_VM_NUM);
        return this;
    }

    public Cluster suspendedVmNum_ExplictlyNonNull() {
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

    public Cluster totalCacheCapacity(Long totalCacheCapacity) {

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

    public Cluster totalCacheCapacity_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_CACHE_CAPACITY);
        return this;
    }

    public Cluster totalCacheCapacity_ExplictlyNonNull() {
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

    public Cluster totalCpuCores(Integer totalCpuCores) {

        this.totalCpuCores = totalCpuCores;
        return this;
    }

    /**
     * Get totalCpuCores
     *
     * @return totalCpuCores
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getTotalCpuCores() {
        return totalCpuCores;
    }

    public void setTotalCpuCores(Integer totalCpuCores) {
        this.totalCpuCores = totalCpuCores;
    }

    public Cluster totalCpuCores_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_CPU_CORES);
        return this;
    }

    public Cluster totalCpuCores_ExplictlyNonNull() {
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

    public Cluster totalCpuHz(Long totalCpuHz) {

        this.totalCpuHz = totalCpuHz;
        return this;
    }

    /**
     * Get totalCpuHz
     *
     * @return totalCpuHz
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getTotalCpuHz() {
        return totalCpuHz;
    }

    public void setTotalCpuHz(Long totalCpuHz) {
        this.totalCpuHz = totalCpuHz;
    }

    public Cluster totalCpuHz_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_CPU_HZ);
        return this;
    }

    public Cluster totalCpuHz_ExplictlyNonNull() {
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

    public Cluster totalCpuModels(List<String> totalCpuModels) {

        this.totalCpuModels = totalCpuModels;
        return this;
    }

    public Cluster addTotalCpuModelsItem(String totalCpuModelsItem) {
        this.totalCpuModels.add(totalCpuModelsItem);
        return this;
    }

    /**
     * Get totalCpuModels
     *
     * @return totalCpuModels
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public List<String> getTotalCpuModels() {
        return totalCpuModels;
    }

    public void setTotalCpuModels(List<String> totalCpuModels) {
        this.totalCpuModels = totalCpuModels;
    }

    public Cluster totalCpuModels_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_CPU_MODELS);
        return this;
    }

    public Cluster totalCpuModels_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CPU_MODELS);
        return this;
    }

    public void setTotalCpuModels_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_CPU_MODELS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_CPU_MODELS);
        }
    }

    public boolean getTotalCpuModels_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_CPU_MODELS);
    }

    public Cluster totalCpuSockets(Integer totalCpuSockets) {

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

    public Cluster totalCpuSockets_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_CPU_SOCKETS);
        return this;
    }

    public Cluster totalCpuSockets_ExplictlyNonNull() {
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

    public Cluster totalDataCapacity(Long totalDataCapacity) {

        this.totalDataCapacity = totalDataCapacity;
        return this;
    }

    /**
     * Get totalDataCapacity
     *
     * @return totalDataCapacity
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getTotalDataCapacity() {
        return totalDataCapacity;
    }

    public void setTotalDataCapacity(Long totalDataCapacity) {
        this.totalDataCapacity = totalDataCapacity;
    }

    public Cluster totalDataCapacity_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_DATA_CAPACITY);
        return this;
    }

    public Cluster totalDataCapacity_ExplictlyNonNull() {
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

    public Cluster totalMemoryBytes(Long totalMemoryBytes) {

        this.totalMemoryBytes = totalMemoryBytes;
        return this;
    }

    /**
     * Get totalMemoryBytes
     *
     * @return totalMemoryBytes
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getTotalMemoryBytes() {
        return totalMemoryBytes;
    }

    public void setTotalMemoryBytes(Long totalMemoryBytes) {
        this.totalMemoryBytes = totalMemoryBytes;
    }

    public Cluster totalMemoryBytes_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_MEMORY_BYTES);
        return this;
    }

    public Cluster totalMemoryBytes_ExplictlyNonNull() {
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

    public Cluster totalPrioVolumeSize(Long totalPrioVolumeSize) {

        this.totalPrioVolumeSize = totalPrioVolumeSize;
        return this;
    }

    /**
     * Get totalPrioVolumeSize
     *
     * @return totalPrioVolumeSize
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getTotalPrioVolumeSize() {
        return totalPrioVolumeSize;
    }

    public void setTotalPrioVolumeSize(Long totalPrioVolumeSize) {
        this.totalPrioVolumeSize = totalPrioVolumeSize;
    }

    public Cluster totalPrioVolumeSize_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_PRIO_VOLUME_SIZE);
        return this;
    }

    public Cluster totalPrioVolumeSize_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_PRIO_VOLUME_SIZE);
        return this;
    }

    public void setTotalPrioVolumeSize_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_PRIO_VOLUME_SIZE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_PRIO_VOLUME_SIZE);
        }
    }

    public boolean getTotalPrioVolumeSize_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_PRIO_VOLUME_SIZE);
    }

    public Cluster totalPrioVolumeSizeUsage(Double totalPrioVolumeSizeUsage) {

        this.totalPrioVolumeSizeUsage = totalPrioVolumeSizeUsage;
        return this;
    }

    /**
     * Get totalPrioVolumeSizeUsage
     *
     * @return totalPrioVolumeSizeUsage
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getTotalPrioVolumeSizeUsage() {
        return totalPrioVolumeSizeUsage;
    }

    public void setTotalPrioVolumeSizeUsage(Double totalPrioVolumeSizeUsage) {
        this.totalPrioVolumeSizeUsage = totalPrioVolumeSizeUsage;
    }

    public Cluster totalPrioVolumeSizeUsage_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_PRIO_VOLUME_SIZE_USAGE);
        return this;
    }

    public Cluster totalPrioVolumeSizeUsage_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_PRIO_VOLUME_SIZE_USAGE);
        return this;
    }

    public void setTotalPrioVolumeSizeUsage_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_PRIO_VOLUME_SIZE_USAGE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_PRIO_VOLUME_SIZE_USAGE);
        }
    }

    public boolean getTotalPrioVolumeSizeUsage_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_PRIO_VOLUME_SIZE_USAGE);
    }

    public Cluster type(ClusterType type) {

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
    public ClusterType getType() {
        return type;
    }

    public void setType(ClusterType type) {
        this.type = type;
    }

    public Cluster type_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE);
        return this;
    }

    public Cluster type_ExplictlyNonNull() {
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

    public Cluster upgradeForTiering(Boolean upgradeForTiering) {

        this.upgradeForTiering = upgradeForTiering;
        return this;
    }

    /**
     * Get upgradeForTiering
     *
     * @return upgradeForTiering
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getUpgradeForTiering() {
        return upgradeForTiering;
    }

    public void setUpgradeForTiering(Boolean upgradeForTiering) {
        this.upgradeForTiering = upgradeForTiering;
    }

    public Cluster upgradeForTiering_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPGRADE_FOR_TIERING);
        return this;
    }

    public Cluster upgradeForTiering_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UPGRADE_FOR_TIERING);
        return this;
    }

    public void setUpgradeForTiering_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UPGRADE_FOR_TIERING);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UPGRADE_FOR_TIERING);
        }
    }

    public boolean getUpgradeForTiering_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UPGRADE_FOR_TIERING);
    }

    public Cluster upgradeToolVersion(String upgradeToolVersion) {

        this.upgradeToolVersion = upgradeToolVersion;
        return this;
    }

    /**
     * Get upgradeToolVersion
     *
     * @return upgradeToolVersion
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUpgradeToolVersion() {
        return upgradeToolVersion;
    }

    public void setUpgradeToolVersion(String upgradeToolVersion) {
        this.upgradeToolVersion = upgradeToolVersion;
    }

    public Cluster upgradeToolVersion_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPGRADE_TOOL_VERSION);
        return this;
    }

    public Cluster upgradeToolVersion_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UPGRADE_TOOL_VERSION);
        return this;
    }

    public void setUpgradeToolVersion_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UPGRADE_TOOL_VERSION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UPGRADE_TOOL_VERSION);
        }
    }

    public boolean getUpgradeToolVersion_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UPGRADE_TOOL_VERSION);
    }

    public Cluster usedCacheSpace(Long usedCacheSpace) {

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

    public Cluster usedCacheSpace_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USED_CACHE_SPACE);
        return this;
    }

    public Cluster usedCacheSpace_ExplictlyNonNull() {
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

    public Cluster usedCpuHz(Double usedCpuHz) {

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

    public Cluster usedCpuHz_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USED_CPU_HZ);
        return this;
    }

    public Cluster usedCpuHz_ExplictlyNonNull() {
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

    public Cluster usedDataSpace(Long usedDataSpace) {

        this.usedDataSpace = usedDataSpace;
        return this;
    }

    /**
     * Get usedDataSpace
     *
     * @return usedDataSpace
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getUsedDataSpace() {
        return usedDataSpace;
    }

    public void setUsedDataSpace(Long usedDataSpace) {
        this.usedDataSpace = usedDataSpace;
    }

    public Cluster usedDataSpace_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USED_DATA_SPACE);
        return this;
    }

    public Cluster usedDataSpace_ExplictlyNonNull() {
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

    public Cluster usedMemoryBytes(Double usedMemoryBytes) {

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

    public Cluster usedMemoryBytes_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USED_MEMORY_BYTES);
        return this;
    }

    public Cluster usedMemoryBytes_ExplictlyNonNull() {
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

    public Cluster validCacheSpace(Long validCacheSpace) {

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

    public Cluster validCacheSpace_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VALID_CACHE_SPACE);
        return this;
    }

    public Cluster validCacheSpace_ExplictlyNonNull() {
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

    public Cluster validDataSpace(Long validDataSpace) {

        this.validDataSpace = validDataSpace;
        return this;
    }

    /**
     * Get validDataSpace
     *
     * @return validDataSpace
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getValidDataSpace() {
        return validDataSpace;
    }

    public void setValidDataSpace(Long validDataSpace) {
        this.validDataSpace = validDataSpace;
    }

    public Cluster validDataSpace_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VALID_DATA_SPACE);
        return this;
    }

    public Cluster validDataSpace_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VALID_DATA_SPACE);
        return this;
    }

    public void setValidDataSpace_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VALID_DATA_SPACE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VALID_DATA_SPACE);
        }
    }

    public boolean getValidDataSpace_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VALID_DATA_SPACE);
    }

    public Cluster vdses(List<NestedVds> vdses) {

        this.vdses = vdses;
        return this;
    }

    public Cluster addVdsesItem(NestedVds vdsesItem) {
        if (this.vdses == null) {
            this.vdses = new ArrayList<NestedVds>();
        }
        this.vdses.add(vdsesItem);
        return this;
    }

    /**
     * Get vdses
     *
     * @return vdses
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedVds> getVdses() {
        return vdses;
    }

    public void setVdses(List<NestedVds> vdses) {
        this.vdses = vdses;
    }

    public Cluster vdses_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VDSES);
        return this;
    }

    public Cluster vdses_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VDSES);
        return this;
    }

    public void setVdses_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VDSES);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VDSES);
        }
    }

    public boolean getVdses_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VDSES);
    }

    public Cluster version(String version) {

        this.version = version;
        return this;
    }

    /**
     * Get version
     *
     * @return version
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Cluster version_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VERSION);
        return this;
    }

    public Cluster version_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VERSION);
        return this;
    }

    public void setVersion_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VERSION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VERSION);
        }
    }

    public boolean getVersion_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VERSION);
    }

    public Cluster vhostEnabled(Boolean vhostEnabled) {

        this.vhostEnabled = vhostEnabled;
        return this;
    }

    /**
     * Get vhostEnabled
     *
     * @return vhostEnabled
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getVhostEnabled() {
        return vhostEnabled;
    }

    public void setVhostEnabled(Boolean vhostEnabled) {
        this.vhostEnabled = vhostEnabled;
    }

    public Cluster vhostEnabled_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VHOST_ENABLED);
        return this;
    }

    public Cluster vhostEnabled_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VHOST_ENABLED);
        return this;
    }

    public void setVhostEnabled_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VHOST_ENABLED);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VHOST_ENABLED);
        }
    }

    public boolean getVhostEnabled_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VHOST_ENABLED);
    }

    public Cluster vmFolders(List<NestedVmFolder> vmFolders) {

        this.vmFolders = vmFolders;
        return this;
    }

    public Cluster addVmFoldersItem(NestedVmFolder vmFoldersItem) {
        if (this.vmFolders == null) {
            this.vmFolders = new ArrayList<NestedVmFolder>();
        }
        this.vmFolders.add(vmFoldersItem);
        return this;
    }

    /**
     * Get vmFolders
     *
     * @return vmFolders
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedVmFolder> getVmFolders() {
        return vmFolders;
    }

    public void setVmFolders(List<NestedVmFolder> vmFolders) {
        this.vmFolders = vmFolders;
    }

    public Cluster vmFolders_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_FOLDERS);
        return this;
    }

    public Cluster vmFolders_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_FOLDERS);
        return this;
    }

    public void setVmFolders_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_FOLDERS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_FOLDERS);
        }
    }

    public boolean getVmFolders_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_FOLDERS);
    }

    public Cluster vmNum(Integer vmNum) {

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

    public Cluster vmNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_NUM);
        return this;
    }

    public Cluster vmNum_ExplictlyNonNull() {
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

    public Cluster vmTemplates(List<NestedVmTemplate> vmTemplates) {

        this.vmTemplates = vmTemplates;
        return this;
    }

    public Cluster addVmTemplatesItem(NestedVmTemplate vmTemplatesItem) {
        if (this.vmTemplates == null) {
            this.vmTemplates = new ArrayList<NestedVmTemplate>();
        }
        this.vmTemplates.add(vmTemplatesItem);
        return this;
    }

    /**
     * Get vmTemplates
     *
     * @return vmTemplates
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedVmTemplate> getVmTemplates() {
        return vmTemplates;
    }

    public void setVmTemplates(List<NestedVmTemplate> vmTemplates) {
        this.vmTemplates = vmTemplates;
    }

    public Cluster vmTemplates_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_TEMPLATES);
        return this;
    }

    public Cluster vmTemplates_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_TEMPLATES);
        return this;
    }

    public void setVmTemplates_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_TEMPLATES);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_TEMPLATES);
        }
    }

    public boolean getVmTemplates_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_TEMPLATES);
    }

    public Cluster vms(List<NestedVm> vms) {

        this.vms = vms;
        return this;
    }

    public Cluster addVmsItem(NestedVm vmsItem) {
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

    public Cluster vms_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VMS);
        return this;
    }

    public Cluster vms_ExplictlyNonNull() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Cluster cluster = (Cluster) o;
        return Objects.equals(this.accessWriteCompressEnabled, cluster.accessWriteCompressEnabled)
                && Objects.equals(this.allocatedMemoryBytes, cluster.allocatedMemoryBytes)
                && Objects.equals(this.allocatedPrioritizedSpace, cluster.allocatedPrioritizedSpace)
                && Objects.equals(
                        this.allocatedPrioritizedSpaceUsage, cluster.allocatedPrioritizedSpaceUsage)
                && Objects.equals(this.applicationHighestVersion, cluster.applicationHighestVersion)
                && Objects.equals(this.architecture, cluster.architecture)
                && Objects.equals(this.autoConverge, cluster.autoConverge)
                && Objects.equals(this.capSnapshotUniqueSize, cluster.capSnapshotUniqueSize)
                && Objects.equals(this.capVolumeUniqueSize, cluster.capVolumeUniqueSize)
                && Objects.equals(this.commitedMemoryBytes, cluster.commitedMemoryBytes)
                && Objects.equals(this.connectState, cluster.connectState)
                && Objects.equals(this.currentCpuModel, cluster.currentCpuModel)
                && Objects.equals(this.dataReductionRatio, cluster.dataReductionRatio)
                && Objects.equals(this.dataReductionSaving, cluster.dataReductionSaving)
                && Objects.equals(this.datacenters, cluster.datacenters)
                && Objects.equals(this.dirtyCacheSpace, cluster.dirtyCacheSpace)
                && Objects.equals(this.dirtyCacheUsage, cluster.dirtyCacheUsage)
                && Objects.equals(this.disconnectedDate, cluster.disconnectedDate)
                && Objects.equals(this.disconnectedReason, cluster.disconnectedReason)
                && Objects.equals(this.dns, cluster.dns)
                && Objects.equals(
                        this.downgradedPrioritizedSpace, cluster.downgradedPrioritizedSpace)
                && Objects.equals(this.enableTiering, cluster.enableTiering)
                && Objects.equals(this.entityAsyncStatus, cluster.entityAsyncStatus)
                && Objects.equals(this.everouteCluster, cluster.everouteCluster)
                && Objects.equals(this.failureCacheSpace, cluster.failureCacheSpace)
                && Objects.equals(this.failureDataSpace, cluster.failureDataSpace)
                && Objects.equals(this.hasMetrox, cluster.hasMetrox)
                && Objects.equals(this.hostNum, cluster.hostNum)
                && Objects.equals(this.hosts, cluster.hosts)
                && Objects.equals(this.hypervisor, cluster.hypervisor)
                && Objects.equals(this.id, cluster.id)
                && Objects.equals(this.ip, cluster.ip)
                && Objects.equals(this.isAllFlash, cluster.isAllFlash)
                && Objects.equals(this.iscsiVip, cluster.iscsiVip)
                && Objects.equals(this.labels, cluster.labels)
                && Objects.equals(this.licenseExpireDate, cluster.licenseExpireDate)
                && Objects.equals(this.licenseSerial, cluster.licenseSerial)
                && Objects.equals(this.licenseSignDate, cluster.licenseSignDate)
                && Objects.equals(this.licenseType, cluster.licenseType)
                && Objects.equals(this.localId, cluster.localId)
                && Objects.equals(this.logicalUsedDataSpace, cluster.logicalUsedDataSpace)
                && Objects.equals(this.maintenanceEndDate, cluster.maintenanceEndDate)
                && Objects.equals(this.maintenanceStartDate, cluster.maintenanceStartDate)
                && Objects.equals(this.managementVip, cluster.managementVip)
                && Objects.equals(this.maxChunkNum, cluster.maxChunkNum)
                && Objects.equals(this.maxPhysicalDataCapacity, cluster.maxPhysicalDataCapacity)
                && Objects.equals(
                        this.maxPhysicalDataCapacityPerNode, cluster.maxPhysicalDataCapacityPerNode)
                && Objects.equals(this.memoryAllocationRate, cluster.memoryAllocationRate)
                && Objects.equals(
                        this.metroAvailabilityChecklist, cluster.metroAvailabilityChecklist)
                && Objects.equals(this.mgtGateway, cluster.mgtGateway)
                && Objects.equals(this.mgtNetmask, cluster.mgtNetmask)
                && Objects.equals(this.migrationDataSize, cluster.migrationDataSize)
                && Objects.equals(this.migrationSpeed, cluster.migrationSpeed)
                && Objects.equals(this.name, cluster.name)
                && Objects.equals(this.noPerformanceLayer, cluster.noPerformanceLayer)
                && Objects.equals(this.ntpMode, cluster.ntpMode)
                && Objects.equals(this.ntpServers, cluster.ntpServers)
                && Objects.equals(this.nvmeOverRdmaEnabled, cluster.nvmeOverRdmaEnabled)
                && Objects.equals(this.nvmeOverTcpEnabled, cluster.nvmeOverTcpEnabled)
                && Objects.equals(this.nvmfEnabled, cluster.nvmfEnabled)
                && Objects.equals(this.overallEfficiency, cluster.overallEfficiency)
                && Objects.equals(this.overcommitMemoryRatio, cluster.overcommitMemoryRatio)
                && Objects.equals(this.overprovisionRatio, cluster.overprovisionRatio)
                && Objects.equals(this.perfAllocatedDataSpace, cluster.perfAllocatedDataSpace)
                && Objects.equals(this.perfFailureDataSpace, cluster.perfFailureDataSpace)
                && Objects.equals(this.perfTotalDataCapacity, cluster.perfTotalDataCapacity)
                && Objects.equals(this.perfUsedDataSpace, cluster.perfUsedDataSpace)
                && Objects.equals(this.perfValidDataSpace, cluster.perfValidDataSpace)
                && Objects.equals(this.plannedPrioritizedSpace, cluster.plannedPrioritizedSpace)
                && Objects.equals(this.pmemEnabled, cluster.pmemEnabled)
                && Objects.equals(this.prioSpacePercentage, cluster.prioSpacePercentage)
                && Objects.equals(this.provisionedCpuCores, cluster.provisionedCpuCores)
                && Objects.equals(
                        this.provisionedCpuCoresForActiveVm, cluster.provisionedCpuCoresForActiveVm)
                && Objects.equals(
                        this.provisionedForActiveVmRatio, cluster.provisionedForActiveVmRatio)
                && Objects.equals(this.provisionedMemoryBytes, cluster.provisionedMemoryBytes)
                && Objects.equals(this.provisionedRatio, cluster.provisionedRatio)
                && Objects.equals(this.rdmaEnabled, cluster.rdmaEnabled)
                && Objects.equals(this.recommendedCpuModels, cluster.recommendedCpuModels)
                && Objects.equals(this.recoverDataSize, cluster.recoverDataSize)
                && Objects.equals(this.recoverSpeed, cluster.recoverSpeed)
                && Objects.equals(this.replicaCapacityOnly, cluster.replicaCapacityOnly)
                && Objects.equals(
                        this.reservedCpuCoresForSystemService,
                        cluster.reservedCpuCoresForSystemService)
                && Objects.equals(this.runningVmNum, cluster.runningVmNum)
                && Objects.equals(this.softwareEdition, cluster.softwareEdition)
                && Objects.equals(this.stoppedVmNum, cluster.stoppedVmNum)
                && Objects.equals(this.stretch, cluster.stretch)
                && Objects.equals(this.suspendedVmNum, cluster.suspendedVmNum)
                && Objects.equals(this.totalCacheCapacity, cluster.totalCacheCapacity)
                && Objects.equals(this.totalCpuCores, cluster.totalCpuCores)
                && Objects.equals(this.totalCpuHz, cluster.totalCpuHz)
                && Objects.equals(this.totalCpuModels, cluster.totalCpuModels)
                && Objects.equals(this.totalCpuSockets, cluster.totalCpuSockets)
                && Objects.equals(this.totalDataCapacity, cluster.totalDataCapacity)
                && Objects.equals(this.totalMemoryBytes, cluster.totalMemoryBytes)
                && Objects.equals(this.totalPrioVolumeSize, cluster.totalPrioVolumeSize)
                && Objects.equals(this.totalPrioVolumeSizeUsage, cluster.totalPrioVolumeSizeUsage)
                && Objects.equals(this.type, cluster.type)
                && Objects.equals(this.upgradeForTiering, cluster.upgradeForTiering)
                && Objects.equals(this.upgradeToolVersion, cluster.upgradeToolVersion)
                && Objects.equals(this.usedCacheSpace, cluster.usedCacheSpace)
                && Objects.equals(this.usedCpuHz, cluster.usedCpuHz)
                && Objects.equals(this.usedDataSpace, cluster.usedDataSpace)
                && Objects.equals(this.usedMemoryBytes, cluster.usedMemoryBytes)
                && Objects.equals(this.validCacheSpace, cluster.validCacheSpace)
                && Objects.equals(this.validDataSpace, cluster.validDataSpace)
                && Objects.equals(this.vdses, cluster.vdses)
                && Objects.equals(this.version, cluster.version)
                && Objects.equals(this.vhostEnabled, cluster.vhostEnabled)
                && Objects.equals(this.vmFolders, cluster.vmFolders)
                && Objects.equals(this.vmNum, cluster.vmNum)
                && Objects.equals(this.vmTemplates, cluster.vmTemplates)
                && Objects.equals(this.vms, cluster.vms);
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
                accessWriteCompressEnabled,
                allocatedMemoryBytes,
                allocatedPrioritizedSpace,
                allocatedPrioritizedSpaceUsage,
                applicationHighestVersion,
                architecture,
                autoConverge,
                capSnapshotUniqueSize,
                capVolumeUniqueSize,
                commitedMemoryBytes,
                connectState,
                currentCpuModel,
                dataReductionRatio,
                dataReductionSaving,
                datacenters,
                dirtyCacheSpace,
                dirtyCacheUsage,
                disconnectedDate,
                disconnectedReason,
                dns,
                downgradedPrioritizedSpace,
                enableTiering,
                entityAsyncStatus,
                everouteCluster,
                failureCacheSpace,
                failureDataSpace,
                hasMetrox,
                hostNum,
                hosts,
                hypervisor,
                id,
                ip,
                isAllFlash,
                iscsiVip,
                labels,
                licenseExpireDate,
                licenseSerial,
                licenseSignDate,
                licenseType,
                localId,
                logicalUsedDataSpace,
                maintenanceEndDate,
                maintenanceStartDate,
                managementVip,
                maxChunkNum,
                maxPhysicalDataCapacity,
                maxPhysicalDataCapacityPerNode,
                memoryAllocationRate,
                metroAvailabilityChecklist,
                mgtGateway,
                mgtNetmask,
                migrationDataSize,
                migrationSpeed,
                name,
                noPerformanceLayer,
                ntpMode,
                ntpServers,
                nvmeOverRdmaEnabled,
                nvmeOverTcpEnabled,
                nvmfEnabled,
                overallEfficiency,
                overcommitMemoryRatio,
                overprovisionRatio,
                perfAllocatedDataSpace,
                perfFailureDataSpace,
                perfTotalDataCapacity,
                perfUsedDataSpace,
                perfValidDataSpace,
                plannedPrioritizedSpace,
                pmemEnabled,
                prioSpacePercentage,
                provisionedCpuCores,
                provisionedCpuCoresForActiveVm,
                provisionedForActiveVmRatio,
                provisionedMemoryBytes,
                provisionedRatio,
                rdmaEnabled,
                recommendedCpuModels,
                recoverDataSize,
                recoverSpeed,
                replicaCapacityOnly,
                reservedCpuCoresForSystemService,
                runningVmNum,
                softwareEdition,
                stoppedVmNum,
                stretch,
                suspendedVmNum,
                totalCacheCapacity,
                totalCpuCores,
                totalCpuHz,
                totalCpuModels,
                totalCpuSockets,
                totalDataCapacity,
                totalMemoryBytes,
                totalPrioVolumeSize,
                totalPrioVolumeSizeUsage,
                type,
                upgradeForTiering,
                upgradeToolVersion,
                usedCacheSpace,
                usedCpuHz,
                usedDataSpace,
                usedMemoryBytes,
                validCacheSpace,
                validDataSpace,
                vdses,
                version,
                vhostEnabled,
                vmFolders,
                vmNum,
                vmTemplates,
                vms);
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
        sb.append("class Cluster {\n");
        sb.append("    accessWriteCompressEnabled: ")
                .append(toIndentedString(accessWriteCompressEnabled))
                .append("\n");
        sb.append("    allocatedMemoryBytes: ")
                .append(toIndentedString(allocatedMemoryBytes))
                .append("\n");
        sb.append("    allocatedPrioritizedSpace: ")
                .append(toIndentedString(allocatedPrioritizedSpace))
                .append("\n");
        sb.append("    allocatedPrioritizedSpaceUsage: ")
                .append(toIndentedString(allocatedPrioritizedSpaceUsage))
                .append("\n");
        sb.append("    applicationHighestVersion: ")
                .append(toIndentedString(applicationHighestVersion))
                .append("\n");
        sb.append("    architecture: ").append(toIndentedString(architecture)).append("\n");
        sb.append("    autoConverge: ").append(toIndentedString(autoConverge)).append("\n");
        sb.append("    capSnapshotUniqueSize: ")
                .append(toIndentedString(capSnapshotUniqueSize))
                .append("\n");
        sb.append("    capVolumeUniqueSize: ")
                .append(toIndentedString(capVolumeUniqueSize))
                .append("\n");
        sb.append("    commitedMemoryBytes: ")
                .append(toIndentedString(commitedMemoryBytes))
                .append("\n");
        sb.append("    connectState: ").append(toIndentedString(connectState)).append("\n");
        sb.append("    currentCpuModel: ").append(toIndentedString(currentCpuModel)).append("\n");
        sb.append("    dataReductionRatio: ")
                .append(toIndentedString(dataReductionRatio))
                .append("\n");
        sb.append("    dataReductionSaving: ")
                .append(toIndentedString(dataReductionSaving))
                .append("\n");
        sb.append("    datacenters: ").append(toIndentedString(datacenters)).append("\n");
        sb.append("    dirtyCacheSpace: ").append(toIndentedString(dirtyCacheSpace)).append("\n");
        sb.append("    dirtyCacheUsage: ").append(toIndentedString(dirtyCacheUsage)).append("\n");
        sb.append("    disconnectedDate: ").append(toIndentedString(disconnectedDate)).append("\n");
        sb.append("    disconnectedReason: ")
                .append(toIndentedString(disconnectedReason))
                .append("\n");
        sb.append("    dns: ").append(toIndentedString(dns)).append("\n");
        sb.append("    downgradedPrioritizedSpace: ")
                .append(toIndentedString(downgradedPrioritizedSpace))
                .append("\n");
        sb.append("    enableTiering: ").append(toIndentedString(enableTiering)).append("\n");
        sb.append("    entityAsyncStatus: ")
                .append(toIndentedString(entityAsyncStatus))
                .append("\n");
        sb.append("    everouteCluster: ").append(toIndentedString(everouteCluster)).append("\n");
        sb.append("    failureCacheSpace: ")
                .append(toIndentedString(failureCacheSpace))
                .append("\n");
        sb.append("    failureDataSpace: ").append(toIndentedString(failureDataSpace)).append("\n");
        sb.append("    hasMetrox: ").append(toIndentedString(hasMetrox)).append("\n");
        sb.append("    hostNum: ").append(toIndentedString(hostNum)).append("\n");
        sb.append("    hosts: ").append(toIndentedString(hosts)).append("\n");
        sb.append("    hypervisor: ").append(toIndentedString(hypervisor)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
        sb.append("    isAllFlash: ").append(toIndentedString(isAllFlash)).append("\n");
        sb.append("    iscsiVip: ").append(toIndentedString(iscsiVip)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    licenseExpireDate: ")
                .append(toIndentedString(licenseExpireDate))
                .append("\n");
        sb.append("    licenseSerial: ").append(toIndentedString(licenseSerial)).append("\n");
        sb.append("    licenseSignDate: ").append(toIndentedString(licenseSignDate)).append("\n");
        sb.append("    licenseType: ").append(toIndentedString(licenseType)).append("\n");
        sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
        sb.append("    logicalUsedDataSpace: ")
                .append(toIndentedString(logicalUsedDataSpace))
                .append("\n");
        sb.append("    maintenanceEndDate: ")
                .append(toIndentedString(maintenanceEndDate))
                .append("\n");
        sb.append("    maintenanceStartDate: ")
                .append(toIndentedString(maintenanceStartDate))
                .append("\n");
        sb.append("    managementVip: ").append(toIndentedString(managementVip)).append("\n");
        sb.append("    maxChunkNum: ").append(toIndentedString(maxChunkNum)).append("\n");
        sb.append("    maxPhysicalDataCapacity: ")
                .append(toIndentedString(maxPhysicalDataCapacity))
                .append("\n");
        sb.append("    maxPhysicalDataCapacityPerNode: ")
                .append(toIndentedString(maxPhysicalDataCapacityPerNode))
                .append("\n");
        sb.append("    memoryAllocationRate: ")
                .append(toIndentedString(memoryAllocationRate))
                .append("\n");
        sb.append("    metroAvailabilityChecklist: ")
                .append(toIndentedString(metroAvailabilityChecklist))
                .append("\n");
        sb.append("    mgtGateway: ").append(toIndentedString(mgtGateway)).append("\n");
        sb.append("    mgtNetmask: ").append(toIndentedString(mgtNetmask)).append("\n");
        sb.append("    migrationDataSize: ")
                .append(toIndentedString(migrationDataSize))
                .append("\n");
        sb.append("    migrationSpeed: ").append(toIndentedString(migrationSpeed)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    noPerformanceLayer: ")
                .append(toIndentedString(noPerformanceLayer))
                .append("\n");
        sb.append("    ntpMode: ").append(toIndentedString(ntpMode)).append("\n");
        sb.append("    ntpServers: ").append(toIndentedString(ntpServers)).append("\n");
        sb.append("    nvmeOverRdmaEnabled: ")
                .append(toIndentedString(nvmeOverRdmaEnabled))
                .append("\n");
        sb.append("    nvmeOverTcpEnabled: ")
                .append(toIndentedString(nvmeOverTcpEnabled))
                .append("\n");
        sb.append("    nvmfEnabled: ").append(toIndentedString(nvmfEnabled)).append("\n");
        sb.append("    overallEfficiency: ")
                .append(toIndentedString(overallEfficiency))
                .append("\n");
        sb.append("    overcommitMemoryRatio: ")
                .append(toIndentedString(overcommitMemoryRatio))
                .append("\n");
        sb.append("    overprovisionRatio: ")
                .append(toIndentedString(overprovisionRatio))
                .append("\n");
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
        sb.append("    pmemEnabled: ").append(toIndentedString(pmemEnabled)).append("\n");
        sb.append("    prioSpacePercentage: ")
                .append(toIndentedString(prioSpacePercentage))
                .append("\n");
        sb.append("    provisionedCpuCores: ")
                .append(toIndentedString(provisionedCpuCores))
                .append("\n");
        sb.append("    provisionedCpuCoresForActiveVm: ")
                .append(toIndentedString(provisionedCpuCoresForActiveVm))
                .append("\n");
        sb.append("    provisionedForActiveVmRatio: ")
                .append(toIndentedString(provisionedForActiveVmRatio))
                .append("\n");
        sb.append("    provisionedMemoryBytes: ")
                .append(toIndentedString(provisionedMemoryBytes))
                .append("\n");
        sb.append("    provisionedRatio: ").append(toIndentedString(provisionedRatio)).append("\n");
        sb.append("    rdmaEnabled: ").append(toIndentedString(rdmaEnabled)).append("\n");
        sb.append("    recommendedCpuModels: ")
                .append(toIndentedString(recommendedCpuModels))
                .append("\n");
        sb.append("    recoverDataSize: ").append(toIndentedString(recoverDataSize)).append("\n");
        sb.append("    recoverSpeed: ").append(toIndentedString(recoverSpeed)).append("\n");
        sb.append("    replicaCapacityOnly: ")
                .append(toIndentedString(replicaCapacityOnly))
                .append("\n");
        sb.append("    reservedCpuCoresForSystemService: ")
                .append(toIndentedString(reservedCpuCoresForSystemService))
                .append("\n");
        sb.append("    runningVmNum: ").append(toIndentedString(runningVmNum)).append("\n");
        sb.append("    softwareEdition: ").append(toIndentedString(softwareEdition)).append("\n");
        sb.append("    stoppedVmNum: ").append(toIndentedString(stoppedVmNum)).append("\n");
        sb.append("    stretch: ").append(toIndentedString(stretch)).append("\n");
        sb.append("    suspendedVmNum: ").append(toIndentedString(suspendedVmNum)).append("\n");
        sb.append("    totalCacheCapacity: ")
                .append(toIndentedString(totalCacheCapacity))
                .append("\n");
        sb.append("    totalCpuCores: ").append(toIndentedString(totalCpuCores)).append("\n");
        sb.append("    totalCpuHz: ").append(toIndentedString(totalCpuHz)).append("\n");
        sb.append("    totalCpuModels: ").append(toIndentedString(totalCpuModels)).append("\n");
        sb.append("    totalCpuSockets: ").append(toIndentedString(totalCpuSockets)).append("\n");
        sb.append("    totalDataCapacity: ")
                .append(toIndentedString(totalDataCapacity))
                .append("\n");
        sb.append("    totalMemoryBytes: ").append(toIndentedString(totalMemoryBytes)).append("\n");
        sb.append("    totalPrioVolumeSize: ")
                .append(toIndentedString(totalPrioVolumeSize))
                .append("\n");
        sb.append("    totalPrioVolumeSizeUsage: ")
                .append(toIndentedString(totalPrioVolumeSizeUsage))
                .append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    upgradeForTiering: ")
                .append(toIndentedString(upgradeForTiering))
                .append("\n");
        sb.append("    upgradeToolVersion: ")
                .append(toIndentedString(upgradeToolVersion))
                .append("\n");
        sb.append("    usedCacheSpace: ").append(toIndentedString(usedCacheSpace)).append("\n");
        sb.append("    usedCpuHz: ").append(toIndentedString(usedCpuHz)).append("\n");
        sb.append("    usedDataSpace: ").append(toIndentedString(usedDataSpace)).append("\n");
        sb.append("    usedMemoryBytes: ").append(toIndentedString(usedMemoryBytes)).append("\n");
        sb.append("    validCacheSpace: ").append(toIndentedString(validCacheSpace)).append("\n");
        sb.append("    validDataSpace: ").append(toIndentedString(validDataSpace)).append("\n");
        sb.append("    vdses: ").append(toIndentedString(vdses)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    vhostEnabled: ").append(toIndentedString(vhostEnabled)).append("\n");
        sb.append("    vmFolders: ").append(toIndentedString(vmFolders)).append("\n");
        sb.append("    vmNum: ").append(toIndentedString(vmNum)).append("\n");
        sb.append("    vmTemplates: ").append(toIndentedString(vmTemplates)).append("\n");
        sb.append("    vms: ").append(toIndentedString(vms)).append("\n");
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

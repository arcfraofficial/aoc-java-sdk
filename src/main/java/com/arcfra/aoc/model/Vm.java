package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** Vm */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class Vm extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_BIOS_UUID = "bios_uuid";

    @SerializedName(SERIALIZED_NAME_BIOS_UUID)
    private String biosUuid;

    public static final String SERIALIZED_NAME_CLOCK_OFFSET = "clock_offset";

    @SerializedName(SERIALIZED_NAME_CLOCK_OFFSET)
    private VmClockOffset clockOffset;

    public static final String SERIALIZED_NAME_CLOUD_INIT_SUPPORTED = "cloud_init_supported";

    @SerializedName(SERIALIZED_NAME_CLOUD_INIT_SUPPORTED)
    private Boolean cloudInitSupported;

    public static final String SERIALIZED_NAME_CLUSTER = "cluster";

    @SerializedName(SERIALIZED_NAME_CLUSTER)
    private NestedCluster cluster;

    public static final String SERIALIZED_NAME_CPU = "cpu";

    @SerializedName(SERIALIZED_NAME_CPU)
    private NestedCpu cpu;

    public static final String SERIALIZED_NAME_CPU_MODEL = "cpu_model";

    @SerializedName(SERIALIZED_NAME_CPU_MODEL)
    private String cpuModel;

    public static final String SERIALIZED_NAME_CPU_USAGE = "cpu_usage";

    @SerializedName(SERIALIZED_NAME_CPU_USAGE)
    private Double cpuUsage;

    public static final String SERIALIZED_NAME_DELETED_AT = "deleted_at";

    @SerializedName(SERIALIZED_NAME_DELETED_AT)
    private String deletedAt;

    public static final String SERIALIZED_NAME_DESCRIPTION = "description";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION)
    private String description;

    public static final String SERIALIZED_NAME_DNS_SERVERS = "dns_servers";

    @SerializedName(SERIALIZED_NAME_DNS_SERVERS)
    private String dnsServers;

    public static final String SERIALIZED_NAME_ENTITY_ASYNC_STATUS = "entityAsyncStatus";

    @SerializedName(SERIALIZED_NAME_ENTITY_ASYNC_STATUS)
    private EntityAsyncStatus entityAsyncStatus;

    public static final String SERIALIZED_NAME_FIRMWARE = "firmware";

    @SerializedName(SERIALIZED_NAME_FIRMWARE)
    private VmFirmware firmware;

    public static final String SERIALIZED_NAME_FOLDER = "folder";

    @SerializedName(SERIALIZED_NAME_FOLDER)
    private NestedVmFolder folder;

    public static final String SERIALIZED_NAME_GPU_DEVICES = "gpu_devices";

    @SerializedName(SERIALIZED_NAME_GPU_DEVICES)
    private List<NestedGpuDevice> gpuDevices = null;

    public static final String SERIALIZED_NAME_GUEST_CPU_MODEL = "guest_cpu_model";

    @SerializedName(SERIALIZED_NAME_GUEST_CPU_MODEL)
    private String guestCpuModel;

    public static final String SERIALIZED_NAME_GUEST_OS_TYPE = "guest_os_type";

    @SerializedName(SERIALIZED_NAME_GUEST_OS_TYPE)
    private VmGuestsOperationSystem guestOsType;

    public static final String SERIALIZED_NAME_GUEST_SIZE_USAGE = "guest_size_usage";

    @SerializedName(SERIALIZED_NAME_GUEST_SIZE_USAGE)
    private Double guestSizeUsage;

    public static final String SERIALIZED_NAME_GUEST_USED_SIZE = "guest_used_size";

    @SerializedName(SERIALIZED_NAME_GUEST_USED_SIZE)
    private Long guestUsedSize;

    public static final String SERIALIZED_NAME_HA = "ha";

    @SerializedName(SERIALIZED_NAME_HA)
    private Boolean ha;

    public static final String SERIALIZED_NAME_HA_PRIORITY = "ha_priority";

    @SerializedName(SERIALIZED_NAME_HA_PRIORITY)
    private VmHaPriority haPriority;

    public static final String SERIALIZED_NAME_HOST = "host";

    @SerializedName(SERIALIZED_NAME_HOST)
    private NestedHost host;

    public static final String SERIALIZED_NAME_HOSTNAME = "hostname";

    @SerializedName(SERIALIZED_NAME_HOSTNAME)
    private String hostname;

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

    public static final String SERIALIZED_NAME_IN_RECYCLE_BIN = "in_recycle_bin";

    @SerializedName(SERIALIZED_NAME_IN_RECYCLE_BIN)
    private Boolean inRecycleBin;

    public static final String SERIALIZED_NAME_INTERNAL = "internal";

    @SerializedName(SERIALIZED_NAME_INTERNAL)
    private Boolean internal;

    public static final String SERIALIZED_NAME_IO_POLICY = "io_policy";

    @SerializedName(SERIALIZED_NAME_IO_POLICY)
    private VmDiskIoPolicy ioPolicy;

    public static final String SERIALIZED_NAME_IPS = "ips";

    @SerializedName(SERIALIZED_NAME_IPS)
    private String ips;

    public static final String SERIALIZED_NAME_ISOLATION_POLICY = "isolation_policy";

    @SerializedName(SERIALIZED_NAME_ISOLATION_POLICY)
    private NestedIsolationPolicy isolationPolicy;

    public static final String SERIALIZED_NAME_KERNEL_INFO = "kernel_info";

    @SerializedName(SERIALIZED_NAME_KERNEL_INFO)
    private String kernelInfo;

    public static final String SERIALIZED_NAME_LABELS = "labels";

    @SerializedName(SERIALIZED_NAME_LABELS)
    private List<NestedLabel> labels = null;

    public static final String SERIALIZED_NAME_LAST_SHUTDOWN_TIME = "last_shutdown_time";

    @SerializedName(SERIALIZED_NAME_LAST_SHUTDOWN_TIME)
    private String lastShutdownTime;

    public static final String SERIALIZED_NAME_LOCAL_CREATED_AT = "local_created_at";

    @SerializedName(SERIALIZED_NAME_LOCAL_CREATED_AT)
    private String localCreatedAt;

    public static final String SERIALIZED_NAME_LOCAL_ID = "local_id";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID)
    private String localId;

    public static final String SERIALIZED_NAME_LOGICAL_SIZE_BYTES = "logical_size_bytes";

    @SerializedName(SERIALIZED_NAME_LOGICAL_SIZE_BYTES)
    private Long logicalSizeBytes;

    public static final String SERIALIZED_NAME_MAX_BANDWIDTH = "max_bandwidth";

    @SerializedName(SERIALIZED_NAME_MAX_BANDWIDTH)
    private Long maxBandwidth;

    public static final String SERIALIZED_NAME_MAX_BANDWIDTH_POLICY = "max_bandwidth_policy";

    @SerializedName(SERIALIZED_NAME_MAX_BANDWIDTH_POLICY)
    private VmDiskIoRestrictType maxBandwidthPolicy;

    public static final String SERIALIZED_NAME_MAX_IOPS = "max_iops";

    @SerializedName(SERIALIZED_NAME_MAX_IOPS)
    private Integer maxIops;

    public static final String SERIALIZED_NAME_MAX_IOPS_POLICY = "max_iops_policy";

    @SerializedName(SERIALIZED_NAME_MAX_IOPS_POLICY)
    private VmDiskIoRestrictType maxIopsPolicy;

    public static final String SERIALIZED_NAME_MEMORY = "memory";

    @SerializedName(SERIALIZED_NAME_MEMORY)
    private Long memory;

    public static final String SERIALIZED_NAME_MEMORY_USAGE = "memory_usage";

    @SerializedName(SERIALIZED_NAME_MEMORY_USAGE)
    private Double memoryUsage;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_NESTED_VIRTUALIZATION = "nested_virtualization";

    @SerializedName(SERIALIZED_NAME_NESTED_VIRTUALIZATION)
    private Boolean nestedVirtualization;

    public static final String SERIALIZED_NAME_NODE_IP = "node_ip";

    @SerializedName(SERIALIZED_NAME_NODE_IP)
    private String nodeIp;

    public static final String SERIALIZED_NAME_ORIGINAL_NAME = "original_name";

    @SerializedName(SERIALIZED_NAME_ORIGINAL_NAME)
    private String originalName;

    public static final String SERIALIZED_NAME_OS = "os";

    @SerializedName(SERIALIZED_NAME_OS)
    private String os;

    public static final String SERIALIZED_NAME_OUT_UNINSTALL_USB = "out_uninstall_usb";

    @SerializedName(SERIALIZED_NAME_OUT_UNINSTALL_USB)
    private List<String> outUninstallUsb = new ArrayList<String>();

    public static final String SERIALIZED_NAME_PCI_NICS = "pci_nics";

    @SerializedName(SERIALIZED_NAME_PCI_NICS)
    private List<NestedNic> pciNics = null;

    public static final String SERIALIZED_NAME_PROTECTED = "protected";

    @SerializedName(SERIALIZED_NAME_PROTECTED)
    private Boolean _protected;

    public static final String SERIALIZED_NAME_PROVISIONED_SIZE = "provisioned_size";

    @SerializedName(SERIALIZED_NAME_PROVISIONED_SIZE)
    private Long provisionedSize;

    public static final String SERIALIZED_NAME_SIZE = "size";

    @SerializedName(SERIALIZED_NAME_SIZE)
    private Long size;

    public static final String SERIALIZED_NAME_SNAPSHOTS = "snapshots";

    @SerializedName(SERIALIZED_NAME_SNAPSHOTS)
    private List<NestedVmSnapshot> snapshots = null;

    public static final String SERIALIZED_NAME_STATUS = "status";

    @SerializedName(SERIALIZED_NAME_STATUS)
    private VmStatus status;

    public static final String SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE = "unique_logical_size";

    @SerializedName(SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE)
    private Double uniqueLogicalSize;

    public static final String SERIALIZED_NAME_UNIQUE_SIZE = "unique_size";

    @SerializedName(SERIALIZED_NAME_UNIQUE_SIZE)
    private Long uniqueSize;

    public static final String SERIALIZED_NAME_USB_DEVICES = "usb_devices";

    @SerializedName(SERIALIZED_NAME_USB_DEVICES)
    private List<NestedUsbDevice> usbDevices = null;

    public static final String SERIALIZED_NAME_USED_SIZE = "used_size";

    @SerializedName(SERIALIZED_NAME_USED_SIZE)
    private Long usedSize;

    public static final String SERIALIZED_NAME_USED_SIZE_USAGE = "used_size_usage";

    @SerializedName(SERIALIZED_NAME_USED_SIZE_USAGE)
    private Double usedSizeUsage;

    public static final String SERIALIZED_NAME_VCPU = "vcpu";

    @SerializedName(SERIALIZED_NAME_VCPU)
    private Integer vcpu;

    public static final String SERIALIZED_NAME_VIDEO_TYPE = "video_type";

    @SerializedName(SERIALIZED_NAME_VIDEO_TYPE)
    private VmVideoType videoType;

    public static final String SERIALIZED_NAME_VM_DISKS = "vm_disks";

    @SerializedName(SERIALIZED_NAME_VM_DISKS)
    private List<NestedVmDisk> vmDisks = null;

    public static final String SERIALIZED_NAME_VM_NICS = "vm_nics";

    @SerializedName(SERIALIZED_NAME_VM_NICS)
    private List<NestedVmNic> vmNics = null;

    public static final String SERIALIZED_NAME_VM_PLACEMENT_GROUP = "vm_placement_group";

    @SerializedName(SERIALIZED_NAME_VM_PLACEMENT_GROUP)
    private List<NestedVmPlacementGroup> vmPlacementGroup = null;

    public static final String SERIALIZED_NAME_VM_TOOLS_STATUS = "vm_tools_status";

    @SerializedName(SERIALIZED_NAME_VM_TOOLS_STATUS)
    private VmToolsStatus vmToolsStatus;

    public static final String SERIALIZED_NAME_VM_TOOLS_VERSION = "vm_tools_version";

    @SerializedName(SERIALIZED_NAME_VM_TOOLS_VERSION)
    private String vmToolsVersion;

    public static final String SERIALIZED_NAME_VM_USAGE = "vm_usage";

    @SerializedName(SERIALIZED_NAME_VM_USAGE)
    private VmUsage vmUsage;

    public static final String SERIALIZED_NAME_WIN_OPT = "win_opt";

    @SerializedName(SERIALIZED_NAME_WIN_OPT)
    private Boolean winOpt;

    public Vm() {}

    public Vm biosUuid(String biosUuid) {

        this.biosUuid = biosUuid;
        return this;
    }

    /**
     * Get biosUuid
     *
     * @return biosUuid
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBiosUuid() {
        return biosUuid;
    }

    public void setBiosUuid(String biosUuid) {
        this.biosUuid = biosUuid;
    }

    public Vm biosUuid_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BIOS_UUID);
        return this;
    }

    public Vm biosUuid_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BIOS_UUID);
        return this;
    }

    public void setBiosUuid_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BIOS_UUID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BIOS_UUID);
        }
    }

    public boolean getBiosUuid_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BIOS_UUID);
    }

    public Vm clockOffset(VmClockOffset clockOffset) {

        this.clockOffset = clockOffset;
        return this;
    }

    /**
     * Get clockOffset
     *
     * @return clockOffset
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public VmClockOffset getClockOffset() {
        return clockOffset;
    }

    public void setClockOffset(VmClockOffset clockOffset) {
        this.clockOffset = clockOffset;
    }

    public Vm clockOffset_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLOCK_OFFSET);
        return this;
    }

    public Vm clockOffset_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLOCK_OFFSET);
        return this;
    }

    public void setClockOffset_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLOCK_OFFSET);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLOCK_OFFSET);
        }
    }

    public boolean getClockOffset_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLOCK_OFFSET);
    }

    public Vm cloudInitSupported(Boolean cloudInitSupported) {

        this.cloudInitSupported = cloudInitSupported;
        return this;
    }

    /**
     * Get cloudInitSupported
     *
     * @return cloudInitSupported
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getCloudInitSupported() {
        return cloudInitSupported;
    }

    public void setCloudInitSupported(Boolean cloudInitSupported) {
        this.cloudInitSupported = cloudInitSupported;
    }

    public Vm cloudInitSupported_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLOUD_INIT_SUPPORTED);
        return this;
    }

    public Vm cloudInitSupported_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLOUD_INIT_SUPPORTED);
        return this;
    }

    public void setCloudInitSupported_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLOUD_INIT_SUPPORTED);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLOUD_INIT_SUPPORTED);
        }
    }

    public boolean getCloudInitSupported_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLOUD_INIT_SUPPORTED);
    }

    public Vm cluster(NestedCluster cluster) {

        this.cluster = cluster;
        return this;
    }

    /**
     * Get cluster
     *
     * @return cluster
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NestedCluster getCluster() {
        return cluster;
    }

    public void setCluster(NestedCluster cluster) {
        this.cluster = cluster;
    }

    public Vm cluster_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER);
        return this;
    }

    public Vm cluster_ExplictlyNonNull() {
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

    public Vm cpu(NestedCpu cpu) {

        this.cpu = cpu;
        return this;
    }

    /**
     * Get cpu
     *
     * @return cpu
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public NestedCpu getCpu() {
        return cpu;
    }

    public void setCpu(NestedCpu cpu) {
        this.cpu = cpu;
    }

    public Vm cpu_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CPU);
        return this;
    }

    public Vm cpu_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CPU);
        return this;
    }

    public void setCpu_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CPU);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CPU);
        }
    }

    public boolean getCpu_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CPU);
    }

    public Vm cpuModel(String cpuModel) {

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

    public Vm cpuModel_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CPU_MODEL);
        return this;
    }

    public Vm cpuModel_ExplictlyNonNull() {
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

    public Vm cpuUsage(Double cpuUsage) {

        this.cpuUsage = cpuUsage;
        return this;
    }

    /**
     * Get cpuUsage
     *
     * @return cpuUsage
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getCpuUsage() {
        return cpuUsage;
    }

    public void setCpuUsage(Double cpuUsage) {
        this.cpuUsage = cpuUsage;
    }

    public Vm cpuUsage_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CPU_USAGE);
        return this;
    }

    public Vm cpuUsage_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CPU_USAGE);
        return this;
    }

    public void setCpuUsage_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CPU_USAGE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CPU_USAGE);
        }
    }

    public boolean getCpuUsage_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CPU_USAGE);
    }

    public Vm deletedAt(String deletedAt) {

        this.deletedAt = deletedAt;
        return this;
    }

    /**
     * Get deletedAt
     *
     * @return deletedAt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(String deletedAt) {
        this.deletedAt = deletedAt;
    }

    public Vm deletedAt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DELETED_AT);
        return this;
    }

    public Vm deletedAt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DELETED_AT);
        return this;
    }

    public void setDeletedAt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DELETED_AT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DELETED_AT);
        }
    }

    public boolean getDeletedAt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DELETED_AT);
    }

    public Vm description(String description) {

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

    public Vm description_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION);
        return this;
    }

    public Vm description_ExplictlyNonNull() {
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

    public Vm dnsServers(String dnsServers) {

        this.dnsServers = dnsServers;
        return this;
    }

    /**
     * Get dnsServers
     *
     * @return dnsServers
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDnsServers() {
        return dnsServers;
    }

    public void setDnsServers(String dnsServers) {
        this.dnsServers = dnsServers;
    }

    public Vm dnsServers_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DNS_SERVERS);
        return this;
    }

    public Vm dnsServers_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DNS_SERVERS);
        return this;
    }

    public void setDnsServers_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DNS_SERVERS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DNS_SERVERS);
        }
    }

    public boolean getDnsServers_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DNS_SERVERS);
    }

    public Vm entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {

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

    public Vm entityAsyncStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        return this;
    }

    public Vm entityAsyncStatus_ExplictlyNonNull() {
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

    public Vm firmware(VmFirmware firmware) {

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
    public VmFirmware getFirmware() {
        return firmware;
    }

    public void setFirmware(VmFirmware firmware) {
        this.firmware = firmware;
    }

    public Vm firmware_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FIRMWARE);
        return this;
    }

    public Vm firmware_ExplictlyNonNull() {
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

    public Vm folder(NestedVmFolder folder) {

        this.folder = folder;
        return this;
    }

    /**
     * Get folder
     *
     * @return folder
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NestedVmFolder getFolder() {
        return folder;
    }

    public void setFolder(NestedVmFolder folder) {
        this.folder = folder;
    }

    public Vm folder_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FOLDER);
        return this;
    }

    public Vm folder_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FOLDER);
        return this;
    }

    public void setFolder_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FOLDER);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FOLDER);
        }
    }

    public boolean getFolder_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FOLDER);
    }

    public Vm gpuDevices(List<NestedGpuDevice> gpuDevices) {

        this.gpuDevices = gpuDevices;
        return this;
    }

    public Vm addGpuDevicesItem(NestedGpuDevice gpuDevicesItem) {
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

    public Vm gpuDevices_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_GPU_DEVICES);
        return this;
    }

    public Vm gpuDevices_ExplictlyNonNull() {
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

    public Vm guestCpuModel(String guestCpuModel) {

        this.guestCpuModel = guestCpuModel;
        return this;
    }

    /**
     * Get guestCpuModel
     *
     * @return guestCpuModel
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getGuestCpuModel() {
        return guestCpuModel;
    }

    public void setGuestCpuModel(String guestCpuModel) {
        this.guestCpuModel = guestCpuModel;
    }

    public Vm guestCpuModel_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_GUEST_CPU_MODEL);
        return this;
    }

    public Vm guestCpuModel_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_GUEST_CPU_MODEL);
        return this;
    }

    public void setGuestCpuModel_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_GUEST_CPU_MODEL);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_GUEST_CPU_MODEL);
        }
    }

    public boolean getGuestCpuModel_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_GUEST_CPU_MODEL);
    }

    public Vm guestOsType(VmGuestsOperationSystem guestOsType) {

        this.guestOsType = guestOsType;
        return this;
    }

    /**
     * Get guestOsType
     *
     * @return guestOsType
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmGuestsOperationSystem getGuestOsType() {
        return guestOsType;
    }

    public void setGuestOsType(VmGuestsOperationSystem guestOsType) {
        this.guestOsType = guestOsType;
    }

    public Vm guestOsType_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_GUEST_OS_TYPE);
        return this;
    }

    public Vm guestOsType_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_GUEST_OS_TYPE);
        return this;
    }

    public void setGuestOsType_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_GUEST_OS_TYPE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_GUEST_OS_TYPE);
        }
    }

    public boolean getGuestOsType_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_GUEST_OS_TYPE);
    }

    public Vm guestSizeUsage(Double guestSizeUsage) {

        this.guestSizeUsage = guestSizeUsage;
        return this;
    }

    /**
     * Get guestSizeUsage
     *
     * @return guestSizeUsage
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getGuestSizeUsage() {
        return guestSizeUsage;
    }

    public void setGuestSizeUsage(Double guestSizeUsage) {
        this.guestSizeUsage = guestSizeUsage;
    }

    public Vm guestSizeUsage_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_GUEST_SIZE_USAGE);
        return this;
    }

    public Vm guestSizeUsage_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_GUEST_SIZE_USAGE);
        return this;
    }

    public void setGuestSizeUsage_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_GUEST_SIZE_USAGE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_GUEST_SIZE_USAGE);
        }
    }

    public boolean getGuestSizeUsage_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_GUEST_SIZE_USAGE);
    }

    public Vm guestUsedSize(Long guestUsedSize) {

        this.guestUsedSize = guestUsedSize;
        return this;
    }

    /**
     * Get guestUsedSize
     *
     * @return guestUsedSize
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getGuestUsedSize() {
        return guestUsedSize;
    }

    public void setGuestUsedSize(Long guestUsedSize) {
        this.guestUsedSize = guestUsedSize;
    }

    public Vm guestUsedSize_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_GUEST_USED_SIZE);
        return this;
    }

    public Vm guestUsedSize_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_GUEST_USED_SIZE);
        return this;
    }

    public void setGuestUsedSize_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_GUEST_USED_SIZE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_GUEST_USED_SIZE);
        }
    }

    public boolean getGuestUsedSize_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_GUEST_USED_SIZE);
    }

    public Vm ha(Boolean ha) {

        this.ha = ha;
        return this;
    }

    /**
     * Get ha
     *
     * @return ha
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Boolean getHa() {
        return ha;
    }

    public void setHa(Boolean ha) {
        this.ha = ha;
    }

    public Vm ha_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HA);
        return this;
    }

    public Vm ha_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HA);
        return this;
    }

    public void setHa_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HA);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HA);
        }
    }

    public boolean getHa_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HA);
    }

    public Vm haPriority(VmHaPriority haPriority) {

        this.haPriority = haPriority;
        return this;
    }

    /**
     * Get haPriority
     *
     * @return haPriority
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmHaPriority getHaPriority() {
        return haPriority;
    }

    public void setHaPriority(VmHaPriority haPriority) {
        this.haPriority = haPriority;
    }

    public Vm haPriority_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HA_PRIORITY);
        return this;
    }

    public Vm haPriority_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HA_PRIORITY);
        return this;
    }

    public void setHaPriority_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HA_PRIORITY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HA_PRIORITY);
        }
    }

    public boolean getHaPriority_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HA_PRIORITY);
    }

    public Vm host(NestedHost host) {

        this.host = host;
        return this;
    }

    /**
     * Get host
     *
     * @return host
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NestedHost getHost() {
        return host;
    }

    public void setHost(NestedHost host) {
        this.host = host;
    }

    public Vm host_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOST);
        return this;
    }

    public Vm host_ExplictlyNonNull() {
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

    public Vm hostname(String hostname) {

        this.hostname = hostname;
        return this;
    }

    /**
     * Get hostname
     *
     * @return hostname
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public Vm hostname_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOSTNAME);
        return this;
    }

    public Vm hostname_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HOSTNAME);
        return this;
    }

    public void setHostname_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HOSTNAME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HOSTNAME);
        }
    }

    public boolean getHostname_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HOSTNAME);
    }

    public Vm id(String id) {

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

    public Vm id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public Vm id_ExplictlyNonNull() {
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

    public Vm inRecycleBin(Boolean inRecycleBin) {

        this.inRecycleBin = inRecycleBin;
        return this;
    }

    /**
     * Get inRecycleBin
     *
     * @return inRecycleBin
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Boolean getInRecycleBin() {
        return inRecycleBin;
    }

    public void setInRecycleBin(Boolean inRecycleBin) {
        this.inRecycleBin = inRecycleBin;
    }

    public Vm inRecycleBin_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IN_RECYCLE_BIN);
        return this;
    }

    public Vm inRecycleBin_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IN_RECYCLE_BIN);
        return this;
    }

    public void setInRecycleBin_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IN_RECYCLE_BIN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IN_RECYCLE_BIN);
        }
    }

    public boolean getInRecycleBin_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IN_RECYCLE_BIN);
    }

    public Vm internal(Boolean internal) {

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

    public Vm internal_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INTERNAL);
        return this;
    }

    public Vm internal_ExplictlyNonNull() {
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

    public Vm ioPolicy(VmDiskIoPolicy ioPolicy) {

        this.ioPolicy = ioPolicy;
        return this;
    }

    /**
     * Get ioPolicy
     *
     * @return ioPolicy
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmDiskIoPolicy getIoPolicy() {
        return ioPolicy;
    }

    public void setIoPolicy(VmDiskIoPolicy ioPolicy) {
        this.ioPolicy = ioPolicy;
    }

    public Vm ioPolicy_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IO_POLICY);
        return this;
    }

    public Vm ioPolicy_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IO_POLICY);
        return this;
    }

    public void setIoPolicy_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IO_POLICY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IO_POLICY);
        }
    }

    public boolean getIoPolicy_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IO_POLICY);
    }

    public Vm ips(String ips) {

        this.ips = ips;
        return this;
    }

    /**
     * Get ips
     *
     * @return ips
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getIps() {
        return ips;
    }

    public void setIps(String ips) {
        this.ips = ips;
    }

    public Vm ips_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IPS);
        return this;
    }

    public Vm ips_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IPS);
        return this;
    }

    public void setIps_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IPS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IPS);
        }
    }

    public boolean getIps_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IPS);
    }

    public Vm isolationPolicy(NestedIsolationPolicy isolationPolicy) {

        this.isolationPolicy = isolationPolicy;
        return this;
    }

    /**
     * Get isolationPolicy
     *
     * @return isolationPolicy
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NestedIsolationPolicy getIsolationPolicy() {
        return isolationPolicy;
    }

    public void setIsolationPolicy(NestedIsolationPolicy isolationPolicy) {
        this.isolationPolicy = isolationPolicy;
    }

    public Vm isolationPolicy_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISOLATION_POLICY);
        return this;
    }

    public Vm isolationPolicy_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISOLATION_POLICY);
        return this;
    }

    public void setIsolationPolicy_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISOLATION_POLICY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISOLATION_POLICY);
        }
    }

    public boolean getIsolationPolicy_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISOLATION_POLICY);
    }

    public Vm kernelInfo(String kernelInfo) {

        this.kernelInfo = kernelInfo;
        return this;
    }

    /**
     * Get kernelInfo
     *
     * @return kernelInfo
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getKernelInfo() {
        return kernelInfo;
    }

    public void setKernelInfo(String kernelInfo) {
        this.kernelInfo = kernelInfo;
    }

    public Vm kernelInfo_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KERNEL_INFO);
        return this;
    }

    public Vm kernelInfo_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_KERNEL_INFO);
        return this;
    }

    public void setKernelInfo_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_KERNEL_INFO);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_KERNEL_INFO);
        }
    }

    public boolean getKernelInfo_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_KERNEL_INFO);
    }

    public Vm labels(List<NestedLabel> labels) {

        this.labels = labels;
        return this;
    }

    public Vm addLabelsItem(NestedLabel labelsItem) {
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

    public Vm labels_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LABELS);
        return this;
    }

    public Vm labels_ExplictlyNonNull() {
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

    public Vm lastShutdownTime(String lastShutdownTime) {

        this.lastShutdownTime = lastShutdownTime;
        return this;
    }

    /**
     * Get lastShutdownTime
     *
     * @return lastShutdownTime
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLastShutdownTime() {
        return lastShutdownTime;
    }

    public void setLastShutdownTime(String lastShutdownTime) {
        this.lastShutdownTime = lastShutdownTime;
    }

    public Vm lastShutdownTime_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_SHUTDOWN_TIME);
        return this;
    }

    public Vm lastShutdownTime_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_SHUTDOWN_TIME);
        return this;
    }

    public void setLastShutdownTime_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_SHUTDOWN_TIME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_SHUTDOWN_TIME);
        }
    }

    public boolean getLastShutdownTime_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LAST_SHUTDOWN_TIME);
    }

    public Vm localCreatedAt(String localCreatedAt) {

        this.localCreatedAt = localCreatedAt;
        return this;
    }

    /**
     * Get localCreatedAt
     *
     * @return localCreatedAt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalCreatedAt() {
        return localCreatedAt;
    }

    public void setLocalCreatedAt(String localCreatedAt) {
        this.localCreatedAt = localCreatedAt;
    }

    public Vm localCreatedAt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATED_AT);
        return this;
    }

    public Vm localCreatedAt_ExplictlyNonNull() {
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

    public Vm localId(String localId) {

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

    public Vm localId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID);
        return this;
    }

    public Vm localId_ExplictlyNonNull() {
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

    public Vm logicalSizeBytes(Long logicalSizeBytes) {

        this.logicalSizeBytes = logicalSizeBytes;
        return this;
    }

    /**
     * Get logicalSizeBytes
     *
     * @return logicalSizeBytes
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getLogicalSizeBytes() {
        return logicalSizeBytes;
    }

    public void setLogicalSizeBytes(Long logicalSizeBytes) {
        this.logicalSizeBytes = logicalSizeBytes;
    }

    public Vm logicalSizeBytes_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOGICAL_SIZE_BYTES);
        return this;
    }

    public Vm logicalSizeBytes_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOGICAL_SIZE_BYTES);
        return this;
    }

    public void setLogicalSizeBytes_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOGICAL_SIZE_BYTES);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOGICAL_SIZE_BYTES);
        }
    }

    public boolean getLogicalSizeBytes_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOGICAL_SIZE_BYTES);
    }

    public Vm maxBandwidth(Long maxBandwidth) {

        this.maxBandwidth = maxBandwidth;
        return this;
    }

    /**
     * Get maxBandwidth
     *
     * @return maxBandwidth
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getMaxBandwidth() {
        return maxBandwidth;
    }

    public void setMaxBandwidth(Long maxBandwidth) {
        this.maxBandwidth = maxBandwidth;
    }

    public Vm maxBandwidth_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_BANDWIDTH);
        return this;
    }

    public Vm maxBandwidth_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_BANDWIDTH);
        return this;
    }

    public void setMaxBandwidth_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_BANDWIDTH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_BANDWIDTH);
        }
    }

    public boolean getMaxBandwidth_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_BANDWIDTH);
    }

    public Vm maxBandwidthPolicy(VmDiskIoRestrictType maxBandwidthPolicy) {

        this.maxBandwidthPolicy = maxBandwidthPolicy;
        return this;
    }

    /**
     * Get maxBandwidthPolicy
     *
     * @return maxBandwidthPolicy
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmDiskIoRestrictType getMaxBandwidthPolicy() {
        return maxBandwidthPolicy;
    }

    public void setMaxBandwidthPolicy(VmDiskIoRestrictType maxBandwidthPolicy) {
        this.maxBandwidthPolicy = maxBandwidthPolicy;
    }

    public Vm maxBandwidthPolicy_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_BANDWIDTH_POLICY);
        return this;
    }

    public Vm maxBandwidthPolicy_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_BANDWIDTH_POLICY);
        return this;
    }

    public void setMaxBandwidthPolicy_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_BANDWIDTH_POLICY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_BANDWIDTH_POLICY);
        }
    }

    public boolean getMaxBandwidthPolicy_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_BANDWIDTH_POLICY);
    }

    public Vm maxIops(Integer maxIops) {

        this.maxIops = maxIops;
        return this;
    }

    /**
     * Get maxIops
     *
     * @return maxIops
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMaxIops() {
        return maxIops;
    }

    public void setMaxIops(Integer maxIops) {
        this.maxIops = maxIops;
    }

    public Vm maxIops_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_IOPS);
        return this;
    }

    public Vm maxIops_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_IOPS);
        return this;
    }

    public void setMaxIops_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_IOPS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_IOPS);
        }
    }

    public boolean getMaxIops_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_IOPS);
    }

    public Vm maxIopsPolicy(VmDiskIoRestrictType maxIopsPolicy) {

        this.maxIopsPolicy = maxIopsPolicy;
        return this;
    }

    /**
     * Get maxIopsPolicy
     *
     * @return maxIopsPolicy
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmDiskIoRestrictType getMaxIopsPolicy() {
        return maxIopsPolicy;
    }

    public void setMaxIopsPolicy(VmDiskIoRestrictType maxIopsPolicy) {
        this.maxIopsPolicy = maxIopsPolicy;
    }

    public Vm maxIopsPolicy_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_IOPS_POLICY);
        return this;
    }

    public Vm maxIopsPolicy_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_IOPS_POLICY);
        return this;
    }

    public void setMaxIopsPolicy_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_IOPS_POLICY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_IOPS_POLICY);
        }
    }

    public boolean getMaxIopsPolicy_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_IOPS_POLICY);
    }

    public Vm memory(Long memory) {

        this.memory = memory;
        return this;
    }

    /**
     * Get memory
     *
     * @return memory
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Long getMemory() {
        return memory;
    }

    public void setMemory(Long memory) {
        this.memory = memory;
    }

    public Vm memory_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MEMORY);
        return this;
    }

    public Vm memory_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MEMORY);
        return this;
    }

    public void setMemory_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MEMORY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MEMORY);
        }
    }

    public boolean getMemory_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MEMORY);
    }

    public Vm memoryUsage(Double memoryUsage) {

        this.memoryUsage = memoryUsage;
        return this;
    }

    /**
     * Get memoryUsage
     *
     * @return memoryUsage
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getMemoryUsage() {
        return memoryUsage;
    }

    public void setMemoryUsage(Double memoryUsage) {
        this.memoryUsage = memoryUsage;
    }

    public Vm memoryUsage_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MEMORY_USAGE);
        return this;
    }

    public Vm memoryUsage_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MEMORY_USAGE);
        return this;
    }

    public void setMemoryUsage_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MEMORY_USAGE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MEMORY_USAGE);
        }
    }

    public boolean getMemoryUsage_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MEMORY_USAGE);
    }

    public Vm name(String name) {

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

    public Vm name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public Vm name_ExplictlyNonNull() {
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

    public Vm nestedVirtualization(Boolean nestedVirtualization) {

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

    public Vm nestedVirtualization_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NESTED_VIRTUALIZATION);
        return this;
    }

    public Vm nestedVirtualization_ExplictlyNonNull() {
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

    public Vm nodeIp(String nodeIp) {

        this.nodeIp = nodeIp;
        return this;
    }

    /**
     * Get nodeIp
     *
     * @return nodeIp
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getNodeIp() {
        return nodeIp;
    }

    public void setNodeIp(String nodeIp) {
        this.nodeIp = nodeIp;
    }

    public Vm nodeIp_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NODE_IP);
        return this;
    }

    public Vm nodeIp_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NODE_IP);
        return this;
    }

    public void setNodeIp_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NODE_IP);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NODE_IP);
        }
    }

    public boolean getNodeIp_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NODE_IP);
    }

    public Vm originalName(String originalName) {

        this.originalName = originalName;
        return this;
    }

    /**
     * Get originalName
     *
     * @return originalName
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getOriginalName() {
        return originalName;
    }

    public void setOriginalName(String originalName) {
        this.originalName = originalName;
    }

    public Vm originalName_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ORIGINAL_NAME);
        return this;
    }

    public Vm originalName_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ORIGINAL_NAME);
        return this;
    }

    public void setOriginalName_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ORIGINAL_NAME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ORIGINAL_NAME);
        }
    }

    public boolean getOriginalName_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ORIGINAL_NAME);
    }

    public Vm os(String os) {

        this.os = os;
        return this;
    }

    /**
     * Get os
     *
     * @return os
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public Vm os_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_OS);
        return this;
    }

    public Vm os_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_OS);
        return this;
    }

    public void setOs_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_OS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_OS);
        }
    }

    public boolean getOs_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_OS);
    }

    public Vm outUninstallUsb(List<String> outUninstallUsb) {

        this.outUninstallUsb = outUninstallUsb;
        return this;
    }

    public Vm addOutUninstallUsbItem(String outUninstallUsbItem) {
        this.outUninstallUsb.add(outUninstallUsbItem);
        return this;
    }

    /**
     * Get outUninstallUsb
     *
     * @return outUninstallUsb
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public List<String> getOutUninstallUsb() {
        return outUninstallUsb;
    }

    public void setOutUninstallUsb(List<String> outUninstallUsb) {
        this.outUninstallUsb = outUninstallUsb;
    }

    public Vm outUninstallUsb_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_OUT_UNINSTALL_USB);
        return this;
    }

    public Vm outUninstallUsb_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_OUT_UNINSTALL_USB);
        return this;
    }

    public void setOutUninstallUsb_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_OUT_UNINSTALL_USB);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_OUT_UNINSTALL_USB);
        }
    }

    public boolean getOutUninstallUsb_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_OUT_UNINSTALL_USB);
    }

    public Vm pciNics(List<NestedNic> pciNics) {

        this.pciNics = pciNics;
        return this;
    }

    public Vm addPciNicsItem(NestedNic pciNicsItem) {
        if (this.pciNics == null) {
            this.pciNics = new ArrayList<NestedNic>();
        }
        this.pciNics.add(pciNicsItem);
        return this;
    }

    /**
     * Get pciNics
     *
     * @return pciNics
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedNic> getPciNics() {
        return pciNics;
    }

    public void setPciNics(List<NestedNic> pciNics) {
        this.pciNics = pciNics;
    }

    public Vm pciNics_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PCI_NICS);
        return this;
    }

    public Vm pciNics_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PCI_NICS);
        return this;
    }

    public void setPciNics_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PCI_NICS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PCI_NICS);
        }
    }

    public boolean getPciNics_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PCI_NICS);
    }

    public Vm _protected(Boolean _protected) {

        this._protected = _protected;
        return this;
    }

    /**
     * Get _protected
     *
     * @return _protected
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Boolean getProtected() {
        return _protected;
    }

    public void setProtected(Boolean _protected) {
        this._protected = _protected;
    }

    public Vm _protected_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PROTECTED);
        return this;
    }

    public Vm _protected_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PROTECTED);
        return this;
    }

    public void setProtected_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PROTECTED);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PROTECTED);
        }
    }

    public boolean getProtected_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PROTECTED);
    }

    public Vm provisionedSize(Long provisionedSize) {

        this.provisionedSize = provisionedSize;
        return this;
    }

    /**
     * Get provisionedSize
     *
     * @return provisionedSize
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getProvisionedSize() {
        return provisionedSize;
    }

    public void setProvisionedSize(Long provisionedSize) {
        this.provisionedSize = provisionedSize;
    }

    public Vm provisionedSize_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_SIZE);
        return this;
    }

    public Vm provisionedSize_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_SIZE);
        return this;
    }

    public void setProvisionedSize_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PROVISIONED_SIZE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PROVISIONED_SIZE);
        }
    }

    public boolean getProvisionedSize_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PROVISIONED_SIZE);
    }

    public Vm size(Long size) {

        this.size = size;
        return this;
    }

    /**
     * Get size
     *
     * @return size
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public Vm size_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIZE);
        return this;
    }

    public Vm size_ExplictlyNonNull() {
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

    public Vm snapshots(List<NestedVmSnapshot> snapshots) {

        this.snapshots = snapshots;
        return this;
    }

    public Vm addSnapshotsItem(NestedVmSnapshot snapshotsItem) {
        if (this.snapshots == null) {
            this.snapshots = new ArrayList<NestedVmSnapshot>();
        }
        this.snapshots.add(snapshotsItem);
        return this;
    }

    /**
     * Get snapshots
     *
     * @return snapshots
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedVmSnapshot> getSnapshots() {
        return snapshots;
    }

    public void setSnapshots(List<NestedVmSnapshot> snapshots) {
        this.snapshots = snapshots;
    }

    public Vm snapshots_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SNAPSHOTS);
        return this;
    }

    public Vm snapshots_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SNAPSHOTS);
        return this;
    }

    public void setSnapshots_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SNAPSHOTS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SNAPSHOTS);
        }
    }

    public boolean getSnapshots_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SNAPSHOTS);
    }

    public Vm status(VmStatus status) {

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
    public VmStatus getStatus() {
        return status;
    }

    public void setStatus(VmStatus status) {
        this.status = status;
    }

    public Vm status_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATUS);
        return this;
    }

    public Vm status_ExplictlyNonNull() {
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

    public Vm uniqueLogicalSize(Double uniqueLogicalSize) {

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

    public Vm uniqueLogicalSize_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UNIQUE_LOGICAL_SIZE);
        return this;
    }

    public Vm uniqueLogicalSize_ExplictlyNonNull() {
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

    public Vm uniqueSize(Long uniqueSize) {

        this.uniqueSize = uniqueSize;
        return this;
    }

    /**
     * Get uniqueSize
     *
     * @return uniqueSize
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getUniqueSize() {
        return uniqueSize;
    }

    public void setUniqueSize(Long uniqueSize) {
        this.uniqueSize = uniqueSize;
    }

    public Vm uniqueSize_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UNIQUE_SIZE);
        return this;
    }

    public Vm uniqueSize_ExplictlyNonNull() {
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

    public Vm usbDevices(List<NestedUsbDevice> usbDevices) {

        this.usbDevices = usbDevices;
        return this;
    }

    public Vm addUsbDevicesItem(NestedUsbDevice usbDevicesItem) {
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

    public Vm usbDevices_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USB_DEVICES);
        return this;
    }

    public Vm usbDevices_ExplictlyNonNull() {
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

    public Vm usedSize(Long usedSize) {

        this.usedSize = usedSize;
        return this;
    }

    /**
     * Get usedSize
     *
     * @return usedSize
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getUsedSize() {
        return usedSize;
    }

    public void setUsedSize(Long usedSize) {
        this.usedSize = usedSize;
    }

    public Vm usedSize_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USED_SIZE);
        return this;
    }

    public Vm usedSize_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USED_SIZE);
        return this;
    }

    public void setUsedSize_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USED_SIZE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USED_SIZE);
        }
    }

    public boolean getUsedSize_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USED_SIZE);
    }

    public Vm usedSizeUsage(Double usedSizeUsage) {

        this.usedSizeUsage = usedSizeUsage;
        return this;
    }

    /**
     * Get usedSizeUsage
     *
     * @return usedSizeUsage
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getUsedSizeUsage() {
        return usedSizeUsage;
    }

    public void setUsedSizeUsage(Double usedSizeUsage) {
        this.usedSizeUsage = usedSizeUsage;
    }

    public Vm usedSizeUsage_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USED_SIZE_USAGE);
        return this;
    }

    public Vm usedSizeUsage_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USED_SIZE_USAGE);
        return this;
    }

    public void setUsedSizeUsage_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USED_SIZE_USAGE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USED_SIZE_USAGE);
        }
    }

    public boolean getUsedSizeUsage_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USED_SIZE_USAGE);
    }

    public Vm vcpu(Integer vcpu) {

        this.vcpu = vcpu;
        return this;
    }

    /**
     * Get vcpu
     *
     * @return vcpu
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Integer getVcpu() {
        return vcpu;
    }

    public void setVcpu(Integer vcpu) {
        this.vcpu = vcpu;
    }

    public Vm vcpu_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VCPU);
        return this;
    }

    public Vm vcpu_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VCPU);
        return this;
    }

    public void setVcpu_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VCPU);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VCPU);
        }
    }

    public boolean getVcpu_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VCPU);
    }

    public Vm videoType(VmVideoType videoType) {

        this.videoType = videoType;
        return this;
    }

    /**
     * Get videoType
     *
     * @return videoType
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmVideoType getVideoType() {
        return videoType;
    }

    public void setVideoType(VmVideoType videoType) {
        this.videoType = videoType;
    }

    public Vm videoType_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VIDEO_TYPE);
        return this;
    }

    public Vm videoType_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VIDEO_TYPE);
        return this;
    }

    public void setVideoType_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VIDEO_TYPE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VIDEO_TYPE);
        }
    }

    public boolean getVideoType_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VIDEO_TYPE);
    }

    public Vm vmDisks(List<NestedVmDisk> vmDisks) {

        this.vmDisks = vmDisks;
        return this;
    }

    public Vm addVmDisksItem(NestedVmDisk vmDisksItem) {
        if (this.vmDisks == null) {
            this.vmDisks = new ArrayList<NestedVmDisk>();
        }
        this.vmDisks.add(vmDisksItem);
        return this;
    }

    /**
     * Get vmDisks
     *
     * @return vmDisks
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedVmDisk> getVmDisks() {
        return vmDisks;
    }

    public void setVmDisks(List<NestedVmDisk> vmDisks) {
        this.vmDisks = vmDisks;
    }

    public Vm vmDisks_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_DISKS);
        return this;
    }

    public Vm vmDisks_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_DISKS);
        return this;
    }

    public void setVmDisks_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_DISKS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_DISKS);
        }
    }

    public boolean getVmDisks_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_DISKS);
    }

    public Vm vmNics(List<NestedVmNic> vmNics) {

        this.vmNics = vmNics;
        return this;
    }

    public Vm addVmNicsItem(NestedVmNic vmNicsItem) {
        if (this.vmNics == null) {
            this.vmNics = new ArrayList<NestedVmNic>();
        }
        this.vmNics.add(vmNicsItem);
        return this;
    }

    /**
     * Get vmNics
     *
     * @return vmNics
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedVmNic> getVmNics() {
        return vmNics;
    }

    public void setVmNics(List<NestedVmNic> vmNics) {
        this.vmNics = vmNics;
    }

    public Vm vmNics_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_NICS);
        return this;
    }

    public Vm vmNics_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_NICS);
        return this;
    }

    public void setVmNics_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_NICS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_NICS);
        }
    }

    public boolean getVmNics_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_NICS);
    }

    public Vm vmPlacementGroup(List<NestedVmPlacementGroup> vmPlacementGroup) {

        this.vmPlacementGroup = vmPlacementGroup;
        return this;
    }

    public Vm addVmPlacementGroupItem(NestedVmPlacementGroup vmPlacementGroupItem) {
        if (this.vmPlacementGroup == null) {
            this.vmPlacementGroup = new ArrayList<NestedVmPlacementGroup>();
        }
        this.vmPlacementGroup.add(vmPlacementGroupItem);
        return this;
    }

    /**
     * Get vmPlacementGroup
     *
     * @return vmPlacementGroup
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedVmPlacementGroup> getVmPlacementGroup() {
        return vmPlacementGroup;
    }

    public void setVmPlacementGroup(List<NestedVmPlacementGroup> vmPlacementGroup) {
        this.vmPlacementGroup = vmPlacementGroup;
    }

    public Vm vmPlacementGroup_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_PLACEMENT_GROUP);
        return this;
    }

    public Vm vmPlacementGroup_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_PLACEMENT_GROUP);
        return this;
    }

    public void setVmPlacementGroup_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_PLACEMENT_GROUP);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_PLACEMENT_GROUP);
        }
    }

    public boolean getVmPlacementGroup_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_PLACEMENT_GROUP);
    }

    public Vm vmToolsStatus(VmToolsStatus vmToolsStatus) {

        this.vmToolsStatus = vmToolsStatus;
        return this;
    }

    /**
     * Get vmToolsStatus
     *
     * @return vmToolsStatus
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public VmToolsStatus getVmToolsStatus() {
        return vmToolsStatus;
    }

    public void setVmToolsStatus(VmToolsStatus vmToolsStatus) {
        this.vmToolsStatus = vmToolsStatus;
    }

    public Vm vmToolsStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_TOOLS_STATUS);
        return this;
    }

    public Vm vmToolsStatus_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_TOOLS_STATUS);
        return this;
    }

    public void setVmToolsStatus_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_TOOLS_STATUS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_TOOLS_STATUS);
        }
    }

    public boolean getVmToolsStatus_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_TOOLS_STATUS);
    }

    public Vm vmToolsVersion(String vmToolsVersion) {

        this.vmToolsVersion = vmToolsVersion;
        return this;
    }

    /**
     * Get vmToolsVersion
     *
     * @return vmToolsVersion
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVmToolsVersion() {
        return vmToolsVersion;
    }

    public void setVmToolsVersion(String vmToolsVersion) {
        this.vmToolsVersion = vmToolsVersion;
    }

    public Vm vmToolsVersion_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_TOOLS_VERSION);
        return this;
    }

    public Vm vmToolsVersion_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_TOOLS_VERSION);
        return this;
    }

    public void setVmToolsVersion_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_TOOLS_VERSION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_TOOLS_VERSION);
        }
    }

    public boolean getVmToolsVersion_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_TOOLS_VERSION);
    }

    public Vm vmUsage(VmUsage vmUsage) {

        this.vmUsage = vmUsage;
        return this;
    }

    /**
     * Get vmUsage
     *
     * @return vmUsage
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmUsage getVmUsage() {
        return vmUsage;
    }

    public void setVmUsage(VmUsage vmUsage) {
        this.vmUsage = vmUsage;
    }

    public Vm vmUsage_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_USAGE);
        return this;
    }

    public Vm vmUsage_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_USAGE);
        return this;
    }

    public void setVmUsage_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_USAGE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_USAGE);
        }
    }

    public boolean getVmUsage_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_USAGE);
    }

    public Vm winOpt(Boolean winOpt) {

        this.winOpt = winOpt;
        return this;
    }

    /**
     * Get winOpt
     *
     * @return winOpt
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Boolean getWinOpt() {
        return winOpt;
    }

    public void setWinOpt(Boolean winOpt) {
        this.winOpt = winOpt;
    }

    public Vm winOpt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WIN_OPT);
        return this;
    }

    public Vm winOpt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_WIN_OPT);
        return this;
    }

    public void setWinOpt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_WIN_OPT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_WIN_OPT);
        }
    }

    public boolean getWinOpt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_WIN_OPT);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Vm vm = (Vm) o;
        return Objects.equals(this.biosUuid, vm.biosUuid)
                && Objects.equals(this.clockOffset, vm.clockOffset)
                && Objects.equals(this.cloudInitSupported, vm.cloudInitSupported)
                && Objects.equals(this.cluster, vm.cluster)
                && Objects.equals(this.cpu, vm.cpu)
                && Objects.equals(this.cpuModel, vm.cpuModel)
                && Objects.equals(this.cpuUsage, vm.cpuUsage)
                && Objects.equals(this.deletedAt, vm.deletedAt)
                && Objects.equals(this.description, vm.description)
                && Objects.equals(this.dnsServers, vm.dnsServers)
                && Objects.equals(this.entityAsyncStatus, vm.entityAsyncStatus)
                && Objects.equals(this.firmware, vm.firmware)
                && Objects.equals(this.folder, vm.folder)
                && Objects.equals(this.gpuDevices, vm.gpuDevices)
                && Objects.equals(this.guestCpuModel, vm.guestCpuModel)
                && Objects.equals(this.guestOsType, vm.guestOsType)
                && Objects.equals(this.guestSizeUsage, vm.guestSizeUsage)
                && Objects.equals(this.guestUsedSize, vm.guestUsedSize)
                && Objects.equals(this.ha, vm.ha)
                && Objects.equals(this.haPriority, vm.haPriority)
                && Objects.equals(this.host, vm.host)
                && Objects.equals(this.hostname, vm.hostname)
                && Objects.equals(this.id, vm.id)
                && Objects.equals(this.inRecycleBin, vm.inRecycleBin)
                && Objects.equals(this.internal, vm.internal)
                && Objects.equals(this.ioPolicy, vm.ioPolicy)
                && Objects.equals(this.ips, vm.ips)
                && Objects.equals(this.isolationPolicy, vm.isolationPolicy)
                && Objects.equals(this.kernelInfo, vm.kernelInfo)
                && Objects.equals(this.labels, vm.labels)
                && Objects.equals(this.lastShutdownTime, vm.lastShutdownTime)
                && Objects.equals(this.localCreatedAt, vm.localCreatedAt)
                && Objects.equals(this.localId, vm.localId)
                && Objects.equals(this.logicalSizeBytes, vm.logicalSizeBytes)
                && Objects.equals(this.maxBandwidth, vm.maxBandwidth)
                && Objects.equals(this.maxBandwidthPolicy, vm.maxBandwidthPolicy)
                && Objects.equals(this.maxIops, vm.maxIops)
                && Objects.equals(this.maxIopsPolicy, vm.maxIopsPolicy)
                && Objects.equals(this.memory, vm.memory)
                && Objects.equals(this.memoryUsage, vm.memoryUsage)
                && Objects.equals(this.name, vm.name)
                && Objects.equals(this.nestedVirtualization, vm.nestedVirtualization)
                && Objects.equals(this.nodeIp, vm.nodeIp)
                && Objects.equals(this.originalName, vm.originalName)
                && Objects.equals(this.os, vm.os)
                && Objects.equals(this.outUninstallUsb, vm.outUninstallUsb)
                && Objects.equals(this.pciNics, vm.pciNics)
                && Objects.equals(this._protected, vm._protected)
                && Objects.equals(this.provisionedSize, vm.provisionedSize)
                && Objects.equals(this.size, vm.size)
                && Objects.equals(this.snapshots, vm.snapshots)
                && Objects.equals(this.status, vm.status)
                && Objects.equals(this.uniqueLogicalSize, vm.uniqueLogicalSize)
                && Objects.equals(this.uniqueSize, vm.uniqueSize)
                && Objects.equals(this.usbDevices, vm.usbDevices)
                && Objects.equals(this.usedSize, vm.usedSize)
                && Objects.equals(this.usedSizeUsage, vm.usedSizeUsage)
                && Objects.equals(this.vcpu, vm.vcpu)
                && Objects.equals(this.videoType, vm.videoType)
                && Objects.equals(this.vmDisks, vm.vmDisks)
                && Objects.equals(this.vmNics, vm.vmNics)
                && Objects.equals(this.vmPlacementGroup, vm.vmPlacementGroup)
                && Objects.equals(this.vmToolsStatus, vm.vmToolsStatus)
                && Objects.equals(this.vmToolsVersion, vm.vmToolsVersion)
                && Objects.equals(this.vmUsage, vm.vmUsage)
                && Objects.equals(this.winOpt, vm.winOpt);
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
                biosUuid,
                clockOffset,
                cloudInitSupported,
                cluster,
                cpu,
                cpuModel,
                cpuUsage,
                deletedAt,
                description,
                dnsServers,
                entityAsyncStatus,
                firmware,
                folder,
                gpuDevices,
                guestCpuModel,
                guestOsType,
                guestSizeUsage,
                guestUsedSize,
                ha,
                haPriority,
                host,
                hostname,
                id,
                inRecycleBin,
                internal,
                ioPolicy,
                ips,
                isolationPolicy,
                kernelInfo,
                labels,
                lastShutdownTime,
                localCreatedAt,
                localId,
                logicalSizeBytes,
                maxBandwidth,
                maxBandwidthPolicy,
                maxIops,
                maxIopsPolicy,
                memory,
                memoryUsage,
                name,
                nestedVirtualization,
                nodeIp,
                originalName,
                os,
                outUninstallUsb,
                pciNics,
                _protected,
                provisionedSize,
                size,
                snapshots,
                status,
                uniqueLogicalSize,
                uniqueSize,
                usbDevices,
                usedSize,
                usedSizeUsage,
                vcpu,
                videoType,
                vmDisks,
                vmNics,
                vmPlacementGroup,
                vmToolsStatus,
                vmToolsVersion,
                vmUsage,
                winOpt);
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
        sb.append("class Vm {\n");
        sb.append("    biosUuid: ").append(toIndentedString(biosUuid)).append("\n");
        sb.append("    clockOffset: ").append(toIndentedString(clockOffset)).append("\n");
        sb.append("    cloudInitSupported: ")
                .append(toIndentedString(cloudInitSupported))
                .append("\n");
        sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
        sb.append("    cpu: ").append(toIndentedString(cpu)).append("\n");
        sb.append("    cpuModel: ").append(toIndentedString(cpuModel)).append("\n");
        sb.append("    cpuUsage: ").append(toIndentedString(cpuUsage)).append("\n");
        sb.append("    deletedAt: ").append(toIndentedString(deletedAt)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    dnsServers: ").append(toIndentedString(dnsServers)).append("\n");
        sb.append("    entityAsyncStatus: ")
                .append(toIndentedString(entityAsyncStatus))
                .append("\n");
        sb.append("    firmware: ").append(toIndentedString(firmware)).append("\n");
        sb.append("    folder: ").append(toIndentedString(folder)).append("\n");
        sb.append("    gpuDevices: ").append(toIndentedString(gpuDevices)).append("\n");
        sb.append("    guestCpuModel: ").append(toIndentedString(guestCpuModel)).append("\n");
        sb.append("    guestOsType: ").append(toIndentedString(guestOsType)).append("\n");
        sb.append("    guestSizeUsage: ").append(toIndentedString(guestSizeUsage)).append("\n");
        sb.append("    guestUsedSize: ").append(toIndentedString(guestUsedSize)).append("\n");
        sb.append("    ha: ").append(toIndentedString(ha)).append("\n");
        sb.append("    haPriority: ").append(toIndentedString(haPriority)).append("\n");
        sb.append("    host: ").append(toIndentedString(host)).append("\n");
        sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    inRecycleBin: ").append(toIndentedString(inRecycleBin)).append("\n");
        sb.append("    internal: ").append(toIndentedString(internal)).append("\n");
        sb.append("    ioPolicy: ").append(toIndentedString(ioPolicy)).append("\n");
        sb.append("    ips: ").append(toIndentedString(ips)).append("\n");
        sb.append("    isolationPolicy: ").append(toIndentedString(isolationPolicy)).append("\n");
        sb.append("    kernelInfo: ").append(toIndentedString(kernelInfo)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    lastShutdownTime: ").append(toIndentedString(lastShutdownTime)).append("\n");
        sb.append("    localCreatedAt: ").append(toIndentedString(localCreatedAt)).append("\n");
        sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
        sb.append("    logicalSizeBytes: ").append(toIndentedString(logicalSizeBytes)).append("\n");
        sb.append("    maxBandwidth: ").append(toIndentedString(maxBandwidth)).append("\n");
        sb.append("    maxBandwidthPolicy: ")
                .append(toIndentedString(maxBandwidthPolicy))
                .append("\n");
        sb.append("    maxIops: ").append(toIndentedString(maxIops)).append("\n");
        sb.append("    maxIopsPolicy: ").append(toIndentedString(maxIopsPolicy)).append("\n");
        sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
        sb.append("    memoryUsage: ").append(toIndentedString(memoryUsage)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    nestedVirtualization: ")
                .append(toIndentedString(nestedVirtualization))
                .append("\n");
        sb.append("    nodeIp: ").append(toIndentedString(nodeIp)).append("\n");
        sb.append("    originalName: ").append(toIndentedString(originalName)).append("\n");
        sb.append("    os: ").append(toIndentedString(os)).append("\n");
        sb.append("    outUninstallUsb: ").append(toIndentedString(outUninstallUsb)).append("\n");
        sb.append("    pciNics: ").append(toIndentedString(pciNics)).append("\n");
        sb.append("    _protected: ").append(toIndentedString(_protected)).append("\n");
        sb.append("    provisionedSize: ").append(toIndentedString(provisionedSize)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    snapshots: ").append(toIndentedString(snapshots)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    uniqueLogicalSize: ")
                .append(toIndentedString(uniqueLogicalSize))
                .append("\n");
        sb.append("    uniqueSize: ").append(toIndentedString(uniqueSize)).append("\n");
        sb.append("    usbDevices: ").append(toIndentedString(usbDevices)).append("\n");
        sb.append("    usedSize: ").append(toIndentedString(usedSize)).append("\n");
        sb.append("    usedSizeUsage: ").append(toIndentedString(usedSizeUsage)).append("\n");
        sb.append("    vcpu: ").append(toIndentedString(vcpu)).append("\n");
        sb.append("    videoType: ").append(toIndentedString(videoType)).append("\n");
        sb.append("    vmDisks: ").append(toIndentedString(vmDisks)).append("\n");
        sb.append("    vmNics: ").append(toIndentedString(vmNics)).append("\n");
        sb.append("    vmPlacementGroup: ").append(toIndentedString(vmPlacementGroup)).append("\n");
        sb.append("    vmToolsStatus: ").append(toIndentedString(vmToolsStatus)).append("\n");
        sb.append("    vmToolsVersion: ").append(toIndentedString(vmToolsVersion)).append("\n");
        sb.append("    vmUsage: ").append(toIndentedString(vmUsage)).append("\n");
        sb.append("    winOpt: ").append(toIndentedString(winOpt)).append("\n");
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

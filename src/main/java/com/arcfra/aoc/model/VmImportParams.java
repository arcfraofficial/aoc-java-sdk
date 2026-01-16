package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** VmImportParams */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VmImportParams extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_MAX_BANDWIDTH_POLICY = "max_bandwidth_policy";

    @SerializedName(SERIALIZED_NAME_MAX_BANDWIDTH_POLICY)
    private VmDiskIoRestrictType maxBandwidthPolicy;

    public static final String SERIALIZED_NAME_MAX_BANDWIDTH_UNIT = "max_bandwidth_unit";

    @SerializedName(SERIALIZED_NAME_MAX_BANDWIDTH_UNIT)
    private BPSUnit maxBandwidthUnit;

    public static final String SERIALIZED_NAME_MAX_BANDWIDTH = "max_bandwidth";

    @SerializedName(SERIALIZED_NAME_MAX_BANDWIDTH)
    private Long maxBandwidth;

    public static final String SERIALIZED_NAME_MAX_IOPS_POLICY = "max_iops_policy";

    @SerializedName(SERIALIZED_NAME_MAX_IOPS_POLICY)
    private VmDiskIoRestrictType maxIopsPolicy;

    public static final String SERIALIZED_NAME_MAX_IOPS = "max_iops";

    @SerializedName(SERIALIZED_NAME_MAX_IOPS)
    private Long maxIops;

    public static final String SERIALIZED_NAME_IO_POLICY = "io_policy";

    @SerializedName(SERIALIZED_NAME_IO_POLICY)
    private VmDiskIoPolicy ioPolicy;

    public static final String SERIALIZED_NAME_VCPU = "vcpu";

    @SerializedName(SERIALIZED_NAME_VCPU)
    private Integer vcpu;

    public static final String SERIALIZED_NAME_STATUS = "status";

    @SerializedName(SERIALIZED_NAME_STATUS)
    private VmStatus status;

    public static final String SERIALIZED_NAME_HA = "ha";

    @SerializedName(SERIALIZED_NAME_HA)
    private Boolean ha;

    public static final String SERIALIZED_NAME_VM_NICS = "vm_nics";

    @SerializedName(SERIALIZED_NAME_VM_NICS)
    private List<VmImportNicParams> vmNics = null;

    public static final String SERIALIZED_NAME_DISK_OPERATE = "disk_operate";

    @SerializedName(SERIALIZED_NAME_DISK_OPERATE)
    private OvfDiskOperate diskOperate;

    public static final String SERIALIZED_NAME_MEMORY_UNIT = "memory_unit";

    @SerializedName(SERIALIZED_NAME_MEMORY_UNIT)
    private ByteUnit memoryUnit;

    public static final String SERIALIZED_NAME_MEMORY = "memory";

    @SerializedName(SERIALIZED_NAME_MEMORY)
    private Long memory;

    public static final String SERIALIZED_NAME_CPU_CORES = "cpu_cores";

    @SerializedName(SERIALIZED_NAME_CPU_CORES)
    private Integer cpuCores;

    public static final String SERIALIZED_NAME_CPU_SOCKETS = "cpu_sockets";

    @SerializedName(SERIALIZED_NAME_CPU_SOCKETS)
    private Integer cpuSockets;

    public static final String SERIALIZED_NAME_GUEST_OS_TYPE = "guest_os_type";

    @SerializedName(SERIALIZED_NAME_GUEST_OS_TYPE)
    private VmGuestsOperationSystem guestOsType;

    public static final String SERIALIZED_NAME_FOLDER_ID = "folder_id";

    @SerializedName(SERIALIZED_NAME_FOLDER_ID)
    private String folderId;

    public static final String SERIALIZED_NAME_DESCRIPTION = "description";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION)
    private String description;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_HOST_ID = "host_id";

    @SerializedName(SERIALIZED_NAME_HOST_ID)
    private String hostId;

    public static final String SERIALIZED_NAME_CLUSTER_ID = "cluster_id";

    @SerializedName(SERIALIZED_NAME_CLUSTER_ID)
    private String clusterId;

    public static final String SERIALIZED_NAME_UPLOAD_TASKS = "upload_tasks";

    @SerializedName(SERIALIZED_NAME_UPLOAD_TASKS)
    private List<String> uploadTasks = new ArrayList<String>();

    public static final String SERIALIZED_NAME_OWNER_ID = "owner_id";

    @SerializedName(SERIALIZED_NAME_OWNER_ID)
    private String ownerId;

    public static final String SERIALIZED_NAME_PARSED_OVF = "parsed_ovf";

    @SerializedName(SERIALIZED_NAME_PARSED_OVF)
    private ParsedOVF parsedOvf;

    public VmImportParams() {}

    public VmImportParams maxBandwidthPolicy(VmDiskIoRestrictType maxBandwidthPolicy) {

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

    public VmImportParams maxBandwidthPolicy_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_BANDWIDTH_POLICY);
        return this;
    }

    public VmImportParams maxBandwidthPolicy_ExplictlyNonNull() {
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

    public VmImportParams maxBandwidthUnit(BPSUnit maxBandwidthUnit) {

        this.maxBandwidthUnit = maxBandwidthUnit;
        return this;
    }

    /**
     * Get maxBandwidthUnit
     *
     * @return maxBandwidthUnit
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public BPSUnit getMaxBandwidthUnit() {
        return maxBandwidthUnit;
    }

    public void setMaxBandwidthUnit(BPSUnit maxBandwidthUnit) {
        this.maxBandwidthUnit = maxBandwidthUnit;
    }

    public VmImportParams maxBandwidthUnit_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_BANDWIDTH_UNIT);
        return this;
    }

    public VmImportParams maxBandwidthUnit_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_BANDWIDTH_UNIT);
        return this;
    }

    public void setMaxBandwidthUnit_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_BANDWIDTH_UNIT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_BANDWIDTH_UNIT);
        }
    }

    public boolean getMaxBandwidthUnit_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_BANDWIDTH_UNIT);
    }

    public VmImportParams maxBandwidth(Long maxBandwidth) {

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

    public VmImportParams maxBandwidth_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_BANDWIDTH);
        return this;
    }

    public VmImportParams maxBandwidth_ExplictlyNonNull() {
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

    public VmImportParams maxIopsPolicy(VmDiskIoRestrictType maxIopsPolicy) {

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

    public VmImportParams maxIopsPolicy_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_IOPS_POLICY);
        return this;
    }

    public VmImportParams maxIopsPolicy_ExplictlyNonNull() {
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

    public VmImportParams maxIops(Long maxIops) {

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
    public Long getMaxIops() {
        return maxIops;
    }

    public void setMaxIops(Long maxIops) {
        this.maxIops = maxIops;
    }

    public VmImportParams maxIops_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_IOPS);
        return this;
    }

    public VmImportParams maxIops_ExplictlyNonNull() {
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

    public VmImportParams ioPolicy(VmDiskIoPolicy ioPolicy) {

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

    public VmImportParams ioPolicy_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IO_POLICY);
        return this;
    }

    public VmImportParams ioPolicy_ExplictlyNonNull() {
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

    public VmImportParams vcpu(Integer vcpu) {

        this.vcpu = vcpu;
        return this;
    }

    /**
     * Get vcpu
     *
     * @return vcpu
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getVcpu() {
        return vcpu;
    }

    public void setVcpu(Integer vcpu) {
        this.vcpu = vcpu;
    }

    public VmImportParams vcpu_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VCPU);
        return this;
    }

    public VmImportParams vcpu_ExplictlyNonNull() {
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

    public VmImportParams status(VmStatus status) {

        this.status = status;
        return this;
    }

    /**
     * Get status
     *
     * @return status
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmStatus getStatus() {
        return status;
    }

    public void setStatus(VmStatus status) {
        this.status = status;
    }

    public VmImportParams status_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATUS);
        return this;
    }

    public VmImportParams status_ExplictlyNonNull() {
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

    public VmImportParams ha(Boolean ha) {

        this.ha = ha;
        return this;
    }

    /**
     * Get ha
     *
     * @return ha
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getHa() {
        return ha;
    }

    public void setHa(Boolean ha) {
        this.ha = ha;
    }

    public VmImportParams ha_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HA);
        return this;
    }

    public VmImportParams ha_ExplictlyNonNull() {
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

    public VmImportParams vmNics(List<VmImportNicParams> vmNics) {

        this.vmNics = vmNics;
        return this;
    }

    public VmImportParams addVmNicsItem(VmImportNicParams vmNicsItem) {
        if (this.vmNics == null) {
            this.vmNics = new ArrayList<VmImportNicParams>();
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
    public List<VmImportNicParams> getVmNics() {
        return vmNics;
    }

    public void setVmNics(List<VmImportNicParams> vmNics) {
        this.vmNics = vmNics;
    }

    public VmImportParams vmNics_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_NICS);
        return this;
    }

    public VmImportParams vmNics_ExplictlyNonNull() {
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

    public VmImportParams diskOperate(OvfDiskOperate diskOperate) {

        this.diskOperate = diskOperate;
        return this;
    }

    /**
     * Get diskOperate
     *
     * @return diskOperate
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public OvfDiskOperate getDiskOperate() {
        return diskOperate;
    }

    public void setDiskOperate(OvfDiskOperate diskOperate) {
        this.diskOperate = diskOperate;
    }

    public VmImportParams diskOperate_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISK_OPERATE);
        return this;
    }

    public VmImportParams diskOperate_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DISK_OPERATE);
        return this;
    }

    public void setDiskOperate_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DISK_OPERATE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DISK_OPERATE);
        }
    }

    public boolean getDiskOperate_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DISK_OPERATE);
    }

    public VmImportParams memoryUnit(ByteUnit memoryUnit) {

        this.memoryUnit = memoryUnit;
        return this;
    }

    /**
     * Get memoryUnit
     *
     * @return memoryUnit
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ByteUnit getMemoryUnit() {
        return memoryUnit;
    }

    public void setMemoryUnit(ByteUnit memoryUnit) {
        this.memoryUnit = memoryUnit;
    }

    public VmImportParams memoryUnit_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MEMORY_UNIT);
        return this;
    }

    public VmImportParams memoryUnit_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MEMORY_UNIT);
        return this;
    }

    public void setMemoryUnit_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MEMORY_UNIT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MEMORY_UNIT);
        }
    }

    public boolean getMemoryUnit_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MEMORY_UNIT);
    }

    public VmImportParams memory(Long memory) {

        this.memory = memory;
        return this;
    }

    /**
     * Get memory
     *
     * @return memory
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getMemory() {
        return memory;
    }

    public void setMemory(Long memory) {
        this.memory = memory;
    }

    public VmImportParams memory_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MEMORY);
        return this;
    }

    public VmImportParams memory_ExplictlyNonNull() {
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

    public VmImportParams cpuCores(Integer cpuCores) {

        this.cpuCores = cpuCores;
        return this;
    }

    /**
     * Get cpuCores
     *
     * @return cpuCores
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getCpuCores() {
        return cpuCores;
    }

    public void setCpuCores(Integer cpuCores) {
        this.cpuCores = cpuCores;
    }

    public VmImportParams cpuCores_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CPU_CORES);
        return this;
    }

    public VmImportParams cpuCores_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CPU_CORES);
        return this;
    }

    public void setCpuCores_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CPU_CORES);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CPU_CORES);
        }
    }

    public boolean getCpuCores_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CPU_CORES);
    }

    public VmImportParams cpuSockets(Integer cpuSockets) {

        this.cpuSockets = cpuSockets;
        return this;
    }

    /**
     * Get cpuSockets
     *
     * @return cpuSockets
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getCpuSockets() {
        return cpuSockets;
    }

    public void setCpuSockets(Integer cpuSockets) {
        this.cpuSockets = cpuSockets;
    }

    public VmImportParams cpuSockets_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CPU_SOCKETS);
        return this;
    }

    public VmImportParams cpuSockets_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CPU_SOCKETS);
        return this;
    }

    public void setCpuSockets_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CPU_SOCKETS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CPU_SOCKETS);
        }
    }

    public boolean getCpuSockets_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CPU_SOCKETS);
    }

    public VmImportParams guestOsType(VmGuestsOperationSystem guestOsType) {

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

    public VmImportParams guestOsType_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_GUEST_OS_TYPE);
        return this;
    }

    public VmImportParams guestOsType_ExplictlyNonNull() {
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

    public VmImportParams folderId(String folderId) {

        this.folderId = folderId;
        return this;
    }

    /**
     * Get folderId
     *
     * @return folderId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getFolderId() {
        return folderId;
    }

    public void setFolderId(String folderId) {
        this.folderId = folderId;
    }

    public VmImportParams folderId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FOLDER_ID);
        return this;
    }

    public VmImportParams folderId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FOLDER_ID);
        return this;
    }

    public void setFolderId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FOLDER_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FOLDER_ID);
        }
    }

    public boolean getFolderId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FOLDER_ID);
    }

    public VmImportParams description(String description) {

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

    public VmImportParams description_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION);
        return this;
    }

    public VmImportParams description_ExplictlyNonNull() {
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

    public VmImportParams name(String name) {

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

    public VmImportParams name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public VmImportParams name_ExplictlyNonNull() {
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

    public VmImportParams hostId(String hostId) {

        this.hostId = hostId;
        return this;
    }

    /**
     * Get hostId
     *
     * @return hostId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getHostId() {
        return hostId;
    }

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    public VmImportParams hostId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOST_ID);
        return this;
    }

    public VmImportParams hostId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HOST_ID);
        return this;
    }

    public void setHostId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HOST_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HOST_ID);
        }
    }

    public boolean getHostId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HOST_ID);
    }

    public VmImportParams clusterId(String clusterId) {

        this.clusterId = clusterId;
        return this;
    }

    /**
     * Get clusterId
     *
     * @return clusterId
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public VmImportParams clusterId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER_ID);
        return this;
    }

    public VmImportParams clusterId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_ID);
        return this;
    }

    public void setClusterId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLUSTER_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_ID);
        }
    }

    public boolean getClusterId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLUSTER_ID);
    }

    public VmImportParams uploadTasks(List<String> uploadTasks) {

        this.uploadTasks = uploadTasks;
        return this;
    }

    public VmImportParams addUploadTasksItem(String uploadTasksItem) {
        this.uploadTasks.add(uploadTasksItem);
        return this;
    }

    /**
     * Get uploadTasks
     *
     * @return uploadTasks
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public List<String> getUploadTasks() {
        return uploadTasks;
    }

    public void setUploadTasks(List<String> uploadTasks) {
        this.uploadTasks = uploadTasks;
    }

    public VmImportParams uploadTasks_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPLOAD_TASKS);
        return this;
    }

    public VmImportParams uploadTasks_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UPLOAD_TASKS);
        return this;
    }

    public void setUploadTasks_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UPLOAD_TASKS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UPLOAD_TASKS);
        }
    }

    public boolean getUploadTasks_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UPLOAD_TASKS);
    }

    public VmImportParams ownerId(String ownerId) {

        this.ownerId = ownerId;
        return this;
    }

    /**
     * Get ownerId
     *
     * @return ownerId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public VmImportParams ownerId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_OWNER_ID);
        return this;
    }

    public VmImportParams ownerId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_OWNER_ID);
        return this;
    }

    public void setOwnerId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_OWNER_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_OWNER_ID);
        }
    }

    public boolean getOwnerId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_OWNER_ID);
    }

    public VmImportParams parsedOvf(ParsedOVF parsedOvf) {

        this.parsedOvf = parsedOvf;
        return this;
    }

    /**
     * Get parsedOvf
     *
     * @return parsedOvf
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public ParsedOVF getParsedOvf() {
        return parsedOvf;
    }

    public void setParsedOvf(ParsedOVF parsedOvf) {
        this.parsedOvf = parsedOvf;
    }

    public VmImportParams parsedOvf_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PARSED_OVF);
        return this;
    }

    public VmImportParams parsedOvf_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PARSED_OVF);
        return this;
    }

    public void setParsedOvf_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PARSED_OVF);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PARSED_OVF);
        }
    }

    public boolean getParsedOvf_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PARSED_OVF);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VmImportParams vmImportParams = (VmImportParams) o;
        return Objects.equals(this.maxBandwidthPolicy, vmImportParams.maxBandwidthPolicy)
                && Objects.equals(this.maxBandwidthUnit, vmImportParams.maxBandwidthUnit)
                && Objects.equals(this.maxBandwidth, vmImportParams.maxBandwidth)
                && Objects.equals(this.maxIopsPolicy, vmImportParams.maxIopsPolicy)
                && Objects.equals(this.maxIops, vmImportParams.maxIops)
                && Objects.equals(this.ioPolicy, vmImportParams.ioPolicy)
                && Objects.equals(this.vcpu, vmImportParams.vcpu)
                && Objects.equals(this.status, vmImportParams.status)
                && Objects.equals(this.ha, vmImportParams.ha)
                && Objects.equals(this.vmNics, vmImportParams.vmNics)
                && Objects.equals(this.diskOperate, vmImportParams.diskOperate)
                && Objects.equals(this.memoryUnit, vmImportParams.memoryUnit)
                && Objects.equals(this.memory, vmImportParams.memory)
                && Objects.equals(this.cpuCores, vmImportParams.cpuCores)
                && Objects.equals(this.cpuSockets, vmImportParams.cpuSockets)
                && Objects.equals(this.guestOsType, vmImportParams.guestOsType)
                && Objects.equals(this.folderId, vmImportParams.folderId)
                && Objects.equals(this.description, vmImportParams.description)
                && Objects.equals(this.name, vmImportParams.name)
                && Objects.equals(this.hostId, vmImportParams.hostId)
                && Objects.equals(this.clusterId, vmImportParams.clusterId)
                && Objects.equals(this.uploadTasks, vmImportParams.uploadTasks)
                && Objects.equals(this.ownerId, vmImportParams.ownerId)
                && Objects.equals(this.parsedOvf, vmImportParams.parsedOvf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                maxBandwidthPolicy,
                maxBandwidthUnit,
                maxBandwidth,
                maxIopsPolicy,
                maxIops,
                ioPolicy,
                vcpu,
                status,
                ha,
                vmNics,
                diskOperate,
                memoryUnit,
                memory,
                cpuCores,
                cpuSockets,
                guestOsType,
                folderId,
                description,
                name,
                hostId,
                clusterId,
                uploadTasks,
                ownerId,
                parsedOvf);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VmImportParams {\n");
        sb.append("    maxBandwidthPolicy: ")
                .append(toIndentedString(maxBandwidthPolicy))
                .append("\n");
        sb.append("    maxBandwidthUnit: ").append(toIndentedString(maxBandwidthUnit)).append("\n");
        sb.append("    maxBandwidth: ").append(toIndentedString(maxBandwidth)).append("\n");
        sb.append("    maxIopsPolicy: ").append(toIndentedString(maxIopsPolicy)).append("\n");
        sb.append("    maxIops: ").append(toIndentedString(maxIops)).append("\n");
        sb.append("    ioPolicy: ").append(toIndentedString(ioPolicy)).append("\n");
        sb.append("    vcpu: ").append(toIndentedString(vcpu)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    ha: ").append(toIndentedString(ha)).append("\n");
        sb.append("    vmNics: ").append(toIndentedString(vmNics)).append("\n");
        sb.append("    diskOperate: ").append(toIndentedString(diskOperate)).append("\n");
        sb.append("    memoryUnit: ").append(toIndentedString(memoryUnit)).append("\n");
        sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
        sb.append("    cpuCores: ").append(toIndentedString(cpuCores)).append("\n");
        sb.append("    cpuSockets: ").append(toIndentedString(cpuSockets)).append("\n");
        sb.append("    guestOsType: ").append(toIndentedString(guestOsType)).append("\n");
        sb.append("    folderId: ").append(toIndentedString(folderId)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    uploadTasks: ").append(toIndentedString(uploadTasks)).append("\n");
        sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
        sb.append("    parsedOvf: ").append(toIndentedString(parsedOvf)).append("\n");
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

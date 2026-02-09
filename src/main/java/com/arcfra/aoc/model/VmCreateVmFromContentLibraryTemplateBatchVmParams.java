package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** VmCreateVmFromContentLibraryTemplateBatchVmParams */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VmCreateVmFromContentLibraryTemplateBatchVmParams
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_OWNER = "owner";

    @SerializedName(SERIALIZED_NAME_OWNER)
    private VmOwnerParams owner;

    public static final String SERIALIZED_NAME_GPU_DEVICES = "gpu_devices";

    @SerializedName(SERIALIZED_NAME_GPU_DEVICES)
    private List<VmGpuOperationParams> gpuDevices = null;

    public static final String SERIALIZED_NAME_CLOUD_INIT = "cloud_init";

    @SerializedName(SERIALIZED_NAME_CLOUD_INIT)
    private TemplateCloudInit cloudInit;

    public static final String SERIALIZED_NAME_IS_FULL_COPY = "is_full_copy";

    @SerializedName(SERIALIZED_NAME_IS_FULL_COPY)
    private Boolean isFullCopy;

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

    public static final String SERIALIZED_NAME_VCPU = "vcpu";

    @SerializedName(SERIALIZED_NAME_VCPU)
    private Integer vcpu;

    public static final String SERIALIZED_NAME_STATUS = "status";

    @SerializedName(SERIALIZED_NAME_STATUS)
    private VmStatus status;

    public static final String SERIALIZED_NAME_FIRMWARE = "firmware";

    @SerializedName(SERIALIZED_NAME_FIRMWARE)
    private VmFirmware firmware;

    public static final String SERIALIZED_NAME_HA_PRIORITY = "ha_priority";

    @SerializedName(SERIALIZED_NAME_HA_PRIORITY)
    private VmHaPriority haPriority;

    public static final String SERIALIZED_NAME_HA = "ha";

    @SerializedName(SERIALIZED_NAME_HA)
    private Boolean ha;

    public static final String SERIALIZED_NAME_PCI_NICS = "pci_nics";

    @SerializedName(SERIALIZED_NAME_PCI_NICS)
    private NicWhereInput pciNics;

    public static final String SERIALIZED_NAME_VM_PLACEMENT_GROUP = "vm_placement_group";

    @SerializedName(SERIALIZED_NAME_VM_PLACEMENT_GROUP)
    private VmPlacementGroupWhereInput vmPlacementGroup;

    public static final String SERIALIZED_NAME_VM_NICS = "vm_nics";

    @SerializedName(SERIALIZED_NAME_VM_NICS)
    private List<VmNicParams> vmNics = null;

    public static final String SERIALIZED_NAME_DISK_OPERATE = "disk_operate";

    @SerializedName(SERIALIZED_NAME_DISK_OPERATE)
    private VmDiskOperate diskOperate;

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

    public VmCreateVmFromContentLibraryTemplateBatchVmParams() {}

    public VmCreateVmFromContentLibraryTemplateBatchVmParams owner(VmOwnerParams owner) {

        this.owner = owner;
        return this;
    }

    /**
     * Get owner
     *
     * @return owner
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmOwnerParams getOwner() {
        return owner;
    }

    public void setOwner(VmOwnerParams owner) {
        this.owner = owner;
    }

    public VmCreateVmFromContentLibraryTemplateBatchVmParams owner_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_OWNER);
        return this;
    }

    public VmCreateVmFromContentLibraryTemplateBatchVmParams owner_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_OWNER);
        return this;
    }

    public void setOwner_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_OWNER);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_OWNER);
        }
    }

    public boolean getOwner_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_OWNER);
    }

    public VmCreateVmFromContentLibraryTemplateBatchVmParams gpuDevices(
            List<VmGpuOperationParams> gpuDevices) {

        this.gpuDevices = gpuDevices;
        return this;
    }

    public VmCreateVmFromContentLibraryTemplateBatchVmParams addGpuDevicesItem(
            VmGpuOperationParams gpuDevicesItem) {
        if (this.gpuDevices == null) {
            this.gpuDevices = new ArrayList<VmGpuOperationParams>();
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
    public List<VmGpuOperationParams> getGpuDevices() {
        return gpuDevices;
    }

    public void setGpuDevices(List<VmGpuOperationParams> gpuDevices) {
        this.gpuDevices = gpuDevices;
    }

    public VmCreateVmFromContentLibraryTemplateBatchVmParams gpuDevices_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_GPU_DEVICES);
        return this;
    }

    public VmCreateVmFromContentLibraryTemplateBatchVmParams gpuDevices_ExplictlyNonNull() {
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

    public VmCreateVmFromContentLibraryTemplateBatchVmParams cloudInit(
            TemplateCloudInit cloudInit) {

        this.cloudInit = cloudInit;
        return this;
    }

    /**
     * Get cloudInit
     *
     * @return cloudInit
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public TemplateCloudInit getCloudInit() {
        return cloudInit;
    }

    public void setCloudInit(TemplateCloudInit cloudInit) {
        this.cloudInit = cloudInit;
    }

    public VmCreateVmFromContentLibraryTemplateBatchVmParams cloudInit_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLOUD_INIT);
        return this;
    }

    public VmCreateVmFromContentLibraryTemplateBatchVmParams cloudInit_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLOUD_INIT);
        return this;
    }

    public void setCloudInit_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLOUD_INIT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLOUD_INIT);
        }
    }

    public boolean getCloudInit_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLOUD_INIT);
    }

    public VmCreateVmFromContentLibraryTemplateBatchVmParams isFullCopy(Boolean isFullCopy) {

        this.isFullCopy = isFullCopy;
        return this;
    }

    /**
     * Get isFullCopy
     *
     * @return isFullCopy
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Boolean getIsFullCopy() {
        return isFullCopy;
    }

    public void setIsFullCopy(Boolean isFullCopy) {
        this.isFullCopy = isFullCopy;
    }

    public VmCreateVmFromContentLibraryTemplateBatchVmParams isFullCopy_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IS_FULL_COPY);
        return this;
    }

    public VmCreateVmFromContentLibraryTemplateBatchVmParams isFullCopy_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IS_FULL_COPY);
        return this;
    }

    public void setIsFullCopy_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IS_FULL_COPY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IS_FULL_COPY);
        }
    }

    public boolean getIsFullCopy_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IS_FULL_COPY);
    }

    public VmCreateVmFromContentLibraryTemplateBatchVmParams maxBandwidthPolicy(
            VmDiskIoRestrictType maxBandwidthPolicy) {

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

    public VmCreateVmFromContentLibraryTemplateBatchVmParams maxBandwidthPolicy_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_BANDWIDTH_POLICY);
        return this;
    }

    public VmCreateVmFromContentLibraryTemplateBatchVmParams maxBandwidthPolicy_ExplictlyNonNull() {
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

    public VmCreateVmFromContentLibraryTemplateBatchVmParams maxBandwidthUnit(
            BPSUnit maxBandwidthUnit) {

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

    public VmCreateVmFromContentLibraryTemplateBatchVmParams maxBandwidthUnit_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_BANDWIDTH_UNIT);
        return this;
    }

    public VmCreateVmFromContentLibraryTemplateBatchVmParams maxBandwidthUnit_ExplictlyNonNull() {
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

    public VmCreateVmFromContentLibraryTemplateBatchVmParams maxBandwidth(Long maxBandwidth) {

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

    public VmCreateVmFromContentLibraryTemplateBatchVmParams maxBandwidth_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_BANDWIDTH);
        return this;
    }

    public VmCreateVmFromContentLibraryTemplateBatchVmParams maxBandwidth_ExplictlyNonNull() {
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

    public VmCreateVmFromContentLibraryTemplateBatchVmParams maxIopsPolicy(
            VmDiskIoRestrictType maxIopsPolicy) {

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

    public VmCreateVmFromContentLibraryTemplateBatchVmParams maxIopsPolicy_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_IOPS_POLICY);
        return this;
    }

    public VmCreateVmFromContentLibraryTemplateBatchVmParams maxIopsPolicy_ExplictlyNonNull() {
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

    public VmCreateVmFromContentLibraryTemplateBatchVmParams maxIops(Long maxIops) {

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

    public VmCreateVmFromContentLibraryTemplateBatchVmParams maxIops_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_IOPS);
        return this;
    }

    public VmCreateVmFromContentLibraryTemplateBatchVmParams maxIops_ExplictlyNonNull() {
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

    public VmCreateVmFromContentLibraryTemplateBatchVmParams vcpu(Integer vcpu) {

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

    public VmCreateVmFromContentLibraryTemplateBatchVmParams vcpu_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VCPU);
        return this;
    }

    public VmCreateVmFromContentLibraryTemplateBatchVmParams vcpu_ExplictlyNonNull() {
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

    public VmCreateVmFromContentLibraryTemplateBatchVmParams status(VmStatus status) {

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

    public VmCreateVmFromContentLibraryTemplateBatchVmParams status_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATUS);
        return this;
    }

    public VmCreateVmFromContentLibraryTemplateBatchVmParams status_ExplictlyNonNull() {
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

    public VmCreateVmFromContentLibraryTemplateBatchVmParams firmware(VmFirmware firmware) {

        this.firmware = firmware;
        return this;
    }

    /**
     * Get firmware
     *
     * @return firmware
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmFirmware getFirmware() {
        return firmware;
    }

    public void setFirmware(VmFirmware firmware) {
        this.firmware = firmware;
    }

    public VmCreateVmFromContentLibraryTemplateBatchVmParams firmware_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FIRMWARE);
        return this;
    }

    public VmCreateVmFromContentLibraryTemplateBatchVmParams firmware_ExplictlyNonNull() {
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

    public VmCreateVmFromContentLibraryTemplateBatchVmParams haPriority(VmHaPriority haPriority) {

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

    public VmCreateVmFromContentLibraryTemplateBatchVmParams haPriority_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HA_PRIORITY);
        return this;
    }

    public VmCreateVmFromContentLibraryTemplateBatchVmParams haPriority_ExplictlyNonNull() {
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

    public VmCreateVmFromContentLibraryTemplateBatchVmParams ha(Boolean ha) {

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

    public VmCreateVmFromContentLibraryTemplateBatchVmParams ha_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HA);
        return this;
    }

    public VmCreateVmFromContentLibraryTemplateBatchVmParams ha_ExplictlyNonNull() {
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

    public VmCreateVmFromContentLibraryTemplateBatchVmParams pciNics(NicWhereInput pciNics) {

        this.pciNics = pciNics;
        return this;
    }

    /**
     * Get pciNics
     *
     * @return pciNics
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NicWhereInput getPciNics() {
        return pciNics;
    }

    public void setPciNics(NicWhereInput pciNics) {
        this.pciNics = pciNics;
    }

    public VmCreateVmFromContentLibraryTemplateBatchVmParams pciNics_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PCI_NICS);
        return this;
    }

    public VmCreateVmFromContentLibraryTemplateBatchVmParams pciNics_ExplictlyNonNull() {
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

    public VmCreateVmFromContentLibraryTemplateBatchVmParams vmPlacementGroup(
            VmPlacementGroupWhereInput vmPlacementGroup) {

        this.vmPlacementGroup = vmPlacementGroup;
        return this;
    }

    /**
     * Get vmPlacementGroup
     *
     * @return vmPlacementGroup
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmPlacementGroupWhereInput getVmPlacementGroup() {
        return vmPlacementGroup;
    }

    public void setVmPlacementGroup(VmPlacementGroupWhereInput vmPlacementGroup) {
        this.vmPlacementGroup = vmPlacementGroup;
    }

    public VmCreateVmFromContentLibraryTemplateBatchVmParams vmPlacementGroup_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_PLACEMENT_GROUP);
        return this;
    }

    public VmCreateVmFromContentLibraryTemplateBatchVmParams vmPlacementGroup_ExplictlyNonNull() {
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

    public VmCreateVmFromContentLibraryTemplateBatchVmParams vmNics(List<VmNicParams> vmNics) {

        this.vmNics = vmNics;
        return this;
    }

    public VmCreateVmFromContentLibraryTemplateBatchVmParams addVmNicsItem(VmNicParams vmNicsItem) {
        if (this.vmNics == null) {
            this.vmNics = new ArrayList<VmNicParams>();
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
    public List<VmNicParams> getVmNics() {
        return vmNics;
    }

    public void setVmNics(List<VmNicParams> vmNics) {
        this.vmNics = vmNics;
    }

    public VmCreateVmFromContentLibraryTemplateBatchVmParams vmNics_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_NICS);
        return this;
    }

    public VmCreateVmFromContentLibraryTemplateBatchVmParams vmNics_ExplictlyNonNull() {
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

    public VmCreateVmFromContentLibraryTemplateBatchVmParams diskOperate(
            VmDiskOperate diskOperate) {

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
    public VmDiskOperate getDiskOperate() {
        return diskOperate;
    }

    public void setDiskOperate(VmDiskOperate diskOperate) {
        this.diskOperate = diskOperate;
    }

    public VmCreateVmFromContentLibraryTemplateBatchVmParams diskOperate_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISK_OPERATE);
        return this;
    }

    public VmCreateVmFromContentLibraryTemplateBatchVmParams diskOperate_ExplictlyNonNull() {
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

    public VmCreateVmFromContentLibraryTemplateBatchVmParams memoryUnit(ByteUnit memoryUnit) {

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

    public VmCreateVmFromContentLibraryTemplateBatchVmParams memoryUnit_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MEMORY_UNIT);
        return this;
    }

    public VmCreateVmFromContentLibraryTemplateBatchVmParams memoryUnit_ExplictlyNonNull() {
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

    public VmCreateVmFromContentLibraryTemplateBatchVmParams memory(Long memory) {

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

    public VmCreateVmFromContentLibraryTemplateBatchVmParams memory_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MEMORY);
        return this;
    }

    public VmCreateVmFromContentLibraryTemplateBatchVmParams memory_ExplictlyNonNull() {
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

    public VmCreateVmFromContentLibraryTemplateBatchVmParams cpuCores(Integer cpuCores) {

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

    public VmCreateVmFromContentLibraryTemplateBatchVmParams cpuCores_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CPU_CORES);
        return this;
    }

    public VmCreateVmFromContentLibraryTemplateBatchVmParams cpuCores_ExplictlyNonNull() {
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

    public VmCreateVmFromContentLibraryTemplateBatchVmParams cpuSockets(Integer cpuSockets) {

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

    public VmCreateVmFromContentLibraryTemplateBatchVmParams cpuSockets_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CPU_SOCKETS);
        return this;
    }

    public VmCreateVmFromContentLibraryTemplateBatchVmParams cpuSockets_ExplictlyNonNull() {
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

    public VmCreateVmFromContentLibraryTemplateBatchVmParams guestOsType(
            VmGuestsOperationSystem guestOsType) {

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

    public VmCreateVmFromContentLibraryTemplateBatchVmParams guestOsType_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_GUEST_OS_TYPE);
        return this;
    }

    public VmCreateVmFromContentLibraryTemplateBatchVmParams guestOsType_ExplictlyNonNull() {
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

    public VmCreateVmFromContentLibraryTemplateBatchVmParams folderId(String folderId) {

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

    public VmCreateVmFromContentLibraryTemplateBatchVmParams folderId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FOLDER_ID);
        return this;
    }

    public VmCreateVmFromContentLibraryTemplateBatchVmParams folderId_ExplictlyNonNull() {
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

    public VmCreateVmFromContentLibraryTemplateBatchVmParams description(String description) {

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

    public VmCreateVmFromContentLibraryTemplateBatchVmParams description_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION);
        return this;
    }

    public VmCreateVmFromContentLibraryTemplateBatchVmParams description_ExplictlyNonNull() {
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

    public VmCreateVmFromContentLibraryTemplateBatchVmParams name(String name) {

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

    public VmCreateVmFromContentLibraryTemplateBatchVmParams name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public VmCreateVmFromContentLibraryTemplateBatchVmParams name_ExplictlyNonNull() {
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

    public VmCreateVmFromContentLibraryTemplateBatchVmParams hostId(String hostId) {

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

    public VmCreateVmFromContentLibraryTemplateBatchVmParams hostId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOST_ID);
        return this;
    }

    public VmCreateVmFromContentLibraryTemplateBatchVmParams hostId_ExplictlyNonNull() {
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

    public VmCreateVmFromContentLibraryTemplateBatchVmParams clusterId(String clusterId) {

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

    public VmCreateVmFromContentLibraryTemplateBatchVmParams clusterId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER_ID);
        return this;
    }

    public VmCreateVmFromContentLibraryTemplateBatchVmParams clusterId_ExplictlyNonNull() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VmCreateVmFromContentLibraryTemplateBatchVmParams
                vmCreateVmFromContentLibraryTemplateBatchVmParams =
                        (VmCreateVmFromContentLibraryTemplateBatchVmParams) o;
        return Objects.equals(this.owner, vmCreateVmFromContentLibraryTemplateBatchVmParams.owner)
                && Objects.equals(
                        this.gpuDevices,
                        vmCreateVmFromContentLibraryTemplateBatchVmParams.gpuDevices)
                && Objects.equals(
                        this.cloudInit, vmCreateVmFromContentLibraryTemplateBatchVmParams.cloudInit)
                && Objects.equals(
                        this.isFullCopy,
                        vmCreateVmFromContentLibraryTemplateBatchVmParams.isFullCopy)
                && Objects.equals(
                        this.maxBandwidthPolicy,
                        vmCreateVmFromContentLibraryTemplateBatchVmParams.maxBandwidthPolicy)
                && Objects.equals(
                        this.maxBandwidthUnit,
                        vmCreateVmFromContentLibraryTemplateBatchVmParams.maxBandwidthUnit)
                && Objects.equals(
                        this.maxBandwidth,
                        vmCreateVmFromContentLibraryTemplateBatchVmParams.maxBandwidth)
                && Objects.equals(
                        this.maxIopsPolicy,
                        vmCreateVmFromContentLibraryTemplateBatchVmParams.maxIopsPolicy)
                && Objects.equals(
                        this.maxIops, vmCreateVmFromContentLibraryTemplateBatchVmParams.maxIops)
                && Objects.equals(this.vcpu, vmCreateVmFromContentLibraryTemplateBatchVmParams.vcpu)
                && Objects.equals(
                        this.status, vmCreateVmFromContentLibraryTemplateBatchVmParams.status)
                && Objects.equals(
                        this.firmware, vmCreateVmFromContentLibraryTemplateBatchVmParams.firmware)
                && Objects.equals(
                        this.haPriority,
                        vmCreateVmFromContentLibraryTemplateBatchVmParams.haPriority)
                && Objects.equals(this.ha, vmCreateVmFromContentLibraryTemplateBatchVmParams.ha)
                && Objects.equals(
                        this.pciNics, vmCreateVmFromContentLibraryTemplateBatchVmParams.pciNics)
                && Objects.equals(
                        this.vmPlacementGroup,
                        vmCreateVmFromContentLibraryTemplateBatchVmParams.vmPlacementGroup)
                && Objects.equals(
                        this.vmNics, vmCreateVmFromContentLibraryTemplateBatchVmParams.vmNics)
                && Objects.equals(
                        this.diskOperate,
                        vmCreateVmFromContentLibraryTemplateBatchVmParams.diskOperate)
                && Objects.equals(
                        this.memoryUnit,
                        vmCreateVmFromContentLibraryTemplateBatchVmParams.memoryUnit)
                && Objects.equals(
                        this.memory, vmCreateVmFromContentLibraryTemplateBatchVmParams.memory)
                && Objects.equals(
                        this.cpuCores, vmCreateVmFromContentLibraryTemplateBatchVmParams.cpuCores)
                && Objects.equals(
                        this.cpuSockets,
                        vmCreateVmFromContentLibraryTemplateBatchVmParams.cpuSockets)
                && Objects.equals(
                        this.guestOsType,
                        vmCreateVmFromContentLibraryTemplateBatchVmParams.guestOsType)
                && Objects.equals(
                        this.folderId, vmCreateVmFromContentLibraryTemplateBatchVmParams.folderId)
                && Objects.equals(
                        this.description,
                        vmCreateVmFromContentLibraryTemplateBatchVmParams.description)
                && Objects.equals(this.name, vmCreateVmFromContentLibraryTemplateBatchVmParams.name)
                && Objects.equals(
                        this.hostId, vmCreateVmFromContentLibraryTemplateBatchVmParams.hostId)
                && Objects.equals(
                        this.clusterId,
                        vmCreateVmFromContentLibraryTemplateBatchVmParams.clusterId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                owner,
                gpuDevices,
                cloudInit,
                isFullCopy,
                maxBandwidthPolicy,
                maxBandwidthUnit,
                maxBandwidth,
                maxIopsPolicy,
                maxIops,
                vcpu,
                status,
                firmware,
                haPriority,
                ha,
                pciNics,
                vmPlacementGroup,
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
                clusterId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VmCreateVmFromContentLibraryTemplateBatchVmParams {\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    gpuDevices: ").append(toIndentedString(gpuDevices)).append("\n");
        sb.append("    cloudInit: ").append(toIndentedString(cloudInit)).append("\n");
        sb.append("    isFullCopy: ").append(toIndentedString(isFullCopy)).append("\n");
        sb.append("    maxBandwidthPolicy: ")
                .append(toIndentedString(maxBandwidthPolicy))
                .append("\n");
        sb.append("    maxBandwidthUnit: ").append(toIndentedString(maxBandwidthUnit)).append("\n");
        sb.append("    maxBandwidth: ").append(toIndentedString(maxBandwidth)).append("\n");
        sb.append("    maxIopsPolicy: ").append(toIndentedString(maxIopsPolicy)).append("\n");
        sb.append("    maxIops: ").append(toIndentedString(maxIops)).append("\n");
        sb.append("    vcpu: ").append(toIndentedString(vcpu)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    firmware: ").append(toIndentedString(firmware)).append("\n");
        sb.append("    haPriority: ").append(toIndentedString(haPriority)).append("\n");
        sb.append("    ha: ").append(toIndentedString(ha)).append("\n");
        sb.append("    pciNics: ").append(toIndentedString(pciNics)).append("\n");
        sb.append("    vmPlacementGroup: ").append(toIndentedString(vmPlacementGroup)).append("\n");
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

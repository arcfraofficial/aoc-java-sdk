package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Arrays;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** VmDiskMetaData */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VmDiskMetaData extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_VM_VOLUME_SIZE = "vm_volume_size";

    @SerializedName(SERIALIZED_NAME_VM_VOLUME_SIZE)
    private Double vmVolumeSize;

    public static final String SERIALIZED_NAME_VM_VOLUME_SHARING = "vm_volume_sharing";

    @SerializedName(SERIALIZED_NAME_VM_VOLUME_SHARING)
    private Boolean vmVolumeSharing;

    public static final String SERIALIZED_NAME_VM_VOLUME_PATH = "vm_volume_path";

    @SerializedName(SERIALIZED_NAME_VM_VOLUME_PATH)
    private String vmVolumePath;

    public static final String SERIALIZED_NAME_VM_VOLUME_NAME = "vm_volume_name";

    @SerializedName(SERIALIZED_NAME_VM_VOLUME_NAME)
    private String vmVolumeName;

    public static final String SERIALIZED_NAME_VM_VOLUME_MOUNTING = "vm_volume_mounting";

    @SerializedName(SERIALIZED_NAME_VM_VOLUME_MOUNTING)
    private Boolean vmVolumeMounting;

    public static final String SERIALIZED_NAME_VM_VOLUME_LUN_ZBS_VOLUME_ID =
            "vm_volume_lun_zbs_volume_id";

    @SerializedName(SERIALIZED_NAME_VM_VOLUME_LUN_ZBS_VOLUME_ID)
    private String vmVolumeLunZbsVolumeId;

    public static final String SERIALIZED_NAME_VM_VOLUME_ELF_STORAGE_POLICY =
            "vm_volume_elf_storage_policy";

    @SerializedName(SERIALIZED_NAME_VM_VOLUME_ELF_STORAGE_POLICY)
    private VmVolumeElfStoragePolicyType vmVolumeElfStoragePolicy;

    public static final String SERIALIZED_NAME_TYPE = "type";

    @SerializedName(SERIALIZED_NAME_TYPE)
    private VmDiskType type;

    public static final String SERIALIZED_NAME_MAX_IOPS_POLICY = "max_iops_policy";

    @SerializedName(SERIALIZED_NAME_MAX_IOPS_POLICY)
    private VmDiskIoRestrictType maxIopsPolicy;

    public static final String SERIALIZED_NAME_MAX_IOPS = "max_iops";

    @SerializedName(SERIALIZED_NAME_MAX_IOPS)
    private Integer maxIops;

    public static final String SERIALIZED_NAME_MAX_BANDWIDTH_POLICY = "max_bandwidth_policy";

    @SerializedName(SERIALIZED_NAME_MAX_BANDWIDTH_POLICY)
    private VmDiskIoRestrictType maxBandwidthPolicy;

    public static final String SERIALIZED_NAME_MAX_BANDWIDTH = "max_bandwidth";

    @SerializedName(SERIALIZED_NAME_MAX_BANDWIDTH)
    private Double maxBandwidth;

    public static final String SERIALIZED_NAME_DISABLED = "disabled";

    @SerializedName(SERIALIZED_NAME_DISABLED)
    private Boolean disabled;

    public static final String SERIALIZED_NAME_BUS = "bus";

    @SerializedName(SERIALIZED_NAME_BUS)
    private Bus bus;

    public static final String SERIALIZED_NAME_BOOT = "boot";

    @SerializedName(SERIALIZED_NAME_BOOT)
    private Integer boot;

    public VmDiskMetaData() {}

    public VmDiskMetaData vmVolumeSize(Double vmVolumeSize) {

        this.vmVolumeSize = vmVolumeSize;
        return this;
    }

    /**
     * Get vmVolumeSize
     *
     * @return vmVolumeSize
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getVmVolumeSize() {
        return vmVolumeSize;
    }

    public void setVmVolumeSize(Double vmVolumeSize) {
        this.vmVolumeSize = vmVolumeSize;
    }

    public VmDiskMetaData vmVolumeSize_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_VOLUME_SIZE);
        return this;
    }

    public VmDiskMetaData vmVolumeSize_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_VOLUME_SIZE);
        return this;
    }

    public void setVmVolumeSize_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_VOLUME_SIZE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_VOLUME_SIZE);
        }
    }

    public boolean getVmVolumeSize_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_VOLUME_SIZE);
    }

    public VmDiskMetaData vmVolumeSharing(Boolean vmVolumeSharing) {

        this.vmVolumeSharing = vmVolumeSharing;
        return this;
    }

    /**
     * Get vmVolumeSharing
     *
     * @return vmVolumeSharing
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getVmVolumeSharing() {
        return vmVolumeSharing;
    }

    public void setVmVolumeSharing(Boolean vmVolumeSharing) {
        this.vmVolumeSharing = vmVolumeSharing;
    }

    public VmDiskMetaData vmVolumeSharing_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_VOLUME_SHARING);
        return this;
    }

    public VmDiskMetaData vmVolumeSharing_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_VOLUME_SHARING);
        return this;
    }

    public void setVmVolumeSharing_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_VOLUME_SHARING);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_VOLUME_SHARING);
        }
    }

    public boolean getVmVolumeSharing_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_VOLUME_SHARING);
    }

    public VmDiskMetaData vmVolumePath(String vmVolumePath) {

        this.vmVolumePath = vmVolumePath;
        return this;
    }

    /**
     * Get vmVolumePath
     *
     * @return vmVolumePath
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVmVolumePath() {
        return vmVolumePath;
    }

    public void setVmVolumePath(String vmVolumePath) {
        this.vmVolumePath = vmVolumePath;
    }

    public VmDiskMetaData vmVolumePath_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_VOLUME_PATH);
        return this;
    }

    public VmDiskMetaData vmVolumePath_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_VOLUME_PATH);
        return this;
    }

    public void setVmVolumePath_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_VOLUME_PATH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_VOLUME_PATH);
        }
    }

    public boolean getVmVolumePath_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_VOLUME_PATH);
    }

    public VmDiskMetaData vmVolumeName(String vmVolumeName) {

        this.vmVolumeName = vmVolumeName;
        return this;
    }

    /**
     * Get vmVolumeName
     *
     * @return vmVolumeName
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVmVolumeName() {
        return vmVolumeName;
    }

    public void setVmVolumeName(String vmVolumeName) {
        this.vmVolumeName = vmVolumeName;
    }

    public VmDiskMetaData vmVolumeName_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_VOLUME_NAME);
        return this;
    }

    public VmDiskMetaData vmVolumeName_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_VOLUME_NAME);
        return this;
    }

    public void setVmVolumeName_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_VOLUME_NAME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_VOLUME_NAME);
        }
    }

    public boolean getVmVolumeName_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_VOLUME_NAME);
    }

    public VmDiskMetaData vmVolumeMounting(Boolean vmVolumeMounting) {

        this.vmVolumeMounting = vmVolumeMounting;
        return this;
    }

    /**
     * Get vmVolumeMounting
     *
     * @return vmVolumeMounting
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getVmVolumeMounting() {
        return vmVolumeMounting;
    }

    public void setVmVolumeMounting(Boolean vmVolumeMounting) {
        this.vmVolumeMounting = vmVolumeMounting;
    }

    public VmDiskMetaData vmVolumeMounting_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_VOLUME_MOUNTING);
        return this;
    }

    public VmDiskMetaData vmVolumeMounting_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_VOLUME_MOUNTING);
        return this;
    }

    public void setVmVolumeMounting_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_VOLUME_MOUNTING);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_VOLUME_MOUNTING);
        }
    }

    public boolean getVmVolumeMounting_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_VOLUME_MOUNTING);
    }

    public VmDiskMetaData vmVolumeLunZbsVolumeId(String vmVolumeLunZbsVolumeId) {

        this.vmVolumeLunZbsVolumeId = vmVolumeLunZbsVolumeId;
        return this;
    }

    /**
     * Get vmVolumeLunZbsVolumeId
     *
     * @return vmVolumeLunZbsVolumeId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVmVolumeLunZbsVolumeId() {
        return vmVolumeLunZbsVolumeId;
    }

    public void setVmVolumeLunZbsVolumeId(String vmVolumeLunZbsVolumeId) {
        this.vmVolumeLunZbsVolumeId = vmVolumeLunZbsVolumeId;
    }

    public VmDiskMetaData vmVolumeLunZbsVolumeId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_VOLUME_LUN_ZBS_VOLUME_ID);
        return this;
    }

    public VmDiskMetaData vmVolumeLunZbsVolumeId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_VOLUME_LUN_ZBS_VOLUME_ID);
        return this;
    }

    public void setVmVolumeLunZbsVolumeId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_VOLUME_LUN_ZBS_VOLUME_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_VOLUME_LUN_ZBS_VOLUME_ID);
        }
    }

    public boolean getVmVolumeLunZbsVolumeId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_VOLUME_LUN_ZBS_VOLUME_ID);
    }

    public VmDiskMetaData vmVolumeElfStoragePolicy(
            VmVolumeElfStoragePolicyType vmVolumeElfStoragePolicy) {

        this.vmVolumeElfStoragePolicy = vmVolumeElfStoragePolicy;
        return this;
    }

    /**
     * Get vmVolumeElfStoragePolicy
     *
     * @return vmVolumeElfStoragePolicy
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmVolumeElfStoragePolicyType getVmVolumeElfStoragePolicy() {
        return vmVolumeElfStoragePolicy;
    }

    public void setVmVolumeElfStoragePolicy(VmVolumeElfStoragePolicyType vmVolumeElfStoragePolicy) {
        this.vmVolumeElfStoragePolicy = vmVolumeElfStoragePolicy;
    }

    public VmDiskMetaData vmVolumeElfStoragePolicy_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_VOLUME_ELF_STORAGE_POLICY);
        return this;
    }

    public VmDiskMetaData vmVolumeElfStoragePolicy_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_VOLUME_ELF_STORAGE_POLICY);
        return this;
    }

    public void setVmVolumeElfStoragePolicy_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_VOLUME_ELF_STORAGE_POLICY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_VOLUME_ELF_STORAGE_POLICY);
        }
    }

    public boolean getVmVolumeElfStoragePolicy_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_VOLUME_ELF_STORAGE_POLICY);
    }

    public VmDiskMetaData type(VmDiskType type) {

        this.type = type;
        return this;
    }

    /**
     * Get type
     *
     * @return type
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmDiskType getType() {
        return type;
    }

    public void setType(VmDiskType type) {
        this.type = type;
    }

    public VmDiskMetaData type_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE);
        return this;
    }

    public VmDiskMetaData type_ExplictlyNonNull() {
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

    public VmDiskMetaData maxIopsPolicy(VmDiskIoRestrictType maxIopsPolicy) {

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

    public VmDiskMetaData maxIopsPolicy_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_IOPS_POLICY);
        return this;
    }

    public VmDiskMetaData maxIopsPolicy_ExplictlyNonNull() {
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

    public VmDiskMetaData maxIops(Integer maxIops) {

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

    public VmDiskMetaData maxIops_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_IOPS);
        return this;
    }

    public VmDiskMetaData maxIops_ExplictlyNonNull() {
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

    public VmDiskMetaData maxBandwidthPolicy(VmDiskIoRestrictType maxBandwidthPolicy) {

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

    public VmDiskMetaData maxBandwidthPolicy_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_BANDWIDTH_POLICY);
        return this;
    }

    public VmDiskMetaData maxBandwidthPolicy_ExplictlyNonNull() {
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

    public VmDiskMetaData maxBandwidth(Double maxBandwidth) {

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
    public Double getMaxBandwidth() {
        return maxBandwidth;
    }

    public void setMaxBandwidth(Double maxBandwidth) {
        this.maxBandwidth = maxBandwidth;
    }

    public VmDiskMetaData maxBandwidth_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_BANDWIDTH);
        return this;
    }

    public VmDiskMetaData maxBandwidth_ExplictlyNonNull() {
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

    public VmDiskMetaData disabled(Boolean disabled) {

        this.disabled = disabled;
        return this;
    }

    /**
     * Get disabled
     *
     * @return disabled
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getDisabled() {
        return disabled;
    }

    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    public VmDiskMetaData disabled_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISABLED);
        return this;
    }

    public VmDiskMetaData disabled_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DISABLED);
        return this;
    }

    public void setDisabled_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DISABLED);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DISABLED);
        }
    }

    public boolean getDisabled_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DISABLED);
    }

    public VmDiskMetaData bus(Bus bus) {

        this.bus = bus;
        return this;
    }

    /**
     * Get bus
     *
     * @return bus
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Bus getBus() {
        return bus;
    }

    public void setBus(Bus bus) {
        this.bus = bus;
    }

    public VmDiskMetaData bus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BUS);
        return this;
    }

    public VmDiskMetaData bus_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BUS);
        return this;
    }

    public void setBus_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BUS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BUS);
        }
    }

    public boolean getBus_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BUS);
    }

    public VmDiskMetaData boot(Integer boot) {

        this.boot = boot;
        return this;
    }

    /**
     * Get boot
     *
     * @return boot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getBoot() {
        return boot;
    }

    public void setBoot(Integer boot) {
        this.boot = boot;
    }

    public VmDiskMetaData boot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BOOT);
        return this;
    }

    public VmDiskMetaData boot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BOOT);
        return this;
    }

    public void setBoot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BOOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BOOT);
        }
    }

    public boolean getBoot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BOOT);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VmDiskMetaData vmDiskMetaData = (VmDiskMetaData) o;
        return Objects.equals(this.vmVolumeSize, vmDiskMetaData.vmVolumeSize)
                && Objects.equals(this.vmVolumeSharing, vmDiskMetaData.vmVolumeSharing)
                && Objects.equals(this.vmVolumePath, vmDiskMetaData.vmVolumePath)
                && Objects.equals(this.vmVolumeName, vmDiskMetaData.vmVolumeName)
                && Objects.equals(this.vmVolumeMounting, vmDiskMetaData.vmVolumeMounting)
                && Objects.equals(
                        this.vmVolumeLunZbsVolumeId, vmDiskMetaData.vmVolumeLunZbsVolumeId)
                && Objects.equals(
                        this.vmVolumeElfStoragePolicy, vmDiskMetaData.vmVolumeElfStoragePolicy)
                && Objects.equals(this.type, vmDiskMetaData.type)
                && Objects.equals(this.maxIopsPolicy, vmDiskMetaData.maxIopsPolicy)
                && Objects.equals(this.maxIops, vmDiskMetaData.maxIops)
                && Objects.equals(this.maxBandwidthPolicy, vmDiskMetaData.maxBandwidthPolicy)
                && Objects.equals(this.maxBandwidth, vmDiskMetaData.maxBandwidth)
                && Objects.equals(this.disabled, vmDiskMetaData.disabled)
                && Objects.equals(this.bus, vmDiskMetaData.bus)
                && Objects.equals(this.boot, vmDiskMetaData.boot);
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
                vmVolumeSize,
                vmVolumeSharing,
                vmVolumePath,
                vmVolumeName,
                vmVolumeMounting,
                vmVolumeLunZbsVolumeId,
                vmVolumeElfStoragePolicy,
                type,
                maxIopsPolicy,
                maxIops,
                maxBandwidthPolicy,
                maxBandwidth,
                disabled,
                bus,
                boot);
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
        sb.append("class VmDiskMetaData {\n");
        sb.append("    vmVolumeSize: ").append(toIndentedString(vmVolumeSize)).append("\n");
        sb.append("    vmVolumeSharing: ").append(toIndentedString(vmVolumeSharing)).append("\n");
        sb.append("    vmVolumePath: ").append(toIndentedString(vmVolumePath)).append("\n");
        sb.append("    vmVolumeName: ").append(toIndentedString(vmVolumeName)).append("\n");
        sb.append("    vmVolumeMounting: ").append(toIndentedString(vmVolumeMounting)).append("\n");
        sb.append("    vmVolumeLunZbsVolumeId: ")
                .append(toIndentedString(vmVolumeLunZbsVolumeId))
                .append("\n");
        sb.append("    vmVolumeElfStoragePolicy: ")
                .append(toIndentedString(vmVolumeElfStoragePolicy))
                .append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    maxIopsPolicy: ").append(toIndentedString(maxIopsPolicy)).append("\n");
        sb.append("    maxIops: ").append(toIndentedString(maxIops)).append("\n");
        sb.append("    maxBandwidthPolicy: ")
                .append(toIndentedString(maxBandwidthPolicy))
                .append("\n");
        sb.append("    maxBandwidth: ").append(toIndentedString(maxBandwidth)).append("\n");
        sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
        sb.append("    bus: ").append(toIndentedString(bus)).append("\n");
        sb.append("    boot: ").append(toIndentedString(boot)).append("\n");
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

package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** VmdkDiskModify */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VmdkDiskModify extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_ELF_EC_STORAGE_POLICY = "elf_ec_storage_policy";

    @SerializedName(SERIALIZED_NAME_ELF_EC_STORAGE_POLICY)
    private MountNewCreateDisksParamsVmVolumeElfEcStoragePolicy elfEcStoragePolicy;

    public static final String SERIALIZED_NAME_ELF_REPLICA_STORAGE_POLICY =
            "elf_replica_storage_policy";

    @SerializedName(SERIALIZED_NAME_ELF_REPLICA_STORAGE_POLICY)
    private VmVolumeElfStoragePolicyType elfReplicaStoragePolicy;

    public static final String SERIALIZED_NAME_ELF_STORAGE_POLICY = "elf_storage_policy";

    @SerializedName(SERIALIZED_NAME_ELF_STORAGE_POLICY)
    private VmVolumeElfStoragePolicyType elfStoragePolicy;

    public static final String SERIALIZED_NAME_BUS = "bus";

    @SerializedName(SERIALIZED_NAME_BUS)
    private Bus bus;

    public static final String SERIALIZED_NAME_VOLUME_NAME = "volume_name";

    @SerializedName(SERIALIZED_NAME_VOLUME_NAME)
    private String volumeName;

    public static final String SERIALIZED_NAME_BOOT = "boot";

    @SerializedName(SERIALIZED_NAME_BOOT)
    private Integer boot;

    public static final String SERIALIZED_NAME_VMDK_NAME = "vmdk_name";

    @SerializedName(SERIALIZED_NAME_VMDK_NAME)
    private String vmdkName;

    public VmdkDiskModify() {}

    public VmdkDiskModify elfEcStoragePolicy(
            MountNewCreateDisksParamsVmVolumeElfEcStoragePolicy elfEcStoragePolicy) {

        this.elfEcStoragePolicy = elfEcStoragePolicy;
        return this;
    }

    /**
     * Get elfEcStoragePolicy
     *
     * @return elfEcStoragePolicy
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public MountNewCreateDisksParamsVmVolumeElfEcStoragePolicy getElfEcStoragePolicy() {
        return elfEcStoragePolicy;
    }

    public void setElfEcStoragePolicy(
            MountNewCreateDisksParamsVmVolumeElfEcStoragePolicy elfEcStoragePolicy) {
        this.elfEcStoragePolicy = elfEcStoragePolicy;
    }

    public VmdkDiskModify elfEcStoragePolicy_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ELF_EC_STORAGE_POLICY);
        return this;
    }

    public VmdkDiskModify elfEcStoragePolicy_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ELF_EC_STORAGE_POLICY);
        return this;
    }

    public void setElfEcStoragePolicy_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ELF_EC_STORAGE_POLICY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ELF_EC_STORAGE_POLICY);
        }
    }

    public boolean getElfEcStoragePolicy_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ELF_EC_STORAGE_POLICY);
    }

    public VmdkDiskModify elfReplicaStoragePolicy(
            VmVolumeElfStoragePolicyType elfReplicaStoragePolicy) {

        this.elfReplicaStoragePolicy = elfReplicaStoragePolicy;
        return this;
    }

    /**
     * Get elfReplicaStoragePolicy
     *
     * @return elfReplicaStoragePolicy
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmVolumeElfStoragePolicyType getElfReplicaStoragePolicy() {
        return elfReplicaStoragePolicy;
    }

    public void setElfReplicaStoragePolicy(VmVolumeElfStoragePolicyType elfReplicaStoragePolicy) {
        this.elfReplicaStoragePolicy = elfReplicaStoragePolicy;
    }

    public VmdkDiskModify elfReplicaStoragePolicy_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ELF_REPLICA_STORAGE_POLICY);
        return this;
    }

    public VmdkDiskModify elfReplicaStoragePolicy_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ELF_REPLICA_STORAGE_POLICY);
        return this;
    }

    public void setElfReplicaStoragePolicy_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ELF_REPLICA_STORAGE_POLICY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ELF_REPLICA_STORAGE_POLICY);
        }
    }

    public boolean getElfReplicaStoragePolicy_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ELF_REPLICA_STORAGE_POLICY);
    }

    public VmdkDiskModify elfStoragePolicy(VmVolumeElfStoragePolicyType elfStoragePolicy) {

        this.elfStoragePolicy = elfStoragePolicy;
        return this;
    }

    /**
     * Get elfStoragePolicy
     *
     * @return elfStoragePolicy
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmVolumeElfStoragePolicyType getElfStoragePolicy() {
        return elfStoragePolicy;
    }

    public void setElfStoragePolicy(VmVolumeElfStoragePolicyType elfStoragePolicy) {
        this.elfStoragePolicy = elfStoragePolicy;
    }

    public VmdkDiskModify elfStoragePolicy_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY);
        return this;
    }

    public VmdkDiskModify elfStoragePolicy_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ELF_STORAGE_POLICY);
        return this;
    }

    public void setElfStoragePolicy_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ELF_STORAGE_POLICY);
        }
    }

    public boolean getElfStoragePolicy_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ELF_STORAGE_POLICY);
    }

    public VmdkDiskModify bus(Bus bus) {

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

    public VmdkDiskModify bus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BUS);
        return this;
    }

    public VmdkDiskModify bus_ExplictlyNonNull() {
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

    public VmdkDiskModify volumeName(String volumeName) {

        this.volumeName = volumeName;
        return this;
    }

    /**
     * Get volumeName
     *
     * @return volumeName
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVolumeName() {
        return volumeName;
    }

    public void setVolumeName(String volumeName) {
        this.volumeName = volumeName;
    }

    public VmdkDiskModify volumeName_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VOLUME_NAME);
        return this;
    }

    public VmdkDiskModify volumeName_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VOLUME_NAME);
        return this;
    }

    public void setVolumeName_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VOLUME_NAME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VOLUME_NAME);
        }
    }

    public boolean getVolumeName_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VOLUME_NAME);
    }

    public VmdkDiskModify boot(Integer boot) {

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

    public VmdkDiskModify boot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BOOT);
        return this;
    }

    public VmdkDiskModify boot_ExplictlyNonNull() {
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

    public VmdkDiskModify vmdkName(String vmdkName) {

        this.vmdkName = vmdkName;
        return this;
    }

    /**
     * Get vmdkName
     *
     * @return vmdkName
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getVmdkName() {
        return vmdkName;
    }

    public void setVmdkName(String vmdkName) {
        this.vmdkName = vmdkName;
    }

    public VmdkDiskModify vmdkName_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VMDK_NAME);
        return this;
    }

    public VmdkDiskModify vmdkName_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VMDK_NAME);
        return this;
    }

    public void setVmdkName_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VMDK_NAME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VMDK_NAME);
        }
    }

    public boolean getVmdkName_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VMDK_NAME);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VmdkDiskModify vmdkDiskModify = (VmdkDiskModify) o;
        return Objects.equals(this.elfEcStoragePolicy, vmdkDiskModify.elfEcStoragePolicy)
                && Objects.equals(
                        this.elfReplicaStoragePolicy, vmdkDiskModify.elfReplicaStoragePolicy)
                && Objects.equals(this.elfStoragePolicy, vmdkDiskModify.elfStoragePolicy)
                && Objects.equals(this.bus, vmdkDiskModify.bus)
                && Objects.equals(this.volumeName, vmdkDiskModify.volumeName)
                && Objects.equals(this.boot, vmdkDiskModify.boot)
                && Objects.equals(this.vmdkName, vmdkDiskModify.vmdkName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                elfEcStoragePolicy,
                elfReplicaStoragePolicy,
                elfStoragePolicy,
                bus,
                volumeName,
                boot,
                vmdkName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VmdkDiskModify {\n");
        sb.append("    elfEcStoragePolicy: ")
                .append(toIndentedString(elfEcStoragePolicy))
                .append("\n");
        sb.append("    elfReplicaStoragePolicy: ")
                .append(toIndentedString(elfReplicaStoragePolicy))
                .append("\n");
        sb.append("    elfStoragePolicy: ").append(toIndentedString(elfStoragePolicy)).append("\n");
        sb.append("    bus: ").append(toIndentedString(bus)).append("\n");
        sb.append("    volumeName: ").append(toIndentedString(volumeName)).append("\n");
        sb.append("    boot: ").append(toIndentedString(boot)).append("\n");
        sb.append("    vmdkName: ").append(toIndentedString(vmdkName)).append("\n");
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

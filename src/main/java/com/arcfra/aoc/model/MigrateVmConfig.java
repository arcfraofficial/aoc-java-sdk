package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** MigrateVmConfig */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class MigrateVmConfig extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_REMOVE_UNMOVABLE_DEVICES =
            "remove_unmovable_devices";

    @SerializedName(SERIALIZED_NAME_REMOVE_UNMOVABLE_DEVICES)
    private Boolean removeUnmovableDevices;

    public static final String SERIALIZED_NAME_NEW_NAME = "new_name";

    @SerializedName(SERIALIZED_NAME_NEW_NAME)
    private String newName;

    public static final String SERIALIZED_NAME_NETWORK_MAPPING = "network_mapping";

    @SerializedName(SERIALIZED_NAME_NETWORK_MAPPING)
    private List<VlanMapping> networkMapping = new ArrayList<VlanMapping>();

    public static final String SERIALIZED_NAME_MIGRATE_TYPE = "migrate_type";

    @SerializedName(SERIALIZED_NAME_MIGRATE_TYPE)
    private MigrateType migrateType;

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

    public static final String SERIALIZED_NAME_DELETE_SRC_VM = "delete_src_vm";

    @SerializedName(SERIALIZED_NAME_DELETE_SRC_VM)
    private Boolean deleteSrcVm;

    public MigrateVmConfig() {}

    public MigrateVmConfig removeUnmovableDevices(Boolean removeUnmovableDevices) {

        this.removeUnmovableDevices = removeUnmovableDevices;
        return this;
    }

    /**
     * Get removeUnmovableDevices
     *
     * @return removeUnmovableDevices
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getRemoveUnmovableDevices() {
        return removeUnmovableDevices;
    }

    public void setRemoveUnmovableDevices(Boolean removeUnmovableDevices) {
        this.removeUnmovableDevices = removeUnmovableDevices;
    }

    public MigrateVmConfig removeUnmovableDevices_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REMOVE_UNMOVABLE_DEVICES);
        return this;
    }

    public MigrateVmConfig removeUnmovableDevices_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REMOVE_UNMOVABLE_DEVICES);
        return this;
    }

    public void setRemoveUnmovableDevices_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REMOVE_UNMOVABLE_DEVICES);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REMOVE_UNMOVABLE_DEVICES);
        }
    }

    public boolean getRemoveUnmovableDevices_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REMOVE_UNMOVABLE_DEVICES);
    }

    public MigrateVmConfig newName(String newName) {

        this.newName = newName;
        return this;
    }

    /**
     * Get newName
     *
     * @return newName
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNewName() {
        return newName;
    }

    public void setNewName(String newName) {
        this.newName = newName;
    }

    public MigrateVmConfig newName_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NEW_NAME);
        return this;
    }

    public MigrateVmConfig newName_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NEW_NAME);
        return this;
    }

    public void setNewName_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NEW_NAME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NEW_NAME);
        }
    }

    public boolean getNewName_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NEW_NAME);
    }

    public MigrateVmConfig networkMapping(List<VlanMapping> networkMapping) {

        this.networkMapping = networkMapping;
        return this;
    }

    public MigrateVmConfig addNetworkMappingItem(VlanMapping networkMappingItem) {
        this.networkMapping.add(networkMappingItem);
        return this;
    }

    /**
     * Get networkMapping
     *
     * @return networkMapping
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public List<VlanMapping> getNetworkMapping() {
        return networkMapping;
    }

    public void setNetworkMapping(List<VlanMapping> networkMapping) {
        this.networkMapping = networkMapping;
    }

    public MigrateVmConfig networkMapping_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NETWORK_MAPPING);
        return this;
    }

    public MigrateVmConfig networkMapping_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NETWORK_MAPPING);
        return this;
    }

    public void setNetworkMapping_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NETWORK_MAPPING);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NETWORK_MAPPING);
        }
    }

    public boolean getNetworkMapping_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NETWORK_MAPPING);
    }

    public MigrateVmConfig migrateType(MigrateType migrateType) {

        this.migrateType = migrateType;
        return this;
    }

    /**
     * Get migrateType
     *
     * @return migrateType
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public MigrateType getMigrateType() {
        return migrateType;
    }

    public void setMigrateType(MigrateType migrateType) {
        this.migrateType = migrateType;
    }

    public MigrateVmConfig migrateType_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MIGRATE_TYPE);
        return this;
    }

    public MigrateVmConfig migrateType_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MIGRATE_TYPE);
        return this;
    }

    public void setMigrateType_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MIGRATE_TYPE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MIGRATE_TYPE);
        }
    }

    public boolean getMigrateType_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MIGRATE_TYPE);
    }

    public MigrateVmConfig elfEcStoragePolicy(
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

    public MigrateVmConfig elfEcStoragePolicy_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ELF_EC_STORAGE_POLICY);
        return this;
    }

    public MigrateVmConfig elfEcStoragePolicy_ExplictlyNonNull() {
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

    public MigrateVmConfig elfReplicaStoragePolicy(
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

    public MigrateVmConfig elfReplicaStoragePolicy_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ELF_REPLICA_STORAGE_POLICY);
        return this;
    }

    public MigrateVmConfig elfReplicaStoragePolicy_ExplictlyNonNull() {
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

    public MigrateVmConfig elfStoragePolicy(VmVolumeElfStoragePolicyType elfStoragePolicy) {

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

    public MigrateVmConfig elfStoragePolicy_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ELF_STORAGE_POLICY);
        return this;
    }

    public MigrateVmConfig elfStoragePolicy_ExplictlyNonNull() {
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

    public MigrateVmConfig deleteSrcVm(Boolean deleteSrcVm) {

        this.deleteSrcVm = deleteSrcVm;
        return this;
    }

    /**
     * Get deleteSrcVm
     *
     * @return deleteSrcVm
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getDeleteSrcVm() {
        return deleteSrcVm;
    }

    public void setDeleteSrcVm(Boolean deleteSrcVm) {
        this.deleteSrcVm = deleteSrcVm;
    }

    public MigrateVmConfig deleteSrcVm_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DELETE_SRC_VM);
        return this;
    }

    public MigrateVmConfig deleteSrcVm_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DELETE_SRC_VM);
        return this;
    }

    public void setDeleteSrcVm_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DELETE_SRC_VM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DELETE_SRC_VM);
        }
    }

    public boolean getDeleteSrcVm_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DELETE_SRC_VM);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MigrateVmConfig migrateVmConfig = (MigrateVmConfig) o;
        return Objects.equals(this.removeUnmovableDevices, migrateVmConfig.removeUnmovableDevices)
                && Objects.equals(this.newName, migrateVmConfig.newName)
                && Objects.equals(this.networkMapping, migrateVmConfig.networkMapping)
                && Objects.equals(this.migrateType, migrateVmConfig.migrateType)
                && Objects.equals(this.elfEcStoragePolicy, migrateVmConfig.elfEcStoragePolicy)
                && Objects.equals(
                        this.elfReplicaStoragePolicy, migrateVmConfig.elfReplicaStoragePolicy)
                && Objects.equals(this.elfStoragePolicy, migrateVmConfig.elfStoragePolicy)
                && Objects.equals(this.deleteSrcVm, migrateVmConfig.deleteSrcVm);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                removeUnmovableDevices,
                newName,
                networkMapping,
                migrateType,
                elfEcStoragePolicy,
                elfReplicaStoragePolicy,
                elfStoragePolicy,
                deleteSrcVm);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MigrateVmConfig {\n");
        sb.append("    removeUnmovableDevices: ")
                .append(toIndentedString(removeUnmovableDevices))
                .append("\n");
        sb.append("    newName: ").append(toIndentedString(newName)).append("\n");
        sb.append("    networkMapping: ").append(toIndentedString(networkMapping)).append("\n");
        sb.append("    migrateType: ").append(toIndentedString(migrateType)).append("\n");
        sb.append("    elfEcStoragePolicy: ")
                .append(toIndentedString(elfEcStoragePolicy))
                .append("\n");
        sb.append("    elfReplicaStoragePolicy: ")
                .append(toIndentedString(elfReplicaStoragePolicy))
                .append("\n");
        sb.append("    elfStoragePolicy: ").append(toIndentedString(elfStoragePolicy)).append("\n");
        sb.append("    deleteSrcVm: ").append(toIndentedString(deleteSrcVm)).append("\n");
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

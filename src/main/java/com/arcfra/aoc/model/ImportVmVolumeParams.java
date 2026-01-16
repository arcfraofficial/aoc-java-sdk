package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** ImportVmVolumeParams */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class ImportVmVolumeParams
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_UPLOAD_TASK_ID = "upload_task_id";

    @SerializedName(SERIALIZED_NAME_UPLOAD_TASK_ID)
    private String uploadTaskId;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_ELF_EC_STORAGE_POLICY = "elf_ec_storage_policy";

    @SerializedName(SERIALIZED_NAME_ELF_EC_STORAGE_POLICY)
    private MountNewCreateDisksParamsVmVolumeElfEcStoragePolicy elfEcStoragePolicy;

    public static final String SERIALIZED_NAME_ELF_REPLICA_STORAGE_POLICY =
            "elf_replica_storage_policy";

    @SerializedName(SERIALIZED_NAME_ELF_REPLICA_STORAGE_POLICY)
    private VmVolumeElfStoragePolicyType elfReplicaStoragePolicy;

    public static final String SERIALIZED_NAME_STORAGE_POLICY = "storage_policy";

    @SerializedName(SERIALIZED_NAME_STORAGE_POLICY)
    private VmVolumeElfStoragePolicyType storagePolicy;

    public static final String SERIALIZED_NAME_CLUSTER_ID = "cluster_id";

    @SerializedName(SERIALIZED_NAME_CLUSTER_ID)
    private String clusterId;

    public ImportVmVolumeParams() {}

    public ImportVmVolumeParams uploadTaskId(String uploadTaskId) {

        this.uploadTaskId = uploadTaskId;
        return this;
    }

    /**
     * Get uploadTaskId
     *
     * @return uploadTaskId
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getUploadTaskId() {
        return uploadTaskId;
    }

    public void setUploadTaskId(String uploadTaskId) {
        this.uploadTaskId = uploadTaskId;
    }

    public ImportVmVolumeParams uploadTaskId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPLOAD_TASK_ID);
        return this;
    }

    public ImportVmVolumeParams uploadTaskId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UPLOAD_TASK_ID);
        return this;
    }

    public void setUploadTaskId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UPLOAD_TASK_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UPLOAD_TASK_ID);
        }
    }

    public boolean getUploadTaskId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UPLOAD_TASK_ID);
    }

    public ImportVmVolumeParams name(String name) {

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

    public ImportVmVolumeParams name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public ImportVmVolumeParams name_ExplictlyNonNull() {
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

    public ImportVmVolumeParams elfEcStoragePolicy(
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

    public ImportVmVolumeParams elfEcStoragePolicy_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ELF_EC_STORAGE_POLICY);
        return this;
    }

    public ImportVmVolumeParams elfEcStoragePolicy_ExplictlyNonNull() {
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

    public ImportVmVolumeParams elfReplicaStoragePolicy(
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

    public ImportVmVolumeParams elfReplicaStoragePolicy_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ELF_REPLICA_STORAGE_POLICY);
        return this;
    }

    public ImportVmVolumeParams elfReplicaStoragePolicy_ExplictlyNonNull() {
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

    public ImportVmVolumeParams storagePolicy(VmVolumeElfStoragePolicyType storagePolicy) {

        this.storagePolicy = storagePolicy;
        return this;
    }

    /**
     * Get storagePolicy
     *
     * @return storagePolicy
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmVolumeElfStoragePolicyType getStoragePolicy() {
        return storagePolicy;
    }

    public void setStoragePolicy(VmVolumeElfStoragePolicyType storagePolicy) {
        this.storagePolicy = storagePolicy;
    }

    public ImportVmVolumeParams storagePolicy_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_POLICY);
        return this;
    }

    public ImportVmVolumeParams storagePolicy_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_POLICY);
        return this;
    }

    public void setStoragePolicy_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_POLICY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_POLICY);
        }
    }

    public boolean getStoragePolicy_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_POLICY);
    }

    public ImportVmVolumeParams clusterId(String clusterId) {

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

    public ImportVmVolumeParams clusterId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER_ID);
        return this;
    }

    public ImportVmVolumeParams clusterId_ExplictlyNonNull() {
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
        ImportVmVolumeParams importVmVolumeParams = (ImportVmVolumeParams) o;
        return Objects.equals(this.uploadTaskId, importVmVolumeParams.uploadTaskId)
                && Objects.equals(this.name, importVmVolumeParams.name)
                && Objects.equals(this.elfEcStoragePolicy, importVmVolumeParams.elfEcStoragePolicy)
                && Objects.equals(
                        this.elfReplicaStoragePolicy, importVmVolumeParams.elfReplicaStoragePolicy)
                && Objects.equals(this.storagePolicy, importVmVolumeParams.storagePolicy)
                && Objects.equals(this.clusterId, importVmVolumeParams.clusterId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                uploadTaskId,
                name,
                elfEcStoragePolicy,
                elfReplicaStoragePolicy,
                storagePolicy,
                clusterId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImportVmVolumeParams {\n");
        sb.append("    uploadTaskId: ").append(toIndentedString(uploadTaskId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    elfEcStoragePolicy: ")
                .append(toIndentedString(elfEcStoragePolicy))
                .append("\n");
        sb.append("    elfReplicaStoragePolicy: ")
                .append(toIndentedString(elfReplicaStoragePolicy))
                .append("\n");
        sb.append("    storagePolicy: ").append(toIndentedString(storagePolicy)).append("\n");
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

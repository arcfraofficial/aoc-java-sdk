package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Arrays;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** Application */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class Application extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_CLUSTER = "cluster";

    @SerializedName(SERIALIZED_NAME_CLUSTER)
    private NestedCluster cluster;

    public static final String SERIALIZED_NAME_ERROR_MESSAGE = "error_message";

    @SerializedName(SERIALIZED_NAME_ERROR_MESSAGE)
    private String errorMessage;

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

    public static final String SERIALIZED_NAME_IMAGE_NAME = "image_name";

    @SerializedName(SERIALIZED_NAME_IMAGE_NAME)
    private String imageName;

    public static final String SERIALIZED_NAME_LOCAL_ID = "local_id";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID)
    private String localId;

    public static final String SERIALIZED_NAME_MEMORY = "memory";

    @SerializedName(SERIALIZED_NAME_MEMORY)
    private Long memory;

    public static final String SERIALIZED_NAME_STATE = "state";

    @SerializedName(SERIALIZED_NAME_STATE)
    private ApplicationState state;

    public static final String SERIALIZED_NAME_STORAGE_IP = "storage_ip";

    @SerializedName(SERIALIZED_NAME_STORAGE_IP)
    private String storageIp;

    public static final String SERIALIZED_NAME_TYPE = "type";

    @SerializedName(SERIALIZED_NAME_TYPE)
    private ApplicationType type;

    public static final String SERIALIZED_NAME_UPDATE_TIME = "update_time";

    @SerializedName(SERIALIZED_NAME_UPDATE_TIME)
    private String updateTime;

    public static final String SERIALIZED_NAME_VCPU = "vcpu";

    @SerializedName(SERIALIZED_NAME_VCPU)
    private Integer vcpu;

    public static final String SERIALIZED_NAME_VERSION = "version";

    @SerializedName(SERIALIZED_NAME_VERSION)
    private String version;

    public static final String SERIALIZED_NAME_VM = "vm";

    @SerializedName(SERIALIZED_NAME_VM)
    private NestedVm vm;

    public static final String SERIALIZED_NAME_VOLUME_SIZE = "volume_size";

    @SerializedName(SERIALIZED_NAME_VOLUME_SIZE)
    private Long volumeSize;

    public Application() {}

    public Application cluster(NestedCluster cluster) {

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

    public Application cluster_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER);
        return this;
    }

    public Application cluster_ExplictlyNonNull() {
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

    public Application errorMessage(String errorMessage) {

        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * Get errorMessage
     *
     * @return errorMessage
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public Application errorMessage_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ERROR_MESSAGE);
        return this;
    }

    public Application errorMessage_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ERROR_MESSAGE);
        return this;
    }

    public void setErrorMessage_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ERROR_MESSAGE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ERROR_MESSAGE);
        }
    }

    public boolean getErrorMessage_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ERROR_MESSAGE);
    }

    public Application id(String id) {

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

    public Application id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public Application id_ExplictlyNonNull() {
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

    public Application imageName(String imageName) {

        this.imageName = imageName;
        return this;
    }

    /**
     * Get imageName
     *
     * @return imageName
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public Application imageName_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IMAGE_NAME);
        return this;
    }

    public Application imageName_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IMAGE_NAME);
        return this;
    }

    public void setImageName_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IMAGE_NAME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IMAGE_NAME);
        }
    }

    public boolean getImageName_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IMAGE_NAME);
    }

    public Application localId(String localId) {

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

    public Application localId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID);
        return this;
    }

    public Application localId_ExplictlyNonNull() {
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

    public Application memory(Long memory) {

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

    public Application memory_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MEMORY);
        return this;
    }

    public Application memory_ExplictlyNonNull() {
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

    public Application state(ApplicationState state) {

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
    public ApplicationState getState() {
        return state;
    }

    public void setState(ApplicationState state) {
        this.state = state;
    }

    public Application state_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATE);
        return this;
    }

    public Application state_ExplictlyNonNull() {
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

    public Application storageIp(String storageIp) {

        this.storageIp = storageIp;
        return this;
    }

    /**
     * Get storageIp
     *
     * @return storageIp
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getStorageIp() {
        return storageIp;
    }

    public void setStorageIp(String storageIp) {
        this.storageIp = storageIp;
    }

    public Application storageIp_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGE_IP);
        return this;
    }

    public Application storageIp_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGE_IP);
        return this;
    }

    public void setStorageIp_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGE_IP);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGE_IP);
        }
    }

    public boolean getStorageIp_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGE_IP);
    }

    public Application type(ApplicationType type) {

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
    public ApplicationType getType() {
        return type;
    }

    public void setType(ApplicationType type) {
        this.type = type;
    }

    public Application type_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE);
        return this;
    }

    public Application type_ExplictlyNonNull() {
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

    public Application updateTime(String updateTime) {

        this.updateTime = updateTime;
        return this;
    }

    /**
     * Get updateTime
     *
     * @return updateTime
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public Application updateTime_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPDATE_TIME);
        return this;
    }

    public Application updateTime_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UPDATE_TIME);
        return this;
    }

    public void setUpdateTime_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UPDATE_TIME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UPDATE_TIME);
        }
    }

    public boolean getUpdateTime_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UPDATE_TIME);
    }

    public Application vcpu(Integer vcpu) {

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

    public Application vcpu_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VCPU);
        return this;
    }

    public Application vcpu_ExplictlyNonNull() {
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

    public Application version(String version) {

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

    public Application version_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VERSION);
        return this;
    }

    public Application version_ExplictlyNonNull() {
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

    public Application vm(NestedVm vm) {

        this.vm = vm;
        return this;
    }

    /**
     * Get vm
     *
     * @return vm
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NestedVm getVm() {
        return vm;
    }

    public void setVm(NestedVm vm) {
        this.vm = vm;
    }

    public Application vm_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM);
        return this;
    }

    public Application vm_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM);
        return this;
    }

    public void setVm_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM);
        }
    }

    public boolean getVm_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM);
    }

    public Application volumeSize(Long volumeSize) {

        this.volumeSize = volumeSize;
        return this;
    }

    /**
     * Get volumeSize
     *
     * @return volumeSize
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Long getVolumeSize() {
        return volumeSize;
    }

    public void setVolumeSize(Long volumeSize) {
        this.volumeSize = volumeSize;
    }

    public Application volumeSize_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VOLUME_SIZE);
        return this;
    }

    public Application volumeSize_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VOLUME_SIZE);
        return this;
    }

    public void setVolumeSize_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VOLUME_SIZE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VOLUME_SIZE);
        }
    }

    public boolean getVolumeSize_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VOLUME_SIZE);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Application application = (Application) o;
        return Objects.equals(this.cluster, application.cluster)
                && Objects.equals(this.errorMessage, application.errorMessage)
                && Objects.equals(this.id, application.id)
                && Objects.equals(this.imageName, application.imageName)
                && Objects.equals(this.localId, application.localId)
                && Objects.equals(this.memory, application.memory)
                && Objects.equals(this.state, application.state)
                && Objects.equals(this.storageIp, application.storageIp)
                && Objects.equals(this.type, application.type)
                && Objects.equals(this.updateTime, application.updateTime)
                && Objects.equals(this.vcpu, application.vcpu)
                && Objects.equals(this.version, application.version)
                && Objects.equals(this.vm, application.vm)
                && Objects.equals(this.volumeSize, application.volumeSize);
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
                cluster,
                errorMessage,
                id,
                imageName,
                localId,
                memory,
                state,
                storageIp,
                type,
                updateTime,
                vcpu,
                version,
                vm,
                volumeSize);
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
        sb.append("class Application {\n");
        sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
        sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    imageName: ").append(toIndentedString(imageName)).append("\n");
        sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
        sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    storageIp: ").append(toIndentedString(storageIp)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    vcpu: ").append(toIndentedString(vcpu)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    vm: ").append(toIndentedString(vm)).append("\n");
        sb.append("    volumeSize: ").append(toIndentedString(volumeSize)).append("\n");
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

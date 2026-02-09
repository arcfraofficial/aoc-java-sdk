package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** ApplicationVmSpec */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class ApplicationVmSpec extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_VM_USAGE = "vmUsage";

    @SerializedName(SERIALIZED_NAME_VM_USAGE)
    private VmUsage vmUsage;

    public static final String SERIALIZED_NAME_STORAGES = "storages";

    @SerializedName(SERIALIZED_NAME_STORAGES)
    private List<ApplicationVmSpecStorage> storages = null;

    public static final String SERIALIZED_NAME_STATUS = "status";

    @SerializedName(SERIALIZED_NAME_STATUS)
    private ApplicationVmSpecStatus status;

    public static final String SERIALIZED_NAME_PUBLIC_KEYS = "publicKeys";

    @SerializedName(SERIALIZED_NAME_PUBLIC_KEYS)
    private List<String> publicKeys = null;

    public static final String SERIALIZED_NAME_NETWORK = "network";

    @SerializedName(SERIALIZED_NAME_NETWORK)
    private ApplicationVmSpecNetwork network;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_MEMORY_UNIT = "memory_unit";

    @SerializedName(SERIALIZED_NAME_MEMORY_UNIT)
    private ByteUnit memoryUnit;

    public static final String SERIALIZED_NAME_MEMORY = "memory";

    @SerializedName(SERIALIZED_NAME_MEMORY)
    private Long memory;

    public static final String SERIALIZED_NAME_INTERNAL = "internal";

    @SerializedName(SERIALIZED_NAME_INTERNAL)
    private Boolean internal;

    public static final String SERIALIZED_NAME_IMAGE = "image";

    @SerializedName(SERIALIZED_NAME_IMAGE)
    private String image;

    public static final String SERIALIZED_NAME_HOST = "host";

    @SerializedName(SERIALIZED_NAME_HOST)
    private String host;

    public static final String SERIALIZED_NAME_ENV = "env";

    @SerializedName(SERIALIZED_NAME_ENV)
    private List<ApplicationVmSpecEnv> env = null;

    public static final String SERIALIZED_NAME_CPU = "cpu";

    @SerializedName(SERIALIZED_NAME_CPU)
    private Integer cpu;

    public static final String SERIALIZED_NAME_CLUSTER = "cluster";

    @SerializedName(SERIALIZED_NAME_CLUSTER)
    private String cluster;

    public static final String SERIALIZED_NAME_CLOUD_INIT_USER_DATA = "cloudInitUserData";

    @SerializedName(SERIALIZED_NAME_CLOUD_INIT_USER_DATA)
    private String cloudInitUserData;

    public ApplicationVmSpec() {}

    public ApplicationVmSpec vmUsage(VmUsage vmUsage) {

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

    public ApplicationVmSpec vmUsage_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_USAGE);
        return this;
    }

    public ApplicationVmSpec vmUsage_ExplictlyNonNull() {
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

    public ApplicationVmSpec storages(List<ApplicationVmSpecStorage> storages) {

        this.storages = storages;
        return this;
    }

    public ApplicationVmSpec addStoragesItem(ApplicationVmSpecStorage storagesItem) {
        if (this.storages == null) {
            this.storages = new ArrayList<ApplicationVmSpecStorage>();
        }
        this.storages.add(storagesItem);
        return this;
    }

    /**
     * Get storages
     *
     * @return storages
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<ApplicationVmSpecStorage> getStorages() {
        return storages;
    }

    public void setStorages(List<ApplicationVmSpecStorage> storages) {
        this.storages = storages;
    }

    public ApplicationVmSpec storages_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STORAGES);
        return this;
    }

    public ApplicationVmSpec storages_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STORAGES);
        return this;
    }

    public void setStorages_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STORAGES);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STORAGES);
        }
    }

    public boolean getStorages_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STORAGES);
    }

    public ApplicationVmSpec status(ApplicationVmSpecStatus status) {

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
    public ApplicationVmSpecStatus getStatus() {
        return status;
    }

    public void setStatus(ApplicationVmSpecStatus status) {
        this.status = status;
    }

    public ApplicationVmSpec status_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATUS);
        return this;
    }

    public ApplicationVmSpec status_ExplictlyNonNull() {
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

    public ApplicationVmSpec publicKeys(List<String> publicKeys) {

        this.publicKeys = publicKeys;
        return this;
    }

    public ApplicationVmSpec addPublicKeysItem(String publicKeysItem) {
        if (this.publicKeys == null) {
            this.publicKeys = new ArrayList<String>();
        }
        this.publicKeys.add(publicKeysItem);
        return this;
    }

    /**
     * Get publicKeys
     *
     * @return publicKeys
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getPublicKeys() {
        return publicKeys;
    }

    public void setPublicKeys(List<String> publicKeys) {
        this.publicKeys = publicKeys;
    }

    public ApplicationVmSpec publicKeys_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PUBLIC_KEYS);
        return this;
    }

    public ApplicationVmSpec publicKeys_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PUBLIC_KEYS);
        return this;
    }

    public void setPublicKeys_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PUBLIC_KEYS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PUBLIC_KEYS);
        }
    }

    public boolean getPublicKeys_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PUBLIC_KEYS);
    }

    public ApplicationVmSpec network(ApplicationVmSpecNetwork network) {

        this.network = network;
        return this;
    }

    /**
     * Get network
     *
     * @return network
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ApplicationVmSpecNetwork getNetwork() {
        return network;
    }

    public void setNetwork(ApplicationVmSpecNetwork network) {
        this.network = network;
    }

    public ApplicationVmSpec network_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NETWORK);
        return this;
    }

    public ApplicationVmSpec network_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NETWORK);
        return this;
    }

    public void setNetwork_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NETWORK);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NETWORK);
        }
    }

    public boolean getNetwork_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NETWORK);
    }

    public ApplicationVmSpec name(String name) {

        this.name = name;
        return this;
    }

    /**
     * Get name
     *
     * @return name
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ApplicationVmSpec name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public ApplicationVmSpec name_ExplictlyNonNull() {
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

    public ApplicationVmSpec memoryUnit(ByteUnit memoryUnit) {

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

    public ApplicationVmSpec memoryUnit_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MEMORY_UNIT);
        return this;
    }

    public ApplicationVmSpec memoryUnit_ExplictlyNonNull() {
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

    public ApplicationVmSpec memory(Long memory) {

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

    public ApplicationVmSpec memory_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MEMORY);
        return this;
    }

    public ApplicationVmSpec memory_ExplictlyNonNull() {
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

    public ApplicationVmSpec internal(Boolean internal) {

        this.internal = internal;
        return this;
    }

    /**
     * Get internal
     *
     * @return internal
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getInternal() {
        return internal;
    }

    public void setInternal(Boolean internal) {
        this.internal = internal;
    }

    public ApplicationVmSpec internal_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INTERNAL);
        return this;
    }

    public ApplicationVmSpec internal_ExplictlyNonNull() {
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

    public ApplicationVmSpec image(String image) {

        this.image = image;
        return this;
    }

    /**
     * Get image
     *
     * @return image
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public ApplicationVmSpec image_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IMAGE);
        return this;
    }

    public ApplicationVmSpec image_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IMAGE);
        return this;
    }

    public void setImage_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IMAGE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IMAGE);
        }
    }

    public boolean getImage_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IMAGE);
    }

    public ApplicationVmSpec host(String host) {

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
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public ApplicationVmSpec host_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOST);
        return this;
    }

    public ApplicationVmSpec host_ExplictlyNonNull() {
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

    public ApplicationVmSpec env(List<ApplicationVmSpecEnv> env) {

        this.env = env;
        return this;
    }

    public ApplicationVmSpec addEnvItem(ApplicationVmSpecEnv envItem) {
        if (this.env == null) {
            this.env = new ArrayList<ApplicationVmSpecEnv>();
        }
        this.env.add(envItem);
        return this;
    }

    /**
     * Get env
     *
     * @return env
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<ApplicationVmSpecEnv> getEnv() {
        return env;
    }

    public void setEnv(List<ApplicationVmSpecEnv> env) {
        this.env = env;
    }

    public ApplicationVmSpec env_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENV);
        return this;
    }

    public ApplicationVmSpec env_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ENV);
        return this;
    }

    public void setEnv_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ENV);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ENV);
        }
    }

    public boolean getEnv_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ENV);
    }

    public ApplicationVmSpec cpu(Integer cpu) {

        this.cpu = cpu;
        return this;
    }

    /**
     * Get cpu
     *
     * @return cpu
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getCpu() {
        return cpu;
    }

    public void setCpu(Integer cpu) {
        this.cpu = cpu;
    }

    public ApplicationVmSpec cpu_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CPU);
        return this;
    }

    public ApplicationVmSpec cpu_ExplictlyNonNull() {
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

    public ApplicationVmSpec cluster(String cluster) {

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
    public String getCluster() {
        return cluster;
    }

    public void setCluster(String cluster) {
        this.cluster = cluster;
    }

    public ApplicationVmSpec cluster_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER);
        return this;
    }

    public ApplicationVmSpec cluster_ExplictlyNonNull() {
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

    public ApplicationVmSpec cloudInitUserData(String cloudInitUserData) {

        this.cloudInitUserData = cloudInitUserData;
        return this;
    }

    /**
     * Get cloudInitUserData
     *
     * @return cloudInitUserData
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCloudInitUserData() {
        return cloudInitUserData;
    }

    public void setCloudInitUserData(String cloudInitUserData) {
        this.cloudInitUserData = cloudInitUserData;
    }

    public ApplicationVmSpec cloudInitUserData_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLOUD_INIT_USER_DATA);
        return this;
    }

    public ApplicationVmSpec cloudInitUserData_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLOUD_INIT_USER_DATA);
        return this;
    }

    public void setCloudInitUserData_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLOUD_INIT_USER_DATA);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLOUD_INIT_USER_DATA);
        }
    }

    public boolean getCloudInitUserData_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLOUD_INIT_USER_DATA);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApplicationVmSpec applicationVmSpec = (ApplicationVmSpec) o;
        return Objects.equals(this.vmUsage, applicationVmSpec.vmUsage)
                && Objects.equals(this.storages, applicationVmSpec.storages)
                && Objects.equals(this.status, applicationVmSpec.status)
                && Objects.equals(this.publicKeys, applicationVmSpec.publicKeys)
                && Objects.equals(this.network, applicationVmSpec.network)
                && Objects.equals(this.name, applicationVmSpec.name)
                && Objects.equals(this.memoryUnit, applicationVmSpec.memoryUnit)
                && Objects.equals(this.memory, applicationVmSpec.memory)
                && Objects.equals(this.internal, applicationVmSpec.internal)
                && Objects.equals(this.image, applicationVmSpec.image)
                && Objects.equals(this.host, applicationVmSpec.host)
                && Objects.equals(this.env, applicationVmSpec.env)
                && Objects.equals(this.cpu, applicationVmSpec.cpu)
                && Objects.equals(this.cluster, applicationVmSpec.cluster)
                && Objects.equals(this.cloudInitUserData, applicationVmSpec.cloudInitUserData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                vmUsage,
                storages,
                status,
                publicKeys,
                network,
                name,
                memoryUnit,
                memory,
                internal,
                image,
                host,
                env,
                cpu,
                cluster,
                cloudInitUserData);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApplicationVmSpec {\n");
        sb.append("    vmUsage: ").append(toIndentedString(vmUsage)).append("\n");
        sb.append("    storages: ").append(toIndentedString(storages)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    publicKeys: ").append(toIndentedString(publicKeys)).append("\n");
        sb.append("    network: ").append(toIndentedString(network)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    memoryUnit: ").append(toIndentedString(memoryUnit)).append("\n");
        sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
        sb.append("    internal: ").append(toIndentedString(internal)).append("\n");
        sb.append("    image: ").append(toIndentedString(image)).append("\n");
        sb.append("    host: ").append(toIndentedString(host)).append("\n");
        sb.append("    env: ").append(toIndentedString(env)).append("\n");
        sb.append("    cpu: ").append(toIndentedString(cpu)).append("\n");
        sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
        sb.append("    cloudInitUserData: ")
                .append(toIndentedString(cloudInitUserData))
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

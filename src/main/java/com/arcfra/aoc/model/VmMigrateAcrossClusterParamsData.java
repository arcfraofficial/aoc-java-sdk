package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** VmMigrateAcrossClusterParamsData */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VmMigrateAcrossClusterParamsData
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_VM_CONFIG = "vm_config";

    @SerializedName(SERIALIZED_NAME_VM_CONFIG)
    private MigrateVmConfig vmConfig;

    public static final String SERIALIZED_NAME_CLUSTER_ID = "cluster_id";

    @SerializedName(SERIALIZED_NAME_CLUSTER_ID)
    private String clusterId;

    public static final String SERIALIZED_NAME_HOST_ID = "host_id";

    @SerializedName(SERIALIZED_NAME_HOST_ID)
    private String hostId;

    public VmMigrateAcrossClusterParamsData() {}

    public VmMigrateAcrossClusterParamsData vmConfig(MigrateVmConfig vmConfig) {

        this.vmConfig = vmConfig;
        return this;
    }

    /**
     * Get vmConfig
     *
     * @return vmConfig
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public MigrateVmConfig getVmConfig() {
        return vmConfig;
    }

    public void setVmConfig(MigrateVmConfig vmConfig) {
        this.vmConfig = vmConfig;
    }

    public VmMigrateAcrossClusterParamsData vmConfig_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_CONFIG);
        return this;
    }

    public VmMigrateAcrossClusterParamsData vmConfig_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_CONFIG);
        return this;
    }

    public void setVmConfig_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_CONFIG);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_CONFIG);
        }
    }

    public boolean getVmConfig_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_CONFIG);
    }

    public VmMigrateAcrossClusterParamsData clusterId(String clusterId) {

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

    public VmMigrateAcrossClusterParamsData clusterId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER_ID);
        return this;
    }

    public VmMigrateAcrossClusterParamsData clusterId_ExplictlyNonNull() {
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

    public VmMigrateAcrossClusterParamsData hostId(String hostId) {

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

    public VmMigrateAcrossClusterParamsData hostId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOST_ID);
        return this;
    }

    public VmMigrateAcrossClusterParamsData hostId_ExplictlyNonNull() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VmMigrateAcrossClusterParamsData vmMigrateAcrossClusterParamsData =
                (VmMigrateAcrossClusterParamsData) o;
        return Objects.equals(this.vmConfig, vmMigrateAcrossClusterParamsData.vmConfig)
                && Objects.equals(this.clusterId, vmMigrateAcrossClusterParamsData.clusterId)
                && Objects.equals(this.hostId, vmMigrateAcrossClusterParamsData.hostId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vmConfig, clusterId, hostId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VmMigrateAcrossClusterParamsData {\n");
        sb.append("    vmConfig: ").append(toIndentedString(vmConfig)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
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

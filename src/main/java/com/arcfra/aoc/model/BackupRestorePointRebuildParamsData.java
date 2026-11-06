package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** BackupRestorePointRebuildParamsData */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class BackupRestorePointRebuildParamsData
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_REBUILD_NETWORK_MAPPING = "rebuild_network_mapping";

    @SerializedName(SERIALIZED_NAME_REBUILD_NETWORK_MAPPING)
    private List<BackupRestoreExecutionNetworkMapping> rebuildNetworkMapping =
            new ArrayList<BackupRestoreExecutionNetworkMapping>();

    public static final String SERIALIZED_NAME_REBUILD_TARGET_HOST_ID = "rebuild_target_host_id";

    @SerializedName(SERIALIZED_NAME_REBUILD_TARGET_HOST_ID)
    private String rebuildTargetHostId;

    public static final String SERIALIZED_NAME_REBUILD_TARGET_CLUSTER_ID =
            "rebuild_target_cluster_id";

    @SerializedName(SERIALIZED_NAME_REBUILD_TARGET_CLUSTER_ID)
    private String rebuildTargetClusterId;

    public static final String SERIALIZED_NAME_REBUILD_NAME = "rebuild_name";

    @SerializedName(SERIALIZED_NAME_REBUILD_NAME)
    private String rebuildName;

    public static final String SERIALIZED_NAME_STARTUP_AFTER_RESTORE = "startup_after_restore";

    @SerializedName(SERIALIZED_NAME_STARTUP_AFTER_RESTORE)
    private Boolean startupAfterRestore;

    public BackupRestorePointRebuildParamsData() {}

    public BackupRestorePointRebuildParamsData rebuildNetworkMapping(
            List<BackupRestoreExecutionNetworkMapping> rebuildNetworkMapping) {

        this.rebuildNetworkMapping = rebuildNetworkMapping;
        return this;
    }

    public BackupRestorePointRebuildParamsData addRebuildNetworkMappingItem(
            BackupRestoreExecutionNetworkMapping rebuildNetworkMappingItem) {
        this.rebuildNetworkMapping.add(rebuildNetworkMappingItem);
        return this;
    }

    /**
     * Get rebuildNetworkMapping
     *
     * @return rebuildNetworkMapping
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public List<BackupRestoreExecutionNetworkMapping> getRebuildNetworkMapping() {
        return rebuildNetworkMapping;
    }

    public void setRebuildNetworkMapping(
            List<BackupRestoreExecutionNetworkMapping> rebuildNetworkMapping) {
        this.rebuildNetworkMapping = rebuildNetworkMapping;
    }

    public BackupRestorePointRebuildParamsData rebuildNetworkMapping_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REBUILD_NETWORK_MAPPING);
        return this;
    }

    public BackupRestorePointRebuildParamsData rebuildNetworkMapping_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REBUILD_NETWORK_MAPPING);
        return this;
    }

    public void setRebuildNetworkMapping_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REBUILD_NETWORK_MAPPING);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REBUILD_NETWORK_MAPPING);
        }
    }

    public boolean getRebuildNetworkMapping_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REBUILD_NETWORK_MAPPING);
    }

    public BackupRestorePointRebuildParamsData rebuildTargetHostId(String rebuildTargetHostId) {

        this.rebuildTargetHostId = rebuildTargetHostId;
        return this;
    }

    /**
     * Get rebuildTargetHostId
     *
     * @return rebuildTargetHostId
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getRebuildTargetHostId() {
        return rebuildTargetHostId;
    }

    public void setRebuildTargetHostId(String rebuildTargetHostId) {
        this.rebuildTargetHostId = rebuildTargetHostId;
    }

    public BackupRestorePointRebuildParamsData rebuildTargetHostId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REBUILD_TARGET_HOST_ID);
        return this;
    }

    public BackupRestorePointRebuildParamsData rebuildTargetHostId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REBUILD_TARGET_HOST_ID);
        return this;
    }

    public void setRebuildTargetHostId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REBUILD_TARGET_HOST_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REBUILD_TARGET_HOST_ID);
        }
    }

    public boolean getRebuildTargetHostId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REBUILD_TARGET_HOST_ID);
    }

    public BackupRestorePointRebuildParamsData rebuildTargetClusterId(
            String rebuildTargetClusterId) {

        this.rebuildTargetClusterId = rebuildTargetClusterId;
        return this;
    }

    /**
     * Get rebuildTargetClusterId
     *
     * @return rebuildTargetClusterId
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getRebuildTargetClusterId() {
        return rebuildTargetClusterId;
    }

    public void setRebuildTargetClusterId(String rebuildTargetClusterId) {
        this.rebuildTargetClusterId = rebuildTargetClusterId;
    }

    public BackupRestorePointRebuildParamsData rebuildTargetClusterId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REBUILD_TARGET_CLUSTER_ID);
        return this;
    }

    public BackupRestorePointRebuildParamsData rebuildTargetClusterId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REBUILD_TARGET_CLUSTER_ID);
        return this;
    }

    public void setRebuildTargetClusterId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REBUILD_TARGET_CLUSTER_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REBUILD_TARGET_CLUSTER_ID);
        }
    }

    public boolean getRebuildTargetClusterId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REBUILD_TARGET_CLUSTER_ID);
    }

    public BackupRestorePointRebuildParamsData rebuildName(String rebuildName) {

        this.rebuildName = rebuildName;
        return this;
    }

    /**
     * Get rebuildName
     *
     * @return rebuildName
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getRebuildName() {
        return rebuildName;
    }

    public void setRebuildName(String rebuildName) {
        this.rebuildName = rebuildName;
    }

    public BackupRestorePointRebuildParamsData rebuildName_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REBUILD_NAME);
        return this;
    }

    public BackupRestorePointRebuildParamsData rebuildName_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REBUILD_NAME);
        return this;
    }

    public void setRebuildName_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REBUILD_NAME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REBUILD_NAME);
        }
    }

    public boolean getRebuildName_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REBUILD_NAME);
    }

    public BackupRestorePointRebuildParamsData startupAfterRestore(Boolean startupAfterRestore) {

        this.startupAfterRestore = startupAfterRestore;
        return this;
    }

    /**
     * Get startupAfterRestore
     *
     * @return startupAfterRestore
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Boolean getStartupAfterRestore() {
        return startupAfterRestore;
    }

    public void setStartupAfterRestore(Boolean startupAfterRestore) {
        this.startupAfterRestore = startupAfterRestore;
    }

    public BackupRestorePointRebuildParamsData startupAfterRestore_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STARTUP_AFTER_RESTORE);
        return this;
    }

    public BackupRestorePointRebuildParamsData startupAfterRestore_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STARTUP_AFTER_RESTORE);
        return this;
    }

    public void setStartupAfterRestore_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STARTUP_AFTER_RESTORE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STARTUP_AFTER_RESTORE);
        }
    }

    public boolean getStartupAfterRestore_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STARTUP_AFTER_RESTORE);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BackupRestorePointRebuildParamsData backupRestorePointRebuildParamsData =
                (BackupRestorePointRebuildParamsData) o;
        return Objects.equals(
                        this.rebuildNetworkMapping,
                        backupRestorePointRebuildParamsData.rebuildNetworkMapping)
                && Objects.equals(
                        this.rebuildTargetHostId,
                        backupRestorePointRebuildParamsData.rebuildTargetHostId)
                && Objects.equals(
                        this.rebuildTargetClusterId,
                        backupRestorePointRebuildParamsData.rebuildTargetClusterId)
                && Objects.equals(this.rebuildName, backupRestorePointRebuildParamsData.rebuildName)
                && Objects.equals(
                        this.startupAfterRestore,
                        backupRestorePointRebuildParamsData.startupAfterRestore);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                rebuildNetworkMapping,
                rebuildTargetHostId,
                rebuildTargetClusterId,
                rebuildName,
                startupAfterRestore);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BackupRestorePointRebuildParamsData {\n");
        sb.append("    rebuildNetworkMapping: ")
                .append(toIndentedString(rebuildNetworkMapping))
                .append("\n");
        sb.append("    rebuildTargetHostId: ")
                .append(toIndentedString(rebuildTargetHostId))
                .append("\n");
        sb.append("    rebuildTargetClusterId: ")
                .append(toIndentedString(rebuildTargetClusterId))
                .append("\n");
        sb.append("    rebuildName: ").append(toIndentedString(rebuildName)).append("\n");
        sb.append("    startupAfterRestore: ")
                .append(toIndentedString(startupAfterRestore))
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

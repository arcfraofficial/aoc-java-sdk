package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** BackupRestoreExecution */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class BackupRestoreExecution
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_BACKUP_RESTORE_POINT = "backup_restore_point";

    @SerializedName(SERIALIZED_NAME_BACKUP_RESTORE_POINT)
    private NestedBackupRestorePoint backupRestorePoint;

    public static final String SERIALIZED_NAME_DURATION = "duration";

    @SerializedName(SERIALIZED_NAME_DURATION)
    private Integer duration;

    public static final String SERIALIZED_NAME_ENTITY_ASYNC_STATUS = "entityAsyncStatus";

    @SerializedName(SERIALIZED_NAME_ENTITY_ASYNC_STATUS)
    private EntityAsyncStatus entityAsyncStatus;

    public static final String SERIALIZED_NAME_EXECUTED_AT = "executed_at";

    @SerializedName(SERIALIZED_NAME_EXECUTED_AT)
    private String executedAt;

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

    public static final String SERIALIZED_NAME_MODE = "mode";

    @SerializedName(SERIALIZED_NAME_MODE)
    private BackupRestoreExecutionMode mode;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_READ_BYTES = "read_bytes";

    @SerializedName(SERIALIZED_NAME_READ_BYTES)
    private Long readBytes;

    public static final String SERIALIZED_NAME_REBUILD_NAME = "rebuild_name";

    @SerializedName(SERIALIZED_NAME_REBUILD_NAME)
    private String rebuildName;

    public static final String SERIALIZED_NAME_REBUILD_NETWORK_MAPPING = "rebuild_network_mapping";

    @SerializedName(SERIALIZED_NAME_REBUILD_NETWORK_MAPPING)
    private List<NestedBackupRestoreExecutionNetworkMapping> rebuildNetworkMapping = null;

    public static final String SERIALIZED_NAME_REBUILD_TARGET_CLUSTER = "rebuild_target_cluster";

    @SerializedName(SERIALIZED_NAME_REBUILD_TARGET_CLUSTER)
    private String rebuildTargetCluster;

    public static final String SERIALIZED_NAME_RETRY_TIMES = "retry_times";

    @SerializedName(SERIALIZED_NAME_RETRY_TIMES)
    private Integer retryTimes;

    public static final String SERIALIZED_NAME_STARTUP_AFTER_RESTORE = "startup_after_restore";

    @SerializedName(SERIALIZED_NAME_STARTUP_AFTER_RESTORE)
    private Boolean startupAfterRestore;

    public static final String SERIALIZED_NAME_STATUS = "status";

    @SerializedName(SERIALIZED_NAME_STATUS)
    private BackupExecutionStatus status;

    public static final String SERIALIZED_NAME_TOTAL_BYTES = "total_bytes";

    @SerializedName(SERIALIZED_NAME_TOTAL_BYTES)
    private Long totalBytes;

    public BackupRestoreExecution() {}

    public BackupRestoreExecution backupRestorePoint(NestedBackupRestorePoint backupRestorePoint) {

        this.backupRestorePoint = backupRestorePoint;
        return this;
    }

    /**
     * Get backupRestorePoint
     *
     * @return backupRestorePoint
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NestedBackupRestorePoint getBackupRestorePoint() {
        return backupRestorePoint;
    }

    public void setBackupRestorePoint(NestedBackupRestorePoint backupRestorePoint) {
        this.backupRestorePoint = backupRestorePoint;
    }

    public BackupRestoreExecution backupRestorePoint_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_RESTORE_POINT);
        return this;
    }

    public BackupRestoreExecution backupRestorePoint_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_RESTORE_POINT);
        return this;
    }

    public void setBackupRestorePoint_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_RESTORE_POINT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_RESTORE_POINT);
        }
    }

    public boolean getBackupRestorePoint_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_RESTORE_POINT);
    }

    public BackupRestoreExecution duration(Integer duration) {

        this.duration = duration;
        return this;
    }

    /**
     * Get duration
     *
     * @return duration
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public BackupRestoreExecution duration_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DURATION);
        return this;
    }

    public BackupRestoreExecution duration_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DURATION);
        return this;
    }

    public void setDuration_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DURATION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DURATION);
        }
    }

    public boolean getDuration_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DURATION);
    }

    public BackupRestoreExecution entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {

        this.entityAsyncStatus = entityAsyncStatus;
        return this;
    }

    /**
     * Get entityAsyncStatus
     *
     * @return entityAsyncStatus
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public EntityAsyncStatus getEntityAsyncStatus() {
        return entityAsyncStatus;
    }

    public void setEntityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {
        this.entityAsyncStatus = entityAsyncStatus;
    }

    public BackupRestoreExecution entityAsyncStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        return this;
    }

    public BackupRestoreExecution entityAsyncStatus_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        return this;
    }

    public void setEntityAsyncStatus_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        }
    }

    public boolean getEntityAsyncStatus_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
    }

    public BackupRestoreExecution executedAt(String executedAt) {

        this.executedAt = executedAt;
        return this;
    }

    /**
     * Get executedAt
     *
     * @return executedAt
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getExecutedAt() {
        return executedAt;
    }

    public void setExecutedAt(String executedAt) {
        this.executedAt = executedAt;
    }

    public BackupRestoreExecution executedAt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXECUTED_AT);
        return this;
    }

    public BackupRestoreExecution executedAt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EXECUTED_AT);
        return this;
    }

    public void setExecutedAt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EXECUTED_AT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EXECUTED_AT);
        }
    }

    public boolean getExecutedAt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EXECUTED_AT);
    }

    public BackupRestoreExecution id(String id) {

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

    public BackupRestoreExecution id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public BackupRestoreExecution id_ExplictlyNonNull() {
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

    public BackupRestoreExecution mode(BackupRestoreExecutionMode mode) {

        this.mode = mode;
        return this;
    }

    /**
     * Get mode
     *
     * @return mode
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public BackupRestoreExecutionMode getMode() {
        return mode;
    }

    public void setMode(BackupRestoreExecutionMode mode) {
        this.mode = mode;
    }

    public BackupRestoreExecution mode_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MODE);
        return this;
    }

    public BackupRestoreExecution mode_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MODE);
        return this;
    }

    public void setMode_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MODE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MODE);
        }
    }

    public boolean getMode_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MODE);
    }

    public BackupRestoreExecution name(String name) {

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

    public BackupRestoreExecution name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public BackupRestoreExecution name_ExplictlyNonNull() {
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

    public BackupRestoreExecution readBytes(Long readBytes) {

        this.readBytes = readBytes;
        return this;
    }

    /**
     * Get readBytes
     *
     * @return readBytes
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getReadBytes() {
        return readBytes;
    }

    public void setReadBytes(Long readBytes) {
        this.readBytes = readBytes;
    }

    public BackupRestoreExecution readBytes_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_READ_BYTES);
        return this;
    }

    public BackupRestoreExecution readBytes_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_READ_BYTES);
        return this;
    }

    public void setReadBytes_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_READ_BYTES);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_READ_BYTES);
        }
    }

    public boolean getReadBytes_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_READ_BYTES);
    }

    public BackupRestoreExecution rebuildName(String rebuildName) {

        this.rebuildName = rebuildName;
        return this;
    }

    /**
     * Get rebuildName
     *
     * @return rebuildName
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getRebuildName() {
        return rebuildName;
    }

    public void setRebuildName(String rebuildName) {
        this.rebuildName = rebuildName;
    }

    public BackupRestoreExecution rebuildName_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REBUILD_NAME);
        return this;
    }

    public BackupRestoreExecution rebuildName_ExplictlyNonNull() {
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

    public BackupRestoreExecution rebuildNetworkMapping(
            List<NestedBackupRestoreExecutionNetworkMapping> rebuildNetworkMapping) {

        this.rebuildNetworkMapping = rebuildNetworkMapping;
        return this;
    }

    public BackupRestoreExecution addRebuildNetworkMappingItem(
            NestedBackupRestoreExecutionNetworkMapping rebuildNetworkMappingItem) {
        if (this.rebuildNetworkMapping == null) {
            this.rebuildNetworkMapping =
                    new ArrayList<NestedBackupRestoreExecutionNetworkMapping>();
        }
        this.rebuildNetworkMapping.add(rebuildNetworkMappingItem);
        return this;
    }

    /**
     * Get rebuildNetworkMapping
     *
     * @return rebuildNetworkMapping
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedBackupRestoreExecutionNetworkMapping> getRebuildNetworkMapping() {
        return rebuildNetworkMapping;
    }

    public void setRebuildNetworkMapping(
            List<NestedBackupRestoreExecutionNetworkMapping> rebuildNetworkMapping) {
        this.rebuildNetworkMapping = rebuildNetworkMapping;
    }

    public BackupRestoreExecution rebuildNetworkMapping_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REBUILD_NETWORK_MAPPING);
        return this;
    }

    public BackupRestoreExecution rebuildNetworkMapping_ExplictlyNonNull() {
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

    public BackupRestoreExecution rebuildTargetCluster(String rebuildTargetCluster) {

        this.rebuildTargetCluster = rebuildTargetCluster;
        return this;
    }

    /**
     * Get rebuildTargetCluster
     *
     * @return rebuildTargetCluster
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getRebuildTargetCluster() {
        return rebuildTargetCluster;
    }

    public void setRebuildTargetCluster(String rebuildTargetCluster) {
        this.rebuildTargetCluster = rebuildTargetCluster;
    }

    public BackupRestoreExecution rebuildTargetCluster_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REBUILD_TARGET_CLUSTER);
        return this;
    }

    public BackupRestoreExecution rebuildTargetCluster_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REBUILD_TARGET_CLUSTER);
        return this;
    }

    public void setRebuildTargetCluster_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REBUILD_TARGET_CLUSTER);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REBUILD_TARGET_CLUSTER);
        }
    }

    public boolean getRebuildTargetCluster_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REBUILD_TARGET_CLUSTER);
    }

    public BackupRestoreExecution retryTimes(Integer retryTimes) {

        this.retryTimes = retryTimes;
        return this;
    }

    /**
     * Get retryTimes
     *
     * @return retryTimes
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getRetryTimes() {
        return retryTimes;
    }

    public void setRetryTimes(Integer retryTimes) {
        this.retryTimes = retryTimes;
    }

    public BackupRestoreExecution retryTimes_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RETRY_TIMES);
        return this;
    }

    public BackupRestoreExecution retryTimes_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RETRY_TIMES);
        return this;
    }

    public void setRetryTimes_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RETRY_TIMES);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RETRY_TIMES);
        }
    }

    public boolean getRetryTimes_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RETRY_TIMES);
    }

    public BackupRestoreExecution startupAfterRestore(Boolean startupAfterRestore) {

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

    public BackupRestoreExecution startupAfterRestore_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STARTUP_AFTER_RESTORE);
        return this;
    }

    public BackupRestoreExecution startupAfterRestore_ExplictlyNonNull() {
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

    public BackupRestoreExecution status(BackupExecutionStatus status) {

        this.status = status;
        return this;
    }

    /**
     * Get status
     *
     * @return status
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public BackupExecutionStatus getStatus() {
        return status;
    }

    public void setStatus(BackupExecutionStatus status) {
        this.status = status;
    }

    public BackupRestoreExecution status_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATUS);
        return this;
    }

    public BackupRestoreExecution status_ExplictlyNonNull() {
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

    public BackupRestoreExecution totalBytes(Long totalBytes) {

        this.totalBytes = totalBytes;
        return this;
    }

    /**
     * Get totalBytes
     *
     * @return totalBytes
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getTotalBytes() {
        return totalBytes;
    }

    public void setTotalBytes(Long totalBytes) {
        this.totalBytes = totalBytes;
    }

    public BackupRestoreExecution totalBytes_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_BYTES);
        return this;
    }

    public BackupRestoreExecution totalBytes_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_BYTES);
        return this;
    }

    public void setTotalBytes_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_BYTES);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_BYTES);
        }
    }

    public boolean getTotalBytes_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_BYTES);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BackupRestoreExecution backupRestoreExecution = (BackupRestoreExecution) o;
        return Objects.equals(this.backupRestorePoint, backupRestoreExecution.backupRestorePoint)
                && Objects.equals(this.duration, backupRestoreExecution.duration)
                && Objects.equals(this.entityAsyncStatus, backupRestoreExecution.entityAsyncStatus)
                && Objects.equals(this.executedAt, backupRestoreExecution.executedAt)
                && Objects.equals(this.id, backupRestoreExecution.id)
                && Objects.equals(this.mode, backupRestoreExecution.mode)
                && Objects.equals(this.name, backupRestoreExecution.name)
                && Objects.equals(this.readBytes, backupRestoreExecution.readBytes)
                && Objects.equals(this.rebuildName, backupRestoreExecution.rebuildName)
                && Objects.equals(
                        this.rebuildNetworkMapping, backupRestoreExecution.rebuildNetworkMapping)
                && Objects.equals(
                        this.rebuildTargetCluster, backupRestoreExecution.rebuildTargetCluster)
                && Objects.equals(this.retryTimes, backupRestoreExecution.retryTimes)
                && Objects.equals(
                        this.startupAfterRestore, backupRestoreExecution.startupAfterRestore)
                && Objects.equals(this.status, backupRestoreExecution.status)
                && Objects.equals(this.totalBytes, backupRestoreExecution.totalBytes);
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
                backupRestorePoint,
                duration,
                entityAsyncStatus,
                executedAt,
                id,
                mode,
                name,
                readBytes,
                rebuildName,
                rebuildNetworkMapping,
                rebuildTargetCluster,
                retryTimes,
                startupAfterRestore,
                status,
                totalBytes);
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
        sb.append("class BackupRestoreExecution {\n");
        sb.append("    backupRestorePoint: ")
                .append(toIndentedString(backupRestorePoint))
                .append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    entityAsyncStatus: ")
                .append(toIndentedString(entityAsyncStatus))
                .append("\n");
        sb.append("    executedAt: ").append(toIndentedString(executedAt)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    readBytes: ").append(toIndentedString(readBytes)).append("\n");
        sb.append("    rebuildName: ").append(toIndentedString(rebuildName)).append("\n");
        sb.append("    rebuildNetworkMapping: ")
                .append(toIndentedString(rebuildNetworkMapping))
                .append("\n");
        sb.append("    rebuildTargetCluster: ")
                .append(toIndentedString(rebuildTargetCluster))
                .append("\n");
        sb.append("    retryTimes: ").append(toIndentedString(retryTimes)).append("\n");
        sb.append("    startupAfterRestore: ")
                .append(toIndentedString(startupAfterRestore))
                .append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    totalBytes: ").append(toIndentedString(totalBytes)).append("\n");
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

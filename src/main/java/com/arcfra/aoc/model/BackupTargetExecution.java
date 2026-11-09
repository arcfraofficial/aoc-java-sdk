package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Arrays;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** BackupTargetExecution */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class BackupTargetExecution
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_BACKUP_GROUP = "backup_group";

    @SerializedName(SERIALIZED_NAME_BACKUP_GROUP)
    private String backupGroup;

    public static final String SERIALIZED_NAME_BACKUP_PLAN_EXECUTION = "backup_plan_execution";

    @SerializedName(SERIALIZED_NAME_BACKUP_PLAN_EXECUTION)
    private NestedBackupPlanExecution backupPlanExecution;

    public static final String SERIALIZED_NAME_BACKUP_RESTORE_POINT = "backup_restore_point";

    @SerializedName(SERIALIZED_NAME_BACKUP_RESTORE_POINT)
    private NestedBackupRestorePoint backupRestorePoint;

    public static final String SERIALIZED_NAME_CLUSTER_LOCAL_ID = "cluster_local_id";

    @SerializedName(SERIALIZED_NAME_CLUSTER_LOCAL_ID)
    private String clusterLocalId;

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

    public static final String SERIALIZED_NAME_LOCAL_ID = "local_id";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID)
    private String localId;

    public static final String SERIALIZED_NAME_PARENT_BACKUP = "parent_backup";

    @SerializedName(SERIALIZED_NAME_PARENT_BACKUP)
    private String parentBackup;

    public static final String SERIALIZED_NAME_READ_BYTES = "read_bytes";

    @SerializedName(SERIALIZED_NAME_READ_BYTES)
    private Long readBytes;

    public static final String SERIALIZED_NAME_RETRY_TIMES = "retry_times";

    @SerializedName(SERIALIZED_NAME_RETRY_TIMES)
    private Integer retryTimes;

    public static final String SERIALIZED_NAME_STATUS = "status";

    @SerializedName(SERIALIZED_NAME_STATUS)
    private BackupExecutionStatus status;

    public static final String SERIALIZED_NAME_TOTAL_BYTES = "total_bytes";

    @SerializedName(SERIALIZED_NAME_TOTAL_BYTES)
    private Long totalBytes;

    public static final String SERIALIZED_NAME_TYPE = "type";

    @SerializedName(SERIALIZED_NAME_TYPE)
    private BackupExecutionType type;

    public static final String SERIALIZED_NAME_VM = "vm";

    @SerializedName(SERIALIZED_NAME_VM)
    private NestedVm vm;

    public static final String SERIALIZED_NAME_VM_LOCAL_ID = "vm_local_id";

    @SerializedName(SERIALIZED_NAME_VM_LOCAL_ID)
    private String vmLocalId;

    public static final String SERIALIZED_NAME_VM_NAME = "vm_name";

    @SerializedName(SERIALIZED_NAME_VM_NAME)
    private String vmName;

    public BackupTargetExecution() {}

    public BackupTargetExecution backupGroup(String backupGroup) {

        this.backupGroup = backupGroup;
        return this;
    }

    /**
     * Get backupGroup
     *
     * @return backupGroup
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getBackupGroup() {
        return backupGroup;
    }

    public void setBackupGroup(String backupGroup) {
        this.backupGroup = backupGroup;
    }

    public BackupTargetExecution backupGroup_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_GROUP);
        return this;
    }

    public BackupTargetExecution backupGroup_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_GROUP);
        return this;
    }

    public void setBackupGroup_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_GROUP);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_GROUP);
        }
    }

    public boolean getBackupGroup_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_GROUP);
    }

    public BackupTargetExecution backupPlanExecution(
            NestedBackupPlanExecution backupPlanExecution) {

        this.backupPlanExecution = backupPlanExecution;
        return this;
    }

    /**
     * Get backupPlanExecution
     *
     * @return backupPlanExecution
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NestedBackupPlanExecution getBackupPlanExecution() {
        return backupPlanExecution;
    }

    public void setBackupPlanExecution(NestedBackupPlanExecution backupPlanExecution) {
        this.backupPlanExecution = backupPlanExecution;
    }

    public BackupTargetExecution backupPlanExecution_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_PLAN_EXECUTION);
        return this;
    }

    public BackupTargetExecution backupPlanExecution_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_PLAN_EXECUTION);
        return this;
    }

    public void setBackupPlanExecution_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_PLAN_EXECUTION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_PLAN_EXECUTION);
        }
    }

    public boolean getBackupPlanExecution_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_PLAN_EXECUTION);
    }

    public BackupTargetExecution backupRestorePoint(NestedBackupRestorePoint backupRestorePoint) {

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

    public BackupTargetExecution backupRestorePoint_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_RESTORE_POINT);
        return this;
    }

    public BackupTargetExecution backupRestorePoint_ExplictlyNonNull() {
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

    public BackupTargetExecution clusterLocalId(String clusterLocalId) {

        this.clusterLocalId = clusterLocalId;
        return this;
    }

    /**
     * Get clusterLocalId
     *
     * @return clusterLocalId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getClusterLocalId() {
        return clusterLocalId;
    }

    public void setClusterLocalId(String clusterLocalId) {
        this.clusterLocalId = clusterLocalId;
    }

    public BackupTargetExecution clusterLocalId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID);
        return this;
    }

    public BackupTargetExecution clusterLocalId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_LOCAL_ID);
        return this;
    }

    public void setClusterLocalId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_LOCAL_ID);
        }
    }

    public boolean getClusterLocalId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLUSTER_LOCAL_ID);
    }

    public BackupTargetExecution duration(Integer duration) {

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

    public BackupTargetExecution duration_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DURATION);
        return this;
    }

    public BackupTargetExecution duration_ExplictlyNonNull() {
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

    public BackupTargetExecution entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {

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

    public BackupTargetExecution entityAsyncStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        return this;
    }

    public BackupTargetExecution entityAsyncStatus_ExplictlyNonNull() {
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

    public BackupTargetExecution executedAt(String executedAt) {

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

    public BackupTargetExecution executedAt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXECUTED_AT);
        return this;
    }

    public BackupTargetExecution executedAt_ExplictlyNonNull() {
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

    public BackupTargetExecution id(String id) {

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

    public BackupTargetExecution id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public BackupTargetExecution id_ExplictlyNonNull() {
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

    public BackupTargetExecution localId(String localId) {

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

    public BackupTargetExecution localId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID);
        return this;
    }

    public BackupTargetExecution localId_ExplictlyNonNull() {
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

    public BackupTargetExecution parentBackup(String parentBackup) {

        this.parentBackup = parentBackup;
        return this;
    }

    /**
     * Get parentBackup
     *
     * @return parentBackup
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getParentBackup() {
        return parentBackup;
    }

    public void setParentBackup(String parentBackup) {
        this.parentBackup = parentBackup;
    }

    public BackupTargetExecution parentBackup_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PARENT_BACKUP);
        return this;
    }

    public BackupTargetExecution parentBackup_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PARENT_BACKUP);
        return this;
    }

    public void setParentBackup_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PARENT_BACKUP);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PARENT_BACKUP);
        }
    }

    public boolean getParentBackup_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PARENT_BACKUP);
    }

    public BackupTargetExecution readBytes(Long readBytes) {

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

    public BackupTargetExecution readBytes_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_READ_BYTES);
        return this;
    }

    public BackupTargetExecution readBytes_ExplictlyNonNull() {
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

    public BackupTargetExecution retryTimes(Integer retryTimes) {

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

    public BackupTargetExecution retryTimes_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RETRY_TIMES);
        return this;
    }

    public BackupTargetExecution retryTimes_ExplictlyNonNull() {
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

    public BackupTargetExecution status(BackupExecutionStatus status) {

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
    public BackupExecutionStatus getStatus() {
        return status;
    }

    public void setStatus(BackupExecutionStatus status) {
        this.status = status;
    }

    public BackupTargetExecution status_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATUS);
        return this;
    }

    public BackupTargetExecution status_ExplictlyNonNull() {
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

    public BackupTargetExecution totalBytes(Long totalBytes) {

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

    public BackupTargetExecution totalBytes_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_BYTES);
        return this;
    }

    public BackupTargetExecution totalBytes_ExplictlyNonNull() {
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

    public BackupTargetExecution type(BackupExecutionType type) {

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
    public BackupExecutionType getType() {
        return type;
    }

    public void setType(BackupExecutionType type) {
        this.type = type;
    }

    public BackupTargetExecution type_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE);
        return this;
    }

    public BackupTargetExecution type_ExplictlyNonNull() {
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

    public BackupTargetExecution vm(NestedVm vm) {

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

    public BackupTargetExecution vm_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM);
        return this;
    }

    public BackupTargetExecution vm_ExplictlyNonNull() {
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

    public BackupTargetExecution vmLocalId(String vmLocalId) {

        this.vmLocalId = vmLocalId;
        return this;
    }

    /**
     * Get vmLocalId
     *
     * @return vmLocalId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVmLocalId() {
        return vmLocalId;
    }

    public void setVmLocalId(String vmLocalId) {
        this.vmLocalId = vmLocalId;
    }

    public BackupTargetExecution vmLocalId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_LOCAL_ID);
        return this;
    }

    public BackupTargetExecution vmLocalId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_LOCAL_ID);
        return this;
    }

    public void setVmLocalId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_LOCAL_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_LOCAL_ID);
        }
    }

    public boolean getVmLocalId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_LOCAL_ID);
    }

    public BackupTargetExecution vmName(String vmName) {

        this.vmName = vmName;
        return this;
    }

    /**
     * Get vmName
     *
     * @return vmName
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVmName() {
        return vmName;
    }

    public void setVmName(String vmName) {
        this.vmName = vmName;
    }

    public BackupTargetExecution vmName_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_NAME);
        return this;
    }

    public BackupTargetExecution vmName_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_NAME);
        return this;
    }

    public void setVmName_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_NAME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_NAME);
        }
    }

    public boolean getVmName_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_NAME);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BackupTargetExecution backupTargetExecution = (BackupTargetExecution) o;
        return Objects.equals(this.backupGroup, backupTargetExecution.backupGroup)
                && Objects.equals(
                        this.backupPlanExecution, backupTargetExecution.backupPlanExecution)
                && Objects.equals(this.backupRestorePoint, backupTargetExecution.backupRestorePoint)
                && Objects.equals(this.clusterLocalId, backupTargetExecution.clusterLocalId)
                && Objects.equals(this.duration, backupTargetExecution.duration)
                && Objects.equals(this.entityAsyncStatus, backupTargetExecution.entityAsyncStatus)
                && Objects.equals(this.executedAt, backupTargetExecution.executedAt)
                && Objects.equals(this.id, backupTargetExecution.id)
                && Objects.equals(this.localId, backupTargetExecution.localId)
                && Objects.equals(this.parentBackup, backupTargetExecution.parentBackup)
                && Objects.equals(this.readBytes, backupTargetExecution.readBytes)
                && Objects.equals(this.retryTimes, backupTargetExecution.retryTimes)
                && Objects.equals(this.status, backupTargetExecution.status)
                && Objects.equals(this.totalBytes, backupTargetExecution.totalBytes)
                && Objects.equals(this.type, backupTargetExecution.type)
                && Objects.equals(this.vm, backupTargetExecution.vm)
                && Objects.equals(this.vmLocalId, backupTargetExecution.vmLocalId)
                && Objects.equals(this.vmName, backupTargetExecution.vmName);
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
                backupGroup,
                backupPlanExecution,
                backupRestorePoint,
                clusterLocalId,
                duration,
                entityAsyncStatus,
                executedAt,
                id,
                localId,
                parentBackup,
                readBytes,
                retryTimes,
                status,
                totalBytes,
                type,
                vm,
                vmLocalId,
                vmName);
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
        sb.append("class BackupTargetExecution {\n");
        sb.append("    backupGroup: ").append(toIndentedString(backupGroup)).append("\n");
        sb.append("    backupPlanExecution: ")
                .append(toIndentedString(backupPlanExecution))
                .append("\n");
        sb.append("    backupRestorePoint: ")
                .append(toIndentedString(backupRestorePoint))
                .append("\n");
        sb.append("    clusterLocalId: ").append(toIndentedString(clusterLocalId)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    entityAsyncStatus: ")
                .append(toIndentedString(entityAsyncStatus))
                .append("\n");
        sb.append("    executedAt: ").append(toIndentedString(executedAt)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
        sb.append("    parentBackup: ").append(toIndentedString(parentBackup)).append("\n");
        sb.append("    readBytes: ").append(toIndentedString(readBytes)).append("\n");
        sb.append("    retryTimes: ").append(toIndentedString(retryTimes)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    totalBytes: ").append(toIndentedString(totalBytes)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    vm: ").append(toIndentedString(vm)).append("\n");
        sb.append("    vmLocalId: ").append(toIndentedString(vmLocalId)).append("\n");
        sb.append("    vmName: ").append(toIndentedString(vmName)).append("\n");
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

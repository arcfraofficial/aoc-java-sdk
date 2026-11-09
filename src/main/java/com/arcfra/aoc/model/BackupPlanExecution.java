package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Arrays;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** BackupPlanExecution */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class BackupPlanExecution
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_BACKUP_PLAN = "backup_plan";

    @SerializedName(SERIALIZED_NAME_BACKUP_PLAN)
    private NestedBackupPlan backupPlan;

    public static final String SERIALIZED_NAME_DELETABLE_FLAG_MARKED = "deletable_flag_marked";

    @SerializedName(SERIALIZED_NAME_DELETABLE_FLAG_MARKED)
    private Boolean deletableFlagMarked;

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

    public static final String SERIALIZED_NAME_LOCAL_CREATED_AT = "local_created_at";

    @SerializedName(SERIALIZED_NAME_LOCAL_CREATED_AT)
    private String localCreatedAt;

    public static final String SERIALIZED_NAME_LOCAL_ID = "local_id";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID)
    private String localId;

    public static final String SERIALIZED_NAME_METHOD = "method";

    @SerializedName(SERIALIZED_NAME_METHOD)
    private BackupExecutionMethod method;

    public static final String SERIALIZED_NAME_STATE = "state";

    @SerializedName(SERIALIZED_NAME_STATE)
    private BackupPlanExecutionState state;

    public static final String SERIALIZED_NAME_STATUS = "status";

    @SerializedName(SERIALIZED_NAME_STATUS)
    private BackupPlanExecutionStatus status;

    public static final String SERIALIZED_NAME_SUCCESS_JOB_COUNT = "success_job_count";

    @SerializedName(SERIALIZED_NAME_SUCCESS_JOB_COUNT)
    private Integer successJobCount;

    public static final String SERIALIZED_NAME_TOTAL_JOB_COUNT = "total_job_count";

    @SerializedName(SERIALIZED_NAME_TOTAL_JOB_COUNT)
    private Integer totalJobCount;

    public static final String SERIALIZED_NAME_TYPE = "type";

    @SerializedName(SERIALIZED_NAME_TYPE)
    private BackupExecutionType type;

    public BackupPlanExecution() {}

    public BackupPlanExecution backupPlan(NestedBackupPlan backupPlan) {

        this.backupPlan = backupPlan;
        return this;
    }

    /**
     * Get backupPlan
     *
     * @return backupPlan
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NestedBackupPlan getBackupPlan() {
        return backupPlan;
    }

    public void setBackupPlan(NestedBackupPlan backupPlan) {
        this.backupPlan = backupPlan;
    }

    public BackupPlanExecution backupPlan_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_PLAN);
        return this;
    }

    public BackupPlanExecution backupPlan_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_PLAN);
        return this;
    }

    public void setBackupPlan_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_PLAN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_PLAN);
        }
    }

    public boolean getBackupPlan_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_PLAN);
    }

    public BackupPlanExecution deletableFlagMarked(Boolean deletableFlagMarked) {

        this.deletableFlagMarked = deletableFlagMarked;
        return this;
    }

    /**
     * Get deletableFlagMarked
     *
     * @return deletableFlagMarked
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getDeletableFlagMarked() {
        return deletableFlagMarked;
    }

    public void setDeletableFlagMarked(Boolean deletableFlagMarked) {
        this.deletableFlagMarked = deletableFlagMarked;
    }

    public BackupPlanExecution deletableFlagMarked_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DELETABLE_FLAG_MARKED);
        return this;
    }

    public BackupPlanExecution deletableFlagMarked_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DELETABLE_FLAG_MARKED);
        return this;
    }

    public void setDeletableFlagMarked_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DELETABLE_FLAG_MARKED);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DELETABLE_FLAG_MARKED);
        }
    }

    public boolean getDeletableFlagMarked_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DELETABLE_FLAG_MARKED);
    }

    public BackupPlanExecution duration(Integer duration) {

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

    public BackupPlanExecution duration_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DURATION);
        return this;
    }

    public BackupPlanExecution duration_ExplictlyNonNull() {
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

    public BackupPlanExecution entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {

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

    public BackupPlanExecution entityAsyncStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        return this;
    }

    public BackupPlanExecution entityAsyncStatus_ExplictlyNonNull() {
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

    public BackupPlanExecution executedAt(String executedAt) {

        this.executedAt = executedAt;
        return this;
    }

    /**
     * Get executedAt
     *
     * @return executedAt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getExecutedAt() {
        return executedAt;
    }

    public void setExecutedAt(String executedAt) {
        this.executedAt = executedAt;
    }

    public BackupPlanExecution executedAt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXECUTED_AT);
        return this;
    }

    public BackupPlanExecution executedAt_ExplictlyNonNull() {
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

    public BackupPlanExecution id(String id) {

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

    public BackupPlanExecution id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public BackupPlanExecution id_ExplictlyNonNull() {
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

    public BackupPlanExecution localCreatedAt(String localCreatedAt) {

        this.localCreatedAt = localCreatedAt;
        return this;
    }

    /**
     * Get localCreatedAt
     *
     * @return localCreatedAt
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getLocalCreatedAt() {
        return localCreatedAt;
    }

    public void setLocalCreatedAt(String localCreatedAt) {
        this.localCreatedAt = localCreatedAt;
    }

    public BackupPlanExecution localCreatedAt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATED_AT);
        return this;
    }

    public BackupPlanExecution localCreatedAt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_CREATED_AT);
        return this;
    }

    public void setLocalCreatedAt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATED_AT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_CREATED_AT);
        }
    }

    public boolean getLocalCreatedAt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_CREATED_AT);
    }

    public BackupPlanExecution localId(String localId) {

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

    public BackupPlanExecution localId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID);
        return this;
    }

    public BackupPlanExecution localId_ExplictlyNonNull() {
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

    public BackupPlanExecution method(BackupExecutionMethod method) {

        this.method = method;
        return this;
    }

    /**
     * Get method
     *
     * @return method
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public BackupExecutionMethod getMethod() {
        return method;
    }

    public void setMethod(BackupExecutionMethod method) {
        this.method = method;
    }

    public BackupPlanExecution method_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_METHOD);
        return this;
    }

    public BackupPlanExecution method_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_METHOD);
        return this;
    }

    public void setMethod_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_METHOD);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_METHOD);
        }
    }

    public boolean getMethod_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_METHOD);
    }

    public BackupPlanExecution state(BackupPlanExecutionState state) {

        this.state = state;
        return this;
    }

    /**
     * Get state
     *
     * @return state
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public BackupPlanExecutionState getState() {
        return state;
    }

    public void setState(BackupPlanExecutionState state) {
        this.state = state;
    }

    public BackupPlanExecution state_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATE);
        return this;
    }

    public BackupPlanExecution state_ExplictlyNonNull() {
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

    public BackupPlanExecution status(BackupPlanExecutionStatus status) {

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
    public BackupPlanExecutionStatus getStatus() {
        return status;
    }

    public void setStatus(BackupPlanExecutionStatus status) {
        this.status = status;
    }

    public BackupPlanExecution status_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATUS);
        return this;
    }

    public BackupPlanExecution status_ExplictlyNonNull() {
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

    public BackupPlanExecution successJobCount(Integer successJobCount) {

        this.successJobCount = successJobCount;
        return this;
    }

    /**
     * Get successJobCount
     *
     * @return successJobCount
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getSuccessJobCount() {
        return successJobCount;
    }

    public void setSuccessJobCount(Integer successJobCount) {
        this.successJobCount = successJobCount;
    }

    public BackupPlanExecution successJobCount_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUCCESS_JOB_COUNT);
        return this;
    }

    public BackupPlanExecution successJobCount_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SUCCESS_JOB_COUNT);
        return this;
    }

    public void setSuccessJobCount_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SUCCESS_JOB_COUNT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SUCCESS_JOB_COUNT);
        }
    }

    public boolean getSuccessJobCount_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SUCCESS_JOB_COUNT);
    }

    public BackupPlanExecution totalJobCount(Integer totalJobCount) {

        this.totalJobCount = totalJobCount;
        return this;
    }

    /**
     * Get totalJobCount
     *
     * @return totalJobCount
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getTotalJobCount() {
        return totalJobCount;
    }

    public void setTotalJobCount(Integer totalJobCount) {
        this.totalJobCount = totalJobCount;
    }

    public BackupPlanExecution totalJobCount_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_JOB_COUNT);
        return this;
    }

    public BackupPlanExecution totalJobCount_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_JOB_COUNT);
        return this;
    }

    public void setTotalJobCount_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_JOB_COUNT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_JOB_COUNT);
        }
    }

    public boolean getTotalJobCount_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_JOB_COUNT);
    }

    public BackupPlanExecution type(BackupExecutionType type) {

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

    public BackupPlanExecution type_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE);
        return this;
    }

    public BackupPlanExecution type_ExplictlyNonNull() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BackupPlanExecution backupPlanExecution = (BackupPlanExecution) o;
        return Objects.equals(this.backupPlan, backupPlanExecution.backupPlan)
                && Objects.equals(this.deletableFlagMarked, backupPlanExecution.deletableFlagMarked)
                && Objects.equals(this.duration, backupPlanExecution.duration)
                && Objects.equals(this.entityAsyncStatus, backupPlanExecution.entityAsyncStatus)
                && Objects.equals(this.executedAt, backupPlanExecution.executedAt)
                && Objects.equals(this.id, backupPlanExecution.id)
                && Objects.equals(this.localCreatedAt, backupPlanExecution.localCreatedAt)
                && Objects.equals(this.localId, backupPlanExecution.localId)
                && Objects.equals(this.method, backupPlanExecution.method)
                && Objects.equals(this.state, backupPlanExecution.state)
                && Objects.equals(this.status, backupPlanExecution.status)
                && Objects.equals(this.successJobCount, backupPlanExecution.successJobCount)
                && Objects.equals(this.totalJobCount, backupPlanExecution.totalJobCount)
                && Objects.equals(this.type, backupPlanExecution.type);
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
                backupPlan,
                deletableFlagMarked,
                duration,
                entityAsyncStatus,
                executedAt,
                id,
                localCreatedAt,
                localId,
                method,
                state,
                status,
                successJobCount,
                totalJobCount,
                type);
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
        sb.append("class BackupPlanExecution {\n");
        sb.append("    backupPlan: ").append(toIndentedString(backupPlan)).append("\n");
        sb.append("    deletableFlagMarked: ")
                .append(toIndentedString(deletableFlagMarked))
                .append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    entityAsyncStatus: ")
                .append(toIndentedString(entityAsyncStatus))
                .append("\n");
        sb.append("    executedAt: ").append(toIndentedString(executedAt)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    localCreatedAt: ").append(toIndentedString(localCreatedAt)).append("\n");
        sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
        sb.append("    method: ").append(toIndentedString(method)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    successJobCount: ").append(toIndentedString(successJobCount)).append("\n");
        sb.append("    totalJobCount: ").append(toIndentedString(totalJobCount)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

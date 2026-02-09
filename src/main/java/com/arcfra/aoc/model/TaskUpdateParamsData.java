package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** TaskUpdateParamsData */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class TaskUpdateParamsData
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_FINISHED_AT = "finished_at";

    @SerializedName(SERIALIZED_NAME_FINISHED_AT)
    private String finishedAt;

    public static final String SERIALIZED_NAME_STARTED_AT = "started_at";

    @SerializedName(SERIALIZED_NAME_STARTED_AT)
    private String startedAt;

    public static final String SERIALIZED_NAME_RESOURCE_ROLLBACK_RETRY_COUNT =
            "resource_rollback_retry_count";

    @SerializedName(SERIALIZED_NAME_RESOURCE_ROLLBACK_RETRY_COUNT)
    private Integer resourceRollbackRetryCount;

    public static final String SERIALIZED_NAME_RESOURCE_ROLLBACK_ERROR = "resource_rollback_error";

    @SerializedName(SERIALIZED_NAME_RESOURCE_ROLLBACK_ERROR)
    private String resourceRollbackError;

    public static final String SERIALIZED_NAME_RESOURCE_ROLLBACKED = "resource_rollbacked";

    @SerializedName(SERIALIZED_NAME_RESOURCE_ROLLBACKED)
    private Boolean resourceRollbacked;

    public static final String SERIALIZED_NAME_STEPS = "steps";

    @SerializedName(SERIALIZED_NAME_STEPS)
    private List<TaskStepCreationParams> steps = null;

    public static final String SERIALIZED_NAME_ERROR_MESSAGE = "error_message";

    @SerializedName(SERIALIZED_NAME_ERROR_MESSAGE)
    private String errorMessage;

    public static final String SERIALIZED_NAME_ERROR_CODE = "error_code";

    @SerializedName(SERIALIZED_NAME_ERROR_CODE)
    private String errorCode;

    public static final String SERIALIZED_NAME_PROGRESS = "progress";

    @SerializedName(SERIALIZED_NAME_PROGRESS)
    private Float progress;

    public static final String SERIALIZED_NAME_STATUS = "status";

    @SerializedName(SERIALIZED_NAME_STATUS)
    private TaskStatus status;

    public static final String SERIALIZED_NAME_SNAPSHOT = "snapshot";

    @SerializedName(SERIALIZED_NAME_SNAPSHOT)
    private String snapshot;

    public static final String SERIALIZED_NAME_ARGS = "args";

    @SerializedName(SERIALIZED_NAME_ARGS)
    private Object args;

    public static final String SERIALIZED_NAME_KEY = "key";

    @SerializedName(SERIALIZED_NAME_KEY)
    private String key;

    public static final String SERIALIZED_NAME_TYPE = "type";

    @SerializedName(SERIALIZED_NAME_TYPE)
    private TaskType type;

    public static final String SERIALIZED_NAME_RESOURCE_ID = "resource_id";

    @SerializedName(SERIALIZED_NAME_RESOURCE_ID)
    private String resourceId;

    public static final String SERIALIZED_NAME_CLUSTER_ID = "cluster_id";

    @SerializedName(SERIALIZED_NAME_CLUSTER_ID)
    private String clusterId;

    public static final String SERIALIZED_NAME_USER_ID = "user_id";

    @SerializedName(SERIALIZED_NAME_USER_ID)
    private String userId;

    public static final String SERIALIZED_NAME_RESOURCE_MUTATION = "resource_mutation";

    @SerializedName(SERIALIZED_NAME_RESOURCE_MUTATION)
    private String resourceMutation;

    public static final String SERIALIZED_NAME_RESOURCE_TYPE = "resource_type";

    @SerializedName(SERIALIZED_NAME_RESOURCE_TYPE)
    private String resourceType;

    public static final String SERIALIZED_NAME_DESCRIPTION = "description";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION)
    private TaskDescription description;

    public TaskUpdateParamsData() {}

    public TaskUpdateParamsData finishedAt(String finishedAt) {

        this.finishedAt = finishedAt;
        return this;
    }

    /**
     * Get finishedAt
     *
     * @return finishedAt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getFinishedAt() {
        return finishedAt;
    }

    public void setFinishedAt(String finishedAt) {
        this.finishedAt = finishedAt;
    }

    public TaskUpdateParamsData finishedAt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FINISHED_AT);
        return this;
    }

    public TaskUpdateParamsData finishedAt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FINISHED_AT);
        return this;
    }

    public void setFinishedAt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FINISHED_AT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FINISHED_AT);
        }
    }

    public boolean getFinishedAt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FINISHED_AT);
    }

    public TaskUpdateParamsData startedAt(String startedAt) {

        this.startedAt = startedAt;
        return this;
    }

    /**
     * Get startedAt
     *
     * @return startedAt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getStartedAt() {
        return startedAt;
    }

    public void setStartedAt(String startedAt) {
        this.startedAt = startedAt;
    }

    public TaskUpdateParamsData startedAt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STARTED_AT);
        return this;
    }

    public TaskUpdateParamsData startedAt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STARTED_AT);
        return this;
    }

    public void setStartedAt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STARTED_AT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STARTED_AT);
        }
    }

    public boolean getStartedAt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STARTED_AT);
    }

    public TaskUpdateParamsData resourceRollbackRetryCount(Integer resourceRollbackRetryCount) {

        this.resourceRollbackRetryCount = resourceRollbackRetryCount;
        return this;
    }

    /**
     * Get resourceRollbackRetryCount
     *
     * @return resourceRollbackRetryCount
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getResourceRollbackRetryCount() {
        return resourceRollbackRetryCount;
    }

    public void setResourceRollbackRetryCount(Integer resourceRollbackRetryCount) {
        this.resourceRollbackRetryCount = resourceRollbackRetryCount;
    }

    public TaskUpdateParamsData resourceRollbackRetryCount_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_ROLLBACK_RETRY_COUNT);
        return this;
    }

    public TaskUpdateParamsData resourceRollbackRetryCount_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_ROLLBACK_RETRY_COUNT);
        return this;
    }

    public void setResourceRollbackRetryCount_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_ROLLBACK_RETRY_COUNT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_ROLLBACK_RETRY_COUNT);
        }
    }

    public boolean getResourceRollbackRetryCount_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_ROLLBACK_RETRY_COUNT);
    }

    public TaskUpdateParamsData resourceRollbackError(String resourceRollbackError) {

        this.resourceRollbackError = resourceRollbackError;
        return this;
    }

    /**
     * Get resourceRollbackError
     *
     * @return resourceRollbackError
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getResourceRollbackError() {
        return resourceRollbackError;
    }

    public void setResourceRollbackError(String resourceRollbackError) {
        this.resourceRollbackError = resourceRollbackError;
    }

    public TaskUpdateParamsData resourceRollbackError_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_ROLLBACK_ERROR);
        return this;
    }

    public TaskUpdateParamsData resourceRollbackError_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_ROLLBACK_ERROR);
        return this;
    }

    public void setResourceRollbackError_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_ROLLBACK_ERROR);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_ROLLBACK_ERROR);
        }
    }

    public boolean getResourceRollbackError_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_ROLLBACK_ERROR);
    }

    public TaskUpdateParamsData resourceRollbacked(Boolean resourceRollbacked) {

        this.resourceRollbacked = resourceRollbacked;
        return this;
    }

    /**
     * Get resourceRollbacked
     *
     * @return resourceRollbacked
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getResourceRollbacked() {
        return resourceRollbacked;
    }

    public void setResourceRollbacked(Boolean resourceRollbacked) {
        this.resourceRollbacked = resourceRollbacked;
    }

    public TaskUpdateParamsData resourceRollbacked_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_ROLLBACKED);
        return this;
    }

    public TaskUpdateParamsData resourceRollbacked_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_ROLLBACKED);
        return this;
    }

    public void setResourceRollbacked_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_ROLLBACKED);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_ROLLBACKED);
        }
    }

    public boolean getResourceRollbacked_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_ROLLBACKED);
    }

    public TaskUpdateParamsData steps(List<TaskStepCreationParams> steps) {

        this.steps = steps;
        return this;
    }

    public TaskUpdateParamsData addStepsItem(TaskStepCreationParams stepsItem) {
        if (this.steps == null) {
            this.steps = new ArrayList<TaskStepCreationParams>();
        }
        this.steps.add(stepsItem);
        return this;
    }

    /**
     * Get steps
     *
     * @return steps
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<TaskStepCreationParams> getSteps() {
        return steps;
    }

    public void setSteps(List<TaskStepCreationParams> steps) {
        this.steps = steps;
    }

    public TaskUpdateParamsData steps_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STEPS);
        return this;
    }

    public TaskUpdateParamsData steps_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STEPS);
        return this;
    }

    public void setSteps_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STEPS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STEPS);
        }
    }

    public boolean getSteps_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STEPS);
    }

    public TaskUpdateParamsData errorMessage(String errorMessage) {

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

    public TaskUpdateParamsData errorMessage_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ERROR_MESSAGE);
        return this;
    }

    public TaskUpdateParamsData errorMessage_ExplictlyNonNull() {
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

    public TaskUpdateParamsData errorCode(String errorCode) {

        this.errorCode = errorCode;
        return this;
    }

    /**
     * Get errorCode
     *
     * @return errorCode
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public TaskUpdateParamsData errorCode_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ERROR_CODE);
        return this;
    }

    public TaskUpdateParamsData errorCode_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ERROR_CODE);
        return this;
    }

    public void setErrorCode_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ERROR_CODE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ERROR_CODE);
        }
    }

    public boolean getErrorCode_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ERROR_CODE);
    }

    public TaskUpdateParamsData progress(Float progress) {

        this.progress = progress;
        return this;
    }

    /**
     * Get progress
     *
     * @return progress
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Float getProgress() {
        return progress;
    }

    public void setProgress(Float progress) {
        this.progress = progress;
    }

    public TaskUpdateParamsData progress_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PROGRESS);
        return this;
    }

    public TaskUpdateParamsData progress_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PROGRESS);
        return this;
    }

    public void setProgress_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PROGRESS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PROGRESS);
        }
    }

    public boolean getProgress_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PROGRESS);
    }

    public TaskUpdateParamsData status(TaskStatus status) {

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
    public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    public TaskUpdateParamsData status_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATUS);
        return this;
    }

    public TaskUpdateParamsData status_ExplictlyNonNull() {
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

    public TaskUpdateParamsData snapshot(String snapshot) {

        this.snapshot = snapshot;
        return this;
    }

    /**
     * Get snapshot
     *
     * @return snapshot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSnapshot() {
        return snapshot;
    }

    public void setSnapshot(String snapshot) {
        this.snapshot = snapshot;
    }

    public TaskUpdateParamsData snapshot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT);
        return this;
    }

    public TaskUpdateParamsData snapshot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SNAPSHOT);
        return this;
    }

    public void setSnapshot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SNAPSHOT);
        }
    }

    public boolean getSnapshot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SNAPSHOT);
    }

    public TaskUpdateParamsData args(Object args) {

        this.args = args;
        return this;
    }

    /**
     * Get args
     *
     * @return args
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Object getArgs() {
        return args;
    }

    public void setArgs(Object args) {
        this.args = args;
    }

    public TaskUpdateParamsData args_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ARGS);
        return this;
    }

    public TaskUpdateParamsData args_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ARGS);
        return this;
    }

    public void setArgs_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ARGS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ARGS);
        }
    }

    public boolean getArgs_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ARGS);
    }

    public TaskUpdateParamsData key(String key) {

        this.key = key;
        return this;
    }

    /**
     * Get key
     *
     * @return key
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public TaskUpdateParamsData key_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KEY);
        return this;
    }

    public TaskUpdateParamsData key_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_KEY);
        return this;
    }

    public void setKey_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_KEY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_KEY);
        }
    }

    public boolean getKey_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_KEY);
    }

    public TaskUpdateParamsData type(TaskType type) {

        this.type = type;
        return this;
    }

    /**
     * Get type
     *
     * @return type
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public TaskType getType() {
        return type;
    }

    public void setType(TaskType type) {
        this.type = type;
    }

    public TaskUpdateParamsData type_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE);
        return this;
    }

    public TaskUpdateParamsData type_ExplictlyNonNull() {
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

    public TaskUpdateParamsData resourceId(String resourceId) {

        this.resourceId = resourceId;
        return this;
    }

    /**
     * Get resourceId
     *
     * @return resourceId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public TaskUpdateParamsData resourceId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_ID);
        return this;
    }

    public TaskUpdateParamsData resourceId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_ID);
        return this;
    }

    public void setResourceId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_ID);
        }
    }

    public boolean getResourceId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_ID);
    }

    public TaskUpdateParamsData clusterId(String clusterId) {

        this.clusterId = clusterId;
        return this;
    }

    /**
     * Get clusterId
     *
     * @return clusterId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public TaskUpdateParamsData clusterId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER_ID);
        return this;
    }

    public TaskUpdateParamsData clusterId_ExplictlyNonNull() {
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

    public TaskUpdateParamsData userId(String userId) {

        this.userId = userId;
        return this;
    }

    /**
     * Get userId
     *
     * @return userId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public TaskUpdateParamsData userId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USER_ID);
        return this;
    }

    public TaskUpdateParamsData userId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USER_ID);
        return this;
    }

    public void setUserId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USER_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USER_ID);
        }
    }

    public boolean getUserId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USER_ID);
    }

    public TaskUpdateParamsData resourceMutation(String resourceMutation) {

        this.resourceMutation = resourceMutation;
        return this;
    }

    /**
     * Get resourceMutation
     *
     * @return resourceMutation
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getResourceMutation() {
        return resourceMutation;
    }

    public void setResourceMutation(String resourceMutation) {
        this.resourceMutation = resourceMutation;
    }

    public TaskUpdateParamsData resourceMutation_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_MUTATION);
        return this;
    }

    public TaskUpdateParamsData resourceMutation_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_MUTATION);
        return this;
    }

    public void setResourceMutation_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_MUTATION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_MUTATION);
        }
    }

    public boolean getResourceMutation_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_MUTATION);
    }

    public TaskUpdateParamsData resourceType(String resourceType) {

        this.resourceType = resourceType;
        return this;
    }

    /**
     * Get resourceType
     *
     * @return resourceType
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public TaskUpdateParamsData resourceType_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_TYPE);
        return this;
    }

    public TaskUpdateParamsData resourceType_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_TYPE);
        return this;
    }

    public void setResourceType_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_TYPE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_TYPE);
        }
    }

    public boolean getResourceType_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_TYPE);
    }

    public TaskUpdateParamsData description(TaskDescription description) {

        this.description = description;
        return this;
    }

    /**
     * Get description
     *
     * @return description
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public TaskDescription getDescription() {
        return description;
    }

    public void setDescription(TaskDescription description) {
        this.description = description;
    }

    public TaskUpdateParamsData description_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION);
        return this;
    }

    public TaskUpdateParamsData description_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION);
        return this;
    }

    public void setDescription_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION);
        }
    }

    public boolean getDescription_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESCRIPTION);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TaskUpdateParamsData taskUpdateParamsData = (TaskUpdateParamsData) o;
        return Objects.equals(this.finishedAt, taskUpdateParamsData.finishedAt)
                && Objects.equals(this.startedAt, taskUpdateParamsData.startedAt)
                && Objects.equals(
                        this.resourceRollbackRetryCount,
                        taskUpdateParamsData.resourceRollbackRetryCount)
                && Objects.equals(
                        this.resourceRollbackError, taskUpdateParamsData.resourceRollbackError)
                && Objects.equals(this.resourceRollbacked, taskUpdateParamsData.resourceRollbacked)
                && Objects.equals(this.steps, taskUpdateParamsData.steps)
                && Objects.equals(this.errorMessage, taskUpdateParamsData.errorMessage)
                && Objects.equals(this.errorCode, taskUpdateParamsData.errorCode)
                && Objects.equals(this.progress, taskUpdateParamsData.progress)
                && Objects.equals(this.status, taskUpdateParamsData.status)
                && Objects.equals(this.snapshot, taskUpdateParamsData.snapshot)
                && Objects.equals(this.args, taskUpdateParamsData.args)
                && Objects.equals(this.key, taskUpdateParamsData.key)
                && Objects.equals(this.type, taskUpdateParamsData.type)
                && Objects.equals(this.resourceId, taskUpdateParamsData.resourceId)
                && Objects.equals(this.clusterId, taskUpdateParamsData.clusterId)
                && Objects.equals(this.userId, taskUpdateParamsData.userId)
                && Objects.equals(this.resourceMutation, taskUpdateParamsData.resourceMutation)
                && Objects.equals(this.resourceType, taskUpdateParamsData.resourceType)
                && Objects.equals(this.description, taskUpdateParamsData.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                finishedAt,
                startedAt,
                resourceRollbackRetryCount,
                resourceRollbackError,
                resourceRollbacked,
                steps,
                errorMessage,
                errorCode,
                progress,
                status,
                snapshot,
                args,
                key,
                type,
                resourceId,
                clusterId,
                userId,
                resourceMutation,
                resourceType,
                description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskUpdateParamsData {\n");
        sb.append("    finishedAt: ").append(toIndentedString(finishedAt)).append("\n");
        sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
        sb.append("    resourceRollbackRetryCount: ")
                .append(toIndentedString(resourceRollbackRetryCount))
                .append("\n");
        sb.append("    resourceRollbackError: ")
                .append(toIndentedString(resourceRollbackError))
                .append("\n");
        sb.append("    resourceRollbacked: ")
                .append(toIndentedString(resourceRollbacked))
                .append("\n");
        sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
        sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    snapshot: ").append(toIndentedString(snapshot)).append("\n");
        sb.append("    args: ").append(toIndentedString(args)).append("\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    resourceMutation: ").append(toIndentedString(resourceMutation)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

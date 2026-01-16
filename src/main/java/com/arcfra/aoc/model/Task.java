package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** Task */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class Task extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_ARGS = "args";

    @SerializedName(SERIALIZED_NAME_ARGS)
    private Object args;

    public static final String SERIALIZED_NAME_CLUSTER = "cluster";

    @SerializedName(SERIALIZED_NAME_CLUSTER)
    private NestedCluster cluster;

    public static final String SERIALIZED_NAME_DESCRIPTION = "description";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION)
    private String description;

    public static final String SERIALIZED_NAME_ERROR_CODE = "error_code";

    @SerializedName(SERIALIZED_NAME_ERROR_CODE)
    private String errorCode;

    public static final String SERIALIZED_NAME_ERROR_MESSAGE = "error_message";

    @SerializedName(SERIALIZED_NAME_ERROR_MESSAGE)
    private String errorMessage;

    public static final String SERIALIZED_NAME_FINISHED_AT = "finished_at";

    @SerializedName(SERIALIZED_NAME_FINISHED_AT)
    private String finishedAt;

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

    public static final String SERIALIZED_NAME_INTERNAL = "internal";

    @SerializedName(SERIALIZED_NAME_INTERNAL)
    private Boolean internal;

    public static final String SERIALIZED_NAME_KEY = "key";

    @SerializedName(SERIALIZED_NAME_KEY)
    private String key;

    public static final String SERIALIZED_NAME_LOCAL_CREATED_AT = "local_created_at";

    @SerializedName(SERIALIZED_NAME_LOCAL_CREATED_AT)
    private String localCreatedAt;

    public static final String SERIALIZED_NAME_PROGRESS = "progress";

    @SerializedName(SERIALIZED_NAME_PROGRESS)
    private Double progress;

    public static final String SERIALIZED_NAME_RESOURCE_ID = "resource_id";

    @SerializedName(SERIALIZED_NAME_RESOURCE_ID)
    private String resourceId;

    public static final String SERIALIZED_NAME_RESOURCE_MUTATION = "resource_mutation";

    @SerializedName(SERIALIZED_NAME_RESOURCE_MUTATION)
    private String resourceMutation;

    public static final String SERIALIZED_NAME_RESOURCE_ROLLBACK_ERROR = "resource_rollback_error";

    @SerializedName(SERIALIZED_NAME_RESOURCE_ROLLBACK_ERROR)
    private String resourceRollbackError;

    public static final String SERIALIZED_NAME_RESOURCE_ROLLBACK_RETRY_COUNT =
            "resource_rollback_retry_count";

    @SerializedName(SERIALIZED_NAME_RESOURCE_ROLLBACK_RETRY_COUNT)
    private Integer resourceRollbackRetryCount;

    public static final String SERIALIZED_NAME_RESOURCE_ROLLBACKED = "resource_rollbacked";

    @SerializedName(SERIALIZED_NAME_RESOURCE_ROLLBACKED)
    private Boolean resourceRollbacked;

    public static final String SERIALIZED_NAME_RESOURCE_TYPE = "resource_type";

    @SerializedName(SERIALIZED_NAME_RESOURCE_TYPE)
    private String resourceType;

    public static final String SERIALIZED_NAME_SNAPSHOT = "snapshot";

    @SerializedName(SERIALIZED_NAME_SNAPSHOT)
    private String snapshot;

    public static final String SERIALIZED_NAME_STARTED_AT = "started_at";

    @SerializedName(SERIALIZED_NAME_STARTED_AT)
    private String startedAt;

    public static final String SERIALIZED_NAME_STATUS = "status";

    @SerializedName(SERIALIZED_NAME_STATUS)
    private TaskStatus status;

    public static final String SERIALIZED_NAME_STEPS = "steps";

    @SerializedName(SERIALIZED_NAME_STEPS)
    private List<NestedStep> steps = new ArrayList<NestedStep>();

    public static final String SERIALIZED_NAME_TYPE = "type";

    @SerializedName(SERIALIZED_NAME_TYPE)
    private TaskType type;

    public static final String SERIALIZED_NAME_USER = "user";

    @SerializedName(SERIALIZED_NAME_USER)
    private NestedUser user;

    public Task() {}

    public Task args(Object args) {

        this.args = args;
        return this;
    }

    /**
     * Get args
     *
     * @return args
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Object getArgs() {
        return args;
    }

    public void setArgs(Object args) {
        this.args = args;
    }

    public Task args_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ARGS);
        return this;
    }

    public Task args_ExplictlyNonNull() {
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

    public Task cluster(NestedCluster cluster) {

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
    public NestedCluster getCluster() {
        return cluster;
    }

    public void setCluster(NestedCluster cluster) {
        this.cluster = cluster;
    }

    public Task cluster_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER);
        return this;
    }

    public Task cluster_ExplictlyNonNull() {
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

    public Task description(String description) {

        this.description = description;
        return this;
    }

    /**
     * Get description
     *
     * @return description
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Task description_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION);
        return this;
    }

    public Task description_ExplictlyNonNull() {
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

    public Task errorCode(String errorCode) {

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

    public Task errorCode_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ERROR_CODE);
        return this;
    }

    public Task errorCode_ExplictlyNonNull() {
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

    public Task errorMessage(String errorMessage) {

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

    public Task errorMessage_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ERROR_MESSAGE);
        return this;
    }

    public Task errorMessage_ExplictlyNonNull() {
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

    public Task finishedAt(String finishedAt) {

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

    public Task finishedAt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FINISHED_AT);
        return this;
    }

    public Task finishedAt_ExplictlyNonNull() {
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

    public Task id(String id) {

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

    public Task id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public Task id_ExplictlyNonNull() {
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

    public Task internal(Boolean internal) {

        this.internal = internal;
        return this;
    }

    /**
     * Get internal
     *
     * @return internal
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Boolean getInternal() {
        return internal;
    }

    public void setInternal(Boolean internal) {
        this.internal = internal;
    }

    public Task internal_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INTERNAL);
        return this;
    }

    public Task internal_ExplictlyNonNull() {
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

    public Task key(String key) {

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

    public Task key_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KEY);
        return this;
    }

    public Task key_ExplictlyNonNull() {
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

    public Task localCreatedAt(String localCreatedAt) {

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

    public Task localCreatedAt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATED_AT);
        return this;
    }

    public Task localCreatedAt_ExplictlyNonNull() {
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

    public Task progress(Double progress) {

        this.progress = progress;
        return this;
    }

    /**
     * Get progress
     *
     * @return progress
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Double getProgress() {
        return progress;
    }

    public void setProgress(Double progress) {
        this.progress = progress;
    }

    public Task progress_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PROGRESS);
        return this;
    }

    public Task progress_ExplictlyNonNull() {
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

    public Task resourceId(String resourceId) {

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

    public Task resourceId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_ID);
        return this;
    }

    public Task resourceId_ExplictlyNonNull() {
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

    public Task resourceMutation(String resourceMutation) {

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

    public Task resourceMutation_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_MUTATION);
        return this;
    }

    public Task resourceMutation_ExplictlyNonNull() {
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

    public Task resourceRollbackError(String resourceRollbackError) {

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

    public Task resourceRollbackError_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_ROLLBACK_ERROR);
        return this;
    }

    public Task resourceRollbackError_ExplictlyNonNull() {
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

    public Task resourceRollbackRetryCount(Integer resourceRollbackRetryCount) {

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

    public Task resourceRollbackRetryCount_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_ROLLBACK_RETRY_COUNT);
        return this;
    }

    public Task resourceRollbackRetryCount_ExplictlyNonNull() {
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

    public Task resourceRollbacked(Boolean resourceRollbacked) {

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

    public Task resourceRollbacked_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_ROLLBACKED);
        return this;
    }

    public Task resourceRollbacked_ExplictlyNonNull() {
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

    public Task resourceType(String resourceType) {

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

    public Task resourceType_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_TYPE);
        return this;
    }

    public Task resourceType_ExplictlyNonNull() {
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

    public Task snapshot(String snapshot) {

        this.snapshot = snapshot;
        return this;
    }

    /**
     * Get snapshot
     *
     * @return snapshot
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getSnapshot() {
        return snapshot;
    }

    public void setSnapshot(String snapshot) {
        this.snapshot = snapshot;
    }

    public Task snapshot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT);
        return this;
    }

    public Task snapshot_ExplictlyNonNull() {
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

    public Task startedAt(String startedAt) {

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

    public Task startedAt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STARTED_AT);
        return this;
    }

    public Task startedAt_ExplictlyNonNull() {
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

    public Task status(TaskStatus status) {

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
    public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    public Task status_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATUS);
        return this;
    }

    public Task status_ExplictlyNonNull() {
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

    public Task steps(List<NestedStep> steps) {

        this.steps = steps;
        return this;
    }

    public Task addStepsItem(NestedStep stepsItem) {
        this.steps.add(stepsItem);
        return this;
    }

    /**
     * Get steps
     *
     * @return steps
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public List<NestedStep> getSteps() {
        return steps;
    }

    public void setSteps(List<NestedStep> steps) {
        this.steps = steps;
    }

    public Task steps_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STEPS);
        return this;
    }

    public Task steps_ExplictlyNonNull() {
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

    public Task type(TaskType type) {

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

    public Task type_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE);
        return this;
    }

    public Task type_ExplictlyNonNull() {
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

    public Task user(NestedUser user) {

        this.user = user;
        return this;
    }

    /**
     * Get user
     *
     * @return user
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NestedUser getUser() {
        return user;
    }

    public void setUser(NestedUser user) {
        this.user = user;
    }

    public Task user_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USER);
        return this;
    }

    public Task user_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USER);
        return this;
    }

    public void setUser_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USER);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USER);
        }
    }

    public boolean getUser_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USER);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Task task = (Task) o;
        return Objects.equals(this.args, task.args)
                && Objects.equals(this.cluster, task.cluster)
                && Objects.equals(this.description, task.description)
                && Objects.equals(this.errorCode, task.errorCode)
                && Objects.equals(this.errorMessage, task.errorMessage)
                && Objects.equals(this.finishedAt, task.finishedAt)
                && Objects.equals(this.id, task.id)
                && Objects.equals(this.internal, task.internal)
                && Objects.equals(this.key, task.key)
                && Objects.equals(this.localCreatedAt, task.localCreatedAt)
                && Objects.equals(this.progress, task.progress)
                && Objects.equals(this.resourceId, task.resourceId)
                && Objects.equals(this.resourceMutation, task.resourceMutation)
                && Objects.equals(this.resourceRollbackError, task.resourceRollbackError)
                && Objects.equals(this.resourceRollbackRetryCount, task.resourceRollbackRetryCount)
                && Objects.equals(this.resourceRollbacked, task.resourceRollbacked)
                && Objects.equals(this.resourceType, task.resourceType)
                && Objects.equals(this.snapshot, task.snapshot)
                && Objects.equals(this.startedAt, task.startedAt)
                && Objects.equals(this.status, task.status)
                && Objects.equals(this.steps, task.steps)
                && Objects.equals(this.type, task.type)
                && Objects.equals(this.user, task.user);
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
                args,
                cluster,
                description,
                errorCode,
                errorMessage,
                finishedAt,
                id,
                internal,
                key,
                localCreatedAt,
                progress,
                resourceId,
                resourceMutation,
                resourceRollbackError,
                resourceRollbackRetryCount,
                resourceRollbacked,
                resourceType,
                snapshot,
                startedAt,
                status,
                steps,
                type,
                user);
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
        sb.append("class Task {\n");
        sb.append("    args: ").append(toIndentedString(args)).append("\n");
        sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
        sb.append("    finishedAt: ").append(toIndentedString(finishedAt)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    internal: ").append(toIndentedString(internal)).append("\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    localCreatedAt: ").append(toIndentedString(localCreatedAt)).append("\n");
        sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    resourceMutation: ").append(toIndentedString(resourceMutation)).append("\n");
        sb.append("    resourceRollbackError: ")
                .append(toIndentedString(resourceRollbackError))
                .append("\n");
        sb.append("    resourceRollbackRetryCount: ")
                .append(toIndentedString(resourceRollbackRetryCount))
                .append("\n");
        sb.append("    resourceRollbacked: ")
                .append(toIndentedString(resourceRollbacked))
                .append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    snapshot: ").append(toIndentedString(snapshot)).append("\n");
        sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

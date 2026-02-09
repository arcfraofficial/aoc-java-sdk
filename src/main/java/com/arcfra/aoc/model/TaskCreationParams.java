package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** TaskCreationParams */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class TaskCreationParams extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_API_KEY_NAME = "api_key_name";

    @SerializedName(SERIALIZED_NAME_API_KEY_NAME)
    private String apiKeyName;

    public static final String SERIALIZED_NAME_SNAPSHOT = "snapshot";

    @SerializedName(SERIALIZED_NAME_SNAPSHOT)
    private String snapshot;

    public static final String SERIALIZED_NAME_STATUS = "status";

    @SerializedName(SERIALIZED_NAME_STATUS)
    private TaskStatus status;

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

    public static final String SERIALIZED_NAME_FINISHED_AT = "finished_at";

    @SerializedName(SERIALIZED_NAME_FINISHED_AT)
    private String finishedAt;

    public static final String SERIALIZED_NAME_STARTED_AT = "started_at";

    @SerializedName(SERIALIZED_NAME_STARTED_AT)
    private String startedAt;

    public static final String SERIALIZED_NAME_STEPS = "steps";

    @SerializedName(SERIALIZED_NAME_STEPS)
    private List<TaskStepCreationParams> steps = null;

    public static final String SERIALIZED_NAME_ARGS = "args";

    @SerializedName(SERIALIZED_NAME_ARGS)
    private Object args;

    public static final String SERIALIZED_NAME_KEY = "key";

    @SerializedName(SERIALIZED_NAME_KEY)
    private String key;

    public static final String SERIALIZED_NAME_INTERNAL = "internal";

    @SerializedName(SERIALIZED_NAME_INTERNAL)
    private Boolean internal;

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

    public static final String SERIALIZED_NAME_DESCRIPTION = "description";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION)
    private TaskDescription description;

    public static final String SERIALIZED_NAME_RESOURCE_MUTATION = "resource_mutation";

    @SerializedName(SERIALIZED_NAME_RESOURCE_MUTATION)
    private String resourceMutation;

    public static final String SERIALIZED_NAME_RESOURCE_TYPE = "resource_type";

    @SerializedName(SERIALIZED_NAME_RESOURCE_TYPE)
    private String resourceType;

    public TaskCreationParams() {}

    public TaskCreationParams apiKeyName(String apiKeyName) {

        this.apiKeyName = apiKeyName;
        return this;
    }

    /**
     * Get apiKeyName
     *
     * @return apiKeyName
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getApiKeyName() {
        return apiKeyName;
    }

    public void setApiKeyName(String apiKeyName) {
        this.apiKeyName = apiKeyName;
    }

    public TaskCreationParams apiKeyName_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_API_KEY_NAME);
        return this;
    }

    public TaskCreationParams apiKeyName_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_API_KEY_NAME);
        return this;
    }

    public void setApiKeyName_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_API_KEY_NAME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_API_KEY_NAME);
        }
    }

    public boolean getApiKeyName_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_API_KEY_NAME);
    }

    public TaskCreationParams snapshot(String snapshot) {

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

    public TaskCreationParams snapshot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT);
        return this;
    }

    public TaskCreationParams snapshot_ExplictlyNonNull() {
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

    public TaskCreationParams status(TaskStatus status) {

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

    public TaskCreationParams status_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATUS);
        return this;
    }

    public TaskCreationParams status_ExplictlyNonNull() {
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

    public TaskCreationParams id(String id) {

        this.id = id;
        return this;
    }

    /**
     * Get id
     *
     * @return id
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public TaskCreationParams id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public TaskCreationParams id_ExplictlyNonNull() {
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

    public TaskCreationParams finishedAt(String finishedAt) {

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

    public TaskCreationParams finishedAt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FINISHED_AT);
        return this;
    }

    public TaskCreationParams finishedAt_ExplictlyNonNull() {
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

    public TaskCreationParams startedAt(String startedAt) {

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

    public TaskCreationParams startedAt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STARTED_AT);
        return this;
    }

    public TaskCreationParams startedAt_ExplictlyNonNull() {
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

    public TaskCreationParams steps(List<TaskStepCreationParams> steps) {

        this.steps = steps;
        return this;
    }

    public TaskCreationParams addStepsItem(TaskStepCreationParams stepsItem) {
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

    public TaskCreationParams steps_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STEPS);
        return this;
    }

    public TaskCreationParams steps_ExplictlyNonNull() {
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

    public TaskCreationParams args(Object args) {

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

    public TaskCreationParams args_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ARGS);
        return this;
    }

    public TaskCreationParams args_ExplictlyNonNull() {
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

    public TaskCreationParams key(String key) {

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

    public TaskCreationParams key_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KEY);
        return this;
    }

    public TaskCreationParams key_ExplictlyNonNull() {
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

    public TaskCreationParams internal(Boolean internal) {

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

    public TaskCreationParams internal_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INTERNAL);
        return this;
    }

    public TaskCreationParams internal_ExplictlyNonNull() {
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

    public TaskCreationParams type(TaskType type) {

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

    public TaskCreationParams type_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE);
        return this;
    }

    public TaskCreationParams type_ExplictlyNonNull() {
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

    public TaskCreationParams resourceId(String resourceId) {

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

    public TaskCreationParams resourceId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_ID);
        return this;
    }

    public TaskCreationParams resourceId_ExplictlyNonNull() {
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

    public TaskCreationParams clusterId(String clusterId) {

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

    public TaskCreationParams clusterId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER_ID);
        return this;
    }

    public TaskCreationParams clusterId_ExplictlyNonNull() {
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

    public TaskCreationParams userId(String userId) {

        this.userId = userId;
        return this;
    }

    /**
     * Get userId
     *
     * @return userId
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public TaskCreationParams userId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USER_ID);
        return this;
    }

    public TaskCreationParams userId_ExplictlyNonNull() {
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

    public TaskCreationParams description(TaskDescription description) {

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
    public TaskDescription getDescription() {
        return description;
    }

    public void setDescription(TaskDescription description) {
        this.description = description;
    }

    public TaskCreationParams description_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION);
        return this;
    }

    public TaskCreationParams description_ExplictlyNonNull() {
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

    public TaskCreationParams resourceMutation(String resourceMutation) {

        this.resourceMutation = resourceMutation;
        return this;
    }

    /**
     * Get resourceMutation
     *
     * @return resourceMutation
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getResourceMutation() {
        return resourceMutation;
    }

    public void setResourceMutation(String resourceMutation) {
        this.resourceMutation = resourceMutation;
    }

    public TaskCreationParams resourceMutation_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_MUTATION);
        return this;
    }

    public TaskCreationParams resourceMutation_ExplictlyNonNull() {
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

    public TaskCreationParams resourceType(String resourceType) {

        this.resourceType = resourceType;
        return this;
    }

    /**
     * Get resourceType
     *
     * @return resourceType
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public TaskCreationParams resourceType_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_TYPE);
        return this;
    }

    public TaskCreationParams resourceType_ExplictlyNonNull() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TaskCreationParams taskCreationParams = (TaskCreationParams) o;
        return Objects.equals(this.apiKeyName, taskCreationParams.apiKeyName)
                && Objects.equals(this.snapshot, taskCreationParams.snapshot)
                && Objects.equals(this.status, taskCreationParams.status)
                && Objects.equals(this.id, taskCreationParams.id)
                && Objects.equals(this.finishedAt, taskCreationParams.finishedAt)
                && Objects.equals(this.startedAt, taskCreationParams.startedAt)
                && Objects.equals(this.steps, taskCreationParams.steps)
                && Objects.equals(this.args, taskCreationParams.args)
                && Objects.equals(this.key, taskCreationParams.key)
                && Objects.equals(this.internal, taskCreationParams.internal)
                && Objects.equals(this.type, taskCreationParams.type)
                && Objects.equals(this.resourceId, taskCreationParams.resourceId)
                && Objects.equals(this.clusterId, taskCreationParams.clusterId)
                && Objects.equals(this.userId, taskCreationParams.userId)
                && Objects.equals(this.description, taskCreationParams.description)
                && Objects.equals(this.resourceMutation, taskCreationParams.resourceMutation)
                && Objects.equals(this.resourceType, taskCreationParams.resourceType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                apiKeyName,
                snapshot,
                status,
                id,
                finishedAt,
                startedAt,
                steps,
                args,
                key,
                internal,
                type,
                resourceId,
                clusterId,
                userId,
                description,
                resourceMutation,
                resourceType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskCreationParams {\n");
        sb.append("    apiKeyName: ").append(toIndentedString(apiKeyName)).append("\n");
        sb.append("    snapshot: ").append(toIndentedString(snapshot)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    finishedAt: ").append(toIndentedString(finishedAt)).append("\n");
        sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
        sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
        sb.append("    args: ").append(toIndentedString(args)).append("\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    internal: ").append(toIndentedString(internal)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    resourceMutation: ").append(toIndentedString(resourceMutation)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
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

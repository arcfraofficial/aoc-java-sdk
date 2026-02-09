package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** NestedTask */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class NestedTask extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_ARGS = "args";

    @SerializedName(SERIALIZED_NAME_ARGS)
    private Object args;

    public static final String SERIALIZED_NAME_DESCRIPTION = "description";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION)
    private String description;

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

    public static final String SERIALIZED_NAME_INTERNAL = "internal";

    @SerializedName(SERIALIZED_NAME_INTERNAL)
    private Boolean internal;

    public static final String SERIALIZED_NAME_LOCAL_CREATED_AT = "local_created_at";

    @SerializedName(SERIALIZED_NAME_LOCAL_CREATED_AT)
    private String localCreatedAt;

    public static final String SERIALIZED_NAME_PROGRESS = "progress";

    @SerializedName(SERIALIZED_NAME_PROGRESS)
    private Double progress;

    public static final String SERIALIZED_NAME_SNAPSHOT = "snapshot";

    @SerializedName(SERIALIZED_NAME_SNAPSHOT)
    private String snapshot;

    public static final String SERIALIZED_NAME_STATUS = "status";

    @SerializedName(SERIALIZED_NAME_STATUS)
    private TaskStatus status;

    public static final String SERIALIZED_NAME_STEPS = "steps";

    @SerializedName(SERIALIZED_NAME_STEPS)
    private List<NestedStep> steps = new ArrayList<NestedStep>();

    public NestedTask() {}

    public NestedTask args(Object args) {

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

    public NestedTask args_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ARGS);
        return this;
    }

    public NestedTask args_ExplictlyNonNull() {
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

    public NestedTask description(String description) {

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

    public NestedTask description_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION);
        return this;
    }

    public NestedTask description_ExplictlyNonNull() {
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

    public NestedTask id(String id) {

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

    public NestedTask id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public NestedTask id_ExplictlyNonNull() {
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

    public NestedTask internal(Boolean internal) {

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

    public NestedTask internal_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INTERNAL);
        return this;
    }

    public NestedTask internal_ExplictlyNonNull() {
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

    public NestedTask localCreatedAt(String localCreatedAt) {

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

    public NestedTask localCreatedAt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATED_AT);
        return this;
    }

    public NestedTask localCreatedAt_ExplictlyNonNull() {
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

    public NestedTask progress(Double progress) {

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

    public NestedTask progress_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PROGRESS);
        return this;
    }

    public NestedTask progress_ExplictlyNonNull() {
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

    public NestedTask snapshot(String snapshot) {

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

    public NestedTask snapshot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT);
        return this;
    }

    public NestedTask snapshot_ExplictlyNonNull() {
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

    public NestedTask status(TaskStatus status) {

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

    public NestedTask status_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATUS);
        return this;
    }

    public NestedTask status_ExplictlyNonNull() {
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

    public NestedTask steps(List<NestedStep> steps) {

        this.steps = steps;
        return this;
    }

    public NestedTask addStepsItem(NestedStep stepsItem) {
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

    public NestedTask steps_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STEPS);
        return this;
    }

    public NestedTask steps_ExplictlyNonNull() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NestedTask nestedTask = (NestedTask) o;
        return Objects.equals(this.args, nestedTask.args)
                && Objects.equals(this.description, nestedTask.description)
                && Objects.equals(this.id, nestedTask.id)
                && Objects.equals(this.internal, nestedTask.internal)
                && Objects.equals(this.localCreatedAt, nestedTask.localCreatedAt)
                && Objects.equals(this.progress, nestedTask.progress)
                && Objects.equals(this.snapshot, nestedTask.snapshot)
                && Objects.equals(this.status, nestedTask.status)
                && Objects.equals(this.steps, nestedTask.steps);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                args, description, id, internal, localCreatedAt, progress, snapshot, status, steps);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NestedTask {\n");
        sb.append("    args: ").append(toIndentedString(args)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    internal: ").append(toIndentedString(internal)).append("\n");
        sb.append("    localCreatedAt: ").append(toIndentedString(localCreatedAt)).append("\n");
        sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
        sb.append("    snapshot: ").append(toIndentedString(snapshot)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
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

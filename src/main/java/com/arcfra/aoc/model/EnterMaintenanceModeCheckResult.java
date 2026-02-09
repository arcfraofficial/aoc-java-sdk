package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** EnterMaintenanceModeCheckResult */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class EnterMaintenanceModeCheckResult
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_TASK_ID = "task_id";

    @SerializedName(SERIALIZED_NAME_TASK_ID)
    private String taskId;

    public EnterMaintenanceModeCheckResult() {}

    public EnterMaintenanceModeCheckResult taskId(String taskId) {

        this.taskId = taskId;
        return this;
    }

    /**
     * Get taskId
     *
     * @return taskId
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public EnterMaintenanceModeCheckResult taskId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TASK_ID);
        return this;
    }

    public EnterMaintenanceModeCheckResult taskId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TASK_ID);
        return this;
    }

    public void setTaskId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TASK_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TASK_ID);
        }
    }

    public boolean getTaskId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TASK_ID);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EnterMaintenanceModeCheckResult enterMaintenanceModeCheckResult =
                (EnterMaintenanceModeCheckResult) o;
        return Objects.equals(this.taskId, enterMaintenanceModeCheckResult.taskId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EnterMaintenanceModeCheckResult {\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
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

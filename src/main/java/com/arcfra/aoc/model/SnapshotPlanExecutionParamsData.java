package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** SnapshotPlanExecutionParamsData */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class SnapshotPlanExecutionParamsData
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_TASK_NAME = "task_name";

    @SerializedName(SERIALIZED_NAME_TASK_NAME)
    private String taskName;

    public SnapshotPlanExecutionParamsData() {}

    public SnapshotPlanExecutionParamsData taskName(String taskName) {

        this.taskName = taskName;
        return this;
    }

    /**
     * Get taskName
     *
     * @return taskName
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public SnapshotPlanExecutionParamsData taskName_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TASK_NAME);
        return this;
    }

    public SnapshotPlanExecutionParamsData taskName_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TASK_NAME);
        return this;
    }

    public void setTaskName_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TASK_NAME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TASK_NAME);
        }
    }

    public boolean getTaskName_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TASK_NAME);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SnapshotPlanExecutionParamsData snapshotPlanExecutionParamsData =
                (SnapshotPlanExecutionParamsData) o;
        return Objects.equals(this.taskName, snapshotPlanExecutionParamsData.taskName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SnapshotPlanExecutionParamsData {\n");
        sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
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

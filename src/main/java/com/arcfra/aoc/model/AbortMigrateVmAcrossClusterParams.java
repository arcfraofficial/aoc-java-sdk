package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** AbortMigrateVmAcrossClusterParams */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class AbortMigrateVmAcrossClusterParams
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_TASKS = "tasks";

    @SerializedName(SERIALIZED_NAME_TASKS)
    private TaskWhereInput tasks;

    public AbortMigrateVmAcrossClusterParams() {}

    public AbortMigrateVmAcrossClusterParams tasks(TaskWhereInput tasks) {

        this.tasks = tasks;
        return this;
    }

    /**
     * Get tasks
     *
     * @return tasks
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public TaskWhereInput getTasks() {
        return tasks;
    }

    public void setTasks(TaskWhereInput tasks) {
        this.tasks = tasks;
    }

    public AbortMigrateVmAcrossClusterParams tasks_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TASKS);
        return this;
    }

    public AbortMigrateVmAcrossClusterParams tasks_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TASKS);
        return this;
    }

    public void setTasks_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TASKS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TASKS);
        }
    }

    public boolean getTasks_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TASKS);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AbortMigrateVmAcrossClusterParams abortMigrateVmAcrossClusterParams =
                (AbortMigrateVmAcrossClusterParams) o;
        return Objects.equals(this.tasks, abortMigrateVmAcrossClusterParams.tasks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tasks);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AbortMigrateVmAcrossClusterParams {\n");
        sb.append("    tasks: ").append(toIndentedString(tasks)).append("\n");
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

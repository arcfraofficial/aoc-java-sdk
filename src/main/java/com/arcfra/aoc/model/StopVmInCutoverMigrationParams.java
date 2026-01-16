package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** StopVmInCutoverMigrationParams */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class StopVmInCutoverMigrationParams
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_FORCE = "force";

    @SerializedName(SERIALIZED_NAME_FORCE)
    private Boolean force;

    public static final String SERIALIZED_NAME_TASKS = "tasks";

    @SerializedName(SERIALIZED_NAME_TASKS)
    private TaskWhereInput tasks;

    public StopVmInCutoverMigrationParams() {}

    public StopVmInCutoverMigrationParams force(Boolean force) {

        this.force = force;
        return this;
    }

    /**
     * Get force
     *
     * @return force
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getForce() {
        return force;
    }

    public void setForce(Boolean force) {
        this.force = force;
    }

    public StopVmInCutoverMigrationParams force_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FORCE);
        return this;
    }

    public StopVmInCutoverMigrationParams force_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FORCE);
        return this;
    }

    public void setForce_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FORCE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FORCE);
        }
    }

    public boolean getForce_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FORCE);
    }

    public StopVmInCutoverMigrationParams tasks(TaskWhereInput tasks) {

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

    public StopVmInCutoverMigrationParams tasks_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TASKS);
        return this;
    }

    public StopVmInCutoverMigrationParams tasks_ExplictlyNonNull() {
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
        StopVmInCutoverMigrationParams stopVmInCutoverMigrationParams =
                (StopVmInCutoverMigrationParams) o;
        return Objects.equals(this.force, stopVmInCutoverMigrationParams.force)
                && Objects.equals(this.tasks, stopVmInCutoverMigrationParams.tasks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(force, tasks);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StopVmInCutoverMigrationParams {\n");
        sb.append("    force: ").append(toIndentedString(force)).append("\n");
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

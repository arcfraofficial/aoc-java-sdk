package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** BatchHosts */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class BatchHosts extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_TASK = "task";

    @SerializedName(SERIALIZED_NAME_TASK)
    private NestedTask task;

    public BatchHosts() {}

    public BatchHosts task(NestedTask task) {

        this.task = task;
        return this;
    }

    /**
     * Get task
     *
     * @return task
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public NestedTask getTask() {
        return task;
    }

    public void setTask(NestedTask task) {
        this.task = task;
    }

    public BatchHosts task_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TASK);
        return this;
    }

    public BatchHosts task_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TASK);
        return this;
    }

    public void setTask_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TASK);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TASK);
        }
    }

    public boolean getTask_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TASK);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchHosts batchHosts = (BatchHosts) o;
        return Objects.equals(this.task, batchHosts.task);
    }

    @Override
    public int hashCode() {
        return Objects.hash(task);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchHosts {\n");
        sb.append("    task: ").append(toIndentedString(task)).append("\n");
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

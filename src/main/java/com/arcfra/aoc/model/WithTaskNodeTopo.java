package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Arrays;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** WithTaskNodeTopo */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class WithTaskNodeTopo extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_TASK_ID = "task_id";

    @SerializedName(SERIALIZED_NAME_TASK_ID)
    private String taskId;

    public static final String SERIALIZED_NAME_DATA = "data";

    @SerializedName(SERIALIZED_NAME_DATA)
    private NodeTopo data;

    public WithTaskNodeTopo() {}

    public WithTaskNodeTopo taskId(String taskId) {

        this.taskId = taskId;
        return this;
    }

    /**
     * Get taskId
     *
     * @return taskId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public WithTaskNodeTopo taskId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TASK_ID);
        return this;
    }

    public WithTaskNodeTopo taskId_ExplictlyNonNull() {
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

    public WithTaskNodeTopo data(NodeTopo data) {

        this.data = data;
        return this;
    }

    /**
     * Get data
     *
     * @return data
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public NodeTopo getData() {
        return data;
    }

    public void setData(NodeTopo data) {
        this.data = data;
    }

    public WithTaskNodeTopo data_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATA);
        return this;
    }

    public WithTaskNodeTopo data_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATA);
        return this;
    }

    public void setData_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATA);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATA);
        }
    }

    public boolean getData_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATA);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WithTaskNodeTopo withTaskNodeTopo = (WithTaskNodeTopo) o;
        return Objects.equals(this.taskId, withTaskNodeTopo.taskId)
                && Objects.equals(this.data, withTaskNodeTopo.data);
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
        return Objects.hash(taskId, data);
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
        sb.append("class WithTaskNodeTopo {\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

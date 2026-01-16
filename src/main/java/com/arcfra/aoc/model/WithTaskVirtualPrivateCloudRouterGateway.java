package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Arrays;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** WithTaskVirtualPrivateCloudRouterGateway */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class WithTaskVirtualPrivateCloudRouterGateway
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_TASK_ID = "task_id";

    @SerializedName(SERIALIZED_NAME_TASK_ID)
    private String taskId;

    public static final String SERIALIZED_NAME_DATA = "data";

    @SerializedName(SERIALIZED_NAME_DATA)
    private VirtualPrivateCloudRouterGateway data;

    public WithTaskVirtualPrivateCloudRouterGateway() {}

    public WithTaskVirtualPrivateCloudRouterGateway taskId(String taskId) {

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

    public WithTaskVirtualPrivateCloudRouterGateway taskId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TASK_ID);
        return this;
    }

    public WithTaskVirtualPrivateCloudRouterGateway taskId_ExplictlyNonNull() {
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

    public WithTaskVirtualPrivateCloudRouterGateway data(VirtualPrivateCloudRouterGateway data) {

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
    public VirtualPrivateCloudRouterGateway getData() {
        return data;
    }

    public void setData(VirtualPrivateCloudRouterGateway data) {
        this.data = data;
    }

    public WithTaskVirtualPrivateCloudRouterGateway data_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATA);
        return this;
    }

    public WithTaskVirtualPrivateCloudRouterGateway data_ExplictlyNonNull() {
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
        WithTaskVirtualPrivateCloudRouterGateway withTaskVirtualPrivateCloudRouterGateway =
                (WithTaskVirtualPrivateCloudRouterGateway) o;
        return Objects.equals(this.taskId, withTaskVirtualPrivateCloudRouterGateway.taskId)
                && Objects.equals(this.data, withTaskVirtualPrivateCloudRouterGateway.data);
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
        sb.append("class WithTaskVirtualPrivateCloudRouterGateway {\n");
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

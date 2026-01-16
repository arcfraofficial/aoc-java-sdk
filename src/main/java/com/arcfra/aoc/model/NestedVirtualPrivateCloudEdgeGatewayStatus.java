package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** NestedVirtualPrivateCloudEdgeGatewayStatus */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class NestedVirtualPrivateCloudEdgeGatewayStatus
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_INSTANCES = "instances";

    @SerializedName(SERIALIZED_NAME_INSTANCES)
    private List<NestedVirtualPrivateCloudEdgeGatewayInstanceStatus> instances = null;

    public NestedVirtualPrivateCloudEdgeGatewayStatus() {}

    public NestedVirtualPrivateCloudEdgeGatewayStatus instances(
            List<NestedVirtualPrivateCloudEdgeGatewayInstanceStatus> instances) {

        this.instances = instances;
        return this;
    }

    public NestedVirtualPrivateCloudEdgeGatewayStatus addInstancesItem(
            NestedVirtualPrivateCloudEdgeGatewayInstanceStatus instancesItem) {
        if (this.instances == null) {
            this.instances = new ArrayList<NestedVirtualPrivateCloudEdgeGatewayInstanceStatus>();
        }
        this.instances.add(instancesItem);
        return this;
    }

    /**
     * Get instances
     *
     * @return instances
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedVirtualPrivateCloudEdgeGatewayInstanceStatus> getInstances() {
        return instances;
    }

    public void setInstances(List<NestedVirtualPrivateCloudEdgeGatewayInstanceStatus> instances) {
        this.instances = instances;
    }

    public NestedVirtualPrivateCloudEdgeGatewayStatus instances_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INSTANCES);
        return this;
    }

    public NestedVirtualPrivateCloudEdgeGatewayStatus instances_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INSTANCES);
        return this;
    }

    public void setInstances_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INSTANCES);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INSTANCES);
        }
    }

    public boolean getInstances_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INSTANCES);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NestedVirtualPrivateCloudEdgeGatewayStatus nestedVirtualPrivateCloudEdgeGatewayStatus =
                (NestedVirtualPrivateCloudEdgeGatewayStatus) o;
        return Objects.equals(this.instances, nestedVirtualPrivateCloudEdgeGatewayStatus.instances);
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
        return Objects.hash(instances);
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
        sb.append("class NestedVirtualPrivateCloudEdgeGatewayStatus {\n");
        sb.append("    instances: ").append(toIndentedString(instances)).append("\n");
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

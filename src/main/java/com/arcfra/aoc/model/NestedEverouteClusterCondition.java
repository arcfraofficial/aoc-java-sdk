package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Arrays;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** NestedEverouteClusterCondition */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class NestedEverouteClusterCondition
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_LAST_PROBE_TIME = "lastProbeTime";

    @SerializedName(SERIALIZED_NAME_LAST_PROBE_TIME)
    private String lastProbeTime;

    public static final String SERIALIZED_NAME_TYPE = "type";

    @SerializedName(SERIALIZED_NAME_TYPE)
    private String type;

    public NestedEverouteClusterCondition() {}

    public NestedEverouteClusterCondition lastProbeTime(String lastProbeTime) {

        this.lastProbeTime = lastProbeTime;
        return this;
    }

    /**
     * Get lastProbeTime
     *
     * @return lastProbeTime
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLastProbeTime() {
        return lastProbeTime;
    }

    public void setLastProbeTime(String lastProbeTime) {
        this.lastProbeTime = lastProbeTime;
    }

    public NestedEverouteClusterCondition lastProbeTime_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_PROBE_TIME);
        return this;
    }

    public NestedEverouteClusterCondition lastProbeTime_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_PROBE_TIME);
        return this;
    }

    public void setLastProbeTime_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_PROBE_TIME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_PROBE_TIME);
        }
    }

    public boolean getLastProbeTime_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LAST_PROBE_TIME);
    }

    public NestedEverouteClusterCondition type(String type) {

        this.type = type;
        return this;
    }

    /**
     * Get type
     *
     * @return type
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public NestedEverouteClusterCondition type_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE);
        return this;
    }

    public NestedEverouteClusterCondition type_ExplictlyNonNull() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NestedEverouteClusterCondition nestedEverouteClusterCondition =
                (NestedEverouteClusterCondition) o;
        return Objects.equals(this.lastProbeTime, nestedEverouteClusterCondition.lastProbeTime)
                && Objects.equals(this.type, nestedEverouteClusterCondition.type);
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
        return Objects.hash(lastProbeTime, type);
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
        sb.append("class NestedEverouteClusterCondition {\n");
        sb.append("    lastProbeTime: ").append(toIndentedString(lastProbeTime)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

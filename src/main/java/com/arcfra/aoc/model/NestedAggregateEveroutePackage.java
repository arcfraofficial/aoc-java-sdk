package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** NestedAggregateEveroutePackage */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class NestedAggregateEveroutePackage
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_COUNT = "count";

    @SerializedName(SERIALIZED_NAME_COUNT)
    private Integer count;

    public NestedAggregateEveroutePackage() {}

    public NestedAggregateEveroutePackage count(Integer count) {

        this.count = count;
        return this;
    }

    /**
     * Get count
     *
     * @return count
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public NestedAggregateEveroutePackage count_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_COUNT);
        return this;
    }

    public NestedAggregateEveroutePackage count_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_COUNT);
        return this;
    }

    public void setCount_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_COUNT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_COUNT);
        }
    }

    public boolean getCount_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_COUNT);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NestedAggregateEveroutePackage nestedAggregateEveroutePackage =
                (NestedAggregateEveroutePackage) o;
        return Objects.equals(this.count, nestedAggregateEveroutePackage.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NestedAggregateEveroutePackage {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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

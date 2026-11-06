package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** NestedAggregateV2EverouteLicense */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class NestedAggregateV2EverouteLicense
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_COUNT = "count";

    @SerializedName(SERIALIZED_NAME_COUNT)
    private Integer count;

    public NestedAggregateV2EverouteLicense() {}

    public NestedAggregateV2EverouteLicense count(Integer count) {

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

    public NestedAggregateV2EverouteLicense count_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_COUNT);
        return this;
    }

    public NestedAggregateV2EverouteLicense count_ExplictlyNonNull() {
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
        NestedAggregateV2EverouteLicense nestedAggregateV2EverouteLicense =
                (NestedAggregateV2EverouteLicense) o;
        return Objects.equals(this.count, nestedAggregateV2EverouteLicense.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NestedAggregateV2EverouteLicense {\n");
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

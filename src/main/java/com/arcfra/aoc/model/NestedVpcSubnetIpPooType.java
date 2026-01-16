package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** NestedVpcSubnetIpPooType */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class NestedVpcSubnetIpPooType
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_END = "end";

    @SerializedName(SERIALIZED_NAME_END)
    private String end;

    public static final String SERIALIZED_NAME_START = "start";

    @SerializedName(SERIALIZED_NAME_START)
    private String start;

    public NestedVpcSubnetIpPooType() {}

    public NestedVpcSubnetIpPooType end(String end) {

        this.end = end;
        return this;
    }

    /**
     * Get end
     *
     * @return end
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public NestedVpcSubnetIpPooType end_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_END);
        return this;
    }

    public NestedVpcSubnetIpPooType end_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_END);
        return this;
    }

    public void setEnd_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_END);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_END);
        }
    }

    public boolean getEnd_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_END);
    }

    public NestedVpcSubnetIpPooType start(String start) {

        this.start = start;
        return this;
    }

    /**
     * Get start
     *
     * @return start
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public NestedVpcSubnetIpPooType start_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_START);
        return this;
    }

    public NestedVpcSubnetIpPooType start_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_START);
        return this;
    }

    public void setStart_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_START);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_START);
        }
    }

    public boolean getStart_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_START);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NestedVpcSubnetIpPooType nestedVpcSubnetIpPooType = (NestedVpcSubnetIpPooType) o;
        return Objects.equals(this.end, nestedVpcSubnetIpPooType.end)
                && Objects.equals(this.start, nestedVpcSubnetIpPooType.start);
    }

    @Override
    public int hashCode() {
        return Objects.hash(end, start);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NestedVpcSubnetIpPooType {\n");
        sb.append("    end: ").append(toIndentedString(end)).append("\n");
        sb.append("    start: ").append(toIndentedString(start)).append("\n");
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

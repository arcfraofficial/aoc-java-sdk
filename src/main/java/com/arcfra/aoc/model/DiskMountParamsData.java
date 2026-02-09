package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** DiskMountParamsData */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class DiskMountParamsData
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_FUNCTION = "function";

    @SerializedName(SERIALIZED_NAME_FUNCTION)
    private DiskFunction function;

    public DiskMountParamsData() {}

    public DiskMountParamsData function(DiskFunction function) {

        this.function = function;
        return this;
    }

    /**
     * Get function
     *
     * @return function
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public DiskFunction getFunction() {
        return function;
    }

    public void setFunction(DiskFunction function) {
        this.function = function;
    }

    public DiskMountParamsData function_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FUNCTION);
        return this;
    }

    public DiskMountParamsData function_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FUNCTION);
        return this;
    }

    public void setFunction_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FUNCTION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FUNCTION);
        }
    }

    public boolean getFunction_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FUNCTION);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DiskMountParamsData diskMountParamsData = (DiskMountParamsData) o;
        return Objects.equals(this.function, diskMountParamsData.function);
    }

    @Override
    public int hashCode() {
        return Objects.hash(function);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DiskMountParamsData {\n");
        sb.append("    function: ").append(toIndentedString(function)).append("\n");
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

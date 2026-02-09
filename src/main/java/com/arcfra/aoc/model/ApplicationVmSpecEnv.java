package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** ApplicationVmSpecEnv */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class ApplicationVmSpecEnv
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_VALUE = "value";

    @SerializedName(SERIALIZED_NAME_VALUE)
    private String value;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public ApplicationVmSpecEnv() {}

    public ApplicationVmSpecEnv value(String value) {

        this.value = value;
        return this;
    }

    /**
     * Get value
     *
     * @return value
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public ApplicationVmSpecEnv value_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VALUE);
        return this;
    }

    public ApplicationVmSpecEnv value_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VALUE);
        return this;
    }

    public void setValue_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VALUE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VALUE);
        }
    }

    public boolean getValue_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VALUE);
    }

    public ApplicationVmSpecEnv name(String name) {

        this.name = name;
        return this;
    }

    /**
     * Get name
     *
     * @return name
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ApplicationVmSpecEnv name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public ApplicationVmSpecEnv name_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME);
        return this;
    }

    public void setName_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME);
        }
    }

    public boolean getName_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApplicationVmSpecEnv applicationVmSpecEnv = (ApplicationVmSpecEnv) o;
        return Objects.equals(this.value, applicationVmSpecEnv.value)
                && Objects.equals(this.name, applicationVmSpecEnv.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApplicationVmSpecEnv {\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

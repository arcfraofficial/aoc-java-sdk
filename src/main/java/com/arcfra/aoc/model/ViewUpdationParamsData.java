package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** ViewUpdationParamsData */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class ViewUpdationParamsData
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_TIME_UNIT = "time_unit";

    @SerializedName(SERIALIZED_NAME_TIME_UNIT)
    private TimeUnit timeUnit;

    public static final String SERIALIZED_NAME_TIME_SPAN = "time_span";

    @SerializedName(SERIALIZED_NAME_TIME_SPAN)
    private Integer timeSpan;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public ViewUpdationParamsData() {}

    public ViewUpdationParamsData timeUnit(TimeUnit timeUnit) {

        this.timeUnit = timeUnit;
        return this;
    }

    /**
     * Get timeUnit
     *
     * @return timeUnit
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public TimeUnit getTimeUnit() {
        return timeUnit;
    }

    public void setTimeUnit(TimeUnit timeUnit) {
        this.timeUnit = timeUnit;
    }

    public ViewUpdationParamsData timeUnit_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TIME_UNIT);
        return this;
    }

    public ViewUpdationParamsData timeUnit_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TIME_UNIT);
        return this;
    }

    public void setTimeUnit_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TIME_UNIT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TIME_UNIT);
        }
    }

    public boolean getTimeUnit_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TIME_UNIT);
    }

    public ViewUpdationParamsData timeSpan(Integer timeSpan) {

        this.timeSpan = timeSpan;
        return this;
    }

    /**
     * Get timeSpan
     *
     * @return timeSpan
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getTimeSpan() {
        return timeSpan;
    }

    public void setTimeSpan(Integer timeSpan) {
        this.timeSpan = timeSpan;
    }

    public ViewUpdationParamsData timeSpan_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TIME_SPAN);
        return this;
    }

    public ViewUpdationParamsData timeSpan_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TIME_SPAN);
        return this;
    }

    public void setTimeSpan_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TIME_SPAN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TIME_SPAN);
        }
    }

    public boolean getTimeSpan_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TIME_SPAN);
    }

    public ViewUpdationParamsData name(String name) {

        this.name = name;
        return this;
    }

    /**
     * Get name
     *
     * @return name
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ViewUpdationParamsData name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public ViewUpdationParamsData name_ExplictlyNonNull() {
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
        ViewUpdationParamsData viewUpdationParamsData = (ViewUpdationParamsData) o;
        return Objects.equals(this.timeUnit, viewUpdationParamsData.timeUnit)
                && Objects.equals(this.timeSpan, viewUpdationParamsData.timeSpan)
                && Objects.equals(this.name, viewUpdationParamsData.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timeUnit, timeSpan, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ViewUpdationParamsData {\n");
        sb.append("    timeUnit: ").append(toIndentedString(timeUnit)).append("\n");
        sb.append("    timeSpan: ").append(toIndentedString(timeSpan)).append("\n");
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

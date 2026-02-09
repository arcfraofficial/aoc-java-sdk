package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** ViewCreationParams */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class ViewCreationParams extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_TIME_UNIT = "time_unit";

    @SerializedName(SERIALIZED_NAME_TIME_UNIT)
    private TimeUnit timeUnit;

    public static final String SERIALIZED_NAME_TIME_SPAN = "time_span";

    @SerializedName(SERIALIZED_NAME_TIME_SPAN)
    private Integer timeSpan;

    public static final String SERIALIZED_NAME_CLUSTER_ID = "cluster_id";

    @SerializedName(SERIALIZED_NAME_CLUSTER_ID)
    private String clusterId;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public ViewCreationParams() {}

    public ViewCreationParams timeUnit(TimeUnit timeUnit) {

        this.timeUnit = timeUnit;
        return this;
    }

    /**
     * Get timeUnit
     *
     * @return timeUnit
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public TimeUnit getTimeUnit() {
        return timeUnit;
    }

    public void setTimeUnit(TimeUnit timeUnit) {
        this.timeUnit = timeUnit;
    }

    public ViewCreationParams timeUnit_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TIME_UNIT);
        return this;
    }

    public ViewCreationParams timeUnit_ExplictlyNonNull() {
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

    public ViewCreationParams timeSpan(Integer timeSpan) {

        this.timeSpan = timeSpan;
        return this;
    }

    /**
     * Get timeSpan
     *
     * @return timeSpan
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Integer getTimeSpan() {
        return timeSpan;
    }

    public void setTimeSpan(Integer timeSpan) {
        this.timeSpan = timeSpan;
    }

    public ViewCreationParams timeSpan_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TIME_SPAN);
        return this;
    }

    public ViewCreationParams timeSpan_ExplictlyNonNull() {
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

    public ViewCreationParams clusterId(String clusterId) {

        this.clusterId = clusterId;
        return this;
    }

    /**
     * Get clusterId
     *
     * @return clusterId
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public ViewCreationParams clusterId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER_ID);
        return this;
    }

    public ViewCreationParams clusterId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_ID);
        return this;
    }

    public void setClusterId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLUSTER_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_ID);
        }
    }

    public boolean getClusterId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLUSTER_ID);
    }

    public ViewCreationParams name(String name) {

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

    public ViewCreationParams name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public ViewCreationParams name_ExplictlyNonNull() {
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
        ViewCreationParams viewCreationParams = (ViewCreationParams) o;
        return Objects.equals(this.timeUnit, viewCreationParams.timeUnit)
                && Objects.equals(this.timeSpan, viewCreationParams.timeSpan)
                && Objects.equals(this.clusterId, viewCreationParams.clusterId)
                && Objects.equals(this.name, viewCreationParams.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timeUnit, timeSpan, clusterId, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ViewCreationParams {\n");
        sb.append("    timeUnit: ").append(toIndentedString(timeUnit)).append("\n");
        sb.append("    timeSpan: ").append(toIndentedString(timeSpan)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
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

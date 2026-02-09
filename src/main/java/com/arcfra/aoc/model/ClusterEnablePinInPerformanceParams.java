package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** ClusterEnablePinInPerformanceParams */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class ClusterEnablePinInPerformanceParams
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_DATA = "data";

    @SerializedName(SERIALIZED_NAME_DATA)
    private ClusterEnablePinInPerformanceParamsData data;

    public static final String SERIALIZED_NAME_WHERE = "where";

    @SerializedName(SERIALIZED_NAME_WHERE)
    private ClusterWhereInput where;

    public ClusterEnablePinInPerformanceParams() {}

    public ClusterEnablePinInPerformanceParams data(ClusterEnablePinInPerformanceParamsData data) {

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
    public ClusterEnablePinInPerformanceParamsData getData() {
        return data;
    }

    public void setData(ClusterEnablePinInPerformanceParamsData data) {
        this.data = data;
    }

    public ClusterEnablePinInPerformanceParams data_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATA);
        return this;
    }

    public ClusterEnablePinInPerformanceParams data_ExplictlyNonNull() {
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

    public ClusterEnablePinInPerformanceParams where(ClusterWhereInput where) {

        this.where = where;
        return this;
    }

    /**
     * Get where
     *
     * @return where
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public ClusterWhereInput getWhere() {
        return where;
    }

    public void setWhere(ClusterWhereInput where) {
        this.where = where;
    }

    public ClusterEnablePinInPerformanceParams where_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WHERE);
        return this;
    }

    public ClusterEnablePinInPerformanceParams where_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_WHERE);
        return this;
    }

    public void setWhere_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_WHERE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_WHERE);
        }
    }

    public boolean getWhere_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_WHERE);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ClusterEnablePinInPerformanceParams clusterEnablePinInPerformanceParams =
                (ClusterEnablePinInPerformanceParams) o;
        return Objects.equals(this.data, clusterEnablePinInPerformanceParams.data)
                && Objects.equals(this.where, clusterEnablePinInPerformanceParams.where);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, where);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClusterEnablePinInPerformanceParams {\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    where: ").append(toIndentedString(where)).append("\n");
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

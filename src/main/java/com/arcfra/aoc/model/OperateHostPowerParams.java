package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** OperateHostPowerParams */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class OperateHostPowerParams
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_DATA = "data";

    @SerializedName(SERIALIZED_NAME_DATA)
    private OperateHostPowerData data;

    public static final String SERIALIZED_NAME_WHERE = "where";

    @SerializedName(SERIALIZED_NAME_WHERE)
    private VmStartParamsData where;

    public OperateHostPowerParams() {}

    public OperateHostPowerParams data(OperateHostPowerData data) {

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
    public OperateHostPowerData getData() {
        return data;
    }

    public void setData(OperateHostPowerData data) {
        this.data = data;
    }

    public OperateHostPowerParams data_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATA);
        return this;
    }

    public OperateHostPowerParams data_ExplictlyNonNull() {
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

    public OperateHostPowerParams where(VmStartParamsData where) {

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
    public VmStartParamsData getWhere() {
        return where;
    }

    public void setWhere(VmStartParamsData where) {
        this.where = where;
    }

    public OperateHostPowerParams where_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WHERE);
        return this;
    }

    public OperateHostPowerParams where_ExplictlyNonNull() {
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
        OperateHostPowerParams operateHostPowerParams = (OperateHostPowerParams) o;
        return Objects.equals(this.data, operateHostPowerParams.data)
                && Objects.equals(this.where, operateHostPowerParams.where);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, where);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OperateHostPowerParams {\n");
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

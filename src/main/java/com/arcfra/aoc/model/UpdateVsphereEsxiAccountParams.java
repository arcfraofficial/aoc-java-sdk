package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** UpdateVsphereEsxiAccountParams */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class UpdateVsphereEsxiAccountParams
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_DATA = "data";

    @SerializedName(SERIALIZED_NAME_DATA)
    private List<UpdateVsphereEsxiAccountParamsData> data =
            new ArrayList<UpdateVsphereEsxiAccountParamsData>();

    public UpdateVsphereEsxiAccountParams() {}

    public UpdateVsphereEsxiAccountParams data(List<UpdateVsphereEsxiAccountParamsData> data) {

        this.data = data;
        return this;
    }

    public UpdateVsphereEsxiAccountParams addDataItem(UpdateVsphereEsxiAccountParamsData dataItem) {
        this.data.add(dataItem);
        return this;
    }

    /**
     * Get data
     *
     * @return data
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public List<UpdateVsphereEsxiAccountParamsData> getData() {
        return data;
    }

    public void setData(List<UpdateVsphereEsxiAccountParamsData> data) {
        this.data = data;
    }

    public UpdateVsphereEsxiAccountParams data_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATA);
        return this;
    }

    public UpdateVsphereEsxiAccountParams data_ExplictlyNonNull() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateVsphereEsxiAccountParams updateVsphereEsxiAccountParams =
                (UpdateVsphereEsxiAccountParams) o;
        return Objects.equals(this.data, updateVsphereEsxiAccountParams.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateVsphereEsxiAccountParams {\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

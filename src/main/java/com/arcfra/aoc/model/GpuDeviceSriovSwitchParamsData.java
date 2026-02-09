package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** GpuDeviceSriovSwitchParamsData */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class GpuDeviceSriovSwitchParamsData
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_ENABLE = "enable";

    @SerializedName(SERIALIZED_NAME_ENABLE)
    private Boolean enable;

    public GpuDeviceSriovSwitchParamsData() {}

    public GpuDeviceSriovSwitchParamsData enable(Boolean enable) {

        this.enable = enable;
        return this;
    }

    /**
     * Get enable
     *
     * @return enable
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public GpuDeviceSriovSwitchParamsData enable_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENABLE);
        return this;
    }

    public GpuDeviceSriovSwitchParamsData enable_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ENABLE);
        return this;
    }

    public void setEnable_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ENABLE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ENABLE);
        }
    }

    public boolean getEnable_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ENABLE);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GpuDeviceSriovSwitchParamsData gpuDeviceSriovSwitchParamsData =
                (GpuDeviceSriovSwitchParamsData) o;
        return Objects.equals(this.enable, gpuDeviceSriovSwitchParamsData.enable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enable);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GpuDeviceSriovSwitchParamsData {\n");
        sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
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

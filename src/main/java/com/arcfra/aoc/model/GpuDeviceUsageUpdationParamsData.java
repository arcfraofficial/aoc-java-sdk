package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** GpuDeviceUsageUpdationParamsData */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class GpuDeviceUsageUpdationParamsData
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_VGPU_SPEC = "vgpu_spec";

    @SerializedName(SERIALIZED_NAME_VGPU_SPEC)
    private String vgpuSpec;

    public static final String SERIALIZED_NAME_USAGE = "usage";

    @SerializedName(SERIALIZED_NAME_USAGE)
    private GpuDeviceUsage usage;

    public GpuDeviceUsageUpdationParamsData() {}

    public GpuDeviceUsageUpdationParamsData vgpuSpec(String vgpuSpec) {

        this.vgpuSpec = vgpuSpec;
        return this;
    }

    /**
     * Get vgpuSpec
     *
     * @return vgpuSpec
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVgpuSpec() {
        return vgpuSpec;
    }

    public void setVgpuSpec(String vgpuSpec) {
        this.vgpuSpec = vgpuSpec;
    }

    public GpuDeviceUsageUpdationParamsData vgpuSpec_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VGPU_SPEC);
        return this;
    }

    public GpuDeviceUsageUpdationParamsData vgpuSpec_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VGPU_SPEC);
        return this;
    }

    public void setVgpuSpec_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VGPU_SPEC);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VGPU_SPEC);
        }
    }

    public boolean getVgpuSpec_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VGPU_SPEC);
    }

    public GpuDeviceUsageUpdationParamsData usage(GpuDeviceUsage usage) {

        this.usage = usage;
        return this;
    }

    /**
     * Get usage
     *
     * @return usage
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public GpuDeviceUsage getUsage() {
        return usage;
    }

    public void setUsage(GpuDeviceUsage usage) {
        this.usage = usage;
    }

    public GpuDeviceUsageUpdationParamsData usage_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USAGE);
        return this;
    }

    public GpuDeviceUsageUpdationParamsData usage_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USAGE);
        return this;
    }

    public void setUsage_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USAGE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USAGE);
        }
    }

    public boolean getUsage_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USAGE);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GpuDeviceUsageUpdationParamsData gpuDeviceUsageUpdationParamsData =
                (GpuDeviceUsageUpdationParamsData) o;
        return Objects.equals(this.vgpuSpec, gpuDeviceUsageUpdationParamsData.vgpuSpec)
                && Objects.equals(this.usage, gpuDeviceUsageUpdationParamsData.usage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vgpuSpec, usage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GpuDeviceUsageUpdationParamsData {\n");
        sb.append("    vgpuSpec: ").append(toIndentedString(vgpuSpec)).append("\n");
        sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
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

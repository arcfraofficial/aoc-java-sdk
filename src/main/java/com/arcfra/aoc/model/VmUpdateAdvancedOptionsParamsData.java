package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** VmUpdateAdvancedOptionsParamsData */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VmUpdateAdvancedOptionsParamsData
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_VIDEO_TYPE = "video_type";

    @SerializedName(SERIALIZED_NAME_VIDEO_TYPE)
    private VmVideoType videoType;

    public static final String SERIALIZED_NAME_WINDOWS_OPTIMIZE = "windows_optimize";

    @SerializedName(SERIALIZED_NAME_WINDOWS_OPTIMIZE)
    private Boolean windowsOptimize;

    public static final String SERIALIZED_NAME_CPU_MODEL = "cpu_model";

    @SerializedName(SERIALIZED_NAME_CPU_MODEL)
    private String cpuModel;

    public static final String SERIALIZED_NAME_CLOCK_OFFSET = "clock_offset";

    @SerializedName(SERIALIZED_NAME_CLOCK_OFFSET)
    private VmClockOffset clockOffset;

    public VmUpdateAdvancedOptionsParamsData() {}

    public VmUpdateAdvancedOptionsParamsData videoType(VmVideoType videoType) {

        this.videoType = videoType;
        return this;
    }

    /**
     * Get videoType
     *
     * @return videoType
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmVideoType getVideoType() {
        return videoType;
    }

    public void setVideoType(VmVideoType videoType) {
        this.videoType = videoType;
    }

    public VmUpdateAdvancedOptionsParamsData videoType_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VIDEO_TYPE);
        return this;
    }

    public VmUpdateAdvancedOptionsParamsData videoType_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VIDEO_TYPE);
        return this;
    }

    public void setVideoType_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VIDEO_TYPE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VIDEO_TYPE);
        }
    }

    public boolean getVideoType_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VIDEO_TYPE);
    }

    public VmUpdateAdvancedOptionsParamsData windowsOptimize(Boolean windowsOptimize) {

        this.windowsOptimize = windowsOptimize;
        return this;
    }

    /**
     * Get windowsOptimize
     *
     * @return windowsOptimize
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getWindowsOptimize() {
        return windowsOptimize;
    }

    public void setWindowsOptimize(Boolean windowsOptimize) {
        this.windowsOptimize = windowsOptimize;
    }

    public VmUpdateAdvancedOptionsParamsData windowsOptimize_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WINDOWS_OPTIMIZE);
        return this;
    }

    public VmUpdateAdvancedOptionsParamsData windowsOptimize_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_WINDOWS_OPTIMIZE);
        return this;
    }

    public void setWindowsOptimize_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_WINDOWS_OPTIMIZE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_WINDOWS_OPTIMIZE);
        }
    }

    public boolean getWindowsOptimize_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_WINDOWS_OPTIMIZE);
    }

    public VmUpdateAdvancedOptionsParamsData cpuModel(String cpuModel) {

        this.cpuModel = cpuModel;
        return this;
    }

    /**
     * Get cpuModel
     *
     * @return cpuModel
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCpuModel() {
        return cpuModel;
    }

    public void setCpuModel(String cpuModel) {
        this.cpuModel = cpuModel;
    }

    public VmUpdateAdvancedOptionsParamsData cpuModel_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CPU_MODEL);
        return this;
    }

    public VmUpdateAdvancedOptionsParamsData cpuModel_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CPU_MODEL);
        return this;
    }

    public void setCpuModel_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CPU_MODEL);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CPU_MODEL);
        }
    }

    public boolean getCpuModel_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CPU_MODEL);
    }

    public VmUpdateAdvancedOptionsParamsData clockOffset(VmClockOffset clockOffset) {

        this.clockOffset = clockOffset;
        return this;
    }

    /**
     * Get clockOffset
     *
     * @return clockOffset
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmClockOffset getClockOffset() {
        return clockOffset;
    }

    public void setClockOffset(VmClockOffset clockOffset) {
        this.clockOffset = clockOffset;
    }

    public VmUpdateAdvancedOptionsParamsData clockOffset_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLOCK_OFFSET);
        return this;
    }

    public VmUpdateAdvancedOptionsParamsData clockOffset_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLOCK_OFFSET);
        return this;
    }

    public void setClockOffset_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLOCK_OFFSET);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLOCK_OFFSET);
        }
    }

    public boolean getClockOffset_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLOCK_OFFSET);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VmUpdateAdvancedOptionsParamsData vmUpdateAdvancedOptionsParamsData =
                (VmUpdateAdvancedOptionsParamsData) o;
        return Objects.equals(this.videoType, vmUpdateAdvancedOptionsParamsData.videoType)
                && Objects.equals(
                        this.windowsOptimize, vmUpdateAdvancedOptionsParamsData.windowsOptimize)
                && Objects.equals(this.cpuModel, vmUpdateAdvancedOptionsParamsData.cpuModel)
                && Objects.equals(this.clockOffset, vmUpdateAdvancedOptionsParamsData.clockOffset);
    }

    @Override
    public int hashCode() {
        return Objects.hash(videoType, windowsOptimize, cpuModel, clockOffset);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VmUpdateAdvancedOptionsParamsData {\n");
        sb.append("    videoType: ").append(toIndentedString(videoType)).append("\n");
        sb.append("    windowsOptimize: ").append(toIndentedString(windowsOptimize)).append("\n");
        sb.append("    cpuModel: ").append(toIndentedString(cpuModel)).append("\n");
        sb.append("    clockOffset: ").append(toIndentedString(clockOffset)).append("\n");
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

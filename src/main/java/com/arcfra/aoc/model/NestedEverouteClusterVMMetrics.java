package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** NestedEverouteClusterVMMetrics */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class NestedEverouteClusterVMMetrics
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_CPU_USAGE = "cpuUsage";

    @SerializedName(SERIALIZED_NAME_CPU_USAGE)
    private Double cpuUsage;

    public static final String SERIALIZED_NAME_DATA_VOLUME_USAGE = "dataVolumeUsage";

    @SerializedName(SERIALIZED_NAME_DATA_VOLUME_USAGE)
    private Double dataVolumeUsage;

    public static final String SERIALIZED_NAME_LAST_ACQUISITION_TIME = "lastAcquisitionTime";

    @SerializedName(SERIALIZED_NAME_LAST_ACQUISITION_TIME)
    private String lastAcquisitionTime;

    public static final String SERIALIZED_NAME_MEMORY_USAGE = "memoryUsage";

    @SerializedName(SERIALIZED_NAME_MEMORY_USAGE)
    private Double memoryUsage;

    public NestedEverouteClusterVMMetrics() {}

    public NestedEverouteClusterVMMetrics cpuUsage(Double cpuUsage) {

        this.cpuUsage = cpuUsage;
        return this;
    }

    /**
     * Get cpuUsage
     *
     * @return cpuUsage
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Double getCpuUsage() {
        return cpuUsage;
    }

    public void setCpuUsage(Double cpuUsage) {
        this.cpuUsage = cpuUsage;
    }

    public NestedEverouteClusterVMMetrics cpuUsage_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CPU_USAGE);
        return this;
    }

    public NestedEverouteClusterVMMetrics cpuUsage_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CPU_USAGE);
        return this;
    }

    public void setCpuUsage_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CPU_USAGE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CPU_USAGE);
        }
    }

    public boolean getCpuUsage_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CPU_USAGE);
    }

    public NestedEverouteClusterVMMetrics dataVolumeUsage(Double dataVolumeUsage) {

        this.dataVolumeUsage = dataVolumeUsage;
        return this;
    }

    /**
     * Get dataVolumeUsage
     *
     * @return dataVolumeUsage
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Double getDataVolumeUsage() {
        return dataVolumeUsage;
    }

    public void setDataVolumeUsage(Double dataVolumeUsage) {
        this.dataVolumeUsage = dataVolumeUsage;
    }

    public NestedEverouteClusterVMMetrics dataVolumeUsage_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATA_VOLUME_USAGE);
        return this;
    }

    public NestedEverouteClusterVMMetrics dataVolumeUsage_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATA_VOLUME_USAGE);
        return this;
    }

    public void setDataVolumeUsage_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATA_VOLUME_USAGE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATA_VOLUME_USAGE);
        }
    }

    public boolean getDataVolumeUsage_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATA_VOLUME_USAGE);
    }

    public NestedEverouteClusterVMMetrics lastAcquisitionTime(String lastAcquisitionTime) {

        this.lastAcquisitionTime = lastAcquisitionTime;
        return this;
    }

    /**
     * Get lastAcquisitionTime
     *
     * @return lastAcquisitionTime
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getLastAcquisitionTime() {
        return lastAcquisitionTime;
    }

    public void setLastAcquisitionTime(String lastAcquisitionTime) {
        this.lastAcquisitionTime = lastAcquisitionTime;
    }

    public NestedEverouteClusterVMMetrics lastAcquisitionTime_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_ACQUISITION_TIME);
        return this;
    }

    public NestedEverouteClusterVMMetrics lastAcquisitionTime_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_ACQUISITION_TIME);
        return this;
    }

    public void setLastAcquisitionTime_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_ACQUISITION_TIME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_ACQUISITION_TIME);
        }
    }

    public boolean getLastAcquisitionTime_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LAST_ACQUISITION_TIME);
    }

    public NestedEverouteClusterVMMetrics memoryUsage(Double memoryUsage) {

        this.memoryUsage = memoryUsage;
        return this;
    }

    /**
     * Get memoryUsage
     *
     * @return memoryUsage
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Double getMemoryUsage() {
        return memoryUsage;
    }

    public void setMemoryUsage(Double memoryUsage) {
        this.memoryUsage = memoryUsage;
    }

    public NestedEverouteClusterVMMetrics memoryUsage_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MEMORY_USAGE);
        return this;
    }

    public NestedEverouteClusterVMMetrics memoryUsage_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MEMORY_USAGE);
        return this;
    }

    public void setMemoryUsage_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MEMORY_USAGE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MEMORY_USAGE);
        }
    }

    public boolean getMemoryUsage_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MEMORY_USAGE);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NestedEverouteClusterVMMetrics nestedEverouteClusterVMMetrics =
                (NestedEverouteClusterVMMetrics) o;
        return Objects.equals(this.cpuUsage, nestedEverouteClusterVMMetrics.cpuUsage)
                && Objects.equals(
                        this.dataVolumeUsage, nestedEverouteClusterVMMetrics.dataVolumeUsage)
                && Objects.equals(
                        this.lastAcquisitionTime,
                        nestedEverouteClusterVMMetrics.lastAcquisitionTime)
                && Objects.equals(this.memoryUsage, nestedEverouteClusterVMMetrics.memoryUsage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpuUsage, dataVolumeUsage, lastAcquisitionTime, memoryUsage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NestedEverouteClusterVMMetrics {\n");
        sb.append("    cpuUsage: ").append(toIndentedString(cpuUsage)).append("\n");
        sb.append("    dataVolumeUsage: ").append(toIndentedString(dataVolumeUsage)).append("\n");
        sb.append("    lastAcquisitionTime: ")
                .append(toIndentedString(lastAcquisitionTime))
                .append("\n");
        sb.append("    memoryUsage: ").append(toIndentedString(memoryUsage)).append("\n");
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

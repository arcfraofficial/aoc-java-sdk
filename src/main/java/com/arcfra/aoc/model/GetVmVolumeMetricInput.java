package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** GetVmVolumeMetricInput */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class GetVmVolumeMetricInput
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_RANGE = "range";

    @SerializedName(SERIALIZED_NAME_RANGE)
    private String range;

    public static final String SERIALIZED_NAME_METRICS = "metrics";

    @SerializedName(SERIALIZED_NAME_METRICS)
    private List<String> metrics = new ArrayList<String>();

    public static final String SERIALIZED_NAME_VM_VOLUMES = "vmVolumes";

    @SerializedName(SERIALIZED_NAME_VM_VOLUMES)
    private VmVolumeWhereInput vmVolumes;

    public GetVmVolumeMetricInput() {}

    public GetVmVolumeMetricInput range(String range) {

        this.range = range;
        return this;
    }

    /**
     * Get range
     *
     * @return range
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range;
    }

    public GetVmVolumeMetricInput range_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RANGE);
        return this;
    }

    public GetVmVolumeMetricInput range_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RANGE);
        return this;
    }

    public void setRange_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RANGE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RANGE);
        }
    }

    public boolean getRange_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RANGE);
    }

    public GetVmVolumeMetricInput metrics(List<String> metrics) {

        this.metrics = metrics;
        return this;
    }

    public GetVmVolumeMetricInput addMetricsItem(String metricsItem) {
        this.metrics.add(metricsItem);
        return this;
    }

    /**
     * Get metrics
     *
     * @return metrics
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public List<String> getMetrics() {
        return metrics;
    }

    public void setMetrics(List<String> metrics) {
        this.metrics = metrics;
    }

    public GetVmVolumeMetricInput metrics_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_METRICS);
        return this;
    }

    public GetVmVolumeMetricInput metrics_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_METRICS);
        return this;
    }

    public void setMetrics_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_METRICS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_METRICS);
        }
    }

    public boolean getMetrics_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_METRICS);
    }

    public GetVmVolumeMetricInput vmVolumes(VmVolumeWhereInput vmVolumes) {

        this.vmVolumes = vmVolumes;
        return this;
    }

    /**
     * Get vmVolumes
     *
     * @return vmVolumes
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public VmVolumeWhereInput getVmVolumes() {
        return vmVolumes;
    }

    public void setVmVolumes(VmVolumeWhereInput vmVolumes) {
        this.vmVolumes = vmVolumes;
    }

    public GetVmVolumeMetricInput vmVolumes_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_VOLUMES);
        return this;
    }

    public GetVmVolumeMetricInput vmVolumes_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_VOLUMES);
        return this;
    }

    public void setVmVolumes_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_VOLUMES);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_VOLUMES);
        }
    }

    public boolean getVmVolumes_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_VOLUMES);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetVmVolumeMetricInput getVmVolumeMetricInput = (GetVmVolumeMetricInput) o;
        return Objects.equals(this.range, getVmVolumeMetricInput.range)
                && Objects.equals(this.metrics, getVmVolumeMetricInput.metrics)
                && Objects.equals(this.vmVolumes, getVmVolumeMetricInput.vmVolumes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(range, metrics, vmVolumes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetVmVolumeMetricInput {\n");
        sb.append("    range: ").append(toIndentedString(range)).append("\n");
        sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
        sb.append("    vmVolumes: ").append(toIndentedString(vmVolumes)).append("\n");
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

package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** GetSCVMDiskMetricInput */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class GetSCVMDiskMetricInput
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_RANGE = "range";

    @SerializedName(SERIALIZED_NAME_RANGE)
    private String range;

    public static final String SERIALIZED_NAME_DISKS = "disks";

    @SerializedName(SERIALIZED_NAME_DISKS)
    private DiskWhereInput disks;

    public static final String SERIALIZED_NAME_METRICS = "metrics";

    @SerializedName(SERIALIZED_NAME_METRICS)
    private List<String> metrics = new ArrayList<String>();

    public GetSCVMDiskMetricInput() {}

    public GetSCVMDiskMetricInput range(String range) {

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

    public GetSCVMDiskMetricInput range_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RANGE);
        return this;
    }

    public GetSCVMDiskMetricInput range_ExplictlyNonNull() {
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

    public GetSCVMDiskMetricInput disks(DiskWhereInput disks) {

        this.disks = disks;
        return this;
    }

    /**
     * Get disks
     *
     * @return disks
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public DiskWhereInput getDisks() {
        return disks;
    }

    public void setDisks(DiskWhereInput disks) {
        this.disks = disks;
    }

    public GetSCVMDiskMetricInput disks_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISKS);
        return this;
    }

    public GetSCVMDiskMetricInput disks_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DISKS);
        return this;
    }

    public void setDisks_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DISKS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DISKS);
        }
    }

    public boolean getDisks_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DISKS);
    }

    public GetSCVMDiskMetricInput metrics(List<String> metrics) {

        this.metrics = metrics;
        return this;
    }

    public GetSCVMDiskMetricInput addMetricsItem(String metricsItem) {
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

    public GetSCVMDiskMetricInput metrics_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_METRICS);
        return this;
    }

    public GetSCVMDiskMetricInput metrics_ExplictlyNonNull() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetSCVMDiskMetricInput getSCVMDiskMetricInput = (GetSCVMDiskMetricInput) o;
        return Objects.equals(this.range, getSCVMDiskMetricInput.range)
                && Objects.equals(this.disks, getSCVMDiskMetricInput.disks)
                && Objects.equals(this.metrics, getSCVMDiskMetricInput.metrics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(range, disks, metrics);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetSCVMDiskMetricInput {\n");
        sb.append("    range: ").append(toIndentedString(range)).append("\n");
        sb.append("    disks: ").append(toIndentedString(disks)).append("\n");
        sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
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

package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** GetClusterMetricInput */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class GetClusterMetricInput
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_RANGE = "range";

    @SerializedName(SERIALIZED_NAME_RANGE)
    private String range;

    public static final String SERIALIZED_NAME_CLUSTERS = "clusters";

    @SerializedName(SERIALIZED_NAME_CLUSTERS)
    private ClusterWhereInput clusters;

    public static final String SERIALIZED_NAME_METRICS = "metrics";

    @SerializedName(SERIALIZED_NAME_METRICS)
    private List<String> metrics = new ArrayList<String>();

    public GetClusterMetricInput() {}

    public GetClusterMetricInput range(String range) {

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

    public GetClusterMetricInput range_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RANGE);
        return this;
    }

    public GetClusterMetricInput range_ExplictlyNonNull() {
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

    public GetClusterMetricInput clusters(ClusterWhereInput clusters) {

        this.clusters = clusters;
        return this;
    }

    /**
     * Get clusters
     *
     * @return clusters
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public ClusterWhereInput getClusters() {
        return clusters;
    }

    public void setClusters(ClusterWhereInput clusters) {
        this.clusters = clusters;
    }

    public GetClusterMetricInput clusters_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTERS);
        return this;
    }

    public GetClusterMetricInput clusters_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLUSTERS);
        return this;
    }

    public void setClusters_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLUSTERS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLUSTERS);
        }
    }

    public boolean getClusters_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLUSTERS);
    }

    public GetClusterMetricInput metrics(List<String> metrics) {

        this.metrics = metrics;
        return this;
    }

    public GetClusterMetricInput addMetricsItem(String metricsItem) {
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

    public GetClusterMetricInput metrics_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_METRICS);
        return this;
    }

    public GetClusterMetricInput metrics_ExplictlyNonNull() {
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
        GetClusterMetricInput getClusterMetricInput = (GetClusterMetricInput) o;
        return Objects.equals(this.range, getClusterMetricInput.range)
                && Objects.equals(this.clusters, getClusterMetricInput.clusters)
                && Objects.equals(this.metrics, getClusterMetricInput.metrics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(range, clusters, metrics);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetClusterMetricInput {\n");
        sb.append("    range: ").append(toIndentedString(range)).append("\n");
        sb.append("    clusters: ").append(toIndentedString(clusters)).append("\n");
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

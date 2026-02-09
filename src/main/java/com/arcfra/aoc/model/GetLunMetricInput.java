package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** GetLunMetricInput */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class GetLunMetricInput extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_RANGE = "range";

    @SerializedName(SERIALIZED_NAME_RANGE)
    private String range;

    public static final String SERIALIZED_NAME_HOSTS = "hosts";

    @SerializedName(SERIALIZED_NAME_HOSTS)
    private HostWhereInput hosts;

    public static final String SERIALIZED_NAME_LUNS = "luns";

    @SerializedName(SERIALIZED_NAME_LUNS)
    private IscsiLunWhereInput luns;

    public static final String SERIALIZED_NAME_METRICS = "metrics";

    @SerializedName(SERIALIZED_NAME_METRICS)
    private List<String> metrics = new ArrayList<String>();

    public GetLunMetricInput() {}

    public GetLunMetricInput range(String range) {

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

    public GetLunMetricInput range_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RANGE);
        return this;
    }

    public GetLunMetricInput range_ExplictlyNonNull() {
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

    public GetLunMetricInput hosts(HostWhereInput hosts) {

        this.hosts = hosts;
        return this;
    }

    /**
     * Get hosts
     *
     * @return hosts
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public HostWhereInput getHosts() {
        return hosts;
    }

    public void setHosts(HostWhereInput hosts) {
        this.hosts = hosts;
    }

    public GetLunMetricInput hosts_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOSTS);
        return this;
    }

    public GetLunMetricInput hosts_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HOSTS);
        return this;
    }

    public void setHosts_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HOSTS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HOSTS);
        }
    }

    public boolean getHosts_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HOSTS);
    }

    public GetLunMetricInput luns(IscsiLunWhereInput luns) {

        this.luns = luns;
        return this;
    }

    /**
     * Get luns
     *
     * @return luns
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public IscsiLunWhereInput getLuns() {
        return luns;
    }

    public void setLuns(IscsiLunWhereInput luns) {
        this.luns = luns;
    }

    public GetLunMetricInput luns_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LUNS);
        return this;
    }

    public GetLunMetricInput luns_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LUNS);
        return this;
    }

    public void setLuns_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LUNS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LUNS);
        }
    }

    public boolean getLuns_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LUNS);
    }

    public GetLunMetricInput metrics(List<String> metrics) {

        this.metrics = metrics;
        return this;
    }

    public GetLunMetricInput addMetricsItem(String metricsItem) {
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

    public GetLunMetricInput metrics_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_METRICS);
        return this;
    }

    public GetLunMetricInput metrics_ExplictlyNonNull() {
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
        GetLunMetricInput getLunMetricInput = (GetLunMetricInput) o;
        return Objects.equals(this.range, getLunMetricInput.range)
                && Objects.equals(this.hosts, getLunMetricInput.hosts)
                && Objects.equals(this.luns, getLunMetricInput.luns)
                && Objects.equals(this.metrics, getLunMetricInput.metrics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(range, hosts, luns, metrics);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetLunMetricInput {\n");
        sb.append("    range: ").append(toIndentedString(range)).append("\n");
        sb.append("    hosts: ").append(toIndentedString(hosts)).append("\n");
        sb.append("    luns: ").append(toIndentedString(luns)).append("\n");
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

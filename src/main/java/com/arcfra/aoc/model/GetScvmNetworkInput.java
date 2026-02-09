package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** GetScvmNetworkInput */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class GetScvmNetworkInput
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_RANGE = "range";

    @SerializedName(SERIALIZED_NAME_RANGE)
    private String range;

    public static final String SERIALIZED_NAME_HOSTS = "hosts";

    @SerializedName(SERIALIZED_NAME_HOSTS)
    private HostWhereInput hosts;

    public static final String SERIALIZED_NAME_NICS = "nics";

    @SerializedName(SERIALIZED_NAME_NICS)
    private NicWhereInput nics;

    public static final String SERIALIZED_NAME_METRICS = "metrics";

    @SerializedName(SERIALIZED_NAME_METRICS)
    private List<String> metrics = new ArrayList<String>();

    public GetScvmNetworkInput() {}

    public GetScvmNetworkInput range(String range) {

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

    public GetScvmNetworkInput range_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RANGE);
        return this;
    }

    public GetScvmNetworkInput range_ExplictlyNonNull() {
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

    public GetScvmNetworkInput hosts(HostWhereInput hosts) {

        this.hosts = hosts;
        return this;
    }

    /**
     * Get hosts
     *
     * @return hosts
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public HostWhereInput getHosts() {
        return hosts;
    }

    public void setHosts(HostWhereInput hosts) {
        this.hosts = hosts;
    }

    public GetScvmNetworkInput hosts_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOSTS);
        return this;
    }

    public GetScvmNetworkInput hosts_ExplictlyNonNull() {
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

    public GetScvmNetworkInput nics(NicWhereInput nics) {

        this.nics = nics;
        return this;
    }

    /**
     * Get nics
     *
     * @return nics
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NicWhereInput getNics() {
        return nics;
    }

    public void setNics(NicWhereInput nics) {
        this.nics = nics;
    }

    public GetScvmNetworkInput nics_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NICS);
        return this;
    }

    public GetScvmNetworkInput nics_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NICS);
        return this;
    }

    public void setNics_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NICS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NICS);
        }
    }

    public boolean getNics_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NICS);
    }

    public GetScvmNetworkInput metrics(List<String> metrics) {

        this.metrics = metrics;
        return this;
    }

    public GetScvmNetworkInput addMetricsItem(String metricsItem) {
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

    public GetScvmNetworkInput metrics_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_METRICS);
        return this;
    }

    public GetScvmNetworkInput metrics_ExplictlyNonNull() {
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
        GetScvmNetworkInput getScvmNetworkInput = (GetScvmNetworkInput) o;
        return Objects.equals(this.range, getScvmNetworkInput.range)
                && Objects.equals(this.hosts, getScvmNetworkInput.hosts)
                && Objects.equals(this.nics, getScvmNetworkInput.nics)
                && Objects.equals(this.metrics, getScvmNetworkInput.metrics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(range, hosts, nics, metrics);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetScvmNetworkInput {\n");
        sb.append("    range: ").append(toIndentedString(range)).append("\n");
        sb.append("    hosts: ").append(toIndentedString(hosts)).append("\n");
        sb.append("    nics: ").append(toIndentedString(nics)).append("\n");
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

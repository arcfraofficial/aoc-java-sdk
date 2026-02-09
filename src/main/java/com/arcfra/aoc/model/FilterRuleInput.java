package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** FilterRuleInput */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class FilterRuleInput extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_THRESHOLD = "threshold";

    @SerializedName(SERIALIZED_NAME_THRESHOLD)
    private Double threshold;

    public static final String SERIALIZED_NAME_QUANTILE = "quantile";

    @SerializedName(SERIALIZED_NAME_QUANTILE)
    private Integer quantile;

    public static final String SERIALIZED_NAME_OP = "op";

    @SerializedName(SERIALIZED_NAME_OP)
    private FilterRuleOpEnum op;

    public static final String SERIALIZED_NAME_METRIC = "metric";

    @SerializedName(SERIALIZED_NAME_METRIC)
    private FilterRuleMetricEnum metric;

    public static final String SERIALIZED_NAME_DURATION = "duration";

    @SerializedName(SERIALIZED_NAME_DURATION)
    private Integer duration;

    public static final String SERIALIZED_NAME_AGGREGATION = "aggregation";

    @SerializedName(SERIALIZED_NAME_AGGREGATION)
    private FilterRuleAggregationEnum aggregation;

    public FilterRuleInput() {}

    public FilterRuleInput threshold(Double threshold) {

        this.threshold = threshold;
        return this;
    }

    /**
     * Get threshold
     *
     * @return threshold
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Double getThreshold() {
        return threshold;
    }

    public void setThreshold(Double threshold) {
        this.threshold = threshold;
    }

    public FilterRuleInput threshold_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_THRESHOLD);
        return this;
    }

    public FilterRuleInput threshold_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_THRESHOLD);
        return this;
    }

    public void setThreshold_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_THRESHOLD);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_THRESHOLD);
        }
    }

    public boolean getThreshold_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_THRESHOLD);
    }

    public FilterRuleInput quantile(Integer quantile) {

        this.quantile = quantile;
        return this;
    }

    /**
     * Get quantile
     *
     * @return quantile
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Integer getQuantile() {
        return quantile;
    }

    public void setQuantile(Integer quantile) {
        this.quantile = quantile;
    }

    public FilterRuleInput quantile_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_QUANTILE);
        return this;
    }

    public FilterRuleInput quantile_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_QUANTILE);
        return this;
    }

    public void setQuantile_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_QUANTILE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_QUANTILE);
        }
    }

    public boolean getQuantile_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_QUANTILE);
    }

    public FilterRuleInput op(FilterRuleOpEnum op) {

        this.op = op;
        return this;
    }

    /**
     * Get op
     *
     * @return op
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public FilterRuleOpEnum getOp() {
        return op;
    }

    public void setOp(FilterRuleOpEnum op) {
        this.op = op;
    }

    public FilterRuleInput op_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_OP);
        return this;
    }

    public FilterRuleInput op_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_OP);
        return this;
    }

    public void setOp_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_OP);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_OP);
        }
    }

    public boolean getOp_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_OP);
    }

    public FilterRuleInput metric(FilterRuleMetricEnum metric) {

        this.metric = metric;
        return this;
    }

    /**
     * Get metric
     *
     * @return metric
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public FilterRuleMetricEnum getMetric() {
        return metric;
    }

    public void setMetric(FilterRuleMetricEnum metric) {
        this.metric = metric;
    }

    public FilterRuleInput metric_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_METRIC);
        return this;
    }

    public FilterRuleInput metric_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_METRIC);
        return this;
    }

    public void setMetric_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_METRIC);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_METRIC);
        }
    }

    public boolean getMetric_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_METRIC);
    }

    public FilterRuleInput duration(Integer duration) {

        this.duration = duration;
        return this;
    }

    /**
     * Get duration
     *
     * @return duration
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public FilterRuleInput duration_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DURATION);
        return this;
    }

    public FilterRuleInput duration_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DURATION);
        return this;
    }

    public void setDuration_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DURATION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DURATION);
        }
    }

    public boolean getDuration_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DURATION);
    }

    public FilterRuleInput aggregation(FilterRuleAggregationEnum aggregation) {

        this.aggregation = aggregation;
        return this;
    }

    /**
     * Get aggregation
     *
     * @return aggregation
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public FilterRuleAggregationEnum getAggregation() {
        return aggregation;
    }

    public void setAggregation(FilterRuleAggregationEnum aggregation) {
        this.aggregation = aggregation;
    }

    public FilterRuleInput aggregation_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_AGGREGATION);
        return this;
    }

    public FilterRuleInput aggregation_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_AGGREGATION);
        return this;
    }

    public void setAggregation_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_AGGREGATION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_AGGREGATION);
        }
    }

    public boolean getAggregation_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_AGGREGATION);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FilterRuleInput filterRuleInput = (FilterRuleInput) o;
        return Objects.equals(this.threshold, filterRuleInput.threshold)
                && Objects.equals(this.quantile, filterRuleInput.quantile)
                && Objects.equals(this.op, filterRuleInput.op)
                && Objects.equals(this.metric, filterRuleInput.metric)
                && Objects.equals(this.duration, filterRuleInput.duration)
                && Objects.equals(this.aggregation, filterRuleInput.aggregation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(threshold, quantile, op, metric, duration, aggregation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FilterRuleInput {\n");
        sb.append("    threshold: ").append(toIndentedString(threshold)).append("\n");
        sb.append("    quantile: ").append(toIndentedString(quantile)).append("\n");
        sb.append("    op: ").append(toIndentedString(op)).append("\n");
        sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    aggregation: ").append(toIndentedString(aggregation)).append("\n");
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

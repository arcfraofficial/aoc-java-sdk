package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** NestedFilterRule */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class NestedFilterRule extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_AGGREGATION = "aggregation";

    @SerializedName(SERIALIZED_NAME_AGGREGATION)
    private FilterRuleAggregationEnum aggregation;

    public static final String SERIALIZED_NAME_DURATION = "duration";

    @SerializedName(SERIALIZED_NAME_DURATION)
    private Integer duration;

    public static final String SERIALIZED_NAME_METRIC = "metric";

    @SerializedName(SERIALIZED_NAME_METRIC)
    private FilterRuleMetricEnum metric;

    public static final String SERIALIZED_NAME_OP = "op";

    @SerializedName(SERIALIZED_NAME_OP)
    private FilterRuleOpEnum op;

    public static final String SERIALIZED_NAME_QUANTILE = "quantile";

    @SerializedName(SERIALIZED_NAME_QUANTILE)
    private Integer quantile;

    public static final String SERIALIZED_NAME_THRESHOLD = "threshold";

    @SerializedName(SERIALIZED_NAME_THRESHOLD)
    private Double threshold;

    public NestedFilterRule() {}

    public NestedFilterRule aggregation(FilterRuleAggregationEnum aggregation) {

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

    public NestedFilterRule aggregation_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_AGGREGATION);
        return this;
    }

    public NestedFilterRule aggregation_ExplictlyNonNull() {
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

    public NestedFilterRule duration(Integer duration) {

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

    public NestedFilterRule duration_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DURATION);
        return this;
    }

    public NestedFilterRule duration_ExplictlyNonNull() {
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

    public NestedFilterRule metric(FilterRuleMetricEnum metric) {

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

    public NestedFilterRule metric_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_METRIC);
        return this;
    }

    public NestedFilterRule metric_ExplictlyNonNull() {
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

    public NestedFilterRule op(FilterRuleOpEnum op) {

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

    public NestedFilterRule op_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_OP);
        return this;
    }

    public NestedFilterRule op_ExplictlyNonNull() {
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

    public NestedFilterRule quantile(Integer quantile) {

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

    public NestedFilterRule quantile_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_QUANTILE);
        return this;
    }

    public NestedFilterRule quantile_ExplictlyNonNull() {
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

    public NestedFilterRule threshold(Double threshold) {

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

    public NestedFilterRule threshold_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_THRESHOLD);
        return this;
    }

    public NestedFilterRule threshold_ExplictlyNonNull() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NestedFilterRule nestedFilterRule = (NestedFilterRule) o;
        return Objects.equals(this.aggregation, nestedFilterRule.aggregation)
                && Objects.equals(this.duration, nestedFilterRule.duration)
                && Objects.equals(this.metric, nestedFilterRule.metric)
                && Objects.equals(this.op, nestedFilterRule.op)
                && Objects.equals(this.quantile, nestedFilterRule.quantile)
                && Objects.equals(this.threshold, nestedFilterRule.threshold);
    }

    @Override
    public int hashCode() {
        return Objects.hash(aggregation, duration, metric, op, quantile, threshold);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NestedFilterRule {\n");
        sb.append("    aggregation: ").append(toIndentedString(aggregation)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
        sb.append("    op: ").append(toIndentedString(op)).append("\n");
        sb.append("    quantile: ").append(toIndentedString(quantile)).append("\n");
        sb.append("    threshold: ").append(toIndentedString(threshold)).append("\n");
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

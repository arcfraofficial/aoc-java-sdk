package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Arrays;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** VmNicQosTraffic */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VmNicQosTraffic extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_RATE_LIMIT_UNIT = "rate_limit_unit";

    @SerializedName(SERIALIZED_NAME_RATE_LIMIT_UNIT)
    private BitPSUnit rateLimitUnit;

    public static final String SERIALIZED_NAME_RATE_LIMIT = "rate_limit";

    @SerializedName(SERIALIZED_NAME_RATE_LIMIT)
    private Long rateLimit;

    public static final String SERIALIZED_NAME_BURST_UNIT = "burst_unit";

    @SerializedName(SERIALIZED_NAME_BURST_UNIT)
    private BitUnit burstUnit;

    public static final String SERIALIZED_NAME_BURST = "burst";

    @SerializedName(SERIALIZED_NAME_BURST)
    private Long burst;

    public static final String SERIALIZED_NAME_ENABLED = "enabled";

    @SerializedName(SERIALIZED_NAME_ENABLED)
    private Boolean enabled;

    public VmNicQosTraffic() {}

    public VmNicQosTraffic rateLimitUnit(BitPSUnit rateLimitUnit) {

        this.rateLimitUnit = rateLimitUnit;
        return this;
    }

    /**
     * Get rateLimitUnit
     *
     * @return rateLimitUnit
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public BitPSUnit getRateLimitUnit() {
        return rateLimitUnit;
    }

    public void setRateLimitUnit(BitPSUnit rateLimitUnit) {
        this.rateLimitUnit = rateLimitUnit;
    }

    public VmNicQosTraffic rateLimitUnit_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RATE_LIMIT_UNIT);
        return this;
    }

    public VmNicQosTraffic rateLimitUnit_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RATE_LIMIT_UNIT);
        return this;
    }

    public void setRateLimitUnit_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RATE_LIMIT_UNIT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RATE_LIMIT_UNIT);
        }
    }

    public boolean getRateLimitUnit_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RATE_LIMIT_UNIT);
    }

    public VmNicQosTraffic rateLimit(Long rateLimit) {

        this.rateLimit = rateLimit;
        return this;
    }

    /**
     * Get rateLimit
     *
     * @return rateLimit
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getRateLimit() {
        return rateLimit;
    }

    public void setRateLimit(Long rateLimit) {
        this.rateLimit = rateLimit;
    }

    public VmNicQosTraffic rateLimit_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RATE_LIMIT);
        return this;
    }

    public VmNicQosTraffic rateLimit_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RATE_LIMIT);
        return this;
    }

    public void setRateLimit_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RATE_LIMIT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RATE_LIMIT);
        }
    }

    public boolean getRateLimit_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RATE_LIMIT);
    }

    public VmNicQosTraffic burstUnit(BitUnit burstUnit) {

        this.burstUnit = burstUnit;
        return this;
    }

    /**
     * Get burstUnit
     *
     * @return burstUnit
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public BitUnit getBurstUnit() {
        return burstUnit;
    }

    public void setBurstUnit(BitUnit burstUnit) {
        this.burstUnit = burstUnit;
    }

    public VmNicQosTraffic burstUnit_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BURST_UNIT);
        return this;
    }

    public VmNicQosTraffic burstUnit_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BURST_UNIT);
        return this;
    }

    public void setBurstUnit_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BURST_UNIT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BURST_UNIT);
        }
    }

    public boolean getBurstUnit_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BURST_UNIT);
    }

    public VmNicQosTraffic burst(Long burst) {

        this.burst = burst;
        return this;
    }

    /**
     * Get burst
     *
     * @return burst
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getBurst() {
        return burst;
    }

    public void setBurst(Long burst) {
        this.burst = burst;
    }

    public VmNicQosTraffic burst_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BURST);
        return this;
    }

    public VmNicQosTraffic burst_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BURST);
        return this;
    }

    public void setBurst_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BURST);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BURST);
        }
    }

    public boolean getBurst_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BURST);
    }

    public VmNicQosTraffic enabled(Boolean enabled) {

        this.enabled = enabled;
        return this;
    }

    /**
     * Get enabled
     *
     * @return enabled
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public VmNicQosTraffic enabled_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENABLED);
        return this;
    }

    public VmNicQosTraffic enabled_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ENABLED);
        return this;
    }

    public void setEnabled_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ENABLED);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ENABLED);
        }
    }

    public boolean getEnabled_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ENABLED);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VmNicQosTraffic vmNicQosTraffic = (VmNicQosTraffic) o;
        return Objects.equals(this.rateLimitUnit, vmNicQosTraffic.rateLimitUnit)
                && Objects.equals(this.rateLimit, vmNicQosTraffic.rateLimit)
                && Objects.equals(this.burstUnit, vmNicQosTraffic.burstUnit)
                && Objects.equals(this.burst, vmNicQosTraffic.burst)
                && Objects.equals(this.enabled, vmNicQosTraffic.enabled);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null
                        && b != null
                        && a.isPresent()
                        && b.isPresent()
                        && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(rateLimitUnit, rateLimit, burstUnit, burst, enabled);
    }

    private static <T> int hashCodeNullable(JsonNullable<T> a) {
        if (a == null) {
            return 1;
        }
        return a.isPresent() ? Arrays.deepHashCode(new Object[] {a.get()}) : 31;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VmNicQosTraffic {\n");
        sb.append("    rateLimitUnit: ").append(toIndentedString(rateLimitUnit)).append("\n");
        sb.append("    rateLimit: ").append(toIndentedString(rateLimit)).append("\n");
        sb.append("    burstUnit: ").append(toIndentedString(burstUnit)).append("\n");
        sb.append("    burst: ").append(toIndentedString(burst)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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

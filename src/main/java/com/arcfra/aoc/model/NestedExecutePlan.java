package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** NestedExecutePlan */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class NestedExecutePlan extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_ENABLED = "enabled";

    @SerializedName(SERIALIZED_NAME_ENABLED)
    private Boolean enabled;

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

    public static final String SERIALIZED_NAME_PERIOD = "period";

    @SerializedName(SERIALIZED_NAME_PERIOD)
    private String period;

    public static final String SERIALIZED_NAME_RETAIN = "retain";

    @SerializedName(SERIALIZED_NAME_RETAIN)
    private Integer retain;

    public static final String SERIALIZED_NAME_START_AT = "start_at";

    @SerializedName(SERIALIZED_NAME_START_AT)
    private String startAt;

    public NestedExecutePlan() {}

    public NestedExecutePlan enabled(Boolean enabled) {

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

    public NestedExecutePlan enabled_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENABLED);
        return this;
    }

    public NestedExecutePlan enabled_ExplictlyNonNull() {
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

    public NestedExecutePlan id(String id) {

        this.id = id;
        return this;
    }

    /**
     * Get id
     *
     * @return id
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public NestedExecutePlan id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public NestedExecutePlan id_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID);
        return this;
    }

    public void setId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID);
        }
    }

    public boolean getId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID);
    }

    public NestedExecutePlan period(String period) {

        this.period = period;
        return this;
    }

    /**
     * Get period
     *
     * @return period
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public NestedExecutePlan period_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PERIOD);
        return this;
    }

    public NestedExecutePlan period_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PERIOD);
        return this;
    }

    public void setPeriod_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PERIOD);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PERIOD);
        }
    }

    public boolean getPeriod_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PERIOD);
    }

    public NestedExecutePlan retain(Integer retain) {

        this.retain = retain;
        return this;
    }

    /**
     * Get retain
     *
     * @return retain
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Integer getRetain() {
        return retain;
    }

    public void setRetain(Integer retain) {
        this.retain = retain;
    }

    public NestedExecutePlan retain_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RETAIN);
        return this;
    }

    public NestedExecutePlan retain_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RETAIN);
        return this;
    }

    public void setRetain_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RETAIN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RETAIN);
        }
    }

    public boolean getRetain_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RETAIN);
    }

    public NestedExecutePlan startAt(String startAt) {

        this.startAt = startAt;
        return this;
    }

    /**
     * Get startAt
     *
     * @return startAt
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getStartAt() {
        return startAt;
    }

    public void setStartAt(String startAt) {
        this.startAt = startAt;
    }

    public NestedExecutePlan startAt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_START_AT);
        return this;
    }

    public NestedExecutePlan startAt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_START_AT);
        return this;
    }

    public void setStartAt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_START_AT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_START_AT);
        }
    }

    public boolean getStartAt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_START_AT);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NestedExecutePlan nestedExecutePlan = (NestedExecutePlan) o;
        return Objects.equals(this.enabled, nestedExecutePlan.enabled)
                && Objects.equals(this.id, nestedExecutePlan.id)
                && Objects.equals(this.period, nestedExecutePlan.period)
                && Objects.equals(this.retain, nestedExecutePlan.retain)
                && Objects.equals(this.startAt, nestedExecutePlan.startAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enabled, id, period, retain, startAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NestedExecutePlan {\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    period: ").append(toIndentedString(period)).append("\n");
        sb.append("    retain: ").append(toIndentedString(retain)).append("\n");
        sb.append("    startAt: ").append(toIndentedString(startAt)).append("\n");
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

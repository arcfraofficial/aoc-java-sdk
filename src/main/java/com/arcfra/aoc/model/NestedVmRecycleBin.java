package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** NestedVmRecycleBin */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class NestedVmRecycleBin extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_ENABLED = "enabled";

    @SerializedName(SERIALIZED_NAME_ENABLED)
    private Boolean enabled;

    public static final String SERIALIZED_NAME_RETAIN = "retain";

    @SerializedName(SERIALIZED_NAME_RETAIN)
    private Integer retain;

    public NestedVmRecycleBin() {}

    public NestedVmRecycleBin enabled(Boolean enabled) {

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

    public NestedVmRecycleBin enabled_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENABLED);
        return this;
    }

    public NestedVmRecycleBin enabled_ExplictlyNonNull() {
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

    public NestedVmRecycleBin retain(Integer retain) {

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

    public NestedVmRecycleBin retain_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RETAIN);
        return this;
    }

    public NestedVmRecycleBin retain_ExplictlyNonNull() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NestedVmRecycleBin nestedVmRecycleBin = (NestedVmRecycleBin) o;
        return Objects.equals(this.enabled, nestedVmRecycleBin.enabled)
                && Objects.equals(this.retain, nestedVmRecycleBin.retain);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enabled, retain);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NestedVmRecycleBin {\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    retain: ").append(toIndentedString(retain)).append("\n");
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

package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** NestedReplicationIPAddressMapping */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class NestedReplicationIPAddressMapping
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_SOURCE = "source";

    @SerializedName(SERIALIZED_NAME_SOURCE)
    private NestedReplicationNetworkConfigure source;

    public static final String SERIALIZED_NAME_TARGET = "target";

    @SerializedName(SERIALIZED_NAME_TARGET)
    private NestedReplicationNetworkConfigure target;

    public NestedReplicationIPAddressMapping() {}

    public NestedReplicationIPAddressMapping source(NestedReplicationNetworkConfigure source) {

        this.source = source;
        return this;
    }

    /**
     * Get source
     *
     * @return source
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public NestedReplicationNetworkConfigure getSource() {
        return source;
    }

    public void setSource(NestedReplicationNetworkConfigure source) {
        this.source = source;
    }

    public NestedReplicationIPAddressMapping source_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SOURCE);
        return this;
    }

    public NestedReplicationIPAddressMapping source_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SOURCE);
        return this;
    }

    public void setSource_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SOURCE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SOURCE);
        }
    }

    public boolean getSource_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SOURCE);
    }

    public NestedReplicationIPAddressMapping target(NestedReplicationNetworkConfigure target) {

        this.target = target;
        return this;
    }

    /**
     * Get target
     *
     * @return target
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public NestedReplicationNetworkConfigure getTarget() {
        return target;
    }

    public void setTarget(NestedReplicationNetworkConfigure target) {
        this.target = target;
    }

    public NestedReplicationIPAddressMapping target_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TARGET);
        return this;
    }

    public NestedReplicationIPAddressMapping target_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TARGET);
        return this;
    }

    public void setTarget_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TARGET);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TARGET);
        }
    }

    public boolean getTarget_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TARGET);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NestedReplicationIPAddressMapping nestedReplicationIPAddressMapping =
                (NestedReplicationIPAddressMapping) o;
        return Objects.equals(this.source, nestedReplicationIPAddressMapping.source)
                && Objects.equals(this.target, nestedReplicationIPAddressMapping.target);
    }

    @Override
    public int hashCode() {
        return Objects.hash(source, target);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NestedReplicationIPAddressMapping {\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    target: ").append(toIndentedString(target)).append("\n");
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

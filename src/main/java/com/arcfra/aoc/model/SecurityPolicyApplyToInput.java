package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** SecurityPolicyApplyToInput */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class SecurityPolicyApplyToInput
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_COMMUNICABLE = "communicable";

    @SerializedName(SERIALIZED_NAME_COMMUNICABLE)
    private Boolean communicable;

    public static final String SERIALIZED_NAME_TARGET = "target";

    @SerializedName(SERIALIZED_NAME_TARGET)
    private SecurityPolicyApplyToInputTarget target;

    public SecurityPolicyApplyToInput() {}

    public SecurityPolicyApplyToInput communicable(Boolean communicable) {

        this.communicable = communicable;
        return this;
    }

    /**
     * Get communicable
     *
     * @return communicable
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getCommunicable() {
        return communicable;
    }

    public void setCommunicable(Boolean communicable) {
        this.communicable = communicable;
    }

    public SecurityPolicyApplyToInput communicable_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_COMMUNICABLE);
        return this;
    }

    public SecurityPolicyApplyToInput communicable_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_COMMUNICABLE);
        return this;
    }

    public void setCommunicable_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_COMMUNICABLE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_COMMUNICABLE);
        }
    }

    public boolean getCommunicable_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_COMMUNICABLE);
    }

    public SecurityPolicyApplyToInput target(SecurityPolicyApplyToInputTarget target) {

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
    public SecurityPolicyApplyToInputTarget getTarget() {
        return target;
    }

    public void setTarget(SecurityPolicyApplyToInputTarget target) {
        this.target = target;
    }

    public SecurityPolicyApplyToInput target_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TARGET);
        return this;
    }

    public SecurityPolicyApplyToInput target_ExplictlyNonNull() {
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
        SecurityPolicyApplyToInput securityPolicyApplyToInput = (SecurityPolicyApplyToInput) o;
        return Objects.equals(this.communicable, securityPolicyApplyToInput.communicable)
                && Objects.equals(this.target, securityPolicyApplyToInput.target);
    }

    @Override
    public int hashCode() {
        return Objects.hash(communicable, target);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SecurityPolicyApplyToInput {\n");
        sb.append("    communicable: ").append(toIndentedString(communicable)).append("\n");
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

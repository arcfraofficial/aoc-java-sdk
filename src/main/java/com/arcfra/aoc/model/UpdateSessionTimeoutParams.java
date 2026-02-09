package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** UpdateSessionTimeoutParams */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class UpdateSessionTimeoutParams
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_SESSION_MAX_AGE = "session_max_age";

    @SerializedName(SERIALIZED_NAME_SESSION_MAX_AGE)
    private Integer sessionMaxAge;

    public UpdateSessionTimeoutParams() {}

    public UpdateSessionTimeoutParams sessionMaxAge(Integer sessionMaxAge) {

        this.sessionMaxAge = sessionMaxAge;
        return this;
    }

    /**
     * Get sessionMaxAge
     *
     * @return sessionMaxAge
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Integer getSessionMaxAge() {
        return sessionMaxAge;
    }

    public void setSessionMaxAge(Integer sessionMaxAge) {
        this.sessionMaxAge = sessionMaxAge;
    }

    public UpdateSessionTimeoutParams sessionMaxAge_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SESSION_MAX_AGE);
        return this;
    }

    public UpdateSessionTimeoutParams sessionMaxAge_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SESSION_MAX_AGE);
        return this;
    }

    public void setSessionMaxAge_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SESSION_MAX_AGE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SESSION_MAX_AGE);
        }
    }

    public boolean getSessionMaxAge_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SESSION_MAX_AGE);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateSessionTimeoutParams updateSessionTimeoutParams = (UpdateSessionTimeoutParams) o;
        return Objects.equals(this.sessionMaxAge, updateSessionTimeoutParams.sessionMaxAge);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sessionMaxAge);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateSessionTimeoutParams {\n");
        sb.append("    sessionMaxAge: ").append(toIndentedString(sessionMaxAge)).append("\n");
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

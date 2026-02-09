package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** UpdatePassrodSecurityParams */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class UpdatePassrodSecurityParams
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_PASSWORD_EXPIRE_DAYS = "password_expire_days";

    @SerializedName(SERIALIZED_NAME_PASSWORD_EXPIRE_DAYS)
    private Integer passwordExpireDays;

    public static final String SERIALIZED_NAME_PASSWORD_COMPLEXITY = "password_complexity";

    @SerializedName(SERIALIZED_NAME_PASSWORD_COMPLEXITY)
    private PasswordComplexity passwordComplexity;

    public static final String SERIALIZED_NAME_LOGIN_MISS_TIME_THRESHOLD =
            "login_miss_time_threshold";

    @SerializedName(SERIALIZED_NAME_LOGIN_MISS_TIME_THRESHOLD)
    private Integer loginMissTimeThreshold;

    public static final String SERIALIZED_NAME_LOGIN_MISS_NUM_THRESHOLD =
            "login_miss_num_threshold";

    @SerializedName(SERIALIZED_NAME_LOGIN_MISS_NUM_THRESHOLD)
    private Integer loginMissNumThreshold;

    public UpdatePassrodSecurityParams() {}

    public UpdatePassrodSecurityParams passwordExpireDays(Integer passwordExpireDays) {

        this.passwordExpireDays = passwordExpireDays;
        return this;
    }

    /**
     * Get passwordExpireDays
     *
     * @return passwordExpireDays
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getPasswordExpireDays() {
        return passwordExpireDays;
    }

    public void setPasswordExpireDays(Integer passwordExpireDays) {
        this.passwordExpireDays = passwordExpireDays;
    }

    public UpdatePassrodSecurityParams passwordExpireDays_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PASSWORD_EXPIRE_DAYS);
        return this;
    }

    public UpdatePassrodSecurityParams passwordExpireDays_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PASSWORD_EXPIRE_DAYS);
        return this;
    }

    public void setPasswordExpireDays_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PASSWORD_EXPIRE_DAYS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PASSWORD_EXPIRE_DAYS);
        }
    }

    public boolean getPasswordExpireDays_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PASSWORD_EXPIRE_DAYS);
    }

    public UpdatePassrodSecurityParams passwordComplexity(PasswordComplexity passwordComplexity) {

        this.passwordComplexity = passwordComplexity;
        return this;
    }

    /**
     * Get passwordComplexity
     *
     * @return passwordComplexity
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public PasswordComplexity getPasswordComplexity() {
        return passwordComplexity;
    }

    public void setPasswordComplexity(PasswordComplexity passwordComplexity) {
        this.passwordComplexity = passwordComplexity;
    }

    public UpdatePassrodSecurityParams passwordComplexity_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PASSWORD_COMPLEXITY);
        return this;
    }

    public UpdatePassrodSecurityParams passwordComplexity_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PASSWORD_COMPLEXITY);
        return this;
    }

    public void setPasswordComplexity_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PASSWORD_COMPLEXITY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PASSWORD_COMPLEXITY);
        }
    }

    public boolean getPasswordComplexity_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PASSWORD_COMPLEXITY);
    }

    public UpdatePassrodSecurityParams loginMissTimeThreshold(Integer loginMissTimeThreshold) {

        this.loginMissTimeThreshold = loginMissTimeThreshold;
        return this;
    }

    /**
     * Get loginMissTimeThreshold
     *
     * @return loginMissTimeThreshold
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getLoginMissTimeThreshold() {
        return loginMissTimeThreshold;
    }

    public void setLoginMissTimeThreshold(Integer loginMissTimeThreshold) {
        this.loginMissTimeThreshold = loginMissTimeThreshold;
    }

    public UpdatePassrodSecurityParams loginMissTimeThreshold_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOGIN_MISS_TIME_THRESHOLD);
        return this;
    }

    public UpdatePassrodSecurityParams loginMissTimeThreshold_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOGIN_MISS_TIME_THRESHOLD);
        return this;
    }

    public void setLoginMissTimeThreshold_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOGIN_MISS_TIME_THRESHOLD);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOGIN_MISS_TIME_THRESHOLD);
        }
    }

    public boolean getLoginMissTimeThreshold_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOGIN_MISS_TIME_THRESHOLD);
    }

    public UpdatePassrodSecurityParams loginMissNumThreshold(Integer loginMissNumThreshold) {

        this.loginMissNumThreshold = loginMissNumThreshold;
        return this;
    }

    /**
     * Get loginMissNumThreshold
     *
     * @return loginMissNumThreshold
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getLoginMissNumThreshold() {
        return loginMissNumThreshold;
    }

    public void setLoginMissNumThreshold(Integer loginMissNumThreshold) {
        this.loginMissNumThreshold = loginMissNumThreshold;
    }

    public UpdatePassrodSecurityParams loginMissNumThreshold_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOGIN_MISS_NUM_THRESHOLD);
        return this;
    }

    public UpdatePassrodSecurityParams loginMissNumThreshold_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOGIN_MISS_NUM_THRESHOLD);
        return this;
    }

    public void setLoginMissNumThreshold_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOGIN_MISS_NUM_THRESHOLD);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOGIN_MISS_NUM_THRESHOLD);
        }
    }

    public boolean getLoginMissNumThreshold_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOGIN_MISS_NUM_THRESHOLD);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdatePassrodSecurityParams updatePassrodSecurityParams = (UpdatePassrodSecurityParams) o;
        return Objects.equals(
                        this.passwordExpireDays, updatePassrodSecurityParams.passwordExpireDays)
                && Objects.equals(
                        this.passwordComplexity, updatePassrodSecurityParams.passwordComplexity)
                && Objects.equals(
                        this.loginMissTimeThreshold,
                        updatePassrodSecurityParams.loginMissTimeThreshold)
                && Objects.equals(
                        this.loginMissNumThreshold,
                        updatePassrodSecurityParams.loginMissNumThreshold);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                passwordExpireDays,
                passwordComplexity,
                loginMissTimeThreshold,
                loginMissNumThreshold);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePassrodSecurityParams {\n");
        sb.append("    passwordExpireDays: ")
                .append(toIndentedString(passwordExpireDays))
                .append("\n");
        sb.append("    passwordComplexity: ")
                .append(toIndentedString(passwordComplexity))
                .append("\n");
        sb.append("    loginMissTimeThreshold: ")
                .append(toIndentedString(loginMissTimeThreshold))
                .append("\n");
        sb.append("    loginMissNumThreshold: ")
                .append(toIndentedString(loginMissNumThreshold))
                .append("\n");
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

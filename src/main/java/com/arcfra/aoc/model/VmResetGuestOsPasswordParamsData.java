package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** VmResetGuestOsPasswordParamsData */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VmResetGuestOsPasswordParamsData
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_PASSWORD = "password";

    @SerializedName(SERIALIZED_NAME_PASSWORD)
    private String password;

    public static final String SERIALIZED_NAME_USERNAME = "username";

    @SerializedName(SERIALIZED_NAME_USERNAME)
    private String username;

    public VmResetGuestOsPasswordParamsData() {}

    public VmResetGuestOsPasswordParamsData password(String password) {

        this.password = password;
        return this;
    }

    /**
     * Get password
     *
     * @return password
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public VmResetGuestOsPasswordParamsData password_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PASSWORD);
        return this;
    }

    public VmResetGuestOsPasswordParamsData password_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PASSWORD);
        return this;
    }

    public void setPassword_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PASSWORD);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PASSWORD);
        }
    }

    public boolean getPassword_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PASSWORD);
    }

    public VmResetGuestOsPasswordParamsData username(String username) {

        this.username = username;
        return this;
    }

    /**
     * Get username
     *
     * @return username
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public VmResetGuestOsPasswordParamsData username_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USERNAME);
        return this;
    }

    public VmResetGuestOsPasswordParamsData username_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USERNAME);
        return this;
    }

    public void setUsername_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USERNAME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USERNAME);
        }
    }

    public boolean getUsername_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USERNAME);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VmResetGuestOsPasswordParamsData vmResetGuestOsPasswordParamsData =
                (VmResetGuestOsPasswordParamsData) o;
        return Objects.equals(this.password, vmResetGuestOsPasswordParamsData.password)
                && Objects.equals(this.username, vmResetGuestOsPasswordParamsData.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(password, username);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VmResetGuestOsPasswordParamsData {\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    username: ").append(toIndentedString(username)).append("\n");
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

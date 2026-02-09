package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** HostAuthInfo */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class HostAuthInfo extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_ROOT_USER_PASSWORD = "root_user_password";

    @SerializedName(SERIALIZED_NAME_ROOT_USER_PASSWORD)
    private String rootUserPassword;

    public static final String SERIALIZED_NAME_DEFAULT_USER_PASSWORD = "default_user_password";

    @SerializedName(SERIALIZED_NAME_DEFAULT_USER_PASSWORD)
    private String defaultUserPassword;

    public HostAuthInfo() {}

    public HostAuthInfo rootUserPassword(String rootUserPassword) {

        this.rootUserPassword = rootUserPassword;
        return this;
    }

    /**
     * Get rootUserPassword
     *
     * @return rootUserPassword
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getRootUserPassword() {
        return rootUserPassword;
    }

    public void setRootUserPassword(String rootUserPassword) {
        this.rootUserPassword = rootUserPassword;
    }

    public HostAuthInfo rootUserPassword_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ROOT_USER_PASSWORD);
        return this;
    }

    public HostAuthInfo rootUserPassword_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ROOT_USER_PASSWORD);
        return this;
    }

    public void setRootUserPassword_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ROOT_USER_PASSWORD);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ROOT_USER_PASSWORD);
        }
    }

    public boolean getRootUserPassword_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ROOT_USER_PASSWORD);
    }

    public HostAuthInfo defaultUserPassword(String defaultUserPassword) {

        this.defaultUserPassword = defaultUserPassword;
        return this;
    }

    /**
     * Get defaultUserPassword
     *
     * @return defaultUserPassword
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDefaultUserPassword() {
        return defaultUserPassword;
    }

    public void setDefaultUserPassword(String defaultUserPassword) {
        this.defaultUserPassword = defaultUserPassword;
    }

    public HostAuthInfo defaultUserPassword_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEFAULT_USER_PASSWORD);
        return this;
    }

    public HostAuthInfo defaultUserPassword_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_USER_PASSWORD);
        return this;
    }

    public void setDefaultUserPassword_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEFAULT_USER_PASSWORD);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_USER_PASSWORD);
        }
    }

    public boolean getDefaultUserPassword_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEFAULT_USER_PASSWORD);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HostAuthInfo hostAuthInfo = (HostAuthInfo) o;
        return Objects.equals(this.rootUserPassword, hostAuthInfo.rootUserPassword)
                && Objects.equals(this.defaultUserPassword, hostAuthInfo.defaultUserPassword);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rootUserPassword, defaultUserPassword);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HostAuthInfo {\n");
        sb.append("    rootUserPassword: ").append(toIndentedString(rootUserPassword)).append("\n");
        sb.append("    defaultUserPassword: ")
                .append(toIndentedString(defaultUserPassword))
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

package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** UpdateVsphereEsxiAccountParamsData */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class UpdateVsphereEsxiAccountParamsData
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_PORT = "port";

    @SerializedName(SERIALIZED_NAME_PORT)
    private Integer port;

    public static final String SERIALIZED_NAME_PASSWORD = "password";

    @SerializedName(SERIALIZED_NAME_PASSWORD)
    private String password;

    public static final String SERIALIZED_NAME_USERNAME = "username";

    @SerializedName(SERIALIZED_NAME_USERNAME)
    private String username;

    public static final String SERIALIZED_NAME_IP = "ip";

    @SerializedName(SERIALIZED_NAME_IP)
    private String ip;

    public static final String SERIALIZED_NAME_ESXI_ACCOUNT_ID = "esxi_account_id";

    @SerializedName(SERIALIZED_NAME_ESXI_ACCOUNT_ID)
    private String esxiAccountId;

    public UpdateVsphereEsxiAccountParamsData() {}

    public UpdateVsphereEsxiAccountParamsData port(Integer port) {

        this.port = port;
        return this;
    }

    /**
     * Get port
     *
     * @return port
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public UpdateVsphereEsxiAccountParamsData port_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PORT);
        return this;
    }

    public UpdateVsphereEsxiAccountParamsData port_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PORT);
        return this;
    }

    public void setPort_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PORT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PORT);
        }
    }

    public boolean getPort_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PORT);
    }

    public UpdateVsphereEsxiAccountParamsData password(String password) {

        this.password = password;
        return this;
    }

    /**
     * Get password
     *
     * @return password
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UpdateVsphereEsxiAccountParamsData password_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PASSWORD);
        return this;
    }

    public UpdateVsphereEsxiAccountParamsData password_ExplictlyNonNull() {
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

    public UpdateVsphereEsxiAccountParamsData username(String username) {

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

    public UpdateVsphereEsxiAccountParamsData username_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USERNAME);
        return this;
    }

    public UpdateVsphereEsxiAccountParamsData username_ExplictlyNonNull() {
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

    public UpdateVsphereEsxiAccountParamsData ip(String ip) {

        this.ip = ip;
        return this;
    }

    /**
     * Get ip
     *
     * @return ip
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public UpdateVsphereEsxiAccountParamsData ip_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP);
        return this;
    }

    public UpdateVsphereEsxiAccountParamsData ip_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IP);
        return this;
    }

    public void setIp_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IP);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IP);
        }
    }

    public boolean getIp_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IP);
    }

    public UpdateVsphereEsxiAccountParamsData esxiAccountId(String esxiAccountId) {

        this.esxiAccountId = esxiAccountId;
        return this;
    }

    /**
     * Get esxiAccountId
     *
     * @return esxiAccountId
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getEsxiAccountId() {
        return esxiAccountId;
    }

    public void setEsxiAccountId(String esxiAccountId) {
        this.esxiAccountId = esxiAccountId;
    }

    public UpdateVsphereEsxiAccountParamsData esxiAccountId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ESXI_ACCOUNT_ID);
        return this;
    }

    public UpdateVsphereEsxiAccountParamsData esxiAccountId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ESXI_ACCOUNT_ID);
        return this;
    }

    public void setEsxiAccountId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ESXI_ACCOUNT_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ESXI_ACCOUNT_ID);
        }
    }

    public boolean getEsxiAccountId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ESXI_ACCOUNT_ID);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateVsphereEsxiAccountParamsData updateVsphereEsxiAccountParamsData =
                (UpdateVsphereEsxiAccountParamsData) o;
        return Objects.equals(this.port, updateVsphereEsxiAccountParamsData.port)
                && Objects.equals(this.password, updateVsphereEsxiAccountParamsData.password)
                && Objects.equals(this.username, updateVsphereEsxiAccountParamsData.username)
                && Objects.equals(this.ip, updateVsphereEsxiAccountParamsData.ip)
                && Objects.equals(
                        this.esxiAccountId, updateVsphereEsxiAccountParamsData.esxiAccountId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(port, password, username, ip, esxiAccountId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateVsphereEsxiAccountParamsData {\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    username: ").append(toIndentedString(username)).append("\n");
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
        sb.append("    esxiAccountId: ").append(toIndentedString(esxiAccountId)).append("\n");
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

package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** CreateVcenterAccountParamsData */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class CreateVcenterAccountParamsData
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

    public static final String SERIALIZED_NAME_CLUSTER_ID = "cluster_id";

    @SerializedName(SERIALIZED_NAME_CLUSTER_ID)
    private String clusterId;

    public CreateVcenterAccountParamsData() {}

    public CreateVcenterAccountParamsData port(Integer port) {

        this.port = port;
        return this;
    }

    /**
     * Get port
     *
     * @return port
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public CreateVcenterAccountParamsData port_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PORT);
        return this;
    }

    public CreateVcenterAccountParamsData port_ExplictlyNonNull() {
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

    public CreateVcenterAccountParamsData password(String password) {

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

    public CreateVcenterAccountParamsData password_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PASSWORD);
        return this;
    }

    public CreateVcenterAccountParamsData password_ExplictlyNonNull() {
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

    public CreateVcenterAccountParamsData username(String username) {

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

    public CreateVcenterAccountParamsData username_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USERNAME);
        return this;
    }

    public CreateVcenterAccountParamsData username_ExplictlyNonNull() {
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

    public CreateVcenterAccountParamsData ip(String ip) {

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

    public CreateVcenterAccountParamsData ip_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP);
        return this;
    }

    public CreateVcenterAccountParamsData ip_ExplictlyNonNull() {
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

    public CreateVcenterAccountParamsData clusterId(String clusterId) {

        this.clusterId = clusterId;
        return this;
    }

    /**
     * Get clusterId
     *
     * @return clusterId
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public CreateVcenterAccountParamsData clusterId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER_ID);
        return this;
    }

    public CreateVcenterAccountParamsData clusterId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_ID);
        return this;
    }

    public void setClusterId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLUSTER_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_ID);
        }
    }

    public boolean getClusterId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLUSTER_ID);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateVcenterAccountParamsData createVcenterAccountParamsData =
                (CreateVcenterAccountParamsData) o;
        return Objects.equals(this.port, createVcenterAccountParamsData.port)
                && Objects.equals(this.password, createVcenterAccountParamsData.password)
                && Objects.equals(this.username, createVcenterAccountParamsData.username)
                && Objects.equals(this.ip, createVcenterAccountParamsData.ip)
                && Objects.equals(this.clusterId, createVcenterAccountParamsData.clusterId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(port, password, username, ip, clusterId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateVcenterAccountParamsData {\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    username: ").append(toIndentedString(username)).append("\n");
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
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

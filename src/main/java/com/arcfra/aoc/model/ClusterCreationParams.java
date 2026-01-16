package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** ClusterCreationParams */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class ClusterCreationParams
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_DATACENTER_ID = "datacenter_id";

    @SerializedName(SERIALIZED_NAME_DATACENTER_ID)
    private String datacenterId;

    public static final String SERIALIZED_NAME_SECONDARY_ZONE_DATACENTER_ID =
            "secondary_zone_datacenter_id";

    @SerializedName(SERIALIZED_NAME_SECONDARY_ZONE_DATACENTER_ID)
    private String secondaryZoneDatacenterId;

    public static final String SERIALIZED_NAME_PRIMARY_ZONE_DATACENTER_ID =
            "primary_zone_datacenter_id";

    @SerializedName(SERIALIZED_NAME_PRIMARY_ZONE_DATACENTER_ID)
    private String primaryZoneDatacenterId;

    public static final String SERIALIZED_NAME_PASSWORD = "password";

    @SerializedName(SERIALIZED_NAME_PASSWORD)
    private String password;

    public static final String SERIALIZED_NAME_USERNAME = "username";

    @SerializedName(SERIALIZED_NAME_USERNAME)
    private String username;

    public static final String SERIALIZED_NAME_IP = "ip";

    @SerializedName(SERIALIZED_NAME_IP)
    private String ip;

    public ClusterCreationParams() {}

    public ClusterCreationParams datacenterId(String datacenterId) {

        this.datacenterId = datacenterId;
        return this;
    }

    /**
     * Get datacenterId
     *
     * @return datacenterId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDatacenterId() {
        return datacenterId;
    }

    public void setDatacenterId(String datacenterId) {
        this.datacenterId = datacenterId;
    }

    public ClusterCreationParams datacenterId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATACENTER_ID);
        return this;
    }

    public ClusterCreationParams datacenterId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATACENTER_ID);
        return this;
    }

    public void setDatacenterId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATACENTER_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATACENTER_ID);
        }
    }

    public boolean getDatacenterId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATACENTER_ID);
    }

    public ClusterCreationParams secondaryZoneDatacenterId(String secondaryZoneDatacenterId) {

        this.secondaryZoneDatacenterId = secondaryZoneDatacenterId;
        return this;
    }

    /**
     * Get secondaryZoneDatacenterId
     *
     * @return secondaryZoneDatacenterId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSecondaryZoneDatacenterId() {
        return secondaryZoneDatacenterId;
    }

    public void setSecondaryZoneDatacenterId(String secondaryZoneDatacenterId) {
        this.secondaryZoneDatacenterId = secondaryZoneDatacenterId;
    }

    public ClusterCreationParams secondaryZoneDatacenterId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SECONDARY_ZONE_DATACENTER_ID);
        return this;
    }

    public ClusterCreationParams secondaryZoneDatacenterId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SECONDARY_ZONE_DATACENTER_ID);
        return this;
    }

    public void setSecondaryZoneDatacenterId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SECONDARY_ZONE_DATACENTER_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SECONDARY_ZONE_DATACENTER_ID);
        }
    }

    public boolean getSecondaryZoneDatacenterId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SECONDARY_ZONE_DATACENTER_ID);
    }

    public ClusterCreationParams primaryZoneDatacenterId(String primaryZoneDatacenterId) {

        this.primaryZoneDatacenterId = primaryZoneDatacenterId;
        return this;
    }

    /**
     * Get primaryZoneDatacenterId
     *
     * @return primaryZoneDatacenterId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPrimaryZoneDatacenterId() {
        return primaryZoneDatacenterId;
    }

    public void setPrimaryZoneDatacenterId(String primaryZoneDatacenterId) {
        this.primaryZoneDatacenterId = primaryZoneDatacenterId;
    }

    public ClusterCreationParams primaryZoneDatacenterId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRIMARY_ZONE_DATACENTER_ID);
        return this;
    }

    public ClusterCreationParams primaryZoneDatacenterId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRIMARY_ZONE_DATACENTER_ID);
        return this;
    }

    public void setPrimaryZoneDatacenterId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRIMARY_ZONE_DATACENTER_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRIMARY_ZONE_DATACENTER_ID);
        }
    }

    public boolean getPrimaryZoneDatacenterId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRIMARY_ZONE_DATACENTER_ID);
    }

    public ClusterCreationParams password(String password) {

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

    public ClusterCreationParams password_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PASSWORD);
        return this;
    }

    public ClusterCreationParams password_ExplictlyNonNull() {
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

    public ClusterCreationParams username(String username) {

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

    public ClusterCreationParams username_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USERNAME);
        return this;
    }

    public ClusterCreationParams username_ExplictlyNonNull() {
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

    public ClusterCreationParams ip(String ip) {

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

    public ClusterCreationParams ip_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP);
        return this;
    }

    public ClusterCreationParams ip_ExplictlyNonNull() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ClusterCreationParams clusterCreationParams = (ClusterCreationParams) o;
        return Objects.equals(this.datacenterId, clusterCreationParams.datacenterId)
                && Objects.equals(
                        this.secondaryZoneDatacenterId,
                        clusterCreationParams.secondaryZoneDatacenterId)
                && Objects.equals(
                        this.primaryZoneDatacenterId, clusterCreationParams.primaryZoneDatacenterId)
                && Objects.equals(this.password, clusterCreationParams.password)
                && Objects.equals(this.username, clusterCreationParams.username)
                && Objects.equals(this.ip, clusterCreationParams.ip);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                datacenterId,
                secondaryZoneDatacenterId,
                primaryZoneDatacenterId,
                password,
                username,
                ip);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClusterCreationParams {\n");
        sb.append("    datacenterId: ").append(toIndentedString(datacenterId)).append("\n");
        sb.append("    secondaryZoneDatacenterId: ")
                .append(toIndentedString(secondaryZoneDatacenterId))
                .append("\n");
        sb.append("    primaryZoneDatacenterId: ")
                .append(toIndentedString(primaryZoneDatacenterId))
                .append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    username: ").append(toIndentedString(username)).append("\n");
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
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

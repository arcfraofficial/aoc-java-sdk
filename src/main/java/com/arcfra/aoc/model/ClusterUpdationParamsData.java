package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** ClusterUpdationParamsData */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class ClusterUpdationParamsData
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_SECONDARY_ZONE_ID = "secondary_zone_id";

    @SerializedName(SERIALIZED_NAME_SECONDARY_ZONE_ID)
    private String secondaryZoneId;

    public static final String SERIALIZED_NAME_PRIMARY_ZONE_ID = "primary_zone_id";

    @SerializedName(SERIALIZED_NAME_PRIMARY_ZONE_ID)
    private String primaryZoneId;

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

    public ClusterUpdationParamsData() {}

    public ClusterUpdationParamsData secondaryZoneId(String secondaryZoneId) {

        this.secondaryZoneId = secondaryZoneId;
        return this;
    }

    /**
     * Get secondaryZoneId
     *
     * @return secondaryZoneId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSecondaryZoneId() {
        return secondaryZoneId;
    }

    public void setSecondaryZoneId(String secondaryZoneId) {
        this.secondaryZoneId = secondaryZoneId;
    }

    public ClusterUpdationParamsData secondaryZoneId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SECONDARY_ZONE_ID);
        return this;
    }

    public ClusterUpdationParamsData secondaryZoneId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SECONDARY_ZONE_ID);
        return this;
    }

    public void setSecondaryZoneId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SECONDARY_ZONE_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SECONDARY_ZONE_ID);
        }
    }

    public boolean getSecondaryZoneId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SECONDARY_ZONE_ID);
    }

    public ClusterUpdationParamsData primaryZoneId(String primaryZoneId) {

        this.primaryZoneId = primaryZoneId;
        return this;
    }

    /**
     * Get primaryZoneId
     *
     * @return primaryZoneId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPrimaryZoneId() {
        return primaryZoneId;
    }

    public void setPrimaryZoneId(String primaryZoneId) {
        this.primaryZoneId = primaryZoneId;
    }

    public ClusterUpdationParamsData primaryZoneId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRIMARY_ZONE_ID);
        return this;
    }

    public ClusterUpdationParamsData primaryZoneId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PRIMARY_ZONE_ID);
        return this;
    }

    public void setPrimaryZoneId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PRIMARY_ZONE_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PRIMARY_ZONE_ID);
        }
    }

    public boolean getPrimaryZoneId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PRIMARY_ZONE_ID);
    }

    public ClusterUpdationParamsData datacenterId(String datacenterId) {

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

    public ClusterUpdationParamsData datacenterId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATACENTER_ID);
        return this;
    }

    public ClusterUpdationParamsData datacenterId_ExplictlyNonNull() {
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

    public ClusterUpdationParamsData secondaryZoneDatacenterId(String secondaryZoneDatacenterId) {

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

    public ClusterUpdationParamsData secondaryZoneDatacenterId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SECONDARY_ZONE_DATACENTER_ID);
        return this;
    }

    public ClusterUpdationParamsData secondaryZoneDatacenterId_ExplictlyNonNull() {
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

    public ClusterUpdationParamsData primaryZoneDatacenterId(String primaryZoneDatacenterId) {

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

    public ClusterUpdationParamsData primaryZoneDatacenterId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PRIMARY_ZONE_DATACENTER_ID);
        return this;
    }

    public ClusterUpdationParamsData primaryZoneDatacenterId_ExplictlyNonNull() {
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

    public ClusterUpdationParamsData password(String password) {

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

    public ClusterUpdationParamsData password_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PASSWORD);
        return this;
    }

    public ClusterUpdationParamsData password_ExplictlyNonNull() {
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

    public ClusterUpdationParamsData username(String username) {

        this.username = username;
        return this;
    }

    /**
     * Get username
     *
     * @return username
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public ClusterUpdationParamsData username_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USERNAME);
        return this;
    }

    public ClusterUpdationParamsData username_ExplictlyNonNull() {
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

    public ClusterUpdationParamsData ip(String ip) {

        this.ip = ip;
        return this;
    }

    /**
     * Get ip
     *
     * @return ip
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public ClusterUpdationParamsData ip_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP);
        return this;
    }

    public ClusterUpdationParamsData ip_ExplictlyNonNull() {
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
        ClusterUpdationParamsData clusterUpdationParamsData = (ClusterUpdationParamsData) o;
        return Objects.equals(this.secondaryZoneId, clusterUpdationParamsData.secondaryZoneId)
                && Objects.equals(this.primaryZoneId, clusterUpdationParamsData.primaryZoneId)
                && Objects.equals(this.datacenterId, clusterUpdationParamsData.datacenterId)
                && Objects.equals(
                        this.secondaryZoneDatacenterId,
                        clusterUpdationParamsData.secondaryZoneDatacenterId)
                && Objects.equals(
                        this.primaryZoneDatacenterId,
                        clusterUpdationParamsData.primaryZoneDatacenterId)
                && Objects.equals(this.password, clusterUpdationParamsData.password)
                && Objects.equals(this.username, clusterUpdationParamsData.username)
                && Objects.equals(this.ip, clusterUpdationParamsData.ip);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                secondaryZoneId,
                primaryZoneId,
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
        sb.append("class ClusterUpdationParamsData {\n");
        sb.append("    secondaryZoneId: ").append(toIndentedString(secondaryZoneId)).append("\n");
        sb.append("    primaryZoneId: ").append(toIndentedString(primaryZoneId)).append("\n");
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

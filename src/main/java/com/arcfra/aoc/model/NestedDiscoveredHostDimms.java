package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** NestedDiscoveredHostDimms */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class NestedDiscoveredHostDimms
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_DIMM_ID = "dimm_id";

    @SerializedName(SERIALIZED_NAME_DIMM_ID)
    private String dimmId;

    public static final String SERIALIZED_NAME_FW_VERSION = "fw_version";

    @SerializedName(SERIALIZED_NAME_FW_VERSION)
    private String fwVersion;

    public static final String SERIALIZED_NAME_HEALTH_STATUS = "health_status";

    @SerializedName(SERIALIZED_NAME_HEALTH_STATUS)
    private String healthStatus;

    public static final String SERIALIZED_NAME_SOCKET_ID = "socket_id";

    @SerializedName(SERIALIZED_NAME_SOCKET_ID)
    private String socketId;

    public NestedDiscoveredHostDimms() {}

    public NestedDiscoveredHostDimms dimmId(String dimmId) {

        this.dimmId = dimmId;
        return this;
    }

    /**
     * Get dimmId
     *
     * @return dimmId
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getDimmId() {
        return dimmId;
    }

    public void setDimmId(String dimmId) {
        this.dimmId = dimmId;
    }

    public NestedDiscoveredHostDimms dimmId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DIMM_ID);
        return this;
    }

    public NestedDiscoveredHostDimms dimmId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DIMM_ID);
        return this;
    }

    public void setDimmId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DIMM_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DIMM_ID);
        }
    }

    public boolean getDimmId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DIMM_ID);
    }

    public NestedDiscoveredHostDimms fwVersion(String fwVersion) {

        this.fwVersion = fwVersion;
        return this;
    }

    /**
     * Get fwVersion
     *
     * @return fwVersion
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getFwVersion() {
        return fwVersion;
    }

    public void setFwVersion(String fwVersion) {
        this.fwVersion = fwVersion;
    }

    public NestedDiscoveredHostDimms fwVersion_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FW_VERSION);
        return this;
    }

    public NestedDiscoveredHostDimms fwVersion_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FW_VERSION);
        return this;
    }

    public void setFwVersion_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FW_VERSION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FW_VERSION);
        }
    }

    public boolean getFwVersion_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FW_VERSION);
    }

    public NestedDiscoveredHostDimms healthStatus(String healthStatus) {

        this.healthStatus = healthStatus;
        return this;
    }

    /**
     * Get healthStatus
     *
     * @return healthStatus
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getHealthStatus() {
        return healthStatus;
    }

    public void setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
    }

    public NestedDiscoveredHostDimms healthStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HEALTH_STATUS);
        return this;
    }

    public NestedDiscoveredHostDimms healthStatus_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HEALTH_STATUS);
        return this;
    }

    public void setHealthStatus_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HEALTH_STATUS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HEALTH_STATUS);
        }
    }

    public boolean getHealthStatus_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HEALTH_STATUS);
    }

    public NestedDiscoveredHostDimms socketId(String socketId) {

        this.socketId = socketId;
        return this;
    }

    /**
     * Get socketId
     *
     * @return socketId
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getSocketId() {
        return socketId;
    }

    public void setSocketId(String socketId) {
        this.socketId = socketId;
    }

    public NestedDiscoveredHostDimms socketId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SOCKET_ID);
        return this;
    }

    public NestedDiscoveredHostDimms socketId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SOCKET_ID);
        return this;
    }

    public void setSocketId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SOCKET_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SOCKET_ID);
        }
    }

    public boolean getSocketId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SOCKET_ID);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NestedDiscoveredHostDimms nestedDiscoveredHostDimms = (NestedDiscoveredHostDimms) o;
        return Objects.equals(this.dimmId, nestedDiscoveredHostDimms.dimmId)
                && Objects.equals(this.fwVersion, nestedDiscoveredHostDimms.fwVersion)
                && Objects.equals(this.healthStatus, nestedDiscoveredHostDimms.healthStatus)
                && Objects.equals(this.socketId, nestedDiscoveredHostDimms.socketId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dimmId, fwVersion, healthStatus, socketId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NestedDiscoveredHostDimms {\n");
        sb.append("    dimmId: ").append(toIndentedString(dimmId)).append("\n");
        sb.append("    fwVersion: ").append(toIndentedString(fwVersion)).append("\n");
        sb.append("    healthStatus: ").append(toIndentedString(healthStatus)).append("\n");
        sb.append("    socketId: ").append(toIndentedString(socketId)).append("\n");
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

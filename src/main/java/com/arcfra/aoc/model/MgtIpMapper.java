package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** MgtIpMapper */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class MgtIpMapper extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_IP = "ip";

    @SerializedName(SERIALIZED_NAME_IP)
    private String ip;

    public static final String SERIALIZED_NAME_HOST_ID = "host_id";

    @SerializedName(SERIALIZED_NAME_HOST_ID)
    private String hostId;

    public MgtIpMapper() {}

    public MgtIpMapper ip(String ip) {

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

    public MgtIpMapper ip_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP);
        return this;
    }

    public MgtIpMapper ip_ExplictlyNonNull() {
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

    public MgtIpMapper hostId(String hostId) {

        this.hostId = hostId;
        return this;
    }

    /**
     * Get hostId
     *
     * @return hostId
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getHostId() {
        return hostId;
    }

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    public MgtIpMapper hostId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOST_ID);
        return this;
    }

    public MgtIpMapper hostId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HOST_ID);
        return this;
    }

    public void setHostId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HOST_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HOST_ID);
        }
    }

    public boolean getHostId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HOST_ID);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MgtIpMapper mgtIpMapper = (MgtIpMapper) o;
        return Objects.equals(this.ip, mgtIpMapper.ip)
                && Objects.equals(this.hostId, mgtIpMapper.hostId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ip, hostId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MgtIpMapper {\n");
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
        sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
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

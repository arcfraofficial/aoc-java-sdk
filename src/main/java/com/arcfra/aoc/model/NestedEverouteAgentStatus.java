package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Arrays;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** NestedEverouteAgentStatus */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class NestedEverouteAgentStatus
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_HOST = "host";

    @SerializedName(SERIALIZED_NAME_HOST)
    private NestedHost host;

    public static final String SERIALIZED_NAME_HOST_I_D = "hostID";

    @SerializedName(SERIALIZED_NAME_HOST_I_D)
    private String hostID;

    public static final String SERIALIZED_NAME_IP_ADDR = "ipAddr";

    @SerializedName(SERIALIZED_NAME_IP_ADDR)
    private String ipAddr;

    public static final String SERIALIZED_NAME_IS_HEALTH = "isHealth";

    @SerializedName(SERIALIZED_NAME_IS_HEALTH)
    private Boolean isHealth;

    public static final String SERIALIZED_NAME_MESSAGE = "message";

    @SerializedName(SERIALIZED_NAME_MESSAGE)
    private String message;

    public static final String SERIALIZED_NAME_PHASE = "phase";

    @SerializedName(SERIALIZED_NAME_PHASE)
    private EverouteClusterPhase phase;

    public static final String SERIALIZED_NAME_REASON = "reason";

    @SerializedName(SERIALIZED_NAME_REASON)
    private String reason;

    public NestedEverouteAgentStatus() {}

    public NestedEverouteAgentStatus host(NestedHost host) {

        this.host = host;
        return this;
    }

    /**
     * Get host
     *
     * @return host
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NestedHost getHost() {
        return host;
    }

    public void setHost(NestedHost host) {
        this.host = host;
    }

    public NestedEverouteAgentStatus host_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOST);
        return this;
    }

    public NestedEverouteAgentStatus host_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HOST);
        return this;
    }

    public void setHost_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HOST);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HOST);
        }
    }

    public boolean getHost_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HOST);
    }

    public NestedEverouteAgentStatus hostID(String hostID) {

        this.hostID = hostID;
        return this;
    }

    /**
     * Get hostID
     *
     * @return hostID
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getHostID() {
        return hostID;
    }

    public void setHostID(String hostID) {
        this.hostID = hostID;
    }

    public NestedEverouteAgentStatus hostID_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOST_I_D);
        return this;
    }

    public NestedEverouteAgentStatus hostID_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HOST_I_D);
        return this;
    }

    public void setHostID_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HOST_I_D);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HOST_I_D);
        }
    }

    public boolean getHostID_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HOST_I_D);
    }

    public NestedEverouteAgentStatus ipAddr(String ipAddr) {

        this.ipAddr = ipAddr;
        return this;
    }

    /**
     * Get ipAddr
     *
     * @return ipAddr
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIpAddr() {
        return ipAddr;
    }

    public void setIpAddr(String ipAddr) {
        this.ipAddr = ipAddr;
    }

    public NestedEverouteAgentStatus ipAddr_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_ADDR);
        return this;
    }

    public NestedEverouteAgentStatus ipAddr_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IP_ADDR);
        return this;
    }

    public void setIpAddr_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IP_ADDR);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IP_ADDR);
        }
    }

    public boolean getIpAddr_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IP_ADDR);
    }

    public NestedEverouteAgentStatus isHealth(Boolean isHealth) {

        this.isHealth = isHealth;
        return this;
    }

    /**
     * Get isHealth
     *
     * @return isHealth
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Boolean getIsHealth() {
        return isHealth;
    }

    public void setIsHealth(Boolean isHealth) {
        this.isHealth = isHealth;
    }

    public NestedEverouteAgentStatus isHealth_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IS_HEALTH);
        return this;
    }

    public NestedEverouteAgentStatus isHealth_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IS_HEALTH);
        return this;
    }

    public void setIsHealth_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IS_HEALTH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IS_HEALTH);
        }
    }

    public boolean getIsHealth_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IS_HEALTH);
    }

    public NestedEverouteAgentStatus message(String message) {

        this.message = message;
        return this;
    }

    /**
     * Get message
     *
     * @return message
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public NestedEverouteAgentStatus message_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MESSAGE);
        return this;
    }

    public NestedEverouteAgentStatus message_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MESSAGE);
        return this;
    }

    public void setMessage_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MESSAGE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MESSAGE);
        }
    }

    public boolean getMessage_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MESSAGE);
    }

    public NestedEverouteAgentStatus phase(EverouteClusterPhase phase) {

        this.phase = phase;
        return this;
    }

    /**
     * Get phase
     *
     * @return phase
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public EverouteClusterPhase getPhase() {
        return phase;
    }

    public void setPhase(EverouteClusterPhase phase) {
        this.phase = phase;
    }

    public NestedEverouteAgentStatus phase_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PHASE);
        return this;
    }

    public NestedEverouteAgentStatus phase_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PHASE);
        return this;
    }

    public void setPhase_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PHASE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PHASE);
        }
    }

    public boolean getPhase_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PHASE);
    }

    public NestedEverouteAgentStatus reason(String reason) {

        this.reason = reason;
        return this;
    }

    /**
     * Get reason
     *
     * @return reason
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public NestedEverouteAgentStatus reason_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REASON);
        return this;
    }

    public NestedEverouteAgentStatus reason_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REASON);
        return this;
    }

    public void setReason_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REASON);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REASON);
        }
    }

    public boolean getReason_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REASON);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NestedEverouteAgentStatus nestedEverouteAgentStatus = (NestedEverouteAgentStatus) o;
        return Objects.equals(this.host, nestedEverouteAgentStatus.host)
                && Objects.equals(this.hostID, nestedEverouteAgentStatus.hostID)
                && Objects.equals(this.ipAddr, nestedEverouteAgentStatus.ipAddr)
                && Objects.equals(this.isHealth, nestedEverouteAgentStatus.isHealth)
                && Objects.equals(this.message, nestedEverouteAgentStatus.message)
                && Objects.equals(this.phase, nestedEverouteAgentStatus.phase)
                && Objects.equals(this.reason, nestedEverouteAgentStatus.reason);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null
                        && b != null
                        && a.isPresent()
                        && b.isPresent()
                        && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(host, hostID, ipAddr, isHealth, message, phase, reason);
    }

    private static <T> int hashCodeNullable(JsonNullable<T> a) {
        if (a == null) {
            return 1;
        }
        return a.isPresent() ? Arrays.deepHashCode(new Object[] {a.get()}) : 31;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NestedEverouteAgentStatus {\n");
        sb.append("    host: ").append(toIndentedString(host)).append("\n");
        sb.append("    hostID: ").append(toIndentedString(hostID)).append("\n");
        sb.append("    ipAddr: ").append(toIndentedString(ipAddr)).append("\n");
        sb.append("    isHealth: ").append(toIndentedString(isHealth)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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

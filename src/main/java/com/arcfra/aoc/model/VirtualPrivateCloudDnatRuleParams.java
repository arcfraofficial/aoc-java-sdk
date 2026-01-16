package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** VirtualPrivateCloudDnatRuleParams */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VirtualPrivateCloudDnatRuleParams
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_TARGET_PORT = "target_port";

    @SerializedName(SERIALIZED_NAME_TARGET_PORT)
    private Integer targetPort;

    public static final String SERIALIZED_NAME_PORT = "port";

    @SerializedName(SERIALIZED_NAME_PORT)
    private Integer port;

    public static final String SERIALIZED_NAME_TARGET_IP = "target_ip";

    @SerializedName(SERIALIZED_NAME_TARGET_IP)
    private String targetIp;

    public VirtualPrivateCloudDnatRuleParams() {}

    public VirtualPrivateCloudDnatRuleParams targetPort(Integer targetPort) {

        this.targetPort = targetPort;
        return this;
    }

    /**
     * Get targetPort
     *
     * @return targetPort
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Integer getTargetPort() {
        return targetPort;
    }

    public void setTargetPort(Integer targetPort) {
        this.targetPort = targetPort;
    }

    public VirtualPrivateCloudDnatRuleParams targetPort_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TARGET_PORT);
        return this;
    }

    public VirtualPrivateCloudDnatRuleParams targetPort_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TARGET_PORT);
        return this;
    }

    public void setTargetPort_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TARGET_PORT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TARGET_PORT);
        }
    }

    public boolean getTargetPort_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TARGET_PORT);
    }

    public VirtualPrivateCloudDnatRuleParams port(Integer port) {

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

    public VirtualPrivateCloudDnatRuleParams port_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PORT);
        return this;
    }

    public VirtualPrivateCloudDnatRuleParams port_ExplictlyNonNull() {
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

    public VirtualPrivateCloudDnatRuleParams targetIp(String targetIp) {

        this.targetIp = targetIp;
        return this;
    }

    /**
     * Get targetIp
     *
     * @return targetIp
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getTargetIp() {
        return targetIp;
    }

    public void setTargetIp(String targetIp) {
        this.targetIp = targetIp;
    }

    public VirtualPrivateCloudDnatRuleParams targetIp_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TARGET_IP);
        return this;
    }

    public VirtualPrivateCloudDnatRuleParams targetIp_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TARGET_IP);
        return this;
    }

    public void setTargetIp_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TARGET_IP);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TARGET_IP);
        }
    }

    public boolean getTargetIp_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TARGET_IP);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VirtualPrivateCloudDnatRuleParams virtualPrivateCloudDnatRuleParams =
                (VirtualPrivateCloudDnatRuleParams) o;
        return Objects.equals(this.targetPort, virtualPrivateCloudDnatRuleParams.targetPort)
                && Objects.equals(this.port, virtualPrivateCloudDnatRuleParams.port)
                && Objects.equals(this.targetIp, virtualPrivateCloudDnatRuleParams.targetIp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(targetPort, port, targetIp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VirtualPrivateCloudDnatRuleParams {\n");
        sb.append("    targetPort: ").append(toIndentedString(targetPort)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    targetIp: ").append(toIndentedString(targetIp)).append("\n");
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

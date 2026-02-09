package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** HostBatchCreateIfaceInput */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class HostBatchCreateIfaceInput
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_NETMASK = "netmask";

    @SerializedName(SERIALIZED_NAME_NETMASK)
    private String netmask;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private List<String> name = new ArrayList<String>();

    public static final String SERIALIZED_NAME_IP = "ip";

    @SerializedName(SERIALIZED_NAME_IP)
    private String ip;

    public static final String SERIALIZED_NAME_GATEWAY_IP = "gateway_ip";

    @SerializedName(SERIALIZED_NAME_GATEWAY_IP)
    private String gatewayIp;

    public static final String SERIALIZED_NAME_FUNCTION = "function";

    @SerializedName(SERIALIZED_NAME_FUNCTION)
    private HostBatchCreateIfaceFunction function;

    public HostBatchCreateIfaceInput() {}

    public HostBatchCreateIfaceInput netmask(String netmask) {

        this.netmask = netmask;
        return this;
    }

    /**
     * Get netmask
     *
     * @return netmask
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getNetmask() {
        return netmask;
    }

    public void setNetmask(String netmask) {
        this.netmask = netmask;
    }

    public HostBatchCreateIfaceInput netmask_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NETMASK);
        return this;
    }

    public HostBatchCreateIfaceInput netmask_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NETMASK);
        return this;
    }

    public void setNetmask_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NETMASK);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NETMASK);
        }
    }

    public boolean getNetmask_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NETMASK);
    }

    public HostBatchCreateIfaceInput name(List<String> name) {

        this.name = name;
        return this;
    }

    public HostBatchCreateIfaceInput addNameItem(String nameItem) {
        this.name.add(nameItem);
        return this;
    }

    /**
     * Get name
     *
     * @return name
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public List<String> getName() {
        return name;
    }

    public void setName(List<String> name) {
        this.name = name;
    }

    public HostBatchCreateIfaceInput name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public HostBatchCreateIfaceInput name_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME);
        return this;
    }

    public void setName_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME);
        }
    }

    public boolean getName_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME);
    }

    public HostBatchCreateIfaceInput ip(String ip) {

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

    public HostBatchCreateIfaceInput ip_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP);
        return this;
    }

    public HostBatchCreateIfaceInput ip_ExplictlyNonNull() {
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

    public HostBatchCreateIfaceInput gatewayIp(String gatewayIp) {

        this.gatewayIp = gatewayIp;
        return this;
    }

    /**
     * Get gatewayIp
     *
     * @return gatewayIp
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getGatewayIp() {
        return gatewayIp;
    }

    public void setGatewayIp(String gatewayIp) {
        this.gatewayIp = gatewayIp;
    }

    public HostBatchCreateIfaceInput gatewayIp_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_GATEWAY_IP);
        return this;
    }

    public HostBatchCreateIfaceInput gatewayIp_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_GATEWAY_IP);
        return this;
    }

    public void setGatewayIp_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_GATEWAY_IP);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_GATEWAY_IP);
        }
    }

    public boolean getGatewayIp_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_GATEWAY_IP);
    }

    public HostBatchCreateIfaceInput function(HostBatchCreateIfaceFunction function) {

        this.function = function;
        return this;
    }

    /**
     * Get function
     *
     * @return function
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public HostBatchCreateIfaceFunction getFunction() {
        return function;
    }

    public void setFunction(HostBatchCreateIfaceFunction function) {
        this.function = function;
    }

    public HostBatchCreateIfaceInput function_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FUNCTION);
        return this;
    }

    public HostBatchCreateIfaceInput function_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FUNCTION);
        return this;
    }

    public void setFunction_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FUNCTION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FUNCTION);
        }
    }

    public boolean getFunction_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FUNCTION);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HostBatchCreateIfaceInput hostBatchCreateIfaceInput = (HostBatchCreateIfaceInput) o;
        return Objects.equals(this.netmask, hostBatchCreateIfaceInput.netmask)
                && Objects.equals(this.name, hostBatchCreateIfaceInput.name)
                && Objects.equals(this.ip, hostBatchCreateIfaceInput.ip)
                && Objects.equals(this.gatewayIp, hostBatchCreateIfaceInput.gatewayIp)
                && Objects.equals(this.function, hostBatchCreateIfaceInput.function);
    }

    @Override
    public int hashCode() {
        return Objects.hash(netmask, name, ip, gatewayIp, function);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HostBatchCreateIfaceInput {\n");
        sb.append("    netmask: ").append(toIndentedString(netmask)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
        sb.append("    gatewayIp: ").append(toIndentedString(gatewayIp)).append("\n");
        sb.append("    function: ").append(toIndentedString(function)).append("\n");
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

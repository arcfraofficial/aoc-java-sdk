package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Arrays;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** NestedReplicationNetworkConfigure */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class NestedReplicationNetworkConfigure
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_GATEWAY = "gateway";

    @SerializedName(SERIALIZED_NAME_GATEWAY)
    private String gateway;

    public static final String SERIALIZED_NAME_IP = "ip";

    @SerializedName(SERIALIZED_NAME_IP)
    private String ip;

    public static final String SERIALIZED_NAME_SUBNET_MASK = "subnet_mask";

    @SerializedName(SERIALIZED_NAME_SUBNET_MASK)
    private String subnetMask;

    public NestedReplicationNetworkConfigure() {}

    public NestedReplicationNetworkConfigure gateway(String gateway) {

        this.gateway = gateway;
        return this;
    }

    /**
     * Get gateway
     *
     * @return gateway
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getGateway() {
        return gateway;
    }

    public void setGateway(String gateway) {
        this.gateway = gateway;
    }

    public NestedReplicationNetworkConfigure gateway_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_GATEWAY);
        return this;
    }

    public NestedReplicationNetworkConfigure gateway_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_GATEWAY);
        return this;
    }

    public void setGateway_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_GATEWAY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_GATEWAY);
        }
    }

    public boolean getGateway_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_GATEWAY);
    }

    public NestedReplicationNetworkConfigure ip(String ip) {

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

    public NestedReplicationNetworkConfigure ip_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP);
        return this;
    }

    public NestedReplicationNetworkConfigure ip_ExplictlyNonNull() {
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

    public NestedReplicationNetworkConfigure subnetMask(String subnetMask) {

        this.subnetMask = subnetMask;
        return this;
    }

    /**
     * Get subnetMask
     *
     * @return subnetMask
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSubnetMask() {
        return subnetMask;
    }

    public void setSubnetMask(String subnetMask) {
        this.subnetMask = subnetMask;
    }

    public NestedReplicationNetworkConfigure subnetMask_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SUBNET_MASK);
        return this;
    }

    public NestedReplicationNetworkConfigure subnetMask_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SUBNET_MASK);
        return this;
    }

    public void setSubnetMask_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SUBNET_MASK);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SUBNET_MASK);
        }
    }

    public boolean getSubnetMask_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SUBNET_MASK);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NestedReplicationNetworkConfigure nestedReplicationNetworkConfigure =
                (NestedReplicationNetworkConfigure) o;
        return Objects.equals(this.gateway, nestedReplicationNetworkConfigure.gateway)
                && Objects.equals(this.ip, nestedReplicationNetworkConfigure.ip)
                && Objects.equals(this.subnetMask, nestedReplicationNetworkConfigure.subnetMask);
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
        return Objects.hash(gateway, ip, subnetMask);
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
        sb.append("class NestedReplicationNetworkConfigure {\n");
        sb.append("    gateway: ").append(toIndentedString(gateway)).append("\n");
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
        sb.append("    subnetMask: ").append(toIndentedString(subnetMask)).append("\n");
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

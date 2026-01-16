package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** CloudInitNetWorkRoute */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class CloudInitNetWorkRoute
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_NETWORK = "network";

    @SerializedName(SERIALIZED_NAME_NETWORK)
    private String network;

    public static final String SERIALIZED_NAME_NETMASK = "netmask";

    @SerializedName(SERIALIZED_NAME_NETMASK)
    private String netmask;

    public static final String SERIALIZED_NAME_GATEWAY = "gateway";

    @SerializedName(SERIALIZED_NAME_GATEWAY)
    private String gateway;

    public CloudInitNetWorkRoute() {}

    public CloudInitNetWorkRoute network(String network) {

        this.network = network;
        return this;
    }

    /**
     * Get network
     *
     * @return network
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

    public CloudInitNetWorkRoute network_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NETWORK);
        return this;
    }

    public CloudInitNetWorkRoute network_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NETWORK);
        return this;
    }

    public void setNetwork_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NETWORK);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NETWORK);
        }
    }

    public boolean getNetwork_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NETWORK);
    }

    public CloudInitNetWorkRoute netmask(String netmask) {

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

    public CloudInitNetWorkRoute netmask_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NETMASK);
        return this;
    }

    public CloudInitNetWorkRoute netmask_ExplictlyNonNull() {
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

    public CloudInitNetWorkRoute gateway(String gateway) {

        this.gateway = gateway;
        return this;
    }

    /**
     * Get gateway
     *
     * @return gateway
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getGateway() {
        return gateway;
    }

    public void setGateway(String gateway) {
        this.gateway = gateway;
    }

    public CloudInitNetWorkRoute gateway_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_GATEWAY);
        return this;
    }

    public CloudInitNetWorkRoute gateway_ExplictlyNonNull() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CloudInitNetWorkRoute cloudInitNetWorkRoute = (CloudInitNetWorkRoute) o;
        return Objects.equals(this.network, cloudInitNetWorkRoute.network)
                && Objects.equals(this.netmask, cloudInitNetWorkRoute.netmask)
                && Objects.equals(this.gateway, cloudInitNetWorkRoute.gateway);
    }

    @Override
    public int hashCode() {
        return Objects.hash(network, netmask, gateway);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CloudInitNetWorkRoute {\n");
        sb.append("    network: ").append(toIndentedString(network)).append("\n");
        sb.append("    netmask: ").append(toIndentedString(netmask)).append("\n");
        sb.append("    gateway: ").append(toIndentedString(gateway)).append("\n");
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

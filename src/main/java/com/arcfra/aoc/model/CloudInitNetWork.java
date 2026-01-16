package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** CloudInitNetWork */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class CloudInitNetWork extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_ROUTES = "routes";

    @SerializedName(SERIALIZED_NAME_ROUTES)
    private List<CloudInitNetWorkRoute> routes = null;

    public static final String SERIALIZED_NAME_TYPE = "type";

    @SerializedName(SERIALIZED_NAME_TYPE)
    private CloudInitNetworkTypeEnum type;

    public static final String SERIALIZED_NAME_NIC_INDEX = "nic_index";

    @SerializedName(SERIALIZED_NAME_NIC_INDEX)
    private Integer nicIndex;

    public static final String SERIALIZED_NAME_NETMASK = "netmask";

    @SerializedName(SERIALIZED_NAME_NETMASK)
    private String netmask;

    public static final String SERIALIZED_NAME_IP_ADDRESS = "ip_address";

    @SerializedName(SERIALIZED_NAME_IP_ADDRESS)
    private String ipAddress;

    public CloudInitNetWork() {}

    public CloudInitNetWork routes(List<CloudInitNetWorkRoute> routes) {

        this.routes = routes;
        return this;
    }

    public CloudInitNetWork addRoutesItem(CloudInitNetWorkRoute routesItem) {
        if (this.routes == null) {
            this.routes = new ArrayList<CloudInitNetWorkRoute>();
        }
        this.routes.add(routesItem);
        return this;
    }

    /**
     * Get routes
     *
     * @return routes
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<CloudInitNetWorkRoute> getRoutes() {
        return routes;
    }

    public void setRoutes(List<CloudInitNetWorkRoute> routes) {
        this.routes = routes;
    }

    public CloudInitNetWork routes_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ROUTES);
        return this;
    }

    public CloudInitNetWork routes_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ROUTES);
        return this;
    }

    public void setRoutes_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ROUTES);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ROUTES);
        }
    }

    public boolean getRoutes_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ROUTES);
    }

    public CloudInitNetWork type(CloudInitNetworkTypeEnum type) {

        this.type = type;
        return this;
    }

    /**
     * Get type
     *
     * @return type
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public CloudInitNetworkTypeEnum getType() {
        return type;
    }

    public void setType(CloudInitNetworkTypeEnum type) {
        this.type = type;
    }

    public CloudInitNetWork type_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE);
        return this;
    }

    public CloudInitNetWork type_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TYPE);
        return this;
    }

    public void setType_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TYPE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TYPE);
        }
    }

    public boolean getType_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TYPE);
    }

    public CloudInitNetWork nicIndex(Integer nicIndex) {

        this.nicIndex = nicIndex;
        return this;
    }

    /**
     * Get nicIndex
     *
     * @return nicIndex
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Integer getNicIndex() {
        return nicIndex;
    }

    public void setNicIndex(Integer nicIndex) {
        this.nicIndex = nicIndex;
    }

    public CloudInitNetWork nicIndex_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NIC_INDEX);
        return this;
    }

    public CloudInitNetWork nicIndex_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NIC_INDEX);
        return this;
    }

    public void setNicIndex_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NIC_INDEX);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NIC_INDEX);
        }
    }

    public boolean getNicIndex_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NIC_INDEX);
    }

    public CloudInitNetWork netmask(String netmask) {

        this.netmask = netmask;
        return this;
    }

    /**
     * Get netmask
     *
     * @return netmask
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNetmask() {
        return netmask;
    }

    public void setNetmask(String netmask) {
        this.netmask = netmask;
    }

    public CloudInitNetWork netmask_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NETMASK);
        return this;
    }

    public CloudInitNetWork netmask_ExplictlyNonNull() {
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

    public CloudInitNetWork ipAddress(String ipAddress) {

        this.ipAddress = ipAddress;
        return this;
    }

    /**
     * Get ipAddress
     *
     * @return ipAddress
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public CloudInitNetWork ipAddress_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_ADDRESS);
        return this;
    }

    public CloudInitNetWork ipAddress_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IP_ADDRESS);
        return this;
    }

    public void setIpAddress_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IP_ADDRESS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IP_ADDRESS);
        }
    }

    public boolean getIpAddress_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IP_ADDRESS);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CloudInitNetWork cloudInitNetWork = (CloudInitNetWork) o;
        return Objects.equals(this.routes, cloudInitNetWork.routes)
                && Objects.equals(this.type, cloudInitNetWork.type)
                && Objects.equals(this.nicIndex, cloudInitNetWork.nicIndex)
                && Objects.equals(this.netmask, cloudInitNetWork.netmask)
                && Objects.equals(this.ipAddress, cloudInitNetWork.ipAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(routes, type, nicIndex, netmask, ipAddress);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CloudInitNetWork {\n");
        sb.append("    routes: ").append(toIndentedString(routes)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    nicIndex: ").append(toIndentedString(nicIndex)).append("\n");
        sb.append("    netmask: ").append(toIndentedString(netmask)).append("\n");
        sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
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

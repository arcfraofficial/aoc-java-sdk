package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** NestedEverouteControllerInstance */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class NestedEverouteControllerInstance
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_IP_ADDR = "ipAddr";

    @SerializedName(SERIALIZED_NAME_IP_ADDR)
    private String ipAddr;

    public static final String SERIALIZED_NAME_VLAN = "vlan";

    @SerializedName(SERIALIZED_NAME_VLAN)
    private String vlan;

    public NestedEverouteControllerInstance() {}

    public NestedEverouteControllerInstance ipAddr(String ipAddr) {

        this.ipAddr = ipAddr;
        return this;
    }

    /**
     * Get ipAddr
     *
     * @return ipAddr
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getIpAddr() {
        return ipAddr;
    }

    public void setIpAddr(String ipAddr) {
        this.ipAddr = ipAddr;
    }

    public NestedEverouteControllerInstance ipAddr_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_ADDR);
        return this;
    }

    public NestedEverouteControllerInstance ipAddr_ExplictlyNonNull() {
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

    public NestedEverouteControllerInstance vlan(String vlan) {

        this.vlan = vlan;
        return this;
    }

    /**
     * Get vlan
     *
     * @return vlan
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getVlan() {
        return vlan;
    }

    public void setVlan(String vlan) {
        this.vlan = vlan;
    }

    public NestedEverouteControllerInstance vlan_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VLAN);
        return this;
    }

    public NestedEverouteControllerInstance vlan_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VLAN);
        return this;
    }

    public void setVlan_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VLAN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VLAN);
        }
    }

    public boolean getVlan_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VLAN);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NestedEverouteControllerInstance nestedEverouteControllerInstance =
                (NestedEverouteControllerInstance) o;
        return Objects.equals(this.ipAddr, nestedEverouteControllerInstance.ipAddr)
                && Objects.equals(this.vlan, nestedEverouteControllerInstance.vlan);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ipAddr, vlan);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NestedEverouteControllerInstance {\n");
        sb.append("    ipAddr: ").append(toIndentedString(ipAddr)).append("\n");
        sb.append("    vlan: ").append(toIndentedString(vlan)).append("\n");
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

package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Arrays;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** NestedTemplateNic */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class NestedTemplateNic extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_ENABLED = "enabled";

    @SerializedName(SERIALIZED_NAME_ENABLED)
    private Boolean enabled;

    public static final String SERIALIZED_NAME_INDEX = "index";

    @SerializedName(SERIALIZED_NAME_INDEX)
    private Integer index;

    public static final String SERIALIZED_NAME_IP_ADDRESS = "ip_address";

    @SerializedName(SERIALIZED_NAME_IP_ADDRESS)
    private String ipAddress;

    public static final String SERIALIZED_NAME_MAC_ADDRESS = "mac_address";

    @SerializedName(SERIALIZED_NAME_MAC_ADDRESS)
    private String macAddress;

    public static final String SERIALIZED_NAME_MIRROR = "mirror";

    @SerializedName(SERIALIZED_NAME_MIRROR)
    private Boolean mirror;

    public static final String SERIALIZED_NAME_MODEL = "model";

    @SerializedName(SERIALIZED_NAME_MODEL)
    private VmNicModel model;

    public static final String SERIALIZED_NAME_TYPE = "type";

    @SerializedName(SERIALIZED_NAME_TYPE)
    private VmNicType type;

    public static final String SERIALIZED_NAME_VLAN = "vlan";

    @SerializedName(SERIALIZED_NAME_VLAN)
    private NestedFrozenVlan vlan;

    public static final String SERIALIZED_NAME_VPC_NIC = "vpc_nic";

    @SerializedName(SERIALIZED_NAME_VPC_NIC)
    private NestedTemplateVpcNic vpcNic;

    public NestedTemplateNic() {}

    public NestedTemplateNic enabled(Boolean enabled) {

        this.enabled = enabled;
        return this;
    }

    /**
     * Get enabled
     *
     * @return enabled
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public NestedTemplateNic enabled_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENABLED);
        return this;
    }

    public NestedTemplateNic enabled_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ENABLED);
        return this;
    }

    public void setEnabled_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ENABLED);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ENABLED);
        }
    }

    public boolean getEnabled_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ENABLED);
    }

    public NestedTemplateNic index(Integer index) {

        this.index = index;
        return this;
    }

    /**
     * Get index
     *
     * @return index
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public NestedTemplateNic index_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INDEX);
        return this;
    }

    public NestedTemplateNic index_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INDEX);
        return this;
    }

    public void setIndex_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INDEX);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INDEX);
        }
    }

    public boolean getIndex_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INDEX);
    }

    public NestedTemplateNic ipAddress(String ipAddress) {

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

    public NestedTemplateNic ipAddress_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IP_ADDRESS);
        return this;
    }

    public NestedTemplateNic ipAddress_ExplictlyNonNull() {
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

    public NestedTemplateNic macAddress(String macAddress) {

        this.macAddress = macAddress;
        return this;
    }

    /**
     * Get macAddress
     *
     * @return macAddress
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getMacAddress() {
        return macAddress;
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    public NestedTemplateNic macAddress_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAC_ADDRESS);
        return this;
    }

    public NestedTemplateNic macAddress_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAC_ADDRESS);
        return this;
    }

    public void setMacAddress_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAC_ADDRESS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAC_ADDRESS);
        }
    }

    public boolean getMacAddress_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAC_ADDRESS);
    }

    public NestedTemplateNic mirror(Boolean mirror) {

        this.mirror = mirror;
        return this;
    }

    /**
     * Get mirror
     *
     * @return mirror
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getMirror() {
        return mirror;
    }

    public void setMirror(Boolean mirror) {
        this.mirror = mirror;
    }

    public NestedTemplateNic mirror_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MIRROR);
        return this;
    }

    public NestedTemplateNic mirror_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MIRROR);
        return this;
    }

    public void setMirror_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MIRROR);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MIRROR);
        }
    }

    public boolean getMirror_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MIRROR);
    }

    public NestedTemplateNic model(VmNicModel model) {

        this.model = model;
        return this;
    }

    /**
     * Get model
     *
     * @return model
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmNicModel getModel() {
        return model;
    }

    public void setModel(VmNicModel model) {
        this.model = model;
    }

    public NestedTemplateNic model_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MODEL);
        return this;
    }

    public NestedTemplateNic model_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MODEL);
        return this;
    }

    public void setModel_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MODEL);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MODEL);
        }
    }

    public boolean getModel_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MODEL);
    }

    public NestedTemplateNic type(VmNicType type) {

        this.type = type;
        return this;
    }

    /**
     * Get type
     *
     * @return type
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmNicType getType() {
        return type;
    }

    public void setType(VmNicType type) {
        this.type = type;
    }

    public NestedTemplateNic type_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE);
        return this;
    }

    public NestedTemplateNic type_ExplictlyNonNull() {
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

    public NestedTemplateNic vlan(NestedFrozenVlan vlan) {

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
    public NestedFrozenVlan getVlan() {
        return vlan;
    }

    public void setVlan(NestedFrozenVlan vlan) {
        this.vlan = vlan;
    }

    public NestedTemplateNic vlan_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VLAN);
        return this;
    }

    public NestedTemplateNic vlan_ExplictlyNonNull() {
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

    public NestedTemplateNic vpcNic(NestedTemplateVpcNic vpcNic) {

        this.vpcNic = vpcNic;
        return this;
    }

    /**
     * Get vpcNic
     *
     * @return vpcNic
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NestedTemplateVpcNic getVpcNic() {
        return vpcNic;
    }

    public void setVpcNic(NestedTemplateVpcNic vpcNic) {
        this.vpcNic = vpcNic;
    }

    public NestedTemplateNic vpcNic_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VPC_NIC);
        return this;
    }

    public NestedTemplateNic vpcNic_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VPC_NIC);
        return this;
    }

    public void setVpcNic_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VPC_NIC);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VPC_NIC);
        }
    }

    public boolean getVpcNic_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VPC_NIC);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NestedTemplateNic nestedTemplateNic = (NestedTemplateNic) o;
        return Objects.equals(this.enabled, nestedTemplateNic.enabled)
                && Objects.equals(this.index, nestedTemplateNic.index)
                && Objects.equals(this.ipAddress, nestedTemplateNic.ipAddress)
                && Objects.equals(this.macAddress, nestedTemplateNic.macAddress)
                && Objects.equals(this.mirror, nestedTemplateNic.mirror)
                && Objects.equals(this.model, nestedTemplateNic.model)
                && Objects.equals(this.type, nestedTemplateNic.type)
                && Objects.equals(this.vlan, nestedTemplateNic.vlan)
                && Objects.equals(this.vpcNic, nestedTemplateNic.vpcNic);
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
        return Objects.hash(
                enabled, index, ipAddress, macAddress, mirror, model, type, vlan, vpcNic);
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
        sb.append("class NestedTemplateNic {\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    index: ").append(toIndentedString(index)).append("\n");
        sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
        sb.append("    macAddress: ").append(toIndentedString(macAddress)).append("\n");
        sb.append("    mirror: ").append(toIndentedString(mirror)).append("\n");
        sb.append("    model: ").append(toIndentedString(model)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    vlan: ").append(toIndentedString(vlan)).append("\n");
        sb.append("    vpcNic: ").append(toIndentedString(vpcNic)).append("\n");
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

package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** VmUpdateNicAdvanceInfoParamsData */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VmUpdateNicAdvanceInfoParamsData
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_MIRROR = "mirror";

    @SerializedName(SERIALIZED_NAME_MIRROR)
    private Boolean mirror;

    public static final String SERIALIZED_NAME_ENABLED = "enabled";

    @SerializedName(SERIALIZED_NAME_ENABLED)
    private Boolean enabled;

    public static final String SERIALIZED_NAME_MAC_ADDRESS = "mac_address";

    @SerializedName(SERIALIZED_NAME_MAC_ADDRESS)
    private String macAddress;

    public static final String SERIALIZED_NAME_NIC_ID = "nic_id";

    @SerializedName(SERIALIZED_NAME_NIC_ID)
    private String nicId;

    public static final String SERIALIZED_NAME_CONNECT_VLAN_ID = "connect_vlan_id";

    @SerializedName(SERIALIZED_NAME_CONNECT_VLAN_ID)
    private String connectVlanId;

    public VmUpdateNicAdvanceInfoParamsData() {}

    public VmUpdateNicAdvanceInfoParamsData mirror(Boolean mirror) {

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

    public VmUpdateNicAdvanceInfoParamsData mirror_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MIRROR);
        return this;
    }

    public VmUpdateNicAdvanceInfoParamsData mirror_ExplictlyNonNull() {
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

    public VmUpdateNicAdvanceInfoParamsData enabled(Boolean enabled) {

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

    public VmUpdateNicAdvanceInfoParamsData enabled_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENABLED);
        return this;
    }

    public VmUpdateNicAdvanceInfoParamsData enabled_ExplictlyNonNull() {
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

    public VmUpdateNicAdvanceInfoParamsData macAddress(String macAddress) {

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

    public VmUpdateNicAdvanceInfoParamsData macAddress_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAC_ADDRESS);
        return this;
    }

    public VmUpdateNicAdvanceInfoParamsData macAddress_ExplictlyNonNull() {
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

    public VmUpdateNicAdvanceInfoParamsData nicId(String nicId) {

        this.nicId = nicId;
        return this;
    }

    /**
     * Get nicId
     *
     * @return nicId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNicId() {
        return nicId;
    }

    public void setNicId(String nicId) {
        this.nicId = nicId;
    }

    public VmUpdateNicAdvanceInfoParamsData nicId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NIC_ID);
        return this;
    }

    public VmUpdateNicAdvanceInfoParamsData nicId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NIC_ID);
        return this;
    }

    public void setNicId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NIC_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NIC_ID);
        }
    }

    public boolean getNicId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NIC_ID);
    }

    public VmUpdateNicAdvanceInfoParamsData connectVlanId(String connectVlanId) {

        this.connectVlanId = connectVlanId;
        return this;
    }

    /**
     * Get connectVlanId
     *
     * @return connectVlanId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getConnectVlanId() {
        return connectVlanId;
    }

    public void setConnectVlanId(String connectVlanId) {
        this.connectVlanId = connectVlanId;
    }

    public VmUpdateNicAdvanceInfoParamsData connectVlanId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CONNECT_VLAN_ID);
        return this;
    }

    public VmUpdateNicAdvanceInfoParamsData connectVlanId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CONNECT_VLAN_ID);
        return this;
    }

    public void setConnectVlanId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CONNECT_VLAN_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CONNECT_VLAN_ID);
        }
    }

    public boolean getConnectVlanId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CONNECT_VLAN_ID);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VmUpdateNicAdvanceInfoParamsData vmUpdateNicAdvanceInfoParamsData =
                (VmUpdateNicAdvanceInfoParamsData) o;
        return Objects.equals(this.mirror, vmUpdateNicAdvanceInfoParamsData.mirror)
                && Objects.equals(this.enabled, vmUpdateNicAdvanceInfoParamsData.enabled)
                && Objects.equals(this.macAddress, vmUpdateNicAdvanceInfoParamsData.macAddress)
                && Objects.equals(this.nicId, vmUpdateNicAdvanceInfoParamsData.nicId)
                && Objects.equals(
                        this.connectVlanId, vmUpdateNicAdvanceInfoParamsData.connectVlanId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mirror, enabled, macAddress, nicId, connectVlanId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VmUpdateNicAdvanceInfoParamsData {\n");
        sb.append("    mirror: ").append(toIndentedString(mirror)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    macAddress: ").append(toIndentedString(macAddress)).append("\n");
        sb.append("    nicId: ").append(toIndentedString(nicId)).append("\n");
        sb.append("    connectVlanId: ").append(toIndentedString(connectVlanId)).append("\n");
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

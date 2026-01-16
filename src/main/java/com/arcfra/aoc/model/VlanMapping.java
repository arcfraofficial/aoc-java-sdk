package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** VlanMapping */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VlanMapping extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_SRC_VLAN_LOCAL_ID = "src_vlan_local_id";

    @SerializedName(SERIALIZED_NAME_SRC_VLAN_LOCAL_ID)
    private String srcVlanLocalId;

    public static final String SERIALIZED_NAME_DEST_VLAN_LOCAL_ID = "dest_vlan_local_id";

    @SerializedName(SERIALIZED_NAME_DEST_VLAN_LOCAL_ID)
    private String destVlanLocalId;

    public VlanMapping() {}

    public VlanMapping srcVlanLocalId(String srcVlanLocalId) {

        this.srcVlanLocalId = srcVlanLocalId;
        return this;
    }

    /**
     * Get srcVlanLocalId
     *
     * @return srcVlanLocalId
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getSrcVlanLocalId() {
        return srcVlanLocalId;
    }

    public void setSrcVlanLocalId(String srcVlanLocalId) {
        this.srcVlanLocalId = srcVlanLocalId;
    }

    public VlanMapping srcVlanLocalId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SRC_VLAN_LOCAL_ID);
        return this;
    }

    public VlanMapping srcVlanLocalId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SRC_VLAN_LOCAL_ID);
        return this;
    }

    public void setSrcVlanLocalId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SRC_VLAN_LOCAL_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SRC_VLAN_LOCAL_ID);
        }
    }

    public boolean getSrcVlanLocalId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SRC_VLAN_LOCAL_ID);
    }

    public VlanMapping destVlanLocalId(String destVlanLocalId) {

        this.destVlanLocalId = destVlanLocalId;
        return this;
    }

    /**
     * Get destVlanLocalId
     *
     * @return destVlanLocalId
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getDestVlanLocalId() {
        return destVlanLocalId;
    }

    public void setDestVlanLocalId(String destVlanLocalId) {
        this.destVlanLocalId = destVlanLocalId;
    }

    public VlanMapping destVlanLocalId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEST_VLAN_LOCAL_ID);
        return this;
    }

    public VlanMapping destVlanLocalId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEST_VLAN_LOCAL_ID);
        return this;
    }

    public void setDestVlanLocalId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEST_VLAN_LOCAL_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEST_VLAN_LOCAL_ID);
        }
    }

    public boolean getDestVlanLocalId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEST_VLAN_LOCAL_ID);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VlanMapping vlanMapping = (VlanMapping) o;
        return Objects.equals(this.srcVlanLocalId, vlanMapping.srcVlanLocalId)
                && Objects.equals(this.destVlanLocalId, vlanMapping.destVlanLocalId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(srcVlanLocalId, destVlanLocalId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VlanMapping {\n");
        sb.append("    srcVlanLocalId: ").append(toIndentedString(srcVlanLocalId)).append("\n");
        sb.append("    destVlanLocalId: ").append(toIndentedString(destVlanLocalId)).append("\n");
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

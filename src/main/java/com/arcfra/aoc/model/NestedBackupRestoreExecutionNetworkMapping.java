package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** NestedBackupRestoreExecutionNetworkMapping */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class NestedBackupRestoreExecutionNetworkMapping
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_DST_VLAN_ID = "dst_vlan_id";

    @SerializedName(SERIALIZED_NAME_DST_VLAN_ID)
    private String dstVlanId;

    public static final String SERIALIZED_NAME_SRC_VLAN_ID = "src_vlan_id";

    @SerializedName(SERIALIZED_NAME_SRC_VLAN_ID)
    private String srcVlanId;

    public NestedBackupRestoreExecutionNetworkMapping() {}

    public NestedBackupRestoreExecutionNetworkMapping dstVlanId(String dstVlanId) {

        this.dstVlanId = dstVlanId;
        return this;
    }

    /**
     * Get dstVlanId
     *
     * @return dstVlanId
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getDstVlanId() {
        return dstVlanId;
    }

    public void setDstVlanId(String dstVlanId) {
        this.dstVlanId = dstVlanId;
    }

    public NestedBackupRestoreExecutionNetworkMapping dstVlanId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DST_VLAN_ID);
        return this;
    }

    public NestedBackupRestoreExecutionNetworkMapping dstVlanId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DST_VLAN_ID);
        return this;
    }

    public void setDstVlanId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DST_VLAN_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DST_VLAN_ID);
        }
    }

    public boolean getDstVlanId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DST_VLAN_ID);
    }

    public NestedBackupRestoreExecutionNetworkMapping srcVlanId(String srcVlanId) {

        this.srcVlanId = srcVlanId;
        return this;
    }

    /**
     * Get srcVlanId
     *
     * @return srcVlanId
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getSrcVlanId() {
        return srcVlanId;
    }

    public void setSrcVlanId(String srcVlanId) {
        this.srcVlanId = srcVlanId;
    }

    public NestedBackupRestoreExecutionNetworkMapping srcVlanId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SRC_VLAN_ID);
        return this;
    }

    public NestedBackupRestoreExecutionNetworkMapping srcVlanId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SRC_VLAN_ID);
        return this;
    }

    public void setSrcVlanId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SRC_VLAN_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SRC_VLAN_ID);
        }
    }

    public boolean getSrcVlanId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SRC_VLAN_ID);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NestedBackupRestoreExecutionNetworkMapping nestedBackupRestoreExecutionNetworkMapping =
                (NestedBackupRestoreExecutionNetworkMapping) o;
        return Objects.equals(this.dstVlanId, nestedBackupRestoreExecutionNetworkMapping.dstVlanId)
                && Objects.equals(
                        this.srcVlanId, nestedBackupRestoreExecutionNetworkMapping.srcVlanId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dstVlanId, srcVlanId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NestedBackupRestoreExecutionNetworkMapping {\n");
        sb.append("    dstVlanId: ").append(toIndentedString(dstVlanId)).append("\n");
        sb.append("    srcVlanId: ").append(toIndentedString(srcVlanId)).append("\n");
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

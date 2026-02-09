package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** NestedReplicationNetworkInformation */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class NestedReplicationNetworkInformation
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_CLUSTER_LOCAL_ID = "cluster_local_id";

    @SerializedName(SERIALIZED_NAME_CLUSTER_LOCAL_ID)
    private String clusterLocalId;

    public static final String SERIALIZED_NAME_CLUSTER_NAME = "cluster_name";

    @SerializedName(SERIALIZED_NAME_CLUSTER_NAME)
    private String clusterName;

    public static final String SERIALIZED_NAME_NETWORK_IDS = "network_ids";

    @SerializedName(SERIALIZED_NAME_NETWORK_IDS)
    private List<String> networkIds = null;

    public static final String SERIALIZED_NAME_VDS_NAME = "vds_name";

    @SerializedName(SERIALIZED_NAME_VDS_NAME)
    private String vdsName;

    public static final String SERIALIZED_NAME_VLAN_ID = "vlan_id";

    @SerializedName(SERIALIZED_NAME_VLAN_ID)
    private Integer vlanId;

    public static final String SERIALIZED_NAME_VLAN_LOCAL_ID = "vlan_local_id";

    @SerializedName(SERIALIZED_NAME_VLAN_LOCAL_ID)
    private String vlanLocalId;

    public static final String SERIALIZED_NAME_VLAN_MODE_TYPE = "vlan_mode_type";

    @SerializedName(SERIALIZED_NAME_VLAN_MODE_TYPE)
    private VlanModeType vlanModeType;

    public static final String SERIALIZED_NAME_VLAN_NAME = "vlan_name";

    @SerializedName(SERIALIZED_NAME_VLAN_NAME)
    private String vlanName;

    public NestedReplicationNetworkInformation() {}

    public NestedReplicationNetworkInformation clusterLocalId(String clusterLocalId) {

        this.clusterLocalId = clusterLocalId;
        return this;
    }

    /**
     * Get clusterLocalId
     *
     * @return clusterLocalId
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getClusterLocalId() {
        return clusterLocalId;
    }

    public void setClusterLocalId(String clusterLocalId) {
        this.clusterLocalId = clusterLocalId;
    }

    public NestedReplicationNetworkInformation clusterLocalId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID);
        return this;
    }

    public NestedReplicationNetworkInformation clusterLocalId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_LOCAL_ID);
        return this;
    }

    public void setClusterLocalId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_LOCAL_ID);
        }
    }

    public boolean getClusterLocalId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLUSTER_LOCAL_ID);
    }

    public NestedReplicationNetworkInformation clusterName(String clusterName) {

        this.clusterName = clusterName;
        return this;
    }

    /**
     * Get clusterName
     *
     * @return clusterName
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    public NestedReplicationNetworkInformation clusterName_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER_NAME);
        return this;
    }

    public NestedReplicationNetworkInformation clusterName_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_NAME);
        return this;
    }

    public void setClusterName_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLUSTER_NAME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_NAME);
        }
    }

    public boolean getClusterName_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLUSTER_NAME);
    }

    public NestedReplicationNetworkInformation networkIds(List<String> networkIds) {

        this.networkIds = networkIds;
        return this;
    }

    public NestedReplicationNetworkInformation addNetworkIdsItem(String networkIdsItem) {
        if (this.networkIds == null) {
            this.networkIds = new ArrayList<String>();
        }
        this.networkIds.add(networkIdsItem);
        return this;
    }

    /**
     * Get networkIds
     *
     * @return networkIds
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getNetworkIds() {
        return networkIds;
    }

    public void setNetworkIds(List<String> networkIds) {
        this.networkIds = networkIds;
    }

    public NestedReplicationNetworkInformation networkIds_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NETWORK_IDS);
        return this;
    }

    public NestedReplicationNetworkInformation networkIds_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NETWORK_IDS);
        return this;
    }

    public void setNetworkIds_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NETWORK_IDS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NETWORK_IDS);
        }
    }

    public boolean getNetworkIds_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NETWORK_IDS);
    }

    public NestedReplicationNetworkInformation vdsName(String vdsName) {

        this.vdsName = vdsName;
        return this;
    }

    /**
     * Get vdsName
     *
     * @return vdsName
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVdsName() {
        return vdsName;
    }

    public void setVdsName(String vdsName) {
        this.vdsName = vdsName;
    }

    public NestedReplicationNetworkInformation vdsName_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VDS_NAME);
        return this;
    }

    public NestedReplicationNetworkInformation vdsName_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VDS_NAME);
        return this;
    }

    public void setVdsName_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VDS_NAME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VDS_NAME);
        }
    }

    public boolean getVdsName_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VDS_NAME);
    }

    public NestedReplicationNetworkInformation vlanId(Integer vlanId) {

        this.vlanId = vlanId;
        return this;
    }

    /**
     * Get vlanId
     *
     * @return vlanId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getVlanId() {
        return vlanId;
    }

    public void setVlanId(Integer vlanId) {
        this.vlanId = vlanId;
    }

    public NestedReplicationNetworkInformation vlanId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VLAN_ID);
        return this;
    }

    public NestedReplicationNetworkInformation vlanId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VLAN_ID);
        return this;
    }

    public void setVlanId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VLAN_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VLAN_ID);
        }
    }

    public boolean getVlanId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VLAN_ID);
    }

    public NestedReplicationNetworkInformation vlanLocalId(String vlanLocalId) {

        this.vlanLocalId = vlanLocalId;
        return this;
    }

    /**
     * Get vlanLocalId
     *
     * @return vlanLocalId
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getVlanLocalId() {
        return vlanLocalId;
    }

    public void setVlanLocalId(String vlanLocalId) {
        this.vlanLocalId = vlanLocalId;
    }

    public NestedReplicationNetworkInformation vlanLocalId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VLAN_LOCAL_ID);
        return this;
    }

    public NestedReplicationNetworkInformation vlanLocalId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VLAN_LOCAL_ID);
        return this;
    }

    public void setVlanLocalId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VLAN_LOCAL_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VLAN_LOCAL_ID);
        }
    }

    public boolean getVlanLocalId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VLAN_LOCAL_ID);
    }

    public NestedReplicationNetworkInformation vlanModeType(VlanModeType vlanModeType) {

        this.vlanModeType = vlanModeType;
        return this;
    }

    /**
     * Get vlanModeType
     *
     * @return vlanModeType
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public VlanModeType getVlanModeType() {
        return vlanModeType;
    }

    public void setVlanModeType(VlanModeType vlanModeType) {
        this.vlanModeType = vlanModeType;
    }

    public NestedReplicationNetworkInformation vlanModeType_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VLAN_MODE_TYPE);
        return this;
    }

    public NestedReplicationNetworkInformation vlanModeType_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VLAN_MODE_TYPE);
        return this;
    }

    public void setVlanModeType_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VLAN_MODE_TYPE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VLAN_MODE_TYPE);
        }
    }

    public boolean getVlanModeType_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VLAN_MODE_TYPE);
    }

    public NestedReplicationNetworkInformation vlanName(String vlanName) {

        this.vlanName = vlanName;
        return this;
    }

    /**
     * Get vlanName
     *
     * @return vlanName
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getVlanName() {
        return vlanName;
    }

    public void setVlanName(String vlanName) {
        this.vlanName = vlanName;
    }

    public NestedReplicationNetworkInformation vlanName_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VLAN_NAME);
        return this;
    }

    public NestedReplicationNetworkInformation vlanName_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VLAN_NAME);
        return this;
    }

    public void setVlanName_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VLAN_NAME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VLAN_NAME);
        }
    }

    public boolean getVlanName_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VLAN_NAME);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NestedReplicationNetworkInformation nestedReplicationNetworkInformation =
                (NestedReplicationNetworkInformation) o;
        return Objects.equals(
                        this.clusterLocalId, nestedReplicationNetworkInformation.clusterLocalId)
                && Objects.equals(this.clusterName, nestedReplicationNetworkInformation.clusterName)
                && Objects.equals(this.networkIds, nestedReplicationNetworkInformation.networkIds)
                && Objects.equals(this.vdsName, nestedReplicationNetworkInformation.vdsName)
                && Objects.equals(this.vlanId, nestedReplicationNetworkInformation.vlanId)
                && Objects.equals(this.vlanLocalId, nestedReplicationNetworkInformation.vlanLocalId)
                && Objects.equals(
                        this.vlanModeType, nestedReplicationNetworkInformation.vlanModeType)
                && Objects.equals(this.vlanName, nestedReplicationNetworkInformation.vlanName);
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
                clusterLocalId,
                clusterName,
                networkIds,
                vdsName,
                vlanId,
                vlanLocalId,
                vlanModeType,
                vlanName);
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
        sb.append("class NestedReplicationNetworkInformation {\n");
        sb.append("    clusterLocalId: ").append(toIndentedString(clusterLocalId)).append("\n");
        sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
        sb.append("    networkIds: ").append(toIndentedString(networkIds)).append("\n");
        sb.append("    vdsName: ").append(toIndentedString(vdsName)).append("\n");
        sb.append("    vlanId: ").append(toIndentedString(vlanId)).append("\n");
        sb.append("    vlanLocalId: ").append(toIndentedString(vlanLocalId)).append("\n");
        sb.append("    vlanModeType: ").append(toIndentedString(vlanModeType)).append("\n");
        sb.append("    vlanName: ").append(toIndentedString(vlanName)).append("\n");
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

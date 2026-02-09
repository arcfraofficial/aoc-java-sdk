package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** VdsCreationWithMAccessVlanParams */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VdsCreationWithMAccessVlanParams
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_NIC_IDS = "nic_ids";

    @SerializedName(SERIALIZED_NAME_NIC_IDS)
    private List<String> nicIds = new ArrayList<String>();

    public static final String SERIALIZED_NAME_CLUSTER_ID = "cluster_id";

    @SerializedName(SERIALIZED_NAME_CLUSTER_ID)
    private String clusterId;

    public static final String SERIALIZED_NAME_WORK_MODE = "work_mode";

    @SerializedName(SERIALIZED_NAME_WORK_MODE)
    private String workMode;

    public static final String SERIALIZED_NAME_BOND_MODE = "bond_mode";

    @SerializedName(SERIALIZED_NAME_BOND_MODE)
    private String bondMode;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_VLAN = "vlan";

    @SerializedName(SERIALIZED_NAME_VLAN)
    private VdsCreationWithMigrateVlanParamsAllOfVlan vlan;

    public VdsCreationWithMAccessVlanParams() {}

    public VdsCreationWithMAccessVlanParams nicIds(List<String> nicIds) {

        this.nicIds = nicIds;
        return this;
    }

    public VdsCreationWithMAccessVlanParams addNicIdsItem(String nicIdsItem) {
        this.nicIds.add(nicIdsItem);
        return this;
    }

    /**
     * Get nicIds
     *
     * @return nicIds
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public List<String> getNicIds() {
        return nicIds;
    }

    public void setNicIds(List<String> nicIds) {
        this.nicIds = nicIds;
    }

    public VdsCreationWithMAccessVlanParams nicIds_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NIC_IDS);
        return this;
    }

    public VdsCreationWithMAccessVlanParams nicIds_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NIC_IDS);
        return this;
    }

    public void setNicIds_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NIC_IDS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NIC_IDS);
        }
    }

    public boolean getNicIds_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NIC_IDS);
    }

    public VdsCreationWithMAccessVlanParams clusterId(String clusterId) {

        this.clusterId = clusterId;
        return this;
    }

    /**
     * Get clusterId
     *
     * @return clusterId
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public VdsCreationWithMAccessVlanParams clusterId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER_ID);
        return this;
    }

    public VdsCreationWithMAccessVlanParams clusterId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_ID);
        return this;
    }

    public void setClusterId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLUSTER_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_ID);
        }
    }

    public boolean getClusterId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLUSTER_ID);
    }

    public VdsCreationWithMAccessVlanParams workMode(String workMode) {

        this.workMode = workMode;
        return this;
    }

    /**
     * Get workMode
     *
     * @return workMode
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getWorkMode() {
        return workMode;
    }

    public void setWorkMode(String workMode) {
        this.workMode = workMode;
    }

    public VdsCreationWithMAccessVlanParams workMode_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WORK_MODE);
        return this;
    }

    public VdsCreationWithMAccessVlanParams workMode_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_WORK_MODE);
        return this;
    }

    public void setWorkMode_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_WORK_MODE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_WORK_MODE);
        }
    }

    public boolean getWorkMode_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_WORK_MODE);
    }

    public VdsCreationWithMAccessVlanParams bondMode(String bondMode) {

        this.bondMode = bondMode;
        return this;
    }

    /**
     * Get bondMode
     *
     * @return bondMode
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getBondMode() {
        return bondMode;
    }

    public void setBondMode(String bondMode) {
        this.bondMode = bondMode;
    }

    public VdsCreationWithMAccessVlanParams bondMode_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BOND_MODE);
        return this;
    }

    public VdsCreationWithMAccessVlanParams bondMode_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BOND_MODE);
        return this;
    }

    public void setBondMode_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BOND_MODE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BOND_MODE);
        }
    }

    public boolean getBondMode_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BOND_MODE);
    }

    public VdsCreationWithMAccessVlanParams name(String name) {

        this.name = name;
        return this;
    }

    /**
     * Get name
     *
     * @return name
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public VdsCreationWithMAccessVlanParams name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public VdsCreationWithMAccessVlanParams name_ExplictlyNonNull() {
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

    public VdsCreationWithMAccessVlanParams vlan(VdsCreationWithMigrateVlanParamsAllOfVlan vlan) {

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
    public VdsCreationWithMigrateVlanParamsAllOfVlan getVlan() {
        return vlan;
    }

    public void setVlan(VdsCreationWithMigrateVlanParamsAllOfVlan vlan) {
        this.vlan = vlan;
    }

    public VdsCreationWithMAccessVlanParams vlan_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VLAN);
        return this;
    }

    public VdsCreationWithMAccessVlanParams vlan_ExplictlyNonNull() {
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
        VdsCreationWithMAccessVlanParams vdsCreationWithMAccessVlanParams =
                (VdsCreationWithMAccessVlanParams) o;
        return Objects.equals(this.nicIds, vdsCreationWithMAccessVlanParams.nicIds)
                && Objects.equals(this.clusterId, vdsCreationWithMAccessVlanParams.clusterId)
                && Objects.equals(this.workMode, vdsCreationWithMAccessVlanParams.workMode)
                && Objects.equals(this.bondMode, vdsCreationWithMAccessVlanParams.bondMode)
                && Objects.equals(this.name, vdsCreationWithMAccessVlanParams.name)
                && Objects.equals(this.vlan, vdsCreationWithMAccessVlanParams.vlan);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nicIds, clusterId, workMode, bondMode, name, vlan);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VdsCreationWithMAccessVlanParams {\n");
        sb.append("    nicIds: ").append(toIndentedString(nicIds)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    workMode: ").append(toIndentedString(workMode)).append("\n");
        sb.append("    bondMode: ").append(toIndentedString(bondMode)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

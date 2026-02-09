package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** VdsCreationParams */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VdsCreationParams extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
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

    public VdsCreationParams() {}

    public VdsCreationParams nicIds(List<String> nicIds) {

        this.nicIds = nicIds;
        return this;
    }

    public VdsCreationParams addNicIdsItem(String nicIdsItem) {
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

    public VdsCreationParams nicIds_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NIC_IDS);
        return this;
    }

    public VdsCreationParams nicIds_ExplictlyNonNull() {
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

    public VdsCreationParams clusterId(String clusterId) {

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

    public VdsCreationParams clusterId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER_ID);
        return this;
    }

    public VdsCreationParams clusterId_ExplictlyNonNull() {
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

    public VdsCreationParams workMode(String workMode) {

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

    public VdsCreationParams workMode_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WORK_MODE);
        return this;
    }

    public VdsCreationParams workMode_ExplictlyNonNull() {
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

    public VdsCreationParams bondMode(String bondMode) {

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

    public VdsCreationParams bondMode_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BOND_MODE);
        return this;
    }

    public VdsCreationParams bondMode_ExplictlyNonNull() {
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

    public VdsCreationParams name(String name) {

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

    public VdsCreationParams name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public VdsCreationParams name_ExplictlyNonNull() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VdsCreationParams vdsCreationParams = (VdsCreationParams) o;
        return Objects.equals(this.nicIds, vdsCreationParams.nicIds)
                && Objects.equals(this.clusterId, vdsCreationParams.clusterId)
                && Objects.equals(this.workMode, vdsCreationParams.workMode)
                && Objects.equals(this.bondMode, vdsCreationParams.bondMode)
                && Objects.equals(this.name, vdsCreationParams.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nicIds, clusterId, workMode, bondMode, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VdsCreationParams {\n");
        sb.append("    nicIds: ").append(toIndentedString(nicIds)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    workMode: ").append(toIndentedString(workMode)).append("\n");
        sb.append("    bondMode: ").append(toIndentedString(bondMode)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

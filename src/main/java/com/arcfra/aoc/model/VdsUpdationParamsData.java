package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** VdsUpdationParamsData */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VdsUpdationParamsData
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_NIC_IDS = "nicIds";

    @SerializedName(SERIALIZED_NAME_NIC_IDS)
    private List<String> nicIds = null;

    public static final String SERIALIZED_NAME_WORK_MODE = "work_mode";

    @SerializedName(SERIALIZED_NAME_WORK_MODE)
    private String workMode;

    public static final String SERIALIZED_NAME_BOND_MODE = "bond_mode";

    @SerializedName(SERIALIZED_NAME_BOND_MODE)
    private String bondMode;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public VdsUpdationParamsData() {}

    public VdsUpdationParamsData nicIds(List<String> nicIds) {

        this.nicIds = nicIds;
        return this;
    }

    public VdsUpdationParamsData addNicIdsItem(String nicIdsItem) {
        if (this.nicIds == null) {
            this.nicIds = new ArrayList<String>();
        }
        this.nicIds.add(nicIdsItem);
        return this;
    }

    /**
     * Get nicIds
     *
     * @return nicIds
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getNicIds() {
        return nicIds;
    }

    public void setNicIds(List<String> nicIds) {
        this.nicIds = nicIds;
    }

    public VdsUpdationParamsData nicIds_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NIC_IDS);
        return this;
    }

    public VdsUpdationParamsData nicIds_ExplictlyNonNull() {
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

    public VdsUpdationParamsData workMode(String workMode) {

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

    public VdsUpdationParamsData workMode_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WORK_MODE);
        return this;
    }

    public VdsUpdationParamsData workMode_ExplictlyNonNull() {
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

    public VdsUpdationParamsData bondMode(String bondMode) {

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

    public VdsUpdationParamsData bondMode_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BOND_MODE);
        return this;
    }

    public VdsUpdationParamsData bondMode_ExplictlyNonNull() {
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

    public VdsUpdationParamsData name(String name) {

        this.name = name;
        return this;
    }

    /**
     * Get name
     *
     * @return name
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public VdsUpdationParamsData name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public VdsUpdationParamsData name_ExplictlyNonNull() {
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
        VdsUpdationParamsData vdsUpdationParamsData = (VdsUpdationParamsData) o;
        return Objects.equals(this.nicIds, vdsUpdationParamsData.nicIds)
                && Objects.equals(this.workMode, vdsUpdationParamsData.workMode)
                && Objects.equals(this.bondMode, vdsUpdationParamsData.bondMode)
                && Objects.equals(this.name, vdsUpdationParamsData.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nicIds, workMode, bondMode, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VdsUpdationParamsData {\n");
        sb.append("    nicIds: ").append(toIndentedString(nicIds)).append("\n");
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

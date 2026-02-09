package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** NicUpdationParamsData */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class NicUpdationParamsData
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_NIC_USER_USAGE = "nic_user_usage";

    @SerializedName(SERIALIZED_NAME_NIC_USER_USAGE)
    private NicUserUsage nicUserUsage;

    public static final String SERIALIZED_NAME_TOTAL_VF_NUM = "total_vf_num";

    @SerializedName(SERIALIZED_NAME_TOTAL_VF_NUM)
    private Integer totalVfNum;

    public static final String SERIALIZED_NAME_MTU = "mtu";

    @SerializedName(SERIALIZED_NAME_MTU)
    private Integer mtu;

    public NicUpdationParamsData() {}

    public NicUpdationParamsData nicUserUsage(NicUserUsage nicUserUsage) {

        this.nicUserUsage = nicUserUsage;
        return this;
    }

    /**
     * Get nicUserUsage
     *
     * @return nicUserUsage
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NicUserUsage getNicUserUsage() {
        return nicUserUsage;
    }

    public void setNicUserUsage(NicUserUsage nicUserUsage) {
        this.nicUserUsage = nicUserUsage;
    }

    public NicUpdationParamsData nicUserUsage_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NIC_USER_USAGE);
        return this;
    }

    public NicUpdationParamsData nicUserUsage_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NIC_USER_USAGE);
        return this;
    }

    public void setNicUserUsage_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NIC_USER_USAGE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NIC_USER_USAGE);
        }
    }

    public boolean getNicUserUsage_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NIC_USER_USAGE);
    }

    public NicUpdationParamsData totalVfNum(Integer totalVfNum) {

        this.totalVfNum = totalVfNum;
        return this;
    }

    /**
     * Get totalVfNum
     *
     * @return totalVfNum
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getTotalVfNum() {
        return totalVfNum;
    }

    public void setTotalVfNum(Integer totalVfNum) {
        this.totalVfNum = totalVfNum;
    }

    public NicUpdationParamsData totalVfNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOTAL_VF_NUM);
        return this;
    }

    public NicUpdationParamsData totalVfNum_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOTAL_VF_NUM);
        return this;
    }

    public void setTotalVfNum_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOTAL_VF_NUM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOTAL_VF_NUM);
        }
    }

    public boolean getTotalVfNum_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOTAL_VF_NUM);
    }

    public NicUpdationParamsData mtu(Integer mtu) {

        this.mtu = mtu;
        return this;
    }

    /**
     * Get mtu
     *
     * @return mtu
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMtu() {
        return mtu;
    }

    public void setMtu(Integer mtu) {
        this.mtu = mtu;
    }

    public NicUpdationParamsData mtu_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MTU);
        return this;
    }

    public NicUpdationParamsData mtu_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MTU);
        return this;
    }

    public void setMtu_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MTU);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MTU);
        }
    }

    public boolean getMtu_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MTU);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NicUpdationParamsData nicUpdationParamsData = (NicUpdationParamsData) o;
        return Objects.equals(this.nicUserUsage, nicUpdationParamsData.nicUserUsage)
                && Objects.equals(this.totalVfNum, nicUpdationParamsData.totalVfNum)
                && Objects.equals(this.mtu, nicUpdationParamsData.mtu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nicUserUsage, totalVfNum, mtu);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NicUpdationParamsData {\n");
        sb.append("    nicUserUsage: ").append(toIndentedString(nicUserUsage)).append("\n");
        sb.append("    totalVfNum: ").append(toIndentedString(totalVfNum)).append("\n");
        sb.append("    mtu: ").append(toIndentedString(mtu)).append("\n");
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

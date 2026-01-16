package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** VmVlanUpdationParamsData */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VmVlanUpdationParamsData
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_QOS_BURST_UNIT = "qos_burst_unit";

    @SerializedName(SERIALIZED_NAME_QOS_BURST_UNIT)
    private ByteUnit qosBurstUnit;

    public static final String SERIALIZED_NAME_QOS_BURST = "qos_burst";

    @SerializedName(SERIALIZED_NAME_QOS_BURST)
    private Long qosBurst;

    public static final String SERIALIZED_NAME_QOS_MAX_BANDWIDTH_UNIT = "qos_max_bandwidth_unit";

    @SerializedName(SERIALIZED_NAME_QOS_MAX_BANDWIDTH_UNIT)
    private BPSUnit qosMaxBandwidthUnit;

    public static final String SERIALIZED_NAME_QOS_MAX_BANDWIDTH = "qos_max_bandwidth";

    @SerializedName(SERIALIZED_NAME_QOS_MAX_BANDWIDTH)
    private Long qosMaxBandwidth;

    public static final String SERIALIZED_NAME_QOS_MIN_BANDWIDTH_UNIT = "qos_min_bandwidth_unit";

    @SerializedName(SERIALIZED_NAME_QOS_MIN_BANDWIDTH_UNIT)
    private BPSUnit qosMinBandwidthUnit;

    public static final String SERIALIZED_NAME_QOS_MIN_BANDWIDTH = "qos_min_bandwidth";

    @SerializedName(SERIALIZED_NAME_QOS_MIN_BANDWIDTH)
    private Long qosMinBandwidth;

    public static final String SERIALIZED_NAME_QOS_PRIORITY = "qos_priority";

    @SerializedName(SERIALIZED_NAME_QOS_PRIORITY)
    private Double qosPriority;

    public static final String SERIALIZED_NAME_MODE_TYPE = "mode_type";

    @SerializedName(SERIALIZED_NAME_MODE_TYPE)
    private VlanModeType modeType;

    public static final String SERIALIZED_NAME_NETWORK_IDS = "network_ids";

    @SerializedName(SERIALIZED_NAME_NETWORK_IDS)
    private List<String> networkIds = null;

    public static final String SERIALIZED_NAME_VLAN_ID = "vlan_id";

    @SerializedName(SERIALIZED_NAME_VLAN_ID)
    private Integer vlanId;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public VmVlanUpdationParamsData() {}

    public VmVlanUpdationParamsData qosBurstUnit(ByteUnit qosBurstUnit) {

        this.qosBurstUnit = qosBurstUnit;
        return this;
    }

    /**
     * Get qosBurstUnit
     *
     * @return qosBurstUnit
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ByteUnit getQosBurstUnit() {
        return qosBurstUnit;
    }

    public void setQosBurstUnit(ByteUnit qosBurstUnit) {
        this.qosBurstUnit = qosBurstUnit;
    }

    public VmVlanUpdationParamsData qosBurstUnit_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_QOS_BURST_UNIT);
        return this;
    }

    public VmVlanUpdationParamsData qosBurstUnit_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_QOS_BURST_UNIT);
        return this;
    }

    public void setQosBurstUnit_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_QOS_BURST_UNIT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_QOS_BURST_UNIT);
        }
    }

    public boolean getQosBurstUnit_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_QOS_BURST_UNIT);
    }

    public VmVlanUpdationParamsData qosBurst(Long qosBurst) {

        this.qosBurst = qosBurst;
        return this;
    }

    /**
     * Get qosBurst
     *
     * @return qosBurst
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getQosBurst() {
        return qosBurst;
    }

    public void setQosBurst(Long qosBurst) {
        this.qosBurst = qosBurst;
    }

    public VmVlanUpdationParamsData qosBurst_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_QOS_BURST);
        return this;
    }

    public VmVlanUpdationParamsData qosBurst_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_QOS_BURST);
        return this;
    }

    public void setQosBurst_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_QOS_BURST);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_QOS_BURST);
        }
    }

    public boolean getQosBurst_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_QOS_BURST);
    }

    public VmVlanUpdationParamsData qosMaxBandwidthUnit(BPSUnit qosMaxBandwidthUnit) {

        this.qosMaxBandwidthUnit = qosMaxBandwidthUnit;
        return this;
    }

    /**
     * Get qosMaxBandwidthUnit
     *
     * @return qosMaxBandwidthUnit
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public BPSUnit getQosMaxBandwidthUnit() {
        return qosMaxBandwidthUnit;
    }

    public void setQosMaxBandwidthUnit(BPSUnit qosMaxBandwidthUnit) {
        this.qosMaxBandwidthUnit = qosMaxBandwidthUnit;
    }

    public VmVlanUpdationParamsData qosMaxBandwidthUnit_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_QOS_MAX_BANDWIDTH_UNIT);
        return this;
    }

    public VmVlanUpdationParamsData qosMaxBandwidthUnit_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_QOS_MAX_BANDWIDTH_UNIT);
        return this;
    }

    public void setQosMaxBandwidthUnit_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_QOS_MAX_BANDWIDTH_UNIT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_QOS_MAX_BANDWIDTH_UNIT);
        }
    }

    public boolean getQosMaxBandwidthUnit_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_QOS_MAX_BANDWIDTH_UNIT);
    }

    public VmVlanUpdationParamsData qosMaxBandwidth(Long qosMaxBandwidth) {

        this.qosMaxBandwidth = qosMaxBandwidth;
        return this;
    }

    /**
     * Get qosMaxBandwidth
     *
     * @return qosMaxBandwidth
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getQosMaxBandwidth() {
        return qosMaxBandwidth;
    }

    public void setQosMaxBandwidth(Long qosMaxBandwidth) {
        this.qosMaxBandwidth = qosMaxBandwidth;
    }

    public VmVlanUpdationParamsData qosMaxBandwidth_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_QOS_MAX_BANDWIDTH);
        return this;
    }

    public VmVlanUpdationParamsData qosMaxBandwidth_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_QOS_MAX_BANDWIDTH);
        return this;
    }

    public void setQosMaxBandwidth_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_QOS_MAX_BANDWIDTH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_QOS_MAX_BANDWIDTH);
        }
    }

    public boolean getQosMaxBandwidth_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_QOS_MAX_BANDWIDTH);
    }

    public VmVlanUpdationParamsData qosMinBandwidthUnit(BPSUnit qosMinBandwidthUnit) {

        this.qosMinBandwidthUnit = qosMinBandwidthUnit;
        return this;
    }

    /**
     * Get qosMinBandwidthUnit
     *
     * @return qosMinBandwidthUnit
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public BPSUnit getQosMinBandwidthUnit() {
        return qosMinBandwidthUnit;
    }

    public void setQosMinBandwidthUnit(BPSUnit qosMinBandwidthUnit) {
        this.qosMinBandwidthUnit = qosMinBandwidthUnit;
    }

    public VmVlanUpdationParamsData qosMinBandwidthUnit_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_QOS_MIN_BANDWIDTH_UNIT);
        return this;
    }

    public VmVlanUpdationParamsData qosMinBandwidthUnit_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_QOS_MIN_BANDWIDTH_UNIT);
        return this;
    }

    public void setQosMinBandwidthUnit_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_QOS_MIN_BANDWIDTH_UNIT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_QOS_MIN_BANDWIDTH_UNIT);
        }
    }

    public boolean getQosMinBandwidthUnit_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_QOS_MIN_BANDWIDTH_UNIT);
    }

    public VmVlanUpdationParamsData qosMinBandwidth(Long qosMinBandwidth) {

        this.qosMinBandwidth = qosMinBandwidth;
        return this;
    }

    /**
     * Get qosMinBandwidth
     *
     * @return qosMinBandwidth
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getQosMinBandwidth() {
        return qosMinBandwidth;
    }

    public void setQosMinBandwidth(Long qosMinBandwidth) {
        this.qosMinBandwidth = qosMinBandwidth;
    }

    public VmVlanUpdationParamsData qosMinBandwidth_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_QOS_MIN_BANDWIDTH);
        return this;
    }

    public VmVlanUpdationParamsData qosMinBandwidth_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_QOS_MIN_BANDWIDTH);
        return this;
    }

    public void setQosMinBandwidth_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_QOS_MIN_BANDWIDTH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_QOS_MIN_BANDWIDTH);
        }
    }

    public boolean getQosMinBandwidth_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_QOS_MIN_BANDWIDTH);
    }

    public VmVlanUpdationParamsData qosPriority(Double qosPriority) {

        this.qosPriority = qosPriority;
        return this;
    }

    /**
     * Get qosPriority minimum: 0
     *
     * @return qosPriority
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getQosPriority() {
        return qosPriority;
    }

    public void setQosPriority(Double qosPriority) {
        this.qosPriority = qosPriority;
    }

    public VmVlanUpdationParamsData qosPriority_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_QOS_PRIORITY);
        return this;
    }

    public VmVlanUpdationParamsData qosPriority_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_QOS_PRIORITY);
        return this;
    }

    public void setQosPriority_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_QOS_PRIORITY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_QOS_PRIORITY);
        }
    }

    public boolean getQosPriority_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_QOS_PRIORITY);
    }

    public VmVlanUpdationParamsData modeType(VlanModeType modeType) {

        this.modeType = modeType;
        return this;
    }

    /**
     * Get modeType
     *
     * @return modeType
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VlanModeType getModeType() {
        return modeType;
    }

    public void setModeType(VlanModeType modeType) {
        this.modeType = modeType;
    }

    public VmVlanUpdationParamsData modeType_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MODE_TYPE);
        return this;
    }

    public VmVlanUpdationParamsData modeType_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MODE_TYPE);
        return this;
    }

    public void setModeType_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MODE_TYPE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MODE_TYPE);
        }
    }

    public boolean getModeType_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MODE_TYPE);
    }

    public VmVlanUpdationParamsData networkIds(List<String> networkIds) {

        this.networkIds = networkIds;
        return this;
    }

    public VmVlanUpdationParamsData addNetworkIdsItem(String networkIdsItem) {
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

    public VmVlanUpdationParamsData networkIds_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NETWORK_IDS);
        return this;
    }

    public VmVlanUpdationParamsData networkIds_ExplictlyNonNull() {
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

    public VmVlanUpdationParamsData vlanId(Integer vlanId) {

        this.vlanId = vlanId;
        return this;
    }

    /**
     * Get vlanId minimum: 0 maximum: 4095
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

    public VmVlanUpdationParamsData vlanId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VLAN_ID);
        return this;
    }

    public VmVlanUpdationParamsData vlanId_ExplictlyNonNull() {
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

    public VmVlanUpdationParamsData name(String name) {

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

    public VmVlanUpdationParamsData name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public VmVlanUpdationParamsData name_ExplictlyNonNull() {
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
        VmVlanUpdationParamsData vmVlanUpdationParamsData = (VmVlanUpdationParamsData) o;
        return Objects.equals(this.qosBurstUnit, vmVlanUpdationParamsData.qosBurstUnit)
                && Objects.equals(this.qosBurst, vmVlanUpdationParamsData.qosBurst)
                && Objects.equals(
                        this.qosMaxBandwidthUnit, vmVlanUpdationParamsData.qosMaxBandwidthUnit)
                && Objects.equals(this.qosMaxBandwidth, vmVlanUpdationParamsData.qosMaxBandwidth)
                && Objects.equals(
                        this.qosMinBandwidthUnit, vmVlanUpdationParamsData.qosMinBandwidthUnit)
                && Objects.equals(this.qosMinBandwidth, vmVlanUpdationParamsData.qosMinBandwidth)
                && Objects.equals(this.qosPriority, vmVlanUpdationParamsData.qosPriority)
                && Objects.equals(this.modeType, vmVlanUpdationParamsData.modeType)
                && Objects.equals(this.networkIds, vmVlanUpdationParamsData.networkIds)
                && Objects.equals(this.vlanId, vmVlanUpdationParamsData.vlanId)
                && Objects.equals(this.name, vmVlanUpdationParamsData.name);
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
                qosBurstUnit,
                qosBurst,
                qosMaxBandwidthUnit,
                qosMaxBandwidth,
                qosMinBandwidthUnit,
                qosMinBandwidth,
                qosPriority,
                modeType,
                networkIds,
                vlanId,
                name);
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
        sb.append("class VmVlanUpdationParamsData {\n");
        sb.append("    qosBurstUnit: ").append(toIndentedString(qosBurstUnit)).append("\n");
        sb.append("    qosBurst: ").append(toIndentedString(qosBurst)).append("\n");
        sb.append("    qosMaxBandwidthUnit: ")
                .append(toIndentedString(qosMaxBandwidthUnit))
                .append("\n");
        sb.append("    qosMaxBandwidth: ").append(toIndentedString(qosMaxBandwidth)).append("\n");
        sb.append("    qosMinBandwidthUnit: ")
                .append(toIndentedString(qosMinBandwidthUnit))
                .append("\n");
        sb.append("    qosMinBandwidth: ").append(toIndentedString(qosMinBandwidth)).append("\n");
        sb.append("    qosPriority: ").append(toIndentedString(qosPriority)).append("\n");
        sb.append("    modeType: ").append(toIndentedString(modeType)).append("\n");
        sb.append("    networkIds: ").append(toIndentedString(networkIds)).append("\n");
        sb.append("    vlanId: ").append(toIndentedString(vlanId)).append("\n");
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

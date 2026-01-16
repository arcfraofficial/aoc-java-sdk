package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** VmVlanCreationParams */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VmVlanCreationParams
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

    public static final String SERIALIZED_NAME_VDS_ID = "vds_id";

    @SerializedName(SERIALIZED_NAME_VDS_ID)
    private String vdsId;

    public static final String SERIALIZED_NAME_VLAN_ID = "vlan_id";

    @SerializedName(SERIALIZED_NAME_VLAN_ID)
    private Integer vlanId;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public VmVlanCreationParams() {}

    public VmVlanCreationParams qosBurstUnit(ByteUnit qosBurstUnit) {

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

    public VmVlanCreationParams qosBurstUnit_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_QOS_BURST_UNIT);
        return this;
    }

    public VmVlanCreationParams qosBurstUnit_ExplictlyNonNull() {
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

    public VmVlanCreationParams qosBurst(Long qosBurst) {

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

    public VmVlanCreationParams qosBurst_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_QOS_BURST);
        return this;
    }

    public VmVlanCreationParams qosBurst_ExplictlyNonNull() {
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

    public VmVlanCreationParams qosMaxBandwidthUnit(BPSUnit qosMaxBandwidthUnit) {

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

    public VmVlanCreationParams qosMaxBandwidthUnit_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_QOS_MAX_BANDWIDTH_UNIT);
        return this;
    }

    public VmVlanCreationParams qosMaxBandwidthUnit_ExplictlyNonNull() {
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

    public VmVlanCreationParams qosMaxBandwidth(Long qosMaxBandwidth) {

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

    public VmVlanCreationParams qosMaxBandwidth_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_QOS_MAX_BANDWIDTH);
        return this;
    }

    public VmVlanCreationParams qosMaxBandwidth_ExplictlyNonNull() {
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

    public VmVlanCreationParams qosMinBandwidthUnit(BPSUnit qosMinBandwidthUnit) {

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

    public VmVlanCreationParams qosMinBandwidthUnit_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_QOS_MIN_BANDWIDTH_UNIT);
        return this;
    }

    public VmVlanCreationParams qosMinBandwidthUnit_ExplictlyNonNull() {
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

    public VmVlanCreationParams qosMinBandwidth(Long qosMinBandwidth) {

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

    public VmVlanCreationParams qosMinBandwidth_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_QOS_MIN_BANDWIDTH);
        return this;
    }

    public VmVlanCreationParams qosMinBandwidth_ExplictlyNonNull() {
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

    public VmVlanCreationParams qosPriority(Double qosPriority) {

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

    public VmVlanCreationParams qosPriority_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_QOS_PRIORITY);
        return this;
    }

    public VmVlanCreationParams qosPriority_ExplictlyNonNull() {
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

    public VmVlanCreationParams modeType(VlanModeType modeType) {

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

    public VmVlanCreationParams modeType_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MODE_TYPE);
        return this;
    }

    public VmVlanCreationParams modeType_ExplictlyNonNull() {
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

    public VmVlanCreationParams networkIds(List<String> networkIds) {

        this.networkIds = networkIds;
        return this;
    }

    public VmVlanCreationParams addNetworkIdsItem(String networkIdsItem) {
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

    public VmVlanCreationParams networkIds_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NETWORK_IDS);
        return this;
    }

    public VmVlanCreationParams networkIds_ExplictlyNonNull() {
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

    public VmVlanCreationParams vdsId(String vdsId) {

        this.vdsId = vdsId;
        return this;
    }

    /**
     * Get vdsId
     *
     * @return vdsId
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getVdsId() {
        return vdsId;
    }

    public void setVdsId(String vdsId) {
        this.vdsId = vdsId;
    }

    public VmVlanCreationParams vdsId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VDS_ID);
        return this;
    }

    public VmVlanCreationParams vdsId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VDS_ID);
        return this;
    }

    public void setVdsId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VDS_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VDS_ID);
        }
    }

    public boolean getVdsId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VDS_ID);
    }

    public VmVlanCreationParams vlanId(Integer vlanId) {

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

    public VmVlanCreationParams vlanId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VLAN_ID);
        return this;
    }

    public VmVlanCreationParams vlanId_ExplictlyNonNull() {
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

    public VmVlanCreationParams name(String name) {

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

    public VmVlanCreationParams name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public VmVlanCreationParams name_ExplictlyNonNull() {
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
        VmVlanCreationParams vmVlanCreationParams = (VmVlanCreationParams) o;
        return Objects.equals(this.qosBurstUnit, vmVlanCreationParams.qosBurstUnit)
                && Objects.equals(this.qosBurst, vmVlanCreationParams.qosBurst)
                && Objects.equals(
                        this.qosMaxBandwidthUnit, vmVlanCreationParams.qosMaxBandwidthUnit)
                && Objects.equals(this.qosMaxBandwidth, vmVlanCreationParams.qosMaxBandwidth)
                && Objects.equals(
                        this.qosMinBandwidthUnit, vmVlanCreationParams.qosMinBandwidthUnit)
                && Objects.equals(this.qosMinBandwidth, vmVlanCreationParams.qosMinBandwidth)
                && Objects.equals(this.qosPriority, vmVlanCreationParams.qosPriority)
                && Objects.equals(this.modeType, vmVlanCreationParams.modeType)
                && Objects.equals(this.networkIds, vmVlanCreationParams.networkIds)
                && Objects.equals(this.vdsId, vmVlanCreationParams.vdsId)
                && Objects.equals(this.vlanId, vmVlanCreationParams.vlanId)
                && Objects.equals(this.name, vmVlanCreationParams.name);
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
                vdsId,
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
        sb.append("class VmVlanCreationParams {\n");
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
        sb.append("    vdsId: ").append(toIndentedString(vdsId)).append("\n");
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

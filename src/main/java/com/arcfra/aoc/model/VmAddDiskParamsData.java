package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** VmAddDiskParamsData */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VmAddDiskParamsData
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_MAX_BANDWIDTH_POLICY = "max_bandwidth_policy";

    @SerializedName(SERIALIZED_NAME_MAX_BANDWIDTH_POLICY)
    private VmDiskIoRestrictType maxBandwidthPolicy;

    public static final String SERIALIZED_NAME_MAX_BANDWIDTH_UNIT = "max_bandwidth_unit";

    @SerializedName(SERIALIZED_NAME_MAX_BANDWIDTH_UNIT)
    private BPSUnit maxBandwidthUnit;

    public static final String SERIALIZED_NAME_MAX_BANDWIDTH = "max_bandwidth";

    @SerializedName(SERIALIZED_NAME_MAX_BANDWIDTH)
    private Long maxBandwidth;

    public static final String SERIALIZED_NAME_MAX_IOPS_POLICY = "max_iops_policy";

    @SerializedName(SERIALIZED_NAME_MAX_IOPS_POLICY)
    private VmDiskIoRestrictType maxIopsPolicy;

    public static final String SERIALIZED_NAME_MAX_IOPS = "max_iops";

    @SerializedName(SERIALIZED_NAME_MAX_IOPS)
    private Long maxIops;

    public static final String SERIALIZED_NAME_IO_POLICY = "io_policy";

    @SerializedName(SERIALIZED_NAME_IO_POLICY)
    private VmDiskIoPolicy ioPolicy;

    public static final String SERIALIZED_NAME_VM_DISKS = "vm_disks";

    @SerializedName(SERIALIZED_NAME_VM_DISKS)
    private VmAddDiskParamsDataVmDisks vmDisks;

    public VmAddDiskParamsData() {}

    public VmAddDiskParamsData maxBandwidthPolicy(VmDiskIoRestrictType maxBandwidthPolicy) {

        this.maxBandwidthPolicy = maxBandwidthPolicy;
        return this;
    }

    /**
     * Get maxBandwidthPolicy
     *
     * @return maxBandwidthPolicy
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmDiskIoRestrictType getMaxBandwidthPolicy() {
        return maxBandwidthPolicy;
    }

    public void setMaxBandwidthPolicy(VmDiskIoRestrictType maxBandwidthPolicy) {
        this.maxBandwidthPolicy = maxBandwidthPolicy;
    }

    public VmAddDiskParamsData maxBandwidthPolicy_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_BANDWIDTH_POLICY);
        return this;
    }

    public VmAddDiskParamsData maxBandwidthPolicy_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_BANDWIDTH_POLICY);
        return this;
    }

    public void setMaxBandwidthPolicy_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_BANDWIDTH_POLICY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_BANDWIDTH_POLICY);
        }
    }

    public boolean getMaxBandwidthPolicy_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_BANDWIDTH_POLICY);
    }

    public VmAddDiskParamsData maxBandwidthUnit(BPSUnit maxBandwidthUnit) {

        this.maxBandwidthUnit = maxBandwidthUnit;
        return this;
    }

    /**
     * Get maxBandwidthUnit
     *
     * @return maxBandwidthUnit
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public BPSUnit getMaxBandwidthUnit() {
        return maxBandwidthUnit;
    }

    public void setMaxBandwidthUnit(BPSUnit maxBandwidthUnit) {
        this.maxBandwidthUnit = maxBandwidthUnit;
    }

    public VmAddDiskParamsData maxBandwidthUnit_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_BANDWIDTH_UNIT);
        return this;
    }

    public VmAddDiskParamsData maxBandwidthUnit_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_BANDWIDTH_UNIT);
        return this;
    }

    public void setMaxBandwidthUnit_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_BANDWIDTH_UNIT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_BANDWIDTH_UNIT);
        }
    }

    public boolean getMaxBandwidthUnit_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_BANDWIDTH_UNIT);
    }

    public VmAddDiskParamsData maxBandwidth(Long maxBandwidth) {

        this.maxBandwidth = maxBandwidth;
        return this;
    }

    /**
     * Get maxBandwidth
     *
     * @return maxBandwidth
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getMaxBandwidth() {
        return maxBandwidth;
    }

    public void setMaxBandwidth(Long maxBandwidth) {
        this.maxBandwidth = maxBandwidth;
    }

    public VmAddDiskParamsData maxBandwidth_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_BANDWIDTH);
        return this;
    }

    public VmAddDiskParamsData maxBandwidth_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_BANDWIDTH);
        return this;
    }

    public void setMaxBandwidth_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_BANDWIDTH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_BANDWIDTH);
        }
    }

    public boolean getMaxBandwidth_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_BANDWIDTH);
    }

    public VmAddDiskParamsData maxIopsPolicy(VmDiskIoRestrictType maxIopsPolicy) {

        this.maxIopsPolicy = maxIopsPolicy;
        return this;
    }

    /**
     * Get maxIopsPolicy
     *
     * @return maxIopsPolicy
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmDiskIoRestrictType getMaxIopsPolicy() {
        return maxIopsPolicy;
    }

    public void setMaxIopsPolicy(VmDiskIoRestrictType maxIopsPolicy) {
        this.maxIopsPolicy = maxIopsPolicy;
    }

    public VmAddDiskParamsData maxIopsPolicy_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_IOPS_POLICY);
        return this;
    }

    public VmAddDiskParamsData maxIopsPolicy_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_IOPS_POLICY);
        return this;
    }

    public void setMaxIopsPolicy_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_IOPS_POLICY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_IOPS_POLICY);
        }
    }

    public boolean getMaxIopsPolicy_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_IOPS_POLICY);
    }

    public VmAddDiskParamsData maxIops(Long maxIops) {

        this.maxIops = maxIops;
        return this;
    }

    /**
     * Get maxIops
     *
     * @return maxIops
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getMaxIops() {
        return maxIops;
    }

    public void setMaxIops(Long maxIops) {
        this.maxIops = maxIops;
    }

    public VmAddDiskParamsData maxIops_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_IOPS);
        return this;
    }

    public VmAddDiskParamsData maxIops_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_IOPS);
        return this;
    }

    public void setMaxIops_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_IOPS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_IOPS);
        }
    }

    public boolean getMaxIops_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_IOPS);
    }

    public VmAddDiskParamsData ioPolicy(VmDiskIoPolicy ioPolicy) {

        this.ioPolicy = ioPolicy;
        return this;
    }

    /**
     * Get ioPolicy
     *
     * @return ioPolicy
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmDiskIoPolicy getIoPolicy() {
        return ioPolicy;
    }

    public void setIoPolicy(VmDiskIoPolicy ioPolicy) {
        this.ioPolicy = ioPolicy;
    }

    public VmAddDiskParamsData ioPolicy_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IO_POLICY);
        return this;
    }

    public VmAddDiskParamsData ioPolicy_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IO_POLICY);
        return this;
    }

    public void setIoPolicy_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IO_POLICY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IO_POLICY);
        }
    }

    public boolean getIoPolicy_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IO_POLICY);
    }

    public VmAddDiskParamsData vmDisks(VmAddDiskParamsDataVmDisks vmDisks) {

        this.vmDisks = vmDisks;
        return this;
    }

    /**
     * Get vmDisks
     *
     * @return vmDisks
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public VmAddDiskParamsDataVmDisks getVmDisks() {
        return vmDisks;
    }

    public void setVmDisks(VmAddDiskParamsDataVmDisks vmDisks) {
        this.vmDisks = vmDisks;
    }

    public VmAddDiskParamsData vmDisks_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_DISKS);
        return this;
    }

    public VmAddDiskParamsData vmDisks_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_DISKS);
        return this;
    }

    public void setVmDisks_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_DISKS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_DISKS);
        }
    }

    public boolean getVmDisks_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_DISKS);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VmAddDiskParamsData vmAddDiskParamsData = (VmAddDiskParamsData) o;
        return Objects.equals(this.maxBandwidthPolicy, vmAddDiskParamsData.maxBandwidthPolicy)
                && Objects.equals(this.maxBandwidthUnit, vmAddDiskParamsData.maxBandwidthUnit)
                && Objects.equals(this.maxBandwidth, vmAddDiskParamsData.maxBandwidth)
                && Objects.equals(this.maxIopsPolicy, vmAddDiskParamsData.maxIopsPolicy)
                && Objects.equals(this.maxIops, vmAddDiskParamsData.maxIops)
                && Objects.equals(this.ioPolicy, vmAddDiskParamsData.ioPolicy)
                && Objects.equals(this.vmDisks, vmAddDiskParamsData.vmDisks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                maxBandwidthPolicy,
                maxBandwidthUnit,
                maxBandwidth,
                maxIopsPolicy,
                maxIops,
                ioPolicy,
                vmDisks);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VmAddDiskParamsData {\n");
        sb.append("    maxBandwidthPolicy: ")
                .append(toIndentedString(maxBandwidthPolicy))
                .append("\n");
        sb.append("    maxBandwidthUnit: ").append(toIndentedString(maxBandwidthUnit)).append("\n");
        sb.append("    maxBandwidth: ").append(toIndentedString(maxBandwidth)).append("\n");
        sb.append("    maxIopsPolicy: ").append(toIndentedString(maxIopsPolicy)).append("\n");
        sb.append("    maxIops: ").append(toIndentedString(maxIops)).append("\n");
        sb.append("    ioPolicy: ").append(toIndentedString(ioPolicy)).append("\n");
        sb.append("    vmDisks: ").append(toIndentedString(vmDisks)).append("\n");
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

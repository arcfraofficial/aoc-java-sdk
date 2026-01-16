package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** VmUpdateIoPolicyParamsData */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VmUpdateIoPolicyParamsData
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_EACH_DISK = "each_disk";

    @SerializedName(SERIALIZED_NAME_EACH_DISK)
    private List<VmUpdateEachDiskIoPolicyParams> eachDisk = null;

    public static final String SERIALIZED_NAME_WHOLE_VM = "whole_vm";

    @SerializedName(SERIALIZED_NAME_WHOLE_VM)
    private VmRestrictIoParamsData wholeVm;

    public static final String SERIALIZED_NAME_IO_POLICY = "io_policy";

    @SerializedName(SERIALIZED_NAME_IO_POLICY)
    private VmDiskIoPolicy ioPolicy;

    public VmUpdateIoPolicyParamsData() {}

    public VmUpdateIoPolicyParamsData eachDisk(List<VmUpdateEachDiskIoPolicyParams> eachDisk) {

        this.eachDisk = eachDisk;
        return this;
    }

    public VmUpdateIoPolicyParamsData addEachDiskItem(VmUpdateEachDiskIoPolicyParams eachDiskItem) {
        if (this.eachDisk == null) {
            this.eachDisk = new ArrayList<VmUpdateEachDiskIoPolicyParams>();
        }
        this.eachDisk.add(eachDiskItem);
        return this;
    }

    /**
     * Get eachDisk
     *
     * @return eachDisk
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<VmUpdateEachDiskIoPolicyParams> getEachDisk() {
        return eachDisk;
    }

    public void setEachDisk(List<VmUpdateEachDiskIoPolicyParams> eachDisk) {
        this.eachDisk = eachDisk;
    }

    public VmUpdateIoPolicyParamsData eachDisk_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EACH_DISK);
        return this;
    }

    public VmUpdateIoPolicyParamsData eachDisk_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EACH_DISK);
        return this;
    }

    public void setEachDisk_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EACH_DISK);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EACH_DISK);
        }
    }

    public boolean getEachDisk_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EACH_DISK);
    }

    public VmUpdateIoPolicyParamsData wholeVm(VmRestrictIoParamsData wholeVm) {

        this.wholeVm = wholeVm;
        return this;
    }

    /**
     * Get wholeVm
     *
     * @return wholeVm
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmRestrictIoParamsData getWholeVm() {
        return wholeVm;
    }

    public void setWholeVm(VmRestrictIoParamsData wholeVm) {
        this.wholeVm = wholeVm;
    }

    public VmUpdateIoPolicyParamsData wholeVm_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WHOLE_VM);
        return this;
    }

    public VmUpdateIoPolicyParamsData wholeVm_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_WHOLE_VM);
        return this;
    }

    public void setWholeVm_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_WHOLE_VM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_WHOLE_VM);
        }
    }

    public boolean getWholeVm_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_WHOLE_VM);
    }

    public VmUpdateIoPolicyParamsData ioPolicy(VmDiskIoPolicy ioPolicy) {

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

    public VmUpdateIoPolicyParamsData ioPolicy_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IO_POLICY);
        return this;
    }

    public VmUpdateIoPolicyParamsData ioPolicy_ExplictlyNonNull() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VmUpdateIoPolicyParamsData vmUpdateIoPolicyParamsData = (VmUpdateIoPolicyParamsData) o;
        return Objects.equals(this.eachDisk, vmUpdateIoPolicyParamsData.eachDisk)
                && Objects.equals(this.wholeVm, vmUpdateIoPolicyParamsData.wholeVm)
                && Objects.equals(this.ioPolicy, vmUpdateIoPolicyParamsData.ioPolicy);
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
        return Objects.hash(eachDisk, wholeVm, ioPolicy);
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
        sb.append("class VmUpdateIoPolicyParamsData {\n");
        sb.append("    eachDisk: ").append(toIndentedString(eachDisk)).append("\n");
        sb.append("    wholeVm: ").append(toIndentedString(wholeVm)).append("\n");
        sb.append("    ioPolicy: ").append(toIndentedString(ioPolicy)).append("\n");
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

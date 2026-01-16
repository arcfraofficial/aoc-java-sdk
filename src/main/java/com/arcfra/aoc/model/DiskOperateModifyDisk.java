package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** DiskOperateModifyDisk */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class DiskOperateModifyDisk
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_VM_VOLUME_ID = "vm_volume_id";

    @SerializedName(SERIALIZED_NAME_VM_VOLUME_ID)
    private String vmVolumeId;

    public static final String SERIALIZED_NAME_BUS = "bus";

    @SerializedName(SERIALIZED_NAME_BUS)
    private Bus bus;

    public static final String SERIALIZED_NAME_DISK_INDEX = "disk_index";

    @SerializedName(SERIALIZED_NAME_DISK_INDEX)
    private Integer diskIndex;

    public DiskOperateModifyDisk() {}

    public DiskOperateModifyDisk vmVolumeId(String vmVolumeId) {

        this.vmVolumeId = vmVolumeId;
        return this;
    }

    /**
     * Get vmVolumeId
     *
     * @return vmVolumeId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVmVolumeId() {
        return vmVolumeId;
    }

    public void setVmVolumeId(String vmVolumeId) {
        this.vmVolumeId = vmVolumeId;
    }

    public DiskOperateModifyDisk vmVolumeId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_VOLUME_ID);
        return this;
    }

    public DiskOperateModifyDisk vmVolumeId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_VOLUME_ID);
        return this;
    }

    public void setVmVolumeId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_VOLUME_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_VOLUME_ID);
        }
    }

    public boolean getVmVolumeId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_VOLUME_ID);
    }

    public DiskOperateModifyDisk bus(Bus bus) {

        this.bus = bus;
        return this;
    }

    /**
     * Get bus
     *
     * @return bus
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Bus getBus() {
        return bus;
    }

    public void setBus(Bus bus) {
        this.bus = bus;
    }

    public DiskOperateModifyDisk bus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BUS);
        return this;
    }

    public DiskOperateModifyDisk bus_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BUS);
        return this;
    }

    public void setBus_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BUS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BUS);
        }
    }

    public boolean getBus_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BUS);
    }

    public DiskOperateModifyDisk diskIndex(Integer diskIndex) {

        this.diskIndex = diskIndex;
        return this;
    }

    /**
     * Get diskIndex
     *
     * @return diskIndex
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Integer getDiskIndex() {
        return diskIndex;
    }

    public void setDiskIndex(Integer diskIndex) {
        this.diskIndex = diskIndex;
    }

    public DiskOperateModifyDisk diskIndex_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISK_INDEX);
        return this;
    }

    public DiskOperateModifyDisk diskIndex_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DISK_INDEX);
        return this;
    }

    public void setDiskIndex_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DISK_INDEX);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DISK_INDEX);
        }
    }

    public boolean getDiskIndex_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DISK_INDEX);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DiskOperateModifyDisk diskOperateModifyDisk = (DiskOperateModifyDisk) o;
        return Objects.equals(this.vmVolumeId, diskOperateModifyDisk.vmVolumeId)
                && Objects.equals(this.bus, diskOperateModifyDisk.bus)
                && Objects.equals(this.diskIndex, diskOperateModifyDisk.diskIndex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vmVolumeId, bus, diskIndex);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DiskOperateModifyDisk {\n");
        sb.append("    vmVolumeId: ").append(toIndentedString(vmVolumeId)).append("\n");
        sb.append("    bus: ").append(toIndentedString(bus)).append("\n");
        sb.append("    diskIndex: ").append(toIndentedString(diskIndex)).append("\n");
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

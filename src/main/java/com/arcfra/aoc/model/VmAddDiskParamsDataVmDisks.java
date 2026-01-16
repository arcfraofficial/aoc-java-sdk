package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** VmAddDiskParamsDataVmDisks */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VmAddDiskParamsDataVmDisks
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_MOUNT_DISKS = "mount_disks";

    @SerializedName(SERIALIZED_NAME_MOUNT_DISKS)
    private List<MountDisksParams> mountDisks = null;

    public static final String SERIALIZED_NAME_MOUNT_NEW_CREATE_DISKS = "mount_new_create_disks";

    @SerializedName(SERIALIZED_NAME_MOUNT_NEW_CREATE_DISKS)
    private List<MountNewCreateDisksParams> mountNewCreateDisks = null;

    public VmAddDiskParamsDataVmDisks() {}

    public VmAddDiskParamsDataVmDisks mountDisks(List<MountDisksParams> mountDisks) {

        this.mountDisks = mountDisks;
        return this;
    }

    public VmAddDiskParamsDataVmDisks addMountDisksItem(MountDisksParams mountDisksItem) {
        if (this.mountDisks == null) {
            this.mountDisks = new ArrayList<MountDisksParams>();
        }
        this.mountDisks.add(mountDisksItem);
        return this;
    }

    /**
     * Get mountDisks
     *
     * @return mountDisks
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<MountDisksParams> getMountDisks() {
        return mountDisks;
    }

    public void setMountDisks(List<MountDisksParams> mountDisks) {
        this.mountDisks = mountDisks;
    }

    public VmAddDiskParamsDataVmDisks mountDisks_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MOUNT_DISKS);
        return this;
    }

    public VmAddDiskParamsDataVmDisks mountDisks_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MOUNT_DISKS);
        return this;
    }

    public void setMountDisks_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MOUNT_DISKS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MOUNT_DISKS);
        }
    }

    public boolean getMountDisks_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MOUNT_DISKS);
    }

    public VmAddDiskParamsDataVmDisks mountNewCreateDisks(
            List<MountNewCreateDisksParams> mountNewCreateDisks) {

        this.mountNewCreateDisks = mountNewCreateDisks;
        return this;
    }

    public VmAddDiskParamsDataVmDisks addMountNewCreateDisksItem(
            MountNewCreateDisksParams mountNewCreateDisksItem) {
        if (this.mountNewCreateDisks == null) {
            this.mountNewCreateDisks = new ArrayList<MountNewCreateDisksParams>();
        }
        this.mountNewCreateDisks.add(mountNewCreateDisksItem);
        return this;
    }

    /**
     * Get mountNewCreateDisks
     *
     * @return mountNewCreateDisks
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<MountNewCreateDisksParams> getMountNewCreateDisks() {
        return mountNewCreateDisks;
    }

    public void setMountNewCreateDisks(List<MountNewCreateDisksParams> mountNewCreateDisks) {
        this.mountNewCreateDisks = mountNewCreateDisks;
    }

    public VmAddDiskParamsDataVmDisks mountNewCreateDisks_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MOUNT_NEW_CREATE_DISKS);
        return this;
    }

    public VmAddDiskParamsDataVmDisks mountNewCreateDisks_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MOUNT_NEW_CREATE_DISKS);
        return this;
    }

    public void setMountNewCreateDisks_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MOUNT_NEW_CREATE_DISKS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MOUNT_NEW_CREATE_DISKS);
        }
    }

    public boolean getMountNewCreateDisks_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MOUNT_NEW_CREATE_DISKS);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VmAddDiskParamsDataVmDisks vmAddDiskParamsDataVmDisks = (VmAddDiskParamsDataVmDisks) o;
        return Objects.equals(this.mountDisks, vmAddDiskParamsDataVmDisks.mountDisks)
                && Objects.equals(
                        this.mountNewCreateDisks, vmAddDiskParamsDataVmDisks.mountNewCreateDisks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mountDisks, mountNewCreateDisks);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VmAddDiskParamsDataVmDisks {\n");
        sb.append("    mountDisks: ").append(toIndentedString(mountDisks)).append("\n");
        sb.append("    mountNewCreateDisks: ")
                .append(toIndentedString(mountNewCreateDisks))
                .append("\n");
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

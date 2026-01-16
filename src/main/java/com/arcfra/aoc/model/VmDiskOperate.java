package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** VmDiskOperate */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VmDiskOperate extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_REMOVE_DISKS = "remove_disks";

    @SerializedName(SERIALIZED_NAME_REMOVE_DISKS)
    private VmDiskOperateRemoveDisks removeDisks;

    public static final String SERIALIZED_NAME_MODIFY_DISKS = "modify_disks";

    @SerializedName(SERIALIZED_NAME_MODIFY_DISKS)
    private List<DiskOperateModifyDisk> modifyDisks = null;

    public static final String SERIALIZED_NAME_NEW_DISKS = "new_disks";

    @SerializedName(SERIALIZED_NAME_NEW_DISKS)
    private VmDiskParams newDisks;

    public VmDiskOperate() {}

    public VmDiskOperate removeDisks(VmDiskOperateRemoveDisks removeDisks) {

        this.removeDisks = removeDisks;
        return this;
    }

    /**
     * Get removeDisks
     *
     * @return removeDisks
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmDiskOperateRemoveDisks getRemoveDisks() {
        return removeDisks;
    }

    public void setRemoveDisks(VmDiskOperateRemoveDisks removeDisks) {
        this.removeDisks = removeDisks;
    }

    public VmDiskOperate removeDisks_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REMOVE_DISKS);
        return this;
    }

    public VmDiskOperate removeDisks_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REMOVE_DISKS);
        return this;
    }

    public void setRemoveDisks_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REMOVE_DISKS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REMOVE_DISKS);
        }
    }

    public boolean getRemoveDisks_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REMOVE_DISKS);
    }

    public VmDiskOperate modifyDisks(List<DiskOperateModifyDisk> modifyDisks) {

        this.modifyDisks = modifyDisks;
        return this;
    }

    public VmDiskOperate addModifyDisksItem(DiskOperateModifyDisk modifyDisksItem) {
        if (this.modifyDisks == null) {
            this.modifyDisks = new ArrayList<DiskOperateModifyDisk>();
        }
        this.modifyDisks.add(modifyDisksItem);
        return this;
    }

    /**
     * Get modifyDisks
     *
     * @return modifyDisks
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<DiskOperateModifyDisk> getModifyDisks() {
        return modifyDisks;
    }

    public void setModifyDisks(List<DiskOperateModifyDisk> modifyDisks) {
        this.modifyDisks = modifyDisks;
    }

    public VmDiskOperate modifyDisks_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MODIFY_DISKS);
        return this;
    }

    public VmDiskOperate modifyDisks_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MODIFY_DISKS);
        return this;
    }

    public void setModifyDisks_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MODIFY_DISKS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MODIFY_DISKS);
        }
    }

    public boolean getModifyDisks_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MODIFY_DISKS);
    }

    public VmDiskOperate newDisks(VmDiskParams newDisks) {

        this.newDisks = newDisks;
        return this;
    }

    /**
     * Get newDisks
     *
     * @return newDisks
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmDiskParams getNewDisks() {
        return newDisks;
    }

    public void setNewDisks(VmDiskParams newDisks) {
        this.newDisks = newDisks;
    }

    public VmDiskOperate newDisks_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NEW_DISKS);
        return this;
    }

    public VmDiskOperate newDisks_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NEW_DISKS);
        return this;
    }

    public void setNewDisks_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NEW_DISKS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NEW_DISKS);
        }
    }

    public boolean getNewDisks_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NEW_DISKS);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VmDiskOperate vmDiskOperate = (VmDiskOperate) o;
        return Objects.equals(this.removeDisks, vmDiskOperate.removeDisks)
                && Objects.equals(this.modifyDisks, vmDiskOperate.modifyDisks)
                && Objects.equals(this.newDisks, vmDiskOperate.newDisks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(removeDisks, modifyDisks, newDisks);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VmDiskOperate {\n");
        sb.append("    removeDisks: ").append(toIndentedString(removeDisks)).append("\n");
        sb.append("    modifyDisks: ").append(toIndentedString(modifyDisks)).append("\n");
        sb.append("    newDisks: ").append(toIndentedString(newDisks)).append("\n");
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

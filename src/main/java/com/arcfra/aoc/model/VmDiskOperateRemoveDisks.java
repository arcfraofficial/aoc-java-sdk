package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** VmDiskOperateRemoveDisks */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VmDiskOperateRemoveDisks
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_DISK_INDEX = "disk_index";

    @SerializedName(SERIALIZED_NAME_DISK_INDEX)
    private List<Integer> diskIndex = new ArrayList<Integer>();

    public VmDiskOperateRemoveDisks() {}

    public VmDiskOperateRemoveDisks diskIndex(List<Integer> diskIndex) {

        this.diskIndex = diskIndex;
        return this;
    }

    public VmDiskOperateRemoveDisks addDiskIndexItem(Integer diskIndexItem) {
        this.diskIndex.add(diskIndexItem);
        return this;
    }

    /**
     * Get diskIndex
     *
     * @return diskIndex
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public List<Integer> getDiskIndex() {
        return diskIndex;
    }

    public void setDiskIndex(List<Integer> diskIndex) {
        this.diskIndex = diskIndex;
    }

    public VmDiskOperateRemoveDisks diskIndex_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISK_INDEX);
        return this;
    }

    public VmDiskOperateRemoveDisks diskIndex_ExplictlyNonNull() {
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
        VmDiskOperateRemoveDisks vmDiskOperateRemoveDisks = (VmDiskOperateRemoveDisks) o;
        return Objects.equals(this.diskIndex, vmDiskOperateRemoveDisks.diskIndex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(diskIndex);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VmDiskOperateRemoveDisks {\n");
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

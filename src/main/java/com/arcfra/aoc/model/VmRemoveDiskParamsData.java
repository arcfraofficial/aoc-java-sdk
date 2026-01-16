package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** VmRemoveDiskParamsData */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VmRemoveDiskParamsData
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_DISK_IDS = "disk_ids";

    @SerializedName(SERIALIZED_NAME_DISK_IDS)
    private List<String> diskIds = new ArrayList<String>();

    public VmRemoveDiskParamsData() {}

    public VmRemoveDiskParamsData diskIds(List<String> diskIds) {

        this.diskIds = diskIds;
        return this;
    }

    public VmRemoveDiskParamsData addDiskIdsItem(String diskIdsItem) {
        this.diskIds.add(diskIdsItem);
        return this;
    }

    /**
     * Get diskIds
     *
     * @return diskIds
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public List<String> getDiskIds() {
        return diskIds;
    }

    public void setDiskIds(List<String> diskIds) {
        this.diskIds = diskIds;
    }

    public VmRemoveDiskParamsData diskIds_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISK_IDS);
        return this;
    }

    public VmRemoveDiskParamsData diskIds_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DISK_IDS);
        return this;
    }

    public void setDiskIds_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DISK_IDS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DISK_IDS);
        }
    }

    public boolean getDiskIds_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DISK_IDS);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VmRemoveDiskParamsData vmRemoveDiskParamsData = (VmRemoveDiskParamsData) o;
        return Objects.equals(this.diskIds, vmRemoveDiskParamsData.diskIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(diskIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VmRemoveDiskParamsData {\n");
        sb.append("    diskIds: ").append(toIndentedString(diskIds)).append("\n");
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

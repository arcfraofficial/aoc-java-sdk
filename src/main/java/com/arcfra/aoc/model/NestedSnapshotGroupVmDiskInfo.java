package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** NestedSnapshotGroupVmDiskInfo */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class NestedSnapshotGroupVmDiskInfo
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_DISK_ID = "disk_id";

    @SerializedName(SERIALIZED_NAME_DISK_ID)
    private String diskId;

    public static final String SERIALIZED_NAME_DISK_SNAPSHOT_STATUS = "disk_snapshot_status";

    @SerializedName(SERIALIZED_NAME_DISK_SNAPSHOT_STATUS)
    private ProtectSnapshotStatus diskSnapshotStatus;

    public NestedSnapshotGroupVmDiskInfo() {}

    public NestedSnapshotGroupVmDiskInfo diskId(String diskId) {

        this.diskId = diskId;
        return this;
    }

    /**
     * Get diskId
     *
     * @return diskId
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getDiskId() {
        return diskId;
    }

    public void setDiskId(String diskId) {
        this.diskId = diskId;
    }

    public NestedSnapshotGroupVmDiskInfo diskId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISK_ID);
        return this;
    }

    public NestedSnapshotGroupVmDiskInfo diskId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DISK_ID);
        return this;
    }

    public void setDiskId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DISK_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DISK_ID);
        }
    }

    public boolean getDiskId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DISK_ID);
    }

    public NestedSnapshotGroupVmDiskInfo diskSnapshotStatus(
            ProtectSnapshotStatus diskSnapshotStatus) {

        this.diskSnapshotStatus = diskSnapshotStatus;
        return this;
    }

    /**
     * Get diskSnapshotStatus
     *
     * @return diskSnapshotStatus
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public ProtectSnapshotStatus getDiskSnapshotStatus() {
        return diskSnapshotStatus;
    }

    public void setDiskSnapshotStatus(ProtectSnapshotStatus diskSnapshotStatus) {
        this.diskSnapshotStatus = diskSnapshotStatus;
    }

    public NestedSnapshotGroupVmDiskInfo diskSnapshotStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISK_SNAPSHOT_STATUS);
        return this;
    }

    public NestedSnapshotGroupVmDiskInfo diskSnapshotStatus_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DISK_SNAPSHOT_STATUS);
        return this;
    }

    public void setDiskSnapshotStatus_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DISK_SNAPSHOT_STATUS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DISK_SNAPSHOT_STATUS);
        }
    }

    public boolean getDiskSnapshotStatus_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DISK_SNAPSHOT_STATUS);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NestedSnapshotGroupVmDiskInfo nestedSnapshotGroupVmDiskInfo =
                (NestedSnapshotGroupVmDiskInfo) o;
        return Objects.equals(this.diskId, nestedSnapshotGroupVmDiskInfo.diskId)
                && Objects.equals(
                        this.diskSnapshotStatus, nestedSnapshotGroupVmDiskInfo.diskSnapshotStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(diskId, diskSnapshotStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NestedSnapshotGroupVmDiskInfo {\n");
        sb.append("    diskId: ").append(toIndentedString(diskId)).append("\n");
        sb.append("    diskSnapshotStatus: ")
                .append(toIndentedString(diskSnapshotStatus))
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

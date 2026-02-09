package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** NestedSnapshotGroupVmInfo */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class NestedSnapshotGroupVmInfo
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_DISKS = "disks";

    @SerializedName(SERIALIZED_NAME_DISKS)
    private List<NestedSnapshotGroupVmDiskInfo> disks =
            new ArrayList<NestedSnapshotGroupVmDiskInfo>();

    public static final String SERIALIZED_NAME_VM_ID = "vm_id";

    @SerializedName(SERIALIZED_NAME_VM_ID)
    private String vmId;

    public static final String SERIALIZED_NAME_VM_NAME = "vm_name";

    @SerializedName(SERIALIZED_NAME_VM_NAME)
    private String vmName;

    public static final String SERIALIZED_NAME_VM_SNAPSHOT_STATUS = "vm_snapshot_status";

    @SerializedName(SERIALIZED_NAME_VM_SNAPSHOT_STATUS)
    private ProtectSnapshotStatus vmSnapshotStatus;

    public NestedSnapshotGroupVmInfo() {}

    public NestedSnapshotGroupVmInfo disks(List<NestedSnapshotGroupVmDiskInfo> disks) {

        this.disks = disks;
        return this;
    }

    public NestedSnapshotGroupVmInfo addDisksItem(NestedSnapshotGroupVmDiskInfo disksItem) {
        this.disks.add(disksItem);
        return this;
    }

    /**
     * Get disks
     *
     * @return disks
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public List<NestedSnapshotGroupVmDiskInfo> getDisks() {
        return disks;
    }

    public void setDisks(List<NestedSnapshotGroupVmDiskInfo> disks) {
        this.disks = disks;
    }

    public NestedSnapshotGroupVmInfo disks_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISKS);
        return this;
    }

    public NestedSnapshotGroupVmInfo disks_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DISKS);
        return this;
    }

    public void setDisks_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DISKS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DISKS);
        }
    }

    public boolean getDisks_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DISKS);
    }

    public NestedSnapshotGroupVmInfo vmId(String vmId) {

        this.vmId = vmId;
        return this;
    }

    /**
     * Get vmId
     *
     * @return vmId
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getVmId() {
        return vmId;
    }

    public void setVmId(String vmId) {
        this.vmId = vmId;
    }

    public NestedSnapshotGroupVmInfo vmId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_ID);
        return this;
    }

    public NestedSnapshotGroupVmInfo vmId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_ID);
        return this;
    }

    public void setVmId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_ID);
        }
    }

    public boolean getVmId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_ID);
    }

    public NestedSnapshotGroupVmInfo vmName(String vmName) {

        this.vmName = vmName;
        return this;
    }

    /**
     * Get vmName
     *
     * @return vmName
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getVmName() {
        return vmName;
    }

    public void setVmName(String vmName) {
        this.vmName = vmName;
    }

    public NestedSnapshotGroupVmInfo vmName_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_NAME);
        return this;
    }

    public NestedSnapshotGroupVmInfo vmName_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_NAME);
        return this;
    }

    public void setVmName_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_NAME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_NAME);
        }
    }

    public boolean getVmName_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_NAME);
    }

    public NestedSnapshotGroupVmInfo vmSnapshotStatus(ProtectSnapshotStatus vmSnapshotStatus) {

        this.vmSnapshotStatus = vmSnapshotStatus;
        return this;
    }

    /**
     * Get vmSnapshotStatus
     *
     * @return vmSnapshotStatus
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public ProtectSnapshotStatus getVmSnapshotStatus() {
        return vmSnapshotStatus;
    }

    public void setVmSnapshotStatus(ProtectSnapshotStatus vmSnapshotStatus) {
        this.vmSnapshotStatus = vmSnapshotStatus;
    }

    public NestedSnapshotGroupVmInfo vmSnapshotStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_SNAPSHOT_STATUS);
        return this;
    }

    public NestedSnapshotGroupVmInfo vmSnapshotStatus_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_SNAPSHOT_STATUS);
        return this;
    }

    public void setVmSnapshotStatus_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_SNAPSHOT_STATUS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_SNAPSHOT_STATUS);
        }
    }

    public boolean getVmSnapshotStatus_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_SNAPSHOT_STATUS);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NestedSnapshotGroupVmInfo nestedSnapshotGroupVmInfo = (NestedSnapshotGroupVmInfo) o;
        return Objects.equals(this.disks, nestedSnapshotGroupVmInfo.disks)
                && Objects.equals(this.vmId, nestedSnapshotGroupVmInfo.vmId)
                && Objects.equals(this.vmName, nestedSnapshotGroupVmInfo.vmName)
                && Objects.equals(
                        this.vmSnapshotStatus, nestedSnapshotGroupVmInfo.vmSnapshotStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(disks, vmId, vmName, vmSnapshotStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NestedSnapshotGroupVmInfo {\n");
        sb.append("    disks: ").append(toIndentedString(disks)).append("\n");
        sb.append("    vmId: ").append(toIndentedString(vmId)).append("\n");
        sb.append("    vmName: ").append(toIndentedString(vmName)).append("\n");
        sb.append("    vmSnapshotStatus: ").append(toIndentedString(vmSnapshotStatus)).append("\n");
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

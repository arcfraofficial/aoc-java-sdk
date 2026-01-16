package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** OvfDiskOperate */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class OvfDiskOperate extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_NEW_DISKS = "new_disks";

    @SerializedName(SERIALIZED_NAME_NEW_DISKS)
    private VmDiskParams newDisks;

    public static final String SERIALIZED_NAME_MODIFY_CD_ROMS = "modify_cd_roms";

    @SerializedName(SERIALIZED_NAME_MODIFY_CD_ROMS)
    private List<VmdkCdromModify> modifyCdRoms = null;

    public static final String SERIALIZED_NAME_MODIFY_VMDK_DISKS = "modify_vmdk_disks";

    @SerializedName(SERIALIZED_NAME_MODIFY_VMDK_DISKS)
    private List<VmdkDiskModify> modifyVmdkDisks = null;

    public OvfDiskOperate() {}

    public OvfDiskOperate newDisks(VmDiskParams newDisks) {

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

    public OvfDiskOperate newDisks_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NEW_DISKS);
        return this;
    }

    public OvfDiskOperate newDisks_ExplictlyNonNull() {
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

    public OvfDiskOperate modifyCdRoms(List<VmdkCdromModify> modifyCdRoms) {

        this.modifyCdRoms = modifyCdRoms;
        return this;
    }

    public OvfDiskOperate addModifyCdRomsItem(VmdkCdromModify modifyCdRomsItem) {
        if (this.modifyCdRoms == null) {
            this.modifyCdRoms = new ArrayList<VmdkCdromModify>();
        }
        this.modifyCdRoms.add(modifyCdRomsItem);
        return this;
    }

    /**
     * Get modifyCdRoms
     *
     * @return modifyCdRoms
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<VmdkCdromModify> getModifyCdRoms() {
        return modifyCdRoms;
    }

    public void setModifyCdRoms(List<VmdkCdromModify> modifyCdRoms) {
        this.modifyCdRoms = modifyCdRoms;
    }

    public OvfDiskOperate modifyCdRoms_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MODIFY_CD_ROMS);
        return this;
    }

    public OvfDiskOperate modifyCdRoms_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MODIFY_CD_ROMS);
        return this;
    }

    public void setModifyCdRoms_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MODIFY_CD_ROMS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MODIFY_CD_ROMS);
        }
    }

    public boolean getModifyCdRoms_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MODIFY_CD_ROMS);
    }

    public OvfDiskOperate modifyVmdkDisks(List<VmdkDiskModify> modifyVmdkDisks) {

        this.modifyVmdkDisks = modifyVmdkDisks;
        return this;
    }

    public OvfDiskOperate addModifyVmdkDisksItem(VmdkDiskModify modifyVmdkDisksItem) {
        if (this.modifyVmdkDisks == null) {
            this.modifyVmdkDisks = new ArrayList<VmdkDiskModify>();
        }
        this.modifyVmdkDisks.add(modifyVmdkDisksItem);
        return this;
    }

    /**
     * Get modifyVmdkDisks
     *
     * @return modifyVmdkDisks
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<VmdkDiskModify> getModifyVmdkDisks() {
        return modifyVmdkDisks;
    }

    public void setModifyVmdkDisks(List<VmdkDiskModify> modifyVmdkDisks) {
        this.modifyVmdkDisks = modifyVmdkDisks;
    }

    public OvfDiskOperate modifyVmdkDisks_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MODIFY_VMDK_DISKS);
        return this;
    }

    public OvfDiskOperate modifyVmdkDisks_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MODIFY_VMDK_DISKS);
        return this;
    }

    public void setModifyVmdkDisks_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MODIFY_VMDK_DISKS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MODIFY_VMDK_DISKS);
        }
    }

    public boolean getModifyVmdkDisks_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MODIFY_VMDK_DISKS);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OvfDiskOperate ovfDiskOperate = (OvfDiskOperate) o;
        return Objects.equals(this.newDisks, ovfDiskOperate.newDisks)
                && Objects.equals(this.modifyCdRoms, ovfDiskOperate.modifyCdRoms)
                && Objects.equals(this.modifyVmdkDisks, ovfDiskOperate.modifyVmdkDisks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(newDisks, modifyCdRoms, modifyVmdkDisks);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OvfDiskOperate {\n");
        sb.append("    newDisks: ").append(toIndentedString(newDisks)).append("\n");
        sb.append("    modifyCdRoms: ").append(toIndentedString(modifyCdRoms)).append("\n");
        sb.append("    modifyVmdkDisks: ").append(toIndentedString(modifyVmdkDisks)).append("\n");
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

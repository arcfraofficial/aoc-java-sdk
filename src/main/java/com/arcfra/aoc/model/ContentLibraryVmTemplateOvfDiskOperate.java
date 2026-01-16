package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** ContentLibraryVmTemplateOvfDiskOperate */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class ContentLibraryVmTemplateOvfDiskOperate
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_MOUNT_NEW_CD_ROMS = "mount_new_cd_roms";

    @SerializedName(SERIALIZED_NAME_MOUNT_NEW_CD_ROMS)
    private List<ContentLibraryVmdkCdromMount> mountNewCdRoms = null;

    public static final String SERIALIZED_NAME_MODIFY_CD_ROMS = "modify_cd_roms";

    @SerializedName(SERIALIZED_NAME_MODIFY_CD_ROMS)
    private List<ContentLibraryVmdkCdromModify> modifyCdRoms = null;

    public static final String SERIALIZED_NAME_MODIFY_VMDK_DISKS = "modify_vmdk_disks";

    @SerializedName(SERIALIZED_NAME_MODIFY_VMDK_DISKS)
    private List<VmdkDiskModify> modifyVmdkDisks = null;

    public ContentLibraryVmTemplateOvfDiskOperate() {}

    public ContentLibraryVmTemplateOvfDiskOperate mountNewCdRoms(
            List<ContentLibraryVmdkCdromMount> mountNewCdRoms) {

        this.mountNewCdRoms = mountNewCdRoms;
        return this;
    }

    public ContentLibraryVmTemplateOvfDiskOperate addMountNewCdRomsItem(
            ContentLibraryVmdkCdromMount mountNewCdRomsItem) {
        if (this.mountNewCdRoms == null) {
            this.mountNewCdRoms = new ArrayList<ContentLibraryVmdkCdromMount>();
        }
        this.mountNewCdRoms.add(mountNewCdRomsItem);
        return this;
    }

    /**
     * Get mountNewCdRoms
     *
     * @return mountNewCdRoms
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<ContentLibraryVmdkCdromMount> getMountNewCdRoms() {
        return mountNewCdRoms;
    }

    public void setMountNewCdRoms(List<ContentLibraryVmdkCdromMount> mountNewCdRoms) {
        this.mountNewCdRoms = mountNewCdRoms;
    }

    public ContentLibraryVmTemplateOvfDiskOperate mountNewCdRoms_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MOUNT_NEW_CD_ROMS);
        return this;
    }

    public ContentLibraryVmTemplateOvfDiskOperate mountNewCdRoms_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MOUNT_NEW_CD_ROMS);
        return this;
    }

    public void setMountNewCdRoms_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MOUNT_NEW_CD_ROMS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MOUNT_NEW_CD_ROMS);
        }
    }

    public boolean getMountNewCdRoms_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MOUNT_NEW_CD_ROMS);
    }

    public ContentLibraryVmTemplateOvfDiskOperate modifyCdRoms(
            List<ContentLibraryVmdkCdromModify> modifyCdRoms) {

        this.modifyCdRoms = modifyCdRoms;
        return this;
    }

    public ContentLibraryVmTemplateOvfDiskOperate addModifyCdRomsItem(
            ContentLibraryVmdkCdromModify modifyCdRomsItem) {
        if (this.modifyCdRoms == null) {
            this.modifyCdRoms = new ArrayList<ContentLibraryVmdkCdromModify>();
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
    public List<ContentLibraryVmdkCdromModify> getModifyCdRoms() {
        return modifyCdRoms;
    }

    public void setModifyCdRoms(List<ContentLibraryVmdkCdromModify> modifyCdRoms) {
        this.modifyCdRoms = modifyCdRoms;
    }

    public ContentLibraryVmTemplateOvfDiskOperate modifyCdRoms_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MODIFY_CD_ROMS);
        return this;
    }

    public ContentLibraryVmTemplateOvfDiskOperate modifyCdRoms_ExplictlyNonNull() {
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

    public ContentLibraryVmTemplateOvfDiskOperate modifyVmdkDisks(
            List<VmdkDiskModify> modifyVmdkDisks) {

        this.modifyVmdkDisks = modifyVmdkDisks;
        return this;
    }

    public ContentLibraryVmTemplateOvfDiskOperate addModifyVmdkDisksItem(
            VmdkDiskModify modifyVmdkDisksItem) {
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

    public ContentLibraryVmTemplateOvfDiskOperate modifyVmdkDisks_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MODIFY_VMDK_DISKS);
        return this;
    }

    public ContentLibraryVmTemplateOvfDiskOperate modifyVmdkDisks_ExplictlyNonNull() {
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
        ContentLibraryVmTemplateOvfDiskOperate contentLibraryVmTemplateOvfDiskOperate =
                (ContentLibraryVmTemplateOvfDiskOperate) o;
        return Objects.equals(
                        this.mountNewCdRoms, contentLibraryVmTemplateOvfDiskOperate.mountNewCdRoms)
                && Objects.equals(
                        this.modifyCdRoms, contentLibraryVmTemplateOvfDiskOperate.modifyCdRoms)
                && Objects.equals(
                        this.modifyVmdkDisks,
                        contentLibraryVmTemplateOvfDiskOperate.modifyVmdkDisks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mountNewCdRoms, modifyCdRoms, modifyVmdkDisks);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ContentLibraryVmTemplateOvfDiskOperate {\n");
        sb.append("    mountNewCdRoms: ").append(toIndentedString(mountNewCdRoms)).append("\n");
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

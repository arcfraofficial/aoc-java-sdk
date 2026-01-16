package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** VmdkCdromModify */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VmdkCdromModify extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_REMOVED = "removed";

    @SerializedName(SERIALIZED_NAME_REMOVED)
    private Boolean removed;

    public static final String SERIALIZED_NAME_CONTENT_LIBRARY_IMAGE_ID =
            "content_library_image_id";

    @SerializedName(SERIALIZED_NAME_CONTENT_LIBRARY_IMAGE_ID)
    private String contentLibraryImageId;

    public static final String SERIALIZED_NAME_ELF_IMAGE_ID = "elf_image_id";

    @SerializedName(SERIALIZED_NAME_ELF_IMAGE_ID)
    private String elfImageId;

    public static final String SERIALIZED_NAME_BOOT = "boot";

    @SerializedName(SERIALIZED_NAME_BOOT)
    private Integer boot;

    public static final String SERIALIZED_NAME_INDEX = "index";

    @SerializedName(SERIALIZED_NAME_INDEX)
    private Integer index;

    public VmdkCdromModify() {}

    public VmdkCdromModify removed(Boolean removed) {

        this.removed = removed;
        return this;
    }

    /**
     * Get removed
     *
     * @return removed
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getRemoved() {
        return removed;
    }

    public void setRemoved(Boolean removed) {
        this.removed = removed;
    }

    public VmdkCdromModify removed_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REMOVED);
        return this;
    }

    public VmdkCdromModify removed_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REMOVED);
        return this;
    }

    public void setRemoved_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REMOVED);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REMOVED);
        }
    }

    public boolean getRemoved_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REMOVED);
    }

    public VmdkCdromModify contentLibraryImageId(String contentLibraryImageId) {

        this.contentLibraryImageId = contentLibraryImageId;
        return this;
    }

    /**
     * Get contentLibraryImageId
     *
     * @return contentLibraryImageId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getContentLibraryImageId() {
        return contentLibraryImageId;
    }

    public void setContentLibraryImageId(String contentLibraryImageId) {
        this.contentLibraryImageId = contentLibraryImageId;
    }

    public VmdkCdromModify contentLibraryImageId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CONTENT_LIBRARY_IMAGE_ID);
        return this;
    }

    public VmdkCdromModify contentLibraryImageId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CONTENT_LIBRARY_IMAGE_ID);
        return this;
    }

    public void setContentLibraryImageId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CONTENT_LIBRARY_IMAGE_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CONTENT_LIBRARY_IMAGE_ID);
        }
    }

    public boolean getContentLibraryImageId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CONTENT_LIBRARY_IMAGE_ID);
    }

    public VmdkCdromModify elfImageId(String elfImageId) {

        this.elfImageId = elfImageId;
        return this;
    }

    /**
     * Get elfImageId
     *
     * @return elfImageId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getElfImageId() {
        return elfImageId;
    }

    public void setElfImageId(String elfImageId) {
        this.elfImageId = elfImageId;
    }

    public VmdkCdromModify elfImageId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ELF_IMAGE_ID);
        return this;
    }

    public VmdkCdromModify elfImageId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ELF_IMAGE_ID);
        return this;
    }

    public void setElfImageId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ELF_IMAGE_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ELF_IMAGE_ID);
        }
    }

    public boolean getElfImageId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ELF_IMAGE_ID);
    }

    public VmdkCdromModify boot(Integer boot) {

        this.boot = boot;
        return this;
    }

    /**
     * Get boot
     *
     * @return boot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getBoot() {
        return boot;
    }

    public void setBoot(Integer boot) {
        this.boot = boot;
    }

    public VmdkCdromModify boot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BOOT);
        return this;
    }

    public VmdkCdromModify boot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BOOT);
        return this;
    }

    public void setBoot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BOOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BOOT);
        }
    }

    public boolean getBoot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BOOT);
    }

    public VmdkCdromModify index(Integer index) {

        this.index = index;
        return this;
    }

    /**
     * Get index
     *
     * @return index
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public VmdkCdromModify index_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INDEX);
        return this;
    }

    public VmdkCdromModify index_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INDEX);
        return this;
    }

    public void setIndex_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INDEX);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INDEX);
        }
    }

    public boolean getIndex_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INDEX);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VmdkCdromModify vmdkCdromModify = (VmdkCdromModify) o;
        return Objects.equals(this.removed, vmdkCdromModify.removed)
                && Objects.equals(this.contentLibraryImageId, vmdkCdromModify.contentLibraryImageId)
                && Objects.equals(this.elfImageId, vmdkCdromModify.elfImageId)
                && Objects.equals(this.boot, vmdkCdromModify.boot)
                && Objects.equals(this.index, vmdkCdromModify.index);
    }

    @Override
    public int hashCode() {
        return Objects.hash(removed, contentLibraryImageId, elfImageId, boot, index);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VmdkCdromModify {\n");
        sb.append("    removed: ").append(toIndentedString(removed)).append("\n");
        sb.append("    contentLibraryImageId: ")
                .append(toIndentedString(contentLibraryImageId))
                .append("\n");
        sb.append("    elfImageId: ").append(toIndentedString(elfImageId)).append("\n");
        sb.append("    boot: ").append(toIndentedString(boot)).append("\n");
        sb.append("    index: ").append(toIndentedString(index)).append("\n");
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

package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** ContentLibraryVmdkCdromModify */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class ContentLibraryVmdkCdromModify
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_ENABLED = "enabled";

    @SerializedName(SERIALIZED_NAME_ENABLED)
    private Boolean enabled;

    public static final String SERIALIZED_NAME_REMOVED = "removed";

    @SerializedName(SERIALIZED_NAME_REMOVED)
    private Boolean removed;

    public static final String SERIALIZED_NAME_BOOT = "boot";

    @SerializedName(SERIALIZED_NAME_BOOT)
    private Integer boot;

    public static final String SERIALIZED_NAME_INDEX = "index";

    @SerializedName(SERIALIZED_NAME_INDEX)
    private Integer index;

    public ContentLibraryVmdkCdromModify() {}

    public ContentLibraryVmdkCdromModify enabled(Boolean enabled) {

        this.enabled = enabled;
        return this;
    }

    /**
     * Get enabled
     *
     * @return enabled
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public ContentLibraryVmdkCdromModify enabled_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENABLED);
        return this;
    }

    public ContentLibraryVmdkCdromModify enabled_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ENABLED);
        return this;
    }

    public void setEnabled_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ENABLED);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ENABLED);
        }
    }

    public boolean getEnabled_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ENABLED);
    }

    public ContentLibraryVmdkCdromModify removed(Boolean removed) {

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

    public ContentLibraryVmdkCdromModify removed_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REMOVED);
        return this;
    }

    public ContentLibraryVmdkCdromModify removed_ExplictlyNonNull() {
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

    public ContentLibraryVmdkCdromModify boot(Integer boot) {

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

    public ContentLibraryVmdkCdromModify boot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BOOT);
        return this;
    }

    public ContentLibraryVmdkCdromModify boot_ExplictlyNonNull() {
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

    public ContentLibraryVmdkCdromModify index(Integer index) {

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

    public ContentLibraryVmdkCdromModify index_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INDEX);
        return this;
    }

    public ContentLibraryVmdkCdromModify index_ExplictlyNonNull() {
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
        ContentLibraryVmdkCdromModify contentLibraryVmdkCdromModify =
                (ContentLibraryVmdkCdromModify) o;
        return Objects.equals(this.enabled, contentLibraryVmdkCdromModify.enabled)
                && Objects.equals(this.removed, contentLibraryVmdkCdromModify.removed)
                && Objects.equals(this.boot, contentLibraryVmdkCdromModify.boot)
                && Objects.equals(this.index, contentLibraryVmdkCdromModify.index);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enabled, removed, boot, index);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ContentLibraryVmdkCdromModify {\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    removed: ").append(toIndentedString(removed)).append("\n");
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

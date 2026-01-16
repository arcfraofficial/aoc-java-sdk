package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** ContentLibraryVmdkCdromMount */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class ContentLibraryVmdkCdromMount
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_ENABLED = "enabled";

    @SerializedName(SERIALIZED_NAME_ENABLED)
    private Boolean enabled;

    public static final String SERIALIZED_NAME_BOOT = "boot";

    @SerializedName(SERIALIZED_NAME_BOOT)
    private Integer boot;

    public ContentLibraryVmdkCdromMount() {}

    public ContentLibraryVmdkCdromMount enabled(Boolean enabled) {

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

    public ContentLibraryVmdkCdromMount enabled_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENABLED);
        return this;
    }

    public ContentLibraryVmdkCdromMount enabled_ExplictlyNonNull() {
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

    public ContentLibraryVmdkCdromMount boot(Integer boot) {

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

    public ContentLibraryVmdkCdromMount boot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BOOT);
        return this;
    }

    public ContentLibraryVmdkCdromMount boot_ExplictlyNonNull() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ContentLibraryVmdkCdromMount contentLibraryVmdkCdromMount =
                (ContentLibraryVmdkCdromMount) o;
        return Objects.equals(this.enabled, contentLibraryVmdkCdromMount.enabled)
                && Objects.equals(this.boot, contentLibraryVmdkCdromMount.boot);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enabled, boot);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ContentLibraryVmdkCdromMount {\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    boot: ").append(toIndentedString(boot)).append("\n");
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

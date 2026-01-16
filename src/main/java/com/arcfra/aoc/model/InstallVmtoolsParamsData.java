package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/**
 * InstallVmtoolsParamsData
 *
 * @deprecated
 */
@Deprecated
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class InstallVmtoolsParamsData
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_SVT_IMAGE_ID = "svt_image_id";

    @SerializedName(SERIALIZED_NAME_SVT_IMAGE_ID)
    private String svtImageId;

    public static final String SERIALIZED_NAME_CD_ROM_ID = "cd_rom_id";

    @SerializedName(SERIALIZED_NAME_CD_ROM_ID)
    private String cdRomId;

    public InstallVmtoolsParamsData() {}

    public InstallVmtoolsParamsData svtImageId(String svtImageId) {

        this.svtImageId = svtImageId;
        return this;
    }

    /**
     * Get svtImageId
     *
     * @return svtImageId
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getSvtImageId() {
        return svtImageId;
    }

    public void setSvtImageId(String svtImageId) {
        this.svtImageId = svtImageId;
    }

    public InstallVmtoolsParamsData svtImageId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SVT_IMAGE_ID);
        return this;
    }

    public InstallVmtoolsParamsData svtImageId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SVT_IMAGE_ID);
        return this;
    }

    public void setSvtImageId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SVT_IMAGE_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SVT_IMAGE_ID);
        }
    }

    public boolean getSvtImageId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SVT_IMAGE_ID);
    }

    public InstallVmtoolsParamsData cdRomId(String cdRomId) {

        this.cdRomId = cdRomId;
        return this;
    }

    /**
     * Get cdRomId
     *
     * @return cdRomId
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getCdRomId() {
        return cdRomId;
    }

    public void setCdRomId(String cdRomId) {
        this.cdRomId = cdRomId;
    }

    public InstallVmtoolsParamsData cdRomId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CD_ROM_ID);
        return this;
    }

    public InstallVmtoolsParamsData cdRomId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CD_ROM_ID);
        return this;
    }

    public void setCdRomId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CD_ROM_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CD_ROM_ID);
        }
    }

    public boolean getCdRomId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CD_ROM_ID);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InstallVmtoolsParamsData installVmtoolsParamsData = (InstallVmtoolsParamsData) o;
        return Objects.equals(this.svtImageId, installVmtoolsParamsData.svtImageId)
                && Objects.equals(this.cdRomId, installVmtoolsParamsData.cdRomId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(svtImageId, cdRomId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstallVmtoolsParamsData {\n");
        sb.append("    svtImageId: ").append(toIndentedString(svtImageId)).append("\n");
        sb.append("    cdRomId: ").append(toIndentedString(cdRomId)).append("\n");
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

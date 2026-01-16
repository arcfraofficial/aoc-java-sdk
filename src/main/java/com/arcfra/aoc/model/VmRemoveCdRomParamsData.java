package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** VmRemoveCdRomParamsData */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VmRemoveCdRomParamsData
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_CD_ROM_IDS = "cd_rom_ids";

    @SerializedName(SERIALIZED_NAME_CD_ROM_IDS)
    private List<String> cdRomIds = new ArrayList<String>();

    public VmRemoveCdRomParamsData() {}

    public VmRemoveCdRomParamsData cdRomIds(List<String> cdRomIds) {

        this.cdRomIds = cdRomIds;
        return this;
    }

    public VmRemoveCdRomParamsData addCdRomIdsItem(String cdRomIdsItem) {
        this.cdRomIds.add(cdRomIdsItem);
        return this;
    }

    /**
     * Get cdRomIds
     *
     * @return cdRomIds
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public List<String> getCdRomIds() {
        return cdRomIds;
    }

    public void setCdRomIds(List<String> cdRomIds) {
        this.cdRomIds = cdRomIds;
    }

    public VmRemoveCdRomParamsData cdRomIds_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CD_ROM_IDS);
        return this;
    }

    public VmRemoveCdRomParamsData cdRomIds_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CD_ROM_IDS);
        return this;
    }

    public void setCdRomIds_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CD_ROM_IDS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CD_ROM_IDS);
        }
    }

    public boolean getCdRomIds_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CD_ROM_IDS);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VmRemoveCdRomParamsData vmRemoveCdRomParamsData = (VmRemoveCdRomParamsData) o;
        return Objects.equals(this.cdRomIds, vmRemoveCdRomParamsData.cdRomIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cdRomIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VmRemoveCdRomParamsData {\n");
        sb.append("    cdRomIds: ").append(toIndentedString(cdRomIds)).append("\n");
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

package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** VmAddCdRomParamsData */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VmAddCdRomParamsData
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_VM_CD_ROMS = "vm_cd_roms";

    @SerializedName(SERIALIZED_NAME_VM_CD_ROMS)
    private List<VmCdRomParams> vmCdRoms = new ArrayList<VmCdRomParams>();

    public VmAddCdRomParamsData() {}

    public VmAddCdRomParamsData vmCdRoms(List<VmCdRomParams> vmCdRoms) {

        this.vmCdRoms = vmCdRoms;
        return this;
    }

    public VmAddCdRomParamsData addVmCdRomsItem(VmCdRomParams vmCdRomsItem) {
        this.vmCdRoms.add(vmCdRomsItem);
        return this;
    }

    /**
     * Get vmCdRoms
     *
     * @return vmCdRoms
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public List<VmCdRomParams> getVmCdRoms() {
        return vmCdRoms;
    }

    public void setVmCdRoms(List<VmCdRomParams> vmCdRoms) {
        this.vmCdRoms = vmCdRoms;
    }

    public VmAddCdRomParamsData vmCdRoms_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_CD_ROMS);
        return this;
    }

    public VmAddCdRomParamsData vmCdRoms_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_CD_ROMS);
        return this;
    }

    public void setVmCdRoms_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_CD_ROMS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_CD_ROMS);
        }
    }

    public boolean getVmCdRoms_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_CD_ROMS);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VmAddCdRomParamsData vmAddCdRomParamsData = (VmAddCdRomParamsData) o;
        return Objects.equals(this.vmCdRoms, vmAddCdRomParamsData.vmCdRoms);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vmCdRoms);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VmAddCdRomParamsData {\n");
        sb.append("    vmCdRoms: ").append(toIndentedString(vmCdRoms)).append("\n");
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

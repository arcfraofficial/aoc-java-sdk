package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** VmAddNicParamsData */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VmAddNicParamsData extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_VM_NICS = "vm_nics";

    @SerializedName(SERIALIZED_NAME_VM_NICS)
    private List<VmNicParams> vmNics = new ArrayList<VmNicParams>();

    public VmAddNicParamsData() {}

    public VmAddNicParamsData vmNics(List<VmNicParams> vmNics) {

        this.vmNics = vmNics;
        return this;
    }

    public VmAddNicParamsData addVmNicsItem(VmNicParams vmNicsItem) {
        this.vmNics.add(vmNicsItem);
        return this;
    }

    /**
     * Get vmNics
     *
     * @return vmNics
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public List<VmNicParams> getVmNics() {
        return vmNics;
    }

    public void setVmNics(List<VmNicParams> vmNics) {
        this.vmNics = vmNics;
    }

    public VmAddNicParamsData vmNics_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_NICS);
        return this;
    }

    public VmAddNicParamsData vmNics_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_NICS);
        return this;
    }

    public void setVmNics_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_NICS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_NICS);
        }
    }

    public boolean getVmNics_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_NICS);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VmAddNicParamsData vmAddNicParamsData = (VmAddNicParamsData) o;
        return Objects.equals(this.vmNics, vmAddNicParamsData.vmNics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vmNics);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VmAddNicParamsData {\n");
        sb.append("    vmNics: ").append(toIndentedString(vmNics)).append("\n");
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

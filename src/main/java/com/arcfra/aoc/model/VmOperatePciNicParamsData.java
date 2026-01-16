package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** VmOperatePciNicParamsData */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VmOperatePciNicParamsData
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_PCI_NICS = "pci_nics";

    @SerializedName(SERIALIZED_NAME_PCI_NICS)
    private NicWhereInput pciNics;

    public VmOperatePciNicParamsData() {}

    public VmOperatePciNicParamsData pciNics(NicWhereInput pciNics) {

        this.pciNics = pciNics;
        return this;
    }

    /**
     * Get pciNics
     *
     * @return pciNics
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NicWhereInput getPciNics() {
        return pciNics;
    }

    public void setPciNics(NicWhereInput pciNics) {
        this.pciNics = pciNics;
    }

    public VmOperatePciNicParamsData pciNics_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PCI_NICS);
        return this;
    }

    public VmOperatePciNicParamsData pciNics_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PCI_NICS);
        return this;
    }

    public void setPciNics_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PCI_NICS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PCI_NICS);
        }
    }

    public boolean getPciNics_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PCI_NICS);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VmOperatePciNicParamsData vmOperatePciNicParamsData = (VmOperatePciNicParamsData) o;
        return Objects.equals(this.pciNics, vmOperatePciNicParamsData.pciNics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pciNics);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VmOperatePciNicParamsData {\n");
        sb.append("    pciNics: ").append(toIndentedString(pciNics)).append("\n");
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

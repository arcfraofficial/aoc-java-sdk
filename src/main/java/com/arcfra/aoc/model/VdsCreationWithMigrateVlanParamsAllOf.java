package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** VdsCreationWithMigrateVlanParamsAllOf */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VdsCreationWithMigrateVlanParamsAllOf
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_VLAN = "vlan";

    @SerializedName(SERIALIZED_NAME_VLAN)
    private VdsCreationWithMigrateVlanParamsAllOfVlan vlan;

    public VdsCreationWithMigrateVlanParamsAllOf() {}

    public VdsCreationWithMigrateVlanParamsAllOf vlan(
            VdsCreationWithMigrateVlanParamsAllOfVlan vlan) {

        this.vlan = vlan;
        return this;
    }

    /**
     * Get vlan
     *
     * @return vlan
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public VdsCreationWithMigrateVlanParamsAllOfVlan getVlan() {
        return vlan;
    }

    public void setVlan(VdsCreationWithMigrateVlanParamsAllOfVlan vlan) {
        this.vlan = vlan;
    }

    public VdsCreationWithMigrateVlanParamsAllOf vlan_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VLAN);
        return this;
    }

    public VdsCreationWithMigrateVlanParamsAllOf vlan_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VLAN);
        return this;
    }

    public void setVlan_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VLAN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VLAN);
        }
    }

    public boolean getVlan_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VLAN);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VdsCreationWithMigrateVlanParamsAllOf vdsCreationWithMigrateVlanParamsAllOf =
                (VdsCreationWithMigrateVlanParamsAllOf) o;
        return Objects.equals(this.vlan, vdsCreationWithMigrateVlanParamsAllOf.vlan);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vlan);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VdsCreationWithMigrateVlanParamsAllOf {\n");
        sb.append("    vlan: ").append(toIndentedString(vlan)).append("\n");
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

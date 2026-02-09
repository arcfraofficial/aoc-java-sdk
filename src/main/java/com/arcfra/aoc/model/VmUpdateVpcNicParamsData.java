package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** VmUpdateVpcNicParamsData */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VmUpdateVpcNicParamsData
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_VPC_NIC = "vpc_nic";

    @SerializedName(SERIALIZED_NAME_VPC_NIC)
    private UpdateVpcNicPayloads vpcNic;

    public VmUpdateVpcNicParamsData() {}

    public VmUpdateVpcNicParamsData vpcNic(UpdateVpcNicPayloads vpcNic) {

        this.vpcNic = vpcNic;
        return this;
    }

    /**
     * Get vpcNic
     *
     * @return vpcNic
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public UpdateVpcNicPayloads getVpcNic() {
        return vpcNic;
    }

    public void setVpcNic(UpdateVpcNicPayloads vpcNic) {
        this.vpcNic = vpcNic;
    }

    public VmUpdateVpcNicParamsData vpcNic_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VPC_NIC);
        return this;
    }

    public VmUpdateVpcNicParamsData vpcNic_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VPC_NIC);
        return this;
    }

    public void setVpcNic_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VPC_NIC);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VPC_NIC);
        }
    }

    public boolean getVpcNic_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VPC_NIC);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VmUpdateVpcNicParamsData vmUpdateVpcNicParamsData = (VmUpdateVpcNicParamsData) o;
        return Objects.equals(this.vpcNic, vmUpdateVpcNicParamsData.vpcNic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vpcNic);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VmUpdateVpcNicParamsData {\n");
        sb.append("    vpcNic: ").append(toIndentedString(vpcNic)).append("\n");
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

package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** NestedTemplateVpcNic */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class NestedTemplateVpcNic
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_USE_FLOATING_IP = "use_floating_ip";

    @SerializedName(SERIALIZED_NAME_USE_FLOATING_IP)
    private Boolean useFloatingIp;

    public static final String SERIALIZED_NAME_VPC_LOCAL_ID = "vpc_local_id";

    @SerializedName(SERIALIZED_NAME_VPC_LOCAL_ID)
    private String vpcLocalId;

    public static final String SERIALIZED_NAME_VPC_SUBNET_LOCAL_ID = "vpc_subnet_local_id";

    @SerializedName(SERIALIZED_NAME_VPC_SUBNET_LOCAL_ID)
    private String vpcSubnetLocalId;

    public NestedTemplateVpcNic() {}

    public NestedTemplateVpcNic useFloatingIp(Boolean useFloatingIp) {

        this.useFloatingIp = useFloatingIp;
        return this;
    }

    /**
     * Get useFloatingIp
     *
     * @return useFloatingIp
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Boolean getUseFloatingIp() {
        return useFloatingIp;
    }

    public void setUseFloatingIp(Boolean useFloatingIp) {
        this.useFloatingIp = useFloatingIp;
    }

    public NestedTemplateVpcNic useFloatingIp_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USE_FLOATING_IP);
        return this;
    }

    public NestedTemplateVpcNic useFloatingIp_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USE_FLOATING_IP);
        return this;
    }

    public void setUseFloatingIp_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USE_FLOATING_IP);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USE_FLOATING_IP);
        }
    }

    public boolean getUseFloatingIp_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USE_FLOATING_IP);
    }

    public NestedTemplateVpcNic vpcLocalId(String vpcLocalId) {

        this.vpcLocalId = vpcLocalId;
        return this;
    }

    /**
     * Get vpcLocalId
     *
     * @return vpcLocalId
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getVpcLocalId() {
        return vpcLocalId;
    }

    public void setVpcLocalId(String vpcLocalId) {
        this.vpcLocalId = vpcLocalId;
    }

    public NestedTemplateVpcNic vpcLocalId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VPC_LOCAL_ID);
        return this;
    }

    public NestedTemplateVpcNic vpcLocalId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VPC_LOCAL_ID);
        return this;
    }

    public void setVpcLocalId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VPC_LOCAL_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VPC_LOCAL_ID);
        }
    }

    public boolean getVpcLocalId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VPC_LOCAL_ID);
    }

    public NestedTemplateVpcNic vpcSubnetLocalId(String vpcSubnetLocalId) {

        this.vpcSubnetLocalId = vpcSubnetLocalId;
        return this;
    }

    /**
     * Get vpcSubnetLocalId
     *
     * @return vpcSubnetLocalId
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getVpcSubnetLocalId() {
        return vpcSubnetLocalId;
    }

    public void setVpcSubnetLocalId(String vpcSubnetLocalId) {
        this.vpcSubnetLocalId = vpcSubnetLocalId;
    }

    public NestedTemplateVpcNic vpcSubnetLocalId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VPC_SUBNET_LOCAL_ID);
        return this;
    }

    public NestedTemplateVpcNic vpcSubnetLocalId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VPC_SUBNET_LOCAL_ID);
        return this;
    }

    public void setVpcSubnetLocalId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VPC_SUBNET_LOCAL_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VPC_SUBNET_LOCAL_ID);
        }
    }

    public boolean getVpcSubnetLocalId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VPC_SUBNET_LOCAL_ID);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NestedTemplateVpcNic nestedTemplateVpcNic = (NestedTemplateVpcNic) o;
        return Objects.equals(this.useFloatingIp, nestedTemplateVpcNic.useFloatingIp)
                && Objects.equals(this.vpcLocalId, nestedTemplateVpcNic.vpcLocalId)
                && Objects.equals(this.vpcSubnetLocalId, nestedTemplateVpcNic.vpcSubnetLocalId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(useFloatingIp, vpcLocalId, vpcSubnetLocalId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NestedTemplateVpcNic {\n");
        sb.append("    useFloatingIp: ").append(toIndentedString(useFloatingIp)).append("\n");
        sb.append("    vpcLocalId: ").append(toIndentedString(vpcLocalId)).append("\n");
        sb.append("    vpcSubnetLocalId: ").append(toIndentedString(vpcSubnetLocalId)).append("\n");
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

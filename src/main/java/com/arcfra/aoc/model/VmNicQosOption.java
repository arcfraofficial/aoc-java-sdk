package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** VmNicQosOption */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VmNicQosOption extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_EGRESS = "egress";

    @SerializedName(SERIALIZED_NAME_EGRESS)
    private VmNicQosTraffic egress;

    public static final String SERIALIZED_NAME_INGRESS = "ingress";

    @SerializedName(SERIALIZED_NAME_INGRESS)
    private VmNicQosTraffic ingress;

    public VmNicQosOption() {}

    public VmNicQosOption egress(VmNicQosTraffic egress) {

        this.egress = egress;
        return this;
    }

    /**
     * Get egress
     *
     * @return egress
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmNicQosTraffic getEgress() {
        return egress;
    }

    public void setEgress(VmNicQosTraffic egress) {
        this.egress = egress;
    }

    public VmNicQosOption egress_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EGRESS);
        return this;
    }

    public VmNicQosOption egress_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EGRESS);
        return this;
    }

    public void setEgress_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EGRESS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EGRESS);
        }
    }

    public boolean getEgress_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EGRESS);
    }

    public VmNicQosOption ingress(VmNicQosTraffic ingress) {

        this.ingress = ingress;
        return this;
    }

    /**
     * Get ingress
     *
     * @return ingress
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmNicQosTraffic getIngress() {
        return ingress;
    }

    public void setIngress(VmNicQosTraffic ingress) {
        this.ingress = ingress;
    }

    public VmNicQosOption ingress_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INGRESS);
        return this;
    }

    public VmNicQosOption ingress_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INGRESS);
        return this;
    }

    public void setIngress_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INGRESS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INGRESS);
        }
    }

    public boolean getIngress_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INGRESS);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VmNicQosOption vmNicQosOption = (VmNicQosOption) o;
        return Objects.equals(this.egress, vmNicQosOption.egress)
                && Objects.equals(this.ingress, vmNicQosOption.ingress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(egress, ingress);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VmNicQosOption {\n");
        sb.append("    egress: ").append(toIndentedString(egress)).append("\n");
        sb.append("    ingress: ").append(toIndentedString(ingress)).append("\n");
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

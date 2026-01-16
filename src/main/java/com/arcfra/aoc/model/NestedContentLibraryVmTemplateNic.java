package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Arrays;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** NestedContentLibraryVmTemplateNic */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class NestedContentLibraryVmTemplateNic
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_EGRESS_RATE_LIMIT_BURST_IN_BIT =
            "egress_rate_limit_burst_in_bit";

    @SerializedName(SERIALIZED_NAME_EGRESS_RATE_LIMIT_BURST_IN_BIT)
    private Double egressRateLimitBurstInBit;

    public static final String SERIALIZED_NAME_EGRESS_RATE_LIMIT_ENABLED =
            "egress_rate_limit_enabled";

    @SerializedName(SERIALIZED_NAME_EGRESS_RATE_LIMIT_ENABLED)
    private Boolean egressRateLimitEnabled;

    public static final String SERIALIZED_NAME_EGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS =
            "egress_rate_limit_max_rate_in_bitps";

    @SerializedName(SERIALIZED_NAME_EGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS)
    private Double egressRateLimitMaxRateInBitps;

    public static final String SERIALIZED_NAME_ENABLED = "enabled";

    @SerializedName(SERIALIZED_NAME_ENABLED)
    private Boolean enabled;

    public static final String SERIALIZED_NAME_INDEX = "index";

    @SerializedName(SERIALIZED_NAME_INDEX)
    private Integer index;

    public static final String SERIALIZED_NAME_INGRESS_RATE_LIMIT_BURST_IN_BIT =
            "ingress_rate_limit_burst_in_bit";

    @SerializedName(SERIALIZED_NAME_INGRESS_RATE_LIMIT_BURST_IN_BIT)
    private Double ingressRateLimitBurstInBit;

    public static final String SERIALIZED_NAME_INGRESS_RATE_LIMIT_ENABLED =
            "ingress_rate_limit_enabled";

    @SerializedName(SERIALIZED_NAME_INGRESS_RATE_LIMIT_ENABLED)
    private Boolean ingressRateLimitEnabled;

    public static final String SERIALIZED_NAME_INGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS =
            "ingress_rate_limit_max_rate_in_bitps";

    @SerializedName(SERIALIZED_NAME_INGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS)
    private Double ingressRateLimitMaxRateInBitps;

    public static final String SERIALIZED_NAME_MIRROR = "mirror";

    @SerializedName(SERIALIZED_NAME_MIRROR)
    private Boolean mirror;

    public static final String SERIALIZED_NAME_MODEL = "model";

    @SerializedName(SERIALIZED_NAME_MODEL)
    private VmNicModel model;

    public static final String SERIALIZED_NAME_TYPE = "type";

    @SerializedName(SERIALIZED_NAME_TYPE)
    private VmNicType type;

    public static final String SERIALIZED_NAME_VLAN = "vlan";

    @SerializedName(SERIALIZED_NAME_VLAN)
    private NestedFrozenVlan vlan;

    public static final String SERIALIZED_NAME_VPC_NIC = "vpc_nic";

    @SerializedName(SERIALIZED_NAME_VPC_NIC)
    private NestedTemplateVpcNic vpcNic;

    public NestedContentLibraryVmTemplateNic() {}

    public NestedContentLibraryVmTemplateNic egressRateLimitBurstInBit(
            Double egressRateLimitBurstInBit) {

        this.egressRateLimitBurstInBit = egressRateLimitBurstInBit;
        return this;
    }

    /**
     * Get egressRateLimitBurstInBit
     *
     * @return egressRateLimitBurstInBit
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getEgressRateLimitBurstInBit() {
        return egressRateLimitBurstInBit;
    }

    public void setEgressRateLimitBurstInBit(Double egressRateLimitBurstInBit) {
        this.egressRateLimitBurstInBit = egressRateLimitBurstInBit;
    }

    public NestedContentLibraryVmTemplateNic egressRateLimitBurstInBit_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EGRESS_RATE_LIMIT_BURST_IN_BIT);
        return this;
    }

    public NestedContentLibraryVmTemplateNic egressRateLimitBurstInBit_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EGRESS_RATE_LIMIT_BURST_IN_BIT);
        return this;
    }

    public void setEgressRateLimitBurstInBit_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EGRESS_RATE_LIMIT_BURST_IN_BIT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EGRESS_RATE_LIMIT_BURST_IN_BIT);
        }
    }

    public boolean getEgressRateLimitBurstInBit_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EGRESS_RATE_LIMIT_BURST_IN_BIT);
    }

    public NestedContentLibraryVmTemplateNic egressRateLimitEnabled(
            Boolean egressRateLimitEnabled) {

        this.egressRateLimitEnabled = egressRateLimitEnabled;
        return this;
    }

    /**
     * Get egressRateLimitEnabled
     *
     * @return egressRateLimitEnabled
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getEgressRateLimitEnabled() {
        return egressRateLimitEnabled;
    }

    public void setEgressRateLimitEnabled(Boolean egressRateLimitEnabled) {
        this.egressRateLimitEnabled = egressRateLimitEnabled;
    }

    public NestedContentLibraryVmTemplateNic egressRateLimitEnabled_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EGRESS_RATE_LIMIT_ENABLED);
        return this;
    }

    public NestedContentLibraryVmTemplateNic egressRateLimitEnabled_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EGRESS_RATE_LIMIT_ENABLED);
        return this;
    }

    public void setEgressRateLimitEnabled_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EGRESS_RATE_LIMIT_ENABLED);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EGRESS_RATE_LIMIT_ENABLED);
        }
    }

    public boolean getEgressRateLimitEnabled_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EGRESS_RATE_LIMIT_ENABLED);
    }

    public NestedContentLibraryVmTemplateNic egressRateLimitMaxRateInBitps(
            Double egressRateLimitMaxRateInBitps) {

        this.egressRateLimitMaxRateInBitps = egressRateLimitMaxRateInBitps;
        return this;
    }

    /**
     * Get egressRateLimitMaxRateInBitps
     *
     * @return egressRateLimitMaxRateInBitps
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getEgressRateLimitMaxRateInBitps() {
        return egressRateLimitMaxRateInBitps;
    }

    public void setEgressRateLimitMaxRateInBitps(Double egressRateLimitMaxRateInBitps) {
        this.egressRateLimitMaxRateInBitps = egressRateLimitMaxRateInBitps;
    }

    public NestedContentLibraryVmTemplateNic egressRateLimitMaxRateInBitps_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS);
        return this;
    }

    public NestedContentLibraryVmTemplateNic egressRateLimitMaxRateInBitps_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS);
        return this;
    }

    public void setEgressRateLimitMaxRateInBitps_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS);
        }
    }

    public boolean getEgressRateLimitMaxRateInBitps_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS);
    }

    public NestedContentLibraryVmTemplateNic enabled(Boolean enabled) {

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

    public NestedContentLibraryVmTemplateNic enabled_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENABLED);
        return this;
    }

    public NestedContentLibraryVmTemplateNic enabled_ExplictlyNonNull() {
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

    public NestedContentLibraryVmTemplateNic index(Integer index) {

        this.index = index;
        return this;
    }

    /**
     * Get index
     *
     * @return index
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public NestedContentLibraryVmTemplateNic index_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INDEX);
        return this;
    }

    public NestedContentLibraryVmTemplateNic index_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INDEX);
        return this;
    }

    public void setIndex_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INDEX);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INDEX);
        }
    }

    public boolean getIndex_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INDEX);
    }

    public NestedContentLibraryVmTemplateNic ingressRateLimitBurstInBit(
            Double ingressRateLimitBurstInBit) {

        this.ingressRateLimitBurstInBit = ingressRateLimitBurstInBit;
        return this;
    }

    /**
     * Get ingressRateLimitBurstInBit
     *
     * @return ingressRateLimitBurstInBit
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getIngressRateLimitBurstInBit() {
        return ingressRateLimitBurstInBit;
    }

    public void setIngressRateLimitBurstInBit(Double ingressRateLimitBurstInBit) {
        this.ingressRateLimitBurstInBit = ingressRateLimitBurstInBit;
    }

    public NestedContentLibraryVmTemplateNic ingressRateLimitBurstInBit_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INGRESS_RATE_LIMIT_BURST_IN_BIT);
        return this;
    }

    public NestedContentLibraryVmTemplateNic ingressRateLimitBurstInBit_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INGRESS_RATE_LIMIT_BURST_IN_BIT);
        return this;
    }

    public void setIngressRateLimitBurstInBit_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INGRESS_RATE_LIMIT_BURST_IN_BIT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INGRESS_RATE_LIMIT_BURST_IN_BIT);
        }
    }

    public boolean getIngressRateLimitBurstInBit_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INGRESS_RATE_LIMIT_BURST_IN_BIT);
    }

    public NestedContentLibraryVmTemplateNic ingressRateLimitEnabled(
            Boolean ingressRateLimitEnabled) {

        this.ingressRateLimitEnabled = ingressRateLimitEnabled;
        return this;
    }

    /**
     * Get ingressRateLimitEnabled
     *
     * @return ingressRateLimitEnabled
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getIngressRateLimitEnabled() {
        return ingressRateLimitEnabled;
    }

    public void setIngressRateLimitEnabled(Boolean ingressRateLimitEnabled) {
        this.ingressRateLimitEnabled = ingressRateLimitEnabled;
    }

    public NestedContentLibraryVmTemplateNic ingressRateLimitEnabled_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INGRESS_RATE_LIMIT_ENABLED);
        return this;
    }

    public NestedContentLibraryVmTemplateNic ingressRateLimitEnabled_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INGRESS_RATE_LIMIT_ENABLED);
        return this;
    }

    public void setIngressRateLimitEnabled_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INGRESS_RATE_LIMIT_ENABLED);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INGRESS_RATE_LIMIT_ENABLED);
        }
    }

    public boolean getIngressRateLimitEnabled_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INGRESS_RATE_LIMIT_ENABLED);
    }

    public NestedContentLibraryVmTemplateNic ingressRateLimitMaxRateInBitps(
            Double ingressRateLimitMaxRateInBitps) {

        this.ingressRateLimitMaxRateInBitps = ingressRateLimitMaxRateInBitps;
        return this;
    }

    /**
     * Get ingressRateLimitMaxRateInBitps
     *
     * @return ingressRateLimitMaxRateInBitps
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getIngressRateLimitMaxRateInBitps() {
        return ingressRateLimitMaxRateInBitps;
    }

    public void setIngressRateLimitMaxRateInBitps(Double ingressRateLimitMaxRateInBitps) {
        this.ingressRateLimitMaxRateInBitps = ingressRateLimitMaxRateInBitps;
    }

    public NestedContentLibraryVmTemplateNic ingressRateLimitMaxRateInBitps_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS);
        return this;
    }

    public NestedContentLibraryVmTemplateNic ingressRateLimitMaxRateInBitps_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS);
        return this;
    }

    public void setIngressRateLimitMaxRateInBitps_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS);
        }
    }

    public boolean getIngressRateLimitMaxRateInBitps_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INGRESS_RATE_LIMIT_MAX_RATE_IN_BITPS);
    }

    public NestedContentLibraryVmTemplateNic mirror(Boolean mirror) {

        this.mirror = mirror;
        return this;
    }

    /**
     * Get mirror
     *
     * @return mirror
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getMirror() {
        return mirror;
    }

    public void setMirror(Boolean mirror) {
        this.mirror = mirror;
    }

    public NestedContentLibraryVmTemplateNic mirror_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MIRROR);
        return this;
    }

    public NestedContentLibraryVmTemplateNic mirror_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MIRROR);
        return this;
    }

    public void setMirror_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MIRROR);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MIRROR);
        }
    }

    public boolean getMirror_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MIRROR);
    }

    public NestedContentLibraryVmTemplateNic model(VmNicModel model) {

        this.model = model;
        return this;
    }

    /**
     * Get model
     *
     * @return model
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmNicModel getModel() {
        return model;
    }

    public void setModel(VmNicModel model) {
        this.model = model;
    }

    public NestedContentLibraryVmTemplateNic model_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MODEL);
        return this;
    }

    public NestedContentLibraryVmTemplateNic model_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MODEL);
        return this;
    }

    public void setModel_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MODEL);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MODEL);
        }
    }

    public boolean getModel_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MODEL);
    }

    public NestedContentLibraryVmTemplateNic type(VmNicType type) {

        this.type = type;
        return this;
    }

    /**
     * Get type
     *
     * @return type
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmNicType getType() {
        return type;
    }

    public void setType(VmNicType type) {
        this.type = type;
    }

    public NestedContentLibraryVmTemplateNic type_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE);
        return this;
    }

    public NestedContentLibraryVmTemplateNic type_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TYPE);
        return this;
    }

    public void setType_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TYPE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TYPE);
        }
    }

    public boolean getType_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TYPE);
    }

    public NestedContentLibraryVmTemplateNic vlan(NestedFrozenVlan vlan) {

        this.vlan = vlan;
        return this;
    }

    /**
     * Get vlan
     *
     * @return vlan
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NestedFrozenVlan getVlan() {
        return vlan;
    }

    public void setVlan(NestedFrozenVlan vlan) {
        this.vlan = vlan;
    }

    public NestedContentLibraryVmTemplateNic vlan_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VLAN);
        return this;
    }

    public NestedContentLibraryVmTemplateNic vlan_ExplictlyNonNull() {
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

    public NestedContentLibraryVmTemplateNic vpcNic(NestedTemplateVpcNic vpcNic) {

        this.vpcNic = vpcNic;
        return this;
    }

    /**
     * Get vpcNic
     *
     * @return vpcNic
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NestedTemplateVpcNic getVpcNic() {
        return vpcNic;
    }

    public void setVpcNic(NestedTemplateVpcNic vpcNic) {
        this.vpcNic = vpcNic;
    }

    public NestedContentLibraryVmTemplateNic vpcNic_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VPC_NIC);
        return this;
    }

    public NestedContentLibraryVmTemplateNic vpcNic_ExplictlyNonNull() {
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
        NestedContentLibraryVmTemplateNic nestedContentLibraryVmTemplateNic =
                (NestedContentLibraryVmTemplateNic) o;
        return Objects.equals(
                        this.egressRateLimitBurstInBit,
                        nestedContentLibraryVmTemplateNic.egressRateLimitBurstInBit)
                && Objects.equals(
                        this.egressRateLimitEnabled,
                        nestedContentLibraryVmTemplateNic.egressRateLimitEnabled)
                && Objects.equals(
                        this.egressRateLimitMaxRateInBitps,
                        nestedContentLibraryVmTemplateNic.egressRateLimitMaxRateInBitps)
                && Objects.equals(this.enabled, nestedContentLibraryVmTemplateNic.enabled)
                && Objects.equals(this.index, nestedContentLibraryVmTemplateNic.index)
                && Objects.equals(
                        this.ingressRateLimitBurstInBit,
                        nestedContentLibraryVmTemplateNic.ingressRateLimitBurstInBit)
                && Objects.equals(
                        this.ingressRateLimitEnabled,
                        nestedContentLibraryVmTemplateNic.ingressRateLimitEnabled)
                && Objects.equals(
                        this.ingressRateLimitMaxRateInBitps,
                        nestedContentLibraryVmTemplateNic.ingressRateLimitMaxRateInBitps)
                && Objects.equals(this.mirror, nestedContentLibraryVmTemplateNic.mirror)
                && Objects.equals(this.model, nestedContentLibraryVmTemplateNic.model)
                && Objects.equals(this.type, nestedContentLibraryVmTemplateNic.type)
                && Objects.equals(this.vlan, nestedContentLibraryVmTemplateNic.vlan)
                && Objects.equals(this.vpcNic, nestedContentLibraryVmTemplateNic.vpcNic);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null
                        && b != null
                        && a.isPresent()
                        && b.isPresent()
                        && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                egressRateLimitBurstInBit,
                egressRateLimitEnabled,
                egressRateLimitMaxRateInBitps,
                enabled,
                index,
                ingressRateLimitBurstInBit,
                ingressRateLimitEnabled,
                ingressRateLimitMaxRateInBitps,
                mirror,
                model,
                type,
                vlan,
                vpcNic);
    }

    private static <T> int hashCodeNullable(JsonNullable<T> a) {
        if (a == null) {
            return 1;
        }
        return a.isPresent() ? Arrays.deepHashCode(new Object[] {a.get()}) : 31;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NestedContentLibraryVmTemplateNic {\n");
        sb.append("    egressRateLimitBurstInBit: ")
                .append(toIndentedString(egressRateLimitBurstInBit))
                .append("\n");
        sb.append("    egressRateLimitEnabled: ")
                .append(toIndentedString(egressRateLimitEnabled))
                .append("\n");
        sb.append("    egressRateLimitMaxRateInBitps: ")
                .append(toIndentedString(egressRateLimitMaxRateInBitps))
                .append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    index: ").append(toIndentedString(index)).append("\n");
        sb.append("    ingressRateLimitBurstInBit: ")
                .append(toIndentedString(ingressRateLimitBurstInBit))
                .append("\n");
        sb.append("    ingressRateLimitEnabled: ")
                .append(toIndentedString(ingressRateLimitEnabled))
                .append("\n");
        sb.append("    ingressRateLimitMaxRateInBitps: ")
                .append(toIndentedString(ingressRateLimitMaxRateInBitps))
                .append("\n");
        sb.append("    mirror: ").append(toIndentedString(mirror)).append("\n");
        sb.append("    model: ").append(toIndentedString(model)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    vlan: ").append(toIndentedString(vlan)).append("\n");
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

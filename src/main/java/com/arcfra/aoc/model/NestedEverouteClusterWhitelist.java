package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** NestedEverouteClusterWhitelist */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class NestedEverouteClusterWhitelist
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_EGRESS = "egress";

    @SerializedName(SERIALIZED_NAME_EGRESS)
    private List<NestedNetworkPolicyRule> egress = null;

    public static final String SERIALIZED_NAME_ENABLE = "enable";

    @SerializedName(SERIALIZED_NAME_ENABLE)
    private Boolean enable;

    public static final String SERIALIZED_NAME_INGRESS = "ingress";

    @SerializedName(SERIALIZED_NAME_INGRESS)
    private List<NestedNetworkPolicyRule> ingress = null;

    public NestedEverouteClusterWhitelist() {}

    public NestedEverouteClusterWhitelist egress(List<NestedNetworkPolicyRule> egress) {

        this.egress = egress;
        return this;
    }

    public NestedEverouteClusterWhitelist addEgressItem(NestedNetworkPolicyRule egressItem) {
        if (this.egress == null) {
            this.egress = new ArrayList<NestedNetworkPolicyRule>();
        }
        this.egress.add(egressItem);
        return this;
    }

    /**
     * Get egress
     *
     * @return egress
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedNetworkPolicyRule> getEgress() {
        return egress;
    }

    public void setEgress(List<NestedNetworkPolicyRule> egress) {
        this.egress = egress;
    }

    public NestedEverouteClusterWhitelist egress_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EGRESS);
        return this;
    }

    public NestedEverouteClusterWhitelist egress_ExplictlyNonNull() {
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

    public NestedEverouteClusterWhitelist enable(Boolean enable) {

        this.enable = enable;
        return this;
    }

    /**
     * Get enable
     *
     * @return enable
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public NestedEverouteClusterWhitelist enable_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENABLE);
        return this;
    }

    public NestedEverouteClusterWhitelist enable_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ENABLE);
        return this;
    }

    public void setEnable_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ENABLE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ENABLE);
        }
    }

    public boolean getEnable_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ENABLE);
    }

    public NestedEverouteClusterWhitelist ingress(List<NestedNetworkPolicyRule> ingress) {

        this.ingress = ingress;
        return this;
    }

    public NestedEverouteClusterWhitelist addIngressItem(NestedNetworkPolicyRule ingressItem) {
        if (this.ingress == null) {
            this.ingress = new ArrayList<NestedNetworkPolicyRule>();
        }
        this.ingress.add(ingressItem);
        return this;
    }

    /**
     * Get ingress
     *
     * @return ingress
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedNetworkPolicyRule> getIngress() {
        return ingress;
    }

    public void setIngress(List<NestedNetworkPolicyRule> ingress) {
        this.ingress = ingress;
    }

    public NestedEverouteClusterWhitelist ingress_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INGRESS);
        return this;
    }

    public NestedEverouteClusterWhitelist ingress_ExplictlyNonNull() {
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
        NestedEverouteClusterWhitelist nestedEverouteClusterWhitelist =
                (NestedEverouteClusterWhitelist) o;
        return Objects.equals(this.egress, nestedEverouteClusterWhitelist.egress)
                && Objects.equals(this.enable, nestedEverouteClusterWhitelist.enable)
                && Objects.equals(this.ingress, nestedEverouteClusterWhitelist.ingress);
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
        return Objects.hash(egress, enable, ingress);
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
        sb.append("class NestedEverouteClusterWhitelist {\n");
        sb.append("    egress: ").append(toIndentedString(egress)).append("\n");
        sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
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

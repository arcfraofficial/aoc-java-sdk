package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** SecurityPolicy */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class SecurityPolicy extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_APPLY_TO = "apply_to";

    @SerializedName(SERIALIZED_NAME_APPLY_TO)
    private List<NestedSecurityPolicyApply> applyTo = new ArrayList<NestedSecurityPolicyApply>();

    public static final String SERIALIZED_NAME_DESCRIPTION = "description";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION)
    private String description;

    public static final String SERIALIZED_NAME_EGRESS = "egress";

    @SerializedName(SERIALIZED_NAME_EGRESS)
    private List<NestedNetworkPolicyRule> egress = null;

    public static final String SERIALIZED_NAME_EVEROUTE_CLUSTER = "everoute_cluster";

    @SerializedName(SERIALIZED_NAME_EVEROUTE_CLUSTER)
    private NestedEverouteCluster everouteCluster;

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

    public static final String SERIALIZED_NAME_INGRESS = "ingress";

    @SerializedName(SERIALIZED_NAME_INGRESS)
    private List<NestedNetworkPolicyRule> ingress = null;

    public static final String SERIALIZED_NAME_IS_BLOCKLIST = "is_blocklist";

    @SerializedName(SERIALIZED_NAME_IS_BLOCKLIST)
    private Boolean isBlocklist;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_POLICY_MODE = "policy_mode";

    @SerializedName(SERIALIZED_NAME_POLICY_MODE)
    private PolicyMode policyMode;

    public static final String SERIALIZED_NAME_STATISTICS = "statistics";

    @SerializedName(SERIALIZED_NAME_STATISTICS)
    private NestedSecurityPolicyStatistics statistics;

    public SecurityPolicy() {}

    public SecurityPolicy applyTo(List<NestedSecurityPolicyApply> applyTo) {

        this.applyTo = applyTo;
        return this;
    }

    public SecurityPolicy addApplyToItem(NestedSecurityPolicyApply applyToItem) {
        this.applyTo.add(applyToItem);
        return this;
    }

    /**
     * Get applyTo
     *
     * @return applyTo
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public List<NestedSecurityPolicyApply> getApplyTo() {
        return applyTo;
    }

    public void setApplyTo(List<NestedSecurityPolicyApply> applyTo) {
        this.applyTo = applyTo;
    }

    public SecurityPolicy applyTo_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_APPLY_TO);
        return this;
    }

    public SecurityPolicy applyTo_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_APPLY_TO);
        return this;
    }

    public void setApplyTo_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_APPLY_TO);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_APPLY_TO);
        }
    }

    public boolean getApplyTo_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_APPLY_TO);
    }

    public SecurityPolicy description(String description) {

        this.description = description;
        return this;
    }

    /**
     * Get description
     *
     * @return description
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public SecurityPolicy description_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION);
        return this;
    }

    public SecurityPolicy description_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION);
        return this;
    }

    public void setDescription_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION);
        }
    }

    public boolean getDescription_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESCRIPTION);
    }

    public SecurityPolicy egress(List<NestedNetworkPolicyRule> egress) {

        this.egress = egress;
        return this;
    }

    public SecurityPolicy addEgressItem(NestedNetworkPolicyRule egressItem) {
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

    public SecurityPolicy egress_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EGRESS);
        return this;
    }

    public SecurityPolicy egress_ExplictlyNonNull() {
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

    public SecurityPolicy everouteCluster(NestedEverouteCluster everouteCluster) {

        this.everouteCluster = everouteCluster;
        return this;
    }

    /**
     * Get everouteCluster
     *
     * @return everouteCluster
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public NestedEverouteCluster getEverouteCluster() {
        return everouteCluster;
    }

    public void setEverouteCluster(NestedEverouteCluster everouteCluster) {
        this.everouteCluster = everouteCluster;
    }

    public SecurityPolicy everouteCluster_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EVEROUTE_CLUSTER);
        return this;
    }

    public SecurityPolicy everouteCluster_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EVEROUTE_CLUSTER);
        return this;
    }

    public void setEverouteCluster_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EVEROUTE_CLUSTER);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EVEROUTE_CLUSTER);
        }
    }

    public boolean getEverouteCluster_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EVEROUTE_CLUSTER);
    }

    public SecurityPolicy id(String id) {

        this.id = id;
        return this;
    }

    /**
     * Get id
     *
     * @return id
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public SecurityPolicy id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public SecurityPolicy id_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID);
        return this;
    }

    public void setId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID);
        }
    }

    public boolean getId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID);
    }

    public SecurityPolicy ingress(List<NestedNetworkPolicyRule> ingress) {

        this.ingress = ingress;
        return this;
    }

    public SecurityPolicy addIngressItem(NestedNetworkPolicyRule ingressItem) {
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

    public SecurityPolicy ingress_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INGRESS);
        return this;
    }

    public SecurityPolicy ingress_ExplictlyNonNull() {
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

    public SecurityPolicy isBlocklist(Boolean isBlocklist) {

        this.isBlocklist = isBlocklist;
        return this;
    }

    /**
     * Get isBlocklist
     *
     * @return isBlocklist
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Boolean getIsBlocklist() {
        return isBlocklist;
    }

    public void setIsBlocklist(Boolean isBlocklist) {
        this.isBlocklist = isBlocklist;
    }

    public SecurityPolicy isBlocklist_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IS_BLOCKLIST);
        return this;
    }

    public SecurityPolicy isBlocklist_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IS_BLOCKLIST);
        return this;
    }

    public void setIsBlocklist_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IS_BLOCKLIST);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IS_BLOCKLIST);
        }
    }

    public boolean getIsBlocklist_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IS_BLOCKLIST);
    }

    public SecurityPolicy name(String name) {

        this.name = name;
        return this;
    }

    /**
     * Get name
     *
     * @return name
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SecurityPolicy name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public SecurityPolicy name_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME);
        return this;
    }

    public void setName_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME);
        }
    }

    public boolean getName_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME);
    }

    public SecurityPolicy policyMode(PolicyMode policyMode) {

        this.policyMode = policyMode;
        return this;
    }

    /**
     * Get policyMode
     *
     * @return policyMode
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public PolicyMode getPolicyMode() {
        return policyMode;
    }

    public void setPolicyMode(PolicyMode policyMode) {
        this.policyMode = policyMode;
    }

    public SecurityPolicy policyMode_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_POLICY_MODE);
        return this;
    }

    public SecurityPolicy policyMode_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_POLICY_MODE);
        return this;
    }

    public void setPolicyMode_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_POLICY_MODE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_POLICY_MODE);
        }
    }

    public boolean getPolicyMode_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_POLICY_MODE);
    }

    public SecurityPolicy statistics(NestedSecurityPolicyStatistics statistics) {

        this.statistics = statistics;
        return this;
    }

    /**
     * Get statistics
     *
     * @return statistics
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NestedSecurityPolicyStatistics getStatistics() {
        return statistics;
    }

    public void setStatistics(NestedSecurityPolicyStatistics statistics) {
        this.statistics = statistics;
    }

    public SecurityPolicy statistics_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATISTICS);
        return this;
    }

    public SecurityPolicy statistics_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STATISTICS);
        return this;
    }

    public void setStatistics_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STATISTICS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STATISTICS);
        }
    }

    public boolean getStatistics_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STATISTICS);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SecurityPolicy securityPolicy = (SecurityPolicy) o;
        return Objects.equals(this.applyTo, securityPolicy.applyTo)
                && Objects.equals(this.description, securityPolicy.description)
                && Objects.equals(this.egress, securityPolicy.egress)
                && Objects.equals(this.everouteCluster, securityPolicy.everouteCluster)
                && Objects.equals(this.id, securityPolicy.id)
                && Objects.equals(this.ingress, securityPolicy.ingress)
                && Objects.equals(this.isBlocklist, securityPolicy.isBlocklist)
                && Objects.equals(this.name, securityPolicy.name)
                && Objects.equals(this.policyMode, securityPolicy.policyMode)
                && Objects.equals(this.statistics, securityPolicy.statistics);
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
                applyTo,
                description,
                egress,
                everouteCluster,
                id,
                ingress,
                isBlocklist,
                name,
                policyMode,
                statistics);
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
        sb.append("class SecurityPolicy {\n");
        sb.append("    applyTo: ").append(toIndentedString(applyTo)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    egress: ").append(toIndentedString(egress)).append("\n");
        sb.append("    everouteCluster: ").append(toIndentedString(everouteCluster)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    ingress: ").append(toIndentedString(ingress)).append("\n");
        sb.append("    isBlocklist: ").append(toIndentedString(isBlocklist)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    policyMode: ").append(toIndentedString(policyMode)).append("\n");
        sb.append("    statistics: ").append(toIndentedString(statistics)).append("\n");
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

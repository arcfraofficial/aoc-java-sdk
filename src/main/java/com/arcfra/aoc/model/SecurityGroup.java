package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** SecurityGroup */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class SecurityGroup extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_DESCRIPTION = "description";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION)
    private String description;

    public static final String SERIALIZED_NAME_EVEROUTE_CLUSTER = "everoute_cluster";

    @SerializedName(SERIALIZED_NAME_EVEROUTE_CLUSTER)
    private NestedEverouteCluster everouteCluster;

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

    public static final String SERIALIZED_NAME_ISOLATION_POLICIES = "isolation_policies";

    @SerializedName(SERIALIZED_NAME_ISOLATION_POLICIES)
    private List<NestedIsolationPolicy> isolationPolicies = null;

    public static final String SERIALIZED_NAME_LABEL_GROUPS = "label_groups";

    @SerializedName(SERIALIZED_NAME_LABEL_GROUPS)
    private List<NestedLabelGroup> labelGroups = null;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_SECURITY_POLICIES = "security_policies";

    @SerializedName(SERIALIZED_NAME_SECURITY_POLICIES)
    private List<NestedSecurityPolicy> securityPolicies = null;

    public static final String SERIALIZED_NAME_VMS = "vms";

    @SerializedName(SERIALIZED_NAME_VMS)
    private List<NestedVm> vms = null;

    public SecurityGroup() {}

    public SecurityGroup description(String description) {

        this.description = description;
        return this;
    }

    /**
     * Get description
     *
     * @return description
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public SecurityGroup description_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION);
        return this;
    }

    public SecurityGroup description_ExplictlyNonNull() {
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

    public SecurityGroup everouteCluster(NestedEverouteCluster everouteCluster) {

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

    public SecurityGroup everouteCluster_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EVEROUTE_CLUSTER);
        return this;
    }

    public SecurityGroup everouteCluster_ExplictlyNonNull() {
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

    public SecurityGroup id(String id) {

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

    public SecurityGroup id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public SecurityGroup id_ExplictlyNonNull() {
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

    public SecurityGroup isolationPolicies(List<NestedIsolationPolicy> isolationPolicies) {

        this.isolationPolicies = isolationPolicies;
        return this;
    }

    public SecurityGroup addIsolationPoliciesItem(NestedIsolationPolicy isolationPoliciesItem) {
        if (this.isolationPolicies == null) {
            this.isolationPolicies = new ArrayList<NestedIsolationPolicy>();
        }
        this.isolationPolicies.add(isolationPoliciesItem);
        return this;
    }

    /**
     * Get isolationPolicies
     *
     * @return isolationPolicies
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedIsolationPolicy> getIsolationPolicies() {
        return isolationPolicies;
    }

    public void setIsolationPolicies(List<NestedIsolationPolicy> isolationPolicies) {
        this.isolationPolicies = isolationPolicies;
    }

    public SecurityGroup isolationPolicies_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISOLATION_POLICIES);
        return this;
    }

    public SecurityGroup isolationPolicies_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISOLATION_POLICIES);
        return this;
    }

    public void setIsolationPolicies_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISOLATION_POLICIES);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISOLATION_POLICIES);
        }
    }

    public boolean getIsolationPolicies_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISOLATION_POLICIES);
    }

    public SecurityGroup labelGroups(List<NestedLabelGroup> labelGroups) {

        this.labelGroups = labelGroups;
        return this;
    }

    public SecurityGroup addLabelGroupsItem(NestedLabelGroup labelGroupsItem) {
        if (this.labelGroups == null) {
            this.labelGroups = new ArrayList<NestedLabelGroup>();
        }
        this.labelGroups.add(labelGroupsItem);
        return this;
    }

    /**
     * Get labelGroups
     *
     * @return labelGroups
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedLabelGroup> getLabelGroups() {
        return labelGroups;
    }

    public void setLabelGroups(List<NestedLabelGroup> labelGroups) {
        this.labelGroups = labelGroups;
    }

    public SecurityGroup labelGroups_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LABEL_GROUPS);
        return this;
    }

    public SecurityGroup labelGroups_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LABEL_GROUPS);
        return this;
    }

    public void setLabelGroups_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LABEL_GROUPS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LABEL_GROUPS);
        }
    }

    public boolean getLabelGroups_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LABEL_GROUPS);
    }

    public SecurityGroup name(String name) {

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

    public SecurityGroup name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public SecurityGroup name_ExplictlyNonNull() {
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

    public SecurityGroup securityPolicies(List<NestedSecurityPolicy> securityPolicies) {

        this.securityPolicies = securityPolicies;
        return this;
    }

    public SecurityGroup addSecurityPoliciesItem(NestedSecurityPolicy securityPoliciesItem) {
        if (this.securityPolicies == null) {
            this.securityPolicies = new ArrayList<NestedSecurityPolicy>();
        }
        this.securityPolicies.add(securityPoliciesItem);
        return this;
    }

    /**
     * Get securityPolicies
     *
     * @return securityPolicies
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedSecurityPolicy> getSecurityPolicies() {
        return securityPolicies;
    }

    public void setSecurityPolicies(List<NestedSecurityPolicy> securityPolicies) {
        this.securityPolicies = securityPolicies;
    }

    public SecurityGroup securityPolicies_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SECURITY_POLICIES);
        return this;
    }

    public SecurityGroup securityPolicies_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SECURITY_POLICIES);
        return this;
    }

    public void setSecurityPolicies_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SECURITY_POLICIES);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SECURITY_POLICIES);
        }
    }

    public boolean getSecurityPolicies_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SECURITY_POLICIES);
    }

    public SecurityGroup vms(List<NestedVm> vms) {

        this.vms = vms;
        return this;
    }

    public SecurityGroup addVmsItem(NestedVm vmsItem) {
        if (this.vms == null) {
            this.vms = new ArrayList<NestedVm>();
        }
        this.vms.add(vmsItem);
        return this;
    }

    /**
     * Get vms
     *
     * @return vms
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedVm> getVms() {
        return vms;
    }

    public void setVms(List<NestedVm> vms) {
        this.vms = vms;
    }

    public SecurityGroup vms_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VMS);
        return this;
    }

    public SecurityGroup vms_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VMS);
        return this;
    }

    public void setVms_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VMS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VMS);
        }
    }

    public boolean getVms_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VMS);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SecurityGroup securityGroup = (SecurityGroup) o;
        return Objects.equals(this.description, securityGroup.description)
                && Objects.equals(this.everouteCluster, securityGroup.everouteCluster)
                && Objects.equals(this.id, securityGroup.id)
                && Objects.equals(this.isolationPolicies, securityGroup.isolationPolicies)
                && Objects.equals(this.labelGroups, securityGroup.labelGroups)
                && Objects.equals(this.name, securityGroup.name)
                && Objects.equals(this.securityPolicies, securityGroup.securityPolicies)
                && Objects.equals(this.vms, securityGroup.vms);
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
                description,
                everouteCluster,
                id,
                isolationPolicies,
                labelGroups,
                name,
                securityPolicies,
                vms);
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
        sb.append("class SecurityGroup {\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    everouteCluster: ").append(toIndentedString(everouteCluster)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    isolationPolicies: ")
                .append(toIndentedString(isolationPolicies))
                .append("\n");
        sb.append("    labelGroups: ").append(toIndentedString(labelGroups)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    securityPolicies: ").append(toIndentedString(securityPolicies)).append("\n");
        sb.append("    vms: ").append(toIndentedString(vms)).append("\n");
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

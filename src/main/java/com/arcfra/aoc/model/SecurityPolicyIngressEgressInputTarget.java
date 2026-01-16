package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** SecurityPolicyIngressEgressInputTarget */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class SecurityPolicyIngressEgressInputTarget
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_SECURITY_GROUPS = "security_groups";

    @SerializedName(SERIALIZED_NAME_SECURITY_GROUPS)
    private SecurityGroupWhereInput securityGroups;

    public static final String SERIALIZED_NAME_IPS = "ips";

    @SerializedName(SERIALIZED_NAME_IPS)
    private List<IPSecurityPolicy> ips = null;

    public static final String SERIALIZED_NAME_LABEL_GROUPS = "label_groups";

    @SerializedName(SERIALIZED_NAME_LABEL_GROUPS)
    private List<LabelWhereInput> labelGroups = null;

    public SecurityPolicyIngressEgressInputTarget() {}

    public SecurityPolicyIngressEgressInputTarget securityGroups(
            SecurityGroupWhereInput securityGroups) {

        this.securityGroups = securityGroups;
        return this;
    }

    /**
     * Get securityGroups
     *
     * @return securityGroups
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public SecurityGroupWhereInput getSecurityGroups() {
        return securityGroups;
    }

    public void setSecurityGroups(SecurityGroupWhereInput securityGroups) {
        this.securityGroups = securityGroups;
    }

    public SecurityPolicyIngressEgressInputTarget securityGroups_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SECURITY_GROUPS);
        return this;
    }

    public SecurityPolicyIngressEgressInputTarget securityGroups_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SECURITY_GROUPS);
        return this;
    }

    public void setSecurityGroups_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SECURITY_GROUPS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SECURITY_GROUPS);
        }
    }

    public boolean getSecurityGroups_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SECURITY_GROUPS);
    }

    public SecurityPolicyIngressEgressInputTarget ips(List<IPSecurityPolicy> ips) {

        this.ips = ips;
        return this;
    }

    public SecurityPolicyIngressEgressInputTarget addIpsItem(IPSecurityPolicy ipsItem) {
        if (this.ips == null) {
            this.ips = new ArrayList<IPSecurityPolicy>();
        }
        this.ips.add(ipsItem);
        return this;
    }

    /**
     * Get ips
     *
     * @return ips
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<IPSecurityPolicy> getIps() {
        return ips;
    }

    public void setIps(List<IPSecurityPolicy> ips) {
        this.ips = ips;
    }

    public SecurityPolicyIngressEgressInputTarget ips_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IPS);
        return this;
    }

    public SecurityPolicyIngressEgressInputTarget ips_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IPS);
        return this;
    }

    public void setIps_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IPS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IPS);
        }
    }

    public boolean getIps_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IPS);
    }

    public SecurityPolicyIngressEgressInputTarget labelGroups(List<LabelWhereInput> labelGroups) {

        this.labelGroups = labelGroups;
        return this;
    }

    public SecurityPolicyIngressEgressInputTarget addLabelGroupsItem(
            LabelWhereInput labelGroupsItem) {
        if (this.labelGroups == null) {
            this.labelGroups = new ArrayList<LabelWhereInput>();
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
    public List<LabelWhereInput> getLabelGroups() {
        return labelGroups;
    }

    public void setLabelGroups(List<LabelWhereInput> labelGroups) {
        this.labelGroups = labelGroups;
    }

    public SecurityPolicyIngressEgressInputTarget labelGroups_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LABEL_GROUPS);
        return this;
    }

    public SecurityPolicyIngressEgressInputTarget labelGroups_ExplictlyNonNull() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SecurityPolicyIngressEgressInputTarget securityPolicyIngressEgressInputTarget =
                (SecurityPolicyIngressEgressInputTarget) o;
        return Objects.equals(
                        this.securityGroups, securityPolicyIngressEgressInputTarget.securityGroups)
                && Objects.equals(this.ips, securityPolicyIngressEgressInputTarget.ips)
                && Objects.equals(
                        this.labelGroups, securityPolicyIngressEgressInputTarget.labelGroups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(securityGroups, ips, labelGroups);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SecurityPolicyIngressEgressInputTarget {\n");
        sb.append("    securityGroups: ").append(toIndentedString(securityGroups)).append("\n");
        sb.append("    ips: ").append(toIndentedString(ips)).append("\n");
        sb.append("    labelGroups: ").append(toIndentedString(labelGroups)).append("\n");
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

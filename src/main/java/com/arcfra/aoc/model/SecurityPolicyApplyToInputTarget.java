package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** SecurityPolicyApplyToInputTarget */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class SecurityPolicyApplyToInputTarget
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_SECURITY_GROUPS = "security_groups";

    @SerializedName(SERIALIZED_NAME_SECURITY_GROUPS)
    private SecurityGroupWhereInput securityGroups;

    public static final String SERIALIZED_NAME_LABEL_GROUPS = "label_groups";

    @SerializedName(SERIALIZED_NAME_LABEL_GROUPS)
    private List<LabelWhereInput> labelGroups = null;

    public SecurityPolicyApplyToInputTarget() {}

    public SecurityPolicyApplyToInputTarget securityGroups(SecurityGroupWhereInput securityGroups) {

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

    public SecurityPolicyApplyToInputTarget securityGroups_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SECURITY_GROUPS);
        return this;
    }

    public SecurityPolicyApplyToInputTarget securityGroups_ExplictlyNonNull() {
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

    public SecurityPolicyApplyToInputTarget labelGroups(List<LabelWhereInput> labelGroups) {

        this.labelGroups = labelGroups;
        return this;
    }

    public SecurityPolicyApplyToInputTarget addLabelGroupsItem(LabelWhereInput labelGroupsItem) {
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

    public SecurityPolicyApplyToInputTarget labelGroups_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LABEL_GROUPS);
        return this;
    }

    public SecurityPolicyApplyToInputTarget labelGroups_ExplictlyNonNull() {
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
        SecurityPolicyApplyToInputTarget securityPolicyApplyToInputTarget =
                (SecurityPolicyApplyToInputTarget) o;
        return Objects.equals(this.securityGroups, securityPolicyApplyToInputTarget.securityGroups)
                && Objects.equals(this.labelGroups, securityPolicyApplyToInputTarget.labelGroups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(securityGroups, labelGroups);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SecurityPolicyApplyToInputTarget {\n");
        sb.append("    securityGroups: ").append(toIndentedString(securityGroups)).append("\n");
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

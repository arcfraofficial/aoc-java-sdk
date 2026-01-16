package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** SecurityGroupCreateParams */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class SecurityGroupCreateParams
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_VMS = "vms";

    @SerializedName(SERIALIZED_NAME_VMS)
    private VmWhereInput vms;

    public static final String SERIALIZED_NAME_LABEL_GROUPS = "label_groups";

    @SerializedName(SERIALIZED_NAME_LABEL_GROUPS)
    private List<LabelWhereInput> labelGroups = null;

    public static final String SERIALIZED_NAME_DESCRIPTION = "description";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION)
    private String description;

    public static final String SERIALIZED_NAME_EVEROUTE_CLUSTER_ID = "everoute_cluster_id";

    @SerializedName(SERIALIZED_NAME_EVEROUTE_CLUSTER_ID)
    private String everouteClusterId;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public SecurityGroupCreateParams() {}

    public SecurityGroupCreateParams vms(VmWhereInput vms) {

        this.vms = vms;
        return this;
    }

    /**
     * Get vms
     *
     * @return vms
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmWhereInput getVms() {
        return vms;
    }

    public void setVms(VmWhereInput vms) {
        this.vms = vms;
    }

    public SecurityGroupCreateParams vms_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VMS);
        return this;
    }

    public SecurityGroupCreateParams vms_ExplictlyNonNull() {
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

    public SecurityGroupCreateParams labelGroups(List<LabelWhereInput> labelGroups) {

        this.labelGroups = labelGroups;
        return this;
    }

    public SecurityGroupCreateParams addLabelGroupsItem(LabelWhereInput labelGroupsItem) {
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

    public SecurityGroupCreateParams labelGroups_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LABEL_GROUPS);
        return this;
    }

    public SecurityGroupCreateParams labelGroups_ExplictlyNonNull() {
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

    public SecurityGroupCreateParams description(String description) {

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

    public SecurityGroupCreateParams description_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION);
        return this;
    }

    public SecurityGroupCreateParams description_ExplictlyNonNull() {
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

    public SecurityGroupCreateParams everouteClusterId(String everouteClusterId) {

        this.everouteClusterId = everouteClusterId;
        return this;
    }

    /**
     * Get everouteClusterId
     *
     * @return everouteClusterId
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getEverouteClusterId() {
        return everouteClusterId;
    }

    public void setEverouteClusterId(String everouteClusterId) {
        this.everouteClusterId = everouteClusterId;
    }

    public SecurityGroupCreateParams everouteClusterId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EVEROUTE_CLUSTER_ID);
        return this;
    }

    public SecurityGroupCreateParams everouteClusterId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EVEROUTE_CLUSTER_ID);
        return this;
    }

    public void setEverouteClusterId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EVEROUTE_CLUSTER_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EVEROUTE_CLUSTER_ID);
        }
    }

    public boolean getEverouteClusterId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EVEROUTE_CLUSTER_ID);
    }

    public SecurityGroupCreateParams name(String name) {

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

    public SecurityGroupCreateParams name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public SecurityGroupCreateParams name_ExplictlyNonNull() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SecurityGroupCreateParams securityGroupCreateParams = (SecurityGroupCreateParams) o;
        return Objects.equals(this.vms, securityGroupCreateParams.vms)
                && Objects.equals(this.labelGroups, securityGroupCreateParams.labelGroups)
                && Objects.equals(this.description, securityGroupCreateParams.description)
                && Objects.equals(
                        this.everouteClusterId, securityGroupCreateParams.everouteClusterId)
                && Objects.equals(this.name, securityGroupCreateParams.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vms, labelGroups, description, everouteClusterId, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SecurityGroupCreateParams {\n");
        sb.append("    vms: ").append(toIndentedString(vms)).append("\n");
        sb.append("    labelGroups: ").append(toIndentedString(labelGroups)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    everouteClusterId: ")
                .append(toIndentedString(everouteClusterId))
                .append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

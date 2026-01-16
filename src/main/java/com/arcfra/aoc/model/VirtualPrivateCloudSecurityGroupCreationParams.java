package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** VirtualPrivateCloudSecurityGroupCreationParams */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VirtualPrivateCloudSecurityGroupCreationParams
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_VM_IDS = "vm_ids";

    @SerializedName(SERIALIZED_NAME_VM_IDS)
    private List<String> vmIds = null;

    public static final String SERIALIZED_NAME_LABEL_GROUPS = "label_groups";

    @SerializedName(SERIALIZED_NAME_LABEL_GROUPS)
    private List<LabelGroup> labelGroups = null;

    public static final String SERIALIZED_NAME_VPC_ID = "vpc_id";

    @SerializedName(SERIALIZED_NAME_VPC_ID)
    private String vpcId;

    public static final String SERIALIZED_NAME_DESCRIPTION = "description";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION)
    private String description;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public VirtualPrivateCloudSecurityGroupCreationParams() {}

    public VirtualPrivateCloudSecurityGroupCreationParams vmIds(List<String> vmIds) {

        this.vmIds = vmIds;
        return this;
    }

    public VirtualPrivateCloudSecurityGroupCreationParams addVmIdsItem(String vmIdsItem) {
        if (this.vmIds == null) {
            this.vmIds = new ArrayList<String>();
        }
        this.vmIds.add(vmIdsItem);
        return this;
    }

    /**
     * Get vmIds
     *
     * @return vmIds
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getVmIds() {
        return vmIds;
    }

    public void setVmIds(List<String> vmIds) {
        this.vmIds = vmIds;
    }

    public VirtualPrivateCloudSecurityGroupCreationParams vmIds_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_IDS);
        return this;
    }

    public VirtualPrivateCloudSecurityGroupCreationParams vmIds_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_IDS);
        return this;
    }

    public void setVmIds_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_IDS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_IDS);
        }
    }

    public boolean getVmIds_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_IDS);
    }

    public VirtualPrivateCloudSecurityGroupCreationParams labelGroups(
            List<LabelGroup> labelGroups) {

        this.labelGroups = labelGroups;
        return this;
    }

    public VirtualPrivateCloudSecurityGroupCreationParams addLabelGroupsItem(
            LabelGroup labelGroupsItem) {
        if (this.labelGroups == null) {
            this.labelGroups = new ArrayList<LabelGroup>();
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
    public List<LabelGroup> getLabelGroups() {
        return labelGroups;
    }

    public void setLabelGroups(List<LabelGroup> labelGroups) {
        this.labelGroups = labelGroups;
    }

    public VirtualPrivateCloudSecurityGroupCreationParams labelGroups_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LABEL_GROUPS);
        return this;
    }

    public VirtualPrivateCloudSecurityGroupCreationParams labelGroups_ExplictlyNonNull() {
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

    public VirtualPrivateCloudSecurityGroupCreationParams vpcId(String vpcId) {

        this.vpcId = vpcId;
        return this;
    }

    /**
     * Get vpcId
     *
     * @return vpcId
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public VirtualPrivateCloudSecurityGroupCreationParams vpcId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VPC_ID);
        return this;
    }

    public VirtualPrivateCloudSecurityGroupCreationParams vpcId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VPC_ID);
        return this;
    }

    public void setVpcId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VPC_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VPC_ID);
        }
    }

    public boolean getVpcId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VPC_ID);
    }

    public VirtualPrivateCloudSecurityGroupCreationParams description(String description) {

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

    public VirtualPrivateCloudSecurityGroupCreationParams description_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION);
        return this;
    }

    public VirtualPrivateCloudSecurityGroupCreationParams description_ExplictlyNonNull() {
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

    public VirtualPrivateCloudSecurityGroupCreationParams name(String name) {

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

    public VirtualPrivateCloudSecurityGroupCreationParams name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public VirtualPrivateCloudSecurityGroupCreationParams name_ExplictlyNonNull() {
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
        VirtualPrivateCloudSecurityGroupCreationParams
                virtualPrivateCloudSecurityGroupCreationParams =
                        (VirtualPrivateCloudSecurityGroupCreationParams) o;
        return Objects.equals(this.vmIds, virtualPrivateCloudSecurityGroupCreationParams.vmIds)
                && Objects.equals(
                        this.labelGroups,
                        virtualPrivateCloudSecurityGroupCreationParams.labelGroups)
                && Objects.equals(this.vpcId, virtualPrivateCloudSecurityGroupCreationParams.vpcId)
                && Objects.equals(
                        this.description,
                        virtualPrivateCloudSecurityGroupCreationParams.description)
                && Objects.equals(this.name, virtualPrivateCloudSecurityGroupCreationParams.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vmIds, labelGroups, vpcId, description, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VirtualPrivateCloudSecurityGroupCreationParams {\n");
        sb.append("    vmIds: ").append(toIndentedString(vmIds)).append("\n");
        sb.append("    labelGroups: ").append(toIndentedString(labelGroups)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

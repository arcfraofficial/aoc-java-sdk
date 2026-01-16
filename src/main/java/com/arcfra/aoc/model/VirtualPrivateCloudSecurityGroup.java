package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** VirtualPrivateCloudSecurityGroup */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VirtualPrivateCloudSecurityGroup
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_DEFAULT_FOR_VPC = "default_for_vpc";

    @SerializedName(SERIALIZED_NAME_DEFAULT_FOR_VPC)
    private Boolean defaultForVpc;

    public static final String SERIALIZED_NAME_DESCRIPTION = "description";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION)
    private String description;

    public static final String SERIALIZED_NAME_ENTITY_ASYNC_STATUS = "entityAsyncStatus";

    @SerializedName(SERIALIZED_NAME_ENTITY_ASYNC_STATUS)
    private EntityAsyncStatus entityAsyncStatus;

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

    public static final String SERIALIZED_NAME_LABEL_GROUPS = "label_groups";

    @SerializedName(SERIALIZED_NAME_LABEL_GROUPS)
    private List<NestedVirtualPrivateCloudLabelGroup> labelGroups = null;

    public static final String SERIALIZED_NAME_LOCAL_ID = "local_id";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID)
    private String localId;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_VMS = "vms";

    @SerializedName(SERIALIZED_NAME_VMS)
    private List<NestedVm> vms = null;

    public static final String SERIALIZED_NAME_VPC = "vpc";

    @SerializedName(SERIALIZED_NAME_VPC)
    private NestedVirtualPrivateCloud vpc;

    public VirtualPrivateCloudSecurityGroup() {}

    public VirtualPrivateCloudSecurityGroup defaultForVpc(Boolean defaultForVpc) {

        this.defaultForVpc = defaultForVpc;
        return this;
    }

    /**
     * Get defaultForVpc
     *
     * @return defaultForVpc
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getDefaultForVpc() {
        return defaultForVpc;
    }

    public void setDefaultForVpc(Boolean defaultForVpc) {
        this.defaultForVpc = defaultForVpc;
    }

    public VirtualPrivateCloudSecurityGroup defaultForVpc_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEFAULT_FOR_VPC);
        return this;
    }

    public VirtualPrivateCloudSecurityGroup defaultForVpc_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_FOR_VPC);
        return this;
    }

    public void setDefaultForVpc_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEFAULT_FOR_VPC);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEFAULT_FOR_VPC);
        }
    }

    public boolean getDefaultForVpc_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEFAULT_FOR_VPC);
    }

    public VirtualPrivateCloudSecurityGroup description(String description) {

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

    public VirtualPrivateCloudSecurityGroup description_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION);
        return this;
    }

    public VirtualPrivateCloudSecurityGroup description_ExplictlyNonNull() {
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

    public VirtualPrivateCloudSecurityGroup entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {

        this.entityAsyncStatus = entityAsyncStatus;
        return this;
    }

    /**
     * Get entityAsyncStatus
     *
     * @return entityAsyncStatus
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public EntityAsyncStatus getEntityAsyncStatus() {
        return entityAsyncStatus;
    }

    public void setEntityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {
        this.entityAsyncStatus = entityAsyncStatus;
    }

    public VirtualPrivateCloudSecurityGroup entityAsyncStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        return this;
    }

    public VirtualPrivateCloudSecurityGroup entityAsyncStatus_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        return this;
    }

    public void setEntityAsyncStatus_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        }
    }

    public boolean getEntityAsyncStatus_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
    }

    public VirtualPrivateCloudSecurityGroup id(String id) {

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

    public VirtualPrivateCloudSecurityGroup id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public VirtualPrivateCloudSecurityGroup id_ExplictlyNonNull() {
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

    public VirtualPrivateCloudSecurityGroup labelGroups(
            List<NestedVirtualPrivateCloudLabelGroup> labelGroups) {

        this.labelGroups = labelGroups;
        return this;
    }

    public VirtualPrivateCloudSecurityGroup addLabelGroupsItem(
            NestedVirtualPrivateCloudLabelGroup labelGroupsItem) {
        if (this.labelGroups == null) {
            this.labelGroups = new ArrayList<NestedVirtualPrivateCloudLabelGroup>();
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
    public List<NestedVirtualPrivateCloudLabelGroup> getLabelGroups() {
        return labelGroups;
    }

    public void setLabelGroups(List<NestedVirtualPrivateCloudLabelGroup> labelGroups) {
        this.labelGroups = labelGroups;
    }

    public VirtualPrivateCloudSecurityGroup labelGroups_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LABEL_GROUPS);
        return this;
    }

    public VirtualPrivateCloudSecurityGroup labelGroups_ExplictlyNonNull() {
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

    public VirtualPrivateCloudSecurityGroup localId(String localId) {

        this.localId = localId;
        return this;
    }

    /**
     * Get localId
     *
     * @return localId
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getLocalId() {
        return localId;
    }

    public void setLocalId(String localId) {
        this.localId = localId;
    }

    public VirtualPrivateCloudSecurityGroup localId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID);
        return this;
    }

    public VirtualPrivateCloudSecurityGroup localId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID);
        return this;
    }

    public void setLocalId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID);
        }
    }

    public boolean getLocalId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID);
    }

    public VirtualPrivateCloudSecurityGroup name(String name) {

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

    public VirtualPrivateCloudSecurityGroup name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public VirtualPrivateCloudSecurityGroup name_ExplictlyNonNull() {
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

    public VirtualPrivateCloudSecurityGroup vms(List<NestedVm> vms) {

        this.vms = vms;
        return this;
    }

    public VirtualPrivateCloudSecurityGroup addVmsItem(NestedVm vmsItem) {
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

    public VirtualPrivateCloudSecurityGroup vms_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VMS);
        return this;
    }

    public VirtualPrivateCloudSecurityGroup vms_ExplictlyNonNull() {
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

    public VirtualPrivateCloudSecurityGroup vpc(NestedVirtualPrivateCloud vpc) {

        this.vpc = vpc;
        return this;
    }

    /**
     * Get vpc
     *
     * @return vpc
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public NestedVirtualPrivateCloud getVpc() {
        return vpc;
    }

    public void setVpc(NestedVirtualPrivateCloud vpc) {
        this.vpc = vpc;
    }

    public VirtualPrivateCloudSecurityGroup vpc_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VPC);
        return this;
    }

    public VirtualPrivateCloudSecurityGroup vpc_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VPC);
        return this;
    }

    public void setVpc_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VPC);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VPC);
        }
    }

    public boolean getVpc_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VPC);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VirtualPrivateCloudSecurityGroup virtualPrivateCloudSecurityGroup =
                (VirtualPrivateCloudSecurityGroup) o;
        return Objects.equals(this.defaultForVpc, virtualPrivateCloudSecurityGroup.defaultForVpc)
                && Objects.equals(this.description, virtualPrivateCloudSecurityGroup.description)
                && Objects.equals(
                        this.entityAsyncStatus, virtualPrivateCloudSecurityGroup.entityAsyncStatus)
                && Objects.equals(this.id, virtualPrivateCloudSecurityGroup.id)
                && Objects.equals(this.labelGroups, virtualPrivateCloudSecurityGroup.labelGroups)
                && Objects.equals(this.localId, virtualPrivateCloudSecurityGroup.localId)
                && Objects.equals(this.name, virtualPrivateCloudSecurityGroup.name)
                && Objects.equals(this.vms, virtualPrivateCloudSecurityGroup.vms)
                && Objects.equals(this.vpc, virtualPrivateCloudSecurityGroup.vpc);
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
                defaultForVpc,
                description,
                entityAsyncStatus,
                id,
                labelGroups,
                localId,
                name,
                vms,
                vpc);
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
        sb.append("class VirtualPrivateCloudSecurityGroup {\n");
        sb.append("    defaultForVpc: ").append(toIndentedString(defaultForVpc)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    entityAsyncStatus: ")
                .append(toIndentedString(entityAsyncStatus))
                .append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    labelGroups: ").append(toIndentedString(labelGroups)).append("\n");
        sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    vms: ").append(toIndentedString(vms)).append("\n");
        sb.append("    vpc: ").append(toIndentedString(vpc)).append("\n");
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

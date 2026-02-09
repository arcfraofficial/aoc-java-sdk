package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** BusinessHost */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class BusinessHost extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_BUSINESS_HOST_GROUP = "business_host_group";

    @SerializedName(SERIALIZED_NAME_BUSINESS_HOST_GROUP)
    private NestedBusinessHostGroup businessHostGroup;

    public static final String SERIALIZED_NAME_CLUSTER = "cluster";

    @SerializedName(SERIALIZED_NAME_CLUSTER)
    private NestedCluster cluster;

    public static final String SERIALIZED_NAME_DESCRIPTION = "description";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION)
    private String description;

    public static final String SERIALIZED_NAME_ENTITY_ASYNC_STATUS = "entityAsyncStatus";

    @SerializedName(SERIALIZED_NAME_ENTITY_ASYNC_STATUS)
    private EntityAsyncStatus entityAsyncStatus;

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

    public static final String SERIALIZED_NAME_INITIATORS = "initiators";

    @SerializedName(SERIALIZED_NAME_INITIATORS)
    private List<NestedInitiator> initiators = new ArrayList<NestedInitiator>();

    public static final String SERIALIZED_NAME_ISCSI_LUNS = "iscsi_luns";

    @SerializedName(SERIALIZED_NAME_ISCSI_LUNS)
    private List<NestedIscsiLun> iscsiLuns = null;

    public static final String SERIALIZED_NAME_ISCSI_TARGETS = "iscsi_targets";

    @SerializedName(SERIALIZED_NAME_ISCSI_TARGETS)
    private List<NestedIscsiTarget> iscsiTargets = null;

    public static final String SERIALIZED_NAME_LABELS = "labels";

    @SerializedName(SERIALIZED_NAME_LABELS)
    private List<NestedLabel> labels = null;

    public static final String SERIALIZED_NAME_LOCAL_ID = "local_id";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID)
    private String localId;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_NVMF_NAMESPACES = "nvmf_namespaces";

    @SerializedName(SERIALIZED_NAME_NVMF_NAMESPACES)
    private List<NestedNvmfNamespace> nvmfNamespaces = null;

    public static final String SERIALIZED_NAME_NVMF_SUBSYSTEMS = "nvmf_subsystems";

    @SerializedName(SERIALIZED_NAME_NVMF_SUBSYSTEMS)
    private List<NestedNvmfSubsystem> nvmfSubsystems = null;

    public BusinessHost() {}

    public BusinessHost businessHostGroup(NestedBusinessHostGroup businessHostGroup) {

        this.businessHostGroup = businessHostGroup;
        return this;
    }

    /**
     * Get businessHostGroup
     *
     * @return businessHostGroup
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NestedBusinessHostGroup getBusinessHostGroup() {
        return businessHostGroup;
    }

    public void setBusinessHostGroup(NestedBusinessHostGroup businessHostGroup) {
        this.businessHostGroup = businessHostGroup;
    }

    public BusinessHost businessHostGroup_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BUSINESS_HOST_GROUP);
        return this;
    }

    public BusinessHost businessHostGroup_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BUSINESS_HOST_GROUP);
        return this;
    }

    public void setBusinessHostGroup_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BUSINESS_HOST_GROUP);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BUSINESS_HOST_GROUP);
        }
    }

    public boolean getBusinessHostGroup_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BUSINESS_HOST_GROUP);
    }

    public BusinessHost cluster(NestedCluster cluster) {

        this.cluster = cluster;
        return this;
    }

    /**
     * Get cluster
     *
     * @return cluster
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public NestedCluster getCluster() {
        return cluster;
    }

    public void setCluster(NestedCluster cluster) {
        this.cluster = cluster;
    }

    public BusinessHost cluster_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER);
        return this;
    }

    public BusinessHost cluster_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLUSTER);
        return this;
    }

    public void setCluster_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLUSTER);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLUSTER);
        }
    }

    public boolean getCluster_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLUSTER);
    }

    public BusinessHost description(String description) {

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

    public BusinessHost description_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION);
        return this;
    }

    public BusinessHost description_ExplictlyNonNull() {
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

    public BusinessHost entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {

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

    public BusinessHost entityAsyncStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        return this;
    }

    public BusinessHost entityAsyncStatus_ExplictlyNonNull() {
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

    public BusinessHost id(String id) {

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

    public BusinessHost id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public BusinessHost id_ExplictlyNonNull() {
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

    public BusinessHost initiators(List<NestedInitiator> initiators) {

        this.initiators = initiators;
        return this;
    }

    public BusinessHost addInitiatorsItem(NestedInitiator initiatorsItem) {
        this.initiators.add(initiatorsItem);
        return this;
    }

    /**
     * Get initiators
     *
     * @return initiators
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public List<NestedInitiator> getInitiators() {
        return initiators;
    }

    public void setInitiators(List<NestedInitiator> initiators) {
        this.initiators = initiators;
    }

    public BusinessHost initiators_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_INITIATORS);
        return this;
    }

    public BusinessHost initiators_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_INITIATORS);
        return this;
    }

    public void setInitiators_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_INITIATORS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_INITIATORS);
        }
    }

    public boolean getInitiators_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_INITIATORS);
    }

    public BusinessHost iscsiLuns(List<NestedIscsiLun> iscsiLuns) {

        this.iscsiLuns = iscsiLuns;
        return this;
    }

    public BusinessHost addIscsiLunsItem(NestedIscsiLun iscsiLunsItem) {
        if (this.iscsiLuns == null) {
            this.iscsiLuns = new ArrayList<NestedIscsiLun>();
        }
        this.iscsiLuns.add(iscsiLunsItem);
        return this;
    }

    /**
     * Get iscsiLuns
     *
     * @return iscsiLuns
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedIscsiLun> getIscsiLuns() {
        return iscsiLuns;
    }

    public void setIscsiLuns(List<NestedIscsiLun> iscsiLuns) {
        this.iscsiLuns = iscsiLuns;
    }

    public BusinessHost iscsiLuns_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_LUNS);
        return this;
    }

    public BusinessHost iscsiLuns_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_LUNS);
        return this;
    }

    public void setIscsiLuns_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_LUNS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_LUNS);
        }
    }

    public boolean getIscsiLuns_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_LUNS);
    }

    public BusinessHost iscsiTargets(List<NestedIscsiTarget> iscsiTargets) {

        this.iscsiTargets = iscsiTargets;
        return this;
    }

    public BusinessHost addIscsiTargetsItem(NestedIscsiTarget iscsiTargetsItem) {
        if (this.iscsiTargets == null) {
            this.iscsiTargets = new ArrayList<NestedIscsiTarget>();
        }
        this.iscsiTargets.add(iscsiTargetsItem);
        return this;
    }

    /**
     * Get iscsiTargets
     *
     * @return iscsiTargets
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedIscsiTarget> getIscsiTargets() {
        return iscsiTargets;
    }

    public void setIscsiTargets(List<NestedIscsiTarget> iscsiTargets) {
        this.iscsiTargets = iscsiTargets;
    }

    public BusinessHost iscsiTargets_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_TARGETS);
        return this;
    }

    public BusinessHost iscsiTargets_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_TARGETS);
        return this;
    }

    public void setIscsiTargets_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_TARGETS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_TARGETS);
        }
    }

    public boolean getIscsiTargets_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_TARGETS);
    }

    public BusinessHost labels(List<NestedLabel> labels) {

        this.labels = labels;
        return this;
    }

    public BusinessHost addLabelsItem(NestedLabel labelsItem) {
        if (this.labels == null) {
            this.labels = new ArrayList<NestedLabel>();
        }
        this.labels.add(labelsItem);
        return this;
    }

    /**
     * Get labels
     *
     * @return labels
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedLabel> getLabels() {
        return labels;
    }

    public void setLabels(List<NestedLabel> labels) {
        this.labels = labels;
    }

    public BusinessHost labels_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LABELS);
        return this;
    }

    public BusinessHost labels_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LABELS);
        return this;
    }

    public void setLabels_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LABELS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LABELS);
        }
    }

    public boolean getLabels_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LABELS);
    }

    public BusinessHost localId(String localId) {

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

    public BusinessHost localId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID);
        return this;
    }

    public BusinessHost localId_ExplictlyNonNull() {
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

    public BusinessHost name(String name) {

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

    public BusinessHost name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public BusinessHost name_ExplictlyNonNull() {
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

    public BusinessHost nvmfNamespaces(List<NestedNvmfNamespace> nvmfNamespaces) {

        this.nvmfNamespaces = nvmfNamespaces;
        return this;
    }

    public BusinessHost addNvmfNamespacesItem(NestedNvmfNamespace nvmfNamespacesItem) {
        if (this.nvmfNamespaces == null) {
            this.nvmfNamespaces = new ArrayList<NestedNvmfNamespace>();
        }
        this.nvmfNamespaces.add(nvmfNamespacesItem);
        return this;
    }

    /**
     * Get nvmfNamespaces
     *
     * @return nvmfNamespaces
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedNvmfNamespace> getNvmfNamespaces() {
        return nvmfNamespaces;
    }

    public void setNvmfNamespaces(List<NestedNvmfNamespace> nvmfNamespaces) {
        this.nvmfNamespaces = nvmfNamespaces;
    }

    public BusinessHost nvmfNamespaces_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NVMF_NAMESPACES);
        return this;
    }

    public BusinessHost nvmfNamespaces_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NVMF_NAMESPACES);
        return this;
    }

    public void setNvmfNamespaces_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NVMF_NAMESPACES);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NVMF_NAMESPACES);
        }
    }

    public boolean getNvmfNamespaces_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NVMF_NAMESPACES);
    }

    public BusinessHost nvmfSubsystems(List<NestedNvmfSubsystem> nvmfSubsystems) {

        this.nvmfSubsystems = nvmfSubsystems;
        return this;
    }

    public BusinessHost addNvmfSubsystemsItem(NestedNvmfSubsystem nvmfSubsystemsItem) {
        if (this.nvmfSubsystems == null) {
            this.nvmfSubsystems = new ArrayList<NestedNvmfSubsystem>();
        }
        this.nvmfSubsystems.add(nvmfSubsystemsItem);
        return this;
    }

    /**
     * Get nvmfSubsystems
     *
     * @return nvmfSubsystems
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedNvmfSubsystem> getNvmfSubsystems() {
        return nvmfSubsystems;
    }

    public void setNvmfSubsystems(List<NestedNvmfSubsystem> nvmfSubsystems) {
        this.nvmfSubsystems = nvmfSubsystems;
    }

    public BusinessHost nvmfSubsystems_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NVMF_SUBSYSTEMS);
        return this;
    }

    public BusinessHost nvmfSubsystems_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NVMF_SUBSYSTEMS);
        return this;
    }

    public void setNvmfSubsystems_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NVMF_SUBSYSTEMS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NVMF_SUBSYSTEMS);
        }
    }

    public boolean getNvmfSubsystems_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NVMF_SUBSYSTEMS);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BusinessHost businessHost = (BusinessHost) o;
        return Objects.equals(this.businessHostGroup, businessHost.businessHostGroup)
                && Objects.equals(this.cluster, businessHost.cluster)
                && Objects.equals(this.description, businessHost.description)
                && Objects.equals(this.entityAsyncStatus, businessHost.entityAsyncStatus)
                && Objects.equals(this.id, businessHost.id)
                && Objects.equals(this.initiators, businessHost.initiators)
                && Objects.equals(this.iscsiLuns, businessHost.iscsiLuns)
                && Objects.equals(this.iscsiTargets, businessHost.iscsiTargets)
                && Objects.equals(this.labels, businessHost.labels)
                && Objects.equals(this.localId, businessHost.localId)
                && Objects.equals(this.name, businessHost.name)
                && Objects.equals(this.nvmfNamespaces, businessHost.nvmfNamespaces)
                && Objects.equals(this.nvmfSubsystems, businessHost.nvmfSubsystems);
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
                businessHostGroup,
                cluster,
                description,
                entityAsyncStatus,
                id,
                initiators,
                iscsiLuns,
                iscsiTargets,
                labels,
                localId,
                name,
                nvmfNamespaces,
                nvmfSubsystems);
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
        sb.append("class BusinessHost {\n");
        sb.append("    businessHostGroup: ")
                .append(toIndentedString(businessHostGroup))
                .append("\n");
        sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    entityAsyncStatus: ")
                .append(toIndentedString(entityAsyncStatus))
                .append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    initiators: ").append(toIndentedString(initiators)).append("\n");
        sb.append("    iscsiLuns: ").append(toIndentedString(iscsiLuns)).append("\n");
        sb.append("    iscsiTargets: ").append(toIndentedString(iscsiTargets)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    nvmfNamespaces: ").append(toIndentedString(nvmfNamespaces)).append("\n");
        sb.append("    nvmfSubsystems: ").append(toIndentedString(nvmfSubsystems)).append("\n");
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

package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** BusinessHostGroup */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class BusinessHostGroup extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_BUSINESS_HOSTS = "business_hosts";

    @SerializedName(SERIALIZED_NAME_BUSINESS_HOSTS)
    private List<NestedBusinessHost> businessHosts = null;

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

    public static final String SERIALIZED_NAME_ISCSI_LUNS = "iscsi_luns";

    @SerializedName(SERIALIZED_NAME_ISCSI_LUNS)
    private List<NestedIscsiLun> iscsiLuns = null;

    public static final String SERIALIZED_NAME_ISCSI_TARGETS = "iscsi_targets";

    @SerializedName(SERIALIZED_NAME_ISCSI_TARGETS)
    private List<NestedIscsiTarget> iscsiTargets = null;

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

    public BusinessHostGroup() {}

    public BusinessHostGroup businessHosts(List<NestedBusinessHost> businessHosts) {

        this.businessHosts = businessHosts;
        return this;
    }

    public BusinessHostGroup addBusinessHostsItem(NestedBusinessHost businessHostsItem) {
        if (this.businessHosts == null) {
            this.businessHosts = new ArrayList<NestedBusinessHost>();
        }
        this.businessHosts.add(businessHostsItem);
        return this;
    }

    /**
     * Get businessHosts
     *
     * @return businessHosts
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedBusinessHost> getBusinessHosts() {
        return businessHosts;
    }

    public void setBusinessHosts(List<NestedBusinessHost> businessHosts) {
        this.businessHosts = businessHosts;
    }

    public BusinessHostGroup businessHosts_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BUSINESS_HOSTS);
        return this;
    }

    public BusinessHostGroup businessHosts_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BUSINESS_HOSTS);
        return this;
    }

    public void setBusinessHosts_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BUSINESS_HOSTS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BUSINESS_HOSTS);
        }
    }

    public boolean getBusinessHosts_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BUSINESS_HOSTS);
    }

    public BusinessHostGroup cluster(NestedCluster cluster) {

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

    public BusinessHostGroup cluster_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER);
        return this;
    }

    public BusinessHostGroup cluster_ExplictlyNonNull() {
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

    public BusinessHostGroup description(String description) {

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

    public BusinessHostGroup description_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION);
        return this;
    }

    public BusinessHostGroup description_ExplictlyNonNull() {
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

    public BusinessHostGroup entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {

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

    public BusinessHostGroup entityAsyncStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        return this;
    }

    public BusinessHostGroup entityAsyncStatus_ExplictlyNonNull() {
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

    public BusinessHostGroup id(String id) {

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

    public BusinessHostGroup id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public BusinessHostGroup id_ExplictlyNonNull() {
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

    public BusinessHostGroup iscsiLuns(List<NestedIscsiLun> iscsiLuns) {

        this.iscsiLuns = iscsiLuns;
        return this;
    }

    public BusinessHostGroup addIscsiLunsItem(NestedIscsiLun iscsiLunsItem) {
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

    public BusinessHostGroup iscsiLuns_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_LUNS);
        return this;
    }

    public BusinessHostGroup iscsiLuns_ExplictlyNonNull() {
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

    public BusinessHostGroup iscsiTargets(List<NestedIscsiTarget> iscsiTargets) {

        this.iscsiTargets = iscsiTargets;
        return this;
    }

    public BusinessHostGroup addIscsiTargetsItem(NestedIscsiTarget iscsiTargetsItem) {
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

    public BusinessHostGroup iscsiTargets_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_TARGETS);
        return this;
    }

    public BusinessHostGroup iscsiTargets_ExplictlyNonNull() {
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

    public BusinessHostGroup localId(String localId) {

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

    public BusinessHostGroup localId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID);
        return this;
    }

    public BusinessHostGroup localId_ExplictlyNonNull() {
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

    public BusinessHostGroup name(String name) {

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

    public BusinessHostGroup name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public BusinessHostGroup name_ExplictlyNonNull() {
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

    public BusinessHostGroup nvmfNamespaces(List<NestedNvmfNamespace> nvmfNamespaces) {

        this.nvmfNamespaces = nvmfNamespaces;
        return this;
    }

    public BusinessHostGroup addNvmfNamespacesItem(NestedNvmfNamespace nvmfNamespacesItem) {
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

    public BusinessHostGroup nvmfNamespaces_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NVMF_NAMESPACES);
        return this;
    }

    public BusinessHostGroup nvmfNamespaces_ExplictlyNonNull() {
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

    public BusinessHostGroup nvmfSubsystems(List<NestedNvmfSubsystem> nvmfSubsystems) {

        this.nvmfSubsystems = nvmfSubsystems;
        return this;
    }

    public BusinessHostGroup addNvmfSubsystemsItem(NestedNvmfSubsystem nvmfSubsystemsItem) {
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

    public BusinessHostGroup nvmfSubsystems_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NVMF_SUBSYSTEMS);
        return this;
    }

    public BusinessHostGroup nvmfSubsystems_ExplictlyNonNull() {
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
        BusinessHostGroup businessHostGroup = (BusinessHostGroup) o;
        return Objects.equals(this.businessHosts, businessHostGroup.businessHosts)
                && Objects.equals(this.cluster, businessHostGroup.cluster)
                && Objects.equals(this.description, businessHostGroup.description)
                && Objects.equals(this.entityAsyncStatus, businessHostGroup.entityAsyncStatus)
                && Objects.equals(this.id, businessHostGroup.id)
                && Objects.equals(this.iscsiLuns, businessHostGroup.iscsiLuns)
                && Objects.equals(this.iscsiTargets, businessHostGroup.iscsiTargets)
                && Objects.equals(this.localId, businessHostGroup.localId)
                && Objects.equals(this.name, businessHostGroup.name)
                && Objects.equals(this.nvmfNamespaces, businessHostGroup.nvmfNamespaces)
                && Objects.equals(this.nvmfSubsystems, businessHostGroup.nvmfSubsystems);
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
                businessHosts,
                cluster,
                description,
                entityAsyncStatus,
                id,
                iscsiLuns,
                iscsiTargets,
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
        sb.append("class BusinessHostGroup {\n");
        sb.append("    businessHosts: ").append(toIndentedString(businessHosts)).append("\n");
        sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    entityAsyncStatus: ")
                .append(toIndentedString(entityAsyncStatus))
                .append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    iscsiLuns: ").append(toIndentedString(iscsiLuns)).append("\n");
        sb.append("    iscsiTargets: ").append(toIndentedString(iscsiTargets)).append("\n");
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

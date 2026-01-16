package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** VmPlacementGroup */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VmPlacementGroup extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_CLUSTER = "cluster";

    @SerializedName(SERIALIZED_NAME_CLUSTER)
    private NestedCluster cluster;

    public static final String SERIALIZED_NAME_DESCRIPTION = "description";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION)
    private String description;

    public static final String SERIALIZED_NAME_ENABLED = "enabled";

    @SerializedName(SERIALIZED_NAME_ENABLED)
    private Boolean enabled;

    public static final String SERIALIZED_NAME_ENTITY_ASYNC_STATUS = "entityAsyncStatus";

    @SerializedName(SERIALIZED_NAME_ENTITY_ASYNC_STATUS)
    private EntityAsyncStatus entityAsyncStatus;

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

    public static final String SERIALIZED_NAME_LOCAL_CREATED_AT = "local_created_at";

    @SerializedName(SERIALIZED_NAME_LOCAL_CREATED_AT)
    private String localCreatedAt;

    public static final String SERIALIZED_NAME_LOCAL_ID = "local_id";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID)
    private String localId;

    public static final String SERIALIZED_NAME_LOCAL_UPDATED_AT = "local_updated_at";

    @SerializedName(SERIALIZED_NAME_LOCAL_UPDATED_AT)
    private String localUpdatedAt;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_VM_HOST_MUST_ENABLED = "vm_host_must_enabled";

    @SerializedName(SERIALIZED_NAME_VM_HOST_MUST_ENABLED)
    private Boolean vmHostMustEnabled;

    public static final String SERIALIZED_NAME_VM_HOST_MUST_HOST_UUIDS = "vm_host_must_host_uuids";

    @SerializedName(SERIALIZED_NAME_VM_HOST_MUST_HOST_UUIDS)
    private List<NestedHost> vmHostMustHostUuids = null;

    public static final String SERIALIZED_NAME_VM_HOST_MUST_POLICY = "vm_host_must_policy";

    @SerializedName(SERIALIZED_NAME_VM_HOST_MUST_POLICY)
    private Boolean vmHostMustPolicy;

    public static final String SERIALIZED_NAME_VM_HOST_PREFER_ENABLED = "vm_host_prefer_enabled";

    @SerializedName(SERIALIZED_NAME_VM_HOST_PREFER_ENABLED)
    private Boolean vmHostPreferEnabled;

    public static final String SERIALIZED_NAME_VM_HOST_PREFER_HOST_UUIDS =
            "vm_host_prefer_host_uuids";

    @SerializedName(SERIALIZED_NAME_VM_HOST_PREFER_HOST_UUIDS)
    private List<NestedHost> vmHostPreferHostUuids = null;

    public static final String SERIALIZED_NAME_VM_HOST_PREFER_POLICY = "vm_host_prefer_policy";

    @SerializedName(SERIALIZED_NAME_VM_HOST_PREFER_POLICY)
    private Boolean vmHostPreferPolicy;

    public static final String SERIALIZED_NAME_VM_VM_POLICY = "vm_vm_policy";

    @SerializedName(SERIALIZED_NAME_VM_VM_POLICY)
    private VmVmPolicy vmVmPolicy;

    public static final String SERIALIZED_NAME_VM_VM_POLICY_ENABLED = "vm_vm_policy_enabled";

    @SerializedName(SERIALIZED_NAME_VM_VM_POLICY_ENABLED)
    private Boolean vmVmPolicyEnabled;

    public static final String SERIALIZED_NAME_VMS = "vms";

    @SerializedName(SERIALIZED_NAME_VMS)
    private List<NestedVm> vms = null;

    public VmPlacementGroup() {}

    public VmPlacementGroup cluster(NestedCluster cluster) {

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

    public VmPlacementGroup cluster_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER);
        return this;
    }

    public VmPlacementGroup cluster_ExplictlyNonNull() {
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

    public VmPlacementGroup description(String description) {

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

    public VmPlacementGroup description_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION);
        return this;
    }

    public VmPlacementGroup description_ExplictlyNonNull() {
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

    public VmPlacementGroup enabled(Boolean enabled) {

        this.enabled = enabled;
        return this;
    }

    /**
     * Get enabled
     *
     * @return enabled
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public VmPlacementGroup enabled_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENABLED);
        return this;
    }

    public VmPlacementGroup enabled_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ENABLED);
        return this;
    }

    public void setEnabled_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ENABLED);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ENABLED);
        }
    }

    public boolean getEnabled_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ENABLED);
    }

    public VmPlacementGroup entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {

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

    public VmPlacementGroup entityAsyncStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        return this;
    }

    public VmPlacementGroup entityAsyncStatus_ExplictlyNonNull() {
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

    public VmPlacementGroup id(String id) {

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

    public VmPlacementGroup id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public VmPlacementGroup id_ExplictlyNonNull() {
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

    public VmPlacementGroup localCreatedAt(String localCreatedAt) {

        this.localCreatedAt = localCreatedAt;
        return this;
    }

    /**
     * Get localCreatedAt
     *
     * @return localCreatedAt
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getLocalCreatedAt() {
        return localCreatedAt;
    }

    public void setLocalCreatedAt(String localCreatedAt) {
        this.localCreatedAt = localCreatedAt;
    }

    public VmPlacementGroup localCreatedAt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATED_AT);
        return this;
    }

    public VmPlacementGroup localCreatedAt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_CREATED_AT);
        return this;
    }

    public void setLocalCreatedAt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATED_AT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_CREATED_AT);
        }
    }

    public boolean getLocalCreatedAt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_CREATED_AT);
    }

    public VmPlacementGroup localId(String localId) {

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

    public VmPlacementGroup localId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID);
        return this;
    }

    public VmPlacementGroup localId_ExplictlyNonNull() {
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

    public VmPlacementGroup localUpdatedAt(String localUpdatedAt) {

        this.localUpdatedAt = localUpdatedAt;
        return this;
    }

    /**
     * Get localUpdatedAt
     *
     * @return localUpdatedAt
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getLocalUpdatedAt() {
        return localUpdatedAt;
    }

    public void setLocalUpdatedAt(String localUpdatedAt) {
        this.localUpdatedAt = localUpdatedAt;
    }

    public VmPlacementGroup localUpdatedAt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_UPDATED_AT);
        return this;
    }

    public VmPlacementGroup localUpdatedAt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_UPDATED_AT);
        return this;
    }

    public void setLocalUpdatedAt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_UPDATED_AT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_UPDATED_AT);
        }
    }

    public boolean getLocalUpdatedAt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_UPDATED_AT);
    }

    public VmPlacementGroup name(String name) {

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

    public VmPlacementGroup name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public VmPlacementGroup name_ExplictlyNonNull() {
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

    public VmPlacementGroup vmHostMustEnabled(Boolean vmHostMustEnabled) {

        this.vmHostMustEnabled = vmHostMustEnabled;
        return this;
    }

    /**
     * Get vmHostMustEnabled
     *
     * @return vmHostMustEnabled
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Boolean getVmHostMustEnabled() {
        return vmHostMustEnabled;
    }

    public void setVmHostMustEnabled(Boolean vmHostMustEnabled) {
        this.vmHostMustEnabled = vmHostMustEnabled;
    }

    public VmPlacementGroup vmHostMustEnabled_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_HOST_MUST_ENABLED);
        return this;
    }

    public VmPlacementGroup vmHostMustEnabled_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_HOST_MUST_ENABLED);
        return this;
    }

    public void setVmHostMustEnabled_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_HOST_MUST_ENABLED);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_HOST_MUST_ENABLED);
        }
    }

    public boolean getVmHostMustEnabled_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_HOST_MUST_ENABLED);
    }

    public VmPlacementGroup vmHostMustHostUuids(List<NestedHost> vmHostMustHostUuids) {

        this.vmHostMustHostUuids = vmHostMustHostUuids;
        return this;
    }

    public VmPlacementGroup addVmHostMustHostUuidsItem(NestedHost vmHostMustHostUuidsItem) {
        if (this.vmHostMustHostUuids == null) {
            this.vmHostMustHostUuids = new ArrayList<NestedHost>();
        }
        this.vmHostMustHostUuids.add(vmHostMustHostUuidsItem);
        return this;
    }

    /**
     * Get vmHostMustHostUuids
     *
     * @return vmHostMustHostUuids
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedHost> getVmHostMustHostUuids() {
        return vmHostMustHostUuids;
    }

    public void setVmHostMustHostUuids(List<NestedHost> vmHostMustHostUuids) {
        this.vmHostMustHostUuids = vmHostMustHostUuids;
    }

    public VmPlacementGroup vmHostMustHostUuids_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_HOST_MUST_HOST_UUIDS);
        return this;
    }

    public VmPlacementGroup vmHostMustHostUuids_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_HOST_MUST_HOST_UUIDS);
        return this;
    }

    public void setVmHostMustHostUuids_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_HOST_MUST_HOST_UUIDS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_HOST_MUST_HOST_UUIDS);
        }
    }

    public boolean getVmHostMustHostUuids_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_HOST_MUST_HOST_UUIDS);
    }

    public VmPlacementGroup vmHostMustPolicy(Boolean vmHostMustPolicy) {

        this.vmHostMustPolicy = vmHostMustPolicy;
        return this;
    }

    /**
     * Get vmHostMustPolicy
     *
     * @return vmHostMustPolicy
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Boolean getVmHostMustPolicy() {
        return vmHostMustPolicy;
    }

    public void setVmHostMustPolicy(Boolean vmHostMustPolicy) {
        this.vmHostMustPolicy = vmHostMustPolicy;
    }

    public VmPlacementGroup vmHostMustPolicy_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_HOST_MUST_POLICY);
        return this;
    }

    public VmPlacementGroup vmHostMustPolicy_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_HOST_MUST_POLICY);
        return this;
    }

    public void setVmHostMustPolicy_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_HOST_MUST_POLICY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_HOST_MUST_POLICY);
        }
    }

    public boolean getVmHostMustPolicy_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_HOST_MUST_POLICY);
    }

    public VmPlacementGroup vmHostPreferEnabled(Boolean vmHostPreferEnabled) {

        this.vmHostPreferEnabled = vmHostPreferEnabled;
        return this;
    }

    /**
     * Get vmHostPreferEnabled
     *
     * @return vmHostPreferEnabled
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Boolean getVmHostPreferEnabled() {
        return vmHostPreferEnabled;
    }

    public void setVmHostPreferEnabled(Boolean vmHostPreferEnabled) {
        this.vmHostPreferEnabled = vmHostPreferEnabled;
    }

    public VmPlacementGroup vmHostPreferEnabled_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_HOST_PREFER_ENABLED);
        return this;
    }

    public VmPlacementGroup vmHostPreferEnabled_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_HOST_PREFER_ENABLED);
        return this;
    }

    public void setVmHostPreferEnabled_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_HOST_PREFER_ENABLED);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_HOST_PREFER_ENABLED);
        }
    }

    public boolean getVmHostPreferEnabled_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_HOST_PREFER_ENABLED);
    }

    public VmPlacementGroup vmHostPreferHostUuids(List<NestedHost> vmHostPreferHostUuids) {

        this.vmHostPreferHostUuids = vmHostPreferHostUuids;
        return this;
    }

    public VmPlacementGroup addVmHostPreferHostUuidsItem(NestedHost vmHostPreferHostUuidsItem) {
        if (this.vmHostPreferHostUuids == null) {
            this.vmHostPreferHostUuids = new ArrayList<NestedHost>();
        }
        this.vmHostPreferHostUuids.add(vmHostPreferHostUuidsItem);
        return this;
    }

    /**
     * Get vmHostPreferHostUuids
     *
     * @return vmHostPreferHostUuids
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<NestedHost> getVmHostPreferHostUuids() {
        return vmHostPreferHostUuids;
    }

    public void setVmHostPreferHostUuids(List<NestedHost> vmHostPreferHostUuids) {
        this.vmHostPreferHostUuids = vmHostPreferHostUuids;
    }

    public VmPlacementGroup vmHostPreferHostUuids_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_HOST_PREFER_HOST_UUIDS);
        return this;
    }

    public VmPlacementGroup vmHostPreferHostUuids_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_HOST_PREFER_HOST_UUIDS);
        return this;
    }

    public void setVmHostPreferHostUuids_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_HOST_PREFER_HOST_UUIDS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_HOST_PREFER_HOST_UUIDS);
        }
    }

    public boolean getVmHostPreferHostUuids_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_HOST_PREFER_HOST_UUIDS);
    }

    public VmPlacementGroup vmHostPreferPolicy(Boolean vmHostPreferPolicy) {

        this.vmHostPreferPolicy = vmHostPreferPolicy;
        return this;
    }

    /**
     * Get vmHostPreferPolicy
     *
     * @return vmHostPreferPolicy
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Boolean getVmHostPreferPolicy() {
        return vmHostPreferPolicy;
    }

    public void setVmHostPreferPolicy(Boolean vmHostPreferPolicy) {
        this.vmHostPreferPolicy = vmHostPreferPolicy;
    }

    public VmPlacementGroup vmHostPreferPolicy_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_HOST_PREFER_POLICY);
        return this;
    }

    public VmPlacementGroup vmHostPreferPolicy_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_HOST_PREFER_POLICY);
        return this;
    }

    public void setVmHostPreferPolicy_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_HOST_PREFER_POLICY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_HOST_PREFER_POLICY);
        }
    }

    public boolean getVmHostPreferPolicy_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_HOST_PREFER_POLICY);
    }

    public VmPlacementGroup vmVmPolicy(VmVmPolicy vmVmPolicy) {

        this.vmVmPolicy = vmVmPolicy;
        return this;
    }

    /**
     * Get vmVmPolicy
     *
     * @return vmVmPolicy
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public VmVmPolicy getVmVmPolicy() {
        return vmVmPolicy;
    }

    public void setVmVmPolicy(VmVmPolicy vmVmPolicy) {
        this.vmVmPolicy = vmVmPolicy;
    }

    public VmPlacementGroup vmVmPolicy_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_VM_POLICY);
        return this;
    }

    public VmPlacementGroup vmVmPolicy_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_VM_POLICY);
        return this;
    }

    public void setVmVmPolicy_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_VM_POLICY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_VM_POLICY);
        }
    }

    public boolean getVmVmPolicy_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_VM_POLICY);
    }

    public VmPlacementGroup vmVmPolicyEnabled(Boolean vmVmPolicyEnabled) {

        this.vmVmPolicyEnabled = vmVmPolicyEnabled;
        return this;
    }

    /**
     * Get vmVmPolicyEnabled
     *
     * @return vmVmPolicyEnabled
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Boolean getVmVmPolicyEnabled() {
        return vmVmPolicyEnabled;
    }

    public void setVmVmPolicyEnabled(Boolean vmVmPolicyEnabled) {
        this.vmVmPolicyEnabled = vmVmPolicyEnabled;
    }

    public VmPlacementGroup vmVmPolicyEnabled_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_VM_POLICY_ENABLED);
        return this;
    }

    public VmPlacementGroup vmVmPolicyEnabled_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_VM_POLICY_ENABLED);
        return this;
    }

    public void setVmVmPolicyEnabled_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_VM_POLICY_ENABLED);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_VM_POLICY_ENABLED);
        }
    }

    public boolean getVmVmPolicyEnabled_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_VM_POLICY_ENABLED);
    }

    public VmPlacementGroup vms(List<NestedVm> vms) {

        this.vms = vms;
        return this;
    }

    public VmPlacementGroup addVmsItem(NestedVm vmsItem) {
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

    public VmPlacementGroup vms_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VMS);
        return this;
    }

    public VmPlacementGroup vms_ExplictlyNonNull() {
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
        VmPlacementGroup vmPlacementGroup = (VmPlacementGroup) o;
        return Objects.equals(this.cluster, vmPlacementGroup.cluster)
                && Objects.equals(this.description, vmPlacementGroup.description)
                && Objects.equals(this.enabled, vmPlacementGroup.enabled)
                && Objects.equals(this.entityAsyncStatus, vmPlacementGroup.entityAsyncStatus)
                && Objects.equals(this.id, vmPlacementGroup.id)
                && Objects.equals(this.localCreatedAt, vmPlacementGroup.localCreatedAt)
                && Objects.equals(this.localId, vmPlacementGroup.localId)
                && Objects.equals(this.localUpdatedAt, vmPlacementGroup.localUpdatedAt)
                && Objects.equals(this.name, vmPlacementGroup.name)
                && Objects.equals(this.vmHostMustEnabled, vmPlacementGroup.vmHostMustEnabled)
                && Objects.equals(this.vmHostMustHostUuids, vmPlacementGroup.vmHostMustHostUuids)
                && Objects.equals(this.vmHostMustPolicy, vmPlacementGroup.vmHostMustPolicy)
                && Objects.equals(this.vmHostPreferEnabled, vmPlacementGroup.vmHostPreferEnabled)
                && Objects.equals(
                        this.vmHostPreferHostUuids, vmPlacementGroup.vmHostPreferHostUuids)
                && Objects.equals(this.vmHostPreferPolicy, vmPlacementGroup.vmHostPreferPolicy)
                && Objects.equals(this.vmVmPolicy, vmPlacementGroup.vmVmPolicy)
                && Objects.equals(this.vmVmPolicyEnabled, vmPlacementGroup.vmVmPolicyEnabled)
                && Objects.equals(this.vms, vmPlacementGroup.vms);
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
                cluster,
                description,
                enabled,
                entityAsyncStatus,
                id,
                localCreatedAt,
                localId,
                localUpdatedAt,
                name,
                vmHostMustEnabled,
                vmHostMustHostUuids,
                vmHostMustPolicy,
                vmHostPreferEnabled,
                vmHostPreferHostUuids,
                vmHostPreferPolicy,
                vmVmPolicy,
                vmVmPolicyEnabled,
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
        sb.append("class VmPlacementGroup {\n");
        sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    entityAsyncStatus: ")
                .append(toIndentedString(entityAsyncStatus))
                .append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    localCreatedAt: ").append(toIndentedString(localCreatedAt)).append("\n");
        sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
        sb.append("    localUpdatedAt: ").append(toIndentedString(localUpdatedAt)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    vmHostMustEnabled: ")
                .append(toIndentedString(vmHostMustEnabled))
                .append("\n");
        sb.append("    vmHostMustHostUuids: ")
                .append(toIndentedString(vmHostMustHostUuids))
                .append("\n");
        sb.append("    vmHostMustPolicy: ").append(toIndentedString(vmHostMustPolicy)).append("\n");
        sb.append("    vmHostPreferEnabled: ")
                .append(toIndentedString(vmHostPreferEnabled))
                .append("\n");
        sb.append("    vmHostPreferHostUuids: ")
                .append(toIndentedString(vmHostPreferHostUuids))
                .append("\n");
        sb.append("    vmHostPreferPolicy: ")
                .append(toIndentedString(vmHostPreferPolicy))
                .append("\n");
        sb.append("    vmVmPolicy: ").append(toIndentedString(vmVmPolicy)).append("\n");
        sb.append("    vmVmPolicyEnabled: ")
                .append(toIndentedString(vmVmPolicyEnabled))
                .append("\n");
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

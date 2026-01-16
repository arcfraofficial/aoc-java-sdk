package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** VmPlacementGroupCreationParams */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VmPlacementGroupCreationParams
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_VM_VM_POLICY = "vm_vm_policy";

    @SerializedName(SERIALIZED_NAME_VM_VM_POLICY)
    private VmVmPolicy vmVmPolicy;

    public static final String SERIALIZED_NAME_VM_HOST_PREFER_ENABLED = "vm_host_prefer_enabled";

    @SerializedName(SERIALIZED_NAME_VM_HOST_PREFER_ENABLED)
    private Boolean vmHostPreferEnabled;

    public static final String SERIALIZED_NAME_VM_HOST_MUST_POLICY = "vm_host_must_policy";

    @SerializedName(SERIALIZED_NAME_VM_HOST_MUST_POLICY)
    private Boolean vmHostMustPolicy;

    public static final String SERIALIZED_NAME_VM_HOST_MUST_ENABLED = "vm_host_must_enabled";

    @SerializedName(SERIALIZED_NAME_VM_HOST_MUST_ENABLED)
    private Boolean vmHostMustEnabled;

    public static final String SERIALIZED_NAME_VM_HOST_PREFER_POLICY = "vm_host_prefer_policy";

    @SerializedName(SERIALIZED_NAME_VM_HOST_PREFER_POLICY)
    private Boolean vmHostPreferPolicy;

    public static final String SERIALIZED_NAME_VM_VM_POLICY_ENABLED = "vm_vm_policy_enabled";

    @SerializedName(SERIALIZED_NAME_VM_VM_POLICY_ENABLED)
    private Boolean vmVmPolicyEnabled;

    public static final String SERIALIZED_NAME_VMS = "vms";

    @SerializedName(SERIALIZED_NAME_VMS)
    private VmWhereInput vms;

    public static final String SERIALIZED_NAME_PREFER_HOSTS = "prefer_hosts";

    @SerializedName(SERIALIZED_NAME_PREFER_HOSTS)
    private HostWhereInput preferHosts;

    public static final String SERIALIZED_NAME_MUST_HOSTS = "must_hosts";

    @SerializedName(SERIALIZED_NAME_MUST_HOSTS)
    private HostWhereInput mustHosts;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_DESCRIPTION = "description";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION)
    private String description;

    public static final String SERIALIZED_NAME_ENABLED = "enabled";

    @SerializedName(SERIALIZED_NAME_ENABLED)
    private Boolean enabled;

    public static final String SERIALIZED_NAME_CLUSTER_ID = "cluster_id";

    @SerializedName(SERIALIZED_NAME_CLUSTER_ID)
    private String clusterId;

    public VmPlacementGroupCreationParams() {}

    public VmPlacementGroupCreationParams vmVmPolicy(VmVmPolicy vmVmPolicy) {

        this.vmVmPolicy = vmVmPolicy;
        return this;
    }

    /**
     * Get vmVmPolicy
     *
     * @return vmVmPolicy
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmVmPolicy getVmVmPolicy() {
        return vmVmPolicy;
    }

    public void setVmVmPolicy(VmVmPolicy vmVmPolicy) {
        this.vmVmPolicy = vmVmPolicy;
    }

    public VmPlacementGroupCreationParams vmVmPolicy_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_VM_POLICY);
        return this;
    }

    public VmPlacementGroupCreationParams vmVmPolicy_ExplictlyNonNull() {
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

    public VmPlacementGroupCreationParams vmHostPreferEnabled(Boolean vmHostPreferEnabled) {

        this.vmHostPreferEnabled = vmHostPreferEnabled;
        return this;
    }

    /**
     * Get vmHostPreferEnabled
     *
     * @return vmHostPreferEnabled
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getVmHostPreferEnabled() {
        return vmHostPreferEnabled;
    }

    public void setVmHostPreferEnabled(Boolean vmHostPreferEnabled) {
        this.vmHostPreferEnabled = vmHostPreferEnabled;
    }

    public VmPlacementGroupCreationParams vmHostPreferEnabled_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_HOST_PREFER_ENABLED);
        return this;
    }

    public VmPlacementGroupCreationParams vmHostPreferEnabled_ExplictlyNonNull() {
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

    public VmPlacementGroupCreationParams vmHostMustPolicy(Boolean vmHostMustPolicy) {

        this.vmHostMustPolicy = vmHostMustPolicy;
        return this;
    }

    /**
     * Get vmHostMustPolicy
     *
     * @return vmHostMustPolicy
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getVmHostMustPolicy() {
        return vmHostMustPolicy;
    }

    public void setVmHostMustPolicy(Boolean vmHostMustPolicy) {
        this.vmHostMustPolicy = vmHostMustPolicy;
    }

    public VmPlacementGroupCreationParams vmHostMustPolicy_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_HOST_MUST_POLICY);
        return this;
    }

    public VmPlacementGroupCreationParams vmHostMustPolicy_ExplictlyNonNull() {
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

    public VmPlacementGroupCreationParams vmHostMustEnabled(Boolean vmHostMustEnabled) {

        this.vmHostMustEnabled = vmHostMustEnabled;
        return this;
    }

    /**
     * Get vmHostMustEnabled
     *
     * @return vmHostMustEnabled
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getVmHostMustEnabled() {
        return vmHostMustEnabled;
    }

    public void setVmHostMustEnabled(Boolean vmHostMustEnabled) {
        this.vmHostMustEnabled = vmHostMustEnabled;
    }

    public VmPlacementGroupCreationParams vmHostMustEnabled_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_HOST_MUST_ENABLED);
        return this;
    }

    public VmPlacementGroupCreationParams vmHostMustEnabled_ExplictlyNonNull() {
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

    public VmPlacementGroupCreationParams vmHostPreferPolicy(Boolean vmHostPreferPolicy) {

        this.vmHostPreferPolicy = vmHostPreferPolicy;
        return this;
    }

    /**
     * Get vmHostPreferPolicy
     *
     * @return vmHostPreferPolicy
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getVmHostPreferPolicy() {
        return vmHostPreferPolicy;
    }

    public void setVmHostPreferPolicy(Boolean vmHostPreferPolicy) {
        this.vmHostPreferPolicy = vmHostPreferPolicy;
    }

    public VmPlacementGroupCreationParams vmHostPreferPolicy_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_HOST_PREFER_POLICY);
        return this;
    }

    public VmPlacementGroupCreationParams vmHostPreferPolicy_ExplictlyNonNull() {
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

    public VmPlacementGroupCreationParams vmVmPolicyEnabled(Boolean vmVmPolicyEnabled) {

        this.vmVmPolicyEnabled = vmVmPolicyEnabled;
        return this;
    }

    /**
     * Get vmVmPolicyEnabled
     *
     * @return vmVmPolicyEnabled
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getVmVmPolicyEnabled() {
        return vmVmPolicyEnabled;
    }

    public void setVmVmPolicyEnabled(Boolean vmVmPolicyEnabled) {
        this.vmVmPolicyEnabled = vmVmPolicyEnabled;
    }

    public VmPlacementGroupCreationParams vmVmPolicyEnabled_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_VM_POLICY_ENABLED);
        return this;
    }

    public VmPlacementGroupCreationParams vmVmPolicyEnabled_ExplictlyNonNull() {
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

    public VmPlacementGroupCreationParams vms(VmWhereInput vms) {

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

    public VmPlacementGroupCreationParams vms_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VMS);
        return this;
    }

    public VmPlacementGroupCreationParams vms_ExplictlyNonNull() {
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

    public VmPlacementGroupCreationParams preferHosts(HostWhereInput preferHosts) {

        this.preferHosts = preferHosts;
        return this;
    }

    /**
     * Get preferHosts
     *
     * @return preferHosts
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public HostWhereInput getPreferHosts() {
        return preferHosts;
    }

    public void setPreferHosts(HostWhereInput preferHosts) {
        this.preferHosts = preferHosts;
    }

    public VmPlacementGroupCreationParams preferHosts_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PREFER_HOSTS);
        return this;
    }

    public VmPlacementGroupCreationParams preferHosts_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PREFER_HOSTS);
        return this;
    }

    public void setPreferHosts_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PREFER_HOSTS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PREFER_HOSTS);
        }
    }

    public boolean getPreferHosts_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PREFER_HOSTS);
    }

    public VmPlacementGroupCreationParams mustHosts(HostWhereInput mustHosts) {

        this.mustHosts = mustHosts;
        return this;
    }

    /**
     * Get mustHosts
     *
     * @return mustHosts
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public HostWhereInput getMustHosts() {
        return mustHosts;
    }

    public void setMustHosts(HostWhereInput mustHosts) {
        this.mustHosts = mustHosts;
    }

    public VmPlacementGroupCreationParams mustHosts_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MUST_HOSTS);
        return this;
    }

    public VmPlacementGroupCreationParams mustHosts_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MUST_HOSTS);
        return this;
    }

    public void setMustHosts_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MUST_HOSTS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MUST_HOSTS);
        }
    }

    public boolean getMustHosts_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MUST_HOSTS);
    }

    public VmPlacementGroupCreationParams name(String name) {

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

    public VmPlacementGroupCreationParams name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public VmPlacementGroupCreationParams name_ExplictlyNonNull() {
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

    public VmPlacementGroupCreationParams description(String description) {

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

    public VmPlacementGroupCreationParams description_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION);
        return this;
    }

    public VmPlacementGroupCreationParams description_ExplictlyNonNull() {
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

    public VmPlacementGroupCreationParams enabled(Boolean enabled) {

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

    public VmPlacementGroupCreationParams enabled_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENABLED);
        return this;
    }

    public VmPlacementGroupCreationParams enabled_ExplictlyNonNull() {
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

    public VmPlacementGroupCreationParams clusterId(String clusterId) {

        this.clusterId = clusterId;
        return this;
    }

    /**
     * Get clusterId
     *
     * @return clusterId
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public VmPlacementGroupCreationParams clusterId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER_ID);
        return this;
    }

    public VmPlacementGroupCreationParams clusterId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_ID);
        return this;
    }

    public void setClusterId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLUSTER_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_ID);
        }
    }

    public boolean getClusterId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLUSTER_ID);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VmPlacementGroupCreationParams vmPlacementGroupCreationParams =
                (VmPlacementGroupCreationParams) o;
        return Objects.equals(this.vmVmPolicy, vmPlacementGroupCreationParams.vmVmPolicy)
                && Objects.equals(
                        this.vmHostPreferEnabled,
                        vmPlacementGroupCreationParams.vmHostPreferEnabled)
                && Objects.equals(
                        this.vmHostMustPolicy, vmPlacementGroupCreationParams.vmHostMustPolicy)
                && Objects.equals(
                        this.vmHostMustEnabled, vmPlacementGroupCreationParams.vmHostMustEnabled)
                && Objects.equals(
                        this.vmHostPreferPolicy, vmPlacementGroupCreationParams.vmHostPreferPolicy)
                && Objects.equals(
                        this.vmVmPolicyEnabled, vmPlacementGroupCreationParams.vmVmPolicyEnabled)
                && Objects.equals(this.vms, vmPlacementGroupCreationParams.vms)
                && Objects.equals(this.preferHosts, vmPlacementGroupCreationParams.preferHosts)
                && Objects.equals(this.mustHosts, vmPlacementGroupCreationParams.mustHosts)
                && Objects.equals(this.name, vmPlacementGroupCreationParams.name)
                && Objects.equals(this.description, vmPlacementGroupCreationParams.description)
                && Objects.equals(this.enabled, vmPlacementGroupCreationParams.enabled)
                && Objects.equals(this.clusterId, vmPlacementGroupCreationParams.clusterId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                vmVmPolicy,
                vmHostPreferEnabled,
                vmHostMustPolicy,
                vmHostMustEnabled,
                vmHostPreferPolicy,
                vmVmPolicyEnabled,
                vms,
                preferHosts,
                mustHosts,
                name,
                description,
                enabled,
                clusterId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VmPlacementGroupCreationParams {\n");
        sb.append("    vmVmPolicy: ").append(toIndentedString(vmVmPolicy)).append("\n");
        sb.append("    vmHostPreferEnabled: ")
                .append(toIndentedString(vmHostPreferEnabled))
                .append("\n");
        sb.append("    vmHostMustPolicy: ").append(toIndentedString(vmHostMustPolicy)).append("\n");
        sb.append("    vmHostMustEnabled: ")
                .append(toIndentedString(vmHostMustEnabled))
                .append("\n");
        sb.append("    vmHostPreferPolicy: ")
                .append(toIndentedString(vmHostPreferPolicy))
                .append("\n");
        sb.append("    vmVmPolicyEnabled: ")
                .append(toIndentedString(vmVmPolicyEnabled))
                .append("\n");
        sb.append("    vms: ").append(toIndentedString(vms)).append("\n");
        sb.append("    preferHosts: ").append(toIndentedString(preferHosts)).append("\n");
        sb.append("    mustHosts: ").append(toIndentedString(mustHosts)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
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

package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** AddLabelsToResourcesParamsData */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class AddLabelsToResourcesParamsData
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_GPU_DEVICES = "gpu_devices";

    @SerializedName(SERIALIZED_NAME_GPU_DEVICES)
    private GpuDeviceWhereInput gpuDevices;

    public static final String SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATES =
            "content_library_vm_templates";

    @SerializedName(SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATES)
    private ContentLibraryVmTemplateWhereInput contentLibraryVmTemplates;

    public static final String SERIALIZED_NAME_CONTENT_LIBRARY_IMAGES = "content_library_images";

    @SerializedName(SERIALIZED_NAME_CONTENT_LIBRARY_IMAGES)
    private ContentLibraryImageWhereInput contentLibraryImages;

    public static final String SERIALIZED_NAME_ISOLATION_POLICIES = "isolation_policies";

    @SerializedName(SERIALIZED_NAME_ISOLATION_POLICIES)
    private IsolationPolicyWhereInput isolationPolicies;

    public static final String SERIALIZED_NAME_SECURITY_POLICIES = "security_policies";

    @SerializedName(SERIALIZED_NAME_SECURITY_POLICIES)
    private SecurityPolicyWhereInput securityPolicies;

    public static final String SERIALIZED_NAME_VMS = "vms";

    @SerializedName(SERIALIZED_NAME_VMS)
    private VmWhereInput vms;

    public static final String SERIALIZED_NAME_VM_VOLUME_SNAPSHOTS = "vm_volume_snapshots";

    @SerializedName(SERIALIZED_NAME_VM_VOLUME_SNAPSHOTS)
    private VmVolumeSnapshotWhereInput vmVolumeSnapshots;

    public static final String SERIALIZED_NAME_VM_VOLUMES = "vm_volumes";

    @SerializedName(SERIALIZED_NAME_VM_VOLUMES)
    private VmVolumeWhereInput vmVolumes;

    public static final String SERIALIZED_NAME_VM_TEMPLATES = "vm_templates";

    @SerializedName(SERIALIZED_NAME_VM_TEMPLATES)
    private VmTemplateWhereInput vmTemplates;

    public static final String SERIALIZED_NAME_VM_SNAPSHOTS = "vm_snapshots";

    @SerializedName(SERIALIZED_NAME_VM_SNAPSHOTS)
    private VmSnapshotWhereInput vmSnapshots;

    public static final String SERIALIZED_NAME_VLANS = "vlans";

    @SerializedName(SERIALIZED_NAME_VLANS)
    private VlanWhereInput vlans;

    public static final String SERIALIZED_NAME_VDSES = "vdses";

    @SerializedName(SERIALIZED_NAME_VDSES)
    private VdsWhereInput vdses;

    public static final String SERIALIZED_NAME_NVMF_SUBSYSTEMS = "nvmf_subsystems";

    @SerializedName(SERIALIZED_NAME_NVMF_SUBSYSTEMS)
    private NvmfSubsystemWhereInput nvmfSubsystems;

    public static final String SERIALIZED_NAME_NVMF_NAMESPACE_SNAPSHOTS =
            "nvmf_namespace_snapshots";

    @SerializedName(SERIALIZED_NAME_NVMF_NAMESPACE_SNAPSHOTS)
    private NvmfNamespaceSnapshotWhereInput nvmfNamespaceSnapshots;

    public static final String SERIALIZED_NAME_NVMF_NAMESPACES = "nvmf_namespaces";

    @SerializedName(SERIALIZED_NAME_NVMF_NAMESPACES)
    private NvmfNamespaceWhereInput nvmfNamespaces;

    public static final String SERIALIZED_NAME_NICS = "nics";

    @SerializedName(SERIALIZED_NAME_NICS)
    private NicWhereInput nics;

    public static final String SERIALIZED_NAME_NFS_INODES = "nfs_inodes";

    @SerializedName(SERIALIZED_NAME_NFS_INODES)
    private NfsInodeWhereInput nfsInodes;

    public static final String SERIALIZED_NAME_NFS_EXPORTS = "nfs_exports";

    @SerializedName(SERIALIZED_NAME_NFS_EXPORTS)
    private NfsExportWhereInput nfsExports;

    public static final String SERIALIZED_NAME_NAMESPACE_GROUPS = "namespace_groups";

    @SerializedName(SERIALIZED_NAME_NAMESPACE_GROUPS)
    private NamespaceGroupWhereInput namespaceGroups;

    public static final String SERIALIZED_NAME_ISCSI_TARGETS = "iscsi_targets";

    @SerializedName(SERIALIZED_NAME_ISCSI_TARGETS)
    private IscsiTargetWhereInput iscsiTargets;

    public static final String SERIALIZED_NAME_ISCSI_LUN_SNAPSHOTS = "iscsi_lun_snapshots";

    @SerializedName(SERIALIZED_NAME_ISCSI_LUN_SNAPSHOTS)
    private IscsiLunSnapshotWhereInput iscsiLunSnapshots;

    public static final String SERIALIZED_NAME_ISCSI_LUNS = "iscsi_luns";

    @SerializedName(SERIALIZED_NAME_ISCSI_LUNS)
    private IscsiLunWhereInput iscsiLuns;

    public static final String SERIALIZED_NAME_HOSTS = "hosts";

    @SerializedName(SERIALIZED_NAME_HOSTS)
    private HostWhereInput hosts;

    public static final String SERIALIZED_NAME_ELF_IMAGES = "elf_images";

    @SerializedName(SERIALIZED_NAME_ELF_IMAGES)
    private ElfImageWhereInput elfImages;

    public static final String SERIALIZED_NAME_DISKS = "disks";

    @SerializedName(SERIALIZED_NAME_DISKS)
    private DiskWhereInput disks;

    public static final String SERIALIZED_NAME_DATACENTERS = "datacenters";

    @SerializedName(SERIALIZED_NAME_DATACENTERS)
    private DatacenterWhereInput datacenters;

    public static final String SERIALIZED_NAME_CONSISTENCY_GROUP_SNAPSHOTS =
            "consistency_group_snapshots";

    @SerializedName(SERIALIZED_NAME_CONSISTENCY_GROUP_SNAPSHOTS)
    private ConsistencyGroupSnapshotWhereInput consistencyGroupSnapshots;

    public static final String SERIALIZED_NAME_CONSISTENCY_GROUPS = "consistency_groups";

    @SerializedName(SERIALIZED_NAME_CONSISTENCY_GROUPS)
    private ConsistencyGroupWhereInput consistencyGroups;

    public static final String SERIALIZED_NAME_CLUSTERS = "clusters";

    @SerializedName(SERIALIZED_NAME_CLUSTERS)
    private ClusterWhereInput clusters;

    public AddLabelsToResourcesParamsData() {}

    public AddLabelsToResourcesParamsData gpuDevices(GpuDeviceWhereInput gpuDevices) {

        this.gpuDevices = gpuDevices;
        return this;
    }

    /**
     * Get gpuDevices
     *
     * @return gpuDevices
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public GpuDeviceWhereInput getGpuDevices() {
        return gpuDevices;
    }

    public void setGpuDevices(GpuDeviceWhereInput gpuDevices) {
        this.gpuDevices = gpuDevices;
    }

    public AddLabelsToResourcesParamsData gpuDevices_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_GPU_DEVICES);
        return this;
    }

    public AddLabelsToResourcesParamsData gpuDevices_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_GPU_DEVICES);
        return this;
    }

    public void setGpuDevices_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_GPU_DEVICES);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_GPU_DEVICES);
        }
    }

    public boolean getGpuDevices_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_GPU_DEVICES);
    }

    public AddLabelsToResourcesParamsData contentLibraryVmTemplates(
            ContentLibraryVmTemplateWhereInput contentLibraryVmTemplates) {

        this.contentLibraryVmTemplates = contentLibraryVmTemplates;
        return this;
    }

    /**
     * Get contentLibraryVmTemplates
     *
     * @return contentLibraryVmTemplates
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ContentLibraryVmTemplateWhereInput getContentLibraryVmTemplates() {
        return contentLibraryVmTemplates;
    }

    public void setContentLibraryVmTemplates(
            ContentLibraryVmTemplateWhereInput contentLibraryVmTemplates) {
        this.contentLibraryVmTemplates = contentLibraryVmTemplates;
    }

    public AddLabelsToResourcesParamsData contentLibraryVmTemplates_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATES);
        return this;
    }

    public AddLabelsToResourcesParamsData contentLibraryVmTemplates_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATES);
        return this;
    }

    public void setContentLibraryVmTemplates_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATES);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATES);
        }
    }

    public boolean getContentLibraryVmTemplates_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATES);
    }

    public AddLabelsToResourcesParamsData contentLibraryImages(
            ContentLibraryImageWhereInput contentLibraryImages) {

        this.contentLibraryImages = contentLibraryImages;
        return this;
    }

    /**
     * Get contentLibraryImages
     *
     * @return contentLibraryImages
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ContentLibraryImageWhereInput getContentLibraryImages() {
        return contentLibraryImages;
    }

    public void setContentLibraryImages(ContentLibraryImageWhereInput contentLibraryImages) {
        this.contentLibraryImages = contentLibraryImages;
    }

    public AddLabelsToResourcesParamsData contentLibraryImages_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CONTENT_LIBRARY_IMAGES);
        return this;
    }

    public AddLabelsToResourcesParamsData contentLibraryImages_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CONTENT_LIBRARY_IMAGES);
        return this;
    }

    public void setContentLibraryImages_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CONTENT_LIBRARY_IMAGES);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CONTENT_LIBRARY_IMAGES);
        }
    }

    public boolean getContentLibraryImages_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CONTENT_LIBRARY_IMAGES);
    }

    public AddLabelsToResourcesParamsData isolationPolicies(
            IsolationPolicyWhereInput isolationPolicies) {

        this.isolationPolicies = isolationPolicies;
        return this;
    }

    /**
     * Get isolationPolicies
     *
     * @return isolationPolicies
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public IsolationPolicyWhereInput getIsolationPolicies() {
        return isolationPolicies;
    }

    public void setIsolationPolicies(IsolationPolicyWhereInput isolationPolicies) {
        this.isolationPolicies = isolationPolicies;
    }

    public AddLabelsToResourcesParamsData isolationPolicies_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISOLATION_POLICIES);
        return this;
    }

    public AddLabelsToResourcesParamsData isolationPolicies_ExplictlyNonNull() {
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

    public AddLabelsToResourcesParamsData securityPolicies(
            SecurityPolicyWhereInput securityPolicies) {

        this.securityPolicies = securityPolicies;
        return this;
    }

    /**
     * Get securityPolicies
     *
     * @return securityPolicies
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public SecurityPolicyWhereInput getSecurityPolicies() {
        return securityPolicies;
    }

    public void setSecurityPolicies(SecurityPolicyWhereInput securityPolicies) {
        this.securityPolicies = securityPolicies;
    }

    public AddLabelsToResourcesParamsData securityPolicies_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SECURITY_POLICIES);
        return this;
    }

    public AddLabelsToResourcesParamsData securityPolicies_ExplictlyNonNull() {
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

    public AddLabelsToResourcesParamsData vms(VmWhereInput vms) {

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

    public AddLabelsToResourcesParamsData vms_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VMS);
        return this;
    }

    public AddLabelsToResourcesParamsData vms_ExplictlyNonNull() {
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

    public AddLabelsToResourcesParamsData vmVolumeSnapshots(
            VmVolumeSnapshotWhereInput vmVolumeSnapshots) {

        this.vmVolumeSnapshots = vmVolumeSnapshots;
        return this;
    }

    /**
     * Get vmVolumeSnapshots
     *
     * @return vmVolumeSnapshots
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmVolumeSnapshotWhereInput getVmVolumeSnapshots() {
        return vmVolumeSnapshots;
    }

    public void setVmVolumeSnapshots(VmVolumeSnapshotWhereInput vmVolumeSnapshots) {
        this.vmVolumeSnapshots = vmVolumeSnapshots;
    }

    public AddLabelsToResourcesParamsData vmVolumeSnapshots_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_VOLUME_SNAPSHOTS);
        return this;
    }

    public AddLabelsToResourcesParamsData vmVolumeSnapshots_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_VOLUME_SNAPSHOTS);
        return this;
    }

    public void setVmVolumeSnapshots_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_VOLUME_SNAPSHOTS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_VOLUME_SNAPSHOTS);
        }
    }

    public boolean getVmVolumeSnapshots_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_VOLUME_SNAPSHOTS);
    }

    public AddLabelsToResourcesParamsData vmVolumes(VmVolumeWhereInput vmVolumes) {

        this.vmVolumes = vmVolumes;
        return this;
    }

    /**
     * Get vmVolumes
     *
     * @return vmVolumes
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmVolumeWhereInput getVmVolumes() {
        return vmVolumes;
    }

    public void setVmVolumes(VmVolumeWhereInput vmVolumes) {
        this.vmVolumes = vmVolumes;
    }

    public AddLabelsToResourcesParamsData vmVolumes_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_VOLUMES);
        return this;
    }

    public AddLabelsToResourcesParamsData vmVolumes_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_VOLUMES);
        return this;
    }

    public void setVmVolumes_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_VOLUMES);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_VOLUMES);
        }
    }

    public boolean getVmVolumes_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_VOLUMES);
    }

    public AddLabelsToResourcesParamsData vmTemplates(VmTemplateWhereInput vmTemplates) {

        this.vmTemplates = vmTemplates;
        return this;
    }

    /**
     * Get vmTemplates
     *
     * @return vmTemplates
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmTemplateWhereInput getVmTemplates() {
        return vmTemplates;
    }

    public void setVmTemplates(VmTemplateWhereInput vmTemplates) {
        this.vmTemplates = vmTemplates;
    }

    public AddLabelsToResourcesParamsData vmTemplates_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_TEMPLATES);
        return this;
    }

    public AddLabelsToResourcesParamsData vmTemplates_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_TEMPLATES);
        return this;
    }

    public void setVmTemplates_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_TEMPLATES);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_TEMPLATES);
        }
    }

    public boolean getVmTemplates_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_TEMPLATES);
    }

    public AddLabelsToResourcesParamsData vmSnapshots(VmSnapshotWhereInput vmSnapshots) {

        this.vmSnapshots = vmSnapshots;
        return this;
    }

    /**
     * Get vmSnapshots
     *
     * @return vmSnapshots
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmSnapshotWhereInput getVmSnapshots() {
        return vmSnapshots;
    }

    public void setVmSnapshots(VmSnapshotWhereInput vmSnapshots) {
        this.vmSnapshots = vmSnapshots;
    }

    public AddLabelsToResourcesParamsData vmSnapshots_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_SNAPSHOTS);
        return this;
    }

    public AddLabelsToResourcesParamsData vmSnapshots_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_SNAPSHOTS);
        return this;
    }

    public void setVmSnapshots_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_SNAPSHOTS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_SNAPSHOTS);
        }
    }

    public boolean getVmSnapshots_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_SNAPSHOTS);
    }

    public AddLabelsToResourcesParamsData vlans(VlanWhereInput vlans) {

        this.vlans = vlans;
        return this;
    }

    /**
     * Get vlans
     *
     * @return vlans
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VlanWhereInput getVlans() {
        return vlans;
    }

    public void setVlans(VlanWhereInput vlans) {
        this.vlans = vlans;
    }

    public AddLabelsToResourcesParamsData vlans_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VLANS);
        return this;
    }

    public AddLabelsToResourcesParamsData vlans_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VLANS);
        return this;
    }

    public void setVlans_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VLANS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VLANS);
        }
    }

    public boolean getVlans_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VLANS);
    }

    public AddLabelsToResourcesParamsData vdses(VdsWhereInput vdses) {

        this.vdses = vdses;
        return this;
    }

    /**
     * Get vdses
     *
     * @return vdses
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VdsWhereInput getVdses() {
        return vdses;
    }

    public void setVdses(VdsWhereInput vdses) {
        this.vdses = vdses;
    }

    public AddLabelsToResourcesParamsData vdses_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VDSES);
        return this;
    }

    public AddLabelsToResourcesParamsData vdses_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VDSES);
        return this;
    }

    public void setVdses_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VDSES);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VDSES);
        }
    }

    public boolean getVdses_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VDSES);
    }

    public AddLabelsToResourcesParamsData nvmfSubsystems(NvmfSubsystemWhereInput nvmfSubsystems) {

        this.nvmfSubsystems = nvmfSubsystems;
        return this;
    }

    /**
     * Get nvmfSubsystems
     *
     * @return nvmfSubsystems
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NvmfSubsystemWhereInput getNvmfSubsystems() {
        return nvmfSubsystems;
    }

    public void setNvmfSubsystems(NvmfSubsystemWhereInput nvmfSubsystems) {
        this.nvmfSubsystems = nvmfSubsystems;
    }

    public AddLabelsToResourcesParamsData nvmfSubsystems_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NVMF_SUBSYSTEMS);
        return this;
    }

    public AddLabelsToResourcesParamsData nvmfSubsystems_ExplictlyNonNull() {
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

    public AddLabelsToResourcesParamsData nvmfNamespaceSnapshots(
            NvmfNamespaceSnapshotWhereInput nvmfNamespaceSnapshots) {

        this.nvmfNamespaceSnapshots = nvmfNamespaceSnapshots;
        return this;
    }

    /**
     * Get nvmfNamespaceSnapshots
     *
     * @return nvmfNamespaceSnapshots
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NvmfNamespaceSnapshotWhereInput getNvmfNamespaceSnapshots() {
        return nvmfNamespaceSnapshots;
    }

    public void setNvmfNamespaceSnapshots(NvmfNamespaceSnapshotWhereInput nvmfNamespaceSnapshots) {
        this.nvmfNamespaceSnapshots = nvmfNamespaceSnapshots;
    }

    public AddLabelsToResourcesParamsData nvmfNamespaceSnapshots_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NVMF_NAMESPACE_SNAPSHOTS);
        return this;
    }

    public AddLabelsToResourcesParamsData nvmfNamespaceSnapshots_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NVMF_NAMESPACE_SNAPSHOTS);
        return this;
    }

    public void setNvmfNamespaceSnapshots_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NVMF_NAMESPACE_SNAPSHOTS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NVMF_NAMESPACE_SNAPSHOTS);
        }
    }

    public boolean getNvmfNamespaceSnapshots_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NVMF_NAMESPACE_SNAPSHOTS);
    }

    public AddLabelsToResourcesParamsData nvmfNamespaces(NvmfNamespaceWhereInput nvmfNamespaces) {

        this.nvmfNamespaces = nvmfNamespaces;
        return this;
    }

    /**
     * Get nvmfNamespaces
     *
     * @return nvmfNamespaces
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NvmfNamespaceWhereInput getNvmfNamespaces() {
        return nvmfNamespaces;
    }

    public void setNvmfNamespaces(NvmfNamespaceWhereInput nvmfNamespaces) {
        this.nvmfNamespaces = nvmfNamespaces;
    }

    public AddLabelsToResourcesParamsData nvmfNamespaces_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NVMF_NAMESPACES);
        return this;
    }

    public AddLabelsToResourcesParamsData nvmfNamespaces_ExplictlyNonNull() {
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

    public AddLabelsToResourcesParamsData nics(NicWhereInput nics) {

        this.nics = nics;
        return this;
    }

    /**
     * Get nics
     *
     * @return nics
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NicWhereInput getNics() {
        return nics;
    }

    public void setNics(NicWhereInput nics) {
        this.nics = nics;
    }

    public AddLabelsToResourcesParamsData nics_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NICS);
        return this;
    }

    public AddLabelsToResourcesParamsData nics_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NICS);
        return this;
    }

    public void setNics_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NICS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NICS);
        }
    }

    public boolean getNics_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NICS);
    }

    public AddLabelsToResourcesParamsData nfsInodes(NfsInodeWhereInput nfsInodes) {

        this.nfsInodes = nfsInodes;
        return this;
    }

    /**
     * Get nfsInodes
     *
     * @return nfsInodes
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NfsInodeWhereInput getNfsInodes() {
        return nfsInodes;
    }

    public void setNfsInodes(NfsInodeWhereInput nfsInodes) {
        this.nfsInodes = nfsInodes;
    }

    public AddLabelsToResourcesParamsData nfsInodes_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NFS_INODES);
        return this;
    }

    public AddLabelsToResourcesParamsData nfsInodes_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NFS_INODES);
        return this;
    }

    public void setNfsInodes_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NFS_INODES);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NFS_INODES);
        }
    }

    public boolean getNfsInodes_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NFS_INODES);
    }

    public AddLabelsToResourcesParamsData nfsExports(NfsExportWhereInput nfsExports) {

        this.nfsExports = nfsExports;
        return this;
    }

    /**
     * Get nfsExports
     *
     * @return nfsExports
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NfsExportWhereInput getNfsExports() {
        return nfsExports;
    }

    public void setNfsExports(NfsExportWhereInput nfsExports) {
        this.nfsExports = nfsExports;
    }

    public AddLabelsToResourcesParamsData nfsExports_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NFS_EXPORTS);
        return this;
    }

    public AddLabelsToResourcesParamsData nfsExports_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NFS_EXPORTS);
        return this;
    }

    public void setNfsExports_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NFS_EXPORTS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NFS_EXPORTS);
        }
    }

    public boolean getNfsExports_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NFS_EXPORTS);
    }

    public AddLabelsToResourcesParamsData namespaceGroups(
            NamespaceGroupWhereInput namespaceGroups) {

        this.namespaceGroups = namespaceGroups;
        return this;
    }

    /**
     * Get namespaceGroups
     *
     * @return namespaceGroups
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public NamespaceGroupWhereInput getNamespaceGroups() {
        return namespaceGroups;
    }

    public void setNamespaceGroups(NamespaceGroupWhereInput namespaceGroups) {
        this.namespaceGroups = namespaceGroups;
    }

    public AddLabelsToResourcesParamsData namespaceGroups_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAMESPACE_GROUPS);
        return this;
    }

    public AddLabelsToResourcesParamsData namespaceGroups_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAMESPACE_GROUPS);
        return this;
    }

    public void setNamespaceGroups_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAMESPACE_GROUPS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAMESPACE_GROUPS);
        }
    }

    public boolean getNamespaceGroups_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAMESPACE_GROUPS);
    }

    public AddLabelsToResourcesParamsData iscsiTargets(IscsiTargetWhereInput iscsiTargets) {

        this.iscsiTargets = iscsiTargets;
        return this;
    }

    /**
     * Get iscsiTargets
     *
     * @return iscsiTargets
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public IscsiTargetWhereInput getIscsiTargets() {
        return iscsiTargets;
    }

    public void setIscsiTargets(IscsiTargetWhereInput iscsiTargets) {
        this.iscsiTargets = iscsiTargets;
    }

    public AddLabelsToResourcesParamsData iscsiTargets_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_TARGETS);
        return this;
    }

    public AddLabelsToResourcesParamsData iscsiTargets_ExplictlyNonNull() {
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

    public AddLabelsToResourcesParamsData iscsiLunSnapshots(
            IscsiLunSnapshotWhereInput iscsiLunSnapshots) {

        this.iscsiLunSnapshots = iscsiLunSnapshots;
        return this;
    }

    /**
     * Get iscsiLunSnapshots
     *
     * @return iscsiLunSnapshots
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public IscsiLunSnapshotWhereInput getIscsiLunSnapshots() {
        return iscsiLunSnapshots;
    }

    public void setIscsiLunSnapshots(IscsiLunSnapshotWhereInput iscsiLunSnapshots) {
        this.iscsiLunSnapshots = iscsiLunSnapshots;
    }

    public AddLabelsToResourcesParamsData iscsiLunSnapshots_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_LUN_SNAPSHOTS);
        return this;
    }

    public AddLabelsToResourcesParamsData iscsiLunSnapshots_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_LUN_SNAPSHOTS);
        return this;
    }

    public void setIscsiLunSnapshots_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_LUN_SNAPSHOTS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_LUN_SNAPSHOTS);
        }
    }

    public boolean getIscsiLunSnapshots_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_LUN_SNAPSHOTS);
    }

    public AddLabelsToResourcesParamsData iscsiLuns(IscsiLunWhereInput iscsiLuns) {

        this.iscsiLuns = iscsiLuns;
        return this;
    }

    /**
     * Get iscsiLuns
     *
     * @return iscsiLuns
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public IscsiLunWhereInput getIscsiLuns() {
        return iscsiLuns;
    }

    public void setIscsiLuns(IscsiLunWhereInput iscsiLuns) {
        this.iscsiLuns = iscsiLuns;
    }

    public AddLabelsToResourcesParamsData iscsiLuns_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_LUNS);
        return this;
    }

    public AddLabelsToResourcesParamsData iscsiLuns_ExplictlyNonNull() {
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

    public AddLabelsToResourcesParamsData hosts(HostWhereInput hosts) {

        this.hosts = hosts;
        return this;
    }

    /**
     * Get hosts
     *
     * @return hosts
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public HostWhereInput getHosts() {
        return hosts;
    }

    public void setHosts(HostWhereInput hosts) {
        this.hosts = hosts;
    }

    public AddLabelsToResourcesParamsData hosts_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOSTS);
        return this;
    }

    public AddLabelsToResourcesParamsData hosts_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HOSTS);
        return this;
    }

    public void setHosts_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HOSTS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HOSTS);
        }
    }

    public boolean getHosts_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HOSTS);
    }

    public AddLabelsToResourcesParamsData elfImages(ElfImageWhereInput elfImages) {

        this.elfImages = elfImages;
        return this;
    }

    /**
     * Get elfImages
     *
     * @return elfImages
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ElfImageWhereInput getElfImages() {
        return elfImages;
    }

    public void setElfImages(ElfImageWhereInput elfImages) {
        this.elfImages = elfImages;
    }

    public AddLabelsToResourcesParamsData elfImages_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ELF_IMAGES);
        return this;
    }

    public AddLabelsToResourcesParamsData elfImages_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ELF_IMAGES);
        return this;
    }

    public void setElfImages_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ELF_IMAGES);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ELF_IMAGES);
        }
    }

    public boolean getElfImages_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ELF_IMAGES);
    }

    public AddLabelsToResourcesParamsData disks(DiskWhereInput disks) {

        this.disks = disks;
        return this;
    }

    /**
     * Get disks
     *
     * @return disks
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public DiskWhereInput getDisks() {
        return disks;
    }

    public void setDisks(DiskWhereInput disks) {
        this.disks = disks;
    }

    public AddLabelsToResourcesParamsData disks_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISKS);
        return this;
    }

    public AddLabelsToResourcesParamsData disks_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DISKS);
        return this;
    }

    public void setDisks_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DISKS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DISKS);
        }
    }

    public boolean getDisks_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DISKS);
    }

    public AddLabelsToResourcesParamsData datacenters(DatacenterWhereInput datacenters) {

        this.datacenters = datacenters;
        return this;
    }

    /**
     * Get datacenters
     *
     * @return datacenters
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public DatacenterWhereInput getDatacenters() {
        return datacenters;
    }

    public void setDatacenters(DatacenterWhereInput datacenters) {
        this.datacenters = datacenters;
    }

    public AddLabelsToResourcesParamsData datacenters_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATACENTERS);
        return this;
    }

    public AddLabelsToResourcesParamsData datacenters_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATACENTERS);
        return this;
    }

    public void setDatacenters_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATACENTERS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATACENTERS);
        }
    }

    public boolean getDatacenters_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATACENTERS);
    }

    public AddLabelsToResourcesParamsData consistencyGroupSnapshots(
            ConsistencyGroupSnapshotWhereInput consistencyGroupSnapshots) {

        this.consistencyGroupSnapshots = consistencyGroupSnapshots;
        return this;
    }

    /**
     * Get consistencyGroupSnapshots
     *
     * @return consistencyGroupSnapshots
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ConsistencyGroupSnapshotWhereInput getConsistencyGroupSnapshots() {
        return consistencyGroupSnapshots;
    }

    public void setConsistencyGroupSnapshots(
            ConsistencyGroupSnapshotWhereInput consistencyGroupSnapshots) {
        this.consistencyGroupSnapshots = consistencyGroupSnapshots;
    }

    public AddLabelsToResourcesParamsData consistencyGroupSnapshots_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CONSISTENCY_GROUP_SNAPSHOTS);
        return this;
    }

    public AddLabelsToResourcesParamsData consistencyGroupSnapshots_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CONSISTENCY_GROUP_SNAPSHOTS);
        return this;
    }

    public void setConsistencyGroupSnapshots_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CONSISTENCY_GROUP_SNAPSHOTS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CONSISTENCY_GROUP_SNAPSHOTS);
        }
    }

    public boolean getConsistencyGroupSnapshots_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CONSISTENCY_GROUP_SNAPSHOTS);
    }

    public AddLabelsToResourcesParamsData consistencyGroups(
            ConsistencyGroupWhereInput consistencyGroups) {

        this.consistencyGroups = consistencyGroups;
        return this;
    }

    /**
     * Get consistencyGroups
     *
     * @return consistencyGroups
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ConsistencyGroupWhereInput getConsistencyGroups() {
        return consistencyGroups;
    }

    public void setConsistencyGroups(ConsistencyGroupWhereInput consistencyGroups) {
        this.consistencyGroups = consistencyGroups;
    }

    public AddLabelsToResourcesParamsData consistencyGroups_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CONSISTENCY_GROUPS);
        return this;
    }

    public AddLabelsToResourcesParamsData consistencyGroups_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CONSISTENCY_GROUPS);
        return this;
    }

    public void setConsistencyGroups_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CONSISTENCY_GROUPS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CONSISTENCY_GROUPS);
        }
    }

    public boolean getConsistencyGroups_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CONSISTENCY_GROUPS);
    }

    public AddLabelsToResourcesParamsData clusters(ClusterWhereInput clusters) {

        this.clusters = clusters;
        return this;
    }

    /**
     * Get clusters
     *
     * @return clusters
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ClusterWhereInput getClusters() {
        return clusters;
    }

    public void setClusters(ClusterWhereInput clusters) {
        this.clusters = clusters;
    }

    public AddLabelsToResourcesParamsData clusters_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTERS);
        return this;
    }

    public AddLabelsToResourcesParamsData clusters_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLUSTERS);
        return this;
    }

    public void setClusters_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLUSTERS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLUSTERS);
        }
    }

    public boolean getClusters_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLUSTERS);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AddLabelsToResourcesParamsData addLabelsToResourcesParamsData =
                (AddLabelsToResourcesParamsData) o;
        return Objects.equals(this.gpuDevices, addLabelsToResourcesParamsData.gpuDevices)
                && Objects.equals(
                        this.contentLibraryVmTemplates,
                        addLabelsToResourcesParamsData.contentLibraryVmTemplates)
                && Objects.equals(
                        this.contentLibraryImages,
                        addLabelsToResourcesParamsData.contentLibraryImages)
                && Objects.equals(
                        this.isolationPolicies, addLabelsToResourcesParamsData.isolationPolicies)
                && Objects.equals(
                        this.securityPolicies, addLabelsToResourcesParamsData.securityPolicies)
                && Objects.equals(this.vms, addLabelsToResourcesParamsData.vms)
                && Objects.equals(
                        this.vmVolumeSnapshots, addLabelsToResourcesParamsData.vmVolumeSnapshots)
                && Objects.equals(this.vmVolumes, addLabelsToResourcesParamsData.vmVolumes)
                && Objects.equals(this.vmTemplates, addLabelsToResourcesParamsData.vmTemplates)
                && Objects.equals(this.vmSnapshots, addLabelsToResourcesParamsData.vmSnapshots)
                && Objects.equals(this.vlans, addLabelsToResourcesParamsData.vlans)
                && Objects.equals(this.vdses, addLabelsToResourcesParamsData.vdses)
                && Objects.equals(
                        this.nvmfSubsystems, addLabelsToResourcesParamsData.nvmfSubsystems)
                && Objects.equals(
                        this.nvmfNamespaceSnapshots,
                        addLabelsToResourcesParamsData.nvmfNamespaceSnapshots)
                && Objects.equals(
                        this.nvmfNamespaces, addLabelsToResourcesParamsData.nvmfNamespaces)
                && Objects.equals(this.nics, addLabelsToResourcesParamsData.nics)
                && Objects.equals(this.nfsInodes, addLabelsToResourcesParamsData.nfsInodes)
                && Objects.equals(this.nfsExports, addLabelsToResourcesParamsData.nfsExports)
                && Objects.equals(
                        this.namespaceGroups, addLabelsToResourcesParamsData.namespaceGroups)
                && Objects.equals(this.iscsiTargets, addLabelsToResourcesParamsData.iscsiTargets)
                && Objects.equals(
                        this.iscsiLunSnapshots, addLabelsToResourcesParamsData.iscsiLunSnapshots)
                && Objects.equals(this.iscsiLuns, addLabelsToResourcesParamsData.iscsiLuns)
                && Objects.equals(this.hosts, addLabelsToResourcesParamsData.hosts)
                && Objects.equals(this.elfImages, addLabelsToResourcesParamsData.elfImages)
                && Objects.equals(this.disks, addLabelsToResourcesParamsData.disks)
                && Objects.equals(this.datacenters, addLabelsToResourcesParamsData.datacenters)
                && Objects.equals(
                        this.consistencyGroupSnapshots,
                        addLabelsToResourcesParamsData.consistencyGroupSnapshots)
                && Objects.equals(
                        this.consistencyGroups, addLabelsToResourcesParamsData.consistencyGroups)
                && Objects.equals(this.clusters, addLabelsToResourcesParamsData.clusters);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                gpuDevices,
                contentLibraryVmTemplates,
                contentLibraryImages,
                isolationPolicies,
                securityPolicies,
                vms,
                vmVolumeSnapshots,
                vmVolumes,
                vmTemplates,
                vmSnapshots,
                vlans,
                vdses,
                nvmfSubsystems,
                nvmfNamespaceSnapshots,
                nvmfNamespaces,
                nics,
                nfsInodes,
                nfsExports,
                namespaceGroups,
                iscsiTargets,
                iscsiLunSnapshots,
                iscsiLuns,
                hosts,
                elfImages,
                disks,
                datacenters,
                consistencyGroupSnapshots,
                consistencyGroups,
                clusters);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddLabelsToResourcesParamsData {\n");
        sb.append("    gpuDevices: ").append(toIndentedString(gpuDevices)).append("\n");
        sb.append("    contentLibraryVmTemplates: ")
                .append(toIndentedString(contentLibraryVmTemplates))
                .append("\n");
        sb.append("    contentLibraryImages: ")
                .append(toIndentedString(contentLibraryImages))
                .append("\n");
        sb.append("    isolationPolicies: ")
                .append(toIndentedString(isolationPolicies))
                .append("\n");
        sb.append("    securityPolicies: ").append(toIndentedString(securityPolicies)).append("\n");
        sb.append("    vms: ").append(toIndentedString(vms)).append("\n");
        sb.append("    vmVolumeSnapshots: ")
                .append(toIndentedString(vmVolumeSnapshots))
                .append("\n");
        sb.append("    vmVolumes: ").append(toIndentedString(vmVolumes)).append("\n");
        sb.append("    vmTemplates: ").append(toIndentedString(vmTemplates)).append("\n");
        sb.append("    vmSnapshots: ").append(toIndentedString(vmSnapshots)).append("\n");
        sb.append("    vlans: ").append(toIndentedString(vlans)).append("\n");
        sb.append("    vdses: ").append(toIndentedString(vdses)).append("\n");
        sb.append("    nvmfSubsystems: ").append(toIndentedString(nvmfSubsystems)).append("\n");
        sb.append("    nvmfNamespaceSnapshots: ")
                .append(toIndentedString(nvmfNamespaceSnapshots))
                .append("\n");
        sb.append("    nvmfNamespaces: ").append(toIndentedString(nvmfNamespaces)).append("\n");
        sb.append("    nics: ").append(toIndentedString(nics)).append("\n");
        sb.append("    nfsInodes: ").append(toIndentedString(nfsInodes)).append("\n");
        sb.append("    nfsExports: ").append(toIndentedString(nfsExports)).append("\n");
        sb.append("    namespaceGroups: ").append(toIndentedString(namespaceGroups)).append("\n");
        sb.append("    iscsiTargets: ").append(toIndentedString(iscsiTargets)).append("\n");
        sb.append("    iscsiLunSnapshots: ")
                .append(toIndentedString(iscsiLunSnapshots))
                .append("\n");
        sb.append("    iscsiLuns: ").append(toIndentedString(iscsiLuns)).append("\n");
        sb.append("    hosts: ").append(toIndentedString(hosts)).append("\n");
        sb.append("    elfImages: ").append(toIndentedString(elfImages)).append("\n");
        sb.append("    disks: ").append(toIndentedString(disks)).append("\n");
        sb.append("    datacenters: ").append(toIndentedString(datacenters)).append("\n");
        sb.append("    consistencyGroupSnapshots: ")
                .append(toIndentedString(consistencyGroupSnapshots))
                .append("\n");
        sb.append("    consistencyGroups: ")
                .append(toIndentedString(consistencyGroups))
                .append("\n");
        sb.append("    clusters: ").append(toIndentedString(clusters)).append("\n");
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

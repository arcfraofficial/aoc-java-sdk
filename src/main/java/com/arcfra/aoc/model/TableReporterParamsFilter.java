package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** TableReporterParamsFilter */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class TableReporterParamsFilter
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_NVMF_SUBSYSTEMS = "nvmfSubsystems";

    @SerializedName(SERIALIZED_NAME_NVMF_SUBSYSTEMS)
    private GetNvmfSubsystemsRequestBody nvmfSubsystems;

    public static final String SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATES =
            "contentLibraryVmTemplates";

    @SerializedName(SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATES)
    private GetContentLibraryVmTemplatesRequestBody contentLibraryVmTemplates;

    public static final String SERIALIZED_NAME_NVMF_NAMESPACE_SNAPSHOTS = "nvmfNamespaceSnapshots";

    @SerializedName(SERIALIZED_NAME_NVMF_NAMESPACE_SNAPSHOTS)
    private GetNvmfNamespaceSnapshotsRequestBody nvmfNamespaceSnapshots;

    public static final String SERIALIZED_NAME_CONTENT_LIBRARY_IMAGES = "contentLibraryImages";

    @SerializedName(SERIALIZED_NAME_CONTENT_LIBRARY_IMAGES)
    private GetContentLibraryImagesRequestBody contentLibraryImages;

    public static final String SERIALIZED_NAME_NVMF_NAMESPACES = "nvmfNamespaces";

    @SerializedName(SERIALIZED_NAME_NVMF_NAMESPACES)
    private GetNvmfNamespacesRequestBody nvmfNamespaces;

    public static final String SERIALIZED_NAME_NAMESPACE_GROUPS = "namespaceGroups";

    @SerializedName(SERIALIZED_NAME_NAMESPACE_GROUPS)
    private GetNamespaceGroupsRequestBody namespaceGroups;

    public static final String SERIALIZED_NAME_ISCSI_LUNS = "iscsiLuns";

    @SerializedName(SERIALIZED_NAME_ISCSI_LUNS)
    private GetIscsiLunsRequestBody iscsiLuns;

    public static final String SERIALIZED_NAME_TASKS = "tasks";

    @SerializedName(SERIALIZED_NAME_TASKS)
    private GetTasksRequestBody tasks;

    public static final String SERIALIZED_NAME_USER_AUDIT_LOGS = "userAuditLogs";

    @SerializedName(SERIALIZED_NAME_USER_AUDIT_LOGS)
    private GetUserAuditLogsRequestBody userAuditLogs;

    public static final String SERIALIZED_NAME_SYSTEM_AUDIT_LOGS = "systemAuditLogs";

    @SerializedName(SERIALIZED_NAME_SYSTEM_AUDIT_LOGS)
    private GetSystemAuditLogsRequestBody systemAuditLogs;

    public static final String SERIALIZED_NAME_ISCSI_LUN_SNAPSHOTS = "iscsiLunSnapshots";

    @SerializedName(SERIALIZED_NAME_ISCSI_LUN_SNAPSHOTS)
    private GetIscsiLunSnapshotsRequestBody iscsiLunSnapshots;

    public static final String SERIALIZED_NAME_ISCSI_CONNECTIONS = "iscsiConnections";

    @SerializedName(SERIALIZED_NAME_ISCSI_CONNECTIONS)
    private GetIscsiConnectionsRequestBody iscsiConnections;

    public static final String SERIALIZED_NAME_CONSISTENCY_GROUPS = "consistencyGroups";

    @SerializedName(SERIALIZED_NAME_CONSISTENCY_GROUPS)
    private GetConsistencyGroupsRequestBody consistencyGroups;

    public static final String SERIALIZED_NAME_USERS = "users";

    @SerializedName(SERIALIZED_NAME_USERS)
    private GetUsersRequestBody users;

    public static final String SERIALIZED_NAME_VM_ENTITY_FILTERS = "vmEntityFilters";

    @SerializedName(SERIALIZED_NAME_VM_ENTITY_FILTERS)
    private GetEntityFiltersRequestBody vmEntityFilters;

    public static final String SERIALIZED_NAME_SNAPSHOT_PLANS = "snapshotPlans";

    @SerializedName(SERIALIZED_NAME_SNAPSHOT_PLANS)
    private GetSnapshotPlansRequestBody snapshotPlans;

    public static final String SERIALIZED_NAME_GLOBAL_ALERT_RULES = "globalAlertRules";

    @SerializedName(SERIALIZED_NAME_GLOBAL_ALERT_RULES)
    private GetGlobalAlertRulesRequestBody globalAlertRules;

    public static final String SERIALIZED_NAME_ALERTS = "alerts";

    @SerializedName(SERIALIZED_NAME_ALERTS)
    private GetAlertsRequestBody alerts;

    public static final String SERIALIZED_NAME_VM_PLACEMENT_GROUPS = "vmPlacementGroups";

    @SerializedName(SERIALIZED_NAME_VM_PLACEMENT_GROUPS)
    private GetVmPlacementGroupsRequestBody vmPlacementGroups;

    public static final String SERIALIZED_NAME_VM_TEMPLATES = "vmTemplates";

    @SerializedName(SERIALIZED_NAME_VM_TEMPLATES)
    private GetVmTemplatesRequestBody vmTemplates;

    public static final String SERIALIZED_NAME_ELF_IMAGES = "elfImages";

    @SerializedName(SERIALIZED_NAME_ELF_IMAGES)
    private GetElfImagesRequestBody elfImages;

    public static final String SERIALIZED_NAME_VM_VOLUMES = "vmVolumes";

    @SerializedName(SERIALIZED_NAME_VM_VOLUMES)
    private GetVmVolumesRequestBody vmVolumes;

    public static final String SERIALIZED_NAME_VLANS = "vlans";

    @SerializedName(SERIALIZED_NAME_VLANS)
    private GetVlansRequestBody vlans;

    public static final String SERIALIZED_NAME_DISKS = "disks";

    @SerializedName(SERIALIZED_NAME_DISKS)
    private GetDisksRequestBody disks;

    public static final String SERIALIZED_NAME_VDSES = "vdses";

    @SerializedName(SERIALIZED_NAME_VDSES)
    private GetVdsesRequestBody vdses;

    public static final String SERIALIZED_NAME_ELF_DATA_STORES = "elfDataStores";

    @SerializedName(SERIALIZED_NAME_ELF_DATA_STORES)
    private GetElfDataStoresRequestBody elfDataStores;

    public static final String SERIALIZED_NAME_VMS = "vms";

    @SerializedName(SERIALIZED_NAME_VMS)
    private GetVmsRequestBody vms;

    public static final String SERIALIZED_NAME_NFS_EXPORTS = "nfsExports";

    @SerializedName(SERIALIZED_NAME_NFS_EXPORTS)
    private GetNfsExportsRequestBody nfsExports;

    public static final String SERIALIZED_NAME_ISCSI_TARGETS = "iscsiTargets";

    @SerializedName(SERIALIZED_NAME_ISCSI_TARGETS)
    private GetIscsiTargetsRequestBody iscsiTargets;

    public static final String SERIALIZED_NAME_USB_DEVICES = "usbDevices";

    @SerializedName(SERIALIZED_NAME_USB_DEVICES)
    private GetUsbDevicesRequestBody usbDevices;

    public static final String SERIALIZED_NAME_NICS = "nics";

    @SerializedName(SERIALIZED_NAME_NICS)
    private GetNicsRequestBody nics;

    public static final String SERIALIZED_NAME_CLUSTERS = "clusters";

    @SerializedName(SERIALIZED_NAME_CLUSTERS)
    private GetClustersRequestBody clusters;

    public static final String SERIALIZED_NAME_DATACENTERS = "datacenters";

    @SerializedName(SERIALIZED_NAME_DATACENTERS)
    private GetDatacentersRequestBody datacenters;

    public static final String SERIALIZED_NAME_HOSTS = "hosts";

    @SerializedName(SERIALIZED_NAME_HOSTS)
    private GetHostsRequestBody hosts;

    public TableReporterParamsFilter() {}

    public TableReporterParamsFilter nvmfSubsystems(GetNvmfSubsystemsRequestBody nvmfSubsystems) {

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
    public GetNvmfSubsystemsRequestBody getNvmfSubsystems() {
        return nvmfSubsystems;
    }

    public void setNvmfSubsystems(GetNvmfSubsystemsRequestBody nvmfSubsystems) {
        this.nvmfSubsystems = nvmfSubsystems;
    }

    public TableReporterParamsFilter nvmfSubsystems_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NVMF_SUBSYSTEMS);
        return this;
    }

    public TableReporterParamsFilter nvmfSubsystems_ExplictlyNonNull() {
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

    public TableReporterParamsFilter contentLibraryVmTemplates(
            GetContentLibraryVmTemplatesRequestBody contentLibraryVmTemplates) {

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
    public GetContentLibraryVmTemplatesRequestBody getContentLibraryVmTemplates() {
        return contentLibraryVmTemplates;
    }

    public void setContentLibraryVmTemplates(
            GetContentLibraryVmTemplatesRequestBody contentLibraryVmTemplates) {
        this.contentLibraryVmTemplates = contentLibraryVmTemplates;
    }

    public TableReporterParamsFilter contentLibraryVmTemplates_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CONTENT_LIBRARY_VM_TEMPLATES);
        return this;
    }

    public TableReporterParamsFilter contentLibraryVmTemplates_ExplictlyNonNull() {
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

    public TableReporterParamsFilter nvmfNamespaceSnapshots(
            GetNvmfNamespaceSnapshotsRequestBody nvmfNamespaceSnapshots) {

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
    public GetNvmfNamespaceSnapshotsRequestBody getNvmfNamespaceSnapshots() {
        return nvmfNamespaceSnapshots;
    }

    public void setNvmfNamespaceSnapshots(
            GetNvmfNamespaceSnapshotsRequestBody nvmfNamespaceSnapshots) {
        this.nvmfNamespaceSnapshots = nvmfNamespaceSnapshots;
    }

    public TableReporterParamsFilter nvmfNamespaceSnapshots_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NVMF_NAMESPACE_SNAPSHOTS);
        return this;
    }

    public TableReporterParamsFilter nvmfNamespaceSnapshots_ExplictlyNonNull() {
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

    public TableReporterParamsFilter contentLibraryImages(
            GetContentLibraryImagesRequestBody contentLibraryImages) {

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
    public GetContentLibraryImagesRequestBody getContentLibraryImages() {
        return contentLibraryImages;
    }

    public void setContentLibraryImages(GetContentLibraryImagesRequestBody contentLibraryImages) {
        this.contentLibraryImages = contentLibraryImages;
    }

    public TableReporterParamsFilter contentLibraryImages_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CONTENT_LIBRARY_IMAGES);
        return this;
    }

    public TableReporterParamsFilter contentLibraryImages_ExplictlyNonNull() {
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

    public TableReporterParamsFilter nvmfNamespaces(GetNvmfNamespacesRequestBody nvmfNamespaces) {

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
    public GetNvmfNamespacesRequestBody getNvmfNamespaces() {
        return nvmfNamespaces;
    }

    public void setNvmfNamespaces(GetNvmfNamespacesRequestBody nvmfNamespaces) {
        this.nvmfNamespaces = nvmfNamespaces;
    }

    public TableReporterParamsFilter nvmfNamespaces_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NVMF_NAMESPACES);
        return this;
    }

    public TableReporterParamsFilter nvmfNamespaces_ExplictlyNonNull() {
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

    public TableReporterParamsFilter namespaceGroups(
            GetNamespaceGroupsRequestBody namespaceGroups) {

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
    public GetNamespaceGroupsRequestBody getNamespaceGroups() {
        return namespaceGroups;
    }

    public void setNamespaceGroups(GetNamespaceGroupsRequestBody namespaceGroups) {
        this.namespaceGroups = namespaceGroups;
    }

    public TableReporterParamsFilter namespaceGroups_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAMESPACE_GROUPS);
        return this;
    }

    public TableReporterParamsFilter namespaceGroups_ExplictlyNonNull() {
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

    public TableReporterParamsFilter iscsiLuns(GetIscsiLunsRequestBody iscsiLuns) {

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
    public GetIscsiLunsRequestBody getIscsiLuns() {
        return iscsiLuns;
    }

    public void setIscsiLuns(GetIscsiLunsRequestBody iscsiLuns) {
        this.iscsiLuns = iscsiLuns;
    }

    public TableReporterParamsFilter iscsiLuns_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_LUNS);
        return this;
    }

    public TableReporterParamsFilter iscsiLuns_ExplictlyNonNull() {
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

    public TableReporterParamsFilter tasks(GetTasksRequestBody tasks) {

        this.tasks = tasks;
        return this;
    }

    /**
     * Get tasks
     *
     * @return tasks
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public GetTasksRequestBody getTasks() {
        return tasks;
    }

    public void setTasks(GetTasksRequestBody tasks) {
        this.tasks = tasks;
    }

    public TableReporterParamsFilter tasks_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TASKS);
        return this;
    }

    public TableReporterParamsFilter tasks_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TASKS);
        return this;
    }

    public void setTasks_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TASKS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TASKS);
        }
    }

    public boolean getTasks_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TASKS);
    }

    public TableReporterParamsFilter userAuditLogs(GetUserAuditLogsRequestBody userAuditLogs) {

        this.userAuditLogs = userAuditLogs;
        return this;
    }

    /**
     * Get userAuditLogs
     *
     * @return userAuditLogs
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public GetUserAuditLogsRequestBody getUserAuditLogs() {
        return userAuditLogs;
    }

    public void setUserAuditLogs(GetUserAuditLogsRequestBody userAuditLogs) {
        this.userAuditLogs = userAuditLogs;
    }

    public TableReporterParamsFilter userAuditLogs_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USER_AUDIT_LOGS);
        return this;
    }

    public TableReporterParamsFilter userAuditLogs_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USER_AUDIT_LOGS);
        return this;
    }

    public void setUserAuditLogs_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USER_AUDIT_LOGS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USER_AUDIT_LOGS);
        }
    }

    public boolean getUserAuditLogs_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USER_AUDIT_LOGS);
    }

    public TableReporterParamsFilter systemAuditLogs(
            GetSystemAuditLogsRequestBody systemAuditLogs) {

        this.systemAuditLogs = systemAuditLogs;
        return this;
    }

    /**
     * Get systemAuditLogs
     *
     * @return systemAuditLogs
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public GetSystemAuditLogsRequestBody getSystemAuditLogs() {
        return systemAuditLogs;
    }

    public void setSystemAuditLogs(GetSystemAuditLogsRequestBody systemAuditLogs) {
        this.systemAuditLogs = systemAuditLogs;
    }

    public TableReporterParamsFilter systemAuditLogs_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SYSTEM_AUDIT_LOGS);
        return this;
    }

    public TableReporterParamsFilter systemAuditLogs_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SYSTEM_AUDIT_LOGS);
        return this;
    }

    public void setSystemAuditLogs_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SYSTEM_AUDIT_LOGS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SYSTEM_AUDIT_LOGS);
        }
    }

    public boolean getSystemAuditLogs_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SYSTEM_AUDIT_LOGS);
    }

    public TableReporterParamsFilter iscsiLunSnapshots(
            GetIscsiLunSnapshotsRequestBody iscsiLunSnapshots) {

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
    public GetIscsiLunSnapshotsRequestBody getIscsiLunSnapshots() {
        return iscsiLunSnapshots;
    }

    public void setIscsiLunSnapshots(GetIscsiLunSnapshotsRequestBody iscsiLunSnapshots) {
        this.iscsiLunSnapshots = iscsiLunSnapshots;
    }

    public TableReporterParamsFilter iscsiLunSnapshots_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_LUN_SNAPSHOTS);
        return this;
    }

    public TableReporterParamsFilter iscsiLunSnapshots_ExplictlyNonNull() {
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

    public TableReporterParamsFilter iscsiConnections(
            GetIscsiConnectionsRequestBody iscsiConnections) {

        this.iscsiConnections = iscsiConnections;
        return this;
    }

    /**
     * Get iscsiConnections
     *
     * @return iscsiConnections
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public GetIscsiConnectionsRequestBody getIscsiConnections() {
        return iscsiConnections;
    }

    public void setIscsiConnections(GetIscsiConnectionsRequestBody iscsiConnections) {
        this.iscsiConnections = iscsiConnections;
    }

    public TableReporterParamsFilter iscsiConnections_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_CONNECTIONS);
        return this;
    }

    public TableReporterParamsFilter iscsiConnections_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_CONNECTIONS);
        return this;
    }

    public void setIscsiConnections_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_CONNECTIONS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_CONNECTIONS);
        }
    }

    public boolean getIscsiConnections_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_CONNECTIONS);
    }

    public TableReporterParamsFilter consistencyGroups(
            GetConsistencyGroupsRequestBody consistencyGroups) {

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
    public GetConsistencyGroupsRequestBody getConsistencyGroups() {
        return consistencyGroups;
    }

    public void setConsistencyGroups(GetConsistencyGroupsRequestBody consistencyGroups) {
        this.consistencyGroups = consistencyGroups;
    }

    public TableReporterParamsFilter consistencyGroups_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CONSISTENCY_GROUPS);
        return this;
    }

    public TableReporterParamsFilter consistencyGroups_ExplictlyNonNull() {
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

    public TableReporterParamsFilter users(GetUsersRequestBody users) {

        this.users = users;
        return this;
    }

    /**
     * Get users
     *
     * @return users
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public GetUsersRequestBody getUsers() {
        return users;
    }

    public void setUsers(GetUsersRequestBody users) {
        this.users = users;
    }

    public TableReporterParamsFilter users_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USERS);
        return this;
    }

    public TableReporterParamsFilter users_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USERS);
        return this;
    }

    public void setUsers_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USERS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USERS);
        }
    }

    public boolean getUsers_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USERS);
    }

    public TableReporterParamsFilter vmEntityFilters(GetEntityFiltersRequestBody vmEntityFilters) {

        this.vmEntityFilters = vmEntityFilters;
        return this;
    }

    /**
     * Get vmEntityFilters
     *
     * @return vmEntityFilters
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public GetEntityFiltersRequestBody getVmEntityFilters() {
        return vmEntityFilters;
    }

    public void setVmEntityFilters(GetEntityFiltersRequestBody vmEntityFilters) {
        this.vmEntityFilters = vmEntityFilters;
    }

    public TableReporterParamsFilter vmEntityFilters_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_ENTITY_FILTERS);
        return this;
    }

    public TableReporterParamsFilter vmEntityFilters_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_ENTITY_FILTERS);
        return this;
    }

    public void setVmEntityFilters_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_ENTITY_FILTERS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_ENTITY_FILTERS);
        }
    }

    public boolean getVmEntityFilters_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_ENTITY_FILTERS);
    }

    public TableReporterParamsFilter snapshotPlans(GetSnapshotPlansRequestBody snapshotPlans) {

        this.snapshotPlans = snapshotPlans;
        return this;
    }

    /**
     * Get snapshotPlans
     *
     * @return snapshotPlans
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public GetSnapshotPlansRequestBody getSnapshotPlans() {
        return snapshotPlans;
    }

    public void setSnapshotPlans(GetSnapshotPlansRequestBody snapshotPlans) {
        this.snapshotPlans = snapshotPlans;
    }

    public TableReporterParamsFilter snapshotPlans_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT_PLANS);
        return this;
    }

    public TableReporterParamsFilter snapshotPlans_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SNAPSHOT_PLANS);
        return this;
    }

    public void setSnapshotPlans_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT_PLANS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SNAPSHOT_PLANS);
        }
    }

    public boolean getSnapshotPlans_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SNAPSHOT_PLANS);
    }

    public TableReporterParamsFilter globalAlertRules(
            GetGlobalAlertRulesRequestBody globalAlertRules) {

        this.globalAlertRules = globalAlertRules;
        return this;
    }

    /**
     * Get globalAlertRules
     *
     * @return globalAlertRules
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public GetGlobalAlertRulesRequestBody getGlobalAlertRules() {
        return globalAlertRules;
    }

    public void setGlobalAlertRules(GetGlobalAlertRulesRequestBody globalAlertRules) {
        this.globalAlertRules = globalAlertRules;
    }

    public TableReporterParamsFilter globalAlertRules_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_GLOBAL_ALERT_RULES);
        return this;
    }

    public TableReporterParamsFilter globalAlertRules_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_GLOBAL_ALERT_RULES);
        return this;
    }

    public void setGlobalAlertRules_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_GLOBAL_ALERT_RULES);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_GLOBAL_ALERT_RULES);
        }
    }

    public boolean getGlobalAlertRules_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_GLOBAL_ALERT_RULES);
    }

    public TableReporterParamsFilter alerts(GetAlertsRequestBody alerts) {

        this.alerts = alerts;
        return this;
    }

    /**
     * Get alerts
     *
     * @return alerts
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public GetAlertsRequestBody getAlerts() {
        return alerts;
    }

    public void setAlerts(GetAlertsRequestBody alerts) {
        this.alerts = alerts;
    }

    public TableReporterParamsFilter alerts_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ALERTS);
        return this;
    }

    public TableReporterParamsFilter alerts_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ALERTS);
        return this;
    }

    public void setAlerts_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ALERTS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ALERTS);
        }
    }

    public boolean getAlerts_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ALERTS);
    }

    public TableReporterParamsFilter vmPlacementGroups(
            GetVmPlacementGroupsRequestBody vmPlacementGroups) {

        this.vmPlacementGroups = vmPlacementGroups;
        return this;
    }

    /**
     * Get vmPlacementGroups
     *
     * @return vmPlacementGroups
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public GetVmPlacementGroupsRequestBody getVmPlacementGroups() {
        return vmPlacementGroups;
    }

    public void setVmPlacementGroups(GetVmPlacementGroupsRequestBody vmPlacementGroups) {
        this.vmPlacementGroups = vmPlacementGroups;
    }

    public TableReporterParamsFilter vmPlacementGroups_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_PLACEMENT_GROUPS);
        return this;
    }

    public TableReporterParamsFilter vmPlacementGroups_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_PLACEMENT_GROUPS);
        return this;
    }

    public void setVmPlacementGroups_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_PLACEMENT_GROUPS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_PLACEMENT_GROUPS);
        }
    }

    public boolean getVmPlacementGroups_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_PLACEMENT_GROUPS);
    }

    public TableReporterParamsFilter vmTemplates(GetVmTemplatesRequestBody vmTemplates) {

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
    public GetVmTemplatesRequestBody getVmTemplates() {
        return vmTemplates;
    }

    public void setVmTemplates(GetVmTemplatesRequestBody vmTemplates) {
        this.vmTemplates = vmTemplates;
    }

    public TableReporterParamsFilter vmTemplates_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_TEMPLATES);
        return this;
    }

    public TableReporterParamsFilter vmTemplates_ExplictlyNonNull() {
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

    public TableReporterParamsFilter elfImages(GetElfImagesRequestBody elfImages) {

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
    public GetElfImagesRequestBody getElfImages() {
        return elfImages;
    }

    public void setElfImages(GetElfImagesRequestBody elfImages) {
        this.elfImages = elfImages;
    }

    public TableReporterParamsFilter elfImages_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ELF_IMAGES);
        return this;
    }

    public TableReporterParamsFilter elfImages_ExplictlyNonNull() {
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

    public TableReporterParamsFilter vmVolumes(GetVmVolumesRequestBody vmVolumes) {

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
    public GetVmVolumesRequestBody getVmVolumes() {
        return vmVolumes;
    }

    public void setVmVolumes(GetVmVolumesRequestBody vmVolumes) {
        this.vmVolumes = vmVolumes;
    }

    public TableReporterParamsFilter vmVolumes_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_VOLUMES);
        return this;
    }

    public TableReporterParamsFilter vmVolumes_ExplictlyNonNull() {
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

    public TableReporterParamsFilter vlans(GetVlansRequestBody vlans) {

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
    public GetVlansRequestBody getVlans() {
        return vlans;
    }

    public void setVlans(GetVlansRequestBody vlans) {
        this.vlans = vlans;
    }

    public TableReporterParamsFilter vlans_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VLANS);
        return this;
    }

    public TableReporterParamsFilter vlans_ExplictlyNonNull() {
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

    public TableReporterParamsFilter disks(GetDisksRequestBody disks) {

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
    public GetDisksRequestBody getDisks() {
        return disks;
    }

    public void setDisks(GetDisksRequestBody disks) {
        this.disks = disks;
    }

    public TableReporterParamsFilter disks_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DISKS);
        return this;
    }

    public TableReporterParamsFilter disks_ExplictlyNonNull() {
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

    public TableReporterParamsFilter vdses(GetVdsesRequestBody vdses) {

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
    public GetVdsesRequestBody getVdses() {
        return vdses;
    }

    public void setVdses(GetVdsesRequestBody vdses) {
        this.vdses = vdses;
    }

    public TableReporterParamsFilter vdses_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VDSES);
        return this;
    }

    public TableReporterParamsFilter vdses_ExplictlyNonNull() {
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

    public TableReporterParamsFilter elfDataStores(GetElfDataStoresRequestBody elfDataStores) {

        this.elfDataStores = elfDataStores;
        return this;
    }

    /**
     * Get elfDataStores
     *
     * @return elfDataStores
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public GetElfDataStoresRequestBody getElfDataStores() {
        return elfDataStores;
    }

    public void setElfDataStores(GetElfDataStoresRequestBody elfDataStores) {
        this.elfDataStores = elfDataStores;
    }

    public TableReporterParamsFilter elfDataStores_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ELF_DATA_STORES);
        return this;
    }

    public TableReporterParamsFilter elfDataStores_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ELF_DATA_STORES);
        return this;
    }

    public void setElfDataStores_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ELF_DATA_STORES);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ELF_DATA_STORES);
        }
    }

    public boolean getElfDataStores_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ELF_DATA_STORES);
    }

    public TableReporterParamsFilter vms(GetVmsRequestBody vms) {

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
    public GetVmsRequestBody getVms() {
        return vms;
    }

    public void setVms(GetVmsRequestBody vms) {
        this.vms = vms;
    }

    public TableReporterParamsFilter vms_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VMS);
        return this;
    }

    public TableReporterParamsFilter vms_ExplictlyNonNull() {
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

    public TableReporterParamsFilter nfsExports(GetNfsExportsRequestBody nfsExports) {

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
    public GetNfsExportsRequestBody getNfsExports() {
        return nfsExports;
    }

    public void setNfsExports(GetNfsExportsRequestBody nfsExports) {
        this.nfsExports = nfsExports;
    }

    public TableReporterParamsFilter nfsExports_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NFS_EXPORTS);
        return this;
    }

    public TableReporterParamsFilter nfsExports_ExplictlyNonNull() {
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

    public TableReporterParamsFilter iscsiTargets(GetIscsiTargetsRequestBody iscsiTargets) {

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
    public GetIscsiTargetsRequestBody getIscsiTargets() {
        return iscsiTargets;
    }

    public void setIscsiTargets(GetIscsiTargetsRequestBody iscsiTargets) {
        this.iscsiTargets = iscsiTargets;
    }

    public TableReporterParamsFilter iscsiTargets_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_TARGETS);
        return this;
    }

    public TableReporterParamsFilter iscsiTargets_ExplictlyNonNull() {
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

    public TableReporterParamsFilter usbDevices(GetUsbDevicesRequestBody usbDevices) {

        this.usbDevices = usbDevices;
        return this;
    }

    /**
     * Get usbDevices
     *
     * @return usbDevices
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public GetUsbDevicesRequestBody getUsbDevices() {
        return usbDevices;
    }

    public void setUsbDevices(GetUsbDevicesRequestBody usbDevices) {
        this.usbDevices = usbDevices;
    }

    public TableReporterParamsFilter usbDevices_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USB_DEVICES);
        return this;
    }

    public TableReporterParamsFilter usbDevices_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USB_DEVICES);
        return this;
    }

    public void setUsbDevices_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USB_DEVICES);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USB_DEVICES);
        }
    }

    public boolean getUsbDevices_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USB_DEVICES);
    }

    public TableReporterParamsFilter nics(GetNicsRequestBody nics) {

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
    public GetNicsRequestBody getNics() {
        return nics;
    }

    public void setNics(GetNicsRequestBody nics) {
        this.nics = nics;
    }

    public TableReporterParamsFilter nics_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NICS);
        return this;
    }

    public TableReporterParamsFilter nics_ExplictlyNonNull() {
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

    public TableReporterParamsFilter clusters(GetClustersRequestBody clusters) {

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
    public GetClustersRequestBody getClusters() {
        return clusters;
    }

    public void setClusters(GetClustersRequestBody clusters) {
        this.clusters = clusters;
    }

    public TableReporterParamsFilter clusters_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTERS);
        return this;
    }

    public TableReporterParamsFilter clusters_ExplictlyNonNull() {
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

    public TableReporterParamsFilter datacenters(GetDatacentersRequestBody datacenters) {

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
    public GetDatacentersRequestBody getDatacenters() {
        return datacenters;
    }

    public void setDatacenters(GetDatacentersRequestBody datacenters) {
        this.datacenters = datacenters;
    }

    public TableReporterParamsFilter datacenters_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATACENTERS);
        return this;
    }

    public TableReporterParamsFilter datacenters_ExplictlyNonNull() {
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

    public TableReporterParamsFilter hosts(GetHostsRequestBody hosts) {

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
    public GetHostsRequestBody getHosts() {
        return hosts;
    }

    public void setHosts(GetHostsRequestBody hosts) {
        this.hosts = hosts;
    }

    public TableReporterParamsFilter hosts_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOSTS);
        return this;
    }

    public TableReporterParamsFilter hosts_ExplictlyNonNull() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TableReporterParamsFilter tableReporterParamsFilter = (TableReporterParamsFilter) o;
        return Objects.equals(this.nvmfSubsystems, tableReporterParamsFilter.nvmfSubsystems)
                && Objects.equals(
                        this.contentLibraryVmTemplates,
                        tableReporterParamsFilter.contentLibraryVmTemplates)
                && Objects.equals(
                        this.nvmfNamespaceSnapshots,
                        tableReporterParamsFilter.nvmfNamespaceSnapshots)
                && Objects.equals(
                        this.contentLibraryImages, tableReporterParamsFilter.contentLibraryImages)
                && Objects.equals(this.nvmfNamespaces, tableReporterParamsFilter.nvmfNamespaces)
                && Objects.equals(this.namespaceGroups, tableReporterParamsFilter.namespaceGroups)
                && Objects.equals(this.iscsiLuns, tableReporterParamsFilter.iscsiLuns)
                && Objects.equals(this.tasks, tableReporterParamsFilter.tasks)
                && Objects.equals(this.userAuditLogs, tableReporterParamsFilter.userAuditLogs)
                && Objects.equals(this.systemAuditLogs, tableReporterParamsFilter.systemAuditLogs)
                && Objects.equals(
                        this.iscsiLunSnapshots, tableReporterParamsFilter.iscsiLunSnapshots)
                && Objects.equals(this.iscsiConnections, tableReporterParamsFilter.iscsiConnections)
                && Objects.equals(
                        this.consistencyGroups, tableReporterParamsFilter.consistencyGroups)
                && Objects.equals(this.users, tableReporterParamsFilter.users)
                && Objects.equals(this.vmEntityFilters, tableReporterParamsFilter.vmEntityFilters)
                && Objects.equals(this.snapshotPlans, tableReporterParamsFilter.snapshotPlans)
                && Objects.equals(this.globalAlertRules, tableReporterParamsFilter.globalAlertRules)
                && Objects.equals(this.alerts, tableReporterParamsFilter.alerts)
                && Objects.equals(
                        this.vmPlacementGroups, tableReporterParamsFilter.vmPlacementGroups)
                && Objects.equals(this.vmTemplates, tableReporterParamsFilter.vmTemplates)
                && Objects.equals(this.elfImages, tableReporterParamsFilter.elfImages)
                && Objects.equals(this.vmVolumes, tableReporterParamsFilter.vmVolumes)
                && Objects.equals(this.vlans, tableReporterParamsFilter.vlans)
                && Objects.equals(this.disks, tableReporterParamsFilter.disks)
                && Objects.equals(this.vdses, tableReporterParamsFilter.vdses)
                && Objects.equals(this.elfDataStores, tableReporterParamsFilter.elfDataStores)
                && Objects.equals(this.vms, tableReporterParamsFilter.vms)
                && Objects.equals(this.nfsExports, tableReporterParamsFilter.nfsExports)
                && Objects.equals(this.iscsiTargets, tableReporterParamsFilter.iscsiTargets)
                && Objects.equals(this.usbDevices, tableReporterParamsFilter.usbDevices)
                && Objects.equals(this.nics, tableReporterParamsFilter.nics)
                && Objects.equals(this.clusters, tableReporterParamsFilter.clusters)
                && Objects.equals(this.datacenters, tableReporterParamsFilter.datacenters)
                && Objects.equals(this.hosts, tableReporterParamsFilter.hosts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                nvmfSubsystems,
                contentLibraryVmTemplates,
                nvmfNamespaceSnapshots,
                contentLibraryImages,
                nvmfNamespaces,
                namespaceGroups,
                iscsiLuns,
                tasks,
                userAuditLogs,
                systemAuditLogs,
                iscsiLunSnapshots,
                iscsiConnections,
                consistencyGroups,
                users,
                vmEntityFilters,
                snapshotPlans,
                globalAlertRules,
                alerts,
                vmPlacementGroups,
                vmTemplates,
                elfImages,
                vmVolumes,
                vlans,
                disks,
                vdses,
                elfDataStores,
                vms,
                nfsExports,
                iscsiTargets,
                usbDevices,
                nics,
                clusters,
                datacenters,
                hosts);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TableReporterParamsFilter {\n");
        sb.append("    nvmfSubsystems: ").append(toIndentedString(nvmfSubsystems)).append("\n");
        sb.append("    contentLibraryVmTemplates: ")
                .append(toIndentedString(contentLibraryVmTemplates))
                .append("\n");
        sb.append("    nvmfNamespaceSnapshots: ")
                .append(toIndentedString(nvmfNamespaceSnapshots))
                .append("\n");
        sb.append("    contentLibraryImages: ")
                .append(toIndentedString(contentLibraryImages))
                .append("\n");
        sb.append("    nvmfNamespaces: ").append(toIndentedString(nvmfNamespaces)).append("\n");
        sb.append("    namespaceGroups: ").append(toIndentedString(namespaceGroups)).append("\n");
        sb.append("    iscsiLuns: ").append(toIndentedString(iscsiLuns)).append("\n");
        sb.append("    tasks: ").append(toIndentedString(tasks)).append("\n");
        sb.append("    userAuditLogs: ").append(toIndentedString(userAuditLogs)).append("\n");
        sb.append("    systemAuditLogs: ").append(toIndentedString(systemAuditLogs)).append("\n");
        sb.append("    iscsiLunSnapshots: ")
                .append(toIndentedString(iscsiLunSnapshots))
                .append("\n");
        sb.append("    iscsiConnections: ").append(toIndentedString(iscsiConnections)).append("\n");
        sb.append("    consistencyGroups: ")
                .append(toIndentedString(consistencyGroups))
                .append("\n");
        sb.append("    users: ").append(toIndentedString(users)).append("\n");
        sb.append("    vmEntityFilters: ").append(toIndentedString(vmEntityFilters)).append("\n");
        sb.append("    snapshotPlans: ").append(toIndentedString(snapshotPlans)).append("\n");
        sb.append("    globalAlertRules: ").append(toIndentedString(globalAlertRules)).append("\n");
        sb.append("    alerts: ").append(toIndentedString(alerts)).append("\n");
        sb.append("    vmPlacementGroups: ")
                .append(toIndentedString(vmPlacementGroups))
                .append("\n");
        sb.append("    vmTemplates: ").append(toIndentedString(vmTemplates)).append("\n");
        sb.append("    elfImages: ").append(toIndentedString(elfImages)).append("\n");
        sb.append("    vmVolumes: ").append(toIndentedString(vmVolumes)).append("\n");
        sb.append("    vlans: ").append(toIndentedString(vlans)).append("\n");
        sb.append("    disks: ").append(toIndentedString(disks)).append("\n");
        sb.append("    vdses: ").append(toIndentedString(vdses)).append("\n");
        sb.append("    elfDataStores: ").append(toIndentedString(elfDataStores)).append("\n");
        sb.append("    vms: ").append(toIndentedString(vms)).append("\n");
        sb.append("    nfsExports: ").append(toIndentedString(nfsExports)).append("\n");
        sb.append("    iscsiTargets: ").append(toIndentedString(iscsiTargets)).append("\n");
        sb.append("    usbDevices: ").append(toIndentedString(usbDevices)).append("\n");
        sb.append("    nics: ").append(toIndentedString(nics)).append("\n");
        sb.append("    clusters: ").append(toIndentedString(clusters)).append("\n");
        sb.append("    datacenters: ").append(toIndentedString(datacenters)).append("\n");
        sb.append("    hosts: ").append(toIndentedString(hosts)).append("\n");
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

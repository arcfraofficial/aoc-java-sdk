## release date 2026-11-06

v1.1.0 release (aoc version 4.10.0)

### features

- Adds [BackupPlanApi]: create, update, delete, execute, suspend and resume backup plans, and query backup plans / plan executions (including the without-executions variants)
- Adds [BackupRestorePointApi], [BackupRestoreExecutionApi], [BackupTargetExecutionApi], [BackupServiceApi] and [BackupStoreRepositoryApi] for querying backup resources, and [backupRestoreVmInPlace] / [backupRebuildVm] for restoring VMs from restore points
- Adds [ReplicationPlanApi], [ReplicaVmApi], [ReplicationServiceApi] and [SyncReplicationPlanApi] for querying replication plans, replica VMs, replication services and sync replication plans
- [EverouteLicenseApi]: adds [getV2EverouteLicensesConnection]
- [VmApi]: disk parameters of VM creation, cloning, rebuilding, importing, disk addition/update and CD-ROM addition APIs now support the `storageConfig` field to specify the storage cluster (`storageClusterId`) or VCFS datastore (`datastoreId`) where the disk resides; `mountNewCreateDisks` adds the `provisionPolicy` field to specify the provisioning policy of datastore volumes (`thin` / `thick_lazy_zeroed` / `thick_eager_zeroed`)
- [VmApi]: [migrateVmAcrossCluster] supports configuring `storageConfig` and `provisionPolicy` for disks, and adds the `migrateMode` option
- [VmVolumeApi]: [createVmVolume], [importVmVolume] and [cloneVmVolume] add `storageConfig` and `provisionPolicy` fields, supporting creating, importing and cloning VM volumes on datastores with specified provisioning policies
- [VmVolume]: adds fields `provisionPolicy` and `elfStoragePolicyStripeNum`; [VmVolumeType] adds `KVM_VOLUME_VCFS`
- [VmVolumeSnapshot]: adds fields `provisionPolicy` and `elfStoragePolicyStripeNum`; [VmVolumeSnapshotType] adds `KVM_VOLUME_VCFS_SNAPSHOT`
- [Bus]: adds enum value `SATA`; [EncryptMethod]: adds enum value `SM4_CTR`
- [ContentLibraryImageApi]: adds [importContentLibraryImageV2] API, supporting importing images to multiple clusters or datastores; the original [importContentLibraryImage] is deprecated
- [ContentLibraryImageApi]: [uploadContentLibraryImage] adds `datastores` form field, supporting distribution to datastores during upload
- [ContentLibraryImageApi]: [distributeContentLibraryImageClusters] and [removeContentLibraryImageClusters] add `datastores` field, supporting distributing to and removing images by datastore
- [ContentLibraryImage]: adds field `datastores`
- [ContentLibraryImageApi]: [importContentLibraryImage] and image update parameters now accept `datastore`/`datastores` as an alternative to `cluster`/`clusters` (no longer required)
- [ContentLibraryVmTemplateApi]: in [cloneContentLibraryVmTemplateFromVm], `clusters` is no longer required when `storageConfigs` is provided
- [ContentLibraryVmTemplateApi]: [cloneContentLibraryVmTemplateFromVm] adds `storageConfigs` field to specify the datastores for template configuration files and volume files (VCFS template placement)
- [ContentLibraryVmTemplateApi]: [importContentLibraryVmTemplate] adds `storageConfig` and `templateArchitecture` fields
- [ContentLibraryVmTemplate]: adds fields `datastores`, `usage` and `vmTemplateConfigs`
- [Host]: adds memory overcommit related fields `memoryOvercommitEnabled`, `allocatedMemoryBytes`, `memoryAllocationRate`, `overcommitMemoryRatio`, `reservedMemoryBytes`, `runningPauseReservedMemoryBytes`, `overcommitMemoryBytes`, `runningPauseOvercommitMemoryBytes`, `overcommitActiveMemoryBytes`, `totalPhysicalMemoryBytes`
- [Host]: adds fields `dirtyCacheSpace`, `dirtyCacheUsage`, `failureCacheSpace`, `totalLogicalCpuCores`
- [Cluster]: adds memory overcommit related fields `allocatedMemoryBytes`, `memoryAllocationRate`, `overcommitMemoryRatio`
- [Cluster]: adds fields `dirtyCacheSpace`, `dirtyCacheUsage`, `failureCacheSpace`, `overprovisionRatio`, `capSnapshotUniqueSize`, `capVolumeUniqueSize`
- [VmNic]: adds fields `guestInfoIpAddresses`, `guestInfoIpAddressesV6` and `dpiEnabled`
- [Vm]: adds fields `dpiEnabled`, `antiMalwareEnabled`, `internalProduct`, `internalProductName` and `backupPlans`; [VmUsage] adds `CLOUDTOWER_PASSIVE`, `CLOUDTOWER_WITNESS`, `EVEROUTE_LB`, `EVEROUTE_VPC_EDGE`
- [VmFolderApi]: [createVmFolder] and [updateVmFolder] support the `parentId` field for creating and adjusting nested VM folders; [VmFolder] adds fields `parent`, `path` and `totalVmNum`
- [VmPlacementGroup]: adds field `usage`
- [IscsiLun]: adds field `replicationPlans`
- [NetworkType]: adds enum values `CUSTOM`, `ERSPAN`, `INTERNAL`
- [UserApi]: [login] supports logging in via LDAP login sources (`authConfigId`); [MfaType] adds `Totp` and `TotpRecoveryCode`
- [LabelApi]: adds [getLabels] API to query the label list
- [LabelApi]: [getLabels], [updateLabel], [addLabelsToResources] and [removeLabelsFromResources] support the `x-skip-resources` request header to skip loading associated resources for better query performance
- [UserRolePreset]: adds enum value `WORKLOAD_CLUSTER_REGISTRY_USER`
- [VirtualPrivateCloudEdgeGateway]: adds fields `edgeGatewayGroup` and `vpcService`; [VirtualPrivateCloudEdgeGatewayGroup]: adds field `vpcService`
- [EverouteLicensePricingType]: adds enum values `CORE_NUM`, `VCPU_NUM`; [ConnectState]: adds enum value `CONNECTED_ERROR`
- [NestedEverouteControllerInstance]: fields `ipAddr` and `vlan` become optional; [EverouteCluster]: field `controllerTemplate` becomes optional

### breaking changes

- [NestedVirtualPrivateCloudService]: field `tepIpPools` is removed and replaced by the required field `everouteCluster`

### bugfix

- [LabelApi]: fix label queries carrying redundant parameters

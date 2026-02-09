package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** ReplicationRestorePointWhereInput */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class ReplicationRestorePointWhereInput
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_A_N_D = "AND";

    @SerializedName(SERIALIZED_NAME_A_N_D)
    private List<ReplicationRestorePointWhereInput> AND = null;

    public static final String SERIALIZED_NAME_N_O_T = "NOT";

    @SerializedName(SERIALIZED_NAME_N_O_T)
    private List<ReplicationRestorePointWhereInput> NOT = null;

    public static final String SERIALIZED_NAME_O_R = "OR";

    @SerializedName(SERIALIZED_NAME_O_R)
    private List<ReplicationRestorePointWhereInput> OR = null;

    public static final String SERIALIZED_NAME_CLUSTER_LOCAL_ID = "cluster_local_id";

    @SerializedName(SERIALIZED_NAME_CLUSTER_LOCAL_ID)
    private String clusterLocalId;

    public static final String SERIALIZED_NAME_CLUSTER_LOCAL_ID_CONTAINS =
            "cluster_local_id_contains";

    @SerializedName(SERIALIZED_NAME_CLUSTER_LOCAL_ID_CONTAINS)
    private String clusterLocalIdContains;

    public static final String SERIALIZED_NAME_CLUSTER_LOCAL_ID_ENDS_WITH =
            "cluster_local_id_ends_with";

    @SerializedName(SERIALIZED_NAME_CLUSTER_LOCAL_ID_ENDS_WITH)
    private String clusterLocalIdEndsWith;

    public static final String SERIALIZED_NAME_CLUSTER_LOCAL_ID_GT = "cluster_local_id_gt";

    @SerializedName(SERIALIZED_NAME_CLUSTER_LOCAL_ID_GT)
    private String clusterLocalIdGt;

    public static final String SERIALIZED_NAME_CLUSTER_LOCAL_ID_GTE = "cluster_local_id_gte";

    @SerializedName(SERIALIZED_NAME_CLUSTER_LOCAL_ID_GTE)
    private String clusterLocalIdGte;

    public static final String SERIALIZED_NAME_CLUSTER_LOCAL_ID_IN = "cluster_local_id_in";

    @SerializedName(SERIALIZED_NAME_CLUSTER_LOCAL_ID_IN)
    private List<String> clusterLocalIdIn = null;

    public static final String SERIALIZED_NAME_CLUSTER_LOCAL_ID_LT = "cluster_local_id_lt";

    @SerializedName(SERIALIZED_NAME_CLUSTER_LOCAL_ID_LT)
    private String clusterLocalIdLt;

    public static final String SERIALIZED_NAME_CLUSTER_LOCAL_ID_LTE = "cluster_local_id_lte";

    @SerializedName(SERIALIZED_NAME_CLUSTER_LOCAL_ID_LTE)
    private String clusterLocalIdLte;

    public static final String SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT = "cluster_local_id_not";

    @SerializedName(SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT)
    private String clusterLocalIdNot;

    public static final String SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT_CONTAINS =
            "cluster_local_id_not_contains";

    @SerializedName(SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT_CONTAINS)
    private String clusterLocalIdNotContains;

    public static final String SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT_ENDS_WITH =
            "cluster_local_id_not_ends_with";

    @SerializedName(SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT_ENDS_WITH)
    private String clusterLocalIdNotEndsWith;

    public static final String SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT_IN = "cluster_local_id_not_in";

    @SerializedName(SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT_IN)
    private List<String> clusterLocalIdNotIn = null;

    public static final String SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT_STARTS_WITH =
            "cluster_local_id_not_starts_with";

    @SerializedName(SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT_STARTS_WITH)
    private String clusterLocalIdNotStartsWith;

    public static final String SERIALIZED_NAME_CLUSTER_LOCAL_ID_STARTS_WITH =
            "cluster_local_id_starts_with";

    @SerializedName(SERIALIZED_NAME_CLUSTER_LOCAL_ID_STARTS_WITH)
    private String clusterLocalIdStartsWith;

    public static final String SERIALIZED_NAME_CREATION = "creation";

    @SerializedName(SERIALIZED_NAME_CREATION)
    private BackupRestorePointCreation creation;

    public static final String SERIALIZED_NAME_CREATION_IN = "creation_in";

    @SerializedName(SERIALIZED_NAME_CREATION_IN)
    private List<BackupRestorePointCreation> creationIn = null;

    public static final String SERIALIZED_NAME_CREATION_NOT = "creation_not";

    @SerializedName(SERIALIZED_NAME_CREATION_NOT)
    private BackupRestorePointCreation creationNot;

    public static final String SERIALIZED_NAME_CREATION_NOT_IN = "creation_not_in";

    @SerializedName(SERIALIZED_NAME_CREATION_NOT_IN)
    private List<BackupRestorePointCreation> creationNotIn = null;

    public static final String SERIALIZED_NAME_DEDUP = "dedup";

    @SerializedName(SERIALIZED_NAME_DEDUP)
    private BackupDedupMode dedup;

    public static final String SERIALIZED_NAME_DEDUP_IN = "dedup_in";

    @SerializedName(SERIALIZED_NAME_DEDUP_IN)
    private List<BackupDedupMode> dedupIn = null;

    public static final String SERIALIZED_NAME_DEDUP_NOT = "dedup_not";

    @SerializedName(SERIALIZED_NAME_DEDUP_NOT)
    private BackupDedupMode dedupNot;

    public static final String SERIALIZED_NAME_DEDUP_NOT_IN = "dedup_not_in";

    @SerializedName(SERIALIZED_NAME_DEDUP_NOT_IN)
    private List<BackupDedupMode> dedupNotIn = null;

    public static final String SERIALIZED_NAME_ENTITY_ASYNC_STATUS = "entityAsyncStatus";

    @SerializedName(SERIALIZED_NAME_ENTITY_ASYNC_STATUS)
    private EntityAsyncStatus entityAsyncStatus;

    public static final String SERIALIZED_NAME_ENTITY_ASYNC_STATUS_IN = "entityAsyncStatus_in";

    @SerializedName(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_IN)
    private List<EntityAsyncStatus> entityAsyncStatusIn = null;

    public static final String SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT = "entityAsyncStatus_not";

    @SerializedName(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT)
    private EntityAsyncStatus entityAsyncStatusNot;

    public static final String SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT_IN =
            "entityAsyncStatus_not_in";

    @SerializedName(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT_IN)
    private List<EntityAsyncStatus> entityAsyncStatusNotIn = null;

    public static final String SERIALIZED_NAME_FAILOVER_EXECUTIONS_EVERY =
            "failover_executions_every";

    @SerializedName(SERIALIZED_NAME_FAILOVER_EXECUTIONS_EVERY)
    private FailoverExecutionWhereInput failoverExecutionsEvery;

    public static final String SERIALIZED_NAME_FAILOVER_EXECUTIONS_NONE =
            "failover_executions_none";

    @SerializedName(SERIALIZED_NAME_FAILOVER_EXECUTIONS_NONE)
    private FailoverExecutionWhereInput failoverExecutionsNone;

    public static final String SERIALIZED_NAME_FAILOVER_EXECUTIONS_SOME =
            "failover_executions_some";

    @SerializedName(SERIALIZED_NAME_FAILOVER_EXECUTIONS_SOME)
    private FailoverExecutionWhereInput failoverExecutionsSome;

    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

    public static final String SERIALIZED_NAME_ID_CONTAINS = "id_contains";

    @SerializedName(SERIALIZED_NAME_ID_CONTAINS)
    private String idContains;

    public static final String SERIALIZED_NAME_ID_ENDS_WITH = "id_ends_with";

    @SerializedName(SERIALIZED_NAME_ID_ENDS_WITH)
    private String idEndsWith;

    public static final String SERIALIZED_NAME_ID_GT = "id_gt";

    @SerializedName(SERIALIZED_NAME_ID_GT)
    private String idGt;

    public static final String SERIALIZED_NAME_ID_GTE = "id_gte";

    @SerializedName(SERIALIZED_NAME_ID_GTE)
    private String idGte;

    public static final String SERIALIZED_NAME_ID_IN = "id_in";

    @SerializedName(SERIALIZED_NAME_ID_IN)
    private List<String> idIn = null;

    public static final String SERIALIZED_NAME_ID_LT = "id_lt";

    @SerializedName(SERIALIZED_NAME_ID_LT)
    private String idLt;

    public static final String SERIALIZED_NAME_ID_LTE = "id_lte";

    @SerializedName(SERIALIZED_NAME_ID_LTE)
    private String idLte;

    public static final String SERIALIZED_NAME_ID_NOT = "id_not";

    @SerializedName(SERIALIZED_NAME_ID_NOT)
    private String idNot;

    public static final String SERIALIZED_NAME_ID_NOT_CONTAINS = "id_not_contains";

    @SerializedName(SERIALIZED_NAME_ID_NOT_CONTAINS)
    private String idNotContains;

    public static final String SERIALIZED_NAME_ID_NOT_ENDS_WITH = "id_not_ends_with";

    @SerializedName(SERIALIZED_NAME_ID_NOT_ENDS_WITH)
    private String idNotEndsWith;

    public static final String SERIALIZED_NAME_ID_NOT_IN = "id_not_in";

    @SerializedName(SERIALIZED_NAME_ID_NOT_IN)
    private List<String> idNotIn = null;

    public static final String SERIALIZED_NAME_ID_NOT_STARTS_WITH = "id_not_starts_with";

    @SerializedName(SERIALIZED_NAME_ID_NOT_STARTS_WITH)
    private String idNotStartsWith;

    public static final String SERIALIZED_NAME_ID_STARTS_WITH = "id_starts_with";

    @SerializedName(SERIALIZED_NAME_ID_STARTS_WITH)
    private String idStartsWith;

    public static final String SERIALIZED_NAME_ISCSI_LUN = "iscsi_lun";

    @SerializedName(SERIALIZED_NAME_ISCSI_LUN)
    private IscsiLunWhereInput iscsiLun;

    public static final String SERIALIZED_NAME_LOCAL_CREATED_AT = "local_created_at";

    @SerializedName(SERIALIZED_NAME_LOCAL_CREATED_AT)
    private String localCreatedAt;

    public static final String SERIALIZED_NAME_LOCAL_CREATED_AT_GT = "local_created_at_gt";

    @SerializedName(SERIALIZED_NAME_LOCAL_CREATED_AT_GT)
    private String localCreatedAtGt;

    public static final String SERIALIZED_NAME_LOCAL_CREATED_AT_GTE = "local_created_at_gte";

    @SerializedName(SERIALIZED_NAME_LOCAL_CREATED_AT_GTE)
    private String localCreatedAtGte;

    public static final String SERIALIZED_NAME_LOCAL_CREATED_AT_IN = "local_created_at_in";

    @SerializedName(SERIALIZED_NAME_LOCAL_CREATED_AT_IN)
    private List<String> localCreatedAtIn = null;

    public static final String SERIALIZED_NAME_LOCAL_CREATED_AT_LT = "local_created_at_lt";

    @SerializedName(SERIALIZED_NAME_LOCAL_CREATED_AT_LT)
    private String localCreatedAtLt;

    public static final String SERIALIZED_NAME_LOCAL_CREATED_AT_LTE = "local_created_at_lte";

    @SerializedName(SERIALIZED_NAME_LOCAL_CREATED_AT_LTE)
    private String localCreatedAtLte;

    public static final String SERIALIZED_NAME_LOCAL_CREATED_AT_NOT = "local_created_at_not";

    @SerializedName(SERIALIZED_NAME_LOCAL_CREATED_AT_NOT)
    private String localCreatedAtNot;

    public static final String SERIALIZED_NAME_LOCAL_CREATED_AT_NOT_IN = "local_created_at_not_in";

    @SerializedName(SERIALIZED_NAME_LOCAL_CREATED_AT_NOT_IN)
    private List<String> localCreatedAtNotIn = null;

    public static final String SERIALIZED_NAME_LOCAL_ID = "local_id";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID)
    private String localId;

    public static final String SERIALIZED_NAME_LOCAL_ID_CONTAINS = "local_id_contains";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID_CONTAINS)
    private String localIdContains;

    public static final String SERIALIZED_NAME_LOCAL_ID_ENDS_WITH = "local_id_ends_with";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID_ENDS_WITH)
    private String localIdEndsWith;

    public static final String SERIALIZED_NAME_LOCAL_ID_GT = "local_id_gt";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID_GT)
    private String localIdGt;

    public static final String SERIALIZED_NAME_LOCAL_ID_GTE = "local_id_gte";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID_GTE)
    private String localIdGte;

    public static final String SERIALIZED_NAME_LOCAL_ID_IN = "local_id_in";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID_IN)
    private List<String> localIdIn = null;

    public static final String SERIALIZED_NAME_LOCAL_ID_LT = "local_id_lt";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID_LT)
    private String localIdLt;

    public static final String SERIALIZED_NAME_LOCAL_ID_LTE = "local_id_lte";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID_LTE)
    private String localIdLte;

    public static final String SERIALIZED_NAME_LOCAL_ID_NOT = "local_id_not";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID_NOT)
    private String localIdNot;

    public static final String SERIALIZED_NAME_LOCAL_ID_NOT_CONTAINS = "local_id_not_contains";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID_NOT_CONTAINS)
    private String localIdNotContains;

    public static final String SERIALIZED_NAME_LOCAL_ID_NOT_ENDS_WITH = "local_id_not_ends_with";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID_NOT_ENDS_WITH)
    private String localIdNotEndsWith;

    public static final String SERIALIZED_NAME_LOCAL_ID_NOT_IN = "local_id_not_in";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID_NOT_IN)
    private List<String> localIdNotIn = null;

    public static final String SERIALIZED_NAME_LOCAL_ID_NOT_STARTS_WITH =
            "local_id_not_starts_with";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID_NOT_STARTS_WITH)
    private String localIdNotStartsWith;

    public static final String SERIALIZED_NAME_LOCAL_ID_STARTS_WITH = "local_id_starts_with";

    @SerializedName(SERIALIZED_NAME_LOCAL_ID_STARTS_WITH)
    private String localIdStartsWith;

    public static final String SERIALIZED_NAME_PARENT_RESTORE_POINT = "parent_restore_point";

    @SerializedName(SERIALIZED_NAME_PARENT_RESTORE_POINT)
    private String parentRestorePoint;

    public static final String SERIALIZED_NAME_PARENT_RESTORE_POINT_CONTAINS =
            "parent_restore_point_contains";

    @SerializedName(SERIALIZED_NAME_PARENT_RESTORE_POINT_CONTAINS)
    private String parentRestorePointContains;

    public static final String SERIALIZED_NAME_PARENT_RESTORE_POINT_ENDS_WITH =
            "parent_restore_point_ends_with";

    @SerializedName(SERIALIZED_NAME_PARENT_RESTORE_POINT_ENDS_WITH)
    private String parentRestorePointEndsWith;

    public static final String SERIALIZED_NAME_PARENT_RESTORE_POINT_GT = "parent_restore_point_gt";

    @SerializedName(SERIALIZED_NAME_PARENT_RESTORE_POINT_GT)
    private String parentRestorePointGt;

    public static final String SERIALIZED_NAME_PARENT_RESTORE_POINT_GTE =
            "parent_restore_point_gte";

    @SerializedName(SERIALIZED_NAME_PARENT_RESTORE_POINT_GTE)
    private String parentRestorePointGte;

    public static final String SERIALIZED_NAME_PARENT_RESTORE_POINT_IN = "parent_restore_point_in";

    @SerializedName(SERIALIZED_NAME_PARENT_RESTORE_POINT_IN)
    private List<String> parentRestorePointIn = null;

    public static final String SERIALIZED_NAME_PARENT_RESTORE_POINT_LT = "parent_restore_point_lt";

    @SerializedName(SERIALIZED_NAME_PARENT_RESTORE_POINT_LT)
    private String parentRestorePointLt;

    public static final String SERIALIZED_NAME_PARENT_RESTORE_POINT_LTE =
            "parent_restore_point_lte";

    @SerializedName(SERIALIZED_NAME_PARENT_RESTORE_POINT_LTE)
    private String parentRestorePointLte;

    public static final String SERIALIZED_NAME_PARENT_RESTORE_POINT_NOT =
            "parent_restore_point_not";

    @SerializedName(SERIALIZED_NAME_PARENT_RESTORE_POINT_NOT)
    private String parentRestorePointNot;

    public static final String SERIALIZED_NAME_PARENT_RESTORE_POINT_NOT_CONTAINS =
            "parent_restore_point_not_contains";

    @SerializedName(SERIALIZED_NAME_PARENT_RESTORE_POINT_NOT_CONTAINS)
    private String parentRestorePointNotContains;

    public static final String SERIALIZED_NAME_PARENT_RESTORE_POINT_NOT_ENDS_WITH =
            "parent_restore_point_not_ends_with";

    @SerializedName(SERIALIZED_NAME_PARENT_RESTORE_POINT_NOT_ENDS_WITH)
    private String parentRestorePointNotEndsWith;

    public static final String SERIALIZED_NAME_PARENT_RESTORE_POINT_NOT_IN =
            "parent_restore_point_not_in";

    @SerializedName(SERIALIZED_NAME_PARENT_RESTORE_POINT_NOT_IN)
    private List<String> parentRestorePointNotIn = null;

    public static final String SERIALIZED_NAME_PARENT_RESTORE_POINT_NOT_STARTS_WITH =
            "parent_restore_point_not_starts_with";

    @SerializedName(SERIALIZED_NAME_PARENT_RESTORE_POINT_NOT_STARTS_WITH)
    private String parentRestorePointNotStartsWith;

    public static final String SERIALIZED_NAME_PARENT_RESTORE_POINT_STARTS_WITH =
            "parent_restore_point_starts_with";

    @SerializedName(SERIALIZED_NAME_PARENT_RESTORE_POINT_STARTS_WITH)
    private String parentRestorePointStartsWith;

    public static final String SERIALIZED_NAME_REPLICA_VM = "replica_vm";

    @SerializedName(SERIALIZED_NAME_REPLICA_VM)
    private ReplicaVmWhereInput replicaVm;

    public static final String SERIALIZED_NAME_REPLICATION_PLAN = "replication_plan";

    @SerializedName(SERIALIZED_NAME_REPLICATION_PLAN)
    private ReplicationPlanWhereInput replicationPlan;

    public static final String SERIALIZED_NAME_REPLICATION_SERVICE = "replication_service";

    @SerializedName(SERIALIZED_NAME_REPLICATION_SERVICE)
    private ReplicationServiceWhereInput replicationService;

    public static final String SERIALIZED_NAME_REPLICATION_TARGET_EXECUTION =
            "replication_target_execution";

    @SerializedName(SERIALIZED_NAME_REPLICATION_TARGET_EXECUTION)
    private ReplicationTargetExecutionWhereInput replicationTargetExecution;

    public static final String SERIALIZED_NAME_RESOURCE_VERSION = "resource_version";

    @SerializedName(SERIALIZED_NAME_RESOURCE_VERSION)
    private Integer resourceVersion;

    public static final String SERIALIZED_NAME_RESOURCE_VERSION_GT = "resource_version_gt";

    @SerializedName(SERIALIZED_NAME_RESOURCE_VERSION_GT)
    private Integer resourceVersionGt;

    public static final String SERIALIZED_NAME_RESOURCE_VERSION_GTE = "resource_version_gte";

    @SerializedName(SERIALIZED_NAME_RESOURCE_VERSION_GTE)
    private Integer resourceVersionGte;

    public static final String SERIALIZED_NAME_RESOURCE_VERSION_IN = "resource_version_in";

    @SerializedName(SERIALIZED_NAME_RESOURCE_VERSION_IN)
    private List<Integer> resourceVersionIn = null;

    public static final String SERIALIZED_NAME_RESOURCE_VERSION_LT = "resource_version_lt";

    @SerializedName(SERIALIZED_NAME_RESOURCE_VERSION_LT)
    private Integer resourceVersionLt;

    public static final String SERIALIZED_NAME_RESOURCE_VERSION_LTE = "resource_version_lte";

    @SerializedName(SERIALIZED_NAME_RESOURCE_VERSION_LTE)
    private Integer resourceVersionLte;

    public static final String SERIALIZED_NAME_RESOURCE_VERSION_NOT = "resource_version_not";

    @SerializedName(SERIALIZED_NAME_RESOURCE_VERSION_NOT)
    private Integer resourceVersionNot;

    public static final String SERIALIZED_NAME_RESOURCE_VERSION_NOT_IN = "resource_version_not_in";

    @SerializedName(SERIALIZED_NAME_RESOURCE_VERSION_NOT_IN)
    private List<Integer> resourceVersionNotIn = null;

    public static final String SERIALIZED_NAME_SLICE = "slice";

    @SerializedName(SERIALIZED_NAME_SLICE)
    private String slice;

    public static final String SERIALIZED_NAME_SLICE_CONTAINS = "slice_contains";

    @SerializedName(SERIALIZED_NAME_SLICE_CONTAINS)
    private String sliceContains;

    public static final String SERIALIZED_NAME_SLICE_ENDS_WITH = "slice_ends_with";

    @SerializedName(SERIALIZED_NAME_SLICE_ENDS_WITH)
    private String sliceEndsWith;

    public static final String SERIALIZED_NAME_SLICE_GT = "slice_gt";

    @SerializedName(SERIALIZED_NAME_SLICE_GT)
    private String sliceGt;

    public static final String SERIALIZED_NAME_SLICE_GTE = "slice_gte";

    @SerializedName(SERIALIZED_NAME_SLICE_GTE)
    private String sliceGte;

    public static final String SERIALIZED_NAME_SLICE_IN = "slice_in";

    @SerializedName(SERIALIZED_NAME_SLICE_IN)
    private List<String> sliceIn = null;

    public static final String SERIALIZED_NAME_SLICE_LT = "slice_lt";

    @SerializedName(SERIALIZED_NAME_SLICE_LT)
    private String sliceLt;

    public static final String SERIALIZED_NAME_SLICE_LTE = "slice_lte";

    @SerializedName(SERIALIZED_NAME_SLICE_LTE)
    private String sliceLte;

    public static final String SERIALIZED_NAME_SLICE_NOT = "slice_not";

    @SerializedName(SERIALIZED_NAME_SLICE_NOT)
    private String sliceNot;

    public static final String SERIALIZED_NAME_SLICE_NOT_CONTAINS = "slice_not_contains";

    @SerializedName(SERIALIZED_NAME_SLICE_NOT_CONTAINS)
    private String sliceNotContains;

    public static final String SERIALIZED_NAME_SLICE_NOT_ENDS_WITH = "slice_not_ends_with";

    @SerializedName(SERIALIZED_NAME_SLICE_NOT_ENDS_WITH)
    private String sliceNotEndsWith;

    public static final String SERIALIZED_NAME_SLICE_NOT_IN = "slice_not_in";

    @SerializedName(SERIALIZED_NAME_SLICE_NOT_IN)
    private List<String> sliceNotIn = null;

    public static final String SERIALIZED_NAME_SLICE_NOT_STARTS_WITH = "slice_not_starts_with";

    @SerializedName(SERIALIZED_NAME_SLICE_NOT_STARTS_WITH)
    private String sliceNotStartsWith;

    public static final String SERIALIZED_NAME_SLICE_STARTS_WITH = "slice_starts_with";

    @SerializedName(SERIALIZED_NAME_SLICE_STARTS_WITH)
    private String sliceStartsWith;

    public static final String SERIALIZED_NAME_SNAPSHOT_CONSISTENT_TYPE =
            "snapshot_consistent_type";

    @SerializedName(SERIALIZED_NAME_SNAPSHOT_CONSISTENT_TYPE)
    private ConsistentType snapshotConsistentType;

    public static final String SERIALIZED_NAME_SNAPSHOT_CONSISTENT_TYPE_IN =
            "snapshot_consistent_type_in";

    @SerializedName(SERIALIZED_NAME_SNAPSHOT_CONSISTENT_TYPE_IN)
    private List<ConsistentType> snapshotConsistentTypeIn = null;

    public static final String SERIALIZED_NAME_SNAPSHOT_CONSISTENT_TYPE_NOT =
            "snapshot_consistent_type_not";

    @SerializedName(SERIALIZED_NAME_SNAPSHOT_CONSISTENT_TYPE_NOT)
    private ConsistentType snapshotConsistentTypeNot;

    public static final String SERIALIZED_NAME_SNAPSHOT_CONSISTENT_TYPE_NOT_IN =
            "snapshot_consistent_type_not_in";

    @SerializedName(SERIALIZED_NAME_SNAPSHOT_CONSISTENT_TYPE_NOT_IN)
    private List<ConsistentType> snapshotConsistentTypeNotIn = null;

    public static final String SERIALIZED_NAME_SYNC_REPLICATION_PLAN = "sync_replication_plan";

    @SerializedName(SERIALIZED_NAME_SYNC_REPLICATION_PLAN)
    private SyncReplicationPlanWhereInput syncReplicationPlan;

    public static final String SERIALIZED_NAME_TOWER_DEPLOY_ID = "tower_deploy_id";

    @SerializedName(SERIALIZED_NAME_TOWER_DEPLOY_ID)
    private String towerDeployId;

    public static final String SERIALIZED_NAME_TOWER_DEPLOY_ID_CONTAINS =
            "tower_deploy_id_contains";

    @SerializedName(SERIALIZED_NAME_TOWER_DEPLOY_ID_CONTAINS)
    private String towerDeployIdContains;

    public static final String SERIALIZED_NAME_TOWER_DEPLOY_ID_ENDS_WITH =
            "tower_deploy_id_ends_with";

    @SerializedName(SERIALIZED_NAME_TOWER_DEPLOY_ID_ENDS_WITH)
    private String towerDeployIdEndsWith;

    public static final String SERIALIZED_NAME_TOWER_DEPLOY_ID_GT = "tower_deploy_id_gt";

    @SerializedName(SERIALIZED_NAME_TOWER_DEPLOY_ID_GT)
    private String towerDeployIdGt;

    public static final String SERIALIZED_NAME_TOWER_DEPLOY_ID_GTE = "tower_deploy_id_gte";

    @SerializedName(SERIALIZED_NAME_TOWER_DEPLOY_ID_GTE)
    private String towerDeployIdGte;

    public static final String SERIALIZED_NAME_TOWER_DEPLOY_ID_IN = "tower_deploy_id_in";

    @SerializedName(SERIALIZED_NAME_TOWER_DEPLOY_ID_IN)
    private List<String> towerDeployIdIn = null;

    public static final String SERIALIZED_NAME_TOWER_DEPLOY_ID_LT = "tower_deploy_id_lt";

    @SerializedName(SERIALIZED_NAME_TOWER_DEPLOY_ID_LT)
    private String towerDeployIdLt;

    public static final String SERIALIZED_NAME_TOWER_DEPLOY_ID_LTE = "tower_deploy_id_lte";

    @SerializedName(SERIALIZED_NAME_TOWER_DEPLOY_ID_LTE)
    private String towerDeployIdLte;

    public static final String SERIALIZED_NAME_TOWER_DEPLOY_ID_NOT = "tower_deploy_id_not";

    @SerializedName(SERIALIZED_NAME_TOWER_DEPLOY_ID_NOT)
    private String towerDeployIdNot;

    public static final String SERIALIZED_NAME_TOWER_DEPLOY_ID_NOT_CONTAINS =
            "tower_deploy_id_not_contains";

    @SerializedName(SERIALIZED_NAME_TOWER_DEPLOY_ID_NOT_CONTAINS)
    private String towerDeployIdNotContains;

    public static final String SERIALIZED_NAME_TOWER_DEPLOY_ID_NOT_ENDS_WITH =
            "tower_deploy_id_not_ends_with";

    @SerializedName(SERIALIZED_NAME_TOWER_DEPLOY_ID_NOT_ENDS_WITH)
    private String towerDeployIdNotEndsWith;

    public static final String SERIALIZED_NAME_TOWER_DEPLOY_ID_NOT_IN = "tower_deploy_id_not_in";

    @SerializedName(SERIALIZED_NAME_TOWER_DEPLOY_ID_NOT_IN)
    private List<String> towerDeployIdNotIn = null;

    public static final String SERIALIZED_NAME_TOWER_DEPLOY_ID_NOT_STARTS_WITH =
            "tower_deploy_id_not_starts_with";

    @SerializedName(SERIALIZED_NAME_TOWER_DEPLOY_ID_NOT_STARTS_WITH)
    private String towerDeployIdNotStartsWith;

    public static final String SERIALIZED_NAME_TOWER_DEPLOY_ID_STARTS_WITH =
            "tower_deploy_id_starts_with";

    @SerializedName(SERIALIZED_NAME_TOWER_DEPLOY_ID_STARTS_WITH)
    private String towerDeployIdStartsWith;

    public static final String SERIALIZED_NAME_TYPE = "type";

    @SerializedName(SERIALIZED_NAME_TYPE)
    private BackupRestorePointType type;

    public static final String SERIALIZED_NAME_TYPE_IN = "type_in";

    @SerializedName(SERIALIZED_NAME_TYPE_IN)
    private List<BackupRestorePointType> typeIn = null;

    public static final String SERIALIZED_NAME_TYPE_NOT = "type_not";

    @SerializedName(SERIALIZED_NAME_TYPE_NOT)
    private BackupRestorePointType typeNot;

    public static final String SERIALIZED_NAME_TYPE_NOT_IN = "type_not_in";

    @SerializedName(SERIALIZED_NAME_TYPE_NOT_IN)
    private List<BackupRestorePointType> typeNotIn = null;

    public static final String SERIALIZED_NAME_VM = "vm";

    @SerializedName(SERIALIZED_NAME_VM)
    private VmWhereInput vm;

    public static final String SERIALIZED_NAME_VM_LOCAL_ID = "vm_local_id";

    @SerializedName(SERIALIZED_NAME_VM_LOCAL_ID)
    private String vmLocalId;

    public static final String SERIALIZED_NAME_VM_LOCAL_ID_CONTAINS = "vm_local_id_contains";

    @SerializedName(SERIALIZED_NAME_VM_LOCAL_ID_CONTAINS)
    private String vmLocalIdContains;

    public static final String SERIALIZED_NAME_VM_LOCAL_ID_ENDS_WITH = "vm_local_id_ends_with";

    @SerializedName(SERIALIZED_NAME_VM_LOCAL_ID_ENDS_WITH)
    private String vmLocalIdEndsWith;

    public static final String SERIALIZED_NAME_VM_LOCAL_ID_GT = "vm_local_id_gt";

    @SerializedName(SERIALIZED_NAME_VM_LOCAL_ID_GT)
    private String vmLocalIdGt;

    public static final String SERIALIZED_NAME_VM_LOCAL_ID_GTE = "vm_local_id_gte";

    @SerializedName(SERIALIZED_NAME_VM_LOCAL_ID_GTE)
    private String vmLocalIdGte;

    public static final String SERIALIZED_NAME_VM_LOCAL_ID_IN = "vm_local_id_in";

    @SerializedName(SERIALIZED_NAME_VM_LOCAL_ID_IN)
    private List<String> vmLocalIdIn = null;

    public static final String SERIALIZED_NAME_VM_LOCAL_ID_LT = "vm_local_id_lt";

    @SerializedName(SERIALIZED_NAME_VM_LOCAL_ID_LT)
    private String vmLocalIdLt;

    public static final String SERIALIZED_NAME_VM_LOCAL_ID_LTE = "vm_local_id_lte";

    @SerializedName(SERIALIZED_NAME_VM_LOCAL_ID_LTE)
    private String vmLocalIdLte;

    public static final String SERIALIZED_NAME_VM_LOCAL_ID_NOT = "vm_local_id_not";

    @SerializedName(SERIALIZED_NAME_VM_LOCAL_ID_NOT)
    private String vmLocalIdNot;

    public static final String SERIALIZED_NAME_VM_LOCAL_ID_NOT_CONTAINS =
            "vm_local_id_not_contains";

    @SerializedName(SERIALIZED_NAME_VM_LOCAL_ID_NOT_CONTAINS)
    private String vmLocalIdNotContains;

    public static final String SERIALIZED_NAME_VM_LOCAL_ID_NOT_ENDS_WITH =
            "vm_local_id_not_ends_with";

    @SerializedName(SERIALIZED_NAME_VM_LOCAL_ID_NOT_ENDS_WITH)
    private String vmLocalIdNotEndsWith;

    public static final String SERIALIZED_NAME_VM_LOCAL_ID_NOT_IN = "vm_local_id_not_in";

    @SerializedName(SERIALIZED_NAME_VM_LOCAL_ID_NOT_IN)
    private List<String> vmLocalIdNotIn = null;

    public static final String SERIALIZED_NAME_VM_LOCAL_ID_NOT_STARTS_WITH =
            "vm_local_id_not_starts_with";

    @SerializedName(SERIALIZED_NAME_VM_LOCAL_ID_NOT_STARTS_WITH)
    private String vmLocalIdNotStartsWith;

    public static final String SERIALIZED_NAME_VM_LOCAL_ID_STARTS_WITH = "vm_local_id_starts_with";

    @SerializedName(SERIALIZED_NAME_VM_LOCAL_ID_STARTS_WITH)
    private String vmLocalIdStartsWith;

    public static final String SERIALIZED_NAME_VM_NAME = "vm_name";

    @SerializedName(SERIALIZED_NAME_VM_NAME)
    private String vmName;

    public static final String SERIALIZED_NAME_VM_NAME_CONTAINS = "vm_name_contains";

    @SerializedName(SERIALIZED_NAME_VM_NAME_CONTAINS)
    private String vmNameContains;

    public static final String SERIALIZED_NAME_VM_NAME_ENDS_WITH = "vm_name_ends_with";

    @SerializedName(SERIALIZED_NAME_VM_NAME_ENDS_WITH)
    private String vmNameEndsWith;

    public static final String SERIALIZED_NAME_VM_NAME_GT = "vm_name_gt";

    @SerializedName(SERIALIZED_NAME_VM_NAME_GT)
    private String vmNameGt;

    public static final String SERIALIZED_NAME_VM_NAME_GTE = "vm_name_gte";

    @SerializedName(SERIALIZED_NAME_VM_NAME_GTE)
    private String vmNameGte;

    public static final String SERIALIZED_NAME_VM_NAME_IN = "vm_name_in";

    @SerializedName(SERIALIZED_NAME_VM_NAME_IN)
    private List<String> vmNameIn = null;

    public static final String SERIALIZED_NAME_VM_NAME_LT = "vm_name_lt";

    @SerializedName(SERIALIZED_NAME_VM_NAME_LT)
    private String vmNameLt;

    public static final String SERIALIZED_NAME_VM_NAME_LTE = "vm_name_lte";

    @SerializedName(SERIALIZED_NAME_VM_NAME_LTE)
    private String vmNameLte;

    public static final String SERIALIZED_NAME_VM_NAME_NOT = "vm_name_not";

    @SerializedName(SERIALIZED_NAME_VM_NAME_NOT)
    private String vmNameNot;

    public static final String SERIALIZED_NAME_VM_NAME_NOT_CONTAINS = "vm_name_not_contains";

    @SerializedName(SERIALIZED_NAME_VM_NAME_NOT_CONTAINS)
    private String vmNameNotContains;

    public static final String SERIALIZED_NAME_VM_NAME_NOT_ENDS_WITH = "vm_name_not_ends_with";

    @SerializedName(SERIALIZED_NAME_VM_NAME_NOT_ENDS_WITH)
    private String vmNameNotEndsWith;

    public static final String SERIALIZED_NAME_VM_NAME_NOT_IN = "vm_name_not_in";

    @SerializedName(SERIALIZED_NAME_VM_NAME_NOT_IN)
    private List<String> vmNameNotIn = null;

    public static final String SERIALIZED_NAME_VM_NAME_NOT_STARTS_WITH = "vm_name_not_starts_with";

    @SerializedName(SERIALIZED_NAME_VM_NAME_NOT_STARTS_WITH)
    private String vmNameNotStartsWith;

    public static final String SERIALIZED_NAME_VM_NAME_STARTS_WITH = "vm_name_starts_with";

    @SerializedName(SERIALIZED_NAME_VM_NAME_STARTS_WITH)
    private String vmNameStartsWith;

    public ReplicationRestorePointWhereInput() {}

    public ReplicationRestorePointWhereInput AND(List<ReplicationRestorePointWhereInput> AND) {

        this.AND = AND;
        return this;
    }

    public ReplicationRestorePointWhereInput addANDItem(ReplicationRestorePointWhereInput ANDItem) {
        if (this.AND == null) {
            this.AND = new ArrayList<ReplicationRestorePointWhereInput>();
        }
        this.AND.add(ANDItem);
        return this;
    }

    /**
     * Get AND
     *
     * @return AND
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<ReplicationRestorePointWhereInput> getAND() {
        return AND;
    }

    public void setAND(List<ReplicationRestorePointWhereInput> AND) {
        this.AND = AND;
    }

    public ReplicationRestorePointWhereInput AND_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_A_N_D);
        return this;
    }

    public ReplicationRestorePointWhereInput AND_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_A_N_D);
        return this;
    }

    public void setAND_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_A_N_D);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_A_N_D);
        }
    }

    public boolean getAND_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_A_N_D);
    }

    public ReplicationRestorePointWhereInput NOT(List<ReplicationRestorePointWhereInput> NOT) {

        this.NOT = NOT;
        return this;
    }

    public ReplicationRestorePointWhereInput addNOTItem(ReplicationRestorePointWhereInput NOTItem) {
        if (this.NOT == null) {
            this.NOT = new ArrayList<ReplicationRestorePointWhereInput>();
        }
        this.NOT.add(NOTItem);
        return this;
    }

    /**
     * Get NOT
     *
     * @return NOT
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<ReplicationRestorePointWhereInput> getNOT() {
        return NOT;
    }

    public void setNOT(List<ReplicationRestorePointWhereInput> NOT) {
        this.NOT = NOT;
    }

    public ReplicationRestorePointWhereInput NOT_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_N_O_T);
        return this;
    }

    public ReplicationRestorePointWhereInput NOT_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_N_O_T);
        return this;
    }

    public void setNOT_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_N_O_T);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_N_O_T);
        }
    }

    public boolean getNOT_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_N_O_T);
    }

    public ReplicationRestorePointWhereInput OR(List<ReplicationRestorePointWhereInput> OR) {

        this.OR = OR;
        return this;
    }

    public ReplicationRestorePointWhereInput addORItem(ReplicationRestorePointWhereInput ORItem) {
        if (this.OR == null) {
            this.OR = new ArrayList<ReplicationRestorePointWhereInput>();
        }
        this.OR.add(ORItem);
        return this;
    }

    /**
     * Get OR
     *
     * @return OR
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<ReplicationRestorePointWhereInput> getOR() {
        return OR;
    }

    public void setOR(List<ReplicationRestorePointWhereInput> OR) {
        this.OR = OR;
    }

    public ReplicationRestorePointWhereInput OR_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_O_R);
        return this;
    }

    public ReplicationRestorePointWhereInput OR_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_O_R);
        return this;
    }

    public void setOR_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_O_R);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_O_R);
        }
    }

    public boolean getOR_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_O_R);
    }

    public ReplicationRestorePointWhereInput clusterLocalId(String clusterLocalId) {

        this.clusterLocalId = clusterLocalId;
        return this;
    }

    /**
     * Get clusterLocalId
     *
     * @return clusterLocalId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getClusterLocalId() {
        return clusterLocalId;
    }

    public void setClusterLocalId(String clusterLocalId) {
        this.clusterLocalId = clusterLocalId;
    }

    public ReplicationRestorePointWhereInput clusterLocalId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID);
        return this;
    }

    public ReplicationRestorePointWhereInput clusterLocalId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_LOCAL_ID);
        return this;
    }

    public void setClusterLocalId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_LOCAL_ID);
        }
    }

    public boolean getClusterLocalId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLUSTER_LOCAL_ID);
    }

    public ReplicationRestorePointWhereInput clusterLocalIdContains(String clusterLocalIdContains) {

        this.clusterLocalIdContains = clusterLocalIdContains;
        return this;
    }

    /**
     * Get clusterLocalIdContains
     *
     * @return clusterLocalIdContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getClusterLocalIdContains() {
        return clusterLocalIdContains;
    }

    public void setClusterLocalIdContains(String clusterLocalIdContains) {
        this.clusterLocalIdContains = clusterLocalIdContains;
    }

    public ReplicationRestorePointWhereInput clusterLocalIdContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID_CONTAINS);
        return this;
    }

    public ReplicationRestorePointWhereInput clusterLocalIdContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_LOCAL_ID_CONTAINS);
        return this;
    }

    public void setClusterLocalIdContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_LOCAL_ID_CONTAINS);
        }
    }

    public boolean getClusterLocalIdContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLUSTER_LOCAL_ID_CONTAINS);
    }

    public ReplicationRestorePointWhereInput clusterLocalIdEndsWith(String clusterLocalIdEndsWith) {

        this.clusterLocalIdEndsWith = clusterLocalIdEndsWith;
        return this;
    }

    /**
     * Get clusterLocalIdEndsWith
     *
     * @return clusterLocalIdEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getClusterLocalIdEndsWith() {
        return clusterLocalIdEndsWith;
    }

    public void setClusterLocalIdEndsWith(String clusterLocalIdEndsWith) {
        this.clusterLocalIdEndsWith = clusterLocalIdEndsWith;
    }

    public ReplicationRestorePointWhereInput clusterLocalIdEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID_ENDS_WITH);
        return this;
    }

    public ReplicationRestorePointWhereInput clusterLocalIdEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_LOCAL_ID_ENDS_WITH);
        return this;
    }

    public void setClusterLocalIdEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_LOCAL_ID_ENDS_WITH);
        }
    }

    public boolean getClusterLocalIdEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLUSTER_LOCAL_ID_ENDS_WITH);
    }

    public ReplicationRestorePointWhereInput clusterLocalIdGt(String clusterLocalIdGt) {

        this.clusterLocalIdGt = clusterLocalIdGt;
        return this;
    }

    /**
     * Get clusterLocalIdGt
     *
     * @return clusterLocalIdGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getClusterLocalIdGt() {
        return clusterLocalIdGt;
    }

    public void setClusterLocalIdGt(String clusterLocalIdGt) {
        this.clusterLocalIdGt = clusterLocalIdGt;
    }

    public ReplicationRestorePointWhereInput clusterLocalIdGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID_GT);
        return this;
    }

    public ReplicationRestorePointWhereInput clusterLocalIdGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_LOCAL_ID_GT);
        return this;
    }

    public void setClusterLocalIdGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_LOCAL_ID_GT);
        }
    }

    public boolean getClusterLocalIdGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLUSTER_LOCAL_ID_GT);
    }

    public ReplicationRestorePointWhereInput clusterLocalIdGte(String clusterLocalIdGte) {

        this.clusterLocalIdGte = clusterLocalIdGte;
        return this;
    }

    /**
     * Get clusterLocalIdGte
     *
     * @return clusterLocalIdGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getClusterLocalIdGte() {
        return clusterLocalIdGte;
    }

    public void setClusterLocalIdGte(String clusterLocalIdGte) {
        this.clusterLocalIdGte = clusterLocalIdGte;
    }

    public ReplicationRestorePointWhereInput clusterLocalIdGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID_GTE);
        return this;
    }

    public ReplicationRestorePointWhereInput clusterLocalIdGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_LOCAL_ID_GTE);
        return this;
    }

    public void setClusterLocalIdGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_LOCAL_ID_GTE);
        }
    }

    public boolean getClusterLocalIdGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLUSTER_LOCAL_ID_GTE);
    }

    public ReplicationRestorePointWhereInput clusterLocalIdIn(List<String> clusterLocalIdIn) {

        this.clusterLocalIdIn = clusterLocalIdIn;
        return this;
    }

    public ReplicationRestorePointWhereInput addClusterLocalIdInItem(String clusterLocalIdInItem) {
        if (this.clusterLocalIdIn == null) {
            this.clusterLocalIdIn = new ArrayList<String>();
        }
        this.clusterLocalIdIn.add(clusterLocalIdInItem);
        return this;
    }

    /**
     * Get clusterLocalIdIn
     *
     * @return clusterLocalIdIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getClusterLocalIdIn() {
        return clusterLocalIdIn;
    }

    public void setClusterLocalIdIn(List<String> clusterLocalIdIn) {
        this.clusterLocalIdIn = clusterLocalIdIn;
    }

    public ReplicationRestorePointWhereInput clusterLocalIdIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID_IN);
        return this;
    }

    public ReplicationRestorePointWhereInput clusterLocalIdIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_LOCAL_ID_IN);
        return this;
    }

    public void setClusterLocalIdIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_LOCAL_ID_IN);
        }
    }

    public boolean getClusterLocalIdIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLUSTER_LOCAL_ID_IN);
    }

    public ReplicationRestorePointWhereInput clusterLocalIdLt(String clusterLocalIdLt) {

        this.clusterLocalIdLt = clusterLocalIdLt;
        return this;
    }

    /**
     * Get clusterLocalIdLt
     *
     * @return clusterLocalIdLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getClusterLocalIdLt() {
        return clusterLocalIdLt;
    }

    public void setClusterLocalIdLt(String clusterLocalIdLt) {
        this.clusterLocalIdLt = clusterLocalIdLt;
    }

    public ReplicationRestorePointWhereInput clusterLocalIdLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID_LT);
        return this;
    }

    public ReplicationRestorePointWhereInput clusterLocalIdLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_LOCAL_ID_LT);
        return this;
    }

    public void setClusterLocalIdLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_LOCAL_ID_LT);
        }
    }

    public boolean getClusterLocalIdLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLUSTER_LOCAL_ID_LT);
    }

    public ReplicationRestorePointWhereInput clusterLocalIdLte(String clusterLocalIdLte) {

        this.clusterLocalIdLte = clusterLocalIdLte;
        return this;
    }

    /**
     * Get clusterLocalIdLte
     *
     * @return clusterLocalIdLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getClusterLocalIdLte() {
        return clusterLocalIdLte;
    }

    public void setClusterLocalIdLte(String clusterLocalIdLte) {
        this.clusterLocalIdLte = clusterLocalIdLte;
    }

    public ReplicationRestorePointWhereInput clusterLocalIdLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID_LTE);
        return this;
    }

    public ReplicationRestorePointWhereInput clusterLocalIdLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_LOCAL_ID_LTE);
        return this;
    }

    public void setClusterLocalIdLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_LOCAL_ID_LTE);
        }
    }

    public boolean getClusterLocalIdLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLUSTER_LOCAL_ID_LTE);
    }

    public ReplicationRestorePointWhereInput clusterLocalIdNot(String clusterLocalIdNot) {

        this.clusterLocalIdNot = clusterLocalIdNot;
        return this;
    }

    /**
     * Get clusterLocalIdNot
     *
     * @return clusterLocalIdNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getClusterLocalIdNot() {
        return clusterLocalIdNot;
    }

    public void setClusterLocalIdNot(String clusterLocalIdNot) {
        this.clusterLocalIdNot = clusterLocalIdNot;
    }

    public ReplicationRestorePointWhereInput clusterLocalIdNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT);
        return this;
    }

    public ReplicationRestorePointWhereInput clusterLocalIdNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT);
        return this;
    }

    public void setClusterLocalIdNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT);
        }
    }

    public boolean getClusterLocalIdNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT);
    }

    public ReplicationRestorePointWhereInput clusterLocalIdNotContains(
            String clusterLocalIdNotContains) {

        this.clusterLocalIdNotContains = clusterLocalIdNotContains;
        return this;
    }

    /**
     * Get clusterLocalIdNotContains
     *
     * @return clusterLocalIdNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getClusterLocalIdNotContains() {
        return clusterLocalIdNotContains;
    }

    public void setClusterLocalIdNotContains(String clusterLocalIdNotContains) {
        this.clusterLocalIdNotContains = clusterLocalIdNotContains;
    }

    public ReplicationRestorePointWhereInput clusterLocalIdNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT_CONTAINS);
        return this;
    }

    public ReplicationRestorePointWhereInput clusterLocalIdNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT_CONTAINS);
        return this;
    }

    public void setClusterLocalIdNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT_CONTAINS);
        }
    }

    public boolean getClusterLocalIdNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT_CONTAINS);
    }

    public ReplicationRestorePointWhereInput clusterLocalIdNotEndsWith(
            String clusterLocalIdNotEndsWith) {

        this.clusterLocalIdNotEndsWith = clusterLocalIdNotEndsWith;
        return this;
    }

    /**
     * Get clusterLocalIdNotEndsWith
     *
     * @return clusterLocalIdNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getClusterLocalIdNotEndsWith() {
        return clusterLocalIdNotEndsWith;
    }

    public void setClusterLocalIdNotEndsWith(String clusterLocalIdNotEndsWith) {
        this.clusterLocalIdNotEndsWith = clusterLocalIdNotEndsWith;
    }

    public ReplicationRestorePointWhereInput clusterLocalIdNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT_ENDS_WITH);
        return this;
    }

    public ReplicationRestorePointWhereInput clusterLocalIdNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT_ENDS_WITH);
        return this;
    }

    public void setClusterLocalIdNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT_ENDS_WITH);
        }
    }

    public boolean getClusterLocalIdNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT_ENDS_WITH);
    }

    public ReplicationRestorePointWhereInput clusterLocalIdNotIn(List<String> clusterLocalIdNotIn) {

        this.clusterLocalIdNotIn = clusterLocalIdNotIn;
        return this;
    }

    public ReplicationRestorePointWhereInput addClusterLocalIdNotInItem(
            String clusterLocalIdNotInItem) {
        if (this.clusterLocalIdNotIn == null) {
            this.clusterLocalIdNotIn = new ArrayList<String>();
        }
        this.clusterLocalIdNotIn.add(clusterLocalIdNotInItem);
        return this;
    }

    /**
     * Get clusterLocalIdNotIn
     *
     * @return clusterLocalIdNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getClusterLocalIdNotIn() {
        return clusterLocalIdNotIn;
    }

    public void setClusterLocalIdNotIn(List<String> clusterLocalIdNotIn) {
        this.clusterLocalIdNotIn = clusterLocalIdNotIn;
    }

    public ReplicationRestorePointWhereInput clusterLocalIdNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT_IN);
        return this;
    }

    public ReplicationRestorePointWhereInput clusterLocalIdNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT_IN);
        return this;
    }

    public void setClusterLocalIdNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT_IN);
        }
    }

    public boolean getClusterLocalIdNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT_IN);
    }

    public ReplicationRestorePointWhereInput clusterLocalIdNotStartsWith(
            String clusterLocalIdNotStartsWith) {

        this.clusterLocalIdNotStartsWith = clusterLocalIdNotStartsWith;
        return this;
    }

    /**
     * Get clusterLocalIdNotStartsWith
     *
     * @return clusterLocalIdNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getClusterLocalIdNotStartsWith() {
        return clusterLocalIdNotStartsWith;
    }

    public void setClusterLocalIdNotStartsWith(String clusterLocalIdNotStartsWith) {
        this.clusterLocalIdNotStartsWith = clusterLocalIdNotStartsWith;
    }

    public ReplicationRestorePointWhereInput clusterLocalIdNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT_STARTS_WITH);
        return this;
    }

    public ReplicationRestorePointWhereInput clusterLocalIdNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT_STARTS_WITH);
        return this;
    }

    public void setClusterLocalIdNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT_STARTS_WITH);
        }
    }

    public boolean getClusterLocalIdNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT_STARTS_WITH);
    }

    public ReplicationRestorePointWhereInput clusterLocalIdStartsWith(
            String clusterLocalIdStartsWith) {

        this.clusterLocalIdStartsWith = clusterLocalIdStartsWith;
        return this;
    }

    /**
     * Get clusterLocalIdStartsWith
     *
     * @return clusterLocalIdStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getClusterLocalIdStartsWith() {
        return clusterLocalIdStartsWith;
    }

    public void setClusterLocalIdStartsWith(String clusterLocalIdStartsWith) {
        this.clusterLocalIdStartsWith = clusterLocalIdStartsWith;
    }

    public ReplicationRestorePointWhereInput clusterLocalIdStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID_STARTS_WITH);
        return this;
    }

    public ReplicationRestorePointWhereInput clusterLocalIdStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_LOCAL_ID_STARTS_WITH);
        return this;
    }

    public void setClusterLocalIdStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLUSTER_LOCAL_ID_STARTS_WITH);
        }
    }

    public boolean getClusterLocalIdStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLUSTER_LOCAL_ID_STARTS_WITH);
    }

    public ReplicationRestorePointWhereInput creation(BackupRestorePointCreation creation) {

        this.creation = creation;
        return this;
    }

    /**
     * Get creation
     *
     * @return creation
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public BackupRestorePointCreation getCreation() {
        return creation;
    }

    public void setCreation(BackupRestorePointCreation creation) {
        this.creation = creation;
    }

    public ReplicationRestorePointWhereInput creation_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATION);
        return this;
    }

    public ReplicationRestorePointWhereInput creation_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CREATION);
        return this;
    }

    public void setCreation_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CREATION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CREATION);
        }
    }

    public boolean getCreation_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CREATION);
    }

    public ReplicationRestorePointWhereInput creationIn(
            List<BackupRestorePointCreation> creationIn) {

        this.creationIn = creationIn;
        return this;
    }

    public ReplicationRestorePointWhereInput addCreationInItem(
            BackupRestorePointCreation creationInItem) {
        if (this.creationIn == null) {
            this.creationIn = new ArrayList<BackupRestorePointCreation>();
        }
        this.creationIn.add(creationInItem);
        return this;
    }

    /**
     * Get creationIn
     *
     * @return creationIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<BackupRestorePointCreation> getCreationIn() {
        return creationIn;
    }

    public void setCreationIn(List<BackupRestorePointCreation> creationIn) {
        this.creationIn = creationIn;
    }

    public ReplicationRestorePointWhereInput creationIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATION_IN);
        return this;
    }

    public ReplicationRestorePointWhereInput creationIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CREATION_IN);
        return this;
    }

    public void setCreationIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CREATION_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CREATION_IN);
        }
    }

    public boolean getCreationIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CREATION_IN);
    }

    public ReplicationRestorePointWhereInput creationNot(BackupRestorePointCreation creationNot) {

        this.creationNot = creationNot;
        return this;
    }

    /**
     * Get creationNot
     *
     * @return creationNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public BackupRestorePointCreation getCreationNot() {
        return creationNot;
    }

    public void setCreationNot(BackupRestorePointCreation creationNot) {
        this.creationNot = creationNot;
    }

    public ReplicationRestorePointWhereInput creationNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATION_NOT);
        return this;
    }

    public ReplicationRestorePointWhereInput creationNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CREATION_NOT);
        return this;
    }

    public void setCreationNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CREATION_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CREATION_NOT);
        }
    }

    public boolean getCreationNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CREATION_NOT);
    }

    public ReplicationRestorePointWhereInput creationNotIn(
            List<BackupRestorePointCreation> creationNotIn) {

        this.creationNotIn = creationNotIn;
        return this;
    }

    public ReplicationRestorePointWhereInput addCreationNotInItem(
            BackupRestorePointCreation creationNotInItem) {
        if (this.creationNotIn == null) {
            this.creationNotIn = new ArrayList<BackupRestorePointCreation>();
        }
        this.creationNotIn.add(creationNotInItem);
        return this;
    }

    /**
     * Get creationNotIn
     *
     * @return creationNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<BackupRestorePointCreation> getCreationNotIn() {
        return creationNotIn;
    }

    public void setCreationNotIn(List<BackupRestorePointCreation> creationNotIn) {
        this.creationNotIn = creationNotIn;
    }

    public ReplicationRestorePointWhereInput creationNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATION_NOT_IN);
        return this;
    }

    public ReplicationRestorePointWhereInput creationNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CREATION_NOT_IN);
        return this;
    }

    public void setCreationNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CREATION_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CREATION_NOT_IN);
        }
    }

    public boolean getCreationNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CREATION_NOT_IN);
    }

    public ReplicationRestorePointWhereInput dedup(BackupDedupMode dedup) {

        this.dedup = dedup;
        return this;
    }

    /**
     * Get dedup
     *
     * @return dedup
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public BackupDedupMode getDedup() {
        return dedup;
    }

    public void setDedup(BackupDedupMode dedup) {
        this.dedup = dedup;
    }

    public ReplicationRestorePointWhereInput dedup_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEDUP);
        return this;
    }

    public ReplicationRestorePointWhereInput dedup_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEDUP);
        return this;
    }

    public void setDedup_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEDUP);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEDUP);
        }
    }

    public boolean getDedup_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEDUP);
    }

    public ReplicationRestorePointWhereInput dedupIn(List<BackupDedupMode> dedupIn) {

        this.dedupIn = dedupIn;
        return this;
    }

    public ReplicationRestorePointWhereInput addDedupInItem(BackupDedupMode dedupInItem) {
        if (this.dedupIn == null) {
            this.dedupIn = new ArrayList<BackupDedupMode>();
        }
        this.dedupIn.add(dedupInItem);
        return this;
    }

    /**
     * Get dedupIn
     *
     * @return dedupIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<BackupDedupMode> getDedupIn() {
        return dedupIn;
    }

    public void setDedupIn(List<BackupDedupMode> dedupIn) {
        this.dedupIn = dedupIn;
    }

    public ReplicationRestorePointWhereInput dedupIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEDUP_IN);
        return this;
    }

    public ReplicationRestorePointWhereInput dedupIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEDUP_IN);
        return this;
    }

    public void setDedupIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEDUP_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEDUP_IN);
        }
    }

    public boolean getDedupIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEDUP_IN);
    }

    public ReplicationRestorePointWhereInput dedupNot(BackupDedupMode dedupNot) {

        this.dedupNot = dedupNot;
        return this;
    }

    /**
     * Get dedupNot
     *
     * @return dedupNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public BackupDedupMode getDedupNot() {
        return dedupNot;
    }

    public void setDedupNot(BackupDedupMode dedupNot) {
        this.dedupNot = dedupNot;
    }

    public ReplicationRestorePointWhereInput dedupNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEDUP_NOT);
        return this;
    }

    public ReplicationRestorePointWhereInput dedupNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEDUP_NOT);
        return this;
    }

    public void setDedupNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEDUP_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEDUP_NOT);
        }
    }

    public boolean getDedupNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEDUP_NOT);
    }

    public ReplicationRestorePointWhereInput dedupNotIn(List<BackupDedupMode> dedupNotIn) {

        this.dedupNotIn = dedupNotIn;
        return this;
    }

    public ReplicationRestorePointWhereInput addDedupNotInItem(BackupDedupMode dedupNotInItem) {
        if (this.dedupNotIn == null) {
            this.dedupNotIn = new ArrayList<BackupDedupMode>();
        }
        this.dedupNotIn.add(dedupNotInItem);
        return this;
    }

    /**
     * Get dedupNotIn
     *
     * @return dedupNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<BackupDedupMode> getDedupNotIn() {
        return dedupNotIn;
    }

    public void setDedupNotIn(List<BackupDedupMode> dedupNotIn) {
        this.dedupNotIn = dedupNotIn;
    }

    public ReplicationRestorePointWhereInput dedupNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEDUP_NOT_IN);
        return this;
    }

    public ReplicationRestorePointWhereInput dedupNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEDUP_NOT_IN);
        return this;
    }

    public void setDedupNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEDUP_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEDUP_NOT_IN);
        }
    }

    public boolean getDedupNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEDUP_NOT_IN);
    }

    public ReplicationRestorePointWhereInput entityAsyncStatus(
            EntityAsyncStatus entityAsyncStatus) {

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

    public ReplicationRestorePointWhereInput entityAsyncStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        return this;
    }

    public ReplicationRestorePointWhereInput entityAsyncStatus_ExplictlyNonNull() {
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

    public ReplicationRestorePointWhereInput entityAsyncStatusIn(
            List<EntityAsyncStatus> entityAsyncStatusIn) {

        this.entityAsyncStatusIn = entityAsyncStatusIn;
        return this;
    }

    public ReplicationRestorePointWhereInput addEntityAsyncStatusInItem(
            EntityAsyncStatus entityAsyncStatusInItem) {
        if (this.entityAsyncStatusIn == null) {
            this.entityAsyncStatusIn = new ArrayList<EntityAsyncStatus>();
        }
        this.entityAsyncStatusIn.add(entityAsyncStatusInItem);
        return this;
    }

    /**
     * Get entityAsyncStatusIn
     *
     * @return entityAsyncStatusIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<EntityAsyncStatus> getEntityAsyncStatusIn() {
        return entityAsyncStatusIn;
    }

    public void setEntityAsyncStatusIn(List<EntityAsyncStatus> entityAsyncStatusIn) {
        this.entityAsyncStatusIn = entityAsyncStatusIn;
    }

    public ReplicationRestorePointWhereInput entityAsyncStatusIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_IN);
        return this;
    }

    public ReplicationRestorePointWhereInput entityAsyncStatusIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_IN);
        return this;
    }

    public void setEntityAsyncStatusIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_IN);
        }
    }

    public boolean getEntityAsyncStatusIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_IN);
    }

    public ReplicationRestorePointWhereInput entityAsyncStatusNot(
            EntityAsyncStatus entityAsyncStatusNot) {

        this.entityAsyncStatusNot = entityAsyncStatusNot;
        return this;
    }

    /**
     * Get entityAsyncStatusNot
     *
     * @return entityAsyncStatusNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public EntityAsyncStatus getEntityAsyncStatusNot() {
        return entityAsyncStatusNot;
    }

    public void setEntityAsyncStatusNot(EntityAsyncStatus entityAsyncStatusNot) {
        this.entityAsyncStatusNot = entityAsyncStatusNot;
    }

    public ReplicationRestorePointWhereInput entityAsyncStatusNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT);
        return this;
    }

    public ReplicationRestorePointWhereInput entityAsyncStatusNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT);
        return this;
    }

    public void setEntityAsyncStatusNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT);
        }
    }

    public boolean getEntityAsyncStatusNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT);
    }

    public ReplicationRestorePointWhereInput entityAsyncStatusNotIn(
            List<EntityAsyncStatus> entityAsyncStatusNotIn) {

        this.entityAsyncStatusNotIn = entityAsyncStatusNotIn;
        return this;
    }

    public ReplicationRestorePointWhereInput addEntityAsyncStatusNotInItem(
            EntityAsyncStatus entityAsyncStatusNotInItem) {
        if (this.entityAsyncStatusNotIn == null) {
            this.entityAsyncStatusNotIn = new ArrayList<EntityAsyncStatus>();
        }
        this.entityAsyncStatusNotIn.add(entityAsyncStatusNotInItem);
        return this;
    }

    /**
     * Get entityAsyncStatusNotIn
     *
     * @return entityAsyncStatusNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<EntityAsyncStatus> getEntityAsyncStatusNotIn() {
        return entityAsyncStatusNotIn;
    }

    public void setEntityAsyncStatusNotIn(List<EntityAsyncStatus> entityAsyncStatusNotIn) {
        this.entityAsyncStatusNotIn = entityAsyncStatusNotIn;
    }

    public ReplicationRestorePointWhereInput entityAsyncStatusNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT_IN);
        return this;
    }

    public ReplicationRestorePointWhereInput entityAsyncStatusNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT_IN);
        return this;
    }

    public void setEntityAsyncStatusNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT_IN);
        }
    }

    public boolean getEntityAsyncStatusNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT_IN);
    }

    public ReplicationRestorePointWhereInput failoverExecutionsEvery(
            FailoverExecutionWhereInput failoverExecutionsEvery) {

        this.failoverExecutionsEvery = failoverExecutionsEvery;
        return this;
    }

    /**
     * Get failoverExecutionsEvery
     *
     * @return failoverExecutionsEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public FailoverExecutionWhereInput getFailoverExecutionsEvery() {
        return failoverExecutionsEvery;
    }

    public void setFailoverExecutionsEvery(FailoverExecutionWhereInput failoverExecutionsEvery) {
        this.failoverExecutionsEvery = failoverExecutionsEvery;
    }

    public ReplicationRestorePointWhereInput failoverExecutionsEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FAILOVER_EXECUTIONS_EVERY);
        return this;
    }

    public ReplicationRestorePointWhereInput failoverExecutionsEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FAILOVER_EXECUTIONS_EVERY);
        return this;
    }

    public void setFailoverExecutionsEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FAILOVER_EXECUTIONS_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FAILOVER_EXECUTIONS_EVERY);
        }
    }

    public boolean getFailoverExecutionsEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FAILOVER_EXECUTIONS_EVERY);
    }

    public ReplicationRestorePointWhereInput failoverExecutionsNone(
            FailoverExecutionWhereInput failoverExecutionsNone) {

        this.failoverExecutionsNone = failoverExecutionsNone;
        return this;
    }

    /**
     * Get failoverExecutionsNone
     *
     * @return failoverExecutionsNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public FailoverExecutionWhereInput getFailoverExecutionsNone() {
        return failoverExecutionsNone;
    }

    public void setFailoverExecutionsNone(FailoverExecutionWhereInput failoverExecutionsNone) {
        this.failoverExecutionsNone = failoverExecutionsNone;
    }

    public ReplicationRestorePointWhereInput failoverExecutionsNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FAILOVER_EXECUTIONS_NONE);
        return this;
    }

    public ReplicationRestorePointWhereInput failoverExecutionsNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FAILOVER_EXECUTIONS_NONE);
        return this;
    }

    public void setFailoverExecutionsNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FAILOVER_EXECUTIONS_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FAILOVER_EXECUTIONS_NONE);
        }
    }

    public boolean getFailoverExecutionsNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FAILOVER_EXECUTIONS_NONE);
    }

    public ReplicationRestorePointWhereInput failoverExecutionsSome(
            FailoverExecutionWhereInput failoverExecutionsSome) {

        this.failoverExecutionsSome = failoverExecutionsSome;
        return this;
    }

    /**
     * Get failoverExecutionsSome
     *
     * @return failoverExecutionsSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public FailoverExecutionWhereInput getFailoverExecutionsSome() {
        return failoverExecutionsSome;
    }

    public void setFailoverExecutionsSome(FailoverExecutionWhereInput failoverExecutionsSome) {
        this.failoverExecutionsSome = failoverExecutionsSome;
    }

    public ReplicationRestorePointWhereInput failoverExecutionsSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FAILOVER_EXECUTIONS_SOME);
        return this;
    }

    public ReplicationRestorePointWhereInput failoverExecutionsSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FAILOVER_EXECUTIONS_SOME);
        return this;
    }

    public void setFailoverExecutionsSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FAILOVER_EXECUTIONS_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FAILOVER_EXECUTIONS_SOME);
        }
    }

    public boolean getFailoverExecutionsSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FAILOVER_EXECUTIONS_SOME);
    }

    public ReplicationRestorePointWhereInput id(String id) {

        this.id = id;
        return this;
    }

    /**
     * Get id
     *
     * @return id
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ReplicationRestorePointWhereInput id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public ReplicationRestorePointWhereInput id_ExplictlyNonNull() {
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

    public ReplicationRestorePointWhereInput idContains(String idContains) {

        this.idContains = idContains;
        return this;
    }

    /**
     * Get idContains
     *
     * @return idContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIdContains() {
        return idContains;
    }

    public void setIdContains(String idContains) {
        this.idContains = idContains;
    }

    public ReplicationRestorePointWhereInput idContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_CONTAINS);
        return this;
    }

    public ReplicationRestorePointWhereInput idContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_CONTAINS);
        return this;
    }

    public void setIdContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_CONTAINS);
        }
    }

    public boolean getIdContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_CONTAINS);
    }

    public ReplicationRestorePointWhereInput idEndsWith(String idEndsWith) {

        this.idEndsWith = idEndsWith;
        return this;
    }

    /**
     * Get idEndsWith
     *
     * @return idEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIdEndsWith() {
        return idEndsWith;
    }

    public void setIdEndsWith(String idEndsWith) {
        this.idEndsWith = idEndsWith;
    }

    public ReplicationRestorePointWhereInput idEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_ENDS_WITH);
        return this;
    }

    public ReplicationRestorePointWhereInput idEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_ENDS_WITH);
        return this;
    }

    public void setIdEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_ENDS_WITH);
        }
    }

    public boolean getIdEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_ENDS_WITH);
    }

    public ReplicationRestorePointWhereInput idGt(String idGt) {

        this.idGt = idGt;
        return this;
    }

    /**
     * Get idGt
     *
     * @return idGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIdGt() {
        return idGt;
    }

    public void setIdGt(String idGt) {
        this.idGt = idGt;
    }

    public ReplicationRestorePointWhereInput idGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GT);
        return this;
    }

    public ReplicationRestorePointWhereInput idGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_GT);
        return this;
    }

    public void setIdGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_GT);
        }
    }

    public boolean getIdGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_GT);
    }

    public ReplicationRestorePointWhereInput idGte(String idGte) {

        this.idGte = idGte;
        return this;
    }

    /**
     * Get idGte
     *
     * @return idGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIdGte() {
        return idGte;
    }

    public void setIdGte(String idGte) {
        this.idGte = idGte;
    }

    public ReplicationRestorePointWhereInput idGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GTE);
        return this;
    }

    public ReplicationRestorePointWhereInput idGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_GTE);
        return this;
    }

    public void setIdGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_GTE);
        }
    }

    public boolean getIdGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_GTE);
    }

    public ReplicationRestorePointWhereInput idIn(List<String> idIn) {

        this.idIn = idIn;
        return this;
    }

    public ReplicationRestorePointWhereInput addIdInItem(String idInItem) {
        if (this.idIn == null) {
            this.idIn = new ArrayList<String>();
        }
        this.idIn.add(idInItem);
        return this;
    }

    /**
     * Get idIn
     *
     * @return idIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getIdIn() {
        return idIn;
    }

    public void setIdIn(List<String> idIn) {
        this.idIn = idIn;
    }

    public ReplicationRestorePointWhereInput idIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_IN);
        return this;
    }

    public ReplicationRestorePointWhereInput idIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_IN);
        return this;
    }

    public void setIdIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_IN);
        }
    }

    public boolean getIdIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_IN);
    }

    public ReplicationRestorePointWhereInput idLt(String idLt) {

        this.idLt = idLt;
        return this;
    }

    /**
     * Get idLt
     *
     * @return idLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIdLt() {
        return idLt;
    }

    public void setIdLt(String idLt) {
        this.idLt = idLt;
    }

    public ReplicationRestorePointWhereInput idLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LT);
        return this;
    }

    public ReplicationRestorePointWhereInput idLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_LT);
        return this;
    }

    public void setIdLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_LT);
        }
    }

    public boolean getIdLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_LT);
    }

    public ReplicationRestorePointWhereInput idLte(String idLte) {

        this.idLte = idLte;
        return this;
    }

    /**
     * Get idLte
     *
     * @return idLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIdLte() {
        return idLte;
    }

    public void setIdLte(String idLte) {
        this.idLte = idLte;
    }

    public ReplicationRestorePointWhereInput idLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LTE);
        return this;
    }

    public ReplicationRestorePointWhereInput idLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_LTE);
        return this;
    }

    public void setIdLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_LTE);
        }
    }

    public boolean getIdLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_LTE);
    }

    public ReplicationRestorePointWhereInput idNot(String idNot) {

        this.idNot = idNot;
        return this;
    }

    /**
     * Get idNot
     *
     * @return idNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIdNot() {
        return idNot;
    }

    public void setIdNot(String idNot) {
        this.idNot = idNot;
    }

    public ReplicationRestorePointWhereInput idNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT);
        return this;
    }

    public ReplicationRestorePointWhereInput idNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_NOT);
        return this;
    }

    public void setIdNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_NOT);
        }
    }

    public boolean getIdNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_NOT);
    }

    public ReplicationRestorePointWhereInput idNotContains(String idNotContains) {

        this.idNotContains = idNotContains;
        return this;
    }

    /**
     * Get idNotContains
     *
     * @return idNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIdNotContains() {
        return idNotContains;
    }

    public void setIdNotContains(String idNotContains) {
        this.idNotContains = idNotContains;
    }

    public ReplicationRestorePointWhereInput idNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_CONTAINS);
        return this;
    }

    public ReplicationRestorePointWhereInput idNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_NOT_CONTAINS);
        return this;
    }

    public void setIdNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_NOT_CONTAINS);
        }
    }

    public boolean getIdNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_NOT_CONTAINS);
    }

    public ReplicationRestorePointWhereInput idNotEndsWith(String idNotEndsWith) {

        this.idNotEndsWith = idNotEndsWith;
        return this;
    }

    /**
     * Get idNotEndsWith
     *
     * @return idNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIdNotEndsWith() {
        return idNotEndsWith;
    }

    public void setIdNotEndsWith(String idNotEndsWith) {
        this.idNotEndsWith = idNotEndsWith;
    }

    public ReplicationRestorePointWhereInput idNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
        return this;
    }

    public ReplicationRestorePointWhereInput idNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
        return this;
    }

    public void setIdNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
        }
    }

    public boolean getIdNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
    }

    public ReplicationRestorePointWhereInput idNotIn(List<String> idNotIn) {

        this.idNotIn = idNotIn;
        return this;
    }

    public ReplicationRestorePointWhereInput addIdNotInItem(String idNotInItem) {
        if (this.idNotIn == null) {
            this.idNotIn = new ArrayList<String>();
        }
        this.idNotIn.add(idNotInItem);
        return this;
    }

    /**
     * Get idNotIn
     *
     * @return idNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getIdNotIn() {
        return idNotIn;
    }

    public void setIdNotIn(List<String> idNotIn) {
        this.idNotIn = idNotIn;
    }

    public ReplicationRestorePointWhereInput idNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_IN);
        return this;
    }

    public ReplicationRestorePointWhereInput idNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_NOT_IN);
        return this;
    }

    public void setIdNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_NOT_IN);
        }
    }

    public boolean getIdNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_NOT_IN);
    }

    public ReplicationRestorePointWhereInput idNotStartsWith(String idNotStartsWith) {

        this.idNotStartsWith = idNotStartsWith;
        return this;
    }

    /**
     * Get idNotStartsWith
     *
     * @return idNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIdNotStartsWith() {
        return idNotStartsWith;
    }

    public void setIdNotStartsWith(String idNotStartsWith) {
        this.idNotStartsWith = idNotStartsWith;
    }

    public ReplicationRestorePointWhereInput idNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
        return this;
    }

    public ReplicationRestorePointWhereInput idNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
        return this;
    }

    public void setIdNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
        }
    }

    public boolean getIdNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
    }

    public ReplicationRestorePointWhereInput idStartsWith(String idStartsWith) {

        this.idStartsWith = idStartsWith;
        return this;
    }

    /**
     * Get idStartsWith
     *
     * @return idStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getIdStartsWith() {
        return idStartsWith;
    }

    public void setIdStartsWith(String idStartsWith) {
        this.idStartsWith = idStartsWith;
    }

    public ReplicationRestorePointWhereInput idStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_STARTS_WITH);
        return this;
    }

    public ReplicationRestorePointWhereInput idStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ID_STARTS_WITH);
        return this;
    }

    public void setIdStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ID_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ID_STARTS_WITH);
        }
    }

    public boolean getIdStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ID_STARTS_WITH);
    }

    public ReplicationRestorePointWhereInput iscsiLun(IscsiLunWhereInput iscsiLun) {

        this.iscsiLun = iscsiLun;
        return this;
    }

    /**
     * Get iscsiLun
     *
     * @return iscsiLun
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public IscsiLunWhereInput getIscsiLun() {
        return iscsiLun;
    }

    public void setIscsiLun(IscsiLunWhereInput iscsiLun) {
        this.iscsiLun = iscsiLun;
    }

    public ReplicationRestorePointWhereInput iscsiLun_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ISCSI_LUN);
        return this;
    }

    public ReplicationRestorePointWhereInput iscsiLun_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ISCSI_LUN);
        return this;
    }

    public void setIscsiLun_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ISCSI_LUN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ISCSI_LUN);
        }
    }

    public boolean getIscsiLun_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ISCSI_LUN);
    }

    public ReplicationRestorePointWhereInput localCreatedAt(String localCreatedAt) {

        this.localCreatedAt = localCreatedAt;
        return this;
    }

    /**
     * Get localCreatedAt
     *
     * @return localCreatedAt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalCreatedAt() {
        return localCreatedAt;
    }

    public void setLocalCreatedAt(String localCreatedAt) {
        this.localCreatedAt = localCreatedAt;
    }

    public ReplicationRestorePointWhereInput localCreatedAt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATED_AT);
        return this;
    }

    public ReplicationRestorePointWhereInput localCreatedAt_ExplictlyNonNull() {
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

    public ReplicationRestorePointWhereInput localCreatedAtGt(String localCreatedAtGt) {

        this.localCreatedAtGt = localCreatedAtGt;
        return this;
    }

    /**
     * Get localCreatedAtGt
     *
     * @return localCreatedAtGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalCreatedAtGt() {
        return localCreatedAtGt;
    }

    public void setLocalCreatedAtGt(String localCreatedAtGt) {
        this.localCreatedAtGt = localCreatedAtGt;
    }

    public ReplicationRestorePointWhereInput localCreatedAtGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATED_AT_GT);
        return this;
    }

    public ReplicationRestorePointWhereInput localCreatedAtGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_CREATED_AT_GT);
        return this;
    }

    public void setLocalCreatedAtGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATED_AT_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_CREATED_AT_GT);
        }
    }

    public boolean getLocalCreatedAtGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_CREATED_AT_GT);
    }

    public ReplicationRestorePointWhereInput localCreatedAtGte(String localCreatedAtGte) {

        this.localCreatedAtGte = localCreatedAtGte;
        return this;
    }

    /**
     * Get localCreatedAtGte
     *
     * @return localCreatedAtGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalCreatedAtGte() {
        return localCreatedAtGte;
    }

    public void setLocalCreatedAtGte(String localCreatedAtGte) {
        this.localCreatedAtGte = localCreatedAtGte;
    }

    public ReplicationRestorePointWhereInput localCreatedAtGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATED_AT_GTE);
        return this;
    }

    public ReplicationRestorePointWhereInput localCreatedAtGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_CREATED_AT_GTE);
        return this;
    }

    public void setLocalCreatedAtGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATED_AT_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_CREATED_AT_GTE);
        }
    }

    public boolean getLocalCreatedAtGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_CREATED_AT_GTE);
    }

    public ReplicationRestorePointWhereInput localCreatedAtIn(List<String> localCreatedAtIn) {

        this.localCreatedAtIn = localCreatedAtIn;
        return this;
    }

    public ReplicationRestorePointWhereInput addLocalCreatedAtInItem(String localCreatedAtInItem) {
        if (this.localCreatedAtIn == null) {
            this.localCreatedAtIn = new ArrayList<String>();
        }
        this.localCreatedAtIn.add(localCreatedAtInItem);
        return this;
    }

    /**
     * Get localCreatedAtIn
     *
     * @return localCreatedAtIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getLocalCreatedAtIn() {
        return localCreatedAtIn;
    }

    public void setLocalCreatedAtIn(List<String> localCreatedAtIn) {
        this.localCreatedAtIn = localCreatedAtIn;
    }

    public ReplicationRestorePointWhereInput localCreatedAtIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATED_AT_IN);
        return this;
    }

    public ReplicationRestorePointWhereInput localCreatedAtIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_CREATED_AT_IN);
        return this;
    }

    public void setLocalCreatedAtIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATED_AT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_CREATED_AT_IN);
        }
    }

    public boolean getLocalCreatedAtIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_CREATED_AT_IN);
    }

    public ReplicationRestorePointWhereInput localCreatedAtLt(String localCreatedAtLt) {

        this.localCreatedAtLt = localCreatedAtLt;
        return this;
    }

    /**
     * Get localCreatedAtLt
     *
     * @return localCreatedAtLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalCreatedAtLt() {
        return localCreatedAtLt;
    }

    public void setLocalCreatedAtLt(String localCreatedAtLt) {
        this.localCreatedAtLt = localCreatedAtLt;
    }

    public ReplicationRestorePointWhereInput localCreatedAtLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATED_AT_LT);
        return this;
    }

    public ReplicationRestorePointWhereInput localCreatedAtLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_CREATED_AT_LT);
        return this;
    }

    public void setLocalCreatedAtLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATED_AT_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_CREATED_AT_LT);
        }
    }

    public boolean getLocalCreatedAtLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_CREATED_AT_LT);
    }

    public ReplicationRestorePointWhereInput localCreatedAtLte(String localCreatedAtLte) {

        this.localCreatedAtLte = localCreatedAtLte;
        return this;
    }

    /**
     * Get localCreatedAtLte
     *
     * @return localCreatedAtLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalCreatedAtLte() {
        return localCreatedAtLte;
    }

    public void setLocalCreatedAtLte(String localCreatedAtLte) {
        this.localCreatedAtLte = localCreatedAtLte;
    }

    public ReplicationRestorePointWhereInput localCreatedAtLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATED_AT_LTE);
        return this;
    }

    public ReplicationRestorePointWhereInput localCreatedAtLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_CREATED_AT_LTE);
        return this;
    }

    public void setLocalCreatedAtLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATED_AT_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_CREATED_AT_LTE);
        }
    }

    public boolean getLocalCreatedAtLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_CREATED_AT_LTE);
    }

    public ReplicationRestorePointWhereInput localCreatedAtNot(String localCreatedAtNot) {

        this.localCreatedAtNot = localCreatedAtNot;
        return this;
    }

    /**
     * Get localCreatedAtNot
     *
     * @return localCreatedAtNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalCreatedAtNot() {
        return localCreatedAtNot;
    }

    public void setLocalCreatedAtNot(String localCreatedAtNot) {
        this.localCreatedAtNot = localCreatedAtNot;
    }

    public ReplicationRestorePointWhereInput localCreatedAtNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATED_AT_NOT);
        return this;
    }

    public ReplicationRestorePointWhereInput localCreatedAtNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_CREATED_AT_NOT);
        return this;
    }

    public void setLocalCreatedAtNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATED_AT_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_CREATED_AT_NOT);
        }
    }

    public boolean getLocalCreatedAtNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_CREATED_AT_NOT);
    }

    public ReplicationRestorePointWhereInput localCreatedAtNotIn(List<String> localCreatedAtNotIn) {

        this.localCreatedAtNotIn = localCreatedAtNotIn;
        return this;
    }

    public ReplicationRestorePointWhereInput addLocalCreatedAtNotInItem(
            String localCreatedAtNotInItem) {
        if (this.localCreatedAtNotIn == null) {
            this.localCreatedAtNotIn = new ArrayList<String>();
        }
        this.localCreatedAtNotIn.add(localCreatedAtNotInItem);
        return this;
    }

    /**
     * Get localCreatedAtNotIn
     *
     * @return localCreatedAtNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getLocalCreatedAtNotIn() {
        return localCreatedAtNotIn;
    }

    public void setLocalCreatedAtNotIn(List<String> localCreatedAtNotIn) {
        this.localCreatedAtNotIn = localCreatedAtNotIn;
    }

    public ReplicationRestorePointWhereInput localCreatedAtNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATED_AT_NOT_IN);
        return this;
    }

    public ReplicationRestorePointWhereInput localCreatedAtNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_CREATED_AT_NOT_IN);
        return this;
    }

    public void setLocalCreatedAtNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATED_AT_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_CREATED_AT_NOT_IN);
        }
    }

    public boolean getLocalCreatedAtNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_CREATED_AT_NOT_IN);
    }

    public ReplicationRestorePointWhereInput localId(String localId) {

        this.localId = localId;
        return this;
    }

    /**
     * Get localId
     *
     * @return localId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalId() {
        return localId;
    }

    public void setLocalId(String localId) {
        this.localId = localId;
    }

    public ReplicationRestorePointWhereInput localId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID);
        return this;
    }

    public ReplicationRestorePointWhereInput localId_ExplictlyNonNull() {
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

    public ReplicationRestorePointWhereInput localIdContains(String localIdContains) {

        this.localIdContains = localIdContains;
        return this;
    }

    /**
     * Get localIdContains
     *
     * @return localIdContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalIdContains() {
        return localIdContains;
    }

    public void setLocalIdContains(String localIdContains) {
        this.localIdContains = localIdContains;
    }

    public ReplicationRestorePointWhereInput localIdContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_CONTAINS);
        return this;
    }

    public ReplicationRestorePointWhereInput localIdContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_CONTAINS);
        return this;
    }

    public void setLocalIdContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_CONTAINS);
        }
    }

    public boolean getLocalIdContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID_CONTAINS);
    }

    public ReplicationRestorePointWhereInput localIdEndsWith(String localIdEndsWith) {

        this.localIdEndsWith = localIdEndsWith;
        return this;
    }

    /**
     * Get localIdEndsWith
     *
     * @return localIdEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalIdEndsWith() {
        return localIdEndsWith;
    }

    public void setLocalIdEndsWith(String localIdEndsWith) {
        this.localIdEndsWith = localIdEndsWith;
    }

    public ReplicationRestorePointWhereInput localIdEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_ENDS_WITH);
        return this;
    }

    public ReplicationRestorePointWhereInput localIdEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_ENDS_WITH);
        return this;
    }

    public void setLocalIdEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_ENDS_WITH);
        }
    }

    public boolean getLocalIdEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID_ENDS_WITH);
    }

    public ReplicationRestorePointWhereInput localIdGt(String localIdGt) {

        this.localIdGt = localIdGt;
        return this;
    }

    /**
     * Get localIdGt
     *
     * @return localIdGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalIdGt() {
        return localIdGt;
    }

    public void setLocalIdGt(String localIdGt) {
        this.localIdGt = localIdGt;
    }

    public ReplicationRestorePointWhereInput localIdGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_GT);
        return this;
    }

    public ReplicationRestorePointWhereInput localIdGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_GT);
        return this;
    }

    public void setLocalIdGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_GT);
        }
    }

    public boolean getLocalIdGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID_GT);
    }

    public ReplicationRestorePointWhereInput localIdGte(String localIdGte) {

        this.localIdGte = localIdGte;
        return this;
    }

    /**
     * Get localIdGte
     *
     * @return localIdGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalIdGte() {
        return localIdGte;
    }

    public void setLocalIdGte(String localIdGte) {
        this.localIdGte = localIdGte;
    }

    public ReplicationRestorePointWhereInput localIdGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_GTE);
        return this;
    }

    public ReplicationRestorePointWhereInput localIdGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_GTE);
        return this;
    }

    public void setLocalIdGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_GTE);
        }
    }

    public boolean getLocalIdGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID_GTE);
    }

    public ReplicationRestorePointWhereInput localIdIn(List<String> localIdIn) {

        this.localIdIn = localIdIn;
        return this;
    }

    public ReplicationRestorePointWhereInput addLocalIdInItem(String localIdInItem) {
        if (this.localIdIn == null) {
            this.localIdIn = new ArrayList<String>();
        }
        this.localIdIn.add(localIdInItem);
        return this;
    }

    /**
     * Get localIdIn
     *
     * @return localIdIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getLocalIdIn() {
        return localIdIn;
    }

    public void setLocalIdIn(List<String> localIdIn) {
        this.localIdIn = localIdIn;
    }

    public ReplicationRestorePointWhereInput localIdIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_IN);
        return this;
    }

    public ReplicationRestorePointWhereInput localIdIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_IN);
        return this;
    }

    public void setLocalIdIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_IN);
        }
    }

    public boolean getLocalIdIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID_IN);
    }

    public ReplicationRestorePointWhereInput localIdLt(String localIdLt) {

        this.localIdLt = localIdLt;
        return this;
    }

    /**
     * Get localIdLt
     *
     * @return localIdLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalIdLt() {
        return localIdLt;
    }

    public void setLocalIdLt(String localIdLt) {
        this.localIdLt = localIdLt;
    }

    public ReplicationRestorePointWhereInput localIdLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_LT);
        return this;
    }

    public ReplicationRestorePointWhereInput localIdLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_LT);
        return this;
    }

    public void setLocalIdLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_LT);
        }
    }

    public boolean getLocalIdLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID_LT);
    }

    public ReplicationRestorePointWhereInput localIdLte(String localIdLte) {

        this.localIdLte = localIdLte;
        return this;
    }

    /**
     * Get localIdLte
     *
     * @return localIdLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalIdLte() {
        return localIdLte;
    }

    public void setLocalIdLte(String localIdLte) {
        this.localIdLte = localIdLte;
    }

    public ReplicationRestorePointWhereInput localIdLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_LTE);
        return this;
    }

    public ReplicationRestorePointWhereInput localIdLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_LTE);
        return this;
    }

    public void setLocalIdLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_LTE);
        }
    }

    public boolean getLocalIdLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID_LTE);
    }

    public ReplicationRestorePointWhereInput localIdNot(String localIdNot) {

        this.localIdNot = localIdNot;
        return this;
    }

    /**
     * Get localIdNot
     *
     * @return localIdNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalIdNot() {
        return localIdNot;
    }

    public void setLocalIdNot(String localIdNot) {
        this.localIdNot = localIdNot;
    }

    public ReplicationRestorePointWhereInput localIdNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT);
        return this;
    }

    public ReplicationRestorePointWhereInput localIdNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_NOT);
        return this;
    }

    public void setLocalIdNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_NOT);
        }
    }

    public boolean getLocalIdNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID_NOT);
    }

    public ReplicationRestorePointWhereInput localIdNotContains(String localIdNotContains) {

        this.localIdNotContains = localIdNotContains;
        return this;
    }

    /**
     * Get localIdNotContains
     *
     * @return localIdNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalIdNotContains() {
        return localIdNotContains;
    }

    public void setLocalIdNotContains(String localIdNotContains) {
        this.localIdNotContains = localIdNotContains;
    }

    public ReplicationRestorePointWhereInput localIdNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_CONTAINS);
        return this;
    }

    public ReplicationRestorePointWhereInput localIdNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_NOT_CONTAINS);
        return this;
    }

    public void setLocalIdNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_NOT_CONTAINS);
        }
    }

    public boolean getLocalIdNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID_NOT_CONTAINS);
    }

    public ReplicationRestorePointWhereInput localIdNotEndsWith(String localIdNotEndsWith) {

        this.localIdNotEndsWith = localIdNotEndsWith;
        return this;
    }

    /**
     * Get localIdNotEndsWith
     *
     * @return localIdNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalIdNotEndsWith() {
        return localIdNotEndsWith;
    }

    public void setLocalIdNotEndsWith(String localIdNotEndsWith) {
        this.localIdNotEndsWith = localIdNotEndsWith;
    }

    public ReplicationRestorePointWhereInput localIdNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_ENDS_WITH);
        return this;
    }

    public ReplicationRestorePointWhereInput localIdNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_NOT_ENDS_WITH);
        return this;
    }

    public void setLocalIdNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_NOT_ENDS_WITH);
        }
    }

    public boolean getLocalIdNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID_NOT_ENDS_WITH);
    }

    public ReplicationRestorePointWhereInput localIdNotIn(List<String> localIdNotIn) {

        this.localIdNotIn = localIdNotIn;
        return this;
    }

    public ReplicationRestorePointWhereInput addLocalIdNotInItem(String localIdNotInItem) {
        if (this.localIdNotIn == null) {
            this.localIdNotIn = new ArrayList<String>();
        }
        this.localIdNotIn.add(localIdNotInItem);
        return this;
    }

    /**
     * Get localIdNotIn
     *
     * @return localIdNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getLocalIdNotIn() {
        return localIdNotIn;
    }

    public void setLocalIdNotIn(List<String> localIdNotIn) {
        this.localIdNotIn = localIdNotIn;
    }

    public ReplicationRestorePointWhereInput localIdNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_IN);
        return this;
    }

    public ReplicationRestorePointWhereInput localIdNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_NOT_IN);
        return this;
    }

    public void setLocalIdNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_NOT_IN);
        }
    }

    public boolean getLocalIdNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID_NOT_IN);
    }

    public ReplicationRestorePointWhereInput localIdNotStartsWith(String localIdNotStartsWith) {

        this.localIdNotStartsWith = localIdNotStartsWith;
        return this;
    }

    /**
     * Get localIdNotStartsWith
     *
     * @return localIdNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalIdNotStartsWith() {
        return localIdNotStartsWith;
    }

    public void setLocalIdNotStartsWith(String localIdNotStartsWith) {
        this.localIdNotStartsWith = localIdNotStartsWith;
    }

    public ReplicationRestorePointWhereInput localIdNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_STARTS_WITH);
        return this;
    }

    public ReplicationRestorePointWhereInput localIdNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_NOT_STARTS_WITH);
        return this;
    }

    public void setLocalIdNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_NOT_STARTS_WITH);
        }
    }

    public boolean getLocalIdNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID_NOT_STARTS_WITH);
    }

    public ReplicationRestorePointWhereInput localIdStartsWith(String localIdStartsWith) {

        this.localIdStartsWith = localIdStartsWith;
        return this;
    }

    /**
     * Get localIdStartsWith
     *
     * @return localIdStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalIdStartsWith() {
        return localIdStartsWith;
    }

    public void setLocalIdStartsWith(String localIdStartsWith) {
        this.localIdStartsWith = localIdStartsWith;
    }

    public ReplicationRestorePointWhereInput localIdStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_STARTS_WITH);
        return this;
    }

    public ReplicationRestorePointWhereInput localIdStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_STARTS_WITH);
        return this;
    }

    public void setLocalIdStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_ID_STARTS_WITH);
        }
    }

    public boolean getLocalIdStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_ID_STARTS_WITH);
    }

    public ReplicationRestorePointWhereInput parentRestorePoint(String parentRestorePoint) {

        this.parentRestorePoint = parentRestorePoint;
        return this;
    }

    /**
     * Get parentRestorePoint
     *
     * @return parentRestorePoint
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getParentRestorePoint() {
        return parentRestorePoint;
    }

    public void setParentRestorePoint(String parentRestorePoint) {
        this.parentRestorePoint = parentRestorePoint;
    }

    public ReplicationRestorePointWhereInput parentRestorePoint_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PARENT_RESTORE_POINT);
        return this;
    }

    public ReplicationRestorePointWhereInput parentRestorePoint_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PARENT_RESTORE_POINT);
        return this;
    }

    public void setParentRestorePoint_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PARENT_RESTORE_POINT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PARENT_RESTORE_POINT);
        }
    }

    public boolean getParentRestorePoint_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PARENT_RESTORE_POINT);
    }

    public ReplicationRestorePointWhereInput parentRestorePointContains(
            String parentRestorePointContains) {

        this.parentRestorePointContains = parentRestorePointContains;
        return this;
    }

    /**
     * Get parentRestorePointContains
     *
     * @return parentRestorePointContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getParentRestorePointContains() {
        return parentRestorePointContains;
    }

    public void setParentRestorePointContains(String parentRestorePointContains) {
        this.parentRestorePointContains = parentRestorePointContains;
    }

    public ReplicationRestorePointWhereInput parentRestorePointContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PARENT_RESTORE_POINT_CONTAINS);
        return this;
    }

    public ReplicationRestorePointWhereInput parentRestorePointContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PARENT_RESTORE_POINT_CONTAINS);
        return this;
    }

    public void setParentRestorePointContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PARENT_RESTORE_POINT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PARENT_RESTORE_POINT_CONTAINS);
        }
    }

    public boolean getParentRestorePointContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PARENT_RESTORE_POINT_CONTAINS);
    }

    public ReplicationRestorePointWhereInput parentRestorePointEndsWith(
            String parentRestorePointEndsWith) {

        this.parentRestorePointEndsWith = parentRestorePointEndsWith;
        return this;
    }

    /**
     * Get parentRestorePointEndsWith
     *
     * @return parentRestorePointEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getParentRestorePointEndsWith() {
        return parentRestorePointEndsWith;
    }

    public void setParentRestorePointEndsWith(String parentRestorePointEndsWith) {
        this.parentRestorePointEndsWith = parentRestorePointEndsWith;
    }

    public ReplicationRestorePointWhereInput parentRestorePointEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PARENT_RESTORE_POINT_ENDS_WITH);
        return this;
    }

    public ReplicationRestorePointWhereInput parentRestorePointEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PARENT_RESTORE_POINT_ENDS_WITH);
        return this;
    }

    public void setParentRestorePointEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PARENT_RESTORE_POINT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PARENT_RESTORE_POINT_ENDS_WITH);
        }
    }

    public boolean getParentRestorePointEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PARENT_RESTORE_POINT_ENDS_WITH);
    }

    public ReplicationRestorePointWhereInput parentRestorePointGt(String parentRestorePointGt) {

        this.parentRestorePointGt = parentRestorePointGt;
        return this;
    }

    /**
     * Get parentRestorePointGt
     *
     * @return parentRestorePointGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getParentRestorePointGt() {
        return parentRestorePointGt;
    }

    public void setParentRestorePointGt(String parentRestorePointGt) {
        this.parentRestorePointGt = parentRestorePointGt;
    }

    public ReplicationRestorePointWhereInput parentRestorePointGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PARENT_RESTORE_POINT_GT);
        return this;
    }

    public ReplicationRestorePointWhereInput parentRestorePointGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PARENT_RESTORE_POINT_GT);
        return this;
    }

    public void setParentRestorePointGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PARENT_RESTORE_POINT_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PARENT_RESTORE_POINT_GT);
        }
    }

    public boolean getParentRestorePointGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PARENT_RESTORE_POINT_GT);
    }

    public ReplicationRestorePointWhereInput parentRestorePointGte(String parentRestorePointGte) {

        this.parentRestorePointGte = parentRestorePointGte;
        return this;
    }

    /**
     * Get parentRestorePointGte
     *
     * @return parentRestorePointGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getParentRestorePointGte() {
        return parentRestorePointGte;
    }

    public void setParentRestorePointGte(String parentRestorePointGte) {
        this.parentRestorePointGte = parentRestorePointGte;
    }

    public ReplicationRestorePointWhereInput parentRestorePointGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PARENT_RESTORE_POINT_GTE);
        return this;
    }

    public ReplicationRestorePointWhereInput parentRestorePointGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PARENT_RESTORE_POINT_GTE);
        return this;
    }

    public void setParentRestorePointGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PARENT_RESTORE_POINT_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PARENT_RESTORE_POINT_GTE);
        }
    }

    public boolean getParentRestorePointGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PARENT_RESTORE_POINT_GTE);
    }

    public ReplicationRestorePointWhereInput parentRestorePointIn(
            List<String> parentRestorePointIn) {

        this.parentRestorePointIn = parentRestorePointIn;
        return this;
    }

    public ReplicationRestorePointWhereInput addParentRestorePointInItem(
            String parentRestorePointInItem) {
        if (this.parentRestorePointIn == null) {
            this.parentRestorePointIn = new ArrayList<String>();
        }
        this.parentRestorePointIn.add(parentRestorePointInItem);
        return this;
    }

    /**
     * Get parentRestorePointIn
     *
     * @return parentRestorePointIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getParentRestorePointIn() {
        return parentRestorePointIn;
    }

    public void setParentRestorePointIn(List<String> parentRestorePointIn) {
        this.parentRestorePointIn = parentRestorePointIn;
    }

    public ReplicationRestorePointWhereInput parentRestorePointIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PARENT_RESTORE_POINT_IN);
        return this;
    }

    public ReplicationRestorePointWhereInput parentRestorePointIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PARENT_RESTORE_POINT_IN);
        return this;
    }

    public void setParentRestorePointIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PARENT_RESTORE_POINT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PARENT_RESTORE_POINT_IN);
        }
    }

    public boolean getParentRestorePointIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PARENT_RESTORE_POINT_IN);
    }

    public ReplicationRestorePointWhereInput parentRestorePointLt(String parentRestorePointLt) {

        this.parentRestorePointLt = parentRestorePointLt;
        return this;
    }

    /**
     * Get parentRestorePointLt
     *
     * @return parentRestorePointLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getParentRestorePointLt() {
        return parentRestorePointLt;
    }

    public void setParentRestorePointLt(String parentRestorePointLt) {
        this.parentRestorePointLt = parentRestorePointLt;
    }

    public ReplicationRestorePointWhereInput parentRestorePointLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PARENT_RESTORE_POINT_LT);
        return this;
    }

    public ReplicationRestorePointWhereInput parentRestorePointLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PARENT_RESTORE_POINT_LT);
        return this;
    }

    public void setParentRestorePointLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PARENT_RESTORE_POINT_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PARENT_RESTORE_POINT_LT);
        }
    }

    public boolean getParentRestorePointLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PARENT_RESTORE_POINT_LT);
    }

    public ReplicationRestorePointWhereInput parentRestorePointLte(String parentRestorePointLte) {

        this.parentRestorePointLte = parentRestorePointLte;
        return this;
    }

    /**
     * Get parentRestorePointLte
     *
     * @return parentRestorePointLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getParentRestorePointLte() {
        return parentRestorePointLte;
    }

    public void setParentRestorePointLte(String parentRestorePointLte) {
        this.parentRestorePointLte = parentRestorePointLte;
    }

    public ReplicationRestorePointWhereInput parentRestorePointLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PARENT_RESTORE_POINT_LTE);
        return this;
    }

    public ReplicationRestorePointWhereInput parentRestorePointLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PARENT_RESTORE_POINT_LTE);
        return this;
    }

    public void setParentRestorePointLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PARENT_RESTORE_POINT_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PARENT_RESTORE_POINT_LTE);
        }
    }

    public boolean getParentRestorePointLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PARENT_RESTORE_POINT_LTE);
    }

    public ReplicationRestorePointWhereInput parentRestorePointNot(String parentRestorePointNot) {

        this.parentRestorePointNot = parentRestorePointNot;
        return this;
    }

    /**
     * Get parentRestorePointNot
     *
     * @return parentRestorePointNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getParentRestorePointNot() {
        return parentRestorePointNot;
    }

    public void setParentRestorePointNot(String parentRestorePointNot) {
        this.parentRestorePointNot = parentRestorePointNot;
    }

    public ReplicationRestorePointWhereInput parentRestorePointNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PARENT_RESTORE_POINT_NOT);
        return this;
    }

    public ReplicationRestorePointWhereInput parentRestorePointNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PARENT_RESTORE_POINT_NOT);
        return this;
    }

    public void setParentRestorePointNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PARENT_RESTORE_POINT_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PARENT_RESTORE_POINT_NOT);
        }
    }

    public boolean getParentRestorePointNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PARENT_RESTORE_POINT_NOT);
    }

    public ReplicationRestorePointWhereInput parentRestorePointNotContains(
            String parentRestorePointNotContains) {

        this.parentRestorePointNotContains = parentRestorePointNotContains;
        return this;
    }

    /**
     * Get parentRestorePointNotContains
     *
     * @return parentRestorePointNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getParentRestorePointNotContains() {
        return parentRestorePointNotContains;
    }

    public void setParentRestorePointNotContains(String parentRestorePointNotContains) {
        this.parentRestorePointNotContains = parentRestorePointNotContains;
    }

    public ReplicationRestorePointWhereInput parentRestorePointNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PARENT_RESTORE_POINT_NOT_CONTAINS);
        return this;
    }

    public ReplicationRestorePointWhereInput parentRestorePointNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PARENT_RESTORE_POINT_NOT_CONTAINS);
        return this;
    }

    public void setParentRestorePointNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PARENT_RESTORE_POINT_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PARENT_RESTORE_POINT_NOT_CONTAINS);
        }
    }

    public boolean getParentRestorePointNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PARENT_RESTORE_POINT_NOT_CONTAINS);
    }

    public ReplicationRestorePointWhereInput parentRestorePointNotEndsWith(
            String parentRestorePointNotEndsWith) {

        this.parentRestorePointNotEndsWith = parentRestorePointNotEndsWith;
        return this;
    }

    /**
     * Get parentRestorePointNotEndsWith
     *
     * @return parentRestorePointNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getParentRestorePointNotEndsWith() {
        return parentRestorePointNotEndsWith;
    }

    public void setParentRestorePointNotEndsWith(String parentRestorePointNotEndsWith) {
        this.parentRestorePointNotEndsWith = parentRestorePointNotEndsWith;
    }

    public ReplicationRestorePointWhereInput parentRestorePointNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PARENT_RESTORE_POINT_NOT_ENDS_WITH);
        return this;
    }

    public ReplicationRestorePointWhereInput parentRestorePointNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PARENT_RESTORE_POINT_NOT_ENDS_WITH);
        return this;
    }

    public void setParentRestorePointNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PARENT_RESTORE_POINT_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PARENT_RESTORE_POINT_NOT_ENDS_WITH);
        }
    }

    public boolean getParentRestorePointNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PARENT_RESTORE_POINT_NOT_ENDS_WITH);
    }

    public ReplicationRestorePointWhereInput parentRestorePointNotIn(
            List<String> parentRestorePointNotIn) {

        this.parentRestorePointNotIn = parentRestorePointNotIn;
        return this;
    }

    public ReplicationRestorePointWhereInput addParentRestorePointNotInItem(
            String parentRestorePointNotInItem) {
        if (this.parentRestorePointNotIn == null) {
            this.parentRestorePointNotIn = new ArrayList<String>();
        }
        this.parentRestorePointNotIn.add(parentRestorePointNotInItem);
        return this;
    }

    /**
     * Get parentRestorePointNotIn
     *
     * @return parentRestorePointNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getParentRestorePointNotIn() {
        return parentRestorePointNotIn;
    }

    public void setParentRestorePointNotIn(List<String> parentRestorePointNotIn) {
        this.parentRestorePointNotIn = parentRestorePointNotIn;
    }

    public ReplicationRestorePointWhereInput parentRestorePointNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PARENT_RESTORE_POINT_NOT_IN);
        return this;
    }

    public ReplicationRestorePointWhereInput parentRestorePointNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PARENT_RESTORE_POINT_NOT_IN);
        return this;
    }

    public void setParentRestorePointNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PARENT_RESTORE_POINT_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PARENT_RESTORE_POINT_NOT_IN);
        }
    }

    public boolean getParentRestorePointNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PARENT_RESTORE_POINT_NOT_IN);
    }

    public ReplicationRestorePointWhereInput parentRestorePointNotStartsWith(
            String parentRestorePointNotStartsWith) {

        this.parentRestorePointNotStartsWith = parentRestorePointNotStartsWith;
        return this;
    }

    /**
     * Get parentRestorePointNotStartsWith
     *
     * @return parentRestorePointNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getParentRestorePointNotStartsWith() {
        return parentRestorePointNotStartsWith;
    }

    public void setParentRestorePointNotStartsWith(String parentRestorePointNotStartsWith) {
        this.parentRestorePointNotStartsWith = parentRestorePointNotStartsWith;
    }

    public ReplicationRestorePointWhereInput parentRestorePointNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PARENT_RESTORE_POINT_NOT_STARTS_WITH);
        return this;
    }

    public ReplicationRestorePointWhereInput parentRestorePointNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PARENT_RESTORE_POINT_NOT_STARTS_WITH);
        return this;
    }

    public void setParentRestorePointNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PARENT_RESTORE_POINT_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PARENT_RESTORE_POINT_NOT_STARTS_WITH);
        }
    }

    public boolean getParentRestorePointNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PARENT_RESTORE_POINT_NOT_STARTS_WITH);
    }

    public ReplicationRestorePointWhereInput parentRestorePointStartsWith(
            String parentRestorePointStartsWith) {

        this.parentRestorePointStartsWith = parentRestorePointStartsWith;
        return this;
    }

    /**
     * Get parentRestorePointStartsWith
     *
     * @return parentRestorePointStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getParentRestorePointStartsWith() {
        return parentRestorePointStartsWith;
    }

    public void setParentRestorePointStartsWith(String parentRestorePointStartsWith) {
        this.parentRestorePointStartsWith = parentRestorePointStartsWith;
    }

    public ReplicationRestorePointWhereInput parentRestorePointStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PARENT_RESTORE_POINT_STARTS_WITH);
        return this;
    }

    public ReplicationRestorePointWhereInput parentRestorePointStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PARENT_RESTORE_POINT_STARTS_WITH);
        return this;
    }

    public void setParentRestorePointStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PARENT_RESTORE_POINT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PARENT_RESTORE_POINT_STARTS_WITH);
        }
    }

    public boolean getParentRestorePointStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PARENT_RESTORE_POINT_STARTS_WITH);
    }

    public ReplicationRestorePointWhereInput replicaVm(ReplicaVmWhereInput replicaVm) {

        this.replicaVm = replicaVm;
        return this;
    }

    /**
     * Get replicaVm
     *
     * @return replicaVm
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ReplicaVmWhereInput getReplicaVm() {
        return replicaVm;
    }

    public void setReplicaVm(ReplicaVmWhereInput replicaVm) {
        this.replicaVm = replicaVm;
    }

    public ReplicationRestorePointWhereInput replicaVm_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICA_VM);
        return this;
    }

    public ReplicationRestorePointWhereInput replicaVm_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REPLICA_VM);
        return this;
    }

    public void setReplicaVm_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REPLICA_VM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REPLICA_VM);
        }
    }

    public boolean getReplicaVm_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REPLICA_VM);
    }

    public ReplicationRestorePointWhereInput replicationPlan(
            ReplicationPlanWhereInput replicationPlan) {

        this.replicationPlan = replicationPlan;
        return this;
    }

    /**
     * Get replicationPlan
     *
     * @return replicationPlan
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ReplicationPlanWhereInput getReplicationPlan() {
        return replicationPlan;
    }

    public void setReplicationPlan(ReplicationPlanWhereInput replicationPlan) {
        this.replicationPlan = replicationPlan;
    }

    public ReplicationRestorePointWhereInput replicationPlan_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICATION_PLAN);
        return this;
    }

    public ReplicationRestorePointWhereInput replicationPlan_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REPLICATION_PLAN);
        return this;
    }

    public void setReplicationPlan_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REPLICATION_PLAN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REPLICATION_PLAN);
        }
    }

    public boolean getReplicationPlan_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REPLICATION_PLAN);
    }

    public ReplicationRestorePointWhereInput replicationService(
            ReplicationServiceWhereInput replicationService) {

        this.replicationService = replicationService;
        return this;
    }

    /**
     * Get replicationService
     *
     * @return replicationService
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ReplicationServiceWhereInput getReplicationService() {
        return replicationService;
    }

    public void setReplicationService(ReplicationServiceWhereInput replicationService) {
        this.replicationService = replicationService;
    }

    public ReplicationRestorePointWhereInput replicationService_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICATION_SERVICE);
        return this;
    }

    public ReplicationRestorePointWhereInput replicationService_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REPLICATION_SERVICE);
        return this;
    }

    public void setReplicationService_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REPLICATION_SERVICE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REPLICATION_SERVICE);
        }
    }

    public boolean getReplicationService_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REPLICATION_SERVICE);
    }

    public ReplicationRestorePointWhereInput replicationTargetExecution(
            ReplicationTargetExecutionWhereInput replicationTargetExecution) {

        this.replicationTargetExecution = replicationTargetExecution;
        return this;
    }

    /**
     * Get replicationTargetExecution
     *
     * @return replicationTargetExecution
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ReplicationTargetExecutionWhereInput getReplicationTargetExecution() {
        return replicationTargetExecution;
    }

    public void setReplicationTargetExecution(
            ReplicationTargetExecutionWhereInput replicationTargetExecution) {
        this.replicationTargetExecution = replicationTargetExecution;
    }

    public ReplicationRestorePointWhereInput replicationTargetExecution_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICATION_TARGET_EXECUTION);
        return this;
    }

    public ReplicationRestorePointWhereInput replicationTargetExecution_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REPLICATION_TARGET_EXECUTION);
        return this;
    }

    public void setReplicationTargetExecution_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REPLICATION_TARGET_EXECUTION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REPLICATION_TARGET_EXECUTION);
        }
    }

    public boolean getReplicationTargetExecution_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REPLICATION_TARGET_EXECUTION);
    }

    public ReplicationRestorePointWhereInput resourceVersion(Integer resourceVersion) {

        this.resourceVersion = resourceVersion;
        return this;
    }

    /**
     * Get resourceVersion
     *
     * @return resourceVersion
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getResourceVersion() {
        return resourceVersion;
    }

    public void setResourceVersion(Integer resourceVersion) {
        this.resourceVersion = resourceVersion;
    }

    public ReplicationRestorePointWhereInput resourceVersion_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_VERSION);
        return this;
    }

    public ReplicationRestorePointWhereInput resourceVersion_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_VERSION);
        return this;
    }

    public void setResourceVersion_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_VERSION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_VERSION);
        }
    }

    public boolean getResourceVersion_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_VERSION);
    }

    public ReplicationRestorePointWhereInput resourceVersionGt(Integer resourceVersionGt) {

        this.resourceVersionGt = resourceVersionGt;
        return this;
    }

    /**
     * Get resourceVersionGt
     *
     * @return resourceVersionGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getResourceVersionGt() {
        return resourceVersionGt;
    }

    public void setResourceVersionGt(Integer resourceVersionGt) {
        this.resourceVersionGt = resourceVersionGt;
    }

    public ReplicationRestorePointWhereInput resourceVersionGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_VERSION_GT);
        return this;
    }

    public ReplicationRestorePointWhereInput resourceVersionGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_VERSION_GT);
        return this;
    }

    public void setResourceVersionGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_VERSION_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_VERSION_GT);
        }
    }

    public boolean getResourceVersionGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_VERSION_GT);
    }

    public ReplicationRestorePointWhereInput resourceVersionGte(Integer resourceVersionGte) {

        this.resourceVersionGte = resourceVersionGte;
        return this;
    }

    /**
     * Get resourceVersionGte
     *
     * @return resourceVersionGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getResourceVersionGte() {
        return resourceVersionGte;
    }

    public void setResourceVersionGte(Integer resourceVersionGte) {
        this.resourceVersionGte = resourceVersionGte;
    }

    public ReplicationRestorePointWhereInput resourceVersionGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_VERSION_GTE);
        return this;
    }

    public ReplicationRestorePointWhereInput resourceVersionGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_VERSION_GTE);
        return this;
    }

    public void setResourceVersionGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_VERSION_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_VERSION_GTE);
        }
    }

    public boolean getResourceVersionGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_VERSION_GTE);
    }

    public ReplicationRestorePointWhereInput resourceVersionIn(List<Integer> resourceVersionIn) {

        this.resourceVersionIn = resourceVersionIn;
        return this;
    }

    public ReplicationRestorePointWhereInput addResourceVersionInItem(
            Integer resourceVersionInItem) {
        if (this.resourceVersionIn == null) {
            this.resourceVersionIn = new ArrayList<Integer>();
        }
        this.resourceVersionIn.add(resourceVersionInItem);
        return this;
    }

    /**
     * Get resourceVersionIn
     *
     * @return resourceVersionIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getResourceVersionIn() {
        return resourceVersionIn;
    }

    public void setResourceVersionIn(List<Integer> resourceVersionIn) {
        this.resourceVersionIn = resourceVersionIn;
    }

    public ReplicationRestorePointWhereInput resourceVersionIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_VERSION_IN);
        return this;
    }

    public ReplicationRestorePointWhereInput resourceVersionIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_VERSION_IN);
        return this;
    }

    public void setResourceVersionIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_VERSION_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_VERSION_IN);
        }
    }

    public boolean getResourceVersionIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_VERSION_IN);
    }

    public ReplicationRestorePointWhereInput resourceVersionLt(Integer resourceVersionLt) {

        this.resourceVersionLt = resourceVersionLt;
        return this;
    }

    /**
     * Get resourceVersionLt
     *
     * @return resourceVersionLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getResourceVersionLt() {
        return resourceVersionLt;
    }

    public void setResourceVersionLt(Integer resourceVersionLt) {
        this.resourceVersionLt = resourceVersionLt;
    }

    public ReplicationRestorePointWhereInput resourceVersionLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_VERSION_LT);
        return this;
    }

    public ReplicationRestorePointWhereInput resourceVersionLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_VERSION_LT);
        return this;
    }

    public void setResourceVersionLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_VERSION_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_VERSION_LT);
        }
    }

    public boolean getResourceVersionLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_VERSION_LT);
    }

    public ReplicationRestorePointWhereInput resourceVersionLte(Integer resourceVersionLte) {

        this.resourceVersionLte = resourceVersionLte;
        return this;
    }

    /**
     * Get resourceVersionLte
     *
     * @return resourceVersionLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getResourceVersionLte() {
        return resourceVersionLte;
    }

    public void setResourceVersionLte(Integer resourceVersionLte) {
        this.resourceVersionLte = resourceVersionLte;
    }

    public ReplicationRestorePointWhereInput resourceVersionLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_VERSION_LTE);
        return this;
    }

    public ReplicationRestorePointWhereInput resourceVersionLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_VERSION_LTE);
        return this;
    }

    public void setResourceVersionLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_VERSION_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_VERSION_LTE);
        }
    }

    public boolean getResourceVersionLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_VERSION_LTE);
    }

    public ReplicationRestorePointWhereInput resourceVersionNot(Integer resourceVersionNot) {

        this.resourceVersionNot = resourceVersionNot;
        return this;
    }

    /**
     * Get resourceVersionNot
     *
     * @return resourceVersionNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getResourceVersionNot() {
        return resourceVersionNot;
    }

    public void setResourceVersionNot(Integer resourceVersionNot) {
        this.resourceVersionNot = resourceVersionNot;
    }

    public ReplicationRestorePointWhereInput resourceVersionNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_VERSION_NOT);
        return this;
    }

    public ReplicationRestorePointWhereInput resourceVersionNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_VERSION_NOT);
        return this;
    }

    public void setResourceVersionNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_VERSION_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_VERSION_NOT);
        }
    }

    public boolean getResourceVersionNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_VERSION_NOT);
    }

    public ReplicationRestorePointWhereInput resourceVersionNotIn(
            List<Integer> resourceVersionNotIn) {

        this.resourceVersionNotIn = resourceVersionNotIn;
        return this;
    }

    public ReplicationRestorePointWhereInput addResourceVersionNotInItem(
            Integer resourceVersionNotInItem) {
        if (this.resourceVersionNotIn == null) {
            this.resourceVersionNotIn = new ArrayList<Integer>();
        }
        this.resourceVersionNotIn.add(resourceVersionNotInItem);
        return this;
    }

    /**
     * Get resourceVersionNotIn
     *
     * @return resourceVersionNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getResourceVersionNotIn() {
        return resourceVersionNotIn;
    }

    public void setResourceVersionNotIn(List<Integer> resourceVersionNotIn) {
        this.resourceVersionNotIn = resourceVersionNotIn;
    }

    public ReplicationRestorePointWhereInput resourceVersionNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RESOURCE_VERSION_NOT_IN);
        return this;
    }

    public ReplicationRestorePointWhereInput resourceVersionNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_VERSION_NOT_IN);
        return this;
    }

    public void setResourceVersionNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RESOURCE_VERSION_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RESOURCE_VERSION_NOT_IN);
        }
    }

    public boolean getResourceVersionNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RESOURCE_VERSION_NOT_IN);
    }

    public ReplicationRestorePointWhereInput slice(String slice) {

        this.slice = slice;
        return this;
    }

    /**
     * Get slice
     *
     * @return slice
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSlice() {
        return slice;
    }

    public void setSlice(String slice) {
        this.slice = slice;
    }

    public ReplicationRestorePointWhereInput slice_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SLICE);
        return this;
    }

    public ReplicationRestorePointWhereInput slice_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SLICE);
        return this;
    }

    public void setSlice_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SLICE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SLICE);
        }
    }

    public boolean getSlice_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SLICE);
    }

    public ReplicationRestorePointWhereInput sliceContains(String sliceContains) {

        this.sliceContains = sliceContains;
        return this;
    }

    /**
     * Get sliceContains
     *
     * @return sliceContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSliceContains() {
        return sliceContains;
    }

    public void setSliceContains(String sliceContains) {
        this.sliceContains = sliceContains;
    }

    public ReplicationRestorePointWhereInput sliceContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SLICE_CONTAINS);
        return this;
    }

    public ReplicationRestorePointWhereInput sliceContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SLICE_CONTAINS);
        return this;
    }

    public void setSliceContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SLICE_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SLICE_CONTAINS);
        }
    }

    public boolean getSliceContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SLICE_CONTAINS);
    }

    public ReplicationRestorePointWhereInput sliceEndsWith(String sliceEndsWith) {

        this.sliceEndsWith = sliceEndsWith;
        return this;
    }

    /**
     * Get sliceEndsWith
     *
     * @return sliceEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSliceEndsWith() {
        return sliceEndsWith;
    }

    public void setSliceEndsWith(String sliceEndsWith) {
        this.sliceEndsWith = sliceEndsWith;
    }

    public ReplicationRestorePointWhereInput sliceEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SLICE_ENDS_WITH);
        return this;
    }

    public ReplicationRestorePointWhereInput sliceEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SLICE_ENDS_WITH);
        return this;
    }

    public void setSliceEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SLICE_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SLICE_ENDS_WITH);
        }
    }

    public boolean getSliceEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SLICE_ENDS_WITH);
    }

    public ReplicationRestorePointWhereInput sliceGt(String sliceGt) {

        this.sliceGt = sliceGt;
        return this;
    }

    /**
     * Get sliceGt
     *
     * @return sliceGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSliceGt() {
        return sliceGt;
    }

    public void setSliceGt(String sliceGt) {
        this.sliceGt = sliceGt;
    }

    public ReplicationRestorePointWhereInput sliceGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SLICE_GT);
        return this;
    }

    public ReplicationRestorePointWhereInput sliceGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SLICE_GT);
        return this;
    }

    public void setSliceGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SLICE_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SLICE_GT);
        }
    }

    public boolean getSliceGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SLICE_GT);
    }

    public ReplicationRestorePointWhereInput sliceGte(String sliceGte) {

        this.sliceGte = sliceGte;
        return this;
    }

    /**
     * Get sliceGte
     *
     * @return sliceGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSliceGte() {
        return sliceGte;
    }

    public void setSliceGte(String sliceGte) {
        this.sliceGte = sliceGte;
    }

    public ReplicationRestorePointWhereInput sliceGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SLICE_GTE);
        return this;
    }

    public ReplicationRestorePointWhereInput sliceGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SLICE_GTE);
        return this;
    }

    public void setSliceGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SLICE_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SLICE_GTE);
        }
    }

    public boolean getSliceGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SLICE_GTE);
    }

    public ReplicationRestorePointWhereInput sliceIn(List<String> sliceIn) {

        this.sliceIn = sliceIn;
        return this;
    }

    public ReplicationRestorePointWhereInput addSliceInItem(String sliceInItem) {
        if (this.sliceIn == null) {
            this.sliceIn = new ArrayList<String>();
        }
        this.sliceIn.add(sliceInItem);
        return this;
    }

    /**
     * Get sliceIn
     *
     * @return sliceIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getSliceIn() {
        return sliceIn;
    }

    public void setSliceIn(List<String> sliceIn) {
        this.sliceIn = sliceIn;
    }

    public ReplicationRestorePointWhereInput sliceIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SLICE_IN);
        return this;
    }

    public ReplicationRestorePointWhereInput sliceIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SLICE_IN);
        return this;
    }

    public void setSliceIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SLICE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SLICE_IN);
        }
    }

    public boolean getSliceIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SLICE_IN);
    }

    public ReplicationRestorePointWhereInput sliceLt(String sliceLt) {

        this.sliceLt = sliceLt;
        return this;
    }

    /**
     * Get sliceLt
     *
     * @return sliceLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSliceLt() {
        return sliceLt;
    }

    public void setSliceLt(String sliceLt) {
        this.sliceLt = sliceLt;
    }

    public ReplicationRestorePointWhereInput sliceLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SLICE_LT);
        return this;
    }

    public ReplicationRestorePointWhereInput sliceLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SLICE_LT);
        return this;
    }

    public void setSliceLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SLICE_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SLICE_LT);
        }
    }

    public boolean getSliceLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SLICE_LT);
    }

    public ReplicationRestorePointWhereInput sliceLte(String sliceLte) {

        this.sliceLte = sliceLte;
        return this;
    }

    /**
     * Get sliceLte
     *
     * @return sliceLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSliceLte() {
        return sliceLte;
    }

    public void setSliceLte(String sliceLte) {
        this.sliceLte = sliceLte;
    }

    public ReplicationRestorePointWhereInput sliceLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SLICE_LTE);
        return this;
    }

    public ReplicationRestorePointWhereInput sliceLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SLICE_LTE);
        return this;
    }

    public void setSliceLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SLICE_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SLICE_LTE);
        }
    }

    public boolean getSliceLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SLICE_LTE);
    }

    public ReplicationRestorePointWhereInput sliceNot(String sliceNot) {

        this.sliceNot = sliceNot;
        return this;
    }

    /**
     * Get sliceNot
     *
     * @return sliceNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSliceNot() {
        return sliceNot;
    }

    public void setSliceNot(String sliceNot) {
        this.sliceNot = sliceNot;
    }

    public ReplicationRestorePointWhereInput sliceNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SLICE_NOT);
        return this;
    }

    public ReplicationRestorePointWhereInput sliceNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SLICE_NOT);
        return this;
    }

    public void setSliceNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SLICE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SLICE_NOT);
        }
    }

    public boolean getSliceNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SLICE_NOT);
    }

    public ReplicationRestorePointWhereInput sliceNotContains(String sliceNotContains) {

        this.sliceNotContains = sliceNotContains;
        return this;
    }

    /**
     * Get sliceNotContains
     *
     * @return sliceNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSliceNotContains() {
        return sliceNotContains;
    }

    public void setSliceNotContains(String sliceNotContains) {
        this.sliceNotContains = sliceNotContains;
    }

    public ReplicationRestorePointWhereInput sliceNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SLICE_NOT_CONTAINS);
        return this;
    }

    public ReplicationRestorePointWhereInput sliceNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SLICE_NOT_CONTAINS);
        return this;
    }

    public void setSliceNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SLICE_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SLICE_NOT_CONTAINS);
        }
    }

    public boolean getSliceNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SLICE_NOT_CONTAINS);
    }

    public ReplicationRestorePointWhereInput sliceNotEndsWith(String sliceNotEndsWith) {

        this.sliceNotEndsWith = sliceNotEndsWith;
        return this;
    }

    /**
     * Get sliceNotEndsWith
     *
     * @return sliceNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSliceNotEndsWith() {
        return sliceNotEndsWith;
    }

    public void setSliceNotEndsWith(String sliceNotEndsWith) {
        this.sliceNotEndsWith = sliceNotEndsWith;
    }

    public ReplicationRestorePointWhereInput sliceNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SLICE_NOT_ENDS_WITH);
        return this;
    }

    public ReplicationRestorePointWhereInput sliceNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SLICE_NOT_ENDS_WITH);
        return this;
    }

    public void setSliceNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SLICE_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SLICE_NOT_ENDS_WITH);
        }
    }

    public boolean getSliceNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SLICE_NOT_ENDS_WITH);
    }

    public ReplicationRestorePointWhereInput sliceNotIn(List<String> sliceNotIn) {

        this.sliceNotIn = sliceNotIn;
        return this;
    }

    public ReplicationRestorePointWhereInput addSliceNotInItem(String sliceNotInItem) {
        if (this.sliceNotIn == null) {
            this.sliceNotIn = new ArrayList<String>();
        }
        this.sliceNotIn.add(sliceNotInItem);
        return this;
    }

    /**
     * Get sliceNotIn
     *
     * @return sliceNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getSliceNotIn() {
        return sliceNotIn;
    }

    public void setSliceNotIn(List<String> sliceNotIn) {
        this.sliceNotIn = sliceNotIn;
    }

    public ReplicationRestorePointWhereInput sliceNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SLICE_NOT_IN);
        return this;
    }

    public ReplicationRestorePointWhereInput sliceNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SLICE_NOT_IN);
        return this;
    }

    public void setSliceNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SLICE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SLICE_NOT_IN);
        }
    }

    public boolean getSliceNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SLICE_NOT_IN);
    }

    public ReplicationRestorePointWhereInput sliceNotStartsWith(String sliceNotStartsWith) {

        this.sliceNotStartsWith = sliceNotStartsWith;
        return this;
    }

    /**
     * Get sliceNotStartsWith
     *
     * @return sliceNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSliceNotStartsWith() {
        return sliceNotStartsWith;
    }

    public void setSliceNotStartsWith(String sliceNotStartsWith) {
        this.sliceNotStartsWith = sliceNotStartsWith;
    }

    public ReplicationRestorePointWhereInput sliceNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SLICE_NOT_STARTS_WITH);
        return this;
    }

    public ReplicationRestorePointWhereInput sliceNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SLICE_NOT_STARTS_WITH);
        return this;
    }

    public void setSliceNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SLICE_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SLICE_NOT_STARTS_WITH);
        }
    }

    public boolean getSliceNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SLICE_NOT_STARTS_WITH);
    }

    public ReplicationRestorePointWhereInput sliceStartsWith(String sliceStartsWith) {

        this.sliceStartsWith = sliceStartsWith;
        return this;
    }

    /**
     * Get sliceStartsWith
     *
     * @return sliceStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSliceStartsWith() {
        return sliceStartsWith;
    }

    public void setSliceStartsWith(String sliceStartsWith) {
        this.sliceStartsWith = sliceStartsWith;
    }

    public ReplicationRestorePointWhereInput sliceStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SLICE_STARTS_WITH);
        return this;
    }

    public ReplicationRestorePointWhereInput sliceStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SLICE_STARTS_WITH);
        return this;
    }

    public void setSliceStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SLICE_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SLICE_STARTS_WITH);
        }
    }

    public boolean getSliceStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SLICE_STARTS_WITH);
    }

    public ReplicationRestorePointWhereInput snapshotConsistentType(
            ConsistentType snapshotConsistentType) {

        this.snapshotConsistentType = snapshotConsistentType;
        return this;
    }

    /**
     * Get snapshotConsistentType
     *
     * @return snapshotConsistentType
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ConsistentType getSnapshotConsistentType() {
        return snapshotConsistentType;
    }

    public void setSnapshotConsistentType(ConsistentType snapshotConsistentType) {
        this.snapshotConsistentType = snapshotConsistentType;
    }

    public ReplicationRestorePointWhereInput snapshotConsistentType_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT_CONSISTENT_TYPE);
        return this;
    }

    public ReplicationRestorePointWhereInput snapshotConsistentType_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SNAPSHOT_CONSISTENT_TYPE);
        return this;
    }

    public void setSnapshotConsistentType_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT_CONSISTENT_TYPE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SNAPSHOT_CONSISTENT_TYPE);
        }
    }

    public boolean getSnapshotConsistentType_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SNAPSHOT_CONSISTENT_TYPE);
    }

    public ReplicationRestorePointWhereInput snapshotConsistentTypeIn(
            List<ConsistentType> snapshotConsistentTypeIn) {

        this.snapshotConsistentTypeIn = snapshotConsistentTypeIn;
        return this;
    }

    public ReplicationRestorePointWhereInput addSnapshotConsistentTypeInItem(
            ConsistentType snapshotConsistentTypeInItem) {
        if (this.snapshotConsistentTypeIn == null) {
            this.snapshotConsistentTypeIn = new ArrayList<ConsistentType>();
        }
        this.snapshotConsistentTypeIn.add(snapshotConsistentTypeInItem);
        return this;
    }

    /**
     * Get snapshotConsistentTypeIn
     *
     * @return snapshotConsistentTypeIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<ConsistentType> getSnapshotConsistentTypeIn() {
        return snapshotConsistentTypeIn;
    }

    public void setSnapshotConsistentTypeIn(List<ConsistentType> snapshotConsistentTypeIn) {
        this.snapshotConsistentTypeIn = snapshotConsistentTypeIn;
    }

    public ReplicationRestorePointWhereInput snapshotConsistentTypeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT_CONSISTENT_TYPE_IN);
        return this;
    }

    public ReplicationRestorePointWhereInput snapshotConsistentTypeIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SNAPSHOT_CONSISTENT_TYPE_IN);
        return this;
    }

    public void setSnapshotConsistentTypeIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT_CONSISTENT_TYPE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SNAPSHOT_CONSISTENT_TYPE_IN);
        }
    }

    public boolean getSnapshotConsistentTypeIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SNAPSHOT_CONSISTENT_TYPE_IN);
    }

    public ReplicationRestorePointWhereInput snapshotConsistentTypeNot(
            ConsistentType snapshotConsistentTypeNot) {

        this.snapshotConsistentTypeNot = snapshotConsistentTypeNot;
        return this;
    }

    /**
     * Get snapshotConsistentTypeNot
     *
     * @return snapshotConsistentTypeNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ConsistentType getSnapshotConsistentTypeNot() {
        return snapshotConsistentTypeNot;
    }

    public void setSnapshotConsistentTypeNot(ConsistentType snapshotConsistentTypeNot) {
        this.snapshotConsistentTypeNot = snapshotConsistentTypeNot;
    }

    public ReplicationRestorePointWhereInput snapshotConsistentTypeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT_CONSISTENT_TYPE_NOT);
        return this;
    }

    public ReplicationRestorePointWhereInput snapshotConsistentTypeNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SNAPSHOT_CONSISTENT_TYPE_NOT);
        return this;
    }

    public void setSnapshotConsistentTypeNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT_CONSISTENT_TYPE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SNAPSHOT_CONSISTENT_TYPE_NOT);
        }
    }

    public boolean getSnapshotConsistentTypeNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SNAPSHOT_CONSISTENT_TYPE_NOT);
    }

    public ReplicationRestorePointWhereInput snapshotConsistentTypeNotIn(
            List<ConsistentType> snapshotConsistentTypeNotIn) {

        this.snapshotConsistentTypeNotIn = snapshotConsistentTypeNotIn;
        return this;
    }

    public ReplicationRestorePointWhereInput addSnapshotConsistentTypeNotInItem(
            ConsistentType snapshotConsistentTypeNotInItem) {
        if (this.snapshotConsistentTypeNotIn == null) {
            this.snapshotConsistentTypeNotIn = new ArrayList<ConsistentType>();
        }
        this.snapshotConsistentTypeNotIn.add(snapshotConsistentTypeNotInItem);
        return this;
    }

    /**
     * Get snapshotConsistentTypeNotIn
     *
     * @return snapshotConsistentTypeNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<ConsistentType> getSnapshotConsistentTypeNotIn() {
        return snapshotConsistentTypeNotIn;
    }

    public void setSnapshotConsistentTypeNotIn(List<ConsistentType> snapshotConsistentTypeNotIn) {
        this.snapshotConsistentTypeNotIn = snapshotConsistentTypeNotIn;
    }

    public ReplicationRestorePointWhereInput snapshotConsistentTypeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT_CONSISTENT_TYPE_NOT_IN);
        return this;
    }

    public ReplicationRestorePointWhereInput snapshotConsistentTypeNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SNAPSHOT_CONSISTENT_TYPE_NOT_IN);
        return this;
    }

    public void setSnapshotConsistentTypeNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT_CONSISTENT_TYPE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SNAPSHOT_CONSISTENT_TYPE_NOT_IN);
        }
    }

    public boolean getSnapshotConsistentTypeNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SNAPSHOT_CONSISTENT_TYPE_NOT_IN);
    }

    public ReplicationRestorePointWhereInput syncReplicationPlan(
            SyncReplicationPlanWhereInput syncReplicationPlan) {

        this.syncReplicationPlan = syncReplicationPlan;
        return this;
    }

    /**
     * Get syncReplicationPlan
     *
     * @return syncReplicationPlan
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public SyncReplicationPlanWhereInput getSyncReplicationPlan() {
        return syncReplicationPlan;
    }

    public void setSyncReplicationPlan(SyncReplicationPlanWhereInput syncReplicationPlan) {
        this.syncReplicationPlan = syncReplicationPlan;
    }

    public ReplicationRestorePointWhereInput syncReplicationPlan_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SYNC_REPLICATION_PLAN);
        return this;
    }

    public ReplicationRestorePointWhereInput syncReplicationPlan_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SYNC_REPLICATION_PLAN);
        return this;
    }

    public void setSyncReplicationPlan_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SYNC_REPLICATION_PLAN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SYNC_REPLICATION_PLAN);
        }
    }

    public boolean getSyncReplicationPlan_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SYNC_REPLICATION_PLAN);
    }

    public ReplicationRestorePointWhereInput towerDeployId(String towerDeployId) {

        this.towerDeployId = towerDeployId;
        return this;
    }

    /**
     * Get towerDeployId
     *
     * @return towerDeployId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getTowerDeployId() {
        return towerDeployId;
    }

    public void setTowerDeployId(String towerDeployId) {
        this.towerDeployId = towerDeployId;
    }

    public ReplicationRestorePointWhereInput towerDeployId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOWER_DEPLOY_ID);
        return this;
    }

    public ReplicationRestorePointWhereInput towerDeployId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOWER_DEPLOY_ID);
        return this;
    }

    public void setTowerDeployId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOWER_DEPLOY_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOWER_DEPLOY_ID);
        }
    }

    public boolean getTowerDeployId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOWER_DEPLOY_ID);
    }

    public ReplicationRestorePointWhereInput towerDeployIdContains(String towerDeployIdContains) {

        this.towerDeployIdContains = towerDeployIdContains;
        return this;
    }

    /**
     * Get towerDeployIdContains
     *
     * @return towerDeployIdContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getTowerDeployIdContains() {
        return towerDeployIdContains;
    }

    public void setTowerDeployIdContains(String towerDeployIdContains) {
        this.towerDeployIdContains = towerDeployIdContains;
    }

    public ReplicationRestorePointWhereInput towerDeployIdContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOWER_DEPLOY_ID_CONTAINS);
        return this;
    }

    public ReplicationRestorePointWhereInput towerDeployIdContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOWER_DEPLOY_ID_CONTAINS);
        return this;
    }

    public void setTowerDeployIdContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOWER_DEPLOY_ID_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOWER_DEPLOY_ID_CONTAINS);
        }
    }

    public boolean getTowerDeployIdContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOWER_DEPLOY_ID_CONTAINS);
    }

    public ReplicationRestorePointWhereInput towerDeployIdEndsWith(String towerDeployIdEndsWith) {

        this.towerDeployIdEndsWith = towerDeployIdEndsWith;
        return this;
    }

    /**
     * Get towerDeployIdEndsWith
     *
     * @return towerDeployIdEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getTowerDeployIdEndsWith() {
        return towerDeployIdEndsWith;
    }

    public void setTowerDeployIdEndsWith(String towerDeployIdEndsWith) {
        this.towerDeployIdEndsWith = towerDeployIdEndsWith;
    }

    public ReplicationRestorePointWhereInput towerDeployIdEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOWER_DEPLOY_ID_ENDS_WITH);
        return this;
    }

    public ReplicationRestorePointWhereInput towerDeployIdEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOWER_DEPLOY_ID_ENDS_WITH);
        return this;
    }

    public void setTowerDeployIdEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOWER_DEPLOY_ID_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOWER_DEPLOY_ID_ENDS_WITH);
        }
    }

    public boolean getTowerDeployIdEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOWER_DEPLOY_ID_ENDS_WITH);
    }

    public ReplicationRestorePointWhereInput towerDeployIdGt(String towerDeployIdGt) {

        this.towerDeployIdGt = towerDeployIdGt;
        return this;
    }

    /**
     * Get towerDeployIdGt
     *
     * @return towerDeployIdGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getTowerDeployIdGt() {
        return towerDeployIdGt;
    }

    public void setTowerDeployIdGt(String towerDeployIdGt) {
        this.towerDeployIdGt = towerDeployIdGt;
    }

    public ReplicationRestorePointWhereInput towerDeployIdGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOWER_DEPLOY_ID_GT);
        return this;
    }

    public ReplicationRestorePointWhereInput towerDeployIdGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOWER_DEPLOY_ID_GT);
        return this;
    }

    public void setTowerDeployIdGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOWER_DEPLOY_ID_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOWER_DEPLOY_ID_GT);
        }
    }

    public boolean getTowerDeployIdGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOWER_DEPLOY_ID_GT);
    }

    public ReplicationRestorePointWhereInput towerDeployIdGte(String towerDeployIdGte) {

        this.towerDeployIdGte = towerDeployIdGte;
        return this;
    }

    /**
     * Get towerDeployIdGte
     *
     * @return towerDeployIdGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getTowerDeployIdGte() {
        return towerDeployIdGte;
    }

    public void setTowerDeployIdGte(String towerDeployIdGte) {
        this.towerDeployIdGte = towerDeployIdGte;
    }

    public ReplicationRestorePointWhereInput towerDeployIdGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOWER_DEPLOY_ID_GTE);
        return this;
    }

    public ReplicationRestorePointWhereInput towerDeployIdGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOWER_DEPLOY_ID_GTE);
        return this;
    }

    public void setTowerDeployIdGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOWER_DEPLOY_ID_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOWER_DEPLOY_ID_GTE);
        }
    }

    public boolean getTowerDeployIdGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOWER_DEPLOY_ID_GTE);
    }

    public ReplicationRestorePointWhereInput towerDeployIdIn(List<String> towerDeployIdIn) {

        this.towerDeployIdIn = towerDeployIdIn;
        return this;
    }

    public ReplicationRestorePointWhereInput addTowerDeployIdInItem(String towerDeployIdInItem) {
        if (this.towerDeployIdIn == null) {
            this.towerDeployIdIn = new ArrayList<String>();
        }
        this.towerDeployIdIn.add(towerDeployIdInItem);
        return this;
    }

    /**
     * Get towerDeployIdIn
     *
     * @return towerDeployIdIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getTowerDeployIdIn() {
        return towerDeployIdIn;
    }

    public void setTowerDeployIdIn(List<String> towerDeployIdIn) {
        this.towerDeployIdIn = towerDeployIdIn;
    }

    public ReplicationRestorePointWhereInput towerDeployIdIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOWER_DEPLOY_ID_IN);
        return this;
    }

    public ReplicationRestorePointWhereInput towerDeployIdIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOWER_DEPLOY_ID_IN);
        return this;
    }

    public void setTowerDeployIdIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOWER_DEPLOY_ID_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOWER_DEPLOY_ID_IN);
        }
    }

    public boolean getTowerDeployIdIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOWER_DEPLOY_ID_IN);
    }

    public ReplicationRestorePointWhereInput towerDeployIdLt(String towerDeployIdLt) {

        this.towerDeployIdLt = towerDeployIdLt;
        return this;
    }

    /**
     * Get towerDeployIdLt
     *
     * @return towerDeployIdLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getTowerDeployIdLt() {
        return towerDeployIdLt;
    }

    public void setTowerDeployIdLt(String towerDeployIdLt) {
        this.towerDeployIdLt = towerDeployIdLt;
    }

    public ReplicationRestorePointWhereInput towerDeployIdLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOWER_DEPLOY_ID_LT);
        return this;
    }

    public ReplicationRestorePointWhereInput towerDeployIdLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOWER_DEPLOY_ID_LT);
        return this;
    }

    public void setTowerDeployIdLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOWER_DEPLOY_ID_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOWER_DEPLOY_ID_LT);
        }
    }

    public boolean getTowerDeployIdLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOWER_DEPLOY_ID_LT);
    }

    public ReplicationRestorePointWhereInput towerDeployIdLte(String towerDeployIdLte) {

        this.towerDeployIdLte = towerDeployIdLte;
        return this;
    }

    /**
     * Get towerDeployIdLte
     *
     * @return towerDeployIdLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getTowerDeployIdLte() {
        return towerDeployIdLte;
    }

    public void setTowerDeployIdLte(String towerDeployIdLte) {
        this.towerDeployIdLte = towerDeployIdLte;
    }

    public ReplicationRestorePointWhereInput towerDeployIdLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOWER_DEPLOY_ID_LTE);
        return this;
    }

    public ReplicationRestorePointWhereInput towerDeployIdLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOWER_DEPLOY_ID_LTE);
        return this;
    }

    public void setTowerDeployIdLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOWER_DEPLOY_ID_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOWER_DEPLOY_ID_LTE);
        }
    }

    public boolean getTowerDeployIdLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOWER_DEPLOY_ID_LTE);
    }

    public ReplicationRestorePointWhereInput towerDeployIdNot(String towerDeployIdNot) {

        this.towerDeployIdNot = towerDeployIdNot;
        return this;
    }

    /**
     * Get towerDeployIdNot
     *
     * @return towerDeployIdNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getTowerDeployIdNot() {
        return towerDeployIdNot;
    }

    public void setTowerDeployIdNot(String towerDeployIdNot) {
        this.towerDeployIdNot = towerDeployIdNot;
    }

    public ReplicationRestorePointWhereInput towerDeployIdNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOWER_DEPLOY_ID_NOT);
        return this;
    }

    public ReplicationRestorePointWhereInput towerDeployIdNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOWER_DEPLOY_ID_NOT);
        return this;
    }

    public void setTowerDeployIdNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOWER_DEPLOY_ID_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOWER_DEPLOY_ID_NOT);
        }
    }

    public boolean getTowerDeployIdNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOWER_DEPLOY_ID_NOT);
    }

    public ReplicationRestorePointWhereInput towerDeployIdNotContains(
            String towerDeployIdNotContains) {

        this.towerDeployIdNotContains = towerDeployIdNotContains;
        return this;
    }

    /**
     * Get towerDeployIdNotContains
     *
     * @return towerDeployIdNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getTowerDeployIdNotContains() {
        return towerDeployIdNotContains;
    }

    public void setTowerDeployIdNotContains(String towerDeployIdNotContains) {
        this.towerDeployIdNotContains = towerDeployIdNotContains;
    }

    public ReplicationRestorePointWhereInput towerDeployIdNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOWER_DEPLOY_ID_NOT_CONTAINS);
        return this;
    }

    public ReplicationRestorePointWhereInput towerDeployIdNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOWER_DEPLOY_ID_NOT_CONTAINS);
        return this;
    }

    public void setTowerDeployIdNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOWER_DEPLOY_ID_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOWER_DEPLOY_ID_NOT_CONTAINS);
        }
    }

    public boolean getTowerDeployIdNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOWER_DEPLOY_ID_NOT_CONTAINS);
    }

    public ReplicationRestorePointWhereInput towerDeployIdNotEndsWith(
            String towerDeployIdNotEndsWith) {

        this.towerDeployIdNotEndsWith = towerDeployIdNotEndsWith;
        return this;
    }

    /**
     * Get towerDeployIdNotEndsWith
     *
     * @return towerDeployIdNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getTowerDeployIdNotEndsWith() {
        return towerDeployIdNotEndsWith;
    }

    public void setTowerDeployIdNotEndsWith(String towerDeployIdNotEndsWith) {
        this.towerDeployIdNotEndsWith = towerDeployIdNotEndsWith;
    }

    public ReplicationRestorePointWhereInput towerDeployIdNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOWER_DEPLOY_ID_NOT_ENDS_WITH);
        return this;
    }

    public ReplicationRestorePointWhereInput towerDeployIdNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOWER_DEPLOY_ID_NOT_ENDS_WITH);
        return this;
    }

    public void setTowerDeployIdNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOWER_DEPLOY_ID_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOWER_DEPLOY_ID_NOT_ENDS_WITH);
        }
    }

    public boolean getTowerDeployIdNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOWER_DEPLOY_ID_NOT_ENDS_WITH);
    }

    public ReplicationRestorePointWhereInput towerDeployIdNotIn(List<String> towerDeployIdNotIn) {

        this.towerDeployIdNotIn = towerDeployIdNotIn;
        return this;
    }

    public ReplicationRestorePointWhereInput addTowerDeployIdNotInItem(
            String towerDeployIdNotInItem) {
        if (this.towerDeployIdNotIn == null) {
            this.towerDeployIdNotIn = new ArrayList<String>();
        }
        this.towerDeployIdNotIn.add(towerDeployIdNotInItem);
        return this;
    }

    /**
     * Get towerDeployIdNotIn
     *
     * @return towerDeployIdNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getTowerDeployIdNotIn() {
        return towerDeployIdNotIn;
    }

    public void setTowerDeployIdNotIn(List<String> towerDeployIdNotIn) {
        this.towerDeployIdNotIn = towerDeployIdNotIn;
    }

    public ReplicationRestorePointWhereInput towerDeployIdNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOWER_DEPLOY_ID_NOT_IN);
        return this;
    }

    public ReplicationRestorePointWhereInput towerDeployIdNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOWER_DEPLOY_ID_NOT_IN);
        return this;
    }

    public void setTowerDeployIdNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOWER_DEPLOY_ID_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOWER_DEPLOY_ID_NOT_IN);
        }
    }

    public boolean getTowerDeployIdNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOWER_DEPLOY_ID_NOT_IN);
    }

    public ReplicationRestorePointWhereInput towerDeployIdNotStartsWith(
            String towerDeployIdNotStartsWith) {

        this.towerDeployIdNotStartsWith = towerDeployIdNotStartsWith;
        return this;
    }

    /**
     * Get towerDeployIdNotStartsWith
     *
     * @return towerDeployIdNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getTowerDeployIdNotStartsWith() {
        return towerDeployIdNotStartsWith;
    }

    public void setTowerDeployIdNotStartsWith(String towerDeployIdNotStartsWith) {
        this.towerDeployIdNotStartsWith = towerDeployIdNotStartsWith;
    }

    public ReplicationRestorePointWhereInput towerDeployIdNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOWER_DEPLOY_ID_NOT_STARTS_WITH);
        return this;
    }

    public ReplicationRestorePointWhereInput towerDeployIdNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOWER_DEPLOY_ID_NOT_STARTS_WITH);
        return this;
    }

    public void setTowerDeployIdNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOWER_DEPLOY_ID_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOWER_DEPLOY_ID_NOT_STARTS_WITH);
        }
    }

    public boolean getTowerDeployIdNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOWER_DEPLOY_ID_NOT_STARTS_WITH);
    }

    public ReplicationRestorePointWhereInput towerDeployIdStartsWith(
            String towerDeployIdStartsWith) {

        this.towerDeployIdStartsWith = towerDeployIdStartsWith;
        return this;
    }

    /**
     * Get towerDeployIdStartsWith
     *
     * @return towerDeployIdStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getTowerDeployIdStartsWith() {
        return towerDeployIdStartsWith;
    }

    public void setTowerDeployIdStartsWith(String towerDeployIdStartsWith) {
        this.towerDeployIdStartsWith = towerDeployIdStartsWith;
    }

    public ReplicationRestorePointWhereInput towerDeployIdStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TOWER_DEPLOY_ID_STARTS_WITH);
        return this;
    }

    public ReplicationRestorePointWhereInput towerDeployIdStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TOWER_DEPLOY_ID_STARTS_WITH);
        return this;
    }

    public void setTowerDeployIdStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TOWER_DEPLOY_ID_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TOWER_DEPLOY_ID_STARTS_WITH);
        }
    }

    public boolean getTowerDeployIdStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TOWER_DEPLOY_ID_STARTS_WITH);
    }

    public ReplicationRestorePointWhereInput type(BackupRestorePointType type) {

        this.type = type;
        return this;
    }

    /**
     * Get type
     *
     * @return type
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public BackupRestorePointType getType() {
        return type;
    }

    public void setType(BackupRestorePointType type) {
        this.type = type;
    }

    public ReplicationRestorePointWhereInput type_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE);
        return this;
    }

    public ReplicationRestorePointWhereInput type_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TYPE);
        return this;
    }

    public void setType_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TYPE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TYPE);
        }
    }

    public boolean getType_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TYPE);
    }

    public ReplicationRestorePointWhereInput typeIn(List<BackupRestorePointType> typeIn) {

        this.typeIn = typeIn;
        return this;
    }

    public ReplicationRestorePointWhereInput addTypeInItem(BackupRestorePointType typeInItem) {
        if (this.typeIn == null) {
            this.typeIn = new ArrayList<BackupRestorePointType>();
        }
        this.typeIn.add(typeInItem);
        return this;
    }

    /**
     * Get typeIn
     *
     * @return typeIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<BackupRestorePointType> getTypeIn() {
        return typeIn;
    }

    public void setTypeIn(List<BackupRestorePointType> typeIn) {
        this.typeIn = typeIn;
    }

    public ReplicationRestorePointWhereInput typeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE_IN);
        return this;
    }

    public ReplicationRestorePointWhereInput typeIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TYPE_IN);
        return this;
    }

    public void setTypeIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TYPE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TYPE_IN);
        }
    }

    public boolean getTypeIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TYPE_IN);
    }

    public ReplicationRestorePointWhereInput typeNot(BackupRestorePointType typeNot) {

        this.typeNot = typeNot;
        return this;
    }

    /**
     * Get typeNot
     *
     * @return typeNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public BackupRestorePointType getTypeNot() {
        return typeNot;
    }

    public void setTypeNot(BackupRestorePointType typeNot) {
        this.typeNot = typeNot;
    }

    public ReplicationRestorePointWhereInput typeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE_NOT);
        return this;
    }

    public ReplicationRestorePointWhereInput typeNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TYPE_NOT);
        return this;
    }

    public void setTypeNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TYPE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TYPE_NOT);
        }
    }

    public boolean getTypeNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TYPE_NOT);
    }

    public ReplicationRestorePointWhereInput typeNotIn(List<BackupRestorePointType> typeNotIn) {

        this.typeNotIn = typeNotIn;
        return this;
    }

    public ReplicationRestorePointWhereInput addTypeNotInItem(
            BackupRestorePointType typeNotInItem) {
        if (this.typeNotIn == null) {
            this.typeNotIn = new ArrayList<BackupRestorePointType>();
        }
        this.typeNotIn.add(typeNotInItem);
        return this;
    }

    /**
     * Get typeNotIn
     *
     * @return typeNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<BackupRestorePointType> getTypeNotIn() {
        return typeNotIn;
    }

    public void setTypeNotIn(List<BackupRestorePointType> typeNotIn) {
        this.typeNotIn = typeNotIn;
    }

    public ReplicationRestorePointWhereInput typeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE_NOT_IN);
        return this;
    }

    public ReplicationRestorePointWhereInput typeNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_TYPE_NOT_IN);
        return this;
    }

    public void setTypeNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_TYPE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_TYPE_NOT_IN);
        }
    }

    public boolean getTypeNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_TYPE_NOT_IN);
    }

    public ReplicationRestorePointWhereInput vm(VmWhereInput vm) {

        this.vm = vm;
        return this;
    }

    /**
     * Get vm
     *
     * @return vm
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmWhereInput getVm() {
        return vm;
    }

    public void setVm(VmWhereInput vm) {
        this.vm = vm;
    }

    public ReplicationRestorePointWhereInput vm_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM);
        return this;
    }

    public ReplicationRestorePointWhereInput vm_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM);
        return this;
    }

    public void setVm_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM);
        }
    }

    public boolean getVm_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM);
    }

    public ReplicationRestorePointWhereInput vmLocalId(String vmLocalId) {

        this.vmLocalId = vmLocalId;
        return this;
    }

    /**
     * Get vmLocalId
     *
     * @return vmLocalId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVmLocalId() {
        return vmLocalId;
    }

    public void setVmLocalId(String vmLocalId) {
        this.vmLocalId = vmLocalId;
    }

    public ReplicationRestorePointWhereInput vmLocalId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_LOCAL_ID);
        return this;
    }

    public ReplicationRestorePointWhereInput vmLocalId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_LOCAL_ID);
        return this;
    }

    public void setVmLocalId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_LOCAL_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_LOCAL_ID);
        }
    }

    public boolean getVmLocalId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_LOCAL_ID);
    }

    public ReplicationRestorePointWhereInput vmLocalIdContains(String vmLocalIdContains) {

        this.vmLocalIdContains = vmLocalIdContains;
        return this;
    }

    /**
     * Get vmLocalIdContains
     *
     * @return vmLocalIdContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVmLocalIdContains() {
        return vmLocalIdContains;
    }

    public void setVmLocalIdContains(String vmLocalIdContains) {
        this.vmLocalIdContains = vmLocalIdContains;
    }

    public ReplicationRestorePointWhereInput vmLocalIdContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_LOCAL_ID_CONTAINS);
        return this;
    }

    public ReplicationRestorePointWhereInput vmLocalIdContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_LOCAL_ID_CONTAINS);
        return this;
    }

    public void setVmLocalIdContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_LOCAL_ID_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_LOCAL_ID_CONTAINS);
        }
    }

    public boolean getVmLocalIdContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_LOCAL_ID_CONTAINS);
    }

    public ReplicationRestorePointWhereInput vmLocalIdEndsWith(String vmLocalIdEndsWith) {

        this.vmLocalIdEndsWith = vmLocalIdEndsWith;
        return this;
    }

    /**
     * Get vmLocalIdEndsWith
     *
     * @return vmLocalIdEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVmLocalIdEndsWith() {
        return vmLocalIdEndsWith;
    }

    public void setVmLocalIdEndsWith(String vmLocalIdEndsWith) {
        this.vmLocalIdEndsWith = vmLocalIdEndsWith;
    }

    public ReplicationRestorePointWhereInput vmLocalIdEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_LOCAL_ID_ENDS_WITH);
        return this;
    }

    public ReplicationRestorePointWhereInput vmLocalIdEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_LOCAL_ID_ENDS_WITH);
        return this;
    }

    public void setVmLocalIdEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_LOCAL_ID_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_LOCAL_ID_ENDS_WITH);
        }
    }

    public boolean getVmLocalIdEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_LOCAL_ID_ENDS_WITH);
    }

    public ReplicationRestorePointWhereInput vmLocalIdGt(String vmLocalIdGt) {

        this.vmLocalIdGt = vmLocalIdGt;
        return this;
    }

    /**
     * Get vmLocalIdGt
     *
     * @return vmLocalIdGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVmLocalIdGt() {
        return vmLocalIdGt;
    }

    public void setVmLocalIdGt(String vmLocalIdGt) {
        this.vmLocalIdGt = vmLocalIdGt;
    }

    public ReplicationRestorePointWhereInput vmLocalIdGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_LOCAL_ID_GT);
        return this;
    }

    public ReplicationRestorePointWhereInput vmLocalIdGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_LOCAL_ID_GT);
        return this;
    }

    public void setVmLocalIdGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_LOCAL_ID_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_LOCAL_ID_GT);
        }
    }

    public boolean getVmLocalIdGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_LOCAL_ID_GT);
    }

    public ReplicationRestorePointWhereInput vmLocalIdGte(String vmLocalIdGte) {

        this.vmLocalIdGte = vmLocalIdGte;
        return this;
    }

    /**
     * Get vmLocalIdGte
     *
     * @return vmLocalIdGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVmLocalIdGte() {
        return vmLocalIdGte;
    }

    public void setVmLocalIdGte(String vmLocalIdGte) {
        this.vmLocalIdGte = vmLocalIdGte;
    }

    public ReplicationRestorePointWhereInput vmLocalIdGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_LOCAL_ID_GTE);
        return this;
    }

    public ReplicationRestorePointWhereInput vmLocalIdGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_LOCAL_ID_GTE);
        return this;
    }

    public void setVmLocalIdGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_LOCAL_ID_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_LOCAL_ID_GTE);
        }
    }

    public boolean getVmLocalIdGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_LOCAL_ID_GTE);
    }

    public ReplicationRestorePointWhereInput vmLocalIdIn(List<String> vmLocalIdIn) {

        this.vmLocalIdIn = vmLocalIdIn;
        return this;
    }

    public ReplicationRestorePointWhereInput addVmLocalIdInItem(String vmLocalIdInItem) {
        if (this.vmLocalIdIn == null) {
            this.vmLocalIdIn = new ArrayList<String>();
        }
        this.vmLocalIdIn.add(vmLocalIdInItem);
        return this;
    }

    /**
     * Get vmLocalIdIn
     *
     * @return vmLocalIdIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getVmLocalIdIn() {
        return vmLocalIdIn;
    }

    public void setVmLocalIdIn(List<String> vmLocalIdIn) {
        this.vmLocalIdIn = vmLocalIdIn;
    }

    public ReplicationRestorePointWhereInput vmLocalIdIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_LOCAL_ID_IN);
        return this;
    }

    public ReplicationRestorePointWhereInput vmLocalIdIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_LOCAL_ID_IN);
        return this;
    }

    public void setVmLocalIdIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_LOCAL_ID_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_LOCAL_ID_IN);
        }
    }

    public boolean getVmLocalIdIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_LOCAL_ID_IN);
    }

    public ReplicationRestorePointWhereInput vmLocalIdLt(String vmLocalIdLt) {

        this.vmLocalIdLt = vmLocalIdLt;
        return this;
    }

    /**
     * Get vmLocalIdLt
     *
     * @return vmLocalIdLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVmLocalIdLt() {
        return vmLocalIdLt;
    }

    public void setVmLocalIdLt(String vmLocalIdLt) {
        this.vmLocalIdLt = vmLocalIdLt;
    }

    public ReplicationRestorePointWhereInput vmLocalIdLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_LOCAL_ID_LT);
        return this;
    }

    public ReplicationRestorePointWhereInput vmLocalIdLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_LOCAL_ID_LT);
        return this;
    }

    public void setVmLocalIdLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_LOCAL_ID_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_LOCAL_ID_LT);
        }
    }

    public boolean getVmLocalIdLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_LOCAL_ID_LT);
    }

    public ReplicationRestorePointWhereInput vmLocalIdLte(String vmLocalIdLte) {

        this.vmLocalIdLte = vmLocalIdLte;
        return this;
    }

    /**
     * Get vmLocalIdLte
     *
     * @return vmLocalIdLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVmLocalIdLte() {
        return vmLocalIdLte;
    }

    public void setVmLocalIdLte(String vmLocalIdLte) {
        this.vmLocalIdLte = vmLocalIdLte;
    }

    public ReplicationRestorePointWhereInput vmLocalIdLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_LOCAL_ID_LTE);
        return this;
    }

    public ReplicationRestorePointWhereInput vmLocalIdLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_LOCAL_ID_LTE);
        return this;
    }

    public void setVmLocalIdLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_LOCAL_ID_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_LOCAL_ID_LTE);
        }
    }

    public boolean getVmLocalIdLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_LOCAL_ID_LTE);
    }

    public ReplicationRestorePointWhereInput vmLocalIdNot(String vmLocalIdNot) {

        this.vmLocalIdNot = vmLocalIdNot;
        return this;
    }

    /**
     * Get vmLocalIdNot
     *
     * @return vmLocalIdNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVmLocalIdNot() {
        return vmLocalIdNot;
    }

    public void setVmLocalIdNot(String vmLocalIdNot) {
        this.vmLocalIdNot = vmLocalIdNot;
    }

    public ReplicationRestorePointWhereInput vmLocalIdNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_LOCAL_ID_NOT);
        return this;
    }

    public ReplicationRestorePointWhereInput vmLocalIdNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_LOCAL_ID_NOT);
        return this;
    }

    public void setVmLocalIdNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_LOCAL_ID_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_LOCAL_ID_NOT);
        }
    }

    public boolean getVmLocalIdNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_LOCAL_ID_NOT);
    }

    public ReplicationRestorePointWhereInput vmLocalIdNotContains(String vmLocalIdNotContains) {

        this.vmLocalIdNotContains = vmLocalIdNotContains;
        return this;
    }

    /**
     * Get vmLocalIdNotContains
     *
     * @return vmLocalIdNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVmLocalIdNotContains() {
        return vmLocalIdNotContains;
    }

    public void setVmLocalIdNotContains(String vmLocalIdNotContains) {
        this.vmLocalIdNotContains = vmLocalIdNotContains;
    }

    public ReplicationRestorePointWhereInput vmLocalIdNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_LOCAL_ID_NOT_CONTAINS);
        return this;
    }

    public ReplicationRestorePointWhereInput vmLocalIdNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_LOCAL_ID_NOT_CONTAINS);
        return this;
    }

    public void setVmLocalIdNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_LOCAL_ID_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_LOCAL_ID_NOT_CONTAINS);
        }
    }

    public boolean getVmLocalIdNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_LOCAL_ID_NOT_CONTAINS);
    }

    public ReplicationRestorePointWhereInput vmLocalIdNotEndsWith(String vmLocalIdNotEndsWith) {

        this.vmLocalIdNotEndsWith = vmLocalIdNotEndsWith;
        return this;
    }

    /**
     * Get vmLocalIdNotEndsWith
     *
     * @return vmLocalIdNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVmLocalIdNotEndsWith() {
        return vmLocalIdNotEndsWith;
    }

    public void setVmLocalIdNotEndsWith(String vmLocalIdNotEndsWith) {
        this.vmLocalIdNotEndsWith = vmLocalIdNotEndsWith;
    }

    public ReplicationRestorePointWhereInput vmLocalIdNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_LOCAL_ID_NOT_ENDS_WITH);
        return this;
    }

    public ReplicationRestorePointWhereInput vmLocalIdNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_LOCAL_ID_NOT_ENDS_WITH);
        return this;
    }

    public void setVmLocalIdNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_LOCAL_ID_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_LOCAL_ID_NOT_ENDS_WITH);
        }
    }

    public boolean getVmLocalIdNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_LOCAL_ID_NOT_ENDS_WITH);
    }

    public ReplicationRestorePointWhereInput vmLocalIdNotIn(List<String> vmLocalIdNotIn) {

        this.vmLocalIdNotIn = vmLocalIdNotIn;
        return this;
    }

    public ReplicationRestorePointWhereInput addVmLocalIdNotInItem(String vmLocalIdNotInItem) {
        if (this.vmLocalIdNotIn == null) {
            this.vmLocalIdNotIn = new ArrayList<String>();
        }
        this.vmLocalIdNotIn.add(vmLocalIdNotInItem);
        return this;
    }

    /**
     * Get vmLocalIdNotIn
     *
     * @return vmLocalIdNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getVmLocalIdNotIn() {
        return vmLocalIdNotIn;
    }

    public void setVmLocalIdNotIn(List<String> vmLocalIdNotIn) {
        this.vmLocalIdNotIn = vmLocalIdNotIn;
    }

    public ReplicationRestorePointWhereInput vmLocalIdNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_LOCAL_ID_NOT_IN);
        return this;
    }

    public ReplicationRestorePointWhereInput vmLocalIdNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_LOCAL_ID_NOT_IN);
        return this;
    }

    public void setVmLocalIdNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_LOCAL_ID_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_LOCAL_ID_NOT_IN);
        }
    }

    public boolean getVmLocalIdNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_LOCAL_ID_NOT_IN);
    }

    public ReplicationRestorePointWhereInput vmLocalIdNotStartsWith(String vmLocalIdNotStartsWith) {

        this.vmLocalIdNotStartsWith = vmLocalIdNotStartsWith;
        return this;
    }

    /**
     * Get vmLocalIdNotStartsWith
     *
     * @return vmLocalIdNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVmLocalIdNotStartsWith() {
        return vmLocalIdNotStartsWith;
    }

    public void setVmLocalIdNotStartsWith(String vmLocalIdNotStartsWith) {
        this.vmLocalIdNotStartsWith = vmLocalIdNotStartsWith;
    }

    public ReplicationRestorePointWhereInput vmLocalIdNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_LOCAL_ID_NOT_STARTS_WITH);
        return this;
    }

    public ReplicationRestorePointWhereInput vmLocalIdNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_LOCAL_ID_NOT_STARTS_WITH);
        return this;
    }

    public void setVmLocalIdNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_LOCAL_ID_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_LOCAL_ID_NOT_STARTS_WITH);
        }
    }

    public boolean getVmLocalIdNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_LOCAL_ID_NOT_STARTS_WITH);
    }

    public ReplicationRestorePointWhereInput vmLocalIdStartsWith(String vmLocalIdStartsWith) {

        this.vmLocalIdStartsWith = vmLocalIdStartsWith;
        return this;
    }

    /**
     * Get vmLocalIdStartsWith
     *
     * @return vmLocalIdStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVmLocalIdStartsWith() {
        return vmLocalIdStartsWith;
    }

    public void setVmLocalIdStartsWith(String vmLocalIdStartsWith) {
        this.vmLocalIdStartsWith = vmLocalIdStartsWith;
    }

    public ReplicationRestorePointWhereInput vmLocalIdStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_LOCAL_ID_STARTS_WITH);
        return this;
    }

    public ReplicationRestorePointWhereInput vmLocalIdStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_LOCAL_ID_STARTS_WITH);
        return this;
    }

    public void setVmLocalIdStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_LOCAL_ID_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_LOCAL_ID_STARTS_WITH);
        }
    }

    public boolean getVmLocalIdStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_LOCAL_ID_STARTS_WITH);
    }

    public ReplicationRestorePointWhereInput vmName(String vmName) {

        this.vmName = vmName;
        return this;
    }

    /**
     * Get vmName
     *
     * @return vmName
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVmName() {
        return vmName;
    }

    public void setVmName(String vmName) {
        this.vmName = vmName;
    }

    public ReplicationRestorePointWhereInput vmName_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_NAME);
        return this;
    }

    public ReplicationRestorePointWhereInput vmName_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_NAME);
        return this;
    }

    public void setVmName_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_NAME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_NAME);
        }
    }

    public boolean getVmName_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_NAME);
    }

    public ReplicationRestorePointWhereInput vmNameContains(String vmNameContains) {

        this.vmNameContains = vmNameContains;
        return this;
    }

    /**
     * Get vmNameContains
     *
     * @return vmNameContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVmNameContains() {
        return vmNameContains;
    }

    public void setVmNameContains(String vmNameContains) {
        this.vmNameContains = vmNameContains;
    }

    public ReplicationRestorePointWhereInput vmNameContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_NAME_CONTAINS);
        return this;
    }

    public ReplicationRestorePointWhereInput vmNameContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_NAME_CONTAINS);
        return this;
    }

    public void setVmNameContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_NAME_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_NAME_CONTAINS);
        }
    }

    public boolean getVmNameContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_NAME_CONTAINS);
    }

    public ReplicationRestorePointWhereInput vmNameEndsWith(String vmNameEndsWith) {

        this.vmNameEndsWith = vmNameEndsWith;
        return this;
    }

    /**
     * Get vmNameEndsWith
     *
     * @return vmNameEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVmNameEndsWith() {
        return vmNameEndsWith;
    }

    public void setVmNameEndsWith(String vmNameEndsWith) {
        this.vmNameEndsWith = vmNameEndsWith;
    }

    public ReplicationRestorePointWhereInput vmNameEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_NAME_ENDS_WITH);
        return this;
    }

    public ReplicationRestorePointWhereInput vmNameEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_NAME_ENDS_WITH);
        return this;
    }

    public void setVmNameEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_NAME_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_NAME_ENDS_WITH);
        }
    }

    public boolean getVmNameEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_NAME_ENDS_WITH);
    }

    public ReplicationRestorePointWhereInput vmNameGt(String vmNameGt) {

        this.vmNameGt = vmNameGt;
        return this;
    }

    /**
     * Get vmNameGt
     *
     * @return vmNameGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVmNameGt() {
        return vmNameGt;
    }

    public void setVmNameGt(String vmNameGt) {
        this.vmNameGt = vmNameGt;
    }

    public ReplicationRestorePointWhereInput vmNameGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_NAME_GT);
        return this;
    }

    public ReplicationRestorePointWhereInput vmNameGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_NAME_GT);
        return this;
    }

    public void setVmNameGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_NAME_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_NAME_GT);
        }
    }

    public boolean getVmNameGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_NAME_GT);
    }

    public ReplicationRestorePointWhereInput vmNameGte(String vmNameGte) {

        this.vmNameGte = vmNameGte;
        return this;
    }

    /**
     * Get vmNameGte
     *
     * @return vmNameGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVmNameGte() {
        return vmNameGte;
    }

    public void setVmNameGte(String vmNameGte) {
        this.vmNameGte = vmNameGte;
    }

    public ReplicationRestorePointWhereInput vmNameGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_NAME_GTE);
        return this;
    }

    public ReplicationRestorePointWhereInput vmNameGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_NAME_GTE);
        return this;
    }

    public void setVmNameGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_NAME_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_NAME_GTE);
        }
    }

    public boolean getVmNameGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_NAME_GTE);
    }

    public ReplicationRestorePointWhereInput vmNameIn(List<String> vmNameIn) {

        this.vmNameIn = vmNameIn;
        return this;
    }

    public ReplicationRestorePointWhereInput addVmNameInItem(String vmNameInItem) {
        if (this.vmNameIn == null) {
            this.vmNameIn = new ArrayList<String>();
        }
        this.vmNameIn.add(vmNameInItem);
        return this;
    }

    /**
     * Get vmNameIn
     *
     * @return vmNameIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getVmNameIn() {
        return vmNameIn;
    }

    public void setVmNameIn(List<String> vmNameIn) {
        this.vmNameIn = vmNameIn;
    }

    public ReplicationRestorePointWhereInput vmNameIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_NAME_IN);
        return this;
    }

    public ReplicationRestorePointWhereInput vmNameIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_NAME_IN);
        return this;
    }

    public void setVmNameIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_NAME_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_NAME_IN);
        }
    }

    public boolean getVmNameIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_NAME_IN);
    }

    public ReplicationRestorePointWhereInput vmNameLt(String vmNameLt) {

        this.vmNameLt = vmNameLt;
        return this;
    }

    /**
     * Get vmNameLt
     *
     * @return vmNameLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVmNameLt() {
        return vmNameLt;
    }

    public void setVmNameLt(String vmNameLt) {
        this.vmNameLt = vmNameLt;
    }

    public ReplicationRestorePointWhereInput vmNameLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_NAME_LT);
        return this;
    }

    public ReplicationRestorePointWhereInput vmNameLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_NAME_LT);
        return this;
    }

    public void setVmNameLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_NAME_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_NAME_LT);
        }
    }

    public boolean getVmNameLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_NAME_LT);
    }

    public ReplicationRestorePointWhereInput vmNameLte(String vmNameLte) {

        this.vmNameLte = vmNameLte;
        return this;
    }

    /**
     * Get vmNameLte
     *
     * @return vmNameLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVmNameLte() {
        return vmNameLte;
    }

    public void setVmNameLte(String vmNameLte) {
        this.vmNameLte = vmNameLte;
    }

    public ReplicationRestorePointWhereInput vmNameLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_NAME_LTE);
        return this;
    }

    public ReplicationRestorePointWhereInput vmNameLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_NAME_LTE);
        return this;
    }

    public void setVmNameLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_NAME_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_NAME_LTE);
        }
    }

    public boolean getVmNameLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_NAME_LTE);
    }

    public ReplicationRestorePointWhereInput vmNameNot(String vmNameNot) {

        this.vmNameNot = vmNameNot;
        return this;
    }

    /**
     * Get vmNameNot
     *
     * @return vmNameNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVmNameNot() {
        return vmNameNot;
    }

    public void setVmNameNot(String vmNameNot) {
        this.vmNameNot = vmNameNot;
    }

    public ReplicationRestorePointWhereInput vmNameNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_NAME_NOT);
        return this;
    }

    public ReplicationRestorePointWhereInput vmNameNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_NAME_NOT);
        return this;
    }

    public void setVmNameNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_NAME_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_NAME_NOT);
        }
    }

    public boolean getVmNameNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_NAME_NOT);
    }

    public ReplicationRestorePointWhereInput vmNameNotContains(String vmNameNotContains) {

        this.vmNameNotContains = vmNameNotContains;
        return this;
    }

    /**
     * Get vmNameNotContains
     *
     * @return vmNameNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVmNameNotContains() {
        return vmNameNotContains;
    }

    public void setVmNameNotContains(String vmNameNotContains) {
        this.vmNameNotContains = vmNameNotContains;
    }

    public ReplicationRestorePointWhereInput vmNameNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_NAME_NOT_CONTAINS);
        return this;
    }

    public ReplicationRestorePointWhereInput vmNameNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_NAME_NOT_CONTAINS);
        return this;
    }

    public void setVmNameNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_NAME_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_NAME_NOT_CONTAINS);
        }
    }

    public boolean getVmNameNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_NAME_NOT_CONTAINS);
    }

    public ReplicationRestorePointWhereInput vmNameNotEndsWith(String vmNameNotEndsWith) {

        this.vmNameNotEndsWith = vmNameNotEndsWith;
        return this;
    }

    /**
     * Get vmNameNotEndsWith
     *
     * @return vmNameNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVmNameNotEndsWith() {
        return vmNameNotEndsWith;
    }

    public void setVmNameNotEndsWith(String vmNameNotEndsWith) {
        this.vmNameNotEndsWith = vmNameNotEndsWith;
    }

    public ReplicationRestorePointWhereInput vmNameNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_NAME_NOT_ENDS_WITH);
        return this;
    }

    public ReplicationRestorePointWhereInput vmNameNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_NAME_NOT_ENDS_WITH);
        return this;
    }

    public void setVmNameNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_NAME_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_NAME_NOT_ENDS_WITH);
        }
    }

    public boolean getVmNameNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_NAME_NOT_ENDS_WITH);
    }

    public ReplicationRestorePointWhereInput vmNameNotIn(List<String> vmNameNotIn) {

        this.vmNameNotIn = vmNameNotIn;
        return this;
    }

    public ReplicationRestorePointWhereInput addVmNameNotInItem(String vmNameNotInItem) {
        if (this.vmNameNotIn == null) {
            this.vmNameNotIn = new ArrayList<String>();
        }
        this.vmNameNotIn.add(vmNameNotInItem);
        return this;
    }

    /**
     * Get vmNameNotIn
     *
     * @return vmNameNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getVmNameNotIn() {
        return vmNameNotIn;
    }

    public void setVmNameNotIn(List<String> vmNameNotIn) {
        this.vmNameNotIn = vmNameNotIn;
    }

    public ReplicationRestorePointWhereInput vmNameNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_NAME_NOT_IN);
        return this;
    }

    public ReplicationRestorePointWhereInput vmNameNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_NAME_NOT_IN);
        return this;
    }

    public void setVmNameNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_NAME_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_NAME_NOT_IN);
        }
    }

    public boolean getVmNameNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_NAME_NOT_IN);
    }

    public ReplicationRestorePointWhereInput vmNameNotStartsWith(String vmNameNotStartsWith) {

        this.vmNameNotStartsWith = vmNameNotStartsWith;
        return this;
    }

    /**
     * Get vmNameNotStartsWith
     *
     * @return vmNameNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVmNameNotStartsWith() {
        return vmNameNotStartsWith;
    }

    public void setVmNameNotStartsWith(String vmNameNotStartsWith) {
        this.vmNameNotStartsWith = vmNameNotStartsWith;
    }

    public ReplicationRestorePointWhereInput vmNameNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_NAME_NOT_STARTS_WITH);
        return this;
    }

    public ReplicationRestorePointWhereInput vmNameNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_NAME_NOT_STARTS_WITH);
        return this;
    }

    public void setVmNameNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_NAME_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_NAME_NOT_STARTS_WITH);
        }
    }

    public boolean getVmNameNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_NAME_NOT_STARTS_WITH);
    }

    public ReplicationRestorePointWhereInput vmNameStartsWith(String vmNameStartsWith) {

        this.vmNameStartsWith = vmNameStartsWith;
        return this;
    }

    /**
     * Get vmNameStartsWith
     *
     * @return vmNameStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVmNameStartsWith() {
        return vmNameStartsWith;
    }

    public void setVmNameStartsWith(String vmNameStartsWith) {
        this.vmNameStartsWith = vmNameStartsWith;
    }

    public ReplicationRestorePointWhereInput vmNameStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_NAME_STARTS_WITH);
        return this;
    }

    public ReplicationRestorePointWhereInput vmNameStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VM_NAME_STARTS_WITH);
        return this;
    }

    public void setVmNameStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VM_NAME_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VM_NAME_STARTS_WITH);
        }
    }

    public boolean getVmNameStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VM_NAME_STARTS_WITH);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReplicationRestorePointWhereInput replicationRestorePointWhereInput =
                (ReplicationRestorePointWhereInput) o;
        return Objects.equals(this.AND, replicationRestorePointWhereInput.AND)
                && Objects.equals(this.NOT, replicationRestorePointWhereInput.NOT)
                && Objects.equals(this.OR, replicationRestorePointWhereInput.OR)
                && Objects.equals(
                        this.clusterLocalId, replicationRestorePointWhereInput.clusterLocalId)
                && Objects.equals(
                        this.clusterLocalIdContains,
                        replicationRestorePointWhereInput.clusterLocalIdContains)
                && Objects.equals(
                        this.clusterLocalIdEndsWith,
                        replicationRestorePointWhereInput.clusterLocalIdEndsWith)
                && Objects.equals(
                        this.clusterLocalIdGt, replicationRestorePointWhereInput.clusterLocalIdGt)
                && Objects.equals(
                        this.clusterLocalIdGte, replicationRestorePointWhereInput.clusterLocalIdGte)
                && Objects.equals(
                        this.clusterLocalIdIn, replicationRestorePointWhereInput.clusterLocalIdIn)
                && Objects.equals(
                        this.clusterLocalIdLt, replicationRestorePointWhereInput.clusterLocalIdLt)
                && Objects.equals(
                        this.clusterLocalIdLte, replicationRestorePointWhereInput.clusterLocalIdLte)
                && Objects.equals(
                        this.clusterLocalIdNot, replicationRestorePointWhereInput.clusterLocalIdNot)
                && Objects.equals(
                        this.clusterLocalIdNotContains,
                        replicationRestorePointWhereInput.clusterLocalIdNotContains)
                && Objects.equals(
                        this.clusterLocalIdNotEndsWith,
                        replicationRestorePointWhereInput.clusterLocalIdNotEndsWith)
                && Objects.equals(
                        this.clusterLocalIdNotIn,
                        replicationRestorePointWhereInput.clusterLocalIdNotIn)
                && Objects.equals(
                        this.clusterLocalIdNotStartsWith,
                        replicationRestorePointWhereInput.clusterLocalIdNotStartsWith)
                && Objects.equals(
                        this.clusterLocalIdStartsWith,
                        replicationRestorePointWhereInput.clusterLocalIdStartsWith)
                && Objects.equals(this.creation, replicationRestorePointWhereInput.creation)
                && Objects.equals(this.creationIn, replicationRestorePointWhereInput.creationIn)
                && Objects.equals(this.creationNot, replicationRestorePointWhereInput.creationNot)
                && Objects.equals(
                        this.creationNotIn, replicationRestorePointWhereInput.creationNotIn)
                && Objects.equals(this.dedup, replicationRestorePointWhereInput.dedup)
                && Objects.equals(this.dedupIn, replicationRestorePointWhereInput.dedupIn)
                && Objects.equals(this.dedupNot, replicationRestorePointWhereInput.dedupNot)
                && Objects.equals(this.dedupNotIn, replicationRestorePointWhereInput.dedupNotIn)
                && Objects.equals(
                        this.entityAsyncStatus, replicationRestorePointWhereInput.entityAsyncStatus)
                && Objects.equals(
                        this.entityAsyncStatusIn,
                        replicationRestorePointWhereInput.entityAsyncStatusIn)
                && Objects.equals(
                        this.entityAsyncStatusNot,
                        replicationRestorePointWhereInput.entityAsyncStatusNot)
                && Objects.equals(
                        this.entityAsyncStatusNotIn,
                        replicationRestorePointWhereInput.entityAsyncStatusNotIn)
                && Objects.equals(
                        this.failoverExecutionsEvery,
                        replicationRestorePointWhereInput.failoverExecutionsEvery)
                && Objects.equals(
                        this.failoverExecutionsNone,
                        replicationRestorePointWhereInput.failoverExecutionsNone)
                && Objects.equals(
                        this.failoverExecutionsSome,
                        replicationRestorePointWhereInput.failoverExecutionsSome)
                && Objects.equals(this.id, replicationRestorePointWhereInput.id)
                && Objects.equals(this.idContains, replicationRestorePointWhereInput.idContains)
                && Objects.equals(this.idEndsWith, replicationRestorePointWhereInput.idEndsWith)
                && Objects.equals(this.idGt, replicationRestorePointWhereInput.idGt)
                && Objects.equals(this.idGte, replicationRestorePointWhereInput.idGte)
                && Objects.equals(this.idIn, replicationRestorePointWhereInput.idIn)
                && Objects.equals(this.idLt, replicationRestorePointWhereInput.idLt)
                && Objects.equals(this.idLte, replicationRestorePointWhereInput.idLte)
                && Objects.equals(this.idNot, replicationRestorePointWhereInput.idNot)
                && Objects.equals(
                        this.idNotContains, replicationRestorePointWhereInput.idNotContains)
                && Objects.equals(
                        this.idNotEndsWith, replicationRestorePointWhereInput.idNotEndsWith)
                && Objects.equals(this.idNotIn, replicationRestorePointWhereInput.idNotIn)
                && Objects.equals(
                        this.idNotStartsWith, replicationRestorePointWhereInput.idNotStartsWith)
                && Objects.equals(this.idStartsWith, replicationRestorePointWhereInput.idStartsWith)
                && Objects.equals(this.iscsiLun, replicationRestorePointWhereInput.iscsiLun)
                && Objects.equals(
                        this.localCreatedAt, replicationRestorePointWhereInput.localCreatedAt)
                && Objects.equals(
                        this.localCreatedAtGt, replicationRestorePointWhereInput.localCreatedAtGt)
                && Objects.equals(
                        this.localCreatedAtGte, replicationRestorePointWhereInput.localCreatedAtGte)
                && Objects.equals(
                        this.localCreatedAtIn, replicationRestorePointWhereInput.localCreatedAtIn)
                && Objects.equals(
                        this.localCreatedAtLt, replicationRestorePointWhereInput.localCreatedAtLt)
                && Objects.equals(
                        this.localCreatedAtLte, replicationRestorePointWhereInput.localCreatedAtLte)
                && Objects.equals(
                        this.localCreatedAtNot, replicationRestorePointWhereInput.localCreatedAtNot)
                && Objects.equals(
                        this.localCreatedAtNotIn,
                        replicationRestorePointWhereInput.localCreatedAtNotIn)
                && Objects.equals(this.localId, replicationRestorePointWhereInput.localId)
                && Objects.equals(
                        this.localIdContains, replicationRestorePointWhereInput.localIdContains)
                && Objects.equals(
                        this.localIdEndsWith, replicationRestorePointWhereInput.localIdEndsWith)
                && Objects.equals(this.localIdGt, replicationRestorePointWhereInput.localIdGt)
                && Objects.equals(this.localIdGte, replicationRestorePointWhereInput.localIdGte)
                && Objects.equals(this.localIdIn, replicationRestorePointWhereInput.localIdIn)
                && Objects.equals(this.localIdLt, replicationRestorePointWhereInput.localIdLt)
                && Objects.equals(this.localIdLte, replicationRestorePointWhereInput.localIdLte)
                && Objects.equals(this.localIdNot, replicationRestorePointWhereInput.localIdNot)
                && Objects.equals(
                        this.localIdNotContains,
                        replicationRestorePointWhereInput.localIdNotContains)
                && Objects.equals(
                        this.localIdNotEndsWith,
                        replicationRestorePointWhereInput.localIdNotEndsWith)
                && Objects.equals(this.localIdNotIn, replicationRestorePointWhereInput.localIdNotIn)
                && Objects.equals(
                        this.localIdNotStartsWith,
                        replicationRestorePointWhereInput.localIdNotStartsWith)
                && Objects.equals(
                        this.localIdStartsWith, replicationRestorePointWhereInput.localIdStartsWith)
                && Objects.equals(
                        this.parentRestorePoint,
                        replicationRestorePointWhereInput.parentRestorePoint)
                && Objects.equals(
                        this.parentRestorePointContains,
                        replicationRestorePointWhereInput.parentRestorePointContains)
                && Objects.equals(
                        this.parentRestorePointEndsWith,
                        replicationRestorePointWhereInput.parentRestorePointEndsWith)
                && Objects.equals(
                        this.parentRestorePointGt,
                        replicationRestorePointWhereInput.parentRestorePointGt)
                && Objects.equals(
                        this.parentRestorePointGte,
                        replicationRestorePointWhereInput.parentRestorePointGte)
                && Objects.equals(
                        this.parentRestorePointIn,
                        replicationRestorePointWhereInput.parentRestorePointIn)
                && Objects.equals(
                        this.parentRestorePointLt,
                        replicationRestorePointWhereInput.parentRestorePointLt)
                && Objects.equals(
                        this.parentRestorePointLte,
                        replicationRestorePointWhereInput.parentRestorePointLte)
                && Objects.equals(
                        this.parentRestorePointNot,
                        replicationRestorePointWhereInput.parentRestorePointNot)
                && Objects.equals(
                        this.parentRestorePointNotContains,
                        replicationRestorePointWhereInput.parentRestorePointNotContains)
                && Objects.equals(
                        this.parentRestorePointNotEndsWith,
                        replicationRestorePointWhereInput.parentRestorePointNotEndsWith)
                && Objects.equals(
                        this.parentRestorePointNotIn,
                        replicationRestorePointWhereInput.parentRestorePointNotIn)
                && Objects.equals(
                        this.parentRestorePointNotStartsWith,
                        replicationRestorePointWhereInput.parentRestorePointNotStartsWith)
                && Objects.equals(
                        this.parentRestorePointStartsWith,
                        replicationRestorePointWhereInput.parentRestorePointStartsWith)
                && Objects.equals(this.replicaVm, replicationRestorePointWhereInput.replicaVm)
                && Objects.equals(
                        this.replicationPlan, replicationRestorePointWhereInput.replicationPlan)
                && Objects.equals(
                        this.replicationService,
                        replicationRestorePointWhereInput.replicationService)
                && Objects.equals(
                        this.replicationTargetExecution,
                        replicationRestorePointWhereInput.replicationTargetExecution)
                && Objects.equals(
                        this.resourceVersion, replicationRestorePointWhereInput.resourceVersion)
                && Objects.equals(
                        this.resourceVersionGt, replicationRestorePointWhereInput.resourceVersionGt)
                && Objects.equals(
                        this.resourceVersionGte,
                        replicationRestorePointWhereInput.resourceVersionGte)
                && Objects.equals(
                        this.resourceVersionIn, replicationRestorePointWhereInput.resourceVersionIn)
                && Objects.equals(
                        this.resourceVersionLt, replicationRestorePointWhereInput.resourceVersionLt)
                && Objects.equals(
                        this.resourceVersionLte,
                        replicationRestorePointWhereInput.resourceVersionLte)
                && Objects.equals(
                        this.resourceVersionNot,
                        replicationRestorePointWhereInput.resourceVersionNot)
                && Objects.equals(
                        this.resourceVersionNotIn,
                        replicationRestorePointWhereInput.resourceVersionNotIn)
                && Objects.equals(this.slice, replicationRestorePointWhereInput.slice)
                && Objects.equals(
                        this.sliceContains, replicationRestorePointWhereInput.sliceContains)
                && Objects.equals(
                        this.sliceEndsWith, replicationRestorePointWhereInput.sliceEndsWith)
                && Objects.equals(this.sliceGt, replicationRestorePointWhereInput.sliceGt)
                && Objects.equals(this.sliceGte, replicationRestorePointWhereInput.sliceGte)
                && Objects.equals(this.sliceIn, replicationRestorePointWhereInput.sliceIn)
                && Objects.equals(this.sliceLt, replicationRestorePointWhereInput.sliceLt)
                && Objects.equals(this.sliceLte, replicationRestorePointWhereInput.sliceLte)
                && Objects.equals(this.sliceNot, replicationRestorePointWhereInput.sliceNot)
                && Objects.equals(
                        this.sliceNotContains, replicationRestorePointWhereInput.sliceNotContains)
                && Objects.equals(
                        this.sliceNotEndsWith, replicationRestorePointWhereInput.sliceNotEndsWith)
                && Objects.equals(this.sliceNotIn, replicationRestorePointWhereInput.sliceNotIn)
                && Objects.equals(
                        this.sliceNotStartsWith,
                        replicationRestorePointWhereInput.sliceNotStartsWith)
                && Objects.equals(
                        this.sliceStartsWith, replicationRestorePointWhereInput.sliceStartsWith)
                && Objects.equals(
                        this.snapshotConsistentType,
                        replicationRestorePointWhereInput.snapshotConsistentType)
                && Objects.equals(
                        this.snapshotConsistentTypeIn,
                        replicationRestorePointWhereInput.snapshotConsistentTypeIn)
                && Objects.equals(
                        this.snapshotConsistentTypeNot,
                        replicationRestorePointWhereInput.snapshotConsistentTypeNot)
                && Objects.equals(
                        this.snapshotConsistentTypeNotIn,
                        replicationRestorePointWhereInput.snapshotConsistentTypeNotIn)
                && Objects.equals(
                        this.syncReplicationPlan,
                        replicationRestorePointWhereInput.syncReplicationPlan)
                && Objects.equals(
                        this.towerDeployId, replicationRestorePointWhereInput.towerDeployId)
                && Objects.equals(
                        this.towerDeployIdContains,
                        replicationRestorePointWhereInput.towerDeployIdContains)
                && Objects.equals(
                        this.towerDeployIdEndsWith,
                        replicationRestorePointWhereInput.towerDeployIdEndsWith)
                && Objects.equals(
                        this.towerDeployIdGt, replicationRestorePointWhereInput.towerDeployIdGt)
                && Objects.equals(
                        this.towerDeployIdGte, replicationRestorePointWhereInput.towerDeployIdGte)
                && Objects.equals(
                        this.towerDeployIdIn, replicationRestorePointWhereInput.towerDeployIdIn)
                && Objects.equals(
                        this.towerDeployIdLt, replicationRestorePointWhereInput.towerDeployIdLt)
                && Objects.equals(
                        this.towerDeployIdLte, replicationRestorePointWhereInput.towerDeployIdLte)
                && Objects.equals(
                        this.towerDeployIdNot, replicationRestorePointWhereInput.towerDeployIdNot)
                && Objects.equals(
                        this.towerDeployIdNotContains,
                        replicationRestorePointWhereInput.towerDeployIdNotContains)
                && Objects.equals(
                        this.towerDeployIdNotEndsWith,
                        replicationRestorePointWhereInput.towerDeployIdNotEndsWith)
                && Objects.equals(
                        this.towerDeployIdNotIn,
                        replicationRestorePointWhereInput.towerDeployIdNotIn)
                && Objects.equals(
                        this.towerDeployIdNotStartsWith,
                        replicationRestorePointWhereInput.towerDeployIdNotStartsWith)
                && Objects.equals(
                        this.towerDeployIdStartsWith,
                        replicationRestorePointWhereInput.towerDeployIdStartsWith)
                && Objects.equals(this.type, replicationRestorePointWhereInput.type)
                && Objects.equals(this.typeIn, replicationRestorePointWhereInput.typeIn)
                && Objects.equals(this.typeNot, replicationRestorePointWhereInput.typeNot)
                && Objects.equals(this.typeNotIn, replicationRestorePointWhereInput.typeNotIn)
                && Objects.equals(this.vm, replicationRestorePointWhereInput.vm)
                && Objects.equals(this.vmLocalId, replicationRestorePointWhereInput.vmLocalId)
                && Objects.equals(
                        this.vmLocalIdContains, replicationRestorePointWhereInput.vmLocalIdContains)
                && Objects.equals(
                        this.vmLocalIdEndsWith, replicationRestorePointWhereInput.vmLocalIdEndsWith)
                && Objects.equals(this.vmLocalIdGt, replicationRestorePointWhereInput.vmLocalIdGt)
                && Objects.equals(this.vmLocalIdGte, replicationRestorePointWhereInput.vmLocalIdGte)
                && Objects.equals(this.vmLocalIdIn, replicationRestorePointWhereInput.vmLocalIdIn)
                && Objects.equals(this.vmLocalIdLt, replicationRestorePointWhereInput.vmLocalIdLt)
                && Objects.equals(this.vmLocalIdLte, replicationRestorePointWhereInput.vmLocalIdLte)
                && Objects.equals(this.vmLocalIdNot, replicationRestorePointWhereInput.vmLocalIdNot)
                && Objects.equals(
                        this.vmLocalIdNotContains,
                        replicationRestorePointWhereInput.vmLocalIdNotContains)
                && Objects.equals(
                        this.vmLocalIdNotEndsWith,
                        replicationRestorePointWhereInput.vmLocalIdNotEndsWith)
                && Objects.equals(
                        this.vmLocalIdNotIn, replicationRestorePointWhereInput.vmLocalIdNotIn)
                && Objects.equals(
                        this.vmLocalIdNotStartsWith,
                        replicationRestorePointWhereInput.vmLocalIdNotStartsWith)
                && Objects.equals(
                        this.vmLocalIdStartsWith,
                        replicationRestorePointWhereInput.vmLocalIdStartsWith)
                && Objects.equals(this.vmName, replicationRestorePointWhereInput.vmName)
                && Objects.equals(
                        this.vmNameContains, replicationRestorePointWhereInput.vmNameContains)
                && Objects.equals(
                        this.vmNameEndsWith, replicationRestorePointWhereInput.vmNameEndsWith)
                && Objects.equals(this.vmNameGt, replicationRestorePointWhereInput.vmNameGt)
                && Objects.equals(this.vmNameGte, replicationRestorePointWhereInput.vmNameGte)
                && Objects.equals(this.vmNameIn, replicationRestorePointWhereInput.vmNameIn)
                && Objects.equals(this.vmNameLt, replicationRestorePointWhereInput.vmNameLt)
                && Objects.equals(this.vmNameLte, replicationRestorePointWhereInput.vmNameLte)
                && Objects.equals(this.vmNameNot, replicationRestorePointWhereInput.vmNameNot)
                && Objects.equals(
                        this.vmNameNotContains, replicationRestorePointWhereInput.vmNameNotContains)
                && Objects.equals(
                        this.vmNameNotEndsWith, replicationRestorePointWhereInput.vmNameNotEndsWith)
                && Objects.equals(this.vmNameNotIn, replicationRestorePointWhereInput.vmNameNotIn)
                && Objects.equals(
                        this.vmNameNotStartsWith,
                        replicationRestorePointWhereInput.vmNameNotStartsWith)
                && Objects.equals(
                        this.vmNameStartsWith, replicationRestorePointWhereInput.vmNameStartsWith);
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
                AND,
                NOT,
                OR,
                clusterLocalId,
                clusterLocalIdContains,
                clusterLocalIdEndsWith,
                clusterLocalIdGt,
                clusterLocalIdGte,
                clusterLocalIdIn,
                clusterLocalIdLt,
                clusterLocalIdLte,
                clusterLocalIdNot,
                clusterLocalIdNotContains,
                clusterLocalIdNotEndsWith,
                clusterLocalIdNotIn,
                clusterLocalIdNotStartsWith,
                clusterLocalIdStartsWith,
                creation,
                creationIn,
                creationNot,
                creationNotIn,
                dedup,
                dedupIn,
                dedupNot,
                dedupNotIn,
                entityAsyncStatus,
                entityAsyncStatusIn,
                entityAsyncStatusNot,
                entityAsyncStatusNotIn,
                failoverExecutionsEvery,
                failoverExecutionsNone,
                failoverExecutionsSome,
                id,
                idContains,
                idEndsWith,
                idGt,
                idGte,
                idIn,
                idLt,
                idLte,
                idNot,
                idNotContains,
                idNotEndsWith,
                idNotIn,
                idNotStartsWith,
                idStartsWith,
                iscsiLun,
                localCreatedAt,
                localCreatedAtGt,
                localCreatedAtGte,
                localCreatedAtIn,
                localCreatedAtLt,
                localCreatedAtLte,
                localCreatedAtNot,
                localCreatedAtNotIn,
                localId,
                localIdContains,
                localIdEndsWith,
                localIdGt,
                localIdGte,
                localIdIn,
                localIdLt,
                localIdLte,
                localIdNot,
                localIdNotContains,
                localIdNotEndsWith,
                localIdNotIn,
                localIdNotStartsWith,
                localIdStartsWith,
                parentRestorePoint,
                parentRestorePointContains,
                parentRestorePointEndsWith,
                parentRestorePointGt,
                parentRestorePointGte,
                parentRestorePointIn,
                parentRestorePointLt,
                parentRestorePointLte,
                parentRestorePointNot,
                parentRestorePointNotContains,
                parentRestorePointNotEndsWith,
                parentRestorePointNotIn,
                parentRestorePointNotStartsWith,
                parentRestorePointStartsWith,
                replicaVm,
                replicationPlan,
                replicationService,
                replicationTargetExecution,
                resourceVersion,
                resourceVersionGt,
                resourceVersionGte,
                resourceVersionIn,
                resourceVersionLt,
                resourceVersionLte,
                resourceVersionNot,
                resourceVersionNotIn,
                slice,
                sliceContains,
                sliceEndsWith,
                sliceGt,
                sliceGte,
                sliceIn,
                sliceLt,
                sliceLte,
                sliceNot,
                sliceNotContains,
                sliceNotEndsWith,
                sliceNotIn,
                sliceNotStartsWith,
                sliceStartsWith,
                snapshotConsistentType,
                snapshotConsistentTypeIn,
                snapshotConsistentTypeNot,
                snapshotConsistentTypeNotIn,
                syncReplicationPlan,
                towerDeployId,
                towerDeployIdContains,
                towerDeployIdEndsWith,
                towerDeployIdGt,
                towerDeployIdGte,
                towerDeployIdIn,
                towerDeployIdLt,
                towerDeployIdLte,
                towerDeployIdNot,
                towerDeployIdNotContains,
                towerDeployIdNotEndsWith,
                towerDeployIdNotIn,
                towerDeployIdNotStartsWith,
                towerDeployIdStartsWith,
                type,
                typeIn,
                typeNot,
                typeNotIn,
                vm,
                vmLocalId,
                vmLocalIdContains,
                vmLocalIdEndsWith,
                vmLocalIdGt,
                vmLocalIdGte,
                vmLocalIdIn,
                vmLocalIdLt,
                vmLocalIdLte,
                vmLocalIdNot,
                vmLocalIdNotContains,
                vmLocalIdNotEndsWith,
                vmLocalIdNotIn,
                vmLocalIdNotStartsWith,
                vmLocalIdStartsWith,
                vmName,
                vmNameContains,
                vmNameEndsWith,
                vmNameGt,
                vmNameGte,
                vmNameIn,
                vmNameLt,
                vmNameLte,
                vmNameNot,
                vmNameNotContains,
                vmNameNotEndsWith,
                vmNameNotIn,
                vmNameNotStartsWith,
                vmNameStartsWith);
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
        sb.append("class ReplicationRestorePointWhereInput {\n");
        sb.append("    AND: ").append(toIndentedString(AND)).append("\n");
        sb.append("    NOT: ").append(toIndentedString(NOT)).append("\n");
        sb.append("    OR: ").append(toIndentedString(OR)).append("\n");
        sb.append("    clusterLocalId: ").append(toIndentedString(clusterLocalId)).append("\n");
        sb.append("    clusterLocalIdContains: ")
                .append(toIndentedString(clusterLocalIdContains))
                .append("\n");
        sb.append("    clusterLocalIdEndsWith: ")
                .append(toIndentedString(clusterLocalIdEndsWith))
                .append("\n");
        sb.append("    clusterLocalIdGt: ").append(toIndentedString(clusterLocalIdGt)).append("\n");
        sb.append("    clusterLocalIdGte: ")
                .append(toIndentedString(clusterLocalIdGte))
                .append("\n");
        sb.append("    clusterLocalIdIn: ").append(toIndentedString(clusterLocalIdIn)).append("\n");
        sb.append("    clusterLocalIdLt: ").append(toIndentedString(clusterLocalIdLt)).append("\n");
        sb.append("    clusterLocalIdLte: ")
                .append(toIndentedString(clusterLocalIdLte))
                .append("\n");
        sb.append("    clusterLocalIdNot: ")
                .append(toIndentedString(clusterLocalIdNot))
                .append("\n");
        sb.append("    clusterLocalIdNotContains: ")
                .append(toIndentedString(clusterLocalIdNotContains))
                .append("\n");
        sb.append("    clusterLocalIdNotEndsWith: ")
                .append(toIndentedString(clusterLocalIdNotEndsWith))
                .append("\n");
        sb.append("    clusterLocalIdNotIn: ")
                .append(toIndentedString(clusterLocalIdNotIn))
                .append("\n");
        sb.append("    clusterLocalIdNotStartsWith: ")
                .append(toIndentedString(clusterLocalIdNotStartsWith))
                .append("\n");
        sb.append("    clusterLocalIdStartsWith: ")
                .append(toIndentedString(clusterLocalIdStartsWith))
                .append("\n");
        sb.append("    creation: ").append(toIndentedString(creation)).append("\n");
        sb.append("    creationIn: ").append(toIndentedString(creationIn)).append("\n");
        sb.append("    creationNot: ").append(toIndentedString(creationNot)).append("\n");
        sb.append("    creationNotIn: ").append(toIndentedString(creationNotIn)).append("\n");
        sb.append("    dedup: ").append(toIndentedString(dedup)).append("\n");
        sb.append("    dedupIn: ").append(toIndentedString(dedupIn)).append("\n");
        sb.append("    dedupNot: ").append(toIndentedString(dedupNot)).append("\n");
        sb.append("    dedupNotIn: ").append(toIndentedString(dedupNotIn)).append("\n");
        sb.append("    entityAsyncStatus: ")
                .append(toIndentedString(entityAsyncStatus))
                .append("\n");
        sb.append("    entityAsyncStatusIn: ")
                .append(toIndentedString(entityAsyncStatusIn))
                .append("\n");
        sb.append("    entityAsyncStatusNot: ")
                .append(toIndentedString(entityAsyncStatusNot))
                .append("\n");
        sb.append("    entityAsyncStatusNotIn: ")
                .append(toIndentedString(entityAsyncStatusNotIn))
                .append("\n");
        sb.append("    failoverExecutionsEvery: ")
                .append(toIndentedString(failoverExecutionsEvery))
                .append("\n");
        sb.append("    failoverExecutionsNone: ")
                .append(toIndentedString(failoverExecutionsNone))
                .append("\n");
        sb.append("    failoverExecutionsSome: ")
                .append(toIndentedString(failoverExecutionsSome))
                .append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    idContains: ").append(toIndentedString(idContains)).append("\n");
        sb.append("    idEndsWith: ").append(toIndentedString(idEndsWith)).append("\n");
        sb.append("    idGt: ").append(toIndentedString(idGt)).append("\n");
        sb.append("    idGte: ").append(toIndentedString(idGte)).append("\n");
        sb.append("    idIn: ").append(toIndentedString(idIn)).append("\n");
        sb.append("    idLt: ").append(toIndentedString(idLt)).append("\n");
        sb.append("    idLte: ").append(toIndentedString(idLte)).append("\n");
        sb.append("    idNot: ").append(toIndentedString(idNot)).append("\n");
        sb.append("    idNotContains: ").append(toIndentedString(idNotContains)).append("\n");
        sb.append("    idNotEndsWith: ").append(toIndentedString(idNotEndsWith)).append("\n");
        sb.append("    idNotIn: ").append(toIndentedString(idNotIn)).append("\n");
        sb.append("    idNotStartsWith: ").append(toIndentedString(idNotStartsWith)).append("\n");
        sb.append("    idStartsWith: ").append(toIndentedString(idStartsWith)).append("\n");
        sb.append("    iscsiLun: ").append(toIndentedString(iscsiLun)).append("\n");
        sb.append("    localCreatedAt: ").append(toIndentedString(localCreatedAt)).append("\n");
        sb.append("    localCreatedAtGt: ").append(toIndentedString(localCreatedAtGt)).append("\n");
        sb.append("    localCreatedAtGte: ")
                .append(toIndentedString(localCreatedAtGte))
                .append("\n");
        sb.append("    localCreatedAtIn: ").append(toIndentedString(localCreatedAtIn)).append("\n");
        sb.append("    localCreatedAtLt: ").append(toIndentedString(localCreatedAtLt)).append("\n");
        sb.append("    localCreatedAtLte: ")
                .append(toIndentedString(localCreatedAtLte))
                .append("\n");
        sb.append("    localCreatedAtNot: ")
                .append(toIndentedString(localCreatedAtNot))
                .append("\n");
        sb.append("    localCreatedAtNotIn: ")
                .append(toIndentedString(localCreatedAtNotIn))
                .append("\n");
        sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
        sb.append("    localIdContains: ").append(toIndentedString(localIdContains)).append("\n");
        sb.append("    localIdEndsWith: ").append(toIndentedString(localIdEndsWith)).append("\n");
        sb.append("    localIdGt: ").append(toIndentedString(localIdGt)).append("\n");
        sb.append("    localIdGte: ").append(toIndentedString(localIdGte)).append("\n");
        sb.append("    localIdIn: ").append(toIndentedString(localIdIn)).append("\n");
        sb.append("    localIdLt: ").append(toIndentedString(localIdLt)).append("\n");
        sb.append("    localIdLte: ").append(toIndentedString(localIdLte)).append("\n");
        sb.append("    localIdNot: ").append(toIndentedString(localIdNot)).append("\n");
        sb.append("    localIdNotContains: ")
                .append(toIndentedString(localIdNotContains))
                .append("\n");
        sb.append("    localIdNotEndsWith: ")
                .append(toIndentedString(localIdNotEndsWith))
                .append("\n");
        sb.append("    localIdNotIn: ").append(toIndentedString(localIdNotIn)).append("\n");
        sb.append("    localIdNotStartsWith: ")
                .append(toIndentedString(localIdNotStartsWith))
                .append("\n");
        sb.append("    localIdStartsWith: ")
                .append(toIndentedString(localIdStartsWith))
                .append("\n");
        sb.append("    parentRestorePoint: ")
                .append(toIndentedString(parentRestorePoint))
                .append("\n");
        sb.append("    parentRestorePointContains: ")
                .append(toIndentedString(parentRestorePointContains))
                .append("\n");
        sb.append("    parentRestorePointEndsWith: ")
                .append(toIndentedString(parentRestorePointEndsWith))
                .append("\n");
        sb.append("    parentRestorePointGt: ")
                .append(toIndentedString(parentRestorePointGt))
                .append("\n");
        sb.append("    parentRestorePointGte: ")
                .append(toIndentedString(parentRestorePointGte))
                .append("\n");
        sb.append("    parentRestorePointIn: ")
                .append(toIndentedString(parentRestorePointIn))
                .append("\n");
        sb.append("    parentRestorePointLt: ")
                .append(toIndentedString(parentRestorePointLt))
                .append("\n");
        sb.append("    parentRestorePointLte: ")
                .append(toIndentedString(parentRestorePointLte))
                .append("\n");
        sb.append("    parentRestorePointNot: ")
                .append(toIndentedString(parentRestorePointNot))
                .append("\n");
        sb.append("    parentRestorePointNotContains: ")
                .append(toIndentedString(parentRestorePointNotContains))
                .append("\n");
        sb.append("    parentRestorePointNotEndsWith: ")
                .append(toIndentedString(parentRestorePointNotEndsWith))
                .append("\n");
        sb.append("    parentRestorePointNotIn: ")
                .append(toIndentedString(parentRestorePointNotIn))
                .append("\n");
        sb.append("    parentRestorePointNotStartsWith: ")
                .append(toIndentedString(parentRestorePointNotStartsWith))
                .append("\n");
        sb.append("    parentRestorePointStartsWith: ")
                .append(toIndentedString(parentRestorePointStartsWith))
                .append("\n");
        sb.append("    replicaVm: ").append(toIndentedString(replicaVm)).append("\n");
        sb.append("    replicationPlan: ").append(toIndentedString(replicationPlan)).append("\n");
        sb.append("    replicationService: ")
                .append(toIndentedString(replicationService))
                .append("\n");
        sb.append("    replicationTargetExecution: ")
                .append(toIndentedString(replicationTargetExecution))
                .append("\n");
        sb.append("    resourceVersion: ").append(toIndentedString(resourceVersion)).append("\n");
        sb.append("    resourceVersionGt: ")
                .append(toIndentedString(resourceVersionGt))
                .append("\n");
        sb.append("    resourceVersionGte: ")
                .append(toIndentedString(resourceVersionGte))
                .append("\n");
        sb.append("    resourceVersionIn: ")
                .append(toIndentedString(resourceVersionIn))
                .append("\n");
        sb.append("    resourceVersionLt: ")
                .append(toIndentedString(resourceVersionLt))
                .append("\n");
        sb.append("    resourceVersionLte: ")
                .append(toIndentedString(resourceVersionLte))
                .append("\n");
        sb.append("    resourceVersionNot: ")
                .append(toIndentedString(resourceVersionNot))
                .append("\n");
        sb.append("    resourceVersionNotIn: ")
                .append(toIndentedString(resourceVersionNotIn))
                .append("\n");
        sb.append("    slice: ").append(toIndentedString(slice)).append("\n");
        sb.append("    sliceContains: ").append(toIndentedString(sliceContains)).append("\n");
        sb.append("    sliceEndsWith: ").append(toIndentedString(sliceEndsWith)).append("\n");
        sb.append("    sliceGt: ").append(toIndentedString(sliceGt)).append("\n");
        sb.append("    sliceGte: ").append(toIndentedString(sliceGte)).append("\n");
        sb.append("    sliceIn: ").append(toIndentedString(sliceIn)).append("\n");
        sb.append("    sliceLt: ").append(toIndentedString(sliceLt)).append("\n");
        sb.append("    sliceLte: ").append(toIndentedString(sliceLte)).append("\n");
        sb.append("    sliceNot: ").append(toIndentedString(sliceNot)).append("\n");
        sb.append("    sliceNotContains: ").append(toIndentedString(sliceNotContains)).append("\n");
        sb.append("    sliceNotEndsWith: ").append(toIndentedString(sliceNotEndsWith)).append("\n");
        sb.append("    sliceNotIn: ").append(toIndentedString(sliceNotIn)).append("\n");
        sb.append("    sliceNotStartsWith: ")
                .append(toIndentedString(sliceNotStartsWith))
                .append("\n");
        sb.append("    sliceStartsWith: ").append(toIndentedString(sliceStartsWith)).append("\n");
        sb.append("    snapshotConsistentType: ")
                .append(toIndentedString(snapshotConsistentType))
                .append("\n");
        sb.append("    snapshotConsistentTypeIn: ")
                .append(toIndentedString(snapshotConsistentTypeIn))
                .append("\n");
        sb.append("    snapshotConsistentTypeNot: ")
                .append(toIndentedString(snapshotConsistentTypeNot))
                .append("\n");
        sb.append("    snapshotConsistentTypeNotIn: ")
                .append(toIndentedString(snapshotConsistentTypeNotIn))
                .append("\n");
        sb.append("    syncReplicationPlan: ")
                .append(toIndentedString(syncReplicationPlan))
                .append("\n");
        sb.append("    towerDeployId: ").append(toIndentedString(towerDeployId)).append("\n");
        sb.append("    towerDeployIdContains: ")
                .append(toIndentedString(towerDeployIdContains))
                .append("\n");
        sb.append("    towerDeployIdEndsWith: ")
                .append(toIndentedString(towerDeployIdEndsWith))
                .append("\n");
        sb.append("    towerDeployIdGt: ").append(toIndentedString(towerDeployIdGt)).append("\n");
        sb.append("    towerDeployIdGte: ").append(toIndentedString(towerDeployIdGte)).append("\n");
        sb.append("    towerDeployIdIn: ").append(toIndentedString(towerDeployIdIn)).append("\n");
        sb.append("    towerDeployIdLt: ").append(toIndentedString(towerDeployIdLt)).append("\n");
        sb.append("    towerDeployIdLte: ").append(toIndentedString(towerDeployIdLte)).append("\n");
        sb.append("    towerDeployIdNot: ").append(toIndentedString(towerDeployIdNot)).append("\n");
        sb.append("    towerDeployIdNotContains: ")
                .append(toIndentedString(towerDeployIdNotContains))
                .append("\n");
        sb.append("    towerDeployIdNotEndsWith: ")
                .append(toIndentedString(towerDeployIdNotEndsWith))
                .append("\n");
        sb.append("    towerDeployIdNotIn: ")
                .append(toIndentedString(towerDeployIdNotIn))
                .append("\n");
        sb.append("    towerDeployIdNotStartsWith: ")
                .append(toIndentedString(towerDeployIdNotStartsWith))
                .append("\n");
        sb.append("    towerDeployIdStartsWith: ")
                .append(toIndentedString(towerDeployIdStartsWith))
                .append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    typeIn: ").append(toIndentedString(typeIn)).append("\n");
        sb.append("    typeNot: ").append(toIndentedString(typeNot)).append("\n");
        sb.append("    typeNotIn: ").append(toIndentedString(typeNotIn)).append("\n");
        sb.append("    vm: ").append(toIndentedString(vm)).append("\n");
        sb.append("    vmLocalId: ").append(toIndentedString(vmLocalId)).append("\n");
        sb.append("    vmLocalIdContains: ")
                .append(toIndentedString(vmLocalIdContains))
                .append("\n");
        sb.append("    vmLocalIdEndsWith: ")
                .append(toIndentedString(vmLocalIdEndsWith))
                .append("\n");
        sb.append("    vmLocalIdGt: ").append(toIndentedString(vmLocalIdGt)).append("\n");
        sb.append("    vmLocalIdGte: ").append(toIndentedString(vmLocalIdGte)).append("\n");
        sb.append("    vmLocalIdIn: ").append(toIndentedString(vmLocalIdIn)).append("\n");
        sb.append("    vmLocalIdLt: ").append(toIndentedString(vmLocalIdLt)).append("\n");
        sb.append("    vmLocalIdLte: ").append(toIndentedString(vmLocalIdLte)).append("\n");
        sb.append("    vmLocalIdNot: ").append(toIndentedString(vmLocalIdNot)).append("\n");
        sb.append("    vmLocalIdNotContains: ")
                .append(toIndentedString(vmLocalIdNotContains))
                .append("\n");
        sb.append("    vmLocalIdNotEndsWith: ")
                .append(toIndentedString(vmLocalIdNotEndsWith))
                .append("\n");
        sb.append("    vmLocalIdNotIn: ").append(toIndentedString(vmLocalIdNotIn)).append("\n");
        sb.append("    vmLocalIdNotStartsWith: ")
                .append(toIndentedString(vmLocalIdNotStartsWith))
                .append("\n");
        sb.append("    vmLocalIdStartsWith: ")
                .append(toIndentedString(vmLocalIdStartsWith))
                .append("\n");
        sb.append("    vmName: ").append(toIndentedString(vmName)).append("\n");
        sb.append("    vmNameContains: ").append(toIndentedString(vmNameContains)).append("\n");
        sb.append("    vmNameEndsWith: ").append(toIndentedString(vmNameEndsWith)).append("\n");
        sb.append("    vmNameGt: ").append(toIndentedString(vmNameGt)).append("\n");
        sb.append("    vmNameGte: ").append(toIndentedString(vmNameGte)).append("\n");
        sb.append("    vmNameIn: ").append(toIndentedString(vmNameIn)).append("\n");
        sb.append("    vmNameLt: ").append(toIndentedString(vmNameLt)).append("\n");
        sb.append("    vmNameLte: ").append(toIndentedString(vmNameLte)).append("\n");
        sb.append("    vmNameNot: ").append(toIndentedString(vmNameNot)).append("\n");
        sb.append("    vmNameNotContains: ")
                .append(toIndentedString(vmNameNotContains))
                .append("\n");
        sb.append("    vmNameNotEndsWith: ")
                .append(toIndentedString(vmNameNotEndsWith))
                .append("\n");
        sb.append("    vmNameNotIn: ").append(toIndentedString(vmNameNotIn)).append("\n");
        sb.append("    vmNameNotStartsWith: ")
                .append(toIndentedString(vmNameNotStartsWith))
                .append("\n");
        sb.append("    vmNameStartsWith: ").append(toIndentedString(vmNameStartsWith)).append("\n");
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

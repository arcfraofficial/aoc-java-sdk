package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** BackupRestorePointWhereInput */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class BackupRestorePointWhereInput
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_A_N_D = "AND";

    @SerializedName(SERIALIZED_NAME_A_N_D)
    private List<BackupRestorePointWhereInput> AND = null;

    public static final String SERIALIZED_NAME_N_O_T = "NOT";

    @SerializedName(SERIALIZED_NAME_N_O_T)
    private List<BackupRestorePointWhereInput> NOT = null;

    public static final String SERIALIZED_NAME_O_R = "OR";

    @SerializedName(SERIALIZED_NAME_O_R)
    private List<BackupRestorePointWhereInput> OR = null;

    public static final String SERIALIZED_NAME_BACKUP_PLAN = "backup_plan";

    @SerializedName(SERIALIZED_NAME_BACKUP_PLAN)
    private BackupPlanWhereInput backupPlan;

    public static final String SERIALIZED_NAME_BACKUP_RESTORE_EXECUTIONS_EVERY =
            "backup_restore_executions_every";

    @SerializedName(SERIALIZED_NAME_BACKUP_RESTORE_EXECUTIONS_EVERY)
    private BackupRestoreExecutionWhereInput backupRestoreExecutionsEvery;

    public static final String SERIALIZED_NAME_BACKUP_RESTORE_EXECUTIONS_NONE =
            "backup_restore_executions_none";

    @SerializedName(SERIALIZED_NAME_BACKUP_RESTORE_EXECUTIONS_NONE)
    private BackupRestoreExecutionWhereInput backupRestoreExecutionsNone;

    public static final String SERIALIZED_NAME_BACKUP_RESTORE_EXECUTIONS_SOME =
            "backup_restore_executions_some";

    @SerializedName(SERIALIZED_NAME_BACKUP_RESTORE_EXECUTIONS_SOME)
    private BackupRestoreExecutionWhereInput backupRestoreExecutionsSome;

    public static final String SERIALIZED_NAME_BACKUP_TARGET_EXECUTION = "backup_target_execution";

    @SerializedName(SERIALIZED_NAME_BACKUP_TARGET_EXECUTION)
    private BackupTargetExecutionWhereInput backupTargetExecution;

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

    public static final String SERIALIZED_NAME_COMPRESSED = "compressed";

    @SerializedName(SERIALIZED_NAME_COMPRESSED)
    private Boolean compressed;

    public static final String SERIALIZED_NAME_COMPRESSED_NOT = "compressed_not";

    @SerializedName(SERIALIZED_NAME_COMPRESSED_NOT)
    private Boolean compressedNot;

    public static final String SERIALIZED_NAME_COMPRESSION_RATIO = "compression_ratio";

    @SerializedName(SERIALIZED_NAME_COMPRESSION_RATIO)
    private Double compressionRatio;

    public static final String SERIALIZED_NAME_COMPRESSION_RATIO_GT = "compression_ratio_gt";

    @SerializedName(SERIALIZED_NAME_COMPRESSION_RATIO_GT)
    private Double compressionRatioGt;

    public static final String SERIALIZED_NAME_COMPRESSION_RATIO_GTE = "compression_ratio_gte";

    @SerializedName(SERIALIZED_NAME_COMPRESSION_RATIO_GTE)
    private Double compressionRatioGte;

    public static final String SERIALIZED_NAME_COMPRESSION_RATIO_IN = "compression_ratio_in";

    @SerializedName(SERIALIZED_NAME_COMPRESSION_RATIO_IN)
    private List<Double> compressionRatioIn = null;

    public static final String SERIALIZED_NAME_COMPRESSION_RATIO_LT = "compression_ratio_lt";

    @SerializedName(SERIALIZED_NAME_COMPRESSION_RATIO_LT)
    private Double compressionRatioLt;

    public static final String SERIALIZED_NAME_COMPRESSION_RATIO_LTE = "compression_ratio_lte";

    @SerializedName(SERIALIZED_NAME_COMPRESSION_RATIO_LTE)
    private Double compressionRatioLte;

    public static final String SERIALIZED_NAME_COMPRESSION_RATIO_NOT = "compression_ratio_not";

    @SerializedName(SERIALIZED_NAME_COMPRESSION_RATIO_NOT)
    private Double compressionRatioNot;

    public static final String SERIALIZED_NAME_COMPRESSION_RATIO_NOT_IN =
            "compression_ratio_not_in";

    @SerializedName(SERIALIZED_NAME_COMPRESSION_RATIO_NOT_IN)
    private List<Double> compressionRatioNotIn = null;

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

    public static final String SERIALIZED_NAME_LOGICAL_SIZE = "logical_size";

    @SerializedName(SERIALIZED_NAME_LOGICAL_SIZE)
    private Long logicalSize;

    public static final String SERIALIZED_NAME_LOGICAL_SIZE_GT = "logical_size_gt";

    @SerializedName(SERIALIZED_NAME_LOGICAL_SIZE_GT)
    private Long logicalSizeGt;

    public static final String SERIALIZED_NAME_LOGICAL_SIZE_GTE = "logical_size_gte";

    @SerializedName(SERIALIZED_NAME_LOGICAL_SIZE_GTE)
    private Long logicalSizeGte;

    public static final String SERIALIZED_NAME_LOGICAL_SIZE_IN = "logical_size_in";

    @SerializedName(SERIALIZED_NAME_LOGICAL_SIZE_IN)
    private List<Long> logicalSizeIn = null;

    public static final String SERIALIZED_NAME_LOGICAL_SIZE_LT = "logical_size_lt";

    @SerializedName(SERIALIZED_NAME_LOGICAL_SIZE_LT)
    private Long logicalSizeLt;

    public static final String SERIALIZED_NAME_LOGICAL_SIZE_LTE = "logical_size_lte";

    @SerializedName(SERIALIZED_NAME_LOGICAL_SIZE_LTE)
    private Long logicalSizeLte;

    public static final String SERIALIZED_NAME_LOGICAL_SIZE_NOT = "logical_size_not";

    @SerializedName(SERIALIZED_NAME_LOGICAL_SIZE_NOT)
    private Long logicalSizeNot;

    public static final String SERIALIZED_NAME_LOGICAL_SIZE_NOT_IN = "logical_size_not_in";

    @SerializedName(SERIALIZED_NAME_LOGICAL_SIZE_NOT_IN)
    private List<Long> logicalSizeNotIn = null;

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

    public static final String SERIALIZED_NAME_PHYSICAL_SIZE = "physical_size";

    @SerializedName(SERIALIZED_NAME_PHYSICAL_SIZE)
    private Long physicalSize;

    public static final String SERIALIZED_NAME_PHYSICAL_SIZE_GT = "physical_size_gt";

    @SerializedName(SERIALIZED_NAME_PHYSICAL_SIZE_GT)
    private Long physicalSizeGt;

    public static final String SERIALIZED_NAME_PHYSICAL_SIZE_GTE = "physical_size_gte";

    @SerializedName(SERIALIZED_NAME_PHYSICAL_SIZE_GTE)
    private Long physicalSizeGte;

    public static final String SERIALIZED_NAME_PHYSICAL_SIZE_IN = "physical_size_in";

    @SerializedName(SERIALIZED_NAME_PHYSICAL_SIZE_IN)
    private List<Long> physicalSizeIn = null;

    public static final String SERIALIZED_NAME_PHYSICAL_SIZE_LT = "physical_size_lt";

    @SerializedName(SERIALIZED_NAME_PHYSICAL_SIZE_LT)
    private Long physicalSizeLt;

    public static final String SERIALIZED_NAME_PHYSICAL_SIZE_LTE = "physical_size_lte";

    @SerializedName(SERIALIZED_NAME_PHYSICAL_SIZE_LTE)
    private Long physicalSizeLte;

    public static final String SERIALIZED_NAME_PHYSICAL_SIZE_NOT = "physical_size_not";

    @SerializedName(SERIALIZED_NAME_PHYSICAL_SIZE_NOT)
    private Long physicalSizeNot;

    public static final String SERIALIZED_NAME_PHYSICAL_SIZE_NOT_IN = "physical_size_not_in";

    @SerializedName(SERIALIZED_NAME_PHYSICAL_SIZE_NOT_IN)
    private List<Long> physicalSizeNotIn = null;

    public static final String SERIALIZED_NAME_SIZE = "size";

    @SerializedName(SERIALIZED_NAME_SIZE)
    private Long size;

    public static final String SERIALIZED_NAME_SIZE_GT = "size_gt";

    @SerializedName(SERIALIZED_NAME_SIZE_GT)
    private Long sizeGt;

    public static final String SERIALIZED_NAME_SIZE_GTE = "size_gte";

    @SerializedName(SERIALIZED_NAME_SIZE_GTE)
    private Long sizeGte;

    public static final String SERIALIZED_NAME_SIZE_IN = "size_in";

    @SerializedName(SERIALIZED_NAME_SIZE_IN)
    private List<Long> sizeIn = null;

    public static final String SERIALIZED_NAME_SIZE_LT = "size_lt";

    @SerializedName(SERIALIZED_NAME_SIZE_LT)
    private Long sizeLt;

    public static final String SERIALIZED_NAME_SIZE_LTE = "size_lte";

    @SerializedName(SERIALIZED_NAME_SIZE_LTE)
    private Long sizeLte;

    public static final String SERIALIZED_NAME_SIZE_NOT = "size_not";

    @SerializedName(SERIALIZED_NAME_SIZE_NOT)
    private Long sizeNot;

    public static final String SERIALIZED_NAME_SIZE_NOT_IN = "size_not_in";

    @SerializedName(SERIALIZED_NAME_SIZE_NOT_IN)
    private List<Long> sizeNotIn = null;

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

    public static final String SERIALIZED_NAME_VALID_CAPACITY = "valid_capacity";

    @SerializedName(SERIALIZED_NAME_VALID_CAPACITY)
    private Long validCapacity;

    public static final String SERIALIZED_NAME_VALID_CAPACITY_GT = "valid_capacity_gt";

    @SerializedName(SERIALIZED_NAME_VALID_CAPACITY_GT)
    private Long validCapacityGt;

    public static final String SERIALIZED_NAME_VALID_CAPACITY_GTE = "valid_capacity_gte";

    @SerializedName(SERIALIZED_NAME_VALID_CAPACITY_GTE)
    private Long validCapacityGte;

    public static final String SERIALIZED_NAME_VALID_CAPACITY_IN = "valid_capacity_in";

    @SerializedName(SERIALIZED_NAME_VALID_CAPACITY_IN)
    private List<Long> validCapacityIn = null;

    public static final String SERIALIZED_NAME_VALID_CAPACITY_LT = "valid_capacity_lt";

    @SerializedName(SERIALIZED_NAME_VALID_CAPACITY_LT)
    private Long validCapacityLt;

    public static final String SERIALIZED_NAME_VALID_CAPACITY_LTE = "valid_capacity_lte";

    @SerializedName(SERIALIZED_NAME_VALID_CAPACITY_LTE)
    private Long validCapacityLte;

    public static final String SERIALIZED_NAME_VALID_CAPACITY_NOT = "valid_capacity_not";

    @SerializedName(SERIALIZED_NAME_VALID_CAPACITY_NOT)
    private Long validCapacityNot;

    public static final String SERIALIZED_NAME_VALID_CAPACITY_NOT_IN = "valid_capacity_not_in";

    @SerializedName(SERIALIZED_NAME_VALID_CAPACITY_NOT_IN)
    private List<Long> validCapacityNotIn = null;

    public static final String SERIALIZED_NAME_VALID_SIZE = "valid_size";

    @SerializedName(SERIALIZED_NAME_VALID_SIZE)
    private Long validSize;

    public static final String SERIALIZED_NAME_VALID_SIZE_GT = "valid_size_gt";

    @SerializedName(SERIALIZED_NAME_VALID_SIZE_GT)
    private Long validSizeGt;

    public static final String SERIALIZED_NAME_VALID_SIZE_GTE = "valid_size_gte";

    @SerializedName(SERIALIZED_NAME_VALID_SIZE_GTE)
    private Long validSizeGte;

    public static final String SERIALIZED_NAME_VALID_SIZE_IN = "valid_size_in";

    @SerializedName(SERIALIZED_NAME_VALID_SIZE_IN)
    private List<Long> validSizeIn = null;

    public static final String SERIALIZED_NAME_VALID_SIZE_LT = "valid_size_lt";

    @SerializedName(SERIALIZED_NAME_VALID_SIZE_LT)
    private Long validSizeLt;

    public static final String SERIALIZED_NAME_VALID_SIZE_LTE = "valid_size_lte";

    @SerializedName(SERIALIZED_NAME_VALID_SIZE_LTE)
    private Long validSizeLte;

    public static final String SERIALIZED_NAME_VALID_SIZE_NOT = "valid_size_not";

    @SerializedName(SERIALIZED_NAME_VALID_SIZE_NOT)
    private Long validSizeNot;

    public static final String SERIALIZED_NAME_VALID_SIZE_NOT_IN = "valid_size_not_in";

    @SerializedName(SERIALIZED_NAME_VALID_SIZE_NOT_IN)
    private List<Long> validSizeNotIn = null;

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

    public BackupRestorePointWhereInput() {}

    public BackupRestorePointWhereInput AND(List<BackupRestorePointWhereInput> AND) {

        this.AND = AND;
        return this;
    }

    public BackupRestorePointWhereInput addANDItem(BackupRestorePointWhereInput ANDItem) {
        if (this.AND == null) {
            this.AND = new ArrayList<BackupRestorePointWhereInput>();
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
    public List<BackupRestorePointWhereInput> getAND() {
        return AND;
    }

    public void setAND(List<BackupRestorePointWhereInput> AND) {
        this.AND = AND;
    }

    public BackupRestorePointWhereInput AND_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_A_N_D);
        return this;
    }

    public BackupRestorePointWhereInput AND_ExplictlyNonNull() {
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

    public BackupRestorePointWhereInput NOT(List<BackupRestorePointWhereInput> NOT) {

        this.NOT = NOT;
        return this;
    }

    public BackupRestorePointWhereInput addNOTItem(BackupRestorePointWhereInput NOTItem) {
        if (this.NOT == null) {
            this.NOT = new ArrayList<BackupRestorePointWhereInput>();
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
    public List<BackupRestorePointWhereInput> getNOT() {
        return NOT;
    }

    public void setNOT(List<BackupRestorePointWhereInput> NOT) {
        this.NOT = NOT;
    }

    public BackupRestorePointWhereInput NOT_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_N_O_T);
        return this;
    }

    public BackupRestorePointWhereInput NOT_ExplictlyNonNull() {
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

    public BackupRestorePointWhereInput OR(List<BackupRestorePointWhereInput> OR) {

        this.OR = OR;
        return this;
    }

    public BackupRestorePointWhereInput addORItem(BackupRestorePointWhereInput ORItem) {
        if (this.OR == null) {
            this.OR = new ArrayList<BackupRestorePointWhereInput>();
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
    public List<BackupRestorePointWhereInput> getOR() {
        return OR;
    }

    public void setOR(List<BackupRestorePointWhereInput> OR) {
        this.OR = OR;
    }

    public BackupRestorePointWhereInput OR_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_O_R);
        return this;
    }

    public BackupRestorePointWhereInput OR_ExplictlyNonNull() {
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

    public BackupRestorePointWhereInput backupPlan(BackupPlanWhereInput backupPlan) {

        this.backupPlan = backupPlan;
        return this;
    }

    /**
     * Get backupPlan
     *
     * @return backupPlan
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public BackupPlanWhereInput getBackupPlan() {
        return backupPlan;
    }

    public void setBackupPlan(BackupPlanWhereInput backupPlan) {
        this.backupPlan = backupPlan;
    }

    public BackupRestorePointWhereInput backupPlan_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_PLAN);
        return this;
    }

    public BackupRestorePointWhereInput backupPlan_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_PLAN);
        return this;
    }

    public void setBackupPlan_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_PLAN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_PLAN);
        }
    }

    public boolean getBackupPlan_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_PLAN);
    }

    public BackupRestorePointWhereInput backupRestoreExecutionsEvery(
            BackupRestoreExecutionWhereInput backupRestoreExecutionsEvery) {

        this.backupRestoreExecutionsEvery = backupRestoreExecutionsEvery;
        return this;
    }

    /**
     * Get backupRestoreExecutionsEvery
     *
     * @return backupRestoreExecutionsEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public BackupRestoreExecutionWhereInput getBackupRestoreExecutionsEvery() {
        return backupRestoreExecutionsEvery;
    }

    public void setBackupRestoreExecutionsEvery(
            BackupRestoreExecutionWhereInput backupRestoreExecutionsEvery) {
        this.backupRestoreExecutionsEvery = backupRestoreExecutionsEvery;
    }

    public BackupRestorePointWhereInput backupRestoreExecutionsEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_RESTORE_EXECUTIONS_EVERY);
        return this;
    }

    public BackupRestorePointWhereInput backupRestoreExecutionsEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_RESTORE_EXECUTIONS_EVERY);
        return this;
    }

    public void setBackupRestoreExecutionsEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_RESTORE_EXECUTIONS_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_RESTORE_EXECUTIONS_EVERY);
        }
    }

    public boolean getBackupRestoreExecutionsEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_RESTORE_EXECUTIONS_EVERY);
    }

    public BackupRestorePointWhereInput backupRestoreExecutionsNone(
            BackupRestoreExecutionWhereInput backupRestoreExecutionsNone) {

        this.backupRestoreExecutionsNone = backupRestoreExecutionsNone;
        return this;
    }

    /**
     * Get backupRestoreExecutionsNone
     *
     * @return backupRestoreExecutionsNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public BackupRestoreExecutionWhereInput getBackupRestoreExecutionsNone() {
        return backupRestoreExecutionsNone;
    }

    public void setBackupRestoreExecutionsNone(
            BackupRestoreExecutionWhereInput backupRestoreExecutionsNone) {
        this.backupRestoreExecutionsNone = backupRestoreExecutionsNone;
    }

    public BackupRestorePointWhereInput backupRestoreExecutionsNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_RESTORE_EXECUTIONS_NONE);
        return this;
    }

    public BackupRestorePointWhereInput backupRestoreExecutionsNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_RESTORE_EXECUTIONS_NONE);
        return this;
    }

    public void setBackupRestoreExecutionsNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_RESTORE_EXECUTIONS_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_RESTORE_EXECUTIONS_NONE);
        }
    }

    public boolean getBackupRestoreExecutionsNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_RESTORE_EXECUTIONS_NONE);
    }

    public BackupRestorePointWhereInput backupRestoreExecutionsSome(
            BackupRestoreExecutionWhereInput backupRestoreExecutionsSome) {

        this.backupRestoreExecutionsSome = backupRestoreExecutionsSome;
        return this;
    }

    /**
     * Get backupRestoreExecutionsSome
     *
     * @return backupRestoreExecutionsSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public BackupRestoreExecutionWhereInput getBackupRestoreExecutionsSome() {
        return backupRestoreExecutionsSome;
    }

    public void setBackupRestoreExecutionsSome(
            BackupRestoreExecutionWhereInput backupRestoreExecutionsSome) {
        this.backupRestoreExecutionsSome = backupRestoreExecutionsSome;
    }

    public BackupRestorePointWhereInput backupRestoreExecutionsSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_RESTORE_EXECUTIONS_SOME);
        return this;
    }

    public BackupRestorePointWhereInput backupRestoreExecutionsSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_RESTORE_EXECUTIONS_SOME);
        return this;
    }

    public void setBackupRestoreExecutionsSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_RESTORE_EXECUTIONS_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_RESTORE_EXECUTIONS_SOME);
        }
    }

    public boolean getBackupRestoreExecutionsSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_RESTORE_EXECUTIONS_SOME);
    }

    public BackupRestorePointWhereInput backupTargetExecution(
            BackupTargetExecutionWhereInput backupTargetExecution) {

        this.backupTargetExecution = backupTargetExecution;
        return this;
    }

    /**
     * Get backupTargetExecution
     *
     * @return backupTargetExecution
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public BackupTargetExecutionWhereInput getBackupTargetExecution() {
        return backupTargetExecution;
    }

    public void setBackupTargetExecution(BackupTargetExecutionWhereInput backupTargetExecution) {
        this.backupTargetExecution = backupTargetExecution;
    }

    public BackupRestorePointWhereInput backupTargetExecution_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_BACKUP_TARGET_EXECUTION);
        return this;
    }

    public BackupRestorePointWhereInput backupTargetExecution_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_BACKUP_TARGET_EXECUTION);
        return this;
    }

    public void setBackupTargetExecution_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_BACKUP_TARGET_EXECUTION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_BACKUP_TARGET_EXECUTION);
        }
    }

    public boolean getBackupTargetExecution_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_BACKUP_TARGET_EXECUTION);
    }

    public BackupRestorePointWhereInput clusterLocalId(String clusterLocalId) {

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

    public BackupRestorePointWhereInput clusterLocalId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID);
        return this;
    }

    public BackupRestorePointWhereInput clusterLocalId_ExplictlyNonNull() {
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

    public BackupRestorePointWhereInput clusterLocalIdContains(String clusterLocalIdContains) {

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

    public BackupRestorePointWhereInput clusterLocalIdContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID_CONTAINS);
        return this;
    }

    public BackupRestorePointWhereInput clusterLocalIdContains_ExplictlyNonNull() {
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

    public BackupRestorePointWhereInput clusterLocalIdEndsWith(String clusterLocalIdEndsWith) {

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

    public BackupRestorePointWhereInput clusterLocalIdEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID_ENDS_WITH);
        return this;
    }

    public BackupRestorePointWhereInput clusterLocalIdEndsWith_ExplictlyNonNull() {
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

    public BackupRestorePointWhereInput clusterLocalIdGt(String clusterLocalIdGt) {

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

    public BackupRestorePointWhereInput clusterLocalIdGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID_GT);
        return this;
    }

    public BackupRestorePointWhereInput clusterLocalIdGt_ExplictlyNonNull() {
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

    public BackupRestorePointWhereInput clusterLocalIdGte(String clusterLocalIdGte) {

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

    public BackupRestorePointWhereInput clusterLocalIdGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID_GTE);
        return this;
    }

    public BackupRestorePointWhereInput clusterLocalIdGte_ExplictlyNonNull() {
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

    public BackupRestorePointWhereInput clusterLocalIdIn(List<String> clusterLocalIdIn) {

        this.clusterLocalIdIn = clusterLocalIdIn;
        return this;
    }

    public BackupRestorePointWhereInput addClusterLocalIdInItem(String clusterLocalIdInItem) {
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

    public BackupRestorePointWhereInput clusterLocalIdIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID_IN);
        return this;
    }

    public BackupRestorePointWhereInput clusterLocalIdIn_ExplictlyNonNull() {
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

    public BackupRestorePointWhereInput clusterLocalIdLt(String clusterLocalIdLt) {

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

    public BackupRestorePointWhereInput clusterLocalIdLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID_LT);
        return this;
    }

    public BackupRestorePointWhereInput clusterLocalIdLt_ExplictlyNonNull() {
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

    public BackupRestorePointWhereInput clusterLocalIdLte(String clusterLocalIdLte) {

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

    public BackupRestorePointWhereInput clusterLocalIdLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID_LTE);
        return this;
    }

    public BackupRestorePointWhereInput clusterLocalIdLte_ExplictlyNonNull() {
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

    public BackupRestorePointWhereInput clusterLocalIdNot(String clusterLocalIdNot) {

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

    public BackupRestorePointWhereInput clusterLocalIdNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT);
        return this;
    }

    public BackupRestorePointWhereInput clusterLocalIdNot_ExplictlyNonNull() {
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

    public BackupRestorePointWhereInput clusterLocalIdNotContains(
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

    public BackupRestorePointWhereInput clusterLocalIdNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT_CONTAINS);
        return this;
    }

    public BackupRestorePointWhereInput clusterLocalIdNotContains_ExplictlyNonNull() {
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

    public BackupRestorePointWhereInput clusterLocalIdNotEndsWith(
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

    public BackupRestorePointWhereInput clusterLocalIdNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT_ENDS_WITH);
        return this;
    }

    public BackupRestorePointWhereInput clusterLocalIdNotEndsWith_ExplictlyNonNull() {
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

    public BackupRestorePointWhereInput clusterLocalIdNotIn(List<String> clusterLocalIdNotIn) {

        this.clusterLocalIdNotIn = clusterLocalIdNotIn;
        return this;
    }

    public BackupRestorePointWhereInput addClusterLocalIdNotInItem(String clusterLocalIdNotInItem) {
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

    public BackupRestorePointWhereInput clusterLocalIdNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT_IN);
        return this;
    }

    public BackupRestorePointWhereInput clusterLocalIdNotIn_ExplictlyNonNull() {
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

    public BackupRestorePointWhereInput clusterLocalIdNotStartsWith(
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

    public BackupRestorePointWhereInput clusterLocalIdNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID_NOT_STARTS_WITH);
        return this;
    }

    public BackupRestorePointWhereInput clusterLocalIdNotStartsWith_ExplictlyNonNull() {
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

    public BackupRestorePointWhereInput clusterLocalIdStartsWith(String clusterLocalIdStartsWith) {

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

    public BackupRestorePointWhereInput clusterLocalIdStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER_LOCAL_ID_STARTS_WITH);
        return this;
    }

    public BackupRestorePointWhereInput clusterLocalIdStartsWith_ExplictlyNonNull() {
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

    public BackupRestorePointWhereInput compressed(Boolean compressed) {

        this.compressed = compressed;
        return this;
    }

    /**
     * Get compressed
     *
     * @return compressed
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getCompressed() {
        return compressed;
    }

    public void setCompressed(Boolean compressed) {
        this.compressed = compressed;
    }

    public BackupRestorePointWhereInput compressed_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_COMPRESSED);
        return this;
    }

    public BackupRestorePointWhereInput compressed_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_COMPRESSED);
        return this;
    }

    public void setCompressed_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_COMPRESSED);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_COMPRESSED);
        }
    }

    public boolean getCompressed_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_COMPRESSED);
    }

    public BackupRestorePointWhereInput compressedNot(Boolean compressedNot) {

        this.compressedNot = compressedNot;
        return this;
    }

    /**
     * Get compressedNot
     *
     * @return compressedNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getCompressedNot() {
        return compressedNot;
    }

    public void setCompressedNot(Boolean compressedNot) {
        this.compressedNot = compressedNot;
    }

    public BackupRestorePointWhereInput compressedNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_COMPRESSED_NOT);
        return this;
    }

    public BackupRestorePointWhereInput compressedNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_COMPRESSED_NOT);
        return this;
    }

    public void setCompressedNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_COMPRESSED_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_COMPRESSED_NOT);
        }
    }

    public boolean getCompressedNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_COMPRESSED_NOT);
    }

    public BackupRestorePointWhereInput compressionRatio(Double compressionRatio) {

        this.compressionRatio = compressionRatio;
        return this;
    }

    /**
     * Get compressionRatio
     *
     * @return compressionRatio
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getCompressionRatio() {
        return compressionRatio;
    }

    public void setCompressionRatio(Double compressionRatio) {
        this.compressionRatio = compressionRatio;
    }

    public BackupRestorePointWhereInput compressionRatio_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_COMPRESSION_RATIO);
        return this;
    }

    public BackupRestorePointWhereInput compressionRatio_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_COMPRESSION_RATIO);
        return this;
    }

    public void setCompressionRatio_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_COMPRESSION_RATIO);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_COMPRESSION_RATIO);
        }
    }

    public boolean getCompressionRatio_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_COMPRESSION_RATIO);
    }

    public BackupRestorePointWhereInput compressionRatioGt(Double compressionRatioGt) {

        this.compressionRatioGt = compressionRatioGt;
        return this;
    }

    /**
     * Get compressionRatioGt
     *
     * @return compressionRatioGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getCompressionRatioGt() {
        return compressionRatioGt;
    }

    public void setCompressionRatioGt(Double compressionRatioGt) {
        this.compressionRatioGt = compressionRatioGt;
    }

    public BackupRestorePointWhereInput compressionRatioGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_COMPRESSION_RATIO_GT);
        return this;
    }

    public BackupRestorePointWhereInput compressionRatioGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_COMPRESSION_RATIO_GT);
        return this;
    }

    public void setCompressionRatioGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_COMPRESSION_RATIO_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_COMPRESSION_RATIO_GT);
        }
    }

    public boolean getCompressionRatioGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_COMPRESSION_RATIO_GT);
    }

    public BackupRestorePointWhereInput compressionRatioGte(Double compressionRatioGte) {

        this.compressionRatioGte = compressionRatioGte;
        return this;
    }

    /**
     * Get compressionRatioGte
     *
     * @return compressionRatioGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getCompressionRatioGte() {
        return compressionRatioGte;
    }

    public void setCompressionRatioGte(Double compressionRatioGte) {
        this.compressionRatioGte = compressionRatioGte;
    }

    public BackupRestorePointWhereInput compressionRatioGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_COMPRESSION_RATIO_GTE);
        return this;
    }

    public BackupRestorePointWhereInput compressionRatioGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_COMPRESSION_RATIO_GTE);
        return this;
    }

    public void setCompressionRatioGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_COMPRESSION_RATIO_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_COMPRESSION_RATIO_GTE);
        }
    }

    public boolean getCompressionRatioGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_COMPRESSION_RATIO_GTE);
    }

    public BackupRestorePointWhereInput compressionRatioIn(List<Double> compressionRatioIn) {

        this.compressionRatioIn = compressionRatioIn;
        return this;
    }

    public BackupRestorePointWhereInput addCompressionRatioInItem(Double compressionRatioInItem) {
        if (this.compressionRatioIn == null) {
            this.compressionRatioIn = new ArrayList<Double>();
        }
        this.compressionRatioIn.add(compressionRatioInItem);
        return this;
    }

    /**
     * Get compressionRatioIn
     *
     * @return compressionRatioIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Double> getCompressionRatioIn() {
        return compressionRatioIn;
    }

    public void setCompressionRatioIn(List<Double> compressionRatioIn) {
        this.compressionRatioIn = compressionRatioIn;
    }

    public BackupRestorePointWhereInput compressionRatioIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_COMPRESSION_RATIO_IN);
        return this;
    }

    public BackupRestorePointWhereInput compressionRatioIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_COMPRESSION_RATIO_IN);
        return this;
    }

    public void setCompressionRatioIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_COMPRESSION_RATIO_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_COMPRESSION_RATIO_IN);
        }
    }

    public boolean getCompressionRatioIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_COMPRESSION_RATIO_IN);
    }

    public BackupRestorePointWhereInput compressionRatioLt(Double compressionRatioLt) {

        this.compressionRatioLt = compressionRatioLt;
        return this;
    }

    /**
     * Get compressionRatioLt
     *
     * @return compressionRatioLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getCompressionRatioLt() {
        return compressionRatioLt;
    }

    public void setCompressionRatioLt(Double compressionRatioLt) {
        this.compressionRatioLt = compressionRatioLt;
    }

    public BackupRestorePointWhereInput compressionRatioLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_COMPRESSION_RATIO_LT);
        return this;
    }

    public BackupRestorePointWhereInput compressionRatioLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_COMPRESSION_RATIO_LT);
        return this;
    }

    public void setCompressionRatioLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_COMPRESSION_RATIO_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_COMPRESSION_RATIO_LT);
        }
    }

    public boolean getCompressionRatioLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_COMPRESSION_RATIO_LT);
    }

    public BackupRestorePointWhereInput compressionRatioLte(Double compressionRatioLte) {

        this.compressionRatioLte = compressionRatioLte;
        return this;
    }

    /**
     * Get compressionRatioLte
     *
     * @return compressionRatioLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getCompressionRatioLte() {
        return compressionRatioLte;
    }

    public void setCompressionRatioLte(Double compressionRatioLte) {
        this.compressionRatioLte = compressionRatioLte;
    }

    public BackupRestorePointWhereInput compressionRatioLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_COMPRESSION_RATIO_LTE);
        return this;
    }

    public BackupRestorePointWhereInput compressionRatioLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_COMPRESSION_RATIO_LTE);
        return this;
    }

    public void setCompressionRatioLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_COMPRESSION_RATIO_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_COMPRESSION_RATIO_LTE);
        }
    }

    public boolean getCompressionRatioLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_COMPRESSION_RATIO_LTE);
    }

    public BackupRestorePointWhereInput compressionRatioNot(Double compressionRatioNot) {

        this.compressionRatioNot = compressionRatioNot;
        return this;
    }

    /**
     * Get compressionRatioNot
     *
     * @return compressionRatioNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getCompressionRatioNot() {
        return compressionRatioNot;
    }

    public void setCompressionRatioNot(Double compressionRatioNot) {
        this.compressionRatioNot = compressionRatioNot;
    }

    public BackupRestorePointWhereInput compressionRatioNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_COMPRESSION_RATIO_NOT);
        return this;
    }

    public BackupRestorePointWhereInput compressionRatioNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_COMPRESSION_RATIO_NOT);
        return this;
    }

    public void setCompressionRatioNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_COMPRESSION_RATIO_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_COMPRESSION_RATIO_NOT);
        }
    }

    public boolean getCompressionRatioNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_COMPRESSION_RATIO_NOT);
    }

    public BackupRestorePointWhereInput compressionRatioNotIn(List<Double> compressionRatioNotIn) {

        this.compressionRatioNotIn = compressionRatioNotIn;
        return this;
    }

    public BackupRestorePointWhereInput addCompressionRatioNotInItem(
            Double compressionRatioNotInItem) {
        if (this.compressionRatioNotIn == null) {
            this.compressionRatioNotIn = new ArrayList<Double>();
        }
        this.compressionRatioNotIn.add(compressionRatioNotInItem);
        return this;
    }

    /**
     * Get compressionRatioNotIn
     *
     * @return compressionRatioNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Double> getCompressionRatioNotIn() {
        return compressionRatioNotIn;
    }

    public void setCompressionRatioNotIn(List<Double> compressionRatioNotIn) {
        this.compressionRatioNotIn = compressionRatioNotIn;
    }

    public BackupRestorePointWhereInput compressionRatioNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_COMPRESSION_RATIO_NOT_IN);
        return this;
    }

    public BackupRestorePointWhereInput compressionRatioNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_COMPRESSION_RATIO_NOT_IN);
        return this;
    }

    public void setCompressionRatioNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_COMPRESSION_RATIO_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_COMPRESSION_RATIO_NOT_IN);
        }
    }

    public boolean getCompressionRatioNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_COMPRESSION_RATIO_NOT_IN);
    }

    public BackupRestorePointWhereInput creation(BackupRestorePointCreation creation) {

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

    public BackupRestorePointWhereInput creation_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATION);
        return this;
    }

    public BackupRestorePointWhereInput creation_ExplictlyNonNull() {
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

    public BackupRestorePointWhereInput creationIn(List<BackupRestorePointCreation> creationIn) {

        this.creationIn = creationIn;
        return this;
    }

    public BackupRestorePointWhereInput addCreationInItem(
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

    public BackupRestorePointWhereInput creationIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATION_IN);
        return this;
    }

    public BackupRestorePointWhereInput creationIn_ExplictlyNonNull() {
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

    public BackupRestorePointWhereInput creationNot(BackupRestorePointCreation creationNot) {

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

    public BackupRestorePointWhereInput creationNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATION_NOT);
        return this;
    }

    public BackupRestorePointWhereInput creationNot_ExplictlyNonNull() {
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

    public BackupRestorePointWhereInput creationNotIn(
            List<BackupRestorePointCreation> creationNotIn) {

        this.creationNotIn = creationNotIn;
        return this;
    }

    public BackupRestorePointWhereInput addCreationNotInItem(
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

    public BackupRestorePointWhereInput creationNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATION_NOT_IN);
        return this;
    }

    public BackupRestorePointWhereInput creationNotIn_ExplictlyNonNull() {
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

    public BackupRestorePointWhereInput entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {

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

    public BackupRestorePointWhereInput entityAsyncStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        return this;
    }

    public BackupRestorePointWhereInput entityAsyncStatus_ExplictlyNonNull() {
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

    public BackupRestorePointWhereInput entityAsyncStatusIn(
            List<EntityAsyncStatus> entityAsyncStatusIn) {

        this.entityAsyncStatusIn = entityAsyncStatusIn;
        return this;
    }

    public BackupRestorePointWhereInput addEntityAsyncStatusInItem(
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

    public BackupRestorePointWhereInput entityAsyncStatusIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_IN);
        return this;
    }

    public BackupRestorePointWhereInput entityAsyncStatusIn_ExplictlyNonNull() {
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

    public BackupRestorePointWhereInput entityAsyncStatusNot(
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

    public BackupRestorePointWhereInput entityAsyncStatusNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT);
        return this;
    }

    public BackupRestorePointWhereInput entityAsyncStatusNot_ExplictlyNonNull() {
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

    public BackupRestorePointWhereInput entityAsyncStatusNotIn(
            List<EntityAsyncStatus> entityAsyncStatusNotIn) {

        this.entityAsyncStatusNotIn = entityAsyncStatusNotIn;
        return this;
    }

    public BackupRestorePointWhereInput addEntityAsyncStatusNotInItem(
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

    public BackupRestorePointWhereInput entityAsyncStatusNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT_IN);
        return this;
    }

    public BackupRestorePointWhereInput entityAsyncStatusNotIn_ExplictlyNonNull() {
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

    public BackupRestorePointWhereInput id(String id) {

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

    public BackupRestorePointWhereInput id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public BackupRestorePointWhereInput id_ExplictlyNonNull() {
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

    public BackupRestorePointWhereInput idContains(String idContains) {

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

    public BackupRestorePointWhereInput idContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_CONTAINS);
        return this;
    }

    public BackupRestorePointWhereInput idContains_ExplictlyNonNull() {
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

    public BackupRestorePointWhereInput idEndsWith(String idEndsWith) {

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

    public BackupRestorePointWhereInput idEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_ENDS_WITH);
        return this;
    }

    public BackupRestorePointWhereInput idEndsWith_ExplictlyNonNull() {
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

    public BackupRestorePointWhereInput idGt(String idGt) {

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

    public BackupRestorePointWhereInput idGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GT);
        return this;
    }

    public BackupRestorePointWhereInput idGt_ExplictlyNonNull() {
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

    public BackupRestorePointWhereInput idGte(String idGte) {

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

    public BackupRestorePointWhereInput idGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GTE);
        return this;
    }

    public BackupRestorePointWhereInput idGte_ExplictlyNonNull() {
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

    public BackupRestorePointWhereInput idIn(List<String> idIn) {

        this.idIn = idIn;
        return this;
    }

    public BackupRestorePointWhereInput addIdInItem(String idInItem) {
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

    public BackupRestorePointWhereInput idIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_IN);
        return this;
    }

    public BackupRestorePointWhereInput idIn_ExplictlyNonNull() {
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

    public BackupRestorePointWhereInput idLt(String idLt) {

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

    public BackupRestorePointWhereInput idLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LT);
        return this;
    }

    public BackupRestorePointWhereInput idLt_ExplictlyNonNull() {
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

    public BackupRestorePointWhereInput idLte(String idLte) {

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

    public BackupRestorePointWhereInput idLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LTE);
        return this;
    }

    public BackupRestorePointWhereInput idLte_ExplictlyNonNull() {
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

    public BackupRestorePointWhereInput idNot(String idNot) {

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

    public BackupRestorePointWhereInput idNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT);
        return this;
    }

    public BackupRestorePointWhereInput idNot_ExplictlyNonNull() {
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

    public BackupRestorePointWhereInput idNotContains(String idNotContains) {

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

    public BackupRestorePointWhereInput idNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_CONTAINS);
        return this;
    }

    public BackupRestorePointWhereInput idNotContains_ExplictlyNonNull() {
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

    public BackupRestorePointWhereInput idNotEndsWith(String idNotEndsWith) {

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

    public BackupRestorePointWhereInput idNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
        return this;
    }

    public BackupRestorePointWhereInput idNotEndsWith_ExplictlyNonNull() {
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

    public BackupRestorePointWhereInput idNotIn(List<String> idNotIn) {

        this.idNotIn = idNotIn;
        return this;
    }

    public BackupRestorePointWhereInput addIdNotInItem(String idNotInItem) {
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

    public BackupRestorePointWhereInput idNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_IN);
        return this;
    }

    public BackupRestorePointWhereInput idNotIn_ExplictlyNonNull() {
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

    public BackupRestorePointWhereInput idNotStartsWith(String idNotStartsWith) {

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

    public BackupRestorePointWhereInput idNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
        return this;
    }

    public BackupRestorePointWhereInput idNotStartsWith_ExplictlyNonNull() {
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

    public BackupRestorePointWhereInput idStartsWith(String idStartsWith) {

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

    public BackupRestorePointWhereInput idStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_STARTS_WITH);
        return this;
    }

    public BackupRestorePointWhereInput idStartsWith_ExplictlyNonNull() {
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

    public BackupRestorePointWhereInput localCreatedAt(String localCreatedAt) {

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

    public BackupRestorePointWhereInput localCreatedAt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATED_AT);
        return this;
    }

    public BackupRestorePointWhereInput localCreatedAt_ExplictlyNonNull() {
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

    public BackupRestorePointWhereInput localCreatedAtGt(String localCreatedAtGt) {

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

    public BackupRestorePointWhereInput localCreatedAtGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATED_AT_GT);
        return this;
    }

    public BackupRestorePointWhereInput localCreatedAtGt_ExplictlyNonNull() {
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

    public BackupRestorePointWhereInput localCreatedAtGte(String localCreatedAtGte) {

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

    public BackupRestorePointWhereInput localCreatedAtGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATED_AT_GTE);
        return this;
    }

    public BackupRestorePointWhereInput localCreatedAtGte_ExplictlyNonNull() {
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

    public BackupRestorePointWhereInput localCreatedAtIn(List<String> localCreatedAtIn) {

        this.localCreatedAtIn = localCreatedAtIn;
        return this;
    }

    public BackupRestorePointWhereInput addLocalCreatedAtInItem(String localCreatedAtInItem) {
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

    public BackupRestorePointWhereInput localCreatedAtIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATED_AT_IN);
        return this;
    }

    public BackupRestorePointWhereInput localCreatedAtIn_ExplictlyNonNull() {
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

    public BackupRestorePointWhereInput localCreatedAtLt(String localCreatedAtLt) {

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

    public BackupRestorePointWhereInput localCreatedAtLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATED_AT_LT);
        return this;
    }

    public BackupRestorePointWhereInput localCreatedAtLt_ExplictlyNonNull() {
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

    public BackupRestorePointWhereInput localCreatedAtLte(String localCreatedAtLte) {

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

    public BackupRestorePointWhereInput localCreatedAtLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATED_AT_LTE);
        return this;
    }

    public BackupRestorePointWhereInput localCreatedAtLte_ExplictlyNonNull() {
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

    public BackupRestorePointWhereInput localCreatedAtNot(String localCreatedAtNot) {

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

    public BackupRestorePointWhereInput localCreatedAtNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATED_AT_NOT);
        return this;
    }

    public BackupRestorePointWhereInput localCreatedAtNot_ExplictlyNonNull() {
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

    public BackupRestorePointWhereInput localCreatedAtNotIn(List<String> localCreatedAtNotIn) {

        this.localCreatedAtNotIn = localCreatedAtNotIn;
        return this;
    }

    public BackupRestorePointWhereInput addLocalCreatedAtNotInItem(String localCreatedAtNotInItem) {
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

    public BackupRestorePointWhereInput localCreatedAtNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATED_AT_NOT_IN);
        return this;
    }

    public BackupRestorePointWhereInput localCreatedAtNotIn_ExplictlyNonNull() {
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

    public BackupRestorePointWhereInput localId(String localId) {

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

    public BackupRestorePointWhereInput localId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID);
        return this;
    }

    public BackupRestorePointWhereInput localId_ExplictlyNonNull() {
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

    public BackupRestorePointWhereInput localIdContains(String localIdContains) {

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

    public BackupRestorePointWhereInput localIdContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_CONTAINS);
        return this;
    }

    public BackupRestorePointWhereInput localIdContains_ExplictlyNonNull() {
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

    public BackupRestorePointWhereInput localIdEndsWith(String localIdEndsWith) {

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

    public BackupRestorePointWhereInput localIdEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_ENDS_WITH);
        return this;
    }

    public BackupRestorePointWhereInput localIdEndsWith_ExplictlyNonNull() {
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

    public BackupRestorePointWhereInput localIdGt(String localIdGt) {

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

    public BackupRestorePointWhereInput localIdGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_GT);
        return this;
    }

    public BackupRestorePointWhereInput localIdGt_ExplictlyNonNull() {
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

    public BackupRestorePointWhereInput localIdGte(String localIdGte) {

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

    public BackupRestorePointWhereInput localIdGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_GTE);
        return this;
    }

    public BackupRestorePointWhereInput localIdGte_ExplictlyNonNull() {
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

    public BackupRestorePointWhereInput localIdIn(List<String> localIdIn) {

        this.localIdIn = localIdIn;
        return this;
    }

    public BackupRestorePointWhereInput addLocalIdInItem(String localIdInItem) {
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

    public BackupRestorePointWhereInput localIdIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_IN);
        return this;
    }

    public BackupRestorePointWhereInput localIdIn_ExplictlyNonNull() {
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

    public BackupRestorePointWhereInput localIdLt(String localIdLt) {

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

    public BackupRestorePointWhereInput localIdLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_LT);
        return this;
    }

    public BackupRestorePointWhereInput localIdLt_ExplictlyNonNull() {
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

    public BackupRestorePointWhereInput localIdLte(String localIdLte) {

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

    public BackupRestorePointWhereInput localIdLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_LTE);
        return this;
    }

    public BackupRestorePointWhereInput localIdLte_ExplictlyNonNull() {
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

    public BackupRestorePointWhereInput localIdNot(String localIdNot) {

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

    public BackupRestorePointWhereInput localIdNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT);
        return this;
    }

    public BackupRestorePointWhereInput localIdNot_ExplictlyNonNull() {
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

    public BackupRestorePointWhereInput localIdNotContains(String localIdNotContains) {

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

    public BackupRestorePointWhereInput localIdNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_CONTAINS);
        return this;
    }

    public BackupRestorePointWhereInput localIdNotContains_ExplictlyNonNull() {
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

    public BackupRestorePointWhereInput localIdNotEndsWith(String localIdNotEndsWith) {

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

    public BackupRestorePointWhereInput localIdNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_ENDS_WITH);
        return this;
    }

    public BackupRestorePointWhereInput localIdNotEndsWith_ExplictlyNonNull() {
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

    public BackupRestorePointWhereInput localIdNotIn(List<String> localIdNotIn) {

        this.localIdNotIn = localIdNotIn;
        return this;
    }

    public BackupRestorePointWhereInput addLocalIdNotInItem(String localIdNotInItem) {
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

    public BackupRestorePointWhereInput localIdNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_IN);
        return this;
    }

    public BackupRestorePointWhereInput localIdNotIn_ExplictlyNonNull() {
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

    public BackupRestorePointWhereInput localIdNotStartsWith(String localIdNotStartsWith) {

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

    public BackupRestorePointWhereInput localIdNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_STARTS_WITH);
        return this;
    }

    public BackupRestorePointWhereInput localIdNotStartsWith_ExplictlyNonNull() {
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

    public BackupRestorePointWhereInput localIdStartsWith(String localIdStartsWith) {

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

    public BackupRestorePointWhereInput localIdStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_STARTS_WITH);
        return this;
    }

    public BackupRestorePointWhereInput localIdStartsWith_ExplictlyNonNull() {
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

    public BackupRestorePointWhereInput logicalSize(Long logicalSize) {

        this.logicalSize = logicalSize;
        return this;
    }

    /**
     * Get logicalSize
     *
     * @return logicalSize
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getLogicalSize() {
        return logicalSize;
    }

    public void setLogicalSize(Long logicalSize) {
        this.logicalSize = logicalSize;
    }

    public BackupRestorePointWhereInput logicalSize_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOGICAL_SIZE);
        return this;
    }

    public BackupRestorePointWhereInput logicalSize_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOGICAL_SIZE);
        return this;
    }

    public void setLogicalSize_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOGICAL_SIZE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOGICAL_SIZE);
        }
    }

    public boolean getLogicalSize_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOGICAL_SIZE);
    }

    public BackupRestorePointWhereInput logicalSizeGt(Long logicalSizeGt) {

        this.logicalSizeGt = logicalSizeGt;
        return this;
    }

    /**
     * Get logicalSizeGt
     *
     * @return logicalSizeGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getLogicalSizeGt() {
        return logicalSizeGt;
    }

    public void setLogicalSizeGt(Long logicalSizeGt) {
        this.logicalSizeGt = logicalSizeGt;
    }

    public BackupRestorePointWhereInput logicalSizeGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOGICAL_SIZE_GT);
        return this;
    }

    public BackupRestorePointWhereInput logicalSizeGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOGICAL_SIZE_GT);
        return this;
    }

    public void setLogicalSizeGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOGICAL_SIZE_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOGICAL_SIZE_GT);
        }
    }

    public boolean getLogicalSizeGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOGICAL_SIZE_GT);
    }

    public BackupRestorePointWhereInput logicalSizeGte(Long logicalSizeGte) {

        this.logicalSizeGte = logicalSizeGte;
        return this;
    }

    /**
     * Get logicalSizeGte
     *
     * @return logicalSizeGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getLogicalSizeGte() {
        return logicalSizeGte;
    }

    public void setLogicalSizeGte(Long logicalSizeGte) {
        this.logicalSizeGte = logicalSizeGte;
    }

    public BackupRestorePointWhereInput logicalSizeGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOGICAL_SIZE_GTE);
        return this;
    }

    public BackupRestorePointWhereInput logicalSizeGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOGICAL_SIZE_GTE);
        return this;
    }

    public void setLogicalSizeGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOGICAL_SIZE_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOGICAL_SIZE_GTE);
        }
    }

    public boolean getLogicalSizeGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOGICAL_SIZE_GTE);
    }

    public BackupRestorePointWhereInput logicalSizeIn(List<Long> logicalSizeIn) {

        this.logicalSizeIn = logicalSizeIn;
        return this;
    }

    public BackupRestorePointWhereInput addLogicalSizeInItem(Long logicalSizeInItem) {
        if (this.logicalSizeIn == null) {
            this.logicalSizeIn = new ArrayList<Long>();
        }
        this.logicalSizeIn.add(logicalSizeInItem);
        return this;
    }

    /**
     * Get logicalSizeIn
     *
     * @return logicalSizeIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getLogicalSizeIn() {
        return logicalSizeIn;
    }

    public void setLogicalSizeIn(List<Long> logicalSizeIn) {
        this.logicalSizeIn = logicalSizeIn;
    }

    public BackupRestorePointWhereInput logicalSizeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOGICAL_SIZE_IN);
        return this;
    }

    public BackupRestorePointWhereInput logicalSizeIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOGICAL_SIZE_IN);
        return this;
    }

    public void setLogicalSizeIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOGICAL_SIZE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOGICAL_SIZE_IN);
        }
    }

    public boolean getLogicalSizeIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOGICAL_SIZE_IN);
    }

    public BackupRestorePointWhereInput logicalSizeLt(Long logicalSizeLt) {

        this.logicalSizeLt = logicalSizeLt;
        return this;
    }

    /**
     * Get logicalSizeLt
     *
     * @return logicalSizeLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getLogicalSizeLt() {
        return logicalSizeLt;
    }

    public void setLogicalSizeLt(Long logicalSizeLt) {
        this.logicalSizeLt = logicalSizeLt;
    }

    public BackupRestorePointWhereInput logicalSizeLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOGICAL_SIZE_LT);
        return this;
    }

    public BackupRestorePointWhereInput logicalSizeLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOGICAL_SIZE_LT);
        return this;
    }

    public void setLogicalSizeLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOGICAL_SIZE_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOGICAL_SIZE_LT);
        }
    }

    public boolean getLogicalSizeLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOGICAL_SIZE_LT);
    }

    public BackupRestorePointWhereInput logicalSizeLte(Long logicalSizeLte) {

        this.logicalSizeLte = logicalSizeLte;
        return this;
    }

    /**
     * Get logicalSizeLte
     *
     * @return logicalSizeLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getLogicalSizeLte() {
        return logicalSizeLte;
    }

    public void setLogicalSizeLte(Long logicalSizeLte) {
        this.logicalSizeLte = logicalSizeLte;
    }

    public BackupRestorePointWhereInput logicalSizeLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOGICAL_SIZE_LTE);
        return this;
    }

    public BackupRestorePointWhereInput logicalSizeLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOGICAL_SIZE_LTE);
        return this;
    }

    public void setLogicalSizeLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOGICAL_SIZE_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOGICAL_SIZE_LTE);
        }
    }

    public boolean getLogicalSizeLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOGICAL_SIZE_LTE);
    }

    public BackupRestorePointWhereInput logicalSizeNot(Long logicalSizeNot) {

        this.logicalSizeNot = logicalSizeNot;
        return this;
    }

    /**
     * Get logicalSizeNot
     *
     * @return logicalSizeNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getLogicalSizeNot() {
        return logicalSizeNot;
    }

    public void setLogicalSizeNot(Long logicalSizeNot) {
        this.logicalSizeNot = logicalSizeNot;
    }

    public BackupRestorePointWhereInput logicalSizeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOGICAL_SIZE_NOT);
        return this;
    }

    public BackupRestorePointWhereInput logicalSizeNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOGICAL_SIZE_NOT);
        return this;
    }

    public void setLogicalSizeNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOGICAL_SIZE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOGICAL_SIZE_NOT);
        }
    }

    public boolean getLogicalSizeNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOGICAL_SIZE_NOT);
    }

    public BackupRestorePointWhereInput logicalSizeNotIn(List<Long> logicalSizeNotIn) {

        this.logicalSizeNotIn = logicalSizeNotIn;
        return this;
    }

    public BackupRestorePointWhereInput addLogicalSizeNotInItem(Long logicalSizeNotInItem) {
        if (this.logicalSizeNotIn == null) {
            this.logicalSizeNotIn = new ArrayList<Long>();
        }
        this.logicalSizeNotIn.add(logicalSizeNotInItem);
        return this;
    }

    /**
     * Get logicalSizeNotIn
     *
     * @return logicalSizeNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getLogicalSizeNotIn() {
        return logicalSizeNotIn;
    }

    public void setLogicalSizeNotIn(List<Long> logicalSizeNotIn) {
        this.logicalSizeNotIn = logicalSizeNotIn;
    }

    public BackupRestorePointWhereInput logicalSizeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOGICAL_SIZE_NOT_IN);
        return this;
    }

    public BackupRestorePointWhereInput logicalSizeNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOGICAL_SIZE_NOT_IN);
        return this;
    }

    public void setLogicalSizeNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOGICAL_SIZE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOGICAL_SIZE_NOT_IN);
        }
    }

    public boolean getLogicalSizeNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOGICAL_SIZE_NOT_IN);
    }

    public BackupRestorePointWhereInput parentRestorePoint(String parentRestorePoint) {

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

    public BackupRestorePointWhereInput parentRestorePoint_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PARENT_RESTORE_POINT);
        return this;
    }

    public BackupRestorePointWhereInput parentRestorePoint_ExplictlyNonNull() {
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

    public BackupRestorePointWhereInput parentRestorePointContains(
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

    public BackupRestorePointWhereInput parentRestorePointContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PARENT_RESTORE_POINT_CONTAINS);
        return this;
    }

    public BackupRestorePointWhereInput parentRestorePointContains_ExplictlyNonNull() {
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

    public BackupRestorePointWhereInput parentRestorePointEndsWith(
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

    public BackupRestorePointWhereInput parentRestorePointEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PARENT_RESTORE_POINT_ENDS_WITH);
        return this;
    }

    public BackupRestorePointWhereInput parentRestorePointEndsWith_ExplictlyNonNull() {
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

    public BackupRestorePointWhereInput parentRestorePointGt(String parentRestorePointGt) {

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

    public BackupRestorePointWhereInput parentRestorePointGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PARENT_RESTORE_POINT_GT);
        return this;
    }

    public BackupRestorePointWhereInput parentRestorePointGt_ExplictlyNonNull() {
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

    public BackupRestorePointWhereInput parentRestorePointGte(String parentRestorePointGte) {

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

    public BackupRestorePointWhereInput parentRestorePointGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PARENT_RESTORE_POINT_GTE);
        return this;
    }

    public BackupRestorePointWhereInput parentRestorePointGte_ExplictlyNonNull() {
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

    public BackupRestorePointWhereInput parentRestorePointIn(List<String> parentRestorePointIn) {

        this.parentRestorePointIn = parentRestorePointIn;
        return this;
    }

    public BackupRestorePointWhereInput addParentRestorePointInItem(
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

    public BackupRestorePointWhereInput parentRestorePointIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PARENT_RESTORE_POINT_IN);
        return this;
    }

    public BackupRestorePointWhereInput parentRestorePointIn_ExplictlyNonNull() {
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

    public BackupRestorePointWhereInput parentRestorePointLt(String parentRestorePointLt) {

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

    public BackupRestorePointWhereInput parentRestorePointLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PARENT_RESTORE_POINT_LT);
        return this;
    }

    public BackupRestorePointWhereInput parentRestorePointLt_ExplictlyNonNull() {
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

    public BackupRestorePointWhereInput parentRestorePointLte(String parentRestorePointLte) {

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

    public BackupRestorePointWhereInput parentRestorePointLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PARENT_RESTORE_POINT_LTE);
        return this;
    }

    public BackupRestorePointWhereInput parentRestorePointLte_ExplictlyNonNull() {
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

    public BackupRestorePointWhereInput parentRestorePointNot(String parentRestorePointNot) {

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

    public BackupRestorePointWhereInput parentRestorePointNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PARENT_RESTORE_POINT_NOT);
        return this;
    }

    public BackupRestorePointWhereInput parentRestorePointNot_ExplictlyNonNull() {
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

    public BackupRestorePointWhereInput parentRestorePointNotContains(
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

    public BackupRestorePointWhereInput parentRestorePointNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PARENT_RESTORE_POINT_NOT_CONTAINS);
        return this;
    }

    public BackupRestorePointWhereInput parentRestorePointNotContains_ExplictlyNonNull() {
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

    public BackupRestorePointWhereInput parentRestorePointNotEndsWith(
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

    public BackupRestorePointWhereInput parentRestorePointNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PARENT_RESTORE_POINT_NOT_ENDS_WITH);
        return this;
    }

    public BackupRestorePointWhereInput parentRestorePointNotEndsWith_ExplictlyNonNull() {
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

    public BackupRestorePointWhereInput parentRestorePointNotIn(
            List<String> parentRestorePointNotIn) {

        this.parentRestorePointNotIn = parentRestorePointNotIn;
        return this;
    }

    public BackupRestorePointWhereInput addParentRestorePointNotInItem(
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

    public BackupRestorePointWhereInput parentRestorePointNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PARENT_RESTORE_POINT_NOT_IN);
        return this;
    }

    public BackupRestorePointWhereInput parentRestorePointNotIn_ExplictlyNonNull() {
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

    public BackupRestorePointWhereInput parentRestorePointNotStartsWith(
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

    public BackupRestorePointWhereInput parentRestorePointNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PARENT_RESTORE_POINT_NOT_STARTS_WITH);
        return this;
    }

    public BackupRestorePointWhereInput parentRestorePointNotStartsWith_ExplictlyNonNull() {
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

    public BackupRestorePointWhereInput parentRestorePointStartsWith(
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

    public BackupRestorePointWhereInput parentRestorePointStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PARENT_RESTORE_POINT_STARTS_WITH);
        return this;
    }

    public BackupRestorePointWhereInput parentRestorePointStartsWith_ExplictlyNonNull() {
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

    public BackupRestorePointWhereInput physicalSize(Long physicalSize) {

        this.physicalSize = physicalSize;
        return this;
    }

    /**
     * Get physicalSize
     *
     * @return physicalSize
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getPhysicalSize() {
        return physicalSize;
    }

    public void setPhysicalSize(Long physicalSize) {
        this.physicalSize = physicalSize;
    }

    public BackupRestorePointWhereInput physicalSize_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PHYSICAL_SIZE);
        return this;
    }

    public BackupRestorePointWhereInput physicalSize_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PHYSICAL_SIZE);
        return this;
    }

    public void setPhysicalSize_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PHYSICAL_SIZE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PHYSICAL_SIZE);
        }
    }

    public boolean getPhysicalSize_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PHYSICAL_SIZE);
    }

    public BackupRestorePointWhereInput physicalSizeGt(Long physicalSizeGt) {

        this.physicalSizeGt = physicalSizeGt;
        return this;
    }

    /**
     * Get physicalSizeGt
     *
     * @return physicalSizeGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getPhysicalSizeGt() {
        return physicalSizeGt;
    }

    public void setPhysicalSizeGt(Long physicalSizeGt) {
        this.physicalSizeGt = physicalSizeGt;
    }

    public BackupRestorePointWhereInput physicalSizeGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PHYSICAL_SIZE_GT);
        return this;
    }

    public BackupRestorePointWhereInput physicalSizeGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PHYSICAL_SIZE_GT);
        return this;
    }

    public void setPhysicalSizeGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PHYSICAL_SIZE_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PHYSICAL_SIZE_GT);
        }
    }

    public boolean getPhysicalSizeGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PHYSICAL_SIZE_GT);
    }

    public BackupRestorePointWhereInput physicalSizeGte(Long physicalSizeGte) {

        this.physicalSizeGte = physicalSizeGte;
        return this;
    }

    /**
     * Get physicalSizeGte
     *
     * @return physicalSizeGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getPhysicalSizeGte() {
        return physicalSizeGte;
    }

    public void setPhysicalSizeGte(Long physicalSizeGte) {
        this.physicalSizeGte = physicalSizeGte;
    }

    public BackupRestorePointWhereInput physicalSizeGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PHYSICAL_SIZE_GTE);
        return this;
    }

    public BackupRestorePointWhereInput physicalSizeGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PHYSICAL_SIZE_GTE);
        return this;
    }

    public void setPhysicalSizeGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PHYSICAL_SIZE_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PHYSICAL_SIZE_GTE);
        }
    }

    public boolean getPhysicalSizeGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PHYSICAL_SIZE_GTE);
    }

    public BackupRestorePointWhereInput physicalSizeIn(List<Long> physicalSizeIn) {

        this.physicalSizeIn = physicalSizeIn;
        return this;
    }

    public BackupRestorePointWhereInput addPhysicalSizeInItem(Long physicalSizeInItem) {
        if (this.physicalSizeIn == null) {
            this.physicalSizeIn = new ArrayList<Long>();
        }
        this.physicalSizeIn.add(physicalSizeInItem);
        return this;
    }

    /**
     * Get physicalSizeIn
     *
     * @return physicalSizeIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getPhysicalSizeIn() {
        return physicalSizeIn;
    }

    public void setPhysicalSizeIn(List<Long> physicalSizeIn) {
        this.physicalSizeIn = physicalSizeIn;
    }

    public BackupRestorePointWhereInput physicalSizeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PHYSICAL_SIZE_IN);
        return this;
    }

    public BackupRestorePointWhereInput physicalSizeIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PHYSICAL_SIZE_IN);
        return this;
    }

    public void setPhysicalSizeIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PHYSICAL_SIZE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PHYSICAL_SIZE_IN);
        }
    }

    public boolean getPhysicalSizeIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PHYSICAL_SIZE_IN);
    }

    public BackupRestorePointWhereInput physicalSizeLt(Long physicalSizeLt) {

        this.physicalSizeLt = physicalSizeLt;
        return this;
    }

    /**
     * Get physicalSizeLt
     *
     * @return physicalSizeLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getPhysicalSizeLt() {
        return physicalSizeLt;
    }

    public void setPhysicalSizeLt(Long physicalSizeLt) {
        this.physicalSizeLt = physicalSizeLt;
    }

    public BackupRestorePointWhereInput physicalSizeLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PHYSICAL_SIZE_LT);
        return this;
    }

    public BackupRestorePointWhereInput physicalSizeLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PHYSICAL_SIZE_LT);
        return this;
    }

    public void setPhysicalSizeLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PHYSICAL_SIZE_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PHYSICAL_SIZE_LT);
        }
    }

    public boolean getPhysicalSizeLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PHYSICAL_SIZE_LT);
    }

    public BackupRestorePointWhereInput physicalSizeLte(Long physicalSizeLte) {

        this.physicalSizeLte = physicalSizeLte;
        return this;
    }

    /**
     * Get physicalSizeLte
     *
     * @return physicalSizeLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getPhysicalSizeLte() {
        return physicalSizeLte;
    }

    public void setPhysicalSizeLte(Long physicalSizeLte) {
        this.physicalSizeLte = physicalSizeLte;
    }

    public BackupRestorePointWhereInput physicalSizeLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PHYSICAL_SIZE_LTE);
        return this;
    }

    public BackupRestorePointWhereInput physicalSizeLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PHYSICAL_SIZE_LTE);
        return this;
    }

    public void setPhysicalSizeLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PHYSICAL_SIZE_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PHYSICAL_SIZE_LTE);
        }
    }

    public boolean getPhysicalSizeLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PHYSICAL_SIZE_LTE);
    }

    public BackupRestorePointWhereInput physicalSizeNot(Long physicalSizeNot) {

        this.physicalSizeNot = physicalSizeNot;
        return this;
    }

    /**
     * Get physicalSizeNot
     *
     * @return physicalSizeNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getPhysicalSizeNot() {
        return physicalSizeNot;
    }

    public void setPhysicalSizeNot(Long physicalSizeNot) {
        this.physicalSizeNot = physicalSizeNot;
    }

    public BackupRestorePointWhereInput physicalSizeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PHYSICAL_SIZE_NOT);
        return this;
    }

    public BackupRestorePointWhereInput physicalSizeNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PHYSICAL_SIZE_NOT);
        return this;
    }

    public void setPhysicalSizeNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PHYSICAL_SIZE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PHYSICAL_SIZE_NOT);
        }
    }

    public boolean getPhysicalSizeNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PHYSICAL_SIZE_NOT);
    }

    public BackupRestorePointWhereInput physicalSizeNotIn(List<Long> physicalSizeNotIn) {

        this.physicalSizeNotIn = physicalSizeNotIn;
        return this;
    }

    public BackupRestorePointWhereInput addPhysicalSizeNotInItem(Long physicalSizeNotInItem) {
        if (this.physicalSizeNotIn == null) {
            this.physicalSizeNotIn = new ArrayList<Long>();
        }
        this.physicalSizeNotIn.add(physicalSizeNotInItem);
        return this;
    }

    /**
     * Get physicalSizeNotIn
     *
     * @return physicalSizeNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getPhysicalSizeNotIn() {
        return physicalSizeNotIn;
    }

    public void setPhysicalSizeNotIn(List<Long> physicalSizeNotIn) {
        this.physicalSizeNotIn = physicalSizeNotIn;
    }

    public BackupRestorePointWhereInput physicalSizeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PHYSICAL_SIZE_NOT_IN);
        return this;
    }

    public BackupRestorePointWhereInput physicalSizeNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PHYSICAL_SIZE_NOT_IN);
        return this;
    }

    public void setPhysicalSizeNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PHYSICAL_SIZE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PHYSICAL_SIZE_NOT_IN);
        }
    }

    public boolean getPhysicalSizeNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PHYSICAL_SIZE_NOT_IN);
    }

    public BackupRestorePointWhereInput size(Long size) {

        this.size = size;
        return this;
    }

    /**
     * Get size
     *
     * @return size
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public BackupRestorePointWhereInput size_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIZE);
        return this;
    }

    public BackupRestorePointWhereInput size_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SIZE);
        return this;
    }

    public void setSize_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SIZE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SIZE);
        }
    }

    public boolean getSize_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SIZE);
    }

    public BackupRestorePointWhereInput sizeGt(Long sizeGt) {

        this.sizeGt = sizeGt;
        return this;
    }

    /**
     * Get sizeGt
     *
     * @return sizeGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getSizeGt() {
        return sizeGt;
    }

    public void setSizeGt(Long sizeGt) {
        this.sizeGt = sizeGt;
    }

    public BackupRestorePointWhereInput sizeGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIZE_GT);
        return this;
    }

    public BackupRestorePointWhereInput sizeGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SIZE_GT);
        return this;
    }

    public void setSizeGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SIZE_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SIZE_GT);
        }
    }

    public boolean getSizeGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SIZE_GT);
    }

    public BackupRestorePointWhereInput sizeGte(Long sizeGte) {

        this.sizeGte = sizeGte;
        return this;
    }

    /**
     * Get sizeGte
     *
     * @return sizeGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getSizeGte() {
        return sizeGte;
    }

    public void setSizeGte(Long sizeGte) {
        this.sizeGte = sizeGte;
    }

    public BackupRestorePointWhereInput sizeGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIZE_GTE);
        return this;
    }

    public BackupRestorePointWhereInput sizeGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SIZE_GTE);
        return this;
    }

    public void setSizeGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SIZE_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SIZE_GTE);
        }
    }

    public boolean getSizeGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SIZE_GTE);
    }

    public BackupRestorePointWhereInput sizeIn(List<Long> sizeIn) {

        this.sizeIn = sizeIn;
        return this;
    }

    public BackupRestorePointWhereInput addSizeInItem(Long sizeInItem) {
        if (this.sizeIn == null) {
            this.sizeIn = new ArrayList<Long>();
        }
        this.sizeIn.add(sizeInItem);
        return this;
    }

    /**
     * Get sizeIn
     *
     * @return sizeIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getSizeIn() {
        return sizeIn;
    }

    public void setSizeIn(List<Long> sizeIn) {
        this.sizeIn = sizeIn;
    }

    public BackupRestorePointWhereInput sizeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIZE_IN);
        return this;
    }

    public BackupRestorePointWhereInput sizeIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SIZE_IN);
        return this;
    }

    public void setSizeIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SIZE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SIZE_IN);
        }
    }

    public boolean getSizeIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SIZE_IN);
    }

    public BackupRestorePointWhereInput sizeLt(Long sizeLt) {

        this.sizeLt = sizeLt;
        return this;
    }

    /**
     * Get sizeLt
     *
     * @return sizeLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getSizeLt() {
        return sizeLt;
    }

    public void setSizeLt(Long sizeLt) {
        this.sizeLt = sizeLt;
    }

    public BackupRestorePointWhereInput sizeLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIZE_LT);
        return this;
    }

    public BackupRestorePointWhereInput sizeLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SIZE_LT);
        return this;
    }

    public void setSizeLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SIZE_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SIZE_LT);
        }
    }

    public boolean getSizeLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SIZE_LT);
    }

    public BackupRestorePointWhereInput sizeLte(Long sizeLte) {

        this.sizeLte = sizeLte;
        return this;
    }

    /**
     * Get sizeLte
     *
     * @return sizeLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getSizeLte() {
        return sizeLte;
    }

    public void setSizeLte(Long sizeLte) {
        this.sizeLte = sizeLte;
    }

    public BackupRestorePointWhereInput sizeLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIZE_LTE);
        return this;
    }

    public BackupRestorePointWhereInput sizeLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SIZE_LTE);
        return this;
    }

    public void setSizeLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SIZE_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SIZE_LTE);
        }
    }

    public boolean getSizeLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SIZE_LTE);
    }

    public BackupRestorePointWhereInput sizeNot(Long sizeNot) {

        this.sizeNot = sizeNot;
        return this;
    }

    /**
     * Get sizeNot
     *
     * @return sizeNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getSizeNot() {
        return sizeNot;
    }

    public void setSizeNot(Long sizeNot) {
        this.sizeNot = sizeNot;
    }

    public BackupRestorePointWhereInput sizeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIZE_NOT);
        return this;
    }

    public BackupRestorePointWhereInput sizeNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SIZE_NOT);
        return this;
    }

    public void setSizeNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SIZE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SIZE_NOT);
        }
    }

    public boolean getSizeNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SIZE_NOT);
    }

    public BackupRestorePointWhereInput sizeNotIn(List<Long> sizeNotIn) {

        this.sizeNotIn = sizeNotIn;
        return this;
    }

    public BackupRestorePointWhereInput addSizeNotInItem(Long sizeNotInItem) {
        if (this.sizeNotIn == null) {
            this.sizeNotIn = new ArrayList<Long>();
        }
        this.sizeNotIn.add(sizeNotInItem);
        return this;
    }

    /**
     * Get sizeNotIn
     *
     * @return sizeNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getSizeNotIn() {
        return sizeNotIn;
    }

    public void setSizeNotIn(List<Long> sizeNotIn) {
        this.sizeNotIn = sizeNotIn;
    }

    public BackupRestorePointWhereInput sizeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIZE_NOT_IN);
        return this;
    }

    public BackupRestorePointWhereInput sizeNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SIZE_NOT_IN);
        return this;
    }

    public void setSizeNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SIZE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SIZE_NOT_IN);
        }
    }

    public boolean getSizeNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SIZE_NOT_IN);
    }

    public BackupRestorePointWhereInput slice(String slice) {

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

    public BackupRestorePointWhereInput slice_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SLICE);
        return this;
    }

    public BackupRestorePointWhereInput slice_ExplictlyNonNull() {
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

    public BackupRestorePointWhereInput sliceContains(String sliceContains) {

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

    public BackupRestorePointWhereInput sliceContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SLICE_CONTAINS);
        return this;
    }

    public BackupRestorePointWhereInput sliceContains_ExplictlyNonNull() {
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

    public BackupRestorePointWhereInput sliceEndsWith(String sliceEndsWith) {

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

    public BackupRestorePointWhereInput sliceEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SLICE_ENDS_WITH);
        return this;
    }

    public BackupRestorePointWhereInput sliceEndsWith_ExplictlyNonNull() {
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

    public BackupRestorePointWhereInput sliceGt(String sliceGt) {

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

    public BackupRestorePointWhereInput sliceGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SLICE_GT);
        return this;
    }

    public BackupRestorePointWhereInput sliceGt_ExplictlyNonNull() {
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

    public BackupRestorePointWhereInput sliceGte(String sliceGte) {

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

    public BackupRestorePointWhereInput sliceGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SLICE_GTE);
        return this;
    }

    public BackupRestorePointWhereInput sliceGte_ExplictlyNonNull() {
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

    public BackupRestorePointWhereInput sliceIn(List<String> sliceIn) {

        this.sliceIn = sliceIn;
        return this;
    }

    public BackupRestorePointWhereInput addSliceInItem(String sliceInItem) {
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

    public BackupRestorePointWhereInput sliceIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SLICE_IN);
        return this;
    }

    public BackupRestorePointWhereInput sliceIn_ExplictlyNonNull() {
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

    public BackupRestorePointWhereInput sliceLt(String sliceLt) {

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

    public BackupRestorePointWhereInput sliceLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SLICE_LT);
        return this;
    }

    public BackupRestorePointWhereInput sliceLt_ExplictlyNonNull() {
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

    public BackupRestorePointWhereInput sliceLte(String sliceLte) {

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

    public BackupRestorePointWhereInput sliceLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SLICE_LTE);
        return this;
    }

    public BackupRestorePointWhereInput sliceLte_ExplictlyNonNull() {
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

    public BackupRestorePointWhereInput sliceNot(String sliceNot) {

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

    public BackupRestorePointWhereInput sliceNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SLICE_NOT);
        return this;
    }

    public BackupRestorePointWhereInput sliceNot_ExplictlyNonNull() {
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

    public BackupRestorePointWhereInput sliceNotContains(String sliceNotContains) {

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

    public BackupRestorePointWhereInput sliceNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SLICE_NOT_CONTAINS);
        return this;
    }

    public BackupRestorePointWhereInput sliceNotContains_ExplictlyNonNull() {
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

    public BackupRestorePointWhereInput sliceNotEndsWith(String sliceNotEndsWith) {

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

    public BackupRestorePointWhereInput sliceNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SLICE_NOT_ENDS_WITH);
        return this;
    }

    public BackupRestorePointWhereInput sliceNotEndsWith_ExplictlyNonNull() {
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

    public BackupRestorePointWhereInput sliceNotIn(List<String> sliceNotIn) {

        this.sliceNotIn = sliceNotIn;
        return this;
    }

    public BackupRestorePointWhereInput addSliceNotInItem(String sliceNotInItem) {
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

    public BackupRestorePointWhereInput sliceNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SLICE_NOT_IN);
        return this;
    }

    public BackupRestorePointWhereInput sliceNotIn_ExplictlyNonNull() {
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

    public BackupRestorePointWhereInput sliceNotStartsWith(String sliceNotStartsWith) {

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

    public BackupRestorePointWhereInput sliceNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SLICE_NOT_STARTS_WITH);
        return this;
    }

    public BackupRestorePointWhereInput sliceNotStartsWith_ExplictlyNonNull() {
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

    public BackupRestorePointWhereInput sliceStartsWith(String sliceStartsWith) {

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

    public BackupRestorePointWhereInput sliceStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SLICE_STARTS_WITH);
        return this;
    }

    public BackupRestorePointWhereInput sliceStartsWith_ExplictlyNonNull() {
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

    public BackupRestorePointWhereInput snapshotConsistentType(
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

    public BackupRestorePointWhereInput snapshotConsistentType_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT_CONSISTENT_TYPE);
        return this;
    }

    public BackupRestorePointWhereInput snapshotConsistentType_ExplictlyNonNull() {
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

    public BackupRestorePointWhereInput snapshotConsistentTypeIn(
            List<ConsistentType> snapshotConsistentTypeIn) {

        this.snapshotConsistentTypeIn = snapshotConsistentTypeIn;
        return this;
    }

    public BackupRestorePointWhereInput addSnapshotConsistentTypeInItem(
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

    public BackupRestorePointWhereInput snapshotConsistentTypeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT_CONSISTENT_TYPE_IN);
        return this;
    }

    public BackupRestorePointWhereInput snapshotConsistentTypeIn_ExplictlyNonNull() {
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

    public BackupRestorePointWhereInput snapshotConsistentTypeNot(
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

    public BackupRestorePointWhereInput snapshotConsistentTypeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT_CONSISTENT_TYPE_NOT);
        return this;
    }

    public BackupRestorePointWhereInput snapshotConsistentTypeNot_ExplictlyNonNull() {
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

    public BackupRestorePointWhereInput snapshotConsistentTypeNotIn(
            List<ConsistentType> snapshotConsistentTypeNotIn) {

        this.snapshotConsistentTypeNotIn = snapshotConsistentTypeNotIn;
        return this;
    }

    public BackupRestorePointWhereInput addSnapshotConsistentTypeNotInItem(
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

    public BackupRestorePointWhereInput snapshotConsistentTypeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT_CONSISTENT_TYPE_NOT_IN);
        return this;
    }

    public BackupRestorePointWhereInput snapshotConsistentTypeNotIn_ExplictlyNonNull() {
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

    public BackupRestorePointWhereInput type(BackupRestorePointType type) {

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

    public BackupRestorePointWhereInput type_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE);
        return this;
    }

    public BackupRestorePointWhereInput type_ExplictlyNonNull() {
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

    public BackupRestorePointWhereInput typeIn(List<BackupRestorePointType> typeIn) {

        this.typeIn = typeIn;
        return this;
    }

    public BackupRestorePointWhereInput addTypeInItem(BackupRestorePointType typeInItem) {
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

    public BackupRestorePointWhereInput typeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE_IN);
        return this;
    }

    public BackupRestorePointWhereInput typeIn_ExplictlyNonNull() {
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

    public BackupRestorePointWhereInput typeNot(BackupRestorePointType typeNot) {

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

    public BackupRestorePointWhereInput typeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE_NOT);
        return this;
    }

    public BackupRestorePointWhereInput typeNot_ExplictlyNonNull() {
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

    public BackupRestorePointWhereInput typeNotIn(List<BackupRestorePointType> typeNotIn) {

        this.typeNotIn = typeNotIn;
        return this;
    }

    public BackupRestorePointWhereInput addTypeNotInItem(BackupRestorePointType typeNotInItem) {
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

    public BackupRestorePointWhereInput typeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE_NOT_IN);
        return this;
    }

    public BackupRestorePointWhereInput typeNotIn_ExplictlyNonNull() {
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

    public BackupRestorePointWhereInput validCapacity(Long validCapacity) {

        this.validCapacity = validCapacity;
        return this;
    }

    /**
     * Get validCapacity
     *
     * @return validCapacity
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getValidCapacity() {
        return validCapacity;
    }

    public void setValidCapacity(Long validCapacity) {
        this.validCapacity = validCapacity;
    }

    public BackupRestorePointWhereInput validCapacity_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VALID_CAPACITY);
        return this;
    }

    public BackupRestorePointWhereInput validCapacity_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VALID_CAPACITY);
        return this;
    }

    public void setValidCapacity_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VALID_CAPACITY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VALID_CAPACITY);
        }
    }

    public boolean getValidCapacity_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VALID_CAPACITY);
    }

    public BackupRestorePointWhereInput validCapacityGt(Long validCapacityGt) {

        this.validCapacityGt = validCapacityGt;
        return this;
    }

    /**
     * Get validCapacityGt
     *
     * @return validCapacityGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getValidCapacityGt() {
        return validCapacityGt;
    }

    public void setValidCapacityGt(Long validCapacityGt) {
        this.validCapacityGt = validCapacityGt;
    }

    public BackupRestorePointWhereInput validCapacityGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VALID_CAPACITY_GT);
        return this;
    }

    public BackupRestorePointWhereInput validCapacityGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VALID_CAPACITY_GT);
        return this;
    }

    public void setValidCapacityGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VALID_CAPACITY_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VALID_CAPACITY_GT);
        }
    }

    public boolean getValidCapacityGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VALID_CAPACITY_GT);
    }

    public BackupRestorePointWhereInput validCapacityGte(Long validCapacityGte) {

        this.validCapacityGte = validCapacityGte;
        return this;
    }

    /**
     * Get validCapacityGte
     *
     * @return validCapacityGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getValidCapacityGte() {
        return validCapacityGte;
    }

    public void setValidCapacityGte(Long validCapacityGte) {
        this.validCapacityGte = validCapacityGte;
    }

    public BackupRestorePointWhereInput validCapacityGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VALID_CAPACITY_GTE);
        return this;
    }

    public BackupRestorePointWhereInput validCapacityGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VALID_CAPACITY_GTE);
        return this;
    }

    public void setValidCapacityGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VALID_CAPACITY_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VALID_CAPACITY_GTE);
        }
    }

    public boolean getValidCapacityGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VALID_CAPACITY_GTE);
    }

    public BackupRestorePointWhereInput validCapacityIn(List<Long> validCapacityIn) {

        this.validCapacityIn = validCapacityIn;
        return this;
    }

    public BackupRestorePointWhereInput addValidCapacityInItem(Long validCapacityInItem) {
        if (this.validCapacityIn == null) {
            this.validCapacityIn = new ArrayList<Long>();
        }
        this.validCapacityIn.add(validCapacityInItem);
        return this;
    }

    /**
     * Get validCapacityIn
     *
     * @return validCapacityIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getValidCapacityIn() {
        return validCapacityIn;
    }

    public void setValidCapacityIn(List<Long> validCapacityIn) {
        this.validCapacityIn = validCapacityIn;
    }

    public BackupRestorePointWhereInput validCapacityIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VALID_CAPACITY_IN);
        return this;
    }

    public BackupRestorePointWhereInput validCapacityIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VALID_CAPACITY_IN);
        return this;
    }

    public void setValidCapacityIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VALID_CAPACITY_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VALID_CAPACITY_IN);
        }
    }

    public boolean getValidCapacityIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VALID_CAPACITY_IN);
    }

    public BackupRestorePointWhereInput validCapacityLt(Long validCapacityLt) {

        this.validCapacityLt = validCapacityLt;
        return this;
    }

    /**
     * Get validCapacityLt
     *
     * @return validCapacityLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getValidCapacityLt() {
        return validCapacityLt;
    }

    public void setValidCapacityLt(Long validCapacityLt) {
        this.validCapacityLt = validCapacityLt;
    }

    public BackupRestorePointWhereInput validCapacityLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VALID_CAPACITY_LT);
        return this;
    }

    public BackupRestorePointWhereInput validCapacityLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VALID_CAPACITY_LT);
        return this;
    }

    public void setValidCapacityLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VALID_CAPACITY_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VALID_CAPACITY_LT);
        }
    }

    public boolean getValidCapacityLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VALID_CAPACITY_LT);
    }

    public BackupRestorePointWhereInput validCapacityLte(Long validCapacityLte) {

        this.validCapacityLte = validCapacityLte;
        return this;
    }

    /**
     * Get validCapacityLte
     *
     * @return validCapacityLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getValidCapacityLte() {
        return validCapacityLte;
    }

    public void setValidCapacityLte(Long validCapacityLte) {
        this.validCapacityLte = validCapacityLte;
    }

    public BackupRestorePointWhereInput validCapacityLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VALID_CAPACITY_LTE);
        return this;
    }

    public BackupRestorePointWhereInput validCapacityLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VALID_CAPACITY_LTE);
        return this;
    }

    public void setValidCapacityLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VALID_CAPACITY_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VALID_CAPACITY_LTE);
        }
    }

    public boolean getValidCapacityLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VALID_CAPACITY_LTE);
    }

    public BackupRestorePointWhereInput validCapacityNot(Long validCapacityNot) {

        this.validCapacityNot = validCapacityNot;
        return this;
    }

    /**
     * Get validCapacityNot
     *
     * @return validCapacityNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getValidCapacityNot() {
        return validCapacityNot;
    }

    public void setValidCapacityNot(Long validCapacityNot) {
        this.validCapacityNot = validCapacityNot;
    }

    public BackupRestorePointWhereInput validCapacityNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VALID_CAPACITY_NOT);
        return this;
    }

    public BackupRestorePointWhereInput validCapacityNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VALID_CAPACITY_NOT);
        return this;
    }

    public void setValidCapacityNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VALID_CAPACITY_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VALID_CAPACITY_NOT);
        }
    }

    public boolean getValidCapacityNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VALID_CAPACITY_NOT);
    }

    public BackupRestorePointWhereInput validCapacityNotIn(List<Long> validCapacityNotIn) {

        this.validCapacityNotIn = validCapacityNotIn;
        return this;
    }

    public BackupRestorePointWhereInput addValidCapacityNotInItem(Long validCapacityNotInItem) {
        if (this.validCapacityNotIn == null) {
            this.validCapacityNotIn = new ArrayList<Long>();
        }
        this.validCapacityNotIn.add(validCapacityNotInItem);
        return this;
    }

    /**
     * Get validCapacityNotIn
     *
     * @return validCapacityNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getValidCapacityNotIn() {
        return validCapacityNotIn;
    }

    public void setValidCapacityNotIn(List<Long> validCapacityNotIn) {
        this.validCapacityNotIn = validCapacityNotIn;
    }

    public BackupRestorePointWhereInput validCapacityNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VALID_CAPACITY_NOT_IN);
        return this;
    }

    public BackupRestorePointWhereInput validCapacityNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VALID_CAPACITY_NOT_IN);
        return this;
    }

    public void setValidCapacityNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VALID_CAPACITY_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VALID_CAPACITY_NOT_IN);
        }
    }

    public boolean getValidCapacityNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VALID_CAPACITY_NOT_IN);
    }

    public BackupRestorePointWhereInput validSize(Long validSize) {

        this.validSize = validSize;
        return this;
    }

    /**
     * Get validSize
     *
     * @return validSize
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getValidSize() {
        return validSize;
    }

    public void setValidSize(Long validSize) {
        this.validSize = validSize;
    }

    public BackupRestorePointWhereInput validSize_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VALID_SIZE);
        return this;
    }

    public BackupRestorePointWhereInput validSize_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VALID_SIZE);
        return this;
    }

    public void setValidSize_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VALID_SIZE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VALID_SIZE);
        }
    }

    public boolean getValidSize_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VALID_SIZE);
    }

    public BackupRestorePointWhereInput validSizeGt(Long validSizeGt) {

        this.validSizeGt = validSizeGt;
        return this;
    }

    /**
     * Get validSizeGt
     *
     * @return validSizeGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getValidSizeGt() {
        return validSizeGt;
    }

    public void setValidSizeGt(Long validSizeGt) {
        this.validSizeGt = validSizeGt;
    }

    public BackupRestorePointWhereInput validSizeGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VALID_SIZE_GT);
        return this;
    }

    public BackupRestorePointWhereInput validSizeGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VALID_SIZE_GT);
        return this;
    }

    public void setValidSizeGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VALID_SIZE_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VALID_SIZE_GT);
        }
    }

    public boolean getValidSizeGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VALID_SIZE_GT);
    }

    public BackupRestorePointWhereInput validSizeGte(Long validSizeGte) {

        this.validSizeGte = validSizeGte;
        return this;
    }

    /**
     * Get validSizeGte
     *
     * @return validSizeGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getValidSizeGte() {
        return validSizeGte;
    }

    public void setValidSizeGte(Long validSizeGte) {
        this.validSizeGte = validSizeGte;
    }

    public BackupRestorePointWhereInput validSizeGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VALID_SIZE_GTE);
        return this;
    }

    public BackupRestorePointWhereInput validSizeGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VALID_SIZE_GTE);
        return this;
    }

    public void setValidSizeGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VALID_SIZE_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VALID_SIZE_GTE);
        }
    }

    public boolean getValidSizeGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VALID_SIZE_GTE);
    }

    public BackupRestorePointWhereInput validSizeIn(List<Long> validSizeIn) {

        this.validSizeIn = validSizeIn;
        return this;
    }

    public BackupRestorePointWhereInput addValidSizeInItem(Long validSizeInItem) {
        if (this.validSizeIn == null) {
            this.validSizeIn = new ArrayList<Long>();
        }
        this.validSizeIn.add(validSizeInItem);
        return this;
    }

    /**
     * Get validSizeIn
     *
     * @return validSizeIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getValidSizeIn() {
        return validSizeIn;
    }

    public void setValidSizeIn(List<Long> validSizeIn) {
        this.validSizeIn = validSizeIn;
    }

    public BackupRestorePointWhereInput validSizeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VALID_SIZE_IN);
        return this;
    }

    public BackupRestorePointWhereInput validSizeIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VALID_SIZE_IN);
        return this;
    }

    public void setValidSizeIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VALID_SIZE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VALID_SIZE_IN);
        }
    }

    public boolean getValidSizeIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VALID_SIZE_IN);
    }

    public BackupRestorePointWhereInput validSizeLt(Long validSizeLt) {

        this.validSizeLt = validSizeLt;
        return this;
    }

    /**
     * Get validSizeLt
     *
     * @return validSizeLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getValidSizeLt() {
        return validSizeLt;
    }

    public void setValidSizeLt(Long validSizeLt) {
        this.validSizeLt = validSizeLt;
    }

    public BackupRestorePointWhereInput validSizeLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VALID_SIZE_LT);
        return this;
    }

    public BackupRestorePointWhereInput validSizeLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VALID_SIZE_LT);
        return this;
    }

    public void setValidSizeLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VALID_SIZE_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VALID_SIZE_LT);
        }
    }

    public boolean getValidSizeLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VALID_SIZE_LT);
    }

    public BackupRestorePointWhereInput validSizeLte(Long validSizeLte) {

        this.validSizeLte = validSizeLte;
        return this;
    }

    /**
     * Get validSizeLte
     *
     * @return validSizeLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getValidSizeLte() {
        return validSizeLte;
    }

    public void setValidSizeLte(Long validSizeLte) {
        this.validSizeLte = validSizeLte;
    }

    public BackupRestorePointWhereInput validSizeLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VALID_SIZE_LTE);
        return this;
    }

    public BackupRestorePointWhereInput validSizeLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VALID_SIZE_LTE);
        return this;
    }

    public void setValidSizeLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VALID_SIZE_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VALID_SIZE_LTE);
        }
    }

    public boolean getValidSizeLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VALID_SIZE_LTE);
    }

    public BackupRestorePointWhereInput validSizeNot(Long validSizeNot) {

        this.validSizeNot = validSizeNot;
        return this;
    }

    /**
     * Get validSizeNot
     *
     * @return validSizeNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getValidSizeNot() {
        return validSizeNot;
    }

    public void setValidSizeNot(Long validSizeNot) {
        this.validSizeNot = validSizeNot;
    }

    public BackupRestorePointWhereInput validSizeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VALID_SIZE_NOT);
        return this;
    }

    public BackupRestorePointWhereInput validSizeNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VALID_SIZE_NOT);
        return this;
    }

    public void setValidSizeNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VALID_SIZE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VALID_SIZE_NOT);
        }
    }

    public boolean getValidSizeNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VALID_SIZE_NOT);
    }

    public BackupRestorePointWhereInput validSizeNotIn(List<Long> validSizeNotIn) {

        this.validSizeNotIn = validSizeNotIn;
        return this;
    }

    public BackupRestorePointWhereInput addValidSizeNotInItem(Long validSizeNotInItem) {
        if (this.validSizeNotIn == null) {
            this.validSizeNotIn = new ArrayList<Long>();
        }
        this.validSizeNotIn.add(validSizeNotInItem);
        return this;
    }

    /**
     * Get validSizeNotIn
     *
     * @return validSizeNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getValidSizeNotIn() {
        return validSizeNotIn;
    }

    public void setValidSizeNotIn(List<Long> validSizeNotIn) {
        this.validSizeNotIn = validSizeNotIn;
    }

    public BackupRestorePointWhereInput validSizeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VALID_SIZE_NOT_IN);
        return this;
    }

    public BackupRestorePointWhereInput validSizeNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VALID_SIZE_NOT_IN);
        return this;
    }

    public void setValidSizeNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VALID_SIZE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VALID_SIZE_NOT_IN);
        }
    }

    public boolean getValidSizeNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VALID_SIZE_NOT_IN);
    }

    public BackupRestorePointWhereInput vm(VmWhereInput vm) {

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

    public BackupRestorePointWhereInput vm_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM);
        return this;
    }

    public BackupRestorePointWhereInput vm_ExplictlyNonNull() {
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

    public BackupRestorePointWhereInput vmLocalId(String vmLocalId) {

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

    public BackupRestorePointWhereInput vmLocalId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_LOCAL_ID);
        return this;
    }

    public BackupRestorePointWhereInput vmLocalId_ExplictlyNonNull() {
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

    public BackupRestorePointWhereInput vmLocalIdContains(String vmLocalIdContains) {

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

    public BackupRestorePointWhereInput vmLocalIdContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_LOCAL_ID_CONTAINS);
        return this;
    }

    public BackupRestorePointWhereInput vmLocalIdContains_ExplictlyNonNull() {
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

    public BackupRestorePointWhereInput vmLocalIdEndsWith(String vmLocalIdEndsWith) {

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

    public BackupRestorePointWhereInput vmLocalIdEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_LOCAL_ID_ENDS_WITH);
        return this;
    }

    public BackupRestorePointWhereInput vmLocalIdEndsWith_ExplictlyNonNull() {
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

    public BackupRestorePointWhereInput vmLocalIdGt(String vmLocalIdGt) {

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

    public BackupRestorePointWhereInput vmLocalIdGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_LOCAL_ID_GT);
        return this;
    }

    public BackupRestorePointWhereInput vmLocalIdGt_ExplictlyNonNull() {
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

    public BackupRestorePointWhereInput vmLocalIdGte(String vmLocalIdGte) {

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

    public BackupRestorePointWhereInput vmLocalIdGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_LOCAL_ID_GTE);
        return this;
    }

    public BackupRestorePointWhereInput vmLocalIdGte_ExplictlyNonNull() {
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

    public BackupRestorePointWhereInput vmLocalIdIn(List<String> vmLocalIdIn) {

        this.vmLocalIdIn = vmLocalIdIn;
        return this;
    }

    public BackupRestorePointWhereInput addVmLocalIdInItem(String vmLocalIdInItem) {
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

    public BackupRestorePointWhereInput vmLocalIdIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_LOCAL_ID_IN);
        return this;
    }

    public BackupRestorePointWhereInput vmLocalIdIn_ExplictlyNonNull() {
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

    public BackupRestorePointWhereInput vmLocalIdLt(String vmLocalIdLt) {

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

    public BackupRestorePointWhereInput vmLocalIdLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_LOCAL_ID_LT);
        return this;
    }

    public BackupRestorePointWhereInput vmLocalIdLt_ExplictlyNonNull() {
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

    public BackupRestorePointWhereInput vmLocalIdLte(String vmLocalIdLte) {

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

    public BackupRestorePointWhereInput vmLocalIdLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_LOCAL_ID_LTE);
        return this;
    }

    public BackupRestorePointWhereInput vmLocalIdLte_ExplictlyNonNull() {
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

    public BackupRestorePointWhereInput vmLocalIdNot(String vmLocalIdNot) {

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

    public BackupRestorePointWhereInput vmLocalIdNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_LOCAL_ID_NOT);
        return this;
    }

    public BackupRestorePointWhereInput vmLocalIdNot_ExplictlyNonNull() {
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

    public BackupRestorePointWhereInput vmLocalIdNotContains(String vmLocalIdNotContains) {

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

    public BackupRestorePointWhereInput vmLocalIdNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_LOCAL_ID_NOT_CONTAINS);
        return this;
    }

    public BackupRestorePointWhereInput vmLocalIdNotContains_ExplictlyNonNull() {
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

    public BackupRestorePointWhereInput vmLocalIdNotEndsWith(String vmLocalIdNotEndsWith) {

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

    public BackupRestorePointWhereInput vmLocalIdNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_LOCAL_ID_NOT_ENDS_WITH);
        return this;
    }

    public BackupRestorePointWhereInput vmLocalIdNotEndsWith_ExplictlyNonNull() {
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

    public BackupRestorePointWhereInput vmLocalIdNotIn(List<String> vmLocalIdNotIn) {

        this.vmLocalIdNotIn = vmLocalIdNotIn;
        return this;
    }

    public BackupRestorePointWhereInput addVmLocalIdNotInItem(String vmLocalIdNotInItem) {
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

    public BackupRestorePointWhereInput vmLocalIdNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_LOCAL_ID_NOT_IN);
        return this;
    }

    public BackupRestorePointWhereInput vmLocalIdNotIn_ExplictlyNonNull() {
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

    public BackupRestorePointWhereInput vmLocalIdNotStartsWith(String vmLocalIdNotStartsWith) {

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

    public BackupRestorePointWhereInput vmLocalIdNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_LOCAL_ID_NOT_STARTS_WITH);
        return this;
    }

    public BackupRestorePointWhereInput vmLocalIdNotStartsWith_ExplictlyNonNull() {
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

    public BackupRestorePointWhereInput vmLocalIdStartsWith(String vmLocalIdStartsWith) {

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

    public BackupRestorePointWhereInput vmLocalIdStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_LOCAL_ID_STARTS_WITH);
        return this;
    }

    public BackupRestorePointWhereInput vmLocalIdStartsWith_ExplictlyNonNull() {
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

    public BackupRestorePointWhereInput vmName(String vmName) {

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

    public BackupRestorePointWhereInput vmName_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_NAME);
        return this;
    }

    public BackupRestorePointWhereInput vmName_ExplictlyNonNull() {
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

    public BackupRestorePointWhereInput vmNameContains(String vmNameContains) {

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

    public BackupRestorePointWhereInput vmNameContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_NAME_CONTAINS);
        return this;
    }

    public BackupRestorePointWhereInput vmNameContains_ExplictlyNonNull() {
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

    public BackupRestorePointWhereInput vmNameEndsWith(String vmNameEndsWith) {

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

    public BackupRestorePointWhereInput vmNameEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_NAME_ENDS_WITH);
        return this;
    }

    public BackupRestorePointWhereInput vmNameEndsWith_ExplictlyNonNull() {
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

    public BackupRestorePointWhereInput vmNameGt(String vmNameGt) {

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

    public BackupRestorePointWhereInput vmNameGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_NAME_GT);
        return this;
    }

    public BackupRestorePointWhereInput vmNameGt_ExplictlyNonNull() {
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

    public BackupRestorePointWhereInput vmNameGte(String vmNameGte) {

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

    public BackupRestorePointWhereInput vmNameGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_NAME_GTE);
        return this;
    }

    public BackupRestorePointWhereInput vmNameGte_ExplictlyNonNull() {
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

    public BackupRestorePointWhereInput vmNameIn(List<String> vmNameIn) {

        this.vmNameIn = vmNameIn;
        return this;
    }

    public BackupRestorePointWhereInput addVmNameInItem(String vmNameInItem) {
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

    public BackupRestorePointWhereInput vmNameIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_NAME_IN);
        return this;
    }

    public BackupRestorePointWhereInput vmNameIn_ExplictlyNonNull() {
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

    public BackupRestorePointWhereInput vmNameLt(String vmNameLt) {

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

    public BackupRestorePointWhereInput vmNameLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_NAME_LT);
        return this;
    }

    public BackupRestorePointWhereInput vmNameLt_ExplictlyNonNull() {
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

    public BackupRestorePointWhereInput vmNameLte(String vmNameLte) {

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

    public BackupRestorePointWhereInput vmNameLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_NAME_LTE);
        return this;
    }

    public BackupRestorePointWhereInput vmNameLte_ExplictlyNonNull() {
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

    public BackupRestorePointWhereInput vmNameNot(String vmNameNot) {

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

    public BackupRestorePointWhereInput vmNameNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_NAME_NOT);
        return this;
    }

    public BackupRestorePointWhereInput vmNameNot_ExplictlyNonNull() {
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

    public BackupRestorePointWhereInput vmNameNotContains(String vmNameNotContains) {

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

    public BackupRestorePointWhereInput vmNameNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_NAME_NOT_CONTAINS);
        return this;
    }

    public BackupRestorePointWhereInput vmNameNotContains_ExplictlyNonNull() {
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

    public BackupRestorePointWhereInput vmNameNotEndsWith(String vmNameNotEndsWith) {

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

    public BackupRestorePointWhereInput vmNameNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_NAME_NOT_ENDS_WITH);
        return this;
    }

    public BackupRestorePointWhereInput vmNameNotEndsWith_ExplictlyNonNull() {
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

    public BackupRestorePointWhereInput vmNameNotIn(List<String> vmNameNotIn) {

        this.vmNameNotIn = vmNameNotIn;
        return this;
    }

    public BackupRestorePointWhereInput addVmNameNotInItem(String vmNameNotInItem) {
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

    public BackupRestorePointWhereInput vmNameNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_NAME_NOT_IN);
        return this;
    }

    public BackupRestorePointWhereInput vmNameNotIn_ExplictlyNonNull() {
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

    public BackupRestorePointWhereInput vmNameNotStartsWith(String vmNameNotStartsWith) {

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

    public BackupRestorePointWhereInput vmNameNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_NAME_NOT_STARTS_WITH);
        return this;
    }

    public BackupRestorePointWhereInput vmNameNotStartsWith_ExplictlyNonNull() {
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

    public BackupRestorePointWhereInput vmNameStartsWith(String vmNameStartsWith) {

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

    public BackupRestorePointWhereInput vmNameStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM_NAME_STARTS_WITH);
        return this;
    }

    public BackupRestorePointWhereInput vmNameStartsWith_ExplictlyNonNull() {
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
        BackupRestorePointWhereInput backupRestorePointWhereInput =
                (BackupRestorePointWhereInput) o;
        return Objects.equals(this.AND, backupRestorePointWhereInput.AND)
                && Objects.equals(this.NOT, backupRestorePointWhereInput.NOT)
                && Objects.equals(this.OR, backupRestorePointWhereInput.OR)
                && Objects.equals(this.backupPlan, backupRestorePointWhereInput.backupPlan)
                && Objects.equals(
                        this.backupRestoreExecutionsEvery,
                        backupRestorePointWhereInput.backupRestoreExecutionsEvery)
                && Objects.equals(
                        this.backupRestoreExecutionsNone,
                        backupRestorePointWhereInput.backupRestoreExecutionsNone)
                && Objects.equals(
                        this.backupRestoreExecutionsSome,
                        backupRestorePointWhereInput.backupRestoreExecutionsSome)
                && Objects.equals(
                        this.backupTargetExecution,
                        backupRestorePointWhereInput.backupTargetExecution)
                && Objects.equals(this.clusterLocalId, backupRestorePointWhereInput.clusterLocalId)
                && Objects.equals(
                        this.clusterLocalIdContains,
                        backupRestorePointWhereInput.clusterLocalIdContains)
                && Objects.equals(
                        this.clusterLocalIdEndsWith,
                        backupRestorePointWhereInput.clusterLocalIdEndsWith)
                && Objects.equals(
                        this.clusterLocalIdGt, backupRestorePointWhereInput.clusterLocalIdGt)
                && Objects.equals(
                        this.clusterLocalIdGte, backupRestorePointWhereInput.clusterLocalIdGte)
                && Objects.equals(
                        this.clusterLocalIdIn, backupRestorePointWhereInput.clusterLocalIdIn)
                && Objects.equals(
                        this.clusterLocalIdLt, backupRestorePointWhereInput.clusterLocalIdLt)
                && Objects.equals(
                        this.clusterLocalIdLte, backupRestorePointWhereInput.clusterLocalIdLte)
                && Objects.equals(
                        this.clusterLocalIdNot, backupRestorePointWhereInput.clusterLocalIdNot)
                && Objects.equals(
                        this.clusterLocalIdNotContains,
                        backupRestorePointWhereInput.clusterLocalIdNotContains)
                && Objects.equals(
                        this.clusterLocalIdNotEndsWith,
                        backupRestorePointWhereInput.clusterLocalIdNotEndsWith)
                && Objects.equals(
                        this.clusterLocalIdNotIn, backupRestorePointWhereInput.clusterLocalIdNotIn)
                && Objects.equals(
                        this.clusterLocalIdNotStartsWith,
                        backupRestorePointWhereInput.clusterLocalIdNotStartsWith)
                && Objects.equals(
                        this.clusterLocalIdStartsWith,
                        backupRestorePointWhereInput.clusterLocalIdStartsWith)
                && Objects.equals(this.compressed, backupRestorePointWhereInput.compressed)
                && Objects.equals(this.compressedNot, backupRestorePointWhereInput.compressedNot)
                && Objects.equals(
                        this.compressionRatio, backupRestorePointWhereInput.compressionRatio)
                && Objects.equals(
                        this.compressionRatioGt, backupRestorePointWhereInput.compressionRatioGt)
                && Objects.equals(
                        this.compressionRatioGte, backupRestorePointWhereInput.compressionRatioGte)
                && Objects.equals(
                        this.compressionRatioIn, backupRestorePointWhereInput.compressionRatioIn)
                && Objects.equals(
                        this.compressionRatioLt, backupRestorePointWhereInput.compressionRatioLt)
                && Objects.equals(
                        this.compressionRatioLte, backupRestorePointWhereInput.compressionRatioLte)
                && Objects.equals(
                        this.compressionRatioNot, backupRestorePointWhereInput.compressionRatioNot)
                && Objects.equals(
                        this.compressionRatioNotIn,
                        backupRestorePointWhereInput.compressionRatioNotIn)
                && Objects.equals(this.creation, backupRestorePointWhereInput.creation)
                && Objects.equals(this.creationIn, backupRestorePointWhereInput.creationIn)
                && Objects.equals(this.creationNot, backupRestorePointWhereInput.creationNot)
                && Objects.equals(this.creationNotIn, backupRestorePointWhereInput.creationNotIn)
                && Objects.equals(
                        this.entityAsyncStatus, backupRestorePointWhereInput.entityAsyncStatus)
                && Objects.equals(
                        this.entityAsyncStatusIn, backupRestorePointWhereInput.entityAsyncStatusIn)
                && Objects.equals(
                        this.entityAsyncStatusNot,
                        backupRestorePointWhereInput.entityAsyncStatusNot)
                && Objects.equals(
                        this.entityAsyncStatusNotIn,
                        backupRestorePointWhereInput.entityAsyncStatusNotIn)
                && Objects.equals(this.id, backupRestorePointWhereInput.id)
                && Objects.equals(this.idContains, backupRestorePointWhereInput.idContains)
                && Objects.equals(this.idEndsWith, backupRestorePointWhereInput.idEndsWith)
                && Objects.equals(this.idGt, backupRestorePointWhereInput.idGt)
                && Objects.equals(this.idGte, backupRestorePointWhereInput.idGte)
                && Objects.equals(this.idIn, backupRestorePointWhereInput.idIn)
                && Objects.equals(this.idLt, backupRestorePointWhereInput.idLt)
                && Objects.equals(this.idLte, backupRestorePointWhereInput.idLte)
                && Objects.equals(this.idNot, backupRestorePointWhereInput.idNot)
                && Objects.equals(this.idNotContains, backupRestorePointWhereInput.idNotContains)
                && Objects.equals(this.idNotEndsWith, backupRestorePointWhereInput.idNotEndsWith)
                && Objects.equals(this.idNotIn, backupRestorePointWhereInput.idNotIn)
                && Objects.equals(
                        this.idNotStartsWith, backupRestorePointWhereInput.idNotStartsWith)
                && Objects.equals(this.idStartsWith, backupRestorePointWhereInput.idStartsWith)
                && Objects.equals(this.localCreatedAt, backupRestorePointWhereInput.localCreatedAt)
                && Objects.equals(
                        this.localCreatedAtGt, backupRestorePointWhereInput.localCreatedAtGt)
                && Objects.equals(
                        this.localCreatedAtGte, backupRestorePointWhereInput.localCreatedAtGte)
                && Objects.equals(
                        this.localCreatedAtIn, backupRestorePointWhereInput.localCreatedAtIn)
                && Objects.equals(
                        this.localCreatedAtLt, backupRestorePointWhereInput.localCreatedAtLt)
                && Objects.equals(
                        this.localCreatedAtLte, backupRestorePointWhereInput.localCreatedAtLte)
                && Objects.equals(
                        this.localCreatedAtNot, backupRestorePointWhereInput.localCreatedAtNot)
                && Objects.equals(
                        this.localCreatedAtNotIn, backupRestorePointWhereInput.localCreatedAtNotIn)
                && Objects.equals(this.localId, backupRestorePointWhereInput.localId)
                && Objects.equals(
                        this.localIdContains, backupRestorePointWhereInput.localIdContains)
                && Objects.equals(
                        this.localIdEndsWith, backupRestorePointWhereInput.localIdEndsWith)
                && Objects.equals(this.localIdGt, backupRestorePointWhereInput.localIdGt)
                && Objects.equals(this.localIdGte, backupRestorePointWhereInput.localIdGte)
                && Objects.equals(this.localIdIn, backupRestorePointWhereInput.localIdIn)
                && Objects.equals(this.localIdLt, backupRestorePointWhereInput.localIdLt)
                && Objects.equals(this.localIdLte, backupRestorePointWhereInput.localIdLte)
                && Objects.equals(this.localIdNot, backupRestorePointWhereInput.localIdNot)
                && Objects.equals(
                        this.localIdNotContains, backupRestorePointWhereInput.localIdNotContains)
                && Objects.equals(
                        this.localIdNotEndsWith, backupRestorePointWhereInput.localIdNotEndsWith)
                && Objects.equals(this.localIdNotIn, backupRestorePointWhereInput.localIdNotIn)
                && Objects.equals(
                        this.localIdNotStartsWith,
                        backupRestorePointWhereInput.localIdNotStartsWith)
                && Objects.equals(
                        this.localIdStartsWith, backupRestorePointWhereInput.localIdStartsWith)
                && Objects.equals(this.logicalSize, backupRestorePointWhereInput.logicalSize)
                && Objects.equals(this.logicalSizeGt, backupRestorePointWhereInput.logicalSizeGt)
                && Objects.equals(this.logicalSizeGte, backupRestorePointWhereInput.logicalSizeGte)
                && Objects.equals(this.logicalSizeIn, backupRestorePointWhereInput.logicalSizeIn)
                && Objects.equals(this.logicalSizeLt, backupRestorePointWhereInput.logicalSizeLt)
                && Objects.equals(this.logicalSizeLte, backupRestorePointWhereInput.logicalSizeLte)
                && Objects.equals(this.logicalSizeNot, backupRestorePointWhereInput.logicalSizeNot)
                && Objects.equals(
                        this.logicalSizeNotIn, backupRestorePointWhereInput.logicalSizeNotIn)
                && Objects.equals(
                        this.parentRestorePoint, backupRestorePointWhereInput.parentRestorePoint)
                && Objects.equals(
                        this.parentRestorePointContains,
                        backupRestorePointWhereInput.parentRestorePointContains)
                && Objects.equals(
                        this.parentRestorePointEndsWith,
                        backupRestorePointWhereInput.parentRestorePointEndsWith)
                && Objects.equals(
                        this.parentRestorePointGt,
                        backupRestorePointWhereInput.parentRestorePointGt)
                && Objects.equals(
                        this.parentRestorePointGte,
                        backupRestorePointWhereInput.parentRestorePointGte)
                && Objects.equals(
                        this.parentRestorePointIn,
                        backupRestorePointWhereInput.parentRestorePointIn)
                && Objects.equals(
                        this.parentRestorePointLt,
                        backupRestorePointWhereInput.parentRestorePointLt)
                && Objects.equals(
                        this.parentRestorePointLte,
                        backupRestorePointWhereInput.parentRestorePointLte)
                && Objects.equals(
                        this.parentRestorePointNot,
                        backupRestorePointWhereInput.parentRestorePointNot)
                && Objects.equals(
                        this.parentRestorePointNotContains,
                        backupRestorePointWhereInput.parentRestorePointNotContains)
                && Objects.equals(
                        this.parentRestorePointNotEndsWith,
                        backupRestorePointWhereInput.parentRestorePointNotEndsWith)
                && Objects.equals(
                        this.parentRestorePointNotIn,
                        backupRestorePointWhereInput.parentRestorePointNotIn)
                && Objects.equals(
                        this.parentRestorePointNotStartsWith,
                        backupRestorePointWhereInput.parentRestorePointNotStartsWith)
                && Objects.equals(
                        this.parentRestorePointStartsWith,
                        backupRestorePointWhereInput.parentRestorePointStartsWith)
                && Objects.equals(this.physicalSize, backupRestorePointWhereInput.physicalSize)
                && Objects.equals(this.physicalSizeGt, backupRestorePointWhereInput.physicalSizeGt)
                && Objects.equals(
                        this.physicalSizeGte, backupRestorePointWhereInput.physicalSizeGte)
                && Objects.equals(this.physicalSizeIn, backupRestorePointWhereInput.physicalSizeIn)
                && Objects.equals(this.physicalSizeLt, backupRestorePointWhereInput.physicalSizeLt)
                && Objects.equals(
                        this.physicalSizeLte, backupRestorePointWhereInput.physicalSizeLte)
                && Objects.equals(
                        this.physicalSizeNot, backupRestorePointWhereInput.physicalSizeNot)
                && Objects.equals(
                        this.physicalSizeNotIn, backupRestorePointWhereInput.physicalSizeNotIn)
                && Objects.equals(this.size, backupRestorePointWhereInput.size)
                && Objects.equals(this.sizeGt, backupRestorePointWhereInput.sizeGt)
                && Objects.equals(this.sizeGte, backupRestorePointWhereInput.sizeGte)
                && Objects.equals(this.sizeIn, backupRestorePointWhereInput.sizeIn)
                && Objects.equals(this.sizeLt, backupRestorePointWhereInput.sizeLt)
                && Objects.equals(this.sizeLte, backupRestorePointWhereInput.sizeLte)
                && Objects.equals(this.sizeNot, backupRestorePointWhereInput.sizeNot)
                && Objects.equals(this.sizeNotIn, backupRestorePointWhereInput.sizeNotIn)
                && Objects.equals(this.slice, backupRestorePointWhereInput.slice)
                && Objects.equals(this.sliceContains, backupRestorePointWhereInput.sliceContains)
                && Objects.equals(this.sliceEndsWith, backupRestorePointWhereInput.sliceEndsWith)
                && Objects.equals(this.sliceGt, backupRestorePointWhereInput.sliceGt)
                && Objects.equals(this.sliceGte, backupRestorePointWhereInput.sliceGte)
                && Objects.equals(this.sliceIn, backupRestorePointWhereInput.sliceIn)
                && Objects.equals(this.sliceLt, backupRestorePointWhereInput.sliceLt)
                && Objects.equals(this.sliceLte, backupRestorePointWhereInput.sliceLte)
                && Objects.equals(this.sliceNot, backupRestorePointWhereInput.sliceNot)
                && Objects.equals(
                        this.sliceNotContains, backupRestorePointWhereInput.sliceNotContains)
                && Objects.equals(
                        this.sliceNotEndsWith, backupRestorePointWhereInput.sliceNotEndsWith)
                && Objects.equals(this.sliceNotIn, backupRestorePointWhereInput.sliceNotIn)
                && Objects.equals(
                        this.sliceNotStartsWith, backupRestorePointWhereInput.sliceNotStartsWith)
                && Objects.equals(
                        this.sliceStartsWith, backupRestorePointWhereInput.sliceStartsWith)
                && Objects.equals(
                        this.snapshotConsistentType,
                        backupRestorePointWhereInput.snapshotConsistentType)
                && Objects.equals(
                        this.snapshotConsistentTypeIn,
                        backupRestorePointWhereInput.snapshotConsistentTypeIn)
                && Objects.equals(
                        this.snapshotConsistentTypeNot,
                        backupRestorePointWhereInput.snapshotConsistentTypeNot)
                && Objects.equals(
                        this.snapshotConsistentTypeNotIn,
                        backupRestorePointWhereInput.snapshotConsistentTypeNotIn)
                && Objects.equals(this.type, backupRestorePointWhereInput.type)
                && Objects.equals(this.typeIn, backupRestorePointWhereInput.typeIn)
                && Objects.equals(this.typeNot, backupRestorePointWhereInput.typeNot)
                && Objects.equals(this.typeNotIn, backupRestorePointWhereInput.typeNotIn)
                && Objects.equals(this.validCapacity, backupRestorePointWhereInput.validCapacity)
                && Objects.equals(
                        this.validCapacityGt, backupRestorePointWhereInput.validCapacityGt)
                && Objects.equals(
                        this.validCapacityGte, backupRestorePointWhereInput.validCapacityGte)
                && Objects.equals(
                        this.validCapacityIn, backupRestorePointWhereInput.validCapacityIn)
                && Objects.equals(
                        this.validCapacityLt, backupRestorePointWhereInput.validCapacityLt)
                && Objects.equals(
                        this.validCapacityLte, backupRestorePointWhereInput.validCapacityLte)
                && Objects.equals(
                        this.validCapacityNot, backupRestorePointWhereInput.validCapacityNot)
                && Objects.equals(
                        this.validCapacityNotIn, backupRestorePointWhereInput.validCapacityNotIn)
                && Objects.equals(this.validSize, backupRestorePointWhereInput.validSize)
                && Objects.equals(this.validSizeGt, backupRestorePointWhereInput.validSizeGt)
                && Objects.equals(this.validSizeGte, backupRestorePointWhereInput.validSizeGte)
                && Objects.equals(this.validSizeIn, backupRestorePointWhereInput.validSizeIn)
                && Objects.equals(this.validSizeLt, backupRestorePointWhereInput.validSizeLt)
                && Objects.equals(this.validSizeLte, backupRestorePointWhereInput.validSizeLte)
                && Objects.equals(this.validSizeNot, backupRestorePointWhereInput.validSizeNot)
                && Objects.equals(this.validSizeNotIn, backupRestorePointWhereInput.validSizeNotIn)
                && Objects.equals(this.vm, backupRestorePointWhereInput.vm)
                && Objects.equals(this.vmLocalId, backupRestorePointWhereInput.vmLocalId)
                && Objects.equals(
                        this.vmLocalIdContains, backupRestorePointWhereInput.vmLocalIdContains)
                && Objects.equals(
                        this.vmLocalIdEndsWith, backupRestorePointWhereInput.vmLocalIdEndsWith)
                && Objects.equals(this.vmLocalIdGt, backupRestorePointWhereInput.vmLocalIdGt)
                && Objects.equals(this.vmLocalIdGte, backupRestorePointWhereInput.vmLocalIdGte)
                && Objects.equals(this.vmLocalIdIn, backupRestorePointWhereInput.vmLocalIdIn)
                && Objects.equals(this.vmLocalIdLt, backupRestorePointWhereInput.vmLocalIdLt)
                && Objects.equals(this.vmLocalIdLte, backupRestorePointWhereInput.vmLocalIdLte)
                && Objects.equals(this.vmLocalIdNot, backupRestorePointWhereInput.vmLocalIdNot)
                && Objects.equals(
                        this.vmLocalIdNotContains,
                        backupRestorePointWhereInput.vmLocalIdNotContains)
                && Objects.equals(
                        this.vmLocalIdNotEndsWith,
                        backupRestorePointWhereInput.vmLocalIdNotEndsWith)
                && Objects.equals(this.vmLocalIdNotIn, backupRestorePointWhereInput.vmLocalIdNotIn)
                && Objects.equals(
                        this.vmLocalIdNotStartsWith,
                        backupRestorePointWhereInput.vmLocalIdNotStartsWith)
                && Objects.equals(
                        this.vmLocalIdStartsWith, backupRestorePointWhereInput.vmLocalIdStartsWith)
                && Objects.equals(this.vmName, backupRestorePointWhereInput.vmName)
                && Objects.equals(this.vmNameContains, backupRestorePointWhereInput.vmNameContains)
                && Objects.equals(this.vmNameEndsWith, backupRestorePointWhereInput.vmNameEndsWith)
                && Objects.equals(this.vmNameGt, backupRestorePointWhereInput.vmNameGt)
                && Objects.equals(this.vmNameGte, backupRestorePointWhereInput.vmNameGte)
                && Objects.equals(this.vmNameIn, backupRestorePointWhereInput.vmNameIn)
                && Objects.equals(this.vmNameLt, backupRestorePointWhereInput.vmNameLt)
                && Objects.equals(this.vmNameLte, backupRestorePointWhereInput.vmNameLte)
                && Objects.equals(this.vmNameNot, backupRestorePointWhereInput.vmNameNot)
                && Objects.equals(
                        this.vmNameNotContains, backupRestorePointWhereInput.vmNameNotContains)
                && Objects.equals(
                        this.vmNameNotEndsWith, backupRestorePointWhereInput.vmNameNotEndsWith)
                && Objects.equals(this.vmNameNotIn, backupRestorePointWhereInput.vmNameNotIn)
                && Objects.equals(
                        this.vmNameNotStartsWith, backupRestorePointWhereInput.vmNameNotStartsWith)
                && Objects.equals(
                        this.vmNameStartsWith, backupRestorePointWhereInput.vmNameStartsWith);
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
                backupPlan,
                backupRestoreExecutionsEvery,
                backupRestoreExecutionsNone,
                backupRestoreExecutionsSome,
                backupTargetExecution,
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
                compressed,
                compressedNot,
                compressionRatio,
                compressionRatioGt,
                compressionRatioGte,
                compressionRatioIn,
                compressionRatioLt,
                compressionRatioLte,
                compressionRatioNot,
                compressionRatioNotIn,
                creation,
                creationIn,
                creationNot,
                creationNotIn,
                entityAsyncStatus,
                entityAsyncStatusIn,
                entityAsyncStatusNot,
                entityAsyncStatusNotIn,
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
                logicalSize,
                logicalSizeGt,
                logicalSizeGte,
                logicalSizeIn,
                logicalSizeLt,
                logicalSizeLte,
                logicalSizeNot,
                logicalSizeNotIn,
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
                physicalSize,
                physicalSizeGt,
                physicalSizeGte,
                physicalSizeIn,
                physicalSizeLt,
                physicalSizeLte,
                physicalSizeNot,
                physicalSizeNotIn,
                size,
                sizeGt,
                sizeGte,
                sizeIn,
                sizeLt,
                sizeLte,
                sizeNot,
                sizeNotIn,
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
                type,
                typeIn,
                typeNot,
                typeNotIn,
                validCapacity,
                validCapacityGt,
                validCapacityGte,
                validCapacityIn,
                validCapacityLt,
                validCapacityLte,
                validCapacityNot,
                validCapacityNotIn,
                validSize,
                validSizeGt,
                validSizeGte,
                validSizeIn,
                validSizeLt,
                validSizeLte,
                validSizeNot,
                validSizeNotIn,
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
        sb.append("class BackupRestorePointWhereInput {\n");
        sb.append("    AND: ").append(toIndentedString(AND)).append("\n");
        sb.append("    NOT: ").append(toIndentedString(NOT)).append("\n");
        sb.append("    OR: ").append(toIndentedString(OR)).append("\n");
        sb.append("    backupPlan: ").append(toIndentedString(backupPlan)).append("\n");
        sb.append("    backupRestoreExecutionsEvery: ")
                .append(toIndentedString(backupRestoreExecutionsEvery))
                .append("\n");
        sb.append("    backupRestoreExecutionsNone: ")
                .append(toIndentedString(backupRestoreExecutionsNone))
                .append("\n");
        sb.append("    backupRestoreExecutionsSome: ")
                .append(toIndentedString(backupRestoreExecutionsSome))
                .append("\n");
        sb.append("    backupTargetExecution: ")
                .append(toIndentedString(backupTargetExecution))
                .append("\n");
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
        sb.append("    compressed: ").append(toIndentedString(compressed)).append("\n");
        sb.append("    compressedNot: ").append(toIndentedString(compressedNot)).append("\n");
        sb.append("    compressionRatio: ").append(toIndentedString(compressionRatio)).append("\n");
        sb.append("    compressionRatioGt: ")
                .append(toIndentedString(compressionRatioGt))
                .append("\n");
        sb.append("    compressionRatioGte: ")
                .append(toIndentedString(compressionRatioGte))
                .append("\n");
        sb.append("    compressionRatioIn: ")
                .append(toIndentedString(compressionRatioIn))
                .append("\n");
        sb.append("    compressionRatioLt: ")
                .append(toIndentedString(compressionRatioLt))
                .append("\n");
        sb.append("    compressionRatioLte: ")
                .append(toIndentedString(compressionRatioLte))
                .append("\n");
        sb.append("    compressionRatioNot: ")
                .append(toIndentedString(compressionRatioNot))
                .append("\n");
        sb.append("    compressionRatioNotIn: ")
                .append(toIndentedString(compressionRatioNotIn))
                .append("\n");
        sb.append("    creation: ").append(toIndentedString(creation)).append("\n");
        sb.append("    creationIn: ").append(toIndentedString(creationIn)).append("\n");
        sb.append("    creationNot: ").append(toIndentedString(creationNot)).append("\n");
        sb.append("    creationNotIn: ").append(toIndentedString(creationNotIn)).append("\n");
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
        sb.append("    logicalSize: ").append(toIndentedString(logicalSize)).append("\n");
        sb.append("    logicalSizeGt: ").append(toIndentedString(logicalSizeGt)).append("\n");
        sb.append("    logicalSizeGte: ").append(toIndentedString(logicalSizeGte)).append("\n");
        sb.append("    logicalSizeIn: ").append(toIndentedString(logicalSizeIn)).append("\n");
        sb.append("    logicalSizeLt: ").append(toIndentedString(logicalSizeLt)).append("\n");
        sb.append("    logicalSizeLte: ").append(toIndentedString(logicalSizeLte)).append("\n");
        sb.append("    logicalSizeNot: ").append(toIndentedString(logicalSizeNot)).append("\n");
        sb.append("    logicalSizeNotIn: ").append(toIndentedString(logicalSizeNotIn)).append("\n");
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
        sb.append("    physicalSize: ").append(toIndentedString(physicalSize)).append("\n");
        sb.append("    physicalSizeGt: ").append(toIndentedString(physicalSizeGt)).append("\n");
        sb.append("    physicalSizeGte: ").append(toIndentedString(physicalSizeGte)).append("\n");
        sb.append("    physicalSizeIn: ").append(toIndentedString(physicalSizeIn)).append("\n");
        sb.append("    physicalSizeLt: ").append(toIndentedString(physicalSizeLt)).append("\n");
        sb.append("    physicalSizeLte: ").append(toIndentedString(physicalSizeLte)).append("\n");
        sb.append("    physicalSizeNot: ").append(toIndentedString(physicalSizeNot)).append("\n");
        sb.append("    physicalSizeNotIn: ")
                .append(toIndentedString(physicalSizeNotIn))
                .append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    sizeGt: ").append(toIndentedString(sizeGt)).append("\n");
        sb.append("    sizeGte: ").append(toIndentedString(sizeGte)).append("\n");
        sb.append("    sizeIn: ").append(toIndentedString(sizeIn)).append("\n");
        sb.append("    sizeLt: ").append(toIndentedString(sizeLt)).append("\n");
        sb.append("    sizeLte: ").append(toIndentedString(sizeLte)).append("\n");
        sb.append("    sizeNot: ").append(toIndentedString(sizeNot)).append("\n");
        sb.append("    sizeNotIn: ").append(toIndentedString(sizeNotIn)).append("\n");
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
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    typeIn: ").append(toIndentedString(typeIn)).append("\n");
        sb.append("    typeNot: ").append(toIndentedString(typeNot)).append("\n");
        sb.append("    typeNotIn: ").append(toIndentedString(typeNotIn)).append("\n");
        sb.append("    validCapacity: ").append(toIndentedString(validCapacity)).append("\n");
        sb.append("    validCapacityGt: ").append(toIndentedString(validCapacityGt)).append("\n");
        sb.append("    validCapacityGte: ").append(toIndentedString(validCapacityGte)).append("\n");
        sb.append("    validCapacityIn: ").append(toIndentedString(validCapacityIn)).append("\n");
        sb.append("    validCapacityLt: ").append(toIndentedString(validCapacityLt)).append("\n");
        sb.append("    validCapacityLte: ").append(toIndentedString(validCapacityLte)).append("\n");
        sb.append("    validCapacityNot: ").append(toIndentedString(validCapacityNot)).append("\n");
        sb.append("    validCapacityNotIn: ")
                .append(toIndentedString(validCapacityNotIn))
                .append("\n");
        sb.append("    validSize: ").append(toIndentedString(validSize)).append("\n");
        sb.append("    validSizeGt: ").append(toIndentedString(validSizeGt)).append("\n");
        sb.append("    validSizeGte: ").append(toIndentedString(validSizeGte)).append("\n");
        sb.append("    validSizeIn: ").append(toIndentedString(validSizeIn)).append("\n");
        sb.append("    validSizeLt: ").append(toIndentedString(validSizeLt)).append("\n");
        sb.append("    validSizeLte: ").append(toIndentedString(validSizeLte)).append("\n");
        sb.append("    validSizeNot: ").append(toIndentedString(validSizeNot)).append("\n");
        sb.append("    validSizeNotIn: ").append(toIndentedString(validSizeNotIn)).append("\n");
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

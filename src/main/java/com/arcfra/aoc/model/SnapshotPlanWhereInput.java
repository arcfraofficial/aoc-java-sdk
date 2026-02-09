package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** SnapshotPlanWhereInput */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class SnapshotPlanWhereInput
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_A_N_D = "AND";

    @SerializedName(SERIALIZED_NAME_A_N_D)
    private List<SnapshotPlanWhereInput> AND = null;

    public static final String SERIALIZED_NAME_N_O_T = "NOT";

    @SerializedName(SERIALIZED_NAME_N_O_T)
    private List<SnapshotPlanWhereInput> NOT = null;

    public static final String SERIALIZED_NAME_O_R = "OR";

    @SerializedName(SERIALIZED_NAME_O_R)
    private List<SnapshotPlanWhereInput> OR = null;

    public static final String SERIALIZED_NAME_AUTO_DELETE_NUM = "auto_delete_num";

    @SerializedName(SERIALIZED_NAME_AUTO_DELETE_NUM)
    private Integer autoDeleteNum;

    public static final String SERIALIZED_NAME_AUTO_DELETE_NUM_GT = "auto_delete_num_gt";

    @SerializedName(SERIALIZED_NAME_AUTO_DELETE_NUM_GT)
    private Integer autoDeleteNumGt;

    public static final String SERIALIZED_NAME_AUTO_DELETE_NUM_GTE = "auto_delete_num_gte";

    @SerializedName(SERIALIZED_NAME_AUTO_DELETE_NUM_GTE)
    private Integer autoDeleteNumGte;

    public static final String SERIALIZED_NAME_AUTO_DELETE_NUM_IN = "auto_delete_num_in";

    @SerializedName(SERIALIZED_NAME_AUTO_DELETE_NUM_IN)
    private List<Integer> autoDeleteNumIn = null;

    public static final String SERIALIZED_NAME_AUTO_DELETE_NUM_LT = "auto_delete_num_lt";

    @SerializedName(SERIALIZED_NAME_AUTO_DELETE_NUM_LT)
    private Integer autoDeleteNumLt;

    public static final String SERIALIZED_NAME_AUTO_DELETE_NUM_LTE = "auto_delete_num_lte";

    @SerializedName(SERIALIZED_NAME_AUTO_DELETE_NUM_LTE)
    private Integer autoDeleteNumLte;

    public static final String SERIALIZED_NAME_AUTO_DELETE_NUM_NOT = "auto_delete_num_not";

    @SerializedName(SERIALIZED_NAME_AUTO_DELETE_NUM_NOT)
    private Integer autoDeleteNumNot;

    public static final String SERIALIZED_NAME_AUTO_DELETE_NUM_NOT_IN = "auto_delete_num_not_in";

    @SerializedName(SERIALIZED_NAME_AUTO_DELETE_NUM_NOT_IN)
    private List<Integer> autoDeleteNumNotIn = null;

    public static final String SERIALIZED_NAME_AUTO_EXECUTE_NUM = "auto_execute_num";

    @SerializedName(SERIALIZED_NAME_AUTO_EXECUTE_NUM)
    private Integer autoExecuteNum;

    public static final String SERIALIZED_NAME_AUTO_EXECUTE_NUM_GT = "auto_execute_num_gt";

    @SerializedName(SERIALIZED_NAME_AUTO_EXECUTE_NUM_GT)
    private Integer autoExecuteNumGt;

    public static final String SERIALIZED_NAME_AUTO_EXECUTE_NUM_GTE = "auto_execute_num_gte";

    @SerializedName(SERIALIZED_NAME_AUTO_EXECUTE_NUM_GTE)
    private Integer autoExecuteNumGte;

    public static final String SERIALIZED_NAME_AUTO_EXECUTE_NUM_IN = "auto_execute_num_in";

    @SerializedName(SERIALIZED_NAME_AUTO_EXECUTE_NUM_IN)
    private List<Integer> autoExecuteNumIn = null;

    public static final String SERIALIZED_NAME_AUTO_EXECUTE_NUM_LT = "auto_execute_num_lt";

    @SerializedName(SERIALIZED_NAME_AUTO_EXECUTE_NUM_LT)
    private Integer autoExecuteNumLt;

    public static final String SERIALIZED_NAME_AUTO_EXECUTE_NUM_LTE = "auto_execute_num_lte";

    @SerializedName(SERIALIZED_NAME_AUTO_EXECUTE_NUM_LTE)
    private Integer autoExecuteNumLte;

    public static final String SERIALIZED_NAME_AUTO_EXECUTE_NUM_NOT = "auto_execute_num_not";

    @SerializedName(SERIALIZED_NAME_AUTO_EXECUTE_NUM_NOT)
    private Integer autoExecuteNumNot;

    public static final String SERIALIZED_NAME_AUTO_EXECUTE_NUM_NOT_IN = "auto_execute_num_not_in";

    @SerializedName(SERIALIZED_NAME_AUTO_EXECUTE_NUM_NOT_IN)
    private List<Integer> autoExecuteNumNotIn = null;

    public static final String SERIALIZED_NAME_CLUSTER = "cluster";

    @SerializedName(SERIALIZED_NAME_CLUSTER)
    private ClusterWhereInput cluster;

    public static final String SERIALIZED_NAME_DESCRIPTION = "description";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION)
    private String description;

    public static final String SERIALIZED_NAME_DESCRIPTION_CONTAINS = "description_contains";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION_CONTAINS)
    private String descriptionContains;

    public static final String SERIALIZED_NAME_DESCRIPTION_ENDS_WITH = "description_ends_with";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION_ENDS_WITH)
    private String descriptionEndsWith;

    public static final String SERIALIZED_NAME_DESCRIPTION_GT = "description_gt";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION_GT)
    private String descriptionGt;

    public static final String SERIALIZED_NAME_DESCRIPTION_GTE = "description_gte";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION_GTE)
    private String descriptionGte;

    public static final String SERIALIZED_NAME_DESCRIPTION_IN = "description_in";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION_IN)
    private List<String> descriptionIn = null;

    public static final String SERIALIZED_NAME_DESCRIPTION_LT = "description_lt";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION_LT)
    private String descriptionLt;

    public static final String SERIALIZED_NAME_DESCRIPTION_LTE = "description_lte";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION_LTE)
    private String descriptionLte;

    public static final String SERIALIZED_NAME_DESCRIPTION_NOT = "description_not";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION_NOT)
    private String descriptionNot;

    public static final String SERIALIZED_NAME_DESCRIPTION_NOT_CONTAINS =
            "description_not_contains";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION_NOT_CONTAINS)
    private String descriptionNotContains;

    public static final String SERIALIZED_NAME_DESCRIPTION_NOT_ENDS_WITH =
            "description_not_ends_with";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION_NOT_ENDS_WITH)
    private String descriptionNotEndsWith;

    public static final String SERIALIZED_NAME_DESCRIPTION_NOT_IN = "description_not_in";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION_NOT_IN)
    private List<String> descriptionNotIn = null;

    public static final String SERIALIZED_NAME_DESCRIPTION_NOT_STARTS_WITH =
            "description_not_starts_with";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION_NOT_STARTS_WITH)
    private String descriptionNotStartsWith;

    public static final String SERIALIZED_NAME_DESCRIPTION_STARTS_WITH = "description_starts_with";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION_STARTS_WITH)
    private String descriptionStartsWith;

    public static final String SERIALIZED_NAME_END_TIME = "end_time";

    @SerializedName(SERIALIZED_NAME_END_TIME)
    private String endTime;

    public static final String SERIALIZED_NAME_END_TIME_GT = "end_time_gt";

    @SerializedName(SERIALIZED_NAME_END_TIME_GT)
    private String endTimeGt;

    public static final String SERIALIZED_NAME_END_TIME_GTE = "end_time_gte";

    @SerializedName(SERIALIZED_NAME_END_TIME_GTE)
    private String endTimeGte;

    public static final String SERIALIZED_NAME_END_TIME_IN = "end_time_in";

    @SerializedName(SERIALIZED_NAME_END_TIME_IN)
    private List<String> endTimeIn = null;

    public static final String SERIALIZED_NAME_END_TIME_LT = "end_time_lt";

    @SerializedName(SERIALIZED_NAME_END_TIME_LT)
    private String endTimeLt;

    public static final String SERIALIZED_NAME_END_TIME_LTE = "end_time_lte";

    @SerializedName(SERIALIZED_NAME_END_TIME_LTE)
    private String endTimeLte;

    public static final String SERIALIZED_NAME_END_TIME_NOT = "end_time_not";

    @SerializedName(SERIALIZED_NAME_END_TIME_NOT)
    private String endTimeNot;

    public static final String SERIALIZED_NAME_END_TIME_NOT_IN = "end_time_not_in";

    @SerializedName(SERIALIZED_NAME_END_TIME_NOT_IN)
    private List<String> endTimeNotIn = null;

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

    public static final String SERIALIZED_NAME_EXECUTE_PLAN_TYPE = "execute_plan_type";

    @SerializedName(SERIALIZED_NAME_EXECUTE_PLAN_TYPE)
    private SnapshotPlanExecuteType executePlanType;

    public static final String SERIALIZED_NAME_EXECUTE_PLAN_TYPE_IN = "execute_plan_type_in";

    @SerializedName(SERIALIZED_NAME_EXECUTE_PLAN_TYPE_IN)
    private List<SnapshotPlanExecuteType> executePlanTypeIn = null;

    public static final String SERIALIZED_NAME_EXECUTE_PLAN_TYPE_NOT = "execute_plan_type_not";

    @SerializedName(SERIALIZED_NAME_EXECUTE_PLAN_TYPE_NOT)
    private SnapshotPlanExecuteType executePlanTypeNot;

    public static final String SERIALIZED_NAME_EXECUTE_PLAN_TYPE_NOT_IN =
            "execute_plan_type_not_in";

    @SerializedName(SERIALIZED_NAME_EXECUTE_PLAN_TYPE_NOT_IN)
    private List<SnapshotPlanExecuteType> executePlanTypeNotIn = null;

    public static final String SERIALIZED_NAME_EXECUTION_TASKS_EVERY = "execution_tasks_every";

    @SerializedName(SERIALIZED_NAME_EXECUTION_TASKS_EVERY)
    private SnapshotPlanTaskWhereInput executionTasksEvery;

    public static final String SERIALIZED_NAME_EXECUTION_TASKS_NONE = "execution_tasks_none";

    @SerializedName(SERIALIZED_NAME_EXECUTION_TASKS_NONE)
    private SnapshotPlanTaskWhereInput executionTasksNone;

    public static final String SERIALIZED_NAME_EXECUTION_TASKS_SOME = "execution_tasks_some";

    @SerializedName(SERIALIZED_NAME_EXECUTION_TASKS_SOME)
    private SnapshotPlanTaskWhereInput executionTasksSome;

    public static final String SERIALIZED_NAME_HEALTHY = "healthy";

    @SerializedName(SERIALIZED_NAME_HEALTHY)
    private Boolean healthy;

    public static final String SERIALIZED_NAME_HEALTHY_NOT = "healthy_not";

    @SerializedName(SERIALIZED_NAME_HEALTHY_NOT)
    private Boolean healthyNot;

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

    public static final String SERIALIZED_NAME_LAST_EXECUTE_END_TIME = "last_execute_end_time";

    @SerializedName(SERIALIZED_NAME_LAST_EXECUTE_END_TIME)
    private String lastExecuteEndTime;

    public static final String SERIALIZED_NAME_LAST_EXECUTE_END_TIME_GT =
            "last_execute_end_time_gt";

    @SerializedName(SERIALIZED_NAME_LAST_EXECUTE_END_TIME_GT)
    private String lastExecuteEndTimeGt;

    public static final String SERIALIZED_NAME_LAST_EXECUTE_END_TIME_GTE =
            "last_execute_end_time_gte";

    @SerializedName(SERIALIZED_NAME_LAST_EXECUTE_END_TIME_GTE)
    private String lastExecuteEndTimeGte;

    public static final String SERIALIZED_NAME_LAST_EXECUTE_END_TIME_IN =
            "last_execute_end_time_in";

    @SerializedName(SERIALIZED_NAME_LAST_EXECUTE_END_TIME_IN)
    private List<String> lastExecuteEndTimeIn = null;

    public static final String SERIALIZED_NAME_LAST_EXECUTE_END_TIME_LT =
            "last_execute_end_time_lt";

    @SerializedName(SERIALIZED_NAME_LAST_EXECUTE_END_TIME_LT)
    private String lastExecuteEndTimeLt;

    public static final String SERIALIZED_NAME_LAST_EXECUTE_END_TIME_LTE =
            "last_execute_end_time_lte";

    @SerializedName(SERIALIZED_NAME_LAST_EXECUTE_END_TIME_LTE)
    private String lastExecuteEndTimeLte;

    public static final String SERIALIZED_NAME_LAST_EXECUTE_END_TIME_NOT =
            "last_execute_end_time_not";

    @SerializedName(SERIALIZED_NAME_LAST_EXECUTE_END_TIME_NOT)
    private String lastExecuteEndTimeNot;

    public static final String SERIALIZED_NAME_LAST_EXECUTE_END_TIME_NOT_IN =
            "last_execute_end_time_not_in";

    @SerializedName(SERIALIZED_NAME_LAST_EXECUTE_END_TIME_NOT_IN)
    private List<String> lastExecuteEndTimeNotIn = null;

    public static final String SERIALIZED_NAME_LAST_EXECUTE_STATUS = "last_execute_status";

    @SerializedName(SERIALIZED_NAME_LAST_EXECUTE_STATUS)
    private SnapshotPlanExecuteStatus lastExecuteStatus;

    public static final String SERIALIZED_NAME_LAST_EXECUTE_STATUS_IN = "last_execute_status_in";

    @SerializedName(SERIALIZED_NAME_LAST_EXECUTE_STATUS_IN)
    private List<SnapshotPlanExecuteStatus> lastExecuteStatusIn = null;

    public static final String SERIALIZED_NAME_LAST_EXECUTE_STATUS_NOT = "last_execute_status_not";

    @SerializedName(SERIALIZED_NAME_LAST_EXECUTE_STATUS_NOT)
    private SnapshotPlanExecuteStatus lastExecuteStatusNot;

    public static final String SERIALIZED_NAME_LAST_EXECUTE_STATUS_NOT_IN =
            "last_execute_status_not_in";

    @SerializedName(SERIALIZED_NAME_LAST_EXECUTE_STATUS_NOT_IN)
    private List<SnapshotPlanExecuteStatus> lastExecuteStatusNotIn = null;

    public static final String SERIALIZED_NAME_LAST_EXECUTE_TIME = "last_execute_time";

    @SerializedName(SERIALIZED_NAME_LAST_EXECUTE_TIME)
    private String lastExecuteTime;

    public static final String SERIALIZED_NAME_LAST_EXECUTE_TIME_GT = "last_execute_time_gt";

    @SerializedName(SERIALIZED_NAME_LAST_EXECUTE_TIME_GT)
    private String lastExecuteTimeGt;

    public static final String SERIALIZED_NAME_LAST_EXECUTE_TIME_GTE = "last_execute_time_gte";

    @SerializedName(SERIALIZED_NAME_LAST_EXECUTE_TIME_GTE)
    private String lastExecuteTimeGte;

    public static final String SERIALIZED_NAME_LAST_EXECUTE_TIME_IN = "last_execute_time_in";

    @SerializedName(SERIALIZED_NAME_LAST_EXECUTE_TIME_IN)
    private List<String> lastExecuteTimeIn = null;

    public static final String SERIALIZED_NAME_LAST_EXECUTE_TIME_LT = "last_execute_time_lt";

    @SerializedName(SERIALIZED_NAME_LAST_EXECUTE_TIME_LT)
    private String lastExecuteTimeLt;

    public static final String SERIALIZED_NAME_LAST_EXECUTE_TIME_LTE = "last_execute_time_lte";

    @SerializedName(SERIALIZED_NAME_LAST_EXECUTE_TIME_LTE)
    private String lastExecuteTimeLte;

    public static final String SERIALIZED_NAME_LAST_EXECUTE_TIME_NOT = "last_execute_time_not";

    @SerializedName(SERIALIZED_NAME_LAST_EXECUTE_TIME_NOT)
    private String lastExecuteTimeNot;

    public static final String SERIALIZED_NAME_LAST_EXECUTE_TIME_NOT_IN =
            "last_execute_time_not_in";

    @SerializedName(SERIALIZED_NAME_LAST_EXECUTE_TIME_NOT_IN)
    private List<String> lastExecuteTimeNotIn = null;

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

    public static final String SERIALIZED_NAME_LOGICAL_SIZE_BYTES = "logical_size_bytes";

    @SerializedName(SERIALIZED_NAME_LOGICAL_SIZE_BYTES)
    private Long logicalSizeBytes;

    public static final String SERIALIZED_NAME_LOGICAL_SIZE_BYTES_GT = "logical_size_bytes_gt";

    @SerializedName(SERIALIZED_NAME_LOGICAL_SIZE_BYTES_GT)
    private Long logicalSizeBytesGt;

    public static final String SERIALIZED_NAME_LOGICAL_SIZE_BYTES_GTE = "logical_size_bytes_gte";

    @SerializedName(SERIALIZED_NAME_LOGICAL_SIZE_BYTES_GTE)
    private Long logicalSizeBytesGte;

    public static final String SERIALIZED_NAME_LOGICAL_SIZE_BYTES_IN = "logical_size_bytes_in";

    @SerializedName(SERIALIZED_NAME_LOGICAL_SIZE_BYTES_IN)
    private List<Long> logicalSizeBytesIn = null;

    public static final String SERIALIZED_NAME_LOGICAL_SIZE_BYTES_LT = "logical_size_bytes_lt";

    @SerializedName(SERIALIZED_NAME_LOGICAL_SIZE_BYTES_LT)
    private Long logicalSizeBytesLt;

    public static final String SERIALIZED_NAME_LOGICAL_SIZE_BYTES_LTE = "logical_size_bytes_lte";

    @SerializedName(SERIALIZED_NAME_LOGICAL_SIZE_BYTES_LTE)
    private Long logicalSizeBytesLte;

    public static final String SERIALIZED_NAME_LOGICAL_SIZE_BYTES_NOT = "logical_size_bytes_not";

    @SerializedName(SERIALIZED_NAME_LOGICAL_SIZE_BYTES_NOT)
    private Long logicalSizeBytesNot;

    public static final String SERIALIZED_NAME_LOGICAL_SIZE_BYTES_NOT_IN =
            "logical_size_bytes_not_in";

    @SerializedName(SERIALIZED_NAME_LOGICAL_SIZE_BYTES_NOT_IN)
    private List<Long> logicalSizeBytesNotIn = null;

    public static final String SERIALIZED_NAME_MANUAL_DELETE_NUM = "manual_delete_num";

    @SerializedName(SERIALIZED_NAME_MANUAL_DELETE_NUM)
    private Integer manualDeleteNum;

    public static final String SERIALIZED_NAME_MANUAL_DELETE_NUM_GT = "manual_delete_num_gt";

    @SerializedName(SERIALIZED_NAME_MANUAL_DELETE_NUM_GT)
    private Integer manualDeleteNumGt;

    public static final String SERIALIZED_NAME_MANUAL_DELETE_NUM_GTE = "manual_delete_num_gte";

    @SerializedName(SERIALIZED_NAME_MANUAL_DELETE_NUM_GTE)
    private Integer manualDeleteNumGte;

    public static final String SERIALIZED_NAME_MANUAL_DELETE_NUM_IN = "manual_delete_num_in";

    @SerializedName(SERIALIZED_NAME_MANUAL_DELETE_NUM_IN)
    private List<Integer> manualDeleteNumIn = null;

    public static final String SERIALIZED_NAME_MANUAL_DELETE_NUM_LT = "manual_delete_num_lt";

    @SerializedName(SERIALIZED_NAME_MANUAL_DELETE_NUM_LT)
    private Integer manualDeleteNumLt;

    public static final String SERIALIZED_NAME_MANUAL_DELETE_NUM_LTE = "manual_delete_num_lte";

    @SerializedName(SERIALIZED_NAME_MANUAL_DELETE_NUM_LTE)
    private Integer manualDeleteNumLte;

    public static final String SERIALIZED_NAME_MANUAL_DELETE_NUM_NOT = "manual_delete_num_not";

    @SerializedName(SERIALIZED_NAME_MANUAL_DELETE_NUM_NOT)
    private Integer manualDeleteNumNot;

    public static final String SERIALIZED_NAME_MANUAL_DELETE_NUM_NOT_IN =
            "manual_delete_num_not_in";

    @SerializedName(SERIALIZED_NAME_MANUAL_DELETE_NUM_NOT_IN)
    private List<Integer> manualDeleteNumNotIn = null;

    public static final String SERIALIZED_NAME_MANUAL_EXECUTE_NUM = "manual_execute_num";

    @SerializedName(SERIALIZED_NAME_MANUAL_EXECUTE_NUM)
    private Integer manualExecuteNum;

    public static final String SERIALIZED_NAME_MANUAL_EXECUTE_NUM_GT = "manual_execute_num_gt";

    @SerializedName(SERIALIZED_NAME_MANUAL_EXECUTE_NUM_GT)
    private Integer manualExecuteNumGt;

    public static final String SERIALIZED_NAME_MANUAL_EXECUTE_NUM_GTE = "manual_execute_num_gte";

    @SerializedName(SERIALIZED_NAME_MANUAL_EXECUTE_NUM_GTE)
    private Integer manualExecuteNumGte;

    public static final String SERIALIZED_NAME_MANUAL_EXECUTE_NUM_IN = "manual_execute_num_in";

    @SerializedName(SERIALIZED_NAME_MANUAL_EXECUTE_NUM_IN)
    private List<Integer> manualExecuteNumIn = null;

    public static final String SERIALIZED_NAME_MANUAL_EXECUTE_NUM_LT = "manual_execute_num_lt";

    @SerializedName(SERIALIZED_NAME_MANUAL_EXECUTE_NUM_LT)
    private Integer manualExecuteNumLt;

    public static final String SERIALIZED_NAME_MANUAL_EXECUTE_NUM_LTE = "manual_execute_num_lte";

    @SerializedName(SERIALIZED_NAME_MANUAL_EXECUTE_NUM_LTE)
    private Integer manualExecuteNumLte;

    public static final String SERIALIZED_NAME_MANUAL_EXECUTE_NUM_NOT = "manual_execute_num_not";

    @SerializedName(SERIALIZED_NAME_MANUAL_EXECUTE_NUM_NOT)
    private Integer manualExecuteNumNot;

    public static final String SERIALIZED_NAME_MANUAL_EXECUTE_NUM_NOT_IN =
            "manual_execute_num_not_in";

    @SerializedName(SERIALIZED_NAME_MANUAL_EXECUTE_NUM_NOT_IN)
    private List<Integer> manualExecuteNumNotIn = null;

    public static final String SERIALIZED_NAME_MIRROR = "mirror";

    @SerializedName(SERIALIZED_NAME_MIRROR)
    private Boolean mirror;

    public static final String SERIALIZED_NAME_MIRROR_NOT = "mirror_not";

    @SerializedName(SERIALIZED_NAME_MIRROR_NOT)
    private Boolean mirrorNot;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_NAME_CONTAINS = "name_contains";

    @SerializedName(SERIALIZED_NAME_NAME_CONTAINS)
    private String nameContains;

    public static final String SERIALIZED_NAME_NAME_ENDS_WITH = "name_ends_with";

    @SerializedName(SERIALIZED_NAME_NAME_ENDS_WITH)
    private String nameEndsWith;

    public static final String SERIALIZED_NAME_NAME_GT = "name_gt";

    @SerializedName(SERIALIZED_NAME_NAME_GT)
    private String nameGt;

    public static final String SERIALIZED_NAME_NAME_GTE = "name_gte";

    @SerializedName(SERIALIZED_NAME_NAME_GTE)
    private String nameGte;

    public static final String SERIALIZED_NAME_NAME_IN = "name_in";

    @SerializedName(SERIALIZED_NAME_NAME_IN)
    private List<String> nameIn = null;

    public static final String SERIALIZED_NAME_NAME_LT = "name_lt";

    @SerializedName(SERIALIZED_NAME_NAME_LT)
    private String nameLt;

    public static final String SERIALIZED_NAME_NAME_LTE = "name_lte";

    @SerializedName(SERIALIZED_NAME_NAME_LTE)
    private String nameLte;

    public static final String SERIALIZED_NAME_NAME_NOT = "name_not";

    @SerializedName(SERIALIZED_NAME_NAME_NOT)
    private String nameNot;

    public static final String SERIALIZED_NAME_NAME_NOT_CONTAINS = "name_not_contains";

    @SerializedName(SERIALIZED_NAME_NAME_NOT_CONTAINS)
    private String nameNotContains;

    public static final String SERIALIZED_NAME_NAME_NOT_ENDS_WITH = "name_not_ends_with";

    @SerializedName(SERIALIZED_NAME_NAME_NOT_ENDS_WITH)
    private String nameNotEndsWith;

    public static final String SERIALIZED_NAME_NAME_NOT_IN = "name_not_in";

    @SerializedName(SERIALIZED_NAME_NAME_NOT_IN)
    private List<String> nameNotIn = null;

    public static final String SERIALIZED_NAME_NAME_NOT_STARTS_WITH = "name_not_starts_with";

    @SerializedName(SERIALIZED_NAME_NAME_NOT_STARTS_WITH)
    private String nameNotStartsWith;

    public static final String SERIALIZED_NAME_NAME_STARTS_WITH = "name_starts_with";

    @SerializedName(SERIALIZED_NAME_NAME_STARTS_WITH)
    private String nameStartsWith;

    public static final String SERIALIZED_NAME_NEXT_EXECUTE_TIME = "next_execute_time";

    @SerializedName(SERIALIZED_NAME_NEXT_EXECUTE_TIME)
    private String nextExecuteTime;

    public static final String SERIALIZED_NAME_NEXT_EXECUTE_TIME_GT = "next_execute_time_gt";

    @SerializedName(SERIALIZED_NAME_NEXT_EXECUTE_TIME_GT)
    private String nextExecuteTimeGt;

    public static final String SERIALIZED_NAME_NEXT_EXECUTE_TIME_GTE = "next_execute_time_gte";

    @SerializedName(SERIALIZED_NAME_NEXT_EXECUTE_TIME_GTE)
    private String nextExecuteTimeGte;

    public static final String SERIALIZED_NAME_NEXT_EXECUTE_TIME_IN = "next_execute_time_in";

    @SerializedName(SERIALIZED_NAME_NEXT_EXECUTE_TIME_IN)
    private List<String> nextExecuteTimeIn = null;

    public static final String SERIALIZED_NAME_NEXT_EXECUTE_TIME_LT = "next_execute_time_lt";

    @SerializedName(SERIALIZED_NAME_NEXT_EXECUTE_TIME_LT)
    private String nextExecuteTimeLt;

    public static final String SERIALIZED_NAME_NEXT_EXECUTE_TIME_LTE = "next_execute_time_lte";

    @SerializedName(SERIALIZED_NAME_NEXT_EXECUTE_TIME_LTE)
    private String nextExecuteTimeLte;

    public static final String SERIALIZED_NAME_NEXT_EXECUTE_TIME_NOT = "next_execute_time_not";

    @SerializedName(SERIALIZED_NAME_NEXT_EXECUTE_TIME_NOT)
    private String nextExecuteTimeNot;

    public static final String SERIALIZED_NAME_NEXT_EXECUTE_TIME_NOT_IN =
            "next_execute_time_not_in";

    @SerializedName(SERIALIZED_NAME_NEXT_EXECUTE_TIME_NOT_IN)
    private List<String> nextExecuteTimeNotIn = null;

    public static final String SERIALIZED_NAME_OBJECT_NUM = "object_num";

    @SerializedName(SERIALIZED_NAME_OBJECT_NUM)
    private Integer objectNum;

    public static final String SERIALIZED_NAME_OBJECT_NUM_GT = "object_num_gt";

    @SerializedName(SERIALIZED_NAME_OBJECT_NUM_GT)
    private Integer objectNumGt;

    public static final String SERIALIZED_NAME_OBJECT_NUM_GTE = "object_num_gte";

    @SerializedName(SERIALIZED_NAME_OBJECT_NUM_GTE)
    private Integer objectNumGte;

    public static final String SERIALIZED_NAME_OBJECT_NUM_IN = "object_num_in";

    @SerializedName(SERIALIZED_NAME_OBJECT_NUM_IN)
    private List<Integer> objectNumIn = null;

    public static final String SERIALIZED_NAME_OBJECT_NUM_LT = "object_num_lt";

    @SerializedName(SERIALIZED_NAME_OBJECT_NUM_LT)
    private Integer objectNumLt;

    public static final String SERIALIZED_NAME_OBJECT_NUM_LTE = "object_num_lte";

    @SerializedName(SERIALIZED_NAME_OBJECT_NUM_LTE)
    private Integer objectNumLte;

    public static final String SERIALIZED_NAME_OBJECT_NUM_NOT = "object_num_not";

    @SerializedName(SERIALIZED_NAME_OBJECT_NUM_NOT)
    private Integer objectNumNot;

    public static final String SERIALIZED_NAME_OBJECT_NUM_NOT_IN = "object_num_not_in";

    @SerializedName(SERIALIZED_NAME_OBJECT_NUM_NOT_IN)
    private List<Integer> objectNumNotIn = null;

    public static final String SERIALIZED_NAME_PHYSICAL_SIZE_BYTES = "physical_size_bytes";

    @SerializedName(SERIALIZED_NAME_PHYSICAL_SIZE_BYTES)
    private Long physicalSizeBytes;

    public static final String SERIALIZED_NAME_PHYSICAL_SIZE_BYTES_GT = "physical_size_bytes_gt";

    @SerializedName(SERIALIZED_NAME_PHYSICAL_SIZE_BYTES_GT)
    private Long physicalSizeBytesGt;

    public static final String SERIALIZED_NAME_PHYSICAL_SIZE_BYTES_GTE = "physical_size_bytes_gte";

    @SerializedName(SERIALIZED_NAME_PHYSICAL_SIZE_BYTES_GTE)
    private Long physicalSizeBytesGte;

    public static final String SERIALIZED_NAME_PHYSICAL_SIZE_BYTES_IN = "physical_size_bytes_in";

    @SerializedName(SERIALIZED_NAME_PHYSICAL_SIZE_BYTES_IN)
    private List<Long> physicalSizeBytesIn = null;

    public static final String SERIALIZED_NAME_PHYSICAL_SIZE_BYTES_LT = "physical_size_bytes_lt";

    @SerializedName(SERIALIZED_NAME_PHYSICAL_SIZE_BYTES_LT)
    private Long physicalSizeBytesLt;

    public static final String SERIALIZED_NAME_PHYSICAL_SIZE_BYTES_LTE = "physical_size_bytes_lte";

    @SerializedName(SERIALIZED_NAME_PHYSICAL_SIZE_BYTES_LTE)
    private Long physicalSizeBytesLte;

    public static final String SERIALIZED_NAME_PHYSICAL_SIZE_BYTES_NOT = "physical_size_bytes_not";

    @SerializedName(SERIALIZED_NAME_PHYSICAL_SIZE_BYTES_NOT)
    private Long physicalSizeBytesNot;

    public static final String SERIALIZED_NAME_PHYSICAL_SIZE_BYTES_NOT_IN =
            "physical_size_bytes_not_in";

    @SerializedName(SERIALIZED_NAME_PHYSICAL_SIZE_BYTES_NOT_IN)
    private List<Long> physicalSizeBytesNotIn = null;

    public static final String SERIALIZED_NAME_REMAIN_SNAPSHOT_NUM = "remain_snapshot_num";

    @SerializedName(SERIALIZED_NAME_REMAIN_SNAPSHOT_NUM)
    private Integer remainSnapshotNum;

    public static final String SERIALIZED_NAME_REMAIN_SNAPSHOT_NUM_GT = "remain_snapshot_num_gt";

    @SerializedName(SERIALIZED_NAME_REMAIN_SNAPSHOT_NUM_GT)
    private Integer remainSnapshotNumGt;

    public static final String SERIALIZED_NAME_REMAIN_SNAPSHOT_NUM_GTE = "remain_snapshot_num_gte";

    @SerializedName(SERIALIZED_NAME_REMAIN_SNAPSHOT_NUM_GTE)
    private Integer remainSnapshotNumGte;

    public static final String SERIALIZED_NAME_REMAIN_SNAPSHOT_NUM_IN = "remain_snapshot_num_in";

    @SerializedName(SERIALIZED_NAME_REMAIN_SNAPSHOT_NUM_IN)
    private List<Integer> remainSnapshotNumIn = null;

    public static final String SERIALIZED_NAME_REMAIN_SNAPSHOT_NUM_LT = "remain_snapshot_num_lt";

    @SerializedName(SERIALIZED_NAME_REMAIN_SNAPSHOT_NUM_LT)
    private Integer remainSnapshotNumLt;

    public static final String SERIALIZED_NAME_REMAIN_SNAPSHOT_NUM_LTE = "remain_snapshot_num_lte";

    @SerializedName(SERIALIZED_NAME_REMAIN_SNAPSHOT_NUM_LTE)
    private Integer remainSnapshotNumLte;

    public static final String SERIALIZED_NAME_REMAIN_SNAPSHOT_NUM_NOT = "remain_snapshot_num_not";

    @SerializedName(SERIALIZED_NAME_REMAIN_SNAPSHOT_NUM_NOT)
    private Integer remainSnapshotNumNot;

    public static final String SERIALIZED_NAME_REMAIN_SNAPSHOT_NUM_NOT_IN =
            "remain_snapshot_num_not_in";

    @SerializedName(SERIALIZED_NAME_REMAIN_SNAPSHOT_NUM_NOT_IN)
    private List<Integer> remainSnapshotNumNotIn = null;

    public static final String SERIALIZED_NAME_SNAPSHOT_GROUP_NUM = "snapshot_group_num";

    @SerializedName(SERIALIZED_NAME_SNAPSHOT_GROUP_NUM)
    private Integer snapshotGroupNum;

    public static final String SERIALIZED_NAME_SNAPSHOT_GROUP_NUM_GT = "snapshot_group_num_gt";

    @SerializedName(SERIALIZED_NAME_SNAPSHOT_GROUP_NUM_GT)
    private Integer snapshotGroupNumGt;

    public static final String SERIALIZED_NAME_SNAPSHOT_GROUP_NUM_GTE = "snapshot_group_num_gte";

    @SerializedName(SERIALIZED_NAME_SNAPSHOT_GROUP_NUM_GTE)
    private Integer snapshotGroupNumGte;

    public static final String SERIALIZED_NAME_SNAPSHOT_GROUP_NUM_IN = "snapshot_group_num_in";

    @SerializedName(SERIALIZED_NAME_SNAPSHOT_GROUP_NUM_IN)
    private List<Integer> snapshotGroupNumIn = null;

    public static final String SERIALIZED_NAME_SNAPSHOT_GROUP_NUM_LT = "snapshot_group_num_lt";

    @SerializedName(SERIALIZED_NAME_SNAPSHOT_GROUP_NUM_LT)
    private Integer snapshotGroupNumLt;

    public static final String SERIALIZED_NAME_SNAPSHOT_GROUP_NUM_LTE = "snapshot_group_num_lte";

    @SerializedName(SERIALIZED_NAME_SNAPSHOT_GROUP_NUM_LTE)
    private Integer snapshotGroupNumLte;

    public static final String SERIALIZED_NAME_SNAPSHOT_GROUP_NUM_NOT = "snapshot_group_num_not";

    @SerializedName(SERIALIZED_NAME_SNAPSHOT_GROUP_NUM_NOT)
    private Integer snapshotGroupNumNot;

    public static final String SERIALIZED_NAME_SNAPSHOT_GROUP_NUM_NOT_IN =
            "snapshot_group_num_not_in";

    @SerializedName(SERIALIZED_NAME_SNAPSHOT_GROUP_NUM_NOT_IN)
    private List<Integer> snapshotGroupNumNotIn = null;

    public static final String SERIALIZED_NAME_START_TIME = "start_time";

    @SerializedName(SERIALIZED_NAME_START_TIME)
    private String startTime;

    public static final String SERIALIZED_NAME_START_TIME_GT = "start_time_gt";

    @SerializedName(SERIALIZED_NAME_START_TIME_GT)
    private String startTimeGt;

    public static final String SERIALIZED_NAME_START_TIME_GTE = "start_time_gte";

    @SerializedName(SERIALIZED_NAME_START_TIME_GTE)
    private String startTimeGte;

    public static final String SERIALIZED_NAME_START_TIME_IN = "start_time_in";

    @SerializedName(SERIALIZED_NAME_START_TIME_IN)
    private List<String> startTimeIn = null;

    public static final String SERIALIZED_NAME_START_TIME_LT = "start_time_lt";

    @SerializedName(SERIALIZED_NAME_START_TIME_LT)
    private String startTimeLt;

    public static final String SERIALIZED_NAME_START_TIME_LTE = "start_time_lte";

    @SerializedName(SERIALIZED_NAME_START_TIME_LTE)
    private String startTimeLte;

    public static final String SERIALIZED_NAME_START_TIME_NOT = "start_time_not";

    @SerializedName(SERIALIZED_NAME_START_TIME_NOT)
    private String startTimeNot;

    public static final String SERIALIZED_NAME_START_TIME_NOT_IN = "start_time_not_in";

    @SerializedName(SERIALIZED_NAME_START_TIME_NOT_IN)
    private List<String> startTimeNotIn = null;

    public static final String SERIALIZED_NAME_STATUS = "status";

    @SerializedName(SERIALIZED_NAME_STATUS)
    private SnapshotPlanStatus status;

    public static final String SERIALIZED_NAME_STATUS_IN = "status_in";

    @SerializedName(SERIALIZED_NAME_STATUS_IN)
    private List<SnapshotPlanStatus> statusIn = null;

    public static final String SERIALIZED_NAME_STATUS_NOT = "status_not";

    @SerializedName(SERIALIZED_NAME_STATUS_NOT)
    private SnapshotPlanStatus statusNot;

    public static final String SERIALIZED_NAME_STATUS_NOT_IN = "status_not_in";

    @SerializedName(SERIALIZED_NAME_STATUS_NOT_IN)
    private List<SnapshotPlanStatus> statusNotIn = null;

    public static final String SERIALIZED_NAME_VMS_EVERY = "vms_every";

    @SerializedName(SERIALIZED_NAME_VMS_EVERY)
    private VmWhereInput vmsEvery;

    public static final String SERIALIZED_NAME_VMS_NONE = "vms_none";

    @SerializedName(SERIALIZED_NAME_VMS_NONE)
    private VmWhereInput vmsNone;

    public static final String SERIALIZED_NAME_VMS_SOME = "vms_some";

    @SerializedName(SERIALIZED_NAME_VMS_SOME)
    private VmWhereInput vmsSome;

    public SnapshotPlanWhereInput() {}

    public SnapshotPlanWhereInput AND(List<SnapshotPlanWhereInput> AND) {

        this.AND = AND;
        return this;
    }

    public SnapshotPlanWhereInput addANDItem(SnapshotPlanWhereInput ANDItem) {
        if (this.AND == null) {
            this.AND = new ArrayList<SnapshotPlanWhereInput>();
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
    public List<SnapshotPlanWhereInput> getAND() {
        return AND;
    }

    public void setAND(List<SnapshotPlanWhereInput> AND) {
        this.AND = AND;
    }

    public SnapshotPlanWhereInput AND_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_A_N_D);
        return this;
    }

    public SnapshotPlanWhereInput AND_ExplictlyNonNull() {
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

    public SnapshotPlanWhereInput NOT(List<SnapshotPlanWhereInput> NOT) {

        this.NOT = NOT;
        return this;
    }

    public SnapshotPlanWhereInput addNOTItem(SnapshotPlanWhereInput NOTItem) {
        if (this.NOT == null) {
            this.NOT = new ArrayList<SnapshotPlanWhereInput>();
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
    public List<SnapshotPlanWhereInput> getNOT() {
        return NOT;
    }

    public void setNOT(List<SnapshotPlanWhereInput> NOT) {
        this.NOT = NOT;
    }

    public SnapshotPlanWhereInput NOT_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_N_O_T);
        return this;
    }

    public SnapshotPlanWhereInput NOT_ExplictlyNonNull() {
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

    public SnapshotPlanWhereInput OR(List<SnapshotPlanWhereInput> OR) {

        this.OR = OR;
        return this;
    }

    public SnapshotPlanWhereInput addORItem(SnapshotPlanWhereInput ORItem) {
        if (this.OR == null) {
            this.OR = new ArrayList<SnapshotPlanWhereInput>();
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
    public List<SnapshotPlanWhereInput> getOR() {
        return OR;
    }

    public void setOR(List<SnapshotPlanWhereInput> OR) {
        this.OR = OR;
    }

    public SnapshotPlanWhereInput OR_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_O_R);
        return this;
    }

    public SnapshotPlanWhereInput OR_ExplictlyNonNull() {
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

    public SnapshotPlanWhereInput autoDeleteNum(Integer autoDeleteNum) {

        this.autoDeleteNum = autoDeleteNum;
        return this;
    }

    /**
     * Get autoDeleteNum
     *
     * @return autoDeleteNum
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getAutoDeleteNum() {
        return autoDeleteNum;
    }

    public void setAutoDeleteNum(Integer autoDeleteNum) {
        this.autoDeleteNum = autoDeleteNum;
    }

    public SnapshotPlanWhereInput autoDeleteNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_AUTO_DELETE_NUM);
        return this;
    }

    public SnapshotPlanWhereInput autoDeleteNum_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_AUTO_DELETE_NUM);
        return this;
    }

    public void setAutoDeleteNum_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_AUTO_DELETE_NUM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_AUTO_DELETE_NUM);
        }
    }

    public boolean getAutoDeleteNum_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_AUTO_DELETE_NUM);
    }

    public SnapshotPlanWhereInput autoDeleteNumGt(Integer autoDeleteNumGt) {

        this.autoDeleteNumGt = autoDeleteNumGt;
        return this;
    }

    /**
     * Get autoDeleteNumGt
     *
     * @return autoDeleteNumGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getAutoDeleteNumGt() {
        return autoDeleteNumGt;
    }

    public void setAutoDeleteNumGt(Integer autoDeleteNumGt) {
        this.autoDeleteNumGt = autoDeleteNumGt;
    }

    public SnapshotPlanWhereInput autoDeleteNumGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_AUTO_DELETE_NUM_GT);
        return this;
    }

    public SnapshotPlanWhereInput autoDeleteNumGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_AUTO_DELETE_NUM_GT);
        return this;
    }

    public void setAutoDeleteNumGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_AUTO_DELETE_NUM_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_AUTO_DELETE_NUM_GT);
        }
    }

    public boolean getAutoDeleteNumGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_AUTO_DELETE_NUM_GT);
    }

    public SnapshotPlanWhereInput autoDeleteNumGte(Integer autoDeleteNumGte) {

        this.autoDeleteNumGte = autoDeleteNumGte;
        return this;
    }

    /**
     * Get autoDeleteNumGte
     *
     * @return autoDeleteNumGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getAutoDeleteNumGte() {
        return autoDeleteNumGte;
    }

    public void setAutoDeleteNumGte(Integer autoDeleteNumGte) {
        this.autoDeleteNumGte = autoDeleteNumGte;
    }

    public SnapshotPlanWhereInput autoDeleteNumGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_AUTO_DELETE_NUM_GTE);
        return this;
    }

    public SnapshotPlanWhereInput autoDeleteNumGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_AUTO_DELETE_NUM_GTE);
        return this;
    }

    public void setAutoDeleteNumGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_AUTO_DELETE_NUM_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_AUTO_DELETE_NUM_GTE);
        }
    }

    public boolean getAutoDeleteNumGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_AUTO_DELETE_NUM_GTE);
    }

    public SnapshotPlanWhereInput autoDeleteNumIn(List<Integer> autoDeleteNumIn) {

        this.autoDeleteNumIn = autoDeleteNumIn;
        return this;
    }

    public SnapshotPlanWhereInput addAutoDeleteNumInItem(Integer autoDeleteNumInItem) {
        if (this.autoDeleteNumIn == null) {
            this.autoDeleteNumIn = new ArrayList<Integer>();
        }
        this.autoDeleteNumIn.add(autoDeleteNumInItem);
        return this;
    }

    /**
     * Get autoDeleteNumIn
     *
     * @return autoDeleteNumIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getAutoDeleteNumIn() {
        return autoDeleteNumIn;
    }

    public void setAutoDeleteNumIn(List<Integer> autoDeleteNumIn) {
        this.autoDeleteNumIn = autoDeleteNumIn;
    }

    public SnapshotPlanWhereInput autoDeleteNumIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_AUTO_DELETE_NUM_IN);
        return this;
    }

    public SnapshotPlanWhereInput autoDeleteNumIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_AUTO_DELETE_NUM_IN);
        return this;
    }

    public void setAutoDeleteNumIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_AUTO_DELETE_NUM_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_AUTO_DELETE_NUM_IN);
        }
    }

    public boolean getAutoDeleteNumIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_AUTO_DELETE_NUM_IN);
    }

    public SnapshotPlanWhereInput autoDeleteNumLt(Integer autoDeleteNumLt) {

        this.autoDeleteNumLt = autoDeleteNumLt;
        return this;
    }

    /**
     * Get autoDeleteNumLt
     *
     * @return autoDeleteNumLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getAutoDeleteNumLt() {
        return autoDeleteNumLt;
    }

    public void setAutoDeleteNumLt(Integer autoDeleteNumLt) {
        this.autoDeleteNumLt = autoDeleteNumLt;
    }

    public SnapshotPlanWhereInput autoDeleteNumLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_AUTO_DELETE_NUM_LT);
        return this;
    }

    public SnapshotPlanWhereInput autoDeleteNumLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_AUTO_DELETE_NUM_LT);
        return this;
    }

    public void setAutoDeleteNumLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_AUTO_DELETE_NUM_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_AUTO_DELETE_NUM_LT);
        }
    }

    public boolean getAutoDeleteNumLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_AUTO_DELETE_NUM_LT);
    }

    public SnapshotPlanWhereInput autoDeleteNumLte(Integer autoDeleteNumLte) {

        this.autoDeleteNumLte = autoDeleteNumLte;
        return this;
    }

    /**
     * Get autoDeleteNumLte
     *
     * @return autoDeleteNumLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getAutoDeleteNumLte() {
        return autoDeleteNumLte;
    }

    public void setAutoDeleteNumLte(Integer autoDeleteNumLte) {
        this.autoDeleteNumLte = autoDeleteNumLte;
    }

    public SnapshotPlanWhereInput autoDeleteNumLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_AUTO_DELETE_NUM_LTE);
        return this;
    }

    public SnapshotPlanWhereInput autoDeleteNumLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_AUTO_DELETE_NUM_LTE);
        return this;
    }

    public void setAutoDeleteNumLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_AUTO_DELETE_NUM_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_AUTO_DELETE_NUM_LTE);
        }
    }

    public boolean getAutoDeleteNumLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_AUTO_DELETE_NUM_LTE);
    }

    public SnapshotPlanWhereInput autoDeleteNumNot(Integer autoDeleteNumNot) {

        this.autoDeleteNumNot = autoDeleteNumNot;
        return this;
    }

    /**
     * Get autoDeleteNumNot
     *
     * @return autoDeleteNumNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getAutoDeleteNumNot() {
        return autoDeleteNumNot;
    }

    public void setAutoDeleteNumNot(Integer autoDeleteNumNot) {
        this.autoDeleteNumNot = autoDeleteNumNot;
    }

    public SnapshotPlanWhereInput autoDeleteNumNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_AUTO_DELETE_NUM_NOT);
        return this;
    }

    public SnapshotPlanWhereInput autoDeleteNumNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_AUTO_DELETE_NUM_NOT);
        return this;
    }

    public void setAutoDeleteNumNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_AUTO_DELETE_NUM_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_AUTO_DELETE_NUM_NOT);
        }
    }

    public boolean getAutoDeleteNumNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_AUTO_DELETE_NUM_NOT);
    }

    public SnapshotPlanWhereInput autoDeleteNumNotIn(List<Integer> autoDeleteNumNotIn) {

        this.autoDeleteNumNotIn = autoDeleteNumNotIn;
        return this;
    }

    public SnapshotPlanWhereInput addAutoDeleteNumNotInItem(Integer autoDeleteNumNotInItem) {
        if (this.autoDeleteNumNotIn == null) {
            this.autoDeleteNumNotIn = new ArrayList<Integer>();
        }
        this.autoDeleteNumNotIn.add(autoDeleteNumNotInItem);
        return this;
    }

    /**
     * Get autoDeleteNumNotIn
     *
     * @return autoDeleteNumNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getAutoDeleteNumNotIn() {
        return autoDeleteNumNotIn;
    }

    public void setAutoDeleteNumNotIn(List<Integer> autoDeleteNumNotIn) {
        this.autoDeleteNumNotIn = autoDeleteNumNotIn;
    }

    public SnapshotPlanWhereInput autoDeleteNumNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_AUTO_DELETE_NUM_NOT_IN);
        return this;
    }

    public SnapshotPlanWhereInput autoDeleteNumNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_AUTO_DELETE_NUM_NOT_IN);
        return this;
    }

    public void setAutoDeleteNumNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_AUTO_DELETE_NUM_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_AUTO_DELETE_NUM_NOT_IN);
        }
    }

    public boolean getAutoDeleteNumNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_AUTO_DELETE_NUM_NOT_IN);
    }

    public SnapshotPlanWhereInput autoExecuteNum(Integer autoExecuteNum) {

        this.autoExecuteNum = autoExecuteNum;
        return this;
    }

    /**
     * Get autoExecuteNum
     *
     * @return autoExecuteNum
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getAutoExecuteNum() {
        return autoExecuteNum;
    }

    public void setAutoExecuteNum(Integer autoExecuteNum) {
        this.autoExecuteNum = autoExecuteNum;
    }

    public SnapshotPlanWhereInput autoExecuteNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_AUTO_EXECUTE_NUM);
        return this;
    }

    public SnapshotPlanWhereInput autoExecuteNum_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_AUTO_EXECUTE_NUM);
        return this;
    }

    public void setAutoExecuteNum_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_AUTO_EXECUTE_NUM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_AUTO_EXECUTE_NUM);
        }
    }

    public boolean getAutoExecuteNum_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_AUTO_EXECUTE_NUM);
    }

    public SnapshotPlanWhereInput autoExecuteNumGt(Integer autoExecuteNumGt) {

        this.autoExecuteNumGt = autoExecuteNumGt;
        return this;
    }

    /**
     * Get autoExecuteNumGt
     *
     * @return autoExecuteNumGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getAutoExecuteNumGt() {
        return autoExecuteNumGt;
    }

    public void setAutoExecuteNumGt(Integer autoExecuteNumGt) {
        this.autoExecuteNumGt = autoExecuteNumGt;
    }

    public SnapshotPlanWhereInput autoExecuteNumGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_AUTO_EXECUTE_NUM_GT);
        return this;
    }

    public SnapshotPlanWhereInput autoExecuteNumGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_AUTO_EXECUTE_NUM_GT);
        return this;
    }

    public void setAutoExecuteNumGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_AUTO_EXECUTE_NUM_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_AUTO_EXECUTE_NUM_GT);
        }
    }

    public boolean getAutoExecuteNumGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_AUTO_EXECUTE_NUM_GT);
    }

    public SnapshotPlanWhereInput autoExecuteNumGte(Integer autoExecuteNumGte) {

        this.autoExecuteNumGte = autoExecuteNumGte;
        return this;
    }

    /**
     * Get autoExecuteNumGte
     *
     * @return autoExecuteNumGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getAutoExecuteNumGte() {
        return autoExecuteNumGte;
    }

    public void setAutoExecuteNumGte(Integer autoExecuteNumGte) {
        this.autoExecuteNumGte = autoExecuteNumGte;
    }

    public SnapshotPlanWhereInput autoExecuteNumGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_AUTO_EXECUTE_NUM_GTE);
        return this;
    }

    public SnapshotPlanWhereInput autoExecuteNumGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_AUTO_EXECUTE_NUM_GTE);
        return this;
    }

    public void setAutoExecuteNumGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_AUTO_EXECUTE_NUM_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_AUTO_EXECUTE_NUM_GTE);
        }
    }

    public boolean getAutoExecuteNumGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_AUTO_EXECUTE_NUM_GTE);
    }

    public SnapshotPlanWhereInput autoExecuteNumIn(List<Integer> autoExecuteNumIn) {

        this.autoExecuteNumIn = autoExecuteNumIn;
        return this;
    }

    public SnapshotPlanWhereInput addAutoExecuteNumInItem(Integer autoExecuteNumInItem) {
        if (this.autoExecuteNumIn == null) {
            this.autoExecuteNumIn = new ArrayList<Integer>();
        }
        this.autoExecuteNumIn.add(autoExecuteNumInItem);
        return this;
    }

    /**
     * Get autoExecuteNumIn
     *
     * @return autoExecuteNumIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getAutoExecuteNumIn() {
        return autoExecuteNumIn;
    }

    public void setAutoExecuteNumIn(List<Integer> autoExecuteNumIn) {
        this.autoExecuteNumIn = autoExecuteNumIn;
    }

    public SnapshotPlanWhereInput autoExecuteNumIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_AUTO_EXECUTE_NUM_IN);
        return this;
    }

    public SnapshotPlanWhereInput autoExecuteNumIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_AUTO_EXECUTE_NUM_IN);
        return this;
    }

    public void setAutoExecuteNumIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_AUTO_EXECUTE_NUM_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_AUTO_EXECUTE_NUM_IN);
        }
    }

    public boolean getAutoExecuteNumIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_AUTO_EXECUTE_NUM_IN);
    }

    public SnapshotPlanWhereInput autoExecuteNumLt(Integer autoExecuteNumLt) {

        this.autoExecuteNumLt = autoExecuteNumLt;
        return this;
    }

    /**
     * Get autoExecuteNumLt
     *
     * @return autoExecuteNumLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getAutoExecuteNumLt() {
        return autoExecuteNumLt;
    }

    public void setAutoExecuteNumLt(Integer autoExecuteNumLt) {
        this.autoExecuteNumLt = autoExecuteNumLt;
    }

    public SnapshotPlanWhereInput autoExecuteNumLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_AUTO_EXECUTE_NUM_LT);
        return this;
    }

    public SnapshotPlanWhereInput autoExecuteNumLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_AUTO_EXECUTE_NUM_LT);
        return this;
    }

    public void setAutoExecuteNumLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_AUTO_EXECUTE_NUM_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_AUTO_EXECUTE_NUM_LT);
        }
    }

    public boolean getAutoExecuteNumLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_AUTO_EXECUTE_NUM_LT);
    }

    public SnapshotPlanWhereInput autoExecuteNumLte(Integer autoExecuteNumLte) {

        this.autoExecuteNumLte = autoExecuteNumLte;
        return this;
    }

    /**
     * Get autoExecuteNumLte
     *
     * @return autoExecuteNumLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getAutoExecuteNumLte() {
        return autoExecuteNumLte;
    }

    public void setAutoExecuteNumLte(Integer autoExecuteNumLte) {
        this.autoExecuteNumLte = autoExecuteNumLte;
    }

    public SnapshotPlanWhereInput autoExecuteNumLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_AUTO_EXECUTE_NUM_LTE);
        return this;
    }

    public SnapshotPlanWhereInput autoExecuteNumLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_AUTO_EXECUTE_NUM_LTE);
        return this;
    }

    public void setAutoExecuteNumLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_AUTO_EXECUTE_NUM_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_AUTO_EXECUTE_NUM_LTE);
        }
    }

    public boolean getAutoExecuteNumLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_AUTO_EXECUTE_NUM_LTE);
    }

    public SnapshotPlanWhereInput autoExecuteNumNot(Integer autoExecuteNumNot) {

        this.autoExecuteNumNot = autoExecuteNumNot;
        return this;
    }

    /**
     * Get autoExecuteNumNot
     *
     * @return autoExecuteNumNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getAutoExecuteNumNot() {
        return autoExecuteNumNot;
    }

    public void setAutoExecuteNumNot(Integer autoExecuteNumNot) {
        this.autoExecuteNumNot = autoExecuteNumNot;
    }

    public SnapshotPlanWhereInput autoExecuteNumNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_AUTO_EXECUTE_NUM_NOT);
        return this;
    }

    public SnapshotPlanWhereInput autoExecuteNumNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_AUTO_EXECUTE_NUM_NOT);
        return this;
    }

    public void setAutoExecuteNumNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_AUTO_EXECUTE_NUM_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_AUTO_EXECUTE_NUM_NOT);
        }
    }

    public boolean getAutoExecuteNumNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_AUTO_EXECUTE_NUM_NOT);
    }

    public SnapshotPlanWhereInput autoExecuteNumNotIn(List<Integer> autoExecuteNumNotIn) {

        this.autoExecuteNumNotIn = autoExecuteNumNotIn;
        return this;
    }

    public SnapshotPlanWhereInput addAutoExecuteNumNotInItem(Integer autoExecuteNumNotInItem) {
        if (this.autoExecuteNumNotIn == null) {
            this.autoExecuteNumNotIn = new ArrayList<Integer>();
        }
        this.autoExecuteNumNotIn.add(autoExecuteNumNotInItem);
        return this;
    }

    /**
     * Get autoExecuteNumNotIn
     *
     * @return autoExecuteNumNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getAutoExecuteNumNotIn() {
        return autoExecuteNumNotIn;
    }

    public void setAutoExecuteNumNotIn(List<Integer> autoExecuteNumNotIn) {
        this.autoExecuteNumNotIn = autoExecuteNumNotIn;
    }

    public SnapshotPlanWhereInput autoExecuteNumNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_AUTO_EXECUTE_NUM_NOT_IN);
        return this;
    }

    public SnapshotPlanWhereInput autoExecuteNumNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_AUTO_EXECUTE_NUM_NOT_IN);
        return this;
    }

    public void setAutoExecuteNumNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_AUTO_EXECUTE_NUM_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_AUTO_EXECUTE_NUM_NOT_IN);
        }
    }

    public boolean getAutoExecuteNumNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_AUTO_EXECUTE_NUM_NOT_IN);
    }

    public SnapshotPlanWhereInput cluster(ClusterWhereInput cluster) {

        this.cluster = cluster;
        return this;
    }

    /**
     * Get cluster
     *
     * @return cluster
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ClusterWhereInput getCluster() {
        return cluster;
    }

    public void setCluster(ClusterWhereInput cluster) {
        this.cluster = cluster;
    }

    public SnapshotPlanWhereInput cluster_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER);
        return this;
    }

    public SnapshotPlanWhereInput cluster_ExplictlyNonNull() {
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

    public SnapshotPlanWhereInput description(String description) {

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

    public SnapshotPlanWhereInput description_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION);
        return this;
    }

    public SnapshotPlanWhereInput description_ExplictlyNonNull() {
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

    public SnapshotPlanWhereInput descriptionContains(String descriptionContains) {

        this.descriptionContains = descriptionContains;
        return this;
    }

    /**
     * Get descriptionContains
     *
     * @return descriptionContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDescriptionContains() {
        return descriptionContains;
    }

    public void setDescriptionContains(String descriptionContains) {
        this.descriptionContains = descriptionContains;
    }

    public SnapshotPlanWhereInput descriptionContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_CONTAINS);
        return this;
    }

    public SnapshotPlanWhereInput descriptionContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_CONTAINS);
        return this;
    }

    public void setDescriptionContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_CONTAINS);
        }
    }

    public boolean getDescriptionContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESCRIPTION_CONTAINS);
    }

    public SnapshotPlanWhereInput descriptionEndsWith(String descriptionEndsWith) {

        this.descriptionEndsWith = descriptionEndsWith;
        return this;
    }

    /**
     * Get descriptionEndsWith
     *
     * @return descriptionEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDescriptionEndsWith() {
        return descriptionEndsWith;
    }

    public void setDescriptionEndsWith(String descriptionEndsWith) {
        this.descriptionEndsWith = descriptionEndsWith;
    }

    public SnapshotPlanWhereInput descriptionEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_ENDS_WITH);
        return this;
    }

    public SnapshotPlanWhereInput descriptionEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_ENDS_WITH);
        return this;
    }

    public void setDescriptionEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_ENDS_WITH);
        }
    }

    public boolean getDescriptionEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESCRIPTION_ENDS_WITH);
    }

    public SnapshotPlanWhereInput descriptionGt(String descriptionGt) {

        this.descriptionGt = descriptionGt;
        return this;
    }

    /**
     * Get descriptionGt
     *
     * @return descriptionGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDescriptionGt() {
        return descriptionGt;
    }

    public void setDescriptionGt(String descriptionGt) {
        this.descriptionGt = descriptionGt;
    }

    public SnapshotPlanWhereInput descriptionGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_GT);
        return this;
    }

    public SnapshotPlanWhereInput descriptionGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_GT);
        return this;
    }

    public void setDescriptionGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_GT);
        }
    }

    public boolean getDescriptionGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESCRIPTION_GT);
    }

    public SnapshotPlanWhereInput descriptionGte(String descriptionGte) {

        this.descriptionGte = descriptionGte;
        return this;
    }

    /**
     * Get descriptionGte
     *
     * @return descriptionGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDescriptionGte() {
        return descriptionGte;
    }

    public void setDescriptionGte(String descriptionGte) {
        this.descriptionGte = descriptionGte;
    }

    public SnapshotPlanWhereInput descriptionGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_GTE);
        return this;
    }

    public SnapshotPlanWhereInput descriptionGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_GTE);
        return this;
    }

    public void setDescriptionGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_GTE);
        }
    }

    public boolean getDescriptionGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESCRIPTION_GTE);
    }

    public SnapshotPlanWhereInput descriptionIn(List<String> descriptionIn) {

        this.descriptionIn = descriptionIn;
        return this;
    }

    public SnapshotPlanWhereInput addDescriptionInItem(String descriptionInItem) {
        if (this.descriptionIn == null) {
            this.descriptionIn = new ArrayList<String>();
        }
        this.descriptionIn.add(descriptionInItem);
        return this;
    }

    /**
     * Get descriptionIn
     *
     * @return descriptionIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getDescriptionIn() {
        return descriptionIn;
    }

    public void setDescriptionIn(List<String> descriptionIn) {
        this.descriptionIn = descriptionIn;
    }

    public SnapshotPlanWhereInput descriptionIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_IN);
        return this;
    }

    public SnapshotPlanWhereInput descriptionIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_IN);
        return this;
    }

    public void setDescriptionIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_IN);
        }
    }

    public boolean getDescriptionIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESCRIPTION_IN);
    }

    public SnapshotPlanWhereInput descriptionLt(String descriptionLt) {

        this.descriptionLt = descriptionLt;
        return this;
    }

    /**
     * Get descriptionLt
     *
     * @return descriptionLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDescriptionLt() {
        return descriptionLt;
    }

    public void setDescriptionLt(String descriptionLt) {
        this.descriptionLt = descriptionLt;
    }

    public SnapshotPlanWhereInput descriptionLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_LT);
        return this;
    }

    public SnapshotPlanWhereInput descriptionLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_LT);
        return this;
    }

    public void setDescriptionLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_LT);
        }
    }

    public boolean getDescriptionLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESCRIPTION_LT);
    }

    public SnapshotPlanWhereInput descriptionLte(String descriptionLte) {

        this.descriptionLte = descriptionLte;
        return this;
    }

    /**
     * Get descriptionLte
     *
     * @return descriptionLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDescriptionLte() {
        return descriptionLte;
    }

    public void setDescriptionLte(String descriptionLte) {
        this.descriptionLte = descriptionLte;
    }

    public SnapshotPlanWhereInput descriptionLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_LTE);
        return this;
    }

    public SnapshotPlanWhereInput descriptionLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_LTE);
        return this;
    }

    public void setDescriptionLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_LTE);
        }
    }

    public boolean getDescriptionLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESCRIPTION_LTE);
    }

    public SnapshotPlanWhereInput descriptionNot(String descriptionNot) {

        this.descriptionNot = descriptionNot;
        return this;
    }

    /**
     * Get descriptionNot
     *
     * @return descriptionNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDescriptionNot() {
        return descriptionNot;
    }

    public void setDescriptionNot(String descriptionNot) {
        this.descriptionNot = descriptionNot;
    }

    public SnapshotPlanWhereInput descriptionNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT);
        return this;
    }

    public SnapshotPlanWhereInput descriptionNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_NOT);
        return this;
    }

    public void setDescriptionNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_NOT);
        }
    }

    public boolean getDescriptionNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESCRIPTION_NOT);
    }

    public SnapshotPlanWhereInput descriptionNotContains(String descriptionNotContains) {

        this.descriptionNotContains = descriptionNotContains;
        return this;
    }

    /**
     * Get descriptionNotContains
     *
     * @return descriptionNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDescriptionNotContains() {
        return descriptionNotContains;
    }

    public void setDescriptionNotContains(String descriptionNotContains) {
        this.descriptionNotContains = descriptionNotContains;
    }

    public SnapshotPlanWhereInput descriptionNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_CONTAINS);
        return this;
    }

    public SnapshotPlanWhereInput descriptionNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_NOT_CONTAINS);
        return this;
    }

    public void setDescriptionNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_NOT_CONTAINS);
        }
    }

    public boolean getDescriptionNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESCRIPTION_NOT_CONTAINS);
    }

    public SnapshotPlanWhereInput descriptionNotEndsWith(String descriptionNotEndsWith) {

        this.descriptionNotEndsWith = descriptionNotEndsWith;
        return this;
    }

    /**
     * Get descriptionNotEndsWith
     *
     * @return descriptionNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDescriptionNotEndsWith() {
        return descriptionNotEndsWith;
    }

    public void setDescriptionNotEndsWith(String descriptionNotEndsWith) {
        this.descriptionNotEndsWith = descriptionNotEndsWith;
    }

    public SnapshotPlanWhereInput descriptionNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_ENDS_WITH);
        return this;
    }

    public SnapshotPlanWhereInput descriptionNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_NOT_ENDS_WITH);
        return this;
    }

    public void setDescriptionNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_NOT_ENDS_WITH);
        }
    }

    public boolean getDescriptionNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESCRIPTION_NOT_ENDS_WITH);
    }

    public SnapshotPlanWhereInput descriptionNotIn(List<String> descriptionNotIn) {

        this.descriptionNotIn = descriptionNotIn;
        return this;
    }

    public SnapshotPlanWhereInput addDescriptionNotInItem(String descriptionNotInItem) {
        if (this.descriptionNotIn == null) {
            this.descriptionNotIn = new ArrayList<String>();
        }
        this.descriptionNotIn.add(descriptionNotInItem);
        return this;
    }

    /**
     * Get descriptionNotIn
     *
     * @return descriptionNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getDescriptionNotIn() {
        return descriptionNotIn;
    }

    public void setDescriptionNotIn(List<String> descriptionNotIn) {
        this.descriptionNotIn = descriptionNotIn;
    }

    public SnapshotPlanWhereInput descriptionNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_IN);
        return this;
    }

    public SnapshotPlanWhereInput descriptionNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_NOT_IN);
        return this;
    }

    public void setDescriptionNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_NOT_IN);
        }
    }

    public boolean getDescriptionNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESCRIPTION_NOT_IN);
    }

    public SnapshotPlanWhereInput descriptionNotStartsWith(String descriptionNotStartsWith) {

        this.descriptionNotStartsWith = descriptionNotStartsWith;
        return this;
    }

    /**
     * Get descriptionNotStartsWith
     *
     * @return descriptionNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDescriptionNotStartsWith() {
        return descriptionNotStartsWith;
    }

    public void setDescriptionNotStartsWith(String descriptionNotStartsWith) {
        this.descriptionNotStartsWith = descriptionNotStartsWith;
    }

    public SnapshotPlanWhereInput descriptionNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_STARTS_WITH);
        return this;
    }

    public SnapshotPlanWhereInput descriptionNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_NOT_STARTS_WITH);
        return this;
    }

    public void setDescriptionNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_NOT_STARTS_WITH);
        }
    }

    public boolean getDescriptionNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESCRIPTION_NOT_STARTS_WITH);
    }

    public SnapshotPlanWhereInput descriptionStartsWith(String descriptionStartsWith) {

        this.descriptionStartsWith = descriptionStartsWith;
        return this;
    }

    /**
     * Get descriptionStartsWith
     *
     * @return descriptionStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDescriptionStartsWith() {
        return descriptionStartsWith;
    }

    public void setDescriptionStartsWith(String descriptionStartsWith) {
        this.descriptionStartsWith = descriptionStartsWith;
    }

    public SnapshotPlanWhereInput descriptionStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_STARTS_WITH);
        return this;
    }

    public SnapshotPlanWhereInput descriptionStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_STARTS_WITH);
        return this;
    }

    public void setDescriptionStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DESCRIPTION_STARTS_WITH);
        }
    }

    public boolean getDescriptionStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DESCRIPTION_STARTS_WITH);
    }

    public SnapshotPlanWhereInput endTime(String endTime) {

        this.endTime = endTime;
        return this;
    }

    /**
     * Get endTime
     *
     * @return endTime
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public SnapshotPlanWhereInput endTime_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_END_TIME);
        return this;
    }

    public SnapshotPlanWhereInput endTime_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_END_TIME);
        return this;
    }

    public void setEndTime_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_END_TIME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_END_TIME);
        }
    }

    public boolean getEndTime_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_END_TIME);
    }

    public SnapshotPlanWhereInput endTimeGt(String endTimeGt) {

        this.endTimeGt = endTimeGt;
        return this;
    }

    /**
     * Get endTimeGt
     *
     * @return endTimeGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getEndTimeGt() {
        return endTimeGt;
    }

    public void setEndTimeGt(String endTimeGt) {
        this.endTimeGt = endTimeGt;
    }

    public SnapshotPlanWhereInput endTimeGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_END_TIME_GT);
        return this;
    }

    public SnapshotPlanWhereInput endTimeGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_END_TIME_GT);
        return this;
    }

    public void setEndTimeGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_END_TIME_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_END_TIME_GT);
        }
    }

    public boolean getEndTimeGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_END_TIME_GT);
    }

    public SnapshotPlanWhereInput endTimeGte(String endTimeGte) {

        this.endTimeGte = endTimeGte;
        return this;
    }

    /**
     * Get endTimeGte
     *
     * @return endTimeGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getEndTimeGte() {
        return endTimeGte;
    }

    public void setEndTimeGte(String endTimeGte) {
        this.endTimeGte = endTimeGte;
    }

    public SnapshotPlanWhereInput endTimeGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_END_TIME_GTE);
        return this;
    }

    public SnapshotPlanWhereInput endTimeGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_END_TIME_GTE);
        return this;
    }

    public void setEndTimeGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_END_TIME_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_END_TIME_GTE);
        }
    }

    public boolean getEndTimeGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_END_TIME_GTE);
    }

    public SnapshotPlanWhereInput endTimeIn(List<String> endTimeIn) {

        this.endTimeIn = endTimeIn;
        return this;
    }

    public SnapshotPlanWhereInput addEndTimeInItem(String endTimeInItem) {
        if (this.endTimeIn == null) {
            this.endTimeIn = new ArrayList<String>();
        }
        this.endTimeIn.add(endTimeInItem);
        return this;
    }

    /**
     * Get endTimeIn
     *
     * @return endTimeIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getEndTimeIn() {
        return endTimeIn;
    }

    public void setEndTimeIn(List<String> endTimeIn) {
        this.endTimeIn = endTimeIn;
    }

    public SnapshotPlanWhereInput endTimeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_END_TIME_IN);
        return this;
    }

    public SnapshotPlanWhereInput endTimeIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_END_TIME_IN);
        return this;
    }

    public void setEndTimeIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_END_TIME_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_END_TIME_IN);
        }
    }

    public boolean getEndTimeIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_END_TIME_IN);
    }

    public SnapshotPlanWhereInput endTimeLt(String endTimeLt) {

        this.endTimeLt = endTimeLt;
        return this;
    }

    /**
     * Get endTimeLt
     *
     * @return endTimeLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getEndTimeLt() {
        return endTimeLt;
    }

    public void setEndTimeLt(String endTimeLt) {
        this.endTimeLt = endTimeLt;
    }

    public SnapshotPlanWhereInput endTimeLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_END_TIME_LT);
        return this;
    }

    public SnapshotPlanWhereInput endTimeLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_END_TIME_LT);
        return this;
    }

    public void setEndTimeLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_END_TIME_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_END_TIME_LT);
        }
    }

    public boolean getEndTimeLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_END_TIME_LT);
    }

    public SnapshotPlanWhereInput endTimeLte(String endTimeLte) {

        this.endTimeLte = endTimeLte;
        return this;
    }

    /**
     * Get endTimeLte
     *
     * @return endTimeLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getEndTimeLte() {
        return endTimeLte;
    }

    public void setEndTimeLte(String endTimeLte) {
        this.endTimeLte = endTimeLte;
    }

    public SnapshotPlanWhereInput endTimeLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_END_TIME_LTE);
        return this;
    }

    public SnapshotPlanWhereInput endTimeLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_END_TIME_LTE);
        return this;
    }

    public void setEndTimeLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_END_TIME_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_END_TIME_LTE);
        }
    }

    public boolean getEndTimeLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_END_TIME_LTE);
    }

    public SnapshotPlanWhereInput endTimeNot(String endTimeNot) {

        this.endTimeNot = endTimeNot;
        return this;
    }

    /**
     * Get endTimeNot
     *
     * @return endTimeNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getEndTimeNot() {
        return endTimeNot;
    }

    public void setEndTimeNot(String endTimeNot) {
        this.endTimeNot = endTimeNot;
    }

    public SnapshotPlanWhereInput endTimeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_END_TIME_NOT);
        return this;
    }

    public SnapshotPlanWhereInput endTimeNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_END_TIME_NOT);
        return this;
    }

    public void setEndTimeNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_END_TIME_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_END_TIME_NOT);
        }
    }

    public boolean getEndTimeNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_END_TIME_NOT);
    }

    public SnapshotPlanWhereInput endTimeNotIn(List<String> endTimeNotIn) {

        this.endTimeNotIn = endTimeNotIn;
        return this;
    }

    public SnapshotPlanWhereInput addEndTimeNotInItem(String endTimeNotInItem) {
        if (this.endTimeNotIn == null) {
            this.endTimeNotIn = new ArrayList<String>();
        }
        this.endTimeNotIn.add(endTimeNotInItem);
        return this;
    }

    /**
     * Get endTimeNotIn
     *
     * @return endTimeNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getEndTimeNotIn() {
        return endTimeNotIn;
    }

    public void setEndTimeNotIn(List<String> endTimeNotIn) {
        this.endTimeNotIn = endTimeNotIn;
    }

    public SnapshotPlanWhereInput endTimeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_END_TIME_NOT_IN);
        return this;
    }

    public SnapshotPlanWhereInput endTimeNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_END_TIME_NOT_IN);
        return this;
    }

    public void setEndTimeNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_END_TIME_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_END_TIME_NOT_IN);
        }
    }

    public boolean getEndTimeNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_END_TIME_NOT_IN);
    }

    public SnapshotPlanWhereInput entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {

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

    public SnapshotPlanWhereInput entityAsyncStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        return this;
    }

    public SnapshotPlanWhereInput entityAsyncStatus_ExplictlyNonNull() {
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

    public SnapshotPlanWhereInput entityAsyncStatusIn(List<EntityAsyncStatus> entityAsyncStatusIn) {

        this.entityAsyncStatusIn = entityAsyncStatusIn;
        return this;
    }

    public SnapshotPlanWhereInput addEntityAsyncStatusInItem(
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

    public SnapshotPlanWhereInput entityAsyncStatusIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_IN);
        return this;
    }

    public SnapshotPlanWhereInput entityAsyncStatusIn_ExplictlyNonNull() {
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

    public SnapshotPlanWhereInput entityAsyncStatusNot(EntityAsyncStatus entityAsyncStatusNot) {

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

    public SnapshotPlanWhereInput entityAsyncStatusNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT);
        return this;
    }

    public SnapshotPlanWhereInput entityAsyncStatusNot_ExplictlyNonNull() {
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

    public SnapshotPlanWhereInput entityAsyncStatusNotIn(
            List<EntityAsyncStatus> entityAsyncStatusNotIn) {

        this.entityAsyncStatusNotIn = entityAsyncStatusNotIn;
        return this;
    }

    public SnapshotPlanWhereInput addEntityAsyncStatusNotInItem(
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

    public SnapshotPlanWhereInput entityAsyncStatusNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT_IN);
        return this;
    }

    public SnapshotPlanWhereInput entityAsyncStatusNotIn_ExplictlyNonNull() {
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

    public SnapshotPlanWhereInput executePlanType(SnapshotPlanExecuteType executePlanType) {

        this.executePlanType = executePlanType;
        return this;
    }

    /**
     * Get executePlanType
     *
     * @return executePlanType
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public SnapshotPlanExecuteType getExecutePlanType() {
        return executePlanType;
    }

    public void setExecutePlanType(SnapshotPlanExecuteType executePlanType) {
        this.executePlanType = executePlanType;
    }

    public SnapshotPlanWhereInput executePlanType_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXECUTE_PLAN_TYPE);
        return this;
    }

    public SnapshotPlanWhereInput executePlanType_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EXECUTE_PLAN_TYPE);
        return this;
    }

    public void setExecutePlanType_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EXECUTE_PLAN_TYPE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EXECUTE_PLAN_TYPE);
        }
    }

    public boolean getExecutePlanType_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EXECUTE_PLAN_TYPE);
    }

    public SnapshotPlanWhereInput executePlanTypeIn(
            List<SnapshotPlanExecuteType> executePlanTypeIn) {

        this.executePlanTypeIn = executePlanTypeIn;
        return this;
    }

    public SnapshotPlanWhereInput addExecutePlanTypeInItem(
            SnapshotPlanExecuteType executePlanTypeInItem) {
        if (this.executePlanTypeIn == null) {
            this.executePlanTypeIn = new ArrayList<SnapshotPlanExecuteType>();
        }
        this.executePlanTypeIn.add(executePlanTypeInItem);
        return this;
    }

    /**
     * Get executePlanTypeIn
     *
     * @return executePlanTypeIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<SnapshotPlanExecuteType> getExecutePlanTypeIn() {
        return executePlanTypeIn;
    }

    public void setExecutePlanTypeIn(List<SnapshotPlanExecuteType> executePlanTypeIn) {
        this.executePlanTypeIn = executePlanTypeIn;
    }

    public SnapshotPlanWhereInput executePlanTypeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXECUTE_PLAN_TYPE_IN);
        return this;
    }

    public SnapshotPlanWhereInput executePlanTypeIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EXECUTE_PLAN_TYPE_IN);
        return this;
    }

    public void setExecutePlanTypeIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EXECUTE_PLAN_TYPE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EXECUTE_PLAN_TYPE_IN);
        }
    }

    public boolean getExecutePlanTypeIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EXECUTE_PLAN_TYPE_IN);
    }

    public SnapshotPlanWhereInput executePlanTypeNot(SnapshotPlanExecuteType executePlanTypeNot) {

        this.executePlanTypeNot = executePlanTypeNot;
        return this;
    }

    /**
     * Get executePlanTypeNot
     *
     * @return executePlanTypeNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public SnapshotPlanExecuteType getExecutePlanTypeNot() {
        return executePlanTypeNot;
    }

    public void setExecutePlanTypeNot(SnapshotPlanExecuteType executePlanTypeNot) {
        this.executePlanTypeNot = executePlanTypeNot;
    }

    public SnapshotPlanWhereInput executePlanTypeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXECUTE_PLAN_TYPE_NOT);
        return this;
    }

    public SnapshotPlanWhereInput executePlanTypeNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EXECUTE_PLAN_TYPE_NOT);
        return this;
    }

    public void setExecutePlanTypeNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EXECUTE_PLAN_TYPE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EXECUTE_PLAN_TYPE_NOT);
        }
    }

    public boolean getExecutePlanTypeNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EXECUTE_PLAN_TYPE_NOT);
    }

    public SnapshotPlanWhereInput executePlanTypeNotIn(
            List<SnapshotPlanExecuteType> executePlanTypeNotIn) {

        this.executePlanTypeNotIn = executePlanTypeNotIn;
        return this;
    }

    public SnapshotPlanWhereInput addExecutePlanTypeNotInItem(
            SnapshotPlanExecuteType executePlanTypeNotInItem) {
        if (this.executePlanTypeNotIn == null) {
            this.executePlanTypeNotIn = new ArrayList<SnapshotPlanExecuteType>();
        }
        this.executePlanTypeNotIn.add(executePlanTypeNotInItem);
        return this;
    }

    /**
     * Get executePlanTypeNotIn
     *
     * @return executePlanTypeNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<SnapshotPlanExecuteType> getExecutePlanTypeNotIn() {
        return executePlanTypeNotIn;
    }

    public void setExecutePlanTypeNotIn(List<SnapshotPlanExecuteType> executePlanTypeNotIn) {
        this.executePlanTypeNotIn = executePlanTypeNotIn;
    }

    public SnapshotPlanWhereInput executePlanTypeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXECUTE_PLAN_TYPE_NOT_IN);
        return this;
    }

    public SnapshotPlanWhereInput executePlanTypeNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EXECUTE_PLAN_TYPE_NOT_IN);
        return this;
    }

    public void setExecutePlanTypeNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EXECUTE_PLAN_TYPE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EXECUTE_PLAN_TYPE_NOT_IN);
        }
    }

    public boolean getExecutePlanTypeNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EXECUTE_PLAN_TYPE_NOT_IN);
    }

    public SnapshotPlanWhereInput executionTasksEvery(
            SnapshotPlanTaskWhereInput executionTasksEvery) {

        this.executionTasksEvery = executionTasksEvery;
        return this;
    }

    /**
     * Get executionTasksEvery
     *
     * @return executionTasksEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public SnapshotPlanTaskWhereInput getExecutionTasksEvery() {
        return executionTasksEvery;
    }

    public void setExecutionTasksEvery(SnapshotPlanTaskWhereInput executionTasksEvery) {
        this.executionTasksEvery = executionTasksEvery;
    }

    public SnapshotPlanWhereInput executionTasksEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXECUTION_TASKS_EVERY);
        return this;
    }

    public SnapshotPlanWhereInput executionTasksEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EXECUTION_TASKS_EVERY);
        return this;
    }

    public void setExecutionTasksEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EXECUTION_TASKS_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EXECUTION_TASKS_EVERY);
        }
    }

    public boolean getExecutionTasksEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EXECUTION_TASKS_EVERY);
    }

    public SnapshotPlanWhereInput executionTasksNone(
            SnapshotPlanTaskWhereInput executionTasksNone) {

        this.executionTasksNone = executionTasksNone;
        return this;
    }

    /**
     * Get executionTasksNone
     *
     * @return executionTasksNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public SnapshotPlanTaskWhereInput getExecutionTasksNone() {
        return executionTasksNone;
    }

    public void setExecutionTasksNone(SnapshotPlanTaskWhereInput executionTasksNone) {
        this.executionTasksNone = executionTasksNone;
    }

    public SnapshotPlanWhereInput executionTasksNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXECUTION_TASKS_NONE);
        return this;
    }

    public SnapshotPlanWhereInput executionTasksNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EXECUTION_TASKS_NONE);
        return this;
    }

    public void setExecutionTasksNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EXECUTION_TASKS_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EXECUTION_TASKS_NONE);
        }
    }

    public boolean getExecutionTasksNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EXECUTION_TASKS_NONE);
    }

    public SnapshotPlanWhereInput executionTasksSome(
            SnapshotPlanTaskWhereInput executionTasksSome) {

        this.executionTasksSome = executionTasksSome;
        return this;
    }

    /**
     * Get executionTasksSome
     *
     * @return executionTasksSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public SnapshotPlanTaskWhereInput getExecutionTasksSome() {
        return executionTasksSome;
    }

    public void setExecutionTasksSome(SnapshotPlanTaskWhereInput executionTasksSome) {
        this.executionTasksSome = executionTasksSome;
    }

    public SnapshotPlanWhereInput executionTasksSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_EXECUTION_TASKS_SOME);
        return this;
    }

    public SnapshotPlanWhereInput executionTasksSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_EXECUTION_TASKS_SOME);
        return this;
    }

    public void setExecutionTasksSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_EXECUTION_TASKS_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_EXECUTION_TASKS_SOME);
        }
    }

    public boolean getExecutionTasksSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_EXECUTION_TASKS_SOME);
    }

    public SnapshotPlanWhereInput healthy(Boolean healthy) {

        this.healthy = healthy;
        return this;
    }

    /**
     * Get healthy
     *
     * @return healthy
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getHealthy() {
        return healthy;
    }

    public void setHealthy(Boolean healthy) {
        this.healthy = healthy;
    }

    public SnapshotPlanWhereInput healthy_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HEALTHY);
        return this;
    }

    public SnapshotPlanWhereInput healthy_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HEALTHY);
        return this;
    }

    public void setHealthy_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HEALTHY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HEALTHY);
        }
    }

    public boolean getHealthy_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HEALTHY);
    }

    public SnapshotPlanWhereInput healthyNot(Boolean healthyNot) {

        this.healthyNot = healthyNot;
        return this;
    }

    /**
     * Get healthyNot
     *
     * @return healthyNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getHealthyNot() {
        return healthyNot;
    }

    public void setHealthyNot(Boolean healthyNot) {
        this.healthyNot = healthyNot;
    }

    public SnapshotPlanWhereInput healthyNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HEALTHY_NOT);
        return this;
    }

    public SnapshotPlanWhereInput healthyNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HEALTHY_NOT);
        return this;
    }

    public void setHealthyNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HEALTHY_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HEALTHY_NOT);
        }
    }

    public boolean getHealthyNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HEALTHY_NOT);
    }

    public SnapshotPlanWhereInput id(String id) {

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

    public SnapshotPlanWhereInput id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public SnapshotPlanWhereInput id_ExplictlyNonNull() {
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

    public SnapshotPlanWhereInput idContains(String idContains) {

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

    public SnapshotPlanWhereInput idContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_CONTAINS);
        return this;
    }

    public SnapshotPlanWhereInput idContains_ExplictlyNonNull() {
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

    public SnapshotPlanWhereInput idEndsWith(String idEndsWith) {

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

    public SnapshotPlanWhereInput idEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_ENDS_WITH);
        return this;
    }

    public SnapshotPlanWhereInput idEndsWith_ExplictlyNonNull() {
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

    public SnapshotPlanWhereInput idGt(String idGt) {

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

    public SnapshotPlanWhereInput idGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GT);
        return this;
    }

    public SnapshotPlanWhereInput idGt_ExplictlyNonNull() {
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

    public SnapshotPlanWhereInput idGte(String idGte) {

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

    public SnapshotPlanWhereInput idGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GTE);
        return this;
    }

    public SnapshotPlanWhereInput idGte_ExplictlyNonNull() {
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

    public SnapshotPlanWhereInput idIn(List<String> idIn) {

        this.idIn = idIn;
        return this;
    }

    public SnapshotPlanWhereInput addIdInItem(String idInItem) {
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

    public SnapshotPlanWhereInput idIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_IN);
        return this;
    }

    public SnapshotPlanWhereInput idIn_ExplictlyNonNull() {
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

    public SnapshotPlanWhereInput idLt(String idLt) {

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

    public SnapshotPlanWhereInput idLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LT);
        return this;
    }

    public SnapshotPlanWhereInput idLt_ExplictlyNonNull() {
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

    public SnapshotPlanWhereInput idLte(String idLte) {

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

    public SnapshotPlanWhereInput idLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LTE);
        return this;
    }

    public SnapshotPlanWhereInput idLte_ExplictlyNonNull() {
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

    public SnapshotPlanWhereInput idNot(String idNot) {

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

    public SnapshotPlanWhereInput idNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT);
        return this;
    }

    public SnapshotPlanWhereInput idNot_ExplictlyNonNull() {
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

    public SnapshotPlanWhereInput idNotContains(String idNotContains) {

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

    public SnapshotPlanWhereInput idNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_CONTAINS);
        return this;
    }

    public SnapshotPlanWhereInput idNotContains_ExplictlyNonNull() {
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

    public SnapshotPlanWhereInput idNotEndsWith(String idNotEndsWith) {

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

    public SnapshotPlanWhereInput idNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
        return this;
    }

    public SnapshotPlanWhereInput idNotEndsWith_ExplictlyNonNull() {
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

    public SnapshotPlanWhereInput idNotIn(List<String> idNotIn) {

        this.idNotIn = idNotIn;
        return this;
    }

    public SnapshotPlanWhereInput addIdNotInItem(String idNotInItem) {
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

    public SnapshotPlanWhereInput idNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_IN);
        return this;
    }

    public SnapshotPlanWhereInput idNotIn_ExplictlyNonNull() {
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

    public SnapshotPlanWhereInput idNotStartsWith(String idNotStartsWith) {

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

    public SnapshotPlanWhereInput idNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
        return this;
    }

    public SnapshotPlanWhereInput idNotStartsWith_ExplictlyNonNull() {
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

    public SnapshotPlanWhereInput idStartsWith(String idStartsWith) {

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

    public SnapshotPlanWhereInput idStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_STARTS_WITH);
        return this;
    }

    public SnapshotPlanWhereInput idStartsWith_ExplictlyNonNull() {
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

    public SnapshotPlanWhereInput lastExecuteEndTime(String lastExecuteEndTime) {

        this.lastExecuteEndTime = lastExecuteEndTime;
        return this;
    }

    /**
     * Get lastExecuteEndTime
     *
     * @return lastExecuteEndTime
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLastExecuteEndTime() {
        return lastExecuteEndTime;
    }

    public void setLastExecuteEndTime(String lastExecuteEndTime) {
        this.lastExecuteEndTime = lastExecuteEndTime;
    }

    public SnapshotPlanWhereInput lastExecuteEndTime_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_END_TIME);
        return this;
    }

    public SnapshotPlanWhereInput lastExecuteEndTime_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTE_END_TIME);
        return this;
    }

    public void setLastExecuteEndTime_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_END_TIME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTE_END_TIME);
        }
    }

    public boolean getLastExecuteEndTime_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LAST_EXECUTE_END_TIME);
    }

    public SnapshotPlanWhereInput lastExecuteEndTimeGt(String lastExecuteEndTimeGt) {

        this.lastExecuteEndTimeGt = lastExecuteEndTimeGt;
        return this;
    }

    /**
     * Get lastExecuteEndTimeGt
     *
     * @return lastExecuteEndTimeGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLastExecuteEndTimeGt() {
        return lastExecuteEndTimeGt;
    }

    public void setLastExecuteEndTimeGt(String lastExecuteEndTimeGt) {
        this.lastExecuteEndTimeGt = lastExecuteEndTimeGt;
    }

    public SnapshotPlanWhereInput lastExecuteEndTimeGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_END_TIME_GT);
        return this;
    }

    public SnapshotPlanWhereInput lastExecuteEndTimeGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTE_END_TIME_GT);
        return this;
    }

    public void setLastExecuteEndTimeGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_END_TIME_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTE_END_TIME_GT);
        }
    }

    public boolean getLastExecuteEndTimeGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LAST_EXECUTE_END_TIME_GT);
    }

    public SnapshotPlanWhereInput lastExecuteEndTimeGte(String lastExecuteEndTimeGte) {

        this.lastExecuteEndTimeGte = lastExecuteEndTimeGte;
        return this;
    }

    /**
     * Get lastExecuteEndTimeGte
     *
     * @return lastExecuteEndTimeGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLastExecuteEndTimeGte() {
        return lastExecuteEndTimeGte;
    }

    public void setLastExecuteEndTimeGte(String lastExecuteEndTimeGte) {
        this.lastExecuteEndTimeGte = lastExecuteEndTimeGte;
    }

    public SnapshotPlanWhereInput lastExecuteEndTimeGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_END_TIME_GTE);
        return this;
    }

    public SnapshotPlanWhereInput lastExecuteEndTimeGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTE_END_TIME_GTE);
        return this;
    }

    public void setLastExecuteEndTimeGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_END_TIME_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTE_END_TIME_GTE);
        }
    }

    public boolean getLastExecuteEndTimeGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LAST_EXECUTE_END_TIME_GTE);
    }

    public SnapshotPlanWhereInput lastExecuteEndTimeIn(List<String> lastExecuteEndTimeIn) {

        this.lastExecuteEndTimeIn = lastExecuteEndTimeIn;
        return this;
    }

    public SnapshotPlanWhereInput addLastExecuteEndTimeInItem(String lastExecuteEndTimeInItem) {
        if (this.lastExecuteEndTimeIn == null) {
            this.lastExecuteEndTimeIn = new ArrayList<String>();
        }
        this.lastExecuteEndTimeIn.add(lastExecuteEndTimeInItem);
        return this;
    }

    /**
     * Get lastExecuteEndTimeIn
     *
     * @return lastExecuteEndTimeIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getLastExecuteEndTimeIn() {
        return lastExecuteEndTimeIn;
    }

    public void setLastExecuteEndTimeIn(List<String> lastExecuteEndTimeIn) {
        this.lastExecuteEndTimeIn = lastExecuteEndTimeIn;
    }

    public SnapshotPlanWhereInput lastExecuteEndTimeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_END_TIME_IN);
        return this;
    }

    public SnapshotPlanWhereInput lastExecuteEndTimeIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTE_END_TIME_IN);
        return this;
    }

    public void setLastExecuteEndTimeIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_END_TIME_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTE_END_TIME_IN);
        }
    }

    public boolean getLastExecuteEndTimeIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LAST_EXECUTE_END_TIME_IN);
    }

    public SnapshotPlanWhereInput lastExecuteEndTimeLt(String lastExecuteEndTimeLt) {

        this.lastExecuteEndTimeLt = lastExecuteEndTimeLt;
        return this;
    }

    /**
     * Get lastExecuteEndTimeLt
     *
     * @return lastExecuteEndTimeLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLastExecuteEndTimeLt() {
        return lastExecuteEndTimeLt;
    }

    public void setLastExecuteEndTimeLt(String lastExecuteEndTimeLt) {
        this.lastExecuteEndTimeLt = lastExecuteEndTimeLt;
    }

    public SnapshotPlanWhereInput lastExecuteEndTimeLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_END_TIME_LT);
        return this;
    }

    public SnapshotPlanWhereInput lastExecuteEndTimeLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTE_END_TIME_LT);
        return this;
    }

    public void setLastExecuteEndTimeLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_END_TIME_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTE_END_TIME_LT);
        }
    }

    public boolean getLastExecuteEndTimeLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LAST_EXECUTE_END_TIME_LT);
    }

    public SnapshotPlanWhereInput lastExecuteEndTimeLte(String lastExecuteEndTimeLte) {

        this.lastExecuteEndTimeLte = lastExecuteEndTimeLte;
        return this;
    }

    /**
     * Get lastExecuteEndTimeLte
     *
     * @return lastExecuteEndTimeLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLastExecuteEndTimeLte() {
        return lastExecuteEndTimeLte;
    }

    public void setLastExecuteEndTimeLte(String lastExecuteEndTimeLte) {
        this.lastExecuteEndTimeLte = lastExecuteEndTimeLte;
    }

    public SnapshotPlanWhereInput lastExecuteEndTimeLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_END_TIME_LTE);
        return this;
    }

    public SnapshotPlanWhereInput lastExecuteEndTimeLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTE_END_TIME_LTE);
        return this;
    }

    public void setLastExecuteEndTimeLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_END_TIME_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTE_END_TIME_LTE);
        }
    }

    public boolean getLastExecuteEndTimeLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LAST_EXECUTE_END_TIME_LTE);
    }

    public SnapshotPlanWhereInput lastExecuteEndTimeNot(String lastExecuteEndTimeNot) {

        this.lastExecuteEndTimeNot = lastExecuteEndTimeNot;
        return this;
    }

    /**
     * Get lastExecuteEndTimeNot
     *
     * @return lastExecuteEndTimeNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLastExecuteEndTimeNot() {
        return lastExecuteEndTimeNot;
    }

    public void setLastExecuteEndTimeNot(String lastExecuteEndTimeNot) {
        this.lastExecuteEndTimeNot = lastExecuteEndTimeNot;
    }

    public SnapshotPlanWhereInput lastExecuteEndTimeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_END_TIME_NOT);
        return this;
    }

    public SnapshotPlanWhereInput lastExecuteEndTimeNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTE_END_TIME_NOT);
        return this;
    }

    public void setLastExecuteEndTimeNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_END_TIME_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTE_END_TIME_NOT);
        }
    }

    public boolean getLastExecuteEndTimeNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LAST_EXECUTE_END_TIME_NOT);
    }

    public SnapshotPlanWhereInput lastExecuteEndTimeNotIn(List<String> lastExecuteEndTimeNotIn) {

        this.lastExecuteEndTimeNotIn = lastExecuteEndTimeNotIn;
        return this;
    }

    public SnapshotPlanWhereInput addLastExecuteEndTimeNotInItem(
            String lastExecuteEndTimeNotInItem) {
        if (this.lastExecuteEndTimeNotIn == null) {
            this.lastExecuteEndTimeNotIn = new ArrayList<String>();
        }
        this.lastExecuteEndTimeNotIn.add(lastExecuteEndTimeNotInItem);
        return this;
    }

    /**
     * Get lastExecuteEndTimeNotIn
     *
     * @return lastExecuteEndTimeNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getLastExecuteEndTimeNotIn() {
        return lastExecuteEndTimeNotIn;
    }

    public void setLastExecuteEndTimeNotIn(List<String> lastExecuteEndTimeNotIn) {
        this.lastExecuteEndTimeNotIn = lastExecuteEndTimeNotIn;
    }

    public SnapshotPlanWhereInput lastExecuteEndTimeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_END_TIME_NOT_IN);
        return this;
    }

    public SnapshotPlanWhereInput lastExecuteEndTimeNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTE_END_TIME_NOT_IN);
        return this;
    }

    public void setLastExecuteEndTimeNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_END_TIME_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTE_END_TIME_NOT_IN);
        }
    }

    public boolean getLastExecuteEndTimeNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LAST_EXECUTE_END_TIME_NOT_IN);
    }

    public SnapshotPlanWhereInput lastExecuteStatus(SnapshotPlanExecuteStatus lastExecuteStatus) {

        this.lastExecuteStatus = lastExecuteStatus;
        return this;
    }

    /**
     * Get lastExecuteStatus
     *
     * @return lastExecuteStatus
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public SnapshotPlanExecuteStatus getLastExecuteStatus() {
        return lastExecuteStatus;
    }

    public void setLastExecuteStatus(SnapshotPlanExecuteStatus lastExecuteStatus) {
        this.lastExecuteStatus = lastExecuteStatus;
    }

    public SnapshotPlanWhereInput lastExecuteStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_STATUS);
        return this;
    }

    public SnapshotPlanWhereInput lastExecuteStatus_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTE_STATUS);
        return this;
    }

    public void setLastExecuteStatus_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_STATUS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTE_STATUS);
        }
    }

    public boolean getLastExecuteStatus_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LAST_EXECUTE_STATUS);
    }

    public SnapshotPlanWhereInput lastExecuteStatusIn(
            List<SnapshotPlanExecuteStatus> lastExecuteStatusIn) {

        this.lastExecuteStatusIn = lastExecuteStatusIn;
        return this;
    }

    public SnapshotPlanWhereInput addLastExecuteStatusInItem(
            SnapshotPlanExecuteStatus lastExecuteStatusInItem) {
        if (this.lastExecuteStatusIn == null) {
            this.lastExecuteStatusIn = new ArrayList<SnapshotPlanExecuteStatus>();
        }
        this.lastExecuteStatusIn.add(lastExecuteStatusInItem);
        return this;
    }

    /**
     * Get lastExecuteStatusIn
     *
     * @return lastExecuteStatusIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<SnapshotPlanExecuteStatus> getLastExecuteStatusIn() {
        return lastExecuteStatusIn;
    }

    public void setLastExecuteStatusIn(List<SnapshotPlanExecuteStatus> lastExecuteStatusIn) {
        this.lastExecuteStatusIn = lastExecuteStatusIn;
    }

    public SnapshotPlanWhereInput lastExecuteStatusIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_STATUS_IN);
        return this;
    }

    public SnapshotPlanWhereInput lastExecuteStatusIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTE_STATUS_IN);
        return this;
    }

    public void setLastExecuteStatusIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_STATUS_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTE_STATUS_IN);
        }
    }

    public boolean getLastExecuteStatusIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LAST_EXECUTE_STATUS_IN);
    }

    public SnapshotPlanWhereInput lastExecuteStatusNot(
            SnapshotPlanExecuteStatus lastExecuteStatusNot) {

        this.lastExecuteStatusNot = lastExecuteStatusNot;
        return this;
    }

    /**
     * Get lastExecuteStatusNot
     *
     * @return lastExecuteStatusNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public SnapshotPlanExecuteStatus getLastExecuteStatusNot() {
        return lastExecuteStatusNot;
    }

    public void setLastExecuteStatusNot(SnapshotPlanExecuteStatus lastExecuteStatusNot) {
        this.lastExecuteStatusNot = lastExecuteStatusNot;
    }

    public SnapshotPlanWhereInput lastExecuteStatusNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_STATUS_NOT);
        return this;
    }

    public SnapshotPlanWhereInput lastExecuteStatusNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTE_STATUS_NOT);
        return this;
    }

    public void setLastExecuteStatusNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_STATUS_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTE_STATUS_NOT);
        }
    }

    public boolean getLastExecuteStatusNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LAST_EXECUTE_STATUS_NOT);
    }

    public SnapshotPlanWhereInput lastExecuteStatusNotIn(
            List<SnapshotPlanExecuteStatus> lastExecuteStatusNotIn) {

        this.lastExecuteStatusNotIn = lastExecuteStatusNotIn;
        return this;
    }

    public SnapshotPlanWhereInput addLastExecuteStatusNotInItem(
            SnapshotPlanExecuteStatus lastExecuteStatusNotInItem) {
        if (this.lastExecuteStatusNotIn == null) {
            this.lastExecuteStatusNotIn = new ArrayList<SnapshotPlanExecuteStatus>();
        }
        this.lastExecuteStatusNotIn.add(lastExecuteStatusNotInItem);
        return this;
    }

    /**
     * Get lastExecuteStatusNotIn
     *
     * @return lastExecuteStatusNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<SnapshotPlanExecuteStatus> getLastExecuteStatusNotIn() {
        return lastExecuteStatusNotIn;
    }

    public void setLastExecuteStatusNotIn(List<SnapshotPlanExecuteStatus> lastExecuteStatusNotIn) {
        this.lastExecuteStatusNotIn = lastExecuteStatusNotIn;
    }

    public SnapshotPlanWhereInput lastExecuteStatusNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_STATUS_NOT_IN);
        return this;
    }

    public SnapshotPlanWhereInput lastExecuteStatusNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTE_STATUS_NOT_IN);
        return this;
    }

    public void setLastExecuteStatusNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_STATUS_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTE_STATUS_NOT_IN);
        }
    }

    public boolean getLastExecuteStatusNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LAST_EXECUTE_STATUS_NOT_IN);
    }

    public SnapshotPlanWhereInput lastExecuteTime(String lastExecuteTime) {

        this.lastExecuteTime = lastExecuteTime;
        return this;
    }

    /**
     * Get lastExecuteTime
     *
     * @return lastExecuteTime
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLastExecuteTime() {
        return lastExecuteTime;
    }

    public void setLastExecuteTime(String lastExecuteTime) {
        this.lastExecuteTime = lastExecuteTime;
    }

    public SnapshotPlanWhereInput lastExecuteTime_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_TIME);
        return this;
    }

    public SnapshotPlanWhereInput lastExecuteTime_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTE_TIME);
        return this;
    }

    public void setLastExecuteTime_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_TIME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTE_TIME);
        }
    }

    public boolean getLastExecuteTime_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LAST_EXECUTE_TIME);
    }

    public SnapshotPlanWhereInput lastExecuteTimeGt(String lastExecuteTimeGt) {

        this.lastExecuteTimeGt = lastExecuteTimeGt;
        return this;
    }

    /**
     * Get lastExecuteTimeGt
     *
     * @return lastExecuteTimeGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLastExecuteTimeGt() {
        return lastExecuteTimeGt;
    }

    public void setLastExecuteTimeGt(String lastExecuteTimeGt) {
        this.lastExecuteTimeGt = lastExecuteTimeGt;
    }

    public SnapshotPlanWhereInput lastExecuteTimeGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_TIME_GT);
        return this;
    }

    public SnapshotPlanWhereInput lastExecuteTimeGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTE_TIME_GT);
        return this;
    }

    public void setLastExecuteTimeGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_TIME_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTE_TIME_GT);
        }
    }

    public boolean getLastExecuteTimeGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LAST_EXECUTE_TIME_GT);
    }

    public SnapshotPlanWhereInput lastExecuteTimeGte(String lastExecuteTimeGte) {

        this.lastExecuteTimeGte = lastExecuteTimeGte;
        return this;
    }

    /**
     * Get lastExecuteTimeGte
     *
     * @return lastExecuteTimeGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLastExecuteTimeGte() {
        return lastExecuteTimeGte;
    }

    public void setLastExecuteTimeGte(String lastExecuteTimeGte) {
        this.lastExecuteTimeGte = lastExecuteTimeGte;
    }

    public SnapshotPlanWhereInput lastExecuteTimeGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_TIME_GTE);
        return this;
    }

    public SnapshotPlanWhereInput lastExecuteTimeGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTE_TIME_GTE);
        return this;
    }

    public void setLastExecuteTimeGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_TIME_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTE_TIME_GTE);
        }
    }

    public boolean getLastExecuteTimeGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LAST_EXECUTE_TIME_GTE);
    }

    public SnapshotPlanWhereInput lastExecuteTimeIn(List<String> lastExecuteTimeIn) {

        this.lastExecuteTimeIn = lastExecuteTimeIn;
        return this;
    }

    public SnapshotPlanWhereInput addLastExecuteTimeInItem(String lastExecuteTimeInItem) {
        if (this.lastExecuteTimeIn == null) {
            this.lastExecuteTimeIn = new ArrayList<String>();
        }
        this.lastExecuteTimeIn.add(lastExecuteTimeInItem);
        return this;
    }

    /**
     * Get lastExecuteTimeIn
     *
     * @return lastExecuteTimeIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getLastExecuteTimeIn() {
        return lastExecuteTimeIn;
    }

    public void setLastExecuteTimeIn(List<String> lastExecuteTimeIn) {
        this.lastExecuteTimeIn = lastExecuteTimeIn;
    }

    public SnapshotPlanWhereInput lastExecuteTimeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_TIME_IN);
        return this;
    }

    public SnapshotPlanWhereInput lastExecuteTimeIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTE_TIME_IN);
        return this;
    }

    public void setLastExecuteTimeIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_TIME_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTE_TIME_IN);
        }
    }

    public boolean getLastExecuteTimeIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LAST_EXECUTE_TIME_IN);
    }

    public SnapshotPlanWhereInput lastExecuteTimeLt(String lastExecuteTimeLt) {

        this.lastExecuteTimeLt = lastExecuteTimeLt;
        return this;
    }

    /**
     * Get lastExecuteTimeLt
     *
     * @return lastExecuteTimeLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLastExecuteTimeLt() {
        return lastExecuteTimeLt;
    }

    public void setLastExecuteTimeLt(String lastExecuteTimeLt) {
        this.lastExecuteTimeLt = lastExecuteTimeLt;
    }

    public SnapshotPlanWhereInput lastExecuteTimeLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_TIME_LT);
        return this;
    }

    public SnapshotPlanWhereInput lastExecuteTimeLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTE_TIME_LT);
        return this;
    }

    public void setLastExecuteTimeLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_TIME_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTE_TIME_LT);
        }
    }

    public boolean getLastExecuteTimeLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LAST_EXECUTE_TIME_LT);
    }

    public SnapshotPlanWhereInput lastExecuteTimeLte(String lastExecuteTimeLte) {

        this.lastExecuteTimeLte = lastExecuteTimeLte;
        return this;
    }

    /**
     * Get lastExecuteTimeLte
     *
     * @return lastExecuteTimeLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLastExecuteTimeLte() {
        return lastExecuteTimeLte;
    }

    public void setLastExecuteTimeLte(String lastExecuteTimeLte) {
        this.lastExecuteTimeLte = lastExecuteTimeLte;
    }

    public SnapshotPlanWhereInput lastExecuteTimeLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_TIME_LTE);
        return this;
    }

    public SnapshotPlanWhereInput lastExecuteTimeLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTE_TIME_LTE);
        return this;
    }

    public void setLastExecuteTimeLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_TIME_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTE_TIME_LTE);
        }
    }

    public boolean getLastExecuteTimeLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LAST_EXECUTE_TIME_LTE);
    }

    public SnapshotPlanWhereInput lastExecuteTimeNot(String lastExecuteTimeNot) {

        this.lastExecuteTimeNot = lastExecuteTimeNot;
        return this;
    }

    /**
     * Get lastExecuteTimeNot
     *
     * @return lastExecuteTimeNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLastExecuteTimeNot() {
        return lastExecuteTimeNot;
    }

    public void setLastExecuteTimeNot(String lastExecuteTimeNot) {
        this.lastExecuteTimeNot = lastExecuteTimeNot;
    }

    public SnapshotPlanWhereInput lastExecuteTimeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_TIME_NOT);
        return this;
    }

    public SnapshotPlanWhereInput lastExecuteTimeNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTE_TIME_NOT);
        return this;
    }

    public void setLastExecuteTimeNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_TIME_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTE_TIME_NOT);
        }
    }

    public boolean getLastExecuteTimeNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LAST_EXECUTE_TIME_NOT);
    }

    public SnapshotPlanWhereInput lastExecuteTimeNotIn(List<String> lastExecuteTimeNotIn) {

        this.lastExecuteTimeNotIn = lastExecuteTimeNotIn;
        return this;
    }

    public SnapshotPlanWhereInput addLastExecuteTimeNotInItem(String lastExecuteTimeNotInItem) {
        if (this.lastExecuteTimeNotIn == null) {
            this.lastExecuteTimeNotIn = new ArrayList<String>();
        }
        this.lastExecuteTimeNotIn.add(lastExecuteTimeNotInItem);
        return this;
    }

    /**
     * Get lastExecuteTimeNotIn
     *
     * @return lastExecuteTimeNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getLastExecuteTimeNotIn() {
        return lastExecuteTimeNotIn;
    }

    public void setLastExecuteTimeNotIn(List<String> lastExecuteTimeNotIn) {
        this.lastExecuteTimeNotIn = lastExecuteTimeNotIn;
    }

    public SnapshotPlanWhereInput lastExecuteTimeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_TIME_NOT_IN);
        return this;
    }

    public SnapshotPlanWhereInput lastExecuteTimeNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTE_TIME_NOT_IN);
        return this;
    }

    public void setLastExecuteTimeNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LAST_EXECUTE_TIME_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LAST_EXECUTE_TIME_NOT_IN);
        }
    }

    public boolean getLastExecuteTimeNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LAST_EXECUTE_TIME_NOT_IN);
    }

    public SnapshotPlanWhereInput localId(String localId) {

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

    public SnapshotPlanWhereInput localId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID);
        return this;
    }

    public SnapshotPlanWhereInput localId_ExplictlyNonNull() {
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

    public SnapshotPlanWhereInput localIdContains(String localIdContains) {

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

    public SnapshotPlanWhereInput localIdContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_CONTAINS);
        return this;
    }

    public SnapshotPlanWhereInput localIdContains_ExplictlyNonNull() {
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

    public SnapshotPlanWhereInput localIdEndsWith(String localIdEndsWith) {

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

    public SnapshotPlanWhereInput localIdEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_ENDS_WITH);
        return this;
    }

    public SnapshotPlanWhereInput localIdEndsWith_ExplictlyNonNull() {
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

    public SnapshotPlanWhereInput localIdGt(String localIdGt) {

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

    public SnapshotPlanWhereInput localIdGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_GT);
        return this;
    }

    public SnapshotPlanWhereInput localIdGt_ExplictlyNonNull() {
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

    public SnapshotPlanWhereInput localIdGte(String localIdGte) {

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

    public SnapshotPlanWhereInput localIdGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_GTE);
        return this;
    }

    public SnapshotPlanWhereInput localIdGte_ExplictlyNonNull() {
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

    public SnapshotPlanWhereInput localIdIn(List<String> localIdIn) {

        this.localIdIn = localIdIn;
        return this;
    }

    public SnapshotPlanWhereInput addLocalIdInItem(String localIdInItem) {
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

    public SnapshotPlanWhereInput localIdIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_IN);
        return this;
    }

    public SnapshotPlanWhereInput localIdIn_ExplictlyNonNull() {
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

    public SnapshotPlanWhereInput localIdLt(String localIdLt) {

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

    public SnapshotPlanWhereInput localIdLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_LT);
        return this;
    }

    public SnapshotPlanWhereInput localIdLt_ExplictlyNonNull() {
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

    public SnapshotPlanWhereInput localIdLte(String localIdLte) {

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

    public SnapshotPlanWhereInput localIdLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_LTE);
        return this;
    }

    public SnapshotPlanWhereInput localIdLte_ExplictlyNonNull() {
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

    public SnapshotPlanWhereInput localIdNot(String localIdNot) {

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

    public SnapshotPlanWhereInput localIdNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT);
        return this;
    }

    public SnapshotPlanWhereInput localIdNot_ExplictlyNonNull() {
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

    public SnapshotPlanWhereInput localIdNotContains(String localIdNotContains) {

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

    public SnapshotPlanWhereInput localIdNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_CONTAINS);
        return this;
    }

    public SnapshotPlanWhereInput localIdNotContains_ExplictlyNonNull() {
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

    public SnapshotPlanWhereInput localIdNotEndsWith(String localIdNotEndsWith) {

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

    public SnapshotPlanWhereInput localIdNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_ENDS_WITH);
        return this;
    }

    public SnapshotPlanWhereInput localIdNotEndsWith_ExplictlyNonNull() {
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

    public SnapshotPlanWhereInput localIdNotIn(List<String> localIdNotIn) {

        this.localIdNotIn = localIdNotIn;
        return this;
    }

    public SnapshotPlanWhereInput addLocalIdNotInItem(String localIdNotInItem) {
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

    public SnapshotPlanWhereInput localIdNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_IN);
        return this;
    }

    public SnapshotPlanWhereInput localIdNotIn_ExplictlyNonNull() {
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

    public SnapshotPlanWhereInput localIdNotStartsWith(String localIdNotStartsWith) {

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

    public SnapshotPlanWhereInput localIdNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_STARTS_WITH);
        return this;
    }

    public SnapshotPlanWhereInput localIdNotStartsWith_ExplictlyNonNull() {
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

    public SnapshotPlanWhereInput localIdStartsWith(String localIdStartsWith) {

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

    public SnapshotPlanWhereInput localIdStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_STARTS_WITH);
        return this;
    }

    public SnapshotPlanWhereInput localIdStartsWith_ExplictlyNonNull() {
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

    public SnapshotPlanWhereInput logicalSizeBytes(Long logicalSizeBytes) {

        this.logicalSizeBytes = logicalSizeBytes;
        return this;
    }

    /**
     * Get logicalSizeBytes
     *
     * @return logicalSizeBytes
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getLogicalSizeBytes() {
        return logicalSizeBytes;
    }

    public void setLogicalSizeBytes(Long logicalSizeBytes) {
        this.logicalSizeBytes = logicalSizeBytes;
    }

    public SnapshotPlanWhereInput logicalSizeBytes_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOGICAL_SIZE_BYTES);
        return this;
    }

    public SnapshotPlanWhereInput logicalSizeBytes_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOGICAL_SIZE_BYTES);
        return this;
    }

    public void setLogicalSizeBytes_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOGICAL_SIZE_BYTES);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOGICAL_SIZE_BYTES);
        }
    }

    public boolean getLogicalSizeBytes_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOGICAL_SIZE_BYTES);
    }

    public SnapshotPlanWhereInput logicalSizeBytesGt(Long logicalSizeBytesGt) {

        this.logicalSizeBytesGt = logicalSizeBytesGt;
        return this;
    }

    /**
     * Get logicalSizeBytesGt
     *
     * @return logicalSizeBytesGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getLogicalSizeBytesGt() {
        return logicalSizeBytesGt;
    }

    public void setLogicalSizeBytesGt(Long logicalSizeBytesGt) {
        this.logicalSizeBytesGt = logicalSizeBytesGt;
    }

    public SnapshotPlanWhereInput logicalSizeBytesGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOGICAL_SIZE_BYTES_GT);
        return this;
    }

    public SnapshotPlanWhereInput logicalSizeBytesGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOGICAL_SIZE_BYTES_GT);
        return this;
    }

    public void setLogicalSizeBytesGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOGICAL_SIZE_BYTES_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOGICAL_SIZE_BYTES_GT);
        }
    }

    public boolean getLogicalSizeBytesGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOGICAL_SIZE_BYTES_GT);
    }

    public SnapshotPlanWhereInput logicalSizeBytesGte(Long logicalSizeBytesGte) {

        this.logicalSizeBytesGte = logicalSizeBytesGte;
        return this;
    }

    /**
     * Get logicalSizeBytesGte
     *
     * @return logicalSizeBytesGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getLogicalSizeBytesGte() {
        return logicalSizeBytesGte;
    }

    public void setLogicalSizeBytesGte(Long logicalSizeBytesGte) {
        this.logicalSizeBytesGte = logicalSizeBytesGte;
    }

    public SnapshotPlanWhereInput logicalSizeBytesGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOGICAL_SIZE_BYTES_GTE);
        return this;
    }

    public SnapshotPlanWhereInput logicalSizeBytesGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOGICAL_SIZE_BYTES_GTE);
        return this;
    }

    public void setLogicalSizeBytesGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOGICAL_SIZE_BYTES_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOGICAL_SIZE_BYTES_GTE);
        }
    }

    public boolean getLogicalSizeBytesGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOGICAL_SIZE_BYTES_GTE);
    }

    public SnapshotPlanWhereInput logicalSizeBytesIn(List<Long> logicalSizeBytesIn) {

        this.logicalSizeBytesIn = logicalSizeBytesIn;
        return this;
    }

    public SnapshotPlanWhereInput addLogicalSizeBytesInItem(Long logicalSizeBytesInItem) {
        if (this.logicalSizeBytesIn == null) {
            this.logicalSizeBytesIn = new ArrayList<Long>();
        }
        this.logicalSizeBytesIn.add(logicalSizeBytesInItem);
        return this;
    }

    /**
     * Get logicalSizeBytesIn
     *
     * @return logicalSizeBytesIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getLogicalSizeBytesIn() {
        return logicalSizeBytesIn;
    }

    public void setLogicalSizeBytesIn(List<Long> logicalSizeBytesIn) {
        this.logicalSizeBytesIn = logicalSizeBytesIn;
    }

    public SnapshotPlanWhereInput logicalSizeBytesIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOGICAL_SIZE_BYTES_IN);
        return this;
    }

    public SnapshotPlanWhereInput logicalSizeBytesIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOGICAL_SIZE_BYTES_IN);
        return this;
    }

    public void setLogicalSizeBytesIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOGICAL_SIZE_BYTES_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOGICAL_SIZE_BYTES_IN);
        }
    }

    public boolean getLogicalSizeBytesIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOGICAL_SIZE_BYTES_IN);
    }

    public SnapshotPlanWhereInput logicalSizeBytesLt(Long logicalSizeBytesLt) {

        this.logicalSizeBytesLt = logicalSizeBytesLt;
        return this;
    }

    /**
     * Get logicalSizeBytesLt
     *
     * @return logicalSizeBytesLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getLogicalSizeBytesLt() {
        return logicalSizeBytesLt;
    }

    public void setLogicalSizeBytesLt(Long logicalSizeBytesLt) {
        this.logicalSizeBytesLt = logicalSizeBytesLt;
    }

    public SnapshotPlanWhereInput logicalSizeBytesLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOGICAL_SIZE_BYTES_LT);
        return this;
    }

    public SnapshotPlanWhereInput logicalSizeBytesLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOGICAL_SIZE_BYTES_LT);
        return this;
    }

    public void setLogicalSizeBytesLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOGICAL_SIZE_BYTES_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOGICAL_SIZE_BYTES_LT);
        }
    }

    public boolean getLogicalSizeBytesLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOGICAL_SIZE_BYTES_LT);
    }

    public SnapshotPlanWhereInput logicalSizeBytesLte(Long logicalSizeBytesLte) {

        this.logicalSizeBytesLte = logicalSizeBytesLte;
        return this;
    }

    /**
     * Get logicalSizeBytesLte
     *
     * @return logicalSizeBytesLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getLogicalSizeBytesLte() {
        return logicalSizeBytesLte;
    }

    public void setLogicalSizeBytesLte(Long logicalSizeBytesLte) {
        this.logicalSizeBytesLte = logicalSizeBytesLte;
    }

    public SnapshotPlanWhereInput logicalSizeBytesLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOGICAL_SIZE_BYTES_LTE);
        return this;
    }

    public SnapshotPlanWhereInput logicalSizeBytesLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOGICAL_SIZE_BYTES_LTE);
        return this;
    }

    public void setLogicalSizeBytesLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOGICAL_SIZE_BYTES_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOGICAL_SIZE_BYTES_LTE);
        }
    }

    public boolean getLogicalSizeBytesLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOGICAL_SIZE_BYTES_LTE);
    }

    public SnapshotPlanWhereInput logicalSizeBytesNot(Long logicalSizeBytesNot) {

        this.logicalSizeBytesNot = logicalSizeBytesNot;
        return this;
    }

    /**
     * Get logicalSizeBytesNot
     *
     * @return logicalSizeBytesNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getLogicalSizeBytesNot() {
        return logicalSizeBytesNot;
    }

    public void setLogicalSizeBytesNot(Long logicalSizeBytesNot) {
        this.logicalSizeBytesNot = logicalSizeBytesNot;
    }

    public SnapshotPlanWhereInput logicalSizeBytesNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOGICAL_SIZE_BYTES_NOT);
        return this;
    }

    public SnapshotPlanWhereInput logicalSizeBytesNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOGICAL_SIZE_BYTES_NOT);
        return this;
    }

    public void setLogicalSizeBytesNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOGICAL_SIZE_BYTES_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOGICAL_SIZE_BYTES_NOT);
        }
    }

    public boolean getLogicalSizeBytesNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOGICAL_SIZE_BYTES_NOT);
    }

    public SnapshotPlanWhereInput logicalSizeBytesNotIn(List<Long> logicalSizeBytesNotIn) {

        this.logicalSizeBytesNotIn = logicalSizeBytesNotIn;
        return this;
    }

    public SnapshotPlanWhereInput addLogicalSizeBytesNotInItem(Long logicalSizeBytesNotInItem) {
        if (this.logicalSizeBytesNotIn == null) {
            this.logicalSizeBytesNotIn = new ArrayList<Long>();
        }
        this.logicalSizeBytesNotIn.add(logicalSizeBytesNotInItem);
        return this;
    }

    /**
     * Get logicalSizeBytesNotIn
     *
     * @return logicalSizeBytesNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getLogicalSizeBytesNotIn() {
        return logicalSizeBytesNotIn;
    }

    public void setLogicalSizeBytesNotIn(List<Long> logicalSizeBytesNotIn) {
        this.logicalSizeBytesNotIn = logicalSizeBytesNotIn;
    }

    public SnapshotPlanWhereInput logicalSizeBytesNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOGICAL_SIZE_BYTES_NOT_IN);
        return this;
    }

    public SnapshotPlanWhereInput logicalSizeBytesNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOGICAL_SIZE_BYTES_NOT_IN);
        return this;
    }

    public void setLogicalSizeBytesNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOGICAL_SIZE_BYTES_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOGICAL_SIZE_BYTES_NOT_IN);
        }
    }

    public boolean getLogicalSizeBytesNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOGICAL_SIZE_BYTES_NOT_IN);
    }

    public SnapshotPlanWhereInput manualDeleteNum(Integer manualDeleteNum) {

        this.manualDeleteNum = manualDeleteNum;
        return this;
    }

    /**
     * Get manualDeleteNum
     *
     * @return manualDeleteNum
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getManualDeleteNum() {
        return manualDeleteNum;
    }

    public void setManualDeleteNum(Integer manualDeleteNum) {
        this.manualDeleteNum = manualDeleteNum;
    }

    public SnapshotPlanWhereInput manualDeleteNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MANUAL_DELETE_NUM);
        return this;
    }

    public SnapshotPlanWhereInput manualDeleteNum_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MANUAL_DELETE_NUM);
        return this;
    }

    public void setManualDeleteNum_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MANUAL_DELETE_NUM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MANUAL_DELETE_NUM);
        }
    }

    public boolean getManualDeleteNum_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MANUAL_DELETE_NUM);
    }

    public SnapshotPlanWhereInput manualDeleteNumGt(Integer manualDeleteNumGt) {

        this.manualDeleteNumGt = manualDeleteNumGt;
        return this;
    }

    /**
     * Get manualDeleteNumGt
     *
     * @return manualDeleteNumGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getManualDeleteNumGt() {
        return manualDeleteNumGt;
    }

    public void setManualDeleteNumGt(Integer manualDeleteNumGt) {
        this.manualDeleteNumGt = manualDeleteNumGt;
    }

    public SnapshotPlanWhereInput manualDeleteNumGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MANUAL_DELETE_NUM_GT);
        return this;
    }

    public SnapshotPlanWhereInput manualDeleteNumGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MANUAL_DELETE_NUM_GT);
        return this;
    }

    public void setManualDeleteNumGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MANUAL_DELETE_NUM_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MANUAL_DELETE_NUM_GT);
        }
    }

    public boolean getManualDeleteNumGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MANUAL_DELETE_NUM_GT);
    }

    public SnapshotPlanWhereInput manualDeleteNumGte(Integer manualDeleteNumGte) {

        this.manualDeleteNumGte = manualDeleteNumGte;
        return this;
    }

    /**
     * Get manualDeleteNumGte
     *
     * @return manualDeleteNumGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getManualDeleteNumGte() {
        return manualDeleteNumGte;
    }

    public void setManualDeleteNumGte(Integer manualDeleteNumGte) {
        this.manualDeleteNumGte = manualDeleteNumGte;
    }

    public SnapshotPlanWhereInput manualDeleteNumGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MANUAL_DELETE_NUM_GTE);
        return this;
    }

    public SnapshotPlanWhereInput manualDeleteNumGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MANUAL_DELETE_NUM_GTE);
        return this;
    }

    public void setManualDeleteNumGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MANUAL_DELETE_NUM_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MANUAL_DELETE_NUM_GTE);
        }
    }

    public boolean getManualDeleteNumGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MANUAL_DELETE_NUM_GTE);
    }

    public SnapshotPlanWhereInput manualDeleteNumIn(List<Integer> manualDeleteNumIn) {

        this.manualDeleteNumIn = manualDeleteNumIn;
        return this;
    }

    public SnapshotPlanWhereInput addManualDeleteNumInItem(Integer manualDeleteNumInItem) {
        if (this.manualDeleteNumIn == null) {
            this.manualDeleteNumIn = new ArrayList<Integer>();
        }
        this.manualDeleteNumIn.add(manualDeleteNumInItem);
        return this;
    }

    /**
     * Get manualDeleteNumIn
     *
     * @return manualDeleteNumIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getManualDeleteNumIn() {
        return manualDeleteNumIn;
    }

    public void setManualDeleteNumIn(List<Integer> manualDeleteNumIn) {
        this.manualDeleteNumIn = manualDeleteNumIn;
    }

    public SnapshotPlanWhereInput manualDeleteNumIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MANUAL_DELETE_NUM_IN);
        return this;
    }

    public SnapshotPlanWhereInput manualDeleteNumIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MANUAL_DELETE_NUM_IN);
        return this;
    }

    public void setManualDeleteNumIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MANUAL_DELETE_NUM_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MANUAL_DELETE_NUM_IN);
        }
    }

    public boolean getManualDeleteNumIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MANUAL_DELETE_NUM_IN);
    }

    public SnapshotPlanWhereInput manualDeleteNumLt(Integer manualDeleteNumLt) {

        this.manualDeleteNumLt = manualDeleteNumLt;
        return this;
    }

    /**
     * Get manualDeleteNumLt
     *
     * @return manualDeleteNumLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getManualDeleteNumLt() {
        return manualDeleteNumLt;
    }

    public void setManualDeleteNumLt(Integer manualDeleteNumLt) {
        this.manualDeleteNumLt = manualDeleteNumLt;
    }

    public SnapshotPlanWhereInput manualDeleteNumLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MANUAL_DELETE_NUM_LT);
        return this;
    }

    public SnapshotPlanWhereInput manualDeleteNumLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MANUAL_DELETE_NUM_LT);
        return this;
    }

    public void setManualDeleteNumLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MANUAL_DELETE_NUM_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MANUAL_DELETE_NUM_LT);
        }
    }

    public boolean getManualDeleteNumLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MANUAL_DELETE_NUM_LT);
    }

    public SnapshotPlanWhereInput manualDeleteNumLte(Integer manualDeleteNumLte) {

        this.manualDeleteNumLte = manualDeleteNumLte;
        return this;
    }

    /**
     * Get manualDeleteNumLte
     *
     * @return manualDeleteNumLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getManualDeleteNumLte() {
        return manualDeleteNumLte;
    }

    public void setManualDeleteNumLte(Integer manualDeleteNumLte) {
        this.manualDeleteNumLte = manualDeleteNumLte;
    }

    public SnapshotPlanWhereInput manualDeleteNumLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MANUAL_DELETE_NUM_LTE);
        return this;
    }

    public SnapshotPlanWhereInput manualDeleteNumLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MANUAL_DELETE_NUM_LTE);
        return this;
    }

    public void setManualDeleteNumLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MANUAL_DELETE_NUM_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MANUAL_DELETE_NUM_LTE);
        }
    }

    public boolean getManualDeleteNumLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MANUAL_DELETE_NUM_LTE);
    }

    public SnapshotPlanWhereInput manualDeleteNumNot(Integer manualDeleteNumNot) {

        this.manualDeleteNumNot = manualDeleteNumNot;
        return this;
    }

    /**
     * Get manualDeleteNumNot
     *
     * @return manualDeleteNumNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getManualDeleteNumNot() {
        return manualDeleteNumNot;
    }

    public void setManualDeleteNumNot(Integer manualDeleteNumNot) {
        this.manualDeleteNumNot = manualDeleteNumNot;
    }

    public SnapshotPlanWhereInput manualDeleteNumNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MANUAL_DELETE_NUM_NOT);
        return this;
    }

    public SnapshotPlanWhereInput manualDeleteNumNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MANUAL_DELETE_NUM_NOT);
        return this;
    }

    public void setManualDeleteNumNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MANUAL_DELETE_NUM_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MANUAL_DELETE_NUM_NOT);
        }
    }

    public boolean getManualDeleteNumNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MANUAL_DELETE_NUM_NOT);
    }

    public SnapshotPlanWhereInput manualDeleteNumNotIn(List<Integer> manualDeleteNumNotIn) {

        this.manualDeleteNumNotIn = manualDeleteNumNotIn;
        return this;
    }

    public SnapshotPlanWhereInput addManualDeleteNumNotInItem(Integer manualDeleteNumNotInItem) {
        if (this.manualDeleteNumNotIn == null) {
            this.manualDeleteNumNotIn = new ArrayList<Integer>();
        }
        this.manualDeleteNumNotIn.add(manualDeleteNumNotInItem);
        return this;
    }

    /**
     * Get manualDeleteNumNotIn
     *
     * @return manualDeleteNumNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getManualDeleteNumNotIn() {
        return manualDeleteNumNotIn;
    }

    public void setManualDeleteNumNotIn(List<Integer> manualDeleteNumNotIn) {
        this.manualDeleteNumNotIn = manualDeleteNumNotIn;
    }

    public SnapshotPlanWhereInput manualDeleteNumNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MANUAL_DELETE_NUM_NOT_IN);
        return this;
    }

    public SnapshotPlanWhereInput manualDeleteNumNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MANUAL_DELETE_NUM_NOT_IN);
        return this;
    }

    public void setManualDeleteNumNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MANUAL_DELETE_NUM_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MANUAL_DELETE_NUM_NOT_IN);
        }
    }

    public boolean getManualDeleteNumNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MANUAL_DELETE_NUM_NOT_IN);
    }

    public SnapshotPlanWhereInput manualExecuteNum(Integer manualExecuteNum) {

        this.manualExecuteNum = manualExecuteNum;
        return this;
    }

    /**
     * Get manualExecuteNum
     *
     * @return manualExecuteNum
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getManualExecuteNum() {
        return manualExecuteNum;
    }

    public void setManualExecuteNum(Integer manualExecuteNum) {
        this.manualExecuteNum = manualExecuteNum;
    }

    public SnapshotPlanWhereInput manualExecuteNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MANUAL_EXECUTE_NUM);
        return this;
    }

    public SnapshotPlanWhereInput manualExecuteNum_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MANUAL_EXECUTE_NUM);
        return this;
    }

    public void setManualExecuteNum_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MANUAL_EXECUTE_NUM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MANUAL_EXECUTE_NUM);
        }
    }

    public boolean getManualExecuteNum_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MANUAL_EXECUTE_NUM);
    }

    public SnapshotPlanWhereInput manualExecuteNumGt(Integer manualExecuteNumGt) {

        this.manualExecuteNumGt = manualExecuteNumGt;
        return this;
    }

    /**
     * Get manualExecuteNumGt
     *
     * @return manualExecuteNumGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getManualExecuteNumGt() {
        return manualExecuteNumGt;
    }

    public void setManualExecuteNumGt(Integer manualExecuteNumGt) {
        this.manualExecuteNumGt = manualExecuteNumGt;
    }

    public SnapshotPlanWhereInput manualExecuteNumGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MANUAL_EXECUTE_NUM_GT);
        return this;
    }

    public SnapshotPlanWhereInput manualExecuteNumGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MANUAL_EXECUTE_NUM_GT);
        return this;
    }

    public void setManualExecuteNumGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MANUAL_EXECUTE_NUM_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MANUAL_EXECUTE_NUM_GT);
        }
    }

    public boolean getManualExecuteNumGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MANUAL_EXECUTE_NUM_GT);
    }

    public SnapshotPlanWhereInput manualExecuteNumGte(Integer manualExecuteNumGte) {

        this.manualExecuteNumGte = manualExecuteNumGte;
        return this;
    }

    /**
     * Get manualExecuteNumGte
     *
     * @return manualExecuteNumGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getManualExecuteNumGte() {
        return manualExecuteNumGte;
    }

    public void setManualExecuteNumGte(Integer manualExecuteNumGte) {
        this.manualExecuteNumGte = manualExecuteNumGte;
    }

    public SnapshotPlanWhereInput manualExecuteNumGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MANUAL_EXECUTE_NUM_GTE);
        return this;
    }

    public SnapshotPlanWhereInput manualExecuteNumGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MANUAL_EXECUTE_NUM_GTE);
        return this;
    }

    public void setManualExecuteNumGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MANUAL_EXECUTE_NUM_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MANUAL_EXECUTE_NUM_GTE);
        }
    }

    public boolean getManualExecuteNumGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MANUAL_EXECUTE_NUM_GTE);
    }

    public SnapshotPlanWhereInput manualExecuteNumIn(List<Integer> manualExecuteNumIn) {

        this.manualExecuteNumIn = manualExecuteNumIn;
        return this;
    }

    public SnapshotPlanWhereInput addManualExecuteNumInItem(Integer manualExecuteNumInItem) {
        if (this.manualExecuteNumIn == null) {
            this.manualExecuteNumIn = new ArrayList<Integer>();
        }
        this.manualExecuteNumIn.add(manualExecuteNumInItem);
        return this;
    }

    /**
     * Get manualExecuteNumIn
     *
     * @return manualExecuteNumIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getManualExecuteNumIn() {
        return manualExecuteNumIn;
    }

    public void setManualExecuteNumIn(List<Integer> manualExecuteNumIn) {
        this.manualExecuteNumIn = manualExecuteNumIn;
    }

    public SnapshotPlanWhereInput manualExecuteNumIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MANUAL_EXECUTE_NUM_IN);
        return this;
    }

    public SnapshotPlanWhereInput manualExecuteNumIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MANUAL_EXECUTE_NUM_IN);
        return this;
    }

    public void setManualExecuteNumIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MANUAL_EXECUTE_NUM_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MANUAL_EXECUTE_NUM_IN);
        }
    }

    public boolean getManualExecuteNumIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MANUAL_EXECUTE_NUM_IN);
    }

    public SnapshotPlanWhereInput manualExecuteNumLt(Integer manualExecuteNumLt) {

        this.manualExecuteNumLt = manualExecuteNumLt;
        return this;
    }

    /**
     * Get manualExecuteNumLt
     *
     * @return manualExecuteNumLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getManualExecuteNumLt() {
        return manualExecuteNumLt;
    }

    public void setManualExecuteNumLt(Integer manualExecuteNumLt) {
        this.manualExecuteNumLt = manualExecuteNumLt;
    }

    public SnapshotPlanWhereInput manualExecuteNumLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MANUAL_EXECUTE_NUM_LT);
        return this;
    }

    public SnapshotPlanWhereInput manualExecuteNumLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MANUAL_EXECUTE_NUM_LT);
        return this;
    }

    public void setManualExecuteNumLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MANUAL_EXECUTE_NUM_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MANUAL_EXECUTE_NUM_LT);
        }
    }

    public boolean getManualExecuteNumLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MANUAL_EXECUTE_NUM_LT);
    }

    public SnapshotPlanWhereInput manualExecuteNumLte(Integer manualExecuteNumLte) {

        this.manualExecuteNumLte = manualExecuteNumLte;
        return this;
    }

    /**
     * Get manualExecuteNumLte
     *
     * @return manualExecuteNumLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getManualExecuteNumLte() {
        return manualExecuteNumLte;
    }

    public void setManualExecuteNumLte(Integer manualExecuteNumLte) {
        this.manualExecuteNumLte = manualExecuteNumLte;
    }

    public SnapshotPlanWhereInput manualExecuteNumLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MANUAL_EXECUTE_NUM_LTE);
        return this;
    }

    public SnapshotPlanWhereInput manualExecuteNumLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MANUAL_EXECUTE_NUM_LTE);
        return this;
    }

    public void setManualExecuteNumLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MANUAL_EXECUTE_NUM_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MANUAL_EXECUTE_NUM_LTE);
        }
    }

    public boolean getManualExecuteNumLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MANUAL_EXECUTE_NUM_LTE);
    }

    public SnapshotPlanWhereInput manualExecuteNumNot(Integer manualExecuteNumNot) {

        this.manualExecuteNumNot = manualExecuteNumNot;
        return this;
    }

    /**
     * Get manualExecuteNumNot
     *
     * @return manualExecuteNumNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getManualExecuteNumNot() {
        return manualExecuteNumNot;
    }

    public void setManualExecuteNumNot(Integer manualExecuteNumNot) {
        this.manualExecuteNumNot = manualExecuteNumNot;
    }

    public SnapshotPlanWhereInput manualExecuteNumNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MANUAL_EXECUTE_NUM_NOT);
        return this;
    }

    public SnapshotPlanWhereInput manualExecuteNumNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MANUAL_EXECUTE_NUM_NOT);
        return this;
    }

    public void setManualExecuteNumNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MANUAL_EXECUTE_NUM_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MANUAL_EXECUTE_NUM_NOT);
        }
    }

    public boolean getManualExecuteNumNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MANUAL_EXECUTE_NUM_NOT);
    }

    public SnapshotPlanWhereInput manualExecuteNumNotIn(List<Integer> manualExecuteNumNotIn) {

        this.manualExecuteNumNotIn = manualExecuteNumNotIn;
        return this;
    }

    public SnapshotPlanWhereInput addManualExecuteNumNotInItem(Integer manualExecuteNumNotInItem) {
        if (this.manualExecuteNumNotIn == null) {
            this.manualExecuteNumNotIn = new ArrayList<Integer>();
        }
        this.manualExecuteNumNotIn.add(manualExecuteNumNotInItem);
        return this;
    }

    /**
     * Get manualExecuteNumNotIn
     *
     * @return manualExecuteNumNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getManualExecuteNumNotIn() {
        return manualExecuteNumNotIn;
    }

    public void setManualExecuteNumNotIn(List<Integer> manualExecuteNumNotIn) {
        this.manualExecuteNumNotIn = manualExecuteNumNotIn;
    }

    public SnapshotPlanWhereInput manualExecuteNumNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MANUAL_EXECUTE_NUM_NOT_IN);
        return this;
    }

    public SnapshotPlanWhereInput manualExecuteNumNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MANUAL_EXECUTE_NUM_NOT_IN);
        return this;
    }

    public void setManualExecuteNumNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MANUAL_EXECUTE_NUM_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MANUAL_EXECUTE_NUM_NOT_IN);
        }
    }

    public boolean getManualExecuteNumNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MANUAL_EXECUTE_NUM_NOT_IN);
    }

    public SnapshotPlanWhereInput mirror(Boolean mirror) {

        this.mirror = mirror;
        return this;
    }

    /**
     * Get mirror
     *
     * @return mirror
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getMirror() {
        return mirror;
    }

    public void setMirror(Boolean mirror) {
        this.mirror = mirror;
    }

    public SnapshotPlanWhereInput mirror_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MIRROR);
        return this;
    }

    public SnapshotPlanWhereInput mirror_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MIRROR);
        return this;
    }

    public void setMirror_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MIRROR);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MIRROR);
        }
    }

    public boolean getMirror_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MIRROR);
    }

    public SnapshotPlanWhereInput mirrorNot(Boolean mirrorNot) {

        this.mirrorNot = mirrorNot;
        return this;
    }

    /**
     * Get mirrorNot
     *
     * @return mirrorNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getMirrorNot() {
        return mirrorNot;
    }

    public void setMirrorNot(Boolean mirrorNot) {
        this.mirrorNot = mirrorNot;
    }

    public SnapshotPlanWhereInput mirrorNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MIRROR_NOT);
        return this;
    }

    public SnapshotPlanWhereInput mirrorNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MIRROR_NOT);
        return this;
    }

    public void setMirrorNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MIRROR_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MIRROR_NOT);
        }
    }

    public boolean getMirrorNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MIRROR_NOT);
    }

    public SnapshotPlanWhereInput name(String name) {

        this.name = name;
        return this;
    }

    /**
     * Get name
     *
     * @return name
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SnapshotPlanWhereInput name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public SnapshotPlanWhereInput name_ExplictlyNonNull() {
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

    public SnapshotPlanWhereInput nameContains(String nameContains) {

        this.nameContains = nameContains;
        return this;
    }

    /**
     * Get nameContains
     *
     * @return nameContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNameContains() {
        return nameContains;
    }

    public void setNameContains(String nameContains) {
        this.nameContains = nameContains;
    }

    public SnapshotPlanWhereInput nameContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_CONTAINS);
        return this;
    }

    public SnapshotPlanWhereInput nameContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_CONTAINS);
        return this;
    }

    public void setNameContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_CONTAINS);
        }
    }

    public boolean getNameContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_CONTAINS);
    }

    public SnapshotPlanWhereInput nameEndsWith(String nameEndsWith) {

        this.nameEndsWith = nameEndsWith;
        return this;
    }

    /**
     * Get nameEndsWith
     *
     * @return nameEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNameEndsWith() {
        return nameEndsWith;
    }

    public void setNameEndsWith(String nameEndsWith) {
        this.nameEndsWith = nameEndsWith;
    }

    public SnapshotPlanWhereInput nameEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_ENDS_WITH);
        return this;
    }

    public SnapshotPlanWhereInput nameEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_ENDS_WITH);
        return this;
    }

    public void setNameEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_ENDS_WITH);
        }
    }

    public boolean getNameEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_ENDS_WITH);
    }

    public SnapshotPlanWhereInput nameGt(String nameGt) {

        this.nameGt = nameGt;
        return this;
    }

    /**
     * Get nameGt
     *
     * @return nameGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNameGt() {
        return nameGt;
    }

    public void setNameGt(String nameGt) {
        this.nameGt = nameGt;
    }

    public SnapshotPlanWhereInput nameGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_GT);
        return this;
    }

    public SnapshotPlanWhereInput nameGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_GT);
        return this;
    }

    public void setNameGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_GT);
        }
    }

    public boolean getNameGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_GT);
    }

    public SnapshotPlanWhereInput nameGte(String nameGte) {

        this.nameGte = nameGte;
        return this;
    }

    /**
     * Get nameGte
     *
     * @return nameGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNameGte() {
        return nameGte;
    }

    public void setNameGte(String nameGte) {
        this.nameGte = nameGte;
    }

    public SnapshotPlanWhereInput nameGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_GTE);
        return this;
    }

    public SnapshotPlanWhereInput nameGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_GTE);
        return this;
    }

    public void setNameGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_GTE);
        }
    }

    public boolean getNameGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_GTE);
    }

    public SnapshotPlanWhereInput nameIn(List<String> nameIn) {

        this.nameIn = nameIn;
        return this;
    }

    public SnapshotPlanWhereInput addNameInItem(String nameInItem) {
        if (this.nameIn == null) {
            this.nameIn = new ArrayList<String>();
        }
        this.nameIn.add(nameInItem);
        return this;
    }

    /**
     * Get nameIn
     *
     * @return nameIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getNameIn() {
        return nameIn;
    }

    public void setNameIn(List<String> nameIn) {
        this.nameIn = nameIn;
    }

    public SnapshotPlanWhereInput nameIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_IN);
        return this;
    }

    public SnapshotPlanWhereInput nameIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_IN);
        return this;
    }

    public void setNameIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_IN);
        }
    }

    public boolean getNameIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_IN);
    }

    public SnapshotPlanWhereInput nameLt(String nameLt) {

        this.nameLt = nameLt;
        return this;
    }

    /**
     * Get nameLt
     *
     * @return nameLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNameLt() {
        return nameLt;
    }

    public void setNameLt(String nameLt) {
        this.nameLt = nameLt;
    }

    public SnapshotPlanWhereInput nameLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_LT);
        return this;
    }

    public SnapshotPlanWhereInput nameLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_LT);
        return this;
    }

    public void setNameLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_LT);
        }
    }

    public boolean getNameLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_LT);
    }

    public SnapshotPlanWhereInput nameLte(String nameLte) {

        this.nameLte = nameLte;
        return this;
    }

    /**
     * Get nameLte
     *
     * @return nameLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNameLte() {
        return nameLte;
    }

    public void setNameLte(String nameLte) {
        this.nameLte = nameLte;
    }

    public SnapshotPlanWhereInput nameLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_LTE);
        return this;
    }

    public SnapshotPlanWhereInput nameLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_LTE);
        return this;
    }

    public void setNameLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_LTE);
        }
    }

    public boolean getNameLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_LTE);
    }

    public SnapshotPlanWhereInput nameNot(String nameNot) {

        this.nameNot = nameNot;
        return this;
    }

    /**
     * Get nameNot
     *
     * @return nameNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNameNot() {
        return nameNot;
    }

    public void setNameNot(String nameNot) {
        this.nameNot = nameNot;
    }

    public SnapshotPlanWhereInput nameNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT);
        return this;
    }

    public SnapshotPlanWhereInput nameNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_NOT);
        return this;
    }

    public void setNameNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_NOT);
        }
    }

    public boolean getNameNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_NOT);
    }

    public SnapshotPlanWhereInput nameNotContains(String nameNotContains) {

        this.nameNotContains = nameNotContains;
        return this;
    }

    /**
     * Get nameNotContains
     *
     * @return nameNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNameNotContains() {
        return nameNotContains;
    }

    public void setNameNotContains(String nameNotContains) {
        this.nameNotContains = nameNotContains;
    }

    public SnapshotPlanWhereInput nameNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_CONTAINS);
        return this;
    }

    public SnapshotPlanWhereInput nameNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_NOT_CONTAINS);
        return this;
    }

    public void setNameNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_NOT_CONTAINS);
        }
    }

    public boolean getNameNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_NOT_CONTAINS);
    }

    public SnapshotPlanWhereInput nameNotEndsWith(String nameNotEndsWith) {

        this.nameNotEndsWith = nameNotEndsWith;
        return this;
    }

    /**
     * Get nameNotEndsWith
     *
     * @return nameNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNameNotEndsWith() {
        return nameNotEndsWith;
    }

    public void setNameNotEndsWith(String nameNotEndsWith) {
        this.nameNotEndsWith = nameNotEndsWith;
    }

    public SnapshotPlanWhereInput nameNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_ENDS_WITH);
        return this;
    }

    public SnapshotPlanWhereInput nameNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_NOT_ENDS_WITH);
        return this;
    }

    public void setNameNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_NOT_ENDS_WITH);
        }
    }

    public boolean getNameNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_NOT_ENDS_WITH);
    }

    public SnapshotPlanWhereInput nameNotIn(List<String> nameNotIn) {

        this.nameNotIn = nameNotIn;
        return this;
    }

    public SnapshotPlanWhereInput addNameNotInItem(String nameNotInItem) {
        if (this.nameNotIn == null) {
            this.nameNotIn = new ArrayList<String>();
        }
        this.nameNotIn.add(nameNotInItem);
        return this;
    }

    /**
     * Get nameNotIn
     *
     * @return nameNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getNameNotIn() {
        return nameNotIn;
    }

    public void setNameNotIn(List<String> nameNotIn) {
        this.nameNotIn = nameNotIn;
    }

    public SnapshotPlanWhereInput nameNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_IN);
        return this;
    }

    public SnapshotPlanWhereInput nameNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_NOT_IN);
        return this;
    }

    public void setNameNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_NOT_IN);
        }
    }

    public boolean getNameNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_NOT_IN);
    }

    public SnapshotPlanWhereInput nameNotStartsWith(String nameNotStartsWith) {

        this.nameNotStartsWith = nameNotStartsWith;
        return this;
    }

    /**
     * Get nameNotStartsWith
     *
     * @return nameNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNameNotStartsWith() {
        return nameNotStartsWith;
    }

    public void setNameNotStartsWith(String nameNotStartsWith) {
        this.nameNotStartsWith = nameNotStartsWith;
    }

    public SnapshotPlanWhereInput nameNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_STARTS_WITH);
        return this;
    }

    public SnapshotPlanWhereInput nameNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_NOT_STARTS_WITH);
        return this;
    }

    public void setNameNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_NOT_STARTS_WITH);
        }
    }

    public boolean getNameNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_NOT_STARTS_WITH);
    }

    public SnapshotPlanWhereInput nameStartsWith(String nameStartsWith) {

        this.nameStartsWith = nameStartsWith;
        return this;
    }

    /**
     * Get nameStartsWith
     *
     * @return nameStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNameStartsWith() {
        return nameStartsWith;
    }

    public void setNameStartsWith(String nameStartsWith) {
        this.nameStartsWith = nameStartsWith;
    }

    public SnapshotPlanWhereInput nameStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_STARTS_WITH);
        return this;
    }

    public SnapshotPlanWhereInput nameStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NAME_STARTS_WITH);
        return this;
    }

    public void setNameStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NAME_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NAME_STARTS_WITH);
        }
    }

    public boolean getNameStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NAME_STARTS_WITH);
    }

    public SnapshotPlanWhereInput nextExecuteTime(String nextExecuteTime) {

        this.nextExecuteTime = nextExecuteTime;
        return this;
    }

    /**
     * Get nextExecuteTime
     *
     * @return nextExecuteTime
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNextExecuteTime() {
        return nextExecuteTime;
    }

    public void setNextExecuteTime(String nextExecuteTime) {
        this.nextExecuteTime = nextExecuteTime;
    }

    public SnapshotPlanWhereInput nextExecuteTime_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NEXT_EXECUTE_TIME);
        return this;
    }

    public SnapshotPlanWhereInput nextExecuteTime_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NEXT_EXECUTE_TIME);
        return this;
    }

    public void setNextExecuteTime_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NEXT_EXECUTE_TIME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NEXT_EXECUTE_TIME);
        }
    }

    public boolean getNextExecuteTime_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NEXT_EXECUTE_TIME);
    }

    public SnapshotPlanWhereInput nextExecuteTimeGt(String nextExecuteTimeGt) {

        this.nextExecuteTimeGt = nextExecuteTimeGt;
        return this;
    }

    /**
     * Get nextExecuteTimeGt
     *
     * @return nextExecuteTimeGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNextExecuteTimeGt() {
        return nextExecuteTimeGt;
    }

    public void setNextExecuteTimeGt(String nextExecuteTimeGt) {
        this.nextExecuteTimeGt = nextExecuteTimeGt;
    }

    public SnapshotPlanWhereInput nextExecuteTimeGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NEXT_EXECUTE_TIME_GT);
        return this;
    }

    public SnapshotPlanWhereInput nextExecuteTimeGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NEXT_EXECUTE_TIME_GT);
        return this;
    }

    public void setNextExecuteTimeGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NEXT_EXECUTE_TIME_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NEXT_EXECUTE_TIME_GT);
        }
    }

    public boolean getNextExecuteTimeGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NEXT_EXECUTE_TIME_GT);
    }

    public SnapshotPlanWhereInput nextExecuteTimeGte(String nextExecuteTimeGte) {

        this.nextExecuteTimeGte = nextExecuteTimeGte;
        return this;
    }

    /**
     * Get nextExecuteTimeGte
     *
     * @return nextExecuteTimeGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNextExecuteTimeGte() {
        return nextExecuteTimeGte;
    }

    public void setNextExecuteTimeGte(String nextExecuteTimeGte) {
        this.nextExecuteTimeGte = nextExecuteTimeGte;
    }

    public SnapshotPlanWhereInput nextExecuteTimeGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NEXT_EXECUTE_TIME_GTE);
        return this;
    }

    public SnapshotPlanWhereInput nextExecuteTimeGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NEXT_EXECUTE_TIME_GTE);
        return this;
    }

    public void setNextExecuteTimeGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NEXT_EXECUTE_TIME_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NEXT_EXECUTE_TIME_GTE);
        }
    }

    public boolean getNextExecuteTimeGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NEXT_EXECUTE_TIME_GTE);
    }

    public SnapshotPlanWhereInput nextExecuteTimeIn(List<String> nextExecuteTimeIn) {

        this.nextExecuteTimeIn = nextExecuteTimeIn;
        return this;
    }

    public SnapshotPlanWhereInput addNextExecuteTimeInItem(String nextExecuteTimeInItem) {
        if (this.nextExecuteTimeIn == null) {
            this.nextExecuteTimeIn = new ArrayList<String>();
        }
        this.nextExecuteTimeIn.add(nextExecuteTimeInItem);
        return this;
    }

    /**
     * Get nextExecuteTimeIn
     *
     * @return nextExecuteTimeIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getNextExecuteTimeIn() {
        return nextExecuteTimeIn;
    }

    public void setNextExecuteTimeIn(List<String> nextExecuteTimeIn) {
        this.nextExecuteTimeIn = nextExecuteTimeIn;
    }

    public SnapshotPlanWhereInput nextExecuteTimeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NEXT_EXECUTE_TIME_IN);
        return this;
    }

    public SnapshotPlanWhereInput nextExecuteTimeIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NEXT_EXECUTE_TIME_IN);
        return this;
    }

    public void setNextExecuteTimeIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NEXT_EXECUTE_TIME_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NEXT_EXECUTE_TIME_IN);
        }
    }

    public boolean getNextExecuteTimeIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NEXT_EXECUTE_TIME_IN);
    }

    public SnapshotPlanWhereInput nextExecuteTimeLt(String nextExecuteTimeLt) {

        this.nextExecuteTimeLt = nextExecuteTimeLt;
        return this;
    }

    /**
     * Get nextExecuteTimeLt
     *
     * @return nextExecuteTimeLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNextExecuteTimeLt() {
        return nextExecuteTimeLt;
    }

    public void setNextExecuteTimeLt(String nextExecuteTimeLt) {
        this.nextExecuteTimeLt = nextExecuteTimeLt;
    }

    public SnapshotPlanWhereInput nextExecuteTimeLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NEXT_EXECUTE_TIME_LT);
        return this;
    }

    public SnapshotPlanWhereInput nextExecuteTimeLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NEXT_EXECUTE_TIME_LT);
        return this;
    }

    public void setNextExecuteTimeLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NEXT_EXECUTE_TIME_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NEXT_EXECUTE_TIME_LT);
        }
    }

    public boolean getNextExecuteTimeLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NEXT_EXECUTE_TIME_LT);
    }

    public SnapshotPlanWhereInput nextExecuteTimeLte(String nextExecuteTimeLte) {

        this.nextExecuteTimeLte = nextExecuteTimeLte;
        return this;
    }

    /**
     * Get nextExecuteTimeLte
     *
     * @return nextExecuteTimeLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNextExecuteTimeLte() {
        return nextExecuteTimeLte;
    }

    public void setNextExecuteTimeLte(String nextExecuteTimeLte) {
        this.nextExecuteTimeLte = nextExecuteTimeLte;
    }

    public SnapshotPlanWhereInput nextExecuteTimeLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NEXT_EXECUTE_TIME_LTE);
        return this;
    }

    public SnapshotPlanWhereInput nextExecuteTimeLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NEXT_EXECUTE_TIME_LTE);
        return this;
    }

    public void setNextExecuteTimeLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NEXT_EXECUTE_TIME_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NEXT_EXECUTE_TIME_LTE);
        }
    }

    public boolean getNextExecuteTimeLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NEXT_EXECUTE_TIME_LTE);
    }

    public SnapshotPlanWhereInput nextExecuteTimeNot(String nextExecuteTimeNot) {

        this.nextExecuteTimeNot = nextExecuteTimeNot;
        return this;
    }

    /**
     * Get nextExecuteTimeNot
     *
     * @return nextExecuteTimeNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getNextExecuteTimeNot() {
        return nextExecuteTimeNot;
    }

    public void setNextExecuteTimeNot(String nextExecuteTimeNot) {
        this.nextExecuteTimeNot = nextExecuteTimeNot;
    }

    public SnapshotPlanWhereInput nextExecuteTimeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NEXT_EXECUTE_TIME_NOT);
        return this;
    }

    public SnapshotPlanWhereInput nextExecuteTimeNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NEXT_EXECUTE_TIME_NOT);
        return this;
    }

    public void setNextExecuteTimeNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NEXT_EXECUTE_TIME_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NEXT_EXECUTE_TIME_NOT);
        }
    }

    public boolean getNextExecuteTimeNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NEXT_EXECUTE_TIME_NOT);
    }

    public SnapshotPlanWhereInput nextExecuteTimeNotIn(List<String> nextExecuteTimeNotIn) {

        this.nextExecuteTimeNotIn = nextExecuteTimeNotIn;
        return this;
    }

    public SnapshotPlanWhereInput addNextExecuteTimeNotInItem(String nextExecuteTimeNotInItem) {
        if (this.nextExecuteTimeNotIn == null) {
            this.nextExecuteTimeNotIn = new ArrayList<String>();
        }
        this.nextExecuteTimeNotIn.add(nextExecuteTimeNotInItem);
        return this;
    }

    /**
     * Get nextExecuteTimeNotIn
     *
     * @return nextExecuteTimeNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getNextExecuteTimeNotIn() {
        return nextExecuteTimeNotIn;
    }

    public void setNextExecuteTimeNotIn(List<String> nextExecuteTimeNotIn) {
        this.nextExecuteTimeNotIn = nextExecuteTimeNotIn;
    }

    public SnapshotPlanWhereInput nextExecuteTimeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NEXT_EXECUTE_TIME_NOT_IN);
        return this;
    }

    public SnapshotPlanWhereInput nextExecuteTimeNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NEXT_EXECUTE_TIME_NOT_IN);
        return this;
    }

    public void setNextExecuteTimeNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NEXT_EXECUTE_TIME_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NEXT_EXECUTE_TIME_NOT_IN);
        }
    }

    public boolean getNextExecuteTimeNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NEXT_EXECUTE_TIME_NOT_IN);
    }

    public SnapshotPlanWhereInput objectNum(Integer objectNum) {

        this.objectNum = objectNum;
        return this;
    }

    /**
     * Get objectNum
     *
     * @return objectNum
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getObjectNum() {
        return objectNum;
    }

    public void setObjectNum(Integer objectNum) {
        this.objectNum = objectNum;
    }

    public SnapshotPlanWhereInput objectNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_OBJECT_NUM);
        return this;
    }

    public SnapshotPlanWhereInput objectNum_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_OBJECT_NUM);
        return this;
    }

    public void setObjectNum_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_OBJECT_NUM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_OBJECT_NUM);
        }
    }

    public boolean getObjectNum_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_OBJECT_NUM);
    }

    public SnapshotPlanWhereInput objectNumGt(Integer objectNumGt) {

        this.objectNumGt = objectNumGt;
        return this;
    }

    /**
     * Get objectNumGt
     *
     * @return objectNumGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getObjectNumGt() {
        return objectNumGt;
    }

    public void setObjectNumGt(Integer objectNumGt) {
        this.objectNumGt = objectNumGt;
    }

    public SnapshotPlanWhereInput objectNumGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_OBJECT_NUM_GT);
        return this;
    }

    public SnapshotPlanWhereInput objectNumGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_OBJECT_NUM_GT);
        return this;
    }

    public void setObjectNumGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_OBJECT_NUM_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_OBJECT_NUM_GT);
        }
    }

    public boolean getObjectNumGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_OBJECT_NUM_GT);
    }

    public SnapshotPlanWhereInput objectNumGte(Integer objectNumGte) {

        this.objectNumGte = objectNumGte;
        return this;
    }

    /**
     * Get objectNumGte
     *
     * @return objectNumGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getObjectNumGte() {
        return objectNumGte;
    }

    public void setObjectNumGte(Integer objectNumGte) {
        this.objectNumGte = objectNumGte;
    }

    public SnapshotPlanWhereInput objectNumGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_OBJECT_NUM_GTE);
        return this;
    }

    public SnapshotPlanWhereInput objectNumGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_OBJECT_NUM_GTE);
        return this;
    }

    public void setObjectNumGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_OBJECT_NUM_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_OBJECT_NUM_GTE);
        }
    }

    public boolean getObjectNumGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_OBJECT_NUM_GTE);
    }

    public SnapshotPlanWhereInput objectNumIn(List<Integer> objectNumIn) {

        this.objectNumIn = objectNumIn;
        return this;
    }

    public SnapshotPlanWhereInput addObjectNumInItem(Integer objectNumInItem) {
        if (this.objectNumIn == null) {
            this.objectNumIn = new ArrayList<Integer>();
        }
        this.objectNumIn.add(objectNumInItem);
        return this;
    }

    /**
     * Get objectNumIn
     *
     * @return objectNumIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getObjectNumIn() {
        return objectNumIn;
    }

    public void setObjectNumIn(List<Integer> objectNumIn) {
        this.objectNumIn = objectNumIn;
    }

    public SnapshotPlanWhereInput objectNumIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_OBJECT_NUM_IN);
        return this;
    }

    public SnapshotPlanWhereInput objectNumIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_OBJECT_NUM_IN);
        return this;
    }

    public void setObjectNumIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_OBJECT_NUM_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_OBJECT_NUM_IN);
        }
    }

    public boolean getObjectNumIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_OBJECT_NUM_IN);
    }

    public SnapshotPlanWhereInput objectNumLt(Integer objectNumLt) {

        this.objectNumLt = objectNumLt;
        return this;
    }

    /**
     * Get objectNumLt
     *
     * @return objectNumLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getObjectNumLt() {
        return objectNumLt;
    }

    public void setObjectNumLt(Integer objectNumLt) {
        this.objectNumLt = objectNumLt;
    }

    public SnapshotPlanWhereInput objectNumLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_OBJECT_NUM_LT);
        return this;
    }

    public SnapshotPlanWhereInput objectNumLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_OBJECT_NUM_LT);
        return this;
    }

    public void setObjectNumLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_OBJECT_NUM_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_OBJECT_NUM_LT);
        }
    }

    public boolean getObjectNumLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_OBJECT_NUM_LT);
    }

    public SnapshotPlanWhereInput objectNumLte(Integer objectNumLte) {

        this.objectNumLte = objectNumLte;
        return this;
    }

    /**
     * Get objectNumLte
     *
     * @return objectNumLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getObjectNumLte() {
        return objectNumLte;
    }

    public void setObjectNumLte(Integer objectNumLte) {
        this.objectNumLte = objectNumLte;
    }

    public SnapshotPlanWhereInput objectNumLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_OBJECT_NUM_LTE);
        return this;
    }

    public SnapshotPlanWhereInput objectNumLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_OBJECT_NUM_LTE);
        return this;
    }

    public void setObjectNumLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_OBJECT_NUM_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_OBJECT_NUM_LTE);
        }
    }

    public boolean getObjectNumLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_OBJECT_NUM_LTE);
    }

    public SnapshotPlanWhereInput objectNumNot(Integer objectNumNot) {

        this.objectNumNot = objectNumNot;
        return this;
    }

    /**
     * Get objectNumNot
     *
     * @return objectNumNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getObjectNumNot() {
        return objectNumNot;
    }

    public void setObjectNumNot(Integer objectNumNot) {
        this.objectNumNot = objectNumNot;
    }

    public SnapshotPlanWhereInput objectNumNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_OBJECT_NUM_NOT);
        return this;
    }

    public SnapshotPlanWhereInput objectNumNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_OBJECT_NUM_NOT);
        return this;
    }

    public void setObjectNumNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_OBJECT_NUM_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_OBJECT_NUM_NOT);
        }
    }

    public boolean getObjectNumNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_OBJECT_NUM_NOT);
    }

    public SnapshotPlanWhereInput objectNumNotIn(List<Integer> objectNumNotIn) {

        this.objectNumNotIn = objectNumNotIn;
        return this;
    }

    public SnapshotPlanWhereInput addObjectNumNotInItem(Integer objectNumNotInItem) {
        if (this.objectNumNotIn == null) {
            this.objectNumNotIn = new ArrayList<Integer>();
        }
        this.objectNumNotIn.add(objectNumNotInItem);
        return this;
    }

    /**
     * Get objectNumNotIn
     *
     * @return objectNumNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getObjectNumNotIn() {
        return objectNumNotIn;
    }

    public void setObjectNumNotIn(List<Integer> objectNumNotIn) {
        this.objectNumNotIn = objectNumNotIn;
    }

    public SnapshotPlanWhereInput objectNumNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_OBJECT_NUM_NOT_IN);
        return this;
    }

    public SnapshotPlanWhereInput objectNumNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_OBJECT_NUM_NOT_IN);
        return this;
    }

    public void setObjectNumNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_OBJECT_NUM_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_OBJECT_NUM_NOT_IN);
        }
    }

    public boolean getObjectNumNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_OBJECT_NUM_NOT_IN);
    }

    public SnapshotPlanWhereInput physicalSizeBytes(Long physicalSizeBytes) {

        this.physicalSizeBytes = physicalSizeBytes;
        return this;
    }

    /**
     * Get physicalSizeBytes
     *
     * @return physicalSizeBytes
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getPhysicalSizeBytes() {
        return physicalSizeBytes;
    }

    public void setPhysicalSizeBytes(Long physicalSizeBytes) {
        this.physicalSizeBytes = physicalSizeBytes;
    }

    public SnapshotPlanWhereInput physicalSizeBytes_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PHYSICAL_SIZE_BYTES);
        return this;
    }

    public SnapshotPlanWhereInput physicalSizeBytes_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PHYSICAL_SIZE_BYTES);
        return this;
    }

    public void setPhysicalSizeBytes_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PHYSICAL_SIZE_BYTES);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PHYSICAL_SIZE_BYTES);
        }
    }

    public boolean getPhysicalSizeBytes_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PHYSICAL_SIZE_BYTES);
    }

    public SnapshotPlanWhereInput physicalSizeBytesGt(Long physicalSizeBytesGt) {

        this.physicalSizeBytesGt = physicalSizeBytesGt;
        return this;
    }

    /**
     * Get physicalSizeBytesGt
     *
     * @return physicalSizeBytesGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getPhysicalSizeBytesGt() {
        return physicalSizeBytesGt;
    }

    public void setPhysicalSizeBytesGt(Long physicalSizeBytesGt) {
        this.physicalSizeBytesGt = physicalSizeBytesGt;
    }

    public SnapshotPlanWhereInput physicalSizeBytesGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PHYSICAL_SIZE_BYTES_GT);
        return this;
    }

    public SnapshotPlanWhereInput physicalSizeBytesGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PHYSICAL_SIZE_BYTES_GT);
        return this;
    }

    public void setPhysicalSizeBytesGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PHYSICAL_SIZE_BYTES_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PHYSICAL_SIZE_BYTES_GT);
        }
    }

    public boolean getPhysicalSizeBytesGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PHYSICAL_SIZE_BYTES_GT);
    }

    public SnapshotPlanWhereInput physicalSizeBytesGte(Long physicalSizeBytesGte) {

        this.physicalSizeBytesGte = physicalSizeBytesGte;
        return this;
    }

    /**
     * Get physicalSizeBytesGte
     *
     * @return physicalSizeBytesGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getPhysicalSizeBytesGte() {
        return physicalSizeBytesGte;
    }

    public void setPhysicalSizeBytesGte(Long physicalSizeBytesGte) {
        this.physicalSizeBytesGte = physicalSizeBytesGte;
    }

    public SnapshotPlanWhereInput physicalSizeBytesGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PHYSICAL_SIZE_BYTES_GTE);
        return this;
    }

    public SnapshotPlanWhereInput physicalSizeBytesGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PHYSICAL_SIZE_BYTES_GTE);
        return this;
    }

    public void setPhysicalSizeBytesGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PHYSICAL_SIZE_BYTES_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PHYSICAL_SIZE_BYTES_GTE);
        }
    }

    public boolean getPhysicalSizeBytesGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PHYSICAL_SIZE_BYTES_GTE);
    }

    public SnapshotPlanWhereInput physicalSizeBytesIn(List<Long> physicalSizeBytesIn) {

        this.physicalSizeBytesIn = physicalSizeBytesIn;
        return this;
    }

    public SnapshotPlanWhereInput addPhysicalSizeBytesInItem(Long physicalSizeBytesInItem) {
        if (this.physicalSizeBytesIn == null) {
            this.physicalSizeBytesIn = new ArrayList<Long>();
        }
        this.physicalSizeBytesIn.add(physicalSizeBytesInItem);
        return this;
    }

    /**
     * Get physicalSizeBytesIn
     *
     * @return physicalSizeBytesIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getPhysicalSizeBytesIn() {
        return physicalSizeBytesIn;
    }

    public void setPhysicalSizeBytesIn(List<Long> physicalSizeBytesIn) {
        this.physicalSizeBytesIn = physicalSizeBytesIn;
    }

    public SnapshotPlanWhereInput physicalSizeBytesIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PHYSICAL_SIZE_BYTES_IN);
        return this;
    }

    public SnapshotPlanWhereInput physicalSizeBytesIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PHYSICAL_SIZE_BYTES_IN);
        return this;
    }

    public void setPhysicalSizeBytesIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PHYSICAL_SIZE_BYTES_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PHYSICAL_SIZE_BYTES_IN);
        }
    }

    public boolean getPhysicalSizeBytesIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PHYSICAL_SIZE_BYTES_IN);
    }

    public SnapshotPlanWhereInput physicalSizeBytesLt(Long physicalSizeBytesLt) {

        this.physicalSizeBytesLt = physicalSizeBytesLt;
        return this;
    }

    /**
     * Get physicalSizeBytesLt
     *
     * @return physicalSizeBytesLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getPhysicalSizeBytesLt() {
        return physicalSizeBytesLt;
    }

    public void setPhysicalSizeBytesLt(Long physicalSizeBytesLt) {
        this.physicalSizeBytesLt = physicalSizeBytesLt;
    }

    public SnapshotPlanWhereInput physicalSizeBytesLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PHYSICAL_SIZE_BYTES_LT);
        return this;
    }

    public SnapshotPlanWhereInput physicalSizeBytesLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PHYSICAL_SIZE_BYTES_LT);
        return this;
    }

    public void setPhysicalSizeBytesLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PHYSICAL_SIZE_BYTES_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PHYSICAL_SIZE_BYTES_LT);
        }
    }

    public boolean getPhysicalSizeBytesLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PHYSICAL_SIZE_BYTES_LT);
    }

    public SnapshotPlanWhereInput physicalSizeBytesLte(Long physicalSizeBytesLte) {

        this.physicalSizeBytesLte = physicalSizeBytesLte;
        return this;
    }

    /**
     * Get physicalSizeBytesLte
     *
     * @return physicalSizeBytesLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getPhysicalSizeBytesLte() {
        return physicalSizeBytesLte;
    }

    public void setPhysicalSizeBytesLte(Long physicalSizeBytesLte) {
        this.physicalSizeBytesLte = physicalSizeBytesLte;
    }

    public SnapshotPlanWhereInput physicalSizeBytesLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PHYSICAL_SIZE_BYTES_LTE);
        return this;
    }

    public SnapshotPlanWhereInput physicalSizeBytesLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PHYSICAL_SIZE_BYTES_LTE);
        return this;
    }

    public void setPhysicalSizeBytesLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PHYSICAL_SIZE_BYTES_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PHYSICAL_SIZE_BYTES_LTE);
        }
    }

    public boolean getPhysicalSizeBytesLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PHYSICAL_SIZE_BYTES_LTE);
    }

    public SnapshotPlanWhereInput physicalSizeBytesNot(Long physicalSizeBytesNot) {

        this.physicalSizeBytesNot = physicalSizeBytesNot;
        return this;
    }

    /**
     * Get physicalSizeBytesNot
     *
     * @return physicalSizeBytesNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getPhysicalSizeBytesNot() {
        return physicalSizeBytesNot;
    }

    public void setPhysicalSizeBytesNot(Long physicalSizeBytesNot) {
        this.physicalSizeBytesNot = physicalSizeBytesNot;
    }

    public SnapshotPlanWhereInput physicalSizeBytesNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PHYSICAL_SIZE_BYTES_NOT);
        return this;
    }

    public SnapshotPlanWhereInput physicalSizeBytesNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PHYSICAL_SIZE_BYTES_NOT);
        return this;
    }

    public void setPhysicalSizeBytesNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PHYSICAL_SIZE_BYTES_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PHYSICAL_SIZE_BYTES_NOT);
        }
    }

    public boolean getPhysicalSizeBytesNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PHYSICAL_SIZE_BYTES_NOT);
    }

    public SnapshotPlanWhereInput physicalSizeBytesNotIn(List<Long> physicalSizeBytesNotIn) {

        this.physicalSizeBytesNotIn = physicalSizeBytesNotIn;
        return this;
    }

    public SnapshotPlanWhereInput addPhysicalSizeBytesNotInItem(Long physicalSizeBytesNotInItem) {
        if (this.physicalSizeBytesNotIn == null) {
            this.physicalSizeBytesNotIn = new ArrayList<Long>();
        }
        this.physicalSizeBytesNotIn.add(physicalSizeBytesNotInItem);
        return this;
    }

    /**
     * Get physicalSizeBytesNotIn
     *
     * @return physicalSizeBytesNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getPhysicalSizeBytesNotIn() {
        return physicalSizeBytesNotIn;
    }

    public void setPhysicalSizeBytesNotIn(List<Long> physicalSizeBytesNotIn) {
        this.physicalSizeBytesNotIn = physicalSizeBytesNotIn;
    }

    public SnapshotPlanWhereInput physicalSizeBytesNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PHYSICAL_SIZE_BYTES_NOT_IN);
        return this;
    }

    public SnapshotPlanWhereInput physicalSizeBytesNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PHYSICAL_SIZE_BYTES_NOT_IN);
        return this;
    }

    public void setPhysicalSizeBytesNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PHYSICAL_SIZE_BYTES_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PHYSICAL_SIZE_BYTES_NOT_IN);
        }
    }

    public boolean getPhysicalSizeBytesNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PHYSICAL_SIZE_BYTES_NOT_IN);
    }

    public SnapshotPlanWhereInput remainSnapshotNum(Integer remainSnapshotNum) {

        this.remainSnapshotNum = remainSnapshotNum;
        return this;
    }

    /**
     * Get remainSnapshotNum
     *
     * @return remainSnapshotNum
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getRemainSnapshotNum() {
        return remainSnapshotNum;
    }

    public void setRemainSnapshotNum(Integer remainSnapshotNum) {
        this.remainSnapshotNum = remainSnapshotNum;
    }

    public SnapshotPlanWhereInput remainSnapshotNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REMAIN_SNAPSHOT_NUM);
        return this;
    }

    public SnapshotPlanWhereInput remainSnapshotNum_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REMAIN_SNAPSHOT_NUM);
        return this;
    }

    public void setRemainSnapshotNum_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REMAIN_SNAPSHOT_NUM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REMAIN_SNAPSHOT_NUM);
        }
    }

    public boolean getRemainSnapshotNum_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REMAIN_SNAPSHOT_NUM);
    }

    public SnapshotPlanWhereInput remainSnapshotNumGt(Integer remainSnapshotNumGt) {

        this.remainSnapshotNumGt = remainSnapshotNumGt;
        return this;
    }

    /**
     * Get remainSnapshotNumGt
     *
     * @return remainSnapshotNumGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getRemainSnapshotNumGt() {
        return remainSnapshotNumGt;
    }

    public void setRemainSnapshotNumGt(Integer remainSnapshotNumGt) {
        this.remainSnapshotNumGt = remainSnapshotNumGt;
    }

    public SnapshotPlanWhereInput remainSnapshotNumGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REMAIN_SNAPSHOT_NUM_GT);
        return this;
    }

    public SnapshotPlanWhereInput remainSnapshotNumGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REMAIN_SNAPSHOT_NUM_GT);
        return this;
    }

    public void setRemainSnapshotNumGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REMAIN_SNAPSHOT_NUM_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REMAIN_SNAPSHOT_NUM_GT);
        }
    }

    public boolean getRemainSnapshotNumGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REMAIN_SNAPSHOT_NUM_GT);
    }

    public SnapshotPlanWhereInput remainSnapshotNumGte(Integer remainSnapshotNumGte) {

        this.remainSnapshotNumGte = remainSnapshotNumGte;
        return this;
    }

    /**
     * Get remainSnapshotNumGte
     *
     * @return remainSnapshotNumGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getRemainSnapshotNumGte() {
        return remainSnapshotNumGte;
    }

    public void setRemainSnapshotNumGte(Integer remainSnapshotNumGte) {
        this.remainSnapshotNumGte = remainSnapshotNumGte;
    }

    public SnapshotPlanWhereInput remainSnapshotNumGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REMAIN_SNAPSHOT_NUM_GTE);
        return this;
    }

    public SnapshotPlanWhereInput remainSnapshotNumGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REMAIN_SNAPSHOT_NUM_GTE);
        return this;
    }

    public void setRemainSnapshotNumGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REMAIN_SNAPSHOT_NUM_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REMAIN_SNAPSHOT_NUM_GTE);
        }
    }

    public boolean getRemainSnapshotNumGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REMAIN_SNAPSHOT_NUM_GTE);
    }

    public SnapshotPlanWhereInput remainSnapshotNumIn(List<Integer> remainSnapshotNumIn) {

        this.remainSnapshotNumIn = remainSnapshotNumIn;
        return this;
    }

    public SnapshotPlanWhereInput addRemainSnapshotNumInItem(Integer remainSnapshotNumInItem) {
        if (this.remainSnapshotNumIn == null) {
            this.remainSnapshotNumIn = new ArrayList<Integer>();
        }
        this.remainSnapshotNumIn.add(remainSnapshotNumInItem);
        return this;
    }

    /**
     * Get remainSnapshotNumIn
     *
     * @return remainSnapshotNumIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getRemainSnapshotNumIn() {
        return remainSnapshotNumIn;
    }

    public void setRemainSnapshotNumIn(List<Integer> remainSnapshotNumIn) {
        this.remainSnapshotNumIn = remainSnapshotNumIn;
    }

    public SnapshotPlanWhereInput remainSnapshotNumIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REMAIN_SNAPSHOT_NUM_IN);
        return this;
    }

    public SnapshotPlanWhereInput remainSnapshotNumIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REMAIN_SNAPSHOT_NUM_IN);
        return this;
    }

    public void setRemainSnapshotNumIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REMAIN_SNAPSHOT_NUM_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REMAIN_SNAPSHOT_NUM_IN);
        }
    }

    public boolean getRemainSnapshotNumIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REMAIN_SNAPSHOT_NUM_IN);
    }

    public SnapshotPlanWhereInput remainSnapshotNumLt(Integer remainSnapshotNumLt) {

        this.remainSnapshotNumLt = remainSnapshotNumLt;
        return this;
    }

    /**
     * Get remainSnapshotNumLt
     *
     * @return remainSnapshotNumLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getRemainSnapshotNumLt() {
        return remainSnapshotNumLt;
    }

    public void setRemainSnapshotNumLt(Integer remainSnapshotNumLt) {
        this.remainSnapshotNumLt = remainSnapshotNumLt;
    }

    public SnapshotPlanWhereInput remainSnapshotNumLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REMAIN_SNAPSHOT_NUM_LT);
        return this;
    }

    public SnapshotPlanWhereInput remainSnapshotNumLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REMAIN_SNAPSHOT_NUM_LT);
        return this;
    }

    public void setRemainSnapshotNumLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REMAIN_SNAPSHOT_NUM_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REMAIN_SNAPSHOT_NUM_LT);
        }
    }

    public boolean getRemainSnapshotNumLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REMAIN_SNAPSHOT_NUM_LT);
    }

    public SnapshotPlanWhereInput remainSnapshotNumLte(Integer remainSnapshotNumLte) {

        this.remainSnapshotNumLte = remainSnapshotNumLte;
        return this;
    }

    /**
     * Get remainSnapshotNumLte
     *
     * @return remainSnapshotNumLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getRemainSnapshotNumLte() {
        return remainSnapshotNumLte;
    }

    public void setRemainSnapshotNumLte(Integer remainSnapshotNumLte) {
        this.remainSnapshotNumLte = remainSnapshotNumLte;
    }

    public SnapshotPlanWhereInput remainSnapshotNumLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REMAIN_SNAPSHOT_NUM_LTE);
        return this;
    }

    public SnapshotPlanWhereInput remainSnapshotNumLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REMAIN_SNAPSHOT_NUM_LTE);
        return this;
    }

    public void setRemainSnapshotNumLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REMAIN_SNAPSHOT_NUM_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REMAIN_SNAPSHOT_NUM_LTE);
        }
    }

    public boolean getRemainSnapshotNumLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REMAIN_SNAPSHOT_NUM_LTE);
    }

    public SnapshotPlanWhereInput remainSnapshotNumNot(Integer remainSnapshotNumNot) {

        this.remainSnapshotNumNot = remainSnapshotNumNot;
        return this;
    }

    /**
     * Get remainSnapshotNumNot
     *
     * @return remainSnapshotNumNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getRemainSnapshotNumNot() {
        return remainSnapshotNumNot;
    }

    public void setRemainSnapshotNumNot(Integer remainSnapshotNumNot) {
        this.remainSnapshotNumNot = remainSnapshotNumNot;
    }

    public SnapshotPlanWhereInput remainSnapshotNumNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REMAIN_SNAPSHOT_NUM_NOT);
        return this;
    }

    public SnapshotPlanWhereInput remainSnapshotNumNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REMAIN_SNAPSHOT_NUM_NOT);
        return this;
    }

    public void setRemainSnapshotNumNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REMAIN_SNAPSHOT_NUM_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REMAIN_SNAPSHOT_NUM_NOT);
        }
    }

    public boolean getRemainSnapshotNumNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REMAIN_SNAPSHOT_NUM_NOT);
    }

    public SnapshotPlanWhereInput remainSnapshotNumNotIn(List<Integer> remainSnapshotNumNotIn) {

        this.remainSnapshotNumNotIn = remainSnapshotNumNotIn;
        return this;
    }

    public SnapshotPlanWhereInput addRemainSnapshotNumNotInItem(
            Integer remainSnapshotNumNotInItem) {
        if (this.remainSnapshotNumNotIn == null) {
            this.remainSnapshotNumNotIn = new ArrayList<Integer>();
        }
        this.remainSnapshotNumNotIn.add(remainSnapshotNumNotInItem);
        return this;
    }

    /**
     * Get remainSnapshotNumNotIn
     *
     * @return remainSnapshotNumNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getRemainSnapshotNumNotIn() {
        return remainSnapshotNumNotIn;
    }

    public void setRemainSnapshotNumNotIn(List<Integer> remainSnapshotNumNotIn) {
        this.remainSnapshotNumNotIn = remainSnapshotNumNotIn;
    }

    public SnapshotPlanWhereInput remainSnapshotNumNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REMAIN_SNAPSHOT_NUM_NOT_IN);
        return this;
    }

    public SnapshotPlanWhereInput remainSnapshotNumNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REMAIN_SNAPSHOT_NUM_NOT_IN);
        return this;
    }

    public void setRemainSnapshotNumNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REMAIN_SNAPSHOT_NUM_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REMAIN_SNAPSHOT_NUM_NOT_IN);
        }
    }

    public boolean getRemainSnapshotNumNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REMAIN_SNAPSHOT_NUM_NOT_IN);
    }

    public SnapshotPlanWhereInput snapshotGroupNum(Integer snapshotGroupNum) {

        this.snapshotGroupNum = snapshotGroupNum;
        return this;
    }

    /**
     * Get snapshotGroupNum
     *
     * @return snapshotGroupNum
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getSnapshotGroupNum() {
        return snapshotGroupNum;
    }

    public void setSnapshotGroupNum(Integer snapshotGroupNum) {
        this.snapshotGroupNum = snapshotGroupNum;
    }

    public SnapshotPlanWhereInput snapshotGroupNum_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT_GROUP_NUM);
        return this;
    }

    public SnapshotPlanWhereInput snapshotGroupNum_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SNAPSHOT_GROUP_NUM);
        return this;
    }

    public void setSnapshotGroupNum_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT_GROUP_NUM);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SNAPSHOT_GROUP_NUM);
        }
    }

    public boolean getSnapshotGroupNum_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SNAPSHOT_GROUP_NUM);
    }

    public SnapshotPlanWhereInput snapshotGroupNumGt(Integer snapshotGroupNumGt) {

        this.snapshotGroupNumGt = snapshotGroupNumGt;
        return this;
    }

    /**
     * Get snapshotGroupNumGt
     *
     * @return snapshotGroupNumGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getSnapshotGroupNumGt() {
        return snapshotGroupNumGt;
    }

    public void setSnapshotGroupNumGt(Integer snapshotGroupNumGt) {
        this.snapshotGroupNumGt = snapshotGroupNumGt;
    }

    public SnapshotPlanWhereInput snapshotGroupNumGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT_GROUP_NUM_GT);
        return this;
    }

    public SnapshotPlanWhereInput snapshotGroupNumGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SNAPSHOT_GROUP_NUM_GT);
        return this;
    }

    public void setSnapshotGroupNumGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT_GROUP_NUM_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SNAPSHOT_GROUP_NUM_GT);
        }
    }

    public boolean getSnapshotGroupNumGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SNAPSHOT_GROUP_NUM_GT);
    }

    public SnapshotPlanWhereInput snapshotGroupNumGte(Integer snapshotGroupNumGte) {

        this.snapshotGroupNumGte = snapshotGroupNumGte;
        return this;
    }

    /**
     * Get snapshotGroupNumGte
     *
     * @return snapshotGroupNumGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getSnapshotGroupNumGte() {
        return snapshotGroupNumGte;
    }

    public void setSnapshotGroupNumGte(Integer snapshotGroupNumGte) {
        this.snapshotGroupNumGte = snapshotGroupNumGte;
    }

    public SnapshotPlanWhereInput snapshotGroupNumGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT_GROUP_NUM_GTE);
        return this;
    }

    public SnapshotPlanWhereInput snapshotGroupNumGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SNAPSHOT_GROUP_NUM_GTE);
        return this;
    }

    public void setSnapshotGroupNumGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT_GROUP_NUM_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SNAPSHOT_GROUP_NUM_GTE);
        }
    }

    public boolean getSnapshotGroupNumGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SNAPSHOT_GROUP_NUM_GTE);
    }

    public SnapshotPlanWhereInput snapshotGroupNumIn(List<Integer> snapshotGroupNumIn) {

        this.snapshotGroupNumIn = snapshotGroupNumIn;
        return this;
    }

    public SnapshotPlanWhereInput addSnapshotGroupNumInItem(Integer snapshotGroupNumInItem) {
        if (this.snapshotGroupNumIn == null) {
            this.snapshotGroupNumIn = new ArrayList<Integer>();
        }
        this.snapshotGroupNumIn.add(snapshotGroupNumInItem);
        return this;
    }

    /**
     * Get snapshotGroupNumIn
     *
     * @return snapshotGroupNumIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getSnapshotGroupNumIn() {
        return snapshotGroupNumIn;
    }

    public void setSnapshotGroupNumIn(List<Integer> snapshotGroupNumIn) {
        this.snapshotGroupNumIn = snapshotGroupNumIn;
    }

    public SnapshotPlanWhereInput snapshotGroupNumIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT_GROUP_NUM_IN);
        return this;
    }

    public SnapshotPlanWhereInput snapshotGroupNumIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SNAPSHOT_GROUP_NUM_IN);
        return this;
    }

    public void setSnapshotGroupNumIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT_GROUP_NUM_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SNAPSHOT_GROUP_NUM_IN);
        }
    }

    public boolean getSnapshotGroupNumIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SNAPSHOT_GROUP_NUM_IN);
    }

    public SnapshotPlanWhereInput snapshotGroupNumLt(Integer snapshotGroupNumLt) {

        this.snapshotGroupNumLt = snapshotGroupNumLt;
        return this;
    }

    /**
     * Get snapshotGroupNumLt
     *
     * @return snapshotGroupNumLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getSnapshotGroupNumLt() {
        return snapshotGroupNumLt;
    }

    public void setSnapshotGroupNumLt(Integer snapshotGroupNumLt) {
        this.snapshotGroupNumLt = snapshotGroupNumLt;
    }

    public SnapshotPlanWhereInput snapshotGroupNumLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT_GROUP_NUM_LT);
        return this;
    }

    public SnapshotPlanWhereInput snapshotGroupNumLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SNAPSHOT_GROUP_NUM_LT);
        return this;
    }

    public void setSnapshotGroupNumLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT_GROUP_NUM_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SNAPSHOT_GROUP_NUM_LT);
        }
    }

    public boolean getSnapshotGroupNumLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SNAPSHOT_GROUP_NUM_LT);
    }

    public SnapshotPlanWhereInput snapshotGroupNumLte(Integer snapshotGroupNumLte) {

        this.snapshotGroupNumLte = snapshotGroupNumLte;
        return this;
    }

    /**
     * Get snapshotGroupNumLte
     *
     * @return snapshotGroupNumLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getSnapshotGroupNumLte() {
        return snapshotGroupNumLte;
    }

    public void setSnapshotGroupNumLte(Integer snapshotGroupNumLte) {
        this.snapshotGroupNumLte = snapshotGroupNumLte;
    }

    public SnapshotPlanWhereInput snapshotGroupNumLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT_GROUP_NUM_LTE);
        return this;
    }

    public SnapshotPlanWhereInput snapshotGroupNumLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SNAPSHOT_GROUP_NUM_LTE);
        return this;
    }

    public void setSnapshotGroupNumLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT_GROUP_NUM_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SNAPSHOT_GROUP_NUM_LTE);
        }
    }

    public boolean getSnapshotGroupNumLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SNAPSHOT_GROUP_NUM_LTE);
    }

    public SnapshotPlanWhereInput snapshotGroupNumNot(Integer snapshotGroupNumNot) {

        this.snapshotGroupNumNot = snapshotGroupNumNot;
        return this;
    }

    /**
     * Get snapshotGroupNumNot
     *
     * @return snapshotGroupNumNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getSnapshotGroupNumNot() {
        return snapshotGroupNumNot;
    }

    public void setSnapshotGroupNumNot(Integer snapshotGroupNumNot) {
        this.snapshotGroupNumNot = snapshotGroupNumNot;
    }

    public SnapshotPlanWhereInput snapshotGroupNumNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT_GROUP_NUM_NOT);
        return this;
    }

    public SnapshotPlanWhereInput snapshotGroupNumNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SNAPSHOT_GROUP_NUM_NOT);
        return this;
    }

    public void setSnapshotGroupNumNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT_GROUP_NUM_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SNAPSHOT_GROUP_NUM_NOT);
        }
    }

    public boolean getSnapshotGroupNumNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SNAPSHOT_GROUP_NUM_NOT);
    }

    public SnapshotPlanWhereInput snapshotGroupNumNotIn(List<Integer> snapshotGroupNumNotIn) {

        this.snapshotGroupNumNotIn = snapshotGroupNumNotIn;
        return this;
    }

    public SnapshotPlanWhereInput addSnapshotGroupNumNotInItem(Integer snapshotGroupNumNotInItem) {
        if (this.snapshotGroupNumNotIn == null) {
            this.snapshotGroupNumNotIn = new ArrayList<Integer>();
        }
        this.snapshotGroupNumNotIn.add(snapshotGroupNumNotInItem);
        return this;
    }

    /**
     * Get snapshotGroupNumNotIn
     *
     * @return snapshotGroupNumNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getSnapshotGroupNumNotIn() {
        return snapshotGroupNumNotIn;
    }

    public void setSnapshotGroupNumNotIn(List<Integer> snapshotGroupNumNotIn) {
        this.snapshotGroupNumNotIn = snapshotGroupNumNotIn;
    }

    public SnapshotPlanWhereInput snapshotGroupNumNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT_GROUP_NUM_NOT_IN);
        return this;
    }

    public SnapshotPlanWhereInput snapshotGroupNumNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SNAPSHOT_GROUP_NUM_NOT_IN);
        return this;
    }

    public void setSnapshotGroupNumNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SNAPSHOT_GROUP_NUM_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SNAPSHOT_GROUP_NUM_NOT_IN);
        }
    }

    public boolean getSnapshotGroupNumNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SNAPSHOT_GROUP_NUM_NOT_IN);
    }

    public SnapshotPlanWhereInput startTime(String startTime) {

        this.startTime = startTime;
        return this;
    }

    /**
     * Get startTime
     *
     * @return startTime
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public SnapshotPlanWhereInput startTime_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_START_TIME);
        return this;
    }

    public SnapshotPlanWhereInput startTime_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_START_TIME);
        return this;
    }

    public void setStartTime_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_START_TIME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_START_TIME);
        }
    }

    public boolean getStartTime_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_START_TIME);
    }

    public SnapshotPlanWhereInput startTimeGt(String startTimeGt) {

        this.startTimeGt = startTimeGt;
        return this;
    }

    /**
     * Get startTimeGt
     *
     * @return startTimeGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getStartTimeGt() {
        return startTimeGt;
    }

    public void setStartTimeGt(String startTimeGt) {
        this.startTimeGt = startTimeGt;
    }

    public SnapshotPlanWhereInput startTimeGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_START_TIME_GT);
        return this;
    }

    public SnapshotPlanWhereInput startTimeGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_START_TIME_GT);
        return this;
    }

    public void setStartTimeGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_START_TIME_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_START_TIME_GT);
        }
    }

    public boolean getStartTimeGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_START_TIME_GT);
    }

    public SnapshotPlanWhereInput startTimeGte(String startTimeGte) {

        this.startTimeGte = startTimeGte;
        return this;
    }

    /**
     * Get startTimeGte
     *
     * @return startTimeGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getStartTimeGte() {
        return startTimeGte;
    }

    public void setStartTimeGte(String startTimeGte) {
        this.startTimeGte = startTimeGte;
    }

    public SnapshotPlanWhereInput startTimeGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_START_TIME_GTE);
        return this;
    }

    public SnapshotPlanWhereInput startTimeGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_START_TIME_GTE);
        return this;
    }

    public void setStartTimeGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_START_TIME_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_START_TIME_GTE);
        }
    }

    public boolean getStartTimeGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_START_TIME_GTE);
    }

    public SnapshotPlanWhereInput startTimeIn(List<String> startTimeIn) {

        this.startTimeIn = startTimeIn;
        return this;
    }

    public SnapshotPlanWhereInput addStartTimeInItem(String startTimeInItem) {
        if (this.startTimeIn == null) {
            this.startTimeIn = new ArrayList<String>();
        }
        this.startTimeIn.add(startTimeInItem);
        return this;
    }

    /**
     * Get startTimeIn
     *
     * @return startTimeIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getStartTimeIn() {
        return startTimeIn;
    }

    public void setStartTimeIn(List<String> startTimeIn) {
        this.startTimeIn = startTimeIn;
    }

    public SnapshotPlanWhereInput startTimeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_START_TIME_IN);
        return this;
    }

    public SnapshotPlanWhereInput startTimeIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_START_TIME_IN);
        return this;
    }

    public void setStartTimeIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_START_TIME_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_START_TIME_IN);
        }
    }

    public boolean getStartTimeIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_START_TIME_IN);
    }

    public SnapshotPlanWhereInput startTimeLt(String startTimeLt) {

        this.startTimeLt = startTimeLt;
        return this;
    }

    /**
     * Get startTimeLt
     *
     * @return startTimeLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getStartTimeLt() {
        return startTimeLt;
    }

    public void setStartTimeLt(String startTimeLt) {
        this.startTimeLt = startTimeLt;
    }

    public SnapshotPlanWhereInput startTimeLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_START_TIME_LT);
        return this;
    }

    public SnapshotPlanWhereInput startTimeLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_START_TIME_LT);
        return this;
    }

    public void setStartTimeLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_START_TIME_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_START_TIME_LT);
        }
    }

    public boolean getStartTimeLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_START_TIME_LT);
    }

    public SnapshotPlanWhereInput startTimeLte(String startTimeLte) {

        this.startTimeLte = startTimeLte;
        return this;
    }

    /**
     * Get startTimeLte
     *
     * @return startTimeLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getStartTimeLte() {
        return startTimeLte;
    }

    public void setStartTimeLte(String startTimeLte) {
        this.startTimeLte = startTimeLte;
    }

    public SnapshotPlanWhereInput startTimeLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_START_TIME_LTE);
        return this;
    }

    public SnapshotPlanWhereInput startTimeLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_START_TIME_LTE);
        return this;
    }

    public void setStartTimeLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_START_TIME_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_START_TIME_LTE);
        }
    }

    public boolean getStartTimeLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_START_TIME_LTE);
    }

    public SnapshotPlanWhereInput startTimeNot(String startTimeNot) {

        this.startTimeNot = startTimeNot;
        return this;
    }

    /**
     * Get startTimeNot
     *
     * @return startTimeNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getStartTimeNot() {
        return startTimeNot;
    }

    public void setStartTimeNot(String startTimeNot) {
        this.startTimeNot = startTimeNot;
    }

    public SnapshotPlanWhereInput startTimeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_START_TIME_NOT);
        return this;
    }

    public SnapshotPlanWhereInput startTimeNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_START_TIME_NOT);
        return this;
    }

    public void setStartTimeNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_START_TIME_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_START_TIME_NOT);
        }
    }

    public boolean getStartTimeNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_START_TIME_NOT);
    }

    public SnapshotPlanWhereInput startTimeNotIn(List<String> startTimeNotIn) {

        this.startTimeNotIn = startTimeNotIn;
        return this;
    }

    public SnapshotPlanWhereInput addStartTimeNotInItem(String startTimeNotInItem) {
        if (this.startTimeNotIn == null) {
            this.startTimeNotIn = new ArrayList<String>();
        }
        this.startTimeNotIn.add(startTimeNotInItem);
        return this;
    }

    /**
     * Get startTimeNotIn
     *
     * @return startTimeNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getStartTimeNotIn() {
        return startTimeNotIn;
    }

    public void setStartTimeNotIn(List<String> startTimeNotIn) {
        this.startTimeNotIn = startTimeNotIn;
    }

    public SnapshotPlanWhereInput startTimeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_START_TIME_NOT_IN);
        return this;
    }

    public SnapshotPlanWhereInput startTimeNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_START_TIME_NOT_IN);
        return this;
    }

    public void setStartTimeNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_START_TIME_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_START_TIME_NOT_IN);
        }
    }

    public boolean getStartTimeNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_START_TIME_NOT_IN);
    }

    public SnapshotPlanWhereInput status(SnapshotPlanStatus status) {

        this.status = status;
        return this;
    }

    /**
     * Get status
     *
     * @return status
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public SnapshotPlanStatus getStatus() {
        return status;
    }

    public void setStatus(SnapshotPlanStatus status) {
        this.status = status;
    }

    public SnapshotPlanWhereInput status_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATUS);
        return this;
    }

    public SnapshotPlanWhereInput status_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STATUS);
        return this;
    }

    public void setStatus_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STATUS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STATUS);
        }
    }

    public boolean getStatus_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STATUS);
    }

    public SnapshotPlanWhereInput statusIn(List<SnapshotPlanStatus> statusIn) {

        this.statusIn = statusIn;
        return this;
    }

    public SnapshotPlanWhereInput addStatusInItem(SnapshotPlanStatus statusInItem) {
        if (this.statusIn == null) {
            this.statusIn = new ArrayList<SnapshotPlanStatus>();
        }
        this.statusIn.add(statusInItem);
        return this;
    }

    /**
     * Get statusIn
     *
     * @return statusIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<SnapshotPlanStatus> getStatusIn() {
        return statusIn;
    }

    public void setStatusIn(List<SnapshotPlanStatus> statusIn) {
        this.statusIn = statusIn;
    }

    public SnapshotPlanWhereInput statusIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATUS_IN);
        return this;
    }

    public SnapshotPlanWhereInput statusIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STATUS_IN);
        return this;
    }

    public void setStatusIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STATUS_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STATUS_IN);
        }
    }

    public boolean getStatusIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STATUS_IN);
    }

    public SnapshotPlanWhereInput statusNot(SnapshotPlanStatus statusNot) {

        this.statusNot = statusNot;
        return this;
    }

    /**
     * Get statusNot
     *
     * @return statusNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public SnapshotPlanStatus getStatusNot() {
        return statusNot;
    }

    public void setStatusNot(SnapshotPlanStatus statusNot) {
        this.statusNot = statusNot;
    }

    public SnapshotPlanWhereInput statusNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATUS_NOT);
        return this;
    }

    public SnapshotPlanWhereInput statusNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STATUS_NOT);
        return this;
    }

    public void setStatusNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STATUS_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STATUS_NOT);
        }
    }

    public boolean getStatusNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STATUS_NOT);
    }

    public SnapshotPlanWhereInput statusNotIn(List<SnapshotPlanStatus> statusNotIn) {

        this.statusNotIn = statusNotIn;
        return this;
    }

    public SnapshotPlanWhereInput addStatusNotInItem(SnapshotPlanStatus statusNotInItem) {
        if (this.statusNotIn == null) {
            this.statusNotIn = new ArrayList<SnapshotPlanStatus>();
        }
        this.statusNotIn.add(statusNotInItem);
        return this;
    }

    /**
     * Get statusNotIn
     *
     * @return statusNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<SnapshotPlanStatus> getStatusNotIn() {
        return statusNotIn;
    }

    public void setStatusNotIn(List<SnapshotPlanStatus> statusNotIn) {
        this.statusNotIn = statusNotIn;
    }

    public SnapshotPlanWhereInput statusNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATUS_NOT_IN);
        return this;
    }

    public SnapshotPlanWhereInput statusNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_STATUS_NOT_IN);
        return this;
    }

    public void setStatusNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_STATUS_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_STATUS_NOT_IN);
        }
    }

    public boolean getStatusNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_STATUS_NOT_IN);
    }

    public SnapshotPlanWhereInput vmsEvery(VmWhereInput vmsEvery) {

        this.vmsEvery = vmsEvery;
        return this;
    }

    /**
     * Get vmsEvery
     *
     * @return vmsEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmWhereInput getVmsEvery() {
        return vmsEvery;
    }

    public void setVmsEvery(VmWhereInput vmsEvery) {
        this.vmsEvery = vmsEvery;
    }

    public SnapshotPlanWhereInput vmsEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VMS_EVERY);
        return this;
    }

    public SnapshotPlanWhereInput vmsEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VMS_EVERY);
        return this;
    }

    public void setVmsEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VMS_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VMS_EVERY);
        }
    }

    public boolean getVmsEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VMS_EVERY);
    }

    public SnapshotPlanWhereInput vmsNone(VmWhereInput vmsNone) {

        this.vmsNone = vmsNone;
        return this;
    }

    /**
     * Get vmsNone
     *
     * @return vmsNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmWhereInput getVmsNone() {
        return vmsNone;
    }

    public void setVmsNone(VmWhereInput vmsNone) {
        this.vmsNone = vmsNone;
    }

    public SnapshotPlanWhereInput vmsNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VMS_NONE);
        return this;
    }

    public SnapshotPlanWhereInput vmsNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VMS_NONE);
        return this;
    }

    public void setVmsNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VMS_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VMS_NONE);
        }
    }

    public boolean getVmsNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VMS_NONE);
    }

    public SnapshotPlanWhereInput vmsSome(VmWhereInput vmsSome) {

        this.vmsSome = vmsSome;
        return this;
    }

    /**
     * Get vmsSome
     *
     * @return vmsSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmWhereInput getVmsSome() {
        return vmsSome;
    }

    public void setVmsSome(VmWhereInput vmsSome) {
        this.vmsSome = vmsSome;
    }

    public SnapshotPlanWhereInput vmsSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VMS_SOME);
        return this;
    }

    public SnapshotPlanWhereInput vmsSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VMS_SOME);
        return this;
    }

    public void setVmsSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VMS_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VMS_SOME);
        }
    }

    public boolean getVmsSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VMS_SOME);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SnapshotPlanWhereInput snapshotPlanWhereInput = (SnapshotPlanWhereInput) o;
        return Objects.equals(this.AND, snapshotPlanWhereInput.AND)
                && Objects.equals(this.NOT, snapshotPlanWhereInput.NOT)
                && Objects.equals(this.OR, snapshotPlanWhereInput.OR)
                && Objects.equals(this.autoDeleteNum, snapshotPlanWhereInput.autoDeleteNum)
                && Objects.equals(this.autoDeleteNumGt, snapshotPlanWhereInput.autoDeleteNumGt)
                && Objects.equals(this.autoDeleteNumGte, snapshotPlanWhereInput.autoDeleteNumGte)
                && Objects.equals(this.autoDeleteNumIn, snapshotPlanWhereInput.autoDeleteNumIn)
                && Objects.equals(this.autoDeleteNumLt, snapshotPlanWhereInput.autoDeleteNumLt)
                && Objects.equals(this.autoDeleteNumLte, snapshotPlanWhereInput.autoDeleteNumLte)
                && Objects.equals(this.autoDeleteNumNot, snapshotPlanWhereInput.autoDeleteNumNot)
                && Objects.equals(
                        this.autoDeleteNumNotIn, snapshotPlanWhereInput.autoDeleteNumNotIn)
                && Objects.equals(this.autoExecuteNum, snapshotPlanWhereInput.autoExecuteNum)
                && Objects.equals(this.autoExecuteNumGt, snapshotPlanWhereInput.autoExecuteNumGt)
                && Objects.equals(this.autoExecuteNumGte, snapshotPlanWhereInput.autoExecuteNumGte)
                && Objects.equals(this.autoExecuteNumIn, snapshotPlanWhereInput.autoExecuteNumIn)
                && Objects.equals(this.autoExecuteNumLt, snapshotPlanWhereInput.autoExecuteNumLt)
                && Objects.equals(this.autoExecuteNumLte, snapshotPlanWhereInput.autoExecuteNumLte)
                && Objects.equals(this.autoExecuteNumNot, snapshotPlanWhereInput.autoExecuteNumNot)
                && Objects.equals(
                        this.autoExecuteNumNotIn, snapshotPlanWhereInput.autoExecuteNumNotIn)
                && Objects.equals(this.cluster, snapshotPlanWhereInput.cluster)
                && Objects.equals(this.description, snapshotPlanWhereInput.description)
                && Objects.equals(
                        this.descriptionContains, snapshotPlanWhereInput.descriptionContains)
                && Objects.equals(
                        this.descriptionEndsWith, snapshotPlanWhereInput.descriptionEndsWith)
                && Objects.equals(this.descriptionGt, snapshotPlanWhereInput.descriptionGt)
                && Objects.equals(this.descriptionGte, snapshotPlanWhereInput.descriptionGte)
                && Objects.equals(this.descriptionIn, snapshotPlanWhereInput.descriptionIn)
                && Objects.equals(this.descriptionLt, snapshotPlanWhereInput.descriptionLt)
                && Objects.equals(this.descriptionLte, snapshotPlanWhereInput.descriptionLte)
                && Objects.equals(this.descriptionNot, snapshotPlanWhereInput.descriptionNot)
                && Objects.equals(
                        this.descriptionNotContains, snapshotPlanWhereInput.descriptionNotContains)
                && Objects.equals(
                        this.descriptionNotEndsWith, snapshotPlanWhereInput.descriptionNotEndsWith)
                && Objects.equals(this.descriptionNotIn, snapshotPlanWhereInput.descriptionNotIn)
                && Objects.equals(
                        this.descriptionNotStartsWith,
                        snapshotPlanWhereInput.descriptionNotStartsWith)
                && Objects.equals(
                        this.descriptionStartsWith, snapshotPlanWhereInput.descriptionStartsWith)
                && Objects.equals(this.endTime, snapshotPlanWhereInput.endTime)
                && Objects.equals(this.endTimeGt, snapshotPlanWhereInput.endTimeGt)
                && Objects.equals(this.endTimeGte, snapshotPlanWhereInput.endTimeGte)
                && Objects.equals(this.endTimeIn, snapshotPlanWhereInput.endTimeIn)
                && Objects.equals(this.endTimeLt, snapshotPlanWhereInput.endTimeLt)
                && Objects.equals(this.endTimeLte, snapshotPlanWhereInput.endTimeLte)
                && Objects.equals(this.endTimeNot, snapshotPlanWhereInput.endTimeNot)
                && Objects.equals(this.endTimeNotIn, snapshotPlanWhereInput.endTimeNotIn)
                && Objects.equals(this.entityAsyncStatus, snapshotPlanWhereInput.entityAsyncStatus)
                && Objects.equals(
                        this.entityAsyncStatusIn, snapshotPlanWhereInput.entityAsyncStatusIn)
                && Objects.equals(
                        this.entityAsyncStatusNot, snapshotPlanWhereInput.entityAsyncStatusNot)
                && Objects.equals(
                        this.entityAsyncStatusNotIn, snapshotPlanWhereInput.entityAsyncStatusNotIn)
                && Objects.equals(this.executePlanType, snapshotPlanWhereInput.executePlanType)
                && Objects.equals(this.executePlanTypeIn, snapshotPlanWhereInput.executePlanTypeIn)
                && Objects.equals(
                        this.executePlanTypeNot, snapshotPlanWhereInput.executePlanTypeNot)
                && Objects.equals(
                        this.executePlanTypeNotIn, snapshotPlanWhereInput.executePlanTypeNotIn)
                && Objects.equals(
                        this.executionTasksEvery, snapshotPlanWhereInput.executionTasksEvery)
                && Objects.equals(
                        this.executionTasksNone, snapshotPlanWhereInput.executionTasksNone)
                && Objects.equals(
                        this.executionTasksSome, snapshotPlanWhereInput.executionTasksSome)
                && Objects.equals(this.healthy, snapshotPlanWhereInput.healthy)
                && Objects.equals(this.healthyNot, snapshotPlanWhereInput.healthyNot)
                && Objects.equals(this.id, snapshotPlanWhereInput.id)
                && Objects.equals(this.idContains, snapshotPlanWhereInput.idContains)
                && Objects.equals(this.idEndsWith, snapshotPlanWhereInput.idEndsWith)
                && Objects.equals(this.idGt, snapshotPlanWhereInput.idGt)
                && Objects.equals(this.idGte, snapshotPlanWhereInput.idGte)
                && Objects.equals(this.idIn, snapshotPlanWhereInput.idIn)
                && Objects.equals(this.idLt, snapshotPlanWhereInput.idLt)
                && Objects.equals(this.idLte, snapshotPlanWhereInput.idLte)
                && Objects.equals(this.idNot, snapshotPlanWhereInput.idNot)
                && Objects.equals(this.idNotContains, snapshotPlanWhereInput.idNotContains)
                && Objects.equals(this.idNotEndsWith, snapshotPlanWhereInput.idNotEndsWith)
                && Objects.equals(this.idNotIn, snapshotPlanWhereInput.idNotIn)
                && Objects.equals(this.idNotStartsWith, snapshotPlanWhereInput.idNotStartsWith)
                && Objects.equals(this.idStartsWith, snapshotPlanWhereInput.idStartsWith)
                && Objects.equals(
                        this.lastExecuteEndTime, snapshotPlanWhereInput.lastExecuteEndTime)
                && Objects.equals(
                        this.lastExecuteEndTimeGt, snapshotPlanWhereInput.lastExecuteEndTimeGt)
                && Objects.equals(
                        this.lastExecuteEndTimeGte, snapshotPlanWhereInput.lastExecuteEndTimeGte)
                && Objects.equals(
                        this.lastExecuteEndTimeIn, snapshotPlanWhereInput.lastExecuteEndTimeIn)
                && Objects.equals(
                        this.lastExecuteEndTimeLt, snapshotPlanWhereInput.lastExecuteEndTimeLt)
                && Objects.equals(
                        this.lastExecuteEndTimeLte, snapshotPlanWhereInput.lastExecuteEndTimeLte)
                && Objects.equals(
                        this.lastExecuteEndTimeNot, snapshotPlanWhereInput.lastExecuteEndTimeNot)
                && Objects.equals(
                        this.lastExecuteEndTimeNotIn,
                        snapshotPlanWhereInput.lastExecuteEndTimeNotIn)
                && Objects.equals(this.lastExecuteStatus, snapshotPlanWhereInput.lastExecuteStatus)
                && Objects.equals(
                        this.lastExecuteStatusIn, snapshotPlanWhereInput.lastExecuteStatusIn)
                && Objects.equals(
                        this.lastExecuteStatusNot, snapshotPlanWhereInput.lastExecuteStatusNot)
                && Objects.equals(
                        this.lastExecuteStatusNotIn, snapshotPlanWhereInput.lastExecuteStatusNotIn)
                && Objects.equals(this.lastExecuteTime, snapshotPlanWhereInput.lastExecuteTime)
                && Objects.equals(this.lastExecuteTimeGt, snapshotPlanWhereInput.lastExecuteTimeGt)
                && Objects.equals(
                        this.lastExecuteTimeGte, snapshotPlanWhereInput.lastExecuteTimeGte)
                && Objects.equals(this.lastExecuteTimeIn, snapshotPlanWhereInput.lastExecuteTimeIn)
                && Objects.equals(this.lastExecuteTimeLt, snapshotPlanWhereInput.lastExecuteTimeLt)
                && Objects.equals(
                        this.lastExecuteTimeLte, snapshotPlanWhereInput.lastExecuteTimeLte)
                && Objects.equals(
                        this.lastExecuteTimeNot, snapshotPlanWhereInput.lastExecuteTimeNot)
                && Objects.equals(
                        this.lastExecuteTimeNotIn, snapshotPlanWhereInput.lastExecuteTimeNotIn)
                && Objects.equals(this.localId, snapshotPlanWhereInput.localId)
                && Objects.equals(this.localIdContains, snapshotPlanWhereInput.localIdContains)
                && Objects.equals(this.localIdEndsWith, snapshotPlanWhereInput.localIdEndsWith)
                && Objects.equals(this.localIdGt, snapshotPlanWhereInput.localIdGt)
                && Objects.equals(this.localIdGte, snapshotPlanWhereInput.localIdGte)
                && Objects.equals(this.localIdIn, snapshotPlanWhereInput.localIdIn)
                && Objects.equals(this.localIdLt, snapshotPlanWhereInput.localIdLt)
                && Objects.equals(this.localIdLte, snapshotPlanWhereInput.localIdLte)
                && Objects.equals(this.localIdNot, snapshotPlanWhereInput.localIdNot)
                && Objects.equals(
                        this.localIdNotContains, snapshotPlanWhereInput.localIdNotContains)
                && Objects.equals(
                        this.localIdNotEndsWith, snapshotPlanWhereInput.localIdNotEndsWith)
                && Objects.equals(this.localIdNotIn, snapshotPlanWhereInput.localIdNotIn)
                && Objects.equals(
                        this.localIdNotStartsWith, snapshotPlanWhereInput.localIdNotStartsWith)
                && Objects.equals(this.localIdStartsWith, snapshotPlanWhereInput.localIdStartsWith)
                && Objects.equals(this.logicalSizeBytes, snapshotPlanWhereInput.logicalSizeBytes)
                && Objects.equals(
                        this.logicalSizeBytesGt, snapshotPlanWhereInput.logicalSizeBytesGt)
                && Objects.equals(
                        this.logicalSizeBytesGte, snapshotPlanWhereInput.logicalSizeBytesGte)
                && Objects.equals(
                        this.logicalSizeBytesIn, snapshotPlanWhereInput.logicalSizeBytesIn)
                && Objects.equals(
                        this.logicalSizeBytesLt, snapshotPlanWhereInput.logicalSizeBytesLt)
                && Objects.equals(
                        this.logicalSizeBytesLte, snapshotPlanWhereInput.logicalSizeBytesLte)
                && Objects.equals(
                        this.logicalSizeBytesNot, snapshotPlanWhereInput.logicalSizeBytesNot)
                && Objects.equals(
                        this.logicalSizeBytesNotIn, snapshotPlanWhereInput.logicalSizeBytesNotIn)
                && Objects.equals(this.manualDeleteNum, snapshotPlanWhereInput.manualDeleteNum)
                && Objects.equals(this.manualDeleteNumGt, snapshotPlanWhereInput.manualDeleteNumGt)
                && Objects.equals(
                        this.manualDeleteNumGte, snapshotPlanWhereInput.manualDeleteNumGte)
                && Objects.equals(this.manualDeleteNumIn, snapshotPlanWhereInput.manualDeleteNumIn)
                && Objects.equals(this.manualDeleteNumLt, snapshotPlanWhereInput.manualDeleteNumLt)
                && Objects.equals(
                        this.manualDeleteNumLte, snapshotPlanWhereInput.manualDeleteNumLte)
                && Objects.equals(
                        this.manualDeleteNumNot, snapshotPlanWhereInput.manualDeleteNumNot)
                && Objects.equals(
                        this.manualDeleteNumNotIn, snapshotPlanWhereInput.manualDeleteNumNotIn)
                && Objects.equals(this.manualExecuteNum, snapshotPlanWhereInput.manualExecuteNum)
                && Objects.equals(
                        this.manualExecuteNumGt, snapshotPlanWhereInput.manualExecuteNumGt)
                && Objects.equals(
                        this.manualExecuteNumGte, snapshotPlanWhereInput.manualExecuteNumGte)
                && Objects.equals(
                        this.manualExecuteNumIn, snapshotPlanWhereInput.manualExecuteNumIn)
                && Objects.equals(
                        this.manualExecuteNumLt, snapshotPlanWhereInput.manualExecuteNumLt)
                && Objects.equals(
                        this.manualExecuteNumLte, snapshotPlanWhereInput.manualExecuteNumLte)
                && Objects.equals(
                        this.manualExecuteNumNot, snapshotPlanWhereInput.manualExecuteNumNot)
                && Objects.equals(
                        this.manualExecuteNumNotIn, snapshotPlanWhereInput.manualExecuteNumNotIn)
                && Objects.equals(this.mirror, snapshotPlanWhereInput.mirror)
                && Objects.equals(this.mirrorNot, snapshotPlanWhereInput.mirrorNot)
                && Objects.equals(this.name, snapshotPlanWhereInput.name)
                && Objects.equals(this.nameContains, snapshotPlanWhereInput.nameContains)
                && Objects.equals(this.nameEndsWith, snapshotPlanWhereInput.nameEndsWith)
                && Objects.equals(this.nameGt, snapshotPlanWhereInput.nameGt)
                && Objects.equals(this.nameGte, snapshotPlanWhereInput.nameGte)
                && Objects.equals(this.nameIn, snapshotPlanWhereInput.nameIn)
                && Objects.equals(this.nameLt, snapshotPlanWhereInput.nameLt)
                && Objects.equals(this.nameLte, snapshotPlanWhereInput.nameLte)
                && Objects.equals(this.nameNot, snapshotPlanWhereInput.nameNot)
                && Objects.equals(this.nameNotContains, snapshotPlanWhereInput.nameNotContains)
                && Objects.equals(this.nameNotEndsWith, snapshotPlanWhereInput.nameNotEndsWith)
                && Objects.equals(this.nameNotIn, snapshotPlanWhereInput.nameNotIn)
                && Objects.equals(this.nameNotStartsWith, snapshotPlanWhereInput.nameNotStartsWith)
                && Objects.equals(this.nameStartsWith, snapshotPlanWhereInput.nameStartsWith)
                && Objects.equals(this.nextExecuteTime, snapshotPlanWhereInput.nextExecuteTime)
                && Objects.equals(this.nextExecuteTimeGt, snapshotPlanWhereInput.nextExecuteTimeGt)
                && Objects.equals(
                        this.nextExecuteTimeGte, snapshotPlanWhereInput.nextExecuteTimeGte)
                && Objects.equals(this.nextExecuteTimeIn, snapshotPlanWhereInput.nextExecuteTimeIn)
                && Objects.equals(this.nextExecuteTimeLt, snapshotPlanWhereInput.nextExecuteTimeLt)
                && Objects.equals(
                        this.nextExecuteTimeLte, snapshotPlanWhereInput.nextExecuteTimeLte)
                && Objects.equals(
                        this.nextExecuteTimeNot, snapshotPlanWhereInput.nextExecuteTimeNot)
                && Objects.equals(
                        this.nextExecuteTimeNotIn, snapshotPlanWhereInput.nextExecuteTimeNotIn)
                && Objects.equals(this.objectNum, snapshotPlanWhereInput.objectNum)
                && Objects.equals(this.objectNumGt, snapshotPlanWhereInput.objectNumGt)
                && Objects.equals(this.objectNumGte, snapshotPlanWhereInput.objectNumGte)
                && Objects.equals(this.objectNumIn, snapshotPlanWhereInput.objectNumIn)
                && Objects.equals(this.objectNumLt, snapshotPlanWhereInput.objectNumLt)
                && Objects.equals(this.objectNumLte, snapshotPlanWhereInput.objectNumLte)
                && Objects.equals(this.objectNumNot, snapshotPlanWhereInput.objectNumNot)
                && Objects.equals(this.objectNumNotIn, snapshotPlanWhereInput.objectNumNotIn)
                && Objects.equals(this.physicalSizeBytes, snapshotPlanWhereInput.physicalSizeBytes)
                && Objects.equals(
                        this.physicalSizeBytesGt, snapshotPlanWhereInput.physicalSizeBytesGt)
                && Objects.equals(
                        this.physicalSizeBytesGte, snapshotPlanWhereInput.physicalSizeBytesGte)
                && Objects.equals(
                        this.physicalSizeBytesIn, snapshotPlanWhereInput.physicalSizeBytesIn)
                && Objects.equals(
                        this.physicalSizeBytesLt, snapshotPlanWhereInput.physicalSizeBytesLt)
                && Objects.equals(
                        this.physicalSizeBytesLte, snapshotPlanWhereInput.physicalSizeBytesLte)
                && Objects.equals(
                        this.physicalSizeBytesNot, snapshotPlanWhereInput.physicalSizeBytesNot)
                && Objects.equals(
                        this.physicalSizeBytesNotIn, snapshotPlanWhereInput.physicalSizeBytesNotIn)
                && Objects.equals(this.remainSnapshotNum, snapshotPlanWhereInput.remainSnapshotNum)
                && Objects.equals(
                        this.remainSnapshotNumGt, snapshotPlanWhereInput.remainSnapshotNumGt)
                && Objects.equals(
                        this.remainSnapshotNumGte, snapshotPlanWhereInput.remainSnapshotNumGte)
                && Objects.equals(
                        this.remainSnapshotNumIn, snapshotPlanWhereInput.remainSnapshotNumIn)
                && Objects.equals(
                        this.remainSnapshotNumLt, snapshotPlanWhereInput.remainSnapshotNumLt)
                && Objects.equals(
                        this.remainSnapshotNumLte, snapshotPlanWhereInput.remainSnapshotNumLte)
                && Objects.equals(
                        this.remainSnapshotNumNot, snapshotPlanWhereInput.remainSnapshotNumNot)
                && Objects.equals(
                        this.remainSnapshotNumNotIn, snapshotPlanWhereInput.remainSnapshotNumNotIn)
                && Objects.equals(this.snapshotGroupNum, snapshotPlanWhereInput.snapshotGroupNum)
                && Objects.equals(
                        this.snapshotGroupNumGt, snapshotPlanWhereInput.snapshotGroupNumGt)
                && Objects.equals(
                        this.snapshotGroupNumGte, snapshotPlanWhereInput.snapshotGroupNumGte)
                && Objects.equals(
                        this.snapshotGroupNumIn, snapshotPlanWhereInput.snapshotGroupNumIn)
                && Objects.equals(
                        this.snapshotGroupNumLt, snapshotPlanWhereInput.snapshotGroupNumLt)
                && Objects.equals(
                        this.snapshotGroupNumLte, snapshotPlanWhereInput.snapshotGroupNumLte)
                && Objects.equals(
                        this.snapshotGroupNumNot, snapshotPlanWhereInput.snapshotGroupNumNot)
                && Objects.equals(
                        this.snapshotGroupNumNotIn, snapshotPlanWhereInput.snapshotGroupNumNotIn)
                && Objects.equals(this.startTime, snapshotPlanWhereInput.startTime)
                && Objects.equals(this.startTimeGt, snapshotPlanWhereInput.startTimeGt)
                && Objects.equals(this.startTimeGte, snapshotPlanWhereInput.startTimeGte)
                && Objects.equals(this.startTimeIn, snapshotPlanWhereInput.startTimeIn)
                && Objects.equals(this.startTimeLt, snapshotPlanWhereInput.startTimeLt)
                && Objects.equals(this.startTimeLte, snapshotPlanWhereInput.startTimeLte)
                && Objects.equals(this.startTimeNot, snapshotPlanWhereInput.startTimeNot)
                && Objects.equals(this.startTimeNotIn, snapshotPlanWhereInput.startTimeNotIn)
                && Objects.equals(this.status, snapshotPlanWhereInput.status)
                && Objects.equals(this.statusIn, snapshotPlanWhereInput.statusIn)
                && Objects.equals(this.statusNot, snapshotPlanWhereInput.statusNot)
                && Objects.equals(this.statusNotIn, snapshotPlanWhereInput.statusNotIn)
                && Objects.equals(this.vmsEvery, snapshotPlanWhereInput.vmsEvery)
                && Objects.equals(this.vmsNone, snapshotPlanWhereInput.vmsNone)
                && Objects.equals(this.vmsSome, snapshotPlanWhereInput.vmsSome);
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
                autoDeleteNum,
                autoDeleteNumGt,
                autoDeleteNumGte,
                autoDeleteNumIn,
                autoDeleteNumLt,
                autoDeleteNumLte,
                autoDeleteNumNot,
                autoDeleteNumNotIn,
                autoExecuteNum,
                autoExecuteNumGt,
                autoExecuteNumGte,
                autoExecuteNumIn,
                autoExecuteNumLt,
                autoExecuteNumLte,
                autoExecuteNumNot,
                autoExecuteNumNotIn,
                cluster,
                description,
                descriptionContains,
                descriptionEndsWith,
                descriptionGt,
                descriptionGte,
                descriptionIn,
                descriptionLt,
                descriptionLte,
                descriptionNot,
                descriptionNotContains,
                descriptionNotEndsWith,
                descriptionNotIn,
                descriptionNotStartsWith,
                descriptionStartsWith,
                endTime,
                endTimeGt,
                endTimeGte,
                endTimeIn,
                endTimeLt,
                endTimeLte,
                endTimeNot,
                endTimeNotIn,
                entityAsyncStatus,
                entityAsyncStatusIn,
                entityAsyncStatusNot,
                entityAsyncStatusNotIn,
                executePlanType,
                executePlanTypeIn,
                executePlanTypeNot,
                executePlanTypeNotIn,
                executionTasksEvery,
                executionTasksNone,
                executionTasksSome,
                healthy,
                healthyNot,
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
                lastExecuteEndTime,
                lastExecuteEndTimeGt,
                lastExecuteEndTimeGte,
                lastExecuteEndTimeIn,
                lastExecuteEndTimeLt,
                lastExecuteEndTimeLte,
                lastExecuteEndTimeNot,
                lastExecuteEndTimeNotIn,
                lastExecuteStatus,
                lastExecuteStatusIn,
                lastExecuteStatusNot,
                lastExecuteStatusNotIn,
                lastExecuteTime,
                lastExecuteTimeGt,
                lastExecuteTimeGte,
                lastExecuteTimeIn,
                lastExecuteTimeLt,
                lastExecuteTimeLte,
                lastExecuteTimeNot,
                lastExecuteTimeNotIn,
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
                logicalSizeBytes,
                logicalSizeBytesGt,
                logicalSizeBytesGte,
                logicalSizeBytesIn,
                logicalSizeBytesLt,
                logicalSizeBytesLte,
                logicalSizeBytesNot,
                logicalSizeBytesNotIn,
                manualDeleteNum,
                manualDeleteNumGt,
                manualDeleteNumGte,
                manualDeleteNumIn,
                manualDeleteNumLt,
                manualDeleteNumLte,
                manualDeleteNumNot,
                manualDeleteNumNotIn,
                manualExecuteNum,
                manualExecuteNumGt,
                manualExecuteNumGte,
                manualExecuteNumIn,
                manualExecuteNumLt,
                manualExecuteNumLte,
                manualExecuteNumNot,
                manualExecuteNumNotIn,
                mirror,
                mirrorNot,
                name,
                nameContains,
                nameEndsWith,
                nameGt,
                nameGte,
                nameIn,
                nameLt,
                nameLte,
                nameNot,
                nameNotContains,
                nameNotEndsWith,
                nameNotIn,
                nameNotStartsWith,
                nameStartsWith,
                nextExecuteTime,
                nextExecuteTimeGt,
                nextExecuteTimeGte,
                nextExecuteTimeIn,
                nextExecuteTimeLt,
                nextExecuteTimeLte,
                nextExecuteTimeNot,
                nextExecuteTimeNotIn,
                objectNum,
                objectNumGt,
                objectNumGte,
                objectNumIn,
                objectNumLt,
                objectNumLte,
                objectNumNot,
                objectNumNotIn,
                physicalSizeBytes,
                physicalSizeBytesGt,
                physicalSizeBytesGte,
                physicalSizeBytesIn,
                physicalSizeBytesLt,
                physicalSizeBytesLte,
                physicalSizeBytesNot,
                physicalSizeBytesNotIn,
                remainSnapshotNum,
                remainSnapshotNumGt,
                remainSnapshotNumGte,
                remainSnapshotNumIn,
                remainSnapshotNumLt,
                remainSnapshotNumLte,
                remainSnapshotNumNot,
                remainSnapshotNumNotIn,
                snapshotGroupNum,
                snapshotGroupNumGt,
                snapshotGroupNumGte,
                snapshotGroupNumIn,
                snapshotGroupNumLt,
                snapshotGroupNumLte,
                snapshotGroupNumNot,
                snapshotGroupNumNotIn,
                startTime,
                startTimeGt,
                startTimeGte,
                startTimeIn,
                startTimeLt,
                startTimeLte,
                startTimeNot,
                startTimeNotIn,
                status,
                statusIn,
                statusNot,
                statusNotIn,
                vmsEvery,
                vmsNone,
                vmsSome);
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
        sb.append("class SnapshotPlanWhereInput {\n");
        sb.append("    AND: ").append(toIndentedString(AND)).append("\n");
        sb.append("    NOT: ").append(toIndentedString(NOT)).append("\n");
        sb.append("    OR: ").append(toIndentedString(OR)).append("\n");
        sb.append("    autoDeleteNum: ").append(toIndentedString(autoDeleteNum)).append("\n");
        sb.append("    autoDeleteNumGt: ").append(toIndentedString(autoDeleteNumGt)).append("\n");
        sb.append("    autoDeleteNumGte: ").append(toIndentedString(autoDeleteNumGte)).append("\n");
        sb.append("    autoDeleteNumIn: ").append(toIndentedString(autoDeleteNumIn)).append("\n");
        sb.append("    autoDeleteNumLt: ").append(toIndentedString(autoDeleteNumLt)).append("\n");
        sb.append("    autoDeleteNumLte: ").append(toIndentedString(autoDeleteNumLte)).append("\n");
        sb.append("    autoDeleteNumNot: ").append(toIndentedString(autoDeleteNumNot)).append("\n");
        sb.append("    autoDeleteNumNotIn: ")
                .append(toIndentedString(autoDeleteNumNotIn))
                .append("\n");
        sb.append("    autoExecuteNum: ").append(toIndentedString(autoExecuteNum)).append("\n");
        sb.append("    autoExecuteNumGt: ").append(toIndentedString(autoExecuteNumGt)).append("\n");
        sb.append("    autoExecuteNumGte: ")
                .append(toIndentedString(autoExecuteNumGte))
                .append("\n");
        sb.append("    autoExecuteNumIn: ").append(toIndentedString(autoExecuteNumIn)).append("\n");
        sb.append("    autoExecuteNumLt: ").append(toIndentedString(autoExecuteNumLt)).append("\n");
        sb.append("    autoExecuteNumLte: ")
                .append(toIndentedString(autoExecuteNumLte))
                .append("\n");
        sb.append("    autoExecuteNumNot: ")
                .append(toIndentedString(autoExecuteNumNot))
                .append("\n");
        sb.append("    autoExecuteNumNotIn: ")
                .append(toIndentedString(autoExecuteNumNotIn))
                .append("\n");
        sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    descriptionContains: ")
                .append(toIndentedString(descriptionContains))
                .append("\n");
        sb.append("    descriptionEndsWith: ")
                .append(toIndentedString(descriptionEndsWith))
                .append("\n");
        sb.append("    descriptionGt: ").append(toIndentedString(descriptionGt)).append("\n");
        sb.append("    descriptionGte: ").append(toIndentedString(descriptionGte)).append("\n");
        sb.append("    descriptionIn: ").append(toIndentedString(descriptionIn)).append("\n");
        sb.append("    descriptionLt: ").append(toIndentedString(descriptionLt)).append("\n");
        sb.append("    descriptionLte: ").append(toIndentedString(descriptionLte)).append("\n");
        sb.append("    descriptionNot: ").append(toIndentedString(descriptionNot)).append("\n");
        sb.append("    descriptionNotContains: ")
                .append(toIndentedString(descriptionNotContains))
                .append("\n");
        sb.append("    descriptionNotEndsWith: ")
                .append(toIndentedString(descriptionNotEndsWith))
                .append("\n");
        sb.append("    descriptionNotIn: ").append(toIndentedString(descriptionNotIn)).append("\n");
        sb.append("    descriptionNotStartsWith: ")
                .append(toIndentedString(descriptionNotStartsWith))
                .append("\n");
        sb.append("    descriptionStartsWith: ")
                .append(toIndentedString(descriptionStartsWith))
                .append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    endTimeGt: ").append(toIndentedString(endTimeGt)).append("\n");
        sb.append("    endTimeGte: ").append(toIndentedString(endTimeGte)).append("\n");
        sb.append("    endTimeIn: ").append(toIndentedString(endTimeIn)).append("\n");
        sb.append("    endTimeLt: ").append(toIndentedString(endTimeLt)).append("\n");
        sb.append("    endTimeLte: ").append(toIndentedString(endTimeLte)).append("\n");
        sb.append("    endTimeNot: ").append(toIndentedString(endTimeNot)).append("\n");
        sb.append("    endTimeNotIn: ").append(toIndentedString(endTimeNotIn)).append("\n");
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
        sb.append("    executePlanType: ").append(toIndentedString(executePlanType)).append("\n");
        sb.append("    executePlanTypeIn: ")
                .append(toIndentedString(executePlanTypeIn))
                .append("\n");
        sb.append("    executePlanTypeNot: ")
                .append(toIndentedString(executePlanTypeNot))
                .append("\n");
        sb.append("    executePlanTypeNotIn: ")
                .append(toIndentedString(executePlanTypeNotIn))
                .append("\n");
        sb.append("    executionTasksEvery: ")
                .append(toIndentedString(executionTasksEvery))
                .append("\n");
        sb.append("    executionTasksNone: ")
                .append(toIndentedString(executionTasksNone))
                .append("\n");
        sb.append("    executionTasksSome: ")
                .append(toIndentedString(executionTasksSome))
                .append("\n");
        sb.append("    healthy: ").append(toIndentedString(healthy)).append("\n");
        sb.append("    healthyNot: ").append(toIndentedString(healthyNot)).append("\n");
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
        sb.append("    lastExecuteEndTime: ")
                .append(toIndentedString(lastExecuteEndTime))
                .append("\n");
        sb.append("    lastExecuteEndTimeGt: ")
                .append(toIndentedString(lastExecuteEndTimeGt))
                .append("\n");
        sb.append("    lastExecuteEndTimeGte: ")
                .append(toIndentedString(lastExecuteEndTimeGte))
                .append("\n");
        sb.append("    lastExecuteEndTimeIn: ")
                .append(toIndentedString(lastExecuteEndTimeIn))
                .append("\n");
        sb.append("    lastExecuteEndTimeLt: ")
                .append(toIndentedString(lastExecuteEndTimeLt))
                .append("\n");
        sb.append("    lastExecuteEndTimeLte: ")
                .append(toIndentedString(lastExecuteEndTimeLte))
                .append("\n");
        sb.append("    lastExecuteEndTimeNot: ")
                .append(toIndentedString(lastExecuteEndTimeNot))
                .append("\n");
        sb.append("    lastExecuteEndTimeNotIn: ")
                .append(toIndentedString(lastExecuteEndTimeNotIn))
                .append("\n");
        sb.append("    lastExecuteStatus: ")
                .append(toIndentedString(lastExecuteStatus))
                .append("\n");
        sb.append("    lastExecuteStatusIn: ")
                .append(toIndentedString(lastExecuteStatusIn))
                .append("\n");
        sb.append("    lastExecuteStatusNot: ")
                .append(toIndentedString(lastExecuteStatusNot))
                .append("\n");
        sb.append("    lastExecuteStatusNotIn: ")
                .append(toIndentedString(lastExecuteStatusNotIn))
                .append("\n");
        sb.append("    lastExecuteTime: ").append(toIndentedString(lastExecuteTime)).append("\n");
        sb.append("    lastExecuteTimeGt: ")
                .append(toIndentedString(lastExecuteTimeGt))
                .append("\n");
        sb.append("    lastExecuteTimeGte: ")
                .append(toIndentedString(lastExecuteTimeGte))
                .append("\n");
        sb.append("    lastExecuteTimeIn: ")
                .append(toIndentedString(lastExecuteTimeIn))
                .append("\n");
        sb.append("    lastExecuteTimeLt: ")
                .append(toIndentedString(lastExecuteTimeLt))
                .append("\n");
        sb.append("    lastExecuteTimeLte: ")
                .append(toIndentedString(lastExecuteTimeLte))
                .append("\n");
        sb.append("    lastExecuteTimeNot: ")
                .append(toIndentedString(lastExecuteTimeNot))
                .append("\n");
        sb.append("    lastExecuteTimeNotIn: ")
                .append(toIndentedString(lastExecuteTimeNotIn))
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
        sb.append("    logicalSizeBytes: ").append(toIndentedString(logicalSizeBytes)).append("\n");
        sb.append("    logicalSizeBytesGt: ")
                .append(toIndentedString(logicalSizeBytesGt))
                .append("\n");
        sb.append("    logicalSizeBytesGte: ")
                .append(toIndentedString(logicalSizeBytesGte))
                .append("\n");
        sb.append("    logicalSizeBytesIn: ")
                .append(toIndentedString(logicalSizeBytesIn))
                .append("\n");
        sb.append("    logicalSizeBytesLt: ")
                .append(toIndentedString(logicalSizeBytesLt))
                .append("\n");
        sb.append("    logicalSizeBytesLte: ")
                .append(toIndentedString(logicalSizeBytesLte))
                .append("\n");
        sb.append("    logicalSizeBytesNot: ")
                .append(toIndentedString(logicalSizeBytesNot))
                .append("\n");
        sb.append("    logicalSizeBytesNotIn: ")
                .append(toIndentedString(logicalSizeBytesNotIn))
                .append("\n");
        sb.append("    manualDeleteNum: ").append(toIndentedString(manualDeleteNum)).append("\n");
        sb.append("    manualDeleteNumGt: ")
                .append(toIndentedString(manualDeleteNumGt))
                .append("\n");
        sb.append("    manualDeleteNumGte: ")
                .append(toIndentedString(manualDeleteNumGte))
                .append("\n");
        sb.append("    manualDeleteNumIn: ")
                .append(toIndentedString(manualDeleteNumIn))
                .append("\n");
        sb.append("    manualDeleteNumLt: ")
                .append(toIndentedString(manualDeleteNumLt))
                .append("\n");
        sb.append("    manualDeleteNumLte: ")
                .append(toIndentedString(manualDeleteNumLte))
                .append("\n");
        sb.append("    manualDeleteNumNot: ")
                .append(toIndentedString(manualDeleteNumNot))
                .append("\n");
        sb.append("    manualDeleteNumNotIn: ")
                .append(toIndentedString(manualDeleteNumNotIn))
                .append("\n");
        sb.append("    manualExecuteNum: ").append(toIndentedString(manualExecuteNum)).append("\n");
        sb.append("    manualExecuteNumGt: ")
                .append(toIndentedString(manualExecuteNumGt))
                .append("\n");
        sb.append("    manualExecuteNumGte: ")
                .append(toIndentedString(manualExecuteNumGte))
                .append("\n");
        sb.append("    manualExecuteNumIn: ")
                .append(toIndentedString(manualExecuteNumIn))
                .append("\n");
        sb.append("    manualExecuteNumLt: ")
                .append(toIndentedString(manualExecuteNumLt))
                .append("\n");
        sb.append("    manualExecuteNumLte: ")
                .append(toIndentedString(manualExecuteNumLte))
                .append("\n");
        sb.append("    manualExecuteNumNot: ")
                .append(toIndentedString(manualExecuteNumNot))
                .append("\n");
        sb.append("    manualExecuteNumNotIn: ")
                .append(toIndentedString(manualExecuteNumNotIn))
                .append("\n");
        sb.append("    mirror: ").append(toIndentedString(mirror)).append("\n");
        sb.append("    mirrorNot: ").append(toIndentedString(mirrorNot)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    nameContains: ").append(toIndentedString(nameContains)).append("\n");
        sb.append("    nameEndsWith: ").append(toIndentedString(nameEndsWith)).append("\n");
        sb.append("    nameGt: ").append(toIndentedString(nameGt)).append("\n");
        sb.append("    nameGte: ").append(toIndentedString(nameGte)).append("\n");
        sb.append("    nameIn: ").append(toIndentedString(nameIn)).append("\n");
        sb.append("    nameLt: ").append(toIndentedString(nameLt)).append("\n");
        sb.append("    nameLte: ").append(toIndentedString(nameLte)).append("\n");
        sb.append("    nameNot: ").append(toIndentedString(nameNot)).append("\n");
        sb.append("    nameNotContains: ").append(toIndentedString(nameNotContains)).append("\n");
        sb.append("    nameNotEndsWith: ").append(toIndentedString(nameNotEndsWith)).append("\n");
        sb.append("    nameNotIn: ").append(toIndentedString(nameNotIn)).append("\n");
        sb.append("    nameNotStartsWith: ")
                .append(toIndentedString(nameNotStartsWith))
                .append("\n");
        sb.append("    nameStartsWith: ").append(toIndentedString(nameStartsWith)).append("\n");
        sb.append("    nextExecuteTime: ").append(toIndentedString(nextExecuteTime)).append("\n");
        sb.append("    nextExecuteTimeGt: ")
                .append(toIndentedString(nextExecuteTimeGt))
                .append("\n");
        sb.append("    nextExecuteTimeGte: ")
                .append(toIndentedString(nextExecuteTimeGte))
                .append("\n");
        sb.append("    nextExecuteTimeIn: ")
                .append(toIndentedString(nextExecuteTimeIn))
                .append("\n");
        sb.append("    nextExecuteTimeLt: ")
                .append(toIndentedString(nextExecuteTimeLt))
                .append("\n");
        sb.append("    nextExecuteTimeLte: ")
                .append(toIndentedString(nextExecuteTimeLte))
                .append("\n");
        sb.append("    nextExecuteTimeNot: ")
                .append(toIndentedString(nextExecuteTimeNot))
                .append("\n");
        sb.append("    nextExecuteTimeNotIn: ")
                .append(toIndentedString(nextExecuteTimeNotIn))
                .append("\n");
        sb.append("    objectNum: ").append(toIndentedString(objectNum)).append("\n");
        sb.append("    objectNumGt: ").append(toIndentedString(objectNumGt)).append("\n");
        sb.append("    objectNumGte: ").append(toIndentedString(objectNumGte)).append("\n");
        sb.append("    objectNumIn: ").append(toIndentedString(objectNumIn)).append("\n");
        sb.append("    objectNumLt: ").append(toIndentedString(objectNumLt)).append("\n");
        sb.append("    objectNumLte: ").append(toIndentedString(objectNumLte)).append("\n");
        sb.append("    objectNumNot: ").append(toIndentedString(objectNumNot)).append("\n");
        sb.append("    objectNumNotIn: ").append(toIndentedString(objectNumNotIn)).append("\n");
        sb.append("    physicalSizeBytes: ")
                .append(toIndentedString(physicalSizeBytes))
                .append("\n");
        sb.append("    physicalSizeBytesGt: ")
                .append(toIndentedString(physicalSizeBytesGt))
                .append("\n");
        sb.append("    physicalSizeBytesGte: ")
                .append(toIndentedString(physicalSizeBytesGte))
                .append("\n");
        sb.append("    physicalSizeBytesIn: ")
                .append(toIndentedString(physicalSizeBytesIn))
                .append("\n");
        sb.append("    physicalSizeBytesLt: ")
                .append(toIndentedString(physicalSizeBytesLt))
                .append("\n");
        sb.append("    physicalSizeBytesLte: ")
                .append(toIndentedString(physicalSizeBytesLte))
                .append("\n");
        sb.append("    physicalSizeBytesNot: ")
                .append(toIndentedString(physicalSizeBytesNot))
                .append("\n");
        sb.append("    physicalSizeBytesNotIn: ")
                .append(toIndentedString(physicalSizeBytesNotIn))
                .append("\n");
        sb.append("    remainSnapshotNum: ")
                .append(toIndentedString(remainSnapshotNum))
                .append("\n");
        sb.append("    remainSnapshotNumGt: ")
                .append(toIndentedString(remainSnapshotNumGt))
                .append("\n");
        sb.append("    remainSnapshotNumGte: ")
                .append(toIndentedString(remainSnapshotNumGte))
                .append("\n");
        sb.append("    remainSnapshotNumIn: ")
                .append(toIndentedString(remainSnapshotNumIn))
                .append("\n");
        sb.append("    remainSnapshotNumLt: ")
                .append(toIndentedString(remainSnapshotNumLt))
                .append("\n");
        sb.append("    remainSnapshotNumLte: ")
                .append(toIndentedString(remainSnapshotNumLte))
                .append("\n");
        sb.append("    remainSnapshotNumNot: ")
                .append(toIndentedString(remainSnapshotNumNot))
                .append("\n");
        sb.append("    remainSnapshotNumNotIn: ")
                .append(toIndentedString(remainSnapshotNumNotIn))
                .append("\n");
        sb.append("    snapshotGroupNum: ").append(toIndentedString(snapshotGroupNum)).append("\n");
        sb.append("    snapshotGroupNumGt: ")
                .append(toIndentedString(snapshotGroupNumGt))
                .append("\n");
        sb.append("    snapshotGroupNumGte: ")
                .append(toIndentedString(snapshotGroupNumGte))
                .append("\n");
        sb.append("    snapshotGroupNumIn: ")
                .append(toIndentedString(snapshotGroupNumIn))
                .append("\n");
        sb.append("    snapshotGroupNumLt: ")
                .append(toIndentedString(snapshotGroupNumLt))
                .append("\n");
        sb.append("    snapshotGroupNumLte: ")
                .append(toIndentedString(snapshotGroupNumLte))
                .append("\n");
        sb.append("    snapshotGroupNumNot: ")
                .append(toIndentedString(snapshotGroupNumNot))
                .append("\n");
        sb.append("    snapshotGroupNumNotIn: ")
                .append(toIndentedString(snapshotGroupNumNotIn))
                .append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    startTimeGt: ").append(toIndentedString(startTimeGt)).append("\n");
        sb.append("    startTimeGte: ").append(toIndentedString(startTimeGte)).append("\n");
        sb.append("    startTimeIn: ").append(toIndentedString(startTimeIn)).append("\n");
        sb.append("    startTimeLt: ").append(toIndentedString(startTimeLt)).append("\n");
        sb.append("    startTimeLte: ").append(toIndentedString(startTimeLte)).append("\n");
        sb.append("    startTimeNot: ").append(toIndentedString(startTimeNot)).append("\n");
        sb.append("    startTimeNotIn: ").append(toIndentedString(startTimeNotIn)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    statusIn: ").append(toIndentedString(statusIn)).append("\n");
        sb.append("    statusNot: ").append(toIndentedString(statusNot)).append("\n");
        sb.append("    statusNotIn: ").append(toIndentedString(statusNotIn)).append("\n");
        sb.append("    vmsEvery: ").append(toIndentedString(vmsEvery)).append("\n");
        sb.append("    vmsNone: ").append(toIndentedString(vmsNone)).append("\n");
        sb.append("    vmsSome: ").append(toIndentedString(vmsSome)).append("\n");
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

package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** ReplicationServiceWhereInput */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class ReplicationServiceWhereInput
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_A_N_D = "AND";

    @SerializedName(SERIALIZED_NAME_A_N_D)
    private List<ReplicationServiceWhereInput> AND = null;

    public static final String SERIALIZED_NAME_N_O_T = "NOT";

    @SerializedName(SERIALIZED_NAME_N_O_T)
    private List<ReplicationServiceWhereInput> NOT = null;

    public static final String SERIALIZED_NAME_O_R = "OR";

    @SerializedName(SERIALIZED_NAME_O_R)
    private List<ReplicationServiceWhereInput> OR = null;

    public static final String SERIALIZED_NAME_APPLICATION = "application";

    @SerializedName(SERIALIZED_NAME_APPLICATION)
    private CloudTowerApplicationWhereInput application;

    public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";

    @SerializedName(SERIALIZED_NAME_CREATED_AT)
    private String createdAt;

    public static final String SERIALIZED_NAME_CREATED_AT_GT = "createdAt_gt";

    @SerializedName(SERIALIZED_NAME_CREATED_AT_GT)
    private String createdAtGt;

    public static final String SERIALIZED_NAME_CREATED_AT_GTE = "createdAt_gte";

    @SerializedName(SERIALIZED_NAME_CREATED_AT_GTE)
    private String createdAtGte;

    public static final String SERIALIZED_NAME_CREATED_AT_IN = "createdAt_in";

    @SerializedName(SERIALIZED_NAME_CREATED_AT_IN)
    private List<String> createdAtIn = null;

    public static final String SERIALIZED_NAME_CREATED_AT_LT = "createdAt_lt";

    @SerializedName(SERIALIZED_NAME_CREATED_AT_LT)
    private String createdAtLt;

    public static final String SERIALIZED_NAME_CREATED_AT_LTE = "createdAt_lte";

    @SerializedName(SERIALIZED_NAME_CREATED_AT_LTE)
    private String createdAtLte;

    public static final String SERIALIZED_NAME_CREATED_AT_NOT = "createdAt_not";

    @SerializedName(SERIALIZED_NAME_CREATED_AT_NOT)
    private String createdAtNot;

    public static final String SERIALIZED_NAME_CREATED_AT_NOT_IN = "createdAt_not_in";

    @SerializedName(SERIALIZED_NAME_CREATED_AT_NOT_IN)
    private List<String> createdAtNotIn = null;

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

    public static final String SERIALIZED_NAME_KUBE_CONFIG = "kube_config";

    @SerializedName(SERIALIZED_NAME_KUBE_CONFIG)
    private String kubeConfig;

    public static final String SERIALIZED_NAME_KUBE_CONFIG_CONTAINS = "kube_config_contains";

    @SerializedName(SERIALIZED_NAME_KUBE_CONFIG_CONTAINS)
    private String kubeConfigContains;

    public static final String SERIALIZED_NAME_KUBE_CONFIG_ENDS_WITH = "kube_config_ends_with";

    @SerializedName(SERIALIZED_NAME_KUBE_CONFIG_ENDS_WITH)
    private String kubeConfigEndsWith;

    public static final String SERIALIZED_NAME_KUBE_CONFIG_GT = "kube_config_gt";

    @SerializedName(SERIALIZED_NAME_KUBE_CONFIG_GT)
    private String kubeConfigGt;

    public static final String SERIALIZED_NAME_KUBE_CONFIG_GTE = "kube_config_gte";

    @SerializedName(SERIALIZED_NAME_KUBE_CONFIG_GTE)
    private String kubeConfigGte;

    public static final String SERIALIZED_NAME_KUBE_CONFIG_IN = "kube_config_in";

    @SerializedName(SERIALIZED_NAME_KUBE_CONFIG_IN)
    private List<String> kubeConfigIn = null;

    public static final String SERIALIZED_NAME_KUBE_CONFIG_LT = "kube_config_lt";

    @SerializedName(SERIALIZED_NAME_KUBE_CONFIG_LT)
    private String kubeConfigLt;

    public static final String SERIALIZED_NAME_KUBE_CONFIG_LTE = "kube_config_lte";

    @SerializedName(SERIALIZED_NAME_KUBE_CONFIG_LTE)
    private String kubeConfigLte;

    public static final String SERIALIZED_NAME_KUBE_CONFIG_NOT = "kube_config_not";

    @SerializedName(SERIALIZED_NAME_KUBE_CONFIG_NOT)
    private String kubeConfigNot;

    public static final String SERIALIZED_NAME_KUBE_CONFIG_NOT_CONTAINS =
            "kube_config_not_contains";

    @SerializedName(SERIALIZED_NAME_KUBE_CONFIG_NOT_CONTAINS)
    private String kubeConfigNotContains;

    public static final String SERIALIZED_NAME_KUBE_CONFIG_NOT_ENDS_WITH =
            "kube_config_not_ends_with";

    @SerializedName(SERIALIZED_NAME_KUBE_CONFIG_NOT_ENDS_WITH)
    private String kubeConfigNotEndsWith;

    public static final String SERIALIZED_NAME_KUBE_CONFIG_NOT_IN = "kube_config_not_in";

    @SerializedName(SERIALIZED_NAME_KUBE_CONFIG_NOT_IN)
    private List<String> kubeConfigNotIn = null;

    public static final String SERIALIZED_NAME_KUBE_CONFIG_NOT_STARTS_WITH =
            "kube_config_not_starts_with";

    @SerializedName(SERIALIZED_NAME_KUBE_CONFIG_NOT_STARTS_WITH)
    private String kubeConfigNotStartsWith;

    public static final String SERIALIZED_NAME_KUBE_CONFIG_STARTS_WITH = "kube_config_starts_with";

    @SerializedName(SERIALIZED_NAME_KUBE_CONFIG_STARTS_WITH)
    private String kubeConfigStartsWith;

    public static final String SERIALIZED_NAME_MAX_FAILBACK_JOBS = "max_failback_jobs";

    @SerializedName(SERIALIZED_NAME_MAX_FAILBACK_JOBS)
    private Integer maxFailbackJobs;

    public static final String SERIALIZED_NAME_MAX_FAILBACK_JOBS_GT = "max_failback_jobs_gt";

    @SerializedName(SERIALIZED_NAME_MAX_FAILBACK_JOBS_GT)
    private Integer maxFailbackJobsGt;

    public static final String SERIALIZED_NAME_MAX_FAILBACK_JOBS_GTE = "max_failback_jobs_gte";

    @SerializedName(SERIALIZED_NAME_MAX_FAILBACK_JOBS_GTE)
    private Integer maxFailbackJobsGte;

    public static final String SERIALIZED_NAME_MAX_FAILBACK_JOBS_IN = "max_failback_jobs_in";

    @SerializedName(SERIALIZED_NAME_MAX_FAILBACK_JOBS_IN)
    private List<Integer> maxFailbackJobsIn = null;

    public static final String SERIALIZED_NAME_MAX_FAILBACK_JOBS_LT = "max_failback_jobs_lt";

    @SerializedName(SERIALIZED_NAME_MAX_FAILBACK_JOBS_LT)
    private Integer maxFailbackJobsLt;

    public static final String SERIALIZED_NAME_MAX_FAILBACK_JOBS_LTE = "max_failback_jobs_lte";

    @SerializedName(SERIALIZED_NAME_MAX_FAILBACK_JOBS_LTE)
    private Integer maxFailbackJobsLte;

    public static final String SERIALIZED_NAME_MAX_FAILBACK_JOBS_NOT = "max_failback_jobs_not";

    @SerializedName(SERIALIZED_NAME_MAX_FAILBACK_JOBS_NOT)
    private Integer maxFailbackJobsNot;

    public static final String SERIALIZED_NAME_MAX_FAILBACK_JOBS_NOT_IN =
            "max_failback_jobs_not_in";

    @SerializedName(SERIALIZED_NAME_MAX_FAILBACK_JOBS_NOT_IN)
    private List<Integer> maxFailbackJobsNotIn = null;

    public static final String SERIALIZED_NAME_MAX_FAILBACK_SPEED_LIMIT =
            "max_failback_speed_limit";

    @SerializedName(SERIALIZED_NAME_MAX_FAILBACK_SPEED_LIMIT)
    private Double maxFailbackSpeedLimit;

    public static final String SERIALIZED_NAME_MAX_FAILBACK_SPEED_LIMIT_GT =
            "max_failback_speed_limit_gt";

    @SerializedName(SERIALIZED_NAME_MAX_FAILBACK_SPEED_LIMIT_GT)
    private Double maxFailbackSpeedLimitGt;

    public static final String SERIALIZED_NAME_MAX_FAILBACK_SPEED_LIMIT_GTE =
            "max_failback_speed_limit_gte";

    @SerializedName(SERIALIZED_NAME_MAX_FAILBACK_SPEED_LIMIT_GTE)
    private Double maxFailbackSpeedLimitGte;

    public static final String SERIALIZED_NAME_MAX_FAILBACK_SPEED_LIMIT_IN =
            "max_failback_speed_limit_in";

    @SerializedName(SERIALIZED_NAME_MAX_FAILBACK_SPEED_LIMIT_IN)
    private List<Double> maxFailbackSpeedLimitIn = null;

    public static final String SERIALIZED_NAME_MAX_FAILBACK_SPEED_LIMIT_LT =
            "max_failback_speed_limit_lt";

    @SerializedName(SERIALIZED_NAME_MAX_FAILBACK_SPEED_LIMIT_LT)
    private Double maxFailbackSpeedLimitLt;

    public static final String SERIALIZED_NAME_MAX_FAILBACK_SPEED_LIMIT_LTE =
            "max_failback_speed_limit_lte";

    @SerializedName(SERIALIZED_NAME_MAX_FAILBACK_SPEED_LIMIT_LTE)
    private Double maxFailbackSpeedLimitLte;

    public static final String SERIALIZED_NAME_MAX_FAILBACK_SPEED_LIMIT_NOT =
            "max_failback_speed_limit_not";

    @SerializedName(SERIALIZED_NAME_MAX_FAILBACK_SPEED_LIMIT_NOT)
    private Double maxFailbackSpeedLimitNot;

    public static final String SERIALIZED_NAME_MAX_FAILBACK_SPEED_LIMIT_NOT_IN =
            "max_failback_speed_limit_not_in";

    @SerializedName(SERIALIZED_NAME_MAX_FAILBACK_SPEED_LIMIT_NOT_IN)
    private List<Double> maxFailbackSpeedLimitNotIn = null;

    public static final String SERIALIZED_NAME_MAX_REPLICATION_JOBS = "max_replication_jobs";

    @SerializedName(SERIALIZED_NAME_MAX_REPLICATION_JOBS)
    private Integer maxReplicationJobs;

    public static final String SERIALIZED_NAME_MAX_REPLICATION_JOBS_GT = "max_replication_jobs_gt";

    @SerializedName(SERIALIZED_NAME_MAX_REPLICATION_JOBS_GT)
    private Integer maxReplicationJobsGt;

    public static final String SERIALIZED_NAME_MAX_REPLICATION_JOBS_GTE =
            "max_replication_jobs_gte";

    @SerializedName(SERIALIZED_NAME_MAX_REPLICATION_JOBS_GTE)
    private Integer maxReplicationJobsGte;

    public static final String SERIALIZED_NAME_MAX_REPLICATION_JOBS_IN = "max_replication_jobs_in";

    @SerializedName(SERIALIZED_NAME_MAX_REPLICATION_JOBS_IN)
    private List<Integer> maxReplicationJobsIn = null;

    public static final String SERIALIZED_NAME_MAX_REPLICATION_JOBS_LT = "max_replication_jobs_lt";

    @SerializedName(SERIALIZED_NAME_MAX_REPLICATION_JOBS_LT)
    private Integer maxReplicationJobsLt;

    public static final String SERIALIZED_NAME_MAX_REPLICATION_JOBS_LTE =
            "max_replication_jobs_lte";

    @SerializedName(SERIALIZED_NAME_MAX_REPLICATION_JOBS_LTE)
    private Integer maxReplicationJobsLte;

    public static final String SERIALIZED_NAME_MAX_REPLICATION_JOBS_NOT =
            "max_replication_jobs_not";

    @SerializedName(SERIALIZED_NAME_MAX_REPLICATION_JOBS_NOT)
    private Integer maxReplicationJobsNot;

    public static final String SERIALIZED_NAME_MAX_REPLICATION_JOBS_NOT_IN =
            "max_replication_jobs_not_in";

    @SerializedName(SERIALIZED_NAME_MAX_REPLICATION_JOBS_NOT_IN)
    private List<Integer> maxReplicationJobsNotIn = null;

    public static final String SERIALIZED_NAME_MAX_REPLICATION_SPEED_LIMIT =
            "max_replication_speed_limit";

    @SerializedName(SERIALIZED_NAME_MAX_REPLICATION_SPEED_LIMIT)
    private Double maxReplicationSpeedLimit;

    public static final String SERIALIZED_NAME_MAX_REPLICATION_SPEED_LIMIT_GT =
            "max_replication_speed_limit_gt";

    @SerializedName(SERIALIZED_NAME_MAX_REPLICATION_SPEED_LIMIT_GT)
    private Double maxReplicationSpeedLimitGt;

    public static final String SERIALIZED_NAME_MAX_REPLICATION_SPEED_LIMIT_GTE =
            "max_replication_speed_limit_gte";

    @SerializedName(SERIALIZED_NAME_MAX_REPLICATION_SPEED_LIMIT_GTE)
    private Double maxReplicationSpeedLimitGte;

    public static final String SERIALIZED_NAME_MAX_REPLICATION_SPEED_LIMIT_IN =
            "max_replication_speed_limit_in";

    @SerializedName(SERIALIZED_NAME_MAX_REPLICATION_SPEED_LIMIT_IN)
    private List<Double> maxReplicationSpeedLimitIn = null;

    public static final String SERIALIZED_NAME_MAX_REPLICATION_SPEED_LIMIT_LT =
            "max_replication_speed_limit_lt";

    @SerializedName(SERIALIZED_NAME_MAX_REPLICATION_SPEED_LIMIT_LT)
    private Double maxReplicationSpeedLimitLt;

    public static final String SERIALIZED_NAME_MAX_REPLICATION_SPEED_LIMIT_LTE =
            "max_replication_speed_limit_lte";

    @SerializedName(SERIALIZED_NAME_MAX_REPLICATION_SPEED_LIMIT_LTE)
    private Double maxReplicationSpeedLimitLte;

    public static final String SERIALIZED_NAME_MAX_REPLICATION_SPEED_LIMIT_NOT =
            "max_replication_speed_limit_not";

    @SerializedName(SERIALIZED_NAME_MAX_REPLICATION_SPEED_LIMIT_NOT)
    private Double maxReplicationSpeedLimitNot;

    public static final String SERIALIZED_NAME_MAX_REPLICATION_SPEED_LIMIT_NOT_IN =
            "max_replication_speed_limit_not_in";

    @SerializedName(SERIALIZED_NAME_MAX_REPLICATION_SPEED_LIMIT_NOT_IN)
    private List<Double> maxReplicationSpeedLimitNotIn = null;

    public static final String SERIALIZED_NAME_MAX_RETRY_TIMES = "max_retry_times";

    @SerializedName(SERIALIZED_NAME_MAX_RETRY_TIMES)
    private Integer maxRetryTimes;

    public static final String SERIALIZED_NAME_MAX_RETRY_TIMES_GT = "max_retry_times_gt";

    @SerializedName(SERIALIZED_NAME_MAX_RETRY_TIMES_GT)
    private Integer maxRetryTimesGt;

    public static final String SERIALIZED_NAME_MAX_RETRY_TIMES_GTE = "max_retry_times_gte";

    @SerializedName(SERIALIZED_NAME_MAX_RETRY_TIMES_GTE)
    private Integer maxRetryTimesGte;

    public static final String SERIALIZED_NAME_MAX_RETRY_TIMES_IN = "max_retry_times_in";

    @SerializedName(SERIALIZED_NAME_MAX_RETRY_TIMES_IN)
    private List<Integer> maxRetryTimesIn = null;

    public static final String SERIALIZED_NAME_MAX_RETRY_TIMES_LT = "max_retry_times_lt";

    @SerializedName(SERIALIZED_NAME_MAX_RETRY_TIMES_LT)
    private Integer maxRetryTimesLt;

    public static final String SERIALIZED_NAME_MAX_RETRY_TIMES_LTE = "max_retry_times_lte";

    @SerializedName(SERIALIZED_NAME_MAX_RETRY_TIMES_LTE)
    private Integer maxRetryTimesLte;

    public static final String SERIALIZED_NAME_MAX_RETRY_TIMES_NOT = "max_retry_times_not";

    @SerializedName(SERIALIZED_NAME_MAX_RETRY_TIMES_NOT)
    private Integer maxRetryTimesNot;

    public static final String SERIALIZED_NAME_MAX_RETRY_TIMES_NOT_IN = "max_retry_times_not_in";

    @SerializedName(SERIALIZED_NAME_MAX_RETRY_TIMES_NOT_IN)
    private List<Integer> maxRetryTimesNotIn = null;

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

    public static final String SERIALIZED_NAME_PERMANENT_FAILOVER_EXECUTION_EVERY =
            "permanent_failover_execution_every";

    @SerializedName(SERIALIZED_NAME_PERMANENT_FAILOVER_EXECUTION_EVERY)
    private PermanentFailoverExecutionWhereInput permanentFailoverExecutionEvery;

    public static final String SERIALIZED_NAME_PERMANENT_FAILOVER_EXECUTION_NONE =
            "permanent_failover_execution_none";

    @SerializedName(SERIALIZED_NAME_PERMANENT_FAILOVER_EXECUTION_NONE)
    private PermanentFailoverExecutionWhereInput permanentFailoverExecutionNone;

    public static final String SERIALIZED_NAME_PERMANENT_FAILOVER_EXECUTION_SOME =
            "permanent_failover_execution_some";

    @SerializedName(SERIALIZED_NAME_PERMANENT_FAILOVER_EXECUTION_SOME)
    private PermanentFailoverExecutionWhereInput permanentFailoverExecutionSome;

    public static final String SERIALIZED_NAME_REPLICATION_CLUSTERS_EVERY =
            "replication_clusters_every";

    @SerializedName(SERIALIZED_NAME_REPLICATION_CLUSTERS_EVERY)
    private ClusterWhereInput replicationClustersEvery;

    public static final String SERIALIZED_NAME_REPLICATION_CLUSTERS_NONE =
            "replication_clusters_none";

    @SerializedName(SERIALIZED_NAME_REPLICATION_CLUSTERS_NONE)
    private ClusterWhereInput replicationClustersNone;

    public static final String SERIALIZED_NAME_REPLICATION_CLUSTERS_SOME =
            "replication_clusters_some";

    @SerializedName(SERIALIZED_NAME_REPLICATION_CLUSTERS_SOME)
    private ClusterWhereInput replicationClustersSome;

    public static final String SERIALIZED_NAME_REPLICATION_PLANS_EVERY = "replication_plans_every";

    @SerializedName(SERIALIZED_NAME_REPLICATION_PLANS_EVERY)
    private ReplicationPlanWhereInput replicationPlansEvery;

    public static final String SERIALIZED_NAME_REPLICATION_PLANS_NONE = "replication_plans_none";

    @SerializedName(SERIALIZED_NAME_REPLICATION_PLANS_NONE)
    private ReplicationPlanWhereInput replicationPlansNone;

    public static final String SERIALIZED_NAME_REPLICATION_PLANS_SOME = "replication_plans_some";

    @SerializedName(SERIALIZED_NAME_REPLICATION_PLANS_SOME)
    private ReplicationPlanWhereInput replicationPlansSome;

    public static final String SERIALIZED_NAME_RETRY_INTERVAL = "retry_interval";

    @SerializedName(SERIALIZED_NAME_RETRY_INTERVAL)
    private Integer retryInterval;

    public static final String SERIALIZED_NAME_RETRY_INTERVAL_GT = "retry_interval_gt";

    @SerializedName(SERIALIZED_NAME_RETRY_INTERVAL_GT)
    private Integer retryIntervalGt;

    public static final String SERIALIZED_NAME_RETRY_INTERVAL_GTE = "retry_interval_gte";

    @SerializedName(SERIALIZED_NAME_RETRY_INTERVAL_GTE)
    private Integer retryIntervalGte;

    public static final String SERIALIZED_NAME_RETRY_INTERVAL_IN = "retry_interval_in";

    @SerializedName(SERIALIZED_NAME_RETRY_INTERVAL_IN)
    private List<Integer> retryIntervalIn = null;

    public static final String SERIALIZED_NAME_RETRY_INTERVAL_LT = "retry_interval_lt";

    @SerializedName(SERIALIZED_NAME_RETRY_INTERVAL_LT)
    private Integer retryIntervalLt;

    public static final String SERIALIZED_NAME_RETRY_INTERVAL_LTE = "retry_interval_lte";

    @SerializedName(SERIALIZED_NAME_RETRY_INTERVAL_LTE)
    private Integer retryIntervalLte;

    public static final String SERIALIZED_NAME_RETRY_INTERVAL_NOT = "retry_interval_not";

    @SerializedName(SERIALIZED_NAME_RETRY_INTERVAL_NOT)
    private Integer retryIntervalNot;

    public static final String SERIALIZED_NAME_RETRY_INTERVAL_NOT_IN = "retry_interval_not_in";

    @SerializedName(SERIALIZED_NAME_RETRY_INTERVAL_NOT_IN)
    private List<Integer> retryIntervalNotIn = null;

    public static final String SERIALIZED_NAME_UPDATED_AT = "updatedAt";

    @SerializedName(SERIALIZED_NAME_UPDATED_AT)
    private String updatedAt;

    public static final String SERIALIZED_NAME_UPDATED_AT_GT = "updatedAt_gt";

    @SerializedName(SERIALIZED_NAME_UPDATED_AT_GT)
    private String updatedAtGt;

    public static final String SERIALIZED_NAME_UPDATED_AT_GTE = "updatedAt_gte";

    @SerializedName(SERIALIZED_NAME_UPDATED_AT_GTE)
    private String updatedAtGte;

    public static final String SERIALIZED_NAME_UPDATED_AT_IN = "updatedAt_in";

    @SerializedName(SERIALIZED_NAME_UPDATED_AT_IN)
    private List<String> updatedAtIn = null;

    public static final String SERIALIZED_NAME_UPDATED_AT_LT = "updatedAt_lt";

    @SerializedName(SERIALIZED_NAME_UPDATED_AT_LT)
    private String updatedAtLt;

    public static final String SERIALIZED_NAME_UPDATED_AT_LTE = "updatedAt_lte";

    @SerializedName(SERIALIZED_NAME_UPDATED_AT_LTE)
    private String updatedAtLte;

    public static final String SERIALIZED_NAME_UPDATED_AT_NOT = "updatedAt_not";

    @SerializedName(SERIALIZED_NAME_UPDATED_AT_NOT)
    private String updatedAtNot;

    public static final String SERIALIZED_NAME_UPDATED_AT_NOT_IN = "updatedAt_not_in";

    @SerializedName(SERIALIZED_NAME_UPDATED_AT_NOT_IN)
    private List<String> updatedAtNotIn = null;

    public ReplicationServiceWhereInput() {}

    public ReplicationServiceWhereInput AND(List<ReplicationServiceWhereInput> AND) {

        this.AND = AND;
        return this;
    }

    public ReplicationServiceWhereInput addANDItem(ReplicationServiceWhereInput ANDItem) {
        if (this.AND == null) {
            this.AND = new ArrayList<ReplicationServiceWhereInput>();
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
    public List<ReplicationServiceWhereInput> getAND() {
        return AND;
    }

    public void setAND(List<ReplicationServiceWhereInput> AND) {
        this.AND = AND;
    }

    public ReplicationServiceWhereInput AND_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_A_N_D);
        return this;
    }

    public ReplicationServiceWhereInput AND_ExplictlyNonNull() {
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

    public ReplicationServiceWhereInput NOT(List<ReplicationServiceWhereInput> NOT) {

        this.NOT = NOT;
        return this;
    }

    public ReplicationServiceWhereInput addNOTItem(ReplicationServiceWhereInput NOTItem) {
        if (this.NOT == null) {
            this.NOT = new ArrayList<ReplicationServiceWhereInput>();
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
    public List<ReplicationServiceWhereInput> getNOT() {
        return NOT;
    }

    public void setNOT(List<ReplicationServiceWhereInput> NOT) {
        this.NOT = NOT;
    }

    public ReplicationServiceWhereInput NOT_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_N_O_T);
        return this;
    }

    public ReplicationServiceWhereInput NOT_ExplictlyNonNull() {
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

    public ReplicationServiceWhereInput OR(List<ReplicationServiceWhereInput> OR) {

        this.OR = OR;
        return this;
    }

    public ReplicationServiceWhereInput addORItem(ReplicationServiceWhereInput ORItem) {
        if (this.OR == null) {
            this.OR = new ArrayList<ReplicationServiceWhereInput>();
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
    public List<ReplicationServiceWhereInput> getOR() {
        return OR;
    }

    public void setOR(List<ReplicationServiceWhereInput> OR) {
        this.OR = OR;
    }

    public ReplicationServiceWhereInput OR_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_O_R);
        return this;
    }

    public ReplicationServiceWhereInput OR_ExplictlyNonNull() {
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

    public ReplicationServiceWhereInput application(CloudTowerApplicationWhereInput application) {

        this.application = application;
        return this;
    }

    /**
     * Get application
     *
     * @return application
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public CloudTowerApplicationWhereInput getApplication() {
        return application;
    }

    public void setApplication(CloudTowerApplicationWhereInput application) {
        this.application = application;
    }

    public ReplicationServiceWhereInput application_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_APPLICATION);
        return this;
    }

    public ReplicationServiceWhereInput application_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_APPLICATION);
        return this;
    }

    public void setApplication_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_APPLICATION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_APPLICATION);
        }
    }

    public boolean getApplication_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_APPLICATION);
    }

    public ReplicationServiceWhereInput createdAt(String createdAt) {

        this.createdAt = createdAt;
        return this;
    }

    /**
     * Get createdAt
     *
     * @return createdAt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public ReplicationServiceWhereInput createdAt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT);
        return this;
    }

    public ReplicationServiceWhereInput createdAt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CREATED_AT);
        return this;
    }

    public void setCreatedAt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CREATED_AT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CREATED_AT);
        }
    }

    public boolean getCreatedAt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CREATED_AT);
    }

    public ReplicationServiceWhereInput createdAtGt(String createdAtGt) {

        this.createdAtGt = createdAtGt;
        return this;
    }

    /**
     * Get createdAtGt
     *
     * @return createdAtGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCreatedAtGt() {
        return createdAtGt;
    }

    public void setCreatedAtGt(String createdAtGt) {
        this.createdAtGt = createdAtGt;
    }

    public ReplicationServiceWhereInput createdAtGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_GT);
        return this;
    }

    public ReplicationServiceWhereInput createdAtGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CREATED_AT_GT);
        return this;
    }

    public void setCreatedAtGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CREATED_AT_GT);
        }
    }

    public boolean getCreatedAtGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CREATED_AT_GT);
    }

    public ReplicationServiceWhereInput createdAtGte(String createdAtGte) {

        this.createdAtGte = createdAtGte;
        return this;
    }

    /**
     * Get createdAtGte
     *
     * @return createdAtGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCreatedAtGte() {
        return createdAtGte;
    }

    public void setCreatedAtGte(String createdAtGte) {
        this.createdAtGte = createdAtGte;
    }

    public ReplicationServiceWhereInput createdAtGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_GTE);
        return this;
    }

    public ReplicationServiceWhereInput createdAtGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CREATED_AT_GTE);
        return this;
    }

    public void setCreatedAtGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CREATED_AT_GTE);
        }
    }

    public boolean getCreatedAtGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CREATED_AT_GTE);
    }

    public ReplicationServiceWhereInput createdAtIn(List<String> createdAtIn) {

        this.createdAtIn = createdAtIn;
        return this;
    }

    public ReplicationServiceWhereInput addCreatedAtInItem(String createdAtInItem) {
        if (this.createdAtIn == null) {
            this.createdAtIn = new ArrayList<String>();
        }
        this.createdAtIn.add(createdAtInItem);
        return this;
    }

    /**
     * Get createdAtIn
     *
     * @return createdAtIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getCreatedAtIn() {
        return createdAtIn;
    }

    public void setCreatedAtIn(List<String> createdAtIn) {
        this.createdAtIn = createdAtIn;
    }

    public ReplicationServiceWhereInput createdAtIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_IN);
        return this;
    }

    public ReplicationServiceWhereInput createdAtIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CREATED_AT_IN);
        return this;
    }

    public void setCreatedAtIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CREATED_AT_IN);
        }
    }

    public boolean getCreatedAtIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CREATED_AT_IN);
    }

    public ReplicationServiceWhereInput createdAtLt(String createdAtLt) {

        this.createdAtLt = createdAtLt;
        return this;
    }

    /**
     * Get createdAtLt
     *
     * @return createdAtLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCreatedAtLt() {
        return createdAtLt;
    }

    public void setCreatedAtLt(String createdAtLt) {
        this.createdAtLt = createdAtLt;
    }

    public ReplicationServiceWhereInput createdAtLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_LT);
        return this;
    }

    public ReplicationServiceWhereInput createdAtLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CREATED_AT_LT);
        return this;
    }

    public void setCreatedAtLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CREATED_AT_LT);
        }
    }

    public boolean getCreatedAtLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CREATED_AT_LT);
    }

    public ReplicationServiceWhereInput createdAtLte(String createdAtLte) {

        this.createdAtLte = createdAtLte;
        return this;
    }

    /**
     * Get createdAtLte
     *
     * @return createdAtLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCreatedAtLte() {
        return createdAtLte;
    }

    public void setCreatedAtLte(String createdAtLte) {
        this.createdAtLte = createdAtLte;
    }

    public ReplicationServiceWhereInput createdAtLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_LTE);
        return this;
    }

    public ReplicationServiceWhereInput createdAtLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CREATED_AT_LTE);
        return this;
    }

    public void setCreatedAtLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CREATED_AT_LTE);
        }
    }

    public boolean getCreatedAtLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CREATED_AT_LTE);
    }

    public ReplicationServiceWhereInput createdAtNot(String createdAtNot) {

        this.createdAtNot = createdAtNot;
        return this;
    }

    /**
     * Get createdAtNot
     *
     * @return createdAtNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCreatedAtNot() {
        return createdAtNot;
    }

    public void setCreatedAtNot(String createdAtNot) {
        this.createdAtNot = createdAtNot;
    }

    public ReplicationServiceWhereInput createdAtNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_NOT);
        return this;
    }

    public ReplicationServiceWhereInput createdAtNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CREATED_AT_NOT);
        return this;
    }

    public void setCreatedAtNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CREATED_AT_NOT);
        }
    }

    public boolean getCreatedAtNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CREATED_AT_NOT);
    }

    public ReplicationServiceWhereInput createdAtNotIn(List<String> createdAtNotIn) {

        this.createdAtNotIn = createdAtNotIn;
        return this;
    }

    public ReplicationServiceWhereInput addCreatedAtNotInItem(String createdAtNotInItem) {
        if (this.createdAtNotIn == null) {
            this.createdAtNotIn = new ArrayList<String>();
        }
        this.createdAtNotIn.add(createdAtNotInItem);
        return this;
    }

    /**
     * Get createdAtNotIn
     *
     * @return createdAtNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getCreatedAtNotIn() {
        return createdAtNotIn;
    }

    public void setCreatedAtNotIn(List<String> createdAtNotIn) {
        this.createdAtNotIn = createdAtNotIn;
    }

    public ReplicationServiceWhereInput createdAtNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_NOT_IN);
        return this;
    }

    public ReplicationServiceWhereInput createdAtNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CREATED_AT_NOT_IN);
        return this;
    }

    public void setCreatedAtNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CREATED_AT_NOT_IN);
        }
    }

    public boolean getCreatedAtNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CREATED_AT_NOT_IN);
    }

    public ReplicationServiceWhereInput description(String description) {

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

    public ReplicationServiceWhereInput description_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION);
        return this;
    }

    public ReplicationServiceWhereInput description_ExplictlyNonNull() {
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

    public ReplicationServiceWhereInput descriptionContains(String descriptionContains) {

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

    public ReplicationServiceWhereInput descriptionContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_CONTAINS);
        return this;
    }

    public ReplicationServiceWhereInput descriptionContains_ExplictlyNonNull() {
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

    public ReplicationServiceWhereInput descriptionEndsWith(String descriptionEndsWith) {

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

    public ReplicationServiceWhereInput descriptionEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_ENDS_WITH);
        return this;
    }

    public ReplicationServiceWhereInput descriptionEndsWith_ExplictlyNonNull() {
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

    public ReplicationServiceWhereInput descriptionGt(String descriptionGt) {

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

    public ReplicationServiceWhereInput descriptionGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_GT);
        return this;
    }

    public ReplicationServiceWhereInput descriptionGt_ExplictlyNonNull() {
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

    public ReplicationServiceWhereInput descriptionGte(String descriptionGte) {

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

    public ReplicationServiceWhereInput descriptionGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_GTE);
        return this;
    }

    public ReplicationServiceWhereInput descriptionGte_ExplictlyNonNull() {
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

    public ReplicationServiceWhereInput descriptionIn(List<String> descriptionIn) {

        this.descriptionIn = descriptionIn;
        return this;
    }

    public ReplicationServiceWhereInput addDescriptionInItem(String descriptionInItem) {
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

    public ReplicationServiceWhereInput descriptionIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_IN);
        return this;
    }

    public ReplicationServiceWhereInput descriptionIn_ExplictlyNonNull() {
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

    public ReplicationServiceWhereInput descriptionLt(String descriptionLt) {

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

    public ReplicationServiceWhereInput descriptionLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_LT);
        return this;
    }

    public ReplicationServiceWhereInput descriptionLt_ExplictlyNonNull() {
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

    public ReplicationServiceWhereInput descriptionLte(String descriptionLte) {

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

    public ReplicationServiceWhereInput descriptionLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_LTE);
        return this;
    }

    public ReplicationServiceWhereInput descriptionLte_ExplictlyNonNull() {
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

    public ReplicationServiceWhereInput descriptionNot(String descriptionNot) {

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

    public ReplicationServiceWhereInput descriptionNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT);
        return this;
    }

    public ReplicationServiceWhereInput descriptionNot_ExplictlyNonNull() {
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

    public ReplicationServiceWhereInput descriptionNotContains(String descriptionNotContains) {

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

    public ReplicationServiceWhereInput descriptionNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_CONTAINS);
        return this;
    }

    public ReplicationServiceWhereInput descriptionNotContains_ExplictlyNonNull() {
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

    public ReplicationServiceWhereInput descriptionNotEndsWith(String descriptionNotEndsWith) {

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

    public ReplicationServiceWhereInput descriptionNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_ENDS_WITH);
        return this;
    }

    public ReplicationServiceWhereInput descriptionNotEndsWith_ExplictlyNonNull() {
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

    public ReplicationServiceWhereInput descriptionNotIn(List<String> descriptionNotIn) {

        this.descriptionNotIn = descriptionNotIn;
        return this;
    }

    public ReplicationServiceWhereInput addDescriptionNotInItem(String descriptionNotInItem) {
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

    public ReplicationServiceWhereInput descriptionNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_IN);
        return this;
    }

    public ReplicationServiceWhereInput descriptionNotIn_ExplictlyNonNull() {
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

    public ReplicationServiceWhereInput descriptionNotStartsWith(String descriptionNotStartsWith) {

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

    public ReplicationServiceWhereInput descriptionNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_STARTS_WITH);
        return this;
    }

    public ReplicationServiceWhereInput descriptionNotStartsWith_ExplictlyNonNull() {
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

    public ReplicationServiceWhereInput descriptionStartsWith(String descriptionStartsWith) {

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

    public ReplicationServiceWhereInput descriptionStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_STARTS_WITH);
        return this;
    }

    public ReplicationServiceWhereInput descriptionStartsWith_ExplictlyNonNull() {
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

    public ReplicationServiceWhereInput entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {

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

    public ReplicationServiceWhereInput entityAsyncStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        return this;
    }

    public ReplicationServiceWhereInput entityAsyncStatus_ExplictlyNonNull() {
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

    public ReplicationServiceWhereInput entityAsyncStatusIn(
            List<EntityAsyncStatus> entityAsyncStatusIn) {

        this.entityAsyncStatusIn = entityAsyncStatusIn;
        return this;
    }

    public ReplicationServiceWhereInput addEntityAsyncStatusInItem(
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

    public ReplicationServiceWhereInput entityAsyncStatusIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_IN);
        return this;
    }

    public ReplicationServiceWhereInput entityAsyncStatusIn_ExplictlyNonNull() {
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

    public ReplicationServiceWhereInput entityAsyncStatusNot(
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

    public ReplicationServiceWhereInput entityAsyncStatusNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT);
        return this;
    }

    public ReplicationServiceWhereInput entityAsyncStatusNot_ExplictlyNonNull() {
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

    public ReplicationServiceWhereInput entityAsyncStatusNotIn(
            List<EntityAsyncStatus> entityAsyncStatusNotIn) {

        this.entityAsyncStatusNotIn = entityAsyncStatusNotIn;
        return this;
    }

    public ReplicationServiceWhereInput addEntityAsyncStatusNotInItem(
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

    public ReplicationServiceWhereInput entityAsyncStatusNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT_IN);
        return this;
    }

    public ReplicationServiceWhereInput entityAsyncStatusNotIn_ExplictlyNonNull() {
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

    public ReplicationServiceWhereInput failoverExecutionsEvery(
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

    public ReplicationServiceWhereInput failoverExecutionsEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FAILOVER_EXECUTIONS_EVERY);
        return this;
    }

    public ReplicationServiceWhereInput failoverExecutionsEvery_ExplictlyNonNull() {
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

    public ReplicationServiceWhereInput failoverExecutionsNone(
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

    public ReplicationServiceWhereInput failoverExecutionsNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FAILOVER_EXECUTIONS_NONE);
        return this;
    }

    public ReplicationServiceWhereInput failoverExecutionsNone_ExplictlyNonNull() {
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

    public ReplicationServiceWhereInput failoverExecutionsSome(
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

    public ReplicationServiceWhereInput failoverExecutionsSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FAILOVER_EXECUTIONS_SOME);
        return this;
    }

    public ReplicationServiceWhereInput failoverExecutionsSome_ExplictlyNonNull() {
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

    public ReplicationServiceWhereInput id(String id) {

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

    public ReplicationServiceWhereInput id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public ReplicationServiceWhereInput id_ExplictlyNonNull() {
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

    public ReplicationServiceWhereInput idContains(String idContains) {

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

    public ReplicationServiceWhereInput idContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_CONTAINS);
        return this;
    }

    public ReplicationServiceWhereInput idContains_ExplictlyNonNull() {
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

    public ReplicationServiceWhereInput idEndsWith(String idEndsWith) {

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

    public ReplicationServiceWhereInput idEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_ENDS_WITH);
        return this;
    }

    public ReplicationServiceWhereInput idEndsWith_ExplictlyNonNull() {
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

    public ReplicationServiceWhereInput idGt(String idGt) {

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

    public ReplicationServiceWhereInput idGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GT);
        return this;
    }

    public ReplicationServiceWhereInput idGt_ExplictlyNonNull() {
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

    public ReplicationServiceWhereInput idGte(String idGte) {

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

    public ReplicationServiceWhereInput idGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GTE);
        return this;
    }

    public ReplicationServiceWhereInput idGte_ExplictlyNonNull() {
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

    public ReplicationServiceWhereInput idIn(List<String> idIn) {

        this.idIn = idIn;
        return this;
    }

    public ReplicationServiceWhereInput addIdInItem(String idInItem) {
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

    public ReplicationServiceWhereInput idIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_IN);
        return this;
    }

    public ReplicationServiceWhereInput idIn_ExplictlyNonNull() {
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

    public ReplicationServiceWhereInput idLt(String idLt) {

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

    public ReplicationServiceWhereInput idLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LT);
        return this;
    }

    public ReplicationServiceWhereInput idLt_ExplictlyNonNull() {
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

    public ReplicationServiceWhereInput idLte(String idLte) {

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

    public ReplicationServiceWhereInput idLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LTE);
        return this;
    }

    public ReplicationServiceWhereInput idLte_ExplictlyNonNull() {
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

    public ReplicationServiceWhereInput idNot(String idNot) {

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

    public ReplicationServiceWhereInput idNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT);
        return this;
    }

    public ReplicationServiceWhereInput idNot_ExplictlyNonNull() {
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

    public ReplicationServiceWhereInput idNotContains(String idNotContains) {

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

    public ReplicationServiceWhereInput idNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_CONTAINS);
        return this;
    }

    public ReplicationServiceWhereInput idNotContains_ExplictlyNonNull() {
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

    public ReplicationServiceWhereInput idNotEndsWith(String idNotEndsWith) {

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

    public ReplicationServiceWhereInput idNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
        return this;
    }

    public ReplicationServiceWhereInput idNotEndsWith_ExplictlyNonNull() {
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

    public ReplicationServiceWhereInput idNotIn(List<String> idNotIn) {

        this.idNotIn = idNotIn;
        return this;
    }

    public ReplicationServiceWhereInput addIdNotInItem(String idNotInItem) {
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

    public ReplicationServiceWhereInput idNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_IN);
        return this;
    }

    public ReplicationServiceWhereInput idNotIn_ExplictlyNonNull() {
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

    public ReplicationServiceWhereInput idNotStartsWith(String idNotStartsWith) {

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

    public ReplicationServiceWhereInput idNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
        return this;
    }

    public ReplicationServiceWhereInput idNotStartsWith_ExplictlyNonNull() {
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

    public ReplicationServiceWhereInput idStartsWith(String idStartsWith) {

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

    public ReplicationServiceWhereInput idStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_STARTS_WITH);
        return this;
    }

    public ReplicationServiceWhereInput idStartsWith_ExplictlyNonNull() {
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

    public ReplicationServiceWhereInput kubeConfig(String kubeConfig) {

        this.kubeConfig = kubeConfig;
        return this;
    }

    /**
     * Get kubeConfig
     *
     * @return kubeConfig
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getKubeConfig() {
        return kubeConfig;
    }

    public void setKubeConfig(String kubeConfig) {
        this.kubeConfig = kubeConfig;
    }

    public ReplicationServiceWhereInput kubeConfig_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KUBE_CONFIG);
        return this;
    }

    public ReplicationServiceWhereInput kubeConfig_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_KUBE_CONFIG);
        return this;
    }

    public void setKubeConfig_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_KUBE_CONFIG);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_KUBE_CONFIG);
        }
    }

    public boolean getKubeConfig_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_KUBE_CONFIG);
    }

    public ReplicationServiceWhereInput kubeConfigContains(String kubeConfigContains) {

        this.kubeConfigContains = kubeConfigContains;
        return this;
    }

    /**
     * Get kubeConfigContains
     *
     * @return kubeConfigContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getKubeConfigContains() {
        return kubeConfigContains;
    }

    public void setKubeConfigContains(String kubeConfigContains) {
        this.kubeConfigContains = kubeConfigContains;
    }

    public ReplicationServiceWhereInput kubeConfigContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KUBE_CONFIG_CONTAINS);
        return this;
    }

    public ReplicationServiceWhereInput kubeConfigContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_KUBE_CONFIG_CONTAINS);
        return this;
    }

    public void setKubeConfigContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_KUBE_CONFIG_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_KUBE_CONFIG_CONTAINS);
        }
    }

    public boolean getKubeConfigContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_KUBE_CONFIG_CONTAINS);
    }

    public ReplicationServiceWhereInput kubeConfigEndsWith(String kubeConfigEndsWith) {

        this.kubeConfigEndsWith = kubeConfigEndsWith;
        return this;
    }

    /**
     * Get kubeConfigEndsWith
     *
     * @return kubeConfigEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getKubeConfigEndsWith() {
        return kubeConfigEndsWith;
    }

    public void setKubeConfigEndsWith(String kubeConfigEndsWith) {
        this.kubeConfigEndsWith = kubeConfigEndsWith;
    }

    public ReplicationServiceWhereInput kubeConfigEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KUBE_CONFIG_ENDS_WITH);
        return this;
    }

    public ReplicationServiceWhereInput kubeConfigEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_KUBE_CONFIG_ENDS_WITH);
        return this;
    }

    public void setKubeConfigEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_KUBE_CONFIG_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_KUBE_CONFIG_ENDS_WITH);
        }
    }

    public boolean getKubeConfigEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_KUBE_CONFIG_ENDS_WITH);
    }

    public ReplicationServiceWhereInput kubeConfigGt(String kubeConfigGt) {

        this.kubeConfigGt = kubeConfigGt;
        return this;
    }

    /**
     * Get kubeConfigGt
     *
     * @return kubeConfigGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getKubeConfigGt() {
        return kubeConfigGt;
    }

    public void setKubeConfigGt(String kubeConfigGt) {
        this.kubeConfigGt = kubeConfigGt;
    }

    public ReplicationServiceWhereInput kubeConfigGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KUBE_CONFIG_GT);
        return this;
    }

    public ReplicationServiceWhereInput kubeConfigGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_KUBE_CONFIG_GT);
        return this;
    }

    public void setKubeConfigGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_KUBE_CONFIG_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_KUBE_CONFIG_GT);
        }
    }

    public boolean getKubeConfigGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_KUBE_CONFIG_GT);
    }

    public ReplicationServiceWhereInput kubeConfigGte(String kubeConfigGte) {

        this.kubeConfigGte = kubeConfigGte;
        return this;
    }

    /**
     * Get kubeConfigGte
     *
     * @return kubeConfigGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getKubeConfigGte() {
        return kubeConfigGte;
    }

    public void setKubeConfigGte(String kubeConfigGte) {
        this.kubeConfigGte = kubeConfigGte;
    }

    public ReplicationServiceWhereInput kubeConfigGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KUBE_CONFIG_GTE);
        return this;
    }

    public ReplicationServiceWhereInput kubeConfigGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_KUBE_CONFIG_GTE);
        return this;
    }

    public void setKubeConfigGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_KUBE_CONFIG_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_KUBE_CONFIG_GTE);
        }
    }

    public boolean getKubeConfigGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_KUBE_CONFIG_GTE);
    }

    public ReplicationServiceWhereInput kubeConfigIn(List<String> kubeConfigIn) {

        this.kubeConfigIn = kubeConfigIn;
        return this;
    }

    public ReplicationServiceWhereInput addKubeConfigInItem(String kubeConfigInItem) {
        if (this.kubeConfigIn == null) {
            this.kubeConfigIn = new ArrayList<String>();
        }
        this.kubeConfigIn.add(kubeConfigInItem);
        return this;
    }

    /**
     * Get kubeConfigIn
     *
     * @return kubeConfigIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getKubeConfigIn() {
        return kubeConfigIn;
    }

    public void setKubeConfigIn(List<String> kubeConfigIn) {
        this.kubeConfigIn = kubeConfigIn;
    }

    public ReplicationServiceWhereInput kubeConfigIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KUBE_CONFIG_IN);
        return this;
    }

    public ReplicationServiceWhereInput kubeConfigIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_KUBE_CONFIG_IN);
        return this;
    }

    public void setKubeConfigIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_KUBE_CONFIG_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_KUBE_CONFIG_IN);
        }
    }

    public boolean getKubeConfigIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_KUBE_CONFIG_IN);
    }

    public ReplicationServiceWhereInput kubeConfigLt(String kubeConfigLt) {

        this.kubeConfigLt = kubeConfigLt;
        return this;
    }

    /**
     * Get kubeConfigLt
     *
     * @return kubeConfigLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getKubeConfigLt() {
        return kubeConfigLt;
    }

    public void setKubeConfigLt(String kubeConfigLt) {
        this.kubeConfigLt = kubeConfigLt;
    }

    public ReplicationServiceWhereInput kubeConfigLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KUBE_CONFIG_LT);
        return this;
    }

    public ReplicationServiceWhereInput kubeConfigLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_KUBE_CONFIG_LT);
        return this;
    }

    public void setKubeConfigLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_KUBE_CONFIG_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_KUBE_CONFIG_LT);
        }
    }

    public boolean getKubeConfigLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_KUBE_CONFIG_LT);
    }

    public ReplicationServiceWhereInput kubeConfigLte(String kubeConfigLte) {

        this.kubeConfigLte = kubeConfigLte;
        return this;
    }

    /**
     * Get kubeConfigLte
     *
     * @return kubeConfigLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getKubeConfigLte() {
        return kubeConfigLte;
    }

    public void setKubeConfigLte(String kubeConfigLte) {
        this.kubeConfigLte = kubeConfigLte;
    }

    public ReplicationServiceWhereInput kubeConfigLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KUBE_CONFIG_LTE);
        return this;
    }

    public ReplicationServiceWhereInput kubeConfigLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_KUBE_CONFIG_LTE);
        return this;
    }

    public void setKubeConfigLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_KUBE_CONFIG_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_KUBE_CONFIG_LTE);
        }
    }

    public boolean getKubeConfigLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_KUBE_CONFIG_LTE);
    }

    public ReplicationServiceWhereInput kubeConfigNot(String kubeConfigNot) {

        this.kubeConfigNot = kubeConfigNot;
        return this;
    }

    /**
     * Get kubeConfigNot
     *
     * @return kubeConfigNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getKubeConfigNot() {
        return kubeConfigNot;
    }

    public void setKubeConfigNot(String kubeConfigNot) {
        this.kubeConfigNot = kubeConfigNot;
    }

    public ReplicationServiceWhereInput kubeConfigNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KUBE_CONFIG_NOT);
        return this;
    }

    public ReplicationServiceWhereInput kubeConfigNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_KUBE_CONFIG_NOT);
        return this;
    }

    public void setKubeConfigNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_KUBE_CONFIG_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_KUBE_CONFIG_NOT);
        }
    }

    public boolean getKubeConfigNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_KUBE_CONFIG_NOT);
    }

    public ReplicationServiceWhereInput kubeConfigNotContains(String kubeConfigNotContains) {

        this.kubeConfigNotContains = kubeConfigNotContains;
        return this;
    }

    /**
     * Get kubeConfigNotContains
     *
     * @return kubeConfigNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getKubeConfigNotContains() {
        return kubeConfigNotContains;
    }

    public void setKubeConfigNotContains(String kubeConfigNotContains) {
        this.kubeConfigNotContains = kubeConfigNotContains;
    }

    public ReplicationServiceWhereInput kubeConfigNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KUBE_CONFIG_NOT_CONTAINS);
        return this;
    }

    public ReplicationServiceWhereInput kubeConfigNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_KUBE_CONFIG_NOT_CONTAINS);
        return this;
    }

    public void setKubeConfigNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_KUBE_CONFIG_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_KUBE_CONFIG_NOT_CONTAINS);
        }
    }

    public boolean getKubeConfigNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_KUBE_CONFIG_NOT_CONTAINS);
    }

    public ReplicationServiceWhereInput kubeConfigNotEndsWith(String kubeConfigNotEndsWith) {

        this.kubeConfigNotEndsWith = kubeConfigNotEndsWith;
        return this;
    }

    /**
     * Get kubeConfigNotEndsWith
     *
     * @return kubeConfigNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getKubeConfigNotEndsWith() {
        return kubeConfigNotEndsWith;
    }

    public void setKubeConfigNotEndsWith(String kubeConfigNotEndsWith) {
        this.kubeConfigNotEndsWith = kubeConfigNotEndsWith;
    }

    public ReplicationServiceWhereInput kubeConfigNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KUBE_CONFIG_NOT_ENDS_WITH);
        return this;
    }

    public ReplicationServiceWhereInput kubeConfigNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_KUBE_CONFIG_NOT_ENDS_WITH);
        return this;
    }

    public void setKubeConfigNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_KUBE_CONFIG_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_KUBE_CONFIG_NOT_ENDS_WITH);
        }
    }

    public boolean getKubeConfigNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_KUBE_CONFIG_NOT_ENDS_WITH);
    }

    public ReplicationServiceWhereInput kubeConfigNotIn(List<String> kubeConfigNotIn) {

        this.kubeConfigNotIn = kubeConfigNotIn;
        return this;
    }

    public ReplicationServiceWhereInput addKubeConfigNotInItem(String kubeConfigNotInItem) {
        if (this.kubeConfigNotIn == null) {
            this.kubeConfigNotIn = new ArrayList<String>();
        }
        this.kubeConfigNotIn.add(kubeConfigNotInItem);
        return this;
    }

    /**
     * Get kubeConfigNotIn
     *
     * @return kubeConfigNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getKubeConfigNotIn() {
        return kubeConfigNotIn;
    }

    public void setKubeConfigNotIn(List<String> kubeConfigNotIn) {
        this.kubeConfigNotIn = kubeConfigNotIn;
    }

    public ReplicationServiceWhereInput kubeConfigNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KUBE_CONFIG_NOT_IN);
        return this;
    }

    public ReplicationServiceWhereInput kubeConfigNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_KUBE_CONFIG_NOT_IN);
        return this;
    }

    public void setKubeConfigNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_KUBE_CONFIG_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_KUBE_CONFIG_NOT_IN);
        }
    }

    public boolean getKubeConfigNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_KUBE_CONFIG_NOT_IN);
    }

    public ReplicationServiceWhereInput kubeConfigNotStartsWith(String kubeConfigNotStartsWith) {

        this.kubeConfigNotStartsWith = kubeConfigNotStartsWith;
        return this;
    }

    /**
     * Get kubeConfigNotStartsWith
     *
     * @return kubeConfigNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getKubeConfigNotStartsWith() {
        return kubeConfigNotStartsWith;
    }

    public void setKubeConfigNotStartsWith(String kubeConfigNotStartsWith) {
        this.kubeConfigNotStartsWith = kubeConfigNotStartsWith;
    }

    public ReplicationServiceWhereInput kubeConfigNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KUBE_CONFIG_NOT_STARTS_WITH);
        return this;
    }

    public ReplicationServiceWhereInput kubeConfigNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_KUBE_CONFIG_NOT_STARTS_WITH);
        return this;
    }

    public void setKubeConfigNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_KUBE_CONFIG_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_KUBE_CONFIG_NOT_STARTS_WITH);
        }
    }

    public boolean getKubeConfigNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_KUBE_CONFIG_NOT_STARTS_WITH);
    }

    public ReplicationServiceWhereInput kubeConfigStartsWith(String kubeConfigStartsWith) {

        this.kubeConfigStartsWith = kubeConfigStartsWith;
        return this;
    }

    /**
     * Get kubeConfigStartsWith
     *
     * @return kubeConfigStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getKubeConfigStartsWith() {
        return kubeConfigStartsWith;
    }

    public void setKubeConfigStartsWith(String kubeConfigStartsWith) {
        this.kubeConfigStartsWith = kubeConfigStartsWith;
    }

    public ReplicationServiceWhereInput kubeConfigStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_KUBE_CONFIG_STARTS_WITH);
        return this;
    }

    public ReplicationServiceWhereInput kubeConfigStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_KUBE_CONFIG_STARTS_WITH);
        return this;
    }

    public void setKubeConfigStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_KUBE_CONFIG_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_KUBE_CONFIG_STARTS_WITH);
        }
    }

    public boolean getKubeConfigStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_KUBE_CONFIG_STARTS_WITH);
    }

    public ReplicationServiceWhereInput maxFailbackJobs(Integer maxFailbackJobs) {

        this.maxFailbackJobs = maxFailbackJobs;
        return this;
    }

    /**
     * Get maxFailbackJobs
     *
     * @return maxFailbackJobs
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMaxFailbackJobs() {
        return maxFailbackJobs;
    }

    public void setMaxFailbackJobs(Integer maxFailbackJobs) {
        this.maxFailbackJobs = maxFailbackJobs;
    }

    public ReplicationServiceWhereInput maxFailbackJobs_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_FAILBACK_JOBS);
        return this;
    }

    public ReplicationServiceWhereInput maxFailbackJobs_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_FAILBACK_JOBS);
        return this;
    }

    public void setMaxFailbackJobs_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_FAILBACK_JOBS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_FAILBACK_JOBS);
        }
    }

    public boolean getMaxFailbackJobs_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_FAILBACK_JOBS);
    }

    public ReplicationServiceWhereInput maxFailbackJobsGt(Integer maxFailbackJobsGt) {

        this.maxFailbackJobsGt = maxFailbackJobsGt;
        return this;
    }

    /**
     * Get maxFailbackJobsGt
     *
     * @return maxFailbackJobsGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMaxFailbackJobsGt() {
        return maxFailbackJobsGt;
    }

    public void setMaxFailbackJobsGt(Integer maxFailbackJobsGt) {
        this.maxFailbackJobsGt = maxFailbackJobsGt;
    }

    public ReplicationServiceWhereInput maxFailbackJobsGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_FAILBACK_JOBS_GT);
        return this;
    }

    public ReplicationServiceWhereInput maxFailbackJobsGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_FAILBACK_JOBS_GT);
        return this;
    }

    public void setMaxFailbackJobsGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_FAILBACK_JOBS_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_FAILBACK_JOBS_GT);
        }
    }

    public boolean getMaxFailbackJobsGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_FAILBACK_JOBS_GT);
    }

    public ReplicationServiceWhereInput maxFailbackJobsGte(Integer maxFailbackJobsGte) {

        this.maxFailbackJobsGte = maxFailbackJobsGte;
        return this;
    }

    /**
     * Get maxFailbackJobsGte
     *
     * @return maxFailbackJobsGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMaxFailbackJobsGte() {
        return maxFailbackJobsGte;
    }

    public void setMaxFailbackJobsGte(Integer maxFailbackJobsGte) {
        this.maxFailbackJobsGte = maxFailbackJobsGte;
    }

    public ReplicationServiceWhereInput maxFailbackJobsGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_FAILBACK_JOBS_GTE);
        return this;
    }

    public ReplicationServiceWhereInput maxFailbackJobsGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_FAILBACK_JOBS_GTE);
        return this;
    }

    public void setMaxFailbackJobsGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_FAILBACK_JOBS_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_FAILBACK_JOBS_GTE);
        }
    }

    public boolean getMaxFailbackJobsGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_FAILBACK_JOBS_GTE);
    }

    public ReplicationServiceWhereInput maxFailbackJobsIn(List<Integer> maxFailbackJobsIn) {

        this.maxFailbackJobsIn = maxFailbackJobsIn;
        return this;
    }

    public ReplicationServiceWhereInput addMaxFailbackJobsInItem(Integer maxFailbackJobsInItem) {
        if (this.maxFailbackJobsIn == null) {
            this.maxFailbackJobsIn = new ArrayList<Integer>();
        }
        this.maxFailbackJobsIn.add(maxFailbackJobsInItem);
        return this;
    }

    /**
     * Get maxFailbackJobsIn
     *
     * @return maxFailbackJobsIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getMaxFailbackJobsIn() {
        return maxFailbackJobsIn;
    }

    public void setMaxFailbackJobsIn(List<Integer> maxFailbackJobsIn) {
        this.maxFailbackJobsIn = maxFailbackJobsIn;
    }

    public ReplicationServiceWhereInput maxFailbackJobsIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_FAILBACK_JOBS_IN);
        return this;
    }

    public ReplicationServiceWhereInput maxFailbackJobsIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_FAILBACK_JOBS_IN);
        return this;
    }

    public void setMaxFailbackJobsIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_FAILBACK_JOBS_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_FAILBACK_JOBS_IN);
        }
    }

    public boolean getMaxFailbackJobsIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_FAILBACK_JOBS_IN);
    }

    public ReplicationServiceWhereInput maxFailbackJobsLt(Integer maxFailbackJobsLt) {

        this.maxFailbackJobsLt = maxFailbackJobsLt;
        return this;
    }

    /**
     * Get maxFailbackJobsLt
     *
     * @return maxFailbackJobsLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMaxFailbackJobsLt() {
        return maxFailbackJobsLt;
    }

    public void setMaxFailbackJobsLt(Integer maxFailbackJobsLt) {
        this.maxFailbackJobsLt = maxFailbackJobsLt;
    }

    public ReplicationServiceWhereInput maxFailbackJobsLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_FAILBACK_JOBS_LT);
        return this;
    }

    public ReplicationServiceWhereInput maxFailbackJobsLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_FAILBACK_JOBS_LT);
        return this;
    }

    public void setMaxFailbackJobsLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_FAILBACK_JOBS_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_FAILBACK_JOBS_LT);
        }
    }

    public boolean getMaxFailbackJobsLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_FAILBACK_JOBS_LT);
    }

    public ReplicationServiceWhereInput maxFailbackJobsLte(Integer maxFailbackJobsLte) {

        this.maxFailbackJobsLte = maxFailbackJobsLte;
        return this;
    }

    /**
     * Get maxFailbackJobsLte
     *
     * @return maxFailbackJobsLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMaxFailbackJobsLte() {
        return maxFailbackJobsLte;
    }

    public void setMaxFailbackJobsLte(Integer maxFailbackJobsLte) {
        this.maxFailbackJobsLte = maxFailbackJobsLte;
    }

    public ReplicationServiceWhereInput maxFailbackJobsLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_FAILBACK_JOBS_LTE);
        return this;
    }

    public ReplicationServiceWhereInput maxFailbackJobsLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_FAILBACK_JOBS_LTE);
        return this;
    }

    public void setMaxFailbackJobsLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_FAILBACK_JOBS_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_FAILBACK_JOBS_LTE);
        }
    }

    public boolean getMaxFailbackJobsLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_FAILBACK_JOBS_LTE);
    }

    public ReplicationServiceWhereInput maxFailbackJobsNot(Integer maxFailbackJobsNot) {

        this.maxFailbackJobsNot = maxFailbackJobsNot;
        return this;
    }

    /**
     * Get maxFailbackJobsNot
     *
     * @return maxFailbackJobsNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMaxFailbackJobsNot() {
        return maxFailbackJobsNot;
    }

    public void setMaxFailbackJobsNot(Integer maxFailbackJobsNot) {
        this.maxFailbackJobsNot = maxFailbackJobsNot;
    }

    public ReplicationServiceWhereInput maxFailbackJobsNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_FAILBACK_JOBS_NOT);
        return this;
    }

    public ReplicationServiceWhereInput maxFailbackJobsNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_FAILBACK_JOBS_NOT);
        return this;
    }

    public void setMaxFailbackJobsNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_FAILBACK_JOBS_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_FAILBACK_JOBS_NOT);
        }
    }

    public boolean getMaxFailbackJobsNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_FAILBACK_JOBS_NOT);
    }

    public ReplicationServiceWhereInput maxFailbackJobsNotIn(List<Integer> maxFailbackJobsNotIn) {

        this.maxFailbackJobsNotIn = maxFailbackJobsNotIn;
        return this;
    }

    public ReplicationServiceWhereInput addMaxFailbackJobsNotInItem(
            Integer maxFailbackJobsNotInItem) {
        if (this.maxFailbackJobsNotIn == null) {
            this.maxFailbackJobsNotIn = new ArrayList<Integer>();
        }
        this.maxFailbackJobsNotIn.add(maxFailbackJobsNotInItem);
        return this;
    }

    /**
     * Get maxFailbackJobsNotIn
     *
     * @return maxFailbackJobsNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getMaxFailbackJobsNotIn() {
        return maxFailbackJobsNotIn;
    }

    public void setMaxFailbackJobsNotIn(List<Integer> maxFailbackJobsNotIn) {
        this.maxFailbackJobsNotIn = maxFailbackJobsNotIn;
    }

    public ReplicationServiceWhereInput maxFailbackJobsNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_FAILBACK_JOBS_NOT_IN);
        return this;
    }

    public ReplicationServiceWhereInput maxFailbackJobsNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_FAILBACK_JOBS_NOT_IN);
        return this;
    }

    public void setMaxFailbackJobsNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_FAILBACK_JOBS_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_FAILBACK_JOBS_NOT_IN);
        }
    }

    public boolean getMaxFailbackJobsNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_FAILBACK_JOBS_NOT_IN);
    }

    public ReplicationServiceWhereInput maxFailbackSpeedLimit(Double maxFailbackSpeedLimit) {

        this.maxFailbackSpeedLimit = maxFailbackSpeedLimit;
        return this;
    }

    /**
     * Get maxFailbackSpeedLimit
     *
     * @return maxFailbackSpeedLimit
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getMaxFailbackSpeedLimit() {
        return maxFailbackSpeedLimit;
    }

    public void setMaxFailbackSpeedLimit(Double maxFailbackSpeedLimit) {
        this.maxFailbackSpeedLimit = maxFailbackSpeedLimit;
    }

    public ReplicationServiceWhereInput maxFailbackSpeedLimit_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_FAILBACK_SPEED_LIMIT);
        return this;
    }

    public ReplicationServiceWhereInput maxFailbackSpeedLimit_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_FAILBACK_SPEED_LIMIT);
        return this;
    }

    public void setMaxFailbackSpeedLimit_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_FAILBACK_SPEED_LIMIT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_FAILBACK_SPEED_LIMIT);
        }
    }

    public boolean getMaxFailbackSpeedLimit_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_FAILBACK_SPEED_LIMIT);
    }

    public ReplicationServiceWhereInput maxFailbackSpeedLimitGt(Double maxFailbackSpeedLimitGt) {

        this.maxFailbackSpeedLimitGt = maxFailbackSpeedLimitGt;
        return this;
    }

    /**
     * Get maxFailbackSpeedLimitGt
     *
     * @return maxFailbackSpeedLimitGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getMaxFailbackSpeedLimitGt() {
        return maxFailbackSpeedLimitGt;
    }

    public void setMaxFailbackSpeedLimitGt(Double maxFailbackSpeedLimitGt) {
        this.maxFailbackSpeedLimitGt = maxFailbackSpeedLimitGt;
    }

    public ReplicationServiceWhereInput maxFailbackSpeedLimitGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_FAILBACK_SPEED_LIMIT_GT);
        return this;
    }

    public ReplicationServiceWhereInput maxFailbackSpeedLimitGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_FAILBACK_SPEED_LIMIT_GT);
        return this;
    }

    public void setMaxFailbackSpeedLimitGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_FAILBACK_SPEED_LIMIT_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_FAILBACK_SPEED_LIMIT_GT);
        }
    }

    public boolean getMaxFailbackSpeedLimitGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_FAILBACK_SPEED_LIMIT_GT);
    }

    public ReplicationServiceWhereInput maxFailbackSpeedLimitGte(Double maxFailbackSpeedLimitGte) {

        this.maxFailbackSpeedLimitGte = maxFailbackSpeedLimitGte;
        return this;
    }

    /**
     * Get maxFailbackSpeedLimitGte
     *
     * @return maxFailbackSpeedLimitGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getMaxFailbackSpeedLimitGte() {
        return maxFailbackSpeedLimitGte;
    }

    public void setMaxFailbackSpeedLimitGte(Double maxFailbackSpeedLimitGte) {
        this.maxFailbackSpeedLimitGte = maxFailbackSpeedLimitGte;
    }

    public ReplicationServiceWhereInput maxFailbackSpeedLimitGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_FAILBACK_SPEED_LIMIT_GTE);
        return this;
    }

    public ReplicationServiceWhereInput maxFailbackSpeedLimitGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_FAILBACK_SPEED_LIMIT_GTE);
        return this;
    }

    public void setMaxFailbackSpeedLimitGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_FAILBACK_SPEED_LIMIT_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_FAILBACK_SPEED_LIMIT_GTE);
        }
    }

    public boolean getMaxFailbackSpeedLimitGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_FAILBACK_SPEED_LIMIT_GTE);
    }

    public ReplicationServiceWhereInput maxFailbackSpeedLimitIn(
            List<Double> maxFailbackSpeedLimitIn) {

        this.maxFailbackSpeedLimitIn = maxFailbackSpeedLimitIn;
        return this;
    }

    public ReplicationServiceWhereInput addMaxFailbackSpeedLimitInItem(
            Double maxFailbackSpeedLimitInItem) {
        if (this.maxFailbackSpeedLimitIn == null) {
            this.maxFailbackSpeedLimitIn = new ArrayList<Double>();
        }
        this.maxFailbackSpeedLimitIn.add(maxFailbackSpeedLimitInItem);
        return this;
    }

    /**
     * Get maxFailbackSpeedLimitIn
     *
     * @return maxFailbackSpeedLimitIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Double> getMaxFailbackSpeedLimitIn() {
        return maxFailbackSpeedLimitIn;
    }

    public void setMaxFailbackSpeedLimitIn(List<Double> maxFailbackSpeedLimitIn) {
        this.maxFailbackSpeedLimitIn = maxFailbackSpeedLimitIn;
    }

    public ReplicationServiceWhereInput maxFailbackSpeedLimitIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_FAILBACK_SPEED_LIMIT_IN);
        return this;
    }

    public ReplicationServiceWhereInput maxFailbackSpeedLimitIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_FAILBACK_SPEED_LIMIT_IN);
        return this;
    }

    public void setMaxFailbackSpeedLimitIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_FAILBACK_SPEED_LIMIT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_FAILBACK_SPEED_LIMIT_IN);
        }
    }

    public boolean getMaxFailbackSpeedLimitIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_FAILBACK_SPEED_LIMIT_IN);
    }

    public ReplicationServiceWhereInput maxFailbackSpeedLimitLt(Double maxFailbackSpeedLimitLt) {

        this.maxFailbackSpeedLimitLt = maxFailbackSpeedLimitLt;
        return this;
    }

    /**
     * Get maxFailbackSpeedLimitLt
     *
     * @return maxFailbackSpeedLimitLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getMaxFailbackSpeedLimitLt() {
        return maxFailbackSpeedLimitLt;
    }

    public void setMaxFailbackSpeedLimitLt(Double maxFailbackSpeedLimitLt) {
        this.maxFailbackSpeedLimitLt = maxFailbackSpeedLimitLt;
    }

    public ReplicationServiceWhereInput maxFailbackSpeedLimitLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_FAILBACK_SPEED_LIMIT_LT);
        return this;
    }

    public ReplicationServiceWhereInput maxFailbackSpeedLimitLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_FAILBACK_SPEED_LIMIT_LT);
        return this;
    }

    public void setMaxFailbackSpeedLimitLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_FAILBACK_SPEED_LIMIT_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_FAILBACK_SPEED_LIMIT_LT);
        }
    }

    public boolean getMaxFailbackSpeedLimitLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_FAILBACK_SPEED_LIMIT_LT);
    }

    public ReplicationServiceWhereInput maxFailbackSpeedLimitLte(Double maxFailbackSpeedLimitLte) {

        this.maxFailbackSpeedLimitLte = maxFailbackSpeedLimitLte;
        return this;
    }

    /**
     * Get maxFailbackSpeedLimitLte
     *
     * @return maxFailbackSpeedLimitLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getMaxFailbackSpeedLimitLte() {
        return maxFailbackSpeedLimitLte;
    }

    public void setMaxFailbackSpeedLimitLte(Double maxFailbackSpeedLimitLte) {
        this.maxFailbackSpeedLimitLte = maxFailbackSpeedLimitLte;
    }

    public ReplicationServiceWhereInput maxFailbackSpeedLimitLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_FAILBACK_SPEED_LIMIT_LTE);
        return this;
    }

    public ReplicationServiceWhereInput maxFailbackSpeedLimitLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_FAILBACK_SPEED_LIMIT_LTE);
        return this;
    }

    public void setMaxFailbackSpeedLimitLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_FAILBACK_SPEED_LIMIT_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_FAILBACK_SPEED_LIMIT_LTE);
        }
    }

    public boolean getMaxFailbackSpeedLimitLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_FAILBACK_SPEED_LIMIT_LTE);
    }

    public ReplicationServiceWhereInput maxFailbackSpeedLimitNot(Double maxFailbackSpeedLimitNot) {

        this.maxFailbackSpeedLimitNot = maxFailbackSpeedLimitNot;
        return this;
    }

    /**
     * Get maxFailbackSpeedLimitNot
     *
     * @return maxFailbackSpeedLimitNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getMaxFailbackSpeedLimitNot() {
        return maxFailbackSpeedLimitNot;
    }

    public void setMaxFailbackSpeedLimitNot(Double maxFailbackSpeedLimitNot) {
        this.maxFailbackSpeedLimitNot = maxFailbackSpeedLimitNot;
    }

    public ReplicationServiceWhereInput maxFailbackSpeedLimitNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_FAILBACK_SPEED_LIMIT_NOT);
        return this;
    }

    public ReplicationServiceWhereInput maxFailbackSpeedLimitNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_FAILBACK_SPEED_LIMIT_NOT);
        return this;
    }

    public void setMaxFailbackSpeedLimitNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_FAILBACK_SPEED_LIMIT_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_FAILBACK_SPEED_LIMIT_NOT);
        }
    }

    public boolean getMaxFailbackSpeedLimitNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_FAILBACK_SPEED_LIMIT_NOT);
    }

    public ReplicationServiceWhereInput maxFailbackSpeedLimitNotIn(
            List<Double> maxFailbackSpeedLimitNotIn) {

        this.maxFailbackSpeedLimitNotIn = maxFailbackSpeedLimitNotIn;
        return this;
    }

    public ReplicationServiceWhereInput addMaxFailbackSpeedLimitNotInItem(
            Double maxFailbackSpeedLimitNotInItem) {
        if (this.maxFailbackSpeedLimitNotIn == null) {
            this.maxFailbackSpeedLimitNotIn = new ArrayList<Double>();
        }
        this.maxFailbackSpeedLimitNotIn.add(maxFailbackSpeedLimitNotInItem);
        return this;
    }

    /**
     * Get maxFailbackSpeedLimitNotIn
     *
     * @return maxFailbackSpeedLimitNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Double> getMaxFailbackSpeedLimitNotIn() {
        return maxFailbackSpeedLimitNotIn;
    }

    public void setMaxFailbackSpeedLimitNotIn(List<Double> maxFailbackSpeedLimitNotIn) {
        this.maxFailbackSpeedLimitNotIn = maxFailbackSpeedLimitNotIn;
    }

    public ReplicationServiceWhereInput maxFailbackSpeedLimitNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_FAILBACK_SPEED_LIMIT_NOT_IN);
        return this;
    }

    public ReplicationServiceWhereInput maxFailbackSpeedLimitNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_FAILBACK_SPEED_LIMIT_NOT_IN);
        return this;
    }

    public void setMaxFailbackSpeedLimitNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_FAILBACK_SPEED_LIMIT_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_FAILBACK_SPEED_LIMIT_NOT_IN);
        }
    }

    public boolean getMaxFailbackSpeedLimitNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_FAILBACK_SPEED_LIMIT_NOT_IN);
    }

    public ReplicationServiceWhereInput maxReplicationJobs(Integer maxReplicationJobs) {

        this.maxReplicationJobs = maxReplicationJobs;
        return this;
    }

    /**
     * Get maxReplicationJobs
     *
     * @return maxReplicationJobs
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMaxReplicationJobs() {
        return maxReplicationJobs;
    }

    public void setMaxReplicationJobs(Integer maxReplicationJobs) {
        this.maxReplicationJobs = maxReplicationJobs;
    }

    public ReplicationServiceWhereInput maxReplicationJobs_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_REPLICATION_JOBS);
        return this;
    }

    public ReplicationServiceWhereInput maxReplicationJobs_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_REPLICATION_JOBS);
        return this;
    }

    public void setMaxReplicationJobs_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_REPLICATION_JOBS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_REPLICATION_JOBS);
        }
    }

    public boolean getMaxReplicationJobs_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_REPLICATION_JOBS);
    }

    public ReplicationServiceWhereInput maxReplicationJobsGt(Integer maxReplicationJobsGt) {

        this.maxReplicationJobsGt = maxReplicationJobsGt;
        return this;
    }

    /**
     * Get maxReplicationJobsGt
     *
     * @return maxReplicationJobsGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMaxReplicationJobsGt() {
        return maxReplicationJobsGt;
    }

    public void setMaxReplicationJobsGt(Integer maxReplicationJobsGt) {
        this.maxReplicationJobsGt = maxReplicationJobsGt;
    }

    public ReplicationServiceWhereInput maxReplicationJobsGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_REPLICATION_JOBS_GT);
        return this;
    }

    public ReplicationServiceWhereInput maxReplicationJobsGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_REPLICATION_JOBS_GT);
        return this;
    }

    public void setMaxReplicationJobsGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_REPLICATION_JOBS_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_REPLICATION_JOBS_GT);
        }
    }

    public boolean getMaxReplicationJobsGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_REPLICATION_JOBS_GT);
    }

    public ReplicationServiceWhereInput maxReplicationJobsGte(Integer maxReplicationJobsGte) {

        this.maxReplicationJobsGte = maxReplicationJobsGte;
        return this;
    }

    /**
     * Get maxReplicationJobsGte
     *
     * @return maxReplicationJobsGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMaxReplicationJobsGte() {
        return maxReplicationJobsGte;
    }

    public void setMaxReplicationJobsGte(Integer maxReplicationJobsGte) {
        this.maxReplicationJobsGte = maxReplicationJobsGte;
    }

    public ReplicationServiceWhereInput maxReplicationJobsGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_REPLICATION_JOBS_GTE);
        return this;
    }

    public ReplicationServiceWhereInput maxReplicationJobsGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_REPLICATION_JOBS_GTE);
        return this;
    }

    public void setMaxReplicationJobsGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_REPLICATION_JOBS_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_REPLICATION_JOBS_GTE);
        }
    }

    public boolean getMaxReplicationJobsGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_REPLICATION_JOBS_GTE);
    }

    public ReplicationServiceWhereInput maxReplicationJobsIn(List<Integer> maxReplicationJobsIn) {

        this.maxReplicationJobsIn = maxReplicationJobsIn;
        return this;
    }

    public ReplicationServiceWhereInput addMaxReplicationJobsInItem(
            Integer maxReplicationJobsInItem) {
        if (this.maxReplicationJobsIn == null) {
            this.maxReplicationJobsIn = new ArrayList<Integer>();
        }
        this.maxReplicationJobsIn.add(maxReplicationJobsInItem);
        return this;
    }

    /**
     * Get maxReplicationJobsIn
     *
     * @return maxReplicationJobsIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getMaxReplicationJobsIn() {
        return maxReplicationJobsIn;
    }

    public void setMaxReplicationJobsIn(List<Integer> maxReplicationJobsIn) {
        this.maxReplicationJobsIn = maxReplicationJobsIn;
    }

    public ReplicationServiceWhereInput maxReplicationJobsIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_REPLICATION_JOBS_IN);
        return this;
    }

    public ReplicationServiceWhereInput maxReplicationJobsIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_REPLICATION_JOBS_IN);
        return this;
    }

    public void setMaxReplicationJobsIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_REPLICATION_JOBS_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_REPLICATION_JOBS_IN);
        }
    }

    public boolean getMaxReplicationJobsIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_REPLICATION_JOBS_IN);
    }

    public ReplicationServiceWhereInput maxReplicationJobsLt(Integer maxReplicationJobsLt) {

        this.maxReplicationJobsLt = maxReplicationJobsLt;
        return this;
    }

    /**
     * Get maxReplicationJobsLt
     *
     * @return maxReplicationJobsLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMaxReplicationJobsLt() {
        return maxReplicationJobsLt;
    }

    public void setMaxReplicationJobsLt(Integer maxReplicationJobsLt) {
        this.maxReplicationJobsLt = maxReplicationJobsLt;
    }

    public ReplicationServiceWhereInput maxReplicationJobsLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_REPLICATION_JOBS_LT);
        return this;
    }

    public ReplicationServiceWhereInput maxReplicationJobsLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_REPLICATION_JOBS_LT);
        return this;
    }

    public void setMaxReplicationJobsLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_REPLICATION_JOBS_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_REPLICATION_JOBS_LT);
        }
    }

    public boolean getMaxReplicationJobsLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_REPLICATION_JOBS_LT);
    }

    public ReplicationServiceWhereInput maxReplicationJobsLte(Integer maxReplicationJobsLte) {

        this.maxReplicationJobsLte = maxReplicationJobsLte;
        return this;
    }

    /**
     * Get maxReplicationJobsLte
     *
     * @return maxReplicationJobsLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMaxReplicationJobsLte() {
        return maxReplicationJobsLte;
    }

    public void setMaxReplicationJobsLte(Integer maxReplicationJobsLte) {
        this.maxReplicationJobsLte = maxReplicationJobsLte;
    }

    public ReplicationServiceWhereInput maxReplicationJobsLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_REPLICATION_JOBS_LTE);
        return this;
    }

    public ReplicationServiceWhereInput maxReplicationJobsLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_REPLICATION_JOBS_LTE);
        return this;
    }

    public void setMaxReplicationJobsLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_REPLICATION_JOBS_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_REPLICATION_JOBS_LTE);
        }
    }

    public boolean getMaxReplicationJobsLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_REPLICATION_JOBS_LTE);
    }

    public ReplicationServiceWhereInput maxReplicationJobsNot(Integer maxReplicationJobsNot) {

        this.maxReplicationJobsNot = maxReplicationJobsNot;
        return this;
    }

    /**
     * Get maxReplicationJobsNot
     *
     * @return maxReplicationJobsNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMaxReplicationJobsNot() {
        return maxReplicationJobsNot;
    }

    public void setMaxReplicationJobsNot(Integer maxReplicationJobsNot) {
        this.maxReplicationJobsNot = maxReplicationJobsNot;
    }

    public ReplicationServiceWhereInput maxReplicationJobsNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_REPLICATION_JOBS_NOT);
        return this;
    }

    public ReplicationServiceWhereInput maxReplicationJobsNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_REPLICATION_JOBS_NOT);
        return this;
    }

    public void setMaxReplicationJobsNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_REPLICATION_JOBS_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_REPLICATION_JOBS_NOT);
        }
    }

    public boolean getMaxReplicationJobsNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_REPLICATION_JOBS_NOT);
    }

    public ReplicationServiceWhereInput maxReplicationJobsNotIn(
            List<Integer> maxReplicationJobsNotIn) {

        this.maxReplicationJobsNotIn = maxReplicationJobsNotIn;
        return this;
    }

    public ReplicationServiceWhereInput addMaxReplicationJobsNotInItem(
            Integer maxReplicationJobsNotInItem) {
        if (this.maxReplicationJobsNotIn == null) {
            this.maxReplicationJobsNotIn = new ArrayList<Integer>();
        }
        this.maxReplicationJobsNotIn.add(maxReplicationJobsNotInItem);
        return this;
    }

    /**
     * Get maxReplicationJobsNotIn
     *
     * @return maxReplicationJobsNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getMaxReplicationJobsNotIn() {
        return maxReplicationJobsNotIn;
    }

    public void setMaxReplicationJobsNotIn(List<Integer> maxReplicationJobsNotIn) {
        this.maxReplicationJobsNotIn = maxReplicationJobsNotIn;
    }

    public ReplicationServiceWhereInput maxReplicationJobsNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_REPLICATION_JOBS_NOT_IN);
        return this;
    }

    public ReplicationServiceWhereInput maxReplicationJobsNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_REPLICATION_JOBS_NOT_IN);
        return this;
    }

    public void setMaxReplicationJobsNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_REPLICATION_JOBS_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_REPLICATION_JOBS_NOT_IN);
        }
    }

    public boolean getMaxReplicationJobsNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_REPLICATION_JOBS_NOT_IN);
    }

    public ReplicationServiceWhereInput maxReplicationSpeedLimit(Double maxReplicationSpeedLimit) {

        this.maxReplicationSpeedLimit = maxReplicationSpeedLimit;
        return this;
    }

    /**
     * Get maxReplicationSpeedLimit
     *
     * @return maxReplicationSpeedLimit
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getMaxReplicationSpeedLimit() {
        return maxReplicationSpeedLimit;
    }

    public void setMaxReplicationSpeedLimit(Double maxReplicationSpeedLimit) {
        this.maxReplicationSpeedLimit = maxReplicationSpeedLimit;
    }

    public ReplicationServiceWhereInput maxReplicationSpeedLimit_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_REPLICATION_SPEED_LIMIT);
        return this;
    }

    public ReplicationServiceWhereInput maxReplicationSpeedLimit_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_REPLICATION_SPEED_LIMIT);
        return this;
    }

    public void setMaxReplicationSpeedLimit_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_REPLICATION_SPEED_LIMIT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_REPLICATION_SPEED_LIMIT);
        }
    }

    public boolean getMaxReplicationSpeedLimit_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_REPLICATION_SPEED_LIMIT);
    }

    public ReplicationServiceWhereInput maxReplicationSpeedLimitGt(
            Double maxReplicationSpeedLimitGt) {

        this.maxReplicationSpeedLimitGt = maxReplicationSpeedLimitGt;
        return this;
    }

    /**
     * Get maxReplicationSpeedLimitGt
     *
     * @return maxReplicationSpeedLimitGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getMaxReplicationSpeedLimitGt() {
        return maxReplicationSpeedLimitGt;
    }

    public void setMaxReplicationSpeedLimitGt(Double maxReplicationSpeedLimitGt) {
        this.maxReplicationSpeedLimitGt = maxReplicationSpeedLimitGt;
    }

    public ReplicationServiceWhereInput maxReplicationSpeedLimitGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_REPLICATION_SPEED_LIMIT_GT);
        return this;
    }

    public ReplicationServiceWhereInput maxReplicationSpeedLimitGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_REPLICATION_SPEED_LIMIT_GT);
        return this;
    }

    public void setMaxReplicationSpeedLimitGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_REPLICATION_SPEED_LIMIT_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_REPLICATION_SPEED_LIMIT_GT);
        }
    }

    public boolean getMaxReplicationSpeedLimitGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_REPLICATION_SPEED_LIMIT_GT);
    }

    public ReplicationServiceWhereInput maxReplicationSpeedLimitGte(
            Double maxReplicationSpeedLimitGte) {

        this.maxReplicationSpeedLimitGte = maxReplicationSpeedLimitGte;
        return this;
    }

    /**
     * Get maxReplicationSpeedLimitGte
     *
     * @return maxReplicationSpeedLimitGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getMaxReplicationSpeedLimitGte() {
        return maxReplicationSpeedLimitGte;
    }

    public void setMaxReplicationSpeedLimitGte(Double maxReplicationSpeedLimitGte) {
        this.maxReplicationSpeedLimitGte = maxReplicationSpeedLimitGte;
    }

    public ReplicationServiceWhereInput maxReplicationSpeedLimitGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_REPLICATION_SPEED_LIMIT_GTE);
        return this;
    }

    public ReplicationServiceWhereInput maxReplicationSpeedLimitGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_REPLICATION_SPEED_LIMIT_GTE);
        return this;
    }

    public void setMaxReplicationSpeedLimitGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_REPLICATION_SPEED_LIMIT_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_REPLICATION_SPEED_LIMIT_GTE);
        }
    }

    public boolean getMaxReplicationSpeedLimitGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_REPLICATION_SPEED_LIMIT_GTE);
    }

    public ReplicationServiceWhereInput maxReplicationSpeedLimitIn(
            List<Double> maxReplicationSpeedLimitIn) {

        this.maxReplicationSpeedLimitIn = maxReplicationSpeedLimitIn;
        return this;
    }

    public ReplicationServiceWhereInput addMaxReplicationSpeedLimitInItem(
            Double maxReplicationSpeedLimitInItem) {
        if (this.maxReplicationSpeedLimitIn == null) {
            this.maxReplicationSpeedLimitIn = new ArrayList<Double>();
        }
        this.maxReplicationSpeedLimitIn.add(maxReplicationSpeedLimitInItem);
        return this;
    }

    /**
     * Get maxReplicationSpeedLimitIn
     *
     * @return maxReplicationSpeedLimitIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Double> getMaxReplicationSpeedLimitIn() {
        return maxReplicationSpeedLimitIn;
    }

    public void setMaxReplicationSpeedLimitIn(List<Double> maxReplicationSpeedLimitIn) {
        this.maxReplicationSpeedLimitIn = maxReplicationSpeedLimitIn;
    }

    public ReplicationServiceWhereInput maxReplicationSpeedLimitIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_REPLICATION_SPEED_LIMIT_IN);
        return this;
    }

    public ReplicationServiceWhereInput maxReplicationSpeedLimitIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_REPLICATION_SPEED_LIMIT_IN);
        return this;
    }

    public void setMaxReplicationSpeedLimitIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_REPLICATION_SPEED_LIMIT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_REPLICATION_SPEED_LIMIT_IN);
        }
    }

    public boolean getMaxReplicationSpeedLimitIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_REPLICATION_SPEED_LIMIT_IN);
    }

    public ReplicationServiceWhereInput maxReplicationSpeedLimitLt(
            Double maxReplicationSpeedLimitLt) {

        this.maxReplicationSpeedLimitLt = maxReplicationSpeedLimitLt;
        return this;
    }

    /**
     * Get maxReplicationSpeedLimitLt
     *
     * @return maxReplicationSpeedLimitLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getMaxReplicationSpeedLimitLt() {
        return maxReplicationSpeedLimitLt;
    }

    public void setMaxReplicationSpeedLimitLt(Double maxReplicationSpeedLimitLt) {
        this.maxReplicationSpeedLimitLt = maxReplicationSpeedLimitLt;
    }

    public ReplicationServiceWhereInput maxReplicationSpeedLimitLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_REPLICATION_SPEED_LIMIT_LT);
        return this;
    }

    public ReplicationServiceWhereInput maxReplicationSpeedLimitLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_REPLICATION_SPEED_LIMIT_LT);
        return this;
    }

    public void setMaxReplicationSpeedLimitLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_REPLICATION_SPEED_LIMIT_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_REPLICATION_SPEED_LIMIT_LT);
        }
    }

    public boolean getMaxReplicationSpeedLimitLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_REPLICATION_SPEED_LIMIT_LT);
    }

    public ReplicationServiceWhereInput maxReplicationSpeedLimitLte(
            Double maxReplicationSpeedLimitLte) {

        this.maxReplicationSpeedLimitLte = maxReplicationSpeedLimitLte;
        return this;
    }

    /**
     * Get maxReplicationSpeedLimitLte
     *
     * @return maxReplicationSpeedLimitLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getMaxReplicationSpeedLimitLte() {
        return maxReplicationSpeedLimitLte;
    }

    public void setMaxReplicationSpeedLimitLte(Double maxReplicationSpeedLimitLte) {
        this.maxReplicationSpeedLimitLte = maxReplicationSpeedLimitLte;
    }

    public ReplicationServiceWhereInput maxReplicationSpeedLimitLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_REPLICATION_SPEED_LIMIT_LTE);
        return this;
    }

    public ReplicationServiceWhereInput maxReplicationSpeedLimitLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_REPLICATION_SPEED_LIMIT_LTE);
        return this;
    }

    public void setMaxReplicationSpeedLimitLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_REPLICATION_SPEED_LIMIT_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_REPLICATION_SPEED_LIMIT_LTE);
        }
    }

    public boolean getMaxReplicationSpeedLimitLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_REPLICATION_SPEED_LIMIT_LTE);
    }

    public ReplicationServiceWhereInput maxReplicationSpeedLimitNot(
            Double maxReplicationSpeedLimitNot) {

        this.maxReplicationSpeedLimitNot = maxReplicationSpeedLimitNot;
        return this;
    }

    /**
     * Get maxReplicationSpeedLimitNot
     *
     * @return maxReplicationSpeedLimitNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getMaxReplicationSpeedLimitNot() {
        return maxReplicationSpeedLimitNot;
    }

    public void setMaxReplicationSpeedLimitNot(Double maxReplicationSpeedLimitNot) {
        this.maxReplicationSpeedLimitNot = maxReplicationSpeedLimitNot;
    }

    public ReplicationServiceWhereInput maxReplicationSpeedLimitNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_REPLICATION_SPEED_LIMIT_NOT);
        return this;
    }

    public ReplicationServiceWhereInput maxReplicationSpeedLimitNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_REPLICATION_SPEED_LIMIT_NOT);
        return this;
    }

    public void setMaxReplicationSpeedLimitNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_REPLICATION_SPEED_LIMIT_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_REPLICATION_SPEED_LIMIT_NOT);
        }
    }

    public boolean getMaxReplicationSpeedLimitNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_REPLICATION_SPEED_LIMIT_NOT);
    }

    public ReplicationServiceWhereInput maxReplicationSpeedLimitNotIn(
            List<Double> maxReplicationSpeedLimitNotIn) {

        this.maxReplicationSpeedLimitNotIn = maxReplicationSpeedLimitNotIn;
        return this;
    }

    public ReplicationServiceWhereInput addMaxReplicationSpeedLimitNotInItem(
            Double maxReplicationSpeedLimitNotInItem) {
        if (this.maxReplicationSpeedLimitNotIn == null) {
            this.maxReplicationSpeedLimitNotIn = new ArrayList<Double>();
        }
        this.maxReplicationSpeedLimitNotIn.add(maxReplicationSpeedLimitNotInItem);
        return this;
    }

    /**
     * Get maxReplicationSpeedLimitNotIn
     *
     * @return maxReplicationSpeedLimitNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Double> getMaxReplicationSpeedLimitNotIn() {
        return maxReplicationSpeedLimitNotIn;
    }

    public void setMaxReplicationSpeedLimitNotIn(List<Double> maxReplicationSpeedLimitNotIn) {
        this.maxReplicationSpeedLimitNotIn = maxReplicationSpeedLimitNotIn;
    }

    public ReplicationServiceWhereInput maxReplicationSpeedLimitNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_REPLICATION_SPEED_LIMIT_NOT_IN);
        return this;
    }

    public ReplicationServiceWhereInput maxReplicationSpeedLimitNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_REPLICATION_SPEED_LIMIT_NOT_IN);
        return this;
    }

    public void setMaxReplicationSpeedLimitNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_REPLICATION_SPEED_LIMIT_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_REPLICATION_SPEED_LIMIT_NOT_IN);
        }
    }

    public boolean getMaxReplicationSpeedLimitNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_REPLICATION_SPEED_LIMIT_NOT_IN);
    }

    public ReplicationServiceWhereInput maxRetryTimes(Integer maxRetryTimes) {

        this.maxRetryTimes = maxRetryTimes;
        return this;
    }

    /**
     * Get maxRetryTimes
     *
     * @return maxRetryTimes
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMaxRetryTimes() {
        return maxRetryTimes;
    }

    public void setMaxRetryTimes(Integer maxRetryTimes) {
        this.maxRetryTimes = maxRetryTimes;
    }

    public ReplicationServiceWhereInput maxRetryTimes_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_RETRY_TIMES);
        return this;
    }

    public ReplicationServiceWhereInput maxRetryTimes_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_RETRY_TIMES);
        return this;
    }

    public void setMaxRetryTimes_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_RETRY_TIMES);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_RETRY_TIMES);
        }
    }

    public boolean getMaxRetryTimes_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_RETRY_TIMES);
    }

    public ReplicationServiceWhereInput maxRetryTimesGt(Integer maxRetryTimesGt) {

        this.maxRetryTimesGt = maxRetryTimesGt;
        return this;
    }

    /**
     * Get maxRetryTimesGt
     *
     * @return maxRetryTimesGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMaxRetryTimesGt() {
        return maxRetryTimesGt;
    }

    public void setMaxRetryTimesGt(Integer maxRetryTimesGt) {
        this.maxRetryTimesGt = maxRetryTimesGt;
    }

    public ReplicationServiceWhereInput maxRetryTimesGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_RETRY_TIMES_GT);
        return this;
    }

    public ReplicationServiceWhereInput maxRetryTimesGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_RETRY_TIMES_GT);
        return this;
    }

    public void setMaxRetryTimesGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_RETRY_TIMES_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_RETRY_TIMES_GT);
        }
    }

    public boolean getMaxRetryTimesGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_RETRY_TIMES_GT);
    }

    public ReplicationServiceWhereInput maxRetryTimesGte(Integer maxRetryTimesGte) {

        this.maxRetryTimesGte = maxRetryTimesGte;
        return this;
    }

    /**
     * Get maxRetryTimesGte
     *
     * @return maxRetryTimesGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMaxRetryTimesGte() {
        return maxRetryTimesGte;
    }

    public void setMaxRetryTimesGte(Integer maxRetryTimesGte) {
        this.maxRetryTimesGte = maxRetryTimesGte;
    }

    public ReplicationServiceWhereInput maxRetryTimesGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_RETRY_TIMES_GTE);
        return this;
    }

    public ReplicationServiceWhereInput maxRetryTimesGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_RETRY_TIMES_GTE);
        return this;
    }

    public void setMaxRetryTimesGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_RETRY_TIMES_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_RETRY_TIMES_GTE);
        }
    }

    public boolean getMaxRetryTimesGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_RETRY_TIMES_GTE);
    }

    public ReplicationServiceWhereInput maxRetryTimesIn(List<Integer> maxRetryTimesIn) {

        this.maxRetryTimesIn = maxRetryTimesIn;
        return this;
    }

    public ReplicationServiceWhereInput addMaxRetryTimesInItem(Integer maxRetryTimesInItem) {
        if (this.maxRetryTimesIn == null) {
            this.maxRetryTimesIn = new ArrayList<Integer>();
        }
        this.maxRetryTimesIn.add(maxRetryTimesInItem);
        return this;
    }

    /**
     * Get maxRetryTimesIn
     *
     * @return maxRetryTimesIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getMaxRetryTimesIn() {
        return maxRetryTimesIn;
    }

    public void setMaxRetryTimesIn(List<Integer> maxRetryTimesIn) {
        this.maxRetryTimesIn = maxRetryTimesIn;
    }

    public ReplicationServiceWhereInput maxRetryTimesIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_RETRY_TIMES_IN);
        return this;
    }

    public ReplicationServiceWhereInput maxRetryTimesIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_RETRY_TIMES_IN);
        return this;
    }

    public void setMaxRetryTimesIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_RETRY_TIMES_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_RETRY_TIMES_IN);
        }
    }

    public boolean getMaxRetryTimesIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_RETRY_TIMES_IN);
    }

    public ReplicationServiceWhereInput maxRetryTimesLt(Integer maxRetryTimesLt) {

        this.maxRetryTimesLt = maxRetryTimesLt;
        return this;
    }

    /**
     * Get maxRetryTimesLt
     *
     * @return maxRetryTimesLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMaxRetryTimesLt() {
        return maxRetryTimesLt;
    }

    public void setMaxRetryTimesLt(Integer maxRetryTimesLt) {
        this.maxRetryTimesLt = maxRetryTimesLt;
    }

    public ReplicationServiceWhereInput maxRetryTimesLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_RETRY_TIMES_LT);
        return this;
    }

    public ReplicationServiceWhereInput maxRetryTimesLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_RETRY_TIMES_LT);
        return this;
    }

    public void setMaxRetryTimesLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_RETRY_TIMES_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_RETRY_TIMES_LT);
        }
    }

    public boolean getMaxRetryTimesLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_RETRY_TIMES_LT);
    }

    public ReplicationServiceWhereInput maxRetryTimesLte(Integer maxRetryTimesLte) {

        this.maxRetryTimesLte = maxRetryTimesLte;
        return this;
    }

    /**
     * Get maxRetryTimesLte
     *
     * @return maxRetryTimesLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMaxRetryTimesLte() {
        return maxRetryTimesLte;
    }

    public void setMaxRetryTimesLte(Integer maxRetryTimesLte) {
        this.maxRetryTimesLte = maxRetryTimesLte;
    }

    public ReplicationServiceWhereInput maxRetryTimesLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_RETRY_TIMES_LTE);
        return this;
    }

    public ReplicationServiceWhereInput maxRetryTimesLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_RETRY_TIMES_LTE);
        return this;
    }

    public void setMaxRetryTimesLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_RETRY_TIMES_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_RETRY_TIMES_LTE);
        }
    }

    public boolean getMaxRetryTimesLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_RETRY_TIMES_LTE);
    }

    public ReplicationServiceWhereInput maxRetryTimesNot(Integer maxRetryTimesNot) {

        this.maxRetryTimesNot = maxRetryTimesNot;
        return this;
    }

    /**
     * Get maxRetryTimesNot
     *
     * @return maxRetryTimesNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMaxRetryTimesNot() {
        return maxRetryTimesNot;
    }

    public void setMaxRetryTimesNot(Integer maxRetryTimesNot) {
        this.maxRetryTimesNot = maxRetryTimesNot;
    }

    public ReplicationServiceWhereInput maxRetryTimesNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_RETRY_TIMES_NOT);
        return this;
    }

    public ReplicationServiceWhereInput maxRetryTimesNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_RETRY_TIMES_NOT);
        return this;
    }

    public void setMaxRetryTimesNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_RETRY_TIMES_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_RETRY_TIMES_NOT);
        }
    }

    public boolean getMaxRetryTimesNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_RETRY_TIMES_NOT);
    }

    public ReplicationServiceWhereInput maxRetryTimesNotIn(List<Integer> maxRetryTimesNotIn) {

        this.maxRetryTimesNotIn = maxRetryTimesNotIn;
        return this;
    }

    public ReplicationServiceWhereInput addMaxRetryTimesNotInItem(Integer maxRetryTimesNotInItem) {
        if (this.maxRetryTimesNotIn == null) {
            this.maxRetryTimesNotIn = new ArrayList<Integer>();
        }
        this.maxRetryTimesNotIn.add(maxRetryTimesNotInItem);
        return this;
    }

    /**
     * Get maxRetryTimesNotIn
     *
     * @return maxRetryTimesNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getMaxRetryTimesNotIn() {
        return maxRetryTimesNotIn;
    }

    public void setMaxRetryTimesNotIn(List<Integer> maxRetryTimesNotIn) {
        this.maxRetryTimesNotIn = maxRetryTimesNotIn;
    }

    public ReplicationServiceWhereInput maxRetryTimesNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_RETRY_TIMES_NOT_IN);
        return this;
    }

    public ReplicationServiceWhereInput maxRetryTimesNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_RETRY_TIMES_NOT_IN);
        return this;
    }

    public void setMaxRetryTimesNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_RETRY_TIMES_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_RETRY_TIMES_NOT_IN);
        }
    }

    public boolean getMaxRetryTimesNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_RETRY_TIMES_NOT_IN);
    }

    public ReplicationServiceWhereInput name(String name) {

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

    public ReplicationServiceWhereInput name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public ReplicationServiceWhereInput name_ExplictlyNonNull() {
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

    public ReplicationServiceWhereInput nameContains(String nameContains) {

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

    public ReplicationServiceWhereInput nameContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_CONTAINS);
        return this;
    }

    public ReplicationServiceWhereInput nameContains_ExplictlyNonNull() {
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

    public ReplicationServiceWhereInput nameEndsWith(String nameEndsWith) {

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

    public ReplicationServiceWhereInput nameEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_ENDS_WITH);
        return this;
    }

    public ReplicationServiceWhereInput nameEndsWith_ExplictlyNonNull() {
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

    public ReplicationServiceWhereInput nameGt(String nameGt) {

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

    public ReplicationServiceWhereInput nameGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_GT);
        return this;
    }

    public ReplicationServiceWhereInput nameGt_ExplictlyNonNull() {
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

    public ReplicationServiceWhereInput nameGte(String nameGte) {

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

    public ReplicationServiceWhereInput nameGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_GTE);
        return this;
    }

    public ReplicationServiceWhereInput nameGte_ExplictlyNonNull() {
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

    public ReplicationServiceWhereInput nameIn(List<String> nameIn) {

        this.nameIn = nameIn;
        return this;
    }

    public ReplicationServiceWhereInput addNameInItem(String nameInItem) {
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

    public ReplicationServiceWhereInput nameIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_IN);
        return this;
    }

    public ReplicationServiceWhereInput nameIn_ExplictlyNonNull() {
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

    public ReplicationServiceWhereInput nameLt(String nameLt) {

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

    public ReplicationServiceWhereInput nameLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_LT);
        return this;
    }

    public ReplicationServiceWhereInput nameLt_ExplictlyNonNull() {
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

    public ReplicationServiceWhereInput nameLte(String nameLte) {

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

    public ReplicationServiceWhereInput nameLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_LTE);
        return this;
    }

    public ReplicationServiceWhereInput nameLte_ExplictlyNonNull() {
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

    public ReplicationServiceWhereInput nameNot(String nameNot) {

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

    public ReplicationServiceWhereInput nameNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT);
        return this;
    }

    public ReplicationServiceWhereInput nameNot_ExplictlyNonNull() {
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

    public ReplicationServiceWhereInput nameNotContains(String nameNotContains) {

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

    public ReplicationServiceWhereInput nameNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_CONTAINS);
        return this;
    }

    public ReplicationServiceWhereInput nameNotContains_ExplictlyNonNull() {
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

    public ReplicationServiceWhereInput nameNotEndsWith(String nameNotEndsWith) {

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

    public ReplicationServiceWhereInput nameNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_ENDS_WITH);
        return this;
    }

    public ReplicationServiceWhereInput nameNotEndsWith_ExplictlyNonNull() {
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

    public ReplicationServiceWhereInput nameNotIn(List<String> nameNotIn) {

        this.nameNotIn = nameNotIn;
        return this;
    }

    public ReplicationServiceWhereInput addNameNotInItem(String nameNotInItem) {
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

    public ReplicationServiceWhereInput nameNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_IN);
        return this;
    }

    public ReplicationServiceWhereInput nameNotIn_ExplictlyNonNull() {
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

    public ReplicationServiceWhereInput nameNotStartsWith(String nameNotStartsWith) {

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

    public ReplicationServiceWhereInput nameNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_STARTS_WITH);
        return this;
    }

    public ReplicationServiceWhereInput nameNotStartsWith_ExplictlyNonNull() {
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

    public ReplicationServiceWhereInput nameStartsWith(String nameStartsWith) {

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

    public ReplicationServiceWhereInput nameStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_STARTS_WITH);
        return this;
    }

    public ReplicationServiceWhereInput nameStartsWith_ExplictlyNonNull() {
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

    public ReplicationServiceWhereInput permanentFailoverExecutionEvery(
            PermanentFailoverExecutionWhereInput permanentFailoverExecutionEvery) {

        this.permanentFailoverExecutionEvery = permanentFailoverExecutionEvery;
        return this;
    }

    /**
     * Get permanentFailoverExecutionEvery
     *
     * @return permanentFailoverExecutionEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public PermanentFailoverExecutionWhereInput getPermanentFailoverExecutionEvery() {
        return permanentFailoverExecutionEvery;
    }

    public void setPermanentFailoverExecutionEvery(
            PermanentFailoverExecutionWhereInput permanentFailoverExecutionEvery) {
        this.permanentFailoverExecutionEvery = permanentFailoverExecutionEvery;
    }

    public ReplicationServiceWhereInput permanentFailoverExecutionEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PERMANENT_FAILOVER_EXECUTION_EVERY);
        return this;
    }

    public ReplicationServiceWhereInput permanentFailoverExecutionEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PERMANENT_FAILOVER_EXECUTION_EVERY);
        return this;
    }

    public void setPermanentFailoverExecutionEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PERMANENT_FAILOVER_EXECUTION_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PERMANENT_FAILOVER_EXECUTION_EVERY);
        }
    }

    public boolean getPermanentFailoverExecutionEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PERMANENT_FAILOVER_EXECUTION_EVERY);
    }

    public ReplicationServiceWhereInput permanentFailoverExecutionNone(
            PermanentFailoverExecutionWhereInput permanentFailoverExecutionNone) {

        this.permanentFailoverExecutionNone = permanentFailoverExecutionNone;
        return this;
    }

    /**
     * Get permanentFailoverExecutionNone
     *
     * @return permanentFailoverExecutionNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public PermanentFailoverExecutionWhereInput getPermanentFailoverExecutionNone() {
        return permanentFailoverExecutionNone;
    }

    public void setPermanentFailoverExecutionNone(
            PermanentFailoverExecutionWhereInput permanentFailoverExecutionNone) {
        this.permanentFailoverExecutionNone = permanentFailoverExecutionNone;
    }

    public ReplicationServiceWhereInput permanentFailoverExecutionNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PERMANENT_FAILOVER_EXECUTION_NONE);
        return this;
    }

    public ReplicationServiceWhereInput permanentFailoverExecutionNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PERMANENT_FAILOVER_EXECUTION_NONE);
        return this;
    }

    public void setPermanentFailoverExecutionNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PERMANENT_FAILOVER_EXECUTION_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PERMANENT_FAILOVER_EXECUTION_NONE);
        }
    }

    public boolean getPermanentFailoverExecutionNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PERMANENT_FAILOVER_EXECUTION_NONE);
    }

    public ReplicationServiceWhereInput permanentFailoverExecutionSome(
            PermanentFailoverExecutionWhereInput permanentFailoverExecutionSome) {

        this.permanentFailoverExecutionSome = permanentFailoverExecutionSome;
        return this;
    }

    /**
     * Get permanentFailoverExecutionSome
     *
     * @return permanentFailoverExecutionSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public PermanentFailoverExecutionWhereInput getPermanentFailoverExecutionSome() {
        return permanentFailoverExecutionSome;
    }

    public void setPermanentFailoverExecutionSome(
            PermanentFailoverExecutionWhereInput permanentFailoverExecutionSome) {
        this.permanentFailoverExecutionSome = permanentFailoverExecutionSome;
    }

    public ReplicationServiceWhereInput permanentFailoverExecutionSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PERMANENT_FAILOVER_EXECUTION_SOME);
        return this;
    }

    public ReplicationServiceWhereInput permanentFailoverExecutionSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PERMANENT_FAILOVER_EXECUTION_SOME);
        return this;
    }

    public void setPermanentFailoverExecutionSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PERMANENT_FAILOVER_EXECUTION_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PERMANENT_FAILOVER_EXECUTION_SOME);
        }
    }

    public boolean getPermanentFailoverExecutionSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PERMANENT_FAILOVER_EXECUTION_SOME);
    }

    public ReplicationServiceWhereInput replicationClustersEvery(
            ClusterWhereInput replicationClustersEvery) {

        this.replicationClustersEvery = replicationClustersEvery;
        return this;
    }

    /**
     * Get replicationClustersEvery
     *
     * @return replicationClustersEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ClusterWhereInput getReplicationClustersEvery() {
        return replicationClustersEvery;
    }

    public void setReplicationClustersEvery(ClusterWhereInput replicationClustersEvery) {
        this.replicationClustersEvery = replicationClustersEvery;
    }

    public ReplicationServiceWhereInput replicationClustersEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICATION_CLUSTERS_EVERY);
        return this;
    }

    public ReplicationServiceWhereInput replicationClustersEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REPLICATION_CLUSTERS_EVERY);
        return this;
    }

    public void setReplicationClustersEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REPLICATION_CLUSTERS_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REPLICATION_CLUSTERS_EVERY);
        }
    }

    public boolean getReplicationClustersEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REPLICATION_CLUSTERS_EVERY);
    }

    public ReplicationServiceWhereInput replicationClustersNone(
            ClusterWhereInput replicationClustersNone) {

        this.replicationClustersNone = replicationClustersNone;
        return this;
    }

    /**
     * Get replicationClustersNone
     *
     * @return replicationClustersNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ClusterWhereInput getReplicationClustersNone() {
        return replicationClustersNone;
    }

    public void setReplicationClustersNone(ClusterWhereInput replicationClustersNone) {
        this.replicationClustersNone = replicationClustersNone;
    }

    public ReplicationServiceWhereInput replicationClustersNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICATION_CLUSTERS_NONE);
        return this;
    }

    public ReplicationServiceWhereInput replicationClustersNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REPLICATION_CLUSTERS_NONE);
        return this;
    }

    public void setReplicationClustersNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REPLICATION_CLUSTERS_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REPLICATION_CLUSTERS_NONE);
        }
    }

    public boolean getReplicationClustersNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REPLICATION_CLUSTERS_NONE);
    }

    public ReplicationServiceWhereInput replicationClustersSome(
            ClusterWhereInput replicationClustersSome) {

        this.replicationClustersSome = replicationClustersSome;
        return this;
    }

    /**
     * Get replicationClustersSome
     *
     * @return replicationClustersSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ClusterWhereInput getReplicationClustersSome() {
        return replicationClustersSome;
    }

    public void setReplicationClustersSome(ClusterWhereInput replicationClustersSome) {
        this.replicationClustersSome = replicationClustersSome;
    }

    public ReplicationServiceWhereInput replicationClustersSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICATION_CLUSTERS_SOME);
        return this;
    }

    public ReplicationServiceWhereInput replicationClustersSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REPLICATION_CLUSTERS_SOME);
        return this;
    }

    public void setReplicationClustersSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REPLICATION_CLUSTERS_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REPLICATION_CLUSTERS_SOME);
        }
    }

    public boolean getReplicationClustersSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REPLICATION_CLUSTERS_SOME);
    }

    public ReplicationServiceWhereInput replicationPlansEvery(
            ReplicationPlanWhereInput replicationPlansEvery) {

        this.replicationPlansEvery = replicationPlansEvery;
        return this;
    }

    /**
     * Get replicationPlansEvery
     *
     * @return replicationPlansEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ReplicationPlanWhereInput getReplicationPlansEvery() {
        return replicationPlansEvery;
    }

    public void setReplicationPlansEvery(ReplicationPlanWhereInput replicationPlansEvery) {
        this.replicationPlansEvery = replicationPlansEvery;
    }

    public ReplicationServiceWhereInput replicationPlansEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICATION_PLANS_EVERY);
        return this;
    }

    public ReplicationServiceWhereInput replicationPlansEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REPLICATION_PLANS_EVERY);
        return this;
    }

    public void setReplicationPlansEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REPLICATION_PLANS_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REPLICATION_PLANS_EVERY);
        }
    }

    public boolean getReplicationPlansEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REPLICATION_PLANS_EVERY);
    }

    public ReplicationServiceWhereInput replicationPlansNone(
            ReplicationPlanWhereInput replicationPlansNone) {

        this.replicationPlansNone = replicationPlansNone;
        return this;
    }

    /**
     * Get replicationPlansNone
     *
     * @return replicationPlansNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ReplicationPlanWhereInput getReplicationPlansNone() {
        return replicationPlansNone;
    }

    public void setReplicationPlansNone(ReplicationPlanWhereInput replicationPlansNone) {
        this.replicationPlansNone = replicationPlansNone;
    }

    public ReplicationServiceWhereInput replicationPlansNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICATION_PLANS_NONE);
        return this;
    }

    public ReplicationServiceWhereInput replicationPlansNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REPLICATION_PLANS_NONE);
        return this;
    }

    public void setReplicationPlansNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REPLICATION_PLANS_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REPLICATION_PLANS_NONE);
        }
    }

    public boolean getReplicationPlansNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REPLICATION_PLANS_NONE);
    }

    public ReplicationServiceWhereInput replicationPlansSome(
            ReplicationPlanWhereInput replicationPlansSome) {

        this.replicationPlansSome = replicationPlansSome;
        return this;
    }

    /**
     * Get replicationPlansSome
     *
     * @return replicationPlansSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ReplicationPlanWhereInput getReplicationPlansSome() {
        return replicationPlansSome;
    }

    public void setReplicationPlansSome(ReplicationPlanWhereInput replicationPlansSome) {
        this.replicationPlansSome = replicationPlansSome;
    }

    public ReplicationServiceWhereInput replicationPlansSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICATION_PLANS_SOME);
        return this;
    }

    public ReplicationServiceWhereInput replicationPlansSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REPLICATION_PLANS_SOME);
        return this;
    }

    public void setReplicationPlansSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REPLICATION_PLANS_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REPLICATION_PLANS_SOME);
        }
    }

    public boolean getReplicationPlansSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REPLICATION_PLANS_SOME);
    }

    public ReplicationServiceWhereInput retryInterval(Integer retryInterval) {

        this.retryInterval = retryInterval;
        return this;
    }

    /**
     * Get retryInterval
     *
     * @return retryInterval
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getRetryInterval() {
        return retryInterval;
    }

    public void setRetryInterval(Integer retryInterval) {
        this.retryInterval = retryInterval;
    }

    public ReplicationServiceWhereInput retryInterval_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RETRY_INTERVAL);
        return this;
    }

    public ReplicationServiceWhereInput retryInterval_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RETRY_INTERVAL);
        return this;
    }

    public void setRetryInterval_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RETRY_INTERVAL);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RETRY_INTERVAL);
        }
    }

    public boolean getRetryInterval_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RETRY_INTERVAL);
    }

    public ReplicationServiceWhereInput retryIntervalGt(Integer retryIntervalGt) {

        this.retryIntervalGt = retryIntervalGt;
        return this;
    }

    /**
     * Get retryIntervalGt
     *
     * @return retryIntervalGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getRetryIntervalGt() {
        return retryIntervalGt;
    }

    public void setRetryIntervalGt(Integer retryIntervalGt) {
        this.retryIntervalGt = retryIntervalGt;
    }

    public ReplicationServiceWhereInput retryIntervalGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RETRY_INTERVAL_GT);
        return this;
    }

    public ReplicationServiceWhereInput retryIntervalGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RETRY_INTERVAL_GT);
        return this;
    }

    public void setRetryIntervalGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RETRY_INTERVAL_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RETRY_INTERVAL_GT);
        }
    }

    public boolean getRetryIntervalGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RETRY_INTERVAL_GT);
    }

    public ReplicationServiceWhereInput retryIntervalGte(Integer retryIntervalGte) {

        this.retryIntervalGte = retryIntervalGte;
        return this;
    }

    /**
     * Get retryIntervalGte
     *
     * @return retryIntervalGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getRetryIntervalGte() {
        return retryIntervalGte;
    }

    public void setRetryIntervalGte(Integer retryIntervalGte) {
        this.retryIntervalGte = retryIntervalGte;
    }

    public ReplicationServiceWhereInput retryIntervalGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RETRY_INTERVAL_GTE);
        return this;
    }

    public ReplicationServiceWhereInput retryIntervalGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RETRY_INTERVAL_GTE);
        return this;
    }

    public void setRetryIntervalGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RETRY_INTERVAL_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RETRY_INTERVAL_GTE);
        }
    }

    public boolean getRetryIntervalGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RETRY_INTERVAL_GTE);
    }

    public ReplicationServiceWhereInput retryIntervalIn(List<Integer> retryIntervalIn) {

        this.retryIntervalIn = retryIntervalIn;
        return this;
    }

    public ReplicationServiceWhereInput addRetryIntervalInItem(Integer retryIntervalInItem) {
        if (this.retryIntervalIn == null) {
            this.retryIntervalIn = new ArrayList<Integer>();
        }
        this.retryIntervalIn.add(retryIntervalInItem);
        return this;
    }

    /**
     * Get retryIntervalIn
     *
     * @return retryIntervalIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getRetryIntervalIn() {
        return retryIntervalIn;
    }

    public void setRetryIntervalIn(List<Integer> retryIntervalIn) {
        this.retryIntervalIn = retryIntervalIn;
    }

    public ReplicationServiceWhereInput retryIntervalIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RETRY_INTERVAL_IN);
        return this;
    }

    public ReplicationServiceWhereInput retryIntervalIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RETRY_INTERVAL_IN);
        return this;
    }

    public void setRetryIntervalIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RETRY_INTERVAL_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RETRY_INTERVAL_IN);
        }
    }

    public boolean getRetryIntervalIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RETRY_INTERVAL_IN);
    }

    public ReplicationServiceWhereInput retryIntervalLt(Integer retryIntervalLt) {

        this.retryIntervalLt = retryIntervalLt;
        return this;
    }

    /**
     * Get retryIntervalLt
     *
     * @return retryIntervalLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getRetryIntervalLt() {
        return retryIntervalLt;
    }

    public void setRetryIntervalLt(Integer retryIntervalLt) {
        this.retryIntervalLt = retryIntervalLt;
    }

    public ReplicationServiceWhereInput retryIntervalLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RETRY_INTERVAL_LT);
        return this;
    }

    public ReplicationServiceWhereInput retryIntervalLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RETRY_INTERVAL_LT);
        return this;
    }

    public void setRetryIntervalLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RETRY_INTERVAL_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RETRY_INTERVAL_LT);
        }
    }

    public boolean getRetryIntervalLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RETRY_INTERVAL_LT);
    }

    public ReplicationServiceWhereInput retryIntervalLte(Integer retryIntervalLte) {

        this.retryIntervalLte = retryIntervalLte;
        return this;
    }

    /**
     * Get retryIntervalLte
     *
     * @return retryIntervalLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getRetryIntervalLte() {
        return retryIntervalLte;
    }

    public void setRetryIntervalLte(Integer retryIntervalLte) {
        this.retryIntervalLte = retryIntervalLte;
    }

    public ReplicationServiceWhereInput retryIntervalLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RETRY_INTERVAL_LTE);
        return this;
    }

    public ReplicationServiceWhereInput retryIntervalLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RETRY_INTERVAL_LTE);
        return this;
    }

    public void setRetryIntervalLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RETRY_INTERVAL_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RETRY_INTERVAL_LTE);
        }
    }

    public boolean getRetryIntervalLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RETRY_INTERVAL_LTE);
    }

    public ReplicationServiceWhereInput retryIntervalNot(Integer retryIntervalNot) {

        this.retryIntervalNot = retryIntervalNot;
        return this;
    }

    /**
     * Get retryIntervalNot
     *
     * @return retryIntervalNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getRetryIntervalNot() {
        return retryIntervalNot;
    }

    public void setRetryIntervalNot(Integer retryIntervalNot) {
        this.retryIntervalNot = retryIntervalNot;
    }

    public ReplicationServiceWhereInput retryIntervalNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RETRY_INTERVAL_NOT);
        return this;
    }

    public ReplicationServiceWhereInput retryIntervalNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RETRY_INTERVAL_NOT);
        return this;
    }

    public void setRetryIntervalNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RETRY_INTERVAL_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RETRY_INTERVAL_NOT);
        }
    }

    public boolean getRetryIntervalNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RETRY_INTERVAL_NOT);
    }

    public ReplicationServiceWhereInput retryIntervalNotIn(List<Integer> retryIntervalNotIn) {

        this.retryIntervalNotIn = retryIntervalNotIn;
        return this;
    }

    public ReplicationServiceWhereInput addRetryIntervalNotInItem(Integer retryIntervalNotInItem) {
        if (this.retryIntervalNotIn == null) {
            this.retryIntervalNotIn = new ArrayList<Integer>();
        }
        this.retryIntervalNotIn.add(retryIntervalNotInItem);
        return this;
    }

    /**
     * Get retryIntervalNotIn
     *
     * @return retryIntervalNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getRetryIntervalNotIn() {
        return retryIntervalNotIn;
    }

    public void setRetryIntervalNotIn(List<Integer> retryIntervalNotIn) {
        this.retryIntervalNotIn = retryIntervalNotIn;
    }

    public ReplicationServiceWhereInput retryIntervalNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RETRY_INTERVAL_NOT_IN);
        return this;
    }

    public ReplicationServiceWhereInput retryIntervalNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RETRY_INTERVAL_NOT_IN);
        return this;
    }

    public void setRetryIntervalNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RETRY_INTERVAL_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RETRY_INTERVAL_NOT_IN);
        }
    }

    public boolean getRetryIntervalNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RETRY_INTERVAL_NOT_IN);
    }

    public ReplicationServiceWhereInput updatedAt(String updatedAt) {

        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Get updatedAt
     *
     * @return updatedAt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public ReplicationServiceWhereInput updatedAt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPDATED_AT);
        return this;
    }

    public ReplicationServiceWhereInput updatedAt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UPDATED_AT);
        return this;
    }

    public void setUpdatedAt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UPDATED_AT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UPDATED_AT);
        }
    }

    public boolean getUpdatedAt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UPDATED_AT);
    }

    public ReplicationServiceWhereInput updatedAtGt(String updatedAtGt) {

        this.updatedAtGt = updatedAtGt;
        return this;
    }

    /**
     * Get updatedAtGt
     *
     * @return updatedAtGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUpdatedAtGt() {
        return updatedAtGt;
    }

    public void setUpdatedAtGt(String updatedAtGt) {
        this.updatedAtGt = updatedAtGt;
    }

    public ReplicationServiceWhereInput updatedAtGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPDATED_AT_GT);
        return this;
    }

    public ReplicationServiceWhereInput updatedAtGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UPDATED_AT_GT);
        return this;
    }

    public void setUpdatedAtGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UPDATED_AT_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UPDATED_AT_GT);
        }
    }

    public boolean getUpdatedAtGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UPDATED_AT_GT);
    }

    public ReplicationServiceWhereInput updatedAtGte(String updatedAtGte) {

        this.updatedAtGte = updatedAtGte;
        return this;
    }

    /**
     * Get updatedAtGte
     *
     * @return updatedAtGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUpdatedAtGte() {
        return updatedAtGte;
    }

    public void setUpdatedAtGte(String updatedAtGte) {
        this.updatedAtGte = updatedAtGte;
    }

    public ReplicationServiceWhereInput updatedAtGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPDATED_AT_GTE);
        return this;
    }

    public ReplicationServiceWhereInput updatedAtGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UPDATED_AT_GTE);
        return this;
    }

    public void setUpdatedAtGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UPDATED_AT_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UPDATED_AT_GTE);
        }
    }

    public boolean getUpdatedAtGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UPDATED_AT_GTE);
    }

    public ReplicationServiceWhereInput updatedAtIn(List<String> updatedAtIn) {

        this.updatedAtIn = updatedAtIn;
        return this;
    }

    public ReplicationServiceWhereInput addUpdatedAtInItem(String updatedAtInItem) {
        if (this.updatedAtIn == null) {
            this.updatedAtIn = new ArrayList<String>();
        }
        this.updatedAtIn.add(updatedAtInItem);
        return this;
    }

    /**
     * Get updatedAtIn
     *
     * @return updatedAtIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getUpdatedAtIn() {
        return updatedAtIn;
    }

    public void setUpdatedAtIn(List<String> updatedAtIn) {
        this.updatedAtIn = updatedAtIn;
    }

    public ReplicationServiceWhereInput updatedAtIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPDATED_AT_IN);
        return this;
    }

    public ReplicationServiceWhereInput updatedAtIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UPDATED_AT_IN);
        return this;
    }

    public void setUpdatedAtIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UPDATED_AT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UPDATED_AT_IN);
        }
    }

    public boolean getUpdatedAtIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UPDATED_AT_IN);
    }

    public ReplicationServiceWhereInput updatedAtLt(String updatedAtLt) {

        this.updatedAtLt = updatedAtLt;
        return this;
    }

    /**
     * Get updatedAtLt
     *
     * @return updatedAtLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUpdatedAtLt() {
        return updatedAtLt;
    }

    public void setUpdatedAtLt(String updatedAtLt) {
        this.updatedAtLt = updatedAtLt;
    }

    public ReplicationServiceWhereInput updatedAtLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPDATED_AT_LT);
        return this;
    }

    public ReplicationServiceWhereInput updatedAtLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UPDATED_AT_LT);
        return this;
    }

    public void setUpdatedAtLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UPDATED_AT_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UPDATED_AT_LT);
        }
    }

    public boolean getUpdatedAtLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UPDATED_AT_LT);
    }

    public ReplicationServiceWhereInput updatedAtLte(String updatedAtLte) {

        this.updatedAtLte = updatedAtLte;
        return this;
    }

    /**
     * Get updatedAtLte
     *
     * @return updatedAtLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUpdatedAtLte() {
        return updatedAtLte;
    }

    public void setUpdatedAtLte(String updatedAtLte) {
        this.updatedAtLte = updatedAtLte;
    }

    public ReplicationServiceWhereInput updatedAtLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPDATED_AT_LTE);
        return this;
    }

    public ReplicationServiceWhereInput updatedAtLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UPDATED_AT_LTE);
        return this;
    }

    public void setUpdatedAtLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UPDATED_AT_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UPDATED_AT_LTE);
        }
    }

    public boolean getUpdatedAtLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UPDATED_AT_LTE);
    }

    public ReplicationServiceWhereInput updatedAtNot(String updatedAtNot) {

        this.updatedAtNot = updatedAtNot;
        return this;
    }

    /**
     * Get updatedAtNot
     *
     * @return updatedAtNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getUpdatedAtNot() {
        return updatedAtNot;
    }

    public void setUpdatedAtNot(String updatedAtNot) {
        this.updatedAtNot = updatedAtNot;
    }

    public ReplicationServiceWhereInput updatedAtNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPDATED_AT_NOT);
        return this;
    }

    public ReplicationServiceWhereInput updatedAtNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UPDATED_AT_NOT);
        return this;
    }

    public void setUpdatedAtNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UPDATED_AT_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UPDATED_AT_NOT);
        }
    }

    public boolean getUpdatedAtNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UPDATED_AT_NOT);
    }

    public ReplicationServiceWhereInput updatedAtNotIn(List<String> updatedAtNotIn) {

        this.updatedAtNotIn = updatedAtNotIn;
        return this;
    }

    public ReplicationServiceWhereInput addUpdatedAtNotInItem(String updatedAtNotInItem) {
        if (this.updatedAtNotIn == null) {
            this.updatedAtNotIn = new ArrayList<String>();
        }
        this.updatedAtNotIn.add(updatedAtNotInItem);
        return this;
    }

    /**
     * Get updatedAtNotIn
     *
     * @return updatedAtNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getUpdatedAtNotIn() {
        return updatedAtNotIn;
    }

    public void setUpdatedAtNotIn(List<String> updatedAtNotIn) {
        this.updatedAtNotIn = updatedAtNotIn;
    }

    public ReplicationServiceWhereInput updatedAtNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPDATED_AT_NOT_IN);
        return this;
    }

    public ReplicationServiceWhereInput updatedAtNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_UPDATED_AT_NOT_IN);
        return this;
    }

    public void setUpdatedAtNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_UPDATED_AT_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_UPDATED_AT_NOT_IN);
        }
    }

    public boolean getUpdatedAtNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_UPDATED_AT_NOT_IN);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReplicationServiceWhereInput replicationServiceWhereInput =
                (ReplicationServiceWhereInput) o;
        return Objects.equals(this.AND, replicationServiceWhereInput.AND)
                && Objects.equals(this.NOT, replicationServiceWhereInput.NOT)
                && Objects.equals(this.OR, replicationServiceWhereInput.OR)
                && Objects.equals(this.application, replicationServiceWhereInput.application)
                && Objects.equals(this.createdAt, replicationServiceWhereInput.createdAt)
                && Objects.equals(this.createdAtGt, replicationServiceWhereInput.createdAtGt)
                && Objects.equals(this.createdAtGte, replicationServiceWhereInput.createdAtGte)
                && Objects.equals(this.createdAtIn, replicationServiceWhereInput.createdAtIn)
                && Objects.equals(this.createdAtLt, replicationServiceWhereInput.createdAtLt)
                && Objects.equals(this.createdAtLte, replicationServiceWhereInput.createdAtLte)
                && Objects.equals(this.createdAtNot, replicationServiceWhereInput.createdAtNot)
                && Objects.equals(this.createdAtNotIn, replicationServiceWhereInput.createdAtNotIn)
                && Objects.equals(this.description, replicationServiceWhereInput.description)
                && Objects.equals(
                        this.descriptionContains, replicationServiceWhereInput.descriptionContains)
                && Objects.equals(
                        this.descriptionEndsWith, replicationServiceWhereInput.descriptionEndsWith)
                && Objects.equals(this.descriptionGt, replicationServiceWhereInput.descriptionGt)
                && Objects.equals(this.descriptionGte, replicationServiceWhereInput.descriptionGte)
                && Objects.equals(this.descriptionIn, replicationServiceWhereInput.descriptionIn)
                && Objects.equals(this.descriptionLt, replicationServiceWhereInput.descriptionLt)
                && Objects.equals(this.descriptionLte, replicationServiceWhereInput.descriptionLte)
                && Objects.equals(this.descriptionNot, replicationServiceWhereInput.descriptionNot)
                && Objects.equals(
                        this.descriptionNotContains,
                        replicationServiceWhereInput.descriptionNotContains)
                && Objects.equals(
                        this.descriptionNotEndsWith,
                        replicationServiceWhereInput.descriptionNotEndsWith)
                && Objects.equals(
                        this.descriptionNotIn, replicationServiceWhereInput.descriptionNotIn)
                && Objects.equals(
                        this.descriptionNotStartsWith,
                        replicationServiceWhereInput.descriptionNotStartsWith)
                && Objects.equals(
                        this.descriptionStartsWith,
                        replicationServiceWhereInput.descriptionStartsWith)
                && Objects.equals(
                        this.entityAsyncStatus, replicationServiceWhereInput.entityAsyncStatus)
                && Objects.equals(
                        this.entityAsyncStatusIn, replicationServiceWhereInput.entityAsyncStatusIn)
                && Objects.equals(
                        this.entityAsyncStatusNot,
                        replicationServiceWhereInput.entityAsyncStatusNot)
                && Objects.equals(
                        this.entityAsyncStatusNotIn,
                        replicationServiceWhereInput.entityAsyncStatusNotIn)
                && Objects.equals(
                        this.failoverExecutionsEvery,
                        replicationServiceWhereInput.failoverExecutionsEvery)
                && Objects.equals(
                        this.failoverExecutionsNone,
                        replicationServiceWhereInput.failoverExecutionsNone)
                && Objects.equals(
                        this.failoverExecutionsSome,
                        replicationServiceWhereInput.failoverExecutionsSome)
                && Objects.equals(this.id, replicationServiceWhereInput.id)
                && Objects.equals(this.idContains, replicationServiceWhereInput.idContains)
                && Objects.equals(this.idEndsWith, replicationServiceWhereInput.idEndsWith)
                && Objects.equals(this.idGt, replicationServiceWhereInput.idGt)
                && Objects.equals(this.idGte, replicationServiceWhereInput.idGte)
                && Objects.equals(this.idIn, replicationServiceWhereInput.idIn)
                && Objects.equals(this.idLt, replicationServiceWhereInput.idLt)
                && Objects.equals(this.idLte, replicationServiceWhereInput.idLte)
                && Objects.equals(this.idNot, replicationServiceWhereInput.idNot)
                && Objects.equals(this.idNotContains, replicationServiceWhereInput.idNotContains)
                && Objects.equals(this.idNotEndsWith, replicationServiceWhereInput.idNotEndsWith)
                && Objects.equals(this.idNotIn, replicationServiceWhereInput.idNotIn)
                && Objects.equals(
                        this.idNotStartsWith, replicationServiceWhereInput.idNotStartsWith)
                && Objects.equals(this.idStartsWith, replicationServiceWhereInput.idStartsWith)
                && Objects.equals(this.kubeConfig, replicationServiceWhereInput.kubeConfig)
                && Objects.equals(
                        this.kubeConfigContains, replicationServiceWhereInput.kubeConfigContains)
                && Objects.equals(
                        this.kubeConfigEndsWith, replicationServiceWhereInput.kubeConfigEndsWith)
                && Objects.equals(this.kubeConfigGt, replicationServiceWhereInput.kubeConfigGt)
                && Objects.equals(this.kubeConfigGte, replicationServiceWhereInput.kubeConfigGte)
                && Objects.equals(this.kubeConfigIn, replicationServiceWhereInput.kubeConfigIn)
                && Objects.equals(this.kubeConfigLt, replicationServiceWhereInput.kubeConfigLt)
                && Objects.equals(this.kubeConfigLte, replicationServiceWhereInput.kubeConfigLte)
                && Objects.equals(this.kubeConfigNot, replicationServiceWhereInput.kubeConfigNot)
                && Objects.equals(
                        this.kubeConfigNotContains,
                        replicationServiceWhereInput.kubeConfigNotContains)
                && Objects.equals(
                        this.kubeConfigNotEndsWith,
                        replicationServiceWhereInput.kubeConfigNotEndsWith)
                && Objects.equals(
                        this.kubeConfigNotIn, replicationServiceWhereInput.kubeConfigNotIn)
                && Objects.equals(
                        this.kubeConfigNotStartsWith,
                        replicationServiceWhereInput.kubeConfigNotStartsWith)
                && Objects.equals(
                        this.kubeConfigStartsWith,
                        replicationServiceWhereInput.kubeConfigStartsWith)
                && Objects.equals(
                        this.maxFailbackJobs, replicationServiceWhereInput.maxFailbackJobs)
                && Objects.equals(
                        this.maxFailbackJobsGt, replicationServiceWhereInput.maxFailbackJobsGt)
                && Objects.equals(
                        this.maxFailbackJobsGte, replicationServiceWhereInput.maxFailbackJobsGte)
                && Objects.equals(
                        this.maxFailbackJobsIn, replicationServiceWhereInput.maxFailbackJobsIn)
                && Objects.equals(
                        this.maxFailbackJobsLt, replicationServiceWhereInput.maxFailbackJobsLt)
                && Objects.equals(
                        this.maxFailbackJobsLte, replicationServiceWhereInput.maxFailbackJobsLte)
                && Objects.equals(
                        this.maxFailbackJobsNot, replicationServiceWhereInput.maxFailbackJobsNot)
                && Objects.equals(
                        this.maxFailbackJobsNotIn,
                        replicationServiceWhereInput.maxFailbackJobsNotIn)
                && Objects.equals(
                        this.maxFailbackSpeedLimit,
                        replicationServiceWhereInput.maxFailbackSpeedLimit)
                && Objects.equals(
                        this.maxFailbackSpeedLimitGt,
                        replicationServiceWhereInput.maxFailbackSpeedLimitGt)
                && Objects.equals(
                        this.maxFailbackSpeedLimitGte,
                        replicationServiceWhereInput.maxFailbackSpeedLimitGte)
                && Objects.equals(
                        this.maxFailbackSpeedLimitIn,
                        replicationServiceWhereInput.maxFailbackSpeedLimitIn)
                && Objects.equals(
                        this.maxFailbackSpeedLimitLt,
                        replicationServiceWhereInput.maxFailbackSpeedLimitLt)
                && Objects.equals(
                        this.maxFailbackSpeedLimitLte,
                        replicationServiceWhereInput.maxFailbackSpeedLimitLte)
                && Objects.equals(
                        this.maxFailbackSpeedLimitNot,
                        replicationServiceWhereInput.maxFailbackSpeedLimitNot)
                && Objects.equals(
                        this.maxFailbackSpeedLimitNotIn,
                        replicationServiceWhereInput.maxFailbackSpeedLimitNotIn)
                && Objects.equals(
                        this.maxReplicationJobs, replicationServiceWhereInput.maxReplicationJobs)
                && Objects.equals(
                        this.maxReplicationJobsGt,
                        replicationServiceWhereInput.maxReplicationJobsGt)
                && Objects.equals(
                        this.maxReplicationJobsGte,
                        replicationServiceWhereInput.maxReplicationJobsGte)
                && Objects.equals(
                        this.maxReplicationJobsIn,
                        replicationServiceWhereInput.maxReplicationJobsIn)
                && Objects.equals(
                        this.maxReplicationJobsLt,
                        replicationServiceWhereInput.maxReplicationJobsLt)
                && Objects.equals(
                        this.maxReplicationJobsLte,
                        replicationServiceWhereInput.maxReplicationJobsLte)
                && Objects.equals(
                        this.maxReplicationJobsNot,
                        replicationServiceWhereInput.maxReplicationJobsNot)
                && Objects.equals(
                        this.maxReplicationJobsNotIn,
                        replicationServiceWhereInput.maxReplicationJobsNotIn)
                && Objects.equals(
                        this.maxReplicationSpeedLimit,
                        replicationServiceWhereInput.maxReplicationSpeedLimit)
                && Objects.equals(
                        this.maxReplicationSpeedLimitGt,
                        replicationServiceWhereInput.maxReplicationSpeedLimitGt)
                && Objects.equals(
                        this.maxReplicationSpeedLimitGte,
                        replicationServiceWhereInput.maxReplicationSpeedLimitGte)
                && Objects.equals(
                        this.maxReplicationSpeedLimitIn,
                        replicationServiceWhereInput.maxReplicationSpeedLimitIn)
                && Objects.equals(
                        this.maxReplicationSpeedLimitLt,
                        replicationServiceWhereInput.maxReplicationSpeedLimitLt)
                && Objects.equals(
                        this.maxReplicationSpeedLimitLte,
                        replicationServiceWhereInput.maxReplicationSpeedLimitLte)
                && Objects.equals(
                        this.maxReplicationSpeedLimitNot,
                        replicationServiceWhereInput.maxReplicationSpeedLimitNot)
                && Objects.equals(
                        this.maxReplicationSpeedLimitNotIn,
                        replicationServiceWhereInput.maxReplicationSpeedLimitNotIn)
                && Objects.equals(this.maxRetryTimes, replicationServiceWhereInput.maxRetryTimes)
                && Objects.equals(
                        this.maxRetryTimesGt, replicationServiceWhereInput.maxRetryTimesGt)
                && Objects.equals(
                        this.maxRetryTimesGte, replicationServiceWhereInput.maxRetryTimesGte)
                && Objects.equals(
                        this.maxRetryTimesIn, replicationServiceWhereInput.maxRetryTimesIn)
                && Objects.equals(
                        this.maxRetryTimesLt, replicationServiceWhereInput.maxRetryTimesLt)
                && Objects.equals(
                        this.maxRetryTimesLte, replicationServiceWhereInput.maxRetryTimesLte)
                && Objects.equals(
                        this.maxRetryTimesNot, replicationServiceWhereInput.maxRetryTimesNot)
                && Objects.equals(
                        this.maxRetryTimesNotIn, replicationServiceWhereInput.maxRetryTimesNotIn)
                && Objects.equals(this.name, replicationServiceWhereInput.name)
                && Objects.equals(this.nameContains, replicationServiceWhereInput.nameContains)
                && Objects.equals(this.nameEndsWith, replicationServiceWhereInput.nameEndsWith)
                && Objects.equals(this.nameGt, replicationServiceWhereInput.nameGt)
                && Objects.equals(this.nameGte, replicationServiceWhereInput.nameGte)
                && Objects.equals(this.nameIn, replicationServiceWhereInput.nameIn)
                && Objects.equals(this.nameLt, replicationServiceWhereInput.nameLt)
                && Objects.equals(this.nameLte, replicationServiceWhereInput.nameLte)
                && Objects.equals(this.nameNot, replicationServiceWhereInput.nameNot)
                && Objects.equals(
                        this.nameNotContains, replicationServiceWhereInput.nameNotContains)
                && Objects.equals(
                        this.nameNotEndsWith, replicationServiceWhereInput.nameNotEndsWith)
                && Objects.equals(this.nameNotIn, replicationServiceWhereInput.nameNotIn)
                && Objects.equals(
                        this.nameNotStartsWith, replicationServiceWhereInput.nameNotStartsWith)
                && Objects.equals(this.nameStartsWith, replicationServiceWhereInput.nameStartsWith)
                && Objects.equals(
                        this.permanentFailoverExecutionEvery,
                        replicationServiceWhereInput.permanentFailoverExecutionEvery)
                && Objects.equals(
                        this.permanentFailoverExecutionNone,
                        replicationServiceWhereInput.permanentFailoverExecutionNone)
                && Objects.equals(
                        this.permanentFailoverExecutionSome,
                        replicationServiceWhereInput.permanentFailoverExecutionSome)
                && Objects.equals(
                        this.replicationClustersEvery,
                        replicationServiceWhereInput.replicationClustersEvery)
                && Objects.equals(
                        this.replicationClustersNone,
                        replicationServiceWhereInput.replicationClustersNone)
                && Objects.equals(
                        this.replicationClustersSome,
                        replicationServiceWhereInput.replicationClustersSome)
                && Objects.equals(
                        this.replicationPlansEvery,
                        replicationServiceWhereInput.replicationPlansEvery)
                && Objects.equals(
                        this.replicationPlansNone,
                        replicationServiceWhereInput.replicationPlansNone)
                && Objects.equals(
                        this.replicationPlansSome,
                        replicationServiceWhereInput.replicationPlansSome)
                && Objects.equals(this.retryInterval, replicationServiceWhereInput.retryInterval)
                && Objects.equals(
                        this.retryIntervalGt, replicationServiceWhereInput.retryIntervalGt)
                && Objects.equals(
                        this.retryIntervalGte, replicationServiceWhereInput.retryIntervalGte)
                && Objects.equals(
                        this.retryIntervalIn, replicationServiceWhereInput.retryIntervalIn)
                && Objects.equals(
                        this.retryIntervalLt, replicationServiceWhereInput.retryIntervalLt)
                && Objects.equals(
                        this.retryIntervalLte, replicationServiceWhereInput.retryIntervalLte)
                && Objects.equals(
                        this.retryIntervalNot, replicationServiceWhereInput.retryIntervalNot)
                && Objects.equals(
                        this.retryIntervalNotIn, replicationServiceWhereInput.retryIntervalNotIn)
                && Objects.equals(this.updatedAt, replicationServiceWhereInput.updatedAt)
                && Objects.equals(this.updatedAtGt, replicationServiceWhereInput.updatedAtGt)
                && Objects.equals(this.updatedAtGte, replicationServiceWhereInput.updatedAtGte)
                && Objects.equals(this.updatedAtIn, replicationServiceWhereInput.updatedAtIn)
                && Objects.equals(this.updatedAtLt, replicationServiceWhereInput.updatedAtLt)
                && Objects.equals(this.updatedAtLte, replicationServiceWhereInput.updatedAtLte)
                && Objects.equals(this.updatedAtNot, replicationServiceWhereInput.updatedAtNot)
                && Objects.equals(this.updatedAtNotIn, replicationServiceWhereInput.updatedAtNotIn);
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
                application,
                createdAt,
                createdAtGt,
                createdAtGte,
                createdAtIn,
                createdAtLt,
                createdAtLte,
                createdAtNot,
                createdAtNotIn,
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
                kubeConfig,
                kubeConfigContains,
                kubeConfigEndsWith,
                kubeConfigGt,
                kubeConfigGte,
                kubeConfigIn,
                kubeConfigLt,
                kubeConfigLte,
                kubeConfigNot,
                kubeConfigNotContains,
                kubeConfigNotEndsWith,
                kubeConfigNotIn,
                kubeConfigNotStartsWith,
                kubeConfigStartsWith,
                maxFailbackJobs,
                maxFailbackJobsGt,
                maxFailbackJobsGte,
                maxFailbackJobsIn,
                maxFailbackJobsLt,
                maxFailbackJobsLte,
                maxFailbackJobsNot,
                maxFailbackJobsNotIn,
                maxFailbackSpeedLimit,
                maxFailbackSpeedLimitGt,
                maxFailbackSpeedLimitGte,
                maxFailbackSpeedLimitIn,
                maxFailbackSpeedLimitLt,
                maxFailbackSpeedLimitLte,
                maxFailbackSpeedLimitNot,
                maxFailbackSpeedLimitNotIn,
                maxReplicationJobs,
                maxReplicationJobsGt,
                maxReplicationJobsGte,
                maxReplicationJobsIn,
                maxReplicationJobsLt,
                maxReplicationJobsLte,
                maxReplicationJobsNot,
                maxReplicationJobsNotIn,
                maxReplicationSpeedLimit,
                maxReplicationSpeedLimitGt,
                maxReplicationSpeedLimitGte,
                maxReplicationSpeedLimitIn,
                maxReplicationSpeedLimitLt,
                maxReplicationSpeedLimitLte,
                maxReplicationSpeedLimitNot,
                maxReplicationSpeedLimitNotIn,
                maxRetryTimes,
                maxRetryTimesGt,
                maxRetryTimesGte,
                maxRetryTimesIn,
                maxRetryTimesLt,
                maxRetryTimesLte,
                maxRetryTimesNot,
                maxRetryTimesNotIn,
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
                permanentFailoverExecutionEvery,
                permanentFailoverExecutionNone,
                permanentFailoverExecutionSome,
                replicationClustersEvery,
                replicationClustersNone,
                replicationClustersSome,
                replicationPlansEvery,
                replicationPlansNone,
                replicationPlansSome,
                retryInterval,
                retryIntervalGt,
                retryIntervalGte,
                retryIntervalIn,
                retryIntervalLt,
                retryIntervalLte,
                retryIntervalNot,
                retryIntervalNotIn,
                updatedAt,
                updatedAtGt,
                updatedAtGte,
                updatedAtIn,
                updatedAtLt,
                updatedAtLte,
                updatedAtNot,
                updatedAtNotIn);
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
        sb.append("class ReplicationServiceWhereInput {\n");
        sb.append("    AND: ").append(toIndentedString(AND)).append("\n");
        sb.append("    NOT: ").append(toIndentedString(NOT)).append("\n");
        sb.append("    OR: ").append(toIndentedString(OR)).append("\n");
        sb.append("    application: ").append(toIndentedString(application)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    createdAtGt: ").append(toIndentedString(createdAtGt)).append("\n");
        sb.append("    createdAtGte: ").append(toIndentedString(createdAtGte)).append("\n");
        sb.append("    createdAtIn: ").append(toIndentedString(createdAtIn)).append("\n");
        sb.append("    createdAtLt: ").append(toIndentedString(createdAtLt)).append("\n");
        sb.append("    createdAtLte: ").append(toIndentedString(createdAtLte)).append("\n");
        sb.append("    createdAtNot: ").append(toIndentedString(createdAtNot)).append("\n");
        sb.append("    createdAtNotIn: ").append(toIndentedString(createdAtNotIn)).append("\n");
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
        sb.append("    kubeConfig: ").append(toIndentedString(kubeConfig)).append("\n");
        sb.append("    kubeConfigContains: ")
                .append(toIndentedString(kubeConfigContains))
                .append("\n");
        sb.append("    kubeConfigEndsWith: ")
                .append(toIndentedString(kubeConfigEndsWith))
                .append("\n");
        sb.append("    kubeConfigGt: ").append(toIndentedString(kubeConfigGt)).append("\n");
        sb.append("    kubeConfigGte: ").append(toIndentedString(kubeConfigGte)).append("\n");
        sb.append("    kubeConfigIn: ").append(toIndentedString(kubeConfigIn)).append("\n");
        sb.append("    kubeConfigLt: ").append(toIndentedString(kubeConfigLt)).append("\n");
        sb.append("    kubeConfigLte: ").append(toIndentedString(kubeConfigLte)).append("\n");
        sb.append("    kubeConfigNot: ").append(toIndentedString(kubeConfigNot)).append("\n");
        sb.append("    kubeConfigNotContains: ")
                .append(toIndentedString(kubeConfigNotContains))
                .append("\n");
        sb.append("    kubeConfigNotEndsWith: ")
                .append(toIndentedString(kubeConfigNotEndsWith))
                .append("\n");
        sb.append("    kubeConfigNotIn: ").append(toIndentedString(kubeConfigNotIn)).append("\n");
        sb.append("    kubeConfigNotStartsWith: ")
                .append(toIndentedString(kubeConfigNotStartsWith))
                .append("\n");
        sb.append("    kubeConfigStartsWith: ")
                .append(toIndentedString(kubeConfigStartsWith))
                .append("\n");
        sb.append("    maxFailbackJobs: ").append(toIndentedString(maxFailbackJobs)).append("\n");
        sb.append("    maxFailbackJobsGt: ")
                .append(toIndentedString(maxFailbackJobsGt))
                .append("\n");
        sb.append("    maxFailbackJobsGte: ")
                .append(toIndentedString(maxFailbackJobsGte))
                .append("\n");
        sb.append("    maxFailbackJobsIn: ")
                .append(toIndentedString(maxFailbackJobsIn))
                .append("\n");
        sb.append("    maxFailbackJobsLt: ")
                .append(toIndentedString(maxFailbackJobsLt))
                .append("\n");
        sb.append("    maxFailbackJobsLte: ")
                .append(toIndentedString(maxFailbackJobsLte))
                .append("\n");
        sb.append("    maxFailbackJobsNot: ")
                .append(toIndentedString(maxFailbackJobsNot))
                .append("\n");
        sb.append("    maxFailbackJobsNotIn: ")
                .append(toIndentedString(maxFailbackJobsNotIn))
                .append("\n");
        sb.append("    maxFailbackSpeedLimit: ")
                .append(toIndentedString(maxFailbackSpeedLimit))
                .append("\n");
        sb.append("    maxFailbackSpeedLimitGt: ")
                .append(toIndentedString(maxFailbackSpeedLimitGt))
                .append("\n");
        sb.append("    maxFailbackSpeedLimitGte: ")
                .append(toIndentedString(maxFailbackSpeedLimitGte))
                .append("\n");
        sb.append("    maxFailbackSpeedLimitIn: ")
                .append(toIndentedString(maxFailbackSpeedLimitIn))
                .append("\n");
        sb.append("    maxFailbackSpeedLimitLt: ")
                .append(toIndentedString(maxFailbackSpeedLimitLt))
                .append("\n");
        sb.append("    maxFailbackSpeedLimitLte: ")
                .append(toIndentedString(maxFailbackSpeedLimitLte))
                .append("\n");
        sb.append("    maxFailbackSpeedLimitNot: ")
                .append(toIndentedString(maxFailbackSpeedLimitNot))
                .append("\n");
        sb.append("    maxFailbackSpeedLimitNotIn: ")
                .append(toIndentedString(maxFailbackSpeedLimitNotIn))
                .append("\n");
        sb.append("    maxReplicationJobs: ")
                .append(toIndentedString(maxReplicationJobs))
                .append("\n");
        sb.append("    maxReplicationJobsGt: ")
                .append(toIndentedString(maxReplicationJobsGt))
                .append("\n");
        sb.append("    maxReplicationJobsGte: ")
                .append(toIndentedString(maxReplicationJobsGte))
                .append("\n");
        sb.append("    maxReplicationJobsIn: ")
                .append(toIndentedString(maxReplicationJobsIn))
                .append("\n");
        sb.append("    maxReplicationJobsLt: ")
                .append(toIndentedString(maxReplicationJobsLt))
                .append("\n");
        sb.append("    maxReplicationJobsLte: ")
                .append(toIndentedString(maxReplicationJobsLte))
                .append("\n");
        sb.append("    maxReplicationJobsNot: ")
                .append(toIndentedString(maxReplicationJobsNot))
                .append("\n");
        sb.append("    maxReplicationJobsNotIn: ")
                .append(toIndentedString(maxReplicationJobsNotIn))
                .append("\n");
        sb.append("    maxReplicationSpeedLimit: ")
                .append(toIndentedString(maxReplicationSpeedLimit))
                .append("\n");
        sb.append("    maxReplicationSpeedLimitGt: ")
                .append(toIndentedString(maxReplicationSpeedLimitGt))
                .append("\n");
        sb.append("    maxReplicationSpeedLimitGte: ")
                .append(toIndentedString(maxReplicationSpeedLimitGte))
                .append("\n");
        sb.append("    maxReplicationSpeedLimitIn: ")
                .append(toIndentedString(maxReplicationSpeedLimitIn))
                .append("\n");
        sb.append("    maxReplicationSpeedLimitLt: ")
                .append(toIndentedString(maxReplicationSpeedLimitLt))
                .append("\n");
        sb.append("    maxReplicationSpeedLimitLte: ")
                .append(toIndentedString(maxReplicationSpeedLimitLte))
                .append("\n");
        sb.append("    maxReplicationSpeedLimitNot: ")
                .append(toIndentedString(maxReplicationSpeedLimitNot))
                .append("\n");
        sb.append("    maxReplicationSpeedLimitNotIn: ")
                .append(toIndentedString(maxReplicationSpeedLimitNotIn))
                .append("\n");
        sb.append("    maxRetryTimes: ").append(toIndentedString(maxRetryTimes)).append("\n");
        sb.append("    maxRetryTimesGt: ").append(toIndentedString(maxRetryTimesGt)).append("\n");
        sb.append("    maxRetryTimesGte: ").append(toIndentedString(maxRetryTimesGte)).append("\n");
        sb.append("    maxRetryTimesIn: ").append(toIndentedString(maxRetryTimesIn)).append("\n");
        sb.append("    maxRetryTimesLt: ").append(toIndentedString(maxRetryTimesLt)).append("\n");
        sb.append("    maxRetryTimesLte: ").append(toIndentedString(maxRetryTimesLte)).append("\n");
        sb.append("    maxRetryTimesNot: ").append(toIndentedString(maxRetryTimesNot)).append("\n");
        sb.append("    maxRetryTimesNotIn: ")
                .append(toIndentedString(maxRetryTimesNotIn))
                .append("\n");
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
        sb.append("    permanentFailoverExecutionEvery: ")
                .append(toIndentedString(permanentFailoverExecutionEvery))
                .append("\n");
        sb.append("    permanentFailoverExecutionNone: ")
                .append(toIndentedString(permanentFailoverExecutionNone))
                .append("\n");
        sb.append("    permanentFailoverExecutionSome: ")
                .append(toIndentedString(permanentFailoverExecutionSome))
                .append("\n");
        sb.append("    replicationClustersEvery: ")
                .append(toIndentedString(replicationClustersEvery))
                .append("\n");
        sb.append("    replicationClustersNone: ")
                .append(toIndentedString(replicationClustersNone))
                .append("\n");
        sb.append("    replicationClustersSome: ")
                .append(toIndentedString(replicationClustersSome))
                .append("\n");
        sb.append("    replicationPlansEvery: ")
                .append(toIndentedString(replicationPlansEvery))
                .append("\n");
        sb.append("    replicationPlansNone: ")
                .append(toIndentedString(replicationPlansNone))
                .append("\n");
        sb.append("    replicationPlansSome: ")
                .append(toIndentedString(replicationPlansSome))
                .append("\n");
        sb.append("    retryInterval: ").append(toIndentedString(retryInterval)).append("\n");
        sb.append("    retryIntervalGt: ").append(toIndentedString(retryIntervalGt)).append("\n");
        sb.append("    retryIntervalGte: ").append(toIndentedString(retryIntervalGte)).append("\n");
        sb.append("    retryIntervalIn: ").append(toIndentedString(retryIntervalIn)).append("\n");
        sb.append("    retryIntervalLt: ").append(toIndentedString(retryIntervalLt)).append("\n");
        sb.append("    retryIntervalLte: ").append(toIndentedString(retryIntervalLte)).append("\n");
        sb.append("    retryIntervalNot: ").append(toIndentedString(retryIntervalNot)).append("\n");
        sb.append("    retryIntervalNotIn: ")
                .append(toIndentedString(retryIntervalNotIn))
                .append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    updatedAtGt: ").append(toIndentedString(updatedAtGt)).append("\n");
        sb.append("    updatedAtGte: ").append(toIndentedString(updatedAtGte)).append("\n");
        sb.append("    updatedAtIn: ").append(toIndentedString(updatedAtIn)).append("\n");
        sb.append("    updatedAtLt: ").append(toIndentedString(updatedAtLt)).append("\n");
        sb.append("    updatedAtLte: ").append(toIndentedString(updatedAtLte)).append("\n");
        sb.append("    updatedAtNot: ").append(toIndentedString(updatedAtNot)).append("\n");
        sb.append("    updatedAtNotIn: ").append(toIndentedString(updatedAtNotIn)).append("\n");
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

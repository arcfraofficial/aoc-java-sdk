package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** ExternalCloudTowerWhereInput */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class ExternalCloudTowerWhereInput
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_A_N_D = "AND";

    @SerializedName(SERIALIZED_NAME_A_N_D)
    private List<ExternalCloudTowerWhereInput> AND = null;

    public static final String SERIALIZED_NAME_N_O_T = "NOT";

    @SerializedName(SERIALIZED_NAME_N_O_T)
    private List<ExternalCloudTowerWhereInput> NOT = null;

    public static final String SERIALIZED_NAME_O_R = "OR";

    @SerializedName(SERIALIZED_NAME_O_R)
    private List<ExternalCloudTowerWhereInput> OR = null;

    public static final String SERIALIZED_NAME_API_KEY = "api_key";

    @SerializedName(SERIALIZED_NAME_API_KEY)
    private String apiKey;

    public static final String SERIALIZED_NAME_API_KEY_CONTAINS = "api_key_contains";

    @SerializedName(SERIALIZED_NAME_API_KEY_CONTAINS)
    private String apiKeyContains;

    public static final String SERIALIZED_NAME_API_KEY_ENDS_WITH = "api_key_ends_with";

    @SerializedName(SERIALIZED_NAME_API_KEY_ENDS_WITH)
    private String apiKeyEndsWith;

    public static final String SERIALIZED_NAME_API_KEY_GT = "api_key_gt";

    @SerializedName(SERIALIZED_NAME_API_KEY_GT)
    private String apiKeyGt;

    public static final String SERIALIZED_NAME_API_KEY_GTE = "api_key_gte";

    @SerializedName(SERIALIZED_NAME_API_KEY_GTE)
    private String apiKeyGte;

    public static final String SERIALIZED_NAME_API_KEY_IN = "api_key_in";

    @SerializedName(SERIALIZED_NAME_API_KEY_IN)
    private List<String> apiKeyIn = null;

    public static final String SERIALIZED_NAME_API_KEY_LT = "api_key_lt";

    @SerializedName(SERIALIZED_NAME_API_KEY_LT)
    private String apiKeyLt;

    public static final String SERIALIZED_NAME_API_KEY_LTE = "api_key_lte";

    @SerializedName(SERIALIZED_NAME_API_KEY_LTE)
    private String apiKeyLte;

    public static final String SERIALIZED_NAME_API_KEY_NOT = "api_key_not";

    @SerializedName(SERIALIZED_NAME_API_KEY_NOT)
    private String apiKeyNot;

    public static final String SERIALIZED_NAME_API_KEY_NOT_CONTAINS = "api_key_not_contains";

    @SerializedName(SERIALIZED_NAME_API_KEY_NOT_CONTAINS)
    private String apiKeyNotContains;

    public static final String SERIALIZED_NAME_API_KEY_NOT_ENDS_WITH = "api_key_not_ends_with";

    @SerializedName(SERIALIZED_NAME_API_KEY_NOT_ENDS_WITH)
    private String apiKeyNotEndsWith;

    public static final String SERIALIZED_NAME_API_KEY_NOT_IN = "api_key_not_in";

    @SerializedName(SERIALIZED_NAME_API_KEY_NOT_IN)
    private List<String> apiKeyNotIn = null;

    public static final String SERIALIZED_NAME_API_KEY_NOT_STARTS_WITH = "api_key_not_starts_with";

    @SerializedName(SERIALIZED_NAME_API_KEY_NOT_STARTS_WITH)
    private String apiKeyNotStartsWith;

    public static final String SERIALIZED_NAME_API_KEY_STARTS_WITH = "api_key_starts_with";

    @SerializedName(SERIALIZED_NAME_API_KEY_STARTS_WITH)
    private String apiKeyStartsWith;

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

    public static final String SERIALIZED_NAME_DEPLOY_ID = "deploy_id";

    @SerializedName(SERIALIZED_NAME_DEPLOY_ID)
    private String deployId;

    public static final String SERIALIZED_NAME_DEPLOY_ID_CONTAINS = "deploy_id_contains";

    @SerializedName(SERIALIZED_NAME_DEPLOY_ID_CONTAINS)
    private String deployIdContains;

    public static final String SERIALIZED_NAME_DEPLOY_ID_ENDS_WITH = "deploy_id_ends_with";

    @SerializedName(SERIALIZED_NAME_DEPLOY_ID_ENDS_WITH)
    private String deployIdEndsWith;

    public static final String SERIALIZED_NAME_DEPLOY_ID_GT = "deploy_id_gt";

    @SerializedName(SERIALIZED_NAME_DEPLOY_ID_GT)
    private String deployIdGt;

    public static final String SERIALIZED_NAME_DEPLOY_ID_GTE = "deploy_id_gte";

    @SerializedName(SERIALIZED_NAME_DEPLOY_ID_GTE)
    private String deployIdGte;

    public static final String SERIALIZED_NAME_DEPLOY_ID_IN = "deploy_id_in";

    @SerializedName(SERIALIZED_NAME_DEPLOY_ID_IN)
    private List<String> deployIdIn = null;

    public static final String SERIALIZED_NAME_DEPLOY_ID_LT = "deploy_id_lt";

    @SerializedName(SERIALIZED_NAME_DEPLOY_ID_LT)
    private String deployIdLt;

    public static final String SERIALIZED_NAME_DEPLOY_ID_LTE = "deploy_id_lte";

    @SerializedName(SERIALIZED_NAME_DEPLOY_ID_LTE)
    private String deployIdLte;

    public static final String SERIALIZED_NAME_DEPLOY_ID_NOT = "deploy_id_not";

    @SerializedName(SERIALIZED_NAME_DEPLOY_ID_NOT)
    private String deployIdNot;

    public static final String SERIALIZED_NAME_DEPLOY_ID_NOT_CONTAINS = "deploy_id_not_contains";

    @SerializedName(SERIALIZED_NAME_DEPLOY_ID_NOT_CONTAINS)
    private String deployIdNotContains;

    public static final String SERIALIZED_NAME_DEPLOY_ID_NOT_ENDS_WITH = "deploy_id_not_ends_with";

    @SerializedName(SERIALIZED_NAME_DEPLOY_ID_NOT_ENDS_WITH)
    private String deployIdNotEndsWith;

    public static final String SERIALIZED_NAME_DEPLOY_ID_NOT_IN = "deploy_id_not_in";

    @SerializedName(SERIALIZED_NAME_DEPLOY_ID_NOT_IN)
    private List<String> deployIdNotIn = null;

    public static final String SERIALIZED_NAME_DEPLOY_ID_NOT_STARTS_WITH =
            "deploy_id_not_starts_with";

    @SerializedName(SERIALIZED_NAME_DEPLOY_ID_NOT_STARTS_WITH)
    private String deployIdNotStartsWith;

    public static final String SERIALIZED_NAME_DEPLOY_ID_STARTS_WITH = "deploy_id_starts_with";

    @SerializedName(SERIALIZED_NAME_DEPLOY_ID_STARTS_WITH)
    private String deployIdStartsWith;

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

    public static final String SERIALIZED_NAME_ENDPOINT = "endpoint";

    @SerializedName(SERIALIZED_NAME_ENDPOINT)
    private String endpoint;

    public static final String SERIALIZED_NAME_ENDPOINT_CONTAINS = "endpoint_contains";

    @SerializedName(SERIALIZED_NAME_ENDPOINT_CONTAINS)
    private String endpointContains;

    public static final String SERIALIZED_NAME_ENDPOINT_ENDS_WITH = "endpoint_ends_with";

    @SerializedName(SERIALIZED_NAME_ENDPOINT_ENDS_WITH)
    private String endpointEndsWith;

    public static final String SERIALIZED_NAME_ENDPOINT_GT = "endpoint_gt";

    @SerializedName(SERIALIZED_NAME_ENDPOINT_GT)
    private String endpointGt;

    public static final String SERIALIZED_NAME_ENDPOINT_GTE = "endpoint_gte";

    @SerializedName(SERIALIZED_NAME_ENDPOINT_GTE)
    private String endpointGte;

    public static final String SERIALIZED_NAME_ENDPOINT_IN = "endpoint_in";

    @SerializedName(SERIALIZED_NAME_ENDPOINT_IN)
    private List<String> endpointIn = null;

    public static final String SERIALIZED_NAME_ENDPOINT_LT = "endpoint_lt";

    @SerializedName(SERIALIZED_NAME_ENDPOINT_LT)
    private String endpointLt;

    public static final String SERIALIZED_NAME_ENDPOINT_LTE = "endpoint_lte";

    @SerializedName(SERIALIZED_NAME_ENDPOINT_LTE)
    private String endpointLte;

    public static final String SERIALIZED_NAME_ENDPOINT_NOT = "endpoint_not";

    @SerializedName(SERIALIZED_NAME_ENDPOINT_NOT)
    private String endpointNot;

    public static final String SERIALIZED_NAME_ENDPOINT_NOT_CONTAINS = "endpoint_not_contains";

    @SerializedName(SERIALIZED_NAME_ENDPOINT_NOT_CONTAINS)
    private String endpointNotContains;

    public static final String SERIALIZED_NAME_ENDPOINT_NOT_ENDS_WITH = "endpoint_not_ends_with";

    @SerializedName(SERIALIZED_NAME_ENDPOINT_NOT_ENDS_WITH)
    private String endpointNotEndsWith;

    public static final String SERIALIZED_NAME_ENDPOINT_NOT_IN = "endpoint_not_in";

    @SerializedName(SERIALIZED_NAME_ENDPOINT_NOT_IN)
    private List<String> endpointNotIn = null;

    public static final String SERIALIZED_NAME_ENDPOINT_NOT_STARTS_WITH =
            "endpoint_not_starts_with";

    @SerializedName(SERIALIZED_NAME_ENDPOINT_NOT_STARTS_WITH)
    private String endpointNotStartsWith;

    public static final String SERIALIZED_NAME_ENDPOINT_STARTS_WITH = "endpoint_starts_with";

    @SerializedName(SERIALIZED_NAME_ENDPOINT_STARTS_WITH)
    private String endpointStartsWith;

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

    public static final String SERIALIZED_NAME_FAILBACK_EXECUTIONS_EVERY =
            "failback_executions_every";

    @SerializedName(SERIALIZED_NAME_FAILBACK_EXECUTIONS_EVERY)
    private FailbackExecutionWhereInput failbackExecutionsEvery;

    public static final String SERIALIZED_NAME_FAILBACK_EXECUTIONS_NONE =
            "failback_executions_none";

    @SerializedName(SERIALIZED_NAME_FAILBACK_EXECUTIONS_NONE)
    private FailbackExecutionWhereInput failbackExecutionsNone;

    public static final String SERIALIZED_NAME_FAILBACK_EXECUTIONS_SOME =
            "failback_executions_some";

    @SerializedName(SERIALIZED_NAME_FAILBACK_EXECUTIONS_SOME)
    private FailbackExecutionWhereInput failbackExecutionsSome;

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

    public static final String SERIALIZED_NAME_PERMANENT_FAILOVER_EXECUTIONS_EVERY =
            "permanent_failover_executions_every";

    @SerializedName(SERIALIZED_NAME_PERMANENT_FAILOVER_EXECUTIONS_EVERY)
    private PermanentFailoverExecutionWhereInput permanentFailoverExecutionsEvery;

    public static final String SERIALIZED_NAME_PERMANENT_FAILOVER_EXECUTIONS_NONE =
            "permanent_failover_executions_none";

    @SerializedName(SERIALIZED_NAME_PERMANENT_FAILOVER_EXECUTIONS_NONE)
    private PermanentFailoverExecutionWhereInput permanentFailoverExecutionsNone;

    public static final String SERIALIZED_NAME_PERMANENT_FAILOVER_EXECUTIONS_SOME =
            "permanent_failover_executions_some";

    @SerializedName(SERIALIZED_NAME_PERMANENT_FAILOVER_EXECUTIONS_SOME)
    private PermanentFailoverExecutionWhereInput permanentFailoverExecutionsSome;

    public static final String SERIALIZED_NAME_REPLICA_VMS_EVERY = "replica_vms_every";

    @SerializedName(SERIALIZED_NAME_REPLICA_VMS_EVERY)
    private ReplicaVmWhereInput replicaVmsEvery;

    public static final String SERIALIZED_NAME_REPLICA_VMS_NONE = "replica_vms_none";

    @SerializedName(SERIALIZED_NAME_REPLICA_VMS_NONE)
    private ReplicaVmWhereInput replicaVmsNone;

    public static final String SERIALIZED_NAME_REPLICA_VMS_SOME = "replica_vms_some";

    @SerializedName(SERIALIZED_NAME_REPLICA_VMS_SOME)
    private ReplicaVmWhereInput replicaVmsSome;

    public static final String SERIALIZED_NAME_REPLICATION_PLANS_EVERY = "replication_plans_every";

    @SerializedName(SERIALIZED_NAME_REPLICATION_PLANS_EVERY)
    private ReplicationPlanWhereInput replicationPlansEvery;

    public static final String SERIALIZED_NAME_REPLICATION_PLANS_NONE = "replication_plans_none";

    @SerializedName(SERIALIZED_NAME_REPLICATION_PLANS_NONE)
    private ReplicationPlanWhereInput replicationPlansNone;

    public static final String SERIALIZED_NAME_REPLICATION_PLANS_SOME = "replication_plans_some";

    @SerializedName(SERIALIZED_NAME_REPLICATION_PLANS_SOME)
    private ReplicationPlanWhereInput replicationPlansSome;

    public static final String SERIALIZED_NAME_STATUS = "status";

    @SerializedName(SERIALIZED_NAME_STATUS)
    private ExternalCloudTowerStatus status;

    public static final String SERIALIZED_NAME_STATUS_IN = "status_in";

    @SerializedName(SERIALIZED_NAME_STATUS_IN)
    private List<ExternalCloudTowerStatus> statusIn = null;

    public static final String SERIALIZED_NAME_STATUS_NOT = "status_not";

    @SerializedName(SERIALIZED_NAME_STATUS_NOT)
    private ExternalCloudTowerStatus statusNot;

    public static final String SERIALIZED_NAME_STATUS_NOT_IN = "status_not_in";

    @SerializedName(SERIALIZED_NAME_STATUS_NOT_IN)
    private List<ExternalCloudTowerStatus> statusNotIn = null;

    public static final String SERIALIZED_NAME_SYNC_REPLICATION_PLANS_EVERY =
            "sync_replication_plans_every";

    @SerializedName(SERIALIZED_NAME_SYNC_REPLICATION_PLANS_EVERY)
    private SyncReplicationPlanWhereInput syncReplicationPlansEvery;

    public static final String SERIALIZED_NAME_SYNC_REPLICATION_PLANS_NONE =
            "sync_replication_plans_none";

    @SerializedName(SERIALIZED_NAME_SYNC_REPLICATION_PLANS_NONE)
    private SyncReplicationPlanWhereInput syncReplicationPlansNone;

    public static final String SERIALIZED_NAME_SYNC_REPLICATION_PLANS_SOME =
            "sync_replication_plans_some";

    @SerializedName(SERIALIZED_NAME_SYNC_REPLICATION_PLANS_SOME)
    private SyncReplicationPlanWhereInput syncReplicationPlansSome;

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

    public static final String SERIALIZED_NAME_USE_API_KEY = "use_api_key";

    @SerializedName(SERIALIZED_NAME_USE_API_KEY)
    private ApiKeyWhereInput useApiKey;

    public ExternalCloudTowerWhereInput() {}

    public ExternalCloudTowerWhereInput AND(List<ExternalCloudTowerWhereInput> AND) {

        this.AND = AND;
        return this;
    }

    public ExternalCloudTowerWhereInput addANDItem(ExternalCloudTowerWhereInput ANDItem) {
        if (this.AND == null) {
            this.AND = new ArrayList<ExternalCloudTowerWhereInput>();
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
    public List<ExternalCloudTowerWhereInput> getAND() {
        return AND;
    }

    public void setAND(List<ExternalCloudTowerWhereInput> AND) {
        this.AND = AND;
    }

    public ExternalCloudTowerWhereInput AND_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_A_N_D);
        return this;
    }

    public ExternalCloudTowerWhereInput AND_ExplictlyNonNull() {
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

    public ExternalCloudTowerWhereInput NOT(List<ExternalCloudTowerWhereInput> NOT) {

        this.NOT = NOT;
        return this;
    }

    public ExternalCloudTowerWhereInput addNOTItem(ExternalCloudTowerWhereInput NOTItem) {
        if (this.NOT == null) {
            this.NOT = new ArrayList<ExternalCloudTowerWhereInput>();
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
    public List<ExternalCloudTowerWhereInput> getNOT() {
        return NOT;
    }

    public void setNOT(List<ExternalCloudTowerWhereInput> NOT) {
        this.NOT = NOT;
    }

    public ExternalCloudTowerWhereInput NOT_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_N_O_T);
        return this;
    }

    public ExternalCloudTowerWhereInput NOT_ExplictlyNonNull() {
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

    public ExternalCloudTowerWhereInput OR(List<ExternalCloudTowerWhereInput> OR) {

        this.OR = OR;
        return this;
    }

    public ExternalCloudTowerWhereInput addORItem(ExternalCloudTowerWhereInput ORItem) {
        if (this.OR == null) {
            this.OR = new ArrayList<ExternalCloudTowerWhereInput>();
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
    public List<ExternalCloudTowerWhereInput> getOR() {
        return OR;
    }

    public void setOR(List<ExternalCloudTowerWhereInput> OR) {
        this.OR = OR;
    }

    public ExternalCloudTowerWhereInput OR_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_O_R);
        return this;
    }

    public ExternalCloudTowerWhereInput OR_ExplictlyNonNull() {
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

    public ExternalCloudTowerWhereInput apiKey(String apiKey) {

        this.apiKey = apiKey;
        return this;
    }

    /**
     * Get apiKey
     *
     * @return apiKey
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public ExternalCloudTowerWhereInput apiKey_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_API_KEY);
        return this;
    }

    public ExternalCloudTowerWhereInput apiKey_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_API_KEY);
        return this;
    }

    public void setApiKey_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_API_KEY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_API_KEY);
        }
    }

    public boolean getApiKey_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_API_KEY);
    }

    public ExternalCloudTowerWhereInput apiKeyContains(String apiKeyContains) {

        this.apiKeyContains = apiKeyContains;
        return this;
    }

    /**
     * Get apiKeyContains
     *
     * @return apiKeyContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getApiKeyContains() {
        return apiKeyContains;
    }

    public void setApiKeyContains(String apiKeyContains) {
        this.apiKeyContains = apiKeyContains;
    }

    public ExternalCloudTowerWhereInput apiKeyContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_API_KEY_CONTAINS);
        return this;
    }

    public ExternalCloudTowerWhereInput apiKeyContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_API_KEY_CONTAINS);
        return this;
    }

    public void setApiKeyContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_API_KEY_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_API_KEY_CONTAINS);
        }
    }

    public boolean getApiKeyContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_API_KEY_CONTAINS);
    }

    public ExternalCloudTowerWhereInput apiKeyEndsWith(String apiKeyEndsWith) {

        this.apiKeyEndsWith = apiKeyEndsWith;
        return this;
    }

    /**
     * Get apiKeyEndsWith
     *
     * @return apiKeyEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getApiKeyEndsWith() {
        return apiKeyEndsWith;
    }

    public void setApiKeyEndsWith(String apiKeyEndsWith) {
        this.apiKeyEndsWith = apiKeyEndsWith;
    }

    public ExternalCloudTowerWhereInput apiKeyEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_API_KEY_ENDS_WITH);
        return this;
    }

    public ExternalCloudTowerWhereInput apiKeyEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_API_KEY_ENDS_WITH);
        return this;
    }

    public void setApiKeyEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_API_KEY_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_API_KEY_ENDS_WITH);
        }
    }

    public boolean getApiKeyEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_API_KEY_ENDS_WITH);
    }

    public ExternalCloudTowerWhereInput apiKeyGt(String apiKeyGt) {

        this.apiKeyGt = apiKeyGt;
        return this;
    }

    /**
     * Get apiKeyGt
     *
     * @return apiKeyGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getApiKeyGt() {
        return apiKeyGt;
    }

    public void setApiKeyGt(String apiKeyGt) {
        this.apiKeyGt = apiKeyGt;
    }

    public ExternalCloudTowerWhereInput apiKeyGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_API_KEY_GT);
        return this;
    }

    public ExternalCloudTowerWhereInput apiKeyGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_API_KEY_GT);
        return this;
    }

    public void setApiKeyGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_API_KEY_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_API_KEY_GT);
        }
    }

    public boolean getApiKeyGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_API_KEY_GT);
    }

    public ExternalCloudTowerWhereInput apiKeyGte(String apiKeyGte) {

        this.apiKeyGte = apiKeyGte;
        return this;
    }

    /**
     * Get apiKeyGte
     *
     * @return apiKeyGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getApiKeyGte() {
        return apiKeyGte;
    }

    public void setApiKeyGte(String apiKeyGte) {
        this.apiKeyGte = apiKeyGte;
    }

    public ExternalCloudTowerWhereInput apiKeyGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_API_KEY_GTE);
        return this;
    }

    public ExternalCloudTowerWhereInput apiKeyGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_API_KEY_GTE);
        return this;
    }

    public void setApiKeyGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_API_KEY_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_API_KEY_GTE);
        }
    }

    public boolean getApiKeyGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_API_KEY_GTE);
    }

    public ExternalCloudTowerWhereInput apiKeyIn(List<String> apiKeyIn) {

        this.apiKeyIn = apiKeyIn;
        return this;
    }

    public ExternalCloudTowerWhereInput addApiKeyInItem(String apiKeyInItem) {
        if (this.apiKeyIn == null) {
            this.apiKeyIn = new ArrayList<String>();
        }
        this.apiKeyIn.add(apiKeyInItem);
        return this;
    }

    /**
     * Get apiKeyIn
     *
     * @return apiKeyIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getApiKeyIn() {
        return apiKeyIn;
    }

    public void setApiKeyIn(List<String> apiKeyIn) {
        this.apiKeyIn = apiKeyIn;
    }

    public ExternalCloudTowerWhereInput apiKeyIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_API_KEY_IN);
        return this;
    }

    public ExternalCloudTowerWhereInput apiKeyIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_API_KEY_IN);
        return this;
    }

    public void setApiKeyIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_API_KEY_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_API_KEY_IN);
        }
    }

    public boolean getApiKeyIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_API_KEY_IN);
    }

    public ExternalCloudTowerWhereInput apiKeyLt(String apiKeyLt) {

        this.apiKeyLt = apiKeyLt;
        return this;
    }

    /**
     * Get apiKeyLt
     *
     * @return apiKeyLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getApiKeyLt() {
        return apiKeyLt;
    }

    public void setApiKeyLt(String apiKeyLt) {
        this.apiKeyLt = apiKeyLt;
    }

    public ExternalCloudTowerWhereInput apiKeyLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_API_KEY_LT);
        return this;
    }

    public ExternalCloudTowerWhereInput apiKeyLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_API_KEY_LT);
        return this;
    }

    public void setApiKeyLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_API_KEY_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_API_KEY_LT);
        }
    }

    public boolean getApiKeyLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_API_KEY_LT);
    }

    public ExternalCloudTowerWhereInput apiKeyLte(String apiKeyLte) {

        this.apiKeyLte = apiKeyLte;
        return this;
    }

    /**
     * Get apiKeyLte
     *
     * @return apiKeyLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getApiKeyLte() {
        return apiKeyLte;
    }

    public void setApiKeyLte(String apiKeyLte) {
        this.apiKeyLte = apiKeyLte;
    }

    public ExternalCloudTowerWhereInput apiKeyLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_API_KEY_LTE);
        return this;
    }

    public ExternalCloudTowerWhereInput apiKeyLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_API_KEY_LTE);
        return this;
    }

    public void setApiKeyLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_API_KEY_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_API_KEY_LTE);
        }
    }

    public boolean getApiKeyLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_API_KEY_LTE);
    }

    public ExternalCloudTowerWhereInput apiKeyNot(String apiKeyNot) {

        this.apiKeyNot = apiKeyNot;
        return this;
    }

    /**
     * Get apiKeyNot
     *
     * @return apiKeyNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getApiKeyNot() {
        return apiKeyNot;
    }

    public void setApiKeyNot(String apiKeyNot) {
        this.apiKeyNot = apiKeyNot;
    }

    public ExternalCloudTowerWhereInput apiKeyNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_API_KEY_NOT);
        return this;
    }

    public ExternalCloudTowerWhereInput apiKeyNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_API_KEY_NOT);
        return this;
    }

    public void setApiKeyNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_API_KEY_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_API_KEY_NOT);
        }
    }

    public boolean getApiKeyNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_API_KEY_NOT);
    }

    public ExternalCloudTowerWhereInput apiKeyNotContains(String apiKeyNotContains) {

        this.apiKeyNotContains = apiKeyNotContains;
        return this;
    }

    /**
     * Get apiKeyNotContains
     *
     * @return apiKeyNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getApiKeyNotContains() {
        return apiKeyNotContains;
    }

    public void setApiKeyNotContains(String apiKeyNotContains) {
        this.apiKeyNotContains = apiKeyNotContains;
    }

    public ExternalCloudTowerWhereInput apiKeyNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_API_KEY_NOT_CONTAINS);
        return this;
    }

    public ExternalCloudTowerWhereInput apiKeyNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_API_KEY_NOT_CONTAINS);
        return this;
    }

    public void setApiKeyNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_API_KEY_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_API_KEY_NOT_CONTAINS);
        }
    }

    public boolean getApiKeyNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_API_KEY_NOT_CONTAINS);
    }

    public ExternalCloudTowerWhereInput apiKeyNotEndsWith(String apiKeyNotEndsWith) {

        this.apiKeyNotEndsWith = apiKeyNotEndsWith;
        return this;
    }

    /**
     * Get apiKeyNotEndsWith
     *
     * @return apiKeyNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getApiKeyNotEndsWith() {
        return apiKeyNotEndsWith;
    }

    public void setApiKeyNotEndsWith(String apiKeyNotEndsWith) {
        this.apiKeyNotEndsWith = apiKeyNotEndsWith;
    }

    public ExternalCloudTowerWhereInput apiKeyNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_API_KEY_NOT_ENDS_WITH);
        return this;
    }

    public ExternalCloudTowerWhereInput apiKeyNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_API_KEY_NOT_ENDS_WITH);
        return this;
    }

    public void setApiKeyNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_API_KEY_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_API_KEY_NOT_ENDS_WITH);
        }
    }

    public boolean getApiKeyNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_API_KEY_NOT_ENDS_WITH);
    }

    public ExternalCloudTowerWhereInput apiKeyNotIn(List<String> apiKeyNotIn) {

        this.apiKeyNotIn = apiKeyNotIn;
        return this;
    }

    public ExternalCloudTowerWhereInput addApiKeyNotInItem(String apiKeyNotInItem) {
        if (this.apiKeyNotIn == null) {
            this.apiKeyNotIn = new ArrayList<String>();
        }
        this.apiKeyNotIn.add(apiKeyNotInItem);
        return this;
    }

    /**
     * Get apiKeyNotIn
     *
     * @return apiKeyNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getApiKeyNotIn() {
        return apiKeyNotIn;
    }

    public void setApiKeyNotIn(List<String> apiKeyNotIn) {
        this.apiKeyNotIn = apiKeyNotIn;
    }

    public ExternalCloudTowerWhereInput apiKeyNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_API_KEY_NOT_IN);
        return this;
    }

    public ExternalCloudTowerWhereInput apiKeyNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_API_KEY_NOT_IN);
        return this;
    }

    public void setApiKeyNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_API_KEY_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_API_KEY_NOT_IN);
        }
    }

    public boolean getApiKeyNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_API_KEY_NOT_IN);
    }

    public ExternalCloudTowerWhereInput apiKeyNotStartsWith(String apiKeyNotStartsWith) {

        this.apiKeyNotStartsWith = apiKeyNotStartsWith;
        return this;
    }

    /**
     * Get apiKeyNotStartsWith
     *
     * @return apiKeyNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getApiKeyNotStartsWith() {
        return apiKeyNotStartsWith;
    }

    public void setApiKeyNotStartsWith(String apiKeyNotStartsWith) {
        this.apiKeyNotStartsWith = apiKeyNotStartsWith;
    }

    public ExternalCloudTowerWhereInput apiKeyNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_API_KEY_NOT_STARTS_WITH);
        return this;
    }

    public ExternalCloudTowerWhereInput apiKeyNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_API_KEY_NOT_STARTS_WITH);
        return this;
    }

    public void setApiKeyNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_API_KEY_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_API_KEY_NOT_STARTS_WITH);
        }
    }

    public boolean getApiKeyNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_API_KEY_NOT_STARTS_WITH);
    }

    public ExternalCloudTowerWhereInput apiKeyStartsWith(String apiKeyStartsWith) {

        this.apiKeyStartsWith = apiKeyStartsWith;
        return this;
    }

    /**
     * Get apiKeyStartsWith
     *
     * @return apiKeyStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getApiKeyStartsWith() {
        return apiKeyStartsWith;
    }

    public void setApiKeyStartsWith(String apiKeyStartsWith) {
        this.apiKeyStartsWith = apiKeyStartsWith;
    }

    public ExternalCloudTowerWhereInput apiKeyStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_API_KEY_STARTS_WITH);
        return this;
    }

    public ExternalCloudTowerWhereInput apiKeyStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_API_KEY_STARTS_WITH);
        return this;
    }

    public void setApiKeyStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_API_KEY_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_API_KEY_STARTS_WITH);
        }
    }

    public boolean getApiKeyStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_API_KEY_STARTS_WITH);
    }

    public ExternalCloudTowerWhereInput createdAt(String createdAt) {

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

    public ExternalCloudTowerWhereInput createdAt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT);
        return this;
    }

    public ExternalCloudTowerWhereInput createdAt_ExplictlyNonNull() {
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

    public ExternalCloudTowerWhereInput createdAtGt(String createdAtGt) {

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

    public ExternalCloudTowerWhereInput createdAtGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_GT);
        return this;
    }

    public ExternalCloudTowerWhereInput createdAtGt_ExplictlyNonNull() {
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

    public ExternalCloudTowerWhereInput createdAtGte(String createdAtGte) {

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

    public ExternalCloudTowerWhereInput createdAtGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_GTE);
        return this;
    }

    public ExternalCloudTowerWhereInput createdAtGte_ExplictlyNonNull() {
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

    public ExternalCloudTowerWhereInput createdAtIn(List<String> createdAtIn) {

        this.createdAtIn = createdAtIn;
        return this;
    }

    public ExternalCloudTowerWhereInput addCreatedAtInItem(String createdAtInItem) {
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

    public ExternalCloudTowerWhereInput createdAtIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_IN);
        return this;
    }

    public ExternalCloudTowerWhereInput createdAtIn_ExplictlyNonNull() {
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

    public ExternalCloudTowerWhereInput createdAtLt(String createdAtLt) {

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

    public ExternalCloudTowerWhereInput createdAtLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_LT);
        return this;
    }

    public ExternalCloudTowerWhereInput createdAtLt_ExplictlyNonNull() {
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

    public ExternalCloudTowerWhereInput createdAtLte(String createdAtLte) {

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

    public ExternalCloudTowerWhereInput createdAtLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_LTE);
        return this;
    }

    public ExternalCloudTowerWhereInput createdAtLte_ExplictlyNonNull() {
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

    public ExternalCloudTowerWhereInput createdAtNot(String createdAtNot) {

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

    public ExternalCloudTowerWhereInput createdAtNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_NOT);
        return this;
    }

    public ExternalCloudTowerWhereInput createdAtNot_ExplictlyNonNull() {
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

    public ExternalCloudTowerWhereInput createdAtNotIn(List<String> createdAtNotIn) {

        this.createdAtNotIn = createdAtNotIn;
        return this;
    }

    public ExternalCloudTowerWhereInput addCreatedAtNotInItem(String createdAtNotInItem) {
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

    public ExternalCloudTowerWhereInput createdAtNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_AT_NOT_IN);
        return this;
    }

    public ExternalCloudTowerWhereInput createdAtNotIn_ExplictlyNonNull() {
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

    public ExternalCloudTowerWhereInput deployId(String deployId) {

        this.deployId = deployId;
        return this;
    }

    /**
     * Get deployId
     *
     * @return deployId
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDeployId() {
        return deployId;
    }

    public void setDeployId(String deployId) {
        this.deployId = deployId;
    }

    public ExternalCloudTowerWhereInput deployId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEPLOY_ID);
        return this;
    }

    public ExternalCloudTowerWhereInput deployId_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEPLOY_ID);
        return this;
    }

    public void setDeployId_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEPLOY_ID);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEPLOY_ID);
        }
    }

    public boolean getDeployId_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEPLOY_ID);
    }

    public ExternalCloudTowerWhereInput deployIdContains(String deployIdContains) {

        this.deployIdContains = deployIdContains;
        return this;
    }

    /**
     * Get deployIdContains
     *
     * @return deployIdContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDeployIdContains() {
        return deployIdContains;
    }

    public void setDeployIdContains(String deployIdContains) {
        this.deployIdContains = deployIdContains;
    }

    public ExternalCloudTowerWhereInput deployIdContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEPLOY_ID_CONTAINS);
        return this;
    }

    public ExternalCloudTowerWhereInput deployIdContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEPLOY_ID_CONTAINS);
        return this;
    }

    public void setDeployIdContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEPLOY_ID_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEPLOY_ID_CONTAINS);
        }
    }

    public boolean getDeployIdContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEPLOY_ID_CONTAINS);
    }

    public ExternalCloudTowerWhereInput deployIdEndsWith(String deployIdEndsWith) {

        this.deployIdEndsWith = deployIdEndsWith;
        return this;
    }

    /**
     * Get deployIdEndsWith
     *
     * @return deployIdEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDeployIdEndsWith() {
        return deployIdEndsWith;
    }

    public void setDeployIdEndsWith(String deployIdEndsWith) {
        this.deployIdEndsWith = deployIdEndsWith;
    }

    public ExternalCloudTowerWhereInput deployIdEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEPLOY_ID_ENDS_WITH);
        return this;
    }

    public ExternalCloudTowerWhereInput deployIdEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEPLOY_ID_ENDS_WITH);
        return this;
    }

    public void setDeployIdEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEPLOY_ID_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEPLOY_ID_ENDS_WITH);
        }
    }

    public boolean getDeployIdEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEPLOY_ID_ENDS_WITH);
    }

    public ExternalCloudTowerWhereInput deployIdGt(String deployIdGt) {

        this.deployIdGt = deployIdGt;
        return this;
    }

    /**
     * Get deployIdGt
     *
     * @return deployIdGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDeployIdGt() {
        return deployIdGt;
    }

    public void setDeployIdGt(String deployIdGt) {
        this.deployIdGt = deployIdGt;
    }

    public ExternalCloudTowerWhereInput deployIdGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEPLOY_ID_GT);
        return this;
    }

    public ExternalCloudTowerWhereInput deployIdGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEPLOY_ID_GT);
        return this;
    }

    public void setDeployIdGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEPLOY_ID_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEPLOY_ID_GT);
        }
    }

    public boolean getDeployIdGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEPLOY_ID_GT);
    }

    public ExternalCloudTowerWhereInput deployIdGte(String deployIdGte) {

        this.deployIdGte = deployIdGte;
        return this;
    }

    /**
     * Get deployIdGte
     *
     * @return deployIdGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDeployIdGte() {
        return deployIdGte;
    }

    public void setDeployIdGte(String deployIdGte) {
        this.deployIdGte = deployIdGte;
    }

    public ExternalCloudTowerWhereInput deployIdGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEPLOY_ID_GTE);
        return this;
    }

    public ExternalCloudTowerWhereInput deployIdGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEPLOY_ID_GTE);
        return this;
    }

    public void setDeployIdGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEPLOY_ID_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEPLOY_ID_GTE);
        }
    }

    public boolean getDeployIdGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEPLOY_ID_GTE);
    }

    public ExternalCloudTowerWhereInput deployIdIn(List<String> deployIdIn) {

        this.deployIdIn = deployIdIn;
        return this;
    }

    public ExternalCloudTowerWhereInput addDeployIdInItem(String deployIdInItem) {
        if (this.deployIdIn == null) {
            this.deployIdIn = new ArrayList<String>();
        }
        this.deployIdIn.add(deployIdInItem);
        return this;
    }

    /**
     * Get deployIdIn
     *
     * @return deployIdIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getDeployIdIn() {
        return deployIdIn;
    }

    public void setDeployIdIn(List<String> deployIdIn) {
        this.deployIdIn = deployIdIn;
    }

    public ExternalCloudTowerWhereInput deployIdIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEPLOY_ID_IN);
        return this;
    }

    public ExternalCloudTowerWhereInput deployIdIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEPLOY_ID_IN);
        return this;
    }

    public void setDeployIdIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEPLOY_ID_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEPLOY_ID_IN);
        }
    }

    public boolean getDeployIdIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEPLOY_ID_IN);
    }

    public ExternalCloudTowerWhereInput deployIdLt(String deployIdLt) {

        this.deployIdLt = deployIdLt;
        return this;
    }

    /**
     * Get deployIdLt
     *
     * @return deployIdLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDeployIdLt() {
        return deployIdLt;
    }

    public void setDeployIdLt(String deployIdLt) {
        this.deployIdLt = deployIdLt;
    }

    public ExternalCloudTowerWhereInput deployIdLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEPLOY_ID_LT);
        return this;
    }

    public ExternalCloudTowerWhereInput deployIdLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEPLOY_ID_LT);
        return this;
    }

    public void setDeployIdLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEPLOY_ID_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEPLOY_ID_LT);
        }
    }

    public boolean getDeployIdLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEPLOY_ID_LT);
    }

    public ExternalCloudTowerWhereInput deployIdLte(String deployIdLte) {

        this.deployIdLte = deployIdLte;
        return this;
    }

    /**
     * Get deployIdLte
     *
     * @return deployIdLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDeployIdLte() {
        return deployIdLte;
    }

    public void setDeployIdLte(String deployIdLte) {
        this.deployIdLte = deployIdLte;
    }

    public ExternalCloudTowerWhereInput deployIdLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEPLOY_ID_LTE);
        return this;
    }

    public ExternalCloudTowerWhereInput deployIdLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEPLOY_ID_LTE);
        return this;
    }

    public void setDeployIdLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEPLOY_ID_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEPLOY_ID_LTE);
        }
    }

    public boolean getDeployIdLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEPLOY_ID_LTE);
    }

    public ExternalCloudTowerWhereInput deployIdNot(String deployIdNot) {

        this.deployIdNot = deployIdNot;
        return this;
    }

    /**
     * Get deployIdNot
     *
     * @return deployIdNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDeployIdNot() {
        return deployIdNot;
    }

    public void setDeployIdNot(String deployIdNot) {
        this.deployIdNot = deployIdNot;
    }

    public ExternalCloudTowerWhereInput deployIdNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEPLOY_ID_NOT);
        return this;
    }

    public ExternalCloudTowerWhereInput deployIdNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEPLOY_ID_NOT);
        return this;
    }

    public void setDeployIdNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEPLOY_ID_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEPLOY_ID_NOT);
        }
    }

    public boolean getDeployIdNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEPLOY_ID_NOT);
    }

    public ExternalCloudTowerWhereInput deployIdNotContains(String deployIdNotContains) {

        this.deployIdNotContains = deployIdNotContains;
        return this;
    }

    /**
     * Get deployIdNotContains
     *
     * @return deployIdNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDeployIdNotContains() {
        return deployIdNotContains;
    }

    public void setDeployIdNotContains(String deployIdNotContains) {
        this.deployIdNotContains = deployIdNotContains;
    }

    public ExternalCloudTowerWhereInput deployIdNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEPLOY_ID_NOT_CONTAINS);
        return this;
    }

    public ExternalCloudTowerWhereInput deployIdNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEPLOY_ID_NOT_CONTAINS);
        return this;
    }

    public void setDeployIdNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEPLOY_ID_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEPLOY_ID_NOT_CONTAINS);
        }
    }

    public boolean getDeployIdNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEPLOY_ID_NOT_CONTAINS);
    }

    public ExternalCloudTowerWhereInput deployIdNotEndsWith(String deployIdNotEndsWith) {

        this.deployIdNotEndsWith = deployIdNotEndsWith;
        return this;
    }

    /**
     * Get deployIdNotEndsWith
     *
     * @return deployIdNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDeployIdNotEndsWith() {
        return deployIdNotEndsWith;
    }

    public void setDeployIdNotEndsWith(String deployIdNotEndsWith) {
        this.deployIdNotEndsWith = deployIdNotEndsWith;
    }

    public ExternalCloudTowerWhereInput deployIdNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEPLOY_ID_NOT_ENDS_WITH);
        return this;
    }

    public ExternalCloudTowerWhereInput deployIdNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEPLOY_ID_NOT_ENDS_WITH);
        return this;
    }

    public void setDeployIdNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEPLOY_ID_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEPLOY_ID_NOT_ENDS_WITH);
        }
    }

    public boolean getDeployIdNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEPLOY_ID_NOT_ENDS_WITH);
    }

    public ExternalCloudTowerWhereInput deployIdNotIn(List<String> deployIdNotIn) {

        this.deployIdNotIn = deployIdNotIn;
        return this;
    }

    public ExternalCloudTowerWhereInput addDeployIdNotInItem(String deployIdNotInItem) {
        if (this.deployIdNotIn == null) {
            this.deployIdNotIn = new ArrayList<String>();
        }
        this.deployIdNotIn.add(deployIdNotInItem);
        return this;
    }

    /**
     * Get deployIdNotIn
     *
     * @return deployIdNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getDeployIdNotIn() {
        return deployIdNotIn;
    }

    public void setDeployIdNotIn(List<String> deployIdNotIn) {
        this.deployIdNotIn = deployIdNotIn;
    }

    public ExternalCloudTowerWhereInput deployIdNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEPLOY_ID_NOT_IN);
        return this;
    }

    public ExternalCloudTowerWhereInput deployIdNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEPLOY_ID_NOT_IN);
        return this;
    }

    public void setDeployIdNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEPLOY_ID_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEPLOY_ID_NOT_IN);
        }
    }

    public boolean getDeployIdNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEPLOY_ID_NOT_IN);
    }

    public ExternalCloudTowerWhereInput deployIdNotStartsWith(String deployIdNotStartsWith) {

        this.deployIdNotStartsWith = deployIdNotStartsWith;
        return this;
    }

    /**
     * Get deployIdNotStartsWith
     *
     * @return deployIdNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDeployIdNotStartsWith() {
        return deployIdNotStartsWith;
    }

    public void setDeployIdNotStartsWith(String deployIdNotStartsWith) {
        this.deployIdNotStartsWith = deployIdNotStartsWith;
    }

    public ExternalCloudTowerWhereInput deployIdNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEPLOY_ID_NOT_STARTS_WITH);
        return this;
    }

    public ExternalCloudTowerWhereInput deployIdNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEPLOY_ID_NOT_STARTS_WITH);
        return this;
    }

    public void setDeployIdNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEPLOY_ID_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEPLOY_ID_NOT_STARTS_WITH);
        }
    }

    public boolean getDeployIdNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEPLOY_ID_NOT_STARTS_WITH);
    }

    public ExternalCloudTowerWhereInput deployIdStartsWith(String deployIdStartsWith) {

        this.deployIdStartsWith = deployIdStartsWith;
        return this;
    }

    /**
     * Get deployIdStartsWith
     *
     * @return deployIdStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getDeployIdStartsWith() {
        return deployIdStartsWith;
    }

    public void setDeployIdStartsWith(String deployIdStartsWith) {
        this.deployIdStartsWith = deployIdStartsWith;
    }

    public ExternalCloudTowerWhereInput deployIdStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DEPLOY_ID_STARTS_WITH);
        return this;
    }

    public ExternalCloudTowerWhereInput deployIdStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DEPLOY_ID_STARTS_WITH);
        return this;
    }

    public void setDeployIdStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DEPLOY_ID_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DEPLOY_ID_STARTS_WITH);
        }
    }

    public boolean getDeployIdStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DEPLOY_ID_STARTS_WITH);
    }

    public ExternalCloudTowerWhereInput description(String description) {

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

    public ExternalCloudTowerWhereInput description_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION);
        return this;
    }

    public ExternalCloudTowerWhereInput description_ExplictlyNonNull() {
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

    public ExternalCloudTowerWhereInput descriptionContains(String descriptionContains) {

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

    public ExternalCloudTowerWhereInput descriptionContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_CONTAINS);
        return this;
    }

    public ExternalCloudTowerWhereInput descriptionContains_ExplictlyNonNull() {
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

    public ExternalCloudTowerWhereInput descriptionEndsWith(String descriptionEndsWith) {

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

    public ExternalCloudTowerWhereInput descriptionEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_ENDS_WITH);
        return this;
    }

    public ExternalCloudTowerWhereInput descriptionEndsWith_ExplictlyNonNull() {
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

    public ExternalCloudTowerWhereInput descriptionGt(String descriptionGt) {

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

    public ExternalCloudTowerWhereInput descriptionGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_GT);
        return this;
    }

    public ExternalCloudTowerWhereInput descriptionGt_ExplictlyNonNull() {
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

    public ExternalCloudTowerWhereInput descriptionGte(String descriptionGte) {

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

    public ExternalCloudTowerWhereInput descriptionGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_GTE);
        return this;
    }

    public ExternalCloudTowerWhereInput descriptionGte_ExplictlyNonNull() {
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

    public ExternalCloudTowerWhereInput descriptionIn(List<String> descriptionIn) {

        this.descriptionIn = descriptionIn;
        return this;
    }

    public ExternalCloudTowerWhereInput addDescriptionInItem(String descriptionInItem) {
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

    public ExternalCloudTowerWhereInput descriptionIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_IN);
        return this;
    }

    public ExternalCloudTowerWhereInput descriptionIn_ExplictlyNonNull() {
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

    public ExternalCloudTowerWhereInput descriptionLt(String descriptionLt) {

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

    public ExternalCloudTowerWhereInput descriptionLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_LT);
        return this;
    }

    public ExternalCloudTowerWhereInput descriptionLt_ExplictlyNonNull() {
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

    public ExternalCloudTowerWhereInput descriptionLte(String descriptionLte) {

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

    public ExternalCloudTowerWhereInput descriptionLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_LTE);
        return this;
    }

    public ExternalCloudTowerWhereInput descriptionLte_ExplictlyNonNull() {
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

    public ExternalCloudTowerWhereInput descriptionNot(String descriptionNot) {

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

    public ExternalCloudTowerWhereInput descriptionNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT);
        return this;
    }

    public ExternalCloudTowerWhereInput descriptionNot_ExplictlyNonNull() {
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

    public ExternalCloudTowerWhereInput descriptionNotContains(String descriptionNotContains) {

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

    public ExternalCloudTowerWhereInput descriptionNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_CONTAINS);
        return this;
    }

    public ExternalCloudTowerWhereInput descriptionNotContains_ExplictlyNonNull() {
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

    public ExternalCloudTowerWhereInput descriptionNotEndsWith(String descriptionNotEndsWith) {

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

    public ExternalCloudTowerWhereInput descriptionNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_ENDS_WITH);
        return this;
    }

    public ExternalCloudTowerWhereInput descriptionNotEndsWith_ExplictlyNonNull() {
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

    public ExternalCloudTowerWhereInput descriptionNotIn(List<String> descriptionNotIn) {

        this.descriptionNotIn = descriptionNotIn;
        return this;
    }

    public ExternalCloudTowerWhereInput addDescriptionNotInItem(String descriptionNotInItem) {
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

    public ExternalCloudTowerWhereInput descriptionNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_IN);
        return this;
    }

    public ExternalCloudTowerWhereInput descriptionNotIn_ExplictlyNonNull() {
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

    public ExternalCloudTowerWhereInput descriptionNotStartsWith(String descriptionNotStartsWith) {

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

    public ExternalCloudTowerWhereInput descriptionNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_STARTS_WITH);
        return this;
    }

    public ExternalCloudTowerWhereInput descriptionNotStartsWith_ExplictlyNonNull() {
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

    public ExternalCloudTowerWhereInput descriptionStartsWith(String descriptionStartsWith) {

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

    public ExternalCloudTowerWhereInput descriptionStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_STARTS_WITH);
        return this;
    }

    public ExternalCloudTowerWhereInput descriptionStartsWith_ExplictlyNonNull() {
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

    public ExternalCloudTowerWhereInput endpoint(String endpoint) {

        this.endpoint = endpoint;
        return this;
    }

    /**
     * Get endpoint
     *
     * @return endpoint
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public ExternalCloudTowerWhereInput endpoint_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENDPOINT);
        return this;
    }

    public ExternalCloudTowerWhereInput endpoint_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ENDPOINT);
        return this;
    }

    public void setEndpoint_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ENDPOINT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ENDPOINT);
        }
    }

    public boolean getEndpoint_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ENDPOINT);
    }

    public ExternalCloudTowerWhereInput endpointContains(String endpointContains) {

        this.endpointContains = endpointContains;
        return this;
    }

    /**
     * Get endpointContains
     *
     * @return endpointContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getEndpointContains() {
        return endpointContains;
    }

    public void setEndpointContains(String endpointContains) {
        this.endpointContains = endpointContains;
    }

    public ExternalCloudTowerWhereInput endpointContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENDPOINT_CONTAINS);
        return this;
    }

    public ExternalCloudTowerWhereInput endpointContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ENDPOINT_CONTAINS);
        return this;
    }

    public void setEndpointContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ENDPOINT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ENDPOINT_CONTAINS);
        }
    }

    public boolean getEndpointContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ENDPOINT_CONTAINS);
    }

    public ExternalCloudTowerWhereInput endpointEndsWith(String endpointEndsWith) {

        this.endpointEndsWith = endpointEndsWith;
        return this;
    }

    /**
     * Get endpointEndsWith
     *
     * @return endpointEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getEndpointEndsWith() {
        return endpointEndsWith;
    }

    public void setEndpointEndsWith(String endpointEndsWith) {
        this.endpointEndsWith = endpointEndsWith;
    }

    public ExternalCloudTowerWhereInput endpointEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENDPOINT_ENDS_WITH);
        return this;
    }

    public ExternalCloudTowerWhereInput endpointEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ENDPOINT_ENDS_WITH);
        return this;
    }

    public void setEndpointEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ENDPOINT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ENDPOINT_ENDS_WITH);
        }
    }

    public boolean getEndpointEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ENDPOINT_ENDS_WITH);
    }

    public ExternalCloudTowerWhereInput endpointGt(String endpointGt) {

        this.endpointGt = endpointGt;
        return this;
    }

    /**
     * Get endpointGt
     *
     * @return endpointGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getEndpointGt() {
        return endpointGt;
    }

    public void setEndpointGt(String endpointGt) {
        this.endpointGt = endpointGt;
    }

    public ExternalCloudTowerWhereInput endpointGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENDPOINT_GT);
        return this;
    }

    public ExternalCloudTowerWhereInput endpointGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ENDPOINT_GT);
        return this;
    }

    public void setEndpointGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ENDPOINT_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ENDPOINT_GT);
        }
    }

    public boolean getEndpointGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ENDPOINT_GT);
    }

    public ExternalCloudTowerWhereInput endpointGte(String endpointGte) {

        this.endpointGte = endpointGte;
        return this;
    }

    /**
     * Get endpointGte
     *
     * @return endpointGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getEndpointGte() {
        return endpointGte;
    }

    public void setEndpointGte(String endpointGte) {
        this.endpointGte = endpointGte;
    }

    public ExternalCloudTowerWhereInput endpointGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENDPOINT_GTE);
        return this;
    }

    public ExternalCloudTowerWhereInput endpointGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ENDPOINT_GTE);
        return this;
    }

    public void setEndpointGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ENDPOINT_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ENDPOINT_GTE);
        }
    }

    public boolean getEndpointGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ENDPOINT_GTE);
    }

    public ExternalCloudTowerWhereInput endpointIn(List<String> endpointIn) {

        this.endpointIn = endpointIn;
        return this;
    }

    public ExternalCloudTowerWhereInput addEndpointInItem(String endpointInItem) {
        if (this.endpointIn == null) {
            this.endpointIn = new ArrayList<String>();
        }
        this.endpointIn.add(endpointInItem);
        return this;
    }

    /**
     * Get endpointIn
     *
     * @return endpointIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getEndpointIn() {
        return endpointIn;
    }

    public void setEndpointIn(List<String> endpointIn) {
        this.endpointIn = endpointIn;
    }

    public ExternalCloudTowerWhereInput endpointIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENDPOINT_IN);
        return this;
    }

    public ExternalCloudTowerWhereInput endpointIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ENDPOINT_IN);
        return this;
    }

    public void setEndpointIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ENDPOINT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ENDPOINT_IN);
        }
    }

    public boolean getEndpointIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ENDPOINT_IN);
    }

    public ExternalCloudTowerWhereInput endpointLt(String endpointLt) {

        this.endpointLt = endpointLt;
        return this;
    }

    /**
     * Get endpointLt
     *
     * @return endpointLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getEndpointLt() {
        return endpointLt;
    }

    public void setEndpointLt(String endpointLt) {
        this.endpointLt = endpointLt;
    }

    public ExternalCloudTowerWhereInput endpointLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENDPOINT_LT);
        return this;
    }

    public ExternalCloudTowerWhereInput endpointLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ENDPOINT_LT);
        return this;
    }

    public void setEndpointLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ENDPOINT_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ENDPOINT_LT);
        }
    }

    public boolean getEndpointLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ENDPOINT_LT);
    }

    public ExternalCloudTowerWhereInput endpointLte(String endpointLte) {

        this.endpointLte = endpointLte;
        return this;
    }

    /**
     * Get endpointLte
     *
     * @return endpointLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getEndpointLte() {
        return endpointLte;
    }

    public void setEndpointLte(String endpointLte) {
        this.endpointLte = endpointLte;
    }

    public ExternalCloudTowerWhereInput endpointLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENDPOINT_LTE);
        return this;
    }

    public ExternalCloudTowerWhereInput endpointLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ENDPOINT_LTE);
        return this;
    }

    public void setEndpointLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ENDPOINT_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ENDPOINT_LTE);
        }
    }

    public boolean getEndpointLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ENDPOINT_LTE);
    }

    public ExternalCloudTowerWhereInput endpointNot(String endpointNot) {

        this.endpointNot = endpointNot;
        return this;
    }

    /**
     * Get endpointNot
     *
     * @return endpointNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getEndpointNot() {
        return endpointNot;
    }

    public void setEndpointNot(String endpointNot) {
        this.endpointNot = endpointNot;
    }

    public ExternalCloudTowerWhereInput endpointNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENDPOINT_NOT);
        return this;
    }

    public ExternalCloudTowerWhereInput endpointNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ENDPOINT_NOT);
        return this;
    }

    public void setEndpointNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ENDPOINT_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ENDPOINT_NOT);
        }
    }

    public boolean getEndpointNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ENDPOINT_NOT);
    }

    public ExternalCloudTowerWhereInput endpointNotContains(String endpointNotContains) {

        this.endpointNotContains = endpointNotContains;
        return this;
    }

    /**
     * Get endpointNotContains
     *
     * @return endpointNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getEndpointNotContains() {
        return endpointNotContains;
    }

    public void setEndpointNotContains(String endpointNotContains) {
        this.endpointNotContains = endpointNotContains;
    }

    public ExternalCloudTowerWhereInput endpointNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENDPOINT_NOT_CONTAINS);
        return this;
    }

    public ExternalCloudTowerWhereInput endpointNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ENDPOINT_NOT_CONTAINS);
        return this;
    }

    public void setEndpointNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ENDPOINT_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ENDPOINT_NOT_CONTAINS);
        }
    }

    public boolean getEndpointNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ENDPOINT_NOT_CONTAINS);
    }

    public ExternalCloudTowerWhereInput endpointNotEndsWith(String endpointNotEndsWith) {

        this.endpointNotEndsWith = endpointNotEndsWith;
        return this;
    }

    /**
     * Get endpointNotEndsWith
     *
     * @return endpointNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getEndpointNotEndsWith() {
        return endpointNotEndsWith;
    }

    public void setEndpointNotEndsWith(String endpointNotEndsWith) {
        this.endpointNotEndsWith = endpointNotEndsWith;
    }

    public ExternalCloudTowerWhereInput endpointNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENDPOINT_NOT_ENDS_WITH);
        return this;
    }

    public ExternalCloudTowerWhereInput endpointNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ENDPOINT_NOT_ENDS_WITH);
        return this;
    }

    public void setEndpointNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ENDPOINT_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ENDPOINT_NOT_ENDS_WITH);
        }
    }

    public boolean getEndpointNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ENDPOINT_NOT_ENDS_WITH);
    }

    public ExternalCloudTowerWhereInput endpointNotIn(List<String> endpointNotIn) {

        this.endpointNotIn = endpointNotIn;
        return this;
    }

    public ExternalCloudTowerWhereInput addEndpointNotInItem(String endpointNotInItem) {
        if (this.endpointNotIn == null) {
            this.endpointNotIn = new ArrayList<String>();
        }
        this.endpointNotIn.add(endpointNotInItem);
        return this;
    }

    /**
     * Get endpointNotIn
     *
     * @return endpointNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getEndpointNotIn() {
        return endpointNotIn;
    }

    public void setEndpointNotIn(List<String> endpointNotIn) {
        this.endpointNotIn = endpointNotIn;
    }

    public ExternalCloudTowerWhereInput endpointNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENDPOINT_NOT_IN);
        return this;
    }

    public ExternalCloudTowerWhereInput endpointNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ENDPOINT_NOT_IN);
        return this;
    }

    public void setEndpointNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ENDPOINT_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ENDPOINT_NOT_IN);
        }
    }

    public boolean getEndpointNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ENDPOINT_NOT_IN);
    }

    public ExternalCloudTowerWhereInput endpointNotStartsWith(String endpointNotStartsWith) {

        this.endpointNotStartsWith = endpointNotStartsWith;
        return this;
    }

    /**
     * Get endpointNotStartsWith
     *
     * @return endpointNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getEndpointNotStartsWith() {
        return endpointNotStartsWith;
    }

    public void setEndpointNotStartsWith(String endpointNotStartsWith) {
        this.endpointNotStartsWith = endpointNotStartsWith;
    }

    public ExternalCloudTowerWhereInput endpointNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENDPOINT_NOT_STARTS_WITH);
        return this;
    }

    public ExternalCloudTowerWhereInput endpointNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ENDPOINT_NOT_STARTS_WITH);
        return this;
    }

    public void setEndpointNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ENDPOINT_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ENDPOINT_NOT_STARTS_WITH);
        }
    }

    public boolean getEndpointNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ENDPOINT_NOT_STARTS_WITH);
    }

    public ExternalCloudTowerWhereInput endpointStartsWith(String endpointStartsWith) {

        this.endpointStartsWith = endpointStartsWith;
        return this;
    }

    /**
     * Get endpointStartsWith
     *
     * @return endpointStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getEndpointStartsWith() {
        return endpointStartsWith;
    }

    public void setEndpointStartsWith(String endpointStartsWith) {
        this.endpointStartsWith = endpointStartsWith;
    }

    public ExternalCloudTowerWhereInput endpointStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENDPOINT_STARTS_WITH);
        return this;
    }

    public ExternalCloudTowerWhereInput endpointStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_ENDPOINT_STARTS_WITH);
        return this;
    }

    public void setEndpointStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_ENDPOINT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_ENDPOINT_STARTS_WITH);
        }
    }

    public boolean getEndpointStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_ENDPOINT_STARTS_WITH);
    }

    public ExternalCloudTowerWhereInput entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {

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

    public ExternalCloudTowerWhereInput entityAsyncStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        return this;
    }

    public ExternalCloudTowerWhereInput entityAsyncStatus_ExplictlyNonNull() {
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

    public ExternalCloudTowerWhereInput entityAsyncStatusIn(
            List<EntityAsyncStatus> entityAsyncStatusIn) {

        this.entityAsyncStatusIn = entityAsyncStatusIn;
        return this;
    }

    public ExternalCloudTowerWhereInput addEntityAsyncStatusInItem(
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

    public ExternalCloudTowerWhereInput entityAsyncStatusIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_IN);
        return this;
    }

    public ExternalCloudTowerWhereInput entityAsyncStatusIn_ExplictlyNonNull() {
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

    public ExternalCloudTowerWhereInput entityAsyncStatusNot(
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

    public ExternalCloudTowerWhereInput entityAsyncStatusNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT);
        return this;
    }

    public ExternalCloudTowerWhereInput entityAsyncStatusNot_ExplictlyNonNull() {
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

    public ExternalCloudTowerWhereInput entityAsyncStatusNotIn(
            List<EntityAsyncStatus> entityAsyncStatusNotIn) {

        this.entityAsyncStatusNotIn = entityAsyncStatusNotIn;
        return this;
    }

    public ExternalCloudTowerWhereInput addEntityAsyncStatusNotInItem(
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

    public ExternalCloudTowerWhereInput entityAsyncStatusNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT_IN);
        return this;
    }

    public ExternalCloudTowerWhereInput entityAsyncStatusNotIn_ExplictlyNonNull() {
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

    public ExternalCloudTowerWhereInput failbackExecutionsEvery(
            FailbackExecutionWhereInput failbackExecutionsEvery) {

        this.failbackExecutionsEvery = failbackExecutionsEvery;
        return this;
    }

    /**
     * Get failbackExecutionsEvery
     *
     * @return failbackExecutionsEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public FailbackExecutionWhereInput getFailbackExecutionsEvery() {
        return failbackExecutionsEvery;
    }

    public void setFailbackExecutionsEvery(FailbackExecutionWhereInput failbackExecutionsEvery) {
        this.failbackExecutionsEvery = failbackExecutionsEvery;
    }

    public ExternalCloudTowerWhereInput failbackExecutionsEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FAILBACK_EXECUTIONS_EVERY);
        return this;
    }

    public ExternalCloudTowerWhereInput failbackExecutionsEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FAILBACK_EXECUTIONS_EVERY);
        return this;
    }

    public void setFailbackExecutionsEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FAILBACK_EXECUTIONS_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FAILBACK_EXECUTIONS_EVERY);
        }
    }

    public boolean getFailbackExecutionsEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FAILBACK_EXECUTIONS_EVERY);
    }

    public ExternalCloudTowerWhereInput failbackExecutionsNone(
            FailbackExecutionWhereInput failbackExecutionsNone) {

        this.failbackExecutionsNone = failbackExecutionsNone;
        return this;
    }

    /**
     * Get failbackExecutionsNone
     *
     * @return failbackExecutionsNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public FailbackExecutionWhereInput getFailbackExecutionsNone() {
        return failbackExecutionsNone;
    }

    public void setFailbackExecutionsNone(FailbackExecutionWhereInput failbackExecutionsNone) {
        this.failbackExecutionsNone = failbackExecutionsNone;
    }

    public ExternalCloudTowerWhereInput failbackExecutionsNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FAILBACK_EXECUTIONS_NONE);
        return this;
    }

    public ExternalCloudTowerWhereInput failbackExecutionsNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FAILBACK_EXECUTIONS_NONE);
        return this;
    }

    public void setFailbackExecutionsNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FAILBACK_EXECUTIONS_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FAILBACK_EXECUTIONS_NONE);
        }
    }

    public boolean getFailbackExecutionsNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FAILBACK_EXECUTIONS_NONE);
    }

    public ExternalCloudTowerWhereInput failbackExecutionsSome(
            FailbackExecutionWhereInput failbackExecutionsSome) {

        this.failbackExecutionsSome = failbackExecutionsSome;
        return this;
    }

    /**
     * Get failbackExecutionsSome
     *
     * @return failbackExecutionsSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public FailbackExecutionWhereInput getFailbackExecutionsSome() {
        return failbackExecutionsSome;
    }

    public void setFailbackExecutionsSome(FailbackExecutionWhereInput failbackExecutionsSome) {
        this.failbackExecutionsSome = failbackExecutionsSome;
    }

    public ExternalCloudTowerWhereInput failbackExecutionsSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FAILBACK_EXECUTIONS_SOME);
        return this;
    }

    public ExternalCloudTowerWhereInput failbackExecutionsSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FAILBACK_EXECUTIONS_SOME);
        return this;
    }

    public void setFailbackExecutionsSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FAILBACK_EXECUTIONS_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FAILBACK_EXECUTIONS_SOME);
        }
    }

    public boolean getFailbackExecutionsSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FAILBACK_EXECUTIONS_SOME);
    }

    public ExternalCloudTowerWhereInput failoverExecutionsEvery(
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

    public ExternalCloudTowerWhereInput failoverExecutionsEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FAILOVER_EXECUTIONS_EVERY);
        return this;
    }

    public ExternalCloudTowerWhereInput failoverExecutionsEvery_ExplictlyNonNull() {
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

    public ExternalCloudTowerWhereInput failoverExecutionsNone(
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

    public ExternalCloudTowerWhereInput failoverExecutionsNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FAILOVER_EXECUTIONS_NONE);
        return this;
    }

    public ExternalCloudTowerWhereInput failoverExecutionsNone_ExplictlyNonNull() {
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

    public ExternalCloudTowerWhereInput failoverExecutionsSome(
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

    public ExternalCloudTowerWhereInput failoverExecutionsSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FAILOVER_EXECUTIONS_SOME);
        return this;
    }

    public ExternalCloudTowerWhereInput failoverExecutionsSome_ExplictlyNonNull() {
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

    public ExternalCloudTowerWhereInput id(String id) {

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

    public ExternalCloudTowerWhereInput id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public ExternalCloudTowerWhereInput id_ExplictlyNonNull() {
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

    public ExternalCloudTowerWhereInput idContains(String idContains) {

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

    public ExternalCloudTowerWhereInput idContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_CONTAINS);
        return this;
    }

    public ExternalCloudTowerWhereInput idContains_ExplictlyNonNull() {
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

    public ExternalCloudTowerWhereInput idEndsWith(String idEndsWith) {

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

    public ExternalCloudTowerWhereInput idEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_ENDS_WITH);
        return this;
    }

    public ExternalCloudTowerWhereInput idEndsWith_ExplictlyNonNull() {
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

    public ExternalCloudTowerWhereInput idGt(String idGt) {

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

    public ExternalCloudTowerWhereInput idGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GT);
        return this;
    }

    public ExternalCloudTowerWhereInput idGt_ExplictlyNonNull() {
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

    public ExternalCloudTowerWhereInput idGte(String idGte) {

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

    public ExternalCloudTowerWhereInput idGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GTE);
        return this;
    }

    public ExternalCloudTowerWhereInput idGte_ExplictlyNonNull() {
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

    public ExternalCloudTowerWhereInput idIn(List<String> idIn) {

        this.idIn = idIn;
        return this;
    }

    public ExternalCloudTowerWhereInput addIdInItem(String idInItem) {
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

    public ExternalCloudTowerWhereInput idIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_IN);
        return this;
    }

    public ExternalCloudTowerWhereInput idIn_ExplictlyNonNull() {
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

    public ExternalCloudTowerWhereInput idLt(String idLt) {

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

    public ExternalCloudTowerWhereInput idLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LT);
        return this;
    }

    public ExternalCloudTowerWhereInput idLt_ExplictlyNonNull() {
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

    public ExternalCloudTowerWhereInput idLte(String idLte) {

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

    public ExternalCloudTowerWhereInput idLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LTE);
        return this;
    }

    public ExternalCloudTowerWhereInput idLte_ExplictlyNonNull() {
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

    public ExternalCloudTowerWhereInput idNot(String idNot) {

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

    public ExternalCloudTowerWhereInput idNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT);
        return this;
    }

    public ExternalCloudTowerWhereInput idNot_ExplictlyNonNull() {
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

    public ExternalCloudTowerWhereInput idNotContains(String idNotContains) {

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

    public ExternalCloudTowerWhereInput idNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_CONTAINS);
        return this;
    }

    public ExternalCloudTowerWhereInput idNotContains_ExplictlyNonNull() {
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

    public ExternalCloudTowerWhereInput idNotEndsWith(String idNotEndsWith) {

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

    public ExternalCloudTowerWhereInput idNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
        return this;
    }

    public ExternalCloudTowerWhereInput idNotEndsWith_ExplictlyNonNull() {
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

    public ExternalCloudTowerWhereInput idNotIn(List<String> idNotIn) {

        this.idNotIn = idNotIn;
        return this;
    }

    public ExternalCloudTowerWhereInput addIdNotInItem(String idNotInItem) {
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

    public ExternalCloudTowerWhereInput idNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_IN);
        return this;
    }

    public ExternalCloudTowerWhereInput idNotIn_ExplictlyNonNull() {
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

    public ExternalCloudTowerWhereInput idNotStartsWith(String idNotStartsWith) {

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

    public ExternalCloudTowerWhereInput idNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
        return this;
    }

    public ExternalCloudTowerWhereInput idNotStartsWith_ExplictlyNonNull() {
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

    public ExternalCloudTowerWhereInput idStartsWith(String idStartsWith) {

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

    public ExternalCloudTowerWhereInput idStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_STARTS_WITH);
        return this;
    }

    public ExternalCloudTowerWhereInput idStartsWith_ExplictlyNonNull() {
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

    public ExternalCloudTowerWhereInput name(String name) {

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

    public ExternalCloudTowerWhereInput name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public ExternalCloudTowerWhereInput name_ExplictlyNonNull() {
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

    public ExternalCloudTowerWhereInput nameContains(String nameContains) {

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

    public ExternalCloudTowerWhereInput nameContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_CONTAINS);
        return this;
    }

    public ExternalCloudTowerWhereInput nameContains_ExplictlyNonNull() {
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

    public ExternalCloudTowerWhereInput nameEndsWith(String nameEndsWith) {

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

    public ExternalCloudTowerWhereInput nameEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_ENDS_WITH);
        return this;
    }

    public ExternalCloudTowerWhereInput nameEndsWith_ExplictlyNonNull() {
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

    public ExternalCloudTowerWhereInput nameGt(String nameGt) {

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

    public ExternalCloudTowerWhereInput nameGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_GT);
        return this;
    }

    public ExternalCloudTowerWhereInput nameGt_ExplictlyNonNull() {
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

    public ExternalCloudTowerWhereInput nameGte(String nameGte) {

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

    public ExternalCloudTowerWhereInput nameGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_GTE);
        return this;
    }

    public ExternalCloudTowerWhereInput nameGte_ExplictlyNonNull() {
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

    public ExternalCloudTowerWhereInput nameIn(List<String> nameIn) {

        this.nameIn = nameIn;
        return this;
    }

    public ExternalCloudTowerWhereInput addNameInItem(String nameInItem) {
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

    public ExternalCloudTowerWhereInput nameIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_IN);
        return this;
    }

    public ExternalCloudTowerWhereInput nameIn_ExplictlyNonNull() {
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

    public ExternalCloudTowerWhereInput nameLt(String nameLt) {

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

    public ExternalCloudTowerWhereInput nameLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_LT);
        return this;
    }

    public ExternalCloudTowerWhereInput nameLt_ExplictlyNonNull() {
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

    public ExternalCloudTowerWhereInput nameLte(String nameLte) {

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

    public ExternalCloudTowerWhereInput nameLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_LTE);
        return this;
    }

    public ExternalCloudTowerWhereInput nameLte_ExplictlyNonNull() {
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

    public ExternalCloudTowerWhereInput nameNot(String nameNot) {

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

    public ExternalCloudTowerWhereInput nameNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT);
        return this;
    }

    public ExternalCloudTowerWhereInput nameNot_ExplictlyNonNull() {
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

    public ExternalCloudTowerWhereInput nameNotContains(String nameNotContains) {

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

    public ExternalCloudTowerWhereInput nameNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_CONTAINS);
        return this;
    }

    public ExternalCloudTowerWhereInput nameNotContains_ExplictlyNonNull() {
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

    public ExternalCloudTowerWhereInput nameNotEndsWith(String nameNotEndsWith) {

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

    public ExternalCloudTowerWhereInput nameNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_ENDS_WITH);
        return this;
    }

    public ExternalCloudTowerWhereInput nameNotEndsWith_ExplictlyNonNull() {
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

    public ExternalCloudTowerWhereInput nameNotIn(List<String> nameNotIn) {

        this.nameNotIn = nameNotIn;
        return this;
    }

    public ExternalCloudTowerWhereInput addNameNotInItem(String nameNotInItem) {
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

    public ExternalCloudTowerWhereInput nameNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_IN);
        return this;
    }

    public ExternalCloudTowerWhereInput nameNotIn_ExplictlyNonNull() {
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

    public ExternalCloudTowerWhereInput nameNotStartsWith(String nameNotStartsWith) {

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

    public ExternalCloudTowerWhereInput nameNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_STARTS_WITH);
        return this;
    }

    public ExternalCloudTowerWhereInput nameNotStartsWith_ExplictlyNonNull() {
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

    public ExternalCloudTowerWhereInput nameStartsWith(String nameStartsWith) {

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

    public ExternalCloudTowerWhereInput nameStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_STARTS_WITH);
        return this;
    }

    public ExternalCloudTowerWhereInput nameStartsWith_ExplictlyNonNull() {
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

    public ExternalCloudTowerWhereInput permanentFailoverExecutionsEvery(
            PermanentFailoverExecutionWhereInput permanentFailoverExecutionsEvery) {

        this.permanentFailoverExecutionsEvery = permanentFailoverExecutionsEvery;
        return this;
    }

    /**
     * Get permanentFailoverExecutionsEvery
     *
     * @return permanentFailoverExecutionsEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public PermanentFailoverExecutionWhereInput getPermanentFailoverExecutionsEvery() {
        return permanentFailoverExecutionsEvery;
    }

    public void setPermanentFailoverExecutionsEvery(
            PermanentFailoverExecutionWhereInput permanentFailoverExecutionsEvery) {
        this.permanentFailoverExecutionsEvery = permanentFailoverExecutionsEvery;
    }

    public ExternalCloudTowerWhereInput permanentFailoverExecutionsEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PERMANENT_FAILOVER_EXECUTIONS_EVERY);
        return this;
    }

    public ExternalCloudTowerWhereInput permanentFailoverExecutionsEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PERMANENT_FAILOVER_EXECUTIONS_EVERY);
        return this;
    }

    public void setPermanentFailoverExecutionsEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PERMANENT_FAILOVER_EXECUTIONS_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PERMANENT_FAILOVER_EXECUTIONS_EVERY);
        }
    }

    public boolean getPermanentFailoverExecutionsEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PERMANENT_FAILOVER_EXECUTIONS_EVERY);
    }

    public ExternalCloudTowerWhereInput permanentFailoverExecutionsNone(
            PermanentFailoverExecutionWhereInput permanentFailoverExecutionsNone) {

        this.permanentFailoverExecutionsNone = permanentFailoverExecutionsNone;
        return this;
    }

    /**
     * Get permanentFailoverExecutionsNone
     *
     * @return permanentFailoverExecutionsNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public PermanentFailoverExecutionWhereInput getPermanentFailoverExecutionsNone() {
        return permanentFailoverExecutionsNone;
    }

    public void setPermanentFailoverExecutionsNone(
            PermanentFailoverExecutionWhereInput permanentFailoverExecutionsNone) {
        this.permanentFailoverExecutionsNone = permanentFailoverExecutionsNone;
    }

    public ExternalCloudTowerWhereInput permanentFailoverExecutionsNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PERMANENT_FAILOVER_EXECUTIONS_NONE);
        return this;
    }

    public ExternalCloudTowerWhereInput permanentFailoverExecutionsNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PERMANENT_FAILOVER_EXECUTIONS_NONE);
        return this;
    }

    public void setPermanentFailoverExecutionsNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PERMANENT_FAILOVER_EXECUTIONS_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PERMANENT_FAILOVER_EXECUTIONS_NONE);
        }
    }

    public boolean getPermanentFailoverExecutionsNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PERMANENT_FAILOVER_EXECUTIONS_NONE);
    }

    public ExternalCloudTowerWhereInput permanentFailoverExecutionsSome(
            PermanentFailoverExecutionWhereInput permanentFailoverExecutionsSome) {

        this.permanentFailoverExecutionsSome = permanentFailoverExecutionsSome;
        return this;
    }

    /**
     * Get permanentFailoverExecutionsSome
     *
     * @return permanentFailoverExecutionsSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public PermanentFailoverExecutionWhereInput getPermanentFailoverExecutionsSome() {
        return permanentFailoverExecutionsSome;
    }

    public void setPermanentFailoverExecutionsSome(
            PermanentFailoverExecutionWhereInput permanentFailoverExecutionsSome) {
        this.permanentFailoverExecutionsSome = permanentFailoverExecutionsSome;
    }

    public ExternalCloudTowerWhereInput permanentFailoverExecutionsSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PERMANENT_FAILOVER_EXECUTIONS_SOME);
        return this;
    }

    public ExternalCloudTowerWhereInput permanentFailoverExecutionsSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PERMANENT_FAILOVER_EXECUTIONS_SOME);
        return this;
    }

    public void setPermanentFailoverExecutionsSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PERMANENT_FAILOVER_EXECUTIONS_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PERMANENT_FAILOVER_EXECUTIONS_SOME);
        }
    }

    public boolean getPermanentFailoverExecutionsSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PERMANENT_FAILOVER_EXECUTIONS_SOME);
    }

    public ExternalCloudTowerWhereInput replicaVmsEvery(ReplicaVmWhereInput replicaVmsEvery) {

        this.replicaVmsEvery = replicaVmsEvery;
        return this;
    }

    /**
     * Get replicaVmsEvery
     *
     * @return replicaVmsEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ReplicaVmWhereInput getReplicaVmsEvery() {
        return replicaVmsEvery;
    }

    public void setReplicaVmsEvery(ReplicaVmWhereInput replicaVmsEvery) {
        this.replicaVmsEvery = replicaVmsEvery;
    }

    public ExternalCloudTowerWhereInput replicaVmsEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICA_VMS_EVERY);
        return this;
    }

    public ExternalCloudTowerWhereInput replicaVmsEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REPLICA_VMS_EVERY);
        return this;
    }

    public void setReplicaVmsEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REPLICA_VMS_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REPLICA_VMS_EVERY);
        }
    }

    public boolean getReplicaVmsEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REPLICA_VMS_EVERY);
    }

    public ExternalCloudTowerWhereInput replicaVmsNone(ReplicaVmWhereInput replicaVmsNone) {

        this.replicaVmsNone = replicaVmsNone;
        return this;
    }

    /**
     * Get replicaVmsNone
     *
     * @return replicaVmsNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ReplicaVmWhereInput getReplicaVmsNone() {
        return replicaVmsNone;
    }

    public void setReplicaVmsNone(ReplicaVmWhereInput replicaVmsNone) {
        this.replicaVmsNone = replicaVmsNone;
    }

    public ExternalCloudTowerWhereInput replicaVmsNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICA_VMS_NONE);
        return this;
    }

    public ExternalCloudTowerWhereInput replicaVmsNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REPLICA_VMS_NONE);
        return this;
    }

    public void setReplicaVmsNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REPLICA_VMS_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REPLICA_VMS_NONE);
        }
    }

    public boolean getReplicaVmsNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REPLICA_VMS_NONE);
    }

    public ExternalCloudTowerWhereInput replicaVmsSome(ReplicaVmWhereInput replicaVmsSome) {

        this.replicaVmsSome = replicaVmsSome;
        return this;
    }

    /**
     * Get replicaVmsSome
     *
     * @return replicaVmsSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ReplicaVmWhereInput getReplicaVmsSome() {
        return replicaVmsSome;
    }

    public void setReplicaVmsSome(ReplicaVmWhereInput replicaVmsSome) {
        this.replicaVmsSome = replicaVmsSome;
    }

    public ExternalCloudTowerWhereInput replicaVmsSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICA_VMS_SOME);
        return this;
    }

    public ExternalCloudTowerWhereInput replicaVmsSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REPLICA_VMS_SOME);
        return this;
    }

    public void setReplicaVmsSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REPLICA_VMS_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REPLICA_VMS_SOME);
        }
    }

    public boolean getReplicaVmsSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REPLICA_VMS_SOME);
    }

    public ExternalCloudTowerWhereInput replicationPlansEvery(
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

    public ExternalCloudTowerWhereInput replicationPlansEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICATION_PLANS_EVERY);
        return this;
    }

    public ExternalCloudTowerWhereInput replicationPlansEvery_ExplictlyNonNull() {
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

    public ExternalCloudTowerWhereInput replicationPlansNone(
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

    public ExternalCloudTowerWhereInput replicationPlansNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICATION_PLANS_NONE);
        return this;
    }

    public ExternalCloudTowerWhereInput replicationPlansNone_ExplictlyNonNull() {
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

    public ExternalCloudTowerWhereInput replicationPlansSome(
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

    public ExternalCloudTowerWhereInput replicationPlansSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REPLICATION_PLANS_SOME);
        return this;
    }

    public ExternalCloudTowerWhereInput replicationPlansSome_ExplictlyNonNull() {
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

    public ExternalCloudTowerWhereInput status(ExternalCloudTowerStatus status) {

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
    public ExternalCloudTowerStatus getStatus() {
        return status;
    }

    public void setStatus(ExternalCloudTowerStatus status) {
        this.status = status;
    }

    public ExternalCloudTowerWhereInput status_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATUS);
        return this;
    }

    public ExternalCloudTowerWhereInput status_ExplictlyNonNull() {
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

    public ExternalCloudTowerWhereInput statusIn(List<ExternalCloudTowerStatus> statusIn) {

        this.statusIn = statusIn;
        return this;
    }

    public ExternalCloudTowerWhereInput addStatusInItem(ExternalCloudTowerStatus statusInItem) {
        if (this.statusIn == null) {
            this.statusIn = new ArrayList<ExternalCloudTowerStatus>();
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
    public List<ExternalCloudTowerStatus> getStatusIn() {
        return statusIn;
    }

    public void setStatusIn(List<ExternalCloudTowerStatus> statusIn) {
        this.statusIn = statusIn;
    }

    public ExternalCloudTowerWhereInput statusIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATUS_IN);
        return this;
    }

    public ExternalCloudTowerWhereInput statusIn_ExplictlyNonNull() {
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

    public ExternalCloudTowerWhereInput statusNot(ExternalCloudTowerStatus statusNot) {

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
    public ExternalCloudTowerStatus getStatusNot() {
        return statusNot;
    }

    public void setStatusNot(ExternalCloudTowerStatus statusNot) {
        this.statusNot = statusNot;
    }

    public ExternalCloudTowerWhereInput statusNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATUS_NOT);
        return this;
    }

    public ExternalCloudTowerWhereInput statusNot_ExplictlyNonNull() {
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

    public ExternalCloudTowerWhereInput statusNotIn(List<ExternalCloudTowerStatus> statusNotIn) {

        this.statusNotIn = statusNotIn;
        return this;
    }

    public ExternalCloudTowerWhereInput addStatusNotInItem(
            ExternalCloudTowerStatus statusNotInItem) {
        if (this.statusNotIn == null) {
            this.statusNotIn = new ArrayList<ExternalCloudTowerStatus>();
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
    public List<ExternalCloudTowerStatus> getStatusNotIn() {
        return statusNotIn;
    }

    public void setStatusNotIn(List<ExternalCloudTowerStatus> statusNotIn) {
        this.statusNotIn = statusNotIn;
    }

    public ExternalCloudTowerWhereInput statusNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATUS_NOT_IN);
        return this;
    }

    public ExternalCloudTowerWhereInput statusNotIn_ExplictlyNonNull() {
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

    public ExternalCloudTowerWhereInput syncReplicationPlansEvery(
            SyncReplicationPlanWhereInput syncReplicationPlansEvery) {

        this.syncReplicationPlansEvery = syncReplicationPlansEvery;
        return this;
    }

    /**
     * Get syncReplicationPlansEvery
     *
     * @return syncReplicationPlansEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public SyncReplicationPlanWhereInput getSyncReplicationPlansEvery() {
        return syncReplicationPlansEvery;
    }

    public void setSyncReplicationPlansEvery(
            SyncReplicationPlanWhereInput syncReplicationPlansEvery) {
        this.syncReplicationPlansEvery = syncReplicationPlansEvery;
    }

    public ExternalCloudTowerWhereInput syncReplicationPlansEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SYNC_REPLICATION_PLANS_EVERY);
        return this;
    }

    public ExternalCloudTowerWhereInput syncReplicationPlansEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SYNC_REPLICATION_PLANS_EVERY);
        return this;
    }

    public void setSyncReplicationPlansEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SYNC_REPLICATION_PLANS_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SYNC_REPLICATION_PLANS_EVERY);
        }
    }

    public boolean getSyncReplicationPlansEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SYNC_REPLICATION_PLANS_EVERY);
    }

    public ExternalCloudTowerWhereInput syncReplicationPlansNone(
            SyncReplicationPlanWhereInput syncReplicationPlansNone) {

        this.syncReplicationPlansNone = syncReplicationPlansNone;
        return this;
    }

    /**
     * Get syncReplicationPlansNone
     *
     * @return syncReplicationPlansNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public SyncReplicationPlanWhereInput getSyncReplicationPlansNone() {
        return syncReplicationPlansNone;
    }

    public void setSyncReplicationPlansNone(
            SyncReplicationPlanWhereInput syncReplicationPlansNone) {
        this.syncReplicationPlansNone = syncReplicationPlansNone;
    }

    public ExternalCloudTowerWhereInput syncReplicationPlansNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SYNC_REPLICATION_PLANS_NONE);
        return this;
    }

    public ExternalCloudTowerWhereInput syncReplicationPlansNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SYNC_REPLICATION_PLANS_NONE);
        return this;
    }

    public void setSyncReplicationPlansNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SYNC_REPLICATION_PLANS_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SYNC_REPLICATION_PLANS_NONE);
        }
    }

    public boolean getSyncReplicationPlansNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SYNC_REPLICATION_PLANS_NONE);
    }

    public ExternalCloudTowerWhereInput syncReplicationPlansSome(
            SyncReplicationPlanWhereInput syncReplicationPlansSome) {

        this.syncReplicationPlansSome = syncReplicationPlansSome;
        return this;
    }

    /**
     * Get syncReplicationPlansSome
     *
     * @return syncReplicationPlansSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public SyncReplicationPlanWhereInput getSyncReplicationPlansSome() {
        return syncReplicationPlansSome;
    }

    public void setSyncReplicationPlansSome(
            SyncReplicationPlanWhereInput syncReplicationPlansSome) {
        this.syncReplicationPlansSome = syncReplicationPlansSome;
    }

    public ExternalCloudTowerWhereInput syncReplicationPlansSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SYNC_REPLICATION_PLANS_SOME);
        return this;
    }

    public ExternalCloudTowerWhereInput syncReplicationPlansSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SYNC_REPLICATION_PLANS_SOME);
        return this;
    }

    public void setSyncReplicationPlansSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SYNC_REPLICATION_PLANS_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SYNC_REPLICATION_PLANS_SOME);
        }
    }

    public boolean getSyncReplicationPlansSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SYNC_REPLICATION_PLANS_SOME);
    }

    public ExternalCloudTowerWhereInput updatedAt(String updatedAt) {

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

    public ExternalCloudTowerWhereInput updatedAt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPDATED_AT);
        return this;
    }

    public ExternalCloudTowerWhereInput updatedAt_ExplictlyNonNull() {
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

    public ExternalCloudTowerWhereInput updatedAtGt(String updatedAtGt) {

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

    public ExternalCloudTowerWhereInput updatedAtGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPDATED_AT_GT);
        return this;
    }

    public ExternalCloudTowerWhereInput updatedAtGt_ExplictlyNonNull() {
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

    public ExternalCloudTowerWhereInput updatedAtGte(String updatedAtGte) {

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

    public ExternalCloudTowerWhereInput updatedAtGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPDATED_AT_GTE);
        return this;
    }

    public ExternalCloudTowerWhereInput updatedAtGte_ExplictlyNonNull() {
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

    public ExternalCloudTowerWhereInput updatedAtIn(List<String> updatedAtIn) {

        this.updatedAtIn = updatedAtIn;
        return this;
    }

    public ExternalCloudTowerWhereInput addUpdatedAtInItem(String updatedAtInItem) {
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

    public ExternalCloudTowerWhereInput updatedAtIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPDATED_AT_IN);
        return this;
    }

    public ExternalCloudTowerWhereInput updatedAtIn_ExplictlyNonNull() {
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

    public ExternalCloudTowerWhereInput updatedAtLt(String updatedAtLt) {

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

    public ExternalCloudTowerWhereInput updatedAtLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPDATED_AT_LT);
        return this;
    }

    public ExternalCloudTowerWhereInput updatedAtLt_ExplictlyNonNull() {
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

    public ExternalCloudTowerWhereInput updatedAtLte(String updatedAtLte) {

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

    public ExternalCloudTowerWhereInput updatedAtLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPDATED_AT_LTE);
        return this;
    }

    public ExternalCloudTowerWhereInput updatedAtLte_ExplictlyNonNull() {
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

    public ExternalCloudTowerWhereInput updatedAtNot(String updatedAtNot) {

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

    public ExternalCloudTowerWhereInput updatedAtNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPDATED_AT_NOT);
        return this;
    }

    public ExternalCloudTowerWhereInput updatedAtNot_ExplictlyNonNull() {
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

    public ExternalCloudTowerWhereInput updatedAtNotIn(List<String> updatedAtNotIn) {

        this.updatedAtNotIn = updatedAtNotIn;
        return this;
    }

    public ExternalCloudTowerWhereInput addUpdatedAtNotInItem(String updatedAtNotInItem) {
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

    public ExternalCloudTowerWhereInput updatedAtNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_UPDATED_AT_NOT_IN);
        return this;
    }

    public ExternalCloudTowerWhereInput updatedAtNotIn_ExplictlyNonNull() {
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

    public ExternalCloudTowerWhereInput useApiKey(ApiKeyWhereInput useApiKey) {

        this.useApiKey = useApiKey;
        return this;
    }

    /**
     * Get useApiKey
     *
     * @return useApiKey
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ApiKeyWhereInput getUseApiKey() {
        return useApiKey;
    }

    public void setUseApiKey(ApiKeyWhereInput useApiKey) {
        this.useApiKey = useApiKey;
    }

    public ExternalCloudTowerWhereInput useApiKey_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USE_API_KEY);
        return this;
    }

    public ExternalCloudTowerWhereInput useApiKey_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USE_API_KEY);
        return this;
    }

    public void setUseApiKey_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USE_API_KEY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USE_API_KEY);
        }
    }

    public boolean getUseApiKey_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USE_API_KEY);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExternalCloudTowerWhereInput externalCloudTowerWhereInput =
                (ExternalCloudTowerWhereInput) o;
        return Objects.equals(this.AND, externalCloudTowerWhereInput.AND)
                && Objects.equals(this.NOT, externalCloudTowerWhereInput.NOT)
                && Objects.equals(this.OR, externalCloudTowerWhereInput.OR)
                && Objects.equals(this.apiKey, externalCloudTowerWhereInput.apiKey)
                && Objects.equals(this.apiKeyContains, externalCloudTowerWhereInput.apiKeyContains)
                && Objects.equals(this.apiKeyEndsWith, externalCloudTowerWhereInput.apiKeyEndsWith)
                && Objects.equals(this.apiKeyGt, externalCloudTowerWhereInput.apiKeyGt)
                && Objects.equals(this.apiKeyGte, externalCloudTowerWhereInput.apiKeyGte)
                && Objects.equals(this.apiKeyIn, externalCloudTowerWhereInput.apiKeyIn)
                && Objects.equals(this.apiKeyLt, externalCloudTowerWhereInput.apiKeyLt)
                && Objects.equals(this.apiKeyLte, externalCloudTowerWhereInput.apiKeyLte)
                && Objects.equals(this.apiKeyNot, externalCloudTowerWhereInput.apiKeyNot)
                && Objects.equals(
                        this.apiKeyNotContains, externalCloudTowerWhereInput.apiKeyNotContains)
                && Objects.equals(
                        this.apiKeyNotEndsWith, externalCloudTowerWhereInput.apiKeyNotEndsWith)
                && Objects.equals(this.apiKeyNotIn, externalCloudTowerWhereInput.apiKeyNotIn)
                && Objects.equals(
                        this.apiKeyNotStartsWith, externalCloudTowerWhereInput.apiKeyNotStartsWith)
                && Objects.equals(
                        this.apiKeyStartsWith, externalCloudTowerWhereInput.apiKeyStartsWith)
                && Objects.equals(this.createdAt, externalCloudTowerWhereInput.createdAt)
                && Objects.equals(this.createdAtGt, externalCloudTowerWhereInput.createdAtGt)
                && Objects.equals(this.createdAtGte, externalCloudTowerWhereInput.createdAtGte)
                && Objects.equals(this.createdAtIn, externalCloudTowerWhereInput.createdAtIn)
                && Objects.equals(this.createdAtLt, externalCloudTowerWhereInput.createdAtLt)
                && Objects.equals(this.createdAtLte, externalCloudTowerWhereInput.createdAtLte)
                && Objects.equals(this.createdAtNot, externalCloudTowerWhereInput.createdAtNot)
                && Objects.equals(this.createdAtNotIn, externalCloudTowerWhereInput.createdAtNotIn)
                && Objects.equals(this.deployId, externalCloudTowerWhereInput.deployId)
                && Objects.equals(
                        this.deployIdContains, externalCloudTowerWhereInput.deployIdContains)
                && Objects.equals(
                        this.deployIdEndsWith, externalCloudTowerWhereInput.deployIdEndsWith)
                && Objects.equals(this.deployIdGt, externalCloudTowerWhereInput.deployIdGt)
                && Objects.equals(this.deployIdGte, externalCloudTowerWhereInput.deployIdGte)
                && Objects.equals(this.deployIdIn, externalCloudTowerWhereInput.deployIdIn)
                && Objects.equals(this.deployIdLt, externalCloudTowerWhereInput.deployIdLt)
                && Objects.equals(this.deployIdLte, externalCloudTowerWhereInput.deployIdLte)
                && Objects.equals(this.deployIdNot, externalCloudTowerWhereInput.deployIdNot)
                && Objects.equals(
                        this.deployIdNotContains, externalCloudTowerWhereInput.deployIdNotContains)
                && Objects.equals(
                        this.deployIdNotEndsWith, externalCloudTowerWhereInput.deployIdNotEndsWith)
                && Objects.equals(this.deployIdNotIn, externalCloudTowerWhereInput.deployIdNotIn)
                && Objects.equals(
                        this.deployIdNotStartsWith,
                        externalCloudTowerWhereInput.deployIdNotStartsWith)
                && Objects.equals(
                        this.deployIdStartsWith, externalCloudTowerWhereInput.deployIdStartsWith)
                && Objects.equals(this.description, externalCloudTowerWhereInput.description)
                && Objects.equals(
                        this.descriptionContains, externalCloudTowerWhereInput.descriptionContains)
                && Objects.equals(
                        this.descriptionEndsWith, externalCloudTowerWhereInput.descriptionEndsWith)
                && Objects.equals(this.descriptionGt, externalCloudTowerWhereInput.descriptionGt)
                && Objects.equals(this.descriptionGte, externalCloudTowerWhereInput.descriptionGte)
                && Objects.equals(this.descriptionIn, externalCloudTowerWhereInput.descriptionIn)
                && Objects.equals(this.descriptionLt, externalCloudTowerWhereInput.descriptionLt)
                && Objects.equals(this.descriptionLte, externalCloudTowerWhereInput.descriptionLte)
                && Objects.equals(this.descriptionNot, externalCloudTowerWhereInput.descriptionNot)
                && Objects.equals(
                        this.descriptionNotContains,
                        externalCloudTowerWhereInput.descriptionNotContains)
                && Objects.equals(
                        this.descriptionNotEndsWith,
                        externalCloudTowerWhereInput.descriptionNotEndsWith)
                && Objects.equals(
                        this.descriptionNotIn, externalCloudTowerWhereInput.descriptionNotIn)
                && Objects.equals(
                        this.descriptionNotStartsWith,
                        externalCloudTowerWhereInput.descriptionNotStartsWith)
                && Objects.equals(
                        this.descriptionStartsWith,
                        externalCloudTowerWhereInput.descriptionStartsWith)
                && Objects.equals(this.endpoint, externalCloudTowerWhereInput.endpoint)
                && Objects.equals(
                        this.endpointContains, externalCloudTowerWhereInput.endpointContains)
                && Objects.equals(
                        this.endpointEndsWith, externalCloudTowerWhereInput.endpointEndsWith)
                && Objects.equals(this.endpointGt, externalCloudTowerWhereInput.endpointGt)
                && Objects.equals(this.endpointGte, externalCloudTowerWhereInput.endpointGte)
                && Objects.equals(this.endpointIn, externalCloudTowerWhereInput.endpointIn)
                && Objects.equals(this.endpointLt, externalCloudTowerWhereInput.endpointLt)
                && Objects.equals(this.endpointLte, externalCloudTowerWhereInput.endpointLte)
                && Objects.equals(this.endpointNot, externalCloudTowerWhereInput.endpointNot)
                && Objects.equals(
                        this.endpointNotContains, externalCloudTowerWhereInput.endpointNotContains)
                && Objects.equals(
                        this.endpointNotEndsWith, externalCloudTowerWhereInput.endpointNotEndsWith)
                && Objects.equals(this.endpointNotIn, externalCloudTowerWhereInput.endpointNotIn)
                && Objects.equals(
                        this.endpointNotStartsWith,
                        externalCloudTowerWhereInput.endpointNotStartsWith)
                && Objects.equals(
                        this.endpointStartsWith, externalCloudTowerWhereInput.endpointStartsWith)
                && Objects.equals(
                        this.entityAsyncStatus, externalCloudTowerWhereInput.entityAsyncStatus)
                && Objects.equals(
                        this.entityAsyncStatusIn, externalCloudTowerWhereInput.entityAsyncStatusIn)
                && Objects.equals(
                        this.entityAsyncStatusNot,
                        externalCloudTowerWhereInput.entityAsyncStatusNot)
                && Objects.equals(
                        this.entityAsyncStatusNotIn,
                        externalCloudTowerWhereInput.entityAsyncStatusNotIn)
                && Objects.equals(
                        this.failbackExecutionsEvery,
                        externalCloudTowerWhereInput.failbackExecutionsEvery)
                && Objects.equals(
                        this.failbackExecutionsNone,
                        externalCloudTowerWhereInput.failbackExecutionsNone)
                && Objects.equals(
                        this.failbackExecutionsSome,
                        externalCloudTowerWhereInput.failbackExecutionsSome)
                && Objects.equals(
                        this.failoverExecutionsEvery,
                        externalCloudTowerWhereInput.failoverExecutionsEvery)
                && Objects.equals(
                        this.failoverExecutionsNone,
                        externalCloudTowerWhereInput.failoverExecutionsNone)
                && Objects.equals(
                        this.failoverExecutionsSome,
                        externalCloudTowerWhereInput.failoverExecutionsSome)
                && Objects.equals(this.id, externalCloudTowerWhereInput.id)
                && Objects.equals(this.idContains, externalCloudTowerWhereInput.idContains)
                && Objects.equals(this.idEndsWith, externalCloudTowerWhereInput.idEndsWith)
                && Objects.equals(this.idGt, externalCloudTowerWhereInput.idGt)
                && Objects.equals(this.idGte, externalCloudTowerWhereInput.idGte)
                && Objects.equals(this.idIn, externalCloudTowerWhereInput.idIn)
                && Objects.equals(this.idLt, externalCloudTowerWhereInput.idLt)
                && Objects.equals(this.idLte, externalCloudTowerWhereInput.idLte)
                && Objects.equals(this.idNot, externalCloudTowerWhereInput.idNot)
                && Objects.equals(this.idNotContains, externalCloudTowerWhereInput.idNotContains)
                && Objects.equals(this.idNotEndsWith, externalCloudTowerWhereInput.idNotEndsWith)
                && Objects.equals(this.idNotIn, externalCloudTowerWhereInput.idNotIn)
                && Objects.equals(
                        this.idNotStartsWith, externalCloudTowerWhereInput.idNotStartsWith)
                && Objects.equals(this.idStartsWith, externalCloudTowerWhereInput.idStartsWith)
                && Objects.equals(this.name, externalCloudTowerWhereInput.name)
                && Objects.equals(this.nameContains, externalCloudTowerWhereInput.nameContains)
                && Objects.equals(this.nameEndsWith, externalCloudTowerWhereInput.nameEndsWith)
                && Objects.equals(this.nameGt, externalCloudTowerWhereInput.nameGt)
                && Objects.equals(this.nameGte, externalCloudTowerWhereInput.nameGte)
                && Objects.equals(this.nameIn, externalCloudTowerWhereInput.nameIn)
                && Objects.equals(this.nameLt, externalCloudTowerWhereInput.nameLt)
                && Objects.equals(this.nameLte, externalCloudTowerWhereInput.nameLte)
                && Objects.equals(this.nameNot, externalCloudTowerWhereInput.nameNot)
                && Objects.equals(
                        this.nameNotContains, externalCloudTowerWhereInput.nameNotContains)
                && Objects.equals(
                        this.nameNotEndsWith, externalCloudTowerWhereInput.nameNotEndsWith)
                && Objects.equals(this.nameNotIn, externalCloudTowerWhereInput.nameNotIn)
                && Objects.equals(
                        this.nameNotStartsWith, externalCloudTowerWhereInput.nameNotStartsWith)
                && Objects.equals(this.nameStartsWith, externalCloudTowerWhereInput.nameStartsWith)
                && Objects.equals(
                        this.permanentFailoverExecutionsEvery,
                        externalCloudTowerWhereInput.permanentFailoverExecutionsEvery)
                && Objects.equals(
                        this.permanentFailoverExecutionsNone,
                        externalCloudTowerWhereInput.permanentFailoverExecutionsNone)
                && Objects.equals(
                        this.permanentFailoverExecutionsSome,
                        externalCloudTowerWhereInput.permanentFailoverExecutionsSome)
                && Objects.equals(
                        this.replicaVmsEvery, externalCloudTowerWhereInput.replicaVmsEvery)
                && Objects.equals(this.replicaVmsNone, externalCloudTowerWhereInput.replicaVmsNone)
                && Objects.equals(this.replicaVmsSome, externalCloudTowerWhereInput.replicaVmsSome)
                && Objects.equals(
                        this.replicationPlansEvery,
                        externalCloudTowerWhereInput.replicationPlansEvery)
                && Objects.equals(
                        this.replicationPlansNone,
                        externalCloudTowerWhereInput.replicationPlansNone)
                && Objects.equals(
                        this.replicationPlansSome,
                        externalCloudTowerWhereInput.replicationPlansSome)
                && Objects.equals(this.status, externalCloudTowerWhereInput.status)
                && Objects.equals(this.statusIn, externalCloudTowerWhereInput.statusIn)
                && Objects.equals(this.statusNot, externalCloudTowerWhereInput.statusNot)
                && Objects.equals(this.statusNotIn, externalCloudTowerWhereInput.statusNotIn)
                && Objects.equals(
                        this.syncReplicationPlansEvery,
                        externalCloudTowerWhereInput.syncReplicationPlansEvery)
                && Objects.equals(
                        this.syncReplicationPlansNone,
                        externalCloudTowerWhereInput.syncReplicationPlansNone)
                && Objects.equals(
                        this.syncReplicationPlansSome,
                        externalCloudTowerWhereInput.syncReplicationPlansSome)
                && Objects.equals(this.updatedAt, externalCloudTowerWhereInput.updatedAt)
                && Objects.equals(this.updatedAtGt, externalCloudTowerWhereInput.updatedAtGt)
                && Objects.equals(this.updatedAtGte, externalCloudTowerWhereInput.updatedAtGte)
                && Objects.equals(this.updatedAtIn, externalCloudTowerWhereInput.updatedAtIn)
                && Objects.equals(this.updatedAtLt, externalCloudTowerWhereInput.updatedAtLt)
                && Objects.equals(this.updatedAtLte, externalCloudTowerWhereInput.updatedAtLte)
                && Objects.equals(this.updatedAtNot, externalCloudTowerWhereInput.updatedAtNot)
                && Objects.equals(this.updatedAtNotIn, externalCloudTowerWhereInput.updatedAtNotIn)
                && Objects.equals(this.useApiKey, externalCloudTowerWhereInput.useApiKey);
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
                apiKey,
                apiKeyContains,
                apiKeyEndsWith,
                apiKeyGt,
                apiKeyGte,
                apiKeyIn,
                apiKeyLt,
                apiKeyLte,
                apiKeyNot,
                apiKeyNotContains,
                apiKeyNotEndsWith,
                apiKeyNotIn,
                apiKeyNotStartsWith,
                apiKeyStartsWith,
                createdAt,
                createdAtGt,
                createdAtGte,
                createdAtIn,
                createdAtLt,
                createdAtLte,
                createdAtNot,
                createdAtNotIn,
                deployId,
                deployIdContains,
                deployIdEndsWith,
                deployIdGt,
                deployIdGte,
                deployIdIn,
                deployIdLt,
                deployIdLte,
                deployIdNot,
                deployIdNotContains,
                deployIdNotEndsWith,
                deployIdNotIn,
                deployIdNotStartsWith,
                deployIdStartsWith,
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
                endpoint,
                endpointContains,
                endpointEndsWith,
                endpointGt,
                endpointGte,
                endpointIn,
                endpointLt,
                endpointLte,
                endpointNot,
                endpointNotContains,
                endpointNotEndsWith,
                endpointNotIn,
                endpointNotStartsWith,
                endpointStartsWith,
                entityAsyncStatus,
                entityAsyncStatusIn,
                entityAsyncStatusNot,
                entityAsyncStatusNotIn,
                failbackExecutionsEvery,
                failbackExecutionsNone,
                failbackExecutionsSome,
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
                permanentFailoverExecutionsEvery,
                permanentFailoverExecutionsNone,
                permanentFailoverExecutionsSome,
                replicaVmsEvery,
                replicaVmsNone,
                replicaVmsSome,
                replicationPlansEvery,
                replicationPlansNone,
                replicationPlansSome,
                status,
                statusIn,
                statusNot,
                statusNotIn,
                syncReplicationPlansEvery,
                syncReplicationPlansNone,
                syncReplicationPlansSome,
                updatedAt,
                updatedAtGt,
                updatedAtGte,
                updatedAtIn,
                updatedAtLt,
                updatedAtLte,
                updatedAtNot,
                updatedAtNotIn,
                useApiKey);
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
        sb.append("class ExternalCloudTowerWhereInput {\n");
        sb.append("    AND: ").append(toIndentedString(AND)).append("\n");
        sb.append("    NOT: ").append(toIndentedString(NOT)).append("\n");
        sb.append("    OR: ").append(toIndentedString(OR)).append("\n");
        sb.append("    apiKey: ").append(toIndentedString(apiKey)).append("\n");
        sb.append("    apiKeyContains: ").append(toIndentedString(apiKeyContains)).append("\n");
        sb.append("    apiKeyEndsWith: ").append(toIndentedString(apiKeyEndsWith)).append("\n");
        sb.append("    apiKeyGt: ").append(toIndentedString(apiKeyGt)).append("\n");
        sb.append("    apiKeyGte: ").append(toIndentedString(apiKeyGte)).append("\n");
        sb.append("    apiKeyIn: ").append(toIndentedString(apiKeyIn)).append("\n");
        sb.append("    apiKeyLt: ").append(toIndentedString(apiKeyLt)).append("\n");
        sb.append("    apiKeyLte: ").append(toIndentedString(apiKeyLte)).append("\n");
        sb.append("    apiKeyNot: ").append(toIndentedString(apiKeyNot)).append("\n");
        sb.append("    apiKeyNotContains: ")
                .append(toIndentedString(apiKeyNotContains))
                .append("\n");
        sb.append("    apiKeyNotEndsWith: ")
                .append(toIndentedString(apiKeyNotEndsWith))
                .append("\n");
        sb.append("    apiKeyNotIn: ").append(toIndentedString(apiKeyNotIn)).append("\n");
        sb.append("    apiKeyNotStartsWith: ")
                .append(toIndentedString(apiKeyNotStartsWith))
                .append("\n");
        sb.append("    apiKeyStartsWith: ").append(toIndentedString(apiKeyStartsWith)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    createdAtGt: ").append(toIndentedString(createdAtGt)).append("\n");
        sb.append("    createdAtGte: ").append(toIndentedString(createdAtGte)).append("\n");
        sb.append("    createdAtIn: ").append(toIndentedString(createdAtIn)).append("\n");
        sb.append("    createdAtLt: ").append(toIndentedString(createdAtLt)).append("\n");
        sb.append("    createdAtLte: ").append(toIndentedString(createdAtLte)).append("\n");
        sb.append("    createdAtNot: ").append(toIndentedString(createdAtNot)).append("\n");
        sb.append("    createdAtNotIn: ").append(toIndentedString(createdAtNotIn)).append("\n");
        sb.append("    deployId: ").append(toIndentedString(deployId)).append("\n");
        sb.append("    deployIdContains: ").append(toIndentedString(deployIdContains)).append("\n");
        sb.append("    deployIdEndsWith: ").append(toIndentedString(deployIdEndsWith)).append("\n");
        sb.append("    deployIdGt: ").append(toIndentedString(deployIdGt)).append("\n");
        sb.append("    deployIdGte: ").append(toIndentedString(deployIdGte)).append("\n");
        sb.append("    deployIdIn: ").append(toIndentedString(deployIdIn)).append("\n");
        sb.append("    deployIdLt: ").append(toIndentedString(deployIdLt)).append("\n");
        sb.append("    deployIdLte: ").append(toIndentedString(deployIdLte)).append("\n");
        sb.append("    deployIdNot: ").append(toIndentedString(deployIdNot)).append("\n");
        sb.append("    deployIdNotContains: ")
                .append(toIndentedString(deployIdNotContains))
                .append("\n");
        sb.append("    deployIdNotEndsWith: ")
                .append(toIndentedString(deployIdNotEndsWith))
                .append("\n");
        sb.append("    deployIdNotIn: ").append(toIndentedString(deployIdNotIn)).append("\n");
        sb.append("    deployIdNotStartsWith: ")
                .append(toIndentedString(deployIdNotStartsWith))
                .append("\n");
        sb.append("    deployIdStartsWith: ")
                .append(toIndentedString(deployIdStartsWith))
                .append("\n");
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
        sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
        sb.append("    endpointContains: ").append(toIndentedString(endpointContains)).append("\n");
        sb.append("    endpointEndsWith: ").append(toIndentedString(endpointEndsWith)).append("\n");
        sb.append("    endpointGt: ").append(toIndentedString(endpointGt)).append("\n");
        sb.append("    endpointGte: ").append(toIndentedString(endpointGte)).append("\n");
        sb.append("    endpointIn: ").append(toIndentedString(endpointIn)).append("\n");
        sb.append("    endpointLt: ").append(toIndentedString(endpointLt)).append("\n");
        sb.append("    endpointLte: ").append(toIndentedString(endpointLte)).append("\n");
        sb.append("    endpointNot: ").append(toIndentedString(endpointNot)).append("\n");
        sb.append("    endpointNotContains: ")
                .append(toIndentedString(endpointNotContains))
                .append("\n");
        sb.append("    endpointNotEndsWith: ")
                .append(toIndentedString(endpointNotEndsWith))
                .append("\n");
        sb.append("    endpointNotIn: ").append(toIndentedString(endpointNotIn)).append("\n");
        sb.append("    endpointNotStartsWith: ")
                .append(toIndentedString(endpointNotStartsWith))
                .append("\n");
        sb.append("    endpointStartsWith: ")
                .append(toIndentedString(endpointStartsWith))
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
        sb.append("    failbackExecutionsEvery: ")
                .append(toIndentedString(failbackExecutionsEvery))
                .append("\n");
        sb.append("    failbackExecutionsNone: ")
                .append(toIndentedString(failbackExecutionsNone))
                .append("\n");
        sb.append("    failbackExecutionsSome: ")
                .append(toIndentedString(failbackExecutionsSome))
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
        sb.append("    permanentFailoverExecutionsEvery: ")
                .append(toIndentedString(permanentFailoverExecutionsEvery))
                .append("\n");
        sb.append("    permanentFailoverExecutionsNone: ")
                .append(toIndentedString(permanentFailoverExecutionsNone))
                .append("\n");
        sb.append("    permanentFailoverExecutionsSome: ")
                .append(toIndentedString(permanentFailoverExecutionsSome))
                .append("\n");
        sb.append("    replicaVmsEvery: ").append(toIndentedString(replicaVmsEvery)).append("\n");
        sb.append("    replicaVmsNone: ").append(toIndentedString(replicaVmsNone)).append("\n");
        sb.append("    replicaVmsSome: ").append(toIndentedString(replicaVmsSome)).append("\n");
        sb.append("    replicationPlansEvery: ")
                .append(toIndentedString(replicationPlansEvery))
                .append("\n");
        sb.append("    replicationPlansNone: ")
                .append(toIndentedString(replicationPlansNone))
                .append("\n");
        sb.append("    replicationPlansSome: ")
                .append(toIndentedString(replicationPlansSome))
                .append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    statusIn: ").append(toIndentedString(statusIn)).append("\n");
        sb.append("    statusNot: ").append(toIndentedString(statusNot)).append("\n");
        sb.append("    statusNotIn: ").append(toIndentedString(statusNotIn)).append("\n");
        sb.append("    syncReplicationPlansEvery: ")
                .append(toIndentedString(syncReplicationPlansEvery))
                .append("\n");
        sb.append("    syncReplicationPlansNone: ")
                .append(toIndentedString(syncReplicationPlansNone))
                .append("\n");
        sb.append("    syncReplicationPlansSome: ")
                .append(toIndentedString(syncReplicationPlansSome))
                .append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    updatedAtGt: ").append(toIndentedString(updatedAtGt)).append("\n");
        sb.append("    updatedAtGte: ").append(toIndentedString(updatedAtGte)).append("\n");
        sb.append("    updatedAtIn: ").append(toIndentedString(updatedAtIn)).append("\n");
        sb.append("    updatedAtLt: ").append(toIndentedString(updatedAtLt)).append("\n");
        sb.append("    updatedAtLte: ").append(toIndentedString(updatedAtLte)).append("\n");
        sb.append("    updatedAtNot: ").append(toIndentedString(updatedAtNot)).append("\n");
        sb.append("    updatedAtNotIn: ").append(toIndentedString(updatedAtNotIn)).append("\n");
        sb.append("    useApiKey: ").append(toIndentedString(useApiKey)).append("\n");
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

package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** DatastoreWhereInput */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class DatastoreWhereInput
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_A_N_D = "AND";

    @SerializedName(SERIALIZED_NAME_A_N_D)
    private List<DatastoreWhereInput> AND = null;

    public static final String SERIALIZED_NAME_N_O_T = "NOT";

    @SerializedName(SERIALIZED_NAME_N_O_T)
    private List<DatastoreWhereInput> NOT = null;

    public static final String SERIALIZED_NAME_O_R = "OR";

    @SerializedName(SERIALIZED_NAME_O_R)
    private List<DatastoreWhereInput> OR = null;

    public static final String SERIALIZED_NAME_CAPACITY_BYTES = "capacity_bytes";

    @SerializedName(SERIALIZED_NAME_CAPACITY_BYTES)
    private Double capacityBytes;

    public static final String SERIALIZED_NAME_CAPACITY_BYTES_GT = "capacity_bytes_gt";

    @SerializedName(SERIALIZED_NAME_CAPACITY_BYTES_GT)
    private Double capacityBytesGt;

    public static final String SERIALIZED_NAME_CAPACITY_BYTES_GTE = "capacity_bytes_gte";

    @SerializedName(SERIALIZED_NAME_CAPACITY_BYTES_GTE)
    private Double capacityBytesGte;

    public static final String SERIALIZED_NAME_CAPACITY_BYTES_IN = "capacity_bytes_in";

    @SerializedName(SERIALIZED_NAME_CAPACITY_BYTES_IN)
    private List<Double> capacityBytesIn = null;

    public static final String SERIALIZED_NAME_CAPACITY_BYTES_LT = "capacity_bytes_lt";

    @SerializedName(SERIALIZED_NAME_CAPACITY_BYTES_LT)
    private Double capacityBytesLt;

    public static final String SERIALIZED_NAME_CAPACITY_BYTES_LTE = "capacity_bytes_lte";

    @SerializedName(SERIALIZED_NAME_CAPACITY_BYTES_LTE)
    private Double capacityBytesLte;

    public static final String SERIALIZED_NAME_CAPACITY_BYTES_NOT = "capacity_bytes_not";

    @SerializedName(SERIALIZED_NAME_CAPACITY_BYTES_NOT)
    private Double capacityBytesNot;

    public static final String SERIALIZED_NAME_CAPACITY_BYTES_NOT_IN = "capacity_bytes_not_in";

    @SerializedName(SERIALIZED_NAME_CAPACITY_BYTES_NOT_IN)
    private List<Double> capacityBytesNotIn = null;

    public static final String SERIALIZED_NAME_CREATED_TIME = "created_time";

    @SerializedName(SERIALIZED_NAME_CREATED_TIME)
    private String createdTime;

    public static final String SERIALIZED_NAME_CREATED_TIME_GT = "created_time_gt";

    @SerializedName(SERIALIZED_NAME_CREATED_TIME_GT)
    private String createdTimeGt;

    public static final String SERIALIZED_NAME_CREATED_TIME_GTE = "created_time_gte";

    @SerializedName(SERIALIZED_NAME_CREATED_TIME_GTE)
    private String createdTimeGte;

    public static final String SERIALIZED_NAME_CREATED_TIME_IN = "created_time_in";

    @SerializedName(SERIALIZED_NAME_CREATED_TIME_IN)
    private List<String> createdTimeIn = null;

    public static final String SERIALIZED_NAME_CREATED_TIME_LT = "created_time_lt";

    @SerializedName(SERIALIZED_NAME_CREATED_TIME_LT)
    private String createdTimeLt;

    public static final String SERIALIZED_NAME_CREATED_TIME_LTE = "created_time_lte";

    @SerializedName(SERIALIZED_NAME_CREATED_TIME_LTE)
    private String createdTimeLte;

    public static final String SERIALIZED_NAME_CREATED_TIME_NOT = "created_time_not";

    @SerializedName(SERIALIZED_NAME_CREATED_TIME_NOT)
    private String createdTimeNot;

    public static final String SERIALIZED_NAME_CREATED_TIME_NOT_IN = "created_time_not_in";

    @SerializedName(SERIALIZED_NAME_CREATED_TIME_NOT_IN)
    private List<String> createdTimeNotIn = null;

    public static final String SERIALIZED_NAME_DATA_VERSION = "data_version";

    @SerializedName(SERIALIZED_NAME_DATA_VERSION)
    private Integer dataVersion;

    public static final String SERIALIZED_NAME_DATA_VERSION_GT = "data_version_gt";

    @SerializedName(SERIALIZED_NAME_DATA_VERSION_GT)
    private Integer dataVersionGt;

    public static final String SERIALIZED_NAME_DATA_VERSION_GTE = "data_version_gte";

    @SerializedName(SERIALIZED_NAME_DATA_VERSION_GTE)
    private Integer dataVersionGte;

    public static final String SERIALIZED_NAME_DATA_VERSION_IN = "data_version_in";

    @SerializedName(SERIALIZED_NAME_DATA_VERSION_IN)
    private List<Integer> dataVersionIn = null;

    public static final String SERIALIZED_NAME_DATA_VERSION_LT = "data_version_lt";

    @SerializedName(SERIALIZED_NAME_DATA_VERSION_LT)
    private Integer dataVersionLt;

    public static final String SERIALIZED_NAME_DATA_VERSION_LTE = "data_version_lte";

    @SerializedName(SERIALIZED_NAME_DATA_VERSION_LTE)
    private Integer dataVersionLte;

    public static final String SERIALIZED_NAME_DATA_VERSION_NOT = "data_version_not";

    @SerializedName(SERIALIZED_NAME_DATA_VERSION_NOT)
    private Integer dataVersionNot;

    public static final String SERIALIZED_NAME_DATA_VERSION_NOT_IN = "data_version_not_in";

    @SerializedName(SERIALIZED_NAME_DATA_VERSION_NOT_IN)
    private List<Integer> dataVersionNotIn = null;

    public static final String SERIALIZED_NAME_DATASTORE_CAPACITY_BYTES =
            "datastore_capacity_bytes";

    @SerializedName(SERIALIZED_NAME_DATASTORE_CAPACITY_BYTES)
    private Long datastoreCapacityBytes;

    public static final String SERIALIZED_NAME_DATASTORE_CAPACITY_BYTES_GT =
            "datastore_capacity_bytes_gt";

    @SerializedName(SERIALIZED_NAME_DATASTORE_CAPACITY_BYTES_GT)
    private Long datastoreCapacityBytesGt;

    public static final String SERIALIZED_NAME_DATASTORE_CAPACITY_BYTES_GTE =
            "datastore_capacity_bytes_gte";

    @SerializedName(SERIALIZED_NAME_DATASTORE_CAPACITY_BYTES_GTE)
    private Long datastoreCapacityBytesGte;

    public static final String SERIALIZED_NAME_DATASTORE_CAPACITY_BYTES_IN =
            "datastore_capacity_bytes_in";

    @SerializedName(SERIALIZED_NAME_DATASTORE_CAPACITY_BYTES_IN)
    private List<Long> datastoreCapacityBytesIn = null;

    public static final String SERIALIZED_NAME_DATASTORE_CAPACITY_BYTES_LT =
            "datastore_capacity_bytes_lt";

    @SerializedName(SERIALIZED_NAME_DATASTORE_CAPACITY_BYTES_LT)
    private Long datastoreCapacityBytesLt;

    public static final String SERIALIZED_NAME_DATASTORE_CAPACITY_BYTES_LTE =
            "datastore_capacity_bytes_lte";

    @SerializedName(SERIALIZED_NAME_DATASTORE_CAPACITY_BYTES_LTE)
    private Long datastoreCapacityBytesLte;

    public static final String SERIALIZED_NAME_DATASTORE_CAPACITY_BYTES_NOT =
            "datastore_capacity_bytes_not";

    @SerializedName(SERIALIZED_NAME_DATASTORE_CAPACITY_BYTES_NOT)
    private Long datastoreCapacityBytesNot;

    public static final String SERIALIZED_NAME_DATASTORE_CAPACITY_BYTES_NOT_IN =
            "datastore_capacity_bytes_not_in";

    @SerializedName(SERIALIZED_NAME_DATASTORE_CAPACITY_BYTES_NOT_IN)
    private List<Long> datastoreCapacityBytesNotIn = null;

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

    public static final String SERIALIZED_NAME_FREE_BYTES = "free_bytes";

    @SerializedName(SERIALIZED_NAME_FREE_BYTES)
    private Long freeBytes;

    public static final String SERIALIZED_NAME_FREE_BYTES_GT = "free_bytes_gt";

    @SerializedName(SERIALIZED_NAME_FREE_BYTES_GT)
    private Long freeBytesGt;

    public static final String SERIALIZED_NAME_FREE_BYTES_GTE = "free_bytes_gte";

    @SerializedName(SERIALIZED_NAME_FREE_BYTES_GTE)
    private Long freeBytesGte;

    public static final String SERIALIZED_NAME_FREE_BYTES_IN = "free_bytes_in";

    @SerializedName(SERIALIZED_NAME_FREE_BYTES_IN)
    private List<Long> freeBytesIn = null;

    public static final String SERIALIZED_NAME_FREE_BYTES_LT = "free_bytes_lt";

    @SerializedName(SERIALIZED_NAME_FREE_BYTES_LT)
    private Long freeBytesLt;

    public static final String SERIALIZED_NAME_FREE_BYTES_LTE = "free_bytes_lte";

    @SerializedName(SERIALIZED_NAME_FREE_BYTES_LTE)
    private Long freeBytesLte;

    public static final String SERIALIZED_NAME_FREE_BYTES_NOT = "free_bytes_not";

    @SerializedName(SERIALIZED_NAME_FREE_BYTES_NOT)
    private Long freeBytesNot;

    public static final String SERIALIZED_NAME_FREE_BYTES_NOT_IN = "free_bytes_not_in";

    @SerializedName(SERIALIZED_NAME_FREE_BYTES_NOT_IN)
    private List<Long> freeBytesNotIn = null;

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

    public static final String SERIALIZED_NAME_LABELS_EVERY = "labels_every";

    @SerializedName(SERIALIZED_NAME_LABELS_EVERY)
    private LabelWhereInput labelsEvery;

    public static final String SERIALIZED_NAME_LABELS_NONE = "labels_none";

    @SerializedName(SERIALIZED_NAME_LABELS_NONE)
    private LabelWhereInput labelsNone;

    public static final String SERIALIZED_NAME_LABELS_SOME = "labels_some";

    @SerializedName(SERIALIZED_NAME_LABELS_SOME)
    private LabelWhereInput labelsSome;

    public static final String SERIALIZED_NAME_LOCAL_HASH = "local_hash";

    @SerializedName(SERIALIZED_NAME_LOCAL_HASH)
    private String localHash;

    public static final String SERIALIZED_NAME_LOCAL_HASH_CONTAINS = "local_hash_contains";

    @SerializedName(SERIALIZED_NAME_LOCAL_HASH_CONTAINS)
    private String localHashContains;

    public static final String SERIALIZED_NAME_LOCAL_HASH_ENDS_WITH = "local_hash_ends_with";

    @SerializedName(SERIALIZED_NAME_LOCAL_HASH_ENDS_WITH)
    private String localHashEndsWith;

    public static final String SERIALIZED_NAME_LOCAL_HASH_GT = "local_hash_gt";

    @SerializedName(SERIALIZED_NAME_LOCAL_HASH_GT)
    private String localHashGt;

    public static final String SERIALIZED_NAME_LOCAL_HASH_GTE = "local_hash_gte";

    @SerializedName(SERIALIZED_NAME_LOCAL_HASH_GTE)
    private String localHashGte;

    public static final String SERIALIZED_NAME_LOCAL_HASH_IN = "local_hash_in";

    @SerializedName(SERIALIZED_NAME_LOCAL_HASH_IN)
    private List<String> localHashIn = null;

    public static final String SERIALIZED_NAME_LOCAL_HASH_LT = "local_hash_lt";

    @SerializedName(SERIALIZED_NAME_LOCAL_HASH_LT)
    private String localHashLt;

    public static final String SERIALIZED_NAME_LOCAL_HASH_LTE = "local_hash_lte";

    @SerializedName(SERIALIZED_NAME_LOCAL_HASH_LTE)
    private String localHashLte;

    public static final String SERIALIZED_NAME_LOCAL_HASH_NOT = "local_hash_not";

    @SerializedName(SERIALIZED_NAME_LOCAL_HASH_NOT)
    private String localHashNot;

    public static final String SERIALIZED_NAME_LOCAL_HASH_NOT_CONTAINS = "local_hash_not_contains";

    @SerializedName(SERIALIZED_NAME_LOCAL_HASH_NOT_CONTAINS)
    private String localHashNotContains;

    public static final String SERIALIZED_NAME_LOCAL_HASH_NOT_ENDS_WITH =
            "local_hash_not_ends_with";

    @SerializedName(SERIALIZED_NAME_LOCAL_HASH_NOT_ENDS_WITH)
    private String localHashNotEndsWith;

    public static final String SERIALIZED_NAME_LOCAL_HASH_NOT_IN = "local_hash_not_in";

    @SerializedName(SERIALIZED_NAME_LOCAL_HASH_NOT_IN)
    private List<String> localHashNotIn = null;

    public static final String SERIALIZED_NAME_LOCAL_HASH_NOT_STARTS_WITH =
            "local_hash_not_starts_with";

    @SerializedName(SERIALIZED_NAME_LOCAL_HASH_NOT_STARTS_WITH)
    private String localHashNotStartsWith;

    public static final String SERIALIZED_NAME_LOCAL_HASH_STARTS_WITH = "local_hash_starts_with";

    @SerializedName(SERIALIZED_NAME_LOCAL_HASH_STARTS_WITH)
    private String localHashStartsWith;

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

    public static final String SERIALIZED_NAME_MODIFIED_TIME = "modified_time";

    @SerializedName(SERIALIZED_NAME_MODIFIED_TIME)
    private String modifiedTime;

    public static final String SERIALIZED_NAME_MODIFIED_TIME_GT = "modified_time_gt";

    @SerializedName(SERIALIZED_NAME_MODIFIED_TIME_GT)
    private String modifiedTimeGt;

    public static final String SERIALIZED_NAME_MODIFIED_TIME_GTE = "modified_time_gte";

    @SerializedName(SERIALIZED_NAME_MODIFIED_TIME_GTE)
    private String modifiedTimeGte;

    public static final String SERIALIZED_NAME_MODIFIED_TIME_IN = "modified_time_in";

    @SerializedName(SERIALIZED_NAME_MODIFIED_TIME_IN)
    private List<String> modifiedTimeIn = null;

    public static final String SERIALIZED_NAME_MODIFIED_TIME_LT = "modified_time_lt";

    @SerializedName(SERIALIZED_NAME_MODIFIED_TIME_LT)
    private String modifiedTimeLt;

    public static final String SERIALIZED_NAME_MODIFIED_TIME_LTE = "modified_time_lte";

    @SerializedName(SERIALIZED_NAME_MODIFIED_TIME_LTE)
    private String modifiedTimeLte;

    public static final String SERIALIZED_NAME_MODIFIED_TIME_NOT = "modified_time_not";

    @SerializedName(SERIALIZED_NAME_MODIFIED_TIME_NOT)
    private String modifiedTimeNot;

    public static final String SERIALIZED_NAME_MODIFIED_TIME_NOT_IN = "modified_time_not_in";

    @SerializedName(SERIALIZED_NAME_MODIFIED_TIME_NOT_IN)
    private List<String> modifiedTimeNotIn = null;

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

    public static final String SERIALIZED_NAME_RECYCLE_POLICY = "recycle_policy";

    @SerializedName(SERIALIZED_NAME_RECYCLE_POLICY)
    private String recyclePolicy;

    public static final String SERIALIZED_NAME_RECYCLE_POLICY_CONTAINS = "recycle_policy_contains";

    @SerializedName(SERIALIZED_NAME_RECYCLE_POLICY_CONTAINS)
    private String recyclePolicyContains;

    public static final String SERIALIZED_NAME_RECYCLE_POLICY_ENDS_WITH =
            "recycle_policy_ends_with";

    @SerializedName(SERIALIZED_NAME_RECYCLE_POLICY_ENDS_WITH)
    private String recyclePolicyEndsWith;

    public static final String SERIALIZED_NAME_RECYCLE_POLICY_GT = "recycle_policy_gt";

    @SerializedName(SERIALIZED_NAME_RECYCLE_POLICY_GT)
    private String recyclePolicyGt;

    public static final String SERIALIZED_NAME_RECYCLE_POLICY_GTE = "recycle_policy_gte";

    @SerializedName(SERIALIZED_NAME_RECYCLE_POLICY_GTE)
    private String recyclePolicyGte;

    public static final String SERIALIZED_NAME_RECYCLE_POLICY_IN = "recycle_policy_in";

    @SerializedName(SERIALIZED_NAME_RECYCLE_POLICY_IN)
    private List<String> recyclePolicyIn = null;

    public static final String SERIALIZED_NAME_RECYCLE_POLICY_LT = "recycle_policy_lt";

    @SerializedName(SERIALIZED_NAME_RECYCLE_POLICY_LT)
    private String recyclePolicyLt;

    public static final String SERIALIZED_NAME_RECYCLE_POLICY_LTE = "recycle_policy_lte";

    @SerializedName(SERIALIZED_NAME_RECYCLE_POLICY_LTE)
    private String recyclePolicyLte;

    public static final String SERIALIZED_NAME_RECYCLE_POLICY_NOT = "recycle_policy_not";

    @SerializedName(SERIALIZED_NAME_RECYCLE_POLICY_NOT)
    private String recyclePolicyNot;

    public static final String SERIALIZED_NAME_RECYCLE_POLICY_NOT_CONTAINS =
            "recycle_policy_not_contains";

    @SerializedName(SERIALIZED_NAME_RECYCLE_POLICY_NOT_CONTAINS)
    private String recyclePolicyNotContains;

    public static final String SERIALIZED_NAME_RECYCLE_POLICY_NOT_ENDS_WITH =
            "recycle_policy_not_ends_with";

    @SerializedName(SERIALIZED_NAME_RECYCLE_POLICY_NOT_ENDS_WITH)
    private String recyclePolicyNotEndsWith;

    public static final String SERIALIZED_NAME_RECYCLE_POLICY_NOT_IN = "recycle_policy_not_in";

    @SerializedName(SERIALIZED_NAME_RECYCLE_POLICY_NOT_IN)
    private List<String> recyclePolicyNotIn = null;

    public static final String SERIALIZED_NAME_RECYCLE_POLICY_NOT_STARTS_WITH =
            "recycle_policy_not_starts_with";

    @SerializedName(SERIALIZED_NAME_RECYCLE_POLICY_NOT_STARTS_WITH)
    private String recyclePolicyNotStartsWith;

    public static final String SERIALIZED_NAME_RECYCLE_POLICY_STARTS_WITH =
            "recycle_policy_starts_with";

    @SerializedName(SERIALIZED_NAME_RECYCLE_POLICY_STARTS_WITH)
    private String recyclePolicyStartsWith;

    public static final String SERIALIZED_NAME_STATUS = "status";

    @SerializedName(SERIALIZED_NAME_STATUS)
    private DatastoreStatus status;

    public static final String SERIALIZED_NAME_STATUS_IN = "status_in";

    @SerializedName(SERIALIZED_NAME_STATUS_IN)
    private List<DatastoreStatus> statusIn = null;

    public static final String SERIALIZED_NAME_STATUS_NOT = "status_not";

    @SerializedName(SERIALIZED_NAME_STATUS_NOT)
    private DatastoreStatus statusNot;

    public static final String SERIALIZED_NAME_STATUS_NOT_IN = "status_not_in";

    @SerializedName(SERIALIZED_NAME_STATUS_NOT_IN)
    private List<DatastoreStatus> statusNotIn = null;

    public static final String SERIALIZED_NAME_TYPE = "type";

    @SerializedName(SERIALIZED_NAME_TYPE)
    private StorageProtocol type;

    public static final String SERIALIZED_NAME_TYPE_IN = "type_in";

    @SerializedName(SERIALIZED_NAME_TYPE_IN)
    private List<StorageProtocol> typeIn = null;

    public static final String SERIALIZED_NAME_TYPE_NOT = "type_not";

    @SerializedName(SERIALIZED_NAME_TYPE_NOT)
    private StorageProtocol typeNot;

    public static final String SERIALIZED_NAME_TYPE_NOT_IN = "type_not_in";

    @SerializedName(SERIALIZED_NAME_TYPE_NOT_IN)
    private List<StorageProtocol> typeNotIn = null;

    public static final String SERIALIZED_NAME_USED_BYTES = "used_bytes";

    @SerializedName(SERIALIZED_NAME_USED_BYTES)
    private Long usedBytes;

    public static final String SERIALIZED_NAME_USED_BYTES_GT = "used_bytes_gt";

    @SerializedName(SERIALIZED_NAME_USED_BYTES_GT)
    private Long usedBytesGt;

    public static final String SERIALIZED_NAME_USED_BYTES_GTE = "used_bytes_gte";

    @SerializedName(SERIALIZED_NAME_USED_BYTES_GTE)
    private Long usedBytesGte;

    public static final String SERIALIZED_NAME_USED_BYTES_IN = "used_bytes_in";

    @SerializedName(SERIALIZED_NAME_USED_BYTES_IN)
    private List<Long> usedBytesIn = null;

    public static final String SERIALIZED_NAME_USED_BYTES_LT = "used_bytes_lt";

    @SerializedName(SERIALIZED_NAME_USED_BYTES_LT)
    private Long usedBytesLt;

    public static final String SERIALIZED_NAME_USED_BYTES_LTE = "used_bytes_lte";

    @SerializedName(SERIALIZED_NAME_USED_BYTES_LTE)
    private Long usedBytesLte;

    public static final String SERIALIZED_NAME_USED_BYTES_NOT = "used_bytes_not";

    @SerializedName(SERIALIZED_NAME_USED_BYTES_NOT)
    private Long usedBytesNot;

    public static final String SERIALIZED_NAME_USED_BYTES_NOT_IN = "used_bytes_not_in";

    @SerializedName(SERIALIZED_NAME_USED_BYTES_NOT_IN)
    private List<Long> usedBytesNotIn = null;

    public static final String SERIALIZED_NAME_VCFS_VERSION = "vcfs_version";

    @SerializedName(SERIALIZED_NAME_VCFS_VERSION)
    private String vcfsVersion;

    public static final String SERIALIZED_NAME_VCFS_VERSION_CONTAINS = "vcfs_version_contains";

    @SerializedName(SERIALIZED_NAME_VCFS_VERSION_CONTAINS)
    private String vcfsVersionContains;

    public static final String SERIALIZED_NAME_VCFS_VERSION_ENDS_WITH = "vcfs_version_ends_with";

    @SerializedName(SERIALIZED_NAME_VCFS_VERSION_ENDS_WITH)
    private String vcfsVersionEndsWith;

    public static final String SERIALIZED_NAME_VCFS_VERSION_GT = "vcfs_version_gt";

    @SerializedName(SERIALIZED_NAME_VCFS_VERSION_GT)
    private String vcfsVersionGt;

    public static final String SERIALIZED_NAME_VCFS_VERSION_GTE = "vcfs_version_gte";

    @SerializedName(SERIALIZED_NAME_VCFS_VERSION_GTE)
    private String vcfsVersionGte;

    public static final String SERIALIZED_NAME_VCFS_VERSION_IN = "vcfs_version_in";

    @SerializedName(SERIALIZED_NAME_VCFS_VERSION_IN)
    private List<String> vcfsVersionIn = null;

    public static final String SERIALIZED_NAME_VCFS_VERSION_LT = "vcfs_version_lt";

    @SerializedName(SERIALIZED_NAME_VCFS_VERSION_LT)
    private String vcfsVersionLt;

    public static final String SERIALIZED_NAME_VCFS_VERSION_LTE = "vcfs_version_lte";

    @SerializedName(SERIALIZED_NAME_VCFS_VERSION_LTE)
    private String vcfsVersionLte;

    public static final String SERIALIZED_NAME_VCFS_VERSION_NOT = "vcfs_version_not";

    @SerializedName(SERIALIZED_NAME_VCFS_VERSION_NOT)
    private String vcfsVersionNot;

    public static final String SERIALIZED_NAME_VCFS_VERSION_NOT_CONTAINS =
            "vcfs_version_not_contains";

    @SerializedName(SERIALIZED_NAME_VCFS_VERSION_NOT_CONTAINS)
    private String vcfsVersionNotContains;

    public static final String SERIALIZED_NAME_VCFS_VERSION_NOT_ENDS_WITH =
            "vcfs_version_not_ends_with";

    @SerializedName(SERIALIZED_NAME_VCFS_VERSION_NOT_ENDS_WITH)
    private String vcfsVersionNotEndsWith;

    public static final String SERIALIZED_NAME_VCFS_VERSION_NOT_IN = "vcfs_version_not_in";

    @SerializedName(SERIALIZED_NAME_VCFS_VERSION_NOT_IN)
    private List<String> vcfsVersionNotIn = null;

    public static final String SERIALIZED_NAME_VCFS_VERSION_NOT_STARTS_WITH =
            "vcfs_version_not_starts_with";

    @SerializedName(SERIALIZED_NAME_VCFS_VERSION_NOT_STARTS_WITH)
    private String vcfsVersionNotStartsWith;

    public static final String SERIALIZED_NAME_VCFS_VERSION_STARTS_WITH =
            "vcfs_version_starts_with";

    @SerializedName(SERIALIZED_NAME_VCFS_VERSION_STARTS_WITH)
    private String vcfsVersionStartsWith;

    public DatastoreWhereInput() {}

    public DatastoreWhereInput AND(List<DatastoreWhereInput> AND) {

        this.AND = AND;
        return this;
    }

    public DatastoreWhereInput addANDItem(DatastoreWhereInput ANDItem) {
        if (this.AND == null) {
            this.AND = new ArrayList<DatastoreWhereInput>();
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
    public List<DatastoreWhereInput> getAND() {
        return AND;
    }

    public void setAND(List<DatastoreWhereInput> AND) {
        this.AND = AND;
    }

    public DatastoreWhereInput AND_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_A_N_D);
        return this;
    }

    public DatastoreWhereInput AND_ExplictlyNonNull() {
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

    public DatastoreWhereInput NOT(List<DatastoreWhereInput> NOT) {

        this.NOT = NOT;
        return this;
    }

    public DatastoreWhereInput addNOTItem(DatastoreWhereInput NOTItem) {
        if (this.NOT == null) {
            this.NOT = new ArrayList<DatastoreWhereInput>();
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
    public List<DatastoreWhereInput> getNOT() {
        return NOT;
    }

    public void setNOT(List<DatastoreWhereInput> NOT) {
        this.NOT = NOT;
    }

    public DatastoreWhereInput NOT_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_N_O_T);
        return this;
    }

    public DatastoreWhereInput NOT_ExplictlyNonNull() {
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

    public DatastoreWhereInput OR(List<DatastoreWhereInput> OR) {

        this.OR = OR;
        return this;
    }

    public DatastoreWhereInput addORItem(DatastoreWhereInput ORItem) {
        if (this.OR == null) {
            this.OR = new ArrayList<DatastoreWhereInput>();
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
    public List<DatastoreWhereInput> getOR() {
        return OR;
    }

    public void setOR(List<DatastoreWhereInput> OR) {
        this.OR = OR;
    }

    public DatastoreWhereInput OR_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_O_R);
        return this;
    }

    public DatastoreWhereInput OR_ExplictlyNonNull() {
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

    public DatastoreWhereInput capacityBytes(Double capacityBytes) {

        this.capacityBytes = capacityBytes;
        return this;
    }

    /**
     * Get capacityBytes
     *
     * @return capacityBytes
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getCapacityBytes() {
        return capacityBytes;
    }

    public void setCapacityBytes(Double capacityBytes) {
        this.capacityBytes = capacityBytes;
    }

    public DatastoreWhereInput capacityBytes_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CAPACITY_BYTES);
        return this;
    }

    public DatastoreWhereInput capacityBytes_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CAPACITY_BYTES);
        return this;
    }

    public void setCapacityBytes_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CAPACITY_BYTES);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CAPACITY_BYTES);
        }
    }

    public boolean getCapacityBytes_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CAPACITY_BYTES);
    }

    public DatastoreWhereInput capacityBytesGt(Double capacityBytesGt) {

        this.capacityBytesGt = capacityBytesGt;
        return this;
    }

    /**
     * Get capacityBytesGt
     *
     * @return capacityBytesGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getCapacityBytesGt() {
        return capacityBytesGt;
    }

    public void setCapacityBytesGt(Double capacityBytesGt) {
        this.capacityBytesGt = capacityBytesGt;
    }

    public DatastoreWhereInput capacityBytesGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CAPACITY_BYTES_GT);
        return this;
    }

    public DatastoreWhereInput capacityBytesGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CAPACITY_BYTES_GT);
        return this;
    }

    public void setCapacityBytesGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CAPACITY_BYTES_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CAPACITY_BYTES_GT);
        }
    }

    public boolean getCapacityBytesGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CAPACITY_BYTES_GT);
    }

    public DatastoreWhereInput capacityBytesGte(Double capacityBytesGte) {

        this.capacityBytesGte = capacityBytesGte;
        return this;
    }

    /**
     * Get capacityBytesGte
     *
     * @return capacityBytesGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getCapacityBytesGte() {
        return capacityBytesGte;
    }

    public void setCapacityBytesGte(Double capacityBytesGte) {
        this.capacityBytesGte = capacityBytesGte;
    }

    public DatastoreWhereInput capacityBytesGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CAPACITY_BYTES_GTE);
        return this;
    }

    public DatastoreWhereInput capacityBytesGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CAPACITY_BYTES_GTE);
        return this;
    }

    public void setCapacityBytesGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CAPACITY_BYTES_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CAPACITY_BYTES_GTE);
        }
    }

    public boolean getCapacityBytesGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CAPACITY_BYTES_GTE);
    }

    public DatastoreWhereInput capacityBytesIn(List<Double> capacityBytesIn) {

        this.capacityBytesIn = capacityBytesIn;
        return this;
    }

    public DatastoreWhereInput addCapacityBytesInItem(Double capacityBytesInItem) {
        if (this.capacityBytesIn == null) {
            this.capacityBytesIn = new ArrayList<Double>();
        }
        this.capacityBytesIn.add(capacityBytesInItem);
        return this;
    }

    /**
     * Get capacityBytesIn
     *
     * @return capacityBytesIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Double> getCapacityBytesIn() {
        return capacityBytesIn;
    }

    public void setCapacityBytesIn(List<Double> capacityBytesIn) {
        this.capacityBytesIn = capacityBytesIn;
    }

    public DatastoreWhereInput capacityBytesIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CAPACITY_BYTES_IN);
        return this;
    }

    public DatastoreWhereInput capacityBytesIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CAPACITY_BYTES_IN);
        return this;
    }

    public void setCapacityBytesIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CAPACITY_BYTES_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CAPACITY_BYTES_IN);
        }
    }

    public boolean getCapacityBytesIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CAPACITY_BYTES_IN);
    }

    public DatastoreWhereInput capacityBytesLt(Double capacityBytesLt) {

        this.capacityBytesLt = capacityBytesLt;
        return this;
    }

    /**
     * Get capacityBytesLt
     *
     * @return capacityBytesLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getCapacityBytesLt() {
        return capacityBytesLt;
    }

    public void setCapacityBytesLt(Double capacityBytesLt) {
        this.capacityBytesLt = capacityBytesLt;
    }

    public DatastoreWhereInput capacityBytesLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CAPACITY_BYTES_LT);
        return this;
    }

    public DatastoreWhereInput capacityBytesLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CAPACITY_BYTES_LT);
        return this;
    }

    public void setCapacityBytesLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CAPACITY_BYTES_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CAPACITY_BYTES_LT);
        }
    }

    public boolean getCapacityBytesLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CAPACITY_BYTES_LT);
    }

    public DatastoreWhereInput capacityBytesLte(Double capacityBytesLte) {

        this.capacityBytesLte = capacityBytesLte;
        return this;
    }

    /**
     * Get capacityBytesLte
     *
     * @return capacityBytesLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getCapacityBytesLte() {
        return capacityBytesLte;
    }

    public void setCapacityBytesLte(Double capacityBytesLte) {
        this.capacityBytesLte = capacityBytesLte;
    }

    public DatastoreWhereInput capacityBytesLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CAPACITY_BYTES_LTE);
        return this;
    }

    public DatastoreWhereInput capacityBytesLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CAPACITY_BYTES_LTE);
        return this;
    }

    public void setCapacityBytesLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CAPACITY_BYTES_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CAPACITY_BYTES_LTE);
        }
    }

    public boolean getCapacityBytesLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CAPACITY_BYTES_LTE);
    }

    public DatastoreWhereInput capacityBytesNot(Double capacityBytesNot) {

        this.capacityBytesNot = capacityBytesNot;
        return this;
    }

    /**
     * Get capacityBytesNot
     *
     * @return capacityBytesNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Double getCapacityBytesNot() {
        return capacityBytesNot;
    }

    public void setCapacityBytesNot(Double capacityBytesNot) {
        this.capacityBytesNot = capacityBytesNot;
    }

    public DatastoreWhereInput capacityBytesNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CAPACITY_BYTES_NOT);
        return this;
    }

    public DatastoreWhereInput capacityBytesNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CAPACITY_BYTES_NOT);
        return this;
    }

    public void setCapacityBytesNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CAPACITY_BYTES_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CAPACITY_BYTES_NOT);
        }
    }

    public boolean getCapacityBytesNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CAPACITY_BYTES_NOT);
    }

    public DatastoreWhereInput capacityBytesNotIn(List<Double> capacityBytesNotIn) {

        this.capacityBytesNotIn = capacityBytesNotIn;
        return this;
    }

    public DatastoreWhereInput addCapacityBytesNotInItem(Double capacityBytesNotInItem) {
        if (this.capacityBytesNotIn == null) {
            this.capacityBytesNotIn = new ArrayList<Double>();
        }
        this.capacityBytesNotIn.add(capacityBytesNotInItem);
        return this;
    }

    /**
     * Get capacityBytesNotIn
     *
     * @return capacityBytesNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Double> getCapacityBytesNotIn() {
        return capacityBytesNotIn;
    }

    public void setCapacityBytesNotIn(List<Double> capacityBytesNotIn) {
        this.capacityBytesNotIn = capacityBytesNotIn;
    }

    public DatastoreWhereInput capacityBytesNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CAPACITY_BYTES_NOT_IN);
        return this;
    }

    public DatastoreWhereInput capacityBytesNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CAPACITY_BYTES_NOT_IN);
        return this;
    }

    public void setCapacityBytesNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CAPACITY_BYTES_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CAPACITY_BYTES_NOT_IN);
        }
    }

    public boolean getCapacityBytesNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CAPACITY_BYTES_NOT_IN);
    }

    public DatastoreWhereInput createdTime(String createdTime) {

        this.createdTime = createdTime;
        return this;
    }

    /**
     * Get createdTime
     *
     * @return createdTime
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public DatastoreWhereInput createdTime_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_TIME);
        return this;
    }

    public DatastoreWhereInput createdTime_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CREATED_TIME);
        return this;
    }

    public void setCreatedTime_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CREATED_TIME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CREATED_TIME);
        }
    }

    public boolean getCreatedTime_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CREATED_TIME);
    }

    public DatastoreWhereInput createdTimeGt(String createdTimeGt) {

        this.createdTimeGt = createdTimeGt;
        return this;
    }

    /**
     * Get createdTimeGt
     *
     * @return createdTimeGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCreatedTimeGt() {
        return createdTimeGt;
    }

    public void setCreatedTimeGt(String createdTimeGt) {
        this.createdTimeGt = createdTimeGt;
    }

    public DatastoreWhereInput createdTimeGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_TIME_GT);
        return this;
    }

    public DatastoreWhereInput createdTimeGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CREATED_TIME_GT);
        return this;
    }

    public void setCreatedTimeGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CREATED_TIME_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CREATED_TIME_GT);
        }
    }

    public boolean getCreatedTimeGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CREATED_TIME_GT);
    }

    public DatastoreWhereInput createdTimeGte(String createdTimeGte) {

        this.createdTimeGte = createdTimeGte;
        return this;
    }

    /**
     * Get createdTimeGte
     *
     * @return createdTimeGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCreatedTimeGte() {
        return createdTimeGte;
    }

    public void setCreatedTimeGte(String createdTimeGte) {
        this.createdTimeGte = createdTimeGte;
    }

    public DatastoreWhereInput createdTimeGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_TIME_GTE);
        return this;
    }

    public DatastoreWhereInput createdTimeGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CREATED_TIME_GTE);
        return this;
    }

    public void setCreatedTimeGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CREATED_TIME_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CREATED_TIME_GTE);
        }
    }

    public boolean getCreatedTimeGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CREATED_TIME_GTE);
    }

    public DatastoreWhereInput createdTimeIn(List<String> createdTimeIn) {

        this.createdTimeIn = createdTimeIn;
        return this;
    }

    public DatastoreWhereInput addCreatedTimeInItem(String createdTimeInItem) {
        if (this.createdTimeIn == null) {
            this.createdTimeIn = new ArrayList<String>();
        }
        this.createdTimeIn.add(createdTimeInItem);
        return this;
    }

    /**
     * Get createdTimeIn
     *
     * @return createdTimeIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getCreatedTimeIn() {
        return createdTimeIn;
    }

    public void setCreatedTimeIn(List<String> createdTimeIn) {
        this.createdTimeIn = createdTimeIn;
    }

    public DatastoreWhereInput createdTimeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_TIME_IN);
        return this;
    }

    public DatastoreWhereInput createdTimeIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CREATED_TIME_IN);
        return this;
    }

    public void setCreatedTimeIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CREATED_TIME_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CREATED_TIME_IN);
        }
    }

    public boolean getCreatedTimeIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CREATED_TIME_IN);
    }

    public DatastoreWhereInput createdTimeLt(String createdTimeLt) {

        this.createdTimeLt = createdTimeLt;
        return this;
    }

    /**
     * Get createdTimeLt
     *
     * @return createdTimeLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCreatedTimeLt() {
        return createdTimeLt;
    }

    public void setCreatedTimeLt(String createdTimeLt) {
        this.createdTimeLt = createdTimeLt;
    }

    public DatastoreWhereInput createdTimeLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_TIME_LT);
        return this;
    }

    public DatastoreWhereInput createdTimeLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CREATED_TIME_LT);
        return this;
    }

    public void setCreatedTimeLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CREATED_TIME_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CREATED_TIME_LT);
        }
    }

    public boolean getCreatedTimeLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CREATED_TIME_LT);
    }

    public DatastoreWhereInput createdTimeLte(String createdTimeLte) {

        this.createdTimeLte = createdTimeLte;
        return this;
    }

    /**
     * Get createdTimeLte
     *
     * @return createdTimeLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCreatedTimeLte() {
        return createdTimeLte;
    }

    public void setCreatedTimeLte(String createdTimeLte) {
        this.createdTimeLte = createdTimeLte;
    }

    public DatastoreWhereInput createdTimeLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_TIME_LTE);
        return this;
    }

    public DatastoreWhereInput createdTimeLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CREATED_TIME_LTE);
        return this;
    }

    public void setCreatedTimeLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CREATED_TIME_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CREATED_TIME_LTE);
        }
    }

    public boolean getCreatedTimeLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CREATED_TIME_LTE);
    }

    public DatastoreWhereInput createdTimeNot(String createdTimeNot) {

        this.createdTimeNot = createdTimeNot;
        return this;
    }

    /**
     * Get createdTimeNot
     *
     * @return createdTimeNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCreatedTimeNot() {
        return createdTimeNot;
    }

    public void setCreatedTimeNot(String createdTimeNot) {
        this.createdTimeNot = createdTimeNot;
    }

    public DatastoreWhereInput createdTimeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_TIME_NOT);
        return this;
    }

    public DatastoreWhereInput createdTimeNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CREATED_TIME_NOT);
        return this;
    }

    public void setCreatedTimeNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CREATED_TIME_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CREATED_TIME_NOT);
        }
    }

    public boolean getCreatedTimeNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CREATED_TIME_NOT);
    }

    public DatastoreWhereInput createdTimeNotIn(List<String> createdTimeNotIn) {

        this.createdTimeNotIn = createdTimeNotIn;
        return this;
    }

    public DatastoreWhereInput addCreatedTimeNotInItem(String createdTimeNotInItem) {
        if (this.createdTimeNotIn == null) {
            this.createdTimeNotIn = new ArrayList<String>();
        }
        this.createdTimeNotIn.add(createdTimeNotInItem);
        return this;
    }

    /**
     * Get createdTimeNotIn
     *
     * @return createdTimeNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getCreatedTimeNotIn() {
        return createdTimeNotIn;
    }

    public void setCreatedTimeNotIn(List<String> createdTimeNotIn) {
        this.createdTimeNotIn = createdTimeNotIn;
    }

    public DatastoreWhereInput createdTimeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CREATED_TIME_NOT_IN);
        return this;
    }

    public DatastoreWhereInput createdTimeNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CREATED_TIME_NOT_IN);
        return this;
    }

    public void setCreatedTimeNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CREATED_TIME_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CREATED_TIME_NOT_IN);
        }
    }

    public boolean getCreatedTimeNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CREATED_TIME_NOT_IN);
    }

    public DatastoreWhereInput dataVersion(Integer dataVersion) {

        this.dataVersion = dataVersion;
        return this;
    }

    /**
     * Get dataVersion
     *
     * @return dataVersion
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getDataVersion() {
        return dataVersion;
    }

    public void setDataVersion(Integer dataVersion) {
        this.dataVersion = dataVersion;
    }

    public DatastoreWhereInput dataVersion_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATA_VERSION);
        return this;
    }

    public DatastoreWhereInput dataVersion_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATA_VERSION);
        return this;
    }

    public void setDataVersion_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATA_VERSION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATA_VERSION);
        }
    }

    public boolean getDataVersion_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATA_VERSION);
    }

    public DatastoreWhereInput dataVersionGt(Integer dataVersionGt) {

        this.dataVersionGt = dataVersionGt;
        return this;
    }

    /**
     * Get dataVersionGt
     *
     * @return dataVersionGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getDataVersionGt() {
        return dataVersionGt;
    }

    public void setDataVersionGt(Integer dataVersionGt) {
        this.dataVersionGt = dataVersionGt;
    }

    public DatastoreWhereInput dataVersionGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATA_VERSION_GT);
        return this;
    }

    public DatastoreWhereInput dataVersionGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATA_VERSION_GT);
        return this;
    }

    public void setDataVersionGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATA_VERSION_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATA_VERSION_GT);
        }
    }

    public boolean getDataVersionGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATA_VERSION_GT);
    }

    public DatastoreWhereInput dataVersionGte(Integer dataVersionGte) {

        this.dataVersionGte = dataVersionGte;
        return this;
    }

    /**
     * Get dataVersionGte
     *
     * @return dataVersionGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getDataVersionGte() {
        return dataVersionGte;
    }

    public void setDataVersionGte(Integer dataVersionGte) {
        this.dataVersionGte = dataVersionGte;
    }

    public DatastoreWhereInput dataVersionGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATA_VERSION_GTE);
        return this;
    }

    public DatastoreWhereInput dataVersionGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATA_VERSION_GTE);
        return this;
    }

    public void setDataVersionGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATA_VERSION_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATA_VERSION_GTE);
        }
    }

    public boolean getDataVersionGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATA_VERSION_GTE);
    }

    public DatastoreWhereInput dataVersionIn(List<Integer> dataVersionIn) {

        this.dataVersionIn = dataVersionIn;
        return this;
    }

    public DatastoreWhereInput addDataVersionInItem(Integer dataVersionInItem) {
        if (this.dataVersionIn == null) {
            this.dataVersionIn = new ArrayList<Integer>();
        }
        this.dataVersionIn.add(dataVersionInItem);
        return this;
    }

    /**
     * Get dataVersionIn
     *
     * @return dataVersionIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getDataVersionIn() {
        return dataVersionIn;
    }

    public void setDataVersionIn(List<Integer> dataVersionIn) {
        this.dataVersionIn = dataVersionIn;
    }

    public DatastoreWhereInput dataVersionIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATA_VERSION_IN);
        return this;
    }

    public DatastoreWhereInput dataVersionIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATA_VERSION_IN);
        return this;
    }

    public void setDataVersionIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATA_VERSION_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATA_VERSION_IN);
        }
    }

    public boolean getDataVersionIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATA_VERSION_IN);
    }

    public DatastoreWhereInput dataVersionLt(Integer dataVersionLt) {

        this.dataVersionLt = dataVersionLt;
        return this;
    }

    /**
     * Get dataVersionLt
     *
     * @return dataVersionLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getDataVersionLt() {
        return dataVersionLt;
    }

    public void setDataVersionLt(Integer dataVersionLt) {
        this.dataVersionLt = dataVersionLt;
    }

    public DatastoreWhereInput dataVersionLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATA_VERSION_LT);
        return this;
    }

    public DatastoreWhereInput dataVersionLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATA_VERSION_LT);
        return this;
    }

    public void setDataVersionLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATA_VERSION_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATA_VERSION_LT);
        }
    }

    public boolean getDataVersionLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATA_VERSION_LT);
    }

    public DatastoreWhereInput dataVersionLte(Integer dataVersionLte) {

        this.dataVersionLte = dataVersionLte;
        return this;
    }

    /**
     * Get dataVersionLte
     *
     * @return dataVersionLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getDataVersionLte() {
        return dataVersionLte;
    }

    public void setDataVersionLte(Integer dataVersionLte) {
        this.dataVersionLte = dataVersionLte;
    }

    public DatastoreWhereInput dataVersionLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATA_VERSION_LTE);
        return this;
    }

    public DatastoreWhereInput dataVersionLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATA_VERSION_LTE);
        return this;
    }

    public void setDataVersionLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATA_VERSION_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATA_VERSION_LTE);
        }
    }

    public boolean getDataVersionLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATA_VERSION_LTE);
    }

    public DatastoreWhereInput dataVersionNot(Integer dataVersionNot) {

        this.dataVersionNot = dataVersionNot;
        return this;
    }

    /**
     * Get dataVersionNot
     *
     * @return dataVersionNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getDataVersionNot() {
        return dataVersionNot;
    }

    public void setDataVersionNot(Integer dataVersionNot) {
        this.dataVersionNot = dataVersionNot;
    }

    public DatastoreWhereInput dataVersionNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATA_VERSION_NOT);
        return this;
    }

    public DatastoreWhereInput dataVersionNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATA_VERSION_NOT);
        return this;
    }

    public void setDataVersionNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATA_VERSION_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATA_VERSION_NOT);
        }
    }

    public boolean getDataVersionNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATA_VERSION_NOT);
    }

    public DatastoreWhereInput dataVersionNotIn(List<Integer> dataVersionNotIn) {

        this.dataVersionNotIn = dataVersionNotIn;
        return this;
    }

    public DatastoreWhereInput addDataVersionNotInItem(Integer dataVersionNotInItem) {
        if (this.dataVersionNotIn == null) {
            this.dataVersionNotIn = new ArrayList<Integer>();
        }
        this.dataVersionNotIn.add(dataVersionNotInItem);
        return this;
    }

    /**
     * Get dataVersionNotIn
     *
     * @return dataVersionNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getDataVersionNotIn() {
        return dataVersionNotIn;
    }

    public void setDataVersionNotIn(List<Integer> dataVersionNotIn) {
        this.dataVersionNotIn = dataVersionNotIn;
    }

    public DatastoreWhereInput dataVersionNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATA_VERSION_NOT_IN);
        return this;
    }

    public DatastoreWhereInput dataVersionNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATA_VERSION_NOT_IN);
        return this;
    }

    public void setDataVersionNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATA_VERSION_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATA_VERSION_NOT_IN);
        }
    }

    public boolean getDataVersionNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATA_VERSION_NOT_IN);
    }

    public DatastoreWhereInput datastoreCapacityBytes(Long datastoreCapacityBytes) {

        this.datastoreCapacityBytes = datastoreCapacityBytes;
        return this;
    }

    /**
     * Get datastoreCapacityBytes
     *
     * @return datastoreCapacityBytes
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getDatastoreCapacityBytes() {
        return datastoreCapacityBytes;
    }

    public void setDatastoreCapacityBytes(Long datastoreCapacityBytes) {
        this.datastoreCapacityBytes = datastoreCapacityBytes;
    }

    public DatastoreWhereInput datastoreCapacityBytes_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATASTORE_CAPACITY_BYTES);
        return this;
    }

    public DatastoreWhereInput datastoreCapacityBytes_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATASTORE_CAPACITY_BYTES);
        return this;
    }

    public void setDatastoreCapacityBytes_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATASTORE_CAPACITY_BYTES);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATASTORE_CAPACITY_BYTES);
        }
    }

    public boolean getDatastoreCapacityBytes_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATASTORE_CAPACITY_BYTES);
    }

    public DatastoreWhereInput datastoreCapacityBytesGt(Long datastoreCapacityBytesGt) {

        this.datastoreCapacityBytesGt = datastoreCapacityBytesGt;
        return this;
    }

    /**
     * Get datastoreCapacityBytesGt
     *
     * @return datastoreCapacityBytesGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getDatastoreCapacityBytesGt() {
        return datastoreCapacityBytesGt;
    }

    public void setDatastoreCapacityBytesGt(Long datastoreCapacityBytesGt) {
        this.datastoreCapacityBytesGt = datastoreCapacityBytesGt;
    }

    public DatastoreWhereInput datastoreCapacityBytesGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATASTORE_CAPACITY_BYTES_GT);
        return this;
    }

    public DatastoreWhereInput datastoreCapacityBytesGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATASTORE_CAPACITY_BYTES_GT);
        return this;
    }

    public void setDatastoreCapacityBytesGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATASTORE_CAPACITY_BYTES_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATASTORE_CAPACITY_BYTES_GT);
        }
    }

    public boolean getDatastoreCapacityBytesGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATASTORE_CAPACITY_BYTES_GT);
    }

    public DatastoreWhereInput datastoreCapacityBytesGte(Long datastoreCapacityBytesGte) {

        this.datastoreCapacityBytesGte = datastoreCapacityBytesGte;
        return this;
    }

    /**
     * Get datastoreCapacityBytesGte
     *
     * @return datastoreCapacityBytesGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getDatastoreCapacityBytesGte() {
        return datastoreCapacityBytesGte;
    }

    public void setDatastoreCapacityBytesGte(Long datastoreCapacityBytesGte) {
        this.datastoreCapacityBytesGte = datastoreCapacityBytesGte;
    }

    public DatastoreWhereInput datastoreCapacityBytesGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATASTORE_CAPACITY_BYTES_GTE);
        return this;
    }

    public DatastoreWhereInput datastoreCapacityBytesGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATASTORE_CAPACITY_BYTES_GTE);
        return this;
    }

    public void setDatastoreCapacityBytesGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATASTORE_CAPACITY_BYTES_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATASTORE_CAPACITY_BYTES_GTE);
        }
    }

    public boolean getDatastoreCapacityBytesGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATASTORE_CAPACITY_BYTES_GTE);
    }

    public DatastoreWhereInput datastoreCapacityBytesIn(List<Long> datastoreCapacityBytesIn) {

        this.datastoreCapacityBytesIn = datastoreCapacityBytesIn;
        return this;
    }

    public DatastoreWhereInput addDatastoreCapacityBytesInItem(Long datastoreCapacityBytesInItem) {
        if (this.datastoreCapacityBytesIn == null) {
            this.datastoreCapacityBytesIn = new ArrayList<Long>();
        }
        this.datastoreCapacityBytesIn.add(datastoreCapacityBytesInItem);
        return this;
    }

    /**
     * Get datastoreCapacityBytesIn
     *
     * @return datastoreCapacityBytesIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getDatastoreCapacityBytesIn() {
        return datastoreCapacityBytesIn;
    }

    public void setDatastoreCapacityBytesIn(List<Long> datastoreCapacityBytesIn) {
        this.datastoreCapacityBytesIn = datastoreCapacityBytesIn;
    }

    public DatastoreWhereInput datastoreCapacityBytesIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATASTORE_CAPACITY_BYTES_IN);
        return this;
    }

    public DatastoreWhereInput datastoreCapacityBytesIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATASTORE_CAPACITY_BYTES_IN);
        return this;
    }

    public void setDatastoreCapacityBytesIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATASTORE_CAPACITY_BYTES_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATASTORE_CAPACITY_BYTES_IN);
        }
    }

    public boolean getDatastoreCapacityBytesIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATASTORE_CAPACITY_BYTES_IN);
    }

    public DatastoreWhereInput datastoreCapacityBytesLt(Long datastoreCapacityBytesLt) {

        this.datastoreCapacityBytesLt = datastoreCapacityBytesLt;
        return this;
    }

    /**
     * Get datastoreCapacityBytesLt
     *
     * @return datastoreCapacityBytesLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getDatastoreCapacityBytesLt() {
        return datastoreCapacityBytesLt;
    }

    public void setDatastoreCapacityBytesLt(Long datastoreCapacityBytesLt) {
        this.datastoreCapacityBytesLt = datastoreCapacityBytesLt;
    }

    public DatastoreWhereInput datastoreCapacityBytesLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATASTORE_CAPACITY_BYTES_LT);
        return this;
    }

    public DatastoreWhereInput datastoreCapacityBytesLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATASTORE_CAPACITY_BYTES_LT);
        return this;
    }

    public void setDatastoreCapacityBytesLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATASTORE_CAPACITY_BYTES_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATASTORE_CAPACITY_BYTES_LT);
        }
    }

    public boolean getDatastoreCapacityBytesLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATASTORE_CAPACITY_BYTES_LT);
    }

    public DatastoreWhereInput datastoreCapacityBytesLte(Long datastoreCapacityBytesLte) {

        this.datastoreCapacityBytesLte = datastoreCapacityBytesLte;
        return this;
    }

    /**
     * Get datastoreCapacityBytesLte
     *
     * @return datastoreCapacityBytesLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getDatastoreCapacityBytesLte() {
        return datastoreCapacityBytesLte;
    }

    public void setDatastoreCapacityBytesLte(Long datastoreCapacityBytesLte) {
        this.datastoreCapacityBytesLte = datastoreCapacityBytesLte;
    }

    public DatastoreWhereInput datastoreCapacityBytesLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATASTORE_CAPACITY_BYTES_LTE);
        return this;
    }

    public DatastoreWhereInput datastoreCapacityBytesLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATASTORE_CAPACITY_BYTES_LTE);
        return this;
    }

    public void setDatastoreCapacityBytesLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATASTORE_CAPACITY_BYTES_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATASTORE_CAPACITY_BYTES_LTE);
        }
    }

    public boolean getDatastoreCapacityBytesLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATASTORE_CAPACITY_BYTES_LTE);
    }

    public DatastoreWhereInput datastoreCapacityBytesNot(Long datastoreCapacityBytesNot) {

        this.datastoreCapacityBytesNot = datastoreCapacityBytesNot;
        return this;
    }

    /**
     * Get datastoreCapacityBytesNot
     *
     * @return datastoreCapacityBytesNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getDatastoreCapacityBytesNot() {
        return datastoreCapacityBytesNot;
    }

    public void setDatastoreCapacityBytesNot(Long datastoreCapacityBytesNot) {
        this.datastoreCapacityBytesNot = datastoreCapacityBytesNot;
    }

    public DatastoreWhereInput datastoreCapacityBytesNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATASTORE_CAPACITY_BYTES_NOT);
        return this;
    }

    public DatastoreWhereInput datastoreCapacityBytesNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATASTORE_CAPACITY_BYTES_NOT);
        return this;
    }

    public void setDatastoreCapacityBytesNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATASTORE_CAPACITY_BYTES_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATASTORE_CAPACITY_BYTES_NOT);
        }
    }

    public boolean getDatastoreCapacityBytesNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATASTORE_CAPACITY_BYTES_NOT);
    }

    public DatastoreWhereInput datastoreCapacityBytesNotIn(List<Long> datastoreCapacityBytesNotIn) {

        this.datastoreCapacityBytesNotIn = datastoreCapacityBytesNotIn;
        return this;
    }

    public DatastoreWhereInput addDatastoreCapacityBytesNotInItem(
            Long datastoreCapacityBytesNotInItem) {
        if (this.datastoreCapacityBytesNotIn == null) {
            this.datastoreCapacityBytesNotIn = new ArrayList<Long>();
        }
        this.datastoreCapacityBytesNotIn.add(datastoreCapacityBytesNotInItem);
        return this;
    }

    /**
     * Get datastoreCapacityBytesNotIn
     *
     * @return datastoreCapacityBytesNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getDatastoreCapacityBytesNotIn() {
        return datastoreCapacityBytesNotIn;
    }

    public void setDatastoreCapacityBytesNotIn(List<Long> datastoreCapacityBytesNotIn) {
        this.datastoreCapacityBytesNotIn = datastoreCapacityBytesNotIn;
    }

    public DatastoreWhereInput datastoreCapacityBytesNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DATASTORE_CAPACITY_BYTES_NOT_IN);
        return this;
    }

    public DatastoreWhereInput datastoreCapacityBytesNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_DATASTORE_CAPACITY_BYTES_NOT_IN);
        return this;
    }

    public void setDatastoreCapacityBytesNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_DATASTORE_CAPACITY_BYTES_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_DATASTORE_CAPACITY_BYTES_NOT_IN);
        }
    }

    public boolean getDatastoreCapacityBytesNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_DATASTORE_CAPACITY_BYTES_NOT_IN);
    }

    public DatastoreWhereInput description(String description) {

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

    public DatastoreWhereInput description_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION);
        return this;
    }

    public DatastoreWhereInput description_ExplictlyNonNull() {
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

    public DatastoreWhereInput descriptionContains(String descriptionContains) {

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

    public DatastoreWhereInput descriptionContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_CONTAINS);
        return this;
    }

    public DatastoreWhereInput descriptionContains_ExplictlyNonNull() {
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

    public DatastoreWhereInput descriptionEndsWith(String descriptionEndsWith) {

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

    public DatastoreWhereInput descriptionEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_ENDS_WITH);
        return this;
    }

    public DatastoreWhereInput descriptionEndsWith_ExplictlyNonNull() {
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

    public DatastoreWhereInput descriptionGt(String descriptionGt) {

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

    public DatastoreWhereInput descriptionGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_GT);
        return this;
    }

    public DatastoreWhereInput descriptionGt_ExplictlyNonNull() {
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

    public DatastoreWhereInput descriptionGte(String descriptionGte) {

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

    public DatastoreWhereInput descriptionGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_GTE);
        return this;
    }

    public DatastoreWhereInput descriptionGte_ExplictlyNonNull() {
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

    public DatastoreWhereInput descriptionIn(List<String> descriptionIn) {

        this.descriptionIn = descriptionIn;
        return this;
    }

    public DatastoreWhereInput addDescriptionInItem(String descriptionInItem) {
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

    public DatastoreWhereInput descriptionIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_IN);
        return this;
    }

    public DatastoreWhereInput descriptionIn_ExplictlyNonNull() {
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

    public DatastoreWhereInput descriptionLt(String descriptionLt) {

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

    public DatastoreWhereInput descriptionLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_LT);
        return this;
    }

    public DatastoreWhereInput descriptionLt_ExplictlyNonNull() {
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

    public DatastoreWhereInput descriptionLte(String descriptionLte) {

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

    public DatastoreWhereInput descriptionLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_LTE);
        return this;
    }

    public DatastoreWhereInput descriptionLte_ExplictlyNonNull() {
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

    public DatastoreWhereInput descriptionNot(String descriptionNot) {

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

    public DatastoreWhereInput descriptionNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT);
        return this;
    }

    public DatastoreWhereInput descriptionNot_ExplictlyNonNull() {
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

    public DatastoreWhereInput descriptionNotContains(String descriptionNotContains) {

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

    public DatastoreWhereInput descriptionNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_CONTAINS);
        return this;
    }

    public DatastoreWhereInput descriptionNotContains_ExplictlyNonNull() {
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

    public DatastoreWhereInput descriptionNotEndsWith(String descriptionNotEndsWith) {

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

    public DatastoreWhereInput descriptionNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_ENDS_WITH);
        return this;
    }

    public DatastoreWhereInput descriptionNotEndsWith_ExplictlyNonNull() {
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

    public DatastoreWhereInput descriptionNotIn(List<String> descriptionNotIn) {

        this.descriptionNotIn = descriptionNotIn;
        return this;
    }

    public DatastoreWhereInput addDescriptionNotInItem(String descriptionNotInItem) {
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

    public DatastoreWhereInput descriptionNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_IN);
        return this;
    }

    public DatastoreWhereInput descriptionNotIn_ExplictlyNonNull() {
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

    public DatastoreWhereInput descriptionNotStartsWith(String descriptionNotStartsWith) {

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

    public DatastoreWhereInput descriptionNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_STARTS_WITH);
        return this;
    }

    public DatastoreWhereInput descriptionNotStartsWith_ExplictlyNonNull() {
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

    public DatastoreWhereInput descriptionStartsWith(String descriptionStartsWith) {

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

    public DatastoreWhereInput descriptionStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_STARTS_WITH);
        return this;
    }

    public DatastoreWhereInput descriptionStartsWith_ExplictlyNonNull() {
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

    public DatastoreWhereInput entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {

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

    public DatastoreWhereInput entityAsyncStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        return this;
    }

    public DatastoreWhereInput entityAsyncStatus_ExplictlyNonNull() {
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

    public DatastoreWhereInput entityAsyncStatusIn(List<EntityAsyncStatus> entityAsyncStatusIn) {

        this.entityAsyncStatusIn = entityAsyncStatusIn;
        return this;
    }

    public DatastoreWhereInput addEntityAsyncStatusInItem(
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

    public DatastoreWhereInput entityAsyncStatusIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_IN);
        return this;
    }

    public DatastoreWhereInput entityAsyncStatusIn_ExplictlyNonNull() {
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

    public DatastoreWhereInput entityAsyncStatusNot(EntityAsyncStatus entityAsyncStatusNot) {

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

    public DatastoreWhereInput entityAsyncStatusNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT);
        return this;
    }

    public DatastoreWhereInput entityAsyncStatusNot_ExplictlyNonNull() {
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

    public DatastoreWhereInput entityAsyncStatusNotIn(
            List<EntityAsyncStatus> entityAsyncStatusNotIn) {

        this.entityAsyncStatusNotIn = entityAsyncStatusNotIn;
        return this;
    }

    public DatastoreWhereInput addEntityAsyncStatusNotInItem(
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

    public DatastoreWhereInput entityAsyncStatusNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT_IN);
        return this;
    }

    public DatastoreWhereInput entityAsyncStatusNotIn_ExplictlyNonNull() {
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

    public DatastoreWhereInput freeBytes(Long freeBytes) {

        this.freeBytes = freeBytes;
        return this;
    }

    /**
     * Get freeBytes
     *
     * @return freeBytes
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getFreeBytes() {
        return freeBytes;
    }

    public void setFreeBytes(Long freeBytes) {
        this.freeBytes = freeBytes;
    }

    public DatastoreWhereInput freeBytes_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FREE_BYTES);
        return this;
    }

    public DatastoreWhereInput freeBytes_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FREE_BYTES);
        return this;
    }

    public void setFreeBytes_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FREE_BYTES);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FREE_BYTES);
        }
    }

    public boolean getFreeBytes_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FREE_BYTES);
    }

    public DatastoreWhereInput freeBytesGt(Long freeBytesGt) {

        this.freeBytesGt = freeBytesGt;
        return this;
    }

    /**
     * Get freeBytesGt
     *
     * @return freeBytesGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getFreeBytesGt() {
        return freeBytesGt;
    }

    public void setFreeBytesGt(Long freeBytesGt) {
        this.freeBytesGt = freeBytesGt;
    }

    public DatastoreWhereInput freeBytesGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FREE_BYTES_GT);
        return this;
    }

    public DatastoreWhereInput freeBytesGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FREE_BYTES_GT);
        return this;
    }

    public void setFreeBytesGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FREE_BYTES_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FREE_BYTES_GT);
        }
    }

    public boolean getFreeBytesGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FREE_BYTES_GT);
    }

    public DatastoreWhereInput freeBytesGte(Long freeBytesGte) {

        this.freeBytesGte = freeBytesGte;
        return this;
    }

    /**
     * Get freeBytesGte
     *
     * @return freeBytesGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getFreeBytesGte() {
        return freeBytesGte;
    }

    public void setFreeBytesGte(Long freeBytesGte) {
        this.freeBytesGte = freeBytesGte;
    }

    public DatastoreWhereInput freeBytesGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FREE_BYTES_GTE);
        return this;
    }

    public DatastoreWhereInput freeBytesGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FREE_BYTES_GTE);
        return this;
    }

    public void setFreeBytesGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FREE_BYTES_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FREE_BYTES_GTE);
        }
    }

    public boolean getFreeBytesGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FREE_BYTES_GTE);
    }

    public DatastoreWhereInput freeBytesIn(List<Long> freeBytesIn) {

        this.freeBytesIn = freeBytesIn;
        return this;
    }

    public DatastoreWhereInput addFreeBytesInItem(Long freeBytesInItem) {
        if (this.freeBytesIn == null) {
            this.freeBytesIn = new ArrayList<Long>();
        }
        this.freeBytesIn.add(freeBytesInItem);
        return this;
    }

    /**
     * Get freeBytesIn
     *
     * @return freeBytesIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getFreeBytesIn() {
        return freeBytesIn;
    }

    public void setFreeBytesIn(List<Long> freeBytesIn) {
        this.freeBytesIn = freeBytesIn;
    }

    public DatastoreWhereInput freeBytesIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FREE_BYTES_IN);
        return this;
    }

    public DatastoreWhereInput freeBytesIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FREE_BYTES_IN);
        return this;
    }

    public void setFreeBytesIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FREE_BYTES_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FREE_BYTES_IN);
        }
    }

    public boolean getFreeBytesIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FREE_BYTES_IN);
    }

    public DatastoreWhereInput freeBytesLt(Long freeBytesLt) {

        this.freeBytesLt = freeBytesLt;
        return this;
    }

    /**
     * Get freeBytesLt
     *
     * @return freeBytesLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getFreeBytesLt() {
        return freeBytesLt;
    }

    public void setFreeBytesLt(Long freeBytesLt) {
        this.freeBytesLt = freeBytesLt;
    }

    public DatastoreWhereInput freeBytesLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FREE_BYTES_LT);
        return this;
    }

    public DatastoreWhereInput freeBytesLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FREE_BYTES_LT);
        return this;
    }

    public void setFreeBytesLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FREE_BYTES_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FREE_BYTES_LT);
        }
    }

    public boolean getFreeBytesLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FREE_BYTES_LT);
    }

    public DatastoreWhereInput freeBytesLte(Long freeBytesLte) {

        this.freeBytesLte = freeBytesLte;
        return this;
    }

    /**
     * Get freeBytesLte
     *
     * @return freeBytesLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getFreeBytesLte() {
        return freeBytesLte;
    }

    public void setFreeBytesLte(Long freeBytesLte) {
        this.freeBytesLte = freeBytesLte;
    }

    public DatastoreWhereInput freeBytesLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FREE_BYTES_LTE);
        return this;
    }

    public DatastoreWhereInput freeBytesLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FREE_BYTES_LTE);
        return this;
    }

    public void setFreeBytesLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FREE_BYTES_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FREE_BYTES_LTE);
        }
    }

    public boolean getFreeBytesLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FREE_BYTES_LTE);
    }

    public DatastoreWhereInput freeBytesNot(Long freeBytesNot) {

        this.freeBytesNot = freeBytesNot;
        return this;
    }

    /**
     * Get freeBytesNot
     *
     * @return freeBytesNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getFreeBytesNot() {
        return freeBytesNot;
    }

    public void setFreeBytesNot(Long freeBytesNot) {
        this.freeBytesNot = freeBytesNot;
    }

    public DatastoreWhereInput freeBytesNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FREE_BYTES_NOT);
        return this;
    }

    public DatastoreWhereInput freeBytesNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FREE_BYTES_NOT);
        return this;
    }

    public void setFreeBytesNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FREE_BYTES_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FREE_BYTES_NOT);
        }
    }

    public boolean getFreeBytesNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FREE_BYTES_NOT);
    }

    public DatastoreWhereInput freeBytesNotIn(List<Long> freeBytesNotIn) {

        this.freeBytesNotIn = freeBytesNotIn;
        return this;
    }

    public DatastoreWhereInput addFreeBytesNotInItem(Long freeBytesNotInItem) {
        if (this.freeBytesNotIn == null) {
            this.freeBytesNotIn = new ArrayList<Long>();
        }
        this.freeBytesNotIn.add(freeBytesNotInItem);
        return this;
    }

    /**
     * Get freeBytesNotIn
     *
     * @return freeBytesNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getFreeBytesNotIn() {
        return freeBytesNotIn;
    }

    public void setFreeBytesNotIn(List<Long> freeBytesNotIn) {
        this.freeBytesNotIn = freeBytesNotIn;
    }

    public DatastoreWhereInput freeBytesNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FREE_BYTES_NOT_IN);
        return this;
    }

    public DatastoreWhereInput freeBytesNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FREE_BYTES_NOT_IN);
        return this;
    }

    public void setFreeBytesNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FREE_BYTES_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FREE_BYTES_NOT_IN);
        }
    }

    public boolean getFreeBytesNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FREE_BYTES_NOT_IN);
    }

    public DatastoreWhereInput id(String id) {

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

    public DatastoreWhereInput id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public DatastoreWhereInput id_ExplictlyNonNull() {
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

    public DatastoreWhereInput idContains(String idContains) {

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

    public DatastoreWhereInput idContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_CONTAINS);
        return this;
    }

    public DatastoreWhereInput idContains_ExplictlyNonNull() {
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

    public DatastoreWhereInput idEndsWith(String idEndsWith) {

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

    public DatastoreWhereInput idEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_ENDS_WITH);
        return this;
    }

    public DatastoreWhereInput idEndsWith_ExplictlyNonNull() {
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

    public DatastoreWhereInput idGt(String idGt) {

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

    public DatastoreWhereInput idGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GT);
        return this;
    }

    public DatastoreWhereInput idGt_ExplictlyNonNull() {
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

    public DatastoreWhereInput idGte(String idGte) {

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

    public DatastoreWhereInput idGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GTE);
        return this;
    }

    public DatastoreWhereInput idGte_ExplictlyNonNull() {
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

    public DatastoreWhereInput idIn(List<String> idIn) {

        this.idIn = idIn;
        return this;
    }

    public DatastoreWhereInput addIdInItem(String idInItem) {
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

    public DatastoreWhereInput idIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_IN);
        return this;
    }

    public DatastoreWhereInput idIn_ExplictlyNonNull() {
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

    public DatastoreWhereInput idLt(String idLt) {

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

    public DatastoreWhereInput idLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LT);
        return this;
    }

    public DatastoreWhereInput idLt_ExplictlyNonNull() {
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

    public DatastoreWhereInput idLte(String idLte) {

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

    public DatastoreWhereInput idLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LTE);
        return this;
    }

    public DatastoreWhereInput idLte_ExplictlyNonNull() {
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

    public DatastoreWhereInput idNot(String idNot) {

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

    public DatastoreWhereInput idNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT);
        return this;
    }

    public DatastoreWhereInput idNot_ExplictlyNonNull() {
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

    public DatastoreWhereInput idNotContains(String idNotContains) {

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

    public DatastoreWhereInput idNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_CONTAINS);
        return this;
    }

    public DatastoreWhereInput idNotContains_ExplictlyNonNull() {
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

    public DatastoreWhereInput idNotEndsWith(String idNotEndsWith) {

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

    public DatastoreWhereInput idNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
        return this;
    }

    public DatastoreWhereInput idNotEndsWith_ExplictlyNonNull() {
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

    public DatastoreWhereInput idNotIn(List<String> idNotIn) {

        this.idNotIn = idNotIn;
        return this;
    }

    public DatastoreWhereInput addIdNotInItem(String idNotInItem) {
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

    public DatastoreWhereInput idNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_IN);
        return this;
    }

    public DatastoreWhereInput idNotIn_ExplictlyNonNull() {
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

    public DatastoreWhereInput idNotStartsWith(String idNotStartsWith) {

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

    public DatastoreWhereInput idNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
        return this;
    }

    public DatastoreWhereInput idNotStartsWith_ExplictlyNonNull() {
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

    public DatastoreWhereInput idStartsWith(String idStartsWith) {

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

    public DatastoreWhereInput idStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_STARTS_WITH);
        return this;
    }

    public DatastoreWhereInput idStartsWith_ExplictlyNonNull() {
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

    public DatastoreWhereInput labelsEvery(LabelWhereInput labelsEvery) {

        this.labelsEvery = labelsEvery;
        return this;
    }

    /**
     * Get labelsEvery
     *
     * @return labelsEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public LabelWhereInput getLabelsEvery() {
        return labelsEvery;
    }

    public void setLabelsEvery(LabelWhereInput labelsEvery) {
        this.labelsEvery = labelsEvery;
    }

    public DatastoreWhereInput labelsEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LABELS_EVERY);
        return this;
    }

    public DatastoreWhereInput labelsEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LABELS_EVERY);
        return this;
    }

    public void setLabelsEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LABELS_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LABELS_EVERY);
        }
    }

    public boolean getLabelsEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LABELS_EVERY);
    }

    public DatastoreWhereInput labelsNone(LabelWhereInput labelsNone) {

        this.labelsNone = labelsNone;
        return this;
    }

    /**
     * Get labelsNone
     *
     * @return labelsNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public LabelWhereInput getLabelsNone() {
        return labelsNone;
    }

    public void setLabelsNone(LabelWhereInput labelsNone) {
        this.labelsNone = labelsNone;
    }

    public DatastoreWhereInput labelsNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LABELS_NONE);
        return this;
    }

    public DatastoreWhereInput labelsNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LABELS_NONE);
        return this;
    }

    public void setLabelsNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LABELS_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LABELS_NONE);
        }
    }

    public boolean getLabelsNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LABELS_NONE);
    }

    public DatastoreWhereInput labelsSome(LabelWhereInput labelsSome) {

        this.labelsSome = labelsSome;
        return this;
    }

    /**
     * Get labelsSome
     *
     * @return labelsSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public LabelWhereInput getLabelsSome() {
        return labelsSome;
    }

    public void setLabelsSome(LabelWhereInput labelsSome) {
        this.labelsSome = labelsSome;
    }

    public DatastoreWhereInput labelsSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LABELS_SOME);
        return this;
    }

    public DatastoreWhereInput labelsSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LABELS_SOME);
        return this;
    }

    public void setLabelsSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LABELS_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LABELS_SOME);
        }
    }

    public boolean getLabelsSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LABELS_SOME);
    }

    public DatastoreWhereInput localHash(String localHash) {

        this.localHash = localHash;
        return this;
    }

    /**
     * Get localHash
     *
     * @return localHash
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalHash() {
        return localHash;
    }

    public void setLocalHash(String localHash) {
        this.localHash = localHash;
    }

    public DatastoreWhereInput localHash_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_HASH);
        return this;
    }

    public DatastoreWhereInput localHash_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_HASH);
        return this;
    }

    public void setLocalHash_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_HASH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_HASH);
        }
    }

    public boolean getLocalHash_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_HASH);
    }

    public DatastoreWhereInput localHashContains(String localHashContains) {

        this.localHashContains = localHashContains;
        return this;
    }

    /**
     * Get localHashContains
     *
     * @return localHashContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalHashContains() {
        return localHashContains;
    }

    public void setLocalHashContains(String localHashContains) {
        this.localHashContains = localHashContains;
    }

    public DatastoreWhereInput localHashContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_HASH_CONTAINS);
        return this;
    }

    public DatastoreWhereInput localHashContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_HASH_CONTAINS);
        return this;
    }

    public void setLocalHashContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_HASH_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_HASH_CONTAINS);
        }
    }

    public boolean getLocalHashContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_HASH_CONTAINS);
    }

    public DatastoreWhereInput localHashEndsWith(String localHashEndsWith) {

        this.localHashEndsWith = localHashEndsWith;
        return this;
    }

    /**
     * Get localHashEndsWith
     *
     * @return localHashEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalHashEndsWith() {
        return localHashEndsWith;
    }

    public void setLocalHashEndsWith(String localHashEndsWith) {
        this.localHashEndsWith = localHashEndsWith;
    }

    public DatastoreWhereInput localHashEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_HASH_ENDS_WITH);
        return this;
    }

    public DatastoreWhereInput localHashEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_HASH_ENDS_WITH);
        return this;
    }

    public void setLocalHashEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_HASH_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_HASH_ENDS_WITH);
        }
    }

    public boolean getLocalHashEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_HASH_ENDS_WITH);
    }

    public DatastoreWhereInput localHashGt(String localHashGt) {

        this.localHashGt = localHashGt;
        return this;
    }

    /**
     * Get localHashGt
     *
     * @return localHashGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalHashGt() {
        return localHashGt;
    }

    public void setLocalHashGt(String localHashGt) {
        this.localHashGt = localHashGt;
    }

    public DatastoreWhereInput localHashGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_HASH_GT);
        return this;
    }

    public DatastoreWhereInput localHashGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_HASH_GT);
        return this;
    }

    public void setLocalHashGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_HASH_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_HASH_GT);
        }
    }

    public boolean getLocalHashGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_HASH_GT);
    }

    public DatastoreWhereInput localHashGte(String localHashGte) {

        this.localHashGte = localHashGte;
        return this;
    }

    /**
     * Get localHashGte
     *
     * @return localHashGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalHashGte() {
        return localHashGte;
    }

    public void setLocalHashGte(String localHashGte) {
        this.localHashGte = localHashGte;
    }

    public DatastoreWhereInput localHashGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_HASH_GTE);
        return this;
    }

    public DatastoreWhereInput localHashGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_HASH_GTE);
        return this;
    }

    public void setLocalHashGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_HASH_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_HASH_GTE);
        }
    }

    public boolean getLocalHashGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_HASH_GTE);
    }

    public DatastoreWhereInput localHashIn(List<String> localHashIn) {

        this.localHashIn = localHashIn;
        return this;
    }

    public DatastoreWhereInput addLocalHashInItem(String localHashInItem) {
        if (this.localHashIn == null) {
            this.localHashIn = new ArrayList<String>();
        }
        this.localHashIn.add(localHashInItem);
        return this;
    }

    /**
     * Get localHashIn
     *
     * @return localHashIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getLocalHashIn() {
        return localHashIn;
    }

    public void setLocalHashIn(List<String> localHashIn) {
        this.localHashIn = localHashIn;
    }

    public DatastoreWhereInput localHashIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_HASH_IN);
        return this;
    }

    public DatastoreWhereInput localHashIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_HASH_IN);
        return this;
    }

    public void setLocalHashIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_HASH_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_HASH_IN);
        }
    }

    public boolean getLocalHashIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_HASH_IN);
    }

    public DatastoreWhereInput localHashLt(String localHashLt) {

        this.localHashLt = localHashLt;
        return this;
    }

    /**
     * Get localHashLt
     *
     * @return localHashLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalHashLt() {
        return localHashLt;
    }

    public void setLocalHashLt(String localHashLt) {
        this.localHashLt = localHashLt;
    }

    public DatastoreWhereInput localHashLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_HASH_LT);
        return this;
    }

    public DatastoreWhereInput localHashLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_HASH_LT);
        return this;
    }

    public void setLocalHashLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_HASH_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_HASH_LT);
        }
    }

    public boolean getLocalHashLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_HASH_LT);
    }

    public DatastoreWhereInput localHashLte(String localHashLte) {

        this.localHashLte = localHashLte;
        return this;
    }

    /**
     * Get localHashLte
     *
     * @return localHashLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalHashLte() {
        return localHashLte;
    }

    public void setLocalHashLte(String localHashLte) {
        this.localHashLte = localHashLte;
    }

    public DatastoreWhereInput localHashLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_HASH_LTE);
        return this;
    }

    public DatastoreWhereInput localHashLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_HASH_LTE);
        return this;
    }

    public void setLocalHashLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_HASH_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_HASH_LTE);
        }
    }

    public boolean getLocalHashLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_HASH_LTE);
    }

    public DatastoreWhereInput localHashNot(String localHashNot) {

        this.localHashNot = localHashNot;
        return this;
    }

    /**
     * Get localHashNot
     *
     * @return localHashNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalHashNot() {
        return localHashNot;
    }

    public void setLocalHashNot(String localHashNot) {
        this.localHashNot = localHashNot;
    }

    public DatastoreWhereInput localHashNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_HASH_NOT);
        return this;
    }

    public DatastoreWhereInput localHashNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_HASH_NOT);
        return this;
    }

    public void setLocalHashNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_HASH_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_HASH_NOT);
        }
    }

    public boolean getLocalHashNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_HASH_NOT);
    }

    public DatastoreWhereInput localHashNotContains(String localHashNotContains) {

        this.localHashNotContains = localHashNotContains;
        return this;
    }

    /**
     * Get localHashNotContains
     *
     * @return localHashNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalHashNotContains() {
        return localHashNotContains;
    }

    public void setLocalHashNotContains(String localHashNotContains) {
        this.localHashNotContains = localHashNotContains;
    }

    public DatastoreWhereInput localHashNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_HASH_NOT_CONTAINS);
        return this;
    }

    public DatastoreWhereInput localHashNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_HASH_NOT_CONTAINS);
        return this;
    }

    public void setLocalHashNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_HASH_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_HASH_NOT_CONTAINS);
        }
    }

    public boolean getLocalHashNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_HASH_NOT_CONTAINS);
    }

    public DatastoreWhereInput localHashNotEndsWith(String localHashNotEndsWith) {

        this.localHashNotEndsWith = localHashNotEndsWith;
        return this;
    }

    /**
     * Get localHashNotEndsWith
     *
     * @return localHashNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalHashNotEndsWith() {
        return localHashNotEndsWith;
    }

    public void setLocalHashNotEndsWith(String localHashNotEndsWith) {
        this.localHashNotEndsWith = localHashNotEndsWith;
    }

    public DatastoreWhereInput localHashNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_HASH_NOT_ENDS_WITH);
        return this;
    }

    public DatastoreWhereInput localHashNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_HASH_NOT_ENDS_WITH);
        return this;
    }

    public void setLocalHashNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_HASH_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_HASH_NOT_ENDS_WITH);
        }
    }

    public boolean getLocalHashNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_HASH_NOT_ENDS_WITH);
    }

    public DatastoreWhereInput localHashNotIn(List<String> localHashNotIn) {

        this.localHashNotIn = localHashNotIn;
        return this;
    }

    public DatastoreWhereInput addLocalHashNotInItem(String localHashNotInItem) {
        if (this.localHashNotIn == null) {
            this.localHashNotIn = new ArrayList<String>();
        }
        this.localHashNotIn.add(localHashNotInItem);
        return this;
    }

    /**
     * Get localHashNotIn
     *
     * @return localHashNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getLocalHashNotIn() {
        return localHashNotIn;
    }

    public void setLocalHashNotIn(List<String> localHashNotIn) {
        this.localHashNotIn = localHashNotIn;
    }

    public DatastoreWhereInput localHashNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_HASH_NOT_IN);
        return this;
    }

    public DatastoreWhereInput localHashNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_HASH_NOT_IN);
        return this;
    }

    public void setLocalHashNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_HASH_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_HASH_NOT_IN);
        }
    }

    public boolean getLocalHashNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_HASH_NOT_IN);
    }

    public DatastoreWhereInput localHashNotStartsWith(String localHashNotStartsWith) {

        this.localHashNotStartsWith = localHashNotStartsWith;
        return this;
    }

    /**
     * Get localHashNotStartsWith
     *
     * @return localHashNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalHashNotStartsWith() {
        return localHashNotStartsWith;
    }

    public void setLocalHashNotStartsWith(String localHashNotStartsWith) {
        this.localHashNotStartsWith = localHashNotStartsWith;
    }

    public DatastoreWhereInput localHashNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_HASH_NOT_STARTS_WITH);
        return this;
    }

    public DatastoreWhereInput localHashNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_HASH_NOT_STARTS_WITH);
        return this;
    }

    public void setLocalHashNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_HASH_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_HASH_NOT_STARTS_WITH);
        }
    }

    public boolean getLocalHashNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_HASH_NOT_STARTS_WITH);
    }

    public DatastoreWhereInput localHashStartsWith(String localHashStartsWith) {

        this.localHashStartsWith = localHashStartsWith;
        return this;
    }

    /**
     * Get localHashStartsWith
     *
     * @return localHashStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getLocalHashStartsWith() {
        return localHashStartsWith;
    }

    public void setLocalHashStartsWith(String localHashStartsWith) {
        this.localHashStartsWith = localHashStartsWith;
    }

    public DatastoreWhereInput localHashStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_HASH_STARTS_WITH);
        return this;
    }

    public DatastoreWhereInput localHashStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_LOCAL_HASH_STARTS_WITH);
        return this;
    }

    public void setLocalHashStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_LOCAL_HASH_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_LOCAL_HASH_STARTS_WITH);
        }
    }

    public boolean getLocalHashStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_LOCAL_HASH_STARTS_WITH);
    }

    public DatastoreWhereInput localId(String localId) {

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

    public DatastoreWhereInput localId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID);
        return this;
    }

    public DatastoreWhereInput localId_ExplictlyNonNull() {
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

    public DatastoreWhereInput localIdContains(String localIdContains) {

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

    public DatastoreWhereInput localIdContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_CONTAINS);
        return this;
    }

    public DatastoreWhereInput localIdContains_ExplictlyNonNull() {
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

    public DatastoreWhereInput localIdEndsWith(String localIdEndsWith) {

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

    public DatastoreWhereInput localIdEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_ENDS_WITH);
        return this;
    }

    public DatastoreWhereInput localIdEndsWith_ExplictlyNonNull() {
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

    public DatastoreWhereInput localIdGt(String localIdGt) {

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

    public DatastoreWhereInput localIdGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_GT);
        return this;
    }

    public DatastoreWhereInput localIdGt_ExplictlyNonNull() {
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

    public DatastoreWhereInput localIdGte(String localIdGte) {

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

    public DatastoreWhereInput localIdGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_GTE);
        return this;
    }

    public DatastoreWhereInput localIdGte_ExplictlyNonNull() {
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

    public DatastoreWhereInput localIdIn(List<String> localIdIn) {

        this.localIdIn = localIdIn;
        return this;
    }

    public DatastoreWhereInput addLocalIdInItem(String localIdInItem) {
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

    public DatastoreWhereInput localIdIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_IN);
        return this;
    }

    public DatastoreWhereInput localIdIn_ExplictlyNonNull() {
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

    public DatastoreWhereInput localIdLt(String localIdLt) {

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

    public DatastoreWhereInput localIdLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_LT);
        return this;
    }

    public DatastoreWhereInput localIdLt_ExplictlyNonNull() {
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

    public DatastoreWhereInput localIdLte(String localIdLte) {

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

    public DatastoreWhereInput localIdLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_LTE);
        return this;
    }

    public DatastoreWhereInput localIdLte_ExplictlyNonNull() {
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

    public DatastoreWhereInput localIdNot(String localIdNot) {

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

    public DatastoreWhereInput localIdNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT);
        return this;
    }

    public DatastoreWhereInput localIdNot_ExplictlyNonNull() {
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

    public DatastoreWhereInput localIdNotContains(String localIdNotContains) {

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

    public DatastoreWhereInput localIdNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_CONTAINS);
        return this;
    }

    public DatastoreWhereInput localIdNotContains_ExplictlyNonNull() {
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

    public DatastoreWhereInput localIdNotEndsWith(String localIdNotEndsWith) {

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

    public DatastoreWhereInput localIdNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_ENDS_WITH);
        return this;
    }

    public DatastoreWhereInput localIdNotEndsWith_ExplictlyNonNull() {
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

    public DatastoreWhereInput localIdNotIn(List<String> localIdNotIn) {

        this.localIdNotIn = localIdNotIn;
        return this;
    }

    public DatastoreWhereInput addLocalIdNotInItem(String localIdNotInItem) {
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

    public DatastoreWhereInput localIdNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_IN);
        return this;
    }

    public DatastoreWhereInput localIdNotIn_ExplictlyNonNull() {
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

    public DatastoreWhereInput localIdNotStartsWith(String localIdNotStartsWith) {

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

    public DatastoreWhereInput localIdNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_STARTS_WITH);
        return this;
    }

    public DatastoreWhereInput localIdNotStartsWith_ExplictlyNonNull() {
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

    public DatastoreWhereInput localIdStartsWith(String localIdStartsWith) {

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

    public DatastoreWhereInput localIdStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_STARTS_WITH);
        return this;
    }

    public DatastoreWhereInput localIdStartsWith_ExplictlyNonNull() {
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

    public DatastoreWhereInput modifiedTime(String modifiedTime) {

        this.modifiedTime = modifiedTime;
        return this;
    }

    /**
     * Get modifiedTime
     *
     * @return modifiedTime
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(String modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    public DatastoreWhereInput modifiedTime_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MODIFIED_TIME);
        return this;
    }

    public DatastoreWhereInput modifiedTime_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MODIFIED_TIME);
        return this;
    }

    public void setModifiedTime_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MODIFIED_TIME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MODIFIED_TIME);
        }
    }

    public boolean getModifiedTime_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MODIFIED_TIME);
    }

    public DatastoreWhereInput modifiedTimeGt(String modifiedTimeGt) {

        this.modifiedTimeGt = modifiedTimeGt;
        return this;
    }

    /**
     * Get modifiedTimeGt
     *
     * @return modifiedTimeGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getModifiedTimeGt() {
        return modifiedTimeGt;
    }

    public void setModifiedTimeGt(String modifiedTimeGt) {
        this.modifiedTimeGt = modifiedTimeGt;
    }

    public DatastoreWhereInput modifiedTimeGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MODIFIED_TIME_GT);
        return this;
    }

    public DatastoreWhereInput modifiedTimeGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MODIFIED_TIME_GT);
        return this;
    }

    public void setModifiedTimeGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MODIFIED_TIME_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MODIFIED_TIME_GT);
        }
    }

    public boolean getModifiedTimeGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MODIFIED_TIME_GT);
    }

    public DatastoreWhereInput modifiedTimeGte(String modifiedTimeGte) {

        this.modifiedTimeGte = modifiedTimeGte;
        return this;
    }

    /**
     * Get modifiedTimeGte
     *
     * @return modifiedTimeGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getModifiedTimeGte() {
        return modifiedTimeGte;
    }

    public void setModifiedTimeGte(String modifiedTimeGte) {
        this.modifiedTimeGte = modifiedTimeGte;
    }

    public DatastoreWhereInput modifiedTimeGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MODIFIED_TIME_GTE);
        return this;
    }

    public DatastoreWhereInput modifiedTimeGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MODIFIED_TIME_GTE);
        return this;
    }

    public void setModifiedTimeGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MODIFIED_TIME_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MODIFIED_TIME_GTE);
        }
    }

    public boolean getModifiedTimeGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MODIFIED_TIME_GTE);
    }

    public DatastoreWhereInput modifiedTimeIn(List<String> modifiedTimeIn) {

        this.modifiedTimeIn = modifiedTimeIn;
        return this;
    }

    public DatastoreWhereInput addModifiedTimeInItem(String modifiedTimeInItem) {
        if (this.modifiedTimeIn == null) {
            this.modifiedTimeIn = new ArrayList<String>();
        }
        this.modifiedTimeIn.add(modifiedTimeInItem);
        return this;
    }

    /**
     * Get modifiedTimeIn
     *
     * @return modifiedTimeIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getModifiedTimeIn() {
        return modifiedTimeIn;
    }

    public void setModifiedTimeIn(List<String> modifiedTimeIn) {
        this.modifiedTimeIn = modifiedTimeIn;
    }

    public DatastoreWhereInput modifiedTimeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MODIFIED_TIME_IN);
        return this;
    }

    public DatastoreWhereInput modifiedTimeIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MODIFIED_TIME_IN);
        return this;
    }

    public void setModifiedTimeIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MODIFIED_TIME_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MODIFIED_TIME_IN);
        }
    }

    public boolean getModifiedTimeIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MODIFIED_TIME_IN);
    }

    public DatastoreWhereInput modifiedTimeLt(String modifiedTimeLt) {

        this.modifiedTimeLt = modifiedTimeLt;
        return this;
    }

    /**
     * Get modifiedTimeLt
     *
     * @return modifiedTimeLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getModifiedTimeLt() {
        return modifiedTimeLt;
    }

    public void setModifiedTimeLt(String modifiedTimeLt) {
        this.modifiedTimeLt = modifiedTimeLt;
    }

    public DatastoreWhereInput modifiedTimeLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MODIFIED_TIME_LT);
        return this;
    }

    public DatastoreWhereInput modifiedTimeLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MODIFIED_TIME_LT);
        return this;
    }

    public void setModifiedTimeLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MODIFIED_TIME_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MODIFIED_TIME_LT);
        }
    }

    public boolean getModifiedTimeLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MODIFIED_TIME_LT);
    }

    public DatastoreWhereInput modifiedTimeLte(String modifiedTimeLte) {

        this.modifiedTimeLte = modifiedTimeLte;
        return this;
    }

    /**
     * Get modifiedTimeLte
     *
     * @return modifiedTimeLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getModifiedTimeLte() {
        return modifiedTimeLte;
    }

    public void setModifiedTimeLte(String modifiedTimeLte) {
        this.modifiedTimeLte = modifiedTimeLte;
    }

    public DatastoreWhereInput modifiedTimeLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MODIFIED_TIME_LTE);
        return this;
    }

    public DatastoreWhereInput modifiedTimeLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MODIFIED_TIME_LTE);
        return this;
    }

    public void setModifiedTimeLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MODIFIED_TIME_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MODIFIED_TIME_LTE);
        }
    }

    public boolean getModifiedTimeLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MODIFIED_TIME_LTE);
    }

    public DatastoreWhereInput modifiedTimeNot(String modifiedTimeNot) {

        this.modifiedTimeNot = modifiedTimeNot;
        return this;
    }

    /**
     * Get modifiedTimeNot
     *
     * @return modifiedTimeNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getModifiedTimeNot() {
        return modifiedTimeNot;
    }

    public void setModifiedTimeNot(String modifiedTimeNot) {
        this.modifiedTimeNot = modifiedTimeNot;
    }

    public DatastoreWhereInput modifiedTimeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MODIFIED_TIME_NOT);
        return this;
    }

    public DatastoreWhereInput modifiedTimeNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MODIFIED_TIME_NOT);
        return this;
    }

    public void setModifiedTimeNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MODIFIED_TIME_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MODIFIED_TIME_NOT);
        }
    }

    public boolean getModifiedTimeNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MODIFIED_TIME_NOT);
    }

    public DatastoreWhereInput modifiedTimeNotIn(List<String> modifiedTimeNotIn) {

        this.modifiedTimeNotIn = modifiedTimeNotIn;
        return this;
    }

    public DatastoreWhereInput addModifiedTimeNotInItem(String modifiedTimeNotInItem) {
        if (this.modifiedTimeNotIn == null) {
            this.modifiedTimeNotIn = new ArrayList<String>();
        }
        this.modifiedTimeNotIn.add(modifiedTimeNotInItem);
        return this;
    }

    /**
     * Get modifiedTimeNotIn
     *
     * @return modifiedTimeNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getModifiedTimeNotIn() {
        return modifiedTimeNotIn;
    }

    public void setModifiedTimeNotIn(List<String> modifiedTimeNotIn) {
        this.modifiedTimeNotIn = modifiedTimeNotIn;
    }

    public DatastoreWhereInput modifiedTimeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MODIFIED_TIME_NOT_IN);
        return this;
    }

    public DatastoreWhereInput modifiedTimeNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MODIFIED_TIME_NOT_IN);
        return this;
    }

    public void setModifiedTimeNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MODIFIED_TIME_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MODIFIED_TIME_NOT_IN);
        }
    }

    public boolean getModifiedTimeNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MODIFIED_TIME_NOT_IN);
    }

    public DatastoreWhereInput name(String name) {

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

    public DatastoreWhereInput name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public DatastoreWhereInput name_ExplictlyNonNull() {
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

    public DatastoreWhereInput nameContains(String nameContains) {

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

    public DatastoreWhereInput nameContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_CONTAINS);
        return this;
    }

    public DatastoreWhereInput nameContains_ExplictlyNonNull() {
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

    public DatastoreWhereInput nameEndsWith(String nameEndsWith) {

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

    public DatastoreWhereInput nameEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_ENDS_WITH);
        return this;
    }

    public DatastoreWhereInput nameEndsWith_ExplictlyNonNull() {
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

    public DatastoreWhereInput nameGt(String nameGt) {

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

    public DatastoreWhereInput nameGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_GT);
        return this;
    }

    public DatastoreWhereInput nameGt_ExplictlyNonNull() {
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

    public DatastoreWhereInput nameGte(String nameGte) {

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

    public DatastoreWhereInput nameGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_GTE);
        return this;
    }

    public DatastoreWhereInput nameGte_ExplictlyNonNull() {
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

    public DatastoreWhereInput nameIn(List<String> nameIn) {

        this.nameIn = nameIn;
        return this;
    }

    public DatastoreWhereInput addNameInItem(String nameInItem) {
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

    public DatastoreWhereInput nameIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_IN);
        return this;
    }

    public DatastoreWhereInput nameIn_ExplictlyNonNull() {
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

    public DatastoreWhereInput nameLt(String nameLt) {

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

    public DatastoreWhereInput nameLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_LT);
        return this;
    }

    public DatastoreWhereInput nameLt_ExplictlyNonNull() {
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

    public DatastoreWhereInput nameLte(String nameLte) {

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

    public DatastoreWhereInput nameLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_LTE);
        return this;
    }

    public DatastoreWhereInput nameLte_ExplictlyNonNull() {
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

    public DatastoreWhereInput nameNot(String nameNot) {

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

    public DatastoreWhereInput nameNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT);
        return this;
    }

    public DatastoreWhereInput nameNot_ExplictlyNonNull() {
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

    public DatastoreWhereInput nameNotContains(String nameNotContains) {

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

    public DatastoreWhereInput nameNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_CONTAINS);
        return this;
    }

    public DatastoreWhereInput nameNotContains_ExplictlyNonNull() {
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

    public DatastoreWhereInput nameNotEndsWith(String nameNotEndsWith) {

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

    public DatastoreWhereInput nameNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_ENDS_WITH);
        return this;
    }

    public DatastoreWhereInput nameNotEndsWith_ExplictlyNonNull() {
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

    public DatastoreWhereInput nameNotIn(List<String> nameNotIn) {

        this.nameNotIn = nameNotIn;
        return this;
    }

    public DatastoreWhereInput addNameNotInItem(String nameNotInItem) {
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

    public DatastoreWhereInput nameNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_IN);
        return this;
    }

    public DatastoreWhereInput nameNotIn_ExplictlyNonNull() {
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

    public DatastoreWhereInput nameNotStartsWith(String nameNotStartsWith) {

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

    public DatastoreWhereInput nameNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_STARTS_WITH);
        return this;
    }

    public DatastoreWhereInput nameNotStartsWith_ExplictlyNonNull() {
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

    public DatastoreWhereInput nameStartsWith(String nameStartsWith) {

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

    public DatastoreWhereInput nameStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_STARTS_WITH);
        return this;
    }

    public DatastoreWhereInput nameStartsWith_ExplictlyNonNull() {
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

    public DatastoreWhereInput recyclePolicy(String recyclePolicy) {

        this.recyclePolicy = recyclePolicy;
        return this;
    }

    /**
     * Get recyclePolicy
     *
     * @return recyclePolicy
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getRecyclePolicy() {
        return recyclePolicy;
    }

    public void setRecyclePolicy(String recyclePolicy) {
        this.recyclePolicy = recyclePolicy;
    }

    public DatastoreWhereInput recyclePolicy_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RECYCLE_POLICY);
        return this;
    }

    public DatastoreWhereInput recyclePolicy_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RECYCLE_POLICY);
        return this;
    }

    public void setRecyclePolicy_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RECYCLE_POLICY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RECYCLE_POLICY);
        }
    }

    public boolean getRecyclePolicy_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RECYCLE_POLICY);
    }

    public DatastoreWhereInput recyclePolicyContains(String recyclePolicyContains) {

        this.recyclePolicyContains = recyclePolicyContains;
        return this;
    }

    /**
     * Get recyclePolicyContains
     *
     * @return recyclePolicyContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getRecyclePolicyContains() {
        return recyclePolicyContains;
    }

    public void setRecyclePolicyContains(String recyclePolicyContains) {
        this.recyclePolicyContains = recyclePolicyContains;
    }

    public DatastoreWhereInput recyclePolicyContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RECYCLE_POLICY_CONTAINS);
        return this;
    }

    public DatastoreWhereInput recyclePolicyContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RECYCLE_POLICY_CONTAINS);
        return this;
    }

    public void setRecyclePolicyContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RECYCLE_POLICY_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RECYCLE_POLICY_CONTAINS);
        }
    }

    public boolean getRecyclePolicyContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RECYCLE_POLICY_CONTAINS);
    }

    public DatastoreWhereInput recyclePolicyEndsWith(String recyclePolicyEndsWith) {

        this.recyclePolicyEndsWith = recyclePolicyEndsWith;
        return this;
    }

    /**
     * Get recyclePolicyEndsWith
     *
     * @return recyclePolicyEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getRecyclePolicyEndsWith() {
        return recyclePolicyEndsWith;
    }

    public void setRecyclePolicyEndsWith(String recyclePolicyEndsWith) {
        this.recyclePolicyEndsWith = recyclePolicyEndsWith;
    }

    public DatastoreWhereInput recyclePolicyEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RECYCLE_POLICY_ENDS_WITH);
        return this;
    }

    public DatastoreWhereInput recyclePolicyEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RECYCLE_POLICY_ENDS_WITH);
        return this;
    }

    public void setRecyclePolicyEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RECYCLE_POLICY_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RECYCLE_POLICY_ENDS_WITH);
        }
    }

    public boolean getRecyclePolicyEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RECYCLE_POLICY_ENDS_WITH);
    }

    public DatastoreWhereInput recyclePolicyGt(String recyclePolicyGt) {

        this.recyclePolicyGt = recyclePolicyGt;
        return this;
    }

    /**
     * Get recyclePolicyGt
     *
     * @return recyclePolicyGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getRecyclePolicyGt() {
        return recyclePolicyGt;
    }

    public void setRecyclePolicyGt(String recyclePolicyGt) {
        this.recyclePolicyGt = recyclePolicyGt;
    }

    public DatastoreWhereInput recyclePolicyGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RECYCLE_POLICY_GT);
        return this;
    }

    public DatastoreWhereInput recyclePolicyGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RECYCLE_POLICY_GT);
        return this;
    }

    public void setRecyclePolicyGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RECYCLE_POLICY_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RECYCLE_POLICY_GT);
        }
    }

    public boolean getRecyclePolicyGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RECYCLE_POLICY_GT);
    }

    public DatastoreWhereInput recyclePolicyGte(String recyclePolicyGte) {

        this.recyclePolicyGte = recyclePolicyGte;
        return this;
    }

    /**
     * Get recyclePolicyGte
     *
     * @return recyclePolicyGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getRecyclePolicyGte() {
        return recyclePolicyGte;
    }

    public void setRecyclePolicyGte(String recyclePolicyGte) {
        this.recyclePolicyGte = recyclePolicyGte;
    }

    public DatastoreWhereInput recyclePolicyGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RECYCLE_POLICY_GTE);
        return this;
    }

    public DatastoreWhereInput recyclePolicyGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RECYCLE_POLICY_GTE);
        return this;
    }

    public void setRecyclePolicyGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RECYCLE_POLICY_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RECYCLE_POLICY_GTE);
        }
    }

    public boolean getRecyclePolicyGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RECYCLE_POLICY_GTE);
    }

    public DatastoreWhereInput recyclePolicyIn(List<String> recyclePolicyIn) {

        this.recyclePolicyIn = recyclePolicyIn;
        return this;
    }

    public DatastoreWhereInput addRecyclePolicyInItem(String recyclePolicyInItem) {
        if (this.recyclePolicyIn == null) {
            this.recyclePolicyIn = new ArrayList<String>();
        }
        this.recyclePolicyIn.add(recyclePolicyInItem);
        return this;
    }

    /**
     * Get recyclePolicyIn
     *
     * @return recyclePolicyIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getRecyclePolicyIn() {
        return recyclePolicyIn;
    }

    public void setRecyclePolicyIn(List<String> recyclePolicyIn) {
        this.recyclePolicyIn = recyclePolicyIn;
    }

    public DatastoreWhereInput recyclePolicyIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RECYCLE_POLICY_IN);
        return this;
    }

    public DatastoreWhereInput recyclePolicyIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RECYCLE_POLICY_IN);
        return this;
    }

    public void setRecyclePolicyIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RECYCLE_POLICY_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RECYCLE_POLICY_IN);
        }
    }

    public boolean getRecyclePolicyIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RECYCLE_POLICY_IN);
    }

    public DatastoreWhereInput recyclePolicyLt(String recyclePolicyLt) {

        this.recyclePolicyLt = recyclePolicyLt;
        return this;
    }

    /**
     * Get recyclePolicyLt
     *
     * @return recyclePolicyLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getRecyclePolicyLt() {
        return recyclePolicyLt;
    }

    public void setRecyclePolicyLt(String recyclePolicyLt) {
        this.recyclePolicyLt = recyclePolicyLt;
    }

    public DatastoreWhereInput recyclePolicyLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RECYCLE_POLICY_LT);
        return this;
    }

    public DatastoreWhereInput recyclePolicyLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RECYCLE_POLICY_LT);
        return this;
    }

    public void setRecyclePolicyLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RECYCLE_POLICY_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RECYCLE_POLICY_LT);
        }
    }

    public boolean getRecyclePolicyLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RECYCLE_POLICY_LT);
    }

    public DatastoreWhereInput recyclePolicyLte(String recyclePolicyLte) {

        this.recyclePolicyLte = recyclePolicyLte;
        return this;
    }

    /**
     * Get recyclePolicyLte
     *
     * @return recyclePolicyLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getRecyclePolicyLte() {
        return recyclePolicyLte;
    }

    public void setRecyclePolicyLte(String recyclePolicyLte) {
        this.recyclePolicyLte = recyclePolicyLte;
    }

    public DatastoreWhereInput recyclePolicyLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RECYCLE_POLICY_LTE);
        return this;
    }

    public DatastoreWhereInput recyclePolicyLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RECYCLE_POLICY_LTE);
        return this;
    }

    public void setRecyclePolicyLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RECYCLE_POLICY_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RECYCLE_POLICY_LTE);
        }
    }

    public boolean getRecyclePolicyLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RECYCLE_POLICY_LTE);
    }

    public DatastoreWhereInput recyclePolicyNot(String recyclePolicyNot) {

        this.recyclePolicyNot = recyclePolicyNot;
        return this;
    }

    /**
     * Get recyclePolicyNot
     *
     * @return recyclePolicyNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getRecyclePolicyNot() {
        return recyclePolicyNot;
    }

    public void setRecyclePolicyNot(String recyclePolicyNot) {
        this.recyclePolicyNot = recyclePolicyNot;
    }

    public DatastoreWhereInput recyclePolicyNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RECYCLE_POLICY_NOT);
        return this;
    }

    public DatastoreWhereInput recyclePolicyNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RECYCLE_POLICY_NOT);
        return this;
    }

    public void setRecyclePolicyNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RECYCLE_POLICY_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RECYCLE_POLICY_NOT);
        }
    }

    public boolean getRecyclePolicyNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RECYCLE_POLICY_NOT);
    }

    public DatastoreWhereInput recyclePolicyNotContains(String recyclePolicyNotContains) {

        this.recyclePolicyNotContains = recyclePolicyNotContains;
        return this;
    }

    /**
     * Get recyclePolicyNotContains
     *
     * @return recyclePolicyNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getRecyclePolicyNotContains() {
        return recyclePolicyNotContains;
    }

    public void setRecyclePolicyNotContains(String recyclePolicyNotContains) {
        this.recyclePolicyNotContains = recyclePolicyNotContains;
    }

    public DatastoreWhereInput recyclePolicyNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RECYCLE_POLICY_NOT_CONTAINS);
        return this;
    }

    public DatastoreWhereInput recyclePolicyNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RECYCLE_POLICY_NOT_CONTAINS);
        return this;
    }

    public void setRecyclePolicyNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RECYCLE_POLICY_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RECYCLE_POLICY_NOT_CONTAINS);
        }
    }

    public boolean getRecyclePolicyNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RECYCLE_POLICY_NOT_CONTAINS);
    }

    public DatastoreWhereInput recyclePolicyNotEndsWith(String recyclePolicyNotEndsWith) {

        this.recyclePolicyNotEndsWith = recyclePolicyNotEndsWith;
        return this;
    }

    /**
     * Get recyclePolicyNotEndsWith
     *
     * @return recyclePolicyNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getRecyclePolicyNotEndsWith() {
        return recyclePolicyNotEndsWith;
    }

    public void setRecyclePolicyNotEndsWith(String recyclePolicyNotEndsWith) {
        this.recyclePolicyNotEndsWith = recyclePolicyNotEndsWith;
    }

    public DatastoreWhereInput recyclePolicyNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RECYCLE_POLICY_NOT_ENDS_WITH);
        return this;
    }

    public DatastoreWhereInput recyclePolicyNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RECYCLE_POLICY_NOT_ENDS_WITH);
        return this;
    }

    public void setRecyclePolicyNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RECYCLE_POLICY_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RECYCLE_POLICY_NOT_ENDS_WITH);
        }
    }

    public boolean getRecyclePolicyNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RECYCLE_POLICY_NOT_ENDS_WITH);
    }

    public DatastoreWhereInput recyclePolicyNotIn(List<String> recyclePolicyNotIn) {

        this.recyclePolicyNotIn = recyclePolicyNotIn;
        return this;
    }

    public DatastoreWhereInput addRecyclePolicyNotInItem(String recyclePolicyNotInItem) {
        if (this.recyclePolicyNotIn == null) {
            this.recyclePolicyNotIn = new ArrayList<String>();
        }
        this.recyclePolicyNotIn.add(recyclePolicyNotInItem);
        return this;
    }

    /**
     * Get recyclePolicyNotIn
     *
     * @return recyclePolicyNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getRecyclePolicyNotIn() {
        return recyclePolicyNotIn;
    }

    public void setRecyclePolicyNotIn(List<String> recyclePolicyNotIn) {
        this.recyclePolicyNotIn = recyclePolicyNotIn;
    }

    public DatastoreWhereInput recyclePolicyNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RECYCLE_POLICY_NOT_IN);
        return this;
    }

    public DatastoreWhereInput recyclePolicyNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RECYCLE_POLICY_NOT_IN);
        return this;
    }

    public void setRecyclePolicyNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RECYCLE_POLICY_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RECYCLE_POLICY_NOT_IN);
        }
    }

    public boolean getRecyclePolicyNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RECYCLE_POLICY_NOT_IN);
    }

    public DatastoreWhereInput recyclePolicyNotStartsWith(String recyclePolicyNotStartsWith) {

        this.recyclePolicyNotStartsWith = recyclePolicyNotStartsWith;
        return this;
    }

    /**
     * Get recyclePolicyNotStartsWith
     *
     * @return recyclePolicyNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getRecyclePolicyNotStartsWith() {
        return recyclePolicyNotStartsWith;
    }

    public void setRecyclePolicyNotStartsWith(String recyclePolicyNotStartsWith) {
        this.recyclePolicyNotStartsWith = recyclePolicyNotStartsWith;
    }

    public DatastoreWhereInput recyclePolicyNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RECYCLE_POLICY_NOT_STARTS_WITH);
        return this;
    }

    public DatastoreWhereInput recyclePolicyNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RECYCLE_POLICY_NOT_STARTS_WITH);
        return this;
    }

    public void setRecyclePolicyNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RECYCLE_POLICY_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RECYCLE_POLICY_NOT_STARTS_WITH);
        }
    }

    public boolean getRecyclePolicyNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RECYCLE_POLICY_NOT_STARTS_WITH);
    }

    public DatastoreWhereInput recyclePolicyStartsWith(String recyclePolicyStartsWith) {

        this.recyclePolicyStartsWith = recyclePolicyStartsWith;
        return this;
    }

    /**
     * Get recyclePolicyStartsWith
     *
     * @return recyclePolicyStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getRecyclePolicyStartsWith() {
        return recyclePolicyStartsWith;
    }

    public void setRecyclePolicyStartsWith(String recyclePolicyStartsWith) {
        this.recyclePolicyStartsWith = recyclePolicyStartsWith;
    }

    public DatastoreWhereInput recyclePolicyStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RECYCLE_POLICY_STARTS_WITH);
        return this;
    }

    public DatastoreWhereInput recyclePolicyStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RECYCLE_POLICY_STARTS_WITH);
        return this;
    }

    public void setRecyclePolicyStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RECYCLE_POLICY_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RECYCLE_POLICY_STARTS_WITH);
        }
    }

    public boolean getRecyclePolicyStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RECYCLE_POLICY_STARTS_WITH);
    }

    public DatastoreWhereInput status(DatastoreStatus status) {

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
    public DatastoreStatus getStatus() {
        return status;
    }

    public void setStatus(DatastoreStatus status) {
        this.status = status;
    }

    public DatastoreWhereInput status_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATUS);
        return this;
    }

    public DatastoreWhereInput status_ExplictlyNonNull() {
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

    public DatastoreWhereInput statusIn(List<DatastoreStatus> statusIn) {

        this.statusIn = statusIn;
        return this;
    }

    public DatastoreWhereInput addStatusInItem(DatastoreStatus statusInItem) {
        if (this.statusIn == null) {
            this.statusIn = new ArrayList<DatastoreStatus>();
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
    public List<DatastoreStatus> getStatusIn() {
        return statusIn;
    }

    public void setStatusIn(List<DatastoreStatus> statusIn) {
        this.statusIn = statusIn;
    }

    public DatastoreWhereInput statusIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATUS_IN);
        return this;
    }

    public DatastoreWhereInput statusIn_ExplictlyNonNull() {
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

    public DatastoreWhereInput statusNot(DatastoreStatus statusNot) {

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
    public DatastoreStatus getStatusNot() {
        return statusNot;
    }

    public void setStatusNot(DatastoreStatus statusNot) {
        this.statusNot = statusNot;
    }

    public DatastoreWhereInput statusNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATUS_NOT);
        return this;
    }

    public DatastoreWhereInput statusNot_ExplictlyNonNull() {
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

    public DatastoreWhereInput statusNotIn(List<DatastoreStatus> statusNotIn) {

        this.statusNotIn = statusNotIn;
        return this;
    }

    public DatastoreWhereInput addStatusNotInItem(DatastoreStatus statusNotInItem) {
        if (this.statusNotIn == null) {
            this.statusNotIn = new ArrayList<DatastoreStatus>();
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
    public List<DatastoreStatus> getStatusNotIn() {
        return statusNotIn;
    }

    public void setStatusNotIn(List<DatastoreStatus> statusNotIn) {
        this.statusNotIn = statusNotIn;
    }

    public DatastoreWhereInput statusNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_STATUS_NOT_IN);
        return this;
    }

    public DatastoreWhereInput statusNotIn_ExplictlyNonNull() {
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

    public DatastoreWhereInput type(StorageProtocol type) {

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
    public StorageProtocol getType() {
        return type;
    }

    public void setType(StorageProtocol type) {
        this.type = type;
    }

    public DatastoreWhereInput type_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE);
        return this;
    }

    public DatastoreWhereInput type_ExplictlyNonNull() {
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

    public DatastoreWhereInput typeIn(List<StorageProtocol> typeIn) {

        this.typeIn = typeIn;
        return this;
    }

    public DatastoreWhereInput addTypeInItem(StorageProtocol typeInItem) {
        if (this.typeIn == null) {
            this.typeIn = new ArrayList<StorageProtocol>();
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
    public List<StorageProtocol> getTypeIn() {
        return typeIn;
    }

    public void setTypeIn(List<StorageProtocol> typeIn) {
        this.typeIn = typeIn;
    }

    public DatastoreWhereInput typeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE_IN);
        return this;
    }

    public DatastoreWhereInput typeIn_ExplictlyNonNull() {
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

    public DatastoreWhereInput typeNot(StorageProtocol typeNot) {

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
    public StorageProtocol getTypeNot() {
        return typeNot;
    }

    public void setTypeNot(StorageProtocol typeNot) {
        this.typeNot = typeNot;
    }

    public DatastoreWhereInput typeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE_NOT);
        return this;
    }

    public DatastoreWhereInput typeNot_ExplictlyNonNull() {
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

    public DatastoreWhereInput typeNotIn(List<StorageProtocol> typeNotIn) {

        this.typeNotIn = typeNotIn;
        return this;
    }

    public DatastoreWhereInput addTypeNotInItem(StorageProtocol typeNotInItem) {
        if (this.typeNotIn == null) {
            this.typeNotIn = new ArrayList<StorageProtocol>();
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
    public List<StorageProtocol> getTypeNotIn() {
        return typeNotIn;
    }

    public void setTypeNotIn(List<StorageProtocol> typeNotIn) {
        this.typeNotIn = typeNotIn;
    }

    public DatastoreWhereInput typeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE_NOT_IN);
        return this;
    }

    public DatastoreWhereInput typeNotIn_ExplictlyNonNull() {
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

    public DatastoreWhereInput usedBytes(Long usedBytes) {

        this.usedBytes = usedBytes;
        return this;
    }

    /**
     * Get usedBytes
     *
     * @return usedBytes
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getUsedBytes() {
        return usedBytes;
    }

    public void setUsedBytes(Long usedBytes) {
        this.usedBytes = usedBytes;
    }

    public DatastoreWhereInput usedBytes_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USED_BYTES);
        return this;
    }

    public DatastoreWhereInput usedBytes_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USED_BYTES);
        return this;
    }

    public void setUsedBytes_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USED_BYTES);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USED_BYTES);
        }
    }

    public boolean getUsedBytes_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USED_BYTES);
    }

    public DatastoreWhereInput usedBytesGt(Long usedBytesGt) {

        this.usedBytesGt = usedBytesGt;
        return this;
    }

    /**
     * Get usedBytesGt
     *
     * @return usedBytesGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getUsedBytesGt() {
        return usedBytesGt;
    }

    public void setUsedBytesGt(Long usedBytesGt) {
        this.usedBytesGt = usedBytesGt;
    }

    public DatastoreWhereInput usedBytesGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USED_BYTES_GT);
        return this;
    }

    public DatastoreWhereInput usedBytesGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USED_BYTES_GT);
        return this;
    }

    public void setUsedBytesGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USED_BYTES_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USED_BYTES_GT);
        }
    }

    public boolean getUsedBytesGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USED_BYTES_GT);
    }

    public DatastoreWhereInput usedBytesGte(Long usedBytesGte) {

        this.usedBytesGte = usedBytesGte;
        return this;
    }

    /**
     * Get usedBytesGte
     *
     * @return usedBytesGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getUsedBytesGte() {
        return usedBytesGte;
    }

    public void setUsedBytesGte(Long usedBytesGte) {
        this.usedBytesGte = usedBytesGte;
    }

    public DatastoreWhereInput usedBytesGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USED_BYTES_GTE);
        return this;
    }

    public DatastoreWhereInput usedBytesGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USED_BYTES_GTE);
        return this;
    }

    public void setUsedBytesGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USED_BYTES_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USED_BYTES_GTE);
        }
    }

    public boolean getUsedBytesGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USED_BYTES_GTE);
    }

    public DatastoreWhereInput usedBytesIn(List<Long> usedBytesIn) {

        this.usedBytesIn = usedBytesIn;
        return this;
    }

    public DatastoreWhereInput addUsedBytesInItem(Long usedBytesInItem) {
        if (this.usedBytesIn == null) {
            this.usedBytesIn = new ArrayList<Long>();
        }
        this.usedBytesIn.add(usedBytesInItem);
        return this;
    }

    /**
     * Get usedBytesIn
     *
     * @return usedBytesIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getUsedBytesIn() {
        return usedBytesIn;
    }

    public void setUsedBytesIn(List<Long> usedBytesIn) {
        this.usedBytesIn = usedBytesIn;
    }

    public DatastoreWhereInput usedBytesIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USED_BYTES_IN);
        return this;
    }

    public DatastoreWhereInput usedBytesIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USED_BYTES_IN);
        return this;
    }

    public void setUsedBytesIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USED_BYTES_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USED_BYTES_IN);
        }
    }

    public boolean getUsedBytesIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USED_BYTES_IN);
    }

    public DatastoreWhereInput usedBytesLt(Long usedBytesLt) {

        this.usedBytesLt = usedBytesLt;
        return this;
    }

    /**
     * Get usedBytesLt
     *
     * @return usedBytesLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getUsedBytesLt() {
        return usedBytesLt;
    }

    public void setUsedBytesLt(Long usedBytesLt) {
        this.usedBytesLt = usedBytesLt;
    }

    public DatastoreWhereInput usedBytesLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USED_BYTES_LT);
        return this;
    }

    public DatastoreWhereInput usedBytesLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USED_BYTES_LT);
        return this;
    }

    public void setUsedBytesLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USED_BYTES_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USED_BYTES_LT);
        }
    }

    public boolean getUsedBytesLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USED_BYTES_LT);
    }

    public DatastoreWhereInput usedBytesLte(Long usedBytesLte) {

        this.usedBytesLte = usedBytesLte;
        return this;
    }

    /**
     * Get usedBytesLte
     *
     * @return usedBytesLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getUsedBytesLte() {
        return usedBytesLte;
    }

    public void setUsedBytesLte(Long usedBytesLte) {
        this.usedBytesLte = usedBytesLte;
    }

    public DatastoreWhereInput usedBytesLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USED_BYTES_LTE);
        return this;
    }

    public DatastoreWhereInput usedBytesLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USED_BYTES_LTE);
        return this;
    }

    public void setUsedBytesLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USED_BYTES_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USED_BYTES_LTE);
        }
    }

    public boolean getUsedBytesLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USED_BYTES_LTE);
    }

    public DatastoreWhereInput usedBytesNot(Long usedBytesNot) {

        this.usedBytesNot = usedBytesNot;
        return this;
    }

    /**
     * Get usedBytesNot
     *
     * @return usedBytesNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getUsedBytesNot() {
        return usedBytesNot;
    }

    public void setUsedBytesNot(Long usedBytesNot) {
        this.usedBytesNot = usedBytesNot;
    }

    public DatastoreWhereInput usedBytesNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USED_BYTES_NOT);
        return this;
    }

    public DatastoreWhereInput usedBytesNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USED_BYTES_NOT);
        return this;
    }

    public void setUsedBytesNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USED_BYTES_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USED_BYTES_NOT);
        }
    }

    public boolean getUsedBytesNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USED_BYTES_NOT);
    }

    public DatastoreWhereInput usedBytesNotIn(List<Long> usedBytesNotIn) {

        this.usedBytesNotIn = usedBytesNotIn;
        return this;
    }

    public DatastoreWhereInput addUsedBytesNotInItem(Long usedBytesNotInItem) {
        if (this.usedBytesNotIn == null) {
            this.usedBytesNotIn = new ArrayList<Long>();
        }
        this.usedBytesNotIn.add(usedBytesNotInItem);
        return this;
    }

    /**
     * Get usedBytesNotIn
     *
     * @return usedBytesNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getUsedBytesNotIn() {
        return usedBytesNotIn;
    }

    public void setUsedBytesNotIn(List<Long> usedBytesNotIn) {
        this.usedBytesNotIn = usedBytesNotIn;
    }

    public DatastoreWhereInput usedBytesNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USED_BYTES_NOT_IN);
        return this;
    }

    public DatastoreWhereInput usedBytesNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USED_BYTES_NOT_IN);
        return this;
    }

    public void setUsedBytesNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USED_BYTES_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USED_BYTES_NOT_IN);
        }
    }

    public boolean getUsedBytesNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USED_BYTES_NOT_IN);
    }

    public DatastoreWhereInput vcfsVersion(String vcfsVersion) {

        this.vcfsVersion = vcfsVersion;
        return this;
    }

    /**
     * Get vcfsVersion
     *
     * @return vcfsVersion
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVcfsVersion() {
        return vcfsVersion;
    }

    public void setVcfsVersion(String vcfsVersion) {
        this.vcfsVersion = vcfsVersion;
    }

    public DatastoreWhereInput vcfsVersion_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VCFS_VERSION);
        return this;
    }

    public DatastoreWhereInput vcfsVersion_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VCFS_VERSION);
        return this;
    }

    public void setVcfsVersion_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VCFS_VERSION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VCFS_VERSION);
        }
    }

    public boolean getVcfsVersion_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VCFS_VERSION);
    }

    public DatastoreWhereInput vcfsVersionContains(String vcfsVersionContains) {

        this.vcfsVersionContains = vcfsVersionContains;
        return this;
    }

    /**
     * Get vcfsVersionContains
     *
     * @return vcfsVersionContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVcfsVersionContains() {
        return vcfsVersionContains;
    }

    public void setVcfsVersionContains(String vcfsVersionContains) {
        this.vcfsVersionContains = vcfsVersionContains;
    }

    public DatastoreWhereInput vcfsVersionContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VCFS_VERSION_CONTAINS);
        return this;
    }

    public DatastoreWhereInput vcfsVersionContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VCFS_VERSION_CONTAINS);
        return this;
    }

    public void setVcfsVersionContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VCFS_VERSION_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VCFS_VERSION_CONTAINS);
        }
    }

    public boolean getVcfsVersionContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VCFS_VERSION_CONTAINS);
    }

    public DatastoreWhereInput vcfsVersionEndsWith(String vcfsVersionEndsWith) {

        this.vcfsVersionEndsWith = vcfsVersionEndsWith;
        return this;
    }

    /**
     * Get vcfsVersionEndsWith
     *
     * @return vcfsVersionEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVcfsVersionEndsWith() {
        return vcfsVersionEndsWith;
    }

    public void setVcfsVersionEndsWith(String vcfsVersionEndsWith) {
        this.vcfsVersionEndsWith = vcfsVersionEndsWith;
    }

    public DatastoreWhereInput vcfsVersionEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VCFS_VERSION_ENDS_WITH);
        return this;
    }

    public DatastoreWhereInput vcfsVersionEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VCFS_VERSION_ENDS_WITH);
        return this;
    }

    public void setVcfsVersionEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VCFS_VERSION_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VCFS_VERSION_ENDS_WITH);
        }
    }

    public boolean getVcfsVersionEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VCFS_VERSION_ENDS_WITH);
    }

    public DatastoreWhereInput vcfsVersionGt(String vcfsVersionGt) {

        this.vcfsVersionGt = vcfsVersionGt;
        return this;
    }

    /**
     * Get vcfsVersionGt
     *
     * @return vcfsVersionGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVcfsVersionGt() {
        return vcfsVersionGt;
    }

    public void setVcfsVersionGt(String vcfsVersionGt) {
        this.vcfsVersionGt = vcfsVersionGt;
    }

    public DatastoreWhereInput vcfsVersionGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VCFS_VERSION_GT);
        return this;
    }

    public DatastoreWhereInput vcfsVersionGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VCFS_VERSION_GT);
        return this;
    }

    public void setVcfsVersionGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VCFS_VERSION_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VCFS_VERSION_GT);
        }
    }

    public boolean getVcfsVersionGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VCFS_VERSION_GT);
    }

    public DatastoreWhereInput vcfsVersionGte(String vcfsVersionGte) {

        this.vcfsVersionGte = vcfsVersionGte;
        return this;
    }

    /**
     * Get vcfsVersionGte
     *
     * @return vcfsVersionGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVcfsVersionGte() {
        return vcfsVersionGte;
    }

    public void setVcfsVersionGte(String vcfsVersionGte) {
        this.vcfsVersionGte = vcfsVersionGte;
    }

    public DatastoreWhereInput vcfsVersionGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VCFS_VERSION_GTE);
        return this;
    }

    public DatastoreWhereInput vcfsVersionGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VCFS_VERSION_GTE);
        return this;
    }

    public void setVcfsVersionGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VCFS_VERSION_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VCFS_VERSION_GTE);
        }
    }

    public boolean getVcfsVersionGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VCFS_VERSION_GTE);
    }

    public DatastoreWhereInput vcfsVersionIn(List<String> vcfsVersionIn) {

        this.vcfsVersionIn = vcfsVersionIn;
        return this;
    }

    public DatastoreWhereInput addVcfsVersionInItem(String vcfsVersionInItem) {
        if (this.vcfsVersionIn == null) {
            this.vcfsVersionIn = new ArrayList<String>();
        }
        this.vcfsVersionIn.add(vcfsVersionInItem);
        return this;
    }

    /**
     * Get vcfsVersionIn
     *
     * @return vcfsVersionIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getVcfsVersionIn() {
        return vcfsVersionIn;
    }

    public void setVcfsVersionIn(List<String> vcfsVersionIn) {
        this.vcfsVersionIn = vcfsVersionIn;
    }

    public DatastoreWhereInput vcfsVersionIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VCFS_VERSION_IN);
        return this;
    }

    public DatastoreWhereInput vcfsVersionIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VCFS_VERSION_IN);
        return this;
    }

    public void setVcfsVersionIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VCFS_VERSION_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VCFS_VERSION_IN);
        }
    }

    public boolean getVcfsVersionIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VCFS_VERSION_IN);
    }

    public DatastoreWhereInput vcfsVersionLt(String vcfsVersionLt) {

        this.vcfsVersionLt = vcfsVersionLt;
        return this;
    }

    /**
     * Get vcfsVersionLt
     *
     * @return vcfsVersionLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVcfsVersionLt() {
        return vcfsVersionLt;
    }

    public void setVcfsVersionLt(String vcfsVersionLt) {
        this.vcfsVersionLt = vcfsVersionLt;
    }

    public DatastoreWhereInput vcfsVersionLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VCFS_VERSION_LT);
        return this;
    }

    public DatastoreWhereInput vcfsVersionLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VCFS_VERSION_LT);
        return this;
    }

    public void setVcfsVersionLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VCFS_VERSION_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VCFS_VERSION_LT);
        }
    }

    public boolean getVcfsVersionLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VCFS_VERSION_LT);
    }

    public DatastoreWhereInput vcfsVersionLte(String vcfsVersionLte) {

        this.vcfsVersionLte = vcfsVersionLte;
        return this;
    }

    /**
     * Get vcfsVersionLte
     *
     * @return vcfsVersionLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVcfsVersionLte() {
        return vcfsVersionLte;
    }

    public void setVcfsVersionLte(String vcfsVersionLte) {
        this.vcfsVersionLte = vcfsVersionLte;
    }

    public DatastoreWhereInput vcfsVersionLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VCFS_VERSION_LTE);
        return this;
    }

    public DatastoreWhereInput vcfsVersionLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VCFS_VERSION_LTE);
        return this;
    }

    public void setVcfsVersionLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VCFS_VERSION_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VCFS_VERSION_LTE);
        }
    }

    public boolean getVcfsVersionLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VCFS_VERSION_LTE);
    }

    public DatastoreWhereInput vcfsVersionNot(String vcfsVersionNot) {

        this.vcfsVersionNot = vcfsVersionNot;
        return this;
    }

    /**
     * Get vcfsVersionNot
     *
     * @return vcfsVersionNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVcfsVersionNot() {
        return vcfsVersionNot;
    }

    public void setVcfsVersionNot(String vcfsVersionNot) {
        this.vcfsVersionNot = vcfsVersionNot;
    }

    public DatastoreWhereInput vcfsVersionNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VCFS_VERSION_NOT);
        return this;
    }

    public DatastoreWhereInput vcfsVersionNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VCFS_VERSION_NOT);
        return this;
    }

    public void setVcfsVersionNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VCFS_VERSION_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VCFS_VERSION_NOT);
        }
    }

    public boolean getVcfsVersionNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VCFS_VERSION_NOT);
    }

    public DatastoreWhereInput vcfsVersionNotContains(String vcfsVersionNotContains) {

        this.vcfsVersionNotContains = vcfsVersionNotContains;
        return this;
    }

    /**
     * Get vcfsVersionNotContains
     *
     * @return vcfsVersionNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVcfsVersionNotContains() {
        return vcfsVersionNotContains;
    }

    public void setVcfsVersionNotContains(String vcfsVersionNotContains) {
        this.vcfsVersionNotContains = vcfsVersionNotContains;
    }

    public DatastoreWhereInput vcfsVersionNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VCFS_VERSION_NOT_CONTAINS);
        return this;
    }

    public DatastoreWhereInput vcfsVersionNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VCFS_VERSION_NOT_CONTAINS);
        return this;
    }

    public void setVcfsVersionNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VCFS_VERSION_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VCFS_VERSION_NOT_CONTAINS);
        }
    }

    public boolean getVcfsVersionNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VCFS_VERSION_NOT_CONTAINS);
    }

    public DatastoreWhereInput vcfsVersionNotEndsWith(String vcfsVersionNotEndsWith) {

        this.vcfsVersionNotEndsWith = vcfsVersionNotEndsWith;
        return this;
    }

    /**
     * Get vcfsVersionNotEndsWith
     *
     * @return vcfsVersionNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVcfsVersionNotEndsWith() {
        return vcfsVersionNotEndsWith;
    }

    public void setVcfsVersionNotEndsWith(String vcfsVersionNotEndsWith) {
        this.vcfsVersionNotEndsWith = vcfsVersionNotEndsWith;
    }

    public DatastoreWhereInput vcfsVersionNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VCFS_VERSION_NOT_ENDS_WITH);
        return this;
    }

    public DatastoreWhereInput vcfsVersionNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VCFS_VERSION_NOT_ENDS_WITH);
        return this;
    }

    public void setVcfsVersionNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VCFS_VERSION_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VCFS_VERSION_NOT_ENDS_WITH);
        }
    }

    public boolean getVcfsVersionNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VCFS_VERSION_NOT_ENDS_WITH);
    }

    public DatastoreWhereInput vcfsVersionNotIn(List<String> vcfsVersionNotIn) {

        this.vcfsVersionNotIn = vcfsVersionNotIn;
        return this;
    }

    public DatastoreWhereInput addVcfsVersionNotInItem(String vcfsVersionNotInItem) {
        if (this.vcfsVersionNotIn == null) {
            this.vcfsVersionNotIn = new ArrayList<String>();
        }
        this.vcfsVersionNotIn.add(vcfsVersionNotInItem);
        return this;
    }

    /**
     * Get vcfsVersionNotIn
     *
     * @return vcfsVersionNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getVcfsVersionNotIn() {
        return vcfsVersionNotIn;
    }

    public void setVcfsVersionNotIn(List<String> vcfsVersionNotIn) {
        this.vcfsVersionNotIn = vcfsVersionNotIn;
    }

    public DatastoreWhereInput vcfsVersionNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VCFS_VERSION_NOT_IN);
        return this;
    }

    public DatastoreWhereInput vcfsVersionNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VCFS_VERSION_NOT_IN);
        return this;
    }

    public void setVcfsVersionNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VCFS_VERSION_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VCFS_VERSION_NOT_IN);
        }
    }

    public boolean getVcfsVersionNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VCFS_VERSION_NOT_IN);
    }

    public DatastoreWhereInput vcfsVersionNotStartsWith(String vcfsVersionNotStartsWith) {

        this.vcfsVersionNotStartsWith = vcfsVersionNotStartsWith;
        return this;
    }

    /**
     * Get vcfsVersionNotStartsWith
     *
     * @return vcfsVersionNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVcfsVersionNotStartsWith() {
        return vcfsVersionNotStartsWith;
    }

    public void setVcfsVersionNotStartsWith(String vcfsVersionNotStartsWith) {
        this.vcfsVersionNotStartsWith = vcfsVersionNotStartsWith;
    }

    public DatastoreWhereInput vcfsVersionNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VCFS_VERSION_NOT_STARTS_WITH);
        return this;
    }

    public DatastoreWhereInput vcfsVersionNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VCFS_VERSION_NOT_STARTS_WITH);
        return this;
    }

    public void setVcfsVersionNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VCFS_VERSION_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VCFS_VERSION_NOT_STARTS_WITH);
        }
    }

    public boolean getVcfsVersionNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VCFS_VERSION_NOT_STARTS_WITH);
    }

    public DatastoreWhereInput vcfsVersionStartsWith(String vcfsVersionStartsWith) {

        this.vcfsVersionStartsWith = vcfsVersionStartsWith;
        return this;
    }

    /**
     * Get vcfsVersionStartsWith
     *
     * @return vcfsVersionStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getVcfsVersionStartsWith() {
        return vcfsVersionStartsWith;
    }

    public void setVcfsVersionStartsWith(String vcfsVersionStartsWith) {
        this.vcfsVersionStartsWith = vcfsVersionStartsWith;
    }

    public DatastoreWhereInput vcfsVersionStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VCFS_VERSION_STARTS_WITH);
        return this;
    }

    public DatastoreWhereInput vcfsVersionStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VCFS_VERSION_STARTS_WITH);
        return this;
    }

    public void setVcfsVersionStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VCFS_VERSION_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VCFS_VERSION_STARTS_WITH);
        }
    }

    public boolean getVcfsVersionStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VCFS_VERSION_STARTS_WITH);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DatastoreWhereInput datastoreWhereInput = (DatastoreWhereInput) o;
        return Objects.equals(this.AND, datastoreWhereInput.AND)
                && Objects.equals(this.NOT, datastoreWhereInput.NOT)
                && Objects.equals(this.OR, datastoreWhereInput.OR)
                && Objects.equals(this.capacityBytes, datastoreWhereInput.capacityBytes)
                && Objects.equals(this.capacityBytesGt, datastoreWhereInput.capacityBytesGt)
                && Objects.equals(this.capacityBytesGte, datastoreWhereInput.capacityBytesGte)
                && Objects.equals(this.capacityBytesIn, datastoreWhereInput.capacityBytesIn)
                && Objects.equals(this.capacityBytesLt, datastoreWhereInput.capacityBytesLt)
                && Objects.equals(this.capacityBytesLte, datastoreWhereInput.capacityBytesLte)
                && Objects.equals(this.capacityBytesNot, datastoreWhereInput.capacityBytesNot)
                && Objects.equals(this.capacityBytesNotIn, datastoreWhereInput.capacityBytesNotIn)
                && Objects.equals(this.createdTime, datastoreWhereInput.createdTime)
                && Objects.equals(this.createdTimeGt, datastoreWhereInput.createdTimeGt)
                && Objects.equals(this.createdTimeGte, datastoreWhereInput.createdTimeGte)
                && Objects.equals(this.createdTimeIn, datastoreWhereInput.createdTimeIn)
                && Objects.equals(this.createdTimeLt, datastoreWhereInput.createdTimeLt)
                && Objects.equals(this.createdTimeLte, datastoreWhereInput.createdTimeLte)
                && Objects.equals(this.createdTimeNot, datastoreWhereInput.createdTimeNot)
                && Objects.equals(this.createdTimeNotIn, datastoreWhereInput.createdTimeNotIn)
                && Objects.equals(this.dataVersion, datastoreWhereInput.dataVersion)
                && Objects.equals(this.dataVersionGt, datastoreWhereInput.dataVersionGt)
                && Objects.equals(this.dataVersionGte, datastoreWhereInput.dataVersionGte)
                && Objects.equals(this.dataVersionIn, datastoreWhereInput.dataVersionIn)
                && Objects.equals(this.dataVersionLt, datastoreWhereInput.dataVersionLt)
                && Objects.equals(this.dataVersionLte, datastoreWhereInput.dataVersionLte)
                && Objects.equals(this.dataVersionNot, datastoreWhereInput.dataVersionNot)
                && Objects.equals(this.dataVersionNotIn, datastoreWhereInput.dataVersionNotIn)
                && Objects.equals(
                        this.datastoreCapacityBytes, datastoreWhereInput.datastoreCapacityBytes)
                && Objects.equals(
                        this.datastoreCapacityBytesGt, datastoreWhereInput.datastoreCapacityBytesGt)
                && Objects.equals(
                        this.datastoreCapacityBytesGte,
                        datastoreWhereInput.datastoreCapacityBytesGte)
                && Objects.equals(
                        this.datastoreCapacityBytesIn, datastoreWhereInput.datastoreCapacityBytesIn)
                && Objects.equals(
                        this.datastoreCapacityBytesLt, datastoreWhereInput.datastoreCapacityBytesLt)
                && Objects.equals(
                        this.datastoreCapacityBytesLte,
                        datastoreWhereInput.datastoreCapacityBytesLte)
                && Objects.equals(
                        this.datastoreCapacityBytesNot,
                        datastoreWhereInput.datastoreCapacityBytesNot)
                && Objects.equals(
                        this.datastoreCapacityBytesNotIn,
                        datastoreWhereInput.datastoreCapacityBytesNotIn)
                && Objects.equals(this.description, datastoreWhereInput.description)
                && Objects.equals(this.descriptionContains, datastoreWhereInput.descriptionContains)
                && Objects.equals(this.descriptionEndsWith, datastoreWhereInput.descriptionEndsWith)
                && Objects.equals(this.descriptionGt, datastoreWhereInput.descriptionGt)
                && Objects.equals(this.descriptionGte, datastoreWhereInput.descriptionGte)
                && Objects.equals(this.descriptionIn, datastoreWhereInput.descriptionIn)
                && Objects.equals(this.descriptionLt, datastoreWhereInput.descriptionLt)
                && Objects.equals(this.descriptionLte, datastoreWhereInput.descriptionLte)
                && Objects.equals(this.descriptionNot, datastoreWhereInput.descriptionNot)
                && Objects.equals(
                        this.descriptionNotContains, datastoreWhereInput.descriptionNotContains)
                && Objects.equals(
                        this.descriptionNotEndsWith, datastoreWhereInput.descriptionNotEndsWith)
                && Objects.equals(this.descriptionNotIn, datastoreWhereInput.descriptionNotIn)
                && Objects.equals(
                        this.descriptionNotStartsWith, datastoreWhereInput.descriptionNotStartsWith)
                && Objects.equals(
                        this.descriptionStartsWith, datastoreWhereInput.descriptionStartsWith)
                && Objects.equals(this.entityAsyncStatus, datastoreWhereInput.entityAsyncStatus)
                && Objects.equals(this.entityAsyncStatusIn, datastoreWhereInput.entityAsyncStatusIn)
                && Objects.equals(
                        this.entityAsyncStatusNot, datastoreWhereInput.entityAsyncStatusNot)
                && Objects.equals(
                        this.entityAsyncStatusNotIn, datastoreWhereInput.entityAsyncStatusNotIn)
                && Objects.equals(this.freeBytes, datastoreWhereInput.freeBytes)
                && Objects.equals(this.freeBytesGt, datastoreWhereInput.freeBytesGt)
                && Objects.equals(this.freeBytesGte, datastoreWhereInput.freeBytesGte)
                && Objects.equals(this.freeBytesIn, datastoreWhereInput.freeBytesIn)
                && Objects.equals(this.freeBytesLt, datastoreWhereInput.freeBytesLt)
                && Objects.equals(this.freeBytesLte, datastoreWhereInput.freeBytesLte)
                && Objects.equals(this.freeBytesNot, datastoreWhereInput.freeBytesNot)
                && Objects.equals(this.freeBytesNotIn, datastoreWhereInput.freeBytesNotIn)
                && Objects.equals(this.id, datastoreWhereInput.id)
                && Objects.equals(this.idContains, datastoreWhereInput.idContains)
                && Objects.equals(this.idEndsWith, datastoreWhereInput.idEndsWith)
                && Objects.equals(this.idGt, datastoreWhereInput.idGt)
                && Objects.equals(this.idGte, datastoreWhereInput.idGte)
                && Objects.equals(this.idIn, datastoreWhereInput.idIn)
                && Objects.equals(this.idLt, datastoreWhereInput.idLt)
                && Objects.equals(this.idLte, datastoreWhereInput.idLte)
                && Objects.equals(this.idNot, datastoreWhereInput.idNot)
                && Objects.equals(this.idNotContains, datastoreWhereInput.idNotContains)
                && Objects.equals(this.idNotEndsWith, datastoreWhereInput.idNotEndsWith)
                && Objects.equals(this.idNotIn, datastoreWhereInput.idNotIn)
                && Objects.equals(this.idNotStartsWith, datastoreWhereInput.idNotStartsWith)
                && Objects.equals(this.idStartsWith, datastoreWhereInput.idStartsWith)
                && Objects.equals(this.labelsEvery, datastoreWhereInput.labelsEvery)
                && Objects.equals(this.labelsNone, datastoreWhereInput.labelsNone)
                && Objects.equals(this.labelsSome, datastoreWhereInput.labelsSome)
                && Objects.equals(this.localHash, datastoreWhereInput.localHash)
                && Objects.equals(this.localHashContains, datastoreWhereInput.localHashContains)
                && Objects.equals(this.localHashEndsWith, datastoreWhereInput.localHashEndsWith)
                && Objects.equals(this.localHashGt, datastoreWhereInput.localHashGt)
                && Objects.equals(this.localHashGte, datastoreWhereInput.localHashGte)
                && Objects.equals(this.localHashIn, datastoreWhereInput.localHashIn)
                && Objects.equals(this.localHashLt, datastoreWhereInput.localHashLt)
                && Objects.equals(this.localHashLte, datastoreWhereInput.localHashLte)
                && Objects.equals(this.localHashNot, datastoreWhereInput.localHashNot)
                && Objects.equals(
                        this.localHashNotContains, datastoreWhereInput.localHashNotContains)
                && Objects.equals(
                        this.localHashNotEndsWith, datastoreWhereInput.localHashNotEndsWith)
                && Objects.equals(this.localHashNotIn, datastoreWhereInput.localHashNotIn)
                && Objects.equals(
                        this.localHashNotStartsWith, datastoreWhereInput.localHashNotStartsWith)
                && Objects.equals(this.localHashStartsWith, datastoreWhereInput.localHashStartsWith)
                && Objects.equals(this.localId, datastoreWhereInput.localId)
                && Objects.equals(this.localIdContains, datastoreWhereInput.localIdContains)
                && Objects.equals(this.localIdEndsWith, datastoreWhereInput.localIdEndsWith)
                && Objects.equals(this.localIdGt, datastoreWhereInput.localIdGt)
                && Objects.equals(this.localIdGte, datastoreWhereInput.localIdGte)
                && Objects.equals(this.localIdIn, datastoreWhereInput.localIdIn)
                && Objects.equals(this.localIdLt, datastoreWhereInput.localIdLt)
                && Objects.equals(this.localIdLte, datastoreWhereInput.localIdLte)
                && Objects.equals(this.localIdNot, datastoreWhereInput.localIdNot)
                && Objects.equals(this.localIdNotContains, datastoreWhereInput.localIdNotContains)
                && Objects.equals(this.localIdNotEndsWith, datastoreWhereInput.localIdNotEndsWith)
                && Objects.equals(this.localIdNotIn, datastoreWhereInput.localIdNotIn)
                && Objects.equals(
                        this.localIdNotStartsWith, datastoreWhereInput.localIdNotStartsWith)
                && Objects.equals(this.localIdStartsWith, datastoreWhereInput.localIdStartsWith)
                && Objects.equals(this.modifiedTime, datastoreWhereInput.modifiedTime)
                && Objects.equals(this.modifiedTimeGt, datastoreWhereInput.modifiedTimeGt)
                && Objects.equals(this.modifiedTimeGte, datastoreWhereInput.modifiedTimeGte)
                && Objects.equals(this.modifiedTimeIn, datastoreWhereInput.modifiedTimeIn)
                && Objects.equals(this.modifiedTimeLt, datastoreWhereInput.modifiedTimeLt)
                && Objects.equals(this.modifiedTimeLte, datastoreWhereInput.modifiedTimeLte)
                && Objects.equals(this.modifiedTimeNot, datastoreWhereInput.modifiedTimeNot)
                && Objects.equals(this.modifiedTimeNotIn, datastoreWhereInput.modifiedTimeNotIn)
                && Objects.equals(this.name, datastoreWhereInput.name)
                && Objects.equals(this.nameContains, datastoreWhereInput.nameContains)
                && Objects.equals(this.nameEndsWith, datastoreWhereInput.nameEndsWith)
                && Objects.equals(this.nameGt, datastoreWhereInput.nameGt)
                && Objects.equals(this.nameGte, datastoreWhereInput.nameGte)
                && Objects.equals(this.nameIn, datastoreWhereInput.nameIn)
                && Objects.equals(this.nameLt, datastoreWhereInput.nameLt)
                && Objects.equals(this.nameLte, datastoreWhereInput.nameLte)
                && Objects.equals(this.nameNot, datastoreWhereInput.nameNot)
                && Objects.equals(this.nameNotContains, datastoreWhereInput.nameNotContains)
                && Objects.equals(this.nameNotEndsWith, datastoreWhereInput.nameNotEndsWith)
                && Objects.equals(this.nameNotIn, datastoreWhereInput.nameNotIn)
                && Objects.equals(this.nameNotStartsWith, datastoreWhereInput.nameNotStartsWith)
                && Objects.equals(this.nameStartsWith, datastoreWhereInput.nameStartsWith)
                && Objects.equals(this.recyclePolicy, datastoreWhereInput.recyclePolicy)
                && Objects.equals(
                        this.recyclePolicyContains, datastoreWhereInput.recyclePolicyContains)
                && Objects.equals(
                        this.recyclePolicyEndsWith, datastoreWhereInput.recyclePolicyEndsWith)
                && Objects.equals(this.recyclePolicyGt, datastoreWhereInput.recyclePolicyGt)
                && Objects.equals(this.recyclePolicyGte, datastoreWhereInput.recyclePolicyGte)
                && Objects.equals(this.recyclePolicyIn, datastoreWhereInput.recyclePolicyIn)
                && Objects.equals(this.recyclePolicyLt, datastoreWhereInput.recyclePolicyLt)
                && Objects.equals(this.recyclePolicyLte, datastoreWhereInput.recyclePolicyLte)
                && Objects.equals(this.recyclePolicyNot, datastoreWhereInput.recyclePolicyNot)
                && Objects.equals(
                        this.recyclePolicyNotContains, datastoreWhereInput.recyclePolicyNotContains)
                && Objects.equals(
                        this.recyclePolicyNotEndsWith, datastoreWhereInput.recyclePolicyNotEndsWith)
                && Objects.equals(this.recyclePolicyNotIn, datastoreWhereInput.recyclePolicyNotIn)
                && Objects.equals(
                        this.recyclePolicyNotStartsWith,
                        datastoreWhereInput.recyclePolicyNotStartsWith)
                && Objects.equals(
                        this.recyclePolicyStartsWith, datastoreWhereInput.recyclePolicyStartsWith)
                && Objects.equals(this.status, datastoreWhereInput.status)
                && Objects.equals(this.statusIn, datastoreWhereInput.statusIn)
                && Objects.equals(this.statusNot, datastoreWhereInput.statusNot)
                && Objects.equals(this.statusNotIn, datastoreWhereInput.statusNotIn)
                && Objects.equals(this.type, datastoreWhereInput.type)
                && Objects.equals(this.typeIn, datastoreWhereInput.typeIn)
                && Objects.equals(this.typeNot, datastoreWhereInput.typeNot)
                && Objects.equals(this.typeNotIn, datastoreWhereInput.typeNotIn)
                && Objects.equals(this.usedBytes, datastoreWhereInput.usedBytes)
                && Objects.equals(this.usedBytesGt, datastoreWhereInput.usedBytesGt)
                && Objects.equals(this.usedBytesGte, datastoreWhereInput.usedBytesGte)
                && Objects.equals(this.usedBytesIn, datastoreWhereInput.usedBytesIn)
                && Objects.equals(this.usedBytesLt, datastoreWhereInput.usedBytesLt)
                && Objects.equals(this.usedBytesLte, datastoreWhereInput.usedBytesLte)
                && Objects.equals(this.usedBytesNot, datastoreWhereInput.usedBytesNot)
                && Objects.equals(this.usedBytesNotIn, datastoreWhereInput.usedBytesNotIn)
                && Objects.equals(this.vcfsVersion, datastoreWhereInput.vcfsVersion)
                && Objects.equals(this.vcfsVersionContains, datastoreWhereInput.vcfsVersionContains)
                && Objects.equals(this.vcfsVersionEndsWith, datastoreWhereInput.vcfsVersionEndsWith)
                && Objects.equals(this.vcfsVersionGt, datastoreWhereInput.vcfsVersionGt)
                && Objects.equals(this.vcfsVersionGte, datastoreWhereInput.vcfsVersionGte)
                && Objects.equals(this.vcfsVersionIn, datastoreWhereInput.vcfsVersionIn)
                && Objects.equals(this.vcfsVersionLt, datastoreWhereInput.vcfsVersionLt)
                && Objects.equals(this.vcfsVersionLte, datastoreWhereInput.vcfsVersionLte)
                && Objects.equals(this.vcfsVersionNot, datastoreWhereInput.vcfsVersionNot)
                && Objects.equals(
                        this.vcfsVersionNotContains, datastoreWhereInput.vcfsVersionNotContains)
                && Objects.equals(
                        this.vcfsVersionNotEndsWith, datastoreWhereInput.vcfsVersionNotEndsWith)
                && Objects.equals(this.vcfsVersionNotIn, datastoreWhereInput.vcfsVersionNotIn)
                && Objects.equals(
                        this.vcfsVersionNotStartsWith, datastoreWhereInput.vcfsVersionNotStartsWith)
                && Objects.equals(
                        this.vcfsVersionStartsWith, datastoreWhereInput.vcfsVersionStartsWith);
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
                capacityBytes,
                capacityBytesGt,
                capacityBytesGte,
                capacityBytesIn,
                capacityBytesLt,
                capacityBytesLte,
                capacityBytesNot,
                capacityBytesNotIn,
                createdTime,
                createdTimeGt,
                createdTimeGte,
                createdTimeIn,
                createdTimeLt,
                createdTimeLte,
                createdTimeNot,
                createdTimeNotIn,
                dataVersion,
                dataVersionGt,
                dataVersionGte,
                dataVersionIn,
                dataVersionLt,
                dataVersionLte,
                dataVersionNot,
                dataVersionNotIn,
                datastoreCapacityBytes,
                datastoreCapacityBytesGt,
                datastoreCapacityBytesGte,
                datastoreCapacityBytesIn,
                datastoreCapacityBytesLt,
                datastoreCapacityBytesLte,
                datastoreCapacityBytesNot,
                datastoreCapacityBytesNotIn,
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
                freeBytes,
                freeBytesGt,
                freeBytesGte,
                freeBytesIn,
                freeBytesLt,
                freeBytesLte,
                freeBytesNot,
                freeBytesNotIn,
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
                labelsEvery,
                labelsNone,
                labelsSome,
                localHash,
                localHashContains,
                localHashEndsWith,
                localHashGt,
                localHashGte,
                localHashIn,
                localHashLt,
                localHashLte,
                localHashNot,
                localHashNotContains,
                localHashNotEndsWith,
                localHashNotIn,
                localHashNotStartsWith,
                localHashStartsWith,
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
                modifiedTime,
                modifiedTimeGt,
                modifiedTimeGte,
                modifiedTimeIn,
                modifiedTimeLt,
                modifiedTimeLte,
                modifiedTimeNot,
                modifiedTimeNotIn,
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
                recyclePolicy,
                recyclePolicyContains,
                recyclePolicyEndsWith,
                recyclePolicyGt,
                recyclePolicyGte,
                recyclePolicyIn,
                recyclePolicyLt,
                recyclePolicyLte,
                recyclePolicyNot,
                recyclePolicyNotContains,
                recyclePolicyNotEndsWith,
                recyclePolicyNotIn,
                recyclePolicyNotStartsWith,
                recyclePolicyStartsWith,
                status,
                statusIn,
                statusNot,
                statusNotIn,
                type,
                typeIn,
                typeNot,
                typeNotIn,
                usedBytes,
                usedBytesGt,
                usedBytesGte,
                usedBytesIn,
                usedBytesLt,
                usedBytesLte,
                usedBytesNot,
                usedBytesNotIn,
                vcfsVersion,
                vcfsVersionContains,
                vcfsVersionEndsWith,
                vcfsVersionGt,
                vcfsVersionGte,
                vcfsVersionIn,
                vcfsVersionLt,
                vcfsVersionLte,
                vcfsVersionNot,
                vcfsVersionNotContains,
                vcfsVersionNotEndsWith,
                vcfsVersionNotIn,
                vcfsVersionNotStartsWith,
                vcfsVersionStartsWith);
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
        sb.append("class DatastoreWhereInput {\n");
        sb.append("    AND: ").append(toIndentedString(AND)).append("\n");
        sb.append("    NOT: ").append(toIndentedString(NOT)).append("\n");
        sb.append("    OR: ").append(toIndentedString(OR)).append("\n");
        sb.append("    capacityBytes: ").append(toIndentedString(capacityBytes)).append("\n");
        sb.append("    capacityBytesGt: ").append(toIndentedString(capacityBytesGt)).append("\n");
        sb.append("    capacityBytesGte: ").append(toIndentedString(capacityBytesGte)).append("\n");
        sb.append("    capacityBytesIn: ").append(toIndentedString(capacityBytesIn)).append("\n");
        sb.append("    capacityBytesLt: ").append(toIndentedString(capacityBytesLt)).append("\n");
        sb.append("    capacityBytesLte: ").append(toIndentedString(capacityBytesLte)).append("\n");
        sb.append("    capacityBytesNot: ").append(toIndentedString(capacityBytesNot)).append("\n");
        sb.append("    capacityBytesNotIn: ")
                .append(toIndentedString(capacityBytesNotIn))
                .append("\n");
        sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
        sb.append("    createdTimeGt: ").append(toIndentedString(createdTimeGt)).append("\n");
        sb.append("    createdTimeGte: ").append(toIndentedString(createdTimeGte)).append("\n");
        sb.append("    createdTimeIn: ").append(toIndentedString(createdTimeIn)).append("\n");
        sb.append("    createdTimeLt: ").append(toIndentedString(createdTimeLt)).append("\n");
        sb.append("    createdTimeLte: ").append(toIndentedString(createdTimeLte)).append("\n");
        sb.append("    createdTimeNot: ").append(toIndentedString(createdTimeNot)).append("\n");
        sb.append("    createdTimeNotIn: ").append(toIndentedString(createdTimeNotIn)).append("\n");
        sb.append("    dataVersion: ").append(toIndentedString(dataVersion)).append("\n");
        sb.append("    dataVersionGt: ").append(toIndentedString(dataVersionGt)).append("\n");
        sb.append("    dataVersionGte: ").append(toIndentedString(dataVersionGte)).append("\n");
        sb.append("    dataVersionIn: ").append(toIndentedString(dataVersionIn)).append("\n");
        sb.append("    dataVersionLt: ").append(toIndentedString(dataVersionLt)).append("\n");
        sb.append("    dataVersionLte: ").append(toIndentedString(dataVersionLte)).append("\n");
        sb.append("    dataVersionNot: ").append(toIndentedString(dataVersionNot)).append("\n");
        sb.append("    dataVersionNotIn: ").append(toIndentedString(dataVersionNotIn)).append("\n");
        sb.append("    datastoreCapacityBytes: ")
                .append(toIndentedString(datastoreCapacityBytes))
                .append("\n");
        sb.append("    datastoreCapacityBytesGt: ")
                .append(toIndentedString(datastoreCapacityBytesGt))
                .append("\n");
        sb.append("    datastoreCapacityBytesGte: ")
                .append(toIndentedString(datastoreCapacityBytesGte))
                .append("\n");
        sb.append("    datastoreCapacityBytesIn: ")
                .append(toIndentedString(datastoreCapacityBytesIn))
                .append("\n");
        sb.append("    datastoreCapacityBytesLt: ")
                .append(toIndentedString(datastoreCapacityBytesLt))
                .append("\n");
        sb.append("    datastoreCapacityBytesLte: ")
                .append(toIndentedString(datastoreCapacityBytesLte))
                .append("\n");
        sb.append("    datastoreCapacityBytesNot: ")
                .append(toIndentedString(datastoreCapacityBytesNot))
                .append("\n");
        sb.append("    datastoreCapacityBytesNotIn: ")
                .append(toIndentedString(datastoreCapacityBytesNotIn))
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
        sb.append("    freeBytes: ").append(toIndentedString(freeBytes)).append("\n");
        sb.append("    freeBytesGt: ").append(toIndentedString(freeBytesGt)).append("\n");
        sb.append("    freeBytesGte: ").append(toIndentedString(freeBytesGte)).append("\n");
        sb.append("    freeBytesIn: ").append(toIndentedString(freeBytesIn)).append("\n");
        sb.append("    freeBytesLt: ").append(toIndentedString(freeBytesLt)).append("\n");
        sb.append("    freeBytesLte: ").append(toIndentedString(freeBytesLte)).append("\n");
        sb.append("    freeBytesNot: ").append(toIndentedString(freeBytesNot)).append("\n");
        sb.append("    freeBytesNotIn: ").append(toIndentedString(freeBytesNotIn)).append("\n");
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
        sb.append("    labelsEvery: ").append(toIndentedString(labelsEvery)).append("\n");
        sb.append("    labelsNone: ").append(toIndentedString(labelsNone)).append("\n");
        sb.append("    labelsSome: ").append(toIndentedString(labelsSome)).append("\n");
        sb.append("    localHash: ").append(toIndentedString(localHash)).append("\n");
        sb.append("    localHashContains: ")
                .append(toIndentedString(localHashContains))
                .append("\n");
        sb.append("    localHashEndsWith: ")
                .append(toIndentedString(localHashEndsWith))
                .append("\n");
        sb.append("    localHashGt: ").append(toIndentedString(localHashGt)).append("\n");
        sb.append("    localHashGte: ").append(toIndentedString(localHashGte)).append("\n");
        sb.append("    localHashIn: ").append(toIndentedString(localHashIn)).append("\n");
        sb.append("    localHashLt: ").append(toIndentedString(localHashLt)).append("\n");
        sb.append("    localHashLte: ").append(toIndentedString(localHashLte)).append("\n");
        sb.append("    localHashNot: ").append(toIndentedString(localHashNot)).append("\n");
        sb.append("    localHashNotContains: ")
                .append(toIndentedString(localHashNotContains))
                .append("\n");
        sb.append("    localHashNotEndsWith: ")
                .append(toIndentedString(localHashNotEndsWith))
                .append("\n");
        sb.append("    localHashNotIn: ").append(toIndentedString(localHashNotIn)).append("\n");
        sb.append("    localHashNotStartsWith: ")
                .append(toIndentedString(localHashNotStartsWith))
                .append("\n");
        sb.append("    localHashStartsWith: ")
                .append(toIndentedString(localHashStartsWith))
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
        sb.append("    modifiedTime: ").append(toIndentedString(modifiedTime)).append("\n");
        sb.append("    modifiedTimeGt: ").append(toIndentedString(modifiedTimeGt)).append("\n");
        sb.append("    modifiedTimeGte: ").append(toIndentedString(modifiedTimeGte)).append("\n");
        sb.append("    modifiedTimeIn: ").append(toIndentedString(modifiedTimeIn)).append("\n");
        sb.append("    modifiedTimeLt: ").append(toIndentedString(modifiedTimeLt)).append("\n");
        sb.append("    modifiedTimeLte: ").append(toIndentedString(modifiedTimeLte)).append("\n");
        sb.append("    modifiedTimeNot: ").append(toIndentedString(modifiedTimeNot)).append("\n");
        sb.append("    modifiedTimeNotIn: ")
                .append(toIndentedString(modifiedTimeNotIn))
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
        sb.append("    recyclePolicy: ").append(toIndentedString(recyclePolicy)).append("\n");
        sb.append("    recyclePolicyContains: ")
                .append(toIndentedString(recyclePolicyContains))
                .append("\n");
        sb.append("    recyclePolicyEndsWith: ")
                .append(toIndentedString(recyclePolicyEndsWith))
                .append("\n");
        sb.append("    recyclePolicyGt: ").append(toIndentedString(recyclePolicyGt)).append("\n");
        sb.append("    recyclePolicyGte: ").append(toIndentedString(recyclePolicyGte)).append("\n");
        sb.append("    recyclePolicyIn: ").append(toIndentedString(recyclePolicyIn)).append("\n");
        sb.append("    recyclePolicyLt: ").append(toIndentedString(recyclePolicyLt)).append("\n");
        sb.append("    recyclePolicyLte: ").append(toIndentedString(recyclePolicyLte)).append("\n");
        sb.append("    recyclePolicyNot: ").append(toIndentedString(recyclePolicyNot)).append("\n");
        sb.append("    recyclePolicyNotContains: ")
                .append(toIndentedString(recyclePolicyNotContains))
                .append("\n");
        sb.append("    recyclePolicyNotEndsWith: ")
                .append(toIndentedString(recyclePolicyNotEndsWith))
                .append("\n");
        sb.append("    recyclePolicyNotIn: ")
                .append(toIndentedString(recyclePolicyNotIn))
                .append("\n");
        sb.append("    recyclePolicyNotStartsWith: ")
                .append(toIndentedString(recyclePolicyNotStartsWith))
                .append("\n");
        sb.append("    recyclePolicyStartsWith: ")
                .append(toIndentedString(recyclePolicyStartsWith))
                .append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    statusIn: ").append(toIndentedString(statusIn)).append("\n");
        sb.append("    statusNot: ").append(toIndentedString(statusNot)).append("\n");
        sb.append("    statusNotIn: ").append(toIndentedString(statusNotIn)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    typeIn: ").append(toIndentedString(typeIn)).append("\n");
        sb.append("    typeNot: ").append(toIndentedString(typeNot)).append("\n");
        sb.append("    typeNotIn: ").append(toIndentedString(typeNotIn)).append("\n");
        sb.append("    usedBytes: ").append(toIndentedString(usedBytes)).append("\n");
        sb.append("    usedBytesGt: ").append(toIndentedString(usedBytesGt)).append("\n");
        sb.append("    usedBytesGte: ").append(toIndentedString(usedBytesGte)).append("\n");
        sb.append("    usedBytesIn: ").append(toIndentedString(usedBytesIn)).append("\n");
        sb.append("    usedBytesLt: ").append(toIndentedString(usedBytesLt)).append("\n");
        sb.append("    usedBytesLte: ").append(toIndentedString(usedBytesLte)).append("\n");
        sb.append("    usedBytesNot: ").append(toIndentedString(usedBytesNot)).append("\n");
        sb.append("    usedBytesNotIn: ").append(toIndentedString(usedBytesNotIn)).append("\n");
        sb.append("    vcfsVersion: ").append(toIndentedString(vcfsVersion)).append("\n");
        sb.append("    vcfsVersionContains: ")
                .append(toIndentedString(vcfsVersionContains))
                .append("\n");
        sb.append("    vcfsVersionEndsWith: ")
                .append(toIndentedString(vcfsVersionEndsWith))
                .append("\n");
        sb.append("    vcfsVersionGt: ").append(toIndentedString(vcfsVersionGt)).append("\n");
        sb.append("    vcfsVersionGte: ").append(toIndentedString(vcfsVersionGte)).append("\n");
        sb.append("    vcfsVersionIn: ").append(toIndentedString(vcfsVersionIn)).append("\n");
        sb.append("    vcfsVersionLt: ").append(toIndentedString(vcfsVersionLt)).append("\n");
        sb.append("    vcfsVersionLte: ").append(toIndentedString(vcfsVersionLte)).append("\n");
        sb.append("    vcfsVersionNot: ").append(toIndentedString(vcfsVersionNot)).append("\n");
        sb.append("    vcfsVersionNotContains: ")
                .append(toIndentedString(vcfsVersionNotContains))
                .append("\n");
        sb.append("    vcfsVersionNotEndsWith: ")
                .append(toIndentedString(vcfsVersionNotEndsWith))
                .append("\n");
        sb.append("    vcfsVersionNotIn: ").append(toIndentedString(vcfsVersionNotIn)).append("\n");
        sb.append("    vcfsVersionNotStartsWith: ")
                .append(toIndentedString(vcfsVersionNotStartsWith))
                .append("\n");
        sb.append("    vcfsVersionStartsWith: ")
                .append(toIndentedString(vcfsVersionStartsWith))
                .append("\n");
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

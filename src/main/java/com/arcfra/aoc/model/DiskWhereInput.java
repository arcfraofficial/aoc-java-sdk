package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** DiskWhereInput */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class DiskWhereInput extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_A_N_D = "AND";

    @SerializedName(SERIALIZED_NAME_A_N_D)
    private List<DiskWhereInput> AND = null;

    public static final String SERIALIZED_NAME_N_O_T = "NOT";

    @SerializedName(SERIALIZED_NAME_N_O_T)
    private List<DiskWhereInput> NOT = null;

    public static final String SERIALIZED_NAME_O_R = "OR";

    @SerializedName(SERIALIZED_NAME_O_R)
    private List<DiskWhereInput> OR = null;

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

    public static final String SERIALIZED_NAME_FIRMWARE = "firmware";

    @SerializedName(SERIALIZED_NAME_FIRMWARE)
    private String firmware;

    public static final String SERIALIZED_NAME_FIRMWARE_CONTAINS = "firmware_contains";

    @SerializedName(SERIALIZED_NAME_FIRMWARE_CONTAINS)
    private String firmwareContains;

    public static final String SERIALIZED_NAME_FIRMWARE_ENDS_WITH = "firmware_ends_with";

    @SerializedName(SERIALIZED_NAME_FIRMWARE_ENDS_WITH)
    private String firmwareEndsWith;

    public static final String SERIALIZED_NAME_FIRMWARE_GT = "firmware_gt";

    @SerializedName(SERIALIZED_NAME_FIRMWARE_GT)
    private String firmwareGt;

    public static final String SERIALIZED_NAME_FIRMWARE_GTE = "firmware_gte";

    @SerializedName(SERIALIZED_NAME_FIRMWARE_GTE)
    private String firmwareGte;

    public static final String SERIALIZED_NAME_FIRMWARE_IN = "firmware_in";

    @SerializedName(SERIALIZED_NAME_FIRMWARE_IN)
    private List<String> firmwareIn = null;

    public static final String SERIALIZED_NAME_FIRMWARE_LT = "firmware_lt";

    @SerializedName(SERIALIZED_NAME_FIRMWARE_LT)
    private String firmwareLt;

    public static final String SERIALIZED_NAME_FIRMWARE_LTE = "firmware_lte";

    @SerializedName(SERIALIZED_NAME_FIRMWARE_LTE)
    private String firmwareLte;

    public static final String SERIALIZED_NAME_FIRMWARE_NOT = "firmware_not";

    @SerializedName(SERIALIZED_NAME_FIRMWARE_NOT)
    private String firmwareNot;

    public static final String SERIALIZED_NAME_FIRMWARE_NOT_CONTAINS = "firmware_not_contains";

    @SerializedName(SERIALIZED_NAME_FIRMWARE_NOT_CONTAINS)
    private String firmwareNotContains;

    public static final String SERIALIZED_NAME_FIRMWARE_NOT_ENDS_WITH = "firmware_not_ends_with";

    @SerializedName(SERIALIZED_NAME_FIRMWARE_NOT_ENDS_WITH)
    private String firmwareNotEndsWith;

    public static final String SERIALIZED_NAME_FIRMWARE_NOT_IN = "firmware_not_in";

    @SerializedName(SERIALIZED_NAME_FIRMWARE_NOT_IN)
    private List<String> firmwareNotIn = null;

    public static final String SERIALIZED_NAME_FIRMWARE_NOT_STARTS_WITH =
            "firmware_not_starts_with";

    @SerializedName(SERIALIZED_NAME_FIRMWARE_NOT_STARTS_WITH)
    private String firmwareNotStartsWith;

    public static final String SERIALIZED_NAME_FIRMWARE_STARTS_WITH = "firmware_starts_with";

    @SerializedName(SERIALIZED_NAME_FIRMWARE_STARTS_WITH)
    private String firmwareStartsWith;

    public static final String SERIALIZED_NAME_FUNCTION = "function";

    @SerializedName(SERIALIZED_NAME_FUNCTION)
    private DiskFunction function;

    public static final String SERIALIZED_NAME_FUNCTION_IN = "function_in";

    @SerializedName(SERIALIZED_NAME_FUNCTION_IN)
    private List<DiskFunction> functionIn = null;

    public static final String SERIALIZED_NAME_FUNCTION_NOT = "function_not";

    @SerializedName(SERIALIZED_NAME_FUNCTION_NOT)
    private DiskFunction functionNot;

    public static final String SERIALIZED_NAME_FUNCTION_NOT_IN = "function_not_in";

    @SerializedName(SERIALIZED_NAME_FUNCTION_NOT_IN)
    private List<DiskFunction> functionNotIn = null;

    public static final String SERIALIZED_NAME_HEALTH_STATUS = "health_status";

    @SerializedName(SERIALIZED_NAME_HEALTH_STATUS)
    private DiskHealthStatus healthStatus;

    public static final String SERIALIZED_NAME_HEALTH_STATUS_IN = "health_status_in";

    @SerializedName(SERIALIZED_NAME_HEALTH_STATUS_IN)
    private List<DiskHealthStatus> healthStatusIn = null;

    public static final String SERIALIZED_NAME_HEALTH_STATUS_NOT = "health_status_not";

    @SerializedName(SERIALIZED_NAME_HEALTH_STATUS_NOT)
    private DiskHealthStatus healthStatusNot;

    public static final String SERIALIZED_NAME_HEALTH_STATUS_NOT_IN = "health_status_not_in";

    @SerializedName(SERIALIZED_NAME_HEALTH_STATUS_NOT_IN)
    private List<DiskHealthStatus> healthStatusNotIn = null;

    public static final String SERIALIZED_NAME_HEALTHY = "healthy";

    @SerializedName(SERIALIZED_NAME_HEALTHY)
    private Boolean healthy;

    public static final String SERIALIZED_NAME_HEALTHY_NOT = "healthy_not";

    @SerializedName(SERIALIZED_NAME_HEALTHY_NOT)
    private Boolean healthyNot;

    public static final String SERIALIZED_NAME_HOST = "host";

    @SerializedName(SERIALIZED_NAME_HOST)
    private HostWhereInput host;

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

    public static final String SERIALIZED_NAME_MODEL = "model";

    @SerializedName(SERIALIZED_NAME_MODEL)
    private String model;

    public static final String SERIALIZED_NAME_MODEL_CONTAINS = "model_contains";

    @SerializedName(SERIALIZED_NAME_MODEL_CONTAINS)
    private String modelContains;

    public static final String SERIALIZED_NAME_MODEL_ENDS_WITH = "model_ends_with";

    @SerializedName(SERIALIZED_NAME_MODEL_ENDS_WITH)
    private String modelEndsWith;

    public static final String SERIALIZED_NAME_MODEL_GT = "model_gt";

    @SerializedName(SERIALIZED_NAME_MODEL_GT)
    private String modelGt;

    public static final String SERIALIZED_NAME_MODEL_GTE = "model_gte";

    @SerializedName(SERIALIZED_NAME_MODEL_GTE)
    private String modelGte;

    public static final String SERIALIZED_NAME_MODEL_IN = "model_in";

    @SerializedName(SERIALIZED_NAME_MODEL_IN)
    private List<String> modelIn = null;

    public static final String SERIALIZED_NAME_MODEL_LT = "model_lt";

    @SerializedName(SERIALIZED_NAME_MODEL_LT)
    private String modelLt;

    public static final String SERIALIZED_NAME_MODEL_LTE = "model_lte";

    @SerializedName(SERIALIZED_NAME_MODEL_LTE)
    private String modelLte;

    public static final String SERIALIZED_NAME_MODEL_NOT = "model_not";

    @SerializedName(SERIALIZED_NAME_MODEL_NOT)
    private String modelNot;

    public static final String SERIALIZED_NAME_MODEL_NOT_CONTAINS = "model_not_contains";

    @SerializedName(SERIALIZED_NAME_MODEL_NOT_CONTAINS)
    private String modelNotContains;

    public static final String SERIALIZED_NAME_MODEL_NOT_ENDS_WITH = "model_not_ends_with";

    @SerializedName(SERIALIZED_NAME_MODEL_NOT_ENDS_WITH)
    private String modelNotEndsWith;

    public static final String SERIALIZED_NAME_MODEL_NOT_IN = "model_not_in";

    @SerializedName(SERIALIZED_NAME_MODEL_NOT_IN)
    private List<String> modelNotIn = null;

    public static final String SERIALIZED_NAME_MODEL_NOT_STARTS_WITH = "model_not_starts_with";

    @SerializedName(SERIALIZED_NAME_MODEL_NOT_STARTS_WITH)
    private String modelNotStartsWith;

    public static final String SERIALIZED_NAME_MODEL_STARTS_WITH = "model_starts_with";

    @SerializedName(SERIALIZED_NAME_MODEL_STARTS_WITH)
    private String modelStartsWith;

    public static final String SERIALIZED_NAME_MOUNTED = "mounted";

    @SerializedName(SERIALIZED_NAME_MOUNTED)
    private Boolean mounted;

    public static final String SERIALIZED_NAME_MOUNTED_NOT = "mounted_not";

    @SerializedName(SERIALIZED_NAME_MOUNTED_NOT)
    private Boolean mountedNot;

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

    public static final String SERIALIZED_NAME_NUMA_NODE = "numa_node";

    @SerializedName(SERIALIZED_NAME_NUMA_NODE)
    private Integer numaNode;

    public static final String SERIALIZED_NAME_NUMA_NODE_GT = "numa_node_gt";

    @SerializedName(SERIALIZED_NAME_NUMA_NODE_GT)
    private Integer numaNodeGt;

    public static final String SERIALIZED_NAME_NUMA_NODE_GTE = "numa_node_gte";

    @SerializedName(SERIALIZED_NAME_NUMA_NODE_GTE)
    private Integer numaNodeGte;

    public static final String SERIALIZED_NAME_NUMA_NODE_IN = "numa_node_in";

    @SerializedName(SERIALIZED_NAME_NUMA_NODE_IN)
    private List<Integer> numaNodeIn = null;

    public static final String SERIALIZED_NAME_NUMA_NODE_LT = "numa_node_lt";

    @SerializedName(SERIALIZED_NAME_NUMA_NODE_LT)
    private Integer numaNodeLt;

    public static final String SERIALIZED_NAME_NUMA_NODE_LTE = "numa_node_lte";

    @SerializedName(SERIALIZED_NAME_NUMA_NODE_LTE)
    private Integer numaNodeLte;

    public static final String SERIALIZED_NAME_NUMA_NODE_NOT = "numa_node_not";

    @SerializedName(SERIALIZED_NAME_NUMA_NODE_NOT)
    private Integer numaNodeNot;

    public static final String SERIALIZED_NAME_NUMA_NODE_NOT_IN = "numa_node_not_in";

    @SerializedName(SERIALIZED_NAME_NUMA_NODE_NOT_IN)
    private List<Integer> numaNodeNotIn = null;

    public static final String SERIALIZED_NAME_OFFLINE = "offline";

    @SerializedName(SERIALIZED_NAME_OFFLINE)
    private Boolean offline;

    public static final String SERIALIZED_NAME_OFFLINE_NOT = "offline_not";

    @SerializedName(SERIALIZED_NAME_OFFLINE_NOT)
    private Boolean offlineNot;

    public static final String SERIALIZED_NAME_PATH = "path";

    @SerializedName(SERIALIZED_NAME_PATH)
    private String path;

    public static final String SERIALIZED_NAME_PATH_CONTAINS = "path_contains";

    @SerializedName(SERIALIZED_NAME_PATH_CONTAINS)
    private String pathContains;

    public static final String SERIALIZED_NAME_PATH_ENDS_WITH = "path_ends_with";

    @SerializedName(SERIALIZED_NAME_PATH_ENDS_WITH)
    private String pathEndsWith;

    public static final String SERIALIZED_NAME_PATH_GT = "path_gt";

    @SerializedName(SERIALIZED_NAME_PATH_GT)
    private String pathGt;

    public static final String SERIALIZED_NAME_PATH_GTE = "path_gte";

    @SerializedName(SERIALIZED_NAME_PATH_GTE)
    private String pathGte;

    public static final String SERIALIZED_NAME_PATH_IN = "path_in";

    @SerializedName(SERIALIZED_NAME_PATH_IN)
    private List<String> pathIn = null;

    public static final String SERIALIZED_NAME_PATH_LT = "path_lt";

    @SerializedName(SERIALIZED_NAME_PATH_LT)
    private String pathLt;

    public static final String SERIALIZED_NAME_PATH_LTE = "path_lte";

    @SerializedName(SERIALIZED_NAME_PATH_LTE)
    private String pathLte;

    public static final String SERIALIZED_NAME_PATH_NOT = "path_not";

    @SerializedName(SERIALIZED_NAME_PATH_NOT)
    private String pathNot;

    public static final String SERIALIZED_NAME_PATH_NOT_CONTAINS = "path_not_contains";

    @SerializedName(SERIALIZED_NAME_PATH_NOT_CONTAINS)
    private String pathNotContains;

    public static final String SERIALIZED_NAME_PATH_NOT_ENDS_WITH = "path_not_ends_with";

    @SerializedName(SERIALIZED_NAME_PATH_NOT_ENDS_WITH)
    private String pathNotEndsWith;

    public static final String SERIALIZED_NAME_PATH_NOT_IN = "path_not_in";

    @SerializedName(SERIALIZED_NAME_PATH_NOT_IN)
    private List<String> pathNotIn = null;

    public static final String SERIALIZED_NAME_PATH_NOT_STARTS_WITH = "path_not_starts_with";

    @SerializedName(SERIALIZED_NAME_PATH_NOT_STARTS_WITH)
    private String pathNotStartsWith;

    public static final String SERIALIZED_NAME_PATH_STARTS_WITH = "path_starts_with";

    @SerializedName(SERIALIZED_NAME_PATH_STARTS_WITH)
    private String pathStartsWith;

    public static final String SERIALIZED_NAME_PERSISTENT_MEMORY_TYPE = "persistent_memory_type";

    @SerializedName(SERIALIZED_NAME_PERSISTENT_MEMORY_TYPE)
    private String persistentMemoryType;

    public static final String SERIALIZED_NAME_PERSISTENT_MEMORY_TYPE_CONTAINS =
            "persistent_memory_type_contains";

    @SerializedName(SERIALIZED_NAME_PERSISTENT_MEMORY_TYPE_CONTAINS)
    private String persistentMemoryTypeContains;

    public static final String SERIALIZED_NAME_PERSISTENT_MEMORY_TYPE_ENDS_WITH =
            "persistent_memory_type_ends_with";

    @SerializedName(SERIALIZED_NAME_PERSISTENT_MEMORY_TYPE_ENDS_WITH)
    private String persistentMemoryTypeEndsWith;

    public static final String SERIALIZED_NAME_PERSISTENT_MEMORY_TYPE_GT =
            "persistent_memory_type_gt";

    @SerializedName(SERIALIZED_NAME_PERSISTENT_MEMORY_TYPE_GT)
    private String persistentMemoryTypeGt;

    public static final String SERIALIZED_NAME_PERSISTENT_MEMORY_TYPE_GTE =
            "persistent_memory_type_gte";

    @SerializedName(SERIALIZED_NAME_PERSISTENT_MEMORY_TYPE_GTE)
    private String persistentMemoryTypeGte;

    public static final String SERIALIZED_NAME_PERSISTENT_MEMORY_TYPE_IN =
            "persistent_memory_type_in";

    @SerializedName(SERIALIZED_NAME_PERSISTENT_MEMORY_TYPE_IN)
    private List<String> persistentMemoryTypeIn = null;

    public static final String SERIALIZED_NAME_PERSISTENT_MEMORY_TYPE_LT =
            "persistent_memory_type_lt";

    @SerializedName(SERIALIZED_NAME_PERSISTENT_MEMORY_TYPE_LT)
    private String persistentMemoryTypeLt;

    public static final String SERIALIZED_NAME_PERSISTENT_MEMORY_TYPE_LTE =
            "persistent_memory_type_lte";

    @SerializedName(SERIALIZED_NAME_PERSISTENT_MEMORY_TYPE_LTE)
    private String persistentMemoryTypeLte;

    public static final String SERIALIZED_NAME_PERSISTENT_MEMORY_TYPE_NOT =
            "persistent_memory_type_not";

    @SerializedName(SERIALIZED_NAME_PERSISTENT_MEMORY_TYPE_NOT)
    private String persistentMemoryTypeNot;

    public static final String SERIALIZED_NAME_PERSISTENT_MEMORY_TYPE_NOT_CONTAINS =
            "persistent_memory_type_not_contains";

    @SerializedName(SERIALIZED_NAME_PERSISTENT_MEMORY_TYPE_NOT_CONTAINS)
    private String persistentMemoryTypeNotContains;

    public static final String SERIALIZED_NAME_PERSISTENT_MEMORY_TYPE_NOT_ENDS_WITH =
            "persistent_memory_type_not_ends_with";

    @SerializedName(SERIALIZED_NAME_PERSISTENT_MEMORY_TYPE_NOT_ENDS_WITH)
    private String persistentMemoryTypeNotEndsWith;

    public static final String SERIALIZED_NAME_PERSISTENT_MEMORY_TYPE_NOT_IN =
            "persistent_memory_type_not_in";

    @SerializedName(SERIALIZED_NAME_PERSISTENT_MEMORY_TYPE_NOT_IN)
    private List<String> persistentMemoryTypeNotIn = null;

    public static final String SERIALIZED_NAME_PERSISTENT_MEMORY_TYPE_NOT_STARTS_WITH =
            "persistent_memory_type_not_starts_with";

    @SerializedName(SERIALIZED_NAME_PERSISTENT_MEMORY_TYPE_NOT_STARTS_WITH)
    private String persistentMemoryTypeNotStartsWith;

    public static final String SERIALIZED_NAME_PERSISTENT_MEMORY_TYPE_STARTS_WITH =
            "persistent_memory_type_starts_with";

    @SerializedName(SERIALIZED_NAME_PERSISTENT_MEMORY_TYPE_STARTS_WITH)
    private String persistentMemoryTypeStartsWith;

    public static final String SERIALIZED_NAME_PHYSICAL_SLOT_ON_BRICK = "physical_slot_on_brick";

    @SerializedName(SERIALIZED_NAME_PHYSICAL_SLOT_ON_BRICK)
    private Integer physicalSlotOnBrick;

    public static final String SERIALIZED_NAME_PHYSICAL_SLOT_ON_BRICK_GT =
            "physical_slot_on_brick_gt";

    @SerializedName(SERIALIZED_NAME_PHYSICAL_SLOT_ON_BRICK_GT)
    private Integer physicalSlotOnBrickGt;

    public static final String SERIALIZED_NAME_PHYSICAL_SLOT_ON_BRICK_GTE =
            "physical_slot_on_brick_gte";

    @SerializedName(SERIALIZED_NAME_PHYSICAL_SLOT_ON_BRICK_GTE)
    private Integer physicalSlotOnBrickGte;

    public static final String SERIALIZED_NAME_PHYSICAL_SLOT_ON_BRICK_IN =
            "physical_slot_on_brick_in";

    @SerializedName(SERIALIZED_NAME_PHYSICAL_SLOT_ON_BRICK_IN)
    private List<Integer> physicalSlotOnBrickIn = null;

    public static final String SERIALIZED_NAME_PHYSICAL_SLOT_ON_BRICK_LT =
            "physical_slot_on_brick_lt";

    @SerializedName(SERIALIZED_NAME_PHYSICAL_SLOT_ON_BRICK_LT)
    private Integer physicalSlotOnBrickLt;

    public static final String SERIALIZED_NAME_PHYSICAL_SLOT_ON_BRICK_LTE =
            "physical_slot_on_brick_lte";

    @SerializedName(SERIALIZED_NAME_PHYSICAL_SLOT_ON_BRICK_LTE)
    private Integer physicalSlotOnBrickLte;

    public static final String SERIALIZED_NAME_PHYSICAL_SLOT_ON_BRICK_NOT =
            "physical_slot_on_brick_not";

    @SerializedName(SERIALIZED_NAME_PHYSICAL_SLOT_ON_BRICK_NOT)
    private Integer physicalSlotOnBrickNot;

    public static final String SERIALIZED_NAME_PHYSICAL_SLOT_ON_BRICK_NOT_IN =
            "physical_slot_on_brick_not_in";

    @SerializedName(SERIALIZED_NAME_PHYSICAL_SLOT_ON_BRICK_NOT_IN)
    private List<Integer> physicalSlotOnBrickNotIn = null;

    public static final String SERIALIZED_NAME_PMEM_DIMMS_EVERY = "pmem_dimms_every";

    @SerializedName(SERIALIZED_NAME_PMEM_DIMMS_EVERY)
    private PmemDimmWhereInput pmemDimmsEvery;

    public static final String SERIALIZED_NAME_PMEM_DIMMS_NONE = "pmem_dimms_none";

    @SerializedName(SERIALIZED_NAME_PMEM_DIMMS_NONE)
    private PmemDimmWhereInput pmemDimmsNone;

    public static final String SERIALIZED_NAME_PMEM_DIMMS_SOME = "pmem_dimms_some";

    @SerializedName(SERIALIZED_NAME_PMEM_DIMMS_SOME)
    private PmemDimmWhereInput pmemDimmsSome;

    public static final String SERIALIZED_NAME_RECOMMENDED_USAGE = "recommended_usage";

    @SerializedName(SERIALIZED_NAME_RECOMMENDED_USAGE)
    private DiskUsage recommendedUsage;

    public static final String SERIALIZED_NAME_RECOMMENDED_USAGE_IN = "recommended_usage_in";

    @SerializedName(SERIALIZED_NAME_RECOMMENDED_USAGE_IN)
    private List<DiskUsage> recommendedUsageIn = null;

    public static final String SERIALIZED_NAME_RECOMMENDED_USAGE_NOT = "recommended_usage_not";

    @SerializedName(SERIALIZED_NAME_RECOMMENDED_USAGE_NOT)
    private DiskUsage recommendedUsageNot;

    public static final String SERIALIZED_NAME_RECOMMENDED_USAGE_NOT_IN =
            "recommended_usage_not_in";

    @SerializedName(SERIALIZED_NAME_RECOMMENDED_USAGE_NOT_IN)
    private List<DiskUsage> recommendedUsageNotIn = null;

    public static final String SERIALIZED_NAME_REMAINING_LIFE_PERCENT = "remaining_life_percent";

    @SerializedName(SERIALIZED_NAME_REMAINING_LIFE_PERCENT)
    private Integer remainingLifePercent;

    public static final String SERIALIZED_NAME_REMAINING_LIFE_PERCENT_GT =
            "remaining_life_percent_gt";

    @SerializedName(SERIALIZED_NAME_REMAINING_LIFE_PERCENT_GT)
    private Integer remainingLifePercentGt;

    public static final String SERIALIZED_NAME_REMAINING_LIFE_PERCENT_GTE =
            "remaining_life_percent_gte";

    @SerializedName(SERIALIZED_NAME_REMAINING_LIFE_PERCENT_GTE)
    private Integer remainingLifePercentGte;

    public static final String SERIALIZED_NAME_REMAINING_LIFE_PERCENT_IN =
            "remaining_life_percent_in";

    @SerializedName(SERIALIZED_NAME_REMAINING_LIFE_PERCENT_IN)
    private List<Integer> remainingLifePercentIn = null;

    public static final String SERIALIZED_NAME_REMAINING_LIFE_PERCENT_LT =
            "remaining_life_percent_lt";

    @SerializedName(SERIALIZED_NAME_REMAINING_LIFE_PERCENT_LT)
    private Integer remainingLifePercentLt;

    public static final String SERIALIZED_NAME_REMAINING_LIFE_PERCENT_LTE =
            "remaining_life_percent_lte";

    @SerializedName(SERIALIZED_NAME_REMAINING_LIFE_PERCENT_LTE)
    private Integer remainingLifePercentLte;

    public static final String SERIALIZED_NAME_REMAINING_LIFE_PERCENT_NOT =
            "remaining_life_percent_not";

    @SerializedName(SERIALIZED_NAME_REMAINING_LIFE_PERCENT_NOT)
    private Integer remainingLifePercentNot;

    public static final String SERIALIZED_NAME_REMAINING_LIFE_PERCENT_NOT_IN =
            "remaining_life_percent_not_in";

    @SerializedName(SERIALIZED_NAME_REMAINING_LIFE_PERCENT_NOT_IN)
    private List<Integer> remainingLifePercentNotIn = null;

    public static final String SERIALIZED_NAME_SERIAL = "serial";

    @SerializedName(SERIALIZED_NAME_SERIAL)
    private String serial;

    public static final String SERIALIZED_NAME_SERIAL_CONTAINS = "serial_contains";

    @SerializedName(SERIALIZED_NAME_SERIAL_CONTAINS)
    private String serialContains;

    public static final String SERIALIZED_NAME_SERIAL_ENDS_WITH = "serial_ends_with";

    @SerializedName(SERIALIZED_NAME_SERIAL_ENDS_WITH)
    private String serialEndsWith;

    public static final String SERIALIZED_NAME_SERIAL_GT = "serial_gt";

    @SerializedName(SERIALIZED_NAME_SERIAL_GT)
    private String serialGt;

    public static final String SERIALIZED_NAME_SERIAL_GTE = "serial_gte";

    @SerializedName(SERIALIZED_NAME_SERIAL_GTE)
    private String serialGte;

    public static final String SERIALIZED_NAME_SERIAL_IN = "serial_in";

    @SerializedName(SERIALIZED_NAME_SERIAL_IN)
    private List<String> serialIn = null;

    public static final String SERIALIZED_NAME_SERIAL_LT = "serial_lt";

    @SerializedName(SERIALIZED_NAME_SERIAL_LT)
    private String serialLt;

    public static final String SERIALIZED_NAME_SERIAL_LTE = "serial_lte";

    @SerializedName(SERIALIZED_NAME_SERIAL_LTE)
    private String serialLte;

    public static final String SERIALIZED_NAME_SERIAL_NOT = "serial_not";

    @SerializedName(SERIALIZED_NAME_SERIAL_NOT)
    private String serialNot;

    public static final String SERIALIZED_NAME_SERIAL_NOT_CONTAINS = "serial_not_contains";

    @SerializedName(SERIALIZED_NAME_SERIAL_NOT_CONTAINS)
    private String serialNotContains;

    public static final String SERIALIZED_NAME_SERIAL_NOT_ENDS_WITH = "serial_not_ends_with";

    @SerializedName(SERIALIZED_NAME_SERIAL_NOT_ENDS_WITH)
    private String serialNotEndsWith;

    public static final String SERIALIZED_NAME_SERIAL_NOT_IN = "serial_not_in";

    @SerializedName(SERIALIZED_NAME_SERIAL_NOT_IN)
    private List<String> serialNotIn = null;

    public static final String SERIALIZED_NAME_SERIAL_NOT_STARTS_WITH = "serial_not_starts_with";

    @SerializedName(SERIALIZED_NAME_SERIAL_NOT_STARTS_WITH)
    private String serialNotStartsWith;

    public static final String SERIALIZED_NAME_SERIAL_STARTS_WITH = "serial_starts_with";

    @SerializedName(SERIALIZED_NAME_SERIAL_STARTS_WITH)
    private String serialStartsWith;

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

    public static final String SERIALIZED_NAME_TYPE = "type";

    @SerializedName(SERIALIZED_NAME_TYPE)
    private DiskType type;

    public static final String SERIALIZED_NAME_TYPE_IN = "type_in";

    @SerializedName(SERIALIZED_NAME_TYPE_IN)
    private List<DiskType> typeIn = null;

    public static final String SERIALIZED_NAME_TYPE_NOT = "type_not";

    @SerializedName(SERIALIZED_NAME_TYPE_NOT)
    private DiskType typeNot;

    public static final String SERIALIZED_NAME_TYPE_NOT_IN = "type_not_in";

    @SerializedName(SERIALIZED_NAME_TYPE_NOT_IN)
    private List<DiskType> typeNotIn = null;

    public static final String SERIALIZED_NAME_USAGE = "usage";

    @SerializedName(SERIALIZED_NAME_USAGE)
    private DiskUsage usage;

    public static final String SERIALIZED_NAME_USAGE_IN = "usage_in";

    @SerializedName(SERIALIZED_NAME_USAGE_IN)
    private List<DiskUsage> usageIn = null;

    public static final String SERIALIZED_NAME_USAGE_NOT = "usage_not";

    @SerializedName(SERIALIZED_NAME_USAGE_NOT)
    private DiskUsage usageNot;

    public static final String SERIALIZED_NAME_USAGE_NOT_IN = "usage_not_in";

    @SerializedName(SERIALIZED_NAME_USAGE_NOT_IN)
    private List<DiskUsage> usageNotIn = null;

    public static final String SERIALIZED_NAME_USAGE_STATUS = "usage_status";

    @SerializedName(SERIALIZED_NAME_USAGE_STATUS)
    private DiskUsageStatus usageStatus;

    public static final String SERIALIZED_NAME_USAGE_STATUS_IN = "usage_status_in";

    @SerializedName(SERIALIZED_NAME_USAGE_STATUS_IN)
    private List<DiskUsageStatus> usageStatusIn = null;

    public static final String SERIALIZED_NAME_USAGE_STATUS_NOT = "usage_status_not";

    @SerializedName(SERIALIZED_NAME_USAGE_STATUS_NOT)
    private DiskUsageStatus usageStatusNot;

    public static final String SERIALIZED_NAME_USAGE_STATUS_NOT_IN = "usage_status_not_in";

    @SerializedName(SERIALIZED_NAME_USAGE_STATUS_NOT_IN)
    private List<DiskUsageStatus> usageStatusNotIn = null;

    public DiskWhereInput() {}

    public DiskWhereInput AND(List<DiskWhereInput> AND) {

        this.AND = AND;
        return this;
    }

    public DiskWhereInput addANDItem(DiskWhereInput ANDItem) {
        if (this.AND == null) {
            this.AND = new ArrayList<DiskWhereInput>();
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
    public List<DiskWhereInput> getAND() {
        return AND;
    }

    public void setAND(List<DiskWhereInput> AND) {
        this.AND = AND;
    }

    public DiskWhereInput AND_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_A_N_D);
        return this;
    }

    public DiskWhereInput AND_ExplictlyNonNull() {
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

    public DiskWhereInput NOT(List<DiskWhereInput> NOT) {

        this.NOT = NOT;
        return this;
    }

    public DiskWhereInput addNOTItem(DiskWhereInput NOTItem) {
        if (this.NOT == null) {
            this.NOT = new ArrayList<DiskWhereInput>();
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
    public List<DiskWhereInput> getNOT() {
        return NOT;
    }

    public void setNOT(List<DiskWhereInput> NOT) {
        this.NOT = NOT;
    }

    public DiskWhereInput NOT_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_N_O_T);
        return this;
    }

    public DiskWhereInput NOT_ExplictlyNonNull() {
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

    public DiskWhereInput OR(List<DiskWhereInput> OR) {

        this.OR = OR;
        return this;
    }

    public DiskWhereInput addORItem(DiskWhereInput ORItem) {
        if (this.OR == null) {
            this.OR = new ArrayList<DiskWhereInput>();
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
    public List<DiskWhereInput> getOR() {
        return OR;
    }

    public void setOR(List<DiskWhereInput> OR) {
        this.OR = OR;
    }

    public DiskWhereInput OR_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_O_R);
        return this;
    }

    public DiskWhereInput OR_ExplictlyNonNull() {
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

    public DiskWhereInput entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {

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

    public DiskWhereInput entityAsyncStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        return this;
    }

    public DiskWhereInput entityAsyncStatus_ExplictlyNonNull() {
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

    public DiskWhereInput entityAsyncStatusIn(List<EntityAsyncStatus> entityAsyncStatusIn) {

        this.entityAsyncStatusIn = entityAsyncStatusIn;
        return this;
    }

    public DiskWhereInput addEntityAsyncStatusInItem(EntityAsyncStatus entityAsyncStatusInItem) {
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

    public DiskWhereInput entityAsyncStatusIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_IN);
        return this;
    }

    public DiskWhereInput entityAsyncStatusIn_ExplictlyNonNull() {
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

    public DiskWhereInput entityAsyncStatusNot(EntityAsyncStatus entityAsyncStatusNot) {

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

    public DiskWhereInput entityAsyncStatusNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT);
        return this;
    }

    public DiskWhereInput entityAsyncStatusNot_ExplictlyNonNull() {
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

    public DiskWhereInput entityAsyncStatusNotIn(List<EntityAsyncStatus> entityAsyncStatusNotIn) {

        this.entityAsyncStatusNotIn = entityAsyncStatusNotIn;
        return this;
    }

    public DiskWhereInput addEntityAsyncStatusNotInItem(
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

    public DiskWhereInput entityAsyncStatusNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT_IN);
        return this;
    }

    public DiskWhereInput entityAsyncStatusNotIn_ExplictlyNonNull() {
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

    public DiskWhereInput firmware(String firmware) {

        this.firmware = firmware;
        return this;
    }

    /**
     * Get firmware
     *
     * @return firmware
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getFirmware() {
        return firmware;
    }

    public void setFirmware(String firmware) {
        this.firmware = firmware;
    }

    public DiskWhereInput firmware_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FIRMWARE);
        return this;
    }

    public DiskWhereInput firmware_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FIRMWARE);
        return this;
    }

    public void setFirmware_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FIRMWARE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FIRMWARE);
        }
    }

    public boolean getFirmware_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FIRMWARE);
    }

    public DiskWhereInput firmwareContains(String firmwareContains) {

        this.firmwareContains = firmwareContains;
        return this;
    }

    /**
     * Get firmwareContains
     *
     * @return firmwareContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getFirmwareContains() {
        return firmwareContains;
    }

    public void setFirmwareContains(String firmwareContains) {
        this.firmwareContains = firmwareContains;
    }

    public DiskWhereInput firmwareContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FIRMWARE_CONTAINS);
        return this;
    }

    public DiskWhereInput firmwareContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FIRMWARE_CONTAINS);
        return this;
    }

    public void setFirmwareContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FIRMWARE_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FIRMWARE_CONTAINS);
        }
    }

    public boolean getFirmwareContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FIRMWARE_CONTAINS);
    }

    public DiskWhereInput firmwareEndsWith(String firmwareEndsWith) {

        this.firmwareEndsWith = firmwareEndsWith;
        return this;
    }

    /**
     * Get firmwareEndsWith
     *
     * @return firmwareEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getFirmwareEndsWith() {
        return firmwareEndsWith;
    }

    public void setFirmwareEndsWith(String firmwareEndsWith) {
        this.firmwareEndsWith = firmwareEndsWith;
    }

    public DiskWhereInput firmwareEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FIRMWARE_ENDS_WITH);
        return this;
    }

    public DiskWhereInput firmwareEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FIRMWARE_ENDS_WITH);
        return this;
    }

    public void setFirmwareEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FIRMWARE_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FIRMWARE_ENDS_WITH);
        }
    }

    public boolean getFirmwareEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FIRMWARE_ENDS_WITH);
    }

    public DiskWhereInput firmwareGt(String firmwareGt) {

        this.firmwareGt = firmwareGt;
        return this;
    }

    /**
     * Get firmwareGt
     *
     * @return firmwareGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getFirmwareGt() {
        return firmwareGt;
    }

    public void setFirmwareGt(String firmwareGt) {
        this.firmwareGt = firmwareGt;
    }

    public DiskWhereInput firmwareGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FIRMWARE_GT);
        return this;
    }

    public DiskWhereInput firmwareGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FIRMWARE_GT);
        return this;
    }

    public void setFirmwareGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FIRMWARE_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FIRMWARE_GT);
        }
    }

    public boolean getFirmwareGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FIRMWARE_GT);
    }

    public DiskWhereInput firmwareGte(String firmwareGte) {

        this.firmwareGte = firmwareGte;
        return this;
    }

    /**
     * Get firmwareGte
     *
     * @return firmwareGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getFirmwareGte() {
        return firmwareGte;
    }

    public void setFirmwareGte(String firmwareGte) {
        this.firmwareGte = firmwareGte;
    }

    public DiskWhereInput firmwareGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FIRMWARE_GTE);
        return this;
    }

    public DiskWhereInput firmwareGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FIRMWARE_GTE);
        return this;
    }

    public void setFirmwareGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FIRMWARE_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FIRMWARE_GTE);
        }
    }

    public boolean getFirmwareGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FIRMWARE_GTE);
    }

    public DiskWhereInput firmwareIn(List<String> firmwareIn) {

        this.firmwareIn = firmwareIn;
        return this;
    }

    public DiskWhereInput addFirmwareInItem(String firmwareInItem) {
        if (this.firmwareIn == null) {
            this.firmwareIn = new ArrayList<String>();
        }
        this.firmwareIn.add(firmwareInItem);
        return this;
    }

    /**
     * Get firmwareIn
     *
     * @return firmwareIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getFirmwareIn() {
        return firmwareIn;
    }

    public void setFirmwareIn(List<String> firmwareIn) {
        this.firmwareIn = firmwareIn;
    }

    public DiskWhereInput firmwareIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FIRMWARE_IN);
        return this;
    }

    public DiskWhereInput firmwareIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FIRMWARE_IN);
        return this;
    }

    public void setFirmwareIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FIRMWARE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FIRMWARE_IN);
        }
    }

    public boolean getFirmwareIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FIRMWARE_IN);
    }

    public DiskWhereInput firmwareLt(String firmwareLt) {

        this.firmwareLt = firmwareLt;
        return this;
    }

    /**
     * Get firmwareLt
     *
     * @return firmwareLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getFirmwareLt() {
        return firmwareLt;
    }

    public void setFirmwareLt(String firmwareLt) {
        this.firmwareLt = firmwareLt;
    }

    public DiskWhereInput firmwareLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FIRMWARE_LT);
        return this;
    }

    public DiskWhereInput firmwareLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FIRMWARE_LT);
        return this;
    }

    public void setFirmwareLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FIRMWARE_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FIRMWARE_LT);
        }
    }

    public boolean getFirmwareLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FIRMWARE_LT);
    }

    public DiskWhereInput firmwareLte(String firmwareLte) {

        this.firmwareLte = firmwareLte;
        return this;
    }

    /**
     * Get firmwareLte
     *
     * @return firmwareLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getFirmwareLte() {
        return firmwareLte;
    }

    public void setFirmwareLte(String firmwareLte) {
        this.firmwareLte = firmwareLte;
    }

    public DiskWhereInput firmwareLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FIRMWARE_LTE);
        return this;
    }

    public DiskWhereInput firmwareLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FIRMWARE_LTE);
        return this;
    }

    public void setFirmwareLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FIRMWARE_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FIRMWARE_LTE);
        }
    }

    public boolean getFirmwareLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FIRMWARE_LTE);
    }

    public DiskWhereInput firmwareNot(String firmwareNot) {

        this.firmwareNot = firmwareNot;
        return this;
    }

    /**
     * Get firmwareNot
     *
     * @return firmwareNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getFirmwareNot() {
        return firmwareNot;
    }

    public void setFirmwareNot(String firmwareNot) {
        this.firmwareNot = firmwareNot;
    }

    public DiskWhereInput firmwareNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FIRMWARE_NOT);
        return this;
    }

    public DiskWhereInput firmwareNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FIRMWARE_NOT);
        return this;
    }

    public void setFirmwareNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FIRMWARE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FIRMWARE_NOT);
        }
    }

    public boolean getFirmwareNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FIRMWARE_NOT);
    }

    public DiskWhereInput firmwareNotContains(String firmwareNotContains) {

        this.firmwareNotContains = firmwareNotContains;
        return this;
    }

    /**
     * Get firmwareNotContains
     *
     * @return firmwareNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getFirmwareNotContains() {
        return firmwareNotContains;
    }

    public void setFirmwareNotContains(String firmwareNotContains) {
        this.firmwareNotContains = firmwareNotContains;
    }

    public DiskWhereInput firmwareNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FIRMWARE_NOT_CONTAINS);
        return this;
    }

    public DiskWhereInput firmwareNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FIRMWARE_NOT_CONTAINS);
        return this;
    }

    public void setFirmwareNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FIRMWARE_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FIRMWARE_NOT_CONTAINS);
        }
    }

    public boolean getFirmwareNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FIRMWARE_NOT_CONTAINS);
    }

    public DiskWhereInput firmwareNotEndsWith(String firmwareNotEndsWith) {

        this.firmwareNotEndsWith = firmwareNotEndsWith;
        return this;
    }

    /**
     * Get firmwareNotEndsWith
     *
     * @return firmwareNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getFirmwareNotEndsWith() {
        return firmwareNotEndsWith;
    }

    public void setFirmwareNotEndsWith(String firmwareNotEndsWith) {
        this.firmwareNotEndsWith = firmwareNotEndsWith;
    }

    public DiskWhereInput firmwareNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FIRMWARE_NOT_ENDS_WITH);
        return this;
    }

    public DiskWhereInput firmwareNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FIRMWARE_NOT_ENDS_WITH);
        return this;
    }

    public void setFirmwareNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FIRMWARE_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FIRMWARE_NOT_ENDS_WITH);
        }
    }

    public boolean getFirmwareNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FIRMWARE_NOT_ENDS_WITH);
    }

    public DiskWhereInput firmwareNotIn(List<String> firmwareNotIn) {

        this.firmwareNotIn = firmwareNotIn;
        return this;
    }

    public DiskWhereInput addFirmwareNotInItem(String firmwareNotInItem) {
        if (this.firmwareNotIn == null) {
            this.firmwareNotIn = new ArrayList<String>();
        }
        this.firmwareNotIn.add(firmwareNotInItem);
        return this;
    }

    /**
     * Get firmwareNotIn
     *
     * @return firmwareNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getFirmwareNotIn() {
        return firmwareNotIn;
    }

    public void setFirmwareNotIn(List<String> firmwareNotIn) {
        this.firmwareNotIn = firmwareNotIn;
    }

    public DiskWhereInput firmwareNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FIRMWARE_NOT_IN);
        return this;
    }

    public DiskWhereInput firmwareNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FIRMWARE_NOT_IN);
        return this;
    }

    public void setFirmwareNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FIRMWARE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FIRMWARE_NOT_IN);
        }
    }

    public boolean getFirmwareNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FIRMWARE_NOT_IN);
    }

    public DiskWhereInput firmwareNotStartsWith(String firmwareNotStartsWith) {

        this.firmwareNotStartsWith = firmwareNotStartsWith;
        return this;
    }

    /**
     * Get firmwareNotStartsWith
     *
     * @return firmwareNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getFirmwareNotStartsWith() {
        return firmwareNotStartsWith;
    }

    public void setFirmwareNotStartsWith(String firmwareNotStartsWith) {
        this.firmwareNotStartsWith = firmwareNotStartsWith;
    }

    public DiskWhereInput firmwareNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FIRMWARE_NOT_STARTS_WITH);
        return this;
    }

    public DiskWhereInput firmwareNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FIRMWARE_NOT_STARTS_WITH);
        return this;
    }

    public void setFirmwareNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FIRMWARE_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FIRMWARE_NOT_STARTS_WITH);
        }
    }

    public boolean getFirmwareNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FIRMWARE_NOT_STARTS_WITH);
    }

    public DiskWhereInput firmwareStartsWith(String firmwareStartsWith) {

        this.firmwareStartsWith = firmwareStartsWith;
        return this;
    }

    /**
     * Get firmwareStartsWith
     *
     * @return firmwareStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getFirmwareStartsWith() {
        return firmwareStartsWith;
    }

    public void setFirmwareStartsWith(String firmwareStartsWith) {
        this.firmwareStartsWith = firmwareStartsWith;
    }

    public DiskWhereInput firmwareStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FIRMWARE_STARTS_WITH);
        return this;
    }

    public DiskWhereInput firmwareStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FIRMWARE_STARTS_WITH);
        return this;
    }

    public void setFirmwareStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FIRMWARE_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FIRMWARE_STARTS_WITH);
        }
    }

    public boolean getFirmwareStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FIRMWARE_STARTS_WITH);
    }

    public DiskWhereInput function(DiskFunction function) {

        this.function = function;
        return this;
    }

    /**
     * Get function
     *
     * @return function
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public DiskFunction getFunction() {
        return function;
    }

    public void setFunction(DiskFunction function) {
        this.function = function;
    }

    public DiskWhereInput function_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FUNCTION);
        return this;
    }

    public DiskWhereInput function_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FUNCTION);
        return this;
    }

    public void setFunction_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FUNCTION);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FUNCTION);
        }
    }

    public boolean getFunction_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FUNCTION);
    }

    public DiskWhereInput functionIn(List<DiskFunction> functionIn) {

        this.functionIn = functionIn;
        return this;
    }

    public DiskWhereInput addFunctionInItem(DiskFunction functionInItem) {
        if (this.functionIn == null) {
            this.functionIn = new ArrayList<DiskFunction>();
        }
        this.functionIn.add(functionInItem);
        return this;
    }

    /**
     * Get functionIn
     *
     * @return functionIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<DiskFunction> getFunctionIn() {
        return functionIn;
    }

    public void setFunctionIn(List<DiskFunction> functionIn) {
        this.functionIn = functionIn;
    }

    public DiskWhereInput functionIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FUNCTION_IN);
        return this;
    }

    public DiskWhereInput functionIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FUNCTION_IN);
        return this;
    }

    public void setFunctionIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FUNCTION_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FUNCTION_IN);
        }
    }

    public boolean getFunctionIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FUNCTION_IN);
    }

    public DiskWhereInput functionNot(DiskFunction functionNot) {

        this.functionNot = functionNot;
        return this;
    }

    /**
     * Get functionNot
     *
     * @return functionNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public DiskFunction getFunctionNot() {
        return functionNot;
    }

    public void setFunctionNot(DiskFunction functionNot) {
        this.functionNot = functionNot;
    }

    public DiskWhereInput functionNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FUNCTION_NOT);
        return this;
    }

    public DiskWhereInput functionNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FUNCTION_NOT);
        return this;
    }

    public void setFunctionNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FUNCTION_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FUNCTION_NOT);
        }
    }

    public boolean getFunctionNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FUNCTION_NOT);
    }

    public DiskWhereInput functionNotIn(List<DiskFunction> functionNotIn) {

        this.functionNotIn = functionNotIn;
        return this;
    }

    public DiskWhereInput addFunctionNotInItem(DiskFunction functionNotInItem) {
        if (this.functionNotIn == null) {
            this.functionNotIn = new ArrayList<DiskFunction>();
        }
        this.functionNotIn.add(functionNotInItem);
        return this;
    }

    /**
     * Get functionNotIn
     *
     * @return functionNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<DiskFunction> getFunctionNotIn() {
        return functionNotIn;
    }

    public void setFunctionNotIn(List<DiskFunction> functionNotIn) {
        this.functionNotIn = functionNotIn;
    }

    public DiskWhereInput functionNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FUNCTION_NOT_IN);
        return this;
    }

    public DiskWhereInput functionNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_FUNCTION_NOT_IN);
        return this;
    }

    public void setFunctionNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_FUNCTION_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_FUNCTION_NOT_IN);
        }
    }

    public boolean getFunctionNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_FUNCTION_NOT_IN);
    }

    public DiskWhereInput healthStatus(DiskHealthStatus healthStatus) {

        this.healthStatus = healthStatus;
        return this;
    }

    /**
     * Get healthStatus
     *
     * @return healthStatus
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public DiskHealthStatus getHealthStatus() {
        return healthStatus;
    }

    public void setHealthStatus(DiskHealthStatus healthStatus) {
        this.healthStatus = healthStatus;
    }

    public DiskWhereInput healthStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HEALTH_STATUS);
        return this;
    }

    public DiskWhereInput healthStatus_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HEALTH_STATUS);
        return this;
    }

    public void setHealthStatus_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HEALTH_STATUS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HEALTH_STATUS);
        }
    }

    public boolean getHealthStatus_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HEALTH_STATUS);
    }

    public DiskWhereInput healthStatusIn(List<DiskHealthStatus> healthStatusIn) {

        this.healthStatusIn = healthStatusIn;
        return this;
    }

    public DiskWhereInput addHealthStatusInItem(DiskHealthStatus healthStatusInItem) {
        if (this.healthStatusIn == null) {
            this.healthStatusIn = new ArrayList<DiskHealthStatus>();
        }
        this.healthStatusIn.add(healthStatusInItem);
        return this;
    }

    /**
     * Get healthStatusIn
     *
     * @return healthStatusIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<DiskHealthStatus> getHealthStatusIn() {
        return healthStatusIn;
    }

    public void setHealthStatusIn(List<DiskHealthStatus> healthStatusIn) {
        this.healthStatusIn = healthStatusIn;
    }

    public DiskWhereInput healthStatusIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HEALTH_STATUS_IN);
        return this;
    }

    public DiskWhereInput healthStatusIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HEALTH_STATUS_IN);
        return this;
    }

    public void setHealthStatusIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HEALTH_STATUS_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HEALTH_STATUS_IN);
        }
    }

    public boolean getHealthStatusIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HEALTH_STATUS_IN);
    }

    public DiskWhereInput healthStatusNot(DiskHealthStatus healthStatusNot) {

        this.healthStatusNot = healthStatusNot;
        return this;
    }

    /**
     * Get healthStatusNot
     *
     * @return healthStatusNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public DiskHealthStatus getHealthStatusNot() {
        return healthStatusNot;
    }

    public void setHealthStatusNot(DiskHealthStatus healthStatusNot) {
        this.healthStatusNot = healthStatusNot;
    }

    public DiskWhereInput healthStatusNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HEALTH_STATUS_NOT);
        return this;
    }

    public DiskWhereInput healthStatusNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HEALTH_STATUS_NOT);
        return this;
    }

    public void setHealthStatusNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HEALTH_STATUS_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HEALTH_STATUS_NOT);
        }
    }

    public boolean getHealthStatusNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HEALTH_STATUS_NOT);
    }

    public DiskWhereInput healthStatusNotIn(List<DiskHealthStatus> healthStatusNotIn) {

        this.healthStatusNotIn = healthStatusNotIn;
        return this;
    }

    public DiskWhereInput addHealthStatusNotInItem(DiskHealthStatus healthStatusNotInItem) {
        if (this.healthStatusNotIn == null) {
            this.healthStatusNotIn = new ArrayList<DiskHealthStatus>();
        }
        this.healthStatusNotIn.add(healthStatusNotInItem);
        return this;
    }

    /**
     * Get healthStatusNotIn
     *
     * @return healthStatusNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<DiskHealthStatus> getHealthStatusNotIn() {
        return healthStatusNotIn;
    }

    public void setHealthStatusNotIn(List<DiskHealthStatus> healthStatusNotIn) {
        this.healthStatusNotIn = healthStatusNotIn;
    }

    public DiskWhereInput healthStatusNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HEALTH_STATUS_NOT_IN);
        return this;
    }

    public DiskWhereInput healthStatusNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HEALTH_STATUS_NOT_IN);
        return this;
    }

    public void setHealthStatusNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HEALTH_STATUS_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HEALTH_STATUS_NOT_IN);
        }
    }

    public boolean getHealthStatusNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HEALTH_STATUS_NOT_IN);
    }

    public DiskWhereInput healthy(Boolean healthy) {

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

    public DiskWhereInput healthy_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HEALTHY);
        return this;
    }

    public DiskWhereInput healthy_ExplictlyNonNull() {
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

    public DiskWhereInput healthyNot(Boolean healthyNot) {

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

    public DiskWhereInput healthyNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HEALTHY_NOT);
        return this;
    }

    public DiskWhereInput healthyNot_ExplictlyNonNull() {
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

    public DiskWhereInput host(HostWhereInput host) {

        this.host = host;
        return this;
    }

    /**
     * Get host
     *
     * @return host
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public HostWhereInput getHost() {
        return host;
    }

    public void setHost(HostWhereInput host) {
        this.host = host;
    }

    public DiskWhereInput host_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HOST);
        return this;
    }

    public DiskWhereInput host_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HOST);
        return this;
    }

    public void setHost_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HOST);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HOST);
        }
    }

    public boolean getHost_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HOST);
    }

    public DiskWhereInput id(String id) {

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

    public DiskWhereInput id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public DiskWhereInput id_ExplictlyNonNull() {
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

    public DiskWhereInput idContains(String idContains) {

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

    public DiskWhereInput idContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_CONTAINS);
        return this;
    }

    public DiskWhereInput idContains_ExplictlyNonNull() {
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

    public DiskWhereInput idEndsWith(String idEndsWith) {

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

    public DiskWhereInput idEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_ENDS_WITH);
        return this;
    }

    public DiskWhereInput idEndsWith_ExplictlyNonNull() {
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

    public DiskWhereInput idGt(String idGt) {

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

    public DiskWhereInput idGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GT);
        return this;
    }

    public DiskWhereInput idGt_ExplictlyNonNull() {
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

    public DiskWhereInput idGte(String idGte) {

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

    public DiskWhereInput idGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GTE);
        return this;
    }

    public DiskWhereInput idGte_ExplictlyNonNull() {
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

    public DiskWhereInput idIn(List<String> idIn) {

        this.idIn = idIn;
        return this;
    }

    public DiskWhereInput addIdInItem(String idInItem) {
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

    public DiskWhereInput idIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_IN);
        return this;
    }

    public DiskWhereInput idIn_ExplictlyNonNull() {
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

    public DiskWhereInput idLt(String idLt) {

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

    public DiskWhereInput idLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LT);
        return this;
    }

    public DiskWhereInput idLt_ExplictlyNonNull() {
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

    public DiskWhereInput idLte(String idLte) {

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

    public DiskWhereInput idLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LTE);
        return this;
    }

    public DiskWhereInput idLte_ExplictlyNonNull() {
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

    public DiskWhereInput idNot(String idNot) {

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

    public DiskWhereInput idNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT);
        return this;
    }

    public DiskWhereInput idNot_ExplictlyNonNull() {
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

    public DiskWhereInput idNotContains(String idNotContains) {

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

    public DiskWhereInput idNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_CONTAINS);
        return this;
    }

    public DiskWhereInput idNotContains_ExplictlyNonNull() {
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

    public DiskWhereInput idNotEndsWith(String idNotEndsWith) {

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

    public DiskWhereInput idNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
        return this;
    }

    public DiskWhereInput idNotEndsWith_ExplictlyNonNull() {
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

    public DiskWhereInput idNotIn(List<String> idNotIn) {

        this.idNotIn = idNotIn;
        return this;
    }

    public DiskWhereInput addIdNotInItem(String idNotInItem) {
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

    public DiskWhereInput idNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_IN);
        return this;
    }

    public DiskWhereInput idNotIn_ExplictlyNonNull() {
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

    public DiskWhereInput idNotStartsWith(String idNotStartsWith) {

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

    public DiskWhereInput idNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
        return this;
    }

    public DiskWhereInput idNotStartsWith_ExplictlyNonNull() {
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

    public DiskWhereInput idStartsWith(String idStartsWith) {

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

    public DiskWhereInput idStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_STARTS_WITH);
        return this;
    }

    public DiskWhereInput idStartsWith_ExplictlyNonNull() {
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

    public DiskWhereInput labelsEvery(LabelWhereInput labelsEvery) {

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

    public DiskWhereInput labelsEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LABELS_EVERY);
        return this;
    }

    public DiskWhereInput labelsEvery_ExplictlyNonNull() {
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

    public DiskWhereInput labelsNone(LabelWhereInput labelsNone) {

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

    public DiskWhereInput labelsNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LABELS_NONE);
        return this;
    }

    public DiskWhereInput labelsNone_ExplictlyNonNull() {
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

    public DiskWhereInput labelsSome(LabelWhereInput labelsSome) {

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

    public DiskWhereInput labelsSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LABELS_SOME);
        return this;
    }

    public DiskWhereInput labelsSome_ExplictlyNonNull() {
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

    public DiskWhereInput localId(String localId) {

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

    public DiskWhereInput localId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID);
        return this;
    }

    public DiskWhereInput localId_ExplictlyNonNull() {
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

    public DiskWhereInput localIdContains(String localIdContains) {

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

    public DiskWhereInput localIdContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_CONTAINS);
        return this;
    }

    public DiskWhereInput localIdContains_ExplictlyNonNull() {
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

    public DiskWhereInput localIdEndsWith(String localIdEndsWith) {

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

    public DiskWhereInput localIdEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_ENDS_WITH);
        return this;
    }

    public DiskWhereInput localIdEndsWith_ExplictlyNonNull() {
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

    public DiskWhereInput localIdGt(String localIdGt) {

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

    public DiskWhereInput localIdGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_GT);
        return this;
    }

    public DiskWhereInput localIdGt_ExplictlyNonNull() {
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

    public DiskWhereInput localIdGte(String localIdGte) {

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

    public DiskWhereInput localIdGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_GTE);
        return this;
    }

    public DiskWhereInput localIdGte_ExplictlyNonNull() {
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

    public DiskWhereInput localIdIn(List<String> localIdIn) {

        this.localIdIn = localIdIn;
        return this;
    }

    public DiskWhereInput addLocalIdInItem(String localIdInItem) {
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

    public DiskWhereInput localIdIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_IN);
        return this;
    }

    public DiskWhereInput localIdIn_ExplictlyNonNull() {
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

    public DiskWhereInput localIdLt(String localIdLt) {

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

    public DiskWhereInput localIdLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_LT);
        return this;
    }

    public DiskWhereInput localIdLt_ExplictlyNonNull() {
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

    public DiskWhereInput localIdLte(String localIdLte) {

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

    public DiskWhereInput localIdLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_LTE);
        return this;
    }

    public DiskWhereInput localIdLte_ExplictlyNonNull() {
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

    public DiskWhereInput localIdNot(String localIdNot) {

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

    public DiskWhereInput localIdNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT);
        return this;
    }

    public DiskWhereInput localIdNot_ExplictlyNonNull() {
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

    public DiskWhereInput localIdNotContains(String localIdNotContains) {

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

    public DiskWhereInput localIdNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_CONTAINS);
        return this;
    }

    public DiskWhereInput localIdNotContains_ExplictlyNonNull() {
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

    public DiskWhereInput localIdNotEndsWith(String localIdNotEndsWith) {

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

    public DiskWhereInput localIdNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_ENDS_WITH);
        return this;
    }

    public DiskWhereInput localIdNotEndsWith_ExplictlyNonNull() {
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

    public DiskWhereInput localIdNotIn(List<String> localIdNotIn) {

        this.localIdNotIn = localIdNotIn;
        return this;
    }

    public DiskWhereInput addLocalIdNotInItem(String localIdNotInItem) {
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

    public DiskWhereInput localIdNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_IN);
        return this;
    }

    public DiskWhereInput localIdNotIn_ExplictlyNonNull() {
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

    public DiskWhereInput localIdNotStartsWith(String localIdNotStartsWith) {

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

    public DiskWhereInput localIdNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_STARTS_WITH);
        return this;
    }

    public DiskWhereInput localIdNotStartsWith_ExplictlyNonNull() {
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

    public DiskWhereInput localIdStartsWith(String localIdStartsWith) {

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

    public DiskWhereInput localIdStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_STARTS_WITH);
        return this;
    }

    public DiskWhereInput localIdStartsWith_ExplictlyNonNull() {
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

    public DiskWhereInput model(String model) {

        this.model = model;
        return this;
    }

    /**
     * Get model
     *
     * @return model
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public DiskWhereInput model_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MODEL);
        return this;
    }

    public DiskWhereInput model_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MODEL);
        return this;
    }

    public void setModel_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MODEL);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MODEL);
        }
    }

    public boolean getModel_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MODEL);
    }

    public DiskWhereInput modelContains(String modelContains) {

        this.modelContains = modelContains;
        return this;
    }

    /**
     * Get modelContains
     *
     * @return modelContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getModelContains() {
        return modelContains;
    }

    public void setModelContains(String modelContains) {
        this.modelContains = modelContains;
    }

    public DiskWhereInput modelContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MODEL_CONTAINS);
        return this;
    }

    public DiskWhereInput modelContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MODEL_CONTAINS);
        return this;
    }

    public void setModelContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MODEL_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MODEL_CONTAINS);
        }
    }

    public boolean getModelContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MODEL_CONTAINS);
    }

    public DiskWhereInput modelEndsWith(String modelEndsWith) {

        this.modelEndsWith = modelEndsWith;
        return this;
    }

    /**
     * Get modelEndsWith
     *
     * @return modelEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getModelEndsWith() {
        return modelEndsWith;
    }

    public void setModelEndsWith(String modelEndsWith) {
        this.modelEndsWith = modelEndsWith;
    }

    public DiskWhereInput modelEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MODEL_ENDS_WITH);
        return this;
    }

    public DiskWhereInput modelEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MODEL_ENDS_WITH);
        return this;
    }

    public void setModelEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MODEL_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MODEL_ENDS_WITH);
        }
    }

    public boolean getModelEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MODEL_ENDS_WITH);
    }

    public DiskWhereInput modelGt(String modelGt) {

        this.modelGt = modelGt;
        return this;
    }

    /**
     * Get modelGt
     *
     * @return modelGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getModelGt() {
        return modelGt;
    }

    public void setModelGt(String modelGt) {
        this.modelGt = modelGt;
    }

    public DiskWhereInput modelGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MODEL_GT);
        return this;
    }

    public DiskWhereInput modelGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MODEL_GT);
        return this;
    }

    public void setModelGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MODEL_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MODEL_GT);
        }
    }

    public boolean getModelGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MODEL_GT);
    }

    public DiskWhereInput modelGte(String modelGte) {

        this.modelGte = modelGte;
        return this;
    }

    /**
     * Get modelGte
     *
     * @return modelGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getModelGte() {
        return modelGte;
    }

    public void setModelGte(String modelGte) {
        this.modelGte = modelGte;
    }

    public DiskWhereInput modelGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MODEL_GTE);
        return this;
    }

    public DiskWhereInput modelGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MODEL_GTE);
        return this;
    }

    public void setModelGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MODEL_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MODEL_GTE);
        }
    }

    public boolean getModelGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MODEL_GTE);
    }

    public DiskWhereInput modelIn(List<String> modelIn) {

        this.modelIn = modelIn;
        return this;
    }

    public DiskWhereInput addModelInItem(String modelInItem) {
        if (this.modelIn == null) {
            this.modelIn = new ArrayList<String>();
        }
        this.modelIn.add(modelInItem);
        return this;
    }

    /**
     * Get modelIn
     *
     * @return modelIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getModelIn() {
        return modelIn;
    }

    public void setModelIn(List<String> modelIn) {
        this.modelIn = modelIn;
    }

    public DiskWhereInput modelIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MODEL_IN);
        return this;
    }

    public DiskWhereInput modelIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MODEL_IN);
        return this;
    }

    public void setModelIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MODEL_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MODEL_IN);
        }
    }

    public boolean getModelIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MODEL_IN);
    }

    public DiskWhereInput modelLt(String modelLt) {

        this.modelLt = modelLt;
        return this;
    }

    /**
     * Get modelLt
     *
     * @return modelLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getModelLt() {
        return modelLt;
    }

    public void setModelLt(String modelLt) {
        this.modelLt = modelLt;
    }

    public DiskWhereInput modelLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MODEL_LT);
        return this;
    }

    public DiskWhereInput modelLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MODEL_LT);
        return this;
    }

    public void setModelLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MODEL_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MODEL_LT);
        }
    }

    public boolean getModelLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MODEL_LT);
    }

    public DiskWhereInput modelLte(String modelLte) {

        this.modelLte = modelLte;
        return this;
    }

    /**
     * Get modelLte
     *
     * @return modelLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getModelLte() {
        return modelLte;
    }

    public void setModelLte(String modelLte) {
        this.modelLte = modelLte;
    }

    public DiskWhereInput modelLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MODEL_LTE);
        return this;
    }

    public DiskWhereInput modelLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MODEL_LTE);
        return this;
    }

    public void setModelLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MODEL_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MODEL_LTE);
        }
    }

    public boolean getModelLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MODEL_LTE);
    }

    public DiskWhereInput modelNot(String modelNot) {

        this.modelNot = modelNot;
        return this;
    }

    /**
     * Get modelNot
     *
     * @return modelNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getModelNot() {
        return modelNot;
    }

    public void setModelNot(String modelNot) {
        this.modelNot = modelNot;
    }

    public DiskWhereInput modelNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MODEL_NOT);
        return this;
    }

    public DiskWhereInput modelNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MODEL_NOT);
        return this;
    }

    public void setModelNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MODEL_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MODEL_NOT);
        }
    }

    public boolean getModelNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MODEL_NOT);
    }

    public DiskWhereInput modelNotContains(String modelNotContains) {

        this.modelNotContains = modelNotContains;
        return this;
    }

    /**
     * Get modelNotContains
     *
     * @return modelNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getModelNotContains() {
        return modelNotContains;
    }

    public void setModelNotContains(String modelNotContains) {
        this.modelNotContains = modelNotContains;
    }

    public DiskWhereInput modelNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MODEL_NOT_CONTAINS);
        return this;
    }

    public DiskWhereInput modelNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MODEL_NOT_CONTAINS);
        return this;
    }

    public void setModelNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MODEL_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MODEL_NOT_CONTAINS);
        }
    }

    public boolean getModelNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MODEL_NOT_CONTAINS);
    }

    public DiskWhereInput modelNotEndsWith(String modelNotEndsWith) {

        this.modelNotEndsWith = modelNotEndsWith;
        return this;
    }

    /**
     * Get modelNotEndsWith
     *
     * @return modelNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getModelNotEndsWith() {
        return modelNotEndsWith;
    }

    public void setModelNotEndsWith(String modelNotEndsWith) {
        this.modelNotEndsWith = modelNotEndsWith;
    }

    public DiskWhereInput modelNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MODEL_NOT_ENDS_WITH);
        return this;
    }

    public DiskWhereInput modelNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MODEL_NOT_ENDS_WITH);
        return this;
    }

    public void setModelNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MODEL_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MODEL_NOT_ENDS_WITH);
        }
    }

    public boolean getModelNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MODEL_NOT_ENDS_WITH);
    }

    public DiskWhereInput modelNotIn(List<String> modelNotIn) {

        this.modelNotIn = modelNotIn;
        return this;
    }

    public DiskWhereInput addModelNotInItem(String modelNotInItem) {
        if (this.modelNotIn == null) {
            this.modelNotIn = new ArrayList<String>();
        }
        this.modelNotIn.add(modelNotInItem);
        return this;
    }

    /**
     * Get modelNotIn
     *
     * @return modelNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getModelNotIn() {
        return modelNotIn;
    }

    public void setModelNotIn(List<String> modelNotIn) {
        this.modelNotIn = modelNotIn;
    }

    public DiskWhereInput modelNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MODEL_NOT_IN);
        return this;
    }

    public DiskWhereInput modelNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MODEL_NOT_IN);
        return this;
    }

    public void setModelNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MODEL_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MODEL_NOT_IN);
        }
    }

    public boolean getModelNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MODEL_NOT_IN);
    }

    public DiskWhereInput modelNotStartsWith(String modelNotStartsWith) {

        this.modelNotStartsWith = modelNotStartsWith;
        return this;
    }

    /**
     * Get modelNotStartsWith
     *
     * @return modelNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getModelNotStartsWith() {
        return modelNotStartsWith;
    }

    public void setModelNotStartsWith(String modelNotStartsWith) {
        this.modelNotStartsWith = modelNotStartsWith;
    }

    public DiskWhereInput modelNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MODEL_NOT_STARTS_WITH);
        return this;
    }

    public DiskWhereInput modelNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MODEL_NOT_STARTS_WITH);
        return this;
    }

    public void setModelNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MODEL_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MODEL_NOT_STARTS_WITH);
        }
    }

    public boolean getModelNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MODEL_NOT_STARTS_WITH);
    }

    public DiskWhereInput modelStartsWith(String modelStartsWith) {

        this.modelStartsWith = modelStartsWith;
        return this;
    }

    /**
     * Get modelStartsWith
     *
     * @return modelStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getModelStartsWith() {
        return modelStartsWith;
    }

    public void setModelStartsWith(String modelStartsWith) {
        this.modelStartsWith = modelStartsWith;
    }

    public DiskWhereInput modelStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MODEL_STARTS_WITH);
        return this;
    }

    public DiskWhereInput modelStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MODEL_STARTS_WITH);
        return this;
    }

    public void setModelStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MODEL_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MODEL_STARTS_WITH);
        }
    }

    public boolean getModelStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MODEL_STARTS_WITH);
    }

    public DiskWhereInput mounted(Boolean mounted) {

        this.mounted = mounted;
        return this;
    }

    /**
     * Get mounted
     *
     * @return mounted
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getMounted() {
        return mounted;
    }

    public void setMounted(Boolean mounted) {
        this.mounted = mounted;
    }

    public DiskWhereInput mounted_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MOUNTED);
        return this;
    }

    public DiskWhereInput mounted_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MOUNTED);
        return this;
    }

    public void setMounted_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MOUNTED);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MOUNTED);
        }
    }

    public boolean getMounted_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MOUNTED);
    }

    public DiskWhereInput mountedNot(Boolean mountedNot) {

        this.mountedNot = mountedNot;
        return this;
    }

    /**
     * Get mountedNot
     *
     * @return mountedNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getMountedNot() {
        return mountedNot;
    }

    public void setMountedNot(Boolean mountedNot) {
        this.mountedNot = mountedNot;
    }

    public DiskWhereInput mountedNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MOUNTED_NOT);
        return this;
    }

    public DiskWhereInput mountedNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MOUNTED_NOT);
        return this;
    }

    public void setMountedNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MOUNTED_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MOUNTED_NOT);
        }
    }

    public boolean getMountedNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MOUNTED_NOT);
    }

    public DiskWhereInput name(String name) {

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

    public DiskWhereInput name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public DiskWhereInput name_ExplictlyNonNull() {
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

    public DiskWhereInput nameContains(String nameContains) {

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

    public DiskWhereInput nameContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_CONTAINS);
        return this;
    }

    public DiskWhereInput nameContains_ExplictlyNonNull() {
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

    public DiskWhereInput nameEndsWith(String nameEndsWith) {

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

    public DiskWhereInput nameEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_ENDS_WITH);
        return this;
    }

    public DiskWhereInput nameEndsWith_ExplictlyNonNull() {
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

    public DiskWhereInput nameGt(String nameGt) {

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

    public DiskWhereInput nameGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_GT);
        return this;
    }

    public DiskWhereInput nameGt_ExplictlyNonNull() {
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

    public DiskWhereInput nameGte(String nameGte) {

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

    public DiskWhereInput nameGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_GTE);
        return this;
    }

    public DiskWhereInput nameGte_ExplictlyNonNull() {
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

    public DiskWhereInput nameIn(List<String> nameIn) {

        this.nameIn = nameIn;
        return this;
    }

    public DiskWhereInput addNameInItem(String nameInItem) {
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

    public DiskWhereInput nameIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_IN);
        return this;
    }

    public DiskWhereInput nameIn_ExplictlyNonNull() {
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

    public DiskWhereInput nameLt(String nameLt) {

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

    public DiskWhereInput nameLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_LT);
        return this;
    }

    public DiskWhereInput nameLt_ExplictlyNonNull() {
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

    public DiskWhereInput nameLte(String nameLte) {

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

    public DiskWhereInput nameLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_LTE);
        return this;
    }

    public DiskWhereInput nameLte_ExplictlyNonNull() {
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

    public DiskWhereInput nameNot(String nameNot) {

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

    public DiskWhereInput nameNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT);
        return this;
    }

    public DiskWhereInput nameNot_ExplictlyNonNull() {
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

    public DiskWhereInput nameNotContains(String nameNotContains) {

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

    public DiskWhereInput nameNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_CONTAINS);
        return this;
    }

    public DiskWhereInput nameNotContains_ExplictlyNonNull() {
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

    public DiskWhereInput nameNotEndsWith(String nameNotEndsWith) {

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

    public DiskWhereInput nameNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_ENDS_WITH);
        return this;
    }

    public DiskWhereInput nameNotEndsWith_ExplictlyNonNull() {
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

    public DiskWhereInput nameNotIn(List<String> nameNotIn) {

        this.nameNotIn = nameNotIn;
        return this;
    }

    public DiskWhereInput addNameNotInItem(String nameNotInItem) {
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

    public DiskWhereInput nameNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_IN);
        return this;
    }

    public DiskWhereInput nameNotIn_ExplictlyNonNull() {
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

    public DiskWhereInput nameNotStartsWith(String nameNotStartsWith) {

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

    public DiskWhereInput nameNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_STARTS_WITH);
        return this;
    }

    public DiskWhereInput nameNotStartsWith_ExplictlyNonNull() {
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

    public DiskWhereInput nameStartsWith(String nameStartsWith) {

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

    public DiskWhereInput nameStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_STARTS_WITH);
        return this;
    }

    public DiskWhereInput nameStartsWith_ExplictlyNonNull() {
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

    public DiskWhereInput numaNode(Integer numaNode) {

        this.numaNode = numaNode;
        return this;
    }

    /**
     * Get numaNode
     *
     * @return numaNode
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getNumaNode() {
        return numaNode;
    }

    public void setNumaNode(Integer numaNode) {
        this.numaNode = numaNode;
    }

    public DiskWhereInput numaNode_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NUMA_NODE);
        return this;
    }

    public DiskWhereInput numaNode_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NUMA_NODE);
        return this;
    }

    public void setNumaNode_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NUMA_NODE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NUMA_NODE);
        }
    }

    public boolean getNumaNode_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NUMA_NODE);
    }

    public DiskWhereInput numaNodeGt(Integer numaNodeGt) {

        this.numaNodeGt = numaNodeGt;
        return this;
    }

    /**
     * Get numaNodeGt
     *
     * @return numaNodeGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getNumaNodeGt() {
        return numaNodeGt;
    }

    public void setNumaNodeGt(Integer numaNodeGt) {
        this.numaNodeGt = numaNodeGt;
    }

    public DiskWhereInput numaNodeGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NUMA_NODE_GT);
        return this;
    }

    public DiskWhereInput numaNodeGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NUMA_NODE_GT);
        return this;
    }

    public void setNumaNodeGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NUMA_NODE_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NUMA_NODE_GT);
        }
    }

    public boolean getNumaNodeGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NUMA_NODE_GT);
    }

    public DiskWhereInput numaNodeGte(Integer numaNodeGte) {

        this.numaNodeGte = numaNodeGte;
        return this;
    }

    /**
     * Get numaNodeGte
     *
     * @return numaNodeGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getNumaNodeGte() {
        return numaNodeGte;
    }

    public void setNumaNodeGte(Integer numaNodeGte) {
        this.numaNodeGte = numaNodeGte;
    }

    public DiskWhereInput numaNodeGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NUMA_NODE_GTE);
        return this;
    }

    public DiskWhereInput numaNodeGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NUMA_NODE_GTE);
        return this;
    }

    public void setNumaNodeGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NUMA_NODE_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NUMA_NODE_GTE);
        }
    }

    public boolean getNumaNodeGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NUMA_NODE_GTE);
    }

    public DiskWhereInput numaNodeIn(List<Integer> numaNodeIn) {

        this.numaNodeIn = numaNodeIn;
        return this;
    }

    public DiskWhereInput addNumaNodeInItem(Integer numaNodeInItem) {
        if (this.numaNodeIn == null) {
            this.numaNodeIn = new ArrayList<Integer>();
        }
        this.numaNodeIn.add(numaNodeInItem);
        return this;
    }

    /**
     * Get numaNodeIn
     *
     * @return numaNodeIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getNumaNodeIn() {
        return numaNodeIn;
    }

    public void setNumaNodeIn(List<Integer> numaNodeIn) {
        this.numaNodeIn = numaNodeIn;
    }

    public DiskWhereInput numaNodeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NUMA_NODE_IN);
        return this;
    }

    public DiskWhereInput numaNodeIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NUMA_NODE_IN);
        return this;
    }

    public void setNumaNodeIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NUMA_NODE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NUMA_NODE_IN);
        }
    }

    public boolean getNumaNodeIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NUMA_NODE_IN);
    }

    public DiskWhereInput numaNodeLt(Integer numaNodeLt) {

        this.numaNodeLt = numaNodeLt;
        return this;
    }

    /**
     * Get numaNodeLt
     *
     * @return numaNodeLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getNumaNodeLt() {
        return numaNodeLt;
    }

    public void setNumaNodeLt(Integer numaNodeLt) {
        this.numaNodeLt = numaNodeLt;
    }

    public DiskWhereInput numaNodeLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NUMA_NODE_LT);
        return this;
    }

    public DiskWhereInput numaNodeLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NUMA_NODE_LT);
        return this;
    }

    public void setNumaNodeLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NUMA_NODE_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NUMA_NODE_LT);
        }
    }

    public boolean getNumaNodeLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NUMA_NODE_LT);
    }

    public DiskWhereInput numaNodeLte(Integer numaNodeLte) {

        this.numaNodeLte = numaNodeLte;
        return this;
    }

    /**
     * Get numaNodeLte
     *
     * @return numaNodeLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getNumaNodeLte() {
        return numaNodeLte;
    }

    public void setNumaNodeLte(Integer numaNodeLte) {
        this.numaNodeLte = numaNodeLte;
    }

    public DiskWhereInput numaNodeLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NUMA_NODE_LTE);
        return this;
    }

    public DiskWhereInput numaNodeLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NUMA_NODE_LTE);
        return this;
    }

    public void setNumaNodeLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NUMA_NODE_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NUMA_NODE_LTE);
        }
    }

    public boolean getNumaNodeLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NUMA_NODE_LTE);
    }

    public DiskWhereInput numaNodeNot(Integer numaNodeNot) {

        this.numaNodeNot = numaNodeNot;
        return this;
    }

    /**
     * Get numaNodeNot
     *
     * @return numaNodeNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getNumaNodeNot() {
        return numaNodeNot;
    }

    public void setNumaNodeNot(Integer numaNodeNot) {
        this.numaNodeNot = numaNodeNot;
    }

    public DiskWhereInput numaNodeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NUMA_NODE_NOT);
        return this;
    }

    public DiskWhereInput numaNodeNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NUMA_NODE_NOT);
        return this;
    }

    public void setNumaNodeNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NUMA_NODE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NUMA_NODE_NOT);
        }
    }

    public boolean getNumaNodeNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NUMA_NODE_NOT);
    }

    public DiskWhereInput numaNodeNotIn(List<Integer> numaNodeNotIn) {

        this.numaNodeNotIn = numaNodeNotIn;
        return this;
    }

    public DiskWhereInput addNumaNodeNotInItem(Integer numaNodeNotInItem) {
        if (this.numaNodeNotIn == null) {
            this.numaNodeNotIn = new ArrayList<Integer>();
        }
        this.numaNodeNotIn.add(numaNodeNotInItem);
        return this;
    }

    /**
     * Get numaNodeNotIn
     *
     * @return numaNodeNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getNumaNodeNotIn() {
        return numaNodeNotIn;
    }

    public void setNumaNodeNotIn(List<Integer> numaNodeNotIn) {
        this.numaNodeNotIn = numaNodeNotIn;
    }

    public DiskWhereInput numaNodeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NUMA_NODE_NOT_IN);
        return this;
    }

    public DiskWhereInput numaNodeNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_NUMA_NODE_NOT_IN);
        return this;
    }

    public void setNumaNodeNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_NUMA_NODE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_NUMA_NODE_NOT_IN);
        }
    }

    public boolean getNumaNodeNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_NUMA_NODE_NOT_IN);
    }

    public DiskWhereInput offline(Boolean offline) {

        this.offline = offline;
        return this;
    }

    /**
     * Get offline
     *
     * @return offline
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getOffline() {
        return offline;
    }

    public void setOffline(Boolean offline) {
        this.offline = offline;
    }

    public DiskWhereInput offline_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_OFFLINE);
        return this;
    }

    public DiskWhereInput offline_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_OFFLINE);
        return this;
    }

    public void setOffline_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_OFFLINE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_OFFLINE);
        }
    }

    public boolean getOffline_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_OFFLINE);
    }

    public DiskWhereInput offlineNot(Boolean offlineNot) {

        this.offlineNot = offlineNot;
        return this;
    }

    /**
     * Get offlineNot
     *
     * @return offlineNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getOfflineNot() {
        return offlineNot;
    }

    public void setOfflineNot(Boolean offlineNot) {
        this.offlineNot = offlineNot;
    }

    public DiskWhereInput offlineNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_OFFLINE_NOT);
        return this;
    }

    public DiskWhereInput offlineNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_OFFLINE_NOT);
        return this;
    }

    public void setOfflineNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_OFFLINE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_OFFLINE_NOT);
        }
    }

    public boolean getOfflineNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_OFFLINE_NOT);
    }

    public DiskWhereInput path(String path) {

        this.path = path;
        return this;
    }

    /**
     * Get path
     *
     * @return path
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public DiskWhereInput path_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PATH);
        return this;
    }

    public DiskWhereInput path_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PATH);
        return this;
    }

    public void setPath_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PATH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PATH);
        }
    }

    public boolean getPath_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PATH);
    }

    public DiskWhereInput pathContains(String pathContains) {

        this.pathContains = pathContains;
        return this;
    }

    /**
     * Get pathContains
     *
     * @return pathContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPathContains() {
        return pathContains;
    }

    public void setPathContains(String pathContains) {
        this.pathContains = pathContains;
    }

    public DiskWhereInput pathContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PATH_CONTAINS);
        return this;
    }

    public DiskWhereInput pathContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PATH_CONTAINS);
        return this;
    }

    public void setPathContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PATH_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PATH_CONTAINS);
        }
    }

    public boolean getPathContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PATH_CONTAINS);
    }

    public DiskWhereInput pathEndsWith(String pathEndsWith) {

        this.pathEndsWith = pathEndsWith;
        return this;
    }

    /**
     * Get pathEndsWith
     *
     * @return pathEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPathEndsWith() {
        return pathEndsWith;
    }

    public void setPathEndsWith(String pathEndsWith) {
        this.pathEndsWith = pathEndsWith;
    }

    public DiskWhereInput pathEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PATH_ENDS_WITH);
        return this;
    }

    public DiskWhereInput pathEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PATH_ENDS_WITH);
        return this;
    }

    public void setPathEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PATH_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PATH_ENDS_WITH);
        }
    }

    public boolean getPathEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PATH_ENDS_WITH);
    }

    public DiskWhereInput pathGt(String pathGt) {

        this.pathGt = pathGt;
        return this;
    }

    /**
     * Get pathGt
     *
     * @return pathGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPathGt() {
        return pathGt;
    }

    public void setPathGt(String pathGt) {
        this.pathGt = pathGt;
    }

    public DiskWhereInput pathGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PATH_GT);
        return this;
    }

    public DiskWhereInput pathGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PATH_GT);
        return this;
    }

    public void setPathGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PATH_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PATH_GT);
        }
    }

    public boolean getPathGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PATH_GT);
    }

    public DiskWhereInput pathGte(String pathGte) {

        this.pathGte = pathGte;
        return this;
    }

    /**
     * Get pathGte
     *
     * @return pathGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPathGte() {
        return pathGte;
    }

    public void setPathGte(String pathGte) {
        this.pathGte = pathGte;
    }

    public DiskWhereInput pathGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PATH_GTE);
        return this;
    }

    public DiskWhereInput pathGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PATH_GTE);
        return this;
    }

    public void setPathGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PATH_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PATH_GTE);
        }
    }

    public boolean getPathGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PATH_GTE);
    }

    public DiskWhereInput pathIn(List<String> pathIn) {

        this.pathIn = pathIn;
        return this;
    }

    public DiskWhereInput addPathInItem(String pathInItem) {
        if (this.pathIn == null) {
            this.pathIn = new ArrayList<String>();
        }
        this.pathIn.add(pathInItem);
        return this;
    }

    /**
     * Get pathIn
     *
     * @return pathIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getPathIn() {
        return pathIn;
    }

    public void setPathIn(List<String> pathIn) {
        this.pathIn = pathIn;
    }

    public DiskWhereInput pathIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PATH_IN);
        return this;
    }

    public DiskWhereInput pathIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PATH_IN);
        return this;
    }

    public void setPathIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PATH_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PATH_IN);
        }
    }

    public boolean getPathIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PATH_IN);
    }

    public DiskWhereInput pathLt(String pathLt) {

        this.pathLt = pathLt;
        return this;
    }

    /**
     * Get pathLt
     *
     * @return pathLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPathLt() {
        return pathLt;
    }

    public void setPathLt(String pathLt) {
        this.pathLt = pathLt;
    }

    public DiskWhereInput pathLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PATH_LT);
        return this;
    }

    public DiskWhereInput pathLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PATH_LT);
        return this;
    }

    public void setPathLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PATH_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PATH_LT);
        }
    }

    public boolean getPathLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PATH_LT);
    }

    public DiskWhereInput pathLte(String pathLte) {

        this.pathLte = pathLte;
        return this;
    }

    /**
     * Get pathLte
     *
     * @return pathLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPathLte() {
        return pathLte;
    }

    public void setPathLte(String pathLte) {
        this.pathLte = pathLte;
    }

    public DiskWhereInput pathLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PATH_LTE);
        return this;
    }

    public DiskWhereInput pathLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PATH_LTE);
        return this;
    }

    public void setPathLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PATH_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PATH_LTE);
        }
    }

    public boolean getPathLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PATH_LTE);
    }

    public DiskWhereInput pathNot(String pathNot) {

        this.pathNot = pathNot;
        return this;
    }

    /**
     * Get pathNot
     *
     * @return pathNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPathNot() {
        return pathNot;
    }

    public void setPathNot(String pathNot) {
        this.pathNot = pathNot;
    }

    public DiskWhereInput pathNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PATH_NOT);
        return this;
    }

    public DiskWhereInput pathNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PATH_NOT);
        return this;
    }

    public void setPathNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PATH_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PATH_NOT);
        }
    }

    public boolean getPathNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PATH_NOT);
    }

    public DiskWhereInput pathNotContains(String pathNotContains) {

        this.pathNotContains = pathNotContains;
        return this;
    }

    /**
     * Get pathNotContains
     *
     * @return pathNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPathNotContains() {
        return pathNotContains;
    }

    public void setPathNotContains(String pathNotContains) {
        this.pathNotContains = pathNotContains;
    }

    public DiskWhereInput pathNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PATH_NOT_CONTAINS);
        return this;
    }

    public DiskWhereInput pathNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PATH_NOT_CONTAINS);
        return this;
    }

    public void setPathNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PATH_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PATH_NOT_CONTAINS);
        }
    }

    public boolean getPathNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PATH_NOT_CONTAINS);
    }

    public DiskWhereInput pathNotEndsWith(String pathNotEndsWith) {

        this.pathNotEndsWith = pathNotEndsWith;
        return this;
    }

    /**
     * Get pathNotEndsWith
     *
     * @return pathNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPathNotEndsWith() {
        return pathNotEndsWith;
    }

    public void setPathNotEndsWith(String pathNotEndsWith) {
        this.pathNotEndsWith = pathNotEndsWith;
    }

    public DiskWhereInput pathNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PATH_NOT_ENDS_WITH);
        return this;
    }

    public DiskWhereInput pathNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PATH_NOT_ENDS_WITH);
        return this;
    }

    public void setPathNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PATH_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PATH_NOT_ENDS_WITH);
        }
    }

    public boolean getPathNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PATH_NOT_ENDS_WITH);
    }

    public DiskWhereInput pathNotIn(List<String> pathNotIn) {

        this.pathNotIn = pathNotIn;
        return this;
    }

    public DiskWhereInput addPathNotInItem(String pathNotInItem) {
        if (this.pathNotIn == null) {
            this.pathNotIn = new ArrayList<String>();
        }
        this.pathNotIn.add(pathNotInItem);
        return this;
    }

    /**
     * Get pathNotIn
     *
     * @return pathNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getPathNotIn() {
        return pathNotIn;
    }

    public void setPathNotIn(List<String> pathNotIn) {
        this.pathNotIn = pathNotIn;
    }

    public DiskWhereInput pathNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PATH_NOT_IN);
        return this;
    }

    public DiskWhereInput pathNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PATH_NOT_IN);
        return this;
    }

    public void setPathNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PATH_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PATH_NOT_IN);
        }
    }

    public boolean getPathNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PATH_NOT_IN);
    }

    public DiskWhereInput pathNotStartsWith(String pathNotStartsWith) {

        this.pathNotStartsWith = pathNotStartsWith;
        return this;
    }

    /**
     * Get pathNotStartsWith
     *
     * @return pathNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPathNotStartsWith() {
        return pathNotStartsWith;
    }

    public void setPathNotStartsWith(String pathNotStartsWith) {
        this.pathNotStartsWith = pathNotStartsWith;
    }

    public DiskWhereInput pathNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PATH_NOT_STARTS_WITH);
        return this;
    }

    public DiskWhereInput pathNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PATH_NOT_STARTS_WITH);
        return this;
    }

    public void setPathNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PATH_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PATH_NOT_STARTS_WITH);
        }
    }

    public boolean getPathNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PATH_NOT_STARTS_WITH);
    }

    public DiskWhereInput pathStartsWith(String pathStartsWith) {

        this.pathStartsWith = pathStartsWith;
        return this;
    }

    /**
     * Get pathStartsWith
     *
     * @return pathStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPathStartsWith() {
        return pathStartsWith;
    }

    public void setPathStartsWith(String pathStartsWith) {
        this.pathStartsWith = pathStartsWith;
    }

    public DiskWhereInput pathStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PATH_STARTS_WITH);
        return this;
    }

    public DiskWhereInput pathStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PATH_STARTS_WITH);
        return this;
    }

    public void setPathStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PATH_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PATH_STARTS_WITH);
        }
    }

    public boolean getPathStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PATH_STARTS_WITH);
    }

    public DiskWhereInput persistentMemoryType(String persistentMemoryType) {

        this.persistentMemoryType = persistentMemoryType;
        return this;
    }

    /**
     * Get persistentMemoryType
     *
     * @return persistentMemoryType
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPersistentMemoryType() {
        return persistentMemoryType;
    }

    public void setPersistentMemoryType(String persistentMemoryType) {
        this.persistentMemoryType = persistentMemoryType;
    }

    public DiskWhereInput persistentMemoryType_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PERSISTENT_MEMORY_TYPE);
        return this;
    }

    public DiskWhereInput persistentMemoryType_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PERSISTENT_MEMORY_TYPE);
        return this;
    }

    public void setPersistentMemoryType_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PERSISTENT_MEMORY_TYPE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PERSISTENT_MEMORY_TYPE);
        }
    }

    public boolean getPersistentMemoryType_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PERSISTENT_MEMORY_TYPE);
    }

    public DiskWhereInput persistentMemoryTypeContains(String persistentMemoryTypeContains) {

        this.persistentMemoryTypeContains = persistentMemoryTypeContains;
        return this;
    }

    /**
     * Get persistentMemoryTypeContains
     *
     * @return persistentMemoryTypeContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPersistentMemoryTypeContains() {
        return persistentMemoryTypeContains;
    }

    public void setPersistentMemoryTypeContains(String persistentMemoryTypeContains) {
        this.persistentMemoryTypeContains = persistentMemoryTypeContains;
    }

    public DiskWhereInput persistentMemoryTypeContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PERSISTENT_MEMORY_TYPE_CONTAINS);
        return this;
    }

    public DiskWhereInput persistentMemoryTypeContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PERSISTENT_MEMORY_TYPE_CONTAINS);
        return this;
    }

    public void setPersistentMemoryTypeContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PERSISTENT_MEMORY_TYPE_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PERSISTENT_MEMORY_TYPE_CONTAINS);
        }
    }

    public boolean getPersistentMemoryTypeContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PERSISTENT_MEMORY_TYPE_CONTAINS);
    }

    public DiskWhereInput persistentMemoryTypeEndsWith(String persistentMemoryTypeEndsWith) {

        this.persistentMemoryTypeEndsWith = persistentMemoryTypeEndsWith;
        return this;
    }

    /**
     * Get persistentMemoryTypeEndsWith
     *
     * @return persistentMemoryTypeEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPersistentMemoryTypeEndsWith() {
        return persistentMemoryTypeEndsWith;
    }

    public void setPersistentMemoryTypeEndsWith(String persistentMemoryTypeEndsWith) {
        this.persistentMemoryTypeEndsWith = persistentMemoryTypeEndsWith;
    }

    public DiskWhereInput persistentMemoryTypeEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PERSISTENT_MEMORY_TYPE_ENDS_WITH);
        return this;
    }

    public DiskWhereInput persistentMemoryTypeEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PERSISTENT_MEMORY_TYPE_ENDS_WITH);
        return this;
    }

    public void setPersistentMemoryTypeEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PERSISTENT_MEMORY_TYPE_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PERSISTENT_MEMORY_TYPE_ENDS_WITH);
        }
    }

    public boolean getPersistentMemoryTypeEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PERSISTENT_MEMORY_TYPE_ENDS_WITH);
    }

    public DiskWhereInput persistentMemoryTypeGt(String persistentMemoryTypeGt) {

        this.persistentMemoryTypeGt = persistentMemoryTypeGt;
        return this;
    }

    /**
     * Get persistentMemoryTypeGt
     *
     * @return persistentMemoryTypeGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPersistentMemoryTypeGt() {
        return persistentMemoryTypeGt;
    }

    public void setPersistentMemoryTypeGt(String persistentMemoryTypeGt) {
        this.persistentMemoryTypeGt = persistentMemoryTypeGt;
    }

    public DiskWhereInput persistentMemoryTypeGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PERSISTENT_MEMORY_TYPE_GT);
        return this;
    }

    public DiskWhereInput persistentMemoryTypeGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PERSISTENT_MEMORY_TYPE_GT);
        return this;
    }

    public void setPersistentMemoryTypeGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PERSISTENT_MEMORY_TYPE_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PERSISTENT_MEMORY_TYPE_GT);
        }
    }

    public boolean getPersistentMemoryTypeGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PERSISTENT_MEMORY_TYPE_GT);
    }

    public DiskWhereInput persistentMemoryTypeGte(String persistentMemoryTypeGte) {

        this.persistentMemoryTypeGte = persistentMemoryTypeGte;
        return this;
    }

    /**
     * Get persistentMemoryTypeGte
     *
     * @return persistentMemoryTypeGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPersistentMemoryTypeGte() {
        return persistentMemoryTypeGte;
    }

    public void setPersistentMemoryTypeGte(String persistentMemoryTypeGte) {
        this.persistentMemoryTypeGte = persistentMemoryTypeGte;
    }

    public DiskWhereInput persistentMemoryTypeGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PERSISTENT_MEMORY_TYPE_GTE);
        return this;
    }

    public DiskWhereInput persistentMemoryTypeGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PERSISTENT_MEMORY_TYPE_GTE);
        return this;
    }

    public void setPersistentMemoryTypeGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PERSISTENT_MEMORY_TYPE_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PERSISTENT_MEMORY_TYPE_GTE);
        }
    }

    public boolean getPersistentMemoryTypeGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PERSISTENT_MEMORY_TYPE_GTE);
    }

    public DiskWhereInput persistentMemoryTypeIn(List<String> persistentMemoryTypeIn) {

        this.persistentMemoryTypeIn = persistentMemoryTypeIn;
        return this;
    }

    public DiskWhereInput addPersistentMemoryTypeInItem(String persistentMemoryTypeInItem) {
        if (this.persistentMemoryTypeIn == null) {
            this.persistentMemoryTypeIn = new ArrayList<String>();
        }
        this.persistentMemoryTypeIn.add(persistentMemoryTypeInItem);
        return this;
    }

    /**
     * Get persistentMemoryTypeIn
     *
     * @return persistentMemoryTypeIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getPersistentMemoryTypeIn() {
        return persistentMemoryTypeIn;
    }

    public void setPersistentMemoryTypeIn(List<String> persistentMemoryTypeIn) {
        this.persistentMemoryTypeIn = persistentMemoryTypeIn;
    }

    public DiskWhereInput persistentMemoryTypeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PERSISTENT_MEMORY_TYPE_IN);
        return this;
    }

    public DiskWhereInput persistentMemoryTypeIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PERSISTENT_MEMORY_TYPE_IN);
        return this;
    }

    public void setPersistentMemoryTypeIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PERSISTENT_MEMORY_TYPE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PERSISTENT_MEMORY_TYPE_IN);
        }
    }

    public boolean getPersistentMemoryTypeIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PERSISTENT_MEMORY_TYPE_IN);
    }

    public DiskWhereInput persistentMemoryTypeLt(String persistentMemoryTypeLt) {

        this.persistentMemoryTypeLt = persistentMemoryTypeLt;
        return this;
    }

    /**
     * Get persistentMemoryTypeLt
     *
     * @return persistentMemoryTypeLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPersistentMemoryTypeLt() {
        return persistentMemoryTypeLt;
    }

    public void setPersistentMemoryTypeLt(String persistentMemoryTypeLt) {
        this.persistentMemoryTypeLt = persistentMemoryTypeLt;
    }

    public DiskWhereInput persistentMemoryTypeLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PERSISTENT_MEMORY_TYPE_LT);
        return this;
    }

    public DiskWhereInput persistentMemoryTypeLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PERSISTENT_MEMORY_TYPE_LT);
        return this;
    }

    public void setPersistentMemoryTypeLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PERSISTENT_MEMORY_TYPE_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PERSISTENT_MEMORY_TYPE_LT);
        }
    }

    public boolean getPersistentMemoryTypeLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PERSISTENT_MEMORY_TYPE_LT);
    }

    public DiskWhereInput persistentMemoryTypeLte(String persistentMemoryTypeLte) {

        this.persistentMemoryTypeLte = persistentMemoryTypeLte;
        return this;
    }

    /**
     * Get persistentMemoryTypeLte
     *
     * @return persistentMemoryTypeLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPersistentMemoryTypeLte() {
        return persistentMemoryTypeLte;
    }

    public void setPersistentMemoryTypeLte(String persistentMemoryTypeLte) {
        this.persistentMemoryTypeLte = persistentMemoryTypeLte;
    }

    public DiskWhereInput persistentMemoryTypeLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PERSISTENT_MEMORY_TYPE_LTE);
        return this;
    }

    public DiskWhereInput persistentMemoryTypeLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PERSISTENT_MEMORY_TYPE_LTE);
        return this;
    }

    public void setPersistentMemoryTypeLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PERSISTENT_MEMORY_TYPE_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PERSISTENT_MEMORY_TYPE_LTE);
        }
    }

    public boolean getPersistentMemoryTypeLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PERSISTENT_MEMORY_TYPE_LTE);
    }

    public DiskWhereInput persistentMemoryTypeNot(String persistentMemoryTypeNot) {

        this.persistentMemoryTypeNot = persistentMemoryTypeNot;
        return this;
    }

    /**
     * Get persistentMemoryTypeNot
     *
     * @return persistentMemoryTypeNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPersistentMemoryTypeNot() {
        return persistentMemoryTypeNot;
    }

    public void setPersistentMemoryTypeNot(String persistentMemoryTypeNot) {
        this.persistentMemoryTypeNot = persistentMemoryTypeNot;
    }

    public DiskWhereInput persistentMemoryTypeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PERSISTENT_MEMORY_TYPE_NOT);
        return this;
    }

    public DiskWhereInput persistentMemoryTypeNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PERSISTENT_MEMORY_TYPE_NOT);
        return this;
    }

    public void setPersistentMemoryTypeNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PERSISTENT_MEMORY_TYPE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PERSISTENT_MEMORY_TYPE_NOT);
        }
    }

    public boolean getPersistentMemoryTypeNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PERSISTENT_MEMORY_TYPE_NOT);
    }

    public DiskWhereInput persistentMemoryTypeNotContains(String persistentMemoryTypeNotContains) {

        this.persistentMemoryTypeNotContains = persistentMemoryTypeNotContains;
        return this;
    }

    /**
     * Get persistentMemoryTypeNotContains
     *
     * @return persistentMemoryTypeNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPersistentMemoryTypeNotContains() {
        return persistentMemoryTypeNotContains;
    }

    public void setPersistentMemoryTypeNotContains(String persistentMemoryTypeNotContains) {
        this.persistentMemoryTypeNotContains = persistentMemoryTypeNotContains;
    }

    public DiskWhereInput persistentMemoryTypeNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PERSISTENT_MEMORY_TYPE_NOT_CONTAINS);
        return this;
    }

    public DiskWhereInput persistentMemoryTypeNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PERSISTENT_MEMORY_TYPE_NOT_CONTAINS);
        return this;
    }

    public void setPersistentMemoryTypeNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PERSISTENT_MEMORY_TYPE_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PERSISTENT_MEMORY_TYPE_NOT_CONTAINS);
        }
    }

    public boolean getPersistentMemoryTypeNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PERSISTENT_MEMORY_TYPE_NOT_CONTAINS);
    }

    public DiskWhereInput persistentMemoryTypeNotEndsWith(String persistentMemoryTypeNotEndsWith) {

        this.persistentMemoryTypeNotEndsWith = persistentMemoryTypeNotEndsWith;
        return this;
    }

    /**
     * Get persistentMemoryTypeNotEndsWith
     *
     * @return persistentMemoryTypeNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPersistentMemoryTypeNotEndsWith() {
        return persistentMemoryTypeNotEndsWith;
    }

    public void setPersistentMemoryTypeNotEndsWith(String persistentMemoryTypeNotEndsWith) {
        this.persistentMemoryTypeNotEndsWith = persistentMemoryTypeNotEndsWith;
    }

    public DiskWhereInput persistentMemoryTypeNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PERSISTENT_MEMORY_TYPE_NOT_ENDS_WITH);
        return this;
    }

    public DiskWhereInput persistentMemoryTypeNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PERSISTENT_MEMORY_TYPE_NOT_ENDS_WITH);
        return this;
    }

    public void setPersistentMemoryTypeNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PERSISTENT_MEMORY_TYPE_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PERSISTENT_MEMORY_TYPE_NOT_ENDS_WITH);
        }
    }

    public boolean getPersistentMemoryTypeNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PERSISTENT_MEMORY_TYPE_NOT_ENDS_WITH);
    }

    public DiskWhereInput persistentMemoryTypeNotIn(List<String> persistentMemoryTypeNotIn) {

        this.persistentMemoryTypeNotIn = persistentMemoryTypeNotIn;
        return this;
    }

    public DiskWhereInput addPersistentMemoryTypeNotInItem(String persistentMemoryTypeNotInItem) {
        if (this.persistentMemoryTypeNotIn == null) {
            this.persistentMemoryTypeNotIn = new ArrayList<String>();
        }
        this.persistentMemoryTypeNotIn.add(persistentMemoryTypeNotInItem);
        return this;
    }

    /**
     * Get persistentMemoryTypeNotIn
     *
     * @return persistentMemoryTypeNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getPersistentMemoryTypeNotIn() {
        return persistentMemoryTypeNotIn;
    }

    public void setPersistentMemoryTypeNotIn(List<String> persistentMemoryTypeNotIn) {
        this.persistentMemoryTypeNotIn = persistentMemoryTypeNotIn;
    }

    public DiskWhereInput persistentMemoryTypeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PERSISTENT_MEMORY_TYPE_NOT_IN);
        return this;
    }

    public DiskWhereInput persistentMemoryTypeNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PERSISTENT_MEMORY_TYPE_NOT_IN);
        return this;
    }

    public void setPersistentMemoryTypeNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PERSISTENT_MEMORY_TYPE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PERSISTENT_MEMORY_TYPE_NOT_IN);
        }
    }

    public boolean getPersistentMemoryTypeNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PERSISTENT_MEMORY_TYPE_NOT_IN);
    }

    public DiskWhereInput persistentMemoryTypeNotStartsWith(
            String persistentMemoryTypeNotStartsWith) {

        this.persistentMemoryTypeNotStartsWith = persistentMemoryTypeNotStartsWith;
        return this;
    }

    /**
     * Get persistentMemoryTypeNotStartsWith
     *
     * @return persistentMemoryTypeNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPersistentMemoryTypeNotStartsWith() {
        return persistentMemoryTypeNotStartsWith;
    }

    public void setPersistentMemoryTypeNotStartsWith(String persistentMemoryTypeNotStartsWith) {
        this.persistentMemoryTypeNotStartsWith = persistentMemoryTypeNotStartsWith;
    }

    public DiskWhereInput persistentMemoryTypeNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PERSISTENT_MEMORY_TYPE_NOT_STARTS_WITH);
        return this;
    }

    public DiskWhereInput persistentMemoryTypeNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PERSISTENT_MEMORY_TYPE_NOT_STARTS_WITH);
        return this;
    }

    public void setPersistentMemoryTypeNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PERSISTENT_MEMORY_TYPE_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PERSISTENT_MEMORY_TYPE_NOT_STARTS_WITH);
        }
    }

    public boolean getPersistentMemoryTypeNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PERSISTENT_MEMORY_TYPE_NOT_STARTS_WITH);
    }

    public DiskWhereInput persistentMemoryTypeStartsWith(String persistentMemoryTypeStartsWith) {

        this.persistentMemoryTypeStartsWith = persistentMemoryTypeStartsWith;
        return this;
    }

    /**
     * Get persistentMemoryTypeStartsWith
     *
     * @return persistentMemoryTypeStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getPersistentMemoryTypeStartsWith() {
        return persistentMemoryTypeStartsWith;
    }

    public void setPersistentMemoryTypeStartsWith(String persistentMemoryTypeStartsWith) {
        this.persistentMemoryTypeStartsWith = persistentMemoryTypeStartsWith;
    }

    public DiskWhereInput persistentMemoryTypeStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PERSISTENT_MEMORY_TYPE_STARTS_WITH);
        return this;
    }

    public DiskWhereInput persistentMemoryTypeStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PERSISTENT_MEMORY_TYPE_STARTS_WITH);
        return this;
    }

    public void setPersistentMemoryTypeStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PERSISTENT_MEMORY_TYPE_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PERSISTENT_MEMORY_TYPE_STARTS_WITH);
        }
    }

    public boolean getPersistentMemoryTypeStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PERSISTENT_MEMORY_TYPE_STARTS_WITH);
    }

    public DiskWhereInput physicalSlotOnBrick(Integer physicalSlotOnBrick) {

        this.physicalSlotOnBrick = physicalSlotOnBrick;
        return this;
    }

    /**
     * Get physicalSlotOnBrick
     *
     * @return physicalSlotOnBrick
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getPhysicalSlotOnBrick() {
        return physicalSlotOnBrick;
    }

    public void setPhysicalSlotOnBrick(Integer physicalSlotOnBrick) {
        this.physicalSlotOnBrick = physicalSlotOnBrick;
    }

    public DiskWhereInput physicalSlotOnBrick_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PHYSICAL_SLOT_ON_BRICK);
        return this;
    }

    public DiskWhereInput physicalSlotOnBrick_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PHYSICAL_SLOT_ON_BRICK);
        return this;
    }

    public void setPhysicalSlotOnBrick_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PHYSICAL_SLOT_ON_BRICK);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PHYSICAL_SLOT_ON_BRICK);
        }
    }

    public boolean getPhysicalSlotOnBrick_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PHYSICAL_SLOT_ON_BRICK);
    }

    public DiskWhereInput physicalSlotOnBrickGt(Integer physicalSlotOnBrickGt) {

        this.physicalSlotOnBrickGt = physicalSlotOnBrickGt;
        return this;
    }

    /**
     * Get physicalSlotOnBrickGt
     *
     * @return physicalSlotOnBrickGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getPhysicalSlotOnBrickGt() {
        return physicalSlotOnBrickGt;
    }

    public void setPhysicalSlotOnBrickGt(Integer physicalSlotOnBrickGt) {
        this.physicalSlotOnBrickGt = physicalSlotOnBrickGt;
    }

    public DiskWhereInput physicalSlotOnBrickGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PHYSICAL_SLOT_ON_BRICK_GT);
        return this;
    }

    public DiskWhereInput physicalSlotOnBrickGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PHYSICAL_SLOT_ON_BRICK_GT);
        return this;
    }

    public void setPhysicalSlotOnBrickGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PHYSICAL_SLOT_ON_BRICK_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PHYSICAL_SLOT_ON_BRICK_GT);
        }
    }

    public boolean getPhysicalSlotOnBrickGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PHYSICAL_SLOT_ON_BRICK_GT);
    }

    public DiskWhereInput physicalSlotOnBrickGte(Integer physicalSlotOnBrickGte) {

        this.physicalSlotOnBrickGte = physicalSlotOnBrickGte;
        return this;
    }

    /**
     * Get physicalSlotOnBrickGte
     *
     * @return physicalSlotOnBrickGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getPhysicalSlotOnBrickGte() {
        return physicalSlotOnBrickGte;
    }

    public void setPhysicalSlotOnBrickGte(Integer physicalSlotOnBrickGte) {
        this.physicalSlotOnBrickGte = physicalSlotOnBrickGte;
    }

    public DiskWhereInput physicalSlotOnBrickGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PHYSICAL_SLOT_ON_BRICK_GTE);
        return this;
    }

    public DiskWhereInput physicalSlotOnBrickGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PHYSICAL_SLOT_ON_BRICK_GTE);
        return this;
    }

    public void setPhysicalSlotOnBrickGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PHYSICAL_SLOT_ON_BRICK_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PHYSICAL_SLOT_ON_BRICK_GTE);
        }
    }

    public boolean getPhysicalSlotOnBrickGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PHYSICAL_SLOT_ON_BRICK_GTE);
    }

    public DiskWhereInput physicalSlotOnBrickIn(List<Integer> physicalSlotOnBrickIn) {

        this.physicalSlotOnBrickIn = physicalSlotOnBrickIn;
        return this;
    }

    public DiskWhereInput addPhysicalSlotOnBrickInItem(Integer physicalSlotOnBrickInItem) {
        if (this.physicalSlotOnBrickIn == null) {
            this.physicalSlotOnBrickIn = new ArrayList<Integer>();
        }
        this.physicalSlotOnBrickIn.add(physicalSlotOnBrickInItem);
        return this;
    }

    /**
     * Get physicalSlotOnBrickIn
     *
     * @return physicalSlotOnBrickIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getPhysicalSlotOnBrickIn() {
        return physicalSlotOnBrickIn;
    }

    public void setPhysicalSlotOnBrickIn(List<Integer> physicalSlotOnBrickIn) {
        this.physicalSlotOnBrickIn = physicalSlotOnBrickIn;
    }

    public DiskWhereInput physicalSlotOnBrickIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PHYSICAL_SLOT_ON_BRICK_IN);
        return this;
    }

    public DiskWhereInput physicalSlotOnBrickIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PHYSICAL_SLOT_ON_BRICK_IN);
        return this;
    }

    public void setPhysicalSlotOnBrickIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PHYSICAL_SLOT_ON_BRICK_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PHYSICAL_SLOT_ON_BRICK_IN);
        }
    }

    public boolean getPhysicalSlotOnBrickIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PHYSICAL_SLOT_ON_BRICK_IN);
    }

    public DiskWhereInput physicalSlotOnBrickLt(Integer physicalSlotOnBrickLt) {

        this.physicalSlotOnBrickLt = physicalSlotOnBrickLt;
        return this;
    }

    /**
     * Get physicalSlotOnBrickLt
     *
     * @return physicalSlotOnBrickLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getPhysicalSlotOnBrickLt() {
        return physicalSlotOnBrickLt;
    }

    public void setPhysicalSlotOnBrickLt(Integer physicalSlotOnBrickLt) {
        this.physicalSlotOnBrickLt = physicalSlotOnBrickLt;
    }

    public DiskWhereInput physicalSlotOnBrickLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PHYSICAL_SLOT_ON_BRICK_LT);
        return this;
    }

    public DiskWhereInput physicalSlotOnBrickLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PHYSICAL_SLOT_ON_BRICK_LT);
        return this;
    }

    public void setPhysicalSlotOnBrickLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PHYSICAL_SLOT_ON_BRICK_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PHYSICAL_SLOT_ON_BRICK_LT);
        }
    }

    public boolean getPhysicalSlotOnBrickLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PHYSICAL_SLOT_ON_BRICK_LT);
    }

    public DiskWhereInput physicalSlotOnBrickLte(Integer physicalSlotOnBrickLte) {

        this.physicalSlotOnBrickLte = physicalSlotOnBrickLte;
        return this;
    }

    /**
     * Get physicalSlotOnBrickLte
     *
     * @return physicalSlotOnBrickLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getPhysicalSlotOnBrickLte() {
        return physicalSlotOnBrickLte;
    }

    public void setPhysicalSlotOnBrickLte(Integer physicalSlotOnBrickLte) {
        this.physicalSlotOnBrickLte = physicalSlotOnBrickLte;
    }

    public DiskWhereInput physicalSlotOnBrickLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PHYSICAL_SLOT_ON_BRICK_LTE);
        return this;
    }

    public DiskWhereInput physicalSlotOnBrickLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PHYSICAL_SLOT_ON_BRICK_LTE);
        return this;
    }

    public void setPhysicalSlotOnBrickLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PHYSICAL_SLOT_ON_BRICK_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PHYSICAL_SLOT_ON_BRICK_LTE);
        }
    }

    public boolean getPhysicalSlotOnBrickLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PHYSICAL_SLOT_ON_BRICK_LTE);
    }

    public DiskWhereInput physicalSlotOnBrickNot(Integer physicalSlotOnBrickNot) {

        this.physicalSlotOnBrickNot = physicalSlotOnBrickNot;
        return this;
    }

    /**
     * Get physicalSlotOnBrickNot
     *
     * @return physicalSlotOnBrickNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getPhysicalSlotOnBrickNot() {
        return physicalSlotOnBrickNot;
    }

    public void setPhysicalSlotOnBrickNot(Integer physicalSlotOnBrickNot) {
        this.physicalSlotOnBrickNot = physicalSlotOnBrickNot;
    }

    public DiskWhereInput physicalSlotOnBrickNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PHYSICAL_SLOT_ON_BRICK_NOT);
        return this;
    }

    public DiskWhereInput physicalSlotOnBrickNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PHYSICAL_SLOT_ON_BRICK_NOT);
        return this;
    }

    public void setPhysicalSlotOnBrickNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PHYSICAL_SLOT_ON_BRICK_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PHYSICAL_SLOT_ON_BRICK_NOT);
        }
    }

    public boolean getPhysicalSlotOnBrickNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PHYSICAL_SLOT_ON_BRICK_NOT);
    }

    public DiskWhereInput physicalSlotOnBrickNotIn(List<Integer> physicalSlotOnBrickNotIn) {

        this.physicalSlotOnBrickNotIn = physicalSlotOnBrickNotIn;
        return this;
    }

    public DiskWhereInput addPhysicalSlotOnBrickNotInItem(Integer physicalSlotOnBrickNotInItem) {
        if (this.physicalSlotOnBrickNotIn == null) {
            this.physicalSlotOnBrickNotIn = new ArrayList<Integer>();
        }
        this.physicalSlotOnBrickNotIn.add(physicalSlotOnBrickNotInItem);
        return this;
    }

    /**
     * Get physicalSlotOnBrickNotIn
     *
     * @return physicalSlotOnBrickNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getPhysicalSlotOnBrickNotIn() {
        return physicalSlotOnBrickNotIn;
    }

    public void setPhysicalSlotOnBrickNotIn(List<Integer> physicalSlotOnBrickNotIn) {
        this.physicalSlotOnBrickNotIn = physicalSlotOnBrickNotIn;
    }

    public DiskWhereInput physicalSlotOnBrickNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PHYSICAL_SLOT_ON_BRICK_NOT_IN);
        return this;
    }

    public DiskWhereInput physicalSlotOnBrickNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PHYSICAL_SLOT_ON_BRICK_NOT_IN);
        return this;
    }

    public void setPhysicalSlotOnBrickNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PHYSICAL_SLOT_ON_BRICK_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PHYSICAL_SLOT_ON_BRICK_NOT_IN);
        }
    }

    public boolean getPhysicalSlotOnBrickNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PHYSICAL_SLOT_ON_BRICK_NOT_IN);
    }

    public DiskWhereInput pmemDimmsEvery(PmemDimmWhereInput pmemDimmsEvery) {

        this.pmemDimmsEvery = pmemDimmsEvery;
        return this;
    }

    /**
     * Get pmemDimmsEvery
     *
     * @return pmemDimmsEvery
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public PmemDimmWhereInput getPmemDimmsEvery() {
        return pmemDimmsEvery;
    }

    public void setPmemDimmsEvery(PmemDimmWhereInput pmemDimmsEvery) {
        this.pmemDimmsEvery = pmemDimmsEvery;
    }

    public DiskWhereInput pmemDimmsEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PMEM_DIMMS_EVERY);
        return this;
    }

    public DiskWhereInput pmemDimmsEvery_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PMEM_DIMMS_EVERY);
        return this;
    }

    public void setPmemDimmsEvery_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PMEM_DIMMS_EVERY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PMEM_DIMMS_EVERY);
        }
    }

    public boolean getPmemDimmsEvery_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PMEM_DIMMS_EVERY);
    }

    public DiskWhereInput pmemDimmsNone(PmemDimmWhereInput pmemDimmsNone) {

        this.pmemDimmsNone = pmemDimmsNone;
        return this;
    }

    /**
     * Get pmemDimmsNone
     *
     * @return pmemDimmsNone
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public PmemDimmWhereInput getPmemDimmsNone() {
        return pmemDimmsNone;
    }

    public void setPmemDimmsNone(PmemDimmWhereInput pmemDimmsNone) {
        this.pmemDimmsNone = pmemDimmsNone;
    }

    public DiskWhereInput pmemDimmsNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PMEM_DIMMS_NONE);
        return this;
    }

    public DiskWhereInput pmemDimmsNone_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PMEM_DIMMS_NONE);
        return this;
    }

    public void setPmemDimmsNone_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PMEM_DIMMS_NONE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PMEM_DIMMS_NONE);
        }
    }

    public boolean getPmemDimmsNone_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PMEM_DIMMS_NONE);
    }

    public DiskWhereInput pmemDimmsSome(PmemDimmWhereInput pmemDimmsSome) {

        this.pmemDimmsSome = pmemDimmsSome;
        return this;
    }

    /**
     * Get pmemDimmsSome
     *
     * @return pmemDimmsSome
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public PmemDimmWhereInput getPmemDimmsSome() {
        return pmemDimmsSome;
    }

    public void setPmemDimmsSome(PmemDimmWhereInput pmemDimmsSome) {
        this.pmemDimmsSome = pmemDimmsSome;
    }

    public DiskWhereInput pmemDimmsSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_PMEM_DIMMS_SOME);
        return this;
    }

    public DiskWhereInput pmemDimmsSome_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_PMEM_DIMMS_SOME);
        return this;
    }

    public void setPmemDimmsSome_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_PMEM_DIMMS_SOME);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_PMEM_DIMMS_SOME);
        }
    }

    public boolean getPmemDimmsSome_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_PMEM_DIMMS_SOME);
    }

    public DiskWhereInput recommendedUsage(DiskUsage recommendedUsage) {

        this.recommendedUsage = recommendedUsage;
        return this;
    }

    /**
     * Get recommendedUsage
     *
     * @return recommendedUsage
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public DiskUsage getRecommendedUsage() {
        return recommendedUsage;
    }

    public void setRecommendedUsage(DiskUsage recommendedUsage) {
        this.recommendedUsage = recommendedUsage;
    }

    public DiskWhereInput recommendedUsage_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RECOMMENDED_USAGE);
        return this;
    }

    public DiskWhereInput recommendedUsage_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RECOMMENDED_USAGE);
        return this;
    }

    public void setRecommendedUsage_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RECOMMENDED_USAGE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RECOMMENDED_USAGE);
        }
    }

    public boolean getRecommendedUsage_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RECOMMENDED_USAGE);
    }

    public DiskWhereInput recommendedUsageIn(List<DiskUsage> recommendedUsageIn) {

        this.recommendedUsageIn = recommendedUsageIn;
        return this;
    }

    public DiskWhereInput addRecommendedUsageInItem(DiskUsage recommendedUsageInItem) {
        if (this.recommendedUsageIn == null) {
            this.recommendedUsageIn = new ArrayList<DiskUsage>();
        }
        this.recommendedUsageIn.add(recommendedUsageInItem);
        return this;
    }

    /**
     * Get recommendedUsageIn
     *
     * @return recommendedUsageIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<DiskUsage> getRecommendedUsageIn() {
        return recommendedUsageIn;
    }

    public void setRecommendedUsageIn(List<DiskUsage> recommendedUsageIn) {
        this.recommendedUsageIn = recommendedUsageIn;
    }

    public DiskWhereInput recommendedUsageIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RECOMMENDED_USAGE_IN);
        return this;
    }

    public DiskWhereInput recommendedUsageIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RECOMMENDED_USAGE_IN);
        return this;
    }

    public void setRecommendedUsageIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RECOMMENDED_USAGE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RECOMMENDED_USAGE_IN);
        }
    }

    public boolean getRecommendedUsageIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RECOMMENDED_USAGE_IN);
    }

    public DiskWhereInput recommendedUsageNot(DiskUsage recommendedUsageNot) {

        this.recommendedUsageNot = recommendedUsageNot;
        return this;
    }

    /**
     * Get recommendedUsageNot
     *
     * @return recommendedUsageNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public DiskUsage getRecommendedUsageNot() {
        return recommendedUsageNot;
    }

    public void setRecommendedUsageNot(DiskUsage recommendedUsageNot) {
        this.recommendedUsageNot = recommendedUsageNot;
    }

    public DiskWhereInput recommendedUsageNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RECOMMENDED_USAGE_NOT);
        return this;
    }

    public DiskWhereInput recommendedUsageNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RECOMMENDED_USAGE_NOT);
        return this;
    }

    public void setRecommendedUsageNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RECOMMENDED_USAGE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RECOMMENDED_USAGE_NOT);
        }
    }

    public boolean getRecommendedUsageNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RECOMMENDED_USAGE_NOT);
    }

    public DiskWhereInput recommendedUsageNotIn(List<DiskUsage> recommendedUsageNotIn) {

        this.recommendedUsageNotIn = recommendedUsageNotIn;
        return this;
    }

    public DiskWhereInput addRecommendedUsageNotInItem(DiskUsage recommendedUsageNotInItem) {
        if (this.recommendedUsageNotIn == null) {
            this.recommendedUsageNotIn = new ArrayList<DiskUsage>();
        }
        this.recommendedUsageNotIn.add(recommendedUsageNotInItem);
        return this;
    }

    /**
     * Get recommendedUsageNotIn
     *
     * @return recommendedUsageNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<DiskUsage> getRecommendedUsageNotIn() {
        return recommendedUsageNotIn;
    }

    public void setRecommendedUsageNotIn(List<DiskUsage> recommendedUsageNotIn) {
        this.recommendedUsageNotIn = recommendedUsageNotIn;
    }

    public DiskWhereInput recommendedUsageNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_RECOMMENDED_USAGE_NOT_IN);
        return this;
    }

    public DiskWhereInput recommendedUsageNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_RECOMMENDED_USAGE_NOT_IN);
        return this;
    }

    public void setRecommendedUsageNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_RECOMMENDED_USAGE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_RECOMMENDED_USAGE_NOT_IN);
        }
    }

    public boolean getRecommendedUsageNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_RECOMMENDED_USAGE_NOT_IN);
    }

    public DiskWhereInput remainingLifePercent(Integer remainingLifePercent) {

        this.remainingLifePercent = remainingLifePercent;
        return this;
    }

    /**
     * Get remainingLifePercent
     *
     * @return remainingLifePercent
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getRemainingLifePercent() {
        return remainingLifePercent;
    }

    public void setRemainingLifePercent(Integer remainingLifePercent) {
        this.remainingLifePercent = remainingLifePercent;
    }

    public DiskWhereInput remainingLifePercent_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REMAINING_LIFE_PERCENT);
        return this;
    }

    public DiskWhereInput remainingLifePercent_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REMAINING_LIFE_PERCENT);
        return this;
    }

    public void setRemainingLifePercent_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REMAINING_LIFE_PERCENT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REMAINING_LIFE_PERCENT);
        }
    }

    public boolean getRemainingLifePercent_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REMAINING_LIFE_PERCENT);
    }

    public DiskWhereInput remainingLifePercentGt(Integer remainingLifePercentGt) {

        this.remainingLifePercentGt = remainingLifePercentGt;
        return this;
    }

    /**
     * Get remainingLifePercentGt
     *
     * @return remainingLifePercentGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getRemainingLifePercentGt() {
        return remainingLifePercentGt;
    }

    public void setRemainingLifePercentGt(Integer remainingLifePercentGt) {
        this.remainingLifePercentGt = remainingLifePercentGt;
    }

    public DiskWhereInput remainingLifePercentGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REMAINING_LIFE_PERCENT_GT);
        return this;
    }

    public DiskWhereInput remainingLifePercentGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REMAINING_LIFE_PERCENT_GT);
        return this;
    }

    public void setRemainingLifePercentGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REMAINING_LIFE_PERCENT_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REMAINING_LIFE_PERCENT_GT);
        }
    }

    public boolean getRemainingLifePercentGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REMAINING_LIFE_PERCENT_GT);
    }

    public DiskWhereInput remainingLifePercentGte(Integer remainingLifePercentGte) {

        this.remainingLifePercentGte = remainingLifePercentGte;
        return this;
    }

    /**
     * Get remainingLifePercentGte
     *
     * @return remainingLifePercentGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getRemainingLifePercentGte() {
        return remainingLifePercentGte;
    }

    public void setRemainingLifePercentGte(Integer remainingLifePercentGte) {
        this.remainingLifePercentGte = remainingLifePercentGte;
    }

    public DiskWhereInput remainingLifePercentGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REMAINING_LIFE_PERCENT_GTE);
        return this;
    }

    public DiskWhereInput remainingLifePercentGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REMAINING_LIFE_PERCENT_GTE);
        return this;
    }

    public void setRemainingLifePercentGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REMAINING_LIFE_PERCENT_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REMAINING_LIFE_PERCENT_GTE);
        }
    }

    public boolean getRemainingLifePercentGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REMAINING_LIFE_PERCENT_GTE);
    }

    public DiskWhereInput remainingLifePercentIn(List<Integer> remainingLifePercentIn) {

        this.remainingLifePercentIn = remainingLifePercentIn;
        return this;
    }

    public DiskWhereInput addRemainingLifePercentInItem(Integer remainingLifePercentInItem) {
        if (this.remainingLifePercentIn == null) {
            this.remainingLifePercentIn = new ArrayList<Integer>();
        }
        this.remainingLifePercentIn.add(remainingLifePercentInItem);
        return this;
    }

    /**
     * Get remainingLifePercentIn
     *
     * @return remainingLifePercentIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getRemainingLifePercentIn() {
        return remainingLifePercentIn;
    }

    public void setRemainingLifePercentIn(List<Integer> remainingLifePercentIn) {
        this.remainingLifePercentIn = remainingLifePercentIn;
    }

    public DiskWhereInput remainingLifePercentIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REMAINING_LIFE_PERCENT_IN);
        return this;
    }

    public DiskWhereInput remainingLifePercentIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REMAINING_LIFE_PERCENT_IN);
        return this;
    }

    public void setRemainingLifePercentIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REMAINING_LIFE_PERCENT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REMAINING_LIFE_PERCENT_IN);
        }
    }

    public boolean getRemainingLifePercentIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REMAINING_LIFE_PERCENT_IN);
    }

    public DiskWhereInput remainingLifePercentLt(Integer remainingLifePercentLt) {

        this.remainingLifePercentLt = remainingLifePercentLt;
        return this;
    }

    /**
     * Get remainingLifePercentLt
     *
     * @return remainingLifePercentLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getRemainingLifePercentLt() {
        return remainingLifePercentLt;
    }

    public void setRemainingLifePercentLt(Integer remainingLifePercentLt) {
        this.remainingLifePercentLt = remainingLifePercentLt;
    }

    public DiskWhereInput remainingLifePercentLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REMAINING_LIFE_PERCENT_LT);
        return this;
    }

    public DiskWhereInput remainingLifePercentLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REMAINING_LIFE_PERCENT_LT);
        return this;
    }

    public void setRemainingLifePercentLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REMAINING_LIFE_PERCENT_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REMAINING_LIFE_PERCENT_LT);
        }
    }

    public boolean getRemainingLifePercentLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REMAINING_LIFE_PERCENT_LT);
    }

    public DiskWhereInput remainingLifePercentLte(Integer remainingLifePercentLte) {

        this.remainingLifePercentLte = remainingLifePercentLte;
        return this;
    }

    /**
     * Get remainingLifePercentLte
     *
     * @return remainingLifePercentLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getRemainingLifePercentLte() {
        return remainingLifePercentLte;
    }

    public void setRemainingLifePercentLte(Integer remainingLifePercentLte) {
        this.remainingLifePercentLte = remainingLifePercentLte;
    }

    public DiskWhereInput remainingLifePercentLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REMAINING_LIFE_PERCENT_LTE);
        return this;
    }

    public DiskWhereInput remainingLifePercentLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REMAINING_LIFE_PERCENT_LTE);
        return this;
    }

    public void setRemainingLifePercentLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REMAINING_LIFE_PERCENT_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REMAINING_LIFE_PERCENT_LTE);
        }
    }

    public boolean getRemainingLifePercentLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REMAINING_LIFE_PERCENT_LTE);
    }

    public DiskWhereInput remainingLifePercentNot(Integer remainingLifePercentNot) {

        this.remainingLifePercentNot = remainingLifePercentNot;
        return this;
    }

    /**
     * Get remainingLifePercentNot
     *
     * @return remainingLifePercentNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getRemainingLifePercentNot() {
        return remainingLifePercentNot;
    }

    public void setRemainingLifePercentNot(Integer remainingLifePercentNot) {
        this.remainingLifePercentNot = remainingLifePercentNot;
    }

    public DiskWhereInput remainingLifePercentNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REMAINING_LIFE_PERCENT_NOT);
        return this;
    }

    public DiskWhereInput remainingLifePercentNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REMAINING_LIFE_PERCENT_NOT);
        return this;
    }

    public void setRemainingLifePercentNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REMAINING_LIFE_PERCENT_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REMAINING_LIFE_PERCENT_NOT);
        }
    }

    public boolean getRemainingLifePercentNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REMAINING_LIFE_PERCENT_NOT);
    }

    public DiskWhereInput remainingLifePercentNotIn(List<Integer> remainingLifePercentNotIn) {

        this.remainingLifePercentNotIn = remainingLifePercentNotIn;
        return this;
    }

    public DiskWhereInput addRemainingLifePercentNotInItem(Integer remainingLifePercentNotInItem) {
        if (this.remainingLifePercentNotIn == null) {
            this.remainingLifePercentNotIn = new ArrayList<Integer>();
        }
        this.remainingLifePercentNotIn.add(remainingLifePercentNotInItem);
        return this;
    }

    /**
     * Get remainingLifePercentNotIn
     *
     * @return remainingLifePercentNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getRemainingLifePercentNotIn() {
        return remainingLifePercentNotIn;
    }

    public void setRemainingLifePercentNotIn(List<Integer> remainingLifePercentNotIn) {
        this.remainingLifePercentNotIn = remainingLifePercentNotIn;
    }

    public DiskWhereInput remainingLifePercentNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_REMAINING_LIFE_PERCENT_NOT_IN);
        return this;
    }

    public DiskWhereInput remainingLifePercentNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_REMAINING_LIFE_PERCENT_NOT_IN);
        return this;
    }

    public void setRemainingLifePercentNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_REMAINING_LIFE_PERCENT_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_REMAINING_LIFE_PERCENT_NOT_IN);
        }
    }

    public boolean getRemainingLifePercentNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_REMAINING_LIFE_PERCENT_NOT_IN);
    }

    public DiskWhereInput serial(String serial) {

        this.serial = serial;
        return this;
    }

    /**
     * Get serial
     *
     * @return serial
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public DiskWhereInput serial_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SERIAL);
        return this;
    }

    public DiskWhereInput serial_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SERIAL);
        return this;
    }

    public void setSerial_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SERIAL);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SERIAL);
        }
    }

    public boolean getSerial_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SERIAL);
    }

    public DiskWhereInput serialContains(String serialContains) {

        this.serialContains = serialContains;
        return this;
    }

    /**
     * Get serialContains
     *
     * @return serialContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSerialContains() {
        return serialContains;
    }

    public void setSerialContains(String serialContains) {
        this.serialContains = serialContains;
    }

    public DiskWhereInput serialContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SERIAL_CONTAINS);
        return this;
    }

    public DiskWhereInput serialContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SERIAL_CONTAINS);
        return this;
    }

    public void setSerialContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SERIAL_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SERIAL_CONTAINS);
        }
    }

    public boolean getSerialContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SERIAL_CONTAINS);
    }

    public DiskWhereInput serialEndsWith(String serialEndsWith) {

        this.serialEndsWith = serialEndsWith;
        return this;
    }

    /**
     * Get serialEndsWith
     *
     * @return serialEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSerialEndsWith() {
        return serialEndsWith;
    }

    public void setSerialEndsWith(String serialEndsWith) {
        this.serialEndsWith = serialEndsWith;
    }

    public DiskWhereInput serialEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SERIAL_ENDS_WITH);
        return this;
    }

    public DiskWhereInput serialEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SERIAL_ENDS_WITH);
        return this;
    }

    public void setSerialEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SERIAL_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SERIAL_ENDS_WITH);
        }
    }

    public boolean getSerialEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SERIAL_ENDS_WITH);
    }

    public DiskWhereInput serialGt(String serialGt) {

        this.serialGt = serialGt;
        return this;
    }

    /**
     * Get serialGt
     *
     * @return serialGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSerialGt() {
        return serialGt;
    }

    public void setSerialGt(String serialGt) {
        this.serialGt = serialGt;
    }

    public DiskWhereInput serialGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SERIAL_GT);
        return this;
    }

    public DiskWhereInput serialGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SERIAL_GT);
        return this;
    }

    public void setSerialGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SERIAL_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SERIAL_GT);
        }
    }

    public boolean getSerialGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SERIAL_GT);
    }

    public DiskWhereInput serialGte(String serialGte) {

        this.serialGte = serialGte;
        return this;
    }

    /**
     * Get serialGte
     *
     * @return serialGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSerialGte() {
        return serialGte;
    }

    public void setSerialGte(String serialGte) {
        this.serialGte = serialGte;
    }

    public DiskWhereInput serialGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SERIAL_GTE);
        return this;
    }

    public DiskWhereInput serialGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SERIAL_GTE);
        return this;
    }

    public void setSerialGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SERIAL_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SERIAL_GTE);
        }
    }

    public boolean getSerialGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SERIAL_GTE);
    }

    public DiskWhereInput serialIn(List<String> serialIn) {

        this.serialIn = serialIn;
        return this;
    }

    public DiskWhereInput addSerialInItem(String serialInItem) {
        if (this.serialIn == null) {
            this.serialIn = new ArrayList<String>();
        }
        this.serialIn.add(serialInItem);
        return this;
    }

    /**
     * Get serialIn
     *
     * @return serialIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getSerialIn() {
        return serialIn;
    }

    public void setSerialIn(List<String> serialIn) {
        this.serialIn = serialIn;
    }

    public DiskWhereInput serialIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SERIAL_IN);
        return this;
    }

    public DiskWhereInput serialIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SERIAL_IN);
        return this;
    }

    public void setSerialIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SERIAL_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SERIAL_IN);
        }
    }

    public boolean getSerialIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SERIAL_IN);
    }

    public DiskWhereInput serialLt(String serialLt) {

        this.serialLt = serialLt;
        return this;
    }

    /**
     * Get serialLt
     *
     * @return serialLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSerialLt() {
        return serialLt;
    }

    public void setSerialLt(String serialLt) {
        this.serialLt = serialLt;
    }

    public DiskWhereInput serialLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SERIAL_LT);
        return this;
    }

    public DiskWhereInput serialLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SERIAL_LT);
        return this;
    }

    public void setSerialLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SERIAL_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SERIAL_LT);
        }
    }

    public boolean getSerialLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SERIAL_LT);
    }

    public DiskWhereInput serialLte(String serialLte) {

        this.serialLte = serialLte;
        return this;
    }

    /**
     * Get serialLte
     *
     * @return serialLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSerialLte() {
        return serialLte;
    }

    public void setSerialLte(String serialLte) {
        this.serialLte = serialLte;
    }

    public DiskWhereInput serialLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SERIAL_LTE);
        return this;
    }

    public DiskWhereInput serialLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SERIAL_LTE);
        return this;
    }

    public void setSerialLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SERIAL_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SERIAL_LTE);
        }
    }

    public boolean getSerialLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SERIAL_LTE);
    }

    public DiskWhereInput serialNot(String serialNot) {

        this.serialNot = serialNot;
        return this;
    }

    /**
     * Get serialNot
     *
     * @return serialNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSerialNot() {
        return serialNot;
    }

    public void setSerialNot(String serialNot) {
        this.serialNot = serialNot;
    }

    public DiskWhereInput serialNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SERIAL_NOT);
        return this;
    }

    public DiskWhereInput serialNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SERIAL_NOT);
        return this;
    }

    public void setSerialNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SERIAL_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SERIAL_NOT);
        }
    }

    public boolean getSerialNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SERIAL_NOT);
    }

    public DiskWhereInput serialNotContains(String serialNotContains) {

        this.serialNotContains = serialNotContains;
        return this;
    }

    /**
     * Get serialNotContains
     *
     * @return serialNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSerialNotContains() {
        return serialNotContains;
    }

    public void setSerialNotContains(String serialNotContains) {
        this.serialNotContains = serialNotContains;
    }

    public DiskWhereInput serialNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SERIAL_NOT_CONTAINS);
        return this;
    }

    public DiskWhereInput serialNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SERIAL_NOT_CONTAINS);
        return this;
    }

    public void setSerialNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SERIAL_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SERIAL_NOT_CONTAINS);
        }
    }

    public boolean getSerialNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SERIAL_NOT_CONTAINS);
    }

    public DiskWhereInput serialNotEndsWith(String serialNotEndsWith) {

        this.serialNotEndsWith = serialNotEndsWith;
        return this;
    }

    /**
     * Get serialNotEndsWith
     *
     * @return serialNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSerialNotEndsWith() {
        return serialNotEndsWith;
    }

    public void setSerialNotEndsWith(String serialNotEndsWith) {
        this.serialNotEndsWith = serialNotEndsWith;
    }

    public DiskWhereInput serialNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SERIAL_NOT_ENDS_WITH);
        return this;
    }

    public DiskWhereInput serialNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SERIAL_NOT_ENDS_WITH);
        return this;
    }

    public void setSerialNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SERIAL_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SERIAL_NOT_ENDS_WITH);
        }
    }

    public boolean getSerialNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SERIAL_NOT_ENDS_WITH);
    }

    public DiskWhereInput serialNotIn(List<String> serialNotIn) {

        this.serialNotIn = serialNotIn;
        return this;
    }

    public DiskWhereInput addSerialNotInItem(String serialNotInItem) {
        if (this.serialNotIn == null) {
            this.serialNotIn = new ArrayList<String>();
        }
        this.serialNotIn.add(serialNotInItem);
        return this;
    }

    /**
     * Get serialNotIn
     *
     * @return serialNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getSerialNotIn() {
        return serialNotIn;
    }

    public void setSerialNotIn(List<String> serialNotIn) {
        this.serialNotIn = serialNotIn;
    }

    public DiskWhereInput serialNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SERIAL_NOT_IN);
        return this;
    }

    public DiskWhereInput serialNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SERIAL_NOT_IN);
        return this;
    }

    public void setSerialNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SERIAL_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SERIAL_NOT_IN);
        }
    }

    public boolean getSerialNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SERIAL_NOT_IN);
    }

    public DiskWhereInput serialNotStartsWith(String serialNotStartsWith) {

        this.serialNotStartsWith = serialNotStartsWith;
        return this;
    }

    /**
     * Get serialNotStartsWith
     *
     * @return serialNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSerialNotStartsWith() {
        return serialNotStartsWith;
    }

    public void setSerialNotStartsWith(String serialNotStartsWith) {
        this.serialNotStartsWith = serialNotStartsWith;
    }

    public DiskWhereInput serialNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SERIAL_NOT_STARTS_WITH);
        return this;
    }

    public DiskWhereInput serialNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SERIAL_NOT_STARTS_WITH);
        return this;
    }

    public void setSerialNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SERIAL_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SERIAL_NOT_STARTS_WITH);
        }
    }

    public boolean getSerialNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SERIAL_NOT_STARTS_WITH);
    }

    public DiskWhereInput serialStartsWith(String serialStartsWith) {

        this.serialStartsWith = serialStartsWith;
        return this;
    }

    /**
     * Get serialStartsWith
     *
     * @return serialStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getSerialStartsWith() {
        return serialStartsWith;
    }

    public void setSerialStartsWith(String serialStartsWith) {
        this.serialStartsWith = serialStartsWith;
    }

    public DiskWhereInput serialStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SERIAL_STARTS_WITH);
        return this;
    }

    public DiskWhereInput serialStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_SERIAL_STARTS_WITH);
        return this;
    }

    public void setSerialStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_SERIAL_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_SERIAL_STARTS_WITH);
        }
    }

    public boolean getSerialStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_SERIAL_STARTS_WITH);
    }

    public DiskWhereInput size(Long size) {

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

    public DiskWhereInput size_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIZE);
        return this;
    }

    public DiskWhereInput size_ExplictlyNonNull() {
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

    public DiskWhereInput sizeGt(Long sizeGt) {

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

    public DiskWhereInput sizeGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIZE_GT);
        return this;
    }

    public DiskWhereInput sizeGt_ExplictlyNonNull() {
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

    public DiskWhereInput sizeGte(Long sizeGte) {

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

    public DiskWhereInput sizeGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIZE_GTE);
        return this;
    }

    public DiskWhereInput sizeGte_ExplictlyNonNull() {
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

    public DiskWhereInput sizeIn(List<Long> sizeIn) {

        this.sizeIn = sizeIn;
        return this;
    }

    public DiskWhereInput addSizeInItem(Long sizeInItem) {
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

    public DiskWhereInput sizeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIZE_IN);
        return this;
    }

    public DiskWhereInput sizeIn_ExplictlyNonNull() {
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

    public DiskWhereInput sizeLt(Long sizeLt) {

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

    public DiskWhereInput sizeLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIZE_LT);
        return this;
    }

    public DiskWhereInput sizeLt_ExplictlyNonNull() {
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

    public DiskWhereInput sizeLte(Long sizeLte) {

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

    public DiskWhereInput sizeLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIZE_LTE);
        return this;
    }

    public DiskWhereInput sizeLte_ExplictlyNonNull() {
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

    public DiskWhereInput sizeNot(Long sizeNot) {

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

    public DiskWhereInput sizeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIZE_NOT);
        return this;
    }

    public DiskWhereInput sizeNot_ExplictlyNonNull() {
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

    public DiskWhereInput sizeNotIn(List<Long> sizeNotIn) {

        this.sizeNotIn = sizeNotIn;
        return this;
    }

    public DiskWhereInput addSizeNotInItem(Long sizeNotInItem) {
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

    public DiskWhereInput sizeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIZE_NOT_IN);
        return this;
    }

    public DiskWhereInput sizeNotIn_ExplictlyNonNull() {
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

    public DiskWhereInput type(DiskType type) {

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
    public DiskType getType() {
        return type;
    }

    public void setType(DiskType type) {
        this.type = type;
    }

    public DiskWhereInput type_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE);
        return this;
    }

    public DiskWhereInput type_ExplictlyNonNull() {
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

    public DiskWhereInput typeIn(List<DiskType> typeIn) {

        this.typeIn = typeIn;
        return this;
    }

    public DiskWhereInput addTypeInItem(DiskType typeInItem) {
        if (this.typeIn == null) {
            this.typeIn = new ArrayList<DiskType>();
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
    public List<DiskType> getTypeIn() {
        return typeIn;
    }

    public void setTypeIn(List<DiskType> typeIn) {
        this.typeIn = typeIn;
    }

    public DiskWhereInput typeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE_IN);
        return this;
    }

    public DiskWhereInput typeIn_ExplictlyNonNull() {
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

    public DiskWhereInput typeNot(DiskType typeNot) {

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
    public DiskType getTypeNot() {
        return typeNot;
    }

    public void setTypeNot(DiskType typeNot) {
        this.typeNot = typeNot;
    }

    public DiskWhereInput typeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE_NOT);
        return this;
    }

    public DiskWhereInput typeNot_ExplictlyNonNull() {
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

    public DiskWhereInput typeNotIn(List<DiskType> typeNotIn) {

        this.typeNotIn = typeNotIn;
        return this;
    }

    public DiskWhereInput addTypeNotInItem(DiskType typeNotInItem) {
        if (this.typeNotIn == null) {
            this.typeNotIn = new ArrayList<DiskType>();
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
    public List<DiskType> getTypeNotIn() {
        return typeNotIn;
    }

    public void setTypeNotIn(List<DiskType> typeNotIn) {
        this.typeNotIn = typeNotIn;
    }

    public DiskWhereInput typeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_TYPE_NOT_IN);
        return this;
    }

    public DiskWhereInput typeNotIn_ExplictlyNonNull() {
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

    public DiskWhereInput usage(DiskUsage usage) {

        this.usage = usage;
        return this;
    }

    /**
     * Get usage
     *
     * @return usage
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public DiskUsage getUsage() {
        return usage;
    }

    public void setUsage(DiskUsage usage) {
        this.usage = usage;
    }

    public DiskWhereInput usage_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USAGE);
        return this;
    }

    public DiskWhereInput usage_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USAGE);
        return this;
    }

    public void setUsage_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USAGE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USAGE);
        }
    }

    public boolean getUsage_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USAGE);
    }

    public DiskWhereInput usageIn(List<DiskUsage> usageIn) {

        this.usageIn = usageIn;
        return this;
    }

    public DiskWhereInput addUsageInItem(DiskUsage usageInItem) {
        if (this.usageIn == null) {
            this.usageIn = new ArrayList<DiskUsage>();
        }
        this.usageIn.add(usageInItem);
        return this;
    }

    /**
     * Get usageIn
     *
     * @return usageIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<DiskUsage> getUsageIn() {
        return usageIn;
    }

    public void setUsageIn(List<DiskUsage> usageIn) {
        this.usageIn = usageIn;
    }

    public DiskWhereInput usageIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USAGE_IN);
        return this;
    }

    public DiskWhereInput usageIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USAGE_IN);
        return this;
    }

    public void setUsageIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USAGE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USAGE_IN);
        }
    }

    public boolean getUsageIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USAGE_IN);
    }

    public DiskWhereInput usageNot(DiskUsage usageNot) {

        this.usageNot = usageNot;
        return this;
    }

    /**
     * Get usageNot
     *
     * @return usageNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public DiskUsage getUsageNot() {
        return usageNot;
    }

    public void setUsageNot(DiskUsage usageNot) {
        this.usageNot = usageNot;
    }

    public DiskWhereInput usageNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USAGE_NOT);
        return this;
    }

    public DiskWhereInput usageNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USAGE_NOT);
        return this;
    }

    public void setUsageNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USAGE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USAGE_NOT);
        }
    }

    public boolean getUsageNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USAGE_NOT);
    }

    public DiskWhereInput usageNotIn(List<DiskUsage> usageNotIn) {

        this.usageNotIn = usageNotIn;
        return this;
    }

    public DiskWhereInput addUsageNotInItem(DiskUsage usageNotInItem) {
        if (this.usageNotIn == null) {
            this.usageNotIn = new ArrayList<DiskUsage>();
        }
        this.usageNotIn.add(usageNotInItem);
        return this;
    }

    /**
     * Get usageNotIn
     *
     * @return usageNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<DiskUsage> getUsageNotIn() {
        return usageNotIn;
    }

    public void setUsageNotIn(List<DiskUsage> usageNotIn) {
        this.usageNotIn = usageNotIn;
    }

    public DiskWhereInput usageNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USAGE_NOT_IN);
        return this;
    }

    public DiskWhereInput usageNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USAGE_NOT_IN);
        return this;
    }

    public void setUsageNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USAGE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USAGE_NOT_IN);
        }
    }

    public boolean getUsageNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USAGE_NOT_IN);
    }

    public DiskWhereInput usageStatus(DiskUsageStatus usageStatus) {

        this.usageStatus = usageStatus;
        return this;
    }

    /**
     * Get usageStatus
     *
     * @return usageStatus
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public DiskUsageStatus getUsageStatus() {
        return usageStatus;
    }

    public void setUsageStatus(DiskUsageStatus usageStatus) {
        this.usageStatus = usageStatus;
    }

    public DiskWhereInput usageStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USAGE_STATUS);
        return this;
    }

    public DiskWhereInput usageStatus_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USAGE_STATUS);
        return this;
    }

    public void setUsageStatus_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USAGE_STATUS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USAGE_STATUS);
        }
    }

    public boolean getUsageStatus_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USAGE_STATUS);
    }

    public DiskWhereInput usageStatusIn(List<DiskUsageStatus> usageStatusIn) {

        this.usageStatusIn = usageStatusIn;
        return this;
    }

    public DiskWhereInput addUsageStatusInItem(DiskUsageStatus usageStatusInItem) {
        if (this.usageStatusIn == null) {
            this.usageStatusIn = new ArrayList<DiskUsageStatus>();
        }
        this.usageStatusIn.add(usageStatusInItem);
        return this;
    }

    /**
     * Get usageStatusIn
     *
     * @return usageStatusIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<DiskUsageStatus> getUsageStatusIn() {
        return usageStatusIn;
    }

    public void setUsageStatusIn(List<DiskUsageStatus> usageStatusIn) {
        this.usageStatusIn = usageStatusIn;
    }

    public DiskWhereInput usageStatusIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USAGE_STATUS_IN);
        return this;
    }

    public DiskWhereInput usageStatusIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USAGE_STATUS_IN);
        return this;
    }

    public void setUsageStatusIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USAGE_STATUS_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USAGE_STATUS_IN);
        }
    }

    public boolean getUsageStatusIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USAGE_STATUS_IN);
    }

    public DiskWhereInput usageStatusNot(DiskUsageStatus usageStatusNot) {

        this.usageStatusNot = usageStatusNot;
        return this;
    }

    /**
     * Get usageStatusNot
     *
     * @return usageStatusNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public DiskUsageStatus getUsageStatusNot() {
        return usageStatusNot;
    }

    public void setUsageStatusNot(DiskUsageStatus usageStatusNot) {
        this.usageStatusNot = usageStatusNot;
    }

    public DiskWhereInput usageStatusNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USAGE_STATUS_NOT);
        return this;
    }

    public DiskWhereInput usageStatusNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USAGE_STATUS_NOT);
        return this;
    }

    public void setUsageStatusNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USAGE_STATUS_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USAGE_STATUS_NOT);
        }
    }

    public boolean getUsageStatusNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USAGE_STATUS_NOT);
    }

    public DiskWhereInput usageStatusNotIn(List<DiskUsageStatus> usageStatusNotIn) {

        this.usageStatusNotIn = usageStatusNotIn;
        return this;
    }

    public DiskWhereInput addUsageStatusNotInItem(DiskUsageStatus usageStatusNotInItem) {
        if (this.usageStatusNotIn == null) {
            this.usageStatusNotIn = new ArrayList<DiskUsageStatus>();
        }
        this.usageStatusNotIn.add(usageStatusNotInItem);
        return this;
    }

    /**
     * Get usageStatusNotIn
     *
     * @return usageStatusNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<DiskUsageStatus> getUsageStatusNotIn() {
        return usageStatusNotIn;
    }

    public void setUsageStatusNotIn(List<DiskUsageStatus> usageStatusNotIn) {
        this.usageStatusNotIn = usageStatusNotIn;
    }

    public DiskWhereInput usageStatusNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_USAGE_STATUS_NOT_IN);
        return this;
    }

    public DiskWhereInput usageStatusNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_USAGE_STATUS_NOT_IN);
        return this;
    }

    public void setUsageStatusNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_USAGE_STATUS_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_USAGE_STATUS_NOT_IN);
        }
    }

    public boolean getUsageStatusNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_USAGE_STATUS_NOT_IN);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DiskWhereInput diskWhereInput = (DiskWhereInput) o;
        return Objects.equals(this.AND, diskWhereInput.AND)
                && Objects.equals(this.NOT, diskWhereInput.NOT)
                && Objects.equals(this.OR, diskWhereInput.OR)
                && Objects.equals(this.entityAsyncStatus, diskWhereInput.entityAsyncStatus)
                && Objects.equals(this.entityAsyncStatusIn, diskWhereInput.entityAsyncStatusIn)
                && Objects.equals(this.entityAsyncStatusNot, diskWhereInput.entityAsyncStatusNot)
                && Objects.equals(
                        this.entityAsyncStatusNotIn, diskWhereInput.entityAsyncStatusNotIn)
                && Objects.equals(this.firmware, diskWhereInput.firmware)
                && Objects.equals(this.firmwareContains, diskWhereInput.firmwareContains)
                && Objects.equals(this.firmwareEndsWith, diskWhereInput.firmwareEndsWith)
                && Objects.equals(this.firmwareGt, diskWhereInput.firmwareGt)
                && Objects.equals(this.firmwareGte, diskWhereInput.firmwareGte)
                && Objects.equals(this.firmwareIn, diskWhereInput.firmwareIn)
                && Objects.equals(this.firmwareLt, diskWhereInput.firmwareLt)
                && Objects.equals(this.firmwareLte, diskWhereInput.firmwareLte)
                && Objects.equals(this.firmwareNot, diskWhereInput.firmwareNot)
                && Objects.equals(this.firmwareNotContains, diskWhereInput.firmwareNotContains)
                && Objects.equals(this.firmwareNotEndsWith, diskWhereInput.firmwareNotEndsWith)
                && Objects.equals(this.firmwareNotIn, diskWhereInput.firmwareNotIn)
                && Objects.equals(this.firmwareNotStartsWith, diskWhereInput.firmwareNotStartsWith)
                && Objects.equals(this.firmwareStartsWith, diskWhereInput.firmwareStartsWith)
                && Objects.equals(this.function, diskWhereInput.function)
                && Objects.equals(this.functionIn, diskWhereInput.functionIn)
                && Objects.equals(this.functionNot, diskWhereInput.functionNot)
                && Objects.equals(this.functionNotIn, diskWhereInput.functionNotIn)
                && Objects.equals(this.healthStatus, diskWhereInput.healthStatus)
                && Objects.equals(this.healthStatusIn, diskWhereInput.healthStatusIn)
                && Objects.equals(this.healthStatusNot, diskWhereInput.healthStatusNot)
                && Objects.equals(this.healthStatusNotIn, diskWhereInput.healthStatusNotIn)
                && Objects.equals(this.healthy, diskWhereInput.healthy)
                && Objects.equals(this.healthyNot, diskWhereInput.healthyNot)
                && Objects.equals(this.host, diskWhereInput.host)
                && Objects.equals(this.id, diskWhereInput.id)
                && Objects.equals(this.idContains, diskWhereInput.idContains)
                && Objects.equals(this.idEndsWith, diskWhereInput.idEndsWith)
                && Objects.equals(this.idGt, diskWhereInput.idGt)
                && Objects.equals(this.idGte, diskWhereInput.idGte)
                && Objects.equals(this.idIn, diskWhereInput.idIn)
                && Objects.equals(this.idLt, diskWhereInput.idLt)
                && Objects.equals(this.idLte, diskWhereInput.idLte)
                && Objects.equals(this.idNot, diskWhereInput.idNot)
                && Objects.equals(this.idNotContains, diskWhereInput.idNotContains)
                && Objects.equals(this.idNotEndsWith, diskWhereInput.idNotEndsWith)
                && Objects.equals(this.idNotIn, diskWhereInput.idNotIn)
                && Objects.equals(this.idNotStartsWith, diskWhereInput.idNotStartsWith)
                && Objects.equals(this.idStartsWith, diskWhereInput.idStartsWith)
                && Objects.equals(this.labelsEvery, diskWhereInput.labelsEvery)
                && Objects.equals(this.labelsNone, diskWhereInput.labelsNone)
                && Objects.equals(this.labelsSome, diskWhereInput.labelsSome)
                && Objects.equals(this.localId, diskWhereInput.localId)
                && Objects.equals(this.localIdContains, diskWhereInput.localIdContains)
                && Objects.equals(this.localIdEndsWith, diskWhereInput.localIdEndsWith)
                && Objects.equals(this.localIdGt, diskWhereInput.localIdGt)
                && Objects.equals(this.localIdGte, diskWhereInput.localIdGte)
                && Objects.equals(this.localIdIn, diskWhereInput.localIdIn)
                && Objects.equals(this.localIdLt, diskWhereInput.localIdLt)
                && Objects.equals(this.localIdLte, diskWhereInput.localIdLte)
                && Objects.equals(this.localIdNot, diskWhereInput.localIdNot)
                && Objects.equals(this.localIdNotContains, diskWhereInput.localIdNotContains)
                && Objects.equals(this.localIdNotEndsWith, diskWhereInput.localIdNotEndsWith)
                && Objects.equals(this.localIdNotIn, diskWhereInput.localIdNotIn)
                && Objects.equals(this.localIdNotStartsWith, diskWhereInput.localIdNotStartsWith)
                && Objects.equals(this.localIdStartsWith, diskWhereInput.localIdStartsWith)
                && Objects.equals(this.model, diskWhereInput.model)
                && Objects.equals(this.modelContains, diskWhereInput.modelContains)
                && Objects.equals(this.modelEndsWith, diskWhereInput.modelEndsWith)
                && Objects.equals(this.modelGt, diskWhereInput.modelGt)
                && Objects.equals(this.modelGte, diskWhereInput.modelGte)
                && Objects.equals(this.modelIn, diskWhereInput.modelIn)
                && Objects.equals(this.modelLt, diskWhereInput.modelLt)
                && Objects.equals(this.modelLte, diskWhereInput.modelLte)
                && Objects.equals(this.modelNot, diskWhereInput.modelNot)
                && Objects.equals(this.modelNotContains, diskWhereInput.modelNotContains)
                && Objects.equals(this.modelNotEndsWith, diskWhereInput.modelNotEndsWith)
                && Objects.equals(this.modelNotIn, diskWhereInput.modelNotIn)
                && Objects.equals(this.modelNotStartsWith, diskWhereInput.modelNotStartsWith)
                && Objects.equals(this.modelStartsWith, diskWhereInput.modelStartsWith)
                && Objects.equals(this.mounted, diskWhereInput.mounted)
                && Objects.equals(this.mountedNot, diskWhereInput.mountedNot)
                && Objects.equals(this.name, diskWhereInput.name)
                && Objects.equals(this.nameContains, diskWhereInput.nameContains)
                && Objects.equals(this.nameEndsWith, diskWhereInput.nameEndsWith)
                && Objects.equals(this.nameGt, diskWhereInput.nameGt)
                && Objects.equals(this.nameGte, diskWhereInput.nameGte)
                && Objects.equals(this.nameIn, diskWhereInput.nameIn)
                && Objects.equals(this.nameLt, diskWhereInput.nameLt)
                && Objects.equals(this.nameLte, diskWhereInput.nameLte)
                && Objects.equals(this.nameNot, diskWhereInput.nameNot)
                && Objects.equals(this.nameNotContains, diskWhereInput.nameNotContains)
                && Objects.equals(this.nameNotEndsWith, diskWhereInput.nameNotEndsWith)
                && Objects.equals(this.nameNotIn, diskWhereInput.nameNotIn)
                && Objects.equals(this.nameNotStartsWith, diskWhereInput.nameNotStartsWith)
                && Objects.equals(this.nameStartsWith, diskWhereInput.nameStartsWith)
                && Objects.equals(this.numaNode, diskWhereInput.numaNode)
                && Objects.equals(this.numaNodeGt, diskWhereInput.numaNodeGt)
                && Objects.equals(this.numaNodeGte, diskWhereInput.numaNodeGte)
                && Objects.equals(this.numaNodeIn, diskWhereInput.numaNodeIn)
                && Objects.equals(this.numaNodeLt, diskWhereInput.numaNodeLt)
                && Objects.equals(this.numaNodeLte, diskWhereInput.numaNodeLte)
                && Objects.equals(this.numaNodeNot, diskWhereInput.numaNodeNot)
                && Objects.equals(this.numaNodeNotIn, diskWhereInput.numaNodeNotIn)
                && Objects.equals(this.offline, diskWhereInput.offline)
                && Objects.equals(this.offlineNot, diskWhereInput.offlineNot)
                && Objects.equals(this.path, diskWhereInput.path)
                && Objects.equals(this.pathContains, diskWhereInput.pathContains)
                && Objects.equals(this.pathEndsWith, diskWhereInput.pathEndsWith)
                && Objects.equals(this.pathGt, diskWhereInput.pathGt)
                && Objects.equals(this.pathGte, diskWhereInput.pathGte)
                && Objects.equals(this.pathIn, diskWhereInput.pathIn)
                && Objects.equals(this.pathLt, diskWhereInput.pathLt)
                && Objects.equals(this.pathLte, diskWhereInput.pathLte)
                && Objects.equals(this.pathNot, diskWhereInput.pathNot)
                && Objects.equals(this.pathNotContains, diskWhereInput.pathNotContains)
                && Objects.equals(this.pathNotEndsWith, diskWhereInput.pathNotEndsWith)
                && Objects.equals(this.pathNotIn, diskWhereInput.pathNotIn)
                && Objects.equals(this.pathNotStartsWith, diskWhereInput.pathNotStartsWith)
                && Objects.equals(this.pathStartsWith, diskWhereInput.pathStartsWith)
                && Objects.equals(this.persistentMemoryType, diskWhereInput.persistentMemoryType)
                && Objects.equals(
                        this.persistentMemoryTypeContains,
                        diskWhereInput.persistentMemoryTypeContains)
                && Objects.equals(
                        this.persistentMemoryTypeEndsWith,
                        diskWhereInput.persistentMemoryTypeEndsWith)
                && Objects.equals(
                        this.persistentMemoryTypeGt, diskWhereInput.persistentMemoryTypeGt)
                && Objects.equals(
                        this.persistentMemoryTypeGte, diskWhereInput.persistentMemoryTypeGte)
                && Objects.equals(
                        this.persistentMemoryTypeIn, diskWhereInput.persistentMemoryTypeIn)
                && Objects.equals(
                        this.persistentMemoryTypeLt, diskWhereInput.persistentMemoryTypeLt)
                && Objects.equals(
                        this.persistentMemoryTypeLte, diskWhereInput.persistentMemoryTypeLte)
                && Objects.equals(
                        this.persistentMemoryTypeNot, diskWhereInput.persistentMemoryTypeNot)
                && Objects.equals(
                        this.persistentMemoryTypeNotContains,
                        diskWhereInput.persistentMemoryTypeNotContains)
                && Objects.equals(
                        this.persistentMemoryTypeNotEndsWith,
                        diskWhereInput.persistentMemoryTypeNotEndsWith)
                && Objects.equals(
                        this.persistentMemoryTypeNotIn, diskWhereInput.persistentMemoryTypeNotIn)
                && Objects.equals(
                        this.persistentMemoryTypeNotStartsWith,
                        diskWhereInput.persistentMemoryTypeNotStartsWith)
                && Objects.equals(
                        this.persistentMemoryTypeStartsWith,
                        diskWhereInput.persistentMemoryTypeStartsWith)
                && Objects.equals(this.physicalSlotOnBrick, diskWhereInput.physicalSlotOnBrick)
                && Objects.equals(this.physicalSlotOnBrickGt, diskWhereInput.physicalSlotOnBrickGt)
                && Objects.equals(
                        this.physicalSlotOnBrickGte, diskWhereInput.physicalSlotOnBrickGte)
                && Objects.equals(this.physicalSlotOnBrickIn, diskWhereInput.physicalSlotOnBrickIn)
                && Objects.equals(this.physicalSlotOnBrickLt, diskWhereInput.physicalSlotOnBrickLt)
                && Objects.equals(
                        this.physicalSlotOnBrickLte, diskWhereInput.physicalSlotOnBrickLte)
                && Objects.equals(
                        this.physicalSlotOnBrickNot, diskWhereInput.physicalSlotOnBrickNot)
                && Objects.equals(
                        this.physicalSlotOnBrickNotIn, diskWhereInput.physicalSlotOnBrickNotIn)
                && Objects.equals(this.pmemDimmsEvery, diskWhereInput.pmemDimmsEvery)
                && Objects.equals(this.pmemDimmsNone, diskWhereInput.pmemDimmsNone)
                && Objects.equals(this.pmemDimmsSome, diskWhereInput.pmemDimmsSome)
                && Objects.equals(this.recommendedUsage, diskWhereInput.recommendedUsage)
                && Objects.equals(this.recommendedUsageIn, diskWhereInput.recommendedUsageIn)
                && Objects.equals(this.recommendedUsageNot, diskWhereInput.recommendedUsageNot)
                && Objects.equals(this.recommendedUsageNotIn, diskWhereInput.recommendedUsageNotIn)
                && Objects.equals(this.remainingLifePercent, diskWhereInput.remainingLifePercent)
                && Objects.equals(
                        this.remainingLifePercentGt, diskWhereInput.remainingLifePercentGt)
                && Objects.equals(
                        this.remainingLifePercentGte, diskWhereInput.remainingLifePercentGte)
                && Objects.equals(
                        this.remainingLifePercentIn, diskWhereInput.remainingLifePercentIn)
                && Objects.equals(
                        this.remainingLifePercentLt, diskWhereInput.remainingLifePercentLt)
                && Objects.equals(
                        this.remainingLifePercentLte, diskWhereInput.remainingLifePercentLte)
                && Objects.equals(
                        this.remainingLifePercentNot, diskWhereInput.remainingLifePercentNot)
                && Objects.equals(
                        this.remainingLifePercentNotIn, diskWhereInput.remainingLifePercentNotIn)
                && Objects.equals(this.serial, diskWhereInput.serial)
                && Objects.equals(this.serialContains, diskWhereInput.serialContains)
                && Objects.equals(this.serialEndsWith, diskWhereInput.serialEndsWith)
                && Objects.equals(this.serialGt, diskWhereInput.serialGt)
                && Objects.equals(this.serialGte, diskWhereInput.serialGte)
                && Objects.equals(this.serialIn, diskWhereInput.serialIn)
                && Objects.equals(this.serialLt, diskWhereInput.serialLt)
                && Objects.equals(this.serialLte, diskWhereInput.serialLte)
                && Objects.equals(this.serialNot, diskWhereInput.serialNot)
                && Objects.equals(this.serialNotContains, diskWhereInput.serialNotContains)
                && Objects.equals(this.serialNotEndsWith, diskWhereInput.serialNotEndsWith)
                && Objects.equals(this.serialNotIn, diskWhereInput.serialNotIn)
                && Objects.equals(this.serialNotStartsWith, diskWhereInput.serialNotStartsWith)
                && Objects.equals(this.serialStartsWith, diskWhereInput.serialStartsWith)
                && Objects.equals(this.size, diskWhereInput.size)
                && Objects.equals(this.sizeGt, diskWhereInput.sizeGt)
                && Objects.equals(this.sizeGte, diskWhereInput.sizeGte)
                && Objects.equals(this.sizeIn, diskWhereInput.sizeIn)
                && Objects.equals(this.sizeLt, diskWhereInput.sizeLt)
                && Objects.equals(this.sizeLte, diskWhereInput.sizeLte)
                && Objects.equals(this.sizeNot, diskWhereInput.sizeNot)
                && Objects.equals(this.sizeNotIn, diskWhereInput.sizeNotIn)
                && Objects.equals(this.type, diskWhereInput.type)
                && Objects.equals(this.typeIn, diskWhereInput.typeIn)
                && Objects.equals(this.typeNot, diskWhereInput.typeNot)
                && Objects.equals(this.typeNotIn, diskWhereInput.typeNotIn)
                && Objects.equals(this.usage, diskWhereInput.usage)
                && Objects.equals(this.usageIn, diskWhereInput.usageIn)
                && Objects.equals(this.usageNot, diskWhereInput.usageNot)
                && Objects.equals(this.usageNotIn, diskWhereInput.usageNotIn)
                && Objects.equals(this.usageStatus, diskWhereInput.usageStatus)
                && Objects.equals(this.usageStatusIn, diskWhereInput.usageStatusIn)
                && Objects.equals(this.usageStatusNot, diskWhereInput.usageStatusNot)
                && Objects.equals(this.usageStatusNotIn, diskWhereInput.usageStatusNotIn);
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
                entityAsyncStatus,
                entityAsyncStatusIn,
                entityAsyncStatusNot,
                entityAsyncStatusNotIn,
                firmware,
                firmwareContains,
                firmwareEndsWith,
                firmwareGt,
                firmwareGte,
                firmwareIn,
                firmwareLt,
                firmwareLte,
                firmwareNot,
                firmwareNotContains,
                firmwareNotEndsWith,
                firmwareNotIn,
                firmwareNotStartsWith,
                firmwareStartsWith,
                function,
                functionIn,
                functionNot,
                functionNotIn,
                healthStatus,
                healthStatusIn,
                healthStatusNot,
                healthStatusNotIn,
                healthy,
                healthyNot,
                host,
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
                model,
                modelContains,
                modelEndsWith,
                modelGt,
                modelGte,
                modelIn,
                modelLt,
                modelLte,
                modelNot,
                modelNotContains,
                modelNotEndsWith,
                modelNotIn,
                modelNotStartsWith,
                modelStartsWith,
                mounted,
                mountedNot,
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
                numaNode,
                numaNodeGt,
                numaNodeGte,
                numaNodeIn,
                numaNodeLt,
                numaNodeLte,
                numaNodeNot,
                numaNodeNotIn,
                offline,
                offlineNot,
                path,
                pathContains,
                pathEndsWith,
                pathGt,
                pathGte,
                pathIn,
                pathLt,
                pathLte,
                pathNot,
                pathNotContains,
                pathNotEndsWith,
                pathNotIn,
                pathNotStartsWith,
                pathStartsWith,
                persistentMemoryType,
                persistentMemoryTypeContains,
                persistentMemoryTypeEndsWith,
                persistentMemoryTypeGt,
                persistentMemoryTypeGte,
                persistentMemoryTypeIn,
                persistentMemoryTypeLt,
                persistentMemoryTypeLte,
                persistentMemoryTypeNot,
                persistentMemoryTypeNotContains,
                persistentMemoryTypeNotEndsWith,
                persistentMemoryTypeNotIn,
                persistentMemoryTypeNotStartsWith,
                persistentMemoryTypeStartsWith,
                physicalSlotOnBrick,
                physicalSlotOnBrickGt,
                physicalSlotOnBrickGte,
                physicalSlotOnBrickIn,
                physicalSlotOnBrickLt,
                physicalSlotOnBrickLte,
                physicalSlotOnBrickNot,
                physicalSlotOnBrickNotIn,
                pmemDimmsEvery,
                pmemDimmsNone,
                pmemDimmsSome,
                recommendedUsage,
                recommendedUsageIn,
                recommendedUsageNot,
                recommendedUsageNotIn,
                remainingLifePercent,
                remainingLifePercentGt,
                remainingLifePercentGte,
                remainingLifePercentIn,
                remainingLifePercentLt,
                remainingLifePercentLte,
                remainingLifePercentNot,
                remainingLifePercentNotIn,
                serial,
                serialContains,
                serialEndsWith,
                serialGt,
                serialGte,
                serialIn,
                serialLt,
                serialLte,
                serialNot,
                serialNotContains,
                serialNotEndsWith,
                serialNotIn,
                serialNotStartsWith,
                serialStartsWith,
                size,
                sizeGt,
                sizeGte,
                sizeIn,
                sizeLt,
                sizeLte,
                sizeNot,
                sizeNotIn,
                type,
                typeIn,
                typeNot,
                typeNotIn,
                usage,
                usageIn,
                usageNot,
                usageNotIn,
                usageStatus,
                usageStatusIn,
                usageStatusNot,
                usageStatusNotIn);
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
        sb.append("class DiskWhereInput {\n");
        sb.append("    AND: ").append(toIndentedString(AND)).append("\n");
        sb.append("    NOT: ").append(toIndentedString(NOT)).append("\n");
        sb.append("    OR: ").append(toIndentedString(OR)).append("\n");
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
        sb.append("    firmware: ").append(toIndentedString(firmware)).append("\n");
        sb.append("    firmwareContains: ").append(toIndentedString(firmwareContains)).append("\n");
        sb.append("    firmwareEndsWith: ").append(toIndentedString(firmwareEndsWith)).append("\n");
        sb.append("    firmwareGt: ").append(toIndentedString(firmwareGt)).append("\n");
        sb.append("    firmwareGte: ").append(toIndentedString(firmwareGte)).append("\n");
        sb.append("    firmwareIn: ").append(toIndentedString(firmwareIn)).append("\n");
        sb.append("    firmwareLt: ").append(toIndentedString(firmwareLt)).append("\n");
        sb.append("    firmwareLte: ").append(toIndentedString(firmwareLte)).append("\n");
        sb.append("    firmwareNot: ").append(toIndentedString(firmwareNot)).append("\n");
        sb.append("    firmwareNotContains: ")
                .append(toIndentedString(firmwareNotContains))
                .append("\n");
        sb.append("    firmwareNotEndsWith: ")
                .append(toIndentedString(firmwareNotEndsWith))
                .append("\n");
        sb.append("    firmwareNotIn: ").append(toIndentedString(firmwareNotIn)).append("\n");
        sb.append("    firmwareNotStartsWith: ")
                .append(toIndentedString(firmwareNotStartsWith))
                .append("\n");
        sb.append("    firmwareStartsWith: ")
                .append(toIndentedString(firmwareStartsWith))
                .append("\n");
        sb.append("    function: ").append(toIndentedString(function)).append("\n");
        sb.append("    functionIn: ").append(toIndentedString(functionIn)).append("\n");
        sb.append("    functionNot: ").append(toIndentedString(functionNot)).append("\n");
        sb.append("    functionNotIn: ").append(toIndentedString(functionNotIn)).append("\n");
        sb.append("    healthStatus: ").append(toIndentedString(healthStatus)).append("\n");
        sb.append("    healthStatusIn: ").append(toIndentedString(healthStatusIn)).append("\n");
        sb.append("    healthStatusNot: ").append(toIndentedString(healthStatusNot)).append("\n");
        sb.append("    healthStatusNotIn: ")
                .append(toIndentedString(healthStatusNotIn))
                .append("\n");
        sb.append("    healthy: ").append(toIndentedString(healthy)).append("\n");
        sb.append("    healthyNot: ").append(toIndentedString(healthyNot)).append("\n");
        sb.append("    host: ").append(toIndentedString(host)).append("\n");
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
        sb.append("    model: ").append(toIndentedString(model)).append("\n");
        sb.append("    modelContains: ").append(toIndentedString(modelContains)).append("\n");
        sb.append("    modelEndsWith: ").append(toIndentedString(modelEndsWith)).append("\n");
        sb.append("    modelGt: ").append(toIndentedString(modelGt)).append("\n");
        sb.append("    modelGte: ").append(toIndentedString(modelGte)).append("\n");
        sb.append("    modelIn: ").append(toIndentedString(modelIn)).append("\n");
        sb.append("    modelLt: ").append(toIndentedString(modelLt)).append("\n");
        sb.append("    modelLte: ").append(toIndentedString(modelLte)).append("\n");
        sb.append("    modelNot: ").append(toIndentedString(modelNot)).append("\n");
        sb.append("    modelNotContains: ").append(toIndentedString(modelNotContains)).append("\n");
        sb.append("    modelNotEndsWith: ").append(toIndentedString(modelNotEndsWith)).append("\n");
        sb.append("    modelNotIn: ").append(toIndentedString(modelNotIn)).append("\n");
        sb.append("    modelNotStartsWith: ")
                .append(toIndentedString(modelNotStartsWith))
                .append("\n");
        sb.append("    modelStartsWith: ").append(toIndentedString(modelStartsWith)).append("\n");
        sb.append("    mounted: ").append(toIndentedString(mounted)).append("\n");
        sb.append("    mountedNot: ").append(toIndentedString(mountedNot)).append("\n");
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
        sb.append("    numaNode: ").append(toIndentedString(numaNode)).append("\n");
        sb.append("    numaNodeGt: ").append(toIndentedString(numaNodeGt)).append("\n");
        sb.append("    numaNodeGte: ").append(toIndentedString(numaNodeGte)).append("\n");
        sb.append("    numaNodeIn: ").append(toIndentedString(numaNodeIn)).append("\n");
        sb.append("    numaNodeLt: ").append(toIndentedString(numaNodeLt)).append("\n");
        sb.append("    numaNodeLte: ").append(toIndentedString(numaNodeLte)).append("\n");
        sb.append("    numaNodeNot: ").append(toIndentedString(numaNodeNot)).append("\n");
        sb.append("    numaNodeNotIn: ").append(toIndentedString(numaNodeNotIn)).append("\n");
        sb.append("    offline: ").append(toIndentedString(offline)).append("\n");
        sb.append("    offlineNot: ").append(toIndentedString(offlineNot)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    pathContains: ").append(toIndentedString(pathContains)).append("\n");
        sb.append("    pathEndsWith: ").append(toIndentedString(pathEndsWith)).append("\n");
        sb.append("    pathGt: ").append(toIndentedString(pathGt)).append("\n");
        sb.append("    pathGte: ").append(toIndentedString(pathGte)).append("\n");
        sb.append("    pathIn: ").append(toIndentedString(pathIn)).append("\n");
        sb.append("    pathLt: ").append(toIndentedString(pathLt)).append("\n");
        sb.append("    pathLte: ").append(toIndentedString(pathLte)).append("\n");
        sb.append("    pathNot: ").append(toIndentedString(pathNot)).append("\n");
        sb.append("    pathNotContains: ").append(toIndentedString(pathNotContains)).append("\n");
        sb.append("    pathNotEndsWith: ").append(toIndentedString(pathNotEndsWith)).append("\n");
        sb.append("    pathNotIn: ").append(toIndentedString(pathNotIn)).append("\n");
        sb.append("    pathNotStartsWith: ")
                .append(toIndentedString(pathNotStartsWith))
                .append("\n");
        sb.append("    pathStartsWith: ").append(toIndentedString(pathStartsWith)).append("\n");
        sb.append("    persistentMemoryType: ")
                .append(toIndentedString(persistentMemoryType))
                .append("\n");
        sb.append("    persistentMemoryTypeContains: ")
                .append(toIndentedString(persistentMemoryTypeContains))
                .append("\n");
        sb.append("    persistentMemoryTypeEndsWith: ")
                .append(toIndentedString(persistentMemoryTypeEndsWith))
                .append("\n");
        sb.append("    persistentMemoryTypeGt: ")
                .append(toIndentedString(persistentMemoryTypeGt))
                .append("\n");
        sb.append("    persistentMemoryTypeGte: ")
                .append(toIndentedString(persistentMemoryTypeGte))
                .append("\n");
        sb.append("    persistentMemoryTypeIn: ")
                .append(toIndentedString(persistentMemoryTypeIn))
                .append("\n");
        sb.append("    persistentMemoryTypeLt: ")
                .append(toIndentedString(persistentMemoryTypeLt))
                .append("\n");
        sb.append("    persistentMemoryTypeLte: ")
                .append(toIndentedString(persistentMemoryTypeLte))
                .append("\n");
        sb.append("    persistentMemoryTypeNot: ")
                .append(toIndentedString(persistentMemoryTypeNot))
                .append("\n");
        sb.append("    persistentMemoryTypeNotContains: ")
                .append(toIndentedString(persistentMemoryTypeNotContains))
                .append("\n");
        sb.append("    persistentMemoryTypeNotEndsWith: ")
                .append(toIndentedString(persistentMemoryTypeNotEndsWith))
                .append("\n");
        sb.append("    persistentMemoryTypeNotIn: ")
                .append(toIndentedString(persistentMemoryTypeNotIn))
                .append("\n");
        sb.append("    persistentMemoryTypeNotStartsWith: ")
                .append(toIndentedString(persistentMemoryTypeNotStartsWith))
                .append("\n");
        sb.append("    persistentMemoryTypeStartsWith: ")
                .append(toIndentedString(persistentMemoryTypeStartsWith))
                .append("\n");
        sb.append("    physicalSlotOnBrick: ")
                .append(toIndentedString(physicalSlotOnBrick))
                .append("\n");
        sb.append("    physicalSlotOnBrickGt: ")
                .append(toIndentedString(physicalSlotOnBrickGt))
                .append("\n");
        sb.append("    physicalSlotOnBrickGte: ")
                .append(toIndentedString(physicalSlotOnBrickGte))
                .append("\n");
        sb.append("    physicalSlotOnBrickIn: ")
                .append(toIndentedString(physicalSlotOnBrickIn))
                .append("\n");
        sb.append("    physicalSlotOnBrickLt: ")
                .append(toIndentedString(physicalSlotOnBrickLt))
                .append("\n");
        sb.append("    physicalSlotOnBrickLte: ")
                .append(toIndentedString(physicalSlotOnBrickLte))
                .append("\n");
        sb.append("    physicalSlotOnBrickNot: ")
                .append(toIndentedString(physicalSlotOnBrickNot))
                .append("\n");
        sb.append("    physicalSlotOnBrickNotIn: ")
                .append(toIndentedString(physicalSlotOnBrickNotIn))
                .append("\n");
        sb.append("    pmemDimmsEvery: ").append(toIndentedString(pmemDimmsEvery)).append("\n");
        sb.append("    pmemDimmsNone: ").append(toIndentedString(pmemDimmsNone)).append("\n");
        sb.append("    pmemDimmsSome: ").append(toIndentedString(pmemDimmsSome)).append("\n");
        sb.append("    recommendedUsage: ").append(toIndentedString(recommendedUsage)).append("\n");
        sb.append("    recommendedUsageIn: ")
                .append(toIndentedString(recommendedUsageIn))
                .append("\n");
        sb.append("    recommendedUsageNot: ")
                .append(toIndentedString(recommendedUsageNot))
                .append("\n");
        sb.append("    recommendedUsageNotIn: ")
                .append(toIndentedString(recommendedUsageNotIn))
                .append("\n");
        sb.append("    remainingLifePercent: ")
                .append(toIndentedString(remainingLifePercent))
                .append("\n");
        sb.append("    remainingLifePercentGt: ")
                .append(toIndentedString(remainingLifePercentGt))
                .append("\n");
        sb.append("    remainingLifePercentGte: ")
                .append(toIndentedString(remainingLifePercentGte))
                .append("\n");
        sb.append("    remainingLifePercentIn: ")
                .append(toIndentedString(remainingLifePercentIn))
                .append("\n");
        sb.append("    remainingLifePercentLt: ")
                .append(toIndentedString(remainingLifePercentLt))
                .append("\n");
        sb.append("    remainingLifePercentLte: ")
                .append(toIndentedString(remainingLifePercentLte))
                .append("\n");
        sb.append("    remainingLifePercentNot: ")
                .append(toIndentedString(remainingLifePercentNot))
                .append("\n");
        sb.append("    remainingLifePercentNotIn: ")
                .append(toIndentedString(remainingLifePercentNotIn))
                .append("\n");
        sb.append("    serial: ").append(toIndentedString(serial)).append("\n");
        sb.append("    serialContains: ").append(toIndentedString(serialContains)).append("\n");
        sb.append("    serialEndsWith: ").append(toIndentedString(serialEndsWith)).append("\n");
        sb.append("    serialGt: ").append(toIndentedString(serialGt)).append("\n");
        sb.append("    serialGte: ").append(toIndentedString(serialGte)).append("\n");
        sb.append("    serialIn: ").append(toIndentedString(serialIn)).append("\n");
        sb.append("    serialLt: ").append(toIndentedString(serialLt)).append("\n");
        sb.append("    serialLte: ").append(toIndentedString(serialLte)).append("\n");
        sb.append("    serialNot: ").append(toIndentedString(serialNot)).append("\n");
        sb.append("    serialNotContains: ")
                .append(toIndentedString(serialNotContains))
                .append("\n");
        sb.append("    serialNotEndsWith: ")
                .append(toIndentedString(serialNotEndsWith))
                .append("\n");
        sb.append("    serialNotIn: ").append(toIndentedString(serialNotIn)).append("\n");
        sb.append("    serialNotStartsWith: ")
                .append(toIndentedString(serialNotStartsWith))
                .append("\n");
        sb.append("    serialStartsWith: ").append(toIndentedString(serialStartsWith)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    sizeGt: ").append(toIndentedString(sizeGt)).append("\n");
        sb.append("    sizeGte: ").append(toIndentedString(sizeGte)).append("\n");
        sb.append("    sizeIn: ").append(toIndentedString(sizeIn)).append("\n");
        sb.append("    sizeLt: ").append(toIndentedString(sizeLt)).append("\n");
        sb.append("    sizeLte: ").append(toIndentedString(sizeLte)).append("\n");
        sb.append("    sizeNot: ").append(toIndentedString(sizeNot)).append("\n");
        sb.append("    sizeNotIn: ").append(toIndentedString(sizeNotIn)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    typeIn: ").append(toIndentedString(typeIn)).append("\n");
        sb.append("    typeNot: ").append(toIndentedString(typeNot)).append("\n");
        sb.append("    typeNotIn: ").append(toIndentedString(typeNotIn)).append("\n");
        sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
        sb.append("    usageIn: ").append(toIndentedString(usageIn)).append("\n");
        sb.append("    usageNot: ").append(toIndentedString(usageNot)).append("\n");
        sb.append("    usageNotIn: ").append(toIndentedString(usageNotIn)).append("\n");
        sb.append("    usageStatus: ").append(toIndentedString(usageStatus)).append("\n");
        sb.append("    usageStatusIn: ").append(toIndentedString(usageStatusIn)).append("\n");
        sb.append("    usageStatusNot: ").append(toIndentedString(usageStatusNot)).append("\n");
        sb.append("    usageStatusNotIn: ").append(toIndentedString(usageStatusNotIn)).append("\n");
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

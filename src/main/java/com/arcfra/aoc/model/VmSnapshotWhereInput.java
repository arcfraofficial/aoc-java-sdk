package com.arcfra.aoc.model;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** VmSnapshotWhereInput */
@javax.annotation.Generated(value = "JavaAocClientCodegen")
public class VmSnapshotWhereInput
        extends com.arcfra.aoc.ConditionalNullable.ConditionalNullablePojo {
    public static final String SERIALIZED_NAME_A_N_D = "AND";

    @SerializedName(SERIALIZED_NAME_A_N_D)
    private List<VmSnapshotWhereInput> AND = null;

    public static final String SERIALIZED_NAME_N_O_T = "NOT";

    @SerializedName(SERIALIZED_NAME_N_O_T)
    private List<VmSnapshotWhereInput> NOT = null;

    public static final String SERIALIZED_NAME_O_R = "OR";

    @SerializedName(SERIALIZED_NAME_O_R)
    private List<VmSnapshotWhereInput> OR = null;

    public static final String SERIALIZED_NAME_CLOCK_OFFSET = "clock_offset";

    @SerializedName(SERIALIZED_NAME_CLOCK_OFFSET)
    private VmClockOffset clockOffset;

    public static final String SERIALIZED_NAME_CLOCK_OFFSET_IN = "clock_offset_in";

    @SerializedName(SERIALIZED_NAME_CLOCK_OFFSET_IN)
    private List<VmClockOffset> clockOffsetIn = null;

    public static final String SERIALIZED_NAME_CLOCK_OFFSET_NOT = "clock_offset_not";

    @SerializedName(SERIALIZED_NAME_CLOCK_OFFSET_NOT)
    private VmClockOffset clockOffsetNot;

    public static final String SERIALIZED_NAME_CLOCK_OFFSET_NOT_IN = "clock_offset_not_in";

    @SerializedName(SERIALIZED_NAME_CLOCK_OFFSET_NOT_IN)
    private List<VmClockOffset> clockOffsetNotIn = null;

    public static final String SERIALIZED_NAME_CLUSTER = "cluster";

    @SerializedName(SERIALIZED_NAME_CLUSTER)
    private ClusterWhereInput cluster;

    public static final String SERIALIZED_NAME_CONSISTENT_TYPE = "consistent_type";

    @SerializedName(SERIALIZED_NAME_CONSISTENT_TYPE)
    private ConsistentType consistentType;

    public static final String SERIALIZED_NAME_CONSISTENT_TYPE_IN = "consistent_type_in";

    @SerializedName(SERIALIZED_NAME_CONSISTENT_TYPE_IN)
    private List<ConsistentType> consistentTypeIn = null;

    public static final String SERIALIZED_NAME_CONSISTENT_TYPE_NOT = "consistent_type_not";

    @SerializedName(SERIALIZED_NAME_CONSISTENT_TYPE_NOT)
    private ConsistentType consistentTypeNot;

    public static final String SERIALIZED_NAME_CONSISTENT_TYPE_NOT_IN = "consistent_type_not_in";

    @SerializedName(SERIALIZED_NAME_CONSISTENT_TYPE_NOT_IN)
    private List<ConsistentType> consistentTypeNotIn = null;

    public static final String SERIALIZED_NAME_CPU_MODEL = "cpu_model";

    @SerializedName(SERIALIZED_NAME_CPU_MODEL)
    private String cpuModel;

    public static final String SERIALIZED_NAME_CPU_MODEL_CONTAINS = "cpu_model_contains";

    @SerializedName(SERIALIZED_NAME_CPU_MODEL_CONTAINS)
    private String cpuModelContains;

    public static final String SERIALIZED_NAME_CPU_MODEL_ENDS_WITH = "cpu_model_ends_with";

    @SerializedName(SERIALIZED_NAME_CPU_MODEL_ENDS_WITH)
    private String cpuModelEndsWith;

    public static final String SERIALIZED_NAME_CPU_MODEL_GT = "cpu_model_gt";

    @SerializedName(SERIALIZED_NAME_CPU_MODEL_GT)
    private String cpuModelGt;

    public static final String SERIALIZED_NAME_CPU_MODEL_GTE = "cpu_model_gte";

    @SerializedName(SERIALIZED_NAME_CPU_MODEL_GTE)
    private String cpuModelGte;

    public static final String SERIALIZED_NAME_CPU_MODEL_IN = "cpu_model_in";

    @SerializedName(SERIALIZED_NAME_CPU_MODEL_IN)
    private List<String> cpuModelIn = null;

    public static final String SERIALIZED_NAME_CPU_MODEL_LT = "cpu_model_lt";

    @SerializedName(SERIALIZED_NAME_CPU_MODEL_LT)
    private String cpuModelLt;

    public static final String SERIALIZED_NAME_CPU_MODEL_LTE = "cpu_model_lte";

    @SerializedName(SERIALIZED_NAME_CPU_MODEL_LTE)
    private String cpuModelLte;

    public static final String SERIALIZED_NAME_CPU_MODEL_NOT = "cpu_model_not";

    @SerializedName(SERIALIZED_NAME_CPU_MODEL_NOT)
    private String cpuModelNot;

    public static final String SERIALIZED_NAME_CPU_MODEL_NOT_CONTAINS = "cpu_model_not_contains";

    @SerializedName(SERIALIZED_NAME_CPU_MODEL_NOT_CONTAINS)
    private String cpuModelNotContains;

    public static final String SERIALIZED_NAME_CPU_MODEL_NOT_ENDS_WITH = "cpu_model_not_ends_with";

    @SerializedName(SERIALIZED_NAME_CPU_MODEL_NOT_ENDS_WITH)
    private String cpuModelNotEndsWith;

    public static final String SERIALIZED_NAME_CPU_MODEL_NOT_IN = "cpu_model_not_in";

    @SerializedName(SERIALIZED_NAME_CPU_MODEL_NOT_IN)
    private List<String> cpuModelNotIn = null;

    public static final String SERIALIZED_NAME_CPU_MODEL_NOT_STARTS_WITH =
            "cpu_model_not_starts_with";

    @SerializedName(SERIALIZED_NAME_CPU_MODEL_NOT_STARTS_WITH)
    private String cpuModelNotStartsWith;

    public static final String SERIALIZED_NAME_CPU_MODEL_STARTS_WITH = "cpu_model_starts_with";

    @SerializedName(SERIALIZED_NAME_CPU_MODEL_STARTS_WITH)
    private String cpuModelStartsWith;

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

    public static final String SERIALIZED_NAME_FIRMWARE = "firmware";

    @SerializedName(SERIALIZED_NAME_FIRMWARE)
    private VmFirmware firmware;

    public static final String SERIALIZED_NAME_FIRMWARE_IN = "firmware_in";

    @SerializedName(SERIALIZED_NAME_FIRMWARE_IN)
    private List<VmFirmware> firmwareIn = null;

    public static final String SERIALIZED_NAME_FIRMWARE_NOT = "firmware_not";

    @SerializedName(SERIALIZED_NAME_FIRMWARE_NOT)
    private VmFirmware firmwareNot;

    public static final String SERIALIZED_NAME_FIRMWARE_NOT_IN = "firmware_not_in";

    @SerializedName(SERIALIZED_NAME_FIRMWARE_NOT_IN)
    private List<VmFirmware> firmwareNotIn = null;

    public static final String SERIALIZED_NAME_HA = "ha";

    @SerializedName(SERIALIZED_NAME_HA)
    private Boolean ha;

    public static final String SERIALIZED_NAME_HA_NOT = "ha_not";

    @SerializedName(SERIALIZED_NAME_HA_NOT)
    private Boolean haNot;

    public static final String SERIALIZED_NAME_HA_PRIORITY = "ha_priority";

    @SerializedName(SERIALIZED_NAME_HA_PRIORITY)
    private VmHaPriority haPriority;

    public static final String SERIALIZED_NAME_HA_PRIORITY_IN = "ha_priority_in";

    @SerializedName(SERIALIZED_NAME_HA_PRIORITY_IN)
    private List<VmHaPriority> haPriorityIn = null;

    public static final String SERIALIZED_NAME_HA_PRIORITY_NOT = "ha_priority_not";

    @SerializedName(SERIALIZED_NAME_HA_PRIORITY_NOT)
    private VmHaPriority haPriorityNot;

    public static final String SERIALIZED_NAME_HA_PRIORITY_NOT_IN = "ha_priority_not_in";

    @SerializedName(SERIALIZED_NAME_HA_PRIORITY_NOT_IN)
    private List<VmHaPriority> haPriorityNotIn = null;

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

    public static final String SERIALIZED_NAME_IO_POLICY = "io_policy";

    @SerializedName(SERIALIZED_NAME_IO_POLICY)
    private VmDiskIoPolicy ioPolicy;

    public static final String SERIALIZED_NAME_IO_POLICY_IN = "io_policy_in";

    @SerializedName(SERIALIZED_NAME_IO_POLICY_IN)
    private List<VmDiskIoPolicy> ioPolicyIn = null;

    public static final String SERIALIZED_NAME_IO_POLICY_NOT = "io_policy_not";

    @SerializedName(SERIALIZED_NAME_IO_POLICY_NOT)
    private VmDiskIoPolicy ioPolicyNot;

    public static final String SERIALIZED_NAME_IO_POLICY_NOT_IN = "io_policy_not_in";

    @SerializedName(SERIALIZED_NAME_IO_POLICY_NOT_IN)
    private List<VmDiskIoPolicy> ioPolicyNotIn = null;

    public static final String SERIALIZED_NAME_LABELS_EVERY = "labels_every";

    @SerializedName(SERIALIZED_NAME_LABELS_EVERY)
    private LabelWhereInput labelsEvery;

    public static final String SERIALIZED_NAME_LABELS_NONE = "labels_none";

    @SerializedName(SERIALIZED_NAME_LABELS_NONE)
    private LabelWhereInput labelsNone;

    public static final String SERIALIZED_NAME_LABELS_SOME = "labels_some";

    @SerializedName(SERIALIZED_NAME_LABELS_SOME)
    private LabelWhereInput labelsSome;

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

    public static final String SERIALIZED_NAME_MAX_BANDWIDTH = "max_bandwidth";

    @SerializedName(SERIALIZED_NAME_MAX_BANDWIDTH)
    private Long maxBandwidth;

    public static final String SERIALIZED_NAME_MAX_BANDWIDTH_GT = "max_bandwidth_gt";

    @SerializedName(SERIALIZED_NAME_MAX_BANDWIDTH_GT)
    private Long maxBandwidthGt;

    public static final String SERIALIZED_NAME_MAX_BANDWIDTH_GTE = "max_bandwidth_gte";

    @SerializedName(SERIALIZED_NAME_MAX_BANDWIDTH_GTE)
    private Long maxBandwidthGte;

    public static final String SERIALIZED_NAME_MAX_BANDWIDTH_IN = "max_bandwidth_in";

    @SerializedName(SERIALIZED_NAME_MAX_BANDWIDTH_IN)
    private List<Long> maxBandwidthIn = null;

    public static final String SERIALIZED_NAME_MAX_BANDWIDTH_LT = "max_bandwidth_lt";

    @SerializedName(SERIALIZED_NAME_MAX_BANDWIDTH_LT)
    private Long maxBandwidthLt;

    public static final String SERIALIZED_NAME_MAX_BANDWIDTH_LTE = "max_bandwidth_lte";

    @SerializedName(SERIALIZED_NAME_MAX_BANDWIDTH_LTE)
    private Long maxBandwidthLte;

    public static final String SERIALIZED_NAME_MAX_BANDWIDTH_NOT = "max_bandwidth_not";

    @SerializedName(SERIALIZED_NAME_MAX_BANDWIDTH_NOT)
    private Long maxBandwidthNot;

    public static final String SERIALIZED_NAME_MAX_BANDWIDTH_NOT_IN = "max_bandwidth_not_in";

    @SerializedName(SERIALIZED_NAME_MAX_BANDWIDTH_NOT_IN)
    private List<Long> maxBandwidthNotIn = null;

    public static final String SERIALIZED_NAME_MAX_BANDWIDTH_POLICY = "max_bandwidth_policy";

    @SerializedName(SERIALIZED_NAME_MAX_BANDWIDTH_POLICY)
    private VmDiskIoRestrictType maxBandwidthPolicy;

    public static final String SERIALIZED_NAME_MAX_BANDWIDTH_POLICY_IN = "max_bandwidth_policy_in";

    @SerializedName(SERIALIZED_NAME_MAX_BANDWIDTH_POLICY_IN)
    private List<VmDiskIoRestrictType> maxBandwidthPolicyIn = null;

    public static final String SERIALIZED_NAME_MAX_BANDWIDTH_POLICY_NOT =
            "max_bandwidth_policy_not";

    @SerializedName(SERIALIZED_NAME_MAX_BANDWIDTH_POLICY_NOT)
    private VmDiskIoRestrictType maxBandwidthPolicyNot;

    public static final String SERIALIZED_NAME_MAX_BANDWIDTH_POLICY_NOT_IN =
            "max_bandwidth_policy_not_in";

    @SerializedName(SERIALIZED_NAME_MAX_BANDWIDTH_POLICY_NOT_IN)
    private List<VmDiskIoRestrictType> maxBandwidthPolicyNotIn = null;

    public static final String SERIALIZED_NAME_MAX_IOPS = "max_iops";

    @SerializedName(SERIALIZED_NAME_MAX_IOPS)
    private Integer maxIops;

    public static final String SERIALIZED_NAME_MAX_IOPS_GT = "max_iops_gt";

    @SerializedName(SERIALIZED_NAME_MAX_IOPS_GT)
    private Integer maxIopsGt;

    public static final String SERIALIZED_NAME_MAX_IOPS_GTE = "max_iops_gte";

    @SerializedName(SERIALIZED_NAME_MAX_IOPS_GTE)
    private Integer maxIopsGte;

    public static final String SERIALIZED_NAME_MAX_IOPS_IN = "max_iops_in";

    @SerializedName(SERIALIZED_NAME_MAX_IOPS_IN)
    private List<Integer> maxIopsIn = null;

    public static final String SERIALIZED_NAME_MAX_IOPS_LT = "max_iops_lt";

    @SerializedName(SERIALIZED_NAME_MAX_IOPS_LT)
    private Integer maxIopsLt;

    public static final String SERIALIZED_NAME_MAX_IOPS_LTE = "max_iops_lte";

    @SerializedName(SERIALIZED_NAME_MAX_IOPS_LTE)
    private Integer maxIopsLte;

    public static final String SERIALIZED_NAME_MAX_IOPS_NOT = "max_iops_not";

    @SerializedName(SERIALIZED_NAME_MAX_IOPS_NOT)
    private Integer maxIopsNot;

    public static final String SERIALIZED_NAME_MAX_IOPS_NOT_IN = "max_iops_not_in";

    @SerializedName(SERIALIZED_NAME_MAX_IOPS_NOT_IN)
    private List<Integer> maxIopsNotIn = null;

    public static final String SERIALIZED_NAME_MAX_IOPS_POLICY = "max_iops_policy";

    @SerializedName(SERIALIZED_NAME_MAX_IOPS_POLICY)
    private VmDiskIoRestrictType maxIopsPolicy;

    public static final String SERIALIZED_NAME_MAX_IOPS_POLICY_IN = "max_iops_policy_in";

    @SerializedName(SERIALIZED_NAME_MAX_IOPS_POLICY_IN)
    private List<VmDiskIoRestrictType> maxIopsPolicyIn = null;

    public static final String SERIALIZED_NAME_MAX_IOPS_POLICY_NOT = "max_iops_policy_not";

    @SerializedName(SERIALIZED_NAME_MAX_IOPS_POLICY_NOT)
    private VmDiskIoRestrictType maxIopsPolicyNot;

    public static final String SERIALIZED_NAME_MAX_IOPS_POLICY_NOT_IN = "max_iops_policy_not_in";

    @SerializedName(SERIALIZED_NAME_MAX_IOPS_POLICY_NOT_IN)
    private List<VmDiskIoRestrictType> maxIopsPolicyNotIn = null;

    public static final String SERIALIZED_NAME_MEMORY = "memory";

    @SerializedName(SERIALIZED_NAME_MEMORY)
    private Long memory;

    public static final String SERIALIZED_NAME_MEMORY_GT = "memory_gt";

    @SerializedName(SERIALIZED_NAME_MEMORY_GT)
    private Long memoryGt;

    public static final String SERIALIZED_NAME_MEMORY_GTE = "memory_gte";

    @SerializedName(SERIALIZED_NAME_MEMORY_GTE)
    private Long memoryGte;

    public static final String SERIALIZED_NAME_MEMORY_IN = "memory_in";

    @SerializedName(SERIALIZED_NAME_MEMORY_IN)
    private List<Long> memoryIn = null;

    public static final String SERIALIZED_NAME_MEMORY_LT = "memory_lt";

    @SerializedName(SERIALIZED_NAME_MEMORY_LT)
    private Long memoryLt;

    public static final String SERIALIZED_NAME_MEMORY_LTE = "memory_lte";

    @SerializedName(SERIALIZED_NAME_MEMORY_LTE)
    private Long memoryLte;

    public static final String SERIALIZED_NAME_MEMORY_NOT = "memory_not";

    @SerializedName(SERIALIZED_NAME_MEMORY_NOT)
    private Long memoryNot;

    public static final String SERIALIZED_NAME_MEMORY_NOT_IN = "memory_not_in";

    @SerializedName(SERIALIZED_NAME_MEMORY_NOT_IN)
    private List<Long> memoryNotIn = null;

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

    public static final String SERIALIZED_NAME_VCPU = "vcpu";

    @SerializedName(SERIALIZED_NAME_VCPU)
    private Integer vcpu;

    public static final String SERIALIZED_NAME_VCPU_GT = "vcpu_gt";

    @SerializedName(SERIALIZED_NAME_VCPU_GT)
    private Integer vcpuGt;

    public static final String SERIALIZED_NAME_VCPU_GTE = "vcpu_gte";

    @SerializedName(SERIALIZED_NAME_VCPU_GTE)
    private Integer vcpuGte;

    public static final String SERIALIZED_NAME_VCPU_IN = "vcpu_in";

    @SerializedName(SERIALIZED_NAME_VCPU_IN)
    private List<Integer> vcpuIn = null;

    public static final String SERIALIZED_NAME_VCPU_LT = "vcpu_lt";

    @SerializedName(SERIALIZED_NAME_VCPU_LT)
    private Integer vcpuLt;

    public static final String SERIALIZED_NAME_VCPU_LTE = "vcpu_lte";

    @SerializedName(SERIALIZED_NAME_VCPU_LTE)
    private Integer vcpuLte;

    public static final String SERIALIZED_NAME_VCPU_NOT = "vcpu_not";

    @SerializedName(SERIALIZED_NAME_VCPU_NOT)
    private Integer vcpuNot;

    public static final String SERIALIZED_NAME_VCPU_NOT_IN = "vcpu_not_in";

    @SerializedName(SERIALIZED_NAME_VCPU_NOT_IN)
    private List<Integer> vcpuNotIn = null;

    public static final String SERIALIZED_NAME_VM = "vm";

    @SerializedName(SERIALIZED_NAME_VM)
    private VmWhereInput vm;

    public static final String SERIALIZED_NAME_WIN_OPT = "win_opt";

    @SerializedName(SERIALIZED_NAME_WIN_OPT)
    private Boolean winOpt;

    public static final String SERIALIZED_NAME_WIN_OPT_NOT = "win_opt_not";

    @SerializedName(SERIALIZED_NAME_WIN_OPT_NOT)
    private Boolean winOptNot;

    public VmSnapshotWhereInput() {}

    public VmSnapshotWhereInput AND(List<VmSnapshotWhereInput> AND) {

        this.AND = AND;
        return this;
    }

    public VmSnapshotWhereInput addANDItem(VmSnapshotWhereInput ANDItem) {
        if (this.AND == null) {
            this.AND = new ArrayList<VmSnapshotWhereInput>();
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
    public List<VmSnapshotWhereInput> getAND() {
        return AND;
    }

    public void setAND(List<VmSnapshotWhereInput> AND) {
        this.AND = AND;
    }

    public VmSnapshotWhereInput AND_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_A_N_D);
        return this;
    }

    public VmSnapshotWhereInput AND_ExplictlyNonNull() {
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

    public VmSnapshotWhereInput NOT(List<VmSnapshotWhereInput> NOT) {

        this.NOT = NOT;
        return this;
    }

    public VmSnapshotWhereInput addNOTItem(VmSnapshotWhereInput NOTItem) {
        if (this.NOT == null) {
            this.NOT = new ArrayList<VmSnapshotWhereInput>();
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
    public List<VmSnapshotWhereInput> getNOT() {
        return NOT;
    }

    public void setNOT(List<VmSnapshotWhereInput> NOT) {
        this.NOT = NOT;
    }

    public VmSnapshotWhereInput NOT_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_N_O_T);
        return this;
    }

    public VmSnapshotWhereInput NOT_ExplictlyNonNull() {
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

    public VmSnapshotWhereInput OR(List<VmSnapshotWhereInput> OR) {

        this.OR = OR;
        return this;
    }

    public VmSnapshotWhereInput addORItem(VmSnapshotWhereInput ORItem) {
        if (this.OR == null) {
            this.OR = new ArrayList<VmSnapshotWhereInput>();
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
    public List<VmSnapshotWhereInput> getOR() {
        return OR;
    }

    public void setOR(List<VmSnapshotWhereInput> OR) {
        this.OR = OR;
    }

    public VmSnapshotWhereInput OR_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_O_R);
        return this;
    }

    public VmSnapshotWhereInput OR_ExplictlyNonNull() {
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

    public VmSnapshotWhereInput clockOffset(VmClockOffset clockOffset) {

        this.clockOffset = clockOffset;
        return this;
    }

    /**
     * Get clockOffset
     *
     * @return clockOffset
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmClockOffset getClockOffset() {
        return clockOffset;
    }

    public void setClockOffset(VmClockOffset clockOffset) {
        this.clockOffset = clockOffset;
    }

    public VmSnapshotWhereInput clockOffset_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLOCK_OFFSET);
        return this;
    }

    public VmSnapshotWhereInput clockOffset_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLOCK_OFFSET);
        return this;
    }

    public void setClockOffset_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLOCK_OFFSET);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLOCK_OFFSET);
        }
    }

    public boolean getClockOffset_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLOCK_OFFSET);
    }

    public VmSnapshotWhereInput clockOffsetIn(List<VmClockOffset> clockOffsetIn) {

        this.clockOffsetIn = clockOffsetIn;
        return this;
    }

    public VmSnapshotWhereInput addClockOffsetInItem(VmClockOffset clockOffsetInItem) {
        if (this.clockOffsetIn == null) {
            this.clockOffsetIn = new ArrayList<VmClockOffset>();
        }
        this.clockOffsetIn.add(clockOffsetInItem);
        return this;
    }

    /**
     * Get clockOffsetIn
     *
     * @return clockOffsetIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<VmClockOffset> getClockOffsetIn() {
        return clockOffsetIn;
    }

    public void setClockOffsetIn(List<VmClockOffset> clockOffsetIn) {
        this.clockOffsetIn = clockOffsetIn;
    }

    public VmSnapshotWhereInput clockOffsetIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLOCK_OFFSET_IN);
        return this;
    }

    public VmSnapshotWhereInput clockOffsetIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLOCK_OFFSET_IN);
        return this;
    }

    public void setClockOffsetIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLOCK_OFFSET_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLOCK_OFFSET_IN);
        }
    }

    public boolean getClockOffsetIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLOCK_OFFSET_IN);
    }

    public VmSnapshotWhereInput clockOffsetNot(VmClockOffset clockOffsetNot) {

        this.clockOffsetNot = clockOffsetNot;
        return this;
    }

    /**
     * Get clockOffsetNot
     *
     * @return clockOffsetNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmClockOffset getClockOffsetNot() {
        return clockOffsetNot;
    }

    public void setClockOffsetNot(VmClockOffset clockOffsetNot) {
        this.clockOffsetNot = clockOffsetNot;
    }

    public VmSnapshotWhereInput clockOffsetNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLOCK_OFFSET_NOT);
        return this;
    }

    public VmSnapshotWhereInput clockOffsetNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLOCK_OFFSET_NOT);
        return this;
    }

    public void setClockOffsetNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLOCK_OFFSET_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLOCK_OFFSET_NOT);
        }
    }

    public boolean getClockOffsetNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLOCK_OFFSET_NOT);
    }

    public VmSnapshotWhereInput clockOffsetNotIn(List<VmClockOffset> clockOffsetNotIn) {

        this.clockOffsetNotIn = clockOffsetNotIn;
        return this;
    }

    public VmSnapshotWhereInput addClockOffsetNotInItem(VmClockOffset clockOffsetNotInItem) {
        if (this.clockOffsetNotIn == null) {
            this.clockOffsetNotIn = new ArrayList<VmClockOffset>();
        }
        this.clockOffsetNotIn.add(clockOffsetNotInItem);
        return this;
    }

    /**
     * Get clockOffsetNotIn
     *
     * @return clockOffsetNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<VmClockOffset> getClockOffsetNotIn() {
        return clockOffsetNotIn;
    }

    public void setClockOffsetNotIn(List<VmClockOffset> clockOffsetNotIn) {
        this.clockOffsetNotIn = clockOffsetNotIn;
    }

    public VmSnapshotWhereInput clockOffsetNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLOCK_OFFSET_NOT_IN);
        return this;
    }

    public VmSnapshotWhereInput clockOffsetNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CLOCK_OFFSET_NOT_IN);
        return this;
    }

    public void setClockOffsetNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CLOCK_OFFSET_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CLOCK_OFFSET_NOT_IN);
        }
    }

    public boolean getClockOffsetNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CLOCK_OFFSET_NOT_IN);
    }

    public VmSnapshotWhereInput cluster(ClusterWhereInput cluster) {

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

    public VmSnapshotWhereInput cluster_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CLUSTER);
        return this;
    }

    public VmSnapshotWhereInput cluster_ExplictlyNonNull() {
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

    public VmSnapshotWhereInput consistentType(ConsistentType consistentType) {

        this.consistentType = consistentType;
        return this;
    }

    /**
     * Get consistentType
     *
     * @return consistentType
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ConsistentType getConsistentType() {
        return consistentType;
    }

    public void setConsistentType(ConsistentType consistentType) {
        this.consistentType = consistentType;
    }

    public VmSnapshotWhereInput consistentType_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CONSISTENT_TYPE);
        return this;
    }

    public VmSnapshotWhereInput consistentType_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CONSISTENT_TYPE);
        return this;
    }

    public void setConsistentType_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CONSISTENT_TYPE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CONSISTENT_TYPE);
        }
    }

    public boolean getConsistentType_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CONSISTENT_TYPE);
    }

    public VmSnapshotWhereInput consistentTypeIn(List<ConsistentType> consistentTypeIn) {

        this.consistentTypeIn = consistentTypeIn;
        return this;
    }

    public VmSnapshotWhereInput addConsistentTypeInItem(ConsistentType consistentTypeInItem) {
        if (this.consistentTypeIn == null) {
            this.consistentTypeIn = new ArrayList<ConsistentType>();
        }
        this.consistentTypeIn.add(consistentTypeInItem);
        return this;
    }

    /**
     * Get consistentTypeIn
     *
     * @return consistentTypeIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<ConsistentType> getConsistentTypeIn() {
        return consistentTypeIn;
    }

    public void setConsistentTypeIn(List<ConsistentType> consistentTypeIn) {
        this.consistentTypeIn = consistentTypeIn;
    }

    public VmSnapshotWhereInput consistentTypeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CONSISTENT_TYPE_IN);
        return this;
    }

    public VmSnapshotWhereInput consistentTypeIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CONSISTENT_TYPE_IN);
        return this;
    }

    public void setConsistentTypeIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CONSISTENT_TYPE_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CONSISTENT_TYPE_IN);
        }
    }

    public boolean getConsistentTypeIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CONSISTENT_TYPE_IN);
    }

    public VmSnapshotWhereInput consistentTypeNot(ConsistentType consistentTypeNot) {

        this.consistentTypeNot = consistentTypeNot;
        return this;
    }

    /**
     * Get consistentTypeNot
     *
     * @return consistentTypeNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ConsistentType getConsistentTypeNot() {
        return consistentTypeNot;
    }

    public void setConsistentTypeNot(ConsistentType consistentTypeNot) {
        this.consistentTypeNot = consistentTypeNot;
    }

    public VmSnapshotWhereInput consistentTypeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CONSISTENT_TYPE_NOT);
        return this;
    }

    public VmSnapshotWhereInput consistentTypeNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CONSISTENT_TYPE_NOT);
        return this;
    }

    public void setConsistentTypeNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CONSISTENT_TYPE_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CONSISTENT_TYPE_NOT);
        }
    }

    public boolean getConsistentTypeNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CONSISTENT_TYPE_NOT);
    }

    public VmSnapshotWhereInput consistentTypeNotIn(List<ConsistentType> consistentTypeNotIn) {

        this.consistentTypeNotIn = consistentTypeNotIn;
        return this;
    }

    public VmSnapshotWhereInput addConsistentTypeNotInItem(ConsistentType consistentTypeNotInItem) {
        if (this.consistentTypeNotIn == null) {
            this.consistentTypeNotIn = new ArrayList<ConsistentType>();
        }
        this.consistentTypeNotIn.add(consistentTypeNotInItem);
        return this;
    }

    /**
     * Get consistentTypeNotIn
     *
     * @return consistentTypeNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<ConsistentType> getConsistentTypeNotIn() {
        return consistentTypeNotIn;
    }

    public void setConsistentTypeNotIn(List<ConsistentType> consistentTypeNotIn) {
        this.consistentTypeNotIn = consistentTypeNotIn;
    }

    public VmSnapshotWhereInput consistentTypeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CONSISTENT_TYPE_NOT_IN);
        return this;
    }

    public VmSnapshotWhereInput consistentTypeNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CONSISTENT_TYPE_NOT_IN);
        return this;
    }

    public void setConsistentTypeNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CONSISTENT_TYPE_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CONSISTENT_TYPE_NOT_IN);
        }
    }

    public boolean getConsistentTypeNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CONSISTENT_TYPE_NOT_IN);
    }

    public VmSnapshotWhereInput cpuModel(String cpuModel) {

        this.cpuModel = cpuModel;
        return this;
    }

    /**
     * Get cpuModel
     *
     * @return cpuModel
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCpuModel() {
        return cpuModel;
    }

    public void setCpuModel(String cpuModel) {
        this.cpuModel = cpuModel;
    }

    public VmSnapshotWhereInput cpuModel_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CPU_MODEL);
        return this;
    }

    public VmSnapshotWhereInput cpuModel_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CPU_MODEL);
        return this;
    }

    public void setCpuModel_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CPU_MODEL);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CPU_MODEL);
        }
    }

    public boolean getCpuModel_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CPU_MODEL);
    }

    public VmSnapshotWhereInput cpuModelContains(String cpuModelContains) {

        this.cpuModelContains = cpuModelContains;
        return this;
    }

    /**
     * Get cpuModelContains
     *
     * @return cpuModelContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCpuModelContains() {
        return cpuModelContains;
    }

    public void setCpuModelContains(String cpuModelContains) {
        this.cpuModelContains = cpuModelContains;
    }

    public VmSnapshotWhereInput cpuModelContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CPU_MODEL_CONTAINS);
        return this;
    }

    public VmSnapshotWhereInput cpuModelContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CPU_MODEL_CONTAINS);
        return this;
    }

    public void setCpuModelContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CPU_MODEL_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CPU_MODEL_CONTAINS);
        }
    }

    public boolean getCpuModelContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CPU_MODEL_CONTAINS);
    }

    public VmSnapshotWhereInput cpuModelEndsWith(String cpuModelEndsWith) {

        this.cpuModelEndsWith = cpuModelEndsWith;
        return this;
    }

    /**
     * Get cpuModelEndsWith
     *
     * @return cpuModelEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCpuModelEndsWith() {
        return cpuModelEndsWith;
    }

    public void setCpuModelEndsWith(String cpuModelEndsWith) {
        this.cpuModelEndsWith = cpuModelEndsWith;
    }

    public VmSnapshotWhereInput cpuModelEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CPU_MODEL_ENDS_WITH);
        return this;
    }

    public VmSnapshotWhereInput cpuModelEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CPU_MODEL_ENDS_WITH);
        return this;
    }

    public void setCpuModelEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CPU_MODEL_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CPU_MODEL_ENDS_WITH);
        }
    }

    public boolean getCpuModelEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CPU_MODEL_ENDS_WITH);
    }

    public VmSnapshotWhereInput cpuModelGt(String cpuModelGt) {

        this.cpuModelGt = cpuModelGt;
        return this;
    }

    /**
     * Get cpuModelGt
     *
     * @return cpuModelGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCpuModelGt() {
        return cpuModelGt;
    }

    public void setCpuModelGt(String cpuModelGt) {
        this.cpuModelGt = cpuModelGt;
    }

    public VmSnapshotWhereInput cpuModelGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CPU_MODEL_GT);
        return this;
    }

    public VmSnapshotWhereInput cpuModelGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CPU_MODEL_GT);
        return this;
    }

    public void setCpuModelGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CPU_MODEL_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CPU_MODEL_GT);
        }
    }

    public boolean getCpuModelGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CPU_MODEL_GT);
    }

    public VmSnapshotWhereInput cpuModelGte(String cpuModelGte) {

        this.cpuModelGte = cpuModelGte;
        return this;
    }

    /**
     * Get cpuModelGte
     *
     * @return cpuModelGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCpuModelGte() {
        return cpuModelGte;
    }

    public void setCpuModelGte(String cpuModelGte) {
        this.cpuModelGte = cpuModelGte;
    }

    public VmSnapshotWhereInput cpuModelGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CPU_MODEL_GTE);
        return this;
    }

    public VmSnapshotWhereInput cpuModelGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CPU_MODEL_GTE);
        return this;
    }

    public void setCpuModelGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CPU_MODEL_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CPU_MODEL_GTE);
        }
    }

    public boolean getCpuModelGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CPU_MODEL_GTE);
    }

    public VmSnapshotWhereInput cpuModelIn(List<String> cpuModelIn) {

        this.cpuModelIn = cpuModelIn;
        return this;
    }

    public VmSnapshotWhereInput addCpuModelInItem(String cpuModelInItem) {
        if (this.cpuModelIn == null) {
            this.cpuModelIn = new ArrayList<String>();
        }
        this.cpuModelIn.add(cpuModelInItem);
        return this;
    }

    /**
     * Get cpuModelIn
     *
     * @return cpuModelIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getCpuModelIn() {
        return cpuModelIn;
    }

    public void setCpuModelIn(List<String> cpuModelIn) {
        this.cpuModelIn = cpuModelIn;
    }

    public VmSnapshotWhereInput cpuModelIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CPU_MODEL_IN);
        return this;
    }

    public VmSnapshotWhereInput cpuModelIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CPU_MODEL_IN);
        return this;
    }

    public void setCpuModelIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CPU_MODEL_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CPU_MODEL_IN);
        }
    }

    public boolean getCpuModelIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CPU_MODEL_IN);
    }

    public VmSnapshotWhereInput cpuModelLt(String cpuModelLt) {

        this.cpuModelLt = cpuModelLt;
        return this;
    }

    /**
     * Get cpuModelLt
     *
     * @return cpuModelLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCpuModelLt() {
        return cpuModelLt;
    }

    public void setCpuModelLt(String cpuModelLt) {
        this.cpuModelLt = cpuModelLt;
    }

    public VmSnapshotWhereInput cpuModelLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CPU_MODEL_LT);
        return this;
    }

    public VmSnapshotWhereInput cpuModelLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CPU_MODEL_LT);
        return this;
    }

    public void setCpuModelLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CPU_MODEL_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CPU_MODEL_LT);
        }
    }

    public boolean getCpuModelLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CPU_MODEL_LT);
    }

    public VmSnapshotWhereInput cpuModelLte(String cpuModelLte) {

        this.cpuModelLte = cpuModelLte;
        return this;
    }

    /**
     * Get cpuModelLte
     *
     * @return cpuModelLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCpuModelLte() {
        return cpuModelLte;
    }

    public void setCpuModelLte(String cpuModelLte) {
        this.cpuModelLte = cpuModelLte;
    }

    public VmSnapshotWhereInput cpuModelLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CPU_MODEL_LTE);
        return this;
    }

    public VmSnapshotWhereInput cpuModelLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CPU_MODEL_LTE);
        return this;
    }

    public void setCpuModelLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CPU_MODEL_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CPU_MODEL_LTE);
        }
    }

    public boolean getCpuModelLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CPU_MODEL_LTE);
    }

    public VmSnapshotWhereInput cpuModelNot(String cpuModelNot) {

        this.cpuModelNot = cpuModelNot;
        return this;
    }

    /**
     * Get cpuModelNot
     *
     * @return cpuModelNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCpuModelNot() {
        return cpuModelNot;
    }

    public void setCpuModelNot(String cpuModelNot) {
        this.cpuModelNot = cpuModelNot;
    }

    public VmSnapshotWhereInput cpuModelNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CPU_MODEL_NOT);
        return this;
    }

    public VmSnapshotWhereInput cpuModelNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CPU_MODEL_NOT);
        return this;
    }

    public void setCpuModelNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CPU_MODEL_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CPU_MODEL_NOT);
        }
    }

    public boolean getCpuModelNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CPU_MODEL_NOT);
    }

    public VmSnapshotWhereInput cpuModelNotContains(String cpuModelNotContains) {

        this.cpuModelNotContains = cpuModelNotContains;
        return this;
    }

    /**
     * Get cpuModelNotContains
     *
     * @return cpuModelNotContains
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCpuModelNotContains() {
        return cpuModelNotContains;
    }

    public void setCpuModelNotContains(String cpuModelNotContains) {
        this.cpuModelNotContains = cpuModelNotContains;
    }

    public VmSnapshotWhereInput cpuModelNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CPU_MODEL_NOT_CONTAINS);
        return this;
    }

    public VmSnapshotWhereInput cpuModelNotContains_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CPU_MODEL_NOT_CONTAINS);
        return this;
    }

    public void setCpuModelNotContains_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CPU_MODEL_NOT_CONTAINS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CPU_MODEL_NOT_CONTAINS);
        }
    }

    public boolean getCpuModelNotContains_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CPU_MODEL_NOT_CONTAINS);
    }

    public VmSnapshotWhereInput cpuModelNotEndsWith(String cpuModelNotEndsWith) {

        this.cpuModelNotEndsWith = cpuModelNotEndsWith;
        return this;
    }

    /**
     * Get cpuModelNotEndsWith
     *
     * @return cpuModelNotEndsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCpuModelNotEndsWith() {
        return cpuModelNotEndsWith;
    }

    public void setCpuModelNotEndsWith(String cpuModelNotEndsWith) {
        this.cpuModelNotEndsWith = cpuModelNotEndsWith;
    }

    public VmSnapshotWhereInput cpuModelNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CPU_MODEL_NOT_ENDS_WITH);
        return this;
    }

    public VmSnapshotWhereInput cpuModelNotEndsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CPU_MODEL_NOT_ENDS_WITH);
        return this;
    }

    public void setCpuModelNotEndsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CPU_MODEL_NOT_ENDS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CPU_MODEL_NOT_ENDS_WITH);
        }
    }

    public boolean getCpuModelNotEndsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CPU_MODEL_NOT_ENDS_WITH);
    }

    public VmSnapshotWhereInput cpuModelNotIn(List<String> cpuModelNotIn) {

        this.cpuModelNotIn = cpuModelNotIn;
        return this;
    }

    public VmSnapshotWhereInput addCpuModelNotInItem(String cpuModelNotInItem) {
        if (this.cpuModelNotIn == null) {
            this.cpuModelNotIn = new ArrayList<String>();
        }
        this.cpuModelNotIn.add(cpuModelNotInItem);
        return this;
    }

    /**
     * Get cpuModelNotIn
     *
     * @return cpuModelNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<String> getCpuModelNotIn() {
        return cpuModelNotIn;
    }

    public void setCpuModelNotIn(List<String> cpuModelNotIn) {
        this.cpuModelNotIn = cpuModelNotIn;
    }

    public VmSnapshotWhereInput cpuModelNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CPU_MODEL_NOT_IN);
        return this;
    }

    public VmSnapshotWhereInput cpuModelNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CPU_MODEL_NOT_IN);
        return this;
    }

    public void setCpuModelNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CPU_MODEL_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CPU_MODEL_NOT_IN);
        }
    }

    public boolean getCpuModelNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CPU_MODEL_NOT_IN);
    }

    public VmSnapshotWhereInput cpuModelNotStartsWith(String cpuModelNotStartsWith) {

        this.cpuModelNotStartsWith = cpuModelNotStartsWith;
        return this;
    }

    /**
     * Get cpuModelNotStartsWith
     *
     * @return cpuModelNotStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCpuModelNotStartsWith() {
        return cpuModelNotStartsWith;
    }

    public void setCpuModelNotStartsWith(String cpuModelNotStartsWith) {
        this.cpuModelNotStartsWith = cpuModelNotStartsWith;
    }

    public VmSnapshotWhereInput cpuModelNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CPU_MODEL_NOT_STARTS_WITH);
        return this;
    }

    public VmSnapshotWhereInput cpuModelNotStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CPU_MODEL_NOT_STARTS_WITH);
        return this;
    }

    public void setCpuModelNotStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CPU_MODEL_NOT_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CPU_MODEL_NOT_STARTS_WITH);
        }
    }

    public boolean getCpuModelNotStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CPU_MODEL_NOT_STARTS_WITH);
    }

    public VmSnapshotWhereInput cpuModelStartsWith(String cpuModelStartsWith) {

        this.cpuModelStartsWith = cpuModelStartsWith;
        return this;
    }

    /**
     * Get cpuModelStartsWith
     *
     * @return cpuModelStartsWith
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public String getCpuModelStartsWith() {
        return cpuModelStartsWith;
    }

    public void setCpuModelStartsWith(String cpuModelStartsWith) {
        this.cpuModelStartsWith = cpuModelStartsWith;
    }

    public VmSnapshotWhereInput cpuModelStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_CPU_MODEL_STARTS_WITH);
        return this;
    }

    public VmSnapshotWhereInput cpuModelStartsWith_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_CPU_MODEL_STARTS_WITH);
        return this;
    }

    public void setCpuModelStartsWith_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_CPU_MODEL_STARTS_WITH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_CPU_MODEL_STARTS_WITH);
        }
    }

    public boolean getCpuModelStartsWith_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_CPU_MODEL_STARTS_WITH);
    }

    public VmSnapshotWhereInput description(String description) {

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

    public VmSnapshotWhereInput description_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION);
        return this;
    }

    public VmSnapshotWhereInput description_ExplictlyNonNull() {
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

    public VmSnapshotWhereInput descriptionContains(String descriptionContains) {

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

    public VmSnapshotWhereInput descriptionContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_CONTAINS);
        return this;
    }

    public VmSnapshotWhereInput descriptionContains_ExplictlyNonNull() {
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

    public VmSnapshotWhereInput descriptionEndsWith(String descriptionEndsWith) {

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

    public VmSnapshotWhereInput descriptionEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_ENDS_WITH);
        return this;
    }

    public VmSnapshotWhereInput descriptionEndsWith_ExplictlyNonNull() {
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

    public VmSnapshotWhereInput descriptionGt(String descriptionGt) {

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

    public VmSnapshotWhereInput descriptionGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_GT);
        return this;
    }

    public VmSnapshotWhereInput descriptionGt_ExplictlyNonNull() {
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

    public VmSnapshotWhereInput descriptionGte(String descriptionGte) {

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

    public VmSnapshotWhereInput descriptionGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_GTE);
        return this;
    }

    public VmSnapshotWhereInput descriptionGte_ExplictlyNonNull() {
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

    public VmSnapshotWhereInput descriptionIn(List<String> descriptionIn) {

        this.descriptionIn = descriptionIn;
        return this;
    }

    public VmSnapshotWhereInput addDescriptionInItem(String descriptionInItem) {
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

    public VmSnapshotWhereInput descriptionIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_IN);
        return this;
    }

    public VmSnapshotWhereInput descriptionIn_ExplictlyNonNull() {
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

    public VmSnapshotWhereInput descriptionLt(String descriptionLt) {

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

    public VmSnapshotWhereInput descriptionLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_LT);
        return this;
    }

    public VmSnapshotWhereInput descriptionLt_ExplictlyNonNull() {
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

    public VmSnapshotWhereInput descriptionLte(String descriptionLte) {

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

    public VmSnapshotWhereInput descriptionLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_LTE);
        return this;
    }

    public VmSnapshotWhereInput descriptionLte_ExplictlyNonNull() {
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

    public VmSnapshotWhereInput descriptionNot(String descriptionNot) {

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

    public VmSnapshotWhereInput descriptionNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT);
        return this;
    }

    public VmSnapshotWhereInput descriptionNot_ExplictlyNonNull() {
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

    public VmSnapshotWhereInput descriptionNotContains(String descriptionNotContains) {

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

    public VmSnapshotWhereInput descriptionNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_CONTAINS);
        return this;
    }

    public VmSnapshotWhereInput descriptionNotContains_ExplictlyNonNull() {
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

    public VmSnapshotWhereInput descriptionNotEndsWith(String descriptionNotEndsWith) {

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

    public VmSnapshotWhereInput descriptionNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_ENDS_WITH);
        return this;
    }

    public VmSnapshotWhereInput descriptionNotEndsWith_ExplictlyNonNull() {
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

    public VmSnapshotWhereInput descriptionNotIn(List<String> descriptionNotIn) {

        this.descriptionNotIn = descriptionNotIn;
        return this;
    }

    public VmSnapshotWhereInput addDescriptionNotInItem(String descriptionNotInItem) {
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

    public VmSnapshotWhereInput descriptionNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_IN);
        return this;
    }

    public VmSnapshotWhereInput descriptionNotIn_ExplictlyNonNull() {
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

    public VmSnapshotWhereInput descriptionNotStartsWith(String descriptionNotStartsWith) {

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

    public VmSnapshotWhereInput descriptionNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_NOT_STARTS_WITH);
        return this;
    }

    public VmSnapshotWhereInput descriptionNotStartsWith_ExplictlyNonNull() {
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

    public VmSnapshotWhereInput descriptionStartsWith(String descriptionStartsWith) {

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

    public VmSnapshotWhereInput descriptionStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_DESCRIPTION_STARTS_WITH);
        return this;
    }

    public VmSnapshotWhereInput descriptionStartsWith_ExplictlyNonNull() {
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

    public VmSnapshotWhereInput entityAsyncStatus(EntityAsyncStatus entityAsyncStatus) {

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

    public VmSnapshotWhereInput entityAsyncStatus_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS);
        return this;
    }

    public VmSnapshotWhereInput entityAsyncStatus_ExplictlyNonNull() {
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

    public VmSnapshotWhereInput entityAsyncStatusIn(List<EntityAsyncStatus> entityAsyncStatusIn) {

        this.entityAsyncStatusIn = entityAsyncStatusIn;
        return this;
    }

    public VmSnapshotWhereInput addEntityAsyncStatusInItem(
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

    public VmSnapshotWhereInput entityAsyncStatusIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_IN);
        return this;
    }

    public VmSnapshotWhereInput entityAsyncStatusIn_ExplictlyNonNull() {
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

    public VmSnapshotWhereInput entityAsyncStatusNot(EntityAsyncStatus entityAsyncStatusNot) {

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

    public VmSnapshotWhereInput entityAsyncStatusNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT);
        return this;
    }

    public VmSnapshotWhereInput entityAsyncStatusNot_ExplictlyNonNull() {
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

    public VmSnapshotWhereInput entityAsyncStatusNotIn(
            List<EntityAsyncStatus> entityAsyncStatusNotIn) {

        this.entityAsyncStatusNotIn = entityAsyncStatusNotIn;
        return this;
    }

    public VmSnapshotWhereInput addEntityAsyncStatusNotInItem(
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

    public VmSnapshotWhereInput entityAsyncStatusNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ENTITY_ASYNC_STATUS_NOT_IN);
        return this;
    }

    public VmSnapshotWhereInput entityAsyncStatusNotIn_ExplictlyNonNull() {
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

    public VmSnapshotWhereInput firmware(VmFirmware firmware) {

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
    public VmFirmware getFirmware() {
        return firmware;
    }

    public void setFirmware(VmFirmware firmware) {
        this.firmware = firmware;
    }

    public VmSnapshotWhereInput firmware_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FIRMWARE);
        return this;
    }

    public VmSnapshotWhereInput firmware_ExplictlyNonNull() {
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

    public VmSnapshotWhereInput firmwareIn(List<VmFirmware> firmwareIn) {

        this.firmwareIn = firmwareIn;
        return this;
    }

    public VmSnapshotWhereInput addFirmwareInItem(VmFirmware firmwareInItem) {
        if (this.firmwareIn == null) {
            this.firmwareIn = new ArrayList<VmFirmware>();
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
    public List<VmFirmware> getFirmwareIn() {
        return firmwareIn;
    }

    public void setFirmwareIn(List<VmFirmware> firmwareIn) {
        this.firmwareIn = firmwareIn;
    }

    public VmSnapshotWhereInput firmwareIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FIRMWARE_IN);
        return this;
    }

    public VmSnapshotWhereInput firmwareIn_ExplictlyNonNull() {
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

    public VmSnapshotWhereInput firmwareNot(VmFirmware firmwareNot) {

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
    public VmFirmware getFirmwareNot() {
        return firmwareNot;
    }

    public void setFirmwareNot(VmFirmware firmwareNot) {
        this.firmwareNot = firmwareNot;
    }

    public VmSnapshotWhereInput firmwareNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FIRMWARE_NOT);
        return this;
    }

    public VmSnapshotWhereInput firmwareNot_ExplictlyNonNull() {
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

    public VmSnapshotWhereInput firmwareNotIn(List<VmFirmware> firmwareNotIn) {

        this.firmwareNotIn = firmwareNotIn;
        return this;
    }

    public VmSnapshotWhereInput addFirmwareNotInItem(VmFirmware firmwareNotInItem) {
        if (this.firmwareNotIn == null) {
            this.firmwareNotIn = new ArrayList<VmFirmware>();
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
    public List<VmFirmware> getFirmwareNotIn() {
        return firmwareNotIn;
    }

    public void setFirmwareNotIn(List<VmFirmware> firmwareNotIn) {
        this.firmwareNotIn = firmwareNotIn;
    }

    public VmSnapshotWhereInput firmwareNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_FIRMWARE_NOT_IN);
        return this;
    }

    public VmSnapshotWhereInput firmwareNotIn_ExplictlyNonNull() {
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

    public VmSnapshotWhereInput ha(Boolean ha) {

        this.ha = ha;
        return this;
    }

    /**
     * Get ha
     *
     * @return ha
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getHa() {
        return ha;
    }

    public void setHa(Boolean ha) {
        this.ha = ha;
    }

    public VmSnapshotWhereInput ha_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HA);
        return this;
    }

    public VmSnapshotWhereInput ha_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HA);
        return this;
    }

    public void setHa_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HA);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HA);
        }
    }

    public boolean getHa_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HA);
    }

    public VmSnapshotWhereInput haNot(Boolean haNot) {

        this.haNot = haNot;
        return this;
    }

    /**
     * Get haNot
     *
     * @return haNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getHaNot() {
        return haNot;
    }

    public void setHaNot(Boolean haNot) {
        this.haNot = haNot;
    }

    public VmSnapshotWhereInput haNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HA_NOT);
        return this;
    }

    public VmSnapshotWhereInput haNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HA_NOT);
        return this;
    }

    public void setHaNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HA_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HA_NOT);
        }
    }

    public boolean getHaNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HA_NOT);
    }

    public VmSnapshotWhereInput haPriority(VmHaPriority haPriority) {

        this.haPriority = haPriority;
        return this;
    }

    /**
     * Get haPriority
     *
     * @return haPriority
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmHaPriority getHaPriority() {
        return haPriority;
    }

    public void setHaPriority(VmHaPriority haPriority) {
        this.haPriority = haPriority;
    }

    public VmSnapshotWhereInput haPriority_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HA_PRIORITY);
        return this;
    }

    public VmSnapshotWhereInput haPriority_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HA_PRIORITY);
        return this;
    }

    public void setHaPriority_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HA_PRIORITY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HA_PRIORITY);
        }
    }

    public boolean getHaPriority_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HA_PRIORITY);
    }

    public VmSnapshotWhereInput haPriorityIn(List<VmHaPriority> haPriorityIn) {

        this.haPriorityIn = haPriorityIn;
        return this;
    }

    public VmSnapshotWhereInput addHaPriorityInItem(VmHaPriority haPriorityInItem) {
        if (this.haPriorityIn == null) {
            this.haPriorityIn = new ArrayList<VmHaPriority>();
        }
        this.haPriorityIn.add(haPriorityInItem);
        return this;
    }

    /**
     * Get haPriorityIn
     *
     * @return haPriorityIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<VmHaPriority> getHaPriorityIn() {
        return haPriorityIn;
    }

    public void setHaPriorityIn(List<VmHaPriority> haPriorityIn) {
        this.haPriorityIn = haPriorityIn;
    }

    public VmSnapshotWhereInput haPriorityIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HA_PRIORITY_IN);
        return this;
    }

    public VmSnapshotWhereInput haPriorityIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HA_PRIORITY_IN);
        return this;
    }

    public void setHaPriorityIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HA_PRIORITY_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HA_PRIORITY_IN);
        }
    }

    public boolean getHaPriorityIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HA_PRIORITY_IN);
    }

    public VmSnapshotWhereInput haPriorityNot(VmHaPriority haPriorityNot) {

        this.haPriorityNot = haPriorityNot;
        return this;
    }

    /**
     * Get haPriorityNot
     *
     * @return haPriorityNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmHaPriority getHaPriorityNot() {
        return haPriorityNot;
    }

    public void setHaPriorityNot(VmHaPriority haPriorityNot) {
        this.haPriorityNot = haPriorityNot;
    }

    public VmSnapshotWhereInput haPriorityNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HA_PRIORITY_NOT);
        return this;
    }

    public VmSnapshotWhereInput haPriorityNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HA_PRIORITY_NOT);
        return this;
    }

    public void setHaPriorityNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HA_PRIORITY_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HA_PRIORITY_NOT);
        }
    }

    public boolean getHaPriorityNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HA_PRIORITY_NOT);
    }

    public VmSnapshotWhereInput haPriorityNotIn(List<VmHaPriority> haPriorityNotIn) {

        this.haPriorityNotIn = haPriorityNotIn;
        return this;
    }

    public VmSnapshotWhereInput addHaPriorityNotInItem(VmHaPriority haPriorityNotInItem) {
        if (this.haPriorityNotIn == null) {
            this.haPriorityNotIn = new ArrayList<VmHaPriority>();
        }
        this.haPriorityNotIn.add(haPriorityNotInItem);
        return this;
    }

    /**
     * Get haPriorityNotIn
     *
     * @return haPriorityNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<VmHaPriority> getHaPriorityNotIn() {
        return haPriorityNotIn;
    }

    public void setHaPriorityNotIn(List<VmHaPriority> haPriorityNotIn) {
        this.haPriorityNotIn = haPriorityNotIn;
    }

    public VmSnapshotWhereInput haPriorityNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_HA_PRIORITY_NOT_IN);
        return this;
    }

    public VmSnapshotWhereInput haPriorityNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_HA_PRIORITY_NOT_IN);
        return this;
    }

    public void setHaPriorityNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_HA_PRIORITY_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_HA_PRIORITY_NOT_IN);
        }
    }

    public boolean getHaPriorityNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_HA_PRIORITY_NOT_IN);
    }

    public VmSnapshotWhereInput id(String id) {

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

    public VmSnapshotWhereInput id_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID);
        return this;
    }

    public VmSnapshotWhereInput id_ExplictlyNonNull() {
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

    public VmSnapshotWhereInput idContains(String idContains) {

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

    public VmSnapshotWhereInput idContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_CONTAINS);
        return this;
    }

    public VmSnapshotWhereInput idContains_ExplictlyNonNull() {
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

    public VmSnapshotWhereInput idEndsWith(String idEndsWith) {

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

    public VmSnapshotWhereInput idEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_ENDS_WITH);
        return this;
    }

    public VmSnapshotWhereInput idEndsWith_ExplictlyNonNull() {
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

    public VmSnapshotWhereInput idGt(String idGt) {

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

    public VmSnapshotWhereInput idGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GT);
        return this;
    }

    public VmSnapshotWhereInput idGt_ExplictlyNonNull() {
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

    public VmSnapshotWhereInput idGte(String idGte) {

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

    public VmSnapshotWhereInput idGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_GTE);
        return this;
    }

    public VmSnapshotWhereInput idGte_ExplictlyNonNull() {
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

    public VmSnapshotWhereInput idIn(List<String> idIn) {

        this.idIn = idIn;
        return this;
    }

    public VmSnapshotWhereInput addIdInItem(String idInItem) {
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

    public VmSnapshotWhereInput idIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_IN);
        return this;
    }

    public VmSnapshotWhereInput idIn_ExplictlyNonNull() {
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

    public VmSnapshotWhereInput idLt(String idLt) {

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

    public VmSnapshotWhereInput idLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LT);
        return this;
    }

    public VmSnapshotWhereInput idLt_ExplictlyNonNull() {
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

    public VmSnapshotWhereInput idLte(String idLte) {

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

    public VmSnapshotWhereInput idLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_LTE);
        return this;
    }

    public VmSnapshotWhereInput idLte_ExplictlyNonNull() {
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

    public VmSnapshotWhereInput idNot(String idNot) {

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

    public VmSnapshotWhereInput idNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT);
        return this;
    }

    public VmSnapshotWhereInput idNot_ExplictlyNonNull() {
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

    public VmSnapshotWhereInput idNotContains(String idNotContains) {

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

    public VmSnapshotWhereInput idNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_CONTAINS);
        return this;
    }

    public VmSnapshotWhereInput idNotContains_ExplictlyNonNull() {
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

    public VmSnapshotWhereInput idNotEndsWith(String idNotEndsWith) {

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

    public VmSnapshotWhereInput idNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_ENDS_WITH);
        return this;
    }

    public VmSnapshotWhereInput idNotEndsWith_ExplictlyNonNull() {
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

    public VmSnapshotWhereInput idNotIn(List<String> idNotIn) {

        this.idNotIn = idNotIn;
        return this;
    }

    public VmSnapshotWhereInput addIdNotInItem(String idNotInItem) {
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

    public VmSnapshotWhereInput idNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_IN);
        return this;
    }

    public VmSnapshotWhereInput idNotIn_ExplictlyNonNull() {
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

    public VmSnapshotWhereInput idNotStartsWith(String idNotStartsWith) {

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

    public VmSnapshotWhereInput idNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_NOT_STARTS_WITH);
        return this;
    }

    public VmSnapshotWhereInput idNotStartsWith_ExplictlyNonNull() {
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

    public VmSnapshotWhereInput idStartsWith(String idStartsWith) {

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

    public VmSnapshotWhereInput idStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_ID_STARTS_WITH);
        return this;
    }

    public VmSnapshotWhereInput idStartsWith_ExplictlyNonNull() {
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

    public VmSnapshotWhereInput ioPolicy(VmDiskIoPolicy ioPolicy) {

        this.ioPolicy = ioPolicy;
        return this;
    }

    /**
     * Get ioPolicy
     *
     * @return ioPolicy
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmDiskIoPolicy getIoPolicy() {
        return ioPolicy;
    }

    public void setIoPolicy(VmDiskIoPolicy ioPolicy) {
        this.ioPolicy = ioPolicy;
    }

    public VmSnapshotWhereInput ioPolicy_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IO_POLICY);
        return this;
    }

    public VmSnapshotWhereInput ioPolicy_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IO_POLICY);
        return this;
    }

    public void setIoPolicy_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IO_POLICY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IO_POLICY);
        }
    }

    public boolean getIoPolicy_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IO_POLICY);
    }

    public VmSnapshotWhereInput ioPolicyIn(List<VmDiskIoPolicy> ioPolicyIn) {

        this.ioPolicyIn = ioPolicyIn;
        return this;
    }

    public VmSnapshotWhereInput addIoPolicyInItem(VmDiskIoPolicy ioPolicyInItem) {
        if (this.ioPolicyIn == null) {
            this.ioPolicyIn = new ArrayList<VmDiskIoPolicy>();
        }
        this.ioPolicyIn.add(ioPolicyInItem);
        return this;
    }

    /**
     * Get ioPolicyIn
     *
     * @return ioPolicyIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<VmDiskIoPolicy> getIoPolicyIn() {
        return ioPolicyIn;
    }

    public void setIoPolicyIn(List<VmDiskIoPolicy> ioPolicyIn) {
        this.ioPolicyIn = ioPolicyIn;
    }

    public VmSnapshotWhereInput ioPolicyIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IO_POLICY_IN);
        return this;
    }

    public VmSnapshotWhereInput ioPolicyIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IO_POLICY_IN);
        return this;
    }

    public void setIoPolicyIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IO_POLICY_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IO_POLICY_IN);
        }
    }

    public boolean getIoPolicyIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IO_POLICY_IN);
    }

    public VmSnapshotWhereInput ioPolicyNot(VmDiskIoPolicy ioPolicyNot) {

        this.ioPolicyNot = ioPolicyNot;
        return this;
    }

    /**
     * Get ioPolicyNot
     *
     * @return ioPolicyNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmDiskIoPolicy getIoPolicyNot() {
        return ioPolicyNot;
    }

    public void setIoPolicyNot(VmDiskIoPolicy ioPolicyNot) {
        this.ioPolicyNot = ioPolicyNot;
    }

    public VmSnapshotWhereInput ioPolicyNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IO_POLICY_NOT);
        return this;
    }

    public VmSnapshotWhereInput ioPolicyNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IO_POLICY_NOT);
        return this;
    }

    public void setIoPolicyNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IO_POLICY_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IO_POLICY_NOT);
        }
    }

    public boolean getIoPolicyNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IO_POLICY_NOT);
    }

    public VmSnapshotWhereInput ioPolicyNotIn(List<VmDiskIoPolicy> ioPolicyNotIn) {

        this.ioPolicyNotIn = ioPolicyNotIn;
        return this;
    }

    public VmSnapshotWhereInput addIoPolicyNotInItem(VmDiskIoPolicy ioPolicyNotInItem) {
        if (this.ioPolicyNotIn == null) {
            this.ioPolicyNotIn = new ArrayList<VmDiskIoPolicy>();
        }
        this.ioPolicyNotIn.add(ioPolicyNotInItem);
        return this;
    }

    /**
     * Get ioPolicyNotIn
     *
     * @return ioPolicyNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<VmDiskIoPolicy> getIoPolicyNotIn() {
        return ioPolicyNotIn;
    }

    public void setIoPolicyNotIn(List<VmDiskIoPolicy> ioPolicyNotIn) {
        this.ioPolicyNotIn = ioPolicyNotIn;
    }

    public VmSnapshotWhereInput ioPolicyNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_IO_POLICY_NOT_IN);
        return this;
    }

    public VmSnapshotWhereInput ioPolicyNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_IO_POLICY_NOT_IN);
        return this;
    }

    public void setIoPolicyNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_IO_POLICY_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_IO_POLICY_NOT_IN);
        }
    }

    public boolean getIoPolicyNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_IO_POLICY_NOT_IN);
    }

    public VmSnapshotWhereInput labelsEvery(LabelWhereInput labelsEvery) {

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

    public VmSnapshotWhereInput labelsEvery_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LABELS_EVERY);
        return this;
    }

    public VmSnapshotWhereInput labelsEvery_ExplictlyNonNull() {
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

    public VmSnapshotWhereInput labelsNone(LabelWhereInput labelsNone) {

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

    public VmSnapshotWhereInput labelsNone_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LABELS_NONE);
        return this;
    }

    public VmSnapshotWhereInput labelsNone_ExplictlyNonNull() {
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

    public VmSnapshotWhereInput labelsSome(LabelWhereInput labelsSome) {

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

    public VmSnapshotWhereInput labelsSome_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LABELS_SOME);
        return this;
    }

    public VmSnapshotWhereInput labelsSome_ExplictlyNonNull() {
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

    public VmSnapshotWhereInput localCreatedAt(String localCreatedAt) {

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

    public VmSnapshotWhereInput localCreatedAt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATED_AT);
        return this;
    }

    public VmSnapshotWhereInput localCreatedAt_ExplictlyNonNull() {
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

    public VmSnapshotWhereInput localCreatedAtGt(String localCreatedAtGt) {

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

    public VmSnapshotWhereInput localCreatedAtGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATED_AT_GT);
        return this;
    }

    public VmSnapshotWhereInput localCreatedAtGt_ExplictlyNonNull() {
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

    public VmSnapshotWhereInput localCreatedAtGte(String localCreatedAtGte) {

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

    public VmSnapshotWhereInput localCreatedAtGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATED_AT_GTE);
        return this;
    }

    public VmSnapshotWhereInput localCreatedAtGte_ExplictlyNonNull() {
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

    public VmSnapshotWhereInput localCreatedAtIn(List<String> localCreatedAtIn) {

        this.localCreatedAtIn = localCreatedAtIn;
        return this;
    }

    public VmSnapshotWhereInput addLocalCreatedAtInItem(String localCreatedAtInItem) {
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

    public VmSnapshotWhereInput localCreatedAtIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATED_AT_IN);
        return this;
    }

    public VmSnapshotWhereInput localCreatedAtIn_ExplictlyNonNull() {
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

    public VmSnapshotWhereInput localCreatedAtLt(String localCreatedAtLt) {

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

    public VmSnapshotWhereInput localCreatedAtLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATED_AT_LT);
        return this;
    }

    public VmSnapshotWhereInput localCreatedAtLt_ExplictlyNonNull() {
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

    public VmSnapshotWhereInput localCreatedAtLte(String localCreatedAtLte) {

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

    public VmSnapshotWhereInput localCreatedAtLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATED_AT_LTE);
        return this;
    }

    public VmSnapshotWhereInput localCreatedAtLte_ExplictlyNonNull() {
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

    public VmSnapshotWhereInput localCreatedAtNot(String localCreatedAtNot) {

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

    public VmSnapshotWhereInput localCreatedAtNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATED_AT_NOT);
        return this;
    }

    public VmSnapshotWhereInput localCreatedAtNot_ExplictlyNonNull() {
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

    public VmSnapshotWhereInput localCreatedAtNotIn(List<String> localCreatedAtNotIn) {

        this.localCreatedAtNotIn = localCreatedAtNotIn;
        return this;
    }

    public VmSnapshotWhereInput addLocalCreatedAtNotInItem(String localCreatedAtNotInItem) {
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

    public VmSnapshotWhereInput localCreatedAtNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_CREATED_AT_NOT_IN);
        return this;
    }

    public VmSnapshotWhereInput localCreatedAtNotIn_ExplictlyNonNull() {
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

    public VmSnapshotWhereInput localId(String localId) {

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

    public VmSnapshotWhereInput localId_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID);
        return this;
    }

    public VmSnapshotWhereInput localId_ExplictlyNonNull() {
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

    public VmSnapshotWhereInput localIdContains(String localIdContains) {

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

    public VmSnapshotWhereInput localIdContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_CONTAINS);
        return this;
    }

    public VmSnapshotWhereInput localIdContains_ExplictlyNonNull() {
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

    public VmSnapshotWhereInput localIdEndsWith(String localIdEndsWith) {

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

    public VmSnapshotWhereInput localIdEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_ENDS_WITH);
        return this;
    }

    public VmSnapshotWhereInput localIdEndsWith_ExplictlyNonNull() {
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

    public VmSnapshotWhereInput localIdGt(String localIdGt) {

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

    public VmSnapshotWhereInput localIdGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_GT);
        return this;
    }

    public VmSnapshotWhereInput localIdGt_ExplictlyNonNull() {
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

    public VmSnapshotWhereInput localIdGte(String localIdGte) {

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

    public VmSnapshotWhereInput localIdGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_GTE);
        return this;
    }

    public VmSnapshotWhereInput localIdGte_ExplictlyNonNull() {
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

    public VmSnapshotWhereInput localIdIn(List<String> localIdIn) {

        this.localIdIn = localIdIn;
        return this;
    }

    public VmSnapshotWhereInput addLocalIdInItem(String localIdInItem) {
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

    public VmSnapshotWhereInput localIdIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_IN);
        return this;
    }

    public VmSnapshotWhereInput localIdIn_ExplictlyNonNull() {
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

    public VmSnapshotWhereInput localIdLt(String localIdLt) {

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

    public VmSnapshotWhereInput localIdLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_LT);
        return this;
    }

    public VmSnapshotWhereInput localIdLt_ExplictlyNonNull() {
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

    public VmSnapshotWhereInput localIdLte(String localIdLte) {

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

    public VmSnapshotWhereInput localIdLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_LTE);
        return this;
    }

    public VmSnapshotWhereInput localIdLte_ExplictlyNonNull() {
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

    public VmSnapshotWhereInput localIdNot(String localIdNot) {

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

    public VmSnapshotWhereInput localIdNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT);
        return this;
    }

    public VmSnapshotWhereInput localIdNot_ExplictlyNonNull() {
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

    public VmSnapshotWhereInput localIdNotContains(String localIdNotContains) {

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

    public VmSnapshotWhereInput localIdNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_CONTAINS);
        return this;
    }

    public VmSnapshotWhereInput localIdNotContains_ExplictlyNonNull() {
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

    public VmSnapshotWhereInput localIdNotEndsWith(String localIdNotEndsWith) {

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

    public VmSnapshotWhereInput localIdNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_ENDS_WITH);
        return this;
    }

    public VmSnapshotWhereInput localIdNotEndsWith_ExplictlyNonNull() {
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

    public VmSnapshotWhereInput localIdNotIn(List<String> localIdNotIn) {

        this.localIdNotIn = localIdNotIn;
        return this;
    }

    public VmSnapshotWhereInput addLocalIdNotInItem(String localIdNotInItem) {
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

    public VmSnapshotWhereInput localIdNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_IN);
        return this;
    }

    public VmSnapshotWhereInput localIdNotIn_ExplictlyNonNull() {
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

    public VmSnapshotWhereInput localIdNotStartsWith(String localIdNotStartsWith) {

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

    public VmSnapshotWhereInput localIdNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_NOT_STARTS_WITH);
        return this;
    }

    public VmSnapshotWhereInput localIdNotStartsWith_ExplictlyNonNull() {
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

    public VmSnapshotWhereInput localIdStartsWith(String localIdStartsWith) {

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

    public VmSnapshotWhereInput localIdStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_LOCAL_ID_STARTS_WITH);
        return this;
    }

    public VmSnapshotWhereInput localIdStartsWith_ExplictlyNonNull() {
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

    public VmSnapshotWhereInput maxBandwidth(Long maxBandwidth) {

        this.maxBandwidth = maxBandwidth;
        return this;
    }

    /**
     * Get maxBandwidth
     *
     * @return maxBandwidth
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getMaxBandwidth() {
        return maxBandwidth;
    }

    public void setMaxBandwidth(Long maxBandwidth) {
        this.maxBandwidth = maxBandwidth;
    }

    public VmSnapshotWhereInput maxBandwidth_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_BANDWIDTH);
        return this;
    }

    public VmSnapshotWhereInput maxBandwidth_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_BANDWIDTH);
        return this;
    }

    public void setMaxBandwidth_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_BANDWIDTH);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_BANDWIDTH);
        }
    }

    public boolean getMaxBandwidth_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_BANDWIDTH);
    }

    public VmSnapshotWhereInput maxBandwidthGt(Long maxBandwidthGt) {

        this.maxBandwidthGt = maxBandwidthGt;
        return this;
    }

    /**
     * Get maxBandwidthGt
     *
     * @return maxBandwidthGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getMaxBandwidthGt() {
        return maxBandwidthGt;
    }

    public void setMaxBandwidthGt(Long maxBandwidthGt) {
        this.maxBandwidthGt = maxBandwidthGt;
    }

    public VmSnapshotWhereInput maxBandwidthGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_BANDWIDTH_GT);
        return this;
    }

    public VmSnapshotWhereInput maxBandwidthGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_BANDWIDTH_GT);
        return this;
    }

    public void setMaxBandwidthGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_BANDWIDTH_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_BANDWIDTH_GT);
        }
    }

    public boolean getMaxBandwidthGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_BANDWIDTH_GT);
    }

    public VmSnapshotWhereInput maxBandwidthGte(Long maxBandwidthGte) {

        this.maxBandwidthGte = maxBandwidthGte;
        return this;
    }

    /**
     * Get maxBandwidthGte
     *
     * @return maxBandwidthGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getMaxBandwidthGte() {
        return maxBandwidthGte;
    }

    public void setMaxBandwidthGte(Long maxBandwidthGte) {
        this.maxBandwidthGte = maxBandwidthGte;
    }

    public VmSnapshotWhereInput maxBandwidthGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_BANDWIDTH_GTE);
        return this;
    }

    public VmSnapshotWhereInput maxBandwidthGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_BANDWIDTH_GTE);
        return this;
    }

    public void setMaxBandwidthGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_BANDWIDTH_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_BANDWIDTH_GTE);
        }
    }

    public boolean getMaxBandwidthGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_BANDWIDTH_GTE);
    }

    public VmSnapshotWhereInput maxBandwidthIn(List<Long> maxBandwidthIn) {

        this.maxBandwidthIn = maxBandwidthIn;
        return this;
    }

    public VmSnapshotWhereInput addMaxBandwidthInItem(Long maxBandwidthInItem) {
        if (this.maxBandwidthIn == null) {
            this.maxBandwidthIn = new ArrayList<Long>();
        }
        this.maxBandwidthIn.add(maxBandwidthInItem);
        return this;
    }

    /**
     * Get maxBandwidthIn
     *
     * @return maxBandwidthIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getMaxBandwidthIn() {
        return maxBandwidthIn;
    }

    public void setMaxBandwidthIn(List<Long> maxBandwidthIn) {
        this.maxBandwidthIn = maxBandwidthIn;
    }

    public VmSnapshotWhereInput maxBandwidthIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_BANDWIDTH_IN);
        return this;
    }

    public VmSnapshotWhereInput maxBandwidthIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_BANDWIDTH_IN);
        return this;
    }

    public void setMaxBandwidthIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_BANDWIDTH_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_BANDWIDTH_IN);
        }
    }

    public boolean getMaxBandwidthIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_BANDWIDTH_IN);
    }

    public VmSnapshotWhereInput maxBandwidthLt(Long maxBandwidthLt) {

        this.maxBandwidthLt = maxBandwidthLt;
        return this;
    }

    /**
     * Get maxBandwidthLt
     *
     * @return maxBandwidthLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getMaxBandwidthLt() {
        return maxBandwidthLt;
    }

    public void setMaxBandwidthLt(Long maxBandwidthLt) {
        this.maxBandwidthLt = maxBandwidthLt;
    }

    public VmSnapshotWhereInput maxBandwidthLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_BANDWIDTH_LT);
        return this;
    }

    public VmSnapshotWhereInput maxBandwidthLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_BANDWIDTH_LT);
        return this;
    }

    public void setMaxBandwidthLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_BANDWIDTH_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_BANDWIDTH_LT);
        }
    }

    public boolean getMaxBandwidthLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_BANDWIDTH_LT);
    }

    public VmSnapshotWhereInput maxBandwidthLte(Long maxBandwidthLte) {

        this.maxBandwidthLte = maxBandwidthLte;
        return this;
    }

    /**
     * Get maxBandwidthLte
     *
     * @return maxBandwidthLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getMaxBandwidthLte() {
        return maxBandwidthLte;
    }

    public void setMaxBandwidthLte(Long maxBandwidthLte) {
        this.maxBandwidthLte = maxBandwidthLte;
    }

    public VmSnapshotWhereInput maxBandwidthLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_BANDWIDTH_LTE);
        return this;
    }

    public VmSnapshotWhereInput maxBandwidthLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_BANDWIDTH_LTE);
        return this;
    }

    public void setMaxBandwidthLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_BANDWIDTH_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_BANDWIDTH_LTE);
        }
    }

    public boolean getMaxBandwidthLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_BANDWIDTH_LTE);
    }

    public VmSnapshotWhereInput maxBandwidthNot(Long maxBandwidthNot) {

        this.maxBandwidthNot = maxBandwidthNot;
        return this;
    }

    /**
     * Get maxBandwidthNot
     *
     * @return maxBandwidthNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getMaxBandwidthNot() {
        return maxBandwidthNot;
    }

    public void setMaxBandwidthNot(Long maxBandwidthNot) {
        this.maxBandwidthNot = maxBandwidthNot;
    }

    public VmSnapshotWhereInput maxBandwidthNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_BANDWIDTH_NOT);
        return this;
    }

    public VmSnapshotWhereInput maxBandwidthNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_BANDWIDTH_NOT);
        return this;
    }

    public void setMaxBandwidthNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_BANDWIDTH_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_BANDWIDTH_NOT);
        }
    }

    public boolean getMaxBandwidthNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_BANDWIDTH_NOT);
    }

    public VmSnapshotWhereInput maxBandwidthNotIn(List<Long> maxBandwidthNotIn) {

        this.maxBandwidthNotIn = maxBandwidthNotIn;
        return this;
    }

    public VmSnapshotWhereInput addMaxBandwidthNotInItem(Long maxBandwidthNotInItem) {
        if (this.maxBandwidthNotIn == null) {
            this.maxBandwidthNotIn = new ArrayList<Long>();
        }
        this.maxBandwidthNotIn.add(maxBandwidthNotInItem);
        return this;
    }

    /**
     * Get maxBandwidthNotIn
     *
     * @return maxBandwidthNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getMaxBandwidthNotIn() {
        return maxBandwidthNotIn;
    }

    public void setMaxBandwidthNotIn(List<Long> maxBandwidthNotIn) {
        this.maxBandwidthNotIn = maxBandwidthNotIn;
    }

    public VmSnapshotWhereInput maxBandwidthNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_BANDWIDTH_NOT_IN);
        return this;
    }

    public VmSnapshotWhereInput maxBandwidthNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_BANDWIDTH_NOT_IN);
        return this;
    }

    public void setMaxBandwidthNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_BANDWIDTH_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_BANDWIDTH_NOT_IN);
        }
    }

    public boolean getMaxBandwidthNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_BANDWIDTH_NOT_IN);
    }

    public VmSnapshotWhereInput maxBandwidthPolicy(VmDiskIoRestrictType maxBandwidthPolicy) {

        this.maxBandwidthPolicy = maxBandwidthPolicy;
        return this;
    }

    /**
     * Get maxBandwidthPolicy
     *
     * @return maxBandwidthPolicy
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmDiskIoRestrictType getMaxBandwidthPolicy() {
        return maxBandwidthPolicy;
    }

    public void setMaxBandwidthPolicy(VmDiskIoRestrictType maxBandwidthPolicy) {
        this.maxBandwidthPolicy = maxBandwidthPolicy;
    }

    public VmSnapshotWhereInput maxBandwidthPolicy_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_BANDWIDTH_POLICY);
        return this;
    }

    public VmSnapshotWhereInput maxBandwidthPolicy_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_BANDWIDTH_POLICY);
        return this;
    }

    public void setMaxBandwidthPolicy_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_BANDWIDTH_POLICY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_BANDWIDTH_POLICY);
        }
    }

    public boolean getMaxBandwidthPolicy_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_BANDWIDTH_POLICY);
    }

    public VmSnapshotWhereInput maxBandwidthPolicyIn(
            List<VmDiskIoRestrictType> maxBandwidthPolicyIn) {

        this.maxBandwidthPolicyIn = maxBandwidthPolicyIn;
        return this;
    }

    public VmSnapshotWhereInput addMaxBandwidthPolicyInItem(
            VmDiskIoRestrictType maxBandwidthPolicyInItem) {
        if (this.maxBandwidthPolicyIn == null) {
            this.maxBandwidthPolicyIn = new ArrayList<VmDiskIoRestrictType>();
        }
        this.maxBandwidthPolicyIn.add(maxBandwidthPolicyInItem);
        return this;
    }

    /**
     * Get maxBandwidthPolicyIn
     *
     * @return maxBandwidthPolicyIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<VmDiskIoRestrictType> getMaxBandwidthPolicyIn() {
        return maxBandwidthPolicyIn;
    }

    public void setMaxBandwidthPolicyIn(List<VmDiskIoRestrictType> maxBandwidthPolicyIn) {
        this.maxBandwidthPolicyIn = maxBandwidthPolicyIn;
    }

    public VmSnapshotWhereInput maxBandwidthPolicyIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_BANDWIDTH_POLICY_IN);
        return this;
    }

    public VmSnapshotWhereInput maxBandwidthPolicyIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_BANDWIDTH_POLICY_IN);
        return this;
    }

    public void setMaxBandwidthPolicyIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_BANDWIDTH_POLICY_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_BANDWIDTH_POLICY_IN);
        }
    }

    public boolean getMaxBandwidthPolicyIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_BANDWIDTH_POLICY_IN);
    }

    public VmSnapshotWhereInput maxBandwidthPolicyNot(VmDiskIoRestrictType maxBandwidthPolicyNot) {

        this.maxBandwidthPolicyNot = maxBandwidthPolicyNot;
        return this;
    }

    /**
     * Get maxBandwidthPolicyNot
     *
     * @return maxBandwidthPolicyNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmDiskIoRestrictType getMaxBandwidthPolicyNot() {
        return maxBandwidthPolicyNot;
    }

    public void setMaxBandwidthPolicyNot(VmDiskIoRestrictType maxBandwidthPolicyNot) {
        this.maxBandwidthPolicyNot = maxBandwidthPolicyNot;
    }

    public VmSnapshotWhereInput maxBandwidthPolicyNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_BANDWIDTH_POLICY_NOT);
        return this;
    }

    public VmSnapshotWhereInput maxBandwidthPolicyNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_BANDWIDTH_POLICY_NOT);
        return this;
    }

    public void setMaxBandwidthPolicyNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_BANDWIDTH_POLICY_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_BANDWIDTH_POLICY_NOT);
        }
    }

    public boolean getMaxBandwidthPolicyNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_BANDWIDTH_POLICY_NOT);
    }

    public VmSnapshotWhereInput maxBandwidthPolicyNotIn(
            List<VmDiskIoRestrictType> maxBandwidthPolicyNotIn) {

        this.maxBandwidthPolicyNotIn = maxBandwidthPolicyNotIn;
        return this;
    }

    public VmSnapshotWhereInput addMaxBandwidthPolicyNotInItem(
            VmDiskIoRestrictType maxBandwidthPolicyNotInItem) {
        if (this.maxBandwidthPolicyNotIn == null) {
            this.maxBandwidthPolicyNotIn = new ArrayList<VmDiskIoRestrictType>();
        }
        this.maxBandwidthPolicyNotIn.add(maxBandwidthPolicyNotInItem);
        return this;
    }

    /**
     * Get maxBandwidthPolicyNotIn
     *
     * @return maxBandwidthPolicyNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<VmDiskIoRestrictType> getMaxBandwidthPolicyNotIn() {
        return maxBandwidthPolicyNotIn;
    }

    public void setMaxBandwidthPolicyNotIn(List<VmDiskIoRestrictType> maxBandwidthPolicyNotIn) {
        this.maxBandwidthPolicyNotIn = maxBandwidthPolicyNotIn;
    }

    public VmSnapshotWhereInput maxBandwidthPolicyNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_BANDWIDTH_POLICY_NOT_IN);
        return this;
    }

    public VmSnapshotWhereInput maxBandwidthPolicyNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_BANDWIDTH_POLICY_NOT_IN);
        return this;
    }

    public void setMaxBandwidthPolicyNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_BANDWIDTH_POLICY_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_BANDWIDTH_POLICY_NOT_IN);
        }
    }

    public boolean getMaxBandwidthPolicyNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_BANDWIDTH_POLICY_NOT_IN);
    }

    public VmSnapshotWhereInput maxIops(Integer maxIops) {

        this.maxIops = maxIops;
        return this;
    }

    /**
     * Get maxIops
     *
     * @return maxIops
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMaxIops() {
        return maxIops;
    }

    public void setMaxIops(Integer maxIops) {
        this.maxIops = maxIops;
    }

    public VmSnapshotWhereInput maxIops_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_IOPS);
        return this;
    }

    public VmSnapshotWhereInput maxIops_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_IOPS);
        return this;
    }

    public void setMaxIops_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_IOPS);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_IOPS);
        }
    }

    public boolean getMaxIops_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_IOPS);
    }

    public VmSnapshotWhereInput maxIopsGt(Integer maxIopsGt) {

        this.maxIopsGt = maxIopsGt;
        return this;
    }

    /**
     * Get maxIopsGt
     *
     * @return maxIopsGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMaxIopsGt() {
        return maxIopsGt;
    }

    public void setMaxIopsGt(Integer maxIopsGt) {
        this.maxIopsGt = maxIopsGt;
    }

    public VmSnapshotWhereInput maxIopsGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_IOPS_GT);
        return this;
    }

    public VmSnapshotWhereInput maxIopsGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_IOPS_GT);
        return this;
    }

    public void setMaxIopsGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_IOPS_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_IOPS_GT);
        }
    }

    public boolean getMaxIopsGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_IOPS_GT);
    }

    public VmSnapshotWhereInput maxIopsGte(Integer maxIopsGte) {

        this.maxIopsGte = maxIopsGte;
        return this;
    }

    /**
     * Get maxIopsGte
     *
     * @return maxIopsGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMaxIopsGte() {
        return maxIopsGte;
    }

    public void setMaxIopsGte(Integer maxIopsGte) {
        this.maxIopsGte = maxIopsGte;
    }

    public VmSnapshotWhereInput maxIopsGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_IOPS_GTE);
        return this;
    }

    public VmSnapshotWhereInput maxIopsGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_IOPS_GTE);
        return this;
    }

    public void setMaxIopsGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_IOPS_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_IOPS_GTE);
        }
    }

    public boolean getMaxIopsGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_IOPS_GTE);
    }

    public VmSnapshotWhereInput maxIopsIn(List<Integer> maxIopsIn) {

        this.maxIopsIn = maxIopsIn;
        return this;
    }

    public VmSnapshotWhereInput addMaxIopsInItem(Integer maxIopsInItem) {
        if (this.maxIopsIn == null) {
            this.maxIopsIn = new ArrayList<Integer>();
        }
        this.maxIopsIn.add(maxIopsInItem);
        return this;
    }

    /**
     * Get maxIopsIn
     *
     * @return maxIopsIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getMaxIopsIn() {
        return maxIopsIn;
    }

    public void setMaxIopsIn(List<Integer> maxIopsIn) {
        this.maxIopsIn = maxIopsIn;
    }

    public VmSnapshotWhereInput maxIopsIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_IOPS_IN);
        return this;
    }

    public VmSnapshotWhereInput maxIopsIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_IOPS_IN);
        return this;
    }

    public void setMaxIopsIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_IOPS_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_IOPS_IN);
        }
    }

    public boolean getMaxIopsIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_IOPS_IN);
    }

    public VmSnapshotWhereInput maxIopsLt(Integer maxIopsLt) {

        this.maxIopsLt = maxIopsLt;
        return this;
    }

    /**
     * Get maxIopsLt
     *
     * @return maxIopsLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMaxIopsLt() {
        return maxIopsLt;
    }

    public void setMaxIopsLt(Integer maxIopsLt) {
        this.maxIopsLt = maxIopsLt;
    }

    public VmSnapshotWhereInput maxIopsLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_IOPS_LT);
        return this;
    }

    public VmSnapshotWhereInput maxIopsLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_IOPS_LT);
        return this;
    }

    public void setMaxIopsLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_IOPS_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_IOPS_LT);
        }
    }

    public boolean getMaxIopsLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_IOPS_LT);
    }

    public VmSnapshotWhereInput maxIopsLte(Integer maxIopsLte) {

        this.maxIopsLte = maxIopsLte;
        return this;
    }

    /**
     * Get maxIopsLte
     *
     * @return maxIopsLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMaxIopsLte() {
        return maxIopsLte;
    }

    public void setMaxIopsLte(Integer maxIopsLte) {
        this.maxIopsLte = maxIopsLte;
    }

    public VmSnapshotWhereInput maxIopsLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_IOPS_LTE);
        return this;
    }

    public VmSnapshotWhereInput maxIopsLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_IOPS_LTE);
        return this;
    }

    public void setMaxIopsLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_IOPS_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_IOPS_LTE);
        }
    }

    public boolean getMaxIopsLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_IOPS_LTE);
    }

    public VmSnapshotWhereInput maxIopsNot(Integer maxIopsNot) {

        this.maxIopsNot = maxIopsNot;
        return this;
    }

    /**
     * Get maxIopsNot
     *
     * @return maxIopsNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getMaxIopsNot() {
        return maxIopsNot;
    }

    public void setMaxIopsNot(Integer maxIopsNot) {
        this.maxIopsNot = maxIopsNot;
    }

    public VmSnapshotWhereInput maxIopsNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_IOPS_NOT);
        return this;
    }

    public VmSnapshotWhereInput maxIopsNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_IOPS_NOT);
        return this;
    }

    public void setMaxIopsNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_IOPS_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_IOPS_NOT);
        }
    }

    public boolean getMaxIopsNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_IOPS_NOT);
    }

    public VmSnapshotWhereInput maxIopsNotIn(List<Integer> maxIopsNotIn) {

        this.maxIopsNotIn = maxIopsNotIn;
        return this;
    }

    public VmSnapshotWhereInput addMaxIopsNotInItem(Integer maxIopsNotInItem) {
        if (this.maxIopsNotIn == null) {
            this.maxIopsNotIn = new ArrayList<Integer>();
        }
        this.maxIopsNotIn.add(maxIopsNotInItem);
        return this;
    }

    /**
     * Get maxIopsNotIn
     *
     * @return maxIopsNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getMaxIopsNotIn() {
        return maxIopsNotIn;
    }

    public void setMaxIopsNotIn(List<Integer> maxIopsNotIn) {
        this.maxIopsNotIn = maxIopsNotIn;
    }

    public VmSnapshotWhereInput maxIopsNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_IOPS_NOT_IN);
        return this;
    }

    public VmSnapshotWhereInput maxIopsNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_IOPS_NOT_IN);
        return this;
    }

    public void setMaxIopsNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_IOPS_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_IOPS_NOT_IN);
        }
    }

    public boolean getMaxIopsNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_IOPS_NOT_IN);
    }

    public VmSnapshotWhereInput maxIopsPolicy(VmDiskIoRestrictType maxIopsPolicy) {

        this.maxIopsPolicy = maxIopsPolicy;
        return this;
    }

    /**
     * Get maxIopsPolicy
     *
     * @return maxIopsPolicy
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmDiskIoRestrictType getMaxIopsPolicy() {
        return maxIopsPolicy;
    }

    public void setMaxIopsPolicy(VmDiskIoRestrictType maxIopsPolicy) {
        this.maxIopsPolicy = maxIopsPolicy;
    }

    public VmSnapshotWhereInput maxIopsPolicy_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_IOPS_POLICY);
        return this;
    }

    public VmSnapshotWhereInput maxIopsPolicy_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_IOPS_POLICY);
        return this;
    }

    public void setMaxIopsPolicy_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_IOPS_POLICY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_IOPS_POLICY);
        }
    }

    public boolean getMaxIopsPolicy_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_IOPS_POLICY);
    }

    public VmSnapshotWhereInput maxIopsPolicyIn(List<VmDiskIoRestrictType> maxIopsPolicyIn) {

        this.maxIopsPolicyIn = maxIopsPolicyIn;
        return this;
    }

    public VmSnapshotWhereInput addMaxIopsPolicyInItem(VmDiskIoRestrictType maxIopsPolicyInItem) {
        if (this.maxIopsPolicyIn == null) {
            this.maxIopsPolicyIn = new ArrayList<VmDiskIoRestrictType>();
        }
        this.maxIopsPolicyIn.add(maxIopsPolicyInItem);
        return this;
    }

    /**
     * Get maxIopsPolicyIn
     *
     * @return maxIopsPolicyIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<VmDiskIoRestrictType> getMaxIopsPolicyIn() {
        return maxIopsPolicyIn;
    }

    public void setMaxIopsPolicyIn(List<VmDiskIoRestrictType> maxIopsPolicyIn) {
        this.maxIopsPolicyIn = maxIopsPolicyIn;
    }

    public VmSnapshotWhereInput maxIopsPolicyIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_IOPS_POLICY_IN);
        return this;
    }

    public VmSnapshotWhereInput maxIopsPolicyIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_IOPS_POLICY_IN);
        return this;
    }

    public void setMaxIopsPolicyIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_IOPS_POLICY_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_IOPS_POLICY_IN);
        }
    }

    public boolean getMaxIopsPolicyIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_IOPS_POLICY_IN);
    }

    public VmSnapshotWhereInput maxIopsPolicyNot(VmDiskIoRestrictType maxIopsPolicyNot) {

        this.maxIopsPolicyNot = maxIopsPolicyNot;
        return this;
    }

    /**
     * Get maxIopsPolicyNot
     *
     * @return maxIopsPolicyNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public VmDiskIoRestrictType getMaxIopsPolicyNot() {
        return maxIopsPolicyNot;
    }

    public void setMaxIopsPolicyNot(VmDiskIoRestrictType maxIopsPolicyNot) {
        this.maxIopsPolicyNot = maxIopsPolicyNot;
    }

    public VmSnapshotWhereInput maxIopsPolicyNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_IOPS_POLICY_NOT);
        return this;
    }

    public VmSnapshotWhereInput maxIopsPolicyNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_IOPS_POLICY_NOT);
        return this;
    }

    public void setMaxIopsPolicyNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_IOPS_POLICY_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_IOPS_POLICY_NOT);
        }
    }

    public boolean getMaxIopsPolicyNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_IOPS_POLICY_NOT);
    }

    public VmSnapshotWhereInput maxIopsPolicyNotIn(List<VmDiskIoRestrictType> maxIopsPolicyNotIn) {

        this.maxIopsPolicyNotIn = maxIopsPolicyNotIn;
        return this;
    }

    public VmSnapshotWhereInput addMaxIopsPolicyNotInItem(
            VmDiskIoRestrictType maxIopsPolicyNotInItem) {
        if (this.maxIopsPolicyNotIn == null) {
            this.maxIopsPolicyNotIn = new ArrayList<VmDiskIoRestrictType>();
        }
        this.maxIopsPolicyNotIn.add(maxIopsPolicyNotInItem);
        return this;
    }

    /**
     * Get maxIopsPolicyNotIn
     *
     * @return maxIopsPolicyNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<VmDiskIoRestrictType> getMaxIopsPolicyNotIn() {
        return maxIopsPolicyNotIn;
    }

    public void setMaxIopsPolicyNotIn(List<VmDiskIoRestrictType> maxIopsPolicyNotIn) {
        this.maxIopsPolicyNotIn = maxIopsPolicyNotIn;
    }

    public VmSnapshotWhereInput maxIopsPolicyNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MAX_IOPS_POLICY_NOT_IN);
        return this;
    }

    public VmSnapshotWhereInput maxIopsPolicyNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MAX_IOPS_POLICY_NOT_IN);
        return this;
    }

    public void setMaxIopsPolicyNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MAX_IOPS_POLICY_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MAX_IOPS_POLICY_NOT_IN);
        }
    }

    public boolean getMaxIopsPolicyNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MAX_IOPS_POLICY_NOT_IN);
    }

    public VmSnapshotWhereInput memory(Long memory) {

        this.memory = memory;
        return this;
    }

    /**
     * Get memory
     *
     * @return memory
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getMemory() {
        return memory;
    }

    public void setMemory(Long memory) {
        this.memory = memory;
    }

    public VmSnapshotWhereInput memory_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MEMORY);
        return this;
    }

    public VmSnapshotWhereInput memory_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MEMORY);
        return this;
    }

    public void setMemory_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MEMORY);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MEMORY);
        }
    }

    public boolean getMemory_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MEMORY);
    }

    public VmSnapshotWhereInput memoryGt(Long memoryGt) {

        this.memoryGt = memoryGt;
        return this;
    }

    /**
     * Get memoryGt
     *
     * @return memoryGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getMemoryGt() {
        return memoryGt;
    }

    public void setMemoryGt(Long memoryGt) {
        this.memoryGt = memoryGt;
    }

    public VmSnapshotWhereInput memoryGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MEMORY_GT);
        return this;
    }

    public VmSnapshotWhereInput memoryGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MEMORY_GT);
        return this;
    }

    public void setMemoryGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MEMORY_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MEMORY_GT);
        }
    }

    public boolean getMemoryGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MEMORY_GT);
    }

    public VmSnapshotWhereInput memoryGte(Long memoryGte) {

        this.memoryGte = memoryGte;
        return this;
    }

    /**
     * Get memoryGte
     *
     * @return memoryGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getMemoryGte() {
        return memoryGte;
    }

    public void setMemoryGte(Long memoryGte) {
        this.memoryGte = memoryGte;
    }

    public VmSnapshotWhereInput memoryGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MEMORY_GTE);
        return this;
    }

    public VmSnapshotWhereInput memoryGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MEMORY_GTE);
        return this;
    }

    public void setMemoryGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MEMORY_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MEMORY_GTE);
        }
    }

    public boolean getMemoryGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MEMORY_GTE);
    }

    public VmSnapshotWhereInput memoryIn(List<Long> memoryIn) {

        this.memoryIn = memoryIn;
        return this;
    }

    public VmSnapshotWhereInput addMemoryInItem(Long memoryInItem) {
        if (this.memoryIn == null) {
            this.memoryIn = new ArrayList<Long>();
        }
        this.memoryIn.add(memoryInItem);
        return this;
    }

    /**
     * Get memoryIn
     *
     * @return memoryIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getMemoryIn() {
        return memoryIn;
    }

    public void setMemoryIn(List<Long> memoryIn) {
        this.memoryIn = memoryIn;
    }

    public VmSnapshotWhereInput memoryIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MEMORY_IN);
        return this;
    }

    public VmSnapshotWhereInput memoryIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MEMORY_IN);
        return this;
    }

    public void setMemoryIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MEMORY_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MEMORY_IN);
        }
    }

    public boolean getMemoryIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MEMORY_IN);
    }

    public VmSnapshotWhereInput memoryLt(Long memoryLt) {

        this.memoryLt = memoryLt;
        return this;
    }

    /**
     * Get memoryLt
     *
     * @return memoryLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getMemoryLt() {
        return memoryLt;
    }

    public void setMemoryLt(Long memoryLt) {
        this.memoryLt = memoryLt;
    }

    public VmSnapshotWhereInput memoryLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MEMORY_LT);
        return this;
    }

    public VmSnapshotWhereInput memoryLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MEMORY_LT);
        return this;
    }

    public void setMemoryLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MEMORY_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MEMORY_LT);
        }
    }

    public boolean getMemoryLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MEMORY_LT);
    }

    public VmSnapshotWhereInput memoryLte(Long memoryLte) {

        this.memoryLte = memoryLte;
        return this;
    }

    /**
     * Get memoryLte
     *
     * @return memoryLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getMemoryLte() {
        return memoryLte;
    }

    public void setMemoryLte(Long memoryLte) {
        this.memoryLte = memoryLte;
    }

    public VmSnapshotWhereInput memoryLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MEMORY_LTE);
        return this;
    }

    public VmSnapshotWhereInput memoryLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MEMORY_LTE);
        return this;
    }

    public void setMemoryLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MEMORY_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MEMORY_LTE);
        }
    }

    public boolean getMemoryLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MEMORY_LTE);
    }

    public VmSnapshotWhereInput memoryNot(Long memoryNot) {

        this.memoryNot = memoryNot;
        return this;
    }

    /**
     * Get memoryNot
     *
     * @return memoryNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Long getMemoryNot() {
        return memoryNot;
    }

    public void setMemoryNot(Long memoryNot) {
        this.memoryNot = memoryNot;
    }

    public VmSnapshotWhereInput memoryNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MEMORY_NOT);
        return this;
    }

    public VmSnapshotWhereInput memoryNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MEMORY_NOT);
        return this;
    }

    public void setMemoryNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MEMORY_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MEMORY_NOT);
        }
    }

    public boolean getMemoryNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MEMORY_NOT);
    }

    public VmSnapshotWhereInput memoryNotIn(List<Long> memoryNotIn) {

        this.memoryNotIn = memoryNotIn;
        return this;
    }

    public VmSnapshotWhereInput addMemoryNotInItem(Long memoryNotInItem) {
        if (this.memoryNotIn == null) {
            this.memoryNotIn = new ArrayList<Long>();
        }
        this.memoryNotIn.add(memoryNotInItem);
        return this;
    }

    /**
     * Get memoryNotIn
     *
     * @return memoryNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Long> getMemoryNotIn() {
        return memoryNotIn;
    }

    public void setMemoryNotIn(List<Long> memoryNotIn) {
        this.memoryNotIn = memoryNotIn;
    }

    public VmSnapshotWhereInput memoryNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_MEMORY_NOT_IN);
        return this;
    }

    public VmSnapshotWhereInput memoryNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_MEMORY_NOT_IN);
        return this;
    }

    public void setMemoryNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_MEMORY_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_MEMORY_NOT_IN);
        }
    }

    public boolean getMemoryNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_MEMORY_NOT_IN);
    }

    public VmSnapshotWhereInput name(String name) {

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

    public VmSnapshotWhereInput name_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME);
        return this;
    }

    public VmSnapshotWhereInput name_ExplictlyNonNull() {
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

    public VmSnapshotWhereInput nameContains(String nameContains) {

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

    public VmSnapshotWhereInput nameContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_CONTAINS);
        return this;
    }

    public VmSnapshotWhereInput nameContains_ExplictlyNonNull() {
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

    public VmSnapshotWhereInput nameEndsWith(String nameEndsWith) {

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

    public VmSnapshotWhereInput nameEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_ENDS_WITH);
        return this;
    }

    public VmSnapshotWhereInput nameEndsWith_ExplictlyNonNull() {
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

    public VmSnapshotWhereInput nameGt(String nameGt) {

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

    public VmSnapshotWhereInput nameGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_GT);
        return this;
    }

    public VmSnapshotWhereInput nameGt_ExplictlyNonNull() {
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

    public VmSnapshotWhereInput nameGte(String nameGte) {

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

    public VmSnapshotWhereInput nameGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_GTE);
        return this;
    }

    public VmSnapshotWhereInput nameGte_ExplictlyNonNull() {
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

    public VmSnapshotWhereInput nameIn(List<String> nameIn) {

        this.nameIn = nameIn;
        return this;
    }

    public VmSnapshotWhereInput addNameInItem(String nameInItem) {
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

    public VmSnapshotWhereInput nameIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_IN);
        return this;
    }

    public VmSnapshotWhereInput nameIn_ExplictlyNonNull() {
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

    public VmSnapshotWhereInput nameLt(String nameLt) {

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

    public VmSnapshotWhereInput nameLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_LT);
        return this;
    }

    public VmSnapshotWhereInput nameLt_ExplictlyNonNull() {
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

    public VmSnapshotWhereInput nameLte(String nameLte) {

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

    public VmSnapshotWhereInput nameLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_LTE);
        return this;
    }

    public VmSnapshotWhereInput nameLte_ExplictlyNonNull() {
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

    public VmSnapshotWhereInput nameNot(String nameNot) {

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

    public VmSnapshotWhereInput nameNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT);
        return this;
    }

    public VmSnapshotWhereInput nameNot_ExplictlyNonNull() {
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

    public VmSnapshotWhereInput nameNotContains(String nameNotContains) {

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

    public VmSnapshotWhereInput nameNotContains_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_CONTAINS);
        return this;
    }

    public VmSnapshotWhereInput nameNotContains_ExplictlyNonNull() {
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

    public VmSnapshotWhereInput nameNotEndsWith(String nameNotEndsWith) {

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

    public VmSnapshotWhereInput nameNotEndsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_ENDS_WITH);
        return this;
    }

    public VmSnapshotWhereInput nameNotEndsWith_ExplictlyNonNull() {
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

    public VmSnapshotWhereInput nameNotIn(List<String> nameNotIn) {

        this.nameNotIn = nameNotIn;
        return this;
    }

    public VmSnapshotWhereInput addNameNotInItem(String nameNotInItem) {
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

    public VmSnapshotWhereInput nameNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_IN);
        return this;
    }

    public VmSnapshotWhereInput nameNotIn_ExplictlyNonNull() {
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

    public VmSnapshotWhereInput nameNotStartsWith(String nameNotStartsWith) {

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

    public VmSnapshotWhereInput nameNotStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_NOT_STARTS_WITH);
        return this;
    }

    public VmSnapshotWhereInput nameNotStartsWith_ExplictlyNonNull() {
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

    public VmSnapshotWhereInput nameStartsWith(String nameStartsWith) {

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

    public VmSnapshotWhereInput nameStartsWith_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_NAME_STARTS_WITH);
        return this;
    }

    public VmSnapshotWhereInput nameStartsWith_ExplictlyNonNull() {
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

    public VmSnapshotWhereInput size(Long size) {

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

    public VmSnapshotWhereInput size_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIZE);
        return this;
    }

    public VmSnapshotWhereInput size_ExplictlyNonNull() {
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

    public VmSnapshotWhereInput sizeGt(Long sizeGt) {

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

    public VmSnapshotWhereInput sizeGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIZE_GT);
        return this;
    }

    public VmSnapshotWhereInput sizeGt_ExplictlyNonNull() {
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

    public VmSnapshotWhereInput sizeGte(Long sizeGte) {

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

    public VmSnapshotWhereInput sizeGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIZE_GTE);
        return this;
    }

    public VmSnapshotWhereInput sizeGte_ExplictlyNonNull() {
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

    public VmSnapshotWhereInput sizeIn(List<Long> sizeIn) {

        this.sizeIn = sizeIn;
        return this;
    }

    public VmSnapshotWhereInput addSizeInItem(Long sizeInItem) {
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

    public VmSnapshotWhereInput sizeIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIZE_IN);
        return this;
    }

    public VmSnapshotWhereInput sizeIn_ExplictlyNonNull() {
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

    public VmSnapshotWhereInput sizeLt(Long sizeLt) {

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

    public VmSnapshotWhereInput sizeLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIZE_LT);
        return this;
    }

    public VmSnapshotWhereInput sizeLt_ExplictlyNonNull() {
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

    public VmSnapshotWhereInput sizeLte(Long sizeLte) {

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

    public VmSnapshotWhereInput sizeLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIZE_LTE);
        return this;
    }

    public VmSnapshotWhereInput sizeLte_ExplictlyNonNull() {
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

    public VmSnapshotWhereInput sizeNot(Long sizeNot) {

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

    public VmSnapshotWhereInput sizeNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIZE_NOT);
        return this;
    }

    public VmSnapshotWhereInput sizeNot_ExplictlyNonNull() {
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

    public VmSnapshotWhereInput sizeNotIn(List<Long> sizeNotIn) {

        this.sizeNotIn = sizeNotIn;
        return this;
    }

    public VmSnapshotWhereInput addSizeNotInItem(Long sizeNotInItem) {
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

    public VmSnapshotWhereInput sizeNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_SIZE_NOT_IN);
        return this;
    }

    public VmSnapshotWhereInput sizeNotIn_ExplictlyNonNull() {
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

    public VmSnapshotWhereInput vcpu(Integer vcpu) {

        this.vcpu = vcpu;
        return this;
    }

    /**
     * Get vcpu
     *
     * @return vcpu
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getVcpu() {
        return vcpu;
    }

    public void setVcpu(Integer vcpu) {
        this.vcpu = vcpu;
    }

    public VmSnapshotWhereInput vcpu_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VCPU);
        return this;
    }

    public VmSnapshotWhereInput vcpu_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VCPU);
        return this;
    }

    public void setVcpu_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VCPU);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VCPU);
        }
    }

    public boolean getVcpu_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VCPU);
    }

    public VmSnapshotWhereInput vcpuGt(Integer vcpuGt) {

        this.vcpuGt = vcpuGt;
        return this;
    }

    /**
     * Get vcpuGt
     *
     * @return vcpuGt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getVcpuGt() {
        return vcpuGt;
    }

    public void setVcpuGt(Integer vcpuGt) {
        this.vcpuGt = vcpuGt;
    }

    public VmSnapshotWhereInput vcpuGt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VCPU_GT);
        return this;
    }

    public VmSnapshotWhereInput vcpuGt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VCPU_GT);
        return this;
    }

    public void setVcpuGt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VCPU_GT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VCPU_GT);
        }
    }

    public boolean getVcpuGt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VCPU_GT);
    }

    public VmSnapshotWhereInput vcpuGte(Integer vcpuGte) {

        this.vcpuGte = vcpuGte;
        return this;
    }

    /**
     * Get vcpuGte
     *
     * @return vcpuGte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getVcpuGte() {
        return vcpuGte;
    }

    public void setVcpuGte(Integer vcpuGte) {
        this.vcpuGte = vcpuGte;
    }

    public VmSnapshotWhereInput vcpuGte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VCPU_GTE);
        return this;
    }

    public VmSnapshotWhereInput vcpuGte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VCPU_GTE);
        return this;
    }

    public void setVcpuGte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VCPU_GTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VCPU_GTE);
        }
    }

    public boolean getVcpuGte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VCPU_GTE);
    }

    public VmSnapshotWhereInput vcpuIn(List<Integer> vcpuIn) {

        this.vcpuIn = vcpuIn;
        return this;
    }

    public VmSnapshotWhereInput addVcpuInItem(Integer vcpuInItem) {
        if (this.vcpuIn == null) {
            this.vcpuIn = new ArrayList<Integer>();
        }
        this.vcpuIn.add(vcpuInItem);
        return this;
    }

    /**
     * Get vcpuIn
     *
     * @return vcpuIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getVcpuIn() {
        return vcpuIn;
    }

    public void setVcpuIn(List<Integer> vcpuIn) {
        this.vcpuIn = vcpuIn;
    }

    public VmSnapshotWhereInput vcpuIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VCPU_IN);
        return this;
    }

    public VmSnapshotWhereInput vcpuIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VCPU_IN);
        return this;
    }

    public void setVcpuIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VCPU_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VCPU_IN);
        }
    }

    public boolean getVcpuIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VCPU_IN);
    }

    public VmSnapshotWhereInput vcpuLt(Integer vcpuLt) {

        this.vcpuLt = vcpuLt;
        return this;
    }

    /**
     * Get vcpuLt
     *
     * @return vcpuLt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getVcpuLt() {
        return vcpuLt;
    }

    public void setVcpuLt(Integer vcpuLt) {
        this.vcpuLt = vcpuLt;
    }

    public VmSnapshotWhereInput vcpuLt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VCPU_LT);
        return this;
    }

    public VmSnapshotWhereInput vcpuLt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VCPU_LT);
        return this;
    }

    public void setVcpuLt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VCPU_LT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VCPU_LT);
        }
    }

    public boolean getVcpuLt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VCPU_LT);
    }

    public VmSnapshotWhereInput vcpuLte(Integer vcpuLte) {

        this.vcpuLte = vcpuLte;
        return this;
    }

    /**
     * Get vcpuLte
     *
     * @return vcpuLte
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getVcpuLte() {
        return vcpuLte;
    }

    public void setVcpuLte(Integer vcpuLte) {
        this.vcpuLte = vcpuLte;
    }

    public VmSnapshotWhereInput vcpuLte_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VCPU_LTE);
        return this;
    }

    public VmSnapshotWhereInput vcpuLte_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VCPU_LTE);
        return this;
    }

    public void setVcpuLte_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VCPU_LTE);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VCPU_LTE);
        }
    }

    public boolean getVcpuLte_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VCPU_LTE);
    }

    public VmSnapshotWhereInput vcpuNot(Integer vcpuNot) {

        this.vcpuNot = vcpuNot;
        return this;
    }

    /**
     * Get vcpuNot
     *
     * @return vcpuNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Integer getVcpuNot() {
        return vcpuNot;
    }

    public void setVcpuNot(Integer vcpuNot) {
        this.vcpuNot = vcpuNot;
    }

    public VmSnapshotWhereInput vcpuNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VCPU_NOT);
        return this;
    }

    public VmSnapshotWhereInput vcpuNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VCPU_NOT);
        return this;
    }

    public void setVcpuNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VCPU_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VCPU_NOT);
        }
    }

    public boolean getVcpuNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VCPU_NOT);
    }

    public VmSnapshotWhereInput vcpuNotIn(List<Integer> vcpuNotIn) {

        this.vcpuNotIn = vcpuNotIn;
        return this;
    }

    public VmSnapshotWhereInput addVcpuNotInItem(Integer vcpuNotInItem) {
        if (this.vcpuNotIn == null) {
            this.vcpuNotIn = new ArrayList<Integer>();
        }
        this.vcpuNotIn.add(vcpuNotInItem);
        return this;
    }

    /**
     * Get vcpuNotIn
     *
     * @return vcpuNotIn
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public List<Integer> getVcpuNotIn() {
        return vcpuNotIn;
    }

    public void setVcpuNotIn(List<Integer> vcpuNotIn) {
        this.vcpuNotIn = vcpuNotIn;
    }

    public VmSnapshotWhereInput vcpuNotIn_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VCPU_NOT_IN);
        return this;
    }

    public VmSnapshotWhereInput vcpuNotIn_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_VCPU_NOT_IN);
        return this;
    }

    public void setVcpuNotIn_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_VCPU_NOT_IN);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_VCPU_NOT_IN);
        }
    }

    public boolean getVcpuNotIn_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_VCPU_NOT_IN);
    }

    public VmSnapshotWhereInput vm(VmWhereInput vm) {

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

    public VmSnapshotWhereInput vm_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_VM);
        return this;
    }

    public VmSnapshotWhereInput vm_ExplictlyNonNull() {
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

    public VmSnapshotWhereInput winOpt(Boolean winOpt) {

        this.winOpt = winOpt;
        return this;
    }

    /**
     * Get winOpt
     *
     * @return winOpt
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getWinOpt() {
        return winOpt;
    }

    public void setWinOpt(Boolean winOpt) {
        this.winOpt = winOpt;
    }

    public VmSnapshotWhereInput winOpt_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WIN_OPT);
        return this;
    }

    public VmSnapshotWhereInput winOpt_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_WIN_OPT);
        return this;
    }

    public void setWinOpt_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_WIN_OPT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_WIN_OPT);
        }
    }

    public boolean getWinOpt_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_WIN_OPT);
    }

    public VmSnapshotWhereInput winOptNot(Boolean winOptNot) {

        this.winOptNot = winOptNot;
        return this;
    }

    /**
     * Get winOptNot
     *
     * @return winOptNot
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public Boolean getWinOptNot() {
        return winOptNot;
    }

    public void setWinOptNot(Boolean winOptNot) {
        this.winOptNot = winOptNot;
    }

    public VmSnapshotWhereInput winOptNot_ExplictlyNull() {
        this._isPresent_.add(SERIALIZED_NAME_WIN_OPT_NOT);
        return this;
    }

    public VmSnapshotWhereInput winOptNot_ExplictlyNonNull() {
        this._isPresent_.remove(SERIALIZED_NAME_WIN_OPT_NOT);
        return this;
    }

    public void setWinOptNot_IsExplictlyNull(boolean isExplictlyNull) {
        if (isExplictlyNull) {
            this._isPresent_.add(SERIALIZED_NAME_WIN_OPT_NOT);
        } else {
            this._isPresent_.remove(SERIALIZED_NAME_WIN_OPT_NOT);
        }
    }

    public boolean getWinOptNot_IsExplictlyNull() {
        return this._isPresent_.contains(SERIALIZED_NAME_WIN_OPT_NOT);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VmSnapshotWhereInput vmSnapshotWhereInput = (VmSnapshotWhereInput) o;
        return Objects.equals(this.AND, vmSnapshotWhereInput.AND)
                && Objects.equals(this.NOT, vmSnapshotWhereInput.NOT)
                && Objects.equals(this.OR, vmSnapshotWhereInput.OR)
                && Objects.equals(this.clockOffset, vmSnapshotWhereInput.clockOffset)
                && Objects.equals(this.clockOffsetIn, vmSnapshotWhereInput.clockOffsetIn)
                && Objects.equals(this.clockOffsetNot, vmSnapshotWhereInput.clockOffsetNot)
                && Objects.equals(this.clockOffsetNotIn, vmSnapshotWhereInput.clockOffsetNotIn)
                && Objects.equals(this.cluster, vmSnapshotWhereInput.cluster)
                && Objects.equals(this.consistentType, vmSnapshotWhereInput.consistentType)
                && Objects.equals(this.consistentTypeIn, vmSnapshotWhereInput.consistentTypeIn)
                && Objects.equals(this.consistentTypeNot, vmSnapshotWhereInput.consistentTypeNot)
                && Objects.equals(
                        this.consistentTypeNotIn, vmSnapshotWhereInput.consistentTypeNotIn)
                && Objects.equals(this.cpuModel, vmSnapshotWhereInput.cpuModel)
                && Objects.equals(this.cpuModelContains, vmSnapshotWhereInput.cpuModelContains)
                && Objects.equals(this.cpuModelEndsWith, vmSnapshotWhereInput.cpuModelEndsWith)
                && Objects.equals(this.cpuModelGt, vmSnapshotWhereInput.cpuModelGt)
                && Objects.equals(this.cpuModelGte, vmSnapshotWhereInput.cpuModelGte)
                && Objects.equals(this.cpuModelIn, vmSnapshotWhereInput.cpuModelIn)
                && Objects.equals(this.cpuModelLt, vmSnapshotWhereInput.cpuModelLt)
                && Objects.equals(this.cpuModelLte, vmSnapshotWhereInput.cpuModelLte)
                && Objects.equals(this.cpuModelNot, vmSnapshotWhereInput.cpuModelNot)
                && Objects.equals(
                        this.cpuModelNotContains, vmSnapshotWhereInput.cpuModelNotContains)
                && Objects.equals(
                        this.cpuModelNotEndsWith, vmSnapshotWhereInput.cpuModelNotEndsWith)
                && Objects.equals(this.cpuModelNotIn, vmSnapshotWhereInput.cpuModelNotIn)
                && Objects.equals(
                        this.cpuModelNotStartsWith, vmSnapshotWhereInput.cpuModelNotStartsWith)
                && Objects.equals(this.cpuModelStartsWith, vmSnapshotWhereInput.cpuModelStartsWith)
                && Objects.equals(this.description, vmSnapshotWhereInput.description)
                && Objects.equals(
                        this.descriptionContains, vmSnapshotWhereInput.descriptionContains)
                && Objects.equals(
                        this.descriptionEndsWith, vmSnapshotWhereInput.descriptionEndsWith)
                && Objects.equals(this.descriptionGt, vmSnapshotWhereInput.descriptionGt)
                && Objects.equals(this.descriptionGte, vmSnapshotWhereInput.descriptionGte)
                && Objects.equals(this.descriptionIn, vmSnapshotWhereInput.descriptionIn)
                && Objects.equals(this.descriptionLt, vmSnapshotWhereInput.descriptionLt)
                && Objects.equals(this.descriptionLte, vmSnapshotWhereInput.descriptionLte)
                && Objects.equals(this.descriptionNot, vmSnapshotWhereInput.descriptionNot)
                && Objects.equals(
                        this.descriptionNotContains, vmSnapshotWhereInput.descriptionNotContains)
                && Objects.equals(
                        this.descriptionNotEndsWith, vmSnapshotWhereInput.descriptionNotEndsWith)
                && Objects.equals(this.descriptionNotIn, vmSnapshotWhereInput.descriptionNotIn)
                && Objects.equals(
                        this.descriptionNotStartsWith,
                        vmSnapshotWhereInput.descriptionNotStartsWith)
                && Objects.equals(
                        this.descriptionStartsWith, vmSnapshotWhereInput.descriptionStartsWith)
                && Objects.equals(this.entityAsyncStatus, vmSnapshotWhereInput.entityAsyncStatus)
                && Objects.equals(
                        this.entityAsyncStatusIn, vmSnapshotWhereInput.entityAsyncStatusIn)
                && Objects.equals(
                        this.entityAsyncStatusNot, vmSnapshotWhereInput.entityAsyncStatusNot)
                && Objects.equals(
                        this.entityAsyncStatusNotIn, vmSnapshotWhereInput.entityAsyncStatusNotIn)
                && Objects.equals(this.firmware, vmSnapshotWhereInput.firmware)
                && Objects.equals(this.firmwareIn, vmSnapshotWhereInput.firmwareIn)
                && Objects.equals(this.firmwareNot, vmSnapshotWhereInput.firmwareNot)
                && Objects.equals(this.firmwareNotIn, vmSnapshotWhereInput.firmwareNotIn)
                && Objects.equals(this.ha, vmSnapshotWhereInput.ha)
                && Objects.equals(this.haNot, vmSnapshotWhereInput.haNot)
                && Objects.equals(this.haPriority, vmSnapshotWhereInput.haPriority)
                && Objects.equals(this.haPriorityIn, vmSnapshotWhereInput.haPriorityIn)
                && Objects.equals(this.haPriorityNot, vmSnapshotWhereInput.haPriorityNot)
                && Objects.equals(this.haPriorityNotIn, vmSnapshotWhereInput.haPriorityNotIn)
                && Objects.equals(this.id, vmSnapshotWhereInput.id)
                && Objects.equals(this.idContains, vmSnapshotWhereInput.idContains)
                && Objects.equals(this.idEndsWith, vmSnapshotWhereInput.idEndsWith)
                && Objects.equals(this.idGt, vmSnapshotWhereInput.idGt)
                && Objects.equals(this.idGte, vmSnapshotWhereInput.idGte)
                && Objects.equals(this.idIn, vmSnapshotWhereInput.idIn)
                && Objects.equals(this.idLt, vmSnapshotWhereInput.idLt)
                && Objects.equals(this.idLte, vmSnapshotWhereInput.idLte)
                && Objects.equals(this.idNot, vmSnapshotWhereInput.idNot)
                && Objects.equals(this.idNotContains, vmSnapshotWhereInput.idNotContains)
                && Objects.equals(this.idNotEndsWith, vmSnapshotWhereInput.idNotEndsWith)
                && Objects.equals(this.idNotIn, vmSnapshotWhereInput.idNotIn)
                && Objects.equals(this.idNotStartsWith, vmSnapshotWhereInput.idNotStartsWith)
                && Objects.equals(this.idStartsWith, vmSnapshotWhereInput.idStartsWith)
                && Objects.equals(this.ioPolicy, vmSnapshotWhereInput.ioPolicy)
                && Objects.equals(this.ioPolicyIn, vmSnapshotWhereInput.ioPolicyIn)
                && Objects.equals(this.ioPolicyNot, vmSnapshotWhereInput.ioPolicyNot)
                && Objects.equals(this.ioPolicyNotIn, vmSnapshotWhereInput.ioPolicyNotIn)
                && Objects.equals(this.labelsEvery, vmSnapshotWhereInput.labelsEvery)
                && Objects.equals(this.labelsNone, vmSnapshotWhereInput.labelsNone)
                && Objects.equals(this.labelsSome, vmSnapshotWhereInput.labelsSome)
                && Objects.equals(this.localCreatedAt, vmSnapshotWhereInput.localCreatedAt)
                && Objects.equals(this.localCreatedAtGt, vmSnapshotWhereInput.localCreatedAtGt)
                && Objects.equals(this.localCreatedAtGte, vmSnapshotWhereInput.localCreatedAtGte)
                && Objects.equals(this.localCreatedAtIn, vmSnapshotWhereInput.localCreatedAtIn)
                && Objects.equals(this.localCreatedAtLt, vmSnapshotWhereInput.localCreatedAtLt)
                && Objects.equals(this.localCreatedAtLte, vmSnapshotWhereInput.localCreatedAtLte)
                && Objects.equals(this.localCreatedAtNot, vmSnapshotWhereInput.localCreatedAtNot)
                && Objects.equals(
                        this.localCreatedAtNotIn, vmSnapshotWhereInput.localCreatedAtNotIn)
                && Objects.equals(this.localId, vmSnapshotWhereInput.localId)
                && Objects.equals(this.localIdContains, vmSnapshotWhereInput.localIdContains)
                && Objects.equals(this.localIdEndsWith, vmSnapshotWhereInput.localIdEndsWith)
                && Objects.equals(this.localIdGt, vmSnapshotWhereInput.localIdGt)
                && Objects.equals(this.localIdGte, vmSnapshotWhereInput.localIdGte)
                && Objects.equals(this.localIdIn, vmSnapshotWhereInput.localIdIn)
                && Objects.equals(this.localIdLt, vmSnapshotWhereInput.localIdLt)
                && Objects.equals(this.localIdLte, vmSnapshotWhereInput.localIdLte)
                && Objects.equals(this.localIdNot, vmSnapshotWhereInput.localIdNot)
                && Objects.equals(this.localIdNotContains, vmSnapshotWhereInput.localIdNotContains)
                && Objects.equals(this.localIdNotEndsWith, vmSnapshotWhereInput.localIdNotEndsWith)
                && Objects.equals(this.localIdNotIn, vmSnapshotWhereInput.localIdNotIn)
                && Objects.equals(
                        this.localIdNotStartsWith, vmSnapshotWhereInput.localIdNotStartsWith)
                && Objects.equals(this.localIdStartsWith, vmSnapshotWhereInput.localIdStartsWith)
                && Objects.equals(this.maxBandwidth, vmSnapshotWhereInput.maxBandwidth)
                && Objects.equals(this.maxBandwidthGt, vmSnapshotWhereInput.maxBandwidthGt)
                && Objects.equals(this.maxBandwidthGte, vmSnapshotWhereInput.maxBandwidthGte)
                && Objects.equals(this.maxBandwidthIn, vmSnapshotWhereInput.maxBandwidthIn)
                && Objects.equals(this.maxBandwidthLt, vmSnapshotWhereInput.maxBandwidthLt)
                && Objects.equals(this.maxBandwidthLte, vmSnapshotWhereInput.maxBandwidthLte)
                && Objects.equals(this.maxBandwidthNot, vmSnapshotWhereInput.maxBandwidthNot)
                && Objects.equals(this.maxBandwidthNotIn, vmSnapshotWhereInput.maxBandwidthNotIn)
                && Objects.equals(this.maxBandwidthPolicy, vmSnapshotWhereInput.maxBandwidthPolicy)
                && Objects.equals(
                        this.maxBandwidthPolicyIn, vmSnapshotWhereInput.maxBandwidthPolicyIn)
                && Objects.equals(
                        this.maxBandwidthPolicyNot, vmSnapshotWhereInput.maxBandwidthPolicyNot)
                && Objects.equals(
                        this.maxBandwidthPolicyNotIn, vmSnapshotWhereInput.maxBandwidthPolicyNotIn)
                && Objects.equals(this.maxIops, vmSnapshotWhereInput.maxIops)
                && Objects.equals(this.maxIopsGt, vmSnapshotWhereInput.maxIopsGt)
                && Objects.equals(this.maxIopsGte, vmSnapshotWhereInput.maxIopsGte)
                && Objects.equals(this.maxIopsIn, vmSnapshotWhereInput.maxIopsIn)
                && Objects.equals(this.maxIopsLt, vmSnapshotWhereInput.maxIopsLt)
                && Objects.equals(this.maxIopsLte, vmSnapshotWhereInput.maxIopsLte)
                && Objects.equals(this.maxIopsNot, vmSnapshotWhereInput.maxIopsNot)
                && Objects.equals(this.maxIopsNotIn, vmSnapshotWhereInput.maxIopsNotIn)
                && Objects.equals(this.maxIopsPolicy, vmSnapshotWhereInput.maxIopsPolicy)
                && Objects.equals(this.maxIopsPolicyIn, vmSnapshotWhereInput.maxIopsPolicyIn)
                && Objects.equals(this.maxIopsPolicyNot, vmSnapshotWhereInput.maxIopsPolicyNot)
                && Objects.equals(this.maxIopsPolicyNotIn, vmSnapshotWhereInput.maxIopsPolicyNotIn)
                && Objects.equals(this.memory, vmSnapshotWhereInput.memory)
                && Objects.equals(this.memoryGt, vmSnapshotWhereInput.memoryGt)
                && Objects.equals(this.memoryGte, vmSnapshotWhereInput.memoryGte)
                && Objects.equals(this.memoryIn, vmSnapshotWhereInput.memoryIn)
                && Objects.equals(this.memoryLt, vmSnapshotWhereInput.memoryLt)
                && Objects.equals(this.memoryLte, vmSnapshotWhereInput.memoryLte)
                && Objects.equals(this.memoryNot, vmSnapshotWhereInput.memoryNot)
                && Objects.equals(this.memoryNotIn, vmSnapshotWhereInput.memoryNotIn)
                && Objects.equals(this.name, vmSnapshotWhereInput.name)
                && Objects.equals(this.nameContains, vmSnapshotWhereInput.nameContains)
                && Objects.equals(this.nameEndsWith, vmSnapshotWhereInput.nameEndsWith)
                && Objects.equals(this.nameGt, vmSnapshotWhereInput.nameGt)
                && Objects.equals(this.nameGte, vmSnapshotWhereInput.nameGte)
                && Objects.equals(this.nameIn, vmSnapshotWhereInput.nameIn)
                && Objects.equals(this.nameLt, vmSnapshotWhereInput.nameLt)
                && Objects.equals(this.nameLte, vmSnapshotWhereInput.nameLte)
                && Objects.equals(this.nameNot, vmSnapshotWhereInput.nameNot)
                && Objects.equals(this.nameNotContains, vmSnapshotWhereInput.nameNotContains)
                && Objects.equals(this.nameNotEndsWith, vmSnapshotWhereInput.nameNotEndsWith)
                && Objects.equals(this.nameNotIn, vmSnapshotWhereInput.nameNotIn)
                && Objects.equals(this.nameNotStartsWith, vmSnapshotWhereInput.nameNotStartsWith)
                && Objects.equals(this.nameStartsWith, vmSnapshotWhereInput.nameStartsWith)
                && Objects.equals(this.size, vmSnapshotWhereInput.size)
                && Objects.equals(this.sizeGt, vmSnapshotWhereInput.sizeGt)
                && Objects.equals(this.sizeGte, vmSnapshotWhereInput.sizeGte)
                && Objects.equals(this.sizeIn, vmSnapshotWhereInput.sizeIn)
                && Objects.equals(this.sizeLt, vmSnapshotWhereInput.sizeLt)
                && Objects.equals(this.sizeLte, vmSnapshotWhereInput.sizeLte)
                && Objects.equals(this.sizeNot, vmSnapshotWhereInput.sizeNot)
                && Objects.equals(this.sizeNotIn, vmSnapshotWhereInput.sizeNotIn)
                && Objects.equals(this.vcpu, vmSnapshotWhereInput.vcpu)
                && Objects.equals(this.vcpuGt, vmSnapshotWhereInput.vcpuGt)
                && Objects.equals(this.vcpuGte, vmSnapshotWhereInput.vcpuGte)
                && Objects.equals(this.vcpuIn, vmSnapshotWhereInput.vcpuIn)
                && Objects.equals(this.vcpuLt, vmSnapshotWhereInput.vcpuLt)
                && Objects.equals(this.vcpuLte, vmSnapshotWhereInput.vcpuLte)
                && Objects.equals(this.vcpuNot, vmSnapshotWhereInput.vcpuNot)
                && Objects.equals(this.vcpuNotIn, vmSnapshotWhereInput.vcpuNotIn)
                && Objects.equals(this.vm, vmSnapshotWhereInput.vm)
                && Objects.equals(this.winOpt, vmSnapshotWhereInput.winOpt)
                && Objects.equals(this.winOptNot, vmSnapshotWhereInput.winOptNot);
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
                clockOffset,
                clockOffsetIn,
                clockOffsetNot,
                clockOffsetNotIn,
                cluster,
                consistentType,
                consistentTypeIn,
                consistentTypeNot,
                consistentTypeNotIn,
                cpuModel,
                cpuModelContains,
                cpuModelEndsWith,
                cpuModelGt,
                cpuModelGte,
                cpuModelIn,
                cpuModelLt,
                cpuModelLte,
                cpuModelNot,
                cpuModelNotContains,
                cpuModelNotEndsWith,
                cpuModelNotIn,
                cpuModelNotStartsWith,
                cpuModelStartsWith,
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
                firmware,
                firmwareIn,
                firmwareNot,
                firmwareNotIn,
                ha,
                haNot,
                haPriority,
                haPriorityIn,
                haPriorityNot,
                haPriorityNotIn,
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
                ioPolicy,
                ioPolicyIn,
                ioPolicyNot,
                ioPolicyNotIn,
                labelsEvery,
                labelsNone,
                labelsSome,
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
                maxBandwidth,
                maxBandwidthGt,
                maxBandwidthGte,
                maxBandwidthIn,
                maxBandwidthLt,
                maxBandwidthLte,
                maxBandwidthNot,
                maxBandwidthNotIn,
                maxBandwidthPolicy,
                maxBandwidthPolicyIn,
                maxBandwidthPolicyNot,
                maxBandwidthPolicyNotIn,
                maxIops,
                maxIopsGt,
                maxIopsGte,
                maxIopsIn,
                maxIopsLt,
                maxIopsLte,
                maxIopsNot,
                maxIopsNotIn,
                maxIopsPolicy,
                maxIopsPolicyIn,
                maxIopsPolicyNot,
                maxIopsPolicyNotIn,
                memory,
                memoryGt,
                memoryGte,
                memoryIn,
                memoryLt,
                memoryLte,
                memoryNot,
                memoryNotIn,
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
                size,
                sizeGt,
                sizeGte,
                sizeIn,
                sizeLt,
                sizeLte,
                sizeNot,
                sizeNotIn,
                vcpu,
                vcpuGt,
                vcpuGte,
                vcpuIn,
                vcpuLt,
                vcpuLte,
                vcpuNot,
                vcpuNotIn,
                vm,
                winOpt,
                winOptNot);
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
        sb.append("class VmSnapshotWhereInput {\n");
        sb.append("    AND: ").append(toIndentedString(AND)).append("\n");
        sb.append("    NOT: ").append(toIndentedString(NOT)).append("\n");
        sb.append("    OR: ").append(toIndentedString(OR)).append("\n");
        sb.append("    clockOffset: ").append(toIndentedString(clockOffset)).append("\n");
        sb.append("    clockOffsetIn: ").append(toIndentedString(clockOffsetIn)).append("\n");
        sb.append("    clockOffsetNot: ").append(toIndentedString(clockOffsetNot)).append("\n");
        sb.append("    clockOffsetNotIn: ").append(toIndentedString(clockOffsetNotIn)).append("\n");
        sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
        sb.append("    consistentType: ").append(toIndentedString(consistentType)).append("\n");
        sb.append("    consistentTypeIn: ").append(toIndentedString(consistentTypeIn)).append("\n");
        sb.append("    consistentTypeNot: ")
                .append(toIndentedString(consistentTypeNot))
                .append("\n");
        sb.append("    consistentTypeNotIn: ")
                .append(toIndentedString(consistentTypeNotIn))
                .append("\n");
        sb.append("    cpuModel: ").append(toIndentedString(cpuModel)).append("\n");
        sb.append("    cpuModelContains: ").append(toIndentedString(cpuModelContains)).append("\n");
        sb.append("    cpuModelEndsWith: ").append(toIndentedString(cpuModelEndsWith)).append("\n");
        sb.append("    cpuModelGt: ").append(toIndentedString(cpuModelGt)).append("\n");
        sb.append("    cpuModelGte: ").append(toIndentedString(cpuModelGte)).append("\n");
        sb.append("    cpuModelIn: ").append(toIndentedString(cpuModelIn)).append("\n");
        sb.append("    cpuModelLt: ").append(toIndentedString(cpuModelLt)).append("\n");
        sb.append("    cpuModelLte: ").append(toIndentedString(cpuModelLte)).append("\n");
        sb.append("    cpuModelNot: ").append(toIndentedString(cpuModelNot)).append("\n");
        sb.append("    cpuModelNotContains: ")
                .append(toIndentedString(cpuModelNotContains))
                .append("\n");
        sb.append("    cpuModelNotEndsWith: ")
                .append(toIndentedString(cpuModelNotEndsWith))
                .append("\n");
        sb.append("    cpuModelNotIn: ").append(toIndentedString(cpuModelNotIn)).append("\n");
        sb.append("    cpuModelNotStartsWith: ")
                .append(toIndentedString(cpuModelNotStartsWith))
                .append("\n");
        sb.append("    cpuModelStartsWith: ")
                .append(toIndentedString(cpuModelStartsWith))
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
        sb.append("    firmware: ").append(toIndentedString(firmware)).append("\n");
        sb.append("    firmwareIn: ").append(toIndentedString(firmwareIn)).append("\n");
        sb.append("    firmwareNot: ").append(toIndentedString(firmwareNot)).append("\n");
        sb.append("    firmwareNotIn: ").append(toIndentedString(firmwareNotIn)).append("\n");
        sb.append("    ha: ").append(toIndentedString(ha)).append("\n");
        sb.append("    haNot: ").append(toIndentedString(haNot)).append("\n");
        sb.append("    haPriority: ").append(toIndentedString(haPriority)).append("\n");
        sb.append("    haPriorityIn: ").append(toIndentedString(haPriorityIn)).append("\n");
        sb.append("    haPriorityNot: ").append(toIndentedString(haPriorityNot)).append("\n");
        sb.append("    haPriorityNotIn: ").append(toIndentedString(haPriorityNotIn)).append("\n");
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
        sb.append("    ioPolicy: ").append(toIndentedString(ioPolicy)).append("\n");
        sb.append("    ioPolicyIn: ").append(toIndentedString(ioPolicyIn)).append("\n");
        sb.append("    ioPolicyNot: ").append(toIndentedString(ioPolicyNot)).append("\n");
        sb.append("    ioPolicyNotIn: ").append(toIndentedString(ioPolicyNotIn)).append("\n");
        sb.append("    labelsEvery: ").append(toIndentedString(labelsEvery)).append("\n");
        sb.append("    labelsNone: ").append(toIndentedString(labelsNone)).append("\n");
        sb.append("    labelsSome: ").append(toIndentedString(labelsSome)).append("\n");
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
        sb.append("    maxBandwidth: ").append(toIndentedString(maxBandwidth)).append("\n");
        sb.append("    maxBandwidthGt: ").append(toIndentedString(maxBandwidthGt)).append("\n");
        sb.append("    maxBandwidthGte: ").append(toIndentedString(maxBandwidthGte)).append("\n");
        sb.append("    maxBandwidthIn: ").append(toIndentedString(maxBandwidthIn)).append("\n");
        sb.append("    maxBandwidthLt: ").append(toIndentedString(maxBandwidthLt)).append("\n");
        sb.append("    maxBandwidthLte: ").append(toIndentedString(maxBandwidthLte)).append("\n");
        sb.append("    maxBandwidthNot: ").append(toIndentedString(maxBandwidthNot)).append("\n");
        sb.append("    maxBandwidthNotIn: ")
                .append(toIndentedString(maxBandwidthNotIn))
                .append("\n");
        sb.append("    maxBandwidthPolicy: ")
                .append(toIndentedString(maxBandwidthPolicy))
                .append("\n");
        sb.append("    maxBandwidthPolicyIn: ")
                .append(toIndentedString(maxBandwidthPolicyIn))
                .append("\n");
        sb.append("    maxBandwidthPolicyNot: ")
                .append(toIndentedString(maxBandwidthPolicyNot))
                .append("\n");
        sb.append("    maxBandwidthPolicyNotIn: ")
                .append(toIndentedString(maxBandwidthPolicyNotIn))
                .append("\n");
        sb.append("    maxIops: ").append(toIndentedString(maxIops)).append("\n");
        sb.append("    maxIopsGt: ").append(toIndentedString(maxIopsGt)).append("\n");
        sb.append("    maxIopsGte: ").append(toIndentedString(maxIopsGte)).append("\n");
        sb.append("    maxIopsIn: ").append(toIndentedString(maxIopsIn)).append("\n");
        sb.append("    maxIopsLt: ").append(toIndentedString(maxIopsLt)).append("\n");
        sb.append("    maxIopsLte: ").append(toIndentedString(maxIopsLte)).append("\n");
        sb.append("    maxIopsNot: ").append(toIndentedString(maxIopsNot)).append("\n");
        sb.append("    maxIopsNotIn: ").append(toIndentedString(maxIopsNotIn)).append("\n");
        sb.append("    maxIopsPolicy: ").append(toIndentedString(maxIopsPolicy)).append("\n");
        sb.append("    maxIopsPolicyIn: ").append(toIndentedString(maxIopsPolicyIn)).append("\n");
        sb.append("    maxIopsPolicyNot: ").append(toIndentedString(maxIopsPolicyNot)).append("\n");
        sb.append("    maxIopsPolicyNotIn: ")
                .append(toIndentedString(maxIopsPolicyNotIn))
                .append("\n");
        sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
        sb.append("    memoryGt: ").append(toIndentedString(memoryGt)).append("\n");
        sb.append("    memoryGte: ").append(toIndentedString(memoryGte)).append("\n");
        sb.append("    memoryIn: ").append(toIndentedString(memoryIn)).append("\n");
        sb.append("    memoryLt: ").append(toIndentedString(memoryLt)).append("\n");
        sb.append("    memoryLte: ").append(toIndentedString(memoryLte)).append("\n");
        sb.append("    memoryNot: ").append(toIndentedString(memoryNot)).append("\n");
        sb.append("    memoryNotIn: ").append(toIndentedString(memoryNotIn)).append("\n");
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
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    sizeGt: ").append(toIndentedString(sizeGt)).append("\n");
        sb.append("    sizeGte: ").append(toIndentedString(sizeGte)).append("\n");
        sb.append("    sizeIn: ").append(toIndentedString(sizeIn)).append("\n");
        sb.append("    sizeLt: ").append(toIndentedString(sizeLt)).append("\n");
        sb.append("    sizeLte: ").append(toIndentedString(sizeLte)).append("\n");
        sb.append("    sizeNot: ").append(toIndentedString(sizeNot)).append("\n");
        sb.append("    sizeNotIn: ").append(toIndentedString(sizeNotIn)).append("\n");
        sb.append("    vcpu: ").append(toIndentedString(vcpu)).append("\n");
        sb.append("    vcpuGt: ").append(toIndentedString(vcpuGt)).append("\n");
        sb.append("    vcpuGte: ").append(toIndentedString(vcpuGte)).append("\n");
        sb.append("    vcpuIn: ").append(toIndentedString(vcpuIn)).append("\n");
        sb.append("    vcpuLt: ").append(toIndentedString(vcpuLt)).append("\n");
        sb.append("    vcpuLte: ").append(toIndentedString(vcpuLte)).append("\n");
        sb.append("    vcpuNot: ").append(toIndentedString(vcpuNot)).append("\n");
        sb.append("    vcpuNotIn: ").append(toIndentedString(vcpuNotIn)).append("\n");
        sb.append("    vm: ").append(toIndentedString(vm)).append("\n");
        sb.append("    winOpt: ").append(toIndentedString(winOpt)).append("\n");
        sb.append("    winOptNot: ").append(toIndentedString(winOptNot)).append("\n");
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
